package app.anticipacionerrores ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class mant_detalle_impl extends GXWebComponent
{
   public mant_detalle_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public mant_detalle_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( mant_detalle_impl.class ));
   }

   public mant_detalle_impl( int remoteHandle ,
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
   }

   public void initweb( )
   {
      initialize_properties( ) ;
      if ( GXutil.len( sPrefix) == 0 )
      {
         if ( nGotPars == 0 )
         {
            entryPointCalled = false ;
            gxfirstwebparm = httpContext.GetFirstPar( "MADetEmprCod") ;
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
               AV70MADetEmprCod = httpContext.GetPar( "MADetEmprCod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV70MADetEmprCod", AV70MADetEmprCod);
               AV71CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV71CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV71CliCod), 6, 0));
               AV72ArtCod = httpContext.GetPar( "ArtCod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV72ArtCod", AV72ArtCod);
               AV73ForColNum = (int)(GXutil.lval( httpContext.GetPar( "ForColNum"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV73ForColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV73ForColNum), 6, 0));
               AV74TipMaqCodJSON = httpContext.GetPar( "TipMaqCodJSON") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV74TipMaqCodJSON", AV74TipMaqCodJSON);
               AV75FechaInicio = localUtil.parseDateParm( httpContext.GetPar( "FechaInicio")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV75FechaInicio", localUtil.format(AV75FechaInicio, "99/99/99"));
               AV76FechaFin = localUtil.parseDateParm( httpContext.GetPar( "FechaFin")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV76FechaFin", localUtil.format(AV76FechaFin, "99/99/99"));
               AV115MADetMaqCod = httpContext.GetPar( "MADetMaqCod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV115MADetMaqCod", AV115MADetMaqCod);
               AV103MADetDefCod = (short)(GXutil.lval( httpContext.GetPar( "MADetDefCod"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV103MADetDefCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV103MADetDefCod), 4, 0));
               AV104MADetCatCod = (short)(GXutil.lval( httpContext.GetPar( "MADetCatCod"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV104MADetCatCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV104MADetCatCod), 4, 0));
               AV105MTknUsu = httpContext.GetPar( "MTknUsu") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV105MTknUsu", AV105MTknUsu);
               AV106MTkn = httpContext.GetPar( "MTkn") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV106MTkn", AV106MTkn);
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,AV70MADetEmprCod,Integer.valueOf(AV71CliCod),AV72ArtCod,Integer.valueOf(AV73ForColNum),AV74TipMaqCodJSON,AV75FechaInicio,AV76FechaFin,AV115MADetMaqCod,Short.valueOf(AV103MADetDefCod),Short.valueOf(AV104MADetCatCod),AV105MTknUsu,AV106MTkn});
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
               gxfirstwebparm = httpContext.GetFirstPar( "MADetEmprCod") ;
            }
            else if ( GXutil.strcmp(gxfirstwebparm, "gxfullajaxEvt") == 0 )
            {
               if ( ! httpContext.IsValidAjaxCall( true) )
               {
                  GxWebError = (byte)(1) ;
                  return  ;
               }
               gxfirstwebparm = httpContext.GetFirstPar( "MADetEmprCod") ;
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
      nRC_GXsfl_39 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_39"))) ;
      nGXsfl_39_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_39_idx"))) ;
      sGXsfl_39_idx = httpContext.GetPar( "sGXsfl_39_idx") ;
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
      AV15FilterFullText = httpContext.GetPar( "FilterFullText") ;
      AV70MADetEmprCod = httpContext.GetPar( "MADetEmprCod") ;
      AV71CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
      AV72ArtCod = httpContext.GetPar( "ArtCod") ;
      AV73ForColNum = (int)(GXutil.lval( httpContext.GetPar( "ForColNum"))) ;
      AV115MADetMaqCod = httpContext.GetPar( "MADetMaqCod") ;
      AV103MADetDefCod = (short)(GXutil.lval( httpContext.GetPar( "MADetDefCod"))) ;
      AV104MADetCatCod = (short)(GXutil.lval( httpContext.GetPar( "MADetCatCod"))) ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV79TipMaqCodCollection);
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV91sdtMTok);
      AV25ManageFiltersExecutionStep = (byte)(GXutil.lval( httpContext.GetPar( "ManageFiltersExecutionStep"))) ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV20ColumnsSelector);
      AV28TFMADetFec = localUtil.parseDateParm( httpContext.GetPar( "TFMADetFec")) ;
      AV32TFMADetEmprCod = httpContext.GetPar( "TFMADetEmprCod") ;
      AV33TFMADetEmprCod_Sel = httpContext.GetPar( "TFMADetEmprCod_Sel") ;
      AV34TFMADetCliCod = (int)(GXutil.lval( httpContext.GetPar( "TFMADetCliCod"))) ;
      AV35TFMADetCliCod_To = (int)(GXutil.lval( httpContext.GetPar( "TFMADetCliCod_To"))) ;
      AV36TFMADetCliNom = httpContext.GetPar( "TFMADetCliNom") ;
      AV37TFMADetCliNom_Sel = httpContext.GetPar( "TFMADetCliNom_Sel") ;
      AV38TFMADetArtCod = httpContext.GetPar( "TFMADetArtCod") ;
      AV39TFMADetArtCod_Sel = httpContext.GetPar( "TFMADetArtCod_Sel") ;
      AV77TFMADetArtDsc = httpContext.GetPar( "TFMADetArtDsc") ;
      AV78TFMADetArtDsc_Sel = httpContext.GetPar( "TFMADetArtDsc_Sel") ;
      AV44TFMADetColNum = (int)(GXutil.lval( httpContext.GetPar( "TFMADetColNum"))) ;
      AV45TFMADetColNum_To = (int)(GXutil.lval( httpContext.GetPar( "TFMADetColNum_To"))) ;
      AV42TFMADetColNom = httpContext.GetPar( "TFMADetColNom") ;
      AV43TFMADetColNom_Sel = httpContext.GetPar( "TFMADetColNom_Sel") ;
      AV46TFMADetColCod = (byte)(GXutil.lval( httpContext.GetPar( "TFMADetColCod"))) ;
      AV47TFMADetColCod_To = (byte)(GXutil.lval( httpContext.GetPar( "TFMADetColCod_To"))) ;
      AV48TFMADetMatCod = (short)(GXutil.lval( httpContext.GetPar( "TFMADetMatCod"))) ;
      AV49TFMADetMatCod_To = (short)(GXutil.lval( httpContext.GetPar( "TFMADetMatCod_To"))) ;
      AV80TFMADetMatDsc = httpContext.GetPar( "TFMADetMatDsc") ;
      AV81TFMADetMatDsc_Sel = httpContext.GetPar( "TFMADetMatDsc_Sel") ;
      AV52TFMADetIntCod = (byte)(GXutil.lval( httpContext.GetPar( "TFMADetIntCod"))) ;
      AV53TFMADetIntCod_To = (byte)(GXutil.lval( httpContext.GetPar( "TFMADetIntCod_To"))) ;
      AV82TFMADetIntDsc = httpContext.GetPar( "TFMADetIntDsc") ;
      AV83TFMADetIntDsc_Sel = httpContext.GetPar( "TFMADetIntDsc_Sel") ;
      AV56TFMADetMaqCod = httpContext.GetPar( "TFMADetMaqCod") ;
      AV57TFMADetMaqCod_Sel = httpContext.GetPar( "TFMADetMaqCod_Sel") ;
      AV58TFMADetMaqDsc = httpContext.GetPar( "TFMADetMaqDsc") ;
      AV59TFMADetMaqDsc_Sel = httpContext.GetPar( "TFMADetMaqDsc_Sel") ;
      AV60TFMADetTipMCod = httpContext.GetPar( "TFMADetTipMCod") ;
      AV61TFMADetTipMCod_Sel = httpContext.GetPar( "TFMADetTipMCod_Sel") ;
      AV62TFMADetTipMDsc = httpContext.GetPar( "TFMADetTipMDsc") ;
      AV63TFMADetTipMDsc_Sel = httpContext.GetPar( "TFMADetTipMDsc_Sel") ;
      AV107TFMADetDefCod = (short)(GXutil.lval( httpContext.GetPar( "TFMADetDefCod"))) ;
      AV108TFMADetDefCod_To = (short)(GXutil.lval( httpContext.GetPar( "TFMADetDefCod_To"))) ;
      AV109TFMADetDefDsc = httpContext.GetPar( "TFMADetDefDsc") ;
      AV110TFMADetDefDsc_Sel = httpContext.GetPar( "TFMADetDefDsc_Sel") ;
      AV111TFMADetCatCod = (short)(GXutil.lval( httpContext.GetPar( "TFMADetCatCod"))) ;
      AV112TFMADetCatCod_To = (short)(GXutil.lval( httpContext.GetPar( "TFMADetCatCod_To"))) ;
      AV113TFMADetCatDsc = httpContext.GetPar( "TFMADetCatDsc") ;
      AV114TFMADetCatDsc_Sel = httpContext.GetPar( "TFMADetCatDsc_Sel") ;
      AV116TFMADetHdr = httpContext.GetPar( "TFMADetHdr") ;
      AV117TFMADetHdr_Sel = httpContext.GetPar( "TFMADetHdr_Sel") ;
      AV64TFMADetKilProd = CommonUtil.decimalVal( httpContext.GetPar( "TFMADetKilProd"), ".") ;
      AV65TFMADetKilProd_To = CommonUtil.decimalVal( httpContext.GetPar( "TFMADetKilProd_To"), ".") ;
      AV66TFMADetKilReo = CommonUtil.decimalVal( httpContext.GetPar( "TFMADetKilReo"), ".") ;
      AV67TFMADetKilReo_To = CommonUtil.decimalVal( httpContext.GetPar( "TFMADetKilReo_To"), ".") ;
      AV93TFMADetKilTot = CommonUtil.decimalVal( httpContext.GetPar( "TFMADetKilTot"), ".") ;
      AV94TFMADetKilTot_To = CommonUtil.decimalVal( httpContext.GetPar( "TFMADetKilTot_To"), ".") ;
      AV122TFMADetMetProd = CommonUtil.decimalVal( httpContext.GetPar( "TFMADetMetProd"), ".") ;
      AV123TFMADetMetProd_To = CommonUtil.decimalVal( httpContext.GetPar( "TFMADetMetProd_To"), ".") ;
      AV124TFMADetMetReo = CommonUtil.decimalVal( httpContext.GetPar( "TFMADetMetReo"), ".") ;
      AV125TFMADetMetReo_To = CommonUtil.decimalVal( httpContext.GetPar( "TFMADetMetReo_To"), ".") ;
      AV126TFMADetMetTot = CommonUtil.decimalVal( httpContext.GetPar( "TFMADetMetTot"), ".") ;
      AV127TFMADetMetTot_To = CommonUtil.decimalVal( httpContext.GetPar( "TFMADetMetTot_To"), ".") ;
      AV132Pgmname = httpContext.GetPar( "Pgmname") ;
      AV12OrderedBy = (short)(GXutil.lval( httpContext.GetPar( "OrderedBy"))) ;
      AV13OrderedDsc = GXutil.strtobool( httpContext.GetPar( "OrderedDsc")) ;
      AV74TipMaqCodJSON = httpContext.GetPar( "TipMaqCodJSON") ;
      AV75FechaInicio = localUtil.parseDateParm( httpContext.GetPar( "FechaInicio")) ;
      AV76FechaFin = localUtil.parseDateParm( httpContext.GetPar( "FechaFin")) ;
      AV105MTknUsu = httpContext.GetPar( "MTknUsu") ;
      AV106MTkn = httpContext.GetPar( "MTkn") ;
      AV87TotMADetKilProd = CommonUtil.decimalVal( httpContext.GetPar( "TotMADetKilProd"), ".") ;
      AV89TotMADetKilReo = CommonUtil.decimalVal( httpContext.GetPar( "TotMADetKilReo"), ".") ;
      AV120TotMADetKilTot = CommonUtil.decimalVal( httpContext.GetPar( "TotMADetKilTot"), ".") ;
      AV128TotMADetMetReo = CommonUtil.decimalVal( httpContext.GetPar( "TotMADetMetReo"), ".") ;
      sPrefix = httpContext.GetPar( "sPrefix") ;
      init_default_properties( ) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV15FilterFullText, AV70MADetEmprCod, AV71CliCod, AV72ArtCod, AV73ForColNum, AV115MADetMaqCod, AV103MADetDefCod, AV104MADetCatCod, AV79TipMaqCodCollection, AV91sdtMTok, AV25ManageFiltersExecutionStep, AV20ColumnsSelector, AV28TFMADetFec, AV32TFMADetEmprCod, AV33TFMADetEmprCod_Sel, AV34TFMADetCliCod, AV35TFMADetCliCod_To, AV36TFMADetCliNom, AV37TFMADetCliNom_Sel, AV38TFMADetArtCod, AV39TFMADetArtCod_Sel, AV77TFMADetArtDsc, AV78TFMADetArtDsc_Sel, AV44TFMADetColNum, AV45TFMADetColNum_To, AV42TFMADetColNom, AV43TFMADetColNom_Sel, AV46TFMADetColCod, AV47TFMADetColCod_To, AV48TFMADetMatCod, AV49TFMADetMatCod_To, AV80TFMADetMatDsc, AV81TFMADetMatDsc_Sel, AV52TFMADetIntCod, AV53TFMADetIntCod_To, AV82TFMADetIntDsc, AV83TFMADetIntDsc_Sel, AV56TFMADetMaqCod, AV57TFMADetMaqCod_Sel, AV58TFMADetMaqDsc, AV59TFMADetMaqDsc_Sel, AV60TFMADetTipMCod, AV61TFMADetTipMCod_Sel, AV62TFMADetTipMDsc, AV63TFMADetTipMDsc_Sel, AV107TFMADetDefCod, AV108TFMADetDefCod_To, AV109TFMADetDefDsc, AV110TFMADetDefDsc_Sel, AV111TFMADetCatCod, AV112TFMADetCatCod_To, AV113TFMADetCatDsc, AV114TFMADetCatDsc_Sel, AV116TFMADetHdr, AV117TFMADetHdr_Sel, AV64TFMADetKilProd, AV65TFMADetKilProd_To, AV66TFMADetKilReo, AV67TFMADetKilReo_To, AV93TFMADetKilTot, AV94TFMADetKilTot_To, AV122TFMADetMetProd, AV123TFMADetMetProd_To, AV124TFMADetMetReo, AV125TFMADetMetReo_To, AV126TFMADetMetTot, AV127TFMADetMetTot_To, AV132Pgmname, AV12OrderedBy, AV13OrderedDsc, AV74TipMaqCodJSON, AV75FechaInicio, AV76FechaFin, AV105MTknUsu, AV106MTkn, AV87TotMADetKilProd, AV89TotMADetKilReo, AV120TotMADetKilTot, AV128TotMADetMetReo, sPrefix) ;
      addString( httpContext.getJSONResponse( )) ;
      /* End function gxgrGrid_refresh_invoke */
   }

   public void webExecute( )
   {
      initweb( ) ;
      if ( ! isAjaxCallMode( ) )
      {
         pa2DR2( ) ;
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
         httpContext.writeValue( httpContext.getMessage( " MADet", "")) ;
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
         httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.anticipacionerrores.mant_detalle", new String[] {GXutil.URLEncode(GXutil.rtrim(AV70MADetEmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV71CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(AV72ArtCod)),GXutil.URLEncode(GXutil.ltrimstr(AV73ForColNum,6,0)),GXutil.URLEncode(GXutil.rtrim(AV74TipMaqCodJSON)),GXutil.URLEncode(GXutil.formatDateParm(AV75FechaInicio)),GXutil.URLEncode(GXutil.formatDateParm(AV76FechaFin)),GXutil.URLEncode(GXutil.rtrim(AV115MADetMaqCod)),GXutil.URLEncode(GXutil.ltrimstr(AV103MADetDefCod,4,0)),GXutil.URLEncode(GXutil.ltrimstr(AV104MADetCatCod,4,0)),GXutil.URLEncode(GXutil.rtrim(AV105MTknUsu)),GXutil.URLEncode(GXutil.rtrim(AV106MTkn))}, new String[] {"MADetEmprCod","CliCod","ArtCod","ForColNum","TipMaqCodJSON","FechaInicio","FechaFin","MADetMaqCod","MADetDefCod","MADetCatCod","MTknUsu","MTkn"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vSDTMTOK", getSecureSignedToken( sPrefix, AV91sdtMTok));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTIPMAQCODCOLLECTION", getSecureSignedToken( sPrefix, AV79TipMaqCodCollection));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTMADETKILPROD", getSecureSignedToken( sPrefix, localUtil.format( AV87TotMADetKilProd, "ZZZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTMADETKILREO", getSecureSignedToken( sPrefix, localUtil.format( AV89TotMADetKilReo, "ZZZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTMADETKILTOT", getSecureSignedToken( sPrefix, localUtil.format( AV120TotMADetKilTot, "ZZZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTMADETMETREO", getSecureSignedToken( sPrefix, localUtil.format( AV128TotMADetMetReo, "ZZZZZZZZ9.99")));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"MAnt_Detalle");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV132Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("anticipacionerrores\\mant_detalle:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GXH_vFILTERFULLTEXT", AV15FilterFullText);
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"nRC_GXsfl_39", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_39, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vMANAGEFILTERSDATA", AV23ManageFiltersData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vMANAGEFILTERSDATA", AV23ManageFiltersData);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vDDO_TITLESETTINGSICONS", AV68DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vDDO_TITLESETTINGSICONS", AV68DDO_TitleSettingsIcons);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vCOLUMNSSELECTOR", AV20ColumnsSelector);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vCOLUMNSSELECTOR", AV20ColumnsSelector);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV70MADetEmprCod", GXutil.rtrim( wcpOAV70MADetEmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV71CliCod", GXutil.ltrim( localUtil.ntoc( wcpOAV71CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV72ArtCod", GXutil.rtrim( wcpOAV72ArtCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV73ForColNum", GXutil.ltrim( localUtil.ntoc( wcpOAV73ForColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV74TipMaqCodJSON", wcpOAV74TipMaqCodJSON);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV75FechaInicio", localUtil.dtoc( wcpOAV75FechaInicio, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV76FechaFin", localUtil.dtoc( wcpOAV76FechaFin, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV115MADetMaqCod", GXutil.rtrim( wcpOAV115MADetMaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV103MADetDefCod", GXutil.ltrim( localUtil.ntoc( wcpOAV103MADetDefCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV104MADetCatCod", GXutil.ltrim( localUtil.ntoc( wcpOAV104MADetCatCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV105MTknUsu", GXutil.rtrim( wcpOAV105MTknUsu));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV106MTkn", wcpOAV106MTkn);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMANAGEFILTERSEXECUTIONSTEP", GXutil.ltrim( localUtil.ntoc( AV25ManageFiltersExecutionStep, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFMADETFEC", localUtil.dtoc( AV28TFMADetFec, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFMADETEMPRCOD", GXutil.rtrim( AV32TFMADetEmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFMADETEMPRCOD_SEL", GXutil.rtrim( AV33TFMADetEmprCod_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFMADETCLICOD", GXutil.ltrim( localUtil.ntoc( AV34TFMADetCliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFMADETCLICOD_TO", GXutil.ltrim( localUtil.ntoc( AV35TFMADetCliCod_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFMADETCLINOM", AV36TFMADetCliNom);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFMADETCLINOM_SEL", AV37TFMADetCliNom_Sel);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFMADETARTCOD", GXutil.rtrim( AV38TFMADetArtCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFMADETARTCOD_SEL", GXutil.rtrim( AV39TFMADetArtCod_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFMADETARTDSC", AV77TFMADetArtDsc);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFMADETARTDSC_SEL", AV78TFMADetArtDsc_Sel);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFMADETCOLNUM", GXutil.ltrim( localUtil.ntoc( AV44TFMADetColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFMADETCOLNUM_TO", GXutil.ltrim( localUtil.ntoc( AV45TFMADetColNum_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFMADETCOLNOM", GXutil.rtrim( AV42TFMADetColNom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFMADETCOLNOM_SEL", GXutil.rtrim( AV43TFMADetColNom_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFMADETCOLCOD", GXutil.ltrim( localUtil.ntoc( AV46TFMADetColCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFMADETCOLCOD_TO", GXutil.ltrim( localUtil.ntoc( AV47TFMADetColCod_To, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFMADETMATCOD", GXutil.ltrim( localUtil.ntoc( AV48TFMADetMatCod, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFMADETMATCOD_TO", GXutil.ltrim( localUtil.ntoc( AV49TFMADetMatCod_To, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFMADETMATDSC", AV80TFMADetMatDsc);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFMADETMATDSC_SEL", AV81TFMADetMatDsc_Sel);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFMADETINTCOD", GXutil.ltrim( localUtil.ntoc( AV52TFMADetIntCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFMADETINTCOD_TO", GXutil.ltrim( localUtil.ntoc( AV53TFMADetIntCod_To, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFMADETINTDSC", AV82TFMADetIntDsc);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFMADETINTDSC_SEL", AV83TFMADetIntDsc_Sel);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFMADETMAQCOD", GXutil.rtrim( AV56TFMADetMaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFMADETMAQCOD_SEL", GXutil.rtrim( AV57TFMADetMaqCod_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFMADETMAQDSC", AV58TFMADetMaqDsc);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFMADETMAQDSC_SEL", AV59TFMADetMaqDsc_Sel);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFMADETTIPMCOD", GXutil.rtrim( AV60TFMADetTipMCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFMADETTIPMCOD_SEL", GXutil.rtrim( AV61TFMADetTipMCod_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFMADETTIPMDSC", AV62TFMADetTipMDsc);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFMADETTIPMDSC_SEL", AV63TFMADetTipMDsc_Sel);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFMADETDEFCOD", GXutil.ltrim( localUtil.ntoc( AV107TFMADetDefCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFMADETDEFCOD_TO", GXutil.ltrim( localUtil.ntoc( AV108TFMADetDefCod_To, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFMADETDEFDSC", AV109TFMADetDefDsc);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFMADETDEFDSC_SEL", AV110TFMADetDefDsc_Sel);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFMADETCATCOD", GXutil.ltrim( localUtil.ntoc( AV111TFMADetCatCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFMADETCATCOD_TO", GXutil.ltrim( localUtil.ntoc( AV112TFMADetCatCod_To, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFMADETCATDSC", AV113TFMADetCatDsc);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFMADETCATDSC_SEL", AV114TFMADetCatDsc_Sel);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFMADETHDR", GXutil.rtrim( AV116TFMADetHdr));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFMADETHDR_SEL", GXutil.rtrim( AV117TFMADetHdr_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFMADETKILPROD", GXutil.ltrim( localUtil.ntoc( AV64TFMADetKilProd, (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFMADETKILPROD_TO", GXutil.ltrim( localUtil.ntoc( AV65TFMADetKilProd_To, (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFMADETKILREO", GXutil.ltrim( localUtil.ntoc( AV66TFMADetKilReo, (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFMADETKILREO_TO", GXutil.ltrim( localUtil.ntoc( AV67TFMADetKilReo_To, (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFMADETKILTOT", GXutil.ltrim( localUtil.ntoc( AV93TFMADetKilTot, (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFMADETKILTOT_TO", GXutil.ltrim( localUtil.ntoc( AV94TFMADetKilTot_To, (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFMADETMETPROD", GXutil.ltrim( localUtil.ntoc( AV122TFMADetMetProd, (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFMADETMETPROD_TO", GXutil.ltrim( localUtil.ntoc( AV123TFMADetMetProd_To, (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFMADETMETREO", GXutil.ltrim( localUtil.ntoc( AV124TFMADetMetReo, (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFMADETMETREO_TO", GXutil.ltrim( localUtil.ntoc( AV125TFMADetMetReo_To, (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFMADETMETTOT", GXutil.ltrim( localUtil.ntoc( AV126TFMADetMetTot, (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFMADETMETTOT_TO", GXutil.ltrim( localUtil.ntoc( AV127TFMADetMetTot_To, (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vORDEREDBY", GXutil.ltrim( localUtil.ntoc( AV12OrderedBy, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, sPrefix+"vORDEREDDSC", AV13OrderedDsc);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMADETEMPRCOD", GXutil.rtrim( AV70MADetEmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCLICOD", GXutil.ltrim( localUtil.ntoc( AV71CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vARTCOD", GXutil.rtrim( AV72ArtCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vFORCOLNUM", GXutil.ltrim( localUtil.ntoc( AV73ForColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTIPMAQCODJSON", AV74TipMaqCodJSON);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vFECHAINICIO", localUtil.dtoc( AV75FechaInicio, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vFECHAFIN", localUtil.dtoc( AV76FechaFin, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMADETMAQCOD", GXutil.rtrim( AV115MADetMaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMADETDEFCOD", GXutil.ltrim( localUtil.ntoc( AV103MADetDefCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMADETCATCOD", GXutil.ltrim( localUtil.ntoc( AV104MADetCatCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMTKNUSU", GXutil.rtrim( AV105MTknUsu));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMTKN", AV106MTkn);
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vSDTMTOK", AV91sdtMTok);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vSDTMTOK", AV91sdtMTok);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vSDTMTOK", getSecureSignedToken( sPrefix, AV91sdtMTok));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vTIPMAQCODCOLLECTION", AV79TipMaqCodCollection);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vTIPMAQCODCOLLECTION", AV79TipMaqCodCollection);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTIPMAQCODCOLLECTION", getSecureSignedToken( sPrefix, AV79TipMaqCodCollection));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOTMADETKILPROD", GXutil.ltrim( localUtil.ntoc( AV87TotMADetKilProd, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTMADETKILPROD", getSecureSignedToken( sPrefix, localUtil.format( AV87TotMADetKilProd, "ZZZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOTMADETKILREO", GXutil.ltrim( localUtil.ntoc( AV89TotMADetKilReo, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTMADETKILREO", getSecureSignedToken( sPrefix, localUtil.format( AV89TotMADetKilReo, "ZZZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOTMADETKILTOT", GXutil.ltrim( localUtil.ntoc( AV120TotMADetKilTot, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTMADETKILTOT", getSecureSignedToken( sPrefix, localUtil.format( AV120TotMADetKilTot, "ZZZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOTMADETMETREO", GXutil.ltrim( localUtil.ntoc( AV128TotMADetMetReo, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTMADETMETREO", getSecureSignedToken( sPrefix, localUtil.format( AV128TotMADetMetReo, "ZZZZZZZZ9.99")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vGRIDSTATE", AV10GridState);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vGRIDSTATE", AV10GridState);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vVALORRECIBIDOVARIABLE", AV100ValorRecibidoVariable);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vVARIABLE", AV99Variable);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"MADETBARCO", GXutil.ltrim( localUtil.ntoc( A14666MADetBarCo, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"MADETBARRE", GXutil.ltrim( localUtil.ntoc( A14667MADetBarRe, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"MADETBARPA", GXutil.rtrim( A14668MADetBarPa));
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Infinitescrolling", GXutil.rtrim( Grid_empowerer_Infinitescrolling));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Hastitlesettings", GXutil.booltostr( Grid_empowerer_Hastitlesettings));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Hascolumnsselector", GXutil.booltostr( Grid_empowerer_Hascolumnsselector));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Activeeventkey", GXutil.rtrim( Ddo_grid_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Selectedvalue_get", GXutil.rtrim( Ddo_grid_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtextto_get", GXutil.rtrim( Ddo_grid_Filteredtextto_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtext_get", GXutil.rtrim( Ddo_grid_Filteredtext_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Selectedcolumn", GXutil.rtrim( Ddo_grid_Selectedcolumn));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Columnsselectorvalues", GXutil.rtrim( Ddo_gridcolumnsselector_Columnsselectorvalues));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_MANAGEFILTERS_Activeeventkey", GXutil.rtrim( Ddo_managefilters_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Activeeventkey", GXutil.rtrim( Ddo_grid_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Selectedvalue_get", GXutil.rtrim( Ddo_grid_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtextto_get", GXutil.rtrim( Ddo_grid_Filteredtextto_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtext_get", GXutil.rtrim( Ddo_grid_Filteredtext_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Selectedcolumn", GXutil.rtrim( Ddo_grid_Selectedcolumn));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Columnsselectorvalues", GXutil.rtrim( Ddo_gridcolumnsselector_Columnsselectorvalues));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_MANAGEFILTERS_Activeeventkey", GXutil.rtrim( Ddo_managefilters_Activeeventkey));
   }

   public void renderHtmlCloseForm2DR2( )
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
      return "AnticipacionErrores.MAnt_Detalle" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( " MADet", "") ;
   }

   public void wb2DR0( )
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
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "app.anticipacionerrores.mant_detalle");
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group ActionGroupGrouped", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 17,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexport_Internalname, "gx.evt.setGridEvt("+GXutil.str( 39, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCaption", ""), bttBtnexport_Jsonclick, 5, httpContext.getMessage( "WWP_ExportTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOEXPORT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_AnticipacionErrores\\MAnt_Detalle.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "hidden-xs" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtneditcolumns_Internalname, "gx.evt.setGridEvt("+GXutil.str( 39, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_EditColumnsCaption", ""), bttBtneditcolumns_Jsonclick, 0, httpContext.getMessage( "WWP_EditColumnsTooltip", ""), "", StyleString, ClassString, 1, 0, "standard", "'"+sPrefix+"'"+",false,"+"'"+""+"'", TempTags, "", httpContext.getButtonType( ), "HLP_AnticipacionErrores\\MAnt_Detalle.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         wb_table1_21_2DR2( true) ;
      }
      else
      {
         wb_table1_21_2DR2( false) ;
      }
      return  ;
   }

   public void wb_table1_21_2DR2e( boolean wbgen )
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
         app.GxWebStd.gx_div_start( httpContext, divGridtablewithtotalizers_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /*  Grid Control  */
         GridContainer.SetWrapped(nGXWrapped);
         startgridcontrol39( ) ;
      }
      if ( wbEnd == 39 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_39 = (int)(nGXsfl_39_idx-1) ;
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "</table>") ;
            httpContext.writeText( "</div>") ;
         }
         else
         {
            GridContainer.AddObjectProperty("GRID_nEOF", GRID_nEOF);
            GridContainer.AddObjectProperty("GRID_nFirstRecordOnPage", GRID_nFirstRecordOnPage);
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
         wb_table2_73_2DR2( true) ;
      }
      else
      {
         wb_table2_73_2DR2( false) ;
      }
      return  ;
   }

   public void wb_table2_73_2DR2e( boolean wbgen )
   {
      if ( wbgen )
      {
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV132Pgmname), GXutil.rtrim( localUtil.format( AV132Pgmname, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_AnticipacionErrores\\MAnt_Detalle.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "Right", "top", "div");
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
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV68DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, sPrefix+"DDO_GRIDContainer");
         /* User Defined Control */
         ucDdo_gridcolumnsselector.setProperty("Caption", Ddo_gridcolumnsselector_Caption);
         ucDdo_gridcolumnsselector.setProperty("Tooltip", Ddo_gridcolumnsselector_Tooltip);
         ucDdo_gridcolumnsselector.setProperty("Cls", Ddo_gridcolumnsselector_Cls);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsType", Ddo_gridcolumnsselector_Dropdownoptionstype);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsTitleSettingsIcons", AV68DDO_TitleSettingsIcons);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsData", AV20ColumnsSelector);
         ucDdo_gridcolumnsselector.render(context, "dvelop.gxbootstrap.ddogridcolumnsselector", Ddo_gridcolumnsselector_Internalname, sPrefix+"DDO_GRIDCOLUMNSSELECTORContainer");
         /* User Defined Control */
         ucGrid_empowerer.setProperty("InfiniteScrolling", Grid_empowerer_Infinitescrolling);
         ucGrid_empowerer.setProperty("HasTitleSettings", Grid_empowerer_Hastitlesettings);
         ucGrid_empowerer.setProperty("HasColumnsSelector", Grid_empowerer_Hascolumnsselector);
         ucGrid_empowerer.render(context, "wwp.gridempowerer", Grid_empowerer_Internalname, sPrefix+"GRID_EMPOWERERContainer");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDdo_madetfecauxdates_Internalname, 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 127,'" + sPrefix + "',false,'" + sGXsfl_39_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDdo_madetfecauxdate_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDdo_madetfecauxdate_Internalname, localUtil.format(AV30DDO_MADetFecAuxDate, "99/99/99"), localUtil.format( AV30DDO_MADetFecAuxDate, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,127);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDdo_madetfecauxdate_Jsonclick, 0, "Attribute", "", "", "", "", 1, 1, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_AnticipacionErrores\\MAnt_Detalle.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDdo_madetfecauxdate_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(1==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_AnticipacionErrores\\MAnt_Detalle.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      if ( wbEnd == 39 )
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
               GridContainer.AddObjectProperty("GRID_nEOF", GRID_nEOF);
               GridContainer.AddObjectProperty("GRID_nFirstRecordOnPage", GRID_nFirstRecordOnPage);
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

   public void start2DR2( )
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
            Form.getMeta().addItem("description", httpContext.getMessage( " MADet", ""), (short)(0)) ;
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
            strup2DR0( ) ;
         }
      }
   }

   public void ws2DR2( )
   {
      start2DR2( ) ;
      evt2DR2( ) ;
   }

   public void evt2DR2( )
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
                              strup2DR0( ) ;
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
                              strup2DR0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e112DR2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRID.ONOPTIONCLICKED") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup2DR0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e122DR2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup2DR0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e132DR2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORT'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup2DR0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoExport' */
                                 e142DR2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GLOBALEVENTS.REFRESHGRID") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup2DR0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e152DR2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup2DR0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 GX_FocusControl = edtavFilterfulltext_Internalname ;
                                 httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGING") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup2DR0( ) ;
                           }
                           AV137Anticipacionerrores_mant_detalleds_1_filterfulltext = AV15FilterFullText ;
                           AV138Anticipacionerrores_mant_detalleds_2_tfmadetfec = AV28TFMADetFec ;
                           AV139Anticipacionerrores_mant_detalleds_3_tfmadetemprcod = AV32TFMADetEmprCod ;
                           AV140Anticipacionerrores_mant_detalleds_4_tfmadetemprcod_sel = AV33TFMADetEmprCod_Sel ;
                           AV141Anticipacionerrores_mant_detalleds_5_tfmadetclicod = AV34TFMADetCliCod ;
                           AV142Anticipacionerrores_mant_detalleds_6_tfmadetclicod_to = AV35TFMADetCliCod_To ;
                           AV143Anticipacionerrores_mant_detalleds_7_tfmadetclinom = AV36TFMADetCliNom ;
                           AV144Anticipacionerrores_mant_detalleds_8_tfmadetclinom_sel = AV37TFMADetCliNom_Sel ;
                           AV145Anticipacionerrores_mant_detalleds_9_tfmadetartcod = AV38TFMADetArtCod ;
                           AV146Anticipacionerrores_mant_detalleds_10_tfmadetartcod_sel = AV39TFMADetArtCod_Sel ;
                           AV147Anticipacionerrores_mant_detalleds_11_tfmadetartdsc = AV77TFMADetArtDsc ;
                           AV148Anticipacionerrores_mant_detalleds_12_tfmadetartdsc_sel = AV78TFMADetArtDsc_Sel ;
                           AV149Anticipacionerrores_mant_detalleds_13_tfmadetcolnum = AV44TFMADetColNum ;
                           AV150Anticipacionerrores_mant_detalleds_14_tfmadetcolnum_to = AV45TFMADetColNum_To ;
                           AV151Anticipacionerrores_mant_detalleds_15_tfmadetcolnom = AV42TFMADetColNom ;
                           AV152Anticipacionerrores_mant_detalleds_16_tfmadetcolnom_sel = AV43TFMADetColNom_Sel ;
                           AV153Anticipacionerrores_mant_detalleds_17_tfmadetcolcod = AV46TFMADetColCod ;
                           AV154Anticipacionerrores_mant_detalleds_18_tfmadetcolcod_to = AV47TFMADetColCod_To ;
                           AV155Anticipacionerrores_mant_detalleds_19_tfmadetmatcod = AV48TFMADetMatCod ;
                           AV156Anticipacionerrores_mant_detalleds_20_tfmadetmatcod_to = AV49TFMADetMatCod_To ;
                           AV157Anticipacionerrores_mant_detalleds_21_tfmadetmatdsc = AV80TFMADetMatDsc ;
                           AV158Anticipacionerrores_mant_detalleds_22_tfmadetmatdsc_sel = AV81TFMADetMatDsc_Sel ;
                           AV159Anticipacionerrores_mant_detalleds_23_tfmadetintcod = AV52TFMADetIntCod ;
                           AV160Anticipacionerrores_mant_detalleds_24_tfmadetintcod_to = AV53TFMADetIntCod_To ;
                           AV161Anticipacionerrores_mant_detalleds_25_tfmadetintdsc = AV82TFMADetIntDsc ;
                           AV162Anticipacionerrores_mant_detalleds_26_tfmadetintdsc_sel = AV83TFMADetIntDsc_Sel ;
                           AV163Anticipacionerrores_mant_detalleds_27_tfmadetmaqcod = AV56TFMADetMaqCod ;
                           AV164Anticipacionerrores_mant_detalleds_28_tfmadetmaqcod_sel = AV57TFMADetMaqCod_Sel ;
                           AV165Anticipacionerrores_mant_detalleds_29_tfmadetmaqdsc = AV58TFMADetMaqDsc ;
                           AV166Anticipacionerrores_mant_detalleds_30_tfmadetmaqdsc_sel = AV59TFMADetMaqDsc_Sel ;
                           AV167Anticipacionerrores_mant_detalleds_31_tfmadettipmcod = AV60TFMADetTipMCod ;
                           AV168Anticipacionerrores_mant_detalleds_32_tfmadettipmcod_sel = AV61TFMADetTipMCod_Sel ;
                           AV169Anticipacionerrores_mant_detalleds_33_tfmadettipmdsc = AV62TFMADetTipMDsc ;
                           AV170Anticipacionerrores_mant_detalleds_34_tfmadettipmdsc_sel = AV63TFMADetTipMDsc_Sel ;
                           AV171Anticipacionerrores_mant_detalleds_35_tfmadetdefcod = AV107TFMADetDefCod ;
                           AV172Anticipacionerrores_mant_detalleds_36_tfmadetdefcod_to = AV108TFMADetDefCod_To ;
                           AV173Anticipacionerrores_mant_detalleds_37_tfmadetdefdsc = AV109TFMADetDefDsc ;
                           AV174Anticipacionerrores_mant_detalleds_38_tfmadetdefdsc_sel = AV110TFMADetDefDsc_Sel ;
                           AV175Anticipacionerrores_mant_detalleds_39_tfmadetcatcod = AV111TFMADetCatCod ;
                           AV176Anticipacionerrores_mant_detalleds_40_tfmadetcatcod_to = AV112TFMADetCatCod_To ;
                           AV177Anticipacionerrores_mant_detalleds_41_tfmadetcatdsc = AV113TFMADetCatDsc ;
                           AV178Anticipacionerrores_mant_detalleds_42_tfmadetcatdsc_sel = AV114TFMADetCatDsc_Sel ;
                           AV179Anticipacionerrores_mant_detalleds_43_tfmadethdr = AV116TFMADetHdr ;
                           AV180Anticipacionerrores_mant_detalleds_44_tfmadethdr_sel = AV117TFMADetHdr_Sel ;
                           AV181Anticipacionerrores_mant_detalleds_45_tfmadetkilprod = AV64TFMADetKilProd ;
                           AV182Anticipacionerrores_mant_detalleds_46_tfmadetkilprod_to = AV65TFMADetKilProd_To ;
                           AV183Anticipacionerrores_mant_detalleds_47_tfmadetkilreo = AV66TFMADetKilReo ;
                           AV184Anticipacionerrores_mant_detalleds_48_tfmadetkilreo_to = AV67TFMADetKilReo_To ;
                           AV185Anticipacionerrores_mant_detalleds_49_tfmadetkiltot = AV93TFMADetKilTot ;
                           AV186Anticipacionerrores_mant_detalleds_50_tfmadetkiltot_to = AV94TFMADetKilTot_To ;
                           AV187Anticipacionerrores_mant_detalleds_51_tfmadetmetprod = AV122TFMADetMetProd ;
                           AV188Anticipacionerrores_mant_detalleds_52_tfmadetmetprod_to = AV123TFMADetMetProd_To ;
                           AV189Anticipacionerrores_mant_detalleds_53_tfmadetmetreo = AV124TFMADetMetReo ;
                           AV190Anticipacionerrores_mant_detalleds_54_tfmadetmetreo_to = AV125TFMADetMetReo_To ;
                           AV191Anticipacionerrores_mant_detalleds_55_tfmadetmettot = AV126TFMADetMetTot ;
                           AV192Anticipacionerrores_mant_detalleds_56_tfmadetmettot_to = AV127TFMADetMetTot_To ;
                           sEvt = httpContext.cgiGet( sPrefix+"GRIDPAGING") ;
                           if ( GXutil.strcmp(sEvt, "FIRST") == 0 )
                           {
                              subgrid_firstpage( ) ;
                           }
                           else if ( GXutil.strcmp(sEvt, "PREV") == 0 )
                           {
                              subgrid_previouspage( ) ;
                           }
                           else if ( GXutil.strcmp(sEvt, "NEXT") == 0 )
                           {
                              subgrid_nextpage( ) ;
                           }
                           else if ( GXutil.strcmp(sEvt, "LAST") == 0 )
                           {
                              subgrid_lastpage( ) ;
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
                              strup2DR0( ) ;
                           }
                           nGXsfl_39_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_39_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_39_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_392( ) ;
                           A14582MADetId = localUtil.ctol( httpContext.cgiGet( edtMADetId_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
                           A14586MADetFec = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtMADetFec_Internalname), 0)) ;
                           A14587MADetEmprC = httpContext.cgiGet( edtMADetEmprC_Internalname) ;
                           A14585MADetCliCo = (int)(localUtil.ctol( httpContext.cgiGet( edtMADetCliCo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A14651MADetCliNo = httpContext.cgiGet( edtMADetCliNo_Internalname) ;
                           n14651MADetCliNo = false ;
                           A14588MADetArtCo = httpContext.cgiGet( edtMADetArtCo_Internalname) ;
                           A14652MADetArtDs = httpContext.cgiGet( edtMADetArtDs_Internalname) ;
                           n14652MADetArtDs = false ;
                           A14589MADetColNu = (int)(localUtil.ctol( httpContext.cgiGet( edtMADetColNu_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A14653MADetColNo = httpContext.cgiGet( edtMADetColNo_Internalname) ;
                           A14654MADetColCo = (byte)(localUtil.ctol( httpContext.cgiGet( edtMADetColCo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A14592MADetMatCo = (short)(localUtil.ctol( httpContext.cgiGet( edtMADetMatCo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A14655MADetMatDs = httpContext.cgiGet( edtMADetMatDs_Internalname) ;
                           n14655MADetMatDs = false ;
                           A14593MADetIntCo = (byte)(localUtil.ctol( httpContext.cgiGet( edtMADetIntCo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A14660MADetIntDs = httpContext.cgiGet( edtMADetIntDs_Internalname) ;
                           n14660MADetIntDs = false ;
                           A14591MADetMaqCo = httpContext.cgiGet( edtMADetMaqCo_Internalname) ;
                           A14656MADetMaqDs = httpContext.cgiGet( edtMADetMaqDs_Internalname) ;
                           n14656MADetMaqDs = false ;
                           A14590MADetTipMC = httpContext.cgiGet( edtMADetTipMC_Internalname) ;
                           A14657MADetTipMD = httpContext.cgiGet( edtMADetTipMD_Internalname) ;
                           n14657MADetTipMD = false ;
                           A14662MADetDefCo = (short)(localUtil.ctol( httpContext.cgiGet( edtMADetDefCo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           n14662MADetDefCo = false ;
                           A14663MADetDefDs = httpContext.cgiGet( edtMADetDefDs_Internalname) ;
                           n14663MADetDefDs = false ;
                           A14664MADetCatCo = (short)(localUtil.ctol( httpContext.cgiGet( edtMADetCatCo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           n14664MADetCatCo = false ;
                           A14665MADetCatDs = httpContext.cgiGet( edtMADetCatDs_Internalname) ;
                           n14665MADetCatDs = false ;
                           A14669MADetHdr = httpContext.cgiGet( edtMADetHdr_Internalname) ;
                           A14658MADetKilPr = localUtil.ctond( httpContext.cgiGet( edtMADetKilPr_Internalname)) ;
                           n14658MADetKilPr = false ;
                           A14659MADetKilRe = localUtil.ctond( httpContext.cgiGet( edtMADetKilRe_Internalname)) ;
                           A14661MADetKilTo = localUtil.ctond( httpContext.cgiGet( edtMADetKilTo_Internalname)) ;
                           A14670MADetMetPr = localUtil.ctond( httpContext.cgiGet( edtMADetMetPr_Internalname)) ;
                           n14670MADetMetPr = false ;
                           A14671MADetMetRe = localUtil.ctond( httpContext.cgiGet( edtMADetMetRe_Internalname)) ;
                           n14671MADetMetRe = false ;
                           A14672MADetMetTo = localUtil.ctond( httpContext.cgiGet( edtMADetMetTo_Internalname)) ;
                           n14672MADetMetTo = false ;
                           A14584MADetUsu = httpContext.cgiGet( edtMADetUsu_Internalname) ;
                           A14583MADetTkn = httpContext.cgiGet( edtMADetTkn_Internalname) ;
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
                                       GX_FocusControl = edtavFilterfulltext_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       /* Execute user event: Start */
                                       e162DR2 ();
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
                                       GX_FocusControl = edtavFilterfulltext_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       /* Execute user event: Refresh */
                                       e172DR2 ();
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
                                       GX_FocusControl = edtavFilterfulltext_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       e182DR2 ();
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
                                          if ( GXutil.strcmp(httpContext.cgiGet( sPrefix+"GXH_vFILTERFULLTEXT"), AV15FilterFullText) != 0 )
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
                                    strup2DR0( ) ;
                                 }
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       dynload_actions( ) ;
                                       GX_FocusControl = edtavFilterfulltext_Internalname ;
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

   public void we2DR2( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm2DR2( ) ;
         }
      }
   }

   public void pa2DR2( )
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
      subsflControlProps_392( ) ;
      while ( nGXsfl_39_idx <= nRC_GXsfl_39 )
      {
         sendrow_392( ) ;
         nGXsfl_39_idx = ((subGrid_Islastpage==1)&&(nGXsfl_39_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_39_idx+1) ;
         sGXsfl_39_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_39_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_392( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 String AV15FilterFullText ,
                                 String AV70MADetEmprCod ,
                                 int AV71CliCod ,
                                 String AV72ArtCod ,
                                 int AV73ForColNum ,
                                 String AV115MADetMaqCod ,
                                 short AV103MADetDefCod ,
                                 short AV104MADetCatCod ,
                                 GXSimpleCollection<String> AV79TipMaqCodCollection ,
                                 app.anticipacionerrores.SdtsdtMTok AV91sdtMTok ,
                                 byte AV25ManageFiltersExecutionStep ,
                                 app.wwpbaseobjects.SdtWWPColumnsSelector AV20ColumnsSelector ,
                                 java.util.Date AV28TFMADetFec ,
                                 String AV32TFMADetEmprCod ,
                                 String AV33TFMADetEmprCod_Sel ,
                                 int AV34TFMADetCliCod ,
                                 int AV35TFMADetCliCod_To ,
                                 String AV36TFMADetCliNom ,
                                 String AV37TFMADetCliNom_Sel ,
                                 String AV38TFMADetArtCod ,
                                 String AV39TFMADetArtCod_Sel ,
                                 String AV77TFMADetArtDsc ,
                                 String AV78TFMADetArtDsc_Sel ,
                                 int AV44TFMADetColNum ,
                                 int AV45TFMADetColNum_To ,
                                 String AV42TFMADetColNom ,
                                 String AV43TFMADetColNom_Sel ,
                                 byte AV46TFMADetColCod ,
                                 byte AV47TFMADetColCod_To ,
                                 short AV48TFMADetMatCod ,
                                 short AV49TFMADetMatCod_To ,
                                 String AV80TFMADetMatDsc ,
                                 String AV81TFMADetMatDsc_Sel ,
                                 byte AV52TFMADetIntCod ,
                                 byte AV53TFMADetIntCod_To ,
                                 String AV82TFMADetIntDsc ,
                                 String AV83TFMADetIntDsc_Sel ,
                                 String AV56TFMADetMaqCod ,
                                 String AV57TFMADetMaqCod_Sel ,
                                 String AV58TFMADetMaqDsc ,
                                 String AV59TFMADetMaqDsc_Sel ,
                                 String AV60TFMADetTipMCod ,
                                 String AV61TFMADetTipMCod_Sel ,
                                 String AV62TFMADetTipMDsc ,
                                 String AV63TFMADetTipMDsc_Sel ,
                                 short AV107TFMADetDefCod ,
                                 short AV108TFMADetDefCod_To ,
                                 String AV109TFMADetDefDsc ,
                                 String AV110TFMADetDefDsc_Sel ,
                                 short AV111TFMADetCatCod ,
                                 short AV112TFMADetCatCod_To ,
                                 String AV113TFMADetCatDsc ,
                                 String AV114TFMADetCatDsc_Sel ,
                                 String AV116TFMADetHdr ,
                                 String AV117TFMADetHdr_Sel ,
                                 java.math.BigDecimal AV64TFMADetKilProd ,
                                 java.math.BigDecimal AV65TFMADetKilProd_To ,
                                 java.math.BigDecimal AV66TFMADetKilReo ,
                                 java.math.BigDecimal AV67TFMADetKilReo_To ,
                                 java.math.BigDecimal AV93TFMADetKilTot ,
                                 java.math.BigDecimal AV94TFMADetKilTot_To ,
                                 java.math.BigDecimal AV122TFMADetMetProd ,
                                 java.math.BigDecimal AV123TFMADetMetProd_To ,
                                 java.math.BigDecimal AV124TFMADetMetReo ,
                                 java.math.BigDecimal AV125TFMADetMetReo_To ,
                                 java.math.BigDecimal AV126TFMADetMetTot ,
                                 java.math.BigDecimal AV127TFMADetMetTot_To ,
                                 String AV132Pgmname ,
                                 short AV12OrderedBy ,
                                 boolean AV13OrderedDsc ,
                                 String AV74TipMaqCodJSON ,
                                 java.util.Date AV75FechaInicio ,
                                 java.util.Date AV76FechaFin ,
                                 String AV105MTknUsu ,
                                 String AV106MTkn ,
                                 java.math.BigDecimal AV87TotMADetKilProd ,
                                 java.math.BigDecimal AV89TotMADetKilReo ,
                                 java.math.BigDecimal AV120TotMADetKilTot ,
                                 java.math.BigDecimal AV128TotMADetMetReo ,
                                 String sPrefix )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e172DR2 ();
      GRID_nCurrentRecord = 0 ;
      rf2DR2( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"MAnt_Detalle");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV132Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("anticipacionerrores\\mant_detalle:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
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
      GRID_nFirstRecordOnPage = 0 ;
      GRID_nCurrentRecord = 0 ;
      GXCCtl = "GRID_nFirstRecordOnPage_" + sGXsfl_39_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+GXCCtl, GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      send_integrity_hashes( ) ;
      rf2DR2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV132Pgmname = "AnticipacionErrores.MAnt_Detalle" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV132Pgmname", AV132Pgmname);
      Gx_err = (short)(0) ;
      edtavTotvaluemadetfec_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvaluemadetfec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluemadetfec_Enabled), 5, 0), true);
      edtavTotvaluemadetkilprod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvaluemadetkilprod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluemadetkilprod_Enabled), 5, 0), true);
      edtavTotvaluemadetkilreo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvaluemadetkilreo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluemadetkilreo_Enabled), 5, 0), true);
      edtavTotvaluemadetkiltot_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvaluemadetkiltot_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluemadetkiltot_Enabled), 5, 0), true);
      edtavTotvaluemadetmetreo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvaluemadetmetreo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluemadetmetreo_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void rf2DR2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(39) ;
      /* Execute user event: Refresh */
      e172DR2 ();
      nGXsfl_39_idx = (int)(1+GRID_nFirstRecordOnPage) ;
      sGXsfl_39_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_39_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_392( ) ;
      bGXsfl_39_Refreshing = true ;
      GridContainer.AddObjectProperty("GridName", "Grid");
      GridContainer.AddObjectProperty("CmpContext", sPrefix);
      GridContainer.AddObjectProperty("InMasterPage", "false");
      GridContainer.AddObjectProperty("Class", "GridWithTotalizer GridNoBorder WorkWith");
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
         subsflControlProps_392( ) ;
         GXPagingFrom2 = (int)(((subGrid_Rows==0) ? 1 : GRID_nFirstRecordOnPage+1)) ;
         GXPagingTo2 = (int)(((subGrid_Rows==0) ? 10000 : GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )+1)) ;
         pr_default.dynParam(0, new Object[]{ new Object[]{
                                              A14590MADetTipMC ,
                                              AV79TipMaqCodCollection ,
                                              AV137Anticipacionerrores_mant_detalleds_1_filterfulltext ,
                                              AV138Anticipacionerrores_mant_detalleds_2_tfmadetfec ,
                                              AV140Anticipacionerrores_mant_detalleds_4_tfmadetemprcod_sel ,
                                              AV139Anticipacionerrores_mant_detalleds_3_tfmadetemprcod ,
                                              Integer.valueOf(AV141Anticipacionerrores_mant_detalleds_5_tfmadetclicod) ,
                                              Integer.valueOf(AV142Anticipacionerrores_mant_detalleds_6_tfmadetclicod_to) ,
                                              AV144Anticipacionerrores_mant_detalleds_8_tfmadetclinom_sel ,
                                              AV143Anticipacionerrores_mant_detalleds_7_tfmadetclinom ,
                                              AV146Anticipacionerrores_mant_detalleds_10_tfmadetartcod_sel ,
                                              AV145Anticipacionerrores_mant_detalleds_9_tfmadetartcod ,
                                              AV148Anticipacionerrores_mant_detalleds_12_tfmadetartdsc_sel ,
                                              AV147Anticipacionerrores_mant_detalleds_11_tfmadetartdsc ,
                                              Integer.valueOf(AV149Anticipacionerrores_mant_detalleds_13_tfmadetcolnum) ,
                                              Integer.valueOf(AV150Anticipacionerrores_mant_detalleds_14_tfmadetcolnum_to) ,
                                              AV152Anticipacionerrores_mant_detalleds_16_tfmadetcolnom_sel ,
                                              AV151Anticipacionerrores_mant_detalleds_15_tfmadetcolnom ,
                                              Byte.valueOf(AV153Anticipacionerrores_mant_detalleds_17_tfmadetcolcod) ,
                                              Byte.valueOf(AV154Anticipacionerrores_mant_detalleds_18_tfmadetcolcod_to) ,
                                              Short.valueOf(AV155Anticipacionerrores_mant_detalleds_19_tfmadetmatcod) ,
                                              Short.valueOf(AV156Anticipacionerrores_mant_detalleds_20_tfmadetmatcod_to) ,
                                              AV158Anticipacionerrores_mant_detalleds_22_tfmadetmatdsc_sel ,
                                              AV157Anticipacionerrores_mant_detalleds_21_tfmadetmatdsc ,
                                              Byte.valueOf(AV159Anticipacionerrores_mant_detalleds_23_tfmadetintcod) ,
                                              Byte.valueOf(AV160Anticipacionerrores_mant_detalleds_24_tfmadetintcod_to) ,
                                              AV162Anticipacionerrores_mant_detalleds_26_tfmadetintdsc_sel ,
                                              AV161Anticipacionerrores_mant_detalleds_25_tfmadetintdsc ,
                                              AV164Anticipacionerrores_mant_detalleds_28_tfmadetmaqcod_sel ,
                                              AV163Anticipacionerrores_mant_detalleds_27_tfmadetmaqcod ,
                                              AV166Anticipacionerrores_mant_detalleds_30_tfmadetmaqdsc_sel ,
                                              AV165Anticipacionerrores_mant_detalleds_29_tfmadetmaqdsc ,
                                              AV168Anticipacionerrores_mant_detalleds_32_tfmadettipmcod_sel ,
                                              AV167Anticipacionerrores_mant_detalleds_31_tfmadettipmcod ,
                                              AV170Anticipacionerrores_mant_detalleds_34_tfmadettipmdsc_sel ,
                                              AV169Anticipacionerrores_mant_detalleds_33_tfmadettipmdsc ,
                                              Short.valueOf(AV171Anticipacionerrores_mant_detalleds_35_tfmadetdefcod) ,
                                              Short.valueOf(AV172Anticipacionerrores_mant_detalleds_36_tfmadetdefcod_to) ,
                                              AV174Anticipacionerrores_mant_detalleds_38_tfmadetdefdsc_sel ,
                                              AV173Anticipacionerrores_mant_detalleds_37_tfmadetdefdsc ,
                                              Short.valueOf(AV175Anticipacionerrores_mant_detalleds_39_tfmadetcatcod) ,
                                              Short.valueOf(AV176Anticipacionerrores_mant_detalleds_40_tfmadetcatcod_to) ,
                                              AV178Anticipacionerrores_mant_detalleds_42_tfmadetcatdsc_sel ,
                                              AV177Anticipacionerrores_mant_detalleds_41_tfmadetcatdsc ,
                                              AV180Anticipacionerrores_mant_detalleds_44_tfmadethdr_sel ,
                                              AV179Anticipacionerrores_mant_detalleds_43_tfmadethdr ,
                                              AV181Anticipacionerrores_mant_detalleds_45_tfmadetkilprod ,
                                              AV182Anticipacionerrores_mant_detalleds_46_tfmadetkilprod_to ,
                                              AV183Anticipacionerrores_mant_detalleds_47_tfmadetkilreo ,
                                              AV184Anticipacionerrores_mant_detalleds_48_tfmadetkilreo_to ,
                                              AV185Anticipacionerrores_mant_detalleds_49_tfmadetkiltot ,
                                              AV186Anticipacionerrores_mant_detalleds_50_tfmadetkiltot_to ,
                                              AV187Anticipacionerrores_mant_detalleds_51_tfmadetmetprod ,
                                              AV188Anticipacionerrores_mant_detalleds_52_tfmadetmetprod_to ,
                                              AV189Anticipacionerrores_mant_detalleds_53_tfmadetmetreo ,
                                              AV190Anticipacionerrores_mant_detalleds_54_tfmadetmetreo_to ,
                                              AV191Anticipacionerrores_mant_detalleds_55_tfmadetmettot ,
                                              AV192Anticipacionerrores_mant_detalleds_56_tfmadetmettot_to ,
                                              AV72ArtCod ,
                                              Integer.valueOf(AV73ForColNum) ,
                                              AV115MADetMaqCod ,
                                              Integer.valueOf(AV79TipMaqCodCollection.size()) ,
                                              Short.valueOf(AV103MADetDefCod) ,
                                              Short.valueOf(AV104MADetCatCod) ,
                                              A14587MADetEmprC ,
                                              Integer.valueOf(A14585MADetCliCo) ,
                                              A14651MADetCliNo ,
                                              A14588MADetArtCo ,
                                              A14652MADetArtDs ,
                                              Integer.valueOf(A14589MADetColNu) ,
                                              A14653MADetColNo ,
                                              Byte.valueOf(A14654MADetColCo) ,
                                              Short.valueOf(A14592MADetMatCo) ,
                                              A14655MADetMatDs ,
                                              Byte.valueOf(A14593MADetIntCo) ,
                                              A14660MADetIntDs ,
                                              A14591MADetMaqCo ,
                                              A14656MADetMaqDs ,
                                              A14657MADetTipMD ,
                                              Short.valueOf(A14662MADetDefCo) ,
                                              A14663MADetDefDs ,
                                              Short.valueOf(A14664MADetCatCo) ,
                                              A14665MADetCatDs ,
                                              Integer.valueOf(A14666MADetBarCo) ,
                                              Byte.valueOf(A14667MADetBarRe) ,
                                              A14668MADetBarPa ,
                                              A14658MADetKilPr ,
                                              A14659MADetKilRe ,
                                              A14661MADetKilTo ,
                                              A14670MADetMetPr ,
                                              A14671MADetMetRe ,
                                              A14672MADetMetTo ,
                                              A14586MADetFec ,
                                              Short.valueOf(AV12OrderedBy) ,
                                              Boolean.valueOf(AV13OrderedDsc) ,
                                              AV70MADetEmprCod ,
                                              AV91sdtMTok.getgxTv_SdtsdtMTok_Mtkn() ,
                                              AV91sdtMTok.getgxTv_SdtsdtMTok_Mtknusu() ,
                                              Integer.valueOf(AV71CliCod) ,
                                              A14583MADetTkn ,
                                              A14584MADetUsu } ,
                                              new int[]{
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.SHORT,
                                              TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT,
                                              TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                              TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING,
                                              TypeConstants.INT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                              TypeConstants.INT, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN,
                                              TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                              TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING
                                              }
         });
         lV137Anticipacionerrores_mant_detalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV137Anticipacionerrores_mant_detalleds_1_filterfulltext), "%", "") ;
         lV137Anticipacionerrores_mant_detalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV137Anticipacionerrores_mant_detalleds_1_filterfulltext), "%", "") ;
         lV137Anticipacionerrores_mant_detalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV137Anticipacionerrores_mant_detalleds_1_filterfulltext), "%", "") ;
         lV137Anticipacionerrores_mant_detalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV137Anticipacionerrores_mant_detalleds_1_filterfulltext), "%", "") ;
         lV137Anticipacionerrores_mant_detalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV137Anticipacionerrores_mant_detalleds_1_filterfulltext), "%", "") ;
         lV137Anticipacionerrores_mant_detalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV137Anticipacionerrores_mant_detalleds_1_filterfulltext), "%", "") ;
         lV137Anticipacionerrores_mant_detalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV137Anticipacionerrores_mant_detalleds_1_filterfulltext), "%", "") ;
         lV137Anticipacionerrores_mant_detalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV137Anticipacionerrores_mant_detalleds_1_filterfulltext), "%", "") ;
         lV137Anticipacionerrores_mant_detalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV137Anticipacionerrores_mant_detalleds_1_filterfulltext), "%", "") ;
         lV137Anticipacionerrores_mant_detalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV137Anticipacionerrores_mant_detalleds_1_filterfulltext), "%", "") ;
         lV137Anticipacionerrores_mant_detalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV137Anticipacionerrores_mant_detalleds_1_filterfulltext), "%", "") ;
         lV137Anticipacionerrores_mant_detalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV137Anticipacionerrores_mant_detalleds_1_filterfulltext), "%", "") ;
         lV137Anticipacionerrores_mant_detalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV137Anticipacionerrores_mant_detalleds_1_filterfulltext), "%", "") ;
         lV137Anticipacionerrores_mant_detalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV137Anticipacionerrores_mant_detalleds_1_filterfulltext), "%", "") ;
         lV137Anticipacionerrores_mant_detalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV137Anticipacionerrores_mant_detalleds_1_filterfulltext), "%", "") ;
         lV137Anticipacionerrores_mant_detalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV137Anticipacionerrores_mant_detalleds_1_filterfulltext), "%", "") ;
         lV137Anticipacionerrores_mant_detalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV137Anticipacionerrores_mant_detalleds_1_filterfulltext), "%", "") ;
         lV137Anticipacionerrores_mant_detalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV137Anticipacionerrores_mant_detalleds_1_filterfulltext), "%", "") ;
         lV137Anticipacionerrores_mant_detalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV137Anticipacionerrores_mant_detalleds_1_filterfulltext), "%", "") ;
         lV137Anticipacionerrores_mant_detalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV137Anticipacionerrores_mant_detalleds_1_filterfulltext), "%", "") ;
         lV137Anticipacionerrores_mant_detalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV137Anticipacionerrores_mant_detalleds_1_filterfulltext), "%", "") ;
         lV137Anticipacionerrores_mant_detalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV137Anticipacionerrores_mant_detalleds_1_filterfulltext), "%", "") ;
         lV137Anticipacionerrores_mant_detalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV137Anticipacionerrores_mant_detalleds_1_filterfulltext), "%", "") ;
         lV137Anticipacionerrores_mant_detalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV137Anticipacionerrores_mant_detalleds_1_filterfulltext), "%", "") ;
         lV137Anticipacionerrores_mant_detalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV137Anticipacionerrores_mant_detalleds_1_filterfulltext), "%", "") ;
         lV137Anticipacionerrores_mant_detalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV137Anticipacionerrores_mant_detalleds_1_filterfulltext), "%", "") ;
         lV137Anticipacionerrores_mant_detalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV137Anticipacionerrores_mant_detalleds_1_filterfulltext), "%", "") ;
         lV139Anticipacionerrores_mant_detalleds_3_tfmadetemprcod = GXutil.padr( GXutil.rtrim( AV139Anticipacionerrores_mant_detalleds_3_tfmadetemprcod), 3, "%") ;
         lV143Anticipacionerrores_mant_detalleds_7_tfmadetclinom = GXutil.concat( GXutil.rtrim( AV143Anticipacionerrores_mant_detalleds_7_tfmadetclinom), "%", "") ;
         lV145Anticipacionerrores_mant_detalleds_9_tfmadetartcod = GXutil.padr( GXutil.rtrim( AV145Anticipacionerrores_mant_detalleds_9_tfmadetartcod), 16, "%") ;
         lV147Anticipacionerrores_mant_detalleds_11_tfmadetartdsc = GXutil.concat( GXutil.rtrim( AV147Anticipacionerrores_mant_detalleds_11_tfmadetartdsc), "%", "") ;
         lV151Anticipacionerrores_mant_detalleds_15_tfmadetcolnom = GXutil.padr( GXutil.rtrim( AV151Anticipacionerrores_mant_detalleds_15_tfmadetcolnom), 13, "%") ;
         lV157Anticipacionerrores_mant_detalleds_21_tfmadetmatdsc = GXutil.concat( GXutil.rtrim( AV157Anticipacionerrores_mant_detalleds_21_tfmadetmatdsc), "%", "") ;
         lV161Anticipacionerrores_mant_detalleds_25_tfmadetintdsc = GXutil.concat( GXutil.rtrim( AV161Anticipacionerrores_mant_detalleds_25_tfmadetintdsc), "%", "") ;
         lV163Anticipacionerrores_mant_detalleds_27_tfmadetmaqcod = GXutil.padr( GXutil.rtrim( AV163Anticipacionerrores_mant_detalleds_27_tfmadetmaqcod), 6, "%") ;
         lV165Anticipacionerrores_mant_detalleds_29_tfmadetmaqdsc = GXutil.concat( GXutil.rtrim( AV165Anticipacionerrores_mant_detalleds_29_tfmadetmaqdsc), "%", "") ;
         lV167Anticipacionerrores_mant_detalleds_31_tfmadettipmcod = GXutil.padr( GXutil.rtrim( AV167Anticipacionerrores_mant_detalleds_31_tfmadettipmcod), 4, "%") ;
         lV169Anticipacionerrores_mant_detalleds_33_tfmadettipmdsc = GXutil.concat( GXutil.rtrim( AV169Anticipacionerrores_mant_detalleds_33_tfmadettipmdsc), "%", "") ;
         lV173Anticipacionerrores_mant_detalleds_37_tfmadetdefdsc = GXutil.concat( GXutil.rtrim( AV173Anticipacionerrores_mant_detalleds_37_tfmadetdefdsc), "%", "") ;
         lV177Anticipacionerrores_mant_detalleds_41_tfmadetcatdsc = GXutil.concat( GXutil.rtrim( AV177Anticipacionerrores_mant_detalleds_41_tfmadetcatdsc), "%", "") ;
         lV179Anticipacionerrores_mant_detalleds_43_tfmadethdr = GXutil.padr( GXutil.rtrim( AV179Anticipacionerrores_mant_detalleds_43_tfmadethdr), 10, "%") ;
         /* Using cursor H02DR2 */
         pr_default.execute(0, new Object[] {AV91sdtMTok.getgxTv_SdtsdtMTok_Mtkn(), AV91sdtMTok.getgxTv_SdtsdtMTok_Mtknusu(), Integer.valueOf(AV71CliCod), AV70MADetEmprCod, lV137Anticipacionerrores_mant_detalleds_1_filterfulltext, lV137Anticipacionerrores_mant_detalleds_1_filterfulltext, lV137Anticipacionerrores_mant_detalleds_1_filterfulltext, lV137Anticipacionerrores_mant_detalleds_1_filterfulltext, lV137Anticipacionerrores_mant_detalleds_1_filterfulltext, lV137Anticipacionerrores_mant_detalleds_1_filterfulltext, lV137Anticipacionerrores_mant_detalleds_1_filterfulltext, lV137Anticipacionerrores_mant_detalleds_1_filterfulltext, lV137Anticipacionerrores_mant_detalleds_1_filterfulltext, lV137Anticipacionerrores_mant_detalleds_1_filterfulltext, lV137Anticipacionerrores_mant_detalleds_1_filterfulltext, lV137Anticipacionerrores_mant_detalleds_1_filterfulltext, lV137Anticipacionerrores_mant_detalleds_1_filterfulltext, lV137Anticipacionerrores_mant_detalleds_1_filterfulltext, lV137Anticipacionerrores_mant_detalleds_1_filterfulltext, lV137Anticipacionerrores_mant_detalleds_1_filterfulltext, lV137Anticipacionerrores_mant_detalleds_1_filterfulltext, lV137Anticipacionerrores_mant_detalleds_1_filterfulltext, lV137Anticipacionerrores_mant_detalleds_1_filterfulltext, lV137Anticipacionerrores_mant_detalleds_1_filterfulltext, lV137Anticipacionerrores_mant_detalleds_1_filterfulltext, lV137Anticipacionerrores_mant_detalleds_1_filterfulltext, lV137Anticipacionerrores_mant_detalleds_1_filterfulltext, lV137Anticipacionerrores_mant_detalleds_1_filterfulltext, lV137Anticipacionerrores_mant_detalleds_1_filterfulltext, lV137Anticipacionerrores_mant_detalleds_1_filterfulltext, lV137Anticipacionerrores_mant_detalleds_1_filterfulltext, AV138Anticipacionerrores_mant_detalleds_2_tfmadetfec, lV139Anticipacionerrores_mant_detalleds_3_tfmadetemprcod, AV140Anticipacionerrores_mant_detalleds_4_tfmadetemprcod_sel, Integer.valueOf(AV141Anticipacionerrores_mant_detalleds_5_tfmadetclicod), Integer.valueOf(AV142Anticipacionerrores_mant_detalleds_6_tfmadetclicod_to), lV143Anticipacionerrores_mant_detalleds_7_tfmadetclinom, AV144Anticipacionerrores_mant_detalleds_8_tfmadetclinom_sel, lV145Anticipacionerrores_mant_detalleds_9_tfmadetartcod, AV146Anticipacionerrores_mant_detalleds_10_tfmadetartcod_sel, lV147Anticipacionerrores_mant_detalleds_11_tfmadetartdsc, AV148Anticipacionerrores_mant_detalleds_12_tfmadetartdsc_sel, Integer.valueOf(AV149Anticipacionerrores_mant_detalleds_13_tfmadetcolnum), Integer.valueOf(AV150Anticipacionerrores_mant_detalleds_14_tfmadetcolnum_to), lV151Anticipacionerrores_mant_detalleds_15_tfmadetcolnom, AV152Anticipacionerrores_mant_detalleds_16_tfmadetcolnom_sel, Byte.valueOf(AV153Anticipacionerrores_mant_detalleds_17_tfmadetcolcod), Byte.valueOf(AV154Anticipacionerrores_mant_detalleds_18_tfmadetcolcod_to), Short.valueOf(AV155Anticipacionerrores_mant_detalleds_19_tfmadetmatcod), Short.valueOf(AV156Anticipacionerrores_mant_detalleds_20_tfmadetmatcod_to), lV157Anticipacionerrores_mant_detalleds_21_tfmadetmatdsc, AV158Anticipacionerrores_mant_detalleds_22_tfmadetmatdsc_sel, Byte.valueOf(AV159Anticipacionerrores_mant_detalleds_23_tfmadetintcod), Byte.valueOf(AV160Anticipacionerrores_mant_detalleds_24_tfmadetintcod_to), lV161Anticipacionerrores_mant_detalleds_25_tfmadetintdsc, AV162Anticipacionerrores_mant_detalleds_26_tfmadetintdsc_sel, lV163Anticipacionerrores_mant_detalleds_27_tfmadetmaqcod, AV164Anticipacionerrores_mant_detalleds_28_tfmadetmaqcod_sel, lV165Anticipacionerrores_mant_detalleds_29_tfmadetmaqdsc, AV166Anticipacionerrores_mant_detalleds_30_tfmadetmaqdsc_sel, lV167Anticipacionerrores_mant_detalleds_31_tfmadettipmcod, AV168Anticipacionerrores_mant_detalleds_32_tfmadettipmcod_sel, lV169Anticipacionerrores_mant_detalleds_33_tfmadettipmdsc, AV170Anticipacionerrores_mant_detalleds_34_tfmadettipmdsc_sel, Short.valueOf(AV171Anticipacionerrores_mant_detalleds_35_tfmadetdefcod), Short.valueOf(AV172Anticipacionerrores_mant_detalleds_36_tfmadetdefcod_to), lV173Anticipacionerrores_mant_detalleds_37_tfmadetdefdsc, AV174Anticipacionerrores_mant_detalleds_38_tfmadetdefdsc_sel, Short.valueOf(AV175Anticipacionerrores_mant_detalleds_39_tfmadetcatcod), Short.valueOf(AV176Anticipacionerrores_mant_detalleds_40_tfmadetcatcod_to), lV177Anticipacionerrores_mant_detalleds_41_tfmadetcatdsc, AV178Anticipacionerrores_mant_detalleds_42_tfmadetcatdsc_sel, lV179Anticipacionerrores_mant_detalleds_43_tfmadethdr, AV180Anticipacionerrores_mant_detalleds_44_tfmadethdr_sel, AV181Anticipacionerrores_mant_detalleds_45_tfmadetkilprod, AV182Anticipacionerrores_mant_detalleds_46_tfmadetkilprod_to, AV183Anticipacionerrores_mant_detalleds_47_tfmadetkilreo, AV184Anticipacionerrores_mant_detalleds_48_tfmadetkilreo_to, AV185Anticipacionerrores_mant_detalleds_49_tfmadetkiltot, AV186Anticipacionerrores_mant_detalleds_50_tfmadetkiltot_to, AV187Anticipacionerrores_mant_detalleds_51_tfmadetmetprod, AV188Anticipacionerrores_mant_detalleds_52_tfmadetmetprod_to, AV189Anticipacionerrores_mant_detalleds_53_tfmadetmetreo, AV190Anticipacionerrores_mant_detalleds_54_tfmadetmetreo_to, AV191Anticipacionerrores_mant_detalleds_55_tfmadetmettot, AV192Anticipacionerrores_mant_detalleds_56_tfmadetmettot_to, AV72ArtCod, Integer.valueOf(AV73ForColNum), AV115MADetMaqCod, Short.valueOf(AV103MADetDefCod), Short.valueOf(AV104MADetCatCod), Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingFrom2)});
         nGXsfl_39_idx = (int)(1+GRID_nFirstRecordOnPage) ;
         sGXsfl_39_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_39_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_392( ) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A14583MADetTkn = H02DR2_A14583MADetTkn[0] ;
            A14584MADetUsu = H02DR2_A14584MADetUsu[0] ;
            A14672MADetMetTo = H02DR2_A14672MADetMetTo[0] ;
            n14672MADetMetTo = H02DR2_n14672MADetMetTo[0] ;
            A14671MADetMetRe = H02DR2_A14671MADetMetRe[0] ;
            n14671MADetMetRe = H02DR2_n14671MADetMetRe[0] ;
            A14670MADetMetPr = H02DR2_A14670MADetMetPr[0] ;
            n14670MADetMetPr = H02DR2_n14670MADetMetPr[0] ;
            A14661MADetKilTo = H02DR2_A14661MADetKilTo[0] ;
            A14659MADetKilRe = H02DR2_A14659MADetKilRe[0] ;
            A14658MADetKilPr = H02DR2_A14658MADetKilPr[0] ;
            n14658MADetKilPr = H02DR2_n14658MADetKilPr[0] ;
            A14665MADetCatDs = H02DR2_A14665MADetCatDs[0] ;
            n14665MADetCatDs = H02DR2_n14665MADetCatDs[0] ;
            A14664MADetCatCo = H02DR2_A14664MADetCatCo[0] ;
            n14664MADetCatCo = H02DR2_n14664MADetCatCo[0] ;
            A14663MADetDefDs = H02DR2_A14663MADetDefDs[0] ;
            n14663MADetDefDs = H02DR2_n14663MADetDefDs[0] ;
            A14662MADetDefCo = H02DR2_A14662MADetDefCo[0] ;
            n14662MADetDefCo = H02DR2_n14662MADetDefCo[0] ;
            A14657MADetTipMD = H02DR2_A14657MADetTipMD[0] ;
            n14657MADetTipMD = H02DR2_n14657MADetTipMD[0] ;
            A14590MADetTipMC = H02DR2_A14590MADetTipMC[0] ;
            A14656MADetMaqDs = H02DR2_A14656MADetMaqDs[0] ;
            n14656MADetMaqDs = H02DR2_n14656MADetMaqDs[0] ;
            A14591MADetMaqCo = H02DR2_A14591MADetMaqCo[0] ;
            A14660MADetIntDs = H02DR2_A14660MADetIntDs[0] ;
            n14660MADetIntDs = H02DR2_n14660MADetIntDs[0] ;
            A14593MADetIntCo = H02DR2_A14593MADetIntCo[0] ;
            A14655MADetMatDs = H02DR2_A14655MADetMatDs[0] ;
            n14655MADetMatDs = H02DR2_n14655MADetMatDs[0] ;
            A14592MADetMatCo = H02DR2_A14592MADetMatCo[0] ;
            A14654MADetColCo = H02DR2_A14654MADetColCo[0] ;
            A14653MADetColNo = H02DR2_A14653MADetColNo[0] ;
            A14589MADetColNu = H02DR2_A14589MADetColNu[0] ;
            A14652MADetArtDs = H02DR2_A14652MADetArtDs[0] ;
            n14652MADetArtDs = H02DR2_n14652MADetArtDs[0] ;
            A14588MADetArtCo = H02DR2_A14588MADetArtCo[0] ;
            A14651MADetCliNo = H02DR2_A14651MADetCliNo[0] ;
            n14651MADetCliNo = H02DR2_n14651MADetCliNo[0] ;
            A14585MADetCliCo = H02DR2_A14585MADetCliCo[0] ;
            A14587MADetEmprC = H02DR2_A14587MADetEmprC[0] ;
            A14586MADetFec = H02DR2_A14586MADetFec[0] ;
            A14582MADetId = H02DR2_A14582MADetId[0] ;
            A14668MADetBarPa = H02DR2_A14668MADetBarPa[0] ;
            A14667MADetBarRe = H02DR2_A14667MADetBarRe[0] ;
            A14666MADetBarCo = H02DR2_A14666MADetBarCo[0] ;
            A14669MADetHdr = GXutil.trim( GXutil.str( A14666MADetBarCo, 8, 0)) + GXutil.trim( GXutil.str( A14667MADetBarRe, 1, 0)) + A14668MADetBarPa ;
            e182DR2 ();
            pr_default.readNext(0);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(39) ;
         wb2DR0( ) ;
      }
      bGXsfl_39_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes2DR2( )
   {
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vSDTMTOK", AV91sdtMTok);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vSDTMTOK", AV91sdtMTok);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vSDTMTOK", getSecureSignedToken( sPrefix, AV91sdtMTok));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vTIPMAQCODCOLLECTION", AV79TipMaqCodCollection);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vTIPMAQCODCOLLECTION", AV79TipMaqCodCollection);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTIPMAQCODCOLLECTION", getSecureSignedToken( sPrefix, AV79TipMaqCodCollection));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOTMADETKILPROD", GXutil.ltrim( localUtil.ntoc( AV87TotMADetKilProd, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTMADETKILPROD", getSecureSignedToken( sPrefix, localUtil.format( AV87TotMADetKilProd, "ZZZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOTMADETKILREO", GXutil.ltrim( localUtil.ntoc( AV89TotMADetKilReo, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTMADETKILREO", getSecureSignedToken( sPrefix, localUtil.format( AV89TotMADetKilReo, "ZZZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOTMADETKILTOT", GXutil.ltrim( localUtil.ntoc( AV120TotMADetKilTot, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTMADETKILTOT", getSecureSignedToken( sPrefix, localUtil.format( AV120TotMADetKilTot, "ZZZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOTMADETMETREO", GXutil.ltrim( localUtil.ntoc( AV128TotMADetMetReo, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTMADETMETREO", getSecureSignedToken( sPrefix, localUtil.format( AV128TotMADetMetReo, "ZZZZZZZZ9.99")));
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
      AV137Anticipacionerrores_mant_detalleds_1_filterfulltext = AV15FilterFullText ;
      AV138Anticipacionerrores_mant_detalleds_2_tfmadetfec = AV28TFMADetFec ;
      AV139Anticipacionerrores_mant_detalleds_3_tfmadetemprcod = AV32TFMADetEmprCod ;
      AV140Anticipacionerrores_mant_detalleds_4_tfmadetemprcod_sel = AV33TFMADetEmprCod_Sel ;
      AV141Anticipacionerrores_mant_detalleds_5_tfmadetclicod = AV34TFMADetCliCod ;
      AV142Anticipacionerrores_mant_detalleds_6_tfmadetclicod_to = AV35TFMADetCliCod_To ;
      AV143Anticipacionerrores_mant_detalleds_7_tfmadetclinom = AV36TFMADetCliNom ;
      AV144Anticipacionerrores_mant_detalleds_8_tfmadetclinom_sel = AV37TFMADetCliNom_Sel ;
      AV145Anticipacionerrores_mant_detalleds_9_tfmadetartcod = AV38TFMADetArtCod ;
      AV146Anticipacionerrores_mant_detalleds_10_tfmadetartcod_sel = AV39TFMADetArtCod_Sel ;
      AV147Anticipacionerrores_mant_detalleds_11_tfmadetartdsc = AV77TFMADetArtDsc ;
      AV148Anticipacionerrores_mant_detalleds_12_tfmadetartdsc_sel = AV78TFMADetArtDsc_Sel ;
      AV149Anticipacionerrores_mant_detalleds_13_tfmadetcolnum = AV44TFMADetColNum ;
      AV150Anticipacionerrores_mant_detalleds_14_tfmadetcolnum_to = AV45TFMADetColNum_To ;
      AV151Anticipacionerrores_mant_detalleds_15_tfmadetcolnom = AV42TFMADetColNom ;
      AV152Anticipacionerrores_mant_detalleds_16_tfmadetcolnom_sel = AV43TFMADetColNom_Sel ;
      AV153Anticipacionerrores_mant_detalleds_17_tfmadetcolcod = AV46TFMADetColCod ;
      AV154Anticipacionerrores_mant_detalleds_18_tfmadetcolcod_to = AV47TFMADetColCod_To ;
      AV155Anticipacionerrores_mant_detalleds_19_tfmadetmatcod = AV48TFMADetMatCod ;
      AV156Anticipacionerrores_mant_detalleds_20_tfmadetmatcod_to = AV49TFMADetMatCod_To ;
      AV157Anticipacionerrores_mant_detalleds_21_tfmadetmatdsc = AV80TFMADetMatDsc ;
      AV158Anticipacionerrores_mant_detalleds_22_tfmadetmatdsc_sel = AV81TFMADetMatDsc_Sel ;
      AV159Anticipacionerrores_mant_detalleds_23_tfmadetintcod = AV52TFMADetIntCod ;
      AV160Anticipacionerrores_mant_detalleds_24_tfmadetintcod_to = AV53TFMADetIntCod_To ;
      AV161Anticipacionerrores_mant_detalleds_25_tfmadetintdsc = AV82TFMADetIntDsc ;
      AV162Anticipacionerrores_mant_detalleds_26_tfmadetintdsc_sel = AV83TFMADetIntDsc_Sel ;
      AV163Anticipacionerrores_mant_detalleds_27_tfmadetmaqcod = AV56TFMADetMaqCod ;
      AV164Anticipacionerrores_mant_detalleds_28_tfmadetmaqcod_sel = AV57TFMADetMaqCod_Sel ;
      AV165Anticipacionerrores_mant_detalleds_29_tfmadetmaqdsc = AV58TFMADetMaqDsc ;
      AV166Anticipacionerrores_mant_detalleds_30_tfmadetmaqdsc_sel = AV59TFMADetMaqDsc_Sel ;
      AV167Anticipacionerrores_mant_detalleds_31_tfmadettipmcod = AV60TFMADetTipMCod ;
      AV168Anticipacionerrores_mant_detalleds_32_tfmadettipmcod_sel = AV61TFMADetTipMCod_Sel ;
      AV169Anticipacionerrores_mant_detalleds_33_tfmadettipmdsc = AV62TFMADetTipMDsc ;
      AV170Anticipacionerrores_mant_detalleds_34_tfmadettipmdsc_sel = AV63TFMADetTipMDsc_Sel ;
      AV171Anticipacionerrores_mant_detalleds_35_tfmadetdefcod = AV107TFMADetDefCod ;
      AV172Anticipacionerrores_mant_detalleds_36_tfmadetdefcod_to = AV108TFMADetDefCod_To ;
      AV173Anticipacionerrores_mant_detalleds_37_tfmadetdefdsc = AV109TFMADetDefDsc ;
      AV174Anticipacionerrores_mant_detalleds_38_tfmadetdefdsc_sel = AV110TFMADetDefDsc_Sel ;
      AV175Anticipacionerrores_mant_detalleds_39_tfmadetcatcod = AV111TFMADetCatCod ;
      AV176Anticipacionerrores_mant_detalleds_40_tfmadetcatcod_to = AV112TFMADetCatCod_To ;
      AV177Anticipacionerrores_mant_detalleds_41_tfmadetcatdsc = AV113TFMADetCatDsc ;
      AV178Anticipacionerrores_mant_detalleds_42_tfmadetcatdsc_sel = AV114TFMADetCatDsc_Sel ;
      AV179Anticipacionerrores_mant_detalleds_43_tfmadethdr = AV116TFMADetHdr ;
      AV180Anticipacionerrores_mant_detalleds_44_tfmadethdr_sel = AV117TFMADetHdr_Sel ;
      AV181Anticipacionerrores_mant_detalleds_45_tfmadetkilprod = AV64TFMADetKilProd ;
      AV182Anticipacionerrores_mant_detalleds_46_tfmadetkilprod_to = AV65TFMADetKilProd_To ;
      AV183Anticipacionerrores_mant_detalleds_47_tfmadetkilreo = AV66TFMADetKilReo ;
      AV184Anticipacionerrores_mant_detalleds_48_tfmadetkilreo_to = AV67TFMADetKilReo_To ;
      AV185Anticipacionerrores_mant_detalleds_49_tfmadetkiltot = AV93TFMADetKilTot ;
      AV186Anticipacionerrores_mant_detalleds_50_tfmadetkiltot_to = AV94TFMADetKilTot_To ;
      AV187Anticipacionerrores_mant_detalleds_51_tfmadetmetprod = AV122TFMADetMetProd ;
      AV188Anticipacionerrores_mant_detalleds_52_tfmadetmetprod_to = AV123TFMADetMetProd_To ;
      AV189Anticipacionerrores_mant_detalleds_53_tfmadetmetreo = AV124TFMADetMetReo ;
      AV190Anticipacionerrores_mant_detalleds_54_tfmadetmetreo_to = AV125TFMADetMetReo_To ;
      AV191Anticipacionerrores_mant_detalleds_55_tfmadetmettot = AV126TFMADetMetTot ;
      AV192Anticipacionerrores_mant_detalleds_56_tfmadetmettot_to = AV127TFMADetMetTot_To ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           A14590MADetTipMC ,
                                           AV79TipMaqCodCollection ,
                                           AV137Anticipacionerrores_mant_detalleds_1_filterfulltext ,
                                           AV138Anticipacionerrores_mant_detalleds_2_tfmadetfec ,
                                           AV140Anticipacionerrores_mant_detalleds_4_tfmadetemprcod_sel ,
                                           AV139Anticipacionerrores_mant_detalleds_3_tfmadetemprcod ,
                                           Integer.valueOf(AV141Anticipacionerrores_mant_detalleds_5_tfmadetclicod) ,
                                           Integer.valueOf(AV142Anticipacionerrores_mant_detalleds_6_tfmadetclicod_to) ,
                                           AV144Anticipacionerrores_mant_detalleds_8_tfmadetclinom_sel ,
                                           AV143Anticipacionerrores_mant_detalleds_7_tfmadetclinom ,
                                           AV146Anticipacionerrores_mant_detalleds_10_tfmadetartcod_sel ,
                                           AV145Anticipacionerrores_mant_detalleds_9_tfmadetartcod ,
                                           AV148Anticipacionerrores_mant_detalleds_12_tfmadetartdsc_sel ,
                                           AV147Anticipacionerrores_mant_detalleds_11_tfmadetartdsc ,
                                           Integer.valueOf(AV149Anticipacionerrores_mant_detalleds_13_tfmadetcolnum) ,
                                           Integer.valueOf(AV150Anticipacionerrores_mant_detalleds_14_tfmadetcolnum_to) ,
                                           AV152Anticipacionerrores_mant_detalleds_16_tfmadetcolnom_sel ,
                                           AV151Anticipacionerrores_mant_detalleds_15_tfmadetcolnom ,
                                           Byte.valueOf(AV153Anticipacionerrores_mant_detalleds_17_tfmadetcolcod) ,
                                           Byte.valueOf(AV154Anticipacionerrores_mant_detalleds_18_tfmadetcolcod_to) ,
                                           Short.valueOf(AV155Anticipacionerrores_mant_detalleds_19_tfmadetmatcod) ,
                                           Short.valueOf(AV156Anticipacionerrores_mant_detalleds_20_tfmadetmatcod_to) ,
                                           AV158Anticipacionerrores_mant_detalleds_22_tfmadetmatdsc_sel ,
                                           AV157Anticipacionerrores_mant_detalleds_21_tfmadetmatdsc ,
                                           Byte.valueOf(AV159Anticipacionerrores_mant_detalleds_23_tfmadetintcod) ,
                                           Byte.valueOf(AV160Anticipacionerrores_mant_detalleds_24_tfmadetintcod_to) ,
                                           AV162Anticipacionerrores_mant_detalleds_26_tfmadetintdsc_sel ,
                                           AV161Anticipacionerrores_mant_detalleds_25_tfmadetintdsc ,
                                           AV164Anticipacionerrores_mant_detalleds_28_tfmadetmaqcod_sel ,
                                           AV163Anticipacionerrores_mant_detalleds_27_tfmadetmaqcod ,
                                           AV166Anticipacionerrores_mant_detalleds_30_tfmadetmaqdsc_sel ,
                                           AV165Anticipacionerrores_mant_detalleds_29_tfmadetmaqdsc ,
                                           AV168Anticipacionerrores_mant_detalleds_32_tfmadettipmcod_sel ,
                                           AV167Anticipacionerrores_mant_detalleds_31_tfmadettipmcod ,
                                           AV170Anticipacionerrores_mant_detalleds_34_tfmadettipmdsc_sel ,
                                           AV169Anticipacionerrores_mant_detalleds_33_tfmadettipmdsc ,
                                           Short.valueOf(AV171Anticipacionerrores_mant_detalleds_35_tfmadetdefcod) ,
                                           Short.valueOf(AV172Anticipacionerrores_mant_detalleds_36_tfmadetdefcod_to) ,
                                           AV174Anticipacionerrores_mant_detalleds_38_tfmadetdefdsc_sel ,
                                           AV173Anticipacionerrores_mant_detalleds_37_tfmadetdefdsc ,
                                           Short.valueOf(AV175Anticipacionerrores_mant_detalleds_39_tfmadetcatcod) ,
                                           Short.valueOf(AV176Anticipacionerrores_mant_detalleds_40_tfmadetcatcod_to) ,
                                           AV178Anticipacionerrores_mant_detalleds_42_tfmadetcatdsc_sel ,
                                           AV177Anticipacionerrores_mant_detalleds_41_tfmadetcatdsc ,
                                           AV180Anticipacionerrores_mant_detalleds_44_tfmadethdr_sel ,
                                           AV179Anticipacionerrores_mant_detalleds_43_tfmadethdr ,
                                           AV181Anticipacionerrores_mant_detalleds_45_tfmadetkilprod ,
                                           AV182Anticipacionerrores_mant_detalleds_46_tfmadetkilprod_to ,
                                           AV183Anticipacionerrores_mant_detalleds_47_tfmadetkilreo ,
                                           AV184Anticipacionerrores_mant_detalleds_48_tfmadetkilreo_to ,
                                           AV185Anticipacionerrores_mant_detalleds_49_tfmadetkiltot ,
                                           AV186Anticipacionerrores_mant_detalleds_50_tfmadetkiltot_to ,
                                           AV187Anticipacionerrores_mant_detalleds_51_tfmadetmetprod ,
                                           AV188Anticipacionerrores_mant_detalleds_52_tfmadetmetprod_to ,
                                           AV189Anticipacionerrores_mant_detalleds_53_tfmadetmetreo ,
                                           AV190Anticipacionerrores_mant_detalleds_54_tfmadetmetreo_to ,
                                           AV191Anticipacionerrores_mant_detalleds_55_tfmadetmettot ,
                                           AV192Anticipacionerrores_mant_detalleds_56_tfmadetmettot_to ,
                                           AV72ArtCod ,
                                           Integer.valueOf(AV73ForColNum) ,
                                           AV115MADetMaqCod ,
                                           Integer.valueOf(AV79TipMaqCodCollection.size()) ,
                                           Short.valueOf(AV103MADetDefCod) ,
                                           Short.valueOf(AV104MADetCatCod) ,
                                           A14587MADetEmprC ,
                                           Integer.valueOf(A14585MADetCliCo) ,
                                           A14651MADetCliNo ,
                                           A14588MADetArtCo ,
                                           A14652MADetArtDs ,
                                           Integer.valueOf(A14589MADetColNu) ,
                                           A14653MADetColNo ,
                                           Byte.valueOf(A14654MADetColCo) ,
                                           Short.valueOf(A14592MADetMatCo) ,
                                           A14655MADetMatDs ,
                                           Byte.valueOf(A14593MADetIntCo) ,
                                           A14660MADetIntDs ,
                                           A14591MADetMaqCo ,
                                           A14656MADetMaqDs ,
                                           A14657MADetTipMD ,
                                           Short.valueOf(A14662MADetDefCo) ,
                                           A14663MADetDefDs ,
                                           Short.valueOf(A14664MADetCatCo) ,
                                           A14665MADetCatDs ,
                                           Integer.valueOf(A14666MADetBarCo) ,
                                           Byte.valueOf(A14667MADetBarRe) ,
                                           A14668MADetBarPa ,
                                           A14658MADetKilPr ,
                                           A14659MADetKilRe ,
                                           A14661MADetKilTo ,
                                           A14670MADetMetPr ,
                                           A14671MADetMetRe ,
                                           A14672MADetMetTo ,
                                           A14586MADetFec ,
                                           Short.valueOf(AV12OrderedBy) ,
                                           Boolean.valueOf(AV13OrderedDsc) ,
                                           AV70MADetEmprCod ,
                                           AV91sdtMTok.getgxTv_SdtsdtMTok_Mtkn() ,
                                           AV91sdtMTok.getgxTv_SdtsdtMTok_Mtknusu() ,
                                           Integer.valueOf(AV71CliCod) ,
                                           A14583MADetTkn ,
                                           A14584MADetUsu } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV137Anticipacionerrores_mant_detalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV137Anticipacionerrores_mant_detalleds_1_filterfulltext), "%", "") ;
      lV137Anticipacionerrores_mant_detalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV137Anticipacionerrores_mant_detalleds_1_filterfulltext), "%", "") ;
      lV137Anticipacionerrores_mant_detalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV137Anticipacionerrores_mant_detalleds_1_filterfulltext), "%", "") ;
      lV137Anticipacionerrores_mant_detalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV137Anticipacionerrores_mant_detalleds_1_filterfulltext), "%", "") ;
      lV137Anticipacionerrores_mant_detalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV137Anticipacionerrores_mant_detalleds_1_filterfulltext), "%", "") ;
      lV137Anticipacionerrores_mant_detalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV137Anticipacionerrores_mant_detalleds_1_filterfulltext), "%", "") ;
      lV137Anticipacionerrores_mant_detalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV137Anticipacionerrores_mant_detalleds_1_filterfulltext), "%", "") ;
      lV137Anticipacionerrores_mant_detalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV137Anticipacionerrores_mant_detalleds_1_filterfulltext), "%", "") ;
      lV137Anticipacionerrores_mant_detalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV137Anticipacionerrores_mant_detalleds_1_filterfulltext), "%", "") ;
      lV137Anticipacionerrores_mant_detalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV137Anticipacionerrores_mant_detalleds_1_filterfulltext), "%", "") ;
      lV137Anticipacionerrores_mant_detalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV137Anticipacionerrores_mant_detalleds_1_filterfulltext), "%", "") ;
      lV137Anticipacionerrores_mant_detalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV137Anticipacionerrores_mant_detalleds_1_filterfulltext), "%", "") ;
      lV137Anticipacionerrores_mant_detalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV137Anticipacionerrores_mant_detalleds_1_filterfulltext), "%", "") ;
      lV137Anticipacionerrores_mant_detalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV137Anticipacionerrores_mant_detalleds_1_filterfulltext), "%", "") ;
      lV137Anticipacionerrores_mant_detalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV137Anticipacionerrores_mant_detalleds_1_filterfulltext), "%", "") ;
      lV137Anticipacionerrores_mant_detalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV137Anticipacionerrores_mant_detalleds_1_filterfulltext), "%", "") ;
      lV137Anticipacionerrores_mant_detalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV137Anticipacionerrores_mant_detalleds_1_filterfulltext), "%", "") ;
      lV137Anticipacionerrores_mant_detalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV137Anticipacionerrores_mant_detalleds_1_filterfulltext), "%", "") ;
      lV137Anticipacionerrores_mant_detalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV137Anticipacionerrores_mant_detalleds_1_filterfulltext), "%", "") ;
      lV137Anticipacionerrores_mant_detalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV137Anticipacionerrores_mant_detalleds_1_filterfulltext), "%", "") ;
      lV137Anticipacionerrores_mant_detalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV137Anticipacionerrores_mant_detalleds_1_filterfulltext), "%", "") ;
      lV137Anticipacionerrores_mant_detalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV137Anticipacionerrores_mant_detalleds_1_filterfulltext), "%", "") ;
      lV137Anticipacionerrores_mant_detalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV137Anticipacionerrores_mant_detalleds_1_filterfulltext), "%", "") ;
      lV137Anticipacionerrores_mant_detalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV137Anticipacionerrores_mant_detalleds_1_filterfulltext), "%", "") ;
      lV137Anticipacionerrores_mant_detalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV137Anticipacionerrores_mant_detalleds_1_filterfulltext), "%", "") ;
      lV137Anticipacionerrores_mant_detalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV137Anticipacionerrores_mant_detalleds_1_filterfulltext), "%", "") ;
      lV137Anticipacionerrores_mant_detalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV137Anticipacionerrores_mant_detalleds_1_filterfulltext), "%", "") ;
      lV139Anticipacionerrores_mant_detalleds_3_tfmadetemprcod = GXutil.padr( GXutil.rtrim( AV139Anticipacionerrores_mant_detalleds_3_tfmadetemprcod), 3, "%") ;
      lV143Anticipacionerrores_mant_detalleds_7_tfmadetclinom = GXutil.concat( GXutil.rtrim( AV143Anticipacionerrores_mant_detalleds_7_tfmadetclinom), "%", "") ;
      lV145Anticipacionerrores_mant_detalleds_9_tfmadetartcod = GXutil.padr( GXutil.rtrim( AV145Anticipacionerrores_mant_detalleds_9_tfmadetartcod), 16, "%") ;
      lV147Anticipacionerrores_mant_detalleds_11_tfmadetartdsc = GXutil.concat( GXutil.rtrim( AV147Anticipacionerrores_mant_detalleds_11_tfmadetartdsc), "%", "") ;
      lV151Anticipacionerrores_mant_detalleds_15_tfmadetcolnom = GXutil.padr( GXutil.rtrim( AV151Anticipacionerrores_mant_detalleds_15_tfmadetcolnom), 13, "%") ;
      lV157Anticipacionerrores_mant_detalleds_21_tfmadetmatdsc = GXutil.concat( GXutil.rtrim( AV157Anticipacionerrores_mant_detalleds_21_tfmadetmatdsc), "%", "") ;
      lV161Anticipacionerrores_mant_detalleds_25_tfmadetintdsc = GXutil.concat( GXutil.rtrim( AV161Anticipacionerrores_mant_detalleds_25_tfmadetintdsc), "%", "") ;
      lV163Anticipacionerrores_mant_detalleds_27_tfmadetmaqcod = GXutil.padr( GXutil.rtrim( AV163Anticipacionerrores_mant_detalleds_27_tfmadetmaqcod), 6, "%") ;
      lV165Anticipacionerrores_mant_detalleds_29_tfmadetmaqdsc = GXutil.concat( GXutil.rtrim( AV165Anticipacionerrores_mant_detalleds_29_tfmadetmaqdsc), "%", "") ;
      lV167Anticipacionerrores_mant_detalleds_31_tfmadettipmcod = GXutil.padr( GXutil.rtrim( AV167Anticipacionerrores_mant_detalleds_31_tfmadettipmcod), 4, "%") ;
      lV169Anticipacionerrores_mant_detalleds_33_tfmadettipmdsc = GXutil.concat( GXutil.rtrim( AV169Anticipacionerrores_mant_detalleds_33_tfmadettipmdsc), "%", "") ;
      lV173Anticipacionerrores_mant_detalleds_37_tfmadetdefdsc = GXutil.concat( GXutil.rtrim( AV173Anticipacionerrores_mant_detalleds_37_tfmadetdefdsc), "%", "") ;
      lV177Anticipacionerrores_mant_detalleds_41_tfmadetcatdsc = GXutil.concat( GXutil.rtrim( AV177Anticipacionerrores_mant_detalleds_41_tfmadetcatdsc), "%", "") ;
      lV179Anticipacionerrores_mant_detalleds_43_tfmadethdr = GXutil.padr( GXutil.rtrim( AV179Anticipacionerrores_mant_detalleds_43_tfmadethdr), 10, "%") ;
      /* Using cursor H02DR3 */
      pr_default.execute(1, new Object[] {AV91sdtMTok.getgxTv_SdtsdtMTok_Mtkn(), AV91sdtMTok.getgxTv_SdtsdtMTok_Mtknusu(), Integer.valueOf(AV71CliCod), AV70MADetEmprCod, lV137Anticipacionerrores_mant_detalleds_1_filterfulltext, lV137Anticipacionerrores_mant_detalleds_1_filterfulltext, lV137Anticipacionerrores_mant_detalleds_1_filterfulltext, lV137Anticipacionerrores_mant_detalleds_1_filterfulltext, lV137Anticipacionerrores_mant_detalleds_1_filterfulltext, lV137Anticipacionerrores_mant_detalleds_1_filterfulltext, lV137Anticipacionerrores_mant_detalleds_1_filterfulltext, lV137Anticipacionerrores_mant_detalleds_1_filterfulltext, lV137Anticipacionerrores_mant_detalleds_1_filterfulltext, lV137Anticipacionerrores_mant_detalleds_1_filterfulltext, lV137Anticipacionerrores_mant_detalleds_1_filterfulltext, lV137Anticipacionerrores_mant_detalleds_1_filterfulltext, lV137Anticipacionerrores_mant_detalleds_1_filterfulltext, lV137Anticipacionerrores_mant_detalleds_1_filterfulltext, lV137Anticipacionerrores_mant_detalleds_1_filterfulltext, lV137Anticipacionerrores_mant_detalleds_1_filterfulltext, lV137Anticipacionerrores_mant_detalleds_1_filterfulltext, lV137Anticipacionerrores_mant_detalleds_1_filterfulltext, lV137Anticipacionerrores_mant_detalleds_1_filterfulltext, lV137Anticipacionerrores_mant_detalleds_1_filterfulltext, lV137Anticipacionerrores_mant_detalleds_1_filterfulltext, lV137Anticipacionerrores_mant_detalleds_1_filterfulltext, lV137Anticipacionerrores_mant_detalleds_1_filterfulltext, lV137Anticipacionerrores_mant_detalleds_1_filterfulltext, lV137Anticipacionerrores_mant_detalleds_1_filterfulltext, lV137Anticipacionerrores_mant_detalleds_1_filterfulltext, lV137Anticipacionerrores_mant_detalleds_1_filterfulltext, AV138Anticipacionerrores_mant_detalleds_2_tfmadetfec, lV139Anticipacionerrores_mant_detalleds_3_tfmadetemprcod, AV140Anticipacionerrores_mant_detalleds_4_tfmadetemprcod_sel, Integer.valueOf(AV141Anticipacionerrores_mant_detalleds_5_tfmadetclicod), Integer.valueOf(AV142Anticipacionerrores_mant_detalleds_6_tfmadetclicod_to), lV143Anticipacionerrores_mant_detalleds_7_tfmadetclinom, AV144Anticipacionerrores_mant_detalleds_8_tfmadetclinom_sel, lV145Anticipacionerrores_mant_detalleds_9_tfmadetartcod, AV146Anticipacionerrores_mant_detalleds_10_tfmadetartcod_sel, lV147Anticipacionerrores_mant_detalleds_11_tfmadetartdsc, AV148Anticipacionerrores_mant_detalleds_12_tfmadetartdsc_sel, Integer.valueOf(AV149Anticipacionerrores_mant_detalleds_13_tfmadetcolnum), Integer.valueOf(AV150Anticipacionerrores_mant_detalleds_14_tfmadetcolnum_to), lV151Anticipacionerrores_mant_detalleds_15_tfmadetcolnom, AV152Anticipacionerrores_mant_detalleds_16_tfmadetcolnom_sel, Byte.valueOf(AV153Anticipacionerrores_mant_detalleds_17_tfmadetcolcod), Byte.valueOf(AV154Anticipacionerrores_mant_detalleds_18_tfmadetcolcod_to), Short.valueOf(AV155Anticipacionerrores_mant_detalleds_19_tfmadetmatcod), Short.valueOf(AV156Anticipacionerrores_mant_detalleds_20_tfmadetmatcod_to), lV157Anticipacionerrores_mant_detalleds_21_tfmadetmatdsc, AV158Anticipacionerrores_mant_detalleds_22_tfmadetmatdsc_sel, Byte.valueOf(AV159Anticipacionerrores_mant_detalleds_23_tfmadetintcod), Byte.valueOf(AV160Anticipacionerrores_mant_detalleds_24_tfmadetintcod_to), lV161Anticipacionerrores_mant_detalleds_25_tfmadetintdsc, AV162Anticipacionerrores_mant_detalleds_26_tfmadetintdsc_sel, lV163Anticipacionerrores_mant_detalleds_27_tfmadetmaqcod, AV164Anticipacionerrores_mant_detalleds_28_tfmadetmaqcod_sel, lV165Anticipacionerrores_mant_detalleds_29_tfmadetmaqdsc, AV166Anticipacionerrores_mant_detalleds_30_tfmadetmaqdsc_sel, lV167Anticipacionerrores_mant_detalleds_31_tfmadettipmcod, AV168Anticipacionerrores_mant_detalleds_32_tfmadettipmcod_sel, lV169Anticipacionerrores_mant_detalleds_33_tfmadettipmdsc, AV170Anticipacionerrores_mant_detalleds_34_tfmadettipmdsc_sel, Short.valueOf(AV171Anticipacionerrores_mant_detalleds_35_tfmadetdefcod), Short.valueOf(AV172Anticipacionerrores_mant_detalleds_36_tfmadetdefcod_to), lV173Anticipacionerrores_mant_detalleds_37_tfmadetdefdsc, AV174Anticipacionerrores_mant_detalleds_38_tfmadetdefdsc_sel, Short.valueOf(AV175Anticipacionerrores_mant_detalleds_39_tfmadetcatcod), Short.valueOf(AV176Anticipacionerrores_mant_detalleds_40_tfmadetcatcod_to), lV177Anticipacionerrores_mant_detalleds_41_tfmadetcatdsc, AV178Anticipacionerrores_mant_detalleds_42_tfmadetcatdsc_sel, lV179Anticipacionerrores_mant_detalleds_43_tfmadethdr, AV180Anticipacionerrores_mant_detalleds_44_tfmadethdr_sel, AV181Anticipacionerrores_mant_detalleds_45_tfmadetkilprod, AV182Anticipacionerrores_mant_detalleds_46_tfmadetkilprod_to, AV183Anticipacionerrores_mant_detalleds_47_tfmadetkilreo, AV184Anticipacionerrores_mant_detalleds_48_tfmadetkilreo_to, AV185Anticipacionerrores_mant_detalleds_49_tfmadetkiltot, AV186Anticipacionerrores_mant_detalleds_50_tfmadetkiltot_to, AV187Anticipacionerrores_mant_detalleds_51_tfmadetmetprod, AV188Anticipacionerrores_mant_detalleds_52_tfmadetmetprod_to, AV189Anticipacionerrores_mant_detalleds_53_tfmadetmetreo, AV190Anticipacionerrores_mant_detalleds_54_tfmadetmetreo_to, AV191Anticipacionerrores_mant_detalleds_55_tfmadetmettot, AV192Anticipacionerrores_mant_detalleds_56_tfmadetmettot_to, AV72ArtCod, Integer.valueOf(AV73ForColNum), AV115MADetMaqCod, Short.valueOf(AV103MADetDefCod), Short.valueOf(AV104MADetCatCod)});
      GRID_nRecordCount = H02DR3_AGRID_nRecordCount[0] ;
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
      AV137Anticipacionerrores_mant_detalleds_1_filterfulltext = AV15FilterFullText ;
      AV138Anticipacionerrores_mant_detalleds_2_tfmadetfec = AV28TFMADetFec ;
      AV139Anticipacionerrores_mant_detalleds_3_tfmadetemprcod = AV32TFMADetEmprCod ;
      AV140Anticipacionerrores_mant_detalleds_4_tfmadetemprcod_sel = AV33TFMADetEmprCod_Sel ;
      AV141Anticipacionerrores_mant_detalleds_5_tfmadetclicod = AV34TFMADetCliCod ;
      AV142Anticipacionerrores_mant_detalleds_6_tfmadetclicod_to = AV35TFMADetCliCod_To ;
      AV143Anticipacionerrores_mant_detalleds_7_tfmadetclinom = AV36TFMADetCliNom ;
      AV144Anticipacionerrores_mant_detalleds_8_tfmadetclinom_sel = AV37TFMADetCliNom_Sel ;
      AV145Anticipacionerrores_mant_detalleds_9_tfmadetartcod = AV38TFMADetArtCod ;
      AV146Anticipacionerrores_mant_detalleds_10_tfmadetartcod_sel = AV39TFMADetArtCod_Sel ;
      AV147Anticipacionerrores_mant_detalleds_11_tfmadetartdsc = AV77TFMADetArtDsc ;
      AV148Anticipacionerrores_mant_detalleds_12_tfmadetartdsc_sel = AV78TFMADetArtDsc_Sel ;
      AV149Anticipacionerrores_mant_detalleds_13_tfmadetcolnum = AV44TFMADetColNum ;
      AV150Anticipacionerrores_mant_detalleds_14_tfmadetcolnum_to = AV45TFMADetColNum_To ;
      AV151Anticipacionerrores_mant_detalleds_15_tfmadetcolnom = AV42TFMADetColNom ;
      AV152Anticipacionerrores_mant_detalleds_16_tfmadetcolnom_sel = AV43TFMADetColNom_Sel ;
      AV153Anticipacionerrores_mant_detalleds_17_tfmadetcolcod = AV46TFMADetColCod ;
      AV154Anticipacionerrores_mant_detalleds_18_tfmadetcolcod_to = AV47TFMADetColCod_To ;
      AV155Anticipacionerrores_mant_detalleds_19_tfmadetmatcod = AV48TFMADetMatCod ;
      AV156Anticipacionerrores_mant_detalleds_20_tfmadetmatcod_to = AV49TFMADetMatCod_To ;
      AV157Anticipacionerrores_mant_detalleds_21_tfmadetmatdsc = AV80TFMADetMatDsc ;
      AV158Anticipacionerrores_mant_detalleds_22_tfmadetmatdsc_sel = AV81TFMADetMatDsc_Sel ;
      AV159Anticipacionerrores_mant_detalleds_23_tfmadetintcod = AV52TFMADetIntCod ;
      AV160Anticipacionerrores_mant_detalleds_24_tfmadetintcod_to = AV53TFMADetIntCod_To ;
      AV161Anticipacionerrores_mant_detalleds_25_tfmadetintdsc = AV82TFMADetIntDsc ;
      AV162Anticipacionerrores_mant_detalleds_26_tfmadetintdsc_sel = AV83TFMADetIntDsc_Sel ;
      AV163Anticipacionerrores_mant_detalleds_27_tfmadetmaqcod = AV56TFMADetMaqCod ;
      AV164Anticipacionerrores_mant_detalleds_28_tfmadetmaqcod_sel = AV57TFMADetMaqCod_Sel ;
      AV165Anticipacionerrores_mant_detalleds_29_tfmadetmaqdsc = AV58TFMADetMaqDsc ;
      AV166Anticipacionerrores_mant_detalleds_30_tfmadetmaqdsc_sel = AV59TFMADetMaqDsc_Sel ;
      AV167Anticipacionerrores_mant_detalleds_31_tfmadettipmcod = AV60TFMADetTipMCod ;
      AV168Anticipacionerrores_mant_detalleds_32_tfmadettipmcod_sel = AV61TFMADetTipMCod_Sel ;
      AV169Anticipacionerrores_mant_detalleds_33_tfmadettipmdsc = AV62TFMADetTipMDsc ;
      AV170Anticipacionerrores_mant_detalleds_34_tfmadettipmdsc_sel = AV63TFMADetTipMDsc_Sel ;
      AV171Anticipacionerrores_mant_detalleds_35_tfmadetdefcod = AV107TFMADetDefCod ;
      AV172Anticipacionerrores_mant_detalleds_36_tfmadetdefcod_to = AV108TFMADetDefCod_To ;
      AV173Anticipacionerrores_mant_detalleds_37_tfmadetdefdsc = AV109TFMADetDefDsc ;
      AV174Anticipacionerrores_mant_detalleds_38_tfmadetdefdsc_sel = AV110TFMADetDefDsc_Sel ;
      AV175Anticipacionerrores_mant_detalleds_39_tfmadetcatcod = AV111TFMADetCatCod ;
      AV176Anticipacionerrores_mant_detalleds_40_tfmadetcatcod_to = AV112TFMADetCatCod_To ;
      AV177Anticipacionerrores_mant_detalleds_41_tfmadetcatdsc = AV113TFMADetCatDsc ;
      AV178Anticipacionerrores_mant_detalleds_42_tfmadetcatdsc_sel = AV114TFMADetCatDsc_Sel ;
      AV179Anticipacionerrores_mant_detalleds_43_tfmadethdr = AV116TFMADetHdr ;
      AV180Anticipacionerrores_mant_detalleds_44_tfmadethdr_sel = AV117TFMADetHdr_Sel ;
      AV181Anticipacionerrores_mant_detalleds_45_tfmadetkilprod = AV64TFMADetKilProd ;
      AV182Anticipacionerrores_mant_detalleds_46_tfmadetkilprod_to = AV65TFMADetKilProd_To ;
      AV183Anticipacionerrores_mant_detalleds_47_tfmadetkilreo = AV66TFMADetKilReo ;
      AV184Anticipacionerrores_mant_detalleds_48_tfmadetkilreo_to = AV67TFMADetKilReo_To ;
      AV185Anticipacionerrores_mant_detalleds_49_tfmadetkiltot = AV93TFMADetKilTot ;
      AV186Anticipacionerrores_mant_detalleds_50_tfmadetkiltot_to = AV94TFMADetKilTot_To ;
      AV187Anticipacionerrores_mant_detalleds_51_tfmadetmetprod = AV122TFMADetMetProd ;
      AV188Anticipacionerrores_mant_detalleds_52_tfmadetmetprod_to = AV123TFMADetMetProd_To ;
      AV189Anticipacionerrores_mant_detalleds_53_tfmadetmetreo = AV124TFMADetMetReo ;
      AV190Anticipacionerrores_mant_detalleds_54_tfmadetmetreo_to = AV125TFMADetMetReo_To ;
      AV191Anticipacionerrores_mant_detalleds_55_tfmadetmettot = AV126TFMADetMetTot ;
      AV192Anticipacionerrores_mant_detalleds_56_tfmadetmettot_to = AV127TFMADetMetTot_To ;
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV15FilterFullText, AV70MADetEmprCod, AV71CliCod, AV72ArtCod, AV73ForColNum, AV115MADetMaqCod, AV103MADetDefCod, AV104MADetCatCod, AV79TipMaqCodCollection, AV91sdtMTok, AV25ManageFiltersExecutionStep, AV20ColumnsSelector, AV28TFMADetFec, AV32TFMADetEmprCod, AV33TFMADetEmprCod_Sel, AV34TFMADetCliCod, AV35TFMADetCliCod_To, AV36TFMADetCliNom, AV37TFMADetCliNom_Sel, AV38TFMADetArtCod, AV39TFMADetArtCod_Sel, AV77TFMADetArtDsc, AV78TFMADetArtDsc_Sel, AV44TFMADetColNum, AV45TFMADetColNum_To, AV42TFMADetColNom, AV43TFMADetColNom_Sel, AV46TFMADetColCod, AV47TFMADetColCod_To, AV48TFMADetMatCod, AV49TFMADetMatCod_To, AV80TFMADetMatDsc, AV81TFMADetMatDsc_Sel, AV52TFMADetIntCod, AV53TFMADetIntCod_To, AV82TFMADetIntDsc, AV83TFMADetIntDsc_Sel, AV56TFMADetMaqCod, AV57TFMADetMaqCod_Sel, AV58TFMADetMaqDsc, AV59TFMADetMaqDsc_Sel, AV60TFMADetTipMCod, AV61TFMADetTipMCod_Sel, AV62TFMADetTipMDsc, AV63TFMADetTipMDsc_Sel, AV107TFMADetDefCod, AV108TFMADetDefCod_To, AV109TFMADetDefDsc, AV110TFMADetDefDsc_Sel, AV111TFMADetCatCod, AV112TFMADetCatCod_To, AV113TFMADetCatDsc, AV114TFMADetCatDsc_Sel, AV116TFMADetHdr, AV117TFMADetHdr_Sel, AV64TFMADetKilProd, AV65TFMADetKilProd_To, AV66TFMADetKilReo, AV67TFMADetKilReo_To, AV93TFMADetKilTot, AV94TFMADetKilTot_To, AV122TFMADetMetProd, AV123TFMADetMetProd_To, AV124TFMADetMetReo, AV125TFMADetMetReo_To, AV126TFMADetMetTot, AV127TFMADetMetTot_To, AV132Pgmname, AV12OrderedBy, AV13OrderedDsc, AV74TipMaqCodJSON, AV75FechaInicio, AV76FechaFin, AV105MTknUsu, AV106MTkn, AV87TotMADetKilProd, AV89TotMADetKilReo, AV120TotMADetKilTot, AV128TotMADetMetReo, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      AV137Anticipacionerrores_mant_detalleds_1_filterfulltext = AV15FilterFullText ;
      AV138Anticipacionerrores_mant_detalleds_2_tfmadetfec = AV28TFMADetFec ;
      AV139Anticipacionerrores_mant_detalleds_3_tfmadetemprcod = AV32TFMADetEmprCod ;
      AV140Anticipacionerrores_mant_detalleds_4_tfmadetemprcod_sel = AV33TFMADetEmprCod_Sel ;
      AV141Anticipacionerrores_mant_detalleds_5_tfmadetclicod = AV34TFMADetCliCod ;
      AV142Anticipacionerrores_mant_detalleds_6_tfmadetclicod_to = AV35TFMADetCliCod_To ;
      AV143Anticipacionerrores_mant_detalleds_7_tfmadetclinom = AV36TFMADetCliNom ;
      AV144Anticipacionerrores_mant_detalleds_8_tfmadetclinom_sel = AV37TFMADetCliNom_Sel ;
      AV145Anticipacionerrores_mant_detalleds_9_tfmadetartcod = AV38TFMADetArtCod ;
      AV146Anticipacionerrores_mant_detalleds_10_tfmadetartcod_sel = AV39TFMADetArtCod_Sel ;
      AV147Anticipacionerrores_mant_detalleds_11_tfmadetartdsc = AV77TFMADetArtDsc ;
      AV148Anticipacionerrores_mant_detalleds_12_tfmadetartdsc_sel = AV78TFMADetArtDsc_Sel ;
      AV149Anticipacionerrores_mant_detalleds_13_tfmadetcolnum = AV44TFMADetColNum ;
      AV150Anticipacionerrores_mant_detalleds_14_tfmadetcolnum_to = AV45TFMADetColNum_To ;
      AV151Anticipacionerrores_mant_detalleds_15_tfmadetcolnom = AV42TFMADetColNom ;
      AV152Anticipacionerrores_mant_detalleds_16_tfmadetcolnom_sel = AV43TFMADetColNom_Sel ;
      AV153Anticipacionerrores_mant_detalleds_17_tfmadetcolcod = AV46TFMADetColCod ;
      AV154Anticipacionerrores_mant_detalleds_18_tfmadetcolcod_to = AV47TFMADetColCod_To ;
      AV155Anticipacionerrores_mant_detalleds_19_tfmadetmatcod = AV48TFMADetMatCod ;
      AV156Anticipacionerrores_mant_detalleds_20_tfmadetmatcod_to = AV49TFMADetMatCod_To ;
      AV157Anticipacionerrores_mant_detalleds_21_tfmadetmatdsc = AV80TFMADetMatDsc ;
      AV158Anticipacionerrores_mant_detalleds_22_tfmadetmatdsc_sel = AV81TFMADetMatDsc_Sel ;
      AV159Anticipacionerrores_mant_detalleds_23_tfmadetintcod = AV52TFMADetIntCod ;
      AV160Anticipacionerrores_mant_detalleds_24_tfmadetintcod_to = AV53TFMADetIntCod_To ;
      AV161Anticipacionerrores_mant_detalleds_25_tfmadetintdsc = AV82TFMADetIntDsc ;
      AV162Anticipacionerrores_mant_detalleds_26_tfmadetintdsc_sel = AV83TFMADetIntDsc_Sel ;
      AV163Anticipacionerrores_mant_detalleds_27_tfmadetmaqcod = AV56TFMADetMaqCod ;
      AV164Anticipacionerrores_mant_detalleds_28_tfmadetmaqcod_sel = AV57TFMADetMaqCod_Sel ;
      AV165Anticipacionerrores_mant_detalleds_29_tfmadetmaqdsc = AV58TFMADetMaqDsc ;
      AV166Anticipacionerrores_mant_detalleds_30_tfmadetmaqdsc_sel = AV59TFMADetMaqDsc_Sel ;
      AV167Anticipacionerrores_mant_detalleds_31_tfmadettipmcod = AV60TFMADetTipMCod ;
      AV168Anticipacionerrores_mant_detalleds_32_tfmadettipmcod_sel = AV61TFMADetTipMCod_Sel ;
      AV169Anticipacionerrores_mant_detalleds_33_tfmadettipmdsc = AV62TFMADetTipMDsc ;
      AV170Anticipacionerrores_mant_detalleds_34_tfmadettipmdsc_sel = AV63TFMADetTipMDsc_Sel ;
      AV171Anticipacionerrores_mant_detalleds_35_tfmadetdefcod = AV107TFMADetDefCod ;
      AV172Anticipacionerrores_mant_detalleds_36_tfmadetdefcod_to = AV108TFMADetDefCod_To ;
      AV173Anticipacionerrores_mant_detalleds_37_tfmadetdefdsc = AV109TFMADetDefDsc ;
      AV174Anticipacionerrores_mant_detalleds_38_tfmadetdefdsc_sel = AV110TFMADetDefDsc_Sel ;
      AV175Anticipacionerrores_mant_detalleds_39_tfmadetcatcod = AV111TFMADetCatCod ;
      AV176Anticipacionerrores_mant_detalleds_40_tfmadetcatcod_to = AV112TFMADetCatCod_To ;
      AV177Anticipacionerrores_mant_detalleds_41_tfmadetcatdsc = AV113TFMADetCatDsc ;
      AV178Anticipacionerrores_mant_detalleds_42_tfmadetcatdsc_sel = AV114TFMADetCatDsc_Sel ;
      AV179Anticipacionerrores_mant_detalleds_43_tfmadethdr = AV116TFMADetHdr ;
      AV180Anticipacionerrores_mant_detalleds_44_tfmadethdr_sel = AV117TFMADetHdr_Sel ;
      AV181Anticipacionerrores_mant_detalleds_45_tfmadetkilprod = AV64TFMADetKilProd ;
      AV182Anticipacionerrores_mant_detalleds_46_tfmadetkilprod_to = AV65TFMADetKilProd_To ;
      AV183Anticipacionerrores_mant_detalleds_47_tfmadetkilreo = AV66TFMADetKilReo ;
      AV184Anticipacionerrores_mant_detalleds_48_tfmadetkilreo_to = AV67TFMADetKilReo_To ;
      AV185Anticipacionerrores_mant_detalleds_49_tfmadetkiltot = AV93TFMADetKilTot ;
      AV186Anticipacionerrores_mant_detalleds_50_tfmadetkiltot_to = AV94TFMADetKilTot_To ;
      AV187Anticipacionerrores_mant_detalleds_51_tfmadetmetprod = AV122TFMADetMetProd ;
      AV188Anticipacionerrores_mant_detalleds_52_tfmadetmetprod_to = AV123TFMADetMetProd_To ;
      AV189Anticipacionerrores_mant_detalleds_53_tfmadetmetreo = AV124TFMADetMetReo ;
      AV190Anticipacionerrores_mant_detalleds_54_tfmadetmetreo_to = AV125TFMADetMetReo_To ;
      AV191Anticipacionerrores_mant_detalleds_55_tfmadetmettot = AV126TFMADetMetTot ;
      AV192Anticipacionerrores_mant_detalleds_56_tfmadetmettot_to = AV127TFMADetMetTot_To ;
      GRID_nRecordCount = subgrid_fnc_recordcount( ) ;
      if ( ( GRID_nRecordCount >= subgrid_fnc_recordsperpage( ) ) && ( GRID_nEOF == 0 ) )
      {
         GRID_nFirstRecordOnPage = (long)(GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )) ;
      }
      else
      {
         return (short)(2) ;
      }
      if ( GRID_nEOF == 1 )
      {
         GRID_nFirstRecordOnPage = GRID_nCurrentRecord ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("GRID_nFirstRecordOnPage", GRID_nFirstRecordOnPage);
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV15FilterFullText, AV70MADetEmprCod, AV71CliCod, AV72ArtCod, AV73ForColNum, AV115MADetMaqCod, AV103MADetDefCod, AV104MADetCatCod, AV79TipMaqCodCollection, AV91sdtMTok, AV25ManageFiltersExecutionStep, AV20ColumnsSelector, AV28TFMADetFec, AV32TFMADetEmprCod, AV33TFMADetEmprCod_Sel, AV34TFMADetCliCod, AV35TFMADetCliCod_To, AV36TFMADetCliNom, AV37TFMADetCliNom_Sel, AV38TFMADetArtCod, AV39TFMADetArtCod_Sel, AV77TFMADetArtDsc, AV78TFMADetArtDsc_Sel, AV44TFMADetColNum, AV45TFMADetColNum_To, AV42TFMADetColNom, AV43TFMADetColNom_Sel, AV46TFMADetColCod, AV47TFMADetColCod_To, AV48TFMADetMatCod, AV49TFMADetMatCod_To, AV80TFMADetMatDsc, AV81TFMADetMatDsc_Sel, AV52TFMADetIntCod, AV53TFMADetIntCod_To, AV82TFMADetIntDsc, AV83TFMADetIntDsc_Sel, AV56TFMADetMaqCod, AV57TFMADetMaqCod_Sel, AV58TFMADetMaqDsc, AV59TFMADetMaqDsc_Sel, AV60TFMADetTipMCod, AV61TFMADetTipMCod_Sel, AV62TFMADetTipMDsc, AV63TFMADetTipMDsc_Sel, AV107TFMADetDefCod, AV108TFMADetDefCod_To, AV109TFMADetDefDsc, AV110TFMADetDefDsc_Sel, AV111TFMADetCatCod, AV112TFMADetCatCod_To, AV113TFMADetCatDsc, AV114TFMADetCatDsc_Sel, AV116TFMADetHdr, AV117TFMADetHdr_Sel, AV64TFMADetKilProd, AV65TFMADetKilProd_To, AV66TFMADetKilReo, AV67TFMADetKilReo_To, AV93TFMADetKilTot, AV94TFMADetKilTot_To, AV122TFMADetMetProd, AV123TFMADetMetProd_To, AV124TFMADetMetReo, AV125TFMADetMetReo_To, AV126TFMADetMetTot, AV127TFMADetMetTot_To, AV132Pgmname, AV12OrderedBy, AV13OrderedDsc, AV74TipMaqCodJSON, AV75FechaInicio, AV76FechaFin, AV105MTknUsu, AV106MTkn, AV87TotMADetKilProd, AV89TotMADetKilReo, AV120TotMADetKilTot, AV128TotMADetMetReo, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid_previouspage( )
   {
      AV137Anticipacionerrores_mant_detalleds_1_filterfulltext = AV15FilterFullText ;
      AV138Anticipacionerrores_mant_detalleds_2_tfmadetfec = AV28TFMADetFec ;
      AV139Anticipacionerrores_mant_detalleds_3_tfmadetemprcod = AV32TFMADetEmprCod ;
      AV140Anticipacionerrores_mant_detalleds_4_tfmadetemprcod_sel = AV33TFMADetEmprCod_Sel ;
      AV141Anticipacionerrores_mant_detalleds_5_tfmadetclicod = AV34TFMADetCliCod ;
      AV142Anticipacionerrores_mant_detalleds_6_tfmadetclicod_to = AV35TFMADetCliCod_To ;
      AV143Anticipacionerrores_mant_detalleds_7_tfmadetclinom = AV36TFMADetCliNom ;
      AV144Anticipacionerrores_mant_detalleds_8_tfmadetclinom_sel = AV37TFMADetCliNom_Sel ;
      AV145Anticipacionerrores_mant_detalleds_9_tfmadetartcod = AV38TFMADetArtCod ;
      AV146Anticipacionerrores_mant_detalleds_10_tfmadetartcod_sel = AV39TFMADetArtCod_Sel ;
      AV147Anticipacionerrores_mant_detalleds_11_tfmadetartdsc = AV77TFMADetArtDsc ;
      AV148Anticipacionerrores_mant_detalleds_12_tfmadetartdsc_sel = AV78TFMADetArtDsc_Sel ;
      AV149Anticipacionerrores_mant_detalleds_13_tfmadetcolnum = AV44TFMADetColNum ;
      AV150Anticipacionerrores_mant_detalleds_14_tfmadetcolnum_to = AV45TFMADetColNum_To ;
      AV151Anticipacionerrores_mant_detalleds_15_tfmadetcolnom = AV42TFMADetColNom ;
      AV152Anticipacionerrores_mant_detalleds_16_tfmadetcolnom_sel = AV43TFMADetColNom_Sel ;
      AV153Anticipacionerrores_mant_detalleds_17_tfmadetcolcod = AV46TFMADetColCod ;
      AV154Anticipacionerrores_mant_detalleds_18_tfmadetcolcod_to = AV47TFMADetColCod_To ;
      AV155Anticipacionerrores_mant_detalleds_19_tfmadetmatcod = AV48TFMADetMatCod ;
      AV156Anticipacionerrores_mant_detalleds_20_tfmadetmatcod_to = AV49TFMADetMatCod_To ;
      AV157Anticipacionerrores_mant_detalleds_21_tfmadetmatdsc = AV80TFMADetMatDsc ;
      AV158Anticipacionerrores_mant_detalleds_22_tfmadetmatdsc_sel = AV81TFMADetMatDsc_Sel ;
      AV159Anticipacionerrores_mant_detalleds_23_tfmadetintcod = AV52TFMADetIntCod ;
      AV160Anticipacionerrores_mant_detalleds_24_tfmadetintcod_to = AV53TFMADetIntCod_To ;
      AV161Anticipacionerrores_mant_detalleds_25_tfmadetintdsc = AV82TFMADetIntDsc ;
      AV162Anticipacionerrores_mant_detalleds_26_tfmadetintdsc_sel = AV83TFMADetIntDsc_Sel ;
      AV163Anticipacionerrores_mant_detalleds_27_tfmadetmaqcod = AV56TFMADetMaqCod ;
      AV164Anticipacionerrores_mant_detalleds_28_tfmadetmaqcod_sel = AV57TFMADetMaqCod_Sel ;
      AV165Anticipacionerrores_mant_detalleds_29_tfmadetmaqdsc = AV58TFMADetMaqDsc ;
      AV166Anticipacionerrores_mant_detalleds_30_tfmadetmaqdsc_sel = AV59TFMADetMaqDsc_Sel ;
      AV167Anticipacionerrores_mant_detalleds_31_tfmadettipmcod = AV60TFMADetTipMCod ;
      AV168Anticipacionerrores_mant_detalleds_32_tfmadettipmcod_sel = AV61TFMADetTipMCod_Sel ;
      AV169Anticipacionerrores_mant_detalleds_33_tfmadettipmdsc = AV62TFMADetTipMDsc ;
      AV170Anticipacionerrores_mant_detalleds_34_tfmadettipmdsc_sel = AV63TFMADetTipMDsc_Sel ;
      AV171Anticipacionerrores_mant_detalleds_35_tfmadetdefcod = AV107TFMADetDefCod ;
      AV172Anticipacionerrores_mant_detalleds_36_tfmadetdefcod_to = AV108TFMADetDefCod_To ;
      AV173Anticipacionerrores_mant_detalleds_37_tfmadetdefdsc = AV109TFMADetDefDsc ;
      AV174Anticipacionerrores_mant_detalleds_38_tfmadetdefdsc_sel = AV110TFMADetDefDsc_Sel ;
      AV175Anticipacionerrores_mant_detalleds_39_tfmadetcatcod = AV111TFMADetCatCod ;
      AV176Anticipacionerrores_mant_detalleds_40_tfmadetcatcod_to = AV112TFMADetCatCod_To ;
      AV177Anticipacionerrores_mant_detalleds_41_tfmadetcatdsc = AV113TFMADetCatDsc ;
      AV178Anticipacionerrores_mant_detalleds_42_tfmadetcatdsc_sel = AV114TFMADetCatDsc_Sel ;
      AV179Anticipacionerrores_mant_detalleds_43_tfmadethdr = AV116TFMADetHdr ;
      AV180Anticipacionerrores_mant_detalleds_44_tfmadethdr_sel = AV117TFMADetHdr_Sel ;
      AV181Anticipacionerrores_mant_detalleds_45_tfmadetkilprod = AV64TFMADetKilProd ;
      AV182Anticipacionerrores_mant_detalleds_46_tfmadetkilprod_to = AV65TFMADetKilProd_To ;
      AV183Anticipacionerrores_mant_detalleds_47_tfmadetkilreo = AV66TFMADetKilReo ;
      AV184Anticipacionerrores_mant_detalleds_48_tfmadetkilreo_to = AV67TFMADetKilReo_To ;
      AV185Anticipacionerrores_mant_detalleds_49_tfmadetkiltot = AV93TFMADetKilTot ;
      AV186Anticipacionerrores_mant_detalleds_50_tfmadetkiltot_to = AV94TFMADetKilTot_To ;
      AV187Anticipacionerrores_mant_detalleds_51_tfmadetmetprod = AV122TFMADetMetProd ;
      AV188Anticipacionerrores_mant_detalleds_52_tfmadetmetprod_to = AV123TFMADetMetProd_To ;
      AV189Anticipacionerrores_mant_detalleds_53_tfmadetmetreo = AV124TFMADetMetReo ;
      AV190Anticipacionerrores_mant_detalleds_54_tfmadetmetreo_to = AV125TFMADetMetReo_To ;
      AV191Anticipacionerrores_mant_detalleds_55_tfmadetmettot = AV126TFMADetMetTot ;
      AV192Anticipacionerrores_mant_detalleds_56_tfmadetmettot_to = AV127TFMADetMetTot_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV15FilterFullText, AV70MADetEmprCod, AV71CliCod, AV72ArtCod, AV73ForColNum, AV115MADetMaqCod, AV103MADetDefCod, AV104MADetCatCod, AV79TipMaqCodCollection, AV91sdtMTok, AV25ManageFiltersExecutionStep, AV20ColumnsSelector, AV28TFMADetFec, AV32TFMADetEmprCod, AV33TFMADetEmprCod_Sel, AV34TFMADetCliCod, AV35TFMADetCliCod_To, AV36TFMADetCliNom, AV37TFMADetCliNom_Sel, AV38TFMADetArtCod, AV39TFMADetArtCod_Sel, AV77TFMADetArtDsc, AV78TFMADetArtDsc_Sel, AV44TFMADetColNum, AV45TFMADetColNum_To, AV42TFMADetColNom, AV43TFMADetColNom_Sel, AV46TFMADetColCod, AV47TFMADetColCod_To, AV48TFMADetMatCod, AV49TFMADetMatCod_To, AV80TFMADetMatDsc, AV81TFMADetMatDsc_Sel, AV52TFMADetIntCod, AV53TFMADetIntCod_To, AV82TFMADetIntDsc, AV83TFMADetIntDsc_Sel, AV56TFMADetMaqCod, AV57TFMADetMaqCod_Sel, AV58TFMADetMaqDsc, AV59TFMADetMaqDsc_Sel, AV60TFMADetTipMCod, AV61TFMADetTipMCod_Sel, AV62TFMADetTipMDsc, AV63TFMADetTipMDsc_Sel, AV107TFMADetDefCod, AV108TFMADetDefCod_To, AV109TFMADetDefDsc, AV110TFMADetDefDsc_Sel, AV111TFMADetCatCod, AV112TFMADetCatCod_To, AV113TFMADetCatDsc, AV114TFMADetCatDsc_Sel, AV116TFMADetHdr, AV117TFMADetHdr_Sel, AV64TFMADetKilProd, AV65TFMADetKilProd_To, AV66TFMADetKilReo, AV67TFMADetKilReo_To, AV93TFMADetKilTot, AV94TFMADetKilTot_To, AV122TFMADetMetProd, AV123TFMADetMetProd_To, AV124TFMADetMetReo, AV125TFMADetMetReo_To, AV126TFMADetMetTot, AV127TFMADetMetTot_To, AV132Pgmname, AV12OrderedBy, AV13OrderedDsc, AV74TipMaqCodJSON, AV75FechaInicio, AV76FechaFin, AV105MTknUsu, AV106MTkn, AV87TotMADetKilProd, AV89TotMADetKilReo, AV120TotMADetKilTot, AV128TotMADetMetReo, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      AV137Anticipacionerrores_mant_detalleds_1_filterfulltext = AV15FilterFullText ;
      AV138Anticipacionerrores_mant_detalleds_2_tfmadetfec = AV28TFMADetFec ;
      AV139Anticipacionerrores_mant_detalleds_3_tfmadetemprcod = AV32TFMADetEmprCod ;
      AV140Anticipacionerrores_mant_detalleds_4_tfmadetemprcod_sel = AV33TFMADetEmprCod_Sel ;
      AV141Anticipacionerrores_mant_detalleds_5_tfmadetclicod = AV34TFMADetCliCod ;
      AV142Anticipacionerrores_mant_detalleds_6_tfmadetclicod_to = AV35TFMADetCliCod_To ;
      AV143Anticipacionerrores_mant_detalleds_7_tfmadetclinom = AV36TFMADetCliNom ;
      AV144Anticipacionerrores_mant_detalleds_8_tfmadetclinom_sel = AV37TFMADetCliNom_Sel ;
      AV145Anticipacionerrores_mant_detalleds_9_tfmadetartcod = AV38TFMADetArtCod ;
      AV146Anticipacionerrores_mant_detalleds_10_tfmadetartcod_sel = AV39TFMADetArtCod_Sel ;
      AV147Anticipacionerrores_mant_detalleds_11_tfmadetartdsc = AV77TFMADetArtDsc ;
      AV148Anticipacionerrores_mant_detalleds_12_tfmadetartdsc_sel = AV78TFMADetArtDsc_Sel ;
      AV149Anticipacionerrores_mant_detalleds_13_tfmadetcolnum = AV44TFMADetColNum ;
      AV150Anticipacionerrores_mant_detalleds_14_tfmadetcolnum_to = AV45TFMADetColNum_To ;
      AV151Anticipacionerrores_mant_detalleds_15_tfmadetcolnom = AV42TFMADetColNom ;
      AV152Anticipacionerrores_mant_detalleds_16_tfmadetcolnom_sel = AV43TFMADetColNom_Sel ;
      AV153Anticipacionerrores_mant_detalleds_17_tfmadetcolcod = AV46TFMADetColCod ;
      AV154Anticipacionerrores_mant_detalleds_18_tfmadetcolcod_to = AV47TFMADetColCod_To ;
      AV155Anticipacionerrores_mant_detalleds_19_tfmadetmatcod = AV48TFMADetMatCod ;
      AV156Anticipacionerrores_mant_detalleds_20_tfmadetmatcod_to = AV49TFMADetMatCod_To ;
      AV157Anticipacionerrores_mant_detalleds_21_tfmadetmatdsc = AV80TFMADetMatDsc ;
      AV158Anticipacionerrores_mant_detalleds_22_tfmadetmatdsc_sel = AV81TFMADetMatDsc_Sel ;
      AV159Anticipacionerrores_mant_detalleds_23_tfmadetintcod = AV52TFMADetIntCod ;
      AV160Anticipacionerrores_mant_detalleds_24_tfmadetintcod_to = AV53TFMADetIntCod_To ;
      AV161Anticipacionerrores_mant_detalleds_25_tfmadetintdsc = AV82TFMADetIntDsc ;
      AV162Anticipacionerrores_mant_detalleds_26_tfmadetintdsc_sel = AV83TFMADetIntDsc_Sel ;
      AV163Anticipacionerrores_mant_detalleds_27_tfmadetmaqcod = AV56TFMADetMaqCod ;
      AV164Anticipacionerrores_mant_detalleds_28_tfmadetmaqcod_sel = AV57TFMADetMaqCod_Sel ;
      AV165Anticipacionerrores_mant_detalleds_29_tfmadetmaqdsc = AV58TFMADetMaqDsc ;
      AV166Anticipacionerrores_mant_detalleds_30_tfmadetmaqdsc_sel = AV59TFMADetMaqDsc_Sel ;
      AV167Anticipacionerrores_mant_detalleds_31_tfmadettipmcod = AV60TFMADetTipMCod ;
      AV168Anticipacionerrores_mant_detalleds_32_tfmadettipmcod_sel = AV61TFMADetTipMCod_Sel ;
      AV169Anticipacionerrores_mant_detalleds_33_tfmadettipmdsc = AV62TFMADetTipMDsc ;
      AV170Anticipacionerrores_mant_detalleds_34_tfmadettipmdsc_sel = AV63TFMADetTipMDsc_Sel ;
      AV171Anticipacionerrores_mant_detalleds_35_tfmadetdefcod = AV107TFMADetDefCod ;
      AV172Anticipacionerrores_mant_detalleds_36_tfmadetdefcod_to = AV108TFMADetDefCod_To ;
      AV173Anticipacionerrores_mant_detalleds_37_tfmadetdefdsc = AV109TFMADetDefDsc ;
      AV174Anticipacionerrores_mant_detalleds_38_tfmadetdefdsc_sel = AV110TFMADetDefDsc_Sel ;
      AV175Anticipacionerrores_mant_detalleds_39_tfmadetcatcod = AV111TFMADetCatCod ;
      AV176Anticipacionerrores_mant_detalleds_40_tfmadetcatcod_to = AV112TFMADetCatCod_To ;
      AV177Anticipacionerrores_mant_detalleds_41_tfmadetcatdsc = AV113TFMADetCatDsc ;
      AV178Anticipacionerrores_mant_detalleds_42_tfmadetcatdsc_sel = AV114TFMADetCatDsc_Sel ;
      AV179Anticipacionerrores_mant_detalleds_43_tfmadethdr = AV116TFMADetHdr ;
      AV180Anticipacionerrores_mant_detalleds_44_tfmadethdr_sel = AV117TFMADetHdr_Sel ;
      AV181Anticipacionerrores_mant_detalleds_45_tfmadetkilprod = AV64TFMADetKilProd ;
      AV182Anticipacionerrores_mant_detalleds_46_tfmadetkilprod_to = AV65TFMADetKilProd_To ;
      AV183Anticipacionerrores_mant_detalleds_47_tfmadetkilreo = AV66TFMADetKilReo ;
      AV184Anticipacionerrores_mant_detalleds_48_tfmadetkilreo_to = AV67TFMADetKilReo_To ;
      AV185Anticipacionerrores_mant_detalleds_49_tfmadetkiltot = AV93TFMADetKilTot ;
      AV186Anticipacionerrores_mant_detalleds_50_tfmadetkiltot_to = AV94TFMADetKilTot_To ;
      AV187Anticipacionerrores_mant_detalleds_51_tfmadetmetprod = AV122TFMADetMetProd ;
      AV188Anticipacionerrores_mant_detalleds_52_tfmadetmetprod_to = AV123TFMADetMetProd_To ;
      AV189Anticipacionerrores_mant_detalleds_53_tfmadetmetreo = AV124TFMADetMetReo ;
      AV190Anticipacionerrores_mant_detalleds_54_tfmadetmetreo_to = AV125TFMADetMetReo_To ;
      AV191Anticipacionerrores_mant_detalleds_55_tfmadetmettot = AV126TFMADetMetTot ;
      AV192Anticipacionerrores_mant_detalleds_56_tfmadetmettot_to = AV127TFMADetMetTot_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV15FilterFullText, AV70MADetEmprCod, AV71CliCod, AV72ArtCod, AV73ForColNum, AV115MADetMaqCod, AV103MADetDefCod, AV104MADetCatCod, AV79TipMaqCodCollection, AV91sdtMTok, AV25ManageFiltersExecutionStep, AV20ColumnsSelector, AV28TFMADetFec, AV32TFMADetEmprCod, AV33TFMADetEmprCod_Sel, AV34TFMADetCliCod, AV35TFMADetCliCod_To, AV36TFMADetCliNom, AV37TFMADetCliNom_Sel, AV38TFMADetArtCod, AV39TFMADetArtCod_Sel, AV77TFMADetArtDsc, AV78TFMADetArtDsc_Sel, AV44TFMADetColNum, AV45TFMADetColNum_To, AV42TFMADetColNom, AV43TFMADetColNom_Sel, AV46TFMADetColCod, AV47TFMADetColCod_To, AV48TFMADetMatCod, AV49TFMADetMatCod_To, AV80TFMADetMatDsc, AV81TFMADetMatDsc_Sel, AV52TFMADetIntCod, AV53TFMADetIntCod_To, AV82TFMADetIntDsc, AV83TFMADetIntDsc_Sel, AV56TFMADetMaqCod, AV57TFMADetMaqCod_Sel, AV58TFMADetMaqDsc, AV59TFMADetMaqDsc_Sel, AV60TFMADetTipMCod, AV61TFMADetTipMCod_Sel, AV62TFMADetTipMDsc, AV63TFMADetTipMDsc_Sel, AV107TFMADetDefCod, AV108TFMADetDefCod_To, AV109TFMADetDefDsc, AV110TFMADetDefDsc_Sel, AV111TFMADetCatCod, AV112TFMADetCatCod_To, AV113TFMADetCatDsc, AV114TFMADetCatDsc_Sel, AV116TFMADetHdr, AV117TFMADetHdr_Sel, AV64TFMADetKilProd, AV65TFMADetKilProd_To, AV66TFMADetKilReo, AV67TFMADetKilReo_To, AV93TFMADetKilTot, AV94TFMADetKilTot_To, AV122TFMADetMetProd, AV123TFMADetMetProd_To, AV124TFMADetMetReo, AV125TFMADetMetReo_To, AV126TFMADetMetTot, AV127TFMADetMetTot_To, AV132Pgmname, AV12OrderedBy, AV13OrderedDsc, AV74TipMaqCodJSON, AV75FechaInicio, AV76FechaFin, AV105MTknUsu, AV106MTkn, AV87TotMADetKilProd, AV89TotMADetKilReo, AV120TotMADetKilTot, AV128TotMADetMetReo, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid_gotopage( int nPageNo )
   {
      AV137Anticipacionerrores_mant_detalleds_1_filterfulltext = AV15FilterFullText ;
      AV138Anticipacionerrores_mant_detalleds_2_tfmadetfec = AV28TFMADetFec ;
      AV139Anticipacionerrores_mant_detalleds_3_tfmadetemprcod = AV32TFMADetEmprCod ;
      AV140Anticipacionerrores_mant_detalleds_4_tfmadetemprcod_sel = AV33TFMADetEmprCod_Sel ;
      AV141Anticipacionerrores_mant_detalleds_5_tfmadetclicod = AV34TFMADetCliCod ;
      AV142Anticipacionerrores_mant_detalleds_6_tfmadetclicod_to = AV35TFMADetCliCod_To ;
      AV143Anticipacionerrores_mant_detalleds_7_tfmadetclinom = AV36TFMADetCliNom ;
      AV144Anticipacionerrores_mant_detalleds_8_tfmadetclinom_sel = AV37TFMADetCliNom_Sel ;
      AV145Anticipacionerrores_mant_detalleds_9_tfmadetartcod = AV38TFMADetArtCod ;
      AV146Anticipacionerrores_mant_detalleds_10_tfmadetartcod_sel = AV39TFMADetArtCod_Sel ;
      AV147Anticipacionerrores_mant_detalleds_11_tfmadetartdsc = AV77TFMADetArtDsc ;
      AV148Anticipacionerrores_mant_detalleds_12_tfmadetartdsc_sel = AV78TFMADetArtDsc_Sel ;
      AV149Anticipacionerrores_mant_detalleds_13_tfmadetcolnum = AV44TFMADetColNum ;
      AV150Anticipacionerrores_mant_detalleds_14_tfmadetcolnum_to = AV45TFMADetColNum_To ;
      AV151Anticipacionerrores_mant_detalleds_15_tfmadetcolnom = AV42TFMADetColNom ;
      AV152Anticipacionerrores_mant_detalleds_16_tfmadetcolnom_sel = AV43TFMADetColNom_Sel ;
      AV153Anticipacionerrores_mant_detalleds_17_tfmadetcolcod = AV46TFMADetColCod ;
      AV154Anticipacionerrores_mant_detalleds_18_tfmadetcolcod_to = AV47TFMADetColCod_To ;
      AV155Anticipacionerrores_mant_detalleds_19_tfmadetmatcod = AV48TFMADetMatCod ;
      AV156Anticipacionerrores_mant_detalleds_20_tfmadetmatcod_to = AV49TFMADetMatCod_To ;
      AV157Anticipacionerrores_mant_detalleds_21_tfmadetmatdsc = AV80TFMADetMatDsc ;
      AV158Anticipacionerrores_mant_detalleds_22_tfmadetmatdsc_sel = AV81TFMADetMatDsc_Sel ;
      AV159Anticipacionerrores_mant_detalleds_23_tfmadetintcod = AV52TFMADetIntCod ;
      AV160Anticipacionerrores_mant_detalleds_24_tfmadetintcod_to = AV53TFMADetIntCod_To ;
      AV161Anticipacionerrores_mant_detalleds_25_tfmadetintdsc = AV82TFMADetIntDsc ;
      AV162Anticipacionerrores_mant_detalleds_26_tfmadetintdsc_sel = AV83TFMADetIntDsc_Sel ;
      AV163Anticipacionerrores_mant_detalleds_27_tfmadetmaqcod = AV56TFMADetMaqCod ;
      AV164Anticipacionerrores_mant_detalleds_28_tfmadetmaqcod_sel = AV57TFMADetMaqCod_Sel ;
      AV165Anticipacionerrores_mant_detalleds_29_tfmadetmaqdsc = AV58TFMADetMaqDsc ;
      AV166Anticipacionerrores_mant_detalleds_30_tfmadetmaqdsc_sel = AV59TFMADetMaqDsc_Sel ;
      AV167Anticipacionerrores_mant_detalleds_31_tfmadettipmcod = AV60TFMADetTipMCod ;
      AV168Anticipacionerrores_mant_detalleds_32_tfmadettipmcod_sel = AV61TFMADetTipMCod_Sel ;
      AV169Anticipacionerrores_mant_detalleds_33_tfmadettipmdsc = AV62TFMADetTipMDsc ;
      AV170Anticipacionerrores_mant_detalleds_34_tfmadettipmdsc_sel = AV63TFMADetTipMDsc_Sel ;
      AV171Anticipacionerrores_mant_detalleds_35_tfmadetdefcod = AV107TFMADetDefCod ;
      AV172Anticipacionerrores_mant_detalleds_36_tfmadetdefcod_to = AV108TFMADetDefCod_To ;
      AV173Anticipacionerrores_mant_detalleds_37_tfmadetdefdsc = AV109TFMADetDefDsc ;
      AV174Anticipacionerrores_mant_detalleds_38_tfmadetdefdsc_sel = AV110TFMADetDefDsc_Sel ;
      AV175Anticipacionerrores_mant_detalleds_39_tfmadetcatcod = AV111TFMADetCatCod ;
      AV176Anticipacionerrores_mant_detalleds_40_tfmadetcatcod_to = AV112TFMADetCatCod_To ;
      AV177Anticipacionerrores_mant_detalleds_41_tfmadetcatdsc = AV113TFMADetCatDsc ;
      AV178Anticipacionerrores_mant_detalleds_42_tfmadetcatdsc_sel = AV114TFMADetCatDsc_Sel ;
      AV179Anticipacionerrores_mant_detalleds_43_tfmadethdr = AV116TFMADetHdr ;
      AV180Anticipacionerrores_mant_detalleds_44_tfmadethdr_sel = AV117TFMADetHdr_Sel ;
      AV181Anticipacionerrores_mant_detalleds_45_tfmadetkilprod = AV64TFMADetKilProd ;
      AV182Anticipacionerrores_mant_detalleds_46_tfmadetkilprod_to = AV65TFMADetKilProd_To ;
      AV183Anticipacionerrores_mant_detalleds_47_tfmadetkilreo = AV66TFMADetKilReo ;
      AV184Anticipacionerrores_mant_detalleds_48_tfmadetkilreo_to = AV67TFMADetKilReo_To ;
      AV185Anticipacionerrores_mant_detalleds_49_tfmadetkiltot = AV93TFMADetKilTot ;
      AV186Anticipacionerrores_mant_detalleds_50_tfmadetkiltot_to = AV94TFMADetKilTot_To ;
      AV187Anticipacionerrores_mant_detalleds_51_tfmadetmetprod = AV122TFMADetMetProd ;
      AV188Anticipacionerrores_mant_detalleds_52_tfmadetmetprod_to = AV123TFMADetMetProd_To ;
      AV189Anticipacionerrores_mant_detalleds_53_tfmadetmetreo = AV124TFMADetMetReo ;
      AV190Anticipacionerrores_mant_detalleds_54_tfmadetmetreo_to = AV125TFMADetMetReo_To ;
      AV191Anticipacionerrores_mant_detalleds_55_tfmadetmettot = AV126TFMADetMetTot ;
      AV192Anticipacionerrores_mant_detalleds_56_tfmadetmettot_to = AV127TFMADetMetTot_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV15FilterFullText, AV70MADetEmprCod, AV71CliCod, AV72ArtCod, AV73ForColNum, AV115MADetMaqCod, AV103MADetDefCod, AV104MADetCatCod, AV79TipMaqCodCollection, AV91sdtMTok, AV25ManageFiltersExecutionStep, AV20ColumnsSelector, AV28TFMADetFec, AV32TFMADetEmprCod, AV33TFMADetEmprCod_Sel, AV34TFMADetCliCod, AV35TFMADetCliCod_To, AV36TFMADetCliNom, AV37TFMADetCliNom_Sel, AV38TFMADetArtCod, AV39TFMADetArtCod_Sel, AV77TFMADetArtDsc, AV78TFMADetArtDsc_Sel, AV44TFMADetColNum, AV45TFMADetColNum_To, AV42TFMADetColNom, AV43TFMADetColNom_Sel, AV46TFMADetColCod, AV47TFMADetColCod_To, AV48TFMADetMatCod, AV49TFMADetMatCod_To, AV80TFMADetMatDsc, AV81TFMADetMatDsc_Sel, AV52TFMADetIntCod, AV53TFMADetIntCod_To, AV82TFMADetIntDsc, AV83TFMADetIntDsc_Sel, AV56TFMADetMaqCod, AV57TFMADetMaqCod_Sel, AV58TFMADetMaqDsc, AV59TFMADetMaqDsc_Sel, AV60TFMADetTipMCod, AV61TFMADetTipMCod_Sel, AV62TFMADetTipMDsc, AV63TFMADetTipMDsc_Sel, AV107TFMADetDefCod, AV108TFMADetDefCod_To, AV109TFMADetDefDsc, AV110TFMADetDefDsc_Sel, AV111TFMADetCatCod, AV112TFMADetCatCod_To, AV113TFMADetCatDsc, AV114TFMADetCatDsc_Sel, AV116TFMADetHdr, AV117TFMADetHdr_Sel, AV64TFMADetKilProd, AV65TFMADetKilProd_To, AV66TFMADetKilReo, AV67TFMADetKilReo_To, AV93TFMADetKilTot, AV94TFMADetKilTot_To, AV122TFMADetMetProd, AV123TFMADetMetProd_To, AV124TFMADetMetReo, AV125TFMADetMetReo_To, AV126TFMADetMetTot, AV127TFMADetMetTot_To, AV132Pgmname, AV12OrderedBy, AV13OrderedDsc, AV74TipMaqCodJSON, AV75FechaInicio, AV76FechaFin, AV105MTknUsu, AV106MTkn, AV87TotMADetKilProd, AV89TotMADetKilReo, AV120TotMADetKilTot, AV128TotMADetMetReo, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV132Pgmname = "AnticipacionErrores.MAnt_Detalle" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV132Pgmname", AV132Pgmname);
      Gx_err = (short)(0) ;
      edtavTotvaluemadetfec_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvaluemadetfec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluemadetfec_Enabled), 5, 0), true);
      edtavTotvaluemadetkilprod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvaluemadetkilprod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluemadetkilprod_Enabled), 5, 0), true);
      edtavTotvaluemadetkilreo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvaluemadetkilreo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluemadetkilreo_Enabled), 5, 0), true);
      edtavTotvaluemadetkiltot_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvaluemadetkiltot_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluemadetkiltot_Enabled), 5, 0), true);
      edtavTotvaluemadetmetreo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvaluemadetmetreo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluemadetmetreo_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup2DR0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e162DR2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vMANAGEFILTERSDATA"), AV23ManageFiltersData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vDDO_TITLESETTINGSICONS"), AV68DDO_TitleSettingsIcons);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vCOLUMNSSELECTOR"), AV20ColumnsSelector);
         /* Read saved values. */
         nRC_GXsfl_39 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_39"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV70MADetEmprCod = httpContext.cgiGet( sPrefix+"wcpOAV70MADetEmprCod") ;
         wcpOAV71CliCod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV71CliCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV72ArtCod = httpContext.cgiGet( sPrefix+"wcpOAV72ArtCod") ;
         wcpOAV73ForColNum = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV73ForColNum"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV74TipMaqCodJSON = httpContext.cgiGet( sPrefix+"wcpOAV74TipMaqCodJSON") ;
         wcpOAV75FechaInicio = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV75FechaInicio"), 0) ;
         wcpOAV76FechaFin = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV76FechaFin"), 0) ;
         wcpOAV115MADetMaqCod = httpContext.cgiGet( sPrefix+"wcpOAV115MADetMaqCod") ;
         wcpOAV103MADetDefCod = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV103MADetDefCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV104MADetCatCod = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV104MADetCatCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV105MTknUsu = httpContext.cgiGet( sPrefix+"wcpOAV105MTknUsu") ;
         wcpOAV106MTkn = httpContext.cgiGet( sPrefix+"wcpOAV106MTkn") ;
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
         Grid_empowerer_Infinitescrolling = httpContext.cgiGet( sPrefix+"GRID_EMPOWERER_Infinitescrolling") ;
         Grid_empowerer_Hastitlesettings = GXutil.strtobool( httpContext.cgiGet( sPrefix+"GRID_EMPOWERER_Hastitlesettings")) ;
         Grid_empowerer_Hascolumnsselector = GXutil.strtobool( httpContext.cgiGet( sPrefix+"GRID_EMPOWERER_Hascolumnsselector")) ;
         Ddo_grid_Activeeventkey = httpContext.cgiGet( sPrefix+"DDO_GRID_Activeeventkey") ;
         Ddo_grid_Selectedvalue_get = httpContext.cgiGet( sPrefix+"DDO_GRID_Selectedvalue_get") ;
         Ddo_grid_Filteredtextto_get = httpContext.cgiGet( sPrefix+"DDO_GRID_Filteredtextto_get") ;
         Ddo_grid_Filteredtext_get = httpContext.cgiGet( sPrefix+"DDO_GRID_Filteredtext_get") ;
         Ddo_grid_Selectedcolumn = httpContext.cgiGet( sPrefix+"DDO_GRID_Selectedcolumn") ;
         Ddo_gridcolumnsselector_Columnsselectorvalues = httpContext.cgiGet( sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Columnsselectorvalues") ;
         Ddo_managefilters_Activeeventkey = httpContext.cgiGet( sPrefix+"DDO_MANAGEFILTERS_Activeeventkey") ;
         /* Read variables values. */
         AV15FilterFullText = httpContext.cgiGet( edtavFilterfulltext_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV15FilterFullText", AV15FilterFullText);
         AV86TotValueMADetFec = httpContext.cgiGet( edtavTotvaluemadetfec_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV86TotValueMADetFec", AV86TotValueMADetFec);
         AV88TotValueMADetKilProd = httpContext.cgiGet( edtavTotvaluemadetkilprod_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV88TotValueMADetKilProd", AV88TotValueMADetKilProd);
         AV90TotValueMADetKilReo = httpContext.cgiGet( edtavTotvaluemadetkilreo_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV90TotValueMADetKilReo", AV90TotValueMADetKilReo);
         AV121TotValueMADetKilTot = httpContext.cgiGet( edtavTotvaluemadetkiltot_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV121TotValueMADetKilTot", AV121TotValueMADetKilTot);
         AV129TotValueMADetMetReo = httpContext.cgiGet( edtavTotvaluemadetmetreo_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV129TotValueMADetMetReo", AV129TotValueMADetMetReo);
         AV132Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV132Pgmname", AV132Pgmname);
         if ( localUtil.vcdate( httpContext.cgiGet( edtavDdo_madetfecauxdate_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vDDO_MADETFECAUXDATE");
            GX_FocusControl = edtavDdo_madetfecauxdate_Internalname ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV30DDO_MADetFecAuxDate = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV30DDO_MADetFecAuxDate", localUtil.format(AV30DDO_MADetFecAuxDate, "99/99/99"));
         }
         else
         {
            AV30DDO_MADetFecAuxDate = localUtil.ctod( httpContext.cgiGet( edtavDdo_madetfecauxdate_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV30DDO_MADetFecAuxDate", localUtil.format(AV30DDO_MADetFecAuxDate, "99/99/99"));
         }
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"MAnt_Detalle");
         AV132Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV132Pgmname", AV132Pgmname);
         forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV132Pgmname, "")));
         hsh = httpContext.cgiGet( sPrefix+"hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("anticipacionerrores\\mant_detalle:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
            GxWebError = (byte)(1) ;
            httpContext.sendError( 403 );
            GXutil.writeLog("send_http_error_code 403");
            return  ;
         }
         /* Check if conditions changed and reset current page numbers */
         if ( GXutil.strcmp(httpContext.cgiGet( sPrefix+"GXH_vFILTERFULLTEXT"), AV15FilterFullText) != 0 )
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
      e162DR2 ();
      if (returnInSub) return;
   }

   public void e162DR2( )
   {
      /* Start Routine */
      returnInSub = false ;
      AV79TipMaqCodCollection.fromJSonString(AV74TipMaqCodJSON, null);
      new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).debug(GXutil.format( httpContext.getMessage( "Ingresando con filtros Detalle para Empresa=%1, Cliente=%2, Articulo:%3, Color=%4, Tipo Maquinas:%5, Fechas:%6-%7.", ""), AV70MADetEmprCod, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV71CliCod), 6, 0), AV72ArtCod, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV73ForColNum), 6, 0), AV79TipMaqCodCollection.toJSonString(false), localUtil.dtoc( AV75FechaInicio, 0, "-"), localUtil.dtoc( AV76FechaFin, 0, "-"), "", ""), AV132Pgmname) ;
      new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).debug(GXutil.format( httpContext.getMessage( "Ingresando con filtros Detalle para Defecto=%1, Categoria=%2, Usuario:%3, Token=%4.", ""), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV103MADetDefCod), 4, 0), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV104MADetCatCod), 4, 0), AV105MTknUsu, AV106MTkn, "", "", "", "", ""), AV132Pgmname) ;
      AV91sdtMTok.fromJSonString(AV92WebSession.getValue("TexplusNET_Token"), null);
      new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).debug(GXutil.format( httpContext.getMessage( "Detalle .. Web Session token>%1", ""), AV91sdtMTok.toJSonString(false, true), "", "", "", "", "", "", "", ""), AV132Pgmname) ;
      if ( ! ( ( GXutil.strcmp(AV91sdtMTok.getgxTv_SdtsdtMTok_Mtknusu(), AV105MTknUsu) == 0 ) || ( GXutil.strcmp(AV91sdtMTok.getgxTv_SdtsdtMTok_Mtkn(), AV106MTkn) == 0 ) ) )
      {
         new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).debug(GXutil.format( httpContext.getMessage( "DEFECTO token no coincide .. Web Session token>%1", ""), AV91sdtMTok.toJSonString(false, true), "", "", "", "", "", "", "", ""), AV132Pgmname) ;
         httpContext.GX_msglist.addItem(httpContext.getMessage( "no coincide TOKEN", ""));
         httpContext.setWebReturnParms(new Object[] {});
         httpContext.setWebReturnParmsMetadata(new Object[] {});
         httpContext.wjLocDisableFrm = (byte)(1) ;
         httpContext.nUserReturn = (byte)(1) ;
         returnInSub = true;
         if (true) return;
      }
      GXt_char1 = AV133Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      mant_detalle_impl.this.GXt_char1 = GXv_char2[0] ;
      AV133Station = GXt_char1 ;
      GXv_char2[0] = AV134Emprcod ;
      GXv_char3[0] = AV135Emprnom ;
      GXv_char4[0] = AV136Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV133Station, GXv_char2, GXv_char3, GXv_char4) ;
      mant_detalle_impl.this.AV134Emprcod = GXv_char2[0] ;
      mant_detalle_impl.this.AV135Emprnom = GXv_char3[0] ;
      mant_detalle_impl.this.AV136Usurcod = GXv_char4[0] ;
      subGrid_Rows = 15 ;
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
      if ( AV12OrderedBy < 1 )
      {
         AV12OrderedBy = (short)(1) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12OrderedBy), 4, 0));
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S142 ();
         if (returnInSub) return;
      }
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = AV68DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] ;
      AV68DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = bttBtneditcolumns_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, sPrefix, false, Ddo_gridcolumnsselector_Internalname, "TitleControlIdToReplace", Ddo_gridcolumnsselector_Titlecontrolidtoreplace);
   }

   public void e172DR2( )
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
      if ( AV25ManageFiltersExecutionStep == 1 )
      {
         AV25ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV25ManageFiltersExecutionStep", GXutil.str( AV25ManageFiltersExecutionStep, 1, 0));
      }
      else if ( AV25ManageFiltersExecutionStep == 2 )
      {
         AV25ManageFiltersExecutionStep = (byte)(0) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV25ManageFiltersExecutionStep", GXutil.str( AV25ManageFiltersExecutionStep, 1, 0));
         /* Execute user subroutine: 'LOADSAVEDFILTERS' */
         S112 ();
         if (returnInSub) return;
      }
      /* Execute user subroutine: 'SAVEGRIDSTATE' */
      S152 ();
      if (returnInSub) return;
      if ( GXutil.strcmp(AV22Session.getValue("AnticipacionErrores.MAnt_DetalleColumnsSelector"), "") != 0 )
      {
         AV18ColumnsSelectorXML = AV22Session.getValue("AnticipacionErrores.MAnt_DetalleColumnsSelector") ;
         AV20ColumnsSelector.fromxml(AV18ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S162 ();
         if (returnInSub) return;
      }
      edtMADetFec_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtMADetFec_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMADetFec_Visible), 5, 0), !bGXsfl_39_Refreshing);
      edtMADetEmprC_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtMADetEmprC_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMADetEmprC_Visible), 5, 0), !bGXsfl_39_Refreshing);
      edtMADetCliCo_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtMADetCliCo_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMADetCliCo_Visible), 5, 0), !bGXsfl_39_Refreshing);
      edtMADetCliNo_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtMADetCliNo_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMADetCliNo_Visible), 5, 0), !bGXsfl_39_Refreshing);
      edtMADetArtCo_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtMADetArtCo_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMADetArtCo_Visible), 5, 0), !bGXsfl_39_Refreshing);
      edtMADetArtDs_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtMADetArtDs_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMADetArtDs_Visible), 5, 0), !bGXsfl_39_Refreshing);
      edtMADetColNu_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtMADetColNu_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMADetColNu_Visible), 5, 0), !bGXsfl_39_Refreshing);
      edtMADetColNo_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtMADetColNo_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMADetColNo_Visible), 5, 0), !bGXsfl_39_Refreshing);
      edtMADetColCo_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtMADetColCo_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMADetColCo_Visible), 5, 0), !bGXsfl_39_Refreshing);
      edtMADetMatCo_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtMADetMatCo_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMADetMatCo_Visible), 5, 0), !bGXsfl_39_Refreshing);
      edtMADetMatDs_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtMADetMatDs_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMADetMatDs_Visible), 5, 0), !bGXsfl_39_Refreshing);
      edtMADetIntCo_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtMADetIntCo_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMADetIntCo_Visible), 5, 0), !bGXsfl_39_Refreshing);
      edtMADetIntDs_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtMADetIntDs_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMADetIntDs_Visible), 5, 0), !bGXsfl_39_Refreshing);
      edtMADetMaqCo_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtMADetMaqCo_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMADetMaqCo_Visible), 5, 0), !bGXsfl_39_Refreshing);
      edtMADetMaqDs_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtMADetMaqDs_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMADetMaqDs_Visible), 5, 0), !bGXsfl_39_Refreshing);
      edtMADetTipMC_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+16)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtMADetTipMC_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMADetTipMC_Visible), 5, 0), !bGXsfl_39_Refreshing);
      edtMADetTipMD_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+17)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtMADetTipMD_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMADetTipMD_Visible), 5, 0), !bGXsfl_39_Refreshing);
      edtMADetDefCo_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+18)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtMADetDefCo_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMADetDefCo_Visible), 5, 0), !bGXsfl_39_Refreshing);
      edtMADetDefDs_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+19)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtMADetDefDs_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMADetDefDs_Visible), 5, 0), !bGXsfl_39_Refreshing);
      edtMADetCatCo_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+20)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtMADetCatCo_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMADetCatCo_Visible), 5, 0), !bGXsfl_39_Refreshing);
      edtMADetCatDs_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+21)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtMADetCatDs_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMADetCatDs_Visible), 5, 0), !bGXsfl_39_Refreshing);
      edtMADetHdr_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+22)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtMADetHdr_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMADetHdr_Visible), 5, 0), !bGXsfl_39_Refreshing);
      edtMADetKilPr_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+23)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtMADetKilPr_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMADetKilPr_Visible), 5, 0), !bGXsfl_39_Refreshing);
      edtMADetKilRe_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+24)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtMADetKilRe_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMADetKilRe_Visible), 5, 0), !bGXsfl_39_Refreshing);
      edtMADetKilTo_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+25)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtMADetKilTo_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMADetKilTo_Visible), 5, 0), !bGXsfl_39_Refreshing);
      edtMADetMetPr_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+26)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtMADetMetPr_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMADetMetPr_Visible), 5, 0), !bGXsfl_39_Refreshing);
      edtMADetMetRe_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+27)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtMADetMetRe_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMADetMetRe_Visible), 5, 0), !bGXsfl_39_Refreshing);
      edtMADetMetTo_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+28)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtMADetMetTo_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMADetMetTo_Visible), 5, 0), !bGXsfl_39_Refreshing);
      /* Execute user subroutine: 'INITIALIZETOTALIZERS' */
      S172 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'CALCULATETOTALIZERS' */
      S182 ();
      if (returnInSub) return;
      AV137Anticipacionerrores_mant_detalleds_1_filterfulltext = AV15FilterFullText ;
      AV138Anticipacionerrores_mant_detalleds_2_tfmadetfec = AV28TFMADetFec ;
      AV139Anticipacionerrores_mant_detalleds_3_tfmadetemprcod = AV32TFMADetEmprCod ;
      AV140Anticipacionerrores_mant_detalleds_4_tfmadetemprcod_sel = AV33TFMADetEmprCod_Sel ;
      AV141Anticipacionerrores_mant_detalleds_5_tfmadetclicod = AV34TFMADetCliCod ;
      AV142Anticipacionerrores_mant_detalleds_6_tfmadetclicod_to = AV35TFMADetCliCod_To ;
      AV143Anticipacionerrores_mant_detalleds_7_tfmadetclinom = AV36TFMADetCliNom ;
      AV144Anticipacionerrores_mant_detalleds_8_tfmadetclinom_sel = AV37TFMADetCliNom_Sel ;
      AV145Anticipacionerrores_mant_detalleds_9_tfmadetartcod = AV38TFMADetArtCod ;
      AV146Anticipacionerrores_mant_detalleds_10_tfmadetartcod_sel = AV39TFMADetArtCod_Sel ;
      AV147Anticipacionerrores_mant_detalleds_11_tfmadetartdsc = AV77TFMADetArtDsc ;
      AV148Anticipacionerrores_mant_detalleds_12_tfmadetartdsc_sel = AV78TFMADetArtDsc_Sel ;
      AV149Anticipacionerrores_mant_detalleds_13_tfmadetcolnum = AV44TFMADetColNum ;
      AV150Anticipacionerrores_mant_detalleds_14_tfmadetcolnum_to = AV45TFMADetColNum_To ;
      AV151Anticipacionerrores_mant_detalleds_15_tfmadetcolnom = AV42TFMADetColNom ;
      AV152Anticipacionerrores_mant_detalleds_16_tfmadetcolnom_sel = AV43TFMADetColNom_Sel ;
      AV153Anticipacionerrores_mant_detalleds_17_tfmadetcolcod = AV46TFMADetColCod ;
      AV154Anticipacionerrores_mant_detalleds_18_tfmadetcolcod_to = AV47TFMADetColCod_To ;
      AV155Anticipacionerrores_mant_detalleds_19_tfmadetmatcod = AV48TFMADetMatCod ;
      AV156Anticipacionerrores_mant_detalleds_20_tfmadetmatcod_to = AV49TFMADetMatCod_To ;
      AV157Anticipacionerrores_mant_detalleds_21_tfmadetmatdsc = AV80TFMADetMatDsc ;
      AV158Anticipacionerrores_mant_detalleds_22_tfmadetmatdsc_sel = AV81TFMADetMatDsc_Sel ;
      AV159Anticipacionerrores_mant_detalleds_23_tfmadetintcod = AV52TFMADetIntCod ;
      AV160Anticipacionerrores_mant_detalleds_24_tfmadetintcod_to = AV53TFMADetIntCod_To ;
      AV161Anticipacionerrores_mant_detalleds_25_tfmadetintdsc = AV82TFMADetIntDsc ;
      AV162Anticipacionerrores_mant_detalleds_26_tfmadetintdsc_sel = AV83TFMADetIntDsc_Sel ;
      AV163Anticipacionerrores_mant_detalleds_27_tfmadetmaqcod = AV56TFMADetMaqCod ;
      AV164Anticipacionerrores_mant_detalleds_28_tfmadetmaqcod_sel = AV57TFMADetMaqCod_Sel ;
      AV165Anticipacionerrores_mant_detalleds_29_tfmadetmaqdsc = AV58TFMADetMaqDsc ;
      AV166Anticipacionerrores_mant_detalleds_30_tfmadetmaqdsc_sel = AV59TFMADetMaqDsc_Sel ;
      AV167Anticipacionerrores_mant_detalleds_31_tfmadettipmcod = AV60TFMADetTipMCod ;
      AV168Anticipacionerrores_mant_detalleds_32_tfmadettipmcod_sel = AV61TFMADetTipMCod_Sel ;
      AV169Anticipacionerrores_mant_detalleds_33_tfmadettipmdsc = AV62TFMADetTipMDsc ;
      AV170Anticipacionerrores_mant_detalleds_34_tfmadettipmdsc_sel = AV63TFMADetTipMDsc_Sel ;
      AV171Anticipacionerrores_mant_detalleds_35_tfmadetdefcod = AV107TFMADetDefCod ;
      AV172Anticipacionerrores_mant_detalleds_36_tfmadetdefcod_to = AV108TFMADetDefCod_To ;
      AV173Anticipacionerrores_mant_detalleds_37_tfmadetdefdsc = AV109TFMADetDefDsc ;
      AV174Anticipacionerrores_mant_detalleds_38_tfmadetdefdsc_sel = AV110TFMADetDefDsc_Sel ;
      AV175Anticipacionerrores_mant_detalleds_39_tfmadetcatcod = AV111TFMADetCatCod ;
      AV176Anticipacionerrores_mant_detalleds_40_tfmadetcatcod_to = AV112TFMADetCatCod_To ;
      AV177Anticipacionerrores_mant_detalleds_41_tfmadetcatdsc = AV113TFMADetCatDsc ;
      AV178Anticipacionerrores_mant_detalleds_42_tfmadetcatdsc_sel = AV114TFMADetCatDsc_Sel ;
      AV179Anticipacionerrores_mant_detalleds_43_tfmadethdr = AV116TFMADetHdr ;
      AV180Anticipacionerrores_mant_detalleds_44_tfmadethdr_sel = AV117TFMADetHdr_Sel ;
      AV181Anticipacionerrores_mant_detalleds_45_tfmadetkilprod = AV64TFMADetKilProd ;
      AV182Anticipacionerrores_mant_detalleds_46_tfmadetkilprod_to = AV65TFMADetKilProd_To ;
      AV183Anticipacionerrores_mant_detalleds_47_tfmadetkilreo = AV66TFMADetKilReo ;
      AV184Anticipacionerrores_mant_detalleds_48_tfmadetkilreo_to = AV67TFMADetKilReo_To ;
      AV185Anticipacionerrores_mant_detalleds_49_tfmadetkiltot = AV93TFMADetKilTot ;
      AV186Anticipacionerrores_mant_detalleds_50_tfmadetkiltot_to = AV94TFMADetKilTot_To ;
      AV187Anticipacionerrores_mant_detalleds_51_tfmadetmetprod = AV122TFMADetMetProd ;
      AV188Anticipacionerrores_mant_detalleds_52_tfmadetmetprod_to = AV123TFMADetMetProd_To ;
      AV189Anticipacionerrores_mant_detalleds_53_tfmadetmetreo = AV124TFMADetMetReo ;
      AV190Anticipacionerrores_mant_detalleds_54_tfmadetmetreo_to = AV125TFMADetMetReo_To ;
      AV191Anticipacionerrores_mant_detalleds_55_tfmadetmettot = AV126TFMADetMetTot ;
      AV192Anticipacionerrores_mant_detalleds_56_tfmadetmettot_to = AV127TFMADetMetTot_To ;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV20ColumnsSelector", AV20ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV23ManageFiltersData", AV23ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV10GridState", AV10GridState);
   }

   public void e122DR2( )
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
         if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "MADetFec") == 0 )
         {
            AV28TFMADetFec = localUtil.ctod( Ddo_grid_Filteredtext_get, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV28TFMADetFec", localUtil.format(AV28TFMADetFec, "99/99/99"));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "MADetEmprCod") == 0 )
         {
            AV32TFMADetEmprCod = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32TFMADetEmprCod", AV32TFMADetEmprCod);
            AV33TFMADetEmprCod_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33TFMADetEmprCod_Sel", AV33TFMADetEmprCod_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "MADetCliCod") == 0 )
         {
            AV34TFMADetCliCod = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34TFMADetCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34TFMADetCliCod), 6, 0));
            AV35TFMADetCliCod_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV35TFMADetCliCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV35TFMADetCliCod_To), 6, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "MADetCliNom") == 0 )
         {
            AV36TFMADetCliNom = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36TFMADetCliNom", AV36TFMADetCliNom);
            AV37TFMADetCliNom_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37TFMADetCliNom_Sel", AV37TFMADetCliNom_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "MADetArtCod") == 0 )
         {
            AV38TFMADetArtCod = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV38TFMADetArtCod", AV38TFMADetArtCod);
            AV39TFMADetArtCod_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV39TFMADetArtCod_Sel", AV39TFMADetArtCod_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "MADetArtDsc") == 0 )
         {
            AV77TFMADetArtDsc = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV77TFMADetArtDsc", AV77TFMADetArtDsc);
            AV78TFMADetArtDsc_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV78TFMADetArtDsc_Sel", AV78TFMADetArtDsc_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "MADetColNum") == 0 )
         {
            AV44TFMADetColNum = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV44TFMADetColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV44TFMADetColNum), 6, 0));
            AV45TFMADetColNum_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV45TFMADetColNum_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV45TFMADetColNum_To), 6, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "MADetColNom") == 0 )
         {
            AV42TFMADetColNom = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV42TFMADetColNom", AV42TFMADetColNom);
            AV43TFMADetColNom_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV43TFMADetColNom_Sel", AV43TFMADetColNom_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "MADetColCod") == 0 )
         {
            AV46TFMADetColCod = (byte)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV46TFMADetColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV46TFMADetColCod), 2, 0));
            AV47TFMADetColCod_To = (byte)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47TFMADetColCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV47TFMADetColCod_To), 2, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "MADetMatCod") == 0 )
         {
            AV48TFMADetMatCod = (short)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV48TFMADetMatCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV48TFMADetMatCod), 3, 0));
            AV49TFMADetMatCod_To = (short)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV49TFMADetMatCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV49TFMADetMatCod_To), 3, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "MADetMatDsc") == 0 )
         {
            AV80TFMADetMatDsc = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV80TFMADetMatDsc", AV80TFMADetMatDsc);
            AV81TFMADetMatDsc_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV81TFMADetMatDsc_Sel", AV81TFMADetMatDsc_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "MADetIntCod") == 0 )
         {
            AV52TFMADetIntCod = (byte)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV52TFMADetIntCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV52TFMADetIntCod), 2, 0));
            AV53TFMADetIntCod_To = (byte)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV53TFMADetIntCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV53TFMADetIntCod_To), 2, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "MADetIntDsc") == 0 )
         {
            AV82TFMADetIntDsc = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV82TFMADetIntDsc", AV82TFMADetIntDsc);
            AV83TFMADetIntDsc_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV83TFMADetIntDsc_Sel", AV83TFMADetIntDsc_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "MADetMaqCod") == 0 )
         {
            AV56TFMADetMaqCod = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV56TFMADetMaqCod", AV56TFMADetMaqCod);
            AV57TFMADetMaqCod_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV57TFMADetMaqCod_Sel", AV57TFMADetMaqCod_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "MADetMaqDsc") == 0 )
         {
            AV58TFMADetMaqDsc = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV58TFMADetMaqDsc", AV58TFMADetMaqDsc);
            AV59TFMADetMaqDsc_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV59TFMADetMaqDsc_Sel", AV59TFMADetMaqDsc_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "MADetTipMCod") == 0 )
         {
            AV60TFMADetTipMCod = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV60TFMADetTipMCod", AV60TFMADetTipMCod);
            AV61TFMADetTipMCod_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV61TFMADetTipMCod_Sel", AV61TFMADetTipMCod_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "MADetTipMDsc") == 0 )
         {
            AV62TFMADetTipMDsc = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV62TFMADetTipMDsc", AV62TFMADetTipMDsc);
            AV63TFMADetTipMDsc_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV63TFMADetTipMDsc_Sel", AV63TFMADetTipMDsc_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "MADetDefCod") == 0 )
         {
            AV107TFMADetDefCod = (short)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV107TFMADetDefCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV107TFMADetDefCod), 4, 0));
            AV108TFMADetDefCod_To = (short)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV108TFMADetDefCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV108TFMADetDefCod_To), 4, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "MADetDefDsc") == 0 )
         {
            AV109TFMADetDefDsc = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV109TFMADetDefDsc", AV109TFMADetDefDsc);
            AV110TFMADetDefDsc_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV110TFMADetDefDsc_Sel", AV110TFMADetDefDsc_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "MADetCatCod") == 0 )
         {
            AV111TFMADetCatCod = (short)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV111TFMADetCatCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV111TFMADetCatCod), 4, 0));
            AV112TFMADetCatCod_To = (short)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV112TFMADetCatCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV112TFMADetCatCod_To), 4, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "MADetCatDsc") == 0 )
         {
            AV113TFMADetCatDsc = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV113TFMADetCatDsc", AV113TFMADetCatDsc);
            AV114TFMADetCatDsc_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV114TFMADetCatDsc_Sel", AV114TFMADetCatDsc_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "MADetHdr") == 0 )
         {
            AV116TFMADetHdr = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV116TFMADetHdr", AV116TFMADetHdr);
            AV117TFMADetHdr_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV117TFMADetHdr_Sel", AV117TFMADetHdr_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "MADetKilProd") == 0 )
         {
            AV64TFMADetKilProd = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV64TFMADetKilProd", GXutil.ltrimstr( AV64TFMADetKilProd, 12, 2));
            AV65TFMADetKilProd_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV65TFMADetKilProd_To", GXutil.ltrimstr( AV65TFMADetKilProd_To, 12, 2));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "MADetKilReo") == 0 )
         {
            AV66TFMADetKilReo = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV66TFMADetKilReo", GXutil.ltrimstr( AV66TFMADetKilReo, 12, 2));
            AV67TFMADetKilReo_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV67TFMADetKilReo_To", GXutil.ltrimstr( AV67TFMADetKilReo_To, 12, 2));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "MADetKilTot") == 0 )
         {
            AV93TFMADetKilTot = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV93TFMADetKilTot", GXutil.ltrimstr( AV93TFMADetKilTot, 12, 2));
            AV94TFMADetKilTot_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV94TFMADetKilTot_To", GXutil.ltrimstr( AV94TFMADetKilTot_To, 12, 2));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "MADetMetProd") == 0 )
         {
            AV122TFMADetMetProd = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV122TFMADetMetProd", GXutil.ltrimstr( AV122TFMADetMetProd, 12, 2));
            AV123TFMADetMetProd_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV123TFMADetMetProd_To", GXutil.ltrimstr( AV123TFMADetMetProd_To, 12, 2));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "MADetMetReo") == 0 )
         {
            AV124TFMADetMetReo = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV124TFMADetMetReo", GXutil.ltrimstr( AV124TFMADetMetReo, 12, 2));
            AV125TFMADetMetReo_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV125TFMADetMetReo_To", GXutil.ltrimstr( AV125TFMADetMetReo_To, 12, 2));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "MADetMetTot") == 0 )
         {
            AV126TFMADetMetTot = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV126TFMADetMetTot", GXutil.ltrimstr( AV126TFMADetMetTot, 12, 2));
            AV127TFMADetMetTot_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV127TFMADetMetTot_To", GXutil.ltrimstr( AV127TFMADetMetTot_To, 12, 2));
         }
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
   }

   private void e182DR2( )
   {
      /* Grid_Load Routine */
      returnInSub = false ;
      /* Load Method */
      if ( wbStart != -1 )
      {
         wbStart = (short)(39) ;
      }
      sendrow_392( ) ;
      GRID_nCurrentRecord = (long)(GRID_nCurrentRecord+1) ;
      if ( isFullAjaxMode( ) && ! bGXsfl_39_Refreshing )
      {
         httpContext.doAjaxLoad(39, GridRow);
      }
   }

   public void e132DR2( )
   {
      /* Ddo_gridcolumnsselector_Oncolumnschanged Routine */
      returnInSub = false ;
      AV18ColumnsSelectorXML = Ddo_gridcolumnsselector_Columnsselectorvalues ;
      AV20ColumnsSelector.fromJSonString(AV18ColumnsSelectorXML, null);
      new app.wwpbaseobjects.savecolumnsselectorstate(remoteHandle, context).execute( "AnticipacionErrores.MAnt_DetalleColumnsSelector", ((GXutil.strcmp("", AV18ColumnsSelectorXML)==0) ? "" : AV20ColumnsSelector.toxml(false, true, "WWPColumnsSelector", "TexplusNET"))) ;
      httpContext.doAjaxRefreshCmp(sPrefix);
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV20ColumnsSelector", AV20ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV23ManageFiltersData", AV23ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV10GridState", AV10GridState);
   }

   public void e112DR2( )
   {
      /* Ddo_managefilters_Onoptionclicked Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Clean#>") == 0 )
      {
         /* Execute user subroutine: 'CLEANFILTERS' */
         S192 ();
         if (returnInSub) return;
         subgrid_firstpage( ) ;
      }
      else if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Save#>") == 0 )
      {
         /* Execute user subroutine: 'SAVEGRIDSTATE' */
         S152 ();
         if (returnInSub) return;
         httpContext.popup(formatLink("app.wwpbaseobjects.savefilteras", new String[] {GXutil.URLEncode(GXutil.rtrim("AnticipacionErrores.MAnt_DetalleFilters")),GXutil.URLEncode(GXutil.rtrim(AV132Pgmname+"GridState"))}, new String[] {"UserKey","GridStateKey"}) , new Object[] {});
         AV25ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV25ManageFiltersExecutionStep", GXutil.str( AV25ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefreshCmp(sPrefix);
      }
      else if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Manage#>") == 0 )
      {
         httpContext.popup(formatLink("app.wwpbaseobjects.managefilters", new String[] {GXutil.URLEncode(GXutil.rtrim("AnticipacionErrores.MAnt_DetalleFilters"))}, new String[] {"UserKey"}) , new Object[] {});
         AV25ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV25ManageFiltersExecutionStep", GXutil.str( AV25ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefreshCmp(sPrefix);
      }
      else
      {
         GXt_char1 = AV24ManageFiltersXml ;
         GXv_char4[0] = GXt_char1 ;
         new app.wwpbaseobjects.getfilterbyname(remoteHandle, context).execute( "AnticipacionErrores.MAnt_DetalleFilters", Ddo_managefilters_Activeeventkey, GXv_char4) ;
         mant_detalle_impl.this.GXt_char1 = GXv_char4[0] ;
         AV24ManageFiltersXml = GXt_char1 ;
         if ( (GXutil.strcmp("", AV24ManageFiltersXml)==0) )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "WWP_FilterNotExist", ""));
         }
         else
         {
            /* Execute user subroutine: 'CLEANFILTERS' */
            S192 ();
            if (returnInSub) return;
            new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV132Pgmname+"GridState", AV24ManageFiltersXml) ;
            AV10GridState.fromxml(AV24ManageFiltersXml, null, null);
            AV12OrderedBy = AV10GridState.getgxTv_SdtWWPGridState_Orderedby() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12OrderedBy), 4, 0));
            AV13OrderedDsc = AV10GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV13OrderedDsc", AV13OrderedDsc);
            /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
            S142 ();
            if (returnInSub) return;
            /* Execute user subroutine: 'LOADREGFILTERSSTATE' */
            S202 ();
            if (returnInSub) return;
            subgrid_firstpage( ) ;
         }
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV10GridState", AV10GridState);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV20ColumnsSelector", AV20ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV23ManageFiltersData", AV23ManageFiltersData);
   }

   public void e142DR2( )
   {
      /* 'DoExport' Routine */
      returnInSub = false ;
      GXv_char4[0] = AV16ExcelFilename ;
      GXv_char3[0] = AV17ErrorMessage ;
      new app.anticipacionerrores.mant_detalleexport(remoteHandle, context).execute( GXv_char4, GXv_char3) ;
      mant_detalle_impl.this.AV16ExcelFilename = GXv_char4[0] ;
      mant_detalle_impl.this.AV17ErrorMessage = GXv_char3[0] ;
      if ( GXutil.strcmp(AV16ExcelFilename, "") != 0 )
      {
         callWebObject(formatLink(AV16ExcelFilename, new String[] {}, new String[] {}) );
         httpContext.wjLocDisableFrm = (byte)(0) ;
      }
      else
      {
         httpContext.GX_msglist.addItem(AV17ErrorMessage);
      }
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
      AV20ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "MADetFec", "", "Fecha", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "MADetEmprCod", "", "Empresa", false, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "MADetCliCod", "", "Cliente", false, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "MADetCliNom", "", "Cliente", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "MADetArtCod", "", "Artículo", false, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "MADetArtDsc", "", "Artículo", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "MADetColNum", "", "Nro.Color", false, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "MADetColNom", "", "Color", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "MADetColCod", "", "Tipo Colorante", false, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "MADetMatCod", "", "Cód Matiz", false, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "MADetMatDsc", "", "Matiz", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "MADetIntCod", "", "Cód. Intensidad", false, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "MADetIntDsc", "", "Intensidad", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "MADetMaqCod", "", "Cód. máquina", false, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "MADetMaqDsc", "", "Máquina", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "MADetTipMCod", "", "Cód.  Tipo Máquina", false, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "MADetTipMDsc", "", "Tipo Máquina", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "MADetDefCod", "", "Defecto", false, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "MADetDefDsc", "", "Defecto", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "MADetCatCod", "", "Categoria Defecto", false, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "MADetCatDsc", "", "Categoria", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "MADetHdr", "", "HDR", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "MADetKilProd", "", "Kilos Produccion", false, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "MADetKilReo", "", "Kilos Reoperados", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "MADetKilTot", "", "Kilos Total", false, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "MADetMetProd", "", "Metros Produccion", false, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "MADetMetReo", "", "Metros Reoperados", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "MADetMetTot", "", "Metros Total", false, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXt_char1 = AV19UserCustomValue ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "AnticipacionErrores.MAnt_DetalleColumnsSelector", GXv_char4) ;
      mant_detalle_impl.this.GXt_char1 = GXv_char4[0] ;
      AV19UserCustomValue = GXt_char1 ;
      if ( ! ( (GXutil.strcmp("", AV19UserCustomValue)==0) ) )
      {
         AV21ColumnsSelectorAux.fromxml(AV19UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector8[0] = AV21ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector9[0] = AV20ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, GXv_SdtWWPColumnsSelector9) ;
         AV21ColumnsSelectorAux = GXv_SdtWWPColumnsSelector8[0] ;
         AV20ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      }
   }

   public void S112( )
   {
      /* 'LOADSAVEDFILTERS' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 = AV23ManageFiltersData ;
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11[0] = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 ;
      new app.wwpbaseobjects.wwp_managefiltersloadsavedfilters(remoteHandle, context).execute( "AnticipacionErrores.MAnt_DetalleFilters", "", "", false, GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11) ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 = GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11[0] ;
      AV23ManageFiltersData = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 ;
   }

   public void S192( )
   {
      /* 'CLEANFILTERS' Routine */
      returnInSub = false ;
      AV15FilterFullText = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV15FilterFullText", AV15FilterFullText);
      AV28TFMADetFec = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV28TFMADetFec", localUtil.format(AV28TFMADetFec, "99/99/99"));
      AV32TFMADetEmprCod = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32TFMADetEmprCod", AV32TFMADetEmprCod);
      AV33TFMADetEmprCod_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33TFMADetEmprCod_Sel", AV33TFMADetEmprCod_Sel);
      AV34TFMADetCliCod = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34TFMADetCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34TFMADetCliCod), 6, 0));
      AV35TFMADetCliCod_To = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV35TFMADetCliCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV35TFMADetCliCod_To), 6, 0));
      AV36TFMADetCliNom = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36TFMADetCliNom", AV36TFMADetCliNom);
      AV37TFMADetCliNom_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37TFMADetCliNom_Sel", AV37TFMADetCliNom_Sel);
      AV38TFMADetArtCod = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV38TFMADetArtCod", AV38TFMADetArtCod);
      AV39TFMADetArtCod_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV39TFMADetArtCod_Sel", AV39TFMADetArtCod_Sel);
      AV77TFMADetArtDsc = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV77TFMADetArtDsc", AV77TFMADetArtDsc);
      AV78TFMADetArtDsc_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV78TFMADetArtDsc_Sel", AV78TFMADetArtDsc_Sel);
      AV44TFMADetColNum = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV44TFMADetColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV44TFMADetColNum), 6, 0));
      AV45TFMADetColNum_To = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV45TFMADetColNum_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV45TFMADetColNum_To), 6, 0));
      AV42TFMADetColNom = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV42TFMADetColNom", AV42TFMADetColNom);
      AV43TFMADetColNom_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV43TFMADetColNom_Sel", AV43TFMADetColNom_Sel);
      AV46TFMADetColCod = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV46TFMADetColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV46TFMADetColCod), 2, 0));
      AV47TFMADetColCod_To = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47TFMADetColCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV47TFMADetColCod_To), 2, 0));
      AV48TFMADetMatCod = (short)(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV48TFMADetMatCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV48TFMADetMatCod), 3, 0));
      AV49TFMADetMatCod_To = (short)(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV49TFMADetMatCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV49TFMADetMatCod_To), 3, 0));
      AV80TFMADetMatDsc = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV80TFMADetMatDsc", AV80TFMADetMatDsc);
      AV81TFMADetMatDsc_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV81TFMADetMatDsc_Sel", AV81TFMADetMatDsc_Sel);
      AV52TFMADetIntCod = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV52TFMADetIntCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV52TFMADetIntCod), 2, 0));
      AV53TFMADetIntCod_To = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV53TFMADetIntCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV53TFMADetIntCod_To), 2, 0));
      AV82TFMADetIntDsc = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV82TFMADetIntDsc", AV82TFMADetIntDsc);
      AV83TFMADetIntDsc_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV83TFMADetIntDsc_Sel", AV83TFMADetIntDsc_Sel);
      AV56TFMADetMaqCod = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV56TFMADetMaqCod", AV56TFMADetMaqCod);
      AV57TFMADetMaqCod_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV57TFMADetMaqCod_Sel", AV57TFMADetMaqCod_Sel);
      AV58TFMADetMaqDsc = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV58TFMADetMaqDsc", AV58TFMADetMaqDsc);
      AV59TFMADetMaqDsc_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV59TFMADetMaqDsc_Sel", AV59TFMADetMaqDsc_Sel);
      AV60TFMADetTipMCod = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV60TFMADetTipMCod", AV60TFMADetTipMCod);
      AV61TFMADetTipMCod_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV61TFMADetTipMCod_Sel", AV61TFMADetTipMCod_Sel);
      AV62TFMADetTipMDsc = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV62TFMADetTipMDsc", AV62TFMADetTipMDsc);
      AV63TFMADetTipMDsc_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV63TFMADetTipMDsc_Sel", AV63TFMADetTipMDsc_Sel);
      AV107TFMADetDefCod = (short)(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV107TFMADetDefCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV107TFMADetDefCod), 4, 0));
      AV108TFMADetDefCod_To = (short)(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV108TFMADetDefCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV108TFMADetDefCod_To), 4, 0));
      AV109TFMADetDefDsc = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV109TFMADetDefDsc", AV109TFMADetDefDsc);
      AV110TFMADetDefDsc_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV110TFMADetDefDsc_Sel", AV110TFMADetDefDsc_Sel);
      AV111TFMADetCatCod = (short)(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV111TFMADetCatCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV111TFMADetCatCod), 4, 0));
      AV112TFMADetCatCod_To = (short)(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV112TFMADetCatCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV112TFMADetCatCod_To), 4, 0));
      AV113TFMADetCatDsc = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV113TFMADetCatDsc", AV113TFMADetCatDsc);
      AV114TFMADetCatDsc_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV114TFMADetCatDsc_Sel", AV114TFMADetCatDsc_Sel);
      AV116TFMADetHdr = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV116TFMADetHdr", AV116TFMADetHdr);
      AV117TFMADetHdr_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV117TFMADetHdr_Sel", AV117TFMADetHdr_Sel);
      AV64TFMADetKilProd = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV64TFMADetKilProd", GXutil.ltrimstr( AV64TFMADetKilProd, 12, 2));
      AV65TFMADetKilProd_To = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV65TFMADetKilProd_To", GXutil.ltrimstr( AV65TFMADetKilProd_To, 12, 2));
      AV66TFMADetKilReo = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV66TFMADetKilReo", GXutil.ltrimstr( AV66TFMADetKilReo, 12, 2));
      AV67TFMADetKilReo_To = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV67TFMADetKilReo_To", GXutil.ltrimstr( AV67TFMADetKilReo_To, 12, 2));
      AV93TFMADetKilTot = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV93TFMADetKilTot", GXutil.ltrimstr( AV93TFMADetKilTot, 12, 2));
      AV94TFMADetKilTot_To = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV94TFMADetKilTot_To", GXutil.ltrimstr( AV94TFMADetKilTot_To, 12, 2));
      AV122TFMADetMetProd = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV122TFMADetMetProd", GXutil.ltrimstr( AV122TFMADetMetProd, 12, 2));
      AV123TFMADetMetProd_To = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV123TFMADetMetProd_To", GXutil.ltrimstr( AV123TFMADetMetProd_To, 12, 2));
      AV124TFMADetMetReo = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV124TFMADetMetReo", GXutil.ltrimstr( AV124TFMADetMetReo, 12, 2));
      AV125TFMADetMetReo_To = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV125TFMADetMetReo_To", GXutil.ltrimstr( AV125TFMADetMetReo_To, 12, 2));
      AV126TFMADetMetTot = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV126TFMADetMetTot", GXutil.ltrimstr( AV126TFMADetMetTot, 12, 2));
      AV127TFMADetMetTot_To = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV127TFMADetMetTot_To", GXutil.ltrimstr( AV127TFMADetMetTot_To, 12, 2));
      Ddo_grid_Selectedvalue_set = "" ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      Ddo_grid_Filteredtext_set = "" ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = "" ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
   }

   public void S132( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV22Session.getValue(AV132Pgmname+"GridState"), "") == 0 )
      {
         AV10GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV132Pgmname+"GridState"), null, null);
      }
      else
      {
         AV10GridState.fromxml(AV22Session.getValue(AV132Pgmname+"GridState"), null, null);
      }
      AV12OrderedBy = AV10GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12OrderedBy), 4, 0));
      AV13OrderedDsc = AV10GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV13OrderedDsc", AV13OrderedDsc);
      /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
      S142 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADREGFILTERSSTATE' */
      S202 ();
      if (returnInSub) return;
   }

   public void S202( )
   {
      /* 'LOADREGFILTERSSTATE' Routine */
      returnInSub = false ;
      AV193GXV1 = 1 ;
      while ( AV193GXV1 <= AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV193GXV1));
         if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV15FilterFullText = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV15FilterFullText", AV15FilterFullText);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMADETFEC") == 0 )
         {
            AV28TFMADetFec = localUtil.ctod( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV28TFMADetFec", localUtil.format(AV28TFMADetFec, "99/99/99"));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMADETEMPRCOD") == 0 )
         {
            AV32TFMADetEmprCod = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32TFMADetEmprCod", AV32TFMADetEmprCod);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMADETEMPRCOD_SEL") == 0 )
         {
            AV33TFMADetEmprCod_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33TFMADetEmprCod_Sel", AV33TFMADetEmprCod_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMADETCLICOD") == 0 )
         {
            AV34TFMADetCliCod = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34TFMADetCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34TFMADetCliCod), 6, 0));
            AV35TFMADetCliCod_To = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV35TFMADetCliCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV35TFMADetCliCod_To), 6, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMADETCLINOM") == 0 )
         {
            AV36TFMADetCliNom = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36TFMADetCliNom", AV36TFMADetCliNom);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMADETCLINOM_SEL") == 0 )
         {
            AV37TFMADetCliNom_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37TFMADetCliNom_Sel", AV37TFMADetCliNom_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMADETARTCOD") == 0 )
         {
            AV38TFMADetArtCod = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV38TFMADetArtCod", AV38TFMADetArtCod);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMADETARTCOD_SEL") == 0 )
         {
            AV39TFMADetArtCod_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV39TFMADetArtCod_Sel", AV39TFMADetArtCod_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMADETARTDSC") == 0 )
         {
            AV77TFMADetArtDsc = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV77TFMADetArtDsc", AV77TFMADetArtDsc);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMADETARTDSC_SEL") == 0 )
         {
            AV78TFMADetArtDsc_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV78TFMADetArtDsc_Sel", AV78TFMADetArtDsc_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMADETCOLNUM") == 0 )
         {
            AV44TFMADetColNum = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV44TFMADetColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV44TFMADetColNum), 6, 0));
            AV45TFMADetColNum_To = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV45TFMADetColNum_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV45TFMADetColNum_To), 6, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMADETCOLNOM") == 0 )
         {
            AV42TFMADetColNom = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV42TFMADetColNom", AV42TFMADetColNom);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMADETCOLNOM_SEL") == 0 )
         {
            AV43TFMADetColNom_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV43TFMADetColNom_Sel", AV43TFMADetColNom_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMADETCOLCOD") == 0 )
         {
            AV46TFMADetColCod = (byte)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV46TFMADetColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV46TFMADetColCod), 2, 0));
            AV47TFMADetColCod_To = (byte)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47TFMADetColCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV47TFMADetColCod_To), 2, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMADETMATCOD") == 0 )
         {
            AV48TFMADetMatCod = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV48TFMADetMatCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV48TFMADetMatCod), 3, 0));
            AV49TFMADetMatCod_To = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV49TFMADetMatCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV49TFMADetMatCod_To), 3, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMADETMATDSC") == 0 )
         {
            AV80TFMADetMatDsc = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV80TFMADetMatDsc", AV80TFMADetMatDsc);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMADETMATDSC_SEL") == 0 )
         {
            AV81TFMADetMatDsc_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV81TFMADetMatDsc_Sel", AV81TFMADetMatDsc_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMADETINTCOD") == 0 )
         {
            AV52TFMADetIntCod = (byte)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV52TFMADetIntCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV52TFMADetIntCod), 2, 0));
            AV53TFMADetIntCod_To = (byte)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV53TFMADetIntCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV53TFMADetIntCod_To), 2, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMADETINTDSC") == 0 )
         {
            AV82TFMADetIntDsc = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV82TFMADetIntDsc", AV82TFMADetIntDsc);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMADETINTDSC_SEL") == 0 )
         {
            AV83TFMADetIntDsc_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV83TFMADetIntDsc_Sel", AV83TFMADetIntDsc_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMADETMAQCOD") == 0 )
         {
            AV56TFMADetMaqCod = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV56TFMADetMaqCod", AV56TFMADetMaqCod);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMADETMAQCOD_SEL") == 0 )
         {
            AV57TFMADetMaqCod_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV57TFMADetMaqCod_Sel", AV57TFMADetMaqCod_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMADETMAQDSC") == 0 )
         {
            AV58TFMADetMaqDsc = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV58TFMADetMaqDsc", AV58TFMADetMaqDsc);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMADETMAQDSC_SEL") == 0 )
         {
            AV59TFMADetMaqDsc_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV59TFMADetMaqDsc_Sel", AV59TFMADetMaqDsc_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMADETTIPMCOD") == 0 )
         {
            AV60TFMADetTipMCod = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV60TFMADetTipMCod", AV60TFMADetTipMCod);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMADETTIPMCOD_SEL") == 0 )
         {
            AV61TFMADetTipMCod_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV61TFMADetTipMCod_Sel", AV61TFMADetTipMCod_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMADETTIPMDSC") == 0 )
         {
            AV62TFMADetTipMDsc = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV62TFMADetTipMDsc", AV62TFMADetTipMDsc);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMADETTIPMDSC_SEL") == 0 )
         {
            AV63TFMADetTipMDsc_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV63TFMADetTipMDsc_Sel", AV63TFMADetTipMDsc_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMADETDEFCOD") == 0 )
         {
            AV107TFMADetDefCod = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV107TFMADetDefCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV107TFMADetDefCod), 4, 0));
            AV108TFMADetDefCod_To = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV108TFMADetDefCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV108TFMADetDefCod_To), 4, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMADETDEFDSC") == 0 )
         {
            AV109TFMADetDefDsc = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV109TFMADetDefDsc", AV109TFMADetDefDsc);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMADETDEFDSC_SEL") == 0 )
         {
            AV110TFMADetDefDsc_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV110TFMADetDefDsc_Sel", AV110TFMADetDefDsc_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMADETCATCOD") == 0 )
         {
            AV111TFMADetCatCod = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV111TFMADetCatCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV111TFMADetCatCod), 4, 0));
            AV112TFMADetCatCod_To = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV112TFMADetCatCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV112TFMADetCatCod_To), 4, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMADETCATDSC") == 0 )
         {
            AV113TFMADetCatDsc = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV113TFMADetCatDsc", AV113TFMADetCatDsc);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMADETCATDSC_SEL") == 0 )
         {
            AV114TFMADetCatDsc_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV114TFMADetCatDsc_Sel", AV114TFMADetCatDsc_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMADETHDR") == 0 )
         {
            AV116TFMADetHdr = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV116TFMADetHdr", AV116TFMADetHdr);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMADETHDR_SEL") == 0 )
         {
            AV117TFMADetHdr_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV117TFMADetHdr_Sel", AV117TFMADetHdr_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMADETKILPROD") == 0 )
         {
            AV64TFMADetKilProd = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV64TFMADetKilProd", GXutil.ltrimstr( AV64TFMADetKilProd, 12, 2));
            AV65TFMADetKilProd_To = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV65TFMADetKilProd_To", GXutil.ltrimstr( AV65TFMADetKilProd_To, 12, 2));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMADETKILREO") == 0 )
         {
            AV66TFMADetKilReo = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV66TFMADetKilReo", GXutil.ltrimstr( AV66TFMADetKilReo, 12, 2));
            AV67TFMADetKilReo_To = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV67TFMADetKilReo_To", GXutil.ltrimstr( AV67TFMADetKilReo_To, 12, 2));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMADETKILTOT") == 0 )
         {
            AV93TFMADetKilTot = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV93TFMADetKilTot", GXutil.ltrimstr( AV93TFMADetKilTot, 12, 2));
            AV94TFMADetKilTot_To = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV94TFMADetKilTot_To", GXutil.ltrimstr( AV94TFMADetKilTot_To, 12, 2));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMADETMETPROD") == 0 )
         {
            AV122TFMADetMetProd = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV122TFMADetMetProd", GXutil.ltrimstr( AV122TFMADetMetProd, 12, 2));
            AV123TFMADetMetProd_To = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV123TFMADetMetProd_To", GXutil.ltrimstr( AV123TFMADetMetProd_To, 12, 2));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMADETMETREO") == 0 )
         {
            AV124TFMADetMetReo = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV124TFMADetMetReo", GXutil.ltrimstr( AV124TFMADetMetReo, 12, 2));
            AV125TFMADetMetReo_To = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV125TFMADetMetReo_To", GXutil.ltrimstr( AV125TFMADetMetReo_To, 12, 2));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMADETMETTOT") == 0 )
         {
            AV126TFMADetMetTot = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV126TFMADetMetTot", GXutil.ltrimstr( AV126TFMADetMetTot, 12, 2));
            AV127TFMADetMetTot_To = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV127TFMADetMetTot_To", GXutil.ltrimstr( AV127TFMADetMetTot_To, 12, 2));
         }
         AV193GXV1 = (int)(AV193GXV1+1) ;
      }
      GXt_char1 = "" ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV33TFMADetEmprCod_Sel)==0), AV33TFMADetEmprCod_Sel, GXv_char4) ;
      mant_detalle_impl.this.GXt_char1 = GXv_char4[0] ;
      GXt_char12 = "" ;
      GXv_char3[0] = GXt_char12 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV37TFMADetCliNom_Sel)==0), AV37TFMADetCliNom_Sel, GXv_char3) ;
      mant_detalle_impl.this.GXt_char12 = GXv_char3[0] ;
      GXt_char13 = "" ;
      GXv_char2[0] = GXt_char13 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV39TFMADetArtCod_Sel)==0), AV39TFMADetArtCod_Sel, GXv_char2) ;
      mant_detalle_impl.this.GXt_char13 = GXv_char2[0] ;
      GXt_char14 = "" ;
      GXv_char15[0] = GXt_char14 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV78TFMADetArtDsc_Sel)==0), AV78TFMADetArtDsc_Sel, GXv_char15) ;
      mant_detalle_impl.this.GXt_char14 = GXv_char15[0] ;
      GXt_char16 = "" ;
      GXv_char17[0] = GXt_char16 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV43TFMADetColNom_Sel)==0), AV43TFMADetColNom_Sel, GXv_char17) ;
      mant_detalle_impl.this.GXt_char16 = GXv_char17[0] ;
      GXt_char18 = "" ;
      GXv_char19[0] = GXt_char18 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV81TFMADetMatDsc_Sel)==0), AV81TFMADetMatDsc_Sel, GXv_char19) ;
      mant_detalle_impl.this.GXt_char18 = GXv_char19[0] ;
      GXt_char20 = "" ;
      GXv_char21[0] = GXt_char20 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV83TFMADetIntDsc_Sel)==0), AV83TFMADetIntDsc_Sel, GXv_char21) ;
      mant_detalle_impl.this.GXt_char20 = GXv_char21[0] ;
      GXt_char22 = "" ;
      GXv_char23[0] = GXt_char22 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV57TFMADetMaqCod_Sel)==0), AV57TFMADetMaqCod_Sel, GXv_char23) ;
      mant_detalle_impl.this.GXt_char22 = GXv_char23[0] ;
      GXt_char24 = "" ;
      GXv_char25[0] = GXt_char24 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV59TFMADetMaqDsc_Sel)==0), AV59TFMADetMaqDsc_Sel, GXv_char25) ;
      mant_detalle_impl.this.GXt_char24 = GXv_char25[0] ;
      GXt_char26 = "" ;
      GXv_char27[0] = GXt_char26 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV61TFMADetTipMCod_Sel)==0), AV61TFMADetTipMCod_Sel, GXv_char27) ;
      mant_detalle_impl.this.GXt_char26 = GXv_char27[0] ;
      GXt_char28 = "" ;
      GXv_char29[0] = GXt_char28 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV63TFMADetTipMDsc_Sel)==0), AV63TFMADetTipMDsc_Sel, GXv_char29) ;
      mant_detalle_impl.this.GXt_char28 = GXv_char29[0] ;
      GXt_char30 = "" ;
      GXv_char31[0] = GXt_char30 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV110TFMADetDefDsc_Sel)==0), AV110TFMADetDefDsc_Sel, GXv_char31) ;
      mant_detalle_impl.this.GXt_char30 = GXv_char31[0] ;
      GXt_char32 = "" ;
      GXv_char33[0] = GXt_char32 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV114TFMADetCatDsc_Sel)==0), AV114TFMADetCatDsc_Sel, GXv_char33) ;
      mant_detalle_impl.this.GXt_char32 = GXv_char33[0] ;
      GXt_char34 = "" ;
      GXv_char35[0] = GXt_char34 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV117TFMADetHdr_Sel)==0), AV117TFMADetHdr_Sel, GXv_char35) ;
      mant_detalle_impl.this.GXt_char34 = GXv_char35[0] ;
      Ddo_grid_Selectedvalue_set = "|"+GXt_char1+"||"+GXt_char12+"|"+GXt_char13+"|"+GXt_char14+"||"+GXt_char16+"|||"+GXt_char18+"||"+GXt_char20+"|"+GXt_char22+"|"+GXt_char24+"|"+GXt_char26+"|"+GXt_char28+"||"+GXt_char30+"||"+GXt_char32+"|"+GXt_char34+"||||||" ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      GXt_char34 = "" ;
      GXv_char35[0] = GXt_char34 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV32TFMADetEmprCod)==0), AV32TFMADetEmprCod, GXv_char35) ;
      mant_detalle_impl.this.GXt_char34 = GXv_char35[0] ;
      GXt_char32 = "" ;
      GXv_char33[0] = GXt_char32 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV36TFMADetCliNom)==0), AV36TFMADetCliNom, GXv_char33) ;
      mant_detalle_impl.this.GXt_char32 = GXv_char33[0] ;
      GXt_char30 = "" ;
      GXv_char31[0] = GXt_char30 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV38TFMADetArtCod)==0), AV38TFMADetArtCod, GXv_char31) ;
      mant_detalle_impl.this.GXt_char30 = GXv_char31[0] ;
      GXt_char28 = "" ;
      GXv_char29[0] = GXt_char28 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV77TFMADetArtDsc)==0), AV77TFMADetArtDsc, GXv_char29) ;
      mant_detalle_impl.this.GXt_char28 = GXv_char29[0] ;
      GXt_char26 = "" ;
      GXv_char27[0] = GXt_char26 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV42TFMADetColNom)==0), AV42TFMADetColNom, GXv_char27) ;
      mant_detalle_impl.this.GXt_char26 = GXv_char27[0] ;
      GXt_char24 = "" ;
      GXv_char25[0] = GXt_char24 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV80TFMADetMatDsc)==0), AV80TFMADetMatDsc, GXv_char25) ;
      mant_detalle_impl.this.GXt_char24 = GXv_char25[0] ;
      GXt_char22 = "" ;
      GXv_char23[0] = GXt_char22 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV82TFMADetIntDsc)==0), AV82TFMADetIntDsc, GXv_char23) ;
      mant_detalle_impl.this.GXt_char22 = GXv_char23[0] ;
      GXt_char20 = "" ;
      GXv_char21[0] = GXt_char20 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV56TFMADetMaqCod)==0), AV56TFMADetMaqCod, GXv_char21) ;
      mant_detalle_impl.this.GXt_char20 = GXv_char21[0] ;
      GXt_char18 = "" ;
      GXv_char19[0] = GXt_char18 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV58TFMADetMaqDsc)==0), AV58TFMADetMaqDsc, GXv_char19) ;
      mant_detalle_impl.this.GXt_char18 = GXv_char19[0] ;
      GXt_char16 = "" ;
      GXv_char17[0] = GXt_char16 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV60TFMADetTipMCod)==0), AV60TFMADetTipMCod, GXv_char17) ;
      mant_detalle_impl.this.GXt_char16 = GXv_char17[0] ;
      GXt_char14 = "" ;
      GXv_char15[0] = GXt_char14 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV62TFMADetTipMDsc)==0), AV62TFMADetTipMDsc, GXv_char15) ;
      mant_detalle_impl.this.GXt_char14 = GXv_char15[0] ;
      GXt_char13 = "" ;
      GXv_char4[0] = GXt_char13 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV109TFMADetDefDsc)==0), AV109TFMADetDefDsc, GXv_char4) ;
      mant_detalle_impl.this.GXt_char13 = GXv_char4[0] ;
      GXt_char12 = "" ;
      GXv_char3[0] = GXt_char12 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV113TFMADetCatDsc)==0), AV113TFMADetCatDsc, GXv_char3) ;
      mant_detalle_impl.this.GXt_char12 = GXv_char3[0] ;
      GXt_char1 = "" ;
      GXv_char2[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV116TFMADetHdr)==0), AV116TFMADetHdr, GXv_char2) ;
      mant_detalle_impl.this.GXt_char1 = GXv_char2[0] ;
      Ddo_grid_Filteredtext_set = (GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV28TFMADetFec)) ? "" : localUtil.dtoc( AV28TFMADetFec, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"))+"|"+GXt_char34+"|"+((0==AV34TFMADetCliCod) ? "" : GXutil.str( AV34TFMADetCliCod, 6, 0))+"|"+GXt_char32+"|"+GXt_char30+"|"+GXt_char28+"|"+((0==AV44TFMADetColNum) ? "" : GXutil.str( AV44TFMADetColNum, 6, 0))+"|"+GXt_char26+"|"+((0==AV46TFMADetColCod) ? "" : GXutil.str( AV46TFMADetColCod, 2, 0))+"|"+((0==AV48TFMADetMatCod) ? "" : GXutil.str( AV48TFMADetMatCod, 3, 0))+"|"+GXt_char24+"|"+((0==AV52TFMADetIntCod) ? "" : GXutil.str( AV52TFMADetIntCod, 2, 0))+"|"+GXt_char22+"|"+GXt_char20+"|"+GXt_char18+"|"+GXt_char16+"|"+GXt_char14+"|"+((0==AV107TFMADetDefCod) ? "" : GXutil.str( AV107TFMADetDefCod, 4, 0))+"|"+GXt_char13+"|"+((0==AV111TFMADetCatCod) ? "" : GXutil.str( AV111TFMADetCatCod, 4, 0))+"|"+GXt_char12+"|"+GXt_char1+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV64TFMADetKilProd)==0) ? "" : GXutil.str( AV64TFMADetKilProd, 12, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV66TFMADetKilReo)==0) ? "" : GXutil.str( AV66TFMADetKilReo, 12, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV93TFMADetKilTot)==0) ? "" : GXutil.str( AV93TFMADetKilTot, 12, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV122TFMADetMetProd)==0) ? "" : GXutil.str( AV122TFMADetMetProd, 12, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV124TFMADetMetReo)==0) ? "" : GXutil.str( AV124TFMADetMetReo, 12, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV126TFMADetMetTot)==0) ? "" : GXutil.str( AV126TFMADetMetTot, 12, 2)) ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = "||"+((0==AV35TFMADetCliCod_To) ? "" : GXutil.str( AV35TFMADetCliCod_To, 6, 0))+"||||"+((0==AV45TFMADetColNum_To) ? "" : GXutil.str( AV45TFMADetColNum_To, 6, 0))+"||"+((0==AV47TFMADetColCod_To) ? "" : GXutil.str( AV47TFMADetColCod_To, 2, 0))+"|"+((0==AV49TFMADetMatCod_To) ? "" : GXutil.str( AV49TFMADetMatCod_To, 3, 0))+"||"+((0==AV53TFMADetIntCod_To) ? "" : GXutil.str( AV53TFMADetIntCod_To, 2, 0))+"||||||"+((0==AV108TFMADetDefCod_To) ? "" : GXutil.str( AV108TFMADetDefCod_To, 4, 0))+"||"+((0==AV112TFMADetCatCod_To) ? "" : GXutil.str( AV112TFMADetCatCod_To, 4, 0))+"|||"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV65TFMADetKilProd_To)==0) ? "" : GXutil.str( AV65TFMADetKilProd_To, 12, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV67TFMADetKilReo_To)==0) ? "" : GXutil.str( AV67TFMADetKilReo_To, 12, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV94TFMADetKilTot_To)==0) ? "" : GXutil.str( AV94TFMADetKilTot_To, 12, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV123TFMADetMetProd_To)==0) ? "" : GXutil.str( AV123TFMADetMetProd_To, 12, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV125TFMADetMetReo_To)==0) ? "" : GXutil.str( AV125TFMADetMetReo_To, 12, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV127TFMADetMetTot_To)==0) ? "" : GXutil.str( AV127TFMADetMetTot_To, 12, 2)) ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
   }

   public void S152( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV10GridState.fromxml(AV22Session.getValue(AV132Pgmname+"GridState"), null, null);
      AV10GridState.setgxTv_SdtWWPGridState_Orderedby( AV12OrderedBy );
      AV10GridState.setgxTv_SdtWWPGridState_Ordereddsc( AV13OrderedDsc );
      AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState36[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState36, "FILTERFULLTEXT", "", !(GXutil.strcmp("", AV15FilterFullText)==0), (short)(0), AV15FilterFullText, "") ;
      AV10GridState = GXv_SdtWWPGridState36[0] ;
      GXv_SdtWWPGridState36[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState36, "TFMADETFEC", "", !GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV28TFMADetFec)), (short)(0), GXutil.trim( localUtil.dtoc( AV28TFMADetFec, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")), "") ;
      AV10GridState = GXv_SdtWWPGridState36[0] ;
      GXv_SdtWWPGridState36[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState36, "TFMADETEMPRCOD", "", !(GXutil.strcmp("", AV32TFMADetEmprCod)==0), (short)(0), AV32TFMADetEmprCod, "", !(GXutil.strcmp("", AV33TFMADetEmprCod_Sel)==0), AV33TFMADetEmprCod_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState36[0] ;
      GXv_SdtWWPGridState36[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState36, "TFMADETCLICOD", "", !((0==AV34TFMADetCliCod)&&(0==AV35TFMADetCliCod_To)), (short)(0), GXutil.trim( GXutil.str( AV34TFMADetCliCod, 6, 0)), GXutil.trim( GXutil.str( AV35TFMADetCliCod_To, 6, 0))) ;
      AV10GridState = GXv_SdtWWPGridState36[0] ;
      GXv_SdtWWPGridState36[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState36, "TFMADETCLINOM", "", !(GXutil.strcmp("", AV36TFMADetCliNom)==0), (short)(0), AV36TFMADetCliNom, "", !(GXutil.strcmp("", AV37TFMADetCliNom_Sel)==0), AV37TFMADetCliNom_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState36[0] ;
      GXv_SdtWWPGridState36[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState36, "TFMADETARTCOD", "", !(GXutil.strcmp("", AV38TFMADetArtCod)==0), (short)(0), AV38TFMADetArtCod, "", !(GXutil.strcmp("", AV39TFMADetArtCod_Sel)==0), AV39TFMADetArtCod_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState36[0] ;
      GXv_SdtWWPGridState36[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState36, "TFMADETARTDSC", "", !(GXutil.strcmp("", AV77TFMADetArtDsc)==0), (short)(0), AV77TFMADetArtDsc, "", !(GXutil.strcmp("", AV78TFMADetArtDsc_Sel)==0), AV78TFMADetArtDsc_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState36[0] ;
      GXv_SdtWWPGridState36[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState36, "TFMADETCOLNUM", "", !((0==AV44TFMADetColNum)&&(0==AV45TFMADetColNum_To)), (short)(0), GXutil.trim( GXutil.str( AV44TFMADetColNum, 6, 0)), GXutil.trim( GXutil.str( AV45TFMADetColNum_To, 6, 0))) ;
      AV10GridState = GXv_SdtWWPGridState36[0] ;
      GXv_SdtWWPGridState36[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState36, "TFMADETCOLNOM", "", !(GXutil.strcmp("", AV42TFMADetColNom)==0), (short)(0), AV42TFMADetColNom, "", !(GXutil.strcmp("", AV43TFMADetColNom_Sel)==0), AV43TFMADetColNom_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState36[0] ;
      GXv_SdtWWPGridState36[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState36, "TFMADETCOLCOD", "", !((0==AV46TFMADetColCod)&&(0==AV47TFMADetColCod_To)), (short)(0), GXutil.trim( GXutil.str( AV46TFMADetColCod, 2, 0)), GXutil.trim( GXutil.str( AV47TFMADetColCod_To, 2, 0))) ;
      AV10GridState = GXv_SdtWWPGridState36[0] ;
      GXv_SdtWWPGridState36[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState36, "TFMADETMATCOD", "", !((0==AV48TFMADetMatCod)&&(0==AV49TFMADetMatCod_To)), (short)(0), GXutil.trim( GXutil.str( AV48TFMADetMatCod, 3, 0)), GXutil.trim( GXutil.str( AV49TFMADetMatCod_To, 3, 0))) ;
      AV10GridState = GXv_SdtWWPGridState36[0] ;
      GXv_SdtWWPGridState36[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState36, "TFMADETMATDSC", "", !(GXutil.strcmp("", AV80TFMADetMatDsc)==0), (short)(0), AV80TFMADetMatDsc, "", !(GXutil.strcmp("", AV81TFMADetMatDsc_Sel)==0), AV81TFMADetMatDsc_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState36[0] ;
      GXv_SdtWWPGridState36[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState36, "TFMADETINTCOD", "", !((0==AV52TFMADetIntCod)&&(0==AV53TFMADetIntCod_To)), (short)(0), GXutil.trim( GXutil.str( AV52TFMADetIntCod, 2, 0)), GXutil.trim( GXutil.str( AV53TFMADetIntCod_To, 2, 0))) ;
      AV10GridState = GXv_SdtWWPGridState36[0] ;
      GXv_SdtWWPGridState36[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState36, "TFMADETINTDSC", "", !(GXutil.strcmp("", AV82TFMADetIntDsc)==0), (short)(0), AV82TFMADetIntDsc, "", !(GXutil.strcmp("", AV83TFMADetIntDsc_Sel)==0), AV83TFMADetIntDsc_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState36[0] ;
      GXv_SdtWWPGridState36[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState36, "TFMADETMAQCOD", "", !(GXutil.strcmp("", AV56TFMADetMaqCod)==0), (short)(0), AV56TFMADetMaqCod, "", !(GXutil.strcmp("", AV57TFMADetMaqCod_Sel)==0), AV57TFMADetMaqCod_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState36[0] ;
      GXv_SdtWWPGridState36[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState36, "TFMADETMAQDSC", "", !(GXutil.strcmp("", AV58TFMADetMaqDsc)==0), (short)(0), AV58TFMADetMaqDsc, "", !(GXutil.strcmp("", AV59TFMADetMaqDsc_Sel)==0), AV59TFMADetMaqDsc_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState36[0] ;
      GXv_SdtWWPGridState36[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState36, "TFMADETTIPMCOD", "", !(GXutil.strcmp("", AV60TFMADetTipMCod)==0), (short)(0), AV60TFMADetTipMCod, "", !(GXutil.strcmp("", AV61TFMADetTipMCod_Sel)==0), AV61TFMADetTipMCod_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState36[0] ;
      GXv_SdtWWPGridState36[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState36, "TFMADETTIPMDSC", "", !(GXutil.strcmp("", AV62TFMADetTipMDsc)==0), (short)(0), AV62TFMADetTipMDsc, "", !(GXutil.strcmp("", AV63TFMADetTipMDsc_Sel)==0), AV63TFMADetTipMDsc_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState36[0] ;
      GXv_SdtWWPGridState36[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState36, "TFMADETDEFCOD", "", !((0==AV107TFMADetDefCod)&&(0==AV108TFMADetDefCod_To)), (short)(0), GXutil.trim( GXutil.str( AV107TFMADetDefCod, 4, 0)), GXutil.trim( GXutil.str( AV108TFMADetDefCod_To, 4, 0))) ;
      AV10GridState = GXv_SdtWWPGridState36[0] ;
      GXv_SdtWWPGridState36[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState36, "TFMADETDEFDSC", "", !(GXutil.strcmp("", AV109TFMADetDefDsc)==0), (short)(0), AV109TFMADetDefDsc, "", !(GXutil.strcmp("", AV110TFMADetDefDsc_Sel)==0), AV110TFMADetDefDsc_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState36[0] ;
      GXv_SdtWWPGridState36[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState36, "TFMADETCATCOD", "", !((0==AV111TFMADetCatCod)&&(0==AV112TFMADetCatCod_To)), (short)(0), GXutil.trim( GXutil.str( AV111TFMADetCatCod, 4, 0)), GXutil.trim( GXutil.str( AV112TFMADetCatCod_To, 4, 0))) ;
      AV10GridState = GXv_SdtWWPGridState36[0] ;
      GXv_SdtWWPGridState36[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState36, "TFMADETCATDSC", "", !(GXutil.strcmp("", AV113TFMADetCatDsc)==0), (short)(0), AV113TFMADetCatDsc, "", !(GXutil.strcmp("", AV114TFMADetCatDsc_Sel)==0), AV114TFMADetCatDsc_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState36[0] ;
      GXv_SdtWWPGridState36[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState36, "TFMADETHDR", "", !(GXutil.strcmp("", AV116TFMADetHdr)==0), (short)(0), AV116TFMADetHdr, "", !(GXutil.strcmp("", AV117TFMADetHdr_Sel)==0), AV117TFMADetHdr_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState36[0] ;
      GXv_SdtWWPGridState36[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState36, "TFMADETKILPROD", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV64TFMADetKilProd)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV65TFMADetKilProd_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV64TFMADetKilProd, 12, 2)), GXutil.trim( GXutil.str( AV65TFMADetKilProd_To, 12, 2))) ;
      AV10GridState = GXv_SdtWWPGridState36[0] ;
      GXv_SdtWWPGridState36[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState36, "TFMADETKILREO", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV66TFMADetKilReo)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV67TFMADetKilReo_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV66TFMADetKilReo, 12, 2)), GXutil.trim( GXutil.str( AV67TFMADetKilReo_To, 12, 2))) ;
      AV10GridState = GXv_SdtWWPGridState36[0] ;
      GXv_SdtWWPGridState36[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState36, "TFMADETKILTOT", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV93TFMADetKilTot)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV94TFMADetKilTot_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV93TFMADetKilTot, 12, 2)), GXutil.trim( GXutil.str( AV94TFMADetKilTot_To, 12, 2))) ;
      AV10GridState = GXv_SdtWWPGridState36[0] ;
      GXv_SdtWWPGridState36[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState36, "TFMADETMETPROD", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV122TFMADetMetProd)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV123TFMADetMetProd_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV122TFMADetMetProd, 12, 2)), GXutil.trim( GXutil.str( AV123TFMADetMetProd_To, 12, 2))) ;
      AV10GridState = GXv_SdtWWPGridState36[0] ;
      GXv_SdtWWPGridState36[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState36, "TFMADETMETREO", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV124TFMADetMetReo)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV125TFMADetMetReo_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV124TFMADetMetReo, 12, 2)), GXutil.trim( GXutil.str( AV125TFMADetMetReo_To, 12, 2))) ;
      AV10GridState = GXv_SdtWWPGridState36[0] ;
      GXv_SdtWWPGridState36[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState36, "TFMADETMETTOT", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV126TFMADetMetTot)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV127TFMADetMetTot_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV126TFMADetMetTot, 12, 2)), GXutil.trim( GXutil.str( AV127TFMADetMetTot_To, 12, 2))) ;
      AV10GridState = GXv_SdtWWPGridState36[0] ;
      if ( ! (GXutil.strcmp("", AV70MADetEmprCod)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&MADETEMPRCOD" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV70MADetEmprCod );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV71CliCod) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&CLICOD" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV71CliCod, 6, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV72ArtCod)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&ARTCOD" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV72ArtCod );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV73ForColNum) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&FORCOLNUM" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV73ForColNum, 6, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV74TipMaqCodJSON)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&TIPMAQCODJSON" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV74TipMaqCodJSON );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV75FechaInicio)) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&FECHAINICIO" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( localUtil.dtoc( AV75FechaInicio, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV76FechaFin)) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&FECHAFIN" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( localUtil.dtoc( AV76FechaFin, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV115MADetMaqCod)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&MADETMAQCOD" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV115MADetMaqCod );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV103MADetDefCod) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&MADETDEFCOD" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV103MADetDefCod, 4, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV104MADetCatCod) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&MADETCATCOD" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV104MADetCatCod, 4, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV105MTknUsu)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&MTKNUSU" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV105MTknUsu );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV106MTkn)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&MTKN" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV106MTkn );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV132Pgmname+"GridState", AV10GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S122( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV8TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV132Pgmname );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( true );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV7HTTPRequest.getScriptName()+"?"+AV7HTTPRequest.getQuerystring() );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "AnticipacionErrores.MADet" );
      AV22Session.setValue("TrnContext", AV8TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   public void S172( )
   {
      /* 'INITIALIZETOTALIZERS' Routine */
      returnInSub = false ;
      AV85TotMADetFec = 0 ;
      AV87TotMADetKilProd = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV87TotMADetKilProd", GXutil.ltrimstr( AV87TotMADetKilProd, 18, 2));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTMADETKILPROD", getSecureSignedToken( sPrefix, localUtil.format( AV87TotMADetKilProd, "ZZZZZZZZ9.99")));
      AV89TotMADetKilReo = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV89TotMADetKilReo", GXutil.ltrimstr( AV89TotMADetKilReo, 18, 2));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTMADETKILREO", getSecureSignedToken( sPrefix, localUtil.format( AV89TotMADetKilReo, "ZZZZZZZZ9.99")));
      AV120TotMADetKilTot = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV120TotMADetKilTot", GXutil.ltrimstr( AV120TotMADetKilTot, 18, 2));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTMADETKILTOT", getSecureSignedToken( sPrefix, localUtil.format( AV120TotMADetKilTot, "ZZZZZZZZ9.99")));
      AV128TotMADetMetReo = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV128TotMADetMetReo", GXutil.ltrimstr( AV128TotMADetMetReo, 18, 2));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTMADETMETREO", getSecureSignedToken( sPrefix, localUtil.format( AV128TotMADetMetReo, "ZZZZZZZZ9.99")));
   }

   public void S182( )
   {
      /* 'CALCULATETOTALIZERS' Routine */
      returnInSub = false ;
      AV137Anticipacionerrores_mant_detalleds_1_filterfulltext = AV15FilterFullText ;
      AV138Anticipacionerrores_mant_detalleds_2_tfmadetfec = AV28TFMADetFec ;
      AV139Anticipacionerrores_mant_detalleds_3_tfmadetemprcod = AV32TFMADetEmprCod ;
      AV140Anticipacionerrores_mant_detalleds_4_tfmadetemprcod_sel = AV33TFMADetEmprCod_Sel ;
      AV141Anticipacionerrores_mant_detalleds_5_tfmadetclicod = AV34TFMADetCliCod ;
      AV142Anticipacionerrores_mant_detalleds_6_tfmadetclicod_to = AV35TFMADetCliCod_To ;
      AV143Anticipacionerrores_mant_detalleds_7_tfmadetclinom = AV36TFMADetCliNom ;
      AV144Anticipacionerrores_mant_detalleds_8_tfmadetclinom_sel = AV37TFMADetCliNom_Sel ;
      AV145Anticipacionerrores_mant_detalleds_9_tfmadetartcod = AV38TFMADetArtCod ;
      AV146Anticipacionerrores_mant_detalleds_10_tfmadetartcod_sel = AV39TFMADetArtCod_Sel ;
      AV147Anticipacionerrores_mant_detalleds_11_tfmadetartdsc = AV77TFMADetArtDsc ;
      AV148Anticipacionerrores_mant_detalleds_12_tfmadetartdsc_sel = AV78TFMADetArtDsc_Sel ;
      AV149Anticipacionerrores_mant_detalleds_13_tfmadetcolnum = AV44TFMADetColNum ;
      AV150Anticipacionerrores_mant_detalleds_14_tfmadetcolnum_to = AV45TFMADetColNum_To ;
      AV151Anticipacionerrores_mant_detalleds_15_tfmadetcolnom = AV42TFMADetColNom ;
      AV152Anticipacionerrores_mant_detalleds_16_tfmadetcolnom_sel = AV43TFMADetColNom_Sel ;
      AV153Anticipacionerrores_mant_detalleds_17_tfmadetcolcod = AV46TFMADetColCod ;
      AV154Anticipacionerrores_mant_detalleds_18_tfmadetcolcod_to = AV47TFMADetColCod_To ;
      AV155Anticipacionerrores_mant_detalleds_19_tfmadetmatcod = AV48TFMADetMatCod ;
      AV156Anticipacionerrores_mant_detalleds_20_tfmadetmatcod_to = AV49TFMADetMatCod_To ;
      AV157Anticipacionerrores_mant_detalleds_21_tfmadetmatdsc = AV80TFMADetMatDsc ;
      AV158Anticipacionerrores_mant_detalleds_22_tfmadetmatdsc_sel = AV81TFMADetMatDsc_Sel ;
      AV159Anticipacionerrores_mant_detalleds_23_tfmadetintcod = AV52TFMADetIntCod ;
      AV160Anticipacionerrores_mant_detalleds_24_tfmadetintcod_to = AV53TFMADetIntCod_To ;
      AV161Anticipacionerrores_mant_detalleds_25_tfmadetintdsc = AV82TFMADetIntDsc ;
      AV162Anticipacionerrores_mant_detalleds_26_tfmadetintdsc_sel = AV83TFMADetIntDsc_Sel ;
      AV163Anticipacionerrores_mant_detalleds_27_tfmadetmaqcod = AV56TFMADetMaqCod ;
      AV164Anticipacionerrores_mant_detalleds_28_tfmadetmaqcod_sel = AV57TFMADetMaqCod_Sel ;
      AV165Anticipacionerrores_mant_detalleds_29_tfmadetmaqdsc = AV58TFMADetMaqDsc ;
      AV166Anticipacionerrores_mant_detalleds_30_tfmadetmaqdsc_sel = AV59TFMADetMaqDsc_Sel ;
      AV167Anticipacionerrores_mant_detalleds_31_tfmadettipmcod = AV60TFMADetTipMCod ;
      AV168Anticipacionerrores_mant_detalleds_32_tfmadettipmcod_sel = AV61TFMADetTipMCod_Sel ;
      AV169Anticipacionerrores_mant_detalleds_33_tfmadettipmdsc = AV62TFMADetTipMDsc ;
      AV170Anticipacionerrores_mant_detalleds_34_tfmadettipmdsc_sel = AV63TFMADetTipMDsc_Sel ;
      AV171Anticipacionerrores_mant_detalleds_35_tfmadetdefcod = AV107TFMADetDefCod ;
      AV172Anticipacionerrores_mant_detalleds_36_tfmadetdefcod_to = AV108TFMADetDefCod_To ;
      AV173Anticipacionerrores_mant_detalleds_37_tfmadetdefdsc = AV109TFMADetDefDsc ;
      AV174Anticipacionerrores_mant_detalleds_38_tfmadetdefdsc_sel = AV110TFMADetDefDsc_Sel ;
      AV175Anticipacionerrores_mant_detalleds_39_tfmadetcatcod = AV111TFMADetCatCod ;
      AV176Anticipacionerrores_mant_detalleds_40_tfmadetcatcod_to = AV112TFMADetCatCod_To ;
      AV177Anticipacionerrores_mant_detalleds_41_tfmadetcatdsc = AV113TFMADetCatDsc ;
      AV178Anticipacionerrores_mant_detalleds_42_tfmadetcatdsc_sel = AV114TFMADetCatDsc_Sel ;
      AV179Anticipacionerrores_mant_detalleds_43_tfmadethdr = AV116TFMADetHdr ;
      AV180Anticipacionerrores_mant_detalleds_44_tfmadethdr_sel = AV117TFMADetHdr_Sel ;
      AV181Anticipacionerrores_mant_detalleds_45_tfmadetkilprod = AV64TFMADetKilProd ;
      AV182Anticipacionerrores_mant_detalleds_46_tfmadetkilprod_to = AV65TFMADetKilProd_To ;
      AV183Anticipacionerrores_mant_detalleds_47_tfmadetkilreo = AV66TFMADetKilReo ;
      AV184Anticipacionerrores_mant_detalleds_48_tfmadetkilreo_to = AV67TFMADetKilReo_To ;
      AV185Anticipacionerrores_mant_detalleds_49_tfmadetkiltot = AV93TFMADetKilTot ;
      AV186Anticipacionerrores_mant_detalleds_50_tfmadetkiltot_to = AV94TFMADetKilTot_To ;
      AV187Anticipacionerrores_mant_detalleds_51_tfmadetmetprod = AV122TFMADetMetProd ;
      AV188Anticipacionerrores_mant_detalleds_52_tfmadetmetprod_to = AV123TFMADetMetProd_To ;
      AV189Anticipacionerrores_mant_detalleds_53_tfmadetmetreo = AV124TFMADetMetReo ;
      AV190Anticipacionerrores_mant_detalleds_54_tfmadetmetreo_to = AV125TFMADetMetReo_To ;
      AV191Anticipacionerrores_mant_detalleds_55_tfmadetmettot = AV126TFMADetMetTot ;
      AV192Anticipacionerrores_mant_detalleds_56_tfmadetmettot_to = AV127TFMADetMetTot_To ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           A14590MADetTipMC ,
                                           AV79TipMaqCodCollection ,
                                           AV137Anticipacionerrores_mant_detalleds_1_filterfulltext ,
                                           AV138Anticipacionerrores_mant_detalleds_2_tfmadetfec ,
                                           AV140Anticipacionerrores_mant_detalleds_4_tfmadetemprcod_sel ,
                                           AV139Anticipacionerrores_mant_detalleds_3_tfmadetemprcod ,
                                           Integer.valueOf(AV141Anticipacionerrores_mant_detalleds_5_tfmadetclicod) ,
                                           Integer.valueOf(AV142Anticipacionerrores_mant_detalleds_6_tfmadetclicod_to) ,
                                           AV144Anticipacionerrores_mant_detalleds_8_tfmadetclinom_sel ,
                                           AV143Anticipacionerrores_mant_detalleds_7_tfmadetclinom ,
                                           AV146Anticipacionerrores_mant_detalleds_10_tfmadetartcod_sel ,
                                           AV145Anticipacionerrores_mant_detalleds_9_tfmadetartcod ,
                                           AV148Anticipacionerrores_mant_detalleds_12_tfmadetartdsc_sel ,
                                           AV147Anticipacionerrores_mant_detalleds_11_tfmadetartdsc ,
                                           Integer.valueOf(AV149Anticipacionerrores_mant_detalleds_13_tfmadetcolnum) ,
                                           Integer.valueOf(AV150Anticipacionerrores_mant_detalleds_14_tfmadetcolnum_to) ,
                                           AV152Anticipacionerrores_mant_detalleds_16_tfmadetcolnom_sel ,
                                           AV151Anticipacionerrores_mant_detalleds_15_tfmadetcolnom ,
                                           Byte.valueOf(AV153Anticipacionerrores_mant_detalleds_17_tfmadetcolcod) ,
                                           Byte.valueOf(AV154Anticipacionerrores_mant_detalleds_18_tfmadetcolcod_to) ,
                                           Short.valueOf(AV155Anticipacionerrores_mant_detalleds_19_tfmadetmatcod) ,
                                           Short.valueOf(AV156Anticipacionerrores_mant_detalleds_20_tfmadetmatcod_to) ,
                                           AV158Anticipacionerrores_mant_detalleds_22_tfmadetmatdsc_sel ,
                                           AV157Anticipacionerrores_mant_detalleds_21_tfmadetmatdsc ,
                                           Byte.valueOf(AV159Anticipacionerrores_mant_detalleds_23_tfmadetintcod) ,
                                           Byte.valueOf(AV160Anticipacionerrores_mant_detalleds_24_tfmadetintcod_to) ,
                                           AV162Anticipacionerrores_mant_detalleds_26_tfmadetintdsc_sel ,
                                           AV161Anticipacionerrores_mant_detalleds_25_tfmadetintdsc ,
                                           AV164Anticipacionerrores_mant_detalleds_28_tfmadetmaqcod_sel ,
                                           AV163Anticipacionerrores_mant_detalleds_27_tfmadetmaqcod ,
                                           AV166Anticipacionerrores_mant_detalleds_30_tfmadetmaqdsc_sel ,
                                           AV165Anticipacionerrores_mant_detalleds_29_tfmadetmaqdsc ,
                                           AV168Anticipacionerrores_mant_detalleds_32_tfmadettipmcod_sel ,
                                           AV167Anticipacionerrores_mant_detalleds_31_tfmadettipmcod ,
                                           AV170Anticipacionerrores_mant_detalleds_34_tfmadettipmdsc_sel ,
                                           AV169Anticipacionerrores_mant_detalleds_33_tfmadettipmdsc ,
                                           Short.valueOf(AV171Anticipacionerrores_mant_detalleds_35_tfmadetdefcod) ,
                                           Short.valueOf(AV172Anticipacionerrores_mant_detalleds_36_tfmadetdefcod_to) ,
                                           AV174Anticipacionerrores_mant_detalleds_38_tfmadetdefdsc_sel ,
                                           AV173Anticipacionerrores_mant_detalleds_37_tfmadetdefdsc ,
                                           Short.valueOf(AV175Anticipacionerrores_mant_detalleds_39_tfmadetcatcod) ,
                                           Short.valueOf(AV176Anticipacionerrores_mant_detalleds_40_tfmadetcatcod_to) ,
                                           AV178Anticipacionerrores_mant_detalleds_42_tfmadetcatdsc_sel ,
                                           AV177Anticipacionerrores_mant_detalleds_41_tfmadetcatdsc ,
                                           AV180Anticipacionerrores_mant_detalleds_44_tfmadethdr_sel ,
                                           AV179Anticipacionerrores_mant_detalleds_43_tfmadethdr ,
                                           AV181Anticipacionerrores_mant_detalleds_45_tfmadetkilprod ,
                                           AV182Anticipacionerrores_mant_detalleds_46_tfmadetkilprod_to ,
                                           AV183Anticipacionerrores_mant_detalleds_47_tfmadetkilreo ,
                                           AV184Anticipacionerrores_mant_detalleds_48_tfmadetkilreo_to ,
                                           AV185Anticipacionerrores_mant_detalleds_49_tfmadetkiltot ,
                                           AV186Anticipacionerrores_mant_detalleds_50_tfmadetkiltot_to ,
                                           AV187Anticipacionerrores_mant_detalleds_51_tfmadetmetprod ,
                                           AV188Anticipacionerrores_mant_detalleds_52_tfmadetmetprod_to ,
                                           AV189Anticipacionerrores_mant_detalleds_53_tfmadetmetreo ,
                                           AV190Anticipacionerrores_mant_detalleds_54_tfmadetmetreo_to ,
                                           AV191Anticipacionerrores_mant_detalleds_55_tfmadetmettot ,
                                           AV192Anticipacionerrores_mant_detalleds_56_tfmadetmettot_to ,
                                           AV72ArtCod ,
                                           Integer.valueOf(AV73ForColNum) ,
                                           AV115MADetMaqCod ,
                                           Integer.valueOf(AV79TipMaqCodCollection.size()) ,
                                           Short.valueOf(AV103MADetDefCod) ,
                                           Short.valueOf(AV104MADetCatCod) ,
                                           A14587MADetEmprC ,
                                           Integer.valueOf(A14585MADetCliCo) ,
                                           A14651MADetCliNo ,
                                           A14588MADetArtCo ,
                                           A14652MADetArtDs ,
                                           Integer.valueOf(A14589MADetColNu) ,
                                           A14653MADetColNo ,
                                           Byte.valueOf(A14654MADetColCo) ,
                                           Short.valueOf(A14592MADetMatCo) ,
                                           A14655MADetMatDs ,
                                           Byte.valueOf(A14593MADetIntCo) ,
                                           A14660MADetIntDs ,
                                           A14591MADetMaqCo ,
                                           A14656MADetMaqDs ,
                                           A14657MADetTipMD ,
                                           Short.valueOf(A14662MADetDefCo) ,
                                           A14663MADetDefDs ,
                                           Short.valueOf(A14664MADetCatCo) ,
                                           A14665MADetCatDs ,
                                           Integer.valueOf(A14666MADetBarCo) ,
                                           Byte.valueOf(A14667MADetBarRe) ,
                                           A14668MADetBarPa ,
                                           A14658MADetKilPr ,
                                           A14659MADetKilRe ,
                                           A14661MADetKilTo ,
                                           A14670MADetMetPr ,
                                           A14671MADetMetRe ,
                                           A14672MADetMetTo ,
                                           A14586MADetFec ,
                                           AV70MADetEmprCod ,
                                           AV91sdtMTok.getgxTv_SdtsdtMTok_Mtkn() ,
                                           AV91sdtMTok.getgxTv_SdtsdtMTok_Mtknusu() ,
                                           Integer.valueOf(AV71CliCod) ,
                                           A14583MADetTkn ,
                                           A14584MADetUsu } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV137Anticipacionerrores_mant_detalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV137Anticipacionerrores_mant_detalleds_1_filterfulltext), "%", "") ;
      lV137Anticipacionerrores_mant_detalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV137Anticipacionerrores_mant_detalleds_1_filterfulltext), "%", "") ;
      lV137Anticipacionerrores_mant_detalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV137Anticipacionerrores_mant_detalleds_1_filterfulltext), "%", "") ;
      lV137Anticipacionerrores_mant_detalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV137Anticipacionerrores_mant_detalleds_1_filterfulltext), "%", "") ;
      lV137Anticipacionerrores_mant_detalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV137Anticipacionerrores_mant_detalleds_1_filterfulltext), "%", "") ;
      lV137Anticipacionerrores_mant_detalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV137Anticipacionerrores_mant_detalleds_1_filterfulltext), "%", "") ;
      lV137Anticipacionerrores_mant_detalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV137Anticipacionerrores_mant_detalleds_1_filterfulltext), "%", "") ;
      lV137Anticipacionerrores_mant_detalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV137Anticipacionerrores_mant_detalleds_1_filterfulltext), "%", "") ;
      lV137Anticipacionerrores_mant_detalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV137Anticipacionerrores_mant_detalleds_1_filterfulltext), "%", "") ;
      lV137Anticipacionerrores_mant_detalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV137Anticipacionerrores_mant_detalleds_1_filterfulltext), "%", "") ;
      lV137Anticipacionerrores_mant_detalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV137Anticipacionerrores_mant_detalleds_1_filterfulltext), "%", "") ;
      lV137Anticipacionerrores_mant_detalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV137Anticipacionerrores_mant_detalleds_1_filterfulltext), "%", "") ;
      lV137Anticipacionerrores_mant_detalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV137Anticipacionerrores_mant_detalleds_1_filterfulltext), "%", "") ;
      lV137Anticipacionerrores_mant_detalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV137Anticipacionerrores_mant_detalleds_1_filterfulltext), "%", "") ;
      lV137Anticipacionerrores_mant_detalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV137Anticipacionerrores_mant_detalleds_1_filterfulltext), "%", "") ;
      lV137Anticipacionerrores_mant_detalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV137Anticipacionerrores_mant_detalleds_1_filterfulltext), "%", "") ;
      lV137Anticipacionerrores_mant_detalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV137Anticipacionerrores_mant_detalleds_1_filterfulltext), "%", "") ;
      lV137Anticipacionerrores_mant_detalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV137Anticipacionerrores_mant_detalleds_1_filterfulltext), "%", "") ;
      lV137Anticipacionerrores_mant_detalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV137Anticipacionerrores_mant_detalleds_1_filterfulltext), "%", "") ;
      lV137Anticipacionerrores_mant_detalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV137Anticipacionerrores_mant_detalleds_1_filterfulltext), "%", "") ;
      lV137Anticipacionerrores_mant_detalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV137Anticipacionerrores_mant_detalleds_1_filterfulltext), "%", "") ;
      lV137Anticipacionerrores_mant_detalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV137Anticipacionerrores_mant_detalleds_1_filterfulltext), "%", "") ;
      lV137Anticipacionerrores_mant_detalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV137Anticipacionerrores_mant_detalleds_1_filterfulltext), "%", "") ;
      lV137Anticipacionerrores_mant_detalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV137Anticipacionerrores_mant_detalleds_1_filterfulltext), "%", "") ;
      lV137Anticipacionerrores_mant_detalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV137Anticipacionerrores_mant_detalleds_1_filterfulltext), "%", "") ;
      lV137Anticipacionerrores_mant_detalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV137Anticipacionerrores_mant_detalleds_1_filterfulltext), "%", "") ;
      lV137Anticipacionerrores_mant_detalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV137Anticipacionerrores_mant_detalleds_1_filterfulltext), "%", "") ;
      lV139Anticipacionerrores_mant_detalleds_3_tfmadetemprcod = GXutil.padr( GXutil.rtrim( AV139Anticipacionerrores_mant_detalleds_3_tfmadetemprcod), 3, "%") ;
      lV143Anticipacionerrores_mant_detalleds_7_tfmadetclinom = GXutil.concat( GXutil.rtrim( AV143Anticipacionerrores_mant_detalleds_7_tfmadetclinom), "%", "") ;
      lV145Anticipacionerrores_mant_detalleds_9_tfmadetartcod = GXutil.padr( GXutil.rtrim( AV145Anticipacionerrores_mant_detalleds_9_tfmadetartcod), 16, "%") ;
      lV147Anticipacionerrores_mant_detalleds_11_tfmadetartdsc = GXutil.concat( GXutil.rtrim( AV147Anticipacionerrores_mant_detalleds_11_tfmadetartdsc), "%", "") ;
      lV151Anticipacionerrores_mant_detalleds_15_tfmadetcolnom = GXutil.padr( GXutil.rtrim( AV151Anticipacionerrores_mant_detalleds_15_tfmadetcolnom), 13, "%") ;
      lV157Anticipacionerrores_mant_detalleds_21_tfmadetmatdsc = GXutil.concat( GXutil.rtrim( AV157Anticipacionerrores_mant_detalleds_21_tfmadetmatdsc), "%", "") ;
      lV161Anticipacionerrores_mant_detalleds_25_tfmadetintdsc = GXutil.concat( GXutil.rtrim( AV161Anticipacionerrores_mant_detalleds_25_tfmadetintdsc), "%", "") ;
      lV163Anticipacionerrores_mant_detalleds_27_tfmadetmaqcod = GXutil.padr( GXutil.rtrim( AV163Anticipacionerrores_mant_detalleds_27_tfmadetmaqcod), 6, "%") ;
      lV165Anticipacionerrores_mant_detalleds_29_tfmadetmaqdsc = GXutil.concat( GXutil.rtrim( AV165Anticipacionerrores_mant_detalleds_29_tfmadetmaqdsc), "%", "") ;
      lV167Anticipacionerrores_mant_detalleds_31_tfmadettipmcod = GXutil.padr( GXutil.rtrim( AV167Anticipacionerrores_mant_detalleds_31_tfmadettipmcod), 4, "%") ;
      lV169Anticipacionerrores_mant_detalleds_33_tfmadettipmdsc = GXutil.concat( GXutil.rtrim( AV169Anticipacionerrores_mant_detalleds_33_tfmadettipmdsc), "%", "") ;
      lV173Anticipacionerrores_mant_detalleds_37_tfmadetdefdsc = GXutil.concat( GXutil.rtrim( AV173Anticipacionerrores_mant_detalleds_37_tfmadetdefdsc), "%", "") ;
      lV177Anticipacionerrores_mant_detalleds_41_tfmadetcatdsc = GXutil.concat( GXutil.rtrim( AV177Anticipacionerrores_mant_detalleds_41_tfmadetcatdsc), "%", "") ;
      lV179Anticipacionerrores_mant_detalleds_43_tfmadethdr = GXutil.padr( GXutil.rtrim( AV179Anticipacionerrores_mant_detalleds_43_tfmadethdr), 10, "%") ;
      /* Using cursor H02DR4 */
      pr_default.execute(2, new Object[] {AV91sdtMTok.getgxTv_SdtsdtMTok_Mtkn(), AV91sdtMTok.getgxTv_SdtsdtMTok_Mtknusu(), Integer.valueOf(AV71CliCod), AV70MADetEmprCod, lV137Anticipacionerrores_mant_detalleds_1_filterfulltext, lV137Anticipacionerrores_mant_detalleds_1_filterfulltext, lV137Anticipacionerrores_mant_detalleds_1_filterfulltext, lV137Anticipacionerrores_mant_detalleds_1_filterfulltext, lV137Anticipacionerrores_mant_detalleds_1_filterfulltext, lV137Anticipacionerrores_mant_detalleds_1_filterfulltext, lV137Anticipacionerrores_mant_detalleds_1_filterfulltext, lV137Anticipacionerrores_mant_detalleds_1_filterfulltext, lV137Anticipacionerrores_mant_detalleds_1_filterfulltext, lV137Anticipacionerrores_mant_detalleds_1_filterfulltext, lV137Anticipacionerrores_mant_detalleds_1_filterfulltext, lV137Anticipacionerrores_mant_detalleds_1_filterfulltext, lV137Anticipacionerrores_mant_detalleds_1_filterfulltext, lV137Anticipacionerrores_mant_detalleds_1_filterfulltext, lV137Anticipacionerrores_mant_detalleds_1_filterfulltext, lV137Anticipacionerrores_mant_detalleds_1_filterfulltext, lV137Anticipacionerrores_mant_detalleds_1_filterfulltext, lV137Anticipacionerrores_mant_detalleds_1_filterfulltext, lV137Anticipacionerrores_mant_detalleds_1_filterfulltext, lV137Anticipacionerrores_mant_detalleds_1_filterfulltext, lV137Anticipacionerrores_mant_detalleds_1_filterfulltext, lV137Anticipacionerrores_mant_detalleds_1_filterfulltext, lV137Anticipacionerrores_mant_detalleds_1_filterfulltext, lV137Anticipacionerrores_mant_detalleds_1_filterfulltext, lV137Anticipacionerrores_mant_detalleds_1_filterfulltext, lV137Anticipacionerrores_mant_detalleds_1_filterfulltext, lV137Anticipacionerrores_mant_detalleds_1_filterfulltext, AV138Anticipacionerrores_mant_detalleds_2_tfmadetfec, lV139Anticipacionerrores_mant_detalleds_3_tfmadetemprcod, AV140Anticipacionerrores_mant_detalleds_4_tfmadetemprcod_sel, Integer.valueOf(AV141Anticipacionerrores_mant_detalleds_5_tfmadetclicod), Integer.valueOf(AV142Anticipacionerrores_mant_detalleds_6_tfmadetclicod_to), lV143Anticipacionerrores_mant_detalleds_7_tfmadetclinom, AV144Anticipacionerrores_mant_detalleds_8_tfmadetclinom_sel, lV145Anticipacionerrores_mant_detalleds_9_tfmadetartcod, AV146Anticipacionerrores_mant_detalleds_10_tfmadetartcod_sel, lV147Anticipacionerrores_mant_detalleds_11_tfmadetartdsc, AV148Anticipacionerrores_mant_detalleds_12_tfmadetartdsc_sel, Integer.valueOf(AV149Anticipacionerrores_mant_detalleds_13_tfmadetcolnum), Integer.valueOf(AV150Anticipacionerrores_mant_detalleds_14_tfmadetcolnum_to), lV151Anticipacionerrores_mant_detalleds_15_tfmadetcolnom, AV152Anticipacionerrores_mant_detalleds_16_tfmadetcolnom_sel, Byte.valueOf(AV153Anticipacionerrores_mant_detalleds_17_tfmadetcolcod), Byte.valueOf(AV154Anticipacionerrores_mant_detalleds_18_tfmadetcolcod_to), Short.valueOf(AV155Anticipacionerrores_mant_detalleds_19_tfmadetmatcod), Short.valueOf(AV156Anticipacionerrores_mant_detalleds_20_tfmadetmatcod_to), lV157Anticipacionerrores_mant_detalleds_21_tfmadetmatdsc, AV158Anticipacionerrores_mant_detalleds_22_tfmadetmatdsc_sel, Byte.valueOf(AV159Anticipacionerrores_mant_detalleds_23_tfmadetintcod), Byte.valueOf(AV160Anticipacionerrores_mant_detalleds_24_tfmadetintcod_to), lV161Anticipacionerrores_mant_detalleds_25_tfmadetintdsc, AV162Anticipacionerrores_mant_detalleds_26_tfmadetintdsc_sel, lV163Anticipacionerrores_mant_detalleds_27_tfmadetmaqcod, AV164Anticipacionerrores_mant_detalleds_28_tfmadetmaqcod_sel, lV165Anticipacionerrores_mant_detalleds_29_tfmadetmaqdsc, AV166Anticipacionerrores_mant_detalleds_30_tfmadetmaqdsc_sel, lV167Anticipacionerrores_mant_detalleds_31_tfmadettipmcod, AV168Anticipacionerrores_mant_detalleds_32_tfmadettipmcod_sel, lV169Anticipacionerrores_mant_detalleds_33_tfmadettipmdsc, AV170Anticipacionerrores_mant_detalleds_34_tfmadettipmdsc_sel, Short.valueOf(AV171Anticipacionerrores_mant_detalleds_35_tfmadetdefcod), Short.valueOf(AV172Anticipacionerrores_mant_detalleds_36_tfmadetdefcod_to), lV173Anticipacionerrores_mant_detalleds_37_tfmadetdefdsc, AV174Anticipacionerrores_mant_detalleds_38_tfmadetdefdsc_sel, Short.valueOf(AV175Anticipacionerrores_mant_detalleds_39_tfmadetcatcod), Short.valueOf(AV176Anticipacionerrores_mant_detalleds_40_tfmadetcatcod_to), lV177Anticipacionerrores_mant_detalleds_41_tfmadetcatdsc, AV178Anticipacionerrores_mant_detalleds_42_tfmadetcatdsc_sel, lV179Anticipacionerrores_mant_detalleds_43_tfmadethdr, AV180Anticipacionerrores_mant_detalleds_44_tfmadethdr_sel, AV181Anticipacionerrores_mant_detalleds_45_tfmadetkilprod, AV182Anticipacionerrores_mant_detalleds_46_tfmadetkilprod_to, AV183Anticipacionerrores_mant_detalleds_47_tfmadetkilreo, AV184Anticipacionerrores_mant_detalleds_48_tfmadetkilreo_to, AV185Anticipacionerrores_mant_detalleds_49_tfmadetkiltot, AV186Anticipacionerrores_mant_detalleds_50_tfmadetkiltot_to, AV187Anticipacionerrores_mant_detalleds_51_tfmadetmetprod, AV188Anticipacionerrores_mant_detalleds_52_tfmadetmetprod_to, AV189Anticipacionerrores_mant_detalleds_53_tfmadetmetreo, AV190Anticipacionerrores_mant_detalleds_54_tfmadetmetreo_to, AV191Anticipacionerrores_mant_detalleds_55_tfmadetmettot, AV192Anticipacionerrores_mant_detalleds_56_tfmadetmettot_to, AV72ArtCod, Integer.valueOf(AV73ForColNum), AV115MADetMaqCod, Short.valueOf(AV103MADetDefCod), Short.valueOf(AV104MADetCatCod)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A14583MADetTkn = H02DR4_A14583MADetTkn[0] ;
         A14584MADetUsu = H02DR4_A14584MADetUsu[0] ;
         A14672MADetMetTo = H02DR4_A14672MADetMetTo[0] ;
         n14672MADetMetTo = H02DR4_n14672MADetMetTo[0] ;
         A14671MADetMetRe = H02DR4_A14671MADetMetRe[0] ;
         n14671MADetMetRe = H02DR4_n14671MADetMetRe[0] ;
         A14670MADetMetPr = H02DR4_A14670MADetMetPr[0] ;
         n14670MADetMetPr = H02DR4_n14670MADetMetPr[0] ;
         A14661MADetKilTo = H02DR4_A14661MADetKilTo[0] ;
         A14659MADetKilRe = H02DR4_A14659MADetKilRe[0] ;
         A14658MADetKilPr = H02DR4_A14658MADetKilPr[0] ;
         n14658MADetKilPr = H02DR4_n14658MADetKilPr[0] ;
         A14665MADetCatDs = H02DR4_A14665MADetCatDs[0] ;
         n14665MADetCatDs = H02DR4_n14665MADetCatDs[0] ;
         A14664MADetCatCo = H02DR4_A14664MADetCatCo[0] ;
         n14664MADetCatCo = H02DR4_n14664MADetCatCo[0] ;
         A14663MADetDefDs = H02DR4_A14663MADetDefDs[0] ;
         n14663MADetDefDs = H02DR4_n14663MADetDefDs[0] ;
         A14662MADetDefCo = H02DR4_A14662MADetDefCo[0] ;
         n14662MADetDefCo = H02DR4_n14662MADetDefCo[0] ;
         A14657MADetTipMD = H02DR4_A14657MADetTipMD[0] ;
         n14657MADetTipMD = H02DR4_n14657MADetTipMD[0] ;
         A14590MADetTipMC = H02DR4_A14590MADetTipMC[0] ;
         A14656MADetMaqDs = H02DR4_A14656MADetMaqDs[0] ;
         n14656MADetMaqDs = H02DR4_n14656MADetMaqDs[0] ;
         A14591MADetMaqCo = H02DR4_A14591MADetMaqCo[0] ;
         A14660MADetIntDs = H02DR4_A14660MADetIntDs[0] ;
         n14660MADetIntDs = H02DR4_n14660MADetIntDs[0] ;
         A14593MADetIntCo = H02DR4_A14593MADetIntCo[0] ;
         A14655MADetMatDs = H02DR4_A14655MADetMatDs[0] ;
         n14655MADetMatDs = H02DR4_n14655MADetMatDs[0] ;
         A14592MADetMatCo = H02DR4_A14592MADetMatCo[0] ;
         A14654MADetColCo = H02DR4_A14654MADetColCo[0] ;
         A14653MADetColNo = H02DR4_A14653MADetColNo[0] ;
         A14589MADetColNu = H02DR4_A14589MADetColNu[0] ;
         A14652MADetArtDs = H02DR4_A14652MADetArtDs[0] ;
         n14652MADetArtDs = H02DR4_n14652MADetArtDs[0] ;
         A14588MADetArtCo = H02DR4_A14588MADetArtCo[0] ;
         A14651MADetCliNo = H02DR4_A14651MADetCliNo[0] ;
         n14651MADetCliNo = H02DR4_n14651MADetCliNo[0] ;
         A14585MADetCliCo = H02DR4_A14585MADetCliCo[0] ;
         A14587MADetEmprC = H02DR4_A14587MADetEmprC[0] ;
         A14586MADetFec = H02DR4_A14586MADetFec[0] ;
         A14668MADetBarPa = H02DR4_A14668MADetBarPa[0] ;
         A14667MADetBarRe = H02DR4_A14667MADetBarRe[0] ;
         A14666MADetBarCo = H02DR4_A14666MADetBarCo[0] ;
         A14669MADetHdr = GXutil.trim( GXutil.str( A14666MADetBarCo, 8, 0)) + GXutil.trim( GXutil.str( A14667MADetBarRe, 1, 0)) + A14668MADetBarPa ;
         AV87TotMADetKilProd = A14658MADetKilPr.add(AV87TotMADetKilProd) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV87TotMADetKilProd", GXutil.ltrimstr( AV87TotMADetKilProd, 18, 2));
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTMADETKILPROD", getSecureSignedToken( sPrefix, localUtil.format( AV87TotMADetKilProd, "ZZZZZZZZ9.99")));
         AV89TotMADetKilReo = A14659MADetKilRe.add(AV89TotMADetKilReo) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV89TotMADetKilReo", GXutil.ltrimstr( AV89TotMADetKilReo, 18, 2));
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTMADETKILREO", getSecureSignedToken( sPrefix, localUtil.format( AV89TotMADetKilReo, "ZZZZZZZZ9.99")));
         AV120TotMADetKilTot = A14661MADetKilTo.add(AV120TotMADetKilTot) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV120TotMADetKilTot", GXutil.ltrimstr( AV120TotMADetKilTot, 18, 2));
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTMADETKILTOT", getSecureSignedToken( sPrefix, localUtil.format( AV120TotMADetKilTot, "ZZZZZZZZ9.99")));
         AV128TotMADetMetReo = A14671MADetMetRe.add(AV128TotMADetMetReo) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV128TotMADetMetReo", GXutil.ltrimstr( AV128TotMADetMetReo, 18, 2));
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTMADETMETREO", getSecureSignedToken( sPrefix, localUtil.format( AV128TotMADetMetReo, "ZZZZZZZZ9.99")));
         pr_default.readNext(2);
      }
      pr_default.close(2);
      AV85TotMADetFec = subgrid_fnc_recordcount( ) ;
      AV86TotValueMADetFec = httpContext.getMessage( "WWP_TotalizerCount", "") + localUtil.format( DecimalUtil.doubleToDec(AV85TotMADetFec), "ZZZ,ZZZ,ZZZ,ZZZ,ZZZ,ZZ9") ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV86TotValueMADetFec", AV86TotValueMADetFec);
      AV88TotValueMADetKilProd = localUtil.format( AV87TotMADetKilProd, "ZZZZZZZZ9.99") ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV88TotValueMADetKilProd", AV88TotValueMADetKilProd);
      AV90TotValueMADetKilReo = localUtil.format( AV89TotMADetKilReo, "ZZZZZZZZ9.99") ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV90TotValueMADetKilReo", AV90TotValueMADetKilReo);
      AV121TotValueMADetKilTot = localUtil.format( AV120TotMADetKilTot, "ZZZZZZZZ9.99") ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV121TotValueMADetKilTot", AV121TotValueMADetKilTot);
      AV129TotValueMADetMetReo = localUtil.format( AV128TotMADetMetReo, "ZZZZZZZZ9.99") ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV129TotValueMADetMetReo", AV129TotValueMADetMetReo);
   }

   public void e152DR2( )
   {
      /* GlobalEvents_Refreshgrid Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV99Variable, "MAnt_Filtrado_RightButton") == 0 )
      {
         AV101sdtParametros.fromJSonString(AV100ValorRecibidoVariable, null);
         AV102TipMaqCodS.clear();
         AV102TipMaqCodS.add(AV101sdtParametros.getgxTv_SdtsdtParametros_Tipmaqcod(), 0);
         new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).debug(GXutil.format( httpContext.getMessage( "Llegan datos:%1, %2, tipomaquinas:%3.", ""), AV99Variable, AV101sdtParametros.toJSonString(false, true), AV102TipMaqCodS.toJSonString(false), "", "", "", "", "", ""), AV132Pgmname) ;
         AV100ValorRecibidoVariable = "" ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV100ValorRecibidoVariable", AV100ValorRecibidoVariable);
         this.executeExternalObjectMethod(sPrefix, false, "GlobalEvents", "RefreshGrid", new Object[] {"MAnt_Filtrado_TabDetalle",AV100ValorRecibidoVariable}, true);
      }
      /*  Sending Event outputs  */
   }

   public void wb_table2_73_2DR2( boolean wbgen )
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
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTotvaluemadetfec_Internalname, httpContext.getMessage( "Tot Value MADet Fec", ""), "gx-form-item AttributeTotalizerLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 78,'" + sPrefix + "',false,'" + sGXsfl_39_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotvaluemadetfec_Internalname, AV86TotValueMADetFec, GXutil.rtrim( localUtil.format( AV86TotValueMADetFec, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,78);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotvaluemadetfec_Jsonclick, 0, "AttributeTotalizer", "", "", "", "", 1, edtavTotvaluemadetfec_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_AnticipacionErrores\\MAnt_Detalle.htm");
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
         app.GxWebStd.gx_label_element( httpContext, edtavTotvaluemadetkilprod_Internalname, httpContext.getMessage( "Tot Value MADet Kil Prod", ""), "gx-form-item AttributeTotalizerLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 102,'" + sPrefix + "',false,'" + sGXsfl_39_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotvaluemadetkilprod_Internalname, AV88TotValueMADetKilProd, GXutil.rtrim( localUtil.format( AV88TotValueMADetKilProd, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,102);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotvaluemadetkilprod_Jsonclick, 0, "AttributeTotalizer", "", "", "", "", 1, edtavTotvaluemadetkilprod_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_AnticipacionErrores\\MAnt_Detalle.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTotvaluemadetkilreo_Internalname, httpContext.getMessage( "Tot Value MADet Kil Reo", ""), "gx-form-item AttributeTotalizerLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 105,'" + sPrefix + "',false,'" + sGXsfl_39_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotvaluemadetkilreo_Internalname, AV90TotValueMADetKilReo, GXutil.rtrim( localUtil.format( AV90TotValueMADetKilReo, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,105);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotvaluemadetkilreo_Jsonclick, 0, "AttributeTotalizer", "", "", "", "", 1, edtavTotvaluemadetkilreo_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_AnticipacionErrores\\MAnt_Detalle.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTotvaluemadetkiltot_Internalname, httpContext.getMessage( "Tot Value MADet Kil Tot", ""), "gx-form-item AttributeTotalizerLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 108,'" + sPrefix + "',false,'" + sGXsfl_39_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotvaluemadetkiltot_Internalname, AV121TotValueMADetKilTot, GXutil.rtrim( localUtil.format( AV121TotValueMADetKilTot, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,108);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotvaluemadetkiltot_Jsonclick, 0, "AttributeTotalizer", "", "", "", "", 1, edtavTotvaluemadetkiltot_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_AnticipacionErrores\\MAnt_Detalle.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTotvaluemadetmetreo_Internalname, httpContext.getMessage( "Tot Value MADet Met Reo", ""), "gx-form-item AttributeTotalizerLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 112,'" + sPrefix + "',false,'" + sGXsfl_39_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotvaluemadetmetreo_Internalname, AV129TotValueMADetMetReo, GXutil.rtrim( localUtil.format( AV129TotValueMADetMetReo, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,112);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotvaluemadetmetreo_Jsonclick, 0, "AttributeTotalizer", "", "", "", "", 1, edtavTotvaluemadetmetreo_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_AnticipacionErrores\\MAnt_Detalle.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
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
         wb_table2_73_2DR2e( true) ;
      }
      else
      {
         wb_table2_73_2DR2e( false) ;
      }
   }

   public void wb_table1_21_2DR2( boolean wbgen )
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
         ucDdo_managefilters.setProperty("DropDownOptionsData", AV23ManageFiltersData);
         ucDdo_managefilters.render(context, "dvelop.gxbootstrap.ddoregular", Ddo_managefilters_Internalname, sPrefix+"DDO_MANAGEFILTERSContainer");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table3_26_2DR2( true) ;
      }
      else
      {
         wb_table3_26_2DR2( false) ;
      }
      return  ;
   }

   public void wb_table3_26_2DR2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_21_2DR2e( true) ;
      }
      else
      {
         wb_table1_21_2DR2e( false) ;
      }
   }

   public void wb_table3_26_2DR2( boolean wbgen )
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 30,'" + sPrefix + "',false,'" + sGXsfl_39_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFilterfulltext_Internalname, AV15FilterFullText, GXutil.rtrim( localUtil.format( AV15FilterFullText, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,30);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", httpContext.getMessage( "WWP_Search", ""), edtavFilterfulltext_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavFilterfulltext_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "WWPFullTextFilter", "left", true, "", "HLP_AnticipacionErrores\\MAnt_Detalle.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table3_26_2DR2e( true) ;
      }
      else
      {
         wb_table3_26_2DR2e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV70MADetEmprCod = (String)getParm(obj,0,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV70MADetEmprCod", AV70MADetEmprCod);
      AV71CliCod = ((Number) GXutil.testNumericType( getParm(obj,1,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV71CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV71CliCod), 6, 0));
      AV72ArtCod = (String)getParm(obj,2,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV72ArtCod", AV72ArtCod);
      AV73ForColNum = ((Number) GXutil.testNumericType( getParm(obj,3,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV73ForColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV73ForColNum), 6, 0));
      AV74TipMaqCodJSON = (String)getParm(obj,4,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV74TipMaqCodJSON", AV74TipMaqCodJSON);
      AV75FechaInicio = (java.util.Date)getParm(obj,5,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV75FechaInicio", localUtil.format(AV75FechaInicio, "99/99/99"));
      AV76FechaFin = (java.util.Date)getParm(obj,6,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV76FechaFin", localUtil.format(AV76FechaFin, "99/99/99"));
      AV115MADetMaqCod = (String)getParm(obj,7,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV115MADetMaqCod", AV115MADetMaqCod);
      AV103MADetDefCod = ((Number) GXutil.testNumericType( getParm(obj,8,TypeConstants.SHORT), TypeConstants.SHORT)).shortValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV103MADetDefCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV103MADetDefCod), 4, 0));
      AV104MADetCatCod = ((Number) GXutil.testNumericType( getParm(obj,9,TypeConstants.SHORT), TypeConstants.SHORT)).shortValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV104MADetCatCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV104MADetCatCod), 4, 0));
      AV105MTknUsu = (String)getParm(obj,10,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV105MTknUsu", AV105MTknUsu);
      AV106MTkn = (String)getParm(obj,11,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV106MTkn", AV106MTkn);
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
      pa2DR2( ) ;
      ws2DR2( ) ;
      we2DR2( ) ;
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
      sCtrlAV70MADetEmprCod = (String)getParm(obj,0,TypeConstants.STRING) ;
      sCtrlAV71CliCod = (String)getParm(obj,1,TypeConstants.STRING) ;
      sCtrlAV72ArtCod = (String)getParm(obj,2,TypeConstants.STRING) ;
      sCtrlAV73ForColNum = (String)getParm(obj,3,TypeConstants.STRING) ;
      sCtrlAV74TipMaqCodJSON = (String)getParm(obj,4,TypeConstants.STRING) ;
      sCtrlAV75FechaInicio = (String)getParm(obj,5,TypeConstants.STRING) ;
      sCtrlAV76FechaFin = (String)getParm(obj,6,TypeConstants.STRING) ;
      sCtrlAV115MADetMaqCod = (String)getParm(obj,7,TypeConstants.STRING) ;
      sCtrlAV103MADetDefCod = (String)getParm(obj,8,TypeConstants.STRING) ;
      sCtrlAV104MADetCatCod = (String)getParm(obj,9,TypeConstants.STRING) ;
      sCtrlAV105MTknUsu = (String)getParm(obj,10,TypeConstants.STRING) ;
      sCtrlAV106MTkn = (String)getParm(obj,11,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      pa2DR2( ) ;
      wcparametersget( ) ;
   }

   @SuppressWarnings("unchecked")
   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "anticipacionerrores\\mant_detalle", GetJustCreated( ));
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
         init_web_controls( ) ;
      }
      pa2DR2( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         AV70MADetEmprCod = (String)getParm(obj,2,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV70MADetEmprCod", AV70MADetEmprCod);
         AV71CliCod = ((Number) GXutil.testNumericType( getParm(obj,3,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV71CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV71CliCod), 6, 0));
         AV72ArtCod = (String)getParm(obj,4,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV72ArtCod", AV72ArtCod);
         AV73ForColNum = ((Number) GXutil.testNumericType( getParm(obj,5,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV73ForColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV73ForColNum), 6, 0));
         AV74TipMaqCodJSON = (String)getParm(obj,6,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV74TipMaqCodJSON", AV74TipMaqCodJSON);
         AV75FechaInicio = (java.util.Date)getParm(obj,7,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV75FechaInicio", localUtil.format(AV75FechaInicio, "99/99/99"));
         AV76FechaFin = (java.util.Date)getParm(obj,8,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV76FechaFin", localUtil.format(AV76FechaFin, "99/99/99"));
         AV115MADetMaqCod = (String)getParm(obj,9,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV115MADetMaqCod", AV115MADetMaqCod);
         AV103MADetDefCod = ((Number) GXutil.testNumericType( getParm(obj,10,TypeConstants.SHORT), TypeConstants.SHORT)).shortValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV103MADetDefCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV103MADetDefCod), 4, 0));
         AV104MADetCatCod = ((Number) GXutil.testNumericType( getParm(obj,11,TypeConstants.SHORT), TypeConstants.SHORT)).shortValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV104MADetCatCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV104MADetCatCod), 4, 0));
         AV105MTknUsu = (String)getParm(obj,12,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV105MTknUsu", AV105MTknUsu);
         AV106MTkn = (String)getParm(obj,13,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV106MTkn", AV106MTkn);
      }
      wcpOAV70MADetEmprCod = httpContext.cgiGet( sPrefix+"wcpOAV70MADetEmprCod") ;
      wcpOAV71CliCod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV71CliCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV72ArtCod = httpContext.cgiGet( sPrefix+"wcpOAV72ArtCod") ;
      wcpOAV73ForColNum = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV73ForColNum"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV74TipMaqCodJSON = httpContext.cgiGet( sPrefix+"wcpOAV74TipMaqCodJSON") ;
      wcpOAV75FechaInicio = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV75FechaInicio"), 0) ;
      wcpOAV76FechaFin = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV76FechaFin"), 0) ;
      wcpOAV115MADetMaqCod = httpContext.cgiGet( sPrefix+"wcpOAV115MADetMaqCod") ;
      wcpOAV103MADetDefCod = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV103MADetDefCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV104MADetCatCod = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV104MADetCatCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV105MTknUsu = httpContext.cgiGet( sPrefix+"wcpOAV105MTknUsu") ;
      wcpOAV106MTkn = httpContext.cgiGet( sPrefix+"wcpOAV106MTkn") ;
      if ( ! GetJustCreated( ) && ( ( GXutil.strcmp(AV70MADetEmprCod, wcpOAV70MADetEmprCod) != 0 ) || ( AV71CliCod != wcpOAV71CliCod ) || ( GXutil.strcmp(AV72ArtCod, wcpOAV72ArtCod) != 0 ) || ( AV73ForColNum != wcpOAV73ForColNum ) || ( GXutil.strcmp(AV74TipMaqCodJSON, wcpOAV74TipMaqCodJSON) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(AV75FechaInicio), GXutil.resetTime(wcpOAV75FechaInicio)) ) || !( GXutil.dateCompare(GXutil.resetTime(AV76FechaFin), GXutil.resetTime(wcpOAV76FechaFin)) ) || ( GXutil.strcmp(AV115MADetMaqCod, wcpOAV115MADetMaqCod) != 0 ) || ( AV103MADetDefCod != wcpOAV103MADetDefCod ) || ( AV104MADetCatCod != wcpOAV104MADetCatCod ) || ( GXutil.strcmp(AV105MTknUsu, wcpOAV105MTknUsu) != 0 ) || ( GXutil.strcmp(AV106MTkn, wcpOAV106MTkn) != 0 ) ) )
      {
         setjustcreated();
      }
      wcpOAV70MADetEmprCod = AV70MADetEmprCod ;
      wcpOAV71CliCod = AV71CliCod ;
      wcpOAV72ArtCod = AV72ArtCod ;
      wcpOAV73ForColNum = AV73ForColNum ;
      wcpOAV74TipMaqCodJSON = AV74TipMaqCodJSON ;
      wcpOAV75FechaInicio = AV75FechaInicio ;
      wcpOAV76FechaFin = AV76FechaFin ;
      wcpOAV115MADetMaqCod = AV115MADetMaqCod ;
      wcpOAV103MADetDefCod = AV103MADetDefCod ;
      wcpOAV104MADetCatCod = AV104MADetCatCod ;
      wcpOAV105MTknUsu = AV105MTknUsu ;
      wcpOAV106MTkn = AV106MTkn ;
   }

   public void wcparametersget( )
   {
      /* Read Component Parameters. */
      sCtrlAV70MADetEmprCod = httpContext.cgiGet( sPrefix+"AV70MADetEmprCod_CTRL") ;
      if ( GXutil.len( sCtrlAV70MADetEmprCod) > 0 )
      {
         AV70MADetEmprCod = httpContext.cgiGet( sCtrlAV70MADetEmprCod) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV70MADetEmprCod", AV70MADetEmprCod);
      }
      else
      {
         AV70MADetEmprCod = httpContext.cgiGet( sPrefix+"AV70MADetEmprCod_PARM") ;
      }
      sCtrlAV71CliCod = httpContext.cgiGet( sPrefix+"AV71CliCod_CTRL") ;
      if ( GXutil.len( sCtrlAV71CliCod) > 0 )
      {
         AV71CliCod = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV71CliCod), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV71CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV71CliCod), 6, 0));
      }
      else
      {
         AV71CliCod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV71CliCod_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV72ArtCod = httpContext.cgiGet( sPrefix+"AV72ArtCod_CTRL") ;
      if ( GXutil.len( sCtrlAV72ArtCod) > 0 )
      {
         AV72ArtCod = httpContext.cgiGet( sCtrlAV72ArtCod) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV72ArtCod", AV72ArtCod);
      }
      else
      {
         AV72ArtCod = httpContext.cgiGet( sPrefix+"AV72ArtCod_PARM") ;
      }
      sCtrlAV73ForColNum = httpContext.cgiGet( sPrefix+"AV73ForColNum_CTRL") ;
      if ( GXutil.len( sCtrlAV73ForColNum) > 0 )
      {
         AV73ForColNum = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV73ForColNum), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV73ForColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV73ForColNum), 6, 0));
      }
      else
      {
         AV73ForColNum = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV73ForColNum_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV74TipMaqCodJSON = httpContext.cgiGet( sPrefix+"AV74TipMaqCodJSON_CTRL") ;
      if ( GXutil.len( sCtrlAV74TipMaqCodJSON) > 0 )
      {
         AV74TipMaqCodJSON = httpContext.cgiGet( sCtrlAV74TipMaqCodJSON) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV74TipMaqCodJSON", AV74TipMaqCodJSON);
      }
      else
      {
         AV74TipMaqCodJSON = httpContext.cgiGet( sPrefix+"AV74TipMaqCodJSON_PARM") ;
      }
      sCtrlAV75FechaInicio = httpContext.cgiGet( sPrefix+"AV75FechaInicio_CTRL") ;
      if ( GXutil.len( sCtrlAV75FechaInicio) > 0 )
      {
         AV75FechaInicio = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( sCtrlAV75FechaInicio), 0)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV75FechaInicio", localUtil.format(AV75FechaInicio, "99/99/99"));
      }
      else
      {
         AV75FechaInicio = localUtil.ctod( httpContext.cgiGet( sPrefix+"AV75FechaInicio_PARM"), 0) ;
      }
      sCtrlAV76FechaFin = httpContext.cgiGet( sPrefix+"AV76FechaFin_CTRL") ;
      if ( GXutil.len( sCtrlAV76FechaFin) > 0 )
      {
         AV76FechaFin = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( sCtrlAV76FechaFin), 0)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV76FechaFin", localUtil.format(AV76FechaFin, "99/99/99"));
      }
      else
      {
         AV76FechaFin = localUtil.ctod( httpContext.cgiGet( sPrefix+"AV76FechaFin_PARM"), 0) ;
      }
      sCtrlAV115MADetMaqCod = httpContext.cgiGet( sPrefix+"AV115MADetMaqCod_CTRL") ;
      if ( GXutil.len( sCtrlAV115MADetMaqCod) > 0 )
      {
         AV115MADetMaqCod = httpContext.cgiGet( sCtrlAV115MADetMaqCod) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV115MADetMaqCod", AV115MADetMaqCod);
      }
      else
      {
         AV115MADetMaqCod = httpContext.cgiGet( sPrefix+"AV115MADetMaqCod_PARM") ;
      }
      sCtrlAV103MADetDefCod = httpContext.cgiGet( sPrefix+"AV103MADetDefCod_CTRL") ;
      if ( GXutil.len( sCtrlAV103MADetDefCod) > 0 )
      {
         AV103MADetDefCod = (short)(localUtil.ctol( httpContext.cgiGet( sCtrlAV103MADetDefCod), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV103MADetDefCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV103MADetDefCod), 4, 0));
      }
      else
      {
         AV103MADetDefCod = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV103MADetDefCod_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV104MADetCatCod = httpContext.cgiGet( sPrefix+"AV104MADetCatCod_CTRL") ;
      if ( GXutil.len( sCtrlAV104MADetCatCod) > 0 )
      {
         AV104MADetCatCod = (short)(localUtil.ctol( httpContext.cgiGet( sCtrlAV104MADetCatCod), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV104MADetCatCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV104MADetCatCod), 4, 0));
      }
      else
      {
         AV104MADetCatCod = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV104MADetCatCod_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV105MTknUsu = httpContext.cgiGet( sPrefix+"AV105MTknUsu_CTRL") ;
      if ( GXutil.len( sCtrlAV105MTknUsu) > 0 )
      {
         AV105MTknUsu = httpContext.cgiGet( sCtrlAV105MTknUsu) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV105MTknUsu", AV105MTknUsu);
      }
      else
      {
         AV105MTknUsu = httpContext.cgiGet( sPrefix+"AV105MTknUsu_PARM") ;
      }
      sCtrlAV106MTkn = httpContext.cgiGet( sPrefix+"AV106MTkn_CTRL") ;
      if ( GXutil.len( sCtrlAV106MTkn) > 0 )
      {
         AV106MTkn = httpContext.cgiGet( sCtrlAV106MTkn) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV106MTkn", AV106MTkn);
      }
      else
      {
         AV106MTkn = httpContext.cgiGet( sPrefix+"AV106MTkn_PARM") ;
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
      pa2DR2( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      ws2DR2( ) ;
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
      ws2DR2( ) ;
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void wcparametersset( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV70MADetEmprCod_PARM", GXutil.rtrim( AV70MADetEmprCod));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV70MADetEmprCod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV70MADetEmprCod_CTRL", GXutil.rtrim( sCtrlAV70MADetEmprCod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV71CliCod_PARM", GXutil.ltrim( localUtil.ntoc( AV71CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV71CliCod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV71CliCod_CTRL", GXutil.rtrim( sCtrlAV71CliCod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV72ArtCod_PARM", GXutil.rtrim( AV72ArtCod));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV72ArtCod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV72ArtCod_CTRL", GXutil.rtrim( sCtrlAV72ArtCod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV73ForColNum_PARM", GXutil.ltrim( localUtil.ntoc( AV73ForColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV73ForColNum)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV73ForColNum_CTRL", GXutil.rtrim( sCtrlAV73ForColNum));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV74TipMaqCodJSON_PARM", AV74TipMaqCodJSON);
      if ( GXutil.len( GXutil.rtrim( sCtrlAV74TipMaqCodJSON)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV74TipMaqCodJSON_CTRL", GXutil.rtrim( sCtrlAV74TipMaqCodJSON));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV75FechaInicio_PARM", localUtil.dtoc( AV75FechaInicio, 0, "/"));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV75FechaInicio)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV75FechaInicio_CTRL", GXutil.rtrim( sCtrlAV75FechaInicio));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV76FechaFin_PARM", localUtil.dtoc( AV76FechaFin, 0, "/"));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV76FechaFin)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV76FechaFin_CTRL", GXutil.rtrim( sCtrlAV76FechaFin));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV115MADetMaqCod_PARM", GXutil.rtrim( AV115MADetMaqCod));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV115MADetMaqCod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV115MADetMaqCod_CTRL", GXutil.rtrim( sCtrlAV115MADetMaqCod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV103MADetDefCod_PARM", GXutil.ltrim( localUtil.ntoc( AV103MADetDefCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV103MADetDefCod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV103MADetDefCod_CTRL", GXutil.rtrim( sCtrlAV103MADetDefCod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV104MADetCatCod_PARM", GXutil.ltrim( localUtil.ntoc( AV104MADetCatCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV104MADetCatCod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV104MADetCatCod_CTRL", GXutil.rtrim( sCtrlAV104MADetCatCod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV105MTknUsu_PARM", GXutil.rtrim( AV105MTknUsu));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV105MTknUsu)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV105MTknUsu_CTRL", GXutil.rtrim( sCtrlAV105MTknUsu));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV106MTkn_PARM", AV106MTkn);
      if ( GXutil.len( GXutil.rtrim( sCtrlAV106MTkn)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV106MTkn_CTRL", GXutil.rtrim( sCtrlAV106MTkn));
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
      we2DR2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268211555943", true, true);
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
      httpContext.AddJavascriptSource("anticipacionerrores/mant_detalle.js", "?20268211555944", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
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

   public void subsflControlProps_392( )
   {
      edtMADetId_Internalname = sPrefix+"MADETID_"+sGXsfl_39_idx ;
      edtMADetFec_Internalname = sPrefix+"MADETFEC_"+sGXsfl_39_idx ;
      edtMADetEmprC_Internalname = sPrefix+"MADETEMPRC_"+sGXsfl_39_idx ;
      edtMADetCliCo_Internalname = sPrefix+"MADETCLICO_"+sGXsfl_39_idx ;
      edtMADetCliNo_Internalname = sPrefix+"MADETCLINO_"+sGXsfl_39_idx ;
      edtMADetArtCo_Internalname = sPrefix+"MADETARTCO_"+sGXsfl_39_idx ;
      edtMADetArtDs_Internalname = sPrefix+"MADETARTDS_"+sGXsfl_39_idx ;
      edtMADetColNu_Internalname = sPrefix+"MADETCOLNU_"+sGXsfl_39_idx ;
      edtMADetColNo_Internalname = sPrefix+"MADETCOLNO_"+sGXsfl_39_idx ;
      edtMADetColCo_Internalname = sPrefix+"MADETCOLCO_"+sGXsfl_39_idx ;
      edtMADetMatCo_Internalname = sPrefix+"MADETMATCO_"+sGXsfl_39_idx ;
      edtMADetMatDs_Internalname = sPrefix+"MADETMATDS_"+sGXsfl_39_idx ;
      edtMADetIntCo_Internalname = sPrefix+"MADETINTCO_"+sGXsfl_39_idx ;
      edtMADetIntDs_Internalname = sPrefix+"MADETINTDS_"+sGXsfl_39_idx ;
      edtMADetMaqCo_Internalname = sPrefix+"MADETMAQCO_"+sGXsfl_39_idx ;
      edtMADetMaqDs_Internalname = sPrefix+"MADETMAQDS_"+sGXsfl_39_idx ;
      edtMADetTipMC_Internalname = sPrefix+"MADETTIPMC_"+sGXsfl_39_idx ;
      edtMADetTipMD_Internalname = sPrefix+"MADETTIPMD_"+sGXsfl_39_idx ;
      edtMADetDefCo_Internalname = sPrefix+"MADETDEFCO_"+sGXsfl_39_idx ;
      edtMADetDefDs_Internalname = sPrefix+"MADETDEFDS_"+sGXsfl_39_idx ;
      edtMADetCatCo_Internalname = sPrefix+"MADETCATCO_"+sGXsfl_39_idx ;
      edtMADetCatDs_Internalname = sPrefix+"MADETCATDS_"+sGXsfl_39_idx ;
      edtMADetHdr_Internalname = sPrefix+"MADETHDR_"+sGXsfl_39_idx ;
      edtMADetKilPr_Internalname = sPrefix+"MADETKILPR_"+sGXsfl_39_idx ;
      edtMADetKilRe_Internalname = sPrefix+"MADETKILRE_"+sGXsfl_39_idx ;
      edtMADetKilTo_Internalname = sPrefix+"MADETKILTO_"+sGXsfl_39_idx ;
      edtMADetMetPr_Internalname = sPrefix+"MADETMETPR_"+sGXsfl_39_idx ;
      edtMADetMetRe_Internalname = sPrefix+"MADETMETRE_"+sGXsfl_39_idx ;
      edtMADetMetTo_Internalname = sPrefix+"MADETMETTO_"+sGXsfl_39_idx ;
      edtMADetUsu_Internalname = sPrefix+"MADETUSU_"+sGXsfl_39_idx ;
      edtMADetTkn_Internalname = sPrefix+"MADETTKN_"+sGXsfl_39_idx ;
   }

   public void subsflControlProps_fel_392( )
   {
      edtMADetId_Internalname = sPrefix+"MADETID_"+sGXsfl_39_fel_idx ;
      edtMADetFec_Internalname = sPrefix+"MADETFEC_"+sGXsfl_39_fel_idx ;
      edtMADetEmprC_Internalname = sPrefix+"MADETEMPRC_"+sGXsfl_39_fel_idx ;
      edtMADetCliCo_Internalname = sPrefix+"MADETCLICO_"+sGXsfl_39_fel_idx ;
      edtMADetCliNo_Internalname = sPrefix+"MADETCLINO_"+sGXsfl_39_fel_idx ;
      edtMADetArtCo_Internalname = sPrefix+"MADETARTCO_"+sGXsfl_39_fel_idx ;
      edtMADetArtDs_Internalname = sPrefix+"MADETARTDS_"+sGXsfl_39_fel_idx ;
      edtMADetColNu_Internalname = sPrefix+"MADETCOLNU_"+sGXsfl_39_fel_idx ;
      edtMADetColNo_Internalname = sPrefix+"MADETCOLNO_"+sGXsfl_39_fel_idx ;
      edtMADetColCo_Internalname = sPrefix+"MADETCOLCO_"+sGXsfl_39_fel_idx ;
      edtMADetMatCo_Internalname = sPrefix+"MADETMATCO_"+sGXsfl_39_fel_idx ;
      edtMADetMatDs_Internalname = sPrefix+"MADETMATDS_"+sGXsfl_39_fel_idx ;
      edtMADetIntCo_Internalname = sPrefix+"MADETINTCO_"+sGXsfl_39_fel_idx ;
      edtMADetIntDs_Internalname = sPrefix+"MADETINTDS_"+sGXsfl_39_fel_idx ;
      edtMADetMaqCo_Internalname = sPrefix+"MADETMAQCO_"+sGXsfl_39_fel_idx ;
      edtMADetMaqDs_Internalname = sPrefix+"MADETMAQDS_"+sGXsfl_39_fel_idx ;
      edtMADetTipMC_Internalname = sPrefix+"MADETTIPMC_"+sGXsfl_39_fel_idx ;
      edtMADetTipMD_Internalname = sPrefix+"MADETTIPMD_"+sGXsfl_39_fel_idx ;
      edtMADetDefCo_Internalname = sPrefix+"MADETDEFCO_"+sGXsfl_39_fel_idx ;
      edtMADetDefDs_Internalname = sPrefix+"MADETDEFDS_"+sGXsfl_39_fel_idx ;
      edtMADetCatCo_Internalname = sPrefix+"MADETCATCO_"+sGXsfl_39_fel_idx ;
      edtMADetCatDs_Internalname = sPrefix+"MADETCATDS_"+sGXsfl_39_fel_idx ;
      edtMADetHdr_Internalname = sPrefix+"MADETHDR_"+sGXsfl_39_fel_idx ;
      edtMADetKilPr_Internalname = sPrefix+"MADETKILPR_"+sGXsfl_39_fel_idx ;
      edtMADetKilRe_Internalname = sPrefix+"MADETKILRE_"+sGXsfl_39_fel_idx ;
      edtMADetKilTo_Internalname = sPrefix+"MADETKILTO_"+sGXsfl_39_fel_idx ;
      edtMADetMetPr_Internalname = sPrefix+"MADETMETPR_"+sGXsfl_39_fel_idx ;
      edtMADetMetRe_Internalname = sPrefix+"MADETMETRE_"+sGXsfl_39_fel_idx ;
      edtMADetMetTo_Internalname = sPrefix+"MADETMETTO_"+sGXsfl_39_fel_idx ;
      edtMADetUsu_Internalname = sPrefix+"MADETUSU_"+sGXsfl_39_fel_idx ;
      edtMADetTkn_Internalname = sPrefix+"MADETTKN_"+sGXsfl_39_fel_idx ;
   }

   public void sendrow_392( )
   {
      subsflControlProps_392( ) ;
      wb2DR0( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_39_idx - GRID_nFirstRecordOnPage <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_39_idx) % (2))) == 0 )
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
            httpContext.writeText( " class=\""+"GridWithTotalizer GridNoBorder WorkWith"+"\" style=\""+""+"\"") ;
            httpContext.writeText( " gxrow=\""+sGXsfl_39_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMADetId_Internalname,GXutil.ltrim( localUtil.ntoc( A14582MADetId, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A14582MADetId), "ZZZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtMADetId_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(39),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"AnticipacionErrores\\Id","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtMADetFec_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMADetFec_Internalname,localUtil.format(A14586MADetFec, "99/99/99"),localUtil.format( A14586MADetFec, "99/99/99"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtMADetFec_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtMADetFec_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(39),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtMADetEmprC_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMADetEmprC_Internalname,GXutil.rtrim( A14587MADetEmprC),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtMADetEmprC_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtMADetEmprC_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(39),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtMADetCliCo_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMADetCliCo_Internalname,GXutil.ltrim( localUtil.ntoc( A14585MADetCliCo, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A14585MADetCliCo), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtMADetCliCo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtMADetCliCo_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(39),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtMADetCliNo_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMADetCliNo_Internalname,A14651MADetCliNo,"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtMADetCliNo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtMADetCliNo_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(255),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(39),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"Mensaje","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtMADetArtCo_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMADetArtCo_Internalname,GXutil.rtrim( A14588MADetArtCo),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtMADetArtCo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtMADetArtCo_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(39),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtMADetArtDs_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMADetArtDs_Internalname,A14652MADetArtDs,"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtMADetArtDs_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtMADetArtDs_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(255),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(39),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"Mensaje","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtMADetColNu_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMADetColNu_Internalname,GXutil.ltrim( localUtil.ntoc( A14589MADetColNu, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A14589MADetColNu), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtMADetColNu_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtMADetColNu_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(39),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtMADetColNo_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMADetColNo_Internalname,GXutil.rtrim( A14653MADetColNo),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtMADetColNo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtMADetColNo_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(39),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtMADetColCo_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMADetColCo_Internalname,GXutil.ltrim( localUtil.ntoc( A14654MADetColCo, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A14654MADetColCo), "Z9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtMADetColCo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtMADetColCo_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(39),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtMADetMatCo_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMADetMatCo_Internalname,GXutil.ltrim( localUtil.ntoc( A14592MADetMatCo, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A14592MADetMatCo), "ZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtMADetMatCo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtMADetMatCo_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(39),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtMADetMatDs_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMADetMatDs_Internalname,A14655MADetMatDs,"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtMADetMatDs_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtMADetMatDs_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(255),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(39),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"Mensaje","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtMADetIntCo_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMADetIntCo_Internalname,GXutil.ltrim( localUtil.ntoc( A14593MADetIntCo, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A14593MADetIntCo), "Z9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtMADetIntCo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtMADetIntCo_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(39),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtMADetIntDs_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMADetIntDs_Internalname,A14660MADetIntDs,"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtMADetIntDs_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtMADetIntDs_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(255),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(39),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"Mensaje","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtMADetMaqCo_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMADetMaqCo_Internalname,GXutil.rtrim( A14591MADetMaqCo),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtMADetMaqCo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtMADetMaqCo_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(39),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtMADetMaqDs_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMADetMaqDs_Internalname,A14656MADetMaqDs,"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtMADetMaqDs_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtMADetMaqDs_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(255),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(39),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"Mensaje","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtMADetTipMC_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMADetTipMC_Internalname,GXutil.rtrim( A14590MADetTipMC),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtMADetTipMC_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtMADetTipMC_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(39),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtMADetTipMD_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMADetTipMD_Internalname,A14657MADetTipMD,"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtMADetTipMD_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtMADetTipMD_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(255),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(39),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"Mensaje","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtMADetDefCo_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMADetDefCo_Internalname,GXutil.ltrim( localUtil.ntoc( A14662MADetDefCo, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A14662MADetDefCo), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtMADetDefCo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtMADetDefCo_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(39),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtMADetDefDs_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMADetDefDs_Internalname,A14663MADetDefDs,"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtMADetDefDs_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtMADetDefDs_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(255),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(39),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"Mensaje","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtMADetCatCo_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMADetCatCo_Internalname,GXutil.ltrim( localUtil.ntoc( A14664MADetCatCo, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A14664MADetCatCo), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtMADetCatCo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtMADetCatCo_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(39),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtMADetCatDs_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMADetCatDs_Internalname,A14665MADetCatDs,"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtMADetCatDs_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtMADetCatDs_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(255),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(39),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"Mensaje","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtMADetHdr_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMADetHdr_Internalname,GXutil.rtrim( A14669MADetHdr),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtMADetHdr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtMADetHdr_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(39),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"Ingenieria\\Hdr","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtMADetKilPr_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMADetKilPr_Internalname,GXutil.ltrim( localUtil.ntoc( A14658MADetKilPr, (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A14658MADetKilPr, "ZZZZZZZZ9.99")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtMADetKilPr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtMADetKilPr_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(39),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtMADetKilRe_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMADetKilRe_Internalname,GXutil.ltrim( localUtil.ntoc( A14659MADetKilRe, (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A14659MADetKilRe, "ZZZZZZZZ9.99")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtMADetKilRe_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtMADetKilRe_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(39),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtMADetKilTo_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMADetKilTo_Internalname,GXutil.ltrim( localUtil.ntoc( A14661MADetKilTo, (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A14661MADetKilTo, "ZZZZZZZZ9.99")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtMADetKilTo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtMADetKilTo_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(39),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtMADetMetPr_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMADetMetPr_Internalname,GXutil.ltrim( localUtil.ntoc( A14670MADetMetPr, (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A14670MADetMetPr, "ZZZZZZZZ9.99")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtMADetMetPr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtMADetMetPr_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(39),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtMADetMetRe_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMADetMetRe_Internalname,GXutil.ltrim( localUtil.ntoc( A14671MADetMetRe, (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A14671MADetMetRe, "ZZZZZZZZ9.99")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtMADetMetRe_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtMADetMetRe_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(39),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtMADetMetTo_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMADetMetTo_Internalname,GXutil.ltrim( localUtil.ntoc( A14672MADetMetTo, (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A14672MADetMetTo, "ZZZZZZZZ9.99")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtMADetMetTo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtMADetMetTo_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(39),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMADetUsu_Internalname,GXutil.rtrim( A14584MADetUsu),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtMADetUsu_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(39),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMADetTkn_Internalname,A14583MADetTkn,"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtMADetTkn_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(256),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(39),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         send_integrity_lvl_hashes2DR2( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_39_idx = ((subGrid_Islastpage==1)&&(nGXsfl_39_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_39_idx+1) ;
         sGXsfl_39_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_39_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_392( ) ;
      }
      /* End function sendrow_392 */
   }

   public void startgridcontrol39( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+sPrefix+"GridContainer"+"DivS\" data-gxgridid=\"39\">") ;
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, subGrid_Internalname, subGrid_Internalname, "", "GridWithTotalizer GridNoBorder WorkWith", 0, "", "", 1, 2, sStyleString, "", "", 0);
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
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtMADetFec_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fecha", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtMADetEmprC_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Empresa", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtMADetCliCo_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cliente", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtMADetCliNo_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cliente", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtMADetArtCo_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Artículo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtMADetArtDs_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Artículo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtMADetColNu_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nro.Color", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtMADetColNo_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Color", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtMADetColCo_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Tipo Colorante", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtMADetMatCo_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cód Matiz", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtMADetMatDs_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Matiz", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtMADetIntCo_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cód. Intensidad", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtMADetIntDs_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Intensidad", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtMADetMaqCo_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cód. máquina", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtMADetMaqDs_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Máquina", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtMADetTipMC_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cód.  Tipo Máquina", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtMADetTipMD_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Tipo Máquina", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtMADetDefCo_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Defecto", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtMADetDefDs_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Defecto", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtMADetCatCo_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Categoria Defecto", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtMADetCatDs_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Categoria", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtMADetHdr_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "HDR", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtMADetKilPr_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Kilos Produccion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtMADetKilRe_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Kilos Reoperados", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtMADetKilTo_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Kilos Total", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtMADetMetPr_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Metros Produccion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtMADetMetRe_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Metros Reoperados", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtMADetMetTo_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Metros Total", "")) ;
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
         GridContainer.AddObjectProperty("Class", "GridWithTotalizer GridNoBorder WorkWith");
         GridContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Sortable", GXutil.ltrim( localUtil.ntoc( subGrid_Sortable, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("CmpContext", sPrefix);
         GridContainer.AddObjectProperty("InMasterPage", "false");
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A14582MADetId, (byte)(10), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.format(A14586MADetFec, "99/99/99"));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtMADetFec_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A14587MADetEmprC));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtMADetEmprC_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A14585MADetCliCo, (byte)(6), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtMADetCliCo_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", A14651MADetCliNo);
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtMADetCliNo_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A14588MADetArtCo));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtMADetArtCo_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", A14652MADetArtDs);
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtMADetArtDs_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A14589MADetColNu, (byte)(6), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtMADetColNu_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A14653MADetColNo));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtMADetColNo_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A14654MADetColCo, (byte)(2), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtMADetColCo_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A14592MADetMatCo, (byte)(3), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtMADetMatCo_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", A14655MADetMatDs);
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtMADetMatDs_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A14593MADetIntCo, (byte)(2), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtMADetIntCo_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", A14660MADetIntDs);
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtMADetIntDs_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A14591MADetMaqCo));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtMADetMaqCo_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", A14656MADetMaqDs);
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtMADetMaqDs_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A14590MADetTipMC));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtMADetTipMC_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", A14657MADetTipMD);
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtMADetTipMD_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A14662MADetDefCo, (byte)(4), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtMADetDefCo_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", A14663MADetDefDs);
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtMADetDefDs_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A14664MADetCatCo, (byte)(4), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtMADetCatCo_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", A14665MADetCatDs);
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtMADetCatDs_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A14669MADetHdr));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtMADetHdr_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A14658MADetKilPr, (byte)(12), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtMADetKilPr_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A14659MADetKilRe, (byte)(12), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtMADetKilRe_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A14661MADetKilTo, (byte)(12), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtMADetKilTo_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A14670MADetMetPr, (byte)(12), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtMADetMetPr_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A14671MADetMetRe, (byte)(12), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtMADetMetRe_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A14672MADetMetTo, (byte)(12), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtMADetMetTo_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A14584MADetUsu));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", A14583MADetTkn);
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
      bttBtneditcolumns_Internalname = sPrefix+"BTNEDITCOLUMNS" ;
      divTableactions_Internalname = sPrefix+"TABLEACTIONS" ;
      Ddo_managefilters_Internalname = sPrefix+"DDO_MANAGEFILTERS" ;
      edtavFilterfulltext_Internalname = sPrefix+"vFILTERFULLTEXT" ;
      tblTablefilters_Internalname = sPrefix+"TABLEFILTERS" ;
      tblTablerightheader_Internalname = sPrefix+"TABLERIGHTHEADER" ;
      divTableheader_Internalname = sPrefix+"TABLEHEADER" ;
      Dvpanel_tableheader_Internalname = sPrefix+"DVPANEL_TABLEHEADER" ;
      edtMADetId_Internalname = sPrefix+"MADETID" ;
      edtMADetFec_Internalname = sPrefix+"MADETFEC" ;
      edtMADetEmprC_Internalname = sPrefix+"MADETEMPRC" ;
      edtMADetCliCo_Internalname = sPrefix+"MADETCLICO" ;
      edtMADetCliNo_Internalname = sPrefix+"MADETCLINO" ;
      edtMADetArtCo_Internalname = sPrefix+"MADETARTCO" ;
      edtMADetArtDs_Internalname = sPrefix+"MADETARTDS" ;
      edtMADetColNu_Internalname = sPrefix+"MADETCOLNU" ;
      edtMADetColNo_Internalname = sPrefix+"MADETCOLNO" ;
      edtMADetColCo_Internalname = sPrefix+"MADETCOLCO" ;
      edtMADetMatCo_Internalname = sPrefix+"MADETMATCO" ;
      edtMADetMatDs_Internalname = sPrefix+"MADETMATDS" ;
      edtMADetIntCo_Internalname = sPrefix+"MADETINTCO" ;
      edtMADetIntDs_Internalname = sPrefix+"MADETINTDS" ;
      edtMADetMaqCo_Internalname = sPrefix+"MADETMAQCO" ;
      edtMADetMaqDs_Internalname = sPrefix+"MADETMAQDS" ;
      edtMADetTipMC_Internalname = sPrefix+"MADETTIPMC" ;
      edtMADetTipMD_Internalname = sPrefix+"MADETTIPMD" ;
      edtMADetDefCo_Internalname = sPrefix+"MADETDEFCO" ;
      edtMADetDefDs_Internalname = sPrefix+"MADETDEFDS" ;
      edtMADetCatCo_Internalname = sPrefix+"MADETCATCO" ;
      edtMADetCatDs_Internalname = sPrefix+"MADETCATDS" ;
      edtMADetHdr_Internalname = sPrefix+"MADETHDR" ;
      edtMADetKilPr_Internalname = sPrefix+"MADETKILPR" ;
      edtMADetKilRe_Internalname = sPrefix+"MADETKILRE" ;
      edtMADetKilTo_Internalname = sPrefix+"MADETKILTO" ;
      edtMADetMetPr_Internalname = sPrefix+"MADETMETPR" ;
      edtMADetMetRe_Internalname = sPrefix+"MADETMETRE" ;
      edtMADetMetTo_Internalname = sPrefix+"MADETMETTO" ;
      edtMADetUsu_Internalname = sPrefix+"MADETUSU" ;
      edtMADetTkn_Internalname = sPrefix+"MADETTKN" ;
      edtavTotvaluemadetfec_Internalname = sPrefix+"vTOTVALUEMADETFEC" ;
      edtavTotvaluemadetkilprod_Internalname = sPrefix+"vTOTVALUEMADETKILPROD" ;
      edtavTotvaluemadetkilreo_Internalname = sPrefix+"vTOTVALUEMADETKILREO" ;
      edtavTotvaluemadetkiltot_Internalname = sPrefix+"vTOTVALUEMADETKILTOT" ;
      edtavTotvaluemadetmetreo_Internalname = sPrefix+"vTOTVALUEMADETMETREO" ;
      tblGridtabletotalizer_Internalname = sPrefix+"GRIDTABLETOTALIZER" ;
      divGridtablewithtotalizers_Internalname = sPrefix+"GRIDTABLEWITHTOTALIZERS" ;
      edtavPgmname_Internalname = sPrefix+"vPGMNAME" ;
      divTablemain_Internalname = sPrefix+"TABLEMAIN" ;
      Ddo_grid_Internalname = sPrefix+"DDO_GRID" ;
      Ddo_gridcolumnsselector_Internalname = sPrefix+"DDO_GRIDCOLUMNSSELECTOR" ;
      Grid_empowerer_Internalname = sPrefix+"GRID_EMPOWERER" ;
      edtavDdo_madetfecauxdate_Internalname = sPrefix+"vDDO_MADETFECAUXDATE" ;
      divDdo_madetfecauxdates_Internalname = sPrefix+"DDO_MADETFECAUXDATES" ;
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
      edtMADetTkn_Jsonclick = "" ;
      edtMADetUsu_Jsonclick = "" ;
      edtMADetMetTo_Jsonclick = "" ;
      edtMADetMetRe_Jsonclick = "" ;
      edtMADetMetPr_Jsonclick = "" ;
      edtMADetKilTo_Jsonclick = "" ;
      edtMADetKilRe_Jsonclick = "" ;
      edtMADetKilPr_Jsonclick = "" ;
      edtMADetHdr_Jsonclick = "" ;
      edtMADetCatDs_Jsonclick = "" ;
      edtMADetCatCo_Jsonclick = "" ;
      edtMADetDefDs_Jsonclick = "" ;
      edtMADetDefCo_Jsonclick = "" ;
      edtMADetTipMD_Jsonclick = "" ;
      edtMADetTipMC_Jsonclick = "" ;
      edtMADetMaqDs_Jsonclick = "" ;
      edtMADetMaqCo_Jsonclick = "" ;
      edtMADetIntDs_Jsonclick = "" ;
      edtMADetIntCo_Jsonclick = "" ;
      edtMADetMatDs_Jsonclick = "" ;
      edtMADetMatCo_Jsonclick = "" ;
      edtMADetColCo_Jsonclick = "" ;
      edtMADetColNo_Jsonclick = "" ;
      edtMADetColNu_Jsonclick = "" ;
      edtMADetArtDs_Jsonclick = "" ;
      edtMADetArtCo_Jsonclick = "" ;
      edtMADetCliNo_Jsonclick = "" ;
      edtMADetCliCo_Jsonclick = "" ;
      edtMADetEmprC_Jsonclick = "" ;
      edtMADetFec_Jsonclick = "" ;
      edtMADetId_Jsonclick = "" ;
      subGrid_Class = "GridWithTotalizer GridNoBorder WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavFilterfulltext_Jsonclick = "" ;
      edtavFilterfulltext_Enabled = 1 ;
      edtavTotvaluemadetmetreo_Jsonclick = "" ;
      edtavTotvaluemadetmetreo_Enabled = 1 ;
      edtavTotvaluemadetkiltot_Jsonclick = "" ;
      edtavTotvaluemadetkiltot_Enabled = 1 ;
      edtavTotvaluemadetkilreo_Jsonclick = "" ;
      edtavTotvaluemadetkilreo_Enabled = 1 ;
      edtavTotvaluemadetkilprod_Jsonclick = "" ;
      edtavTotvaluemadetkilprod_Enabled = 1 ;
      edtavTotvaluemadetfec_Jsonclick = "" ;
      edtavTotvaluemadetfec_Enabled = 1 ;
      edtMADetMetTo_Visible = -1 ;
      edtMADetMetRe_Visible = -1 ;
      edtMADetMetPr_Visible = -1 ;
      edtMADetKilTo_Visible = -1 ;
      edtMADetKilRe_Visible = -1 ;
      edtMADetKilPr_Visible = -1 ;
      edtMADetHdr_Visible = -1 ;
      edtMADetCatDs_Visible = -1 ;
      edtMADetCatCo_Visible = -1 ;
      edtMADetDefDs_Visible = -1 ;
      edtMADetDefCo_Visible = -1 ;
      edtMADetTipMD_Visible = -1 ;
      edtMADetTipMC_Visible = -1 ;
      edtMADetMaqDs_Visible = -1 ;
      edtMADetMaqCo_Visible = -1 ;
      edtMADetIntDs_Visible = -1 ;
      edtMADetIntCo_Visible = -1 ;
      edtMADetMatDs_Visible = -1 ;
      edtMADetMatCo_Visible = -1 ;
      edtMADetColCo_Visible = -1 ;
      edtMADetColNo_Visible = -1 ;
      edtMADetColNu_Visible = -1 ;
      edtMADetArtDs_Visible = -1 ;
      edtMADetArtCo_Visible = -1 ;
      edtMADetCliNo_Visible = -1 ;
      edtMADetCliCo_Visible = -1 ;
      edtMADetEmprC_Visible = -1 ;
      edtMADetFec_Visible = -1 ;
      subGrid_Sortable = (byte)(0) ;
      edtavDdo_madetfecauxdate_Jsonclick = "" ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      Grid_empowerer_Hascolumnsselector = GXutil.toBoolean( -1) ;
      Grid_empowerer_Hastitlesettings = GXutil.toBoolean( -1) ;
      Grid_empowerer_Infinitescrolling = "Form" ;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = "" ;
      Ddo_gridcolumnsselector_Dropdownoptionstype = "GridColumnsSelector" ;
      Ddo_gridcolumnsselector_Cls = "ColumnsSelector hidden-xs" ;
      Ddo_gridcolumnsselector_Tooltip = "WWP_EditColumnsTooltip" ;
      Ddo_gridcolumnsselector_Caption = httpContext.getMessage( "WWP_EditColumnsCaption", "") ;
      Ddo_grid_Datalistproc = "AnticipacionErrores.MAnt_DetalleGetFilterData" ;
      Ddo_grid_Datalisttype = "|Dynamic||Dynamic|Dynamic|Dynamic||Dynamic|||Dynamic||Dynamic|Dynamic|Dynamic|Dynamic|Dynamic||Dynamic||Dynamic|Dynamic||||||" ;
      Ddo_grid_Includedatalist = "|T||T|T|T||T|||T||T|T|T|T|T||T||T|T||||||" ;
      Ddo_grid_Filterisrange = "||T||||T||T|T||T||||||T||T|||T|T|T|T|T|T" ;
      Ddo_grid_Filtertype = "Date|Character|Numeric|Character|Character|Character|Numeric|Character|Numeric|Numeric|Character|Numeric|Character|Character|Character|Character|Character|Numeric|Character|Numeric|Character|Character|Numeric|Numeric|Numeric|Numeric|Numeric|Numeric" ;
      Ddo_grid_Includefilter = "T" ;
      Ddo_grid_Fixable = "T" ;
      Ddo_grid_Includesortasc = "T|T|T|T|T|T|T|T|T|T|T|T|T|T|T|T|T|T|T|T|T||T|T|T|T|T|T" ;
      Ddo_grid_Columnssortvalues = "2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22||23|24|25|26|27|28" ;
      Ddo_grid_Columnids = "1:MADetFec|2:MADetEmprCod|3:MADetCliCod|4:MADetCliNom|5:MADetArtCod|6:MADetArtDsc|7:MADetColNum|8:MADetColNom|9:MADetColCod|10:MADetMatCod|11:MADetMatDsc|12:MADetIntCod|13:MADetIntDsc|14:MADetMaqCod|15:MADetMaqDsc|16:MADetTipMCod|17:MADetTipMDsc|18:MADetDefCod|19:MADetDefDsc|20:MADetCatCod|21:MADetCatDsc|22:MADetHdr|23:MADetKilProd|24:MADetKilReo|25:MADetKilTot|26:MADetMetProd|27:MADetMetReo|28:MADetMetTot" ;
      Ddo_grid_Gridinternalname = "" ;
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
      subGrid_Rows = 50 ;
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'sPrefix'},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV28TFMADetFec',fld:'vTFMADETFEC',pic:''},{av:'AV32TFMADetEmprCod',fld:'vTFMADETEMPRCOD',pic:''},{av:'AV33TFMADetEmprCod_Sel',fld:'vTFMADETEMPRCOD_SEL',pic:''},{av:'AV34TFMADetCliCod',fld:'vTFMADETCLICOD',pic:'ZZZZZ9'},{av:'AV35TFMADetCliCod_To',fld:'vTFMADETCLICOD_TO',pic:'ZZZZZ9'},{av:'AV36TFMADetCliNom',fld:'vTFMADETCLINOM',pic:''},{av:'AV37TFMADetCliNom_Sel',fld:'vTFMADETCLINOM_SEL',pic:''},{av:'AV38TFMADetArtCod',fld:'vTFMADETARTCOD',pic:''},{av:'AV39TFMADetArtCod_Sel',fld:'vTFMADETARTCOD_SEL',pic:''},{av:'AV77TFMADetArtDsc',fld:'vTFMADETARTDSC',pic:''},{av:'AV78TFMADetArtDsc_Sel',fld:'vTFMADETARTDSC_SEL',pic:''},{av:'AV44TFMADetColNum',fld:'vTFMADETCOLNUM',pic:'ZZZZZ9'},{av:'AV45TFMADetColNum_To',fld:'vTFMADETCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV42TFMADetColNom',fld:'vTFMADETCOLNOM',pic:''},{av:'AV43TFMADetColNom_Sel',fld:'vTFMADETCOLNOM_SEL',pic:''},{av:'AV46TFMADetColCod',fld:'vTFMADETCOLCOD',pic:'Z9'},{av:'AV47TFMADetColCod_To',fld:'vTFMADETCOLCOD_TO',pic:'Z9'},{av:'AV48TFMADetMatCod',fld:'vTFMADETMATCOD',pic:'ZZ9'},{av:'AV49TFMADetMatCod_To',fld:'vTFMADETMATCOD_TO',pic:'ZZ9'},{av:'AV80TFMADetMatDsc',fld:'vTFMADETMATDSC',pic:''},{av:'AV81TFMADetMatDsc_Sel',fld:'vTFMADETMATDSC_SEL',pic:''},{av:'AV52TFMADetIntCod',fld:'vTFMADETINTCOD',pic:'Z9'},{av:'AV53TFMADetIntCod_To',fld:'vTFMADETINTCOD_TO',pic:'Z9'},{av:'AV82TFMADetIntDsc',fld:'vTFMADETINTDSC',pic:''},{av:'AV83TFMADetIntDsc_Sel',fld:'vTFMADETINTDSC_SEL',pic:''},{av:'AV56TFMADetMaqCod',fld:'vTFMADETMAQCOD',pic:''},{av:'AV57TFMADetMaqCod_Sel',fld:'vTFMADETMAQCOD_SEL',pic:''},{av:'AV58TFMADetMaqDsc',fld:'vTFMADETMAQDSC',pic:''},{av:'AV59TFMADetMaqDsc_Sel',fld:'vTFMADETMAQDSC_SEL',pic:''},{av:'AV60TFMADetTipMCod',fld:'vTFMADETTIPMCOD',pic:''},{av:'AV61TFMADetTipMCod_Sel',fld:'vTFMADETTIPMCOD_SEL',pic:''},{av:'AV62TFMADetTipMDsc',fld:'vTFMADETTIPMDSC',pic:''},{av:'AV63TFMADetTipMDsc_Sel',fld:'vTFMADETTIPMDSC_SEL',pic:''},{av:'AV107TFMADetDefCod',fld:'vTFMADETDEFCOD',pic:'ZZZ9'},{av:'AV108TFMADetDefCod_To',fld:'vTFMADETDEFCOD_TO',pic:'ZZZ9'},{av:'AV109TFMADetDefDsc',fld:'vTFMADETDEFDSC',pic:''},{av:'AV110TFMADetDefDsc_Sel',fld:'vTFMADETDEFDSC_SEL',pic:''},{av:'AV111TFMADetCatCod',fld:'vTFMADETCATCOD',pic:'ZZZ9'},{av:'AV112TFMADetCatCod_To',fld:'vTFMADETCATCOD_TO',pic:'ZZZ9'},{av:'AV113TFMADetCatDsc',fld:'vTFMADETCATDSC',pic:''},{av:'AV114TFMADetCatDsc_Sel',fld:'vTFMADETCATDSC_SEL',pic:''},{av:'AV116TFMADetHdr',fld:'vTFMADETHDR',pic:''},{av:'AV117TFMADetHdr_Sel',fld:'vTFMADETHDR_SEL',pic:''},{av:'AV64TFMADetKilProd',fld:'vTFMADETKILPROD',pic:'ZZZZZZZZ9.99'},{av:'AV65TFMADetKilProd_To',fld:'vTFMADETKILPROD_TO',pic:'ZZZZZZZZ9.99'},{av:'AV66TFMADetKilReo',fld:'vTFMADETKILREO',pic:'ZZZZZZZZ9.99'},{av:'AV67TFMADetKilReo_To',fld:'vTFMADETKILREO_TO',pic:'ZZZZZZZZ9.99'},{av:'AV93TFMADetKilTot',fld:'vTFMADETKILTOT',pic:'ZZZZZZZZ9.99'},{av:'AV94TFMADetKilTot_To',fld:'vTFMADETKILTOT_TO',pic:'ZZZZZZZZ9.99'},{av:'AV122TFMADetMetProd',fld:'vTFMADETMETPROD',pic:'ZZZZZZZZ9.99'},{av:'AV123TFMADetMetProd_To',fld:'vTFMADETMETPROD_TO',pic:'ZZZZZZZZ9.99'},{av:'AV124TFMADetMetReo',fld:'vTFMADETMETREO',pic:'ZZZZZZZZ9.99'},{av:'AV125TFMADetMetReo_To',fld:'vTFMADETMETREO_TO',pic:'ZZZZZZZZ9.99'},{av:'AV126TFMADetMetTot',fld:'vTFMADETMETTOT',pic:'ZZZZZZZZ9.99'},{av:'AV127TFMADetMetTot_To',fld:'vTFMADETMETTOT_TO',pic:'ZZZZZZZZ9.99'},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV70MADetEmprCod',fld:'vMADETEMPRCOD',pic:''},{av:'AV71CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV72ArtCod',fld:'vARTCOD',pic:''},{av:'AV73ForColNum',fld:'vFORCOLNUM',pic:'ZZZZZ9'},{av:'AV74TipMaqCodJSON',fld:'vTIPMAQCODJSON',pic:''},{av:'AV75FechaInicio',fld:'vFECHAINICIO',pic:''},{av:'AV76FechaFin',fld:'vFECHAFIN',pic:''},{av:'AV115MADetMaqCod',fld:'vMADETMAQCOD',pic:''},{av:'AV103MADetDefCod',fld:'vMADETDEFCOD',pic:'ZZZ9'},{av:'AV104MADetCatCod',fld:'vMADETCATCOD',pic:'ZZZ9'},{av:'AV105MTknUsu',fld:'vMTKNUSU',pic:''},{av:'AV106MTkn',fld:'vMTKN',pic:''},{av:'A14584MADetUsu',fld:'MADETUSU',pic:''},{av:'A14583MADetTkn',fld:'MADETTKN',pic:''},{av:'A14587MADetEmprC',fld:'MADETEMPRC',pic:''},{av:'A14585MADetCliCo',fld:'MADETCLICO',pic:'ZZZZZ9'},{av:'A14588MADetArtCo',fld:'MADETARTCO',pic:''},{av:'A14589MADetColNu',fld:'MADETCOLNU',pic:'ZZZZZ9'},{av:'A14591MADetMaqCo',fld:'MADETMAQCO',pic:''},{av:'A14590MADetTipMC',fld:'MADETTIPMC',pic:''},{av:'A14662MADetDefCo',fld:'MADETDEFCO',pic:'ZZZ9'},{av:'A14664MADetCatCo',fld:'MADETCATCO',pic:'ZZZ9'},{av:'A14658MADetKilPr',fld:'MADETKILPR',pic:'ZZZZZZZZ9.99'},{av:'A14659MADetKilRe',fld:'MADETKILRE',pic:'ZZZZZZZZ9.99'},{av:'A14661MADetKilTo',fld:'MADETKILTO',pic:'ZZZZZZZZ9.99'},{av:'A14671MADetMetRe',fld:'MADETMETRE',pic:'ZZZZZZZZ9.99'},{av:'AV91sdtMTok',fld:'vSDTMTOK',pic:'',hsh:true},{av:'AV79TipMaqCodCollection',fld:'vTIPMAQCODCOLLECTION',pic:'',hsh:true},{av:'AV87TotMADetKilProd',fld:'vTOTMADETKILPROD',pic:'ZZZZZZZZ9.99',hsh:true},{av:'AV89TotMADetKilReo',fld:'vTOTMADETKILREO',pic:'ZZZZZZZZ9.99',hsh:true},{av:'AV120TotMADetKilTot',fld:'vTOTMADETKILTOT',pic:'ZZZZZZZZ9.99',hsh:true},{av:'AV128TotMADetMetReo',fld:'vTOTMADETMETREO',pic:'ZZZZZZZZ9.99',hsh:true},{av:'AV132Pgmname',fld:'vPGMNAME',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtMADetFec_Visible',ctrl:'MADETFEC',prop:'Visible'},{av:'edtMADetEmprC_Visible',ctrl:'MADETEMPRC',prop:'Visible'},{av:'edtMADetCliCo_Visible',ctrl:'MADETCLICO',prop:'Visible'},{av:'edtMADetCliNo_Visible',ctrl:'MADETCLINO',prop:'Visible'},{av:'edtMADetArtCo_Visible',ctrl:'MADETARTCO',prop:'Visible'},{av:'edtMADetArtDs_Visible',ctrl:'MADETARTDS',prop:'Visible'},{av:'edtMADetColNu_Visible',ctrl:'MADETCOLNU',prop:'Visible'},{av:'edtMADetColNo_Visible',ctrl:'MADETCOLNO',prop:'Visible'},{av:'edtMADetColCo_Visible',ctrl:'MADETCOLCO',prop:'Visible'},{av:'edtMADetMatCo_Visible',ctrl:'MADETMATCO',prop:'Visible'},{av:'edtMADetMatDs_Visible',ctrl:'MADETMATDS',prop:'Visible'},{av:'edtMADetIntCo_Visible',ctrl:'MADETINTCO',prop:'Visible'},{av:'edtMADetIntDs_Visible',ctrl:'MADETINTDS',prop:'Visible'},{av:'edtMADetMaqCo_Visible',ctrl:'MADETMAQCO',prop:'Visible'},{av:'edtMADetMaqDs_Visible',ctrl:'MADETMAQDS',prop:'Visible'},{av:'edtMADetTipMC_Visible',ctrl:'MADETTIPMC',prop:'Visible'},{av:'edtMADetTipMD_Visible',ctrl:'MADETTIPMD',prop:'Visible'},{av:'edtMADetDefCo_Visible',ctrl:'MADETDEFCO',prop:'Visible'},{av:'edtMADetDefDs_Visible',ctrl:'MADETDEFDS',prop:'Visible'},{av:'edtMADetCatCo_Visible',ctrl:'MADETCATCO',prop:'Visible'},{av:'edtMADetCatDs_Visible',ctrl:'MADETCATDS',prop:'Visible'},{av:'edtMADetHdr_Visible',ctrl:'MADETHDR',prop:'Visible'},{av:'edtMADetKilPr_Visible',ctrl:'MADETKILPR',prop:'Visible'},{av:'edtMADetKilRe_Visible',ctrl:'MADETKILRE',prop:'Visible'},{av:'edtMADetKilTo_Visible',ctrl:'MADETKILTO',prop:'Visible'},{av:'edtMADetMetPr_Visible',ctrl:'MADETMETPR',prop:'Visible'},{av:'edtMADetMetRe_Visible',ctrl:'MADETMETRE',prop:'Visible'},{av:'edtMADetMetTo_Visible',ctrl:'MADETMETTO',prop:'Visible'},{av:'AV23ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV87TotMADetKilProd',fld:'vTOTMADETKILPROD',pic:'ZZZZZZZZ9.99',hsh:true},{av:'AV89TotMADetKilReo',fld:'vTOTMADETKILREO',pic:'ZZZZZZZZ9.99',hsh:true},{av:'AV120TotMADetKilTot',fld:'vTOTMADETKILTOT',pic:'ZZZZZZZZ9.99',hsh:true},{av:'AV128TotMADetMetReo',fld:'vTOTMADETMETREO',pic:'ZZZZZZZZ9.99',hsh:true},{av:'AV86TotValueMADetFec',fld:'vTOTVALUEMADETFEC',pic:''},{av:'AV88TotValueMADetKilProd',fld:'vTOTVALUEMADETKILPROD',pic:''},{av:'AV90TotValueMADetKilReo',fld:'vTOTVALUEMADETKILREO',pic:''},{av:'AV121TotValueMADetKilTot',fld:'vTOTVALUEMADETKILTOT',pic:''},{av:'AV129TotValueMADetMetReo',fld:'vTOTVALUEMADETMETREO',pic:''}]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e122DR2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV70MADetEmprCod',fld:'vMADETEMPRCOD',pic:''},{av:'AV71CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV72ArtCod',fld:'vARTCOD',pic:''},{av:'AV73ForColNum',fld:'vFORCOLNUM',pic:'ZZZZZ9'},{av:'AV115MADetMaqCod',fld:'vMADETMAQCOD',pic:''},{av:'AV103MADetDefCod',fld:'vMADETDEFCOD',pic:'ZZZ9'},{av:'AV104MADetCatCod',fld:'vMADETCATCOD',pic:'ZZZ9'},{av:'AV79TipMaqCodCollection',fld:'vTIPMAQCODCOLLECTION',pic:'',hsh:true},{av:'AV91sdtMTok',fld:'vSDTMTOK',pic:'',hsh:true},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV28TFMADetFec',fld:'vTFMADETFEC',pic:''},{av:'AV32TFMADetEmprCod',fld:'vTFMADETEMPRCOD',pic:''},{av:'AV33TFMADetEmprCod_Sel',fld:'vTFMADETEMPRCOD_SEL',pic:''},{av:'AV34TFMADetCliCod',fld:'vTFMADETCLICOD',pic:'ZZZZZ9'},{av:'AV35TFMADetCliCod_To',fld:'vTFMADETCLICOD_TO',pic:'ZZZZZ9'},{av:'AV36TFMADetCliNom',fld:'vTFMADETCLINOM',pic:''},{av:'AV37TFMADetCliNom_Sel',fld:'vTFMADETCLINOM_SEL',pic:''},{av:'AV38TFMADetArtCod',fld:'vTFMADETARTCOD',pic:''},{av:'AV39TFMADetArtCod_Sel',fld:'vTFMADETARTCOD_SEL',pic:''},{av:'AV77TFMADetArtDsc',fld:'vTFMADETARTDSC',pic:''},{av:'AV78TFMADetArtDsc_Sel',fld:'vTFMADETARTDSC_SEL',pic:''},{av:'AV44TFMADetColNum',fld:'vTFMADETCOLNUM',pic:'ZZZZZ9'},{av:'AV45TFMADetColNum_To',fld:'vTFMADETCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV42TFMADetColNom',fld:'vTFMADETCOLNOM',pic:''},{av:'AV43TFMADetColNom_Sel',fld:'vTFMADETCOLNOM_SEL',pic:''},{av:'AV46TFMADetColCod',fld:'vTFMADETCOLCOD',pic:'Z9'},{av:'AV47TFMADetColCod_To',fld:'vTFMADETCOLCOD_TO',pic:'Z9'},{av:'AV48TFMADetMatCod',fld:'vTFMADETMATCOD',pic:'ZZ9'},{av:'AV49TFMADetMatCod_To',fld:'vTFMADETMATCOD_TO',pic:'ZZ9'},{av:'AV80TFMADetMatDsc',fld:'vTFMADETMATDSC',pic:''},{av:'AV81TFMADetMatDsc_Sel',fld:'vTFMADETMATDSC_SEL',pic:''},{av:'AV52TFMADetIntCod',fld:'vTFMADETINTCOD',pic:'Z9'},{av:'AV53TFMADetIntCod_To',fld:'vTFMADETINTCOD_TO',pic:'Z9'},{av:'AV82TFMADetIntDsc',fld:'vTFMADETINTDSC',pic:''},{av:'AV83TFMADetIntDsc_Sel',fld:'vTFMADETINTDSC_SEL',pic:''},{av:'AV56TFMADetMaqCod',fld:'vTFMADETMAQCOD',pic:''},{av:'AV57TFMADetMaqCod_Sel',fld:'vTFMADETMAQCOD_SEL',pic:''},{av:'AV58TFMADetMaqDsc',fld:'vTFMADETMAQDSC',pic:''},{av:'AV59TFMADetMaqDsc_Sel',fld:'vTFMADETMAQDSC_SEL',pic:''},{av:'AV60TFMADetTipMCod',fld:'vTFMADETTIPMCOD',pic:''},{av:'AV61TFMADetTipMCod_Sel',fld:'vTFMADETTIPMCOD_SEL',pic:''},{av:'AV62TFMADetTipMDsc',fld:'vTFMADETTIPMDSC',pic:''},{av:'AV63TFMADetTipMDsc_Sel',fld:'vTFMADETTIPMDSC_SEL',pic:''},{av:'AV107TFMADetDefCod',fld:'vTFMADETDEFCOD',pic:'ZZZ9'},{av:'AV108TFMADetDefCod_To',fld:'vTFMADETDEFCOD_TO',pic:'ZZZ9'},{av:'AV109TFMADetDefDsc',fld:'vTFMADETDEFDSC',pic:''},{av:'AV110TFMADetDefDsc_Sel',fld:'vTFMADETDEFDSC_SEL',pic:''},{av:'AV111TFMADetCatCod',fld:'vTFMADETCATCOD',pic:'ZZZ9'},{av:'AV112TFMADetCatCod_To',fld:'vTFMADETCATCOD_TO',pic:'ZZZ9'},{av:'AV113TFMADetCatDsc',fld:'vTFMADETCATDSC',pic:''},{av:'AV114TFMADetCatDsc_Sel',fld:'vTFMADETCATDSC_SEL',pic:''},{av:'AV116TFMADetHdr',fld:'vTFMADETHDR',pic:''},{av:'AV117TFMADetHdr_Sel',fld:'vTFMADETHDR_SEL',pic:''},{av:'AV64TFMADetKilProd',fld:'vTFMADETKILPROD',pic:'ZZZZZZZZ9.99'},{av:'AV65TFMADetKilProd_To',fld:'vTFMADETKILPROD_TO',pic:'ZZZZZZZZ9.99'},{av:'AV66TFMADetKilReo',fld:'vTFMADETKILREO',pic:'ZZZZZZZZ9.99'},{av:'AV67TFMADetKilReo_To',fld:'vTFMADETKILREO_TO',pic:'ZZZZZZZZ9.99'},{av:'AV93TFMADetKilTot',fld:'vTFMADETKILTOT',pic:'ZZZZZZZZ9.99'},{av:'AV94TFMADetKilTot_To',fld:'vTFMADETKILTOT_TO',pic:'ZZZZZZZZ9.99'},{av:'AV122TFMADetMetProd',fld:'vTFMADETMETPROD',pic:'ZZZZZZZZ9.99'},{av:'AV123TFMADetMetProd_To',fld:'vTFMADETMETPROD_TO',pic:'ZZZZZZZZ9.99'},{av:'AV124TFMADetMetReo',fld:'vTFMADETMETREO',pic:'ZZZZZZZZ9.99'},{av:'AV125TFMADetMetReo_To',fld:'vTFMADETMETREO_TO',pic:'ZZZZZZZZ9.99'},{av:'AV126TFMADetMetTot',fld:'vTFMADETMETTOT',pic:'ZZZZZZZZ9.99'},{av:'AV127TFMADetMetTot_To',fld:'vTFMADETMETTOT_TO',pic:'ZZZZZZZZ9.99'},{av:'AV132Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV74TipMaqCodJSON',fld:'vTIPMAQCODJSON',pic:''},{av:'AV75FechaInicio',fld:'vFECHAINICIO',pic:''},{av:'AV76FechaFin',fld:'vFECHAFIN',pic:''},{av:'AV105MTknUsu',fld:'vMTKNUSU',pic:''},{av:'AV106MTkn',fld:'vMTKN',pic:''},{av:'AV87TotMADetKilProd',fld:'vTOTMADETKILPROD',pic:'ZZZZZZZZ9.99',hsh:true},{av:'AV89TotMADetKilReo',fld:'vTOTMADETKILREO',pic:'ZZZZZZZZ9.99',hsh:true},{av:'AV120TotMADetKilTot',fld:'vTOTMADETKILTOT',pic:'ZZZZZZZZ9.99',hsh:true},{av:'AV128TotMADetMetReo',fld:'vTOTMADETMETREO',pic:'ZZZZZZZZ9.99',hsh:true},{av:'sPrefix'},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'},{av:'Ddo_grid_Selectedvalue_get',ctrl:'DDO_GRID',prop:'SelectedValue_get'},{av:'Ddo_grid_Filteredtextto_get',ctrl:'DDO_GRID',prop:'FilteredTextTo_get'},{av:'Ddo_grid_Filteredtext_get',ctrl:'DDO_GRID',prop:'FilteredText_get'},{av:'Ddo_grid_Selectedcolumn',ctrl:'DDO_GRID',prop:'SelectedColumn'}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV126TFMADetMetTot',fld:'vTFMADETMETTOT',pic:'ZZZZZZZZ9.99'},{av:'AV127TFMADetMetTot_To',fld:'vTFMADETMETTOT_TO',pic:'ZZZZZZZZ9.99'},{av:'AV124TFMADetMetReo',fld:'vTFMADETMETREO',pic:'ZZZZZZZZ9.99'},{av:'AV125TFMADetMetReo_To',fld:'vTFMADETMETREO_TO',pic:'ZZZZZZZZ9.99'},{av:'AV122TFMADetMetProd',fld:'vTFMADETMETPROD',pic:'ZZZZZZZZ9.99'},{av:'AV123TFMADetMetProd_To',fld:'vTFMADETMETPROD_TO',pic:'ZZZZZZZZ9.99'},{av:'AV93TFMADetKilTot',fld:'vTFMADETKILTOT',pic:'ZZZZZZZZ9.99'},{av:'AV94TFMADetKilTot_To',fld:'vTFMADETKILTOT_TO',pic:'ZZZZZZZZ9.99'},{av:'AV66TFMADetKilReo',fld:'vTFMADETKILREO',pic:'ZZZZZZZZ9.99'},{av:'AV67TFMADetKilReo_To',fld:'vTFMADETKILREO_TO',pic:'ZZZZZZZZ9.99'},{av:'AV64TFMADetKilProd',fld:'vTFMADETKILPROD',pic:'ZZZZZZZZ9.99'},{av:'AV65TFMADetKilProd_To',fld:'vTFMADETKILPROD_TO',pic:'ZZZZZZZZ9.99'},{av:'AV116TFMADetHdr',fld:'vTFMADETHDR',pic:''},{av:'AV117TFMADetHdr_Sel',fld:'vTFMADETHDR_SEL',pic:''},{av:'AV113TFMADetCatDsc',fld:'vTFMADETCATDSC',pic:''},{av:'AV114TFMADetCatDsc_Sel',fld:'vTFMADETCATDSC_SEL',pic:''},{av:'AV111TFMADetCatCod',fld:'vTFMADETCATCOD',pic:'ZZZ9'},{av:'AV112TFMADetCatCod_To',fld:'vTFMADETCATCOD_TO',pic:'ZZZ9'},{av:'AV109TFMADetDefDsc',fld:'vTFMADETDEFDSC',pic:''},{av:'AV110TFMADetDefDsc_Sel',fld:'vTFMADETDEFDSC_SEL',pic:''},{av:'AV107TFMADetDefCod',fld:'vTFMADETDEFCOD',pic:'ZZZ9'},{av:'AV108TFMADetDefCod_To',fld:'vTFMADETDEFCOD_TO',pic:'ZZZ9'},{av:'AV62TFMADetTipMDsc',fld:'vTFMADETTIPMDSC',pic:''},{av:'AV63TFMADetTipMDsc_Sel',fld:'vTFMADETTIPMDSC_SEL',pic:''},{av:'AV60TFMADetTipMCod',fld:'vTFMADETTIPMCOD',pic:''},{av:'AV61TFMADetTipMCod_Sel',fld:'vTFMADETTIPMCOD_SEL',pic:''},{av:'AV58TFMADetMaqDsc',fld:'vTFMADETMAQDSC',pic:''},{av:'AV59TFMADetMaqDsc_Sel',fld:'vTFMADETMAQDSC_SEL',pic:''},{av:'AV56TFMADetMaqCod',fld:'vTFMADETMAQCOD',pic:''},{av:'AV57TFMADetMaqCod_Sel',fld:'vTFMADETMAQCOD_SEL',pic:''},{av:'AV82TFMADetIntDsc',fld:'vTFMADETINTDSC',pic:''},{av:'AV83TFMADetIntDsc_Sel',fld:'vTFMADETINTDSC_SEL',pic:''},{av:'AV52TFMADetIntCod',fld:'vTFMADETINTCOD',pic:'Z9'},{av:'AV53TFMADetIntCod_To',fld:'vTFMADETINTCOD_TO',pic:'Z9'},{av:'AV80TFMADetMatDsc',fld:'vTFMADETMATDSC',pic:''},{av:'AV81TFMADetMatDsc_Sel',fld:'vTFMADETMATDSC_SEL',pic:''},{av:'AV48TFMADetMatCod',fld:'vTFMADETMATCOD',pic:'ZZ9'},{av:'AV49TFMADetMatCod_To',fld:'vTFMADETMATCOD_TO',pic:'ZZ9'},{av:'AV46TFMADetColCod',fld:'vTFMADETCOLCOD',pic:'Z9'},{av:'AV47TFMADetColCod_To',fld:'vTFMADETCOLCOD_TO',pic:'Z9'},{av:'AV42TFMADetColNom',fld:'vTFMADETCOLNOM',pic:''},{av:'AV43TFMADetColNom_Sel',fld:'vTFMADETCOLNOM_SEL',pic:''},{av:'AV44TFMADetColNum',fld:'vTFMADETCOLNUM',pic:'ZZZZZ9'},{av:'AV45TFMADetColNum_To',fld:'vTFMADETCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV77TFMADetArtDsc',fld:'vTFMADETARTDSC',pic:''},{av:'AV78TFMADetArtDsc_Sel',fld:'vTFMADETARTDSC_SEL',pic:''},{av:'AV38TFMADetArtCod',fld:'vTFMADETARTCOD',pic:''},{av:'AV39TFMADetArtCod_Sel',fld:'vTFMADETARTCOD_SEL',pic:''},{av:'AV36TFMADetCliNom',fld:'vTFMADETCLINOM',pic:''},{av:'AV37TFMADetCliNom_Sel',fld:'vTFMADETCLINOM_SEL',pic:''},{av:'AV34TFMADetCliCod',fld:'vTFMADETCLICOD',pic:'ZZZZZ9'},{av:'AV35TFMADetCliCod_To',fld:'vTFMADETCLICOD_TO',pic:'ZZZZZ9'},{av:'AV32TFMADetEmprCod',fld:'vTFMADETEMPRCOD',pic:''},{av:'AV33TFMADetEmprCod_Sel',fld:'vTFMADETEMPRCOD_SEL',pic:''},{av:'AV28TFMADetFec',fld:'vTFMADETFEC',pic:''},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e182DR2',iparms:[]");
      setEventMetadata("GRID.LOAD",",oparms:[]}");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED","{handler:'e132DR2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV70MADetEmprCod',fld:'vMADETEMPRCOD',pic:''},{av:'AV71CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV72ArtCod',fld:'vARTCOD',pic:''},{av:'AV73ForColNum',fld:'vFORCOLNUM',pic:'ZZZZZ9'},{av:'AV115MADetMaqCod',fld:'vMADETMAQCOD',pic:''},{av:'AV103MADetDefCod',fld:'vMADETDEFCOD',pic:'ZZZ9'},{av:'AV104MADetCatCod',fld:'vMADETCATCOD',pic:'ZZZ9'},{av:'AV79TipMaqCodCollection',fld:'vTIPMAQCODCOLLECTION',pic:'',hsh:true},{av:'AV91sdtMTok',fld:'vSDTMTOK',pic:'',hsh:true},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV28TFMADetFec',fld:'vTFMADETFEC',pic:''},{av:'AV32TFMADetEmprCod',fld:'vTFMADETEMPRCOD',pic:''},{av:'AV33TFMADetEmprCod_Sel',fld:'vTFMADETEMPRCOD_SEL',pic:''},{av:'AV34TFMADetCliCod',fld:'vTFMADETCLICOD',pic:'ZZZZZ9'},{av:'AV35TFMADetCliCod_To',fld:'vTFMADETCLICOD_TO',pic:'ZZZZZ9'},{av:'AV36TFMADetCliNom',fld:'vTFMADETCLINOM',pic:''},{av:'AV37TFMADetCliNom_Sel',fld:'vTFMADETCLINOM_SEL',pic:''},{av:'AV38TFMADetArtCod',fld:'vTFMADETARTCOD',pic:''},{av:'AV39TFMADetArtCod_Sel',fld:'vTFMADETARTCOD_SEL',pic:''},{av:'AV77TFMADetArtDsc',fld:'vTFMADETARTDSC',pic:''},{av:'AV78TFMADetArtDsc_Sel',fld:'vTFMADETARTDSC_SEL',pic:''},{av:'AV44TFMADetColNum',fld:'vTFMADETCOLNUM',pic:'ZZZZZ9'},{av:'AV45TFMADetColNum_To',fld:'vTFMADETCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV42TFMADetColNom',fld:'vTFMADETCOLNOM',pic:''},{av:'AV43TFMADetColNom_Sel',fld:'vTFMADETCOLNOM_SEL',pic:''},{av:'AV46TFMADetColCod',fld:'vTFMADETCOLCOD',pic:'Z9'},{av:'AV47TFMADetColCod_To',fld:'vTFMADETCOLCOD_TO',pic:'Z9'},{av:'AV48TFMADetMatCod',fld:'vTFMADETMATCOD',pic:'ZZ9'},{av:'AV49TFMADetMatCod_To',fld:'vTFMADETMATCOD_TO',pic:'ZZ9'},{av:'AV80TFMADetMatDsc',fld:'vTFMADETMATDSC',pic:''},{av:'AV81TFMADetMatDsc_Sel',fld:'vTFMADETMATDSC_SEL',pic:''},{av:'AV52TFMADetIntCod',fld:'vTFMADETINTCOD',pic:'Z9'},{av:'AV53TFMADetIntCod_To',fld:'vTFMADETINTCOD_TO',pic:'Z9'},{av:'AV82TFMADetIntDsc',fld:'vTFMADETINTDSC',pic:''},{av:'AV83TFMADetIntDsc_Sel',fld:'vTFMADETINTDSC_SEL',pic:''},{av:'AV56TFMADetMaqCod',fld:'vTFMADETMAQCOD',pic:''},{av:'AV57TFMADetMaqCod_Sel',fld:'vTFMADETMAQCOD_SEL',pic:''},{av:'AV58TFMADetMaqDsc',fld:'vTFMADETMAQDSC',pic:''},{av:'AV59TFMADetMaqDsc_Sel',fld:'vTFMADETMAQDSC_SEL',pic:''},{av:'AV60TFMADetTipMCod',fld:'vTFMADETTIPMCOD',pic:''},{av:'AV61TFMADetTipMCod_Sel',fld:'vTFMADETTIPMCOD_SEL',pic:''},{av:'AV62TFMADetTipMDsc',fld:'vTFMADETTIPMDSC',pic:''},{av:'AV63TFMADetTipMDsc_Sel',fld:'vTFMADETTIPMDSC_SEL',pic:''},{av:'AV107TFMADetDefCod',fld:'vTFMADETDEFCOD',pic:'ZZZ9'},{av:'AV108TFMADetDefCod_To',fld:'vTFMADETDEFCOD_TO',pic:'ZZZ9'},{av:'AV109TFMADetDefDsc',fld:'vTFMADETDEFDSC',pic:''},{av:'AV110TFMADetDefDsc_Sel',fld:'vTFMADETDEFDSC_SEL',pic:''},{av:'AV111TFMADetCatCod',fld:'vTFMADETCATCOD',pic:'ZZZ9'},{av:'AV112TFMADetCatCod_To',fld:'vTFMADETCATCOD_TO',pic:'ZZZ9'},{av:'AV113TFMADetCatDsc',fld:'vTFMADETCATDSC',pic:''},{av:'AV114TFMADetCatDsc_Sel',fld:'vTFMADETCATDSC_SEL',pic:''},{av:'AV116TFMADetHdr',fld:'vTFMADETHDR',pic:''},{av:'AV117TFMADetHdr_Sel',fld:'vTFMADETHDR_SEL',pic:''},{av:'AV64TFMADetKilProd',fld:'vTFMADETKILPROD',pic:'ZZZZZZZZ9.99'},{av:'AV65TFMADetKilProd_To',fld:'vTFMADETKILPROD_TO',pic:'ZZZZZZZZ9.99'},{av:'AV66TFMADetKilReo',fld:'vTFMADETKILREO',pic:'ZZZZZZZZ9.99'},{av:'AV67TFMADetKilReo_To',fld:'vTFMADETKILREO_TO',pic:'ZZZZZZZZ9.99'},{av:'AV93TFMADetKilTot',fld:'vTFMADETKILTOT',pic:'ZZZZZZZZ9.99'},{av:'AV94TFMADetKilTot_To',fld:'vTFMADETKILTOT_TO',pic:'ZZZZZZZZ9.99'},{av:'AV122TFMADetMetProd',fld:'vTFMADETMETPROD',pic:'ZZZZZZZZ9.99'},{av:'AV123TFMADetMetProd_To',fld:'vTFMADETMETPROD_TO',pic:'ZZZZZZZZ9.99'},{av:'AV124TFMADetMetReo',fld:'vTFMADETMETREO',pic:'ZZZZZZZZ9.99'},{av:'AV125TFMADetMetReo_To',fld:'vTFMADETMETREO_TO',pic:'ZZZZZZZZ9.99'},{av:'AV126TFMADetMetTot',fld:'vTFMADETMETTOT',pic:'ZZZZZZZZ9.99'},{av:'AV127TFMADetMetTot_To',fld:'vTFMADETMETTOT_TO',pic:'ZZZZZZZZ9.99'},{av:'AV132Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV74TipMaqCodJSON',fld:'vTIPMAQCODJSON',pic:''},{av:'AV75FechaInicio',fld:'vFECHAINICIO',pic:''},{av:'AV76FechaFin',fld:'vFECHAFIN',pic:''},{av:'AV105MTknUsu',fld:'vMTKNUSU',pic:''},{av:'AV106MTkn',fld:'vMTKN',pic:''},{av:'AV87TotMADetKilProd',fld:'vTOTMADETKILPROD',pic:'ZZZZZZZZ9.99',hsh:true},{av:'AV89TotMADetKilReo',fld:'vTOTMADETKILREO',pic:'ZZZZZZZZ9.99',hsh:true},{av:'AV120TotMADetKilTot',fld:'vTOTMADETKILTOT',pic:'ZZZZZZZZ9.99',hsh:true},{av:'AV128TotMADetMetReo',fld:'vTOTMADETMETREO',pic:'ZZZZZZZZ9.99',hsh:true},{av:'sPrefix'},{av:'Ddo_gridcolumnsselector_Columnsselectorvalues',ctrl:'DDO_GRIDCOLUMNSSELECTOR',prop:'ColumnsSelectorValues'},{av:'A14584MADetUsu',fld:'MADETUSU',pic:''},{av:'A14583MADetTkn',fld:'MADETTKN',pic:''},{av:'A14587MADetEmprC',fld:'MADETEMPRC',pic:''},{av:'A14585MADetCliCo',fld:'MADETCLICO',pic:'ZZZZZ9'},{av:'A14588MADetArtCo',fld:'MADETARTCO',pic:''},{av:'A14589MADetColNu',fld:'MADETCOLNU',pic:'ZZZZZ9'},{av:'A14591MADetMaqCo',fld:'MADETMAQCO',pic:''},{av:'A14590MADetTipMC',fld:'MADETTIPMC',pic:''},{av:'A14662MADetDefCo',fld:'MADETDEFCO',pic:'ZZZ9'},{av:'A14664MADetCatCo',fld:'MADETCATCO',pic:'ZZZ9'},{av:'A14658MADetKilPr',fld:'MADETKILPR',pic:'ZZZZZZZZ9.99'},{av:'A14659MADetKilRe',fld:'MADETKILRE',pic:'ZZZZZZZZ9.99'},{av:'A14661MADetKilTo',fld:'MADETKILTO',pic:'ZZZZZZZZ9.99'},{av:'A14671MADetMetRe',fld:'MADETMETRE',pic:'ZZZZZZZZ9.99'}]");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED",",oparms:[{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'edtMADetFec_Visible',ctrl:'MADETFEC',prop:'Visible'},{av:'edtMADetEmprC_Visible',ctrl:'MADETEMPRC',prop:'Visible'},{av:'edtMADetCliCo_Visible',ctrl:'MADETCLICO',prop:'Visible'},{av:'edtMADetCliNo_Visible',ctrl:'MADETCLINO',prop:'Visible'},{av:'edtMADetArtCo_Visible',ctrl:'MADETARTCO',prop:'Visible'},{av:'edtMADetArtDs_Visible',ctrl:'MADETARTDS',prop:'Visible'},{av:'edtMADetColNu_Visible',ctrl:'MADETCOLNU',prop:'Visible'},{av:'edtMADetColNo_Visible',ctrl:'MADETCOLNO',prop:'Visible'},{av:'edtMADetColCo_Visible',ctrl:'MADETCOLCO',prop:'Visible'},{av:'edtMADetMatCo_Visible',ctrl:'MADETMATCO',prop:'Visible'},{av:'edtMADetMatDs_Visible',ctrl:'MADETMATDS',prop:'Visible'},{av:'edtMADetIntCo_Visible',ctrl:'MADETINTCO',prop:'Visible'},{av:'edtMADetIntDs_Visible',ctrl:'MADETINTDS',prop:'Visible'},{av:'edtMADetMaqCo_Visible',ctrl:'MADETMAQCO',prop:'Visible'},{av:'edtMADetMaqDs_Visible',ctrl:'MADETMAQDS',prop:'Visible'},{av:'edtMADetTipMC_Visible',ctrl:'MADETTIPMC',prop:'Visible'},{av:'edtMADetTipMD_Visible',ctrl:'MADETTIPMD',prop:'Visible'},{av:'edtMADetDefCo_Visible',ctrl:'MADETDEFCO',prop:'Visible'},{av:'edtMADetDefDs_Visible',ctrl:'MADETDEFDS',prop:'Visible'},{av:'edtMADetCatCo_Visible',ctrl:'MADETCATCO',prop:'Visible'},{av:'edtMADetCatDs_Visible',ctrl:'MADETCATDS',prop:'Visible'},{av:'edtMADetHdr_Visible',ctrl:'MADETHDR',prop:'Visible'},{av:'edtMADetKilPr_Visible',ctrl:'MADETKILPR',prop:'Visible'},{av:'edtMADetKilRe_Visible',ctrl:'MADETKILRE',prop:'Visible'},{av:'edtMADetKilTo_Visible',ctrl:'MADETKILTO',prop:'Visible'},{av:'edtMADetMetPr_Visible',ctrl:'MADETMETPR',prop:'Visible'},{av:'edtMADetMetRe_Visible',ctrl:'MADETMETRE',prop:'Visible'},{av:'edtMADetMetTo_Visible',ctrl:'MADETMETTO',prop:'Visible'},{av:'AV23ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV87TotMADetKilProd',fld:'vTOTMADETKILPROD',pic:'ZZZZZZZZ9.99',hsh:true},{av:'AV89TotMADetKilReo',fld:'vTOTMADETKILREO',pic:'ZZZZZZZZ9.99',hsh:true},{av:'AV120TotMADetKilTot',fld:'vTOTMADETKILTOT',pic:'ZZZZZZZZ9.99',hsh:true},{av:'AV128TotMADetMetReo',fld:'vTOTMADETMETREO',pic:'ZZZZZZZZ9.99',hsh:true},{av:'AV86TotValueMADetFec',fld:'vTOTVALUEMADETFEC',pic:''},{av:'AV88TotValueMADetKilProd',fld:'vTOTVALUEMADETKILPROD',pic:''},{av:'AV90TotValueMADetKilReo',fld:'vTOTVALUEMADETKILREO',pic:''},{av:'AV121TotValueMADetKilTot',fld:'vTOTVALUEMADETKILTOT',pic:''},{av:'AV129TotValueMADetMetReo',fld:'vTOTVALUEMADETMETREO',pic:''}]}");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED","{handler:'e112DR2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV70MADetEmprCod',fld:'vMADETEMPRCOD',pic:''},{av:'AV71CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV72ArtCod',fld:'vARTCOD',pic:''},{av:'AV73ForColNum',fld:'vFORCOLNUM',pic:'ZZZZZ9'},{av:'AV115MADetMaqCod',fld:'vMADETMAQCOD',pic:''},{av:'AV103MADetDefCod',fld:'vMADETDEFCOD',pic:'ZZZ9'},{av:'AV104MADetCatCod',fld:'vMADETCATCOD',pic:'ZZZ9'},{av:'AV79TipMaqCodCollection',fld:'vTIPMAQCODCOLLECTION',pic:'',hsh:true},{av:'AV91sdtMTok',fld:'vSDTMTOK',pic:'',hsh:true},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV28TFMADetFec',fld:'vTFMADETFEC',pic:''},{av:'AV32TFMADetEmprCod',fld:'vTFMADETEMPRCOD',pic:''},{av:'AV33TFMADetEmprCod_Sel',fld:'vTFMADETEMPRCOD_SEL',pic:''},{av:'AV34TFMADetCliCod',fld:'vTFMADETCLICOD',pic:'ZZZZZ9'},{av:'AV35TFMADetCliCod_To',fld:'vTFMADETCLICOD_TO',pic:'ZZZZZ9'},{av:'AV36TFMADetCliNom',fld:'vTFMADETCLINOM',pic:''},{av:'AV37TFMADetCliNom_Sel',fld:'vTFMADETCLINOM_SEL',pic:''},{av:'AV38TFMADetArtCod',fld:'vTFMADETARTCOD',pic:''},{av:'AV39TFMADetArtCod_Sel',fld:'vTFMADETARTCOD_SEL',pic:''},{av:'AV77TFMADetArtDsc',fld:'vTFMADETARTDSC',pic:''},{av:'AV78TFMADetArtDsc_Sel',fld:'vTFMADETARTDSC_SEL',pic:''},{av:'AV44TFMADetColNum',fld:'vTFMADETCOLNUM',pic:'ZZZZZ9'},{av:'AV45TFMADetColNum_To',fld:'vTFMADETCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV42TFMADetColNom',fld:'vTFMADETCOLNOM',pic:''},{av:'AV43TFMADetColNom_Sel',fld:'vTFMADETCOLNOM_SEL',pic:''},{av:'AV46TFMADetColCod',fld:'vTFMADETCOLCOD',pic:'Z9'},{av:'AV47TFMADetColCod_To',fld:'vTFMADETCOLCOD_TO',pic:'Z9'},{av:'AV48TFMADetMatCod',fld:'vTFMADETMATCOD',pic:'ZZ9'},{av:'AV49TFMADetMatCod_To',fld:'vTFMADETMATCOD_TO',pic:'ZZ9'},{av:'AV80TFMADetMatDsc',fld:'vTFMADETMATDSC',pic:''},{av:'AV81TFMADetMatDsc_Sel',fld:'vTFMADETMATDSC_SEL',pic:''},{av:'AV52TFMADetIntCod',fld:'vTFMADETINTCOD',pic:'Z9'},{av:'AV53TFMADetIntCod_To',fld:'vTFMADETINTCOD_TO',pic:'Z9'},{av:'AV82TFMADetIntDsc',fld:'vTFMADETINTDSC',pic:''},{av:'AV83TFMADetIntDsc_Sel',fld:'vTFMADETINTDSC_SEL',pic:''},{av:'AV56TFMADetMaqCod',fld:'vTFMADETMAQCOD',pic:''},{av:'AV57TFMADetMaqCod_Sel',fld:'vTFMADETMAQCOD_SEL',pic:''},{av:'AV58TFMADetMaqDsc',fld:'vTFMADETMAQDSC',pic:''},{av:'AV59TFMADetMaqDsc_Sel',fld:'vTFMADETMAQDSC_SEL',pic:''},{av:'AV60TFMADetTipMCod',fld:'vTFMADETTIPMCOD',pic:''},{av:'AV61TFMADetTipMCod_Sel',fld:'vTFMADETTIPMCOD_SEL',pic:''},{av:'AV62TFMADetTipMDsc',fld:'vTFMADETTIPMDSC',pic:''},{av:'AV63TFMADetTipMDsc_Sel',fld:'vTFMADETTIPMDSC_SEL',pic:''},{av:'AV107TFMADetDefCod',fld:'vTFMADETDEFCOD',pic:'ZZZ9'},{av:'AV108TFMADetDefCod_To',fld:'vTFMADETDEFCOD_TO',pic:'ZZZ9'},{av:'AV109TFMADetDefDsc',fld:'vTFMADETDEFDSC',pic:''},{av:'AV110TFMADetDefDsc_Sel',fld:'vTFMADETDEFDSC_SEL',pic:''},{av:'AV111TFMADetCatCod',fld:'vTFMADETCATCOD',pic:'ZZZ9'},{av:'AV112TFMADetCatCod_To',fld:'vTFMADETCATCOD_TO',pic:'ZZZ9'},{av:'AV113TFMADetCatDsc',fld:'vTFMADETCATDSC',pic:''},{av:'AV114TFMADetCatDsc_Sel',fld:'vTFMADETCATDSC_SEL',pic:''},{av:'AV116TFMADetHdr',fld:'vTFMADETHDR',pic:''},{av:'AV117TFMADetHdr_Sel',fld:'vTFMADETHDR_SEL',pic:''},{av:'AV64TFMADetKilProd',fld:'vTFMADETKILPROD',pic:'ZZZZZZZZ9.99'},{av:'AV65TFMADetKilProd_To',fld:'vTFMADETKILPROD_TO',pic:'ZZZZZZZZ9.99'},{av:'AV66TFMADetKilReo',fld:'vTFMADETKILREO',pic:'ZZZZZZZZ9.99'},{av:'AV67TFMADetKilReo_To',fld:'vTFMADETKILREO_TO',pic:'ZZZZZZZZ9.99'},{av:'AV93TFMADetKilTot',fld:'vTFMADETKILTOT',pic:'ZZZZZZZZ9.99'},{av:'AV94TFMADetKilTot_To',fld:'vTFMADETKILTOT_TO',pic:'ZZZZZZZZ9.99'},{av:'AV122TFMADetMetProd',fld:'vTFMADETMETPROD',pic:'ZZZZZZZZ9.99'},{av:'AV123TFMADetMetProd_To',fld:'vTFMADETMETPROD_TO',pic:'ZZZZZZZZ9.99'},{av:'AV124TFMADetMetReo',fld:'vTFMADETMETREO',pic:'ZZZZZZZZ9.99'},{av:'AV125TFMADetMetReo_To',fld:'vTFMADETMETREO_TO',pic:'ZZZZZZZZ9.99'},{av:'AV126TFMADetMetTot',fld:'vTFMADETMETTOT',pic:'ZZZZZZZZ9.99'},{av:'AV127TFMADetMetTot_To',fld:'vTFMADETMETTOT_TO',pic:'ZZZZZZZZ9.99'},{av:'AV132Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV74TipMaqCodJSON',fld:'vTIPMAQCODJSON',pic:''},{av:'AV75FechaInicio',fld:'vFECHAINICIO',pic:''},{av:'AV76FechaFin',fld:'vFECHAFIN',pic:''},{av:'AV105MTknUsu',fld:'vMTKNUSU',pic:''},{av:'AV106MTkn',fld:'vMTKN',pic:''},{av:'AV87TotMADetKilProd',fld:'vTOTMADETKILPROD',pic:'ZZZZZZZZ9.99',hsh:true},{av:'AV89TotMADetKilReo',fld:'vTOTMADETKILREO',pic:'ZZZZZZZZ9.99',hsh:true},{av:'AV120TotMADetKilTot',fld:'vTOTMADETKILTOT',pic:'ZZZZZZZZ9.99',hsh:true},{av:'AV128TotMADetMetReo',fld:'vTOTMADETMETREO',pic:'ZZZZZZZZ9.99',hsh:true},{av:'sPrefix'},{av:'Ddo_managefilters_Activeeventkey',ctrl:'DDO_MANAGEFILTERS',prop:'ActiveEventKey'},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'A14584MADetUsu',fld:'MADETUSU',pic:''},{av:'A14583MADetTkn',fld:'MADETTKN',pic:''},{av:'A14587MADetEmprC',fld:'MADETEMPRC',pic:''},{av:'A14585MADetCliCo',fld:'MADETCLICO',pic:'ZZZZZ9'},{av:'A14588MADetArtCo',fld:'MADETARTCO',pic:''},{av:'A14589MADetColNu',fld:'MADETCOLNU',pic:'ZZZZZ9'},{av:'A14591MADetMaqCo',fld:'MADETMAQCO',pic:''},{av:'A14590MADetTipMC',fld:'MADETTIPMC',pic:''},{av:'A14662MADetDefCo',fld:'MADETDEFCO',pic:'ZZZ9'},{av:'A14664MADetCatCo',fld:'MADETCATCO',pic:'ZZZ9'},{av:'A14658MADetKilPr',fld:'MADETKILPR',pic:'ZZZZZZZZ9.99'},{av:'A14659MADetKilRe',fld:'MADETKILRE',pic:'ZZZZZZZZ9.99'},{av:'A14661MADetKilTo',fld:'MADETKILTO',pic:'ZZZZZZZZ9.99'},{av:'A14671MADetMetRe',fld:'MADETMETRE',pic:'ZZZZZZZZ9.99'}]");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED",",oparms:[{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV28TFMADetFec',fld:'vTFMADETFEC',pic:''},{av:'AV32TFMADetEmprCod',fld:'vTFMADETEMPRCOD',pic:''},{av:'AV33TFMADetEmprCod_Sel',fld:'vTFMADETEMPRCOD_SEL',pic:''},{av:'AV34TFMADetCliCod',fld:'vTFMADETCLICOD',pic:'ZZZZZ9'},{av:'AV35TFMADetCliCod_To',fld:'vTFMADETCLICOD_TO',pic:'ZZZZZ9'},{av:'AV36TFMADetCliNom',fld:'vTFMADETCLINOM',pic:''},{av:'AV37TFMADetCliNom_Sel',fld:'vTFMADETCLINOM_SEL',pic:''},{av:'AV38TFMADetArtCod',fld:'vTFMADETARTCOD',pic:''},{av:'AV39TFMADetArtCod_Sel',fld:'vTFMADETARTCOD_SEL',pic:''},{av:'AV77TFMADetArtDsc',fld:'vTFMADETARTDSC',pic:''},{av:'AV78TFMADetArtDsc_Sel',fld:'vTFMADETARTDSC_SEL',pic:''},{av:'AV44TFMADetColNum',fld:'vTFMADETCOLNUM',pic:'ZZZZZ9'},{av:'AV45TFMADetColNum_To',fld:'vTFMADETCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV42TFMADetColNom',fld:'vTFMADETCOLNOM',pic:''},{av:'AV43TFMADetColNom_Sel',fld:'vTFMADETCOLNOM_SEL',pic:''},{av:'AV46TFMADetColCod',fld:'vTFMADETCOLCOD',pic:'Z9'},{av:'AV47TFMADetColCod_To',fld:'vTFMADETCOLCOD_TO',pic:'Z9'},{av:'AV48TFMADetMatCod',fld:'vTFMADETMATCOD',pic:'ZZ9'},{av:'AV49TFMADetMatCod_To',fld:'vTFMADETMATCOD_TO',pic:'ZZ9'},{av:'AV80TFMADetMatDsc',fld:'vTFMADETMATDSC',pic:''},{av:'AV81TFMADetMatDsc_Sel',fld:'vTFMADETMATDSC_SEL',pic:''},{av:'AV52TFMADetIntCod',fld:'vTFMADETINTCOD',pic:'Z9'},{av:'AV53TFMADetIntCod_To',fld:'vTFMADETINTCOD_TO',pic:'Z9'},{av:'AV82TFMADetIntDsc',fld:'vTFMADETINTDSC',pic:''},{av:'AV83TFMADetIntDsc_Sel',fld:'vTFMADETINTDSC_SEL',pic:''},{av:'AV56TFMADetMaqCod',fld:'vTFMADETMAQCOD',pic:''},{av:'AV57TFMADetMaqCod_Sel',fld:'vTFMADETMAQCOD_SEL',pic:''},{av:'AV58TFMADetMaqDsc',fld:'vTFMADETMAQDSC',pic:''},{av:'AV59TFMADetMaqDsc_Sel',fld:'vTFMADETMAQDSC_SEL',pic:''},{av:'AV60TFMADetTipMCod',fld:'vTFMADETTIPMCOD',pic:''},{av:'AV61TFMADetTipMCod_Sel',fld:'vTFMADETTIPMCOD_SEL',pic:''},{av:'AV62TFMADetTipMDsc',fld:'vTFMADETTIPMDSC',pic:''},{av:'AV63TFMADetTipMDsc_Sel',fld:'vTFMADETTIPMDSC_SEL',pic:''},{av:'AV107TFMADetDefCod',fld:'vTFMADETDEFCOD',pic:'ZZZ9'},{av:'AV108TFMADetDefCod_To',fld:'vTFMADETDEFCOD_TO',pic:'ZZZ9'},{av:'AV109TFMADetDefDsc',fld:'vTFMADETDEFDSC',pic:''},{av:'AV110TFMADetDefDsc_Sel',fld:'vTFMADETDEFDSC_SEL',pic:''},{av:'AV111TFMADetCatCod',fld:'vTFMADETCATCOD',pic:'ZZZ9'},{av:'AV112TFMADetCatCod_To',fld:'vTFMADETCATCOD_TO',pic:'ZZZ9'},{av:'AV113TFMADetCatDsc',fld:'vTFMADETCATDSC',pic:''},{av:'AV114TFMADetCatDsc_Sel',fld:'vTFMADETCATDSC_SEL',pic:''},{av:'AV116TFMADetHdr',fld:'vTFMADETHDR',pic:''},{av:'AV117TFMADetHdr_Sel',fld:'vTFMADETHDR_SEL',pic:''},{av:'AV64TFMADetKilProd',fld:'vTFMADETKILPROD',pic:'ZZZZZZZZ9.99'},{av:'AV65TFMADetKilProd_To',fld:'vTFMADETKILPROD_TO',pic:'ZZZZZZZZ9.99'},{av:'AV66TFMADetKilReo',fld:'vTFMADETKILREO',pic:'ZZZZZZZZ9.99'},{av:'AV67TFMADetKilReo_To',fld:'vTFMADETKILREO_TO',pic:'ZZZZZZZZ9.99'},{av:'AV93TFMADetKilTot',fld:'vTFMADETKILTOT',pic:'ZZZZZZZZ9.99'},{av:'AV94TFMADetKilTot_To',fld:'vTFMADETKILTOT_TO',pic:'ZZZZZZZZ9.99'},{av:'AV122TFMADetMetProd',fld:'vTFMADETMETPROD',pic:'ZZZZZZZZ9.99'},{av:'AV123TFMADetMetProd_To',fld:'vTFMADETMETPROD_TO',pic:'ZZZZZZZZ9.99'},{av:'AV124TFMADetMetReo',fld:'vTFMADETMETREO',pic:'ZZZZZZZZ9.99'},{av:'AV125TFMADetMetReo_To',fld:'vTFMADETMETREO_TO',pic:'ZZZZZZZZ9.99'},{av:'AV126TFMADetMetTot',fld:'vTFMADETMETTOT',pic:'ZZZZZZZZ9.99'},{av:'AV127TFMADetMetTot_To',fld:'vTFMADETMETTOT_TO',pic:'ZZZZZZZZ9.99'},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtMADetFec_Visible',ctrl:'MADETFEC',prop:'Visible'},{av:'edtMADetEmprC_Visible',ctrl:'MADETEMPRC',prop:'Visible'},{av:'edtMADetCliCo_Visible',ctrl:'MADETCLICO',prop:'Visible'},{av:'edtMADetCliNo_Visible',ctrl:'MADETCLINO',prop:'Visible'},{av:'edtMADetArtCo_Visible',ctrl:'MADETARTCO',prop:'Visible'},{av:'edtMADetArtDs_Visible',ctrl:'MADETARTDS',prop:'Visible'},{av:'edtMADetColNu_Visible',ctrl:'MADETCOLNU',prop:'Visible'},{av:'edtMADetColNo_Visible',ctrl:'MADETCOLNO',prop:'Visible'},{av:'edtMADetColCo_Visible',ctrl:'MADETCOLCO',prop:'Visible'},{av:'edtMADetMatCo_Visible',ctrl:'MADETMATCO',prop:'Visible'},{av:'edtMADetMatDs_Visible',ctrl:'MADETMATDS',prop:'Visible'},{av:'edtMADetIntCo_Visible',ctrl:'MADETINTCO',prop:'Visible'},{av:'edtMADetIntDs_Visible',ctrl:'MADETINTDS',prop:'Visible'},{av:'edtMADetMaqCo_Visible',ctrl:'MADETMAQCO',prop:'Visible'},{av:'edtMADetMaqDs_Visible',ctrl:'MADETMAQDS',prop:'Visible'},{av:'edtMADetTipMC_Visible',ctrl:'MADETTIPMC',prop:'Visible'},{av:'edtMADetTipMD_Visible',ctrl:'MADETTIPMD',prop:'Visible'},{av:'edtMADetDefCo_Visible',ctrl:'MADETDEFCO',prop:'Visible'},{av:'edtMADetDefDs_Visible',ctrl:'MADETDEFDS',prop:'Visible'},{av:'edtMADetCatCo_Visible',ctrl:'MADETCATCO',prop:'Visible'},{av:'edtMADetCatDs_Visible',ctrl:'MADETCATDS',prop:'Visible'},{av:'edtMADetHdr_Visible',ctrl:'MADETHDR',prop:'Visible'},{av:'edtMADetKilPr_Visible',ctrl:'MADETKILPR',prop:'Visible'},{av:'edtMADetKilRe_Visible',ctrl:'MADETKILRE',prop:'Visible'},{av:'edtMADetKilTo_Visible',ctrl:'MADETKILTO',prop:'Visible'},{av:'edtMADetMetPr_Visible',ctrl:'MADETMETPR',prop:'Visible'},{av:'edtMADetMetRe_Visible',ctrl:'MADETMETRE',prop:'Visible'},{av:'edtMADetMetTo_Visible',ctrl:'MADETMETTO',prop:'Visible'},{av:'AV23ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV87TotMADetKilProd',fld:'vTOTMADETKILPROD',pic:'ZZZZZZZZ9.99',hsh:true},{av:'AV89TotMADetKilReo',fld:'vTOTMADETKILREO',pic:'ZZZZZZZZ9.99',hsh:true},{av:'AV120TotMADetKilTot',fld:'vTOTMADETKILTOT',pic:'ZZZZZZZZ9.99',hsh:true},{av:'AV128TotMADetMetReo',fld:'vTOTMADETMETREO',pic:'ZZZZZZZZ9.99',hsh:true},{av:'AV86TotValueMADetFec',fld:'vTOTVALUEMADETFEC',pic:''},{av:'AV88TotValueMADetKilProd',fld:'vTOTVALUEMADETKILPROD',pic:''},{av:'AV90TotValueMADetKilReo',fld:'vTOTVALUEMADETKILREO',pic:''},{av:'AV121TotValueMADetKilTot',fld:'vTOTVALUEMADETKILTOT',pic:''},{av:'AV129TotValueMADetMetReo',fld:'vTOTVALUEMADETMETREO',pic:''}]}");
      setEventMetadata("'DOEXPORT'","{handler:'e142DR2',iparms:[]");
      setEventMetadata("'DOEXPORT'",",oparms:[]}");
      setEventMetadata("GLOBALEVENTS.REFRESHGRID","{handler:'e152DR2',iparms:[{av:'AV100ValorRecibidoVariable',fld:'vVALORRECIBIDOVARIABLE',pic:''},{av:'AV99Variable',fld:'vVARIABLE',pic:''},{av:'AV132Pgmname',fld:'vPGMNAME',pic:''}]");
      setEventMetadata("GLOBALEVENTS.REFRESHGRID",",oparms:[{av:'AV100ValorRecibidoVariable',fld:'vVALORRECIBIDOVARIABLE',pic:''}]}");
      setEventMetadata("GRID_FIRSTPAGE","{handler:'subgrid_firstpage',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'sPrefix'},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV28TFMADetFec',fld:'vTFMADETFEC',pic:''},{av:'AV32TFMADetEmprCod',fld:'vTFMADETEMPRCOD',pic:''},{av:'AV33TFMADetEmprCod_Sel',fld:'vTFMADETEMPRCOD_SEL',pic:''},{av:'AV34TFMADetCliCod',fld:'vTFMADETCLICOD',pic:'ZZZZZ9'},{av:'AV35TFMADetCliCod_To',fld:'vTFMADETCLICOD_TO',pic:'ZZZZZ9'},{av:'AV36TFMADetCliNom',fld:'vTFMADETCLINOM',pic:''},{av:'AV37TFMADetCliNom_Sel',fld:'vTFMADETCLINOM_SEL',pic:''},{av:'AV38TFMADetArtCod',fld:'vTFMADETARTCOD',pic:''},{av:'AV39TFMADetArtCod_Sel',fld:'vTFMADETARTCOD_SEL',pic:''},{av:'AV77TFMADetArtDsc',fld:'vTFMADETARTDSC',pic:''},{av:'AV78TFMADetArtDsc_Sel',fld:'vTFMADETARTDSC_SEL',pic:''},{av:'AV44TFMADetColNum',fld:'vTFMADETCOLNUM',pic:'ZZZZZ9'},{av:'AV45TFMADetColNum_To',fld:'vTFMADETCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV42TFMADetColNom',fld:'vTFMADETCOLNOM',pic:''},{av:'AV43TFMADetColNom_Sel',fld:'vTFMADETCOLNOM_SEL',pic:''},{av:'AV46TFMADetColCod',fld:'vTFMADETCOLCOD',pic:'Z9'},{av:'AV47TFMADetColCod_To',fld:'vTFMADETCOLCOD_TO',pic:'Z9'},{av:'AV48TFMADetMatCod',fld:'vTFMADETMATCOD',pic:'ZZ9'},{av:'AV49TFMADetMatCod_To',fld:'vTFMADETMATCOD_TO',pic:'ZZ9'},{av:'AV80TFMADetMatDsc',fld:'vTFMADETMATDSC',pic:''},{av:'AV81TFMADetMatDsc_Sel',fld:'vTFMADETMATDSC_SEL',pic:''},{av:'AV52TFMADetIntCod',fld:'vTFMADETINTCOD',pic:'Z9'},{av:'AV53TFMADetIntCod_To',fld:'vTFMADETINTCOD_TO',pic:'Z9'},{av:'AV82TFMADetIntDsc',fld:'vTFMADETINTDSC',pic:''},{av:'AV83TFMADetIntDsc_Sel',fld:'vTFMADETINTDSC_SEL',pic:''},{av:'AV56TFMADetMaqCod',fld:'vTFMADETMAQCOD',pic:''},{av:'AV57TFMADetMaqCod_Sel',fld:'vTFMADETMAQCOD_SEL',pic:''},{av:'AV58TFMADetMaqDsc',fld:'vTFMADETMAQDSC',pic:''},{av:'AV59TFMADetMaqDsc_Sel',fld:'vTFMADETMAQDSC_SEL',pic:''},{av:'AV60TFMADetTipMCod',fld:'vTFMADETTIPMCOD',pic:''},{av:'AV61TFMADetTipMCod_Sel',fld:'vTFMADETTIPMCOD_SEL',pic:''},{av:'AV62TFMADetTipMDsc',fld:'vTFMADETTIPMDSC',pic:''},{av:'AV63TFMADetTipMDsc_Sel',fld:'vTFMADETTIPMDSC_SEL',pic:''},{av:'AV107TFMADetDefCod',fld:'vTFMADETDEFCOD',pic:'ZZZ9'},{av:'AV108TFMADetDefCod_To',fld:'vTFMADETDEFCOD_TO',pic:'ZZZ9'},{av:'AV109TFMADetDefDsc',fld:'vTFMADETDEFDSC',pic:''},{av:'AV110TFMADetDefDsc_Sel',fld:'vTFMADETDEFDSC_SEL',pic:''},{av:'AV111TFMADetCatCod',fld:'vTFMADETCATCOD',pic:'ZZZ9'},{av:'AV112TFMADetCatCod_To',fld:'vTFMADETCATCOD_TO',pic:'ZZZ9'},{av:'AV113TFMADetCatDsc',fld:'vTFMADETCATDSC',pic:''},{av:'AV114TFMADetCatDsc_Sel',fld:'vTFMADETCATDSC_SEL',pic:''},{av:'AV116TFMADetHdr',fld:'vTFMADETHDR',pic:''},{av:'AV117TFMADetHdr_Sel',fld:'vTFMADETHDR_SEL',pic:''},{av:'AV64TFMADetKilProd',fld:'vTFMADETKILPROD',pic:'ZZZZZZZZ9.99'},{av:'AV65TFMADetKilProd_To',fld:'vTFMADETKILPROD_TO',pic:'ZZZZZZZZ9.99'},{av:'AV66TFMADetKilReo',fld:'vTFMADETKILREO',pic:'ZZZZZZZZ9.99'},{av:'AV67TFMADetKilReo_To',fld:'vTFMADETKILREO_TO',pic:'ZZZZZZZZ9.99'},{av:'AV93TFMADetKilTot',fld:'vTFMADETKILTOT',pic:'ZZZZZZZZ9.99'},{av:'AV94TFMADetKilTot_To',fld:'vTFMADETKILTOT_TO',pic:'ZZZZZZZZ9.99'},{av:'AV122TFMADetMetProd',fld:'vTFMADETMETPROD',pic:'ZZZZZZZZ9.99'},{av:'AV123TFMADetMetProd_To',fld:'vTFMADETMETPROD_TO',pic:'ZZZZZZZZ9.99'},{av:'AV124TFMADetMetReo',fld:'vTFMADETMETREO',pic:'ZZZZZZZZ9.99'},{av:'AV125TFMADetMetReo_To',fld:'vTFMADETMETREO_TO',pic:'ZZZZZZZZ9.99'},{av:'AV126TFMADetMetTot',fld:'vTFMADETMETTOT',pic:'ZZZZZZZZ9.99'},{av:'AV127TFMADetMetTot_To',fld:'vTFMADETMETTOT_TO',pic:'ZZZZZZZZ9.99'},{av:'AV132Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV70MADetEmprCod',fld:'vMADETEMPRCOD',pic:''},{av:'AV71CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV72ArtCod',fld:'vARTCOD',pic:''},{av:'AV73ForColNum',fld:'vFORCOLNUM',pic:'ZZZZZ9'},{av:'AV74TipMaqCodJSON',fld:'vTIPMAQCODJSON',pic:''},{av:'AV75FechaInicio',fld:'vFECHAINICIO',pic:''},{av:'AV76FechaFin',fld:'vFECHAFIN',pic:''},{av:'AV115MADetMaqCod',fld:'vMADETMAQCOD',pic:''},{av:'AV103MADetDefCod',fld:'vMADETDEFCOD',pic:'ZZZ9'},{av:'AV104MADetCatCod',fld:'vMADETCATCOD',pic:'ZZZ9'},{av:'AV105MTknUsu',fld:'vMTKNUSU',pic:''},{av:'AV106MTkn',fld:'vMTKN',pic:''},{av:'A14584MADetUsu',fld:'MADETUSU',pic:''},{av:'AV91sdtMTok',fld:'vSDTMTOK',pic:'',hsh:true},{av:'A14583MADetTkn',fld:'MADETTKN',pic:''},{av:'A14587MADetEmprC',fld:'MADETEMPRC',pic:''},{av:'A14585MADetCliCo',fld:'MADETCLICO',pic:'ZZZZZ9'},{av:'A14588MADetArtCo',fld:'MADETARTCO',pic:''},{av:'A14589MADetColNu',fld:'MADETCOLNU',pic:'ZZZZZ9'},{av:'A14591MADetMaqCo',fld:'MADETMAQCO',pic:''},{av:'A14590MADetTipMC',fld:'MADETTIPMC',pic:''},{av:'AV79TipMaqCodCollection',fld:'vTIPMAQCODCOLLECTION',pic:'',hsh:true},{av:'A14662MADetDefCo',fld:'MADETDEFCO',pic:'ZZZ9'},{av:'A14664MADetCatCo',fld:'MADETCATCO',pic:'ZZZ9'},{av:'A14658MADetKilPr',fld:'MADETKILPR',pic:'ZZZZZZZZ9.99'},{av:'AV87TotMADetKilProd',fld:'vTOTMADETKILPROD',pic:'ZZZZZZZZ9.99',hsh:true},{av:'A14659MADetKilRe',fld:'MADETKILRE',pic:'ZZZZZZZZ9.99'},{av:'AV89TotMADetKilReo',fld:'vTOTMADETKILREO',pic:'ZZZZZZZZ9.99',hsh:true},{av:'A14661MADetKilTo',fld:'MADETKILTO',pic:'ZZZZZZZZ9.99'},{av:'AV120TotMADetKilTot',fld:'vTOTMADETKILTOT',pic:'ZZZZZZZZ9.99',hsh:true},{av:'A14671MADetMetRe',fld:'MADETMETRE',pic:'ZZZZZZZZ9.99'},{av:'AV128TotMADetMetReo',fld:'vTOTMADETMETREO',pic:'ZZZZZZZZ9.99',hsh:true}]");
      setEventMetadata("GRID_FIRSTPAGE",",oparms:[{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtMADetFec_Visible',ctrl:'MADETFEC',prop:'Visible'},{av:'edtMADetEmprC_Visible',ctrl:'MADETEMPRC',prop:'Visible'},{av:'edtMADetCliCo_Visible',ctrl:'MADETCLICO',prop:'Visible'},{av:'edtMADetCliNo_Visible',ctrl:'MADETCLINO',prop:'Visible'},{av:'edtMADetArtCo_Visible',ctrl:'MADETARTCO',prop:'Visible'},{av:'edtMADetArtDs_Visible',ctrl:'MADETARTDS',prop:'Visible'},{av:'edtMADetColNu_Visible',ctrl:'MADETCOLNU',prop:'Visible'},{av:'edtMADetColNo_Visible',ctrl:'MADETCOLNO',prop:'Visible'},{av:'edtMADetColCo_Visible',ctrl:'MADETCOLCO',prop:'Visible'},{av:'edtMADetMatCo_Visible',ctrl:'MADETMATCO',prop:'Visible'},{av:'edtMADetMatDs_Visible',ctrl:'MADETMATDS',prop:'Visible'},{av:'edtMADetIntCo_Visible',ctrl:'MADETINTCO',prop:'Visible'},{av:'edtMADetIntDs_Visible',ctrl:'MADETINTDS',prop:'Visible'},{av:'edtMADetMaqCo_Visible',ctrl:'MADETMAQCO',prop:'Visible'},{av:'edtMADetMaqDs_Visible',ctrl:'MADETMAQDS',prop:'Visible'},{av:'edtMADetTipMC_Visible',ctrl:'MADETTIPMC',prop:'Visible'},{av:'edtMADetTipMD_Visible',ctrl:'MADETTIPMD',prop:'Visible'},{av:'edtMADetDefCo_Visible',ctrl:'MADETDEFCO',prop:'Visible'},{av:'edtMADetDefDs_Visible',ctrl:'MADETDEFDS',prop:'Visible'},{av:'edtMADetCatCo_Visible',ctrl:'MADETCATCO',prop:'Visible'},{av:'edtMADetCatDs_Visible',ctrl:'MADETCATDS',prop:'Visible'},{av:'edtMADetHdr_Visible',ctrl:'MADETHDR',prop:'Visible'},{av:'edtMADetKilPr_Visible',ctrl:'MADETKILPR',prop:'Visible'},{av:'edtMADetKilRe_Visible',ctrl:'MADETKILRE',prop:'Visible'},{av:'edtMADetKilTo_Visible',ctrl:'MADETKILTO',prop:'Visible'},{av:'edtMADetMetPr_Visible',ctrl:'MADETMETPR',prop:'Visible'},{av:'edtMADetMetRe_Visible',ctrl:'MADETMETRE',prop:'Visible'},{av:'edtMADetMetTo_Visible',ctrl:'MADETMETTO',prop:'Visible'},{av:'AV23ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV87TotMADetKilProd',fld:'vTOTMADETKILPROD',pic:'ZZZZZZZZ9.99',hsh:true},{av:'AV89TotMADetKilReo',fld:'vTOTMADETKILREO',pic:'ZZZZZZZZ9.99',hsh:true},{av:'AV120TotMADetKilTot',fld:'vTOTMADETKILTOT',pic:'ZZZZZZZZ9.99',hsh:true},{av:'AV128TotMADetMetReo',fld:'vTOTMADETMETREO',pic:'ZZZZZZZZ9.99',hsh:true},{av:'AV86TotValueMADetFec',fld:'vTOTVALUEMADETFEC',pic:''},{av:'AV88TotValueMADetKilProd',fld:'vTOTVALUEMADETKILPROD',pic:''},{av:'AV90TotValueMADetKilReo',fld:'vTOTVALUEMADETKILREO',pic:''},{av:'AV121TotValueMADetKilTot',fld:'vTOTVALUEMADETKILTOT',pic:''},{av:'AV129TotValueMADetMetReo',fld:'vTOTVALUEMADETMETREO',pic:''}]}");
      setEventMetadata("GRID_PREVPAGE","{handler:'subgrid_previouspage',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'sPrefix'},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV28TFMADetFec',fld:'vTFMADETFEC',pic:''},{av:'AV32TFMADetEmprCod',fld:'vTFMADETEMPRCOD',pic:''},{av:'AV33TFMADetEmprCod_Sel',fld:'vTFMADETEMPRCOD_SEL',pic:''},{av:'AV34TFMADetCliCod',fld:'vTFMADETCLICOD',pic:'ZZZZZ9'},{av:'AV35TFMADetCliCod_To',fld:'vTFMADETCLICOD_TO',pic:'ZZZZZ9'},{av:'AV36TFMADetCliNom',fld:'vTFMADETCLINOM',pic:''},{av:'AV37TFMADetCliNom_Sel',fld:'vTFMADETCLINOM_SEL',pic:''},{av:'AV38TFMADetArtCod',fld:'vTFMADETARTCOD',pic:''},{av:'AV39TFMADetArtCod_Sel',fld:'vTFMADETARTCOD_SEL',pic:''},{av:'AV77TFMADetArtDsc',fld:'vTFMADETARTDSC',pic:''},{av:'AV78TFMADetArtDsc_Sel',fld:'vTFMADETARTDSC_SEL',pic:''},{av:'AV44TFMADetColNum',fld:'vTFMADETCOLNUM',pic:'ZZZZZ9'},{av:'AV45TFMADetColNum_To',fld:'vTFMADETCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV42TFMADetColNom',fld:'vTFMADETCOLNOM',pic:''},{av:'AV43TFMADetColNom_Sel',fld:'vTFMADETCOLNOM_SEL',pic:''},{av:'AV46TFMADetColCod',fld:'vTFMADETCOLCOD',pic:'Z9'},{av:'AV47TFMADetColCod_To',fld:'vTFMADETCOLCOD_TO',pic:'Z9'},{av:'AV48TFMADetMatCod',fld:'vTFMADETMATCOD',pic:'ZZ9'},{av:'AV49TFMADetMatCod_To',fld:'vTFMADETMATCOD_TO',pic:'ZZ9'},{av:'AV80TFMADetMatDsc',fld:'vTFMADETMATDSC',pic:''},{av:'AV81TFMADetMatDsc_Sel',fld:'vTFMADETMATDSC_SEL',pic:''},{av:'AV52TFMADetIntCod',fld:'vTFMADETINTCOD',pic:'Z9'},{av:'AV53TFMADetIntCod_To',fld:'vTFMADETINTCOD_TO',pic:'Z9'},{av:'AV82TFMADetIntDsc',fld:'vTFMADETINTDSC',pic:''},{av:'AV83TFMADetIntDsc_Sel',fld:'vTFMADETINTDSC_SEL',pic:''},{av:'AV56TFMADetMaqCod',fld:'vTFMADETMAQCOD',pic:''},{av:'AV57TFMADetMaqCod_Sel',fld:'vTFMADETMAQCOD_SEL',pic:''},{av:'AV58TFMADetMaqDsc',fld:'vTFMADETMAQDSC',pic:''},{av:'AV59TFMADetMaqDsc_Sel',fld:'vTFMADETMAQDSC_SEL',pic:''},{av:'AV60TFMADetTipMCod',fld:'vTFMADETTIPMCOD',pic:''},{av:'AV61TFMADetTipMCod_Sel',fld:'vTFMADETTIPMCOD_SEL',pic:''},{av:'AV62TFMADetTipMDsc',fld:'vTFMADETTIPMDSC',pic:''},{av:'AV63TFMADetTipMDsc_Sel',fld:'vTFMADETTIPMDSC_SEL',pic:''},{av:'AV107TFMADetDefCod',fld:'vTFMADETDEFCOD',pic:'ZZZ9'},{av:'AV108TFMADetDefCod_To',fld:'vTFMADETDEFCOD_TO',pic:'ZZZ9'},{av:'AV109TFMADetDefDsc',fld:'vTFMADETDEFDSC',pic:''},{av:'AV110TFMADetDefDsc_Sel',fld:'vTFMADETDEFDSC_SEL',pic:''},{av:'AV111TFMADetCatCod',fld:'vTFMADETCATCOD',pic:'ZZZ9'},{av:'AV112TFMADetCatCod_To',fld:'vTFMADETCATCOD_TO',pic:'ZZZ9'},{av:'AV113TFMADetCatDsc',fld:'vTFMADETCATDSC',pic:''},{av:'AV114TFMADetCatDsc_Sel',fld:'vTFMADETCATDSC_SEL',pic:''},{av:'AV116TFMADetHdr',fld:'vTFMADETHDR',pic:''},{av:'AV117TFMADetHdr_Sel',fld:'vTFMADETHDR_SEL',pic:''},{av:'AV64TFMADetKilProd',fld:'vTFMADETKILPROD',pic:'ZZZZZZZZ9.99'},{av:'AV65TFMADetKilProd_To',fld:'vTFMADETKILPROD_TO',pic:'ZZZZZZZZ9.99'},{av:'AV66TFMADetKilReo',fld:'vTFMADETKILREO',pic:'ZZZZZZZZ9.99'},{av:'AV67TFMADetKilReo_To',fld:'vTFMADETKILREO_TO',pic:'ZZZZZZZZ9.99'},{av:'AV93TFMADetKilTot',fld:'vTFMADETKILTOT',pic:'ZZZZZZZZ9.99'},{av:'AV94TFMADetKilTot_To',fld:'vTFMADETKILTOT_TO',pic:'ZZZZZZZZ9.99'},{av:'AV122TFMADetMetProd',fld:'vTFMADETMETPROD',pic:'ZZZZZZZZ9.99'},{av:'AV123TFMADetMetProd_To',fld:'vTFMADETMETPROD_TO',pic:'ZZZZZZZZ9.99'},{av:'AV124TFMADetMetReo',fld:'vTFMADETMETREO',pic:'ZZZZZZZZ9.99'},{av:'AV125TFMADetMetReo_To',fld:'vTFMADETMETREO_TO',pic:'ZZZZZZZZ9.99'},{av:'AV126TFMADetMetTot',fld:'vTFMADETMETTOT',pic:'ZZZZZZZZ9.99'},{av:'AV127TFMADetMetTot_To',fld:'vTFMADETMETTOT_TO',pic:'ZZZZZZZZ9.99'},{av:'AV132Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV70MADetEmprCod',fld:'vMADETEMPRCOD',pic:''},{av:'AV71CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV72ArtCod',fld:'vARTCOD',pic:''},{av:'AV73ForColNum',fld:'vFORCOLNUM',pic:'ZZZZZ9'},{av:'AV74TipMaqCodJSON',fld:'vTIPMAQCODJSON',pic:''},{av:'AV75FechaInicio',fld:'vFECHAINICIO',pic:''},{av:'AV76FechaFin',fld:'vFECHAFIN',pic:''},{av:'AV115MADetMaqCod',fld:'vMADETMAQCOD',pic:''},{av:'AV103MADetDefCod',fld:'vMADETDEFCOD',pic:'ZZZ9'},{av:'AV104MADetCatCod',fld:'vMADETCATCOD',pic:'ZZZ9'},{av:'AV105MTknUsu',fld:'vMTKNUSU',pic:''},{av:'AV106MTkn',fld:'vMTKN',pic:''},{av:'A14584MADetUsu',fld:'MADETUSU',pic:''},{av:'AV91sdtMTok',fld:'vSDTMTOK',pic:'',hsh:true},{av:'A14583MADetTkn',fld:'MADETTKN',pic:''},{av:'A14587MADetEmprC',fld:'MADETEMPRC',pic:''},{av:'A14585MADetCliCo',fld:'MADETCLICO',pic:'ZZZZZ9'},{av:'A14588MADetArtCo',fld:'MADETARTCO',pic:''},{av:'A14589MADetColNu',fld:'MADETCOLNU',pic:'ZZZZZ9'},{av:'A14591MADetMaqCo',fld:'MADETMAQCO',pic:''},{av:'A14590MADetTipMC',fld:'MADETTIPMC',pic:''},{av:'AV79TipMaqCodCollection',fld:'vTIPMAQCODCOLLECTION',pic:'',hsh:true},{av:'A14662MADetDefCo',fld:'MADETDEFCO',pic:'ZZZ9'},{av:'A14664MADetCatCo',fld:'MADETCATCO',pic:'ZZZ9'},{av:'A14658MADetKilPr',fld:'MADETKILPR',pic:'ZZZZZZZZ9.99'},{av:'AV87TotMADetKilProd',fld:'vTOTMADETKILPROD',pic:'ZZZZZZZZ9.99',hsh:true},{av:'A14659MADetKilRe',fld:'MADETKILRE',pic:'ZZZZZZZZ9.99'},{av:'AV89TotMADetKilReo',fld:'vTOTMADETKILREO',pic:'ZZZZZZZZ9.99',hsh:true},{av:'A14661MADetKilTo',fld:'MADETKILTO',pic:'ZZZZZZZZ9.99'},{av:'AV120TotMADetKilTot',fld:'vTOTMADETKILTOT',pic:'ZZZZZZZZ9.99',hsh:true},{av:'A14671MADetMetRe',fld:'MADETMETRE',pic:'ZZZZZZZZ9.99'},{av:'AV128TotMADetMetReo',fld:'vTOTMADETMETREO',pic:'ZZZZZZZZ9.99',hsh:true}]");
      setEventMetadata("GRID_PREVPAGE",",oparms:[{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtMADetFec_Visible',ctrl:'MADETFEC',prop:'Visible'},{av:'edtMADetEmprC_Visible',ctrl:'MADETEMPRC',prop:'Visible'},{av:'edtMADetCliCo_Visible',ctrl:'MADETCLICO',prop:'Visible'},{av:'edtMADetCliNo_Visible',ctrl:'MADETCLINO',prop:'Visible'},{av:'edtMADetArtCo_Visible',ctrl:'MADETARTCO',prop:'Visible'},{av:'edtMADetArtDs_Visible',ctrl:'MADETARTDS',prop:'Visible'},{av:'edtMADetColNu_Visible',ctrl:'MADETCOLNU',prop:'Visible'},{av:'edtMADetColNo_Visible',ctrl:'MADETCOLNO',prop:'Visible'},{av:'edtMADetColCo_Visible',ctrl:'MADETCOLCO',prop:'Visible'},{av:'edtMADetMatCo_Visible',ctrl:'MADETMATCO',prop:'Visible'},{av:'edtMADetMatDs_Visible',ctrl:'MADETMATDS',prop:'Visible'},{av:'edtMADetIntCo_Visible',ctrl:'MADETINTCO',prop:'Visible'},{av:'edtMADetIntDs_Visible',ctrl:'MADETINTDS',prop:'Visible'},{av:'edtMADetMaqCo_Visible',ctrl:'MADETMAQCO',prop:'Visible'},{av:'edtMADetMaqDs_Visible',ctrl:'MADETMAQDS',prop:'Visible'},{av:'edtMADetTipMC_Visible',ctrl:'MADETTIPMC',prop:'Visible'},{av:'edtMADetTipMD_Visible',ctrl:'MADETTIPMD',prop:'Visible'},{av:'edtMADetDefCo_Visible',ctrl:'MADETDEFCO',prop:'Visible'},{av:'edtMADetDefDs_Visible',ctrl:'MADETDEFDS',prop:'Visible'},{av:'edtMADetCatCo_Visible',ctrl:'MADETCATCO',prop:'Visible'},{av:'edtMADetCatDs_Visible',ctrl:'MADETCATDS',prop:'Visible'},{av:'edtMADetHdr_Visible',ctrl:'MADETHDR',prop:'Visible'},{av:'edtMADetKilPr_Visible',ctrl:'MADETKILPR',prop:'Visible'},{av:'edtMADetKilRe_Visible',ctrl:'MADETKILRE',prop:'Visible'},{av:'edtMADetKilTo_Visible',ctrl:'MADETKILTO',prop:'Visible'},{av:'edtMADetMetPr_Visible',ctrl:'MADETMETPR',prop:'Visible'},{av:'edtMADetMetRe_Visible',ctrl:'MADETMETRE',prop:'Visible'},{av:'edtMADetMetTo_Visible',ctrl:'MADETMETTO',prop:'Visible'},{av:'AV23ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV87TotMADetKilProd',fld:'vTOTMADETKILPROD',pic:'ZZZZZZZZ9.99',hsh:true},{av:'AV89TotMADetKilReo',fld:'vTOTMADETKILREO',pic:'ZZZZZZZZ9.99',hsh:true},{av:'AV120TotMADetKilTot',fld:'vTOTMADETKILTOT',pic:'ZZZZZZZZ9.99',hsh:true},{av:'AV128TotMADetMetReo',fld:'vTOTMADETMETREO',pic:'ZZZZZZZZ9.99',hsh:true},{av:'AV86TotValueMADetFec',fld:'vTOTVALUEMADETFEC',pic:''},{av:'AV88TotValueMADetKilProd',fld:'vTOTVALUEMADETKILPROD',pic:''},{av:'AV90TotValueMADetKilReo',fld:'vTOTVALUEMADETKILREO',pic:''},{av:'AV121TotValueMADetKilTot',fld:'vTOTVALUEMADETKILTOT',pic:''},{av:'AV129TotValueMADetMetReo',fld:'vTOTVALUEMADETMETREO',pic:''}]}");
      setEventMetadata("GRID_NEXTPAGE","{handler:'subgrid_nextpage',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'sPrefix'},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV28TFMADetFec',fld:'vTFMADETFEC',pic:''},{av:'AV32TFMADetEmprCod',fld:'vTFMADETEMPRCOD',pic:''},{av:'AV33TFMADetEmprCod_Sel',fld:'vTFMADETEMPRCOD_SEL',pic:''},{av:'AV34TFMADetCliCod',fld:'vTFMADETCLICOD',pic:'ZZZZZ9'},{av:'AV35TFMADetCliCod_To',fld:'vTFMADETCLICOD_TO',pic:'ZZZZZ9'},{av:'AV36TFMADetCliNom',fld:'vTFMADETCLINOM',pic:''},{av:'AV37TFMADetCliNom_Sel',fld:'vTFMADETCLINOM_SEL',pic:''},{av:'AV38TFMADetArtCod',fld:'vTFMADETARTCOD',pic:''},{av:'AV39TFMADetArtCod_Sel',fld:'vTFMADETARTCOD_SEL',pic:''},{av:'AV77TFMADetArtDsc',fld:'vTFMADETARTDSC',pic:''},{av:'AV78TFMADetArtDsc_Sel',fld:'vTFMADETARTDSC_SEL',pic:''},{av:'AV44TFMADetColNum',fld:'vTFMADETCOLNUM',pic:'ZZZZZ9'},{av:'AV45TFMADetColNum_To',fld:'vTFMADETCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV42TFMADetColNom',fld:'vTFMADETCOLNOM',pic:''},{av:'AV43TFMADetColNom_Sel',fld:'vTFMADETCOLNOM_SEL',pic:''},{av:'AV46TFMADetColCod',fld:'vTFMADETCOLCOD',pic:'Z9'},{av:'AV47TFMADetColCod_To',fld:'vTFMADETCOLCOD_TO',pic:'Z9'},{av:'AV48TFMADetMatCod',fld:'vTFMADETMATCOD',pic:'ZZ9'},{av:'AV49TFMADetMatCod_To',fld:'vTFMADETMATCOD_TO',pic:'ZZ9'},{av:'AV80TFMADetMatDsc',fld:'vTFMADETMATDSC',pic:''},{av:'AV81TFMADetMatDsc_Sel',fld:'vTFMADETMATDSC_SEL',pic:''},{av:'AV52TFMADetIntCod',fld:'vTFMADETINTCOD',pic:'Z9'},{av:'AV53TFMADetIntCod_To',fld:'vTFMADETINTCOD_TO',pic:'Z9'},{av:'AV82TFMADetIntDsc',fld:'vTFMADETINTDSC',pic:''},{av:'AV83TFMADetIntDsc_Sel',fld:'vTFMADETINTDSC_SEL',pic:''},{av:'AV56TFMADetMaqCod',fld:'vTFMADETMAQCOD',pic:''},{av:'AV57TFMADetMaqCod_Sel',fld:'vTFMADETMAQCOD_SEL',pic:''},{av:'AV58TFMADetMaqDsc',fld:'vTFMADETMAQDSC',pic:''},{av:'AV59TFMADetMaqDsc_Sel',fld:'vTFMADETMAQDSC_SEL',pic:''},{av:'AV60TFMADetTipMCod',fld:'vTFMADETTIPMCOD',pic:''},{av:'AV61TFMADetTipMCod_Sel',fld:'vTFMADETTIPMCOD_SEL',pic:''},{av:'AV62TFMADetTipMDsc',fld:'vTFMADETTIPMDSC',pic:''},{av:'AV63TFMADetTipMDsc_Sel',fld:'vTFMADETTIPMDSC_SEL',pic:''},{av:'AV107TFMADetDefCod',fld:'vTFMADETDEFCOD',pic:'ZZZ9'},{av:'AV108TFMADetDefCod_To',fld:'vTFMADETDEFCOD_TO',pic:'ZZZ9'},{av:'AV109TFMADetDefDsc',fld:'vTFMADETDEFDSC',pic:''},{av:'AV110TFMADetDefDsc_Sel',fld:'vTFMADETDEFDSC_SEL',pic:''},{av:'AV111TFMADetCatCod',fld:'vTFMADETCATCOD',pic:'ZZZ9'},{av:'AV112TFMADetCatCod_To',fld:'vTFMADETCATCOD_TO',pic:'ZZZ9'},{av:'AV113TFMADetCatDsc',fld:'vTFMADETCATDSC',pic:''},{av:'AV114TFMADetCatDsc_Sel',fld:'vTFMADETCATDSC_SEL',pic:''},{av:'AV116TFMADetHdr',fld:'vTFMADETHDR',pic:''},{av:'AV117TFMADetHdr_Sel',fld:'vTFMADETHDR_SEL',pic:''},{av:'AV64TFMADetKilProd',fld:'vTFMADETKILPROD',pic:'ZZZZZZZZ9.99'},{av:'AV65TFMADetKilProd_To',fld:'vTFMADETKILPROD_TO',pic:'ZZZZZZZZ9.99'},{av:'AV66TFMADetKilReo',fld:'vTFMADETKILREO',pic:'ZZZZZZZZ9.99'},{av:'AV67TFMADetKilReo_To',fld:'vTFMADETKILREO_TO',pic:'ZZZZZZZZ9.99'},{av:'AV93TFMADetKilTot',fld:'vTFMADETKILTOT',pic:'ZZZZZZZZ9.99'},{av:'AV94TFMADetKilTot_To',fld:'vTFMADETKILTOT_TO',pic:'ZZZZZZZZ9.99'},{av:'AV122TFMADetMetProd',fld:'vTFMADETMETPROD',pic:'ZZZZZZZZ9.99'},{av:'AV123TFMADetMetProd_To',fld:'vTFMADETMETPROD_TO',pic:'ZZZZZZZZ9.99'},{av:'AV124TFMADetMetReo',fld:'vTFMADETMETREO',pic:'ZZZZZZZZ9.99'},{av:'AV125TFMADetMetReo_To',fld:'vTFMADETMETREO_TO',pic:'ZZZZZZZZ9.99'},{av:'AV126TFMADetMetTot',fld:'vTFMADETMETTOT',pic:'ZZZZZZZZ9.99'},{av:'AV127TFMADetMetTot_To',fld:'vTFMADETMETTOT_TO',pic:'ZZZZZZZZ9.99'},{av:'AV132Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV70MADetEmprCod',fld:'vMADETEMPRCOD',pic:''},{av:'AV71CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV72ArtCod',fld:'vARTCOD',pic:''},{av:'AV73ForColNum',fld:'vFORCOLNUM',pic:'ZZZZZ9'},{av:'AV74TipMaqCodJSON',fld:'vTIPMAQCODJSON',pic:''},{av:'AV75FechaInicio',fld:'vFECHAINICIO',pic:''},{av:'AV76FechaFin',fld:'vFECHAFIN',pic:''},{av:'AV115MADetMaqCod',fld:'vMADETMAQCOD',pic:''},{av:'AV103MADetDefCod',fld:'vMADETDEFCOD',pic:'ZZZ9'},{av:'AV104MADetCatCod',fld:'vMADETCATCOD',pic:'ZZZ9'},{av:'AV105MTknUsu',fld:'vMTKNUSU',pic:''},{av:'AV106MTkn',fld:'vMTKN',pic:''},{av:'A14584MADetUsu',fld:'MADETUSU',pic:''},{av:'AV91sdtMTok',fld:'vSDTMTOK',pic:'',hsh:true},{av:'A14583MADetTkn',fld:'MADETTKN',pic:''},{av:'A14587MADetEmprC',fld:'MADETEMPRC',pic:''},{av:'A14585MADetCliCo',fld:'MADETCLICO',pic:'ZZZZZ9'},{av:'A14588MADetArtCo',fld:'MADETARTCO',pic:''},{av:'A14589MADetColNu',fld:'MADETCOLNU',pic:'ZZZZZ9'},{av:'A14591MADetMaqCo',fld:'MADETMAQCO',pic:''},{av:'A14590MADetTipMC',fld:'MADETTIPMC',pic:''},{av:'AV79TipMaqCodCollection',fld:'vTIPMAQCODCOLLECTION',pic:'',hsh:true},{av:'A14662MADetDefCo',fld:'MADETDEFCO',pic:'ZZZ9'},{av:'A14664MADetCatCo',fld:'MADETCATCO',pic:'ZZZ9'},{av:'A14658MADetKilPr',fld:'MADETKILPR',pic:'ZZZZZZZZ9.99'},{av:'AV87TotMADetKilProd',fld:'vTOTMADETKILPROD',pic:'ZZZZZZZZ9.99',hsh:true},{av:'A14659MADetKilRe',fld:'MADETKILRE',pic:'ZZZZZZZZ9.99'},{av:'AV89TotMADetKilReo',fld:'vTOTMADETKILREO',pic:'ZZZZZZZZ9.99',hsh:true},{av:'A14661MADetKilTo',fld:'MADETKILTO',pic:'ZZZZZZZZ9.99'},{av:'AV120TotMADetKilTot',fld:'vTOTMADETKILTOT',pic:'ZZZZZZZZ9.99',hsh:true},{av:'A14671MADetMetRe',fld:'MADETMETRE',pic:'ZZZZZZZZ9.99'},{av:'AV128TotMADetMetReo',fld:'vTOTMADETMETREO',pic:'ZZZZZZZZ9.99',hsh:true}]");
      setEventMetadata("GRID_NEXTPAGE",",oparms:[{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtMADetFec_Visible',ctrl:'MADETFEC',prop:'Visible'},{av:'edtMADetEmprC_Visible',ctrl:'MADETEMPRC',prop:'Visible'},{av:'edtMADetCliCo_Visible',ctrl:'MADETCLICO',prop:'Visible'},{av:'edtMADetCliNo_Visible',ctrl:'MADETCLINO',prop:'Visible'},{av:'edtMADetArtCo_Visible',ctrl:'MADETARTCO',prop:'Visible'},{av:'edtMADetArtDs_Visible',ctrl:'MADETARTDS',prop:'Visible'},{av:'edtMADetColNu_Visible',ctrl:'MADETCOLNU',prop:'Visible'},{av:'edtMADetColNo_Visible',ctrl:'MADETCOLNO',prop:'Visible'},{av:'edtMADetColCo_Visible',ctrl:'MADETCOLCO',prop:'Visible'},{av:'edtMADetMatCo_Visible',ctrl:'MADETMATCO',prop:'Visible'},{av:'edtMADetMatDs_Visible',ctrl:'MADETMATDS',prop:'Visible'},{av:'edtMADetIntCo_Visible',ctrl:'MADETINTCO',prop:'Visible'},{av:'edtMADetIntDs_Visible',ctrl:'MADETINTDS',prop:'Visible'},{av:'edtMADetMaqCo_Visible',ctrl:'MADETMAQCO',prop:'Visible'},{av:'edtMADetMaqDs_Visible',ctrl:'MADETMAQDS',prop:'Visible'},{av:'edtMADetTipMC_Visible',ctrl:'MADETTIPMC',prop:'Visible'},{av:'edtMADetTipMD_Visible',ctrl:'MADETTIPMD',prop:'Visible'},{av:'edtMADetDefCo_Visible',ctrl:'MADETDEFCO',prop:'Visible'},{av:'edtMADetDefDs_Visible',ctrl:'MADETDEFDS',prop:'Visible'},{av:'edtMADetCatCo_Visible',ctrl:'MADETCATCO',prop:'Visible'},{av:'edtMADetCatDs_Visible',ctrl:'MADETCATDS',prop:'Visible'},{av:'edtMADetHdr_Visible',ctrl:'MADETHDR',prop:'Visible'},{av:'edtMADetKilPr_Visible',ctrl:'MADETKILPR',prop:'Visible'},{av:'edtMADetKilRe_Visible',ctrl:'MADETKILRE',prop:'Visible'},{av:'edtMADetKilTo_Visible',ctrl:'MADETKILTO',prop:'Visible'},{av:'edtMADetMetPr_Visible',ctrl:'MADETMETPR',prop:'Visible'},{av:'edtMADetMetRe_Visible',ctrl:'MADETMETRE',prop:'Visible'},{av:'edtMADetMetTo_Visible',ctrl:'MADETMETTO',prop:'Visible'},{av:'AV23ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV87TotMADetKilProd',fld:'vTOTMADETKILPROD',pic:'ZZZZZZZZ9.99',hsh:true},{av:'AV89TotMADetKilReo',fld:'vTOTMADETKILREO',pic:'ZZZZZZZZ9.99',hsh:true},{av:'AV120TotMADetKilTot',fld:'vTOTMADETKILTOT',pic:'ZZZZZZZZ9.99',hsh:true},{av:'AV128TotMADetMetReo',fld:'vTOTMADETMETREO',pic:'ZZZZZZZZ9.99',hsh:true},{av:'AV86TotValueMADetFec',fld:'vTOTVALUEMADETFEC',pic:''},{av:'AV88TotValueMADetKilProd',fld:'vTOTVALUEMADETKILPROD',pic:''},{av:'AV90TotValueMADetKilReo',fld:'vTOTVALUEMADETKILREO',pic:''},{av:'AV121TotValueMADetKilTot',fld:'vTOTVALUEMADETKILTOT',pic:''},{av:'AV129TotValueMADetMetReo',fld:'vTOTVALUEMADETMETREO',pic:''}]}");
      setEventMetadata("GRID_LASTPAGE","{handler:'subgrid_lastpage',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'sPrefix'},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV28TFMADetFec',fld:'vTFMADETFEC',pic:''},{av:'AV32TFMADetEmprCod',fld:'vTFMADETEMPRCOD',pic:''},{av:'AV33TFMADetEmprCod_Sel',fld:'vTFMADETEMPRCOD_SEL',pic:''},{av:'AV34TFMADetCliCod',fld:'vTFMADETCLICOD',pic:'ZZZZZ9'},{av:'AV35TFMADetCliCod_To',fld:'vTFMADETCLICOD_TO',pic:'ZZZZZ9'},{av:'AV36TFMADetCliNom',fld:'vTFMADETCLINOM',pic:''},{av:'AV37TFMADetCliNom_Sel',fld:'vTFMADETCLINOM_SEL',pic:''},{av:'AV38TFMADetArtCod',fld:'vTFMADETARTCOD',pic:''},{av:'AV39TFMADetArtCod_Sel',fld:'vTFMADETARTCOD_SEL',pic:''},{av:'AV77TFMADetArtDsc',fld:'vTFMADETARTDSC',pic:''},{av:'AV78TFMADetArtDsc_Sel',fld:'vTFMADETARTDSC_SEL',pic:''},{av:'AV44TFMADetColNum',fld:'vTFMADETCOLNUM',pic:'ZZZZZ9'},{av:'AV45TFMADetColNum_To',fld:'vTFMADETCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV42TFMADetColNom',fld:'vTFMADETCOLNOM',pic:''},{av:'AV43TFMADetColNom_Sel',fld:'vTFMADETCOLNOM_SEL',pic:''},{av:'AV46TFMADetColCod',fld:'vTFMADETCOLCOD',pic:'Z9'},{av:'AV47TFMADetColCod_To',fld:'vTFMADETCOLCOD_TO',pic:'Z9'},{av:'AV48TFMADetMatCod',fld:'vTFMADETMATCOD',pic:'ZZ9'},{av:'AV49TFMADetMatCod_To',fld:'vTFMADETMATCOD_TO',pic:'ZZ9'},{av:'AV80TFMADetMatDsc',fld:'vTFMADETMATDSC',pic:''},{av:'AV81TFMADetMatDsc_Sel',fld:'vTFMADETMATDSC_SEL',pic:''},{av:'AV52TFMADetIntCod',fld:'vTFMADETINTCOD',pic:'Z9'},{av:'AV53TFMADetIntCod_To',fld:'vTFMADETINTCOD_TO',pic:'Z9'},{av:'AV82TFMADetIntDsc',fld:'vTFMADETINTDSC',pic:''},{av:'AV83TFMADetIntDsc_Sel',fld:'vTFMADETINTDSC_SEL',pic:''},{av:'AV56TFMADetMaqCod',fld:'vTFMADETMAQCOD',pic:''},{av:'AV57TFMADetMaqCod_Sel',fld:'vTFMADETMAQCOD_SEL',pic:''},{av:'AV58TFMADetMaqDsc',fld:'vTFMADETMAQDSC',pic:''},{av:'AV59TFMADetMaqDsc_Sel',fld:'vTFMADETMAQDSC_SEL',pic:''},{av:'AV60TFMADetTipMCod',fld:'vTFMADETTIPMCOD',pic:''},{av:'AV61TFMADetTipMCod_Sel',fld:'vTFMADETTIPMCOD_SEL',pic:''},{av:'AV62TFMADetTipMDsc',fld:'vTFMADETTIPMDSC',pic:''},{av:'AV63TFMADetTipMDsc_Sel',fld:'vTFMADETTIPMDSC_SEL',pic:''},{av:'AV107TFMADetDefCod',fld:'vTFMADETDEFCOD',pic:'ZZZ9'},{av:'AV108TFMADetDefCod_To',fld:'vTFMADETDEFCOD_TO',pic:'ZZZ9'},{av:'AV109TFMADetDefDsc',fld:'vTFMADETDEFDSC',pic:''},{av:'AV110TFMADetDefDsc_Sel',fld:'vTFMADETDEFDSC_SEL',pic:''},{av:'AV111TFMADetCatCod',fld:'vTFMADETCATCOD',pic:'ZZZ9'},{av:'AV112TFMADetCatCod_To',fld:'vTFMADETCATCOD_TO',pic:'ZZZ9'},{av:'AV113TFMADetCatDsc',fld:'vTFMADETCATDSC',pic:''},{av:'AV114TFMADetCatDsc_Sel',fld:'vTFMADETCATDSC_SEL',pic:''},{av:'AV116TFMADetHdr',fld:'vTFMADETHDR',pic:''},{av:'AV117TFMADetHdr_Sel',fld:'vTFMADETHDR_SEL',pic:''},{av:'AV64TFMADetKilProd',fld:'vTFMADETKILPROD',pic:'ZZZZZZZZ9.99'},{av:'AV65TFMADetKilProd_To',fld:'vTFMADETKILPROD_TO',pic:'ZZZZZZZZ9.99'},{av:'AV66TFMADetKilReo',fld:'vTFMADETKILREO',pic:'ZZZZZZZZ9.99'},{av:'AV67TFMADetKilReo_To',fld:'vTFMADETKILREO_TO',pic:'ZZZZZZZZ9.99'},{av:'AV93TFMADetKilTot',fld:'vTFMADETKILTOT',pic:'ZZZZZZZZ9.99'},{av:'AV94TFMADetKilTot_To',fld:'vTFMADETKILTOT_TO',pic:'ZZZZZZZZ9.99'},{av:'AV122TFMADetMetProd',fld:'vTFMADETMETPROD',pic:'ZZZZZZZZ9.99'},{av:'AV123TFMADetMetProd_To',fld:'vTFMADETMETPROD_TO',pic:'ZZZZZZZZ9.99'},{av:'AV124TFMADetMetReo',fld:'vTFMADETMETREO',pic:'ZZZZZZZZ9.99'},{av:'AV125TFMADetMetReo_To',fld:'vTFMADETMETREO_TO',pic:'ZZZZZZZZ9.99'},{av:'AV126TFMADetMetTot',fld:'vTFMADETMETTOT',pic:'ZZZZZZZZ9.99'},{av:'AV127TFMADetMetTot_To',fld:'vTFMADETMETTOT_TO',pic:'ZZZZZZZZ9.99'},{av:'AV132Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV70MADetEmprCod',fld:'vMADETEMPRCOD',pic:''},{av:'AV71CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV72ArtCod',fld:'vARTCOD',pic:''},{av:'AV73ForColNum',fld:'vFORCOLNUM',pic:'ZZZZZ9'},{av:'AV74TipMaqCodJSON',fld:'vTIPMAQCODJSON',pic:''},{av:'AV75FechaInicio',fld:'vFECHAINICIO',pic:''},{av:'AV76FechaFin',fld:'vFECHAFIN',pic:''},{av:'AV115MADetMaqCod',fld:'vMADETMAQCOD',pic:''},{av:'AV103MADetDefCod',fld:'vMADETDEFCOD',pic:'ZZZ9'},{av:'AV104MADetCatCod',fld:'vMADETCATCOD',pic:'ZZZ9'},{av:'AV105MTknUsu',fld:'vMTKNUSU',pic:''},{av:'AV106MTkn',fld:'vMTKN',pic:''},{av:'A14584MADetUsu',fld:'MADETUSU',pic:''},{av:'AV91sdtMTok',fld:'vSDTMTOK',pic:'',hsh:true},{av:'A14583MADetTkn',fld:'MADETTKN',pic:''},{av:'A14587MADetEmprC',fld:'MADETEMPRC',pic:''},{av:'A14585MADetCliCo',fld:'MADETCLICO',pic:'ZZZZZ9'},{av:'A14588MADetArtCo',fld:'MADETARTCO',pic:''},{av:'A14589MADetColNu',fld:'MADETCOLNU',pic:'ZZZZZ9'},{av:'A14591MADetMaqCo',fld:'MADETMAQCO',pic:''},{av:'A14590MADetTipMC',fld:'MADETTIPMC',pic:''},{av:'AV79TipMaqCodCollection',fld:'vTIPMAQCODCOLLECTION',pic:'',hsh:true},{av:'A14662MADetDefCo',fld:'MADETDEFCO',pic:'ZZZ9'},{av:'A14664MADetCatCo',fld:'MADETCATCO',pic:'ZZZ9'},{av:'A14658MADetKilPr',fld:'MADETKILPR',pic:'ZZZZZZZZ9.99'},{av:'AV87TotMADetKilProd',fld:'vTOTMADETKILPROD',pic:'ZZZZZZZZ9.99',hsh:true},{av:'A14659MADetKilRe',fld:'MADETKILRE',pic:'ZZZZZZZZ9.99'},{av:'AV89TotMADetKilReo',fld:'vTOTMADETKILREO',pic:'ZZZZZZZZ9.99',hsh:true},{av:'A14661MADetKilTo',fld:'MADETKILTO',pic:'ZZZZZZZZ9.99'},{av:'AV120TotMADetKilTot',fld:'vTOTMADETKILTOT',pic:'ZZZZZZZZ9.99',hsh:true},{av:'A14671MADetMetRe',fld:'MADETMETRE',pic:'ZZZZZZZZ9.99'},{av:'AV128TotMADetMetReo',fld:'vTOTMADETMETREO',pic:'ZZZZZZZZ9.99',hsh:true}]");
      setEventMetadata("GRID_LASTPAGE",",oparms:[{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtMADetFec_Visible',ctrl:'MADETFEC',prop:'Visible'},{av:'edtMADetEmprC_Visible',ctrl:'MADETEMPRC',prop:'Visible'},{av:'edtMADetCliCo_Visible',ctrl:'MADETCLICO',prop:'Visible'},{av:'edtMADetCliNo_Visible',ctrl:'MADETCLINO',prop:'Visible'},{av:'edtMADetArtCo_Visible',ctrl:'MADETARTCO',prop:'Visible'},{av:'edtMADetArtDs_Visible',ctrl:'MADETARTDS',prop:'Visible'},{av:'edtMADetColNu_Visible',ctrl:'MADETCOLNU',prop:'Visible'},{av:'edtMADetColNo_Visible',ctrl:'MADETCOLNO',prop:'Visible'},{av:'edtMADetColCo_Visible',ctrl:'MADETCOLCO',prop:'Visible'},{av:'edtMADetMatCo_Visible',ctrl:'MADETMATCO',prop:'Visible'},{av:'edtMADetMatDs_Visible',ctrl:'MADETMATDS',prop:'Visible'},{av:'edtMADetIntCo_Visible',ctrl:'MADETINTCO',prop:'Visible'},{av:'edtMADetIntDs_Visible',ctrl:'MADETINTDS',prop:'Visible'},{av:'edtMADetMaqCo_Visible',ctrl:'MADETMAQCO',prop:'Visible'},{av:'edtMADetMaqDs_Visible',ctrl:'MADETMAQDS',prop:'Visible'},{av:'edtMADetTipMC_Visible',ctrl:'MADETTIPMC',prop:'Visible'},{av:'edtMADetTipMD_Visible',ctrl:'MADETTIPMD',prop:'Visible'},{av:'edtMADetDefCo_Visible',ctrl:'MADETDEFCO',prop:'Visible'},{av:'edtMADetDefDs_Visible',ctrl:'MADETDEFDS',prop:'Visible'},{av:'edtMADetCatCo_Visible',ctrl:'MADETCATCO',prop:'Visible'},{av:'edtMADetCatDs_Visible',ctrl:'MADETCATDS',prop:'Visible'},{av:'edtMADetHdr_Visible',ctrl:'MADETHDR',prop:'Visible'},{av:'edtMADetKilPr_Visible',ctrl:'MADETKILPR',prop:'Visible'},{av:'edtMADetKilRe_Visible',ctrl:'MADETKILRE',prop:'Visible'},{av:'edtMADetKilTo_Visible',ctrl:'MADETKILTO',prop:'Visible'},{av:'edtMADetMetPr_Visible',ctrl:'MADETMETPR',prop:'Visible'},{av:'edtMADetMetRe_Visible',ctrl:'MADETMETRE',prop:'Visible'},{av:'edtMADetMetTo_Visible',ctrl:'MADETMETTO',prop:'Visible'},{av:'AV23ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV87TotMADetKilProd',fld:'vTOTMADETKILPROD',pic:'ZZZZZZZZ9.99',hsh:true},{av:'AV89TotMADetKilReo',fld:'vTOTMADETKILREO',pic:'ZZZZZZZZ9.99',hsh:true},{av:'AV120TotMADetKilTot',fld:'vTOTMADETKILTOT',pic:'ZZZZZZZZ9.99',hsh:true},{av:'AV128TotMADetMetReo',fld:'vTOTMADETMETREO',pic:'ZZZZZZZZ9.99',hsh:true},{av:'AV86TotValueMADetFec',fld:'vTOTVALUEMADETFEC',pic:''},{av:'AV88TotValueMADetKilProd',fld:'vTOTVALUEMADETKILPROD',pic:''},{av:'AV90TotValueMADetKilReo',fld:'vTOTVALUEMADETKILREO',pic:''},{av:'AV121TotValueMADetKilTot',fld:'vTOTVALUEMADETKILTOT',pic:''},{av:'AV129TotValueMADetMetReo',fld:'vTOTVALUEMADETMETREO',pic:''}]}");
      setEventMetadata("NULL","{handler:'valid_Madettkn',iparms:[]");
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
      wcpOAV70MADetEmprCod = "" ;
      wcpOAV72ArtCod = "" ;
      wcpOAV74TipMaqCodJSON = "" ;
      wcpOAV75FechaInicio = GXutil.nullDate() ;
      wcpOAV76FechaFin = GXutil.nullDate() ;
      wcpOAV115MADetMaqCod = "" ;
      wcpOAV105MTknUsu = "" ;
      wcpOAV106MTkn = "" ;
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
      AV70MADetEmprCod = "" ;
      AV72ArtCod = "" ;
      AV74TipMaqCodJSON = "" ;
      AV75FechaInicio = GXutil.nullDate() ;
      AV76FechaFin = GXutil.nullDate() ;
      AV115MADetMaqCod = "" ;
      AV105MTknUsu = "" ;
      AV106MTkn = "" ;
      AV15FilterFullText = "" ;
      AV79TipMaqCodCollection = new GXSimpleCollection<String>(String.class, "internal", "");
      AV91sdtMTok = new app.anticipacionerrores.SdtsdtMTok(remoteHandle, context);
      AV20ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV28TFMADetFec = GXutil.nullDate() ;
      AV32TFMADetEmprCod = "" ;
      AV33TFMADetEmprCod_Sel = "" ;
      AV36TFMADetCliNom = "" ;
      AV37TFMADetCliNom_Sel = "" ;
      AV38TFMADetArtCod = "" ;
      AV39TFMADetArtCod_Sel = "" ;
      AV77TFMADetArtDsc = "" ;
      AV78TFMADetArtDsc_Sel = "" ;
      AV42TFMADetColNom = "" ;
      AV43TFMADetColNom_Sel = "" ;
      AV80TFMADetMatDsc = "" ;
      AV81TFMADetMatDsc_Sel = "" ;
      AV82TFMADetIntDsc = "" ;
      AV83TFMADetIntDsc_Sel = "" ;
      AV56TFMADetMaqCod = "" ;
      AV57TFMADetMaqCod_Sel = "" ;
      AV58TFMADetMaqDsc = "" ;
      AV59TFMADetMaqDsc_Sel = "" ;
      AV60TFMADetTipMCod = "" ;
      AV61TFMADetTipMCod_Sel = "" ;
      AV62TFMADetTipMDsc = "" ;
      AV63TFMADetTipMDsc_Sel = "" ;
      AV109TFMADetDefDsc = "" ;
      AV110TFMADetDefDsc_Sel = "" ;
      AV113TFMADetCatDsc = "" ;
      AV114TFMADetCatDsc_Sel = "" ;
      AV116TFMADetHdr = "" ;
      AV117TFMADetHdr_Sel = "" ;
      AV64TFMADetKilProd = DecimalUtil.ZERO ;
      AV65TFMADetKilProd_To = DecimalUtil.ZERO ;
      AV66TFMADetKilReo = DecimalUtil.ZERO ;
      AV67TFMADetKilReo_To = DecimalUtil.ZERO ;
      AV93TFMADetKilTot = DecimalUtil.ZERO ;
      AV94TFMADetKilTot_To = DecimalUtil.ZERO ;
      AV122TFMADetMetProd = DecimalUtil.ZERO ;
      AV123TFMADetMetProd_To = DecimalUtil.ZERO ;
      AV124TFMADetMetReo = DecimalUtil.ZERO ;
      AV125TFMADetMetReo_To = DecimalUtil.ZERO ;
      AV126TFMADetMetTot = DecimalUtil.ZERO ;
      AV127TFMADetMetTot_To = DecimalUtil.ZERO ;
      AV132Pgmname = "" ;
      AV87TotMADetKilProd = DecimalUtil.ZERO ;
      AV89TotMADetKilReo = DecimalUtil.ZERO ;
      AV120TotMADetKilTot = DecimalUtil.ZERO ;
      AV128TotMADetMetReo = DecimalUtil.ZERO ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      AV23ManageFiltersData = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      AV68DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      AV10GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV100ValorRecibidoVariable = "" ;
      AV99Variable = "" ;
      A14668MADetBarPa = "" ;
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
      bttBtneditcolumns_Jsonclick = "" ;
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucDdo_grid = new com.genexus.webpanels.GXUserControl();
      ucDdo_gridcolumnsselector = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      AV30DDO_MADetFecAuxDate = GXutil.nullDate() ;
      sXEvt = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV137Anticipacionerrores_mant_detalleds_1_filterfulltext = "" ;
      AV138Anticipacionerrores_mant_detalleds_2_tfmadetfec = GXutil.nullDate() ;
      AV139Anticipacionerrores_mant_detalleds_3_tfmadetemprcod = "" ;
      AV140Anticipacionerrores_mant_detalleds_4_tfmadetemprcod_sel = "" ;
      AV143Anticipacionerrores_mant_detalleds_7_tfmadetclinom = "" ;
      AV144Anticipacionerrores_mant_detalleds_8_tfmadetclinom_sel = "" ;
      AV145Anticipacionerrores_mant_detalleds_9_tfmadetartcod = "" ;
      AV146Anticipacionerrores_mant_detalleds_10_tfmadetartcod_sel = "" ;
      AV147Anticipacionerrores_mant_detalleds_11_tfmadetartdsc = "" ;
      AV148Anticipacionerrores_mant_detalleds_12_tfmadetartdsc_sel = "" ;
      AV151Anticipacionerrores_mant_detalleds_15_tfmadetcolnom = "" ;
      AV152Anticipacionerrores_mant_detalleds_16_tfmadetcolnom_sel = "" ;
      AV157Anticipacionerrores_mant_detalleds_21_tfmadetmatdsc = "" ;
      AV158Anticipacionerrores_mant_detalleds_22_tfmadetmatdsc_sel = "" ;
      AV161Anticipacionerrores_mant_detalleds_25_tfmadetintdsc = "" ;
      AV162Anticipacionerrores_mant_detalleds_26_tfmadetintdsc_sel = "" ;
      AV163Anticipacionerrores_mant_detalleds_27_tfmadetmaqcod = "" ;
      AV164Anticipacionerrores_mant_detalleds_28_tfmadetmaqcod_sel = "" ;
      AV165Anticipacionerrores_mant_detalleds_29_tfmadetmaqdsc = "" ;
      AV166Anticipacionerrores_mant_detalleds_30_tfmadetmaqdsc_sel = "" ;
      AV167Anticipacionerrores_mant_detalleds_31_tfmadettipmcod = "" ;
      AV168Anticipacionerrores_mant_detalleds_32_tfmadettipmcod_sel = "" ;
      AV169Anticipacionerrores_mant_detalleds_33_tfmadettipmdsc = "" ;
      AV170Anticipacionerrores_mant_detalleds_34_tfmadettipmdsc_sel = "" ;
      AV173Anticipacionerrores_mant_detalleds_37_tfmadetdefdsc = "" ;
      AV174Anticipacionerrores_mant_detalleds_38_tfmadetdefdsc_sel = "" ;
      AV177Anticipacionerrores_mant_detalleds_41_tfmadetcatdsc = "" ;
      AV178Anticipacionerrores_mant_detalleds_42_tfmadetcatdsc_sel = "" ;
      AV179Anticipacionerrores_mant_detalleds_43_tfmadethdr = "" ;
      AV180Anticipacionerrores_mant_detalleds_44_tfmadethdr_sel = "" ;
      AV181Anticipacionerrores_mant_detalleds_45_tfmadetkilprod = DecimalUtil.ZERO ;
      AV182Anticipacionerrores_mant_detalleds_46_tfmadetkilprod_to = DecimalUtil.ZERO ;
      AV183Anticipacionerrores_mant_detalleds_47_tfmadetkilreo = DecimalUtil.ZERO ;
      AV184Anticipacionerrores_mant_detalleds_48_tfmadetkilreo_to = DecimalUtil.ZERO ;
      AV185Anticipacionerrores_mant_detalleds_49_tfmadetkiltot = DecimalUtil.ZERO ;
      AV186Anticipacionerrores_mant_detalleds_50_tfmadetkiltot_to = DecimalUtil.ZERO ;
      AV187Anticipacionerrores_mant_detalleds_51_tfmadetmetprod = DecimalUtil.ZERO ;
      AV188Anticipacionerrores_mant_detalleds_52_tfmadetmetprod_to = DecimalUtil.ZERO ;
      AV189Anticipacionerrores_mant_detalleds_53_tfmadetmetreo = DecimalUtil.ZERO ;
      AV190Anticipacionerrores_mant_detalleds_54_tfmadetmetreo_to = DecimalUtil.ZERO ;
      AV191Anticipacionerrores_mant_detalleds_55_tfmadetmettot = DecimalUtil.ZERO ;
      AV192Anticipacionerrores_mant_detalleds_56_tfmadetmettot_to = DecimalUtil.ZERO ;
      A14586MADetFec = GXutil.nullDate() ;
      A14587MADetEmprC = "" ;
      A14651MADetCliNo = "" ;
      A14588MADetArtCo = "" ;
      A14652MADetArtDs = "" ;
      A14653MADetColNo = "" ;
      A14655MADetMatDs = "" ;
      A14660MADetIntDs = "" ;
      A14591MADetMaqCo = "" ;
      A14656MADetMaqDs = "" ;
      A14590MADetTipMC = "" ;
      A14657MADetTipMD = "" ;
      A14663MADetDefDs = "" ;
      A14665MADetCatDs = "" ;
      A14669MADetHdr = "" ;
      A14658MADetKilPr = DecimalUtil.ZERO ;
      A14659MADetKilRe = DecimalUtil.ZERO ;
      A14661MADetKilTo = DecimalUtil.ZERO ;
      A14670MADetMetPr = DecimalUtil.ZERO ;
      A14671MADetMetRe = DecimalUtil.ZERO ;
      A14672MADetMetTo = DecimalUtil.ZERO ;
      A14584MADetUsu = "" ;
      A14583MADetTkn = "" ;
      GXCCtl = "" ;
      scmdbuf = "" ;
      lV137Anticipacionerrores_mant_detalleds_1_filterfulltext = "" ;
      lV139Anticipacionerrores_mant_detalleds_3_tfmadetemprcod = "" ;
      lV143Anticipacionerrores_mant_detalleds_7_tfmadetclinom = "" ;
      lV145Anticipacionerrores_mant_detalleds_9_tfmadetartcod = "" ;
      lV147Anticipacionerrores_mant_detalleds_11_tfmadetartdsc = "" ;
      lV151Anticipacionerrores_mant_detalleds_15_tfmadetcolnom = "" ;
      lV157Anticipacionerrores_mant_detalleds_21_tfmadetmatdsc = "" ;
      lV161Anticipacionerrores_mant_detalleds_25_tfmadetintdsc = "" ;
      lV163Anticipacionerrores_mant_detalleds_27_tfmadetmaqcod = "" ;
      lV165Anticipacionerrores_mant_detalleds_29_tfmadetmaqdsc = "" ;
      lV167Anticipacionerrores_mant_detalleds_31_tfmadettipmcod = "" ;
      lV169Anticipacionerrores_mant_detalleds_33_tfmadettipmdsc = "" ;
      lV173Anticipacionerrores_mant_detalleds_37_tfmadetdefdsc = "" ;
      lV177Anticipacionerrores_mant_detalleds_41_tfmadetcatdsc = "" ;
      lV179Anticipacionerrores_mant_detalleds_43_tfmadethdr = "" ;
      H02DR2_A14583MADetTkn = new String[] {""} ;
      H02DR2_A14584MADetUsu = new String[] {""} ;
      H02DR2_A14672MADetMetTo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H02DR2_n14672MADetMetTo = new boolean[] {false} ;
      H02DR2_A14671MADetMetRe = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H02DR2_n14671MADetMetRe = new boolean[] {false} ;
      H02DR2_A14670MADetMetPr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H02DR2_n14670MADetMetPr = new boolean[] {false} ;
      H02DR2_A14661MADetKilTo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H02DR2_A14659MADetKilRe = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H02DR2_A14658MADetKilPr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H02DR2_n14658MADetKilPr = new boolean[] {false} ;
      H02DR2_A14665MADetCatDs = new String[] {""} ;
      H02DR2_n14665MADetCatDs = new boolean[] {false} ;
      H02DR2_A14664MADetCatCo = new short[1] ;
      H02DR2_n14664MADetCatCo = new boolean[] {false} ;
      H02DR2_A14663MADetDefDs = new String[] {""} ;
      H02DR2_n14663MADetDefDs = new boolean[] {false} ;
      H02DR2_A14662MADetDefCo = new short[1] ;
      H02DR2_n14662MADetDefCo = new boolean[] {false} ;
      H02DR2_A14657MADetTipMD = new String[] {""} ;
      H02DR2_n14657MADetTipMD = new boolean[] {false} ;
      H02DR2_A14590MADetTipMC = new String[] {""} ;
      H02DR2_A14656MADetMaqDs = new String[] {""} ;
      H02DR2_n14656MADetMaqDs = new boolean[] {false} ;
      H02DR2_A14591MADetMaqCo = new String[] {""} ;
      H02DR2_A14660MADetIntDs = new String[] {""} ;
      H02DR2_n14660MADetIntDs = new boolean[] {false} ;
      H02DR2_A14593MADetIntCo = new byte[1] ;
      H02DR2_A14655MADetMatDs = new String[] {""} ;
      H02DR2_n14655MADetMatDs = new boolean[] {false} ;
      H02DR2_A14592MADetMatCo = new short[1] ;
      H02DR2_A14654MADetColCo = new byte[1] ;
      H02DR2_A14653MADetColNo = new String[] {""} ;
      H02DR2_A14589MADetColNu = new int[1] ;
      H02DR2_A14652MADetArtDs = new String[] {""} ;
      H02DR2_n14652MADetArtDs = new boolean[] {false} ;
      H02DR2_A14588MADetArtCo = new String[] {""} ;
      H02DR2_A14651MADetCliNo = new String[] {""} ;
      H02DR2_n14651MADetCliNo = new boolean[] {false} ;
      H02DR2_A14585MADetCliCo = new int[1] ;
      H02DR2_A14587MADetEmprC = new String[] {""} ;
      H02DR2_A14586MADetFec = new java.util.Date[] {GXutil.nullDate()} ;
      H02DR2_A14582MADetId = new long[1] ;
      H02DR2_A14668MADetBarPa = new String[] {""} ;
      H02DR2_A14667MADetBarRe = new byte[1] ;
      H02DR2_A14666MADetBarCo = new int[1] ;
      H02DR3_AGRID_nRecordCount = new long[1] ;
      AV86TotValueMADetFec = "" ;
      AV88TotValueMADetKilProd = "" ;
      AV90TotValueMADetKilReo = "" ;
      AV121TotValueMADetKilTot = "" ;
      AV129TotValueMADetMetReo = "" ;
      hsh = "" ;
      AV92WebSession = httpContext.getWebSession();
      AV133Station = "" ;
      AV134Emprcod = "" ;
      AV135Emprnom = "" ;
      AV136Usurcod = "" ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV6WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext7 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV22Session = httpContext.getWebSession();
      AV18ColumnsSelectorXML = "" ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV24ManageFiltersXml = "" ;
      AV16ExcelFilename = "" ;
      AV17ErrorMessage = "" ;
      AV19UserCustomValue = "" ;
      AV21ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector8 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector9 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11 = new GXBaseCollection[1] ;
      AV11GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
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
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      GXv_SdtWWPGridState36 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      AV8TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV7HTTPRequest = httpContext.getHttpRequest();
      H02DR4_A14582MADetId = new long[1] ;
      H02DR4_A14583MADetTkn = new String[] {""} ;
      H02DR4_A14584MADetUsu = new String[] {""} ;
      H02DR4_A14672MADetMetTo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H02DR4_n14672MADetMetTo = new boolean[] {false} ;
      H02DR4_A14671MADetMetRe = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H02DR4_n14671MADetMetRe = new boolean[] {false} ;
      H02DR4_A14670MADetMetPr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H02DR4_n14670MADetMetPr = new boolean[] {false} ;
      H02DR4_A14661MADetKilTo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H02DR4_A14659MADetKilRe = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H02DR4_A14658MADetKilPr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H02DR4_n14658MADetKilPr = new boolean[] {false} ;
      H02DR4_A14665MADetCatDs = new String[] {""} ;
      H02DR4_n14665MADetCatDs = new boolean[] {false} ;
      H02DR4_A14664MADetCatCo = new short[1] ;
      H02DR4_n14664MADetCatCo = new boolean[] {false} ;
      H02DR4_A14663MADetDefDs = new String[] {""} ;
      H02DR4_n14663MADetDefDs = new boolean[] {false} ;
      H02DR4_A14662MADetDefCo = new short[1] ;
      H02DR4_n14662MADetDefCo = new boolean[] {false} ;
      H02DR4_A14657MADetTipMD = new String[] {""} ;
      H02DR4_n14657MADetTipMD = new boolean[] {false} ;
      H02DR4_A14590MADetTipMC = new String[] {""} ;
      H02DR4_A14656MADetMaqDs = new String[] {""} ;
      H02DR4_n14656MADetMaqDs = new boolean[] {false} ;
      H02DR4_A14591MADetMaqCo = new String[] {""} ;
      H02DR4_A14660MADetIntDs = new String[] {""} ;
      H02DR4_n14660MADetIntDs = new boolean[] {false} ;
      H02DR4_A14593MADetIntCo = new byte[1] ;
      H02DR4_A14655MADetMatDs = new String[] {""} ;
      H02DR4_n14655MADetMatDs = new boolean[] {false} ;
      H02DR4_A14592MADetMatCo = new short[1] ;
      H02DR4_A14654MADetColCo = new byte[1] ;
      H02DR4_A14653MADetColNo = new String[] {""} ;
      H02DR4_A14589MADetColNu = new int[1] ;
      H02DR4_A14652MADetArtDs = new String[] {""} ;
      H02DR4_n14652MADetArtDs = new boolean[] {false} ;
      H02DR4_A14588MADetArtCo = new String[] {""} ;
      H02DR4_A14651MADetCliNo = new String[] {""} ;
      H02DR4_n14651MADetCliNo = new boolean[] {false} ;
      H02DR4_A14585MADetCliCo = new int[1] ;
      H02DR4_A14587MADetEmprC = new String[] {""} ;
      H02DR4_A14586MADetFec = new java.util.Date[] {GXutil.nullDate()} ;
      H02DR4_A14668MADetBarPa = new String[] {""} ;
      H02DR4_A14667MADetBarRe = new byte[1] ;
      H02DR4_A14666MADetBarCo = new int[1] ;
      AV101sdtParametros = new app.anticipacionerrores.SdtsdtParametros(remoteHandle, context);
      AV102TipMaqCodS = new GXSimpleCollection<String>(String.class, "internal", "");
      ucDdo_managefilters = new com.genexus.webpanels.GXUserControl();
      Ddo_managefilters_Caption = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlAV70MADetEmprCod = "" ;
      sCtrlAV71CliCod = "" ;
      sCtrlAV72ArtCod = "" ;
      sCtrlAV73ForColNum = "" ;
      sCtrlAV74TipMaqCodJSON = "" ;
      sCtrlAV75FechaInicio = "" ;
      sCtrlAV76FechaFin = "" ;
      sCtrlAV115MADetMaqCod = "" ;
      sCtrlAV103MADetDefCod = "" ;
      sCtrlAV104MADetCatCod = "" ;
      sCtrlAV105MTknUsu = "" ;
      sCtrlAV106MTkn = "" ;
      subGrid_Linesclass = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.anticipacionerrores.mant_detalle__default(),
         new Object[] {
             new Object[] {
            H02DR2_A14583MADetTkn, H02DR2_A14584MADetUsu, H02DR2_A14672MADetMetTo, H02DR2_n14672MADetMetTo, H02DR2_A14671MADetMetRe, H02DR2_n14671MADetMetRe, H02DR2_A14670MADetMetPr, H02DR2_n14670MADetMetPr, H02DR2_A14661MADetKilTo, H02DR2_A14659MADetKilRe,
            H02DR2_A14658MADetKilPr, H02DR2_n14658MADetKilPr, H02DR2_A14665MADetCatDs, H02DR2_n14665MADetCatDs, H02DR2_A14664MADetCatCo, H02DR2_n14664MADetCatCo, H02DR2_A14663MADetDefDs, H02DR2_n14663MADetDefDs, H02DR2_A14662MADetDefCo, H02DR2_n14662MADetDefCo,
            H02DR2_A14657MADetTipMD, H02DR2_n14657MADetTipMD, H02DR2_A14590MADetTipMC, H02DR2_A14656MADetMaqDs, H02DR2_n14656MADetMaqDs, H02DR2_A14591MADetMaqCo, H02DR2_A14660MADetIntDs, H02DR2_n14660MADetIntDs, H02DR2_A14593MADetIntCo, H02DR2_A14655MADetMatDs,
            H02DR2_n14655MADetMatDs, H02DR2_A14592MADetMatCo, H02DR2_A14654MADetColCo, H02DR2_A14653MADetColNo, H02DR2_A14589MADetColNu, H02DR2_A14652MADetArtDs, H02DR2_n14652MADetArtDs, H02DR2_A14588MADetArtCo, H02DR2_A14651MADetCliNo, H02DR2_n14651MADetCliNo,
            H02DR2_A14585MADetCliCo, H02DR2_A14587MADetEmprC, H02DR2_A14586MADetFec, H02DR2_A14582MADetId, H02DR2_A14668MADetBarPa, H02DR2_A14667MADetBarRe, H02DR2_A14666MADetBarCo
            }
            , new Object[] {
            H02DR3_AGRID_nRecordCount
            }
            , new Object[] {
            H02DR4_A14582MADetId, H02DR4_A14583MADetTkn, H02DR4_A14584MADetUsu, H02DR4_A14672MADetMetTo, H02DR4_n14672MADetMetTo, H02DR4_A14671MADetMetRe, H02DR4_n14671MADetMetRe, H02DR4_A14670MADetMetPr, H02DR4_n14670MADetMetPr, H02DR4_A14661MADetKilTo,
            H02DR4_A14659MADetKilRe, H02DR4_A14658MADetKilPr, H02DR4_n14658MADetKilPr, H02DR4_A14665MADetCatDs, H02DR4_n14665MADetCatDs, H02DR4_A14664MADetCatCo, H02DR4_n14664MADetCatCo, H02DR4_A14663MADetDefDs, H02DR4_n14663MADetDefDs, H02DR4_A14662MADetDefCo,
            H02DR4_n14662MADetDefCo, H02DR4_A14657MADetTipMD, H02DR4_n14657MADetTipMD, H02DR4_A14590MADetTipMC, H02DR4_A14656MADetMaqDs, H02DR4_n14656MADetMaqDs, H02DR4_A14591MADetMaqCo, H02DR4_A14660MADetIntDs, H02DR4_n14660MADetIntDs, H02DR4_A14593MADetIntCo,
            H02DR4_A14655MADetMatDs, H02DR4_n14655MADetMatDs, H02DR4_A14592MADetMatCo, H02DR4_A14654MADetColCo, H02DR4_A14653MADetColNo, H02DR4_A14589MADetColNu, H02DR4_A14652MADetArtDs, H02DR4_n14652MADetArtDs, H02DR4_A14588MADetArtCo, H02DR4_A14651MADetCliNo,
            H02DR4_n14651MADetCliNo, H02DR4_A14585MADetCliCo, H02DR4_A14587MADetEmprC, H02DR4_A14586MADetFec, H02DR4_A14668MADetBarPa, H02DR4_A14667MADetBarRe, H02DR4_A14666MADetBarCo
            }
         }
      );
      AV132Pgmname = "AnticipacionErrores.MAnt_Detalle" ;
      /* GeneXus formulas. */
      AV132Pgmname = "AnticipacionErrores.MAnt_Detalle" ;
      Gx_err = (short)(0) ;
      edtavTotvaluemadetfec_Enabled = 0 ;
      edtavTotvaluemadetkilprod_Enabled = 0 ;
      edtavTotvaluemadetkilreo_Enabled = 0 ;
      edtavTotvaluemadetkiltot_Enabled = 0 ;
      edtavTotvaluemadetmetreo_Enabled = 0 ;
      edtavPgmname_Enabled = 0 ;
   }

   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDynComponent ;
   private byte AV25ManageFiltersExecutionStep ;
   private byte AV46TFMADetColCod ;
   private byte AV47TFMADetColCod_To ;
   private byte AV52TFMADetIntCod ;
   private byte AV53TFMADetIntCod_To ;
   private byte A14667MADetBarRe ;
   private byte nDraw ;
   private byte nDoneStart ;
   private byte AV153Anticipacionerrores_mant_detalleds_17_tfmadetcolcod ;
   private byte AV154Anticipacionerrores_mant_detalleds_18_tfmadetcolcod_to ;
   private byte AV159Anticipacionerrores_mant_detalleds_23_tfmadetintcod ;
   private byte AV160Anticipacionerrores_mant_detalleds_24_tfmadetintcod_to ;
   private byte A14654MADetColCo ;
   private byte A14593MADetIntCo ;
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
   private short wcpOAV103MADetDefCod ;
   private short wcpOAV104MADetCatCod ;
   private short nRcdExists_3 ;
   private short nIsMod_3 ;
   private short AV103MADetDefCod ;
   private short AV104MADetCatCod ;
   private short AV48TFMADetMatCod ;
   private short AV49TFMADetMatCod_To ;
   private short AV107TFMADetDefCod ;
   private short AV108TFMADetDefCod_To ;
   private short AV111TFMADetCatCod ;
   private short AV112TFMADetCatCod_To ;
   private short AV12OrderedBy ;
   private short wbEnd ;
   private short wbStart ;
   private short AV155Anticipacionerrores_mant_detalleds_19_tfmadetmatcod ;
   private short AV156Anticipacionerrores_mant_detalleds_20_tfmadetmatcod_to ;
   private short AV171Anticipacionerrores_mant_detalleds_35_tfmadetdefcod ;
   private short AV172Anticipacionerrores_mant_detalleds_36_tfmadetdefcod_to ;
   private short AV175Anticipacionerrores_mant_detalleds_39_tfmadetcatcod ;
   private short AV176Anticipacionerrores_mant_detalleds_40_tfmadetcatcod_to ;
   private short A14592MADetMatCo ;
   private short A14662MADetDefCo ;
   private short A14664MADetCatCo ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int wcpOAV71CliCod ;
   private int wcpOAV73ForColNum ;
   private int nRC_GXsfl_39 ;
   private int AV71CliCod ;
   private int AV73ForColNum ;
   private int subGrid_Rows ;
   private int nGXsfl_39_idx=1 ;
   private int AV34TFMADetCliCod ;
   private int AV35TFMADetCliCod_To ;
   private int AV44TFMADetColNum ;
   private int AV45TFMADetColNum_To ;
   private int A14666MADetBarCo ;
   private int edtavPgmname_Enabled ;
   private int AV141Anticipacionerrores_mant_detalleds_5_tfmadetclicod ;
   private int AV142Anticipacionerrores_mant_detalleds_6_tfmadetclicod_to ;
   private int AV149Anticipacionerrores_mant_detalleds_13_tfmadetcolnum ;
   private int AV150Anticipacionerrores_mant_detalleds_14_tfmadetcolnum_to ;
   private int A14585MADetCliCo ;
   private int A14589MADetColNu ;
   private int subGrid_Islastpage ;
   private int edtavTotvaluemadetfec_Enabled ;
   private int edtavTotvaluemadetkilprod_Enabled ;
   private int edtavTotvaluemadetkilreo_Enabled ;
   private int edtavTotvaluemadetkiltot_Enabled ;
   private int edtavTotvaluemadetmetreo_Enabled ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private int AV79TipMaqCodCollection_size ;
   private int edtMADetFec_Visible ;
   private int edtMADetEmprC_Visible ;
   private int edtMADetCliCo_Visible ;
   private int edtMADetCliNo_Visible ;
   private int edtMADetArtCo_Visible ;
   private int edtMADetArtDs_Visible ;
   private int edtMADetColNu_Visible ;
   private int edtMADetColNo_Visible ;
   private int edtMADetColCo_Visible ;
   private int edtMADetMatCo_Visible ;
   private int edtMADetMatDs_Visible ;
   private int edtMADetIntCo_Visible ;
   private int edtMADetIntDs_Visible ;
   private int edtMADetMaqCo_Visible ;
   private int edtMADetMaqDs_Visible ;
   private int edtMADetTipMC_Visible ;
   private int edtMADetTipMD_Visible ;
   private int edtMADetDefCo_Visible ;
   private int edtMADetDefDs_Visible ;
   private int edtMADetCatCo_Visible ;
   private int edtMADetCatDs_Visible ;
   private int edtMADetHdr_Visible ;
   private int edtMADetKilPr_Visible ;
   private int edtMADetKilRe_Visible ;
   private int edtMADetKilTo_Visible ;
   private int edtMADetMetPr_Visible ;
   private int edtMADetMetRe_Visible ;
   private int edtMADetMetTo_Visible ;
   private int AV193GXV1 ;
   private int edtavFilterfulltext_Enabled ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long A14582MADetId ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private long AV85TotMADetFec ;
   private java.math.BigDecimal AV64TFMADetKilProd ;
   private java.math.BigDecimal AV65TFMADetKilProd_To ;
   private java.math.BigDecimal AV66TFMADetKilReo ;
   private java.math.BigDecimal AV67TFMADetKilReo_To ;
   private java.math.BigDecimal AV93TFMADetKilTot ;
   private java.math.BigDecimal AV94TFMADetKilTot_To ;
   private java.math.BigDecimal AV122TFMADetMetProd ;
   private java.math.BigDecimal AV123TFMADetMetProd_To ;
   private java.math.BigDecimal AV124TFMADetMetReo ;
   private java.math.BigDecimal AV125TFMADetMetReo_To ;
   private java.math.BigDecimal AV126TFMADetMetTot ;
   private java.math.BigDecimal AV127TFMADetMetTot_To ;
   private java.math.BigDecimal AV87TotMADetKilProd ;
   private java.math.BigDecimal AV89TotMADetKilReo ;
   private java.math.BigDecimal AV120TotMADetKilTot ;
   private java.math.BigDecimal AV128TotMADetMetReo ;
   private java.math.BigDecimal AV181Anticipacionerrores_mant_detalleds_45_tfmadetkilprod ;
   private java.math.BigDecimal AV182Anticipacionerrores_mant_detalleds_46_tfmadetkilprod_to ;
   private java.math.BigDecimal AV183Anticipacionerrores_mant_detalleds_47_tfmadetkilreo ;
   private java.math.BigDecimal AV184Anticipacionerrores_mant_detalleds_48_tfmadetkilreo_to ;
   private java.math.BigDecimal AV185Anticipacionerrores_mant_detalleds_49_tfmadetkiltot ;
   private java.math.BigDecimal AV186Anticipacionerrores_mant_detalleds_50_tfmadetkiltot_to ;
   private java.math.BigDecimal AV187Anticipacionerrores_mant_detalleds_51_tfmadetmetprod ;
   private java.math.BigDecimal AV188Anticipacionerrores_mant_detalleds_52_tfmadetmetprod_to ;
   private java.math.BigDecimal AV189Anticipacionerrores_mant_detalleds_53_tfmadetmetreo ;
   private java.math.BigDecimal AV190Anticipacionerrores_mant_detalleds_54_tfmadetmetreo_to ;
   private java.math.BigDecimal AV191Anticipacionerrores_mant_detalleds_55_tfmadetmettot ;
   private java.math.BigDecimal AV192Anticipacionerrores_mant_detalleds_56_tfmadetmettot_to ;
   private java.math.BigDecimal A14658MADetKilPr ;
   private java.math.BigDecimal A14659MADetKilRe ;
   private java.math.BigDecimal A14661MADetKilTo ;
   private java.math.BigDecimal A14670MADetMetPr ;
   private java.math.BigDecimal A14671MADetMetRe ;
   private java.math.BigDecimal A14672MADetMetTo ;
   private String wcpOAV70MADetEmprCod ;
   private String wcpOAV72ArtCod ;
   private String wcpOAV115MADetMaqCod ;
   private String wcpOAV105MTknUsu ;
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
   private String AV70MADetEmprCod ;
   private String AV72ArtCod ;
   private String AV115MADetMaqCod ;
   private String AV105MTknUsu ;
   private String sGXsfl_39_idx="0001" ;
   private String AV32TFMADetEmprCod ;
   private String AV33TFMADetEmprCod_Sel ;
   private String AV38TFMADetArtCod ;
   private String AV39TFMADetArtCod_Sel ;
   private String AV42TFMADetColNom ;
   private String AV43TFMADetColNom_Sel ;
   private String AV56TFMADetMaqCod ;
   private String AV57TFMADetMaqCod_Sel ;
   private String AV60TFMADetTipMCod ;
   private String AV61TFMADetTipMCod_Sel ;
   private String AV116TFMADetHdr ;
   private String AV117TFMADetHdr_Sel ;
   private String AV132Pgmname ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String A14668MADetBarPa ;
   private String Ddo_managefilters_Icontype ;
   private String Ddo_managefilters_Icon ;
   private String Ddo_managefilters_Tooltip ;
   private String Ddo_managefilters_Cls ;
   private String Dvpanel_tableheader_Width ;
   private String Dvpanel_tableheader_Cls ;
   private String Dvpanel_tableheader_Title ;
   private String Dvpanel_tableheader_Iconposition ;
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
   private String Grid_empowerer_Infinitescrolling ;
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
   private String bttBtneditcolumns_Internalname ;
   private String bttBtneditcolumns_Jsonclick ;
   private String divGridtablewithtotalizers_Internalname ;
   private String sStyleString ;
   private String subGrid_Internalname ;
   private String edtavPgmname_Internalname ;
   private String edtavPgmname_Jsonclick ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String Ddo_grid_Internalname ;
   private String Ddo_gridcolumnsselector_Internalname ;
   private String Grid_empowerer_Internalname ;
   private String divDdo_madetfecauxdates_Internalname ;
   private String edtavDdo_madetfecauxdate_Internalname ;
   private String edtavDdo_madetfecauxdate_Jsonclick ;
   private String sXEvt ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtavFilterfulltext_Internalname ;
   private String AV139Anticipacionerrores_mant_detalleds_3_tfmadetemprcod ;
   private String AV140Anticipacionerrores_mant_detalleds_4_tfmadetemprcod_sel ;
   private String AV145Anticipacionerrores_mant_detalleds_9_tfmadetartcod ;
   private String AV146Anticipacionerrores_mant_detalleds_10_tfmadetartcod_sel ;
   private String AV151Anticipacionerrores_mant_detalleds_15_tfmadetcolnom ;
   private String AV152Anticipacionerrores_mant_detalleds_16_tfmadetcolnom_sel ;
   private String AV163Anticipacionerrores_mant_detalleds_27_tfmadetmaqcod ;
   private String AV164Anticipacionerrores_mant_detalleds_28_tfmadetmaqcod_sel ;
   private String AV167Anticipacionerrores_mant_detalleds_31_tfmadettipmcod ;
   private String AV168Anticipacionerrores_mant_detalleds_32_tfmadettipmcod_sel ;
   private String AV179Anticipacionerrores_mant_detalleds_43_tfmadethdr ;
   private String AV180Anticipacionerrores_mant_detalleds_44_tfmadethdr_sel ;
   private String edtMADetId_Internalname ;
   private String edtMADetFec_Internalname ;
   private String A14587MADetEmprC ;
   private String edtMADetEmprC_Internalname ;
   private String edtMADetCliCo_Internalname ;
   private String edtMADetCliNo_Internalname ;
   private String A14588MADetArtCo ;
   private String edtMADetArtCo_Internalname ;
   private String edtMADetArtDs_Internalname ;
   private String edtMADetColNu_Internalname ;
   private String A14653MADetColNo ;
   private String edtMADetColNo_Internalname ;
   private String edtMADetColCo_Internalname ;
   private String edtMADetMatCo_Internalname ;
   private String edtMADetMatDs_Internalname ;
   private String edtMADetIntCo_Internalname ;
   private String edtMADetIntDs_Internalname ;
   private String A14591MADetMaqCo ;
   private String edtMADetMaqCo_Internalname ;
   private String edtMADetMaqDs_Internalname ;
   private String A14590MADetTipMC ;
   private String edtMADetTipMC_Internalname ;
   private String edtMADetTipMD_Internalname ;
   private String edtMADetDefCo_Internalname ;
   private String edtMADetDefDs_Internalname ;
   private String edtMADetCatCo_Internalname ;
   private String edtMADetCatDs_Internalname ;
   private String A14669MADetHdr ;
   private String edtMADetHdr_Internalname ;
   private String edtMADetKilPr_Internalname ;
   private String edtMADetKilRe_Internalname ;
   private String edtMADetKilTo_Internalname ;
   private String edtMADetMetPr_Internalname ;
   private String edtMADetMetRe_Internalname ;
   private String edtMADetMetTo_Internalname ;
   private String A14584MADetUsu ;
   private String edtMADetUsu_Internalname ;
   private String edtMADetTkn_Internalname ;
   private String GXCCtl ;
   private String edtavTotvaluemadetfec_Internalname ;
   private String edtavTotvaluemadetkilprod_Internalname ;
   private String edtavTotvaluemadetkilreo_Internalname ;
   private String edtavTotvaluemadetkiltot_Internalname ;
   private String edtavTotvaluemadetmetreo_Internalname ;
   private String AV91sdtMTok_getgxTv_SdtsdtMTok_Mtknusu ;
   private String scmdbuf ;
   private String lV139Anticipacionerrores_mant_detalleds_3_tfmadetemprcod ;
   private String lV145Anticipacionerrores_mant_detalleds_9_tfmadetartcod ;
   private String lV151Anticipacionerrores_mant_detalleds_15_tfmadetcolnom ;
   private String lV163Anticipacionerrores_mant_detalleds_27_tfmadetmaqcod ;
   private String lV167Anticipacionerrores_mant_detalleds_31_tfmadettipmcod ;
   private String lV179Anticipacionerrores_mant_detalleds_43_tfmadethdr ;
   private String hsh ;
   private String AV133Station ;
   private String AV134Emprcod ;
   private String AV135Emprnom ;
   private String AV136Usurcod ;
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
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String tblGridtabletotalizer_Internalname ;
   private String edtavTotvaluemadetfec_Jsonclick ;
   private String edtavTotvaluemadetkilprod_Jsonclick ;
   private String edtavTotvaluemadetkilreo_Jsonclick ;
   private String edtavTotvaluemadetkiltot_Jsonclick ;
   private String edtavTotvaluemadetmetreo_Jsonclick ;
   private String tblTablerightheader_Internalname ;
   private String Ddo_managefilters_Caption ;
   private String Ddo_managefilters_Internalname ;
   private String tblTablefilters_Internalname ;
   private String edtavFilterfulltext_Jsonclick ;
   private String sCtrlAV70MADetEmprCod ;
   private String sCtrlAV71CliCod ;
   private String sCtrlAV72ArtCod ;
   private String sCtrlAV73ForColNum ;
   private String sCtrlAV74TipMaqCodJSON ;
   private String sCtrlAV75FechaInicio ;
   private String sCtrlAV76FechaFin ;
   private String sCtrlAV115MADetMaqCod ;
   private String sCtrlAV103MADetDefCod ;
   private String sCtrlAV104MADetCatCod ;
   private String sCtrlAV105MTknUsu ;
   private String sCtrlAV106MTkn ;
   private String sGXsfl_39_fel_idx="0001" ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String ROClassString ;
   private String edtMADetId_Jsonclick ;
   private String edtMADetFec_Jsonclick ;
   private String edtMADetEmprC_Jsonclick ;
   private String edtMADetCliCo_Jsonclick ;
   private String edtMADetCliNo_Jsonclick ;
   private String edtMADetArtCo_Jsonclick ;
   private String edtMADetArtDs_Jsonclick ;
   private String edtMADetColNu_Jsonclick ;
   private String edtMADetColNo_Jsonclick ;
   private String edtMADetColCo_Jsonclick ;
   private String edtMADetMatCo_Jsonclick ;
   private String edtMADetMatDs_Jsonclick ;
   private String edtMADetIntCo_Jsonclick ;
   private String edtMADetIntDs_Jsonclick ;
   private String edtMADetMaqCo_Jsonclick ;
   private String edtMADetMaqDs_Jsonclick ;
   private String edtMADetTipMC_Jsonclick ;
   private String edtMADetTipMD_Jsonclick ;
   private String edtMADetDefCo_Jsonclick ;
   private String edtMADetDefDs_Jsonclick ;
   private String edtMADetCatCo_Jsonclick ;
   private String edtMADetCatDs_Jsonclick ;
   private String edtMADetHdr_Jsonclick ;
   private String edtMADetKilPr_Jsonclick ;
   private String edtMADetKilRe_Jsonclick ;
   private String edtMADetKilTo_Jsonclick ;
   private String edtMADetMetPr_Jsonclick ;
   private String edtMADetMetRe_Jsonclick ;
   private String edtMADetMetTo_Jsonclick ;
   private String edtMADetUsu_Jsonclick ;
   private String edtMADetTkn_Jsonclick ;
   private String subGrid_Header ;
   private java.util.Date wcpOAV75FechaInicio ;
   private java.util.Date wcpOAV76FechaFin ;
   private java.util.Date AV75FechaInicio ;
   private java.util.Date AV76FechaFin ;
   private java.util.Date AV28TFMADetFec ;
   private java.util.Date AV30DDO_MADetFecAuxDate ;
   private java.util.Date AV138Anticipacionerrores_mant_detalleds_2_tfmadetfec ;
   private java.util.Date A14586MADetFec ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean AV13OrderedDsc ;
   private boolean Dvpanel_tableheader_Autowidth ;
   private boolean Dvpanel_tableheader_Autoheight ;
   private boolean Dvpanel_tableheader_Collapsible ;
   private boolean Dvpanel_tableheader_Collapsed ;
   private boolean Dvpanel_tableheader_Showcollapseicon ;
   private boolean Dvpanel_tableheader_Autoscroll ;
   private boolean Grid_empowerer_Hastitlesettings ;
   private boolean Grid_empowerer_Hascolumnsselector ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean n14651MADetCliNo ;
   private boolean n14652MADetArtDs ;
   private boolean n14655MADetMatDs ;
   private boolean n14660MADetIntDs ;
   private boolean n14656MADetMaqDs ;
   private boolean n14657MADetTipMD ;
   private boolean n14662MADetDefCo ;
   private boolean n14663MADetDefDs ;
   private boolean n14664MADetCatCo ;
   private boolean n14665MADetCatDs ;
   private boolean n14658MADetKilPr ;
   private boolean n14670MADetMetPr ;
   private boolean n14671MADetMetRe ;
   private boolean n14672MADetMetTo ;
   private boolean bGXsfl_39_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private String AV18ColumnsSelectorXML ;
   private String AV24ManageFiltersXml ;
   private String AV19UserCustomValue ;
   private String wcpOAV74TipMaqCodJSON ;
   private String wcpOAV106MTkn ;
   private String AV74TipMaqCodJSON ;
   private String AV106MTkn ;
   private String AV15FilterFullText ;
   private String AV36TFMADetCliNom ;
   private String AV37TFMADetCliNom_Sel ;
   private String AV77TFMADetArtDsc ;
   private String AV78TFMADetArtDsc_Sel ;
   private String AV80TFMADetMatDsc ;
   private String AV81TFMADetMatDsc_Sel ;
   private String AV82TFMADetIntDsc ;
   private String AV83TFMADetIntDsc_Sel ;
   private String AV58TFMADetMaqDsc ;
   private String AV59TFMADetMaqDsc_Sel ;
   private String AV62TFMADetTipMDsc ;
   private String AV63TFMADetTipMDsc_Sel ;
   private String AV109TFMADetDefDsc ;
   private String AV110TFMADetDefDsc_Sel ;
   private String AV113TFMADetCatDsc ;
   private String AV114TFMADetCatDsc_Sel ;
   private String AV100ValorRecibidoVariable ;
   private String AV99Variable ;
   private String AV137Anticipacionerrores_mant_detalleds_1_filterfulltext ;
   private String AV143Anticipacionerrores_mant_detalleds_7_tfmadetclinom ;
   private String AV144Anticipacionerrores_mant_detalleds_8_tfmadetclinom_sel ;
   private String AV147Anticipacionerrores_mant_detalleds_11_tfmadetartdsc ;
   private String AV148Anticipacionerrores_mant_detalleds_12_tfmadetartdsc_sel ;
   private String AV157Anticipacionerrores_mant_detalleds_21_tfmadetmatdsc ;
   private String AV158Anticipacionerrores_mant_detalleds_22_tfmadetmatdsc_sel ;
   private String AV161Anticipacionerrores_mant_detalleds_25_tfmadetintdsc ;
   private String AV162Anticipacionerrores_mant_detalleds_26_tfmadetintdsc_sel ;
   private String AV165Anticipacionerrores_mant_detalleds_29_tfmadetmaqdsc ;
   private String AV166Anticipacionerrores_mant_detalleds_30_tfmadetmaqdsc_sel ;
   private String AV169Anticipacionerrores_mant_detalleds_33_tfmadettipmdsc ;
   private String AV170Anticipacionerrores_mant_detalleds_34_tfmadettipmdsc_sel ;
   private String AV173Anticipacionerrores_mant_detalleds_37_tfmadetdefdsc ;
   private String AV174Anticipacionerrores_mant_detalleds_38_tfmadetdefdsc_sel ;
   private String AV177Anticipacionerrores_mant_detalleds_41_tfmadetcatdsc ;
   private String AV178Anticipacionerrores_mant_detalleds_42_tfmadetcatdsc_sel ;
   private String A14651MADetCliNo ;
   private String A14652MADetArtDs ;
   private String A14655MADetMatDs ;
   private String A14660MADetIntDs ;
   private String A14656MADetMaqDs ;
   private String A14657MADetTipMD ;
   private String A14663MADetDefDs ;
   private String A14665MADetCatDs ;
   private String A14583MADetTkn ;
   private String AV91sdtMTok_getgxTv_SdtsdtMTok_Mtkn ;
   private String lV137Anticipacionerrores_mant_detalleds_1_filterfulltext ;
   private String lV143Anticipacionerrores_mant_detalleds_7_tfmadetclinom ;
   private String lV147Anticipacionerrores_mant_detalleds_11_tfmadetartdsc ;
   private String lV157Anticipacionerrores_mant_detalleds_21_tfmadetmatdsc ;
   private String lV161Anticipacionerrores_mant_detalleds_25_tfmadetintdsc ;
   private String lV165Anticipacionerrores_mant_detalleds_29_tfmadetmaqdsc ;
   private String lV169Anticipacionerrores_mant_detalleds_33_tfmadettipmdsc ;
   private String lV173Anticipacionerrores_mant_detalleds_37_tfmadetdefdsc ;
   private String lV177Anticipacionerrores_mant_detalleds_41_tfmadetcatdsc ;
   private String AV86TotValueMADetFec ;
   private String AV88TotValueMADetKilProd ;
   private String AV90TotValueMADetKilReo ;
   private String AV121TotValueMADetKilTot ;
   private String AV129TotValueMADetMetReo ;
   private String AV16ExcelFilename ;
   private String AV17ErrorMessage ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV7HTTPRequest ;
   private com.genexus.webpanels.WebSession AV92WebSession ;
   private com.genexus.webpanels.WebSession AV22Session ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableheader ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucDdo_gridcolumnsselector ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.webpanels.GXUserControl ucDdo_managefilters ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private IDataStoreProvider pr_default ;
   private String[] H02DR2_A14583MADetTkn ;
   private String[] H02DR2_A14584MADetUsu ;
   private java.math.BigDecimal[] H02DR2_A14672MADetMetTo ;
   private boolean[] H02DR2_n14672MADetMetTo ;
   private java.math.BigDecimal[] H02DR2_A14671MADetMetRe ;
   private boolean[] H02DR2_n14671MADetMetRe ;
   private java.math.BigDecimal[] H02DR2_A14670MADetMetPr ;
   private boolean[] H02DR2_n14670MADetMetPr ;
   private java.math.BigDecimal[] H02DR2_A14661MADetKilTo ;
   private java.math.BigDecimal[] H02DR2_A14659MADetKilRe ;
   private java.math.BigDecimal[] H02DR2_A14658MADetKilPr ;
   private boolean[] H02DR2_n14658MADetKilPr ;
   private String[] H02DR2_A14665MADetCatDs ;
   private boolean[] H02DR2_n14665MADetCatDs ;
   private short[] H02DR2_A14664MADetCatCo ;
   private boolean[] H02DR2_n14664MADetCatCo ;
   private String[] H02DR2_A14663MADetDefDs ;
   private boolean[] H02DR2_n14663MADetDefDs ;
   private short[] H02DR2_A14662MADetDefCo ;
   private boolean[] H02DR2_n14662MADetDefCo ;
   private String[] H02DR2_A14657MADetTipMD ;
   private boolean[] H02DR2_n14657MADetTipMD ;
   private String[] H02DR2_A14590MADetTipMC ;
   private String[] H02DR2_A14656MADetMaqDs ;
   private boolean[] H02DR2_n14656MADetMaqDs ;
   private String[] H02DR2_A14591MADetMaqCo ;
   private String[] H02DR2_A14660MADetIntDs ;
   private boolean[] H02DR2_n14660MADetIntDs ;
   private byte[] H02DR2_A14593MADetIntCo ;
   private String[] H02DR2_A14655MADetMatDs ;
   private boolean[] H02DR2_n14655MADetMatDs ;
   private short[] H02DR2_A14592MADetMatCo ;
   private byte[] H02DR2_A14654MADetColCo ;
   private String[] H02DR2_A14653MADetColNo ;
   private int[] H02DR2_A14589MADetColNu ;
   private String[] H02DR2_A14652MADetArtDs ;
   private boolean[] H02DR2_n14652MADetArtDs ;
   private String[] H02DR2_A14588MADetArtCo ;
   private String[] H02DR2_A14651MADetCliNo ;
   private boolean[] H02DR2_n14651MADetCliNo ;
   private int[] H02DR2_A14585MADetCliCo ;
   private String[] H02DR2_A14587MADetEmprC ;
   private java.util.Date[] H02DR2_A14586MADetFec ;
   private long[] H02DR2_A14582MADetId ;
   private String[] H02DR2_A14668MADetBarPa ;
   private byte[] H02DR2_A14667MADetBarRe ;
   private int[] H02DR2_A14666MADetBarCo ;
   private long[] H02DR3_AGRID_nRecordCount ;
   private long[] H02DR4_A14582MADetId ;
   private String[] H02DR4_A14583MADetTkn ;
   private String[] H02DR4_A14584MADetUsu ;
   private java.math.BigDecimal[] H02DR4_A14672MADetMetTo ;
   private boolean[] H02DR4_n14672MADetMetTo ;
   private java.math.BigDecimal[] H02DR4_A14671MADetMetRe ;
   private boolean[] H02DR4_n14671MADetMetRe ;
   private java.math.BigDecimal[] H02DR4_A14670MADetMetPr ;
   private boolean[] H02DR4_n14670MADetMetPr ;
   private java.math.BigDecimal[] H02DR4_A14661MADetKilTo ;
   private java.math.BigDecimal[] H02DR4_A14659MADetKilRe ;
   private java.math.BigDecimal[] H02DR4_A14658MADetKilPr ;
   private boolean[] H02DR4_n14658MADetKilPr ;
   private String[] H02DR4_A14665MADetCatDs ;
   private boolean[] H02DR4_n14665MADetCatDs ;
   private short[] H02DR4_A14664MADetCatCo ;
   private boolean[] H02DR4_n14664MADetCatCo ;
   private String[] H02DR4_A14663MADetDefDs ;
   private boolean[] H02DR4_n14663MADetDefDs ;
   private short[] H02DR4_A14662MADetDefCo ;
   private boolean[] H02DR4_n14662MADetDefCo ;
   private String[] H02DR4_A14657MADetTipMD ;
   private boolean[] H02DR4_n14657MADetTipMD ;
   private String[] H02DR4_A14590MADetTipMC ;
   private String[] H02DR4_A14656MADetMaqDs ;
   private boolean[] H02DR4_n14656MADetMaqDs ;
   private String[] H02DR4_A14591MADetMaqCo ;
   private String[] H02DR4_A14660MADetIntDs ;
   private boolean[] H02DR4_n14660MADetIntDs ;
   private byte[] H02DR4_A14593MADetIntCo ;
   private String[] H02DR4_A14655MADetMatDs ;
   private boolean[] H02DR4_n14655MADetMatDs ;
   private short[] H02DR4_A14592MADetMatCo ;
   private byte[] H02DR4_A14654MADetColCo ;
   private String[] H02DR4_A14653MADetColNo ;
   private int[] H02DR4_A14589MADetColNu ;
   private String[] H02DR4_A14652MADetArtDs ;
   private boolean[] H02DR4_n14652MADetArtDs ;
   private String[] H02DR4_A14588MADetArtCo ;
   private String[] H02DR4_A14651MADetCliNo ;
   private boolean[] H02DR4_n14651MADetCliNo ;
   private int[] H02DR4_A14585MADetCliCo ;
   private String[] H02DR4_A14587MADetEmprC ;
   private java.util.Date[] H02DR4_A14586MADetFec ;
   private String[] H02DR4_A14668MADetBarPa ;
   private byte[] H02DR4_A14667MADetBarRe ;
   private int[] H02DR4_A14666MADetBarCo ;
   private GXSimpleCollection<String> AV79TipMaqCodCollection ;
   private GXSimpleCollection<String> AV102TipMaqCodS ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> AV23ManageFiltersData ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11[] ;
   private app.wwpbaseobjects.SdtWWPContext AV6WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext7[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV8TrnContext ;
   private app.wwpbaseobjects.SdtWWPGridState AV10GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState36[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV11GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV20ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV21ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector8[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector9[] ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV68DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[] ;
   private app.anticipacionerrores.SdtsdtMTok AV91sdtMTok ;
   private app.anticipacionerrores.SdtsdtParametros AV101sdtParametros ;
}

final  class mant_detalle__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H02DR2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A14590MADetTipMC ,
                                          GXSimpleCollection<String> AV79TipMaqCodCollection ,
                                          String AV137Anticipacionerrores_mant_detalleds_1_filterfulltext ,
                                          java.util.Date AV138Anticipacionerrores_mant_detalleds_2_tfmadetfec ,
                                          String AV140Anticipacionerrores_mant_detalleds_4_tfmadetemprcod_sel ,
                                          String AV139Anticipacionerrores_mant_detalleds_3_tfmadetemprcod ,
                                          int AV141Anticipacionerrores_mant_detalleds_5_tfmadetclicod ,
                                          int AV142Anticipacionerrores_mant_detalleds_6_tfmadetclicod_to ,
                                          String AV144Anticipacionerrores_mant_detalleds_8_tfmadetclinom_sel ,
                                          String AV143Anticipacionerrores_mant_detalleds_7_tfmadetclinom ,
                                          String AV146Anticipacionerrores_mant_detalleds_10_tfmadetartcod_sel ,
                                          String AV145Anticipacionerrores_mant_detalleds_9_tfmadetartcod ,
                                          String AV148Anticipacionerrores_mant_detalleds_12_tfmadetartdsc_sel ,
                                          String AV147Anticipacionerrores_mant_detalleds_11_tfmadetartdsc ,
                                          int AV149Anticipacionerrores_mant_detalleds_13_tfmadetcolnum ,
                                          int AV150Anticipacionerrores_mant_detalleds_14_tfmadetcolnum_to ,
                                          String AV152Anticipacionerrores_mant_detalleds_16_tfmadetcolnom_sel ,
                                          String AV151Anticipacionerrores_mant_detalleds_15_tfmadetcolnom ,
                                          byte AV153Anticipacionerrores_mant_detalleds_17_tfmadetcolcod ,
                                          byte AV154Anticipacionerrores_mant_detalleds_18_tfmadetcolcod_to ,
                                          short AV155Anticipacionerrores_mant_detalleds_19_tfmadetmatcod ,
                                          short AV156Anticipacionerrores_mant_detalleds_20_tfmadetmatcod_to ,
                                          String AV158Anticipacionerrores_mant_detalleds_22_tfmadetmatdsc_sel ,
                                          String AV157Anticipacionerrores_mant_detalleds_21_tfmadetmatdsc ,
                                          byte AV159Anticipacionerrores_mant_detalleds_23_tfmadetintcod ,
                                          byte AV160Anticipacionerrores_mant_detalleds_24_tfmadetintcod_to ,
                                          String AV162Anticipacionerrores_mant_detalleds_26_tfmadetintdsc_sel ,
                                          String AV161Anticipacionerrores_mant_detalleds_25_tfmadetintdsc ,
                                          String AV164Anticipacionerrores_mant_detalleds_28_tfmadetmaqcod_sel ,
                                          String AV163Anticipacionerrores_mant_detalleds_27_tfmadetmaqcod ,
                                          String AV166Anticipacionerrores_mant_detalleds_30_tfmadetmaqdsc_sel ,
                                          String AV165Anticipacionerrores_mant_detalleds_29_tfmadetmaqdsc ,
                                          String AV168Anticipacionerrores_mant_detalleds_32_tfmadettipmcod_sel ,
                                          String AV167Anticipacionerrores_mant_detalleds_31_tfmadettipmcod ,
                                          String AV170Anticipacionerrores_mant_detalleds_34_tfmadettipmdsc_sel ,
                                          String AV169Anticipacionerrores_mant_detalleds_33_tfmadettipmdsc ,
                                          short AV171Anticipacionerrores_mant_detalleds_35_tfmadetdefcod ,
                                          short AV172Anticipacionerrores_mant_detalleds_36_tfmadetdefcod_to ,
                                          String AV174Anticipacionerrores_mant_detalleds_38_tfmadetdefdsc_sel ,
                                          String AV173Anticipacionerrores_mant_detalleds_37_tfmadetdefdsc ,
                                          short AV175Anticipacionerrores_mant_detalleds_39_tfmadetcatcod ,
                                          short AV176Anticipacionerrores_mant_detalleds_40_tfmadetcatcod_to ,
                                          String AV178Anticipacionerrores_mant_detalleds_42_tfmadetcatdsc_sel ,
                                          String AV177Anticipacionerrores_mant_detalleds_41_tfmadetcatdsc ,
                                          String AV180Anticipacionerrores_mant_detalleds_44_tfmadethdr_sel ,
                                          String AV179Anticipacionerrores_mant_detalleds_43_tfmadethdr ,
                                          java.math.BigDecimal AV181Anticipacionerrores_mant_detalleds_45_tfmadetkilprod ,
                                          java.math.BigDecimal AV182Anticipacionerrores_mant_detalleds_46_tfmadetkilprod_to ,
                                          java.math.BigDecimal AV183Anticipacionerrores_mant_detalleds_47_tfmadetkilreo ,
                                          java.math.BigDecimal AV184Anticipacionerrores_mant_detalleds_48_tfmadetkilreo_to ,
                                          java.math.BigDecimal AV185Anticipacionerrores_mant_detalleds_49_tfmadetkiltot ,
                                          java.math.BigDecimal AV186Anticipacionerrores_mant_detalleds_50_tfmadetkiltot_to ,
                                          java.math.BigDecimal AV187Anticipacionerrores_mant_detalleds_51_tfmadetmetprod ,
                                          java.math.BigDecimal AV188Anticipacionerrores_mant_detalleds_52_tfmadetmetprod_to ,
                                          java.math.BigDecimal AV189Anticipacionerrores_mant_detalleds_53_tfmadetmetreo ,
                                          java.math.BigDecimal AV190Anticipacionerrores_mant_detalleds_54_tfmadetmetreo_to ,
                                          java.math.BigDecimal AV191Anticipacionerrores_mant_detalleds_55_tfmadetmettot ,
                                          java.math.BigDecimal AV192Anticipacionerrores_mant_detalleds_56_tfmadetmettot_to ,
                                          String AV72ArtCod ,
                                          int AV73ForColNum ,
                                          String AV115MADetMaqCod ,
                                          int AV79TipMaqCodCollection_size ,
                                          short AV103MADetDefCod ,
                                          short AV104MADetCatCod ,
                                          String A14587MADetEmprC ,
                                          int A14585MADetCliCo ,
                                          String A14651MADetCliNo ,
                                          String A14588MADetArtCo ,
                                          String A14652MADetArtDs ,
                                          int A14589MADetColNu ,
                                          String A14653MADetColNo ,
                                          byte A14654MADetColCo ,
                                          short A14592MADetMatCo ,
                                          String A14655MADetMatDs ,
                                          byte A14593MADetIntCo ,
                                          String A14660MADetIntDs ,
                                          String A14591MADetMaqCo ,
                                          String A14656MADetMaqDs ,
                                          String A14657MADetTipMD ,
                                          short A14662MADetDefCo ,
                                          String A14663MADetDefDs ,
                                          short A14664MADetCatCo ,
                                          String A14665MADetCatDs ,
                                          int A14666MADetBarCo ,
                                          byte A14667MADetBarRe ,
                                          String A14668MADetBarPa ,
                                          java.math.BigDecimal A14658MADetKilPr ,
                                          java.math.BigDecimal A14659MADetKilRe ,
                                          java.math.BigDecimal A14661MADetKilTo ,
                                          java.math.BigDecimal A14670MADetMetPr ,
                                          java.math.BigDecimal A14671MADetMetRe ,
                                          java.math.BigDecimal A14672MADetMetTo ,
                                          java.util.Date A14586MADetFec ,
                                          short AV12OrderedBy ,
                                          boolean AV13OrderedDsc ,
                                          String AV70MADetEmprCod ,
                                          String AV91sdtMTok_getgxTv_SdtsdtMTok_Mtkn ,
                                          String AV91sdtMTok_getgxTv_SdtsdtMTok_Mtknusu ,
                                          int AV71CliCod ,
                                          String A14583MADetTkn ,
                                          String A14584MADetUsu )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int37 = new byte[96];
      Object[] GXv_Object38 = new Object[2];
      String sSelectString;
      String sFromString;
      String sOrderString;
      sSelectString = " /*+ FIRST_ROWS(51) */ MADetTkn, MADetUsu, MADetMetTo, MADetMetRe, MADetMetPr, MADetKilTo, MADetKilRe, MADetKilPr, MADetCatDs, MADetCatCo, MADetDefDs, MADetDefCo," ;
      sSelectString += " MADetTipMD, MADetTipMC, MADetMaqDs, MADetMaqCo, MADetIntDs, MADetIntCo, MADetMatDs, MADetMatCo, MADetColCo, MADetColNo, MADetColNu, MADetArtDs, MADetArtCo, MADetCliNo," ;
      sSelectString += " MADetCliCo, MADetEmprC, MADetFec, MADetId, MADetBarPa, MADetBarRe, MADetBarCo" ;
      sFromString = " FROM MADet" ;
      sOrderString = "" ;
      addWhere(sWhereString, "(MADetTkn = ? and MADetUsu = ? and MADetCliCo = ?)");
      addWhere(sWhereString, "(MADetEmprC = ?)");
      if ( ! (GXutil.strcmp("", AV137Anticipacionerrores_mant_detalleds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(MADetEmprC) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(MADetCliCo,'999990'), 2) like '%' || ?) or ( UPPER(MADetCliNo) like '%' || UPPER(?)) or ( UPPER(MADetArtCo) like '%' || UPPER(?)) or ( UPPER(MADetArtDs) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(MADetColNu,'999990'), 2) like '%' || ?) or ( UPPER(MADetColNo) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(MADetColCo,'90'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(MADetMatCo,'990'), 2) like '%' || ?) or ( UPPER(MADetMatDs) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(MADetIntCo,'90'), 2) like '%' || ?) or ( UPPER(MADetIntDs) like '%' || UPPER(?)) or ( UPPER(MADetMaqCo) like '%' || UPPER(?)) or ( UPPER(MADetMaqDs) like '%' || UPPER(?)) or ( UPPER(MADetTipMC) like '%' || UPPER(?)) or ( UPPER(MADetTipMD) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(MADetDefCo,'9990'), 2) like '%' || ?) or ( UPPER(MADetDefDs) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(MADetCatCo,'9990'), 2) like '%' || ?) or ( UPPER(MADetCatDs) like '%' || UPPER(?)) or ( UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(MADetBarCo,'99999990'), 2))) || RTRIM(LTRIM(SUBSTR(TO_CHAR(MADetBarRe,'90'), 2))) || MADetBarPa) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(MADetKilPr,'999999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(MADetKilRe,'999999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(MADetKilTo,'999999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(MADetMetPr,'999999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(MADetMetRe,'999999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(MADetMetTo,'999999990.99'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int37[4] = (byte)(1) ;
         GXv_int37[5] = (byte)(1) ;
         GXv_int37[6] = (byte)(1) ;
         GXv_int37[7] = (byte)(1) ;
         GXv_int37[8] = (byte)(1) ;
         GXv_int37[9] = (byte)(1) ;
         GXv_int37[10] = (byte)(1) ;
         GXv_int37[11] = (byte)(1) ;
         GXv_int37[12] = (byte)(1) ;
         GXv_int37[13] = (byte)(1) ;
         GXv_int37[14] = (byte)(1) ;
         GXv_int37[15] = (byte)(1) ;
         GXv_int37[16] = (byte)(1) ;
         GXv_int37[17] = (byte)(1) ;
         GXv_int37[18] = (byte)(1) ;
         GXv_int37[19] = (byte)(1) ;
         GXv_int37[20] = (byte)(1) ;
         GXv_int37[21] = (byte)(1) ;
         GXv_int37[22] = (byte)(1) ;
         GXv_int37[23] = (byte)(1) ;
         GXv_int37[24] = (byte)(1) ;
         GXv_int37[25] = (byte)(1) ;
         GXv_int37[26] = (byte)(1) ;
         GXv_int37[27] = (byte)(1) ;
         GXv_int37[28] = (byte)(1) ;
         GXv_int37[29] = (byte)(1) ;
         GXv_int37[30] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV138Anticipacionerrores_mant_detalleds_2_tfmadetfec)) )
      {
         addWhere(sWhereString, "(MADetFec >= ?)");
      }
      else
      {
         GXv_int37[31] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV140Anticipacionerrores_mant_detalleds_4_tfmadetemprcod_sel)==0) && ( ! (GXutil.strcmp("", AV139Anticipacionerrores_mant_detalleds_3_tfmadetemprcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MADetEmprC) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int37[32] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV140Anticipacionerrores_mant_detalleds_4_tfmadetemprcod_sel)==0) )
      {
         addWhere(sWhereString, "(MADetEmprC = ?)");
      }
      else
      {
         GXv_int37[33] = (byte)(1) ;
      }
      if ( ! (0==AV141Anticipacionerrores_mant_detalleds_5_tfmadetclicod) )
      {
         addWhere(sWhereString, "(MADetCliCo >= ?)");
      }
      else
      {
         GXv_int37[34] = (byte)(1) ;
      }
      if ( ! (0==AV142Anticipacionerrores_mant_detalleds_6_tfmadetclicod_to) )
      {
         addWhere(sWhereString, "(MADetCliCo <= ?)");
      }
      else
      {
         GXv_int37[35] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV144Anticipacionerrores_mant_detalleds_8_tfmadetclinom_sel)==0) && ( ! (GXutil.strcmp("", AV143Anticipacionerrores_mant_detalleds_7_tfmadetclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MADetCliNo) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int37[36] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV144Anticipacionerrores_mant_detalleds_8_tfmadetclinom_sel)==0) )
      {
         addWhere(sWhereString, "(MADetCliNo = ?)");
      }
      else
      {
         GXv_int37[37] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV146Anticipacionerrores_mant_detalleds_10_tfmadetartcod_sel)==0) && ( ! (GXutil.strcmp("", AV145Anticipacionerrores_mant_detalleds_9_tfmadetartcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MADetArtCo) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int37[38] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV146Anticipacionerrores_mant_detalleds_10_tfmadetartcod_sel)==0) )
      {
         addWhere(sWhereString, "(MADetArtCo = ?)");
      }
      else
      {
         GXv_int37[39] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV148Anticipacionerrores_mant_detalleds_12_tfmadetartdsc_sel)==0) && ( ! (GXutil.strcmp("", AV147Anticipacionerrores_mant_detalleds_11_tfmadetartdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MADetArtDs) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int37[40] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV148Anticipacionerrores_mant_detalleds_12_tfmadetartdsc_sel)==0) )
      {
         addWhere(sWhereString, "(MADetArtDs = ?)");
      }
      else
      {
         GXv_int37[41] = (byte)(1) ;
      }
      if ( ! (0==AV149Anticipacionerrores_mant_detalleds_13_tfmadetcolnum) )
      {
         addWhere(sWhereString, "(MADetColNu >= ?)");
      }
      else
      {
         GXv_int37[42] = (byte)(1) ;
      }
      if ( ! (0==AV150Anticipacionerrores_mant_detalleds_14_tfmadetcolnum_to) )
      {
         addWhere(sWhereString, "(MADetColNu <= ?)");
      }
      else
      {
         GXv_int37[43] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV152Anticipacionerrores_mant_detalleds_16_tfmadetcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV151Anticipacionerrores_mant_detalleds_15_tfmadetcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MADetColNo) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int37[44] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV152Anticipacionerrores_mant_detalleds_16_tfmadetcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(MADetColNo = ?)");
      }
      else
      {
         GXv_int37[45] = (byte)(1) ;
      }
      if ( ! (0==AV153Anticipacionerrores_mant_detalleds_17_tfmadetcolcod) )
      {
         addWhere(sWhereString, "(MADetColCo >= ?)");
      }
      else
      {
         GXv_int37[46] = (byte)(1) ;
      }
      if ( ! (0==AV154Anticipacionerrores_mant_detalleds_18_tfmadetcolcod_to) )
      {
         addWhere(sWhereString, "(MADetColCo <= ?)");
      }
      else
      {
         GXv_int37[47] = (byte)(1) ;
      }
      if ( ! (0==AV155Anticipacionerrores_mant_detalleds_19_tfmadetmatcod) )
      {
         addWhere(sWhereString, "(MADetMatCo >= ?)");
      }
      else
      {
         GXv_int37[48] = (byte)(1) ;
      }
      if ( ! (0==AV156Anticipacionerrores_mant_detalleds_20_tfmadetmatcod_to) )
      {
         addWhere(sWhereString, "(MADetMatCo <= ?)");
      }
      else
      {
         GXv_int37[49] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV158Anticipacionerrores_mant_detalleds_22_tfmadetmatdsc_sel)==0) && ( ! (GXutil.strcmp("", AV157Anticipacionerrores_mant_detalleds_21_tfmadetmatdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MADetMatDs) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int37[50] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV158Anticipacionerrores_mant_detalleds_22_tfmadetmatdsc_sel)==0) )
      {
         addWhere(sWhereString, "(MADetMatDs = ?)");
      }
      else
      {
         GXv_int37[51] = (byte)(1) ;
      }
      if ( ! (0==AV159Anticipacionerrores_mant_detalleds_23_tfmadetintcod) )
      {
         addWhere(sWhereString, "(MADetIntCo >= ?)");
      }
      else
      {
         GXv_int37[52] = (byte)(1) ;
      }
      if ( ! (0==AV160Anticipacionerrores_mant_detalleds_24_tfmadetintcod_to) )
      {
         addWhere(sWhereString, "(MADetIntCo <= ?)");
      }
      else
      {
         GXv_int37[53] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV162Anticipacionerrores_mant_detalleds_26_tfmadetintdsc_sel)==0) && ( ! (GXutil.strcmp("", AV161Anticipacionerrores_mant_detalleds_25_tfmadetintdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MADetIntDs) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int37[54] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV162Anticipacionerrores_mant_detalleds_26_tfmadetintdsc_sel)==0) )
      {
         addWhere(sWhereString, "(MADetIntDs = ?)");
      }
      else
      {
         GXv_int37[55] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV164Anticipacionerrores_mant_detalleds_28_tfmadetmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV163Anticipacionerrores_mant_detalleds_27_tfmadetmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MADetMaqCo) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int37[56] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV164Anticipacionerrores_mant_detalleds_28_tfmadetmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(MADetMaqCo = ?)");
      }
      else
      {
         GXv_int37[57] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV166Anticipacionerrores_mant_detalleds_30_tfmadetmaqdsc_sel)==0) && ( ! (GXutil.strcmp("", AV165Anticipacionerrores_mant_detalleds_29_tfmadetmaqdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MADetMaqDs) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int37[58] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV166Anticipacionerrores_mant_detalleds_30_tfmadetmaqdsc_sel)==0) )
      {
         addWhere(sWhereString, "(MADetMaqDs = ?)");
      }
      else
      {
         GXv_int37[59] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV168Anticipacionerrores_mant_detalleds_32_tfmadettipmcod_sel)==0) && ( ! (GXutil.strcmp("", AV167Anticipacionerrores_mant_detalleds_31_tfmadettipmcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MADetTipMC) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int37[60] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV168Anticipacionerrores_mant_detalleds_32_tfmadettipmcod_sel)==0) )
      {
         addWhere(sWhereString, "(MADetTipMC = ?)");
      }
      else
      {
         GXv_int37[61] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV170Anticipacionerrores_mant_detalleds_34_tfmadettipmdsc_sel)==0) && ( ! (GXutil.strcmp("", AV169Anticipacionerrores_mant_detalleds_33_tfmadettipmdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MADetTipMD) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int37[62] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV170Anticipacionerrores_mant_detalleds_34_tfmadettipmdsc_sel)==0) )
      {
         addWhere(sWhereString, "(MADetTipMD = ?)");
      }
      else
      {
         GXv_int37[63] = (byte)(1) ;
      }
      if ( ! (0==AV171Anticipacionerrores_mant_detalleds_35_tfmadetdefcod) )
      {
         addWhere(sWhereString, "(MADetDefCo >= ?)");
      }
      else
      {
         GXv_int37[64] = (byte)(1) ;
      }
      if ( ! (0==AV172Anticipacionerrores_mant_detalleds_36_tfmadetdefcod_to) )
      {
         addWhere(sWhereString, "(MADetDefCo <= ?)");
      }
      else
      {
         GXv_int37[65] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV174Anticipacionerrores_mant_detalleds_38_tfmadetdefdsc_sel)==0) && ( ! (GXutil.strcmp("", AV173Anticipacionerrores_mant_detalleds_37_tfmadetdefdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MADetDefDs) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int37[66] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV174Anticipacionerrores_mant_detalleds_38_tfmadetdefdsc_sel)==0) )
      {
         addWhere(sWhereString, "(MADetDefDs = ?)");
      }
      else
      {
         GXv_int37[67] = (byte)(1) ;
      }
      if ( ! (0==AV175Anticipacionerrores_mant_detalleds_39_tfmadetcatcod) )
      {
         addWhere(sWhereString, "(MADetCatCo >= ?)");
      }
      else
      {
         GXv_int37[68] = (byte)(1) ;
      }
      if ( ! (0==AV176Anticipacionerrores_mant_detalleds_40_tfmadetcatcod_to) )
      {
         addWhere(sWhereString, "(MADetCatCo <= ?)");
      }
      else
      {
         GXv_int37[69] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV178Anticipacionerrores_mant_detalleds_42_tfmadetcatdsc_sel)==0) && ( ! (GXutil.strcmp("", AV177Anticipacionerrores_mant_detalleds_41_tfmadetcatdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MADetCatDs) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int37[70] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV178Anticipacionerrores_mant_detalleds_42_tfmadetcatdsc_sel)==0) )
      {
         addWhere(sWhereString, "(MADetCatDs = ?)");
      }
      else
      {
         GXv_int37[71] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV180Anticipacionerrores_mant_detalleds_44_tfmadethdr_sel)==0) && ( ! (GXutil.strcmp("", AV179Anticipacionerrores_mant_detalleds_43_tfmadethdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(MADetBarCo,'99999990'), 2))) || RTRIM(LTRIM(SUBSTR(TO_CHAR(MADetBarRe,'90'), 2))) || MADetBarPa) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int37[72] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV180Anticipacionerrores_mant_detalleds_44_tfmadethdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(MADetBarCo,'99999990'), 2))) || RTRIM(LTRIM(SUBSTR(TO_CHAR(MADetBarRe,'90'), 2))) || MADetBarPa = ?)");
      }
      else
      {
         GXv_int37[73] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV181Anticipacionerrores_mant_detalleds_45_tfmadetkilprod)==0) )
      {
         addWhere(sWhereString, "(MADetKilPr >= ?)");
      }
      else
      {
         GXv_int37[74] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV182Anticipacionerrores_mant_detalleds_46_tfmadetkilprod_to)==0) )
      {
         addWhere(sWhereString, "(MADetKilPr <= ?)");
      }
      else
      {
         GXv_int37[75] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV183Anticipacionerrores_mant_detalleds_47_tfmadetkilreo)==0) )
      {
         addWhere(sWhereString, "(MADetKilRe >= ?)");
      }
      else
      {
         GXv_int37[76] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV184Anticipacionerrores_mant_detalleds_48_tfmadetkilreo_to)==0) )
      {
         addWhere(sWhereString, "(MADetKilRe <= ?)");
      }
      else
      {
         GXv_int37[77] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV185Anticipacionerrores_mant_detalleds_49_tfmadetkiltot)==0) )
      {
         addWhere(sWhereString, "(MADetKilTo >= ?)");
      }
      else
      {
         GXv_int37[78] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV186Anticipacionerrores_mant_detalleds_50_tfmadetkiltot_to)==0) )
      {
         addWhere(sWhereString, "(MADetKilTo <= ?)");
      }
      else
      {
         GXv_int37[79] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV187Anticipacionerrores_mant_detalleds_51_tfmadetmetprod)==0) )
      {
         addWhere(sWhereString, "(MADetMetPr >= ?)");
      }
      else
      {
         GXv_int37[80] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV188Anticipacionerrores_mant_detalleds_52_tfmadetmetprod_to)==0) )
      {
         addWhere(sWhereString, "(MADetMetPr <= ?)");
      }
      else
      {
         GXv_int37[81] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV189Anticipacionerrores_mant_detalleds_53_tfmadetmetreo)==0) )
      {
         addWhere(sWhereString, "(MADetMetRe >= ?)");
      }
      else
      {
         GXv_int37[82] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV190Anticipacionerrores_mant_detalleds_54_tfmadetmetreo_to)==0) )
      {
         addWhere(sWhereString, "(MADetMetRe <= ?)");
      }
      else
      {
         GXv_int37[83] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV191Anticipacionerrores_mant_detalleds_55_tfmadetmettot)==0) )
      {
         addWhere(sWhereString, "(MADetMetTo >= ?)");
      }
      else
      {
         GXv_int37[84] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV192Anticipacionerrores_mant_detalleds_56_tfmadetmettot_to)==0) )
      {
         addWhere(sWhereString, "(MADetMetTo <= ?)");
      }
      else
      {
         GXv_int37[85] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV72ArtCod)==0) )
      {
         addWhere(sWhereString, "(MADetArtCo = ?)");
      }
      else
      {
         GXv_int37[86] = (byte)(1) ;
      }
      if ( ! (0==AV73ForColNum) )
      {
         addWhere(sWhereString, "(MADetColNu = ?)");
      }
      else
      {
         GXv_int37[87] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV115MADetMaqCod)==0) )
      {
         addWhere(sWhereString, "(MADetMaqCo = ?)");
      }
      else
      {
         GXv_int37[88] = (byte)(1) ;
      }
      if ( AV79TipMaqCodCollection_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV79TipMaqCodCollection, "MADetTipMC IN (", ")")+")");
      }
      if ( ! (0==AV103MADetDefCod) )
      {
         addWhere(sWhereString, "(MADetDefCo = ?)");
      }
      else
      {
         GXv_int37[89] = (byte)(1) ;
      }
      if ( ! (0==AV104MADetCatCod) )
      {
         addWhere(sWhereString, "(MADetCatCo = ?)");
      }
      else
      {
         GXv_int37[90] = (byte)(1) ;
      }
      if ( AV12OrderedBy == 1 )
      {
         sOrderString += " ORDER BY MADetFec, MADetId" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY MADetFec" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY MADetFec DESC" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY MADetEmprC" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY MADetEmprC DESC" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY MADetCliCo" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY MADetCliCo DESC" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY MADetCliNo" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY MADetCliNo DESC" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY MADetArtCo" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY MADetArtCo DESC" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY MADetArtDs" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY MADetArtDs DESC" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY MADetColNu" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY MADetColNu DESC" ;
      }
      else if ( ( AV12OrderedBy == 9 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY MADetColNo" ;
      }
      else if ( ( AV12OrderedBy == 9 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY MADetColNo DESC" ;
      }
      else if ( ( AV12OrderedBy == 10 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY MADetColCo" ;
      }
      else if ( ( AV12OrderedBy == 10 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY MADetColCo DESC" ;
      }
      else if ( ( AV12OrderedBy == 11 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY MADetMatCo" ;
      }
      else if ( ( AV12OrderedBy == 11 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY MADetMatCo DESC" ;
      }
      else if ( ( AV12OrderedBy == 12 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY MADetMatDs" ;
      }
      else if ( ( AV12OrderedBy == 12 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY MADetMatDs DESC" ;
      }
      else if ( ( AV12OrderedBy == 13 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY MADetIntCo" ;
      }
      else if ( ( AV12OrderedBy == 13 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY MADetIntCo DESC" ;
      }
      else if ( ( AV12OrderedBy == 14 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY MADetIntDs" ;
      }
      else if ( ( AV12OrderedBy == 14 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY MADetIntDs DESC" ;
      }
      else if ( ( AV12OrderedBy == 15 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY MADetMaqCo" ;
      }
      else if ( ( AV12OrderedBy == 15 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY MADetMaqCo DESC" ;
      }
      else if ( ( AV12OrderedBy == 16 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY MADetMaqDs" ;
      }
      else if ( ( AV12OrderedBy == 16 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY MADetMaqDs DESC" ;
      }
      else if ( ( AV12OrderedBy == 17 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY MADetTipMC" ;
      }
      else if ( ( AV12OrderedBy == 17 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY MADetTipMC DESC" ;
      }
      else if ( ( AV12OrderedBy == 18 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY MADetTipMD" ;
      }
      else if ( ( AV12OrderedBy == 18 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY MADetTipMD DESC" ;
      }
      else if ( ( AV12OrderedBy == 19 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY MADetDefCo" ;
      }
      else if ( ( AV12OrderedBy == 19 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY MADetDefCo DESC" ;
      }
      else if ( ( AV12OrderedBy == 20 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY MADetDefDs" ;
      }
      else if ( ( AV12OrderedBy == 20 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY MADetDefDs DESC" ;
      }
      else if ( ( AV12OrderedBy == 21 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY MADetCatCo" ;
      }
      else if ( ( AV12OrderedBy == 21 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY MADetCatCo DESC" ;
      }
      else if ( ( AV12OrderedBy == 22 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY MADetCatDs" ;
      }
      else if ( ( AV12OrderedBy == 22 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY MADetCatDs DESC" ;
      }
      else if ( ( AV12OrderedBy == 23 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY MADetKilPr" ;
      }
      else if ( ( AV12OrderedBy == 23 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY MADetKilPr DESC" ;
      }
      else if ( ( AV12OrderedBy == 24 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY MADetKilRe" ;
      }
      else if ( ( AV12OrderedBy == 24 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY MADetKilRe DESC" ;
      }
      else if ( ( AV12OrderedBy == 25 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY MADetKilTo" ;
      }
      else if ( ( AV12OrderedBy == 25 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY MADetKilTo DESC" ;
      }
      else if ( ( AV12OrderedBy == 26 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY MADetMetPr" ;
      }
      else if ( ( AV12OrderedBy == 26 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY MADetMetPr DESC" ;
      }
      else if ( ( AV12OrderedBy == 27 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY MADetMetRe" ;
      }
      else if ( ( AV12OrderedBy == 27 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY MADetMetRe DESC" ;
      }
      else if ( ( AV12OrderedBy == 28 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY MADetMetTo" ;
      }
      else if ( ( AV12OrderedBy == 28 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY MADetMetTo DESC" ;
      }
      else if ( true )
      {
         sOrderString += " ORDER BY MADetId" ;
      }
      scmdbuf = "SELECT * FROM ( SELECT GX_CTE.*, ROWNUM GX_ROW_NUMBER FROM (SELECT " + sSelectString + sFromString + sWhereString + sOrderString + "" + ") GX_CTE) WHERE GX_ROW_NUMBER" + " BETWEEN " + "?" + " AND " + "?" + " OR " + "?" + " < " + "?" + " AND GX_ROW_NUMBER >= " + "?" ;
      GXv_Object38[0] = scmdbuf ;
      GXv_Object38[1] = GXv_int37 ;
      return GXv_Object38 ;
   }

   protected Object[] conditional_H02DR3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A14590MADetTipMC ,
                                          GXSimpleCollection<String> AV79TipMaqCodCollection ,
                                          String AV137Anticipacionerrores_mant_detalleds_1_filterfulltext ,
                                          java.util.Date AV138Anticipacionerrores_mant_detalleds_2_tfmadetfec ,
                                          String AV140Anticipacionerrores_mant_detalleds_4_tfmadetemprcod_sel ,
                                          String AV139Anticipacionerrores_mant_detalleds_3_tfmadetemprcod ,
                                          int AV141Anticipacionerrores_mant_detalleds_5_tfmadetclicod ,
                                          int AV142Anticipacionerrores_mant_detalleds_6_tfmadetclicod_to ,
                                          String AV144Anticipacionerrores_mant_detalleds_8_tfmadetclinom_sel ,
                                          String AV143Anticipacionerrores_mant_detalleds_7_tfmadetclinom ,
                                          String AV146Anticipacionerrores_mant_detalleds_10_tfmadetartcod_sel ,
                                          String AV145Anticipacionerrores_mant_detalleds_9_tfmadetartcod ,
                                          String AV148Anticipacionerrores_mant_detalleds_12_tfmadetartdsc_sel ,
                                          String AV147Anticipacionerrores_mant_detalleds_11_tfmadetartdsc ,
                                          int AV149Anticipacionerrores_mant_detalleds_13_tfmadetcolnum ,
                                          int AV150Anticipacionerrores_mant_detalleds_14_tfmadetcolnum_to ,
                                          String AV152Anticipacionerrores_mant_detalleds_16_tfmadetcolnom_sel ,
                                          String AV151Anticipacionerrores_mant_detalleds_15_tfmadetcolnom ,
                                          byte AV153Anticipacionerrores_mant_detalleds_17_tfmadetcolcod ,
                                          byte AV154Anticipacionerrores_mant_detalleds_18_tfmadetcolcod_to ,
                                          short AV155Anticipacionerrores_mant_detalleds_19_tfmadetmatcod ,
                                          short AV156Anticipacionerrores_mant_detalleds_20_tfmadetmatcod_to ,
                                          String AV158Anticipacionerrores_mant_detalleds_22_tfmadetmatdsc_sel ,
                                          String AV157Anticipacionerrores_mant_detalleds_21_tfmadetmatdsc ,
                                          byte AV159Anticipacionerrores_mant_detalleds_23_tfmadetintcod ,
                                          byte AV160Anticipacionerrores_mant_detalleds_24_tfmadetintcod_to ,
                                          String AV162Anticipacionerrores_mant_detalleds_26_tfmadetintdsc_sel ,
                                          String AV161Anticipacionerrores_mant_detalleds_25_tfmadetintdsc ,
                                          String AV164Anticipacionerrores_mant_detalleds_28_tfmadetmaqcod_sel ,
                                          String AV163Anticipacionerrores_mant_detalleds_27_tfmadetmaqcod ,
                                          String AV166Anticipacionerrores_mant_detalleds_30_tfmadetmaqdsc_sel ,
                                          String AV165Anticipacionerrores_mant_detalleds_29_tfmadetmaqdsc ,
                                          String AV168Anticipacionerrores_mant_detalleds_32_tfmadettipmcod_sel ,
                                          String AV167Anticipacionerrores_mant_detalleds_31_tfmadettipmcod ,
                                          String AV170Anticipacionerrores_mant_detalleds_34_tfmadettipmdsc_sel ,
                                          String AV169Anticipacionerrores_mant_detalleds_33_tfmadettipmdsc ,
                                          short AV171Anticipacionerrores_mant_detalleds_35_tfmadetdefcod ,
                                          short AV172Anticipacionerrores_mant_detalleds_36_tfmadetdefcod_to ,
                                          String AV174Anticipacionerrores_mant_detalleds_38_tfmadetdefdsc_sel ,
                                          String AV173Anticipacionerrores_mant_detalleds_37_tfmadetdefdsc ,
                                          short AV175Anticipacionerrores_mant_detalleds_39_tfmadetcatcod ,
                                          short AV176Anticipacionerrores_mant_detalleds_40_tfmadetcatcod_to ,
                                          String AV178Anticipacionerrores_mant_detalleds_42_tfmadetcatdsc_sel ,
                                          String AV177Anticipacionerrores_mant_detalleds_41_tfmadetcatdsc ,
                                          String AV180Anticipacionerrores_mant_detalleds_44_tfmadethdr_sel ,
                                          String AV179Anticipacionerrores_mant_detalleds_43_tfmadethdr ,
                                          java.math.BigDecimal AV181Anticipacionerrores_mant_detalleds_45_tfmadetkilprod ,
                                          java.math.BigDecimal AV182Anticipacionerrores_mant_detalleds_46_tfmadetkilprod_to ,
                                          java.math.BigDecimal AV183Anticipacionerrores_mant_detalleds_47_tfmadetkilreo ,
                                          java.math.BigDecimal AV184Anticipacionerrores_mant_detalleds_48_tfmadetkilreo_to ,
                                          java.math.BigDecimal AV185Anticipacionerrores_mant_detalleds_49_tfmadetkiltot ,
                                          java.math.BigDecimal AV186Anticipacionerrores_mant_detalleds_50_tfmadetkiltot_to ,
                                          java.math.BigDecimal AV187Anticipacionerrores_mant_detalleds_51_tfmadetmetprod ,
                                          java.math.BigDecimal AV188Anticipacionerrores_mant_detalleds_52_tfmadetmetprod_to ,
                                          java.math.BigDecimal AV189Anticipacionerrores_mant_detalleds_53_tfmadetmetreo ,
                                          java.math.BigDecimal AV190Anticipacionerrores_mant_detalleds_54_tfmadetmetreo_to ,
                                          java.math.BigDecimal AV191Anticipacionerrores_mant_detalleds_55_tfmadetmettot ,
                                          java.math.BigDecimal AV192Anticipacionerrores_mant_detalleds_56_tfmadetmettot_to ,
                                          String AV72ArtCod ,
                                          int AV73ForColNum ,
                                          String AV115MADetMaqCod ,
                                          int AV79TipMaqCodCollection_size ,
                                          short AV103MADetDefCod ,
                                          short AV104MADetCatCod ,
                                          String A14587MADetEmprC ,
                                          int A14585MADetCliCo ,
                                          String A14651MADetCliNo ,
                                          String A14588MADetArtCo ,
                                          String A14652MADetArtDs ,
                                          int A14589MADetColNu ,
                                          String A14653MADetColNo ,
                                          byte A14654MADetColCo ,
                                          short A14592MADetMatCo ,
                                          String A14655MADetMatDs ,
                                          byte A14593MADetIntCo ,
                                          String A14660MADetIntDs ,
                                          String A14591MADetMaqCo ,
                                          String A14656MADetMaqDs ,
                                          String A14657MADetTipMD ,
                                          short A14662MADetDefCo ,
                                          String A14663MADetDefDs ,
                                          short A14664MADetCatCo ,
                                          String A14665MADetCatDs ,
                                          int A14666MADetBarCo ,
                                          byte A14667MADetBarRe ,
                                          String A14668MADetBarPa ,
                                          java.math.BigDecimal A14658MADetKilPr ,
                                          java.math.BigDecimal A14659MADetKilRe ,
                                          java.math.BigDecimal A14661MADetKilTo ,
                                          java.math.BigDecimal A14670MADetMetPr ,
                                          java.math.BigDecimal A14671MADetMetRe ,
                                          java.math.BigDecimal A14672MADetMetTo ,
                                          java.util.Date A14586MADetFec ,
                                          short AV12OrderedBy ,
                                          boolean AV13OrderedDsc ,
                                          String AV70MADetEmprCod ,
                                          String AV91sdtMTok_getgxTv_SdtsdtMTok_Mtkn ,
                                          String AV91sdtMTok_getgxTv_SdtsdtMTok_Mtknusu ,
                                          int AV71CliCod ,
                                          String A14583MADetTkn ,
                                          String A14584MADetUsu )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int40 = new byte[91];
      Object[] GXv_Object41 = new Object[2];
      scmdbuf = "SELECT COUNT(*) FROM MADet" ;
      addWhere(sWhereString, "(MADetTkn = ? and MADetUsu = ? and MADetCliCo = ?)");
      addWhere(sWhereString, "(MADetEmprC = ?)");
      if ( ! (GXutil.strcmp("", AV137Anticipacionerrores_mant_detalleds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(MADetEmprC) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(MADetCliCo,'999990'), 2) like '%' || ?) or ( UPPER(MADetCliNo) like '%' || UPPER(?)) or ( UPPER(MADetArtCo) like '%' || UPPER(?)) or ( UPPER(MADetArtDs) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(MADetColNu,'999990'), 2) like '%' || ?) or ( UPPER(MADetColNo) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(MADetColCo,'90'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(MADetMatCo,'990'), 2) like '%' || ?) or ( UPPER(MADetMatDs) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(MADetIntCo,'90'), 2) like '%' || ?) or ( UPPER(MADetIntDs) like '%' || UPPER(?)) or ( UPPER(MADetMaqCo) like '%' || UPPER(?)) or ( UPPER(MADetMaqDs) like '%' || UPPER(?)) or ( UPPER(MADetTipMC) like '%' || UPPER(?)) or ( UPPER(MADetTipMD) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(MADetDefCo,'9990'), 2) like '%' || ?) or ( UPPER(MADetDefDs) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(MADetCatCo,'9990'), 2) like '%' || ?) or ( UPPER(MADetCatDs) like '%' || UPPER(?)) or ( UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(MADetBarCo,'99999990'), 2))) || RTRIM(LTRIM(SUBSTR(TO_CHAR(MADetBarRe,'90'), 2))) || MADetBarPa) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(MADetKilPr,'999999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(MADetKilRe,'999999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(MADetKilTo,'999999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(MADetMetPr,'999999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(MADetMetRe,'999999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(MADetMetTo,'999999990.99'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int40[4] = (byte)(1) ;
         GXv_int40[5] = (byte)(1) ;
         GXv_int40[6] = (byte)(1) ;
         GXv_int40[7] = (byte)(1) ;
         GXv_int40[8] = (byte)(1) ;
         GXv_int40[9] = (byte)(1) ;
         GXv_int40[10] = (byte)(1) ;
         GXv_int40[11] = (byte)(1) ;
         GXv_int40[12] = (byte)(1) ;
         GXv_int40[13] = (byte)(1) ;
         GXv_int40[14] = (byte)(1) ;
         GXv_int40[15] = (byte)(1) ;
         GXv_int40[16] = (byte)(1) ;
         GXv_int40[17] = (byte)(1) ;
         GXv_int40[18] = (byte)(1) ;
         GXv_int40[19] = (byte)(1) ;
         GXv_int40[20] = (byte)(1) ;
         GXv_int40[21] = (byte)(1) ;
         GXv_int40[22] = (byte)(1) ;
         GXv_int40[23] = (byte)(1) ;
         GXv_int40[24] = (byte)(1) ;
         GXv_int40[25] = (byte)(1) ;
         GXv_int40[26] = (byte)(1) ;
         GXv_int40[27] = (byte)(1) ;
         GXv_int40[28] = (byte)(1) ;
         GXv_int40[29] = (byte)(1) ;
         GXv_int40[30] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV138Anticipacionerrores_mant_detalleds_2_tfmadetfec)) )
      {
         addWhere(sWhereString, "(MADetFec >= ?)");
      }
      else
      {
         GXv_int40[31] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV140Anticipacionerrores_mant_detalleds_4_tfmadetemprcod_sel)==0) && ( ! (GXutil.strcmp("", AV139Anticipacionerrores_mant_detalleds_3_tfmadetemprcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MADetEmprC) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int40[32] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV140Anticipacionerrores_mant_detalleds_4_tfmadetemprcod_sel)==0) )
      {
         addWhere(sWhereString, "(MADetEmprC = ?)");
      }
      else
      {
         GXv_int40[33] = (byte)(1) ;
      }
      if ( ! (0==AV141Anticipacionerrores_mant_detalleds_5_tfmadetclicod) )
      {
         addWhere(sWhereString, "(MADetCliCo >= ?)");
      }
      else
      {
         GXv_int40[34] = (byte)(1) ;
      }
      if ( ! (0==AV142Anticipacionerrores_mant_detalleds_6_tfmadetclicod_to) )
      {
         addWhere(sWhereString, "(MADetCliCo <= ?)");
      }
      else
      {
         GXv_int40[35] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV144Anticipacionerrores_mant_detalleds_8_tfmadetclinom_sel)==0) && ( ! (GXutil.strcmp("", AV143Anticipacionerrores_mant_detalleds_7_tfmadetclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MADetCliNo) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int40[36] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV144Anticipacionerrores_mant_detalleds_8_tfmadetclinom_sel)==0) )
      {
         addWhere(sWhereString, "(MADetCliNo = ?)");
      }
      else
      {
         GXv_int40[37] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV146Anticipacionerrores_mant_detalleds_10_tfmadetartcod_sel)==0) && ( ! (GXutil.strcmp("", AV145Anticipacionerrores_mant_detalleds_9_tfmadetartcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MADetArtCo) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int40[38] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV146Anticipacionerrores_mant_detalleds_10_tfmadetartcod_sel)==0) )
      {
         addWhere(sWhereString, "(MADetArtCo = ?)");
      }
      else
      {
         GXv_int40[39] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV148Anticipacionerrores_mant_detalleds_12_tfmadetartdsc_sel)==0) && ( ! (GXutil.strcmp("", AV147Anticipacionerrores_mant_detalleds_11_tfmadetartdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MADetArtDs) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int40[40] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV148Anticipacionerrores_mant_detalleds_12_tfmadetartdsc_sel)==0) )
      {
         addWhere(sWhereString, "(MADetArtDs = ?)");
      }
      else
      {
         GXv_int40[41] = (byte)(1) ;
      }
      if ( ! (0==AV149Anticipacionerrores_mant_detalleds_13_tfmadetcolnum) )
      {
         addWhere(sWhereString, "(MADetColNu >= ?)");
      }
      else
      {
         GXv_int40[42] = (byte)(1) ;
      }
      if ( ! (0==AV150Anticipacionerrores_mant_detalleds_14_tfmadetcolnum_to) )
      {
         addWhere(sWhereString, "(MADetColNu <= ?)");
      }
      else
      {
         GXv_int40[43] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV152Anticipacionerrores_mant_detalleds_16_tfmadetcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV151Anticipacionerrores_mant_detalleds_15_tfmadetcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MADetColNo) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int40[44] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV152Anticipacionerrores_mant_detalleds_16_tfmadetcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(MADetColNo = ?)");
      }
      else
      {
         GXv_int40[45] = (byte)(1) ;
      }
      if ( ! (0==AV153Anticipacionerrores_mant_detalleds_17_tfmadetcolcod) )
      {
         addWhere(sWhereString, "(MADetColCo >= ?)");
      }
      else
      {
         GXv_int40[46] = (byte)(1) ;
      }
      if ( ! (0==AV154Anticipacionerrores_mant_detalleds_18_tfmadetcolcod_to) )
      {
         addWhere(sWhereString, "(MADetColCo <= ?)");
      }
      else
      {
         GXv_int40[47] = (byte)(1) ;
      }
      if ( ! (0==AV155Anticipacionerrores_mant_detalleds_19_tfmadetmatcod) )
      {
         addWhere(sWhereString, "(MADetMatCo >= ?)");
      }
      else
      {
         GXv_int40[48] = (byte)(1) ;
      }
      if ( ! (0==AV156Anticipacionerrores_mant_detalleds_20_tfmadetmatcod_to) )
      {
         addWhere(sWhereString, "(MADetMatCo <= ?)");
      }
      else
      {
         GXv_int40[49] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV158Anticipacionerrores_mant_detalleds_22_tfmadetmatdsc_sel)==0) && ( ! (GXutil.strcmp("", AV157Anticipacionerrores_mant_detalleds_21_tfmadetmatdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MADetMatDs) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int40[50] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV158Anticipacionerrores_mant_detalleds_22_tfmadetmatdsc_sel)==0) )
      {
         addWhere(sWhereString, "(MADetMatDs = ?)");
      }
      else
      {
         GXv_int40[51] = (byte)(1) ;
      }
      if ( ! (0==AV159Anticipacionerrores_mant_detalleds_23_tfmadetintcod) )
      {
         addWhere(sWhereString, "(MADetIntCo >= ?)");
      }
      else
      {
         GXv_int40[52] = (byte)(1) ;
      }
      if ( ! (0==AV160Anticipacionerrores_mant_detalleds_24_tfmadetintcod_to) )
      {
         addWhere(sWhereString, "(MADetIntCo <= ?)");
      }
      else
      {
         GXv_int40[53] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV162Anticipacionerrores_mant_detalleds_26_tfmadetintdsc_sel)==0) && ( ! (GXutil.strcmp("", AV161Anticipacionerrores_mant_detalleds_25_tfmadetintdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MADetIntDs) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int40[54] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV162Anticipacionerrores_mant_detalleds_26_tfmadetintdsc_sel)==0) )
      {
         addWhere(sWhereString, "(MADetIntDs = ?)");
      }
      else
      {
         GXv_int40[55] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV164Anticipacionerrores_mant_detalleds_28_tfmadetmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV163Anticipacionerrores_mant_detalleds_27_tfmadetmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MADetMaqCo) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int40[56] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV164Anticipacionerrores_mant_detalleds_28_tfmadetmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(MADetMaqCo = ?)");
      }
      else
      {
         GXv_int40[57] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV166Anticipacionerrores_mant_detalleds_30_tfmadetmaqdsc_sel)==0) && ( ! (GXutil.strcmp("", AV165Anticipacionerrores_mant_detalleds_29_tfmadetmaqdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MADetMaqDs) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int40[58] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV166Anticipacionerrores_mant_detalleds_30_tfmadetmaqdsc_sel)==0) )
      {
         addWhere(sWhereString, "(MADetMaqDs = ?)");
      }
      else
      {
         GXv_int40[59] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV168Anticipacionerrores_mant_detalleds_32_tfmadettipmcod_sel)==0) && ( ! (GXutil.strcmp("", AV167Anticipacionerrores_mant_detalleds_31_tfmadettipmcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MADetTipMC) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int40[60] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV168Anticipacionerrores_mant_detalleds_32_tfmadettipmcod_sel)==0) )
      {
         addWhere(sWhereString, "(MADetTipMC = ?)");
      }
      else
      {
         GXv_int40[61] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV170Anticipacionerrores_mant_detalleds_34_tfmadettipmdsc_sel)==0) && ( ! (GXutil.strcmp("", AV169Anticipacionerrores_mant_detalleds_33_tfmadettipmdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MADetTipMD) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int40[62] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV170Anticipacionerrores_mant_detalleds_34_tfmadettipmdsc_sel)==0) )
      {
         addWhere(sWhereString, "(MADetTipMD = ?)");
      }
      else
      {
         GXv_int40[63] = (byte)(1) ;
      }
      if ( ! (0==AV171Anticipacionerrores_mant_detalleds_35_tfmadetdefcod) )
      {
         addWhere(sWhereString, "(MADetDefCo >= ?)");
      }
      else
      {
         GXv_int40[64] = (byte)(1) ;
      }
      if ( ! (0==AV172Anticipacionerrores_mant_detalleds_36_tfmadetdefcod_to) )
      {
         addWhere(sWhereString, "(MADetDefCo <= ?)");
      }
      else
      {
         GXv_int40[65] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV174Anticipacionerrores_mant_detalleds_38_tfmadetdefdsc_sel)==0) && ( ! (GXutil.strcmp("", AV173Anticipacionerrores_mant_detalleds_37_tfmadetdefdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MADetDefDs) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int40[66] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV174Anticipacionerrores_mant_detalleds_38_tfmadetdefdsc_sel)==0) )
      {
         addWhere(sWhereString, "(MADetDefDs = ?)");
      }
      else
      {
         GXv_int40[67] = (byte)(1) ;
      }
      if ( ! (0==AV175Anticipacionerrores_mant_detalleds_39_tfmadetcatcod) )
      {
         addWhere(sWhereString, "(MADetCatCo >= ?)");
      }
      else
      {
         GXv_int40[68] = (byte)(1) ;
      }
      if ( ! (0==AV176Anticipacionerrores_mant_detalleds_40_tfmadetcatcod_to) )
      {
         addWhere(sWhereString, "(MADetCatCo <= ?)");
      }
      else
      {
         GXv_int40[69] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV178Anticipacionerrores_mant_detalleds_42_tfmadetcatdsc_sel)==0) && ( ! (GXutil.strcmp("", AV177Anticipacionerrores_mant_detalleds_41_tfmadetcatdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MADetCatDs) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int40[70] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV178Anticipacionerrores_mant_detalleds_42_tfmadetcatdsc_sel)==0) )
      {
         addWhere(sWhereString, "(MADetCatDs = ?)");
      }
      else
      {
         GXv_int40[71] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV180Anticipacionerrores_mant_detalleds_44_tfmadethdr_sel)==0) && ( ! (GXutil.strcmp("", AV179Anticipacionerrores_mant_detalleds_43_tfmadethdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(MADetBarCo,'99999990'), 2))) || RTRIM(LTRIM(SUBSTR(TO_CHAR(MADetBarRe,'90'), 2))) || MADetBarPa) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int40[72] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV180Anticipacionerrores_mant_detalleds_44_tfmadethdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(MADetBarCo,'99999990'), 2))) || RTRIM(LTRIM(SUBSTR(TO_CHAR(MADetBarRe,'90'), 2))) || MADetBarPa = ?)");
      }
      else
      {
         GXv_int40[73] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV181Anticipacionerrores_mant_detalleds_45_tfmadetkilprod)==0) )
      {
         addWhere(sWhereString, "(MADetKilPr >= ?)");
      }
      else
      {
         GXv_int40[74] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV182Anticipacionerrores_mant_detalleds_46_tfmadetkilprod_to)==0) )
      {
         addWhere(sWhereString, "(MADetKilPr <= ?)");
      }
      else
      {
         GXv_int40[75] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV183Anticipacionerrores_mant_detalleds_47_tfmadetkilreo)==0) )
      {
         addWhere(sWhereString, "(MADetKilRe >= ?)");
      }
      else
      {
         GXv_int40[76] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV184Anticipacionerrores_mant_detalleds_48_tfmadetkilreo_to)==0) )
      {
         addWhere(sWhereString, "(MADetKilRe <= ?)");
      }
      else
      {
         GXv_int40[77] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV185Anticipacionerrores_mant_detalleds_49_tfmadetkiltot)==0) )
      {
         addWhere(sWhereString, "(MADetKilTo >= ?)");
      }
      else
      {
         GXv_int40[78] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV186Anticipacionerrores_mant_detalleds_50_tfmadetkiltot_to)==0) )
      {
         addWhere(sWhereString, "(MADetKilTo <= ?)");
      }
      else
      {
         GXv_int40[79] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV187Anticipacionerrores_mant_detalleds_51_tfmadetmetprod)==0) )
      {
         addWhere(sWhereString, "(MADetMetPr >= ?)");
      }
      else
      {
         GXv_int40[80] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV188Anticipacionerrores_mant_detalleds_52_tfmadetmetprod_to)==0) )
      {
         addWhere(sWhereString, "(MADetMetPr <= ?)");
      }
      else
      {
         GXv_int40[81] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV189Anticipacionerrores_mant_detalleds_53_tfmadetmetreo)==0) )
      {
         addWhere(sWhereString, "(MADetMetRe >= ?)");
      }
      else
      {
         GXv_int40[82] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV190Anticipacionerrores_mant_detalleds_54_tfmadetmetreo_to)==0) )
      {
         addWhere(sWhereString, "(MADetMetRe <= ?)");
      }
      else
      {
         GXv_int40[83] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV191Anticipacionerrores_mant_detalleds_55_tfmadetmettot)==0) )
      {
         addWhere(sWhereString, "(MADetMetTo >= ?)");
      }
      else
      {
         GXv_int40[84] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV192Anticipacionerrores_mant_detalleds_56_tfmadetmettot_to)==0) )
      {
         addWhere(sWhereString, "(MADetMetTo <= ?)");
      }
      else
      {
         GXv_int40[85] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV72ArtCod)==0) )
      {
         addWhere(sWhereString, "(MADetArtCo = ?)");
      }
      else
      {
         GXv_int40[86] = (byte)(1) ;
      }
      if ( ! (0==AV73ForColNum) )
      {
         addWhere(sWhereString, "(MADetColNu = ?)");
      }
      else
      {
         GXv_int40[87] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV115MADetMaqCod)==0) )
      {
         addWhere(sWhereString, "(MADetMaqCo = ?)");
      }
      else
      {
         GXv_int40[88] = (byte)(1) ;
      }
      if ( AV79TipMaqCodCollection_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV79TipMaqCodCollection, "MADetTipMC IN (", ")")+")");
      }
      if ( ! (0==AV103MADetDefCod) )
      {
         addWhere(sWhereString, "(MADetDefCo = ?)");
      }
      else
      {
         GXv_int40[89] = (byte)(1) ;
      }
      if ( ! (0==AV104MADetCatCod) )
      {
         addWhere(sWhereString, "(MADetCatCo = ?)");
      }
      else
      {
         GXv_int40[90] = (byte)(1) ;
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
      else if ( ( AV12OrderedBy == 14 ) && ! AV13OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 14 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 15 ) && ! AV13OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 15 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 16 ) && ! AV13OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 16 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 17 ) && ! AV13OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 17 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 18 ) && ! AV13OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 18 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 19 ) && ! AV13OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 19 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 20 ) && ! AV13OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 20 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 21 ) && ! AV13OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 21 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 22 ) && ! AV13OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 22 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 23 ) && ! AV13OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 23 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 24 ) && ! AV13OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 24 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 25 ) && ! AV13OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 25 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 26 ) && ! AV13OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 26 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 27 ) && ! AV13OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 27 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 28 ) && ! AV13OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 28 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( true )
      {
         scmdbuf += "" ;
      }
      GXv_Object41[0] = scmdbuf ;
      GXv_Object41[1] = GXv_int40 ;
      return GXv_Object41 ;
   }

   protected Object[] conditional_H02DR4( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A14590MADetTipMC ,
                                          GXSimpleCollection<String> AV79TipMaqCodCollection ,
                                          String AV137Anticipacionerrores_mant_detalleds_1_filterfulltext ,
                                          java.util.Date AV138Anticipacionerrores_mant_detalleds_2_tfmadetfec ,
                                          String AV140Anticipacionerrores_mant_detalleds_4_tfmadetemprcod_sel ,
                                          String AV139Anticipacionerrores_mant_detalleds_3_tfmadetemprcod ,
                                          int AV141Anticipacionerrores_mant_detalleds_5_tfmadetclicod ,
                                          int AV142Anticipacionerrores_mant_detalleds_6_tfmadetclicod_to ,
                                          String AV144Anticipacionerrores_mant_detalleds_8_tfmadetclinom_sel ,
                                          String AV143Anticipacionerrores_mant_detalleds_7_tfmadetclinom ,
                                          String AV146Anticipacionerrores_mant_detalleds_10_tfmadetartcod_sel ,
                                          String AV145Anticipacionerrores_mant_detalleds_9_tfmadetartcod ,
                                          String AV148Anticipacionerrores_mant_detalleds_12_tfmadetartdsc_sel ,
                                          String AV147Anticipacionerrores_mant_detalleds_11_tfmadetartdsc ,
                                          int AV149Anticipacionerrores_mant_detalleds_13_tfmadetcolnum ,
                                          int AV150Anticipacionerrores_mant_detalleds_14_tfmadetcolnum_to ,
                                          String AV152Anticipacionerrores_mant_detalleds_16_tfmadetcolnom_sel ,
                                          String AV151Anticipacionerrores_mant_detalleds_15_tfmadetcolnom ,
                                          byte AV153Anticipacionerrores_mant_detalleds_17_tfmadetcolcod ,
                                          byte AV154Anticipacionerrores_mant_detalleds_18_tfmadetcolcod_to ,
                                          short AV155Anticipacionerrores_mant_detalleds_19_tfmadetmatcod ,
                                          short AV156Anticipacionerrores_mant_detalleds_20_tfmadetmatcod_to ,
                                          String AV158Anticipacionerrores_mant_detalleds_22_tfmadetmatdsc_sel ,
                                          String AV157Anticipacionerrores_mant_detalleds_21_tfmadetmatdsc ,
                                          byte AV159Anticipacionerrores_mant_detalleds_23_tfmadetintcod ,
                                          byte AV160Anticipacionerrores_mant_detalleds_24_tfmadetintcod_to ,
                                          String AV162Anticipacionerrores_mant_detalleds_26_tfmadetintdsc_sel ,
                                          String AV161Anticipacionerrores_mant_detalleds_25_tfmadetintdsc ,
                                          String AV164Anticipacionerrores_mant_detalleds_28_tfmadetmaqcod_sel ,
                                          String AV163Anticipacionerrores_mant_detalleds_27_tfmadetmaqcod ,
                                          String AV166Anticipacionerrores_mant_detalleds_30_tfmadetmaqdsc_sel ,
                                          String AV165Anticipacionerrores_mant_detalleds_29_tfmadetmaqdsc ,
                                          String AV168Anticipacionerrores_mant_detalleds_32_tfmadettipmcod_sel ,
                                          String AV167Anticipacionerrores_mant_detalleds_31_tfmadettipmcod ,
                                          String AV170Anticipacionerrores_mant_detalleds_34_tfmadettipmdsc_sel ,
                                          String AV169Anticipacionerrores_mant_detalleds_33_tfmadettipmdsc ,
                                          short AV171Anticipacionerrores_mant_detalleds_35_tfmadetdefcod ,
                                          short AV172Anticipacionerrores_mant_detalleds_36_tfmadetdefcod_to ,
                                          String AV174Anticipacionerrores_mant_detalleds_38_tfmadetdefdsc_sel ,
                                          String AV173Anticipacionerrores_mant_detalleds_37_tfmadetdefdsc ,
                                          short AV175Anticipacionerrores_mant_detalleds_39_tfmadetcatcod ,
                                          short AV176Anticipacionerrores_mant_detalleds_40_tfmadetcatcod_to ,
                                          String AV178Anticipacionerrores_mant_detalleds_42_tfmadetcatdsc_sel ,
                                          String AV177Anticipacionerrores_mant_detalleds_41_tfmadetcatdsc ,
                                          String AV180Anticipacionerrores_mant_detalleds_44_tfmadethdr_sel ,
                                          String AV179Anticipacionerrores_mant_detalleds_43_tfmadethdr ,
                                          java.math.BigDecimal AV181Anticipacionerrores_mant_detalleds_45_tfmadetkilprod ,
                                          java.math.BigDecimal AV182Anticipacionerrores_mant_detalleds_46_tfmadetkilprod_to ,
                                          java.math.BigDecimal AV183Anticipacionerrores_mant_detalleds_47_tfmadetkilreo ,
                                          java.math.BigDecimal AV184Anticipacionerrores_mant_detalleds_48_tfmadetkilreo_to ,
                                          java.math.BigDecimal AV185Anticipacionerrores_mant_detalleds_49_tfmadetkiltot ,
                                          java.math.BigDecimal AV186Anticipacionerrores_mant_detalleds_50_tfmadetkiltot_to ,
                                          java.math.BigDecimal AV187Anticipacionerrores_mant_detalleds_51_tfmadetmetprod ,
                                          java.math.BigDecimal AV188Anticipacionerrores_mant_detalleds_52_tfmadetmetprod_to ,
                                          java.math.BigDecimal AV189Anticipacionerrores_mant_detalleds_53_tfmadetmetreo ,
                                          java.math.BigDecimal AV190Anticipacionerrores_mant_detalleds_54_tfmadetmetreo_to ,
                                          java.math.BigDecimal AV191Anticipacionerrores_mant_detalleds_55_tfmadetmettot ,
                                          java.math.BigDecimal AV192Anticipacionerrores_mant_detalleds_56_tfmadetmettot_to ,
                                          String AV72ArtCod ,
                                          int AV73ForColNum ,
                                          String AV115MADetMaqCod ,
                                          int AV79TipMaqCodCollection_size ,
                                          short AV103MADetDefCod ,
                                          short AV104MADetCatCod ,
                                          String A14587MADetEmprC ,
                                          int A14585MADetCliCo ,
                                          String A14651MADetCliNo ,
                                          String A14588MADetArtCo ,
                                          String A14652MADetArtDs ,
                                          int A14589MADetColNu ,
                                          String A14653MADetColNo ,
                                          byte A14654MADetColCo ,
                                          short A14592MADetMatCo ,
                                          String A14655MADetMatDs ,
                                          byte A14593MADetIntCo ,
                                          String A14660MADetIntDs ,
                                          String A14591MADetMaqCo ,
                                          String A14656MADetMaqDs ,
                                          String A14657MADetTipMD ,
                                          short A14662MADetDefCo ,
                                          String A14663MADetDefDs ,
                                          short A14664MADetCatCo ,
                                          String A14665MADetCatDs ,
                                          int A14666MADetBarCo ,
                                          byte A14667MADetBarRe ,
                                          String A14668MADetBarPa ,
                                          java.math.BigDecimal A14658MADetKilPr ,
                                          java.math.BigDecimal A14659MADetKilRe ,
                                          java.math.BigDecimal A14661MADetKilTo ,
                                          java.math.BigDecimal A14670MADetMetPr ,
                                          java.math.BigDecimal A14671MADetMetRe ,
                                          java.math.BigDecimal A14672MADetMetTo ,
                                          java.util.Date A14586MADetFec ,
                                          String AV70MADetEmprCod ,
                                          String AV91sdtMTok_getgxTv_SdtsdtMTok_Mtkn ,
                                          String AV91sdtMTok_getgxTv_SdtsdtMTok_Mtknusu ,
                                          int AV71CliCod ,
                                          String A14583MADetTkn ,
                                          String A14584MADetUsu )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int43 = new byte[91];
      Object[] GXv_Object44 = new Object[2];
      scmdbuf = "SELECT /*+ FIRST_ROWS(51) */ MADetId, MADetTkn, MADetUsu, MADetMetTo, MADetMetRe, MADetMetPr, MADetKilTo, MADetKilRe, MADetKilPr, MADetCatDs, MADetCatCo, MADetDefDs," ;
      scmdbuf += " MADetDefCo, MADetTipMD, MADetTipMC, MADetMaqDs, MADetMaqCo, MADetIntDs, MADetIntCo, MADetMatDs, MADetMatCo, MADetColCo, MADetColNo, MADetColNu, MADetArtDs, MADetArtCo," ;
      scmdbuf += " MADetCliNo, MADetCliCo, MADetEmprC, MADetFec, MADetBarPa, MADetBarRe, MADetBarCo FROM MADet" ;
      addWhere(sWhereString, "(MADetTkn = ? and MADetUsu = ? and MADetCliCo = ?)");
      addWhere(sWhereString, "(MADetEmprC = ?)");
      if ( ! (GXutil.strcmp("", AV137Anticipacionerrores_mant_detalleds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(MADetEmprC) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(MADetCliCo,'999990'), 2) like '%' || ?) or ( UPPER(MADetCliNo) like '%' || UPPER(?)) or ( UPPER(MADetArtCo) like '%' || UPPER(?)) or ( UPPER(MADetArtDs) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(MADetColNu,'999990'), 2) like '%' || ?) or ( UPPER(MADetColNo) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(MADetColCo,'90'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(MADetMatCo,'990'), 2) like '%' || ?) or ( UPPER(MADetMatDs) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(MADetIntCo,'90'), 2) like '%' || ?) or ( UPPER(MADetIntDs) like '%' || UPPER(?)) or ( UPPER(MADetMaqCo) like '%' || UPPER(?)) or ( UPPER(MADetMaqDs) like '%' || UPPER(?)) or ( UPPER(MADetTipMC) like '%' || UPPER(?)) or ( UPPER(MADetTipMD) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(MADetDefCo,'9990'), 2) like '%' || ?) or ( UPPER(MADetDefDs) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(MADetCatCo,'9990'), 2) like '%' || ?) or ( UPPER(MADetCatDs) like '%' || UPPER(?)) or ( UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(MADetBarCo,'99999990'), 2))) || RTRIM(LTRIM(SUBSTR(TO_CHAR(MADetBarRe,'90'), 2))) || MADetBarPa) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(MADetKilPr,'999999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(MADetKilRe,'999999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(MADetKilTo,'999999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(MADetMetPr,'999999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(MADetMetRe,'999999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(MADetMetTo,'999999990.99'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int43[4] = (byte)(1) ;
         GXv_int43[5] = (byte)(1) ;
         GXv_int43[6] = (byte)(1) ;
         GXv_int43[7] = (byte)(1) ;
         GXv_int43[8] = (byte)(1) ;
         GXv_int43[9] = (byte)(1) ;
         GXv_int43[10] = (byte)(1) ;
         GXv_int43[11] = (byte)(1) ;
         GXv_int43[12] = (byte)(1) ;
         GXv_int43[13] = (byte)(1) ;
         GXv_int43[14] = (byte)(1) ;
         GXv_int43[15] = (byte)(1) ;
         GXv_int43[16] = (byte)(1) ;
         GXv_int43[17] = (byte)(1) ;
         GXv_int43[18] = (byte)(1) ;
         GXv_int43[19] = (byte)(1) ;
         GXv_int43[20] = (byte)(1) ;
         GXv_int43[21] = (byte)(1) ;
         GXv_int43[22] = (byte)(1) ;
         GXv_int43[23] = (byte)(1) ;
         GXv_int43[24] = (byte)(1) ;
         GXv_int43[25] = (byte)(1) ;
         GXv_int43[26] = (byte)(1) ;
         GXv_int43[27] = (byte)(1) ;
         GXv_int43[28] = (byte)(1) ;
         GXv_int43[29] = (byte)(1) ;
         GXv_int43[30] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV138Anticipacionerrores_mant_detalleds_2_tfmadetfec)) )
      {
         addWhere(sWhereString, "(MADetFec >= ?)");
      }
      else
      {
         GXv_int43[31] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV140Anticipacionerrores_mant_detalleds_4_tfmadetemprcod_sel)==0) && ( ! (GXutil.strcmp("", AV139Anticipacionerrores_mant_detalleds_3_tfmadetemprcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MADetEmprC) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int43[32] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV140Anticipacionerrores_mant_detalleds_4_tfmadetemprcod_sel)==0) )
      {
         addWhere(sWhereString, "(MADetEmprC = ?)");
      }
      else
      {
         GXv_int43[33] = (byte)(1) ;
      }
      if ( ! (0==AV141Anticipacionerrores_mant_detalleds_5_tfmadetclicod) )
      {
         addWhere(sWhereString, "(MADetCliCo >= ?)");
      }
      else
      {
         GXv_int43[34] = (byte)(1) ;
      }
      if ( ! (0==AV142Anticipacionerrores_mant_detalleds_6_tfmadetclicod_to) )
      {
         addWhere(sWhereString, "(MADetCliCo <= ?)");
      }
      else
      {
         GXv_int43[35] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV144Anticipacionerrores_mant_detalleds_8_tfmadetclinom_sel)==0) && ( ! (GXutil.strcmp("", AV143Anticipacionerrores_mant_detalleds_7_tfmadetclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MADetCliNo) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int43[36] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV144Anticipacionerrores_mant_detalleds_8_tfmadetclinom_sel)==0) )
      {
         addWhere(sWhereString, "(MADetCliNo = ?)");
      }
      else
      {
         GXv_int43[37] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV146Anticipacionerrores_mant_detalleds_10_tfmadetartcod_sel)==0) && ( ! (GXutil.strcmp("", AV145Anticipacionerrores_mant_detalleds_9_tfmadetartcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MADetArtCo) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int43[38] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV146Anticipacionerrores_mant_detalleds_10_tfmadetartcod_sel)==0) )
      {
         addWhere(sWhereString, "(MADetArtCo = ?)");
      }
      else
      {
         GXv_int43[39] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV148Anticipacionerrores_mant_detalleds_12_tfmadetartdsc_sel)==0) && ( ! (GXutil.strcmp("", AV147Anticipacionerrores_mant_detalleds_11_tfmadetartdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MADetArtDs) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int43[40] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV148Anticipacionerrores_mant_detalleds_12_tfmadetartdsc_sel)==0) )
      {
         addWhere(sWhereString, "(MADetArtDs = ?)");
      }
      else
      {
         GXv_int43[41] = (byte)(1) ;
      }
      if ( ! (0==AV149Anticipacionerrores_mant_detalleds_13_tfmadetcolnum) )
      {
         addWhere(sWhereString, "(MADetColNu >= ?)");
      }
      else
      {
         GXv_int43[42] = (byte)(1) ;
      }
      if ( ! (0==AV150Anticipacionerrores_mant_detalleds_14_tfmadetcolnum_to) )
      {
         addWhere(sWhereString, "(MADetColNu <= ?)");
      }
      else
      {
         GXv_int43[43] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV152Anticipacionerrores_mant_detalleds_16_tfmadetcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV151Anticipacionerrores_mant_detalleds_15_tfmadetcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MADetColNo) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int43[44] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV152Anticipacionerrores_mant_detalleds_16_tfmadetcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(MADetColNo = ?)");
      }
      else
      {
         GXv_int43[45] = (byte)(1) ;
      }
      if ( ! (0==AV153Anticipacionerrores_mant_detalleds_17_tfmadetcolcod) )
      {
         addWhere(sWhereString, "(MADetColCo >= ?)");
      }
      else
      {
         GXv_int43[46] = (byte)(1) ;
      }
      if ( ! (0==AV154Anticipacionerrores_mant_detalleds_18_tfmadetcolcod_to) )
      {
         addWhere(sWhereString, "(MADetColCo <= ?)");
      }
      else
      {
         GXv_int43[47] = (byte)(1) ;
      }
      if ( ! (0==AV155Anticipacionerrores_mant_detalleds_19_tfmadetmatcod) )
      {
         addWhere(sWhereString, "(MADetMatCo >= ?)");
      }
      else
      {
         GXv_int43[48] = (byte)(1) ;
      }
      if ( ! (0==AV156Anticipacionerrores_mant_detalleds_20_tfmadetmatcod_to) )
      {
         addWhere(sWhereString, "(MADetMatCo <= ?)");
      }
      else
      {
         GXv_int43[49] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV158Anticipacionerrores_mant_detalleds_22_tfmadetmatdsc_sel)==0) && ( ! (GXutil.strcmp("", AV157Anticipacionerrores_mant_detalleds_21_tfmadetmatdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MADetMatDs) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int43[50] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV158Anticipacionerrores_mant_detalleds_22_tfmadetmatdsc_sel)==0) )
      {
         addWhere(sWhereString, "(MADetMatDs = ?)");
      }
      else
      {
         GXv_int43[51] = (byte)(1) ;
      }
      if ( ! (0==AV159Anticipacionerrores_mant_detalleds_23_tfmadetintcod) )
      {
         addWhere(sWhereString, "(MADetIntCo >= ?)");
      }
      else
      {
         GXv_int43[52] = (byte)(1) ;
      }
      if ( ! (0==AV160Anticipacionerrores_mant_detalleds_24_tfmadetintcod_to) )
      {
         addWhere(sWhereString, "(MADetIntCo <= ?)");
      }
      else
      {
         GXv_int43[53] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV162Anticipacionerrores_mant_detalleds_26_tfmadetintdsc_sel)==0) && ( ! (GXutil.strcmp("", AV161Anticipacionerrores_mant_detalleds_25_tfmadetintdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MADetIntDs) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int43[54] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV162Anticipacionerrores_mant_detalleds_26_tfmadetintdsc_sel)==0) )
      {
         addWhere(sWhereString, "(MADetIntDs = ?)");
      }
      else
      {
         GXv_int43[55] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV164Anticipacionerrores_mant_detalleds_28_tfmadetmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV163Anticipacionerrores_mant_detalleds_27_tfmadetmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MADetMaqCo) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int43[56] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV164Anticipacionerrores_mant_detalleds_28_tfmadetmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(MADetMaqCo = ?)");
      }
      else
      {
         GXv_int43[57] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV166Anticipacionerrores_mant_detalleds_30_tfmadetmaqdsc_sel)==0) && ( ! (GXutil.strcmp("", AV165Anticipacionerrores_mant_detalleds_29_tfmadetmaqdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MADetMaqDs) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int43[58] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV166Anticipacionerrores_mant_detalleds_30_tfmadetmaqdsc_sel)==0) )
      {
         addWhere(sWhereString, "(MADetMaqDs = ?)");
      }
      else
      {
         GXv_int43[59] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV168Anticipacionerrores_mant_detalleds_32_tfmadettipmcod_sel)==0) && ( ! (GXutil.strcmp("", AV167Anticipacionerrores_mant_detalleds_31_tfmadettipmcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MADetTipMC) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int43[60] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV168Anticipacionerrores_mant_detalleds_32_tfmadettipmcod_sel)==0) )
      {
         addWhere(sWhereString, "(MADetTipMC = ?)");
      }
      else
      {
         GXv_int43[61] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV170Anticipacionerrores_mant_detalleds_34_tfmadettipmdsc_sel)==0) && ( ! (GXutil.strcmp("", AV169Anticipacionerrores_mant_detalleds_33_tfmadettipmdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MADetTipMD) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int43[62] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV170Anticipacionerrores_mant_detalleds_34_tfmadettipmdsc_sel)==0) )
      {
         addWhere(sWhereString, "(MADetTipMD = ?)");
      }
      else
      {
         GXv_int43[63] = (byte)(1) ;
      }
      if ( ! (0==AV171Anticipacionerrores_mant_detalleds_35_tfmadetdefcod) )
      {
         addWhere(sWhereString, "(MADetDefCo >= ?)");
      }
      else
      {
         GXv_int43[64] = (byte)(1) ;
      }
      if ( ! (0==AV172Anticipacionerrores_mant_detalleds_36_tfmadetdefcod_to) )
      {
         addWhere(sWhereString, "(MADetDefCo <= ?)");
      }
      else
      {
         GXv_int43[65] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV174Anticipacionerrores_mant_detalleds_38_tfmadetdefdsc_sel)==0) && ( ! (GXutil.strcmp("", AV173Anticipacionerrores_mant_detalleds_37_tfmadetdefdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MADetDefDs) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int43[66] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV174Anticipacionerrores_mant_detalleds_38_tfmadetdefdsc_sel)==0) )
      {
         addWhere(sWhereString, "(MADetDefDs = ?)");
      }
      else
      {
         GXv_int43[67] = (byte)(1) ;
      }
      if ( ! (0==AV175Anticipacionerrores_mant_detalleds_39_tfmadetcatcod) )
      {
         addWhere(sWhereString, "(MADetCatCo >= ?)");
      }
      else
      {
         GXv_int43[68] = (byte)(1) ;
      }
      if ( ! (0==AV176Anticipacionerrores_mant_detalleds_40_tfmadetcatcod_to) )
      {
         addWhere(sWhereString, "(MADetCatCo <= ?)");
      }
      else
      {
         GXv_int43[69] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV178Anticipacionerrores_mant_detalleds_42_tfmadetcatdsc_sel)==0) && ( ! (GXutil.strcmp("", AV177Anticipacionerrores_mant_detalleds_41_tfmadetcatdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MADetCatDs) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int43[70] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV178Anticipacionerrores_mant_detalleds_42_tfmadetcatdsc_sel)==0) )
      {
         addWhere(sWhereString, "(MADetCatDs = ?)");
      }
      else
      {
         GXv_int43[71] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV180Anticipacionerrores_mant_detalleds_44_tfmadethdr_sel)==0) && ( ! (GXutil.strcmp("", AV179Anticipacionerrores_mant_detalleds_43_tfmadethdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(MADetBarCo,'99999990'), 2))) || RTRIM(LTRIM(SUBSTR(TO_CHAR(MADetBarRe,'90'), 2))) || MADetBarPa) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int43[72] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV180Anticipacionerrores_mant_detalleds_44_tfmadethdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(MADetBarCo,'99999990'), 2))) || RTRIM(LTRIM(SUBSTR(TO_CHAR(MADetBarRe,'90'), 2))) || MADetBarPa = ?)");
      }
      else
      {
         GXv_int43[73] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV181Anticipacionerrores_mant_detalleds_45_tfmadetkilprod)==0) )
      {
         addWhere(sWhereString, "(MADetKilPr >= ?)");
      }
      else
      {
         GXv_int43[74] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV182Anticipacionerrores_mant_detalleds_46_tfmadetkilprod_to)==0) )
      {
         addWhere(sWhereString, "(MADetKilPr <= ?)");
      }
      else
      {
         GXv_int43[75] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV183Anticipacionerrores_mant_detalleds_47_tfmadetkilreo)==0) )
      {
         addWhere(sWhereString, "(MADetKilRe >= ?)");
      }
      else
      {
         GXv_int43[76] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV184Anticipacionerrores_mant_detalleds_48_tfmadetkilreo_to)==0) )
      {
         addWhere(sWhereString, "(MADetKilRe <= ?)");
      }
      else
      {
         GXv_int43[77] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV185Anticipacionerrores_mant_detalleds_49_tfmadetkiltot)==0) )
      {
         addWhere(sWhereString, "(MADetKilTo >= ?)");
      }
      else
      {
         GXv_int43[78] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV186Anticipacionerrores_mant_detalleds_50_tfmadetkiltot_to)==0) )
      {
         addWhere(sWhereString, "(MADetKilTo <= ?)");
      }
      else
      {
         GXv_int43[79] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV187Anticipacionerrores_mant_detalleds_51_tfmadetmetprod)==0) )
      {
         addWhere(sWhereString, "(MADetMetPr >= ?)");
      }
      else
      {
         GXv_int43[80] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV188Anticipacionerrores_mant_detalleds_52_tfmadetmetprod_to)==0) )
      {
         addWhere(sWhereString, "(MADetMetPr <= ?)");
      }
      else
      {
         GXv_int43[81] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV189Anticipacionerrores_mant_detalleds_53_tfmadetmetreo)==0) )
      {
         addWhere(sWhereString, "(MADetMetRe >= ?)");
      }
      else
      {
         GXv_int43[82] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV190Anticipacionerrores_mant_detalleds_54_tfmadetmetreo_to)==0) )
      {
         addWhere(sWhereString, "(MADetMetRe <= ?)");
      }
      else
      {
         GXv_int43[83] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV191Anticipacionerrores_mant_detalleds_55_tfmadetmettot)==0) )
      {
         addWhere(sWhereString, "(MADetMetTo >= ?)");
      }
      else
      {
         GXv_int43[84] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV192Anticipacionerrores_mant_detalleds_56_tfmadetmettot_to)==0) )
      {
         addWhere(sWhereString, "(MADetMetTo <= ?)");
      }
      else
      {
         GXv_int43[85] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV72ArtCod)==0) )
      {
         addWhere(sWhereString, "(MADetArtCo = ?)");
      }
      else
      {
         GXv_int43[86] = (byte)(1) ;
      }
      if ( ! (0==AV73ForColNum) )
      {
         addWhere(sWhereString, "(MADetColNu = ?)");
      }
      else
      {
         GXv_int43[87] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV115MADetMaqCod)==0) )
      {
         addWhere(sWhereString, "(MADetMaqCo = ?)");
      }
      else
      {
         GXv_int43[88] = (byte)(1) ;
      }
      if ( AV79TipMaqCodCollection_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV79TipMaqCodCollection, "MADetTipMC IN (", ")")+")");
      }
      if ( ! (0==AV103MADetDefCod) )
      {
         addWhere(sWhereString, "(MADetDefCo = ?)");
      }
      else
      {
         GXv_int43[89] = (byte)(1) ;
      }
      if ( ! (0==AV104MADetCatCod) )
      {
         addWhere(sWhereString, "(MADetCatCo = ?)");
      }
      else
      {
         GXv_int43[90] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY MADetTkn, MADetUsu, MADetCliCo" ;
      GXv_Object44[0] = scmdbuf ;
      GXv_Object44[1] = GXv_int43 ;
      return GXv_Object44 ;
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
                  return conditional_H02DR2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (java.util.Date)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , ((Number) dynConstraints[6]).intValue() , ((Number) dynConstraints[7]).intValue() , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , ((Number) dynConstraints[14]).intValue() , ((Number) dynConstraints[15]).intValue() , (String)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).byteValue() , ((Number) dynConstraints[19]).byteValue() , ((Number) dynConstraints[20]).shortValue() , ((Number) dynConstraints[21]).shortValue() , (String)dynConstraints[22] , (String)dynConstraints[23] , ((Number) dynConstraints[24]).byteValue() , ((Number) dynConstraints[25]).byteValue() , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] , ((Number) dynConstraints[36]).shortValue() , ((Number) dynConstraints[37]).shortValue() , (String)dynConstraints[38] , (String)dynConstraints[39] , ((Number) dynConstraints[40]).shortValue() , ((Number) dynConstraints[41]).shortValue() , (String)dynConstraints[42] , (String)dynConstraints[43] , (String)dynConstraints[44] , (String)dynConstraints[45] , (java.math.BigDecimal)dynConstraints[46] , (java.math.BigDecimal)dynConstraints[47] , (java.math.BigDecimal)dynConstraints[48] , (java.math.BigDecimal)dynConstraints[49] , (java.math.BigDecimal)dynConstraints[50] , (java.math.BigDecimal)dynConstraints[51] , (java.math.BigDecimal)dynConstraints[52] , (java.math.BigDecimal)dynConstraints[53] , (java.math.BigDecimal)dynConstraints[54] , (java.math.BigDecimal)dynConstraints[55] , (java.math.BigDecimal)dynConstraints[56] , (java.math.BigDecimal)dynConstraints[57] , (String)dynConstraints[58] , ((Number) dynConstraints[59]).intValue() , (String)dynConstraints[60] , ((Number) dynConstraints[61]).intValue() , ((Number) dynConstraints[62]).shortValue() , ((Number) dynConstraints[63]).shortValue() , (String)dynConstraints[64] , ((Number) dynConstraints[65]).intValue() , (String)dynConstraints[66] , (String)dynConstraints[67] , (String)dynConstraints[68] , ((Number) dynConstraints[69]).intValue() , (String)dynConstraints[70] , ((Number) dynConstraints[71]).byteValue() , ((Number) dynConstraints[72]).shortValue() , (String)dynConstraints[73] , ((Number) dynConstraints[74]).byteValue() , (String)dynConstraints[75] , (String)dynConstraints[76] , (String)dynConstraints[77] , (String)dynConstraints[78] , ((Number) dynConstraints[79]).shortValue() , (String)dynConstraints[80] , ((Number) dynConstraints[81]).shortValue() , (String)dynConstraints[82] , ((Number) dynConstraints[83]).intValue() , ((Number) dynConstraints[84]).byteValue() , (String)dynConstraints[85] , (java.math.BigDecimal)dynConstraints[86] , (java.math.BigDecimal)dynConstraints[87] , (java.math.BigDecimal)dynConstraints[88] , (java.math.BigDecimal)dynConstraints[89] , (java.math.BigDecimal)dynConstraints[90] , (java.math.BigDecimal)dynConstraints[91] , (java.util.Date)dynConstraints[92] , ((Number) dynConstraints[93]).shortValue() , ((Boolean) dynConstraints[94]).booleanValue() , (String)dynConstraints[95] , (String)dynConstraints[96] , (String)dynConstraints[97] , ((Number) dynConstraints[98]).intValue() , (String)dynConstraints[99] , (String)dynConstraints[100] );
            case 1 :
                  return conditional_H02DR3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (java.util.Date)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , ((Number) dynConstraints[6]).intValue() , ((Number) dynConstraints[7]).intValue() , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , ((Number) dynConstraints[14]).intValue() , ((Number) dynConstraints[15]).intValue() , (String)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).byteValue() , ((Number) dynConstraints[19]).byteValue() , ((Number) dynConstraints[20]).shortValue() , ((Number) dynConstraints[21]).shortValue() , (String)dynConstraints[22] , (String)dynConstraints[23] , ((Number) dynConstraints[24]).byteValue() , ((Number) dynConstraints[25]).byteValue() , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] , ((Number) dynConstraints[36]).shortValue() , ((Number) dynConstraints[37]).shortValue() , (String)dynConstraints[38] , (String)dynConstraints[39] , ((Number) dynConstraints[40]).shortValue() , ((Number) dynConstraints[41]).shortValue() , (String)dynConstraints[42] , (String)dynConstraints[43] , (String)dynConstraints[44] , (String)dynConstraints[45] , (java.math.BigDecimal)dynConstraints[46] , (java.math.BigDecimal)dynConstraints[47] , (java.math.BigDecimal)dynConstraints[48] , (java.math.BigDecimal)dynConstraints[49] , (java.math.BigDecimal)dynConstraints[50] , (java.math.BigDecimal)dynConstraints[51] , (java.math.BigDecimal)dynConstraints[52] , (java.math.BigDecimal)dynConstraints[53] , (java.math.BigDecimal)dynConstraints[54] , (java.math.BigDecimal)dynConstraints[55] , (java.math.BigDecimal)dynConstraints[56] , (java.math.BigDecimal)dynConstraints[57] , (String)dynConstraints[58] , ((Number) dynConstraints[59]).intValue() , (String)dynConstraints[60] , ((Number) dynConstraints[61]).intValue() , ((Number) dynConstraints[62]).shortValue() , ((Number) dynConstraints[63]).shortValue() , (String)dynConstraints[64] , ((Number) dynConstraints[65]).intValue() , (String)dynConstraints[66] , (String)dynConstraints[67] , (String)dynConstraints[68] , ((Number) dynConstraints[69]).intValue() , (String)dynConstraints[70] , ((Number) dynConstraints[71]).byteValue() , ((Number) dynConstraints[72]).shortValue() , (String)dynConstraints[73] , ((Number) dynConstraints[74]).byteValue() , (String)dynConstraints[75] , (String)dynConstraints[76] , (String)dynConstraints[77] , (String)dynConstraints[78] , ((Number) dynConstraints[79]).shortValue() , (String)dynConstraints[80] , ((Number) dynConstraints[81]).shortValue() , (String)dynConstraints[82] , ((Number) dynConstraints[83]).intValue() , ((Number) dynConstraints[84]).byteValue() , (String)dynConstraints[85] , (java.math.BigDecimal)dynConstraints[86] , (java.math.BigDecimal)dynConstraints[87] , (java.math.BigDecimal)dynConstraints[88] , (java.math.BigDecimal)dynConstraints[89] , (java.math.BigDecimal)dynConstraints[90] , (java.math.BigDecimal)dynConstraints[91] , (java.util.Date)dynConstraints[92] , ((Number) dynConstraints[93]).shortValue() , ((Boolean) dynConstraints[94]).booleanValue() , (String)dynConstraints[95] , (String)dynConstraints[96] , (String)dynConstraints[97] , ((Number) dynConstraints[98]).intValue() , (String)dynConstraints[99] , (String)dynConstraints[100] );
            case 2 :
                  return conditional_H02DR4(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (java.util.Date)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , ((Number) dynConstraints[6]).intValue() , ((Number) dynConstraints[7]).intValue() , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , ((Number) dynConstraints[14]).intValue() , ((Number) dynConstraints[15]).intValue() , (String)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).byteValue() , ((Number) dynConstraints[19]).byteValue() , ((Number) dynConstraints[20]).shortValue() , ((Number) dynConstraints[21]).shortValue() , (String)dynConstraints[22] , (String)dynConstraints[23] , ((Number) dynConstraints[24]).byteValue() , ((Number) dynConstraints[25]).byteValue() , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] , ((Number) dynConstraints[36]).shortValue() , ((Number) dynConstraints[37]).shortValue() , (String)dynConstraints[38] , (String)dynConstraints[39] , ((Number) dynConstraints[40]).shortValue() , ((Number) dynConstraints[41]).shortValue() , (String)dynConstraints[42] , (String)dynConstraints[43] , (String)dynConstraints[44] , (String)dynConstraints[45] , (java.math.BigDecimal)dynConstraints[46] , (java.math.BigDecimal)dynConstraints[47] , (java.math.BigDecimal)dynConstraints[48] , (java.math.BigDecimal)dynConstraints[49] , (java.math.BigDecimal)dynConstraints[50] , (java.math.BigDecimal)dynConstraints[51] , (java.math.BigDecimal)dynConstraints[52] , (java.math.BigDecimal)dynConstraints[53] , (java.math.BigDecimal)dynConstraints[54] , (java.math.BigDecimal)dynConstraints[55] , (java.math.BigDecimal)dynConstraints[56] , (java.math.BigDecimal)dynConstraints[57] , (String)dynConstraints[58] , ((Number) dynConstraints[59]).intValue() , (String)dynConstraints[60] , ((Number) dynConstraints[61]).intValue() , ((Number) dynConstraints[62]).shortValue() , ((Number) dynConstraints[63]).shortValue() , (String)dynConstraints[64] , ((Number) dynConstraints[65]).intValue() , (String)dynConstraints[66] , (String)dynConstraints[67] , (String)dynConstraints[68] , ((Number) dynConstraints[69]).intValue() , (String)dynConstraints[70] , ((Number) dynConstraints[71]).byteValue() , ((Number) dynConstraints[72]).shortValue() , (String)dynConstraints[73] , ((Number) dynConstraints[74]).byteValue() , (String)dynConstraints[75] , (String)dynConstraints[76] , (String)dynConstraints[77] , (String)dynConstraints[78] , ((Number) dynConstraints[79]).shortValue() , (String)dynConstraints[80] , ((Number) dynConstraints[81]).shortValue() , (String)dynConstraints[82] , ((Number) dynConstraints[83]).intValue() , ((Number) dynConstraints[84]).byteValue() , (String)dynConstraints[85] , (java.math.BigDecimal)dynConstraints[86] , (java.math.BigDecimal)dynConstraints[87] , (java.math.BigDecimal)dynConstraints[88] , (java.math.BigDecimal)dynConstraints[89] , (java.math.BigDecimal)dynConstraints[90] , (java.math.BigDecimal)dynConstraints[91] , (java.util.Date)dynConstraints[92] , (String)dynConstraints[93] , (String)dynConstraints[94] , (String)dynConstraints[95] , ((Number) dynConstraints[96]).intValue() , (String)dynConstraints[97] , (String)dynConstraints[98] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H02DR2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,51, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H02DR3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H02DR4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,51, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(6,2);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(7,2);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getVarchar(9);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((short[]) buf[14])[0] = rslt.getShort(10);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getVarchar(11);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((short[]) buf[18])[0] = rslt.getShort(12);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getVarchar(13);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getString(14, 4);
               ((String[]) buf[23])[0] = rslt.getVarchar(15);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getString(16, 6);
               ((String[]) buf[26])[0] = rslt.getVarchar(17);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((byte[]) buf[28])[0] = rslt.getByte(18);
               ((String[]) buf[29])[0] = rslt.getVarchar(19);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((short[]) buf[31])[0] = rslt.getShort(20);
               ((byte[]) buf[32])[0] = rslt.getByte(21);
               ((String[]) buf[33])[0] = rslt.getString(22, 13);
               ((int[]) buf[34])[0] = rslt.getInt(23);
               ((String[]) buf[35])[0] = rslt.getVarchar(24);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((String[]) buf[37])[0] = rslt.getString(25, 16);
               ((String[]) buf[38])[0] = rslt.getVarchar(26);
               ((boolean[]) buf[39])[0] = rslt.wasNull();
               ((int[]) buf[40])[0] = rslt.getInt(27);
               ((String[]) buf[41])[0] = rslt.getString(28, 3);
               ((java.util.Date[]) buf[42])[0] = rslt.getGXDate(29);
               ((long[]) buf[43])[0] = rslt.getLong(30);
               ((String[]) buf[44])[0] = rslt.getString(31, 1);
               ((byte[]) buf[45])[0] = rslt.getByte(32);
               ((int[]) buf[46])[0] = rslt.getInt(33);
               return;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               return;
            case 2 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(7,2);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(8,2);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getVarchar(10);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((short[]) buf[15])[0] = rslt.getShort(11);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getVarchar(12);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((short[]) buf[19])[0] = rslt.getShort(13);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getVarchar(14);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(15, 4);
               ((String[]) buf[24])[0] = rslt.getVarchar(16);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((String[]) buf[26])[0] = rslt.getString(17, 6);
               ((String[]) buf[27])[0] = rslt.getVarchar(18);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((byte[]) buf[29])[0] = rslt.getByte(19);
               ((String[]) buf[30])[0] = rslt.getVarchar(20);
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((short[]) buf[32])[0] = rslt.getShort(21);
               ((byte[]) buf[33])[0] = rslt.getByte(22);
               ((String[]) buf[34])[0] = rslt.getString(23, 13);
               ((int[]) buf[35])[0] = rslt.getInt(24);
               ((String[]) buf[36])[0] = rslt.getVarchar(25);
               ((boolean[]) buf[37])[0] = rslt.wasNull();
               ((String[]) buf[38])[0] = rslt.getString(26, 16);
               ((String[]) buf[39])[0] = rslt.getVarchar(27);
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((int[]) buf[41])[0] = rslt.getInt(28);
               ((String[]) buf[42])[0] = rslt.getString(29, 3);
               ((java.util.Date[]) buf[43])[0] = rslt.getGXDate(30);
               ((String[]) buf[44])[0] = rslt.getString(31, 1);
               ((byte[]) buf[45])[0] = rslt.getByte(32);
               ((int[]) buf[46])[0] = rslt.getInt(33);
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
                  stmt.setVarchar(sIdx, (String)parms[96], 256);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[97], 8);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[98]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[99], 3);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[100], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[101], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[102], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[103], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[104], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[105], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[106], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[107], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[108], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[109], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[110], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[111], 100);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[112], 100);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[113], 100);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[114], 100);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[115], 100);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[116], 100);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[117], 100);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[118], 100);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[119], 100);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[120], 100);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[121], 100);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[122], 100);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[123], 100);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[124], 100);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[125], 100);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[126], 100);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[127]);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[128], 3);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[129], 3);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[130]).intValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[131]).intValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[132], 255);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[133], 255);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[134], 16);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[135], 16);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[136], 255);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[137], 255);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[138]).intValue());
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[139]).intValue());
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[140], 13);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[141], 13);
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[142]).byteValue());
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[143]).byteValue());
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[144]).shortValue());
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[145]).shortValue());
               }
               if ( ((Number) parms[50]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[146], 255);
               }
               if ( ((Number) parms[51]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[147], 255);
               }
               if ( ((Number) parms[52]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[148]).byteValue());
               }
               if ( ((Number) parms[53]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[149]).byteValue());
               }
               if ( ((Number) parms[54]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[150], 255);
               }
               if ( ((Number) parms[55]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[151], 255);
               }
               if ( ((Number) parms[56]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[152], 6);
               }
               if ( ((Number) parms[57]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[153], 6);
               }
               if ( ((Number) parms[58]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[154], 255);
               }
               if ( ((Number) parms[59]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[155], 255);
               }
               if ( ((Number) parms[60]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[156], 4);
               }
               if ( ((Number) parms[61]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[157], 4);
               }
               if ( ((Number) parms[62]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[158], 255);
               }
               if ( ((Number) parms[63]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[159], 255);
               }
               if ( ((Number) parms[64]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[160]).shortValue());
               }
               if ( ((Number) parms[65]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[161]).shortValue());
               }
               if ( ((Number) parms[66]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[162], 255);
               }
               if ( ((Number) parms[67]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[163], 255);
               }
               if ( ((Number) parms[68]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[164]).shortValue());
               }
               if ( ((Number) parms[69]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[165]).shortValue());
               }
               if ( ((Number) parms[70]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[166], 255);
               }
               if ( ((Number) parms[71]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[167], 255);
               }
               if ( ((Number) parms[72]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[168], 10);
               }
               if ( ((Number) parms[73]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[169], 10);
               }
               if ( ((Number) parms[74]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[170], 2);
               }
               if ( ((Number) parms[75]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[171], 2);
               }
               if ( ((Number) parms[76]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[172], 2);
               }
               if ( ((Number) parms[77]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[173], 2);
               }
               if ( ((Number) parms[78]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[174], 2);
               }
               if ( ((Number) parms[79]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[175], 2);
               }
               if ( ((Number) parms[80]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[176], 2);
               }
               if ( ((Number) parms[81]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[177], 2);
               }
               if ( ((Number) parms[82]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[178], 2);
               }
               if ( ((Number) parms[83]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[179], 2);
               }
               if ( ((Number) parms[84]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[180], 2);
               }
               if ( ((Number) parms[85]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[181], 2);
               }
               if ( ((Number) parms[86]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[182], 16);
               }
               if ( ((Number) parms[87]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[183]).intValue());
               }
               if ( ((Number) parms[88]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[184], 6);
               }
               if ( ((Number) parms[89]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[185]).shortValue());
               }
               if ( ((Number) parms[90]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[186]).shortValue());
               }
               if ( ((Number) parms[91]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[187]).intValue());
               }
               if ( ((Number) parms[92]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[188]).intValue());
               }
               if ( ((Number) parms[93]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[189]).intValue());
               }
               if ( ((Number) parms[94]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[190]).intValue());
               }
               if ( ((Number) parms[95]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[191]).intValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[91], 256);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[92], 8);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[93]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[94], 3);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[95], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[96], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[97], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[98], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[99], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[100], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[101], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[102], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[103], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[104], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[105], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[106], 100);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[107], 100);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[108], 100);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[109], 100);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[110], 100);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[111], 100);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[112], 100);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[113], 100);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[114], 100);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[115], 100);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[116], 100);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[117], 100);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[118], 100);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[119], 100);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[120], 100);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[121], 100);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[122]);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[123], 3);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[124], 3);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[125]).intValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[126]).intValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[127], 255);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[128], 255);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[129], 16);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[130], 16);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[131], 255);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[132], 255);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[133]).intValue());
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[134]).intValue());
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[135], 13);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[136], 13);
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[137]).byteValue());
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[138]).byteValue());
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[139]).shortValue());
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[140]).shortValue());
               }
               if ( ((Number) parms[50]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[141], 255);
               }
               if ( ((Number) parms[51]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[142], 255);
               }
               if ( ((Number) parms[52]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[143]).byteValue());
               }
               if ( ((Number) parms[53]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[144]).byteValue());
               }
               if ( ((Number) parms[54]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[145], 255);
               }
               if ( ((Number) parms[55]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[146], 255);
               }
               if ( ((Number) parms[56]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[147], 6);
               }
               if ( ((Number) parms[57]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[148], 6);
               }
               if ( ((Number) parms[58]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[149], 255);
               }
               if ( ((Number) parms[59]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[150], 255);
               }
               if ( ((Number) parms[60]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[151], 4);
               }
               if ( ((Number) parms[61]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[152], 4);
               }
               if ( ((Number) parms[62]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[153], 255);
               }
               if ( ((Number) parms[63]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[154], 255);
               }
               if ( ((Number) parms[64]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[155]).shortValue());
               }
               if ( ((Number) parms[65]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[156]).shortValue());
               }
               if ( ((Number) parms[66]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[157], 255);
               }
               if ( ((Number) parms[67]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[158], 255);
               }
               if ( ((Number) parms[68]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[159]).shortValue());
               }
               if ( ((Number) parms[69]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[160]).shortValue());
               }
               if ( ((Number) parms[70]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[161], 255);
               }
               if ( ((Number) parms[71]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[162], 255);
               }
               if ( ((Number) parms[72]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[163], 10);
               }
               if ( ((Number) parms[73]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[164], 10);
               }
               if ( ((Number) parms[74]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[165], 2);
               }
               if ( ((Number) parms[75]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[166], 2);
               }
               if ( ((Number) parms[76]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[167], 2);
               }
               if ( ((Number) parms[77]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[168], 2);
               }
               if ( ((Number) parms[78]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[169], 2);
               }
               if ( ((Number) parms[79]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[170], 2);
               }
               if ( ((Number) parms[80]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[171], 2);
               }
               if ( ((Number) parms[81]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[172], 2);
               }
               if ( ((Number) parms[82]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[173], 2);
               }
               if ( ((Number) parms[83]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[174], 2);
               }
               if ( ((Number) parms[84]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[175], 2);
               }
               if ( ((Number) parms[85]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[176], 2);
               }
               if ( ((Number) parms[86]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[177], 16);
               }
               if ( ((Number) parms[87]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[178]).intValue());
               }
               if ( ((Number) parms[88]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[179], 6);
               }
               if ( ((Number) parms[89]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[180]).shortValue());
               }
               if ( ((Number) parms[90]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[181]).shortValue());
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[91], 256);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[92], 8);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[93]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[94], 3);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[95], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[96], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[97], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[98], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[99], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[100], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[101], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[102], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[103], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[104], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[105], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[106], 100);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[107], 100);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[108], 100);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[109], 100);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[110], 100);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[111], 100);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[112], 100);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[113], 100);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[114], 100);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[115], 100);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[116], 100);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[117], 100);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[118], 100);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[119], 100);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[120], 100);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[121], 100);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[122]);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[123], 3);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[124], 3);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[125]).intValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[126]).intValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[127], 255);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[128], 255);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[129], 16);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[130], 16);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[131], 255);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[132], 255);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[133]).intValue());
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[134]).intValue());
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[135], 13);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[136], 13);
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[137]).byteValue());
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[138]).byteValue());
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[139]).shortValue());
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[140]).shortValue());
               }
               if ( ((Number) parms[50]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[141], 255);
               }
               if ( ((Number) parms[51]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[142], 255);
               }
               if ( ((Number) parms[52]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[143]).byteValue());
               }
               if ( ((Number) parms[53]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[144]).byteValue());
               }
               if ( ((Number) parms[54]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[145], 255);
               }
               if ( ((Number) parms[55]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[146], 255);
               }
               if ( ((Number) parms[56]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[147], 6);
               }
               if ( ((Number) parms[57]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[148], 6);
               }
               if ( ((Number) parms[58]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[149], 255);
               }
               if ( ((Number) parms[59]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[150], 255);
               }
               if ( ((Number) parms[60]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[151], 4);
               }
               if ( ((Number) parms[61]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[152], 4);
               }
               if ( ((Number) parms[62]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[153], 255);
               }
               if ( ((Number) parms[63]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[154], 255);
               }
               if ( ((Number) parms[64]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[155]).shortValue());
               }
               if ( ((Number) parms[65]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[156]).shortValue());
               }
               if ( ((Number) parms[66]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[157], 255);
               }
               if ( ((Number) parms[67]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[158], 255);
               }
               if ( ((Number) parms[68]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[159]).shortValue());
               }
               if ( ((Number) parms[69]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[160]).shortValue());
               }
               if ( ((Number) parms[70]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[161], 255);
               }
               if ( ((Number) parms[71]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[162], 255);
               }
               if ( ((Number) parms[72]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[163], 10);
               }
               if ( ((Number) parms[73]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[164], 10);
               }
               if ( ((Number) parms[74]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[165], 2);
               }
               if ( ((Number) parms[75]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[166], 2);
               }
               if ( ((Number) parms[76]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[167], 2);
               }
               if ( ((Number) parms[77]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[168], 2);
               }
               if ( ((Number) parms[78]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[169], 2);
               }
               if ( ((Number) parms[79]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[170], 2);
               }
               if ( ((Number) parms[80]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[171], 2);
               }
               if ( ((Number) parms[81]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[172], 2);
               }
               if ( ((Number) parms[82]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[173], 2);
               }
               if ( ((Number) parms[83]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[174], 2);
               }
               if ( ((Number) parms[84]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[175], 2);
               }
               if ( ((Number) parms[85]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[176], 2);
               }
               if ( ((Number) parms[86]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[177], 16);
               }
               if ( ((Number) parms[87]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[178]).intValue());
               }
               if ( ((Number) parms[88]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[179], 6);
               }
               if ( ((Number) parms[89]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[180]).shortValue());
               }
               if ( ((Number) parms[90]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[181]).shortValue());
               }
               return;
      }
   }

}

