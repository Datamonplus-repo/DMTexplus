package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class listadodehdrs_wc_impl extends GXWebComponent
{
   public listadodehdrs_wc_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public listadodehdrs_wc_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( listadodehdrs_wc_impl.class ));
   }

   public listadodehdrs_wc_impl( int remoteHandle ,
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
               AV72Emprcod = httpContext.GetPar( "Emprcod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV72Emprcod", AV72Emprcod);
               AV73BarSit = (byte)(GXutil.lval( httpContext.GetPar( "BarSit"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV73BarSit", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV73BarSit), 2, 0));
               AV74BarSit_to = (byte)(GXutil.lval( httpContext.GetPar( "BarSit_to"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV74BarSit_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV74BarSit_to), 2, 0));
               AV75BarFecGen = localUtil.parseDateParm( httpContext.GetPar( "BarFecGen")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV75BarFecGen", localUtil.format(AV75BarFecGen, "99/99/99"));
               AV76BarFecGen_to = localUtil.parseDateParm( httpContext.GetPar( "BarFecGen_to")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV76BarFecGen_to", localUtil.format(AV76BarFecGen_to, "99/99/99"));
               AV77Clicod = (int)(GXutil.lval( httpContext.GetPar( "Clicod"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV77Clicod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV77Clicod), 6, 0));
               AV78Clicod_to = (int)(GXutil.lval( httpContext.GetPar( "Clicod_to"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV78Clicod_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV78Clicod_to), 6, 0));
               AV79BarFecCli = localUtil.parseDateParm( httpContext.GetPar( "BarFecCli")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV79BarFecCli", localUtil.format(AV79BarFecCli, "99/99/99"));
               AV80BarFecCli_to = localUtil.parseDateParm( httpContext.GetPar( "BarFecCli_to")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV80BarFecCli_to", localUtil.format(AV80BarFecCli_to, "99/99/99"));
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,AV72Emprcod,Byte.valueOf(AV73BarSit),Byte.valueOf(AV74BarSit_to),AV75BarFecGen,AV76BarFecGen_to,Integer.valueOf(AV77Clicod),Integer.valueOf(AV78Clicod_to),AV79BarFecCli,AV80BarFecCli_to});
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
      AV72Emprcod = httpContext.GetPar( "Emprcod") ;
      AV73BarSit = (byte)(GXutil.lval( httpContext.GetPar( "BarSit"))) ;
      AV74BarSit_to = (byte)(GXutil.lval( httpContext.GetPar( "BarSit_to"))) ;
      AV75BarFecGen = localUtil.parseDateParm( httpContext.GetPar( "BarFecGen")) ;
      AV76BarFecGen_to = localUtil.parseDateParm( httpContext.GetPar( "BarFecGen_to")) ;
      AV77Clicod = (int)(GXutil.lval( httpContext.GetPar( "Clicod"))) ;
      AV78Clicod_to = (int)(GXutil.lval( httpContext.GetPar( "Clicod_to"))) ;
      AV79BarFecCli = localUtil.parseDateParm( httpContext.GetPar( "BarFecCli")) ;
      AV80BarFecCli_to = localUtil.parseDateParm( httpContext.GetPar( "BarFecCli_to")) ;
      AV25ManageFiltersExecutionStep = (byte)(GXutil.lval( httpContext.GetPar( "ManageFiltersExecutionStep"))) ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV20ColumnsSelector);
      AV15FilterFullText = httpContext.GetPar( "FilterFullText") ;
      AV26TFCliCod = (int)(GXutil.lval( httpContext.GetPar( "TFCliCod"))) ;
      AV27TFCliCod_To = (int)(GXutil.lval( httpContext.GetPar( "TFCliCod_To"))) ;
      AV28TFCliNom = httpContext.GetPar( "TFCliNom") ;
      AV29TFCliNom_Sel = httpContext.GetPar( "TFCliNom_Sel") ;
      AV93TFPedidoCliente = httpContext.GetPar( "TFPedidoCliente") ;
      AV94TFPedidoCliente_Sel = httpContext.GetPar( "TFPedidoCliente_Sel") ;
      AV81TFBarNHdr = httpContext.GetPar( "TFBarNHdr") ;
      AV82TFBarNHdr_Sel = httpContext.GetPar( "TFBarNHdr_Sel") ;
      AV30TFBarSer = httpContext.GetPar( "TFBarSer") ;
      AV31TFBarSer_Sel = httpContext.GetPar( "TFBarSer_Sel") ;
      AV32TFBarSerDsc = httpContext.GetPar( "TFBarSerDsc") ;
      AV33TFBarSerDsc_Sel = httpContext.GetPar( "TFBarSerDsc_Sel") ;
      AV34TFBarTipArt = (short)(GXutil.lval( httpContext.GetPar( "TFBarTipArt"))) ;
      AV35TFBarTipArt_To = (short)(GXutil.lval( httpContext.GetPar( "TFBarTipArt_To"))) ;
      AV36TFBarTipArtDsc = httpContext.GetPar( "TFBarTipArtDsc") ;
      AV37TFBarTipArtDsc_Sel = httpContext.GetPar( "TFBarTipArtDsc_Sel") ;
      AV38TFBarColNom = httpContext.GetPar( "TFBarColNom") ;
      AV39TFBarColNom_Sel = httpContext.GetPar( "TFBarColNom_Sel") ;
      AV40TFBarColNum = (int)(GXutil.lval( httpContext.GetPar( "TFBarColNum"))) ;
      AV41TFBarColNum_To = (int)(GXutil.lval( httpContext.GetPar( "TFBarColNum_To"))) ;
      AV46TFBarNomCli = httpContext.GetPar( "TFBarNomCli") ;
      AV47TFBarNomCli_Sel = httpContext.GetPar( "TFBarNomCli_Sel") ;
      AV48TFBarKgm = CommonUtil.decimalVal( httpContext.GetPar( "TFBarKgm"), ".") ;
      AV49TFBarKgm_To = CommonUtil.decimalVal( httpContext.GetPar( "TFBarKgm_To"), ".") ;
      AV50TFBarMtr = CommonUtil.decimalVal( httpContext.GetPar( "TFBarMtr"), ".") ;
      AV51TFBarMtr_To = CommonUtil.decimalVal( httpContext.GetPar( "TFBarMtr_To"), ".") ;
      AV52TFBarPie = (int)(GXutil.lval( httpContext.GetPar( "TFBarPie"))) ;
      AV53TFBarPie_To = (int)(GXutil.lval( httpContext.GetPar( "TFBarPie_To"))) ;
      AV54TFBarFecGen = localUtil.parseDateParm( httpContext.GetPar( "TFBarFecGen")) ;
      AV58TFBarFecCli = localUtil.parseDateParm( httpContext.GetPar( "TFBarFecCli")) ;
      AV62TFBarFecFpr = localUtil.parseDateParm( httpContext.GetPar( "TFBarFecFpr")) ;
      AV66TFBarFasCod = httpContext.GetPar( "TFBarFasCod") ;
      AV67TFBarFasCod_Sel = httpContext.GetPar( "TFBarFasCod_Sel") ;
      AV83TFBarMaqCod = httpContext.GetPar( "TFBarMaqCod") ;
      AV84TFBarMaqCod_Sel = httpContext.GetPar( "TFBarMaqCod_Sel") ;
      AV85TFBarSit = (byte)(GXutil.lval( httpContext.GetPar( "TFBarSit"))) ;
      AV86TFBarSit_To = (byte)(GXutil.lval( httpContext.GetPar( "TFBarSit_To"))) ;
      AV103TFBarAlbUltimo = GXutil.lval( httpContext.GetPar( "TFBarAlbUltimo")) ;
      AV104TFBarAlbUltimo_To = GXutil.lval( httpContext.GetPar( "TFBarAlbUltimo_To")) ;
      AV105TFBarAlbMts = CommonUtil.decimalVal( httpContext.GetPar( "TFBarAlbMts"), ".") ;
      AV106TFBarAlbMts_To = CommonUtil.decimalVal( httpContext.GetPar( "TFBarAlbMts_To"), ".") ;
      AV107TFBarAlbKgs = CommonUtil.decimalVal( httpContext.GetPar( "TFBarAlbKgs"), ".") ;
      AV108TFBarAlbKgs_To = CommonUtil.decimalVal( httpContext.GetPar( "TFBarAlbKgs_To"), ".") ;
      AV109TFBarCuaderno = httpContext.GetPar( "TFBarCuaderno") ;
      AV110TFBarCuaderno_Sel = httpContext.GetPar( "TFBarCuaderno_Sel") ;
      AV111TFBarNormas = httpContext.GetPar( "TFBarNormas") ;
      AV112TFBarNormas_Sel = httpContext.GetPar( "TFBarNormas_Sel") ;
      AV113TFBarAlbFact = (int)(GXutil.lval( httpContext.GetPar( "TFBarAlbFact"))) ;
      AV114TFBarAlbFact_To = (int)(GXutil.lval( httpContext.GetPar( "TFBarAlbFact_To"))) ;
      AV170Pgmname = httpContext.GetPar( "Pgmname") ;
      AV12OrderedBy = (short)(GXutil.lval( httpContext.GetPar( "OrderedBy"))) ;
      AV13OrderedDsc = GXutil.strtobool( httpContext.GetPar( "OrderedDsc")) ;
      AV87TotBarKgm = CommonUtil.decimalVal( httpContext.GetPar( "TotBarKgm"), ".") ;
      AV89TotBarMtr = CommonUtil.decimalVal( httpContext.GetPar( "TotBarMtr"), ".") ;
      AV91TotBarPie = GXutil.lval( httpContext.GetPar( "TotBarPie")) ;
      AV99TotKilosPendientes = CommonUtil.decimalVal( httpContext.GetPar( "TotKilosPendientes"), ".") ;
      AV101TotMetrosPendientes = CommonUtil.decimalVal( httpContext.GetPar( "TotMetrosPendientes"), ".") ;
      sPrefix = httpContext.GetPar( "sPrefix") ;
      init_default_properties( ) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV72Emprcod, AV73BarSit, AV74BarSit_to, AV75BarFecGen, AV76BarFecGen_to, AV77Clicod, AV78Clicod_to, AV79BarFecCli, AV80BarFecCli_to, AV25ManageFiltersExecutionStep, AV20ColumnsSelector, AV15FilterFullText, AV26TFCliCod, AV27TFCliCod_To, AV28TFCliNom, AV29TFCliNom_Sel, AV93TFPedidoCliente, AV94TFPedidoCliente_Sel, AV81TFBarNHdr, AV82TFBarNHdr_Sel, AV30TFBarSer, AV31TFBarSer_Sel, AV32TFBarSerDsc, AV33TFBarSerDsc_Sel, AV34TFBarTipArt, AV35TFBarTipArt_To, AV36TFBarTipArtDsc, AV37TFBarTipArtDsc_Sel, AV38TFBarColNom, AV39TFBarColNom_Sel, AV40TFBarColNum, AV41TFBarColNum_To, AV46TFBarNomCli, AV47TFBarNomCli_Sel, AV48TFBarKgm, AV49TFBarKgm_To, AV50TFBarMtr, AV51TFBarMtr_To, AV52TFBarPie, AV53TFBarPie_To, AV54TFBarFecGen, AV58TFBarFecCli, AV62TFBarFecFpr, AV66TFBarFasCod, AV67TFBarFasCod_Sel, AV83TFBarMaqCod, AV84TFBarMaqCod_Sel, AV85TFBarSit, AV86TFBarSit_To, AV103TFBarAlbUltimo, AV104TFBarAlbUltimo_To, AV105TFBarAlbMts, AV106TFBarAlbMts_To, AV107TFBarAlbKgs, AV108TFBarAlbKgs_To, AV109TFBarCuaderno, AV110TFBarCuaderno_Sel, AV111TFBarNormas, AV112TFBarNormas_Sel, AV113TFBarAlbFact, AV114TFBarAlbFact_To, AV170Pgmname, AV12OrderedBy, AV13OrderedDsc, AV87TotBarKgm, AV89TotBarMtr, AV91TotBarPie, AV99TotKilosPendientes, AV101TotMetrosPendientes, sPrefix) ;
      addString( httpContext.getJSONResponse( )) ;
      /* End function gxgrGrid_refresh_invoke */
   }

   public void webExecute( )
   {
      initweb( ) ;
      if ( ! isAjaxCallMode( ) )
      {
         pa1EF2( ) ;
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
         httpContext.writeValue( httpContext.getMessage( " Mantenimiento HDRs", "")) ;
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
      httpContext.AddJavascriptSource("DVelop/GridTitlesCategories/GridTitlesCategoriesRender.js", "", false, true);
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
         httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.listadodehdrs_wc", new String[] {GXutil.URLEncode(GXutil.rtrim(AV72Emprcod)),GXutil.URLEncode(GXutil.ltrimstr(AV73BarSit,2,0)),GXutil.URLEncode(GXutil.ltrimstr(AV74BarSit_to,2,0)),GXutil.URLEncode(GXutil.formatDateParm(AV75BarFecGen)),GXutil.URLEncode(GXutil.formatDateParm(AV76BarFecGen_to)),GXutil.URLEncode(GXutil.ltrimstr(AV77Clicod,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV78Clicod_to,6,0)),GXutil.URLEncode(GXutil.formatDateParm(AV79BarFecCli)),GXutil.URLEncode(GXutil.formatDateParm(AV80BarFecCli_to))}, new String[] {"Emprcod","BarSit","BarSit_to","BarFecGen","BarFecGen_to","Clicod","Clicod_to","BarFecCli","BarFecCli_to"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPGMNAME", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV170Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTBARKGM", getSecureSignedToken( sPrefix, localUtil.format( AV87TotBarKgm, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTBARMTR", getSecureSignedToken( sPrefix, localUtil.format( AV89TotBarMtr, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTBARPIE", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV91TotBarPie), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTKILOSPENDIENTES", getSecureSignedToken( sPrefix, localUtil.format( AV99TotKilosPendientes, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTMETROSPENDIENTES", getSecureSignedToken( sPrefix, localUtil.format( AV101TotMetrosPendientes, "ZZZZZ9.99")));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"nRC_GXsfl_41", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_41, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vMANAGEFILTERSDATA", AV23ManageFiltersData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vMANAGEFILTERSDATA", AV23ManageFiltersData);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGRIDCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV70GridCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGRIDPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV71GridPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV72Emprcod", GXutil.rtrim( wcpOAV72Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV73BarSit", GXutil.ltrim( localUtil.ntoc( wcpOAV73BarSit, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV74BarSit_to", GXutil.ltrim( localUtil.ntoc( wcpOAV74BarSit_to, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV75BarFecGen", localUtil.dtoc( wcpOAV75BarFecGen, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV76BarFecGen_to", localUtil.dtoc( wcpOAV76BarFecGen_to, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV77Clicod", GXutil.ltrim( localUtil.ntoc( wcpOAV77Clicod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV78Clicod_to", GXutil.ltrim( localUtil.ntoc( wcpOAV78Clicod_to, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV79BarFecCli", localUtil.dtoc( wcpOAV79BarFecCli, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV80BarFecCli_to", localUtil.dtoc( wcpOAV80BarFecCli_to, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMANAGEFILTERSEXECUTIONSTEP", GXutil.ltrim( localUtil.ntoc( AV25ManageFiltersExecutionStep, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFCLICOD", GXutil.ltrim( localUtil.ntoc( AV26TFCliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFCLICOD_TO", GXutil.ltrim( localUtil.ntoc( AV27TFCliCod_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFCLINOM", GXutil.rtrim( AV28TFCliNom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFCLINOM_SEL", GXutil.rtrim( AV29TFCliNom_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPEDIDOCLIENTE", GXutil.rtrim( AV93TFPedidoCliente));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPEDIDOCLIENTE_SEL", GXutil.rtrim( AV94TFPedidoCliente_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARNHDR", GXutil.rtrim( AV81TFBarNHdr));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARNHDR_SEL", GXutil.rtrim( AV82TFBarNHdr_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARSER", GXutil.rtrim( AV30TFBarSer));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARSER_SEL", GXutil.rtrim( AV31TFBarSer_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARSERDSC", GXutil.rtrim( AV32TFBarSerDsc));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARSERDSC_SEL", GXutil.rtrim( AV33TFBarSerDsc_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARTIPART", GXutil.ltrim( localUtil.ntoc( AV34TFBarTipArt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARTIPART_TO", GXutil.ltrim( localUtil.ntoc( AV35TFBarTipArt_To, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARTIPARTDSC", GXutil.rtrim( AV36TFBarTipArtDsc));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARTIPARTDSC_SEL", GXutil.rtrim( AV37TFBarTipArtDsc_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARCOLNOM", GXutil.rtrim( AV38TFBarColNom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARCOLNOM_SEL", GXutil.rtrim( AV39TFBarColNom_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARCOLNUM", GXutil.ltrim( localUtil.ntoc( AV40TFBarColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARCOLNUM_TO", GXutil.ltrim( localUtil.ntoc( AV41TFBarColNum_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARNOMCLI", GXutil.rtrim( AV46TFBarNomCli));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARNOMCLI_SEL", GXutil.rtrim( AV47TFBarNomCli_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARKGM", GXutil.ltrim( localUtil.ntoc( AV48TFBarKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARKGM_TO", GXutil.ltrim( localUtil.ntoc( AV49TFBarKgm_To, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARMTR", GXutil.ltrim( localUtil.ntoc( AV50TFBarMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARMTR_TO", GXutil.ltrim( localUtil.ntoc( AV51TFBarMtr_To, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARPIE", GXutil.ltrim( localUtil.ntoc( AV52TFBarPie, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARPIE_TO", GXutil.ltrim( localUtil.ntoc( AV53TFBarPie_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARFECGEN", localUtil.dtoc( AV54TFBarFecGen, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARFECCLI", localUtil.dtoc( AV58TFBarFecCli, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARFECFPR", localUtil.dtoc( AV62TFBarFecFpr, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARFASCOD", GXutil.rtrim( AV66TFBarFasCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARFASCOD_SEL", GXutil.rtrim( AV67TFBarFasCod_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARMAQCOD", GXutil.rtrim( AV83TFBarMaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARMAQCOD_SEL", GXutil.rtrim( AV84TFBarMaqCod_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARSIT", GXutil.ltrim( localUtil.ntoc( AV85TFBarSit, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARSIT_TO", GXutil.ltrim( localUtil.ntoc( AV86TFBarSit_To, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARALBULTIMO", GXutil.ltrim( localUtil.ntoc( AV103TFBarAlbUltimo, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARALBULTIMO_TO", GXutil.ltrim( localUtil.ntoc( AV104TFBarAlbUltimo_To, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARALBMTS", GXutil.ltrim( localUtil.ntoc( AV105TFBarAlbMts, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARALBMTS_TO", GXutil.ltrim( localUtil.ntoc( AV106TFBarAlbMts_To, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARALBKGS", GXutil.ltrim( localUtil.ntoc( AV107TFBarAlbKgs, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARALBKGS_TO", GXutil.ltrim( localUtil.ntoc( AV108TFBarAlbKgs_To, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARCUADERNO", GXutil.rtrim( AV109TFBarCuaderno));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARCUADERNO_SEL", GXutil.rtrim( AV110TFBarCuaderno_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARNORMAS", AV111TFBarNormas);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARNORMAS_SEL", AV112TFBarNormas_Sel);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARALBFACT", GXutil.ltrim( localUtil.ntoc( AV113TFBarAlbFact, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARALBFACT_TO", GXutil.ltrim( localUtil.ntoc( AV114TFBarAlbFact_To, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPGMNAME", GXutil.rtrim( AV170Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPGMNAME", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV170Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vORDEREDBY", GXutil.ltrim( localUtil.ntoc( AV12OrderedBy, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, sPrefix+"vORDEREDDSC", AV13OrderedDsc);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vEMPRCOD", GXutil.rtrim( AV72Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARSIT", GXutil.ltrim( localUtil.ntoc( AV73BarSit, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARSIT_TO", GXutil.ltrim( localUtil.ntoc( AV74BarSit_to, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARFECGEN", localUtil.dtoc( AV75BarFecGen, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARFECGEN_TO", localUtil.dtoc( AV76BarFecGen_to, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCLICOD", GXutil.ltrim( localUtil.ntoc( AV77Clicod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCLICOD_TO", GXutil.ltrim( localUtil.ntoc( AV78Clicod_to, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARFECCLI", localUtil.dtoc( AV79BarFecCli, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARFECCLI_TO", localUtil.dtoc( AV80BarFecCli_to, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOTBARKGM", GXutil.ltrim( localUtil.ntoc( AV87TotBarKgm, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTBARKGM", getSecureSignedToken( sPrefix, localUtil.format( AV87TotBarKgm, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOTBARMTR", GXutil.ltrim( localUtil.ntoc( AV89TotBarMtr, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTBARMTR", getSecureSignedToken( sPrefix, localUtil.format( AV89TotBarMtr, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOTBARPIE", GXutil.ltrim( localUtil.ntoc( AV91TotBarPie, (byte)(18), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTBARPIE", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV91TotBarPie), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOTKILOSPENDIENTES", GXutil.ltrim( localUtil.ntoc( AV99TotKilosPendientes, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTKILOSPENDIENTES", getSecureSignedToken( sPrefix, localUtil.format( AV99TotKilosPendientes, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOTMETROSPENDIENTES", GXutil.ltrim( localUtil.ntoc( AV101TotMetrosPendientes, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTMETROSPENDIENTES", getSecureSignedToken( sPrefix, localUtil.format( AV101TotMetrosPendientes, "ZZZZZ9.99")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vGRIDSTATE", AV10GridState);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vGRIDSTATE", AV10GridState);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"BARENCCLI", GXutil.rtrim( A4812BarEncCli));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"BARDISNUM", GXutil.rtrim( A143BarDisNum));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"BARPIENDES", GXutil.ltrim( localUtil.ntoc( A898BarPieNDes, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DISDES", GXutil.rtrim( A365DisDes));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"BARPIE1", GXutil.ltrim( localUtil.ntoc( A199BarPie1, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"BARCOD", GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"BARCODREO", GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"BARCODPAR", GXutil.rtrim( A130BarCodPar));
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Datalistproc", GXutil.rtrim( Ddo_grid_Datalistproc));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Caption", GXutil.rtrim( Ddo_gridcolumnsselector_Caption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Tooltip", GXutil.rtrim( Ddo_gridcolumnsselector_Tooltip));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Cls", GXutil.rtrim( Ddo_gridcolumnsselector_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Dropdownoptionstype", GXutil.rtrim( Ddo_gridcolumnsselector_Dropdownoptionstype));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Gridinternalname", GXutil.rtrim( Ddo_gridcolumnsselector_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Titlecontrolidtoreplace", GXutil.rtrim( Ddo_gridcolumnsselector_Titlecontrolidtoreplace));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_TITLESCATEGORIES_Gridinternalname", GXutil.rtrim( Grid_titlescategories_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_TITLESCATEGORIES_Gridtitlescategories", GXutil.rtrim( Grid_titlescategories_Gridtitlescategories));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Gridinternalname", GXutil.rtrim( Grid_empowerer_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Hascategories", GXutil.booltostr( Grid_empowerer_Hascategories));
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

   public void renderHtmlCloseForm1EF2( )
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
      return "ListadodeHDRs_WC" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( " Mantenimiento HDRs", "") ;
   }

   public void wb1EF0( )
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
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "app.listadodehdrs_wc");
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
            httpContext.AddJavascriptSource("DVelop/GridTitlesCategories/GridTitlesCategoriesRender.js", "", false, true);
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
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexport_Internalname, "gx.evt.setGridEvt("+GXutil.str( 41, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCaption", ""), bttBtnexport_Jsonclick, 5, httpContext.getMessage( "WWP_ExportTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOEXPORT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ListadodeHDRs_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexportcsv_Internalname, "gx.evt.setGridEvt("+GXutil.str( 41, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCSVCaption", ""), bttBtnexportcsv_Jsonclick, 5, httpContext.getMessage( "WWP_ExportCSVTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOEXPORTCSV\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ListadodeHDRs_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "hidden-xs" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtneditcolumns_Internalname, "gx.evt.setGridEvt("+GXutil.str( 41, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_EditColumnsCaption", ""), bttBtneditcolumns_Jsonclick, 0, httpContext.getMessage( "WWP_EditColumnsTooltip", ""), "", StyleString, ClassString, 1, 0, "standard", "'"+sPrefix+"'"+",false,"+"'"+""+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ListadodeHDRs_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         wb_table1_23_1EF2( true) ;
      }
      else
      {
         wb_table1_23_1EF2( false) ;
      }
      return  ;
   }

   public void wb_table1_23_1EF2e( boolean wbgen )
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
         wb_table2_87_1EF2( true) ;
      }
      else
      {
         wb_table2_87_1EF2( false) ;
      }
      return  ;
   }

   public void wb_table2_87_1EF2e( boolean wbgen )
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
         ucGridpaginationbar.setProperty("CurrentPage", AV70GridCurrentPage);
         ucGridpaginationbar.setProperty("PageCount", AV71GridPageCount);
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
         ucGrid_titlescategories.setProperty("GridTitlesCategories", Grid_titlescategories_Gridtitlescategories);
         ucGrid_titlescategories.render(context, "dvelop.gridtitlescategories", Grid_titlescategories_Internalname, sPrefix+"GRID_TITLESCATEGORIESContainer");
         /* User Defined Control */
         ucGrid_empowerer.setProperty("HasCategories", Grid_empowerer_Hascategories);
         ucGrid_empowerer.setProperty("HasTitleSettings", Grid_empowerer_Hastitlesettings);
         ucGrid_empowerer.setProperty("HasColumnsSelector", Grid_empowerer_Hascolumnsselector);
         ucGrid_empowerer.render(context, "wwp.gridempowerer", Grid_empowerer_Internalname, sPrefix+"GRID_EMPOWERERContainer");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDdo_barfecgenauxdates_Internalname, 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 149,'" + sPrefix + "',false,'" + sGXsfl_41_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDdo_barfecgenauxdate_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDdo_barfecgenauxdate_Internalname, localUtil.format(AV56DDO_BarFecGenAuxDate, "99/99/99"), localUtil.format( AV56DDO_BarFecGenAuxDate, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,149);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDdo_barfecgenauxdate_Jsonclick, 0, "Attribute", "", "", "", "", 1, 1, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ListadodeHDRs_WC.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDdo_barfecgenauxdate_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(1==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_ListadodeHDRs_WC.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDdo_barfeccliauxdates_Internalname, 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 151,'" + sPrefix + "',false,'" + sGXsfl_41_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDdo_barfeccliauxdate_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDdo_barfeccliauxdate_Internalname, localUtil.format(AV60DDO_BarFecCliAuxDate, "99/99/99"), localUtil.format( AV60DDO_BarFecCliAuxDate, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,151);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDdo_barfeccliauxdate_Jsonclick, 0, "Attribute", "", "", "", "", 1, 1, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ListadodeHDRs_WC.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDdo_barfeccliauxdate_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(1==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_ListadodeHDRs_WC.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDdo_barfecfprauxdates_Internalname, 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 153,'" + sPrefix + "',false,'" + sGXsfl_41_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDdo_barfecfprauxdate_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDdo_barfecfprauxdate_Internalname, localUtil.format(AV64DDO_BarFecFprAuxDate, "99/99/99"), localUtil.format( AV64DDO_BarFecFprAuxDate, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,153);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDdo_barfecfprauxdate_Jsonclick, 0, "Attribute", "", "", "", "", 1, 1, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ListadodeHDRs_WC.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDdo_barfecfprauxdate_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(1==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_ListadodeHDRs_WC.htm");
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

   public void start1EF2( )
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
            Form.getMeta().addItem("description", httpContext.getMessage( " Mantenimiento HDRs", ""), (short)(0)) ;
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
            strup1EF0( ) ;
         }
      }
   }

   public void ws1EF2( )
   {
      start1EF2( ) ;
      evt1EF2( ) ;
   }

   public void evt1EF2( )
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
                              strup1EF0( ) ;
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
                              strup1EF0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e111EF2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEPAGE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1EF0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e121EF2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1EF0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e131EF2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRID.ONOPTIONCLICKED") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1EF0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e141EF2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1EF0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e151EF2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORT'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1EF0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoExport' */
                                 e161EF2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORTCSV'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1EF0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoExportCSV' */
                                 e171EF2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1EF0( ) ;
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
                              strup1EF0( ) ;
                           }
                           nGXsfl_41_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_41_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_41_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_412( ) ;
                           A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           n252CliCod = false ;
                           A279CliNom = httpContext.cgiGet( edtCliNom_Internalname) ;
                           A13878PedidoClie = httpContext.cgiGet( edtPedidoClie_Internalname) ;
                           A13696BarNHdr = httpContext.cgiGet( edtBarNHdr_Internalname) ;
                           A212BarSer = httpContext.cgiGet( edtBarSer_Internalname) ;
                           A1652BarSerDsc = httpContext.cgiGet( edtBarSerDsc_Internalname) ;
                           A217BarTipArt = (short)(localUtil.ctol( httpContext.cgiGet( edtBarTipArt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           n217BarTipArt = false ;
                           A13711BarTipArtD = httpContext.cgiGet( edtBarTipArtD_Internalname) ;
                           n13711BarTipArtD = false ;
                           A135BarColNom = httpContext.cgiGet( edtBarColNom_Internalname) ;
                           A136BarColNum = (int)(localUtil.ctol( httpContext.cgiGet( edtBarColNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A218BarTipCol = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarTipCol_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A13868BarTipColD = httpContext.cgiGet( edtBarTipColD_Internalname) ;
                           A1234BarNomCli = httpContext.cgiGet( edtBarNomCli_Internalname) ;
                           A166BarKgm = localUtil.ctond( httpContext.cgiGet( edtBarKgm_Internalname)) ;
                           A184BarMtr = localUtil.ctond( httpContext.cgiGet( edtBarMtr_Internalname)) ;
                           A198BarPie = (int)(localUtil.ctol( httpContext.cgiGet( edtBarPie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A159BarFecGen = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtBarFecGen_Internalname), 0)) ;
                           A155BarFecCli = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtBarFecCli_Internalname), 0)) ;
                           A158BarFecFpr = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtBarFecFpr_Internalname), 0)) ;
                           A151BarFasCod = httpContext.cgiGet( edtBarFasCod_Internalname) ;
                           n151BarFasCod = false ;
                           A180BarMaqCod = httpContext.cgiGet( edtBarMaqCod_Internalname) ;
                           A213BarSit = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarSit_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A13930BarAlbUlti = localUtil.ctol( httpContext.cgiGet( edtBarAlbUlti_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
                           A13931BarAlbMts = localUtil.ctond( httpContext.cgiGet( edtBarAlbMts_Internalname)) ;
                           A13932BarAlbKgs = localUtil.ctond( httpContext.cgiGet( edtBarAlbKgs_Internalname)) ;
                           A13933BarCuadern = httpContext.cgiGet( edtBarCuadern_Internalname) ;
                           n13933BarCuadern = false ;
                           A13934BarNormas = httpContext.cgiGet( edtBarNormas_Internalname) ;
                           A13935BarAlbFact = (int)(localUtil.ctol( httpContext.cgiGet( edtBarAlbFact_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A13890BarHDSusp = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarHDSusp_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           n13890BarHDSusp = false ;
                           A13902BarNorma = httpContext.cgiGet( edtBarNorma_Internalname) ;
                           n13902BarNorma = false ;
                           A13903BarMatColo = (short)(localUtil.ctol( httpContext.cgiGet( edtBarMatColo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           n13903BarMatColo = false ;
                           A12881BarOEKOTEX = httpContext.cgiGet( edtBarOEKOTEX_Internalname) ;
                           n12881BarOEKOTEX = false ;
                           A2447BarFecEnE = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtBarFecEnE_Internalname), 0)) ;
                           A13904BarIntColo = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarIntColo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           n13904BarIntColo = false ;
                           A12809BarLocTel = httpContext.cgiGet( edtBarLocTel_Internalname) ;
                           A13907BarSerDsc2 = httpContext.cgiGet( edtBarSerDsc2_Internalname) ;
                           n13907BarSerDsc2 = false ;
                           A13908BarIdtx2 = httpContext.cgiGet( edtBarIdtx2_Internalname) ;
                           n13908BarIdtx2 = false ;
                           A13909BarIdtxDc = httpContext.cgiGet( edtBarIdtxDc_Internalname) ;
                           n13909BarIdtxDc = false ;
                           A13910BarColCv = httpContext.cgiGet( edtBarColCv_Internalname) ;
                           A13887KilosEntre = localUtil.ctond( httpContext.cgiGet( edtKilosEntre_Internalname)) ;
                           A13888MetrosEntr = (short)(localUtil.ctol( httpContext.cgiGet( edtMetrosEntr_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A13885KilosPendi = localUtil.ctond( httpContext.cgiGet( edtKilosPendi_Internalname)) ;
                           A13886MetrosPend = localUtil.ctond( httpContext.cgiGet( edtMetrosPend_Internalname)) ;
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
                                       e181EF2 ();
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
                                       e191EF2 ();
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
                                       e201EF2 ();
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
                                 /* No code required for Cancel button. It is implemented as the Reset button. */
                              }
                              else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                              {
                                 if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                                 {
                                    strup1EF0( ) ;
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

   public void we1EF2( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm1EF2( ) ;
         }
      }
   }

   public void pa1EF2( )
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
                                 String AV72Emprcod ,
                                 byte AV73BarSit ,
                                 byte AV74BarSit_to ,
                                 java.util.Date AV75BarFecGen ,
                                 java.util.Date AV76BarFecGen_to ,
                                 int AV77Clicod ,
                                 int AV78Clicod_to ,
                                 java.util.Date AV79BarFecCli ,
                                 java.util.Date AV80BarFecCli_to ,
                                 byte AV25ManageFiltersExecutionStep ,
                                 app.wwpbaseobjects.SdtWWPColumnsSelector AV20ColumnsSelector ,
                                 String AV15FilterFullText ,
                                 int AV26TFCliCod ,
                                 int AV27TFCliCod_To ,
                                 String AV28TFCliNom ,
                                 String AV29TFCliNom_Sel ,
                                 String AV93TFPedidoCliente ,
                                 String AV94TFPedidoCliente_Sel ,
                                 String AV81TFBarNHdr ,
                                 String AV82TFBarNHdr_Sel ,
                                 String AV30TFBarSer ,
                                 String AV31TFBarSer_Sel ,
                                 String AV32TFBarSerDsc ,
                                 String AV33TFBarSerDsc_Sel ,
                                 short AV34TFBarTipArt ,
                                 short AV35TFBarTipArt_To ,
                                 String AV36TFBarTipArtDsc ,
                                 String AV37TFBarTipArtDsc_Sel ,
                                 String AV38TFBarColNom ,
                                 String AV39TFBarColNom_Sel ,
                                 int AV40TFBarColNum ,
                                 int AV41TFBarColNum_To ,
                                 String AV46TFBarNomCli ,
                                 String AV47TFBarNomCli_Sel ,
                                 java.math.BigDecimal AV48TFBarKgm ,
                                 java.math.BigDecimal AV49TFBarKgm_To ,
                                 java.math.BigDecimal AV50TFBarMtr ,
                                 java.math.BigDecimal AV51TFBarMtr_To ,
                                 int AV52TFBarPie ,
                                 int AV53TFBarPie_To ,
                                 java.util.Date AV54TFBarFecGen ,
                                 java.util.Date AV58TFBarFecCli ,
                                 java.util.Date AV62TFBarFecFpr ,
                                 String AV66TFBarFasCod ,
                                 String AV67TFBarFasCod_Sel ,
                                 String AV83TFBarMaqCod ,
                                 String AV84TFBarMaqCod_Sel ,
                                 byte AV85TFBarSit ,
                                 byte AV86TFBarSit_To ,
                                 long AV103TFBarAlbUltimo ,
                                 long AV104TFBarAlbUltimo_To ,
                                 java.math.BigDecimal AV105TFBarAlbMts ,
                                 java.math.BigDecimal AV106TFBarAlbMts_To ,
                                 java.math.BigDecimal AV107TFBarAlbKgs ,
                                 java.math.BigDecimal AV108TFBarAlbKgs_To ,
                                 String AV109TFBarCuaderno ,
                                 String AV110TFBarCuaderno_Sel ,
                                 String AV111TFBarNormas ,
                                 String AV112TFBarNormas_Sel ,
                                 int AV113TFBarAlbFact ,
                                 int AV114TFBarAlbFact_To ,
                                 String AV170Pgmname ,
                                 short AV12OrderedBy ,
                                 boolean AV13OrderedDsc ,
                                 java.math.BigDecimal AV87TotBarKgm ,
                                 java.math.BigDecimal AV89TotBarMtr ,
                                 long AV91TotBarPie ,
                                 java.math.BigDecimal AV99TotKilosPendientes ,
                                 java.math.BigDecimal AV101TotMetrosPendientes ,
                                 String sPrefix )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e191EF2 ();
      GRID_nCurrentRecord = 0 ;
      rf1EF2( ) ;
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
      rf1EF2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV170Pgmname = "ListadodeHDRs_WC" ;
      Gx_err = (short)(0) ;
      edtavTotvaluebarkgm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvaluebarkgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluebarkgm_Enabled), 5, 0), true);
      edtavTotvaluebarmtr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvaluebarmtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluebarmtr_Enabled), 5, 0), true);
      edtavTotvaluebarpie_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvaluebarpie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluebarpie_Enabled), 5, 0), true);
   }

   public int subgridclient_rec_count_fnc( )
   {
      AV120Listadodehdrs_wcds_1_filterfulltext = AV15FilterFullText ;
      AV121Listadodehdrs_wcds_2_tfclicod = AV26TFCliCod ;
      AV122Listadodehdrs_wcds_3_tfclicod_to = AV27TFCliCod_To ;
      AV123Listadodehdrs_wcds_4_tfclinom = AV28TFCliNom ;
      AV124Listadodehdrs_wcds_5_tfclinom_sel = AV29TFCliNom_Sel ;
      AV125Listadodehdrs_wcds_6_tfpedidocliente = AV93TFPedidoCliente ;
      AV126Listadodehdrs_wcds_7_tfpedidocliente_sel = AV94TFPedidoCliente_Sel ;
      AV127Listadodehdrs_wcds_8_tfbarnhdr = AV81TFBarNHdr ;
      AV128Listadodehdrs_wcds_9_tfbarnhdr_sel = AV82TFBarNHdr_Sel ;
      AV129Listadodehdrs_wcds_10_tfbarser = AV30TFBarSer ;
      AV130Listadodehdrs_wcds_11_tfbarser_sel = AV31TFBarSer_Sel ;
      AV131Listadodehdrs_wcds_12_tfbarserdsc = AV32TFBarSerDsc ;
      AV132Listadodehdrs_wcds_13_tfbarserdsc_sel = AV33TFBarSerDsc_Sel ;
      AV133Listadodehdrs_wcds_14_tfbartipart = AV34TFBarTipArt ;
      AV134Listadodehdrs_wcds_15_tfbartipart_to = AV35TFBarTipArt_To ;
      AV135Listadodehdrs_wcds_16_tfbartipartdsc = AV36TFBarTipArtDsc ;
      AV136Listadodehdrs_wcds_17_tfbartipartdsc_sel = AV37TFBarTipArtDsc_Sel ;
      AV137Listadodehdrs_wcds_18_tfbarcolnom = AV38TFBarColNom ;
      AV138Listadodehdrs_wcds_19_tfbarcolnom_sel = AV39TFBarColNom_Sel ;
      AV139Listadodehdrs_wcds_20_tfbarcolnum = AV40TFBarColNum ;
      AV140Listadodehdrs_wcds_21_tfbarcolnum_to = AV41TFBarColNum_To ;
      AV141Listadodehdrs_wcds_22_tfbarnomcli = AV46TFBarNomCli ;
      AV142Listadodehdrs_wcds_23_tfbarnomcli_sel = AV47TFBarNomCli_Sel ;
      AV143Listadodehdrs_wcds_24_tfbarkgm = AV48TFBarKgm ;
      AV144Listadodehdrs_wcds_25_tfbarkgm_to = AV49TFBarKgm_To ;
      AV145Listadodehdrs_wcds_26_tfbarmtr = AV50TFBarMtr ;
      AV146Listadodehdrs_wcds_27_tfbarmtr_to = AV51TFBarMtr_To ;
      AV147Listadodehdrs_wcds_28_tfbarpie = AV52TFBarPie ;
      AV148Listadodehdrs_wcds_29_tfbarpie_to = AV53TFBarPie_To ;
      AV149Listadodehdrs_wcds_30_tfbarfecgen = AV54TFBarFecGen ;
      AV150Listadodehdrs_wcds_31_tfbarfeccli = AV58TFBarFecCli ;
      AV151Listadodehdrs_wcds_32_tfbarfecfpr = AV62TFBarFecFpr ;
      AV152Listadodehdrs_wcds_33_tfbarfascod = AV66TFBarFasCod ;
      AV153Listadodehdrs_wcds_34_tfbarfascod_sel = AV67TFBarFasCod_Sel ;
      AV154Listadodehdrs_wcds_35_tfbarmaqcod = AV83TFBarMaqCod ;
      AV155Listadodehdrs_wcds_36_tfbarmaqcod_sel = AV84TFBarMaqCod_Sel ;
      AV156Listadodehdrs_wcds_37_tfbarsit = AV85TFBarSit ;
      AV157Listadodehdrs_wcds_38_tfbarsit_to = AV86TFBarSit_To ;
      AV158Listadodehdrs_wcds_39_tfbaralbultimo = AV103TFBarAlbUltimo ;
      AV159Listadodehdrs_wcds_40_tfbaralbultimo_to = AV104TFBarAlbUltimo_To ;
      AV160Listadodehdrs_wcds_41_tfbaralbmts = AV105TFBarAlbMts ;
      AV161Listadodehdrs_wcds_42_tfbaralbmts_to = AV106TFBarAlbMts_To ;
      AV162Listadodehdrs_wcds_43_tfbaralbkgs = AV107TFBarAlbKgs ;
      AV163Listadodehdrs_wcds_44_tfbaralbkgs_to = AV108TFBarAlbKgs_To ;
      AV164Listadodehdrs_wcds_45_tfbarcuaderno = AV109TFBarCuaderno ;
      AV165Listadodehdrs_wcds_46_tfbarcuaderno_sel = AV110TFBarCuaderno_Sel ;
      AV166Listadodehdrs_wcds_47_tfbarnormas = AV111TFBarNormas ;
      AV167Listadodehdrs_wcds_48_tfbarnormas_sel = AV112TFBarNormas_Sel ;
      AV168Listadodehdrs_wcds_49_tfbaralbfact = AV113TFBarAlbFact ;
      AV169Listadodehdrs_wcds_50_tfbaralbfact_to = AV114TFBarAlbFact_To ;
      GRID_nRecordCount = 0 ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Integer.valueOf(AV121Listadodehdrs_wcds_2_tfclicod) ,
                                           Integer.valueOf(AV122Listadodehdrs_wcds_3_tfclicod_to) ,
                                           AV124Listadodehdrs_wcds_5_tfclinom_sel ,
                                           AV123Listadodehdrs_wcds_4_tfclinom ,
                                           AV128Listadodehdrs_wcds_9_tfbarnhdr_sel ,
                                           AV127Listadodehdrs_wcds_8_tfbarnhdr ,
                                           AV130Listadodehdrs_wcds_11_tfbarser_sel ,
                                           AV129Listadodehdrs_wcds_10_tfbarser ,
                                           AV132Listadodehdrs_wcds_13_tfbarserdsc_sel ,
                                           AV131Listadodehdrs_wcds_12_tfbarserdsc ,
                                           Short.valueOf(AV133Listadodehdrs_wcds_14_tfbartipart) ,
                                           Short.valueOf(AV134Listadodehdrs_wcds_15_tfbartipart_to) ,
                                           AV136Listadodehdrs_wcds_17_tfbartipartdsc_sel ,
                                           AV135Listadodehdrs_wcds_16_tfbartipartdsc ,
                                           AV138Listadodehdrs_wcds_19_tfbarcolnom_sel ,
                                           AV137Listadodehdrs_wcds_18_tfbarcolnom ,
                                           Integer.valueOf(AV139Listadodehdrs_wcds_20_tfbarcolnum) ,
                                           Integer.valueOf(AV140Listadodehdrs_wcds_21_tfbarcolnum_to) ,
                                           AV142Listadodehdrs_wcds_23_tfbarnomcli_sel ,
                                           AV141Listadodehdrs_wcds_22_tfbarnomcli ,
                                           AV143Listadodehdrs_wcds_24_tfbarkgm ,
                                           AV144Listadodehdrs_wcds_25_tfbarkgm_to ,
                                           AV145Listadodehdrs_wcds_26_tfbarmtr ,
                                           AV146Listadodehdrs_wcds_27_tfbarmtr_to ,
                                           AV149Listadodehdrs_wcds_30_tfbarfecgen ,
                                           AV150Listadodehdrs_wcds_31_tfbarfeccli ,
                                           AV151Listadodehdrs_wcds_32_tfbarfecfpr ,
                                           AV155Listadodehdrs_wcds_36_tfbarmaqcod_sel ,
                                           AV154Listadodehdrs_wcds_35_tfbarmaqcod ,
                                           Byte.valueOf(AV156Listadodehdrs_wcds_37_tfbarsit) ,
                                           Byte.valueOf(AV157Listadodehdrs_wcds_38_tfbarsit_to) ,
                                           AV160Listadodehdrs_wcds_41_tfbaralbmts ,
                                           AV161Listadodehdrs_wcds_42_tfbaralbmts_to ,
                                           AV162Listadodehdrs_wcds_43_tfbaralbkgs ,
                                           AV163Listadodehdrs_wcds_44_tfbaralbkgs_to ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           A212BarSer ,
                                           A1652BarSerDsc ,
                                           Short.valueOf(A217BarTipArt) ,
                                           A13711BarTipArtD ,
                                           A135BarColNom ,
                                           Integer.valueOf(A136BarColNum) ,
                                           A1234BarNomCli ,
                                           A166BarKgm ,
                                           A184BarMtr ,
                                           A159BarFecGen ,
                                           A155BarFecCli ,
                                           A158BarFecFpr ,
                                           A180BarMaqCod ,
                                           Byte.valueOf(A213BarSit) ,
                                           A13931BarAlbMts ,
                                           A13932BarAlbKgs ,
                                           Short.valueOf(AV12OrderedBy) ,
                                           Boolean.valueOf(AV13OrderedDsc) ,
                                           AV120Listadodehdrs_wcds_1_filterfulltext ,
                                           A13878PedidoClie ,
                                           A13696BarNHdr ,
                                           Integer.valueOf(A198BarPie) ,
                                           A151BarFasCod ,
                                           Long.valueOf(A13930BarAlbUlti) ,
                                           A13933BarCuadern ,
                                           A13934BarNormas ,
                                           Integer.valueOf(A13935BarAlbFact) ,
                                           AV126Listadodehdrs_wcds_7_tfpedidocliente_sel ,
                                           AV125Listadodehdrs_wcds_6_tfpedidocliente ,
                                           Integer.valueOf(AV147Listadodehdrs_wcds_28_tfbarpie) ,
                                           Integer.valueOf(AV148Listadodehdrs_wcds_29_tfbarpie_to) ,
                                           AV153Listadodehdrs_wcds_34_tfbarfascod_sel ,
                                           AV152Listadodehdrs_wcds_33_tfbarfascod ,
                                           Long.valueOf(AV158Listadodehdrs_wcds_39_tfbaralbultimo) ,
                                           Long.valueOf(AV159Listadodehdrs_wcds_40_tfbaralbultimo_to) ,
                                           AV165Listadodehdrs_wcds_46_tfbarcuaderno_sel ,
                                           AV164Listadodehdrs_wcds_45_tfbarcuaderno ,
                                           AV167Listadodehdrs_wcds_48_tfbarnormas_sel ,
                                           AV166Listadodehdrs_wcds_47_tfbarnormas ,
                                           Integer.valueOf(AV168Listadodehdrs_wcds_49_tfbaralbfact) ,
                                           Integer.valueOf(AV169Listadodehdrs_wcds_50_tfbaralbfact_to) ,
                                           AV75BarFecGen ,
                                           AV76BarFecGen_to ,
                                           AV79BarFecCli ,
                                           AV80BarFecCli_to ,
                                           Byte.valueOf(AV73BarSit) ,
                                           Byte.valueOf(AV74BarSit_to) ,
                                           AV72Emprcod ,
                                           Integer.valueOf(AV77Clicod) ,
                                           A396EmprCod ,
                                           Integer.valueOf(AV78Clicod_to) } ,
                                           new int[]{
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE,
                                           TypeConstants.BYTE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.LONG,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT
                                           }
      });
      lV152Listadodehdrs_wcds_33_tfbarfascod = GXutil.padr( GXutil.rtrim( AV152Listadodehdrs_wcds_33_tfbarfascod), 8, "%") ;
      lV164Listadodehdrs_wcds_45_tfbarcuaderno = GXutil.padr( GXutil.rtrim( AV164Listadodehdrs_wcds_45_tfbarcuaderno), 20, "%") ;
      lV123Listadodehdrs_wcds_4_tfclinom = GXutil.padr( GXutil.rtrim( AV123Listadodehdrs_wcds_4_tfclinom), 30, "%") ;
      lV127Listadodehdrs_wcds_8_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV127Listadodehdrs_wcds_8_tfbarnhdr), 11, "%") ;
      lV129Listadodehdrs_wcds_10_tfbarser = GXutil.padr( GXutil.rtrim( AV129Listadodehdrs_wcds_10_tfbarser), 16, "%") ;
      lV131Listadodehdrs_wcds_12_tfbarserdsc = GXutil.padr( GXutil.rtrim( AV131Listadodehdrs_wcds_12_tfbarserdsc), 26, "%") ;
      lV135Listadodehdrs_wcds_16_tfbartipartdsc = GXutil.padr( GXutil.rtrim( AV135Listadodehdrs_wcds_16_tfbartipartdsc), 30, "%") ;
      lV137Listadodehdrs_wcds_18_tfbarcolnom = GXutil.padr( GXutil.rtrim( AV137Listadodehdrs_wcds_18_tfbarcolnom), 13, "%") ;
      lV141Listadodehdrs_wcds_22_tfbarnomcli = GXutil.padr( GXutil.rtrim( AV141Listadodehdrs_wcds_22_tfbarnomcli), 13, "%") ;
      lV154Listadodehdrs_wcds_35_tfbarmaqcod = GXutil.padr( GXutil.rtrim( AV154Listadodehdrs_wcds_35_tfbarmaqcod), 6, "%") ;
      /* Using cursor H01EF9 */
      pr_default.execute(0, new Object[] {A396EmprCod, A396EmprCod, Integer.valueOf(A361DisCod), AV72Emprcod, Integer.valueOf(AV77Clicod), AV153Listadodehdrs_wcds_34_tfbarfascod_sel, AV152Listadodehdrs_wcds_33_tfbarfascod, lV152Listadodehdrs_wcds_33_tfbarfascod, AV153Listadodehdrs_wcds_34_tfbarfascod_sel, AV153Listadodehdrs_wcds_34_tfbarfascod_sel, AV165Listadodehdrs_wcds_46_tfbarcuaderno_sel, AV164Listadodehdrs_wcds_45_tfbarcuaderno, lV164Listadodehdrs_wcds_45_tfbarcuaderno, AV165Listadodehdrs_wcds_46_tfbarcuaderno_sel, AV165Listadodehdrs_wcds_46_tfbarcuaderno_sel, AV75BarFecGen, AV76BarFecGen_to, AV79BarFecCli, AV80BarFecCli_to, AV80BarFecCli_to, Byte.valueOf(AV73BarSit), Byte.valueOf(AV74BarSit_to), Integer.valueOf(AV78Clicod_to), Integer.valueOf(AV121Listadodehdrs_wcds_2_tfclicod), Integer.valueOf(AV122Listadodehdrs_wcds_3_tfclicod_to), lV123Listadodehdrs_wcds_4_tfclinom, AV124Listadodehdrs_wcds_5_tfclinom_sel, lV127Listadodehdrs_wcds_8_tfbarnhdr, AV128Listadodehdrs_wcds_9_tfbarnhdr_sel, lV129Listadodehdrs_wcds_10_tfbarser, AV130Listadodehdrs_wcds_11_tfbarser_sel, lV131Listadodehdrs_wcds_12_tfbarserdsc, AV132Listadodehdrs_wcds_13_tfbarserdsc_sel, Short.valueOf(AV133Listadodehdrs_wcds_14_tfbartipart), Short.valueOf(AV134Listadodehdrs_wcds_15_tfbartipart_to), lV135Listadodehdrs_wcds_16_tfbartipartdsc, AV136Listadodehdrs_wcds_17_tfbartipartdsc_sel, lV137Listadodehdrs_wcds_18_tfbarcolnom, AV138Listadodehdrs_wcds_19_tfbarcolnom_sel, Integer.valueOf(AV139Listadodehdrs_wcds_20_tfbarcolnum), Integer.valueOf(AV140Listadodehdrs_wcds_21_tfbarcolnum_to), lV141Listadodehdrs_wcds_22_tfbarnomcli, AV142Listadodehdrs_wcds_23_tfbarnomcli_sel, AV143Listadodehdrs_wcds_24_tfbarkgm, AV144Listadodehdrs_wcds_25_tfbarkgm_to, AV145Listadodehdrs_wcds_26_tfbarmtr, AV146Listadodehdrs_wcds_27_tfbarmtr_to, AV149Listadodehdrs_wcds_30_tfbarfecgen, AV150Listadodehdrs_wcds_31_tfbarfeccli, AV151Listadodehdrs_wcds_32_tfbarfecfpr, lV154Listadodehdrs_wcds_35_tfbarmaqcod, AV155Listadodehdrs_wcds_36_tfbarmaqcod_sel, Byte.valueOf(AV156Listadodehdrs_wcds_37_tfbarsit), Byte.valueOf(AV157Listadodehdrs_wcds_38_tfbarsit_to), AV160Listadodehdrs_wcds_41_tfbaralbmts, AV161Listadodehdrs_wcds_42_tfbaralbmts_to, AV162Listadodehdrs_wcds_43_tfbaralbkgs, AV163Listadodehdrs_wcds_44_tfbaralbkgs_to});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A4466BarAcaAnh = H01EF9_A4466BarAcaAnh[0] ;
         A13909BarIdtxDc = H01EF9_A13909BarIdtxDc[0] ;
         n13909BarIdtxDc = H01EF9_n13909BarIdtxDc[0] ;
         A13908BarIdtx2 = H01EF9_A13908BarIdtx2[0] ;
         n13908BarIdtx2 = H01EF9_n13908BarIdtx2[0] ;
         A13907BarSerDsc2 = H01EF9_A13907BarSerDsc2[0] ;
         n13907BarSerDsc2 = H01EF9_n13907BarSerDsc2[0] ;
         A12809BarLocTel = H01EF9_A12809BarLocTel[0] ;
         A2447BarFecEnE = H01EF9_A2447BarFecEnE[0] ;
         A12881BarOEKOTEX = H01EF9_A12881BarOEKOTEX[0] ;
         n12881BarOEKOTEX = H01EF9_n12881BarOEKOTEX[0] ;
         A213BarSit = H01EF9_A213BarSit[0] ;
         A180BarMaqCod = H01EF9_A180BarMaqCod[0] ;
         A158BarFecFpr = H01EF9_A158BarFecFpr[0] ;
         A155BarFecCli = H01EF9_A155BarFecCli[0] ;
         A159BarFecGen = H01EF9_A159BarFecGen[0] ;
         A1234BarNomCli = H01EF9_A1234BarNomCli[0] ;
         A136BarColNum = H01EF9_A136BarColNum[0] ;
         A135BarColNom = H01EF9_A135BarColNom[0] ;
         A13711BarTipArtD = H01EF9_A13711BarTipArtD[0] ;
         n13711BarTipArtD = H01EF9_n13711BarTipArtD[0] ;
         A217BarTipArt = H01EF9_A217BarTipArt[0] ;
         n217BarTipArt = H01EF9_n217BarTipArt[0] ;
         A1652BarSerDsc = H01EF9_A1652BarSerDsc[0] ;
         A212BarSer = H01EF9_A212BarSer[0] ;
         A13696BarNHdr = H01EF9_A13696BarNHdr[0] ;
         A279CliNom = H01EF9_A279CliNom[0] ;
         A252CliCod = H01EF9_A252CliCod[0] ;
         n252CliCod = H01EF9_n252CliCod[0] ;
         A13904BarIntColo = H01EF9_A13904BarIntColo[0] ;
         n13904BarIntColo = H01EF9_n13904BarIntColo[0] ;
         A13903BarMatColo = H01EF9_A13903BarMatColo[0] ;
         n13903BarMatColo = H01EF9_n13903BarMatColo[0] ;
         A13902BarNorma = H01EF9_A13902BarNorma[0] ;
         n13902BarNorma = H01EF9_n13902BarNorma[0] ;
         A13890BarHDSusp = H01EF9_A13890BarHDSusp[0] ;
         n13890BarHDSusp = H01EF9_n13890BarHDSusp[0] ;
         A13933BarCuadern = H01EF9_A13933BarCuadern[0] ;
         n13933BarCuadern = H01EF9_n13933BarCuadern[0] ;
         A13932BarAlbKgs = H01EF9_A13932BarAlbKgs[0] ;
         A13931BarAlbMts = H01EF9_A13931BarAlbMts[0] ;
         A151BarFasCod = H01EF9_A151BarFasCod[0] ;
         n151BarFasCod = H01EF9_n151BarFasCod[0] ;
         A143BarDisNum = H01EF9_A143BarDisNum[0] ;
         A4812BarEncCli = H01EF9_A4812BarEncCli[0] ;
         A218BarTipCol = H01EF9_A218BarTipCol[0] ;
         A199BarPie1 = H01EF9_A199BarPie1[0] ;
         A365DisDes = H01EF9_A365DisDes[0] ;
         A898BarPieNDes = H01EF9_A898BarPieNDes[0] ;
         A361DisCod = H01EF9_A361DisCod[0] ;
         A130BarCodPar = H01EF9_A130BarCodPar[0] ;
         A132BarCodReo = H01EF9_A132BarCodReo[0] ;
         A129BarCod = H01EF9_A129BarCod[0] ;
         A396EmprCod = H01EF9_A396EmprCod[0] ;
         A13887KilosEntre = H01EF9_A13887KilosEntre[0] ;
         A166BarKgm = H01EF9_A166BarKgm[0] ;
         A13888MetrosEntr = H01EF9_A13888MetrosEntr[0] ;
         A184BarMtr = H01EF9_A184BarMtr[0] ;
         A13890BarHDSusp = H01EF9_A13890BarHDSusp[0] ;
         n13890BarHDSusp = H01EF9_n13890BarHDSusp[0] ;
         A13711BarTipArtD = H01EF9_A13711BarTipArtD[0] ;
         n13711BarTipArtD = H01EF9_n13711BarTipArtD[0] ;
         A13909BarIdtxDc = H01EF9_A13909BarIdtxDc[0] ;
         n13909BarIdtxDc = H01EF9_n13909BarIdtxDc[0] ;
         A279CliNom = H01EF9_A279CliNom[0] ;
         A199BarPie1 = H01EF9_A199BarPie1[0] ;
         A898BarPieNDes = H01EF9_A898BarPieNDes[0] ;
         A166BarKgm = H01EF9_A166BarKgm[0] ;
         A184BarMtr = H01EF9_A184BarMtr[0] ;
         A13887KilosEntre = H01EF9_A13887KilosEntre[0] ;
         A13888MetrosEntr = H01EF9_A13888MetrosEntr[0] ;
         A13904BarIntColo = H01EF9_A13904BarIntColo[0] ;
         n13904BarIntColo = H01EF9_n13904BarIntColo[0] ;
         A13903BarMatColo = H01EF9_A13903BarMatColo[0] ;
         n13903BarMatColo = H01EF9_n13903BarMatColo[0] ;
         A13933BarCuadern = H01EF9_A13933BarCuadern[0] ;
         n13933BarCuadern = H01EF9_n13933BarCuadern[0] ;
         A13932BarAlbKgs = H01EF9_A13932BarAlbKgs[0] ;
         A13931BarAlbMts = H01EF9_A13931BarAlbMts[0] ;
         A151BarFasCod = H01EF9_A151BarFasCod[0] ;
         n151BarFasCod = H01EF9_n151BarFasCod[0] ;
         A13902BarNorma = H01EF9_A13902BarNorma[0] ;
         n13902BarNorma = H01EF9_n13902BarNorma[0] ;
         GXt_char1 = A13878PedidoClie ;
         GXv_char2[0] = A396EmprCod ;
         GXv_char3[0] = A4812BarEncCli ;
         GXv_char4[0] = A143BarDisNum ;
         GXv_char5[0] = GXt_char1 ;
         new app.core.ppedidocliente_formula(remoteHandle, context).execute( GXv_char2, GXv_char3, GXv_char4, GXv_char5) ;
         listadodehdrs_wc_impl.this.A396EmprCod = GXv_char2[0] ;
         listadodehdrs_wc_impl.this.A4812BarEncCli = GXv_char3[0] ;
         listadodehdrs_wc_impl.this.A143BarDisNum = GXv_char4[0] ;
         listadodehdrs_wc_impl.this.GXt_char1 = GXv_char5[0] ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A4812BarEncCli", A4812BarEncCli);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A143BarDisNum", A143BarDisNum);
         A13878PedidoClie = GXt_char1 ;
         if ( ! ( (GXutil.strcmp("", AV126Listadodehdrs_wcds_7_tfpedidocliente_sel)==0) && ( ! (GXutil.strcmp("", AV125Listadodehdrs_wcds_6_tfpedidocliente)==0) ) ) || ( GXutil.like( GXutil.upper( A13878PedidoClie) , GXutil.padr( "%" + GXutil.upper( AV125Listadodehdrs_wcds_6_tfpedidocliente) , 255 , "%"),  ' ' ) ) )
         {
            if ( (GXutil.strcmp("", AV126Listadodehdrs_wcds_7_tfpedidocliente_sel)==0) || ( ( GXutil.strcmp(A13878PedidoClie, AV126Listadodehdrs_wcds_7_tfpedidocliente_sel) == 0 ) ) )
            {
               GXt_char1 = A13868BarTipColD ;
               GXv_char5[0] = A396EmprCod ;
               GXv_int6[0] = A218BarTipCol ;
               GXv_char4[0] = GXt_char1 ;
               new app.pfcoldsc(remoteHandle, context).execute( GXv_char5, GXv_int6, GXv_char4) ;
               listadodehdrs_wc_impl.this.A396EmprCod = GXv_char5[0] ;
               listadodehdrs_wc_impl.this.A218BarTipCol = GXv_int6[0] ;
               listadodehdrs_wc_impl.this.GXt_char1 = GXv_char4[0] ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
               A13868BarTipColD = GXt_char1 ;
               GXt_int7 = A13930BarAlbUlti ;
               GXv_int8[0] = GXt_int7 ;
               new app.produccion.consultadeproduccion_albaranultimo(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, GXv_int8) ;
               listadodehdrs_wc_impl.this.GXt_int7 = GXv_int8[0] ;
               A13930BarAlbUlti = GXt_int7 ;
               if ( (0==AV158Listadodehdrs_wcds_39_tfbaralbultimo) || ( ( A13930BarAlbUlti >= AV158Listadodehdrs_wcds_39_tfbaralbultimo ) ) )
               {
                  if ( (0==AV159Listadodehdrs_wcds_40_tfbaralbultimo_to) || ( ( A13930BarAlbUlti <= AV159Listadodehdrs_wcds_40_tfbaralbultimo_to ) ) )
                  {
                     GXt_char1 = A13934BarNormas ;
                     GXv_char5[0] = GXt_char1 ;
                     new app.produccion.consultadeproduccion_normasestandarstextiles(remoteHandle, context).execute( A396EmprCod, A361DisCod, GXv_char5) ;
                     listadodehdrs_wc_impl.this.GXt_char1 = GXv_char5[0] ;
                     A13934BarNormas = GXt_char1 ;
                     if ( ! ( (GXutil.strcmp("", AV167Listadodehdrs_wcds_48_tfbarnormas_sel)==0) && ( ! (GXutil.strcmp("", AV166Listadodehdrs_wcds_47_tfbarnormas)==0) ) ) || ( GXutil.like( GXutil.upper( A13934BarNormas) , GXutil.padr( "%" + GXutil.upper( AV166Listadodehdrs_wcds_47_tfbarnormas) , 255 , "%"),  ' ' ) ) )
                     {
                        if ( (GXutil.strcmp("", AV167Listadodehdrs_wcds_48_tfbarnormas_sel)==0) || ( ( GXutil.strcmp(A13934BarNormas, AV167Listadodehdrs_wcds_48_tfbarnormas_sel) == 0 ) ) )
                        {
                           GXt_int9 = A13935BarAlbFact ;
                           GXv_int10[0] = GXt_int9 ;
                           new app.produccion.consultadeproduccion_factura(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, GXv_int10) ;
                           listadodehdrs_wc_impl.this.GXt_int9 = GXv_int10[0] ;
                           A13935BarAlbFact = GXt_int9 ;
                           if ( (0==AV168Listadodehdrs_wcds_49_tfbaralbfact) || ( ( A13935BarAlbFact >= AV168Listadodehdrs_wcds_49_tfbaralbfact ) ) )
                           {
                              if ( (0==AV169Listadodehdrs_wcds_50_tfbaralbfact_to) || ( ( A13935BarAlbFact <= AV169Listadodehdrs_wcds_50_tfbaralbfact_to ) ) )
                              {
                                 GXt_char1 = A13910BarColCv ;
                                 GXv_char5[0] = A396EmprCod ;
                                 GXv_int10[0] = A129BarCod ;
                                 GXv_int6[0] = A132BarCodReo ;
                                 GXv_char4[0] = A130BarCodPar ;
                                 GXv_char3[0] = GXt_char1 ;
                                 new app.pnortt(remoteHandle, context).execute( GXv_char5, GXv_int10, GXv_int6, GXv_char4, GXv_char3) ;
                                 listadodehdrs_wc_impl.this.A396EmprCod = GXv_char5[0] ;
                                 listadodehdrs_wc_impl.this.A129BarCod = GXv_int10[0] ;
                                 listadodehdrs_wc_impl.this.A132BarCodReo = GXv_int6[0] ;
                                 listadodehdrs_wc_impl.this.A130BarCodPar = GXv_char4[0] ;
                                 listadodehdrs_wc_impl.this.GXt_char1 = GXv_char3[0] ;
                                 httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
                                 httpContext.ajax_rsp_assign_attri(sPrefix, false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
                                 httpContext.ajax_rsp_assign_attri(sPrefix, false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
                                 httpContext.ajax_rsp_assign_attri(sPrefix, false, "A130BarCodPar", A130BarCodPar);
                                 A13910BarColCv = GXt_char1 ;
                                 if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
                                 {
                                    A198BarPie = A898BarPieNDes ;
                                 }
                                 else
                                 {
                                    A198BarPie = A199BarPie1 ;
                                 }
                                 if ( (GXutil.strcmp("", AV120Listadodehdrs_wcds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A252CliCod, 6, 0) , GXutil.padr( "%" + AV120Listadodehdrs_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV120Listadodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13878PedidoClie) , GXutil.padr( "%" + GXutil.upper( AV120Listadodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13696BarNHdr) , GXutil.padr( "%" + GXutil.upper( AV120Listadodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A212BarSer) , GXutil.padr( "%" + GXutil.upper( AV120Listadodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1652BarSerDsc) , GXutil.padr( "%" + GXutil.upper( AV120Listadodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A217BarTipArt, 4, 0) , GXutil.padr( "%" + AV120Listadodehdrs_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13711BarTipArtD) , GXutil.padr( "%" + GXutil.upper( AV120Listadodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A135BarColNom) , GXutil.padr( "%" + GXutil.upper( AV120Listadodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A136BarColNum, 6, 0) , GXutil.padr( "%" + AV120Listadodehdrs_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1234BarNomCli) , GXutil.padr( "%" + GXutil.upper( AV120Listadodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A166BarKgm, 9, 2) , GXutil.padr( "%" + AV120Listadodehdrs_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A184BarMtr, 9, 2) , GXutil.padr( "%" + AV120Listadodehdrs_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A198BarPie, 6, 0) , GXutil.padr( "%" + AV120Listadodehdrs_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A151BarFasCod) , GXutil.padr( "%" + GXutil.upper( AV120Listadodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A180BarMaqCod) , GXutil.padr( "%" + GXutil.upper( AV120Listadodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A213BarSit, 2, 0) , GXutil.padr( "%" + AV120Listadodehdrs_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A13930BarAlbUlti, 10, 0) , GXutil.padr( "%" + AV120Listadodehdrs_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A13931BarAlbMts, 9, 2) , GXutil.padr( "%" + AV120Listadodehdrs_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A13932BarAlbKgs, 9, 2) , GXutil.padr( "%" + AV120Listadodehdrs_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13933BarCuadern) , GXutil.padr( "%" + GXutil.upper( AV120Listadodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13934BarNormas) , GXutil.padr( "%" + GXutil.upper( AV120Listadodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A13935BarAlbFact, 8, 0) , GXutil.padr( "%" + AV120Listadodehdrs_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) ) )
                                 {
                                    if ( (0==AV147Listadodehdrs_wcds_28_tfbarpie) || ( ( A198BarPie >= AV147Listadodehdrs_wcds_28_tfbarpie ) ) )
                                    {
                                       if ( (0==AV148Listadodehdrs_wcds_29_tfbarpie_to) || ( ( A198BarPie <= AV148Listadodehdrs_wcds_29_tfbarpie_to ) ) )
                                       {
                                          A13885KilosPendi = (A166BarKgm.subtract(A13887KilosEntre)) ;
                                          A13886MetrosPend = (A184BarMtr.subtract(DecimalUtil.doubleToDec(A13888MetrosEntr))) ;
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
         pr_default.readNext(0);
      }
      GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
      pr_default.close(0);
      return (int)(GRID_nRecordCount) ;
   }

   public void rf1EF2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(41) ;
      /* Execute user event: Refresh */
      e191EF2 ();
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
         pr_default.dynParam(1, new Object[]{ new Object[]{
                                              Integer.valueOf(AV121Listadodehdrs_wcds_2_tfclicod) ,
                                              Integer.valueOf(AV122Listadodehdrs_wcds_3_tfclicod_to) ,
                                              AV124Listadodehdrs_wcds_5_tfclinom_sel ,
                                              AV123Listadodehdrs_wcds_4_tfclinom ,
                                              AV128Listadodehdrs_wcds_9_tfbarnhdr_sel ,
                                              AV127Listadodehdrs_wcds_8_tfbarnhdr ,
                                              AV130Listadodehdrs_wcds_11_tfbarser_sel ,
                                              AV129Listadodehdrs_wcds_10_tfbarser ,
                                              AV132Listadodehdrs_wcds_13_tfbarserdsc_sel ,
                                              AV131Listadodehdrs_wcds_12_tfbarserdsc ,
                                              Short.valueOf(AV133Listadodehdrs_wcds_14_tfbartipart) ,
                                              Short.valueOf(AV134Listadodehdrs_wcds_15_tfbartipart_to) ,
                                              AV136Listadodehdrs_wcds_17_tfbartipartdsc_sel ,
                                              AV135Listadodehdrs_wcds_16_tfbartipartdsc ,
                                              AV138Listadodehdrs_wcds_19_tfbarcolnom_sel ,
                                              AV137Listadodehdrs_wcds_18_tfbarcolnom ,
                                              Integer.valueOf(AV139Listadodehdrs_wcds_20_tfbarcolnum) ,
                                              Integer.valueOf(AV140Listadodehdrs_wcds_21_tfbarcolnum_to) ,
                                              AV142Listadodehdrs_wcds_23_tfbarnomcli_sel ,
                                              AV141Listadodehdrs_wcds_22_tfbarnomcli ,
                                              AV143Listadodehdrs_wcds_24_tfbarkgm ,
                                              AV144Listadodehdrs_wcds_25_tfbarkgm_to ,
                                              AV145Listadodehdrs_wcds_26_tfbarmtr ,
                                              AV146Listadodehdrs_wcds_27_tfbarmtr_to ,
                                              AV149Listadodehdrs_wcds_30_tfbarfecgen ,
                                              AV150Listadodehdrs_wcds_31_tfbarfeccli ,
                                              AV151Listadodehdrs_wcds_32_tfbarfecfpr ,
                                              AV155Listadodehdrs_wcds_36_tfbarmaqcod_sel ,
                                              AV154Listadodehdrs_wcds_35_tfbarmaqcod ,
                                              Byte.valueOf(AV156Listadodehdrs_wcds_37_tfbarsit) ,
                                              Byte.valueOf(AV157Listadodehdrs_wcds_38_tfbarsit_to) ,
                                              AV160Listadodehdrs_wcds_41_tfbaralbmts ,
                                              AV161Listadodehdrs_wcds_42_tfbaralbmts_to ,
                                              AV162Listadodehdrs_wcds_43_tfbaralbkgs ,
                                              AV163Listadodehdrs_wcds_44_tfbaralbkgs_to ,
                                              Integer.valueOf(A252CliCod) ,
                                              A279CliNom ,
                                              Integer.valueOf(A129BarCod) ,
                                              Byte.valueOf(A132BarCodReo) ,
                                              A130BarCodPar ,
                                              A212BarSer ,
                                              A1652BarSerDsc ,
                                              Short.valueOf(A217BarTipArt) ,
                                              A13711BarTipArtD ,
                                              A135BarColNom ,
                                              Integer.valueOf(A136BarColNum) ,
                                              A1234BarNomCli ,
                                              A166BarKgm ,
                                              A184BarMtr ,
                                              A159BarFecGen ,
                                              A155BarFecCli ,
                                              A158BarFecFpr ,
                                              A180BarMaqCod ,
                                              Byte.valueOf(A213BarSit) ,
                                              A13931BarAlbMts ,
                                              A13932BarAlbKgs ,
                                              Short.valueOf(AV12OrderedBy) ,
                                              Boolean.valueOf(AV13OrderedDsc) ,
                                              AV120Listadodehdrs_wcds_1_filterfulltext ,
                                              A13878PedidoClie ,
                                              A13696BarNHdr ,
                                              Integer.valueOf(A198BarPie) ,
                                              A151BarFasCod ,
                                              Long.valueOf(A13930BarAlbUlti) ,
                                              A13933BarCuadern ,
                                              A13934BarNormas ,
                                              Integer.valueOf(A13935BarAlbFact) ,
                                              AV126Listadodehdrs_wcds_7_tfpedidocliente_sel ,
                                              AV125Listadodehdrs_wcds_6_tfpedidocliente ,
                                              Integer.valueOf(AV147Listadodehdrs_wcds_28_tfbarpie) ,
                                              Integer.valueOf(AV148Listadodehdrs_wcds_29_tfbarpie_to) ,
                                              AV153Listadodehdrs_wcds_34_tfbarfascod_sel ,
                                              AV152Listadodehdrs_wcds_33_tfbarfascod ,
                                              Long.valueOf(AV158Listadodehdrs_wcds_39_tfbaralbultimo) ,
                                              Long.valueOf(AV159Listadodehdrs_wcds_40_tfbaralbultimo_to) ,
                                              AV165Listadodehdrs_wcds_46_tfbarcuaderno_sel ,
                                              AV164Listadodehdrs_wcds_45_tfbarcuaderno ,
                                              AV167Listadodehdrs_wcds_48_tfbarnormas_sel ,
                                              AV166Listadodehdrs_wcds_47_tfbarnormas ,
                                              Integer.valueOf(AV168Listadodehdrs_wcds_49_tfbaralbfact) ,
                                              Integer.valueOf(AV169Listadodehdrs_wcds_50_tfbaralbfact_to) ,
                                              AV75BarFecGen ,
                                              AV76BarFecGen_to ,
                                              AV79BarFecCli ,
                                              AV80BarFecCli_to ,
                                              Byte.valueOf(AV73BarSit) ,
                                              Byte.valueOf(AV74BarSit_to) ,
                                              AV72Emprcod ,
                                              Integer.valueOf(AV77Clicod) ,
                                              A396EmprCod ,
                                              Integer.valueOf(AV78Clicod_to) } ,
                                              new int[]{
                                              TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE,
                                              TypeConstants.BYTE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING,
                                              TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT,
                                              TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                              TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.LONG,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE,
                                              TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT
                                              }
         });
         lV152Listadodehdrs_wcds_33_tfbarfascod = GXutil.padr( GXutil.rtrim( AV152Listadodehdrs_wcds_33_tfbarfascod), 8, "%") ;
         lV164Listadodehdrs_wcds_45_tfbarcuaderno = GXutil.padr( GXutil.rtrim( AV164Listadodehdrs_wcds_45_tfbarcuaderno), 20, "%") ;
         lV123Listadodehdrs_wcds_4_tfclinom = GXutil.padr( GXutil.rtrim( AV123Listadodehdrs_wcds_4_tfclinom), 30, "%") ;
         lV127Listadodehdrs_wcds_8_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV127Listadodehdrs_wcds_8_tfbarnhdr), 11, "%") ;
         lV129Listadodehdrs_wcds_10_tfbarser = GXutil.padr( GXutil.rtrim( AV129Listadodehdrs_wcds_10_tfbarser), 16, "%") ;
         lV131Listadodehdrs_wcds_12_tfbarserdsc = GXutil.padr( GXutil.rtrim( AV131Listadodehdrs_wcds_12_tfbarserdsc), 26, "%") ;
         lV135Listadodehdrs_wcds_16_tfbartipartdsc = GXutil.padr( GXutil.rtrim( AV135Listadodehdrs_wcds_16_tfbartipartdsc), 30, "%") ;
         lV137Listadodehdrs_wcds_18_tfbarcolnom = GXutil.padr( GXutil.rtrim( AV137Listadodehdrs_wcds_18_tfbarcolnom), 13, "%") ;
         lV141Listadodehdrs_wcds_22_tfbarnomcli = GXutil.padr( GXutil.rtrim( AV141Listadodehdrs_wcds_22_tfbarnomcli), 13, "%") ;
         lV154Listadodehdrs_wcds_35_tfbarmaqcod = GXutil.padr( GXutil.rtrim( AV154Listadodehdrs_wcds_35_tfbarmaqcod), 6, "%") ;
         /* Using cursor H01EF17 */
         pr_default.execute(1, new Object[] {A396EmprCod, A396EmprCod, Integer.valueOf(A361DisCod), AV72Emprcod, Integer.valueOf(AV77Clicod), AV153Listadodehdrs_wcds_34_tfbarfascod_sel, AV152Listadodehdrs_wcds_33_tfbarfascod, lV152Listadodehdrs_wcds_33_tfbarfascod, AV153Listadodehdrs_wcds_34_tfbarfascod_sel, AV153Listadodehdrs_wcds_34_tfbarfascod_sel, AV165Listadodehdrs_wcds_46_tfbarcuaderno_sel, AV164Listadodehdrs_wcds_45_tfbarcuaderno, lV164Listadodehdrs_wcds_45_tfbarcuaderno, AV165Listadodehdrs_wcds_46_tfbarcuaderno_sel, AV165Listadodehdrs_wcds_46_tfbarcuaderno_sel, AV75BarFecGen, AV76BarFecGen_to, AV79BarFecCli, AV80BarFecCli_to, AV80BarFecCli_to, Byte.valueOf(AV73BarSit), Byte.valueOf(AV74BarSit_to), Integer.valueOf(AV78Clicod_to), Integer.valueOf(AV121Listadodehdrs_wcds_2_tfclicod), Integer.valueOf(AV122Listadodehdrs_wcds_3_tfclicod_to), lV123Listadodehdrs_wcds_4_tfclinom, AV124Listadodehdrs_wcds_5_tfclinom_sel, lV127Listadodehdrs_wcds_8_tfbarnhdr, AV128Listadodehdrs_wcds_9_tfbarnhdr_sel, lV129Listadodehdrs_wcds_10_tfbarser, AV130Listadodehdrs_wcds_11_tfbarser_sel, lV131Listadodehdrs_wcds_12_tfbarserdsc, AV132Listadodehdrs_wcds_13_tfbarserdsc_sel, Short.valueOf(AV133Listadodehdrs_wcds_14_tfbartipart), Short.valueOf(AV134Listadodehdrs_wcds_15_tfbartipart_to), lV135Listadodehdrs_wcds_16_tfbartipartdsc, AV136Listadodehdrs_wcds_17_tfbartipartdsc_sel, lV137Listadodehdrs_wcds_18_tfbarcolnom, AV138Listadodehdrs_wcds_19_tfbarcolnom_sel, Integer.valueOf(AV139Listadodehdrs_wcds_20_tfbarcolnum), Integer.valueOf(AV140Listadodehdrs_wcds_21_tfbarcolnum_to), lV141Listadodehdrs_wcds_22_tfbarnomcli, AV142Listadodehdrs_wcds_23_tfbarnomcli_sel, AV143Listadodehdrs_wcds_24_tfbarkgm, AV144Listadodehdrs_wcds_25_tfbarkgm_to, AV145Listadodehdrs_wcds_26_tfbarmtr, AV146Listadodehdrs_wcds_27_tfbarmtr_to, AV149Listadodehdrs_wcds_30_tfbarfecgen, AV150Listadodehdrs_wcds_31_tfbarfeccli, AV151Listadodehdrs_wcds_32_tfbarfecfpr, lV154Listadodehdrs_wcds_35_tfbarmaqcod, AV155Listadodehdrs_wcds_36_tfbarmaqcod_sel, Byte.valueOf(AV156Listadodehdrs_wcds_37_tfbarsit), Byte.valueOf(AV157Listadodehdrs_wcds_38_tfbarsit_to), AV160Listadodehdrs_wcds_41_tfbaralbmts, AV161Listadodehdrs_wcds_42_tfbaralbmts_to, AV162Listadodehdrs_wcds_43_tfbaralbkgs, AV163Listadodehdrs_wcds_44_tfbaralbkgs_to});
         nGXsfl_41_idx = 1 ;
         sGXsfl_41_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_41_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_412( ) ;
         GRID_nEOF = (byte)(0) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         while ( ( (pr_default.getStatus(1) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A4466BarAcaAnh = H01EF17_A4466BarAcaAnh[0] ;
            A13909BarIdtxDc = H01EF17_A13909BarIdtxDc[0] ;
            n13909BarIdtxDc = H01EF17_n13909BarIdtxDc[0] ;
            A13908BarIdtx2 = H01EF17_A13908BarIdtx2[0] ;
            n13908BarIdtx2 = H01EF17_n13908BarIdtx2[0] ;
            A13907BarSerDsc2 = H01EF17_A13907BarSerDsc2[0] ;
            n13907BarSerDsc2 = H01EF17_n13907BarSerDsc2[0] ;
            A12809BarLocTel = H01EF17_A12809BarLocTel[0] ;
            A2447BarFecEnE = H01EF17_A2447BarFecEnE[0] ;
            A12881BarOEKOTEX = H01EF17_A12881BarOEKOTEX[0] ;
            n12881BarOEKOTEX = H01EF17_n12881BarOEKOTEX[0] ;
            A213BarSit = H01EF17_A213BarSit[0] ;
            A180BarMaqCod = H01EF17_A180BarMaqCod[0] ;
            A158BarFecFpr = H01EF17_A158BarFecFpr[0] ;
            A155BarFecCli = H01EF17_A155BarFecCli[0] ;
            A159BarFecGen = H01EF17_A159BarFecGen[0] ;
            A1234BarNomCli = H01EF17_A1234BarNomCli[0] ;
            A136BarColNum = H01EF17_A136BarColNum[0] ;
            A135BarColNom = H01EF17_A135BarColNom[0] ;
            A13711BarTipArtD = H01EF17_A13711BarTipArtD[0] ;
            n13711BarTipArtD = H01EF17_n13711BarTipArtD[0] ;
            A217BarTipArt = H01EF17_A217BarTipArt[0] ;
            n217BarTipArt = H01EF17_n217BarTipArt[0] ;
            A1652BarSerDsc = H01EF17_A1652BarSerDsc[0] ;
            A212BarSer = H01EF17_A212BarSer[0] ;
            A13696BarNHdr = H01EF17_A13696BarNHdr[0] ;
            A279CliNom = H01EF17_A279CliNom[0] ;
            A252CliCod = H01EF17_A252CliCod[0] ;
            n252CliCod = H01EF17_n252CliCod[0] ;
            A13904BarIntColo = H01EF17_A13904BarIntColo[0] ;
            n13904BarIntColo = H01EF17_n13904BarIntColo[0] ;
            A13903BarMatColo = H01EF17_A13903BarMatColo[0] ;
            n13903BarMatColo = H01EF17_n13903BarMatColo[0] ;
            A13902BarNorma = H01EF17_A13902BarNorma[0] ;
            n13902BarNorma = H01EF17_n13902BarNorma[0] ;
            A13890BarHDSusp = H01EF17_A13890BarHDSusp[0] ;
            n13890BarHDSusp = H01EF17_n13890BarHDSusp[0] ;
            A13933BarCuadern = H01EF17_A13933BarCuadern[0] ;
            n13933BarCuadern = H01EF17_n13933BarCuadern[0] ;
            A13932BarAlbKgs = H01EF17_A13932BarAlbKgs[0] ;
            A13931BarAlbMts = H01EF17_A13931BarAlbMts[0] ;
            A151BarFasCod = H01EF17_A151BarFasCod[0] ;
            n151BarFasCod = H01EF17_n151BarFasCod[0] ;
            A143BarDisNum = H01EF17_A143BarDisNum[0] ;
            A4812BarEncCli = H01EF17_A4812BarEncCli[0] ;
            A218BarTipCol = H01EF17_A218BarTipCol[0] ;
            A199BarPie1 = H01EF17_A199BarPie1[0] ;
            A365DisDes = H01EF17_A365DisDes[0] ;
            A898BarPieNDes = H01EF17_A898BarPieNDes[0] ;
            A361DisCod = H01EF17_A361DisCod[0] ;
            A130BarCodPar = H01EF17_A130BarCodPar[0] ;
            A132BarCodReo = H01EF17_A132BarCodReo[0] ;
            A129BarCod = H01EF17_A129BarCod[0] ;
            A396EmprCod = H01EF17_A396EmprCod[0] ;
            A13887KilosEntre = H01EF17_A13887KilosEntre[0] ;
            A166BarKgm = H01EF17_A166BarKgm[0] ;
            A13888MetrosEntr = H01EF17_A13888MetrosEntr[0] ;
            A184BarMtr = H01EF17_A184BarMtr[0] ;
            A13890BarHDSusp = H01EF17_A13890BarHDSusp[0] ;
            n13890BarHDSusp = H01EF17_n13890BarHDSusp[0] ;
            A13711BarTipArtD = H01EF17_A13711BarTipArtD[0] ;
            n13711BarTipArtD = H01EF17_n13711BarTipArtD[0] ;
            A13909BarIdtxDc = H01EF17_A13909BarIdtxDc[0] ;
            n13909BarIdtxDc = H01EF17_n13909BarIdtxDc[0] ;
            A279CliNom = H01EF17_A279CliNom[0] ;
            A199BarPie1 = H01EF17_A199BarPie1[0] ;
            A898BarPieNDes = H01EF17_A898BarPieNDes[0] ;
            A166BarKgm = H01EF17_A166BarKgm[0] ;
            A184BarMtr = H01EF17_A184BarMtr[0] ;
            A13887KilosEntre = H01EF17_A13887KilosEntre[0] ;
            A13888MetrosEntr = H01EF17_A13888MetrosEntr[0] ;
            A13904BarIntColo = H01EF17_A13904BarIntColo[0] ;
            n13904BarIntColo = H01EF17_n13904BarIntColo[0] ;
            A13903BarMatColo = H01EF17_A13903BarMatColo[0] ;
            n13903BarMatColo = H01EF17_n13903BarMatColo[0] ;
            A13933BarCuadern = H01EF17_A13933BarCuadern[0] ;
            n13933BarCuadern = H01EF17_n13933BarCuadern[0] ;
            A13932BarAlbKgs = H01EF17_A13932BarAlbKgs[0] ;
            A13931BarAlbMts = H01EF17_A13931BarAlbMts[0] ;
            A151BarFasCod = H01EF17_A151BarFasCod[0] ;
            n151BarFasCod = H01EF17_n151BarFasCod[0] ;
            A13902BarNorma = H01EF17_A13902BarNorma[0] ;
            n13902BarNorma = H01EF17_n13902BarNorma[0] ;
            GXt_char1 = A13878PedidoClie ;
            GXv_char5[0] = A396EmprCod ;
            GXv_char4[0] = A4812BarEncCli ;
            GXv_char3[0] = A143BarDisNum ;
            GXv_char2[0] = GXt_char1 ;
            new app.core.ppedidocliente_formula(remoteHandle, context).execute( GXv_char5, GXv_char4, GXv_char3, GXv_char2) ;
            listadodehdrs_wc_impl.this.A396EmprCod = GXv_char5[0] ;
            listadodehdrs_wc_impl.this.A4812BarEncCli = GXv_char4[0] ;
            listadodehdrs_wc_impl.this.A143BarDisNum = GXv_char3[0] ;
            listadodehdrs_wc_impl.this.GXt_char1 = GXv_char2[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A4812BarEncCli", A4812BarEncCli);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A143BarDisNum", A143BarDisNum);
            A13878PedidoClie = GXt_char1 ;
            if ( ! ( (GXutil.strcmp("", AV126Listadodehdrs_wcds_7_tfpedidocliente_sel)==0) && ( ! (GXutil.strcmp("", AV125Listadodehdrs_wcds_6_tfpedidocliente)==0) ) ) || ( GXutil.like( GXutil.upper( A13878PedidoClie) , GXutil.padr( "%" + GXutil.upper( AV125Listadodehdrs_wcds_6_tfpedidocliente) , 255 , "%"),  ' ' ) ) )
            {
               if ( (GXutil.strcmp("", AV126Listadodehdrs_wcds_7_tfpedidocliente_sel)==0) || ( ( GXutil.strcmp(A13878PedidoClie, AV126Listadodehdrs_wcds_7_tfpedidocliente_sel) == 0 ) ) )
               {
                  GXt_char1 = A13868BarTipColD ;
                  GXv_char5[0] = A396EmprCod ;
                  GXv_int6[0] = A218BarTipCol ;
                  GXv_char4[0] = GXt_char1 ;
                  new app.pfcoldsc(remoteHandle, context).execute( GXv_char5, GXv_int6, GXv_char4) ;
                  listadodehdrs_wc_impl.this.A396EmprCod = GXv_char5[0] ;
                  listadodehdrs_wc_impl.this.A218BarTipCol = GXv_int6[0] ;
                  listadodehdrs_wc_impl.this.GXt_char1 = GXv_char4[0] ;
                  httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
                  A13868BarTipColD = GXt_char1 ;
                  GXt_int7 = A13930BarAlbUlti ;
                  GXv_int8[0] = GXt_int7 ;
                  new app.produccion.consultadeproduccion_albaranultimo(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, GXv_int8) ;
                  listadodehdrs_wc_impl.this.GXt_int7 = GXv_int8[0] ;
                  A13930BarAlbUlti = GXt_int7 ;
                  if ( (0==AV158Listadodehdrs_wcds_39_tfbaralbultimo) || ( ( A13930BarAlbUlti >= AV158Listadodehdrs_wcds_39_tfbaralbultimo ) ) )
                  {
                     if ( (0==AV159Listadodehdrs_wcds_40_tfbaralbultimo_to) || ( ( A13930BarAlbUlti <= AV159Listadodehdrs_wcds_40_tfbaralbultimo_to ) ) )
                     {
                        GXt_char1 = A13934BarNormas ;
                        GXv_char5[0] = GXt_char1 ;
                        new app.produccion.consultadeproduccion_normasestandarstextiles(remoteHandle, context).execute( A396EmprCod, A361DisCod, GXv_char5) ;
                        listadodehdrs_wc_impl.this.GXt_char1 = GXv_char5[0] ;
                        A13934BarNormas = GXt_char1 ;
                        if ( ! ( (GXutil.strcmp("", AV167Listadodehdrs_wcds_48_tfbarnormas_sel)==0) && ( ! (GXutil.strcmp("", AV166Listadodehdrs_wcds_47_tfbarnormas)==0) ) ) || ( GXutil.like( GXutil.upper( A13934BarNormas) , GXutil.padr( "%" + GXutil.upper( AV166Listadodehdrs_wcds_47_tfbarnormas) , 255 , "%"),  ' ' ) ) )
                        {
                           if ( (GXutil.strcmp("", AV167Listadodehdrs_wcds_48_tfbarnormas_sel)==0) || ( ( GXutil.strcmp(A13934BarNormas, AV167Listadodehdrs_wcds_48_tfbarnormas_sel) == 0 ) ) )
                           {
                              GXt_int9 = A13935BarAlbFact ;
                              GXv_int10[0] = GXt_int9 ;
                              new app.produccion.consultadeproduccion_factura(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, GXv_int10) ;
                              listadodehdrs_wc_impl.this.GXt_int9 = GXv_int10[0] ;
                              A13935BarAlbFact = GXt_int9 ;
                              if ( (0==AV168Listadodehdrs_wcds_49_tfbaralbfact) || ( ( A13935BarAlbFact >= AV168Listadodehdrs_wcds_49_tfbaralbfact ) ) )
                              {
                                 if ( (0==AV169Listadodehdrs_wcds_50_tfbaralbfact_to) || ( ( A13935BarAlbFact <= AV169Listadodehdrs_wcds_50_tfbaralbfact_to ) ) )
                                 {
                                    GXt_char1 = A13910BarColCv ;
                                    GXv_char5[0] = A396EmprCod ;
                                    GXv_int10[0] = A129BarCod ;
                                    GXv_int6[0] = A132BarCodReo ;
                                    GXv_char4[0] = A130BarCodPar ;
                                    GXv_char3[0] = GXt_char1 ;
                                    new app.pnortt(remoteHandle, context).execute( GXv_char5, GXv_int10, GXv_int6, GXv_char4, GXv_char3) ;
                                    listadodehdrs_wc_impl.this.A396EmprCod = GXv_char5[0] ;
                                    listadodehdrs_wc_impl.this.A129BarCod = GXv_int10[0] ;
                                    listadodehdrs_wc_impl.this.A132BarCodReo = GXv_int6[0] ;
                                    listadodehdrs_wc_impl.this.A130BarCodPar = GXv_char4[0] ;
                                    listadodehdrs_wc_impl.this.GXt_char1 = GXv_char3[0] ;
                                    httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
                                    httpContext.ajax_rsp_assign_attri(sPrefix, false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
                                    httpContext.ajax_rsp_assign_attri(sPrefix, false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
                                    httpContext.ajax_rsp_assign_attri(sPrefix, false, "A130BarCodPar", A130BarCodPar);
                                    A13910BarColCv = GXt_char1 ;
                                    if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
                                    {
                                       A198BarPie = A898BarPieNDes ;
                                    }
                                    else
                                    {
                                       A198BarPie = A199BarPie1 ;
                                    }
                                    if ( (GXutil.strcmp("", AV120Listadodehdrs_wcds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A252CliCod, 6, 0) , GXutil.padr( "%" + AV120Listadodehdrs_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV120Listadodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13878PedidoClie) , GXutil.padr( "%" + GXutil.upper( AV120Listadodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13696BarNHdr) , GXutil.padr( "%" + GXutil.upper( AV120Listadodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A212BarSer) , GXutil.padr( "%" + GXutil.upper( AV120Listadodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1652BarSerDsc) , GXutil.padr( "%" + GXutil.upper( AV120Listadodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A217BarTipArt, 4, 0) , GXutil.padr( "%" + AV120Listadodehdrs_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13711BarTipArtD) , GXutil.padr( "%" + GXutil.upper( AV120Listadodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A135BarColNom) , GXutil.padr( "%" + GXutil.upper( AV120Listadodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A136BarColNum, 6, 0) , GXutil.padr( "%" + AV120Listadodehdrs_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1234BarNomCli) , GXutil.padr( "%" + GXutil.upper( AV120Listadodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A166BarKgm, 9, 2) , GXutil.padr( "%" + AV120Listadodehdrs_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A184BarMtr, 9, 2) , GXutil.padr( "%" + AV120Listadodehdrs_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A198BarPie, 6, 0) , GXutil.padr( "%" + AV120Listadodehdrs_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A151BarFasCod) , GXutil.padr( "%" + GXutil.upper( AV120Listadodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A180BarMaqCod) , GXutil.padr( "%" + GXutil.upper( AV120Listadodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A213BarSit, 2, 0) , GXutil.padr( "%" + AV120Listadodehdrs_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A13930BarAlbUlti, 10, 0) , GXutil.padr( "%" + AV120Listadodehdrs_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A13931BarAlbMts, 9, 2) , GXutil.padr( "%" + AV120Listadodehdrs_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A13932BarAlbKgs, 9, 2) , GXutil.padr( "%" + AV120Listadodehdrs_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13933BarCuadern) , GXutil.padr( "%" + GXutil.upper( AV120Listadodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13934BarNormas) , GXutil.padr( "%" + GXutil.upper( AV120Listadodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A13935BarAlbFact, 8, 0) , GXutil.padr( "%" + AV120Listadodehdrs_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) ) )
                                    {
                                       if ( (0==AV147Listadodehdrs_wcds_28_tfbarpie) || ( ( A198BarPie >= AV147Listadodehdrs_wcds_28_tfbarpie ) ) )
                                       {
                                          if ( (0==AV148Listadodehdrs_wcds_29_tfbarpie_to) || ( ( A198BarPie <= AV148Listadodehdrs_wcds_29_tfbarpie_to ) ) )
                                          {
                                             A13885KilosPendi = (A166BarKgm.subtract(A13887KilosEntre)) ;
                                             A13886MetrosPend = (A184BarMtr.subtract(DecimalUtil.doubleToDec(A13888MetrosEntr))) ;
                                             e201EF2 ();
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
         wbEnd = (short)(41) ;
         wb1EF0( ) ;
      }
      bGXsfl_41_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes1EF2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPGMNAME", GXutil.rtrim( AV170Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPGMNAME", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV170Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOTBARKGM", GXutil.ltrim( localUtil.ntoc( AV87TotBarKgm, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTBARKGM", getSecureSignedToken( sPrefix, localUtil.format( AV87TotBarKgm, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOTBARMTR", GXutil.ltrim( localUtil.ntoc( AV89TotBarMtr, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTBARMTR", getSecureSignedToken( sPrefix, localUtil.format( AV89TotBarMtr, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOTBARPIE", GXutil.ltrim( localUtil.ntoc( AV91TotBarPie, (byte)(18), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTBARPIE", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV91TotBarPie), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOTKILOSPENDIENTES", GXutil.ltrim( localUtil.ntoc( AV99TotKilosPendientes, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTKILOSPENDIENTES", getSecureSignedToken( sPrefix, localUtil.format( AV99TotKilosPendientes, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOTMETROSPENDIENTES", GXutil.ltrim( localUtil.ntoc( AV101TotMetrosPendientes, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTMETROSPENDIENTES", getSecureSignedToken( sPrefix, localUtil.format( AV101TotMetrosPendientes, "ZZZZZ9.99")));
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
      AV120Listadodehdrs_wcds_1_filterfulltext = AV15FilterFullText ;
      AV121Listadodehdrs_wcds_2_tfclicod = AV26TFCliCod ;
      AV122Listadodehdrs_wcds_3_tfclicod_to = AV27TFCliCod_To ;
      AV123Listadodehdrs_wcds_4_tfclinom = AV28TFCliNom ;
      AV124Listadodehdrs_wcds_5_tfclinom_sel = AV29TFCliNom_Sel ;
      AV125Listadodehdrs_wcds_6_tfpedidocliente = AV93TFPedidoCliente ;
      AV126Listadodehdrs_wcds_7_tfpedidocliente_sel = AV94TFPedidoCliente_Sel ;
      AV127Listadodehdrs_wcds_8_tfbarnhdr = AV81TFBarNHdr ;
      AV128Listadodehdrs_wcds_9_tfbarnhdr_sel = AV82TFBarNHdr_Sel ;
      AV129Listadodehdrs_wcds_10_tfbarser = AV30TFBarSer ;
      AV130Listadodehdrs_wcds_11_tfbarser_sel = AV31TFBarSer_Sel ;
      AV131Listadodehdrs_wcds_12_tfbarserdsc = AV32TFBarSerDsc ;
      AV132Listadodehdrs_wcds_13_tfbarserdsc_sel = AV33TFBarSerDsc_Sel ;
      AV133Listadodehdrs_wcds_14_tfbartipart = AV34TFBarTipArt ;
      AV134Listadodehdrs_wcds_15_tfbartipart_to = AV35TFBarTipArt_To ;
      AV135Listadodehdrs_wcds_16_tfbartipartdsc = AV36TFBarTipArtDsc ;
      AV136Listadodehdrs_wcds_17_tfbartipartdsc_sel = AV37TFBarTipArtDsc_Sel ;
      AV137Listadodehdrs_wcds_18_tfbarcolnom = AV38TFBarColNom ;
      AV138Listadodehdrs_wcds_19_tfbarcolnom_sel = AV39TFBarColNom_Sel ;
      AV139Listadodehdrs_wcds_20_tfbarcolnum = AV40TFBarColNum ;
      AV140Listadodehdrs_wcds_21_tfbarcolnum_to = AV41TFBarColNum_To ;
      AV141Listadodehdrs_wcds_22_tfbarnomcli = AV46TFBarNomCli ;
      AV142Listadodehdrs_wcds_23_tfbarnomcli_sel = AV47TFBarNomCli_Sel ;
      AV143Listadodehdrs_wcds_24_tfbarkgm = AV48TFBarKgm ;
      AV144Listadodehdrs_wcds_25_tfbarkgm_to = AV49TFBarKgm_To ;
      AV145Listadodehdrs_wcds_26_tfbarmtr = AV50TFBarMtr ;
      AV146Listadodehdrs_wcds_27_tfbarmtr_to = AV51TFBarMtr_To ;
      AV147Listadodehdrs_wcds_28_tfbarpie = AV52TFBarPie ;
      AV148Listadodehdrs_wcds_29_tfbarpie_to = AV53TFBarPie_To ;
      AV149Listadodehdrs_wcds_30_tfbarfecgen = AV54TFBarFecGen ;
      AV150Listadodehdrs_wcds_31_tfbarfeccli = AV58TFBarFecCli ;
      AV151Listadodehdrs_wcds_32_tfbarfecfpr = AV62TFBarFecFpr ;
      AV152Listadodehdrs_wcds_33_tfbarfascod = AV66TFBarFasCod ;
      AV153Listadodehdrs_wcds_34_tfbarfascod_sel = AV67TFBarFasCod_Sel ;
      AV154Listadodehdrs_wcds_35_tfbarmaqcod = AV83TFBarMaqCod ;
      AV155Listadodehdrs_wcds_36_tfbarmaqcod_sel = AV84TFBarMaqCod_Sel ;
      AV156Listadodehdrs_wcds_37_tfbarsit = AV85TFBarSit ;
      AV157Listadodehdrs_wcds_38_tfbarsit_to = AV86TFBarSit_To ;
      AV158Listadodehdrs_wcds_39_tfbaralbultimo = AV103TFBarAlbUltimo ;
      AV159Listadodehdrs_wcds_40_tfbaralbultimo_to = AV104TFBarAlbUltimo_To ;
      AV160Listadodehdrs_wcds_41_tfbaralbmts = AV105TFBarAlbMts ;
      AV161Listadodehdrs_wcds_42_tfbaralbmts_to = AV106TFBarAlbMts_To ;
      AV162Listadodehdrs_wcds_43_tfbaralbkgs = AV107TFBarAlbKgs ;
      AV163Listadodehdrs_wcds_44_tfbaralbkgs_to = AV108TFBarAlbKgs_To ;
      AV164Listadodehdrs_wcds_45_tfbarcuaderno = AV109TFBarCuaderno ;
      AV165Listadodehdrs_wcds_46_tfbarcuaderno_sel = AV110TFBarCuaderno_Sel ;
      AV166Listadodehdrs_wcds_47_tfbarnormas = AV111TFBarNormas ;
      AV167Listadodehdrs_wcds_48_tfbarnormas_sel = AV112TFBarNormas_Sel ;
      AV168Listadodehdrs_wcds_49_tfbaralbfact = AV113TFBarAlbFact ;
      AV169Listadodehdrs_wcds_50_tfbaralbfact_to = AV114TFBarAlbFact_To ;
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV72Emprcod, AV73BarSit, AV74BarSit_to, AV75BarFecGen, AV76BarFecGen_to, AV77Clicod, AV78Clicod_to, AV79BarFecCli, AV80BarFecCli_to, AV25ManageFiltersExecutionStep, AV20ColumnsSelector, AV15FilterFullText, AV26TFCliCod, AV27TFCliCod_To, AV28TFCliNom, AV29TFCliNom_Sel, AV93TFPedidoCliente, AV94TFPedidoCliente_Sel, AV81TFBarNHdr, AV82TFBarNHdr_Sel, AV30TFBarSer, AV31TFBarSer_Sel, AV32TFBarSerDsc, AV33TFBarSerDsc_Sel, AV34TFBarTipArt, AV35TFBarTipArt_To, AV36TFBarTipArtDsc, AV37TFBarTipArtDsc_Sel, AV38TFBarColNom, AV39TFBarColNom_Sel, AV40TFBarColNum, AV41TFBarColNum_To, AV46TFBarNomCli, AV47TFBarNomCli_Sel, AV48TFBarKgm, AV49TFBarKgm_To, AV50TFBarMtr, AV51TFBarMtr_To, AV52TFBarPie, AV53TFBarPie_To, AV54TFBarFecGen, AV58TFBarFecCli, AV62TFBarFecFpr, AV66TFBarFasCod, AV67TFBarFasCod_Sel, AV83TFBarMaqCod, AV84TFBarMaqCod_Sel, AV85TFBarSit, AV86TFBarSit_To, AV103TFBarAlbUltimo, AV104TFBarAlbUltimo_To, AV105TFBarAlbMts, AV106TFBarAlbMts_To, AV107TFBarAlbKgs, AV108TFBarAlbKgs_To, AV109TFBarCuaderno, AV110TFBarCuaderno_Sel, AV111TFBarNormas, AV112TFBarNormas_Sel, AV113TFBarAlbFact, AV114TFBarAlbFact_To, AV170Pgmname, AV12OrderedBy, AV13OrderedDsc, AV87TotBarKgm, AV89TotBarMtr, AV91TotBarPie, AV99TotKilosPendientes, AV101TotMetrosPendientes, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      AV120Listadodehdrs_wcds_1_filterfulltext = AV15FilterFullText ;
      AV121Listadodehdrs_wcds_2_tfclicod = AV26TFCliCod ;
      AV122Listadodehdrs_wcds_3_tfclicod_to = AV27TFCliCod_To ;
      AV123Listadodehdrs_wcds_4_tfclinom = AV28TFCliNom ;
      AV124Listadodehdrs_wcds_5_tfclinom_sel = AV29TFCliNom_Sel ;
      AV125Listadodehdrs_wcds_6_tfpedidocliente = AV93TFPedidoCliente ;
      AV126Listadodehdrs_wcds_7_tfpedidocliente_sel = AV94TFPedidoCliente_Sel ;
      AV127Listadodehdrs_wcds_8_tfbarnhdr = AV81TFBarNHdr ;
      AV128Listadodehdrs_wcds_9_tfbarnhdr_sel = AV82TFBarNHdr_Sel ;
      AV129Listadodehdrs_wcds_10_tfbarser = AV30TFBarSer ;
      AV130Listadodehdrs_wcds_11_tfbarser_sel = AV31TFBarSer_Sel ;
      AV131Listadodehdrs_wcds_12_tfbarserdsc = AV32TFBarSerDsc ;
      AV132Listadodehdrs_wcds_13_tfbarserdsc_sel = AV33TFBarSerDsc_Sel ;
      AV133Listadodehdrs_wcds_14_tfbartipart = AV34TFBarTipArt ;
      AV134Listadodehdrs_wcds_15_tfbartipart_to = AV35TFBarTipArt_To ;
      AV135Listadodehdrs_wcds_16_tfbartipartdsc = AV36TFBarTipArtDsc ;
      AV136Listadodehdrs_wcds_17_tfbartipartdsc_sel = AV37TFBarTipArtDsc_Sel ;
      AV137Listadodehdrs_wcds_18_tfbarcolnom = AV38TFBarColNom ;
      AV138Listadodehdrs_wcds_19_tfbarcolnom_sel = AV39TFBarColNom_Sel ;
      AV139Listadodehdrs_wcds_20_tfbarcolnum = AV40TFBarColNum ;
      AV140Listadodehdrs_wcds_21_tfbarcolnum_to = AV41TFBarColNum_To ;
      AV141Listadodehdrs_wcds_22_tfbarnomcli = AV46TFBarNomCli ;
      AV142Listadodehdrs_wcds_23_tfbarnomcli_sel = AV47TFBarNomCli_Sel ;
      AV143Listadodehdrs_wcds_24_tfbarkgm = AV48TFBarKgm ;
      AV144Listadodehdrs_wcds_25_tfbarkgm_to = AV49TFBarKgm_To ;
      AV145Listadodehdrs_wcds_26_tfbarmtr = AV50TFBarMtr ;
      AV146Listadodehdrs_wcds_27_tfbarmtr_to = AV51TFBarMtr_To ;
      AV147Listadodehdrs_wcds_28_tfbarpie = AV52TFBarPie ;
      AV148Listadodehdrs_wcds_29_tfbarpie_to = AV53TFBarPie_To ;
      AV149Listadodehdrs_wcds_30_tfbarfecgen = AV54TFBarFecGen ;
      AV150Listadodehdrs_wcds_31_tfbarfeccli = AV58TFBarFecCli ;
      AV151Listadodehdrs_wcds_32_tfbarfecfpr = AV62TFBarFecFpr ;
      AV152Listadodehdrs_wcds_33_tfbarfascod = AV66TFBarFasCod ;
      AV153Listadodehdrs_wcds_34_tfbarfascod_sel = AV67TFBarFasCod_Sel ;
      AV154Listadodehdrs_wcds_35_tfbarmaqcod = AV83TFBarMaqCod ;
      AV155Listadodehdrs_wcds_36_tfbarmaqcod_sel = AV84TFBarMaqCod_Sel ;
      AV156Listadodehdrs_wcds_37_tfbarsit = AV85TFBarSit ;
      AV157Listadodehdrs_wcds_38_tfbarsit_to = AV86TFBarSit_To ;
      AV158Listadodehdrs_wcds_39_tfbaralbultimo = AV103TFBarAlbUltimo ;
      AV159Listadodehdrs_wcds_40_tfbaralbultimo_to = AV104TFBarAlbUltimo_To ;
      AV160Listadodehdrs_wcds_41_tfbaralbmts = AV105TFBarAlbMts ;
      AV161Listadodehdrs_wcds_42_tfbaralbmts_to = AV106TFBarAlbMts_To ;
      AV162Listadodehdrs_wcds_43_tfbaralbkgs = AV107TFBarAlbKgs ;
      AV163Listadodehdrs_wcds_44_tfbaralbkgs_to = AV108TFBarAlbKgs_To ;
      AV164Listadodehdrs_wcds_45_tfbarcuaderno = AV109TFBarCuaderno ;
      AV165Listadodehdrs_wcds_46_tfbarcuaderno_sel = AV110TFBarCuaderno_Sel ;
      AV166Listadodehdrs_wcds_47_tfbarnormas = AV111TFBarNormas ;
      AV167Listadodehdrs_wcds_48_tfbarnormas_sel = AV112TFBarNormas_Sel ;
      AV168Listadodehdrs_wcds_49_tfbaralbfact = AV113TFBarAlbFact ;
      AV169Listadodehdrs_wcds_50_tfbaralbfact_to = AV114TFBarAlbFact_To ;
      if ( GRID_nEOF == 0 )
      {
         GRID_nFirstRecordOnPage = (long)(GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )) ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("GRID_nFirstRecordOnPage", GRID_nFirstRecordOnPage);
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV72Emprcod, AV73BarSit, AV74BarSit_to, AV75BarFecGen, AV76BarFecGen_to, AV77Clicod, AV78Clicod_to, AV79BarFecCli, AV80BarFecCli_to, AV25ManageFiltersExecutionStep, AV20ColumnsSelector, AV15FilterFullText, AV26TFCliCod, AV27TFCliCod_To, AV28TFCliNom, AV29TFCliNom_Sel, AV93TFPedidoCliente, AV94TFPedidoCliente_Sel, AV81TFBarNHdr, AV82TFBarNHdr_Sel, AV30TFBarSer, AV31TFBarSer_Sel, AV32TFBarSerDsc, AV33TFBarSerDsc_Sel, AV34TFBarTipArt, AV35TFBarTipArt_To, AV36TFBarTipArtDsc, AV37TFBarTipArtDsc_Sel, AV38TFBarColNom, AV39TFBarColNom_Sel, AV40TFBarColNum, AV41TFBarColNum_To, AV46TFBarNomCli, AV47TFBarNomCli_Sel, AV48TFBarKgm, AV49TFBarKgm_To, AV50TFBarMtr, AV51TFBarMtr_To, AV52TFBarPie, AV53TFBarPie_To, AV54TFBarFecGen, AV58TFBarFecCli, AV62TFBarFecFpr, AV66TFBarFasCod, AV67TFBarFasCod_Sel, AV83TFBarMaqCod, AV84TFBarMaqCod_Sel, AV85TFBarSit, AV86TFBarSit_To, AV103TFBarAlbUltimo, AV104TFBarAlbUltimo_To, AV105TFBarAlbMts, AV106TFBarAlbMts_To, AV107TFBarAlbKgs, AV108TFBarAlbKgs_To, AV109TFBarCuaderno, AV110TFBarCuaderno_Sel, AV111TFBarNormas, AV112TFBarNormas_Sel, AV113TFBarAlbFact, AV114TFBarAlbFact_To, AV170Pgmname, AV12OrderedBy, AV13OrderedDsc, AV87TotBarKgm, AV89TotBarMtr, AV91TotBarPie, AV99TotKilosPendientes, AV101TotMetrosPendientes, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid_previouspage( )
   {
      AV120Listadodehdrs_wcds_1_filterfulltext = AV15FilterFullText ;
      AV121Listadodehdrs_wcds_2_tfclicod = AV26TFCliCod ;
      AV122Listadodehdrs_wcds_3_tfclicod_to = AV27TFCliCod_To ;
      AV123Listadodehdrs_wcds_4_tfclinom = AV28TFCliNom ;
      AV124Listadodehdrs_wcds_5_tfclinom_sel = AV29TFCliNom_Sel ;
      AV125Listadodehdrs_wcds_6_tfpedidocliente = AV93TFPedidoCliente ;
      AV126Listadodehdrs_wcds_7_tfpedidocliente_sel = AV94TFPedidoCliente_Sel ;
      AV127Listadodehdrs_wcds_8_tfbarnhdr = AV81TFBarNHdr ;
      AV128Listadodehdrs_wcds_9_tfbarnhdr_sel = AV82TFBarNHdr_Sel ;
      AV129Listadodehdrs_wcds_10_tfbarser = AV30TFBarSer ;
      AV130Listadodehdrs_wcds_11_tfbarser_sel = AV31TFBarSer_Sel ;
      AV131Listadodehdrs_wcds_12_tfbarserdsc = AV32TFBarSerDsc ;
      AV132Listadodehdrs_wcds_13_tfbarserdsc_sel = AV33TFBarSerDsc_Sel ;
      AV133Listadodehdrs_wcds_14_tfbartipart = AV34TFBarTipArt ;
      AV134Listadodehdrs_wcds_15_tfbartipart_to = AV35TFBarTipArt_To ;
      AV135Listadodehdrs_wcds_16_tfbartipartdsc = AV36TFBarTipArtDsc ;
      AV136Listadodehdrs_wcds_17_tfbartipartdsc_sel = AV37TFBarTipArtDsc_Sel ;
      AV137Listadodehdrs_wcds_18_tfbarcolnom = AV38TFBarColNom ;
      AV138Listadodehdrs_wcds_19_tfbarcolnom_sel = AV39TFBarColNom_Sel ;
      AV139Listadodehdrs_wcds_20_tfbarcolnum = AV40TFBarColNum ;
      AV140Listadodehdrs_wcds_21_tfbarcolnum_to = AV41TFBarColNum_To ;
      AV141Listadodehdrs_wcds_22_tfbarnomcli = AV46TFBarNomCli ;
      AV142Listadodehdrs_wcds_23_tfbarnomcli_sel = AV47TFBarNomCli_Sel ;
      AV143Listadodehdrs_wcds_24_tfbarkgm = AV48TFBarKgm ;
      AV144Listadodehdrs_wcds_25_tfbarkgm_to = AV49TFBarKgm_To ;
      AV145Listadodehdrs_wcds_26_tfbarmtr = AV50TFBarMtr ;
      AV146Listadodehdrs_wcds_27_tfbarmtr_to = AV51TFBarMtr_To ;
      AV147Listadodehdrs_wcds_28_tfbarpie = AV52TFBarPie ;
      AV148Listadodehdrs_wcds_29_tfbarpie_to = AV53TFBarPie_To ;
      AV149Listadodehdrs_wcds_30_tfbarfecgen = AV54TFBarFecGen ;
      AV150Listadodehdrs_wcds_31_tfbarfeccli = AV58TFBarFecCli ;
      AV151Listadodehdrs_wcds_32_tfbarfecfpr = AV62TFBarFecFpr ;
      AV152Listadodehdrs_wcds_33_tfbarfascod = AV66TFBarFasCod ;
      AV153Listadodehdrs_wcds_34_tfbarfascod_sel = AV67TFBarFasCod_Sel ;
      AV154Listadodehdrs_wcds_35_tfbarmaqcod = AV83TFBarMaqCod ;
      AV155Listadodehdrs_wcds_36_tfbarmaqcod_sel = AV84TFBarMaqCod_Sel ;
      AV156Listadodehdrs_wcds_37_tfbarsit = AV85TFBarSit ;
      AV157Listadodehdrs_wcds_38_tfbarsit_to = AV86TFBarSit_To ;
      AV158Listadodehdrs_wcds_39_tfbaralbultimo = AV103TFBarAlbUltimo ;
      AV159Listadodehdrs_wcds_40_tfbaralbultimo_to = AV104TFBarAlbUltimo_To ;
      AV160Listadodehdrs_wcds_41_tfbaralbmts = AV105TFBarAlbMts ;
      AV161Listadodehdrs_wcds_42_tfbaralbmts_to = AV106TFBarAlbMts_To ;
      AV162Listadodehdrs_wcds_43_tfbaralbkgs = AV107TFBarAlbKgs ;
      AV163Listadodehdrs_wcds_44_tfbaralbkgs_to = AV108TFBarAlbKgs_To ;
      AV164Listadodehdrs_wcds_45_tfbarcuaderno = AV109TFBarCuaderno ;
      AV165Listadodehdrs_wcds_46_tfbarcuaderno_sel = AV110TFBarCuaderno_Sel ;
      AV166Listadodehdrs_wcds_47_tfbarnormas = AV111TFBarNormas ;
      AV167Listadodehdrs_wcds_48_tfbarnormas_sel = AV112TFBarNormas_Sel ;
      AV168Listadodehdrs_wcds_49_tfbaralbfact = AV113TFBarAlbFact ;
      AV169Listadodehdrs_wcds_50_tfbaralbfact_to = AV114TFBarAlbFact_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV72Emprcod, AV73BarSit, AV74BarSit_to, AV75BarFecGen, AV76BarFecGen_to, AV77Clicod, AV78Clicod_to, AV79BarFecCli, AV80BarFecCli_to, AV25ManageFiltersExecutionStep, AV20ColumnsSelector, AV15FilterFullText, AV26TFCliCod, AV27TFCliCod_To, AV28TFCliNom, AV29TFCliNom_Sel, AV93TFPedidoCliente, AV94TFPedidoCliente_Sel, AV81TFBarNHdr, AV82TFBarNHdr_Sel, AV30TFBarSer, AV31TFBarSer_Sel, AV32TFBarSerDsc, AV33TFBarSerDsc_Sel, AV34TFBarTipArt, AV35TFBarTipArt_To, AV36TFBarTipArtDsc, AV37TFBarTipArtDsc_Sel, AV38TFBarColNom, AV39TFBarColNom_Sel, AV40TFBarColNum, AV41TFBarColNum_To, AV46TFBarNomCli, AV47TFBarNomCli_Sel, AV48TFBarKgm, AV49TFBarKgm_To, AV50TFBarMtr, AV51TFBarMtr_To, AV52TFBarPie, AV53TFBarPie_To, AV54TFBarFecGen, AV58TFBarFecCli, AV62TFBarFecFpr, AV66TFBarFasCod, AV67TFBarFasCod_Sel, AV83TFBarMaqCod, AV84TFBarMaqCod_Sel, AV85TFBarSit, AV86TFBarSit_To, AV103TFBarAlbUltimo, AV104TFBarAlbUltimo_To, AV105TFBarAlbMts, AV106TFBarAlbMts_To, AV107TFBarAlbKgs, AV108TFBarAlbKgs_To, AV109TFBarCuaderno, AV110TFBarCuaderno_Sel, AV111TFBarNormas, AV112TFBarNormas_Sel, AV113TFBarAlbFact, AV114TFBarAlbFact_To, AV170Pgmname, AV12OrderedBy, AV13OrderedDsc, AV87TotBarKgm, AV89TotBarMtr, AV91TotBarPie, AV99TotKilosPendientes, AV101TotMetrosPendientes, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      AV120Listadodehdrs_wcds_1_filterfulltext = AV15FilterFullText ;
      AV121Listadodehdrs_wcds_2_tfclicod = AV26TFCliCod ;
      AV122Listadodehdrs_wcds_3_tfclicod_to = AV27TFCliCod_To ;
      AV123Listadodehdrs_wcds_4_tfclinom = AV28TFCliNom ;
      AV124Listadodehdrs_wcds_5_tfclinom_sel = AV29TFCliNom_Sel ;
      AV125Listadodehdrs_wcds_6_tfpedidocliente = AV93TFPedidoCliente ;
      AV126Listadodehdrs_wcds_7_tfpedidocliente_sel = AV94TFPedidoCliente_Sel ;
      AV127Listadodehdrs_wcds_8_tfbarnhdr = AV81TFBarNHdr ;
      AV128Listadodehdrs_wcds_9_tfbarnhdr_sel = AV82TFBarNHdr_Sel ;
      AV129Listadodehdrs_wcds_10_tfbarser = AV30TFBarSer ;
      AV130Listadodehdrs_wcds_11_tfbarser_sel = AV31TFBarSer_Sel ;
      AV131Listadodehdrs_wcds_12_tfbarserdsc = AV32TFBarSerDsc ;
      AV132Listadodehdrs_wcds_13_tfbarserdsc_sel = AV33TFBarSerDsc_Sel ;
      AV133Listadodehdrs_wcds_14_tfbartipart = AV34TFBarTipArt ;
      AV134Listadodehdrs_wcds_15_tfbartipart_to = AV35TFBarTipArt_To ;
      AV135Listadodehdrs_wcds_16_tfbartipartdsc = AV36TFBarTipArtDsc ;
      AV136Listadodehdrs_wcds_17_tfbartipartdsc_sel = AV37TFBarTipArtDsc_Sel ;
      AV137Listadodehdrs_wcds_18_tfbarcolnom = AV38TFBarColNom ;
      AV138Listadodehdrs_wcds_19_tfbarcolnom_sel = AV39TFBarColNom_Sel ;
      AV139Listadodehdrs_wcds_20_tfbarcolnum = AV40TFBarColNum ;
      AV140Listadodehdrs_wcds_21_tfbarcolnum_to = AV41TFBarColNum_To ;
      AV141Listadodehdrs_wcds_22_tfbarnomcli = AV46TFBarNomCli ;
      AV142Listadodehdrs_wcds_23_tfbarnomcli_sel = AV47TFBarNomCli_Sel ;
      AV143Listadodehdrs_wcds_24_tfbarkgm = AV48TFBarKgm ;
      AV144Listadodehdrs_wcds_25_tfbarkgm_to = AV49TFBarKgm_To ;
      AV145Listadodehdrs_wcds_26_tfbarmtr = AV50TFBarMtr ;
      AV146Listadodehdrs_wcds_27_tfbarmtr_to = AV51TFBarMtr_To ;
      AV147Listadodehdrs_wcds_28_tfbarpie = AV52TFBarPie ;
      AV148Listadodehdrs_wcds_29_tfbarpie_to = AV53TFBarPie_To ;
      AV149Listadodehdrs_wcds_30_tfbarfecgen = AV54TFBarFecGen ;
      AV150Listadodehdrs_wcds_31_tfbarfeccli = AV58TFBarFecCli ;
      AV151Listadodehdrs_wcds_32_tfbarfecfpr = AV62TFBarFecFpr ;
      AV152Listadodehdrs_wcds_33_tfbarfascod = AV66TFBarFasCod ;
      AV153Listadodehdrs_wcds_34_tfbarfascod_sel = AV67TFBarFasCod_Sel ;
      AV154Listadodehdrs_wcds_35_tfbarmaqcod = AV83TFBarMaqCod ;
      AV155Listadodehdrs_wcds_36_tfbarmaqcod_sel = AV84TFBarMaqCod_Sel ;
      AV156Listadodehdrs_wcds_37_tfbarsit = AV85TFBarSit ;
      AV157Listadodehdrs_wcds_38_tfbarsit_to = AV86TFBarSit_To ;
      AV158Listadodehdrs_wcds_39_tfbaralbultimo = AV103TFBarAlbUltimo ;
      AV159Listadodehdrs_wcds_40_tfbaralbultimo_to = AV104TFBarAlbUltimo_To ;
      AV160Listadodehdrs_wcds_41_tfbaralbmts = AV105TFBarAlbMts ;
      AV161Listadodehdrs_wcds_42_tfbaralbmts_to = AV106TFBarAlbMts_To ;
      AV162Listadodehdrs_wcds_43_tfbaralbkgs = AV107TFBarAlbKgs ;
      AV163Listadodehdrs_wcds_44_tfbaralbkgs_to = AV108TFBarAlbKgs_To ;
      AV164Listadodehdrs_wcds_45_tfbarcuaderno = AV109TFBarCuaderno ;
      AV165Listadodehdrs_wcds_46_tfbarcuaderno_sel = AV110TFBarCuaderno_Sel ;
      AV166Listadodehdrs_wcds_47_tfbarnormas = AV111TFBarNormas ;
      AV167Listadodehdrs_wcds_48_tfbarnormas_sel = AV112TFBarNormas_Sel ;
      AV168Listadodehdrs_wcds_49_tfbaralbfact = AV113TFBarAlbFact ;
      AV169Listadodehdrs_wcds_50_tfbaralbfact_to = AV114TFBarAlbFact_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV72Emprcod, AV73BarSit, AV74BarSit_to, AV75BarFecGen, AV76BarFecGen_to, AV77Clicod, AV78Clicod_to, AV79BarFecCli, AV80BarFecCli_to, AV25ManageFiltersExecutionStep, AV20ColumnsSelector, AV15FilterFullText, AV26TFCliCod, AV27TFCliCod_To, AV28TFCliNom, AV29TFCliNom_Sel, AV93TFPedidoCliente, AV94TFPedidoCliente_Sel, AV81TFBarNHdr, AV82TFBarNHdr_Sel, AV30TFBarSer, AV31TFBarSer_Sel, AV32TFBarSerDsc, AV33TFBarSerDsc_Sel, AV34TFBarTipArt, AV35TFBarTipArt_To, AV36TFBarTipArtDsc, AV37TFBarTipArtDsc_Sel, AV38TFBarColNom, AV39TFBarColNom_Sel, AV40TFBarColNum, AV41TFBarColNum_To, AV46TFBarNomCli, AV47TFBarNomCli_Sel, AV48TFBarKgm, AV49TFBarKgm_To, AV50TFBarMtr, AV51TFBarMtr_To, AV52TFBarPie, AV53TFBarPie_To, AV54TFBarFecGen, AV58TFBarFecCli, AV62TFBarFecFpr, AV66TFBarFasCod, AV67TFBarFasCod_Sel, AV83TFBarMaqCod, AV84TFBarMaqCod_Sel, AV85TFBarSit, AV86TFBarSit_To, AV103TFBarAlbUltimo, AV104TFBarAlbUltimo_To, AV105TFBarAlbMts, AV106TFBarAlbMts_To, AV107TFBarAlbKgs, AV108TFBarAlbKgs_To, AV109TFBarCuaderno, AV110TFBarCuaderno_Sel, AV111TFBarNormas, AV112TFBarNormas_Sel, AV113TFBarAlbFact, AV114TFBarAlbFact_To, AV170Pgmname, AV12OrderedBy, AV13OrderedDsc, AV87TotBarKgm, AV89TotBarMtr, AV91TotBarPie, AV99TotKilosPendientes, AV101TotMetrosPendientes, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid_gotopage( int nPageNo )
   {
      AV120Listadodehdrs_wcds_1_filterfulltext = AV15FilterFullText ;
      AV121Listadodehdrs_wcds_2_tfclicod = AV26TFCliCod ;
      AV122Listadodehdrs_wcds_3_tfclicod_to = AV27TFCliCod_To ;
      AV123Listadodehdrs_wcds_4_tfclinom = AV28TFCliNom ;
      AV124Listadodehdrs_wcds_5_tfclinom_sel = AV29TFCliNom_Sel ;
      AV125Listadodehdrs_wcds_6_tfpedidocliente = AV93TFPedidoCliente ;
      AV126Listadodehdrs_wcds_7_tfpedidocliente_sel = AV94TFPedidoCliente_Sel ;
      AV127Listadodehdrs_wcds_8_tfbarnhdr = AV81TFBarNHdr ;
      AV128Listadodehdrs_wcds_9_tfbarnhdr_sel = AV82TFBarNHdr_Sel ;
      AV129Listadodehdrs_wcds_10_tfbarser = AV30TFBarSer ;
      AV130Listadodehdrs_wcds_11_tfbarser_sel = AV31TFBarSer_Sel ;
      AV131Listadodehdrs_wcds_12_tfbarserdsc = AV32TFBarSerDsc ;
      AV132Listadodehdrs_wcds_13_tfbarserdsc_sel = AV33TFBarSerDsc_Sel ;
      AV133Listadodehdrs_wcds_14_tfbartipart = AV34TFBarTipArt ;
      AV134Listadodehdrs_wcds_15_tfbartipart_to = AV35TFBarTipArt_To ;
      AV135Listadodehdrs_wcds_16_tfbartipartdsc = AV36TFBarTipArtDsc ;
      AV136Listadodehdrs_wcds_17_tfbartipartdsc_sel = AV37TFBarTipArtDsc_Sel ;
      AV137Listadodehdrs_wcds_18_tfbarcolnom = AV38TFBarColNom ;
      AV138Listadodehdrs_wcds_19_tfbarcolnom_sel = AV39TFBarColNom_Sel ;
      AV139Listadodehdrs_wcds_20_tfbarcolnum = AV40TFBarColNum ;
      AV140Listadodehdrs_wcds_21_tfbarcolnum_to = AV41TFBarColNum_To ;
      AV141Listadodehdrs_wcds_22_tfbarnomcli = AV46TFBarNomCli ;
      AV142Listadodehdrs_wcds_23_tfbarnomcli_sel = AV47TFBarNomCli_Sel ;
      AV143Listadodehdrs_wcds_24_tfbarkgm = AV48TFBarKgm ;
      AV144Listadodehdrs_wcds_25_tfbarkgm_to = AV49TFBarKgm_To ;
      AV145Listadodehdrs_wcds_26_tfbarmtr = AV50TFBarMtr ;
      AV146Listadodehdrs_wcds_27_tfbarmtr_to = AV51TFBarMtr_To ;
      AV147Listadodehdrs_wcds_28_tfbarpie = AV52TFBarPie ;
      AV148Listadodehdrs_wcds_29_tfbarpie_to = AV53TFBarPie_To ;
      AV149Listadodehdrs_wcds_30_tfbarfecgen = AV54TFBarFecGen ;
      AV150Listadodehdrs_wcds_31_tfbarfeccli = AV58TFBarFecCli ;
      AV151Listadodehdrs_wcds_32_tfbarfecfpr = AV62TFBarFecFpr ;
      AV152Listadodehdrs_wcds_33_tfbarfascod = AV66TFBarFasCod ;
      AV153Listadodehdrs_wcds_34_tfbarfascod_sel = AV67TFBarFasCod_Sel ;
      AV154Listadodehdrs_wcds_35_tfbarmaqcod = AV83TFBarMaqCod ;
      AV155Listadodehdrs_wcds_36_tfbarmaqcod_sel = AV84TFBarMaqCod_Sel ;
      AV156Listadodehdrs_wcds_37_tfbarsit = AV85TFBarSit ;
      AV157Listadodehdrs_wcds_38_tfbarsit_to = AV86TFBarSit_To ;
      AV158Listadodehdrs_wcds_39_tfbaralbultimo = AV103TFBarAlbUltimo ;
      AV159Listadodehdrs_wcds_40_tfbaralbultimo_to = AV104TFBarAlbUltimo_To ;
      AV160Listadodehdrs_wcds_41_tfbaralbmts = AV105TFBarAlbMts ;
      AV161Listadodehdrs_wcds_42_tfbaralbmts_to = AV106TFBarAlbMts_To ;
      AV162Listadodehdrs_wcds_43_tfbaralbkgs = AV107TFBarAlbKgs ;
      AV163Listadodehdrs_wcds_44_tfbaralbkgs_to = AV108TFBarAlbKgs_To ;
      AV164Listadodehdrs_wcds_45_tfbarcuaderno = AV109TFBarCuaderno ;
      AV165Listadodehdrs_wcds_46_tfbarcuaderno_sel = AV110TFBarCuaderno_Sel ;
      AV166Listadodehdrs_wcds_47_tfbarnormas = AV111TFBarNormas ;
      AV167Listadodehdrs_wcds_48_tfbarnormas_sel = AV112TFBarNormas_Sel ;
      AV168Listadodehdrs_wcds_49_tfbaralbfact = AV113TFBarAlbFact ;
      AV169Listadodehdrs_wcds_50_tfbaralbfact_to = AV114TFBarAlbFact_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV72Emprcod, AV73BarSit, AV74BarSit_to, AV75BarFecGen, AV76BarFecGen_to, AV77Clicod, AV78Clicod_to, AV79BarFecCli, AV80BarFecCli_to, AV25ManageFiltersExecutionStep, AV20ColumnsSelector, AV15FilterFullText, AV26TFCliCod, AV27TFCliCod_To, AV28TFCliNom, AV29TFCliNom_Sel, AV93TFPedidoCliente, AV94TFPedidoCliente_Sel, AV81TFBarNHdr, AV82TFBarNHdr_Sel, AV30TFBarSer, AV31TFBarSer_Sel, AV32TFBarSerDsc, AV33TFBarSerDsc_Sel, AV34TFBarTipArt, AV35TFBarTipArt_To, AV36TFBarTipArtDsc, AV37TFBarTipArtDsc_Sel, AV38TFBarColNom, AV39TFBarColNom_Sel, AV40TFBarColNum, AV41TFBarColNum_To, AV46TFBarNomCli, AV47TFBarNomCli_Sel, AV48TFBarKgm, AV49TFBarKgm_To, AV50TFBarMtr, AV51TFBarMtr_To, AV52TFBarPie, AV53TFBarPie_To, AV54TFBarFecGen, AV58TFBarFecCli, AV62TFBarFecFpr, AV66TFBarFasCod, AV67TFBarFasCod_Sel, AV83TFBarMaqCod, AV84TFBarMaqCod_Sel, AV85TFBarSit, AV86TFBarSit_To, AV103TFBarAlbUltimo, AV104TFBarAlbUltimo_To, AV105TFBarAlbMts, AV106TFBarAlbMts_To, AV107TFBarAlbKgs, AV108TFBarAlbKgs_To, AV109TFBarCuaderno, AV110TFBarCuaderno_Sel, AV111TFBarNormas, AV112TFBarNormas_Sel, AV113TFBarAlbFact, AV114TFBarAlbFact_To, AV170Pgmname, AV12OrderedBy, AV13OrderedDsc, AV87TotBarKgm, AV89TotBarMtr, AV91TotBarPie, AV99TotKilosPendientes, AV101TotMetrosPendientes, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV170Pgmname = "ListadodeHDRs_WC" ;
      Gx_err = (short)(0) ;
      edtavTotvaluebarkgm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvaluebarkgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluebarkgm_Enabled), 5, 0), true);
      edtavTotvaluebarmtr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvaluebarmtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluebarmtr_Enabled), 5, 0), true);
      edtavTotvaluebarpie_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvaluebarpie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluebarpie_Enabled), 5, 0), true);
      /* Using cursor H01EF19 */
      pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
      if ( (pr_default.getStatus(2) != 101) )
      {
         A13902BarNorma = H01EF19_A13902BarNorma[0] ;
         n13902BarNorma = H01EF19_n13902BarNorma[0] ;
      }
      else
      {
         A13902BarNorma = " " ;
         n13902BarNorma = false ;
      }
      pr_default.close(2);
      pr_default.close(2);
      fix_multi_value_controls( ) ;
   }

   public void strup1EF0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e181EF2 ();
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
         nRC_GXsfl_41 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_41"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV70GridCurrentPage = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV71GridPageCount = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         wcpOAV72Emprcod = httpContext.cgiGet( sPrefix+"wcpOAV72Emprcod") ;
         wcpOAV73BarSit = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV73BarSit"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV74BarSit_to = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV74BarSit_to"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV75BarFecGen = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV75BarFecGen"), 0) ;
         wcpOAV76BarFecGen_to = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV76BarFecGen_to"), 0) ;
         wcpOAV77Clicod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV77Clicod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV78Clicod_to = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV78Clicod_to"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV79BarFecCli = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV79BarFecCli"), 0) ;
         wcpOAV80BarFecCli_to = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV80BarFecCli_to"), 0) ;
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
         Ddo_grid_Datalistproc = httpContext.cgiGet( sPrefix+"DDO_GRID_Datalistproc") ;
         Ddo_gridcolumnsselector_Caption = httpContext.cgiGet( sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Caption") ;
         Ddo_gridcolumnsselector_Tooltip = httpContext.cgiGet( sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Tooltip") ;
         Ddo_gridcolumnsselector_Cls = httpContext.cgiGet( sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Cls") ;
         Ddo_gridcolumnsselector_Dropdownoptionstype = httpContext.cgiGet( sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Dropdownoptionstype") ;
         Ddo_gridcolumnsselector_Gridinternalname = httpContext.cgiGet( sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Gridinternalname") ;
         Ddo_gridcolumnsselector_Titlecontrolidtoreplace = httpContext.cgiGet( sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Titlecontrolidtoreplace") ;
         Grid_titlescategories_Gridinternalname = httpContext.cgiGet( sPrefix+"GRID_TITLESCATEGORIES_Gridinternalname") ;
         Grid_titlescategories_Gridtitlescategories = httpContext.cgiGet( sPrefix+"GRID_TITLESCATEGORIES_Gridtitlescategories") ;
         Grid_empowerer_Gridinternalname = httpContext.cgiGet( sPrefix+"GRID_EMPOWERER_Gridinternalname") ;
         Grid_empowerer_Hascategories = GXutil.strtobool( httpContext.cgiGet( sPrefix+"GRID_EMPOWERER_Hascategories")) ;
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
         AV15FilterFullText = httpContext.cgiGet( edtavFilterfulltext_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV15FilterFullText", AV15FilterFullText);
         AV88TotValueBarKgm = httpContext.cgiGet( edtavTotvaluebarkgm_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV88TotValueBarKgm", AV88TotValueBarKgm);
         AV90TotValueBarMtr = httpContext.cgiGet( edtavTotvaluebarmtr_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV90TotValueBarMtr", AV90TotValueBarMtr);
         AV92TotValueBarPie = httpContext.cgiGet( edtavTotvaluebarpie_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV92TotValueBarPie", AV92TotValueBarPie);
         if ( localUtil.vcdate( httpContext.cgiGet( edtavDdo_barfecgenauxdate_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vDDO_BARFECGENAUXDATE");
            GX_FocusControl = edtavDdo_barfecgenauxdate_Internalname ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV56DDO_BarFecGenAuxDate = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV56DDO_BarFecGenAuxDate", localUtil.format(AV56DDO_BarFecGenAuxDate, "99/99/99"));
         }
         else
         {
            AV56DDO_BarFecGenAuxDate = localUtil.ctod( httpContext.cgiGet( edtavDdo_barfecgenauxdate_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV56DDO_BarFecGenAuxDate", localUtil.format(AV56DDO_BarFecGenAuxDate, "99/99/99"));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavDdo_barfeccliauxdate_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vDDO_BARFECCLIAUXDATE");
            GX_FocusControl = edtavDdo_barfeccliauxdate_Internalname ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV60DDO_BarFecCliAuxDate = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV60DDO_BarFecCliAuxDate", localUtil.format(AV60DDO_BarFecCliAuxDate, "99/99/99"));
         }
         else
         {
            AV60DDO_BarFecCliAuxDate = localUtil.ctod( httpContext.cgiGet( edtavDdo_barfeccliauxdate_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV60DDO_BarFecCliAuxDate", localUtil.format(AV60DDO_BarFecCliAuxDate, "99/99/99"));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavDdo_barfecfprauxdate_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vDDO_BARFECFPRAUXDATE");
            GX_FocusControl = edtavDdo_barfecfprauxdate_Internalname ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV64DDO_BarFecFprAuxDate = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV64DDO_BarFecFprAuxDate", localUtil.format(AV64DDO_BarFecFprAuxDate, "99/99/99"));
         }
         else
         {
            AV64DDO_BarFecFprAuxDate = localUtil.ctod( httpContext.cgiGet( edtavDdo_barfecfprauxdate_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV64DDO_BarFecFprAuxDate", localUtil.format(AV64DDO_BarFecFprAuxDate, "99/99/99"));
         }
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
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
      e181EF2 ();
      if (returnInSub) return;
   }

   public void e181EF2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV117Station ;
      GXv_char5[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char5) ;
      listadodehdrs_wc_impl.this.GXt_char1 = GXv_char5[0] ;
      AV117Station = GXt_char1 ;
      GXv_char5[0] = AV72Emprcod ;
      GXv_char4[0] = AV118Emprnom ;
      GXv_char3[0] = AV119Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV117Station, GXv_char5, GXv_char4, GXv_char3) ;
      listadodehdrs_wc_impl.this.AV72Emprcod = GXv_char5[0] ;
      listadodehdrs_wc_impl.this.AV118Emprnom = GXv_char4[0] ;
      listadodehdrs_wc_impl.this.AV119Usurcod = GXv_char3[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV72Emprcod", AV72Emprcod);
      subGrid_Rows = 10 ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      Grid_empowerer_Gridinternalname = subGrid_Internalname ;
      ucGrid_empowerer.sendProperty(context, sPrefix, false, Grid_empowerer_Internalname, "GridInternalName", Grid_empowerer_Gridinternalname);
      Ddo_gridcolumnsselector_Gridinternalname = subGrid_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, sPrefix, false, Ddo_gridcolumnsselector_Internalname, "GridInternalName", Ddo_gridcolumnsselector_Gridinternalname);
      Grid_titlescategories_Gridinternalname = subGrid_Internalname ;
      ucGrid_titlescategories.sendProperty(context, sPrefix, false, Grid_titlescategories_Internalname, "GridInternalName", Grid_titlescategories_Gridinternalname);
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
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons11 = AV68DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons12[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons11;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons12) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons11 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons12[0] ;
      AV68DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons11;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = bttBtneditcolumns_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, sPrefix, false, Ddo_gridcolumnsselector_Internalname, "TitleControlIdToReplace", Ddo_gridcolumnsselector_Titlecontrolidtoreplace);
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, sPrefix, false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
   }

   public void e191EF2( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
      GXv_SdtWWPContext13[0] = AV6WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext13) ;
      AV6WWPContext = GXv_SdtWWPContext13[0] ;
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
      if ( GXutil.strcmp(AV22Session.getValue("ListadodeHDRs_WCColumnsSelector"), "") != 0 )
      {
         AV18ColumnsSelectorXML = AV22Session.getValue("ListadodeHDRs_WCColumnsSelector") ;
         AV20ColumnsSelector.fromxml(AV18ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S162 ();
         if (returnInSub) return;
      }
      edtCliCod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtCliCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtCliNom_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtCliNom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliNom_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtPedidoClie_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtPedidoClie_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPedidoClie_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtBarNHdr_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarNHdr_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarNHdr_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtBarSer_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarSer_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarSer_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtBarSerDsc_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarSerDsc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarSerDsc_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtBarTipArt_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarTipArt_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarTipArt_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtBarTipArtD_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarTipArtD_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarTipArtD_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtBarColNom_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarColNom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarColNom_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtBarColNum_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarColNum_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarColNum_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtBarNomCli_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarNomCli_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarNomCli_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtBarKgm_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarKgm_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarKgm_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtBarMtr_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarMtr_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarMtr_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtBarPie_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarPie_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPie_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtBarFecGen_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarFecGen_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarFecGen_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtBarFecCli_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+16)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarFecCli_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarFecCli_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtBarFecFpr_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+17)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarFecFpr_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarFecFpr_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtBarFasCod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+18)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarFasCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarFasCod_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtBarMaqCod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+19)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarMaqCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarMaqCod_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtBarSit_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+20)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarSit_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarSit_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtBarAlbUlti_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+21)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarAlbUlti_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAlbUlti_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtBarAlbMts_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+22)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarAlbMts_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAlbMts_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtBarAlbKgs_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+23)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarAlbKgs_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAlbKgs_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtBarCuadern_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+24)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarCuadern_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCuadern_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtBarNormas_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+25)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarNormas_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarNormas_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtBarAlbFact_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+26)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarAlbFact_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAlbFact_Visible), 5, 0), !bGXsfl_41_Refreshing);
      /* Execute user subroutine: 'INITIALIZETOTALIZERS' */
      S172 ();
      if (returnInSub) return;
      AV70GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV70GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV70GridCurrentPage), 10, 0));
      AV71GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV71GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV71GridPageCount), 10, 0));
      /* Execute user subroutine: 'CALCULATETOTALIZERS' */
      S182 ();
      if (returnInSub) return;
      AV120Listadodehdrs_wcds_1_filterfulltext = AV15FilterFullText ;
      AV121Listadodehdrs_wcds_2_tfclicod = AV26TFCliCod ;
      AV122Listadodehdrs_wcds_3_tfclicod_to = AV27TFCliCod_To ;
      AV123Listadodehdrs_wcds_4_tfclinom = AV28TFCliNom ;
      AV124Listadodehdrs_wcds_5_tfclinom_sel = AV29TFCliNom_Sel ;
      AV125Listadodehdrs_wcds_6_tfpedidocliente = AV93TFPedidoCliente ;
      AV126Listadodehdrs_wcds_7_tfpedidocliente_sel = AV94TFPedidoCliente_Sel ;
      AV127Listadodehdrs_wcds_8_tfbarnhdr = AV81TFBarNHdr ;
      AV128Listadodehdrs_wcds_9_tfbarnhdr_sel = AV82TFBarNHdr_Sel ;
      AV129Listadodehdrs_wcds_10_tfbarser = AV30TFBarSer ;
      AV130Listadodehdrs_wcds_11_tfbarser_sel = AV31TFBarSer_Sel ;
      AV131Listadodehdrs_wcds_12_tfbarserdsc = AV32TFBarSerDsc ;
      AV132Listadodehdrs_wcds_13_tfbarserdsc_sel = AV33TFBarSerDsc_Sel ;
      AV133Listadodehdrs_wcds_14_tfbartipart = AV34TFBarTipArt ;
      AV134Listadodehdrs_wcds_15_tfbartipart_to = AV35TFBarTipArt_To ;
      AV135Listadodehdrs_wcds_16_tfbartipartdsc = AV36TFBarTipArtDsc ;
      AV136Listadodehdrs_wcds_17_tfbartipartdsc_sel = AV37TFBarTipArtDsc_Sel ;
      AV137Listadodehdrs_wcds_18_tfbarcolnom = AV38TFBarColNom ;
      AV138Listadodehdrs_wcds_19_tfbarcolnom_sel = AV39TFBarColNom_Sel ;
      AV139Listadodehdrs_wcds_20_tfbarcolnum = AV40TFBarColNum ;
      AV140Listadodehdrs_wcds_21_tfbarcolnum_to = AV41TFBarColNum_To ;
      AV141Listadodehdrs_wcds_22_tfbarnomcli = AV46TFBarNomCli ;
      AV142Listadodehdrs_wcds_23_tfbarnomcli_sel = AV47TFBarNomCli_Sel ;
      AV143Listadodehdrs_wcds_24_tfbarkgm = AV48TFBarKgm ;
      AV144Listadodehdrs_wcds_25_tfbarkgm_to = AV49TFBarKgm_To ;
      AV145Listadodehdrs_wcds_26_tfbarmtr = AV50TFBarMtr ;
      AV146Listadodehdrs_wcds_27_tfbarmtr_to = AV51TFBarMtr_To ;
      AV147Listadodehdrs_wcds_28_tfbarpie = AV52TFBarPie ;
      AV148Listadodehdrs_wcds_29_tfbarpie_to = AV53TFBarPie_To ;
      AV149Listadodehdrs_wcds_30_tfbarfecgen = AV54TFBarFecGen ;
      AV150Listadodehdrs_wcds_31_tfbarfeccli = AV58TFBarFecCli ;
      AV151Listadodehdrs_wcds_32_tfbarfecfpr = AV62TFBarFecFpr ;
      AV152Listadodehdrs_wcds_33_tfbarfascod = AV66TFBarFasCod ;
      AV153Listadodehdrs_wcds_34_tfbarfascod_sel = AV67TFBarFasCod_Sel ;
      AV154Listadodehdrs_wcds_35_tfbarmaqcod = AV83TFBarMaqCod ;
      AV155Listadodehdrs_wcds_36_tfbarmaqcod_sel = AV84TFBarMaqCod_Sel ;
      AV156Listadodehdrs_wcds_37_tfbarsit = AV85TFBarSit ;
      AV157Listadodehdrs_wcds_38_tfbarsit_to = AV86TFBarSit_To ;
      AV158Listadodehdrs_wcds_39_tfbaralbultimo = AV103TFBarAlbUltimo ;
      AV159Listadodehdrs_wcds_40_tfbaralbultimo_to = AV104TFBarAlbUltimo_To ;
      AV160Listadodehdrs_wcds_41_tfbaralbmts = AV105TFBarAlbMts ;
      AV161Listadodehdrs_wcds_42_tfbaralbmts_to = AV106TFBarAlbMts_To ;
      AV162Listadodehdrs_wcds_43_tfbaralbkgs = AV107TFBarAlbKgs ;
      AV163Listadodehdrs_wcds_44_tfbaralbkgs_to = AV108TFBarAlbKgs_To ;
      AV164Listadodehdrs_wcds_45_tfbarcuaderno = AV109TFBarCuaderno ;
      AV165Listadodehdrs_wcds_46_tfbarcuaderno_sel = AV110TFBarCuaderno_Sel ;
      AV166Listadodehdrs_wcds_47_tfbarnormas = AV111TFBarNormas ;
      AV167Listadodehdrs_wcds_48_tfbarnormas_sel = AV112TFBarNormas_Sel ;
      AV168Listadodehdrs_wcds_49_tfbaralbfact = AV113TFBarAlbFact ;
      AV169Listadodehdrs_wcds_50_tfbaralbfact_to = AV114TFBarAlbFact_To ;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV20ColumnsSelector", AV20ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV23ManageFiltersData", AV23ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV10GridState", AV10GridState);
   }

   public void e121EF2( )
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
         AV69PageToGo = (int)(GXutil.lval( Gridpaginationbar_Selectedpage)) ;
         subgrid_gotopage( AV69PageToGo) ;
      }
   }

   public void e131EF2( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   public void e141EF2( )
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
            AV26TFCliCod = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV26TFCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV26TFCliCod), 6, 0));
            AV27TFCliCod_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV27TFCliCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV27TFCliCod_To), 6, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "CliNom") == 0 )
         {
            AV28TFCliNom = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV28TFCliNom", AV28TFCliNom);
            AV29TFCliNom_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV29TFCliNom_Sel", AV29TFCliNom_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PedidoCliente") == 0 )
         {
            AV93TFPedidoCliente = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV93TFPedidoCliente", AV93TFPedidoCliente);
            AV94TFPedidoCliente_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV94TFPedidoCliente_Sel", AV94TFPedidoCliente_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarNHdr") == 0 )
         {
            AV81TFBarNHdr = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV81TFBarNHdr", AV81TFBarNHdr);
            AV82TFBarNHdr_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV82TFBarNHdr_Sel", AV82TFBarNHdr_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarSer") == 0 )
         {
            AV30TFBarSer = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV30TFBarSer", AV30TFBarSer);
            AV31TFBarSer_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV31TFBarSer_Sel", AV31TFBarSer_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarSerDsc") == 0 )
         {
            AV32TFBarSerDsc = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32TFBarSerDsc", AV32TFBarSerDsc);
            AV33TFBarSerDsc_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33TFBarSerDsc_Sel", AV33TFBarSerDsc_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarTipArt") == 0 )
         {
            AV34TFBarTipArt = (short)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34TFBarTipArt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34TFBarTipArt), 4, 0));
            AV35TFBarTipArt_To = (short)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV35TFBarTipArt_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV35TFBarTipArt_To), 4, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarTipArtDsc") == 0 )
         {
            AV36TFBarTipArtDsc = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36TFBarTipArtDsc", AV36TFBarTipArtDsc);
            AV37TFBarTipArtDsc_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37TFBarTipArtDsc_Sel", AV37TFBarTipArtDsc_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarColNom") == 0 )
         {
            AV38TFBarColNom = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV38TFBarColNom", AV38TFBarColNom);
            AV39TFBarColNom_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV39TFBarColNom_Sel", AV39TFBarColNom_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarColNum") == 0 )
         {
            AV40TFBarColNum = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV40TFBarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV40TFBarColNum), 6, 0));
            AV41TFBarColNum_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV41TFBarColNum_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV41TFBarColNum_To), 6, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarNomCli") == 0 )
         {
            AV46TFBarNomCli = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV46TFBarNomCli", AV46TFBarNomCli);
            AV47TFBarNomCli_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47TFBarNomCli_Sel", AV47TFBarNomCli_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarKgm") == 0 )
         {
            AV48TFBarKgm = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV48TFBarKgm", GXutil.ltrimstr( AV48TFBarKgm, 9, 2));
            AV49TFBarKgm_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV49TFBarKgm_To", GXutil.ltrimstr( AV49TFBarKgm_To, 9, 2));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarMtr") == 0 )
         {
            AV50TFBarMtr = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV50TFBarMtr", GXutil.ltrimstr( AV50TFBarMtr, 9, 2));
            AV51TFBarMtr_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV51TFBarMtr_To", GXutil.ltrimstr( AV51TFBarMtr_To, 9, 2));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarPie") == 0 )
         {
            AV52TFBarPie = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV52TFBarPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV52TFBarPie), 6, 0));
            AV53TFBarPie_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV53TFBarPie_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV53TFBarPie_To), 6, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarFecGen") == 0 )
         {
            AV54TFBarFecGen = localUtil.ctod( Ddo_grid_Filteredtext_get, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV54TFBarFecGen", localUtil.format(AV54TFBarFecGen, "99/99/99"));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarFecCli") == 0 )
         {
            AV58TFBarFecCli = localUtil.ctod( Ddo_grid_Filteredtext_get, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV58TFBarFecCli", localUtil.format(AV58TFBarFecCli, "99/99/99"));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarFecFpr") == 0 )
         {
            AV62TFBarFecFpr = localUtil.ctod( Ddo_grid_Filteredtext_get, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV62TFBarFecFpr", localUtil.format(AV62TFBarFecFpr, "99/99/99"));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarFasCod") == 0 )
         {
            AV66TFBarFasCod = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV66TFBarFasCod", AV66TFBarFasCod);
            AV67TFBarFasCod_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV67TFBarFasCod_Sel", AV67TFBarFasCod_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarMaqCod") == 0 )
         {
            AV83TFBarMaqCod = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV83TFBarMaqCod", AV83TFBarMaqCod);
            AV84TFBarMaqCod_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV84TFBarMaqCod_Sel", AV84TFBarMaqCod_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarSit") == 0 )
         {
            AV85TFBarSit = (byte)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV85TFBarSit", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV85TFBarSit), 2, 0));
            AV86TFBarSit_To = (byte)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV86TFBarSit_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV86TFBarSit_To), 2, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarAlbUltimo") == 0 )
         {
            AV103TFBarAlbUltimo = GXutil.lval( Ddo_grid_Filteredtext_get) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV103TFBarAlbUltimo", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV103TFBarAlbUltimo), 10, 0));
            AV104TFBarAlbUltimo_To = GXutil.lval( Ddo_grid_Filteredtextto_get) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV104TFBarAlbUltimo_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV104TFBarAlbUltimo_To), 10, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarAlbMts") == 0 )
         {
            AV105TFBarAlbMts = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV105TFBarAlbMts", GXutil.ltrimstr( AV105TFBarAlbMts, 9, 2));
            AV106TFBarAlbMts_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV106TFBarAlbMts_To", GXutil.ltrimstr( AV106TFBarAlbMts_To, 9, 2));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarAlbKgs") == 0 )
         {
            AV107TFBarAlbKgs = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV107TFBarAlbKgs", GXutil.ltrimstr( AV107TFBarAlbKgs, 9, 2));
            AV108TFBarAlbKgs_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV108TFBarAlbKgs_To", GXutil.ltrimstr( AV108TFBarAlbKgs_To, 9, 2));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarCuaderno") == 0 )
         {
            AV109TFBarCuaderno = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV109TFBarCuaderno", AV109TFBarCuaderno);
            AV110TFBarCuaderno_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV110TFBarCuaderno_Sel", AV110TFBarCuaderno_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarNormas") == 0 )
         {
            AV111TFBarNormas = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV111TFBarNormas", AV111TFBarNormas);
            AV112TFBarNormas_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV112TFBarNormas_Sel", AV112TFBarNormas_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarAlbFact") == 0 )
         {
            AV113TFBarAlbFact = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV113TFBarAlbFact", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV113TFBarAlbFact), 8, 0));
            AV114TFBarAlbFact_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV114TFBarAlbFact_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV114TFBarAlbFact_To), 8, 0));
         }
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
   }

   private void e201EF2( )
   {
      if ( ( subGrid_Islastpage == 1 ) || ( subGrid_Rows == 0 ) || ( ( GRID_nCurrentRecord >= GRID_nFirstRecordOnPage ) && ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) ) ) )
      {
         /* Grid_Load Routine */
         returnInSub = false ;
         /* Load Method */
         if ( wbStart != -1 )
         {
            wbStart = (short)(41) ;
         }
         sendrow_412( ) ;
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
      if ( isFullAjaxMode( ) && ! bGXsfl_41_Refreshing )
      {
         httpContext.doAjaxLoad(41, GridRow);
      }
   }

   public void e151EF2( )
   {
      /* Ddo_gridcolumnsselector_Oncolumnschanged Routine */
      returnInSub = false ;
      AV18ColumnsSelectorXML = Ddo_gridcolumnsselector_Columnsselectorvalues ;
      AV20ColumnsSelector.fromJSonString(AV18ColumnsSelectorXML, null);
      new app.wwpbaseobjects.savecolumnsselectorstate(remoteHandle, context).execute( "ListadodeHDRs_WCColumnsSelector", ((GXutil.strcmp("", AV18ColumnsSelectorXML)==0) ? "" : AV20ColumnsSelector.toxml(false, true, "WWPColumnsSelector", "TexplusNET"))) ;
      httpContext.doAjaxRefreshCmp(sPrefix);
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV20ColumnsSelector", AV20ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV23ManageFiltersData", AV23ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV10GridState", AV10GridState);
   }

   public void e111EF2( )
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
         httpContext.popup(formatLink("app.wwpbaseobjects.savefilteras", new String[] {GXutil.URLEncode(GXutil.rtrim("ListadodeHDRs_WCFilters")),GXutil.URLEncode(GXutil.rtrim(AV170Pgmname+"GridState"))}, new String[] {"UserKey","GridStateKey"}) , new Object[] {});
         AV25ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV25ManageFiltersExecutionStep", GXutil.str( AV25ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefreshCmp(sPrefix);
      }
      else if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Manage#>") == 0 )
      {
         httpContext.popup(formatLink("app.wwpbaseobjects.managefilters", new String[] {GXutil.URLEncode(GXutil.rtrim("ListadodeHDRs_WCFilters"))}, new String[] {"UserKey"}) , new Object[] {});
         AV25ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV25ManageFiltersExecutionStep", GXutil.str( AV25ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefreshCmp(sPrefix);
      }
      else
      {
         GXt_char1 = AV24ManageFiltersXml ;
         GXv_char5[0] = GXt_char1 ;
         new app.wwpbaseobjects.getfilterbyname(remoteHandle, context).execute( "ListadodeHDRs_WCFilters", Ddo_managefilters_Activeeventkey, GXv_char5) ;
         listadodehdrs_wc_impl.this.GXt_char1 = GXv_char5[0] ;
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
            new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV170Pgmname+"GridState", AV24ManageFiltersXml) ;
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
            httpContext.doAjaxRefreshCmp(sPrefix);
         }
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV10GridState", AV10GridState);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV20ColumnsSelector", AV20ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV23ManageFiltersData", AV23ManageFiltersData);
   }

   public void e161EF2( )
   {
      /* 'DoExport' Routine */
      returnInSub = false ;
      GXv_char5[0] = AV16ExcelFilename ;
      GXv_char4[0] = AV17ErrorMessage ;
      new app.listadodehdrs_wcexport(remoteHandle, context).execute( GXv_char5, GXv_char4) ;
      listadodehdrs_wc_impl.this.AV16ExcelFilename = GXv_char5[0] ;
      listadodehdrs_wc_impl.this.AV17ErrorMessage = GXv_char4[0] ;
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

   public void e171EF2( )
   {
      /* 'DoExportCSV' Routine */
      returnInSub = false ;
      callWebObject(formatLink("app.listadodehdrs_wcexportcsv", new String[] {}, new String[] {}) );
      httpContext.wjLocDisableFrm = (byte)(2) ;
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
      GXv_SdtWWPColumnsSelector14[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "CliCod", "", "Codigo", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "CliNom", "", "Cliente", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "PedidoCliente", "", "Pedido Cliente", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "BarNHdr", "", "N° Hdr", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "BarSer", "", "Articulo", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "BarSerDsc", "", "Descripcion", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "BarTipArt", "", "Tip. Art.", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "BarTipArtDsc", "", "Descripcion", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "BarColNom", "", "Color", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "BarColNum", "", "Numero", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "BarNomCli", "", "Color Cliente", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "BarKgm", "Entradas", "Kilos", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "BarMtr", "Entradas", "Metros", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "BarPie", "Entradas", "Piezas", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "BarFecGen", "Fecha", "Generacion", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "BarFecCli", "Fecha", "Cliente", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "BarFecFpr", "Fecha", "Entrega Prevista", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "BarFasCod", "", "Fase", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "BarMaqCod", "", "Maquina", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "BarSit", "", "Situacion", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "BarAlbUltimo", "", "Albaran", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "BarAlbMts", "", "Mts Sal.", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "BarAlbKgs", "", "Kgs Sal.", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "BarCuaderno", "", "Cuaderno", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "BarNormas", "", "Normas", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "BarAlbFact", "", "Factura", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXt_char1 = AV19UserCustomValue ;
      GXv_char5[0] = GXt_char1 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "ListadodeHDRs_WCColumnsSelector", GXv_char5) ;
      listadodehdrs_wc_impl.this.GXt_char1 = GXv_char5[0] ;
      AV19UserCustomValue = GXt_char1 ;
      if ( ! ( (GXutil.strcmp("", AV19UserCustomValue)==0) ) )
      {
         AV21ColumnsSelectorAux.fromxml(AV19UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector14[0] = AV21ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector15[0] = AV20ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, GXv_SdtWWPColumnsSelector15) ;
         AV21ColumnsSelectorAux = GXv_SdtWWPColumnsSelector14[0] ;
         AV20ColumnsSelector = GXv_SdtWWPColumnsSelector15[0] ;
      }
   }

   public void S112( )
   {
      /* 'LOADSAVEDFILTERS' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item16 = AV23ManageFiltersData ;
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item17[0] = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item16 ;
      new app.wwpbaseobjects.wwp_managefiltersloadsavedfilters(remoteHandle, context).execute( "ListadodeHDRs_WCFilters", "", "", false, GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item17) ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item16 = GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item17[0] ;
      AV23ManageFiltersData = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item16 ;
   }

   public void S192( )
   {
      /* 'CLEANFILTERS' Routine */
      returnInSub = false ;
      AV15FilterFullText = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV15FilterFullText", AV15FilterFullText);
      AV26TFCliCod = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV26TFCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV26TFCliCod), 6, 0));
      AV27TFCliCod_To = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV27TFCliCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV27TFCliCod_To), 6, 0));
      AV28TFCliNom = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV28TFCliNom", AV28TFCliNom);
      AV29TFCliNom_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV29TFCliNom_Sel", AV29TFCliNom_Sel);
      AV93TFPedidoCliente = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV93TFPedidoCliente", AV93TFPedidoCliente);
      AV94TFPedidoCliente_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV94TFPedidoCliente_Sel", AV94TFPedidoCliente_Sel);
      AV81TFBarNHdr = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV81TFBarNHdr", AV81TFBarNHdr);
      AV82TFBarNHdr_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV82TFBarNHdr_Sel", AV82TFBarNHdr_Sel);
      AV30TFBarSer = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV30TFBarSer", AV30TFBarSer);
      AV31TFBarSer_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV31TFBarSer_Sel", AV31TFBarSer_Sel);
      AV32TFBarSerDsc = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32TFBarSerDsc", AV32TFBarSerDsc);
      AV33TFBarSerDsc_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33TFBarSerDsc_Sel", AV33TFBarSerDsc_Sel);
      AV34TFBarTipArt = (short)(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34TFBarTipArt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34TFBarTipArt), 4, 0));
      AV35TFBarTipArt_To = (short)(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV35TFBarTipArt_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV35TFBarTipArt_To), 4, 0));
      AV36TFBarTipArtDsc = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36TFBarTipArtDsc", AV36TFBarTipArtDsc);
      AV37TFBarTipArtDsc_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37TFBarTipArtDsc_Sel", AV37TFBarTipArtDsc_Sel);
      AV38TFBarColNom = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV38TFBarColNom", AV38TFBarColNom);
      AV39TFBarColNom_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV39TFBarColNom_Sel", AV39TFBarColNom_Sel);
      AV40TFBarColNum = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV40TFBarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV40TFBarColNum), 6, 0));
      AV41TFBarColNum_To = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV41TFBarColNum_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV41TFBarColNum_To), 6, 0));
      AV46TFBarNomCli = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV46TFBarNomCli", AV46TFBarNomCli);
      AV47TFBarNomCli_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47TFBarNomCli_Sel", AV47TFBarNomCli_Sel);
      AV48TFBarKgm = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV48TFBarKgm", GXutil.ltrimstr( AV48TFBarKgm, 9, 2));
      AV49TFBarKgm_To = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV49TFBarKgm_To", GXutil.ltrimstr( AV49TFBarKgm_To, 9, 2));
      AV50TFBarMtr = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV50TFBarMtr", GXutil.ltrimstr( AV50TFBarMtr, 9, 2));
      AV51TFBarMtr_To = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV51TFBarMtr_To", GXutil.ltrimstr( AV51TFBarMtr_To, 9, 2));
      AV52TFBarPie = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV52TFBarPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV52TFBarPie), 6, 0));
      AV53TFBarPie_To = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV53TFBarPie_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV53TFBarPie_To), 6, 0));
      AV54TFBarFecGen = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV54TFBarFecGen", localUtil.format(AV54TFBarFecGen, "99/99/99"));
      AV58TFBarFecCli = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV58TFBarFecCli", localUtil.format(AV58TFBarFecCli, "99/99/99"));
      AV62TFBarFecFpr = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV62TFBarFecFpr", localUtil.format(AV62TFBarFecFpr, "99/99/99"));
      AV66TFBarFasCod = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV66TFBarFasCod", AV66TFBarFasCod);
      AV67TFBarFasCod_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV67TFBarFasCod_Sel", AV67TFBarFasCod_Sel);
      AV83TFBarMaqCod = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV83TFBarMaqCod", AV83TFBarMaqCod);
      AV84TFBarMaqCod_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV84TFBarMaqCod_Sel", AV84TFBarMaqCod_Sel);
      AV85TFBarSit = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV85TFBarSit", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV85TFBarSit), 2, 0));
      AV86TFBarSit_To = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV86TFBarSit_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV86TFBarSit_To), 2, 0));
      AV103TFBarAlbUltimo = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV103TFBarAlbUltimo", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV103TFBarAlbUltimo), 10, 0));
      AV104TFBarAlbUltimo_To = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV104TFBarAlbUltimo_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV104TFBarAlbUltimo_To), 10, 0));
      AV105TFBarAlbMts = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV105TFBarAlbMts", GXutil.ltrimstr( AV105TFBarAlbMts, 9, 2));
      AV106TFBarAlbMts_To = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV106TFBarAlbMts_To", GXutil.ltrimstr( AV106TFBarAlbMts_To, 9, 2));
      AV107TFBarAlbKgs = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV107TFBarAlbKgs", GXutil.ltrimstr( AV107TFBarAlbKgs, 9, 2));
      AV108TFBarAlbKgs_To = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV108TFBarAlbKgs_To", GXutil.ltrimstr( AV108TFBarAlbKgs_To, 9, 2));
      AV109TFBarCuaderno = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV109TFBarCuaderno", AV109TFBarCuaderno);
      AV110TFBarCuaderno_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV110TFBarCuaderno_Sel", AV110TFBarCuaderno_Sel);
      AV111TFBarNormas = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV111TFBarNormas", AV111TFBarNormas);
      AV112TFBarNormas_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV112TFBarNormas_Sel", AV112TFBarNormas_Sel);
      AV113TFBarAlbFact = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV113TFBarAlbFact", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV113TFBarAlbFact), 8, 0));
      AV114TFBarAlbFact_To = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV114TFBarAlbFact_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV114TFBarAlbFact_To), 8, 0));
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
      if ( GXutil.strcmp(AV22Session.getValue(AV170Pgmname+"GridState"), "") == 0 )
      {
         AV10GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV170Pgmname+"GridState"), null, null);
      }
      else
      {
         AV10GridState.fromxml(AV22Session.getValue(AV170Pgmname+"GridState"), null, null);
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
      AV171GXV1 = 1 ;
      while ( AV171GXV1 <= AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV171GXV1));
         if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV15FilterFullText = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV15FilterFullText", AV15FilterFullText);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICOD") == 0 )
         {
            AV26TFCliCod = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV26TFCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV26TFCliCod), 6, 0));
            AV27TFCliCod_To = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV27TFCliCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV27TFCliCod_To), 6, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV28TFCliNom = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV28TFCliNom", AV28TFCliNom);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV29TFCliNom_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV29TFCliNom_Sel", AV29TFCliNom_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPEDIDOCLIENTE") == 0 )
         {
            AV93TFPedidoCliente = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV93TFPedidoCliente", AV93TFPedidoCliente);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPEDIDOCLIENTE_SEL") == 0 )
         {
            AV94TFPedidoCliente_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV94TFPedidoCliente_Sel", AV94TFPedidoCliente_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNHDR") == 0 )
         {
            AV81TFBarNHdr = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV81TFBarNHdr", AV81TFBarNHdr);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNHDR_SEL") == 0 )
         {
            AV82TFBarNHdr_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV82TFBarNHdr_Sel", AV82TFBarNHdr_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSER") == 0 )
         {
            AV30TFBarSer = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV30TFBarSer", AV30TFBarSer);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSER_SEL") == 0 )
         {
            AV31TFBarSer_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV31TFBarSer_Sel", AV31TFBarSer_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSERDSC") == 0 )
         {
            AV32TFBarSerDsc = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32TFBarSerDsc", AV32TFBarSerDsc);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSERDSC_SEL") == 0 )
         {
            AV33TFBarSerDsc_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33TFBarSerDsc_Sel", AV33TFBarSerDsc_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARTIPART") == 0 )
         {
            AV34TFBarTipArt = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34TFBarTipArt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34TFBarTipArt), 4, 0));
            AV35TFBarTipArt_To = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV35TFBarTipArt_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV35TFBarTipArt_To), 4, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARTIPARTDSC") == 0 )
         {
            AV36TFBarTipArtDsc = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36TFBarTipArtDsc", AV36TFBarTipArtDsc);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARTIPARTDSC_SEL") == 0 )
         {
            AV37TFBarTipArtDsc_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37TFBarTipArtDsc_Sel", AV37TFBarTipArtDsc_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNOM") == 0 )
         {
            AV38TFBarColNom = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV38TFBarColNom", AV38TFBarColNom);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNOM_SEL") == 0 )
         {
            AV39TFBarColNom_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV39TFBarColNom_Sel", AV39TFBarColNom_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNUM") == 0 )
         {
            AV40TFBarColNum = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV40TFBarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV40TFBarColNum), 6, 0));
            AV41TFBarColNum_To = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV41TFBarColNum_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV41TFBarColNum_To), 6, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNOMCLI") == 0 )
         {
            AV46TFBarNomCli = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV46TFBarNomCli", AV46TFBarNomCli);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNOMCLI_SEL") == 0 )
         {
            AV47TFBarNomCli_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47TFBarNomCli_Sel", AV47TFBarNomCli_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARKGM") == 0 )
         {
            AV48TFBarKgm = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV48TFBarKgm", GXutil.ltrimstr( AV48TFBarKgm, 9, 2));
            AV49TFBarKgm_To = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV49TFBarKgm_To", GXutil.ltrimstr( AV49TFBarKgm_To, 9, 2));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARMTR") == 0 )
         {
            AV50TFBarMtr = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV50TFBarMtr", GXutil.ltrimstr( AV50TFBarMtr, 9, 2));
            AV51TFBarMtr_To = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV51TFBarMtr_To", GXutil.ltrimstr( AV51TFBarMtr_To, 9, 2));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARPIE") == 0 )
         {
            AV52TFBarPie = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV52TFBarPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV52TFBarPie), 6, 0));
            AV53TFBarPie_To = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV53TFBarPie_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV53TFBarPie_To), 6, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFECGEN") == 0 )
         {
            AV54TFBarFecGen = localUtil.ctod( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV54TFBarFecGen", localUtil.format(AV54TFBarFecGen, "99/99/99"));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFECCLI") == 0 )
         {
            AV58TFBarFecCli = localUtil.ctod( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV58TFBarFecCli", localUtil.format(AV58TFBarFecCli, "99/99/99"));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFECFPR") == 0 )
         {
            AV62TFBarFecFpr = localUtil.ctod( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV62TFBarFecFpr", localUtil.format(AV62TFBarFecFpr, "99/99/99"));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFASCOD") == 0 )
         {
            AV66TFBarFasCod = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV66TFBarFasCod", AV66TFBarFasCod);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFASCOD_SEL") == 0 )
         {
            AV67TFBarFasCod_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV67TFBarFasCod_Sel", AV67TFBarFasCod_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARMAQCOD") == 0 )
         {
            AV83TFBarMaqCod = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV83TFBarMaqCod", AV83TFBarMaqCod);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARMAQCOD_SEL") == 0 )
         {
            AV84TFBarMaqCod_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV84TFBarMaqCod_Sel", AV84TFBarMaqCod_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSIT") == 0 )
         {
            AV85TFBarSit = (byte)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV85TFBarSit", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV85TFBarSit), 2, 0));
            AV86TFBarSit_To = (byte)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV86TFBarSit_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV86TFBarSit_To), 2, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARALBULTIMO") == 0 )
         {
            AV103TFBarAlbUltimo = GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value()) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV103TFBarAlbUltimo", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV103TFBarAlbUltimo), 10, 0));
            AV104TFBarAlbUltimo_To = GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto()) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV104TFBarAlbUltimo_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV104TFBarAlbUltimo_To), 10, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARALBMTS") == 0 )
         {
            AV105TFBarAlbMts = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV105TFBarAlbMts", GXutil.ltrimstr( AV105TFBarAlbMts, 9, 2));
            AV106TFBarAlbMts_To = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV106TFBarAlbMts_To", GXutil.ltrimstr( AV106TFBarAlbMts_To, 9, 2));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARALBKGS") == 0 )
         {
            AV107TFBarAlbKgs = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV107TFBarAlbKgs", GXutil.ltrimstr( AV107TFBarAlbKgs, 9, 2));
            AV108TFBarAlbKgs_To = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV108TFBarAlbKgs_To", GXutil.ltrimstr( AV108TFBarAlbKgs_To, 9, 2));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCUADERNO") == 0 )
         {
            AV109TFBarCuaderno = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV109TFBarCuaderno", AV109TFBarCuaderno);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCUADERNO_SEL") == 0 )
         {
            AV110TFBarCuaderno_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV110TFBarCuaderno_Sel", AV110TFBarCuaderno_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNORMAS") == 0 )
         {
            AV111TFBarNormas = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV111TFBarNormas", AV111TFBarNormas);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNORMAS_SEL") == 0 )
         {
            AV112TFBarNormas_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV112TFBarNormas_Sel", AV112TFBarNormas_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARALBFACT") == 0 )
         {
            AV113TFBarAlbFact = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV113TFBarAlbFact", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV113TFBarAlbFact), 8, 0));
            AV114TFBarAlbFact_To = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV114TFBarAlbFact_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV114TFBarAlbFact_To), 8, 0));
         }
         AV171GXV1 = (int)(AV171GXV1+1) ;
      }
      GXt_char1 = "" ;
      GXv_char5[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV29TFCliNom_Sel)==0), AV29TFCliNom_Sel, GXv_char5) ;
      listadodehdrs_wc_impl.this.GXt_char1 = GXv_char5[0] ;
      GXt_char18 = "" ;
      GXv_char4[0] = GXt_char18 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV94TFPedidoCliente_Sel)==0), AV94TFPedidoCliente_Sel, GXv_char4) ;
      listadodehdrs_wc_impl.this.GXt_char18 = GXv_char4[0] ;
      GXt_char19 = "" ;
      GXv_char3[0] = GXt_char19 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV82TFBarNHdr_Sel)==0), AV82TFBarNHdr_Sel, GXv_char3) ;
      listadodehdrs_wc_impl.this.GXt_char19 = GXv_char3[0] ;
      GXt_char20 = "" ;
      GXv_char2[0] = GXt_char20 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV31TFBarSer_Sel)==0), AV31TFBarSer_Sel, GXv_char2) ;
      listadodehdrs_wc_impl.this.GXt_char20 = GXv_char2[0] ;
      GXt_char21 = "" ;
      GXv_char22[0] = GXt_char21 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV33TFBarSerDsc_Sel)==0), AV33TFBarSerDsc_Sel, GXv_char22) ;
      listadodehdrs_wc_impl.this.GXt_char21 = GXv_char22[0] ;
      GXt_char23 = "" ;
      GXv_char24[0] = GXt_char23 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV37TFBarTipArtDsc_Sel)==0), AV37TFBarTipArtDsc_Sel, GXv_char24) ;
      listadodehdrs_wc_impl.this.GXt_char23 = GXv_char24[0] ;
      GXt_char25 = "" ;
      GXv_char26[0] = GXt_char25 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV39TFBarColNom_Sel)==0), AV39TFBarColNom_Sel, GXv_char26) ;
      listadodehdrs_wc_impl.this.GXt_char25 = GXv_char26[0] ;
      GXt_char27 = "" ;
      GXv_char28[0] = GXt_char27 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV47TFBarNomCli_Sel)==0), AV47TFBarNomCli_Sel, GXv_char28) ;
      listadodehdrs_wc_impl.this.GXt_char27 = GXv_char28[0] ;
      GXt_char29 = "" ;
      GXv_char30[0] = GXt_char29 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV67TFBarFasCod_Sel)==0), AV67TFBarFasCod_Sel, GXv_char30) ;
      listadodehdrs_wc_impl.this.GXt_char29 = GXv_char30[0] ;
      GXt_char31 = "" ;
      GXv_char32[0] = GXt_char31 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV84TFBarMaqCod_Sel)==0), AV84TFBarMaqCod_Sel, GXv_char32) ;
      listadodehdrs_wc_impl.this.GXt_char31 = GXv_char32[0] ;
      GXt_char33 = "" ;
      GXv_char34[0] = GXt_char33 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV110TFBarCuaderno_Sel)==0), AV110TFBarCuaderno_Sel, GXv_char34) ;
      listadodehdrs_wc_impl.this.GXt_char33 = GXv_char34[0] ;
      GXt_char35 = "" ;
      GXv_char36[0] = GXt_char35 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV112TFBarNormas_Sel)==0), AV112TFBarNormas_Sel, GXv_char36) ;
      listadodehdrs_wc_impl.this.GXt_char35 = GXv_char36[0] ;
      Ddo_grid_Selectedvalue_set = "|"+GXt_char1+"|"+GXt_char18+"|"+GXt_char19+"|"+GXt_char20+"|"+GXt_char21+"||"+GXt_char23+"|"+GXt_char25+"||"+GXt_char27+"|||||||"+GXt_char29+"|"+GXt_char31+"|||||"+GXt_char33+"|"+GXt_char35+"|" ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      GXt_char35 = "" ;
      GXv_char36[0] = GXt_char35 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV28TFCliNom)==0), AV28TFCliNom, GXv_char36) ;
      listadodehdrs_wc_impl.this.GXt_char35 = GXv_char36[0] ;
      GXt_char33 = "" ;
      GXv_char34[0] = GXt_char33 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV93TFPedidoCliente)==0), AV93TFPedidoCliente, GXv_char34) ;
      listadodehdrs_wc_impl.this.GXt_char33 = GXv_char34[0] ;
      GXt_char31 = "" ;
      GXv_char32[0] = GXt_char31 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV81TFBarNHdr)==0), AV81TFBarNHdr, GXv_char32) ;
      listadodehdrs_wc_impl.this.GXt_char31 = GXv_char32[0] ;
      GXt_char29 = "" ;
      GXv_char30[0] = GXt_char29 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV30TFBarSer)==0), AV30TFBarSer, GXv_char30) ;
      listadodehdrs_wc_impl.this.GXt_char29 = GXv_char30[0] ;
      GXt_char27 = "" ;
      GXv_char28[0] = GXt_char27 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV32TFBarSerDsc)==0), AV32TFBarSerDsc, GXv_char28) ;
      listadodehdrs_wc_impl.this.GXt_char27 = GXv_char28[0] ;
      GXt_char25 = "" ;
      GXv_char26[0] = GXt_char25 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV36TFBarTipArtDsc)==0), AV36TFBarTipArtDsc, GXv_char26) ;
      listadodehdrs_wc_impl.this.GXt_char25 = GXv_char26[0] ;
      GXt_char23 = "" ;
      GXv_char24[0] = GXt_char23 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV38TFBarColNom)==0), AV38TFBarColNom, GXv_char24) ;
      listadodehdrs_wc_impl.this.GXt_char23 = GXv_char24[0] ;
      GXt_char21 = "" ;
      GXv_char22[0] = GXt_char21 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV46TFBarNomCli)==0), AV46TFBarNomCli, GXv_char22) ;
      listadodehdrs_wc_impl.this.GXt_char21 = GXv_char22[0] ;
      GXt_char20 = "" ;
      GXv_char5[0] = GXt_char20 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV66TFBarFasCod)==0), AV66TFBarFasCod, GXv_char5) ;
      listadodehdrs_wc_impl.this.GXt_char20 = GXv_char5[0] ;
      GXt_char19 = "" ;
      GXv_char4[0] = GXt_char19 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV83TFBarMaqCod)==0), AV83TFBarMaqCod, GXv_char4) ;
      listadodehdrs_wc_impl.this.GXt_char19 = GXv_char4[0] ;
      GXt_char18 = "" ;
      GXv_char3[0] = GXt_char18 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV109TFBarCuaderno)==0), AV109TFBarCuaderno, GXv_char3) ;
      listadodehdrs_wc_impl.this.GXt_char18 = GXv_char3[0] ;
      GXt_char1 = "" ;
      GXv_char2[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV111TFBarNormas)==0), AV111TFBarNormas, GXv_char2) ;
      listadodehdrs_wc_impl.this.GXt_char1 = GXv_char2[0] ;
      Ddo_grid_Filteredtext_set = ((0==AV26TFCliCod) ? "" : GXutil.str( AV26TFCliCod, 6, 0))+"|"+GXt_char35+"|"+GXt_char33+"|"+GXt_char31+"|"+GXt_char29+"|"+GXt_char27+"|"+((0==AV34TFBarTipArt) ? "" : GXutil.str( AV34TFBarTipArt, 4, 0))+"|"+GXt_char25+"|"+GXt_char23+"|"+((0==AV40TFBarColNum) ? "" : GXutil.str( AV40TFBarColNum, 6, 0))+"|"+GXt_char21+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV48TFBarKgm)==0) ? "" : GXutil.str( AV48TFBarKgm, 9, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV50TFBarMtr)==0) ? "" : GXutil.str( AV50TFBarMtr, 9, 2))+"|"+((0==AV52TFBarPie) ? "" : GXutil.str( AV52TFBarPie, 6, 0))+"|"+(GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV54TFBarFecGen)) ? "" : localUtil.dtoc( AV54TFBarFecGen, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"))+"|"+(GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV58TFBarFecCli)) ? "" : localUtil.dtoc( AV58TFBarFecCli, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"))+"|"+(GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV62TFBarFecFpr)) ? "" : localUtil.dtoc( AV62TFBarFecFpr, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"))+"|"+GXt_char20+"|"+GXt_char19+"|"+((0==AV85TFBarSit) ? "" : GXutil.str( AV85TFBarSit, 2, 0))+"|"+((0==AV103TFBarAlbUltimo) ? "" : GXutil.str( AV103TFBarAlbUltimo, 10, 0))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV105TFBarAlbMts)==0) ? "" : GXutil.str( AV105TFBarAlbMts, 9, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV107TFBarAlbKgs)==0) ? "" : GXutil.str( AV107TFBarAlbKgs, 9, 2))+"|"+GXt_char18+"|"+GXt_char1+"|"+((0==AV113TFBarAlbFact) ? "" : GXutil.str( AV113TFBarAlbFact, 8, 0)) ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = ((0==AV27TFCliCod_To) ? "" : GXutil.str( AV27TFCliCod_To, 6, 0))+"||||||"+((0==AV35TFBarTipArt_To) ? "" : GXutil.str( AV35TFBarTipArt_To, 4, 0))+"|||"+((0==AV41TFBarColNum_To) ? "" : GXutil.str( AV41TFBarColNum_To, 6, 0))+"||"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV49TFBarKgm_To)==0) ? "" : GXutil.str( AV49TFBarKgm_To, 9, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV51TFBarMtr_To)==0) ? "" : GXutil.str( AV51TFBarMtr_To, 9, 2))+"|"+((0==AV53TFBarPie_To) ? "" : GXutil.str( AV53TFBarPie_To, 6, 0))+"||||||"+((0==AV86TFBarSit_To) ? "" : GXutil.str( AV86TFBarSit_To, 2, 0))+"|"+((0==AV104TFBarAlbUltimo_To) ? "" : GXutil.str( AV104TFBarAlbUltimo_To, 10, 0))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV106TFBarAlbMts_To)==0) ? "" : GXutil.str( AV106TFBarAlbMts_To, 9, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV108TFBarAlbKgs_To)==0) ? "" : GXutil.str( AV108TFBarAlbKgs_To, 9, 2))+"|||"+((0==AV114TFBarAlbFact_To) ? "" : GXutil.str( AV114TFBarAlbFact_To, 8, 0)) ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
   }

   public void S152( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV10GridState.fromxml(AV22Session.getValue(AV170Pgmname+"GridState"), null, null);
      AV10GridState.setgxTv_SdtWWPGridState_Orderedby( AV12OrderedBy );
      AV10GridState.setgxTv_SdtWWPGridState_Ordereddsc( AV13OrderedDsc );
      AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState37[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState37, "FILTERFULLTEXT", "", !(GXutil.strcmp("", AV15FilterFullText)==0), (short)(0), AV15FilterFullText, "") ;
      AV10GridState = GXv_SdtWWPGridState37[0] ;
      GXv_SdtWWPGridState37[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState37, "TFCLICOD", "", !((0==AV26TFCliCod)&&(0==AV27TFCliCod_To)), (short)(0), GXutil.trim( GXutil.str( AV26TFCliCod, 6, 0)), GXutil.trim( GXutil.str( AV27TFCliCod_To, 6, 0))) ;
      AV10GridState = GXv_SdtWWPGridState37[0] ;
      GXv_SdtWWPGridState37[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState37, "TFCLINOM", "", !(GXutil.strcmp("", AV28TFCliNom)==0), (short)(0), AV28TFCliNom, "", !(GXutil.strcmp("", AV29TFCliNom_Sel)==0), AV29TFCliNom_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState37[0] ;
      GXv_SdtWWPGridState37[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState37, "TFPEDIDOCLIENTE", "", !(GXutil.strcmp("", AV93TFPedidoCliente)==0), (short)(0), AV93TFPedidoCliente, "", !(GXutil.strcmp("", AV94TFPedidoCliente_Sel)==0), AV94TFPedidoCliente_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState37[0] ;
      GXv_SdtWWPGridState37[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState37, "TFBARNHDR", "", !(GXutil.strcmp("", AV81TFBarNHdr)==0), (short)(0), AV81TFBarNHdr, "", !(GXutil.strcmp("", AV82TFBarNHdr_Sel)==0), AV82TFBarNHdr_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState37[0] ;
      GXv_SdtWWPGridState37[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState37, "TFBARSER", "", !(GXutil.strcmp("", AV30TFBarSer)==0), (short)(0), AV30TFBarSer, "", !(GXutil.strcmp("", AV31TFBarSer_Sel)==0), AV31TFBarSer_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState37[0] ;
      GXv_SdtWWPGridState37[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState37, "TFBARSERDSC", "", !(GXutil.strcmp("", AV32TFBarSerDsc)==0), (short)(0), AV32TFBarSerDsc, "", !(GXutil.strcmp("", AV33TFBarSerDsc_Sel)==0), AV33TFBarSerDsc_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState37[0] ;
      GXv_SdtWWPGridState37[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState37, "TFBARTIPART", "", !((0==AV34TFBarTipArt)&&(0==AV35TFBarTipArt_To)), (short)(0), GXutil.trim( GXutil.str( AV34TFBarTipArt, 4, 0)), GXutil.trim( GXutil.str( AV35TFBarTipArt_To, 4, 0))) ;
      AV10GridState = GXv_SdtWWPGridState37[0] ;
      GXv_SdtWWPGridState37[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState37, "TFBARTIPARTDSC", "", !(GXutil.strcmp("", AV36TFBarTipArtDsc)==0), (short)(0), AV36TFBarTipArtDsc, "", !(GXutil.strcmp("", AV37TFBarTipArtDsc_Sel)==0), AV37TFBarTipArtDsc_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState37[0] ;
      GXv_SdtWWPGridState37[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState37, "TFBARCOLNOM", "", !(GXutil.strcmp("", AV38TFBarColNom)==0), (short)(0), AV38TFBarColNom, "", !(GXutil.strcmp("", AV39TFBarColNom_Sel)==0), AV39TFBarColNom_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState37[0] ;
      GXv_SdtWWPGridState37[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState37, "TFBARCOLNUM", "", !((0==AV40TFBarColNum)&&(0==AV41TFBarColNum_To)), (short)(0), GXutil.trim( GXutil.str( AV40TFBarColNum, 6, 0)), GXutil.trim( GXutil.str( AV41TFBarColNum_To, 6, 0))) ;
      AV10GridState = GXv_SdtWWPGridState37[0] ;
      GXv_SdtWWPGridState37[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState37, "TFBARNOMCLI", "", !(GXutil.strcmp("", AV46TFBarNomCli)==0), (short)(0), AV46TFBarNomCli, "", !(GXutil.strcmp("", AV47TFBarNomCli_Sel)==0), AV47TFBarNomCli_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState37[0] ;
      GXv_SdtWWPGridState37[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState37, "TFBARKGM", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV48TFBarKgm)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV49TFBarKgm_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV48TFBarKgm, 9, 2)), GXutil.trim( GXutil.str( AV49TFBarKgm_To, 9, 2))) ;
      AV10GridState = GXv_SdtWWPGridState37[0] ;
      GXv_SdtWWPGridState37[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState37, "TFBARMTR", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV50TFBarMtr)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV51TFBarMtr_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV50TFBarMtr, 9, 2)), GXutil.trim( GXutil.str( AV51TFBarMtr_To, 9, 2))) ;
      AV10GridState = GXv_SdtWWPGridState37[0] ;
      GXv_SdtWWPGridState37[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState37, "TFBARPIE", "", !((0==AV52TFBarPie)&&(0==AV53TFBarPie_To)), (short)(0), GXutil.trim( GXutil.str( AV52TFBarPie, 6, 0)), GXutil.trim( GXutil.str( AV53TFBarPie_To, 6, 0))) ;
      AV10GridState = GXv_SdtWWPGridState37[0] ;
      GXv_SdtWWPGridState37[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState37, "TFBARFECGEN", "", !GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV54TFBarFecGen)), (short)(0), GXutil.trim( localUtil.dtoc( AV54TFBarFecGen, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")), "") ;
      AV10GridState = GXv_SdtWWPGridState37[0] ;
      GXv_SdtWWPGridState37[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState37, "TFBARFECCLI", "", !GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV58TFBarFecCli)), (short)(0), GXutil.trim( localUtil.dtoc( AV58TFBarFecCli, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")), "") ;
      AV10GridState = GXv_SdtWWPGridState37[0] ;
      GXv_SdtWWPGridState37[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState37, "TFBARFECFPR", "", !GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV62TFBarFecFpr)), (short)(0), GXutil.trim( localUtil.dtoc( AV62TFBarFecFpr, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")), "") ;
      AV10GridState = GXv_SdtWWPGridState37[0] ;
      GXv_SdtWWPGridState37[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState37, "TFBARFASCOD", "", !(GXutil.strcmp("", AV66TFBarFasCod)==0), (short)(0), AV66TFBarFasCod, "", !(GXutil.strcmp("", AV67TFBarFasCod_Sel)==0), AV67TFBarFasCod_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState37[0] ;
      GXv_SdtWWPGridState37[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState37, "TFBARMAQCOD", "", !(GXutil.strcmp("", AV83TFBarMaqCod)==0), (short)(0), AV83TFBarMaqCod, "", !(GXutil.strcmp("", AV84TFBarMaqCod_Sel)==0), AV84TFBarMaqCod_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState37[0] ;
      GXv_SdtWWPGridState37[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState37, "TFBARSIT", "", !((0==AV85TFBarSit)&&(0==AV86TFBarSit_To)), (short)(0), GXutil.trim( GXutil.str( AV85TFBarSit, 2, 0)), GXutil.trim( GXutil.str( AV86TFBarSit_To, 2, 0))) ;
      AV10GridState = GXv_SdtWWPGridState37[0] ;
      GXv_SdtWWPGridState37[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState37, "TFBARALBULTIMO", "", !((0==AV103TFBarAlbUltimo)&&(0==AV104TFBarAlbUltimo_To)), (short)(0), GXutil.trim( GXutil.str( AV103TFBarAlbUltimo, 10, 0)), GXutil.trim( GXutil.str( AV104TFBarAlbUltimo_To, 10, 0))) ;
      AV10GridState = GXv_SdtWWPGridState37[0] ;
      GXv_SdtWWPGridState37[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState37, "TFBARALBMTS", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV105TFBarAlbMts)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV106TFBarAlbMts_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV105TFBarAlbMts, 9, 2)), GXutil.trim( GXutil.str( AV106TFBarAlbMts_To, 9, 2))) ;
      AV10GridState = GXv_SdtWWPGridState37[0] ;
      GXv_SdtWWPGridState37[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState37, "TFBARALBKGS", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV107TFBarAlbKgs)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV108TFBarAlbKgs_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV107TFBarAlbKgs, 9, 2)), GXutil.trim( GXutil.str( AV108TFBarAlbKgs_To, 9, 2))) ;
      AV10GridState = GXv_SdtWWPGridState37[0] ;
      GXv_SdtWWPGridState37[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState37, "TFBARCUADERNO", "", !(GXutil.strcmp("", AV109TFBarCuaderno)==0), (short)(0), AV109TFBarCuaderno, "", !(GXutil.strcmp("", AV110TFBarCuaderno_Sel)==0), AV110TFBarCuaderno_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState37[0] ;
      GXv_SdtWWPGridState37[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState37, "TFBARNORMAS", "", !(GXutil.strcmp("", AV111TFBarNormas)==0), (short)(0), AV111TFBarNormas, "", !(GXutil.strcmp("", AV112TFBarNormas_Sel)==0), AV112TFBarNormas_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState37[0] ;
      GXv_SdtWWPGridState37[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState37, "TFBARALBFACT", "", !((0==AV113TFBarAlbFact)&&(0==AV114TFBarAlbFact_To)), (short)(0), GXutil.trim( GXutil.str( AV113TFBarAlbFact, 8, 0)), GXutil.trim( GXutil.str( AV114TFBarAlbFact_To, 8, 0))) ;
      AV10GridState = GXv_SdtWWPGridState37[0] ;
      if ( ! (GXutil.strcmp("", AV72Emprcod)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&EMPRCOD" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV72Emprcod );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV73BarSit) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&BARSIT" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV73BarSit, 2, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV74BarSit_to) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&BARSIT_TO" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV74BarSit_to, 2, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV75BarFecGen)) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&BARFECGEN" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( localUtil.dtoc( AV75BarFecGen, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV76BarFecGen_to)) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&BARFECGEN_TO" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( localUtil.dtoc( AV76BarFecGen_to, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV77Clicod) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&CLICOD" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV77Clicod, 6, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV78Clicod_to) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&CLICOD_TO" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV78Clicod_to, 6, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV79BarFecCli)) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&BARFECCLI" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( localUtil.dtoc( AV79BarFecCli, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV80BarFecCli_to)) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&BARFECCLI_TO" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( localUtil.dtoc( AV80BarFecCli_to, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      AV10GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV10GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV170Pgmname+"GridState", AV10GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S122( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV8TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV170Pgmname );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( true );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV7HTTPRequest.getScriptName()+"?"+AV7HTTPRequest.getQuerystring() );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "TTrn04" );
      AV22Session.setValue("TrnContext", AV8TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   public void S172( )
   {
      /* 'INITIALIZETOTALIZERS' Routine */
      returnInSub = false ;
      AV87TotBarKgm = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV87TotBarKgm", GXutil.ltrimstr( AV87TotBarKgm, 18, 2));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTBARKGM", getSecureSignedToken( sPrefix, localUtil.format( AV87TotBarKgm, "ZZZZZ9.99")));
      AV89TotBarMtr = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV89TotBarMtr", GXutil.ltrimstr( AV89TotBarMtr, 18, 2));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTBARMTR", getSecureSignedToken( sPrefix, localUtil.format( AV89TotBarMtr, "ZZZZZ9.99")));
      AV91TotBarPie = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV91TotBarPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV91TotBarPie), 18, 0));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTBARPIE", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV91TotBarPie), "ZZZZZ9")));
      AV99TotKilosPendientes = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV99TotKilosPendientes", GXutil.ltrimstr( AV99TotKilosPendientes, 18, 2));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTKILOSPENDIENTES", getSecureSignedToken( sPrefix, localUtil.format( AV99TotKilosPendientes, "ZZZZZ9.99")));
      AV101TotMetrosPendientes = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV101TotMetrosPendientes", GXutil.ltrimstr( AV101TotMetrosPendientes, 18, 2));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTMETROSPENDIENTES", getSecureSignedToken( sPrefix, localUtil.format( AV101TotMetrosPendientes, "ZZZZZ9.99")));
   }

   public void S182( )
   {
      /* 'CALCULATETOTALIZERS' Routine */
      returnInSub = false ;
      AV120Listadodehdrs_wcds_1_filterfulltext = AV15FilterFullText ;
      AV121Listadodehdrs_wcds_2_tfclicod = AV26TFCliCod ;
      AV122Listadodehdrs_wcds_3_tfclicod_to = AV27TFCliCod_To ;
      AV123Listadodehdrs_wcds_4_tfclinom = AV28TFCliNom ;
      AV124Listadodehdrs_wcds_5_tfclinom_sel = AV29TFCliNom_Sel ;
      AV125Listadodehdrs_wcds_6_tfpedidocliente = AV93TFPedidoCliente ;
      AV126Listadodehdrs_wcds_7_tfpedidocliente_sel = AV94TFPedidoCliente_Sel ;
      AV127Listadodehdrs_wcds_8_tfbarnhdr = AV81TFBarNHdr ;
      AV128Listadodehdrs_wcds_9_tfbarnhdr_sel = AV82TFBarNHdr_Sel ;
      AV129Listadodehdrs_wcds_10_tfbarser = AV30TFBarSer ;
      AV130Listadodehdrs_wcds_11_tfbarser_sel = AV31TFBarSer_Sel ;
      AV131Listadodehdrs_wcds_12_tfbarserdsc = AV32TFBarSerDsc ;
      AV132Listadodehdrs_wcds_13_tfbarserdsc_sel = AV33TFBarSerDsc_Sel ;
      AV133Listadodehdrs_wcds_14_tfbartipart = AV34TFBarTipArt ;
      AV134Listadodehdrs_wcds_15_tfbartipart_to = AV35TFBarTipArt_To ;
      AV135Listadodehdrs_wcds_16_tfbartipartdsc = AV36TFBarTipArtDsc ;
      AV136Listadodehdrs_wcds_17_tfbartipartdsc_sel = AV37TFBarTipArtDsc_Sel ;
      AV137Listadodehdrs_wcds_18_tfbarcolnom = AV38TFBarColNom ;
      AV138Listadodehdrs_wcds_19_tfbarcolnom_sel = AV39TFBarColNom_Sel ;
      AV139Listadodehdrs_wcds_20_tfbarcolnum = AV40TFBarColNum ;
      AV140Listadodehdrs_wcds_21_tfbarcolnum_to = AV41TFBarColNum_To ;
      AV141Listadodehdrs_wcds_22_tfbarnomcli = AV46TFBarNomCli ;
      AV142Listadodehdrs_wcds_23_tfbarnomcli_sel = AV47TFBarNomCli_Sel ;
      AV143Listadodehdrs_wcds_24_tfbarkgm = AV48TFBarKgm ;
      AV144Listadodehdrs_wcds_25_tfbarkgm_to = AV49TFBarKgm_To ;
      AV145Listadodehdrs_wcds_26_tfbarmtr = AV50TFBarMtr ;
      AV146Listadodehdrs_wcds_27_tfbarmtr_to = AV51TFBarMtr_To ;
      AV147Listadodehdrs_wcds_28_tfbarpie = AV52TFBarPie ;
      AV148Listadodehdrs_wcds_29_tfbarpie_to = AV53TFBarPie_To ;
      AV149Listadodehdrs_wcds_30_tfbarfecgen = AV54TFBarFecGen ;
      AV150Listadodehdrs_wcds_31_tfbarfeccli = AV58TFBarFecCli ;
      AV151Listadodehdrs_wcds_32_tfbarfecfpr = AV62TFBarFecFpr ;
      AV152Listadodehdrs_wcds_33_tfbarfascod = AV66TFBarFasCod ;
      AV153Listadodehdrs_wcds_34_tfbarfascod_sel = AV67TFBarFasCod_Sel ;
      AV154Listadodehdrs_wcds_35_tfbarmaqcod = AV83TFBarMaqCod ;
      AV155Listadodehdrs_wcds_36_tfbarmaqcod_sel = AV84TFBarMaqCod_Sel ;
      AV156Listadodehdrs_wcds_37_tfbarsit = AV85TFBarSit ;
      AV157Listadodehdrs_wcds_38_tfbarsit_to = AV86TFBarSit_To ;
      AV158Listadodehdrs_wcds_39_tfbaralbultimo = AV103TFBarAlbUltimo ;
      AV159Listadodehdrs_wcds_40_tfbaralbultimo_to = AV104TFBarAlbUltimo_To ;
      AV160Listadodehdrs_wcds_41_tfbaralbmts = AV105TFBarAlbMts ;
      AV161Listadodehdrs_wcds_42_tfbaralbmts_to = AV106TFBarAlbMts_To ;
      AV162Listadodehdrs_wcds_43_tfbaralbkgs = AV107TFBarAlbKgs ;
      AV163Listadodehdrs_wcds_44_tfbaralbkgs_to = AV108TFBarAlbKgs_To ;
      AV164Listadodehdrs_wcds_45_tfbarcuaderno = AV109TFBarCuaderno ;
      AV165Listadodehdrs_wcds_46_tfbarcuaderno_sel = AV110TFBarCuaderno_Sel ;
      AV166Listadodehdrs_wcds_47_tfbarnormas = AV111TFBarNormas ;
      AV167Listadodehdrs_wcds_48_tfbarnormas_sel = AV112TFBarNormas_Sel ;
      AV168Listadodehdrs_wcds_49_tfbaralbfact = AV113TFBarAlbFact ;
      AV169Listadodehdrs_wcds_50_tfbaralbfact_to = AV114TFBarAlbFact_To ;
      pr_default.dynParam(3, new Object[]{ new Object[]{
                                           Integer.valueOf(AV121Listadodehdrs_wcds_2_tfclicod) ,
                                           Integer.valueOf(AV122Listadodehdrs_wcds_3_tfclicod_to) ,
                                           AV124Listadodehdrs_wcds_5_tfclinom_sel ,
                                           AV123Listadodehdrs_wcds_4_tfclinom ,
                                           AV128Listadodehdrs_wcds_9_tfbarnhdr_sel ,
                                           AV127Listadodehdrs_wcds_8_tfbarnhdr ,
                                           AV130Listadodehdrs_wcds_11_tfbarser_sel ,
                                           AV129Listadodehdrs_wcds_10_tfbarser ,
                                           AV132Listadodehdrs_wcds_13_tfbarserdsc_sel ,
                                           AV131Listadodehdrs_wcds_12_tfbarserdsc ,
                                           Short.valueOf(AV133Listadodehdrs_wcds_14_tfbartipart) ,
                                           Short.valueOf(AV134Listadodehdrs_wcds_15_tfbartipart_to) ,
                                           AV136Listadodehdrs_wcds_17_tfbartipartdsc_sel ,
                                           AV135Listadodehdrs_wcds_16_tfbartipartdsc ,
                                           AV138Listadodehdrs_wcds_19_tfbarcolnom_sel ,
                                           AV137Listadodehdrs_wcds_18_tfbarcolnom ,
                                           Integer.valueOf(AV139Listadodehdrs_wcds_20_tfbarcolnum) ,
                                           Integer.valueOf(AV140Listadodehdrs_wcds_21_tfbarcolnum_to) ,
                                           AV142Listadodehdrs_wcds_23_tfbarnomcli_sel ,
                                           AV141Listadodehdrs_wcds_22_tfbarnomcli ,
                                           AV143Listadodehdrs_wcds_24_tfbarkgm ,
                                           AV144Listadodehdrs_wcds_25_tfbarkgm_to ,
                                           AV145Listadodehdrs_wcds_26_tfbarmtr ,
                                           AV146Listadodehdrs_wcds_27_tfbarmtr_to ,
                                           AV149Listadodehdrs_wcds_30_tfbarfecgen ,
                                           AV150Listadodehdrs_wcds_31_tfbarfeccli ,
                                           AV151Listadodehdrs_wcds_32_tfbarfecfpr ,
                                           AV155Listadodehdrs_wcds_36_tfbarmaqcod_sel ,
                                           AV154Listadodehdrs_wcds_35_tfbarmaqcod ,
                                           Byte.valueOf(AV156Listadodehdrs_wcds_37_tfbarsit) ,
                                           Byte.valueOf(AV157Listadodehdrs_wcds_38_tfbarsit_to) ,
                                           AV160Listadodehdrs_wcds_41_tfbaralbmts ,
                                           AV161Listadodehdrs_wcds_42_tfbaralbmts_to ,
                                           AV162Listadodehdrs_wcds_43_tfbaralbkgs ,
                                           AV163Listadodehdrs_wcds_44_tfbaralbkgs_to ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           A212BarSer ,
                                           A1652BarSerDsc ,
                                           Short.valueOf(A217BarTipArt) ,
                                           A13711BarTipArtD ,
                                           A135BarColNom ,
                                           Integer.valueOf(A136BarColNum) ,
                                           A1234BarNomCli ,
                                           A166BarKgm ,
                                           A184BarMtr ,
                                           A159BarFecGen ,
                                           A155BarFecCli ,
                                           A158BarFecFpr ,
                                           A180BarMaqCod ,
                                           Byte.valueOf(A213BarSit) ,
                                           A13931BarAlbMts ,
                                           A13932BarAlbKgs ,
                                           AV120Listadodehdrs_wcds_1_filterfulltext ,
                                           A13878PedidoClie ,
                                           A13696BarNHdr ,
                                           Integer.valueOf(A198BarPie) ,
                                           A151BarFasCod ,
                                           Long.valueOf(A13930BarAlbUlti) ,
                                           A13933BarCuadern ,
                                           A13934BarNormas ,
                                           Integer.valueOf(A13935BarAlbFact) ,
                                           AV126Listadodehdrs_wcds_7_tfpedidocliente_sel ,
                                           AV125Listadodehdrs_wcds_6_tfpedidocliente ,
                                           Integer.valueOf(AV147Listadodehdrs_wcds_28_tfbarpie) ,
                                           Integer.valueOf(AV148Listadodehdrs_wcds_29_tfbarpie_to) ,
                                           AV153Listadodehdrs_wcds_34_tfbarfascod_sel ,
                                           AV152Listadodehdrs_wcds_33_tfbarfascod ,
                                           Long.valueOf(AV158Listadodehdrs_wcds_39_tfbaralbultimo) ,
                                           Long.valueOf(AV159Listadodehdrs_wcds_40_tfbaralbultimo_to) ,
                                           AV165Listadodehdrs_wcds_46_tfbarcuaderno_sel ,
                                           AV164Listadodehdrs_wcds_45_tfbarcuaderno ,
                                           AV167Listadodehdrs_wcds_48_tfbarnormas_sel ,
                                           AV166Listadodehdrs_wcds_47_tfbarnormas ,
                                           Integer.valueOf(AV168Listadodehdrs_wcds_49_tfbaralbfact) ,
                                           Integer.valueOf(AV169Listadodehdrs_wcds_50_tfbaralbfact_to) ,
                                           AV75BarFecGen ,
                                           AV76BarFecGen_to ,
                                           AV79BarFecCli ,
                                           AV80BarFecCli_to ,
                                           Integer.valueOf(AV77Clicod) ,
                                           Integer.valueOf(AV78Clicod_to) ,
                                           Byte.valueOf(AV73BarSit) ,
                                           Byte.valueOf(AV74BarSit_to) ,
                                           AV72Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE,
                                           TypeConstants.BYTE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV152Listadodehdrs_wcds_33_tfbarfascod = GXutil.padr( GXutil.rtrim( AV152Listadodehdrs_wcds_33_tfbarfascod), 8, "%") ;
      lV164Listadodehdrs_wcds_45_tfbarcuaderno = GXutil.padr( GXutil.rtrim( AV164Listadodehdrs_wcds_45_tfbarcuaderno), 20, "%") ;
      lV123Listadodehdrs_wcds_4_tfclinom = GXutil.padr( GXutil.rtrim( AV123Listadodehdrs_wcds_4_tfclinom), 30, "%") ;
      lV127Listadodehdrs_wcds_8_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV127Listadodehdrs_wcds_8_tfbarnhdr), 11, "%") ;
      lV129Listadodehdrs_wcds_10_tfbarser = GXutil.padr( GXutil.rtrim( AV129Listadodehdrs_wcds_10_tfbarser), 16, "%") ;
      lV131Listadodehdrs_wcds_12_tfbarserdsc = GXutil.padr( GXutil.rtrim( AV131Listadodehdrs_wcds_12_tfbarserdsc), 26, "%") ;
      lV135Listadodehdrs_wcds_16_tfbartipartdsc = GXutil.padr( GXutil.rtrim( AV135Listadodehdrs_wcds_16_tfbartipartdsc), 30, "%") ;
      lV137Listadodehdrs_wcds_18_tfbarcolnom = GXutil.padr( GXutil.rtrim( AV137Listadodehdrs_wcds_18_tfbarcolnom), 13, "%") ;
      lV141Listadodehdrs_wcds_22_tfbarnomcli = GXutil.padr( GXutil.rtrim( AV141Listadodehdrs_wcds_22_tfbarnomcli), 13, "%") ;
      lV154Listadodehdrs_wcds_35_tfbarmaqcod = GXutil.padr( GXutil.rtrim( AV154Listadodehdrs_wcds_35_tfbarmaqcod), 6, "%") ;
      /* Using cursor H01EF25 */
      pr_default.execute(3, new Object[] {AV72Emprcod, AV153Listadodehdrs_wcds_34_tfbarfascod_sel, AV152Listadodehdrs_wcds_33_tfbarfascod, lV152Listadodehdrs_wcds_33_tfbarfascod, AV153Listadodehdrs_wcds_34_tfbarfascod_sel, AV153Listadodehdrs_wcds_34_tfbarfascod_sel, AV165Listadodehdrs_wcds_46_tfbarcuaderno_sel, AV164Listadodehdrs_wcds_45_tfbarcuaderno, lV164Listadodehdrs_wcds_45_tfbarcuaderno, AV165Listadodehdrs_wcds_46_tfbarcuaderno_sel, AV165Listadodehdrs_wcds_46_tfbarcuaderno_sel, AV75BarFecGen, AV76BarFecGen_to, AV79BarFecCli, AV80BarFecCli_to, AV80BarFecCli_to, Integer.valueOf(AV77Clicod), Integer.valueOf(AV78Clicod_to), Byte.valueOf(AV73BarSit), Byte.valueOf(AV74BarSit_to), Integer.valueOf(AV121Listadodehdrs_wcds_2_tfclicod), Integer.valueOf(AV122Listadodehdrs_wcds_3_tfclicod_to), lV123Listadodehdrs_wcds_4_tfclinom, AV124Listadodehdrs_wcds_5_tfclinom_sel, lV127Listadodehdrs_wcds_8_tfbarnhdr, AV128Listadodehdrs_wcds_9_tfbarnhdr_sel, lV129Listadodehdrs_wcds_10_tfbarser, AV130Listadodehdrs_wcds_11_tfbarser_sel, lV131Listadodehdrs_wcds_12_tfbarserdsc, AV132Listadodehdrs_wcds_13_tfbarserdsc_sel, Short.valueOf(AV133Listadodehdrs_wcds_14_tfbartipart), Short.valueOf(AV134Listadodehdrs_wcds_15_tfbartipart_to), lV135Listadodehdrs_wcds_16_tfbartipartdsc, AV136Listadodehdrs_wcds_17_tfbartipartdsc_sel, lV137Listadodehdrs_wcds_18_tfbarcolnom, AV138Listadodehdrs_wcds_19_tfbarcolnom_sel, Integer.valueOf(AV139Listadodehdrs_wcds_20_tfbarcolnum), Integer.valueOf(AV140Listadodehdrs_wcds_21_tfbarcolnum_to), lV141Listadodehdrs_wcds_22_tfbarnomcli, AV142Listadodehdrs_wcds_23_tfbarnomcli_sel, AV143Listadodehdrs_wcds_24_tfbarkgm, AV144Listadodehdrs_wcds_25_tfbarkgm_to, AV145Listadodehdrs_wcds_26_tfbarmtr, AV146Listadodehdrs_wcds_27_tfbarmtr_to, AV149Listadodehdrs_wcds_30_tfbarfecgen, AV150Listadodehdrs_wcds_31_tfbarfeccli, AV151Listadodehdrs_wcds_32_tfbarfecfpr, lV154Listadodehdrs_wcds_35_tfbarmaqcod, AV155Listadodehdrs_wcds_36_tfbarmaqcod_sel, Byte.valueOf(AV156Listadodehdrs_wcds_37_tfbarsit), Byte.valueOf(AV157Listadodehdrs_wcds_38_tfbarsit_to), AV160Listadodehdrs_wcds_41_tfbaralbmts, AV161Listadodehdrs_wcds_42_tfbaralbmts_to, AV162Listadodehdrs_wcds_43_tfbaralbkgs, AV163Listadodehdrs_wcds_44_tfbaralbkgs_to});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A4466BarAcaAnh = H01EF25_A4466BarAcaAnh[0] ;
         A213BarSit = H01EF25_A213BarSit[0] ;
         A180BarMaqCod = H01EF25_A180BarMaqCod[0] ;
         A158BarFecFpr = H01EF25_A158BarFecFpr[0] ;
         A155BarFecCli = H01EF25_A155BarFecCli[0] ;
         A159BarFecGen = H01EF25_A159BarFecGen[0] ;
         A1234BarNomCli = H01EF25_A1234BarNomCli[0] ;
         A136BarColNum = H01EF25_A136BarColNum[0] ;
         A135BarColNom = H01EF25_A135BarColNom[0] ;
         A13711BarTipArtD = H01EF25_A13711BarTipArtD[0] ;
         n13711BarTipArtD = H01EF25_n13711BarTipArtD[0] ;
         A217BarTipArt = H01EF25_A217BarTipArt[0] ;
         n217BarTipArt = H01EF25_n217BarTipArt[0] ;
         A1652BarSerDsc = H01EF25_A1652BarSerDsc[0] ;
         A212BarSer = H01EF25_A212BarSer[0] ;
         A13696BarNHdr = H01EF25_A13696BarNHdr[0] ;
         A279CliNom = H01EF25_A279CliNom[0] ;
         A252CliCod = H01EF25_A252CliCod[0] ;
         n252CliCod = H01EF25_n252CliCod[0] ;
         A13933BarCuadern = H01EF25_A13933BarCuadern[0] ;
         n13933BarCuadern = H01EF25_n13933BarCuadern[0] ;
         A13932BarAlbKgs = H01EF25_A13932BarAlbKgs[0] ;
         A13931BarAlbMts = H01EF25_A13931BarAlbMts[0] ;
         A151BarFasCod = H01EF25_A151BarFasCod[0] ;
         n151BarFasCod = H01EF25_n151BarFasCod[0] ;
         A13888MetrosEntr = H01EF25_A13888MetrosEntr[0] ;
         A184BarMtr = H01EF25_A184BarMtr[0] ;
         A13887KilosEntre = H01EF25_A13887KilosEntre[0] ;
         A166BarKgm = H01EF25_A166BarKgm[0] ;
         A143BarDisNum = H01EF25_A143BarDisNum[0] ;
         A4812BarEncCli = H01EF25_A4812BarEncCli[0] ;
         A199BarPie1 = H01EF25_A199BarPie1[0] ;
         A365DisDes = H01EF25_A365DisDes[0] ;
         A898BarPieNDes = H01EF25_A898BarPieNDes[0] ;
         A361DisCod = H01EF25_A361DisCod[0] ;
         A130BarCodPar = H01EF25_A130BarCodPar[0] ;
         A132BarCodReo = H01EF25_A132BarCodReo[0] ;
         A129BarCod = H01EF25_A129BarCod[0] ;
         A396EmprCod = H01EF25_A396EmprCod[0] ;
         A13711BarTipArtD = H01EF25_A13711BarTipArtD[0] ;
         n13711BarTipArtD = H01EF25_n13711BarTipArtD[0] ;
         A279CliNom = H01EF25_A279CliNom[0] ;
         A13933BarCuadern = H01EF25_A13933BarCuadern[0] ;
         n13933BarCuadern = H01EF25_n13933BarCuadern[0] ;
         A13932BarAlbKgs = H01EF25_A13932BarAlbKgs[0] ;
         A13931BarAlbMts = H01EF25_A13931BarAlbMts[0] ;
         A151BarFasCod = H01EF25_A151BarFasCod[0] ;
         n151BarFasCod = H01EF25_n151BarFasCod[0] ;
         A184BarMtr = H01EF25_A184BarMtr[0] ;
         A166BarKgm = H01EF25_A166BarKgm[0] ;
         A199BarPie1 = H01EF25_A199BarPie1[0] ;
         A898BarPieNDes = H01EF25_A898BarPieNDes[0] ;
         A13888MetrosEntr = H01EF25_A13888MetrosEntr[0] ;
         A13887KilosEntre = H01EF25_A13887KilosEntre[0] ;
         GXt_char35 = A13878PedidoClie ;
         GXv_char36[0] = A396EmprCod ;
         GXv_char34[0] = A4812BarEncCli ;
         GXv_char32[0] = A143BarDisNum ;
         GXv_char30[0] = GXt_char35 ;
         new app.core.ppedidocliente_formula(remoteHandle, context).execute( GXv_char36, GXv_char34, GXv_char32, GXv_char30) ;
         listadodehdrs_wc_impl.this.A396EmprCod = GXv_char36[0] ;
         listadodehdrs_wc_impl.this.A4812BarEncCli = GXv_char34[0] ;
         listadodehdrs_wc_impl.this.A143BarDisNum = GXv_char32[0] ;
         listadodehdrs_wc_impl.this.GXt_char35 = GXv_char30[0] ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A4812BarEncCli", A4812BarEncCli);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A143BarDisNum", A143BarDisNum);
         A13878PedidoClie = GXt_char35 ;
         if ( ! ( (GXutil.strcmp("", AV126Listadodehdrs_wcds_7_tfpedidocliente_sel)==0) && ( ! (GXutil.strcmp("", AV125Listadodehdrs_wcds_6_tfpedidocliente)==0) ) ) || ( GXutil.like( GXutil.upper( A13878PedidoClie) , GXutil.padr( "%" + GXutil.upper( AV125Listadodehdrs_wcds_6_tfpedidocliente) , 255 , "%"),  ' ' ) ) )
         {
            if ( (GXutil.strcmp("", AV126Listadodehdrs_wcds_7_tfpedidocliente_sel)==0) || ( ( GXutil.strcmp(A13878PedidoClie, AV126Listadodehdrs_wcds_7_tfpedidocliente_sel) == 0 ) ) )
            {
               GXt_int7 = A13930BarAlbUlti ;
               GXv_int8[0] = GXt_int7 ;
               new app.produccion.consultadeproduccion_albaranultimo(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, GXv_int8) ;
               listadodehdrs_wc_impl.this.GXt_int7 = GXv_int8[0] ;
               A13930BarAlbUlti = GXt_int7 ;
               if ( (0==AV158Listadodehdrs_wcds_39_tfbaralbultimo) || ( ( A13930BarAlbUlti >= AV158Listadodehdrs_wcds_39_tfbaralbultimo ) ) )
               {
                  if ( (0==AV159Listadodehdrs_wcds_40_tfbaralbultimo_to) || ( ( A13930BarAlbUlti <= AV159Listadodehdrs_wcds_40_tfbaralbultimo_to ) ) )
                  {
                     GXt_char35 = A13934BarNormas ;
                     GXv_char36[0] = GXt_char35 ;
                     new app.produccion.consultadeproduccion_normasestandarstextiles(remoteHandle, context).execute( A396EmprCod, A361DisCod, GXv_char36) ;
                     listadodehdrs_wc_impl.this.GXt_char35 = GXv_char36[0] ;
                     A13934BarNormas = GXt_char35 ;
                     if ( ! ( (GXutil.strcmp("", AV167Listadodehdrs_wcds_48_tfbarnormas_sel)==0) && ( ! (GXutil.strcmp("", AV166Listadodehdrs_wcds_47_tfbarnormas)==0) ) ) || ( GXutil.like( GXutil.upper( A13934BarNormas) , GXutil.padr( "%" + GXutil.upper( AV166Listadodehdrs_wcds_47_tfbarnormas) , 255 , "%"),  ' ' ) ) )
                     {
                        if ( (GXutil.strcmp("", AV167Listadodehdrs_wcds_48_tfbarnormas_sel)==0) || ( ( GXutil.strcmp(A13934BarNormas, AV167Listadodehdrs_wcds_48_tfbarnormas_sel) == 0 ) ) )
                        {
                           GXt_int9 = A13935BarAlbFact ;
                           GXv_int10[0] = GXt_int9 ;
                           new app.produccion.consultadeproduccion_factura(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, GXv_int10) ;
                           listadodehdrs_wc_impl.this.GXt_int9 = GXv_int10[0] ;
                           A13935BarAlbFact = GXt_int9 ;
                           if ( (0==AV168Listadodehdrs_wcds_49_tfbaralbfact) || ( ( A13935BarAlbFact >= AV168Listadodehdrs_wcds_49_tfbaralbfact ) ) )
                           {
                              if ( (0==AV169Listadodehdrs_wcds_50_tfbaralbfact_to) || ( ( A13935BarAlbFact <= AV169Listadodehdrs_wcds_50_tfbaralbfact_to ) ) )
                              {
                                 if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
                                 {
                                    A198BarPie = A898BarPieNDes ;
                                 }
                                 else
                                 {
                                    A198BarPie = A199BarPie1 ;
                                 }
                                 if ( (GXutil.strcmp("", AV120Listadodehdrs_wcds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A252CliCod, 6, 0) , GXutil.padr( "%" + AV120Listadodehdrs_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV120Listadodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13878PedidoClie) , GXutil.padr( "%" + GXutil.upper( AV120Listadodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13696BarNHdr) , GXutil.padr( "%" + GXutil.upper( AV120Listadodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A212BarSer) , GXutil.padr( "%" + GXutil.upper( AV120Listadodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1652BarSerDsc) , GXutil.padr( "%" + GXutil.upper( AV120Listadodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A217BarTipArt, 4, 0) , GXutil.padr( "%" + AV120Listadodehdrs_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13711BarTipArtD) , GXutil.padr( "%" + GXutil.upper( AV120Listadodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A135BarColNom) , GXutil.padr( "%" + GXutil.upper( AV120Listadodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A136BarColNum, 6, 0) , GXutil.padr( "%" + AV120Listadodehdrs_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1234BarNomCli) , GXutil.padr( "%" + GXutil.upper( AV120Listadodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A166BarKgm, 9, 2) , GXutil.padr( "%" + AV120Listadodehdrs_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A184BarMtr, 9, 2) , GXutil.padr( "%" + AV120Listadodehdrs_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A198BarPie, 6, 0) , GXutil.padr( "%" + AV120Listadodehdrs_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A151BarFasCod) , GXutil.padr( "%" + GXutil.upper( AV120Listadodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A180BarMaqCod) , GXutil.padr( "%" + GXutil.upper( AV120Listadodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A213BarSit, 2, 0) , GXutil.padr( "%" + AV120Listadodehdrs_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A13930BarAlbUlti, 10, 0) , GXutil.padr( "%" + AV120Listadodehdrs_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A13931BarAlbMts, 9, 2) , GXutil.padr( "%" + AV120Listadodehdrs_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A13932BarAlbKgs, 9, 2) , GXutil.padr( "%" + AV120Listadodehdrs_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13933BarCuadern) , GXutil.padr( "%" + GXutil.upper( AV120Listadodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13934BarNormas) , GXutil.padr( "%" + GXutil.upper( AV120Listadodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A13935BarAlbFact, 8, 0) , GXutil.padr( "%" + AV120Listadodehdrs_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) ) )
                                 {
                                    if ( (0==AV147Listadodehdrs_wcds_28_tfbarpie) || ( ( A198BarPie >= AV147Listadodehdrs_wcds_28_tfbarpie ) ) )
                                    {
                                       if ( (0==AV148Listadodehdrs_wcds_29_tfbarpie_to) || ( ( A198BarPie <= AV148Listadodehdrs_wcds_29_tfbarpie_to ) ) )
                                       {
                                          A13886MetrosPend = (A184BarMtr.subtract(DecimalUtil.doubleToDec(A13888MetrosEntr))) ;
                                          A13885KilosPendi = (A166BarKgm.subtract(A13887KilosEntre)) ;
                                          AV87TotBarKgm = A166BarKgm.add(AV87TotBarKgm) ;
                                          httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV87TotBarKgm", GXutil.ltrimstr( AV87TotBarKgm, 18, 2));
                                          app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTBARKGM", getSecureSignedToken( sPrefix, localUtil.format( AV87TotBarKgm, "ZZZZZ9.99")));
                                          AV89TotBarMtr = A184BarMtr.add(AV89TotBarMtr) ;
                                          httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV89TotBarMtr", GXutil.ltrimstr( AV89TotBarMtr, 18, 2));
                                          app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTBARMTR", getSecureSignedToken( sPrefix, localUtil.format( AV89TotBarMtr, "ZZZZZ9.99")));
                                          AV91TotBarPie = (long)(A198BarPie+AV91TotBarPie) ;
                                          httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV91TotBarPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV91TotBarPie), 18, 0));
                                          app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTBARPIE", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV91TotBarPie), "ZZZZZ9")));
                                          AV99TotKilosPendientes = A13885KilosPendi.add(AV99TotKilosPendientes) ;
                                          httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV99TotKilosPendientes", GXutil.ltrimstr( AV99TotKilosPendientes, 18, 2));
                                          app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTKILOSPENDIENTES", getSecureSignedToken( sPrefix, localUtil.format( AV99TotKilosPendientes, "ZZZZZ9.99")));
                                          AV101TotMetrosPendientes = A13886MetrosPend.add(AV101TotMetrosPendientes) ;
                                          httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV101TotMetrosPendientes", GXutil.ltrimstr( AV101TotMetrosPendientes, 18, 2));
                                          app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTMETROSPENDIENTES", getSecureSignedToken( sPrefix, localUtil.format( AV101TotMetrosPendientes, "ZZZZZ9.99")));
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
         pr_default.readNext(3);
      }
      pr_default.close(3);
      AV88TotValueBarKgm = localUtil.format( AV87TotBarKgm, "ZZZZZ9.99") ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV88TotValueBarKgm", AV88TotValueBarKgm);
      AV90TotValueBarMtr = localUtil.format( AV89TotBarMtr, "ZZZZZ9.99") ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV90TotValueBarMtr", AV90TotValueBarMtr);
      AV92TotValueBarPie = localUtil.format( DecimalUtil.doubleToDec(AV91TotBarPie), "ZZZZZ9") ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV92TotValueBarPie", AV92TotValueBarPie);
      AV100TotValueKilosPendientes = localUtil.format( AV99TotKilosPendientes, "ZZZZZ9.99") ;
      AV102TotValueMetrosPendientes = localUtil.format( AV101TotMetrosPendientes, "ZZZZZ9.99") ;
   }

   public void wb_table2_87_1EF2( boolean wbgen )
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
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTotvaluebarkgm_Internalname, httpContext.getMessage( "Tot Value Bar Kgm", ""), "gx-form-item AttributeTotalizerLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 104,'" + sPrefix + "',false,'" + sGXsfl_41_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotvaluebarkgm_Internalname, AV88TotValueBarKgm, GXutil.rtrim( localUtil.format( AV88TotValueBarKgm, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,104);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotvaluebarkgm_Jsonclick, 0, "AttributeTotalizer", "", "", "", "", 1, edtavTotvaluebarkgm_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ListadodeHDRs_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTotvaluebarmtr_Internalname, httpContext.getMessage( "Tot Value Bar Mtr", ""), "gx-form-item AttributeTotalizerLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 107,'" + sPrefix + "',false,'" + sGXsfl_41_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotvaluebarmtr_Internalname, AV90TotValueBarMtr, GXutil.rtrim( localUtil.format( AV90TotValueBarMtr, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,107);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotvaluebarmtr_Jsonclick, 0, "AttributeTotalizer", "", "", "", "", 1, edtavTotvaluebarmtr_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ListadodeHDRs_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTotvaluebarpie_Internalname, httpContext.getMessage( "Tot Value Bar Pie", ""), "gx-form-item AttributeTotalizerLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 110,'" + sPrefix + "',false,'" + sGXsfl_41_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotvaluebarpie_Internalname, AV92TotValueBarPie, GXutil.rtrim( localUtil.format( AV92TotValueBarPie, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,110);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotvaluebarpie_Jsonclick, 0, "AttributeTotalizer", "", "", "", "", 1, edtavTotvaluebarpie_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ListadodeHDRs_WC.htm");
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
         wb_table2_87_1EF2e( true) ;
      }
      else
      {
         wb_table2_87_1EF2e( false) ;
      }
   }

   public void wb_table1_23_1EF2( boolean wbgen )
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
         wb_table3_28_1EF2( true) ;
      }
      else
      {
         wb_table3_28_1EF2( false) ;
      }
      return  ;
   }

   public void wb_table3_28_1EF2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_23_1EF2e( true) ;
      }
      else
      {
         wb_table1_23_1EF2e( false) ;
      }
   }

   public void wb_table3_28_1EF2( boolean wbgen )
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFilterfulltext_Internalname, AV15FilterFullText, GXutil.rtrim( localUtil.format( AV15FilterFullText, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,32);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", httpContext.getMessage( "WWP_Search", ""), edtavFilterfulltext_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavFilterfulltext_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "WWPFullTextFilter", "left", true, "", "HLP_ListadodeHDRs_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table3_28_1EF2e( true) ;
      }
      else
      {
         wb_table3_28_1EF2e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV72Emprcod = (String)getParm(obj,0,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV72Emprcod", AV72Emprcod);
      AV73BarSit = ((Number) GXutil.testNumericType( getParm(obj,1,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV73BarSit", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV73BarSit), 2, 0));
      AV74BarSit_to = ((Number) GXutil.testNumericType( getParm(obj,2,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV74BarSit_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV74BarSit_to), 2, 0));
      AV75BarFecGen = (java.util.Date)getParm(obj,3,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV75BarFecGen", localUtil.format(AV75BarFecGen, "99/99/99"));
      AV76BarFecGen_to = (java.util.Date)getParm(obj,4,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV76BarFecGen_to", localUtil.format(AV76BarFecGen_to, "99/99/99"));
      AV77Clicod = ((Number) GXutil.testNumericType( getParm(obj,5,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV77Clicod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV77Clicod), 6, 0));
      AV78Clicod_to = ((Number) GXutil.testNumericType( getParm(obj,6,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV78Clicod_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV78Clicod_to), 6, 0));
      AV79BarFecCli = (java.util.Date)getParm(obj,7,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV79BarFecCli", localUtil.format(AV79BarFecCli, "99/99/99"));
      AV80BarFecCli_to = (java.util.Date)getParm(obj,8,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV80BarFecCli_to", localUtil.format(AV80BarFecCli_to, "99/99/99"));
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
      pa1EF2( ) ;
      ws1EF2( ) ;
      we1EF2( ) ;
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
      sCtrlAV72Emprcod = (String)getParm(obj,0,TypeConstants.STRING) ;
      sCtrlAV73BarSit = (String)getParm(obj,1,TypeConstants.STRING) ;
      sCtrlAV74BarSit_to = (String)getParm(obj,2,TypeConstants.STRING) ;
      sCtrlAV75BarFecGen = (String)getParm(obj,3,TypeConstants.STRING) ;
      sCtrlAV76BarFecGen_to = (String)getParm(obj,4,TypeConstants.STRING) ;
      sCtrlAV77Clicod = (String)getParm(obj,5,TypeConstants.STRING) ;
      sCtrlAV78Clicod_to = (String)getParm(obj,6,TypeConstants.STRING) ;
      sCtrlAV79BarFecCli = (String)getParm(obj,7,TypeConstants.STRING) ;
      sCtrlAV80BarFecCli_to = (String)getParm(obj,8,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      pa1EF2( ) ;
      wcparametersget( ) ;
   }

   @SuppressWarnings("unchecked")
   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "listadodehdrs_wc", GetJustCreated( ));
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
         init_web_controls( ) ;
      }
      pa1EF2( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         AV72Emprcod = (String)getParm(obj,2,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV72Emprcod", AV72Emprcod);
         AV73BarSit = ((Number) GXutil.testNumericType( getParm(obj,3,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV73BarSit", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV73BarSit), 2, 0));
         AV74BarSit_to = ((Number) GXutil.testNumericType( getParm(obj,4,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV74BarSit_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV74BarSit_to), 2, 0));
         AV75BarFecGen = (java.util.Date)getParm(obj,5,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV75BarFecGen", localUtil.format(AV75BarFecGen, "99/99/99"));
         AV76BarFecGen_to = (java.util.Date)getParm(obj,6,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV76BarFecGen_to", localUtil.format(AV76BarFecGen_to, "99/99/99"));
         AV77Clicod = ((Number) GXutil.testNumericType( getParm(obj,7,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV77Clicod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV77Clicod), 6, 0));
         AV78Clicod_to = ((Number) GXutil.testNumericType( getParm(obj,8,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV78Clicod_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV78Clicod_to), 6, 0));
         AV79BarFecCli = (java.util.Date)getParm(obj,9,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV79BarFecCli", localUtil.format(AV79BarFecCli, "99/99/99"));
         AV80BarFecCli_to = (java.util.Date)getParm(obj,10,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV80BarFecCli_to", localUtil.format(AV80BarFecCli_to, "99/99/99"));
      }
      wcpOAV72Emprcod = httpContext.cgiGet( sPrefix+"wcpOAV72Emprcod") ;
      wcpOAV73BarSit = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV73BarSit"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV74BarSit_to = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV74BarSit_to"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV75BarFecGen = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV75BarFecGen"), 0) ;
      wcpOAV76BarFecGen_to = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV76BarFecGen_to"), 0) ;
      wcpOAV77Clicod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV77Clicod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV78Clicod_to = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV78Clicod_to"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV79BarFecCli = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV79BarFecCli"), 0) ;
      wcpOAV80BarFecCli_to = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV80BarFecCli_to"), 0) ;
      if ( ! GetJustCreated( ) && ( ( GXutil.strcmp(AV72Emprcod, wcpOAV72Emprcod) != 0 ) || ( AV73BarSit != wcpOAV73BarSit ) || ( AV74BarSit_to != wcpOAV74BarSit_to ) || !( GXutil.dateCompare(GXutil.resetTime(AV75BarFecGen), GXutil.resetTime(wcpOAV75BarFecGen)) ) || !( GXutil.dateCompare(GXutil.resetTime(AV76BarFecGen_to), GXutil.resetTime(wcpOAV76BarFecGen_to)) ) || ( AV77Clicod != wcpOAV77Clicod ) || ( AV78Clicod_to != wcpOAV78Clicod_to ) || !( GXutil.dateCompare(GXutil.resetTime(AV79BarFecCli), GXutil.resetTime(wcpOAV79BarFecCli)) ) || !( GXutil.dateCompare(GXutil.resetTime(AV80BarFecCli_to), GXutil.resetTime(wcpOAV80BarFecCli_to)) ) ) )
      {
         setjustcreated();
      }
      wcpOAV72Emprcod = AV72Emprcod ;
      wcpOAV73BarSit = AV73BarSit ;
      wcpOAV74BarSit_to = AV74BarSit_to ;
      wcpOAV75BarFecGen = AV75BarFecGen ;
      wcpOAV76BarFecGen_to = AV76BarFecGen_to ;
      wcpOAV77Clicod = AV77Clicod ;
      wcpOAV78Clicod_to = AV78Clicod_to ;
      wcpOAV79BarFecCli = AV79BarFecCli ;
      wcpOAV80BarFecCli_to = AV80BarFecCli_to ;
   }

   public void wcparametersget( )
   {
      /* Read Component Parameters. */
      sCtrlAV72Emprcod = httpContext.cgiGet( sPrefix+"AV72Emprcod_CTRL") ;
      if ( GXutil.len( sCtrlAV72Emprcod) > 0 )
      {
         AV72Emprcod = httpContext.cgiGet( sCtrlAV72Emprcod) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV72Emprcod", AV72Emprcod);
      }
      else
      {
         AV72Emprcod = httpContext.cgiGet( sPrefix+"AV72Emprcod_PARM") ;
      }
      sCtrlAV73BarSit = httpContext.cgiGet( sPrefix+"AV73BarSit_CTRL") ;
      if ( GXutil.len( sCtrlAV73BarSit) > 0 )
      {
         AV73BarSit = (byte)(localUtil.ctol( httpContext.cgiGet( sCtrlAV73BarSit), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV73BarSit", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV73BarSit), 2, 0));
      }
      else
      {
         AV73BarSit = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV73BarSit_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV74BarSit_to = httpContext.cgiGet( sPrefix+"AV74BarSit_to_CTRL") ;
      if ( GXutil.len( sCtrlAV74BarSit_to) > 0 )
      {
         AV74BarSit_to = (byte)(localUtil.ctol( httpContext.cgiGet( sCtrlAV74BarSit_to), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV74BarSit_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV74BarSit_to), 2, 0));
      }
      else
      {
         AV74BarSit_to = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV74BarSit_to_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV75BarFecGen = httpContext.cgiGet( sPrefix+"AV75BarFecGen_CTRL") ;
      if ( GXutil.len( sCtrlAV75BarFecGen) > 0 )
      {
         AV75BarFecGen = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( sCtrlAV75BarFecGen), 0)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV75BarFecGen", localUtil.format(AV75BarFecGen, "99/99/99"));
      }
      else
      {
         AV75BarFecGen = localUtil.ctod( httpContext.cgiGet( sPrefix+"AV75BarFecGen_PARM"), 0) ;
      }
      sCtrlAV76BarFecGen_to = httpContext.cgiGet( sPrefix+"AV76BarFecGen_to_CTRL") ;
      if ( GXutil.len( sCtrlAV76BarFecGen_to) > 0 )
      {
         AV76BarFecGen_to = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( sCtrlAV76BarFecGen_to), 0)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV76BarFecGen_to", localUtil.format(AV76BarFecGen_to, "99/99/99"));
      }
      else
      {
         AV76BarFecGen_to = localUtil.ctod( httpContext.cgiGet( sPrefix+"AV76BarFecGen_to_PARM"), 0) ;
      }
      sCtrlAV77Clicod = httpContext.cgiGet( sPrefix+"AV77Clicod_CTRL") ;
      if ( GXutil.len( sCtrlAV77Clicod) > 0 )
      {
         AV77Clicod = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV77Clicod), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV77Clicod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV77Clicod), 6, 0));
      }
      else
      {
         AV77Clicod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV77Clicod_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV78Clicod_to = httpContext.cgiGet( sPrefix+"AV78Clicod_to_CTRL") ;
      if ( GXutil.len( sCtrlAV78Clicod_to) > 0 )
      {
         AV78Clicod_to = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV78Clicod_to), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV78Clicod_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV78Clicod_to), 6, 0));
      }
      else
      {
         AV78Clicod_to = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV78Clicod_to_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV79BarFecCli = httpContext.cgiGet( sPrefix+"AV79BarFecCli_CTRL") ;
      if ( GXutil.len( sCtrlAV79BarFecCli) > 0 )
      {
         AV79BarFecCli = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( sCtrlAV79BarFecCli), 0)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV79BarFecCli", localUtil.format(AV79BarFecCli, "99/99/99"));
      }
      else
      {
         AV79BarFecCli = localUtil.ctod( httpContext.cgiGet( sPrefix+"AV79BarFecCli_PARM"), 0) ;
      }
      sCtrlAV80BarFecCli_to = httpContext.cgiGet( sPrefix+"AV80BarFecCli_to_CTRL") ;
      if ( GXutil.len( sCtrlAV80BarFecCli_to) > 0 )
      {
         AV80BarFecCli_to = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( sCtrlAV80BarFecCli_to), 0)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV80BarFecCli_to", localUtil.format(AV80BarFecCli_to, "99/99/99"));
      }
      else
      {
         AV80BarFecCli_to = localUtil.ctod( httpContext.cgiGet( sPrefix+"AV80BarFecCli_to_PARM"), 0) ;
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
      pa1EF2( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      ws1EF2( ) ;
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
      ws1EF2( ) ;
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void wcparametersset( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV72Emprcod_PARM", GXutil.rtrim( AV72Emprcod));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV72Emprcod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV72Emprcod_CTRL", GXutil.rtrim( sCtrlAV72Emprcod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV73BarSit_PARM", GXutil.ltrim( localUtil.ntoc( AV73BarSit, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV73BarSit)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV73BarSit_CTRL", GXutil.rtrim( sCtrlAV73BarSit));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV74BarSit_to_PARM", GXutil.ltrim( localUtil.ntoc( AV74BarSit_to, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV74BarSit_to)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV74BarSit_to_CTRL", GXutil.rtrim( sCtrlAV74BarSit_to));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV75BarFecGen_PARM", localUtil.dtoc( AV75BarFecGen, 0, "/"));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV75BarFecGen)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV75BarFecGen_CTRL", GXutil.rtrim( sCtrlAV75BarFecGen));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV76BarFecGen_to_PARM", localUtil.dtoc( AV76BarFecGen_to, 0, "/"));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV76BarFecGen_to)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV76BarFecGen_to_CTRL", GXutil.rtrim( sCtrlAV76BarFecGen_to));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV77Clicod_PARM", GXutil.ltrim( localUtil.ntoc( AV77Clicod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV77Clicod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV77Clicod_CTRL", GXutil.rtrim( sCtrlAV77Clicod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV78Clicod_to_PARM", GXutil.ltrim( localUtil.ntoc( AV78Clicod_to, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV78Clicod_to)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV78Clicod_to_CTRL", GXutil.rtrim( sCtrlAV78Clicod_to));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV79BarFecCli_PARM", localUtil.dtoc( AV79BarFecCli, 0, "/"));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV79BarFecCli)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV79BarFecCli_CTRL", GXutil.rtrim( sCtrlAV79BarFecCli));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV80BarFecCli_to_PARM", localUtil.dtoc( AV80BarFecCli_to, 0, "/"));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV80BarFecCli_to)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV80BarFecCli_to_CTRL", GXutil.rtrim( sCtrlAV80BarFecCli_to));
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
      we1EF2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268211674154", true, true);
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
      httpContext.AddJavascriptSource("listadodehdrs_wc.js", "?20268211674155", false, true);
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
      httpContext.AddJavascriptSource("DVelop/GridTitlesCategories/GridTitlesCategoriesRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void subsflControlProps_412( )
   {
      edtCliCod_Internalname = sPrefix+"CLICOD_"+sGXsfl_41_idx ;
      edtCliNom_Internalname = sPrefix+"CLINOM_"+sGXsfl_41_idx ;
      edtPedidoClie_Internalname = sPrefix+"PEDIDOCLIE_"+sGXsfl_41_idx ;
      edtBarNHdr_Internalname = sPrefix+"BARNHDR_"+sGXsfl_41_idx ;
      edtBarSer_Internalname = sPrefix+"BARSER_"+sGXsfl_41_idx ;
      edtBarSerDsc_Internalname = sPrefix+"BARSERDSC_"+sGXsfl_41_idx ;
      edtBarTipArt_Internalname = sPrefix+"BARTIPART_"+sGXsfl_41_idx ;
      edtBarTipArtD_Internalname = sPrefix+"BARTIPARTD_"+sGXsfl_41_idx ;
      edtBarColNom_Internalname = sPrefix+"BARCOLNOM_"+sGXsfl_41_idx ;
      edtBarColNum_Internalname = sPrefix+"BARCOLNUM_"+sGXsfl_41_idx ;
      edtBarTipCol_Internalname = sPrefix+"BARTIPCOL_"+sGXsfl_41_idx ;
      edtBarTipColD_Internalname = sPrefix+"BARTIPCOLD_"+sGXsfl_41_idx ;
      edtBarNomCli_Internalname = sPrefix+"BARNOMCLI_"+sGXsfl_41_idx ;
      edtBarKgm_Internalname = sPrefix+"BARKGM_"+sGXsfl_41_idx ;
      edtBarMtr_Internalname = sPrefix+"BARMTR_"+sGXsfl_41_idx ;
      edtBarPie_Internalname = sPrefix+"BARPIE_"+sGXsfl_41_idx ;
      edtBarFecGen_Internalname = sPrefix+"BARFECGEN_"+sGXsfl_41_idx ;
      edtBarFecCli_Internalname = sPrefix+"BARFECCLI_"+sGXsfl_41_idx ;
      edtBarFecFpr_Internalname = sPrefix+"BARFECFPR_"+sGXsfl_41_idx ;
      edtBarFasCod_Internalname = sPrefix+"BARFASCOD_"+sGXsfl_41_idx ;
      edtBarMaqCod_Internalname = sPrefix+"BARMAQCOD_"+sGXsfl_41_idx ;
      edtBarSit_Internalname = sPrefix+"BARSIT_"+sGXsfl_41_idx ;
      edtBarAlbUlti_Internalname = sPrefix+"BARALBULTI_"+sGXsfl_41_idx ;
      edtBarAlbMts_Internalname = sPrefix+"BARALBMTS_"+sGXsfl_41_idx ;
      edtBarAlbKgs_Internalname = sPrefix+"BARALBKGS_"+sGXsfl_41_idx ;
      edtBarCuadern_Internalname = sPrefix+"BARCUADERN_"+sGXsfl_41_idx ;
      edtBarNormas_Internalname = sPrefix+"BARNORMAS_"+sGXsfl_41_idx ;
      edtBarAlbFact_Internalname = sPrefix+"BARALBFACT_"+sGXsfl_41_idx ;
      edtBarHDSusp_Internalname = sPrefix+"BARHDSUSP_"+sGXsfl_41_idx ;
      edtBarNorma_Internalname = sPrefix+"BARNORMA_"+sGXsfl_41_idx ;
      edtBarMatColo_Internalname = sPrefix+"BARMATCOLO_"+sGXsfl_41_idx ;
      edtBarOEKOTEX_Internalname = sPrefix+"BAROEKOTEX_"+sGXsfl_41_idx ;
      edtBarFecEnE_Internalname = sPrefix+"BARFECENE_"+sGXsfl_41_idx ;
      edtBarIntColo_Internalname = sPrefix+"BARINTCOLO_"+sGXsfl_41_idx ;
      edtBarLocTel_Internalname = sPrefix+"BARLOCTEL_"+sGXsfl_41_idx ;
      edtBarSerDsc2_Internalname = sPrefix+"BARSERDSC2_"+sGXsfl_41_idx ;
      edtBarIdtx2_Internalname = sPrefix+"BARIDTX2_"+sGXsfl_41_idx ;
      edtBarIdtxDc_Internalname = sPrefix+"BARIDTXDC_"+sGXsfl_41_idx ;
      edtBarColCv_Internalname = sPrefix+"BARCOLCV_"+sGXsfl_41_idx ;
      edtKilosEntre_Internalname = sPrefix+"KILOSENTRE_"+sGXsfl_41_idx ;
      edtMetrosEntr_Internalname = sPrefix+"METROSENTR_"+sGXsfl_41_idx ;
      edtKilosPendi_Internalname = sPrefix+"KILOSPENDI_"+sGXsfl_41_idx ;
      edtMetrosPend_Internalname = sPrefix+"METROSPEND_"+sGXsfl_41_idx ;
   }

   public void subsflControlProps_fel_412( )
   {
      edtCliCod_Internalname = sPrefix+"CLICOD_"+sGXsfl_41_fel_idx ;
      edtCliNom_Internalname = sPrefix+"CLINOM_"+sGXsfl_41_fel_idx ;
      edtPedidoClie_Internalname = sPrefix+"PEDIDOCLIE_"+sGXsfl_41_fel_idx ;
      edtBarNHdr_Internalname = sPrefix+"BARNHDR_"+sGXsfl_41_fel_idx ;
      edtBarSer_Internalname = sPrefix+"BARSER_"+sGXsfl_41_fel_idx ;
      edtBarSerDsc_Internalname = sPrefix+"BARSERDSC_"+sGXsfl_41_fel_idx ;
      edtBarTipArt_Internalname = sPrefix+"BARTIPART_"+sGXsfl_41_fel_idx ;
      edtBarTipArtD_Internalname = sPrefix+"BARTIPARTD_"+sGXsfl_41_fel_idx ;
      edtBarColNom_Internalname = sPrefix+"BARCOLNOM_"+sGXsfl_41_fel_idx ;
      edtBarColNum_Internalname = sPrefix+"BARCOLNUM_"+sGXsfl_41_fel_idx ;
      edtBarTipCol_Internalname = sPrefix+"BARTIPCOL_"+sGXsfl_41_fel_idx ;
      edtBarTipColD_Internalname = sPrefix+"BARTIPCOLD_"+sGXsfl_41_fel_idx ;
      edtBarNomCli_Internalname = sPrefix+"BARNOMCLI_"+sGXsfl_41_fel_idx ;
      edtBarKgm_Internalname = sPrefix+"BARKGM_"+sGXsfl_41_fel_idx ;
      edtBarMtr_Internalname = sPrefix+"BARMTR_"+sGXsfl_41_fel_idx ;
      edtBarPie_Internalname = sPrefix+"BARPIE_"+sGXsfl_41_fel_idx ;
      edtBarFecGen_Internalname = sPrefix+"BARFECGEN_"+sGXsfl_41_fel_idx ;
      edtBarFecCli_Internalname = sPrefix+"BARFECCLI_"+sGXsfl_41_fel_idx ;
      edtBarFecFpr_Internalname = sPrefix+"BARFECFPR_"+sGXsfl_41_fel_idx ;
      edtBarFasCod_Internalname = sPrefix+"BARFASCOD_"+sGXsfl_41_fel_idx ;
      edtBarMaqCod_Internalname = sPrefix+"BARMAQCOD_"+sGXsfl_41_fel_idx ;
      edtBarSit_Internalname = sPrefix+"BARSIT_"+sGXsfl_41_fel_idx ;
      edtBarAlbUlti_Internalname = sPrefix+"BARALBULTI_"+sGXsfl_41_fel_idx ;
      edtBarAlbMts_Internalname = sPrefix+"BARALBMTS_"+sGXsfl_41_fel_idx ;
      edtBarAlbKgs_Internalname = sPrefix+"BARALBKGS_"+sGXsfl_41_fel_idx ;
      edtBarCuadern_Internalname = sPrefix+"BARCUADERN_"+sGXsfl_41_fel_idx ;
      edtBarNormas_Internalname = sPrefix+"BARNORMAS_"+sGXsfl_41_fel_idx ;
      edtBarAlbFact_Internalname = sPrefix+"BARALBFACT_"+sGXsfl_41_fel_idx ;
      edtBarHDSusp_Internalname = sPrefix+"BARHDSUSP_"+sGXsfl_41_fel_idx ;
      edtBarNorma_Internalname = sPrefix+"BARNORMA_"+sGXsfl_41_fel_idx ;
      edtBarMatColo_Internalname = sPrefix+"BARMATCOLO_"+sGXsfl_41_fel_idx ;
      edtBarOEKOTEX_Internalname = sPrefix+"BAROEKOTEX_"+sGXsfl_41_fel_idx ;
      edtBarFecEnE_Internalname = sPrefix+"BARFECENE_"+sGXsfl_41_fel_idx ;
      edtBarIntColo_Internalname = sPrefix+"BARINTCOLO_"+sGXsfl_41_fel_idx ;
      edtBarLocTel_Internalname = sPrefix+"BARLOCTEL_"+sGXsfl_41_fel_idx ;
      edtBarSerDsc2_Internalname = sPrefix+"BARSERDSC2_"+sGXsfl_41_fel_idx ;
      edtBarIdtx2_Internalname = sPrefix+"BARIDTX2_"+sGXsfl_41_fel_idx ;
      edtBarIdtxDc_Internalname = sPrefix+"BARIDTXDC_"+sGXsfl_41_fel_idx ;
      edtBarColCv_Internalname = sPrefix+"BARCOLCV_"+sGXsfl_41_fel_idx ;
      edtKilosEntre_Internalname = sPrefix+"KILOSENTRE_"+sGXsfl_41_fel_idx ;
      edtMetrosEntr_Internalname = sPrefix+"METROSENTR_"+sGXsfl_41_fel_idx ;
      edtKilosPendi_Internalname = sPrefix+"KILOSPENDI_"+sGXsfl_41_fel_idx ;
      edtMetrosPend_Internalname = sPrefix+"METROSPEND_"+sGXsfl_41_fel_idx ;
   }

   public void sendrow_412( )
   {
      subsflControlProps_412( ) ;
      wb1EF0( ) ;
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
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtCliCod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCliCod_Internalname,GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtCliCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtCliCod_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
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
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtPedidoClie_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPedidoClie_Internalname,GXutil.rtrim( A13878PedidoClie),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtPedidoClie_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtPedidoClie_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtBarNHdr_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarNHdr_Internalname,GXutil.rtrim( A13696BarNHdr),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarNHdr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtBarNHdr_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(11),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtBarSer_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarSer_Internalname,GXutil.rtrim( A212BarSer),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarSer_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtBarSer_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtBarSerDsc_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarSerDsc_Internalname,GXutil.rtrim( A1652BarSerDsc),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarSerDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtBarSerDsc_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtBarTipArt_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarTipArt_Internalname,GXutil.ltrim( localUtil.ntoc( A217BarTipArt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A217BarTipArt), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarTipArt_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtBarTipArt_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtBarTipArtD_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarTipArtD_Internalname,GXutil.rtrim( A13711BarTipArtD),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarTipArtD_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtBarTipArtD_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtBarColNom_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarColNom_Internalname,GXutil.rtrim( A135BarColNom),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarColNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtBarColNom_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtBarColNum_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarColNum_Internalname,GXutil.ltrim( localUtil.ntoc( A136BarColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A136BarColNum), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarColNum_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtBarColNum_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarTipCol_Internalname,GXutil.ltrim( localUtil.ntoc( A218BarTipCol, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A218BarTipCol), "Z9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarTipCol_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarTipColD_Internalname,GXutil.rtrim( A13868BarTipColD),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarTipColD_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtBarNomCli_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarNomCli_Internalname,GXutil.rtrim( A1234BarNomCli),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarNomCli_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtBarNomCli_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtBarKgm_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarKgm_Internalname,GXutil.ltrim( localUtil.ntoc( A166BarKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A166BarKgm, "ZZZZZ9.99")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarKgm_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtBarKgm_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtBarMtr_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarMtr_Internalname,GXutil.ltrim( localUtil.ntoc( A184BarMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A184BarMtr, "ZZZZZ9.99")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarMtr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtBarMtr_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtBarPie_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarPie_Internalname,GXutil.ltrim( localUtil.ntoc( A198BarPie, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A198BarPie), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarPie_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtBarPie_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtBarFecGen_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarFecGen_Internalname,localUtil.format(A159BarFecGen, "99/99/99"),localUtil.format( A159BarFecGen, "99/99/99"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarFecGen_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtBarFecGen_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtBarFecCli_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarFecCli_Internalname,localUtil.format(A155BarFecCli, "99/99/99"),localUtil.format( A155BarFecCli, "99/99/99"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarFecCli_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtBarFecCli_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtBarFecFpr_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarFecFpr_Internalname,localUtil.format(A158BarFecFpr, "99/99/99"),localUtil.format( A158BarFecFpr, "99/99/99"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarFecFpr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtBarFecFpr_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtBarFasCod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarFasCod_Internalname,GXutil.rtrim( A151BarFasCod),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarFasCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtBarFasCod_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtBarMaqCod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarMaqCod_Internalname,GXutil.rtrim( A180BarMaqCod),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarMaqCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtBarMaqCod_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtBarSit_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarSit_Internalname,GXutil.ltrim( localUtil.ntoc( A213BarSit, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A213BarSit), "Z9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarSit_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtBarSit_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtBarAlbUlti_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarAlbUlti_Internalname,GXutil.ltrim( localUtil.ntoc( A13930BarAlbUlti, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A13930BarAlbUlti), "ZZZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarAlbUlti_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtBarAlbUlti_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtBarAlbMts_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarAlbMts_Internalname,GXutil.ltrim( localUtil.ntoc( A13931BarAlbMts, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A13931BarAlbMts, "ZZZZZ9.99")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarAlbMts_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtBarAlbMts_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtBarAlbKgs_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarAlbKgs_Internalname,GXutil.ltrim( localUtil.ntoc( A13932BarAlbKgs, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A13932BarAlbKgs, "ZZZZZ9.99")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarAlbKgs_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtBarAlbKgs_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtBarCuadern_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarCuadern_Internalname,GXutil.rtrim( A13933BarCuadern),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarCuadern_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtBarCuadern_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtBarNormas_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarNormas_Internalname,A13934BarNormas,"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarNormas_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtBarNormas_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(100),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtBarAlbFact_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarAlbFact_Internalname,GXutil.ltrim( localUtil.ntoc( A13935BarAlbFact, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A13935BarAlbFact), "ZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarAlbFact_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtBarAlbFact_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarHDSusp_Internalname,GXutil.ltrim( localUtil.ntoc( A13890BarHDSusp, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A13890BarHDSusp), "9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarHDSusp_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarNorma_Internalname,GXutil.rtrim( A13902BarNorma),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarNorma_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarMatColo_Internalname,GXutil.ltrim( localUtil.ntoc( A13903BarMatColo, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A13903BarMatColo), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarMatColo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarOEKOTEX_Internalname,GXutil.rtrim( A12881BarOEKOTEX),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarOEKOTEX_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarFecEnE_Internalname,localUtil.format(A2447BarFecEnE, "99/99/99"),localUtil.format( A2447BarFecEnE, "99/99/99"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarFecEnE_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarIntColo_Internalname,GXutil.ltrim( localUtil.ntoc( A13904BarIntColo, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A13904BarIntColo), "Z9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarIntColo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarLocTel_Internalname,GXutil.rtrim( A12809BarLocTel),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarLocTel_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarSerDsc2_Internalname,A13907BarSerDsc2,"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarSerDsc2_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarIdtx2_Internalname,GXutil.rtrim( A13908BarIdtx2),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarIdtx2_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarIdtxDc_Internalname,GXutil.rtrim( A13909BarIdtxDc),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarIdtxDc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarColCv_Internalname,GXutil.rtrim( A13910BarColCv),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarColCv_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(35),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtKilosEntre_Internalname,GXutil.ltrim( localUtil.ntoc( A13887KilosEntre, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A13887KilosEntre, "ZZZZZ9.99")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtKilosEntre_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMetrosEntr_Internalname,GXutil.ltrim( localUtil.ntoc( A13888MetrosEntr, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A13888MetrosEntr), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtMetrosEntr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtKilosPendi_Internalname,GXutil.ltrim( localUtil.ntoc( A13885KilosPendi, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A13885KilosPendi, "ZZZZZ9.99")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtKilosPendi_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMetrosPend_Internalname,GXutil.ltrim( localUtil.ntoc( A13886MetrosPend, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A13886MetrosPend, "ZZZZZ9.99")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtMetrosPend_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         send_integrity_lvl_hashes1EF2( ) ;
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
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtCliCod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Codigo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtCliNom_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cliente", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPedidoClie_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Pedido Cliente", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarNHdr_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "N° Hdr", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarSer_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Articulo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarSerDsc_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripcion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarTipArt_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Tip. Art.", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarTipArtD_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripcion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarColNom_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Color", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarColNum_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Numero", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarNomCli_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Color Cliente", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarKgm_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Kilos", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarMtr_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Metros", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarPie_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Piezas", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarFecGen_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Generacion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarFecCli_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cliente", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarFecFpr_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Entrega Prevista", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarFasCod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fase", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarMaqCod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Maquina", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarSit_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Situacion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarAlbUlti_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Albaran", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarAlbMts_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Mts Sal.", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarAlbKgs_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Kgs Sal.", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarCuadern_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cuaderno", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarNormas_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Normas", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarAlbFact_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Factura", "")) ;
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
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
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
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
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
         GridContainer.AddObjectProperty("Class", "GridWithTotalizer GridWithPaginationBar GridNoBorder WorkWith");
         GridContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Sortable", GXutil.ltrim( localUtil.ntoc( subGrid_Sortable, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("CmpContext", sPrefix);
         GridContainer.AddObjectProperty("InMasterPage", "false");
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtCliCod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A279CliNom));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtCliNom_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A13878PedidoClie));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtPedidoClie_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A13696BarNHdr));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarNHdr_Visible, (byte)(5), (byte)(0), ".", "")));
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
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A217BarTipArt, (byte)(4), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarTipArt_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A13711BarTipArtD));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarTipArtD_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A135BarColNom));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarColNom_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A136BarColNum, (byte)(6), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarColNum_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A218BarTipCol, (byte)(2), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A13868BarTipColD));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A1234BarNomCli));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarNomCli_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A166BarKgm, (byte)(9), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarKgm_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A184BarMtr, (byte)(9), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarMtr_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A198BarPie, (byte)(6), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarPie_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.format(A159BarFecGen, "99/99/99"));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarFecGen_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.format(A155BarFecCli, "99/99/99"));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarFecCli_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.format(A158BarFecFpr, "99/99/99"));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarFecFpr_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A151BarFasCod));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarFasCod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A180BarMaqCod));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarMaqCod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A213BarSit, (byte)(2), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarSit_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A13930BarAlbUlti, (byte)(10), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarAlbUlti_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A13931BarAlbMts, (byte)(9), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarAlbMts_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A13932BarAlbKgs, (byte)(9), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarAlbKgs_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A13933BarCuadern));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarCuadern_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", A13934BarNormas);
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarNormas_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A13935BarAlbFact, (byte)(8), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarAlbFact_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A13890BarHDSusp, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A13902BarNorma));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A13903BarMatColo, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A12881BarOEKOTEX));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.format(A2447BarFecEnE, "99/99/99"));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A13904BarIntColo, (byte)(2), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A12809BarLocTel));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", A13907BarSerDsc2);
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A13908BarIdtx2));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A13909BarIdtxDc));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A13910BarColCv));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A13887KilosEntre, (byte)(9), (byte)(2), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A13888MetrosEntr, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A13885KilosPendi, (byte)(9), (byte)(2), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A13886MetrosPend, (byte)(9), (byte)(2), ".", "")));
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
      edtCliCod_Internalname = sPrefix+"CLICOD" ;
      edtCliNom_Internalname = sPrefix+"CLINOM" ;
      edtPedidoClie_Internalname = sPrefix+"PEDIDOCLIE" ;
      edtBarNHdr_Internalname = sPrefix+"BARNHDR" ;
      edtBarSer_Internalname = sPrefix+"BARSER" ;
      edtBarSerDsc_Internalname = sPrefix+"BARSERDSC" ;
      edtBarTipArt_Internalname = sPrefix+"BARTIPART" ;
      edtBarTipArtD_Internalname = sPrefix+"BARTIPARTD" ;
      edtBarColNom_Internalname = sPrefix+"BARCOLNOM" ;
      edtBarColNum_Internalname = sPrefix+"BARCOLNUM" ;
      edtBarTipCol_Internalname = sPrefix+"BARTIPCOL" ;
      edtBarTipColD_Internalname = sPrefix+"BARTIPCOLD" ;
      edtBarNomCli_Internalname = sPrefix+"BARNOMCLI" ;
      edtBarKgm_Internalname = sPrefix+"BARKGM" ;
      edtBarMtr_Internalname = sPrefix+"BARMTR" ;
      edtBarPie_Internalname = sPrefix+"BARPIE" ;
      edtBarFecGen_Internalname = sPrefix+"BARFECGEN" ;
      edtBarFecCli_Internalname = sPrefix+"BARFECCLI" ;
      edtBarFecFpr_Internalname = sPrefix+"BARFECFPR" ;
      edtBarFasCod_Internalname = sPrefix+"BARFASCOD" ;
      edtBarMaqCod_Internalname = sPrefix+"BARMAQCOD" ;
      edtBarSit_Internalname = sPrefix+"BARSIT" ;
      edtBarAlbUlti_Internalname = sPrefix+"BARALBULTI" ;
      edtBarAlbMts_Internalname = sPrefix+"BARALBMTS" ;
      edtBarAlbKgs_Internalname = sPrefix+"BARALBKGS" ;
      edtBarCuadern_Internalname = sPrefix+"BARCUADERN" ;
      edtBarNormas_Internalname = sPrefix+"BARNORMAS" ;
      edtBarAlbFact_Internalname = sPrefix+"BARALBFACT" ;
      edtBarHDSusp_Internalname = sPrefix+"BARHDSUSP" ;
      edtBarNorma_Internalname = sPrefix+"BARNORMA" ;
      edtBarMatColo_Internalname = sPrefix+"BARMATCOLO" ;
      edtBarOEKOTEX_Internalname = sPrefix+"BAROEKOTEX" ;
      edtBarFecEnE_Internalname = sPrefix+"BARFECENE" ;
      edtBarIntColo_Internalname = sPrefix+"BARINTCOLO" ;
      edtBarLocTel_Internalname = sPrefix+"BARLOCTEL" ;
      edtBarSerDsc2_Internalname = sPrefix+"BARSERDSC2" ;
      edtBarIdtx2_Internalname = sPrefix+"BARIDTX2" ;
      edtBarIdtxDc_Internalname = sPrefix+"BARIDTXDC" ;
      edtBarColCv_Internalname = sPrefix+"BARCOLCV" ;
      edtKilosEntre_Internalname = sPrefix+"KILOSENTRE" ;
      edtMetrosEntr_Internalname = sPrefix+"METROSENTR" ;
      edtKilosPendi_Internalname = sPrefix+"KILOSPENDI" ;
      edtMetrosPend_Internalname = sPrefix+"METROSPEND" ;
      edtavTotvaluebarkgm_Internalname = sPrefix+"vTOTVALUEBARKGM" ;
      edtavTotvaluebarmtr_Internalname = sPrefix+"vTOTVALUEBARMTR" ;
      edtavTotvaluebarpie_Internalname = sPrefix+"vTOTVALUEBARPIE" ;
      tblGridtabletotalizer_Internalname = sPrefix+"GRIDTABLETOTALIZER" ;
      Gridpaginationbar_Internalname = sPrefix+"GRIDPAGINATIONBAR" ;
      divGridtablewithpaginationbar_Internalname = sPrefix+"GRIDTABLEWITHPAGINATIONBAR" ;
      divTablemain_Internalname = sPrefix+"TABLEMAIN" ;
      Ddo_grid_Internalname = sPrefix+"DDO_GRID" ;
      Ddo_gridcolumnsselector_Internalname = sPrefix+"DDO_GRIDCOLUMNSSELECTOR" ;
      Grid_titlescategories_Internalname = sPrefix+"GRID_TITLESCATEGORIES" ;
      Grid_empowerer_Internalname = sPrefix+"GRID_EMPOWERER" ;
      edtavDdo_barfecgenauxdate_Internalname = sPrefix+"vDDO_BARFECGENAUXDATE" ;
      divDdo_barfecgenauxdates_Internalname = sPrefix+"DDO_BARFECGENAUXDATES" ;
      edtavDdo_barfeccliauxdate_Internalname = sPrefix+"vDDO_BARFECCLIAUXDATE" ;
      divDdo_barfeccliauxdates_Internalname = sPrefix+"DDO_BARFECCLIAUXDATES" ;
      edtavDdo_barfecfprauxdate_Internalname = sPrefix+"vDDO_BARFECFPRAUXDATE" ;
      divDdo_barfecfprauxdates_Internalname = sPrefix+"DDO_BARFECFPRAUXDATES" ;
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
      edtMetrosPend_Jsonclick = "" ;
      edtKilosPendi_Jsonclick = "" ;
      edtMetrosEntr_Jsonclick = "" ;
      edtKilosEntre_Jsonclick = "" ;
      edtBarColCv_Jsonclick = "" ;
      edtBarIdtxDc_Jsonclick = "" ;
      edtBarIdtx2_Jsonclick = "" ;
      edtBarSerDsc2_Jsonclick = "" ;
      edtBarLocTel_Jsonclick = "" ;
      edtBarIntColo_Jsonclick = "" ;
      edtBarFecEnE_Jsonclick = "" ;
      edtBarOEKOTEX_Jsonclick = "" ;
      edtBarMatColo_Jsonclick = "" ;
      edtBarNorma_Jsonclick = "" ;
      edtBarHDSusp_Jsonclick = "" ;
      edtBarAlbFact_Jsonclick = "" ;
      edtBarNormas_Jsonclick = "" ;
      edtBarCuadern_Jsonclick = "" ;
      edtBarAlbKgs_Jsonclick = "" ;
      edtBarAlbMts_Jsonclick = "" ;
      edtBarAlbUlti_Jsonclick = "" ;
      edtBarSit_Jsonclick = "" ;
      edtBarMaqCod_Jsonclick = "" ;
      edtBarFasCod_Jsonclick = "" ;
      edtBarFecFpr_Jsonclick = "" ;
      edtBarFecCli_Jsonclick = "" ;
      edtBarFecGen_Jsonclick = "" ;
      edtBarPie_Jsonclick = "" ;
      edtBarMtr_Jsonclick = "" ;
      edtBarKgm_Jsonclick = "" ;
      edtBarNomCli_Jsonclick = "" ;
      edtBarTipColD_Jsonclick = "" ;
      edtBarTipCol_Jsonclick = "" ;
      edtBarColNum_Jsonclick = "" ;
      edtBarColNom_Jsonclick = "" ;
      edtBarTipArtD_Jsonclick = "" ;
      edtBarTipArt_Jsonclick = "" ;
      edtBarSerDsc_Jsonclick = "" ;
      edtBarSer_Jsonclick = "" ;
      edtBarNHdr_Jsonclick = "" ;
      edtPedidoClie_Jsonclick = "" ;
      edtCliNom_Jsonclick = "" ;
      edtCliCod_Jsonclick = "" ;
      subGrid_Class = "GridWithTotalizer GridWithPaginationBar GridNoBorder WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavFilterfulltext_Jsonclick = "" ;
      edtavFilterfulltext_Enabled = 1 ;
      edtavTotvaluebarpie_Jsonclick = "" ;
      edtavTotvaluebarpie_Enabled = 1 ;
      edtavTotvaluebarmtr_Jsonclick = "" ;
      edtavTotvaluebarmtr_Enabled = 1 ;
      edtavTotvaluebarkgm_Jsonclick = "" ;
      edtavTotvaluebarkgm_Enabled = 1 ;
      edtBarAlbFact_Visible = -1 ;
      edtBarNormas_Visible = -1 ;
      edtBarCuadern_Visible = -1 ;
      edtBarAlbKgs_Visible = -1 ;
      edtBarAlbMts_Visible = -1 ;
      edtBarAlbUlti_Visible = -1 ;
      edtBarSit_Visible = -1 ;
      edtBarMaqCod_Visible = -1 ;
      edtBarFasCod_Visible = -1 ;
      edtBarFecFpr_Visible = -1 ;
      edtBarFecCli_Visible = -1 ;
      edtBarFecGen_Visible = -1 ;
      edtBarPie_Visible = -1 ;
      edtBarMtr_Visible = -1 ;
      edtBarKgm_Visible = -1 ;
      edtBarNomCli_Visible = -1 ;
      edtBarColNum_Visible = -1 ;
      edtBarColNom_Visible = -1 ;
      edtBarTipArtD_Visible = -1 ;
      edtBarTipArt_Visible = -1 ;
      edtBarSerDsc_Visible = -1 ;
      edtBarSer_Visible = -1 ;
      edtBarNHdr_Visible = -1 ;
      edtPedidoClie_Visible = -1 ;
      edtCliNom_Visible = -1 ;
      edtCliCod_Visible = -1 ;
      subGrid_Sortable = (byte)(0) ;
      edtavDdo_barfecfprauxdate_Jsonclick = "" ;
      edtavDdo_barfeccliauxdate_Jsonclick = "" ;
      edtavDdo_barfecgenauxdate_Jsonclick = "" ;
      Grid_empowerer_Hascolumnsselector = GXutil.toBoolean( -1) ;
      Grid_empowerer_Hastitlesettings = GXutil.toBoolean( -1) ;
      Grid_empowerer_Hascategories = GXutil.toBoolean( -1) ;
      Grid_titlescategories_Gridtitlescategories = ";;;;;;;;;;;;;Entradas;Entradas;Entradas;Fecha;Fecha;Fecha;;;;;;;;;;;;;;;;;;;;;;;PENDIENTES;PENDIENTES" ;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = "" ;
      Ddo_gridcolumnsselector_Dropdownoptionstype = "GridColumnsSelector" ;
      Ddo_gridcolumnsselector_Cls = "ColumnsSelector hidden-xs" ;
      Ddo_gridcolumnsselector_Tooltip = "WWP_EditColumnsTooltip" ;
      Ddo_gridcolumnsselector_Caption = httpContext.getMessage( "WWP_EditColumnsCaption", "") ;
      Ddo_grid_Datalistproc = "ListadodeHDRs_WCGetFilterData" ;
      Ddo_grid_Datalisttype = "|Dynamic|Dynamic|Dynamic|Dynamic|Dynamic||Dynamic|Dynamic||Dynamic|||||||Dynamic|Dynamic|||||Dynamic|Dynamic|" ;
      Ddo_grid_Includedatalist = "|T|T|T|T|T||T|T||T|||||||T|T|||||T|T|" ;
      Ddo_grid_Filterisrange = "T||||||T|||T||T|T|T||||||T|T|T|T|||T" ;
      Ddo_grid_Filtertype = "Numeric|Character|Character|Character|Character|Character|Numeric|Character|Character|Numeric|Character|Numeric|Numeric|Numeric|Date|Date|Date|Character|Character|Numeric|Numeric|Numeric|Numeric|Character|Character|Numeric" ;
      Ddo_grid_Includefilter = "T" ;
      Ddo_grid_Fixable = "T" ;
      Ddo_grid_Includesortasc = "T|T|||T|T|T|T|T|T|T||||T|T|T||T|T||||||" ;
      Ddo_grid_Columnssortvalues = "1|2|||3|4|5|6|7|8|9||||10|11|12||13|14||||||" ;
      Ddo_grid_Columnids = "0:CliCod|1:CliNom|2:PedidoCliente|3:BarNHdr|4:BarSer|5:BarSerDsc|6:BarTipArt|7:BarTipArtDsc|8:BarColNom|9:BarColNum|12:BarNomCli|13:BarKgm|14:BarMtr|15:BarPie|16:BarFecGen|17:BarFecCli|18:BarFecFpr|19:BarFasCod|20:BarMaqCod|21:BarSit|22:BarAlbUltimo|23:BarAlbMts|24:BarAlbKgs|25:BarCuaderno|26:BarNormas|27:BarAlbFact" ;
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'sPrefix'},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV72Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV73BarSit',fld:'vBARSIT',pic:'Z9'},{av:'AV74BarSit_to',fld:'vBARSIT_TO',pic:'Z9'},{av:'AV75BarFecGen',fld:'vBARFECGEN',pic:''},{av:'AV76BarFecGen_to',fld:'vBARFECGEN_TO',pic:''},{av:'AV77Clicod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV78Clicod_to',fld:'vCLICOD_TO',pic:'ZZZZZ9'},{av:'AV79BarFecCli',fld:'vBARFECCLI',pic:''},{av:'AV80BarFecCli_to',fld:'vBARFECCLI_TO',pic:''},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV26TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV27TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV28TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV29TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV93TFPedidoCliente',fld:'vTFPEDIDOCLIENTE',pic:''},{av:'AV94TFPedidoCliente_Sel',fld:'vTFPEDIDOCLIENTE_SEL',pic:''},{av:'AV81TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV82TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV30TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV31TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV32TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV33TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV34TFBarTipArt',fld:'vTFBARTIPART',pic:'ZZZ9'},{av:'AV35TFBarTipArt_To',fld:'vTFBARTIPART_TO',pic:'ZZZ9'},{av:'AV36TFBarTipArtDsc',fld:'vTFBARTIPARTDSC',pic:''},{av:'AV37TFBarTipArtDsc_Sel',fld:'vTFBARTIPARTDSC_SEL',pic:''},{av:'AV38TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV39TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV40TFBarColNum',fld:'vTFBARCOLNUM',pic:'ZZZZZ9'},{av:'AV41TFBarColNum_To',fld:'vTFBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV46TFBarNomCli',fld:'vTFBARNOMCLI',pic:''},{av:'AV47TFBarNomCli_Sel',fld:'vTFBARNOMCLI_SEL',pic:''},{av:'AV48TFBarKgm',fld:'vTFBARKGM',pic:'ZZZZZ9.99'},{av:'AV49TFBarKgm_To',fld:'vTFBARKGM_TO',pic:'ZZZZZ9.99'},{av:'AV50TFBarMtr',fld:'vTFBARMTR',pic:'ZZZZZ9.99'},{av:'AV51TFBarMtr_To',fld:'vTFBARMTR_TO',pic:'ZZZZZ9.99'},{av:'AV52TFBarPie',fld:'vTFBARPIE',pic:'ZZZZZ9'},{av:'AV53TFBarPie_To',fld:'vTFBARPIE_TO',pic:'ZZZZZ9'},{av:'AV54TFBarFecGen',fld:'vTFBARFECGEN',pic:''},{av:'AV58TFBarFecCli',fld:'vTFBARFECCLI',pic:''},{av:'AV62TFBarFecFpr',fld:'vTFBARFECFPR',pic:''},{av:'AV66TFBarFasCod',fld:'vTFBARFASCOD',pic:''},{av:'AV67TFBarFasCod_Sel',fld:'vTFBARFASCOD_SEL',pic:''},{av:'AV83TFBarMaqCod',fld:'vTFBARMAQCOD',pic:''},{av:'AV84TFBarMaqCod_Sel',fld:'vTFBARMAQCOD_SEL',pic:''},{av:'AV85TFBarSit',fld:'vTFBARSIT',pic:'Z9'},{av:'AV86TFBarSit_To',fld:'vTFBARSIT_TO',pic:'Z9'},{av:'AV103TFBarAlbUltimo',fld:'vTFBARALBULTIMO',pic:'ZZZZZZZZZ9'},{av:'AV104TFBarAlbUltimo_To',fld:'vTFBARALBULTIMO_TO',pic:'ZZZZZZZZZ9'},{av:'AV105TFBarAlbMts',fld:'vTFBARALBMTS',pic:'ZZZZZ9.99'},{av:'AV106TFBarAlbMts_To',fld:'vTFBARALBMTS_TO',pic:'ZZZZZ9.99'},{av:'AV107TFBarAlbKgs',fld:'vTFBARALBKGS',pic:'ZZZZZ9.99'},{av:'AV108TFBarAlbKgs_To',fld:'vTFBARALBKGS_TO',pic:'ZZZZZ9.99'},{av:'AV109TFBarCuaderno',fld:'vTFBARCUADERNO',pic:''},{av:'AV110TFBarCuaderno_Sel',fld:'vTFBARCUADERNO_SEL',pic:''},{av:'AV111TFBarNormas',fld:'vTFBARNORMAS',pic:''},{av:'AV112TFBarNormas_Sel',fld:'vTFBARNORMAS_SEL',pic:''},{av:'AV113TFBarAlbFact',fld:'vTFBARALBFACT',pic:'ZZZZZZZ9'},{av:'AV114TFBarAlbFact_To',fld:'vTFBARALBFACT_TO',pic:'ZZZZZZZ9'},{av:'AV170Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV87TotBarKgm',fld:'vTOTBARKGM',pic:'ZZZZZ9.99',hsh:true},{av:'AV89TotBarMtr',fld:'vTOTBARMTR',pic:'ZZZZZ9.99',hsh:true},{av:'AV91TotBarPie',fld:'vTOTBARPIE',pic:'ZZZZZ9',hsh:true},{av:'AV99TotKilosPendientes',fld:'vTOTKILOSPENDIENTES',pic:'ZZZZZ9.99',hsh:true},{av:'AV101TotMetrosPendientes',fld:'vTOTMETROSPENDIENTES',pic:'ZZZZZ9.99',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A159BarFecGen',fld:'BARFECGEN',pic:''},{av:'A155BarFecCli',fld:'BARFECCLI',pic:''},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A213BarSit',fld:'BARSIT',pic:'Z9'},{av:'A166BarKgm',fld:'BARKGM',pic:'ZZZZZ9.99'},{av:'A184BarMtr',fld:'BARMTR',pic:'ZZZZZ9.99'},{av:'A198BarPie',fld:'BARPIE',pic:'ZZZZZ9'},{av:'A13885KilosPendi',fld:'KILOSPENDI',pic:'ZZZZZ9.99'},{av:'A13886MetrosPend',fld:'METROSPEND',pic:'ZZZZZ9.99'}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtCliCod_Visible',ctrl:'CLICOD',prop:'Visible'},{av:'edtCliNom_Visible',ctrl:'CLINOM',prop:'Visible'},{av:'edtPedidoClie_Visible',ctrl:'PEDIDOCLIE',prop:'Visible'},{av:'edtBarNHdr_Visible',ctrl:'BARNHDR',prop:'Visible'},{av:'edtBarSer_Visible',ctrl:'BARSER',prop:'Visible'},{av:'edtBarSerDsc_Visible',ctrl:'BARSERDSC',prop:'Visible'},{av:'edtBarTipArt_Visible',ctrl:'BARTIPART',prop:'Visible'},{av:'edtBarTipArtD_Visible',ctrl:'BARTIPARTD',prop:'Visible'},{av:'edtBarColNom_Visible',ctrl:'BARCOLNOM',prop:'Visible'},{av:'edtBarColNum_Visible',ctrl:'BARCOLNUM',prop:'Visible'},{av:'edtBarNomCli_Visible',ctrl:'BARNOMCLI',prop:'Visible'},{av:'edtBarKgm_Visible',ctrl:'BARKGM',prop:'Visible'},{av:'edtBarMtr_Visible',ctrl:'BARMTR',prop:'Visible'},{av:'edtBarPie_Visible',ctrl:'BARPIE',prop:'Visible'},{av:'edtBarFecGen_Visible',ctrl:'BARFECGEN',prop:'Visible'},{av:'edtBarFecCli_Visible',ctrl:'BARFECCLI',prop:'Visible'},{av:'edtBarFecFpr_Visible',ctrl:'BARFECFPR',prop:'Visible'},{av:'edtBarFasCod_Visible',ctrl:'BARFASCOD',prop:'Visible'},{av:'edtBarMaqCod_Visible',ctrl:'BARMAQCOD',prop:'Visible'},{av:'edtBarSit_Visible',ctrl:'BARSIT',prop:'Visible'},{av:'edtBarAlbUlti_Visible',ctrl:'BARALBULTI',prop:'Visible'},{av:'edtBarAlbMts_Visible',ctrl:'BARALBMTS',prop:'Visible'},{av:'edtBarAlbKgs_Visible',ctrl:'BARALBKGS',prop:'Visible'},{av:'edtBarCuadern_Visible',ctrl:'BARCUADERN',prop:'Visible'},{av:'edtBarNormas_Visible',ctrl:'BARNORMAS',prop:'Visible'},{av:'edtBarAlbFact_Visible',ctrl:'BARALBFACT',prop:'Visible'},{av:'AV70GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV71GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV23ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV87TotBarKgm',fld:'vTOTBARKGM',pic:'ZZZZZ9.99',hsh:true},{av:'AV89TotBarMtr',fld:'vTOTBARMTR',pic:'ZZZZZ9.99',hsh:true},{av:'AV91TotBarPie',fld:'vTOTBARPIE',pic:'ZZZZZ9',hsh:true},{av:'AV99TotKilosPendientes',fld:'vTOTKILOSPENDIENTES',pic:'ZZZZZ9.99',hsh:true},{av:'AV101TotMetrosPendientes',fld:'vTOTMETROSPENDIENTES',pic:'ZZZZZ9.99',hsh:true},{av:'AV88TotValueBarKgm',fld:'vTOTVALUEBARKGM',pic:''},{av:'AV90TotValueBarMtr',fld:'vTOTVALUEBARMTR',pic:''},{av:'AV92TotValueBarPie',fld:'vTOTVALUEBARPIE',pic:''}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e121EF2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV72Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV73BarSit',fld:'vBARSIT',pic:'Z9'},{av:'AV74BarSit_to',fld:'vBARSIT_TO',pic:'Z9'},{av:'AV75BarFecGen',fld:'vBARFECGEN',pic:''},{av:'AV76BarFecGen_to',fld:'vBARFECGEN_TO',pic:''},{av:'AV77Clicod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV78Clicod_to',fld:'vCLICOD_TO',pic:'ZZZZZ9'},{av:'AV79BarFecCli',fld:'vBARFECCLI',pic:''},{av:'AV80BarFecCli_to',fld:'vBARFECCLI_TO',pic:''},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV26TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV27TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV28TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV29TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV93TFPedidoCliente',fld:'vTFPEDIDOCLIENTE',pic:''},{av:'AV94TFPedidoCliente_Sel',fld:'vTFPEDIDOCLIENTE_SEL',pic:''},{av:'AV81TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV82TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV30TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV31TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV32TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV33TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV34TFBarTipArt',fld:'vTFBARTIPART',pic:'ZZZ9'},{av:'AV35TFBarTipArt_To',fld:'vTFBARTIPART_TO',pic:'ZZZ9'},{av:'AV36TFBarTipArtDsc',fld:'vTFBARTIPARTDSC',pic:''},{av:'AV37TFBarTipArtDsc_Sel',fld:'vTFBARTIPARTDSC_SEL',pic:''},{av:'AV38TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV39TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV40TFBarColNum',fld:'vTFBARCOLNUM',pic:'ZZZZZ9'},{av:'AV41TFBarColNum_To',fld:'vTFBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV46TFBarNomCli',fld:'vTFBARNOMCLI',pic:''},{av:'AV47TFBarNomCli_Sel',fld:'vTFBARNOMCLI_SEL',pic:''},{av:'AV48TFBarKgm',fld:'vTFBARKGM',pic:'ZZZZZ9.99'},{av:'AV49TFBarKgm_To',fld:'vTFBARKGM_TO',pic:'ZZZZZ9.99'},{av:'AV50TFBarMtr',fld:'vTFBARMTR',pic:'ZZZZZ9.99'},{av:'AV51TFBarMtr_To',fld:'vTFBARMTR_TO',pic:'ZZZZZ9.99'},{av:'AV52TFBarPie',fld:'vTFBARPIE',pic:'ZZZZZ9'},{av:'AV53TFBarPie_To',fld:'vTFBARPIE_TO',pic:'ZZZZZ9'},{av:'AV54TFBarFecGen',fld:'vTFBARFECGEN',pic:''},{av:'AV58TFBarFecCli',fld:'vTFBARFECCLI',pic:''},{av:'AV62TFBarFecFpr',fld:'vTFBARFECFPR',pic:''},{av:'AV66TFBarFasCod',fld:'vTFBARFASCOD',pic:''},{av:'AV67TFBarFasCod_Sel',fld:'vTFBARFASCOD_SEL',pic:''},{av:'AV83TFBarMaqCod',fld:'vTFBARMAQCOD',pic:''},{av:'AV84TFBarMaqCod_Sel',fld:'vTFBARMAQCOD_SEL',pic:''},{av:'AV85TFBarSit',fld:'vTFBARSIT',pic:'Z9'},{av:'AV86TFBarSit_To',fld:'vTFBARSIT_TO',pic:'Z9'},{av:'AV103TFBarAlbUltimo',fld:'vTFBARALBULTIMO',pic:'ZZZZZZZZZ9'},{av:'AV104TFBarAlbUltimo_To',fld:'vTFBARALBULTIMO_TO',pic:'ZZZZZZZZZ9'},{av:'AV105TFBarAlbMts',fld:'vTFBARALBMTS',pic:'ZZZZZ9.99'},{av:'AV106TFBarAlbMts_To',fld:'vTFBARALBMTS_TO',pic:'ZZZZZ9.99'},{av:'AV107TFBarAlbKgs',fld:'vTFBARALBKGS',pic:'ZZZZZ9.99'},{av:'AV108TFBarAlbKgs_To',fld:'vTFBARALBKGS_TO',pic:'ZZZZZ9.99'},{av:'AV109TFBarCuaderno',fld:'vTFBARCUADERNO',pic:''},{av:'AV110TFBarCuaderno_Sel',fld:'vTFBARCUADERNO_SEL',pic:''},{av:'AV111TFBarNormas',fld:'vTFBARNORMAS',pic:''},{av:'AV112TFBarNormas_Sel',fld:'vTFBARNORMAS_SEL',pic:''},{av:'AV113TFBarAlbFact',fld:'vTFBARALBFACT',pic:'ZZZZZZZ9'},{av:'AV114TFBarAlbFact_To',fld:'vTFBARALBFACT_TO',pic:'ZZZZZZZ9'},{av:'AV170Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV87TotBarKgm',fld:'vTOTBARKGM',pic:'ZZZZZ9.99',hsh:true},{av:'AV89TotBarMtr',fld:'vTOTBARMTR',pic:'ZZZZZ9.99',hsh:true},{av:'AV91TotBarPie',fld:'vTOTBARPIE',pic:'ZZZZZ9',hsh:true},{av:'AV99TotKilosPendientes',fld:'vTOTKILOSPENDIENTES',pic:'ZZZZZ9.99',hsh:true},{av:'AV101TotMetrosPendientes',fld:'vTOTMETROSPENDIENTES',pic:'ZZZZZ9.99',hsh:true},{av:'sPrefix'},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e131EF2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV72Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV73BarSit',fld:'vBARSIT',pic:'Z9'},{av:'AV74BarSit_to',fld:'vBARSIT_TO',pic:'Z9'},{av:'AV75BarFecGen',fld:'vBARFECGEN',pic:''},{av:'AV76BarFecGen_to',fld:'vBARFECGEN_TO',pic:''},{av:'AV77Clicod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV78Clicod_to',fld:'vCLICOD_TO',pic:'ZZZZZ9'},{av:'AV79BarFecCli',fld:'vBARFECCLI',pic:''},{av:'AV80BarFecCli_to',fld:'vBARFECCLI_TO',pic:''},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV26TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV27TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV28TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV29TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV93TFPedidoCliente',fld:'vTFPEDIDOCLIENTE',pic:''},{av:'AV94TFPedidoCliente_Sel',fld:'vTFPEDIDOCLIENTE_SEL',pic:''},{av:'AV81TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV82TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV30TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV31TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV32TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV33TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV34TFBarTipArt',fld:'vTFBARTIPART',pic:'ZZZ9'},{av:'AV35TFBarTipArt_To',fld:'vTFBARTIPART_TO',pic:'ZZZ9'},{av:'AV36TFBarTipArtDsc',fld:'vTFBARTIPARTDSC',pic:''},{av:'AV37TFBarTipArtDsc_Sel',fld:'vTFBARTIPARTDSC_SEL',pic:''},{av:'AV38TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV39TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV40TFBarColNum',fld:'vTFBARCOLNUM',pic:'ZZZZZ9'},{av:'AV41TFBarColNum_To',fld:'vTFBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV46TFBarNomCli',fld:'vTFBARNOMCLI',pic:''},{av:'AV47TFBarNomCli_Sel',fld:'vTFBARNOMCLI_SEL',pic:''},{av:'AV48TFBarKgm',fld:'vTFBARKGM',pic:'ZZZZZ9.99'},{av:'AV49TFBarKgm_To',fld:'vTFBARKGM_TO',pic:'ZZZZZ9.99'},{av:'AV50TFBarMtr',fld:'vTFBARMTR',pic:'ZZZZZ9.99'},{av:'AV51TFBarMtr_To',fld:'vTFBARMTR_TO',pic:'ZZZZZ9.99'},{av:'AV52TFBarPie',fld:'vTFBARPIE',pic:'ZZZZZ9'},{av:'AV53TFBarPie_To',fld:'vTFBARPIE_TO',pic:'ZZZZZ9'},{av:'AV54TFBarFecGen',fld:'vTFBARFECGEN',pic:''},{av:'AV58TFBarFecCli',fld:'vTFBARFECCLI',pic:''},{av:'AV62TFBarFecFpr',fld:'vTFBARFECFPR',pic:''},{av:'AV66TFBarFasCod',fld:'vTFBARFASCOD',pic:''},{av:'AV67TFBarFasCod_Sel',fld:'vTFBARFASCOD_SEL',pic:''},{av:'AV83TFBarMaqCod',fld:'vTFBARMAQCOD',pic:''},{av:'AV84TFBarMaqCod_Sel',fld:'vTFBARMAQCOD_SEL',pic:''},{av:'AV85TFBarSit',fld:'vTFBARSIT',pic:'Z9'},{av:'AV86TFBarSit_To',fld:'vTFBARSIT_TO',pic:'Z9'},{av:'AV103TFBarAlbUltimo',fld:'vTFBARALBULTIMO',pic:'ZZZZZZZZZ9'},{av:'AV104TFBarAlbUltimo_To',fld:'vTFBARALBULTIMO_TO',pic:'ZZZZZZZZZ9'},{av:'AV105TFBarAlbMts',fld:'vTFBARALBMTS',pic:'ZZZZZ9.99'},{av:'AV106TFBarAlbMts_To',fld:'vTFBARALBMTS_TO',pic:'ZZZZZ9.99'},{av:'AV107TFBarAlbKgs',fld:'vTFBARALBKGS',pic:'ZZZZZ9.99'},{av:'AV108TFBarAlbKgs_To',fld:'vTFBARALBKGS_TO',pic:'ZZZZZ9.99'},{av:'AV109TFBarCuaderno',fld:'vTFBARCUADERNO',pic:''},{av:'AV110TFBarCuaderno_Sel',fld:'vTFBARCUADERNO_SEL',pic:''},{av:'AV111TFBarNormas',fld:'vTFBARNORMAS',pic:''},{av:'AV112TFBarNormas_Sel',fld:'vTFBARNORMAS_SEL',pic:''},{av:'AV113TFBarAlbFact',fld:'vTFBARALBFACT',pic:'ZZZZZZZ9'},{av:'AV114TFBarAlbFact_To',fld:'vTFBARALBFACT_TO',pic:'ZZZZZZZ9'},{av:'AV170Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV87TotBarKgm',fld:'vTOTBARKGM',pic:'ZZZZZ9.99',hsh:true},{av:'AV89TotBarMtr',fld:'vTOTBARMTR',pic:'ZZZZZ9.99',hsh:true},{av:'AV91TotBarPie',fld:'vTOTBARPIE',pic:'ZZZZZ9',hsh:true},{av:'AV99TotKilosPendientes',fld:'vTOTKILOSPENDIENTES',pic:'ZZZZZ9.99',hsh:true},{av:'AV101TotMetrosPendientes',fld:'vTOTMETROSPENDIENTES',pic:'ZZZZZ9.99',hsh:true},{av:'sPrefix'},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e141EF2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV72Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV73BarSit',fld:'vBARSIT',pic:'Z9'},{av:'AV74BarSit_to',fld:'vBARSIT_TO',pic:'Z9'},{av:'AV75BarFecGen',fld:'vBARFECGEN',pic:''},{av:'AV76BarFecGen_to',fld:'vBARFECGEN_TO',pic:''},{av:'AV77Clicod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV78Clicod_to',fld:'vCLICOD_TO',pic:'ZZZZZ9'},{av:'AV79BarFecCli',fld:'vBARFECCLI',pic:''},{av:'AV80BarFecCli_to',fld:'vBARFECCLI_TO',pic:''},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV26TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV27TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV28TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV29TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV93TFPedidoCliente',fld:'vTFPEDIDOCLIENTE',pic:''},{av:'AV94TFPedidoCliente_Sel',fld:'vTFPEDIDOCLIENTE_SEL',pic:''},{av:'AV81TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV82TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV30TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV31TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV32TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV33TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV34TFBarTipArt',fld:'vTFBARTIPART',pic:'ZZZ9'},{av:'AV35TFBarTipArt_To',fld:'vTFBARTIPART_TO',pic:'ZZZ9'},{av:'AV36TFBarTipArtDsc',fld:'vTFBARTIPARTDSC',pic:''},{av:'AV37TFBarTipArtDsc_Sel',fld:'vTFBARTIPARTDSC_SEL',pic:''},{av:'AV38TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV39TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV40TFBarColNum',fld:'vTFBARCOLNUM',pic:'ZZZZZ9'},{av:'AV41TFBarColNum_To',fld:'vTFBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV46TFBarNomCli',fld:'vTFBARNOMCLI',pic:''},{av:'AV47TFBarNomCli_Sel',fld:'vTFBARNOMCLI_SEL',pic:''},{av:'AV48TFBarKgm',fld:'vTFBARKGM',pic:'ZZZZZ9.99'},{av:'AV49TFBarKgm_To',fld:'vTFBARKGM_TO',pic:'ZZZZZ9.99'},{av:'AV50TFBarMtr',fld:'vTFBARMTR',pic:'ZZZZZ9.99'},{av:'AV51TFBarMtr_To',fld:'vTFBARMTR_TO',pic:'ZZZZZ9.99'},{av:'AV52TFBarPie',fld:'vTFBARPIE',pic:'ZZZZZ9'},{av:'AV53TFBarPie_To',fld:'vTFBARPIE_TO',pic:'ZZZZZ9'},{av:'AV54TFBarFecGen',fld:'vTFBARFECGEN',pic:''},{av:'AV58TFBarFecCli',fld:'vTFBARFECCLI',pic:''},{av:'AV62TFBarFecFpr',fld:'vTFBARFECFPR',pic:''},{av:'AV66TFBarFasCod',fld:'vTFBARFASCOD',pic:''},{av:'AV67TFBarFasCod_Sel',fld:'vTFBARFASCOD_SEL',pic:''},{av:'AV83TFBarMaqCod',fld:'vTFBARMAQCOD',pic:''},{av:'AV84TFBarMaqCod_Sel',fld:'vTFBARMAQCOD_SEL',pic:''},{av:'AV85TFBarSit',fld:'vTFBARSIT',pic:'Z9'},{av:'AV86TFBarSit_To',fld:'vTFBARSIT_TO',pic:'Z9'},{av:'AV103TFBarAlbUltimo',fld:'vTFBARALBULTIMO',pic:'ZZZZZZZZZ9'},{av:'AV104TFBarAlbUltimo_To',fld:'vTFBARALBULTIMO_TO',pic:'ZZZZZZZZZ9'},{av:'AV105TFBarAlbMts',fld:'vTFBARALBMTS',pic:'ZZZZZ9.99'},{av:'AV106TFBarAlbMts_To',fld:'vTFBARALBMTS_TO',pic:'ZZZZZ9.99'},{av:'AV107TFBarAlbKgs',fld:'vTFBARALBKGS',pic:'ZZZZZ9.99'},{av:'AV108TFBarAlbKgs_To',fld:'vTFBARALBKGS_TO',pic:'ZZZZZ9.99'},{av:'AV109TFBarCuaderno',fld:'vTFBARCUADERNO',pic:''},{av:'AV110TFBarCuaderno_Sel',fld:'vTFBARCUADERNO_SEL',pic:''},{av:'AV111TFBarNormas',fld:'vTFBARNORMAS',pic:''},{av:'AV112TFBarNormas_Sel',fld:'vTFBARNORMAS_SEL',pic:''},{av:'AV113TFBarAlbFact',fld:'vTFBARALBFACT',pic:'ZZZZZZZ9'},{av:'AV114TFBarAlbFact_To',fld:'vTFBARALBFACT_TO',pic:'ZZZZZZZ9'},{av:'AV170Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV87TotBarKgm',fld:'vTOTBARKGM',pic:'ZZZZZ9.99',hsh:true},{av:'AV89TotBarMtr',fld:'vTOTBARMTR',pic:'ZZZZZ9.99',hsh:true},{av:'AV91TotBarPie',fld:'vTOTBARPIE',pic:'ZZZZZ9',hsh:true},{av:'AV99TotKilosPendientes',fld:'vTOTKILOSPENDIENTES',pic:'ZZZZZ9.99',hsh:true},{av:'AV101TotMetrosPendientes',fld:'vTOTMETROSPENDIENTES',pic:'ZZZZZ9.99',hsh:true},{av:'sPrefix'},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'},{av:'Ddo_grid_Selectedvalue_get',ctrl:'DDO_GRID',prop:'SelectedValue_get'},{av:'Ddo_grid_Filteredtextto_get',ctrl:'DDO_GRID',prop:'FilteredTextTo_get'},{av:'Ddo_grid_Filteredtext_get',ctrl:'DDO_GRID',prop:'FilteredText_get'},{av:'Ddo_grid_Selectedcolumn',ctrl:'DDO_GRID',prop:'SelectedColumn'}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV113TFBarAlbFact',fld:'vTFBARALBFACT',pic:'ZZZZZZZ9'},{av:'AV114TFBarAlbFact_To',fld:'vTFBARALBFACT_TO',pic:'ZZZZZZZ9'},{av:'AV111TFBarNormas',fld:'vTFBARNORMAS',pic:''},{av:'AV112TFBarNormas_Sel',fld:'vTFBARNORMAS_SEL',pic:''},{av:'AV109TFBarCuaderno',fld:'vTFBARCUADERNO',pic:''},{av:'AV110TFBarCuaderno_Sel',fld:'vTFBARCUADERNO_SEL',pic:''},{av:'AV107TFBarAlbKgs',fld:'vTFBARALBKGS',pic:'ZZZZZ9.99'},{av:'AV108TFBarAlbKgs_To',fld:'vTFBARALBKGS_TO',pic:'ZZZZZ9.99'},{av:'AV105TFBarAlbMts',fld:'vTFBARALBMTS',pic:'ZZZZZ9.99'},{av:'AV106TFBarAlbMts_To',fld:'vTFBARALBMTS_TO',pic:'ZZZZZ9.99'},{av:'AV103TFBarAlbUltimo',fld:'vTFBARALBULTIMO',pic:'ZZZZZZZZZ9'},{av:'AV104TFBarAlbUltimo_To',fld:'vTFBARALBULTIMO_TO',pic:'ZZZZZZZZZ9'},{av:'AV85TFBarSit',fld:'vTFBARSIT',pic:'Z9'},{av:'AV86TFBarSit_To',fld:'vTFBARSIT_TO',pic:'Z9'},{av:'AV83TFBarMaqCod',fld:'vTFBARMAQCOD',pic:''},{av:'AV84TFBarMaqCod_Sel',fld:'vTFBARMAQCOD_SEL',pic:''},{av:'AV66TFBarFasCod',fld:'vTFBARFASCOD',pic:''},{av:'AV67TFBarFasCod_Sel',fld:'vTFBARFASCOD_SEL',pic:''},{av:'AV62TFBarFecFpr',fld:'vTFBARFECFPR',pic:''},{av:'AV58TFBarFecCli',fld:'vTFBARFECCLI',pic:''},{av:'AV54TFBarFecGen',fld:'vTFBARFECGEN',pic:''},{av:'AV52TFBarPie',fld:'vTFBARPIE',pic:'ZZZZZ9'},{av:'AV53TFBarPie_To',fld:'vTFBARPIE_TO',pic:'ZZZZZ9'},{av:'AV50TFBarMtr',fld:'vTFBARMTR',pic:'ZZZZZ9.99'},{av:'AV51TFBarMtr_To',fld:'vTFBARMTR_TO',pic:'ZZZZZ9.99'},{av:'AV48TFBarKgm',fld:'vTFBARKGM',pic:'ZZZZZ9.99'},{av:'AV49TFBarKgm_To',fld:'vTFBARKGM_TO',pic:'ZZZZZ9.99'},{av:'AV46TFBarNomCli',fld:'vTFBARNOMCLI',pic:''},{av:'AV47TFBarNomCli_Sel',fld:'vTFBARNOMCLI_SEL',pic:''},{av:'AV40TFBarColNum',fld:'vTFBARCOLNUM',pic:'ZZZZZ9'},{av:'AV41TFBarColNum_To',fld:'vTFBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV38TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV39TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV36TFBarTipArtDsc',fld:'vTFBARTIPARTDSC',pic:''},{av:'AV37TFBarTipArtDsc_Sel',fld:'vTFBARTIPARTDSC_SEL',pic:''},{av:'AV34TFBarTipArt',fld:'vTFBARTIPART',pic:'ZZZ9'},{av:'AV35TFBarTipArt_To',fld:'vTFBARTIPART_TO',pic:'ZZZ9'},{av:'AV32TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV33TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV30TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV31TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV81TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV82TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV93TFPedidoCliente',fld:'vTFPEDIDOCLIENTE',pic:''},{av:'AV94TFPedidoCliente_Sel',fld:'vTFPEDIDOCLIENTE_SEL',pic:''},{av:'AV28TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV29TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV26TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV27TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e201EF2',iparms:[]");
      setEventMetadata("GRID.LOAD",",oparms:[]}");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED","{handler:'e151EF2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV72Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV73BarSit',fld:'vBARSIT',pic:'Z9'},{av:'AV74BarSit_to',fld:'vBARSIT_TO',pic:'Z9'},{av:'AV75BarFecGen',fld:'vBARFECGEN',pic:''},{av:'AV76BarFecGen_to',fld:'vBARFECGEN_TO',pic:''},{av:'AV77Clicod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV78Clicod_to',fld:'vCLICOD_TO',pic:'ZZZZZ9'},{av:'AV79BarFecCli',fld:'vBARFECCLI',pic:''},{av:'AV80BarFecCli_to',fld:'vBARFECCLI_TO',pic:''},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV26TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV27TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV28TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV29TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV93TFPedidoCliente',fld:'vTFPEDIDOCLIENTE',pic:''},{av:'AV94TFPedidoCliente_Sel',fld:'vTFPEDIDOCLIENTE_SEL',pic:''},{av:'AV81TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV82TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV30TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV31TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV32TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV33TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV34TFBarTipArt',fld:'vTFBARTIPART',pic:'ZZZ9'},{av:'AV35TFBarTipArt_To',fld:'vTFBARTIPART_TO',pic:'ZZZ9'},{av:'AV36TFBarTipArtDsc',fld:'vTFBARTIPARTDSC',pic:''},{av:'AV37TFBarTipArtDsc_Sel',fld:'vTFBARTIPARTDSC_SEL',pic:''},{av:'AV38TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV39TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV40TFBarColNum',fld:'vTFBARCOLNUM',pic:'ZZZZZ9'},{av:'AV41TFBarColNum_To',fld:'vTFBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV46TFBarNomCli',fld:'vTFBARNOMCLI',pic:''},{av:'AV47TFBarNomCli_Sel',fld:'vTFBARNOMCLI_SEL',pic:''},{av:'AV48TFBarKgm',fld:'vTFBARKGM',pic:'ZZZZZ9.99'},{av:'AV49TFBarKgm_To',fld:'vTFBARKGM_TO',pic:'ZZZZZ9.99'},{av:'AV50TFBarMtr',fld:'vTFBARMTR',pic:'ZZZZZ9.99'},{av:'AV51TFBarMtr_To',fld:'vTFBARMTR_TO',pic:'ZZZZZ9.99'},{av:'AV52TFBarPie',fld:'vTFBARPIE',pic:'ZZZZZ9'},{av:'AV53TFBarPie_To',fld:'vTFBARPIE_TO',pic:'ZZZZZ9'},{av:'AV54TFBarFecGen',fld:'vTFBARFECGEN',pic:''},{av:'AV58TFBarFecCli',fld:'vTFBARFECCLI',pic:''},{av:'AV62TFBarFecFpr',fld:'vTFBARFECFPR',pic:''},{av:'AV66TFBarFasCod',fld:'vTFBARFASCOD',pic:''},{av:'AV67TFBarFasCod_Sel',fld:'vTFBARFASCOD_SEL',pic:''},{av:'AV83TFBarMaqCod',fld:'vTFBARMAQCOD',pic:''},{av:'AV84TFBarMaqCod_Sel',fld:'vTFBARMAQCOD_SEL',pic:''},{av:'AV85TFBarSit',fld:'vTFBARSIT',pic:'Z9'},{av:'AV86TFBarSit_To',fld:'vTFBARSIT_TO',pic:'Z9'},{av:'AV103TFBarAlbUltimo',fld:'vTFBARALBULTIMO',pic:'ZZZZZZZZZ9'},{av:'AV104TFBarAlbUltimo_To',fld:'vTFBARALBULTIMO_TO',pic:'ZZZZZZZZZ9'},{av:'AV105TFBarAlbMts',fld:'vTFBARALBMTS',pic:'ZZZZZ9.99'},{av:'AV106TFBarAlbMts_To',fld:'vTFBARALBMTS_TO',pic:'ZZZZZ9.99'},{av:'AV107TFBarAlbKgs',fld:'vTFBARALBKGS',pic:'ZZZZZ9.99'},{av:'AV108TFBarAlbKgs_To',fld:'vTFBARALBKGS_TO',pic:'ZZZZZ9.99'},{av:'AV109TFBarCuaderno',fld:'vTFBARCUADERNO',pic:''},{av:'AV110TFBarCuaderno_Sel',fld:'vTFBARCUADERNO_SEL',pic:''},{av:'AV111TFBarNormas',fld:'vTFBARNORMAS',pic:''},{av:'AV112TFBarNormas_Sel',fld:'vTFBARNORMAS_SEL',pic:''},{av:'AV113TFBarAlbFact',fld:'vTFBARALBFACT',pic:'ZZZZZZZ9'},{av:'AV114TFBarAlbFact_To',fld:'vTFBARALBFACT_TO',pic:'ZZZZZZZ9'},{av:'AV170Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV87TotBarKgm',fld:'vTOTBARKGM',pic:'ZZZZZ9.99',hsh:true},{av:'AV89TotBarMtr',fld:'vTOTBARMTR',pic:'ZZZZZ9.99',hsh:true},{av:'AV91TotBarPie',fld:'vTOTBARPIE',pic:'ZZZZZ9',hsh:true},{av:'AV99TotKilosPendientes',fld:'vTOTKILOSPENDIENTES',pic:'ZZZZZ9.99',hsh:true},{av:'AV101TotMetrosPendientes',fld:'vTOTMETROSPENDIENTES',pic:'ZZZZZ9.99',hsh:true},{av:'sPrefix'},{av:'Ddo_gridcolumnsselector_Columnsselectorvalues',ctrl:'DDO_GRIDCOLUMNSSELECTOR',prop:'ColumnsSelectorValues'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A159BarFecGen',fld:'BARFECGEN',pic:''},{av:'A155BarFecCli',fld:'BARFECCLI',pic:''},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A213BarSit',fld:'BARSIT',pic:'Z9'},{av:'A166BarKgm',fld:'BARKGM',pic:'ZZZZZ9.99'},{av:'A184BarMtr',fld:'BARMTR',pic:'ZZZZZ9.99'},{av:'A198BarPie',fld:'BARPIE',pic:'ZZZZZ9'},{av:'A13885KilosPendi',fld:'KILOSPENDI',pic:'ZZZZZ9.99'},{av:'A13886MetrosPend',fld:'METROSPEND',pic:'ZZZZZ9.99'}]");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED",",oparms:[{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'edtCliCod_Visible',ctrl:'CLICOD',prop:'Visible'},{av:'edtCliNom_Visible',ctrl:'CLINOM',prop:'Visible'},{av:'edtPedidoClie_Visible',ctrl:'PEDIDOCLIE',prop:'Visible'},{av:'edtBarNHdr_Visible',ctrl:'BARNHDR',prop:'Visible'},{av:'edtBarSer_Visible',ctrl:'BARSER',prop:'Visible'},{av:'edtBarSerDsc_Visible',ctrl:'BARSERDSC',prop:'Visible'},{av:'edtBarTipArt_Visible',ctrl:'BARTIPART',prop:'Visible'},{av:'edtBarTipArtD_Visible',ctrl:'BARTIPARTD',prop:'Visible'},{av:'edtBarColNom_Visible',ctrl:'BARCOLNOM',prop:'Visible'},{av:'edtBarColNum_Visible',ctrl:'BARCOLNUM',prop:'Visible'},{av:'edtBarNomCli_Visible',ctrl:'BARNOMCLI',prop:'Visible'},{av:'edtBarKgm_Visible',ctrl:'BARKGM',prop:'Visible'},{av:'edtBarMtr_Visible',ctrl:'BARMTR',prop:'Visible'},{av:'edtBarPie_Visible',ctrl:'BARPIE',prop:'Visible'},{av:'edtBarFecGen_Visible',ctrl:'BARFECGEN',prop:'Visible'},{av:'edtBarFecCli_Visible',ctrl:'BARFECCLI',prop:'Visible'},{av:'edtBarFecFpr_Visible',ctrl:'BARFECFPR',prop:'Visible'},{av:'edtBarFasCod_Visible',ctrl:'BARFASCOD',prop:'Visible'},{av:'edtBarMaqCod_Visible',ctrl:'BARMAQCOD',prop:'Visible'},{av:'edtBarSit_Visible',ctrl:'BARSIT',prop:'Visible'},{av:'edtBarAlbUlti_Visible',ctrl:'BARALBULTI',prop:'Visible'},{av:'edtBarAlbMts_Visible',ctrl:'BARALBMTS',prop:'Visible'},{av:'edtBarAlbKgs_Visible',ctrl:'BARALBKGS',prop:'Visible'},{av:'edtBarCuadern_Visible',ctrl:'BARCUADERN',prop:'Visible'},{av:'edtBarNormas_Visible',ctrl:'BARNORMAS',prop:'Visible'},{av:'edtBarAlbFact_Visible',ctrl:'BARALBFACT',prop:'Visible'},{av:'AV70GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV71GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV23ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV87TotBarKgm',fld:'vTOTBARKGM',pic:'ZZZZZ9.99',hsh:true},{av:'AV89TotBarMtr',fld:'vTOTBARMTR',pic:'ZZZZZ9.99',hsh:true},{av:'AV91TotBarPie',fld:'vTOTBARPIE',pic:'ZZZZZ9',hsh:true},{av:'AV99TotKilosPendientes',fld:'vTOTKILOSPENDIENTES',pic:'ZZZZZ9.99',hsh:true},{av:'AV101TotMetrosPendientes',fld:'vTOTMETROSPENDIENTES',pic:'ZZZZZ9.99',hsh:true},{av:'AV88TotValueBarKgm',fld:'vTOTVALUEBARKGM',pic:''},{av:'AV90TotValueBarMtr',fld:'vTOTVALUEBARMTR',pic:''},{av:'AV92TotValueBarPie',fld:'vTOTVALUEBARPIE',pic:''}]}");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED","{handler:'e111EF2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV72Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV73BarSit',fld:'vBARSIT',pic:'Z9'},{av:'AV74BarSit_to',fld:'vBARSIT_TO',pic:'Z9'},{av:'AV75BarFecGen',fld:'vBARFECGEN',pic:''},{av:'AV76BarFecGen_to',fld:'vBARFECGEN_TO',pic:''},{av:'AV77Clicod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV78Clicod_to',fld:'vCLICOD_TO',pic:'ZZZZZ9'},{av:'AV79BarFecCli',fld:'vBARFECCLI',pic:''},{av:'AV80BarFecCli_to',fld:'vBARFECCLI_TO',pic:''},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV26TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV27TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV28TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV29TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV93TFPedidoCliente',fld:'vTFPEDIDOCLIENTE',pic:''},{av:'AV94TFPedidoCliente_Sel',fld:'vTFPEDIDOCLIENTE_SEL',pic:''},{av:'AV81TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV82TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV30TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV31TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV32TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV33TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV34TFBarTipArt',fld:'vTFBARTIPART',pic:'ZZZ9'},{av:'AV35TFBarTipArt_To',fld:'vTFBARTIPART_TO',pic:'ZZZ9'},{av:'AV36TFBarTipArtDsc',fld:'vTFBARTIPARTDSC',pic:''},{av:'AV37TFBarTipArtDsc_Sel',fld:'vTFBARTIPARTDSC_SEL',pic:''},{av:'AV38TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV39TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV40TFBarColNum',fld:'vTFBARCOLNUM',pic:'ZZZZZ9'},{av:'AV41TFBarColNum_To',fld:'vTFBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV46TFBarNomCli',fld:'vTFBARNOMCLI',pic:''},{av:'AV47TFBarNomCli_Sel',fld:'vTFBARNOMCLI_SEL',pic:''},{av:'AV48TFBarKgm',fld:'vTFBARKGM',pic:'ZZZZZ9.99'},{av:'AV49TFBarKgm_To',fld:'vTFBARKGM_TO',pic:'ZZZZZ9.99'},{av:'AV50TFBarMtr',fld:'vTFBARMTR',pic:'ZZZZZ9.99'},{av:'AV51TFBarMtr_To',fld:'vTFBARMTR_TO',pic:'ZZZZZ9.99'},{av:'AV52TFBarPie',fld:'vTFBARPIE',pic:'ZZZZZ9'},{av:'AV53TFBarPie_To',fld:'vTFBARPIE_TO',pic:'ZZZZZ9'},{av:'AV54TFBarFecGen',fld:'vTFBARFECGEN',pic:''},{av:'AV58TFBarFecCli',fld:'vTFBARFECCLI',pic:''},{av:'AV62TFBarFecFpr',fld:'vTFBARFECFPR',pic:''},{av:'AV66TFBarFasCod',fld:'vTFBARFASCOD',pic:''},{av:'AV67TFBarFasCod_Sel',fld:'vTFBARFASCOD_SEL',pic:''},{av:'AV83TFBarMaqCod',fld:'vTFBARMAQCOD',pic:''},{av:'AV84TFBarMaqCod_Sel',fld:'vTFBARMAQCOD_SEL',pic:''},{av:'AV85TFBarSit',fld:'vTFBARSIT',pic:'Z9'},{av:'AV86TFBarSit_To',fld:'vTFBARSIT_TO',pic:'Z9'},{av:'AV103TFBarAlbUltimo',fld:'vTFBARALBULTIMO',pic:'ZZZZZZZZZ9'},{av:'AV104TFBarAlbUltimo_To',fld:'vTFBARALBULTIMO_TO',pic:'ZZZZZZZZZ9'},{av:'AV105TFBarAlbMts',fld:'vTFBARALBMTS',pic:'ZZZZZ9.99'},{av:'AV106TFBarAlbMts_To',fld:'vTFBARALBMTS_TO',pic:'ZZZZZ9.99'},{av:'AV107TFBarAlbKgs',fld:'vTFBARALBKGS',pic:'ZZZZZ9.99'},{av:'AV108TFBarAlbKgs_To',fld:'vTFBARALBKGS_TO',pic:'ZZZZZ9.99'},{av:'AV109TFBarCuaderno',fld:'vTFBARCUADERNO',pic:''},{av:'AV110TFBarCuaderno_Sel',fld:'vTFBARCUADERNO_SEL',pic:''},{av:'AV111TFBarNormas',fld:'vTFBARNORMAS',pic:''},{av:'AV112TFBarNormas_Sel',fld:'vTFBARNORMAS_SEL',pic:''},{av:'AV113TFBarAlbFact',fld:'vTFBARALBFACT',pic:'ZZZZZZZ9'},{av:'AV114TFBarAlbFact_To',fld:'vTFBARALBFACT_TO',pic:'ZZZZZZZ9'},{av:'AV170Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV87TotBarKgm',fld:'vTOTBARKGM',pic:'ZZZZZ9.99',hsh:true},{av:'AV89TotBarMtr',fld:'vTOTBARMTR',pic:'ZZZZZ9.99',hsh:true},{av:'AV91TotBarPie',fld:'vTOTBARPIE',pic:'ZZZZZ9',hsh:true},{av:'AV99TotKilosPendientes',fld:'vTOTKILOSPENDIENTES',pic:'ZZZZZ9.99',hsh:true},{av:'AV101TotMetrosPendientes',fld:'vTOTMETROSPENDIENTES',pic:'ZZZZZ9.99',hsh:true},{av:'sPrefix'},{av:'Ddo_managefilters_Activeeventkey',ctrl:'DDO_MANAGEFILTERS',prop:'ActiveEventKey'},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A159BarFecGen',fld:'BARFECGEN',pic:''},{av:'A155BarFecCli',fld:'BARFECCLI',pic:''},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A213BarSit',fld:'BARSIT',pic:'Z9'},{av:'A166BarKgm',fld:'BARKGM',pic:'ZZZZZ9.99'},{av:'A184BarMtr',fld:'BARMTR',pic:'ZZZZZ9.99'},{av:'A198BarPie',fld:'BARPIE',pic:'ZZZZZ9'},{av:'A13885KilosPendi',fld:'KILOSPENDI',pic:'ZZZZZ9.99'},{av:'A13886MetrosPend',fld:'METROSPEND',pic:'ZZZZZ9.99'}]");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED",",oparms:[{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV26TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV27TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV28TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV29TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV93TFPedidoCliente',fld:'vTFPEDIDOCLIENTE',pic:''},{av:'AV94TFPedidoCliente_Sel',fld:'vTFPEDIDOCLIENTE_SEL',pic:''},{av:'AV81TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV82TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV30TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV31TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV32TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV33TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV34TFBarTipArt',fld:'vTFBARTIPART',pic:'ZZZ9'},{av:'AV35TFBarTipArt_To',fld:'vTFBARTIPART_TO',pic:'ZZZ9'},{av:'AV36TFBarTipArtDsc',fld:'vTFBARTIPARTDSC',pic:''},{av:'AV37TFBarTipArtDsc_Sel',fld:'vTFBARTIPARTDSC_SEL',pic:''},{av:'AV38TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV39TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV40TFBarColNum',fld:'vTFBARCOLNUM',pic:'ZZZZZ9'},{av:'AV41TFBarColNum_To',fld:'vTFBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV46TFBarNomCli',fld:'vTFBARNOMCLI',pic:''},{av:'AV47TFBarNomCli_Sel',fld:'vTFBARNOMCLI_SEL',pic:''},{av:'AV48TFBarKgm',fld:'vTFBARKGM',pic:'ZZZZZ9.99'},{av:'AV49TFBarKgm_To',fld:'vTFBARKGM_TO',pic:'ZZZZZ9.99'},{av:'AV50TFBarMtr',fld:'vTFBARMTR',pic:'ZZZZZ9.99'},{av:'AV51TFBarMtr_To',fld:'vTFBARMTR_TO',pic:'ZZZZZ9.99'},{av:'AV52TFBarPie',fld:'vTFBARPIE',pic:'ZZZZZ9'},{av:'AV53TFBarPie_To',fld:'vTFBARPIE_TO',pic:'ZZZZZ9'},{av:'AV54TFBarFecGen',fld:'vTFBARFECGEN',pic:''},{av:'AV58TFBarFecCli',fld:'vTFBARFECCLI',pic:''},{av:'AV62TFBarFecFpr',fld:'vTFBARFECFPR',pic:''},{av:'AV66TFBarFasCod',fld:'vTFBARFASCOD',pic:''},{av:'AV67TFBarFasCod_Sel',fld:'vTFBARFASCOD_SEL',pic:''},{av:'AV83TFBarMaqCod',fld:'vTFBARMAQCOD',pic:''},{av:'AV84TFBarMaqCod_Sel',fld:'vTFBARMAQCOD_SEL',pic:''},{av:'AV85TFBarSit',fld:'vTFBARSIT',pic:'Z9'},{av:'AV86TFBarSit_To',fld:'vTFBARSIT_TO',pic:'Z9'},{av:'AV103TFBarAlbUltimo',fld:'vTFBARALBULTIMO',pic:'ZZZZZZZZZ9'},{av:'AV104TFBarAlbUltimo_To',fld:'vTFBARALBULTIMO_TO',pic:'ZZZZZZZZZ9'},{av:'AV105TFBarAlbMts',fld:'vTFBARALBMTS',pic:'ZZZZZ9.99'},{av:'AV106TFBarAlbMts_To',fld:'vTFBARALBMTS_TO',pic:'ZZZZZ9.99'},{av:'AV107TFBarAlbKgs',fld:'vTFBARALBKGS',pic:'ZZZZZ9.99'},{av:'AV108TFBarAlbKgs_To',fld:'vTFBARALBKGS_TO',pic:'ZZZZZ9.99'},{av:'AV109TFBarCuaderno',fld:'vTFBARCUADERNO',pic:''},{av:'AV110TFBarCuaderno_Sel',fld:'vTFBARCUADERNO_SEL',pic:''},{av:'AV111TFBarNormas',fld:'vTFBARNORMAS',pic:''},{av:'AV112TFBarNormas_Sel',fld:'vTFBARNORMAS_SEL',pic:''},{av:'AV113TFBarAlbFact',fld:'vTFBARALBFACT',pic:'ZZZZZZZ9'},{av:'AV114TFBarAlbFact_To',fld:'vTFBARALBFACT_TO',pic:'ZZZZZZZ9'},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtCliCod_Visible',ctrl:'CLICOD',prop:'Visible'},{av:'edtCliNom_Visible',ctrl:'CLINOM',prop:'Visible'},{av:'edtPedidoClie_Visible',ctrl:'PEDIDOCLIE',prop:'Visible'},{av:'edtBarNHdr_Visible',ctrl:'BARNHDR',prop:'Visible'},{av:'edtBarSer_Visible',ctrl:'BARSER',prop:'Visible'},{av:'edtBarSerDsc_Visible',ctrl:'BARSERDSC',prop:'Visible'},{av:'edtBarTipArt_Visible',ctrl:'BARTIPART',prop:'Visible'},{av:'edtBarTipArtD_Visible',ctrl:'BARTIPARTD',prop:'Visible'},{av:'edtBarColNom_Visible',ctrl:'BARCOLNOM',prop:'Visible'},{av:'edtBarColNum_Visible',ctrl:'BARCOLNUM',prop:'Visible'},{av:'edtBarNomCli_Visible',ctrl:'BARNOMCLI',prop:'Visible'},{av:'edtBarKgm_Visible',ctrl:'BARKGM',prop:'Visible'},{av:'edtBarMtr_Visible',ctrl:'BARMTR',prop:'Visible'},{av:'edtBarPie_Visible',ctrl:'BARPIE',prop:'Visible'},{av:'edtBarFecGen_Visible',ctrl:'BARFECGEN',prop:'Visible'},{av:'edtBarFecCli_Visible',ctrl:'BARFECCLI',prop:'Visible'},{av:'edtBarFecFpr_Visible',ctrl:'BARFECFPR',prop:'Visible'},{av:'edtBarFasCod_Visible',ctrl:'BARFASCOD',prop:'Visible'},{av:'edtBarMaqCod_Visible',ctrl:'BARMAQCOD',prop:'Visible'},{av:'edtBarSit_Visible',ctrl:'BARSIT',prop:'Visible'},{av:'edtBarAlbUlti_Visible',ctrl:'BARALBULTI',prop:'Visible'},{av:'edtBarAlbMts_Visible',ctrl:'BARALBMTS',prop:'Visible'},{av:'edtBarAlbKgs_Visible',ctrl:'BARALBKGS',prop:'Visible'},{av:'edtBarCuadern_Visible',ctrl:'BARCUADERN',prop:'Visible'},{av:'edtBarNormas_Visible',ctrl:'BARNORMAS',prop:'Visible'},{av:'edtBarAlbFact_Visible',ctrl:'BARALBFACT',prop:'Visible'},{av:'AV70GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV71GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV23ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV87TotBarKgm',fld:'vTOTBARKGM',pic:'ZZZZZ9.99',hsh:true},{av:'AV89TotBarMtr',fld:'vTOTBARMTR',pic:'ZZZZZ9.99',hsh:true},{av:'AV91TotBarPie',fld:'vTOTBARPIE',pic:'ZZZZZ9',hsh:true},{av:'AV99TotKilosPendientes',fld:'vTOTKILOSPENDIENTES',pic:'ZZZZZ9.99',hsh:true},{av:'AV101TotMetrosPendientes',fld:'vTOTMETROSPENDIENTES',pic:'ZZZZZ9.99',hsh:true},{av:'AV88TotValueBarKgm',fld:'vTOTVALUEBARKGM',pic:''},{av:'AV90TotValueBarMtr',fld:'vTOTVALUEBARMTR',pic:''},{av:'AV92TotValueBarPie',fld:'vTOTVALUEBARPIE',pic:''}]}");
      setEventMetadata("'DOEXPORT'","{handler:'e161EF2',iparms:[]");
      setEventMetadata("'DOEXPORT'",",oparms:[]}");
      setEventMetadata("'DOEXPORTCSV'","{handler:'e171EF2',iparms:[]");
      setEventMetadata("'DOEXPORTCSV'",",oparms:[]}");
      setEventMetadata("VALID_CLICOD","{handler:'valid_Clicod',iparms:[]");
      setEventMetadata("VALID_CLICOD",",oparms:[]}");
      setEventMetadata("VALID_CLINOM","{handler:'valid_Clinom',iparms:[]");
      setEventMetadata("VALID_CLINOM",",oparms:[]}");
      setEventMetadata("VALID_PEDIDOCLIE","{handler:'valid_Pedidoclie',iparms:[]");
      setEventMetadata("VALID_PEDIDOCLIE",",oparms:[]}");
      setEventMetadata("VALID_BARNHDR","{handler:'valid_Barnhdr',iparms:[]");
      setEventMetadata("VALID_BARNHDR",",oparms:[]}");
      setEventMetadata("VALID_BARSER","{handler:'valid_Barser',iparms:[]");
      setEventMetadata("VALID_BARSER",",oparms:[]}");
      setEventMetadata("VALID_BARSERDSC","{handler:'valid_Barserdsc',iparms:[]");
      setEventMetadata("VALID_BARSERDSC",",oparms:[]}");
      setEventMetadata("VALID_BARTIPART","{handler:'valid_Bartipart',iparms:[]");
      setEventMetadata("VALID_BARTIPART",",oparms:[]}");
      setEventMetadata("VALID_BARTIPARTD","{handler:'valid_Bartipartd',iparms:[]");
      setEventMetadata("VALID_BARTIPARTD",",oparms:[]}");
      setEventMetadata("VALID_BARCOLNOM","{handler:'valid_Barcolnom',iparms:[]");
      setEventMetadata("VALID_BARCOLNOM",",oparms:[]}");
      setEventMetadata("VALID_BARCOLNUM","{handler:'valid_Barcolnum',iparms:[]");
      setEventMetadata("VALID_BARCOLNUM",",oparms:[]}");
      setEventMetadata("VALID_BARTIPCOL","{handler:'valid_Bartipcol',iparms:[]");
      setEventMetadata("VALID_BARTIPCOL",",oparms:[]}");
      setEventMetadata("VALID_BARNOMCLI","{handler:'valid_Barnomcli',iparms:[]");
      setEventMetadata("VALID_BARNOMCLI",",oparms:[]}");
      setEventMetadata("VALID_BARKGM","{handler:'valid_Barkgm',iparms:[]");
      setEventMetadata("VALID_BARKGM",",oparms:[]}");
      setEventMetadata("VALID_BARMTR","{handler:'valid_Barmtr',iparms:[]");
      setEventMetadata("VALID_BARMTR",",oparms:[]}");
      setEventMetadata("VALID_BARPIE","{handler:'valid_Barpie',iparms:[]");
      setEventMetadata("VALID_BARPIE",",oparms:[]}");
      setEventMetadata("VALID_BARFASCOD","{handler:'valid_Barfascod',iparms:[]");
      setEventMetadata("VALID_BARFASCOD",",oparms:[]}");
      setEventMetadata("VALID_BARMAQCOD","{handler:'valid_Barmaqcod',iparms:[]");
      setEventMetadata("VALID_BARMAQCOD",",oparms:[]}");
      setEventMetadata("VALID_BARSIT","{handler:'valid_Barsit',iparms:[]");
      setEventMetadata("VALID_BARSIT",",oparms:[]}");
      setEventMetadata("VALID_BARALBULTI","{handler:'valid_Baralbulti',iparms:[]");
      setEventMetadata("VALID_BARALBULTI",",oparms:[]}");
      setEventMetadata("VALID_BARALBMTS","{handler:'valid_Baralbmts',iparms:[]");
      setEventMetadata("VALID_BARALBMTS",",oparms:[]}");
      setEventMetadata("VALID_BARALBKGS","{handler:'valid_Baralbkgs',iparms:[]");
      setEventMetadata("VALID_BARALBKGS",",oparms:[]}");
      setEventMetadata("VALID_BARCUADERN","{handler:'valid_Barcuadern',iparms:[]");
      setEventMetadata("VALID_BARCUADERN",",oparms:[]}");
      setEventMetadata("VALID_BARNORMAS","{handler:'valid_Barnormas',iparms:[]");
      setEventMetadata("VALID_BARNORMAS",",oparms:[]}");
      setEventMetadata("VALID_BARALBFACT","{handler:'valid_Baralbfact',iparms:[]");
      setEventMetadata("VALID_BARALBFACT",",oparms:[]}");
      setEventMetadata("VALID_BARIDTX2","{handler:'valid_Baridtx2',iparms:[]");
      setEventMetadata("VALID_BARIDTX2",",oparms:[]}");
      setEventMetadata("VALID_KILOSENTRE","{handler:'valid_Kilosentre',iparms:[]");
      setEventMetadata("VALID_KILOSENTRE",",oparms:[]}");
      setEventMetadata("VALID_METROSENTR","{handler:'valid_Metrosentr',iparms:[]");
      setEventMetadata("VALID_METROSENTR",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Metrospend',iparms:[]");
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
      wcpOAV72Emprcod = "" ;
      wcpOAV75BarFecGen = GXutil.nullDate() ;
      wcpOAV76BarFecGen_to = GXutil.nullDate() ;
      wcpOAV79BarFecCli = GXutil.nullDate() ;
      wcpOAV80BarFecCli_to = GXutil.nullDate() ;
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
      AV72Emprcod = "" ;
      AV75BarFecGen = GXutil.nullDate() ;
      AV76BarFecGen_to = GXutil.nullDate() ;
      AV79BarFecCli = GXutil.nullDate() ;
      AV80BarFecCli_to = GXutil.nullDate() ;
      AV20ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV15FilterFullText = "" ;
      AV28TFCliNom = "" ;
      AV29TFCliNom_Sel = "" ;
      AV93TFPedidoCliente = "" ;
      AV94TFPedidoCliente_Sel = "" ;
      AV81TFBarNHdr = "" ;
      AV82TFBarNHdr_Sel = "" ;
      AV30TFBarSer = "" ;
      AV31TFBarSer_Sel = "" ;
      AV32TFBarSerDsc = "" ;
      AV33TFBarSerDsc_Sel = "" ;
      AV36TFBarTipArtDsc = "" ;
      AV37TFBarTipArtDsc_Sel = "" ;
      AV38TFBarColNom = "" ;
      AV39TFBarColNom_Sel = "" ;
      AV46TFBarNomCli = "" ;
      AV47TFBarNomCli_Sel = "" ;
      AV48TFBarKgm = DecimalUtil.ZERO ;
      AV49TFBarKgm_To = DecimalUtil.ZERO ;
      AV50TFBarMtr = DecimalUtil.ZERO ;
      AV51TFBarMtr_To = DecimalUtil.ZERO ;
      AV54TFBarFecGen = GXutil.nullDate() ;
      AV58TFBarFecCli = GXutil.nullDate() ;
      AV62TFBarFecFpr = GXutil.nullDate() ;
      AV66TFBarFasCod = "" ;
      AV67TFBarFasCod_Sel = "" ;
      AV83TFBarMaqCod = "" ;
      AV84TFBarMaqCod_Sel = "" ;
      AV105TFBarAlbMts = DecimalUtil.ZERO ;
      AV106TFBarAlbMts_To = DecimalUtil.ZERO ;
      AV107TFBarAlbKgs = DecimalUtil.ZERO ;
      AV108TFBarAlbKgs_To = DecimalUtil.ZERO ;
      AV109TFBarCuaderno = "" ;
      AV110TFBarCuaderno_Sel = "" ;
      AV111TFBarNormas = "" ;
      AV112TFBarNormas_Sel = "" ;
      AV170Pgmname = "" ;
      AV87TotBarKgm = DecimalUtil.ZERO ;
      AV89TotBarMtr = DecimalUtil.ZERO ;
      AV99TotKilosPendientes = DecimalUtil.ZERO ;
      AV101TotMetrosPendientes = DecimalUtil.ZERO ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      AV23ManageFiltersData = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      AV68DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      AV10GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      A396EmprCod = "" ;
      A4812BarEncCli = "" ;
      A143BarDisNum = "" ;
      A365DisDes = "" ;
      A130BarCodPar = "" ;
      Ddo_grid_Caption = "" ;
      Ddo_grid_Filteredtext_set = "" ;
      Ddo_grid_Filteredtextto_set = "" ;
      Ddo_grid_Selectedvalue_set = "" ;
      Ddo_grid_Sortedstatus = "" ;
      Ddo_gridcolumnsselector_Gridinternalname = "" ;
      Grid_titlescategories_Gridinternalname = "" ;
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
      ucGrid_titlescategories = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      AV56DDO_BarFecGenAuxDate = GXutil.nullDate() ;
      AV60DDO_BarFecCliAuxDate = GXutil.nullDate() ;
      AV64DDO_BarFecFprAuxDate = GXutil.nullDate() ;
      sXEvt = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      A279CliNom = "" ;
      A13878PedidoClie = "" ;
      A13696BarNHdr = "" ;
      A212BarSer = "" ;
      A1652BarSerDsc = "" ;
      A13711BarTipArtD = "" ;
      A135BarColNom = "" ;
      A13868BarTipColD = "" ;
      A1234BarNomCli = "" ;
      A166BarKgm = DecimalUtil.ZERO ;
      A184BarMtr = DecimalUtil.ZERO ;
      A159BarFecGen = GXutil.nullDate() ;
      A155BarFecCli = GXutil.nullDate() ;
      A158BarFecFpr = GXutil.nullDate() ;
      A151BarFasCod = "" ;
      A180BarMaqCod = "" ;
      A13931BarAlbMts = DecimalUtil.ZERO ;
      A13932BarAlbKgs = DecimalUtil.ZERO ;
      A13933BarCuadern = "" ;
      A13934BarNormas = "" ;
      A13902BarNorma = "" ;
      A12881BarOEKOTEX = "" ;
      A2447BarFecEnE = GXutil.nullDate() ;
      A12809BarLocTel = "" ;
      A13907BarSerDsc2 = "" ;
      A13908BarIdtx2 = "" ;
      A13909BarIdtxDc = "" ;
      A13910BarColCv = "" ;
      A13887KilosEntre = DecimalUtil.ZERO ;
      A13885KilosPendi = DecimalUtil.ZERO ;
      A13886MetrosPend = DecimalUtil.ZERO ;
      AV120Listadodehdrs_wcds_1_filterfulltext = "" ;
      AV123Listadodehdrs_wcds_4_tfclinom = "" ;
      AV124Listadodehdrs_wcds_5_tfclinom_sel = "" ;
      AV125Listadodehdrs_wcds_6_tfpedidocliente = "" ;
      AV126Listadodehdrs_wcds_7_tfpedidocliente_sel = "" ;
      AV127Listadodehdrs_wcds_8_tfbarnhdr = "" ;
      AV128Listadodehdrs_wcds_9_tfbarnhdr_sel = "" ;
      AV129Listadodehdrs_wcds_10_tfbarser = "" ;
      AV130Listadodehdrs_wcds_11_tfbarser_sel = "" ;
      AV131Listadodehdrs_wcds_12_tfbarserdsc = "" ;
      AV132Listadodehdrs_wcds_13_tfbarserdsc_sel = "" ;
      AV135Listadodehdrs_wcds_16_tfbartipartdsc = "" ;
      AV136Listadodehdrs_wcds_17_tfbartipartdsc_sel = "" ;
      AV137Listadodehdrs_wcds_18_tfbarcolnom = "" ;
      AV138Listadodehdrs_wcds_19_tfbarcolnom_sel = "" ;
      AV141Listadodehdrs_wcds_22_tfbarnomcli = "" ;
      AV142Listadodehdrs_wcds_23_tfbarnomcli_sel = "" ;
      AV143Listadodehdrs_wcds_24_tfbarkgm = DecimalUtil.ZERO ;
      AV144Listadodehdrs_wcds_25_tfbarkgm_to = DecimalUtil.ZERO ;
      AV145Listadodehdrs_wcds_26_tfbarmtr = DecimalUtil.ZERO ;
      AV146Listadodehdrs_wcds_27_tfbarmtr_to = DecimalUtil.ZERO ;
      AV149Listadodehdrs_wcds_30_tfbarfecgen = GXutil.nullDate() ;
      AV150Listadodehdrs_wcds_31_tfbarfeccli = GXutil.nullDate() ;
      AV151Listadodehdrs_wcds_32_tfbarfecfpr = GXutil.nullDate() ;
      AV152Listadodehdrs_wcds_33_tfbarfascod = "" ;
      AV153Listadodehdrs_wcds_34_tfbarfascod_sel = "" ;
      AV154Listadodehdrs_wcds_35_tfbarmaqcod = "" ;
      AV155Listadodehdrs_wcds_36_tfbarmaqcod_sel = "" ;
      AV160Listadodehdrs_wcds_41_tfbaralbmts = DecimalUtil.ZERO ;
      AV161Listadodehdrs_wcds_42_tfbaralbmts_to = DecimalUtil.ZERO ;
      AV162Listadodehdrs_wcds_43_tfbaralbkgs = DecimalUtil.ZERO ;
      AV163Listadodehdrs_wcds_44_tfbaralbkgs_to = DecimalUtil.ZERO ;
      AV164Listadodehdrs_wcds_45_tfbarcuaderno = "" ;
      AV165Listadodehdrs_wcds_46_tfbarcuaderno_sel = "" ;
      AV166Listadodehdrs_wcds_47_tfbarnormas = "" ;
      AV167Listadodehdrs_wcds_48_tfbarnormas_sel = "" ;
      scmdbuf = "" ;
      lV152Listadodehdrs_wcds_33_tfbarfascod = "" ;
      lV164Listadodehdrs_wcds_45_tfbarcuaderno = "" ;
      lV123Listadodehdrs_wcds_4_tfclinom = "" ;
      lV127Listadodehdrs_wcds_8_tfbarnhdr = "" ;
      lV129Listadodehdrs_wcds_10_tfbarser = "" ;
      lV131Listadodehdrs_wcds_12_tfbarserdsc = "" ;
      lV135Listadodehdrs_wcds_16_tfbartipartdsc = "" ;
      lV137Listadodehdrs_wcds_18_tfbarcolnom = "" ;
      lV141Listadodehdrs_wcds_22_tfbarnomcli = "" ;
      lV154Listadodehdrs_wcds_35_tfbarmaqcod = "" ;
      H01EF9_A9713Tb1_Cod = new short[1] ;
      H01EF9_A494ForSer = new String[] {""} ;
      H01EF9_A482ForColNom = new String[] {""} ;
      H01EF9_A483ForColNum = new int[1] ;
      H01EF9_A831TipColCod = new byte[1] ;
      H01EF9_A4466BarAcaAnh = new short[1] ;
      H01EF9_A13909BarIdtxDc = new String[] {""} ;
      H01EF9_n13909BarIdtxDc = new boolean[] {false} ;
      H01EF9_A13908BarIdtx2 = new String[] {""} ;
      H01EF9_n13908BarIdtx2 = new boolean[] {false} ;
      H01EF9_A13907BarSerDsc2 = new String[] {""} ;
      H01EF9_n13907BarSerDsc2 = new boolean[] {false} ;
      H01EF9_A12809BarLocTel = new String[] {""} ;
      H01EF9_A2447BarFecEnE = new java.util.Date[] {GXutil.nullDate()} ;
      H01EF9_A12881BarOEKOTEX = new String[] {""} ;
      H01EF9_n12881BarOEKOTEX = new boolean[] {false} ;
      H01EF9_A213BarSit = new byte[1] ;
      H01EF9_A180BarMaqCod = new String[] {""} ;
      H01EF9_A158BarFecFpr = new java.util.Date[] {GXutil.nullDate()} ;
      H01EF9_A155BarFecCli = new java.util.Date[] {GXutil.nullDate()} ;
      H01EF9_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      H01EF9_A1234BarNomCli = new String[] {""} ;
      H01EF9_A136BarColNum = new int[1] ;
      H01EF9_A135BarColNom = new String[] {""} ;
      H01EF9_A13711BarTipArtD = new String[] {""} ;
      H01EF9_n13711BarTipArtD = new boolean[] {false} ;
      H01EF9_A217BarTipArt = new short[1] ;
      H01EF9_n217BarTipArt = new boolean[] {false} ;
      H01EF9_A1652BarSerDsc = new String[] {""} ;
      H01EF9_A212BarSer = new String[] {""} ;
      H01EF9_A13696BarNHdr = new String[] {""} ;
      H01EF9_A279CliNom = new String[] {""} ;
      H01EF9_A252CliCod = new int[1] ;
      H01EF9_n252CliCod = new boolean[] {false} ;
      H01EF9_A13904BarIntColo = new byte[1] ;
      H01EF9_n13904BarIntColo = new boolean[] {false} ;
      H01EF9_A13903BarMatColo = new short[1] ;
      H01EF9_n13903BarMatColo = new boolean[] {false} ;
      H01EF9_A13902BarNorma = new String[] {""} ;
      H01EF9_n13902BarNorma = new boolean[] {false} ;
      H01EF9_A13890BarHDSusp = new byte[1] ;
      H01EF9_n13890BarHDSusp = new boolean[] {false} ;
      H01EF9_A13933BarCuadern = new String[] {""} ;
      H01EF9_n13933BarCuadern = new boolean[] {false} ;
      H01EF9_A13932BarAlbKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01EF9_A13931BarAlbMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01EF9_A151BarFasCod = new String[] {""} ;
      H01EF9_n151BarFasCod = new boolean[] {false} ;
      H01EF9_A143BarDisNum = new String[] {""} ;
      H01EF9_A4812BarEncCli = new String[] {""} ;
      H01EF9_A218BarTipCol = new byte[1] ;
      H01EF9_A199BarPie1 = new short[1] ;
      H01EF9_A365DisDes = new String[] {""} ;
      H01EF9_A898BarPieNDes = new int[1] ;
      H01EF9_A361DisCod = new int[1] ;
      H01EF9_A130BarCodPar = new String[] {""} ;
      H01EF9_A132BarCodReo = new byte[1] ;
      H01EF9_A129BarCod = new int[1] ;
      H01EF9_A396EmprCod = new String[] {""} ;
      H01EF9_A13887KilosEntre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01EF9_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01EF9_A13888MetrosEntr = new short[1] ;
      H01EF9_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01EF17_A9713Tb1_Cod = new short[1] ;
      H01EF17_A494ForSer = new String[] {""} ;
      H01EF17_A482ForColNom = new String[] {""} ;
      H01EF17_A483ForColNum = new int[1] ;
      H01EF17_A831TipColCod = new byte[1] ;
      H01EF17_A4466BarAcaAnh = new short[1] ;
      H01EF17_A13909BarIdtxDc = new String[] {""} ;
      H01EF17_n13909BarIdtxDc = new boolean[] {false} ;
      H01EF17_A13908BarIdtx2 = new String[] {""} ;
      H01EF17_n13908BarIdtx2 = new boolean[] {false} ;
      H01EF17_A13907BarSerDsc2 = new String[] {""} ;
      H01EF17_n13907BarSerDsc2 = new boolean[] {false} ;
      H01EF17_A12809BarLocTel = new String[] {""} ;
      H01EF17_A2447BarFecEnE = new java.util.Date[] {GXutil.nullDate()} ;
      H01EF17_A12881BarOEKOTEX = new String[] {""} ;
      H01EF17_n12881BarOEKOTEX = new boolean[] {false} ;
      H01EF17_A213BarSit = new byte[1] ;
      H01EF17_A180BarMaqCod = new String[] {""} ;
      H01EF17_A158BarFecFpr = new java.util.Date[] {GXutil.nullDate()} ;
      H01EF17_A155BarFecCli = new java.util.Date[] {GXutil.nullDate()} ;
      H01EF17_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      H01EF17_A1234BarNomCli = new String[] {""} ;
      H01EF17_A136BarColNum = new int[1] ;
      H01EF17_A135BarColNom = new String[] {""} ;
      H01EF17_A13711BarTipArtD = new String[] {""} ;
      H01EF17_n13711BarTipArtD = new boolean[] {false} ;
      H01EF17_A217BarTipArt = new short[1] ;
      H01EF17_n217BarTipArt = new boolean[] {false} ;
      H01EF17_A1652BarSerDsc = new String[] {""} ;
      H01EF17_A212BarSer = new String[] {""} ;
      H01EF17_A13696BarNHdr = new String[] {""} ;
      H01EF17_A279CliNom = new String[] {""} ;
      H01EF17_A252CliCod = new int[1] ;
      H01EF17_n252CliCod = new boolean[] {false} ;
      H01EF17_A13904BarIntColo = new byte[1] ;
      H01EF17_n13904BarIntColo = new boolean[] {false} ;
      H01EF17_A13903BarMatColo = new short[1] ;
      H01EF17_n13903BarMatColo = new boolean[] {false} ;
      H01EF17_A13902BarNorma = new String[] {""} ;
      H01EF17_n13902BarNorma = new boolean[] {false} ;
      H01EF17_A13890BarHDSusp = new byte[1] ;
      H01EF17_n13890BarHDSusp = new boolean[] {false} ;
      H01EF17_A13933BarCuadern = new String[] {""} ;
      H01EF17_n13933BarCuadern = new boolean[] {false} ;
      H01EF17_A13932BarAlbKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01EF17_A13931BarAlbMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01EF17_A151BarFasCod = new String[] {""} ;
      H01EF17_n151BarFasCod = new boolean[] {false} ;
      H01EF17_A143BarDisNum = new String[] {""} ;
      H01EF17_A4812BarEncCli = new String[] {""} ;
      H01EF17_A218BarTipCol = new byte[1] ;
      H01EF17_A199BarPie1 = new short[1] ;
      H01EF17_A365DisDes = new String[] {""} ;
      H01EF17_A898BarPieNDes = new int[1] ;
      H01EF17_A361DisCod = new int[1] ;
      H01EF17_A130BarCodPar = new String[] {""} ;
      H01EF17_A132BarCodReo = new byte[1] ;
      H01EF17_A129BarCod = new int[1] ;
      H01EF17_A396EmprCod = new String[] {""} ;
      H01EF17_A13887KilosEntre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01EF17_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01EF17_A13888MetrosEntr = new short[1] ;
      H01EF17_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      GXv_int6 = new byte[1] ;
      H01EF19_A13902BarNorma = new String[] {""} ;
      H01EF19_n13902BarNorma = new boolean[] {false} ;
      AV88TotValueBarKgm = "" ;
      AV90TotValueBarMtr = "" ;
      AV92TotValueBarPie = "" ;
      AV117Station = "" ;
      AV118Emprnom = "" ;
      AV119Usurcod = "" ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons11 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons12 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV6WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext13 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV22Session = httpContext.getWebSession();
      AV18ColumnsSelectorXML = "" ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV24ManageFiltersXml = "" ;
      AV16ExcelFilename = "" ;
      AV17ErrorMessage = "" ;
      AV19UserCustomValue = "" ;
      AV21ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector14 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector15 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item16 = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item17 = new GXBaseCollection[1] ;
      AV11GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      GXt_char33 = "" ;
      GXt_char31 = "" ;
      GXt_char29 = "" ;
      GXt_char27 = "" ;
      GXv_char28 = new String[1] ;
      GXt_char25 = "" ;
      GXv_char26 = new String[1] ;
      GXt_char23 = "" ;
      GXv_char24 = new String[1] ;
      GXt_char21 = "" ;
      GXv_char22 = new String[1] ;
      GXt_char20 = "" ;
      GXv_char5 = new String[1] ;
      GXt_char19 = "" ;
      GXv_char4 = new String[1] ;
      GXt_char18 = "" ;
      GXv_char3 = new String[1] ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      GXv_SdtWWPGridState37 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      AV8TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV7HTTPRequest = httpContext.getHttpRequest();
      H01EF25_A9713Tb1_Cod = new short[1] ;
      H01EF25_A4466BarAcaAnh = new short[1] ;
      H01EF25_A213BarSit = new byte[1] ;
      H01EF25_A180BarMaqCod = new String[] {""} ;
      H01EF25_A158BarFecFpr = new java.util.Date[] {GXutil.nullDate()} ;
      H01EF25_A155BarFecCli = new java.util.Date[] {GXutil.nullDate()} ;
      H01EF25_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      H01EF25_A1234BarNomCli = new String[] {""} ;
      H01EF25_A136BarColNum = new int[1] ;
      H01EF25_A135BarColNom = new String[] {""} ;
      H01EF25_A13711BarTipArtD = new String[] {""} ;
      H01EF25_n13711BarTipArtD = new boolean[] {false} ;
      H01EF25_A217BarTipArt = new short[1] ;
      H01EF25_n217BarTipArt = new boolean[] {false} ;
      H01EF25_A1652BarSerDsc = new String[] {""} ;
      H01EF25_A212BarSer = new String[] {""} ;
      H01EF25_A13696BarNHdr = new String[] {""} ;
      H01EF25_A279CliNom = new String[] {""} ;
      H01EF25_A252CliCod = new int[1] ;
      H01EF25_n252CliCod = new boolean[] {false} ;
      H01EF25_A13933BarCuadern = new String[] {""} ;
      H01EF25_n13933BarCuadern = new boolean[] {false} ;
      H01EF25_A13932BarAlbKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01EF25_A13931BarAlbMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01EF25_A151BarFasCod = new String[] {""} ;
      H01EF25_n151BarFasCod = new boolean[] {false} ;
      H01EF25_A13888MetrosEntr = new short[1] ;
      H01EF25_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01EF25_A13887KilosEntre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01EF25_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01EF25_A143BarDisNum = new String[] {""} ;
      H01EF25_A4812BarEncCli = new String[] {""} ;
      H01EF25_A199BarPie1 = new short[1] ;
      H01EF25_A365DisDes = new String[] {""} ;
      H01EF25_A898BarPieNDes = new int[1] ;
      H01EF25_A361DisCod = new int[1] ;
      H01EF25_A130BarCodPar = new String[] {""} ;
      H01EF25_A132BarCodReo = new byte[1] ;
      H01EF25_A129BarCod = new int[1] ;
      H01EF25_A396EmprCod = new String[] {""} ;
      GXv_char34 = new String[1] ;
      GXv_char32 = new String[1] ;
      GXv_char30 = new String[1] ;
      GXv_int8 = new long[1] ;
      GXt_char35 = "" ;
      GXv_char36 = new String[1] ;
      GXv_int10 = new int[1] ;
      AV100TotValueKilosPendientes = "" ;
      AV102TotValueMetrosPendientes = "" ;
      ucDdo_managefilters = new com.genexus.webpanels.GXUserControl();
      Ddo_managefilters_Caption = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlAV72Emprcod = "" ;
      sCtrlAV73BarSit = "" ;
      sCtrlAV74BarSit_to = "" ;
      sCtrlAV75BarFecGen = "" ;
      sCtrlAV76BarFecGen_to = "" ;
      sCtrlAV77Clicod = "" ;
      sCtrlAV78Clicod_to = "" ;
      sCtrlAV79BarFecCli = "" ;
      sCtrlAV80BarFecCli_to = "" ;
      subGrid_Linesclass = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.listadodehdrs_wc__default(),
         new Object[] {
             new Object[] {
            H01EF9_A9713Tb1_Cod, H01EF9_A494ForSer, H01EF9_A482ForColNom, H01EF9_A483ForColNum, H01EF9_A831TipColCod, H01EF9_A4466BarAcaAnh, H01EF9_A13909BarIdtxDc, H01EF9_n13909BarIdtxDc, H01EF9_A13908BarIdtx2, H01EF9_n13908BarIdtx2,
            H01EF9_A13907BarSerDsc2, H01EF9_n13907BarSerDsc2, H01EF9_A12809BarLocTel, H01EF9_A2447BarFecEnE, H01EF9_A12881BarOEKOTEX, H01EF9_n12881BarOEKOTEX, H01EF9_A213BarSit, H01EF9_A180BarMaqCod, H01EF9_A158BarFecFpr, H01EF9_A155BarFecCli,
            H01EF9_A159BarFecGen, H01EF9_A1234BarNomCli, H01EF9_A136BarColNum, H01EF9_A135BarColNom, H01EF9_A13711BarTipArtD, H01EF9_n13711BarTipArtD, H01EF9_A217BarTipArt, H01EF9_n217BarTipArt, H01EF9_A1652BarSerDsc, H01EF9_A212BarSer,
            H01EF9_A13696BarNHdr, H01EF9_A279CliNom, H01EF9_A252CliCod, H01EF9_n252CliCod, H01EF9_A13904BarIntColo, H01EF9_n13904BarIntColo, H01EF9_A13903BarMatColo, H01EF9_n13903BarMatColo, H01EF9_A13902BarNorma, H01EF9_n13902BarNorma,
            H01EF9_A13890BarHDSusp, H01EF9_n13890BarHDSusp, H01EF9_A13933BarCuadern, H01EF9_n13933BarCuadern, H01EF9_A13932BarAlbKgs, H01EF9_A13931BarAlbMts, H01EF9_A151BarFasCod, H01EF9_n151BarFasCod, H01EF9_A143BarDisNum, H01EF9_A4812BarEncCli,
            H01EF9_A218BarTipCol, H01EF9_A199BarPie1, H01EF9_A365DisDes, H01EF9_A898BarPieNDes, H01EF9_A361DisCod, H01EF9_A130BarCodPar, H01EF9_A132BarCodReo, H01EF9_A129BarCod, H01EF9_A396EmprCod, H01EF9_A13887KilosEntre,
            H01EF9_A166BarKgm, H01EF9_A13888MetrosEntr, H01EF9_A184BarMtr
            }
            , new Object[] {
            H01EF17_A9713Tb1_Cod, H01EF17_A494ForSer, H01EF17_A482ForColNom, H01EF17_A483ForColNum, H01EF17_A831TipColCod, H01EF17_A4466BarAcaAnh, H01EF17_A13909BarIdtxDc, H01EF17_n13909BarIdtxDc, H01EF17_A13908BarIdtx2, H01EF17_n13908BarIdtx2,
            H01EF17_A13907BarSerDsc2, H01EF17_n13907BarSerDsc2, H01EF17_A12809BarLocTel, H01EF17_A2447BarFecEnE, H01EF17_A12881BarOEKOTEX, H01EF17_n12881BarOEKOTEX, H01EF17_A213BarSit, H01EF17_A180BarMaqCod, H01EF17_A158BarFecFpr, H01EF17_A155BarFecCli,
            H01EF17_A159BarFecGen, H01EF17_A1234BarNomCli, H01EF17_A136BarColNum, H01EF17_A135BarColNom, H01EF17_A13711BarTipArtD, H01EF17_n13711BarTipArtD, H01EF17_A217BarTipArt, H01EF17_n217BarTipArt, H01EF17_A1652BarSerDsc, H01EF17_A212BarSer,
            H01EF17_A13696BarNHdr, H01EF17_A279CliNom, H01EF17_A252CliCod, H01EF17_n252CliCod, H01EF17_A13904BarIntColo, H01EF17_n13904BarIntColo, H01EF17_A13903BarMatColo, H01EF17_n13903BarMatColo, H01EF17_A13902BarNorma, H01EF17_n13902BarNorma,
            H01EF17_A13890BarHDSusp, H01EF17_n13890BarHDSusp, H01EF17_A13933BarCuadern, H01EF17_n13933BarCuadern, H01EF17_A13932BarAlbKgs, H01EF17_A13931BarAlbMts, H01EF17_A151BarFasCod, H01EF17_n151BarFasCod, H01EF17_A143BarDisNum, H01EF17_A4812BarEncCli,
            H01EF17_A218BarTipCol, H01EF17_A199BarPie1, H01EF17_A365DisDes, H01EF17_A898BarPieNDes, H01EF17_A361DisCod, H01EF17_A130BarCodPar, H01EF17_A132BarCodReo, H01EF17_A129BarCod, H01EF17_A396EmprCod, H01EF17_A13887KilosEntre,
            H01EF17_A166BarKgm, H01EF17_A13888MetrosEntr, H01EF17_A184BarMtr
            }
            , new Object[] {
            H01EF19_A13902BarNorma, H01EF19_n13902BarNorma
            }
            , new Object[] {
            H01EF25_A9713Tb1_Cod, H01EF25_A4466BarAcaAnh, H01EF25_A213BarSit, H01EF25_A180BarMaqCod, H01EF25_A158BarFecFpr, H01EF25_A155BarFecCli, H01EF25_A159BarFecGen, H01EF25_A1234BarNomCli, H01EF25_A136BarColNum, H01EF25_A135BarColNom,
            H01EF25_A13711BarTipArtD, H01EF25_n13711BarTipArtD, H01EF25_A217BarTipArt, H01EF25_n217BarTipArt, H01EF25_A1652BarSerDsc, H01EF25_A212BarSer, H01EF25_A13696BarNHdr, H01EF25_A279CliNom, H01EF25_A252CliCod, H01EF25_n252CliCod,
            H01EF25_A13933BarCuadern, H01EF25_n13933BarCuadern, H01EF25_A13932BarAlbKgs, H01EF25_A13931BarAlbMts, H01EF25_A151BarFasCod, H01EF25_n151BarFasCod, H01EF25_A13888MetrosEntr, H01EF25_A184BarMtr, H01EF25_A13887KilosEntre, H01EF25_A166BarKgm,
            H01EF25_A143BarDisNum, H01EF25_A4812BarEncCli, H01EF25_A199BarPie1, H01EF25_A365DisDes, H01EF25_A898BarPieNDes, H01EF25_A361DisCod, H01EF25_A130BarCodPar, H01EF25_A132BarCodReo, H01EF25_A129BarCod, H01EF25_A396EmprCod
            }
         }
      );
      AV170Pgmname = "ListadodeHDRs_WC" ;
      /* GeneXus formulas. */
      AV170Pgmname = "ListadodeHDRs_WC" ;
      Gx_err = (short)(0) ;
      edtavTotvaluebarkgm_Enabled = 0 ;
      edtavTotvaluebarmtr_Enabled = 0 ;
      edtavTotvaluebarpie_Enabled = 0 ;
   }

   private byte wcpOAV73BarSit ;
   private byte wcpOAV74BarSit_to ;
   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDynComponent ;
   private byte AV73BarSit ;
   private byte AV74BarSit_to ;
   private byte AV25ManageFiltersExecutionStep ;
   private byte AV85TFBarSit ;
   private byte AV86TFBarSit_To ;
   private byte A132BarCodReo ;
   private byte nDraw ;
   private byte nDoneStart ;
   private byte A218BarTipCol ;
   private byte A213BarSit ;
   private byte A13890BarHDSusp ;
   private byte A13904BarIntColo ;
   private byte nDonePA ;
   private byte AV156Listadodehdrs_wcds_37_tfbarsit ;
   private byte AV157Listadodehdrs_wcds_38_tfbarsit_to ;
   private byte subGrid_Backcolorstyle ;
   private byte subGrid_Sortable ;
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
   private short AV34TFBarTipArt ;
   private short AV35TFBarTipArt_To ;
   private short AV12OrderedBy ;
   private short A199BarPie1 ;
   private short wbEnd ;
   private short wbStart ;
   private short A217BarTipArt ;
   private short A13903BarMatColo ;
   private short A13888MetrosEntr ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV133Listadodehdrs_wcds_14_tfbartipart ;
   private short AV134Listadodehdrs_wcds_15_tfbartipart_to ;
   private short A4466BarAcaAnh ;
   private int wcpOAV77Clicod ;
   private int wcpOAV78Clicod_to ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_41 ;
   private int AV77Clicod ;
   private int AV78Clicod_to ;
   private int nGXsfl_41_idx=1 ;
   private int AV26TFCliCod ;
   private int AV27TFCliCod_To ;
   private int AV40TFBarColNum ;
   private int AV41TFBarColNum_To ;
   private int AV52TFBarPie ;
   private int AV53TFBarPie_To ;
   private int AV113TFBarAlbFact ;
   private int AV114TFBarAlbFact_To ;
   private int A898BarPieNDes ;
   private int A129BarCod ;
   private int A361DisCod ;
   private int Gridpaginationbar_Pagestoshow ;
   private int A252CliCod ;
   private int A136BarColNum ;
   private int A198BarPie ;
   private int A13935BarAlbFact ;
   private int subGrid_Islastpage ;
   private int edtavTotvaluebarkgm_Enabled ;
   private int edtavTotvaluebarmtr_Enabled ;
   private int edtavTotvaluebarpie_Enabled ;
   private int AV121Listadodehdrs_wcds_2_tfclicod ;
   private int AV122Listadodehdrs_wcds_3_tfclicod_to ;
   private int AV139Listadodehdrs_wcds_20_tfbarcolnum ;
   private int AV140Listadodehdrs_wcds_21_tfbarcolnum_to ;
   private int AV147Listadodehdrs_wcds_28_tfbarpie ;
   private int AV148Listadodehdrs_wcds_29_tfbarpie_to ;
   private int AV168Listadodehdrs_wcds_49_tfbaralbfact ;
   private int AV169Listadodehdrs_wcds_50_tfbaralbfact_to ;
   private int edtCliCod_Visible ;
   private int edtCliNom_Visible ;
   private int edtPedidoClie_Visible ;
   private int edtBarNHdr_Visible ;
   private int edtBarSer_Visible ;
   private int edtBarSerDsc_Visible ;
   private int edtBarTipArt_Visible ;
   private int edtBarTipArtD_Visible ;
   private int edtBarColNom_Visible ;
   private int edtBarColNum_Visible ;
   private int edtBarNomCli_Visible ;
   private int edtBarKgm_Visible ;
   private int edtBarMtr_Visible ;
   private int edtBarPie_Visible ;
   private int edtBarFecGen_Visible ;
   private int edtBarFecCli_Visible ;
   private int edtBarFecFpr_Visible ;
   private int edtBarFasCod_Visible ;
   private int edtBarMaqCod_Visible ;
   private int edtBarSit_Visible ;
   private int edtBarAlbUlti_Visible ;
   private int edtBarAlbMts_Visible ;
   private int edtBarAlbKgs_Visible ;
   private int edtBarCuadern_Visible ;
   private int edtBarNormas_Visible ;
   private int edtBarAlbFact_Visible ;
   private int AV69PageToGo ;
   private int AV171GXV1 ;
   private int GXt_int9 ;
   private int GXv_int10[] ;
   private int edtavFilterfulltext_Enabled ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long AV103TFBarAlbUltimo ;
   private long AV104TFBarAlbUltimo_To ;
   private long AV91TotBarPie ;
   private long AV70GridCurrentPage ;
   private long AV71GridPageCount ;
   private long A13930BarAlbUlti ;
   private long GRID_nCurrentRecord ;
   private long AV158Listadodehdrs_wcds_39_tfbaralbultimo ;
   private long AV159Listadodehdrs_wcds_40_tfbaralbultimo_to ;
   private long GRID_nRecordCount ;
   private long GXt_int7 ;
   private long GXv_int8[] ;
   private java.math.BigDecimal AV48TFBarKgm ;
   private java.math.BigDecimal AV49TFBarKgm_To ;
   private java.math.BigDecimal AV50TFBarMtr ;
   private java.math.BigDecimal AV51TFBarMtr_To ;
   private java.math.BigDecimal AV105TFBarAlbMts ;
   private java.math.BigDecimal AV106TFBarAlbMts_To ;
   private java.math.BigDecimal AV107TFBarAlbKgs ;
   private java.math.BigDecimal AV108TFBarAlbKgs_To ;
   private java.math.BigDecimal AV87TotBarKgm ;
   private java.math.BigDecimal AV89TotBarMtr ;
   private java.math.BigDecimal AV99TotKilosPendientes ;
   private java.math.BigDecimal AV101TotMetrosPendientes ;
   private java.math.BigDecimal A166BarKgm ;
   private java.math.BigDecimal A184BarMtr ;
   private java.math.BigDecimal A13931BarAlbMts ;
   private java.math.BigDecimal A13932BarAlbKgs ;
   private java.math.BigDecimal A13887KilosEntre ;
   private java.math.BigDecimal A13885KilosPendi ;
   private java.math.BigDecimal A13886MetrosPend ;
   private java.math.BigDecimal AV143Listadodehdrs_wcds_24_tfbarkgm ;
   private java.math.BigDecimal AV144Listadodehdrs_wcds_25_tfbarkgm_to ;
   private java.math.BigDecimal AV145Listadodehdrs_wcds_26_tfbarmtr ;
   private java.math.BigDecimal AV146Listadodehdrs_wcds_27_tfbarmtr_to ;
   private java.math.BigDecimal AV160Listadodehdrs_wcds_41_tfbaralbmts ;
   private java.math.BigDecimal AV161Listadodehdrs_wcds_42_tfbaralbmts_to ;
   private java.math.BigDecimal AV162Listadodehdrs_wcds_43_tfbaralbkgs ;
   private java.math.BigDecimal AV163Listadodehdrs_wcds_44_tfbaralbkgs_to ;
   private String wcpOAV72Emprcod ;
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
   private String AV72Emprcod ;
   private String sGXsfl_41_idx="0001" ;
   private String AV28TFCliNom ;
   private String AV29TFCliNom_Sel ;
   private String AV93TFPedidoCliente ;
   private String AV94TFPedidoCliente_Sel ;
   private String AV81TFBarNHdr ;
   private String AV82TFBarNHdr_Sel ;
   private String AV30TFBarSer ;
   private String AV31TFBarSer_Sel ;
   private String AV32TFBarSerDsc ;
   private String AV33TFBarSerDsc_Sel ;
   private String AV36TFBarTipArtDsc ;
   private String AV37TFBarTipArtDsc_Sel ;
   private String AV38TFBarColNom ;
   private String AV39TFBarColNom_Sel ;
   private String AV46TFBarNomCli ;
   private String AV47TFBarNomCli_Sel ;
   private String AV66TFBarFasCod ;
   private String AV67TFBarFasCod_Sel ;
   private String AV83TFBarMaqCod ;
   private String AV84TFBarMaqCod_Sel ;
   private String AV109TFBarCuaderno ;
   private String AV110TFBarCuaderno_Sel ;
   private String AV170Pgmname ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String A396EmprCod ;
   private String A4812BarEncCli ;
   private String A143BarDisNum ;
   private String A365DisDes ;
   private String A130BarCodPar ;
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
   private String Grid_titlescategories_Gridinternalname ;
   private String Grid_titlescategories_Gridtitlescategories ;
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
   private String Grid_titlescategories_Internalname ;
   private String Grid_empowerer_Internalname ;
   private String divDdo_barfecgenauxdates_Internalname ;
   private String edtavDdo_barfecgenauxdate_Internalname ;
   private String edtavDdo_barfecgenauxdate_Jsonclick ;
   private String divDdo_barfeccliauxdates_Internalname ;
   private String edtavDdo_barfeccliauxdate_Internalname ;
   private String edtavDdo_barfeccliauxdate_Jsonclick ;
   private String divDdo_barfecfprauxdates_Internalname ;
   private String edtavDdo_barfecfprauxdate_Internalname ;
   private String edtavDdo_barfecfprauxdate_Jsonclick ;
   private String sXEvt ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtavFilterfulltext_Internalname ;
   private String edtCliCod_Internalname ;
   private String A279CliNom ;
   private String edtCliNom_Internalname ;
   private String A13878PedidoClie ;
   private String edtPedidoClie_Internalname ;
   private String A13696BarNHdr ;
   private String edtBarNHdr_Internalname ;
   private String A212BarSer ;
   private String edtBarSer_Internalname ;
   private String A1652BarSerDsc ;
   private String edtBarSerDsc_Internalname ;
   private String edtBarTipArt_Internalname ;
   private String A13711BarTipArtD ;
   private String edtBarTipArtD_Internalname ;
   private String A135BarColNom ;
   private String edtBarColNom_Internalname ;
   private String edtBarColNum_Internalname ;
   private String edtBarTipCol_Internalname ;
   private String A13868BarTipColD ;
   private String edtBarTipColD_Internalname ;
   private String A1234BarNomCli ;
   private String edtBarNomCli_Internalname ;
   private String edtBarKgm_Internalname ;
   private String edtBarMtr_Internalname ;
   private String edtBarPie_Internalname ;
   private String edtBarFecGen_Internalname ;
   private String edtBarFecCli_Internalname ;
   private String edtBarFecFpr_Internalname ;
   private String A151BarFasCod ;
   private String edtBarFasCod_Internalname ;
   private String A180BarMaqCod ;
   private String edtBarMaqCod_Internalname ;
   private String edtBarSit_Internalname ;
   private String edtBarAlbUlti_Internalname ;
   private String edtBarAlbMts_Internalname ;
   private String edtBarAlbKgs_Internalname ;
   private String A13933BarCuadern ;
   private String edtBarCuadern_Internalname ;
   private String edtBarNormas_Internalname ;
   private String edtBarAlbFact_Internalname ;
   private String edtBarHDSusp_Internalname ;
   private String A13902BarNorma ;
   private String edtBarNorma_Internalname ;
   private String edtBarMatColo_Internalname ;
   private String A12881BarOEKOTEX ;
   private String edtBarOEKOTEX_Internalname ;
   private String edtBarFecEnE_Internalname ;
   private String edtBarIntColo_Internalname ;
   private String A12809BarLocTel ;
   private String edtBarLocTel_Internalname ;
   private String edtBarSerDsc2_Internalname ;
   private String A13908BarIdtx2 ;
   private String edtBarIdtx2_Internalname ;
   private String A13909BarIdtxDc ;
   private String edtBarIdtxDc_Internalname ;
   private String A13910BarColCv ;
   private String edtBarColCv_Internalname ;
   private String edtKilosEntre_Internalname ;
   private String edtMetrosEntr_Internalname ;
   private String edtKilosPendi_Internalname ;
   private String edtMetrosPend_Internalname ;
   private String edtavTotvaluebarkgm_Internalname ;
   private String edtavTotvaluebarmtr_Internalname ;
   private String edtavTotvaluebarpie_Internalname ;
   private String AV123Listadodehdrs_wcds_4_tfclinom ;
   private String AV124Listadodehdrs_wcds_5_tfclinom_sel ;
   private String AV125Listadodehdrs_wcds_6_tfpedidocliente ;
   private String AV126Listadodehdrs_wcds_7_tfpedidocliente_sel ;
   private String AV127Listadodehdrs_wcds_8_tfbarnhdr ;
   private String AV128Listadodehdrs_wcds_9_tfbarnhdr_sel ;
   private String AV129Listadodehdrs_wcds_10_tfbarser ;
   private String AV130Listadodehdrs_wcds_11_tfbarser_sel ;
   private String AV131Listadodehdrs_wcds_12_tfbarserdsc ;
   private String AV132Listadodehdrs_wcds_13_tfbarserdsc_sel ;
   private String AV135Listadodehdrs_wcds_16_tfbartipartdsc ;
   private String AV136Listadodehdrs_wcds_17_tfbartipartdsc_sel ;
   private String AV137Listadodehdrs_wcds_18_tfbarcolnom ;
   private String AV138Listadodehdrs_wcds_19_tfbarcolnom_sel ;
   private String AV141Listadodehdrs_wcds_22_tfbarnomcli ;
   private String AV142Listadodehdrs_wcds_23_tfbarnomcli_sel ;
   private String AV152Listadodehdrs_wcds_33_tfbarfascod ;
   private String AV153Listadodehdrs_wcds_34_tfbarfascod_sel ;
   private String AV154Listadodehdrs_wcds_35_tfbarmaqcod ;
   private String AV155Listadodehdrs_wcds_36_tfbarmaqcod_sel ;
   private String AV164Listadodehdrs_wcds_45_tfbarcuaderno ;
   private String AV165Listadodehdrs_wcds_46_tfbarcuaderno_sel ;
   private String scmdbuf ;
   private String lV152Listadodehdrs_wcds_33_tfbarfascod ;
   private String lV164Listadodehdrs_wcds_45_tfbarcuaderno ;
   private String lV123Listadodehdrs_wcds_4_tfclinom ;
   private String lV127Listadodehdrs_wcds_8_tfbarnhdr ;
   private String lV129Listadodehdrs_wcds_10_tfbarser ;
   private String lV131Listadodehdrs_wcds_12_tfbarserdsc ;
   private String lV135Listadodehdrs_wcds_16_tfbartipartdsc ;
   private String lV137Listadodehdrs_wcds_18_tfbarcolnom ;
   private String lV141Listadodehdrs_wcds_22_tfbarnomcli ;
   private String lV154Listadodehdrs_wcds_35_tfbarmaqcod ;
   private String AV117Station ;
   private String AV118Emprnom ;
   private String AV119Usurcod ;
   private String GXt_char33 ;
   private String GXt_char31 ;
   private String GXt_char29 ;
   private String GXt_char27 ;
   private String GXv_char28[] ;
   private String GXt_char25 ;
   private String GXv_char26[] ;
   private String GXt_char23 ;
   private String GXv_char24[] ;
   private String GXt_char21 ;
   private String GXv_char22[] ;
   private String GXt_char20 ;
   private String GXv_char5[] ;
   private String GXt_char19 ;
   private String GXv_char4[] ;
   private String GXt_char18 ;
   private String GXv_char3[] ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String GXv_char34[] ;
   private String GXv_char32[] ;
   private String GXv_char30[] ;
   private String GXt_char35 ;
   private String GXv_char36[] ;
   private String tblGridtabletotalizer_Internalname ;
   private String edtavTotvaluebarkgm_Jsonclick ;
   private String edtavTotvaluebarmtr_Jsonclick ;
   private String edtavTotvaluebarpie_Jsonclick ;
   private String tblTablerightheader_Internalname ;
   private String Ddo_managefilters_Caption ;
   private String Ddo_managefilters_Internalname ;
   private String tblTablefilters_Internalname ;
   private String edtavFilterfulltext_Jsonclick ;
   private String sCtrlAV72Emprcod ;
   private String sCtrlAV73BarSit ;
   private String sCtrlAV74BarSit_to ;
   private String sCtrlAV75BarFecGen ;
   private String sCtrlAV76BarFecGen_to ;
   private String sCtrlAV77Clicod ;
   private String sCtrlAV78Clicod_to ;
   private String sCtrlAV79BarFecCli ;
   private String sCtrlAV80BarFecCli_to ;
   private String sGXsfl_41_fel_idx="0001" ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String ROClassString ;
   private String edtCliCod_Jsonclick ;
   private String edtCliNom_Jsonclick ;
   private String edtPedidoClie_Jsonclick ;
   private String edtBarNHdr_Jsonclick ;
   private String edtBarSer_Jsonclick ;
   private String edtBarSerDsc_Jsonclick ;
   private String edtBarTipArt_Jsonclick ;
   private String edtBarTipArtD_Jsonclick ;
   private String edtBarColNom_Jsonclick ;
   private String edtBarColNum_Jsonclick ;
   private String edtBarTipCol_Jsonclick ;
   private String edtBarTipColD_Jsonclick ;
   private String edtBarNomCli_Jsonclick ;
   private String edtBarKgm_Jsonclick ;
   private String edtBarMtr_Jsonclick ;
   private String edtBarPie_Jsonclick ;
   private String edtBarFecGen_Jsonclick ;
   private String edtBarFecCli_Jsonclick ;
   private String edtBarFecFpr_Jsonclick ;
   private String edtBarFasCod_Jsonclick ;
   private String edtBarMaqCod_Jsonclick ;
   private String edtBarSit_Jsonclick ;
   private String edtBarAlbUlti_Jsonclick ;
   private String edtBarAlbMts_Jsonclick ;
   private String edtBarAlbKgs_Jsonclick ;
   private String edtBarCuadern_Jsonclick ;
   private String edtBarNormas_Jsonclick ;
   private String edtBarAlbFact_Jsonclick ;
   private String edtBarHDSusp_Jsonclick ;
   private String edtBarNorma_Jsonclick ;
   private String edtBarMatColo_Jsonclick ;
   private String edtBarOEKOTEX_Jsonclick ;
   private String edtBarFecEnE_Jsonclick ;
   private String edtBarIntColo_Jsonclick ;
   private String edtBarLocTel_Jsonclick ;
   private String edtBarSerDsc2_Jsonclick ;
   private String edtBarIdtx2_Jsonclick ;
   private String edtBarIdtxDc_Jsonclick ;
   private String edtBarColCv_Jsonclick ;
   private String edtKilosEntre_Jsonclick ;
   private String edtMetrosEntr_Jsonclick ;
   private String edtKilosPendi_Jsonclick ;
   private String edtMetrosPend_Jsonclick ;
   private String subGrid_Header ;
   private java.util.Date wcpOAV75BarFecGen ;
   private java.util.Date wcpOAV76BarFecGen_to ;
   private java.util.Date wcpOAV79BarFecCli ;
   private java.util.Date wcpOAV80BarFecCli_to ;
   private java.util.Date AV75BarFecGen ;
   private java.util.Date AV76BarFecGen_to ;
   private java.util.Date AV79BarFecCli ;
   private java.util.Date AV80BarFecCli_to ;
   private java.util.Date AV54TFBarFecGen ;
   private java.util.Date AV58TFBarFecCli ;
   private java.util.Date AV62TFBarFecFpr ;
   private java.util.Date AV56DDO_BarFecGenAuxDate ;
   private java.util.Date AV60DDO_BarFecCliAuxDate ;
   private java.util.Date AV64DDO_BarFecFprAuxDate ;
   private java.util.Date A159BarFecGen ;
   private java.util.Date A155BarFecCli ;
   private java.util.Date A158BarFecFpr ;
   private java.util.Date A2447BarFecEnE ;
   private java.util.Date AV149Listadodehdrs_wcds_30_tfbarfecgen ;
   private java.util.Date AV150Listadodehdrs_wcds_31_tfbarfeccli ;
   private java.util.Date AV151Listadodehdrs_wcds_32_tfbarfecfpr ;
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
   private boolean Grid_empowerer_Hascategories ;
   private boolean Grid_empowerer_Hastitlesettings ;
   private boolean Grid_empowerer_Hascolumnsselector ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean n252CliCod ;
   private boolean n217BarTipArt ;
   private boolean n13711BarTipArtD ;
   private boolean n151BarFasCod ;
   private boolean n13933BarCuadern ;
   private boolean n13890BarHDSusp ;
   private boolean n13902BarNorma ;
   private boolean n13903BarMatColo ;
   private boolean n12881BarOEKOTEX ;
   private boolean n13904BarIntColo ;
   private boolean n13907BarSerDsc2 ;
   private boolean n13908BarIdtx2 ;
   private boolean n13909BarIdtxDc ;
   private boolean bGXsfl_41_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private String AV18ColumnsSelectorXML ;
   private String AV24ManageFiltersXml ;
   private String AV19UserCustomValue ;
   private String AV15FilterFullText ;
   private String AV111TFBarNormas ;
   private String AV112TFBarNormas_Sel ;
   private String A13934BarNormas ;
   private String A13907BarSerDsc2 ;
   private String AV120Listadodehdrs_wcds_1_filterfulltext ;
   private String AV166Listadodehdrs_wcds_47_tfbarnormas ;
   private String AV167Listadodehdrs_wcds_48_tfbarnormas_sel ;
   private String AV88TotValueBarKgm ;
   private String AV90TotValueBarMtr ;
   private String AV92TotValueBarPie ;
   private String AV16ExcelFilename ;
   private String AV17ErrorMessage ;
   private String AV100TotValueKilosPendientes ;
   private String AV102TotValueMetrosPendientes ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV7HTTPRequest ;
   private com.genexus.webpanels.WebSession AV22Session ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableheader ;
   private com.genexus.webpanels.GXUserControl ucGridpaginationbar ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucDdo_gridcolumnsselector ;
   private com.genexus.webpanels.GXUserControl ucGrid_titlescategories ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.webpanels.GXUserControl ucDdo_managefilters ;
   private IDataStoreProvider pr_default ;
   private short[] H01EF9_A9713Tb1_Cod ;
   private String[] H01EF9_A494ForSer ;
   private String[] H01EF9_A482ForColNom ;
   private int[] H01EF9_A483ForColNum ;
   private byte[] H01EF9_A831TipColCod ;
   private short[] H01EF9_A4466BarAcaAnh ;
   private String[] H01EF9_A13909BarIdtxDc ;
   private boolean[] H01EF9_n13909BarIdtxDc ;
   private String[] H01EF9_A13908BarIdtx2 ;
   private boolean[] H01EF9_n13908BarIdtx2 ;
   private String[] H01EF9_A13907BarSerDsc2 ;
   private boolean[] H01EF9_n13907BarSerDsc2 ;
   private String[] H01EF9_A12809BarLocTel ;
   private java.util.Date[] H01EF9_A2447BarFecEnE ;
   private String[] H01EF9_A12881BarOEKOTEX ;
   private boolean[] H01EF9_n12881BarOEKOTEX ;
   private byte[] H01EF9_A213BarSit ;
   private String[] H01EF9_A180BarMaqCod ;
   private java.util.Date[] H01EF9_A158BarFecFpr ;
   private java.util.Date[] H01EF9_A155BarFecCli ;
   private java.util.Date[] H01EF9_A159BarFecGen ;
   private String[] H01EF9_A1234BarNomCli ;
   private int[] H01EF9_A136BarColNum ;
   private String[] H01EF9_A135BarColNom ;
   private String[] H01EF9_A13711BarTipArtD ;
   private boolean[] H01EF9_n13711BarTipArtD ;
   private short[] H01EF9_A217BarTipArt ;
   private boolean[] H01EF9_n217BarTipArt ;
   private String[] H01EF9_A1652BarSerDsc ;
   private String[] H01EF9_A212BarSer ;
   private String[] H01EF9_A13696BarNHdr ;
   private String[] H01EF9_A279CliNom ;
   private int[] H01EF9_A252CliCod ;
   private boolean[] H01EF9_n252CliCod ;
   private byte[] H01EF9_A13904BarIntColo ;
   private boolean[] H01EF9_n13904BarIntColo ;
   private short[] H01EF9_A13903BarMatColo ;
   private boolean[] H01EF9_n13903BarMatColo ;
   private String[] H01EF9_A13902BarNorma ;
   private boolean[] H01EF9_n13902BarNorma ;
   private byte[] H01EF9_A13890BarHDSusp ;
   private boolean[] H01EF9_n13890BarHDSusp ;
   private String[] H01EF9_A13933BarCuadern ;
   private boolean[] H01EF9_n13933BarCuadern ;
   private java.math.BigDecimal[] H01EF9_A13932BarAlbKgs ;
   private java.math.BigDecimal[] H01EF9_A13931BarAlbMts ;
   private String[] H01EF9_A151BarFasCod ;
   private boolean[] H01EF9_n151BarFasCod ;
   private String[] H01EF9_A143BarDisNum ;
   private String[] H01EF9_A4812BarEncCli ;
   private byte[] H01EF9_A218BarTipCol ;
   private short[] H01EF9_A199BarPie1 ;
   private String[] H01EF9_A365DisDes ;
   private int[] H01EF9_A898BarPieNDes ;
   private int[] H01EF9_A361DisCod ;
   private String[] H01EF9_A130BarCodPar ;
   private byte[] H01EF9_A132BarCodReo ;
   private int[] H01EF9_A129BarCod ;
   private String[] H01EF9_A396EmprCod ;
   private java.math.BigDecimal[] H01EF9_A13887KilosEntre ;
   private java.math.BigDecimal[] H01EF9_A166BarKgm ;
   private short[] H01EF9_A13888MetrosEntr ;
   private java.math.BigDecimal[] H01EF9_A184BarMtr ;
   private short[] H01EF17_A9713Tb1_Cod ;
   private String[] H01EF17_A494ForSer ;
   private String[] H01EF17_A482ForColNom ;
   private int[] H01EF17_A483ForColNum ;
   private byte[] H01EF17_A831TipColCod ;
   private short[] H01EF17_A4466BarAcaAnh ;
   private String[] H01EF17_A13909BarIdtxDc ;
   private boolean[] H01EF17_n13909BarIdtxDc ;
   private String[] H01EF17_A13908BarIdtx2 ;
   private boolean[] H01EF17_n13908BarIdtx2 ;
   private String[] H01EF17_A13907BarSerDsc2 ;
   private boolean[] H01EF17_n13907BarSerDsc2 ;
   private String[] H01EF17_A12809BarLocTel ;
   private java.util.Date[] H01EF17_A2447BarFecEnE ;
   private String[] H01EF17_A12881BarOEKOTEX ;
   private boolean[] H01EF17_n12881BarOEKOTEX ;
   private byte[] H01EF17_A213BarSit ;
   private String[] H01EF17_A180BarMaqCod ;
   private java.util.Date[] H01EF17_A158BarFecFpr ;
   private java.util.Date[] H01EF17_A155BarFecCli ;
   private java.util.Date[] H01EF17_A159BarFecGen ;
   private String[] H01EF17_A1234BarNomCli ;
   private int[] H01EF17_A136BarColNum ;
   private String[] H01EF17_A135BarColNom ;
   private String[] H01EF17_A13711BarTipArtD ;
   private boolean[] H01EF17_n13711BarTipArtD ;
   private short[] H01EF17_A217BarTipArt ;
   private boolean[] H01EF17_n217BarTipArt ;
   private String[] H01EF17_A1652BarSerDsc ;
   private String[] H01EF17_A212BarSer ;
   private String[] H01EF17_A13696BarNHdr ;
   private String[] H01EF17_A279CliNom ;
   private int[] H01EF17_A252CliCod ;
   private boolean[] H01EF17_n252CliCod ;
   private byte[] H01EF17_A13904BarIntColo ;
   private boolean[] H01EF17_n13904BarIntColo ;
   private short[] H01EF17_A13903BarMatColo ;
   private boolean[] H01EF17_n13903BarMatColo ;
   private String[] H01EF17_A13902BarNorma ;
   private boolean[] H01EF17_n13902BarNorma ;
   private byte[] H01EF17_A13890BarHDSusp ;
   private boolean[] H01EF17_n13890BarHDSusp ;
   private String[] H01EF17_A13933BarCuadern ;
   private boolean[] H01EF17_n13933BarCuadern ;
   private java.math.BigDecimal[] H01EF17_A13932BarAlbKgs ;
   private java.math.BigDecimal[] H01EF17_A13931BarAlbMts ;
   private String[] H01EF17_A151BarFasCod ;
   private boolean[] H01EF17_n151BarFasCod ;
   private String[] H01EF17_A143BarDisNum ;
   private String[] H01EF17_A4812BarEncCli ;
   private byte[] H01EF17_A218BarTipCol ;
   private short[] H01EF17_A199BarPie1 ;
   private String[] H01EF17_A365DisDes ;
   private int[] H01EF17_A898BarPieNDes ;
   private int[] H01EF17_A361DisCod ;
   private String[] H01EF17_A130BarCodPar ;
   private byte[] H01EF17_A132BarCodReo ;
   private int[] H01EF17_A129BarCod ;
   private String[] H01EF17_A396EmprCod ;
   private java.math.BigDecimal[] H01EF17_A13887KilosEntre ;
   private java.math.BigDecimal[] H01EF17_A166BarKgm ;
   private short[] H01EF17_A13888MetrosEntr ;
   private java.math.BigDecimal[] H01EF17_A184BarMtr ;
   private String[] H01EF19_A13902BarNorma ;
   private boolean[] H01EF19_n13902BarNorma ;
   private short[] H01EF25_A9713Tb1_Cod ;
   private short[] H01EF25_A4466BarAcaAnh ;
   private byte[] H01EF25_A213BarSit ;
   private String[] H01EF25_A180BarMaqCod ;
   private java.util.Date[] H01EF25_A158BarFecFpr ;
   private java.util.Date[] H01EF25_A155BarFecCli ;
   private java.util.Date[] H01EF25_A159BarFecGen ;
   private String[] H01EF25_A1234BarNomCli ;
   private int[] H01EF25_A136BarColNum ;
   private String[] H01EF25_A135BarColNom ;
   private String[] H01EF25_A13711BarTipArtD ;
   private boolean[] H01EF25_n13711BarTipArtD ;
   private short[] H01EF25_A217BarTipArt ;
   private boolean[] H01EF25_n217BarTipArt ;
   private String[] H01EF25_A1652BarSerDsc ;
   private String[] H01EF25_A212BarSer ;
   private String[] H01EF25_A13696BarNHdr ;
   private String[] H01EF25_A279CliNom ;
   private int[] H01EF25_A252CliCod ;
   private boolean[] H01EF25_n252CliCod ;
   private String[] H01EF25_A13933BarCuadern ;
   private boolean[] H01EF25_n13933BarCuadern ;
   private java.math.BigDecimal[] H01EF25_A13932BarAlbKgs ;
   private java.math.BigDecimal[] H01EF25_A13931BarAlbMts ;
   private String[] H01EF25_A151BarFasCod ;
   private boolean[] H01EF25_n151BarFasCod ;
   private short[] H01EF25_A13888MetrosEntr ;
   private java.math.BigDecimal[] H01EF25_A184BarMtr ;
   private java.math.BigDecimal[] H01EF25_A13887KilosEntre ;
   private java.math.BigDecimal[] H01EF25_A166BarKgm ;
   private String[] H01EF25_A143BarDisNum ;
   private String[] H01EF25_A4812BarEncCli ;
   private short[] H01EF25_A199BarPie1 ;
   private String[] H01EF25_A365DisDes ;
   private int[] H01EF25_A898BarPieNDes ;
   private int[] H01EF25_A361DisCod ;
   private String[] H01EF25_A130BarCodPar ;
   private byte[] H01EF25_A132BarCodReo ;
   private int[] H01EF25_A129BarCod ;
   private String[] H01EF25_A396EmprCod ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> AV23ManageFiltersData ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item16 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item17[] ;
   private app.wwpbaseobjects.SdtWWPContext AV6WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext13[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV8TrnContext ;
   private app.wwpbaseobjects.SdtWWPGridState AV10GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState37[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV11GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV20ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV21ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector14[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector15[] ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV68DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons11 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons12[] ;
}

final  class listadodehdrs_wc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H01EF9( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          int AV121Listadodehdrs_wcds_2_tfclicod ,
                                          int AV122Listadodehdrs_wcds_3_tfclicod_to ,
                                          String AV124Listadodehdrs_wcds_5_tfclinom_sel ,
                                          String AV123Listadodehdrs_wcds_4_tfclinom ,
                                          String AV128Listadodehdrs_wcds_9_tfbarnhdr_sel ,
                                          String AV127Listadodehdrs_wcds_8_tfbarnhdr ,
                                          String AV130Listadodehdrs_wcds_11_tfbarser_sel ,
                                          String AV129Listadodehdrs_wcds_10_tfbarser ,
                                          String AV132Listadodehdrs_wcds_13_tfbarserdsc_sel ,
                                          String AV131Listadodehdrs_wcds_12_tfbarserdsc ,
                                          short AV133Listadodehdrs_wcds_14_tfbartipart ,
                                          short AV134Listadodehdrs_wcds_15_tfbartipart_to ,
                                          String AV136Listadodehdrs_wcds_17_tfbartipartdsc_sel ,
                                          String AV135Listadodehdrs_wcds_16_tfbartipartdsc ,
                                          String AV138Listadodehdrs_wcds_19_tfbarcolnom_sel ,
                                          String AV137Listadodehdrs_wcds_18_tfbarcolnom ,
                                          int AV139Listadodehdrs_wcds_20_tfbarcolnum ,
                                          int AV140Listadodehdrs_wcds_21_tfbarcolnum_to ,
                                          String AV142Listadodehdrs_wcds_23_tfbarnomcli_sel ,
                                          String AV141Listadodehdrs_wcds_22_tfbarnomcli ,
                                          java.math.BigDecimal AV143Listadodehdrs_wcds_24_tfbarkgm ,
                                          java.math.BigDecimal AV144Listadodehdrs_wcds_25_tfbarkgm_to ,
                                          java.math.BigDecimal AV145Listadodehdrs_wcds_26_tfbarmtr ,
                                          java.math.BigDecimal AV146Listadodehdrs_wcds_27_tfbarmtr_to ,
                                          java.util.Date AV149Listadodehdrs_wcds_30_tfbarfecgen ,
                                          java.util.Date AV150Listadodehdrs_wcds_31_tfbarfeccli ,
                                          java.util.Date AV151Listadodehdrs_wcds_32_tfbarfecfpr ,
                                          String AV155Listadodehdrs_wcds_36_tfbarmaqcod_sel ,
                                          String AV154Listadodehdrs_wcds_35_tfbarmaqcod ,
                                          byte AV156Listadodehdrs_wcds_37_tfbarsit ,
                                          byte AV157Listadodehdrs_wcds_38_tfbarsit_to ,
                                          java.math.BigDecimal AV160Listadodehdrs_wcds_41_tfbaralbmts ,
                                          java.math.BigDecimal AV161Listadodehdrs_wcds_42_tfbaralbmts_to ,
                                          java.math.BigDecimal AV162Listadodehdrs_wcds_43_tfbaralbkgs ,
                                          java.math.BigDecimal AV163Listadodehdrs_wcds_44_tfbaralbkgs_to ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          String A212BarSer ,
                                          String A1652BarSerDsc ,
                                          short A217BarTipArt ,
                                          String A13711BarTipArtD ,
                                          String A135BarColNom ,
                                          int A136BarColNum ,
                                          String A1234BarNomCli ,
                                          java.math.BigDecimal A166BarKgm ,
                                          java.math.BigDecimal A184BarMtr ,
                                          java.util.Date A159BarFecGen ,
                                          java.util.Date A155BarFecCli ,
                                          java.util.Date A158BarFecFpr ,
                                          String A180BarMaqCod ,
                                          byte A213BarSit ,
                                          java.math.BigDecimal A13931BarAlbMts ,
                                          java.math.BigDecimal A13932BarAlbKgs ,
                                          short AV12OrderedBy ,
                                          boolean AV13OrderedDsc ,
                                          String AV120Listadodehdrs_wcds_1_filterfulltext ,
                                          String A13878PedidoClie ,
                                          String A13696BarNHdr ,
                                          int A198BarPie ,
                                          String A151BarFasCod ,
                                          long A13930BarAlbUlti ,
                                          String A13933BarCuadern ,
                                          String A13934BarNormas ,
                                          int A13935BarAlbFact ,
                                          String AV126Listadodehdrs_wcds_7_tfpedidocliente_sel ,
                                          String AV125Listadodehdrs_wcds_6_tfpedidocliente ,
                                          int AV147Listadodehdrs_wcds_28_tfbarpie ,
                                          int AV148Listadodehdrs_wcds_29_tfbarpie_to ,
                                          String AV153Listadodehdrs_wcds_34_tfbarfascod_sel ,
                                          String AV152Listadodehdrs_wcds_33_tfbarfascod ,
                                          long AV158Listadodehdrs_wcds_39_tfbaralbultimo ,
                                          long AV159Listadodehdrs_wcds_40_tfbaralbultimo_to ,
                                          String AV165Listadodehdrs_wcds_46_tfbarcuaderno_sel ,
                                          String AV164Listadodehdrs_wcds_45_tfbarcuaderno ,
                                          String AV167Listadodehdrs_wcds_48_tfbarnormas_sel ,
                                          String AV166Listadodehdrs_wcds_47_tfbarnormas ,
                                          int AV168Listadodehdrs_wcds_49_tfbaralbfact ,
                                          int AV169Listadodehdrs_wcds_50_tfbaralbfact_to ,
                                          java.util.Date AV75BarFecGen ,
                                          java.util.Date AV76BarFecGen_to ,
                                          java.util.Date AV79BarFecCli ,
                                          java.util.Date AV80BarFecCli_to ,
                                          byte AV73BarSit ,
                                          byte AV74BarSit_to ,
                                          String AV72Emprcod ,
                                          int AV77Clicod ,
                                          String A396EmprCod ,
                                          int AV78Clicod_to )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int38 = new byte[58];
      Object[] GXv_Object39 = new Object[2];
      scmdbuf = "SELECT T9.Tb1_Cod, T8.ForSer, T8.ForColNom, T8.ForColNum, T8.TipColCod, T1.BarAcaAnh, T4.Dsc_Idtx AS BarIdtxDc, T1.BarIdtx2 AS BarIdtx2, T1.BarSerDsc2, T1.BarLocTel," ;
      scmdbuf += " T1.BarFecEnE, T1.BarOEKOTEX, T1.BarSit, T1.BarMaqCod, T1.BarFecFpr, T1.BarFecCli, T1.BarFecGen, T1.BarNomCli, T1.BarColNum, T1.BarColNom, T3.TipArtDsc AS BarTipArtD," ;
      scmdbuf += " T1.BarTipArt AS BarTipArt, T1.BarSerDsc, T1.BarSer, RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90')," ;
      scmdbuf += " 2))) || T1.BarCodPar AS BarNHdr, T5.CliNom, T1.CliCod, COALESCE( T8.IntCod, 0) AS BarIntColo, COALESCE( T8.MatCod, 0) AS BarMatColo, COALESCE( T12.BarNorma, ' ')" ;
      scmdbuf += " AS BarNorma, COALESCE( T2.BarHDSusp, 0) AS BarHDSusp, COALESCE( T9.Tb1_Dsc, ' ') AS BarCuadern, COALESCE( T10.BarAlbKgs, 0) AS BarAlbKgs, COALESCE( T10.BarAlbMts," ;
      scmdbuf += " 0) AS BarAlbMts, COALESCE( T11.BarFasCod, ' ') AS BarFasCod, T1.BarDisNum, T1.BarEncCli, T1.BarTipCol, COALESCE( T6.BarPie1, 0) AS BarPie1, T1.DisDes, COALESCE(" ;
      scmdbuf += " T6.BarPieNDes, 0) AS BarPieNDes, T1.DisCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.EmprCod, COALESCE( T7.KilosEntre, 0) AS KilosEntre, COALESCE( T6.BarKgm, 0)" ;
      scmdbuf += " AS BarKgm, COALESCE( T7.MetrosEntr, 0) AS MetrosEntr, COALESCE( T6.BarMtr, 0) AS BarMtr FROM ((((((((((TXPBARCAD T1 LEFT JOIN (SELECT MIN(T13.Stp_Est) AS BarHDSusp," ;
      scmdbuf += " T14.BarCod, T14.BarCodReo, T14.BarCodPar FROM (TXPHDSTO1 T13 INNER JOIN TXPBARCAD T14 ON T14.EmprCod = T13.EmprCod) WHERE (T13.EmprCod = ?) AND (T14.BarCod = T13.Stp_hdr)" ;
      scmdbuf += " AND (T14.BarCodReo = T13.Stp_r) AND (T14.BarCodPar = T13.Stp_p) AND (T13.Stp_Est = 1) GROUP BY T14.BarCod, T14.BarCodReo, T14.BarCodPar ) T2 ON T2.BarCod = T1.BarCod" ;
      scmdbuf += " AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) LEFT JOIN TXPTIPART T3 ON T3.EmprCod = T1.EmprCod AND T3.TipArtCod = T1.BarTipArt) LEFT JOIN TXPINDITE" ;
      scmdbuf += " T4 ON T4.EmprCod = T1.EmprCod AND T4.Cod_Idtx = T1.BarIdtx2) LEFT JOIN TXPCLIENT T5 ON T5.EmprCod = T1.EmprCod AND T5.CliCod = T1.CliCod) LEFT JOIN (SELECT SUM(BarPieMet)" ;
      scmdbuf += " AS BarMtr, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarPieKil) AS BarKgm, SUM(BarPiePie) AS BarPieNDes, COUNT(*) AS BarPie1 FROM TXPBARPIE GROUP BY EmprCod, BarCod," ;
      scmdbuf += " BarCodReo, BarCodPar ) T6 ON T6.EmprCod = T1.EmprCod AND T6.BarCod = T1.BarCod AND T6.BarCodReo = T1.BarCodReo AND T6.BarCodPar = T1.BarCodPar) LEFT JOIN (SELECT" ;
      scmdbuf += " SUM(BarMetLan) AS MetrosEntr, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarKilLan) AS KilosEntre FROM TXPBARPIE WHERE BarPieEst = 1 GROUP BY EmprCod, BarCod, BarCodReo," ;
      scmdbuf += " BarCodPar ) T7 ON T7.EmprCod = T1.EmprCod AND T7.BarCod = T1.BarCod AND T7.BarCodReo = T1.BarCodReo AND T7.BarCodPar = T1.BarCodPar) LEFT JOIN TXPCFORMU T8 ON T8.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T8.CliCod = T1.CliCod AND T8.ForSer = T1.BarSer AND T8.ForColNom = T1.BarColNom AND T8.ForColNum = T1.BarColNum AND T8.TipColCod = T1.BarTipCol)" ;
      scmdbuf += " LEFT JOIN TXPTABLE1 T9 ON T9.EmprCod = T1.EmprCod AND T9.Tb1_Cod = T1.BarAcaAnh) LEFT JOIN (SELECT SUM(BarAlbKgmE) AS BarAlbKgs, EmprCod, BarCod, BarCodReo, BarCodPar," ;
      scmdbuf += " SUM(BarAlbMtrE) AS BarAlbMts FROM TXPALBBAR GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T10 ON T10.EmprCod = T1.EmprCod AND T10.BarCod = T1.BarCod AND T10.BarCodReo" ;
      scmdbuf += " = T1.BarCodReo AND T10.BarCodPar = T1.BarCodPar) LEFT JOIN (SELECT MIN(T13.FasCod) AS BarFasCod, T13.EmprCod, T13.BarCod, T13.BarCodReo, T13.BarCodPar FROM (TXPBARFAS" ;
      scmdbuf += " T13 INNER JOIN (SELECT MAX(BarOrdLin) AS GXC1, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarFasEst <> 0 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar" ;
      scmdbuf += " ) T14 ON T14.EmprCod = T13.EmprCod AND T14.BarCod = T13.BarCod AND T14.BarCodReo = T13.BarCodReo AND T14.BarCodPar = T13.BarCodPar) WHERE (T13.BarOrdLin = T14.GXC1)" ;
      scmdbuf += " AND (T13.BarFasEst <> 0) GROUP BY T13.EmprCod, T13.BarCod, T13.BarCodReo, T13.BarCodPar ) T11 ON T11.EmprCod = T1.EmprCod AND T11.BarCod = T1.BarCod AND T11.BarCodReo" ;
      scmdbuf += " = T1.BarCodReo AND T11.BarCodPar = T1.BarCodPar),  (SELECT MIN(DisNormID) AS BarNorma FROM TXPDISNOR WHERE EmprCod = ? and DisCod = ? ) T12" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.CliCod >= ?)");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T11.BarFasCod, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T11.BarFasCod, ' ') = ?))");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T9.Tb1_Dsc, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T9.Tb1_Dsc, ' ') = ?))");
      addWhere(sWhereString, "(T1.BarFecGen >= ?)");
      addWhere(sWhereString, "(T1.BarFecGen <= ?)");
      addWhere(sWhereString, "(T1.BarFecCli >= ?)");
      addWhere(sWhereString, "(T1.BarFecCli <= ? or (? = TO_DATE('0001-01-01', 'YYYY-MM-DD')))");
      addWhere(sWhereString, "(T1.BarSit >= ?)");
      addWhere(sWhereString, "(T1.BarSit <= ?)");
      addWhere(sWhereString, "(T1.CliCod <= ?)");
      if ( ! (0==AV121Listadodehdrs_wcds_2_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int38[23] = (byte)(1) ;
      }
      if ( ! (0==AV122Listadodehdrs_wcds_3_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int38[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV124Listadodehdrs_wcds_5_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV123Listadodehdrs_wcds_4_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T5.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int38[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV124Listadodehdrs_wcds_5_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T5.CliNom = ?)");
      }
      else
      {
         GXv_int38[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV128Listadodehdrs_wcds_9_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV127Listadodehdrs_wcds_8_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int38[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV128Listadodehdrs_wcds_9_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int38[28] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV130Listadodehdrs_wcds_11_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV129Listadodehdrs_wcds_10_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int38[29] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV130Listadodehdrs_wcds_11_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer = ?)");
      }
      else
      {
         GXv_int38[30] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV132Listadodehdrs_wcds_13_tfbarserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV131Listadodehdrs_wcds_12_tfbarserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int38[31] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV132Listadodehdrs_wcds_13_tfbarserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSerDsc = ?)");
      }
      else
      {
         GXv_int38[32] = (byte)(1) ;
      }
      if ( ! (0==AV133Listadodehdrs_wcds_14_tfbartipart) )
      {
         addWhere(sWhereString, "(T1.BarTipArt >= ?)");
      }
      else
      {
         GXv_int38[33] = (byte)(1) ;
      }
      if ( ! (0==AV134Listadodehdrs_wcds_15_tfbartipart_to) )
      {
         addWhere(sWhereString, "(T1.BarTipArt <= ?)");
      }
      else
      {
         GXv_int38[34] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV136Listadodehdrs_wcds_17_tfbartipartdsc_sel)==0) && ( ! (GXutil.strcmp("", AV135Listadodehdrs_wcds_16_tfbartipartdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.TipArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int38[35] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV136Listadodehdrs_wcds_17_tfbartipartdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.TipArtDsc = ?)");
      }
      else
      {
         GXv_int38[36] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV138Listadodehdrs_wcds_19_tfbarcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV137Listadodehdrs_wcds_18_tfbarcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int38[37] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV138Listadodehdrs_wcds_19_tfbarcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom = ?)");
      }
      else
      {
         GXv_int38[38] = (byte)(1) ;
      }
      if ( ! (0==AV139Listadodehdrs_wcds_20_tfbarcolnum) )
      {
         addWhere(sWhereString, "(T1.BarColNum >= ?)");
      }
      else
      {
         GXv_int38[39] = (byte)(1) ;
      }
      if ( ! (0==AV140Listadodehdrs_wcds_21_tfbarcolnum_to) )
      {
         addWhere(sWhereString, "(T1.BarColNum <= ?)");
      }
      else
      {
         GXv_int38[40] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV142Listadodehdrs_wcds_23_tfbarnomcli_sel)==0) && ( ! (GXutil.strcmp("", AV141Listadodehdrs_wcds_22_tfbarnomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int38[41] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV142Listadodehdrs_wcds_23_tfbarnomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarNomCli = ?)");
      }
      else
      {
         GXv_int38[42] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV143Listadodehdrs_wcds_24_tfbarkgm)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T6.BarKgm, 0) >= ?)");
      }
      else
      {
         GXv_int38[43] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV144Listadodehdrs_wcds_25_tfbarkgm_to)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T6.BarKgm, 0) <= ?)");
      }
      else
      {
         GXv_int38[44] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV145Listadodehdrs_wcds_26_tfbarmtr)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T6.BarMtr, 0) >= ?)");
      }
      else
      {
         GXv_int38[45] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV146Listadodehdrs_wcds_27_tfbarmtr_to)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T6.BarMtr, 0) <= ?)");
      }
      else
      {
         GXv_int38[46] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV149Listadodehdrs_wcds_30_tfbarfecgen)) )
      {
         addWhere(sWhereString, "(T1.BarFecGen >= ?)");
      }
      else
      {
         GXv_int38[47] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV150Listadodehdrs_wcds_31_tfbarfeccli)) )
      {
         addWhere(sWhereString, "(T1.BarFecCli >= ?)");
      }
      else
      {
         GXv_int38[48] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV151Listadodehdrs_wcds_32_tfbarfecfpr)) )
      {
         addWhere(sWhereString, "(T1.BarFecFpr >= ?)");
      }
      else
      {
         GXv_int38[49] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV155Listadodehdrs_wcds_36_tfbarmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV154Listadodehdrs_wcds_35_tfbarmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarMaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int38[50] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV155Listadodehdrs_wcds_36_tfbarmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarMaqCod = ?)");
      }
      else
      {
         GXv_int38[51] = (byte)(1) ;
      }
      if ( ! (0==AV156Listadodehdrs_wcds_37_tfbarsit) )
      {
         addWhere(sWhereString, "(T1.BarSit >= ?)");
      }
      else
      {
         GXv_int38[52] = (byte)(1) ;
      }
      if ( ! (0==AV157Listadodehdrs_wcds_38_tfbarsit_to) )
      {
         addWhere(sWhereString, "(T1.BarSit <= ?)");
      }
      else
      {
         GXv_int38[53] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV160Listadodehdrs_wcds_41_tfbaralbmts)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T10.BarAlbMts, 0) >= ?)");
      }
      else
      {
         GXv_int38[54] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV161Listadodehdrs_wcds_42_tfbaralbmts_to)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T10.BarAlbMts, 0) <= ?)");
      }
      else
      {
         GXv_int38[55] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV162Listadodehdrs_wcds_43_tfbaralbkgs)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T10.BarAlbKgs, 0) >= ?)");
      }
      else
      {
         GXv_int38[56] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV163Listadodehdrs_wcds_44_tfbaralbkgs_to)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T10.BarAlbKgs, 0) <= ?)");
      }
      else
      {
         GXv_int38[57] = (byte)(1) ;
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
         scmdbuf += " ORDER BY T5.CliNom" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T5.CliNom DESC" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarSer" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarSer DESC" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarSerDsc" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarSerDsc DESC" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarTipArt" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarTipArt DESC" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T3.TipArtDsc" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.TipArtDsc DESC" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarColNom" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarColNom DESC" ;
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
         scmdbuf += " ORDER BY T1.BarNomCli" ;
      }
      else if ( ( AV12OrderedBy == 9 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarNomCli DESC" ;
      }
      else if ( ( AV12OrderedBy == 10 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarFecGen" ;
      }
      else if ( ( AV12OrderedBy == 10 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarFecGen DESC" ;
      }
      else if ( ( AV12OrderedBy == 11 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarFecCli" ;
      }
      else if ( ( AV12OrderedBy == 11 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarFecCli DESC" ;
      }
      else if ( ( AV12OrderedBy == 12 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarFecFpr" ;
      }
      else if ( ( AV12OrderedBy == 12 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarFecFpr DESC" ;
      }
      else if ( ( AV12OrderedBy == 13 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarMaqCod" ;
      }
      else if ( ( AV12OrderedBy == 13 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarMaqCod DESC" ;
      }
      else if ( ( AV12OrderedBy == 14 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarSit" ;
      }
      else if ( ( AV12OrderedBy == 14 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarSit DESC" ;
      }
      GXv_Object39[0] = scmdbuf ;
      GXv_Object39[1] = GXv_int38 ;
      return GXv_Object39 ;
   }

   protected Object[] conditional_H01EF17( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.IHttpContext httpContext ,
                                           int AV121Listadodehdrs_wcds_2_tfclicod ,
                                           int AV122Listadodehdrs_wcds_3_tfclicod_to ,
                                           String AV124Listadodehdrs_wcds_5_tfclinom_sel ,
                                           String AV123Listadodehdrs_wcds_4_tfclinom ,
                                           String AV128Listadodehdrs_wcds_9_tfbarnhdr_sel ,
                                           String AV127Listadodehdrs_wcds_8_tfbarnhdr ,
                                           String AV130Listadodehdrs_wcds_11_tfbarser_sel ,
                                           String AV129Listadodehdrs_wcds_10_tfbarser ,
                                           String AV132Listadodehdrs_wcds_13_tfbarserdsc_sel ,
                                           String AV131Listadodehdrs_wcds_12_tfbarserdsc ,
                                           short AV133Listadodehdrs_wcds_14_tfbartipart ,
                                           short AV134Listadodehdrs_wcds_15_tfbartipart_to ,
                                           String AV136Listadodehdrs_wcds_17_tfbartipartdsc_sel ,
                                           String AV135Listadodehdrs_wcds_16_tfbartipartdsc ,
                                           String AV138Listadodehdrs_wcds_19_tfbarcolnom_sel ,
                                           String AV137Listadodehdrs_wcds_18_tfbarcolnom ,
                                           int AV139Listadodehdrs_wcds_20_tfbarcolnum ,
                                           int AV140Listadodehdrs_wcds_21_tfbarcolnum_to ,
                                           String AV142Listadodehdrs_wcds_23_tfbarnomcli_sel ,
                                           String AV141Listadodehdrs_wcds_22_tfbarnomcli ,
                                           java.math.BigDecimal AV143Listadodehdrs_wcds_24_tfbarkgm ,
                                           java.math.BigDecimal AV144Listadodehdrs_wcds_25_tfbarkgm_to ,
                                           java.math.BigDecimal AV145Listadodehdrs_wcds_26_tfbarmtr ,
                                           java.math.BigDecimal AV146Listadodehdrs_wcds_27_tfbarmtr_to ,
                                           java.util.Date AV149Listadodehdrs_wcds_30_tfbarfecgen ,
                                           java.util.Date AV150Listadodehdrs_wcds_31_tfbarfeccli ,
                                           java.util.Date AV151Listadodehdrs_wcds_32_tfbarfecfpr ,
                                           String AV155Listadodehdrs_wcds_36_tfbarmaqcod_sel ,
                                           String AV154Listadodehdrs_wcds_35_tfbarmaqcod ,
                                           byte AV156Listadodehdrs_wcds_37_tfbarsit ,
                                           byte AV157Listadodehdrs_wcds_38_tfbarsit_to ,
                                           java.math.BigDecimal AV160Listadodehdrs_wcds_41_tfbaralbmts ,
                                           java.math.BigDecimal AV161Listadodehdrs_wcds_42_tfbaralbmts_to ,
                                           java.math.BigDecimal AV162Listadodehdrs_wcds_43_tfbaralbkgs ,
                                           java.math.BigDecimal AV163Listadodehdrs_wcds_44_tfbaralbkgs_to ,
                                           int A252CliCod ,
                                           String A279CliNom ,
                                           int A129BarCod ,
                                           byte A132BarCodReo ,
                                           String A130BarCodPar ,
                                           String A212BarSer ,
                                           String A1652BarSerDsc ,
                                           short A217BarTipArt ,
                                           String A13711BarTipArtD ,
                                           String A135BarColNom ,
                                           int A136BarColNum ,
                                           String A1234BarNomCli ,
                                           java.math.BigDecimal A166BarKgm ,
                                           java.math.BigDecimal A184BarMtr ,
                                           java.util.Date A159BarFecGen ,
                                           java.util.Date A155BarFecCli ,
                                           java.util.Date A158BarFecFpr ,
                                           String A180BarMaqCod ,
                                           byte A213BarSit ,
                                           java.math.BigDecimal A13931BarAlbMts ,
                                           java.math.BigDecimal A13932BarAlbKgs ,
                                           short AV12OrderedBy ,
                                           boolean AV13OrderedDsc ,
                                           String AV120Listadodehdrs_wcds_1_filterfulltext ,
                                           String A13878PedidoClie ,
                                           String A13696BarNHdr ,
                                           int A198BarPie ,
                                           String A151BarFasCod ,
                                           long A13930BarAlbUlti ,
                                           String A13933BarCuadern ,
                                           String A13934BarNormas ,
                                           int A13935BarAlbFact ,
                                           String AV126Listadodehdrs_wcds_7_tfpedidocliente_sel ,
                                           String AV125Listadodehdrs_wcds_6_tfpedidocliente ,
                                           int AV147Listadodehdrs_wcds_28_tfbarpie ,
                                           int AV148Listadodehdrs_wcds_29_tfbarpie_to ,
                                           String AV153Listadodehdrs_wcds_34_tfbarfascod_sel ,
                                           String AV152Listadodehdrs_wcds_33_tfbarfascod ,
                                           long AV158Listadodehdrs_wcds_39_tfbaralbultimo ,
                                           long AV159Listadodehdrs_wcds_40_tfbaralbultimo_to ,
                                           String AV165Listadodehdrs_wcds_46_tfbarcuaderno_sel ,
                                           String AV164Listadodehdrs_wcds_45_tfbarcuaderno ,
                                           String AV167Listadodehdrs_wcds_48_tfbarnormas_sel ,
                                           String AV166Listadodehdrs_wcds_47_tfbarnormas ,
                                           int AV168Listadodehdrs_wcds_49_tfbaralbfact ,
                                           int AV169Listadodehdrs_wcds_50_tfbaralbfact_to ,
                                           java.util.Date AV75BarFecGen ,
                                           java.util.Date AV76BarFecGen_to ,
                                           java.util.Date AV79BarFecCli ,
                                           java.util.Date AV80BarFecCli_to ,
                                           byte AV73BarSit ,
                                           byte AV74BarSit_to ,
                                           String AV72Emprcod ,
                                           int AV77Clicod ,
                                           String A396EmprCod ,
                                           int AV78Clicod_to )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int40 = new byte[58];
      Object[] GXv_Object41 = new Object[2];
      scmdbuf = "SELECT T9.Tb1_Cod, T8.ForSer, T8.ForColNom, T8.ForColNum, T8.TipColCod, T1.BarAcaAnh, T4.Dsc_Idtx AS BarIdtxDc, T1.BarIdtx2 AS BarIdtx2, T1.BarSerDsc2, T1.BarLocTel," ;
      scmdbuf += " T1.BarFecEnE, T1.BarOEKOTEX, T1.BarSit, T1.BarMaqCod, T1.BarFecFpr, T1.BarFecCli, T1.BarFecGen, T1.BarNomCli, T1.BarColNum, T1.BarColNom, T3.TipArtDsc AS BarTipArtD," ;
      scmdbuf += " T1.BarTipArt AS BarTipArt, T1.BarSerDsc, T1.BarSer, RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90')," ;
      scmdbuf += " 2))) || T1.BarCodPar AS BarNHdr, T5.CliNom, T1.CliCod, COALESCE( T8.IntCod, 0) AS BarIntColo, COALESCE( T8.MatCod, 0) AS BarMatColo, COALESCE( T12.BarNorma, ' ')" ;
      scmdbuf += " AS BarNorma, COALESCE( T2.BarHDSusp, 0) AS BarHDSusp, COALESCE( T9.Tb1_Dsc, ' ') AS BarCuadern, COALESCE( T10.BarAlbKgs, 0) AS BarAlbKgs, COALESCE( T10.BarAlbMts," ;
      scmdbuf += " 0) AS BarAlbMts, COALESCE( T11.BarFasCod, ' ') AS BarFasCod, T1.BarDisNum, T1.BarEncCli, T1.BarTipCol, COALESCE( T6.BarPie1, 0) AS BarPie1, T1.DisDes, COALESCE(" ;
      scmdbuf += " T6.BarPieNDes, 0) AS BarPieNDes, T1.DisCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.EmprCod, COALESCE( T7.KilosEntre, 0) AS KilosEntre, COALESCE( T6.BarKgm, 0)" ;
      scmdbuf += " AS BarKgm, COALESCE( T7.MetrosEntr, 0) AS MetrosEntr, COALESCE( T6.BarMtr, 0) AS BarMtr FROM ((((((((((TXPBARCAD T1 LEFT JOIN (SELECT MIN(T13.Stp_Est) AS BarHDSusp," ;
      scmdbuf += " T14.BarCod, T14.BarCodReo, T14.BarCodPar FROM (TXPHDSTO1 T13 INNER JOIN TXPBARCAD T14 ON T14.EmprCod = T13.EmprCod) WHERE (T13.EmprCod = ?) AND (T14.BarCod = T13.Stp_hdr)" ;
      scmdbuf += " AND (T14.BarCodReo = T13.Stp_r) AND (T14.BarCodPar = T13.Stp_p) AND (T13.Stp_Est = 1) GROUP BY T14.BarCod, T14.BarCodReo, T14.BarCodPar ) T2 ON T2.BarCod = T1.BarCod" ;
      scmdbuf += " AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) LEFT JOIN TXPTIPART T3 ON T3.EmprCod = T1.EmprCod AND T3.TipArtCod = T1.BarTipArt) LEFT JOIN TXPINDITE" ;
      scmdbuf += " T4 ON T4.EmprCod = T1.EmprCod AND T4.Cod_Idtx = T1.BarIdtx2) LEFT JOIN TXPCLIENT T5 ON T5.EmprCod = T1.EmprCod AND T5.CliCod = T1.CliCod) LEFT JOIN (SELECT SUM(BarPieMet)" ;
      scmdbuf += " AS BarMtr, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarPieKil) AS BarKgm, SUM(BarPiePie) AS BarPieNDes, COUNT(*) AS BarPie1 FROM TXPBARPIE GROUP BY EmprCod, BarCod," ;
      scmdbuf += " BarCodReo, BarCodPar ) T6 ON T6.EmprCod = T1.EmprCod AND T6.BarCod = T1.BarCod AND T6.BarCodReo = T1.BarCodReo AND T6.BarCodPar = T1.BarCodPar) LEFT JOIN (SELECT" ;
      scmdbuf += " SUM(BarMetLan) AS MetrosEntr, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarKilLan) AS KilosEntre FROM TXPBARPIE WHERE BarPieEst = 1 GROUP BY EmprCod, BarCod, BarCodReo," ;
      scmdbuf += " BarCodPar ) T7 ON T7.EmprCod = T1.EmprCod AND T7.BarCod = T1.BarCod AND T7.BarCodReo = T1.BarCodReo AND T7.BarCodPar = T1.BarCodPar) LEFT JOIN TXPCFORMU T8 ON T8.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T8.CliCod = T1.CliCod AND T8.ForSer = T1.BarSer AND T8.ForColNom = T1.BarColNom AND T8.ForColNum = T1.BarColNum AND T8.TipColCod = T1.BarTipCol)" ;
      scmdbuf += " LEFT JOIN TXPTABLE1 T9 ON T9.EmprCod = T1.EmprCod AND T9.Tb1_Cod = T1.BarAcaAnh) LEFT JOIN (SELECT SUM(BarAlbKgmE) AS BarAlbKgs, EmprCod, BarCod, BarCodReo, BarCodPar," ;
      scmdbuf += " SUM(BarAlbMtrE) AS BarAlbMts FROM TXPALBBAR GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T10 ON T10.EmprCod = T1.EmprCod AND T10.BarCod = T1.BarCod AND T10.BarCodReo" ;
      scmdbuf += " = T1.BarCodReo AND T10.BarCodPar = T1.BarCodPar) LEFT JOIN (SELECT MIN(T13.FasCod) AS BarFasCod, T13.EmprCod, T13.BarCod, T13.BarCodReo, T13.BarCodPar FROM (TXPBARFAS" ;
      scmdbuf += " T13 INNER JOIN (SELECT MAX(BarOrdLin) AS GXC1, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarFasEst <> 0 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar" ;
      scmdbuf += " ) T14 ON T14.EmprCod = T13.EmprCod AND T14.BarCod = T13.BarCod AND T14.BarCodReo = T13.BarCodReo AND T14.BarCodPar = T13.BarCodPar) WHERE (T13.BarOrdLin = T14.GXC1)" ;
      scmdbuf += " AND (T13.BarFasEst <> 0) GROUP BY T13.EmprCod, T13.BarCod, T13.BarCodReo, T13.BarCodPar ) T11 ON T11.EmprCod = T1.EmprCod AND T11.BarCod = T1.BarCod AND T11.BarCodReo" ;
      scmdbuf += " = T1.BarCodReo AND T11.BarCodPar = T1.BarCodPar),  (SELECT MIN(DisNormID) AS BarNorma FROM TXPDISNOR WHERE EmprCod = ? and DisCod = ? ) T12" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.CliCod >= ?)");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T11.BarFasCod, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T11.BarFasCod, ' ') = ?))");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T9.Tb1_Dsc, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T9.Tb1_Dsc, ' ') = ?))");
      addWhere(sWhereString, "(T1.BarFecGen >= ?)");
      addWhere(sWhereString, "(T1.BarFecGen <= ?)");
      addWhere(sWhereString, "(T1.BarFecCli >= ?)");
      addWhere(sWhereString, "(T1.BarFecCli <= ? or (? = TO_DATE('0001-01-01', 'YYYY-MM-DD')))");
      addWhere(sWhereString, "(T1.BarSit >= ?)");
      addWhere(sWhereString, "(T1.BarSit <= ?)");
      addWhere(sWhereString, "(T1.CliCod <= ?)");
      if ( ! (0==AV121Listadodehdrs_wcds_2_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int40[23] = (byte)(1) ;
      }
      if ( ! (0==AV122Listadodehdrs_wcds_3_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int40[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV124Listadodehdrs_wcds_5_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV123Listadodehdrs_wcds_4_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T5.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int40[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV124Listadodehdrs_wcds_5_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T5.CliNom = ?)");
      }
      else
      {
         GXv_int40[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV128Listadodehdrs_wcds_9_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV127Listadodehdrs_wcds_8_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int40[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV128Listadodehdrs_wcds_9_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int40[28] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV130Listadodehdrs_wcds_11_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV129Listadodehdrs_wcds_10_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int40[29] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV130Listadodehdrs_wcds_11_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer = ?)");
      }
      else
      {
         GXv_int40[30] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV132Listadodehdrs_wcds_13_tfbarserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV131Listadodehdrs_wcds_12_tfbarserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int40[31] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV132Listadodehdrs_wcds_13_tfbarserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSerDsc = ?)");
      }
      else
      {
         GXv_int40[32] = (byte)(1) ;
      }
      if ( ! (0==AV133Listadodehdrs_wcds_14_tfbartipart) )
      {
         addWhere(sWhereString, "(T1.BarTipArt >= ?)");
      }
      else
      {
         GXv_int40[33] = (byte)(1) ;
      }
      if ( ! (0==AV134Listadodehdrs_wcds_15_tfbartipart_to) )
      {
         addWhere(sWhereString, "(T1.BarTipArt <= ?)");
      }
      else
      {
         GXv_int40[34] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV136Listadodehdrs_wcds_17_tfbartipartdsc_sel)==0) && ( ! (GXutil.strcmp("", AV135Listadodehdrs_wcds_16_tfbartipartdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.TipArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int40[35] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV136Listadodehdrs_wcds_17_tfbartipartdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.TipArtDsc = ?)");
      }
      else
      {
         GXv_int40[36] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV138Listadodehdrs_wcds_19_tfbarcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV137Listadodehdrs_wcds_18_tfbarcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int40[37] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV138Listadodehdrs_wcds_19_tfbarcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom = ?)");
      }
      else
      {
         GXv_int40[38] = (byte)(1) ;
      }
      if ( ! (0==AV139Listadodehdrs_wcds_20_tfbarcolnum) )
      {
         addWhere(sWhereString, "(T1.BarColNum >= ?)");
      }
      else
      {
         GXv_int40[39] = (byte)(1) ;
      }
      if ( ! (0==AV140Listadodehdrs_wcds_21_tfbarcolnum_to) )
      {
         addWhere(sWhereString, "(T1.BarColNum <= ?)");
      }
      else
      {
         GXv_int40[40] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV142Listadodehdrs_wcds_23_tfbarnomcli_sel)==0) && ( ! (GXutil.strcmp("", AV141Listadodehdrs_wcds_22_tfbarnomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int40[41] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV142Listadodehdrs_wcds_23_tfbarnomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarNomCli = ?)");
      }
      else
      {
         GXv_int40[42] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV143Listadodehdrs_wcds_24_tfbarkgm)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T6.BarKgm, 0) >= ?)");
      }
      else
      {
         GXv_int40[43] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV144Listadodehdrs_wcds_25_tfbarkgm_to)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T6.BarKgm, 0) <= ?)");
      }
      else
      {
         GXv_int40[44] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV145Listadodehdrs_wcds_26_tfbarmtr)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T6.BarMtr, 0) >= ?)");
      }
      else
      {
         GXv_int40[45] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV146Listadodehdrs_wcds_27_tfbarmtr_to)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T6.BarMtr, 0) <= ?)");
      }
      else
      {
         GXv_int40[46] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV149Listadodehdrs_wcds_30_tfbarfecgen)) )
      {
         addWhere(sWhereString, "(T1.BarFecGen >= ?)");
      }
      else
      {
         GXv_int40[47] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV150Listadodehdrs_wcds_31_tfbarfeccli)) )
      {
         addWhere(sWhereString, "(T1.BarFecCli >= ?)");
      }
      else
      {
         GXv_int40[48] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV151Listadodehdrs_wcds_32_tfbarfecfpr)) )
      {
         addWhere(sWhereString, "(T1.BarFecFpr >= ?)");
      }
      else
      {
         GXv_int40[49] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV155Listadodehdrs_wcds_36_tfbarmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV154Listadodehdrs_wcds_35_tfbarmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarMaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int40[50] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV155Listadodehdrs_wcds_36_tfbarmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarMaqCod = ?)");
      }
      else
      {
         GXv_int40[51] = (byte)(1) ;
      }
      if ( ! (0==AV156Listadodehdrs_wcds_37_tfbarsit) )
      {
         addWhere(sWhereString, "(T1.BarSit >= ?)");
      }
      else
      {
         GXv_int40[52] = (byte)(1) ;
      }
      if ( ! (0==AV157Listadodehdrs_wcds_38_tfbarsit_to) )
      {
         addWhere(sWhereString, "(T1.BarSit <= ?)");
      }
      else
      {
         GXv_int40[53] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV160Listadodehdrs_wcds_41_tfbaralbmts)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T10.BarAlbMts, 0) >= ?)");
      }
      else
      {
         GXv_int40[54] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV161Listadodehdrs_wcds_42_tfbaralbmts_to)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T10.BarAlbMts, 0) <= ?)");
      }
      else
      {
         GXv_int40[55] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV162Listadodehdrs_wcds_43_tfbaralbkgs)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T10.BarAlbKgs, 0) >= ?)");
      }
      else
      {
         GXv_int40[56] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV163Listadodehdrs_wcds_44_tfbaralbkgs_to)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T10.BarAlbKgs, 0) <= ?)");
      }
      else
      {
         GXv_int40[57] = (byte)(1) ;
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
         scmdbuf += " ORDER BY T5.CliNom" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T5.CliNom DESC" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarSer" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarSer DESC" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarSerDsc" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarSerDsc DESC" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarTipArt" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarTipArt DESC" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T3.TipArtDsc" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.TipArtDsc DESC" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarColNom" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarColNom DESC" ;
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
         scmdbuf += " ORDER BY T1.BarNomCli" ;
      }
      else if ( ( AV12OrderedBy == 9 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarNomCli DESC" ;
      }
      else if ( ( AV12OrderedBy == 10 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarFecGen" ;
      }
      else if ( ( AV12OrderedBy == 10 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarFecGen DESC" ;
      }
      else if ( ( AV12OrderedBy == 11 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarFecCli" ;
      }
      else if ( ( AV12OrderedBy == 11 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarFecCli DESC" ;
      }
      else if ( ( AV12OrderedBy == 12 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarFecFpr" ;
      }
      else if ( ( AV12OrderedBy == 12 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarFecFpr DESC" ;
      }
      else if ( ( AV12OrderedBy == 13 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarMaqCod" ;
      }
      else if ( ( AV12OrderedBy == 13 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarMaqCod DESC" ;
      }
      else if ( ( AV12OrderedBy == 14 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarSit" ;
      }
      else if ( ( AV12OrderedBy == 14 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarSit DESC" ;
      }
      GXv_Object41[0] = scmdbuf ;
      GXv_Object41[1] = GXv_int40 ;
      return GXv_Object41 ;
   }

   protected Object[] conditional_H01EF25( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.IHttpContext httpContext ,
                                           int AV121Listadodehdrs_wcds_2_tfclicod ,
                                           int AV122Listadodehdrs_wcds_3_tfclicod_to ,
                                           String AV124Listadodehdrs_wcds_5_tfclinom_sel ,
                                           String AV123Listadodehdrs_wcds_4_tfclinom ,
                                           String AV128Listadodehdrs_wcds_9_tfbarnhdr_sel ,
                                           String AV127Listadodehdrs_wcds_8_tfbarnhdr ,
                                           String AV130Listadodehdrs_wcds_11_tfbarser_sel ,
                                           String AV129Listadodehdrs_wcds_10_tfbarser ,
                                           String AV132Listadodehdrs_wcds_13_tfbarserdsc_sel ,
                                           String AV131Listadodehdrs_wcds_12_tfbarserdsc ,
                                           short AV133Listadodehdrs_wcds_14_tfbartipart ,
                                           short AV134Listadodehdrs_wcds_15_tfbartipart_to ,
                                           String AV136Listadodehdrs_wcds_17_tfbartipartdsc_sel ,
                                           String AV135Listadodehdrs_wcds_16_tfbartipartdsc ,
                                           String AV138Listadodehdrs_wcds_19_tfbarcolnom_sel ,
                                           String AV137Listadodehdrs_wcds_18_tfbarcolnom ,
                                           int AV139Listadodehdrs_wcds_20_tfbarcolnum ,
                                           int AV140Listadodehdrs_wcds_21_tfbarcolnum_to ,
                                           String AV142Listadodehdrs_wcds_23_tfbarnomcli_sel ,
                                           String AV141Listadodehdrs_wcds_22_tfbarnomcli ,
                                           java.math.BigDecimal AV143Listadodehdrs_wcds_24_tfbarkgm ,
                                           java.math.BigDecimal AV144Listadodehdrs_wcds_25_tfbarkgm_to ,
                                           java.math.BigDecimal AV145Listadodehdrs_wcds_26_tfbarmtr ,
                                           java.math.BigDecimal AV146Listadodehdrs_wcds_27_tfbarmtr_to ,
                                           java.util.Date AV149Listadodehdrs_wcds_30_tfbarfecgen ,
                                           java.util.Date AV150Listadodehdrs_wcds_31_tfbarfeccli ,
                                           java.util.Date AV151Listadodehdrs_wcds_32_tfbarfecfpr ,
                                           String AV155Listadodehdrs_wcds_36_tfbarmaqcod_sel ,
                                           String AV154Listadodehdrs_wcds_35_tfbarmaqcod ,
                                           byte AV156Listadodehdrs_wcds_37_tfbarsit ,
                                           byte AV157Listadodehdrs_wcds_38_tfbarsit_to ,
                                           java.math.BigDecimal AV160Listadodehdrs_wcds_41_tfbaralbmts ,
                                           java.math.BigDecimal AV161Listadodehdrs_wcds_42_tfbaralbmts_to ,
                                           java.math.BigDecimal AV162Listadodehdrs_wcds_43_tfbaralbkgs ,
                                           java.math.BigDecimal AV163Listadodehdrs_wcds_44_tfbaralbkgs_to ,
                                           int A252CliCod ,
                                           String A279CliNom ,
                                           int A129BarCod ,
                                           byte A132BarCodReo ,
                                           String A130BarCodPar ,
                                           String A212BarSer ,
                                           String A1652BarSerDsc ,
                                           short A217BarTipArt ,
                                           String A13711BarTipArtD ,
                                           String A135BarColNom ,
                                           int A136BarColNum ,
                                           String A1234BarNomCli ,
                                           java.math.BigDecimal A166BarKgm ,
                                           java.math.BigDecimal A184BarMtr ,
                                           java.util.Date A159BarFecGen ,
                                           java.util.Date A155BarFecCli ,
                                           java.util.Date A158BarFecFpr ,
                                           String A180BarMaqCod ,
                                           byte A213BarSit ,
                                           java.math.BigDecimal A13931BarAlbMts ,
                                           java.math.BigDecimal A13932BarAlbKgs ,
                                           String AV120Listadodehdrs_wcds_1_filterfulltext ,
                                           String A13878PedidoClie ,
                                           String A13696BarNHdr ,
                                           int A198BarPie ,
                                           String A151BarFasCod ,
                                           long A13930BarAlbUlti ,
                                           String A13933BarCuadern ,
                                           String A13934BarNormas ,
                                           int A13935BarAlbFact ,
                                           String AV126Listadodehdrs_wcds_7_tfpedidocliente_sel ,
                                           String AV125Listadodehdrs_wcds_6_tfpedidocliente ,
                                           int AV147Listadodehdrs_wcds_28_tfbarpie ,
                                           int AV148Listadodehdrs_wcds_29_tfbarpie_to ,
                                           String AV153Listadodehdrs_wcds_34_tfbarfascod_sel ,
                                           String AV152Listadodehdrs_wcds_33_tfbarfascod ,
                                           long AV158Listadodehdrs_wcds_39_tfbaralbultimo ,
                                           long AV159Listadodehdrs_wcds_40_tfbaralbultimo_to ,
                                           String AV165Listadodehdrs_wcds_46_tfbarcuaderno_sel ,
                                           String AV164Listadodehdrs_wcds_45_tfbarcuaderno ,
                                           String AV167Listadodehdrs_wcds_48_tfbarnormas_sel ,
                                           String AV166Listadodehdrs_wcds_47_tfbarnormas ,
                                           int AV168Listadodehdrs_wcds_49_tfbaralbfact ,
                                           int AV169Listadodehdrs_wcds_50_tfbaralbfact_to ,
                                           java.util.Date AV75BarFecGen ,
                                           java.util.Date AV76BarFecGen_to ,
                                           java.util.Date AV79BarFecCli ,
                                           java.util.Date AV80BarFecCli_to ,
                                           int AV77Clicod ,
                                           int AV78Clicod_to ,
                                           byte AV73BarSit ,
                                           byte AV74BarSit_to ,
                                           String AV72Emprcod ,
                                           String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int42 = new byte[55];
      Object[] GXv_Object43 = new Object[2];
      scmdbuf = "SELECT T4.Tb1_Cod, T1.BarAcaAnh, T1.BarSit, T1.BarMaqCod, T1.BarFecFpr, T1.BarFecCli, T1.BarFecGen, T1.BarNomCli, T1.BarColNum, T1.BarColNom, T2.TipArtDsc AS BarTipArtD," ;
      scmdbuf += " T1.BarTipArt AS BarTipArt, T1.BarSerDsc, T1.BarSer, RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90')," ;
      scmdbuf += " 2))) || T1.BarCodPar AS BarNHdr, T3.CliNom, T1.CliCod, COALESCE( T4.Tb1_Dsc, ' ') AS BarCuadern, COALESCE( T5.BarAlbKgs, 0) AS BarAlbKgs, COALESCE( T5.BarAlbMts," ;
      scmdbuf += " 0) AS BarAlbMts, COALESCE( T6.BarFasCod, ' ') AS BarFasCod, COALESCE( T8.MetrosEntr, 0) AS MetrosEntr, COALESCE( T7.BarMtr, 0) AS BarMtr, COALESCE( T8.KilosEntre," ;
      scmdbuf += " 0) AS KilosEntre, COALESCE( T7.BarKgm, 0) AS BarKgm, T1.BarDisNum, T1.BarEncCli, COALESCE( T7.BarPie1, 0) AS BarPie1, T1.DisDes, COALESCE( T7.BarPieNDes, 0) AS" ;
      scmdbuf += " BarPieNDes, T1.DisCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.EmprCod FROM (((((((TXPBARCAD T1 LEFT JOIN TXPTIPART T2 ON T2.EmprCod = T1.EmprCod AND T2.TipArtCod" ;
      scmdbuf += " = T1.BarTipArt) LEFT JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T1.CliCod) LEFT JOIN TXPTABLE1 T4 ON T4.EmprCod = T1.EmprCod AND T4.Tb1_Cod =" ;
      scmdbuf += " T1.BarAcaAnh) LEFT JOIN (SELECT SUM(BarAlbKgmE) AS BarAlbKgs, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarAlbMtrE) AS BarAlbMts FROM TXPALBBAR GROUP BY EmprCod," ;
      scmdbuf += " BarCod, BarCodReo, BarCodPar ) T5 ON T5.EmprCod = T1.EmprCod AND T5.BarCod = T1.BarCod AND T5.BarCodReo = T1.BarCodReo AND T5.BarCodPar = T1.BarCodPar) LEFT JOIN" ;
      scmdbuf += " (SELECT MIN(T9.FasCod) AS BarFasCod, T9.EmprCod, T9.BarCod, T9.BarCodReo, T9.BarCodPar FROM (TXPBARFAS T9 INNER JOIN (SELECT MAX(BarOrdLin) AS GXC1, EmprCod, BarCod," ;
      scmdbuf += " BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarFasEst <> 0 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T10 ON T10.EmprCod = T9.EmprCod AND T10.BarCod = T9.BarCod" ;
      scmdbuf += " AND T10.BarCodReo = T9.BarCodReo AND T10.BarCodPar = T9.BarCodPar) WHERE (T9.BarOrdLin = T10.GXC1) AND (T9.BarFasEst <> 0) GROUP BY T9.EmprCod, T9.BarCod, T9.BarCodReo," ;
      scmdbuf += " T9.BarCodPar ) T6 ON T6.EmprCod = T1.EmprCod AND T6.BarCod = T1.BarCod AND T6.BarCodReo = T1.BarCodReo AND T6.BarCodPar = T1.BarCodPar) LEFT JOIN (SELECT SUM(BarPiePie)" ;
      scmdbuf += " AS BarPieNDes, EmprCod, BarCod, BarCodReo, BarCodPar, COUNT(*) AS BarPie1, SUM(BarPieKil) AS BarKgm, SUM(BarPieMet) AS BarMtr FROM TXPBARPIE GROUP BY EmprCod, BarCod," ;
      scmdbuf += " BarCodReo, BarCodPar ) T7 ON T7.EmprCod = T1.EmprCod AND T7.BarCod = T1.BarCod AND T7.BarCodReo = T1.BarCodReo AND T7.BarCodPar = T1.BarCodPar) LEFT JOIN (SELECT" ;
      scmdbuf += " SUM(BarKilLan) AS KilosEntre, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarMetLan) AS MetrosEntr FROM TXPBARPIE WHERE BarPieEst = 1 GROUP BY EmprCod, BarCod, BarCodReo," ;
      scmdbuf += " BarCodPar ) T8 ON T8.EmprCod = T1.EmprCod AND T8.BarCod = T1.BarCod AND T8.BarCodReo = T1.BarCodReo AND T8.BarCodPar = T1.BarCodPar)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T6.BarFasCod, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T6.BarFasCod, ' ') = ?))");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T4.Tb1_Dsc, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T4.Tb1_Dsc, ' ') = ?))");
      addWhere(sWhereString, "(T1.BarFecGen >= ?)");
      addWhere(sWhereString, "(T1.BarFecGen <= ?)");
      addWhere(sWhereString, "(T1.BarFecCli >= ?)");
      addWhere(sWhereString, "(T1.BarFecCli <= ? or (? = TO_DATE('0001-01-01', 'YYYY-MM-DD')))");
      addWhere(sWhereString, "(T1.CliCod >= ?)");
      addWhere(sWhereString, "(T1.CliCod <= ?)");
      addWhere(sWhereString, "(T1.BarSit >= ?)");
      addWhere(sWhereString, "(T1.BarSit <= ?)");
      if ( ! (0==AV121Listadodehdrs_wcds_2_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int42[20] = (byte)(1) ;
      }
      if ( ! (0==AV122Listadodehdrs_wcds_3_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int42[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV124Listadodehdrs_wcds_5_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV123Listadodehdrs_wcds_4_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int42[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV124Listadodehdrs_wcds_5_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int42[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV128Listadodehdrs_wcds_9_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV127Listadodehdrs_wcds_8_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int42[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV128Listadodehdrs_wcds_9_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int42[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV130Listadodehdrs_wcds_11_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV129Listadodehdrs_wcds_10_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int42[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV130Listadodehdrs_wcds_11_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer = ?)");
      }
      else
      {
         GXv_int42[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV132Listadodehdrs_wcds_13_tfbarserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV131Listadodehdrs_wcds_12_tfbarserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int42[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV132Listadodehdrs_wcds_13_tfbarserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSerDsc = ?)");
      }
      else
      {
         GXv_int42[29] = (byte)(1) ;
      }
      if ( ! (0==AV133Listadodehdrs_wcds_14_tfbartipart) )
      {
         addWhere(sWhereString, "(T1.BarTipArt >= ?)");
      }
      else
      {
         GXv_int42[30] = (byte)(1) ;
      }
      if ( ! (0==AV134Listadodehdrs_wcds_15_tfbartipart_to) )
      {
         addWhere(sWhereString, "(T1.BarTipArt <= ?)");
      }
      else
      {
         GXv_int42[31] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV136Listadodehdrs_wcds_17_tfbartipartdsc_sel)==0) && ( ! (GXutil.strcmp("", AV135Listadodehdrs_wcds_16_tfbartipartdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.TipArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int42[32] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV136Listadodehdrs_wcds_17_tfbartipartdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.TipArtDsc = ?)");
      }
      else
      {
         GXv_int42[33] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV138Listadodehdrs_wcds_19_tfbarcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV137Listadodehdrs_wcds_18_tfbarcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int42[34] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV138Listadodehdrs_wcds_19_tfbarcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom = ?)");
      }
      else
      {
         GXv_int42[35] = (byte)(1) ;
      }
      if ( ! (0==AV139Listadodehdrs_wcds_20_tfbarcolnum) )
      {
         addWhere(sWhereString, "(T1.BarColNum >= ?)");
      }
      else
      {
         GXv_int42[36] = (byte)(1) ;
      }
      if ( ! (0==AV140Listadodehdrs_wcds_21_tfbarcolnum_to) )
      {
         addWhere(sWhereString, "(T1.BarColNum <= ?)");
      }
      else
      {
         GXv_int42[37] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV142Listadodehdrs_wcds_23_tfbarnomcli_sel)==0) && ( ! (GXutil.strcmp("", AV141Listadodehdrs_wcds_22_tfbarnomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int42[38] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV142Listadodehdrs_wcds_23_tfbarnomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarNomCli = ?)");
      }
      else
      {
         GXv_int42[39] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV143Listadodehdrs_wcds_24_tfbarkgm)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T7.BarKgm, 0) >= ?)");
      }
      else
      {
         GXv_int42[40] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV144Listadodehdrs_wcds_25_tfbarkgm_to)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T7.BarKgm, 0) <= ?)");
      }
      else
      {
         GXv_int42[41] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV145Listadodehdrs_wcds_26_tfbarmtr)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T7.BarMtr, 0) >= ?)");
      }
      else
      {
         GXv_int42[42] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV146Listadodehdrs_wcds_27_tfbarmtr_to)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T7.BarMtr, 0) <= ?)");
      }
      else
      {
         GXv_int42[43] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV149Listadodehdrs_wcds_30_tfbarfecgen)) )
      {
         addWhere(sWhereString, "(T1.BarFecGen >= ?)");
      }
      else
      {
         GXv_int42[44] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV150Listadodehdrs_wcds_31_tfbarfeccli)) )
      {
         addWhere(sWhereString, "(T1.BarFecCli >= ?)");
      }
      else
      {
         GXv_int42[45] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV151Listadodehdrs_wcds_32_tfbarfecfpr)) )
      {
         addWhere(sWhereString, "(T1.BarFecFpr >= ?)");
      }
      else
      {
         GXv_int42[46] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV155Listadodehdrs_wcds_36_tfbarmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV154Listadodehdrs_wcds_35_tfbarmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarMaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int42[47] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV155Listadodehdrs_wcds_36_tfbarmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarMaqCod = ?)");
      }
      else
      {
         GXv_int42[48] = (byte)(1) ;
      }
      if ( ! (0==AV156Listadodehdrs_wcds_37_tfbarsit) )
      {
         addWhere(sWhereString, "(T1.BarSit >= ?)");
      }
      else
      {
         GXv_int42[49] = (byte)(1) ;
      }
      if ( ! (0==AV157Listadodehdrs_wcds_38_tfbarsit_to) )
      {
         addWhere(sWhereString, "(T1.BarSit <= ?)");
      }
      else
      {
         GXv_int42[50] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV160Listadodehdrs_wcds_41_tfbaralbmts)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T5.BarAlbMts, 0) >= ?)");
      }
      else
      {
         GXv_int42[51] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV161Listadodehdrs_wcds_42_tfbaralbmts_to)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T5.BarAlbMts, 0) <= ?)");
      }
      else
      {
         GXv_int42[52] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV162Listadodehdrs_wcds_43_tfbaralbkgs)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T5.BarAlbKgs, 0) >= ?)");
      }
      else
      {
         GXv_int42[53] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV163Listadodehdrs_wcds_44_tfbaralbkgs_to)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T5.BarAlbKgs, 0) <= ?)");
      }
      else
      {
         GXv_int42[54] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod" ;
      GXv_Object43[0] = scmdbuf ;
      GXv_Object43[1] = GXv_int42 ;
      return GXv_Object43 ;
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
                  return conditional_H01EF9(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).intValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , ((Number) dynConstraints[10]).shortValue() , ((Number) dynConstraints[11]).shortValue() , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , ((Number) dynConstraints[16]).intValue() , ((Number) dynConstraints[17]).intValue() , (String)dynConstraints[18] , (String)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , (java.math.BigDecimal)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , (java.util.Date)dynConstraints[24] , (java.util.Date)dynConstraints[25] , (java.util.Date)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , ((Number) dynConstraints[29]).byteValue() , ((Number) dynConstraints[30]).byteValue() , (java.math.BigDecimal)dynConstraints[31] , (java.math.BigDecimal)dynConstraints[32] , (java.math.BigDecimal)dynConstraints[33] , (java.math.BigDecimal)dynConstraints[34] , ((Number) dynConstraints[35]).intValue() , (String)dynConstraints[36] , ((Number) dynConstraints[37]).intValue() , ((Number) dynConstraints[38]).byteValue() , (String)dynConstraints[39] , (String)dynConstraints[40] , (String)dynConstraints[41] , ((Number) dynConstraints[42]).shortValue() , (String)dynConstraints[43] , (String)dynConstraints[44] , ((Number) dynConstraints[45]).intValue() , (String)dynConstraints[46] , (java.math.BigDecimal)dynConstraints[47] , (java.math.BigDecimal)dynConstraints[48] , (java.util.Date)dynConstraints[49] , (java.util.Date)dynConstraints[50] , (java.util.Date)dynConstraints[51] , (String)dynConstraints[52] , ((Number) dynConstraints[53]).byteValue() , (java.math.BigDecimal)dynConstraints[54] , (java.math.BigDecimal)dynConstraints[55] , ((Number) dynConstraints[56]).shortValue() , ((Boolean) dynConstraints[57]).booleanValue() , (String)dynConstraints[58] , (String)dynConstraints[59] , (String)dynConstraints[60] , ((Number) dynConstraints[61]).intValue() , (String)dynConstraints[62] , ((Number) dynConstraints[63]).longValue() , (String)dynConstraints[64] , (String)dynConstraints[65] , ((Number) dynConstraints[66]).intValue() , (String)dynConstraints[67] , (String)dynConstraints[68] , ((Number) dynConstraints[69]).intValue() , ((Number) dynConstraints[70]).intValue() , (String)dynConstraints[71] , (String)dynConstraints[72] , ((Number) dynConstraints[73]).longValue() , ((Number) dynConstraints[74]).longValue() , (String)dynConstraints[75] , (String)dynConstraints[76] , (String)dynConstraints[77] , (String)dynConstraints[78] , ((Number) dynConstraints[79]).intValue() , ((Number) dynConstraints[80]).intValue() , (java.util.Date)dynConstraints[81] , (java.util.Date)dynConstraints[82] , (java.util.Date)dynConstraints[83] , (java.util.Date)dynConstraints[84] , ((Number) dynConstraints[85]).byteValue() , ((Number) dynConstraints[86]).byteValue() , (String)dynConstraints[87] , ((Number) dynConstraints[88]).intValue() , (String)dynConstraints[89] , ((Number) dynConstraints[90]).intValue() );
            case 1 :
                  return conditional_H01EF17(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).intValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , ((Number) dynConstraints[10]).shortValue() , ((Number) dynConstraints[11]).shortValue() , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , ((Number) dynConstraints[16]).intValue() , ((Number) dynConstraints[17]).intValue() , (String)dynConstraints[18] , (String)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , (java.math.BigDecimal)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , (java.util.Date)dynConstraints[24] , (java.util.Date)dynConstraints[25] , (java.util.Date)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , ((Number) dynConstraints[29]).byteValue() , ((Number) dynConstraints[30]).byteValue() , (java.math.BigDecimal)dynConstraints[31] , (java.math.BigDecimal)dynConstraints[32] , (java.math.BigDecimal)dynConstraints[33] , (java.math.BigDecimal)dynConstraints[34] , ((Number) dynConstraints[35]).intValue() , (String)dynConstraints[36] , ((Number) dynConstraints[37]).intValue() , ((Number) dynConstraints[38]).byteValue() , (String)dynConstraints[39] , (String)dynConstraints[40] , (String)dynConstraints[41] , ((Number) dynConstraints[42]).shortValue() , (String)dynConstraints[43] , (String)dynConstraints[44] , ((Number) dynConstraints[45]).intValue() , (String)dynConstraints[46] , (java.math.BigDecimal)dynConstraints[47] , (java.math.BigDecimal)dynConstraints[48] , (java.util.Date)dynConstraints[49] , (java.util.Date)dynConstraints[50] , (java.util.Date)dynConstraints[51] , (String)dynConstraints[52] , ((Number) dynConstraints[53]).byteValue() , (java.math.BigDecimal)dynConstraints[54] , (java.math.BigDecimal)dynConstraints[55] , ((Number) dynConstraints[56]).shortValue() , ((Boolean) dynConstraints[57]).booleanValue() , (String)dynConstraints[58] , (String)dynConstraints[59] , (String)dynConstraints[60] , ((Number) dynConstraints[61]).intValue() , (String)dynConstraints[62] , ((Number) dynConstraints[63]).longValue() , (String)dynConstraints[64] , (String)dynConstraints[65] , ((Number) dynConstraints[66]).intValue() , (String)dynConstraints[67] , (String)dynConstraints[68] , ((Number) dynConstraints[69]).intValue() , ((Number) dynConstraints[70]).intValue() , (String)dynConstraints[71] , (String)dynConstraints[72] , ((Number) dynConstraints[73]).longValue() , ((Number) dynConstraints[74]).longValue() , (String)dynConstraints[75] , (String)dynConstraints[76] , (String)dynConstraints[77] , (String)dynConstraints[78] , ((Number) dynConstraints[79]).intValue() , ((Number) dynConstraints[80]).intValue() , (java.util.Date)dynConstraints[81] , (java.util.Date)dynConstraints[82] , (java.util.Date)dynConstraints[83] , (java.util.Date)dynConstraints[84] , ((Number) dynConstraints[85]).byteValue() , ((Number) dynConstraints[86]).byteValue() , (String)dynConstraints[87] , ((Number) dynConstraints[88]).intValue() , (String)dynConstraints[89] , ((Number) dynConstraints[90]).intValue() );
            case 3 :
                  return conditional_H01EF25(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).intValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , ((Number) dynConstraints[10]).shortValue() , ((Number) dynConstraints[11]).shortValue() , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , ((Number) dynConstraints[16]).intValue() , ((Number) dynConstraints[17]).intValue() , (String)dynConstraints[18] , (String)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , (java.math.BigDecimal)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , (java.util.Date)dynConstraints[24] , (java.util.Date)dynConstraints[25] , (java.util.Date)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , ((Number) dynConstraints[29]).byteValue() , ((Number) dynConstraints[30]).byteValue() , (java.math.BigDecimal)dynConstraints[31] , (java.math.BigDecimal)dynConstraints[32] , (java.math.BigDecimal)dynConstraints[33] , (java.math.BigDecimal)dynConstraints[34] , ((Number) dynConstraints[35]).intValue() , (String)dynConstraints[36] , ((Number) dynConstraints[37]).intValue() , ((Number) dynConstraints[38]).byteValue() , (String)dynConstraints[39] , (String)dynConstraints[40] , (String)dynConstraints[41] , ((Number) dynConstraints[42]).shortValue() , (String)dynConstraints[43] , (String)dynConstraints[44] , ((Number) dynConstraints[45]).intValue() , (String)dynConstraints[46] , (java.math.BigDecimal)dynConstraints[47] , (java.math.BigDecimal)dynConstraints[48] , (java.util.Date)dynConstraints[49] , (java.util.Date)dynConstraints[50] , (java.util.Date)dynConstraints[51] , (String)dynConstraints[52] , ((Number) dynConstraints[53]).byteValue() , (java.math.BigDecimal)dynConstraints[54] , (java.math.BigDecimal)dynConstraints[55] , (String)dynConstraints[56] , (String)dynConstraints[57] , (String)dynConstraints[58] , ((Number) dynConstraints[59]).intValue() , (String)dynConstraints[60] , ((Number) dynConstraints[61]).longValue() , (String)dynConstraints[62] , (String)dynConstraints[63] , ((Number) dynConstraints[64]).intValue() , (String)dynConstraints[65] , (String)dynConstraints[66] , ((Number) dynConstraints[67]).intValue() , ((Number) dynConstraints[68]).intValue() , (String)dynConstraints[69] , (String)dynConstraints[70] , ((Number) dynConstraints[71]).longValue() , ((Number) dynConstraints[72]).longValue() , (String)dynConstraints[73] , (String)dynConstraints[74] , (String)dynConstraints[75] , (String)dynConstraints[76] , ((Number) dynConstraints[77]).intValue() , ((Number) dynConstraints[78]).intValue() , (java.util.Date)dynConstraints[79] , (java.util.Date)dynConstraints[80] , (java.util.Date)dynConstraints[81] , (java.util.Date)dynConstraints[82] , ((Number) dynConstraints[83]).intValue() , ((Number) dynConstraints[84]).intValue() , ((Number) dynConstraints[85]).byteValue() , ((Number) dynConstraints[86]).byteValue() , (String)dynConstraints[87] , (String)dynConstraints[88] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H01EF9", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01EF17", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01EF19", "SELECT COALESCE( T1.BarNorma, ' ') AS BarNorma FROM (SELECT MIN(DisNormID) AS BarNorma FROM TXPDISNOR WHERE EmprCod = ? and DisCod = ? ) T1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01EF25", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((String[]) buf[2])[0] = rslt.getString(3, 13);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 60);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(8, 4);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getVarchar(9);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(10, 10);
               ((java.util.Date[]) buf[13])[0] = rslt.getGXDate(11);
               ((String[]) buf[14])[0] = rslt.getString(12, 1);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((byte[]) buf[16])[0] = rslt.getByte(13);
               ((String[]) buf[17])[0] = rslt.getString(14, 6);
               ((java.util.Date[]) buf[18])[0] = rslt.getGXDate(15);
               ((java.util.Date[]) buf[19])[0] = rslt.getGXDate(16);
               ((java.util.Date[]) buf[20])[0] = rslt.getGXDate(17);
               ((String[]) buf[21])[0] = rslt.getString(18, 13);
               ((int[]) buf[22])[0] = rslt.getInt(19);
               ((String[]) buf[23])[0] = rslt.getString(20, 13);
               ((String[]) buf[24])[0] = rslt.getString(21, 30);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((short[]) buf[26])[0] = rslt.getShort(22);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((String[]) buf[28])[0] = rslt.getString(23, 26);
               ((String[]) buf[29])[0] = rslt.getString(24, 16);
               ((String[]) buf[30])[0] = rslt.getString(25, 11);
               ((String[]) buf[31])[0] = rslt.getString(26, 30);
               ((int[]) buf[32])[0] = rslt.getInt(27);
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((byte[]) buf[34])[0] = rslt.getByte(28);
               ((boolean[]) buf[35])[0] = rslt.wasNull();
               ((short[]) buf[36])[0] = rslt.getShort(29);
               ((boolean[]) buf[37])[0] = rslt.wasNull();
               ((String[]) buf[38])[0] = rslt.getString(30, 4);
               ((boolean[]) buf[39])[0] = rslt.wasNull();
               ((byte[]) buf[40])[0] = rslt.getByte(31);
               ((boolean[]) buf[41])[0] = rslt.wasNull();
               ((String[]) buf[42])[0] = rslt.getString(32, 20);
               ((boolean[]) buf[43])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[44])[0] = rslt.getBigDecimal(33,2);
               ((java.math.BigDecimal[]) buf[45])[0] = rslt.getBigDecimal(34,2);
               ((String[]) buf[46])[0] = rslt.getString(35, 8);
               ((boolean[]) buf[47])[0] = rslt.wasNull();
               ((String[]) buf[48])[0] = rslt.getString(36, 8);
               ((String[]) buf[49])[0] = rslt.getString(37, 20);
               ((byte[]) buf[50])[0] = rslt.getByte(38);
               ((short[]) buf[51])[0] = rslt.getShort(39);
               ((String[]) buf[52])[0] = rslt.getString(40, 1);
               ((int[]) buf[53])[0] = rslt.getInt(41);
               ((int[]) buf[54])[0] = rslt.getInt(42);
               ((String[]) buf[55])[0] = rslt.getString(43, 1);
               ((byte[]) buf[56])[0] = rslt.getByte(44);
               ((int[]) buf[57])[0] = rslt.getInt(45);
               ((String[]) buf[58])[0] = rslt.getString(46, 3);
               ((java.math.BigDecimal[]) buf[59])[0] = rslt.getBigDecimal(47,2);
               ((java.math.BigDecimal[]) buf[60])[0] = rslt.getBigDecimal(48,2);
               ((short[]) buf[61])[0] = rslt.getShort(49);
               ((java.math.BigDecimal[]) buf[62])[0] = rslt.getBigDecimal(50,2);
               return;
            case 1 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((String[]) buf[2])[0] = rslt.getString(3, 13);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 60);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(8, 4);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getVarchar(9);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(10, 10);
               ((java.util.Date[]) buf[13])[0] = rslt.getGXDate(11);
               ((String[]) buf[14])[0] = rslt.getString(12, 1);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((byte[]) buf[16])[0] = rslt.getByte(13);
               ((String[]) buf[17])[0] = rslt.getString(14, 6);
               ((java.util.Date[]) buf[18])[0] = rslt.getGXDate(15);
               ((java.util.Date[]) buf[19])[0] = rslt.getGXDate(16);
               ((java.util.Date[]) buf[20])[0] = rslt.getGXDate(17);
               ((String[]) buf[21])[0] = rslt.getString(18, 13);
               ((int[]) buf[22])[0] = rslt.getInt(19);
               ((String[]) buf[23])[0] = rslt.getString(20, 13);
               ((String[]) buf[24])[0] = rslt.getString(21, 30);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((short[]) buf[26])[0] = rslt.getShort(22);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((String[]) buf[28])[0] = rslt.getString(23, 26);
               ((String[]) buf[29])[0] = rslt.getString(24, 16);
               ((String[]) buf[30])[0] = rslt.getString(25, 11);
               ((String[]) buf[31])[0] = rslt.getString(26, 30);
               ((int[]) buf[32])[0] = rslt.getInt(27);
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((byte[]) buf[34])[0] = rslt.getByte(28);
               ((boolean[]) buf[35])[0] = rslt.wasNull();
               ((short[]) buf[36])[0] = rslt.getShort(29);
               ((boolean[]) buf[37])[0] = rslt.wasNull();
               ((String[]) buf[38])[0] = rslt.getString(30, 4);
               ((boolean[]) buf[39])[0] = rslt.wasNull();
               ((byte[]) buf[40])[0] = rslt.getByte(31);
               ((boolean[]) buf[41])[0] = rslt.wasNull();
               ((String[]) buf[42])[0] = rslt.getString(32, 20);
               ((boolean[]) buf[43])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[44])[0] = rslt.getBigDecimal(33,2);
               ((java.math.BigDecimal[]) buf[45])[0] = rslt.getBigDecimal(34,2);
               ((String[]) buf[46])[0] = rslt.getString(35, 8);
               ((boolean[]) buf[47])[0] = rslt.wasNull();
               ((String[]) buf[48])[0] = rslt.getString(36, 8);
               ((String[]) buf[49])[0] = rslt.getString(37, 20);
               ((byte[]) buf[50])[0] = rslt.getByte(38);
               ((short[]) buf[51])[0] = rslt.getShort(39);
               ((String[]) buf[52])[0] = rslt.getString(40, 1);
               ((int[]) buf[53])[0] = rslt.getInt(41);
               ((int[]) buf[54])[0] = rslt.getInt(42);
               ((String[]) buf[55])[0] = rslt.getString(43, 1);
               ((byte[]) buf[56])[0] = rslt.getByte(44);
               ((int[]) buf[57])[0] = rslt.getInt(45);
               ((String[]) buf[58])[0] = rslt.getString(46, 3);
               ((java.math.BigDecimal[]) buf[59])[0] = rslt.getBigDecimal(47,2);
               ((java.math.BigDecimal[]) buf[60])[0] = rslt.getBigDecimal(48,2);
               ((short[]) buf[61])[0] = rslt.getShort(49);
               ((java.math.BigDecimal[]) buf[62])[0] = rslt.getBigDecimal(50,2);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 4);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 3 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(5);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(6);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDate(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 13);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 13);
               ((String[]) buf[10])[0] = rslt.getString(11, 30);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((short[]) buf[12])[0] = rslt.getShort(12);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(13, 26);
               ((String[]) buf[15])[0] = rslt.getString(14, 16);
               ((String[]) buf[16])[0] = rslt.getString(15, 11);
               ((String[]) buf[17])[0] = rslt.getString(16, 30);
               ((int[]) buf[18])[0] = rslt.getInt(17);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(18, 20);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[22])[0] = rslt.getBigDecimal(19,2);
               ((java.math.BigDecimal[]) buf[23])[0] = rslt.getBigDecimal(20,2);
               ((String[]) buf[24])[0] = rslt.getString(21, 8);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((short[]) buf[26])[0] = rslt.getShort(22);
               ((java.math.BigDecimal[]) buf[27])[0] = rslt.getBigDecimal(23,2);
               ((java.math.BigDecimal[]) buf[28])[0] = rslt.getBigDecimal(24,2);
               ((java.math.BigDecimal[]) buf[29])[0] = rslt.getBigDecimal(25,2);
               ((String[]) buf[30])[0] = rslt.getString(26, 8);
               ((String[]) buf[31])[0] = rslt.getString(27, 20);
               ((short[]) buf[32])[0] = rslt.getShort(28);
               ((String[]) buf[33])[0] = rslt.getString(29, 1);
               ((int[]) buf[34])[0] = rslt.getInt(30);
               ((int[]) buf[35])[0] = rslt.getInt(31);
               ((String[]) buf[36])[0] = rslt.getString(32, 1);
               ((byte[]) buf[37])[0] = rslt.getByte(33);
               ((int[]) buf[38])[0] = rslt.getInt(34);
               ((String[]) buf[39])[0] = rslt.getString(35, 3);
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
                  stmt.setString(sIdx, (String)parms[58], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 3);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[60]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 3);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[62]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 8);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 8);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 8);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 8);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 8);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 20);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 20);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 20);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 20);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 20);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[73]);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[74]);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[75]);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[76]);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[77]);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[78]).byteValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[79]).byteValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[80]).intValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[81]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[82]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[83], 30);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[84], 30);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[85], 11);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[86], 11);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[87], 16);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[88], 16);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[89], 26);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[90], 26);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[91]).shortValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[92]).shortValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[93], 30);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[94], 30);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[95], 13);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[96], 13);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[97]).intValue());
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[98]).intValue());
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[99], 13);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[100], 13);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[101], 2);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[102], 2);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[103], 2);
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[104], 2);
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[105]);
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[106]);
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[107]);
               }
               if ( ((Number) parms[50]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[108], 6);
               }
               if ( ((Number) parms[51]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[109], 6);
               }
               if ( ((Number) parms[52]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[110]).byteValue());
               }
               if ( ((Number) parms[53]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[111]).byteValue());
               }
               if ( ((Number) parms[54]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[112], 2);
               }
               if ( ((Number) parms[55]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[113], 2);
               }
               if ( ((Number) parms[56]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[114], 2);
               }
               if ( ((Number) parms[57]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[115], 2);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 3);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[60]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 3);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[62]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 8);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 8);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 8);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 8);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 8);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 20);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 20);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 20);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 20);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 20);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[73]);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[74]);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[75]);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[76]);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[77]);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[78]).byteValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[79]).byteValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[80]).intValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[81]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[82]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[83], 30);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[84], 30);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[85], 11);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[86], 11);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[87], 16);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[88], 16);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[89], 26);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[90], 26);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[91]).shortValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[92]).shortValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[93], 30);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[94], 30);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[95], 13);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[96], 13);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[97]).intValue());
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[98]).intValue());
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[99], 13);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[100], 13);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[101], 2);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[102], 2);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[103], 2);
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[104], 2);
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[105]);
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[106]);
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[107]);
               }
               if ( ((Number) parms[50]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[108], 6);
               }
               if ( ((Number) parms[51]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[109], 6);
               }
               if ( ((Number) parms[52]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[110]).byteValue());
               }
               if ( ((Number) parms[53]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[111]).byteValue());
               }
               if ( ((Number) parms[54]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[112], 2);
               }
               if ( ((Number) parms[55]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[113], 2);
               }
               if ( ((Number) parms[56]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[114], 2);
               }
               if ( ((Number) parms[57]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[115], 2);
               }
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 3 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 8);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 8);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 8);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 8);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 8);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 20);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 20);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 20);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 20);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 20);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[66]);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[67]);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[68]);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[69]);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[70]);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[71]).intValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[72]).intValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[73]).byteValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[74]).byteValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[75]).intValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[76]).intValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 30);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 30);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[79], 11);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[80], 11);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[81], 16);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[82], 16);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[83], 26);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[84], 26);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[85]).shortValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[86]).shortValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[87], 30);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[88], 30);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[89], 13);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[90], 13);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[91]).intValue());
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[92]).intValue());
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[93], 13);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[94], 13);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[95], 2);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[96], 2);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[97], 2);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[98], 2);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[99]);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[100]);
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[101]);
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[102], 6);
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[103], 6);
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[104]).byteValue());
               }
               if ( ((Number) parms[50]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[105]).byteValue());
               }
               if ( ((Number) parms[51]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[106], 2);
               }
               if ( ((Number) parms[52]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[107], 2);
               }
               if ( ((Number) parms[53]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[108], 2);
               }
               if ( ((Number) parms[54]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[109], 2);
               }
               return;
      }
   }

}

