package app.documentotransporteproduccion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class documentodetransporteproduccion_7_impl extends GXWebComponent
{
   public documentodetransporteproduccion_7_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public documentodetransporteproduccion_7_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( documentodetransporteproduccion_7_impl.class ));
   }

   public documentodetransporteproduccion_7_impl( int remoteHandle ,
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
      cmbavGridactiongroup1 = new HTMLChoice();
      cmbAlbProVal = new HTMLChoice();
      chkBarTipCor = UIFactory.getCheckbox(this);
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
               AV53Emprcod = httpContext.GetPar( "Emprcod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV53Emprcod", AV53Emprcod);
               AV54AlbProcod = GXutil.lval( httpContext.GetPar( "AlbProcod")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV54AlbProcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV54AlbProcod), 10, 0));
               AV62Guiremcli = (int)(GXutil.lval( httpContext.GetPar( "Guiremcli"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV62Guiremcli", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV62Guiremcli), 6, 0));
               AV63GuiRemCln = httpContext.GetPar( "GuiRemCln") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV63GuiRemCln", AV63GuiRemCln);
               AV64AlbProFch = localUtil.parseDateParm( httpContext.GetPar( "AlbProFch")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV64AlbProFch", localUtil.format(AV64AlbProFch, "99/99/99"));
               AV65AlbSec = httpContext.GetPar( "AlbSec") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV65AlbSec", AV65AlbSec);
               AV66AlbPropri = httpContext.GetPar( "AlbPropri") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV66AlbPropri", AV66AlbPropri);
               AV67AlbEnvFtp = (byte)(GXutil.lval( httpContext.GetPar( "AlbEnvFtp"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV67AlbEnvFtp", GXutil.str( AV67AlbEnvFtp, 1, 0));
               AV68AlbLic = httpContext.GetPar( "AlbLic") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV68AlbLic", AV68AlbLic);
               Gx_mode = httpContext.GetPar( "Mode") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "Gx_mode", Gx_mode);
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,AV53Emprcod,Long.valueOf(AV54AlbProcod),Integer.valueOf(AV62Guiremcli),AV63GuiRemCln,AV64AlbProFch,AV65AlbSec,AV66AlbPropri,Byte.valueOf(AV67AlbEnvFtp),AV68AlbLic,Gx_mode});
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
      nRC_GXsfl_15 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_15"))) ;
      nGXsfl_15_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_15_idx"))) ;
      sGXsfl_15_idx = httpContext.GetPar( "sGXsfl_15_idx") ;
      sPrefix = httpContext.GetPar( "sPrefix") ;
      edtTubCod_Visible = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtTubCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTubCod_Visible), 5, 0), !bGXsfl_15_Refreshing);
      edtBarAlbTub_Visible = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarAlbTub_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAlbTub_Visible), 5, 0), !bGXsfl_15_Refreshing);
      edtPlasCod_Visible = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtPlasCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPlasCod_Visible), 5, 0), !bGXsfl_15_Refreshing);
      edtBarAlbPlas_Visible = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarAlbPlas_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAlbPlas_Visible), 5, 0), !bGXsfl_15_Refreshing);
      chkBarTipCor.setVisible( (int)(GXutil.lval( httpContext.GetNextPar( ))) );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, chkBarTipCor.getInternalname(), "Visible", GXutil.ltrimstr( chkBarTipCor.getVisible(), 5, 0), !bGXsfl_15_Refreshing);
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
      AV53Emprcod = httpContext.GetPar( "Emprcod") ;
      AV54AlbProcod = GXutil.lval( httpContext.GetPar( "AlbProcod")) ;
      AV15TFBarNHdr = httpContext.GetPar( "TFBarNHdr") ;
      AV16TFBarNHdr_Sel = httpContext.GetPar( "TFBarNHdr_Sel") ;
      AV69TFAlbEncCli = httpContext.GetPar( "TFAlbEncCli") ;
      AV70TFAlbEncCli_Sel = httpContext.GetPar( "TFAlbEncCli_Sel") ;
      AV17TFAlbSer = httpContext.GetPar( "TFAlbSer") ;
      AV18TFAlbSer_Sel = httpContext.GetPar( "TFAlbSer_Sel") ;
      AV19TFAlbSerD = httpContext.GetPar( "TFAlbSerD") ;
      AV20TFAlbSerD_Sel = httpContext.GetPar( "TFAlbSerD_Sel") ;
      AV21TFAlbColNom = httpContext.GetPar( "TFAlbColNom") ;
      AV22TFAlbColNom_Sel = httpContext.GetPar( "TFAlbColNom_Sel") ;
      AV23TFAlbColNum = (int)(GXutil.lval( httpContext.GetPar( "TFAlbColNum"))) ;
      AV24TFAlbColNum_To = (int)(GXutil.lval( httpContext.GetPar( "TFAlbColNum_To"))) ;
      AV71TFAlbTipCol = (byte)(GXutil.lval( httpContext.GetPar( "TFAlbTipCol"))) ;
      AV72TFAlbTipCol_To = (byte)(GXutil.lval( httpContext.GetPar( "TFAlbTipCol_To"))) ;
      AV25TFAlbNomCli = httpContext.GetPar( "TFAlbNomCli") ;
      AV26TFAlbNomCli_Sel = httpContext.GetPar( "TFAlbNomCli_Sel") ;
      AV27TFBarAlbKgmE = CommonUtil.decimalVal( httpContext.GetPar( "TFBarAlbKgmE"), ".") ;
      AV28TFBarAlbKgmE_To = CommonUtil.decimalVal( httpContext.GetPar( "TFBarAlbKgmE_To"), ".") ;
      AV29TFAlbHdrAnc = (short)(GXutil.lval( httpContext.GetPar( "TFAlbHdrAnc"))) ;
      AV30TFAlbHdrAnc_To = (short)(GXutil.lval( httpContext.GetPar( "TFAlbHdrAnc_To"))) ;
      AV31TFAlbHdrgm2 = (short)(GXutil.lval( httpContext.GetPar( "TFAlbHdrgm2"))) ;
      AV32TFAlbHdrgm2_To = (short)(GXutil.lval( httpContext.GetPar( "TFAlbHdrgm2_To"))) ;
      AV33TFBarAlbMtrE = CommonUtil.decimalVal( httpContext.GetPar( "TFBarAlbMtrE"), ".") ;
      AV34TFBarAlbMtrE_To = CommonUtil.decimalVal( httpContext.GetPar( "TFBarAlbMtrE_To"), ".") ;
      AV35TFBarAlbPie = (int)(GXutil.lval( httpContext.GetPar( "TFBarAlbPie"))) ;
      AV36TFBarAlbPie_To = (int)(GXutil.lval( httpContext.GetPar( "TFBarAlbPie_To"))) ;
      AV37TFTubCod = (short)(GXutil.lval( httpContext.GetPar( "TFTubCod"))) ;
      AV38TFTubCod_To = (short)(GXutil.lval( httpContext.GetPar( "TFTubCod_To"))) ;
      AV39TFBarAlbTub = (int)(GXutil.lval( httpContext.GetPar( "TFBarAlbTub"))) ;
      AV40TFBarAlbTub_To = (int)(GXutil.lval( httpContext.GetPar( "TFBarAlbTub_To"))) ;
      AV41TFPlasCod = (short)(GXutil.lval( httpContext.GetPar( "TFPlasCod"))) ;
      AV42TFPlasCod_To = (short)(GXutil.lval( httpContext.GetPar( "TFPlasCod_To"))) ;
      AV43TFBarAlbPlas = (short)(GXutil.lval( httpContext.GetPar( "TFBarAlbPlas"))) ;
      AV44TFBarAlbPlas_To = (short)(GXutil.lval( httpContext.GetPar( "TFBarAlbPlas_To"))) ;
      AV45TFAlbHdrObs = httpContext.GetPar( "TFAlbHdrObs") ;
      AV46TFAlbHdrObs_Sel = httpContext.GetPar( "TFAlbHdrObs_Sel") ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV48TFAlbProVal_Sels);
      AV59TFBarSit = (byte)(GXutil.lval( httpContext.GetPar( "TFBarSit"))) ;
      AV60TFBarSit_To = (byte)(GXutil.lval( httpContext.GetPar( "TFBarSit_To"))) ;
      AV73TFBarTipCor_Sel = httpContext.GetPar( "TFBarTipCor_Sel") ;
      AV81Pgmname = httpContext.GetPar( "Pgmname") ;
      AV12OrderedBy = (short)(GXutil.lval( httpContext.GetPar( "OrderedBy"))) ;
      AV13OrderedDsc = GXutil.strtobool( httpContext.GetPar( "OrderedDsc")) ;
      AV62Guiremcli = (int)(GXutil.lval( httpContext.GetPar( "Guiremcli"))) ;
      AV63GuiRemCln = httpContext.GetPar( "GuiRemCln") ;
      AV64AlbProFch = localUtil.parseDateParm( httpContext.GetPar( "AlbProFch")) ;
      AV65AlbSec = httpContext.GetPar( "AlbSec") ;
      AV66AlbPropri = httpContext.GetPar( "AlbPropri") ;
      AV67AlbEnvFtp = (byte)(GXutil.lval( httpContext.GetPar( "AlbEnvFtp"))) ;
      AV68AlbLic = httpContext.GetPar( "AlbLic") ;
      Gx_mode = httpContext.GetPar( "Mode") ;
      edtTubCod_Visible = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtTubCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTubCod_Visible), 5, 0), !bGXsfl_15_Refreshing);
      edtBarAlbTub_Visible = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarAlbTub_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAlbTub_Visible), 5, 0), !bGXsfl_15_Refreshing);
      edtPlasCod_Visible = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtPlasCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPlasCod_Visible), 5, 0), !bGXsfl_15_Refreshing);
      edtBarAlbPlas_Visible = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarAlbPlas_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAlbPlas_Visible), 5, 0), !bGXsfl_15_Refreshing);
      chkBarTipCor.setVisible( (int)(GXutil.lval( httpContext.GetNextPar( ))) );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, chkBarTipCor.getInternalname(), "Visible", GXutil.ltrimstr( chkBarTipCor.getVisible(), 5, 0), !bGXsfl_15_Refreshing);
      AV74Moda21 = (short)(GXutil.lval( httpContext.GetPar( "Moda21"))) ;
      AV76Mensaje = httpContext.GetPar( "Mensaje") ;
      A396EmprCod = httpContext.GetPar( "EmprCod") ;
      sPrefix = httpContext.GetPar( "sPrefix") ;
      init_default_properties( ) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV53Emprcod, AV54AlbProcod, AV15TFBarNHdr, AV16TFBarNHdr_Sel, AV69TFAlbEncCli, AV70TFAlbEncCli_Sel, AV17TFAlbSer, AV18TFAlbSer_Sel, AV19TFAlbSerD, AV20TFAlbSerD_Sel, AV21TFAlbColNom, AV22TFAlbColNom_Sel, AV23TFAlbColNum, AV24TFAlbColNum_To, AV71TFAlbTipCol, AV72TFAlbTipCol_To, AV25TFAlbNomCli, AV26TFAlbNomCli_Sel, AV27TFBarAlbKgmE, AV28TFBarAlbKgmE_To, AV29TFAlbHdrAnc, AV30TFAlbHdrAnc_To, AV31TFAlbHdrgm2, AV32TFAlbHdrgm2_To, AV33TFBarAlbMtrE, AV34TFBarAlbMtrE_To, AV35TFBarAlbPie, AV36TFBarAlbPie_To, AV37TFTubCod, AV38TFTubCod_To, AV39TFBarAlbTub, AV40TFBarAlbTub_To, AV41TFPlasCod, AV42TFPlasCod_To, AV43TFBarAlbPlas, AV44TFBarAlbPlas_To, AV45TFAlbHdrObs, AV46TFAlbHdrObs_Sel, AV48TFAlbProVal_Sels, AV59TFBarSit, AV60TFBarSit_To, AV73TFBarTipCor_Sel, AV81Pgmname, AV12OrderedBy, AV13OrderedDsc, AV62Guiremcli, AV63GuiRemCln, AV64AlbProFch, AV65AlbSec, AV66AlbPropri, AV67AlbEnvFtp, AV68AlbLic, Gx_mode, AV74Moda21, AV76Mensaje, A396EmprCod, sPrefix) ;
      addString( httpContext.getJSONResponse( )) ;
      /* End function gxgrGrid_refresh_invoke */
   }

   public void webExecute( )
   {
      initweb( ) ;
      if ( ! isAjaxCallMode( ) )
      {
         pa2522( ) ;
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
         httpContext.writeValue( httpContext.getMessage( " Detalle de Fases p/produccion", "")) ;
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
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
         httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.documentotransporteproduccion.documentodetransporteproduccion_7", new String[] {GXutil.URLEncode(GXutil.rtrim(AV53Emprcod)),GXutil.URLEncode(GXutil.ltrimstr(AV54AlbProcod,10,0)),GXutil.URLEncode(GXutil.ltrimstr(AV62Guiremcli,6,0)),GXutil.URLEncode(GXutil.rtrim(AV63GuiRemCln)),GXutil.URLEncode(GXutil.formatDateParm(AV64AlbProFch)),GXutil.URLEncode(GXutil.rtrim(AV65AlbSec)),GXutil.URLEncode(GXutil.rtrim(AV66AlbPropri)),GXutil.URLEncode(GXutil.ltrimstr(AV67AlbEnvFtp,1,0)),GXutil.URLEncode(GXutil.rtrim(AV68AlbLic)),GXutil.URLEncode(GXutil.rtrim(Gx_mode))}, new String[] {"Emprcod","AlbProcod","Guiremcli","GuiRemCln","AlbProFch","AlbSec","AlbPropri","AlbEnvFtp","AlbLic","Gx_mode"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vMODA21", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV74Moda21), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_EMPRCOD", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vMENSAJE", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV76Mensaje, ""))));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"DocumentodeTransporteProduccion_7");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV81Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("documentotransporteproduccion\\documentodetransporteproduccion_7:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"nRC_GXsfl_15", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_15, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGRIDCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV51GridCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGRIDPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV52GridPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vDDO_TITLESETTINGSICONS", AV49DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vDDO_TITLESETTINGSICONS", AV49DDO_TitleSettingsIcons);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV53Emprcod", GXutil.rtrim( wcpOAV53Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV54AlbProcod", GXutil.ltrim( localUtil.ntoc( wcpOAV54AlbProcod, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV62Guiremcli", GXutil.ltrim( localUtil.ntoc( wcpOAV62Guiremcli, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV63GuiRemCln", GXutil.rtrim( wcpOAV63GuiRemCln));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV64AlbProFch", localUtil.dtoc( wcpOAV64AlbProFch, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV65AlbSec", GXutil.rtrim( wcpOAV65AlbSec));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV66AlbPropri", GXutil.rtrim( wcpOAV66AlbPropri));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV67AlbEnvFtp", GXutil.ltrim( localUtil.ntoc( wcpOAV67AlbEnvFtp, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV68AlbLic", GXutil.rtrim( wcpOAV68AlbLic));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOGx_mode", GXutil.rtrim( wcpOGx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARNHDR", GXutil.rtrim( AV15TFBarNHdr));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARNHDR_SEL", GXutil.rtrim( AV16TFBarNHdr_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFALBENCCLI", GXutil.rtrim( AV69TFAlbEncCli));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFALBENCCLI_SEL", GXutil.rtrim( AV70TFAlbEncCli_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFALBSER", GXutil.rtrim( AV17TFAlbSer));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFALBSER_SEL", GXutil.rtrim( AV18TFAlbSer_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFALBSERD", GXutil.rtrim( AV19TFAlbSerD));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFALBSERD_SEL", GXutil.rtrim( AV20TFAlbSerD_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFALBCOLNOM", GXutil.rtrim( AV21TFAlbColNom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFALBCOLNOM_SEL", GXutil.rtrim( AV22TFAlbColNom_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFALBCOLNUM", GXutil.ltrim( localUtil.ntoc( AV23TFAlbColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFALBCOLNUM_TO", GXutil.ltrim( localUtil.ntoc( AV24TFAlbColNum_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFALBTIPCOL", GXutil.ltrim( localUtil.ntoc( AV71TFAlbTipCol, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFALBTIPCOL_TO", GXutil.ltrim( localUtil.ntoc( AV72TFAlbTipCol_To, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFALBNOMCLI", GXutil.rtrim( AV25TFAlbNomCli));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFALBNOMCLI_SEL", GXutil.rtrim( AV26TFAlbNomCli_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARALBKGME", GXutil.ltrim( localUtil.ntoc( AV27TFBarAlbKgmE, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARALBKGME_TO", GXutil.ltrim( localUtil.ntoc( AV28TFBarAlbKgmE_To, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFALBHDRANC", GXutil.ltrim( localUtil.ntoc( AV29TFAlbHdrAnc, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFALBHDRANC_TO", GXutil.ltrim( localUtil.ntoc( AV30TFAlbHdrAnc_To, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFALBHDRGM2", GXutil.ltrim( localUtil.ntoc( AV31TFAlbHdrgm2, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFALBHDRGM2_TO", GXutil.ltrim( localUtil.ntoc( AV32TFAlbHdrgm2_To, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARALBMTRE", GXutil.ltrim( localUtil.ntoc( AV33TFBarAlbMtrE, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARALBMTRE_TO", GXutil.ltrim( localUtil.ntoc( AV34TFBarAlbMtrE_To, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARALBPIE", GXutil.ltrim( localUtil.ntoc( AV35TFBarAlbPie, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARALBPIE_TO", GXutil.ltrim( localUtil.ntoc( AV36TFBarAlbPie_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFTUBCOD", GXutil.ltrim( localUtil.ntoc( AV37TFTubCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFTUBCOD_TO", GXutil.ltrim( localUtil.ntoc( AV38TFTubCod_To, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARALBTUB", GXutil.ltrim( localUtil.ntoc( AV39TFBarAlbTub, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARALBTUB_TO", GXutil.ltrim( localUtil.ntoc( AV40TFBarAlbTub_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPLASCOD", GXutil.ltrim( localUtil.ntoc( AV41TFPlasCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPLASCOD_TO", GXutil.ltrim( localUtil.ntoc( AV42TFPlasCod_To, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARALBPLAS", GXutil.ltrim( localUtil.ntoc( AV43TFBarAlbPlas, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARALBPLAS_TO", GXutil.ltrim( localUtil.ntoc( AV44TFBarAlbPlas_To, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFALBHDROBS", GXutil.rtrim( AV45TFAlbHdrObs));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFALBHDROBS_SEL", GXutil.rtrim( AV46TFAlbHdrObs_Sel));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vTFALBPROVAL_SELS", AV48TFAlbProVal_Sels);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vTFALBPROVAL_SELS", AV48TFAlbProVal_Sels);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARSIT", GXutil.ltrim( localUtil.ntoc( AV59TFBarSit, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARSIT_TO", GXutil.ltrim( localUtil.ntoc( AV60TFBarSit_To, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARTIPCOR_SEL", GXutil.rtrim( AV73TFBarTipCor_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vORDEREDBY", GXutil.ltrim( localUtil.ntoc( AV12OrderedBy, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, sPrefix+"vORDEREDDSC", AV13OrderedDsc);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vEMPRCOD", GXutil.rtrim( AV53Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vALBPROCOD", GXutil.ltrim( localUtil.ntoc( AV54AlbProcod, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGUIREMCLI", GXutil.ltrim( localUtil.ntoc( AV62Guiremcli, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGUIREMCLN", GXutil.rtrim( AV63GuiRemCln));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vALBPROFCH", localUtil.dtoc( AV64AlbProFch, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vALBSEC", GXutil.rtrim( AV65AlbSec));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vALBPROPRI", GXutil.rtrim( AV66AlbPropri));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vALBENVFTP", GXutil.ltrim( localUtil.ntoc( AV67AlbEnvFtp, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vALBLIC", GXutil.rtrim( AV68AlbLic));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMODE", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMODA21", GXutil.ltrim( localUtil.ntoc( AV74Moda21, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vMODA21", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV74Moda21), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_EMPRCOD", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMENSAJE", AV76Mensaje);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vMENSAJE", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV76Mensaje, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"ALBPROCOD", GXutil.ltrim( localUtil.ntoc( A30AlbProCod, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vALBCONTLIN", GXutil.ltrim( localUtil.ntoc( AV58AlbContLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Sortedstatus", GXutil.rtrim( Ddo_grid_Sortedstatus));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Includefilter", GXutil.rtrim( Ddo_grid_Includefilter));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filtertype", GXutil.rtrim( Ddo_grid_Filtertype));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filterisrange", GXutil.rtrim( Ddo_grid_Filterisrange));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Includedatalist", GXutil.rtrim( Ddo_grid_Includedatalist));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Datalisttype", GXutil.rtrim( Ddo_grid_Datalisttype));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Allowmultipleselection", GXutil.rtrim( Ddo_grid_Allowmultipleselection));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Datalistfixedvalues", GXutil.rtrim( Ddo_grid_Datalistfixedvalues));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Datalistproc", GXutil.rtrim( Ddo_grid_Datalistproc));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Gridinternalname", GXutil.rtrim( Grid_empowerer_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Hastitlesettings", GXutil.booltostr( Grid_empowerer_Hastitlesettings));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Activeeventkey", GXutil.rtrim( Ddo_grid_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Selectedvalue_get", GXutil.rtrim( Ddo_grid_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtextto_get", GXutil.rtrim( Ddo_grid_Filteredtextto_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtext_get", GXutil.rtrim( Ddo_grid_Filteredtext_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Selectedcolumn", GXutil.rtrim( Ddo_grid_Selectedcolumn));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"TUBCOD_Visible", GXutil.ltrim( localUtil.ntoc( edtTubCod_Visible, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"BARALBTUB_Visible", GXutil.ltrim( localUtil.ntoc( edtBarAlbTub_Visible, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"PLASCOD_Visible", GXutil.ltrim( localUtil.ntoc( edtPlasCod_Visible, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"BARALBPLAS_Visible", GXutil.ltrim( localUtil.ntoc( edtBarAlbPlas_Visible, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"BARTIPCOR_Visible", GXutil.ltrim( localUtil.ntoc( chkBarTipCor.getVisible(), (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Activeeventkey", GXutil.rtrim( Ddo_grid_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Selectedvalue_get", GXutil.rtrim( Ddo_grid_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtextto_get", GXutil.rtrim( Ddo_grid_Filteredtextto_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtext_get", GXutil.rtrim( Ddo_grid_Filteredtext_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Selectedcolumn", GXutil.rtrim( Ddo_grid_Selectedcolumn));
   }

   public void renderHtmlCloseForm2522( )
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
      return "DocumentoTransporteProduccion.DocumentodeTransporteProduccion_7" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( " Detalle de Fases p/produccion", "") ;
   }

   public void wb2520( )
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
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "app.documentotransporteproduccion.documentodetransporteproduccion_7");
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
            httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
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
         startgridcontrol15( ) ;
      }
      if ( wbEnd == 15 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_15 = (int)(nGXsfl_15_idx-1) ;
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
         ucGridpaginationbar.setProperty("CurrentPage", AV51GridCurrentPage);
         ucGridpaginationbar.setProperty("PageCount", AV52GridPageCount);
         ucGridpaginationbar.render(context, "dvelop.dvpaginationbar", Gridpaginationbar_Internalname, sPrefix+"GRIDPAGINATIONBARContainer");
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV81Pgmname), GXutil.rtrim( localUtil.format( AV81Pgmname, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_7.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "Right", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucDatamonjs.render(context, "datamonjs", Datamonjs_Internalname, sPrefix+"DATAMONJSContainer");
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
         ucDdo_grid.setProperty("IncludeFilter", Ddo_grid_Includefilter);
         ucDdo_grid.setProperty("FilterType", Ddo_grid_Filtertype);
         ucDdo_grid.setProperty("FilterIsRange", Ddo_grid_Filterisrange);
         ucDdo_grid.setProperty("IncludeDataList", Ddo_grid_Includedatalist);
         ucDdo_grid.setProperty("DataListType", Ddo_grid_Datalisttype);
         ucDdo_grid.setProperty("AllowMultipleSelection", Ddo_grid_Allowmultipleselection);
         ucDdo_grid.setProperty("DataListFixedValues", Ddo_grid_Datalistfixedvalues);
         ucDdo_grid.setProperty("DataListProc", Ddo_grid_Datalistproc);
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV49DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, sPrefix+"DDO_GRIDContainer");
         /* User Defined Control */
         ucGrid_empowerer.setProperty("HasTitleSettings", Grid_empowerer_Hastitlesettings);
         ucGrid_empowerer.render(context, "wwp.gridempowerer", Grid_empowerer_Internalname, sPrefix+"GRID_EMPOWERERContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      if ( wbEnd == 15 )
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

   public void start2522( )
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
            Form.getMeta().addItem("description", httpContext.getMessage( " Detalle de Fases p/produccion", ""), (short)(0)) ;
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
            strup2520( ) ;
         }
      }
   }

   public void ws2522( )
   {
      start2522( ) ;
      evt2522( ) ;
   }

   public void evt2522( )
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
                              strup2520( ) ;
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
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEPAGE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup2520( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e112522 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup2520( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e122522 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRID.ONOPTIONCLICKED") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup2520( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e132522 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup2520( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 GX_FocusControl = cmbavGridactiongroup1.getInternalname() ;
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
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 7), "REFRESH") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 9), "GRID.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 23), "VGRIDACTIONGROUP1.CLICK") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 23), "VGRIDACTIONGROUP1.CLICK") == 0 ) )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup2520( ) ;
                           }
                           nGXsfl_15_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_15_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_15_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_152( ) ;
                           cmbavGridactiongroup1.setName( cmbavGridactiongroup1.getInternalname() );
                           cmbavGridactiongroup1.setValue( httpContext.cgiGet( cmbavGridactiongroup1.getInternalname()) );
                           AV61GridActionGroup1 = (short)(GXutil.lval( httpContext.cgiGet( cmbavGridactiongroup1.getInternalname()))) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, cmbavGridactiongroup1.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV61GridActionGroup1), 4, 0));
                           A13696BarNHdr = httpContext.cgiGet( edtBarNHdr_Internalname) ;
                           A4815AlbEncCli = httpContext.cgiGet( edtAlbEncCli_Internalname) ;
                           A3391AlbSer = httpContext.cgiGet( edtAlbSer_Internalname) ;
                           A8879AlbSerD = httpContext.cgiGet( edtAlbSerD_Internalname) ;
                           A3392AlbColNom = httpContext.cgiGet( edtAlbColNom_Internalname) ;
                           A3393AlbColNum = (int)(localUtil.ctol( httpContext.cgiGet( edtAlbColNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A3394AlbTipCol = (byte)(localUtil.ctol( httpContext.cgiGet( edtAlbTipCol_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A12232AlbNomCli = httpContext.cgiGet( edtAlbNomCli_Internalname) ;
                           A1261BarAlbKgmE = localUtil.ctond( httpContext.cgiGet( edtBarAlbKgmE_Internalname)) ;
                           A3271AlbHdrAnc = (short)(localUtil.ctol( httpContext.cgiGet( edtAlbHdrAnc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A5019AlbHdrgm2 = (short)(localUtil.ctol( httpContext.cgiGet( edtAlbHdrgm2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A1263BarAlbMtrE = localUtil.ctond( httpContext.cgiGet( edtBarAlbMtrE_Internalname)) ;
                           A1265BarAlbPie = (int)(localUtil.ctol( httpContext.cgiGet( edtBarAlbPie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( edtBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarCodReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A130BarCodPar = httpContext.cgiGet( edtBarCodPar_Internalname) ;
                           A1206TubCod = (short)(localUtil.ctol( httpContext.cgiGet( edtTubCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           n1206TubCod = false ;
                           A1266BarAlbTub = (int)(localUtil.ctol( httpContext.cgiGet( edtBarAlbTub_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A6466PlasCod = (short)(localUtil.ctol( httpContext.cgiGet( edtPlasCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           n6466PlasCod = false ;
                           A6467BarAlbPlas = (short)(localUtil.ctol( httpContext.cgiGet( edtBarAlbPlas_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A2441AlbHdrObs = httpContext.cgiGet( edtAlbHdrObs_Internalname) ;
                           cmbAlbProVal.setName( cmbAlbProVal.getInternalname() );
                           cmbAlbProVal.setValue( httpContext.cgiGet( cmbAlbProVal.getInternalname()) );
                           A2839AlbProVal = httpContext.cgiGet( cmbAlbProVal.getInternalname()) ;
                           A213BarSit = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarSit_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A5291BarTipCor = ((GXutil.strcmp(httpContext.cgiGet( chkBarTipCor.getInternalname()), "SI")==0) ? "SI" : "NO") ;
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
                                       GX_FocusControl = cmbavGridactiongroup1.getInternalname() ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       /* Execute user event: Start */
                                       e142522 ();
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
                                       GX_FocusControl = cmbavGridactiongroup1.getInternalname() ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       /* Execute user event: Refresh */
                                       e152522 ();
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
                                       GX_FocusControl = cmbavGridactiongroup1.getInternalname() ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       e162522 ();
                                    }
                                 }
                              }
                              else if ( GXutil.strcmp(sEvt, "VGRIDACTIONGROUP1.CLICK") == 0 )
                              {
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       dynload_actions( ) ;
                                       GX_FocusControl = cmbavGridactiongroup1.getInternalname() ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       e172522 ();
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
                                    strup2520( ) ;
                                 }
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       dynload_actions( ) ;
                                       GX_FocusControl = cmbavGridactiongroup1.getInternalname() ;
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

   public void we2522( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm2522( ) ;
         }
      }
   }

   public void pa2522( )
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
      subsflControlProps_152( ) ;
      while ( nGXsfl_15_idx <= nRC_GXsfl_15 )
      {
         sendrow_152( ) ;
         nGXsfl_15_idx = ((subGrid_Islastpage==1)&&(nGXsfl_15_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_15_idx+1) ;
         sGXsfl_15_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_15_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_152( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 String AV53Emprcod ,
                                 long AV54AlbProcod ,
                                 String AV15TFBarNHdr ,
                                 String AV16TFBarNHdr_Sel ,
                                 String AV69TFAlbEncCli ,
                                 String AV70TFAlbEncCli_Sel ,
                                 String AV17TFAlbSer ,
                                 String AV18TFAlbSer_Sel ,
                                 String AV19TFAlbSerD ,
                                 String AV20TFAlbSerD_Sel ,
                                 String AV21TFAlbColNom ,
                                 String AV22TFAlbColNom_Sel ,
                                 int AV23TFAlbColNum ,
                                 int AV24TFAlbColNum_To ,
                                 byte AV71TFAlbTipCol ,
                                 byte AV72TFAlbTipCol_To ,
                                 String AV25TFAlbNomCli ,
                                 String AV26TFAlbNomCli_Sel ,
                                 java.math.BigDecimal AV27TFBarAlbKgmE ,
                                 java.math.BigDecimal AV28TFBarAlbKgmE_To ,
                                 short AV29TFAlbHdrAnc ,
                                 short AV30TFAlbHdrAnc_To ,
                                 short AV31TFAlbHdrgm2 ,
                                 short AV32TFAlbHdrgm2_To ,
                                 java.math.BigDecimal AV33TFBarAlbMtrE ,
                                 java.math.BigDecimal AV34TFBarAlbMtrE_To ,
                                 int AV35TFBarAlbPie ,
                                 int AV36TFBarAlbPie_To ,
                                 short AV37TFTubCod ,
                                 short AV38TFTubCod_To ,
                                 int AV39TFBarAlbTub ,
                                 int AV40TFBarAlbTub_To ,
                                 short AV41TFPlasCod ,
                                 short AV42TFPlasCod_To ,
                                 short AV43TFBarAlbPlas ,
                                 short AV44TFBarAlbPlas_To ,
                                 String AV45TFAlbHdrObs ,
                                 String AV46TFAlbHdrObs_Sel ,
                                 GXSimpleCollection<String> AV48TFAlbProVal_Sels ,
                                 byte AV59TFBarSit ,
                                 byte AV60TFBarSit_To ,
                                 String AV73TFBarTipCor_Sel ,
                                 String AV81Pgmname ,
                                 short AV12OrderedBy ,
                                 boolean AV13OrderedDsc ,
                                 int AV62Guiremcli ,
                                 String AV63GuiRemCln ,
                                 java.util.Date AV64AlbProFch ,
                                 String AV65AlbSec ,
                                 String AV66AlbPropri ,
                                 byte AV67AlbEnvFtp ,
                                 String AV68AlbLic ,
                                 String Gx_mode ,
                                 short AV74Moda21 ,
                                 String AV76Mensaje ,
                                 String A396EmprCod ,
                                 String sPrefix )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e152522 ();
      GRID_nCurrentRecord = 0 ;
      rf2522( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"DocumentodeTransporteProduccion_7");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV81Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("documentotransporteproduccion\\documentodetransporteproduccion_7:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
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
      rf2522( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV81Pgmname = "DocumentoTransporteProduccion.DocumentodeTransporteProduccion_7" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV81Pgmname", AV81Pgmname);
      Gx_err = (short)(0) ;
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void rf2522( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(15) ;
      /* Execute user event: Refresh */
      e152522 ();
      nGXsfl_15_idx = 1 ;
      sGXsfl_15_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_15_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_152( ) ;
      bGXsfl_15_Refreshing = true ;
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
         subsflControlProps_152( ) ;
         GXPagingFrom2 = (int)(((subGrid_Rows==0) ? 1 : GRID_nFirstRecordOnPage+1)) ;
         GXPagingTo2 = (int)(((subGrid_Rows==0) ? 10000 : GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )+1)) ;
         pr_default.dynParam(0, new Object[]{ new Object[]{
                                              A2839AlbProVal ,
                                              AV118Documentotransporteproduccion_documentodetransporteproduccion_7ds_37_tfalbproval_sels ,
                                              AV83Documentotransporteproduccion_documentodetransporteproduccion_7ds_2_tfbarnhdr_sel ,
                                              AV82Documentotransporteproduccion_documentodetransporteproduccion_7ds_1_tfbarnhdr ,
                                              AV85Documentotransporteproduccion_documentodetransporteproduccion_7ds_4_tfalbenccli_sel ,
                                              AV84Documentotransporteproduccion_documentodetransporteproduccion_7ds_3_tfalbenccli ,
                                              AV87Documentotransporteproduccion_documentodetransporteproduccion_7ds_6_tfalbser_sel ,
                                              AV86Documentotransporteproduccion_documentodetransporteproduccion_7ds_5_tfalbser ,
                                              AV89Documentotransporteproduccion_documentodetransporteproduccion_7ds_8_tfalbserd_sel ,
                                              AV88Documentotransporteproduccion_documentodetransporteproduccion_7ds_7_tfalbserd ,
                                              AV91Documentotransporteproduccion_documentodetransporteproduccion_7ds_10_tfalbcolnom_sel ,
                                              AV90Documentotransporteproduccion_documentodetransporteproduccion_7ds_9_tfalbcolnom ,
                                              Integer.valueOf(AV92Documentotransporteproduccion_documentodetransporteproduccion_7ds_11_tfalbcolnum) ,
                                              Integer.valueOf(AV93Documentotransporteproduccion_documentodetransporteproduccion_7ds_12_tfalbcolnum_to) ,
                                              Byte.valueOf(AV94Documentotransporteproduccion_documentodetransporteproduccion_7ds_13_tfalbtipcol) ,
                                              Byte.valueOf(AV95Documentotransporteproduccion_documentodetransporteproduccion_7ds_14_tfalbtipcol_to) ,
                                              AV97Documentotransporteproduccion_documentodetransporteproduccion_7ds_16_tfalbnomcli_sel ,
                                              AV96Documentotransporteproduccion_documentodetransporteproduccion_7ds_15_tfalbnomcli ,
                                              AV98Documentotransporteproduccion_documentodetransporteproduccion_7ds_17_tfbaralbkgme ,
                                              AV99Documentotransporteproduccion_documentodetransporteproduccion_7ds_18_tfbaralbkgme_to ,
                                              Short.valueOf(AV100Documentotransporteproduccion_documentodetransporteproduccion_7ds_19_tfalbhdranc) ,
                                              Short.valueOf(AV101Documentotransporteproduccion_documentodetransporteproduccion_7ds_20_tfalbhdranc_to) ,
                                              Short.valueOf(AV102Documentotransporteproduccion_documentodetransporteproduccion_7ds_21_tfalbhdrgm2) ,
                                              Short.valueOf(AV103Documentotransporteproduccion_documentodetransporteproduccion_7ds_22_tfalbhdrgm2_to) ,
                                              AV104Documentotransporteproduccion_documentodetransporteproduccion_7ds_23_tfbaralbmtre ,
                                              AV105Documentotransporteproduccion_documentodetransporteproduccion_7ds_24_tfbaralbmtre_to ,
                                              Integer.valueOf(AV106Documentotransporteproduccion_documentodetransporteproduccion_7ds_25_tfbaralbpie) ,
                                              Integer.valueOf(AV107Documentotransporteproduccion_documentodetransporteproduccion_7ds_26_tfbaralbpie_to) ,
                                              Short.valueOf(AV108Documentotransporteproduccion_documentodetransporteproduccion_7ds_27_tftubcod) ,
                                              Short.valueOf(AV109Documentotransporteproduccion_documentodetransporteproduccion_7ds_28_tftubcod_to) ,
                                              Integer.valueOf(AV110Documentotransporteproduccion_documentodetransporteproduccion_7ds_29_tfbaralbtub) ,
                                              Integer.valueOf(AV111Documentotransporteproduccion_documentodetransporteproduccion_7ds_30_tfbaralbtub_to) ,
                                              Short.valueOf(AV112Documentotransporteproduccion_documentodetransporteproduccion_7ds_31_tfplascod) ,
                                              Short.valueOf(AV113Documentotransporteproduccion_documentodetransporteproduccion_7ds_32_tfplascod_to) ,
                                              Short.valueOf(AV114Documentotransporteproduccion_documentodetransporteproduccion_7ds_33_tfbaralbplas) ,
                                              Short.valueOf(AV115Documentotransporteproduccion_documentodetransporteproduccion_7ds_34_tfbaralbplas_to) ,
                                              AV117Documentotransporteproduccion_documentodetransporteproduccion_7ds_36_tfalbhdrobs_sel ,
                                              AV116Documentotransporteproduccion_documentodetransporteproduccion_7ds_35_tfalbhdrobs ,
                                              Integer.valueOf(AV118Documentotransporteproduccion_documentodetransporteproduccion_7ds_37_tfalbproval_sels.size()) ,
                                              Byte.valueOf(AV119Documentotransporteproduccion_documentodetransporteproduccion_7ds_38_tfbarsit) ,
                                              Byte.valueOf(AV120Documentotransporteproduccion_documentodetransporteproduccion_7ds_39_tfbarsit_to) ,
                                              AV121Documentotransporteproduccion_documentodetransporteproduccion_7ds_40_tfbartipcor_sel ,
                                              Integer.valueOf(A129BarCod) ,
                                              Byte.valueOf(A132BarCodReo) ,
                                              A130BarCodPar ,
                                              A4815AlbEncCli ,
                                              A3391AlbSer ,
                                              A8879AlbSerD ,
                                              A3392AlbColNom ,
                                              Integer.valueOf(A3393AlbColNum) ,
                                              Byte.valueOf(A3394AlbTipCol) ,
                                              A12232AlbNomCli ,
                                              A1261BarAlbKgmE ,
                                              Short.valueOf(A3271AlbHdrAnc) ,
                                              Short.valueOf(A5019AlbHdrgm2) ,
                                              A1263BarAlbMtrE ,
                                              Integer.valueOf(A1265BarAlbPie) ,
                                              Short.valueOf(A1206TubCod) ,
                                              Integer.valueOf(A1266BarAlbTub) ,
                                              Short.valueOf(A6466PlasCod) ,
                                              Short.valueOf(A6467BarAlbPlas) ,
                                              A2441AlbHdrObs ,
                                              Byte.valueOf(A213BarSit) ,
                                              A5291BarTipCor ,
                                              Short.valueOf(AV12OrderedBy) ,
                                              Boolean.valueOf(AV13OrderedDsc) ,
                                              AV53Emprcod ,
                                              Long.valueOf(AV54AlbProcod) ,
                                              A396EmprCod ,
                                              Long.valueOf(A30AlbProCod) } ,
                                              new int[]{
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT,
                                              TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT,
                                              TypeConstants.INT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE,
                                              TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE,
                                              TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.SHORT,
                                              TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.STRING,
                                              TypeConstants.LONG
                                              }
         });
         lV82Documentotransporteproduccion_documentodetransporteproduccion_7ds_1_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV82Documentotransporteproduccion_documentodetransporteproduccion_7ds_1_tfbarnhdr), 11, "%") ;
         lV84Documentotransporteproduccion_documentodetransporteproduccion_7ds_3_tfalbenccli = GXutil.padr( GXutil.rtrim( AV84Documentotransporteproduccion_documentodetransporteproduccion_7ds_3_tfalbenccli), 20, "%") ;
         lV86Documentotransporteproduccion_documentodetransporteproduccion_7ds_5_tfalbser = GXutil.padr( GXutil.rtrim( AV86Documentotransporteproduccion_documentodetransporteproduccion_7ds_5_tfalbser), 16, "%") ;
         lV88Documentotransporteproduccion_documentodetransporteproduccion_7ds_7_tfalbserd = GXutil.padr( GXutil.rtrim( AV88Documentotransporteproduccion_documentodetransporteproduccion_7ds_7_tfalbserd), 26, "%") ;
         lV90Documentotransporteproduccion_documentodetransporteproduccion_7ds_9_tfalbcolnom = GXutil.padr( GXutil.rtrim( AV90Documentotransporteproduccion_documentodetransporteproduccion_7ds_9_tfalbcolnom), 13, "%") ;
         lV96Documentotransporteproduccion_documentodetransporteproduccion_7ds_15_tfalbnomcli = GXutil.padr( GXutil.rtrim( AV96Documentotransporteproduccion_documentodetransporteproduccion_7ds_15_tfalbnomcli), 13, "%") ;
         lV116Documentotransporteproduccion_documentodetransporteproduccion_7ds_35_tfalbhdrobs = GXutil.padr( GXutil.rtrim( AV116Documentotransporteproduccion_documentodetransporteproduccion_7ds_35_tfalbhdrobs), 60, "%") ;
         /* Using cursor H02522 */
         pr_default.execute(0, new Object[] {AV53Emprcod, Long.valueOf(AV54AlbProcod), lV82Documentotransporteproduccion_documentodetransporteproduccion_7ds_1_tfbarnhdr, AV83Documentotransporteproduccion_documentodetransporteproduccion_7ds_2_tfbarnhdr_sel, lV84Documentotransporteproduccion_documentodetransporteproduccion_7ds_3_tfalbenccli, AV85Documentotransporteproduccion_documentodetransporteproduccion_7ds_4_tfalbenccli_sel, lV86Documentotransporteproduccion_documentodetransporteproduccion_7ds_5_tfalbser, AV87Documentotransporteproduccion_documentodetransporteproduccion_7ds_6_tfalbser_sel, lV88Documentotransporteproduccion_documentodetransporteproduccion_7ds_7_tfalbserd, AV89Documentotransporteproduccion_documentodetransporteproduccion_7ds_8_tfalbserd_sel, lV90Documentotransporteproduccion_documentodetransporteproduccion_7ds_9_tfalbcolnom, AV91Documentotransporteproduccion_documentodetransporteproduccion_7ds_10_tfalbcolnom_sel, Integer.valueOf(AV92Documentotransporteproduccion_documentodetransporteproduccion_7ds_11_tfalbcolnum), Integer.valueOf(AV93Documentotransporteproduccion_documentodetransporteproduccion_7ds_12_tfalbcolnum_to), Byte.valueOf(AV94Documentotransporteproduccion_documentodetransporteproduccion_7ds_13_tfalbtipcol), Byte.valueOf(AV95Documentotransporteproduccion_documentodetransporteproduccion_7ds_14_tfalbtipcol_to), lV96Documentotransporteproduccion_documentodetransporteproduccion_7ds_15_tfalbnomcli, AV97Documentotransporteproduccion_documentodetransporteproduccion_7ds_16_tfalbnomcli_sel, AV98Documentotransporteproduccion_documentodetransporteproduccion_7ds_17_tfbaralbkgme, AV99Documentotransporteproduccion_documentodetransporteproduccion_7ds_18_tfbaralbkgme_to, Short.valueOf(AV100Documentotransporteproduccion_documentodetransporteproduccion_7ds_19_tfalbhdranc), Short.valueOf(AV101Documentotransporteproduccion_documentodetransporteproduccion_7ds_20_tfalbhdranc_to), Short.valueOf(AV102Documentotransporteproduccion_documentodetransporteproduccion_7ds_21_tfalbhdrgm2), Short.valueOf(AV103Documentotransporteproduccion_documentodetransporteproduccion_7ds_22_tfalbhdrgm2_to), AV104Documentotransporteproduccion_documentodetransporteproduccion_7ds_23_tfbaralbmtre, AV105Documentotransporteproduccion_documentodetransporteproduccion_7ds_24_tfbaralbmtre_to, Integer.valueOf(AV106Documentotransporteproduccion_documentodetransporteproduccion_7ds_25_tfbaralbpie), Integer.valueOf(AV107Documentotransporteproduccion_documentodetransporteproduccion_7ds_26_tfbaralbpie_to), Short.valueOf(AV108Documentotransporteproduccion_documentodetransporteproduccion_7ds_27_tftubcod), Short.valueOf(AV109Documentotransporteproduccion_documentodetransporteproduccion_7ds_28_tftubcod_to), Integer.valueOf(AV110Documentotransporteproduccion_documentodetransporteproduccion_7ds_29_tfbaralbtub), Integer.valueOf(AV111Documentotransporteproduccion_documentodetransporteproduccion_7ds_30_tfbaralbtub_to), Short.valueOf(AV112Documentotransporteproduccion_documentodetransporteproduccion_7ds_31_tfplascod), Short.valueOf(AV113Documentotransporteproduccion_documentodetransporteproduccion_7ds_32_tfplascod_to), Short.valueOf(AV114Documentotransporteproduccion_documentodetransporteproduccion_7ds_33_tfbaralbplas), Short.valueOf(AV115Documentotransporteproduccion_documentodetransporteproduccion_7ds_34_tfbaralbplas_to), lV116Documentotransporteproduccion_documentodetransporteproduccion_7ds_35_tfalbhdrobs, AV117Documentotransporteproduccion_documentodetransporteproduccion_7ds_36_tfalbhdrobs_sel, Byte.valueOf(AV119Documentotransporteproduccion_documentodetransporteproduccion_7ds_38_tfbarsit), Byte.valueOf(AV120Documentotransporteproduccion_documentodetransporteproduccion_7ds_39_tfbarsit_to), AV121Documentotransporteproduccion_documentodetransporteproduccion_7ds_40_tfbartipcor_sel, Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingFrom2)});
         nGXsfl_15_idx = 1 ;
         sGXsfl_15_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_15_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_152( ) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A396EmprCod = H02522_A396EmprCod[0] ;
            A30AlbProCod = H02522_A30AlbProCod[0] ;
            A5291BarTipCor = H02522_A5291BarTipCor[0] ;
            A213BarSit = H02522_A213BarSit[0] ;
            A2839AlbProVal = H02522_A2839AlbProVal[0] ;
            A2441AlbHdrObs = H02522_A2441AlbHdrObs[0] ;
            A6467BarAlbPlas = H02522_A6467BarAlbPlas[0] ;
            A6466PlasCod = H02522_A6466PlasCod[0] ;
            n6466PlasCod = H02522_n6466PlasCod[0] ;
            A1266BarAlbTub = H02522_A1266BarAlbTub[0] ;
            A1206TubCod = H02522_A1206TubCod[0] ;
            n1206TubCod = H02522_n1206TubCod[0] ;
            A1265BarAlbPie = H02522_A1265BarAlbPie[0] ;
            A1263BarAlbMtrE = H02522_A1263BarAlbMtrE[0] ;
            A5019AlbHdrgm2 = H02522_A5019AlbHdrgm2[0] ;
            A3271AlbHdrAnc = H02522_A3271AlbHdrAnc[0] ;
            A1261BarAlbKgmE = H02522_A1261BarAlbKgmE[0] ;
            A12232AlbNomCli = H02522_A12232AlbNomCli[0] ;
            A3394AlbTipCol = H02522_A3394AlbTipCol[0] ;
            A3393AlbColNum = H02522_A3393AlbColNum[0] ;
            A3392AlbColNom = H02522_A3392AlbColNom[0] ;
            A8879AlbSerD = H02522_A8879AlbSerD[0] ;
            A3391AlbSer = H02522_A3391AlbSer[0] ;
            A4815AlbEncCli = H02522_A4815AlbEncCli[0] ;
            A130BarCodPar = H02522_A130BarCodPar[0] ;
            A132BarCodReo = H02522_A132BarCodReo[0] ;
            A129BarCod = H02522_A129BarCod[0] ;
            A5291BarTipCor = H02522_A5291BarTipCor[0] ;
            A213BarSit = H02522_A213BarSit[0] ;
            A13696BarNHdr = GXutil.trim( GXutil.str( A129BarCod, 8, 0)) + "-" + GXutil.trim( GXutil.str( A132BarCodReo, 1, 0)) + A130BarCodPar ;
            e162522 ();
            pr_default.readNext(0);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(15) ;
         wb2520( ) ;
      }
      bGXsfl_15_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes2522( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMODA21", GXutil.ltrim( localUtil.ntoc( AV74Moda21, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vMODA21", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV74Moda21), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_EMPRCOD", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMENSAJE", AV76Mensaje);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vMENSAJE", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV76Mensaje, ""))));
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
      AV82Documentotransporteproduccion_documentodetransporteproduccion_7ds_1_tfbarnhdr = AV15TFBarNHdr ;
      AV83Documentotransporteproduccion_documentodetransporteproduccion_7ds_2_tfbarnhdr_sel = AV16TFBarNHdr_Sel ;
      AV84Documentotransporteproduccion_documentodetransporteproduccion_7ds_3_tfalbenccli = AV69TFAlbEncCli ;
      AV85Documentotransporteproduccion_documentodetransporteproduccion_7ds_4_tfalbenccli_sel = AV70TFAlbEncCli_Sel ;
      AV86Documentotransporteproduccion_documentodetransporteproduccion_7ds_5_tfalbser = AV17TFAlbSer ;
      AV87Documentotransporteproduccion_documentodetransporteproduccion_7ds_6_tfalbser_sel = AV18TFAlbSer_Sel ;
      AV88Documentotransporteproduccion_documentodetransporteproduccion_7ds_7_tfalbserd = AV19TFAlbSerD ;
      AV89Documentotransporteproduccion_documentodetransporteproduccion_7ds_8_tfalbserd_sel = AV20TFAlbSerD_Sel ;
      AV90Documentotransporteproduccion_documentodetransporteproduccion_7ds_9_tfalbcolnom = AV21TFAlbColNom ;
      AV91Documentotransporteproduccion_documentodetransporteproduccion_7ds_10_tfalbcolnom_sel = AV22TFAlbColNom_Sel ;
      AV92Documentotransporteproduccion_documentodetransporteproduccion_7ds_11_tfalbcolnum = AV23TFAlbColNum ;
      AV93Documentotransporteproduccion_documentodetransporteproduccion_7ds_12_tfalbcolnum_to = AV24TFAlbColNum_To ;
      AV94Documentotransporteproduccion_documentodetransporteproduccion_7ds_13_tfalbtipcol = AV71TFAlbTipCol ;
      AV95Documentotransporteproduccion_documentodetransporteproduccion_7ds_14_tfalbtipcol_to = AV72TFAlbTipCol_To ;
      AV96Documentotransporteproduccion_documentodetransporteproduccion_7ds_15_tfalbnomcli = AV25TFAlbNomCli ;
      AV97Documentotransporteproduccion_documentodetransporteproduccion_7ds_16_tfalbnomcli_sel = AV26TFAlbNomCli_Sel ;
      AV98Documentotransporteproduccion_documentodetransporteproduccion_7ds_17_tfbaralbkgme = AV27TFBarAlbKgmE ;
      AV99Documentotransporteproduccion_documentodetransporteproduccion_7ds_18_tfbaralbkgme_to = AV28TFBarAlbKgmE_To ;
      AV100Documentotransporteproduccion_documentodetransporteproduccion_7ds_19_tfalbhdranc = AV29TFAlbHdrAnc ;
      AV101Documentotransporteproduccion_documentodetransporteproduccion_7ds_20_tfalbhdranc_to = AV30TFAlbHdrAnc_To ;
      AV102Documentotransporteproduccion_documentodetransporteproduccion_7ds_21_tfalbhdrgm2 = AV31TFAlbHdrgm2 ;
      AV103Documentotransporteproduccion_documentodetransporteproduccion_7ds_22_tfalbhdrgm2_to = AV32TFAlbHdrgm2_To ;
      AV104Documentotransporteproduccion_documentodetransporteproduccion_7ds_23_tfbaralbmtre = AV33TFBarAlbMtrE ;
      AV105Documentotransporteproduccion_documentodetransporteproduccion_7ds_24_tfbaralbmtre_to = AV34TFBarAlbMtrE_To ;
      AV106Documentotransporteproduccion_documentodetransporteproduccion_7ds_25_tfbaralbpie = AV35TFBarAlbPie ;
      AV107Documentotransporteproduccion_documentodetransporteproduccion_7ds_26_tfbaralbpie_to = AV36TFBarAlbPie_To ;
      AV108Documentotransporteproduccion_documentodetransporteproduccion_7ds_27_tftubcod = AV37TFTubCod ;
      AV109Documentotransporteproduccion_documentodetransporteproduccion_7ds_28_tftubcod_to = AV38TFTubCod_To ;
      AV110Documentotransporteproduccion_documentodetransporteproduccion_7ds_29_tfbaralbtub = AV39TFBarAlbTub ;
      AV111Documentotransporteproduccion_documentodetransporteproduccion_7ds_30_tfbaralbtub_to = AV40TFBarAlbTub_To ;
      AV112Documentotransporteproduccion_documentodetransporteproduccion_7ds_31_tfplascod = AV41TFPlasCod ;
      AV113Documentotransporteproduccion_documentodetransporteproduccion_7ds_32_tfplascod_to = AV42TFPlasCod_To ;
      AV114Documentotransporteproduccion_documentodetransporteproduccion_7ds_33_tfbaralbplas = AV43TFBarAlbPlas ;
      AV115Documentotransporteproduccion_documentodetransporteproduccion_7ds_34_tfbaralbplas_to = AV44TFBarAlbPlas_To ;
      AV116Documentotransporteproduccion_documentodetransporteproduccion_7ds_35_tfalbhdrobs = AV45TFAlbHdrObs ;
      AV117Documentotransporteproduccion_documentodetransporteproduccion_7ds_36_tfalbhdrobs_sel = AV46TFAlbHdrObs_Sel ;
      AV118Documentotransporteproduccion_documentodetransporteproduccion_7ds_37_tfalbproval_sels = AV48TFAlbProVal_Sels ;
      AV119Documentotransporteproduccion_documentodetransporteproduccion_7ds_38_tfbarsit = AV59TFBarSit ;
      AV120Documentotransporteproduccion_documentodetransporteproduccion_7ds_39_tfbarsit_to = AV60TFBarSit_To ;
      AV121Documentotransporteproduccion_documentodetransporteproduccion_7ds_40_tfbartipcor_sel = AV73TFBarTipCor_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           A2839AlbProVal ,
                                           AV118Documentotransporteproduccion_documentodetransporteproduccion_7ds_37_tfalbproval_sels ,
                                           AV83Documentotransporteproduccion_documentodetransporteproduccion_7ds_2_tfbarnhdr_sel ,
                                           AV82Documentotransporteproduccion_documentodetransporteproduccion_7ds_1_tfbarnhdr ,
                                           AV85Documentotransporteproduccion_documentodetransporteproduccion_7ds_4_tfalbenccli_sel ,
                                           AV84Documentotransporteproduccion_documentodetransporteproduccion_7ds_3_tfalbenccli ,
                                           AV87Documentotransporteproduccion_documentodetransporteproduccion_7ds_6_tfalbser_sel ,
                                           AV86Documentotransporteproduccion_documentodetransporteproduccion_7ds_5_tfalbser ,
                                           AV89Documentotransporteproduccion_documentodetransporteproduccion_7ds_8_tfalbserd_sel ,
                                           AV88Documentotransporteproduccion_documentodetransporteproduccion_7ds_7_tfalbserd ,
                                           AV91Documentotransporteproduccion_documentodetransporteproduccion_7ds_10_tfalbcolnom_sel ,
                                           AV90Documentotransporteproduccion_documentodetransporteproduccion_7ds_9_tfalbcolnom ,
                                           Integer.valueOf(AV92Documentotransporteproduccion_documentodetransporteproduccion_7ds_11_tfalbcolnum) ,
                                           Integer.valueOf(AV93Documentotransporteproduccion_documentodetransporteproduccion_7ds_12_tfalbcolnum_to) ,
                                           Byte.valueOf(AV94Documentotransporteproduccion_documentodetransporteproduccion_7ds_13_tfalbtipcol) ,
                                           Byte.valueOf(AV95Documentotransporteproduccion_documentodetransporteproduccion_7ds_14_tfalbtipcol_to) ,
                                           AV97Documentotransporteproduccion_documentodetransporteproduccion_7ds_16_tfalbnomcli_sel ,
                                           AV96Documentotransporteproduccion_documentodetransporteproduccion_7ds_15_tfalbnomcli ,
                                           AV98Documentotransporteproduccion_documentodetransporteproduccion_7ds_17_tfbaralbkgme ,
                                           AV99Documentotransporteproduccion_documentodetransporteproduccion_7ds_18_tfbaralbkgme_to ,
                                           Short.valueOf(AV100Documentotransporteproduccion_documentodetransporteproduccion_7ds_19_tfalbhdranc) ,
                                           Short.valueOf(AV101Documentotransporteproduccion_documentodetransporteproduccion_7ds_20_tfalbhdranc_to) ,
                                           Short.valueOf(AV102Documentotransporteproduccion_documentodetransporteproduccion_7ds_21_tfalbhdrgm2) ,
                                           Short.valueOf(AV103Documentotransporteproduccion_documentodetransporteproduccion_7ds_22_tfalbhdrgm2_to) ,
                                           AV104Documentotransporteproduccion_documentodetransporteproduccion_7ds_23_tfbaralbmtre ,
                                           AV105Documentotransporteproduccion_documentodetransporteproduccion_7ds_24_tfbaralbmtre_to ,
                                           Integer.valueOf(AV106Documentotransporteproduccion_documentodetransporteproduccion_7ds_25_tfbaralbpie) ,
                                           Integer.valueOf(AV107Documentotransporteproduccion_documentodetransporteproduccion_7ds_26_tfbaralbpie_to) ,
                                           Short.valueOf(AV108Documentotransporteproduccion_documentodetransporteproduccion_7ds_27_tftubcod) ,
                                           Short.valueOf(AV109Documentotransporteproduccion_documentodetransporteproduccion_7ds_28_tftubcod_to) ,
                                           Integer.valueOf(AV110Documentotransporteproduccion_documentodetransporteproduccion_7ds_29_tfbaralbtub) ,
                                           Integer.valueOf(AV111Documentotransporteproduccion_documentodetransporteproduccion_7ds_30_tfbaralbtub_to) ,
                                           Short.valueOf(AV112Documentotransporteproduccion_documentodetransporteproduccion_7ds_31_tfplascod) ,
                                           Short.valueOf(AV113Documentotransporteproduccion_documentodetransporteproduccion_7ds_32_tfplascod_to) ,
                                           Short.valueOf(AV114Documentotransporteproduccion_documentodetransporteproduccion_7ds_33_tfbaralbplas) ,
                                           Short.valueOf(AV115Documentotransporteproduccion_documentodetransporteproduccion_7ds_34_tfbaralbplas_to) ,
                                           AV117Documentotransporteproduccion_documentodetransporteproduccion_7ds_36_tfalbhdrobs_sel ,
                                           AV116Documentotransporteproduccion_documentodetransporteproduccion_7ds_35_tfalbhdrobs ,
                                           Integer.valueOf(AV118Documentotransporteproduccion_documentodetransporteproduccion_7ds_37_tfalbproval_sels.size()) ,
                                           Byte.valueOf(AV119Documentotransporteproduccion_documentodetransporteproduccion_7ds_38_tfbarsit) ,
                                           Byte.valueOf(AV120Documentotransporteproduccion_documentodetransporteproduccion_7ds_39_tfbarsit_to) ,
                                           AV121Documentotransporteproduccion_documentodetransporteproduccion_7ds_40_tfbartipcor_sel ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           A4815AlbEncCli ,
                                           A3391AlbSer ,
                                           A8879AlbSerD ,
                                           A3392AlbColNom ,
                                           Integer.valueOf(A3393AlbColNum) ,
                                           Byte.valueOf(A3394AlbTipCol) ,
                                           A12232AlbNomCli ,
                                           A1261BarAlbKgmE ,
                                           Short.valueOf(A3271AlbHdrAnc) ,
                                           Short.valueOf(A5019AlbHdrgm2) ,
                                           A1263BarAlbMtrE ,
                                           Integer.valueOf(A1265BarAlbPie) ,
                                           Short.valueOf(A1206TubCod) ,
                                           Integer.valueOf(A1266BarAlbTub) ,
                                           Short.valueOf(A6466PlasCod) ,
                                           Short.valueOf(A6467BarAlbPlas) ,
                                           A2441AlbHdrObs ,
                                           Byte.valueOf(A213BarSit) ,
                                           A5291BarTipCor ,
                                           Short.valueOf(AV12OrderedBy) ,
                                           Boolean.valueOf(AV13OrderedDsc) ,
                                           AV53Emprcod ,
                                           Long.valueOf(AV54AlbProcod) ,
                                           A396EmprCod ,
                                           Long.valueOf(A30AlbProCod) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.SHORT,
                                           TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.STRING,
                                           TypeConstants.LONG
                                           }
      });
      lV82Documentotransporteproduccion_documentodetransporteproduccion_7ds_1_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV82Documentotransporteproduccion_documentodetransporteproduccion_7ds_1_tfbarnhdr), 11, "%") ;
      lV84Documentotransporteproduccion_documentodetransporteproduccion_7ds_3_tfalbenccli = GXutil.padr( GXutil.rtrim( AV84Documentotransporteproduccion_documentodetransporteproduccion_7ds_3_tfalbenccli), 20, "%") ;
      lV86Documentotransporteproduccion_documentodetransporteproduccion_7ds_5_tfalbser = GXutil.padr( GXutil.rtrim( AV86Documentotransporteproduccion_documentodetransporteproduccion_7ds_5_tfalbser), 16, "%") ;
      lV88Documentotransporteproduccion_documentodetransporteproduccion_7ds_7_tfalbserd = GXutil.padr( GXutil.rtrim( AV88Documentotransporteproduccion_documentodetransporteproduccion_7ds_7_tfalbserd), 26, "%") ;
      lV90Documentotransporteproduccion_documentodetransporteproduccion_7ds_9_tfalbcolnom = GXutil.padr( GXutil.rtrim( AV90Documentotransporteproduccion_documentodetransporteproduccion_7ds_9_tfalbcolnom), 13, "%") ;
      lV96Documentotransporteproduccion_documentodetransporteproduccion_7ds_15_tfalbnomcli = GXutil.padr( GXutil.rtrim( AV96Documentotransporteproduccion_documentodetransporteproduccion_7ds_15_tfalbnomcli), 13, "%") ;
      lV116Documentotransporteproduccion_documentodetransporteproduccion_7ds_35_tfalbhdrobs = GXutil.padr( GXutil.rtrim( AV116Documentotransporteproduccion_documentodetransporteproduccion_7ds_35_tfalbhdrobs), 60, "%") ;
      /* Using cursor H02523 */
      pr_default.execute(1, new Object[] {AV53Emprcod, Long.valueOf(AV54AlbProcod), lV82Documentotransporteproduccion_documentodetransporteproduccion_7ds_1_tfbarnhdr, AV83Documentotransporteproduccion_documentodetransporteproduccion_7ds_2_tfbarnhdr_sel, lV84Documentotransporteproduccion_documentodetransporteproduccion_7ds_3_tfalbenccli, AV85Documentotransporteproduccion_documentodetransporteproduccion_7ds_4_tfalbenccli_sel, lV86Documentotransporteproduccion_documentodetransporteproduccion_7ds_5_tfalbser, AV87Documentotransporteproduccion_documentodetransporteproduccion_7ds_6_tfalbser_sel, lV88Documentotransporteproduccion_documentodetransporteproduccion_7ds_7_tfalbserd, AV89Documentotransporteproduccion_documentodetransporteproduccion_7ds_8_tfalbserd_sel, lV90Documentotransporteproduccion_documentodetransporteproduccion_7ds_9_tfalbcolnom, AV91Documentotransporteproduccion_documentodetransporteproduccion_7ds_10_tfalbcolnom_sel, Integer.valueOf(AV92Documentotransporteproduccion_documentodetransporteproduccion_7ds_11_tfalbcolnum), Integer.valueOf(AV93Documentotransporteproduccion_documentodetransporteproduccion_7ds_12_tfalbcolnum_to), Byte.valueOf(AV94Documentotransporteproduccion_documentodetransporteproduccion_7ds_13_tfalbtipcol), Byte.valueOf(AV95Documentotransporteproduccion_documentodetransporteproduccion_7ds_14_tfalbtipcol_to), lV96Documentotransporteproduccion_documentodetransporteproduccion_7ds_15_tfalbnomcli, AV97Documentotransporteproduccion_documentodetransporteproduccion_7ds_16_tfalbnomcli_sel, AV98Documentotransporteproduccion_documentodetransporteproduccion_7ds_17_tfbaralbkgme, AV99Documentotransporteproduccion_documentodetransporteproduccion_7ds_18_tfbaralbkgme_to, Short.valueOf(AV100Documentotransporteproduccion_documentodetransporteproduccion_7ds_19_tfalbhdranc), Short.valueOf(AV101Documentotransporteproduccion_documentodetransporteproduccion_7ds_20_tfalbhdranc_to), Short.valueOf(AV102Documentotransporteproduccion_documentodetransporteproduccion_7ds_21_tfalbhdrgm2), Short.valueOf(AV103Documentotransporteproduccion_documentodetransporteproduccion_7ds_22_tfalbhdrgm2_to), AV104Documentotransporteproduccion_documentodetransporteproduccion_7ds_23_tfbaralbmtre, AV105Documentotransporteproduccion_documentodetransporteproduccion_7ds_24_tfbaralbmtre_to, Integer.valueOf(AV106Documentotransporteproduccion_documentodetransporteproduccion_7ds_25_tfbaralbpie), Integer.valueOf(AV107Documentotransporteproduccion_documentodetransporteproduccion_7ds_26_tfbaralbpie_to), Short.valueOf(AV108Documentotransporteproduccion_documentodetransporteproduccion_7ds_27_tftubcod), Short.valueOf(AV109Documentotransporteproduccion_documentodetransporteproduccion_7ds_28_tftubcod_to), Integer.valueOf(AV110Documentotransporteproduccion_documentodetransporteproduccion_7ds_29_tfbaralbtub), Integer.valueOf(AV111Documentotransporteproduccion_documentodetransporteproduccion_7ds_30_tfbaralbtub_to), Short.valueOf(AV112Documentotransporteproduccion_documentodetransporteproduccion_7ds_31_tfplascod), Short.valueOf(AV113Documentotransporteproduccion_documentodetransporteproduccion_7ds_32_tfplascod_to), Short.valueOf(AV114Documentotransporteproduccion_documentodetransporteproduccion_7ds_33_tfbaralbplas), Short.valueOf(AV115Documentotransporteproduccion_documentodetransporteproduccion_7ds_34_tfbaralbplas_to), lV116Documentotransporteproduccion_documentodetransporteproduccion_7ds_35_tfalbhdrobs, AV117Documentotransporteproduccion_documentodetransporteproduccion_7ds_36_tfalbhdrobs_sel, Byte.valueOf(AV119Documentotransporteproduccion_documentodetransporteproduccion_7ds_38_tfbarsit), Byte.valueOf(AV120Documentotransporteproduccion_documentodetransporteproduccion_7ds_39_tfbarsit_to), AV121Documentotransporteproduccion_documentodetransporteproduccion_7ds_40_tfbartipcor_sel});
      GRID_nRecordCount = H02523_AGRID_nRecordCount[0] ;
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
      AV82Documentotransporteproduccion_documentodetransporteproduccion_7ds_1_tfbarnhdr = AV15TFBarNHdr ;
      AV83Documentotransporteproduccion_documentodetransporteproduccion_7ds_2_tfbarnhdr_sel = AV16TFBarNHdr_Sel ;
      AV84Documentotransporteproduccion_documentodetransporteproduccion_7ds_3_tfalbenccli = AV69TFAlbEncCli ;
      AV85Documentotransporteproduccion_documentodetransporteproduccion_7ds_4_tfalbenccli_sel = AV70TFAlbEncCli_Sel ;
      AV86Documentotransporteproduccion_documentodetransporteproduccion_7ds_5_tfalbser = AV17TFAlbSer ;
      AV87Documentotransporteproduccion_documentodetransporteproduccion_7ds_6_tfalbser_sel = AV18TFAlbSer_Sel ;
      AV88Documentotransporteproduccion_documentodetransporteproduccion_7ds_7_tfalbserd = AV19TFAlbSerD ;
      AV89Documentotransporteproduccion_documentodetransporteproduccion_7ds_8_tfalbserd_sel = AV20TFAlbSerD_Sel ;
      AV90Documentotransporteproduccion_documentodetransporteproduccion_7ds_9_tfalbcolnom = AV21TFAlbColNom ;
      AV91Documentotransporteproduccion_documentodetransporteproduccion_7ds_10_tfalbcolnom_sel = AV22TFAlbColNom_Sel ;
      AV92Documentotransporteproduccion_documentodetransporteproduccion_7ds_11_tfalbcolnum = AV23TFAlbColNum ;
      AV93Documentotransporteproduccion_documentodetransporteproduccion_7ds_12_tfalbcolnum_to = AV24TFAlbColNum_To ;
      AV94Documentotransporteproduccion_documentodetransporteproduccion_7ds_13_tfalbtipcol = AV71TFAlbTipCol ;
      AV95Documentotransporteproduccion_documentodetransporteproduccion_7ds_14_tfalbtipcol_to = AV72TFAlbTipCol_To ;
      AV96Documentotransporteproduccion_documentodetransporteproduccion_7ds_15_tfalbnomcli = AV25TFAlbNomCli ;
      AV97Documentotransporteproduccion_documentodetransporteproduccion_7ds_16_tfalbnomcli_sel = AV26TFAlbNomCli_Sel ;
      AV98Documentotransporteproduccion_documentodetransporteproduccion_7ds_17_tfbaralbkgme = AV27TFBarAlbKgmE ;
      AV99Documentotransporteproduccion_documentodetransporteproduccion_7ds_18_tfbaralbkgme_to = AV28TFBarAlbKgmE_To ;
      AV100Documentotransporteproduccion_documentodetransporteproduccion_7ds_19_tfalbhdranc = AV29TFAlbHdrAnc ;
      AV101Documentotransporteproduccion_documentodetransporteproduccion_7ds_20_tfalbhdranc_to = AV30TFAlbHdrAnc_To ;
      AV102Documentotransporteproduccion_documentodetransporteproduccion_7ds_21_tfalbhdrgm2 = AV31TFAlbHdrgm2 ;
      AV103Documentotransporteproduccion_documentodetransporteproduccion_7ds_22_tfalbhdrgm2_to = AV32TFAlbHdrgm2_To ;
      AV104Documentotransporteproduccion_documentodetransporteproduccion_7ds_23_tfbaralbmtre = AV33TFBarAlbMtrE ;
      AV105Documentotransporteproduccion_documentodetransporteproduccion_7ds_24_tfbaralbmtre_to = AV34TFBarAlbMtrE_To ;
      AV106Documentotransporteproduccion_documentodetransporteproduccion_7ds_25_tfbaralbpie = AV35TFBarAlbPie ;
      AV107Documentotransporteproduccion_documentodetransporteproduccion_7ds_26_tfbaralbpie_to = AV36TFBarAlbPie_To ;
      AV108Documentotransporteproduccion_documentodetransporteproduccion_7ds_27_tftubcod = AV37TFTubCod ;
      AV109Documentotransporteproduccion_documentodetransporteproduccion_7ds_28_tftubcod_to = AV38TFTubCod_To ;
      AV110Documentotransporteproduccion_documentodetransporteproduccion_7ds_29_tfbaralbtub = AV39TFBarAlbTub ;
      AV111Documentotransporteproduccion_documentodetransporteproduccion_7ds_30_tfbaralbtub_to = AV40TFBarAlbTub_To ;
      AV112Documentotransporteproduccion_documentodetransporteproduccion_7ds_31_tfplascod = AV41TFPlasCod ;
      AV113Documentotransporteproduccion_documentodetransporteproduccion_7ds_32_tfplascod_to = AV42TFPlasCod_To ;
      AV114Documentotransporteproduccion_documentodetransporteproduccion_7ds_33_tfbaralbplas = AV43TFBarAlbPlas ;
      AV115Documentotransporteproduccion_documentodetransporteproduccion_7ds_34_tfbaralbplas_to = AV44TFBarAlbPlas_To ;
      AV116Documentotransporteproduccion_documentodetransporteproduccion_7ds_35_tfalbhdrobs = AV45TFAlbHdrObs ;
      AV117Documentotransporteproduccion_documentodetransporteproduccion_7ds_36_tfalbhdrobs_sel = AV46TFAlbHdrObs_Sel ;
      AV118Documentotransporteproduccion_documentodetransporteproduccion_7ds_37_tfalbproval_sels = AV48TFAlbProVal_Sels ;
      AV119Documentotransporteproduccion_documentodetransporteproduccion_7ds_38_tfbarsit = AV59TFBarSit ;
      AV120Documentotransporteproduccion_documentodetransporteproduccion_7ds_39_tfbarsit_to = AV60TFBarSit_To ;
      AV121Documentotransporteproduccion_documentodetransporteproduccion_7ds_40_tfbartipcor_sel = AV73TFBarTipCor_Sel ;
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV53Emprcod, AV54AlbProcod, AV15TFBarNHdr, AV16TFBarNHdr_Sel, AV69TFAlbEncCli, AV70TFAlbEncCli_Sel, AV17TFAlbSer, AV18TFAlbSer_Sel, AV19TFAlbSerD, AV20TFAlbSerD_Sel, AV21TFAlbColNom, AV22TFAlbColNom_Sel, AV23TFAlbColNum, AV24TFAlbColNum_To, AV71TFAlbTipCol, AV72TFAlbTipCol_To, AV25TFAlbNomCli, AV26TFAlbNomCli_Sel, AV27TFBarAlbKgmE, AV28TFBarAlbKgmE_To, AV29TFAlbHdrAnc, AV30TFAlbHdrAnc_To, AV31TFAlbHdrgm2, AV32TFAlbHdrgm2_To, AV33TFBarAlbMtrE, AV34TFBarAlbMtrE_To, AV35TFBarAlbPie, AV36TFBarAlbPie_To, AV37TFTubCod, AV38TFTubCod_To, AV39TFBarAlbTub, AV40TFBarAlbTub_To, AV41TFPlasCod, AV42TFPlasCod_To, AV43TFBarAlbPlas, AV44TFBarAlbPlas_To, AV45TFAlbHdrObs, AV46TFAlbHdrObs_Sel, AV48TFAlbProVal_Sels, AV59TFBarSit, AV60TFBarSit_To, AV73TFBarTipCor_Sel, AV81Pgmname, AV12OrderedBy, AV13OrderedDsc, AV62Guiremcli, AV63GuiRemCln, AV64AlbProFch, AV65AlbSec, AV66AlbPropri, AV67AlbEnvFtp, AV68AlbLic, Gx_mode, AV74Moda21, AV76Mensaje, A396EmprCod, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      AV82Documentotransporteproduccion_documentodetransporteproduccion_7ds_1_tfbarnhdr = AV15TFBarNHdr ;
      AV83Documentotransporteproduccion_documentodetransporteproduccion_7ds_2_tfbarnhdr_sel = AV16TFBarNHdr_Sel ;
      AV84Documentotransporteproduccion_documentodetransporteproduccion_7ds_3_tfalbenccli = AV69TFAlbEncCli ;
      AV85Documentotransporteproduccion_documentodetransporteproduccion_7ds_4_tfalbenccli_sel = AV70TFAlbEncCli_Sel ;
      AV86Documentotransporteproduccion_documentodetransporteproduccion_7ds_5_tfalbser = AV17TFAlbSer ;
      AV87Documentotransporteproduccion_documentodetransporteproduccion_7ds_6_tfalbser_sel = AV18TFAlbSer_Sel ;
      AV88Documentotransporteproduccion_documentodetransporteproduccion_7ds_7_tfalbserd = AV19TFAlbSerD ;
      AV89Documentotransporteproduccion_documentodetransporteproduccion_7ds_8_tfalbserd_sel = AV20TFAlbSerD_Sel ;
      AV90Documentotransporteproduccion_documentodetransporteproduccion_7ds_9_tfalbcolnom = AV21TFAlbColNom ;
      AV91Documentotransporteproduccion_documentodetransporteproduccion_7ds_10_tfalbcolnom_sel = AV22TFAlbColNom_Sel ;
      AV92Documentotransporteproduccion_documentodetransporteproduccion_7ds_11_tfalbcolnum = AV23TFAlbColNum ;
      AV93Documentotransporteproduccion_documentodetransporteproduccion_7ds_12_tfalbcolnum_to = AV24TFAlbColNum_To ;
      AV94Documentotransporteproduccion_documentodetransporteproduccion_7ds_13_tfalbtipcol = AV71TFAlbTipCol ;
      AV95Documentotransporteproduccion_documentodetransporteproduccion_7ds_14_tfalbtipcol_to = AV72TFAlbTipCol_To ;
      AV96Documentotransporteproduccion_documentodetransporteproduccion_7ds_15_tfalbnomcli = AV25TFAlbNomCli ;
      AV97Documentotransporteproduccion_documentodetransporteproduccion_7ds_16_tfalbnomcli_sel = AV26TFAlbNomCli_Sel ;
      AV98Documentotransporteproduccion_documentodetransporteproduccion_7ds_17_tfbaralbkgme = AV27TFBarAlbKgmE ;
      AV99Documentotransporteproduccion_documentodetransporteproduccion_7ds_18_tfbaralbkgme_to = AV28TFBarAlbKgmE_To ;
      AV100Documentotransporteproduccion_documentodetransporteproduccion_7ds_19_tfalbhdranc = AV29TFAlbHdrAnc ;
      AV101Documentotransporteproduccion_documentodetransporteproduccion_7ds_20_tfalbhdranc_to = AV30TFAlbHdrAnc_To ;
      AV102Documentotransporteproduccion_documentodetransporteproduccion_7ds_21_tfalbhdrgm2 = AV31TFAlbHdrgm2 ;
      AV103Documentotransporteproduccion_documentodetransporteproduccion_7ds_22_tfalbhdrgm2_to = AV32TFAlbHdrgm2_To ;
      AV104Documentotransporteproduccion_documentodetransporteproduccion_7ds_23_tfbaralbmtre = AV33TFBarAlbMtrE ;
      AV105Documentotransporteproduccion_documentodetransporteproduccion_7ds_24_tfbaralbmtre_to = AV34TFBarAlbMtrE_To ;
      AV106Documentotransporteproduccion_documentodetransporteproduccion_7ds_25_tfbaralbpie = AV35TFBarAlbPie ;
      AV107Documentotransporteproduccion_documentodetransporteproduccion_7ds_26_tfbaralbpie_to = AV36TFBarAlbPie_To ;
      AV108Documentotransporteproduccion_documentodetransporteproduccion_7ds_27_tftubcod = AV37TFTubCod ;
      AV109Documentotransporteproduccion_documentodetransporteproduccion_7ds_28_tftubcod_to = AV38TFTubCod_To ;
      AV110Documentotransporteproduccion_documentodetransporteproduccion_7ds_29_tfbaralbtub = AV39TFBarAlbTub ;
      AV111Documentotransporteproduccion_documentodetransporteproduccion_7ds_30_tfbaralbtub_to = AV40TFBarAlbTub_To ;
      AV112Documentotransporteproduccion_documentodetransporteproduccion_7ds_31_tfplascod = AV41TFPlasCod ;
      AV113Documentotransporteproduccion_documentodetransporteproduccion_7ds_32_tfplascod_to = AV42TFPlasCod_To ;
      AV114Documentotransporteproduccion_documentodetransporteproduccion_7ds_33_tfbaralbplas = AV43TFBarAlbPlas ;
      AV115Documentotransporteproduccion_documentodetransporteproduccion_7ds_34_tfbaralbplas_to = AV44TFBarAlbPlas_To ;
      AV116Documentotransporteproduccion_documentodetransporteproduccion_7ds_35_tfalbhdrobs = AV45TFAlbHdrObs ;
      AV117Documentotransporteproduccion_documentodetransporteproduccion_7ds_36_tfalbhdrobs_sel = AV46TFAlbHdrObs_Sel ;
      AV118Documentotransporteproduccion_documentodetransporteproduccion_7ds_37_tfalbproval_sels = AV48TFAlbProVal_Sels ;
      AV119Documentotransporteproduccion_documentodetransporteproduccion_7ds_38_tfbarsit = AV59TFBarSit ;
      AV120Documentotransporteproduccion_documentodetransporteproduccion_7ds_39_tfbarsit_to = AV60TFBarSit_To ;
      AV121Documentotransporteproduccion_documentodetransporteproduccion_7ds_40_tfbartipcor_sel = AV73TFBarTipCor_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV53Emprcod, AV54AlbProcod, AV15TFBarNHdr, AV16TFBarNHdr_Sel, AV69TFAlbEncCli, AV70TFAlbEncCli_Sel, AV17TFAlbSer, AV18TFAlbSer_Sel, AV19TFAlbSerD, AV20TFAlbSerD_Sel, AV21TFAlbColNom, AV22TFAlbColNom_Sel, AV23TFAlbColNum, AV24TFAlbColNum_To, AV71TFAlbTipCol, AV72TFAlbTipCol_To, AV25TFAlbNomCli, AV26TFAlbNomCli_Sel, AV27TFBarAlbKgmE, AV28TFBarAlbKgmE_To, AV29TFAlbHdrAnc, AV30TFAlbHdrAnc_To, AV31TFAlbHdrgm2, AV32TFAlbHdrgm2_To, AV33TFBarAlbMtrE, AV34TFBarAlbMtrE_To, AV35TFBarAlbPie, AV36TFBarAlbPie_To, AV37TFTubCod, AV38TFTubCod_To, AV39TFBarAlbTub, AV40TFBarAlbTub_To, AV41TFPlasCod, AV42TFPlasCod_To, AV43TFBarAlbPlas, AV44TFBarAlbPlas_To, AV45TFAlbHdrObs, AV46TFAlbHdrObs_Sel, AV48TFAlbProVal_Sels, AV59TFBarSit, AV60TFBarSit_To, AV73TFBarTipCor_Sel, AV81Pgmname, AV12OrderedBy, AV13OrderedDsc, AV62Guiremcli, AV63GuiRemCln, AV64AlbProFch, AV65AlbSec, AV66AlbPropri, AV67AlbEnvFtp, AV68AlbLic, Gx_mode, AV74Moda21, AV76Mensaje, A396EmprCod, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid_previouspage( )
   {
      AV82Documentotransporteproduccion_documentodetransporteproduccion_7ds_1_tfbarnhdr = AV15TFBarNHdr ;
      AV83Documentotransporteproduccion_documentodetransporteproduccion_7ds_2_tfbarnhdr_sel = AV16TFBarNHdr_Sel ;
      AV84Documentotransporteproduccion_documentodetransporteproduccion_7ds_3_tfalbenccli = AV69TFAlbEncCli ;
      AV85Documentotransporteproduccion_documentodetransporteproduccion_7ds_4_tfalbenccli_sel = AV70TFAlbEncCli_Sel ;
      AV86Documentotransporteproduccion_documentodetransporteproduccion_7ds_5_tfalbser = AV17TFAlbSer ;
      AV87Documentotransporteproduccion_documentodetransporteproduccion_7ds_6_tfalbser_sel = AV18TFAlbSer_Sel ;
      AV88Documentotransporteproduccion_documentodetransporteproduccion_7ds_7_tfalbserd = AV19TFAlbSerD ;
      AV89Documentotransporteproduccion_documentodetransporteproduccion_7ds_8_tfalbserd_sel = AV20TFAlbSerD_Sel ;
      AV90Documentotransporteproduccion_documentodetransporteproduccion_7ds_9_tfalbcolnom = AV21TFAlbColNom ;
      AV91Documentotransporteproduccion_documentodetransporteproduccion_7ds_10_tfalbcolnom_sel = AV22TFAlbColNom_Sel ;
      AV92Documentotransporteproduccion_documentodetransporteproduccion_7ds_11_tfalbcolnum = AV23TFAlbColNum ;
      AV93Documentotransporteproduccion_documentodetransporteproduccion_7ds_12_tfalbcolnum_to = AV24TFAlbColNum_To ;
      AV94Documentotransporteproduccion_documentodetransporteproduccion_7ds_13_tfalbtipcol = AV71TFAlbTipCol ;
      AV95Documentotransporteproduccion_documentodetransporteproduccion_7ds_14_tfalbtipcol_to = AV72TFAlbTipCol_To ;
      AV96Documentotransporteproduccion_documentodetransporteproduccion_7ds_15_tfalbnomcli = AV25TFAlbNomCli ;
      AV97Documentotransporteproduccion_documentodetransporteproduccion_7ds_16_tfalbnomcli_sel = AV26TFAlbNomCli_Sel ;
      AV98Documentotransporteproduccion_documentodetransporteproduccion_7ds_17_tfbaralbkgme = AV27TFBarAlbKgmE ;
      AV99Documentotransporteproduccion_documentodetransporteproduccion_7ds_18_tfbaralbkgme_to = AV28TFBarAlbKgmE_To ;
      AV100Documentotransporteproduccion_documentodetransporteproduccion_7ds_19_tfalbhdranc = AV29TFAlbHdrAnc ;
      AV101Documentotransporteproduccion_documentodetransporteproduccion_7ds_20_tfalbhdranc_to = AV30TFAlbHdrAnc_To ;
      AV102Documentotransporteproduccion_documentodetransporteproduccion_7ds_21_tfalbhdrgm2 = AV31TFAlbHdrgm2 ;
      AV103Documentotransporteproduccion_documentodetransporteproduccion_7ds_22_tfalbhdrgm2_to = AV32TFAlbHdrgm2_To ;
      AV104Documentotransporteproduccion_documentodetransporteproduccion_7ds_23_tfbaralbmtre = AV33TFBarAlbMtrE ;
      AV105Documentotransporteproduccion_documentodetransporteproduccion_7ds_24_tfbaralbmtre_to = AV34TFBarAlbMtrE_To ;
      AV106Documentotransporteproduccion_documentodetransporteproduccion_7ds_25_tfbaralbpie = AV35TFBarAlbPie ;
      AV107Documentotransporteproduccion_documentodetransporteproduccion_7ds_26_tfbaralbpie_to = AV36TFBarAlbPie_To ;
      AV108Documentotransporteproduccion_documentodetransporteproduccion_7ds_27_tftubcod = AV37TFTubCod ;
      AV109Documentotransporteproduccion_documentodetransporteproduccion_7ds_28_tftubcod_to = AV38TFTubCod_To ;
      AV110Documentotransporteproduccion_documentodetransporteproduccion_7ds_29_tfbaralbtub = AV39TFBarAlbTub ;
      AV111Documentotransporteproduccion_documentodetransporteproduccion_7ds_30_tfbaralbtub_to = AV40TFBarAlbTub_To ;
      AV112Documentotransporteproduccion_documentodetransporteproduccion_7ds_31_tfplascod = AV41TFPlasCod ;
      AV113Documentotransporteproduccion_documentodetransporteproduccion_7ds_32_tfplascod_to = AV42TFPlasCod_To ;
      AV114Documentotransporteproduccion_documentodetransporteproduccion_7ds_33_tfbaralbplas = AV43TFBarAlbPlas ;
      AV115Documentotransporteproduccion_documentodetransporteproduccion_7ds_34_tfbaralbplas_to = AV44TFBarAlbPlas_To ;
      AV116Documentotransporteproduccion_documentodetransporteproduccion_7ds_35_tfalbhdrobs = AV45TFAlbHdrObs ;
      AV117Documentotransporteproduccion_documentodetransporteproduccion_7ds_36_tfalbhdrobs_sel = AV46TFAlbHdrObs_Sel ;
      AV118Documentotransporteproduccion_documentodetransporteproduccion_7ds_37_tfalbproval_sels = AV48TFAlbProVal_Sels ;
      AV119Documentotransporteproduccion_documentodetransporteproduccion_7ds_38_tfbarsit = AV59TFBarSit ;
      AV120Documentotransporteproduccion_documentodetransporteproduccion_7ds_39_tfbarsit_to = AV60TFBarSit_To ;
      AV121Documentotransporteproduccion_documentodetransporteproduccion_7ds_40_tfbartipcor_sel = AV73TFBarTipCor_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV53Emprcod, AV54AlbProcod, AV15TFBarNHdr, AV16TFBarNHdr_Sel, AV69TFAlbEncCli, AV70TFAlbEncCli_Sel, AV17TFAlbSer, AV18TFAlbSer_Sel, AV19TFAlbSerD, AV20TFAlbSerD_Sel, AV21TFAlbColNom, AV22TFAlbColNom_Sel, AV23TFAlbColNum, AV24TFAlbColNum_To, AV71TFAlbTipCol, AV72TFAlbTipCol_To, AV25TFAlbNomCli, AV26TFAlbNomCli_Sel, AV27TFBarAlbKgmE, AV28TFBarAlbKgmE_To, AV29TFAlbHdrAnc, AV30TFAlbHdrAnc_To, AV31TFAlbHdrgm2, AV32TFAlbHdrgm2_To, AV33TFBarAlbMtrE, AV34TFBarAlbMtrE_To, AV35TFBarAlbPie, AV36TFBarAlbPie_To, AV37TFTubCod, AV38TFTubCod_To, AV39TFBarAlbTub, AV40TFBarAlbTub_To, AV41TFPlasCod, AV42TFPlasCod_To, AV43TFBarAlbPlas, AV44TFBarAlbPlas_To, AV45TFAlbHdrObs, AV46TFAlbHdrObs_Sel, AV48TFAlbProVal_Sels, AV59TFBarSit, AV60TFBarSit_To, AV73TFBarTipCor_Sel, AV81Pgmname, AV12OrderedBy, AV13OrderedDsc, AV62Guiremcli, AV63GuiRemCln, AV64AlbProFch, AV65AlbSec, AV66AlbPropri, AV67AlbEnvFtp, AV68AlbLic, Gx_mode, AV74Moda21, AV76Mensaje, A396EmprCod, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      AV82Documentotransporteproduccion_documentodetransporteproduccion_7ds_1_tfbarnhdr = AV15TFBarNHdr ;
      AV83Documentotransporteproduccion_documentodetransporteproduccion_7ds_2_tfbarnhdr_sel = AV16TFBarNHdr_Sel ;
      AV84Documentotransporteproduccion_documentodetransporteproduccion_7ds_3_tfalbenccli = AV69TFAlbEncCli ;
      AV85Documentotransporteproduccion_documentodetransporteproduccion_7ds_4_tfalbenccli_sel = AV70TFAlbEncCli_Sel ;
      AV86Documentotransporteproduccion_documentodetransporteproduccion_7ds_5_tfalbser = AV17TFAlbSer ;
      AV87Documentotransporteproduccion_documentodetransporteproduccion_7ds_6_tfalbser_sel = AV18TFAlbSer_Sel ;
      AV88Documentotransporteproduccion_documentodetransporteproduccion_7ds_7_tfalbserd = AV19TFAlbSerD ;
      AV89Documentotransporteproduccion_documentodetransporteproduccion_7ds_8_tfalbserd_sel = AV20TFAlbSerD_Sel ;
      AV90Documentotransporteproduccion_documentodetransporteproduccion_7ds_9_tfalbcolnom = AV21TFAlbColNom ;
      AV91Documentotransporteproduccion_documentodetransporteproduccion_7ds_10_tfalbcolnom_sel = AV22TFAlbColNom_Sel ;
      AV92Documentotransporteproduccion_documentodetransporteproduccion_7ds_11_tfalbcolnum = AV23TFAlbColNum ;
      AV93Documentotransporteproduccion_documentodetransporteproduccion_7ds_12_tfalbcolnum_to = AV24TFAlbColNum_To ;
      AV94Documentotransporteproduccion_documentodetransporteproduccion_7ds_13_tfalbtipcol = AV71TFAlbTipCol ;
      AV95Documentotransporteproduccion_documentodetransporteproduccion_7ds_14_tfalbtipcol_to = AV72TFAlbTipCol_To ;
      AV96Documentotransporteproduccion_documentodetransporteproduccion_7ds_15_tfalbnomcli = AV25TFAlbNomCli ;
      AV97Documentotransporteproduccion_documentodetransporteproduccion_7ds_16_tfalbnomcli_sel = AV26TFAlbNomCli_Sel ;
      AV98Documentotransporteproduccion_documentodetransporteproduccion_7ds_17_tfbaralbkgme = AV27TFBarAlbKgmE ;
      AV99Documentotransporteproduccion_documentodetransporteproduccion_7ds_18_tfbaralbkgme_to = AV28TFBarAlbKgmE_To ;
      AV100Documentotransporteproduccion_documentodetransporteproduccion_7ds_19_tfalbhdranc = AV29TFAlbHdrAnc ;
      AV101Documentotransporteproduccion_documentodetransporteproduccion_7ds_20_tfalbhdranc_to = AV30TFAlbHdrAnc_To ;
      AV102Documentotransporteproduccion_documentodetransporteproduccion_7ds_21_tfalbhdrgm2 = AV31TFAlbHdrgm2 ;
      AV103Documentotransporteproduccion_documentodetransporteproduccion_7ds_22_tfalbhdrgm2_to = AV32TFAlbHdrgm2_To ;
      AV104Documentotransporteproduccion_documentodetransporteproduccion_7ds_23_tfbaralbmtre = AV33TFBarAlbMtrE ;
      AV105Documentotransporteproduccion_documentodetransporteproduccion_7ds_24_tfbaralbmtre_to = AV34TFBarAlbMtrE_To ;
      AV106Documentotransporteproduccion_documentodetransporteproduccion_7ds_25_tfbaralbpie = AV35TFBarAlbPie ;
      AV107Documentotransporteproduccion_documentodetransporteproduccion_7ds_26_tfbaralbpie_to = AV36TFBarAlbPie_To ;
      AV108Documentotransporteproduccion_documentodetransporteproduccion_7ds_27_tftubcod = AV37TFTubCod ;
      AV109Documentotransporteproduccion_documentodetransporteproduccion_7ds_28_tftubcod_to = AV38TFTubCod_To ;
      AV110Documentotransporteproduccion_documentodetransporteproduccion_7ds_29_tfbaralbtub = AV39TFBarAlbTub ;
      AV111Documentotransporteproduccion_documentodetransporteproduccion_7ds_30_tfbaralbtub_to = AV40TFBarAlbTub_To ;
      AV112Documentotransporteproduccion_documentodetransporteproduccion_7ds_31_tfplascod = AV41TFPlasCod ;
      AV113Documentotransporteproduccion_documentodetransporteproduccion_7ds_32_tfplascod_to = AV42TFPlasCod_To ;
      AV114Documentotransporteproduccion_documentodetransporteproduccion_7ds_33_tfbaralbplas = AV43TFBarAlbPlas ;
      AV115Documentotransporteproduccion_documentodetransporteproduccion_7ds_34_tfbaralbplas_to = AV44TFBarAlbPlas_To ;
      AV116Documentotransporteproduccion_documentodetransporteproduccion_7ds_35_tfalbhdrobs = AV45TFAlbHdrObs ;
      AV117Documentotransporteproduccion_documentodetransporteproduccion_7ds_36_tfalbhdrobs_sel = AV46TFAlbHdrObs_Sel ;
      AV118Documentotransporteproduccion_documentodetransporteproduccion_7ds_37_tfalbproval_sels = AV48TFAlbProVal_Sels ;
      AV119Documentotransporteproduccion_documentodetransporteproduccion_7ds_38_tfbarsit = AV59TFBarSit ;
      AV120Documentotransporteproduccion_documentodetransporteproduccion_7ds_39_tfbarsit_to = AV60TFBarSit_To ;
      AV121Documentotransporteproduccion_documentodetransporteproduccion_7ds_40_tfbartipcor_sel = AV73TFBarTipCor_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV53Emprcod, AV54AlbProcod, AV15TFBarNHdr, AV16TFBarNHdr_Sel, AV69TFAlbEncCli, AV70TFAlbEncCli_Sel, AV17TFAlbSer, AV18TFAlbSer_Sel, AV19TFAlbSerD, AV20TFAlbSerD_Sel, AV21TFAlbColNom, AV22TFAlbColNom_Sel, AV23TFAlbColNum, AV24TFAlbColNum_To, AV71TFAlbTipCol, AV72TFAlbTipCol_To, AV25TFAlbNomCli, AV26TFAlbNomCli_Sel, AV27TFBarAlbKgmE, AV28TFBarAlbKgmE_To, AV29TFAlbHdrAnc, AV30TFAlbHdrAnc_To, AV31TFAlbHdrgm2, AV32TFAlbHdrgm2_To, AV33TFBarAlbMtrE, AV34TFBarAlbMtrE_To, AV35TFBarAlbPie, AV36TFBarAlbPie_To, AV37TFTubCod, AV38TFTubCod_To, AV39TFBarAlbTub, AV40TFBarAlbTub_To, AV41TFPlasCod, AV42TFPlasCod_To, AV43TFBarAlbPlas, AV44TFBarAlbPlas_To, AV45TFAlbHdrObs, AV46TFAlbHdrObs_Sel, AV48TFAlbProVal_Sels, AV59TFBarSit, AV60TFBarSit_To, AV73TFBarTipCor_Sel, AV81Pgmname, AV12OrderedBy, AV13OrderedDsc, AV62Guiremcli, AV63GuiRemCln, AV64AlbProFch, AV65AlbSec, AV66AlbPropri, AV67AlbEnvFtp, AV68AlbLic, Gx_mode, AV74Moda21, AV76Mensaje, A396EmprCod, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid_gotopage( int nPageNo )
   {
      AV82Documentotransporteproduccion_documentodetransporteproduccion_7ds_1_tfbarnhdr = AV15TFBarNHdr ;
      AV83Documentotransporteproduccion_documentodetransporteproduccion_7ds_2_tfbarnhdr_sel = AV16TFBarNHdr_Sel ;
      AV84Documentotransporteproduccion_documentodetransporteproduccion_7ds_3_tfalbenccli = AV69TFAlbEncCli ;
      AV85Documentotransporteproduccion_documentodetransporteproduccion_7ds_4_tfalbenccli_sel = AV70TFAlbEncCli_Sel ;
      AV86Documentotransporteproduccion_documentodetransporteproduccion_7ds_5_tfalbser = AV17TFAlbSer ;
      AV87Documentotransporteproduccion_documentodetransporteproduccion_7ds_6_tfalbser_sel = AV18TFAlbSer_Sel ;
      AV88Documentotransporteproduccion_documentodetransporteproduccion_7ds_7_tfalbserd = AV19TFAlbSerD ;
      AV89Documentotransporteproduccion_documentodetransporteproduccion_7ds_8_tfalbserd_sel = AV20TFAlbSerD_Sel ;
      AV90Documentotransporteproduccion_documentodetransporteproduccion_7ds_9_tfalbcolnom = AV21TFAlbColNom ;
      AV91Documentotransporteproduccion_documentodetransporteproduccion_7ds_10_tfalbcolnom_sel = AV22TFAlbColNom_Sel ;
      AV92Documentotransporteproduccion_documentodetransporteproduccion_7ds_11_tfalbcolnum = AV23TFAlbColNum ;
      AV93Documentotransporteproduccion_documentodetransporteproduccion_7ds_12_tfalbcolnum_to = AV24TFAlbColNum_To ;
      AV94Documentotransporteproduccion_documentodetransporteproduccion_7ds_13_tfalbtipcol = AV71TFAlbTipCol ;
      AV95Documentotransporteproduccion_documentodetransporteproduccion_7ds_14_tfalbtipcol_to = AV72TFAlbTipCol_To ;
      AV96Documentotransporteproduccion_documentodetransporteproduccion_7ds_15_tfalbnomcli = AV25TFAlbNomCli ;
      AV97Documentotransporteproduccion_documentodetransporteproduccion_7ds_16_tfalbnomcli_sel = AV26TFAlbNomCli_Sel ;
      AV98Documentotransporteproduccion_documentodetransporteproduccion_7ds_17_tfbaralbkgme = AV27TFBarAlbKgmE ;
      AV99Documentotransporteproduccion_documentodetransporteproduccion_7ds_18_tfbaralbkgme_to = AV28TFBarAlbKgmE_To ;
      AV100Documentotransporteproduccion_documentodetransporteproduccion_7ds_19_tfalbhdranc = AV29TFAlbHdrAnc ;
      AV101Documentotransporteproduccion_documentodetransporteproduccion_7ds_20_tfalbhdranc_to = AV30TFAlbHdrAnc_To ;
      AV102Documentotransporteproduccion_documentodetransporteproduccion_7ds_21_tfalbhdrgm2 = AV31TFAlbHdrgm2 ;
      AV103Documentotransporteproduccion_documentodetransporteproduccion_7ds_22_tfalbhdrgm2_to = AV32TFAlbHdrgm2_To ;
      AV104Documentotransporteproduccion_documentodetransporteproduccion_7ds_23_tfbaralbmtre = AV33TFBarAlbMtrE ;
      AV105Documentotransporteproduccion_documentodetransporteproduccion_7ds_24_tfbaralbmtre_to = AV34TFBarAlbMtrE_To ;
      AV106Documentotransporteproduccion_documentodetransporteproduccion_7ds_25_tfbaralbpie = AV35TFBarAlbPie ;
      AV107Documentotransporteproduccion_documentodetransporteproduccion_7ds_26_tfbaralbpie_to = AV36TFBarAlbPie_To ;
      AV108Documentotransporteproduccion_documentodetransporteproduccion_7ds_27_tftubcod = AV37TFTubCod ;
      AV109Documentotransporteproduccion_documentodetransporteproduccion_7ds_28_tftubcod_to = AV38TFTubCod_To ;
      AV110Documentotransporteproduccion_documentodetransporteproduccion_7ds_29_tfbaralbtub = AV39TFBarAlbTub ;
      AV111Documentotransporteproduccion_documentodetransporteproduccion_7ds_30_tfbaralbtub_to = AV40TFBarAlbTub_To ;
      AV112Documentotransporteproduccion_documentodetransporteproduccion_7ds_31_tfplascod = AV41TFPlasCod ;
      AV113Documentotransporteproduccion_documentodetransporteproduccion_7ds_32_tfplascod_to = AV42TFPlasCod_To ;
      AV114Documentotransporteproduccion_documentodetransporteproduccion_7ds_33_tfbaralbplas = AV43TFBarAlbPlas ;
      AV115Documentotransporteproduccion_documentodetransporteproduccion_7ds_34_tfbaralbplas_to = AV44TFBarAlbPlas_To ;
      AV116Documentotransporteproduccion_documentodetransporteproduccion_7ds_35_tfalbhdrobs = AV45TFAlbHdrObs ;
      AV117Documentotransporteproduccion_documentodetransporteproduccion_7ds_36_tfalbhdrobs_sel = AV46TFAlbHdrObs_Sel ;
      AV118Documentotransporteproduccion_documentodetransporteproduccion_7ds_37_tfalbproval_sels = AV48TFAlbProVal_Sels ;
      AV119Documentotransporteproduccion_documentodetransporteproduccion_7ds_38_tfbarsit = AV59TFBarSit ;
      AV120Documentotransporteproduccion_documentodetransporteproduccion_7ds_39_tfbarsit_to = AV60TFBarSit_To ;
      AV121Documentotransporteproduccion_documentodetransporteproduccion_7ds_40_tfbartipcor_sel = AV73TFBarTipCor_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV53Emprcod, AV54AlbProcod, AV15TFBarNHdr, AV16TFBarNHdr_Sel, AV69TFAlbEncCli, AV70TFAlbEncCli_Sel, AV17TFAlbSer, AV18TFAlbSer_Sel, AV19TFAlbSerD, AV20TFAlbSerD_Sel, AV21TFAlbColNom, AV22TFAlbColNom_Sel, AV23TFAlbColNum, AV24TFAlbColNum_To, AV71TFAlbTipCol, AV72TFAlbTipCol_To, AV25TFAlbNomCli, AV26TFAlbNomCli_Sel, AV27TFBarAlbKgmE, AV28TFBarAlbKgmE_To, AV29TFAlbHdrAnc, AV30TFAlbHdrAnc_To, AV31TFAlbHdrgm2, AV32TFAlbHdrgm2_To, AV33TFBarAlbMtrE, AV34TFBarAlbMtrE_To, AV35TFBarAlbPie, AV36TFBarAlbPie_To, AV37TFTubCod, AV38TFTubCod_To, AV39TFBarAlbTub, AV40TFBarAlbTub_To, AV41TFPlasCod, AV42TFPlasCod_To, AV43TFBarAlbPlas, AV44TFBarAlbPlas_To, AV45TFAlbHdrObs, AV46TFAlbHdrObs_Sel, AV48TFAlbProVal_Sels, AV59TFBarSit, AV60TFBarSit_To, AV73TFBarTipCor_Sel, AV81Pgmname, AV12OrderedBy, AV13OrderedDsc, AV62Guiremcli, AV63GuiRemCln, AV64AlbProFch, AV65AlbSec, AV66AlbPropri, AV67AlbEnvFtp, AV68AlbLic, Gx_mode, AV74Moda21, AV76Mensaje, A396EmprCod, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV81Pgmname = "DocumentoTransporteProduccion.DocumentodeTransporteProduccion_7" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV81Pgmname", AV81Pgmname);
      Gx_err = (short)(0) ;
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup2520( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e142522 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vDDO_TITLESETTINGSICONS"), AV49DDO_TitleSettingsIcons);
         /* Read saved values. */
         nRC_GXsfl_15 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_15"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV51GridCurrentPage = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV52GridPageCount = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         wcpOAV53Emprcod = httpContext.cgiGet( sPrefix+"wcpOAV53Emprcod") ;
         wcpOAV54AlbProcod = localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV54AlbProcod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         wcpOAV62Guiremcli = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV62Guiremcli"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV63GuiRemCln = httpContext.cgiGet( sPrefix+"wcpOAV63GuiRemCln") ;
         wcpOAV64AlbProFch = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV64AlbProFch"), 0) ;
         wcpOAV65AlbSec = httpContext.cgiGet( sPrefix+"wcpOAV65AlbSec") ;
         wcpOAV66AlbPropri = httpContext.cgiGet( sPrefix+"wcpOAV66AlbPropri") ;
         wcpOAV67AlbEnvFtp = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV67AlbEnvFtp"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV68AlbLic = httpContext.cgiGet( sPrefix+"wcpOAV68AlbLic") ;
         wcpOGx_mode = httpContext.cgiGet( sPrefix+"wcpOGx_mode") ;
         GRID_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( sPrefix+"GRID_nFirstRecordOnPage"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         GRID_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRID_nEOF"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
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
         Ddo_grid_Sortedstatus = httpContext.cgiGet( sPrefix+"DDO_GRID_Sortedstatus") ;
         Ddo_grid_Includefilter = httpContext.cgiGet( sPrefix+"DDO_GRID_Includefilter") ;
         Ddo_grid_Filtertype = httpContext.cgiGet( sPrefix+"DDO_GRID_Filtertype") ;
         Ddo_grid_Filterisrange = httpContext.cgiGet( sPrefix+"DDO_GRID_Filterisrange") ;
         Ddo_grid_Includedatalist = httpContext.cgiGet( sPrefix+"DDO_GRID_Includedatalist") ;
         Ddo_grid_Datalisttype = httpContext.cgiGet( sPrefix+"DDO_GRID_Datalisttype") ;
         Ddo_grid_Allowmultipleselection = httpContext.cgiGet( sPrefix+"DDO_GRID_Allowmultipleselection") ;
         Ddo_grid_Datalistfixedvalues = httpContext.cgiGet( sPrefix+"DDO_GRID_Datalistfixedvalues") ;
         Ddo_grid_Datalistproc = httpContext.cgiGet( sPrefix+"DDO_GRID_Datalistproc") ;
         Grid_empowerer_Gridinternalname = httpContext.cgiGet( sPrefix+"GRID_EMPOWERER_Gridinternalname") ;
         Grid_empowerer_Hastitlesettings = GXutil.strtobool( httpContext.cgiGet( sPrefix+"GRID_EMPOWERER_Hastitlesettings")) ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
         Gridpaginationbar_Selectedpage = httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Selectedpage") ;
         Gridpaginationbar_Rowsperpageselectedvalue = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Rowsperpageselectedvalue"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Ddo_grid_Activeeventkey = httpContext.cgiGet( sPrefix+"DDO_GRID_Activeeventkey") ;
         Ddo_grid_Selectedvalue_get = httpContext.cgiGet( sPrefix+"DDO_GRID_Selectedvalue_get") ;
         Ddo_grid_Filteredtextto_get = httpContext.cgiGet( sPrefix+"DDO_GRID_Filteredtextto_get") ;
         Ddo_grid_Filteredtext_get = httpContext.cgiGet( sPrefix+"DDO_GRID_Filteredtext_get") ;
         Ddo_grid_Selectedcolumn = httpContext.cgiGet( sPrefix+"DDO_GRID_Selectedcolumn") ;
         /* Read variables values. */
         AV81Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV81Pgmname", AV81Pgmname);
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"DocumentodeTransporteProduccion_7");
         AV81Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV81Pgmname", AV81Pgmname);
         forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV81Pgmname, "")));
         hsh = httpContext.cgiGet( sPrefix+"hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("documentotransporteproduccion\\documentodetransporteproduccion_7:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
      e142522 ();
      if (returnInSub) return;
   }

   public void e142522( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV55Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      documentodetransporteproduccion_7_impl.this.GXt_char1 = GXv_char2[0] ;
      AV55Station = GXt_char1 ;
      GXv_char2[0] = AV53Emprcod ;
      GXv_char3[0] = AV57EmprNom ;
      GXv_char4[0] = AV56UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV55Station, GXv_char2, GXv_char3, GXv_char4) ;
      documentodetransporteproduccion_7_impl.this.AV53Emprcod = GXv_char2[0] ;
      documentodetransporteproduccion_7_impl.this.AV57EmprNom = GXv_char3[0] ;
      documentodetransporteproduccion_7_impl.this.AV56UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV53Emprcod", AV53Emprcod);
      /* Execute user subroutine: 'ATTRIBUTESSECURITYCODE' */
      S112 ();
      if (returnInSub) return;
      subGrid_Rows = 10 ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      Grid_empowerer_Gridinternalname = subGrid_Internalname ;
      ucGrid_empowerer.sendProperty(context, sPrefix, false, Grid_empowerer_Internalname, "GridInternalName", Grid_empowerer_Gridinternalname);
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
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = AV49DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] ;
      AV49DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, sPrefix, false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
   }

   public void e152522( )
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
      /* Execute user subroutine: 'SAVEGRIDSTATE' */
      S152 ();
      if (returnInSub) return;
      AV51GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV51GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV51GridCurrentPage), 10, 0));
      AV52GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV52GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV52GridPageCount), 10, 0));
      AV82Documentotransporteproduccion_documentodetransporteproduccion_7ds_1_tfbarnhdr = AV15TFBarNHdr ;
      AV83Documentotransporteproduccion_documentodetransporteproduccion_7ds_2_tfbarnhdr_sel = AV16TFBarNHdr_Sel ;
      AV84Documentotransporteproduccion_documentodetransporteproduccion_7ds_3_tfalbenccli = AV69TFAlbEncCli ;
      AV85Documentotransporteproduccion_documentodetransporteproduccion_7ds_4_tfalbenccli_sel = AV70TFAlbEncCli_Sel ;
      AV86Documentotransporteproduccion_documentodetransporteproduccion_7ds_5_tfalbser = AV17TFAlbSer ;
      AV87Documentotransporteproduccion_documentodetransporteproduccion_7ds_6_tfalbser_sel = AV18TFAlbSer_Sel ;
      AV88Documentotransporteproduccion_documentodetransporteproduccion_7ds_7_tfalbserd = AV19TFAlbSerD ;
      AV89Documentotransporteproduccion_documentodetransporteproduccion_7ds_8_tfalbserd_sel = AV20TFAlbSerD_Sel ;
      AV90Documentotransporteproduccion_documentodetransporteproduccion_7ds_9_tfalbcolnom = AV21TFAlbColNom ;
      AV91Documentotransporteproduccion_documentodetransporteproduccion_7ds_10_tfalbcolnom_sel = AV22TFAlbColNom_Sel ;
      AV92Documentotransporteproduccion_documentodetransporteproduccion_7ds_11_tfalbcolnum = AV23TFAlbColNum ;
      AV93Documentotransporteproduccion_documentodetransporteproduccion_7ds_12_tfalbcolnum_to = AV24TFAlbColNum_To ;
      AV94Documentotransporteproduccion_documentodetransporteproduccion_7ds_13_tfalbtipcol = AV71TFAlbTipCol ;
      AV95Documentotransporteproduccion_documentodetransporteproduccion_7ds_14_tfalbtipcol_to = AV72TFAlbTipCol_To ;
      AV96Documentotransporteproduccion_documentodetransporteproduccion_7ds_15_tfalbnomcli = AV25TFAlbNomCli ;
      AV97Documentotransporteproduccion_documentodetransporteproduccion_7ds_16_tfalbnomcli_sel = AV26TFAlbNomCli_Sel ;
      AV98Documentotransporteproduccion_documentodetransporteproduccion_7ds_17_tfbaralbkgme = AV27TFBarAlbKgmE ;
      AV99Documentotransporteproduccion_documentodetransporteproduccion_7ds_18_tfbaralbkgme_to = AV28TFBarAlbKgmE_To ;
      AV100Documentotransporteproduccion_documentodetransporteproduccion_7ds_19_tfalbhdranc = AV29TFAlbHdrAnc ;
      AV101Documentotransporteproduccion_documentodetransporteproduccion_7ds_20_tfalbhdranc_to = AV30TFAlbHdrAnc_To ;
      AV102Documentotransporteproduccion_documentodetransporteproduccion_7ds_21_tfalbhdrgm2 = AV31TFAlbHdrgm2 ;
      AV103Documentotransporteproduccion_documentodetransporteproduccion_7ds_22_tfalbhdrgm2_to = AV32TFAlbHdrgm2_To ;
      AV104Documentotransporteproduccion_documentodetransporteproduccion_7ds_23_tfbaralbmtre = AV33TFBarAlbMtrE ;
      AV105Documentotransporteproduccion_documentodetransporteproduccion_7ds_24_tfbaralbmtre_to = AV34TFBarAlbMtrE_To ;
      AV106Documentotransporteproduccion_documentodetransporteproduccion_7ds_25_tfbaralbpie = AV35TFBarAlbPie ;
      AV107Documentotransporteproduccion_documentodetransporteproduccion_7ds_26_tfbaralbpie_to = AV36TFBarAlbPie_To ;
      AV108Documentotransporteproduccion_documentodetransporteproduccion_7ds_27_tftubcod = AV37TFTubCod ;
      AV109Documentotransporteproduccion_documentodetransporteproduccion_7ds_28_tftubcod_to = AV38TFTubCod_To ;
      AV110Documentotransporteproduccion_documentodetransporteproduccion_7ds_29_tfbaralbtub = AV39TFBarAlbTub ;
      AV111Documentotransporteproduccion_documentodetransporteproduccion_7ds_30_tfbaralbtub_to = AV40TFBarAlbTub_To ;
      AV112Documentotransporteproduccion_documentodetransporteproduccion_7ds_31_tfplascod = AV41TFPlasCod ;
      AV113Documentotransporteproduccion_documentodetransporteproduccion_7ds_32_tfplascod_to = AV42TFPlasCod_To ;
      AV114Documentotransporteproduccion_documentodetransporteproduccion_7ds_33_tfbaralbplas = AV43TFBarAlbPlas ;
      AV115Documentotransporteproduccion_documentodetransporteproduccion_7ds_34_tfbaralbplas_to = AV44TFBarAlbPlas_To ;
      AV116Documentotransporteproduccion_documentodetransporteproduccion_7ds_35_tfalbhdrobs = AV45TFAlbHdrObs ;
      AV117Documentotransporteproduccion_documentodetransporteproduccion_7ds_36_tfalbhdrobs_sel = AV46TFAlbHdrObs_Sel ;
      AV118Documentotransporteproduccion_documentodetransporteproduccion_7ds_37_tfalbproval_sels = AV48TFAlbProVal_Sels ;
      AV119Documentotransporteproduccion_documentodetransporteproduccion_7ds_38_tfbarsit = AV59TFBarSit ;
      AV120Documentotransporteproduccion_documentodetransporteproduccion_7ds_39_tfbarsit_to = AV60TFBarSit_To ;
      AV121Documentotransporteproduccion_documentodetransporteproduccion_7ds_40_tfbartipcor_sel = AV73TFBarTipCor_Sel ;
      /*  Sending Event outputs  */
   }

   public void e112522( )
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
         AV50PageToGo = (int)(GXutil.lval( Gridpaginationbar_Selectedpage)) ;
         subgrid_gotopage( AV50PageToGo) ;
      }
   }

   public void e122522( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   public void e132522( )
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
         if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarNHdr") == 0 )
         {
            AV15TFBarNHdr = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV15TFBarNHdr", AV15TFBarNHdr);
            AV16TFBarNHdr_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV16TFBarNHdr_Sel", AV16TFBarNHdr_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbEncCli") == 0 )
         {
            AV69TFAlbEncCli = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV69TFAlbEncCli", AV69TFAlbEncCli);
            AV70TFAlbEncCli_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV70TFAlbEncCli_Sel", AV70TFAlbEncCli_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbSer") == 0 )
         {
            AV17TFAlbSer = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV17TFAlbSer", AV17TFAlbSer);
            AV18TFAlbSer_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV18TFAlbSer_Sel", AV18TFAlbSer_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbSerD") == 0 )
         {
            AV19TFAlbSerD = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV19TFAlbSerD", AV19TFAlbSerD);
            AV20TFAlbSerD_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV20TFAlbSerD_Sel", AV20TFAlbSerD_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbColNom") == 0 )
         {
            AV21TFAlbColNom = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV21TFAlbColNom", AV21TFAlbColNom);
            AV22TFAlbColNom_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV22TFAlbColNom_Sel", AV22TFAlbColNom_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbColNum") == 0 )
         {
            AV23TFAlbColNum = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV23TFAlbColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV23TFAlbColNum), 6, 0));
            AV24TFAlbColNum_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV24TFAlbColNum_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV24TFAlbColNum_To), 6, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbTipCol") == 0 )
         {
            AV71TFAlbTipCol = (byte)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV71TFAlbTipCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV71TFAlbTipCol), 2, 0));
            AV72TFAlbTipCol_To = (byte)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV72TFAlbTipCol_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV72TFAlbTipCol_To), 2, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbNomCli") == 0 )
         {
            AV25TFAlbNomCli = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV25TFAlbNomCli", AV25TFAlbNomCli);
            AV26TFAlbNomCli_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV26TFAlbNomCli_Sel", AV26TFAlbNomCli_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarAlbKgmE") == 0 )
         {
            AV27TFBarAlbKgmE = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV27TFBarAlbKgmE", GXutil.ltrimstr( AV27TFBarAlbKgmE, 9, 2));
            AV28TFBarAlbKgmE_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV28TFBarAlbKgmE_To", GXutil.ltrimstr( AV28TFBarAlbKgmE_To, 9, 2));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbHdrAnc") == 0 )
         {
            AV29TFAlbHdrAnc = (short)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV29TFAlbHdrAnc", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29TFAlbHdrAnc), 4, 0));
            AV30TFAlbHdrAnc_To = (short)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV30TFAlbHdrAnc_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV30TFAlbHdrAnc_To), 4, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbHdrgm2") == 0 )
         {
            AV31TFAlbHdrgm2 = (short)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV31TFAlbHdrgm2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV31TFAlbHdrgm2), 4, 0));
            AV32TFAlbHdrgm2_To = (short)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32TFAlbHdrgm2_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV32TFAlbHdrgm2_To), 4, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarAlbMtrE") == 0 )
         {
            AV33TFBarAlbMtrE = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33TFBarAlbMtrE", GXutil.ltrimstr( AV33TFBarAlbMtrE, 9, 2));
            AV34TFBarAlbMtrE_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34TFBarAlbMtrE_To", GXutil.ltrimstr( AV34TFBarAlbMtrE_To, 9, 2));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarAlbPie") == 0 )
         {
            AV35TFBarAlbPie = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV35TFBarAlbPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV35TFBarAlbPie), 6, 0));
            AV36TFBarAlbPie_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36TFBarAlbPie_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36TFBarAlbPie_To), 6, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "TubCod") == 0 )
         {
            AV37TFTubCod = (short)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37TFTubCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV37TFTubCod), 4, 0));
            AV38TFTubCod_To = (short)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV38TFTubCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV38TFTubCod_To), 4, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarAlbTub") == 0 )
         {
            AV39TFBarAlbTub = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV39TFBarAlbTub", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV39TFBarAlbTub), 6, 0));
            AV40TFBarAlbTub_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV40TFBarAlbTub_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV40TFBarAlbTub_To), 6, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PlasCod") == 0 )
         {
            AV41TFPlasCod = (short)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV41TFPlasCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV41TFPlasCod), 4, 0));
            AV42TFPlasCod_To = (short)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV42TFPlasCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV42TFPlasCod_To), 4, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarAlbPlas") == 0 )
         {
            AV43TFBarAlbPlas = (short)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV43TFBarAlbPlas", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV43TFBarAlbPlas), 4, 0));
            AV44TFBarAlbPlas_To = (short)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV44TFBarAlbPlas_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV44TFBarAlbPlas_To), 4, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbHdrObs") == 0 )
         {
            AV45TFAlbHdrObs = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV45TFAlbHdrObs", AV45TFAlbHdrObs);
            AV46TFAlbHdrObs_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV46TFAlbHdrObs_Sel", AV46TFAlbHdrObs_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbProVal") == 0 )
         {
            AV47TFAlbProVal_SelsJson = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47TFAlbProVal_SelsJson", AV47TFAlbProVal_SelsJson);
            AV48TFAlbProVal_Sels.fromJSonString(AV47TFAlbProVal_SelsJson, null);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarSit") == 0 )
         {
            AV59TFBarSit = (byte)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV59TFBarSit", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV59TFBarSit), 2, 0));
            AV60TFBarSit_To = (byte)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV60TFBarSit_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV60TFBarSit_To), 2, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarTipCor") == 0 )
         {
            AV73TFBarTipCor_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV73TFBarTipCor_Sel", AV73TFBarTipCor_Sel);
         }
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV48TFAlbProVal_Sels", AV48TFAlbProVal_Sels);
   }

   private void e162522( )
   {
      /* Grid_Load Routine */
      returnInSub = false ;
      cmbavGridactiongroup1.removeAllItems();
      cmbavGridactiongroup1.addItem("0", ";fa fa-bars", (short)(0));
      if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
      {
         cmbavGridactiongroup1.addItem("1", GXutil.format( "%1;%2", httpContext.getMessage( "Modificar", ""), "fa fa-pen", "", "", "", "", "", "", ""), (short)(0));
      }
      GXt_int8 = (byte)(0) ;
      GXv_int9[0] = GXt_int8 ;
      new app.pexicon(remoteHandle, context).execute( AV53Emprcod, httpContext.getMessage( "MODA21", ""), GXv_int9) ;
      documentodetransporteproduccion_7_impl.this.GXt_int8 = GXv_int9[0] ;
      AV77TempBoolean = (boolean)((GXt_int8==1)) ;
      if ( AV77TempBoolean )
      {
         cmbavGridactiongroup1.addItem("2", GXutil.format( "%1;%2", httpContext.getMessage( "Ver Piezas", ""), "fa fa-search", "", "", "", "", "", "", ""), (short)(0));
      }
      cmbavGridactiongroup1.addItem("3", GXutil.format( "%1;%2", httpContext.getMessage( "Eliminar", ""), "fa fa-times", "", "", "", "", "", "", ""), (short)(0));
      /* Load Method */
      if ( wbStart != -1 )
      {
         wbStart = (short)(15) ;
      }
      sendrow_152( ) ;
      GRID_nCurrentRecord = (long)(GRID_nCurrentRecord+1) ;
      if ( isFullAjaxMode( ) && ! bGXsfl_15_Refreshing )
      {
         httpContext.doAjaxLoad(15, GridRow);
      }
      /*  Sending Event outputs  */
      cmbavGridactiongroup1.setValue( GXutil.trim( GXutil.str( AV61GridActionGroup1, 4, 0)) );
   }

   public void e172522( )
   {
      /* Gridactiongroup1_Click Routine */
      returnInSub = false ;
      if ( AV61GridActionGroup1 == 1 )
      {
         /* Execute user subroutine: 'DO MODIFICAR' */
         S162 ();
         if (returnInSub) return;
      }
      else if ( AV61GridActionGroup1 == 2 )
      {
         /* Execute user subroutine: 'DO VERPIEZAS' */
         S172 ();
         if (returnInSub) return;
      }
      else if ( AV61GridActionGroup1 == 3 )
      {
         /* Execute user subroutine: 'DO ELIMINAR' */
         S182 ();
         if (returnInSub) return;
      }
      AV61GridActionGroup1 = (short)(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, cmbavGridactiongroup1.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV61GridActionGroup1), 4, 0));
      /*  Sending Event outputs  */
      cmbavGridactiongroup1.setValue( GXutil.trim( GXutil.str( AV61GridActionGroup1, 4, 0)) );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbavGridactiongroup1.getInternalname(), "Values", cmbavGridactiongroup1.ToJavascriptSource(), true);
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
      /* 'DO MODIFICAR' Routine */
      returnInSub = false ;
      if ( ( AV67AlbEnvFtp == 3 ) || ( GXutil.strcmp(AV68AlbLic, " ") != 0 ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Atenção.Este guia foi enviado para AT ¡¡¡¡", ""));
      }
      else
      {
         httpContext.popup(formatLink("app.documentotransporteproduccion.documentodetransporteproduccion_3", new String[] {GXutil.URLEncode(GXutil.rtrim("UPD")),GXutil.URLEncode(GXutil.rtrim(AV53Emprcod)),GXutil.URLEncode(GXutil.ltrimstr(AV54AlbProcod,10,0)),GXutil.URLEncode(GXutil.ltrimstr(A129BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A132BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(A130BarCodPar)),GXutil.URLEncode(GXutil.ltrimstr(AV62Guiremcli,6,0)),GXutil.URLEncode(GXutil.rtrim(AV63GuiRemCln)),GXutil.URLEncode(GXutil.formatDateParm(AV64AlbProFch)),GXutil.URLEncode(GXutil.rtrim(AV65AlbSec)),GXutil.URLEncode(GXutil.rtrim(AV66AlbPropri)),GXutil.URLEncode(GXutil.ltrimstr(AV67AlbEnvFtp,1,0)),GXutil.URLEncode(GXutil.rtrim(AV68AlbLic))}, new String[] {"Mode","EmprCod","AlbProCod","BarCod","BarCodReo","BarCodPar","Guiremcli","GuiRemCln","AlbProFch","AlbSec","AlbProPri","AlbEnvFtp","AlbLic"}) , new Object[] {});
         httpContext.doAjaxRefreshCmp(sPrefix);
      }
   }

   public void S172( )
   {
      /* 'DO VERPIEZAS' Routine */
      returnInSub = false ;
      if ( ( AV74Moda21 == 1 ) && ( GXutil.strcmp(A5291BarTipCor, "SI") == 0 ) )
      {
         GXv_int10[0] = A1265BarAlbPie ;
         GXv_decimal11[0] = A1261BarAlbKgmE ;
         GXv_decimal12[0] = A1263BarAlbMtrE ;
         GXv_char4[0] = AV75MetPieCtr ;
         GXv_char3[0] = Gx_msg ;
         new app.pmetpiacopy1(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, AV54AlbProcod, GXv_int10, GXv_decimal11, GXv_decimal12, GXv_char4, GXv_char3) ;
         documentodetransporteproduccion_7_impl.this.A1265BarAlbPie = GXv_int10[0] ;
         documentodetransporteproduccion_7_impl.this.A1261BarAlbKgmE = GXv_decimal11[0] ;
         documentodetransporteproduccion_7_impl.this.A1263BarAlbMtrE = GXv_decimal12[0] ;
         documentodetransporteproduccion_7_impl.this.AV75MetPieCtr = GXv_char4[0] ;
         documentodetransporteproduccion_7_impl.this.Gx_msg = GXv_char3[0] ;
         httpContext.popup(formatLink("app.tmetpi", new String[] {GXutil.URLEncode(GXutil.rtrim("UPD")),GXutil.URLEncode(GXutil.rtrim(AV53Emprcod)),GXutil.URLEncode(GXutil.rtrim("9999999999")),GXutil.URLEncode(GXutil.ltrimstr(A129BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A132BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(A130BarCodPar)),GXutil.URLEncode(GXutil.ltrimstr(AV54AlbProcod,10,0)),GXutil.URLEncode(GXutil.ltrimstr(A1265BarAlbPie,6,0)),GXutil.URLEncode(DecimalUtil.decToString(A1261BarAlbKgmE)),GXutil.URLEncode(DecimalUtil.decToString(A1263BarAlbMtrE)),GXutil.URLEncode(GXutil.rtrim(AV75MetPieCtr)),GXutil.URLEncode(GXutil.rtrim(AV76Mensaje))}, new String[] {"Mode","EmprCod","MetTerCod","BarCod","BarCodReo","BarCodPar","AlbProcod","Pzs","Kgs","Mts","MetPiectr","Mensaje"}) , new Object[] {});
      }
      httpContext.doAjaxRefreshCmp(sPrefix);
   }

   public void S182( )
   {
      /* 'DO ELIMINAR' Routine */
      returnInSub = false ;
      if ( ( AV67AlbEnvFtp == 3 ) || ( GXutil.strcmp(AV68AlbLic, " ") != 0 ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Atenção.Este guia foi enviado para AT ¡¡¡¡", ""));
      }
      else
      {
         GXv_char4[0] = AV53Emprcod ;
         GXv_int13[0] = A30AlbProCod ;
         GXv_int10[0] = A129BarCod ;
         GXv_int9[0] = A132BarCodReo ;
         GXv_char3[0] = A130BarCodPar ;
         GXv_int14[0] = (byte)(1) ;
         new app.pelihoj(remoteHandle, context).execute( GXv_char4, GXv_int13, GXv_int10, GXv_int9, GXv_char3, GXv_int14) ;
         documentodetransporteproduccion_7_impl.this.AV53Emprcod = GXv_char4[0] ;
         documentodetransporteproduccion_7_impl.this.A30AlbProCod = GXv_int13[0] ;
         documentodetransporteproduccion_7_impl.this.A129BarCod = GXv_int10[0] ;
         documentodetransporteproduccion_7_impl.this.A132BarCodReo = GXv_int9[0] ;
         documentodetransporteproduccion_7_impl.this.A130BarCodPar = GXv_char3[0] ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV53Emprcod", AV53Emprcod);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
         GXv_char4[0] = AV53Emprcod ;
         GXv_int13[0] = A30AlbProCod ;
         GXv_int15[0] = AV58AlbContLin ;
         new app.plinalb(remoteHandle, context).execute( GXv_char4, GXv_int13, GXv_int15) ;
         documentodetransporteproduccion_7_impl.this.AV53Emprcod = GXv_char4[0] ;
         documentodetransporteproduccion_7_impl.this.A30AlbProCod = GXv_int13[0] ;
         documentodetransporteproduccion_7_impl.this.AV58AlbContLin = GXv_int15[0] ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV53Emprcod", AV53Emprcod);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV58AlbContLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV58AlbContLin), 4, 0));
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Eliminacion realizada", ""));
         httpContext.doAjaxRefreshCmp(sPrefix);
      }
   }

   public void S132( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV14Session.getValue(AV81Pgmname+"GridState"), "") == 0 )
      {
         AV10GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV81Pgmname+"GridState"), null, null);
      }
      else
      {
         AV10GridState.fromxml(AV14Session.getValue(AV81Pgmname+"GridState"), null, null);
      }
      AV12OrderedBy = AV10GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12OrderedBy), 4, 0));
      AV13OrderedDsc = AV10GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV13OrderedDsc", AV13OrderedDsc);
      /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
      S142 ();
      if (returnInSub) return;
      AV123GXV1 = 1 ;
      while ( AV123GXV1 <= AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV123GXV1));
         if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNHDR") == 0 )
         {
            AV15TFBarNHdr = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV15TFBarNHdr", AV15TFBarNHdr);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNHDR_SEL") == 0 )
         {
            AV16TFBarNHdr_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV16TFBarNHdr_Sel", AV16TFBarNHdr_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBENCCLI") == 0 )
         {
            AV69TFAlbEncCli = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV69TFAlbEncCli", AV69TFAlbEncCli);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBENCCLI_SEL") == 0 )
         {
            AV70TFAlbEncCli_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV70TFAlbEncCli_Sel", AV70TFAlbEncCli_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBSER") == 0 )
         {
            AV17TFAlbSer = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV17TFAlbSer", AV17TFAlbSer);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBSER_SEL") == 0 )
         {
            AV18TFAlbSer_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV18TFAlbSer_Sel", AV18TFAlbSer_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBSERD") == 0 )
         {
            AV19TFAlbSerD = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV19TFAlbSerD", AV19TFAlbSerD);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBSERD_SEL") == 0 )
         {
            AV20TFAlbSerD_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV20TFAlbSerD_Sel", AV20TFAlbSerD_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOLNOM") == 0 )
         {
            AV21TFAlbColNom = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV21TFAlbColNom", AV21TFAlbColNom);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOLNOM_SEL") == 0 )
         {
            AV22TFAlbColNom_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV22TFAlbColNom_Sel", AV22TFAlbColNom_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOLNUM") == 0 )
         {
            AV23TFAlbColNum = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV23TFAlbColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV23TFAlbColNum), 6, 0));
            AV24TFAlbColNum_To = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV24TFAlbColNum_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV24TFAlbColNum_To), 6, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBTIPCOL") == 0 )
         {
            AV71TFAlbTipCol = (byte)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV71TFAlbTipCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV71TFAlbTipCol), 2, 0));
            AV72TFAlbTipCol_To = (byte)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV72TFAlbTipCol_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV72TFAlbTipCol_To), 2, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBNOMCLI") == 0 )
         {
            AV25TFAlbNomCli = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV25TFAlbNomCli", AV25TFAlbNomCli);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBNOMCLI_SEL") == 0 )
         {
            AV26TFAlbNomCli_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV26TFAlbNomCli_Sel", AV26TFAlbNomCli_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARALBKGME") == 0 )
         {
            AV27TFBarAlbKgmE = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV27TFBarAlbKgmE", GXutil.ltrimstr( AV27TFBarAlbKgmE, 9, 2));
            AV28TFBarAlbKgmE_To = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV28TFBarAlbKgmE_To", GXutil.ltrimstr( AV28TFBarAlbKgmE_To, 9, 2));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBHDRANC") == 0 )
         {
            AV29TFAlbHdrAnc = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV29TFAlbHdrAnc", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29TFAlbHdrAnc), 4, 0));
            AV30TFAlbHdrAnc_To = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV30TFAlbHdrAnc_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV30TFAlbHdrAnc_To), 4, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBHDRGM2") == 0 )
         {
            AV31TFAlbHdrgm2 = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV31TFAlbHdrgm2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV31TFAlbHdrgm2), 4, 0));
            AV32TFAlbHdrgm2_To = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32TFAlbHdrgm2_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV32TFAlbHdrgm2_To), 4, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARALBMTRE") == 0 )
         {
            AV33TFBarAlbMtrE = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33TFBarAlbMtrE", GXutil.ltrimstr( AV33TFBarAlbMtrE, 9, 2));
            AV34TFBarAlbMtrE_To = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34TFBarAlbMtrE_To", GXutil.ltrimstr( AV34TFBarAlbMtrE_To, 9, 2));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARALBPIE") == 0 )
         {
            AV35TFBarAlbPie = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV35TFBarAlbPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV35TFBarAlbPie), 6, 0));
            AV36TFBarAlbPie_To = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36TFBarAlbPie_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36TFBarAlbPie_To), 6, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTUBCOD") == 0 )
         {
            AV37TFTubCod = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37TFTubCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV37TFTubCod), 4, 0));
            AV38TFTubCod_To = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV38TFTubCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV38TFTubCod_To), 4, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARALBTUB") == 0 )
         {
            AV39TFBarAlbTub = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV39TFBarAlbTub", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV39TFBarAlbTub), 6, 0));
            AV40TFBarAlbTub_To = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV40TFBarAlbTub_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV40TFBarAlbTub_To), 6, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPLASCOD") == 0 )
         {
            AV41TFPlasCod = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV41TFPlasCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV41TFPlasCod), 4, 0));
            AV42TFPlasCod_To = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV42TFPlasCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV42TFPlasCod_To), 4, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARALBPLAS") == 0 )
         {
            AV43TFBarAlbPlas = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV43TFBarAlbPlas", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV43TFBarAlbPlas), 4, 0));
            AV44TFBarAlbPlas_To = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV44TFBarAlbPlas_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV44TFBarAlbPlas_To), 4, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBHDROBS") == 0 )
         {
            AV45TFAlbHdrObs = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV45TFAlbHdrObs", AV45TFAlbHdrObs);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBHDROBS_SEL") == 0 )
         {
            AV46TFAlbHdrObs_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV46TFAlbHdrObs_Sel", AV46TFAlbHdrObs_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBPROVAL_SEL") == 0 )
         {
            AV47TFAlbProVal_SelsJson = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47TFAlbProVal_SelsJson", AV47TFAlbProVal_SelsJson);
            AV48TFAlbProVal_Sels.fromJSonString(AV47TFAlbProVal_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSIT") == 0 )
         {
            AV59TFBarSit = (byte)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV59TFBarSit", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV59TFBarSit), 2, 0));
            AV60TFBarSit_To = (byte)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV60TFBarSit_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV60TFBarSit_To), 2, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARTIPCOR_SEL") == 0 )
         {
            AV73TFBarTipCor_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV73TFBarTipCor_Sel", AV73TFBarTipCor_Sel);
         }
         AV123GXV1 = (int)(AV123GXV1+1) ;
      }
      GXt_char1 = "" ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV16TFBarNHdr_Sel)==0), AV16TFBarNHdr_Sel, GXv_char4) ;
      documentodetransporteproduccion_7_impl.this.GXt_char1 = GXv_char4[0] ;
      GXt_char16 = "" ;
      GXv_char3[0] = GXt_char16 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV70TFAlbEncCli_Sel)==0), AV70TFAlbEncCli_Sel, GXv_char3) ;
      documentodetransporteproduccion_7_impl.this.GXt_char16 = GXv_char3[0] ;
      GXt_char17 = "" ;
      GXv_char2[0] = GXt_char17 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV18TFAlbSer_Sel)==0), AV18TFAlbSer_Sel, GXv_char2) ;
      documentodetransporteproduccion_7_impl.this.GXt_char17 = GXv_char2[0] ;
      GXt_char18 = "" ;
      GXv_char19[0] = GXt_char18 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV20TFAlbSerD_Sel)==0), AV20TFAlbSerD_Sel, GXv_char19) ;
      documentodetransporteproduccion_7_impl.this.GXt_char18 = GXv_char19[0] ;
      GXt_char20 = "" ;
      GXv_char21[0] = GXt_char20 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV22TFAlbColNom_Sel)==0), AV22TFAlbColNom_Sel, GXv_char21) ;
      documentodetransporteproduccion_7_impl.this.GXt_char20 = GXv_char21[0] ;
      GXt_char22 = "" ;
      GXv_char23[0] = GXt_char22 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV26TFAlbNomCli_Sel)==0), AV26TFAlbNomCli_Sel, GXv_char23) ;
      documentodetransporteproduccion_7_impl.this.GXt_char22 = GXv_char23[0] ;
      GXt_char24 = "" ;
      GXv_char25[0] = GXt_char24 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV46TFAlbHdrObs_Sel)==0), AV46TFAlbHdrObs_Sel, GXv_char25) ;
      documentodetransporteproduccion_7_impl.this.GXt_char24 = GXv_char25[0] ;
      GXt_char26 = "" ;
      GXv_char27[0] = GXt_char26 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (AV48TFAlbProVal_Sels.size()==0), AV47TFAlbProVal_SelsJson, GXv_char27) ;
      documentodetransporteproduccion_7_impl.this.GXt_char26 = GXv_char27[0] ;
      GXt_char28 = "" ;
      GXv_char29[0] = GXt_char28 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV73TFBarTipCor_Sel)==0), AV73TFBarTipCor_Sel, GXv_char29) ;
      documentodetransporteproduccion_7_impl.this.GXt_char28 = GXv_char29[0] ;
      Ddo_grid_Selectedvalue_set = GXt_char1+"|"+GXt_char16+"|"+GXt_char17+"|"+GXt_char18+"|"+GXt_char20+"|||"+GXt_char22+"||||||||||"+GXt_char24+"|"+GXt_char26+"||"+GXt_char28 ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      GXt_char28 = "" ;
      GXv_char29[0] = GXt_char28 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV15TFBarNHdr)==0), AV15TFBarNHdr, GXv_char29) ;
      documentodetransporteproduccion_7_impl.this.GXt_char28 = GXv_char29[0] ;
      GXt_char26 = "" ;
      GXv_char27[0] = GXt_char26 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV69TFAlbEncCli)==0), AV69TFAlbEncCli, GXv_char27) ;
      documentodetransporteproduccion_7_impl.this.GXt_char26 = GXv_char27[0] ;
      GXt_char24 = "" ;
      GXv_char25[0] = GXt_char24 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV17TFAlbSer)==0), AV17TFAlbSer, GXv_char25) ;
      documentodetransporteproduccion_7_impl.this.GXt_char24 = GXv_char25[0] ;
      GXt_char22 = "" ;
      GXv_char23[0] = GXt_char22 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV19TFAlbSerD)==0), AV19TFAlbSerD, GXv_char23) ;
      documentodetransporteproduccion_7_impl.this.GXt_char22 = GXv_char23[0] ;
      GXt_char20 = "" ;
      GXv_char21[0] = GXt_char20 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV21TFAlbColNom)==0), AV21TFAlbColNom, GXv_char21) ;
      documentodetransporteproduccion_7_impl.this.GXt_char20 = GXv_char21[0] ;
      GXt_char18 = "" ;
      GXv_char19[0] = GXt_char18 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV25TFAlbNomCli)==0), AV25TFAlbNomCli, GXv_char19) ;
      documentodetransporteproduccion_7_impl.this.GXt_char18 = GXv_char19[0] ;
      GXt_char17 = "" ;
      GXv_char4[0] = GXt_char17 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV45TFAlbHdrObs)==0), AV45TFAlbHdrObs, GXv_char4) ;
      documentodetransporteproduccion_7_impl.this.GXt_char17 = GXv_char4[0] ;
      Ddo_grid_Filteredtext_set = GXt_char28+"|"+GXt_char26+"|"+GXt_char24+"|"+GXt_char22+"|"+GXt_char20+"|"+((0==AV23TFAlbColNum) ? "" : GXutil.str( AV23TFAlbColNum, 6, 0))+"|"+((0==AV71TFAlbTipCol) ? "" : GXutil.str( AV71TFAlbTipCol, 2, 0))+"|"+GXt_char18+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV27TFBarAlbKgmE)==0) ? "" : GXutil.str( AV27TFBarAlbKgmE, 9, 2))+"|"+((0==AV29TFAlbHdrAnc) ? "" : GXutil.str( AV29TFAlbHdrAnc, 4, 0))+"|"+((0==AV31TFAlbHdrgm2) ? "" : GXutil.str( AV31TFAlbHdrgm2, 4, 0))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV33TFBarAlbMtrE)==0) ? "" : GXutil.str( AV33TFBarAlbMtrE, 9, 2))+"|"+((0==AV35TFBarAlbPie) ? "" : GXutil.str( AV35TFBarAlbPie, 6, 0))+"|"+((0==AV37TFTubCod) ? "" : GXutil.str( AV37TFTubCod, 4, 0))+"|"+((0==AV39TFBarAlbTub) ? "" : GXutil.str( AV39TFBarAlbTub, 6, 0))+"|"+((0==AV41TFPlasCod) ? "" : GXutil.str( AV41TFPlasCod, 4, 0))+"|"+((0==AV43TFBarAlbPlas) ? "" : GXutil.str( AV43TFBarAlbPlas, 4, 0))+"|"+GXt_char17+"||"+((0==AV59TFBarSit) ? "" : GXutil.str( AV59TFBarSit, 2, 0))+"|" ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = "|||||"+((0==AV24TFAlbColNum_To) ? "" : GXutil.str( AV24TFAlbColNum_To, 6, 0))+"|"+((0==AV72TFAlbTipCol_To) ? "" : GXutil.str( AV72TFAlbTipCol_To, 2, 0))+"||"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV28TFBarAlbKgmE_To)==0) ? "" : GXutil.str( AV28TFBarAlbKgmE_To, 9, 2))+"|"+((0==AV30TFAlbHdrAnc_To) ? "" : GXutil.str( AV30TFAlbHdrAnc_To, 4, 0))+"|"+((0==AV32TFAlbHdrgm2_To) ? "" : GXutil.str( AV32TFAlbHdrgm2_To, 4, 0))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV34TFBarAlbMtrE_To)==0) ? "" : GXutil.str( AV34TFBarAlbMtrE_To, 9, 2))+"|"+((0==AV36TFBarAlbPie_To) ? "" : GXutil.str( AV36TFBarAlbPie_To, 6, 0))+"|"+((0==AV38TFTubCod_To) ? "" : GXutil.str( AV38TFTubCod_To, 4, 0))+"|"+((0==AV40TFBarAlbTub_To) ? "" : GXutil.str( AV40TFBarAlbTub_To, 6, 0))+"|"+((0==AV42TFPlasCod_To) ? "" : GXutil.str( AV42TFPlasCod_To, 4, 0))+"|"+((0==AV44TFBarAlbPlas_To) ? "" : GXutil.str( AV44TFBarAlbPlas_To, 4, 0))+"|||"+((0==AV60TFBarSit_To) ? "" : GXutil.str( AV60TFBarSit_To, 2, 0))+"|" ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
      if ( ! (GXutil.strcmp("", GXutil.trim( AV10GridState.getgxTv_SdtWWPGridState_Pagesize()))==0) )
      {
         subGrid_Rows = (int)(GXutil.lval( AV10GridState.getgxTv_SdtWWPGridState_Pagesize())) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      }
      subgrid_gotopage( AV10GridState.getgxTv_SdtWWPGridState_Currentpage()) ;
   }

   public void S152( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV10GridState.fromxml(AV14Session.getValue(AV81Pgmname+"GridState"), null, null);
      AV10GridState.setgxTv_SdtWWPGridState_Orderedby( AV12OrderedBy );
      AV10GridState.setgxTv_SdtWWPGridState_Ordereddsc( AV13OrderedDsc );
      AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState30[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState30, "TFBARNHDR", "", !(GXutil.strcmp("", AV15TFBarNHdr)==0), (short)(0), AV15TFBarNHdr, "", !(GXutil.strcmp("", AV16TFBarNHdr_Sel)==0), AV16TFBarNHdr_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState30[0] ;
      GXv_SdtWWPGridState30[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState30, "TFALBENCCLI", "", !(GXutil.strcmp("", AV69TFAlbEncCli)==0), (short)(0), AV69TFAlbEncCli, "", !(GXutil.strcmp("", AV70TFAlbEncCli_Sel)==0), AV70TFAlbEncCli_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState30[0] ;
      GXv_SdtWWPGridState30[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState30, "TFALBSER", "", !(GXutil.strcmp("", AV17TFAlbSer)==0), (short)(0), AV17TFAlbSer, "", !(GXutil.strcmp("", AV18TFAlbSer_Sel)==0), AV18TFAlbSer_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState30[0] ;
      GXv_SdtWWPGridState30[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState30, "TFALBSERD", "", !(GXutil.strcmp("", AV19TFAlbSerD)==0), (short)(0), AV19TFAlbSerD, "", !(GXutil.strcmp("", AV20TFAlbSerD_Sel)==0), AV20TFAlbSerD_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState30[0] ;
      GXv_SdtWWPGridState30[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState30, "TFALBCOLNOM", "", !(GXutil.strcmp("", AV21TFAlbColNom)==0), (short)(0), AV21TFAlbColNom, "", !(GXutil.strcmp("", AV22TFAlbColNom_Sel)==0), AV22TFAlbColNom_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState30[0] ;
      GXv_SdtWWPGridState30[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState30, "TFALBCOLNUM", "", !((0==AV23TFAlbColNum)&&(0==AV24TFAlbColNum_To)), (short)(0), GXutil.trim( GXutil.str( AV23TFAlbColNum, 6, 0)), GXutil.trim( GXutil.str( AV24TFAlbColNum_To, 6, 0))) ;
      AV10GridState = GXv_SdtWWPGridState30[0] ;
      GXv_SdtWWPGridState30[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState30, "TFALBTIPCOL", "", !((0==AV71TFAlbTipCol)&&(0==AV72TFAlbTipCol_To)), (short)(0), GXutil.trim( GXutil.str( AV71TFAlbTipCol, 2, 0)), GXutil.trim( GXutil.str( AV72TFAlbTipCol_To, 2, 0))) ;
      AV10GridState = GXv_SdtWWPGridState30[0] ;
      GXv_SdtWWPGridState30[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState30, "TFALBNOMCLI", "", !(GXutil.strcmp("", AV25TFAlbNomCli)==0), (short)(0), AV25TFAlbNomCli, "", !(GXutil.strcmp("", AV26TFAlbNomCli_Sel)==0), AV26TFAlbNomCli_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState30[0] ;
      GXv_SdtWWPGridState30[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState30, "TFBARALBKGME", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV27TFBarAlbKgmE)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV28TFBarAlbKgmE_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV27TFBarAlbKgmE, 9, 2)), GXutil.trim( GXutil.str( AV28TFBarAlbKgmE_To, 9, 2))) ;
      AV10GridState = GXv_SdtWWPGridState30[0] ;
      GXv_SdtWWPGridState30[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState30, "TFALBHDRANC", "", !((0==AV29TFAlbHdrAnc)&&(0==AV30TFAlbHdrAnc_To)), (short)(0), GXutil.trim( GXutil.str( AV29TFAlbHdrAnc, 4, 0)), GXutil.trim( GXutil.str( AV30TFAlbHdrAnc_To, 4, 0))) ;
      AV10GridState = GXv_SdtWWPGridState30[0] ;
      GXv_SdtWWPGridState30[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState30, "TFALBHDRGM2", "", !((0==AV31TFAlbHdrgm2)&&(0==AV32TFAlbHdrgm2_To)), (short)(0), GXutil.trim( GXutil.str( AV31TFAlbHdrgm2, 4, 0)), GXutil.trim( GXutil.str( AV32TFAlbHdrgm2_To, 4, 0))) ;
      AV10GridState = GXv_SdtWWPGridState30[0] ;
      GXv_SdtWWPGridState30[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState30, "TFBARALBMTRE", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV33TFBarAlbMtrE)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV34TFBarAlbMtrE_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV33TFBarAlbMtrE, 9, 2)), GXutil.trim( GXutil.str( AV34TFBarAlbMtrE_To, 9, 2))) ;
      AV10GridState = GXv_SdtWWPGridState30[0] ;
      GXv_SdtWWPGridState30[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState30, "TFBARALBPIE", "", !((0==AV35TFBarAlbPie)&&(0==AV36TFBarAlbPie_To)), (short)(0), GXutil.trim( GXutil.str( AV35TFBarAlbPie, 6, 0)), GXutil.trim( GXutil.str( AV36TFBarAlbPie_To, 6, 0))) ;
      AV10GridState = GXv_SdtWWPGridState30[0] ;
      GXv_SdtWWPGridState30[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState30, "TFTUBCOD", "", !((0==AV37TFTubCod)&&(0==AV38TFTubCod_To)), (short)(0), GXutil.trim( GXutil.str( AV37TFTubCod, 4, 0)), GXutil.trim( GXutil.str( AV38TFTubCod_To, 4, 0))) ;
      AV10GridState = GXv_SdtWWPGridState30[0] ;
      GXv_SdtWWPGridState30[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState30, "TFBARALBTUB", "", !((0==AV39TFBarAlbTub)&&(0==AV40TFBarAlbTub_To)), (short)(0), GXutil.trim( GXutil.str( AV39TFBarAlbTub, 6, 0)), GXutil.trim( GXutil.str( AV40TFBarAlbTub_To, 6, 0))) ;
      AV10GridState = GXv_SdtWWPGridState30[0] ;
      GXv_SdtWWPGridState30[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState30, "TFPLASCOD", "", !((0==AV41TFPlasCod)&&(0==AV42TFPlasCod_To)), (short)(0), GXutil.trim( GXutil.str( AV41TFPlasCod, 4, 0)), GXutil.trim( GXutil.str( AV42TFPlasCod_To, 4, 0))) ;
      AV10GridState = GXv_SdtWWPGridState30[0] ;
      GXv_SdtWWPGridState30[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState30, "TFBARALBPLAS", "", !((0==AV43TFBarAlbPlas)&&(0==AV44TFBarAlbPlas_To)), (short)(0), GXutil.trim( GXutil.str( AV43TFBarAlbPlas, 4, 0)), GXutil.trim( GXutil.str( AV44TFBarAlbPlas_To, 4, 0))) ;
      AV10GridState = GXv_SdtWWPGridState30[0] ;
      GXv_SdtWWPGridState30[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState30, "TFALBHDROBS", "", !(GXutil.strcmp("", AV45TFAlbHdrObs)==0), (short)(0), AV45TFAlbHdrObs, "", !(GXutil.strcmp("", AV46TFAlbHdrObs_Sel)==0), AV46TFAlbHdrObs_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState30[0] ;
      GXv_SdtWWPGridState30[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState30, "TFALBPROVAL_SEL", "", !(AV48TFAlbProVal_Sels.size()==0), (short)(0), AV48TFAlbProVal_Sels.toJSonString(false), "") ;
      AV10GridState = GXv_SdtWWPGridState30[0] ;
      GXv_SdtWWPGridState30[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState30, "TFBARSIT", "", !((0==AV59TFBarSit)&&(0==AV60TFBarSit_To)), (short)(0), GXutil.trim( GXutil.str( AV59TFBarSit, 2, 0)), GXutil.trim( GXutil.str( AV60TFBarSit_To, 2, 0))) ;
      AV10GridState = GXv_SdtWWPGridState30[0] ;
      GXv_SdtWWPGridState30[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState30, "TFBARTIPCOR_SEL", "", !(GXutil.strcmp("", AV73TFBarTipCor_Sel)==0), (short)(0), AV73TFBarTipCor_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState30[0] ;
      if ( ! (GXutil.strcmp("", AV53Emprcod)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&EMPRCOD" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV53Emprcod );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV54AlbProcod) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&ALBPROCOD" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV54AlbProcod, 10, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV62Guiremcli) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&GUIREMCLI" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV62Guiremcli, 6, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV63GuiRemCln)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&GUIREMCLN" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV63GuiRemCln );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV64AlbProFch)) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&ALBPROFCH" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( localUtil.dtoc( AV64AlbProFch, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV65AlbSec)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&ALBSEC" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV65AlbSec );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV66AlbPropri)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&ALBPROPRI" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV66AlbPropri );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV67AlbEnvFtp) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&ALBENVFTP" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV67AlbEnvFtp, 1, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV68AlbLic)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&ALBLIC" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV68AlbLic );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", Gx_mode)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&MODE" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( Gx_mode );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      AV10GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV10GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV81Pgmname+"GridState", AV10GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S122( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV8TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV81Pgmname );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( true );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV7HTTPRequest.getScriptName()+"?"+AV7HTTPRequest.getQuerystring() );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "DocumentoTransporteProduccion.DocumentodeTransporteProduccion_4" );
      AV14Session.setValue("TrnContext", AV8TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   public void S112( )
   {
      /* 'ATTRIBUTESSECURITYCODE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV14Session.getValue(AV81Pgmname+"GridState"), "") == 0 )
      {
         AV10GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV81Pgmname+"GridState"), null, null);
      }
      else
      {
         AV10GridState.fromxml(AV14Session.getValue(AV81Pgmname+"GridState"), null, null);
      }
      if ( ! ( ( new app.pexicon(remoteHandle, context).executeUdp( AV53Emprcod, httpContext.getMessage( "TUBOSS", "")) == 1 ) ) )
      {
         Cond_result = true ;
      }
      else
      {
         Cond_result = false ;
      }
      if ( Cond_result )
      {
         edtTubCod_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, edtTubCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTubCod_Visible), 5, 0), !bGXsfl_15_Refreshing);
         GXv_SdtWWPGridState30[0] = AV10GridState;
         if ( new app.wwpbaseobjects.wwp_deletefilter(remoteHandle, context).executeUdp( GXv_SdtWWPGridState30, "TFTUBCOD", false) )
         {
            Cond_result = true ;
         }
         else
         {
            Cond_result = false ;
         }
         AV10GridState = GXv_SdtWWPGridState30[0] ;
         if ( Cond_result )
         {
            new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV81Pgmname+"GridState", AV10GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
         }
      }
      if ( ! ( ( new app.pexicon(remoteHandle, context).executeUdp( AV53Emprcod, httpContext.getMessage( "TUBOSS", "")) == 1 ) ) )
      {
         Cond_result = true ;
      }
      else
      {
         Cond_result = false ;
      }
      if ( Cond_result )
      {
         edtBarAlbTub_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarAlbTub_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAlbTub_Visible), 5, 0), !bGXsfl_15_Refreshing);
         GXv_SdtWWPGridState30[0] = AV10GridState;
         if ( new app.wwpbaseobjects.wwp_deletefilter(remoteHandle, context).executeUdp( GXv_SdtWWPGridState30, "TFBARALBTUB", false) )
         {
            Cond_result = true ;
         }
         else
         {
            Cond_result = false ;
         }
         AV10GridState = GXv_SdtWWPGridState30[0] ;
         if ( Cond_result )
         {
            new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV81Pgmname+"GridState", AV10GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
         }
      }
      if ( ! ( ( new app.pexicon(remoteHandle, context).executeUdp( AV53Emprcod, httpContext.getMessage( "PLASTI", "")) == 1 ) ) )
      {
         Cond_result = true ;
      }
      else
      {
         Cond_result = false ;
      }
      if ( Cond_result )
      {
         edtPlasCod_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, edtPlasCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPlasCod_Visible), 5, 0), !bGXsfl_15_Refreshing);
         GXv_SdtWWPGridState30[0] = AV10GridState;
         if ( new app.wwpbaseobjects.wwp_deletefilter(remoteHandle, context).executeUdp( GXv_SdtWWPGridState30, "TFPLASCOD", false) )
         {
            Cond_result = true ;
         }
         else
         {
            Cond_result = false ;
         }
         AV10GridState = GXv_SdtWWPGridState30[0] ;
         if ( Cond_result )
         {
            new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV81Pgmname+"GridState", AV10GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
         }
      }
      if ( ! ( ( new app.pexicon(remoteHandle, context).executeUdp( AV53Emprcod, httpContext.getMessage( "PLASTI", "")) == 1 ) ) )
      {
         Cond_result = true ;
      }
      else
      {
         Cond_result = false ;
      }
      if ( Cond_result )
      {
         edtBarAlbPlas_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarAlbPlas_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAlbPlas_Visible), 5, 0), !bGXsfl_15_Refreshing);
         GXv_SdtWWPGridState30[0] = AV10GridState;
         if ( new app.wwpbaseobjects.wwp_deletefilter(remoteHandle, context).executeUdp( GXv_SdtWWPGridState30, "TFBARALBPLAS", false) )
         {
            Cond_result = true ;
         }
         else
         {
            Cond_result = false ;
         }
         AV10GridState = GXv_SdtWWPGridState30[0] ;
         if ( Cond_result )
         {
            new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV81Pgmname+"GridState", AV10GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
         }
      }
      if ( ! ( ( new app.pexicon(remoteHandle, context).executeUdp( AV53Emprcod, httpContext.getMessage( "MODA21", "")) == 1 ) ) )
      {
         Cond_result = true ;
      }
      else
      {
         Cond_result = false ;
      }
      if ( Cond_result )
      {
         chkBarTipCor.setVisible( 0 );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, chkBarTipCor.getInternalname(), "Visible", GXutil.ltrimstr( chkBarTipCor.getVisible(), 5, 0), !bGXsfl_15_Refreshing);
         GXv_SdtWWPGridState30[0] = AV10GridState;
         if ( new app.wwpbaseobjects.wwp_deletefilter(remoteHandle, context).executeUdp( GXv_SdtWWPGridState30, "TFBARTIPCOR", false) )
         {
            Cond_result = true ;
         }
         else
         {
            Cond_result = false ;
         }
         AV10GridState = GXv_SdtWWPGridState30[0] ;
         if ( Cond_result )
         {
            new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV81Pgmname+"GridState", AV10GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
         }
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV53Emprcod = (String)getParm(obj,0,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV53Emprcod", AV53Emprcod);
      AV54AlbProcod = ((Number) GXutil.testNumericType( getParm(obj,1,TypeConstants.LONG), TypeConstants.LONG)).longValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV54AlbProcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV54AlbProcod), 10, 0));
      AV62Guiremcli = ((Number) GXutil.testNumericType( getParm(obj,2,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV62Guiremcli", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV62Guiremcli), 6, 0));
      AV63GuiRemCln = (String)getParm(obj,3,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV63GuiRemCln", AV63GuiRemCln);
      AV64AlbProFch = (java.util.Date)getParm(obj,4,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV64AlbProFch", localUtil.format(AV64AlbProFch, "99/99/99"));
      AV65AlbSec = (String)getParm(obj,5,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV65AlbSec", AV65AlbSec);
      AV66AlbPropri = (String)getParm(obj,6,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV66AlbPropri", AV66AlbPropri);
      AV67AlbEnvFtp = ((Number) GXutil.testNumericType( getParm(obj,7,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV67AlbEnvFtp", GXutil.str( AV67AlbEnvFtp, 1, 0));
      AV68AlbLic = (String)getParm(obj,8,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV68AlbLic", AV68AlbLic);
      Gx_mode = (String)getParm(obj,9,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "Gx_mode", Gx_mode);
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
      pa2522( ) ;
      ws2522( ) ;
      we2522( ) ;
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
      sCtrlAV53Emprcod = (String)getParm(obj,0,TypeConstants.STRING) ;
      sCtrlAV54AlbProcod = (String)getParm(obj,1,TypeConstants.STRING) ;
      sCtrlAV62Guiremcli = (String)getParm(obj,2,TypeConstants.STRING) ;
      sCtrlAV63GuiRemCln = (String)getParm(obj,3,TypeConstants.STRING) ;
      sCtrlAV64AlbProFch = (String)getParm(obj,4,TypeConstants.STRING) ;
      sCtrlAV65AlbSec = (String)getParm(obj,5,TypeConstants.STRING) ;
      sCtrlAV66AlbPropri = (String)getParm(obj,6,TypeConstants.STRING) ;
      sCtrlAV67AlbEnvFtp = (String)getParm(obj,7,TypeConstants.STRING) ;
      sCtrlAV68AlbLic = (String)getParm(obj,8,TypeConstants.STRING) ;
      sCtrlGx_mode = (String)getParm(obj,9,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      pa2522( ) ;
      wcparametersget( ) ;
   }

   @SuppressWarnings("unchecked")
   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "documentotransporteproduccion\\documentodetransporteproduccion_7", GetJustCreated( ));
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
         init_web_controls( ) ;
      }
      pa2522( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         AV53Emprcod = (String)getParm(obj,2,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV53Emprcod", AV53Emprcod);
         AV54AlbProcod = ((Number) GXutil.testNumericType( getParm(obj,3,TypeConstants.LONG), TypeConstants.LONG)).longValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV54AlbProcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV54AlbProcod), 10, 0));
         AV62Guiremcli = ((Number) GXutil.testNumericType( getParm(obj,4,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV62Guiremcli", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV62Guiremcli), 6, 0));
         AV63GuiRemCln = (String)getParm(obj,5,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV63GuiRemCln", AV63GuiRemCln);
         AV64AlbProFch = (java.util.Date)getParm(obj,6,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV64AlbProFch", localUtil.format(AV64AlbProFch, "99/99/99"));
         AV65AlbSec = (String)getParm(obj,7,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV65AlbSec", AV65AlbSec);
         AV66AlbPropri = (String)getParm(obj,8,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV66AlbPropri", AV66AlbPropri);
         AV67AlbEnvFtp = ((Number) GXutil.testNumericType( getParm(obj,9,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV67AlbEnvFtp", GXutil.str( AV67AlbEnvFtp, 1, 0));
         AV68AlbLic = (String)getParm(obj,10,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV68AlbLic", AV68AlbLic);
         Gx_mode = (String)getParm(obj,11,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "Gx_mode", Gx_mode);
      }
      wcpOAV53Emprcod = httpContext.cgiGet( sPrefix+"wcpOAV53Emprcod") ;
      wcpOAV54AlbProcod = localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV54AlbProcod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
      wcpOAV62Guiremcli = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV62Guiremcli"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV63GuiRemCln = httpContext.cgiGet( sPrefix+"wcpOAV63GuiRemCln") ;
      wcpOAV64AlbProFch = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV64AlbProFch"), 0) ;
      wcpOAV65AlbSec = httpContext.cgiGet( sPrefix+"wcpOAV65AlbSec") ;
      wcpOAV66AlbPropri = httpContext.cgiGet( sPrefix+"wcpOAV66AlbPropri") ;
      wcpOAV67AlbEnvFtp = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV67AlbEnvFtp"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV68AlbLic = httpContext.cgiGet( sPrefix+"wcpOAV68AlbLic") ;
      wcpOGx_mode = httpContext.cgiGet( sPrefix+"wcpOGx_mode") ;
      if ( ! GetJustCreated( ) && ( ( GXutil.strcmp(AV53Emprcod, wcpOAV53Emprcod) != 0 ) || ( AV54AlbProcod != wcpOAV54AlbProcod ) || ( AV62Guiremcli != wcpOAV62Guiremcli ) || ( GXutil.strcmp(AV63GuiRemCln, wcpOAV63GuiRemCln) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(AV64AlbProFch), GXutil.resetTime(wcpOAV64AlbProFch)) ) || ( GXutil.strcmp(AV65AlbSec, wcpOAV65AlbSec) != 0 ) || ( GXutil.strcmp(AV66AlbPropri, wcpOAV66AlbPropri) != 0 ) || ( AV67AlbEnvFtp != wcpOAV67AlbEnvFtp ) || ( GXutil.strcmp(AV68AlbLic, wcpOAV68AlbLic) != 0 ) || ( GXutil.strcmp(Gx_mode, wcpOGx_mode) != 0 ) ) )
      {
         setjustcreated();
      }
      wcpOAV53Emprcod = AV53Emprcod ;
      wcpOAV54AlbProcod = AV54AlbProcod ;
      wcpOAV62Guiremcli = AV62Guiremcli ;
      wcpOAV63GuiRemCln = AV63GuiRemCln ;
      wcpOAV64AlbProFch = AV64AlbProFch ;
      wcpOAV65AlbSec = AV65AlbSec ;
      wcpOAV66AlbPropri = AV66AlbPropri ;
      wcpOAV67AlbEnvFtp = AV67AlbEnvFtp ;
      wcpOAV68AlbLic = AV68AlbLic ;
      wcpOGx_mode = Gx_mode ;
   }

   public void wcparametersget( )
   {
      /* Read Component Parameters. */
      sCtrlAV53Emprcod = httpContext.cgiGet( sPrefix+"AV53Emprcod_CTRL") ;
      if ( GXutil.len( sCtrlAV53Emprcod) > 0 )
      {
         AV53Emprcod = httpContext.cgiGet( sCtrlAV53Emprcod) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV53Emprcod", AV53Emprcod);
      }
      else
      {
         AV53Emprcod = httpContext.cgiGet( sPrefix+"AV53Emprcod_PARM") ;
      }
      sCtrlAV54AlbProcod = httpContext.cgiGet( sPrefix+"AV54AlbProcod_CTRL") ;
      if ( GXutil.len( sCtrlAV54AlbProcod) > 0 )
      {
         AV54AlbProcod = localUtil.ctol( httpContext.cgiGet( sCtrlAV54AlbProcod), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV54AlbProcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV54AlbProcod), 10, 0));
      }
      else
      {
         AV54AlbProcod = localUtil.ctol( httpContext.cgiGet( sPrefix+"AV54AlbProcod_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
      }
      sCtrlAV62Guiremcli = httpContext.cgiGet( sPrefix+"AV62Guiremcli_CTRL") ;
      if ( GXutil.len( sCtrlAV62Guiremcli) > 0 )
      {
         AV62Guiremcli = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV62Guiremcli), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV62Guiremcli", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV62Guiremcli), 6, 0));
      }
      else
      {
         AV62Guiremcli = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV62Guiremcli_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV63GuiRemCln = httpContext.cgiGet( sPrefix+"AV63GuiRemCln_CTRL") ;
      if ( GXutil.len( sCtrlAV63GuiRemCln) > 0 )
      {
         AV63GuiRemCln = httpContext.cgiGet( sCtrlAV63GuiRemCln) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV63GuiRemCln", AV63GuiRemCln);
      }
      else
      {
         AV63GuiRemCln = httpContext.cgiGet( sPrefix+"AV63GuiRemCln_PARM") ;
      }
      sCtrlAV64AlbProFch = httpContext.cgiGet( sPrefix+"AV64AlbProFch_CTRL") ;
      if ( GXutil.len( sCtrlAV64AlbProFch) > 0 )
      {
         AV64AlbProFch = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( sCtrlAV64AlbProFch), 0)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV64AlbProFch", localUtil.format(AV64AlbProFch, "99/99/99"));
      }
      else
      {
         AV64AlbProFch = localUtil.ctod( httpContext.cgiGet( sPrefix+"AV64AlbProFch_PARM"), 0) ;
      }
      sCtrlAV65AlbSec = httpContext.cgiGet( sPrefix+"AV65AlbSec_CTRL") ;
      if ( GXutil.len( sCtrlAV65AlbSec) > 0 )
      {
         AV65AlbSec = httpContext.cgiGet( sCtrlAV65AlbSec) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV65AlbSec", AV65AlbSec);
      }
      else
      {
         AV65AlbSec = httpContext.cgiGet( sPrefix+"AV65AlbSec_PARM") ;
      }
      sCtrlAV66AlbPropri = httpContext.cgiGet( sPrefix+"AV66AlbPropri_CTRL") ;
      if ( GXutil.len( sCtrlAV66AlbPropri) > 0 )
      {
         AV66AlbPropri = httpContext.cgiGet( sCtrlAV66AlbPropri) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV66AlbPropri", AV66AlbPropri);
      }
      else
      {
         AV66AlbPropri = httpContext.cgiGet( sPrefix+"AV66AlbPropri_PARM") ;
      }
      sCtrlAV67AlbEnvFtp = httpContext.cgiGet( sPrefix+"AV67AlbEnvFtp_CTRL") ;
      if ( GXutil.len( sCtrlAV67AlbEnvFtp) > 0 )
      {
         AV67AlbEnvFtp = (byte)(localUtil.ctol( httpContext.cgiGet( sCtrlAV67AlbEnvFtp), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV67AlbEnvFtp", GXutil.str( AV67AlbEnvFtp, 1, 0));
      }
      else
      {
         AV67AlbEnvFtp = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV67AlbEnvFtp_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV68AlbLic = httpContext.cgiGet( sPrefix+"AV68AlbLic_CTRL") ;
      if ( GXutil.len( sCtrlAV68AlbLic) > 0 )
      {
         AV68AlbLic = httpContext.cgiGet( sCtrlAV68AlbLic) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV68AlbLic", AV68AlbLic);
      }
      else
      {
         AV68AlbLic = httpContext.cgiGet( sPrefix+"AV68AlbLic_PARM") ;
      }
      sCtrlGx_mode = httpContext.cgiGet( sPrefix+"Gx_mode_CTRL") ;
      if ( GXutil.len( sCtrlGx_mode) > 0 )
      {
         Gx_mode = httpContext.cgiGet( sCtrlGx_mode) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "Gx_mode", Gx_mode);
      }
      else
      {
         Gx_mode = httpContext.cgiGet( sPrefix+"Gx_mode_PARM") ;
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
      pa2522( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      ws2522( ) ;
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
      ws2522( ) ;
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void wcparametersset( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV53Emprcod_PARM", GXutil.rtrim( AV53Emprcod));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV53Emprcod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV53Emprcod_CTRL", GXutil.rtrim( sCtrlAV53Emprcod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV54AlbProcod_PARM", GXutil.ltrim( localUtil.ntoc( AV54AlbProcod, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV54AlbProcod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV54AlbProcod_CTRL", GXutil.rtrim( sCtrlAV54AlbProcod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV62Guiremcli_PARM", GXutil.ltrim( localUtil.ntoc( AV62Guiremcli, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV62Guiremcli)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV62Guiremcli_CTRL", GXutil.rtrim( sCtrlAV62Guiremcli));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV63GuiRemCln_PARM", GXutil.rtrim( AV63GuiRemCln));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV63GuiRemCln)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV63GuiRemCln_CTRL", GXutil.rtrim( sCtrlAV63GuiRemCln));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV64AlbProFch_PARM", localUtil.dtoc( AV64AlbProFch, 0, "/"));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV64AlbProFch)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV64AlbProFch_CTRL", GXutil.rtrim( sCtrlAV64AlbProFch));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV65AlbSec_PARM", GXutil.rtrim( AV65AlbSec));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV65AlbSec)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV65AlbSec_CTRL", GXutil.rtrim( sCtrlAV65AlbSec));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV66AlbPropri_PARM", GXutil.rtrim( AV66AlbPropri));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV66AlbPropri)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV66AlbPropri_CTRL", GXutil.rtrim( sCtrlAV66AlbPropri));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV67AlbEnvFtp_PARM", GXutil.ltrim( localUtil.ntoc( AV67AlbEnvFtp, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV67AlbEnvFtp)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV67AlbEnvFtp_CTRL", GXutil.rtrim( sCtrlAV67AlbEnvFtp));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV68AlbLic_PARM", GXutil.rtrim( AV68AlbLic));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV68AlbLic)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV68AlbLic_CTRL", GXutil.rtrim( sCtrlAV68AlbLic));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"Gx_mode_PARM", GXutil.rtrim( Gx_mode));
      if ( GXutil.len( GXutil.rtrim( sCtrlGx_mode)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"Gx_mode_CTRL", GXutil.rtrim( sCtrlGx_mode));
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
      we2522( ) ;
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
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?"+httpContext.getCacheInvalidationToken( ));
      boolean outputEnabled = httpContext.isOutputEnabled( );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableOutput();
      }
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682116103097", true, true);
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
      httpContext.AddJavascriptSource("documentotransporteproduccion/documentodetransporteproduccion_7.js", "?202682116103097", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void subsflControlProps_152( )
   {
      cmbavGridactiongroup1.setInternalname( sPrefix+"vGRIDACTIONGROUP1_"+sGXsfl_15_idx );
      edtBarNHdr_Internalname = sPrefix+"BARNHDR_"+sGXsfl_15_idx ;
      edtAlbEncCli_Internalname = sPrefix+"ALBENCCLI_"+sGXsfl_15_idx ;
      edtAlbSer_Internalname = sPrefix+"ALBSER_"+sGXsfl_15_idx ;
      edtAlbSerD_Internalname = sPrefix+"ALBSERD_"+sGXsfl_15_idx ;
      edtAlbColNom_Internalname = sPrefix+"ALBCOLNOM_"+sGXsfl_15_idx ;
      edtAlbColNum_Internalname = sPrefix+"ALBCOLNUM_"+sGXsfl_15_idx ;
      edtAlbTipCol_Internalname = sPrefix+"ALBTIPCOL_"+sGXsfl_15_idx ;
      edtAlbNomCli_Internalname = sPrefix+"ALBNOMCLI_"+sGXsfl_15_idx ;
      edtBarAlbKgmE_Internalname = sPrefix+"BARALBKGME_"+sGXsfl_15_idx ;
      edtAlbHdrAnc_Internalname = sPrefix+"ALBHDRANC_"+sGXsfl_15_idx ;
      edtAlbHdrgm2_Internalname = sPrefix+"ALBHDRGM2_"+sGXsfl_15_idx ;
      edtBarAlbMtrE_Internalname = sPrefix+"BARALBMTRE_"+sGXsfl_15_idx ;
      edtBarAlbPie_Internalname = sPrefix+"BARALBPIE_"+sGXsfl_15_idx ;
      edtBarCod_Internalname = sPrefix+"BARCOD_"+sGXsfl_15_idx ;
      edtBarCodReo_Internalname = sPrefix+"BARCODREO_"+sGXsfl_15_idx ;
      edtBarCodPar_Internalname = sPrefix+"BARCODPAR_"+sGXsfl_15_idx ;
      edtTubCod_Internalname = sPrefix+"TUBCOD_"+sGXsfl_15_idx ;
      edtBarAlbTub_Internalname = sPrefix+"BARALBTUB_"+sGXsfl_15_idx ;
      edtPlasCod_Internalname = sPrefix+"PLASCOD_"+sGXsfl_15_idx ;
      edtBarAlbPlas_Internalname = sPrefix+"BARALBPLAS_"+sGXsfl_15_idx ;
      edtAlbHdrObs_Internalname = sPrefix+"ALBHDROBS_"+sGXsfl_15_idx ;
      cmbAlbProVal.setInternalname( sPrefix+"ALBPROVAL_"+sGXsfl_15_idx );
      edtBarSit_Internalname = sPrefix+"BARSIT_"+sGXsfl_15_idx ;
      chkBarTipCor.setInternalname( sPrefix+"BARTIPCOR_"+sGXsfl_15_idx );
   }

   public void subsflControlProps_fel_152( )
   {
      cmbavGridactiongroup1.setInternalname( sPrefix+"vGRIDACTIONGROUP1_"+sGXsfl_15_fel_idx );
      edtBarNHdr_Internalname = sPrefix+"BARNHDR_"+sGXsfl_15_fel_idx ;
      edtAlbEncCli_Internalname = sPrefix+"ALBENCCLI_"+sGXsfl_15_fel_idx ;
      edtAlbSer_Internalname = sPrefix+"ALBSER_"+sGXsfl_15_fel_idx ;
      edtAlbSerD_Internalname = sPrefix+"ALBSERD_"+sGXsfl_15_fel_idx ;
      edtAlbColNom_Internalname = sPrefix+"ALBCOLNOM_"+sGXsfl_15_fel_idx ;
      edtAlbColNum_Internalname = sPrefix+"ALBCOLNUM_"+sGXsfl_15_fel_idx ;
      edtAlbTipCol_Internalname = sPrefix+"ALBTIPCOL_"+sGXsfl_15_fel_idx ;
      edtAlbNomCli_Internalname = sPrefix+"ALBNOMCLI_"+sGXsfl_15_fel_idx ;
      edtBarAlbKgmE_Internalname = sPrefix+"BARALBKGME_"+sGXsfl_15_fel_idx ;
      edtAlbHdrAnc_Internalname = sPrefix+"ALBHDRANC_"+sGXsfl_15_fel_idx ;
      edtAlbHdrgm2_Internalname = sPrefix+"ALBHDRGM2_"+sGXsfl_15_fel_idx ;
      edtBarAlbMtrE_Internalname = sPrefix+"BARALBMTRE_"+sGXsfl_15_fel_idx ;
      edtBarAlbPie_Internalname = sPrefix+"BARALBPIE_"+sGXsfl_15_fel_idx ;
      edtBarCod_Internalname = sPrefix+"BARCOD_"+sGXsfl_15_fel_idx ;
      edtBarCodReo_Internalname = sPrefix+"BARCODREO_"+sGXsfl_15_fel_idx ;
      edtBarCodPar_Internalname = sPrefix+"BARCODPAR_"+sGXsfl_15_fel_idx ;
      edtTubCod_Internalname = sPrefix+"TUBCOD_"+sGXsfl_15_fel_idx ;
      edtBarAlbTub_Internalname = sPrefix+"BARALBTUB_"+sGXsfl_15_fel_idx ;
      edtPlasCod_Internalname = sPrefix+"PLASCOD_"+sGXsfl_15_fel_idx ;
      edtBarAlbPlas_Internalname = sPrefix+"BARALBPLAS_"+sGXsfl_15_fel_idx ;
      edtAlbHdrObs_Internalname = sPrefix+"ALBHDROBS_"+sGXsfl_15_fel_idx ;
      cmbAlbProVal.setInternalname( sPrefix+"ALBPROVAL_"+sGXsfl_15_fel_idx );
      edtBarSit_Internalname = sPrefix+"BARSIT_"+sGXsfl_15_fel_idx ;
      chkBarTipCor.setInternalname( sPrefix+"BARTIPCOR_"+sGXsfl_15_fel_idx );
   }

   public void sendrow_152( )
   {
      subsflControlProps_152( ) ;
      wb2520( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_15_idx <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_15_idx) % (2))) == 0 )
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
            httpContext.writeText( " gxrow=\""+sGXsfl_15_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         TempTags = " " + ((cmbavGridactiongroup1.getEnabled()!=0)&&(cmbavGridactiongroup1.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 16,'"+sPrefix+"',false,'"+sGXsfl_15_idx+"',15)\"" : " ") ;
         if ( ( cmbavGridactiongroup1.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "vGRIDACTIONGROUP1_" + sGXsfl_15_idx ;
            cmbavGridactiongroup1.setName( GXCCtl );
            cmbavGridactiongroup1.setWebtags( "" );
            if ( cmbavGridactiongroup1.getItemCount() > 0 )
            {
               AV61GridActionGroup1 = (short)(GXutil.lval( cmbavGridactiongroup1.getValidValue(GXutil.trim( GXutil.str( AV61GridActionGroup1, 4, 0))))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, cmbavGridactiongroup1.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV61GridActionGroup1), 4, 0));
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbavGridactiongroup1,cmbavGridactiongroup1.getInternalname(),GXutil.trim( GXutil.str( AV61GridActionGroup1, 4, 0)),Integer.valueOf(1),cmbavGridactiongroup1.getJsonclick(),Integer.valueOf(5),"'"+sPrefix+"'"+",false,"+"'"+sPrefix+"EVGRIDACTIONGROUP1.CLICK."+sGXsfl_15_idx+"'","int","",Integer.valueOf(-1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","ConvertToDDO","WWActionGroupColumn","",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((cmbavGridactiongroup1.getEnabled()!=0)&&(cmbavGridactiongroup1.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,16);\"" : " "),"",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbavGridactiongroup1.setValue( GXutil.trim( GXutil.str( AV61GridActionGroup1, 4, 0)) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbavGridactiongroup1.getInternalname(), "Values", cmbavGridactiongroup1.ToJavascriptSource(), !bGXsfl_15_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarNHdr_Internalname,GXutil.rtrim( A13696BarNHdr),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarNHdr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(11),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(15),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbEncCli_Internalname,GXutil.rtrim( A4815AlbEncCli),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtAlbEncCli_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(15),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbSer_Internalname,GXutil.rtrim( A3391AlbSer),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtAlbSer_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(15),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbSerD_Internalname,GXutil.rtrim( A8879AlbSerD),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtAlbSerD_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(15),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbColNom_Internalname,GXutil.rtrim( A3392AlbColNom),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtAlbColNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(15),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbColNum_Internalname,GXutil.ltrim( localUtil.ntoc( A3393AlbColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A3393AlbColNum), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtAlbColNum_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(15),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbTipCol_Internalname,GXutil.ltrim( localUtil.ntoc( A3394AlbTipCol, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A3394AlbTipCol), "Z9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtAlbTipCol_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(15),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbNomCli_Internalname,GXutil.rtrim( A12232AlbNomCli),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtAlbNomCli_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(15),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarAlbKgmE_Internalname,GXutil.ltrim( localUtil.ntoc( A1261BarAlbKgmE, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A1261BarAlbKgmE, "ZZZZZ9.99")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarAlbKgmE_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(15),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbHdrAnc_Internalname,GXutil.ltrim( localUtil.ntoc( A3271AlbHdrAnc, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A3271AlbHdrAnc), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtAlbHdrAnc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(15),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbHdrgm2_Internalname,GXutil.ltrim( localUtil.ntoc( A5019AlbHdrgm2, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A5019AlbHdrgm2), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtAlbHdrgm2_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(15),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarAlbMtrE_Internalname,GXutil.ltrim( localUtil.ntoc( A1263BarAlbMtrE, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A1263BarAlbMtrE, "ZZZZZ9.99")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarAlbMtrE_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(15),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarAlbPie_Internalname,GXutil.ltrim( localUtil.ntoc( A1265BarAlbPie, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1265BarAlbPie), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarAlbPie_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(15),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarCod_Internalname,GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(15),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarCodReo_Internalname,GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarCodReo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(15),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarCodPar_Internalname,GXutil.rtrim( A130BarCodPar),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarCodPar_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(15),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtTubCod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTubCod_Internalname,GXutil.ltrim( localUtil.ntoc( A1206TubCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1206TubCod), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtTubCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtTubCod_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(15),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtBarAlbTub_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarAlbTub_Internalname,GXutil.ltrim( localUtil.ntoc( A1266BarAlbTub, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1266BarAlbTub), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarAlbTub_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtBarAlbTub_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(15),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtPlasCod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPlasCod_Internalname,GXutil.ltrim( localUtil.ntoc( A6466PlasCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A6466PlasCod), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtPlasCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtPlasCod_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(15),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtBarAlbPlas_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarAlbPlas_Internalname,GXutil.ltrim( localUtil.ntoc( A6467BarAlbPlas, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A6467BarAlbPlas), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarAlbPlas_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtBarAlbPlas_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(15),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbHdrObs_Internalname,GXutil.rtrim( A2441AlbHdrObs),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtAlbHdrObs_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(15),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         if ( ( cmbAlbProVal.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "ALBPROVAL_" + sGXsfl_15_idx ;
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
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbAlbProVal,cmbAlbProVal.getInternalname(),GXutil.rtrim( A2839AlbProVal),Integer.valueOf(1),cmbAlbProVal.getJsonclick(),Integer.valueOf(0),"'"+sPrefix+"'"+",false,"+"'"+""+"'","char","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","Attribute","WWColumn","","","",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbAlbProVal.setValue( GXutil.rtrim( A2839AlbProVal) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbAlbProVal.getInternalname(), "Values", cmbAlbProVal.ToJavascriptSource(), !bGXsfl_15_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarSit_Internalname,GXutil.ltrim( localUtil.ntoc( A213BarSit, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A213BarSit), "Z9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarSit_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(15),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+""+"\""+" style=\""+((chkBarTipCor.getVisible()==0) ? "display:none;" : "")+"\">") ;
         }
         /* Check box */
         ClassString = "Attribute" ;
         StyleString = "" ;
         GXCCtl = "BARTIPCOR_" + sGXsfl_15_idx ;
         chkBarTipCor.setName( GXCCtl );
         chkBarTipCor.setWebtags( "" );
         chkBarTipCor.setCaption( "" );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, chkBarTipCor.getInternalname(), "TitleCaption", chkBarTipCor.getCaption(), !bGXsfl_15_Refreshing);
         chkBarTipCor.setCheckedValue( "NO" );
         GridRow.AddColumnProperties("checkbox", 1, isAjaxCallMode( ), new Object[] {chkBarTipCor.getInternalname(),A5291BarTipCor,"","",Integer.valueOf(chkBarTipCor.getVisible()),Integer.valueOf(0),"SI","",StyleString,ClassString,"WWColumn","",""});
         send_integrity_lvl_hashes2522( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_15_idx = ((subGrid_Islastpage==1)&&(nGXsfl_15_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_15_idx+1) ;
         sGXsfl_15_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_15_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_152( ) ;
      }
      /* End function sendrow_152 */
   }

   public void startgridcontrol15( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+sPrefix+"GridContainer"+"DivS\" data-gxgridid=\"15\">") ;
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
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "N Hdr", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Ped. Cli.", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Articulo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripcion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Color", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Numero", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "TC", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Color Cliente", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "KIlos", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Ancho", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Grm2", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Metros", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Piezas", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Codigo Barcada", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Codigo Reoperado Barcada", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Codigo Particion Barcada", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtTubCod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Tubo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarAlbTub_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cant.", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPlasCod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Plastico", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarAlbPlas_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cant.", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Observaciones", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "F?", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Sit.", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+""+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((chkBarTipCor.getVisible()==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Exp.", "")) ;
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
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV61GridActionGroup1, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A13696BarNHdr));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A4815AlbEncCli));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A3391AlbSer));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A8879AlbSerD));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A3392AlbColNom));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A3393AlbColNum, (byte)(6), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A3394AlbTipCol, (byte)(2), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A12232AlbNomCli));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1261BarAlbKgmE, (byte)(9), (byte)(2), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A3271AlbHdrAnc, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A5019AlbHdrgm2, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1263BarAlbMtrE, (byte)(9), (byte)(2), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1265BarAlbPie, (byte)(6), (byte)(0), ".", "")));
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
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1206TubCod, (byte)(4), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtTubCod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1266BarAlbTub, (byte)(6), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarAlbTub_Visible, (byte)(5), (byte)(0), ".", "")));
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
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A2441AlbHdrObs));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A2839AlbProVal));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A213BarSit, (byte)(2), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A5291BarTipCor));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( chkBarTipCor.getVisible(), (byte)(5), (byte)(0), ".", "")));
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
      cmbavGridactiongroup1.setInternalname( sPrefix+"vGRIDACTIONGROUP1" );
      edtBarNHdr_Internalname = sPrefix+"BARNHDR" ;
      edtAlbEncCli_Internalname = sPrefix+"ALBENCCLI" ;
      edtAlbSer_Internalname = sPrefix+"ALBSER" ;
      edtAlbSerD_Internalname = sPrefix+"ALBSERD" ;
      edtAlbColNom_Internalname = sPrefix+"ALBCOLNOM" ;
      edtAlbColNum_Internalname = sPrefix+"ALBCOLNUM" ;
      edtAlbTipCol_Internalname = sPrefix+"ALBTIPCOL" ;
      edtAlbNomCli_Internalname = sPrefix+"ALBNOMCLI" ;
      edtBarAlbKgmE_Internalname = sPrefix+"BARALBKGME" ;
      edtAlbHdrAnc_Internalname = sPrefix+"ALBHDRANC" ;
      edtAlbHdrgm2_Internalname = sPrefix+"ALBHDRGM2" ;
      edtBarAlbMtrE_Internalname = sPrefix+"BARALBMTRE" ;
      edtBarAlbPie_Internalname = sPrefix+"BARALBPIE" ;
      edtBarCod_Internalname = sPrefix+"BARCOD" ;
      edtBarCodReo_Internalname = sPrefix+"BARCODREO" ;
      edtBarCodPar_Internalname = sPrefix+"BARCODPAR" ;
      edtTubCod_Internalname = sPrefix+"TUBCOD" ;
      edtBarAlbTub_Internalname = sPrefix+"BARALBTUB" ;
      edtPlasCod_Internalname = sPrefix+"PLASCOD" ;
      edtBarAlbPlas_Internalname = sPrefix+"BARALBPLAS" ;
      edtAlbHdrObs_Internalname = sPrefix+"ALBHDROBS" ;
      cmbAlbProVal.setInternalname( sPrefix+"ALBPROVAL" );
      edtBarSit_Internalname = sPrefix+"BARSIT" ;
      chkBarTipCor.setInternalname( sPrefix+"BARTIPCOR" );
      Gridpaginationbar_Internalname = sPrefix+"GRIDPAGINATIONBAR" ;
      divGridtablewithpaginationbar_Internalname = sPrefix+"GRIDTABLEWITHPAGINATIONBAR" ;
      edtavPgmname_Internalname = sPrefix+"vPGMNAME" ;
      Datamonjs_Internalname = sPrefix+"DATAMONJS" ;
      divTablemain_Internalname = sPrefix+"TABLEMAIN" ;
      Ddo_grid_Internalname = sPrefix+"DDO_GRID" ;
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
      chkBarTipCor.setCaption( "" );
      edtBarSit_Jsonclick = "" ;
      cmbAlbProVal.setJsonclick( "" );
      edtAlbHdrObs_Jsonclick = "" ;
      edtBarAlbPlas_Jsonclick = "" ;
      edtPlasCod_Jsonclick = "" ;
      edtBarAlbTub_Jsonclick = "" ;
      edtTubCod_Jsonclick = "" ;
      edtBarCodPar_Jsonclick = "" ;
      edtBarCodReo_Jsonclick = "" ;
      edtBarCod_Jsonclick = "" ;
      edtBarAlbPie_Jsonclick = "" ;
      edtBarAlbMtrE_Jsonclick = "" ;
      edtAlbHdrgm2_Jsonclick = "" ;
      edtAlbHdrAnc_Jsonclick = "" ;
      edtBarAlbKgmE_Jsonclick = "" ;
      edtAlbNomCli_Jsonclick = "" ;
      edtAlbTipCol_Jsonclick = "" ;
      edtAlbColNum_Jsonclick = "" ;
      edtAlbColNom_Jsonclick = "" ;
      edtAlbSerD_Jsonclick = "" ;
      edtAlbSer_Jsonclick = "" ;
      edtAlbEncCli_Jsonclick = "" ;
      edtBarNHdr_Jsonclick = "" ;
      cmbavGridactiongroup1.setJsonclick( "" );
      cmbavGridactiongroup1.setVisible( -1 );
      cmbavGridactiongroup1.setEnabled( 1 );
      subGrid_Class = "GridWithPaginationBar GridNoBorder WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      subGrid_Sortable = (byte)(0) ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      Grid_empowerer_Hastitlesettings = GXutil.toBoolean( -1) ;
      Ddo_grid_Datalistproc = "DocumentoTransporteProduccion.DocumentodeTransporteProduccion_7GetFilterData" ;
      Ddo_grid_Datalistfixedvalues = "||||||||||||||||||S:Si,N:No||SI:WWP_TSChecked,NO:WWP_TSUnChecked" ;
      Ddo_grid_Allowmultipleselection = "||||||||||||||||||T||" ;
      Ddo_grid_Datalisttype = "Dynamic|Dynamic|Dynamic|Dynamic|Dynamic|||Dynamic||||||||||Dynamic|FixedValues||FixedValues" ;
      Ddo_grid_Includedatalist = "T|T|T|T|T|||T||||||||||T|T||T" ;
      Ddo_grid_Filterisrange = "|||||T|T||T|T|T|T|T|T|T|T|T|||T|" ;
      Ddo_grid_Filtertype = "Character|Character|Character|Character|Character|Numeric|Numeric|Character|Numeric|Numeric|Numeric|Numeric|Numeric|Numeric|Numeric|Numeric|Numeric|Character||Numeric|" ;
      Ddo_grid_Includefilter = "T|T|T|T|T|T|T|T|T|T|T|T|T|T|T|T|T|T||T|" ;
      Ddo_grid_Includesortasc = "|T|T|T|T|T|T|T|T|T|T|T|T|T|T|T|T|T|T|T|T" ;
      Ddo_grid_Columnssortvalues = "|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21" ;
      Ddo_grid_Columnids = "1:BarNHdr|2:AlbEncCli|3:AlbSer|4:AlbSerD|5:AlbColNom|6:AlbColNum|7:AlbTipCol|8:AlbNomCli|9:BarAlbKgmE|10:AlbHdrAnc|11:AlbHdrgm2|12:BarAlbMtrE|13:BarAlbPie|17:TubCod|18:BarAlbTub|19:PlasCod|20:BarAlbPlas|21:AlbHdrObs|22:AlbProVal|23:BarSit|24:BarTipCor" ;
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
      chkBarTipCor.setVisible( -1 );
      edtBarAlbPlas_Visible = -1 ;
      edtPlasCod_Visible = -1 ;
      edtBarAlbTub_Visible = -1 ;
      edtTubCod_Visible = -1 ;
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
      GXCCtl = "vGRIDACTIONGROUP1_" + sGXsfl_15_idx ;
      cmbavGridactiongroup1.setName( GXCCtl );
      cmbavGridactiongroup1.setWebtags( "" );
      if ( cmbavGridactiongroup1.getItemCount() > 0 )
      {
      }
      GXCCtl = "ALBPROVAL_" + sGXsfl_15_idx ;
      cmbAlbProVal.setName( GXCCtl );
      cmbAlbProVal.setWebtags( "" );
      cmbAlbProVal.addItem("S", httpContext.getMessage( "Si", ""), (short)(0));
      cmbAlbProVal.addItem("N", httpContext.getMessage( "No", ""), (short)(0));
      if ( cmbAlbProVal.getItemCount() > 0 )
      {
      }
      GXCCtl = "BARTIPCOR_" + sGXsfl_15_idx ;
      chkBarTipCor.setName( GXCCtl );
      chkBarTipCor.setWebtags( "" );
      chkBarTipCor.setCaption( "" );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, chkBarTipCor.getInternalname(), "TitleCaption", chkBarTipCor.getCaption(), !bGXsfl_15_Refreshing);
      chkBarTipCor.setCheckedValue( "NO" );
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'edtTubCod_Visible',ctrl:'TUBCOD',prop:'Visible'},{av:'edtBarAlbTub_Visible',ctrl:'BARALBTUB',prop:'Visible'},{av:'edtPlasCod_Visible',ctrl:'PLASCOD',prop:'Visible'},{av:'edtBarAlbPlas_Visible',ctrl:'BARALBPLAS',prop:'Visible'},{av:'chkBarTipCor.getVisible()',ctrl:'BARTIPCOR',prop:'Visible'},{av:'sPrefix'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV53Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV54AlbProcod',fld:'vALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'AV15TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV16TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV69TFAlbEncCli',fld:'vTFALBENCCLI',pic:''},{av:'AV70TFAlbEncCli_Sel',fld:'vTFALBENCCLI_SEL',pic:''},{av:'AV17TFAlbSer',fld:'vTFALBSER',pic:''},{av:'AV18TFAlbSer_Sel',fld:'vTFALBSER_SEL',pic:''},{av:'AV19TFAlbSerD',fld:'vTFALBSERD',pic:''},{av:'AV20TFAlbSerD_Sel',fld:'vTFALBSERD_SEL',pic:''},{av:'AV21TFAlbColNom',fld:'vTFALBCOLNOM',pic:''},{av:'AV22TFAlbColNom_Sel',fld:'vTFALBCOLNOM_SEL',pic:''},{av:'AV23TFAlbColNum',fld:'vTFALBCOLNUM',pic:'ZZZZZ9'},{av:'AV24TFAlbColNum_To',fld:'vTFALBCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV71TFAlbTipCol',fld:'vTFALBTIPCOL',pic:'Z9'},{av:'AV72TFAlbTipCol_To',fld:'vTFALBTIPCOL_TO',pic:'Z9'},{av:'AV25TFAlbNomCli',fld:'vTFALBNOMCLI',pic:''},{av:'AV26TFAlbNomCli_Sel',fld:'vTFALBNOMCLI_SEL',pic:''},{av:'AV27TFBarAlbKgmE',fld:'vTFBARALBKGME',pic:'ZZZZZ9.99'},{av:'AV28TFBarAlbKgmE_To',fld:'vTFBARALBKGME_TO',pic:'ZZZZZ9.99'},{av:'AV29TFAlbHdrAnc',fld:'vTFALBHDRANC',pic:'ZZZ9'},{av:'AV30TFAlbHdrAnc_To',fld:'vTFALBHDRANC_TO',pic:'ZZZ9'},{av:'AV31TFAlbHdrgm2',fld:'vTFALBHDRGM2',pic:'ZZZ9'},{av:'AV32TFAlbHdrgm2_To',fld:'vTFALBHDRGM2_TO',pic:'ZZZ9'},{av:'AV33TFBarAlbMtrE',fld:'vTFBARALBMTRE',pic:'ZZZZZ9.99'},{av:'AV34TFBarAlbMtrE_To',fld:'vTFBARALBMTRE_TO',pic:'ZZZZZ9.99'},{av:'AV35TFBarAlbPie',fld:'vTFBARALBPIE',pic:'ZZZZZ9'},{av:'AV36TFBarAlbPie_To',fld:'vTFBARALBPIE_TO',pic:'ZZZZZ9'},{av:'AV37TFTubCod',fld:'vTFTUBCOD',pic:'ZZZ9'},{av:'AV38TFTubCod_To',fld:'vTFTUBCOD_TO',pic:'ZZZ9'},{av:'AV39TFBarAlbTub',fld:'vTFBARALBTUB',pic:'ZZZ9'},{av:'AV40TFBarAlbTub_To',fld:'vTFBARALBTUB_TO',pic:'ZZZ9'},{av:'AV41TFPlasCod',fld:'vTFPLASCOD',pic:'ZZZ9'},{av:'AV42TFPlasCod_To',fld:'vTFPLASCOD_TO',pic:'ZZZ9'},{av:'AV43TFBarAlbPlas',fld:'vTFBARALBPLAS',pic:'ZZZ9'},{av:'AV44TFBarAlbPlas_To',fld:'vTFBARALBPLAS_TO',pic:'ZZZ9'},{av:'AV45TFAlbHdrObs',fld:'vTFALBHDROBS',pic:''},{av:'AV46TFAlbHdrObs_Sel',fld:'vTFALBHDROBS_SEL',pic:''},{av:'AV48TFAlbProVal_Sels',fld:'vTFALBPROVAL_SELS',pic:''},{av:'AV59TFBarSit',fld:'vTFBARSIT',pic:'Z9'},{av:'AV60TFBarSit_To',fld:'vTFBARSIT_TO',pic:'Z9'},{av:'AV73TFBarTipCor_Sel',fld:'vTFBARTIPCOR_SEL',pic:''},{av:'AV81Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV62Guiremcli',fld:'vGUIREMCLI',pic:'ZZZZZ9'},{av:'AV63GuiRemCln',fld:'vGUIREMCLN',pic:''},{av:'AV64AlbProFch',fld:'vALBPROFCH',pic:''},{av:'AV65AlbSec',fld:'vALBSEC',pic:'@!'},{av:'AV66AlbPropri',fld:'vALBPROPRI',pic:'9'},{av:'AV67AlbEnvFtp',fld:'vALBENVFTP',pic:'9'},{av:'AV68AlbLic',fld:'vALBLIC',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'AV74Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'AV76Mensaje',fld:'vMENSAJE',pic:'',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV51GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV52GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e112522',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV53Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV54AlbProcod',fld:'vALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'AV15TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV16TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV69TFAlbEncCli',fld:'vTFALBENCCLI',pic:''},{av:'AV70TFAlbEncCli_Sel',fld:'vTFALBENCCLI_SEL',pic:''},{av:'AV17TFAlbSer',fld:'vTFALBSER',pic:''},{av:'AV18TFAlbSer_Sel',fld:'vTFALBSER_SEL',pic:''},{av:'AV19TFAlbSerD',fld:'vTFALBSERD',pic:''},{av:'AV20TFAlbSerD_Sel',fld:'vTFALBSERD_SEL',pic:''},{av:'AV21TFAlbColNom',fld:'vTFALBCOLNOM',pic:''},{av:'AV22TFAlbColNom_Sel',fld:'vTFALBCOLNOM_SEL',pic:''},{av:'AV23TFAlbColNum',fld:'vTFALBCOLNUM',pic:'ZZZZZ9'},{av:'AV24TFAlbColNum_To',fld:'vTFALBCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV71TFAlbTipCol',fld:'vTFALBTIPCOL',pic:'Z9'},{av:'AV72TFAlbTipCol_To',fld:'vTFALBTIPCOL_TO',pic:'Z9'},{av:'AV25TFAlbNomCli',fld:'vTFALBNOMCLI',pic:''},{av:'AV26TFAlbNomCli_Sel',fld:'vTFALBNOMCLI_SEL',pic:''},{av:'AV27TFBarAlbKgmE',fld:'vTFBARALBKGME',pic:'ZZZZZ9.99'},{av:'AV28TFBarAlbKgmE_To',fld:'vTFBARALBKGME_TO',pic:'ZZZZZ9.99'},{av:'AV29TFAlbHdrAnc',fld:'vTFALBHDRANC',pic:'ZZZ9'},{av:'AV30TFAlbHdrAnc_To',fld:'vTFALBHDRANC_TO',pic:'ZZZ9'},{av:'AV31TFAlbHdrgm2',fld:'vTFALBHDRGM2',pic:'ZZZ9'},{av:'AV32TFAlbHdrgm2_To',fld:'vTFALBHDRGM2_TO',pic:'ZZZ9'},{av:'AV33TFBarAlbMtrE',fld:'vTFBARALBMTRE',pic:'ZZZZZ9.99'},{av:'AV34TFBarAlbMtrE_To',fld:'vTFBARALBMTRE_TO',pic:'ZZZZZ9.99'},{av:'AV35TFBarAlbPie',fld:'vTFBARALBPIE',pic:'ZZZZZ9'},{av:'AV36TFBarAlbPie_To',fld:'vTFBARALBPIE_TO',pic:'ZZZZZ9'},{av:'AV37TFTubCod',fld:'vTFTUBCOD',pic:'ZZZ9'},{av:'AV38TFTubCod_To',fld:'vTFTUBCOD_TO',pic:'ZZZ9'},{av:'AV39TFBarAlbTub',fld:'vTFBARALBTUB',pic:'ZZZ9'},{av:'AV40TFBarAlbTub_To',fld:'vTFBARALBTUB_TO',pic:'ZZZ9'},{av:'AV41TFPlasCod',fld:'vTFPLASCOD',pic:'ZZZ9'},{av:'AV42TFPlasCod_To',fld:'vTFPLASCOD_TO',pic:'ZZZ9'},{av:'AV43TFBarAlbPlas',fld:'vTFBARALBPLAS',pic:'ZZZ9'},{av:'AV44TFBarAlbPlas_To',fld:'vTFBARALBPLAS_TO',pic:'ZZZ9'},{av:'AV45TFAlbHdrObs',fld:'vTFALBHDROBS',pic:''},{av:'AV46TFAlbHdrObs_Sel',fld:'vTFALBHDROBS_SEL',pic:''},{av:'AV48TFAlbProVal_Sels',fld:'vTFALBPROVAL_SELS',pic:''},{av:'AV59TFBarSit',fld:'vTFBARSIT',pic:'Z9'},{av:'AV60TFBarSit_To',fld:'vTFBARSIT_TO',pic:'Z9'},{av:'AV73TFBarTipCor_Sel',fld:'vTFBARTIPCOR_SEL',pic:''},{av:'AV81Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV62Guiremcli',fld:'vGUIREMCLI',pic:'ZZZZZ9'},{av:'AV63GuiRemCln',fld:'vGUIREMCLN',pic:''},{av:'AV64AlbProFch',fld:'vALBPROFCH',pic:''},{av:'AV65AlbSec',fld:'vALBSEC',pic:'@!'},{av:'AV66AlbPropri',fld:'vALBPROPRI',pic:'9'},{av:'AV67AlbEnvFtp',fld:'vALBENVFTP',pic:'9'},{av:'AV68AlbLic',fld:'vALBLIC',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'edtTubCod_Visible',ctrl:'TUBCOD',prop:'Visible'},{av:'edtBarAlbTub_Visible',ctrl:'BARALBTUB',prop:'Visible'},{av:'edtPlasCod_Visible',ctrl:'PLASCOD',prop:'Visible'},{av:'edtBarAlbPlas_Visible',ctrl:'BARALBPLAS',prop:'Visible'},{av:'chkBarTipCor.getVisible()',ctrl:'BARTIPCOR',prop:'Visible'},{av:'AV74Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'AV76Mensaje',fld:'vMENSAJE',pic:'',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'sPrefix'},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e122522',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV53Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV54AlbProcod',fld:'vALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'AV15TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV16TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV69TFAlbEncCli',fld:'vTFALBENCCLI',pic:''},{av:'AV70TFAlbEncCli_Sel',fld:'vTFALBENCCLI_SEL',pic:''},{av:'AV17TFAlbSer',fld:'vTFALBSER',pic:''},{av:'AV18TFAlbSer_Sel',fld:'vTFALBSER_SEL',pic:''},{av:'AV19TFAlbSerD',fld:'vTFALBSERD',pic:''},{av:'AV20TFAlbSerD_Sel',fld:'vTFALBSERD_SEL',pic:''},{av:'AV21TFAlbColNom',fld:'vTFALBCOLNOM',pic:''},{av:'AV22TFAlbColNom_Sel',fld:'vTFALBCOLNOM_SEL',pic:''},{av:'AV23TFAlbColNum',fld:'vTFALBCOLNUM',pic:'ZZZZZ9'},{av:'AV24TFAlbColNum_To',fld:'vTFALBCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV71TFAlbTipCol',fld:'vTFALBTIPCOL',pic:'Z9'},{av:'AV72TFAlbTipCol_To',fld:'vTFALBTIPCOL_TO',pic:'Z9'},{av:'AV25TFAlbNomCli',fld:'vTFALBNOMCLI',pic:''},{av:'AV26TFAlbNomCli_Sel',fld:'vTFALBNOMCLI_SEL',pic:''},{av:'AV27TFBarAlbKgmE',fld:'vTFBARALBKGME',pic:'ZZZZZ9.99'},{av:'AV28TFBarAlbKgmE_To',fld:'vTFBARALBKGME_TO',pic:'ZZZZZ9.99'},{av:'AV29TFAlbHdrAnc',fld:'vTFALBHDRANC',pic:'ZZZ9'},{av:'AV30TFAlbHdrAnc_To',fld:'vTFALBHDRANC_TO',pic:'ZZZ9'},{av:'AV31TFAlbHdrgm2',fld:'vTFALBHDRGM2',pic:'ZZZ9'},{av:'AV32TFAlbHdrgm2_To',fld:'vTFALBHDRGM2_TO',pic:'ZZZ9'},{av:'AV33TFBarAlbMtrE',fld:'vTFBARALBMTRE',pic:'ZZZZZ9.99'},{av:'AV34TFBarAlbMtrE_To',fld:'vTFBARALBMTRE_TO',pic:'ZZZZZ9.99'},{av:'AV35TFBarAlbPie',fld:'vTFBARALBPIE',pic:'ZZZZZ9'},{av:'AV36TFBarAlbPie_To',fld:'vTFBARALBPIE_TO',pic:'ZZZZZ9'},{av:'AV37TFTubCod',fld:'vTFTUBCOD',pic:'ZZZ9'},{av:'AV38TFTubCod_To',fld:'vTFTUBCOD_TO',pic:'ZZZ9'},{av:'AV39TFBarAlbTub',fld:'vTFBARALBTUB',pic:'ZZZ9'},{av:'AV40TFBarAlbTub_To',fld:'vTFBARALBTUB_TO',pic:'ZZZ9'},{av:'AV41TFPlasCod',fld:'vTFPLASCOD',pic:'ZZZ9'},{av:'AV42TFPlasCod_To',fld:'vTFPLASCOD_TO',pic:'ZZZ9'},{av:'AV43TFBarAlbPlas',fld:'vTFBARALBPLAS',pic:'ZZZ9'},{av:'AV44TFBarAlbPlas_To',fld:'vTFBARALBPLAS_TO',pic:'ZZZ9'},{av:'AV45TFAlbHdrObs',fld:'vTFALBHDROBS',pic:''},{av:'AV46TFAlbHdrObs_Sel',fld:'vTFALBHDROBS_SEL',pic:''},{av:'AV48TFAlbProVal_Sels',fld:'vTFALBPROVAL_SELS',pic:''},{av:'AV59TFBarSit',fld:'vTFBARSIT',pic:'Z9'},{av:'AV60TFBarSit_To',fld:'vTFBARSIT_TO',pic:'Z9'},{av:'AV73TFBarTipCor_Sel',fld:'vTFBARTIPCOR_SEL',pic:''},{av:'AV81Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV62Guiremcli',fld:'vGUIREMCLI',pic:'ZZZZZ9'},{av:'AV63GuiRemCln',fld:'vGUIREMCLN',pic:''},{av:'AV64AlbProFch',fld:'vALBPROFCH',pic:''},{av:'AV65AlbSec',fld:'vALBSEC',pic:'@!'},{av:'AV66AlbPropri',fld:'vALBPROPRI',pic:'9'},{av:'AV67AlbEnvFtp',fld:'vALBENVFTP',pic:'9'},{av:'AV68AlbLic',fld:'vALBLIC',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'edtTubCod_Visible',ctrl:'TUBCOD',prop:'Visible'},{av:'edtBarAlbTub_Visible',ctrl:'BARALBTUB',prop:'Visible'},{av:'edtPlasCod_Visible',ctrl:'PLASCOD',prop:'Visible'},{av:'edtBarAlbPlas_Visible',ctrl:'BARALBPLAS',prop:'Visible'},{av:'chkBarTipCor.getVisible()',ctrl:'BARTIPCOR',prop:'Visible'},{av:'AV74Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'AV76Mensaje',fld:'vMENSAJE',pic:'',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'sPrefix'},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e132522',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV53Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV54AlbProcod',fld:'vALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'AV15TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV16TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV69TFAlbEncCli',fld:'vTFALBENCCLI',pic:''},{av:'AV70TFAlbEncCli_Sel',fld:'vTFALBENCCLI_SEL',pic:''},{av:'AV17TFAlbSer',fld:'vTFALBSER',pic:''},{av:'AV18TFAlbSer_Sel',fld:'vTFALBSER_SEL',pic:''},{av:'AV19TFAlbSerD',fld:'vTFALBSERD',pic:''},{av:'AV20TFAlbSerD_Sel',fld:'vTFALBSERD_SEL',pic:''},{av:'AV21TFAlbColNom',fld:'vTFALBCOLNOM',pic:''},{av:'AV22TFAlbColNom_Sel',fld:'vTFALBCOLNOM_SEL',pic:''},{av:'AV23TFAlbColNum',fld:'vTFALBCOLNUM',pic:'ZZZZZ9'},{av:'AV24TFAlbColNum_To',fld:'vTFALBCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV71TFAlbTipCol',fld:'vTFALBTIPCOL',pic:'Z9'},{av:'AV72TFAlbTipCol_To',fld:'vTFALBTIPCOL_TO',pic:'Z9'},{av:'AV25TFAlbNomCli',fld:'vTFALBNOMCLI',pic:''},{av:'AV26TFAlbNomCli_Sel',fld:'vTFALBNOMCLI_SEL',pic:''},{av:'AV27TFBarAlbKgmE',fld:'vTFBARALBKGME',pic:'ZZZZZ9.99'},{av:'AV28TFBarAlbKgmE_To',fld:'vTFBARALBKGME_TO',pic:'ZZZZZ9.99'},{av:'AV29TFAlbHdrAnc',fld:'vTFALBHDRANC',pic:'ZZZ9'},{av:'AV30TFAlbHdrAnc_To',fld:'vTFALBHDRANC_TO',pic:'ZZZ9'},{av:'AV31TFAlbHdrgm2',fld:'vTFALBHDRGM2',pic:'ZZZ9'},{av:'AV32TFAlbHdrgm2_To',fld:'vTFALBHDRGM2_TO',pic:'ZZZ9'},{av:'AV33TFBarAlbMtrE',fld:'vTFBARALBMTRE',pic:'ZZZZZ9.99'},{av:'AV34TFBarAlbMtrE_To',fld:'vTFBARALBMTRE_TO',pic:'ZZZZZ9.99'},{av:'AV35TFBarAlbPie',fld:'vTFBARALBPIE',pic:'ZZZZZ9'},{av:'AV36TFBarAlbPie_To',fld:'vTFBARALBPIE_TO',pic:'ZZZZZ9'},{av:'AV37TFTubCod',fld:'vTFTUBCOD',pic:'ZZZ9'},{av:'AV38TFTubCod_To',fld:'vTFTUBCOD_TO',pic:'ZZZ9'},{av:'AV39TFBarAlbTub',fld:'vTFBARALBTUB',pic:'ZZZ9'},{av:'AV40TFBarAlbTub_To',fld:'vTFBARALBTUB_TO',pic:'ZZZ9'},{av:'AV41TFPlasCod',fld:'vTFPLASCOD',pic:'ZZZ9'},{av:'AV42TFPlasCod_To',fld:'vTFPLASCOD_TO',pic:'ZZZ9'},{av:'AV43TFBarAlbPlas',fld:'vTFBARALBPLAS',pic:'ZZZ9'},{av:'AV44TFBarAlbPlas_To',fld:'vTFBARALBPLAS_TO',pic:'ZZZ9'},{av:'AV45TFAlbHdrObs',fld:'vTFALBHDROBS',pic:''},{av:'AV46TFAlbHdrObs_Sel',fld:'vTFALBHDROBS_SEL',pic:''},{av:'AV48TFAlbProVal_Sels',fld:'vTFALBPROVAL_SELS',pic:''},{av:'AV59TFBarSit',fld:'vTFBARSIT',pic:'Z9'},{av:'AV60TFBarSit_To',fld:'vTFBARSIT_TO',pic:'Z9'},{av:'AV73TFBarTipCor_Sel',fld:'vTFBARTIPCOR_SEL',pic:''},{av:'AV81Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV62Guiremcli',fld:'vGUIREMCLI',pic:'ZZZZZ9'},{av:'AV63GuiRemCln',fld:'vGUIREMCLN',pic:''},{av:'AV64AlbProFch',fld:'vALBPROFCH',pic:''},{av:'AV65AlbSec',fld:'vALBSEC',pic:'@!'},{av:'AV66AlbPropri',fld:'vALBPROPRI',pic:'9'},{av:'AV67AlbEnvFtp',fld:'vALBENVFTP',pic:'9'},{av:'AV68AlbLic',fld:'vALBLIC',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'edtTubCod_Visible',ctrl:'TUBCOD',prop:'Visible'},{av:'edtBarAlbTub_Visible',ctrl:'BARALBTUB',prop:'Visible'},{av:'edtPlasCod_Visible',ctrl:'PLASCOD',prop:'Visible'},{av:'edtBarAlbPlas_Visible',ctrl:'BARALBPLAS',prop:'Visible'},{av:'chkBarTipCor.getVisible()',ctrl:'BARTIPCOR',prop:'Visible'},{av:'AV74Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'AV76Mensaje',fld:'vMENSAJE',pic:'',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'sPrefix'},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'},{av:'Ddo_grid_Selectedvalue_get',ctrl:'DDO_GRID',prop:'SelectedValue_get'},{av:'Ddo_grid_Filteredtextto_get',ctrl:'DDO_GRID',prop:'FilteredTextTo_get'},{av:'Ddo_grid_Filteredtext_get',ctrl:'DDO_GRID',prop:'FilteredText_get'},{av:'Ddo_grid_Selectedcolumn',ctrl:'DDO_GRID',prop:'SelectedColumn'}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV73TFBarTipCor_Sel',fld:'vTFBARTIPCOR_SEL',pic:''},{av:'AV59TFBarSit',fld:'vTFBARSIT',pic:'Z9'},{av:'AV60TFBarSit_To',fld:'vTFBARSIT_TO',pic:'Z9'},{av:'AV47TFAlbProVal_SelsJson',fld:'vTFALBPROVAL_SELSJSON',pic:''},{av:'AV48TFAlbProVal_Sels',fld:'vTFALBPROVAL_SELS',pic:''},{av:'AV45TFAlbHdrObs',fld:'vTFALBHDROBS',pic:''},{av:'AV46TFAlbHdrObs_Sel',fld:'vTFALBHDROBS_SEL',pic:''},{av:'AV43TFBarAlbPlas',fld:'vTFBARALBPLAS',pic:'ZZZ9'},{av:'AV44TFBarAlbPlas_To',fld:'vTFBARALBPLAS_TO',pic:'ZZZ9'},{av:'AV41TFPlasCod',fld:'vTFPLASCOD',pic:'ZZZ9'},{av:'AV42TFPlasCod_To',fld:'vTFPLASCOD_TO',pic:'ZZZ9'},{av:'AV39TFBarAlbTub',fld:'vTFBARALBTUB',pic:'ZZZ9'},{av:'AV40TFBarAlbTub_To',fld:'vTFBARALBTUB_TO',pic:'ZZZ9'},{av:'AV37TFTubCod',fld:'vTFTUBCOD',pic:'ZZZ9'},{av:'AV38TFTubCod_To',fld:'vTFTUBCOD_TO',pic:'ZZZ9'},{av:'AV35TFBarAlbPie',fld:'vTFBARALBPIE',pic:'ZZZZZ9'},{av:'AV36TFBarAlbPie_To',fld:'vTFBARALBPIE_TO',pic:'ZZZZZ9'},{av:'AV33TFBarAlbMtrE',fld:'vTFBARALBMTRE',pic:'ZZZZZ9.99'},{av:'AV34TFBarAlbMtrE_To',fld:'vTFBARALBMTRE_TO',pic:'ZZZZZ9.99'},{av:'AV31TFAlbHdrgm2',fld:'vTFALBHDRGM2',pic:'ZZZ9'},{av:'AV32TFAlbHdrgm2_To',fld:'vTFALBHDRGM2_TO',pic:'ZZZ9'},{av:'AV29TFAlbHdrAnc',fld:'vTFALBHDRANC',pic:'ZZZ9'},{av:'AV30TFAlbHdrAnc_To',fld:'vTFALBHDRANC_TO',pic:'ZZZ9'},{av:'AV27TFBarAlbKgmE',fld:'vTFBARALBKGME',pic:'ZZZZZ9.99'},{av:'AV28TFBarAlbKgmE_To',fld:'vTFBARALBKGME_TO',pic:'ZZZZZ9.99'},{av:'AV25TFAlbNomCli',fld:'vTFALBNOMCLI',pic:''},{av:'AV26TFAlbNomCli_Sel',fld:'vTFALBNOMCLI_SEL',pic:''},{av:'AV71TFAlbTipCol',fld:'vTFALBTIPCOL',pic:'Z9'},{av:'AV72TFAlbTipCol_To',fld:'vTFALBTIPCOL_TO',pic:'Z9'},{av:'AV23TFAlbColNum',fld:'vTFALBCOLNUM',pic:'ZZZZZ9'},{av:'AV24TFAlbColNum_To',fld:'vTFALBCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV21TFAlbColNom',fld:'vTFALBCOLNOM',pic:''},{av:'AV22TFAlbColNom_Sel',fld:'vTFALBCOLNOM_SEL',pic:''},{av:'AV19TFAlbSerD',fld:'vTFALBSERD',pic:''},{av:'AV20TFAlbSerD_Sel',fld:'vTFALBSERD_SEL',pic:''},{av:'AV17TFAlbSer',fld:'vTFALBSER',pic:''},{av:'AV18TFAlbSer_Sel',fld:'vTFALBSER_SEL',pic:''},{av:'AV69TFAlbEncCli',fld:'vTFALBENCCLI',pic:''},{av:'AV70TFAlbEncCli_Sel',fld:'vTFALBENCCLI_SEL',pic:''},{av:'AV15TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV16TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e162522',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'AV53Emprcod',fld:'vEMPRCOD',pic:'@!'}]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'cmbavGridactiongroup1'},{av:'AV61GridActionGroup1',fld:'vGRIDACTIONGROUP1',pic:'ZZZ9'}]}");
      setEventMetadata("VGRIDACTIONGROUP1.CLICK","{handler:'e172522',iparms:[{av:'cmbavGridactiongroup1'},{av:'AV61GridActionGroup1',fld:'vGRIDACTIONGROUP1',pic:'ZZZ9'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV53Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV54AlbProcod',fld:'vALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'AV15TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV16TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV69TFAlbEncCli',fld:'vTFALBENCCLI',pic:''},{av:'AV70TFAlbEncCli_Sel',fld:'vTFALBENCCLI_SEL',pic:''},{av:'AV17TFAlbSer',fld:'vTFALBSER',pic:''},{av:'AV18TFAlbSer_Sel',fld:'vTFALBSER_SEL',pic:''},{av:'AV19TFAlbSerD',fld:'vTFALBSERD',pic:''},{av:'AV20TFAlbSerD_Sel',fld:'vTFALBSERD_SEL',pic:''},{av:'AV21TFAlbColNom',fld:'vTFALBCOLNOM',pic:''},{av:'AV22TFAlbColNom_Sel',fld:'vTFALBCOLNOM_SEL',pic:''},{av:'AV23TFAlbColNum',fld:'vTFALBCOLNUM',pic:'ZZZZZ9'},{av:'AV24TFAlbColNum_To',fld:'vTFALBCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV71TFAlbTipCol',fld:'vTFALBTIPCOL',pic:'Z9'},{av:'AV72TFAlbTipCol_To',fld:'vTFALBTIPCOL_TO',pic:'Z9'},{av:'AV25TFAlbNomCli',fld:'vTFALBNOMCLI',pic:''},{av:'AV26TFAlbNomCli_Sel',fld:'vTFALBNOMCLI_SEL',pic:''},{av:'AV27TFBarAlbKgmE',fld:'vTFBARALBKGME',pic:'ZZZZZ9.99'},{av:'AV28TFBarAlbKgmE_To',fld:'vTFBARALBKGME_TO',pic:'ZZZZZ9.99'},{av:'AV29TFAlbHdrAnc',fld:'vTFALBHDRANC',pic:'ZZZ9'},{av:'AV30TFAlbHdrAnc_To',fld:'vTFALBHDRANC_TO',pic:'ZZZ9'},{av:'AV31TFAlbHdrgm2',fld:'vTFALBHDRGM2',pic:'ZZZ9'},{av:'AV32TFAlbHdrgm2_To',fld:'vTFALBHDRGM2_TO',pic:'ZZZ9'},{av:'AV33TFBarAlbMtrE',fld:'vTFBARALBMTRE',pic:'ZZZZZ9.99'},{av:'AV34TFBarAlbMtrE_To',fld:'vTFBARALBMTRE_TO',pic:'ZZZZZ9.99'},{av:'AV35TFBarAlbPie',fld:'vTFBARALBPIE',pic:'ZZZZZ9'},{av:'AV36TFBarAlbPie_To',fld:'vTFBARALBPIE_TO',pic:'ZZZZZ9'},{av:'AV37TFTubCod',fld:'vTFTUBCOD',pic:'ZZZ9'},{av:'AV38TFTubCod_To',fld:'vTFTUBCOD_TO',pic:'ZZZ9'},{av:'AV39TFBarAlbTub',fld:'vTFBARALBTUB',pic:'ZZZ9'},{av:'AV40TFBarAlbTub_To',fld:'vTFBARALBTUB_TO',pic:'ZZZ9'},{av:'AV41TFPlasCod',fld:'vTFPLASCOD',pic:'ZZZ9'},{av:'AV42TFPlasCod_To',fld:'vTFPLASCOD_TO',pic:'ZZZ9'},{av:'AV43TFBarAlbPlas',fld:'vTFBARALBPLAS',pic:'ZZZ9'},{av:'AV44TFBarAlbPlas_To',fld:'vTFBARALBPLAS_TO',pic:'ZZZ9'},{av:'AV45TFAlbHdrObs',fld:'vTFALBHDROBS',pic:''},{av:'AV46TFAlbHdrObs_Sel',fld:'vTFALBHDROBS_SEL',pic:''},{av:'AV48TFAlbProVal_Sels',fld:'vTFALBPROVAL_SELS',pic:''},{av:'AV59TFBarSit',fld:'vTFBARSIT',pic:'Z9'},{av:'AV60TFBarSit_To',fld:'vTFBARSIT_TO',pic:'Z9'},{av:'AV73TFBarTipCor_Sel',fld:'vTFBARTIPCOR_SEL',pic:''},{av:'AV81Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV62Guiremcli',fld:'vGUIREMCLI',pic:'ZZZZZ9'},{av:'AV63GuiRemCln',fld:'vGUIREMCLN',pic:''},{av:'AV64AlbProFch',fld:'vALBPROFCH',pic:''},{av:'AV65AlbSec',fld:'vALBSEC',pic:'@!'},{av:'AV66AlbPropri',fld:'vALBPROPRI',pic:'9'},{av:'AV67AlbEnvFtp',fld:'vALBENVFTP',pic:'9'},{av:'AV68AlbLic',fld:'vALBLIC',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'edtTubCod_Visible',ctrl:'TUBCOD',prop:'Visible'},{av:'edtBarAlbTub_Visible',ctrl:'BARALBTUB',prop:'Visible'},{av:'edtPlasCod_Visible',ctrl:'PLASCOD',prop:'Visible'},{av:'edtBarAlbPlas_Visible',ctrl:'BARALBPLAS',prop:'Visible'},{av:'chkBarTipCor.getVisible()',ctrl:'BARTIPCOR',prop:'Visible'},{av:'AV74Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'AV76Mensaje',fld:'vMENSAJE',pic:'',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'sPrefix'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A5291BarTipCor',fld:'BARTIPCOR',pic:''},{av:'A1265BarAlbPie',fld:'BARALBPIE',pic:'ZZZZZ9'},{av:'A1261BarAlbKgmE',fld:'BARALBKGME',pic:'ZZZZZ9.99'},{av:'A1263BarAlbMtrE',fld:'BARALBMTRE',pic:'ZZZZZ9.99'},{av:'A30AlbProCod',fld:'ALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'AV58AlbContLin',fld:'vALBCONTLIN',pic:'ZZZ9'}]");
      setEventMetadata("VGRIDACTIONGROUP1.CLICK",",oparms:[{av:'cmbavGridactiongroup1'},{av:'AV61GridActionGroup1',fld:'vGRIDACTIONGROUP1',pic:'ZZZ9'},{av:'A1263BarAlbMtrE',fld:'BARALBMTRE',pic:'ZZZZZ9.99'},{av:'A1261BarAlbKgmE',fld:'BARALBKGME',pic:'ZZZZZ9.99'},{av:'A1265BarAlbPie',fld:'BARALBPIE',pic:'ZZZZZ9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A30AlbProCod',fld:'ALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'AV53Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV58AlbContLin',fld:'vALBCONTLIN',pic:'ZZZ9'},{av:'AV51GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV52GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'}]}");
      setEventMetadata("VALID_BARCOD","{handler:'valid_Barcod',iparms:[]");
      setEventMetadata("VALID_BARCOD",",oparms:[]}");
      setEventMetadata("VALID_BARCODREO","{handler:'valid_Barcodreo',iparms:[]");
      setEventMetadata("VALID_BARCODREO",",oparms:[]}");
      setEventMetadata("VALID_BARCODPAR","{handler:'valid_Barcodpar',iparms:[]");
      setEventMetadata("VALID_BARCODPAR",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Bartipcor',iparms:[]");
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
      wcpOAV53Emprcod = "" ;
      wcpOAV63GuiRemCln = "" ;
      wcpOAV64AlbProFch = GXutil.nullDate() ;
      wcpOAV65AlbSec = "" ;
      wcpOAV66AlbPropri = "" ;
      wcpOAV68AlbLic = "" ;
      wcpOGx_mode = "" ;
      Gridpaginationbar_Selectedpage = "" ;
      Ddo_grid_Activeeventkey = "" ;
      Ddo_grid_Selectedvalue_get = "" ;
      Ddo_grid_Filteredtextto_get = "" ;
      Ddo_grid_Filteredtext_get = "" ;
      Ddo_grid_Selectedcolumn = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      sPrefix = "" ;
      AV53Emprcod = "" ;
      AV63GuiRemCln = "" ;
      AV64AlbProFch = GXutil.nullDate() ;
      AV65AlbSec = "" ;
      AV66AlbPropri = "" ;
      AV68AlbLic = "" ;
      Gx_mode = "" ;
      AV15TFBarNHdr = "" ;
      AV16TFBarNHdr_Sel = "" ;
      AV69TFAlbEncCli = "" ;
      AV70TFAlbEncCli_Sel = "" ;
      AV17TFAlbSer = "" ;
      AV18TFAlbSer_Sel = "" ;
      AV19TFAlbSerD = "" ;
      AV20TFAlbSerD_Sel = "" ;
      AV21TFAlbColNom = "" ;
      AV22TFAlbColNom_Sel = "" ;
      AV25TFAlbNomCli = "" ;
      AV26TFAlbNomCli_Sel = "" ;
      AV27TFBarAlbKgmE = DecimalUtil.ZERO ;
      AV28TFBarAlbKgmE_To = DecimalUtil.ZERO ;
      AV33TFBarAlbMtrE = DecimalUtil.ZERO ;
      AV34TFBarAlbMtrE_To = DecimalUtil.ZERO ;
      AV45TFAlbHdrObs = "" ;
      AV46TFAlbHdrObs_Sel = "" ;
      AV48TFAlbProVal_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV73TFBarTipCor_Sel = "" ;
      AV81Pgmname = "" ;
      AV76Mensaje = "" ;
      A396EmprCod = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      AV49DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      Ddo_grid_Caption = "" ;
      Ddo_grid_Filteredtext_set = "" ;
      Ddo_grid_Filteredtextto_set = "" ;
      Ddo_grid_Selectedvalue_set = "" ;
      Ddo_grid_Sortedstatus = "" ;
      Grid_empowerer_Gridinternalname = "" ;
      GX_FocusControl = "" ;
      ClassString = "" ;
      StyleString = "" ;
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucGridpaginationbar = new com.genexus.webpanels.GXUserControl();
      ucDatamonjs = new com.genexus.webpanels.GXUserControl();
      ucDdo_grid = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      sXEvt = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      A13696BarNHdr = "" ;
      A4815AlbEncCli = "" ;
      A3391AlbSer = "" ;
      A8879AlbSerD = "" ;
      A3392AlbColNom = "" ;
      A12232AlbNomCli = "" ;
      A1261BarAlbKgmE = DecimalUtil.ZERO ;
      A1263BarAlbMtrE = DecimalUtil.ZERO ;
      A130BarCodPar = "" ;
      A2441AlbHdrObs = "" ;
      A2839AlbProVal = "" ;
      A5291BarTipCor = "" ;
      AV118Documentotransporteproduccion_documentodetransporteproduccion_7ds_37_tfalbproval_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      scmdbuf = "" ;
      lV82Documentotransporteproduccion_documentodetransporteproduccion_7ds_1_tfbarnhdr = "" ;
      lV84Documentotransporteproduccion_documentodetransporteproduccion_7ds_3_tfalbenccli = "" ;
      lV86Documentotransporteproduccion_documentodetransporteproduccion_7ds_5_tfalbser = "" ;
      lV88Documentotransporteproduccion_documentodetransporteproduccion_7ds_7_tfalbserd = "" ;
      lV90Documentotransporteproduccion_documentodetransporteproduccion_7ds_9_tfalbcolnom = "" ;
      lV96Documentotransporteproduccion_documentodetransporteproduccion_7ds_15_tfalbnomcli = "" ;
      lV116Documentotransporteproduccion_documentodetransporteproduccion_7ds_35_tfalbhdrobs = "" ;
      AV83Documentotransporteproduccion_documentodetransporteproduccion_7ds_2_tfbarnhdr_sel = "" ;
      AV82Documentotransporteproduccion_documentodetransporteproduccion_7ds_1_tfbarnhdr = "" ;
      AV85Documentotransporteproduccion_documentodetransporteproduccion_7ds_4_tfalbenccli_sel = "" ;
      AV84Documentotransporteproduccion_documentodetransporteproduccion_7ds_3_tfalbenccli = "" ;
      AV87Documentotransporteproduccion_documentodetransporteproduccion_7ds_6_tfalbser_sel = "" ;
      AV86Documentotransporteproduccion_documentodetransporteproduccion_7ds_5_tfalbser = "" ;
      AV89Documentotransporteproduccion_documentodetransporteproduccion_7ds_8_tfalbserd_sel = "" ;
      AV88Documentotransporteproduccion_documentodetransporteproduccion_7ds_7_tfalbserd = "" ;
      AV91Documentotransporteproduccion_documentodetransporteproduccion_7ds_10_tfalbcolnom_sel = "" ;
      AV90Documentotransporteproduccion_documentodetransporteproduccion_7ds_9_tfalbcolnom = "" ;
      AV97Documentotransporteproduccion_documentodetransporteproduccion_7ds_16_tfalbnomcli_sel = "" ;
      AV96Documentotransporteproduccion_documentodetransporteproduccion_7ds_15_tfalbnomcli = "" ;
      AV98Documentotransporteproduccion_documentodetransporteproduccion_7ds_17_tfbaralbkgme = DecimalUtil.ZERO ;
      AV99Documentotransporteproduccion_documentodetransporteproduccion_7ds_18_tfbaralbkgme_to = DecimalUtil.ZERO ;
      AV104Documentotransporteproduccion_documentodetransporteproduccion_7ds_23_tfbaralbmtre = DecimalUtil.ZERO ;
      AV105Documentotransporteproduccion_documentodetransporteproduccion_7ds_24_tfbaralbmtre_to = DecimalUtil.ZERO ;
      AV117Documentotransporteproduccion_documentodetransporteproduccion_7ds_36_tfalbhdrobs_sel = "" ;
      AV116Documentotransporteproduccion_documentodetransporteproduccion_7ds_35_tfalbhdrobs = "" ;
      AV121Documentotransporteproduccion_documentodetransporteproduccion_7ds_40_tfbartipcor_sel = "" ;
      H02522_A396EmprCod = new String[] {""} ;
      H02522_A30AlbProCod = new long[1] ;
      H02522_A5291BarTipCor = new String[] {""} ;
      H02522_A213BarSit = new byte[1] ;
      H02522_A2839AlbProVal = new String[] {""} ;
      H02522_A2441AlbHdrObs = new String[] {""} ;
      H02522_A6467BarAlbPlas = new short[1] ;
      H02522_A6466PlasCod = new short[1] ;
      H02522_n6466PlasCod = new boolean[] {false} ;
      H02522_A1266BarAlbTub = new int[1] ;
      H02522_A1206TubCod = new short[1] ;
      H02522_n1206TubCod = new boolean[] {false} ;
      H02522_A1265BarAlbPie = new int[1] ;
      H02522_A1263BarAlbMtrE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H02522_A5019AlbHdrgm2 = new short[1] ;
      H02522_A3271AlbHdrAnc = new short[1] ;
      H02522_A1261BarAlbKgmE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H02522_A12232AlbNomCli = new String[] {""} ;
      H02522_A3394AlbTipCol = new byte[1] ;
      H02522_A3393AlbColNum = new int[1] ;
      H02522_A3392AlbColNom = new String[] {""} ;
      H02522_A8879AlbSerD = new String[] {""} ;
      H02522_A3391AlbSer = new String[] {""} ;
      H02522_A4815AlbEncCli = new String[] {""} ;
      H02522_A130BarCodPar = new String[] {""} ;
      H02522_A132BarCodReo = new byte[1] ;
      H02522_A129BarCod = new int[1] ;
      H02523_AGRID_nRecordCount = new long[1] ;
      hsh = "" ;
      AV55Station = "" ;
      AV57EmprNom = "" ;
      AV56UsurCod = "" ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV6WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext7 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV47TFAlbProVal_SelsJson = "" ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      GXv_decimal11 = new java.math.BigDecimal[1] ;
      GXv_decimal12 = new java.math.BigDecimal[1] ;
      AV75MetPieCtr = "" ;
      Gx_msg = "" ;
      GXv_int10 = new int[1] ;
      GXv_int9 = new byte[1] ;
      GXv_int14 = new byte[1] ;
      GXv_int13 = new long[1] ;
      GXv_int15 = new short[1] ;
      AV14Session = httpContext.getWebSession();
      AV10GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV11GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      GXt_char1 = "" ;
      GXt_char16 = "" ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
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
      GXt_char17 = "" ;
      GXv_char4 = new String[1] ;
      AV8TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV7HTTPRequest = httpContext.getHttpRequest();
      GXv_SdtWWPGridState30 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlAV53Emprcod = "" ;
      sCtrlAV54AlbProcod = "" ;
      sCtrlAV62Guiremcli = "" ;
      sCtrlAV63GuiRemCln = "" ;
      sCtrlAV64AlbProFch = "" ;
      sCtrlAV65AlbSec = "" ;
      sCtrlAV66AlbPropri = "" ;
      sCtrlAV67AlbEnvFtp = "" ;
      sCtrlAV68AlbLic = "" ;
      sCtrlGx_mode = "" ;
      subGrid_Linesclass = "" ;
      TempTags = "" ;
      GXCCtl = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.documentotransporteproduccion.documentodetransporteproduccion_7__default(),
         new Object[] {
             new Object[] {
            H02522_A396EmprCod, H02522_A30AlbProCod, H02522_A5291BarTipCor, H02522_A213BarSit, H02522_A2839AlbProVal, H02522_A2441AlbHdrObs, H02522_A6467BarAlbPlas, H02522_A6466PlasCod, H02522_n6466PlasCod, H02522_A1266BarAlbTub,
            H02522_A1206TubCod, H02522_n1206TubCod, H02522_A1265BarAlbPie, H02522_A1263BarAlbMtrE, H02522_A5019AlbHdrgm2, H02522_A3271AlbHdrAnc, H02522_A1261BarAlbKgmE, H02522_A12232AlbNomCli, H02522_A3394AlbTipCol, H02522_A3393AlbColNum,
            H02522_A3392AlbColNom, H02522_A8879AlbSerD, H02522_A3391AlbSer, H02522_A4815AlbEncCli, H02522_A130BarCodPar, H02522_A132BarCodReo, H02522_A129BarCod
            }
            , new Object[] {
            H02523_AGRID_nRecordCount
            }
         }
      );
      AV81Pgmname = "DocumentoTransporteProduccion.DocumentodeTransporteProduccion_7" ;
      /* GeneXus formulas. */
      AV81Pgmname = "DocumentoTransporteProduccion.DocumentodeTransporteProduccion_7" ;
      Gx_err = (short)(0) ;
      edtavPgmname_Enabled = 0 ;
   }

   private byte wcpOAV67AlbEnvFtp ;
   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDynComponent ;
   private byte AV67AlbEnvFtp ;
   private byte AV71TFAlbTipCol ;
   private byte AV72TFAlbTipCol_To ;
   private byte AV59TFBarSit ;
   private byte AV60TFBarSit_To ;
   private byte nDraw ;
   private byte nDoneStart ;
   private byte A3394AlbTipCol ;
   private byte A132BarCodReo ;
   private byte A213BarSit ;
   private byte nDonePA ;
   private byte subGrid_Backcolorstyle ;
   private byte subGrid_Sortable ;
   private byte AV94Documentotransporteproduccion_documentodetransporteproduccion_7ds_13_tfalbtipcol ;
   private byte AV95Documentotransporteproduccion_documentodetransporteproduccion_7ds_14_tfalbtipcol_to ;
   private byte AV119Documentotransporteproduccion_documentodetransporteproduccion_7ds_38_tfbarsit ;
   private byte AV120Documentotransporteproduccion_documentodetransporteproduccion_7ds_39_tfbarsit_to ;
   private byte GXt_int8 ;
   private byte GXv_int9[] ;
   private byte GXv_int14[] ;
   private byte nGXWrapped ;
   private byte subGrid_Backstyle ;
   private byte subGrid_Titlebackstyle ;
   private byte subGrid_Allowselection ;
   private byte subGrid_Allowhovering ;
   private byte subGrid_Allowcollapsing ;
   private byte subGrid_Collapsed ;
   private short AV29TFAlbHdrAnc ;
   private short AV30TFAlbHdrAnc_To ;
   private short AV31TFAlbHdrgm2 ;
   private short AV32TFAlbHdrgm2_To ;
   private short AV37TFTubCod ;
   private short AV38TFTubCod_To ;
   private short AV41TFPlasCod ;
   private short AV42TFPlasCod_To ;
   private short AV43TFBarAlbPlas ;
   private short AV44TFBarAlbPlas_To ;
   private short AV12OrderedBy ;
   private short AV74Moda21 ;
   private short AV58AlbContLin ;
   private short wbEnd ;
   private short wbStart ;
   private short AV61GridActionGroup1 ;
   private short A3271AlbHdrAnc ;
   private short A5019AlbHdrgm2 ;
   private short A1206TubCod ;
   private short A6466PlasCod ;
   private short A6467BarAlbPlas ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV100Documentotransporteproduccion_documentodetransporteproduccion_7ds_19_tfalbhdranc ;
   private short AV101Documentotransporteproduccion_documentodetransporteproduccion_7ds_20_tfalbhdranc_to ;
   private short AV102Documentotransporteproduccion_documentodetransporteproduccion_7ds_21_tfalbhdrgm2 ;
   private short AV103Documentotransporteproduccion_documentodetransporteproduccion_7ds_22_tfalbhdrgm2_to ;
   private short AV108Documentotransporteproduccion_documentodetransporteproduccion_7ds_27_tftubcod ;
   private short AV109Documentotransporteproduccion_documentodetransporteproduccion_7ds_28_tftubcod_to ;
   private short AV112Documentotransporteproduccion_documentodetransporteproduccion_7ds_31_tfplascod ;
   private short AV113Documentotransporteproduccion_documentodetransporteproduccion_7ds_32_tfplascod_to ;
   private short AV114Documentotransporteproduccion_documentodetransporteproduccion_7ds_33_tfbaralbplas ;
   private short AV115Documentotransporteproduccion_documentodetransporteproduccion_7ds_34_tfbaralbplas_to ;
   private short GXv_int15[] ;
   private int wcpOAV62Guiremcli ;
   private int edtTubCod_Visible ;
   private int edtBarAlbTub_Visible ;
   private int edtPlasCod_Visible ;
   private int edtBarAlbPlas_Visible ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_15 ;
   private int AV62Guiremcli ;
   private int nGXsfl_15_idx=1 ;
   private int AV23TFAlbColNum ;
   private int AV24TFAlbColNum_To ;
   private int AV35TFBarAlbPie ;
   private int AV36TFBarAlbPie_To ;
   private int AV39TFBarAlbTub ;
   private int AV40TFBarAlbTub_To ;
   private int Gridpaginationbar_Pagestoshow ;
   private int edtavPgmname_Enabled ;
   private int A3393AlbColNum ;
   private int A1265BarAlbPie ;
   private int A129BarCod ;
   private int A1266BarAlbTub ;
   private int subGrid_Islastpage ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private int AV118Documentotransporteproduccion_documentodetransporteproduccion_7ds_37_tfalbproval_sels_size ;
   private int AV92Documentotransporteproduccion_documentodetransporteproduccion_7ds_11_tfalbcolnum ;
   private int AV93Documentotransporteproduccion_documentodetransporteproduccion_7ds_12_tfalbcolnum_to ;
   private int AV106Documentotransporteproduccion_documentodetransporteproduccion_7ds_25_tfbaralbpie ;
   private int AV107Documentotransporteproduccion_documentodetransporteproduccion_7ds_26_tfbaralbpie_to ;
   private int AV110Documentotransporteproduccion_documentodetransporteproduccion_7ds_29_tfbaralbtub ;
   private int AV111Documentotransporteproduccion_documentodetransporteproduccion_7ds_30_tfbaralbtub_to ;
   private int AV50PageToGo ;
   private int GXv_int10[] ;
   private int AV123GXV1 ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long wcpOAV54AlbProcod ;
   private long GRID_nFirstRecordOnPage ;
   private long AV54AlbProcod ;
   private long AV51GridCurrentPage ;
   private long AV52GridPageCount ;
   private long A30AlbProCod ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private long GXv_int13[] ;
   private java.math.BigDecimal AV27TFBarAlbKgmE ;
   private java.math.BigDecimal AV28TFBarAlbKgmE_To ;
   private java.math.BigDecimal AV33TFBarAlbMtrE ;
   private java.math.BigDecimal AV34TFBarAlbMtrE_To ;
   private java.math.BigDecimal A1261BarAlbKgmE ;
   private java.math.BigDecimal A1263BarAlbMtrE ;
   private java.math.BigDecimal AV98Documentotransporteproduccion_documentodetransporteproduccion_7ds_17_tfbaralbkgme ;
   private java.math.BigDecimal AV99Documentotransporteproduccion_documentodetransporteproduccion_7ds_18_tfbaralbkgme_to ;
   private java.math.BigDecimal AV104Documentotransporteproduccion_documentodetransporteproduccion_7ds_23_tfbaralbmtre ;
   private java.math.BigDecimal AV105Documentotransporteproduccion_documentodetransporteproduccion_7ds_24_tfbaralbmtre_to ;
   private java.math.BigDecimal GXv_decimal11[] ;
   private java.math.BigDecimal GXv_decimal12[] ;
   private String wcpOAV53Emprcod ;
   private String wcpOAV63GuiRemCln ;
   private String wcpOAV65AlbSec ;
   private String wcpOAV66AlbPropri ;
   private String wcpOAV68AlbLic ;
   private String wcpOGx_mode ;
   private String Gridpaginationbar_Selectedpage ;
   private String Ddo_grid_Activeeventkey ;
   private String Ddo_grid_Selectedvalue_get ;
   private String Ddo_grid_Filteredtextto_get ;
   private String Ddo_grid_Filteredtext_get ;
   private String Ddo_grid_Selectedcolumn ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sPrefix ;
   private String sCompPrefix ;
   private String sSFPrefix ;
   private String AV53Emprcod ;
   private String AV63GuiRemCln ;
   private String AV65AlbSec ;
   private String AV66AlbPropri ;
   private String AV68AlbLic ;
   private String Gx_mode ;
   private String sGXsfl_15_idx="0001" ;
   private String edtTubCod_Internalname ;
   private String edtBarAlbTub_Internalname ;
   private String edtPlasCod_Internalname ;
   private String edtBarAlbPlas_Internalname ;
   private String AV15TFBarNHdr ;
   private String AV16TFBarNHdr_Sel ;
   private String AV69TFAlbEncCli ;
   private String AV70TFAlbEncCli_Sel ;
   private String AV17TFAlbSer ;
   private String AV18TFAlbSer_Sel ;
   private String AV19TFAlbSerD ;
   private String AV20TFAlbSerD_Sel ;
   private String AV21TFAlbColNom ;
   private String AV22TFAlbColNom_Sel ;
   private String AV25TFAlbNomCli ;
   private String AV26TFAlbNomCli_Sel ;
   private String AV45TFAlbHdrObs ;
   private String AV46TFAlbHdrObs_Sel ;
   private String AV73TFBarTipCor_Sel ;
   private String AV81Pgmname ;
   private String A396EmprCod ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
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
   private String Ddo_grid_Sortedstatus ;
   private String Ddo_grid_Includefilter ;
   private String Ddo_grid_Filtertype ;
   private String Ddo_grid_Filterisrange ;
   private String Ddo_grid_Includedatalist ;
   private String Ddo_grid_Datalisttype ;
   private String Ddo_grid_Allowmultipleselection ;
   private String Ddo_grid_Datalistfixedvalues ;
   private String Ddo_grid_Datalistproc ;
   private String Grid_empowerer_Gridinternalname ;
   private String GX_FocusControl ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String divGridtablewithpaginationbar_Internalname ;
   private String sStyleString ;
   private String subGrid_Internalname ;
   private String Gridpaginationbar_Internalname ;
   private String edtavPgmname_Internalname ;
   private String edtavPgmname_Jsonclick ;
   private String Datamonjs_Internalname ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String Ddo_grid_Internalname ;
   private String Grid_empowerer_Internalname ;
   private String sXEvt ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String A13696BarNHdr ;
   private String edtBarNHdr_Internalname ;
   private String A4815AlbEncCli ;
   private String edtAlbEncCli_Internalname ;
   private String A3391AlbSer ;
   private String edtAlbSer_Internalname ;
   private String A8879AlbSerD ;
   private String edtAlbSerD_Internalname ;
   private String A3392AlbColNom ;
   private String edtAlbColNom_Internalname ;
   private String edtAlbColNum_Internalname ;
   private String edtAlbTipCol_Internalname ;
   private String A12232AlbNomCli ;
   private String edtAlbNomCli_Internalname ;
   private String edtBarAlbKgmE_Internalname ;
   private String edtAlbHdrAnc_Internalname ;
   private String edtAlbHdrgm2_Internalname ;
   private String edtBarAlbMtrE_Internalname ;
   private String edtBarAlbPie_Internalname ;
   private String edtBarCod_Internalname ;
   private String edtBarCodReo_Internalname ;
   private String A130BarCodPar ;
   private String edtBarCodPar_Internalname ;
   private String A2441AlbHdrObs ;
   private String edtAlbHdrObs_Internalname ;
   private String A2839AlbProVal ;
   private String edtBarSit_Internalname ;
   private String A5291BarTipCor ;
   private String scmdbuf ;
   private String lV82Documentotransporteproduccion_documentodetransporteproduccion_7ds_1_tfbarnhdr ;
   private String lV84Documentotransporteproduccion_documentodetransporteproduccion_7ds_3_tfalbenccli ;
   private String lV86Documentotransporteproduccion_documentodetransporteproduccion_7ds_5_tfalbser ;
   private String lV88Documentotransporteproduccion_documentodetransporteproduccion_7ds_7_tfalbserd ;
   private String lV90Documentotransporteproduccion_documentodetransporteproduccion_7ds_9_tfalbcolnom ;
   private String lV96Documentotransporteproduccion_documentodetransporteproduccion_7ds_15_tfalbnomcli ;
   private String lV116Documentotransporteproduccion_documentodetransporteproduccion_7ds_35_tfalbhdrobs ;
   private String AV83Documentotransporteproduccion_documentodetransporteproduccion_7ds_2_tfbarnhdr_sel ;
   private String AV82Documentotransporteproduccion_documentodetransporteproduccion_7ds_1_tfbarnhdr ;
   private String AV85Documentotransporteproduccion_documentodetransporteproduccion_7ds_4_tfalbenccli_sel ;
   private String AV84Documentotransporteproduccion_documentodetransporteproduccion_7ds_3_tfalbenccli ;
   private String AV87Documentotransporteproduccion_documentodetransporteproduccion_7ds_6_tfalbser_sel ;
   private String AV86Documentotransporteproduccion_documentodetransporteproduccion_7ds_5_tfalbser ;
   private String AV89Documentotransporteproduccion_documentodetransporteproduccion_7ds_8_tfalbserd_sel ;
   private String AV88Documentotransporteproduccion_documentodetransporteproduccion_7ds_7_tfalbserd ;
   private String AV91Documentotransporteproduccion_documentodetransporteproduccion_7ds_10_tfalbcolnom_sel ;
   private String AV90Documentotransporteproduccion_documentodetransporteproduccion_7ds_9_tfalbcolnom ;
   private String AV97Documentotransporteproduccion_documentodetransporteproduccion_7ds_16_tfalbnomcli_sel ;
   private String AV96Documentotransporteproduccion_documentodetransporteproduccion_7ds_15_tfalbnomcli ;
   private String AV117Documentotransporteproduccion_documentodetransporteproduccion_7ds_36_tfalbhdrobs_sel ;
   private String AV116Documentotransporteproduccion_documentodetransporteproduccion_7ds_35_tfalbhdrobs ;
   private String AV121Documentotransporteproduccion_documentodetransporteproduccion_7ds_40_tfbartipcor_sel ;
   private String hsh ;
   private String AV55Station ;
   private String AV57EmprNom ;
   private String AV56UsurCod ;
   private String AV75MetPieCtr ;
   private String Gx_msg ;
   private String GXt_char1 ;
   private String GXt_char16 ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
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
   private String GXt_char17 ;
   private String GXv_char4[] ;
   private String sCtrlAV53Emprcod ;
   private String sCtrlAV54AlbProcod ;
   private String sCtrlAV62Guiremcli ;
   private String sCtrlAV63GuiRemCln ;
   private String sCtrlAV64AlbProFch ;
   private String sCtrlAV65AlbSec ;
   private String sCtrlAV66AlbPropri ;
   private String sCtrlAV67AlbEnvFtp ;
   private String sCtrlAV68AlbLic ;
   private String sCtrlGx_mode ;
   private String sGXsfl_15_fel_idx="0001" ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String TempTags ;
   private String GXCCtl ;
   private String ROClassString ;
   private String edtBarNHdr_Jsonclick ;
   private String edtAlbEncCli_Jsonclick ;
   private String edtAlbSer_Jsonclick ;
   private String edtAlbSerD_Jsonclick ;
   private String edtAlbColNom_Jsonclick ;
   private String edtAlbColNum_Jsonclick ;
   private String edtAlbTipCol_Jsonclick ;
   private String edtAlbNomCli_Jsonclick ;
   private String edtBarAlbKgmE_Jsonclick ;
   private String edtAlbHdrAnc_Jsonclick ;
   private String edtAlbHdrgm2_Jsonclick ;
   private String edtBarAlbMtrE_Jsonclick ;
   private String edtBarAlbPie_Jsonclick ;
   private String edtBarCod_Jsonclick ;
   private String edtBarCodReo_Jsonclick ;
   private String edtBarCodPar_Jsonclick ;
   private String edtTubCod_Jsonclick ;
   private String edtBarAlbTub_Jsonclick ;
   private String edtPlasCod_Jsonclick ;
   private String edtBarAlbPlas_Jsonclick ;
   private String edtAlbHdrObs_Jsonclick ;
   private String edtBarSit_Jsonclick ;
   private String subGrid_Header ;
   private java.util.Date wcpOAV64AlbProFch ;
   private java.util.Date AV64AlbProFch ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean bGXsfl_15_Refreshing=false ;
   private boolean AV13OrderedDsc ;
   private boolean Gridpaginationbar_Showfirst ;
   private boolean Gridpaginationbar_Showprevious ;
   private boolean Gridpaginationbar_Shownext ;
   private boolean Gridpaginationbar_Showlast ;
   private boolean Gridpaginationbar_Rowsperpageselector ;
   private boolean Grid_empowerer_Hastitlesettings ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean n1206TubCod ;
   private boolean n6466PlasCod ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private boolean AV77TempBoolean ;
   private boolean Cond_result ;
   private String AV47TFAlbProVal_SelsJson ;
   private String AV76Mensaje ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV7HTTPRequest ;
   private com.genexus.webpanels.WebSession AV14Session ;
   private com.genexus.webpanels.GXUserControl ucGridpaginationbar ;
   private com.genexus.webpanels.GXUserControl ucDatamonjs ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private GXSimpleCollection<String> AV118Documentotransporteproduccion_documentodetransporteproduccion_7ds_37_tfalbproval_sels ;
   private HTMLChoice cmbavGridactiongroup1 ;
   private HTMLChoice cmbAlbProVal ;
   private ICheckbox chkBarTipCor ;
   private IDataStoreProvider pr_default ;
   private String[] H02522_A396EmprCod ;
   private long[] H02522_A30AlbProCod ;
   private String[] H02522_A5291BarTipCor ;
   private byte[] H02522_A213BarSit ;
   private String[] H02522_A2839AlbProVal ;
   private String[] H02522_A2441AlbHdrObs ;
   private short[] H02522_A6467BarAlbPlas ;
   private short[] H02522_A6466PlasCod ;
   private boolean[] H02522_n6466PlasCod ;
   private int[] H02522_A1266BarAlbTub ;
   private short[] H02522_A1206TubCod ;
   private boolean[] H02522_n1206TubCod ;
   private int[] H02522_A1265BarAlbPie ;
   private java.math.BigDecimal[] H02522_A1263BarAlbMtrE ;
   private short[] H02522_A5019AlbHdrgm2 ;
   private short[] H02522_A3271AlbHdrAnc ;
   private java.math.BigDecimal[] H02522_A1261BarAlbKgmE ;
   private String[] H02522_A12232AlbNomCli ;
   private byte[] H02522_A3394AlbTipCol ;
   private int[] H02522_A3393AlbColNum ;
   private String[] H02522_A3392AlbColNom ;
   private String[] H02522_A8879AlbSerD ;
   private String[] H02522_A3391AlbSer ;
   private String[] H02522_A4815AlbEncCli ;
   private String[] H02522_A130BarCodPar ;
   private byte[] H02522_A132BarCodReo ;
   private int[] H02522_A129BarCod ;
   private long[] H02523_AGRID_nRecordCount ;
   private GXSimpleCollection<String> AV48TFAlbProVal_Sels ;
   private app.wwpbaseobjects.SdtWWPContext AV6WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext7[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV8TrnContext ;
   private app.wwpbaseobjects.SdtWWPGridState AV10GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState30[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV11GridStateFilterValue ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV49DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[] ;
}

final  class documentodetransporteproduccion_7__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H02522( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A2839AlbProVal ,
                                          GXSimpleCollection<String> AV118Documentotransporteproduccion_documentodetransporteproduccion_7ds_37_tfalbproval_sels ,
                                          String AV83Documentotransporteproduccion_documentodetransporteproduccion_7ds_2_tfbarnhdr_sel ,
                                          String AV82Documentotransporteproduccion_documentodetransporteproduccion_7ds_1_tfbarnhdr ,
                                          String AV85Documentotransporteproduccion_documentodetransporteproduccion_7ds_4_tfalbenccli_sel ,
                                          String AV84Documentotransporteproduccion_documentodetransporteproduccion_7ds_3_tfalbenccli ,
                                          String AV87Documentotransporteproduccion_documentodetransporteproduccion_7ds_6_tfalbser_sel ,
                                          String AV86Documentotransporteproduccion_documentodetransporteproduccion_7ds_5_tfalbser ,
                                          String AV89Documentotransporteproduccion_documentodetransporteproduccion_7ds_8_tfalbserd_sel ,
                                          String AV88Documentotransporteproduccion_documentodetransporteproduccion_7ds_7_tfalbserd ,
                                          String AV91Documentotransporteproduccion_documentodetransporteproduccion_7ds_10_tfalbcolnom_sel ,
                                          String AV90Documentotransporteproduccion_documentodetransporteproduccion_7ds_9_tfalbcolnom ,
                                          int AV92Documentotransporteproduccion_documentodetransporteproduccion_7ds_11_tfalbcolnum ,
                                          int AV93Documentotransporteproduccion_documentodetransporteproduccion_7ds_12_tfalbcolnum_to ,
                                          byte AV94Documentotransporteproduccion_documentodetransporteproduccion_7ds_13_tfalbtipcol ,
                                          byte AV95Documentotransporteproduccion_documentodetransporteproduccion_7ds_14_tfalbtipcol_to ,
                                          String AV97Documentotransporteproduccion_documentodetransporteproduccion_7ds_16_tfalbnomcli_sel ,
                                          String AV96Documentotransporteproduccion_documentodetransporteproduccion_7ds_15_tfalbnomcli ,
                                          java.math.BigDecimal AV98Documentotransporteproduccion_documentodetransporteproduccion_7ds_17_tfbaralbkgme ,
                                          java.math.BigDecimal AV99Documentotransporteproduccion_documentodetransporteproduccion_7ds_18_tfbaralbkgme_to ,
                                          short AV100Documentotransporteproduccion_documentodetransporteproduccion_7ds_19_tfalbhdranc ,
                                          short AV101Documentotransporteproduccion_documentodetransporteproduccion_7ds_20_tfalbhdranc_to ,
                                          short AV102Documentotransporteproduccion_documentodetransporteproduccion_7ds_21_tfalbhdrgm2 ,
                                          short AV103Documentotransporteproduccion_documentodetransporteproduccion_7ds_22_tfalbhdrgm2_to ,
                                          java.math.BigDecimal AV104Documentotransporteproduccion_documentodetransporteproduccion_7ds_23_tfbaralbmtre ,
                                          java.math.BigDecimal AV105Documentotransporteproduccion_documentodetransporteproduccion_7ds_24_tfbaralbmtre_to ,
                                          int AV106Documentotransporteproduccion_documentodetransporteproduccion_7ds_25_tfbaralbpie ,
                                          int AV107Documentotransporteproduccion_documentodetransporteproduccion_7ds_26_tfbaralbpie_to ,
                                          short AV108Documentotransporteproduccion_documentodetransporteproduccion_7ds_27_tftubcod ,
                                          short AV109Documentotransporteproduccion_documentodetransporteproduccion_7ds_28_tftubcod_to ,
                                          int AV110Documentotransporteproduccion_documentodetransporteproduccion_7ds_29_tfbaralbtub ,
                                          int AV111Documentotransporteproduccion_documentodetransporteproduccion_7ds_30_tfbaralbtub_to ,
                                          short AV112Documentotransporteproduccion_documentodetransporteproduccion_7ds_31_tfplascod ,
                                          short AV113Documentotransporteproduccion_documentodetransporteproduccion_7ds_32_tfplascod_to ,
                                          short AV114Documentotransporteproduccion_documentodetransporteproduccion_7ds_33_tfbaralbplas ,
                                          short AV115Documentotransporteproduccion_documentodetransporteproduccion_7ds_34_tfbaralbplas_to ,
                                          String AV117Documentotransporteproduccion_documentodetransporteproduccion_7ds_36_tfalbhdrobs_sel ,
                                          String AV116Documentotransporteproduccion_documentodetransporteproduccion_7ds_35_tfalbhdrobs ,
                                          int AV118Documentotransporteproduccion_documentodetransporteproduccion_7ds_37_tfalbproval_sels_size ,
                                          byte AV119Documentotransporteproduccion_documentodetransporteproduccion_7ds_38_tfbarsit ,
                                          byte AV120Documentotransporteproduccion_documentodetransporteproduccion_7ds_39_tfbarsit_to ,
                                          String AV121Documentotransporteproduccion_documentodetransporteproduccion_7ds_40_tfbartipcor_sel ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          String A4815AlbEncCli ,
                                          String A3391AlbSer ,
                                          String A8879AlbSerD ,
                                          String A3392AlbColNom ,
                                          int A3393AlbColNum ,
                                          byte A3394AlbTipCol ,
                                          String A12232AlbNomCli ,
                                          java.math.BigDecimal A1261BarAlbKgmE ,
                                          short A3271AlbHdrAnc ,
                                          short A5019AlbHdrgm2 ,
                                          java.math.BigDecimal A1263BarAlbMtrE ,
                                          int A1265BarAlbPie ,
                                          short A1206TubCod ,
                                          int A1266BarAlbTub ,
                                          short A6466PlasCod ,
                                          short A6467BarAlbPlas ,
                                          String A2441AlbHdrObs ,
                                          byte A213BarSit ,
                                          String A5291BarTipCor ,
                                          short AV12OrderedBy ,
                                          boolean AV13OrderedDsc ,
                                          String AV53Emprcod ,
                                          long AV54AlbProcod ,
                                          String A396EmprCod ,
                                          long A30AlbProCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int31 = new byte[46];
      Object[] GXv_Object32 = new Object[2];
      String sSelectString;
      String sFromString;
      String sOrderString;
      sSelectString = " T1.EmprCod, T1.AlbProCod, T2.BarTipCor, T2.BarSit, T1.AlbProVal, T1.AlbHdrObs, T1.BarAlbPlas, T1.PlasCod, T1.BarAlbTub, T1.TubCod, T1.BarAlbPie, T1.BarAlbMtrE," ;
      sSelectString += " T1.AlbHdrgm2, T1.AlbHdrAnc, T1.BarAlbKgmE, T1.AlbNomCli, T1.AlbTipCol, T1.AlbColNum, T1.AlbColNom, T1.AlbSerD, T1.AlbSer, T1.AlbEncCli, T1.BarCodPar, T1.BarCodReo," ;
      sSelectString += " T1.BarCod" ;
      sFromString = " FROM (TXPALBBAR T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar)" ;
      sOrderString = "" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.AlbProCod = ?)");
      if ( (GXutil.strcmp("", AV83Documentotransporteproduccion_documentodetransporteproduccion_7ds_2_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV82Documentotransporteproduccion_documentodetransporteproduccion_7ds_1_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int31[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV83Documentotransporteproduccion_documentodetransporteproduccion_7ds_2_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int31[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV85Documentotransporteproduccion_documentodetransporteproduccion_7ds_4_tfalbenccli_sel)==0) && ( ! (GXutil.strcmp("", AV84Documentotransporteproduccion_documentodetransporteproduccion_7ds_3_tfalbenccli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbEncCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int31[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV85Documentotransporteproduccion_documentodetransporteproduccion_7ds_4_tfalbenccli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbEncCli = ?)");
      }
      else
      {
         GXv_int31[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV87Documentotransporteproduccion_documentodetransporteproduccion_7ds_6_tfalbser_sel)==0) && ( ! (GXutil.strcmp("", AV86Documentotransporteproduccion_documentodetransporteproduccion_7ds_5_tfalbser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int31[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV87Documentotransporteproduccion_documentodetransporteproduccion_7ds_6_tfalbser_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbSer = ?)");
      }
      else
      {
         GXv_int31[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV89Documentotransporteproduccion_documentodetransporteproduccion_7ds_8_tfalbserd_sel)==0) && ( ! (GXutil.strcmp("", AV88Documentotransporteproduccion_documentodetransporteproduccion_7ds_7_tfalbserd)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbSerD) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int31[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV89Documentotransporteproduccion_documentodetransporteproduccion_7ds_8_tfalbserd_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbSerD = ?)");
      }
      else
      {
         GXv_int31[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV91Documentotransporteproduccion_documentodetransporteproduccion_7ds_10_tfalbcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV90Documentotransporteproduccion_documentodetransporteproduccion_7ds_9_tfalbcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int31[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV91Documentotransporteproduccion_documentodetransporteproduccion_7ds_10_tfalbcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbColNom = ?)");
      }
      else
      {
         GXv_int31[11] = (byte)(1) ;
      }
      if ( ! (0==AV92Documentotransporteproduccion_documentodetransporteproduccion_7ds_11_tfalbcolnum) )
      {
         addWhere(sWhereString, "(T1.AlbColNum >= ?)");
      }
      else
      {
         GXv_int31[12] = (byte)(1) ;
      }
      if ( ! (0==AV93Documentotransporteproduccion_documentodetransporteproduccion_7ds_12_tfalbcolnum_to) )
      {
         addWhere(sWhereString, "(T1.AlbColNum <= ?)");
      }
      else
      {
         GXv_int31[13] = (byte)(1) ;
      }
      if ( ! (0==AV94Documentotransporteproduccion_documentodetransporteproduccion_7ds_13_tfalbtipcol) )
      {
         addWhere(sWhereString, "(T1.AlbTipCol >= ?)");
      }
      else
      {
         GXv_int31[14] = (byte)(1) ;
      }
      if ( ! (0==AV95Documentotransporteproduccion_documentodetransporteproduccion_7ds_14_tfalbtipcol_to) )
      {
         addWhere(sWhereString, "(T1.AlbTipCol <= ?)");
      }
      else
      {
         GXv_int31[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV97Documentotransporteproduccion_documentodetransporteproduccion_7ds_16_tfalbnomcli_sel)==0) && ( ! (GXutil.strcmp("", AV96Documentotransporteproduccion_documentodetransporteproduccion_7ds_15_tfalbnomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int31[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV97Documentotransporteproduccion_documentodetransporteproduccion_7ds_16_tfalbnomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbNomCli = ?)");
      }
      else
      {
         GXv_int31[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV98Documentotransporteproduccion_documentodetransporteproduccion_7ds_17_tfbaralbkgme)==0) )
      {
         addWhere(sWhereString, "(T1.BarAlbKgmE >= ?)");
      }
      else
      {
         GXv_int31[18] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV99Documentotransporteproduccion_documentodetransporteproduccion_7ds_18_tfbaralbkgme_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarAlbKgmE <= ?)");
      }
      else
      {
         GXv_int31[19] = (byte)(1) ;
      }
      if ( ! (0==AV100Documentotransporteproduccion_documentodetransporteproduccion_7ds_19_tfalbhdranc) )
      {
         addWhere(sWhereString, "(T1.AlbHdrAnc >= ?)");
      }
      else
      {
         GXv_int31[20] = (byte)(1) ;
      }
      if ( ! (0==AV101Documentotransporteproduccion_documentodetransporteproduccion_7ds_20_tfalbhdranc_to) )
      {
         addWhere(sWhereString, "(T1.AlbHdrAnc <= ?)");
      }
      else
      {
         GXv_int31[21] = (byte)(1) ;
      }
      if ( ! (0==AV102Documentotransporteproduccion_documentodetransporteproduccion_7ds_21_tfalbhdrgm2) )
      {
         addWhere(sWhereString, "(T1.AlbHdrgm2 >= ?)");
      }
      else
      {
         GXv_int31[22] = (byte)(1) ;
      }
      if ( ! (0==AV103Documentotransporteproduccion_documentodetransporteproduccion_7ds_22_tfalbhdrgm2_to) )
      {
         addWhere(sWhereString, "(T1.AlbHdrgm2 <= ?)");
      }
      else
      {
         GXv_int31[23] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV104Documentotransporteproduccion_documentodetransporteproduccion_7ds_23_tfbaralbmtre)==0) )
      {
         addWhere(sWhereString, "(T1.BarAlbMtrE >= ?)");
      }
      else
      {
         GXv_int31[24] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV105Documentotransporteproduccion_documentodetransporteproduccion_7ds_24_tfbaralbmtre_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarAlbMtrE <= ?)");
      }
      else
      {
         GXv_int31[25] = (byte)(1) ;
      }
      if ( ! (0==AV106Documentotransporteproduccion_documentodetransporteproduccion_7ds_25_tfbaralbpie) )
      {
         addWhere(sWhereString, "(T1.BarAlbPie >= ?)");
      }
      else
      {
         GXv_int31[26] = (byte)(1) ;
      }
      if ( ! (0==AV107Documentotransporteproduccion_documentodetransporteproduccion_7ds_26_tfbaralbpie_to) )
      {
         addWhere(sWhereString, "(T1.BarAlbPie <= ?)");
      }
      else
      {
         GXv_int31[27] = (byte)(1) ;
      }
      if ( ! (0==AV108Documentotransporteproduccion_documentodetransporteproduccion_7ds_27_tftubcod) )
      {
         addWhere(sWhereString, "(T1.TubCod >= ?)");
      }
      else
      {
         GXv_int31[28] = (byte)(1) ;
      }
      if ( ! (0==AV109Documentotransporteproduccion_documentodetransporteproduccion_7ds_28_tftubcod_to) )
      {
         addWhere(sWhereString, "(T1.TubCod <= ?)");
      }
      else
      {
         GXv_int31[29] = (byte)(1) ;
      }
      if ( ! (0==AV110Documentotransporteproduccion_documentodetransporteproduccion_7ds_29_tfbaralbtub) )
      {
         addWhere(sWhereString, "(T1.BarAlbTub >= ?)");
      }
      else
      {
         GXv_int31[30] = (byte)(1) ;
      }
      if ( ! (0==AV111Documentotransporteproduccion_documentodetransporteproduccion_7ds_30_tfbaralbtub_to) )
      {
         addWhere(sWhereString, "(T1.BarAlbTub <= ?)");
      }
      else
      {
         GXv_int31[31] = (byte)(1) ;
      }
      if ( ! (0==AV112Documentotransporteproduccion_documentodetransporteproduccion_7ds_31_tfplascod) )
      {
         addWhere(sWhereString, "(T1.PlasCod >= ?)");
      }
      else
      {
         GXv_int31[32] = (byte)(1) ;
      }
      if ( ! (0==AV113Documentotransporteproduccion_documentodetransporteproduccion_7ds_32_tfplascod_to) )
      {
         addWhere(sWhereString, "(T1.PlasCod <= ?)");
      }
      else
      {
         GXv_int31[33] = (byte)(1) ;
      }
      if ( ! (0==AV114Documentotransporteproduccion_documentodetransporteproduccion_7ds_33_tfbaralbplas) )
      {
         addWhere(sWhereString, "(T1.BarAlbPlas >= ?)");
      }
      else
      {
         GXv_int31[34] = (byte)(1) ;
      }
      if ( ! (0==AV115Documentotransporteproduccion_documentodetransporteproduccion_7ds_34_tfbaralbplas_to) )
      {
         addWhere(sWhereString, "(T1.BarAlbPlas <= ?)");
      }
      else
      {
         GXv_int31[35] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV117Documentotransporteproduccion_documentodetransporteproduccion_7ds_36_tfalbhdrobs_sel)==0) && ( ! (GXutil.strcmp("", AV116Documentotransporteproduccion_documentodetransporteproduccion_7ds_35_tfalbhdrobs)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbHdrObs) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int31[36] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV117Documentotransporteproduccion_documentodetransporteproduccion_7ds_36_tfalbhdrobs_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbHdrObs = ?)");
      }
      else
      {
         GXv_int31[37] = (byte)(1) ;
      }
      if ( AV118Documentotransporteproduccion_documentodetransporteproduccion_7ds_37_tfalbproval_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV118Documentotransporteproduccion_documentodetransporteproduccion_7ds_37_tfalbproval_sels, "T1.AlbProVal IN (", ")")+")");
      }
      if ( ! (0==AV119Documentotransporteproduccion_documentodetransporteproduccion_7ds_38_tfbarsit) )
      {
         addWhere(sWhereString, "(T2.BarSit >= ?)");
      }
      else
      {
         GXv_int31[38] = (byte)(1) ;
      }
      if ( ! (0==AV120Documentotransporteproduccion_documentodetransporteproduccion_7ds_39_tfbarsit_to) )
      {
         addWhere(sWhereString, "(T2.BarSit <= ?)");
      }
      else
      {
         GXv_int31[39] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV121Documentotransporteproduccion_documentodetransporteproduccion_7ds_40_tfbartipcor_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarTipCor = ?)");
      }
      else
      {
         GXv_int31[40] = (byte)(1) ;
      }
      if ( AV12OrderedBy == 1 )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.AlbEncCli" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.AlbEncCli DESC" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.AlbSer" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.AlbSer DESC" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.AlbSerD" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.AlbSerD DESC" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.AlbColNom" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.AlbColNom DESC" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.AlbColNum" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.AlbColNum DESC" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.AlbTipCol" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.AlbTipCol DESC" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.AlbNomCli" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.AlbNomCli DESC" ;
      }
      else if ( ( AV12OrderedBy == 9 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.BarAlbKgmE" ;
      }
      else if ( ( AV12OrderedBy == 9 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.BarAlbKgmE DESC" ;
      }
      else if ( ( AV12OrderedBy == 10 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.AlbHdrAnc" ;
      }
      else if ( ( AV12OrderedBy == 10 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.AlbHdrAnc DESC" ;
      }
      else if ( ( AV12OrderedBy == 11 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.AlbHdrgm2" ;
      }
      else if ( ( AV12OrderedBy == 11 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.AlbHdrgm2 DESC" ;
      }
      else if ( ( AV12OrderedBy == 12 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.BarAlbMtrE" ;
      }
      else if ( ( AV12OrderedBy == 12 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.BarAlbMtrE DESC" ;
      }
      else if ( ( AV12OrderedBy == 13 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.BarAlbPie" ;
      }
      else if ( ( AV12OrderedBy == 13 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.BarAlbPie DESC" ;
      }
      else if ( ( AV12OrderedBy == 14 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.TubCod" ;
      }
      else if ( ( AV12OrderedBy == 14 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.TubCod DESC" ;
      }
      else if ( ( AV12OrderedBy == 15 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.BarAlbTub" ;
      }
      else if ( ( AV12OrderedBy == 15 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.BarAlbTub DESC" ;
      }
      else if ( ( AV12OrderedBy == 16 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.PlasCod" ;
      }
      else if ( ( AV12OrderedBy == 16 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.PlasCod DESC" ;
      }
      else if ( ( AV12OrderedBy == 17 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.BarAlbPlas" ;
      }
      else if ( ( AV12OrderedBy == 17 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.BarAlbPlas DESC" ;
      }
      else if ( ( AV12OrderedBy == 18 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.AlbHdrObs" ;
      }
      else if ( ( AV12OrderedBy == 18 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.AlbHdrObs DESC" ;
      }
      else if ( ( AV12OrderedBy == 19 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.AlbProVal" ;
      }
      else if ( ( AV12OrderedBy == 19 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.AlbProVal DESC" ;
      }
      else if ( ( AV12OrderedBy == 20 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T2.BarSit" ;
      }
      else if ( ( AV12OrderedBy == 20 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T2.BarSit DESC" ;
      }
      else if ( ( AV12OrderedBy == 21 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T2.BarTipCor" ;
      }
      else if ( ( AV12OrderedBy == 21 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T2.BarTipCor DESC" ;
      }
      else if ( true )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.AlbProCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar" ;
      }
      scmdbuf = "SELECT * FROM ( SELECT GX_CTE.*, ROWNUM GX_ROW_NUMBER FROM (SELECT " + sSelectString + sFromString + sWhereString + sOrderString + "" + ") GX_CTE) WHERE GX_ROW_NUMBER" + " BETWEEN " + "?" + " AND " + "?" + " OR " + "?" + " < " + "?" + " AND GX_ROW_NUMBER >= " + "?" ;
      GXv_Object32[0] = scmdbuf ;
      GXv_Object32[1] = GXv_int31 ;
      return GXv_Object32 ;
   }

   protected Object[] conditional_H02523( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A2839AlbProVal ,
                                          GXSimpleCollection<String> AV118Documentotransporteproduccion_documentodetransporteproduccion_7ds_37_tfalbproval_sels ,
                                          String AV83Documentotransporteproduccion_documentodetransporteproduccion_7ds_2_tfbarnhdr_sel ,
                                          String AV82Documentotransporteproduccion_documentodetransporteproduccion_7ds_1_tfbarnhdr ,
                                          String AV85Documentotransporteproduccion_documentodetransporteproduccion_7ds_4_tfalbenccli_sel ,
                                          String AV84Documentotransporteproduccion_documentodetransporteproduccion_7ds_3_tfalbenccli ,
                                          String AV87Documentotransporteproduccion_documentodetransporteproduccion_7ds_6_tfalbser_sel ,
                                          String AV86Documentotransporteproduccion_documentodetransporteproduccion_7ds_5_tfalbser ,
                                          String AV89Documentotransporteproduccion_documentodetransporteproduccion_7ds_8_tfalbserd_sel ,
                                          String AV88Documentotransporteproduccion_documentodetransporteproduccion_7ds_7_tfalbserd ,
                                          String AV91Documentotransporteproduccion_documentodetransporteproduccion_7ds_10_tfalbcolnom_sel ,
                                          String AV90Documentotransporteproduccion_documentodetransporteproduccion_7ds_9_tfalbcolnom ,
                                          int AV92Documentotransporteproduccion_documentodetransporteproduccion_7ds_11_tfalbcolnum ,
                                          int AV93Documentotransporteproduccion_documentodetransporteproduccion_7ds_12_tfalbcolnum_to ,
                                          byte AV94Documentotransporteproduccion_documentodetransporteproduccion_7ds_13_tfalbtipcol ,
                                          byte AV95Documentotransporteproduccion_documentodetransporteproduccion_7ds_14_tfalbtipcol_to ,
                                          String AV97Documentotransporteproduccion_documentodetransporteproduccion_7ds_16_tfalbnomcli_sel ,
                                          String AV96Documentotransporteproduccion_documentodetransporteproduccion_7ds_15_tfalbnomcli ,
                                          java.math.BigDecimal AV98Documentotransporteproduccion_documentodetransporteproduccion_7ds_17_tfbaralbkgme ,
                                          java.math.BigDecimal AV99Documentotransporteproduccion_documentodetransporteproduccion_7ds_18_tfbaralbkgme_to ,
                                          short AV100Documentotransporteproduccion_documentodetransporteproduccion_7ds_19_tfalbhdranc ,
                                          short AV101Documentotransporteproduccion_documentodetransporteproduccion_7ds_20_tfalbhdranc_to ,
                                          short AV102Documentotransporteproduccion_documentodetransporteproduccion_7ds_21_tfalbhdrgm2 ,
                                          short AV103Documentotransporteproduccion_documentodetransporteproduccion_7ds_22_tfalbhdrgm2_to ,
                                          java.math.BigDecimal AV104Documentotransporteproduccion_documentodetransporteproduccion_7ds_23_tfbaralbmtre ,
                                          java.math.BigDecimal AV105Documentotransporteproduccion_documentodetransporteproduccion_7ds_24_tfbaralbmtre_to ,
                                          int AV106Documentotransporteproduccion_documentodetransporteproduccion_7ds_25_tfbaralbpie ,
                                          int AV107Documentotransporteproduccion_documentodetransporteproduccion_7ds_26_tfbaralbpie_to ,
                                          short AV108Documentotransporteproduccion_documentodetransporteproduccion_7ds_27_tftubcod ,
                                          short AV109Documentotransporteproduccion_documentodetransporteproduccion_7ds_28_tftubcod_to ,
                                          int AV110Documentotransporteproduccion_documentodetransporteproduccion_7ds_29_tfbaralbtub ,
                                          int AV111Documentotransporteproduccion_documentodetransporteproduccion_7ds_30_tfbaralbtub_to ,
                                          short AV112Documentotransporteproduccion_documentodetransporteproduccion_7ds_31_tfplascod ,
                                          short AV113Documentotransporteproduccion_documentodetransporteproduccion_7ds_32_tfplascod_to ,
                                          short AV114Documentotransporteproduccion_documentodetransporteproduccion_7ds_33_tfbaralbplas ,
                                          short AV115Documentotransporteproduccion_documentodetransporteproduccion_7ds_34_tfbaralbplas_to ,
                                          String AV117Documentotransporteproduccion_documentodetransporteproduccion_7ds_36_tfalbhdrobs_sel ,
                                          String AV116Documentotransporteproduccion_documentodetransporteproduccion_7ds_35_tfalbhdrobs ,
                                          int AV118Documentotransporteproduccion_documentodetransporteproduccion_7ds_37_tfalbproval_sels_size ,
                                          byte AV119Documentotransporteproduccion_documentodetransporteproduccion_7ds_38_tfbarsit ,
                                          byte AV120Documentotransporteproduccion_documentodetransporteproduccion_7ds_39_tfbarsit_to ,
                                          String AV121Documentotransporteproduccion_documentodetransporteproduccion_7ds_40_tfbartipcor_sel ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          String A4815AlbEncCli ,
                                          String A3391AlbSer ,
                                          String A8879AlbSerD ,
                                          String A3392AlbColNom ,
                                          int A3393AlbColNum ,
                                          byte A3394AlbTipCol ,
                                          String A12232AlbNomCli ,
                                          java.math.BigDecimal A1261BarAlbKgmE ,
                                          short A3271AlbHdrAnc ,
                                          short A5019AlbHdrgm2 ,
                                          java.math.BigDecimal A1263BarAlbMtrE ,
                                          int A1265BarAlbPie ,
                                          short A1206TubCod ,
                                          int A1266BarAlbTub ,
                                          short A6466PlasCod ,
                                          short A6467BarAlbPlas ,
                                          String A2441AlbHdrObs ,
                                          byte A213BarSit ,
                                          String A5291BarTipCor ,
                                          short AV12OrderedBy ,
                                          boolean AV13OrderedDsc ,
                                          String AV53Emprcod ,
                                          long AV54AlbProcod ,
                                          String A396EmprCod ,
                                          long A30AlbProCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int34 = new byte[41];
      Object[] GXv_Object35 = new Object[2];
      scmdbuf = "SELECT COUNT(*) FROM (TXPALBBAR T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar" ;
      scmdbuf += " = T1.BarCodPar)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.AlbProCod = ?)");
      if ( (GXutil.strcmp("", AV83Documentotransporteproduccion_documentodetransporteproduccion_7ds_2_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV82Documentotransporteproduccion_documentodetransporteproduccion_7ds_1_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int34[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV83Documentotransporteproduccion_documentodetransporteproduccion_7ds_2_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int34[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV85Documentotransporteproduccion_documentodetransporteproduccion_7ds_4_tfalbenccli_sel)==0) && ( ! (GXutil.strcmp("", AV84Documentotransporteproduccion_documentodetransporteproduccion_7ds_3_tfalbenccli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbEncCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int34[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV85Documentotransporteproduccion_documentodetransporteproduccion_7ds_4_tfalbenccli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbEncCli = ?)");
      }
      else
      {
         GXv_int34[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV87Documentotransporteproduccion_documentodetransporteproduccion_7ds_6_tfalbser_sel)==0) && ( ! (GXutil.strcmp("", AV86Documentotransporteproduccion_documentodetransporteproduccion_7ds_5_tfalbser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int34[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV87Documentotransporteproduccion_documentodetransporteproduccion_7ds_6_tfalbser_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbSer = ?)");
      }
      else
      {
         GXv_int34[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV89Documentotransporteproduccion_documentodetransporteproduccion_7ds_8_tfalbserd_sel)==0) && ( ! (GXutil.strcmp("", AV88Documentotransporteproduccion_documentodetransporteproduccion_7ds_7_tfalbserd)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbSerD) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int34[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV89Documentotransporteproduccion_documentodetransporteproduccion_7ds_8_tfalbserd_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbSerD = ?)");
      }
      else
      {
         GXv_int34[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV91Documentotransporteproduccion_documentodetransporteproduccion_7ds_10_tfalbcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV90Documentotransporteproduccion_documentodetransporteproduccion_7ds_9_tfalbcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int34[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV91Documentotransporteproduccion_documentodetransporteproduccion_7ds_10_tfalbcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbColNom = ?)");
      }
      else
      {
         GXv_int34[11] = (byte)(1) ;
      }
      if ( ! (0==AV92Documentotransporteproduccion_documentodetransporteproduccion_7ds_11_tfalbcolnum) )
      {
         addWhere(sWhereString, "(T1.AlbColNum >= ?)");
      }
      else
      {
         GXv_int34[12] = (byte)(1) ;
      }
      if ( ! (0==AV93Documentotransporteproduccion_documentodetransporteproduccion_7ds_12_tfalbcolnum_to) )
      {
         addWhere(sWhereString, "(T1.AlbColNum <= ?)");
      }
      else
      {
         GXv_int34[13] = (byte)(1) ;
      }
      if ( ! (0==AV94Documentotransporteproduccion_documentodetransporteproduccion_7ds_13_tfalbtipcol) )
      {
         addWhere(sWhereString, "(T1.AlbTipCol >= ?)");
      }
      else
      {
         GXv_int34[14] = (byte)(1) ;
      }
      if ( ! (0==AV95Documentotransporteproduccion_documentodetransporteproduccion_7ds_14_tfalbtipcol_to) )
      {
         addWhere(sWhereString, "(T1.AlbTipCol <= ?)");
      }
      else
      {
         GXv_int34[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV97Documentotransporteproduccion_documentodetransporteproduccion_7ds_16_tfalbnomcli_sel)==0) && ( ! (GXutil.strcmp("", AV96Documentotransporteproduccion_documentodetransporteproduccion_7ds_15_tfalbnomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int34[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV97Documentotransporteproduccion_documentodetransporteproduccion_7ds_16_tfalbnomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbNomCli = ?)");
      }
      else
      {
         GXv_int34[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV98Documentotransporteproduccion_documentodetransporteproduccion_7ds_17_tfbaralbkgme)==0) )
      {
         addWhere(sWhereString, "(T1.BarAlbKgmE >= ?)");
      }
      else
      {
         GXv_int34[18] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV99Documentotransporteproduccion_documentodetransporteproduccion_7ds_18_tfbaralbkgme_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarAlbKgmE <= ?)");
      }
      else
      {
         GXv_int34[19] = (byte)(1) ;
      }
      if ( ! (0==AV100Documentotransporteproduccion_documentodetransporteproduccion_7ds_19_tfalbhdranc) )
      {
         addWhere(sWhereString, "(T1.AlbHdrAnc >= ?)");
      }
      else
      {
         GXv_int34[20] = (byte)(1) ;
      }
      if ( ! (0==AV101Documentotransporteproduccion_documentodetransporteproduccion_7ds_20_tfalbhdranc_to) )
      {
         addWhere(sWhereString, "(T1.AlbHdrAnc <= ?)");
      }
      else
      {
         GXv_int34[21] = (byte)(1) ;
      }
      if ( ! (0==AV102Documentotransporteproduccion_documentodetransporteproduccion_7ds_21_tfalbhdrgm2) )
      {
         addWhere(sWhereString, "(T1.AlbHdrgm2 >= ?)");
      }
      else
      {
         GXv_int34[22] = (byte)(1) ;
      }
      if ( ! (0==AV103Documentotransporteproduccion_documentodetransporteproduccion_7ds_22_tfalbhdrgm2_to) )
      {
         addWhere(sWhereString, "(T1.AlbHdrgm2 <= ?)");
      }
      else
      {
         GXv_int34[23] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV104Documentotransporteproduccion_documentodetransporteproduccion_7ds_23_tfbaralbmtre)==0) )
      {
         addWhere(sWhereString, "(T1.BarAlbMtrE >= ?)");
      }
      else
      {
         GXv_int34[24] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV105Documentotransporteproduccion_documentodetransporteproduccion_7ds_24_tfbaralbmtre_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarAlbMtrE <= ?)");
      }
      else
      {
         GXv_int34[25] = (byte)(1) ;
      }
      if ( ! (0==AV106Documentotransporteproduccion_documentodetransporteproduccion_7ds_25_tfbaralbpie) )
      {
         addWhere(sWhereString, "(T1.BarAlbPie >= ?)");
      }
      else
      {
         GXv_int34[26] = (byte)(1) ;
      }
      if ( ! (0==AV107Documentotransporteproduccion_documentodetransporteproduccion_7ds_26_tfbaralbpie_to) )
      {
         addWhere(sWhereString, "(T1.BarAlbPie <= ?)");
      }
      else
      {
         GXv_int34[27] = (byte)(1) ;
      }
      if ( ! (0==AV108Documentotransporteproduccion_documentodetransporteproduccion_7ds_27_tftubcod) )
      {
         addWhere(sWhereString, "(T1.TubCod >= ?)");
      }
      else
      {
         GXv_int34[28] = (byte)(1) ;
      }
      if ( ! (0==AV109Documentotransporteproduccion_documentodetransporteproduccion_7ds_28_tftubcod_to) )
      {
         addWhere(sWhereString, "(T1.TubCod <= ?)");
      }
      else
      {
         GXv_int34[29] = (byte)(1) ;
      }
      if ( ! (0==AV110Documentotransporteproduccion_documentodetransporteproduccion_7ds_29_tfbaralbtub) )
      {
         addWhere(sWhereString, "(T1.BarAlbTub >= ?)");
      }
      else
      {
         GXv_int34[30] = (byte)(1) ;
      }
      if ( ! (0==AV111Documentotransporteproduccion_documentodetransporteproduccion_7ds_30_tfbaralbtub_to) )
      {
         addWhere(sWhereString, "(T1.BarAlbTub <= ?)");
      }
      else
      {
         GXv_int34[31] = (byte)(1) ;
      }
      if ( ! (0==AV112Documentotransporteproduccion_documentodetransporteproduccion_7ds_31_tfplascod) )
      {
         addWhere(sWhereString, "(T1.PlasCod >= ?)");
      }
      else
      {
         GXv_int34[32] = (byte)(1) ;
      }
      if ( ! (0==AV113Documentotransporteproduccion_documentodetransporteproduccion_7ds_32_tfplascod_to) )
      {
         addWhere(sWhereString, "(T1.PlasCod <= ?)");
      }
      else
      {
         GXv_int34[33] = (byte)(1) ;
      }
      if ( ! (0==AV114Documentotransporteproduccion_documentodetransporteproduccion_7ds_33_tfbaralbplas) )
      {
         addWhere(sWhereString, "(T1.BarAlbPlas >= ?)");
      }
      else
      {
         GXv_int34[34] = (byte)(1) ;
      }
      if ( ! (0==AV115Documentotransporteproduccion_documentodetransporteproduccion_7ds_34_tfbaralbplas_to) )
      {
         addWhere(sWhereString, "(T1.BarAlbPlas <= ?)");
      }
      else
      {
         GXv_int34[35] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV117Documentotransporteproduccion_documentodetransporteproduccion_7ds_36_tfalbhdrobs_sel)==0) && ( ! (GXutil.strcmp("", AV116Documentotransporteproduccion_documentodetransporteproduccion_7ds_35_tfalbhdrobs)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbHdrObs) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int34[36] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV117Documentotransporteproduccion_documentodetransporteproduccion_7ds_36_tfalbhdrobs_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbHdrObs = ?)");
      }
      else
      {
         GXv_int34[37] = (byte)(1) ;
      }
      if ( AV118Documentotransporteproduccion_documentodetransporteproduccion_7ds_37_tfalbproval_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV118Documentotransporteproduccion_documentodetransporteproduccion_7ds_37_tfalbproval_sels, "T1.AlbProVal IN (", ")")+")");
      }
      if ( ! (0==AV119Documentotransporteproduccion_documentodetransporteproduccion_7ds_38_tfbarsit) )
      {
         addWhere(sWhereString, "(T2.BarSit >= ?)");
      }
      else
      {
         GXv_int34[38] = (byte)(1) ;
      }
      if ( ! (0==AV120Documentotransporteproduccion_documentodetransporteproduccion_7ds_39_tfbarsit_to) )
      {
         addWhere(sWhereString, "(T2.BarSit <= ?)");
      }
      else
      {
         GXv_int34[39] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV121Documentotransporteproduccion_documentodetransporteproduccion_7ds_40_tfbartipcor_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarTipCor = ?)");
      }
      else
      {
         GXv_int34[40] = (byte)(1) ;
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
      else if ( true )
      {
         scmdbuf += "" ;
      }
      GXv_Object35[0] = scmdbuf ;
      GXv_Object35[1] = GXv_int34 ;
      return GXv_Object35 ;
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
                  return conditional_H02522(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).byteValue() , ((Number) dynConstraints[15]).byteValue() , (String)dynConstraints[16] , (String)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , ((Number) dynConstraints[20]).shortValue() , ((Number) dynConstraints[21]).shortValue() , ((Number) dynConstraints[22]).shortValue() , ((Number) dynConstraints[23]).shortValue() , (java.math.BigDecimal)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , ((Number) dynConstraints[26]).intValue() , ((Number) dynConstraints[27]).intValue() , ((Number) dynConstraints[28]).shortValue() , ((Number) dynConstraints[29]).shortValue() , ((Number) dynConstraints[30]).intValue() , ((Number) dynConstraints[31]).intValue() , ((Number) dynConstraints[32]).shortValue() , ((Number) dynConstraints[33]).shortValue() , ((Number) dynConstraints[34]).shortValue() , ((Number) dynConstraints[35]).shortValue() , (String)dynConstraints[36] , (String)dynConstraints[37] , ((Number) dynConstraints[38]).intValue() , ((Number) dynConstraints[39]).byteValue() , ((Number) dynConstraints[40]).byteValue() , (String)dynConstraints[41] , ((Number) dynConstraints[42]).intValue() , ((Number) dynConstraints[43]).byteValue() , (String)dynConstraints[44] , (String)dynConstraints[45] , (String)dynConstraints[46] , (String)dynConstraints[47] , (String)dynConstraints[48] , ((Number) dynConstraints[49]).intValue() , ((Number) dynConstraints[50]).byteValue() , (String)dynConstraints[51] , (java.math.BigDecimal)dynConstraints[52] , ((Number) dynConstraints[53]).shortValue() , ((Number) dynConstraints[54]).shortValue() , (java.math.BigDecimal)dynConstraints[55] , ((Number) dynConstraints[56]).intValue() , ((Number) dynConstraints[57]).shortValue() , ((Number) dynConstraints[58]).intValue() , ((Number) dynConstraints[59]).shortValue() , ((Number) dynConstraints[60]).shortValue() , (String)dynConstraints[61] , ((Number) dynConstraints[62]).byteValue() , (String)dynConstraints[63] , ((Number) dynConstraints[64]).shortValue() , ((Boolean) dynConstraints[65]).booleanValue() , (String)dynConstraints[66] , ((Number) dynConstraints[67]).longValue() , (String)dynConstraints[68] , ((Number) dynConstraints[69]).longValue() );
            case 1 :
                  return conditional_H02523(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).byteValue() , ((Number) dynConstraints[15]).byteValue() , (String)dynConstraints[16] , (String)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , ((Number) dynConstraints[20]).shortValue() , ((Number) dynConstraints[21]).shortValue() , ((Number) dynConstraints[22]).shortValue() , ((Number) dynConstraints[23]).shortValue() , (java.math.BigDecimal)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , ((Number) dynConstraints[26]).intValue() , ((Number) dynConstraints[27]).intValue() , ((Number) dynConstraints[28]).shortValue() , ((Number) dynConstraints[29]).shortValue() , ((Number) dynConstraints[30]).intValue() , ((Number) dynConstraints[31]).intValue() , ((Number) dynConstraints[32]).shortValue() , ((Number) dynConstraints[33]).shortValue() , ((Number) dynConstraints[34]).shortValue() , ((Number) dynConstraints[35]).shortValue() , (String)dynConstraints[36] , (String)dynConstraints[37] , ((Number) dynConstraints[38]).intValue() , ((Number) dynConstraints[39]).byteValue() , ((Number) dynConstraints[40]).byteValue() , (String)dynConstraints[41] , ((Number) dynConstraints[42]).intValue() , ((Number) dynConstraints[43]).byteValue() , (String)dynConstraints[44] , (String)dynConstraints[45] , (String)dynConstraints[46] , (String)dynConstraints[47] , (String)dynConstraints[48] , ((Number) dynConstraints[49]).intValue() , ((Number) dynConstraints[50]).byteValue() , (String)dynConstraints[51] , (java.math.BigDecimal)dynConstraints[52] , ((Number) dynConstraints[53]).shortValue() , ((Number) dynConstraints[54]).shortValue() , (java.math.BigDecimal)dynConstraints[55] , ((Number) dynConstraints[56]).intValue() , ((Number) dynConstraints[57]).shortValue() , ((Number) dynConstraints[58]).intValue() , ((Number) dynConstraints[59]).shortValue() , ((Number) dynConstraints[60]).shortValue() , (String)dynConstraints[61] , ((Number) dynConstraints[62]).byteValue() , (String)dynConstraints[63] , ((Number) dynConstraints[64]).shortValue() , ((Boolean) dynConstraints[65]).booleanValue() , (String)dynConstraints[66] , ((Number) dynConstraints[67]).longValue() , (String)dynConstraints[68] , ((Number) dynConstraints[69]).longValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H02522", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H02523", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 2);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 60);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((int[]) buf[9])[0] = rslt.getInt(9);
               ((short[]) buf[10])[0] = rslt.getShort(10);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((int[]) buf[12])[0] = rslt.getInt(11);
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(12,2);
               ((short[]) buf[14])[0] = rslt.getShort(13);
               ((short[]) buf[15])[0] = rslt.getShort(14);
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(15,2);
               ((String[]) buf[17])[0] = rslt.getString(16, 13);
               ((byte[]) buf[18])[0] = rslt.getByte(17);
               ((int[]) buf[19])[0] = rslt.getInt(18);
               ((String[]) buf[20])[0] = rslt.getString(19, 13);
               ((String[]) buf[21])[0] = rslt.getString(20, 26);
               ((String[]) buf[22])[0] = rslt.getString(21, 16);
               ((String[]) buf[23])[0] = rslt.getString(22, 20);
               ((String[]) buf[24])[0] = rslt.getString(23, 1);
               ((byte[]) buf[25])[0] = rslt.getByte(24);
               ((int[]) buf[26])[0] = rslt.getInt(25);
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
                  stmt.setString(sIdx, (String)parms[46], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[47]).longValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 11);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 11);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 20);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 20);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 16);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 16);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 26);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 26);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 13);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 13);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[58]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[59]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[60]).byteValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[61]).byteValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 13);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 13);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[64], 2);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[65], 2);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[66]).shortValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[67]).shortValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[68]).shortValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[69]).shortValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[70], 2);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[71], 2);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[72]).intValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[73]).intValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[74]).shortValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[75]).shortValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[76]).intValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[77]).intValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[78]).shortValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[79]).shortValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[80]).shortValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[81]).shortValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[82], 60);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[83], 60);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[84]).byteValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[85]).byteValue());
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[86], 2);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[87]).intValue());
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[88]).intValue());
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[89]).intValue());
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[90]).intValue());
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[91]).intValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[42]).longValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 11);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 11);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 20);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 20);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 16);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 16);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 26);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 26);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 13);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 13);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[53]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[54]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[55]).byteValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[56]).byteValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 13);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 13);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[59], 2);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[60], 2);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[61]).shortValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[62]).shortValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[63]).shortValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[64]).shortValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[65], 2);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[66], 2);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[67]).intValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[68]).intValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[69]).shortValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[70]).shortValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[71]).intValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[72]).intValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[73]).shortValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[74]).shortValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[75]).shortValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[76]).shortValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 60);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 60);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[79]).byteValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[80]).byteValue());
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[81], 2);
               }
               return;
      }
   }

}

