package app.albaranes ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class albaranguia__ww_impl extends GXWebComponent
{
   public albaranguia__ww_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public albaranguia__ww_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( albaranguia__ww_impl.class ));
   }

   public albaranguia__ww_impl( int remoteHandle ,
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
      cmbAlbEnvFtp = new HTMLChoice();
      cmbAlbProVal = new HTMLChoice();
   }

   public void initweb( )
   {
      initialize_properties( ) ;
      if ( GXutil.len( sPrefix) == 0 )
      {
         if ( nGotPars == 0 )
         {
            entryPointCalled = false ;
            gxfirstwebparm = httpContext.GetFirstPar( "EmprCod") ;
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
               A396EmprCod = httpContext.GetPar( "EmprCod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
               A30AlbProCod = GXutil.lval( httpContext.GetPar( "AlbProCod")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
               AV84VisualizarAcciones = GXutil.strtobool( httpContext.GetPar( "VisualizarAcciones")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV84VisualizarAcciones", AV84VisualizarAcciones);
               AV85AccionesEnPopup = GXutil.strtobool( httpContext.GetPar( "AccionesEnPopup")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV85AccionesEnPopup", AV85AccionesEnPopup);
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,A396EmprCod,Long.valueOf(A30AlbProCod),Boolean.valueOf(AV84VisualizarAcciones),Boolean.valueOf(AV85AccionesEnPopup)});
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
               gxfirstwebparm = httpContext.GetFirstPar( "EmprCod") ;
            }
            else if ( GXutil.strcmp(gxfirstwebparm, "gxfullajaxEvt") == 0 )
            {
               if ( ! httpContext.IsValidAjaxCall( true) )
               {
                  GxWebError = (byte)(1) ;
                  return  ;
               }
               gxfirstwebparm = httpContext.GetFirstPar( "EmprCod") ;
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
               A396EmprCod = gxfirstwebparm ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
               if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
               {
                  A30AlbProCod = GXutil.lval( httpContext.GetPar( "AlbProCod")) ;
                  httpContext.ajax_rsp_assign_attri(sPrefix, false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
                  AV84VisualizarAcciones = GXutil.strtobool( httpContext.GetPar( "VisualizarAcciones")) ;
                  httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV84VisualizarAcciones", AV84VisualizarAcciones);
                  AV85AccionesEnPopup = GXutil.strtobool( httpContext.GetPar( "AccionesEnPopup")) ;
                  httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV85AccionesEnPopup", AV85AccionesEnPopup);
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
      nRC_GXsfl_69 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_69"))) ;
      nGXsfl_69_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_69_idx"))) ;
      sGXsfl_69_idx = httpContext.GetPar( "sGXsfl_69_idx") ;
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
      A30AlbProCod = GXutil.lval( httpContext.GetPar( "AlbProCod")) ;
      A396EmprCod = httpContext.GetPar( "EmprCod") ;
      AV23ManageFiltersExecutionStep = (byte)(GXutil.lval( httpContext.GetPar( "ManageFiltersExecutionStep"))) ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV18ColumnsSelector);
      AV15FilterFullText = httpContext.GetPar( "FilterFullText") ;
      AV24TFBarCod = (int)(GXutil.lval( httpContext.GetPar( "TFBarCod"))) ;
      AV25TFBarCod_To = (int)(GXutil.lval( httpContext.GetPar( "TFBarCod_To"))) ;
      AV26TFBarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "TFBarCodReo"))) ;
      AV27TFBarCodReo_To = (byte)(GXutil.lval( httpContext.GetPar( "TFBarCodReo_To"))) ;
      AV28TFBarCodPar = httpContext.GetPar( "TFBarCodPar") ;
      AV29TFBarCodPar_Sel = httpContext.GetPar( "TFBarCodPar_Sel") ;
      AV30TFAlbSer = httpContext.GetPar( "TFAlbSer") ;
      AV31TFAlbSer_Sel = httpContext.GetPar( "TFAlbSer_Sel") ;
      AV32TFAlbColorCv = httpContext.GetPar( "TFAlbColorCv") ;
      AV33TFAlbColorCv_Sel = httpContext.GetPar( "TFAlbColorCv_Sel") ;
      AV34TFAlbNomCli = httpContext.GetPar( "TFAlbNomCli") ;
      AV35TFAlbNomCli_Sel = httpContext.GetPar( "TFAlbNomCli_Sel") ;
      AV36TFAlbColNum = (int)(GXutil.lval( httpContext.GetPar( "TFAlbColNum"))) ;
      AV37TFAlbColNum_To = (int)(GXutil.lval( httpContext.GetPar( "TFAlbColNum_To"))) ;
      AV38TFCodCod = httpContext.GetPar( "TFCodCod") ;
      AV39TFCodCod_Sel = httpContext.GetPar( "TFCodCod_Sel") ;
      AV40TFBarAlbKgmE = CommonUtil.decimalVal( httpContext.GetPar( "TFBarAlbKgmE"), ".") ;
      AV41TFBarAlbKgmE_To = CommonUtil.decimalVal( httpContext.GetPar( "TFBarAlbKgmE_To"), ".") ;
      AV42TFBarPreKgm = CommonUtil.decimalVal( httpContext.GetPar( "TFBarPreKgm"), ".") ;
      AV43TFBarPreKgm_To = CommonUtil.decimalVal( httpContext.GetPar( "TFBarPreKgm_To"), ".") ;
      AV44TFAlbHdrAnc = (short)(GXutil.lval( httpContext.GetPar( "TFAlbHdrAnc"))) ;
      AV45TFAlbHdrAnc_To = (short)(GXutil.lval( httpContext.GetPar( "TFAlbHdrAnc_To"))) ;
      AV46TFAlbHdrgm2 = (short)(GXutil.lval( httpContext.GetPar( "TFAlbHdrgm2"))) ;
      AV47TFAlbHdrgm2_To = (short)(GXutil.lval( httpContext.GetPar( "TFAlbHdrgm2_To"))) ;
      AV48TFBarAlbMtrE = CommonUtil.decimalVal( httpContext.GetPar( "TFBarAlbMtrE"), ".") ;
      AV49TFBarAlbMtrE_To = CommonUtil.decimalVal( httpContext.GetPar( "TFBarAlbMtrE_To"), ".") ;
      AV50TFBarPreMtr = CommonUtil.decimalVal( httpContext.GetPar( "TFBarPreMtr"), ".") ;
      AV51TFBarPreMtr_To = CommonUtil.decimalVal( httpContext.GetPar( "TFBarPreMtr_To"), ".") ;
      AV52TFBarAlbPie = (int)(GXutil.lval( httpContext.GetPar( "TFBarAlbPie"))) ;
      AV53TFBarAlbPie_To = (int)(GXutil.lval( httpContext.GetPar( "TFBarAlbPie_To"))) ;
      AV54TFAlbTiras = httpContext.GetPar( "TFAlbTiras") ;
      AV55TFAlbTiras_Sel = httpContext.GetPar( "TFAlbTiras_Sel") ;
      AV56TFAlbTirasKg = CommonUtil.decimalVal( httpContext.GetPar( "TFAlbTirasKg"), ".") ;
      AV57TFAlbTirasKg_To = CommonUtil.decimalVal( httpContext.GetPar( "TFAlbTirasKg_To"), ".") ;
      AV58TFAlbSinTest = httpContext.GetPar( "TFAlbSinTest") ;
      AV59TFAlbSinTest_Sel = httpContext.GetPar( "TFAlbSinTest_Sel") ;
      AV60TFTubCod = (short)(GXutil.lval( httpContext.GetPar( "TFTubCod"))) ;
      AV61TFTubCod_To = (short)(GXutil.lval( httpContext.GetPar( "TFTubCod_To"))) ;
      AV62TFBarAlbTub = (int)(GXutil.lval( httpContext.GetPar( "TFBarAlbTub"))) ;
      AV63TFBarAlbTub_To = (int)(GXutil.lval( httpContext.GetPar( "TFBarAlbTub_To"))) ;
      AV64TFAlbHdrObs = httpContext.GetPar( "TFAlbHdrObs") ;
      AV65TFAlbHdrObs_Sel = httpContext.GetPar( "TFAlbHdrObs_Sel") ;
      AV66TFPlasCod = (short)(GXutil.lval( httpContext.GetPar( "TFPlasCod"))) ;
      AV67TFPlasCod_To = (short)(GXutil.lval( httpContext.GetPar( "TFPlasCod_To"))) ;
      AV68TFBarAlbPlas = (short)(GXutil.lval( httpContext.GetPar( "TFBarAlbPlas"))) ;
      AV69TFBarAlbPlas_To = (short)(GXutil.lval( httpContext.GetPar( "TFBarAlbPlas_To"))) ;
      AV70TFTipAcaCod = (short)(GXutil.lval( httpContext.GetPar( "TFTipAcaCod"))) ;
      AV71TFTipAcaCod_To = (short)(GXutil.lval( httpContext.GetPar( "TFTipAcaCod_To"))) ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV73TFAlbProVal_Sels);
      AV85AccionesEnPopup = GXutil.strtobool( httpContext.GetPar( "AccionesEnPopup")) ;
      AV84VisualizarAcciones = GXutil.strtobool( httpContext.GetPar( "VisualizarAcciones")) ;
      AV95Pgmname = httpContext.GetPar( "Pgmname") ;
      AV12OrderedBy = (short)(GXutil.lval( httpContext.GetPar( "OrderedBy"))) ;
      AV13OrderedDsc = GXutil.strtobool( httpContext.GetPar( "OrderedDsc")) ;
      AV89Artemalha = (byte)(GXutil.lval( httpContext.GetPar( "Artemalha"))) ;
      AV90F_carvema = (byte)(GXutil.lval( httpContext.GetPar( "F_carvema"))) ;
      AV91Siplasticos = (byte)(GXutil.lval( httpContext.GetPar( "Siplasticos"))) ;
      AV92Endutex = (byte)(GXutil.lval( httpContext.GetPar( "Endutex"))) ;
      sPrefix = httpContext.GetPar( "sPrefix") ;
      init_default_properties( ) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, A30AlbProCod, A396EmprCod, AV23ManageFiltersExecutionStep, AV18ColumnsSelector, AV15FilterFullText, AV24TFBarCod, AV25TFBarCod_To, AV26TFBarCodReo, AV27TFBarCodReo_To, AV28TFBarCodPar, AV29TFBarCodPar_Sel, AV30TFAlbSer, AV31TFAlbSer_Sel, AV32TFAlbColorCv, AV33TFAlbColorCv_Sel, AV34TFAlbNomCli, AV35TFAlbNomCli_Sel, AV36TFAlbColNum, AV37TFAlbColNum_To, AV38TFCodCod, AV39TFCodCod_Sel, AV40TFBarAlbKgmE, AV41TFBarAlbKgmE_To, AV42TFBarPreKgm, AV43TFBarPreKgm_To, AV44TFAlbHdrAnc, AV45TFAlbHdrAnc_To, AV46TFAlbHdrgm2, AV47TFAlbHdrgm2_To, AV48TFBarAlbMtrE, AV49TFBarAlbMtrE_To, AV50TFBarPreMtr, AV51TFBarPreMtr_To, AV52TFBarAlbPie, AV53TFBarAlbPie_To, AV54TFAlbTiras, AV55TFAlbTiras_Sel, AV56TFAlbTirasKg, AV57TFAlbTirasKg_To, AV58TFAlbSinTest, AV59TFAlbSinTest_Sel, AV60TFTubCod, AV61TFTubCod_To, AV62TFBarAlbTub, AV63TFBarAlbTub_To, AV64TFAlbHdrObs, AV65TFAlbHdrObs_Sel, AV66TFPlasCod, AV67TFPlasCod_To, AV68TFBarAlbPlas, AV69TFBarAlbPlas_To, AV70TFTipAcaCod, AV71TFTipAcaCod_To, AV73TFAlbProVal_Sels, AV85AccionesEnPopup, AV84VisualizarAcciones, AV95Pgmname, AV12OrderedBy, AV13OrderedDsc, AV89Artemalha, AV90F_carvema, AV91Siplasticos, AV92Endutex, sPrefix) ;
      addString( httpContext.getJSONResponse( )) ;
      /* End function gxgrGrid_refresh_invoke */
   }

   public void webExecute( )
   {
      initweb( ) ;
      if ( ! isAjaxCallMode( ) )
      {
         pa1XC2( ) ;
         if ( GXutil.len( sPrefix) == 0 )
         {
            validateSpaRequest();
         }
         if ( GXutil.len( sPrefix) == 0 )
         {
            if ( ! isAjaxCallMode( ) )
            {
            }
         }
         if ( ( GxWebError == 0 ) && ! isAjaxCallMode( ) )
         {
            ws1XC2( ) ;
            if ( ! isAjaxCallMode( ) )
            {
               if ( nDynComponent == 0 )
               {
                  we1XC2( ) ;
               }
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
         httpContext.writeValue( httpContext.getMessage( " Guias", "")) ;
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
         httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.albaranes.albaranguia__ww", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A30AlbProCod,10,0)),GXutil.URLEncode(GXutil.booltostr(AV84VisualizarAcciones)),GXutil.URLEncode(GXutil.booltostr(AV85AccionesEnPopup))}, new String[] {"EmprCod","AlbProCod","VisualizarAcciones","AccionesEnPopup"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vARTEMALHA", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV89Artemalha), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vF_CARVEMA", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV90F_carvema), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vSIPLASTICOS", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV91Siplasticos), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vENDUTEX", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV92Endutex), "9")));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"AlbaranGuia__WW");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV95Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("albaranes\\albaranguia__ww:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"nRC_GXsfl_69", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_69, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vMANAGEFILTERSDATA", AV21ManageFiltersData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vMANAGEFILTERSDATA", AV21ManageFiltersData);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGRIDCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV80GridCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGRIDPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV81GridPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vDDO_TITLESETTINGSICONS", AV78DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vDDO_TITLESETTINGSICONS", AV78DDO_TitleSettingsIcons);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vCOLUMNSSELECTOR", AV18ColumnsSelector);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vCOLUMNSSELECTOR", AV18ColumnsSelector);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOA396EmprCod", GXutil.rtrim( wcpOA396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOA30AlbProCod", GXutil.ltrim( localUtil.ntoc( wcpOA30AlbProCod, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, sPrefix+"wcpOAV84VisualizarAcciones", wcpOAV84VisualizarAcciones);
      app.GxWebStd.gx_boolean_hidden_field( httpContext, sPrefix+"wcpOAV85AccionesEnPopup", wcpOAV85AccionesEnPopup);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMANAGEFILTERSEXECUTIONSTEP", GXutil.ltrim( localUtil.ntoc( AV23ManageFiltersExecutionStep, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARCOD", GXutil.ltrim( localUtil.ntoc( AV24TFBarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARCOD_TO", GXutil.ltrim( localUtil.ntoc( AV25TFBarCod_To, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARCODREO", GXutil.ltrim( localUtil.ntoc( AV26TFBarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARCODREO_TO", GXutil.ltrim( localUtil.ntoc( AV27TFBarCodReo_To, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARCODPAR", GXutil.rtrim( AV28TFBarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARCODPAR_SEL", GXutil.rtrim( AV29TFBarCodPar_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFALBSER", GXutil.rtrim( AV30TFAlbSer));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFALBSER_SEL", GXutil.rtrim( AV31TFAlbSer_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFALBCOLORCV", GXutil.rtrim( AV32TFAlbColorCv));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFALBCOLORCV_SEL", GXutil.rtrim( AV33TFAlbColorCv_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFALBNOMCLI", GXutil.rtrim( AV34TFAlbNomCli));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFALBNOMCLI_SEL", GXutil.rtrim( AV35TFAlbNomCli_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFALBCOLNUM", GXutil.ltrim( localUtil.ntoc( AV36TFAlbColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFALBCOLNUM_TO", GXutil.ltrim( localUtil.ntoc( AV37TFAlbColNum_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFCODCOD", GXutil.rtrim( AV38TFCodCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFCODCOD_SEL", GXutil.rtrim( AV39TFCodCod_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARALBKGME", GXutil.ltrim( localUtil.ntoc( AV40TFBarAlbKgmE, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARALBKGME_TO", GXutil.ltrim( localUtil.ntoc( AV41TFBarAlbKgmE_To, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARPREKGM", GXutil.ltrim( localUtil.ntoc( AV42TFBarPreKgm, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARPREKGM_TO", GXutil.ltrim( localUtil.ntoc( AV43TFBarPreKgm_To, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFALBHDRANC", GXutil.ltrim( localUtil.ntoc( AV44TFAlbHdrAnc, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFALBHDRANC_TO", GXutil.ltrim( localUtil.ntoc( AV45TFAlbHdrAnc_To, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFALBHDRGM2", GXutil.ltrim( localUtil.ntoc( AV46TFAlbHdrgm2, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFALBHDRGM2_TO", GXutil.ltrim( localUtil.ntoc( AV47TFAlbHdrgm2_To, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARALBMTRE", GXutil.ltrim( localUtil.ntoc( AV48TFBarAlbMtrE, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARALBMTRE_TO", GXutil.ltrim( localUtil.ntoc( AV49TFBarAlbMtrE_To, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARPREMTR", GXutil.ltrim( localUtil.ntoc( AV50TFBarPreMtr, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARPREMTR_TO", GXutil.ltrim( localUtil.ntoc( AV51TFBarPreMtr_To, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARALBPIE", GXutil.ltrim( localUtil.ntoc( AV52TFBarAlbPie, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARALBPIE_TO", GXutil.ltrim( localUtil.ntoc( AV53TFBarAlbPie_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFALBTIRAS", GXutil.rtrim( AV54TFAlbTiras));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFALBTIRAS_SEL", GXutil.rtrim( AV55TFAlbTiras_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFALBTIRASKG", GXutil.ltrim( localUtil.ntoc( AV56TFAlbTirasKg, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFALBTIRASKG_TO", GXutil.ltrim( localUtil.ntoc( AV57TFAlbTirasKg_To, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFALBSINTEST", GXutil.rtrim( AV58TFAlbSinTest));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFALBSINTEST_SEL", GXutil.rtrim( AV59TFAlbSinTest_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFTUBCOD", GXutil.ltrim( localUtil.ntoc( AV60TFTubCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFTUBCOD_TO", GXutil.ltrim( localUtil.ntoc( AV61TFTubCod_To, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARALBTUB", GXutil.ltrim( localUtil.ntoc( AV62TFBarAlbTub, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARALBTUB_TO", GXutil.ltrim( localUtil.ntoc( AV63TFBarAlbTub_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFALBHDROBS", GXutil.rtrim( AV64TFAlbHdrObs));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFALBHDROBS_SEL", GXutil.rtrim( AV65TFAlbHdrObs_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPLASCOD", GXutil.ltrim( localUtil.ntoc( AV66TFPlasCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPLASCOD_TO", GXutil.ltrim( localUtil.ntoc( AV67TFPlasCod_To, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARALBPLAS", GXutil.ltrim( localUtil.ntoc( AV68TFBarAlbPlas, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARALBPLAS_TO", GXutil.ltrim( localUtil.ntoc( AV69TFBarAlbPlas_To, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFTIPACACOD", GXutil.ltrim( localUtil.ntoc( AV70TFTipAcaCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFTIPACACOD_TO", GXutil.ltrim( localUtil.ntoc( AV71TFTipAcaCod_To, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vTFALBPROVAL_SELS", AV73TFAlbProVal_Sels);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vTFALBPROVAL_SELS", AV73TFAlbProVal_Sels);
      }
      app.GxWebStd.gx_boolean_hidden_field( httpContext, sPrefix+"vACCIONESENPOPUP", AV85AccionesEnPopup);
      app.GxWebStd.gx_boolean_hidden_field( httpContext, sPrefix+"vVISUALIZARACCIONES", AV84VisualizarAcciones);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vORDEREDBY", GXutil.ltrim( localUtil.ntoc( AV12OrderedBy, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, sPrefix+"vORDEREDDSC", AV13OrderedDsc);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vARTEMALHA", GXutil.ltrim( localUtil.ntoc( AV89Artemalha, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vARTEMALHA", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV89Artemalha), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vF_CARVEMA", GXutil.ltrim( localUtil.ntoc( AV90F_carvema, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vF_CARVEMA", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV90F_carvema), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vSIPLASTICOS", GXutil.ltrim( localUtil.ntoc( AV91Siplasticos, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vSIPLASTICOS", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV91Siplasticos), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vENDUTEX", GXutil.ltrim( localUtil.ntoc( AV92Endutex, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vENDUTEX", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV92Endutex), "9")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vGRIDSTATE", AV10GridState);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vGRIDSTATE", AV10GridState);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFALBPROVAL_SELSJSON", AV72TFAlbProVal_SelsJson);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TABLEALBARAN_Width", GXutil.rtrim( Dvpanel_tablealbaran_Width));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TABLEALBARAN_Autowidth", GXutil.booltostr( Dvpanel_tablealbaran_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TABLEALBARAN_Autoheight", GXutil.booltostr( Dvpanel_tablealbaran_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TABLEALBARAN_Cls", GXutil.rtrim( Dvpanel_tablealbaran_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TABLEALBARAN_Title", GXutil.rtrim( Dvpanel_tablealbaran_Title));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TABLEALBARAN_Collapsible", GXutil.booltostr( Dvpanel_tablealbaran_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TABLEALBARAN_Collapsed", GXutil.booltostr( Dvpanel_tablealbaran_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TABLEALBARAN_Showcollapseicon", GXutil.booltostr( Dvpanel_tablealbaran_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TABLEALBARAN_Iconposition", GXutil.rtrim( Dvpanel_tablealbaran_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TABLEALBARAN_Autoscroll", GXutil.booltostr( Dvpanel_tablealbaran_Autoscroll));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_MANAGEFILTERS_Icontype", GXutil.rtrim( Ddo_managefilters_Icontype));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_MANAGEFILTERS_Icon", GXutil.rtrim( Ddo_managefilters_Icon));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_MANAGEFILTERS_Tooltip", GXutil.rtrim( Ddo_managefilters_Tooltip));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_MANAGEFILTERS_Cls", GXutil.rtrim( Ddo_managefilters_Cls));
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

   public void renderHtmlCloseForm1XC2( )
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
         if ( ! ( WebComp_Grid_dwc == null ) )
         {
            WebComp_Grid_dwc.componentjscripts();
         }
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
      return "Albaranes.AlbaranGuia__WW" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( " Guias", "") ;
   }

   public void wb1XC0( )
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
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "app.albaranes.albaranguia__ww");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablecontent_Internalname, 1, 0, "px", 0, "px", "TableContent15", "left", "top", "", "", "div");
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
         app.GxWebStd.gx_div_start( httpContext, divDvpanel_tablealbaran_cell_Internalname, 1, 0, "px", 0, "px", divDvpanel_tablealbaran_cell_Class, "left", "top", "", "", "div");
         /* User Defined Control */
         ucDvpanel_tablealbaran.setProperty("Width", Dvpanel_tablealbaran_Width);
         ucDvpanel_tablealbaran.setProperty("AutoWidth", Dvpanel_tablealbaran_Autowidth);
         ucDvpanel_tablealbaran.setProperty("AutoHeight", Dvpanel_tablealbaran_Autoheight);
         ucDvpanel_tablealbaran.setProperty("Cls", Dvpanel_tablealbaran_Cls);
         ucDvpanel_tablealbaran.setProperty("Title", Dvpanel_tablealbaran_Title);
         ucDvpanel_tablealbaran.setProperty("Collapsible", Dvpanel_tablealbaran_Collapsible);
         ucDvpanel_tablealbaran.setProperty("Collapsed", Dvpanel_tablealbaran_Collapsed);
         ucDvpanel_tablealbaran.setProperty("ShowCollapseIcon", Dvpanel_tablealbaran_Showcollapseicon);
         ucDvpanel_tablealbaran.setProperty("IconPosition", Dvpanel_tablealbaran_Iconposition);
         ucDvpanel_tablealbaran.setProperty("AutoScroll", Dvpanel_tablealbaran_Autoscroll);
         ucDvpanel_tablealbaran.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_tablealbaran_Internalname, sPrefix+"DVPANEL_TABLEALBARANContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+sPrefix+"DVPANEL_TABLEALBARANContainer"+"TableAlbaran"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablealbaran_Internalname, 1, 0, "px", 0, "px", "TableData", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable3_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1 CellMarginTop25", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTbngruia_Internalname, httpContext.getMessage( "<b>Nº Guia</b>", ""), "", "", lblTbngruia_Jsonclick, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(1), "HLP_Albaranes\\AlbaranGuia__WW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtAlbProCod_Internalname, httpContext.getMessage( "Numero Albaran Produccion", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtAlbProCod_Internalname, GXutil.ltrim( localUtil.ntoc( A30AlbProCod, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbProCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A30AlbProCod), "ZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A30AlbProCod), "ZZZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbProCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbProCod_Enabled, 0, "text", "1", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Albaranes\\AlbaranGuia__WW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, cmbAlbEnvFtp.getInternalname(), httpContext.getMessage( "Envio Albaran FTP", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbAlbEnvFtp, cmbAlbEnvFtp.getInternalname(), GXutil.trim( GXutil.str( A5805AlbEnvFtp, 1, 0)), 1, cmbAlbEnvFtp.getJsonclick(), 0, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "int", "", 1, cmbAlbEnvFtp.getEnabled(), 1, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", "", "", true, (byte)(0), "HLP_Albaranes\\AlbaranGuia__WW.htm");
         cmbAlbEnvFtp.setValue( GXutil.trim( GXutil.str( A5805AlbEnvFtp, 1, 0)) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbAlbEnvFtp.getInternalname(), "Values", cmbAlbEnvFtp.ToJavascriptSource(), true);
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtGuiRemCli_Internalname, httpContext.getMessage( "Codigo Cliente", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtGuiRemCli_Internalname, GXutil.ltrim( localUtil.ntoc( A1243GuiRemCli, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtGuiRemCli_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1243GuiRemCli), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A1243GuiRemCli), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtGuiRemCli_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtGuiRemCli_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Albaranes\\AlbaranGuia__WW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtGuiRemCln_Internalname, httpContext.getMessage( "Cliente", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtGuiRemCln_Internalname, GXutil.rtrim( A1244GuiRemCln), GXutil.rtrim( localUtil.format( A1244GuiRemCln, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtGuiRemCln_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtGuiRemCln_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Albaranes\\AlbaranGuia__WW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtAlbProfch_Internalname, httpContext.getMessage( "Fecha", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
         /* Single line edit */
         httpContext.writeText( "<div id=\""+edtAlbProfch_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtAlbProfch_Internalname, localUtil.format(A34AlbProfch, "99/99/99"), localUtil.format( A34AlbProfch, "99/99/99"), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbProfch_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbProfch_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Albaranes\\AlbaranGuia__WW.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtAlbProfch_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtAlbProfch_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_Albaranes\\AlbaranGuia__WW.htm");
         httpContext.writeTextNL( "</div>") ;
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell CellMarginTop", "left", "top", "", "", "div");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 47,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtninsert_Internalname, "gx.evt.setGridEvt("+GXutil.str( 69, 2, 0)+","+"null"+");", httpContext.getMessage( "GXM_insert", ""), bttBtninsert_Jsonclick, 5, httpContext.getMessage( "GXM_insert", ""), "", StyleString, ClassString, bttBtninsert_Visible, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOINSERT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Albaranes\\AlbaranGuia__WW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 49,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "hidden-xs" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtneditcolumns_Internalname, "gx.evt.setGridEvt("+GXutil.str( 69, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_EditColumnsCaption", ""), bttBtneditcolumns_Jsonclick, 0, httpContext.getMessage( "WWP_EditColumnsTooltip", ""), "", StyleString, ClassString, 1, 0, "standard", "'"+sPrefix+"'"+",false,"+"'"+""+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Albaranes\\AlbaranGuia__WW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         wb_table1_51_1XC2( true) ;
      }
      else
      {
         wb_table1_51_1XC2( false) ;
      }
      return  ;
   }

   public void wb_table1_51_1XC2e( boolean wbgen )
   {
      if ( wbgen )
      {
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable1_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
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
         ucGridpaginationbar.setProperty("CurrentPage", AV80GridCurrentPage);
         ucGridpaginationbar.setProperty("PageCount", AV81GridPageCount);
         ucGridpaginationbar.render(context, "dvelop.dvpaginationbar", Gridpaginationbar_Internalname, sPrefix+"GRIDPAGINATIONBARContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divCell_grid_dwc_Internalname, 1, 0, "px", 0, "px", divCell_grid_dwc_Class, "left", "top", "", "", "div");
         if ( ! isFullAjaxMode( ) )
         {
            /* WebComponent */
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"W0106"+"", GXutil.rtrim( WebComp_Grid_dwc_Component));
            httpContext.writeText( "<div") ;
            app.GxWebStd.classAttribute( httpContext, "gxwebcomponent");
            httpContext.writeText( " id=\""+sPrefix+"gxHTMLWrpW0106"+""+"\""+"") ;
            httpContext.writeText( ">") ;
            if ( bGXsfl_69_Refreshing )
            {
               if ( GXutil.len( WebComp_Grid_dwc_Component) != 0 )
               {
                  if ( GXutil.strcmp(GXutil.lower( OldGrid_dwc), GXutil.lower( WebComp_Grid_dwc_Component)) != 0 )
                  {
                     httpContext.ajax_rspStartCmp(sPrefix+"gxHTMLWrpW0106"+"");
                  }
                  WebComp_Grid_dwc.componentdraw();
                  if ( GXutil.strcmp(GXutil.lower( OldGrid_dwc), GXutil.lower( WebComp_Grid_dwc_Component)) != 0 )
                  {
                     httpContext.ajax_rspEndCmp();
                  }
               }
            }
            httpContext.writeText( "</div>") ;
         }
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable2_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-6 CellMarginTop", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 112,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "ButtonMaterialDefault" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "gx.evt.setGridEvt("+GXutil.str( 69, 2, 0)+","+"null"+");", httpContext.getMessage( "Cerrar", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Albaranes\\AlbaranGuia__WW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-6 CellMarginTop10 CellMarginBottom10", "Right", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavPgmname_Internalname, httpContext.getMessage( "pgmname", ""), "col-sm-3 AttributeLabel", 0, true, "");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV95Pgmname), GXutil.rtrim( localUtil.format( AV95Pgmname, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Albaranes\\AlbaranGuia__WW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "Right", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
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
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV78DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, sPrefix+"DDO_GRIDContainer");
         /* User Defined Control */
         ucDdo_gridcolumnsselector.setProperty("Caption", Ddo_gridcolumnsselector_Caption);
         ucDdo_gridcolumnsselector.setProperty("Tooltip", Ddo_gridcolumnsselector_Tooltip);
         ucDdo_gridcolumnsselector.setProperty("Cls", Ddo_gridcolumnsselector_Cls);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsType", Ddo_gridcolumnsselector_Dropdownoptionstype);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsTitleSettingsIcons", AV78DDO_TitleSettingsIcons);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsData", AV18ColumnsSelector);
         ucDdo_gridcolumnsselector.render(context, "dvelop.gxbootstrap.ddogridcolumnsselector", Ddo_gridcolumnsselector_Internalname, sPrefix+"DDO_GRIDCOLUMNSSELECTORContainer");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "Attribute", "", "", "", "", edtEmprCod_Visible, 0, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Albaranes\\AlbaranGuia__WW.htm");
         /* User Defined Control */
         ucGrid_empowerer.setProperty("HasTitleSettings", Grid_empowerer_Hastitlesettings);
         ucGrid_empowerer.setProperty("HasColumnsSelector", Grid_empowerer_Hascolumnsselector);
         ucGrid_empowerer.render(context, "wwp.gridempowerer", Grid_empowerer_Internalname, sPrefix+"GRID_EMPOWERERContainer");
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

   public void start1XC2( )
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
            Form.getMeta().addItem("description", httpContext.getMessage( " Guias", ""), (short)(0)) ;
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
            strup1XC0( ) ;
         }
      }
   }

   public void ws1XC2( )
   {
      start1XC2( ) ;
      evt1XC2( ) ;
   }

   public void evt1XC2( )
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
                              strup1XC0( ) ;
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
                              strup1XC0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e111XC2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEPAGE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1XC0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e121XC2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1XC0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e131XC2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRID.ONOPTIONCLICKED") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1XC0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e141XC2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1XC0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e151XC2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOINSERT'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1XC0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoInsert' */
                                 e161XC2 ();
                              }
                           }
                           /* No code required for Cancel button. It is implemented as the Reset button. */
                        }
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1XC0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 GX_FocusControl = edtavDetailwebcomponent_Internalname ;
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
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 7), "REFRESH") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 9), "GRID.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 13), "VUPDATE.CLICK") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 13), "VDELETE.CLICK") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 13), "VUPDATE.CLICK") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 13), "VDELETE.CLICK") == 0 ) )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1XC0( ) ;
                           }
                           nGXsfl_69_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_69_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_69_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_692( ) ;
                           AV83DetailWebComponent = httpContext.cgiGet( edtavDetailwebcomponent_Internalname) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavDetailwebcomponent_Internalname, AV83DetailWebComponent);
                           AV86Update = httpContext.cgiGet( edtavUpdate_Internalname) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavUpdate_Internalname, AV86Update);
                           AV87Delete = httpContext.cgiGet( edtavDelete_Internalname) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavDelete_Internalname, AV87Delete);
                           A129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( edtBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarCodReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A130BarCodPar = httpContext.cgiGet( edtBarCodPar_Internalname) ;
                           A3391AlbSer = httpContext.cgiGet( edtAlbSer_Internalname) ;
                           A12234AlbTipArt = (short)(localUtil.ctol( httpContext.cgiGet( edtAlbTipArt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A14056AlbColorCv = httpContext.cgiGet( edtAlbColorCv_Internalname) ;
                           A12232AlbNomCli = httpContext.cgiGet( edtAlbNomCli_Internalname) ;
                           A3393AlbColNum = (int)(localUtil.ctol( httpContext.cgiGet( edtAlbColNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A3153CodCod = httpContext.cgiGet( edtCodCod_Internalname) ;
                           n3153CodCod = false ;
                           A1261BarAlbKgmE = localUtil.ctond( httpContext.cgiGet( edtBarAlbKgmE_Internalname)) ;
                           A1262BarPreKgm = localUtil.ctond( httpContext.cgiGet( edtBarPreKgm_Internalname)) ;
                           A3271AlbHdrAnc = (short)(localUtil.ctol( httpContext.cgiGet( edtAlbHdrAnc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A5019AlbHdrgm2 = (short)(localUtil.ctol( httpContext.cgiGet( edtAlbHdrgm2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A1263BarAlbMtrE = localUtil.ctond( httpContext.cgiGet( edtBarAlbMtrE_Internalname)) ;
                           A1264BarPreMtr = localUtil.ctond( httpContext.cgiGet( edtBarPreMtr_Internalname)) ;
                           A1265BarAlbPie = (int)(localUtil.ctol( httpContext.cgiGet( edtBarAlbPie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A14057AlbTiras = httpContext.cgiGet( edtAlbTiras_Internalname) ;
                           A14058AlbTirasKg = localUtil.ctond( httpContext.cgiGet( edtAlbTirasKg_Internalname)) ;
                           A14059AlbSinTest = httpContext.cgiGet( edtAlbSinTest_Internalname) ;
                           A1206TubCod = (short)(localUtil.ctol( httpContext.cgiGet( edtTubCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           n1206TubCod = false ;
                           A1266BarAlbTub = (int)(localUtil.ctol( httpContext.cgiGet( edtBarAlbTub_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A2441AlbHdrObs = httpContext.cgiGet( edtAlbHdrObs_Internalname) ;
                           A6466PlasCod = (short)(localUtil.ctol( httpContext.cgiGet( edtPlasCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           n6466PlasCod = false ;
                           A6467BarAlbPlas = (short)(localUtil.ctol( httpContext.cgiGet( edtBarAlbPlas_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A5051TipAcaCod = (short)(localUtil.ctol( httpContext.cgiGet( edtTipAcaCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           cmbAlbProVal.setName( cmbAlbProVal.getInternalname() );
                           cmbAlbProVal.setValue( httpContext.cgiGet( cmbAlbProVal.getInternalname()) );
                           A2839AlbProVal = httpContext.cgiGet( cmbAlbProVal.getInternalname()) ;
                           A7101AlbLic = httpContext.cgiGet( edtAlbLic_Internalname) ;
                           A2242AlbSec = GXutil.upper( httpContext.cgiGet( edtAlbSec_Internalname)) ;
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
                                       GX_FocusControl = edtavDetailwebcomponent_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       /* Execute user event: Start */
                                       e171XC2 ();
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
                                       GX_FocusControl = edtavDetailwebcomponent_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       /* Execute user event: Refresh */
                                       e181XC2 ();
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
                                       GX_FocusControl = edtavDetailwebcomponent_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       e191XC2 ();
                                    }
                                 }
                              }
                              else if ( GXutil.strcmp(sEvt, "VUPDATE.CLICK") == 0 )
                              {
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       dynload_actions( ) ;
                                       GX_FocusControl = edtavDetailwebcomponent_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       e201XC2 ();
                                    }
                                 }
                              }
                              else if ( GXutil.strcmp(sEvt, "VDELETE.CLICK") == 0 )
                              {
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       dynload_actions( ) ;
                                       GX_FocusControl = edtavDetailwebcomponent_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       e211XC2 ();
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
                                          if ( ! Rfr0gs )
                                          {
                                          }
                                          dynload_actions( ) ;
                                       }
                                    }
                                 }
                              }
                              else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                              {
                                 if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                                 {
                                    strup1XC0( ) ;
                                 }
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       dynload_actions( ) ;
                                       GX_FocusControl = edtavDetailwebcomponent_Internalname ;
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
                  else if ( GXutil.strcmp(sEvtType, "W") == 0 )
                  {
                     sEvtType = GXutil.left( sEvt, 4) ;
                     sEvt = GXutil.right( sEvt, GXutil.len( sEvt)-4) ;
                     nCmpId = (short)(GXutil.lval( sEvtType)) ;
                     if ( nCmpId == 106 )
                     {
                        OldGrid_dwc = httpContext.cgiGet( sPrefix+"W0106") ;
                        if ( ( GXutil.len( OldGrid_dwc) == 0 ) || ( GXutil.strcmp(OldGrid_dwc, WebComp_Grid_dwc_Component) != 0 ) )
                        {
                           WebComp_Grid_dwc = WebUtils.getWebComponent(getClass(), "app." + OldGrid_dwc + "_impl", remoteHandle, context);
                           WebComp_Grid_dwc_Component = OldGrid_dwc ;
                        }
                        if ( GXutil.len( WebComp_Grid_dwc_Component) != 0 )
                        {
                           WebComp_Grid_dwc.componentprocess(sPrefix+"W0106", "", sEvt);
                        }
                        WebComp_Grid_dwc_Component = OldGrid_dwc ;
                     }
                  }
                  httpContext.wbHandled = (byte)(1) ;
               }
            }
         }
      }
   }

   public void we1XC2( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm1XC2( ) ;
         }
      }
   }

   public void pa1XC2( )
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
                                 long A30AlbProCod ,
                                 String A396EmprCod ,
                                 byte AV23ManageFiltersExecutionStep ,
                                 app.wwpbaseobjects.SdtWWPColumnsSelector AV18ColumnsSelector ,
                                 String AV15FilterFullText ,
                                 int AV24TFBarCod ,
                                 int AV25TFBarCod_To ,
                                 byte AV26TFBarCodReo ,
                                 byte AV27TFBarCodReo_To ,
                                 String AV28TFBarCodPar ,
                                 String AV29TFBarCodPar_Sel ,
                                 String AV30TFAlbSer ,
                                 String AV31TFAlbSer_Sel ,
                                 String AV32TFAlbColorCv ,
                                 String AV33TFAlbColorCv_Sel ,
                                 String AV34TFAlbNomCli ,
                                 String AV35TFAlbNomCli_Sel ,
                                 int AV36TFAlbColNum ,
                                 int AV37TFAlbColNum_To ,
                                 String AV38TFCodCod ,
                                 String AV39TFCodCod_Sel ,
                                 java.math.BigDecimal AV40TFBarAlbKgmE ,
                                 java.math.BigDecimal AV41TFBarAlbKgmE_To ,
                                 java.math.BigDecimal AV42TFBarPreKgm ,
                                 java.math.BigDecimal AV43TFBarPreKgm_To ,
                                 short AV44TFAlbHdrAnc ,
                                 short AV45TFAlbHdrAnc_To ,
                                 short AV46TFAlbHdrgm2 ,
                                 short AV47TFAlbHdrgm2_To ,
                                 java.math.BigDecimal AV48TFBarAlbMtrE ,
                                 java.math.BigDecimal AV49TFBarAlbMtrE_To ,
                                 java.math.BigDecimal AV50TFBarPreMtr ,
                                 java.math.BigDecimal AV51TFBarPreMtr_To ,
                                 int AV52TFBarAlbPie ,
                                 int AV53TFBarAlbPie_To ,
                                 String AV54TFAlbTiras ,
                                 String AV55TFAlbTiras_Sel ,
                                 java.math.BigDecimal AV56TFAlbTirasKg ,
                                 java.math.BigDecimal AV57TFAlbTirasKg_To ,
                                 String AV58TFAlbSinTest ,
                                 String AV59TFAlbSinTest_Sel ,
                                 short AV60TFTubCod ,
                                 short AV61TFTubCod_To ,
                                 int AV62TFBarAlbTub ,
                                 int AV63TFBarAlbTub_To ,
                                 String AV64TFAlbHdrObs ,
                                 String AV65TFAlbHdrObs_Sel ,
                                 short AV66TFPlasCod ,
                                 short AV67TFPlasCod_To ,
                                 short AV68TFBarAlbPlas ,
                                 short AV69TFBarAlbPlas_To ,
                                 short AV70TFTipAcaCod ,
                                 short AV71TFTipAcaCod_To ,
                                 GXSimpleCollection<String> AV73TFAlbProVal_Sels ,
                                 boolean AV85AccionesEnPopup ,
                                 boolean AV84VisualizarAcciones ,
                                 String AV95Pgmname ,
                                 short AV12OrderedBy ,
                                 boolean AV13OrderedDsc ,
                                 byte AV89Artemalha ,
                                 byte AV90F_carvema ,
                                 byte AV91Siplasticos ,
                                 byte AV92Endutex ,
                                 String sPrefix )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e181XC2 ();
      GRID_nCurrentRecord = 0 ;
      rf1XC2( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"AlbaranGuia__WW");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV95Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("albaranes\\albaranguia__ww:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
      /* End function gxgrGrid_refresh */
   }

   public void send_integrity_hashes( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_BARCOD", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"BARCOD", GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_BARCODREO", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"BARCODREO", GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_BARCODPAR", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A130BarCodPar, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"BARCODPAR", GXutil.rtrim( A130BarCodPar));
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
      if ( cmbAlbEnvFtp.getItemCount() > 0 )
      {
         A5805AlbEnvFtp = (byte)(GXutil.lval( cmbAlbEnvFtp.getValidValue(GXutil.trim( GXutil.str( A5805AlbEnvFtp, 1, 0))))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A5805AlbEnvFtp", GXutil.str( A5805AlbEnvFtp, 1, 0));
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbAlbEnvFtp.setValue( GXutil.trim( GXutil.str( A5805AlbEnvFtp, 1, 0)) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbAlbEnvFtp.getInternalname(), "Values", cmbAlbEnvFtp.ToJavascriptSource(), true);
      }
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rf1XC2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV95Pgmname = "Albaranes.AlbaranGuia__WW" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV95Pgmname", AV95Pgmname);
      Gx_err = (short)(0) ;
      edtavDetailwebcomponent_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDetailwebcomponent_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDetailwebcomponent_Enabled), 5, 0), !bGXsfl_69_Refreshing);
      edtavUpdate_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavUpdate_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavUpdate_Enabled), 5, 0), !bGXsfl_69_Refreshing);
      edtavDelete_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDelete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDelete_Enabled), 5, 0), !bGXsfl_69_Refreshing);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public int subgridclient_rec_count_fnc( )
   {
      AV100Albaranes_albaranguia__wwds_1_filterfulltext = AV15FilterFullText ;
      AV101Albaranes_albaranguia__wwds_2_tfbarcod = AV24TFBarCod ;
      AV102Albaranes_albaranguia__wwds_3_tfbarcod_to = AV25TFBarCod_To ;
      AV103Albaranes_albaranguia__wwds_4_tfbarcodreo = AV26TFBarCodReo ;
      AV104Albaranes_albaranguia__wwds_5_tfbarcodreo_to = AV27TFBarCodReo_To ;
      AV105Albaranes_albaranguia__wwds_6_tfbarcodpar = AV28TFBarCodPar ;
      AV106Albaranes_albaranguia__wwds_7_tfbarcodpar_sel = AV29TFBarCodPar_Sel ;
      AV107Albaranes_albaranguia__wwds_8_tfalbser = AV30TFAlbSer ;
      AV108Albaranes_albaranguia__wwds_9_tfalbser_sel = AV31TFAlbSer_Sel ;
      AV109Albaranes_albaranguia__wwds_10_tfalbcolorcv = AV32TFAlbColorCv ;
      AV110Albaranes_albaranguia__wwds_11_tfalbcolorcv_sel = AV33TFAlbColorCv_Sel ;
      AV111Albaranes_albaranguia__wwds_12_tfalbnomcli = AV34TFAlbNomCli ;
      AV112Albaranes_albaranguia__wwds_13_tfalbnomcli_sel = AV35TFAlbNomCli_Sel ;
      AV113Albaranes_albaranguia__wwds_14_tfalbcolnum = AV36TFAlbColNum ;
      AV114Albaranes_albaranguia__wwds_15_tfalbcolnum_to = AV37TFAlbColNum_To ;
      AV115Albaranes_albaranguia__wwds_16_tfcodcod = AV38TFCodCod ;
      AV116Albaranes_albaranguia__wwds_17_tfcodcod_sel = AV39TFCodCod_Sel ;
      AV117Albaranes_albaranguia__wwds_18_tfbaralbkgme = AV40TFBarAlbKgmE ;
      AV118Albaranes_albaranguia__wwds_19_tfbaralbkgme_to = AV41TFBarAlbKgmE_To ;
      AV119Albaranes_albaranguia__wwds_20_tfbarprekgm = AV42TFBarPreKgm ;
      AV120Albaranes_albaranguia__wwds_21_tfbarprekgm_to = AV43TFBarPreKgm_To ;
      AV121Albaranes_albaranguia__wwds_22_tfalbhdranc = AV44TFAlbHdrAnc ;
      AV122Albaranes_albaranguia__wwds_23_tfalbhdranc_to = AV45TFAlbHdrAnc_To ;
      AV123Albaranes_albaranguia__wwds_24_tfalbhdrgm2 = AV46TFAlbHdrgm2 ;
      AV124Albaranes_albaranguia__wwds_25_tfalbhdrgm2_to = AV47TFAlbHdrgm2_To ;
      AV125Albaranes_albaranguia__wwds_26_tfbaralbmtre = AV48TFBarAlbMtrE ;
      AV126Albaranes_albaranguia__wwds_27_tfbaralbmtre_to = AV49TFBarAlbMtrE_To ;
      AV127Albaranes_albaranguia__wwds_28_tfbarpremtr = AV50TFBarPreMtr ;
      AV128Albaranes_albaranguia__wwds_29_tfbarpremtr_to = AV51TFBarPreMtr_To ;
      AV129Albaranes_albaranguia__wwds_30_tfbaralbpie = AV52TFBarAlbPie ;
      AV130Albaranes_albaranguia__wwds_31_tfbaralbpie_to = AV53TFBarAlbPie_To ;
      AV131Albaranes_albaranguia__wwds_32_tfalbtiras = AV54TFAlbTiras ;
      AV132Albaranes_albaranguia__wwds_33_tfalbtiras_sel = AV55TFAlbTiras_Sel ;
      AV133Albaranes_albaranguia__wwds_34_tfalbtiraskg = AV56TFAlbTirasKg ;
      AV134Albaranes_albaranguia__wwds_35_tfalbtiraskg_to = AV57TFAlbTirasKg_To ;
      AV135Albaranes_albaranguia__wwds_36_tfalbsintest = AV58TFAlbSinTest ;
      AV136Albaranes_albaranguia__wwds_37_tfalbsintest_sel = AV59TFAlbSinTest_Sel ;
      AV137Albaranes_albaranguia__wwds_38_tftubcod = AV60TFTubCod ;
      AV138Albaranes_albaranguia__wwds_39_tftubcod_to = AV61TFTubCod_To ;
      AV139Albaranes_albaranguia__wwds_40_tfbaralbtub = AV62TFBarAlbTub ;
      AV140Albaranes_albaranguia__wwds_41_tfbaralbtub_to = AV63TFBarAlbTub_To ;
      AV141Albaranes_albaranguia__wwds_42_tfalbhdrobs = AV64TFAlbHdrObs ;
      AV142Albaranes_albaranguia__wwds_43_tfalbhdrobs_sel = AV65TFAlbHdrObs_Sel ;
      AV143Albaranes_albaranguia__wwds_44_tfplascod = AV66TFPlasCod ;
      AV144Albaranes_albaranguia__wwds_45_tfplascod_to = AV67TFPlasCod_To ;
      AV145Albaranes_albaranguia__wwds_46_tfbaralbplas = AV68TFBarAlbPlas ;
      AV146Albaranes_albaranguia__wwds_47_tfbaralbplas_to = AV69TFBarAlbPlas_To ;
      AV147Albaranes_albaranguia__wwds_48_tftipacacod = AV70TFTipAcaCod ;
      AV148Albaranes_albaranguia__wwds_49_tftipacacod_to = AV71TFTipAcaCod_To ;
      AV149Albaranes_albaranguia__wwds_50_tfalbproval_sels = AV73TFAlbProVal_Sels ;
      GRID_nRecordCount = 0 ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           A2839AlbProVal ,
                                           AV149Albaranes_albaranguia__wwds_50_tfalbproval_sels ,
                                           Integer.valueOf(AV101Albaranes_albaranguia__wwds_2_tfbarcod) ,
                                           Integer.valueOf(AV102Albaranes_albaranguia__wwds_3_tfbarcod_to) ,
                                           Byte.valueOf(AV103Albaranes_albaranguia__wwds_4_tfbarcodreo) ,
                                           Byte.valueOf(AV104Albaranes_albaranguia__wwds_5_tfbarcodreo_to) ,
                                           AV106Albaranes_albaranguia__wwds_7_tfbarcodpar_sel ,
                                           AV105Albaranes_albaranguia__wwds_6_tfbarcodpar ,
                                           AV108Albaranes_albaranguia__wwds_9_tfalbser_sel ,
                                           AV107Albaranes_albaranguia__wwds_8_tfalbser ,
                                           AV112Albaranes_albaranguia__wwds_13_tfalbnomcli_sel ,
                                           AV111Albaranes_albaranguia__wwds_12_tfalbnomcli ,
                                           Integer.valueOf(AV113Albaranes_albaranguia__wwds_14_tfalbcolnum) ,
                                           Integer.valueOf(AV114Albaranes_albaranguia__wwds_15_tfalbcolnum_to) ,
                                           AV116Albaranes_albaranguia__wwds_17_tfcodcod_sel ,
                                           AV115Albaranes_albaranguia__wwds_16_tfcodcod ,
                                           AV117Albaranes_albaranguia__wwds_18_tfbaralbkgme ,
                                           AV118Albaranes_albaranguia__wwds_19_tfbaralbkgme_to ,
                                           AV119Albaranes_albaranguia__wwds_20_tfbarprekgm ,
                                           AV120Albaranes_albaranguia__wwds_21_tfbarprekgm_to ,
                                           Short.valueOf(AV121Albaranes_albaranguia__wwds_22_tfalbhdranc) ,
                                           Short.valueOf(AV122Albaranes_albaranguia__wwds_23_tfalbhdranc_to) ,
                                           Short.valueOf(AV123Albaranes_albaranguia__wwds_24_tfalbhdrgm2) ,
                                           Short.valueOf(AV124Albaranes_albaranguia__wwds_25_tfalbhdrgm2_to) ,
                                           AV125Albaranes_albaranguia__wwds_26_tfbaralbmtre ,
                                           AV126Albaranes_albaranguia__wwds_27_tfbaralbmtre_to ,
                                           AV127Albaranes_albaranguia__wwds_28_tfbarpremtr ,
                                           AV128Albaranes_albaranguia__wwds_29_tfbarpremtr_to ,
                                           Integer.valueOf(AV129Albaranes_albaranguia__wwds_30_tfbaralbpie) ,
                                           Integer.valueOf(AV130Albaranes_albaranguia__wwds_31_tfbaralbpie_to) ,
                                           AV132Albaranes_albaranguia__wwds_33_tfalbtiras_sel ,
                                           AV131Albaranes_albaranguia__wwds_32_tfalbtiras ,
                                           AV133Albaranes_albaranguia__wwds_34_tfalbtiraskg ,
                                           AV134Albaranes_albaranguia__wwds_35_tfalbtiraskg_to ,
                                           AV136Albaranes_albaranguia__wwds_37_tfalbsintest_sel ,
                                           AV135Albaranes_albaranguia__wwds_36_tfalbsintest ,
                                           Short.valueOf(AV137Albaranes_albaranguia__wwds_38_tftubcod) ,
                                           Short.valueOf(AV138Albaranes_albaranguia__wwds_39_tftubcod_to) ,
                                           Integer.valueOf(AV139Albaranes_albaranguia__wwds_40_tfbaralbtub) ,
                                           Integer.valueOf(AV140Albaranes_albaranguia__wwds_41_tfbaralbtub_to) ,
                                           AV142Albaranes_albaranguia__wwds_43_tfalbhdrobs_sel ,
                                           AV141Albaranes_albaranguia__wwds_42_tfalbhdrobs ,
                                           Short.valueOf(AV143Albaranes_albaranguia__wwds_44_tfplascod) ,
                                           Short.valueOf(AV144Albaranes_albaranguia__wwds_45_tfplascod_to) ,
                                           Short.valueOf(AV145Albaranes_albaranguia__wwds_46_tfbaralbplas) ,
                                           Short.valueOf(AV146Albaranes_albaranguia__wwds_47_tfbaralbplas_to) ,
                                           Short.valueOf(AV147Albaranes_albaranguia__wwds_48_tftipacacod) ,
                                           Short.valueOf(AV148Albaranes_albaranguia__wwds_49_tftipacacod_to) ,
                                           Integer.valueOf(AV149Albaranes_albaranguia__wwds_50_tfalbproval_sels.size()) ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           A3391AlbSer ,
                                           A12232AlbNomCli ,
                                           Integer.valueOf(A3393AlbColNum) ,
                                           A3153CodCod ,
                                           A1261BarAlbKgmE ,
                                           A1262BarPreKgm ,
                                           Short.valueOf(A3271AlbHdrAnc) ,
                                           Short.valueOf(A5019AlbHdrgm2) ,
                                           A1263BarAlbMtrE ,
                                           A1264BarPreMtr ,
                                           Integer.valueOf(A1265BarAlbPie) ,
                                           A14057AlbTiras ,
                                           A14058AlbTirasKg ,
                                           A14059AlbSinTest ,
                                           Short.valueOf(A1206TubCod) ,
                                           Integer.valueOf(A1266BarAlbTub) ,
                                           A2441AlbHdrObs ,
                                           Short.valueOf(A6466PlasCod) ,
                                           Short.valueOf(A6467BarAlbPlas) ,
                                           Short.valueOf(A5051TipAcaCod) ,
                                           Short.valueOf(AV12OrderedBy) ,
                                           Boolean.valueOf(AV13OrderedDsc) ,
                                           AV100Albaranes_albaranguia__wwds_1_filterfulltext ,
                                           A14056AlbColorCv ,
                                           AV110Albaranes_albaranguia__wwds_11_tfalbcolorcv_sel ,
                                           AV109Albaranes_albaranguia__wwds_10_tfalbcolorcv ,
                                           A396EmprCod ,
                                           Long.valueOf(A30AlbProCod) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.LONG
                                           }
      });
      lV105Albaranes_albaranguia__wwds_6_tfbarcodpar = GXutil.padr( GXutil.rtrim( AV105Albaranes_albaranguia__wwds_6_tfbarcodpar), 1, "%") ;
      lV107Albaranes_albaranguia__wwds_8_tfalbser = GXutil.padr( GXutil.rtrim( AV107Albaranes_albaranguia__wwds_8_tfalbser), 16, "%") ;
      lV111Albaranes_albaranguia__wwds_12_tfalbnomcli = GXutil.padr( GXutil.rtrim( AV111Albaranes_albaranguia__wwds_12_tfalbnomcli), 13, "%") ;
      lV115Albaranes_albaranguia__wwds_16_tfcodcod = GXutil.padr( GXutil.rtrim( AV115Albaranes_albaranguia__wwds_16_tfcodcod), 6, "%") ;
      lV131Albaranes_albaranguia__wwds_32_tfalbtiras = GXutil.padr( GXutil.rtrim( AV131Albaranes_albaranguia__wwds_32_tfalbtiras), 1, "%") ;
      lV135Albaranes_albaranguia__wwds_36_tfalbsintest = GXutil.padr( GXutil.rtrim( AV135Albaranes_albaranguia__wwds_36_tfalbsintest), 1, "%") ;
      lV141Albaranes_albaranguia__wwds_42_tfalbhdrobs = GXutil.padr( GXutil.rtrim( AV141Albaranes_albaranguia__wwds_42_tfalbhdrobs), 60, "%") ;
      /* Using cursor H01XC2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(AV101Albaranes_albaranguia__wwds_2_tfbarcod), Integer.valueOf(AV102Albaranes_albaranguia__wwds_3_tfbarcod_to), Byte.valueOf(AV103Albaranes_albaranguia__wwds_4_tfbarcodreo), Byte.valueOf(AV104Albaranes_albaranguia__wwds_5_tfbarcodreo_to), lV105Albaranes_albaranguia__wwds_6_tfbarcodpar, AV106Albaranes_albaranguia__wwds_7_tfbarcodpar_sel, lV107Albaranes_albaranguia__wwds_8_tfalbser, AV108Albaranes_albaranguia__wwds_9_tfalbser_sel, lV111Albaranes_albaranguia__wwds_12_tfalbnomcli, AV112Albaranes_albaranguia__wwds_13_tfalbnomcli_sel, Integer.valueOf(AV113Albaranes_albaranguia__wwds_14_tfalbcolnum), Integer.valueOf(AV114Albaranes_albaranguia__wwds_15_tfalbcolnum_to), lV115Albaranes_albaranguia__wwds_16_tfcodcod, AV116Albaranes_albaranguia__wwds_17_tfcodcod_sel, AV117Albaranes_albaranguia__wwds_18_tfbaralbkgme, AV118Albaranes_albaranguia__wwds_19_tfbaralbkgme_to, AV119Albaranes_albaranguia__wwds_20_tfbarprekgm, AV120Albaranes_albaranguia__wwds_21_tfbarprekgm_to, Short.valueOf(AV121Albaranes_albaranguia__wwds_22_tfalbhdranc), Short.valueOf(AV122Albaranes_albaranguia__wwds_23_tfalbhdranc_to), Short.valueOf(AV123Albaranes_albaranguia__wwds_24_tfalbhdrgm2), Short.valueOf(AV124Albaranes_albaranguia__wwds_25_tfalbhdrgm2_to), AV125Albaranes_albaranguia__wwds_26_tfbaralbmtre, AV126Albaranes_albaranguia__wwds_27_tfbaralbmtre_to, AV127Albaranes_albaranguia__wwds_28_tfbarpremtr, AV128Albaranes_albaranguia__wwds_29_tfbarpremtr_to, Integer.valueOf(AV129Albaranes_albaranguia__wwds_30_tfbaralbpie), Integer.valueOf(AV130Albaranes_albaranguia__wwds_31_tfbaralbpie_to), lV131Albaranes_albaranguia__wwds_32_tfalbtiras, AV132Albaranes_albaranguia__wwds_33_tfalbtiras_sel, AV133Albaranes_albaranguia__wwds_34_tfalbtiraskg, AV134Albaranes_albaranguia__wwds_35_tfalbtiraskg_to, lV135Albaranes_albaranguia__wwds_36_tfalbsintest, AV136Albaranes_albaranguia__wwds_37_tfalbsintest_sel, Short.valueOf(AV137Albaranes_albaranguia__wwds_38_tftubcod), Short.valueOf(AV138Albaranes_albaranguia__wwds_39_tftubcod_to), Integer.valueOf(AV139Albaranes_albaranguia__wwds_40_tfbaralbtub), Integer.valueOf(AV140Albaranes_albaranguia__wwds_41_tfbaralbtub_to), lV141Albaranes_albaranguia__wwds_42_tfalbhdrobs, AV142Albaranes_albaranguia__wwds_43_tfalbhdrobs_sel, Short.valueOf(AV143Albaranes_albaranguia__wwds_44_tfplascod), Short.valueOf(AV144Albaranes_albaranguia__wwds_45_tfplascod_to), Short.valueOf(AV145Albaranes_albaranguia__wwds_46_tfbaralbplas), Short.valueOf(AV146Albaranes_albaranguia__wwds_47_tfbaralbplas_to), Short.valueOf(AV147Albaranes_albaranguia__wwds_48_tftipacacod), Short.valueOf(AV148Albaranes_albaranguia__wwds_49_tftipacacod_to)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A2839AlbProVal = H01XC2_A2839AlbProVal[0] ;
         A5051TipAcaCod = H01XC2_A5051TipAcaCod[0] ;
         A6467BarAlbPlas = H01XC2_A6467BarAlbPlas[0] ;
         A6466PlasCod = H01XC2_A6466PlasCod[0] ;
         n6466PlasCod = H01XC2_n6466PlasCod[0] ;
         A2441AlbHdrObs = H01XC2_A2441AlbHdrObs[0] ;
         A1266BarAlbTub = H01XC2_A1266BarAlbTub[0] ;
         A1206TubCod = H01XC2_A1206TubCod[0] ;
         n1206TubCod = H01XC2_n1206TubCod[0] ;
         A14059AlbSinTest = H01XC2_A14059AlbSinTest[0] ;
         A14058AlbTirasKg = H01XC2_A14058AlbTirasKg[0] ;
         A14057AlbTiras = H01XC2_A14057AlbTiras[0] ;
         A1265BarAlbPie = H01XC2_A1265BarAlbPie[0] ;
         A1264BarPreMtr = H01XC2_A1264BarPreMtr[0] ;
         A1263BarAlbMtrE = H01XC2_A1263BarAlbMtrE[0] ;
         A5019AlbHdrgm2 = H01XC2_A5019AlbHdrgm2[0] ;
         A3271AlbHdrAnc = H01XC2_A3271AlbHdrAnc[0] ;
         A1262BarPreKgm = H01XC2_A1262BarPreKgm[0] ;
         A1261BarAlbKgmE = H01XC2_A1261BarAlbKgmE[0] ;
         A3153CodCod = H01XC2_A3153CodCod[0] ;
         n3153CodCod = H01XC2_n3153CodCod[0] ;
         A3393AlbColNum = H01XC2_A3393AlbColNum[0] ;
         A12232AlbNomCli = H01XC2_A12232AlbNomCli[0] ;
         A12234AlbTipArt = H01XC2_A12234AlbTipArt[0] ;
         A3391AlbSer = H01XC2_A3391AlbSer[0] ;
         A130BarCodPar = H01XC2_A130BarCodPar[0] ;
         A132BarCodReo = H01XC2_A132BarCodReo[0] ;
         A129BarCod = H01XC2_A129BarCod[0] ;
         GXt_char1 = A14056AlbColorCv ;
         GXv_char2[0] = A396EmprCod ;
         GXv_int3[0] = A129BarCod ;
         GXv_int4[0] = A132BarCodReo ;
         GXv_char5[0] = A130BarCodPar ;
         GXv_char6[0] = GXt_char1 ;
         new app.pnortt(remoteHandle, context).execute( GXv_char2, GXv_int3, GXv_int4, GXv_char5, GXv_char6) ;
         albaranguia__ww_impl.this.A396EmprCod = GXv_char2[0] ;
         albaranguia__ww_impl.this.A129BarCod = GXv_int3[0] ;
         albaranguia__ww_impl.this.A132BarCodReo = GXv_int4[0] ;
         albaranguia__ww_impl.this.A130BarCodPar = GXv_char5[0] ;
         albaranguia__ww_impl.this.GXt_char1 = GXv_char6[0] ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
         A14056AlbColorCv = GXt_char1 ;
         if ( (GXutil.strcmp("", AV100Albaranes_albaranguia__wwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A129BarCod, 8, 0) , GXutil.padr( "%" + AV100Albaranes_albaranguia__wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A132BarCodReo, 1, 0) , GXutil.padr( "%" + AV100Albaranes_albaranguia__wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A130BarCodPar) , GXutil.padr( "%" + GXutil.upper( AV100Albaranes_albaranguia__wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A3391AlbSer) , GXutil.padr( "%" + GXutil.upper( AV100Albaranes_albaranguia__wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A14056AlbColorCv) , GXutil.padr( "%" + GXutil.upper( AV100Albaranes_albaranguia__wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A12232AlbNomCli) , GXutil.padr( "%" + GXutil.upper( AV100Albaranes_albaranguia__wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A3393AlbColNum, 6, 0) , GXutil.padr( "%" + AV100Albaranes_albaranguia__wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A3153CodCod) , GXutil.padr( "%" + GXutil.upper( AV100Albaranes_albaranguia__wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1261BarAlbKgmE, 9, 2) , GXutil.padr( "%" + AV100Albaranes_albaranguia__wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1262BarPreKgm, 13, 5) , GXutil.padr( "%" + AV100Albaranes_albaranguia__wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A3271AlbHdrAnc, 4, 0) , GXutil.padr( "%" + AV100Albaranes_albaranguia__wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A5019AlbHdrgm2, 4, 0) , GXutil.padr( "%" + AV100Albaranes_albaranguia__wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1263BarAlbMtrE, 9, 2) , GXutil.padr( "%" + AV100Albaranes_albaranguia__wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1264BarPreMtr, 13, 5) , GXutil.padr( "%" + AV100Albaranes_albaranguia__wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1265BarAlbPie, 6, 0) , GXutil.padr( "%" + AV100Albaranes_albaranguia__wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A14057AlbTiras) , GXutil.padr( "%" + GXutil.upper( AV100Albaranes_albaranguia__wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A14058AlbTirasKg, 9, 2) , GXutil.padr( "%" + AV100Albaranes_albaranguia__wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A14059AlbSinTest) , GXutil.padr( "%" + GXutil.upper( AV100Albaranes_albaranguia__wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1206TubCod, 4, 0) , GXutil.padr( "%" + AV100Albaranes_albaranguia__wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1266BarAlbTub, 6, 0) , GXutil.padr( "%" + AV100Albaranes_albaranguia__wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A2441AlbHdrObs) , GXutil.padr( "%" + GXutil.upper( AV100Albaranes_albaranguia__wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A6466PlasCod, 4, 0) , GXutil.padr( "%" + AV100Albaranes_albaranguia__wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A6467BarAlbPlas, 4, 0) , GXutil.padr( "%" + AV100Albaranes_albaranguia__wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A5051TipAcaCod, 4, 0) , GXutil.padr( "%" + AV100Albaranes_albaranguia__wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( "si", "") , GXutil.padr( "%" + GXutil.lower( AV100Albaranes_albaranguia__wwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A2839AlbProVal, "S") == 0 ) ) || ( GXutil.like( httpContext.getMessage( "no", "") , GXutil.padr( "%" + GXutil.lower( AV100Albaranes_albaranguia__wwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A2839AlbProVal, "N") == 0 ) ) ) )
         {
            if ( ! ( (GXutil.strcmp("", AV110Albaranes_albaranguia__wwds_11_tfalbcolorcv_sel)==0) && ( ! (GXutil.strcmp("", AV109Albaranes_albaranguia__wwds_10_tfalbcolorcv)==0) ) ) || ( GXutil.like( GXutil.upper( A14056AlbColorCv) , GXutil.padr( "%" + GXutil.upper( AV109Albaranes_albaranguia__wwds_10_tfalbcolorcv) , 255 , "%"),  ' ' ) ) )
            {
               if ( (GXutil.strcmp("", AV110Albaranes_albaranguia__wwds_11_tfalbcolorcv_sel)==0) || ( ( GXutil.strcmp(A14056AlbColorCv, AV110Albaranes_albaranguia__wwds_11_tfalbcolorcv_sel) == 0 ) ) )
               {
                  GRID_nRecordCount = (long)(GRID_nRecordCount+1) ;
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

   public void rf1XC2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(69) ;
      /* Execute user event: Refresh */
      e181XC2 ();
      nGXsfl_69_idx = 1 ;
      sGXsfl_69_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_69_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_692( ) ;
      bGXsfl_69_Refreshing = true ;
      GridContainer.AddObjectProperty("GridName", "Grid");
      GridContainer.AddObjectProperty("CmpContext", sPrefix);
      GridContainer.AddObjectProperty("InMasterPage", "false");
      GridContainer.AddObjectProperty("Class", "GridWithPaginationBar GridNoBorder WorkWith");
      GridContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("Sortable", GXutil.ltrim( localUtil.ntoc( subGrid_Sortable, (byte)(1), (byte)(0), ".", "")));
      GridContainer.setPageSize( subgrid_fnc_recordsperpage( ) );
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         if ( 1 != 0 )
         {
            if ( GXutil.len( WebComp_Grid_dwc_Component) != 0 )
            {
               WebComp_Grid_dwc.componentstart();
            }
         }
      }
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         subsflControlProps_692( ) ;
         pr_default.dynParam(1, new Object[]{ new Object[]{
                                              A2839AlbProVal ,
                                              AV149Albaranes_albaranguia__wwds_50_tfalbproval_sels ,
                                              Integer.valueOf(AV101Albaranes_albaranguia__wwds_2_tfbarcod) ,
                                              Integer.valueOf(AV102Albaranes_albaranguia__wwds_3_tfbarcod_to) ,
                                              Byte.valueOf(AV103Albaranes_albaranguia__wwds_4_tfbarcodreo) ,
                                              Byte.valueOf(AV104Albaranes_albaranguia__wwds_5_tfbarcodreo_to) ,
                                              AV106Albaranes_albaranguia__wwds_7_tfbarcodpar_sel ,
                                              AV105Albaranes_albaranguia__wwds_6_tfbarcodpar ,
                                              AV108Albaranes_albaranguia__wwds_9_tfalbser_sel ,
                                              AV107Albaranes_albaranguia__wwds_8_tfalbser ,
                                              AV112Albaranes_albaranguia__wwds_13_tfalbnomcli_sel ,
                                              AV111Albaranes_albaranguia__wwds_12_tfalbnomcli ,
                                              Integer.valueOf(AV113Albaranes_albaranguia__wwds_14_tfalbcolnum) ,
                                              Integer.valueOf(AV114Albaranes_albaranguia__wwds_15_tfalbcolnum_to) ,
                                              AV116Albaranes_albaranguia__wwds_17_tfcodcod_sel ,
                                              AV115Albaranes_albaranguia__wwds_16_tfcodcod ,
                                              AV117Albaranes_albaranguia__wwds_18_tfbaralbkgme ,
                                              AV118Albaranes_albaranguia__wwds_19_tfbaralbkgme_to ,
                                              AV119Albaranes_albaranguia__wwds_20_tfbarprekgm ,
                                              AV120Albaranes_albaranguia__wwds_21_tfbarprekgm_to ,
                                              Short.valueOf(AV121Albaranes_albaranguia__wwds_22_tfalbhdranc) ,
                                              Short.valueOf(AV122Albaranes_albaranguia__wwds_23_tfalbhdranc_to) ,
                                              Short.valueOf(AV123Albaranes_albaranguia__wwds_24_tfalbhdrgm2) ,
                                              Short.valueOf(AV124Albaranes_albaranguia__wwds_25_tfalbhdrgm2_to) ,
                                              AV125Albaranes_albaranguia__wwds_26_tfbaralbmtre ,
                                              AV126Albaranes_albaranguia__wwds_27_tfbaralbmtre_to ,
                                              AV127Albaranes_albaranguia__wwds_28_tfbarpremtr ,
                                              AV128Albaranes_albaranguia__wwds_29_tfbarpremtr_to ,
                                              Integer.valueOf(AV129Albaranes_albaranguia__wwds_30_tfbaralbpie) ,
                                              Integer.valueOf(AV130Albaranes_albaranguia__wwds_31_tfbaralbpie_to) ,
                                              AV132Albaranes_albaranguia__wwds_33_tfalbtiras_sel ,
                                              AV131Albaranes_albaranguia__wwds_32_tfalbtiras ,
                                              AV133Albaranes_albaranguia__wwds_34_tfalbtiraskg ,
                                              AV134Albaranes_albaranguia__wwds_35_tfalbtiraskg_to ,
                                              AV136Albaranes_albaranguia__wwds_37_tfalbsintest_sel ,
                                              AV135Albaranes_albaranguia__wwds_36_tfalbsintest ,
                                              Short.valueOf(AV137Albaranes_albaranguia__wwds_38_tftubcod) ,
                                              Short.valueOf(AV138Albaranes_albaranguia__wwds_39_tftubcod_to) ,
                                              Integer.valueOf(AV139Albaranes_albaranguia__wwds_40_tfbaralbtub) ,
                                              Integer.valueOf(AV140Albaranes_albaranguia__wwds_41_tfbaralbtub_to) ,
                                              AV142Albaranes_albaranguia__wwds_43_tfalbhdrobs_sel ,
                                              AV141Albaranes_albaranguia__wwds_42_tfalbhdrobs ,
                                              Short.valueOf(AV143Albaranes_albaranguia__wwds_44_tfplascod) ,
                                              Short.valueOf(AV144Albaranes_albaranguia__wwds_45_tfplascod_to) ,
                                              Short.valueOf(AV145Albaranes_albaranguia__wwds_46_tfbaralbplas) ,
                                              Short.valueOf(AV146Albaranes_albaranguia__wwds_47_tfbaralbplas_to) ,
                                              Short.valueOf(AV147Albaranes_albaranguia__wwds_48_tftipacacod) ,
                                              Short.valueOf(AV148Albaranes_albaranguia__wwds_49_tftipacacod_to) ,
                                              Integer.valueOf(AV149Albaranes_albaranguia__wwds_50_tfalbproval_sels.size()) ,
                                              Integer.valueOf(A129BarCod) ,
                                              Byte.valueOf(A132BarCodReo) ,
                                              A130BarCodPar ,
                                              A3391AlbSer ,
                                              A12232AlbNomCli ,
                                              Integer.valueOf(A3393AlbColNum) ,
                                              A3153CodCod ,
                                              A1261BarAlbKgmE ,
                                              A1262BarPreKgm ,
                                              Short.valueOf(A3271AlbHdrAnc) ,
                                              Short.valueOf(A5019AlbHdrgm2) ,
                                              A1263BarAlbMtrE ,
                                              A1264BarPreMtr ,
                                              Integer.valueOf(A1265BarAlbPie) ,
                                              A14057AlbTiras ,
                                              A14058AlbTirasKg ,
                                              A14059AlbSinTest ,
                                              Short.valueOf(A1206TubCod) ,
                                              Integer.valueOf(A1266BarAlbTub) ,
                                              A2441AlbHdrObs ,
                                              Short.valueOf(A6466PlasCod) ,
                                              Short.valueOf(A6467BarAlbPlas) ,
                                              Short.valueOf(A5051TipAcaCod) ,
                                              Short.valueOf(AV12OrderedBy) ,
                                              Boolean.valueOf(AV13OrderedDsc) ,
                                              AV100Albaranes_albaranguia__wwds_1_filterfulltext ,
                                              A14056AlbColorCv ,
                                              AV110Albaranes_albaranguia__wwds_11_tfalbcolorcv_sel ,
                                              AV109Albaranes_albaranguia__wwds_10_tfalbcolorcv ,
                                              A396EmprCod ,
                                              Long.valueOf(A30AlbProCod) } ,
                                              new int[]{
                                              TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT,
                                              TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT,
                                              TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.STRING,
                                              TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.LONG
                                              }
         });
         lV105Albaranes_albaranguia__wwds_6_tfbarcodpar = GXutil.padr( GXutil.rtrim( AV105Albaranes_albaranguia__wwds_6_tfbarcodpar), 1, "%") ;
         lV107Albaranes_albaranguia__wwds_8_tfalbser = GXutil.padr( GXutil.rtrim( AV107Albaranes_albaranguia__wwds_8_tfalbser), 16, "%") ;
         lV111Albaranes_albaranguia__wwds_12_tfalbnomcli = GXutil.padr( GXutil.rtrim( AV111Albaranes_albaranguia__wwds_12_tfalbnomcli), 13, "%") ;
         lV115Albaranes_albaranguia__wwds_16_tfcodcod = GXutil.padr( GXutil.rtrim( AV115Albaranes_albaranguia__wwds_16_tfcodcod), 6, "%") ;
         lV131Albaranes_albaranguia__wwds_32_tfalbtiras = GXutil.padr( GXutil.rtrim( AV131Albaranes_albaranguia__wwds_32_tfalbtiras), 1, "%") ;
         lV135Albaranes_albaranguia__wwds_36_tfalbsintest = GXutil.padr( GXutil.rtrim( AV135Albaranes_albaranguia__wwds_36_tfalbsintest), 1, "%") ;
         lV141Albaranes_albaranguia__wwds_42_tfalbhdrobs = GXutil.padr( GXutil.rtrim( AV141Albaranes_albaranguia__wwds_42_tfalbhdrobs), 60, "%") ;
         /* Using cursor H01XC3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(AV101Albaranes_albaranguia__wwds_2_tfbarcod), Integer.valueOf(AV102Albaranes_albaranguia__wwds_3_tfbarcod_to), Byte.valueOf(AV103Albaranes_albaranguia__wwds_4_tfbarcodreo), Byte.valueOf(AV104Albaranes_albaranguia__wwds_5_tfbarcodreo_to), lV105Albaranes_albaranguia__wwds_6_tfbarcodpar, AV106Albaranes_albaranguia__wwds_7_tfbarcodpar_sel, lV107Albaranes_albaranguia__wwds_8_tfalbser, AV108Albaranes_albaranguia__wwds_9_tfalbser_sel, lV111Albaranes_albaranguia__wwds_12_tfalbnomcli, AV112Albaranes_albaranguia__wwds_13_tfalbnomcli_sel, Integer.valueOf(AV113Albaranes_albaranguia__wwds_14_tfalbcolnum), Integer.valueOf(AV114Albaranes_albaranguia__wwds_15_tfalbcolnum_to), lV115Albaranes_albaranguia__wwds_16_tfcodcod, AV116Albaranes_albaranguia__wwds_17_tfcodcod_sel, AV117Albaranes_albaranguia__wwds_18_tfbaralbkgme, AV118Albaranes_albaranguia__wwds_19_tfbaralbkgme_to, AV119Albaranes_albaranguia__wwds_20_tfbarprekgm, AV120Albaranes_albaranguia__wwds_21_tfbarprekgm_to, Short.valueOf(AV121Albaranes_albaranguia__wwds_22_tfalbhdranc), Short.valueOf(AV122Albaranes_albaranguia__wwds_23_tfalbhdranc_to), Short.valueOf(AV123Albaranes_albaranguia__wwds_24_tfalbhdrgm2), Short.valueOf(AV124Albaranes_albaranguia__wwds_25_tfalbhdrgm2_to), AV125Albaranes_albaranguia__wwds_26_tfbaralbmtre, AV126Albaranes_albaranguia__wwds_27_tfbaralbmtre_to, AV127Albaranes_albaranguia__wwds_28_tfbarpremtr, AV128Albaranes_albaranguia__wwds_29_tfbarpremtr_to, Integer.valueOf(AV129Albaranes_albaranguia__wwds_30_tfbaralbpie), Integer.valueOf(AV130Albaranes_albaranguia__wwds_31_tfbaralbpie_to), lV131Albaranes_albaranguia__wwds_32_tfalbtiras, AV132Albaranes_albaranguia__wwds_33_tfalbtiras_sel, AV133Albaranes_albaranguia__wwds_34_tfalbtiraskg, AV134Albaranes_albaranguia__wwds_35_tfalbtiraskg_to, lV135Albaranes_albaranguia__wwds_36_tfalbsintest, AV136Albaranes_albaranguia__wwds_37_tfalbsintest_sel, Short.valueOf(AV137Albaranes_albaranguia__wwds_38_tftubcod), Short.valueOf(AV138Albaranes_albaranguia__wwds_39_tftubcod_to), Integer.valueOf(AV139Albaranes_albaranguia__wwds_40_tfbaralbtub), Integer.valueOf(AV140Albaranes_albaranguia__wwds_41_tfbaralbtub_to), lV141Albaranes_albaranguia__wwds_42_tfalbhdrobs, AV142Albaranes_albaranguia__wwds_43_tfalbhdrobs_sel, Short.valueOf(AV143Albaranes_albaranguia__wwds_44_tfplascod), Short.valueOf(AV144Albaranes_albaranguia__wwds_45_tfplascod_to), Short.valueOf(AV145Albaranes_albaranguia__wwds_46_tfbaralbplas), Short.valueOf(AV146Albaranes_albaranguia__wwds_47_tfbaralbplas_to), Short.valueOf(AV147Albaranes_albaranguia__wwds_48_tftipacacod), Short.valueOf(AV148Albaranes_albaranguia__wwds_49_tftipacacod_to)});
         nGXsfl_69_idx = 1 ;
         sGXsfl_69_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_69_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_692( ) ;
         GRID_nEOF = (byte)(0) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         while ( ( (pr_default.getStatus(1) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A2839AlbProVal = H01XC3_A2839AlbProVal[0] ;
            A5051TipAcaCod = H01XC3_A5051TipAcaCod[0] ;
            A6467BarAlbPlas = H01XC3_A6467BarAlbPlas[0] ;
            A6466PlasCod = H01XC3_A6466PlasCod[0] ;
            n6466PlasCod = H01XC3_n6466PlasCod[0] ;
            A2441AlbHdrObs = H01XC3_A2441AlbHdrObs[0] ;
            A1266BarAlbTub = H01XC3_A1266BarAlbTub[0] ;
            A1206TubCod = H01XC3_A1206TubCod[0] ;
            n1206TubCod = H01XC3_n1206TubCod[0] ;
            A14059AlbSinTest = H01XC3_A14059AlbSinTest[0] ;
            A14058AlbTirasKg = H01XC3_A14058AlbTirasKg[0] ;
            A14057AlbTiras = H01XC3_A14057AlbTiras[0] ;
            A1265BarAlbPie = H01XC3_A1265BarAlbPie[0] ;
            A1264BarPreMtr = H01XC3_A1264BarPreMtr[0] ;
            A1263BarAlbMtrE = H01XC3_A1263BarAlbMtrE[0] ;
            A5019AlbHdrgm2 = H01XC3_A5019AlbHdrgm2[0] ;
            A3271AlbHdrAnc = H01XC3_A3271AlbHdrAnc[0] ;
            A1262BarPreKgm = H01XC3_A1262BarPreKgm[0] ;
            A1261BarAlbKgmE = H01XC3_A1261BarAlbKgmE[0] ;
            A3153CodCod = H01XC3_A3153CodCod[0] ;
            n3153CodCod = H01XC3_n3153CodCod[0] ;
            A3393AlbColNum = H01XC3_A3393AlbColNum[0] ;
            A12232AlbNomCli = H01XC3_A12232AlbNomCli[0] ;
            A12234AlbTipArt = H01XC3_A12234AlbTipArt[0] ;
            A3391AlbSer = H01XC3_A3391AlbSer[0] ;
            A130BarCodPar = H01XC3_A130BarCodPar[0] ;
            A132BarCodReo = H01XC3_A132BarCodReo[0] ;
            A129BarCod = H01XC3_A129BarCod[0] ;
            GXt_char1 = A14056AlbColorCv ;
            GXv_char6[0] = A396EmprCod ;
            GXv_int3[0] = A129BarCod ;
            GXv_int4[0] = A132BarCodReo ;
            GXv_char5[0] = A130BarCodPar ;
            GXv_char2[0] = GXt_char1 ;
            new app.pnortt(remoteHandle, context).execute( GXv_char6, GXv_int3, GXv_int4, GXv_char5, GXv_char2) ;
            albaranguia__ww_impl.this.A396EmprCod = GXv_char6[0] ;
            albaranguia__ww_impl.this.A129BarCod = GXv_int3[0] ;
            albaranguia__ww_impl.this.A132BarCodReo = GXv_int4[0] ;
            albaranguia__ww_impl.this.A130BarCodPar = GXv_char5[0] ;
            albaranguia__ww_impl.this.GXt_char1 = GXv_char2[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
            A14056AlbColorCv = GXt_char1 ;
            if ( (GXutil.strcmp("", AV100Albaranes_albaranguia__wwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A129BarCod, 8, 0) , GXutil.padr( "%" + AV100Albaranes_albaranguia__wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A132BarCodReo, 1, 0) , GXutil.padr( "%" + AV100Albaranes_albaranguia__wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A130BarCodPar) , GXutil.padr( "%" + GXutil.upper( AV100Albaranes_albaranguia__wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A3391AlbSer) , GXutil.padr( "%" + GXutil.upper( AV100Albaranes_albaranguia__wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A14056AlbColorCv) , GXutil.padr( "%" + GXutil.upper( AV100Albaranes_albaranguia__wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A12232AlbNomCli) , GXutil.padr( "%" + GXutil.upper( AV100Albaranes_albaranguia__wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A3393AlbColNum, 6, 0) , GXutil.padr( "%" + AV100Albaranes_albaranguia__wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A3153CodCod) , GXutil.padr( "%" + GXutil.upper( AV100Albaranes_albaranguia__wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1261BarAlbKgmE, 9, 2) , GXutil.padr( "%" + AV100Albaranes_albaranguia__wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1262BarPreKgm, 13, 5) , GXutil.padr( "%" + AV100Albaranes_albaranguia__wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A3271AlbHdrAnc, 4, 0) , GXutil.padr( "%" + AV100Albaranes_albaranguia__wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A5019AlbHdrgm2, 4, 0) , GXutil.padr( "%" + AV100Albaranes_albaranguia__wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1263BarAlbMtrE, 9, 2) , GXutil.padr( "%" + AV100Albaranes_albaranguia__wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1264BarPreMtr, 13, 5) , GXutil.padr( "%" + AV100Albaranes_albaranguia__wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1265BarAlbPie, 6, 0) , GXutil.padr( "%" + AV100Albaranes_albaranguia__wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A14057AlbTiras) , GXutil.padr( "%" + GXutil.upper( AV100Albaranes_albaranguia__wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A14058AlbTirasKg, 9, 2) , GXutil.padr( "%" + AV100Albaranes_albaranguia__wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A14059AlbSinTest) , GXutil.padr( "%" + GXutil.upper( AV100Albaranes_albaranguia__wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1206TubCod, 4, 0) , GXutil.padr( "%" + AV100Albaranes_albaranguia__wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1266BarAlbTub, 6, 0) , GXutil.padr( "%" + AV100Albaranes_albaranguia__wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A2441AlbHdrObs) , GXutil.padr( "%" + GXutil.upper( AV100Albaranes_albaranguia__wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A6466PlasCod, 4, 0) , GXutil.padr( "%" + AV100Albaranes_albaranguia__wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A6467BarAlbPlas, 4, 0) , GXutil.padr( "%" + AV100Albaranes_albaranguia__wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A5051TipAcaCod, 4, 0) , GXutil.padr( "%" + AV100Albaranes_albaranguia__wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( "si", "") , GXutil.padr( "%" + GXutil.lower( AV100Albaranes_albaranguia__wwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A2839AlbProVal, "S") == 0 ) ) || ( GXutil.like( httpContext.getMessage( "no", "") , GXutil.padr( "%" + GXutil.lower( AV100Albaranes_albaranguia__wwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A2839AlbProVal, "N") == 0 ) ) ) )
            {
               if ( ! ( (GXutil.strcmp("", AV110Albaranes_albaranguia__wwds_11_tfalbcolorcv_sel)==0) && ( ! (GXutil.strcmp("", AV109Albaranes_albaranguia__wwds_10_tfalbcolorcv)==0) ) ) || ( GXutil.like( GXutil.upper( A14056AlbColorCv) , GXutil.padr( "%" + GXutil.upper( AV109Albaranes_albaranguia__wwds_10_tfalbcolorcv) , 255 , "%"),  ' ' ) ) )
               {
                  if ( (GXutil.strcmp("", AV110Albaranes_albaranguia__wwds_11_tfalbcolorcv_sel)==0) || ( ( GXutil.strcmp(A14056AlbColorCv, AV110Albaranes_albaranguia__wwds_11_tfalbcolorcv_sel) == 0 ) ) )
                  {
                     e191XC2 ();
                  }
               }
            }
            pr_default.readNext(1);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(1) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(1);
         wbEnd = (short)(69) ;
         wb1XC0( ) ;
      }
      bGXsfl_69_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes1XC2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vARTEMALHA", GXutil.ltrim( localUtil.ntoc( AV89Artemalha, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vARTEMALHA", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV89Artemalha), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vF_CARVEMA", GXutil.ltrim( localUtil.ntoc( AV90F_carvema, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vF_CARVEMA", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV90F_carvema), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vSIPLASTICOS", GXutil.ltrim( localUtil.ntoc( AV91Siplasticos, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vSIPLASTICOS", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV91Siplasticos), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vENDUTEX", GXutil.ltrim( localUtil.ntoc( AV92Endutex, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vENDUTEX", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV92Endutex), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_BARCOD"+"_"+sGXsfl_69_idx, getSecureSignedToken( sPrefix+sGXsfl_69_idx, localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_BARCODREO"+"_"+sGXsfl_69_idx, getSecureSignedToken( sPrefix+sGXsfl_69_idx, localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_BARCODPAR"+"_"+sGXsfl_69_idx, getSecureSignedToken( sPrefix+sGXsfl_69_idx, GXutil.rtrim( localUtil.format( A130BarCodPar, ""))));
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
      AV100Albaranes_albaranguia__wwds_1_filterfulltext = AV15FilterFullText ;
      AV101Albaranes_albaranguia__wwds_2_tfbarcod = AV24TFBarCod ;
      AV102Albaranes_albaranguia__wwds_3_tfbarcod_to = AV25TFBarCod_To ;
      AV103Albaranes_albaranguia__wwds_4_tfbarcodreo = AV26TFBarCodReo ;
      AV104Albaranes_albaranguia__wwds_5_tfbarcodreo_to = AV27TFBarCodReo_To ;
      AV105Albaranes_albaranguia__wwds_6_tfbarcodpar = AV28TFBarCodPar ;
      AV106Albaranes_albaranguia__wwds_7_tfbarcodpar_sel = AV29TFBarCodPar_Sel ;
      AV107Albaranes_albaranguia__wwds_8_tfalbser = AV30TFAlbSer ;
      AV108Albaranes_albaranguia__wwds_9_tfalbser_sel = AV31TFAlbSer_Sel ;
      AV109Albaranes_albaranguia__wwds_10_tfalbcolorcv = AV32TFAlbColorCv ;
      AV110Albaranes_albaranguia__wwds_11_tfalbcolorcv_sel = AV33TFAlbColorCv_Sel ;
      AV111Albaranes_albaranguia__wwds_12_tfalbnomcli = AV34TFAlbNomCli ;
      AV112Albaranes_albaranguia__wwds_13_tfalbnomcli_sel = AV35TFAlbNomCli_Sel ;
      AV113Albaranes_albaranguia__wwds_14_tfalbcolnum = AV36TFAlbColNum ;
      AV114Albaranes_albaranguia__wwds_15_tfalbcolnum_to = AV37TFAlbColNum_To ;
      AV115Albaranes_albaranguia__wwds_16_tfcodcod = AV38TFCodCod ;
      AV116Albaranes_albaranguia__wwds_17_tfcodcod_sel = AV39TFCodCod_Sel ;
      AV117Albaranes_albaranguia__wwds_18_tfbaralbkgme = AV40TFBarAlbKgmE ;
      AV118Albaranes_albaranguia__wwds_19_tfbaralbkgme_to = AV41TFBarAlbKgmE_To ;
      AV119Albaranes_albaranguia__wwds_20_tfbarprekgm = AV42TFBarPreKgm ;
      AV120Albaranes_albaranguia__wwds_21_tfbarprekgm_to = AV43TFBarPreKgm_To ;
      AV121Albaranes_albaranguia__wwds_22_tfalbhdranc = AV44TFAlbHdrAnc ;
      AV122Albaranes_albaranguia__wwds_23_tfalbhdranc_to = AV45TFAlbHdrAnc_To ;
      AV123Albaranes_albaranguia__wwds_24_tfalbhdrgm2 = AV46TFAlbHdrgm2 ;
      AV124Albaranes_albaranguia__wwds_25_tfalbhdrgm2_to = AV47TFAlbHdrgm2_To ;
      AV125Albaranes_albaranguia__wwds_26_tfbaralbmtre = AV48TFBarAlbMtrE ;
      AV126Albaranes_albaranguia__wwds_27_tfbaralbmtre_to = AV49TFBarAlbMtrE_To ;
      AV127Albaranes_albaranguia__wwds_28_tfbarpremtr = AV50TFBarPreMtr ;
      AV128Albaranes_albaranguia__wwds_29_tfbarpremtr_to = AV51TFBarPreMtr_To ;
      AV129Albaranes_albaranguia__wwds_30_tfbaralbpie = AV52TFBarAlbPie ;
      AV130Albaranes_albaranguia__wwds_31_tfbaralbpie_to = AV53TFBarAlbPie_To ;
      AV131Albaranes_albaranguia__wwds_32_tfalbtiras = AV54TFAlbTiras ;
      AV132Albaranes_albaranguia__wwds_33_tfalbtiras_sel = AV55TFAlbTiras_Sel ;
      AV133Albaranes_albaranguia__wwds_34_tfalbtiraskg = AV56TFAlbTirasKg ;
      AV134Albaranes_albaranguia__wwds_35_tfalbtiraskg_to = AV57TFAlbTirasKg_To ;
      AV135Albaranes_albaranguia__wwds_36_tfalbsintest = AV58TFAlbSinTest ;
      AV136Albaranes_albaranguia__wwds_37_tfalbsintest_sel = AV59TFAlbSinTest_Sel ;
      AV137Albaranes_albaranguia__wwds_38_tftubcod = AV60TFTubCod ;
      AV138Albaranes_albaranguia__wwds_39_tftubcod_to = AV61TFTubCod_To ;
      AV139Albaranes_albaranguia__wwds_40_tfbaralbtub = AV62TFBarAlbTub ;
      AV140Albaranes_albaranguia__wwds_41_tfbaralbtub_to = AV63TFBarAlbTub_To ;
      AV141Albaranes_albaranguia__wwds_42_tfalbhdrobs = AV64TFAlbHdrObs ;
      AV142Albaranes_albaranguia__wwds_43_tfalbhdrobs_sel = AV65TFAlbHdrObs_Sel ;
      AV143Albaranes_albaranguia__wwds_44_tfplascod = AV66TFPlasCod ;
      AV144Albaranes_albaranguia__wwds_45_tfplascod_to = AV67TFPlasCod_To ;
      AV145Albaranes_albaranguia__wwds_46_tfbaralbplas = AV68TFBarAlbPlas ;
      AV146Albaranes_albaranguia__wwds_47_tfbaralbplas_to = AV69TFBarAlbPlas_To ;
      AV147Albaranes_albaranguia__wwds_48_tftipacacod = AV70TFTipAcaCod ;
      AV148Albaranes_albaranguia__wwds_49_tftipacacod_to = AV71TFTipAcaCod_To ;
      AV149Albaranes_albaranguia__wwds_50_tfalbproval_sels = AV73TFAlbProVal_Sels ;
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, A30AlbProCod, A396EmprCod, AV23ManageFiltersExecutionStep, AV18ColumnsSelector, AV15FilterFullText, AV24TFBarCod, AV25TFBarCod_To, AV26TFBarCodReo, AV27TFBarCodReo_To, AV28TFBarCodPar, AV29TFBarCodPar_Sel, AV30TFAlbSer, AV31TFAlbSer_Sel, AV32TFAlbColorCv, AV33TFAlbColorCv_Sel, AV34TFAlbNomCli, AV35TFAlbNomCli_Sel, AV36TFAlbColNum, AV37TFAlbColNum_To, AV38TFCodCod, AV39TFCodCod_Sel, AV40TFBarAlbKgmE, AV41TFBarAlbKgmE_To, AV42TFBarPreKgm, AV43TFBarPreKgm_To, AV44TFAlbHdrAnc, AV45TFAlbHdrAnc_To, AV46TFAlbHdrgm2, AV47TFAlbHdrgm2_To, AV48TFBarAlbMtrE, AV49TFBarAlbMtrE_To, AV50TFBarPreMtr, AV51TFBarPreMtr_To, AV52TFBarAlbPie, AV53TFBarAlbPie_To, AV54TFAlbTiras, AV55TFAlbTiras_Sel, AV56TFAlbTirasKg, AV57TFAlbTirasKg_To, AV58TFAlbSinTest, AV59TFAlbSinTest_Sel, AV60TFTubCod, AV61TFTubCod_To, AV62TFBarAlbTub, AV63TFBarAlbTub_To, AV64TFAlbHdrObs, AV65TFAlbHdrObs_Sel, AV66TFPlasCod, AV67TFPlasCod_To, AV68TFBarAlbPlas, AV69TFBarAlbPlas_To, AV70TFTipAcaCod, AV71TFTipAcaCod_To, AV73TFAlbProVal_Sels, AV85AccionesEnPopup, AV84VisualizarAcciones, AV95Pgmname, AV12OrderedBy, AV13OrderedDsc, AV89Artemalha, AV90F_carvema, AV91Siplasticos, AV92Endutex, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      AV100Albaranes_albaranguia__wwds_1_filterfulltext = AV15FilterFullText ;
      AV101Albaranes_albaranguia__wwds_2_tfbarcod = AV24TFBarCod ;
      AV102Albaranes_albaranguia__wwds_3_tfbarcod_to = AV25TFBarCod_To ;
      AV103Albaranes_albaranguia__wwds_4_tfbarcodreo = AV26TFBarCodReo ;
      AV104Albaranes_albaranguia__wwds_5_tfbarcodreo_to = AV27TFBarCodReo_To ;
      AV105Albaranes_albaranguia__wwds_6_tfbarcodpar = AV28TFBarCodPar ;
      AV106Albaranes_albaranguia__wwds_7_tfbarcodpar_sel = AV29TFBarCodPar_Sel ;
      AV107Albaranes_albaranguia__wwds_8_tfalbser = AV30TFAlbSer ;
      AV108Albaranes_albaranguia__wwds_9_tfalbser_sel = AV31TFAlbSer_Sel ;
      AV109Albaranes_albaranguia__wwds_10_tfalbcolorcv = AV32TFAlbColorCv ;
      AV110Albaranes_albaranguia__wwds_11_tfalbcolorcv_sel = AV33TFAlbColorCv_Sel ;
      AV111Albaranes_albaranguia__wwds_12_tfalbnomcli = AV34TFAlbNomCli ;
      AV112Albaranes_albaranguia__wwds_13_tfalbnomcli_sel = AV35TFAlbNomCli_Sel ;
      AV113Albaranes_albaranguia__wwds_14_tfalbcolnum = AV36TFAlbColNum ;
      AV114Albaranes_albaranguia__wwds_15_tfalbcolnum_to = AV37TFAlbColNum_To ;
      AV115Albaranes_albaranguia__wwds_16_tfcodcod = AV38TFCodCod ;
      AV116Albaranes_albaranguia__wwds_17_tfcodcod_sel = AV39TFCodCod_Sel ;
      AV117Albaranes_albaranguia__wwds_18_tfbaralbkgme = AV40TFBarAlbKgmE ;
      AV118Albaranes_albaranguia__wwds_19_tfbaralbkgme_to = AV41TFBarAlbKgmE_To ;
      AV119Albaranes_albaranguia__wwds_20_tfbarprekgm = AV42TFBarPreKgm ;
      AV120Albaranes_albaranguia__wwds_21_tfbarprekgm_to = AV43TFBarPreKgm_To ;
      AV121Albaranes_albaranguia__wwds_22_tfalbhdranc = AV44TFAlbHdrAnc ;
      AV122Albaranes_albaranguia__wwds_23_tfalbhdranc_to = AV45TFAlbHdrAnc_To ;
      AV123Albaranes_albaranguia__wwds_24_tfalbhdrgm2 = AV46TFAlbHdrgm2 ;
      AV124Albaranes_albaranguia__wwds_25_tfalbhdrgm2_to = AV47TFAlbHdrgm2_To ;
      AV125Albaranes_albaranguia__wwds_26_tfbaralbmtre = AV48TFBarAlbMtrE ;
      AV126Albaranes_albaranguia__wwds_27_tfbaralbmtre_to = AV49TFBarAlbMtrE_To ;
      AV127Albaranes_albaranguia__wwds_28_tfbarpremtr = AV50TFBarPreMtr ;
      AV128Albaranes_albaranguia__wwds_29_tfbarpremtr_to = AV51TFBarPreMtr_To ;
      AV129Albaranes_albaranguia__wwds_30_tfbaralbpie = AV52TFBarAlbPie ;
      AV130Albaranes_albaranguia__wwds_31_tfbaralbpie_to = AV53TFBarAlbPie_To ;
      AV131Albaranes_albaranguia__wwds_32_tfalbtiras = AV54TFAlbTiras ;
      AV132Albaranes_albaranguia__wwds_33_tfalbtiras_sel = AV55TFAlbTiras_Sel ;
      AV133Albaranes_albaranguia__wwds_34_tfalbtiraskg = AV56TFAlbTirasKg ;
      AV134Albaranes_albaranguia__wwds_35_tfalbtiraskg_to = AV57TFAlbTirasKg_To ;
      AV135Albaranes_albaranguia__wwds_36_tfalbsintest = AV58TFAlbSinTest ;
      AV136Albaranes_albaranguia__wwds_37_tfalbsintest_sel = AV59TFAlbSinTest_Sel ;
      AV137Albaranes_albaranguia__wwds_38_tftubcod = AV60TFTubCod ;
      AV138Albaranes_albaranguia__wwds_39_tftubcod_to = AV61TFTubCod_To ;
      AV139Albaranes_albaranguia__wwds_40_tfbaralbtub = AV62TFBarAlbTub ;
      AV140Albaranes_albaranguia__wwds_41_tfbaralbtub_to = AV63TFBarAlbTub_To ;
      AV141Albaranes_albaranguia__wwds_42_tfalbhdrobs = AV64TFAlbHdrObs ;
      AV142Albaranes_albaranguia__wwds_43_tfalbhdrobs_sel = AV65TFAlbHdrObs_Sel ;
      AV143Albaranes_albaranguia__wwds_44_tfplascod = AV66TFPlasCod ;
      AV144Albaranes_albaranguia__wwds_45_tfplascod_to = AV67TFPlasCod_To ;
      AV145Albaranes_albaranguia__wwds_46_tfbaralbplas = AV68TFBarAlbPlas ;
      AV146Albaranes_albaranguia__wwds_47_tfbaralbplas_to = AV69TFBarAlbPlas_To ;
      AV147Albaranes_albaranguia__wwds_48_tftipacacod = AV70TFTipAcaCod ;
      AV148Albaranes_albaranguia__wwds_49_tftipacacod_to = AV71TFTipAcaCod_To ;
      AV149Albaranes_albaranguia__wwds_50_tfalbproval_sels = AV73TFAlbProVal_Sels ;
      if ( GRID_nEOF == 0 )
      {
         GRID_nFirstRecordOnPage = (long)(GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )) ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("GRID_nFirstRecordOnPage", GRID_nFirstRecordOnPage);
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, A30AlbProCod, A396EmprCod, AV23ManageFiltersExecutionStep, AV18ColumnsSelector, AV15FilterFullText, AV24TFBarCod, AV25TFBarCod_To, AV26TFBarCodReo, AV27TFBarCodReo_To, AV28TFBarCodPar, AV29TFBarCodPar_Sel, AV30TFAlbSer, AV31TFAlbSer_Sel, AV32TFAlbColorCv, AV33TFAlbColorCv_Sel, AV34TFAlbNomCli, AV35TFAlbNomCli_Sel, AV36TFAlbColNum, AV37TFAlbColNum_To, AV38TFCodCod, AV39TFCodCod_Sel, AV40TFBarAlbKgmE, AV41TFBarAlbKgmE_To, AV42TFBarPreKgm, AV43TFBarPreKgm_To, AV44TFAlbHdrAnc, AV45TFAlbHdrAnc_To, AV46TFAlbHdrgm2, AV47TFAlbHdrgm2_To, AV48TFBarAlbMtrE, AV49TFBarAlbMtrE_To, AV50TFBarPreMtr, AV51TFBarPreMtr_To, AV52TFBarAlbPie, AV53TFBarAlbPie_To, AV54TFAlbTiras, AV55TFAlbTiras_Sel, AV56TFAlbTirasKg, AV57TFAlbTirasKg_To, AV58TFAlbSinTest, AV59TFAlbSinTest_Sel, AV60TFTubCod, AV61TFTubCod_To, AV62TFBarAlbTub, AV63TFBarAlbTub_To, AV64TFAlbHdrObs, AV65TFAlbHdrObs_Sel, AV66TFPlasCod, AV67TFPlasCod_To, AV68TFBarAlbPlas, AV69TFBarAlbPlas_To, AV70TFTipAcaCod, AV71TFTipAcaCod_To, AV73TFAlbProVal_Sels, AV85AccionesEnPopup, AV84VisualizarAcciones, AV95Pgmname, AV12OrderedBy, AV13OrderedDsc, AV89Artemalha, AV90F_carvema, AV91Siplasticos, AV92Endutex, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid_previouspage( )
   {
      AV100Albaranes_albaranguia__wwds_1_filterfulltext = AV15FilterFullText ;
      AV101Albaranes_albaranguia__wwds_2_tfbarcod = AV24TFBarCod ;
      AV102Albaranes_albaranguia__wwds_3_tfbarcod_to = AV25TFBarCod_To ;
      AV103Albaranes_albaranguia__wwds_4_tfbarcodreo = AV26TFBarCodReo ;
      AV104Albaranes_albaranguia__wwds_5_tfbarcodreo_to = AV27TFBarCodReo_To ;
      AV105Albaranes_albaranguia__wwds_6_tfbarcodpar = AV28TFBarCodPar ;
      AV106Albaranes_albaranguia__wwds_7_tfbarcodpar_sel = AV29TFBarCodPar_Sel ;
      AV107Albaranes_albaranguia__wwds_8_tfalbser = AV30TFAlbSer ;
      AV108Albaranes_albaranguia__wwds_9_tfalbser_sel = AV31TFAlbSer_Sel ;
      AV109Albaranes_albaranguia__wwds_10_tfalbcolorcv = AV32TFAlbColorCv ;
      AV110Albaranes_albaranguia__wwds_11_tfalbcolorcv_sel = AV33TFAlbColorCv_Sel ;
      AV111Albaranes_albaranguia__wwds_12_tfalbnomcli = AV34TFAlbNomCli ;
      AV112Albaranes_albaranguia__wwds_13_tfalbnomcli_sel = AV35TFAlbNomCli_Sel ;
      AV113Albaranes_albaranguia__wwds_14_tfalbcolnum = AV36TFAlbColNum ;
      AV114Albaranes_albaranguia__wwds_15_tfalbcolnum_to = AV37TFAlbColNum_To ;
      AV115Albaranes_albaranguia__wwds_16_tfcodcod = AV38TFCodCod ;
      AV116Albaranes_albaranguia__wwds_17_tfcodcod_sel = AV39TFCodCod_Sel ;
      AV117Albaranes_albaranguia__wwds_18_tfbaralbkgme = AV40TFBarAlbKgmE ;
      AV118Albaranes_albaranguia__wwds_19_tfbaralbkgme_to = AV41TFBarAlbKgmE_To ;
      AV119Albaranes_albaranguia__wwds_20_tfbarprekgm = AV42TFBarPreKgm ;
      AV120Albaranes_albaranguia__wwds_21_tfbarprekgm_to = AV43TFBarPreKgm_To ;
      AV121Albaranes_albaranguia__wwds_22_tfalbhdranc = AV44TFAlbHdrAnc ;
      AV122Albaranes_albaranguia__wwds_23_tfalbhdranc_to = AV45TFAlbHdrAnc_To ;
      AV123Albaranes_albaranguia__wwds_24_tfalbhdrgm2 = AV46TFAlbHdrgm2 ;
      AV124Albaranes_albaranguia__wwds_25_tfalbhdrgm2_to = AV47TFAlbHdrgm2_To ;
      AV125Albaranes_albaranguia__wwds_26_tfbaralbmtre = AV48TFBarAlbMtrE ;
      AV126Albaranes_albaranguia__wwds_27_tfbaralbmtre_to = AV49TFBarAlbMtrE_To ;
      AV127Albaranes_albaranguia__wwds_28_tfbarpremtr = AV50TFBarPreMtr ;
      AV128Albaranes_albaranguia__wwds_29_tfbarpremtr_to = AV51TFBarPreMtr_To ;
      AV129Albaranes_albaranguia__wwds_30_tfbaralbpie = AV52TFBarAlbPie ;
      AV130Albaranes_albaranguia__wwds_31_tfbaralbpie_to = AV53TFBarAlbPie_To ;
      AV131Albaranes_albaranguia__wwds_32_tfalbtiras = AV54TFAlbTiras ;
      AV132Albaranes_albaranguia__wwds_33_tfalbtiras_sel = AV55TFAlbTiras_Sel ;
      AV133Albaranes_albaranguia__wwds_34_tfalbtiraskg = AV56TFAlbTirasKg ;
      AV134Albaranes_albaranguia__wwds_35_tfalbtiraskg_to = AV57TFAlbTirasKg_To ;
      AV135Albaranes_albaranguia__wwds_36_tfalbsintest = AV58TFAlbSinTest ;
      AV136Albaranes_albaranguia__wwds_37_tfalbsintest_sel = AV59TFAlbSinTest_Sel ;
      AV137Albaranes_albaranguia__wwds_38_tftubcod = AV60TFTubCod ;
      AV138Albaranes_albaranguia__wwds_39_tftubcod_to = AV61TFTubCod_To ;
      AV139Albaranes_albaranguia__wwds_40_tfbaralbtub = AV62TFBarAlbTub ;
      AV140Albaranes_albaranguia__wwds_41_tfbaralbtub_to = AV63TFBarAlbTub_To ;
      AV141Albaranes_albaranguia__wwds_42_tfalbhdrobs = AV64TFAlbHdrObs ;
      AV142Albaranes_albaranguia__wwds_43_tfalbhdrobs_sel = AV65TFAlbHdrObs_Sel ;
      AV143Albaranes_albaranguia__wwds_44_tfplascod = AV66TFPlasCod ;
      AV144Albaranes_albaranguia__wwds_45_tfplascod_to = AV67TFPlasCod_To ;
      AV145Albaranes_albaranguia__wwds_46_tfbaralbplas = AV68TFBarAlbPlas ;
      AV146Albaranes_albaranguia__wwds_47_tfbaralbplas_to = AV69TFBarAlbPlas_To ;
      AV147Albaranes_albaranguia__wwds_48_tftipacacod = AV70TFTipAcaCod ;
      AV148Albaranes_albaranguia__wwds_49_tftipacacod_to = AV71TFTipAcaCod_To ;
      AV149Albaranes_albaranguia__wwds_50_tfalbproval_sels = AV73TFAlbProVal_Sels ;
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
         gxgrgrid_refresh( subGrid_Rows, A30AlbProCod, A396EmprCod, AV23ManageFiltersExecutionStep, AV18ColumnsSelector, AV15FilterFullText, AV24TFBarCod, AV25TFBarCod_To, AV26TFBarCodReo, AV27TFBarCodReo_To, AV28TFBarCodPar, AV29TFBarCodPar_Sel, AV30TFAlbSer, AV31TFAlbSer_Sel, AV32TFAlbColorCv, AV33TFAlbColorCv_Sel, AV34TFAlbNomCli, AV35TFAlbNomCli_Sel, AV36TFAlbColNum, AV37TFAlbColNum_To, AV38TFCodCod, AV39TFCodCod_Sel, AV40TFBarAlbKgmE, AV41TFBarAlbKgmE_To, AV42TFBarPreKgm, AV43TFBarPreKgm_To, AV44TFAlbHdrAnc, AV45TFAlbHdrAnc_To, AV46TFAlbHdrgm2, AV47TFAlbHdrgm2_To, AV48TFBarAlbMtrE, AV49TFBarAlbMtrE_To, AV50TFBarPreMtr, AV51TFBarPreMtr_To, AV52TFBarAlbPie, AV53TFBarAlbPie_To, AV54TFAlbTiras, AV55TFAlbTiras_Sel, AV56TFAlbTirasKg, AV57TFAlbTirasKg_To, AV58TFAlbSinTest, AV59TFAlbSinTest_Sel, AV60TFTubCod, AV61TFTubCod_To, AV62TFBarAlbTub, AV63TFBarAlbTub_To, AV64TFAlbHdrObs, AV65TFAlbHdrObs_Sel, AV66TFPlasCod, AV67TFPlasCod_To, AV68TFBarAlbPlas, AV69TFBarAlbPlas_To, AV70TFTipAcaCod, AV71TFTipAcaCod_To, AV73TFAlbProVal_Sels, AV85AccionesEnPopup, AV84VisualizarAcciones, AV95Pgmname, AV12OrderedBy, AV13OrderedDsc, AV89Artemalha, AV90F_carvema, AV91Siplasticos, AV92Endutex, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      AV100Albaranes_albaranguia__wwds_1_filterfulltext = AV15FilterFullText ;
      AV101Albaranes_albaranguia__wwds_2_tfbarcod = AV24TFBarCod ;
      AV102Albaranes_albaranguia__wwds_3_tfbarcod_to = AV25TFBarCod_To ;
      AV103Albaranes_albaranguia__wwds_4_tfbarcodreo = AV26TFBarCodReo ;
      AV104Albaranes_albaranguia__wwds_5_tfbarcodreo_to = AV27TFBarCodReo_To ;
      AV105Albaranes_albaranguia__wwds_6_tfbarcodpar = AV28TFBarCodPar ;
      AV106Albaranes_albaranguia__wwds_7_tfbarcodpar_sel = AV29TFBarCodPar_Sel ;
      AV107Albaranes_albaranguia__wwds_8_tfalbser = AV30TFAlbSer ;
      AV108Albaranes_albaranguia__wwds_9_tfalbser_sel = AV31TFAlbSer_Sel ;
      AV109Albaranes_albaranguia__wwds_10_tfalbcolorcv = AV32TFAlbColorCv ;
      AV110Albaranes_albaranguia__wwds_11_tfalbcolorcv_sel = AV33TFAlbColorCv_Sel ;
      AV111Albaranes_albaranguia__wwds_12_tfalbnomcli = AV34TFAlbNomCli ;
      AV112Albaranes_albaranguia__wwds_13_tfalbnomcli_sel = AV35TFAlbNomCli_Sel ;
      AV113Albaranes_albaranguia__wwds_14_tfalbcolnum = AV36TFAlbColNum ;
      AV114Albaranes_albaranguia__wwds_15_tfalbcolnum_to = AV37TFAlbColNum_To ;
      AV115Albaranes_albaranguia__wwds_16_tfcodcod = AV38TFCodCod ;
      AV116Albaranes_albaranguia__wwds_17_tfcodcod_sel = AV39TFCodCod_Sel ;
      AV117Albaranes_albaranguia__wwds_18_tfbaralbkgme = AV40TFBarAlbKgmE ;
      AV118Albaranes_albaranguia__wwds_19_tfbaralbkgme_to = AV41TFBarAlbKgmE_To ;
      AV119Albaranes_albaranguia__wwds_20_tfbarprekgm = AV42TFBarPreKgm ;
      AV120Albaranes_albaranguia__wwds_21_tfbarprekgm_to = AV43TFBarPreKgm_To ;
      AV121Albaranes_albaranguia__wwds_22_tfalbhdranc = AV44TFAlbHdrAnc ;
      AV122Albaranes_albaranguia__wwds_23_tfalbhdranc_to = AV45TFAlbHdrAnc_To ;
      AV123Albaranes_albaranguia__wwds_24_tfalbhdrgm2 = AV46TFAlbHdrgm2 ;
      AV124Albaranes_albaranguia__wwds_25_tfalbhdrgm2_to = AV47TFAlbHdrgm2_To ;
      AV125Albaranes_albaranguia__wwds_26_tfbaralbmtre = AV48TFBarAlbMtrE ;
      AV126Albaranes_albaranguia__wwds_27_tfbaralbmtre_to = AV49TFBarAlbMtrE_To ;
      AV127Albaranes_albaranguia__wwds_28_tfbarpremtr = AV50TFBarPreMtr ;
      AV128Albaranes_albaranguia__wwds_29_tfbarpremtr_to = AV51TFBarPreMtr_To ;
      AV129Albaranes_albaranguia__wwds_30_tfbaralbpie = AV52TFBarAlbPie ;
      AV130Albaranes_albaranguia__wwds_31_tfbaralbpie_to = AV53TFBarAlbPie_To ;
      AV131Albaranes_albaranguia__wwds_32_tfalbtiras = AV54TFAlbTiras ;
      AV132Albaranes_albaranguia__wwds_33_tfalbtiras_sel = AV55TFAlbTiras_Sel ;
      AV133Albaranes_albaranguia__wwds_34_tfalbtiraskg = AV56TFAlbTirasKg ;
      AV134Albaranes_albaranguia__wwds_35_tfalbtiraskg_to = AV57TFAlbTirasKg_To ;
      AV135Albaranes_albaranguia__wwds_36_tfalbsintest = AV58TFAlbSinTest ;
      AV136Albaranes_albaranguia__wwds_37_tfalbsintest_sel = AV59TFAlbSinTest_Sel ;
      AV137Albaranes_albaranguia__wwds_38_tftubcod = AV60TFTubCod ;
      AV138Albaranes_albaranguia__wwds_39_tftubcod_to = AV61TFTubCod_To ;
      AV139Albaranes_albaranguia__wwds_40_tfbaralbtub = AV62TFBarAlbTub ;
      AV140Albaranes_albaranguia__wwds_41_tfbaralbtub_to = AV63TFBarAlbTub_To ;
      AV141Albaranes_albaranguia__wwds_42_tfalbhdrobs = AV64TFAlbHdrObs ;
      AV142Albaranes_albaranguia__wwds_43_tfalbhdrobs_sel = AV65TFAlbHdrObs_Sel ;
      AV143Albaranes_albaranguia__wwds_44_tfplascod = AV66TFPlasCod ;
      AV144Albaranes_albaranguia__wwds_45_tfplascod_to = AV67TFPlasCod_To ;
      AV145Albaranes_albaranguia__wwds_46_tfbaralbplas = AV68TFBarAlbPlas ;
      AV146Albaranes_albaranguia__wwds_47_tfbaralbplas_to = AV69TFBarAlbPlas_To ;
      AV147Albaranes_albaranguia__wwds_48_tftipacacod = AV70TFTipAcaCod ;
      AV148Albaranes_albaranguia__wwds_49_tftipacacod_to = AV71TFTipAcaCod_To ;
      AV149Albaranes_albaranguia__wwds_50_tfalbproval_sels = AV73TFAlbProVal_Sels ;
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
         gxgrgrid_refresh( subGrid_Rows, A30AlbProCod, A396EmprCod, AV23ManageFiltersExecutionStep, AV18ColumnsSelector, AV15FilterFullText, AV24TFBarCod, AV25TFBarCod_To, AV26TFBarCodReo, AV27TFBarCodReo_To, AV28TFBarCodPar, AV29TFBarCodPar_Sel, AV30TFAlbSer, AV31TFAlbSer_Sel, AV32TFAlbColorCv, AV33TFAlbColorCv_Sel, AV34TFAlbNomCli, AV35TFAlbNomCli_Sel, AV36TFAlbColNum, AV37TFAlbColNum_To, AV38TFCodCod, AV39TFCodCod_Sel, AV40TFBarAlbKgmE, AV41TFBarAlbKgmE_To, AV42TFBarPreKgm, AV43TFBarPreKgm_To, AV44TFAlbHdrAnc, AV45TFAlbHdrAnc_To, AV46TFAlbHdrgm2, AV47TFAlbHdrgm2_To, AV48TFBarAlbMtrE, AV49TFBarAlbMtrE_To, AV50TFBarPreMtr, AV51TFBarPreMtr_To, AV52TFBarAlbPie, AV53TFBarAlbPie_To, AV54TFAlbTiras, AV55TFAlbTiras_Sel, AV56TFAlbTirasKg, AV57TFAlbTirasKg_To, AV58TFAlbSinTest, AV59TFAlbSinTest_Sel, AV60TFTubCod, AV61TFTubCod_To, AV62TFBarAlbTub, AV63TFBarAlbTub_To, AV64TFAlbHdrObs, AV65TFAlbHdrObs_Sel, AV66TFPlasCod, AV67TFPlasCod_To, AV68TFBarAlbPlas, AV69TFBarAlbPlas_To, AV70TFTipAcaCod, AV71TFTipAcaCod_To, AV73TFAlbProVal_Sels, AV85AccionesEnPopup, AV84VisualizarAcciones, AV95Pgmname, AV12OrderedBy, AV13OrderedDsc, AV89Artemalha, AV90F_carvema, AV91Siplasticos, AV92Endutex, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid_gotopage( int nPageNo )
   {
      AV100Albaranes_albaranguia__wwds_1_filterfulltext = AV15FilterFullText ;
      AV101Albaranes_albaranguia__wwds_2_tfbarcod = AV24TFBarCod ;
      AV102Albaranes_albaranguia__wwds_3_tfbarcod_to = AV25TFBarCod_To ;
      AV103Albaranes_albaranguia__wwds_4_tfbarcodreo = AV26TFBarCodReo ;
      AV104Albaranes_albaranguia__wwds_5_tfbarcodreo_to = AV27TFBarCodReo_To ;
      AV105Albaranes_albaranguia__wwds_6_tfbarcodpar = AV28TFBarCodPar ;
      AV106Albaranes_albaranguia__wwds_7_tfbarcodpar_sel = AV29TFBarCodPar_Sel ;
      AV107Albaranes_albaranguia__wwds_8_tfalbser = AV30TFAlbSer ;
      AV108Albaranes_albaranguia__wwds_9_tfalbser_sel = AV31TFAlbSer_Sel ;
      AV109Albaranes_albaranguia__wwds_10_tfalbcolorcv = AV32TFAlbColorCv ;
      AV110Albaranes_albaranguia__wwds_11_tfalbcolorcv_sel = AV33TFAlbColorCv_Sel ;
      AV111Albaranes_albaranguia__wwds_12_tfalbnomcli = AV34TFAlbNomCli ;
      AV112Albaranes_albaranguia__wwds_13_tfalbnomcli_sel = AV35TFAlbNomCli_Sel ;
      AV113Albaranes_albaranguia__wwds_14_tfalbcolnum = AV36TFAlbColNum ;
      AV114Albaranes_albaranguia__wwds_15_tfalbcolnum_to = AV37TFAlbColNum_To ;
      AV115Albaranes_albaranguia__wwds_16_tfcodcod = AV38TFCodCod ;
      AV116Albaranes_albaranguia__wwds_17_tfcodcod_sel = AV39TFCodCod_Sel ;
      AV117Albaranes_albaranguia__wwds_18_tfbaralbkgme = AV40TFBarAlbKgmE ;
      AV118Albaranes_albaranguia__wwds_19_tfbaralbkgme_to = AV41TFBarAlbKgmE_To ;
      AV119Albaranes_albaranguia__wwds_20_tfbarprekgm = AV42TFBarPreKgm ;
      AV120Albaranes_albaranguia__wwds_21_tfbarprekgm_to = AV43TFBarPreKgm_To ;
      AV121Albaranes_albaranguia__wwds_22_tfalbhdranc = AV44TFAlbHdrAnc ;
      AV122Albaranes_albaranguia__wwds_23_tfalbhdranc_to = AV45TFAlbHdrAnc_To ;
      AV123Albaranes_albaranguia__wwds_24_tfalbhdrgm2 = AV46TFAlbHdrgm2 ;
      AV124Albaranes_albaranguia__wwds_25_tfalbhdrgm2_to = AV47TFAlbHdrgm2_To ;
      AV125Albaranes_albaranguia__wwds_26_tfbaralbmtre = AV48TFBarAlbMtrE ;
      AV126Albaranes_albaranguia__wwds_27_tfbaralbmtre_to = AV49TFBarAlbMtrE_To ;
      AV127Albaranes_albaranguia__wwds_28_tfbarpremtr = AV50TFBarPreMtr ;
      AV128Albaranes_albaranguia__wwds_29_tfbarpremtr_to = AV51TFBarPreMtr_To ;
      AV129Albaranes_albaranguia__wwds_30_tfbaralbpie = AV52TFBarAlbPie ;
      AV130Albaranes_albaranguia__wwds_31_tfbaralbpie_to = AV53TFBarAlbPie_To ;
      AV131Albaranes_albaranguia__wwds_32_tfalbtiras = AV54TFAlbTiras ;
      AV132Albaranes_albaranguia__wwds_33_tfalbtiras_sel = AV55TFAlbTiras_Sel ;
      AV133Albaranes_albaranguia__wwds_34_tfalbtiraskg = AV56TFAlbTirasKg ;
      AV134Albaranes_albaranguia__wwds_35_tfalbtiraskg_to = AV57TFAlbTirasKg_To ;
      AV135Albaranes_albaranguia__wwds_36_tfalbsintest = AV58TFAlbSinTest ;
      AV136Albaranes_albaranguia__wwds_37_tfalbsintest_sel = AV59TFAlbSinTest_Sel ;
      AV137Albaranes_albaranguia__wwds_38_tftubcod = AV60TFTubCod ;
      AV138Albaranes_albaranguia__wwds_39_tftubcod_to = AV61TFTubCod_To ;
      AV139Albaranes_albaranguia__wwds_40_tfbaralbtub = AV62TFBarAlbTub ;
      AV140Albaranes_albaranguia__wwds_41_tfbaralbtub_to = AV63TFBarAlbTub_To ;
      AV141Albaranes_albaranguia__wwds_42_tfalbhdrobs = AV64TFAlbHdrObs ;
      AV142Albaranes_albaranguia__wwds_43_tfalbhdrobs_sel = AV65TFAlbHdrObs_Sel ;
      AV143Albaranes_albaranguia__wwds_44_tfplascod = AV66TFPlasCod ;
      AV144Albaranes_albaranguia__wwds_45_tfplascod_to = AV67TFPlasCod_To ;
      AV145Albaranes_albaranguia__wwds_46_tfbaralbplas = AV68TFBarAlbPlas ;
      AV146Albaranes_albaranguia__wwds_47_tfbaralbplas_to = AV69TFBarAlbPlas_To ;
      AV147Albaranes_albaranguia__wwds_48_tftipacacod = AV70TFTipAcaCod ;
      AV148Albaranes_albaranguia__wwds_49_tftipacacod_to = AV71TFTipAcaCod_To ;
      AV149Albaranes_albaranguia__wwds_50_tfalbproval_sels = AV73TFAlbProVal_Sels ;
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
         gxgrgrid_refresh( subGrid_Rows, A30AlbProCod, A396EmprCod, AV23ManageFiltersExecutionStep, AV18ColumnsSelector, AV15FilterFullText, AV24TFBarCod, AV25TFBarCod_To, AV26TFBarCodReo, AV27TFBarCodReo_To, AV28TFBarCodPar, AV29TFBarCodPar_Sel, AV30TFAlbSer, AV31TFAlbSer_Sel, AV32TFAlbColorCv, AV33TFAlbColorCv_Sel, AV34TFAlbNomCli, AV35TFAlbNomCli_Sel, AV36TFAlbColNum, AV37TFAlbColNum_To, AV38TFCodCod, AV39TFCodCod_Sel, AV40TFBarAlbKgmE, AV41TFBarAlbKgmE_To, AV42TFBarPreKgm, AV43TFBarPreKgm_To, AV44TFAlbHdrAnc, AV45TFAlbHdrAnc_To, AV46TFAlbHdrgm2, AV47TFAlbHdrgm2_To, AV48TFBarAlbMtrE, AV49TFBarAlbMtrE_To, AV50TFBarPreMtr, AV51TFBarPreMtr_To, AV52TFBarAlbPie, AV53TFBarAlbPie_To, AV54TFAlbTiras, AV55TFAlbTiras_Sel, AV56TFAlbTirasKg, AV57TFAlbTirasKg_To, AV58TFAlbSinTest, AV59TFAlbSinTest_Sel, AV60TFTubCod, AV61TFTubCod_To, AV62TFBarAlbTub, AV63TFBarAlbTub_To, AV64TFAlbHdrObs, AV65TFAlbHdrObs_Sel, AV66TFPlasCod, AV67TFPlasCod_To, AV68TFBarAlbPlas, AV69TFBarAlbPlas_To, AV70TFTipAcaCod, AV71TFTipAcaCod_To, AV73TFAlbProVal_Sels, AV85AccionesEnPopup, AV84VisualizarAcciones, AV95Pgmname, AV12OrderedBy, AV13OrderedDsc, AV89Artemalha, AV90F_carvema, AV91Siplasticos, AV92Endutex, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV95Pgmname = "Albaranes.AlbaranGuia__WW" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV95Pgmname", AV95Pgmname);
      Gx_err = (short)(0) ;
      edtavDetailwebcomponent_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDetailwebcomponent_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDetailwebcomponent_Enabled), 5, 0), !bGXsfl_69_Refreshing);
      edtavUpdate_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavUpdate_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavUpdate_Enabled), 5, 0), !bGXsfl_69_Refreshing);
      edtavDelete_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDelete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDelete_Enabled), 5, 0), !bGXsfl_69_Refreshing);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      /* Using cursor H01XC4 */
      pr_default.execute(2, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
      A1253EmprGuiRem = H01XC4_A1253EmprGuiRem[0] ;
      A5805AlbEnvFtp = H01XC4_A5805AlbEnvFtp[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A5805AlbEnvFtp", GXutil.str( A5805AlbEnvFtp, 1, 0));
      A1243GuiRemCli = H01XC4_A1243GuiRemCli[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A1243GuiRemCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1243GuiRemCli), 6, 0));
      A34AlbProfch = H01XC4_A34AlbProfch[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A34AlbProfch", localUtil.format(A34AlbProfch, "99/99/99"));
      A2242AlbSec = H01XC4_A2242AlbSec[0] ;
      A7101AlbLic = H01XC4_A7101AlbLic[0] ;
      pr_default.close(2);
      /* Using cursor H01XC5 */
      pr_default.execute(3, new Object[] {A1253EmprGuiRem, Integer.valueOf(A1243GuiRemCli)});
      A1244GuiRemCln = H01XC5_A1244GuiRemCln[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A1244GuiRemCln", A1244GuiRemCln);
      pr_default.close(3);
      pr_default.close(2);
      pr_default.close(3);
      fix_multi_value_controls( ) ;
   }

   public void strup1XC0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e171XC2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vMANAGEFILTERSDATA"), AV21ManageFiltersData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vDDO_TITLESETTINGSICONS"), AV78DDO_TitleSettingsIcons);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vCOLUMNSSELECTOR"), AV18ColumnsSelector);
         /* Read saved values. */
         nRC_GXsfl_69 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_69"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV80GridCurrentPage = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV81GridPageCount = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         wcpOA396EmprCod = httpContext.cgiGet( sPrefix+"wcpOA396EmprCod") ;
         wcpOA30AlbProCod = localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOA30AlbProCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         wcpOAV84VisualizarAcciones = GXutil.strtobool( httpContext.cgiGet( sPrefix+"wcpOAV84VisualizarAcciones")) ;
         wcpOAV85AccionesEnPopup = GXutil.strtobool( httpContext.cgiGet( sPrefix+"wcpOAV85AccionesEnPopup")) ;
         AV85AccionesEnPopup = GXutil.strtobool( httpContext.cgiGet( sPrefix+"vACCIONESENPOPUP")) ;
         AV84VisualizarAcciones = GXutil.strtobool( httpContext.cgiGet( sPrefix+"vVISUALIZARACCIONES")) ;
         GRID_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( sPrefix+"GRID_nFirstRecordOnPage"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         GRID_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRID_nEOF"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
         Dvpanel_tablealbaran_Width = httpContext.cgiGet( sPrefix+"DVPANEL_TABLEALBARAN_Width") ;
         Dvpanel_tablealbaran_Autowidth = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_TABLEALBARAN_Autowidth")) ;
         Dvpanel_tablealbaran_Autoheight = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_TABLEALBARAN_Autoheight")) ;
         Dvpanel_tablealbaran_Cls = httpContext.cgiGet( sPrefix+"DVPANEL_TABLEALBARAN_Cls") ;
         Dvpanel_tablealbaran_Title = httpContext.cgiGet( sPrefix+"DVPANEL_TABLEALBARAN_Title") ;
         Dvpanel_tablealbaran_Collapsible = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_TABLEALBARAN_Collapsible")) ;
         Dvpanel_tablealbaran_Collapsed = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_TABLEALBARAN_Collapsed")) ;
         Dvpanel_tablealbaran_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_TABLEALBARAN_Showcollapseicon")) ;
         Dvpanel_tablealbaran_Iconposition = httpContext.cgiGet( sPrefix+"DVPANEL_TABLEALBARAN_Iconposition") ;
         Dvpanel_tablealbaran_Autoscroll = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_TABLEALBARAN_Autoscroll")) ;
         Ddo_managefilters_Icontype = httpContext.cgiGet( sPrefix+"DDO_MANAGEFILTERS_Icontype") ;
         Ddo_managefilters_Icon = httpContext.cgiGet( sPrefix+"DDO_MANAGEFILTERS_Icon") ;
         Ddo_managefilters_Tooltip = httpContext.cgiGet( sPrefix+"DDO_MANAGEFILTERS_Tooltip") ;
         Ddo_managefilters_Cls = httpContext.cgiGet( sPrefix+"DDO_MANAGEFILTERS_Cls") ;
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
         cmbAlbEnvFtp.setName( cmbAlbEnvFtp.getInternalname() );
         cmbAlbEnvFtp.setValue( httpContext.cgiGet( cmbAlbEnvFtp.getInternalname()) );
         A5805AlbEnvFtp = (byte)(GXutil.lval( httpContext.cgiGet( cmbAlbEnvFtp.getInternalname()))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A5805AlbEnvFtp", GXutil.str( A5805AlbEnvFtp, 1, 0));
         A1243GuiRemCli = (int)(localUtil.ctol( httpContext.cgiGet( edtGuiRemCli_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A1243GuiRemCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1243GuiRemCli), 6, 0));
         A1244GuiRemCln = httpContext.cgiGet( edtGuiRemCln_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A1244GuiRemCln", A1244GuiRemCln);
         A34AlbProfch = localUtil.ctod( httpContext.cgiGet( edtAlbProfch_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A34AlbProfch", localUtil.format(A34AlbProfch, "99/99/99"));
         AV15FilterFullText = httpContext.cgiGet( edtavFilterfulltext_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV15FilterFullText", AV15FilterFullText);
         AV95Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV95Pgmname", AV95Pgmname);
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"AlbaranGuia__WW");
         AV95Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV95Pgmname", AV95Pgmname);
         forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV95Pgmname, "")));
         hsh = httpContext.cgiGet( sPrefix+"hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("albaranes\\albaranguia__ww:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
      e171XC2 ();
      if (returnInSub) return;
   }

   public void e171XC2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV96Station ;
      GXv_char6[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char6) ;
      albaranguia__ww_impl.this.GXt_char1 = GXv_char6[0] ;
      AV96Station = GXt_char1 ;
      GXv_char6[0] = AV97Emprcod ;
      GXv_char5[0] = AV98Emprnom ;
      GXv_char2[0] = AV99Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV96Station, GXv_char6, GXv_char5, GXv_char2) ;
      albaranguia__ww_impl.this.AV97Emprcod = GXv_char6[0] ;
      albaranguia__ww_impl.this.AV98Emprnom = GXv_char5[0] ;
      albaranguia__ww_impl.this.AV99Usurcod = GXv_char2[0] ;
      divCell_grid_dwc_Class = "Invisible WCD_"+GXutil.upper( subGrid_Internalname) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, divCell_grid_dwc_Internalname, "Class", divCell_grid_dwc_Class, true);
      /* Execute user subroutine: 'ATTRIBUTESSECURITYCODE' */
      S112 ();
      if (returnInSub) return;
      edtEmprCod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtEmprCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Visible), 5, 0), true);
      subGrid_Rows = 10 ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      Grid_empowerer_Gridinternalname = subGrid_Internalname ;
      ucGrid_empowerer.sendProperty(context, sPrefix, false, Grid_empowerer_Internalname, "GridInternalName", Grid_empowerer_Gridinternalname);
      Ddo_gridcolumnsselector_Gridinternalname = subGrid_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, sPrefix, false, Ddo_gridcolumnsselector_Internalname, "GridInternalName", Ddo_gridcolumnsselector_Gridinternalname);
      /* Execute user subroutine: 'LOADSAVEDFILTERS' */
      S122 ();
      if (returnInSub) return;
      Ddo_grid_Gridinternalname = subGrid_Internalname ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "GridInternalName", Ddo_grid_Gridinternalname);
      /* Execute user subroutine: 'PREPARETRANSACTION' */
      S132 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S142 ();
      if (returnInSub) return;
      if ( AV12OrderedBy < 1 )
      {
         AV12OrderedBy = (short)(1) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12OrderedBy), 4, 0));
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S152 ();
         if (returnInSub) return;
      }
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7 = AV78DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8[0] ;
      AV78DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = bttBtneditcolumns_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, sPrefix, false, Ddo_gridcolumnsselector_Internalname, "TitleControlIdToReplace", Ddo_gridcolumnsselector_Titlecontrolidtoreplace);
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, sPrefix, false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
   }

   public void e181XC2( )
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
      /* Execute user subroutine: 'CHECKSECURITYFORACTIONS' */
      S162 ();
      if (returnInSub) return;
      if ( AV23ManageFiltersExecutionStep == 1 )
      {
         AV23ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV23ManageFiltersExecutionStep", GXutil.str( AV23ManageFiltersExecutionStep, 1, 0));
      }
      else if ( AV23ManageFiltersExecutionStep == 2 )
      {
         AV23ManageFiltersExecutionStep = (byte)(0) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV23ManageFiltersExecutionStep", GXutil.str( AV23ManageFiltersExecutionStep, 1, 0));
         /* Execute user subroutine: 'LOADSAVEDFILTERS' */
         S122 ();
         if (returnInSub) return;
      }
      /* Execute user subroutine: 'SAVEGRIDSTATE' */
      S172 ();
      if (returnInSub) return;
      if ( GXutil.strcmp(AV20Session.getValue("Albaranes.AlbaranGuia__WWColumnsSelector"), "") != 0 )
      {
         AV16ColumnsSelectorXML = AV20Session.getValue("Albaranes.AlbaranGuia__WWColumnsSelector") ;
         AV18ColumnsSelector.fromxml(AV16ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S182 ();
         if (returnInSub) return;
      }
      edtBarCod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCod_Visible), 5, 0), !bGXsfl_69_Refreshing);
      edtBarCodReo_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarCodReo_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodReo_Visible), 5, 0), !bGXsfl_69_Refreshing);
      edtBarCodPar_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarCodPar_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodPar_Visible), 5, 0), !bGXsfl_69_Refreshing);
      edtAlbSer_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtAlbSer_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbSer_Visible), 5, 0), !bGXsfl_69_Refreshing);
      edtAlbColorCv_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtAlbColorCv_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbColorCv_Visible), 5, 0), !bGXsfl_69_Refreshing);
      edtAlbNomCli_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtAlbNomCli_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbNomCli_Visible), 5, 0), !bGXsfl_69_Refreshing);
      edtAlbColNum_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtAlbColNum_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbColNum_Visible), 5, 0), !bGXsfl_69_Refreshing);
      edtCodCod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtCodCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCodCod_Visible), 5, 0), !bGXsfl_69_Refreshing);
      edtBarAlbKgmE_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarAlbKgmE_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAlbKgmE_Visible), 5, 0), !bGXsfl_69_Refreshing);
      edtBarPreKgm_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarPreKgm_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPreKgm_Visible), 5, 0), !bGXsfl_69_Refreshing);
      edtAlbHdrAnc_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtAlbHdrAnc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbHdrAnc_Visible), 5, 0), !bGXsfl_69_Refreshing);
      edtAlbHdrgm2_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtAlbHdrgm2_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbHdrgm2_Visible), 5, 0), !bGXsfl_69_Refreshing);
      edtBarAlbMtrE_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarAlbMtrE_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAlbMtrE_Visible), 5, 0), !bGXsfl_69_Refreshing);
      edtBarPreMtr_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarPreMtr_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPreMtr_Visible), 5, 0), !bGXsfl_69_Refreshing);
      edtBarAlbPie_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarAlbPie_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAlbPie_Visible), 5, 0), !bGXsfl_69_Refreshing);
      edtAlbTiras_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+16)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtAlbTiras_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbTiras_Visible), 5, 0), !bGXsfl_69_Refreshing);
      edtAlbTirasKg_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+17)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtAlbTirasKg_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbTirasKg_Visible), 5, 0), !bGXsfl_69_Refreshing);
      edtAlbSinTest_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+18)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtAlbSinTest_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbSinTest_Visible), 5, 0), !bGXsfl_69_Refreshing);
      edtTubCod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+19)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtTubCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTubCod_Visible), 5, 0), !bGXsfl_69_Refreshing);
      edtBarAlbTub_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+20)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarAlbTub_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAlbTub_Visible), 5, 0), !bGXsfl_69_Refreshing);
      edtAlbHdrObs_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+21)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtAlbHdrObs_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbHdrObs_Visible), 5, 0), !bGXsfl_69_Refreshing);
      edtPlasCod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+22)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtPlasCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPlasCod_Visible), 5, 0), !bGXsfl_69_Refreshing);
      edtBarAlbPlas_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+23)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarAlbPlas_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAlbPlas_Visible), 5, 0), !bGXsfl_69_Refreshing);
      edtTipAcaCod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+24)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtTipAcaCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipAcaCod_Visible), 5, 0), !bGXsfl_69_Refreshing);
      cmbAlbProVal.setVisible( (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+25)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbAlbProVal.getInternalname(), "Visible", GXutil.ltrimstr( cmbAlbProVal.getVisible(), 5, 0), !bGXsfl_69_Refreshing);
      AV80GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV80GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV80GridCurrentPage), 10, 0));
      AV81GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV81GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV81GridPageCount), 10, 0));
      AV100Albaranes_albaranguia__wwds_1_filterfulltext = AV15FilterFullText ;
      AV101Albaranes_albaranguia__wwds_2_tfbarcod = AV24TFBarCod ;
      AV102Albaranes_albaranguia__wwds_3_tfbarcod_to = AV25TFBarCod_To ;
      AV103Albaranes_albaranguia__wwds_4_tfbarcodreo = AV26TFBarCodReo ;
      AV104Albaranes_albaranguia__wwds_5_tfbarcodreo_to = AV27TFBarCodReo_To ;
      AV105Albaranes_albaranguia__wwds_6_tfbarcodpar = AV28TFBarCodPar ;
      AV106Albaranes_albaranguia__wwds_7_tfbarcodpar_sel = AV29TFBarCodPar_Sel ;
      AV107Albaranes_albaranguia__wwds_8_tfalbser = AV30TFAlbSer ;
      AV108Albaranes_albaranguia__wwds_9_tfalbser_sel = AV31TFAlbSer_Sel ;
      AV109Albaranes_albaranguia__wwds_10_tfalbcolorcv = AV32TFAlbColorCv ;
      AV110Albaranes_albaranguia__wwds_11_tfalbcolorcv_sel = AV33TFAlbColorCv_Sel ;
      AV111Albaranes_albaranguia__wwds_12_tfalbnomcli = AV34TFAlbNomCli ;
      AV112Albaranes_albaranguia__wwds_13_tfalbnomcli_sel = AV35TFAlbNomCli_Sel ;
      AV113Albaranes_albaranguia__wwds_14_tfalbcolnum = AV36TFAlbColNum ;
      AV114Albaranes_albaranguia__wwds_15_tfalbcolnum_to = AV37TFAlbColNum_To ;
      AV115Albaranes_albaranguia__wwds_16_tfcodcod = AV38TFCodCod ;
      AV116Albaranes_albaranguia__wwds_17_tfcodcod_sel = AV39TFCodCod_Sel ;
      AV117Albaranes_albaranguia__wwds_18_tfbaralbkgme = AV40TFBarAlbKgmE ;
      AV118Albaranes_albaranguia__wwds_19_tfbaralbkgme_to = AV41TFBarAlbKgmE_To ;
      AV119Albaranes_albaranguia__wwds_20_tfbarprekgm = AV42TFBarPreKgm ;
      AV120Albaranes_albaranguia__wwds_21_tfbarprekgm_to = AV43TFBarPreKgm_To ;
      AV121Albaranes_albaranguia__wwds_22_tfalbhdranc = AV44TFAlbHdrAnc ;
      AV122Albaranes_albaranguia__wwds_23_tfalbhdranc_to = AV45TFAlbHdrAnc_To ;
      AV123Albaranes_albaranguia__wwds_24_tfalbhdrgm2 = AV46TFAlbHdrgm2 ;
      AV124Albaranes_albaranguia__wwds_25_tfalbhdrgm2_to = AV47TFAlbHdrgm2_To ;
      AV125Albaranes_albaranguia__wwds_26_tfbaralbmtre = AV48TFBarAlbMtrE ;
      AV126Albaranes_albaranguia__wwds_27_tfbaralbmtre_to = AV49TFBarAlbMtrE_To ;
      AV127Albaranes_albaranguia__wwds_28_tfbarpremtr = AV50TFBarPreMtr ;
      AV128Albaranes_albaranguia__wwds_29_tfbarpremtr_to = AV51TFBarPreMtr_To ;
      AV129Albaranes_albaranguia__wwds_30_tfbaralbpie = AV52TFBarAlbPie ;
      AV130Albaranes_albaranguia__wwds_31_tfbaralbpie_to = AV53TFBarAlbPie_To ;
      AV131Albaranes_albaranguia__wwds_32_tfalbtiras = AV54TFAlbTiras ;
      AV132Albaranes_albaranguia__wwds_33_tfalbtiras_sel = AV55TFAlbTiras_Sel ;
      AV133Albaranes_albaranguia__wwds_34_tfalbtiraskg = AV56TFAlbTirasKg ;
      AV134Albaranes_albaranguia__wwds_35_tfalbtiraskg_to = AV57TFAlbTirasKg_To ;
      AV135Albaranes_albaranguia__wwds_36_tfalbsintest = AV58TFAlbSinTest ;
      AV136Albaranes_albaranguia__wwds_37_tfalbsintest_sel = AV59TFAlbSinTest_Sel ;
      AV137Albaranes_albaranguia__wwds_38_tftubcod = AV60TFTubCod ;
      AV138Albaranes_albaranguia__wwds_39_tftubcod_to = AV61TFTubCod_To ;
      AV139Albaranes_albaranguia__wwds_40_tfbaralbtub = AV62TFBarAlbTub ;
      AV140Albaranes_albaranguia__wwds_41_tfbaralbtub_to = AV63TFBarAlbTub_To ;
      AV141Albaranes_albaranguia__wwds_42_tfalbhdrobs = AV64TFAlbHdrObs ;
      AV142Albaranes_albaranguia__wwds_43_tfalbhdrobs_sel = AV65TFAlbHdrObs_Sel ;
      AV143Albaranes_albaranguia__wwds_44_tfplascod = AV66TFPlasCod ;
      AV144Albaranes_albaranguia__wwds_45_tfplascod_to = AV67TFPlasCod_To ;
      AV145Albaranes_albaranguia__wwds_46_tfbaralbplas = AV68TFBarAlbPlas ;
      AV146Albaranes_albaranguia__wwds_47_tfbaralbplas_to = AV69TFBarAlbPlas_To ;
      AV147Albaranes_albaranguia__wwds_48_tftipacacod = AV70TFTipAcaCod ;
      AV148Albaranes_albaranguia__wwds_49_tftipacacod_to = AV71TFTipAcaCod_To ;
      AV149Albaranes_albaranguia__wwds_50_tfalbproval_sels = AV73TFAlbProVal_Sels ;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV18ColumnsSelector", AV18ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV21ManageFiltersData", AV21ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV10GridState", AV10GridState);
   }

   public void e121XC2( )
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
         AV79PageToGo = (int)(GXutil.lval( Gridpaginationbar_Selectedpage)) ;
         subgrid_gotopage( AV79PageToGo) ;
      }
   }

   public void e131XC2( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   public void e141XC2( )
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
         S152 ();
         if (returnInSub) return;
         subgrid_firstpage( ) ;
      }
      else if ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#Filter#>") == 0 )
      {
         if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarCod") == 0 )
         {
            AV24TFBarCod = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV24TFBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV24TFBarCod), 8, 0));
            AV25TFBarCod_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV25TFBarCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV25TFBarCod_To), 8, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarCodReo") == 0 )
         {
            AV26TFBarCodReo = (byte)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV26TFBarCodReo", GXutil.str( AV26TFBarCodReo, 1, 0));
            AV27TFBarCodReo_To = (byte)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV27TFBarCodReo_To", GXutil.str( AV27TFBarCodReo_To, 1, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarCodPar") == 0 )
         {
            AV28TFBarCodPar = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV28TFBarCodPar", AV28TFBarCodPar);
            AV29TFBarCodPar_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV29TFBarCodPar_Sel", AV29TFBarCodPar_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbSer") == 0 )
         {
            AV30TFAlbSer = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV30TFAlbSer", AV30TFAlbSer);
            AV31TFAlbSer_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV31TFAlbSer_Sel", AV31TFAlbSer_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbColorCv") == 0 )
         {
            AV32TFAlbColorCv = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32TFAlbColorCv", AV32TFAlbColorCv);
            AV33TFAlbColorCv_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33TFAlbColorCv_Sel", AV33TFAlbColorCv_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbNomCli") == 0 )
         {
            AV34TFAlbNomCli = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34TFAlbNomCli", AV34TFAlbNomCli);
            AV35TFAlbNomCli_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV35TFAlbNomCli_Sel", AV35TFAlbNomCli_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbColNum") == 0 )
         {
            AV36TFAlbColNum = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36TFAlbColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36TFAlbColNum), 6, 0));
            AV37TFAlbColNum_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37TFAlbColNum_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV37TFAlbColNum_To), 6, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "CodCod") == 0 )
         {
            AV38TFCodCod = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV38TFCodCod", AV38TFCodCod);
            AV39TFCodCod_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV39TFCodCod_Sel", AV39TFCodCod_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarAlbKgmE") == 0 )
         {
            AV40TFBarAlbKgmE = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV40TFBarAlbKgmE", GXutil.ltrimstr( AV40TFBarAlbKgmE, 9, 2));
            AV41TFBarAlbKgmE_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV41TFBarAlbKgmE_To", GXutil.ltrimstr( AV41TFBarAlbKgmE_To, 9, 2));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarPreKgm") == 0 )
         {
            AV42TFBarPreKgm = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV42TFBarPreKgm", GXutil.ltrimstr( AV42TFBarPreKgm, 13, 5));
            AV43TFBarPreKgm_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV43TFBarPreKgm_To", GXutil.ltrimstr( AV43TFBarPreKgm_To, 13, 5));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbHdrAnc") == 0 )
         {
            AV44TFAlbHdrAnc = (short)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV44TFAlbHdrAnc", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV44TFAlbHdrAnc), 4, 0));
            AV45TFAlbHdrAnc_To = (short)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV45TFAlbHdrAnc_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV45TFAlbHdrAnc_To), 4, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbHdrgm2") == 0 )
         {
            AV46TFAlbHdrgm2 = (short)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV46TFAlbHdrgm2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV46TFAlbHdrgm2), 4, 0));
            AV47TFAlbHdrgm2_To = (short)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47TFAlbHdrgm2_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV47TFAlbHdrgm2_To), 4, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarAlbMtrE") == 0 )
         {
            AV48TFBarAlbMtrE = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV48TFBarAlbMtrE", GXutil.ltrimstr( AV48TFBarAlbMtrE, 9, 2));
            AV49TFBarAlbMtrE_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV49TFBarAlbMtrE_To", GXutil.ltrimstr( AV49TFBarAlbMtrE_To, 9, 2));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarPreMtr") == 0 )
         {
            AV50TFBarPreMtr = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV50TFBarPreMtr", GXutil.ltrimstr( AV50TFBarPreMtr, 13, 5));
            AV51TFBarPreMtr_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV51TFBarPreMtr_To", GXutil.ltrimstr( AV51TFBarPreMtr_To, 13, 5));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarAlbPie") == 0 )
         {
            AV52TFBarAlbPie = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV52TFBarAlbPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV52TFBarAlbPie), 6, 0));
            AV53TFBarAlbPie_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV53TFBarAlbPie_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV53TFBarAlbPie_To), 6, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbTiras") == 0 )
         {
            AV54TFAlbTiras = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV54TFAlbTiras", AV54TFAlbTiras);
            AV55TFAlbTiras_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV55TFAlbTiras_Sel", AV55TFAlbTiras_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbTirasKg") == 0 )
         {
            AV56TFAlbTirasKg = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV56TFAlbTirasKg", GXutil.ltrimstr( AV56TFAlbTirasKg, 9, 2));
            AV57TFAlbTirasKg_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV57TFAlbTirasKg_To", GXutil.ltrimstr( AV57TFAlbTirasKg_To, 9, 2));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbSinTest") == 0 )
         {
            AV58TFAlbSinTest = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV58TFAlbSinTest", AV58TFAlbSinTest);
            AV59TFAlbSinTest_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV59TFAlbSinTest_Sel", AV59TFAlbSinTest_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "TubCod") == 0 )
         {
            AV60TFTubCod = (short)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV60TFTubCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV60TFTubCod), 4, 0));
            AV61TFTubCod_To = (short)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV61TFTubCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV61TFTubCod_To), 4, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarAlbTub") == 0 )
         {
            AV62TFBarAlbTub = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV62TFBarAlbTub", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV62TFBarAlbTub), 6, 0));
            AV63TFBarAlbTub_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV63TFBarAlbTub_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV63TFBarAlbTub_To), 6, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbHdrObs") == 0 )
         {
            AV64TFAlbHdrObs = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV64TFAlbHdrObs", AV64TFAlbHdrObs);
            AV65TFAlbHdrObs_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV65TFAlbHdrObs_Sel", AV65TFAlbHdrObs_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PlasCod") == 0 )
         {
            AV66TFPlasCod = (short)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV66TFPlasCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV66TFPlasCod), 4, 0));
            AV67TFPlasCod_To = (short)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV67TFPlasCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV67TFPlasCod_To), 4, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarAlbPlas") == 0 )
         {
            AV68TFBarAlbPlas = (short)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV68TFBarAlbPlas", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV68TFBarAlbPlas), 4, 0));
            AV69TFBarAlbPlas_To = (short)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV69TFBarAlbPlas_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV69TFBarAlbPlas_To), 4, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "TipAcaCod") == 0 )
         {
            AV70TFTipAcaCod = (short)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV70TFTipAcaCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV70TFTipAcaCod), 4, 0));
            AV71TFTipAcaCod_To = (short)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV71TFTipAcaCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV71TFTipAcaCod_To), 4, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbProVal") == 0 )
         {
            AV72TFAlbProVal_SelsJson = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV72TFAlbProVal_SelsJson", AV72TFAlbProVal_SelsJson);
            AV73TFAlbProVal_Sels.fromJSonString(AV72TFAlbProVal_SelsJson, null);
         }
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV73TFAlbProVal_Sels", AV73TFAlbProVal_Sels);
   }

   private void e191XC2( )
   {
      if ( ( subGrid_Islastpage == 1 ) || ( subGrid_Rows == 0 ) || ( ( GRID_nCurrentRecord >= GRID_nFirstRecordOnPage ) && ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) ) ) )
      {
         /* Grid_Load Routine */
         returnInSub = false ;
         AV83DetailWebComponent = "<i class=\"fas fa-angle-right ArrowIcon\"></i>" ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavDetailwebcomponent_Internalname, AV83DetailWebComponent);
         AV86Update = httpContext.getMessage( "GXM_update", "") ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavUpdate_Internalname, AV86Update);
         if ( AV84VisualizarAcciones )
         {
            edtavUpdate_Class = "Attribute" ;
         }
         else
         {
            edtavUpdate_Class = "Invisible" ;
         }
         AV87Delete = httpContext.getMessage( "GX_BtnDelete", "") ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavDelete_Internalname, AV87Delete);
         if ( AV84VisualizarAcciones )
         {
            edtavDelete_Class = "Attribute" ;
         }
         else
         {
            edtavDelete_Class = "Invisible" ;
         }
         /* Load Method */
         if ( wbStart != -1 )
         {
            wbStart = (short)(69) ;
         }
         sendrow_692( ) ;
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
      if ( isFullAjaxMode( ) && ! bGXsfl_69_Refreshing )
      {
         httpContext.doAjaxLoad(69, GridRow);
      }
      /*  Sending Event outputs  */
   }

   public void e151XC2( )
   {
      /* Ddo_gridcolumnsselector_Oncolumnschanged Routine */
      returnInSub = false ;
      AV16ColumnsSelectorXML = Ddo_gridcolumnsselector_Columnsselectorvalues ;
      AV18ColumnsSelector.fromJSonString(AV16ColumnsSelectorXML, null);
      new app.wwpbaseobjects.savecolumnsselectorstate(remoteHandle, context).execute( "Albaranes.AlbaranGuia__WWColumnsSelector", ((GXutil.strcmp("", AV16ColumnsSelectorXML)==0) ? "" : AV18ColumnsSelector.toxml(false, true, "WWPColumnsSelector", "TexplusNET"))) ;
      httpContext.doAjaxRefreshCmp(sPrefix);
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV18ColumnsSelector", AV18ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV21ManageFiltersData", AV21ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV10GridState", AV10GridState);
   }

   public void e111XC2( )
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
         S172 ();
         if (returnInSub) return;
         httpContext.popup(formatLink("app.wwpbaseobjects.savefilteras", new String[] {GXutil.URLEncode(GXutil.rtrim("Albaranes.AlbaranGuia__WWFilters")),GXutil.URLEncode(GXutil.rtrim(AV95Pgmname+"GridState"))}, new String[] {"UserKey","GridStateKey"}) , new Object[] {});
         AV23ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV23ManageFiltersExecutionStep", GXutil.str( AV23ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefreshCmp(sPrefix);
      }
      else if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Manage#>") == 0 )
      {
         httpContext.popup(formatLink("app.wwpbaseobjects.managefilters", new String[] {GXutil.URLEncode(GXutil.rtrim("Albaranes.AlbaranGuia__WWFilters"))}, new String[] {"UserKey"}) , new Object[] {});
         AV23ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV23ManageFiltersExecutionStep", GXutil.str( AV23ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefreshCmp(sPrefix);
      }
      else
      {
         GXt_char1 = AV22ManageFiltersXml ;
         GXv_char6[0] = GXt_char1 ;
         new app.wwpbaseobjects.getfilterbyname(remoteHandle, context).execute( "Albaranes.AlbaranGuia__WWFilters", Ddo_managefilters_Activeeventkey, GXv_char6) ;
         albaranguia__ww_impl.this.GXt_char1 = GXv_char6[0] ;
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
            new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV95Pgmname+"GridState", AV22ManageFiltersXml) ;
            AV10GridState.fromxml(AV22ManageFiltersXml, null, null);
            AV12OrderedBy = AV10GridState.getgxTv_SdtWWPGridState_Orderedby() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12OrderedBy), 4, 0));
            AV13OrderedDsc = AV10GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV13OrderedDsc", AV13OrderedDsc);
            /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
            S152 ();
            if (returnInSub) return;
            /* Execute user subroutine: 'LOADREGFILTERSSTATE' */
            S202 ();
            if (returnInSub) return;
            subgrid_firstpage( ) ;
            httpContext.doAjaxRefreshCmp(sPrefix);
         }
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV10GridState", AV10GridState);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV73TFAlbProVal_Sels", AV73TFAlbProVal_Sels);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV18ColumnsSelector", AV18ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV21ManageFiltersData", AV21ManageFiltersData);
   }

   public void e201XC2( )
   {
      /* Update_Click Routine */
      returnInSub = false ;
      httpContext.popup(formatLink("app.albaranes.albaranguia", new String[] {GXutil.URLEncode(GXutil.rtrim("UPD")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A30AlbProCod,10,0)),GXutil.URLEncode(GXutil.ltrimstr(A129BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A132BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(A130BarCodPar))}, new String[] {"Mode","EmprCod","AlbProCod","BarCod","BarCodReo","BarCodPar"}) , new Object[] {});
      httpContext.doAjaxRefreshCmp(sPrefix);
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV18ColumnsSelector", AV18ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV21ManageFiltersData", AV21ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV10GridState", AV10GridState);
   }

   public void e211XC2( )
   {
      /* Delete_Click Routine */
      returnInSub = false ;
      httpContext.popup(formatLink("app.albaranes.albaranguia", new String[] {GXutil.URLEncode(GXutil.rtrim("DLT")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A30AlbProCod,10,0)),GXutil.URLEncode(GXutil.ltrimstr(A129BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A132BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(A130BarCodPar))}, new String[] {"Mode","EmprCod","AlbProCod","BarCod","BarCodReo","BarCodPar"}) , new Object[] {});
      httpContext.doAjaxRefreshCmp(sPrefix);
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV18ColumnsSelector", AV18ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV21ManageFiltersData", AV21ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV10GridState", AV10GridState);
   }

   public void e161XC2( )
   {
      /* 'DoInsert' Routine */
      returnInSub = false ;
      if ( ! ( AV85AccionesEnPopup ) )
      {
         httpContext.popup(formatLink("app.albaranes.albaranguia", new String[] {GXutil.URLEncode(GXutil.rtrim("INS")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A30AlbProCod,10,0)),GXutil.URLEncode(GXutil.ltrimstr(0,9,0)),GXutil.URLEncode(GXutil.ltrimstr(0,9,0)),GXutil.URLEncode(GXutil.rtrim(""))}, new String[] {"Mode","EmprCod","AlbProCod","BarCod","BarCodReo","BarCodPar"}) , new Object[] {});
         httpContext.doAjaxRefreshCmp(sPrefix);
      }
      else
      {
         httpContext.popup(formatLink("app.albaranes.albaranguia", new String[] {GXutil.URLEncode(GXutil.rtrim("INS")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A30AlbProCod,10,0)),GXutil.URLEncode(GXutil.ltrimstr(0,9,0)),GXutil.URLEncode(GXutil.ltrimstr(0,9,0)),GXutil.URLEncode(GXutil.rtrim(""))}, new String[] {"Mode","EmprCod","AlbProCod","BarCod","BarCodReo","BarCodPar"}) , new Object[] {});
         httpContext.doAjaxRefreshCmp(sPrefix);
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV18ColumnsSelector", AV18ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV21ManageFiltersData", AV21ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV10GridState", AV10GridState);
   }

   public void S152( )
   {
      /* 'SETDDOSORTEDSTATUS' Routine */
      returnInSub = false ;
      Ddo_grid_Sortedstatus = GXutil.trim( GXutil.str( AV12OrderedBy, 4, 0))+":"+(AV13OrderedDsc ? "DSC" : "ASC") ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "SortedStatus", Ddo_grid_Sortedstatus);
   }

   public void S182( )
   {
      /* 'INITIALIZECOLUMNSSELECTOR' Routine */
      returnInSub = false ;
      AV18ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector10[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "BarCod", "", "OS", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "BarCodReo", "", "R", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "BarCodPar", "", "P", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "AlbSer", "", "Artigo", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "AlbColorCv", "", "Cor", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "AlbNomCli", "", "Cor Cli", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "AlbColNum", "", "Número", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      if ( AV89Artemalha == 1 )
      {
         GXv_SdtWWPColumnsSelector10[0] = AV18ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "CodCod", "", "Serviço", true, "") ;
         AV18ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      }
      else
      {
         GXv_SdtWWPColumnsSelector10[0] = AV18ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "", "", "", false, "") ;
         AV18ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
         AV38TFCodCod = "" ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV38TFCodCod", AV38TFCodCod);
         AV39TFCodCod_Sel = "" ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV39TFCodCod_Sel", AV39TFCodCod_Sel);
      }
      GXv_SdtWWPColumnsSelector10[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "BarAlbKgmE", "", "Quilos S.", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "BarPreKgm", "", "Preço Q.", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "AlbHdrAnc", "", "Largura", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "AlbHdrgm2", "", "Gm2", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "BarAlbMtrE", "", "Metros S.", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "BarPreMtr", "", "Preço Q.", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "BarAlbPie", "", "Peças", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      if ( AV90F_carvema == 1 )
      {
         GXv_SdtWWPColumnsSelector10[0] = AV18ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "AlbTiras", "", "Tirl?", true, "") ;
         AV18ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      }
      else
      {
         GXv_SdtWWPColumnsSelector10[0] = AV18ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "", "", "", false, "") ;
         AV18ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
         AV54TFAlbTiras = "" ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV54TFAlbTiras", AV54TFAlbTiras);
         AV55TFAlbTiras_Sel = "" ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV55TFAlbTiras_Sel", AV55TFAlbTiras_Sel);
      }
      if ( AV90F_carvema == 1 )
      {
         GXv_SdtWWPColumnsSelector10[0] = AV18ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "AlbTirasKg", "", "Quilos", true, "") ;
         AV18ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      }
      else
      {
         GXv_SdtWWPColumnsSelector10[0] = AV18ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "", "", "", false, "") ;
         AV18ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
         AV56TFAlbTirasKg = DecimalUtil.ZERO ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV56TFAlbTirasKg", GXutil.ltrimstr( AV56TFAlbTirasKg, 9, 2));
         AV57TFAlbTirasKg_To = DecimalUtil.ZERO ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV57TFAlbTirasKg_To", GXutil.ltrimstr( AV57TFAlbTirasKg_To, 9, 2));
      }
      if ( AV90F_carvema == 1 )
      {
         GXv_SdtWWPColumnsSelector10[0] = AV18ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "AlbSinTest", "", "Sem teste?", true, "") ;
         AV18ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      }
      else
      {
         GXv_SdtWWPColumnsSelector10[0] = AV18ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "", "", "", false, "") ;
         AV18ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
         AV58TFAlbSinTest = "" ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV58TFAlbSinTest", AV58TFAlbSinTest);
         AV59TFAlbSinTest_Sel = "" ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV59TFAlbSinTest_Sel", AV59TFAlbSinTest_Sel);
      }
      GXv_SdtWWPColumnsSelector10[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "TubCod", "", "Tubo", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "BarAlbTub", "", "Qtd", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "AlbHdrObs", "", "Obs", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      if ( AV91Siplasticos == 1 )
      {
         GXv_SdtWWPColumnsSelector10[0] = AV18ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "PlasCod", "", "Plast", true, "") ;
         AV18ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      }
      else
      {
         GXv_SdtWWPColumnsSelector10[0] = AV18ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "", "", "", false, "") ;
         AV18ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
         AV66TFPlasCod = (short)(0) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV66TFPlasCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV66TFPlasCod), 4, 0));
         AV67TFPlasCod_To = (short)(0) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV67TFPlasCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV67TFPlasCod_To), 4, 0));
      }
      if ( AV91Siplasticos == 1 )
      {
         GXv_SdtWWPColumnsSelector10[0] = AV18ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "BarAlbPlas", "", "Cant", true, "") ;
         AV18ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      }
      else
      {
         GXv_SdtWWPColumnsSelector10[0] = AV18ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "", "", "", false, "") ;
         AV18ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
         AV68TFBarAlbPlas = (short)(0) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV68TFBarAlbPlas", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV68TFBarAlbPlas), 4, 0));
         AV69TFBarAlbPlas_To = (short)(0) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV69TFBarAlbPlas_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV69TFBarAlbPlas_To), 4, 0));
      }
      if ( AV92Endutex == 1 )
      {
         GXv_SdtWWPColumnsSelector10[0] = AV18ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "TipAcaCod", "", "Tipo", true, "") ;
         AV18ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      }
      else
      {
         GXv_SdtWWPColumnsSelector10[0] = AV18ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "", "", "", false, "") ;
         AV18ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
         AV70TFTipAcaCod = (short)(0) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV70TFTipAcaCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV70TFTipAcaCod), 4, 0));
         AV71TFTipAcaCod_To = (short)(0) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV71TFTipAcaCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV71TFTipAcaCod_To), 4, 0));
      }
      GXv_SdtWWPColumnsSelector10[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "AlbProVal", "", "F?", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXt_char1 = AV17UserCustomValue ;
      GXv_char6[0] = GXt_char1 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "Albaranes.AlbaranGuia__WWColumnsSelector", GXv_char6) ;
      albaranguia__ww_impl.this.GXt_char1 = GXv_char6[0] ;
      AV17UserCustomValue = GXt_char1 ;
      if ( ! ( (GXutil.strcmp("", AV17UserCustomValue)==0) ) )
      {
         AV19ColumnsSelectorAux.fromxml(AV17UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector10[0] = AV19ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector11[0] = AV18ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, GXv_SdtWWPColumnsSelector11) ;
         AV19ColumnsSelectorAux = GXv_SdtWWPColumnsSelector10[0] ;
         AV18ColumnsSelector = GXv_SdtWWPColumnsSelector11[0] ;
      }
   }

   public void S162( )
   {
      /* 'CHECKSECURITYFORACTIONS' Routine */
      returnInSub = false ;
      if ( ! ( AV85AccionesEnPopup ) )
      {
         bttBtn_cancel_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, bttBtn_cancel_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_cancel_Visible), 5, 0), true);
      }
      if ( ! ( AV84VisualizarAcciones ) )
      {
         bttBtninsert_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, bttBtninsert_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtninsert_Visible), 5, 0), true);
      }
   }

   public void S122( )
   {
      /* 'LOADSAVEDFILTERS' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item12 = AV21ManageFiltersData ;
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item13[0] = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item12 ;
      new app.wwpbaseobjects.wwp_managefiltersloadsavedfilters(remoteHandle, context).execute( "Albaranes.AlbaranGuia__WWFilters", "", "", false, GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item13) ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item12 = GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item13[0] ;
      AV21ManageFiltersData = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item12 ;
   }

   public void S192( )
   {
      /* 'CLEANFILTERS' Routine */
      returnInSub = false ;
      AV15FilterFullText = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV15FilterFullText", AV15FilterFullText);
      AV24TFBarCod = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV24TFBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV24TFBarCod), 8, 0));
      AV25TFBarCod_To = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV25TFBarCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV25TFBarCod_To), 8, 0));
      AV26TFBarCodReo = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV26TFBarCodReo", GXutil.str( AV26TFBarCodReo, 1, 0));
      AV27TFBarCodReo_To = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV27TFBarCodReo_To", GXutil.str( AV27TFBarCodReo_To, 1, 0));
      AV28TFBarCodPar = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV28TFBarCodPar", AV28TFBarCodPar);
      AV29TFBarCodPar_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV29TFBarCodPar_Sel", AV29TFBarCodPar_Sel);
      AV30TFAlbSer = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV30TFAlbSer", AV30TFAlbSer);
      AV31TFAlbSer_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV31TFAlbSer_Sel", AV31TFAlbSer_Sel);
      AV32TFAlbColorCv = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32TFAlbColorCv", AV32TFAlbColorCv);
      AV33TFAlbColorCv_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33TFAlbColorCv_Sel", AV33TFAlbColorCv_Sel);
      AV34TFAlbNomCli = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34TFAlbNomCli", AV34TFAlbNomCli);
      AV35TFAlbNomCli_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV35TFAlbNomCli_Sel", AV35TFAlbNomCli_Sel);
      AV36TFAlbColNum = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36TFAlbColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36TFAlbColNum), 6, 0));
      AV37TFAlbColNum_To = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37TFAlbColNum_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV37TFAlbColNum_To), 6, 0));
      AV38TFCodCod = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV38TFCodCod", AV38TFCodCod);
      AV39TFCodCod_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV39TFCodCod_Sel", AV39TFCodCod_Sel);
      AV40TFBarAlbKgmE = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV40TFBarAlbKgmE", GXutil.ltrimstr( AV40TFBarAlbKgmE, 9, 2));
      AV41TFBarAlbKgmE_To = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV41TFBarAlbKgmE_To", GXutil.ltrimstr( AV41TFBarAlbKgmE_To, 9, 2));
      AV42TFBarPreKgm = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV42TFBarPreKgm", GXutil.ltrimstr( AV42TFBarPreKgm, 13, 5));
      AV43TFBarPreKgm_To = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV43TFBarPreKgm_To", GXutil.ltrimstr( AV43TFBarPreKgm_To, 13, 5));
      AV44TFAlbHdrAnc = (short)(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV44TFAlbHdrAnc", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV44TFAlbHdrAnc), 4, 0));
      AV45TFAlbHdrAnc_To = (short)(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV45TFAlbHdrAnc_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV45TFAlbHdrAnc_To), 4, 0));
      AV46TFAlbHdrgm2 = (short)(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV46TFAlbHdrgm2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV46TFAlbHdrgm2), 4, 0));
      AV47TFAlbHdrgm2_To = (short)(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47TFAlbHdrgm2_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV47TFAlbHdrgm2_To), 4, 0));
      AV48TFBarAlbMtrE = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV48TFBarAlbMtrE", GXutil.ltrimstr( AV48TFBarAlbMtrE, 9, 2));
      AV49TFBarAlbMtrE_To = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV49TFBarAlbMtrE_To", GXutil.ltrimstr( AV49TFBarAlbMtrE_To, 9, 2));
      AV50TFBarPreMtr = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV50TFBarPreMtr", GXutil.ltrimstr( AV50TFBarPreMtr, 13, 5));
      AV51TFBarPreMtr_To = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV51TFBarPreMtr_To", GXutil.ltrimstr( AV51TFBarPreMtr_To, 13, 5));
      AV52TFBarAlbPie = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV52TFBarAlbPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV52TFBarAlbPie), 6, 0));
      AV53TFBarAlbPie_To = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV53TFBarAlbPie_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV53TFBarAlbPie_To), 6, 0));
      AV54TFAlbTiras = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV54TFAlbTiras", AV54TFAlbTiras);
      AV55TFAlbTiras_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV55TFAlbTiras_Sel", AV55TFAlbTiras_Sel);
      AV56TFAlbTirasKg = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV56TFAlbTirasKg", GXutil.ltrimstr( AV56TFAlbTirasKg, 9, 2));
      AV57TFAlbTirasKg_To = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV57TFAlbTirasKg_To", GXutil.ltrimstr( AV57TFAlbTirasKg_To, 9, 2));
      AV58TFAlbSinTest = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV58TFAlbSinTest", AV58TFAlbSinTest);
      AV59TFAlbSinTest_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV59TFAlbSinTest_Sel", AV59TFAlbSinTest_Sel);
      AV60TFTubCod = (short)(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV60TFTubCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV60TFTubCod), 4, 0));
      AV61TFTubCod_To = (short)(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV61TFTubCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV61TFTubCod_To), 4, 0));
      AV62TFBarAlbTub = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV62TFBarAlbTub", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV62TFBarAlbTub), 6, 0));
      AV63TFBarAlbTub_To = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV63TFBarAlbTub_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV63TFBarAlbTub_To), 6, 0));
      AV64TFAlbHdrObs = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV64TFAlbHdrObs", AV64TFAlbHdrObs);
      AV65TFAlbHdrObs_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV65TFAlbHdrObs_Sel", AV65TFAlbHdrObs_Sel);
      AV66TFPlasCod = (short)(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV66TFPlasCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV66TFPlasCod), 4, 0));
      AV67TFPlasCod_To = (short)(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV67TFPlasCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV67TFPlasCod_To), 4, 0));
      AV68TFBarAlbPlas = (short)(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV68TFBarAlbPlas", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV68TFBarAlbPlas), 4, 0));
      AV69TFBarAlbPlas_To = (short)(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV69TFBarAlbPlas_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV69TFBarAlbPlas_To), 4, 0));
      AV70TFTipAcaCod = (short)(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV70TFTipAcaCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV70TFTipAcaCod), 4, 0));
      AV71TFTipAcaCod_To = (short)(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV71TFTipAcaCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV71TFTipAcaCod_To), 4, 0));
      AV73TFAlbProVal_Sels = new GXSimpleCollection<String>(String.class, "internal", "") ;
      Ddo_grid_Selectedvalue_set = "" ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      Ddo_grid_Filteredtext_set = "" ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = "" ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
   }

   public void S142( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV20Session.getValue(AV95Pgmname+"GridState"), "") == 0 )
      {
         AV10GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV95Pgmname+"GridState"), null, null);
      }
      else
      {
         AV10GridState.fromxml(AV20Session.getValue(AV95Pgmname+"GridState"), null, null);
      }
      AV12OrderedBy = AV10GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12OrderedBy), 4, 0));
      AV13OrderedDsc = AV10GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV13OrderedDsc", AV13OrderedDsc);
      /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
      S152 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADREGFILTERSSTATE' */
      S202 ();
      if (returnInSub) return;
      if ( ! (GXutil.strcmp("", GXutil.trim( AV10GridState.getgxTv_SdtWWPGridState_Pagesize()))==0) )
      {
         subGrid_Rows = (int)(GXutil.lval( AV10GridState.getgxTv_SdtWWPGridState_Pagesize())) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      }
      subgrid_gotopage( AV10GridState.getgxTv_SdtWWPGridState_Currentpage()) ;
   }

   public void S202( )
   {
      /* 'LOADREGFILTERSSTATE' Routine */
      returnInSub = false ;
      AV150GXV1 = 1 ;
      while ( AV150GXV1 <= AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV150GXV1));
         if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV15FilterFullText = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV15FilterFullText", AV15FilterFullText);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOD") == 0 )
         {
            AV24TFBarCod = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV24TFBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV24TFBarCod), 8, 0));
            AV25TFBarCod_To = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV25TFBarCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV25TFBarCod_To), 8, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCODREO") == 0 )
         {
            AV26TFBarCodReo = (byte)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV26TFBarCodReo", GXutil.str( AV26TFBarCodReo, 1, 0));
            AV27TFBarCodReo_To = (byte)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV27TFBarCodReo_To", GXutil.str( AV27TFBarCodReo_To, 1, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCODPAR") == 0 )
         {
            AV28TFBarCodPar = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV28TFBarCodPar", AV28TFBarCodPar);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCODPAR_SEL") == 0 )
         {
            AV29TFBarCodPar_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV29TFBarCodPar_Sel", AV29TFBarCodPar_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBSER") == 0 )
         {
            AV30TFAlbSer = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV30TFAlbSer", AV30TFAlbSer);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBSER_SEL") == 0 )
         {
            AV31TFAlbSer_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV31TFAlbSer_Sel", AV31TFAlbSer_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOLORCV") == 0 )
         {
            AV32TFAlbColorCv = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32TFAlbColorCv", AV32TFAlbColorCv);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOLORCV_SEL") == 0 )
         {
            AV33TFAlbColorCv_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33TFAlbColorCv_Sel", AV33TFAlbColorCv_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBNOMCLI") == 0 )
         {
            AV34TFAlbNomCli = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34TFAlbNomCli", AV34TFAlbNomCli);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBNOMCLI_SEL") == 0 )
         {
            AV35TFAlbNomCli_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV35TFAlbNomCli_Sel", AV35TFAlbNomCli_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOLNUM") == 0 )
         {
            AV36TFAlbColNum = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36TFAlbColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36TFAlbColNum), 6, 0));
            AV37TFAlbColNum_To = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37TFAlbColNum_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV37TFAlbColNum_To), 6, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCODCOD") == 0 )
         {
            AV38TFCodCod = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV38TFCodCod", AV38TFCodCod);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCODCOD_SEL") == 0 )
         {
            AV39TFCodCod_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV39TFCodCod_Sel", AV39TFCodCod_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARALBKGME") == 0 )
         {
            AV40TFBarAlbKgmE = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV40TFBarAlbKgmE", GXutil.ltrimstr( AV40TFBarAlbKgmE, 9, 2));
            AV41TFBarAlbKgmE_To = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV41TFBarAlbKgmE_To", GXutil.ltrimstr( AV41TFBarAlbKgmE_To, 9, 2));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARPREKGM") == 0 )
         {
            AV42TFBarPreKgm = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV42TFBarPreKgm", GXutil.ltrimstr( AV42TFBarPreKgm, 13, 5));
            AV43TFBarPreKgm_To = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV43TFBarPreKgm_To", GXutil.ltrimstr( AV43TFBarPreKgm_To, 13, 5));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBHDRANC") == 0 )
         {
            AV44TFAlbHdrAnc = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV44TFAlbHdrAnc", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV44TFAlbHdrAnc), 4, 0));
            AV45TFAlbHdrAnc_To = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV45TFAlbHdrAnc_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV45TFAlbHdrAnc_To), 4, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBHDRGM2") == 0 )
         {
            AV46TFAlbHdrgm2 = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV46TFAlbHdrgm2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV46TFAlbHdrgm2), 4, 0));
            AV47TFAlbHdrgm2_To = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47TFAlbHdrgm2_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV47TFAlbHdrgm2_To), 4, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARALBMTRE") == 0 )
         {
            AV48TFBarAlbMtrE = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV48TFBarAlbMtrE", GXutil.ltrimstr( AV48TFBarAlbMtrE, 9, 2));
            AV49TFBarAlbMtrE_To = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV49TFBarAlbMtrE_To", GXutil.ltrimstr( AV49TFBarAlbMtrE_To, 9, 2));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARPREMTR") == 0 )
         {
            AV50TFBarPreMtr = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV50TFBarPreMtr", GXutil.ltrimstr( AV50TFBarPreMtr, 13, 5));
            AV51TFBarPreMtr_To = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV51TFBarPreMtr_To", GXutil.ltrimstr( AV51TFBarPreMtr_To, 13, 5));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARALBPIE") == 0 )
         {
            AV52TFBarAlbPie = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV52TFBarAlbPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV52TFBarAlbPie), 6, 0));
            AV53TFBarAlbPie_To = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV53TFBarAlbPie_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV53TFBarAlbPie_To), 6, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBTIRAS") == 0 )
         {
            AV54TFAlbTiras = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV54TFAlbTiras", AV54TFAlbTiras);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBTIRAS_SEL") == 0 )
         {
            AV55TFAlbTiras_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV55TFAlbTiras_Sel", AV55TFAlbTiras_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBTIRASKG") == 0 )
         {
            AV56TFAlbTirasKg = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV56TFAlbTirasKg", GXutil.ltrimstr( AV56TFAlbTirasKg, 9, 2));
            AV57TFAlbTirasKg_To = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV57TFAlbTirasKg_To", GXutil.ltrimstr( AV57TFAlbTirasKg_To, 9, 2));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBSINTEST") == 0 )
         {
            AV58TFAlbSinTest = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV58TFAlbSinTest", AV58TFAlbSinTest);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBSINTEST_SEL") == 0 )
         {
            AV59TFAlbSinTest_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV59TFAlbSinTest_Sel", AV59TFAlbSinTest_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTUBCOD") == 0 )
         {
            AV60TFTubCod = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV60TFTubCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV60TFTubCod), 4, 0));
            AV61TFTubCod_To = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV61TFTubCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV61TFTubCod_To), 4, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARALBTUB") == 0 )
         {
            AV62TFBarAlbTub = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV62TFBarAlbTub", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV62TFBarAlbTub), 6, 0));
            AV63TFBarAlbTub_To = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV63TFBarAlbTub_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV63TFBarAlbTub_To), 6, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBHDROBS") == 0 )
         {
            AV64TFAlbHdrObs = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV64TFAlbHdrObs", AV64TFAlbHdrObs);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBHDROBS_SEL") == 0 )
         {
            AV65TFAlbHdrObs_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV65TFAlbHdrObs_Sel", AV65TFAlbHdrObs_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPLASCOD") == 0 )
         {
            AV66TFPlasCod = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV66TFPlasCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV66TFPlasCod), 4, 0));
            AV67TFPlasCod_To = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV67TFPlasCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV67TFPlasCod_To), 4, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARALBPLAS") == 0 )
         {
            AV68TFBarAlbPlas = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV68TFBarAlbPlas", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV68TFBarAlbPlas), 4, 0));
            AV69TFBarAlbPlas_To = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV69TFBarAlbPlas_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV69TFBarAlbPlas_To), 4, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPACACOD") == 0 )
         {
            AV70TFTipAcaCod = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV70TFTipAcaCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV70TFTipAcaCod), 4, 0));
            AV71TFTipAcaCod_To = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV71TFTipAcaCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV71TFTipAcaCod_To), 4, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBPROVAL_SEL") == 0 )
         {
            AV72TFAlbProVal_SelsJson = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV72TFAlbProVal_SelsJson", AV72TFAlbProVal_SelsJson);
            AV73TFAlbProVal_Sels.fromJSonString(AV72TFAlbProVal_SelsJson, null);
         }
         AV150GXV1 = (int)(AV150GXV1+1) ;
      }
      GXt_char1 = "" ;
      GXv_char6[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV29TFBarCodPar_Sel)==0), AV29TFBarCodPar_Sel, GXv_char6) ;
      albaranguia__ww_impl.this.GXt_char1 = GXv_char6[0] ;
      GXt_char14 = "" ;
      GXv_char5[0] = GXt_char14 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV31TFAlbSer_Sel)==0), AV31TFAlbSer_Sel, GXv_char5) ;
      albaranguia__ww_impl.this.GXt_char14 = GXv_char5[0] ;
      GXt_char15 = "" ;
      GXv_char2[0] = GXt_char15 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV33TFAlbColorCv_Sel)==0), AV33TFAlbColorCv_Sel, GXv_char2) ;
      albaranguia__ww_impl.this.GXt_char15 = GXv_char2[0] ;
      GXt_char16 = "" ;
      GXv_char17[0] = GXt_char16 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV35TFAlbNomCli_Sel)==0), AV35TFAlbNomCli_Sel, GXv_char17) ;
      albaranguia__ww_impl.this.GXt_char16 = GXv_char17[0] ;
      GXt_char18 = "" ;
      GXv_char19[0] = GXt_char18 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV39TFCodCod_Sel)==0), AV39TFCodCod_Sel, GXv_char19) ;
      albaranguia__ww_impl.this.GXt_char18 = GXv_char19[0] ;
      GXt_char20 = "" ;
      GXv_char21[0] = GXt_char20 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV55TFAlbTiras_Sel)==0), AV55TFAlbTiras_Sel, GXv_char21) ;
      albaranguia__ww_impl.this.GXt_char20 = GXv_char21[0] ;
      GXt_char22 = "" ;
      GXv_char23[0] = GXt_char22 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV59TFAlbSinTest_Sel)==0), AV59TFAlbSinTest_Sel, GXv_char23) ;
      albaranguia__ww_impl.this.GXt_char22 = GXv_char23[0] ;
      GXt_char24 = "" ;
      GXv_char25[0] = GXt_char24 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV65TFAlbHdrObs_Sel)==0), AV65TFAlbHdrObs_Sel, GXv_char25) ;
      albaranguia__ww_impl.this.GXt_char24 = GXv_char25[0] ;
      GXt_char26 = "" ;
      GXv_char27[0] = GXt_char26 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (AV73TFAlbProVal_Sels.size()==0), AV72TFAlbProVal_SelsJson, GXv_char27) ;
      albaranguia__ww_impl.this.GXt_char26 = GXv_char27[0] ;
      Ddo_grid_Selectedvalue_set = "||"+GXt_char1+"|"+GXt_char14+"|"+GXt_char15+"|"+GXt_char16+"||"+GXt_char18+"||||||||"+GXt_char20+"||"+GXt_char22+"|||"+GXt_char24+"||||"+GXt_char26 ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      GXt_char26 = "" ;
      GXv_char27[0] = GXt_char26 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV28TFBarCodPar)==0), AV28TFBarCodPar, GXv_char27) ;
      albaranguia__ww_impl.this.GXt_char26 = GXv_char27[0] ;
      GXt_char24 = "" ;
      GXv_char25[0] = GXt_char24 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV30TFAlbSer)==0), AV30TFAlbSer, GXv_char25) ;
      albaranguia__ww_impl.this.GXt_char24 = GXv_char25[0] ;
      GXt_char22 = "" ;
      GXv_char23[0] = GXt_char22 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV32TFAlbColorCv)==0), AV32TFAlbColorCv, GXv_char23) ;
      albaranguia__ww_impl.this.GXt_char22 = GXv_char23[0] ;
      GXt_char20 = "" ;
      GXv_char21[0] = GXt_char20 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV34TFAlbNomCli)==0), AV34TFAlbNomCli, GXv_char21) ;
      albaranguia__ww_impl.this.GXt_char20 = GXv_char21[0] ;
      GXt_char18 = "" ;
      GXv_char19[0] = GXt_char18 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV38TFCodCod)==0), AV38TFCodCod, GXv_char19) ;
      albaranguia__ww_impl.this.GXt_char18 = GXv_char19[0] ;
      GXt_char16 = "" ;
      GXv_char17[0] = GXt_char16 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV54TFAlbTiras)==0), AV54TFAlbTiras, GXv_char17) ;
      albaranguia__ww_impl.this.GXt_char16 = GXv_char17[0] ;
      GXt_char15 = "" ;
      GXv_char6[0] = GXt_char15 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV58TFAlbSinTest)==0), AV58TFAlbSinTest, GXv_char6) ;
      albaranguia__ww_impl.this.GXt_char15 = GXv_char6[0] ;
      GXt_char14 = "" ;
      GXv_char5[0] = GXt_char14 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV64TFAlbHdrObs)==0), AV64TFAlbHdrObs, GXv_char5) ;
      albaranguia__ww_impl.this.GXt_char14 = GXv_char5[0] ;
      Ddo_grid_Filteredtext_set = ((0==AV24TFBarCod) ? "" : GXutil.str( AV24TFBarCod, 8, 0))+"|"+((0==AV26TFBarCodReo) ? "" : GXutil.str( AV26TFBarCodReo, 1, 0))+"|"+GXt_char26+"|"+GXt_char24+"|"+GXt_char22+"|"+GXt_char20+"|"+((0==AV36TFAlbColNum) ? "" : GXutil.str( AV36TFAlbColNum, 6, 0))+"|"+GXt_char18+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV40TFBarAlbKgmE)==0) ? "" : GXutil.str( AV40TFBarAlbKgmE, 9, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV42TFBarPreKgm)==0) ? "" : GXutil.str( AV42TFBarPreKgm, 13, 5))+"|"+((0==AV44TFAlbHdrAnc) ? "" : GXutil.str( AV44TFAlbHdrAnc, 4, 0))+"|"+((0==AV46TFAlbHdrgm2) ? "" : GXutil.str( AV46TFAlbHdrgm2, 4, 0))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV48TFBarAlbMtrE)==0) ? "" : GXutil.str( AV48TFBarAlbMtrE, 9, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV50TFBarPreMtr)==0) ? "" : GXutil.str( AV50TFBarPreMtr, 13, 5))+"|"+((0==AV52TFBarAlbPie) ? "" : GXutil.str( AV52TFBarAlbPie, 6, 0))+"|"+GXt_char16+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV56TFAlbTirasKg)==0) ? "" : GXutil.str( AV56TFAlbTirasKg, 9, 2))+"|"+GXt_char15+"|"+((0==AV60TFTubCod) ? "" : GXutil.str( AV60TFTubCod, 4, 0))+"|"+((0==AV62TFBarAlbTub) ? "" : GXutil.str( AV62TFBarAlbTub, 6, 0))+"|"+GXt_char14+"|"+((0==AV66TFPlasCod) ? "" : GXutil.str( AV66TFPlasCod, 4, 0))+"|"+((0==AV68TFBarAlbPlas) ? "" : GXutil.str( AV68TFBarAlbPlas, 4, 0))+"|"+((0==AV70TFTipAcaCod) ? "" : GXutil.str( AV70TFTipAcaCod, 4, 0))+"|" ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = ((0==AV25TFBarCod_To) ? "" : GXutil.str( AV25TFBarCod_To, 8, 0))+"|"+((0==AV27TFBarCodReo_To) ? "" : GXutil.str( AV27TFBarCodReo_To, 1, 0))+"|||||"+((0==AV37TFAlbColNum_To) ? "" : GXutil.str( AV37TFAlbColNum_To, 6, 0))+"||"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV41TFBarAlbKgmE_To)==0) ? "" : GXutil.str( AV41TFBarAlbKgmE_To, 9, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV43TFBarPreKgm_To)==0) ? "" : GXutil.str( AV43TFBarPreKgm_To, 13, 5))+"|"+((0==AV45TFAlbHdrAnc_To) ? "" : GXutil.str( AV45TFAlbHdrAnc_To, 4, 0))+"|"+((0==AV47TFAlbHdrgm2_To) ? "" : GXutil.str( AV47TFAlbHdrgm2_To, 4, 0))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV49TFBarAlbMtrE_To)==0) ? "" : GXutil.str( AV49TFBarAlbMtrE_To, 9, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV51TFBarPreMtr_To)==0) ? "" : GXutil.str( AV51TFBarPreMtr_To, 13, 5))+"|"+((0==AV53TFBarAlbPie_To) ? "" : GXutil.str( AV53TFBarAlbPie_To, 6, 0))+"||"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV57TFAlbTirasKg_To)==0) ? "" : GXutil.str( AV57TFAlbTirasKg_To, 9, 2))+"||"+((0==AV61TFTubCod_To) ? "" : GXutil.str( AV61TFTubCod_To, 4, 0))+"|"+((0==AV63TFBarAlbTub_To) ? "" : GXutil.str( AV63TFBarAlbTub_To, 6, 0))+"||"+((0==AV67TFPlasCod_To) ? "" : GXutil.str( AV67TFPlasCod_To, 4, 0))+"|"+((0==AV69TFBarAlbPlas_To) ? "" : GXutil.str( AV69TFBarAlbPlas_To, 4, 0))+"|"+((0==AV71TFTipAcaCod_To) ? "" : GXutil.str( AV71TFTipAcaCod_To, 4, 0))+"|" ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
   }

   public void S172( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV10GridState.fromxml(AV20Session.getValue(AV95Pgmname+"GridState"), null, null);
      AV10GridState.setgxTv_SdtWWPGridState_Orderedby( AV12OrderedBy );
      AV10GridState.setgxTv_SdtWWPGridState_Ordereddsc( AV13OrderedDsc );
      AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState28[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState28, "FILTERFULLTEXT", "", !(GXutil.strcmp("", AV15FilterFullText)==0), (short)(0), AV15FilterFullText, "") ;
      AV10GridState = GXv_SdtWWPGridState28[0] ;
      GXv_SdtWWPGridState28[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState28, "TFBARCOD", "", !((0==AV24TFBarCod)&&(0==AV25TFBarCod_To)), (short)(0), GXutil.trim( GXutil.str( AV24TFBarCod, 8, 0)), GXutil.trim( GXutil.str( AV25TFBarCod_To, 8, 0))) ;
      AV10GridState = GXv_SdtWWPGridState28[0] ;
      GXv_SdtWWPGridState28[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState28, "TFBARCODREO", "", !((0==AV26TFBarCodReo)&&(0==AV27TFBarCodReo_To)), (short)(0), GXutil.trim( GXutil.str( AV26TFBarCodReo, 1, 0)), GXutil.trim( GXutil.str( AV27TFBarCodReo_To, 1, 0))) ;
      AV10GridState = GXv_SdtWWPGridState28[0] ;
      GXv_SdtWWPGridState28[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState28, "TFBARCODPAR", "", !(GXutil.strcmp("", AV28TFBarCodPar)==0), (short)(0), AV28TFBarCodPar, "", !(GXutil.strcmp("", AV29TFBarCodPar_Sel)==0), AV29TFBarCodPar_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState28[0] ;
      GXv_SdtWWPGridState28[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState28, "TFALBSER", "", !(GXutil.strcmp("", AV30TFAlbSer)==0), (short)(0), AV30TFAlbSer, "", !(GXutil.strcmp("", AV31TFAlbSer_Sel)==0), AV31TFAlbSer_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState28[0] ;
      GXv_SdtWWPGridState28[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState28, "TFALBCOLORCV", "", !(GXutil.strcmp("", AV32TFAlbColorCv)==0), (short)(0), AV32TFAlbColorCv, "", !(GXutil.strcmp("", AV33TFAlbColorCv_Sel)==0), AV33TFAlbColorCv_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState28[0] ;
      GXv_SdtWWPGridState28[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState28, "TFALBNOMCLI", "", !(GXutil.strcmp("", AV34TFAlbNomCli)==0), (short)(0), AV34TFAlbNomCli, "", !(GXutil.strcmp("", AV35TFAlbNomCli_Sel)==0), AV35TFAlbNomCli_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState28[0] ;
      GXv_SdtWWPGridState28[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState28, "TFALBCOLNUM", "", !((0==AV36TFAlbColNum)&&(0==AV37TFAlbColNum_To)), (short)(0), GXutil.trim( GXutil.str( AV36TFAlbColNum, 6, 0)), GXutil.trim( GXutil.str( AV37TFAlbColNum_To, 6, 0))) ;
      AV10GridState = GXv_SdtWWPGridState28[0] ;
      GXv_SdtWWPGridState28[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState28, "TFCODCOD", "", !(GXutil.strcmp("", AV38TFCodCod)==0), (short)(0), AV38TFCodCod, "", !(GXutil.strcmp("", AV39TFCodCod_Sel)==0), AV39TFCodCod_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState28[0] ;
      GXv_SdtWWPGridState28[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState28, "TFBARALBKGME", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV40TFBarAlbKgmE)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV41TFBarAlbKgmE_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV40TFBarAlbKgmE, 9, 2)), GXutil.trim( GXutil.str( AV41TFBarAlbKgmE_To, 9, 2))) ;
      AV10GridState = GXv_SdtWWPGridState28[0] ;
      GXv_SdtWWPGridState28[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState28, "TFBARPREKGM", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV42TFBarPreKgm)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV43TFBarPreKgm_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV42TFBarPreKgm, 13, 5)), GXutil.trim( GXutil.str( AV43TFBarPreKgm_To, 13, 5))) ;
      AV10GridState = GXv_SdtWWPGridState28[0] ;
      GXv_SdtWWPGridState28[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState28, "TFALBHDRANC", "", !((0==AV44TFAlbHdrAnc)&&(0==AV45TFAlbHdrAnc_To)), (short)(0), GXutil.trim( GXutil.str( AV44TFAlbHdrAnc, 4, 0)), GXutil.trim( GXutil.str( AV45TFAlbHdrAnc_To, 4, 0))) ;
      AV10GridState = GXv_SdtWWPGridState28[0] ;
      GXv_SdtWWPGridState28[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState28, "TFALBHDRGM2", "", !((0==AV46TFAlbHdrgm2)&&(0==AV47TFAlbHdrgm2_To)), (short)(0), GXutil.trim( GXutil.str( AV46TFAlbHdrgm2, 4, 0)), GXutil.trim( GXutil.str( AV47TFAlbHdrgm2_To, 4, 0))) ;
      AV10GridState = GXv_SdtWWPGridState28[0] ;
      GXv_SdtWWPGridState28[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState28, "TFBARALBMTRE", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV48TFBarAlbMtrE)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV49TFBarAlbMtrE_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV48TFBarAlbMtrE, 9, 2)), GXutil.trim( GXutil.str( AV49TFBarAlbMtrE_To, 9, 2))) ;
      AV10GridState = GXv_SdtWWPGridState28[0] ;
      GXv_SdtWWPGridState28[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState28, "TFBARPREMTR", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV50TFBarPreMtr)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV51TFBarPreMtr_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV50TFBarPreMtr, 13, 5)), GXutil.trim( GXutil.str( AV51TFBarPreMtr_To, 13, 5))) ;
      AV10GridState = GXv_SdtWWPGridState28[0] ;
      GXv_SdtWWPGridState28[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState28, "TFBARALBPIE", "", !((0==AV52TFBarAlbPie)&&(0==AV53TFBarAlbPie_To)), (short)(0), GXutil.trim( GXutil.str( AV52TFBarAlbPie, 6, 0)), GXutil.trim( GXutil.str( AV53TFBarAlbPie_To, 6, 0))) ;
      AV10GridState = GXv_SdtWWPGridState28[0] ;
      GXv_SdtWWPGridState28[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState28, "TFALBTIRAS", "", !(GXutil.strcmp("", AV54TFAlbTiras)==0), (short)(0), AV54TFAlbTiras, "", !(GXutil.strcmp("", AV55TFAlbTiras_Sel)==0), AV55TFAlbTiras_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState28[0] ;
      GXv_SdtWWPGridState28[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState28, "TFALBTIRASKG", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV56TFAlbTirasKg)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV57TFAlbTirasKg_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV56TFAlbTirasKg, 9, 2)), GXutil.trim( GXutil.str( AV57TFAlbTirasKg_To, 9, 2))) ;
      AV10GridState = GXv_SdtWWPGridState28[0] ;
      GXv_SdtWWPGridState28[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState28, "TFALBSINTEST", "", !(GXutil.strcmp("", AV58TFAlbSinTest)==0), (short)(0), AV58TFAlbSinTest, "", !(GXutil.strcmp("", AV59TFAlbSinTest_Sel)==0), AV59TFAlbSinTest_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState28[0] ;
      GXv_SdtWWPGridState28[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState28, "TFTUBCOD", "", !((0==AV60TFTubCod)&&(0==AV61TFTubCod_To)), (short)(0), GXutil.trim( GXutil.str( AV60TFTubCod, 4, 0)), GXutil.trim( GXutil.str( AV61TFTubCod_To, 4, 0))) ;
      AV10GridState = GXv_SdtWWPGridState28[0] ;
      GXv_SdtWWPGridState28[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState28, "TFBARALBTUB", "", !((0==AV62TFBarAlbTub)&&(0==AV63TFBarAlbTub_To)), (short)(0), GXutil.trim( GXutil.str( AV62TFBarAlbTub, 6, 0)), GXutil.trim( GXutil.str( AV63TFBarAlbTub_To, 6, 0))) ;
      AV10GridState = GXv_SdtWWPGridState28[0] ;
      GXv_SdtWWPGridState28[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState28, "TFALBHDROBS", "", !(GXutil.strcmp("", AV64TFAlbHdrObs)==0), (short)(0), AV64TFAlbHdrObs, "", !(GXutil.strcmp("", AV65TFAlbHdrObs_Sel)==0), AV65TFAlbHdrObs_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState28[0] ;
      GXv_SdtWWPGridState28[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState28, "TFPLASCOD", "", !((0==AV66TFPlasCod)&&(0==AV67TFPlasCod_To)), (short)(0), GXutil.trim( GXutil.str( AV66TFPlasCod, 4, 0)), GXutil.trim( GXutil.str( AV67TFPlasCod_To, 4, 0))) ;
      AV10GridState = GXv_SdtWWPGridState28[0] ;
      GXv_SdtWWPGridState28[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState28, "TFBARALBPLAS", "", !((0==AV68TFBarAlbPlas)&&(0==AV69TFBarAlbPlas_To)), (short)(0), GXutil.trim( GXutil.str( AV68TFBarAlbPlas, 4, 0)), GXutil.trim( GXutil.str( AV69TFBarAlbPlas_To, 4, 0))) ;
      AV10GridState = GXv_SdtWWPGridState28[0] ;
      GXv_SdtWWPGridState28[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState28, "TFTIPACACOD", "", !((0==AV70TFTipAcaCod)&&(0==AV71TFTipAcaCod_To)), (short)(0), GXutil.trim( GXutil.str( AV70TFTipAcaCod, 4, 0)), GXutil.trim( GXutil.str( AV71TFTipAcaCod_To, 4, 0))) ;
      AV10GridState = GXv_SdtWWPGridState28[0] ;
      GXv_SdtWWPGridState28[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState28, "TFALBPROVAL_SEL", "", !(AV73TFAlbProVal_Sels.size()==0), (short)(0), AV73TFAlbProVal_Sels.toJSonString(false), "") ;
      AV10GridState = GXv_SdtWWPGridState28[0] ;
      AV10GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV10GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV95Pgmname+"GridState", AV10GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S132( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV8TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV95Pgmname );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( true );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV7HTTPRequest.getScriptName()+"?"+AV7HTTPRequest.getQuerystring() );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "Albaranes.AlbaranGuia" );
      AV20Session.setValue("TrnContext", AV8TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   public void S112( )
   {
      /* 'ATTRIBUTESSECURITYCODE' Routine */
      returnInSub = false ;
      if ( ! ( AV84VisualizarAcciones ) )
      {
         divDvpanel_tablealbaran_cell_Class = "Invisible" ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, divDvpanel_tablealbaran_cell_Internalname, "Class", divDvpanel_tablealbaran_cell_Class, true);
      }
      else
      {
         divDvpanel_tablealbaran_cell_Class = "col-xs-12" ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, divDvpanel_tablealbaran_cell_Internalname, "Class", divDvpanel_tablealbaran_cell_Class, true);
      }
   }

   public void wb_table1_51_1XC2( boolean wbgen )
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
         ucDdo_managefilters.render(context, "dvelop.gxbootstrap.ddoregular", Ddo_managefilters_Internalname, sPrefix+"DDO_MANAGEFILTERSContainer");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table2_56_1XC2( true) ;
      }
      else
      {
         wb_table2_56_1XC2( false) ;
      }
      return  ;
   }

   public void wb_table2_56_1XC2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_51_1XC2e( true) ;
      }
      else
      {
         wb_table1_51_1XC2e( false) ;
      }
   }

   public void wb_table2_56_1XC2( boolean wbgen )
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 60,'" + sPrefix + "',false,'" + sGXsfl_69_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFilterfulltext_Internalname, AV15FilterFullText, GXutil.rtrim( localUtil.format( AV15FilterFullText, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,60);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", httpContext.getMessage( "WWP_Search", ""), edtavFilterfulltext_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavFilterfulltext_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "WWPFullTextFilter", "left", true, "", "HLP_Albaranes\\AlbaranGuia__WW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_56_1XC2e( true) ;
      }
      else
      {
         wb_table2_56_1XC2e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      A396EmprCod = (String)getParm(obj,0,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
      A30AlbProCod = ((Number) GXutil.testNumericType( getParm(obj,1,TypeConstants.LONG), TypeConstants.LONG)).longValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
      AV84VisualizarAcciones = ((Boolean) getParm(obj,2,TypeConstants.BOOLEAN)).booleanValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV84VisualizarAcciones", AV84VisualizarAcciones);
      AV85AccionesEnPopup = ((Boolean) getParm(obj,3,TypeConstants.BOOLEAN)).booleanValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV85AccionesEnPopup", AV85AccionesEnPopup);
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
      pa1XC2( ) ;
      ws1XC2( ) ;
      we1XC2( ) ;
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
      sCtrlA396EmprCod = (String)getParm(obj,0,TypeConstants.STRING) ;
      sCtrlA30AlbProCod = (String)getParm(obj,1,TypeConstants.STRING) ;
      sCtrlAV84VisualizarAcciones = (String)getParm(obj,2,TypeConstants.STRING) ;
      sCtrlAV85AccionesEnPopup = (String)getParm(obj,3,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      pa1XC2( ) ;
      wcparametersget( ) ;
   }

   @SuppressWarnings("unchecked")
   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "albaranes\\albaranguia__ww", GetJustCreated( ));
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
         init_web_controls( ) ;
      }
      pa1XC2( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         A396EmprCod = (String)getParm(obj,2,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
         A30AlbProCod = ((Number) GXutil.testNumericType( getParm(obj,3,TypeConstants.LONG), TypeConstants.LONG)).longValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
         AV84VisualizarAcciones = ((Boolean) getParm(obj,4,TypeConstants.BOOLEAN)).booleanValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV84VisualizarAcciones", AV84VisualizarAcciones);
         AV85AccionesEnPopup = ((Boolean) getParm(obj,5,TypeConstants.BOOLEAN)).booleanValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV85AccionesEnPopup", AV85AccionesEnPopup);
      }
      wcpOA396EmprCod = httpContext.cgiGet( sPrefix+"wcpOA396EmprCod") ;
      wcpOA30AlbProCod = localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOA30AlbProCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
      wcpOAV84VisualizarAcciones = GXutil.strtobool( httpContext.cgiGet( sPrefix+"wcpOAV84VisualizarAcciones")) ;
      wcpOAV85AccionesEnPopup = GXutil.strtobool( httpContext.cgiGet( sPrefix+"wcpOAV85AccionesEnPopup")) ;
      if ( ! GetJustCreated( ) && ( ( GXutil.strcmp(A396EmprCod, wcpOA396EmprCod) != 0 ) || ( A30AlbProCod != wcpOA30AlbProCod ) || ( AV84VisualizarAcciones != wcpOAV84VisualizarAcciones ) || ( AV85AccionesEnPopup != wcpOAV85AccionesEnPopup ) ) )
      {
         setjustcreated();
      }
      wcpOA396EmprCod = A396EmprCod ;
      wcpOA30AlbProCod = A30AlbProCod ;
      wcpOAV84VisualizarAcciones = AV84VisualizarAcciones ;
      wcpOAV85AccionesEnPopup = AV85AccionesEnPopup ;
   }

   public void wcparametersget( )
   {
      /* Read Component Parameters. */
      sCtrlA396EmprCod = httpContext.cgiGet( sPrefix+"A396EmprCod_CTRL") ;
      if ( GXutil.len( sCtrlA396EmprCod) > 0 )
      {
         A396EmprCod = httpContext.cgiGet( sCtrlA396EmprCod) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
      }
      else
      {
         A396EmprCod = httpContext.cgiGet( sPrefix+"A396EmprCod_PARM") ;
      }
      sCtrlA30AlbProCod = httpContext.cgiGet( sPrefix+"A30AlbProCod_CTRL") ;
      if ( GXutil.len( sCtrlA30AlbProCod) > 0 )
      {
         A30AlbProCod = localUtil.ctol( httpContext.cgiGet( sCtrlA30AlbProCod), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
      }
      else
      {
         A30AlbProCod = localUtil.ctol( httpContext.cgiGet( sPrefix+"A30AlbProCod_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
      }
      sCtrlAV84VisualizarAcciones = httpContext.cgiGet( sPrefix+"AV84VisualizarAcciones_CTRL") ;
      if ( GXutil.len( sCtrlAV84VisualizarAcciones) > 0 )
      {
         AV84VisualizarAcciones = GXutil.strtobool( httpContext.cgiGet( sCtrlAV84VisualizarAcciones)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV84VisualizarAcciones", AV84VisualizarAcciones);
      }
      else
      {
         AV84VisualizarAcciones = GXutil.strtobool( httpContext.cgiGet( sPrefix+"AV84VisualizarAcciones_PARM")) ;
      }
      sCtrlAV85AccionesEnPopup = httpContext.cgiGet( sPrefix+"AV85AccionesEnPopup_CTRL") ;
      if ( GXutil.len( sCtrlAV85AccionesEnPopup) > 0 )
      {
         AV85AccionesEnPopup = GXutil.strtobool( httpContext.cgiGet( sCtrlAV85AccionesEnPopup)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV85AccionesEnPopup", AV85AccionesEnPopup);
      }
      else
      {
         AV85AccionesEnPopup = GXutil.strtobool( httpContext.cgiGet( sPrefix+"AV85AccionesEnPopup_PARM")) ;
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
      pa1XC2( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      ws1XC2( ) ;
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
      ws1XC2( ) ;
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void wcparametersset( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"A396EmprCod_PARM", GXutil.rtrim( A396EmprCod));
      if ( GXutil.len( GXutil.rtrim( sCtrlA396EmprCod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"A396EmprCod_CTRL", GXutil.rtrim( sCtrlA396EmprCod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"A30AlbProCod_PARM", GXutil.ltrim( localUtil.ntoc( A30AlbProCod, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlA30AlbProCod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"A30AlbProCod_CTRL", GXutil.rtrim( sCtrlA30AlbProCod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV84VisualizarAcciones_PARM", GXutil.booltostr( AV84VisualizarAcciones));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV84VisualizarAcciones)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV84VisualizarAcciones_CTRL", GXutil.rtrim( sCtrlAV84VisualizarAcciones));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV85AccionesEnPopup_PARM", GXutil.booltostr( AV85AccionesEnPopup));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV85AccionesEnPopup)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV85AccionesEnPopup_CTRL", GXutil.rtrim( sCtrlAV85AccionesEnPopup));
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
      we1XC2( ) ;
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
      if ( ! ( WebComp_Grid_dwc == null ) )
      {
         WebComp_Grid_dwc.componentjscripts();
      }
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
      if ( ! ( WebComp_Grid_dwc == null ) )
      {
         if ( GXutil.len( WebComp_Grid_dwc_Component) != 0 )
         {
            WebComp_Grid_dwc.componentthemes();
         }
      }
      boolean outputEnabled = httpContext.isOutputEnabled( );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableOutput();
      }
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268211695546", true, true);
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
      httpContext.AddJavascriptSource("albaranes/albaranguia__ww.js", "?20268211695546", false, true);
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

   public void subsflControlProps_692( )
   {
      edtavDetailwebcomponent_Internalname = sPrefix+"vDETAILWEBCOMPONENT_"+sGXsfl_69_idx ;
      edtavUpdate_Internalname = sPrefix+"vUPDATE_"+sGXsfl_69_idx ;
      edtavDelete_Internalname = sPrefix+"vDELETE_"+sGXsfl_69_idx ;
      edtBarCod_Internalname = sPrefix+"BARCOD_"+sGXsfl_69_idx ;
      edtBarCodReo_Internalname = sPrefix+"BARCODREO_"+sGXsfl_69_idx ;
      edtBarCodPar_Internalname = sPrefix+"BARCODPAR_"+sGXsfl_69_idx ;
      edtAlbSer_Internalname = sPrefix+"ALBSER_"+sGXsfl_69_idx ;
      edtAlbTipArt_Internalname = sPrefix+"ALBTIPART_"+sGXsfl_69_idx ;
      edtAlbColorCv_Internalname = sPrefix+"ALBCOLORCV_"+sGXsfl_69_idx ;
      edtAlbNomCli_Internalname = sPrefix+"ALBNOMCLI_"+sGXsfl_69_idx ;
      edtAlbColNum_Internalname = sPrefix+"ALBCOLNUM_"+sGXsfl_69_idx ;
      edtCodCod_Internalname = sPrefix+"CODCOD_"+sGXsfl_69_idx ;
      edtBarAlbKgmE_Internalname = sPrefix+"BARALBKGME_"+sGXsfl_69_idx ;
      edtBarPreKgm_Internalname = sPrefix+"BARPREKGM_"+sGXsfl_69_idx ;
      edtAlbHdrAnc_Internalname = sPrefix+"ALBHDRANC_"+sGXsfl_69_idx ;
      edtAlbHdrgm2_Internalname = sPrefix+"ALBHDRGM2_"+sGXsfl_69_idx ;
      edtBarAlbMtrE_Internalname = sPrefix+"BARALBMTRE_"+sGXsfl_69_idx ;
      edtBarPreMtr_Internalname = sPrefix+"BARPREMTR_"+sGXsfl_69_idx ;
      edtBarAlbPie_Internalname = sPrefix+"BARALBPIE_"+sGXsfl_69_idx ;
      edtAlbTiras_Internalname = sPrefix+"ALBTIRAS_"+sGXsfl_69_idx ;
      edtAlbTirasKg_Internalname = sPrefix+"ALBTIRASKG_"+sGXsfl_69_idx ;
      edtAlbSinTest_Internalname = sPrefix+"ALBSINTEST_"+sGXsfl_69_idx ;
      edtTubCod_Internalname = sPrefix+"TUBCOD_"+sGXsfl_69_idx ;
      edtBarAlbTub_Internalname = sPrefix+"BARALBTUB_"+sGXsfl_69_idx ;
      edtAlbHdrObs_Internalname = sPrefix+"ALBHDROBS_"+sGXsfl_69_idx ;
      edtPlasCod_Internalname = sPrefix+"PLASCOD_"+sGXsfl_69_idx ;
      edtBarAlbPlas_Internalname = sPrefix+"BARALBPLAS_"+sGXsfl_69_idx ;
      edtTipAcaCod_Internalname = sPrefix+"TIPACACOD_"+sGXsfl_69_idx ;
      cmbAlbProVal.setInternalname( sPrefix+"ALBPROVAL_"+sGXsfl_69_idx );
      edtAlbLic_Internalname = sPrefix+"ALBLIC_"+sGXsfl_69_idx ;
      edtAlbSec_Internalname = sPrefix+"ALBSEC_"+sGXsfl_69_idx ;
   }

   public void subsflControlProps_fel_692( )
   {
      edtavDetailwebcomponent_Internalname = sPrefix+"vDETAILWEBCOMPONENT_"+sGXsfl_69_fel_idx ;
      edtavUpdate_Internalname = sPrefix+"vUPDATE_"+sGXsfl_69_fel_idx ;
      edtavDelete_Internalname = sPrefix+"vDELETE_"+sGXsfl_69_fel_idx ;
      edtBarCod_Internalname = sPrefix+"BARCOD_"+sGXsfl_69_fel_idx ;
      edtBarCodReo_Internalname = sPrefix+"BARCODREO_"+sGXsfl_69_fel_idx ;
      edtBarCodPar_Internalname = sPrefix+"BARCODPAR_"+sGXsfl_69_fel_idx ;
      edtAlbSer_Internalname = sPrefix+"ALBSER_"+sGXsfl_69_fel_idx ;
      edtAlbTipArt_Internalname = sPrefix+"ALBTIPART_"+sGXsfl_69_fel_idx ;
      edtAlbColorCv_Internalname = sPrefix+"ALBCOLORCV_"+sGXsfl_69_fel_idx ;
      edtAlbNomCli_Internalname = sPrefix+"ALBNOMCLI_"+sGXsfl_69_fel_idx ;
      edtAlbColNum_Internalname = sPrefix+"ALBCOLNUM_"+sGXsfl_69_fel_idx ;
      edtCodCod_Internalname = sPrefix+"CODCOD_"+sGXsfl_69_fel_idx ;
      edtBarAlbKgmE_Internalname = sPrefix+"BARALBKGME_"+sGXsfl_69_fel_idx ;
      edtBarPreKgm_Internalname = sPrefix+"BARPREKGM_"+sGXsfl_69_fel_idx ;
      edtAlbHdrAnc_Internalname = sPrefix+"ALBHDRANC_"+sGXsfl_69_fel_idx ;
      edtAlbHdrgm2_Internalname = sPrefix+"ALBHDRGM2_"+sGXsfl_69_fel_idx ;
      edtBarAlbMtrE_Internalname = sPrefix+"BARALBMTRE_"+sGXsfl_69_fel_idx ;
      edtBarPreMtr_Internalname = sPrefix+"BARPREMTR_"+sGXsfl_69_fel_idx ;
      edtBarAlbPie_Internalname = sPrefix+"BARALBPIE_"+sGXsfl_69_fel_idx ;
      edtAlbTiras_Internalname = sPrefix+"ALBTIRAS_"+sGXsfl_69_fel_idx ;
      edtAlbTirasKg_Internalname = sPrefix+"ALBTIRASKG_"+sGXsfl_69_fel_idx ;
      edtAlbSinTest_Internalname = sPrefix+"ALBSINTEST_"+sGXsfl_69_fel_idx ;
      edtTubCod_Internalname = sPrefix+"TUBCOD_"+sGXsfl_69_fel_idx ;
      edtBarAlbTub_Internalname = sPrefix+"BARALBTUB_"+sGXsfl_69_fel_idx ;
      edtAlbHdrObs_Internalname = sPrefix+"ALBHDROBS_"+sGXsfl_69_fel_idx ;
      edtPlasCod_Internalname = sPrefix+"PLASCOD_"+sGXsfl_69_fel_idx ;
      edtBarAlbPlas_Internalname = sPrefix+"BARALBPLAS_"+sGXsfl_69_fel_idx ;
      edtTipAcaCod_Internalname = sPrefix+"TIPACACOD_"+sGXsfl_69_fel_idx ;
      cmbAlbProVal.setInternalname( sPrefix+"ALBPROVAL_"+sGXsfl_69_fel_idx );
      edtAlbLic_Internalname = sPrefix+"ALBLIC_"+sGXsfl_69_fel_idx ;
      edtAlbSec_Internalname = sPrefix+"ALBSEC_"+sGXsfl_69_fel_idx ;
   }

   public void sendrow_692( )
   {
      subsflControlProps_692( ) ;
      wb1XC0( ) ;
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
            httpContext.writeText( " class=\""+"GridWithPaginationBar GridNoBorder WorkWith"+"\" style=\""+""+"\"") ;
            httpContext.writeText( " gxrow=\""+sGXsfl_69_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavDetailwebcomponent_Enabled!=0)&&(edtavDetailwebcomponent_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 70,'"+sPrefix+"',false,'"+sGXsfl_69_idx+"',69)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavDetailwebcomponent_Internalname,GXutil.rtrim( AV83DetailWebComponent),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavDetailwebcomponent_Enabled!=0)&&(edtavDetailwebcomponent_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,70);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+"e221xc2_client"+"'","","","","",edtavDetailwebcomponent_Jsonclick,Integer.valueOf(7),"Attribute","",ROClassString,"WWIconActionColumn WCD_ActionColumn","",Integer.valueOf(-1),Integer.valueOf(edtavDetailwebcomponent_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(1),Integer.valueOf(69),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavUpdate_Enabled!=0)&&(edtavUpdate_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 71,'"+sPrefix+"',false,'"+sGXsfl_69_idx+"',69)\"" : " ") ;
         ROClassString = edtavUpdate_Class ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavUpdate_Internalname,GXutil.rtrim( AV86Update),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavUpdate_Enabled!=0)&&(edtavUpdate_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,71);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+sPrefix+"EVUPDATE.CLICK."+sGXsfl_69_idx+"'","","",httpContext.getMessage( "GXM_update", ""),"",edtavUpdate_Jsonclick,Integer.valueOf(5),edtavUpdate_Class,"",ROClassString,"WWActionColumn","",Integer.valueOf(-1),Integer.valueOf(edtavUpdate_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(69),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavDelete_Enabled!=0)&&(edtavDelete_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 72,'"+sPrefix+"',false,'"+sGXsfl_69_idx+"',69)\"" : " ") ;
         ROClassString = edtavDelete_Class ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavDelete_Internalname,GXutil.rtrim( AV87Delete),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavDelete_Enabled!=0)&&(edtavDelete_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,72);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+sPrefix+"EVDELETE.CLICK."+sGXsfl_69_idx+"'","","",httpContext.getMessage( "GX_BtnDelete", ""),"",edtavDelete_Jsonclick,Integer.valueOf(5),edtavDelete_Class,"",ROClassString,"WWActionColumn","",Integer.valueOf(-1),Integer.valueOf(edtavDelete_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(69),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtBarCod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarCod_Internalname,GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtBarCod_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(69),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtBarCodReo_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarCodReo_Internalname,GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarCodReo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtBarCodReo_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(69),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtBarCodPar_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarCodPar_Internalname,GXutil.rtrim( A130BarCodPar),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarCodPar_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtBarCodPar_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(69),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtAlbSer_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbSer_Internalname,GXutil.rtrim( A3391AlbSer),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtAlbSer_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtAlbSer_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(69),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbTipArt_Internalname,GXutil.ltrim( localUtil.ntoc( A12234AlbTipArt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A12234AlbTipArt), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtAlbTipArt_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(69),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtAlbColorCv_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbColorCv_Internalname,GXutil.rtrim( A14056AlbColorCv),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtAlbColorCv_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtAlbColorCv_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(35),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(69),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtAlbNomCli_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbNomCli_Internalname,GXutil.rtrim( A12232AlbNomCli),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtAlbNomCli_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtAlbNomCli_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(69),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtAlbColNum_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbColNum_Internalname,GXutil.ltrim( localUtil.ntoc( A3393AlbColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A3393AlbColNum), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtAlbColNum_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtAlbColNum_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(69),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtCodCod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCodCod_Internalname,GXutil.rtrim( A3153CodCod),GXutil.rtrim( localUtil.format( A3153CodCod, "XXXXXX")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtCodCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtCodCod_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(69),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtBarAlbKgmE_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarAlbKgmE_Internalname,GXutil.ltrim( localUtil.ntoc( A1261BarAlbKgmE, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A1261BarAlbKgmE, "ZZZZZ9.99")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarAlbKgmE_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtBarAlbKgmE_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(69),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtBarPreKgm_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarPreKgm_Internalname,GXutil.ltrim( localUtil.ntoc( A1262BarPreKgm, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A1262BarPreKgm, "ZZZZZZ9.999")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarPreKgm_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtBarPreKgm_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(69),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtAlbHdrAnc_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbHdrAnc_Internalname,GXutil.ltrim( localUtil.ntoc( A3271AlbHdrAnc, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A3271AlbHdrAnc), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtAlbHdrAnc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtAlbHdrAnc_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(69),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtAlbHdrgm2_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbHdrgm2_Internalname,GXutil.ltrim( localUtil.ntoc( A5019AlbHdrgm2, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A5019AlbHdrgm2), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtAlbHdrgm2_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtAlbHdrgm2_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(69),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtBarAlbMtrE_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarAlbMtrE_Internalname,GXutil.ltrim( localUtil.ntoc( A1263BarAlbMtrE, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A1263BarAlbMtrE, "ZZZZZ9.99")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarAlbMtrE_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtBarAlbMtrE_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(69),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtBarPreMtr_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarPreMtr_Internalname,GXutil.ltrim( localUtil.ntoc( A1264BarPreMtr, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A1264BarPreMtr, "ZZZZZZ9.999")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarPreMtr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtBarPreMtr_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(69),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtBarAlbPie_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarAlbPie_Internalname,GXutil.ltrim( localUtil.ntoc( A1265BarAlbPie, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1265BarAlbPie), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarAlbPie_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtBarAlbPie_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(69),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtAlbTiras_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbTiras_Internalname,GXutil.rtrim( A14057AlbTiras),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtAlbTiras_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtAlbTiras_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(69),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtAlbTirasKg_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbTirasKg_Internalname,GXutil.ltrim( localUtil.ntoc( A14058AlbTirasKg, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A14058AlbTirasKg, "ZZZZZ9.99")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtAlbTirasKg_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtAlbTirasKg_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(69),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtAlbSinTest_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbSinTest_Internalname,GXutil.rtrim( A14059AlbSinTest),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtAlbSinTest_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtAlbSinTest_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(69),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtTubCod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTubCod_Internalname,GXutil.ltrim( localUtil.ntoc( A1206TubCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1206TubCod), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtTubCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtTubCod_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(69),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtBarAlbTub_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarAlbTub_Internalname,GXutil.ltrim( localUtil.ntoc( A1266BarAlbTub, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1266BarAlbTub), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarAlbTub_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtBarAlbTub_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(69),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtAlbHdrObs_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbHdrObs_Internalname,GXutil.rtrim( A2441AlbHdrObs),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtAlbHdrObs_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtAlbHdrObs_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(69),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtPlasCod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPlasCod_Internalname,GXutil.ltrim( localUtil.ntoc( A6466PlasCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A6466PlasCod), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtPlasCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtPlasCod_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(69),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtBarAlbPlas_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarAlbPlas_Internalname,GXutil.ltrim( localUtil.ntoc( A6467BarAlbPlas, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A6467BarAlbPlas), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarAlbPlas_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtBarAlbPlas_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(69),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtTipAcaCod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTipAcaCod_Internalname,GXutil.ltrim( localUtil.ntoc( A5051TipAcaCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A5051TipAcaCod), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtTipAcaCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtTipAcaCod_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(69),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((cmbAlbProVal.getVisible()==0) ? "display:none;" : "")+"\">") ;
         }
         if ( ( cmbAlbProVal.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "ALBPROVAL_" + sGXsfl_69_idx ;
            cmbAlbProVal.setName( GXCCtl );
            cmbAlbProVal.setWebtags( "" );
            cmbAlbProVal.addItem("S", httpContext.getMessage( "Si", ""), (short)(0));
            cmbAlbProVal.addItem("N", httpContext.getMessage( "No", ""), (short)(0));
            if ( cmbAlbProVal.getItemCount() > 0 )
            {
               A2839AlbProVal = cmbAlbProVal.getValidValue(A2839AlbProVal) ;
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbAlbProVal,cmbAlbProVal.getInternalname(),GXutil.rtrim( A2839AlbProVal),Integer.valueOf(1),cmbAlbProVal.getJsonclick(),Integer.valueOf(0),"'"+sPrefix+"'"+",false,"+"'"+""+"'","char","",Integer.valueOf(cmbAlbProVal.getVisible()),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","Attribute","WWColumn","","","",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbAlbProVal.setValue( GXutil.rtrim( A2839AlbProVal) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbAlbProVal.getInternalname(), "Values", cmbAlbProVal.ToJavascriptSource(), !bGXsfl_69_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbLic_Internalname,GXutil.rtrim( A7101AlbLic),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtAlbLic_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(69),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbSec_Internalname,GXutil.rtrim( A2242AlbSec),GXutil.rtrim( localUtil.format( A2242AlbSec, "@!")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtAlbSec_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(69),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         send_integrity_lvl_hashes1XC2( ) ;
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
         httpContext.writeText( "<div id=\""+sPrefix+"GridContainer"+"DivS\" data-gxgridid=\"69\">") ;
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
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+edtavUpdate_Class+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+edtavDelete_Class+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarCod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "OS", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarCodReo_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "R", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarCodPar_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "P", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtAlbSer_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Artigo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtAlbColorCv_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cor", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtAlbNomCli_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cor Cli", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtAlbColNum_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Número", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtCodCod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Serviço", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarAlbKgmE_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Quilos S.", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarPreKgm_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Preço Q.", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtAlbHdrAnc_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Largura", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtAlbHdrgm2_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Gm2", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarAlbMtrE_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Metros S.", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarPreMtr_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Preço Q.", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarAlbPie_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Peças", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtAlbTiras_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Tirl?", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtAlbTirasKg_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Quilos", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtAlbSinTest_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Sem teste?", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtTubCod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Tubo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarAlbTub_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Qtd", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtAlbHdrObs_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Obs", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPlasCod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Plast", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarAlbPlas_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cant", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtTipAcaCod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Tipo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((cmbAlbProVal.getVisible()==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "F?", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
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
         GridContainer.AddObjectProperty("CmpContext", sPrefix);
         GridContainer.AddObjectProperty("InMasterPage", "false");
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV83DetailWebComponent));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavDetailwebcomponent_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV86Update));
         GridColumn.AddObjectProperty("Class", GXutil.rtrim( edtavUpdate_Class));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavUpdate_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV87Delete));
         GridColumn.AddObjectProperty("Class", GXutil.rtrim( edtavDelete_Class));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavDelete_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarCod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarCodReo_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A130BarCodPar));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarCodPar_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A3391AlbSer));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtAlbSer_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A12234AlbTipArt, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A14056AlbColorCv));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtAlbColorCv_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A12232AlbNomCli));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtAlbNomCli_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A3393AlbColNum, (byte)(6), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtAlbColNum_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A3153CodCod));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtCodCod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1261BarAlbKgmE, (byte)(9), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarAlbKgmE_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1262BarPreKgm, (byte)(13), (byte)(5), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarPreKgm_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A3271AlbHdrAnc, (byte)(4), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtAlbHdrAnc_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A5019AlbHdrgm2, (byte)(4), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtAlbHdrgm2_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1263BarAlbMtrE, (byte)(9), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarAlbMtrE_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1264BarPreMtr, (byte)(13), (byte)(5), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarPreMtr_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1265BarAlbPie, (byte)(6), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarAlbPie_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A14057AlbTiras));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtAlbTiras_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A14058AlbTirasKg, (byte)(9), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtAlbTirasKg_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A14059AlbSinTest));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtAlbSinTest_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1206TubCod, (byte)(4), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtTubCod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1266BarAlbTub, (byte)(6), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarAlbTub_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A2441AlbHdrObs));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtAlbHdrObs_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A6466PlasCod, (byte)(4), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtPlasCod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A6467BarAlbPlas, (byte)(4), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarAlbPlas_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A5051TipAcaCod, (byte)(4), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtTipAcaCod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A2839AlbProVal));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( cmbAlbProVal.getVisible(), (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A7101AlbLic));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A2242AlbSec));
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
      lblTbngruia_Internalname = sPrefix+"TBNGRUIA" ;
      edtAlbProCod_Internalname = sPrefix+"ALBPROCOD" ;
      cmbAlbEnvFtp.setInternalname( sPrefix+"ALBENVFTP" );
      edtGuiRemCli_Internalname = sPrefix+"GUIREMCLI" ;
      edtGuiRemCln_Internalname = sPrefix+"GUIREMCLN" ;
      edtAlbProfch_Internalname = sPrefix+"ALBPROFCH" ;
      divUnnamedtable3_Internalname = sPrefix+"UNNAMEDTABLE3" ;
      divTablealbaran_Internalname = sPrefix+"TABLEALBARAN" ;
      Dvpanel_tablealbaran_Internalname = sPrefix+"DVPANEL_TABLEALBARAN" ;
      divDvpanel_tablealbaran_cell_Internalname = sPrefix+"DVPANEL_TABLEALBARAN_CELL" ;
      bttBtninsert_Internalname = sPrefix+"BTNINSERT" ;
      bttBtneditcolumns_Internalname = sPrefix+"BTNEDITCOLUMNS" ;
      divTableactions_Internalname = sPrefix+"TABLEACTIONS" ;
      Ddo_managefilters_Internalname = sPrefix+"DDO_MANAGEFILTERS" ;
      edtavFilterfulltext_Internalname = sPrefix+"vFILTERFULLTEXT" ;
      tblTablefilters_Internalname = sPrefix+"TABLEFILTERS" ;
      tblTablerightheader_Internalname = sPrefix+"TABLERIGHTHEADER" ;
      divTableheader_Internalname = sPrefix+"TABLEHEADER" ;
      edtavDetailwebcomponent_Internalname = sPrefix+"vDETAILWEBCOMPONENT" ;
      edtavUpdate_Internalname = sPrefix+"vUPDATE" ;
      edtavDelete_Internalname = sPrefix+"vDELETE" ;
      edtBarCod_Internalname = sPrefix+"BARCOD" ;
      edtBarCodReo_Internalname = sPrefix+"BARCODREO" ;
      edtBarCodPar_Internalname = sPrefix+"BARCODPAR" ;
      edtAlbSer_Internalname = sPrefix+"ALBSER" ;
      edtAlbTipArt_Internalname = sPrefix+"ALBTIPART" ;
      edtAlbColorCv_Internalname = sPrefix+"ALBCOLORCV" ;
      edtAlbNomCli_Internalname = sPrefix+"ALBNOMCLI" ;
      edtAlbColNum_Internalname = sPrefix+"ALBCOLNUM" ;
      edtCodCod_Internalname = sPrefix+"CODCOD" ;
      edtBarAlbKgmE_Internalname = sPrefix+"BARALBKGME" ;
      edtBarPreKgm_Internalname = sPrefix+"BARPREKGM" ;
      edtAlbHdrAnc_Internalname = sPrefix+"ALBHDRANC" ;
      edtAlbHdrgm2_Internalname = sPrefix+"ALBHDRGM2" ;
      edtBarAlbMtrE_Internalname = sPrefix+"BARALBMTRE" ;
      edtBarPreMtr_Internalname = sPrefix+"BARPREMTR" ;
      edtBarAlbPie_Internalname = sPrefix+"BARALBPIE" ;
      edtAlbTiras_Internalname = sPrefix+"ALBTIRAS" ;
      edtAlbTirasKg_Internalname = sPrefix+"ALBTIRASKG" ;
      edtAlbSinTest_Internalname = sPrefix+"ALBSINTEST" ;
      edtTubCod_Internalname = sPrefix+"TUBCOD" ;
      edtBarAlbTub_Internalname = sPrefix+"BARALBTUB" ;
      edtAlbHdrObs_Internalname = sPrefix+"ALBHDROBS" ;
      edtPlasCod_Internalname = sPrefix+"PLASCOD" ;
      edtBarAlbPlas_Internalname = sPrefix+"BARALBPLAS" ;
      edtTipAcaCod_Internalname = sPrefix+"TIPACACOD" ;
      cmbAlbProVal.setInternalname( sPrefix+"ALBPROVAL" );
      edtAlbLic_Internalname = sPrefix+"ALBLIC" ;
      edtAlbSec_Internalname = sPrefix+"ALBSEC" ;
      Gridpaginationbar_Internalname = sPrefix+"GRIDPAGINATIONBAR" ;
      divCell_grid_dwc_Internalname = sPrefix+"CELL_GRID_DWC" ;
      divGridtablewithpaginationbar_Internalname = sPrefix+"GRIDTABLEWITHPAGINATIONBAR" ;
      divUnnamedtable1_Internalname = sPrefix+"UNNAMEDTABLE1" ;
      bttBtn_cancel_Internalname = sPrefix+"BTN_CANCEL" ;
      edtavPgmname_Internalname = sPrefix+"vPGMNAME" ;
      divUnnamedtable2_Internalname = sPrefix+"UNNAMEDTABLE2" ;
      divTablecontent_Internalname = sPrefix+"TABLECONTENT" ;
      divTablemain_Internalname = sPrefix+"TABLEMAIN" ;
      Ddo_grid_Internalname = sPrefix+"DDO_GRID" ;
      Ddo_gridcolumnsselector_Internalname = sPrefix+"DDO_GRIDCOLUMNSSELECTOR" ;
      edtEmprCod_Internalname = sPrefix+"EMPRCOD" ;
      Grid_empowerer_Internalname = sPrefix+"GRID_EMPOWERER" ;
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
      edtAlbSec_Jsonclick = "" ;
      edtAlbLic_Jsonclick = "" ;
      cmbAlbProVal.setJsonclick( "" );
      edtTipAcaCod_Jsonclick = "" ;
      edtBarAlbPlas_Jsonclick = "" ;
      edtPlasCod_Jsonclick = "" ;
      edtAlbHdrObs_Jsonclick = "" ;
      edtBarAlbTub_Jsonclick = "" ;
      edtTubCod_Jsonclick = "" ;
      edtAlbSinTest_Jsonclick = "" ;
      edtAlbTirasKg_Jsonclick = "" ;
      edtAlbTiras_Jsonclick = "" ;
      edtBarAlbPie_Jsonclick = "" ;
      edtBarPreMtr_Jsonclick = "" ;
      edtBarAlbMtrE_Jsonclick = "" ;
      edtAlbHdrgm2_Jsonclick = "" ;
      edtAlbHdrAnc_Jsonclick = "" ;
      edtBarPreKgm_Jsonclick = "" ;
      edtBarAlbKgmE_Jsonclick = "" ;
      edtCodCod_Jsonclick = "" ;
      edtAlbColNum_Jsonclick = "" ;
      edtAlbNomCli_Jsonclick = "" ;
      edtAlbColorCv_Jsonclick = "" ;
      edtAlbTipArt_Jsonclick = "" ;
      edtAlbSer_Jsonclick = "" ;
      edtBarCodPar_Jsonclick = "" ;
      edtBarCodReo_Jsonclick = "" ;
      edtBarCod_Jsonclick = "" ;
      edtavDelete_Jsonclick = "" ;
      edtavDelete_Class = "Attribute" ;
      edtavDelete_Visible = -1 ;
      edtavDelete_Enabled = 1 ;
      edtavUpdate_Jsonclick = "" ;
      edtavUpdate_Class = "Attribute" ;
      edtavUpdate_Visible = -1 ;
      edtavUpdate_Enabled = 1 ;
      edtavDetailwebcomponent_Jsonclick = "" ;
      edtavDetailwebcomponent_Visible = -1 ;
      edtavDetailwebcomponent_Enabled = 1 ;
      subGrid_Class = "GridWithPaginationBar GridNoBorder WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavFilterfulltext_Jsonclick = "" ;
      edtavFilterfulltext_Enabled = 1 ;
      cmbAlbProVal.setVisible( -1 );
      edtTipAcaCod_Visible = -1 ;
      edtBarAlbPlas_Visible = -1 ;
      edtPlasCod_Visible = -1 ;
      edtAlbHdrObs_Visible = -1 ;
      edtBarAlbTub_Visible = -1 ;
      edtTubCod_Visible = -1 ;
      edtAlbSinTest_Visible = -1 ;
      edtAlbTirasKg_Visible = -1 ;
      edtAlbTiras_Visible = -1 ;
      edtBarAlbPie_Visible = -1 ;
      edtBarPreMtr_Visible = -1 ;
      edtBarAlbMtrE_Visible = -1 ;
      edtAlbHdrgm2_Visible = -1 ;
      edtAlbHdrAnc_Visible = -1 ;
      edtBarPreKgm_Visible = -1 ;
      edtBarAlbKgmE_Visible = -1 ;
      edtCodCod_Visible = -1 ;
      edtAlbColNum_Visible = -1 ;
      edtAlbNomCli_Visible = -1 ;
      edtAlbColorCv_Visible = -1 ;
      edtAlbSer_Visible = -1 ;
      edtBarCodPar_Visible = -1 ;
      edtBarCodReo_Visible = -1 ;
      edtBarCod_Visible = -1 ;
      subGrid_Sortable = (byte)(0) ;
      edtEmprCod_Jsonclick = "" ;
      edtEmprCod_Visible = 1 ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      bttBtn_cancel_Visible = 1 ;
      divCell_grid_dwc_Class = "col-xs-12" ;
      bttBtninsert_Visible = 1 ;
      edtAlbProfch_Jsonclick = "" ;
      edtAlbProfch_Enabled = 0 ;
      edtGuiRemCln_Jsonclick = "" ;
      edtGuiRemCln_Enabled = 0 ;
      edtGuiRemCli_Jsonclick = "" ;
      edtGuiRemCli_Enabled = 0 ;
      cmbAlbEnvFtp.setJsonclick( "" );
      cmbAlbEnvFtp.setEnabled( 0 );
      edtAlbProCod_Jsonclick = "" ;
      edtAlbProCod_Enabled = 0 ;
      divDvpanel_tablealbaran_cell_Class = "col-xs-12" ;
      Grid_empowerer_Hascolumnsselector = GXutil.toBoolean( -1) ;
      Grid_empowerer_Hastitlesettings = GXutil.toBoolean( -1) ;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = "" ;
      Ddo_gridcolumnsselector_Dropdownoptionstype = "GridColumnsSelector" ;
      Ddo_gridcolumnsselector_Cls = "ColumnsSelector hidden-xs" ;
      Ddo_gridcolumnsselector_Tooltip = "WWP_EditColumnsTooltip" ;
      Ddo_gridcolumnsselector_Caption = httpContext.getMessage( "WWP_EditColumnsCaption", "") ;
      Ddo_grid_Datalistproc = "Albaranes.AlbaranGuia__WWGetFilterData" ;
      Ddo_grid_Datalistfixedvalues = "||||||||||||||||||||||||S:Si,N:No" ;
      Ddo_grid_Allowmultipleselection = "||||||||||||||||||||||||T" ;
      Ddo_grid_Datalisttype = "||Dynamic|Dynamic|Dynamic|Dynamic||Dynamic||||||||Dynamic||Dynamic|||Dynamic||||FixedValues" ;
      Ddo_grid_Includedatalist = "||T|T|T|T||T||||||||T||T|||T||||T" ;
      Ddo_grid_Filterisrange = "T|T|||||T||T|T|T|T|T|T|T||T||T|T||T|T|T|" ;
      Ddo_grid_Filtertype = "Numeric|Numeric|Character|Character|Character|Character|Numeric|Character|Numeric|Numeric|Numeric|Numeric|Numeric|Numeric|Numeric|Character|Numeric|Character|Numeric|Numeric|Character|Numeric|Numeric|Numeric|" ;
      Ddo_grid_Includefilter = "T|T|T|T|T|T|T|T|T|T|T|T|T|T|T|T|T|T|T|T|T|T|T|T|" ;
      Ddo_grid_Fixable = "T" ;
      Ddo_grid_Includesortasc = "T|T|T|T||T|T|T|T|T|T|T|T|T|T|T|T|T|T|T|T|T|T|T|T" ;
      Ddo_grid_Columnssortvalues = "1|2|3|4||5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24" ;
      Ddo_grid_Columnids = "3:BarCod|4:BarCodReo|5:BarCodPar|6:AlbSer|8:AlbColorCv|9:AlbNomCli|10:AlbColNum|11:CodCod|12:BarAlbKgmE|13:BarPreKgm|14:AlbHdrAnc|15:AlbHdrgm2|16:BarAlbMtrE|17:BarPreMtr|18:BarAlbPie|19:AlbTiras|20:AlbTirasKg|21:AlbSinTest|22:TubCod|23:BarAlbTub|24:AlbHdrObs|25:PlasCod|26:BarAlbPlas|27:TipAcaCod|28:AlbProVal" ;
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
      Ddo_managefilters_Cls = "ManageFilters" ;
      Ddo_managefilters_Tooltip = "WWP_ManageFiltersTooltip" ;
      Ddo_managefilters_Icon = "fas fa-filter" ;
      Ddo_managefilters_Icontype = "FontIcon" ;
      Dvpanel_tablealbaran_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_tablealbaran_Iconposition = "Right" ;
      Dvpanel_tablealbaran_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_tablealbaran_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_tablealbaran_Collapsible = GXutil.toBoolean( 0) ;
      Dvpanel_tablealbaran_Title = httpContext.getMessage( "Albarán", "") ;
      Dvpanel_tablealbaran_Cls = "PanelNoHeader" ;
      Dvpanel_tablealbaran_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_tablealbaran_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_tablealbaran_Width = "100%" ;
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
      cmbAlbEnvFtp.setName( "ALBENVFTP" );
      cmbAlbEnvFtp.setWebtags( "" );
      cmbAlbEnvFtp.addItem("0", httpContext.getMessage( "Não Enviada", ""), (short)(0));
      cmbAlbEnvFtp.addItem("3", httpContext.getMessage( "Enviada a AT", ""), (short)(0));
      if ( cmbAlbEnvFtp.getItemCount() > 0 )
      {
      }
      GXCCtl = "ALBPROVAL_" + sGXsfl_69_idx ;
      cmbAlbProVal.setName( GXCCtl );
      cmbAlbProVal.setWebtags( "" );
      cmbAlbProVal.addItem("S", httpContext.getMessage( "Si", ""), (short)(0));
      cmbAlbProVal.addItem("N", httpContext.getMessage( "No", ""), (short)(0));
      if ( cmbAlbProVal.getItemCount() > 0 )
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'A30AlbProCod',fld:'ALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'sPrefix'},{av:'AV23ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV18ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV24TFBarCod',fld:'vTFBARCOD',pic:'ZZZZZZZ9'},{av:'AV25TFBarCod_To',fld:'vTFBARCOD_TO',pic:'ZZZZZZZ9'},{av:'AV26TFBarCodReo',fld:'vTFBARCODREO',pic:'9'},{av:'AV27TFBarCodReo_To',fld:'vTFBARCODREO_TO',pic:'9'},{av:'AV28TFBarCodPar',fld:'vTFBARCODPAR',pic:''},{av:'AV29TFBarCodPar_Sel',fld:'vTFBARCODPAR_SEL',pic:''},{av:'AV30TFAlbSer',fld:'vTFALBSER',pic:''},{av:'AV31TFAlbSer_Sel',fld:'vTFALBSER_SEL',pic:''},{av:'AV32TFAlbColorCv',fld:'vTFALBCOLORCV',pic:''},{av:'AV33TFAlbColorCv_Sel',fld:'vTFALBCOLORCV_SEL',pic:''},{av:'AV34TFAlbNomCli',fld:'vTFALBNOMCLI',pic:''},{av:'AV35TFAlbNomCli_Sel',fld:'vTFALBNOMCLI_SEL',pic:''},{av:'AV36TFAlbColNum',fld:'vTFALBCOLNUM',pic:'ZZZZZ9'},{av:'AV37TFAlbColNum_To',fld:'vTFALBCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV38TFCodCod',fld:'vTFCODCOD',pic:'XXXXXX'},{av:'AV39TFCodCod_Sel',fld:'vTFCODCOD_SEL',pic:'XXXXXX'},{av:'AV40TFBarAlbKgmE',fld:'vTFBARALBKGME',pic:'ZZZZZ9.99'},{av:'AV41TFBarAlbKgmE_To',fld:'vTFBARALBKGME_TO',pic:'ZZZZZ9.99'},{av:'AV42TFBarPreKgm',fld:'vTFBARPREKGM',pic:'ZZZZZZ9.999'},{av:'AV43TFBarPreKgm_To',fld:'vTFBARPREKGM_TO',pic:'ZZZZZZ9.999'},{av:'AV44TFAlbHdrAnc',fld:'vTFALBHDRANC',pic:'ZZZ9'},{av:'AV45TFAlbHdrAnc_To',fld:'vTFALBHDRANC_TO',pic:'ZZZ9'},{av:'AV46TFAlbHdrgm2',fld:'vTFALBHDRGM2',pic:'ZZZ9'},{av:'AV47TFAlbHdrgm2_To',fld:'vTFALBHDRGM2_TO',pic:'ZZZ9'},{av:'AV48TFBarAlbMtrE',fld:'vTFBARALBMTRE',pic:'ZZZZZ9.99'},{av:'AV49TFBarAlbMtrE_To',fld:'vTFBARALBMTRE_TO',pic:'ZZZZZ9.99'},{av:'AV50TFBarPreMtr',fld:'vTFBARPREMTR',pic:'ZZZZZZ9.999'},{av:'AV51TFBarPreMtr_To',fld:'vTFBARPREMTR_TO',pic:'ZZZZZZ9.999'},{av:'AV52TFBarAlbPie',fld:'vTFBARALBPIE',pic:'ZZZZZ9'},{av:'AV53TFBarAlbPie_To',fld:'vTFBARALBPIE_TO',pic:'ZZZZZ9'},{av:'AV54TFAlbTiras',fld:'vTFALBTIRAS',pic:''},{av:'AV55TFAlbTiras_Sel',fld:'vTFALBTIRAS_SEL',pic:''},{av:'AV56TFAlbTirasKg',fld:'vTFALBTIRASKG',pic:'ZZZZZ9.99'},{av:'AV57TFAlbTirasKg_To',fld:'vTFALBTIRASKG_TO',pic:'ZZZZZ9.99'},{av:'AV58TFAlbSinTest',fld:'vTFALBSINTEST',pic:''},{av:'AV59TFAlbSinTest_Sel',fld:'vTFALBSINTEST_SEL',pic:''},{av:'AV60TFTubCod',fld:'vTFTUBCOD',pic:'ZZZ9'},{av:'AV61TFTubCod_To',fld:'vTFTUBCOD_TO',pic:'ZZZ9'},{av:'AV62TFBarAlbTub',fld:'vTFBARALBTUB',pic:'ZZZ9'},{av:'AV63TFBarAlbTub_To',fld:'vTFBARALBTUB_TO',pic:'ZZZ9'},{av:'AV64TFAlbHdrObs',fld:'vTFALBHDROBS',pic:''},{av:'AV65TFAlbHdrObs_Sel',fld:'vTFALBHDROBS_SEL',pic:''},{av:'AV66TFPlasCod',fld:'vTFPLASCOD',pic:'ZZZ9'},{av:'AV67TFPlasCod_To',fld:'vTFPLASCOD_TO',pic:'ZZZ9'},{av:'AV68TFBarAlbPlas',fld:'vTFBARALBPLAS',pic:'ZZZ9'},{av:'AV69TFBarAlbPlas_To',fld:'vTFBARALBPLAS_TO',pic:'ZZZ9'},{av:'AV70TFTipAcaCod',fld:'vTFTIPACACOD',pic:'ZZZ9'},{av:'AV71TFTipAcaCod_To',fld:'vTFTIPACACOD_TO',pic:'ZZZ9'},{av:'AV73TFAlbProVal_Sels',fld:'vTFALBPROVAL_SELS',pic:''},{av:'AV85AccionesEnPopup',fld:'vACCIONESENPOPUP',pic:''},{av:'AV84VisualizarAcciones',fld:'vVISUALIZARACCIONES',pic:''},{av:'AV95Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV89Artemalha',fld:'vARTEMALHA',pic:'9',hsh:true},{av:'AV90F_carvema',fld:'vF_CARVEMA',pic:'9',hsh:true},{av:'AV91Siplasticos',fld:'vSIPLASTICOS',pic:'9',hsh:true},{av:'AV92Endutex',fld:'vENDUTEX',pic:'9',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV23ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV18ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtBarCod_Visible',ctrl:'BARCOD',prop:'Visible'},{av:'edtBarCodReo_Visible',ctrl:'BARCODREO',prop:'Visible'},{av:'edtBarCodPar_Visible',ctrl:'BARCODPAR',prop:'Visible'},{av:'edtAlbSer_Visible',ctrl:'ALBSER',prop:'Visible'},{av:'edtAlbColorCv_Visible',ctrl:'ALBCOLORCV',prop:'Visible'},{av:'edtAlbNomCli_Visible',ctrl:'ALBNOMCLI',prop:'Visible'},{av:'edtAlbColNum_Visible',ctrl:'ALBCOLNUM',prop:'Visible'},{av:'edtCodCod_Visible',ctrl:'CODCOD',prop:'Visible'},{av:'edtBarAlbKgmE_Visible',ctrl:'BARALBKGME',prop:'Visible'},{av:'edtBarPreKgm_Visible',ctrl:'BARPREKGM',prop:'Visible'},{av:'edtAlbHdrAnc_Visible',ctrl:'ALBHDRANC',prop:'Visible'},{av:'edtAlbHdrgm2_Visible',ctrl:'ALBHDRGM2',prop:'Visible'},{av:'edtBarAlbMtrE_Visible',ctrl:'BARALBMTRE',prop:'Visible'},{av:'edtBarPreMtr_Visible',ctrl:'BARPREMTR',prop:'Visible'},{av:'edtBarAlbPie_Visible',ctrl:'BARALBPIE',prop:'Visible'},{av:'edtAlbTiras_Visible',ctrl:'ALBTIRAS',prop:'Visible'},{av:'edtAlbTirasKg_Visible',ctrl:'ALBTIRASKG',prop:'Visible'},{av:'edtAlbSinTest_Visible',ctrl:'ALBSINTEST',prop:'Visible'},{av:'edtTubCod_Visible',ctrl:'TUBCOD',prop:'Visible'},{av:'edtBarAlbTub_Visible',ctrl:'BARALBTUB',prop:'Visible'},{av:'edtAlbHdrObs_Visible',ctrl:'ALBHDROBS',prop:'Visible'},{av:'edtPlasCod_Visible',ctrl:'PLASCOD',prop:'Visible'},{av:'edtBarAlbPlas_Visible',ctrl:'BARALBPLAS',prop:'Visible'},{av:'edtTipAcaCod_Visible',ctrl:'TIPACACOD',prop:'Visible'},{av:'cmbAlbProVal'},{av:'AV80GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV81GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{ctrl:'BTN_CANCEL',prop:'Visible'},{ctrl:'BTNINSERT',prop:'Visible'},{av:'AV21ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV38TFCodCod',fld:'vTFCODCOD',pic:'XXXXXX'},{av:'AV39TFCodCod_Sel',fld:'vTFCODCOD_SEL',pic:'XXXXXX'},{av:'AV54TFAlbTiras',fld:'vTFALBTIRAS',pic:''},{av:'AV55TFAlbTiras_Sel',fld:'vTFALBTIRAS_SEL',pic:''},{av:'AV56TFAlbTirasKg',fld:'vTFALBTIRASKG',pic:'ZZZZZ9.99'},{av:'AV57TFAlbTirasKg_To',fld:'vTFALBTIRASKG_TO',pic:'ZZZZZ9.99'},{av:'AV58TFAlbSinTest',fld:'vTFALBSINTEST',pic:''},{av:'AV59TFAlbSinTest_Sel',fld:'vTFALBSINTEST_SEL',pic:''},{av:'AV66TFPlasCod',fld:'vTFPLASCOD',pic:'ZZZ9'},{av:'AV67TFPlasCod_To',fld:'vTFPLASCOD_TO',pic:'ZZZ9'},{av:'AV68TFBarAlbPlas',fld:'vTFBARALBPLAS',pic:'ZZZ9'},{av:'AV69TFBarAlbPlas_To',fld:'vTFBARALBPLAS_TO',pic:'ZZZ9'},{av:'AV70TFTipAcaCod',fld:'vTFTIPACACOD',pic:'ZZZ9'},{av:'AV71TFTipAcaCod_To',fld:'vTFTIPACACOD_TO',pic:'ZZZ9'}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e121XC2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'A30AlbProCod',fld:'ALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV23ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV18ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV24TFBarCod',fld:'vTFBARCOD',pic:'ZZZZZZZ9'},{av:'AV25TFBarCod_To',fld:'vTFBARCOD_TO',pic:'ZZZZZZZ9'},{av:'AV26TFBarCodReo',fld:'vTFBARCODREO',pic:'9'},{av:'AV27TFBarCodReo_To',fld:'vTFBARCODREO_TO',pic:'9'},{av:'AV28TFBarCodPar',fld:'vTFBARCODPAR',pic:''},{av:'AV29TFBarCodPar_Sel',fld:'vTFBARCODPAR_SEL',pic:''},{av:'AV30TFAlbSer',fld:'vTFALBSER',pic:''},{av:'AV31TFAlbSer_Sel',fld:'vTFALBSER_SEL',pic:''},{av:'AV32TFAlbColorCv',fld:'vTFALBCOLORCV',pic:''},{av:'AV33TFAlbColorCv_Sel',fld:'vTFALBCOLORCV_SEL',pic:''},{av:'AV34TFAlbNomCli',fld:'vTFALBNOMCLI',pic:''},{av:'AV35TFAlbNomCli_Sel',fld:'vTFALBNOMCLI_SEL',pic:''},{av:'AV36TFAlbColNum',fld:'vTFALBCOLNUM',pic:'ZZZZZ9'},{av:'AV37TFAlbColNum_To',fld:'vTFALBCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV38TFCodCod',fld:'vTFCODCOD',pic:'XXXXXX'},{av:'AV39TFCodCod_Sel',fld:'vTFCODCOD_SEL',pic:'XXXXXX'},{av:'AV40TFBarAlbKgmE',fld:'vTFBARALBKGME',pic:'ZZZZZ9.99'},{av:'AV41TFBarAlbKgmE_To',fld:'vTFBARALBKGME_TO',pic:'ZZZZZ9.99'},{av:'AV42TFBarPreKgm',fld:'vTFBARPREKGM',pic:'ZZZZZZ9.999'},{av:'AV43TFBarPreKgm_To',fld:'vTFBARPREKGM_TO',pic:'ZZZZZZ9.999'},{av:'AV44TFAlbHdrAnc',fld:'vTFALBHDRANC',pic:'ZZZ9'},{av:'AV45TFAlbHdrAnc_To',fld:'vTFALBHDRANC_TO',pic:'ZZZ9'},{av:'AV46TFAlbHdrgm2',fld:'vTFALBHDRGM2',pic:'ZZZ9'},{av:'AV47TFAlbHdrgm2_To',fld:'vTFALBHDRGM2_TO',pic:'ZZZ9'},{av:'AV48TFBarAlbMtrE',fld:'vTFBARALBMTRE',pic:'ZZZZZ9.99'},{av:'AV49TFBarAlbMtrE_To',fld:'vTFBARALBMTRE_TO',pic:'ZZZZZ9.99'},{av:'AV50TFBarPreMtr',fld:'vTFBARPREMTR',pic:'ZZZZZZ9.999'},{av:'AV51TFBarPreMtr_To',fld:'vTFBARPREMTR_TO',pic:'ZZZZZZ9.999'},{av:'AV52TFBarAlbPie',fld:'vTFBARALBPIE',pic:'ZZZZZ9'},{av:'AV53TFBarAlbPie_To',fld:'vTFBARALBPIE_TO',pic:'ZZZZZ9'},{av:'AV54TFAlbTiras',fld:'vTFALBTIRAS',pic:''},{av:'AV55TFAlbTiras_Sel',fld:'vTFALBTIRAS_SEL',pic:''},{av:'AV56TFAlbTirasKg',fld:'vTFALBTIRASKG',pic:'ZZZZZ9.99'},{av:'AV57TFAlbTirasKg_To',fld:'vTFALBTIRASKG_TO',pic:'ZZZZZ9.99'},{av:'AV58TFAlbSinTest',fld:'vTFALBSINTEST',pic:''},{av:'AV59TFAlbSinTest_Sel',fld:'vTFALBSINTEST_SEL',pic:''},{av:'AV60TFTubCod',fld:'vTFTUBCOD',pic:'ZZZ9'},{av:'AV61TFTubCod_To',fld:'vTFTUBCOD_TO',pic:'ZZZ9'},{av:'AV62TFBarAlbTub',fld:'vTFBARALBTUB',pic:'ZZZ9'},{av:'AV63TFBarAlbTub_To',fld:'vTFBARALBTUB_TO',pic:'ZZZ9'},{av:'AV64TFAlbHdrObs',fld:'vTFALBHDROBS',pic:''},{av:'AV65TFAlbHdrObs_Sel',fld:'vTFALBHDROBS_SEL',pic:''},{av:'AV66TFPlasCod',fld:'vTFPLASCOD',pic:'ZZZ9'},{av:'AV67TFPlasCod_To',fld:'vTFPLASCOD_TO',pic:'ZZZ9'},{av:'AV68TFBarAlbPlas',fld:'vTFBARALBPLAS',pic:'ZZZ9'},{av:'AV69TFBarAlbPlas_To',fld:'vTFBARALBPLAS_TO',pic:'ZZZ9'},{av:'AV70TFTipAcaCod',fld:'vTFTIPACACOD',pic:'ZZZ9'},{av:'AV71TFTipAcaCod_To',fld:'vTFTIPACACOD_TO',pic:'ZZZ9'},{av:'AV73TFAlbProVal_Sels',fld:'vTFALBPROVAL_SELS',pic:''},{av:'AV85AccionesEnPopup',fld:'vACCIONESENPOPUP',pic:''},{av:'AV84VisualizarAcciones',fld:'vVISUALIZARACCIONES',pic:''},{av:'AV95Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV89Artemalha',fld:'vARTEMALHA',pic:'9',hsh:true},{av:'AV90F_carvema',fld:'vF_CARVEMA',pic:'9',hsh:true},{av:'AV91Siplasticos',fld:'vSIPLASTICOS',pic:'9',hsh:true},{av:'AV92Endutex',fld:'vENDUTEX',pic:'9',hsh:true},{av:'sPrefix'},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e131XC2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'A30AlbProCod',fld:'ALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV23ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV18ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV24TFBarCod',fld:'vTFBARCOD',pic:'ZZZZZZZ9'},{av:'AV25TFBarCod_To',fld:'vTFBARCOD_TO',pic:'ZZZZZZZ9'},{av:'AV26TFBarCodReo',fld:'vTFBARCODREO',pic:'9'},{av:'AV27TFBarCodReo_To',fld:'vTFBARCODREO_TO',pic:'9'},{av:'AV28TFBarCodPar',fld:'vTFBARCODPAR',pic:''},{av:'AV29TFBarCodPar_Sel',fld:'vTFBARCODPAR_SEL',pic:''},{av:'AV30TFAlbSer',fld:'vTFALBSER',pic:''},{av:'AV31TFAlbSer_Sel',fld:'vTFALBSER_SEL',pic:''},{av:'AV32TFAlbColorCv',fld:'vTFALBCOLORCV',pic:''},{av:'AV33TFAlbColorCv_Sel',fld:'vTFALBCOLORCV_SEL',pic:''},{av:'AV34TFAlbNomCli',fld:'vTFALBNOMCLI',pic:''},{av:'AV35TFAlbNomCli_Sel',fld:'vTFALBNOMCLI_SEL',pic:''},{av:'AV36TFAlbColNum',fld:'vTFALBCOLNUM',pic:'ZZZZZ9'},{av:'AV37TFAlbColNum_To',fld:'vTFALBCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV38TFCodCod',fld:'vTFCODCOD',pic:'XXXXXX'},{av:'AV39TFCodCod_Sel',fld:'vTFCODCOD_SEL',pic:'XXXXXX'},{av:'AV40TFBarAlbKgmE',fld:'vTFBARALBKGME',pic:'ZZZZZ9.99'},{av:'AV41TFBarAlbKgmE_To',fld:'vTFBARALBKGME_TO',pic:'ZZZZZ9.99'},{av:'AV42TFBarPreKgm',fld:'vTFBARPREKGM',pic:'ZZZZZZ9.999'},{av:'AV43TFBarPreKgm_To',fld:'vTFBARPREKGM_TO',pic:'ZZZZZZ9.999'},{av:'AV44TFAlbHdrAnc',fld:'vTFALBHDRANC',pic:'ZZZ9'},{av:'AV45TFAlbHdrAnc_To',fld:'vTFALBHDRANC_TO',pic:'ZZZ9'},{av:'AV46TFAlbHdrgm2',fld:'vTFALBHDRGM2',pic:'ZZZ9'},{av:'AV47TFAlbHdrgm2_To',fld:'vTFALBHDRGM2_TO',pic:'ZZZ9'},{av:'AV48TFBarAlbMtrE',fld:'vTFBARALBMTRE',pic:'ZZZZZ9.99'},{av:'AV49TFBarAlbMtrE_To',fld:'vTFBARALBMTRE_TO',pic:'ZZZZZ9.99'},{av:'AV50TFBarPreMtr',fld:'vTFBARPREMTR',pic:'ZZZZZZ9.999'},{av:'AV51TFBarPreMtr_To',fld:'vTFBARPREMTR_TO',pic:'ZZZZZZ9.999'},{av:'AV52TFBarAlbPie',fld:'vTFBARALBPIE',pic:'ZZZZZ9'},{av:'AV53TFBarAlbPie_To',fld:'vTFBARALBPIE_TO',pic:'ZZZZZ9'},{av:'AV54TFAlbTiras',fld:'vTFALBTIRAS',pic:''},{av:'AV55TFAlbTiras_Sel',fld:'vTFALBTIRAS_SEL',pic:''},{av:'AV56TFAlbTirasKg',fld:'vTFALBTIRASKG',pic:'ZZZZZ9.99'},{av:'AV57TFAlbTirasKg_To',fld:'vTFALBTIRASKG_TO',pic:'ZZZZZ9.99'},{av:'AV58TFAlbSinTest',fld:'vTFALBSINTEST',pic:''},{av:'AV59TFAlbSinTest_Sel',fld:'vTFALBSINTEST_SEL',pic:''},{av:'AV60TFTubCod',fld:'vTFTUBCOD',pic:'ZZZ9'},{av:'AV61TFTubCod_To',fld:'vTFTUBCOD_TO',pic:'ZZZ9'},{av:'AV62TFBarAlbTub',fld:'vTFBARALBTUB',pic:'ZZZ9'},{av:'AV63TFBarAlbTub_To',fld:'vTFBARALBTUB_TO',pic:'ZZZ9'},{av:'AV64TFAlbHdrObs',fld:'vTFALBHDROBS',pic:''},{av:'AV65TFAlbHdrObs_Sel',fld:'vTFALBHDROBS_SEL',pic:''},{av:'AV66TFPlasCod',fld:'vTFPLASCOD',pic:'ZZZ9'},{av:'AV67TFPlasCod_To',fld:'vTFPLASCOD_TO',pic:'ZZZ9'},{av:'AV68TFBarAlbPlas',fld:'vTFBARALBPLAS',pic:'ZZZ9'},{av:'AV69TFBarAlbPlas_To',fld:'vTFBARALBPLAS_TO',pic:'ZZZ9'},{av:'AV70TFTipAcaCod',fld:'vTFTIPACACOD',pic:'ZZZ9'},{av:'AV71TFTipAcaCod_To',fld:'vTFTIPACACOD_TO',pic:'ZZZ9'},{av:'AV73TFAlbProVal_Sels',fld:'vTFALBPROVAL_SELS',pic:''},{av:'AV85AccionesEnPopup',fld:'vACCIONESENPOPUP',pic:''},{av:'AV84VisualizarAcciones',fld:'vVISUALIZARACCIONES',pic:''},{av:'AV95Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV89Artemalha',fld:'vARTEMALHA',pic:'9',hsh:true},{av:'AV90F_carvema',fld:'vF_CARVEMA',pic:'9',hsh:true},{av:'AV91Siplasticos',fld:'vSIPLASTICOS',pic:'9',hsh:true},{av:'AV92Endutex',fld:'vENDUTEX',pic:'9',hsh:true},{av:'sPrefix'},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e141XC2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'A30AlbProCod',fld:'ALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV23ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV18ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV24TFBarCod',fld:'vTFBARCOD',pic:'ZZZZZZZ9'},{av:'AV25TFBarCod_To',fld:'vTFBARCOD_TO',pic:'ZZZZZZZ9'},{av:'AV26TFBarCodReo',fld:'vTFBARCODREO',pic:'9'},{av:'AV27TFBarCodReo_To',fld:'vTFBARCODREO_TO',pic:'9'},{av:'AV28TFBarCodPar',fld:'vTFBARCODPAR',pic:''},{av:'AV29TFBarCodPar_Sel',fld:'vTFBARCODPAR_SEL',pic:''},{av:'AV30TFAlbSer',fld:'vTFALBSER',pic:''},{av:'AV31TFAlbSer_Sel',fld:'vTFALBSER_SEL',pic:''},{av:'AV32TFAlbColorCv',fld:'vTFALBCOLORCV',pic:''},{av:'AV33TFAlbColorCv_Sel',fld:'vTFALBCOLORCV_SEL',pic:''},{av:'AV34TFAlbNomCli',fld:'vTFALBNOMCLI',pic:''},{av:'AV35TFAlbNomCli_Sel',fld:'vTFALBNOMCLI_SEL',pic:''},{av:'AV36TFAlbColNum',fld:'vTFALBCOLNUM',pic:'ZZZZZ9'},{av:'AV37TFAlbColNum_To',fld:'vTFALBCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV38TFCodCod',fld:'vTFCODCOD',pic:'XXXXXX'},{av:'AV39TFCodCod_Sel',fld:'vTFCODCOD_SEL',pic:'XXXXXX'},{av:'AV40TFBarAlbKgmE',fld:'vTFBARALBKGME',pic:'ZZZZZ9.99'},{av:'AV41TFBarAlbKgmE_To',fld:'vTFBARALBKGME_TO',pic:'ZZZZZ9.99'},{av:'AV42TFBarPreKgm',fld:'vTFBARPREKGM',pic:'ZZZZZZ9.999'},{av:'AV43TFBarPreKgm_To',fld:'vTFBARPREKGM_TO',pic:'ZZZZZZ9.999'},{av:'AV44TFAlbHdrAnc',fld:'vTFALBHDRANC',pic:'ZZZ9'},{av:'AV45TFAlbHdrAnc_To',fld:'vTFALBHDRANC_TO',pic:'ZZZ9'},{av:'AV46TFAlbHdrgm2',fld:'vTFALBHDRGM2',pic:'ZZZ9'},{av:'AV47TFAlbHdrgm2_To',fld:'vTFALBHDRGM2_TO',pic:'ZZZ9'},{av:'AV48TFBarAlbMtrE',fld:'vTFBARALBMTRE',pic:'ZZZZZ9.99'},{av:'AV49TFBarAlbMtrE_To',fld:'vTFBARALBMTRE_TO',pic:'ZZZZZ9.99'},{av:'AV50TFBarPreMtr',fld:'vTFBARPREMTR',pic:'ZZZZZZ9.999'},{av:'AV51TFBarPreMtr_To',fld:'vTFBARPREMTR_TO',pic:'ZZZZZZ9.999'},{av:'AV52TFBarAlbPie',fld:'vTFBARALBPIE',pic:'ZZZZZ9'},{av:'AV53TFBarAlbPie_To',fld:'vTFBARALBPIE_TO',pic:'ZZZZZ9'},{av:'AV54TFAlbTiras',fld:'vTFALBTIRAS',pic:''},{av:'AV55TFAlbTiras_Sel',fld:'vTFALBTIRAS_SEL',pic:''},{av:'AV56TFAlbTirasKg',fld:'vTFALBTIRASKG',pic:'ZZZZZ9.99'},{av:'AV57TFAlbTirasKg_To',fld:'vTFALBTIRASKG_TO',pic:'ZZZZZ9.99'},{av:'AV58TFAlbSinTest',fld:'vTFALBSINTEST',pic:''},{av:'AV59TFAlbSinTest_Sel',fld:'vTFALBSINTEST_SEL',pic:''},{av:'AV60TFTubCod',fld:'vTFTUBCOD',pic:'ZZZ9'},{av:'AV61TFTubCod_To',fld:'vTFTUBCOD_TO',pic:'ZZZ9'},{av:'AV62TFBarAlbTub',fld:'vTFBARALBTUB',pic:'ZZZ9'},{av:'AV63TFBarAlbTub_To',fld:'vTFBARALBTUB_TO',pic:'ZZZ9'},{av:'AV64TFAlbHdrObs',fld:'vTFALBHDROBS',pic:''},{av:'AV65TFAlbHdrObs_Sel',fld:'vTFALBHDROBS_SEL',pic:''},{av:'AV66TFPlasCod',fld:'vTFPLASCOD',pic:'ZZZ9'},{av:'AV67TFPlasCod_To',fld:'vTFPLASCOD_TO',pic:'ZZZ9'},{av:'AV68TFBarAlbPlas',fld:'vTFBARALBPLAS',pic:'ZZZ9'},{av:'AV69TFBarAlbPlas_To',fld:'vTFBARALBPLAS_TO',pic:'ZZZ9'},{av:'AV70TFTipAcaCod',fld:'vTFTIPACACOD',pic:'ZZZ9'},{av:'AV71TFTipAcaCod_To',fld:'vTFTIPACACOD_TO',pic:'ZZZ9'},{av:'AV73TFAlbProVal_Sels',fld:'vTFALBPROVAL_SELS',pic:''},{av:'AV85AccionesEnPopup',fld:'vACCIONESENPOPUP',pic:''},{av:'AV84VisualizarAcciones',fld:'vVISUALIZARACCIONES',pic:''},{av:'AV95Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV89Artemalha',fld:'vARTEMALHA',pic:'9',hsh:true},{av:'AV90F_carvema',fld:'vF_CARVEMA',pic:'9',hsh:true},{av:'AV91Siplasticos',fld:'vSIPLASTICOS',pic:'9',hsh:true},{av:'AV92Endutex',fld:'vENDUTEX',pic:'9',hsh:true},{av:'sPrefix'},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'},{av:'Ddo_grid_Selectedvalue_get',ctrl:'DDO_GRID',prop:'SelectedValue_get'},{av:'Ddo_grid_Filteredtextto_get',ctrl:'DDO_GRID',prop:'FilteredTextTo_get'},{av:'Ddo_grid_Filteredtext_get',ctrl:'DDO_GRID',prop:'FilteredText_get'},{av:'Ddo_grid_Selectedcolumn',ctrl:'DDO_GRID',prop:'SelectedColumn'}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV72TFAlbProVal_SelsJson',fld:'vTFALBPROVAL_SELSJSON',pic:''},{av:'AV73TFAlbProVal_Sels',fld:'vTFALBPROVAL_SELS',pic:''},{av:'AV70TFTipAcaCod',fld:'vTFTIPACACOD',pic:'ZZZ9'},{av:'AV71TFTipAcaCod_To',fld:'vTFTIPACACOD_TO',pic:'ZZZ9'},{av:'AV68TFBarAlbPlas',fld:'vTFBARALBPLAS',pic:'ZZZ9'},{av:'AV69TFBarAlbPlas_To',fld:'vTFBARALBPLAS_TO',pic:'ZZZ9'},{av:'AV66TFPlasCod',fld:'vTFPLASCOD',pic:'ZZZ9'},{av:'AV67TFPlasCod_To',fld:'vTFPLASCOD_TO',pic:'ZZZ9'},{av:'AV64TFAlbHdrObs',fld:'vTFALBHDROBS',pic:''},{av:'AV65TFAlbHdrObs_Sel',fld:'vTFALBHDROBS_SEL',pic:''},{av:'AV62TFBarAlbTub',fld:'vTFBARALBTUB',pic:'ZZZ9'},{av:'AV63TFBarAlbTub_To',fld:'vTFBARALBTUB_TO',pic:'ZZZ9'},{av:'AV60TFTubCod',fld:'vTFTUBCOD',pic:'ZZZ9'},{av:'AV61TFTubCod_To',fld:'vTFTUBCOD_TO',pic:'ZZZ9'},{av:'AV58TFAlbSinTest',fld:'vTFALBSINTEST',pic:''},{av:'AV59TFAlbSinTest_Sel',fld:'vTFALBSINTEST_SEL',pic:''},{av:'AV56TFAlbTirasKg',fld:'vTFALBTIRASKG',pic:'ZZZZZ9.99'},{av:'AV57TFAlbTirasKg_To',fld:'vTFALBTIRASKG_TO',pic:'ZZZZZ9.99'},{av:'AV54TFAlbTiras',fld:'vTFALBTIRAS',pic:''},{av:'AV55TFAlbTiras_Sel',fld:'vTFALBTIRAS_SEL',pic:''},{av:'AV52TFBarAlbPie',fld:'vTFBARALBPIE',pic:'ZZZZZ9'},{av:'AV53TFBarAlbPie_To',fld:'vTFBARALBPIE_TO',pic:'ZZZZZ9'},{av:'AV50TFBarPreMtr',fld:'vTFBARPREMTR',pic:'ZZZZZZ9.999'},{av:'AV51TFBarPreMtr_To',fld:'vTFBARPREMTR_TO',pic:'ZZZZZZ9.999'},{av:'AV48TFBarAlbMtrE',fld:'vTFBARALBMTRE',pic:'ZZZZZ9.99'},{av:'AV49TFBarAlbMtrE_To',fld:'vTFBARALBMTRE_TO',pic:'ZZZZZ9.99'},{av:'AV46TFAlbHdrgm2',fld:'vTFALBHDRGM2',pic:'ZZZ9'},{av:'AV47TFAlbHdrgm2_To',fld:'vTFALBHDRGM2_TO',pic:'ZZZ9'},{av:'AV44TFAlbHdrAnc',fld:'vTFALBHDRANC',pic:'ZZZ9'},{av:'AV45TFAlbHdrAnc_To',fld:'vTFALBHDRANC_TO',pic:'ZZZ9'},{av:'AV42TFBarPreKgm',fld:'vTFBARPREKGM',pic:'ZZZZZZ9.999'},{av:'AV43TFBarPreKgm_To',fld:'vTFBARPREKGM_TO',pic:'ZZZZZZ9.999'},{av:'AV40TFBarAlbKgmE',fld:'vTFBARALBKGME',pic:'ZZZZZ9.99'},{av:'AV41TFBarAlbKgmE_To',fld:'vTFBARALBKGME_TO',pic:'ZZZZZ9.99'},{av:'AV38TFCodCod',fld:'vTFCODCOD',pic:'XXXXXX'},{av:'AV39TFCodCod_Sel',fld:'vTFCODCOD_SEL',pic:'XXXXXX'},{av:'AV36TFAlbColNum',fld:'vTFALBCOLNUM',pic:'ZZZZZ9'},{av:'AV37TFAlbColNum_To',fld:'vTFALBCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV34TFAlbNomCli',fld:'vTFALBNOMCLI',pic:''},{av:'AV35TFAlbNomCli_Sel',fld:'vTFALBNOMCLI_SEL',pic:''},{av:'AV32TFAlbColorCv',fld:'vTFALBCOLORCV',pic:''},{av:'AV33TFAlbColorCv_Sel',fld:'vTFALBCOLORCV_SEL',pic:''},{av:'AV30TFAlbSer',fld:'vTFALBSER',pic:''},{av:'AV31TFAlbSer_Sel',fld:'vTFALBSER_SEL',pic:''},{av:'AV28TFBarCodPar',fld:'vTFBARCODPAR',pic:''},{av:'AV29TFBarCodPar_Sel',fld:'vTFBARCODPAR_SEL',pic:''},{av:'AV26TFBarCodReo',fld:'vTFBARCODREO',pic:'9'},{av:'AV27TFBarCodReo_To',fld:'vTFBARCODREO_TO',pic:'9'},{av:'AV24TFBarCod',fld:'vTFBARCOD',pic:'ZZZZZZZ9'},{av:'AV25TFBarCod_To',fld:'vTFBARCOD_TO',pic:'ZZZZZZZ9'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e191XC2',iparms:[{av:'AV84VisualizarAcciones',fld:'vVISUALIZARACCIONES',pic:''}]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'AV83DetailWebComponent',fld:'vDETAILWEBCOMPONENT',pic:''},{av:'AV86Update',fld:'vUPDATE',pic:''},{av:'edtavUpdate_Class',ctrl:'vUPDATE',prop:'Class'},{av:'AV87Delete',fld:'vDELETE',pic:''},{av:'edtavDelete_Class',ctrl:'vDELETE',prop:'Class'}]}");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED","{handler:'e151XC2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'A30AlbProCod',fld:'ALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV23ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV18ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV24TFBarCod',fld:'vTFBARCOD',pic:'ZZZZZZZ9'},{av:'AV25TFBarCod_To',fld:'vTFBARCOD_TO',pic:'ZZZZZZZ9'},{av:'AV26TFBarCodReo',fld:'vTFBARCODREO',pic:'9'},{av:'AV27TFBarCodReo_To',fld:'vTFBARCODREO_TO',pic:'9'},{av:'AV28TFBarCodPar',fld:'vTFBARCODPAR',pic:''},{av:'AV29TFBarCodPar_Sel',fld:'vTFBARCODPAR_SEL',pic:''},{av:'AV30TFAlbSer',fld:'vTFALBSER',pic:''},{av:'AV31TFAlbSer_Sel',fld:'vTFALBSER_SEL',pic:''},{av:'AV32TFAlbColorCv',fld:'vTFALBCOLORCV',pic:''},{av:'AV33TFAlbColorCv_Sel',fld:'vTFALBCOLORCV_SEL',pic:''},{av:'AV34TFAlbNomCli',fld:'vTFALBNOMCLI',pic:''},{av:'AV35TFAlbNomCli_Sel',fld:'vTFALBNOMCLI_SEL',pic:''},{av:'AV36TFAlbColNum',fld:'vTFALBCOLNUM',pic:'ZZZZZ9'},{av:'AV37TFAlbColNum_To',fld:'vTFALBCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV38TFCodCod',fld:'vTFCODCOD',pic:'XXXXXX'},{av:'AV39TFCodCod_Sel',fld:'vTFCODCOD_SEL',pic:'XXXXXX'},{av:'AV40TFBarAlbKgmE',fld:'vTFBARALBKGME',pic:'ZZZZZ9.99'},{av:'AV41TFBarAlbKgmE_To',fld:'vTFBARALBKGME_TO',pic:'ZZZZZ9.99'},{av:'AV42TFBarPreKgm',fld:'vTFBARPREKGM',pic:'ZZZZZZ9.999'},{av:'AV43TFBarPreKgm_To',fld:'vTFBARPREKGM_TO',pic:'ZZZZZZ9.999'},{av:'AV44TFAlbHdrAnc',fld:'vTFALBHDRANC',pic:'ZZZ9'},{av:'AV45TFAlbHdrAnc_To',fld:'vTFALBHDRANC_TO',pic:'ZZZ9'},{av:'AV46TFAlbHdrgm2',fld:'vTFALBHDRGM2',pic:'ZZZ9'},{av:'AV47TFAlbHdrgm2_To',fld:'vTFALBHDRGM2_TO',pic:'ZZZ9'},{av:'AV48TFBarAlbMtrE',fld:'vTFBARALBMTRE',pic:'ZZZZZ9.99'},{av:'AV49TFBarAlbMtrE_To',fld:'vTFBARALBMTRE_TO',pic:'ZZZZZ9.99'},{av:'AV50TFBarPreMtr',fld:'vTFBARPREMTR',pic:'ZZZZZZ9.999'},{av:'AV51TFBarPreMtr_To',fld:'vTFBARPREMTR_TO',pic:'ZZZZZZ9.999'},{av:'AV52TFBarAlbPie',fld:'vTFBARALBPIE',pic:'ZZZZZ9'},{av:'AV53TFBarAlbPie_To',fld:'vTFBARALBPIE_TO',pic:'ZZZZZ9'},{av:'AV54TFAlbTiras',fld:'vTFALBTIRAS',pic:''},{av:'AV55TFAlbTiras_Sel',fld:'vTFALBTIRAS_SEL',pic:''},{av:'AV56TFAlbTirasKg',fld:'vTFALBTIRASKG',pic:'ZZZZZ9.99'},{av:'AV57TFAlbTirasKg_To',fld:'vTFALBTIRASKG_TO',pic:'ZZZZZ9.99'},{av:'AV58TFAlbSinTest',fld:'vTFALBSINTEST',pic:''},{av:'AV59TFAlbSinTest_Sel',fld:'vTFALBSINTEST_SEL',pic:''},{av:'AV60TFTubCod',fld:'vTFTUBCOD',pic:'ZZZ9'},{av:'AV61TFTubCod_To',fld:'vTFTUBCOD_TO',pic:'ZZZ9'},{av:'AV62TFBarAlbTub',fld:'vTFBARALBTUB',pic:'ZZZ9'},{av:'AV63TFBarAlbTub_To',fld:'vTFBARALBTUB_TO',pic:'ZZZ9'},{av:'AV64TFAlbHdrObs',fld:'vTFALBHDROBS',pic:''},{av:'AV65TFAlbHdrObs_Sel',fld:'vTFALBHDROBS_SEL',pic:''},{av:'AV66TFPlasCod',fld:'vTFPLASCOD',pic:'ZZZ9'},{av:'AV67TFPlasCod_To',fld:'vTFPLASCOD_TO',pic:'ZZZ9'},{av:'AV68TFBarAlbPlas',fld:'vTFBARALBPLAS',pic:'ZZZ9'},{av:'AV69TFBarAlbPlas_To',fld:'vTFBARALBPLAS_TO',pic:'ZZZ9'},{av:'AV70TFTipAcaCod',fld:'vTFTIPACACOD',pic:'ZZZ9'},{av:'AV71TFTipAcaCod_To',fld:'vTFTIPACACOD_TO',pic:'ZZZ9'},{av:'AV73TFAlbProVal_Sels',fld:'vTFALBPROVAL_SELS',pic:''},{av:'AV85AccionesEnPopup',fld:'vACCIONESENPOPUP',pic:''},{av:'AV84VisualizarAcciones',fld:'vVISUALIZARACCIONES',pic:''},{av:'AV95Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV89Artemalha',fld:'vARTEMALHA',pic:'9',hsh:true},{av:'AV90F_carvema',fld:'vF_CARVEMA',pic:'9',hsh:true},{av:'AV91Siplasticos',fld:'vSIPLASTICOS',pic:'9',hsh:true},{av:'AV92Endutex',fld:'vENDUTEX',pic:'9',hsh:true},{av:'sPrefix'},{av:'Ddo_gridcolumnsselector_Columnsselectorvalues',ctrl:'DDO_GRIDCOLUMNSSELECTOR',prop:'ColumnsSelectorValues'}]");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED",",oparms:[{av:'AV18ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV23ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'edtBarCod_Visible',ctrl:'BARCOD',prop:'Visible'},{av:'edtBarCodReo_Visible',ctrl:'BARCODREO',prop:'Visible'},{av:'edtBarCodPar_Visible',ctrl:'BARCODPAR',prop:'Visible'},{av:'edtAlbSer_Visible',ctrl:'ALBSER',prop:'Visible'},{av:'edtAlbColorCv_Visible',ctrl:'ALBCOLORCV',prop:'Visible'},{av:'edtAlbNomCli_Visible',ctrl:'ALBNOMCLI',prop:'Visible'},{av:'edtAlbColNum_Visible',ctrl:'ALBCOLNUM',prop:'Visible'},{av:'edtCodCod_Visible',ctrl:'CODCOD',prop:'Visible'},{av:'edtBarAlbKgmE_Visible',ctrl:'BARALBKGME',prop:'Visible'},{av:'edtBarPreKgm_Visible',ctrl:'BARPREKGM',prop:'Visible'},{av:'edtAlbHdrAnc_Visible',ctrl:'ALBHDRANC',prop:'Visible'},{av:'edtAlbHdrgm2_Visible',ctrl:'ALBHDRGM2',prop:'Visible'},{av:'edtBarAlbMtrE_Visible',ctrl:'BARALBMTRE',prop:'Visible'},{av:'edtBarPreMtr_Visible',ctrl:'BARPREMTR',prop:'Visible'},{av:'edtBarAlbPie_Visible',ctrl:'BARALBPIE',prop:'Visible'},{av:'edtAlbTiras_Visible',ctrl:'ALBTIRAS',prop:'Visible'},{av:'edtAlbTirasKg_Visible',ctrl:'ALBTIRASKG',prop:'Visible'},{av:'edtAlbSinTest_Visible',ctrl:'ALBSINTEST',prop:'Visible'},{av:'edtTubCod_Visible',ctrl:'TUBCOD',prop:'Visible'},{av:'edtBarAlbTub_Visible',ctrl:'BARALBTUB',prop:'Visible'},{av:'edtAlbHdrObs_Visible',ctrl:'ALBHDROBS',prop:'Visible'},{av:'edtPlasCod_Visible',ctrl:'PLASCOD',prop:'Visible'},{av:'edtBarAlbPlas_Visible',ctrl:'BARALBPLAS',prop:'Visible'},{av:'edtTipAcaCod_Visible',ctrl:'TIPACACOD',prop:'Visible'},{av:'cmbAlbProVal'},{av:'AV80GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV81GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{ctrl:'BTN_CANCEL',prop:'Visible'},{ctrl:'BTNINSERT',prop:'Visible'},{av:'AV21ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV38TFCodCod',fld:'vTFCODCOD',pic:'XXXXXX'},{av:'AV39TFCodCod_Sel',fld:'vTFCODCOD_SEL',pic:'XXXXXX'},{av:'AV54TFAlbTiras',fld:'vTFALBTIRAS',pic:''},{av:'AV55TFAlbTiras_Sel',fld:'vTFALBTIRAS_SEL',pic:''},{av:'AV56TFAlbTirasKg',fld:'vTFALBTIRASKG',pic:'ZZZZZ9.99'},{av:'AV57TFAlbTirasKg_To',fld:'vTFALBTIRASKG_TO',pic:'ZZZZZ9.99'},{av:'AV58TFAlbSinTest',fld:'vTFALBSINTEST',pic:''},{av:'AV59TFAlbSinTest_Sel',fld:'vTFALBSINTEST_SEL',pic:''},{av:'AV66TFPlasCod',fld:'vTFPLASCOD',pic:'ZZZ9'},{av:'AV67TFPlasCod_To',fld:'vTFPLASCOD_TO',pic:'ZZZ9'},{av:'AV68TFBarAlbPlas',fld:'vTFBARALBPLAS',pic:'ZZZ9'},{av:'AV69TFBarAlbPlas_To',fld:'vTFBARALBPLAS_TO',pic:'ZZZ9'},{av:'AV70TFTipAcaCod',fld:'vTFTIPACACOD',pic:'ZZZ9'},{av:'AV71TFTipAcaCod_To',fld:'vTFTIPACACOD_TO',pic:'ZZZ9'}]}");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED","{handler:'e111XC2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'A30AlbProCod',fld:'ALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV23ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV18ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV24TFBarCod',fld:'vTFBARCOD',pic:'ZZZZZZZ9'},{av:'AV25TFBarCod_To',fld:'vTFBARCOD_TO',pic:'ZZZZZZZ9'},{av:'AV26TFBarCodReo',fld:'vTFBARCODREO',pic:'9'},{av:'AV27TFBarCodReo_To',fld:'vTFBARCODREO_TO',pic:'9'},{av:'AV28TFBarCodPar',fld:'vTFBARCODPAR',pic:''},{av:'AV29TFBarCodPar_Sel',fld:'vTFBARCODPAR_SEL',pic:''},{av:'AV30TFAlbSer',fld:'vTFALBSER',pic:''},{av:'AV31TFAlbSer_Sel',fld:'vTFALBSER_SEL',pic:''},{av:'AV32TFAlbColorCv',fld:'vTFALBCOLORCV',pic:''},{av:'AV33TFAlbColorCv_Sel',fld:'vTFALBCOLORCV_SEL',pic:''},{av:'AV34TFAlbNomCli',fld:'vTFALBNOMCLI',pic:''},{av:'AV35TFAlbNomCli_Sel',fld:'vTFALBNOMCLI_SEL',pic:''},{av:'AV36TFAlbColNum',fld:'vTFALBCOLNUM',pic:'ZZZZZ9'},{av:'AV37TFAlbColNum_To',fld:'vTFALBCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV38TFCodCod',fld:'vTFCODCOD',pic:'XXXXXX'},{av:'AV39TFCodCod_Sel',fld:'vTFCODCOD_SEL',pic:'XXXXXX'},{av:'AV40TFBarAlbKgmE',fld:'vTFBARALBKGME',pic:'ZZZZZ9.99'},{av:'AV41TFBarAlbKgmE_To',fld:'vTFBARALBKGME_TO',pic:'ZZZZZ9.99'},{av:'AV42TFBarPreKgm',fld:'vTFBARPREKGM',pic:'ZZZZZZ9.999'},{av:'AV43TFBarPreKgm_To',fld:'vTFBARPREKGM_TO',pic:'ZZZZZZ9.999'},{av:'AV44TFAlbHdrAnc',fld:'vTFALBHDRANC',pic:'ZZZ9'},{av:'AV45TFAlbHdrAnc_To',fld:'vTFALBHDRANC_TO',pic:'ZZZ9'},{av:'AV46TFAlbHdrgm2',fld:'vTFALBHDRGM2',pic:'ZZZ9'},{av:'AV47TFAlbHdrgm2_To',fld:'vTFALBHDRGM2_TO',pic:'ZZZ9'},{av:'AV48TFBarAlbMtrE',fld:'vTFBARALBMTRE',pic:'ZZZZZ9.99'},{av:'AV49TFBarAlbMtrE_To',fld:'vTFBARALBMTRE_TO',pic:'ZZZZZ9.99'},{av:'AV50TFBarPreMtr',fld:'vTFBARPREMTR',pic:'ZZZZZZ9.999'},{av:'AV51TFBarPreMtr_To',fld:'vTFBARPREMTR_TO',pic:'ZZZZZZ9.999'},{av:'AV52TFBarAlbPie',fld:'vTFBARALBPIE',pic:'ZZZZZ9'},{av:'AV53TFBarAlbPie_To',fld:'vTFBARALBPIE_TO',pic:'ZZZZZ9'},{av:'AV54TFAlbTiras',fld:'vTFALBTIRAS',pic:''},{av:'AV55TFAlbTiras_Sel',fld:'vTFALBTIRAS_SEL',pic:''},{av:'AV56TFAlbTirasKg',fld:'vTFALBTIRASKG',pic:'ZZZZZ9.99'},{av:'AV57TFAlbTirasKg_To',fld:'vTFALBTIRASKG_TO',pic:'ZZZZZ9.99'},{av:'AV58TFAlbSinTest',fld:'vTFALBSINTEST',pic:''},{av:'AV59TFAlbSinTest_Sel',fld:'vTFALBSINTEST_SEL',pic:''},{av:'AV60TFTubCod',fld:'vTFTUBCOD',pic:'ZZZ9'},{av:'AV61TFTubCod_To',fld:'vTFTUBCOD_TO',pic:'ZZZ9'},{av:'AV62TFBarAlbTub',fld:'vTFBARALBTUB',pic:'ZZZ9'},{av:'AV63TFBarAlbTub_To',fld:'vTFBARALBTUB_TO',pic:'ZZZ9'},{av:'AV64TFAlbHdrObs',fld:'vTFALBHDROBS',pic:''},{av:'AV65TFAlbHdrObs_Sel',fld:'vTFALBHDROBS_SEL',pic:''},{av:'AV66TFPlasCod',fld:'vTFPLASCOD',pic:'ZZZ9'},{av:'AV67TFPlasCod_To',fld:'vTFPLASCOD_TO',pic:'ZZZ9'},{av:'AV68TFBarAlbPlas',fld:'vTFBARALBPLAS',pic:'ZZZ9'},{av:'AV69TFBarAlbPlas_To',fld:'vTFBARALBPLAS_TO',pic:'ZZZ9'},{av:'AV70TFTipAcaCod',fld:'vTFTIPACACOD',pic:'ZZZ9'},{av:'AV71TFTipAcaCod_To',fld:'vTFTIPACACOD_TO',pic:'ZZZ9'},{av:'AV73TFAlbProVal_Sels',fld:'vTFALBPROVAL_SELS',pic:''},{av:'AV85AccionesEnPopup',fld:'vACCIONESENPOPUP',pic:''},{av:'AV84VisualizarAcciones',fld:'vVISUALIZARACCIONES',pic:''},{av:'AV95Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV89Artemalha',fld:'vARTEMALHA',pic:'9',hsh:true},{av:'AV90F_carvema',fld:'vF_CARVEMA',pic:'9',hsh:true},{av:'AV91Siplasticos',fld:'vSIPLASTICOS',pic:'9',hsh:true},{av:'AV92Endutex',fld:'vENDUTEX',pic:'9',hsh:true},{av:'sPrefix'},{av:'Ddo_managefilters_Activeeventkey',ctrl:'DDO_MANAGEFILTERS',prop:'ActiveEventKey'},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV72TFAlbProVal_SelsJson',fld:'vTFALBPROVAL_SELSJSON',pic:''}]");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED",",oparms:[{av:'AV23ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV24TFBarCod',fld:'vTFBARCOD',pic:'ZZZZZZZ9'},{av:'AV25TFBarCod_To',fld:'vTFBARCOD_TO',pic:'ZZZZZZZ9'},{av:'AV26TFBarCodReo',fld:'vTFBARCODREO',pic:'9'},{av:'AV27TFBarCodReo_To',fld:'vTFBARCODREO_TO',pic:'9'},{av:'AV28TFBarCodPar',fld:'vTFBARCODPAR',pic:''},{av:'AV29TFBarCodPar_Sel',fld:'vTFBARCODPAR_SEL',pic:''},{av:'AV30TFAlbSer',fld:'vTFALBSER',pic:''},{av:'AV31TFAlbSer_Sel',fld:'vTFALBSER_SEL',pic:''},{av:'AV32TFAlbColorCv',fld:'vTFALBCOLORCV',pic:''},{av:'AV33TFAlbColorCv_Sel',fld:'vTFALBCOLORCV_SEL',pic:''},{av:'AV34TFAlbNomCli',fld:'vTFALBNOMCLI',pic:''},{av:'AV35TFAlbNomCli_Sel',fld:'vTFALBNOMCLI_SEL',pic:''},{av:'AV36TFAlbColNum',fld:'vTFALBCOLNUM',pic:'ZZZZZ9'},{av:'AV37TFAlbColNum_To',fld:'vTFALBCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV38TFCodCod',fld:'vTFCODCOD',pic:'XXXXXX'},{av:'AV39TFCodCod_Sel',fld:'vTFCODCOD_SEL',pic:'XXXXXX'},{av:'AV40TFBarAlbKgmE',fld:'vTFBARALBKGME',pic:'ZZZZZ9.99'},{av:'AV41TFBarAlbKgmE_To',fld:'vTFBARALBKGME_TO',pic:'ZZZZZ9.99'},{av:'AV42TFBarPreKgm',fld:'vTFBARPREKGM',pic:'ZZZZZZ9.999'},{av:'AV43TFBarPreKgm_To',fld:'vTFBARPREKGM_TO',pic:'ZZZZZZ9.999'},{av:'AV44TFAlbHdrAnc',fld:'vTFALBHDRANC',pic:'ZZZ9'},{av:'AV45TFAlbHdrAnc_To',fld:'vTFALBHDRANC_TO',pic:'ZZZ9'},{av:'AV46TFAlbHdrgm2',fld:'vTFALBHDRGM2',pic:'ZZZ9'},{av:'AV47TFAlbHdrgm2_To',fld:'vTFALBHDRGM2_TO',pic:'ZZZ9'},{av:'AV48TFBarAlbMtrE',fld:'vTFBARALBMTRE',pic:'ZZZZZ9.99'},{av:'AV49TFBarAlbMtrE_To',fld:'vTFBARALBMTRE_TO',pic:'ZZZZZ9.99'},{av:'AV50TFBarPreMtr',fld:'vTFBARPREMTR',pic:'ZZZZZZ9.999'},{av:'AV51TFBarPreMtr_To',fld:'vTFBARPREMTR_TO',pic:'ZZZZZZ9.999'},{av:'AV52TFBarAlbPie',fld:'vTFBARALBPIE',pic:'ZZZZZ9'},{av:'AV53TFBarAlbPie_To',fld:'vTFBARALBPIE_TO',pic:'ZZZZZ9'},{av:'AV54TFAlbTiras',fld:'vTFALBTIRAS',pic:''},{av:'AV55TFAlbTiras_Sel',fld:'vTFALBTIRAS_SEL',pic:''},{av:'AV56TFAlbTirasKg',fld:'vTFALBTIRASKG',pic:'ZZZZZ9.99'},{av:'AV57TFAlbTirasKg_To',fld:'vTFALBTIRASKG_TO',pic:'ZZZZZ9.99'},{av:'AV58TFAlbSinTest',fld:'vTFALBSINTEST',pic:''},{av:'AV59TFAlbSinTest_Sel',fld:'vTFALBSINTEST_SEL',pic:''},{av:'AV60TFTubCod',fld:'vTFTUBCOD',pic:'ZZZ9'},{av:'AV61TFTubCod_To',fld:'vTFTUBCOD_TO',pic:'ZZZ9'},{av:'AV62TFBarAlbTub',fld:'vTFBARALBTUB',pic:'ZZZ9'},{av:'AV63TFBarAlbTub_To',fld:'vTFBARALBTUB_TO',pic:'ZZZ9'},{av:'AV64TFAlbHdrObs',fld:'vTFALBHDROBS',pic:''},{av:'AV65TFAlbHdrObs_Sel',fld:'vTFALBHDROBS_SEL',pic:''},{av:'AV66TFPlasCod',fld:'vTFPLASCOD',pic:'ZZZ9'},{av:'AV67TFPlasCod_To',fld:'vTFPLASCOD_TO',pic:'ZZZ9'},{av:'AV68TFBarAlbPlas',fld:'vTFBARALBPLAS',pic:'ZZZ9'},{av:'AV69TFBarAlbPlas_To',fld:'vTFBARALBPLAS_TO',pic:'ZZZ9'},{av:'AV70TFTipAcaCod',fld:'vTFTIPACACOD',pic:'ZZZ9'},{av:'AV71TFTipAcaCod_To',fld:'vTFTIPACACOD_TO',pic:'ZZZ9'},{av:'AV73TFAlbProVal_Sels',fld:'vTFALBPROVAL_SELS',pic:''},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'AV72TFAlbProVal_SelsJson',fld:'vTFALBPROVAL_SELSJSON',pic:''},{av:'AV18ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtBarCod_Visible',ctrl:'BARCOD',prop:'Visible'},{av:'edtBarCodReo_Visible',ctrl:'BARCODREO',prop:'Visible'},{av:'edtBarCodPar_Visible',ctrl:'BARCODPAR',prop:'Visible'},{av:'edtAlbSer_Visible',ctrl:'ALBSER',prop:'Visible'},{av:'edtAlbColorCv_Visible',ctrl:'ALBCOLORCV',prop:'Visible'},{av:'edtAlbNomCli_Visible',ctrl:'ALBNOMCLI',prop:'Visible'},{av:'edtAlbColNum_Visible',ctrl:'ALBCOLNUM',prop:'Visible'},{av:'edtCodCod_Visible',ctrl:'CODCOD',prop:'Visible'},{av:'edtBarAlbKgmE_Visible',ctrl:'BARALBKGME',prop:'Visible'},{av:'edtBarPreKgm_Visible',ctrl:'BARPREKGM',prop:'Visible'},{av:'edtAlbHdrAnc_Visible',ctrl:'ALBHDRANC',prop:'Visible'},{av:'edtAlbHdrgm2_Visible',ctrl:'ALBHDRGM2',prop:'Visible'},{av:'edtBarAlbMtrE_Visible',ctrl:'BARALBMTRE',prop:'Visible'},{av:'edtBarPreMtr_Visible',ctrl:'BARPREMTR',prop:'Visible'},{av:'edtBarAlbPie_Visible',ctrl:'BARALBPIE',prop:'Visible'},{av:'edtAlbTiras_Visible',ctrl:'ALBTIRAS',prop:'Visible'},{av:'edtAlbTirasKg_Visible',ctrl:'ALBTIRASKG',prop:'Visible'},{av:'edtAlbSinTest_Visible',ctrl:'ALBSINTEST',prop:'Visible'},{av:'edtTubCod_Visible',ctrl:'TUBCOD',prop:'Visible'},{av:'edtBarAlbTub_Visible',ctrl:'BARALBTUB',prop:'Visible'},{av:'edtAlbHdrObs_Visible',ctrl:'ALBHDROBS',prop:'Visible'},{av:'edtPlasCod_Visible',ctrl:'PLASCOD',prop:'Visible'},{av:'edtBarAlbPlas_Visible',ctrl:'BARALBPLAS',prop:'Visible'},{av:'edtTipAcaCod_Visible',ctrl:'TIPACACOD',prop:'Visible'},{av:'cmbAlbProVal'},{av:'AV80GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV81GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{ctrl:'BTN_CANCEL',prop:'Visible'},{ctrl:'BTNINSERT',prop:'Visible'},{av:'AV21ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''}]}");
      setEventMetadata("VUPDATE.CLICK","{handler:'e201XC2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'A30AlbProCod',fld:'ALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV23ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV18ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV24TFBarCod',fld:'vTFBARCOD',pic:'ZZZZZZZ9'},{av:'AV25TFBarCod_To',fld:'vTFBARCOD_TO',pic:'ZZZZZZZ9'},{av:'AV26TFBarCodReo',fld:'vTFBARCODREO',pic:'9'},{av:'AV27TFBarCodReo_To',fld:'vTFBARCODREO_TO',pic:'9'},{av:'AV28TFBarCodPar',fld:'vTFBARCODPAR',pic:''},{av:'AV29TFBarCodPar_Sel',fld:'vTFBARCODPAR_SEL',pic:''},{av:'AV30TFAlbSer',fld:'vTFALBSER',pic:''},{av:'AV31TFAlbSer_Sel',fld:'vTFALBSER_SEL',pic:''},{av:'AV32TFAlbColorCv',fld:'vTFALBCOLORCV',pic:''},{av:'AV33TFAlbColorCv_Sel',fld:'vTFALBCOLORCV_SEL',pic:''},{av:'AV34TFAlbNomCli',fld:'vTFALBNOMCLI',pic:''},{av:'AV35TFAlbNomCli_Sel',fld:'vTFALBNOMCLI_SEL',pic:''},{av:'AV36TFAlbColNum',fld:'vTFALBCOLNUM',pic:'ZZZZZ9'},{av:'AV37TFAlbColNum_To',fld:'vTFALBCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV38TFCodCod',fld:'vTFCODCOD',pic:'XXXXXX'},{av:'AV39TFCodCod_Sel',fld:'vTFCODCOD_SEL',pic:'XXXXXX'},{av:'AV40TFBarAlbKgmE',fld:'vTFBARALBKGME',pic:'ZZZZZ9.99'},{av:'AV41TFBarAlbKgmE_To',fld:'vTFBARALBKGME_TO',pic:'ZZZZZ9.99'},{av:'AV42TFBarPreKgm',fld:'vTFBARPREKGM',pic:'ZZZZZZ9.999'},{av:'AV43TFBarPreKgm_To',fld:'vTFBARPREKGM_TO',pic:'ZZZZZZ9.999'},{av:'AV44TFAlbHdrAnc',fld:'vTFALBHDRANC',pic:'ZZZ9'},{av:'AV45TFAlbHdrAnc_To',fld:'vTFALBHDRANC_TO',pic:'ZZZ9'},{av:'AV46TFAlbHdrgm2',fld:'vTFALBHDRGM2',pic:'ZZZ9'},{av:'AV47TFAlbHdrgm2_To',fld:'vTFALBHDRGM2_TO',pic:'ZZZ9'},{av:'AV48TFBarAlbMtrE',fld:'vTFBARALBMTRE',pic:'ZZZZZ9.99'},{av:'AV49TFBarAlbMtrE_To',fld:'vTFBARALBMTRE_TO',pic:'ZZZZZ9.99'},{av:'AV50TFBarPreMtr',fld:'vTFBARPREMTR',pic:'ZZZZZZ9.999'},{av:'AV51TFBarPreMtr_To',fld:'vTFBARPREMTR_TO',pic:'ZZZZZZ9.999'},{av:'AV52TFBarAlbPie',fld:'vTFBARALBPIE',pic:'ZZZZZ9'},{av:'AV53TFBarAlbPie_To',fld:'vTFBARALBPIE_TO',pic:'ZZZZZ9'},{av:'AV54TFAlbTiras',fld:'vTFALBTIRAS',pic:''},{av:'AV55TFAlbTiras_Sel',fld:'vTFALBTIRAS_SEL',pic:''},{av:'AV56TFAlbTirasKg',fld:'vTFALBTIRASKG',pic:'ZZZZZ9.99'},{av:'AV57TFAlbTirasKg_To',fld:'vTFALBTIRASKG_TO',pic:'ZZZZZ9.99'},{av:'AV58TFAlbSinTest',fld:'vTFALBSINTEST',pic:''},{av:'AV59TFAlbSinTest_Sel',fld:'vTFALBSINTEST_SEL',pic:''},{av:'AV60TFTubCod',fld:'vTFTUBCOD',pic:'ZZZ9'},{av:'AV61TFTubCod_To',fld:'vTFTUBCOD_TO',pic:'ZZZ9'},{av:'AV62TFBarAlbTub',fld:'vTFBARALBTUB',pic:'ZZZ9'},{av:'AV63TFBarAlbTub_To',fld:'vTFBARALBTUB_TO',pic:'ZZZ9'},{av:'AV64TFAlbHdrObs',fld:'vTFALBHDROBS',pic:''},{av:'AV65TFAlbHdrObs_Sel',fld:'vTFALBHDROBS_SEL',pic:''},{av:'AV66TFPlasCod',fld:'vTFPLASCOD',pic:'ZZZ9'},{av:'AV67TFPlasCod_To',fld:'vTFPLASCOD_TO',pic:'ZZZ9'},{av:'AV68TFBarAlbPlas',fld:'vTFBARALBPLAS',pic:'ZZZ9'},{av:'AV69TFBarAlbPlas_To',fld:'vTFBARALBPLAS_TO',pic:'ZZZ9'},{av:'AV70TFTipAcaCod',fld:'vTFTIPACACOD',pic:'ZZZ9'},{av:'AV71TFTipAcaCod_To',fld:'vTFTIPACACOD_TO',pic:'ZZZ9'},{av:'AV73TFAlbProVal_Sels',fld:'vTFALBPROVAL_SELS',pic:''},{av:'AV85AccionesEnPopup',fld:'vACCIONESENPOPUP',pic:''},{av:'AV84VisualizarAcciones',fld:'vVISUALIZARACCIONES',pic:''},{av:'AV95Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV89Artemalha',fld:'vARTEMALHA',pic:'9',hsh:true},{av:'AV90F_carvema',fld:'vF_CARVEMA',pic:'9',hsh:true},{av:'AV91Siplasticos',fld:'vSIPLASTICOS',pic:'9',hsh:true},{av:'AV92Endutex',fld:'vENDUTEX',pic:'9',hsh:true},{av:'sPrefix'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9',hsh:true},{av:'A130BarCodPar',fld:'BARCODPAR',pic:'',hsh:true}]");
      setEventMetadata("VUPDATE.CLICK",",oparms:[{av:'AV23ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV18ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtBarCod_Visible',ctrl:'BARCOD',prop:'Visible'},{av:'edtBarCodReo_Visible',ctrl:'BARCODREO',prop:'Visible'},{av:'edtBarCodPar_Visible',ctrl:'BARCODPAR',prop:'Visible'},{av:'edtAlbSer_Visible',ctrl:'ALBSER',prop:'Visible'},{av:'edtAlbColorCv_Visible',ctrl:'ALBCOLORCV',prop:'Visible'},{av:'edtAlbNomCli_Visible',ctrl:'ALBNOMCLI',prop:'Visible'},{av:'edtAlbColNum_Visible',ctrl:'ALBCOLNUM',prop:'Visible'},{av:'edtCodCod_Visible',ctrl:'CODCOD',prop:'Visible'},{av:'edtBarAlbKgmE_Visible',ctrl:'BARALBKGME',prop:'Visible'},{av:'edtBarPreKgm_Visible',ctrl:'BARPREKGM',prop:'Visible'},{av:'edtAlbHdrAnc_Visible',ctrl:'ALBHDRANC',prop:'Visible'},{av:'edtAlbHdrgm2_Visible',ctrl:'ALBHDRGM2',prop:'Visible'},{av:'edtBarAlbMtrE_Visible',ctrl:'BARALBMTRE',prop:'Visible'},{av:'edtBarPreMtr_Visible',ctrl:'BARPREMTR',prop:'Visible'},{av:'edtBarAlbPie_Visible',ctrl:'BARALBPIE',prop:'Visible'},{av:'edtAlbTiras_Visible',ctrl:'ALBTIRAS',prop:'Visible'},{av:'edtAlbTirasKg_Visible',ctrl:'ALBTIRASKG',prop:'Visible'},{av:'edtAlbSinTest_Visible',ctrl:'ALBSINTEST',prop:'Visible'},{av:'edtTubCod_Visible',ctrl:'TUBCOD',prop:'Visible'},{av:'edtBarAlbTub_Visible',ctrl:'BARALBTUB',prop:'Visible'},{av:'edtAlbHdrObs_Visible',ctrl:'ALBHDROBS',prop:'Visible'},{av:'edtPlasCod_Visible',ctrl:'PLASCOD',prop:'Visible'},{av:'edtBarAlbPlas_Visible',ctrl:'BARALBPLAS',prop:'Visible'},{av:'edtTipAcaCod_Visible',ctrl:'TIPACACOD',prop:'Visible'},{av:'cmbAlbProVal'},{av:'AV80GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV81GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{ctrl:'BTN_CANCEL',prop:'Visible'},{ctrl:'BTNINSERT',prop:'Visible'},{av:'AV21ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV38TFCodCod',fld:'vTFCODCOD',pic:'XXXXXX'},{av:'AV39TFCodCod_Sel',fld:'vTFCODCOD_SEL',pic:'XXXXXX'},{av:'AV54TFAlbTiras',fld:'vTFALBTIRAS',pic:''},{av:'AV55TFAlbTiras_Sel',fld:'vTFALBTIRAS_SEL',pic:''},{av:'AV56TFAlbTirasKg',fld:'vTFALBTIRASKG',pic:'ZZZZZ9.99'},{av:'AV57TFAlbTirasKg_To',fld:'vTFALBTIRASKG_TO',pic:'ZZZZZ9.99'},{av:'AV58TFAlbSinTest',fld:'vTFALBSINTEST',pic:''},{av:'AV59TFAlbSinTest_Sel',fld:'vTFALBSINTEST_SEL',pic:''},{av:'AV66TFPlasCod',fld:'vTFPLASCOD',pic:'ZZZ9'},{av:'AV67TFPlasCod_To',fld:'vTFPLASCOD_TO',pic:'ZZZ9'},{av:'AV68TFBarAlbPlas',fld:'vTFBARALBPLAS',pic:'ZZZ9'},{av:'AV69TFBarAlbPlas_To',fld:'vTFBARALBPLAS_TO',pic:'ZZZ9'},{av:'AV70TFTipAcaCod',fld:'vTFTIPACACOD',pic:'ZZZ9'},{av:'AV71TFTipAcaCod_To',fld:'vTFTIPACACOD_TO',pic:'ZZZ9'}]}");
      setEventMetadata("VDELETE.CLICK","{handler:'e211XC2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'A30AlbProCod',fld:'ALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV23ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV18ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV24TFBarCod',fld:'vTFBARCOD',pic:'ZZZZZZZ9'},{av:'AV25TFBarCod_To',fld:'vTFBARCOD_TO',pic:'ZZZZZZZ9'},{av:'AV26TFBarCodReo',fld:'vTFBARCODREO',pic:'9'},{av:'AV27TFBarCodReo_To',fld:'vTFBARCODREO_TO',pic:'9'},{av:'AV28TFBarCodPar',fld:'vTFBARCODPAR',pic:''},{av:'AV29TFBarCodPar_Sel',fld:'vTFBARCODPAR_SEL',pic:''},{av:'AV30TFAlbSer',fld:'vTFALBSER',pic:''},{av:'AV31TFAlbSer_Sel',fld:'vTFALBSER_SEL',pic:''},{av:'AV32TFAlbColorCv',fld:'vTFALBCOLORCV',pic:''},{av:'AV33TFAlbColorCv_Sel',fld:'vTFALBCOLORCV_SEL',pic:''},{av:'AV34TFAlbNomCli',fld:'vTFALBNOMCLI',pic:''},{av:'AV35TFAlbNomCli_Sel',fld:'vTFALBNOMCLI_SEL',pic:''},{av:'AV36TFAlbColNum',fld:'vTFALBCOLNUM',pic:'ZZZZZ9'},{av:'AV37TFAlbColNum_To',fld:'vTFALBCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV38TFCodCod',fld:'vTFCODCOD',pic:'XXXXXX'},{av:'AV39TFCodCod_Sel',fld:'vTFCODCOD_SEL',pic:'XXXXXX'},{av:'AV40TFBarAlbKgmE',fld:'vTFBARALBKGME',pic:'ZZZZZ9.99'},{av:'AV41TFBarAlbKgmE_To',fld:'vTFBARALBKGME_TO',pic:'ZZZZZ9.99'},{av:'AV42TFBarPreKgm',fld:'vTFBARPREKGM',pic:'ZZZZZZ9.999'},{av:'AV43TFBarPreKgm_To',fld:'vTFBARPREKGM_TO',pic:'ZZZZZZ9.999'},{av:'AV44TFAlbHdrAnc',fld:'vTFALBHDRANC',pic:'ZZZ9'},{av:'AV45TFAlbHdrAnc_To',fld:'vTFALBHDRANC_TO',pic:'ZZZ9'},{av:'AV46TFAlbHdrgm2',fld:'vTFALBHDRGM2',pic:'ZZZ9'},{av:'AV47TFAlbHdrgm2_To',fld:'vTFALBHDRGM2_TO',pic:'ZZZ9'},{av:'AV48TFBarAlbMtrE',fld:'vTFBARALBMTRE',pic:'ZZZZZ9.99'},{av:'AV49TFBarAlbMtrE_To',fld:'vTFBARALBMTRE_TO',pic:'ZZZZZ9.99'},{av:'AV50TFBarPreMtr',fld:'vTFBARPREMTR',pic:'ZZZZZZ9.999'},{av:'AV51TFBarPreMtr_To',fld:'vTFBARPREMTR_TO',pic:'ZZZZZZ9.999'},{av:'AV52TFBarAlbPie',fld:'vTFBARALBPIE',pic:'ZZZZZ9'},{av:'AV53TFBarAlbPie_To',fld:'vTFBARALBPIE_TO',pic:'ZZZZZ9'},{av:'AV54TFAlbTiras',fld:'vTFALBTIRAS',pic:''},{av:'AV55TFAlbTiras_Sel',fld:'vTFALBTIRAS_SEL',pic:''},{av:'AV56TFAlbTirasKg',fld:'vTFALBTIRASKG',pic:'ZZZZZ9.99'},{av:'AV57TFAlbTirasKg_To',fld:'vTFALBTIRASKG_TO',pic:'ZZZZZ9.99'},{av:'AV58TFAlbSinTest',fld:'vTFALBSINTEST',pic:''},{av:'AV59TFAlbSinTest_Sel',fld:'vTFALBSINTEST_SEL',pic:''},{av:'AV60TFTubCod',fld:'vTFTUBCOD',pic:'ZZZ9'},{av:'AV61TFTubCod_To',fld:'vTFTUBCOD_TO',pic:'ZZZ9'},{av:'AV62TFBarAlbTub',fld:'vTFBARALBTUB',pic:'ZZZ9'},{av:'AV63TFBarAlbTub_To',fld:'vTFBARALBTUB_TO',pic:'ZZZ9'},{av:'AV64TFAlbHdrObs',fld:'vTFALBHDROBS',pic:''},{av:'AV65TFAlbHdrObs_Sel',fld:'vTFALBHDROBS_SEL',pic:''},{av:'AV66TFPlasCod',fld:'vTFPLASCOD',pic:'ZZZ9'},{av:'AV67TFPlasCod_To',fld:'vTFPLASCOD_TO',pic:'ZZZ9'},{av:'AV68TFBarAlbPlas',fld:'vTFBARALBPLAS',pic:'ZZZ9'},{av:'AV69TFBarAlbPlas_To',fld:'vTFBARALBPLAS_TO',pic:'ZZZ9'},{av:'AV70TFTipAcaCod',fld:'vTFTIPACACOD',pic:'ZZZ9'},{av:'AV71TFTipAcaCod_To',fld:'vTFTIPACACOD_TO',pic:'ZZZ9'},{av:'AV73TFAlbProVal_Sels',fld:'vTFALBPROVAL_SELS',pic:''},{av:'AV85AccionesEnPopup',fld:'vACCIONESENPOPUP',pic:''},{av:'AV84VisualizarAcciones',fld:'vVISUALIZARACCIONES',pic:''},{av:'AV95Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV89Artemalha',fld:'vARTEMALHA',pic:'9',hsh:true},{av:'AV90F_carvema',fld:'vF_CARVEMA',pic:'9',hsh:true},{av:'AV91Siplasticos',fld:'vSIPLASTICOS',pic:'9',hsh:true},{av:'AV92Endutex',fld:'vENDUTEX',pic:'9',hsh:true},{av:'sPrefix'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9',hsh:true},{av:'A130BarCodPar',fld:'BARCODPAR',pic:'',hsh:true}]");
      setEventMetadata("VDELETE.CLICK",",oparms:[{av:'AV23ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV18ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtBarCod_Visible',ctrl:'BARCOD',prop:'Visible'},{av:'edtBarCodReo_Visible',ctrl:'BARCODREO',prop:'Visible'},{av:'edtBarCodPar_Visible',ctrl:'BARCODPAR',prop:'Visible'},{av:'edtAlbSer_Visible',ctrl:'ALBSER',prop:'Visible'},{av:'edtAlbColorCv_Visible',ctrl:'ALBCOLORCV',prop:'Visible'},{av:'edtAlbNomCli_Visible',ctrl:'ALBNOMCLI',prop:'Visible'},{av:'edtAlbColNum_Visible',ctrl:'ALBCOLNUM',prop:'Visible'},{av:'edtCodCod_Visible',ctrl:'CODCOD',prop:'Visible'},{av:'edtBarAlbKgmE_Visible',ctrl:'BARALBKGME',prop:'Visible'},{av:'edtBarPreKgm_Visible',ctrl:'BARPREKGM',prop:'Visible'},{av:'edtAlbHdrAnc_Visible',ctrl:'ALBHDRANC',prop:'Visible'},{av:'edtAlbHdrgm2_Visible',ctrl:'ALBHDRGM2',prop:'Visible'},{av:'edtBarAlbMtrE_Visible',ctrl:'BARALBMTRE',prop:'Visible'},{av:'edtBarPreMtr_Visible',ctrl:'BARPREMTR',prop:'Visible'},{av:'edtBarAlbPie_Visible',ctrl:'BARALBPIE',prop:'Visible'},{av:'edtAlbTiras_Visible',ctrl:'ALBTIRAS',prop:'Visible'},{av:'edtAlbTirasKg_Visible',ctrl:'ALBTIRASKG',prop:'Visible'},{av:'edtAlbSinTest_Visible',ctrl:'ALBSINTEST',prop:'Visible'},{av:'edtTubCod_Visible',ctrl:'TUBCOD',prop:'Visible'},{av:'edtBarAlbTub_Visible',ctrl:'BARALBTUB',prop:'Visible'},{av:'edtAlbHdrObs_Visible',ctrl:'ALBHDROBS',prop:'Visible'},{av:'edtPlasCod_Visible',ctrl:'PLASCOD',prop:'Visible'},{av:'edtBarAlbPlas_Visible',ctrl:'BARALBPLAS',prop:'Visible'},{av:'edtTipAcaCod_Visible',ctrl:'TIPACACOD',prop:'Visible'},{av:'cmbAlbProVal'},{av:'AV80GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV81GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{ctrl:'BTN_CANCEL',prop:'Visible'},{ctrl:'BTNINSERT',prop:'Visible'},{av:'AV21ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV38TFCodCod',fld:'vTFCODCOD',pic:'XXXXXX'},{av:'AV39TFCodCod_Sel',fld:'vTFCODCOD_SEL',pic:'XXXXXX'},{av:'AV54TFAlbTiras',fld:'vTFALBTIRAS',pic:''},{av:'AV55TFAlbTiras_Sel',fld:'vTFALBTIRAS_SEL',pic:''},{av:'AV56TFAlbTirasKg',fld:'vTFALBTIRASKG',pic:'ZZZZZ9.99'},{av:'AV57TFAlbTirasKg_To',fld:'vTFALBTIRASKG_TO',pic:'ZZZZZ9.99'},{av:'AV58TFAlbSinTest',fld:'vTFALBSINTEST',pic:''},{av:'AV59TFAlbSinTest_Sel',fld:'vTFALBSINTEST_SEL',pic:''},{av:'AV66TFPlasCod',fld:'vTFPLASCOD',pic:'ZZZ9'},{av:'AV67TFPlasCod_To',fld:'vTFPLASCOD_TO',pic:'ZZZ9'},{av:'AV68TFBarAlbPlas',fld:'vTFBARALBPLAS',pic:'ZZZ9'},{av:'AV69TFBarAlbPlas_To',fld:'vTFBARALBPLAS_TO',pic:'ZZZ9'},{av:'AV70TFTipAcaCod',fld:'vTFTIPACACOD',pic:'ZZZ9'},{av:'AV71TFTipAcaCod_To',fld:'vTFTIPACACOD_TO',pic:'ZZZ9'}]}");
      setEventMetadata("'DOINSERT'","{handler:'e161XC2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'A30AlbProCod',fld:'ALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV23ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV18ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV24TFBarCod',fld:'vTFBARCOD',pic:'ZZZZZZZ9'},{av:'AV25TFBarCod_To',fld:'vTFBARCOD_TO',pic:'ZZZZZZZ9'},{av:'AV26TFBarCodReo',fld:'vTFBARCODREO',pic:'9'},{av:'AV27TFBarCodReo_To',fld:'vTFBARCODREO_TO',pic:'9'},{av:'AV28TFBarCodPar',fld:'vTFBARCODPAR',pic:''},{av:'AV29TFBarCodPar_Sel',fld:'vTFBARCODPAR_SEL',pic:''},{av:'AV30TFAlbSer',fld:'vTFALBSER',pic:''},{av:'AV31TFAlbSer_Sel',fld:'vTFALBSER_SEL',pic:''},{av:'AV32TFAlbColorCv',fld:'vTFALBCOLORCV',pic:''},{av:'AV33TFAlbColorCv_Sel',fld:'vTFALBCOLORCV_SEL',pic:''},{av:'AV34TFAlbNomCli',fld:'vTFALBNOMCLI',pic:''},{av:'AV35TFAlbNomCli_Sel',fld:'vTFALBNOMCLI_SEL',pic:''},{av:'AV36TFAlbColNum',fld:'vTFALBCOLNUM',pic:'ZZZZZ9'},{av:'AV37TFAlbColNum_To',fld:'vTFALBCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV38TFCodCod',fld:'vTFCODCOD',pic:'XXXXXX'},{av:'AV39TFCodCod_Sel',fld:'vTFCODCOD_SEL',pic:'XXXXXX'},{av:'AV40TFBarAlbKgmE',fld:'vTFBARALBKGME',pic:'ZZZZZ9.99'},{av:'AV41TFBarAlbKgmE_To',fld:'vTFBARALBKGME_TO',pic:'ZZZZZ9.99'},{av:'AV42TFBarPreKgm',fld:'vTFBARPREKGM',pic:'ZZZZZZ9.999'},{av:'AV43TFBarPreKgm_To',fld:'vTFBARPREKGM_TO',pic:'ZZZZZZ9.999'},{av:'AV44TFAlbHdrAnc',fld:'vTFALBHDRANC',pic:'ZZZ9'},{av:'AV45TFAlbHdrAnc_To',fld:'vTFALBHDRANC_TO',pic:'ZZZ9'},{av:'AV46TFAlbHdrgm2',fld:'vTFALBHDRGM2',pic:'ZZZ9'},{av:'AV47TFAlbHdrgm2_To',fld:'vTFALBHDRGM2_TO',pic:'ZZZ9'},{av:'AV48TFBarAlbMtrE',fld:'vTFBARALBMTRE',pic:'ZZZZZ9.99'},{av:'AV49TFBarAlbMtrE_To',fld:'vTFBARALBMTRE_TO',pic:'ZZZZZ9.99'},{av:'AV50TFBarPreMtr',fld:'vTFBARPREMTR',pic:'ZZZZZZ9.999'},{av:'AV51TFBarPreMtr_To',fld:'vTFBARPREMTR_TO',pic:'ZZZZZZ9.999'},{av:'AV52TFBarAlbPie',fld:'vTFBARALBPIE',pic:'ZZZZZ9'},{av:'AV53TFBarAlbPie_To',fld:'vTFBARALBPIE_TO',pic:'ZZZZZ9'},{av:'AV54TFAlbTiras',fld:'vTFALBTIRAS',pic:''},{av:'AV55TFAlbTiras_Sel',fld:'vTFALBTIRAS_SEL',pic:''},{av:'AV56TFAlbTirasKg',fld:'vTFALBTIRASKG',pic:'ZZZZZ9.99'},{av:'AV57TFAlbTirasKg_To',fld:'vTFALBTIRASKG_TO',pic:'ZZZZZ9.99'},{av:'AV58TFAlbSinTest',fld:'vTFALBSINTEST',pic:''},{av:'AV59TFAlbSinTest_Sel',fld:'vTFALBSINTEST_SEL',pic:''},{av:'AV60TFTubCod',fld:'vTFTUBCOD',pic:'ZZZ9'},{av:'AV61TFTubCod_To',fld:'vTFTUBCOD_TO',pic:'ZZZ9'},{av:'AV62TFBarAlbTub',fld:'vTFBARALBTUB',pic:'ZZZ9'},{av:'AV63TFBarAlbTub_To',fld:'vTFBARALBTUB_TO',pic:'ZZZ9'},{av:'AV64TFAlbHdrObs',fld:'vTFALBHDROBS',pic:''},{av:'AV65TFAlbHdrObs_Sel',fld:'vTFALBHDROBS_SEL',pic:''},{av:'AV66TFPlasCod',fld:'vTFPLASCOD',pic:'ZZZ9'},{av:'AV67TFPlasCod_To',fld:'vTFPLASCOD_TO',pic:'ZZZ9'},{av:'AV68TFBarAlbPlas',fld:'vTFBARALBPLAS',pic:'ZZZ9'},{av:'AV69TFBarAlbPlas_To',fld:'vTFBARALBPLAS_TO',pic:'ZZZ9'},{av:'AV70TFTipAcaCod',fld:'vTFTIPACACOD',pic:'ZZZ9'},{av:'AV71TFTipAcaCod_To',fld:'vTFTIPACACOD_TO',pic:'ZZZ9'},{av:'AV73TFAlbProVal_Sels',fld:'vTFALBPROVAL_SELS',pic:''},{av:'AV85AccionesEnPopup',fld:'vACCIONESENPOPUP',pic:''},{av:'AV84VisualizarAcciones',fld:'vVISUALIZARACCIONES',pic:''},{av:'AV95Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV89Artemalha',fld:'vARTEMALHA',pic:'9',hsh:true},{av:'AV90F_carvema',fld:'vF_CARVEMA',pic:'9',hsh:true},{av:'AV91Siplasticos',fld:'vSIPLASTICOS',pic:'9',hsh:true},{av:'AV92Endutex',fld:'vENDUTEX',pic:'9',hsh:true},{av:'sPrefix'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9',hsh:true},{av:'A130BarCodPar',fld:'BARCODPAR',pic:'',hsh:true}]");
      setEventMetadata("'DOINSERT'",",oparms:[{av:'AV23ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV18ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtBarCod_Visible',ctrl:'BARCOD',prop:'Visible'},{av:'edtBarCodReo_Visible',ctrl:'BARCODREO',prop:'Visible'},{av:'edtBarCodPar_Visible',ctrl:'BARCODPAR',prop:'Visible'},{av:'edtAlbSer_Visible',ctrl:'ALBSER',prop:'Visible'},{av:'edtAlbColorCv_Visible',ctrl:'ALBCOLORCV',prop:'Visible'},{av:'edtAlbNomCli_Visible',ctrl:'ALBNOMCLI',prop:'Visible'},{av:'edtAlbColNum_Visible',ctrl:'ALBCOLNUM',prop:'Visible'},{av:'edtCodCod_Visible',ctrl:'CODCOD',prop:'Visible'},{av:'edtBarAlbKgmE_Visible',ctrl:'BARALBKGME',prop:'Visible'},{av:'edtBarPreKgm_Visible',ctrl:'BARPREKGM',prop:'Visible'},{av:'edtAlbHdrAnc_Visible',ctrl:'ALBHDRANC',prop:'Visible'},{av:'edtAlbHdrgm2_Visible',ctrl:'ALBHDRGM2',prop:'Visible'},{av:'edtBarAlbMtrE_Visible',ctrl:'BARALBMTRE',prop:'Visible'},{av:'edtBarPreMtr_Visible',ctrl:'BARPREMTR',prop:'Visible'},{av:'edtBarAlbPie_Visible',ctrl:'BARALBPIE',prop:'Visible'},{av:'edtAlbTiras_Visible',ctrl:'ALBTIRAS',prop:'Visible'},{av:'edtAlbTirasKg_Visible',ctrl:'ALBTIRASKG',prop:'Visible'},{av:'edtAlbSinTest_Visible',ctrl:'ALBSINTEST',prop:'Visible'},{av:'edtTubCod_Visible',ctrl:'TUBCOD',prop:'Visible'},{av:'edtBarAlbTub_Visible',ctrl:'BARALBTUB',prop:'Visible'},{av:'edtAlbHdrObs_Visible',ctrl:'ALBHDROBS',prop:'Visible'},{av:'edtPlasCod_Visible',ctrl:'PLASCOD',prop:'Visible'},{av:'edtBarAlbPlas_Visible',ctrl:'BARALBPLAS',prop:'Visible'},{av:'edtTipAcaCod_Visible',ctrl:'TIPACACOD',prop:'Visible'},{av:'cmbAlbProVal'},{av:'AV80GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV81GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{ctrl:'BTN_CANCEL',prop:'Visible'},{ctrl:'BTNINSERT',prop:'Visible'},{av:'AV21ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV38TFCodCod',fld:'vTFCODCOD',pic:'XXXXXX'},{av:'AV39TFCodCod_Sel',fld:'vTFCODCOD_SEL',pic:'XXXXXX'},{av:'AV54TFAlbTiras',fld:'vTFALBTIRAS',pic:''},{av:'AV55TFAlbTiras_Sel',fld:'vTFALBTIRAS_SEL',pic:''},{av:'AV56TFAlbTirasKg',fld:'vTFALBTIRASKG',pic:'ZZZZZ9.99'},{av:'AV57TFAlbTirasKg_To',fld:'vTFALBTIRASKG_TO',pic:'ZZZZZ9.99'},{av:'AV58TFAlbSinTest',fld:'vTFALBSINTEST',pic:''},{av:'AV59TFAlbSinTest_Sel',fld:'vTFALBSINTEST_SEL',pic:''},{av:'AV66TFPlasCod',fld:'vTFPLASCOD',pic:'ZZZ9'},{av:'AV67TFPlasCod_To',fld:'vTFPLASCOD_TO',pic:'ZZZ9'},{av:'AV68TFBarAlbPlas',fld:'vTFBARALBPLAS',pic:'ZZZ9'},{av:'AV69TFBarAlbPlas_To',fld:'vTFBARALBPLAS_TO',pic:'ZZZ9'},{av:'AV70TFTipAcaCod',fld:'vTFTIPACACOD',pic:'ZZZ9'},{av:'AV71TFTipAcaCod_To',fld:'vTFTIPACACOD_TO',pic:'ZZZ9'}]}");
      setEventMetadata("VDETAILWEBCOMPONENT.CLICK","{handler:'e221XC2',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A30AlbProCod',fld:'ALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9',hsh:true},{av:'A130BarCodPar',fld:'BARCODPAR',pic:'',hsh:true},{av:'AV84VisualizarAcciones',fld:'vVISUALIZARACCIONES',pic:''},{av:'AV85AccionesEnPopup',fld:'vACCIONESENPOPUP',pic:''}]");
      setEventMetadata("VDETAILWEBCOMPONENT.CLICK",",oparms:[{ctrl:'GRID_DWC'}]}");
      setEventMetadata("VALID_ALBPROCOD","{handler:'valid_Albprocod',iparms:[]");
      setEventMetadata("VALID_ALBPROCOD",",oparms:[]}");
      setEventMetadata("VALID_GUIREMCLI","{handler:'valid_Guiremcli',iparms:[]");
      setEventMetadata("VALID_GUIREMCLI",",oparms:[]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_BARCOD","{handler:'valid_Barcod',iparms:[]");
      setEventMetadata("VALID_BARCOD",",oparms:[]}");
      setEventMetadata("VALID_BARCODREO","{handler:'valid_Barcodreo',iparms:[]");
      setEventMetadata("VALID_BARCODREO",",oparms:[]}");
      setEventMetadata("VALID_BARCODPAR","{handler:'valid_Barcodpar',iparms:[]");
      setEventMetadata("VALID_BARCODPAR",",oparms:[]}");
      setEventMetadata("VALID_ALBSER","{handler:'valid_Albser',iparms:[]");
      setEventMetadata("VALID_ALBSER",",oparms:[]}");
      setEventMetadata("VALID_ALBCOLORCV","{handler:'valid_Albcolorcv',iparms:[]");
      setEventMetadata("VALID_ALBCOLORCV",",oparms:[]}");
      setEventMetadata("VALID_ALBNOMCLI","{handler:'valid_Albnomcli',iparms:[]");
      setEventMetadata("VALID_ALBNOMCLI",",oparms:[]}");
      setEventMetadata("VALID_ALBCOLNUM","{handler:'valid_Albcolnum',iparms:[]");
      setEventMetadata("VALID_ALBCOLNUM",",oparms:[]}");
      setEventMetadata("VALID_CODCOD","{handler:'valid_Codcod',iparms:[]");
      setEventMetadata("VALID_CODCOD",",oparms:[]}");
      setEventMetadata("VALID_BARALBKGME","{handler:'valid_Baralbkgme',iparms:[]");
      setEventMetadata("VALID_BARALBKGME",",oparms:[]}");
      setEventMetadata("VALID_BARPREKGM","{handler:'valid_Barprekgm',iparms:[]");
      setEventMetadata("VALID_BARPREKGM",",oparms:[]}");
      setEventMetadata("VALID_ALBHDRANC","{handler:'valid_Albhdranc',iparms:[]");
      setEventMetadata("VALID_ALBHDRANC",",oparms:[]}");
      setEventMetadata("VALID_ALBHDRGM2","{handler:'valid_Albhdrgm2',iparms:[]");
      setEventMetadata("VALID_ALBHDRGM2",",oparms:[]}");
      setEventMetadata("VALID_BARALBMTRE","{handler:'valid_Baralbmtre',iparms:[]");
      setEventMetadata("VALID_BARALBMTRE",",oparms:[]}");
      setEventMetadata("VALID_BARPREMTR","{handler:'valid_Barpremtr',iparms:[]");
      setEventMetadata("VALID_BARPREMTR",",oparms:[]}");
      setEventMetadata("VALID_BARALBPIE","{handler:'valid_Baralbpie',iparms:[]");
      setEventMetadata("VALID_BARALBPIE",",oparms:[]}");
      setEventMetadata("VALID_ALBTIRAS","{handler:'valid_Albtiras',iparms:[]");
      setEventMetadata("VALID_ALBTIRAS",",oparms:[]}");
      setEventMetadata("VALID_ALBTIRASKG","{handler:'valid_Albtiraskg',iparms:[]");
      setEventMetadata("VALID_ALBTIRASKG",",oparms:[]}");
      setEventMetadata("VALID_ALBSINTEST","{handler:'valid_Albsintest',iparms:[]");
      setEventMetadata("VALID_ALBSINTEST",",oparms:[]}");
      setEventMetadata("VALID_TUBCOD","{handler:'valid_Tubcod',iparms:[]");
      setEventMetadata("VALID_TUBCOD",",oparms:[]}");
      setEventMetadata("VALID_BARALBTUB","{handler:'valid_Baralbtub',iparms:[]");
      setEventMetadata("VALID_BARALBTUB",",oparms:[]}");
      setEventMetadata("VALID_ALBHDROBS","{handler:'valid_Albhdrobs',iparms:[]");
      setEventMetadata("VALID_ALBHDROBS",",oparms:[]}");
      setEventMetadata("VALID_PLASCOD","{handler:'valid_Plascod',iparms:[]");
      setEventMetadata("VALID_PLASCOD",",oparms:[]}");
      setEventMetadata("VALID_BARALBPLAS","{handler:'valid_Baralbplas',iparms:[]");
      setEventMetadata("VALID_BARALBPLAS",",oparms:[]}");
      setEventMetadata("VALID_TIPACACOD","{handler:'valid_Tipacacod',iparms:[]");
      setEventMetadata("VALID_TIPACACOD",",oparms:[]}");
      setEventMetadata("VALID_ALBPROVAL","{handler:'valid_Albproval',iparms:[]");
      setEventMetadata("VALID_ALBPROVAL",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Albsec',iparms:[]");
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
      wcpOA396EmprCod = "" ;
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
      A396EmprCod = "" ;
      AV18ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV15FilterFullText = "" ;
      AV28TFBarCodPar = "" ;
      AV29TFBarCodPar_Sel = "" ;
      AV30TFAlbSer = "" ;
      AV31TFAlbSer_Sel = "" ;
      AV32TFAlbColorCv = "" ;
      AV33TFAlbColorCv_Sel = "" ;
      AV34TFAlbNomCli = "" ;
      AV35TFAlbNomCli_Sel = "" ;
      AV38TFCodCod = "" ;
      AV39TFCodCod_Sel = "" ;
      AV40TFBarAlbKgmE = DecimalUtil.ZERO ;
      AV41TFBarAlbKgmE_To = DecimalUtil.ZERO ;
      AV42TFBarPreKgm = DecimalUtil.ZERO ;
      AV43TFBarPreKgm_To = DecimalUtil.ZERO ;
      AV48TFBarAlbMtrE = DecimalUtil.ZERO ;
      AV49TFBarAlbMtrE_To = DecimalUtil.ZERO ;
      AV50TFBarPreMtr = DecimalUtil.ZERO ;
      AV51TFBarPreMtr_To = DecimalUtil.ZERO ;
      AV54TFAlbTiras = "" ;
      AV55TFAlbTiras_Sel = "" ;
      AV56TFAlbTirasKg = DecimalUtil.ZERO ;
      AV57TFAlbTirasKg_To = DecimalUtil.ZERO ;
      AV58TFAlbSinTest = "" ;
      AV59TFAlbSinTest_Sel = "" ;
      AV64TFAlbHdrObs = "" ;
      AV65TFAlbHdrObs_Sel = "" ;
      AV73TFAlbProVal_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV95Pgmname = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      AV21ManageFiltersData = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      AV78DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      AV10GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV72TFAlbProVal_SelsJson = "" ;
      Ddo_grid_Caption = "" ;
      Ddo_grid_Filteredtext_set = "" ;
      Ddo_grid_Filteredtextto_set = "" ;
      Ddo_grid_Selectedvalue_set = "" ;
      Ddo_grid_Sortedstatus = "" ;
      Ddo_gridcolumnsselector_Gridinternalname = "" ;
      Grid_empowerer_Gridinternalname = "" ;
      GX_FocusControl = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_tablealbaran = new com.genexus.webpanels.GXUserControl();
      lblTbngruia_Jsonclick = "" ;
      A1244GuiRemCln = "" ;
      A34AlbProfch = GXutil.nullDate() ;
      TempTags = "" ;
      bttBtninsert_Jsonclick = "" ;
      bttBtneditcolumns_Jsonclick = "" ;
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucGridpaginationbar = new com.genexus.webpanels.GXUserControl();
      WebComp_Grid_dwc_Component = "" ;
      OldGrid_dwc = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      ucDdo_grid = new com.genexus.webpanels.GXUserControl();
      ucDdo_gridcolumnsselector = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      sXEvt = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV83DetailWebComponent = "" ;
      AV86Update = "" ;
      AV87Delete = "" ;
      A130BarCodPar = "" ;
      A3391AlbSer = "" ;
      A14056AlbColorCv = "" ;
      A12232AlbNomCli = "" ;
      A3153CodCod = "" ;
      A1261BarAlbKgmE = DecimalUtil.ZERO ;
      A1262BarPreKgm = DecimalUtil.ZERO ;
      A1263BarAlbMtrE = DecimalUtil.ZERO ;
      A1264BarPreMtr = DecimalUtil.ZERO ;
      A14057AlbTiras = "" ;
      A14058AlbTirasKg = DecimalUtil.ZERO ;
      A14059AlbSinTest = "" ;
      A2441AlbHdrObs = "" ;
      A2839AlbProVal = "" ;
      A7101AlbLic = "" ;
      A2242AlbSec = "" ;
      AV100Albaranes_albaranguia__wwds_1_filterfulltext = "" ;
      AV105Albaranes_albaranguia__wwds_6_tfbarcodpar = "" ;
      AV106Albaranes_albaranguia__wwds_7_tfbarcodpar_sel = "" ;
      AV107Albaranes_albaranguia__wwds_8_tfalbser = "" ;
      AV108Albaranes_albaranguia__wwds_9_tfalbser_sel = "" ;
      AV109Albaranes_albaranguia__wwds_10_tfalbcolorcv = "" ;
      AV110Albaranes_albaranguia__wwds_11_tfalbcolorcv_sel = "" ;
      AV111Albaranes_albaranguia__wwds_12_tfalbnomcli = "" ;
      AV112Albaranes_albaranguia__wwds_13_tfalbnomcli_sel = "" ;
      AV115Albaranes_albaranguia__wwds_16_tfcodcod = "" ;
      AV116Albaranes_albaranguia__wwds_17_tfcodcod_sel = "" ;
      AV117Albaranes_albaranguia__wwds_18_tfbaralbkgme = DecimalUtil.ZERO ;
      AV118Albaranes_albaranguia__wwds_19_tfbaralbkgme_to = DecimalUtil.ZERO ;
      AV119Albaranes_albaranguia__wwds_20_tfbarprekgm = DecimalUtil.ZERO ;
      AV120Albaranes_albaranguia__wwds_21_tfbarprekgm_to = DecimalUtil.ZERO ;
      AV125Albaranes_albaranguia__wwds_26_tfbaralbmtre = DecimalUtil.ZERO ;
      AV126Albaranes_albaranguia__wwds_27_tfbaralbmtre_to = DecimalUtil.ZERO ;
      AV127Albaranes_albaranguia__wwds_28_tfbarpremtr = DecimalUtil.ZERO ;
      AV128Albaranes_albaranguia__wwds_29_tfbarpremtr_to = DecimalUtil.ZERO ;
      AV131Albaranes_albaranguia__wwds_32_tfalbtiras = "" ;
      AV132Albaranes_albaranguia__wwds_33_tfalbtiras_sel = "" ;
      AV133Albaranes_albaranguia__wwds_34_tfalbtiraskg = DecimalUtil.ZERO ;
      AV134Albaranes_albaranguia__wwds_35_tfalbtiraskg_to = DecimalUtil.ZERO ;
      AV135Albaranes_albaranguia__wwds_36_tfalbsintest = "" ;
      AV136Albaranes_albaranguia__wwds_37_tfalbsintest_sel = "" ;
      AV141Albaranes_albaranguia__wwds_42_tfalbhdrobs = "" ;
      AV142Albaranes_albaranguia__wwds_43_tfalbhdrobs_sel = "" ;
      AV149Albaranes_albaranguia__wwds_50_tfalbproval_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      scmdbuf = "" ;
      lV105Albaranes_albaranguia__wwds_6_tfbarcodpar = "" ;
      lV107Albaranes_albaranguia__wwds_8_tfalbser = "" ;
      lV111Albaranes_albaranguia__wwds_12_tfalbnomcli = "" ;
      lV115Albaranes_albaranguia__wwds_16_tfcodcod = "" ;
      lV131Albaranes_albaranguia__wwds_32_tfalbtiras = "" ;
      lV135Albaranes_albaranguia__wwds_36_tfalbsintest = "" ;
      lV141Albaranes_albaranguia__wwds_42_tfalbhdrobs = "" ;
      H01XC2_A1253EmprGuiRem = new String[] {""} ;
      H01XC2_A30AlbProCod = new long[1] ;
      H01XC2_A5805AlbEnvFtp = new byte[1] ;
      H01XC2_A1243GuiRemCli = new int[1] ;
      H01XC2_A1244GuiRemCln = new String[] {""} ;
      H01XC2_A34AlbProfch = new java.util.Date[] {GXutil.nullDate()} ;
      H01XC2_A2242AlbSec = new String[] {""} ;
      H01XC2_A7101AlbLic = new String[] {""} ;
      H01XC2_A2839AlbProVal = new String[] {""} ;
      H01XC2_A5051TipAcaCod = new short[1] ;
      H01XC2_A6467BarAlbPlas = new short[1] ;
      H01XC2_A6466PlasCod = new short[1] ;
      H01XC2_n6466PlasCod = new boolean[] {false} ;
      H01XC2_A2441AlbHdrObs = new String[] {""} ;
      H01XC2_A1266BarAlbTub = new int[1] ;
      H01XC2_A1206TubCod = new short[1] ;
      H01XC2_n1206TubCod = new boolean[] {false} ;
      H01XC2_A14059AlbSinTest = new String[] {""} ;
      H01XC2_A14058AlbTirasKg = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01XC2_A14057AlbTiras = new String[] {""} ;
      H01XC2_A1265BarAlbPie = new int[1] ;
      H01XC2_A1264BarPreMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01XC2_A1263BarAlbMtrE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01XC2_A5019AlbHdrgm2 = new short[1] ;
      H01XC2_A3271AlbHdrAnc = new short[1] ;
      H01XC2_A1262BarPreKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01XC2_A1261BarAlbKgmE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01XC2_A3153CodCod = new String[] {""} ;
      H01XC2_n3153CodCod = new boolean[] {false} ;
      H01XC2_A3393AlbColNum = new int[1] ;
      H01XC2_A12232AlbNomCli = new String[] {""} ;
      H01XC2_A12234AlbTipArt = new short[1] ;
      H01XC2_A3391AlbSer = new String[] {""} ;
      H01XC2_A396EmprCod = new String[] {""} ;
      H01XC2_A130BarCodPar = new String[] {""} ;
      H01XC2_A132BarCodReo = new byte[1] ;
      H01XC2_A129BarCod = new int[1] ;
      H01XC3_A1253EmprGuiRem = new String[] {""} ;
      H01XC3_A30AlbProCod = new long[1] ;
      H01XC3_A5805AlbEnvFtp = new byte[1] ;
      H01XC3_A1243GuiRemCli = new int[1] ;
      H01XC3_A1244GuiRemCln = new String[] {""} ;
      H01XC3_A34AlbProfch = new java.util.Date[] {GXutil.nullDate()} ;
      H01XC3_A2242AlbSec = new String[] {""} ;
      H01XC3_A7101AlbLic = new String[] {""} ;
      H01XC3_A2839AlbProVal = new String[] {""} ;
      H01XC3_A5051TipAcaCod = new short[1] ;
      H01XC3_A6467BarAlbPlas = new short[1] ;
      H01XC3_A6466PlasCod = new short[1] ;
      H01XC3_n6466PlasCod = new boolean[] {false} ;
      H01XC3_A2441AlbHdrObs = new String[] {""} ;
      H01XC3_A1266BarAlbTub = new int[1] ;
      H01XC3_A1206TubCod = new short[1] ;
      H01XC3_n1206TubCod = new boolean[] {false} ;
      H01XC3_A14059AlbSinTest = new String[] {""} ;
      H01XC3_A14058AlbTirasKg = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01XC3_A14057AlbTiras = new String[] {""} ;
      H01XC3_A1265BarAlbPie = new int[1] ;
      H01XC3_A1264BarPreMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01XC3_A1263BarAlbMtrE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01XC3_A5019AlbHdrgm2 = new short[1] ;
      H01XC3_A3271AlbHdrAnc = new short[1] ;
      H01XC3_A1262BarPreKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01XC3_A1261BarAlbKgmE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01XC3_A3153CodCod = new String[] {""} ;
      H01XC3_n3153CodCod = new boolean[] {false} ;
      H01XC3_A3393AlbColNum = new int[1] ;
      H01XC3_A12232AlbNomCli = new String[] {""} ;
      H01XC3_A12234AlbTipArt = new short[1] ;
      H01XC3_A3391AlbSer = new String[] {""} ;
      H01XC3_A396EmprCod = new String[] {""} ;
      H01XC3_A130BarCodPar = new String[] {""} ;
      H01XC3_A132BarCodReo = new byte[1] ;
      H01XC3_A129BarCod = new int[1] ;
      GXv_int3 = new int[1] ;
      GXv_int4 = new byte[1] ;
      H01XC4_A1253EmprGuiRem = new String[] {""} ;
      H01XC4_A5805AlbEnvFtp = new byte[1] ;
      H01XC4_A1243GuiRemCli = new int[1] ;
      H01XC4_A34AlbProfch = new java.util.Date[] {GXutil.nullDate()} ;
      H01XC4_A2242AlbSec = new String[] {""} ;
      H01XC4_A7101AlbLic = new String[] {""} ;
      A1253EmprGuiRem = "" ;
      H01XC5_A1244GuiRemCln = new String[] {""} ;
      hsh = "" ;
      AV96Station = "" ;
      AV97Emprcod = "" ;
      AV98Emprnom = "" ;
      AV99Usurcod = "" ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV6WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext9 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV20Session = httpContext.getWebSession();
      AV16ColumnsSelectorXML = "" ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV22ManageFiltersXml = "" ;
      AV17UserCustomValue = "" ;
      AV19ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector10 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector11 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item12 = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item13 = new GXBaseCollection[1] ;
      AV11GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
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
      GXv_char6 = new String[1] ;
      GXt_char14 = "" ;
      GXv_char5 = new String[1] ;
      GXv_SdtWWPGridState28 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      AV8TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV7HTTPRequest = httpContext.getHttpRequest();
      ucDdo_managefilters = new com.genexus.webpanels.GXUserControl();
      Ddo_managefilters_Caption = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlA396EmprCod = "" ;
      sCtrlA30AlbProCod = "" ;
      sCtrlAV84VisualizarAcciones = "" ;
      sCtrlAV85AccionesEnPopup = "" ;
      subGrid_Linesclass = "" ;
      ROClassString = "" ;
      GXCCtl = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.albaranes.albaranguia__ww__default(),
         new Object[] {
             new Object[] {
            H01XC2_A1253EmprGuiRem, H01XC2_A30AlbProCod, H01XC2_A5805AlbEnvFtp, H01XC2_A1243GuiRemCli, H01XC2_A1244GuiRemCln, H01XC2_A34AlbProfch, H01XC2_A2242AlbSec, H01XC2_A7101AlbLic, H01XC2_A2839AlbProVal, H01XC2_A5051TipAcaCod,
            H01XC2_A6467BarAlbPlas, H01XC2_A6466PlasCod, H01XC2_n6466PlasCod, H01XC2_A2441AlbHdrObs, H01XC2_A1266BarAlbTub, H01XC2_A1206TubCod, H01XC2_n1206TubCod, H01XC2_A14059AlbSinTest, H01XC2_A14058AlbTirasKg, H01XC2_A14057AlbTiras,
            H01XC2_A1265BarAlbPie, H01XC2_A1264BarPreMtr, H01XC2_A1263BarAlbMtrE, H01XC2_A5019AlbHdrgm2, H01XC2_A3271AlbHdrAnc, H01XC2_A1262BarPreKgm, H01XC2_A1261BarAlbKgmE, H01XC2_A3153CodCod, H01XC2_n3153CodCod, H01XC2_A3393AlbColNum,
            H01XC2_A12232AlbNomCli, H01XC2_A12234AlbTipArt, H01XC2_A3391AlbSer, H01XC2_A396EmprCod, H01XC2_A130BarCodPar, H01XC2_A132BarCodReo, H01XC2_A129BarCod
            }
            , new Object[] {
            H01XC3_A1253EmprGuiRem, H01XC3_A30AlbProCod, H01XC3_A5805AlbEnvFtp, H01XC3_A1243GuiRemCli, H01XC3_A1244GuiRemCln, H01XC3_A34AlbProfch, H01XC3_A2242AlbSec, H01XC3_A7101AlbLic, H01XC3_A2839AlbProVal, H01XC3_A5051TipAcaCod,
            H01XC3_A6467BarAlbPlas, H01XC3_A6466PlasCod, H01XC3_n6466PlasCod, H01XC3_A2441AlbHdrObs, H01XC3_A1266BarAlbTub, H01XC3_A1206TubCod, H01XC3_n1206TubCod, H01XC3_A14059AlbSinTest, H01XC3_A14058AlbTirasKg, H01XC3_A14057AlbTiras,
            H01XC3_A1265BarAlbPie, H01XC3_A1264BarPreMtr, H01XC3_A1263BarAlbMtrE, H01XC3_A5019AlbHdrgm2, H01XC3_A3271AlbHdrAnc, H01XC3_A1262BarPreKgm, H01XC3_A1261BarAlbKgmE, H01XC3_A3153CodCod, H01XC3_n3153CodCod, H01XC3_A3393AlbColNum,
            H01XC3_A12232AlbNomCli, H01XC3_A12234AlbTipArt, H01XC3_A3391AlbSer, H01XC3_A396EmprCod, H01XC3_A130BarCodPar, H01XC3_A132BarCodReo, H01XC3_A129BarCod
            }
            , new Object[] {
            H01XC4_A1253EmprGuiRem, H01XC4_A5805AlbEnvFtp, H01XC4_A1243GuiRemCli, H01XC4_A34AlbProfch, H01XC4_A2242AlbSec, H01XC4_A7101AlbLic
            }
            , new Object[] {
            H01XC5_A1244GuiRemCln
            }
         }
      );
      AV95Pgmname = "Albaranes.AlbaranGuia__WW" ;
      /* GeneXus formulas. */
      AV95Pgmname = "Albaranes.AlbaranGuia__WW" ;
      Gx_err = (short)(0) ;
      edtavDetailwebcomponent_Enabled = 0 ;
      edtavUpdate_Enabled = 0 ;
      edtavDelete_Enabled = 0 ;
      edtavPgmname_Enabled = 0 ;
      WebComp_Grid_dwc = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
   }

   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDynComponent ;
   private byte AV23ManageFiltersExecutionStep ;
   private byte AV26TFBarCodReo ;
   private byte AV27TFBarCodReo_To ;
   private byte AV89Artemalha ;
   private byte AV90F_carvema ;
   private byte AV91Siplasticos ;
   private byte AV92Endutex ;
   private byte A5805AlbEnvFtp ;
   private byte nDraw ;
   private byte nDoneStart ;
   private byte A132BarCodReo ;
   private byte nDonePA ;
   private byte AV103Albaranes_albaranguia__wwds_4_tfbarcodreo ;
   private byte AV104Albaranes_albaranguia__wwds_5_tfbarcodreo_to ;
   private byte subGrid_Backcolorstyle ;
   private byte subGrid_Sortable ;
   private byte GXv_int4[] ;
   private byte nGXWrapped ;
   private byte subGrid_Backstyle ;
   private byte subGrid_Titlebackstyle ;
   private byte subGrid_Allowselection ;
   private byte subGrid_Allowhovering ;
   private byte subGrid_Allowcollapsing ;
   private byte subGrid_Collapsed ;
   private short AV44TFAlbHdrAnc ;
   private short AV45TFAlbHdrAnc_To ;
   private short AV46TFAlbHdrgm2 ;
   private short AV47TFAlbHdrgm2_To ;
   private short AV60TFTubCod ;
   private short AV61TFTubCod_To ;
   private short AV66TFPlasCod ;
   private short AV67TFPlasCod_To ;
   private short AV68TFBarAlbPlas ;
   private short AV69TFBarAlbPlas_To ;
   private short AV70TFTipAcaCod ;
   private short AV71TFTipAcaCod_To ;
   private short AV12OrderedBy ;
   private short wbEnd ;
   private short wbStart ;
   private short A12234AlbTipArt ;
   private short A3271AlbHdrAnc ;
   private short A5019AlbHdrgm2 ;
   private short A1206TubCod ;
   private short A6466PlasCod ;
   private short A6467BarAlbPlas ;
   private short A5051TipAcaCod ;
   private short nCmpId ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV121Albaranes_albaranguia__wwds_22_tfalbhdranc ;
   private short AV122Albaranes_albaranguia__wwds_23_tfalbhdranc_to ;
   private short AV123Albaranes_albaranguia__wwds_24_tfalbhdrgm2 ;
   private short AV124Albaranes_albaranguia__wwds_25_tfalbhdrgm2_to ;
   private short AV137Albaranes_albaranguia__wwds_38_tftubcod ;
   private short AV138Albaranes_albaranguia__wwds_39_tftubcod_to ;
   private short AV143Albaranes_albaranguia__wwds_44_tfplascod ;
   private short AV144Albaranes_albaranguia__wwds_45_tfplascod_to ;
   private short AV145Albaranes_albaranguia__wwds_46_tfbaralbplas ;
   private short AV146Albaranes_albaranguia__wwds_47_tfbaralbplas_to ;
   private short AV147Albaranes_albaranguia__wwds_48_tftipacacod ;
   private short AV148Albaranes_albaranguia__wwds_49_tftipacacod_to ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_69 ;
   private int nGXsfl_69_idx=1 ;
   private int AV24TFBarCod ;
   private int AV25TFBarCod_To ;
   private int AV36TFAlbColNum ;
   private int AV37TFAlbColNum_To ;
   private int AV52TFBarAlbPie ;
   private int AV53TFBarAlbPie_To ;
   private int AV62TFBarAlbTub ;
   private int AV63TFBarAlbTub_To ;
   private int Gridpaginationbar_Pagestoshow ;
   private int edtAlbProCod_Enabled ;
   private int A1243GuiRemCli ;
   private int edtGuiRemCli_Enabled ;
   private int edtGuiRemCln_Enabled ;
   private int edtAlbProfch_Enabled ;
   private int bttBtninsert_Visible ;
   private int bttBtn_cancel_Visible ;
   private int edtavPgmname_Enabled ;
   private int edtEmprCod_Visible ;
   private int A129BarCod ;
   private int A3393AlbColNum ;
   private int A1265BarAlbPie ;
   private int A1266BarAlbTub ;
   private int subGrid_Islastpage ;
   private int edtavDetailwebcomponent_Enabled ;
   private int edtavUpdate_Enabled ;
   private int edtavDelete_Enabled ;
   private int AV101Albaranes_albaranguia__wwds_2_tfbarcod ;
   private int AV102Albaranes_albaranguia__wwds_3_tfbarcod_to ;
   private int AV113Albaranes_albaranguia__wwds_14_tfalbcolnum ;
   private int AV114Albaranes_albaranguia__wwds_15_tfalbcolnum_to ;
   private int AV129Albaranes_albaranguia__wwds_30_tfbaralbpie ;
   private int AV130Albaranes_albaranguia__wwds_31_tfbaralbpie_to ;
   private int AV139Albaranes_albaranguia__wwds_40_tfbaralbtub ;
   private int AV140Albaranes_albaranguia__wwds_41_tfbaralbtub_to ;
   private int AV149Albaranes_albaranguia__wwds_50_tfalbproval_sels_size ;
   private int GXv_int3[] ;
   private int edtBarCod_Visible ;
   private int edtBarCodReo_Visible ;
   private int edtBarCodPar_Visible ;
   private int edtAlbSer_Visible ;
   private int edtAlbColorCv_Visible ;
   private int edtAlbNomCli_Visible ;
   private int edtAlbColNum_Visible ;
   private int edtCodCod_Visible ;
   private int edtBarAlbKgmE_Visible ;
   private int edtBarPreKgm_Visible ;
   private int edtAlbHdrAnc_Visible ;
   private int edtAlbHdrgm2_Visible ;
   private int edtBarAlbMtrE_Visible ;
   private int edtBarPreMtr_Visible ;
   private int edtBarAlbPie_Visible ;
   private int edtAlbTiras_Visible ;
   private int edtAlbTirasKg_Visible ;
   private int edtAlbSinTest_Visible ;
   private int edtTubCod_Visible ;
   private int edtBarAlbTub_Visible ;
   private int edtAlbHdrObs_Visible ;
   private int edtPlasCod_Visible ;
   private int edtBarAlbPlas_Visible ;
   private int edtTipAcaCod_Visible ;
   private int AV79PageToGo ;
   private int AV150GXV1 ;
   private int edtavFilterfulltext_Enabled ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int edtavDetailwebcomponent_Visible ;
   private int edtavUpdate_Visible ;
   private int edtavDelete_Visible ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long wcpOA30AlbProCod ;
   private long GRID_nFirstRecordOnPage ;
   private long A30AlbProCod ;
   private long AV80GridCurrentPage ;
   private long AV81GridPageCount ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private java.math.BigDecimal AV40TFBarAlbKgmE ;
   private java.math.BigDecimal AV41TFBarAlbKgmE_To ;
   private java.math.BigDecimal AV42TFBarPreKgm ;
   private java.math.BigDecimal AV43TFBarPreKgm_To ;
   private java.math.BigDecimal AV48TFBarAlbMtrE ;
   private java.math.BigDecimal AV49TFBarAlbMtrE_To ;
   private java.math.BigDecimal AV50TFBarPreMtr ;
   private java.math.BigDecimal AV51TFBarPreMtr_To ;
   private java.math.BigDecimal AV56TFAlbTirasKg ;
   private java.math.BigDecimal AV57TFAlbTirasKg_To ;
   private java.math.BigDecimal A1261BarAlbKgmE ;
   private java.math.BigDecimal A1262BarPreKgm ;
   private java.math.BigDecimal A1263BarAlbMtrE ;
   private java.math.BigDecimal A1264BarPreMtr ;
   private java.math.BigDecimal A14058AlbTirasKg ;
   private java.math.BigDecimal AV117Albaranes_albaranguia__wwds_18_tfbaralbkgme ;
   private java.math.BigDecimal AV118Albaranes_albaranguia__wwds_19_tfbaralbkgme_to ;
   private java.math.BigDecimal AV119Albaranes_albaranguia__wwds_20_tfbarprekgm ;
   private java.math.BigDecimal AV120Albaranes_albaranguia__wwds_21_tfbarprekgm_to ;
   private java.math.BigDecimal AV125Albaranes_albaranguia__wwds_26_tfbaralbmtre ;
   private java.math.BigDecimal AV126Albaranes_albaranguia__wwds_27_tfbaralbmtre_to ;
   private java.math.BigDecimal AV127Albaranes_albaranguia__wwds_28_tfbarpremtr ;
   private java.math.BigDecimal AV128Albaranes_albaranguia__wwds_29_tfbarpremtr_to ;
   private java.math.BigDecimal AV133Albaranes_albaranguia__wwds_34_tfalbtiraskg ;
   private java.math.BigDecimal AV134Albaranes_albaranguia__wwds_35_tfalbtiraskg_to ;
   private String wcpOA396EmprCod ;
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
   private String A396EmprCod ;
   private String sGXsfl_69_idx="0001" ;
   private String AV28TFBarCodPar ;
   private String AV29TFBarCodPar_Sel ;
   private String AV30TFAlbSer ;
   private String AV31TFAlbSer_Sel ;
   private String AV32TFAlbColorCv ;
   private String AV33TFAlbColorCv_Sel ;
   private String AV34TFAlbNomCli ;
   private String AV35TFAlbNomCli_Sel ;
   private String AV38TFCodCod ;
   private String AV39TFCodCod_Sel ;
   private String AV54TFAlbTiras ;
   private String AV55TFAlbTiras_Sel ;
   private String AV58TFAlbSinTest ;
   private String AV59TFAlbSinTest_Sel ;
   private String AV64TFAlbHdrObs ;
   private String AV65TFAlbHdrObs_Sel ;
   private String AV95Pgmname ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String Dvpanel_tablealbaran_Width ;
   private String Dvpanel_tablealbaran_Cls ;
   private String Dvpanel_tablealbaran_Title ;
   private String Dvpanel_tablealbaran_Iconposition ;
   private String Ddo_managefilters_Icontype ;
   private String Ddo_managefilters_Icon ;
   private String Ddo_managefilters_Tooltip ;
   private String Ddo_managefilters_Cls ;
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
   private String divTablecontent_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String divDvpanel_tablealbaran_cell_Internalname ;
   private String divDvpanel_tablealbaran_cell_Class ;
   private String Dvpanel_tablealbaran_Internalname ;
   private String divTablealbaran_Internalname ;
   private String divUnnamedtable3_Internalname ;
   private String lblTbngruia_Internalname ;
   private String lblTbngruia_Jsonclick ;
   private String edtAlbProCod_Internalname ;
   private String edtAlbProCod_Jsonclick ;
   private String edtGuiRemCli_Internalname ;
   private String edtGuiRemCli_Jsonclick ;
   private String edtGuiRemCln_Internalname ;
   private String A1244GuiRemCln ;
   private String edtGuiRemCln_Jsonclick ;
   private String edtAlbProfch_Internalname ;
   private String edtAlbProfch_Jsonclick ;
   private String divTableheader_Internalname ;
   private String divTableactions_Internalname ;
   private String TempTags ;
   private String bttBtninsert_Internalname ;
   private String bttBtninsert_Jsonclick ;
   private String bttBtneditcolumns_Internalname ;
   private String bttBtneditcolumns_Jsonclick ;
   private String divUnnamedtable1_Internalname ;
   private String divGridtablewithpaginationbar_Internalname ;
   private String sStyleString ;
   private String subGrid_Internalname ;
   private String Gridpaginationbar_Internalname ;
   private String divCell_grid_dwc_Internalname ;
   private String divCell_grid_dwc_Class ;
   private String WebComp_Grid_dwc_Component ;
   private String OldGrid_dwc ;
   private String divUnnamedtable2_Internalname ;
   private String bttBtn_cancel_Internalname ;
   private String bttBtn_cancel_Jsonclick ;
   private String edtavPgmname_Internalname ;
   private String edtavPgmname_Jsonclick ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String Ddo_grid_Internalname ;
   private String Ddo_gridcolumnsselector_Internalname ;
   private String edtEmprCod_Internalname ;
   private String edtEmprCod_Jsonclick ;
   private String Grid_empowerer_Internalname ;
   private String sXEvt ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtavDetailwebcomponent_Internalname ;
   private String AV83DetailWebComponent ;
   private String AV86Update ;
   private String edtavUpdate_Internalname ;
   private String AV87Delete ;
   private String edtavDelete_Internalname ;
   private String edtBarCod_Internalname ;
   private String edtBarCodReo_Internalname ;
   private String A130BarCodPar ;
   private String edtBarCodPar_Internalname ;
   private String A3391AlbSer ;
   private String edtAlbSer_Internalname ;
   private String edtAlbTipArt_Internalname ;
   private String A14056AlbColorCv ;
   private String edtAlbColorCv_Internalname ;
   private String A12232AlbNomCli ;
   private String edtAlbNomCli_Internalname ;
   private String edtAlbColNum_Internalname ;
   private String A3153CodCod ;
   private String edtCodCod_Internalname ;
   private String edtBarAlbKgmE_Internalname ;
   private String edtBarPreKgm_Internalname ;
   private String edtAlbHdrAnc_Internalname ;
   private String edtAlbHdrgm2_Internalname ;
   private String edtBarAlbMtrE_Internalname ;
   private String edtBarPreMtr_Internalname ;
   private String edtBarAlbPie_Internalname ;
   private String A14057AlbTiras ;
   private String edtAlbTiras_Internalname ;
   private String edtAlbTirasKg_Internalname ;
   private String A14059AlbSinTest ;
   private String edtAlbSinTest_Internalname ;
   private String edtTubCod_Internalname ;
   private String edtBarAlbTub_Internalname ;
   private String A2441AlbHdrObs ;
   private String edtAlbHdrObs_Internalname ;
   private String edtPlasCod_Internalname ;
   private String edtBarAlbPlas_Internalname ;
   private String edtTipAcaCod_Internalname ;
   private String A2839AlbProVal ;
   private String A7101AlbLic ;
   private String edtAlbLic_Internalname ;
   private String A2242AlbSec ;
   private String edtAlbSec_Internalname ;
   private String edtavFilterfulltext_Internalname ;
   private String AV105Albaranes_albaranguia__wwds_6_tfbarcodpar ;
   private String AV106Albaranes_albaranguia__wwds_7_tfbarcodpar_sel ;
   private String AV107Albaranes_albaranguia__wwds_8_tfalbser ;
   private String AV108Albaranes_albaranguia__wwds_9_tfalbser_sel ;
   private String AV109Albaranes_albaranguia__wwds_10_tfalbcolorcv ;
   private String AV110Albaranes_albaranguia__wwds_11_tfalbcolorcv_sel ;
   private String AV111Albaranes_albaranguia__wwds_12_tfalbnomcli ;
   private String AV112Albaranes_albaranguia__wwds_13_tfalbnomcli_sel ;
   private String AV115Albaranes_albaranguia__wwds_16_tfcodcod ;
   private String AV116Albaranes_albaranguia__wwds_17_tfcodcod_sel ;
   private String AV131Albaranes_albaranguia__wwds_32_tfalbtiras ;
   private String AV132Albaranes_albaranguia__wwds_33_tfalbtiras_sel ;
   private String AV135Albaranes_albaranguia__wwds_36_tfalbsintest ;
   private String AV136Albaranes_albaranguia__wwds_37_tfalbsintest_sel ;
   private String AV141Albaranes_albaranguia__wwds_42_tfalbhdrobs ;
   private String AV142Albaranes_albaranguia__wwds_43_tfalbhdrobs_sel ;
   private String scmdbuf ;
   private String lV105Albaranes_albaranguia__wwds_6_tfbarcodpar ;
   private String lV107Albaranes_albaranguia__wwds_8_tfalbser ;
   private String lV111Albaranes_albaranguia__wwds_12_tfalbnomcli ;
   private String lV115Albaranes_albaranguia__wwds_16_tfcodcod ;
   private String lV131Albaranes_albaranguia__wwds_32_tfalbtiras ;
   private String lV135Albaranes_albaranguia__wwds_36_tfalbsintest ;
   private String lV141Albaranes_albaranguia__wwds_42_tfalbhdrobs ;
   private String A1253EmprGuiRem ;
   private String hsh ;
   private String AV96Station ;
   private String AV97Emprcod ;
   private String AV98Emprnom ;
   private String AV99Usurcod ;
   private String edtavUpdate_Class ;
   private String edtavDelete_Class ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
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
   private String GXv_char6[] ;
   private String GXt_char14 ;
   private String GXv_char5[] ;
   private String tblTablerightheader_Internalname ;
   private String Ddo_managefilters_Caption ;
   private String Ddo_managefilters_Internalname ;
   private String tblTablefilters_Internalname ;
   private String edtavFilterfulltext_Jsonclick ;
   private String sCtrlA396EmprCod ;
   private String sCtrlA30AlbProCod ;
   private String sCtrlAV84VisualizarAcciones ;
   private String sCtrlAV85AccionesEnPopup ;
   private String sGXsfl_69_fel_idx="0001" ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String ROClassString ;
   private String edtavDetailwebcomponent_Jsonclick ;
   private String edtavUpdate_Jsonclick ;
   private String edtavDelete_Jsonclick ;
   private String edtBarCod_Jsonclick ;
   private String edtBarCodReo_Jsonclick ;
   private String edtBarCodPar_Jsonclick ;
   private String edtAlbSer_Jsonclick ;
   private String edtAlbTipArt_Jsonclick ;
   private String edtAlbColorCv_Jsonclick ;
   private String edtAlbNomCli_Jsonclick ;
   private String edtAlbColNum_Jsonclick ;
   private String edtCodCod_Jsonclick ;
   private String edtBarAlbKgmE_Jsonclick ;
   private String edtBarPreKgm_Jsonclick ;
   private String edtAlbHdrAnc_Jsonclick ;
   private String edtAlbHdrgm2_Jsonclick ;
   private String edtBarAlbMtrE_Jsonclick ;
   private String edtBarPreMtr_Jsonclick ;
   private String edtBarAlbPie_Jsonclick ;
   private String edtAlbTiras_Jsonclick ;
   private String edtAlbTirasKg_Jsonclick ;
   private String edtAlbSinTest_Jsonclick ;
   private String edtTubCod_Jsonclick ;
   private String edtBarAlbTub_Jsonclick ;
   private String edtAlbHdrObs_Jsonclick ;
   private String edtPlasCod_Jsonclick ;
   private String edtBarAlbPlas_Jsonclick ;
   private String edtTipAcaCod_Jsonclick ;
   private String GXCCtl ;
   private String edtAlbLic_Jsonclick ;
   private String edtAlbSec_Jsonclick ;
   private String subGrid_Header ;
   private java.util.Date A34AlbProfch ;
   private boolean wcpOAV84VisualizarAcciones ;
   private boolean wcpOAV85AccionesEnPopup ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean AV84VisualizarAcciones ;
   private boolean AV85AccionesEnPopup ;
   private boolean AV13OrderedDsc ;
   private boolean Dvpanel_tablealbaran_Autowidth ;
   private boolean Dvpanel_tablealbaran_Autoheight ;
   private boolean Dvpanel_tablealbaran_Collapsible ;
   private boolean Dvpanel_tablealbaran_Collapsed ;
   private boolean Dvpanel_tablealbaran_Showcollapseicon ;
   private boolean Dvpanel_tablealbaran_Autoscroll ;
   private boolean Gridpaginationbar_Showfirst ;
   private boolean Gridpaginationbar_Showprevious ;
   private boolean Gridpaginationbar_Shownext ;
   private boolean Gridpaginationbar_Showlast ;
   private boolean Gridpaginationbar_Rowsperpageselector ;
   private boolean Grid_empowerer_Hastitlesettings ;
   private boolean Grid_empowerer_Hascolumnsselector ;
   private boolean wbLoad ;
   private boolean bGXsfl_69_Refreshing=false ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean n3153CodCod ;
   private boolean n1206TubCod ;
   private boolean n6466PlasCod ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private String AV72TFAlbProVal_SelsJson ;
   private String AV16ColumnsSelectorXML ;
   private String AV22ManageFiltersXml ;
   private String AV17UserCustomValue ;
   private String AV15FilterFullText ;
   private String AV100Albaranes_albaranguia__wwds_1_filterfulltext ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private GXWebComponent WebComp_Grid_dwc ;
   private com.genexus.internet.HttpRequest AV7HTTPRequest ;
   private com.genexus.webpanels.WebSession AV20Session ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tablealbaran ;
   private com.genexus.webpanels.GXUserControl ucGridpaginationbar ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucDdo_gridcolumnsselector ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.webpanels.GXUserControl ucDdo_managefilters ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private HTMLChoice cmbAlbEnvFtp ;
   private HTMLChoice cmbAlbProVal ;
   private IDataStoreProvider pr_default ;
   private String[] H01XC2_A1253EmprGuiRem ;
   private long[] H01XC2_A30AlbProCod ;
   private byte[] H01XC2_A5805AlbEnvFtp ;
   private int[] H01XC2_A1243GuiRemCli ;
   private String[] H01XC2_A1244GuiRemCln ;
   private java.util.Date[] H01XC2_A34AlbProfch ;
   private String[] H01XC2_A2242AlbSec ;
   private String[] H01XC2_A7101AlbLic ;
   private String[] H01XC2_A2839AlbProVal ;
   private short[] H01XC2_A5051TipAcaCod ;
   private short[] H01XC2_A6467BarAlbPlas ;
   private short[] H01XC2_A6466PlasCod ;
   private boolean[] H01XC2_n6466PlasCod ;
   private String[] H01XC2_A2441AlbHdrObs ;
   private int[] H01XC2_A1266BarAlbTub ;
   private short[] H01XC2_A1206TubCod ;
   private boolean[] H01XC2_n1206TubCod ;
   private String[] H01XC2_A14059AlbSinTest ;
   private java.math.BigDecimal[] H01XC2_A14058AlbTirasKg ;
   private String[] H01XC2_A14057AlbTiras ;
   private int[] H01XC2_A1265BarAlbPie ;
   private java.math.BigDecimal[] H01XC2_A1264BarPreMtr ;
   private java.math.BigDecimal[] H01XC2_A1263BarAlbMtrE ;
   private short[] H01XC2_A5019AlbHdrgm2 ;
   private short[] H01XC2_A3271AlbHdrAnc ;
   private java.math.BigDecimal[] H01XC2_A1262BarPreKgm ;
   private java.math.BigDecimal[] H01XC2_A1261BarAlbKgmE ;
   private String[] H01XC2_A3153CodCod ;
   private boolean[] H01XC2_n3153CodCod ;
   private int[] H01XC2_A3393AlbColNum ;
   private String[] H01XC2_A12232AlbNomCli ;
   private short[] H01XC2_A12234AlbTipArt ;
   private String[] H01XC2_A3391AlbSer ;
   private String[] H01XC2_A396EmprCod ;
   private String[] H01XC2_A130BarCodPar ;
   private byte[] H01XC2_A132BarCodReo ;
   private int[] H01XC2_A129BarCod ;
   private String[] H01XC3_A1253EmprGuiRem ;
   private long[] H01XC3_A30AlbProCod ;
   private byte[] H01XC3_A5805AlbEnvFtp ;
   private int[] H01XC3_A1243GuiRemCli ;
   private String[] H01XC3_A1244GuiRemCln ;
   private java.util.Date[] H01XC3_A34AlbProfch ;
   private String[] H01XC3_A2242AlbSec ;
   private String[] H01XC3_A7101AlbLic ;
   private String[] H01XC3_A2839AlbProVal ;
   private short[] H01XC3_A5051TipAcaCod ;
   private short[] H01XC3_A6467BarAlbPlas ;
   private short[] H01XC3_A6466PlasCod ;
   private boolean[] H01XC3_n6466PlasCod ;
   private String[] H01XC3_A2441AlbHdrObs ;
   private int[] H01XC3_A1266BarAlbTub ;
   private short[] H01XC3_A1206TubCod ;
   private boolean[] H01XC3_n1206TubCod ;
   private String[] H01XC3_A14059AlbSinTest ;
   private java.math.BigDecimal[] H01XC3_A14058AlbTirasKg ;
   private String[] H01XC3_A14057AlbTiras ;
   private int[] H01XC3_A1265BarAlbPie ;
   private java.math.BigDecimal[] H01XC3_A1264BarPreMtr ;
   private java.math.BigDecimal[] H01XC3_A1263BarAlbMtrE ;
   private short[] H01XC3_A5019AlbHdrgm2 ;
   private short[] H01XC3_A3271AlbHdrAnc ;
   private java.math.BigDecimal[] H01XC3_A1262BarPreKgm ;
   private java.math.BigDecimal[] H01XC3_A1261BarAlbKgmE ;
   private String[] H01XC3_A3153CodCod ;
   private boolean[] H01XC3_n3153CodCod ;
   private int[] H01XC3_A3393AlbColNum ;
   private String[] H01XC3_A12232AlbNomCli ;
   private short[] H01XC3_A12234AlbTipArt ;
   private String[] H01XC3_A3391AlbSer ;
   private String[] H01XC3_A396EmprCod ;
   private String[] H01XC3_A130BarCodPar ;
   private byte[] H01XC3_A132BarCodReo ;
   private int[] H01XC3_A129BarCod ;
   private String[] H01XC4_A1253EmprGuiRem ;
   private byte[] H01XC4_A5805AlbEnvFtp ;
   private int[] H01XC4_A1243GuiRemCli ;
   private java.util.Date[] H01XC4_A34AlbProfch ;
   private String[] H01XC4_A2242AlbSec ;
   private String[] H01XC4_A7101AlbLic ;
   private String[] H01XC5_A1244GuiRemCln ;
   private GXSimpleCollection<String> AV73TFAlbProVal_Sels ;
   private GXSimpleCollection<String> AV149Albaranes_albaranguia__wwds_50_tfalbproval_sels ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> AV21ManageFiltersData ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item12 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item13[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV18ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV19ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector10[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector11[] ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV78DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV10GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState28[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV11GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV8TrnContext ;
   private app.wwpbaseobjects.SdtWWPContext AV6WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext9[] ;
}

final  class albaranguia__ww__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H01XC2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A2839AlbProVal ,
                                          GXSimpleCollection<String> AV149Albaranes_albaranguia__wwds_50_tfalbproval_sels ,
                                          int AV101Albaranes_albaranguia__wwds_2_tfbarcod ,
                                          int AV102Albaranes_albaranguia__wwds_3_tfbarcod_to ,
                                          byte AV103Albaranes_albaranguia__wwds_4_tfbarcodreo ,
                                          byte AV104Albaranes_albaranguia__wwds_5_tfbarcodreo_to ,
                                          String AV106Albaranes_albaranguia__wwds_7_tfbarcodpar_sel ,
                                          String AV105Albaranes_albaranguia__wwds_6_tfbarcodpar ,
                                          String AV108Albaranes_albaranguia__wwds_9_tfalbser_sel ,
                                          String AV107Albaranes_albaranguia__wwds_8_tfalbser ,
                                          String AV112Albaranes_albaranguia__wwds_13_tfalbnomcli_sel ,
                                          String AV111Albaranes_albaranguia__wwds_12_tfalbnomcli ,
                                          int AV113Albaranes_albaranguia__wwds_14_tfalbcolnum ,
                                          int AV114Albaranes_albaranguia__wwds_15_tfalbcolnum_to ,
                                          String AV116Albaranes_albaranguia__wwds_17_tfcodcod_sel ,
                                          String AV115Albaranes_albaranguia__wwds_16_tfcodcod ,
                                          java.math.BigDecimal AV117Albaranes_albaranguia__wwds_18_tfbaralbkgme ,
                                          java.math.BigDecimal AV118Albaranes_albaranguia__wwds_19_tfbaralbkgme_to ,
                                          java.math.BigDecimal AV119Albaranes_albaranguia__wwds_20_tfbarprekgm ,
                                          java.math.BigDecimal AV120Albaranes_albaranguia__wwds_21_tfbarprekgm_to ,
                                          short AV121Albaranes_albaranguia__wwds_22_tfalbhdranc ,
                                          short AV122Albaranes_albaranguia__wwds_23_tfalbhdranc_to ,
                                          short AV123Albaranes_albaranguia__wwds_24_tfalbhdrgm2 ,
                                          short AV124Albaranes_albaranguia__wwds_25_tfalbhdrgm2_to ,
                                          java.math.BigDecimal AV125Albaranes_albaranguia__wwds_26_tfbaralbmtre ,
                                          java.math.BigDecimal AV126Albaranes_albaranguia__wwds_27_tfbaralbmtre_to ,
                                          java.math.BigDecimal AV127Albaranes_albaranguia__wwds_28_tfbarpremtr ,
                                          java.math.BigDecimal AV128Albaranes_albaranguia__wwds_29_tfbarpremtr_to ,
                                          int AV129Albaranes_albaranguia__wwds_30_tfbaralbpie ,
                                          int AV130Albaranes_albaranguia__wwds_31_tfbaralbpie_to ,
                                          String AV132Albaranes_albaranguia__wwds_33_tfalbtiras_sel ,
                                          String AV131Albaranes_albaranguia__wwds_32_tfalbtiras ,
                                          java.math.BigDecimal AV133Albaranes_albaranguia__wwds_34_tfalbtiraskg ,
                                          java.math.BigDecimal AV134Albaranes_albaranguia__wwds_35_tfalbtiraskg_to ,
                                          String AV136Albaranes_albaranguia__wwds_37_tfalbsintest_sel ,
                                          String AV135Albaranes_albaranguia__wwds_36_tfalbsintest ,
                                          short AV137Albaranes_albaranguia__wwds_38_tftubcod ,
                                          short AV138Albaranes_albaranguia__wwds_39_tftubcod_to ,
                                          int AV139Albaranes_albaranguia__wwds_40_tfbaralbtub ,
                                          int AV140Albaranes_albaranguia__wwds_41_tfbaralbtub_to ,
                                          String AV142Albaranes_albaranguia__wwds_43_tfalbhdrobs_sel ,
                                          String AV141Albaranes_albaranguia__wwds_42_tfalbhdrobs ,
                                          short AV143Albaranes_albaranguia__wwds_44_tfplascod ,
                                          short AV144Albaranes_albaranguia__wwds_45_tfplascod_to ,
                                          short AV145Albaranes_albaranguia__wwds_46_tfbaralbplas ,
                                          short AV146Albaranes_albaranguia__wwds_47_tfbaralbplas_to ,
                                          short AV147Albaranes_albaranguia__wwds_48_tftipacacod ,
                                          short AV148Albaranes_albaranguia__wwds_49_tftipacacod_to ,
                                          int AV149Albaranes_albaranguia__wwds_50_tfalbproval_sels_size ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          String A3391AlbSer ,
                                          String A12232AlbNomCli ,
                                          int A3393AlbColNum ,
                                          String A3153CodCod ,
                                          java.math.BigDecimal A1261BarAlbKgmE ,
                                          java.math.BigDecimal A1262BarPreKgm ,
                                          short A3271AlbHdrAnc ,
                                          short A5019AlbHdrgm2 ,
                                          java.math.BigDecimal A1263BarAlbMtrE ,
                                          java.math.BigDecimal A1264BarPreMtr ,
                                          int A1265BarAlbPie ,
                                          String A14057AlbTiras ,
                                          java.math.BigDecimal A14058AlbTirasKg ,
                                          String A14059AlbSinTest ,
                                          short A1206TubCod ,
                                          int A1266BarAlbTub ,
                                          String A2441AlbHdrObs ,
                                          short A6466PlasCod ,
                                          short A6467BarAlbPlas ,
                                          short A5051TipAcaCod ,
                                          short AV12OrderedBy ,
                                          boolean AV13OrderedDsc ,
                                          String AV100Albaranes_albaranguia__wwds_1_filterfulltext ,
                                          String A14056AlbColorCv ,
                                          String AV110Albaranes_albaranguia__wwds_11_tfalbcolorcv_sel ,
                                          String AV109Albaranes_albaranguia__wwds_10_tfalbcolorcv ,
                                          String A396EmprCod ,
                                          long A30AlbProCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int29 = new byte[48];
      Object[] GXv_Object30 = new Object[2];
      scmdbuf = "SELECT T2.EmprGuiRem AS EmprGuiRem, T1.AlbProCod, T2.AlbEnvFtp, T2.GuiRemCli AS GuiRemCli, T3.CliNom AS GuiRemCln, T2.AlbProfch, T2.AlbSec, T2.AlbLic, T1.AlbProVal," ;
      scmdbuf += " T1.TipAcaCod, T1.BarAlbPlas, T1.PlasCod, T1.AlbHdrObs, T1.BarAlbTub, T1.TubCod, T1.AlbSinTest, T1.AlbTirasKg, T1.AlbTiras, T1.BarAlbPie, T1.BarPreMtr, T1.BarAlbMtrE," ;
      scmdbuf += " T1.AlbHdrgm2, T1.AlbHdrAnc, T1.BarPreKgm, T1.BarAlbKgmE, T1.CodCod, T1.AlbColNum, T1.AlbNomCli, T1.AlbTipArt, T1.AlbSer, T1.EmprCod, T1.BarCodPar, T1.BarCodReo," ;
      scmdbuf += " T1.BarCod FROM ((TXPALBBAR T1 INNER JOIN TXPCALPRD T2 ON T2.EmprCod = T1.EmprCod AND T2.AlbProCod = T1.AlbProCod) INNER JOIN TXPCLIENT T3 ON T3.EmprCod = T2.EmprGuiRem" ;
      scmdbuf += " AND T3.CliCod = T2.GuiRemCli)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.AlbProCod = ?)");
      if ( ! (0==AV101Albaranes_albaranguia__wwds_2_tfbarcod) )
      {
         addWhere(sWhereString, "(T1.BarCod >= ?)");
      }
      else
      {
         GXv_int29[2] = (byte)(1) ;
      }
      if ( ! (0==AV102Albaranes_albaranguia__wwds_3_tfbarcod_to) )
      {
         addWhere(sWhereString, "(T1.BarCod <= ?)");
      }
      else
      {
         GXv_int29[3] = (byte)(1) ;
      }
      if ( ! (0==AV103Albaranes_albaranguia__wwds_4_tfbarcodreo) )
      {
         addWhere(sWhereString, "(T1.BarCodReo >= ?)");
      }
      else
      {
         GXv_int29[4] = (byte)(1) ;
      }
      if ( ! (0==AV104Albaranes_albaranguia__wwds_5_tfbarcodreo_to) )
      {
         addWhere(sWhereString, "(T1.BarCodReo <= ?)");
      }
      else
      {
         GXv_int29[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV106Albaranes_albaranguia__wwds_7_tfbarcodpar_sel)==0) && ( ! (GXutil.strcmp("", AV105Albaranes_albaranguia__wwds_6_tfbarcodpar)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int29[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV106Albaranes_albaranguia__wwds_7_tfbarcodpar_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int29[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV108Albaranes_albaranguia__wwds_9_tfalbser_sel)==0) && ( ! (GXutil.strcmp("", AV107Albaranes_albaranguia__wwds_8_tfalbser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int29[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV108Albaranes_albaranguia__wwds_9_tfalbser_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbSer = ?)");
      }
      else
      {
         GXv_int29[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV112Albaranes_albaranguia__wwds_13_tfalbnomcli_sel)==0) && ( ! (GXutil.strcmp("", AV111Albaranes_albaranguia__wwds_12_tfalbnomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int29[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV112Albaranes_albaranguia__wwds_13_tfalbnomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbNomCli = ?)");
      }
      else
      {
         GXv_int29[11] = (byte)(1) ;
      }
      if ( ! (0==AV113Albaranes_albaranguia__wwds_14_tfalbcolnum) )
      {
         addWhere(sWhereString, "(T1.AlbColNum >= ?)");
      }
      else
      {
         GXv_int29[12] = (byte)(1) ;
      }
      if ( ! (0==AV114Albaranes_albaranguia__wwds_15_tfalbcolnum_to) )
      {
         addWhere(sWhereString, "(T1.AlbColNum <= ?)");
      }
      else
      {
         GXv_int29[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV116Albaranes_albaranguia__wwds_17_tfcodcod_sel)==0) && ( ! (GXutil.strcmp("", AV115Albaranes_albaranguia__wwds_16_tfcodcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CodCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int29[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV116Albaranes_albaranguia__wwds_17_tfcodcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CodCod = ?)");
      }
      else
      {
         GXv_int29[15] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV117Albaranes_albaranguia__wwds_18_tfbaralbkgme)==0) )
      {
         addWhere(sWhereString, "(T1.BarAlbKgmE >= ?)");
      }
      else
      {
         GXv_int29[16] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV118Albaranes_albaranguia__wwds_19_tfbaralbkgme_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarAlbKgmE <= ?)");
      }
      else
      {
         GXv_int29[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV119Albaranes_albaranguia__wwds_20_tfbarprekgm)==0) )
      {
         addWhere(sWhereString, "(T1.BarPreKgm >= ?)");
      }
      else
      {
         GXv_int29[18] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV120Albaranes_albaranguia__wwds_21_tfbarprekgm_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarPreKgm <= ?)");
      }
      else
      {
         GXv_int29[19] = (byte)(1) ;
      }
      if ( ! (0==AV121Albaranes_albaranguia__wwds_22_tfalbhdranc) )
      {
         addWhere(sWhereString, "(T1.AlbHdrAnc >= ?)");
      }
      else
      {
         GXv_int29[20] = (byte)(1) ;
      }
      if ( ! (0==AV122Albaranes_albaranguia__wwds_23_tfalbhdranc_to) )
      {
         addWhere(sWhereString, "(T1.AlbHdrAnc <= ?)");
      }
      else
      {
         GXv_int29[21] = (byte)(1) ;
      }
      if ( ! (0==AV123Albaranes_albaranguia__wwds_24_tfalbhdrgm2) )
      {
         addWhere(sWhereString, "(T1.AlbHdrgm2 >= ?)");
      }
      else
      {
         GXv_int29[22] = (byte)(1) ;
      }
      if ( ! (0==AV124Albaranes_albaranguia__wwds_25_tfalbhdrgm2_to) )
      {
         addWhere(sWhereString, "(T1.AlbHdrgm2 <= ?)");
      }
      else
      {
         GXv_int29[23] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV125Albaranes_albaranguia__wwds_26_tfbaralbmtre)==0) )
      {
         addWhere(sWhereString, "(T1.BarAlbMtrE >= ?)");
      }
      else
      {
         GXv_int29[24] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV126Albaranes_albaranguia__wwds_27_tfbaralbmtre_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarAlbMtrE <= ?)");
      }
      else
      {
         GXv_int29[25] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV127Albaranes_albaranguia__wwds_28_tfbarpremtr)==0) )
      {
         addWhere(sWhereString, "(T1.BarPreMtr >= ?)");
      }
      else
      {
         GXv_int29[26] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV128Albaranes_albaranguia__wwds_29_tfbarpremtr_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarPreMtr <= ?)");
      }
      else
      {
         GXv_int29[27] = (byte)(1) ;
      }
      if ( ! (0==AV129Albaranes_albaranguia__wwds_30_tfbaralbpie) )
      {
         addWhere(sWhereString, "(T1.BarAlbPie >= ?)");
      }
      else
      {
         GXv_int29[28] = (byte)(1) ;
      }
      if ( ! (0==AV130Albaranes_albaranguia__wwds_31_tfbaralbpie_to) )
      {
         addWhere(sWhereString, "(T1.BarAlbPie <= ?)");
      }
      else
      {
         GXv_int29[29] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV132Albaranes_albaranguia__wwds_33_tfalbtiras_sel)==0) && ( ! (GXutil.strcmp("", AV131Albaranes_albaranguia__wwds_32_tfalbtiras)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbTiras) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int29[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV132Albaranes_albaranguia__wwds_33_tfalbtiras_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbTiras = ?)");
      }
      else
      {
         GXv_int29[31] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV133Albaranes_albaranguia__wwds_34_tfalbtiraskg)==0) )
      {
         addWhere(sWhereString, "(T1.AlbTirasKg >= ?)");
      }
      else
      {
         GXv_int29[32] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV134Albaranes_albaranguia__wwds_35_tfalbtiraskg_to)==0) )
      {
         addWhere(sWhereString, "(T1.AlbTirasKg <= ?)");
      }
      else
      {
         GXv_int29[33] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV136Albaranes_albaranguia__wwds_37_tfalbsintest_sel)==0) && ( ! (GXutil.strcmp("", AV135Albaranes_albaranguia__wwds_36_tfalbsintest)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbSinTest) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int29[34] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV136Albaranes_albaranguia__wwds_37_tfalbsintest_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbSinTest = ?)");
      }
      else
      {
         GXv_int29[35] = (byte)(1) ;
      }
      if ( ! (0==AV137Albaranes_albaranguia__wwds_38_tftubcod) )
      {
         addWhere(sWhereString, "(T1.TubCod >= ?)");
      }
      else
      {
         GXv_int29[36] = (byte)(1) ;
      }
      if ( ! (0==AV138Albaranes_albaranguia__wwds_39_tftubcod_to) )
      {
         addWhere(sWhereString, "(T1.TubCod <= ?)");
      }
      else
      {
         GXv_int29[37] = (byte)(1) ;
      }
      if ( ! (0==AV139Albaranes_albaranguia__wwds_40_tfbaralbtub) )
      {
         addWhere(sWhereString, "(T1.BarAlbTub >= ?)");
      }
      else
      {
         GXv_int29[38] = (byte)(1) ;
      }
      if ( ! (0==AV140Albaranes_albaranguia__wwds_41_tfbaralbtub_to) )
      {
         addWhere(sWhereString, "(T1.BarAlbTub <= ?)");
      }
      else
      {
         GXv_int29[39] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV142Albaranes_albaranguia__wwds_43_tfalbhdrobs_sel)==0) && ( ! (GXutil.strcmp("", AV141Albaranes_albaranguia__wwds_42_tfalbhdrobs)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbHdrObs) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int29[40] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV142Albaranes_albaranguia__wwds_43_tfalbhdrobs_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbHdrObs = ?)");
      }
      else
      {
         GXv_int29[41] = (byte)(1) ;
      }
      if ( ! (0==AV143Albaranes_albaranguia__wwds_44_tfplascod) )
      {
         addWhere(sWhereString, "(T1.PlasCod >= ?)");
      }
      else
      {
         GXv_int29[42] = (byte)(1) ;
      }
      if ( ! (0==AV144Albaranes_albaranguia__wwds_45_tfplascod_to) )
      {
         addWhere(sWhereString, "(T1.PlasCod <= ?)");
      }
      else
      {
         GXv_int29[43] = (byte)(1) ;
      }
      if ( ! (0==AV145Albaranes_albaranguia__wwds_46_tfbaralbplas) )
      {
         addWhere(sWhereString, "(T1.BarAlbPlas >= ?)");
      }
      else
      {
         GXv_int29[44] = (byte)(1) ;
      }
      if ( ! (0==AV146Albaranes_albaranguia__wwds_47_tfbaralbplas_to) )
      {
         addWhere(sWhereString, "(T1.BarAlbPlas <= ?)");
      }
      else
      {
         GXv_int29[45] = (byte)(1) ;
      }
      if ( ! (0==AV147Albaranes_albaranguia__wwds_48_tftipacacod) )
      {
         addWhere(sWhereString, "(T1.TipAcaCod >= ?)");
      }
      else
      {
         GXv_int29[46] = (byte)(1) ;
      }
      if ( ! (0==AV148Albaranes_albaranguia__wwds_49_tftipacacod_to) )
      {
         addWhere(sWhereString, "(T1.TipAcaCod <= ?)");
      }
      else
      {
         GXv_int29[47] = (byte)(1) ;
      }
      if ( AV149Albaranes_albaranguia__wwds_50_tfalbproval_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV149Albaranes_albaranguia__wwds_50_tfalbproval_sels, "T1.AlbProVal IN (", ")")+")");
      }
      scmdbuf += sWhereString ;
      if ( ( AV12OrderedBy == 1 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarCod" ;
      }
      else if ( ( AV12OrderedBy == 1 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarCod DESC" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarCodReo" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarCodReo DESC" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarCodPar" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarCodPar DESC" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbSer" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbSer DESC" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbNomCli" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbNomCli DESC" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbColNum" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbColNum DESC" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.CodCod" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.CodCod DESC" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarAlbKgmE" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarAlbKgmE DESC" ;
      }
      else if ( ( AV12OrderedBy == 9 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarPreKgm" ;
      }
      else if ( ( AV12OrderedBy == 9 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarPreKgm DESC" ;
      }
      else if ( ( AV12OrderedBy == 10 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbHdrAnc" ;
      }
      else if ( ( AV12OrderedBy == 10 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbHdrAnc DESC" ;
      }
      else if ( ( AV12OrderedBy == 11 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbHdrgm2" ;
      }
      else if ( ( AV12OrderedBy == 11 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbHdrgm2 DESC" ;
      }
      else if ( ( AV12OrderedBy == 12 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarAlbMtrE" ;
      }
      else if ( ( AV12OrderedBy == 12 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarAlbMtrE DESC" ;
      }
      else if ( ( AV12OrderedBy == 13 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarPreMtr" ;
      }
      else if ( ( AV12OrderedBy == 13 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarPreMtr DESC" ;
      }
      else if ( ( AV12OrderedBy == 14 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarAlbPie" ;
      }
      else if ( ( AV12OrderedBy == 14 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarAlbPie DESC" ;
      }
      else if ( ( AV12OrderedBy == 15 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbTiras" ;
      }
      else if ( ( AV12OrderedBy == 15 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbTiras DESC" ;
      }
      else if ( ( AV12OrderedBy == 16 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbTirasKg" ;
      }
      else if ( ( AV12OrderedBy == 16 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbTirasKg DESC" ;
      }
      else if ( ( AV12OrderedBy == 17 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbSinTest" ;
      }
      else if ( ( AV12OrderedBy == 17 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbSinTest DESC" ;
      }
      else if ( ( AV12OrderedBy == 18 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.TubCod" ;
      }
      else if ( ( AV12OrderedBy == 18 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.TubCod DESC" ;
      }
      else if ( ( AV12OrderedBy == 19 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarAlbTub" ;
      }
      else if ( ( AV12OrderedBy == 19 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarAlbTub DESC" ;
      }
      else if ( ( AV12OrderedBy == 20 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbHdrObs" ;
      }
      else if ( ( AV12OrderedBy == 20 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbHdrObs DESC" ;
      }
      else if ( ( AV12OrderedBy == 21 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PlasCod" ;
      }
      else if ( ( AV12OrderedBy == 21 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PlasCod DESC" ;
      }
      else if ( ( AV12OrderedBy == 22 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarAlbPlas" ;
      }
      else if ( ( AV12OrderedBy == 22 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarAlbPlas DESC" ;
      }
      else if ( ( AV12OrderedBy == 23 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.TipAcaCod" ;
      }
      else if ( ( AV12OrderedBy == 23 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.TipAcaCod DESC" ;
      }
      else if ( ( AV12OrderedBy == 24 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbProVal" ;
      }
      else if ( ( AV12OrderedBy == 24 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbProVal DESC" ;
      }
      GXv_Object30[0] = scmdbuf ;
      GXv_Object30[1] = GXv_int29 ;
      return GXv_Object30 ;
   }

   protected Object[] conditional_H01XC3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A2839AlbProVal ,
                                          GXSimpleCollection<String> AV149Albaranes_albaranguia__wwds_50_tfalbproval_sels ,
                                          int AV101Albaranes_albaranguia__wwds_2_tfbarcod ,
                                          int AV102Albaranes_albaranguia__wwds_3_tfbarcod_to ,
                                          byte AV103Albaranes_albaranguia__wwds_4_tfbarcodreo ,
                                          byte AV104Albaranes_albaranguia__wwds_5_tfbarcodreo_to ,
                                          String AV106Albaranes_albaranguia__wwds_7_tfbarcodpar_sel ,
                                          String AV105Albaranes_albaranguia__wwds_6_tfbarcodpar ,
                                          String AV108Albaranes_albaranguia__wwds_9_tfalbser_sel ,
                                          String AV107Albaranes_albaranguia__wwds_8_tfalbser ,
                                          String AV112Albaranes_albaranguia__wwds_13_tfalbnomcli_sel ,
                                          String AV111Albaranes_albaranguia__wwds_12_tfalbnomcli ,
                                          int AV113Albaranes_albaranguia__wwds_14_tfalbcolnum ,
                                          int AV114Albaranes_albaranguia__wwds_15_tfalbcolnum_to ,
                                          String AV116Albaranes_albaranguia__wwds_17_tfcodcod_sel ,
                                          String AV115Albaranes_albaranguia__wwds_16_tfcodcod ,
                                          java.math.BigDecimal AV117Albaranes_albaranguia__wwds_18_tfbaralbkgme ,
                                          java.math.BigDecimal AV118Albaranes_albaranguia__wwds_19_tfbaralbkgme_to ,
                                          java.math.BigDecimal AV119Albaranes_albaranguia__wwds_20_tfbarprekgm ,
                                          java.math.BigDecimal AV120Albaranes_albaranguia__wwds_21_tfbarprekgm_to ,
                                          short AV121Albaranes_albaranguia__wwds_22_tfalbhdranc ,
                                          short AV122Albaranes_albaranguia__wwds_23_tfalbhdranc_to ,
                                          short AV123Albaranes_albaranguia__wwds_24_tfalbhdrgm2 ,
                                          short AV124Albaranes_albaranguia__wwds_25_tfalbhdrgm2_to ,
                                          java.math.BigDecimal AV125Albaranes_albaranguia__wwds_26_tfbaralbmtre ,
                                          java.math.BigDecimal AV126Albaranes_albaranguia__wwds_27_tfbaralbmtre_to ,
                                          java.math.BigDecimal AV127Albaranes_albaranguia__wwds_28_tfbarpremtr ,
                                          java.math.BigDecimal AV128Albaranes_albaranguia__wwds_29_tfbarpremtr_to ,
                                          int AV129Albaranes_albaranguia__wwds_30_tfbaralbpie ,
                                          int AV130Albaranes_albaranguia__wwds_31_tfbaralbpie_to ,
                                          String AV132Albaranes_albaranguia__wwds_33_tfalbtiras_sel ,
                                          String AV131Albaranes_albaranguia__wwds_32_tfalbtiras ,
                                          java.math.BigDecimal AV133Albaranes_albaranguia__wwds_34_tfalbtiraskg ,
                                          java.math.BigDecimal AV134Albaranes_albaranguia__wwds_35_tfalbtiraskg_to ,
                                          String AV136Albaranes_albaranguia__wwds_37_tfalbsintest_sel ,
                                          String AV135Albaranes_albaranguia__wwds_36_tfalbsintest ,
                                          short AV137Albaranes_albaranguia__wwds_38_tftubcod ,
                                          short AV138Albaranes_albaranguia__wwds_39_tftubcod_to ,
                                          int AV139Albaranes_albaranguia__wwds_40_tfbaralbtub ,
                                          int AV140Albaranes_albaranguia__wwds_41_tfbaralbtub_to ,
                                          String AV142Albaranes_albaranguia__wwds_43_tfalbhdrobs_sel ,
                                          String AV141Albaranes_albaranguia__wwds_42_tfalbhdrobs ,
                                          short AV143Albaranes_albaranguia__wwds_44_tfplascod ,
                                          short AV144Albaranes_albaranguia__wwds_45_tfplascod_to ,
                                          short AV145Albaranes_albaranguia__wwds_46_tfbaralbplas ,
                                          short AV146Albaranes_albaranguia__wwds_47_tfbaralbplas_to ,
                                          short AV147Albaranes_albaranguia__wwds_48_tftipacacod ,
                                          short AV148Albaranes_albaranguia__wwds_49_tftipacacod_to ,
                                          int AV149Albaranes_albaranguia__wwds_50_tfalbproval_sels_size ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          String A3391AlbSer ,
                                          String A12232AlbNomCli ,
                                          int A3393AlbColNum ,
                                          String A3153CodCod ,
                                          java.math.BigDecimal A1261BarAlbKgmE ,
                                          java.math.BigDecimal A1262BarPreKgm ,
                                          short A3271AlbHdrAnc ,
                                          short A5019AlbHdrgm2 ,
                                          java.math.BigDecimal A1263BarAlbMtrE ,
                                          java.math.BigDecimal A1264BarPreMtr ,
                                          int A1265BarAlbPie ,
                                          String A14057AlbTiras ,
                                          java.math.BigDecimal A14058AlbTirasKg ,
                                          String A14059AlbSinTest ,
                                          short A1206TubCod ,
                                          int A1266BarAlbTub ,
                                          String A2441AlbHdrObs ,
                                          short A6466PlasCod ,
                                          short A6467BarAlbPlas ,
                                          short A5051TipAcaCod ,
                                          short AV12OrderedBy ,
                                          boolean AV13OrderedDsc ,
                                          String AV100Albaranes_albaranguia__wwds_1_filterfulltext ,
                                          String A14056AlbColorCv ,
                                          String AV110Albaranes_albaranguia__wwds_11_tfalbcolorcv_sel ,
                                          String AV109Albaranes_albaranguia__wwds_10_tfalbcolorcv ,
                                          String A396EmprCod ,
                                          long A30AlbProCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int32 = new byte[48];
      Object[] GXv_Object33 = new Object[2];
      scmdbuf = "SELECT T2.EmprGuiRem AS EmprGuiRem, T1.AlbProCod, T2.AlbEnvFtp, T2.GuiRemCli AS GuiRemCli, T3.CliNom AS GuiRemCln, T2.AlbProfch, T2.AlbSec, T2.AlbLic, T1.AlbProVal," ;
      scmdbuf += " T1.TipAcaCod, T1.BarAlbPlas, T1.PlasCod, T1.AlbHdrObs, T1.BarAlbTub, T1.TubCod, T1.AlbSinTest, T1.AlbTirasKg, T1.AlbTiras, T1.BarAlbPie, T1.BarPreMtr, T1.BarAlbMtrE," ;
      scmdbuf += " T1.AlbHdrgm2, T1.AlbHdrAnc, T1.BarPreKgm, T1.BarAlbKgmE, T1.CodCod, T1.AlbColNum, T1.AlbNomCli, T1.AlbTipArt, T1.AlbSer, T1.EmprCod, T1.BarCodPar, T1.BarCodReo," ;
      scmdbuf += " T1.BarCod FROM ((TXPALBBAR T1 INNER JOIN TXPCALPRD T2 ON T2.EmprCod = T1.EmprCod AND T2.AlbProCod = T1.AlbProCod) INNER JOIN TXPCLIENT T3 ON T3.EmprCod = T2.EmprGuiRem" ;
      scmdbuf += " AND T3.CliCod = T2.GuiRemCli)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.AlbProCod = ?)");
      if ( ! (0==AV101Albaranes_albaranguia__wwds_2_tfbarcod) )
      {
         addWhere(sWhereString, "(T1.BarCod >= ?)");
      }
      else
      {
         GXv_int32[2] = (byte)(1) ;
      }
      if ( ! (0==AV102Albaranes_albaranguia__wwds_3_tfbarcod_to) )
      {
         addWhere(sWhereString, "(T1.BarCod <= ?)");
      }
      else
      {
         GXv_int32[3] = (byte)(1) ;
      }
      if ( ! (0==AV103Albaranes_albaranguia__wwds_4_tfbarcodreo) )
      {
         addWhere(sWhereString, "(T1.BarCodReo >= ?)");
      }
      else
      {
         GXv_int32[4] = (byte)(1) ;
      }
      if ( ! (0==AV104Albaranes_albaranguia__wwds_5_tfbarcodreo_to) )
      {
         addWhere(sWhereString, "(T1.BarCodReo <= ?)");
      }
      else
      {
         GXv_int32[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV106Albaranes_albaranguia__wwds_7_tfbarcodpar_sel)==0) && ( ! (GXutil.strcmp("", AV105Albaranes_albaranguia__wwds_6_tfbarcodpar)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int32[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV106Albaranes_albaranguia__wwds_7_tfbarcodpar_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int32[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV108Albaranes_albaranguia__wwds_9_tfalbser_sel)==0) && ( ! (GXutil.strcmp("", AV107Albaranes_albaranguia__wwds_8_tfalbser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int32[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV108Albaranes_albaranguia__wwds_9_tfalbser_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbSer = ?)");
      }
      else
      {
         GXv_int32[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV112Albaranes_albaranguia__wwds_13_tfalbnomcli_sel)==0) && ( ! (GXutil.strcmp("", AV111Albaranes_albaranguia__wwds_12_tfalbnomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int32[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV112Albaranes_albaranguia__wwds_13_tfalbnomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbNomCli = ?)");
      }
      else
      {
         GXv_int32[11] = (byte)(1) ;
      }
      if ( ! (0==AV113Albaranes_albaranguia__wwds_14_tfalbcolnum) )
      {
         addWhere(sWhereString, "(T1.AlbColNum >= ?)");
      }
      else
      {
         GXv_int32[12] = (byte)(1) ;
      }
      if ( ! (0==AV114Albaranes_albaranguia__wwds_15_tfalbcolnum_to) )
      {
         addWhere(sWhereString, "(T1.AlbColNum <= ?)");
      }
      else
      {
         GXv_int32[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV116Albaranes_albaranguia__wwds_17_tfcodcod_sel)==0) && ( ! (GXutil.strcmp("", AV115Albaranes_albaranguia__wwds_16_tfcodcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CodCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int32[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV116Albaranes_albaranguia__wwds_17_tfcodcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CodCod = ?)");
      }
      else
      {
         GXv_int32[15] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV117Albaranes_albaranguia__wwds_18_tfbaralbkgme)==0) )
      {
         addWhere(sWhereString, "(T1.BarAlbKgmE >= ?)");
      }
      else
      {
         GXv_int32[16] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV118Albaranes_albaranguia__wwds_19_tfbaralbkgme_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarAlbKgmE <= ?)");
      }
      else
      {
         GXv_int32[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV119Albaranes_albaranguia__wwds_20_tfbarprekgm)==0) )
      {
         addWhere(sWhereString, "(T1.BarPreKgm >= ?)");
      }
      else
      {
         GXv_int32[18] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV120Albaranes_albaranguia__wwds_21_tfbarprekgm_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarPreKgm <= ?)");
      }
      else
      {
         GXv_int32[19] = (byte)(1) ;
      }
      if ( ! (0==AV121Albaranes_albaranguia__wwds_22_tfalbhdranc) )
      {
         addWhere(sWhereString, "(T1.AlbHdrAnc >= ?)");
      }
      else
      {
         GXv_int32[20] = (byte)(1) ;
      }
      if ( ! (0==AV122Albaranes_albaranguia__wwds_23_tfalbhdranc_to) )
      {
         addWhere(sWhereString, "(T1.AlbHdrAnc <= ?)");
      }
      else
      {
         GXv_int32[21] = (byte)(1) ;
      }
      if ( ! (0==AV123Albaranes_albaranguia__wwds_24_tfalbhdrgm2) )
      {
         addWhere(sWhereString, "(T1.AlbHdrgm2 >= ?)");
      }
      else
      {
         GXv_int32[22] = (byte)(1) ;
      }
      if ( ! (0==AV124Albaranes_albaranguia__wwds_25_tfalbhdrgm2_to) )
      {
         addWhere(sWhereString, "(T1.AlbHdrgm2 <= ?)");
      }
      else
      {
         GXv_int32[23] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV125Albaranes_albaranguia__wwds_26_tfbaralbmtre)==0) )
      {
         addWhere(sWhereString, "(T1.BarAlbMtrE >= ?)");
      }
      else
      {
         GXv_int32[24] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV126Albaranes_albaranguia__wwds_27_tfbaralbmtre_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarAlbMtrE <= ?)");
      }
      else
      {
         GXv_int32[25] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV127Albaranes_albaranguia__wwds_28_tfbarpremtr)==0) )
      {
         addWhere(sWhereString, "(T1.BarPreMtr >= ?)");
      }
      else
      {
         GXv_int32[26] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV128Albaranes_albaranguia__wwds_29_tfbarpremtr_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarPreMtr <= ?)");
      }
      else
      {
         GXv_int32[27] = (byte)(1) ;
      }
      if ( ! (0==AV129Albaranes_albaranguia__wwds_30_tfbaralbpie) )
      {
         addWhere(sWhereString, "(T1.BarAlbPie >= ?)");
      }
      else
      {
         GXv_int32[28] = (byte)(1) ;
      }
      if ( ! (0==AV130Albaranes_albaranguia__wwds_31_tfbaralbpie_to) )
      {
         addWhere(sWhereString, "(T1.BarAlbPie <= ?)");
      }
      else
      {
         GXv_int32[29] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV132Albaranes_albaranguia__wwds_33_tfalbtiras_sel)==0) && ( ! (GXutil.strcmp("", AV131Albaranes_albaranguia__wwds_32_tfalbtiras)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbTiras) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int32[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV132Albaranes_albaranguia__wwds_33_tfalbtiras_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbTiras = ?)");
      }
      else
      {
         GXv_int32[31] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV133Albaranes_albaranguia__wwds_34_tfalbtiraskg)==0) )
      {
         addWhere(sWhereString, "(T1.AlbTirasKg >= ?)");
      }
      else
      {
         GXv_int32[32] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV134Albaranes_albaranguia__wwds_35_tfalbtiraskg_to)==0) )
      {
         addWhere(sWhereString, "(T1.AlbTirasKg <= ?)");
      }
      else
      {
         GXv_int32[33] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV136Albaranes_albaranguia__wwds_37_tfalbsintest_sel)==0) && ( ! (GXutil.strcmp("", AV135Albaranes_albaranguia__wwds_36_tfalbsintest)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbSinTest) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int32[34] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV136Albaranes_albaranguia__wwds_37_tfalbsintest_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbSinTest = ?)");
      }
      else
      {
         GXv_int32[35] = (byte)(1) ;
      }
      if ( ! (0==AV137Albaranes_albaranguia__wwds_38_tftubcod) )
      {
         addWhere(sWhereString, "(T1.TubCod >= ?)");
      }
      else
      {
         GXv_int32[36] = (byte)(1) ;
      }
      if ( ! (0==AV138Albaranes_albaranguia__wwds_39_tftubcod_to) )
      {
         addWhere(sWhereString, "(T1.TubCod <= ?)");
      }
      else
      {
         GXv_int32[37] = (byte)(1) ;
      }
      if ( ! (0==AV139Albaranes_albaranguia__wwds_40_tfbaralbtub) )
      {
         addWhere(sWhereString, "(T1.BarAlbTub >= ?)");
      }
      else
      {
         GXv_int32[38] = (byte)(1) ;
      }
      if ( ! (0==AV140Albaranes_albaranguia__wwds_41_tfbaralbtub_to) )
      {
         addWhere(sWhereString, "(T1.BarAlbTub <= ?)");
      }
      else
      {
         GXv_int32[39] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV142Albaranes_albaranguia__wwds_43_tfalbhdrobs_sel)==0) && ( ! (GXutil.strcmp("", AV141Albaranes_albaranguia__wwds_42_tfalbhdrobs)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbHdrObs) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int32[40] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV142Albaranes_albaranguia__wwds_43_tfalbhdrobs_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbHdrObs = ?)");
      }
      else
      {
         GXv_int32[41] = (byte)(1) ;
      }
      if ( ! (0==AV143Albaranes_albaranguia__wwds_44_tfplascod) )
      {
         addWhere(sWhereString, "(T1.PlasCod >= ?)");
      }
      else
      {
         GXv_int32[42] = (byte)(1) ;
      }
      if ( ! (0==AV144Albaranes_albaranguia__wwds_45_tfplascod_to) )
      {
         addWhere(sWhereString, "(T1.PlasCod <= ?)");
      }
      else
      {
         GXv_int32[43] = (byte)(1) ;
      }
      if ( ! (0==AV145Albaranes_albaranguia__wwds_46_tfbaralbplas) )
      {
         addWhere(sWhereString, "(T1.BarAlbPlas >= ?)");
      }
      else
      {
         GXv_int32[44] = (byte)(1) ;
      }
      if ( ! (0==AV146Albaranes_albaranguia__wwds_47_tfbaralbplas_to) )
      {
         addWhere(sWhereString, "(T1.BarAlbPlas <= ?)");
      }
      else
      {
         GXv_int32[45] = (byte)(1) ;
      }
      if ( ! (0==AV147Albaranes_albaranguia__wwds_48_tftipacacod) )
      {
         addWhere(sWhereString, "(T1.TipAcaCod >= ?)");
      }
      else
      {
         GXv_int32[46] = (byte)(1) ;
      }
      if ( ! (0==AV148Albaranes_albaranguia__wwds_49_tftipacacod_to) )
      {
         addWhere(sWhereString, "(T1.TipAcaCod <= ?)");
      }
      else
      {
         GXv_int32[47] = (byte)(1) ;
      }
      if ( AV149Albaranes_albaranguia__wwds_50_tfalbproval_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV149Albaranes_albaranguia__wwds_50_tfalbproval_sels, "T1.AlbProVal IN (", ")")+")");
      }
      scmdbuf += sWhereString ;
      if ( ( AV12OrderedBy == 1 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarCod" ;
      }
      else if ( ( AV12OrderedBy == 1 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarCod DESC" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarCodReo" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarCodReo DESC" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarCodPar" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarCodPar DESC" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbSer" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbSer DESC" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbNomCli" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbNomCli DESC" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbColNum" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbColNum DESC" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.CodCod" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.CodCod DESC" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarAlbKgmE" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarAlbKgmE DESC" ;
      }
      else if ( ( AV12OrderedBy == 9 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarPreKgm" ;
      }
      else if ( ( AV12OrderedBy == 9 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarPreKgm DESC" ;
      }
      else if ( ( AV12OrderedBy == 10 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbHdrAnc" ;
      }
      else if ( ( AV12OrderedBy == 10 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbHdrAnc DESC" ;
      }
      else if ( ( AV12OrderedBy == 11 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbHdrgm2" ;
      }
      else if ( ( AV12OrderedBy == 11 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbHdrgm2 DESC" ;
      }
      else if ( ( AV12OrderedBy == 12 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarAlbMtrE" ;
      }
      else if ( ( AV12OrderedBy == 12 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarAlbMtrE DESC" ;
      }
      else if ( ( AV12OrderedBy == 13 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarPreMtr" ;
      }
      else if ( ( AV12OrderedBy == 13 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarPreMtr DESC" ;
      }
      else if ( ( AV12OrderedBy == 14 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarAlbPie" ;
      }
      else if ( ( AV12OrderedBy == 14 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarAlbPie DESC" ;
      }
      else if ( ( AV12OrderedBy == 15 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbTiras" ;
      }
      else if ( ( AV12OrderedBy == 15 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbTiras DESC" ;
      }
      else if ( ( AV12OrderedBy == 16 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbTirasKg" ;
      }
      else if ( ( AV12OrderedBy == 16 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbTirasKg DESC" ;
      }
      else if ( ( AV12OrderedBy == 17 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbSinTest" ;
      }
      else if ( ( AV12OrderedBy == 17 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbSinTest DESC" ;
      }
      else if ( ( AV12OrderedBy == 18 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.TubCod" ;
      }
      else if ( ( AV12OrderedBy == 18 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.TubCod DESC" ;
      }
      else if ( ( AV12OrderedBy == 19 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarAlbTub" ;
      }
      else if ( ( AV12OrderedBy == 19 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarAlbTub DESC" ;
      }
      else if ( ( AV12OrderedBy == 20 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbHdrObs" ;
      }
      else if ( ( AV12OrderedBy == 20 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbHdrObs DESC" ;
      }
      else if ( ( AV12OrderedBy == 21 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PlasCod" ;
      }
      else if ( ( AV12OrderedBy == 21 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PlasCod DESC" ;
      }
      else if ( ( AV12OrderedBy == 22 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarAlbPlas" ;
      }
      else if ( ( AV12OrderedBy == 22 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarAlbPlas DESC" ;
      }
      else if ( ( AV12OrderedBy == 23 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.TipAcaCod" ;
      }
      else if ( ( AV12OrderedBy == 23 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.TipAcaCod DESC" ;
      }
      else if ( ( AV12OrderedBy == 24 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbProVal" ;
      }
      else if ( ( AV12OrderedBy == 24 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbProVal DESC" ;
      }
      GXv_Object33[0] = scmdbuf ;
      GXv_Object33[1] = GXv_int32 ;
      return GXv_Object33 ;
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
                  return conditional_H01XC2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).byteValue() , ((Number) dynConstraints[5]).byteValue() , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).intValue() , (String)dynConstraints[14] , (String)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , ((Number) dynConstraints[20]).shortValue() , ((Number) dynConstraints[21]).shortValue() , ((Number) dynConstraints[22]).shortValue() , ((Number) dynConstraints[23]).shortValue() , (java.math.BigDecimal)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , (java.math.BigDecimal)dynConstraints[27] , ((Number) dynConstraints[28]).intValue() , ((Number) dynConstraints[29]).intValue() , (String)dynConstraints[30] , (String)dynConstraints[31] , (java.math.BigDecimal)dynConstraints[32] , (java.math.BigDecimal)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] , ((Number) dynConstraints[36]).shortValue() , ((Number) dynConstraints[37]).shortValue() , ((Number) dynConstraints[38]).intValue() , ((Number) dynConstraints[39]).intValue() , (String)dynConstraints[40] , (String)dynConstraints[41] , ((Number) dynConstraints[42]).shortValue() , ((Number) dynConstraints[43]).shortValue() , ((Number) dynConstraints[44]).shortValue() , ((Number) dynConstraints[45]).shortValue() , ((Number) dynConstraints[46]).shortValue() , ((Number) dynConstraints[47]).shortValue() , ((Number) dynConstraints[48]).intValue() , ((Number) dynConstraints[49]).intValue() , ((Number) dynConstraints[50]).byteValue() , (String)dynConstraints[51] , (String)dynConstraints[52] , (String)dynConstraints[53] , ((Number) dynConstraints[54]).intValue() , (String)dynConstraints[55] , (java.math.BigDecimal)dynConstraints[56] , (java.math.BigDecimal)dynConstraints[57] , ((Number) dynConstraints[58]).shortValue() , ((Number) dynConstraints[59]).shortValue() , (java.math.BigDecimal)dynConstraints[60] , (java.math.BigDecimal)dynConstraints[61] , ((Number) dynConstraints[62]).intValue() , (String)dynConstraints[63] , (java.math.BigDecimal)dynConstraints[64] , (String)dynConstraints[65] , ((Number) dynConstraints[66]).shortValue() , ((Number) dynConstraints[67]).intValue() , (String)dynConstraints[68] , ((Number) dynConstraints[69]).shortValue() , ((Number) dynConstraints[70]).shortValue() , ((Number) dynConstraints[71]).shortValue() , ((Number) dynConstraints[72]).shortValue() , ((Boolean) dynConstraints[73]).booleanValue() , (String)dynConstraints[74] , (String)dynConstraints[75] , (String)dynConstraints[76] , (String)dynConstraints[77] , (String)dynConstraints[78] , ((Number) dynConstraints[79]).longValue() );
            case 1 :
                  return conditional_H01XC3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).byteValue() , ((Number) dynConstraints[5]).byteValue() , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).intValue() , (String)dynConstraints[14] , (String)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , ((Number) dynConstraints[20]).shortValue() , ((Number) dynConstraints[21]).shortValue() , ((Number) dynConstraints[22]).shortValue() , ((Number) dynConstraints[23]).shortValue() , (java.math.BigDecimal)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , (java.math.BigDecimal)dynConstraints[27] , ((Number) dynConstraints[28]).intValue() , ((Number) dynConstraints[29]).intValue() , (String)dynConstraints[30] , (String)dynConstraints[31] , (java.math.BigDecimal)dynConstraints[32] , (java.math.BigDecimal)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] , ((Number) dynConstraints[36]).shortValue() , ((Number) dynConstraints[37]).shortValue() , ((Number) dynConstraints[38]).intValue() , ((Number) dynConstraints[39]).intValue() , (String)dynConstraints[40] , (String)dynConstraints[41] , ((Number) dynConstraints[42]).shortValue() , ((Number) dynConstraints[43]).shortValue() , ((Number) dynConstraints[44]).shortValue() , ((Number) dynConstraints[45]).shortValue() , ((Number) dynConstraints[46]).shortValue() , ((Number) dynConstraints[47]).shortValue() , ((Number) dynConstraints[48]).intValue() , ((Number) dynConstraints[49]).intValue() , ((Number) dynConstraints[50]).byteValue() , (String)dynConstraints[51] , (String)dynConstraints[52] , (String)dynConstraints[53] , ((Number) dynConstraints[54]).intValue() , (String)dynConstraints[55] , (java.math.BigDecimal)dynConstraints[56] , (java.math.BigDecimal)dynConstraints[57] , ((Number) dynConstraints[58]).shortValue() , ((Number) dynConstraints[59]).shortValue() , (java.math.BigDecimal)dynConstraints[60] , (java.math.BigDecimal)dynConstraints[61] , ((Number) dynConstraints[62]).intValue() , (String)dynConstraints[63] , (java.math.BigDecimal)dynConstraints[64] , (String)dynConstraints[65] , ((Number) dynConstraints[66]).shortValue() , ((Number) dynConstraints[67]).intValue() , (String)dynConstraints[68] , ((Number) dynConstraints[69]).shortValue() , ((Number) dynConstraints[70]).shortValue() , ((Number) dynConstraints[71]).shortValue() , ((Number) dynConstraints[72]).shortValue() , ((Boolean) dynConstraints[73]).booleanValue() , (String)dynConstraints[74] , (String)dynConstraints[75] , (String)dynConstraints[76] , (String)dynConstraints[77] , (String)dynConstraints[78] , ((Number) dynConstraints[79]).longValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H01XC2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01XC3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01XC4", "SELECT EmprGuiRem, AlbEnvFtp, GuiRemCli, AlbProfch, AlbSec, AlbLic FROM TXPCALPRD WHERE EmprCod = ? AND AlbProCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01XC5", "SELECT CliNom AS GuiRemCln FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               ((String[]) buf[7])[0] = rslt.getString(8, 20);
               ((String[]) buf[8])[0] = rslt.getString(9, 1);
               ((short[]) buf[9])[0] = rslt.getShort(10);
               ((short[]) buf[10])[0] = rslt.getShort(11);
               ((short[]) buf[11])[0] = rslt.getShort(12);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(13, 60);
               ((int[]) buf[14])[0] = rslt.getInt(14);
               ((short[]) buf[15])[0] = rslt.getShort(15);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(16, 1);
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(17,2);
               ((String[]) buf[19])[0] = rslt.getString(18, 1);
               ((int[]) buf[20])[0] = rslt.getInt(19);
               ((java.math.BigDecimal[]) buf[21])[0] = rslt.getBigDecimal(20,5);
               ((java.math.BigDecimal[]) buf[22])[0] = rslt.getBigDecimal(21,2);
               ((short[]) buf[23])[0] = rslt.getShort(22);
               ((short[]) buf[24])[0] = rslt.getShort(23);
               ((java.math.BigDecimal[]) buf[25])[0] = rslt.getBigDecimal(24,5);
               ((java.math.BigDecimal[]) buf[26])[0] = rslt.getBigDecimal(25,2);
               ((String[]) buf[27])[0] = rslt.getString(26, 6);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((int[]) buf[29])[0] = rslt.getInt(27);
               ((String[]) buf[30])[0] = rslt.getString(28, 13);
               ((short[]) buf[31])[0] = rslt.getShort(29);
               ((String[]) buf[32])[0] = rslt.getString(30, 16);
               ((String[]) buf[33])[0] = rslt.getString(31, 3);
               ((String[]) buf[34])[0] = rslt.getString(32, 1);
               ((byte[]) buf[35])[0] = rslt.getByte(33);
               ((int[]) buf[36])[0] = rslt.getInt(34);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               ((String[]) buf[7])[0] = rslt.getString(8, 20);
               ((String[]) buf[8])[0] = rslt.getString(9, 1);
               ((short[]) buf[9])[0] = rslt.getShort(10);
               ((short[]) buf[10])[0] = rslt.getShort(11);
               ((short[]) buf[11])[0] = rslt.getShort(12);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(13, 60);
               ((int[]) buf[14])[0] = rslt.getInt(14);
               ((short[]) buf[15])[0] = rslt.getShort(15);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(16, 1);
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(17,2);
               ((String[]) buf[19])[0] = rslt.getString(18, 1);
               ((int[]) buf[20])[0] = rslt.getInt(19);
               ((java.math.BigDecimal[]) buf[21])[0] = rslt.getBigDecimal(20,5);
               ((java.math.BigDecimal[]) buf[22])[0] = rslt.getBigDecimal(21,2);
               ((short[]) buf[23])[0] = rslt.getShort(22);
               ((short[]) buf[24])[0] = rslt.getShort(23);
               ((java.math.BigDecimal[]) buf[25])[0] = rslt.getBigDecimal(24,5);
               ((java.math.BigDecimal[]) buf[26])[0] = rslt.getBigDecimal(25,2);
               ((String[]) buf[27])[0] = rslt.getString(26, 6);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((int[]) buf[29])[0] = rslt.getInt(27);
               ((String[]) buf[30])[0] = rslt.getString(28, 13);
               ((short[]) buf[31])[0] = rslt.getShort(29);
               ((String[]) buf[32])[0] = rslt.getString(30, 16);
               ((String[]) buf[33])[0] = rslt.getString(31, 3);
               ((String[]) buf[34])[0] = rslt.getString(32, 1);
               ((byte[]) buf[35])[0] = rslt.getByte(33);
               ((int[]) buf[36])[0] = rslt.getInt(34);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 20);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
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
                  stmt.setString(sIdx, (String)parms[48], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[49]).longValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[50]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[51]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[52]).byteValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[53]).byteValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 1);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 1);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 16);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 16);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 13);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 13);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[60]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[61]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 6);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 6);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[64], 2);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[65], 2);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[66], 5);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[67], 5);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[68]).shortValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[69]).shortValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[70]).shortValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[71]).shortValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[72], 2);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[73], 2);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[74], 5);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[75], 5);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[76]).intValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[77]).intValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 1);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[79], 1);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[80], 2);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[81], 2);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[82], 1);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[83], 1);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[84]).shortValue());
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[85]).shortValue());
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[86]).intValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[87]).intValue());
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[88], 60);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[89], 60);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[90]).shortValue());
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[91]).shortValue());
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[92]).shortValue());
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[93]).shortValue());
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[94]).shortValue());
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[95]).shortValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[49]).longValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[50]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[51]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[52]).byteValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[53]).byteValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 1);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 1);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 16);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 16);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 13);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 13);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[60]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[61]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 6);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 6);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[64], 2);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[65], 2);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[66], 5);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[67], 5);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[68]).shortValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[69]).shortValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[70]).shortValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[71]).shortValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[72], 2);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[73], 2);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[74], 5);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[75], 5);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[76]).intValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[77]).intValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 1);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[79], 1);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[80], 2);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[81], 2);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[82], 1);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[83], 1);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[84]).shortValue());
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[85]).shortValue());
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[86]).intValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[87]).intValue());
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[88], 60);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[89], 60);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[90]).shortValue());
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[91]).shortValue());
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[92]).shortValue());
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[93]).shortValue());
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[94]).shortValue());
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[95]).shortValue());
               }
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

