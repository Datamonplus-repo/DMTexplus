package app.produccion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class informeproduccionresumenhdr_wc1_impl extends GXWebComponent
{
   public informeproduccionresumenhdr_wc1_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public informeproduccionresumenhdr_wc1_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( informeproduccionresumenhdr_wc1_impl.class ));
   }

   public informeproduccionresumenhdr_wc1_impl( int remoteHandle ,
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
      chkavOp4 = UIFactory.getCheckbox(this);
   }

   public void initweb( )
   {
      initialize_properties( ) ;
      if ( GXutil.len( sPrefix) == 0 )
      {
         if ( nGotPars == 0 )
         {
            entryPointCalled = false ;
            gxfirstwebparm = httpContext.GetFirstPar( "INEmprcod") ;
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
               AV15INEmprcod = httpContext.GetPar( "INEmprcod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV15INEmprcod", AV15INEmprcod);
               AV16INHisEstReo = (byte)(GXutil.lval( httpContext.GetPar( "INHisEstReo"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV16INHisEstReo", GXutil.str( AV16INHisEstReo, 1, 0));
               AV19INMaqCod1 = httpContext.GetPar( "INMaqCod1") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV19INMaqCod1", AV19INMaqCod1);
               AV20INMaqCod2 = httpContext.GetPar( "INMaqCod2") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV20INMaqCod2", AV20INMaqCod2);
               AV17INHisProFec1 = localUtil.parseDTimeParm( httpContext.GetPar( "INHisProFec1")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV17INHisProFec1", localUtil.ttoc( AV17INHisProFec1, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
               AV18INHisProFec2 = localUtil.parseDTimeParm( httpContext.GetPar( "INHisProFec2")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV18INHisProFec2", localUtil.ttoc( AV18INHisProFec2, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
               AV125OperarioFrom = (int)(GXutil.lval( httpContext.GetPar( "OperarioFrom"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV125OperarioFrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV125OperarioFrom), 6, 0));
               AV126OperarioTo = (int)(GXutil.lval( httpContext.GetPar( "OperarioTo"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV126OperarioTo", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV126OperarioTo), 6, 0));
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,AV15INEmprcod,Byte.valueOf(AV16INHisEstReo),AV19INMaqCod1,AV20INMaqCod2,AV17INHisProFec1,AV18INHisProFec2,Integer.valueOf(AV125OperarioFrom),Integer.valueOf(AV126OperarioTo)});
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
               gxfirstwebparm = httpContext.GetFirstPar( "INEmprcod") ;
            }
            else if ( GXutil.strcmp(gxfirstwebparm, "gxfullajaxEvt") == 0 )
            {
               if ( ! httpContext.IsValidAjaxCall( true) )
               {
                  GxWebError = (byte)(1) ;
                  return  ;
               }
               gxfirstwebparm = httpContext.GetFirstPar( "INEmprcod") ;
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
      nRC_GXsfl_27 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_27"))) ;
      nGXsfl_27_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_27_idx"))) ;
      sGXsfl_27_idx = httpContext.GetPar( "sGXsfl_27_idx") ;
      sPrefix = httpContext.GetPar( "sPrefix") ;
      edtavCostei_Visible = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCostei_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCostei_Visible), 5, 0), !bGXsfl_27_Refreshing);
      edtavCostet_Visible = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCostet_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCostet_Visible), 5, 0), !bGXsfl_27_Refreshing);
      edtavCostek_Visible = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCostek_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCostek_Visible), 5, 0), !bGXsfl_27_Refreshing);
      edtavBarkgmtin_Visible = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBarkgmtin_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarkgmtin_Visible), 5, 0), !bGXsfl_27_Refreshing);
      edtavBarkgstt_Visible = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBarkgstt_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarkgstt_Visible), 5, 0), !bGXsfl_27_Refreshing);
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
      AV15INEmprcod = httpContext.GetPar( "INEmprcod") ;
      AV16INHisEstReo = (byte)(GXutil.lval( httpContext.GetPar( "INHisEstReo"))) ;
      AV19INMaqCod1 = httpContext.GetPar( "INMaqCod1") ;
      AV20INMaqCod2 = httpContext.GetPar( "INMaqCod2") ;
      AV17INHisProFec1 = localUtil.parseDTimeParm( httpContext.GetPar( "INHisProFec1")) ;
      AV18INHisProFec2 = localUtil.parseDTimeParm( httpContext.GetPar( "INHisProFec2")) ;
      AV125OperarioFrom = (int)(GXutil.lval( httpContext.GetPar( "OperarioFrom"))) ;
      AV126OperarioTo = (int)(GXutil.lval( httpContext.GetPar( "OperarioTo"))) ;
      AV140Pgmname = httpContext.GetPar( "Pgmname") ;
      AV21OrderedBy = (short)(GXutil.lval( httpContext.GetPar( "OrderedBy"))) ;
      AV22OrderedDsc = GXutil.strtobool( httpContext.GetPar( "OrderedDsc")) ;
      AV89TFBarNHdr = httpContext.GetPar( "TFBarNHdr") ;
      AV90TFBarNHdr_Sel = httpContext.GetPar( "TFBarNHdr_Sel") ;
      AV101TFMaqCod = httpContext.GetPar( "TFMaqCod") ;
      AV102TFMaqCod_Sel = httpContext.GetPar( "TFMaqCod_Sel") ;
      AV103TFHisProFec = localUtil.parseDateParm( httpContext.GetPar( "TFHisProFec")) ;
      AV105TFHisProKgr = CommonUtil.decimalVal( httpContext.GetPar( "TFHisProKgr"), ".") ;
      AV106TFHisProKgr_To = CommonUtil.decimalVal( httpContext.GetPar( "TFHisProKgr_To"), ".") ;
      AV107TFHisProMtr = CommonUtil.decimalVal( httpContext.GetPar( "TFHisProMtr"), ".") ;
      AV108TFHisProMtr_To = CommonUtil.decimalVal( httpContext.GetPar( "TFHisProMtr_To"), ".") ;
      AV109TFHisProTur = (byte)(GXutil.lval( httpContext.GetPar( "TFHisProTur"))) ;
      AV110TFHisProTur_To = (byte)(GXutil.lval( httpContext.GetPar( "TFHisProTur_To"))) ;
      AV93TFHisProF = httpContext.GetPar( "TFHisProF") ;
      AV94TFHisProF_Sel = httpContext.GetPar( "TFHisProF_Sel") ;
      AV111TFHisProDTI = localUtil.parseDTimeParm( httpContext.GetPar( "TFHisProDTI")) ;
      AV113TFHisProDTF = localUtil.parseDTimeParm( httpContext.GetPar( "TFHisProDTF")) ;
      AV91TFCliNom = httpContext.GetPar( "TFCliNom") ;
      AV92TFCliNom_Sel = httpContext.GetPar( "TFCliNom_Sel") ;
      AV53TFBarSer = httpContext.GetPar( "TFBarSer") ;
      AV54TFBarSer_Sel = httpContext.GetPar( "TFBarSer_Sel") ;
      AV85TFBarColNom = httpContext.GetPar( "TFBarColNom") ;
      AV86TFBarColNom_Sel = httpContext.GetPar( "TFBarColNom_Sel") ;
      AV87TFBarColNum = (int)(GXutil.lval( httpContext.GetPar( "TFBarColNum"))) ;
      AV88TFBarColNum_To = (int)(GXutil.lval( httpContext.GetPar( "TFBarColNum_To"))) ;
      AV117TFFase = httpContext.GetPar( "TFFase") ;
      AV118TFFase_Sel = httpContext.GetPar( "TFFase_Sel") ;
      AV119TFFaseDescripcion = httpContext.GetPar( "TFFaseDescripcion") ;
      AV120TFFaseDescripcion_Sel = httpContext.GetPar( "TFFaseDescripcion_Sel") ;
      AV99TFBarTipArt = (short)(GXutil.lval( httpContext.GetPar( "TFBarTipArt"))) ;
      AV100TFBarTipArt_To = (short)(GXutil.lval( httpContext.GetPar( "TFBarTipArt_To"))) ;
      AV121TFHisProTip = (short)(GXutil.lval( httpContext.GetPar( "TFHisProTip"))) ;
      AV122TFHisProTip_To = (short)(GXutil.lval( httpContext.GetPar( "TFHisProTip_To"))) ;
      AV123TFHisProTc = (byte)(GXutil.lval( httpContext.GetPar( "TFHisProTc"))) ;
      AV124TFHisProTc_To = (byte)(GXutil.lval( httpContext.GetPar( "TFHisProTc_To"))) ;
      AV46TFHisProDf = localUtil.parseDateParm( httpContext.GetPar( "TFHisProDf")) ;
      AV37TFParCod = (short)(GXutil.lval( httpContext.GetPar( "TFParCod"))) ;
      AV38TFParCod_To = (short)(GXutil.lval( httpContext.GetPar( "TFParCod_To"))) ;
      AV39TFParCodNom = httpContext.GetPar( "TFParCodNom") ;
      AV40TFParCodNom_Sel = httpContext.GetPar( "TFParCodNom_Sel") ;
      AV95TotHisProKgr = CommonUtil.decimalVal( httpContext.GetPar( "TotHisProKgr"), ".") ;
      AV96TotHisProMtr = CommonUtil.decimalVal( httpContext.GetPar( "TotHisProMtr"), ".") ;
      edtavCostei_Visible = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCostei_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCostei_Visible), 5, 0), !bGXsfl_27_Refreshing);
      edtavCostet_Visible = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCostet_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCostet_Visible), 5, 0), !bGXsfl_27_Refreshing);
      edtavCostek_Visible = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCostek_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCostek_Visible), 5, 0), !bGXsfl_27_Refreshing);
      edtavBarkgmtin_Visible = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBarkgmtin_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarkgmtin_Visible), 5, 0), !bGXsfl_27_Refreshing);
      edtavBarkgstt_Visible = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBarkgstt_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarkgstt_Visible), 5, 0), !bGXsfl_27_Refreshing);
      AV82MatDsc = httpContext.GetPar( "MatDsc") ;
      AV81MatCod = (short)(GXutil.lval( httpContext.GetPar( "MatCod"))) ;
      AV79fechadt = localUtil.parseDTimeParm( httpContext.GetPar( "fechadt")) ;
      A2316BarAgrLot = httpContext.GetPar( "BarAgrLot") ;
      n2316BarAgrLot = false ;
      AV30FasDivTime = httpContext.GetPar( "FasDivTime") ;
      AV129MinutosTotal = GXutil.lval( httpContext.GetPar( "MinutosTotal")) ;
      AV133tiempom = (int)(GXutil.lval( httpContext.GetPar( "tiempom"))) ;
      A457FasCod = httpContext.GetPar( "FasCod") ;
      AV6EmprCod = httpContext.GetPar( "EmprCod") ;
      AV57FasCod = httpContext.GetPar( "FasCod") ;
      A14054FasDivTime = httpContext.GetPar( "FasDivTime") ;
      A1933BarCodTin = (int)(GXutil.lval( httpContext.GetPar( "BarCodTin"))) ;
      n1933BarCodTin = false ;
      A1934BarReoTin = (byte)(GXutil.lval( httpContext.GetPar( "BarReoTin"))) ;
      n1934BarReoTin = false ;
      A1935BarParTin = httpContext.GetPar( "BarParTin") ;
      n1935BarParTin = false ;
      AV61BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
      AV62BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
      AV63BarCodPar = httpContext.GetPar( "BarCodPar") ;
      A1945BarMaqTin = httpContext.GetPar( "BarMaqTin") ;
      n1945BarMaqTin = false ;
      A8563BarKgsTt = CommonUtil.decimalVal( httpContext.GetPar( "BarKgsTt"), ".") ;
      n8563BarKgsTt = false ;
      A1947BarKgmTin = CommonUtil.decimalVal( httpContext.GetPar( "BarKgmTin"), ".") ;
      n1947BarKgmTin = false ;
      A3705BarCosCol = CommonUtil.decimalVal( httpContext.GetPar( "BarCosCol"), ".") ;
      n3705BarCosCol = false ;
      A3658BarCosPA = CommonUtil.decimalVal( httpContext.GetPar( "BarCosPA"), ".") ;
      n3658BarCosPA = false ;
      A3654BarCosPD = CommonUtil.decimalVal( httpContext.GetPar( "BarCosPD"), ".") ;
      n3654BarCosPD = false ;
      A3657BarCosAA = CommonUtil.decimalVal( httpContext.GetPar( "BarCosAA"), ".") ;
      n3657BarCosAA = false ;
      A3656BarCosAD = CommonUtil.decimalVal( httpContext.GetPar( "BarCosAD"), ".") ;
      n3656BarCosAD = false ;
      A3706BarCosAnc = CommonUtil.decimalVal( httpContext.GetPar( "BarCosAnc"), ".") ;
      n3706BarCosAnc = false ;
      sPrefix = httpContext.GetPar( "sPrefix") ;
      init_default_properties( ) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV15INEmprcod, AV16INHisEstReo, AV19INMaqCod1, AV20INMaqCod2, AV17INHisProFec1, AV18INHisProFec2, AV125OperarioFrom, AV126OperarioTo, AV140Pgmname, AV21OrderedBy, AV22OrderedDsc, AV89TFBarNHdr, AV90TFBarNHdr_Sel, AV101TFMaqCod, AV102TFMaqCod_Sel, AV103TFHisProFec, AV105TFHisProKgr, AV106TFHisProKgr_To, AV107TFHisProMtr, AV108TFHisProMtr_To, AV109TFHisProTur, AV110TFHisProTur_To, AV93TFHisProF, AV94TFHisProF_Sel, AV111TFHisProDTI, AV113TFHisProDTF, AV91TFCliNom, AV92TFCliNom_Sel, AV53TFBarSer, AV54TFBarSer_Sel, AV85TFBarColNom, AV86TFBarColNom_Sel, AV87TFBarColNum, AV88TFBarColNum_To, AV117TFFase, AV118TFFase_Sel, AV119TFFaseDescripcion, AV120TFFaseDescripcion_Sel, AV99TFBarTipArt, AV100TFBarTipArt_To, AV121TFHisProTip, AV122TFHisProTip_To, AV123TFHisProTc, AV124TFHisProTc_To, AV46TFHisProDf, AV37TFParCod, AV38TFParCod_To, AV39TFParCodNom, AV40TFParCodNom_Sel, AV95TotHisProKgr, AV96TotHisProMtr, AV82MatDsc, AV81MatCod, AV79fechadt, A2316BarAgrLot, AV30FasDivTime, AV129MinutosTotal, AV133tiempom, A457FasCod, AV6EmprCod, AV57FasCod, A14054FasDivTime, A1933BarCodTin, A1934BarReoTin, A1935BarParTin, AV61BarCod, AV62BarCodReo, AV63BarCodPar, A1945BarMaqTin, A8563BarKgsTt, A1947BarKgmTin, A3705BarCosCol, A3658BarCosPA, A3654BarCosPD, A3657BarCosAA, A3656BarCosAD, A3706BarCosAnc, sPrefix) ;
      addString( httpContext.getJSONResponse( )) ;
      /* End function gxgrGrid_refresh_invoke */
   }

   public void webExecute( )
   {
      initweb( ) ;
      if ( ! isAjaxCallMode( ) )
      {
         pa25I2( ) ;
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
         httpContext.writeValue( httpContext.getMessage( " Table LHIPRO", "")) ;
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
         httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.produccion.informeproduccionresumenhdr_wc1", new String[] {GXutil.URLEncode(GXutil.rtrim(AV15INEmprcod)),GXutil.URLEncode(GXutil.ltrimstr(AV16INHisEstReo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV19INMaqCod1)),GXutil.URLEncode(GXutil.rtrim(AV20INMaqCod2)),GXutil.URLEncode(GXutil.formatDateTimeParm(AV17INHisProFec1)),GXutil.URLEncode(GXutil.formatDateTimeParm(AV18INHisProFec2)),GXutil.URLEncode(GXutil.ltrimstr(AV125OperarioFrom,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV126OperarioTo,6,0))}, new String[] {"INEmprcod","INHisEstReo","INMaqCod1","INMaqCod2","INHisProFec1","INHisProFec2","OperarioFrom","OperarioTo"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTHISPROKGR", getSecureSignedToken( sPrefix, localUtil.format( AV95TotHisProKgr, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTHISPROMTR", getSecureSignedToken( sPrefix, localUtil.format( AV96TotHisProMtr, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vFECHADT", getSecureSignedToken( sPrefix, localUtil.format( AV79fechadt, "99/99/99 99:99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vFASDIVTIME", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV30FasDivTime, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vMINUTOSTOTAL", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV129MinutosTotal), "ZZZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTIEMPOM", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV133tiempom), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vEMPRCOD", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV6EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vFASCOD", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV57FasCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vBARCOD", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV61BarCod), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vBARCODREO", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV62BarCodReo), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vBARCODPAR", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV63BarCodPar, ""))));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"InformeProduccionResumenHdr_WC1");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV140Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("produccion\\informeproduccionresumenhdr_wc1:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"nRC_GXsfl_27", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_27, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGRIDCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV10GridCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGRIDPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV11GridPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vDDO_TITLESETTINGSICONS", AV5DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vDDO_TITLESETTINGSICONS", AV5DDO_TitleSettingsIcons);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV15INEmprcod", GXutil.rtrim( wcpOAV15INEmprcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV16INHisEstReo", GXutil.ltrim( localUtil.ntoc( wcpOAV16INHisEstReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV19INMaqCod1", GXutil.rtrim( wcpOAV19INMaqCod1));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV20INMaqCod2", GXutil.rtrim( wcpOAV20INMaqCod2));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV17INHisProFec1", localUtil.ttoc( wcpOAV17INHisProFec1, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV18INHisProFec2", localUtil.ttoc( wcpOAV18INHisProFec2, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV125OperarioFrom", GXutil.ltrim( localUtil.ntoc( wcpOAV125OperarioFrom, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV126OperarioTo", GXutil.ltrim( localUtil.ntoc( wcpOAV126OperarioTo, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vORDEREDBY", GXutil.ltrim( localUtil.ntoc( AV21OrderedBy, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, sPrefix+"vORDEREDDSC", AV22OrderedDsc);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARNHDR", GXutil.rtrim( AV89TFBarNHdr));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARNHDR_SEL", GXutil.rtrim( AV90TFBarNHdr_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFMAQCOD", GXutil.rtrim( AV101TFMaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFMAQCOD_SEL", GXutil.rtrim( AV102TFMaqCod_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFHISPROFEC", localUtil.dtoc( AV103TFHisProFec, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFHISPROKGR", GXutil.ltrim( localUtil.ntoc( AV105TFHisProKgr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFHISPROKGR_TO", GXutil.ltrim( localUtil.ntoc( AV106TFHisProKgr_To, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFHISPROMTR", GXutil.ltrim( localUtil.ntoc( AV107TFHisProMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFHISPROMTR_TO", GXutil.ltrim( localUtil.ntoc( AV108TFHisProMtr_To, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFHISPROTUR", GXutil.ltrim( localUtil.ntoc( AV109TFHisProTur, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFHISPROTUR_TO", GXutil.ltrim( localUtil.ntoc( AV110TFHisProTur_To, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFHISPROF", GXutil.rtrim( AV93TFHisProF));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFHISPROF_SEL", GXutil.rtrim( AV94TFHisProF_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFHISPRODTI", localUtil.ttoc( AV111TFHisProDTI, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFHISPRODTF", localUtil.ttoc( AV113TFHisProDTF, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFCLINOM", GXutil.rtrim( AV91TFCliNom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFCLINOM_SEL", GXutil.rtrim( AV92TFCliNom_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARSER", GXutil.rtrim( AV53TFBarSer));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARSER_SEL", GXutil.rtrim( AV54TFBarSer_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARCOLNOM", GXutil.rtrim( AV85TFBarColNom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARCOLNOM_SEL", GXutil.rtrim( AV86TFBarColNom_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARCOLNUM", GXutil.ltrim( localUtil.ntoc( AV87TFBarColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARCOLNUM_TO", GXutil.ltrim( localUtil.ntoc( AV88TFBarColNum_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFFASE", GXutil.rtrim( AV117TFFase));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFFASE_SEL", GXutil.rtrim( AV118TFFase_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFFASEDESCRIPCION", GXutil.rtrim( AV119TFFaseDescripcion));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFFASEDESCRIPCION_SEL", GXutil.rtrim( AV120TFFaseDescripcion_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARTIPART", GXutil.ltrim( localUtil.ntoc( AV99TFBarTipArt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARTIPART_TO", GXutil.ltrim( localUtil.ntoc( AV100TFBarTipArt_To, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFHISPROTIP", GXutil.ltrim( localUtil.ntoc( AV121TFHisProTip, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFHISPROTIP_TO", GXutil.ltrim( localUtil.ntoc( AV122TFHisProTip_To, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFHISPROTC", GXutil.ltrim( localUtil.ntoc( AV123TFHisProTc, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFHISPROTC_TO", GXutil.ltrim( localUtil.ntoc( AV124TFHisProTc_To, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFHISPRODF", localUtil.dtoc( AV46TFHisProDf, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPARCOD", GXutil.ltrim( localUtil.ntoc( AV37TFParCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPARCOD_TO", GXutil.ltrim( localUtil.ntoc( AV38TFParCod_To, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPARCODNOM", GXutil.rtrim( AV39TFParCodNom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPARCODNOM_SEL", GXutil.rtrim( AV40TFParCodNom_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vINEMPRCOD", GXutil.rtrim( AV15INEmprcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vINHISESTREO", GXutil.ltrim( localUtil.ntoc( AV16INHisEstReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vINMAQCOD1", GXutil.rtrim( AV19INMaqCod1));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vINMAQCOD2", GXutil.rtrim( AV20INMaqCod2));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vINHISPROFEC1", localUtil.ttoc( AV17INHisProFec1, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vINHISPROFEC2", localUtil.ttoc( AV18INHisProFec2, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vOPERARIOFROM", GXutil.ltrim( localUtil.ntoc( AV125OperarioFrom, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vOPERARIOTO", GXutil.ltrim( localUtil.ntoc( AV126OperarioTo, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"HISPROREO", GXutil.ltrim( localUtil.ntoc( A3612HisProReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOTHISPROKGR", GXutil.ltrim( localUtil.ntoc( AV95TotHisProKgr, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTHISPROKGR", getSecureSignedToken( sPrefix, localUtil.format( AV95TotHisProKgr, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOTHISPROMTR", GXutil.ltrim( localUtil.ntoc( AV96TotHisProMtr, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTHISPROMTR", getSecureSignedToken( sPrefix, localUtil.format( AV96TotHisProMtr, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"CLICOD", GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vFECHADT", localUtil.ttoc( AV79fechadt, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vFECHADT", getSecureSignedToken( sPrefix, localUtil.format( AV79fechadt, "99/99/99 99:99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"BARESTREO", GXutil.ltrim( localUtil.ntoc( A148BarEstReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"TIPDEFCOD", GXutil.ltrim( localUtil.ntoc( A833TipDefCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"TIPDEFDSC", GXutil.rtrim( A834TipDefDsc));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"BARAGRLOT", GXutil.rtrim( A2316BarAgrLot));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vFASDIVTIME", GXutil.rtrim( AV30FasDivTime));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vFASDIVTIME", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV30FasDivTime, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"HISPROTDAB", GXutil.ltrim( localUtil.ntoc( A6680HisproTdab, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMINUTOSTOTAL", GXutil.ltrim( localUtil.ntoc( AV129MinutosTotal, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vMINUTOSTOTAL", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV129MinutosTotal), "ZZZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTIEMPOM", GXutil.ltrim( localUtil.ntoc( AV133tiempom, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTIEMPOM", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV133tiempom), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"FASCOD", GXutil.rtrim( A457FasCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vEMPRCOD", GXutil.rtrim( AV6EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vEMPRCOD", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV6EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vFASCOD", GXutil.rtrim( AV57FasCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vFASCOD", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV57FasCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"FASDIVTIME", GXutil.rtrim( A14054FasDivTime));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"BARCODTIN", GXutil.ltrim( localUtil.ntoc( A1933BarCodTin, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"BARREOTIN", GXutil.ltrim( localUtil.ntoc( A1934BarReoTin, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"BARPARTIN", GXutil.rtrim( A1935BarParTin));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARCOD", GXutil.ltrim( localUtil.ntoc( AV61BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vBARCOD", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV61BarCod), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARCODREO", GXutil.ltrim( localUtil.ntoc( AV62BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vBARCODREO", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV62BarCodReo), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARCODPAR", GXutil.rtrim( AV63BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vBARCODPAR", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV63BarCodPar, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"BARMAQTIN", GXutil.rtrim( A1945BarMaqTin));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"BARKGSTT", GXutil.ltrim( localUtil.ntoc( A8563BarKgsTt, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"BARKGMTIN", GXutil.ltrim( localUtil.ntoc( A1947BarKgmTin, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"BARCOSCOL", GXutil.ltrim( localUtil.ntoc( A3705BarCosCol, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"BARCOSPA", GXutil.ltrim( localUtil.ntoc( A3658BarCosPA, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"BARCOSPD", GXutil.ltrim( localUtil.ntoc( A3654BarCosPD, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"BARCOSAA", GXutil.ltrim( localUtil.ntoc( A3657BarCosAA, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"BARCOSAD", GXutil.ltrim( localUtil.ntoc( A3656BarCosAD, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"BARCOSANC", GXutil.ltrim( localUtil.ntoc( A3706BarCosAnc, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"HISPROTR2", GXutil.ltrim( localUtil.ntoc( A5605HisProTr2, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Sortedstatus", GXutil.rtrim( Ddo_grid_Sortedstatus));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Includefilter", GXutil.rtrim( Ddo_grid_Includefilter));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filtertype", GXutil.rtrim( Ddo_grid_Filtertype));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filterisrange", GXutil.rtrim( Ddo_grid_Filterisrange));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Includedatalist", GXutil.rtrim( Ddo_grid_Includedatalist));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Datalisttype", GXutil.rtrim( Ddo_grid_Datalisttype));
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCOSTEI_Visible", GXutil.ltrim( localUtil.ntoc( edtavCostei_Visible, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCOSTET_Visible", GXutil.ltrim( localUtil.ntoc( edtavCostet_Visible, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCOSTEK_Visible", GXutil.ltrim( localUtil.ntoc( edtavCostek_Visible, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARKGMTIN_Visible", GXutil.ltrim( localUtil.ntoc( edtavBarkgmtin_Visible, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARKGSTT_Visible", GXutil.ltrim( localUtil.ntoc( edtavBarkgstt_Visible, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Activeeventkey", GXutil.rtrim( Ddo_grid_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Selectedvalue_get", GXutil.rtrim( Ddo_grid_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtextto_get", GXutil.rtrim( Ddo_grid_Filteredtextto_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtext_get", GXutil.rtrim( Ddo_grid_Filteredtext_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Selectedcolumn", GXutil.rtrim( Ddo_grid_Selectedcolumn));
   }

   public void renderHtmlCloseForm25I2( )
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
      return "Produccion.InformeProduccionResumenHdr_WC1" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( " Table LHIPRO", "") ;
   }

   public void wb25I0( )
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
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "app.produccion.informeproduccionresumenhdr_wc1");
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
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
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnbuttonexcel_Internalname, "gx.evt.setGridEvt("+GXutil.str( 27, 2, 0)+","+"null"+");", httpContext.getMessage( "Excel", ""), bttBtnbuttonexcel_Jsonclick, 5, httpContext.getMessage( "Excel", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOBUTTONEXCEL\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Produccion\\InformeProduccionResumenHdr_WC1.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
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
         startgridcontrol27( ) ;
      }
      if ( wbEnd == 27 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_27 = (int)(nGXsfl_27_idx-1) ;
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
         wb_table1_84_25I2( true) ;
      }
      else
      {
         wb_table1_84_25I2( false) ;
      }
      return  ;
   }

   public void wb_table1_84_25I2e( boolean wbgen )
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
         ucGridpaginationbar.setProperty("CurrentPage", AV10GridCurrentPage);
         ucGridpaginationbar.setProperty("PageCount", AV11GridPageCount);
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV140Pgmname), GXutil.rtrim( localUtil.format( AV140Pgmname, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Produccion\\InformeProduccionResumenHdr_WC1.htm");
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
         ucDdo_grid.setProperty("DataListProc", Ddo_grid_Datalistproc);
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV5DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, sPrefix+"DDO_GRIDContainer");
         /* User Defined Control */
         ucGrid_empowerer.setProperty("HasTitleSettings", Grid_empowerer_Hastitlesettings);
         ucGrid_empowerer.render(context, "wwp.gridempowerer", Grid_empowerer_Internalname, sPrefix+"GRID_EMPOWERERContainer");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDdo_hisprofecauxdates_Internalname, 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 160,'" + sPrefix + "',false,'" + sGXsfl_27_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDdo_hisprofecauxdate_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDdo_hisprofecauxdate_Internalname, localUtil.format(AV104DDO_HisProFecAuxDate, "99/99/99"), localUtil.format( AV104DDO_HisProFecAuxDate, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,160);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDdo_hisprofecauxdate_Jsonclick, 0, "Attribute", "", "", "", "", 1, 1, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Produccion\\InformeProduccionResumenHdr_WC1.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDdo_hisprofecauxdate_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(1==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_Produccion\\InformeProduccionResumenHdr_WC1.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDdo_hisprodtiauxdates_Internalname, 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 162,'" + sPrefix + "',false,'" + sGXsfl_27_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDdo_hisprodtiauxdate_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDdo_hisprodtiauxdate_Internalname, localUtil.format(AV112DDO_HisProDTIAuxDate, "99/99/99"), localUtil.format( AV112DDO_HisProDTIAuxDate, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,162);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDdo_hisprodtiauxdate_Jsonclick, 0, "Attribute", "", "", "", "", 1, 1, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Produccion\\InformeProduccionResumenHdr_WC1.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDdo_hisprodtiauxdate_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(1==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_Produccion\\InformeProduccionResumenHdr_WC1.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDdo_hisprodtfauxdates_Internalname, 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 164,'" + sPrefix + "',false,'" + sGXsfl_27_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDdo_hisprodtfauxdate_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDdo_hisprodtfauxdate_Internalname, localUtil.format(AV114DDO_HisProDTFAuxDate, "99/99/99"), localUtil.format( AV114DDO_HisProDTFAuxDate, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,164);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDdo_hisprodtfauxdate_Jsonclick, 0, "Attribute", "", "", "", "", 1, 1, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Produccion\\InformeProduccionResumenHdr_WC1.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDdo_hisprodtfauxdate_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(1==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_Produccion\\InformeProduccionResumenHdr_WC1.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDdo_hisprodfauxdates_Internalname, 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 166,'" + sPrefix + "',false,'" + sGXsfl_27_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDdo_hisprodfauxdate_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDdo_hisprodfauxdate_Internalname, localUtil.format(AV47DDO_HisProDfAuxDate, "99/99/99"), localUtil.format( AV47DDO_HisProDfAuxDate, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,166);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDdo_hisprodfauxdate_Jsonclick, 0, "Attribute", "", "", "", "", 1, 1, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Produccion\\InformeProduccionResumenHdr_WC1.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDdo_hisprodfauxdate_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(1==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_Produccion\\InformeProduccionResumenHdr_WC1.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      if ( wbEnd == 27 )
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

   public void start25I2( )
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
            Form.getMeta().addItem("description", httpContext.getMessage( " Table LHIPRO", ""), (short)(0)) ;
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
            strup25I0( ) ;
         }
      }
   }

   public void ws25I2( )
   {
      start25I2( ) ;
      evt25I2( ) ;
   }

   public void evt25I2( )
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
                              strup25I0( ) ;
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
                              strup25I0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e1125I2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup25I0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e1225I2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRID.ONOPTIONCLICKED") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup25I0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e1325I2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOBUTTONEXCEL'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup25I0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoButtonExcel' */
                                 e1425I2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup25I0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 GX_FocusControl = edtavTotvaluehisprokgr_Internalname ;
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
                              strup25I0( ) ;
                           }
                           nGXsfl_27_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_27_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_27_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_272( ) ;
                           A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
                           A129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( edtBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarCodReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A130BarCodPar = httpContext.cgiGet( edtBarCodPar_Internalname) ;
                           A13696BarNHdr = httpContext.cgiGet( edtBarNHdr_Internalname) ;
                           A602MaqCod = httpContext.cgiGet( edtMaqCod_Internalname) ;
                           A558HisProFec = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtHisProFec_Internalname), 0)) ;
                           A561HisProLin = (int)(localUtil.ctol( httpContext.cgiGet( edtHisProLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A1525HisProKgr = localUtil.ctond( httpContext.cgiGet( edtHisProKgr_Internalname)) ;
                           A1526HisProMtr = localUtil.ctond( httpContext.cgiGet( edtHisProMtr_Internalname)) ;
                           A566HisProTur = (byte)(localUtil.ctol( httpContext.cgiGet( edtHisProTur_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A557HisProF = GXutil.upper( httpContext.cgiGet( edtHisProF_Internalname)) ;
                           A4440HisProDTI = localUtil.ctot( httpContext.cgiGet( edtHisProDTI_Internalname), 0) ;
                           n4440HisProDTI = false ;
                           A4441HisProDTF = localUtil.ctot( httpContext.cgiGet( edtHisProDTF_Internalname), 0) ;
                           n4441HisProDTF = false ;
                           AV73HhMmAlfa = httpContext.cgiGet( edtavHhmmalfa_Internalname) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavHhmmalfa_Internalname, AV73HhMmAlfa);
                           A279CliNom = httpContext.cgiGet( edtCliNom_Internalname) ;
                           A212BarSer = httpContext.cgiGet( edtBarSer_Internalname) ;
                           A135BarColNom = httpContext.cgiGet( edtBarColNom_Internalname) ;
                           A136BarColNum = (int)(localUtil.ctol( httpContext.cgiGet( edtBarColNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           AV81MatCod = (short)(localUtil.ctol( httpContext.cgiGet( edtavMatcod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavMatcod_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV81MatCod), 3, 0));
                           app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vMATCOD"+"_"+sGXsfl_27_idx, getSecureSignedToken( sPrefix+sGXsfl_27_idx, localUtil.format( DecimalUtil.doubleToDec(AV81MatCod), "ZZ9")));
                           AV82MatDsc = httpContext.cgiGet( edtavMatdsc_Internalname) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavMatdsc_Internalname, AV82MatDsc);
                           app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vMATDSC"+"_"+sGXsfl_27_idx, getSecureSignedToken( sPrefix+sGXsfl_27_idx, GXutil.rtrim( localUtil.format( AV82MatDsc, ""))));
                           A503GruOpeCod = (int)(localUtil.ctol( httpContext.cgiGet( edtGruOpeCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A13892GruOpeCodN = httpContext.cgiGet( edtGruOpeCodN_Internalname) ;
                           A461Fase = httpContext.cgiGet( edtFase_Internalname) ;
                           A13893FaseDescri = httpContext.cgiGet( edtFaseDescri_Internalname) ;
                           AV80FlagMarca = (byte)(localUtil.ctol( httpContext.cgiGet( edtavFlagmarca_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavFlagmarca_Internalname, GXutil.str( AV80FlagMarca, 1, 0));
                           AV74Minutos = localUtil.ctol( httpContext.cgiGet( edtavMinutos_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavMinutos_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV74Minutos), 10, 0));
                           AV83Op4 = ((GXutil.strcmp(httpContext.cgiGet( chkavOp4.getInternalname()), "S")==0) ? "S" : "N") ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, chkavOp4.getInternalname(), AV83Op4);
                           A217BarTipArt = (short)(localUtil.ctol( httpContext.cgiGet( edtBarTipArt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           n217BarTipArt = false ;
                           A2247HisProTip = (short)(localUtil.ctol( httpContext.cgiGet( edtHisProTip_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           AV36TipArtDsc = httpContext.cgiGet( edtavTipartdsc_Internalname) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavTipartdsc_Internalname, AV36TipArtDsc);
                           A3611HisProTc = (byte)(localUtil.ctol( httpContext.cgiGet( edtHisProTc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           AV44TipColDsc = httpContext.cgiGet( edtavTipcoldsc_Internalname) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavTipcoldsc_Internalname, AV44TipColDsc);
                           A5608HisProDf = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtHisProDf_Internalname), 0)) ;
                           AV45ForRGB = localUtil.ctol( httpContext.cgiGet( edtavForrgb_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavForrgb_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV45ForRGB), 10, 0));
                           AV48R = (short)(localUtil.ctol( httpContext.cgiGet( edtavR_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavR_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV48R), 3, 0));
                           AV49G = (short)(localUtil.ctol( httpContext.cgiGet( edtavG_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavG_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV49G), 3, 0));
                           AV50B = (short)(localUtil.ctol( httpContext.cgiGet( edtavB_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavB_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV50B), 3, 0));
                           AV42TipDefCod = (short)(localUtil.ctol( httpContext.cgiGet( edtavTipdefcod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavTipdefcod_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV42TipDefCod), 4, 0));
                           AV43TipDefDsc = httpContext.cgiGet( edtavTipdefdsc_Internalname) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavTipdefdsc_Internalname, AV43TipDefDsc);
                           AV51CosteI = localUtil.ctond( httpContext.cgiGet( edtavCostei_Internalname)) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCostei_Internalname, GXutil.ltrimstr( AV51CosteI, 10, 2));
                           AV52CosteT = localUtil.ctond( httpContext.cgiGet( edtavCostet_Internalname)) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCostet_Internalname, GXutil.ltrimstr( AV52CosteT, 10, 2));
                           AV77CosteK = localUtil.ctond( httpContext.cgiGet( edtavCostek_Internalname)) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCostek_Internalname, GXutil.ltrimstr( AV77CosteK, 10, 2));
                           AV59HdrP = httpContext.cgiGet( edtavHdrp_Internalname) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavHdrp_Internalname, AV59HdrP);
                           AV60BarKgmTin = localUtil.ctond( httpContext.cgiGet( edtavBarkgmtin_Internalname)) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavBarkgmtin_Internalname, GXutil.ltrimstr( AV60BarKgmTin, 9, 2));
                           AV58BarKgsTt = localUtil.ctond( httpContext.cgiGet( edtavBarkgstt_Internalname)) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavBarkgstt_Internalname, GXutil.ltrimstr( AV58BarKgsTt, 10, 2));
                           AV67HisProTr2 = (short)(localUtil.ctol( httpContext.cgiGet( edtavHisprotr2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavHisprotr2_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV67HisProTr2), 4, 0));
                           AV69HorReaInt = (short)(localUtil.ctol( httpContext.cgiGet( edtavHorreaint_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavHorreaint_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV69HorReaInt), 4, 0));
                           AV70MinRea = (short)(localUtil.ctol( httpContext.cgiGet( edtavMinrea_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavMinrea_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV70MinRea), 4, 0));
                           A656ParCod = (short)(localUtil.ctol( httpContext.cgiGet( edtParCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           n656ParCod = false ;
                           A867ParCodNom = httpContext.cgiGet( edtParCodNom_Internalname) ;
                           n867ParCodNom = false ;
                           A218BarTipCol = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarTipCol_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A3610HisProLot = httpContext.cgiGet( edtHisProLot_Internalname) ;
                           A556HisProEst = (byte)(localUtil.ctol( httpContext.cgiGet( edtHisProEst_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
                                       GX_FocusControl = edtavTotvaluehisprokgr_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       /* Execute user event: Start */
                                       e1525I2 ();
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
                                       GX_FocusControl = edtavTotvaluehisprokgr_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       /* Execute user event: Refresh */
                                       e1625I2 ();
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
                                       GX_FocusControl = edtavTotvaluehisprokgr_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       e1725I2 ();
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
                                    strup25I0( ) ;
                                 }
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       dynload_actions( ) ;
                                       GX_FocusControl = edtavTotvaluehisprokgr_Internalname ;
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

   public void we25I2( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm25I2( ) ;
         }
      }
   }

   public void pa25I2( )
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
            GX_FocusControl = edtavTotvaluehisprokgr_Internalname ;
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
      subsflControlProps_272( ) ;
      while ( nGXsfl_27_idx <= nRC_GXsfl_27 )
      {
         sendrow_272( ) ;
         nGXsfl_27_idx = ((subGrid_Islastpage==1)&&(nGXsfl_27_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_27_idx+1) ;
         sGXsfl_27_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_27_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_272( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 String AV15INEmprcod ,
                                 byte AV16INHisEstReo ,
                                 String AV19INMaqCod1 ,
                                 String AV20INMaqCod2 ,
                                 java.util.Date AV17INHisProFec1 ,
                                 java.util.Date AV18INHisProFec2 ,
                                 int AV125OperarioFrom ,
                                 int AV126OperarioTo ,
                                 String AV140Pgmname ,
                                 short AV21OrderedBy ,
                                 boolean AV22OrderedDsc ,
                                 String AV89TFBarNHdr ,
                                 String AV90TFBarNHdr_Sel ,
                                 String AV101TFMaqCod ,
                                 String AV102TFMaqCod_Sel ,
                                 java.util.Date AV103TFHisProFec ,
                                 java.math.BigDecimal AV105TFHisProKgr ,
                                 java.math.BigDecimal AV106TFHisProKgr_To ,
                                 java.math.BigDecimal AV107TFHisProMtr ,
                                 java.math.BigDecimal AV108TFHisProMtr_To ,
                                 byte AV109TFHisProTur ,
                                 byte AV110TFHisProTur_To ,
                                 String AV93TFHisProF ,
                                 String AV94TFHisProF_Sel ,
                                 java.util.Date AV111TFHisProDTI ,
                                 java.util.Date AV113TFHisProDTF ,
                                 String AV91TFCliNom ,
                                 String AV92TFCliNom_Sel ,
                                 String AV53TFBarSer ,
                                 String AV54TFBarSer_Sel ,
                                 String AV85TFBarColNom ,
                                 String AV86TFBarColNom_Sel ,
                                 int AV87TFBarColNum ,
                                 int AV88TFBarColNum_To ,
                                 String AV117TFFase ,
                                 String AV118TFFase_Sel ,
                                 String AV119TFFaseDescripcion ,
                                 String AV120TFFaseDescripcion_Sel ,
                                 short AV99TFBarTipArt ,
                                 short AV100TFBarTipArt_To ,
                                 short AV121TFHisProTip ,
                                 short AV122TFHisProTip_To ,
                                 byte AV123TFHisProTc ,
                                 byte AV124TFHisProTc_To ,
                                 java.util.Date AV46TFHisProDf ,
                                 short AV37TFParCod ,
                                 short AV38TFParCod_To ,
                                 String AV39TFParCodNom ,
                                 String AV40TFParCodNom_Sel ,
                                 java.math.BigDecimal AV95TotHisProKgr ,
                                 java.math.BigDecimal AV96TotHisProMtr ,
                                 String AV82MatDsc ,
                                 short AV81MatCod ,
                                 java.util.Date AV79fechadt ,
                                 String A2316BarAgrLot ,
                                 String AV30FasDivTime ,
                                 long AV129MinutosTotal ,
                                 int AV133tiempom ,
                                 String A457FasCod ,
                                 String AV6EmprCod ,
                                 String AV57FasCod ,
                                 String A14054FasDivTime ,
                                 int A1933BarCodTin ,
                                 byte A1934BarReoTin ,
                                 String A1935BarParTin ,
                                 int AV61BarCod ,
                                 byte AV62BarCodReo ,
                                 String AV63BarCodPar ,
                                 String A1945BarMaqTin ,
                                 java.math.BigDecimal A8563BarKgsTt ,
                                 java.math.BigDecimal A1947BarKgmTin ,
                                 java.math.BigDecimal A3705BarCosCol ,
                                 java.math.BigDecimal A3658BarCosPA ,
                                 java.math.BigDecimal A3654BarCosPD ,
                                 java.math.BigDecimal A3657BarCosAA ,
                                 java.math.BigDecimal A3656BarCosAD ,
                                 java.math.BigDecimal A3706BarCosAnc ,
                                 String sPrefix )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e1625I2 ();
      GRID_nCurrentRecord = 0 ;
      rf25I2( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"InformeProduccionResumenHdr_WC1");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV140Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("produccion\\informeproduccionresumenhdr_wc1:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
      /* End function gxgrGrid_refresh */
   }

   public void send_integrity_hashes( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vMATDSC", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV82MatDsc, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMATDSC", GXutil.rtrim( AV82MatDsc));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vMATCOD", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV81MatCod), "ZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMATCOD", GXutil.ltrim( localUtil.ntoc( AV81MatCod, (byte)(3), (byte)(0), ".", "")));
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
      rf25I2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV140Pgmname = "Produccion.InformeProduccionResumenHdr_WC1" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV140Pgmname", AV140Pgmname);
      Gx_err = (short)(0) ;
      edtavHhmmalfa_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavHhmmalfa_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHhmmalfa_Enabled), 5, 0), !bGXsfl_27_Refreshing);
      edtavMatcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavMatcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMatcod_Enabled), 5, 0), !bGXsfl_27_Refreshing);
      edtavMatdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavMatdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMatdsc_Enabled), 5, 0), !bGXsfl_27_Refreshing);
      edtavFlagmarca_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavFlagmarca_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavFlagmarca_Enabled), 5, 0), !bGXsfl_27_Refreshing);
      edtavMinutos_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavMinutos_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMinutos_Enabled), 5, 0), !bGXsfl_27_Refreshing);
      chkavOp4.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, chkavOp4.getInternalname(), "Enabled", GXutil.ltrimstr( chkavOp4.getEnabled(), 5, 0), !bGXsfl_27_Refreshing);
      edtavTipartdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTipartdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTipartdsc_Enabled), 5, 0), !bGXsfl_27_Refreshing);
      edtavTipcoldsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTipcoldsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTipcoldsc_Enabled), 5, 0), !bGXsfl_27_Refreshing);
      edtavForrgb_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavForrgb_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavForrgb_Enabled), 5, 0), !bGXsfl_27_Refreshing);
      edtavR_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavR_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavR_Enabled), 5, 0), !bGXsfl_27_Refreshing);
      edtavG_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavG_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavG_Enabled), 5, 0), !bGXsfl_27_Refreshing);
      edtavB_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavB_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavB_Enabled), 5, 0), !bGXsfl_27_Refreshing);
      edtavTipdefcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTipdefcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTipdefcod_Enabled), 5, 0), !bGXsfl_27_Refreshing);
      edtavTipdefdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTipdefdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTipdefdsc_Enabled), 5, 0), !bGXsfl_27_Refreshing);
      edtavCostei_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCostei_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCostei_Enabled), 5, 0), !bGXsfl_27_Refreshing);
      edtavCostet_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCostet_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCostet_Enabled), 5, 0), !bGXsfl_27_Refreshing);
      edtavCostek_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCostek_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCostek_Enabled), 5, 0), !bGXsfl_27_Refreshing);
      edtavHdrp_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavHdrp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHdrp_Enabled), 5, 0), !bGXsfl_27_Refreshing);
      edtavBarkgmtin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBarkgmtin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarkgmtin_Enabled), 5, 0), !bGXsfl_27_Refreshing);
      edtavBarkgstt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBarkgstt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarkgstt_Enabled), 5, 0), !bGXsfl_27_Refreshing);
      edtavHisprotr2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavHisprotr2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHisprotr2_Enabled), 5, 0), !bGXsfl_27_Refreshing);
      edtavHorreaint_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavHorreaint_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHorreaint_Enabled), 5, 0), !bGXsfl_27_Refreshing);
      edtavMinrea_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavMinrea_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMinrea_Enabled), 5, 0), !bGXsfl_27_Refreshing);
      edtavTotvaluehisprokgr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvaluehisprokgr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluehisprokgr_Enabled), 5, 0), true);
      edtavTotvaluehispromtr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvaluehispromtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluehispromtr_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public int subgridclient_rec_count_fnc( )
   {
      GRID_nRecordCount = 0 ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV90TFBarNHdr_Sel ,
                                           AV89TFBarNHdr ,
                                           AV102TFMaqCod_Sel ,
                                           AV101TFMaqCod ,
                                           AV103TFHisProFec ,
                                           AV105TFHisProKgr ,
                                           AV106TFHisProKgr_To ,
                                           AV107TFHisProMtr ,
                                           AV108TFHisProMtr_To ,
                                           Byte.valueOf(AV109TFHisProTur) ,
                                           Byte.valueOf(AV110TFHisProTur_To) ,
                                           AV94TFHisProF_Sel ,
                                           AV93TFHisProF ,
                                           AV111TFHisProDTI ,
                                           AV113TFHisProDTF ,
                                           AV92TFCliNom_Sel ,
                                           AV91TFCliNom ,
                                           AV54TFBarSer_Sel ,
                                           AV53TFBarSer ,
                                           AV86TFBarColNom_Sel ,
                                           AV85TFBarColNom ,
                                           Integer.valueOf(AV87TFBarColNum) ,
                                           Integer.valueOf(AV88TFBarColNum_To) ,
                                           AV118TFFase_Sel ,
                                           AV117TFFase ,
                                           Short.valueOf(AV99TFBarTipArt) ,
                                           Short.valueOf(AV100TFBarTipArt_To) ,
                                           Short.valueOf(AV121TFHisProTip) ,
                                           Short.valueOf(AV122TFHisProTip_To) ,
                                           Byte.valueOf(AV123TFHisProTc) ,
                                           Byte.valueOf(AV124TFHisProTc_To) ,
                                           AV46TFHisProDf ,
                                           Short.valueOf(AV37TFParCod) ,
                                           Short.valueOf(AV38TFParCod_To) ,
                                           AV40TFParCodNom_Sel ,
                                           AV39TFParCodNom ,
                                           Byte.valueOf(AV16INHisEstReo) ,
                                           Integer.valueOf(AV125OperarioFrom) ,
                                           Integer.valueOf(AV126OperarioTo) ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           A602MaqCod ,
                                           A558HisProFec ,
                                           A1525HisProKgr ,
                                           A1526HisProMtr ,
                                           Byte.valueOf(A566HisProTur) ,
                                           A557HisProF ,
                                           A4440HisProDTI ,
                                           A4441HisProDTF ,
                                           A279CliNom ,
                                           A212BarSer ,
                                           A135BarColNom ,
                                           Integer.valueOf(A136BarColNum) ,
                                           A461Fase ,
                                           Short.valueOf(A217BarTipArt) ,
                                           Short.valueOf(A2247HisProTip) ,
                                           Byte.valueOf(A3611HisProTc) ,
                                           A5608HisProDf ,
                                           Short.valueOf(A656ParCod) ,
                                           A867ParCodNom ,
                                           Byte.valueOf(A3612HisProReo) ,
                                           Integer.valueOf(A503GruOpeCod) ,
                                           Short.valueOf(AV21OrderedBy) ,
                                           Boolean.valueOf(AV22OrderedDsc) ,
                                           AV120TFFaseDescripcion_Sel ,
                                           AV119TFFaseDescripcion ,
                                           A13893FaseDescri ,
                                           AV17INHisProFec1 ,
                                           AV18INHisProFec2 ,
                                           AV15INEmprcod ,
                                           AV19INMaqCod1 ,
                                           A396EmprCod ,
                                           AV20INMaqCod2 } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BYTE,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.BYTE,
                                           TypeConstants.BYTE, TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.BOOLEAN,
                                           TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.SHORT,
                                           TypeConstants.BYTE, TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV89TFBarNHdr = GXutil.padr( GXutil.rtrim( AV89TFBarNHdr), 11, "%") ;
      lV101TFMaqCod = GXutil.padr( GXutil.rtrim( AV101TFMaqCod), 6, "%") ;
      lV93TFHisProF = GXutil.padr( GXutil.rtrim( AV93TFHisProF), 1, "%") ;
      lV91TFCliNom = GXutil.padr( GXutil.rtrim( AV91TFCliNom), 30, "%") ;
      lV53TFBarSer = GXutil.padr( GXutil.rtrim( AV53TFBarSer), 16, "%") ;
      lV85TFBarColNom = GXutil.padr( GXutil.rtrim( AV85TFBarColNom), 13, "%") ;
      lV117TFFase = GXutil.padr( GXutil.rtrim( AV117TFFase), 8, "%") ;
      lV39TFParCodNom = GXutil.padr( GXutil.rtrim( AV39TFParCodNom), 30, "%") ;
      /* Using cursor H025I2 */
      pr_default.execute(0, new Object[] {AV15INEmprcod, AV19INMaqCod1, AV17INHisProFec1, AV18INHisProFec2, AV20INMaqCod2, lV89TFBarNHdr, AV90TFBarNHdr_Sel, lV101TFMaqCod, AV102TFMaqCod_Sel, AV103TFHisProFec, AV105TFHisProKgr, AV106TFHisProKgr_To, AV107TFHisProMtr, AV108TFHisProMtr_To, Byte.valueOf(AV109TFHisProTur), Byte.valueOf(AV110TFHisProTur_To), lV93TFHisProF, AV94TFHisProF_Sel, AV111TFHisProDTI, AV113TFHisProDTF, lV91TFCliNom, AV92TFCliNom_Sel, lV53TFBarSer, AV54TFBarSer_Sel, lV85TFBarColNom, AV86TFBarColNom_Sel, Integer.valueOf(AV87TFBarColNum), Integer.valueOf(AV88TFBarColNum_To), lV117TFFase, AV118TFFase_Sel, Short.valueOf(AV99TFBarTipArt), Short.valueOf(AV100TFBarTipArt_To), Short.valueOf(AV121TFHisProTip), Short.valueOf(AV122TFHisProTip_To), Byte.valueOf(AV123TFHisProTc), Byte.valueOf(AV124TFHisProTc_To), AV46TFHisProDf, Short.valueOf(AV37TFParCod), Short.valueOf(AV38TFParCod_To), lV39TFParCodNom, AV40TFParCodNom_Sel, Byte.valueOf(AV16INHisEstReo), Integer.valueOf(AV125OperarioFrom), Integer.valueOf(AV126OperarioTo)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A3612HisProReo = H025I2_A3612HisProReo[0] ;
         A252CliCod = H025I2_A252CliCod[0] ;
         n252CliCod = H025I2_n252CliCod[0] ;
         A833TipDefCod = H025I2_A833TipDefCod[0] ;
         n833TipDefCod = H025I2_n833TipDefCod[0] ;
         A148BarEstReo = H025I2_A148BarEstReo[0] ;
         A834TipDefDsc = H025I2_A834TipDefDsc[0] ;
         n834TipDefDsc = H025I2_n834TipDefDsc[0] ;
         A6680HisproTdab = H025I2_A6680HisproTdab[0] ;
         A556HisProEst = H025I2_A556HisProEst[0] ;
         A3610HisProLot = H025I2_A3610HisProLot[0] ;
         A218BarTipCol = H025I2_A218BarTipCol[0] ;
         A867ParCodNom = H025I2_A867ParCodNom[0] ;
         n867ParCodNom = H025I2_n867ParCodNom[0] ;
         A656ParCod = H025I2_A656ParCod[0] ;
         n656ParCod = H025I2_n656ParCod[0] ;
         A5608HisProDf = H025I2_A5608HisProDf[0] ;
         A3611HisProTc = H025I2_A3611HisProTc[0] ;
         A2247HisProTip = H025I2_A2247HisProTip[0] ;
         A217BarTipArt = H025I2_A217BarTipArt[0] ;
         n217BarTipArt = H025I2_n217BarTipArt[0] ;
         A136BarColNum = H025I2_A136BarColNum[0] ;
         A135BarColNom = H025I2_A135BarColNom[0] ;
         A212BarSer = H025I2_A212BarSer[0] ;
         A279CliNom = H025I2_A279CliNom[0] ;
         A557HisProF = H025I2_A557HisProF[0] ;
         A566HisProTur = H025I2_A566HisProTur[0] ;
         A1526HisProMtr = H025I2_A1526HisProMtr[0] ;
         A1525HisProKgr = H025I2_A1525HisProKgr[0] ;
         A561HisProLin = H025I2_A561HisProLin[0] ;
         A558HisProFec = H025I2_A558HisProFec[0] ;
         A602MaqCod = H025I2_A602MaqCod[0] ;
         A130BarCodPar = H025I2_A130BarCodPar[0] ;
         A132BarCodReo = H025I2_A132BarCodReo[0] ;
         A129BarCod = H025I2_A129BarCod[0] ;
         A503GruOpeCod = H025I2_A503GruOpeCod[0] ;
         A461Fase = H025I2_A461Fase[0] ;
         A396EmprCod = H025I2_A396EmprCod[0] ;
         A4440HisProDTI = H025I2_A4440HisProDTI[0] ;
         n4440HisProDTI = H025I2_n4440HisProDTI[0] ;
         A4441HisProDTF = H025I2_A4441HisProDTF[0] ;
         n4441HisProDTF = H025I2_n4441HisProDTF[0] ;
         A252CliCod = H025I2_A252CliCod[0] ;
         n252CliCod = H025I2_n252CliCod[0] ;
         A833TipDefCod = H025I2_A833TipDefCod[0] ;
         n833TipDefCod = H025I2_n833TipDefCod[0] ;
         A148BarEstReo = H025I2_A148BarEstReo[0] ;
         A218BarTipCol = H025I2_A218BarTipCol[0] ;
         A217BarTipArt = H025I2_A217BarTipArt[0] ;
         n217BarTipArt = H025I2_n217BarTipArt[0] ;
         A136BarColNum = H025I2_A136BarColNum[0] ;
         A135BarColNom = H025I2_A135BarColNom[0] ;
         A212BarSer = H025I2_A212BarSer[0] ;
         A279CliNom = H025I2_A279CliNom[0] ;
         A834TipDefDsc = H025I2_A834TipDefDsc[0] ;
         n834TipDefDsc = H025I2_n834TipDefDsc[0] ;
         A867ParCodNom = H025I2_A867ParCodNom[0] ;
         n867ParCodNom = H025I2_n867ParCodNom[0] ;
         if ( ! GXutil.dateCompare(GXutil.nullDate(), A4441HisProDTF) && A4441HisProDTF.after( A4440HisProDTI ) && ( ( GXutil.dtdiff( A4441HisProDTF, A4440HisProDTI) / (double) ( 60 ) ) <= 9999 ) )
         {
            A5605HisProTr2 = (short)(DecimalUtil.decToDouble(GXutil.roundDecimal( DecimalUtil.doubleToDec(GXutil.dtdiff( A4441HisProDTF, A4440HisProDTI)/ (double) (60)), 0))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A5605HisProTr2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5605HisProTr2), 4, 0));
         }
         else
         {
            A5605HisProTr2 = (short)(0) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A5605HisProTr2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5605HisProTr2), 4, 0));
         }
         GXt_char1 = A13892GruOpeCodN ;
         GXv_char2[0] = GXt_char1 ;
         new app.popenom(remoteHandle, context).execute( A396EmprCod, A503GruOpeCod, GXv_char2) ;
         informeproduccionresumenhdr_wc1_impl.this.GXt_char1 = GXv_char2[0] ;
         A13892GruOpeCodN = GXt_char1 ;
         GXt_char1 = A13893FaseDescri ;
         GXv_char2[0] = GXt_char1 ;
         new app.pfasdsc(remoteHandle, context).execute( A396EmprCod, A461Fase, GXv_char2) ;
         informeproduccionresumenhdr_wc1_impl.this.GXt_char1 = GXv_char2[0] ;
         A13893FaseDescri = GXt_char1 ;
         if ( ! ( (GXutil.strcmp("", AV120TFFaseDescripcion_Sel)==0) && ( ! (GXutil.strcmp("", AV119TFFaseDescripcion)==0) ) ) || ( GXutil.like( GXutil.upper( A13893FaseDescri) , GXutil.padr( "%" + GXutil.upper( AV119TFFaseDescripcion) , 255 , "%"),  ' ' ) ) )
         {
            if ( (GXutil.strcmp("", AV120TFFaseDescripcion_Sel)==0) || ( ( GXutil.strcmp(A13893FaseDescri, AV120TFFaseDescripcion_Sel) == 0 ) ) )
            {
               A13696BarNHdr = GXutil.trim( GXutil.str( A129BarCod, 8, 0)) + "-" + GXutil.trim( GXutil.str( A132BarCodReo, 1, 0)) + A130BarCodPar ;
               GRID_nRecordCount = (long)(GRID_nRecordCount+1) ;
            }
         }
         pr_default.readNext(0);
      }
      GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
      pr_default.close(0);
      return (int)(GRID_nRecordCount) ;
   }

   public void rf25I2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(27) ;
      /* Execute user event: Refresh */
      e1625I2 ();
      nGXsfl_27_idx = 1 ;
      sGXsfl_27_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_27_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_272( ) ;
      bGXsfl_27_Refreshing = true ;
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
         subsflControlProps_272( ) ;
         pr_default.dynParam(1, new Object[]{ new Object[]{
                                              AV90TFBarNHdr_Sel ,
                                              AV89TFBarNHdr ,
                                              AV102TFMaqCod_Sel ,
                                              AV101TFMaqCod ,
                                              AV103TFHisProFec ,
                                              AV105TFHisProKgr ,
                                              AV106TFHisProKgr_To ,
                                              AV107TFHisProMtr ,
                                              AV108TFHisProMtr_To ,
                                              Byte.valueOf(AV109TFHisProTur) ,
                                              Byte.valueOf(AV110TFHisProTur_To) ,
                                              AV94TFHisProF_Sel ,
                                              AV93TFHisProF ,
                                              AV111TFHisProDTI ,
                                              AV113TFHisProDTF ,
                                              AV92TFCliNom_Sel ,
                                              AV91TFCliNom ,
                                              AV54TFBarSer_Sel ,
                                              AV53TFBarSer ,
                                              AV86TFBarColNom_Sel ,
                                              AV85TFBarColNom ,
                                              Integer.valueOf(AV87TFBarColNum) ,
                                              Integer.valueOf(AV88TFBarColNum_To) ,
                                              AV118TFFase_Sel ,
                                              AV117TFFase ,
                                              Short.valueOf(AV99TFBarTipArt) ,
                                              Short.valueOf(AV100TFBarTipArt_To) ,
                                              Short.valueOf(AV121TFHisProTip) ,
                                              Short.valueOf(AV122TFHisProTip_To) ,
                                              Byte.valueOf(AV123TFHisProTc) ,
                                              Byte.valueOf(AV124TFHisProTc_To) ,
                                              AV46TFHisProDf ,
                                              Short.valueOf(AV37TFParCod) ,
                                              Short.valueOf(AV38TFParCod_To) ,
                                              AV40TFParCodNom_Sel ,
                                              AV39TFParCodNom ,
                                              Byte.valueOf(AV16INHisEstReo) ,
                                              Integer.valueOf(AV125OperarioFrom) ,
                                              Integer.valueOf(AV126OperarioTo) ,
                                              Integer.valueOf(A129BarCod) ,
                                              Byte.valueOf(A132BarCodReo) ,
                                              A130BarCodPar ,
                                              A602MaqCod ,
                                              A558HisProFec ,
                                              A1525HisProKgr ,
                                              A1526HisProMtr ,
                                              Byte.valueOf(A566HisProTur) ,
                                              A557HisProF ,
                                              A4440HisProDTI ,
                                              A4441HisProDTF ,
                                              A279CliNom ,
                                              A212BarSer ,
                                              A135BarColNom ,
                                              Integer.valueOf(A136BarColNum) ,
                                              A461Fase ,
                                              Short.valueOf(A217BarTipArt) ,
                                              Short.valueOf(A2247HisProTip) ,
                                              Byte.valueOf(A3611HisProTc) ,
                                              A5608HisProDf ,
                                              Short.valueOf(A656ParCod) ,
                                              A867ParCodNom ,
                                              Byte.valueOf(A3612HisProReo) ,
                                              Integer.valueOf(A503GruOpeCod) ,
                                              Short.valueOf(AV21OrderedBy) ,
                                              Boolean.valueOf(AV22OrderedDsc) ,
                                              AV120TFFaseDescripcion_Sel ,
                                              AV119TFFaseDescripcion ,
                                              A13893FaseDescri ,
                                              AV17INHisProFec1 ,
                                              AV18INHisProFec2 ,
                                              AV15INEmprcod ,
                                              AV19INMaqCod1 ,
                                              A396EmprCod ,
                                              AV20INMaqCod2 } ,
                                              new int[]{
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BYTE,
                                              TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.BYTE,
                                              TypeConstants.BYTE, TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT,
                                              TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.BOOLEAN,
                                              TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.SHORT,
                                              TypeConstants.BYTE, TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.BOOLEAN,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                              }
         });
         lV89TFBarNHdr = GXutil.padr( GXutil.rtrim( AV89TFBarNHdr), 11, "%") ;
         lV101TFMaqCod = GXutil.padr( GXutil.rtrim( AV101TFMaqCod), 6, "%") ;
         lV93TFHisProF = GXutil.padr( GXutil.rtrim( AV93TFHisProF), 1, "%") ;
         lV91TFCliNom = GXutil.padr( GXutil.rtrim( AV91TFCliNom), 30, "%") ;
         lV53TFBarSer = GXutil.padr( GXutil.rtrim( AV53TFBarSer), 16, "%") ;
         lV85TFBarColNom = GXutil.padr( GXutil.rtrim( AV85TFBarColNom), 13, "%") ;
         lV117TFFase = GXutil.padr( GXutil.rtrim( AV117TFFase), 8, "%") ;
         lV39TFParCodNom = GXutil.padr( GXutil.rtrim( AV39TFParCodNom), 30, "%") ;
         /* Using cursor H025I3 */
         pr_default.execute(1, new Object[] {AV15INEmprcod, AV19INMaqCod1, AV17INHisProFec1, AV18INHisProFec2, AV20INMaqCod2, lV89TFBarNHdr, AV90TFBarNHdr_Sel, lV101TFMaqCod, AV102TFMaqCod_Sel, AV103TFHisProFec, AV105TFHisProKgr, AV106TFHisProKgr_To, AV107TFHisProMtr, AV108TFHisProMtr_To, Byte.valueOf(AV109TFHisProTur), Byte.valueOf(AV110TFHisProTur_To), lV93TFHisProF, AV94TFHisProF_Sel, AV111TFHisProDTI, AV113TFHisProDTF, lV91TFCliNom, AV92TFCliNom_Sel, lV53TFBarSer, AV54TFBarSer_Sel, lV85TFBarColNom, AV86TFBarColNom_Sel, Integer.valueOf(AV87TFBarColNum), Integer.valueOf(AV88TFBarColNum_To), lV117TFFase, AV118TFFase_Sel, Short.valueOf(AV99TFBarTipArt), Short.valueOf(AV100TFBarTipArt_To), Short.valueOf(AV121TFHisProTip), Short.valueOf(AV122TFHisProTip_To), Byte.valueOf(AV123TFHisProTc), Byte.valueOf(AV124TFHisProTc_To), AV46TFHisProDf, Short.valueOf(AV37TFParCod), Short.valueOf(AV38TFParCod_To), lV39TFParCodNom, AV40TFParCodNom_Sel, Byte.valueOf(AV16INHisEstReo), Integer.valueOf(AV125OperarioFrom), Integer.valueOf(AV126OperarioTo)});
         nGXsfl_27_idx = 1 ;
         sGXsfl_27_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_27_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_272( ) ;
         GRID_nEOF = (byte)(0) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         while ( ( (pr_default.getStatus(1) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A3612HisProReo = H025I3_A3612HisProReo[0] ;
            A252CliCod = H025I3_A252CliCod[0] ;
            n252CliCod = H025I3_n252CliCod[0] ;
            A833TipDefCod = H025I3_A833TipDefCod[0] ;
            n833TipDefCod = H025I3_n833TipDefCod[0] ;
            A148BarEstReo = H025I3_A148BarEstReo[0] ;
            A834TipDefDsc = H025I3_A834TipDefDsc[0] ;
            n834TipDefDsc = H025I3_n834TipDefDsc[0] ;
            A6680HisproTdab = H025I3_A6680HisproTdab[0] ;
            A556HisProEst = H025I3_A556HisProEst[0] ;
            A3610HisProLot = H025I3_A3610HisProLot[0] ;
            A218BarTipCol = H025I3_A218BarTipCol[0] ;
            A867ParCodNom = H025I3_A867ParCodNom[0] ;
            n867ParCodNom = H025I3_n867ParCodNom[0] ;
            A656ParCod = H025I3_A656ParCod[0] ;
            n656ParCod = H025I3_n656ParCod[0] ;
            A5608HisProDf = H025I3_A5608HisProDf[0] ;
            A3611HisProTc = H025I3_A3611HisProTc[0] ;
            A2247HisProTip = H025I3_A2247HisProTip[0] ;
            A217BarTipArt = H025I3_A217BarTipArt[0] ;
            n217BarTipArt = H025I3_n217BarTipArt[0] ;
            A136BarColNum = H025I3_A136BarColNum[0] ;
            A135BarColNom = H025I3_A135BarColNom[0] ;
            A212BarSer = H025I3_A212BarSer[0] ;
            A279CliNom = H025I3_A279CliNom[0] ;
            A557HisProF = H025I3_A557HisProF[0] ;
            A566HisProTur = H025I3_A566HisProTur[0] ;
            A1526HisProMtr = H025I3_A1526HisProMtr[0] ;
            A1525HisProKgr = H025I3_A1525HisProKgr[0] ;
            A561HisProLin = H025I3_A561HisProLin[0] ;
            A558HisProFec = H025I3_A558HisProFec[0] ;
            A602MaqCod = H025I3_A602MaqCod[0] ;
            A130BarCodPar = H025I3_A130BarCodPar[0] ;
            A132BarCodReo = H025I3_A132BarCodReo[0] ;
            A129BarCod = H025I3_A129BarCod[0] ;
            A503GruOpeCod = H025I3_A503GruOpeCod[0] ;
            A461Fase = H025I3_A461Fase[0] ;
            A396EmprCod = H025I3_A396EmprCod[0] ;
            A4440HisProDTI = H025I3_A4440HisProDTI[0] ;
            n4440HisProDTI = H025I3_n4440HisProDTI[0] ;
            A4441HisProDTF = H025I3_A4441HisProDTF[0] ;
            n4441HisProDTF = H025I3_n4441HisProDTF[0] ;
            A252CliCod = H025I3_A252CliCod[0] ;
            n252CliCod = H025I3_n252CliCod[0] ;
            A833TipDefCod = H025I3_A833TipDefCod[0] ;
            n833TipDefCod = H025I3_n833TipDefCod[0] ;
            A148BarEstReo = H025I3_A148BarEstReo[0] ;
            A218BarTipCol = H025I3_A218BarTipCol[0] ;
            A217BarTipArt = H025I3_A217BarTipArt[0] ;
            n217BarTipArt = H025I3_n217BarTipArt[0] ;
            A136BarColNum = H025I3_A136BarColNum[0] ;
            A135BarColNom = H025I3_A135BarColNom[0] ;
            A212BarSer = H025I3_A212BarSer[0] ;
            A279CliNom = H025I3_A279CliNom[0] ;
            A834TipDefDsc = H025I3_A834TipDefDsc[0] ;
            n834TipDefDsc = H025I3_n834TipDefDsc[0] ;
            A867ParCodNom = H025I3_A867ParCodNom[0] ;
            n867ParCodNom = H025I3_n867ParCodNom[0] ;
            if ( ! GXutil.dateCompare(GXutil.nullDate(), A4441HisProDTF) && A4441HisProDTF.after( A4440HisProDTI ) && ( ( GXutil.dtdiff( A4441HisProDTF, A4440HisProDTI) / (double) ( 60 ) ) <= 9999 ) )
            {
               A5605HisProTr2 = (short)(DecimalUtil.decToDouble(GXutil.roundDecimal( DecimalUtil.doubleToDec(GXutil.dtdiff( A4441HisProDTF, A4440HisProDTI)/ (double) (60)), 0))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A5605HisProTr2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5605HisProTr2), 4, 0));
            }
            else
            {
               A5605HisProTr2 = (short)(0) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A5605HisProTr2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5605HisProTr2), 4, 0));
            }
            GXt_char1 = A13892GruOpeCodN ;
            GXv_char2[0] = GXt_char1 ;
            new app.popenom(remoteHandle, context).execute( A396EmprCod, A503GruOpeCod, GXv_char2) ;
            informeproduccionresumenhdr_wc1_impl.this.GXt_char1 = GXv_char2[0] ;
            A13892GruOpeCodN = GXt_char1 ;
            GXt_char1 = A13893FaseDescri ;
            GXv_char2[0] = GXt_char1 ;
            new app.pfasdsc(remoteHandle, context).execute( A396EmprCod, A461Fase, GXv_char2) ;
            informeproduccionresumenhdr_wc1_impl.this.GXt_char1 = GXv_char2[0] ;
            A13893FaseDescri = GXt_char1 ;
            if ( ! ( (GXutil.strcmp("", AV120TFFaseDescripcion_Sel)==0) && ( ! (GXutil.strcmp("", AV119TFFaseDescripcion)==0) ) ) || ( GXutil.like( GXutil.upper( A13893FaseDescri) , GXutil.padr( "%" + GXutil.upper( AV119TFFaseDescripcion) , 255 , "%"),  ' ' ) ) )
            {
               if ( (GXutil.strcmp("", AV120TFFaseDescripcion_Sel)==0) || ( ( GXutil.strcmp(A13893FaseDescri, AV120TFFaseDescripcion_Sel) == 0 ) ) )
               {
                  A13696BarNHdr = GXutil.trim( GXutil.str( A129BarCod, 8, 0)) + "-" + GXutil.trim( GXutil.str( A132BarCodReo, 1, 0)) + A130BarCodPar ;
                  e1725I2 ();
               }
            }
            pr_default.readNext(1);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(1) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(1);
         wbEnd = (short)(27) ;
         wb25I0( ) ;
      }
      bGXsfl_27_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes25I2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOTHISPROKGR", GXutil.ltrim( localUtil.ntoc( AV95TotHisProKgr, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTHISPROKGR", getSecureSignedToken( sPrefix, localUtil.format( AV95TotHisProKgr, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOTHISPROMTR", GXutil.ltrim( localUtil.ntoc( AV96TotHisProMtr, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTHISPROMTR", getSecureSignedToken( sPrefix, localUtil.format( AV96TotHisProMtr, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vMATDSC"+"_"+sGXsfl_27_idx, getSecureSignedToken( sPrefix+sGXsfl_27_idx, GXutil.rtrim( localUtil.format( AV82MatDsc, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vMATCOD"+"_"+sGXsfl_27_idx, getSecureSignedToken( sPrefix+sGXsfl_27_idx, localUtil.format( DecimalUtil.doubleToDec(AV81MatCod), "ZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vFECHADT", localUtil.ttoc( AV79fechadt, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vFECHADT", getSecureSignedToken( sPrefix, localUtil.format( AV79fechadt, "99/99/99 99:99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vFASDIVTIME", GXutil.rtrim( AV30FasDivTime));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vFASDIVTIME", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV30FasDivTime, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMINUTOSTOTAL", GXutil.ltrim( localUtil.ntoc( AV129MinutosTotal, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vMINUTOSTOTAL", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV129MinutosTotal), "ZZZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTIEMPOM", GXutil.ltrim( localUtil.ntoc( AV133tiempom, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTIEMPOM", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV133tiempom), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vEMPRCOD", GXutil.rtrim( AV6EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vEMPRCOD", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV6EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vFASCOD", GXutil.rtrim( AV57FasCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vFASCOD", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV57FasCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARCOD", GXutil.ltrim( localUtil.ntoc( AV61BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vBARCOD", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV61BarCod), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARCODREO", GXutil.ltrim( localUtil.ntoc( AV62BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vBARCODREO", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV62BarCodReo), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARCODPAR", GXutil.rtrim( AV63BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vBARCODPAR", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV63BarCodPar, ""))));
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
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV15INEmprcod, AV16INHisEstReo, AV19INMaqCod1, AV20INMaqCod2, AV17INHisProFec1, AV18INHisProFec2, AV125OperarioFrom, AV126OperarioTo, AV140Pgmname, AV21OrderedBy, AV22OrderedDsc, AV89TFBarNHdr, AV90TFBarNHdr_Sel, AV101TFMaqCod, AV102TFMaqCod_Sel, AV103TFHisProFec, AV105TFHisProKgr, AV106TFHisProKgr_To, AV107TFHisProMtr, AV108TFHisProMtr_To, AV109TFHisProTur, AV110TFHisProTur_To, AV93TFHisProF, AV94TFHisProF_Sel, AV111TFHisProDTI, AV113TFHisProDTF, AV91TFCliNom, AV92TFCliNom_Sel, AV53TFBarSer, AV54TFBarSer_Sel, AV85TFBarColNom, AV86TFBarColNom_Sel, AV87TFBarColNum, AV88TFBarColNum_To, AV117TFFase, AV118TFFase_Sel, AV119TFFaseDescripcion, AV120TFFaseDescripcion_Sel, AV99TFBarTipArt, AV100TFBarTipArt_To, AV121TFHisProTip, AV122TFHisProTip_To, AV123TFHisProTc, AV124TFHisProTc_To, AV46TFHisProDf, AV37TFParCod, AV38TFParCod_To, AV39TFParCodNom, AV40TFParCodNom_Sel, AV95TotHisProKgr, AV96TotHisProMtr, AV82MatDsc, AV81MatCod, AV79fechadt, A2316BarAgrLot, AV30FasDivTime, AV129MinutosTotal, AV133tiempom, A457FasCod, AV6EmprCod, AV57FasCod, A14054FasDivTime, A1933BarCodTin, A1934BarReoTin, A1935BarParTin, AV61BarCod, AV62BarCodReo, AV63BarCodPar, A1945BarMaqTin, A8563BarKgsTt, A1947BarKgmTin, A3705BarCosCol, A3658BarCosPA, A3654BarCosPD, A3657BarCosAA, A3656BarCosAD, A3706BarCosAnc, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      if ( GRID_nEOF == 0 )
      {
         GRID_nFirstRecordOnPage = (long)(GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )) ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("GRID_nFirstRecordOnPage", GRID_nFirstRecordOnPage);
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV15INEmprcod, AV16INHisEstReo, AV19INMaqCod1, AV20INMaqCod2, AV17INHisProFec1, AV18INHisProFec2, AV125OperarioFrom, AV126OperarioTo, AV140Pgmname, AV21OrderedBy, AV22OrderedDsc, AV89TFBarNHdr, AV90TFBarNHdr_Sel, AV101TFMaqCod, AV102TFMaqCod_Sel, AV103TFHisProFec, AV105TFHisProKgr, AV106TFHisProKgr_To, AV107TFHisProMtr, AV108TFHisProMtr_To, AV109TFHisProTur, AV110TFHisProTur_To, AV93TFHisProF, AV94TFHisProF_Sel, AV111TFHisProDTI, AV113TFHisProDTF, AV91TFCliNom, AV92TFCliNom_Sel, AV53TFBarSer, AV54TFBarSer_Sel, AV85TFBarColNom, AV86TFBarColNom_Sel, AV87TFBarColNum, AV88TFBarColNum_To, AV117TFFase, AV118TFFase_Sel, AV119TFFaseDescripcion, AV120TFFaseDescripcion_Sel, AV99TFBarTipArt, AV100TFBarTipArt_To, AV121TFHisProTip, AV122TFHisProTip_To, AV123TFHisProTc, AV124TFHisProTc_To, AV46TFHisProDf, AV37TFParCod, AV38TFParCod_To, AV39TFParCodNom, AV40TFParCodNom_Sel, AV95TotHisProKgr, AV96TotHisProMtr, AV82MatDsc, AV81MatCod, AV79fechadt, A2316BarAgrLot, AV30FasDivTime, AV129MinutosTotal, AV133tiempom, A457FasCod, AV6EmprCod, AV57FasCod, A14054FasDivTime, A1933BarCodTin, A1934BarReoTin, A1935BarParTin, AV61BarCod, AV62BarCodReo, AV63BarCodPar, A1945BarMaqTin, A8563BarKgsTt, A1947BarKgmTin, A3705BarCosCol, A3658BarCosPA, A3654BarCosPD, A3657BarCosAA, A3656BarCosAD, A3706BarCosAnc, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid_previouspage( )
   {
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
         gxgrgrid_refresh( subGrid_Rows, AV15INEmprcod, AV16INHisEstReo, AV19INMaqCod1, AV20INMaqCod2, AV17INHisProFec1, AV18INHisProFec2, AV125OperarioFrom, AV126OperarioTo, AV140Pgmname, AV21OrderedBy, AV22OrderedDsc, AV89TFBarNHdr, AV90TFBarNHdr_Sel, AV101TFMaqCod, AV102TFMaqCod_Sel, AV103TFHisProFec, AV105TFHisProKgr, AV106TFHisProKgr_To, AV107TFHisProMtr, AV108TFHisProMtr_To, AV109TFHisProTur, AV110TFHisProTur_To, AV93TFHisProF, AV94TFHisProF_Sel, AV111TFHisProDTI, AV113TFHisProDTF, AV91TFCliNom, AV92TFCliNom_Sel, AV53TFBarSer, AV54TFBarSer_Sel, AV85TFBarColNom, AV86TFBarColNom_Sel, AV87TFBarColNum, AV88TFBarColNum_To, AV117TFFase, AV118TFFase_Sel, AV119TFFaseDescripcion, AV120TFFaseDescripcion_Sel, AV99TFBarTipArt, AV100TFBarTipArt_To, AV121TFHisProTip, AV122TFHisProTip_To, AV123TFHisProTc, AV124TFHisProTc_To, AV46TFHisProDf, AV37TFParCod, AV38TFParCod_To, AV39TFParCodNom, AV40TFParCodNom_Sel, AV95TotHisProKgr, AV96TotHisProMtr, AV82MatDsc, AV81MatCod, AV79fechadt, A2316BarAgrLot, AV30FasDivTime, AV129MinutosTotal, AV133tiempom, A457FasCod, AV6EmprCod, AV57FasCod, A14054FasDivTime, A1933BarCodTin, A1934BarReoTin, A1935BarParTin, AV61BarCod, AV62BarCodReo, AV63BarCodPar, A1945BarMaqTin, A8563BarKgsTt, A1947BarKgmTin, A3705BarCosCol, A3658BarCosPA, A3654BarCosPD, A3657BarCosAA, A3656BarCosAD, A3706BarCosAnc, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
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
         gxgrgrid_refresh( subGrid_Rows, AV15INEmprcod, AV16INHisEstReo, AV19INMaqCod1, AV20INMaqCod2, AV17INHisProFec1, AV18INHisProFec2, AV125OperarioFrom, AV126OperarioTo, AV140Pgmname, AV21OrderedBy, AV22OrderedDsc, AV89TFBarNHdr, AV90TFBarNHdr_Sel, AV101TFMaqCod, AV102TFMaqCod_Sel, AV103TFHisProFec, AV105TFHisProKgr, AV106TFHisProKgr_To, AV107TFHisProMtr, AV108TFHisProMtr_To, AV109TFHisProTur, AV110TFHisProTur_To, AV93TFHisProF, AV94TFHisProF_Sel, AV111TFHisProDTI, AV113TFHisProDTF, AV91TFCliNom, AV92TFCliNom_Sel, AV53TFBarSer, AV54TFBarSer_Sel, AV85TFBarColNom, AV86TFBarColNom_Sel, AV87TFBarColNum, AV88TFBarColNum_To, AV117TFFase, AV118TFFase_Sel, AV119TFFaseDescripcion, AV120TFFaseDescripcion_Sel, AV99TFBarTipArt, AV100TFBarTipArt_To, AV121TFHisProTip, AV122TFHisProTip_To, AV123TFHisProTc, AV124TFHisProTc_To, AV46TFHisProDf, AV37TFParCod, AV38TFParCod_To, AV39TFParCodNom, AV40TFParCodNom_Sel, AV95TotHisProKgr, AV96TotHisProMtr, AV82MatDsc, AV81MatCod, AV79fechadt, A2316BarAgrLot, AV30FasDivTime, AV129MinutosTotal, AV133tiempom, A457FasCod, AV6EmprCod, AV57FasCod, A14054FasDivTime, A1933BarCodTin, A1934BarReoTin, A1935BarParTin, AV61BarCod, AV62BarCodReo, AV63BarCodPar, A1945BarMaqTin, A8563BarKgsTt, A1947BarKgmTin, A3705BarCosCol, A3658BarCosPA, A3654BarCosPD, A3657BarCosAA, A3656BarCosAD, A3706BarCosAnc, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid_gotopage( int nPageNo )
   {
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
         gxgrgrid_refresh( subGrid_Rows, AV15INEmprcod, AV16INHisEstReo, AV19INMaqCod1, AV20INMaqCod2, AV17INHisProFec1, AV18INHisProFec2, AV125OperarioFrom, AV126OperarioTo, AV140Pgmname, AV21OrderedBy, AV22OrderedDsc, AV89TFBarNHdr, AV90TFBarNHdr_Sel, AV101TFMaqCod, AV102TFMaqCod_Sel, AV103TFHisProFec, AV105TFHisProKgr, AV106TFHisProKgr_To, AV107TFHisProMtr, AV108TFHisProMtr_To, AV109TFHisProTur, AV110TFHisProTur_To, AV93TFHisProF, AV94TFHisProF_Sel, AV111TFHisProDTI, AV113TFHisProDTF, AV91TFCliNom, AV92TFCliNom_Sel, AV53TFBarSer, AV54TFBarSer_Sel, AV85TFBarColNom, AV86TFBarColNom_Sel, AV87TFBarColNum, AV88TFBarColNum_To, AV117TFFase, AV118TFFase_Sel, AV119TFFaseDescripcion, AV120TFFaseDescripcion_Sel, AV99TFBarTipArt, AV100TFBarTipArt_To, AV121TFHisProTip, AV122TFHisProTip_To, AV123TFHisProTc, AV124TFHisProTc_To, AV46TFHisProDf, AV37TFParCod, AV38TFParCod_To, AV39TFParCodNom, AV40TFParCodNom_Sel, AV95TotHisProKgr, AV96TotHisProMtr, AV82MatDsc, AV81MatCod, AV79fechadt, A2316BarAgrLot, AV30FasDivTime, AV129MinutosTotal, AV133tiempom, A457FasCod, AV6EmprCod, AV57FasCod, A14054FasDivTime, A1933BarCodTin, A1934BarReoTin, A1935BarParTin, AV61BarCod, AV62BarCodReo, AV63BarCodPar, A1945BarMaqTin, A8563BarKgsTt, A1947BarKgmTin, A3705BarCosCol, A3658BarCosPA, A3654BarCosPD, A3657BarCosAA, A3656BarCosAD, A3706BarCosAnc, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV140Pgmname = "Produccion.InformeProduccionResumenHdr_WC1" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV140Pgmname", AV140Pgmname);
      Gx_err = (short)(0) ;
      edtavHhmmalfa_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavHhmmalfa_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHhmmalfa_Enabled), 5, 0), !bGXsfl_27_Refreshing);
      edtavMatcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavMatcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMatcod_Enabled), 5, 0), !bGXsfl_27_Refreshing);
      edtavMatdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavMatdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMatdsc_Enabled), 5, 0), !bGXsfl_27_Refreshing);
      edtavFlagmarca_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavFlagmarca_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavFlagmarca_Enabled), 5, 0), !bGXsfl_27_Refreshing);
      edtavMinutos_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavMinutos_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMinutos_Enabled), 5, 0), !bGXsfl_27_Refreshing);
      chkavOp4.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, chkavOp4.getInternalname(), "Enabled", GXutil.ltrimstr( chkavOp4.getEnabled(), 5, 0), !bGXsfl_27_Refreshing);
      edtavTipartdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTipartdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTipartdsc_Enabled), 5, 0), !bGXsfl_27_Refreshing);
      edtavTipcoldsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTipcoldsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTipcoldsc_Enabled), 5, 0), !bGXsfl_27_Refreshing);
      edtavForrgb_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavForrgb_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavForrgb_Enabled), 5, 0), !bGXsfl_27_Refreshing);
      edtavR_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavR_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavR_Enabled), 5, 0), !bGXsfl_27_Refreshing);
      edtavG_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavG_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavG_Enabled), 5, 0), !bGXsfl_27_Refreshing);
      edtavB_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavB_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavB_Enabled), 5, 0), !bGXsfl_27_Refreshing);
      edtavTipdefcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTipdefcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTipdefcod_Enabled), 5, 0), !bGXsfl_27_Refreshing);
      edtavTipdefdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTipdefdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTipdefdsc_Enabled), 5, 0), !bGXsfl_27_Refreshing);
      edtavCostei_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCostei_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCostei_Enabled), 5, 0), !bGXsfl_27_Refreshing);
      edtavCostet_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCostet_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCostet_Enabled), 5, 0), !bGXsfl_27_Refreshing);
      edtavCostek_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCostek_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCostek_Enabled), 5, 0), !bGXsfl_27_Refreshing);
      edtavHdrp_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavHdrp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHdrp_Enabled), 5, 0), !bGXsfl_27_Refreshing);
      edtavBarkgmtin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBarkgmtin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarkgmtin_Enabled), 5, 0), !bGXsfl_27_Refreshing);
      edtavBarkgstt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBarkgstt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarkgstt_Enabled), 5, 0), !bGXsfl_27_Refreshing);
      edtavHisprotr2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavHisprotr2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHisprotr2_Enabled), 5, 0), !bGXsfl_27_Refreshing);
      edtavHorreaint_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavHorreaint_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHorreaint_Enabled), 5, 0), !bGXsfl_27_Refreshing);
      edtavMinrea_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavMinrea_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMinrea_Enabled), 5, 0), !bGXsfl_27_Refreshing);
      edtavTotvaluehisprokgr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvaluehisprokgr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluehisprokgr_Enabled), 5, 0), true);
      edtavTotvaluehispromtr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvaluehispromtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluehispromtr_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup25I0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e1525I2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vDDO_TITLESETTINGSICONS"), AV5DDO_TitleSettingsIcons);
         /* Read saved values. */
         nRC_GXsfl_27 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_27"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV10GridCurrentPage = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV11GridPageCount = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         wcpOAV15INEmprcod = httpContext.cgiGet( sPrefix+"wcpOAV15INEmprcod") ;
         wcpOAV16INHisEstReo = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV16INHisEstReo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV19INMaqCod1 = httpContext.cgiGet( sPrefix+"wcpOAV19INMaqCod1") ;
         wcpOAV20INMaqCod2 = httpContext.cgiGet( sPrefix+"wcpOAV20INMaqCod2") ;
         wcpOAV17INHisProFec1 = localUtil.ctot( httpContext.cgiGet( sPrefix+"wcpOAV17INHisProFec1"), 0) ;
         wcpOAV18INHisProFec2 = localUtil.ctot( httpContext.cgiGet( sPrefix+"wcpOAV18INHisProFec2"), 0) ;
         wcpOAV125OperarioFrom = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV125OperarioFrom"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV126OperarioTo = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV126OperarioTo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         GRID_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( sPrefix+"GRID_nFirstRecordOnPage"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         GRID_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRID_nEOF"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
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
         Ddo_grid_Sortedstatus = httpContext.cgiGet( sPrefix+"DDO_GRID_Sortedstatus") ;
         Ddo_grid_Includefilter = httpContext.cgiGet( sPrefix+"DDO_GRID_Includefilter") ;
         Ddo_grid_Filtertype = httpContext.cgiGet( sPrefix+"DDO_GRID_Filtertype") ;
         Ddo_grid_Filterisrange = httpContext.cgiGet( sPrefix+"DDO_GRID_Filterisrange") ;
         Ddo_grid_Includedatalist = httpContext.cgiGet( sPrefix+"DDO_GRID_Includedatalist") ;
         Ddo_grid_Datalisttype = httpContext.cgiGet( sPrefix+"DDO_GRID_Datalisttype") ;
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
         AV97TotValueHisProKgr = httpContext.cgiGet( edtavTotvaluehisprokgr_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV97TotValueHisProKgr", AV97TotValueHisProKgr);
         AV98TotValueHisProMtr = httpContext.cgiGet( edtavTotvaluehispromtr_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV98TotValueHisProMtr", AV98TotValueHisProMtr);
         AV140Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV140Pgmname", AV140Pgmname);
         if ( localUtil.vcdate( httpContext.cgiGet( edtavDdo_hisprofecauxdate_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vDDO_HISPROFECAUXDATE");
            GX_FocusControl = edtavDdo_hisprofecauxdate_Internalname ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV104DDO_HisProFecAuxDate = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV104DDO_HisProFecAuxDate", localUtil.format(AV104DDO_HisProFecAuxDate, "99/99/99"));
         }
         else
         {
            AV104DDO_HisProFecAuxDate = localUtil.ctod( httpContext.cgiGet( edtavDdo_hisprofecauxdate_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV104DDO_HisProFecAuxDate", localUtil.format(AV104DDO_HisProFecAuxDate, "99/99/99"));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavDdo_hisprodtiauxdate_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vDDO_HISPRODTIAUXDATE");
            GX_FocusControl = edtavDdo_hisprodtiauxdate_Internalname ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV112DDO_HisProDTIAuxDate = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV112DDO_HisProDTIAuxDate", localUtil.format(AV112DDO_HisProDTIAuxDate, "99/99/99"));
         }
         else
         {
            AV112DDO_HisProDTIAuxDate = localUtil.ctod( httpContext.cgiGet( edtavDdo_hisprodtiauxdate_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV112DDO_HisProDTIAuxDate", localUtil.format(AV112DDO_HisProDTIAuxDate, "99/99/99"));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavDdo_hisprodtfauxdate_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vDDO_HISPRODTFAUXDATE");
            GX_FocusControl = edtavDdo_hisprodtfauxdate_Internalname ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV114DDO_HisProDTFAuxDate = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV114DDO_HisProDTFAuxDate", localUtil.format(AV114DDO_HisProDTFAuxDate, "99/99/99"));
         }
         else
         {
            AV114DDO_HisProDTFAuxDate = localUtil.ctod( httpContext.cgiGet( edtavDdo_hisprodtfauxdate_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV114DDO_HisProDTFAuxDate", localUtil.format(AV114DDO_HisProDTFAuxDate, "99/99/99"));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavDdo_hisprodfauxdate_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vDDO_HISPRODFAUXDATE");
            GX_FocusControl = edtavDdo_hisprodfauxdate_Internalname ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV47DDO_HisProDfAuxDate = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47DDO_HisProDfAuxDate", localUtil.format(AV47DDO_HisProDfAuxDate, "99/99/99"));
         }
         else
         {
            AV47DDO_HisProDfAuxDate = localUtil.ctod( httpContext.cgiGet( edtavDdo_hisprodfauxdate_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47DDO_HisProDfAuxDate", localUtil.format(AV47DDO_HisProDfAuxDate, "99/99/99"));
         }
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"InformeProduccionResumenHdr_WC1");
         AV140Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV140Pgmname", AV140Pgmname);
         forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV140Pgmname, "")));
         hsh = httpContext.cgiGet( sPrefix+"hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("produccion\\informeproduccionresumenhdr_wc1:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
      e1525I2 ();
      if (returnInSub) return;
   }

   public void e1525I2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV25Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      informeproduccionresumenhdr_wc1_impl.this.GXt_char1 = GXv_char2[0] ;
      AV25Station = GXt_char1 ;
      GXv_char2[0] = AV6EmprCod ;
      GXv_char3[0] = AV7EmprNom ;
      GXv_char4[0] = AV27UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV25Station, GXv_char2, GXv_char3, GXv_char4) ;
      informeproduccionresumenhdr_wc1_impl.this.AV6EmprCod = GXv_char2[0] ;
      informeproduccionresumenhdr_wc1_impl.this.AV7EmprNom = GXv_char3[0] ;
      informeproduccionresumenhdr_wc1_impl.this.AV27UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6EmprCod", AV6EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vEMPRCOD", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV6EmprCod, "@!"))));
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
      if ( AV21OrderedBy < 1 )
      {
         AV21OrderedBy = (short)(1) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV21OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV21OrderedBy), 4, 0));
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S142 ();
         if (returnInSub) return;
      }
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = AV5DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] ;
      AV5DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, sPrefix, false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
      GXt_int7 = AV75Grulec ;
      GXv_int8[0] = GXt_int7 ;
      new app.pexicon(remoteHandle, context).execute( AV6EmprCod, httpContext.getMessage( "GRUHDR", ""), GXv_int8) ;
      informeproduccionresumenhdr_wc1_impl.this.GXt_int7 = GXv_int8[0] ;
      AV75Grulec = GXt_int7 ;
      GXt_int7 = AV76lecotex ;
      GXv_int8[0] = GXt_int7 ;
      new app.pexicon(remoteHandle, context).execute( AV6EmprCod, httpContext.getMessage( "LECOTE", ""), GXv_int8) ;
      informeproduccionresumenhdr_wc1_impl.this.GXt_int7 = GXv_int8[0] ;
      AV76lecotex = GXt_int7 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV76lecotex", GXutil.str( AV76lecotex, 1, 0));
      this.executeExternalObjectMethod(sPrefix, false, "GlobalEvents", "ProgressBar", new Object[] {Integer.valueOf(1),Integer.valueOf(100),Boolean.valueOf(false),httpContext.getMessage( "Iniciando Informe Produccion Resumen Hdr...", ""),httpContext.getMessage( "GXProgressBarDanger", "")}, true);
   }

   public void e1625I2( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
      GXv_SdtWWPContext9[0] = AV28WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext9) ;
      AV28WWPContext = GXv_SdtWWPContext9[0] ;
      /* Execute user subroutine: 'SAVEGRIDSTATE' */
      S152 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'INITIALIZETOTALIZERS' */
      S162 ();
      if (returnInSub) return;
      AV10GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV10GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV10GridCurrentPage), 10, 0));
      AV11GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV11GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV11GridPageCount), 10, 0));
      /* Execute user subroutine: 'CALCULATETOTALIZERS' */
      S172 ();
      if (returnInSub) return;
      /*  Sending Event outputs  */
   }

   public void e1125I2( )
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
         AV23PageToGo = (int)(GXutil.lval( Gridpaginationbar_Selectedpage)) ;
         subgrid_gotopage( AV23PageToGo) ;
      }
   }

   public void e1225I2( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   public void e1325I2( )
   {
      /* Ddo_grid_Onoptionclicked Routine */
      returnInSub = false ;
      if ( ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderASC#>") == 0 ) || ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>") == 0 ) )
      {
         AV21OrderedBy = (short)(GXutil.lval( Ddo_grid_Selectedvalue_get)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV21OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV21OrderedBy), 4, 0));
         AV22OrderedDsc = ((GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>")==0) ? true : false) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV22OrderedDsc", AV22OrderedDsc);
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S142 ();
         if (returnInSub) return;
         subgrid_firstpage( ) ;
      }
      else if ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#Filter#>") == 0 )
      {
         if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarNHdr") == 0 )
         {
            AV89TFBarNHdr = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV89TFBarNHdr", AV89TFBarNHdr);
            AV90TFBarNHdr_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV90TFBarNHdr_Sel", AV90TFBarNHdr_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "MaqCod") == 0 )
         {
            AV101TFMaqCod = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV101TFMaqCod", AV101TFMaqCod);
            AV102TFMaqCod_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV102TFMaqCod_Sel", AV102TFMaqCod_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "HisProFec") == 0 )
         {
            AV103TFHisProFec = localUtil.ctod( Ddo_grid_Filteredtext_get, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV103TFHisProFec", localUtil.format(AV103TFHisProFec, "99/99/99"));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "HisProKgr") == 0 )
         {
            AV105TFHisProKgr = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV105TFHisProKgr", GXutil.ltrimstr( AV105TFHisProKgr, 9, 2));
            AV106TFHisProKgr_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV106TFHisProKgr_To", GXutil.ltrimstr( AV106TFHisProKgr_To, 9, 2));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "HisProMtr") == 0 )
         {
            AV107TFHisProMtr = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV107TFHisProMtr", GXutil.ltrimstr( AV107TFHisProMtr, 9, 2));
            AV108TFHisProMtr_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV108TFHisProMtr_To", GXutil.ltrimstr( AV108TFHisProMtr_To, 9, 2));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "HisProTur") == 0 )
         {
            AV109TFHisProTur = (byte)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV109TFHisProTur", GXutil.str( AV109TFHisProTur, 1, 0));
            AV110TFHisProTur_To = (byte)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV110TFHisProTur_To", GXutil.str( AV110TFHisProTur_To, 1, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "HisProF") == 0 )
         {
            AV93TFHisProF = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV93TFHisProF", AV93TFHisProF);
            AV94TFHisProF_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV94TFHisProF_Sel", AV94TFHisProF_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "HisProDTI") == 0 )
         {
            AV111TFHisProDTI = localUtil.ctot( Ddo_grid_Filteredtext_get, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV111TFHisProDTI", localUtil.ttoc( AV111TFHisProDTI, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "HisProDTF") == 0 )
         {
            AV113TFHisProDTF = localUtil.ctot( Ddo_grid_Filteredtext_get, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV113TFHisProDTF", localUtil.ttoc( AV113TFHisProDTF, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "CliNom") == 0 )
         {
            AV91TFCliNom = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV91TFCliNom", AV91TFCliNom);
            AV92TFCliNom_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV92TFCliNom_Sel", AV92TFCliNom_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarSer") == 0 )
         {
            AV53TFBarSer = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV53TFBarSer", AV53TFBarSer);
            AV54TFBarSer_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV54TFBarSer_Sel", AV54TFBarSer_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarColNom") == 0 )
         {
            AV85TFBarColNom = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV85TFBarColNom", AV85TFBarColNom);
            AV86TFBarColNom_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV86TFBarColNom_Sel", AV86TFBarColNom_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarColNum") == 0 )
         {
            AV87TFBarColNum = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV87TFBarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV87TFBarColNum), 6, 0));
            AV88TFBarColNum_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV88TFBarColNum_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV88TFBarColNum_To), 6, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "Fase") == 0 )
         {
            AV117TFFase = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV117TFFase", AV117TFFase);
            AV118TFFase_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV118TFFase_Sel", AV118TFFase_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "FaseDescripcion") == 0 )
         {
            AV119TFFaseDescripcion = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV119TFFaseDescripcion", AV119TFFaseDescripcion);
            AV120TFFaseDescripcion_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV120TFFaseDescripcion_Sel", AV120TFFaseDescripcion_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarTipArt") == 0 )
         {
            AV99TFBarTipArt = (short)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV99TFBarTipArt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV99TFBarTipArt), 4, 0));
            AV100TFBarTipArt_To = (short)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV100TFBarTipArt_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV100TFBarTipArt_To), 4, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "HisProTip") == 0 )
         {
            AV121TFHisProTip = (short)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV121TFHisProTip", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV121TFHisProTip), 4, 0));
            AV122TFHisProTip_To = (short)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV122TFHisProTip_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV122TFHisProTip_To), 4, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "HisProTc") == 0 )
         {
            AV123TFHisProTc = (byte)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV123TFHisProTc", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV123TFHisProTc), 2, 0));
            AV124TFHisProTc_To = (byte)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV124TFHisProTc_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV124TFHisProTc_To), 2, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "HisProDf") == 0 )
         {
            AV46TFHisProDf = localUtil.ctod( Ddo_grid_Filteredtext_get, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV46TFHisProDf", localUtil.format(AV46TFHisProDf, "99/99/99"));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "ParCod") == 0 )
         {
            AV37TFParCod = (short)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37TFParCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV37TFParCod), 4, 0));
            AV38TFParCod_To = (short)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV38TFParCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV38TFParCod_To), 4, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "ParCodNom") == 0 )
         {
            AV39TFParCodNom = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV39TFParCodNom", AV39TFParCodNom);
            AV40TFParCodNom_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV40TFParCodNom_Sel", AV40TFParCodNom_Sel);
         }
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
   }

   private void e1725I2( )
   {
      if ( ( subGrid_Islastpage == 1 ) || ( subGrid_Rows == 0 ) || ( ( GRID_nCurrentRecord >= GRID_nFirstRecordOnPage ) && ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) ) ) )
      {
         /* Grid_Load Routine */
         returnInSub = false ;
         AV61BarCod = A129BarCod ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV61BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV61BarCod), 8, 0));
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vBARCOD", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV61BarCod), "ZZZZZZZ9")));
         AV62BarCodReo = A132BarCodReo ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV62BarCodReo", GXutil.str( AV62BarCodReo, 1, 0));
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vBARCODREO", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV62BarCodReo), "9")));
         AV63BarCodPar = A130BarCodPar ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV63BarCodPar", AV63BarCodPar);
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vBARCODPAR", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV63BarCodPar, ""))));
         GXv_char4[0] = A396EmprCod ;
         GXv_int10[0] = A252CliCod ;
         GXv_char3[0] = A212BarSer ;
         GXv_char2[0] = A135BarColNom ;
         GXv_int11[0] = A136BarColNum ;
         GXv_int8[0] = A218BarTipCol ;
         GXv_char12[0] = "" ;
         GXv_char13[0] = AV82MatDsc ;
         GXv_int14[0] = AV81MatCod ;
         GXv_int15[0] = (byte)(0) ;
         GXv_char16[0] = "" ;
         GXv_char17[0] = "" ;
         GXv_int18[0] = 0 ;
         GXv_char19[0] = "" ;
         GXv_char20[0] = "" ;
         GXv_int21[0] = (short)(0) ;
         GXv_char22[0] = "" ;
         GXv_char23[0] = "" ;
         GXv_int24[0] = 0 ;
         GXv_decimal25[0] = DecimalUtil.doubleToDec(0) ;
         GXv_dtime26[0] = AV79fechadt ;
         GXv_char27[0] = "" ;
         new app.pmasinf2(remoteHandle, context).execute( GXv_char4, GXv_int10, GXv_char3, GXv_char2, GXv_int11, GXv_int8, GXv_char12, GXv_char13, GXv_int14, GXv_int15, GXv_char16, GXv_char17, GXv_int18, GXv_char19, GXv_char20, GXv_int21, GXv_char22, GXv_char23, GXv_int24, GXv_decimal25, GXv_dtime26, GXv_char27) ;
         informeproduccionresumenhdr_wc1_impl.this.A396EmprCod = GXv_char4[0] ;
         informeproduccionresumenhdr_wc1_impl.this.A252CliCod = GXv_int10[0] ;
         informeproduccionresumenhdr_wc1_impl.this.A212BarSer = GXv_char3[0] ;
         informeproduccionresumenhdr_wc1_impl.this.A135BarColNom = GXv_char2[0] ;
         informeproduccionresumenhdr_wc1_impl.this.A136BarColNum = GXv_int11[0] ;
         informeproduccionresumenhdr_wc1_impl.this.A218BarTipCol = GXv_int8[0] ;
         informeproduccionresumenhdr_wc1_impl.this.AV82MatDsc = GXv_char13[0] ;
         informeproduccionresumenhdr_wc1_impl.this.AV81MatCod = GXv_int14[0] ;
         informeproduccionresumenhdr_wc1_impl.this.AV79fechadt = GXv_dtime26[0] ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavMatdsc_Internalname, AV82MatDsc);
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vMATDSC"+"_"+sGXsfl_27_idx, getSecureSignedToken( sPrefix+sGXsfl_27_idx, GXutil.rtrim( localUtil.format( AV82MatDsc, ""))));
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavMatcod_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV81MatCod), 3, 0));
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vMATCOD"+"_"+sGXsfl_27_idx, getSecureSignedToken( sPrefix+sGXsfl_27_idx, localUtil.format( DecimalUtil.doubleToDec(AV81MatCod), "ZZ9")));
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV79fechadt", localUtil.ttoc( AV79fechadt, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vFECHADT", getSecureSignedToken( sPrefix, localUtil.format( AV79fechadt, "99/99/99 99:99")));
         AV33HisProLot = GXutil.str( A129BarCod, 8, 0) + GXutil.str( A132BarCodReo, 1, 0) + A130BarCodPar ;
         AV80FlagMarca = (byte)(0) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavFlagmarca_Internalname, GXutil.str( AV80FlagMarca, 1, 0));
         AV80FlagMarca = (byte)(((GXutil.strcmp(A3610HisProLot, AV33HisProLot)==0) ? 1 : 0)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavFlagmarca_Internalname, GXutil.str( AV80FlagMarca, 1, 0));
         GXt_char1 = AV36TipArtDsc ;
         GXv_char27[0] = GXt_char1 ;
         new app.ptipartdsc(remoteHandle, context).execute( A396EmprCod, A2247HisProTip, GXv_char27) ;
         informeproduccionresumenhdr_wc1_impl.this.GXt_char1 = GXv_char27[0] ;
         AV36TipArtDsc = GXt_char1 ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavTipartdsc_Internalname, AV36TipArtDsc);
         GXt_char1 = AV44TipColDsc ;
         GXv_char27[0] = A396EmprCod ;
         GXv_int15[0] = A3611HisProTc ;
         GXv_char23[0] = GXt_char1 ;
         new app.pfcoldsc(remoteHandle, context).execute( GXv_char27, GXv_int15, GXv_char23) ;
         informeproduccionresumenhdr_wc1_impl.this.A396EmprCod = GXv_char27[0] ;
         informeproduccionresumenhdr_wc1_impl.this.A3611HisProTc = GXv_int15[0] ;
         informeproduccionresumenhdr_wc1_impl.this.GXt_char1 = GXv_char23[0] ;
         AV44TipColDsc = GXt_char1 ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavTipcoldsc_Internalname, AV44TipColDsc);
         GXt_int28 = AV45ForRGB ;
         GXv_char27[0] = A396EmprCod ;
         GXv_int24[0] = A252CliCod ;
         GXv_char23[0] = A212BarSer ;
         GXv_char22[0] = A135BarColNom ;
         GXv_int18[0] = A136BarColNum ;
         GXv_int15[0] = A218BarTipCol ;
         GXv_int29[0] = GXt_int28 ;
         new app.pbusrgb(remoteHandle, context).execute( GXv_char27, GXv_int24, GXv_char23, GXv_char22, GXv_int18, GXv_int15, GXv_int29) ;
         informeproduccionresumenhdr_wc1_impl.this.A396EmprCod = GXv_char27[0] ;
         informeproduccionresumenhdr_wc1_impl.this.A252CliCod = GXv_int24[0] ;
         informeproduccionresumenhdr_wc1_impl.this.A212BarSer = GXv_char23[0] ;
         informeproduccionresumenhdr_wc1_impl.this.A135BarColNom = GXv_char22[0] ;
         informeproduccionresumenhdr_wc1_impl.this.A136BarColNum = GXv_int18[0] ;
         informeproduccionresumenhdr_wc1_impl.this.A218BarTipCol = GXv_int15[0] ;
         informeproduccionresumenhdr_wc1_impl.this.GXt_int28 = GXv_int29[0] ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         AV45ForRGB = GXt_int28 ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavForrgb_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV45ForRGB), 10, 0));
         AV42TipDefCod = (short)(((A148BarEstReo==0) ? 0 : A833TipDefCod)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavTipdefcod_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV42TipDefCod), 4, 0));
         AV43TipDefDsc = ((A148BarEstReo==0) ? "" : A834TipDefDsc) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavTipdefdsc_Internalname, AV43TipDefDsc);
         AV59HdrP = GXutil.substring( A2316BarAgrLot, 1, 8) + "-" + GXutil.substring( A2316BarAgrLot, 9, 1) + GXutil.substring( A2316BarAgrLot, 10, 1) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavHdrp_Internalname, AV59HdrP);
         GXv_int29[0] = AV45ForRGB ;
         GXv_int21[0] = AV48R ;
         GXv_int14[0] = AV49G ;
         GXv_int30[0] = AV50B ;
         new app.pleorgb(remoteHandle, context).execute( GXv_int29, GXv_int21, GXv_int14, GXv_int30) ;
         informeproduccionresumenhdr_wc1_impl.this.AV45ForRGB = GXv_int29[0] ;
         informeproduccionresumenhdr_wc1_impl.this.AV48R = GXv_int21[0] ;
         informeproduccionresumenhdr_wc1_impl.this.AV49G = GXv_int14[0] ;
         informeproduccionresumenhdr_wc1_impl.this.AV50B = GXv_int30[0] ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavForrgb_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV45ForRGB), 10, 0));
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavR_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV48R), 3, 0));
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavG_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV49G), 3, 0));
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavB_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV50B), 3, 0));
         AV57FasCod = A461Fase ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV57FasCod", AV57FasCod);
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vFASCOD", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV57FasCod, "@!"))));
         /* Execute user subroutine: 'FASPRO' */
         S182 ();
         if (returnInSub) return;
         AV73HhMmAlfa = " " ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavHhmmalfa_Internalname, AV73HhMmAlfa);
         AV74Minutos = 0 ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavMinutos_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV74Minutos), 10, 0));
         AV67HisProTr2 = ((GXutil.strcmp(AV30FasDivTime, httpContext.getMessage( "S", ""))==0) ? A6680HisproTdab : A5605HisProTr2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavHisprotr2_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV67HisProTr2), 4, 0));
         AV68HorRea = (short)(0) ;
         AV69HorReaInt = (short)(0) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavHorreaint_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV69HorReaInt), 4, 0));
         AV70MinRea = (short)(0) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavMinrea_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV70MinRea), 4, 0));
         if ( A556HisProEst != 0 )
         {
            AV66HhMm = DecimalUtil.doubleToDec(AV67HisProTr2/ (double) (60)) ;
            AV68HorRea = (short)(AV67HisProTr2/ (double) (60)) ;
            AV69HorReaInt = (short)(GXutil.Int( AV68HorRea)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavHorreaint_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV69HorReaInt), 4, 0));
            AV70MinRea = (short)(AV67HisProTr2-(AV69HorReaInt*60)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavMinrea_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV70MinRea), 4, 0));
            AV71Mmalfa = GXutil.padl( GXutil.trim( GXutil.str( AV70MinRea, 2, 0)), (short)(2), "0") ;
            AV72hhalfa = GXutil.str( AV69HorReaInt, 4, 0) ;
            AV73HhMmAlfa = AV72hhalfa + ":" + AV71Mmalfa ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavHhmmalfa_Internalname, AV73HhMmAlfa);
            AV74Minutos = (long)((AV69HorReaInt*60)+AV70MinRea) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavMinutos_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV74Minutos), 10, 0));
            AV129MinutosTotal = (long)(AV129MinutosTotal+AV74Minutos) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV129MinutosTotal", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV129MinutosTotal), 10, 0));
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vMINUTOSTOTAL", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV129MinutosTotal), "ZZZZZZZZZ9")));
         }
         AV130Hrs = (byte)(AV129MinutosTotal/ (double) (3600)) ;
         AV131Min = (byte)(((int)((AV129MinutosTotal) % (3600)))/ (double) (60)) ;
         AV132Sec = (byte)(((int)((AV129MinutosTotal) % (60)))) ;
         AV133tiempom = (int)(AV133tiempom+(((GXutil.strcmp(AV30FasDivTime, httpContext.getMessage( "S", ""))==0) ? AV67HisProTr2 : ((AV80FlagMarca==1)&&(A556HisProEst!=0) ? AV67HisProTr2 : 0)))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV133tiempom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV133tiempom), 6, 0));
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTIEMPOM", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV133tiempom), "ZZZZZ9")));
         AV128TotValueHhMmAlfa = GXutil.format( "%1:%2:%3", localUtil.format( DecimalUtil.doubleToDec(AV130Hrs), "99"), localUtil.format( DecimalUtil.doubleToDec(AV131Min), "99"), localUtil.format( DecimalUtil.doubleToDec(AV132Sec), "Z9"), "", "", "", "", "", "") ;
         /* Execute user subroutine: 'COSTES' */
         S192 ();
         if (returnInSub) return;
         /* Load Method */
         if ( wbStart != -1 )
         {
            wbStart = (short)(27) ;
         }
         sendrow_272( ) ;
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
      if ( isFullAjaxMode( ) && ! bGXsfl_27_Refreshing )
      {
         httpContext.doAjaxLoad(27, GridRow);
      }
      /*  Sending Event outputs  */
   }

   public void e1425I2( )
   {
      /* 'DoButtonExcel' Routine */
      returnInSub = false ;
      GXv_char27[0] = AV9ExcelFilename ;
      GXv_char23[0] = AV8ErrorMessage ;
      new app.produccion.informeproduccionresumenhdr_usuwcexport(remoteHandle, context).execute( AV15INEmprcod, AV16INHisEstReo, AV19INMaqCod1, AV20INMaqCod2, AV17INHisProFec1, AV18INHisProFec2, GXv_char27, GXv_char23) ;
      informeproduccionresumenhdr_wc1_impl.this.AV9ExcelFilename = GXv_char27[0] ;
      informeproduccionresumenhdr_wc1_impl.this.AV8ErrorMessage = GXv_char23[0] ;
      if ( GXutil.strcmp(AV9ExcelFilename, "") != 0 )
      {
         callWebObject(formatLink(AV9ExcelFilename, new String[] {}, new String[] {}) );
         httpContext.wjLocDisableFrm = (byte)(0) ;
      }
      else
      {
         httpContext.GX_msglist.addItem(AV8ErrorMessage);
      }
   }

   public void S142( )
   {
      /* 'SETDDOSORTEDSTATUS' Routine */
      returnInSub = false ;
      Ddo_grid_Sortedstatus = GXutil.trim( GXutil.str( AV21OrderedBy, 4, 0))+":"+(AV22OrderedDsc ? "DSC" : "ASC") ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "SortedStatus", Ddo_grid_Sortedstatus);
   }

   public void S132( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV24Session.getValue(AV140Pgmname+"GridState"), "") == 0 )
      {
         AV12GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV140Pgmname+"GridState"), null, null);
      }
      else
      {
         AV12GridState.fromxml(AV24Session.getValue(AV140Pgmname+"GridState"), null, null);
      }
      AV21OrderedBy = AV12GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV21OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV21OrderedBy), 4, 0));
      AV22OrderedDsc = AV12GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV22OrderedDsc", AV22OrderedDsc);
      /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
      S142 ();
      if (returnInSub) return;
      AV141GXV1 = 1 ;
      while ( AV141GXV1 <= AV12GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV13GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV12GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV141GXV1));
         if ( GXutil.strcmp(AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNHDR") == 0 )
         {
            AV89TFBarNHdr = AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV89TFBarNHdr", AV89TFBarNHdr);
         }
         else if ( GXutil.strcmp(AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNHDR_SEL") == 0 )
         {
            AV90TFBarNHdr_Sel = AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV90TFBarNHdr_Sel", AV90TFBarNHdr_Sel);
         }
         else if ( GXutil.strcmp(AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQCOD") == 0 )
         {
            AV101TFMaqCod = AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV101TFMaqCod", AV101TFMaqCod);
         }
         else if ( GXutil.strcmp(AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQCOD_SEL") == 0 )
         {
            AV102TFMaqCod_Sel = AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV102TFMaqCod_Sel", AV102TFMaqCod_Sel);
         }
         else if ( GXutil.strcmp(AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPROFEC") == 0 )
         {
            AV103TFHisProFec = localUtil.ctod( AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV103TFHisProFec", localUtil.format(AV103TFHisProFec, "99/99/99"));
         }
         else if ( GXutil.strcmp(AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPROKGR") == 0 )
         {
            AV105TFHisProKgr = CommonUtil.decimalVal( AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV105TFHisProKgr", GXutil.ltrimstr( AV105TFHisProKgr, 9, 2));
            AV106TFHisProKgr_To = CommonUtil.decimalVal( AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV106TFHisProKgr_To", GXutil.ltrimstr( AV106TFHisProKgr_To, 9, 2));
         }
         else if ( GXutil.strcmp(AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPROMTR") == 0 )
         {
            AV107TFHisProMtr = CommonUtil.decimalVal( AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV107TFHisProMtr", GXutil.ltrimstr( AV107TFHisProMtr, 9, 2));
            AV108TFHisProMtr_To = CommonUtil.decimalVal( AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV108TFHisProMtr_To", GXutil.ltrimstr( AV108TFHisProMtr_To, 9, 2));
         }
         else if ( GXutil.strcmp(AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPROTUR") == 0 )
         {
            AV109TFHisProTur = (byte)(GXutil.lval( AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV109TFHisProTur", GXutil.str( AV109TFHisProTur, 1, 0));
            AV110TFHisProTur_To = (byte)(GXutil.lval( AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV110TFHisProTur_To", GXutil.str( AV110TFHisProTur_To, 1, 0));
         }
         else if ( GXutil.strcmp(AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPROF") == 0 )
         {
            AV93TFHisProF = AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV93TFHisProF", AV93TFHisProF);
         }
         else if ( GXutil.strcmp(AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPROF_SEL") == 0 )
         {
            AV94TFHisProF_Sel = AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV94TFHisProF_Sel", AV94TFHisProF_Sel);
         }
         else if ( GXutil.strcmp(AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPRODTI") == 0 )
         {
            AV111TFHisProDTI = localUtil.ctot( AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV111TFHisProDTI", localUtil.ttoc( AV111TFHisProDTI, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            AV112DDO_HisProDTIAuxDate = GXutil.resetTime(AV111TFHisProDTI) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV112DDO_HisProDTIAuxDate", localUtil.format(AV112DDO_HisProDTIAuxDate, "99/99/99"));
         }
         else if ( GXutil.strcmp(AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPRODTF") == 0 )
         {
            AV113TFHisProDTF = localUtil.ctot( AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV113TFHisProDTF", localUtil.ttoc( AV113TFHisProDTF, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            AV114DDO_HisProDTFAuxDate = GXutil.resetTime(AV113TFHisProDTF) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV114DDO_HisProDTFAuxDate", localUtil.format(AV114DDO_HisProDTFAuxDate, "99/99/99"));
         }
         else if ( GXutil.strcmp(AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV91TFCliNom = AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV91TFCliNom", AV91TFCliNom);
         }
         else if ( GXutil.strcmp(AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV92TFCliNom_Sel = AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV92TFCliNom_Sel", AV92TFCliNom_Sel);
         }
         else if ( GXutil.strcmp(AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSER") == 0 )
         {
            AV53TFBarSer = AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV53TFBarSer", AV53TFBarSer);
         }
         else if ( GXutil.strcmp(AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSER_SEL") == 0 )
         {
            AV54TFBarSer_Sel = AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV54TFBarSer_Sel", AV54TFBarSer_Sel);
         }
         else if ( GXutil.strcmp(AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNOM") == 0 )
         {
            AV85TFBarColNom = AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV85TFBarColNom", AV85TFBarColNom);
         }
         else if ( GXutil.strcmp(AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNOM_SEL") == 0 )
         {
            AV86TFBarColNom_Sel = AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV86TFBarColNom_Sel", AV86TFBarColNom_Sel);
         }
         else if ( GXutil.strcmp(AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNUM") == 0 )
         {
            AV87TFBarColNum = (int)(GXutil.lval( AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV87TFBarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV87TFBarColNum), 6, 0));
            AV88TFBarColNum_To = (int)(GXutil.lval( AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV88TFBarColNum_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV88TFBarColNum_To), 6, 0));
         }
         else if ( GXutil.strcmp(AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASE") == 0 )
         {
            AV117TFFase = AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV117TFFase", AV117TFFase);
         }
         else if ( GXutil.strcmp(AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASE_SEL") == 0 )
         {
            AV118TFFase_Sel = AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV118TFFase_Sel", AV118TFFase_Sel);
         }
         else if ( GXutil.strcmp(AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASEDESCRIPCION") == 0 )
         {
            AV119TFFaseDescripcion = AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV119TFFaseDescripcion", AV119TFFaseDescripcion);
         }
         else if ( GXutil.strcmp(AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASEDESCRIPCION_SEL") == 0 )
         {
            AV120TFFaseDescripcion_Sel = AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV120TFFaseDescripcion_Sel", AV120TFFaseDescripcion_Sel);
         }
         else if ( GXutil.strcmp(AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARTIPART") == 0 )
         {
            AV99TFBarTipArt = (short)(GXutil.lval( AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV99TFBarTipArt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV99TFBarTipArt), 4, 0));
            AV100TFBarTipArt_To = (short)(GXutil.lval( AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV100TFBarTipArt_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV100TFBarTipArt_To), 4, 0));
         }
         else if ( GXutil.strcmp(AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPROTIP") == 0 )
         {
            AV121TFHisProTip = (short)(GXutil.lval( AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV121TFHisProTip", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV121TFHisProTip), 4, 0));
            AV122TFHisProTip_To = (short)(GXutil.lval( AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV122TFHisProTip_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV122TFHisProTip_To), 4, 0));
         }
         else if ( GXutil.strcmp(AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPROTC") == 0 )
         {
            AV123TFHisProTc = (byte)(GXutil.lval( AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV123TFHisProTc", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV123TFHisProTc), 2, 0));
            AV124TFHisProTc_To = (byte)(GXutil.lval( AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV124TFHisProTc_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV124TFHisProTc_To), 2, 0));
         }
         else if ( GXutil.strcmp(AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPRODF") == 0 )
         {
            AV46TFHisProDf = localUtil.ctod( AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV46TFHisProDf", localUtil.format(AV46TFHisProDf, "99/99/99"));
         }
         else if ( GXutil.strcmp(AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPARCOD") == 0 )
         {
            AV37TFParCod = (short)(GXutil.lval( AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37TFParCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV37TFParCod), 4, 0));
            AV38TFParCod_To = (short)(GXutil.lval( AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV38TFParCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV38TFParCod_To), 4, 0));
         }
         else if ( GXutil.strcmp(AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPARCODNOM") == 0 )
         {
            AV39TFParCodNom = AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV39TFParCodNom", AV39TFParCodNom);
         }
         else if ( GXutil.strcmp(AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPARCODNOM_SEL") == 0 )
         {
            AV40TFParCodNom_Sel = AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV40TFParCodNom_Sel", AV40TFParCodNom_Sel);
         }
         AV141GXV1 = (int)(AV141GXV1+1) ;
      }
      GXt_char1 = "" ;
      GXv_char27[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV90TFBarNHdr_Sel)==0), AV90TFBarNHdr_Sel, GXv_char27) ;
      informeproduccionresumenhdr_wc1_impl.this.GXt_char1 = GXv_char27[0] ;
      GXt_char31 = "" ;
      GXv_char23[0] = GXt_char31 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV102TFMaqCod_Sel)==0), AV102TFMaqCod_Sel, GXv_char23) ;
      informeproduccionresumenhdr_wc1_impl.this.GXt_char31 = GXv_char23[0] ;
      GXt_char32 = "" ;
      GXv_char22[0] = GXt_char32 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV94TFHisProF_Sel)==0), AV94TFHisProF_Sel, GXv_char22) ;
      informeproduccionresumenhdr_wc1_impl.this.GXt_char32 = GXv_char22[0] ;
      GXt_char33 = "" ;
      GXv_char20[0] = GXt_char33 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV92TFCliNom_Sel)==0), AV92TFCliNom_Sel, GXv_char20) ;
      informeproduccionresumenhdr_wc1_impl.this.GXt_char33 = GXv_char20[0] ;
      GXt_char34 = "" ;
      GXv_char19[0] = GXt_char34 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV54TFBarSer_Sel)==0), AV54TFBarSer_Sel, GXv_char19) ;
      informeproduccionresumenhdr_wc1_impl.this.GXt_char34 = GXv_char19[0] ;
      GXt_char35 = "" ;
      GXv_char17[0] = GXt_char35 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV86TFBarColNom_Sel)==0), AV86TFBarColNom_Sel, GXv_char17) ;
      informeproduccionresumenhdr_wc1_impl.this.GXt_char35 = GXv_char17[0] ;
      GXt_char36 = "" ;
      GXv_char16[0] = GXt_char36 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV118TFFase_Sel)==0), AV118TFFase_Sel, GXv_char16) ;
      informeproduccionresumenhdr_wc1_impl.this.GXt_char36 = GXv_char16[0] ;
      GXt_char37 = "" ;
      GXv_char13[0] = GXt_char37 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV120TFFaseDescripcion_Sel)==0), AV120TFFaseDescripcion_Sel, GXv_char13) ;
      informeproduccionresumenhdr_wc1_impl.this.GXt_char37 = GXv_char13[0] ;
      GXt_char38 = "" ;
      GXv_char12[0] = GXt_char38 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV40TFParCodNom_Sel)==0), AV40TFParCodNom_Sel, GXv_char12) ;
      informeproduccionresumenhdr_wc1_impl.this.GXt_char38 = GXv_char12[0] ;
      Ddo_grid_Selectedvalue_set = GXt_char1+"|"+GXt_char31+"|||||"+GXt_char32+"|||"+GXt_char33+"|"+GXt_char34+"|"+GXt_char35+"|||"+GXt_char36+"|"+GXt_char37+"||||||"+GXt_char38 ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      GXt_char38 = "" ;
      GXv_char27[0] = GXt_char38 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV89TFBarNHdr)==0), AV89TFBarNHdr, GXv_char27) ;
      informeproduccionresumenhdr_wc1_impl.this.GXt_char38 = GXv_char27[0] ;
      GXt_char37 = "" ;
      GXv_char23[0] = GXt_char37 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV101TFMaqCod)==0), AV101TFMaqCod, GXv_char23) ;
      informeproduccionresumenhdr_wc1_impl.this.GXt_char37 = GXv_char23[0] ;
      GXt_char36 = "" ;
      GXv_char22[0] = GXt_char36 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV93TFHisProF)==0), AV93TFHisProF, GXv_char22) ;
      informeproduccionresumenhdr_wc1_impl.this.GXt_char36 = GXv_char22[0] ;
      GXt_char35 = "" ;
      GXv_char20[0] = GXt_char35 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV91TFCliNom)==0), AV91TFCliNom, GXv_char20) ;
      informeproduccionresumenhdr_wc1_impl.this.GXt_char35 = GXv_char20[0] ;
      GXt_char34 = "" ;
      GXv_char19[0] = GXt_char34 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV53TFBarSer)==0), AV53TFBarSer, GXv_char19) ;
      informeproduccionresumenhdr_wc1_impl.this.GXt_char34 = GXv_char19[0] ;
      GXt_char33 = "" ;
      GXv_char17[0] = GXt_char33 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV85TFBarColNom)==0), AV85TFBarColNom, GXv_char17) ;
      informeproduccionresumenhdr_wc1_impl.this.GXt_char33 = GXv_char17[0] ;
      GXt_char32 = "" ;
      GXv_char16[0] = GXt_char32 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV117TFFase)==0), AV117TFFase, GXv_char16) ;
      informeproduccionresumenhdr_wc1_impl.this.GXt_char32 = GXv_char16[0] ;
      GXt_char31 = "" ;
      GXv_char13[0] = GXt_char31 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV119TFFaseDescripcion)==0), AV119TFFaseDescripcion, GXv_char13) ;
      informeproduccionresumenhdr_wc1_impl.this.GXt_char31 = GXv_char13[0] ;
      GXt_char1 = "" ;
      GXv_char12[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV39TFParCodNom)==0), AV39TFParCodNom, GXv_char12) ;
      informeproduccionresumenhdr_wc1_impl.this.GXt_char1 = GXv_char12[0] ;
      Ddo_grid_Filteredtext_set = GXt_char38+"|"+GXt_char37+"|"+(GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV103TFHisProFec)) ? "" : localUtil.dtoc( AV103TFHisProFec, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV105TFHisProKgr)==0) ? "" : GXutil.str( AV105TFHisProKgr, 9, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV107TFHisProMtr)==0) ? "" : GXutil.str( AV107TFHisProMtr, 9, 2))+"|"+((0==AV109TFHisProTur) ? "" : GXutil.str( AV109TFHisProTur, 1, 0))+"|"+GXt_char36+"|"+(GXutil.dateCompare(GXutil.nullDate(), AV111TFHisProDTI) ? "" : localUtil.dtoc( AV112DDO_HisProDTIAuxDate, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"))+"|"+(GXutil.dateCompare(GXutil.nullDate(), AV113TFHisProDTF) ? "" : localUtil.dtoc( AV114DDO_HisProDTFAuxDate, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"))+"|"+GXt_char35+"|"+GXt_char34+"|"+GXt_char33+"|"+((0==AV87TFBarColNum) ? "" : GXutil.str( AV87TFBarColNum, 6, 0))+"||"+GXt_char32+"|"+GXt_char31+"|"+((0==AV99TFBarTipArt) ? "" : GXutil.str( AV99TFBarTipArt, 4, 0))+"|"+((0==AV121TFHisProTip) ? "" : GXutil.str( AV121TFHisProTip, 4, 0))+"|"+((0==AV123TFHisProTc) ? "" : GXutil.str( AV123TFHisProTc, 2, 0))+"|"+(GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV46TFHisProDf)) ? "" : localUtil.dtoc( AV46TFHisProDf, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"))+"|"+((0==AV37TFParCod) ? "" : GXutil.str( AV37TFParCod, 4, 0))+"|"+GXt_char1 ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = "|||"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV106TFHisProKgr_To)==0) ? "" : GXutil.str( AV106TFHisProKgr_To, 9, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV108TFHisProMtr_To)==0) ? "" : GXutil.str( AV108TFHisProMtr_To, 9, 2))+"|"+((0==AV110TFHisProTur_To) ? "" : GXutil.str( AV110TFHisProTur_To, 1, 0))+"|||||||"+((0==AV88TFBarColNum_To) ? "" : GXutil.str( AV88TFBarColNum_To, 6, 0))+"||||"+((0==AV100TFBarTipArt_To) ? "" : GXutil.str( AV100TFBarTipArt_To, 4, 0))+"|"+((0==AV122TFHisProTip_To) ? "" : GXutil.str( AV122TFHisProTip_To, 4, 0))+"|"+((0==AV124TFHisProTc_To) ? "" : GXutil.str( AV124TFHisProTc_To, 2, 0))+"||"+((0==AV38TFParCod_To) ? "" : GXutil.str( AV38TFParCod_To, 4, 0))+"|" ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
      if ( ! (GXutil.strcmp("", GXutil.trim( AV12GridState.getgxTv_SdtWWPGridState_Pagesize()))==0) )
      {
         subGrid_Rows = (int)(GXutil.lval( AV12GridState.getgxTv_SdtWWPGridState_Pagesize())) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      }
      subgrid_gotopage( AV12GridState.getgxTv_SdtWWPGridState_Currentpage()) ;
   }

   public void S152( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV12GridState.fromxml(AV24Session.getValue(AV140Pgmname+"GridState"), null, null);
      AV12GridState.setgxTv_SdtWWPGridState_Orderedby( AV21OrderedBy );
      AV12GridState.setgxTv_SdtWWPGridState_Ordereddsc( AV22OrderedDsc );
      AV12GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState39[0] = AV12GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState39, "TFBARNHDR", "", !(GXutil.strcmp("", AV89TFBarNHdr)==0), (short)(0), AV89TFBarNHdr, "", !(GXutil.strcmp("", AV90TFBarNHdr_Sel)==0), AV90TFBarNHdr_Sel, "") ;
      AV12GridState = GXv_SdtWWPGridState39[0] ;
      GXv_SdtWWPGridState39[0] = AV12GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState39, "TFMAQCOD", "", !(GXutil.strcmp("", AV101TFMaqCod)==0), (short)(0), AV101TFMaqCod, "", !(GXutil.strcmp("", AV102TFMaqCod_Sel)==0), AV102TFMaqCod_Sel, "") ;
      AV12GridState = GXv_SdtWWPGridState39[0] ;
      GXv_SdtWWPGridState39[0] = AV12GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState39, "TFHISPROFEC", "", !GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV103TFHisProFec)), (short)(0), GXutil.trim( localUtil.dtoc( AV103TFHisProFec, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")), "") ;
      AV12GridState = GXv_SdtWWPGridState39[0] ;
      GXv_SdtWWPGridState39[0] = AV12GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState39, "TFHISPROKGR", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV105TFHisProKgr)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV106TFHisProKgr_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV105TFHisProKgr, 9, 2)), GXutil.trim( GXutil.str( AV106TFHisProKgr_To, 9, 2))) ;
      AV12GridState = GXv_SdtWWPGridState39[0] ;
      GXv_SdtWWPGridState39[0] = AV12GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState39, "TFHISPROMTR", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV107TFHisProMtr)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV108TFHisProMtr_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV107TFHisProMtr, 9, 2)), GXutil.trim( GXutil.str( AV108TFHisProMtr_To, 9, 2))) ;
      AV12GridState = GXv_SdtWWPGridState39[0] ;
      GXv_SdtWWPGridState39[0] = AV12GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState39, "TFHISPROTUR", "", !((0==AV109TFHisProTur)&&(0==AV110TFHisProTur_To)), (short)(0), GXutil.trim( GXutil.str( AV109TFHisProTur, 1, 0)), GXutil.trim( GXutil.str( AV110TFHisProTur_To, 1, 0))) ;
      AV12GridState = GXv_SdtWWPGridState39[0] ;
      GXv_SdtWWPGridState39[0] = AV12GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState39, "TFHISPROF", "", !(GXutil.strcmp("", AV93TFHisProF)==0), (short)(0), AV93TFHisProF, "", !(GXutil.strcmp("", AV94TFHisProF_Sel)==0), AV94TFHisProF_Sel, "") ;
      AV12GridState = GXv_SdtWWPGridState39[0] ;
      GXv_SdtWWPGridState39[0] = AV12GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState39, "TFHISPRODTI", "", !GXutil.dateCompare(GXutil.nullDate(), AV111TFHisProDTI), (short)(0), GXutil.trim( localUtil.ttoc( AV111TFHisProDTI, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")), "") ;
      AV12GridState = GXv_SdtWWPGridState39[0] ;
      GXv_SdtWWPGridState39[0] = AV12GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState39, "TFHISPRODTF", "", !GXutil.dateCompare(GXutil.nullDate(), AV113TFHisProDTF), (short)(0), GXutil.trim( localUtil.ttoc( AV113TFHisProDTF, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")), "") ;
      AV12GridState = GXv_SdtWWPGridState39[0] ;
      GXv_SdtWWPGridState39[0] = AV12GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState39, "TFCLINOM", "", !(GXutil.strcmp("", AV91TFCliNom)==0), (short)(0), AV91TFCliNom, "", !(GXutil.strcmp("", AV92TFCliNom_Sel)==0), AV92TFCliNom_Sel, "") ;
      AV12GridState = GXv_SdtWWPGridState39[0] ;
      GXv_SdtWWPGridState39[0] = AV12GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState39, "TFBARSER", "", !(GXutil.strcmp("", AV53TFBarSer)==0), (short)(0), AV53TFBarSer, "", !(GXutil.strcmp("", AV54TFBarSer_Sel)==0), AV54TFBarSer_Sel, "") ;
      AV12GridState = GXv_SdtWWPGridState39[0] ;
      GXv_SdtWWPGridState39[0] = AV12GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState39, "TFBARCOLNOM", "", !(GXutil.strcmp("", AV85TFBarColNom)==0), (short)(0), AV85TFBarColNom, "", !(GXutil.strcmp("", AV86TFBarColNom_Sel)==0), AV86TFBarColNom_Sel, "") ;
      AV12GridState = GXv_SdtWWPGridState39[0] ;
      GXv_SdtWWPGridState39[0] = AV12GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState39, "TFBARCOLNUM", "", !((0==AV87TFBarColNum)&&(0==AV88TFBarColNum_To)), (short)(0), GXutil.trim( GXutil.str( AV87TFBarColNum, 6, 0)), GXutil.trim( GXutil.str( AV88TFBarColNum_To, 6, 0))) ;
      AV12GridState = GXv_SdtWWPGridState39[0] ;
      GXv_SdtWWPGridState39[0] = AV12GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState39, "TFFASE", "", !(GXutil.strcmp("", AV117TFFase)==0), (short)(0), AV117TFFase, "", !(GXutil.strcmp("", AV118TFFase_Sel)==0), AV118TFFase_Sel, "") ;
      AV12GridState = GXv_SdtWWPGridState39[0] ;
      GXv_SdtWWPGridState39[0] = AV12GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState39, "TFFASEDESCRIPCION", "", !(GXutil.strcmp("", AV119TFFaseDescripcion)==0), (short)(0), AV119TFFaseDescripcion, "", !(GXutil.strcmp("", AV120TFFaseDescripcion_Sel)==0), AV120TFFaseDescripcion_Sel, "") ;
      AV12GridState = GXv_SdtWWPGridState39[0] ;
      GXv_SdtWWPGridState39[0] = AV12GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState39, "TFBARTIPART", "", !((0==AV99TFBarTipArt)&&(0==AV100TFBarTipArt_To)), (short)(0), GXutil.trim( GXutil.str( AV99TFBarTipArt, 4, 0)), GXutil.trim( GXutil.str( AV100TFBarTipArt_To, 4, 0))) ;
      AV12GridState = GXv_SdtWWPGridState39[0] ;
      GXv_SdtWWPGridState39[0] = AV12GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState39, "TFHISPROTIP", "", !((0==AV121TFHisProTip)&&(0==AV122TFHisProTip_To)), (short)(0), GXutil.trim( GXutil.str( AV121TFHisProTip, 4, 0)), GXutil.trim( GXutil.str( AV122TFHisProTip_To, 4, 0))) ;
      AV12GridState = GXv_SdtWWPGridState39[0] ;
      GXv_SdtWWPGridState39[0] = AV12GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState39, "TFHISPROTC", "", !((0==AV123TFHisProTc)&&(0==AV124TFHisProTc_To)), (short)(0), GXutil.trim( GXutil.str( AV123TFHisProTc, 2, 0)), GXutil.trim( GXutil.str( AV124TFHisProTc_To, 2, 0))) ;
      AV12GridState = GXv_SdtWWPGridState39[0] ;
      GXv_SdtWWPGridState39[0] = AV12GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState39, "TFHISPRODF", "", !GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV46TFHisProDf)), (short)(0), GXutil.trim( localUtil.dtoc( AV46TFHisProDf, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")), "") ;
      AV12GridState = GXv_SdtWWPGridState39[0] ;
      GXv_SdtWWPGridState39[0] = AV12GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState39, "TFPARCOD", "", !((0==AV37TFParCod)&&(0==AV38TFParCod_To)), (short)(0), GXutil.trim( GXutil.str( AV37TFParCod, 4, 0)), GXutil.trim( GXutil.str( AV38TFParCod_To, 4, 0))) ;
      AV12GridState = GXv_SdtWWPGridState39[0] ;
      GXv_SdtWWPGridState39[0] = AV12GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState39, "TFPARCODNOM", "", !(GXutil.strcmp("", AV39TFParCodNom)==0), (short)(0), AV39TFParCodNom, "", !(GXutil.strcmp("", AV40TFParCodNom_Sel)==0), AV40TFParCodNom_Sel, "") ;
      AV12GridState = GXv_SdtWWPGridState39[0] ;
      if ( ! (GXutil.strcmp("", AV15INEmprcod)==0) )
      {
         AV13GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV13GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&INEMPRCOD" );
         AV13GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV15INEmprcod );
         AV12GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV13GridStateFilterValue, 0);
      }
      if ( ! (0==AV16INHisEstReo) )
      {
         AV13GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV13GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&INHISESTREO" );
         AV13GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV16INHisEstReo, 1, 0) );
         AV12GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV13GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV19INMaqCod1)==0) )
      {
         AV13GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV13GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&INMAQCOD1" );
         AV13GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV19INMaqCod1 );
         AV12GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV13GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV20INMaqCod2)==0) )
      {
         AV13GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV13GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&INMAQCOD2" );
         AV13GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV20INMaqCod2 );
         AV12GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV13GridStateFilterValue, 0);
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV17INHisProFec1) )
      {
         AV13GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV13GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&INHISPROFEC1" );
         AV13GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( localUtil.ttoc( AV17INHisProFec1, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") );
         AV12GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV13GridStateFilterValue, 0);
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV18INHisProFec2) )
      {
         AV13GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV13GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&INHISPROFEC2" );
         AV13GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( localUtil.ttoc( AV18INHisProFec2, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") );
         AV12GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV13GridStateFilterValue, 0);
      }
      if ( ! (0==AV125OperarioFrom) )
      {
         AV13GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV13GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&OPERARIOFROM" );
         AV13GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV125OperarioFrom, 6, 0) );
         AV12GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV13GridStateFilterValue, 0);
      }
      if ( ! (0==AV126OperarioTo) )
      {
         AV13GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV13GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&OPERARIOTO" );
         AV13GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV126OperarioTo, 6, 0) );
         AV12GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV13GridStateFilterValue, 0);
      }
      AV12GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV12GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV140Pgmname+"GridState", AV12GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S122( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV26TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV26TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV140Pgmname );
      AV26TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( true );
      AV26TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV14HTTPRequest.getScriptName()+"?"+AV14HTTPRequest.getQuerystring() );
      AV26TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "LHIPRO" );
      AV24Session.setValue("TrnContext", AV26TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   public void S112( )
   {
      /* 'ATTRIBUTESSECURITYCODE' Routine */
      returnInSub = false ;
      if ( ! ( ( AV76lecotex == 1 ) ) )
      {
         edtavCostei_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCostei_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCostei_Visible), 5, 0), !bGXsfl_27_Refreshing);
      }
      if ( ! ( ( AV76lecotex == 1 ) ) )
      {
         edtavCostet_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCostet_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCostet_Visible), 5, 0), !bGXsfl_27_Refreshing);
      }
      if ( ! ( ( AV76lecotex == 1 ) ) )
      {
         edtavCostek_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCostek_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCostek_Visible), 5, 0), !bGXsfl_27_Refreshing);
      }
      if ( ! ( ( AV76lecotex == 1 ) ) )
      {
         edtavBarkgmtin_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBarkgmtin_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarkgmtin_Visible), 5, 0), !bGXsfl_27_Refreshing);
      }
      if ( ! ( ( AV76lecotex == 1 ) ) )
      {
         edtavBarkgstt_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBarkgstt_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarkgstt_Visible), 5, 0), !bGXsfl_27_Refreshing);
      }
   }

   public void S162( )
   {
      /* 'INITIALIZETOTALIZERS' Routine */
      returnInSub = false ;
      AV95TotHisProKgr = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV95TotHisProKgr", GXutil.ltrimstr( AV95TotHisProKgr, 18, 2));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTHISPROKGR", getSecureSignedToken( sPrefix, localUtil.format( AV95TotHisProKgr, "ZZZZZ9.99")));
      AV96TotHisProMtr = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV96TotHisProMtr", GXutil.ltrimstr( AV96TotHisProMtr, 18, 2));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTHISPROMTR", getSecureSignedToken( sPrefix, localUtil.format( AV96TotHisProMtr, "ZZZZZ9.99")));
   }

   public void S172( )
   {
      /* 'CALCULATETOTALIZERS' Routine */
      returnInSub = false ;
      if ( 1 == 0 )
      {
         pr_default.dynParam(2, new Object[]{ new Object[]{
                                              AV90TFBarNHdr_Sel ,
                                              AV89TFBarNHdr ,
                                              AV102TFMaqCod_Sel ,
                                              AV101TFMaqCod ,
                                              AV103TFHisProFec ,
                                              AV105TFHisProKgr ,
                                              AV106TFHisProKgr_To ,
                                              AV107TFHisProMtr ,
                                              AV108TFHisProMtr_To ,
                                              Byte.valueOf(AV109TFHisProTur) ,
                                              Byte.valueOf(AV110TFHisProTur_To) ,
                                              AV94TFHisProF_Sel ,
                                              AV93TFHisProF ,
                                              AV111TFHisProDTI ,
                                              AV113TFHisProDTF ,
                                              AV92TFCliNom_Sel ,
                                              AV91TFCliNom ,
                                              AV54TFBarSer_Sel ,
                                              AV53TFBarSer ,
                                              AV86TFBarColNom_Sel ,
                                              AV85TFBarColNom ,
                                              Integer.valueOf(AV87TFBarColNum) ,
                                              Integer.valueOf(AV88TFBarColNum_To) ,
                                              AV118TFFase_Sel ,
                                              AV117TFFase ,
                                              Short.valueOf(AV99TFBarTipArt) ,
                                              Short.valueOf(AV100TFBarTipArt_To) ,
                                              Short.valueOf(AV121TFHisProTip) ,
                                              Short.valueOf(AV122TFHisProTip_To) ,
                                              Byte.valueOf(AV123TFHisProTc) ,
                                              Byte.valueOf(AV124TFHisProTc_To) ,
                                              AV46TFHisProDf ,
                                              Short.valueOf(AV37TFParCod) ,
                                              Short.valueOf(AV38TFParCod_To) ,
                                              AV40TFParCodNom_Sel ,
                                              AV39TFParCodNom ,
                                              Byte.valueOf(AV16INHisEstReo) ,
                                              Integer.valueOf(AV125OperarioFrom) ,
                                              Integer.valueOf(AV126OperarioTo) ,
                                              Integer.valueOf(A129BarCod) ,
                                              Byte.valueOf(A132BarCodReo) ,
                                              A130BarCodPar ,
                                              A602MaqCod ,
                                              A558HisProFec ,
                                              A1525HisProKgr ,
                                              A1526HisProMtr ,
                                              Byte.valueOf(A566HisProTur) ,
                                              A557HisProF ,
                                              A4440HisProDTI ,
                                              A4441HisProDTF ,
                                              A279CliNom ,
                                              A212BarSer ,
                                              A135BarColNom ,
                                              Integer.valueOf(A136BarColNum) ,
                                              A461Fase ,
                                              Short.valueOf(A217BarTipArt) ,
                                              Short.valueOf(A2247HisProTip) ,
                                              Byte.valueOf(A3611HisProTc) ,
                                              A5608HisProDf ,
                                              Short.valueOf(A656ParCod) ,
                                              A867ParCodNom ,
                                              Byte.valueOf(A3612HisProReo) ,
                                              Integer.valueOf(A503GruOpeCod) ,
                                              AV120TFFaseDescripcion_Sel ,
                                              AV119TFFaseDescripcion ,
                                              A13893FaseDescri ,
                                              AV17INHisProFec1 ,
                                              AV18INHisProFec2 ,
                                              AV15INEmprcod ,
                                              AV19INMaqCod1 ,
                                              A396EmprCod ,
                                              AV20INMaqCod2 } ,
                                              new int[]{
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BYTE,
                                              TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.BYTE,
                                              TypeConstants.BYTE, TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT,
                                              TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.BOOLEAN,
                                              TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.SHORT,
                                              TypeConstants.BYTE, TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                              }
         });
         lV89TFBarNHdr = GXutil.padr( GXutil.rtrim( AV89TFBarNHdr), 11, "%") ;
         lV101TFMaqCod = GXutil.padr( GXutil.rtrim( AV101TFMaqCod), 6, "%") ;
         lV93TFHisProF = GXutil.padr( GXutil.rtrim( AV93TFHisProF), 1, "%") ;
         lV91TFCliNom = GXutil.padr( GXutil.rtrim( AV91TFCliNom), 30, "%") ;
         lV53TFBarSer = GXutil.padr( GXutil.rtrim( AV53TFBarSer), 16, "%") ;
         lV85TFBarColNom = GXutil.padr( GXutil.rtrim( AV85TFBarColNom), 13, "%") ;
         lV117TFFase = GXutil.padr( GXutil.rtrim( AV117TFFase), 8, "%") ;
         lV39TFParCodNom = GXutil.padr( GXutil.rtrim( AV39TFParCodNom), 30, "%") ;
         /* Using cursor H025I4 */
         pr_default.execute(2, new Object[] {AV15INEmprcod, AV19INMaqCod1, AV17INHisProFec1, AV18INHisProFec2, AV20INMaqCod2, lV89TFBarNHdr, AV90TFBarNHdr_Sel, lV101TFMaqCod, AV102TFMaqCod_Sel, AV103TFHisProFec, AV105TFHisProKgr, AV106TFHisProKgr_To, AV107TFHisProMtr, AV108TFHisProMtr_To, Byte.valueOf(AV109TFHisProTur), Byte.valueOf(AV110TFHisProTur_To), lV93TFHisProF, AV94TFHisProF_Sel, AV111TFHisProDTI, AV113TFHisProDTF, lV91TFCliNom, AV92TFCliNom_Sel, lV53TFBarSer, AV54TFBarSer_Sel, lV85TFBarColNom, AV86TFBarColNom_Sel, Integer.valueOf(AV87TFBarColNum), Integer.valueOf(AV88TFBarColNum_To), lV117TFFase, AV118TFFase_Sel, Short.valueOf(AV99TFBarTipArt), Short.valueOf(AV100TFBarTipArt_To), Short.valueOf(AV121TFHisProTip), Short.valueOf(AV122TFHisProTip_To), Byte.valueOf(AV123TFHisProTc), Byte.valueOf(AV124TFHisProTc_To), AV46TFHisProDf, Short.valueOf(AV37TFParCod), Short.valueOf(AV38TFParCod_To), lV39TFParCodNom, AV40TFParCodNom_Sel, Byte.valueOf(AV16INHisEstReo), Integer.valueOf(AV125OperarioFrom), Integer.valueOf(AV126OperarioTo)});
         while ( (pr_default.getStatus(2) != 101) )
         {
            A252CliCod = H025I4_A252CliCod[0] ;
            n252CliCod = H025I4_n252CliCod[0] ;
            A503GruOpeCod = H025I4_A503GruOpeCod[0] ;
            A3612HisProReo = H025I4_A3612HisProReo[0] ;
            A867ParCodNom = H025I4_A867ParCodNom[0] ;
            n867ParCodNom = H025I4_n867ParCodNom[0] ;
            A656ParCod = H025I4_A656ParCod[0] ;
            n656ParCod = H025I4_n656ParCod[0] ;
            A5608HisProDf = H025I4_A5608HisProDf[0] ;
            A3611HisProTc = H025I4_A3611HisProTc[0] ;
            A2247HisProTip = H025I4_A2247HisProTip[0] ;
            A217BarTipArt = H025I4_A217BarTipArt[0] ;
            n217BarTipArt = H025I4_n217BarTipArt[0] ;
            A136BarColNum = H025I4_A136BarColNum[0] ;
            A135BarColNom = H025I4_A135BarColNom[0] ;
            A212BarSer = H025I4_A212BarSer[0] ;
            A279CliNom = H025I4_A279CliNom[0] ;
            A4441HisProDTF = H025I4_A4441HisProDTF[0] ;
            n4441HisProDTF = H025I4_n4441HisProDTF[0] ;
            A4440HisProDTI = H025I4_A4440HisProDTI[0] ;
            n4440HisProDTI = H025I4_n4440HisProDTI[0] ;
            A557HisProF = H025I4_A557HisProF[0] ;
            A566HisProTur = H025I4_A566HisProTur[0] ;
            A1526HisProMtr = H025I4_A1526HisProMtr[0] ;
            A1525HisProKgr = H025I4_A1525HisProKgr[0] ;
            A558HisProFec = H025I4_A558HisProFec[0] ;
            A602MaqCod = H025I4_A602MaqCod[0] ;
            A130BarCodPar = H025I4_A130BarCodPar[0] ;
            A132BarCodReo = H025I4_A132BarCodReo[0] ;
            A129BarCod = H025I4_A129BarCod[0] ;
            A461Fase = H025I4_A461Fase[0] ;
            A396EmprCod = H025I4_A396EmprCod[0] ;
            A252CliCod = H025I4_A252CliCod[0] ;
            n252CliCod = H025I4_n252CliCod[0] ;
            A217BarTipArt = H025I4_A217BarTipArt[0] ;
            n217BarTipArt = H025I4_n217BarTipArt[0] ;
            A136BarColNum = H025I4_A136BarColNum[0] ;
            A135BarColNom = H025I4_A135BarColNom[0] ;
            A212BarSer = H025I4_A212BarSer[0] ;
            A279CliNom = H025I4_A279CliNom[0] ;
            A867ParCodNom = H025I4_A867ParCodNom[0] ;
            n867ParCodNom = H025I4_n867ParCodNom[0] ;
            GXt_char38 = A13893FaseDescri ;
            GXv_char27[0] = GXt_char38 ;
            new app.pfasdsc(remoteHandle, context).execute( A396EmprCod, A461Fase, GXv_char27) ;
            informeproduccionresumenhdr_wc1_impl.this.GXt_char38 = GXv_char27[0] ;
            A13893FaseDescri = GXt_char38 ;
            if ( ! ( (GXutil.strcmp("", AV120TFFaseDescripcion_Sel)==0) && ( ! (GXutil.strcmp("", AV119TFFaseDescripcion)==0) ) ) || ( GXutil.like( GXutil.upper( A13893FaseDescri) , GXutil.padr( "%" + GXutil.upper( AV119TFFaseDescripcion) , 255 , "%"),  ' ' ) ) )
            {
               if ( (GXutil.strcmp("", AV120TFFaseDescripcion_Sel)==0) || ( ( GXutil.strcmp(A13893FaseDescri, AV120TFFaseDescripcion_Sel) == 0 ) ) )
               {
                  A13696BarNHdr = GXutil.trim( GXutil.str( A129BarCod, 8, 0)) + "-" + GXutil.trim( GXutil.str( A132BarCodReo, 1, 0)) + A130BarCodPar ;
                  AV95TotHisProKgr = A1525HisProKgr.add(AV95TotHisProKgr) ;
                  httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV95TotHisProKgr", GXutil.ltrimstr( AV95TotHisProKgr, 18, 2));
                  app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTHISPROKGR", getSecureSignedToken( sPrefix, localUtil.format( AV95TotHisProKgr, "ZZZZZ9.99")));
                  AV96TotHisProMtr = A1526HisProMtr.add(AV96TotHisProMtr) ;
                  httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV96TotHisProMtr", GXutil.ltrimstr( AV96TotHisProMtr, 18, 2));
                  app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTHISPROMTR", getSecureSignedToken( sPrefix, localUtil.format( AV96TotHisProMtr, "ZZZZZ9.99")));
               }
            }
            pr_default.readNext(2);
         }
         pr_default.close(2);
         AV97TotValueHisProKgr = localUtil.format( AV95TotHisProKgr, "ZZZZZ9.99") ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV97TotValueHisProKgr", AV97TotValueHisProKgr);
         AV98TotValueHisProMtr = localUtil.format( AV96TotHisProMtr, "ZZZZZ9.99") ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV98TotValueHisProMtr", AV98TotValueHisProMtr);
      }
   }

   public void S182( )
   {
      /* 'FASPRO' Routine */
      returnInSub = false ;
      AV30FasDivTime = httpContext.getMessage( "N", "") ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV30FasDivTime", AV30FasDivTime);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vFASDIVTIME", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV30FasDivTime, ""))));
      /* Using cursor H025I5 */
      pr_default.execute(3, new Object[] {AV6EmprCod, AV57FasCod});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A457FasCod = H025I5_A457FasCod[0] ;
         A396EmprCod = H025I5_A396EmprCod[0] ;
         A14054FasDivTime = H025I5_A14054FasDivTime[0] ;
         AV30FasDivTime = A14054FasDivTime ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV30FasDivTime", AV30FasDivTime);
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vFASDIVTIME", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV30FasDivTime, ""))));
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(3);
   }

   public void S192( )
   {
      /* 'COSTES' Routine */
      returnInSub = false ;
      AV58BarKgsTt = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavBarkgstt_Internalname, GXutil.ltrimstr( AV58BarKgsTt, 10, 2));
      AV60BarKgmTin = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavBarkgmtin_Internalname, GXutil.ltrimstr( AV60BarKgmTin, 9, 2));
      AV59HdrP = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavHdrp_Internalname, AV59HdrP);
      /* Using cursor H025I6 */
      pr_default.execute(4, new Object[] {AV6EmprCod, Integer.valueOf(AV61BarCod), Byte.valueOf(AV62BarCodReo), AV63BarCodPar, AV19INMaqCod1, AV20INMaqCod2});
      while ( (pr_default.getStatus(4) != 101) )
      {
         A1945BarMaqTin = H025I6_A1945BarMaqTin[0] ;
         n1945BarMaqTin = H025I6_n1945BarMaqTin[0] ;
         A1935BarParTin = H025I6_A1935BarParTin[0] ;
         n1935BarParTin = H025I6_n1935BarParTin[0] ;
         A1934BarReoTin = H025I6_A1934BarReoTin[0] ;
         n1934BarReoTin = H025I6_n1934BarReoTin[0] ;
         A1933BarCodTin = H025I6_A1933BarCodTin[0] ;
         n1933BarCodTin = H025I6_n1933BarCodTin[0] ;
         A396EmprCod = H025I6_A396EmprCod[0] ;
         A8563BarKgsTt = H025I6_A8563BarKgsTt[0] ;
         n8563BarKgsTt = H025I6_n8563BarKgsTt[0] ;
         A1947BarKgmTin = H025I6_A1947BarKgmTin[0] ;
         n1947BarKgmTin = H025I6_n1947BarKgmTin[0] ;
         A3654BarCosPD = H025I6_A3654BarCosPD[0] ;
         n3654BarCosPD = H025I6_n3654BarCosPD[0] ;
         A3658BarCosPA = H025I6_A3658BarCosPA[0] ;
         n3658BarCosPA = H025I6_n3658BarCosPA[0] ;
         A3705BarCosCol = H025I6_A3705BarCosCol[0] ;
         n3705BarCosCol = H025I6_n3705BarCosCol[0] ;
         A3706BarCosAnc = H025I6_A3706BarCosAnc[0] ;
         n3706BarCosAnc = H025I6_n3706BarCosAnc[0] ;
         A3656BarCosAD = H025I6_A3656BarCosAD[0] ;
         n3656BarCosAD = H025I6_n3656BarCosAD[0] ;
         A3657BarCosAA = H025I6_A3657BarCosAA[0] ;
         n3657BarCosAA = H025I6_n3657BarCosAA[0] ;
         A2316BarAgrLot = H025I6_A2316BarAgrLot[0] ;
         n2316BarAgrLot = H025I6_n2316BarAgrLot[0] ;
         AV58BarKgsTt = A8563BarKgsTt ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavBarkgstt_Internalname, GXutil.ltrimstr( AV58BarKgsTt, 10, 2));
         AV60BarKgmTin = A1947BarKgmTin ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavBarkgmtin_Internalname, GXutil.ltrimstr( AV60BarKgmTin, 9, 2));
         AV51CosteI = A3705BarCosCol.add(A3658BarCosPA).add(A3654BarCosPD) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCostei_Internalname, GXutil.ltrimstr( AV51CosteI, 10, 2));
         AV52CosteT = A3657BarCosAA.add(A3656BarCosAD).add(A3706BarCosAnc).add(A3705BarCosCol).add(A3658BarCosPA).add(A3654BarCosPD) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCostet_Internalname, GXutil.ltrimstr( AV52CosteT, 10, 2));
         AV78Dif = AV51CosteI.subtract(AV52CosteT) ;
         AV84Porc = DecimalUtil.doubleToDec(0) ;
         if ( AV51CosteI.doubleValue() != 0 )
         {
            AV84Porc = GXutil.roundDecimal( (AV78Dif.divide(AV51CosteI, 18, java.math.RoundingMode.DOWN)).multiply(DecimalUtil.doubleToDec(100)), 2) ;
         }
         AV77CosteK = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCostek_Internalname, GXutil.ltrimstr( AV77CosteK, 10, 2));
         if ( AV60BarKgmTin.doubleValue() > 0 )
         {
            AV77CosteK = GXutil.roundDecimal( AV52CosteT.divide(AV60BarKgmTin, 18, java.math.RoundingMode.DOWN), 2) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCostek_Internalname, GXutil.ltrimstr( AV77CosteK, 10, 2));
         }
         AV59HdrP = GXutil.substring( A2316BarAgrLot, 1, 8) + "-" + GXutil.substring( A2316BarAgrLot, 9, 1) + GXutil.substring( A2316BarAgrLot, 10, 1) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavHdrp_Internalname, AV59HdrP);
         pr_default.readNext(4);
      }
      pr_default.close(4);
   }

   public void wb_table1_84_25I2( boolean wbgen )
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
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTotvaluehisprokgr_Internalname, httpContext.getMessage( "Tot Value His Pro Kgr", ""), "gx-form-item AttributeTotalizerLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 96,'" + sPrefix + "',false,'" + sGXsfl_27_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotvaluehisprokgr_Internalname, AV97TotValueHisProKgr, GXutil.rtrim( localUtil.format( AV97TotValueHisProKgr, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,96);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotvaluehisprokgr_Jsonclick, 0, "AttributeTotalizer", "", "", "", "", 1, edtavTotvaluehisprokgr_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Produccion\\InformeProduccionResumenHdr_WC1.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTotvaluehispromtr_Internalname, httpContext.getMessage( "Tot Value His Pro Mtr", ""), "gx-form-item AttributeTotalizerLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 99,'" + sPrefix + "',false,'" + sGXsfl_27_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotvaluehispromtr_Internalname, AV98TotValueHisProMtr, GXutil.rtrim( localUtil.format( AV98TotValueHisProMtr, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,99);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotvaluehispromtr_Jsonclick, 0, "AttributeTotalizer", "", "", "", "", 1, edtavTotvaluehispromtr_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Produccion\\InformeProduccionResumenHdr_WC1.htm");
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
         wb_table1_84_25I2e( true) ;
      }
      else
      {
         wb_table1_84_25I2e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV15INEmprcod = (String)getParm(obj,0,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV15INEmprcod", AV15INEmprcod);
      AV16INHisEstReo = ((Number) GXutil.testNumericType( getParm(obj,1,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV16INHisEstReo", GXutil.str( AV16INHisEstReo, 1, 0));
      AV19INMaqCod1 = (String)getParm(obj,2,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV19INMaqCod1", AV19INMaqCod1);
      AV20INMaqCod2 = (String)getParm(obj,3,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV20INMaqCod2", AV20INMaqCod2);
      AV17INHisProFec1 = (java.util.Date)getParm(obj,4,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV17INHisProFec1", localUtil.ttoc( AV17INHisProFec1, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      AV18INHisProFec2 = (java.util.Date)getParm(obj,5,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV18INHisProFec2", localUtil.ttoc( AV18INHisProFec2, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      AV125OperarioFrom = ((Number) GXutil.testNumericType( getParm(obj,6,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV125OperarioFrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV125OperarioFrom), 6, 0));
      AV126OperarioTo = ((Number) GXutil.testNumericType( getParm(obj,7,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV126OperarioTo", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV126OperarioTo), 6, 0));
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
      pa25I2( ) ;
      ws25I2( ) ;
      we25I2( ) ;
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
      sCtrlAV15INEmprcod = (String)getParm(obj,0,TypeConstants.STRING) ;
      sCtrlAV16INHisEstReo = (String)getParm(obj,1,TypeConstants.STRING) ;
      sCtrlAV19INMaqCod1 = (String)getParm(obj,2,TypeConstants.STRING) ;
      sCtrlAV20INMaqCod2 = (String)getParm(obj,3,TypeConstants.STRING) ;
      sCtrlAV17INHisProFec1 = (String)getParm(obj,4,TypeConstants.STRING) ;
      sCtrlAV18INHisProFec2 = (String)getParm(obj,5,TypeConstants.STRING) ;
      sCtrlAV125OperarioFrom = (String)getParm(obj,6,TypeConstants.STRING) ;
      sCtrlAV126OperarioTo = (String)getParm(obj,7,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      pa25I2( ) ;
      wcparametersget( ) ;
   }

   @SuppressWarnings("unchecked")
   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "produccion\\informeproduccionresumenhdr_wc1", GetJustCreated( ));
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
         init_web_controls( ) ;
      }
      pa25I2( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         AV15INEmprcod = (String)getParm(obj,2,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV15INEmprcod", AV15INEmprcod);
         AV16INHisEstReo = ((Number) GXutil.testNumericType( getParm(obj,3,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV16INHisEstReo", GXutil.str( AV16INHisEstReo, 1, 0));
         AV19INMaqCod1 = (String)getParm(obj,4,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV19INMaqCod1", AV19INMaqCod1);
         AV20INMaqCod2 = (String)getParm(obj,5,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV20INMaqCod2", AV20INMaqCod2);
         AV17INHisProFec1 = (java.util.Date)getParm(obj,6,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV17INHisProFec1", localUtil.ttoc( AV17INHisProFec1, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         AV18INHisProFec2 = (java.util.Date)getParm(obj,7,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV18INHisProFec2", localUtil.ttoc( AV18INHisProFec2, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         AV125OperarioFrom = ((Number) GXutil.testNumericType( getParm(obj,8,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV125OperarioFrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV125OperarioFrom), 6, 0));
         AV126OperarioTo = ((Number) GXutil.testNumericType( getParm(obj,9,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV126OperarioTo", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV126OperarioTo), 6, 0));
      }
      wcpOAV15INEmprcod = httpContext.cgiGet( sPrefix+"wcpOAV15INEmprcod") ;
      wcpOAV16INHisEstReo = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV16INHisEstReo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV19INMaqCod1 = httpContext.cgiGet( sPrefix+"wcpOAV19INMaqCod1") ;
      wcpOAV20INMaqCod2 = httpContext.cgiGet( sPrefix+"wcpOAV20INMaqCod2") ;
      wcpOAV17INHisProFec1 = localUtil.ctot( httpContext.cgiGet( sPrefix+"wcpOAV17INHisProFec1"), 0) ;
      wcpOAV18INHisProFec2 = localUtil.ctot( httpContext.cgiGet( sPrefix+"wcpOAV18INHisProFec2"), 0) ;
      wcpOAV125OperarioFrom = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV125OperarioFrom"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV126OperarioTo = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV126OperarioTo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ! GetJustCreated( ) && ( ( GXutil.strcmp(AV15INEmprcod, wcpOAV15INEmprcod) != 0 ) || ( AV16INHisEstReo != wcpOAV16INHisEstReo ) || ( GXutil.strcmp(AV19INMaqCod1, wcpOAV19INMaqCod1) != 0 ) || ( GXutil.strcmp(AV20INMaqCod2, wcpOAV20INMaqCod2) != 0 ) || !( GXutil.dateCompare(AV17INHisProFec1, wcpOAV17INHisProFec1) ) || !( GXutil.dateCompare(AV18INHisProFec2, wcpOAV18INHisProFec2) ) || ( AV125OperarioFrom != wcpOAV125OperarioFrom ) || ( AV126OperarioTo != wcpOAV126OperarioTo ) ) )
      {
         setjustcreated();
      }
      wcpOAV15INEmprcod = AV15INEmprcod ;
      wcpOAV16INHisEstReo = AV16INHisEstReo ;
      wcpOAV19INMaqCod1 = AV19INMaqCod1 ;
      wcpOAV20INMaqCod2 = AV20INMaqCod2 ;
      wcpOAV17INHisProFec1 = AV17INHisProFec1 ;
      wcpOAV18INHisProFec2 = AV18INHisProFec2 ;
      wcpOAV125OperarioFrom = AV125OperarioFrom ;
      wcpOAV126OperarioTo = AV126OperarioTo ;
   }

   public void wcparametersget( )
   {
      /* Read Component Parameters. */
      sCtrlAV15INEmprcod = httpContext.cgiGet( sPrefix+"AV15INEmprcod_CTRL") ;
      if ( GXutil.len( sCtrlAV15INEmprcod) > 0 )
      {
         AV15INEmprcod = httpContext.cgiGet( sCtrlAV15INEmprcod) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV15INEmprcod", AV15INEmprcod);
      }
      else
      {
         AV15INEmprcod = httpContext.cgiGet( sPrefix+"AV15INEmprcod_PARM") ;
      }
      sCtrlAV16INHisEstReo = httpContext.cgiGet( sPrefix+"AV16INHisEstReo_CTRL") ;
      if ( GXutil.len( sCtrlAV16INHisEstReo) > 0 )
      {
         AV16INHisEstReo = (byte)(localUtil.ctol( httpContext.cgiGet( sCtrlAV16INHisEstReo), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV16INHisEstReo", GXutil.str( AV16INHisEstReo, 1, 0));
      }
      else
      {
         AV16INHisEstReo = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV16INHisEstReo_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV19INMaqCod1 = httpContext.cgiGet( sPrefix+"AV19INMaqCod1_CTRL") ;
      if ( GXutil.len( sCtrlAV19INMaqCod1) > 0 )
      {
         AV19INMaqCod1 = httpContext.cgiGet( sCtrlAV19INMaqCod1) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV19INMaqCod1", AV19INMaqCod1);
      }
      else
      {
         AV19INMaqCod1 = httpContext.cgiGet( sPrefix+"AV19INMaqCod1_PARM") ;
      }
      sCtrlAV20INMaqCod2 = httpContext.cgiGet( sPrefix+"AV20INMaqCod2_CTRL") ;
      if ( GXutil.len( sCtrlAV20INMaqCod2) > 0 )
      {
         AV20INMaqCod2 = httpContext.cgiGet( sCtrlAV20INMaqCod2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV20INMaqCod2", AV20INMaqCod2);
      }
      else
      {
         AV20INMaqCod2 = httpContext.cgiGet( sPrefix+"AV20INMaqCod2_PARM") ;
      }
      sCtrlAV17INHisProFec1 = httpContext.cgiGet( sPrefix+"AV17INHisProFec1_CTRL") ;
      if ( GXutil.len( sCtrlAV17INHisProFec1) > 0 )
      {
         AV17INHisProFec1 = localUtil.ctot( httpContext.cgiGet( sCtrlAV17INHisProFec1), 0) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV17INHisProFec1", localUtil.ttoc( AV17INHisProFec1, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      }
      else
      {
         AV17INHisProFec1 = localUtil.ctot( httpContext.cgiGet( sPrefix+"AV17INHisProFec1_PARM"), 0) ;
      }
      sCtrlAV18INHisProFec2 = httpContext.cgiGet( sPrefix+"AV18INHisProFec2_CTRL") ;
      if ( GXutil.len( sCtrlAV18INHisProFec2) > 0 )
      {
         AV18INHisProFec2 = localUtil.ctot( httpContext.cgiGet( sCtrlAV18INHisProFec2), 0) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV18INHisProFec2", localUtil.ttoc( AV18INHisProFec2, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      }
      else
      {
         AV18INHisProFec2 = localUtil.ctot( httpContext.cgiGet( sPrefix+"AV18INHisProFec2_PARM"), 0) ;
      }
      sCtrlAV125OperarioFrom = httpContext.cgiGet( sPrefix+"AV125OperarioFrom_CTRL") ;
      if ( GXutil.len( sCtrlAV125OperarioFrom) > 0 )
      {
         AV125OperarioFrom = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV125OperarioFrom), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV125OperarioFrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV125OperarioFrom), 6, 0));
      }
      else
      {
         AV125OperarioFrom = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV125OperarioFrom_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV126OperarioTo = httpContext.cgiGet( sPrefix+"AV126OperarioTo_CTRL") ;
      if ( GXutil.len( sCtrlAV126OperarioTo) > 0 )
      {
         AV126OperarioTo = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV126OperarioTo), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV126OperarioTo", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV126OperarioTo), 6, 0));
      }
      else
      {
         AV126OperarioTo = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV126OperarioTo_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
      pa25I2( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      ws25I2( ) ;
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
      ws25I2( ) ;
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void wcparametersset( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV15INEmprcod_PARM", GXutil.rtrim( AV15INEmprcod));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV15INEmprcod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV15INEmprcod_CTRL", GXutil.rtrim( sCtrlAV15INEmprcod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV16INHisEstReo_PARM", GXutil.ltrim( localUtil.ntoc( AV16INHisEstReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV16INHisEstReo)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV16INHisEstReo_CTRL", GXutil.rtrim( sCtrlAV16INHisEstReo));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV19INMaqCod1_PARM", GXutil.rtrim( AV19INMaqCod1));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV19INMaqCod1)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV19INMaqCod1_CTRL", GXutil.rtrim( sCtrlAV19INMaqCod1));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV20INMaqCod2_PARM", GXutil.rtrim( AV20INMaqCod2));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV20INMaqCod2)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV20INMaqCod2_CTRL", GXutil.rtrim( sCtrlAV20INMaqCod2));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV17INHisProFec1_PARM", localUtil.ttoc( AV17INHisProFec1, 10, 8, 0, 0, "/", ":", " "));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV17INHisProFec1)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV17INHisProFec1_CTRL", GXutil.rtrim( sCtrlAV17INHisProFec1));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV18INHisProFec2_PARM", localUtil.ttoc( AV18INHisProFec2, 10, 8, 0, 0, "/", ":", " "));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV18INHisProFec2)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV18INHisProFec2_CTRL", GXutil.rtrim( sCtrlAV18INHisProFec2));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV125OperarioFrom_PARM", GXutil.ltrim( localUtil.ntoc( AV125OperarioFrom, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV125OperarioFrom)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV125OperarioFrom_CTRL", GXutil.rtrim( sCtrlAV125OperarioFrom));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV126OperarioTo_PARM", GXutil.ltrim( localUtil.ntoc( AV126OperarioTo, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV126OperarioTo)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV126OperarioTo_CTRL", GXutil.rtrim( sCtrlAV126OperarioTo));
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
      we25I2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682115554238", true, true);
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
      httpContext.AddJavascriptSource("produccion/informeproduccionresumenhdr_wc1.js", "?202682115554238", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
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

   public void subsflControlProps_272( )
   {
      edtEmprCod_Internalname = sPrefix+"EMPRCOD_"+sGXsfl_27_idx ;
      edtBarCod_Internalname = sPrefix+"BARCOD_"+sGXsfl_27_idx ;
      edtBarCodReo_Internalname = sPrefix+"BARCODREO_"+sGXsfl_27_idx ;
      edtBarCodPar_Internalname = sPrefix+"BARCODPAR_"+sGXsfl_27_idx ;
      edtBarNHdr_Internalname = sPrefix+"BARNHDR_"+sGXsfl_27_idx ;
      edtMaqCod_Internalname = sPrefix+"MAQCOD_"+sGXsfl_27_idx ;
      edtHisProFec_Internalname = sPrefix+"HISPROFEC_"+sGXsfl_27_idx ;
      edtHisProLin_Internalname = sPrefix+"HISPROLIN_"+sGXsfl_27_idx ;
      edtHisProKgr_Internalname = sPrefix+"HISPROKGR_"+sGXsfl_27_idx ;
      edtHisProMtr_Internalname = sPrefix+"HISPROMTR_"+sGXsfl_27_idx ;
      edtHisProTur_Internalname = sPrefix+"HISPROTUR_"+sGXsfl_27_idx ;
      edtHisProF_Internalname = sPrefix+"HISPROF_"+sGXsfl_27_idx ;
      edtHisProDTI_Internalname = sPrefix+"HISPRODTI_"+sGXsfl_27_idx ;
      edtHisProDTF_Internalname = sPrefix+"HISPRODTF_"+sGXsfl_27_idx ;
      edtavHhmmalfa_Internalname = sPrefix+"vHHMMALFA_"+sGXsfl_27_idx ;
      edtCliNom_Internalname = sPrefix+"CLINOM_"+sGXsfl_27_idx ;
      edtBarSer_Internalname = sPrefix+"BARSER_"+sGXsfl_27_idx ;
      edtBarColNom_Internalname = sPrefix+"BARCOLNOM_"+sGXsfl_27_idx ;
      edtBarColNum_Internalname = sPrefix+"BARCOLNUM_"+sGXsfl_27_idx ;
      edtavMatcod_Internalname = sPrefix+"vMATCOD_"+sGXsfl_27_idx ;
      edtavMatdsc_Internalname = sPrefix+"vMATDSC_"+sGXsfl_27_idx ;
      edtGruOpeCod_Internalname = sPrefix+"GRUOPECOD_"+sGXsfl_27_idx ;
      edtGruOpeCodN_Internalname = sPrefix+"GRUOPECODN_"+sGXsfl_27_idx ;
      edtFase_Internalname = sPrefix+"FASE_"+sGXsfl_27_idx ;
      edtFaseDescri_Internalname = sPrefix+"FASEDESCRI_"+sGXsfl_27_idx ;
      edtavFlagmarca_Internalname = sPrefix+"vFLAGMARCA_"+sGXsfl_27_idx ;
      edtavMinutos_Internalname = sPrefix+"vMINUTOS_"+sGXsfl_27_idx ;
      chkavOp4.setInternalname( sPrefix+"vOP4_"+sGXsfl_27_idx );
      edtBarTipArt_Internalname = sPrefix+"BARTIPART_"+sGXsfl_27_idx ;
      edtHisProTip_Internalname = sPrefix+"HISPROTIP_"+sGXsfl_27_idx ;
      edtavTipartdsc_Internalname = sPrefix+"vTIPARTDSC_"+sGXsfl_27_idx ;
      edtHisProTc_Internalname = sPrefix+"HISPROTC_"+sGXsfl_27_idx ;
      edtavTipcoldsc_Internalname = sPrefix+"vTIPCOLDSC_"+sGXsfl_27_idx ;
      edtHisProDf_Internalname = sPrefix+"HISPRODF_"+sGXsfl_27_idx ;
      edtavForrgb_Internalname = sPrefix+"vFORRGB_"+sGXsfl_27_idx ;
      edtavR_Internalname = sPrefix+"vR_"+sGXsfl_27_idx ;
      edtavG_Internalname = sPrefix+"vG_"+sGXsfl_27_idx ;
      edtavB_Internalname = sPrefix+"vB_"+sGXsfl_27_idx ;
      edtavTipdefcod_Internalname = sPrefix+"vTIPDEFCOD_"+sGXsfl_27_idx ;
      edtavTipdefdsc_Internalname = sPrefix+"vTIPDEFDSC_"+sGXsfl_27_idx ;
      edtavCostei_Internalname = sPrefix+"vCOSTEI_"+sGXsfl_27_idx ;
      edtavCostet_Internalname = sPrefix+"vCOSTET_"+sGXsfl_27_idx ;
      edtavCostek_Internalname = sPrefix+"vCOSTEK_"+sGXsfl_27_idx ;
      edtavHdrp_Internalname = sPrefix+"vHDRP_"+sGXsfl_27_idx ;
      edtavBarkgmtin_Internalname = sPrefix+"vBARKGMTIN_"+sGXsfl_27_idx ;
      edtavBarkgstt_Internalname = sPrefix+"vBARKGSTT_"+sGXsfl_27_idx ;
      edtavHisprotr2_Internalname = sPrefix+"vHISPROTR2_"+sGXsfl_27_idx ;
      edtavHorreaint_Internalname = sPrefix+"vHORREAINT_"+sGXsfl_27_idx ;
      edtavMinrea_Internalname = sPrefix+"vMINREA_"+sGXsfl_27_idx ;
      edtParCod_Internalname = sPrefix+"PARCOD_"+sGXsfl_27_idx ;
      edtParCodNom_Internalname = sPrefix+"PARCODNOM_"+sGXsfl_27_idx ;
      edtBarTipCol_Internalname = sPrefix+"BARTIPCOL_"+sGXsfl_27_idx ;
      edtHisProLot_Internalname = sPrefix+"HISPROLOT_"+sGXsfl_27_idx ;
      edtHisProEst_Internalname = sPrefix+"HISPROEST_"+sGXsfl_27_idx ;
   }

   public void subsflControlProps_fel_272( )
   {
      edtEmprCod_Internalname = sPrefix+"EMPRCOD_"+sGXsfl_27_fel_idx ;
      edtBarCod_Internalname = sPrefix+"BARCOD_"+sGXsfl_27_fel_idx ;
      edtBarCodReo_Internalname = sPrefix+"BARCODREO_"+sGXsfl_27_fel_idx ;
      edtBarCodPar_Internalname = sPrefix+"BARCODPAR_"+sGXsfl_27_fel_idx ;
      edtBarNHdr_Internalname = sPrefix+"BARNHDR_"+sGXsfl_27_fel_idx ;
      edtMaqCod_Internalname = sPrefix+"MAQCOD_"+sGXsfl_27_fel_idx ;
      edtHisProFec_Internalname = sPrefix+"HISPROFEC_"+sGXsfl_27_fel_idx ;
      edtHisProLin_Internalname = sPrefix+"HISPROLIN_"+sGXsfl_27_fel_idx ;
      edtHisProKgr_Internalname = sPrefix+"HISPROKGR_"+sGXsfl_27_fel_idx ;
      edtHisProMtr_Internalname = sPrefix+"HISPROMTR_"+sGXsfl_27_fel_idx ;
      edtHisProTur_Internalname = sPrefix+"HISPROTUR_"+sGXsfl_27_fel_idx ;
      edtHisProF_Internalname = sPrefix+"HISPROF_"+sGXsfl_27_fel_idx ;
      edtHisProDTI_Internalname = sPrefix+"HISPRODTI_"+sGXsfl_27_fel_idx ;
      edtHisProDTF_Internalname = sPrefix+"HISPRODTF_"+sGXsfl_27_fel_idx ;
      edtavHhmmalfa_Internalname = sPrefix+"vHHMMALFA_"+sGXsfl_27_fel_idx ;
      edtCliNom_Internalname = sPrefix+"CLINOM_"+sGXsfl_27_fel_idx ;
      edtBarSer_Internalname = sPrefix+"BARSER_"+sGXsfl_27_fel_idx ;
      edtBarColNom_Internalname = sPrefix+"BARCOLNOM_"+sGXsfl_27_fel_idx ;
      edtBarColNum_Internalname = sPrefix+"BARCOLNUM_"+sGXsfl_27_fel_idx ;
      edtavMatcod_Internalname = sPrefix+"vMATCOD_"+sGXsfl_27_fel_idx ;
      edtavMatdsc_Internalname = sPrefix+"vMATDSC_"+sGXsfl_27_fel_idx ;
      edtGruOpeCod_Internalname = sPrefix+"GRUOPECOD_"+sGXsfl_27_fel_idx ;
      edtGruOpeCodN_Internalname = sPrefix+"GRUOPECODN_"+sGXsfl_27_fel_idx ;
      edtFase_Internalname = sPrefix+"FASE_"+sGXsfl_27_fel_idx ;
      edtFaseDescri_Internalname = sPrefix+"FASEDESCRI_"+sGXsfl_27_fel_idx ;
      edtavFlagmarca_Internalname = sPrefix+"vFLAGMARCA_"+sGXsfl_27_fel_idx ;
      edtavMinutos_Internalname = sPrefix+"vMINUTOS_"+sGXsfl_27_fel_idx ;
      chkavOp4.setInternalname( sPrefix+"vOP4_"+sGXsfl_27_fel_idx );
      edtBarTipArt_Internalname = sPrefix+"BARTIPART_"+sGXsfl_27_fel_idx ;
      edtHisProTip_Internalname = sPrefix+"HISPROTIP_"+sGXsfl_27_fel_idx ;
      edtavTipartdsc_Internalname = sPrefix+"vTIPARTDSC_"+sGXsfl_27_fel_idx ;
      edtHisProTc_Internalname = sPrefix+"HISPROTC_"+sGXsfl_27_fel_idx ;
      edtavTipcoldsc_Internalname = sPrefix+"vTIPCOLDSC_"+sGXsfl_27_fel_idx ;
      edtHisProDf_Internalname = sPrefix+"HISPRODF_"+sGXsfl_27_fel_idx ;
      edtavForrgb_Internalname = sPrefix+"vFORRGB_"+sGXsfl_27_fel_idx ;
      edtavR_Internalname = sPrefix+"vR_"+sGXsfl_27_fel_idx ;
      edtavG_Internalname = sPrefix+"vG_"+sGXsfl_27_fel_idx ;
      edtavB_Internalname = sPrefix+"vB_"+sGXsfl_27_fel_idx ;
      edtavTipdefcod_Internalname = sPrefix+"vTIPDEFCOD_"+sGXsfl_27_fel_idx ;
      edtavTipdefdsc_Internalname = sPrefix+"vTIPDEFDSC_"+sGXsfl_27_fel_idx ;
      edtavCostei_Internalname = sPrefix+"vCOSTEI_"+sGXsfl_27_fel_idx ;
      edtavCostet_Internalname = sPrefix+"vCOSTET_"+sGXsfl_27_fel_idx ;
      edtavCostek_Internalname = sPrefix+"vCOSTEK_"+sGXsfl_27_fel_idx ;
      edtavHdrp_Internalname = sPrefix+"vHDRP_"+sGXsfl_27_fel_idx ;
      edtavBarkgmtin_Internalname = sPrefix+"vBARKGMTIN_"+sGXsfl_27_fel_idx ;
      edtavBarkgstt_Internalname = sPrefix+"vBARKGSTT_"+sGXsfl_27_fel_idx ;
      edtavHisprotr2_Internalname = sPrefix+"vHISPROTR2_"+sGXsfl_27_fel_idx ;
      edtavHorreaint_Internalname = sPrefix+"vHORREAINT_"+sGXsfl_27_fel_idx ;
      edtavMinrea_Internalname = sPrefix+"vMINREA_"+sGXsfl_27_fel_idx ;
      edtParCod_Internalname = sPrefix+"PARCOD_"+sGXsfl_27_fel_idx ;
      edtParCodNom_Internalname = sPrefix+"PARCODNOM_"+sGXsfl_27_fel_idx ;
      edtBarTipCol_Internalname = sPrefix+"BARTIPCOL_"+sGXsfl_27_fel_idx ;
      edtHisProLot_Internalname = sPrefix+"HISPROLOT_"+sGXsfl_27_fel_idx ;
      edtHisProEst_Internalname = sPrefix+"HISPROEST_"+sGXsfl_27_fel_idx ;
   }

   public void sendrow_272( )
   {
      subsflControlProps_272( ) ;
      wb25I0( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_27_idx <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_27_idx) % (2))) == 0 )
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
            httpContext.writeText( " gxrow=\""+sGXsfl_27_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtEmprCod_Internalname,GXutil.rtrim( A396EmprCod),GXutil.rtrim( localUtil.format( A396EmprCod, "@!")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtEmprCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(27),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarCod_Internalname,GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(27),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarCodReo_Internalname,GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarCodReo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(27),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarCodPar_Internalname,GXutil.rtrim( A130BarCodPar),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarCodPar_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(27),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarNHdr_Internalname,GXutil.rtrim( A13696BarNHdr),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarNHdr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(11),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(27),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMaqCod_Internalname,GXutil.rtrim( A602MaqCod),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtMaqCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(27),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHisProFec_Internalname,localUtil.format(A558HisProFec, "99/99/99"),localUtil.format( A558HisProFec, "99/99/99"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtHisProFec_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(27),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHisProLin_Internalname,GXutil.ltrim( localUtil.ntoc( A561HisProLin, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A561HisProLin), "ZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtHisProLin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(27),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHisProKgr_Internalname,GXutil.ltrim( localUtil.ntoc( A1525HisProKgr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A1525HisProKgr, "ZZZZZ9.99")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtHisProKgr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(27),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHisProMtr_Internalname,GXutil.ltrim( localUtil.ntoc( A1526HisProMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A1526HisProMtr, "ZZZZZ9.99")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtHisProMtr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(27),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHisProTur_Internalname,GXutil.ltrim( localUtil.ntoc( A566HisProTur, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A566HisProTur), "9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtHisProTur_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(27),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHisProF_Internalname,GXutil.rtrim( A557HisProF),GXutil.rtrim( localUtil.format( A557HisProF, "@!")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtHisProF_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(27),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHisProDTI_Internalname,localUtil.ttoc( A4440HisProDTI, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "),localUtil.format( A4440HisProDTI, "99/99/99 99:99:99"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtHisProDTI_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(17),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(27),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHisProDTF_Internalname,localUtil.ttoc( A4441HisProDTF, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "),localUtil.format( A4441HisProDTF, "99/99/99 99:99:99"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtHisProDTF_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(17),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(27),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavHhmmalfa_Internalname,GXutil.rtrim( AV73HhMmAlfa),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavHhmmalfa_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavHhmmalfa_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(7),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(27),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCliNom_Internalname,GXutil.rtrim( A279CliNom),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtCliNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(27),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarSer_Internalname,GXutil.rtrim( A212BarSer),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarSer_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(27),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarColNom_Internalname,GXutil.rtrim( A135BarColNom),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarColNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(27),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarColNum_Internalname,GXutil.ltrim( localUtil.ntoc( A136BarColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A136BarColNum), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarColNum_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(27),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavMatcod_Internalname,GXutil.ltrim( localUtil.ntoc( AV81MatCod, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavMatcod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV81MatCod), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV81MatCod), "ZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavMatcod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavMatcod_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(27),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavMatdsc_Internalname,GXutil.rtrim( AV82MatDsc),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavMatdsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavMatdsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(27),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtGruOpeCod_Internalname,GXutil.ltrim( localUtil.ntoc( A503GruOpeCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A503GruOpeCod), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtGruOpeCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(27),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtGruOpeCodN_Internalname,GXutil.rtrim( A13892GruOpeCodN),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtGruOpeCodN_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(27),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFase_Internalname,GXutil.rtrim( A461Fase),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtFase_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(27),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFaseDescri_Internalname,GXutil.rtrim( A13893FaseDescri),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtFaseDescri_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(28),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(27),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavFlagmarca_Internalname,GXutil.ltrim( localUtil.ntoc( AV80FlagMarca, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavFlagmarca_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV80FlagMarca), "9") : localUtil.format( DecimalUtil.doubleToDec(AV80FlagMarca), "9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavFlagmarca_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavFlagmarca_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(27),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavMinutos_Internalname,GXutil.ltrim( localUtil.ntoc( AV74Minutos, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavMinutos_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV74Minutos), "ZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV74Minutos), "ZZZZZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavMinutos_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavMinutos_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(27),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+""+"\""+" style=\""+""+"\">") ;
         }
         /* Check box */
         ClassString = "Attribute" ;
         StyleString = "" ;
         GXCCtl = "vOP4_" + sGXsfl_27_idx ;
         chkavOp4.setName( GXCCtl );
         chkavOp4.setWebtags( "" );
         chkavOp4.setCaption( "" );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, chkavOp4.getInternalname(), "TitleCaption", chkavOp4.getCaption(), !bGXsfl_27_Refreshing);
         chkavOp4.setCheckedValue( "N" );
         GridRow.AddColumnProperties("checkbox", 1, isAjaxCallMode( ), new Object[] {chkavOp4.getInternalname(),AV83Op4,"","",Integer.valueOf(-1),Integer.valueOf(chkavOp4.getEnabled()),"S","",StyleString,ClassString,"WWColumn","",""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarTipArt_Internalname,GXutil.ltrim( localUtil.ntoc( A217BarTipArt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A217BarTipArt), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarTipArt_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(27),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHisProTip_Internalname,GXutil.ltrim( localUtil.ntoc( A2247HisProTip, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A2247HisProTip), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtHisProTip_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(27),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavTipartdsc_Internalname,GXutil.rtrim( AV36TipArtDsc),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavTipartdsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavTipartdsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(27),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHisProTc_Internalname,GXutil.ltrim( localUtil.ntoc( A3611HisProTc, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A3611HisProTc), "Z9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtHisProTc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(27),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavTipcoldsc_Internalname,GXutil.rtrim( AV44TipColDsc),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavTipcoldsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavTipcoldsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(27),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHisProDf_Internalname,localUtil.format(A5608HisProDf, "99/99/99"),localUtil.format( A5608HisProDf, "99/99/99"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtHisProDf_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(27),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavForrgb_Internalname,GXutil.ltrim( localUtil.ntoc( AV45ForRGB, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavForrgb_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV45ForRGB), "ZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV45ForRGB), "ZZZZZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavForrgb_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavForrgb_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(27),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavR_Internalname,GXutil.ltrim( localUtil.ntoc( AV48R, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavR_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV48R), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV48R), "ZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavR_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavR_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(27),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavG_Internalname,GXutil.ltrim( localUtil.ntoc( AV49G, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavG_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV49G), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV49G), "ZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavG_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavG_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(27),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavB_Internalname,GXutil.ltrim( localUtil.ntoc( AV50B, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavB_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV50B), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV50B), "ZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavB_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavB_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(27),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavTipdefcod_Internalname,GXutil.ltrim( localUtil.ntoc( AV42TipDefCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavTipdefcod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV42TipDefCod), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV42TipDefCod), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavTipdefcod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavTipdefcod_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(27),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavTipdefdsc_Internalname,GXutil.rtrim( AV43TipDefDsc),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavTipdefdsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavTipdefdsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(27),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavCostei_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCostei_Internalname,GXutil.ltrim( localUtil.ntoc( AV51CosteI, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavCostei_Enabled!=0) ? localUtil.format( AV51CosteI, "ZZZZZZ9.99") : localUtil.format( AV51CosteI, "ZZZZZZ9.99"))),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavCostei_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavCostei_Visible),Integer.valueOf(edtavCostei_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(27),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavCostet_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCostet_Internalname,GXutil.ltrim( localUtil.ntoc( AV52CosteT, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavCostet_Enabled!=0) ? localUtil.format( AV52CosteT, "ZZZZZZ9.99") : localUtil.format( AV52CosteT, "ZZZZZZ9.99"))),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavCostet_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavCostet_Visible),Integer.valueOf(edtavCostet_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(27),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavCostek_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCostek_Internalname,GXutil.ltrim( localUtil.ntoc( AV77CosteK, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavCostek_Enabled!=0) ? localUtil.format( AV77CosteK, "ZZZZZZ9.99") : localUtil.format( AV77CosteK, "ZZZZZZ9.99"))),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavCostek_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavCostek_Visible),Integer.valueOf(edtavCostek_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(27),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavHdrp_Internalname,GXutil.rtrim( AV59HdrP),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavHdrp_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavHdrp_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(11),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(27),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavBarkgmtin_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavBarkgmtin_Internalname,GXutil.ltrim( localUtil.ntoc( AV60BarKgmTin, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavBarkgmtin_Enabled!=0) ? localUtil.format( AV60BarKgmTin, "ZZZZZ9.99") : localUtil.format( AV60BarKgmTin, "ZZZZZ9.99"))),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavBarkgmtin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavBarkgmtin_Visible),Integer.valueOf(edtavBarkgmtin_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(27),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavBarkgstt_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavBarkgstt_Internalname,GXutil.ltrim( localUtil.ntoc( AV58BarKgsTt, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavBarkgstt_Enabled!=0) ? localUtil.format( AV58BarKgsTt, "ZZZZZZ9.99") : localUtil.format( AV58BarKgsTt, "ZZZZZZ9.99"))),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavBarkgstt_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavBarkgstt_Visible),Integer.valueOf(edtavBarkgstt_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(27),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavHisprotr2_Internalname,GXutil.ltrim( localUtil.ntoc( AV67HisProTr2, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavHisprotr2_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV67HisProTr2), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV67HisProTr2), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavHisprotr2_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavHisprotr2_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(27),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavHorreaint_Internalname,GXutil.ltrim( localUtil.ntoc( AV69HorReaInt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavHorreaint_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV69HorReaInt), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV69HorReaInt), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavHorreaint_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavHorreaint_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(27),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavMinrea_Internalname,GXutil.ltrim( localUtil.ntoc( AV70MinRea, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavMinrea_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV70MinRea), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV70MinRea), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavMinrea_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavMinrea_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(27),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtParCod_Internalname,GXutil.ltrim( localUtil.ntoc( A656ParCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A656ParCod), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtParCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(27),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtParCodNom_Internalname,GXutil.rtrim( A867ParCodNom),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtParCodNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(27),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarTipCol_Internalname,GXutil.ltrim( localUtil.ntoc( A218BarTipCol, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A218BarTipCol), "Z9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarTipCol_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(27),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHisProLot_Internalname,GXutil.rtrim( A3610HisProLot),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtHisProLot_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(27),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHisProEst_Internalname,GXutil.ltrim( localUtil.ntoc( A556HisProEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A556HisProEst), "9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtHisProEst_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(27),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         send_integrity_lvl_hashes25I2( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_27_idx = ((subGrid_Islastpage==1)&&(nGXsfl_27_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_27_idx+1) ;
         sGXsfl_27_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_27_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_272( ) ;
      }
      /* End function sendrow_272 */
   }

   public void startgridcontrol27( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+sPrefix+"GridContainer"+"DivS\" data-gxgridid=\"27\">") ;
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
         httpContext.writeValue( httpContext.getMessage( "Código Empresa", "")) ;
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
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Hdr", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Máquina", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fecha", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Linea Barcada", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Kgs.", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Mts.", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "T", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "F?", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Inicio", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fin", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "HhMm", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cliente", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Artículo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Color", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Número", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Tono", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "T.Descripción", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Operario", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Operario", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fase", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "F.Descripción", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Flag", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Minutos", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+""+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "T.Art.Hdr", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Tipo Artículo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "T.A.Descripción", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Tc", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "T.C.Descripción", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Día fin", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "For Rgb", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "R", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "G", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "B", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Código", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Defecto", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavCostei_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Coste I", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavCostet_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Coste T", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavCostek_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Coste p/k", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Hdr P", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavBarkgmtin_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Kgs", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavBarkgstt_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Kgs Tot", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "TReal", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Hh", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Mm", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Paro", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "P.Descripción", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "TC", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Lote", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Estado", "")) ;
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
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A396EmprCod));
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
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A13696BarNHdr));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A602MaqCod));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.format(A558HisProFec, "99/99/99"));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A561HisProLin, (byte)(8), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1525HisProKgr, (byte)(9), (byte)(2), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1526HisProMtr, (byte)(9), (byte)(2), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A566HisProTur, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A557HisProF));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.ttoc( A4440HisProDTI, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.ttoc( A4441HisProDTF, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV73HhMmAlfa));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavHhmmalfa_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A279CliNom));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A212BarSer));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A135BarColNom));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A136BarColNum, (byte)(6), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV81MatCod, (byte)(3), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavMatcod_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV82MatDsc));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavMatdsc_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A503GruOpeCod, (byte)(6), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A13892GruOpeCodN));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A461Fase));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A13893FaseDescri));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV80FlagMarca, (byte)(1), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavFlagmarca_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV74Minutos, (byte)(10), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavMinutos_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV83Op4));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( chkavOp4.getEnabled(), (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A217BarTipArt, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A2247HisProTip, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV36TipArtDsc));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavTipartdsc_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A3611HisProTc, (byte)(2), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV44TipColDsc));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavTipcoldsc_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.format(A5608HisProDf, "99/99/99"));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV45ForRGB, (byte)(10), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavForrgb_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV48R, (byte)(3), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavR_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV49G, (byte)(3), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavG_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV50B, (byte)(3), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavB_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV42TipDefCod, (byte)(4), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavTipdefcod_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV43TipDefDsc));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavTipdefdsc_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV51CosteI, (byte)(10), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCostei_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavCostei_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV52CosteT, (byte)(10), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCostet_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavCostet_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV77CosteK, (byte)(10), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCostek_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavCostek_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV59HdrP));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavHdrp_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV60BarKgmTin, (byte)(9), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavBarkgmtin_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavBarkgmtin_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV58BarKgsTt, (byte)(10), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavBarkgstt_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavBarkgstt_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV67HisProTr2, (byte)(4), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavHisprotr2_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV69HorReaInt, (byte)(4), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavHorreaint_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV70MinRea, (byte)(4), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavMinrea_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A656ParCod, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A867ParCodNom));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A218BarTipCol, (byte)(2), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A3610HisProLot));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A556HisProEst, (byte)(1), (byte)(0), ".", "")));
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
      bttBtnbuttonexcel_Internalname = sPrefix+"BTNBUTTONEXCEL" ;
      divTableactions_Internalname = sPrefix+"TABLEACTIONS" ;
      divTableheader_Internalname = sPrefix+"TABLEHEADER" ;
      Dvpanel_tableheader_Internalname = sPrefix+"DVPANEL_TABLEHEADER" ;
      edtEmprCod_Internalname = sPrefix+"EMPRCOD" ;
      edtBarCod_Internalname = sPrefix+"BARCOD" ;
      edtBarCodReo_Internalname = sPrefix+"BARCODREO" ;
      edtBarCodPar_Internalname = sPrefix+"BARCODPAR" ;
      edtBarNHdr_Internalname = sPrefix+"BARNHDR" ;
      edtMaqCod_Internalname = sPrefix+"MAQCOD" ;
      edtHisProFec_Internalname = sPrefix+"HISPROFEC" ;
      edtHisProLin_Internalname = sPrefix+"HISPROLIN" ;
      edtHisProKgr_Internalname = sPrefix+"HISPROKGR" ;
      edtHisProMtr_Internalname = sPrefix+"HISPROMTR" ;
      edtHisProTur_Internalname = sPrefix+"HISPROTUR" ;
      edtHisProF_Internalname = sPrefix+"HISPROF" ;
      edtHisProDTI_Internalname = sPrefix+"HISPRODTI" ;
      edtHisProDTF_Internalname = sPrefix+"HISPRODTF" ;
      edtavHhmmalfa_Internalname = sPrefix+"vHHMMALFA" ;
      edtCliNom_Internalname = sPrefix+"CLINOM" ;
      edtBarSer_Internalname = sPrefix+"BARSER" ;
      edtBarColNom_Internalname = sPrefix+"BARCOLNOM" ;
      edtBarColNum_Internalname = sPrefix+"BARCOLNUM" ;
      edtavMatcod_Internalname = sPrefix+"vMATCOD" ;
      edtavMatdsc_Internalname = sPrefix+"vMATDSC" ;
      edtGruOpeCod_Internalname = sPrefix+"GRUOPECOD" ;
      edtGruOpeCodN_Internalname = sPrefix+"GRUOPECODN" ;
      edtFase_Internalname = sPrefix+"FASE" ;
      edtFaseDescri_Internalname = sPrefix+"FASEDESCRI" ;
      edtavFlagmarca_Internalname = sPrefix+"vFLAGMARCA" ;
      edtavMinutos_Internalname = sPrefix+"vMINUTOS" ;
      chkavOp4.setInternalname( sPrefix+"vOP4" );
      edtBarTipArt_Internalname = sPrefix+"BARTIPART" ;
      edtHisProTip_Internalname = sPrefix+"HISPROTIP" ;
      edtavTipartdsc_Internalname = sPrefix+"vTIPARTDSC" ;
      edtHisProTc_Internalname = sPrefix+"HISPROTC" ;
      edtavTipcoldsc_Internalname = sPrefix+"vTIPCOLDSC" ;
      edtHisProDf_Internalname = sPrefix+"HISPRODF" ;
      edtavForrgb_Internalname = sPrefix+"vFORRGB" ;
      edtavR_Internalname = sPrefix+"vR" ;
      edtavG_Internalname = sPrefix+"vG" ;
      edtavB_Internalname = sPrefix+"vB" ;
      edtavTipdefcod_Internalname = sPrefix+"vTIPDEFCOD" ;
      edtavTipdefdsc_Internalname = sPrefix+"vTIPDEFDSC" ;
      edtavCostei_Internalname = sPrefix+"vCOSTEI" ;
      edtavCostet_Internalname = sPrefix+"vCOSTET" ;
      edtavCostek_Internalname = sPrefix+"vCOSTEK" ;
      edtavHdrp_Internalname = sPrefix+"vHDRP" ;
      edtavBarkgmtin_Internalname = sPrefix+"vBARKGMTIN" ;
      edtavBarkgstt_Internalname = sPrefix+"vBARKGSTT" ;
      edtavHisprotr2_Internalname = sPrefix+"vHISPROTR2" ;
      edtavHorreaint_Internalname = sPrefix+"vHORREAINT" ;
      edtavMinrea_Internalname = sPrefix+"vMINREA" ;
      edtParCod_Internalname = sPrefix+"PARCOD" ;
      edtParCodNom_Internalname = sPrefix+"PARCODNOM" ;
      edtBarTipCol_Internalname = sPrefix+"BARTIPCOL" ;
      edtHisProLot_Internalname = sPrefix+"HISPROLOT" ;
      edtHisProEst_Internalname = sPrefix+"HISPROEST" ;
      edtavTotvaluehisprokgr_Internalname = sPrefix+"vTOTVALUEHISPROKGR" ;
      edtavTotvaluehispromtr_Internalname = sPrefix+"vTOTVALUEHISPROMTR" ;
      tblGridtabletotalizer_Internalname = sPrefix+"GRIDTABLETOTALIZER" ;
      Gridpaginationbar_Internalname = sPrefix+"GRIDPAGINATIONBAR" ;
      divGridtablewithpaginationbar_Internalname = sPrefix+"GRIDTABLEWITHPAGINATIONBAR" ;
      edtavPgmname_Internalname = sPrefix+"vPGMNAME" ;
      Datamonjs_Internalname = sPrefix+"DATAMONJS" ;
      divTablemain_Internalname = sPrefix+"TABLEMAIN" ;
      Ddo_grid_Internalname = sPrefix+"DDO_GRID" ;
      Grid_empowerer_Internalname = sPrefix+"GRID_EMPOWERER" ;
      edtavDdo_hisprofecauxdate_Internalname = sPrefix+"vDDO_HISPROFECAUXDATE" ;
      divDdo_hisprofecauxdates_Internalname = sPrefix+"DDO_HISPROFECAUXDATES" ;
      edtavDdo_hisprodtiauxdate_Internalname = sPrefix+"vDDO_HISPRODTIAUXDATE" ;
      divDdo_hisprodtiauxdates_Internalname = sPrefix+"DDO_HISPRODTIAUXDATES" ;
      edtavDdo_hisprodtfauxdate_Internalname = sPrefix+"vDDO_HISPRODTFAUXDATE" ;
      divDdo_hisprodtfauxdates_Internalname = sPrefix+"DDO_HISPRODTFAUXDATES" ;
      edtavDdo_hisprodfauxdate_Internalname = sPrefix+"vDDO_HISPRODFAUXDATE" ;
      divDdo_hisprodfauxdates_Internalname = sPrefix+"DDO_HISPRODFAUXDATES" ;
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
      edtHisProEst_Jsonclick = "" ;
      edtHisProLot_Jsonclick = "" ;
      edtBarTipCol_Jsonclick = "" ;
      edtParCodNom_Jsonclick = "" ;
      edtParCod_Jsonclick = "" ;
      edtavMinrea_Jsonclick = "" ;
      edtavMinrea_Enabled = 0 ;
      edtavHorreaint_Jsonclick = "" ;
      edtavHorreaint_Enabled = 0 ;
      edtavHisprotr2_Jsonclick = "" ;
      edtavHisprotr2_Enabled = 0 ;
      edtavBarkgstt_Jsonclick = "" ;
      edtavBarkgstt_Enabled = 0 ;
      edtavBarkgmtin_Jsonclick = "" ;
      edtavBarkgmtin_Enabled = 0 ;
      edtavHdrp_Jsonclick = "" ;
      edtavHdrp_Enabled = 0 ;
      edtavCostek_Jsonclick = "" ;
      edtavCostek_Enabled = 0 ;
      edtavCostet_Jsonclick = "" ;
      edtavCostet_Enabled = 0 ;
      edtavCostei_Jsonclick = "" ;
      edtavCostei_Enabled = 0 ;
      edtavTipdefdsc_Jsonclick = "" ;
      edtavTipdefdsc_Enabled = 0 ;
      edtavTipdefcod_Jsonclick = "" ;
      edtavTipdefcod_Enabled = 0 ;
      edtavB_Jsonclick = "" ;
      edtavB_Enabled = 0 ;
      edtavG_Jsonclick = "" ;
      edtavG_Enabled = 0 ;
      edtavR_Jsonclick = "" ;
      edtavR_Enabled = 0 ;
      edtavForrgb_Jsonclick = "" ;
      edtavForrgb_Enabled = 0 ;
      edtHisProDf_Jsonclick = "" ;
      edtavTipcoldsc_Jsonclick = "" ;
      edtavTipcoldsc_Enabled = 0 ;
      edtHisProTc_Jsonclick = "" ;
      edtavTipartdsc_Jsonclick = "" ;
      edtavTipartdsc_Enabled = 0 ;
      edtHisProTip_Jsonclick = "" ;
      edtBarTipArt_Jsonclick = "" ;
      chkavOp4.setCaption( "" );
      chkavOp4.setEnabled( 0 );
      edtavMinutos_Jsonclick = "" ;
      edtavMinutos_Enabled = 0 ;
      edtavFlagmarca_Jsonclick = "" ;
      edtavFlagmarca_Enabled = 0 ;
      edtFaseDescri_Jsonclick = "" ;
      edtFase_Jsonclick = "" ;
      edtGruOpeCodN_Jsonclick = "" ;
      edtGruOpeCod_Jsonclick = "" ;
      edtavMatdsc_Jsonclick = "" ;
      edtavMatdsc_Enabled = 0 ;
      edtavMatcod_Jsonclick = "" ;
      edtavMatcod_Enabled = 0 ;
      edtBarColNum_Jsonclick = "" ;
      edtBarColNom_Jsonclick = "" ;
      edtBarSer_Jsonclick = "" ;
      edtCliNom_Jsonclick = "" ;
      edtavHhmmalfa_Jsonclick = "" ;
      edtavHhmmalfa_Enabled = 0 ;
      edtHisProDTF_Jsonclick = "" ;
      edtHisProDTI_Jsonclick = "" ;
      edtHisProF_Jsonclick = "" ;
      edtHisProTur_Jsonclick = "" ;
      edtHisProMtr_Jsonclick = "" ;
      edtHisProKgr_Jsonclick = "" ;
      edtHisProLin_Jsonclick = "" ;
      edtHisProFec_Jsonclick = "" ;
      edtMaqCod_Jsonclick = "" ;
      edtBarNHdr_Jsonclick = "" ;
      edtBarCodPar_Jsonclick = "" ;
      edtBarCodReo_Jsonclick = "" ;
      edtBarCod_Jsonclick = "" ;
      edtEmprCod_Jsonclick = "" ;
      subGrid_Class = "GridWithTotalizer GridWithPaginationBar GridNoBorder WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavTotvaluehispromtr_Jsonclick = "" ;
      edtavTotvaluehispromtr_Enabled = 1 ;
      edtavTotvaluehisprokgr_Jsonclick = "" ;
      edtavTotvaluehisprokgr_Enabled = 1 ;
      subGrid_Sortable = (byte)(0) ;
      edtavDdo_hisprodfauxdate_Jsonclick = "" ;
      edtavDdo_hisprodtfauxdate_Jsonclick = "" ;
      edtavDdo_hisprodtiauxdate_Jsonclick = "" ;
      edtavDdo_hisprofecauxdate_Jsonclick = "" ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      Grid_empowerer_Hastitlesettings = GXutil.toBoolean( -1) ;
      Ddo_grid_Datalistproc = "Produccion.InformeProduccionResumenHdr_WC1GetFilterData" ;
      Ddo_grid_Datalisttype = "Dynamic|Dynamic|||||Dynamic|||Dynamic|Dynamic|Dynamic|||Dynamic|Dynamic||||||Dynamic" ;
      Ddo_grid_Includedatalist = "T|T|||||T|||T|T|T|||T|T||||||T" ;
      Ddo_grid_Filterisrange = "|||T|T|T|||||||T||||T|T|T||T|" ;
      Ddo_grid_Filtertype = "Character|Character|Date|Numeric|Numeric|Numeric|Character|Date|Date|Character|Character|Character|Numeric||Character|Character|Numeric|Numeric|Numeric|Date|Numeric|Character" ;
      Ddo_grid_Includefilter = "T|T|T|T|T|T|T|T|T|T|T|T|T||T|T|T|T|T|T|T|T" ;
      Ddo_grid_Includesortasc = "|T|T|T|T|T|T|T|T|T|T|T|T|T|T||T|T|T|T|T|T" ;
      Ddo_grid_Columnssortvalues = "|1|2|3|4|5|6|7|8|9|10|11|12|13|14||15|16|17|18|19|20" ;
      Ddo_grid_Columnids = "4:BarNHdr|5:MaqCod|6:HisProFec|8:HisProKgr|9:HisProMtr|10:HisProTur|11:HisProF|12:HisProDTI|13:HisProDTF|15:CliNom|16:BarSer|17:BarColNom|18:BarColNum|21:GruOpeCod|23:Fase|24:FaseDescripcion|28:BarTipArt|29:HisProTip|31:HisProTc|33:HisProDf|49:ParCod|50:ParCodNom" ;
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
      edtavBarkgstt_Visible = -1 ;
      edtavBarkgmtin_Visible = -1 ;
      edtavCostek_Visible = -1 ;
      edtavCostet_Visible = -1 ;
      edtavCostei_Visible = -1 ;
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
      GXCCtl = "vOP4_" + sGXsfl_27_idx ;
      chkavOp4.setName( GXCCtl );
      chkavOp4.setWebtags( "" );
      chkavOp4.setCaption( "" );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, chkavOp4.getInternalname(), "TitleCaption", chkavOp4.getCaption(), !bGXsfl_27_Refreshing);
      chkavOp4.setCheckedValue( "N" );
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'edtavCostei_Visible',ctrl:'vCOSTEI',prop:'Visible'},{av:'edtavCostet_Visible',ctrl:'vCOSTET',prop:'Visible'},{av:'edtavCostek_Visible',ctrl:'vCOSTEK',prop:'Visible'},{av:'edtavBarkgmtin_Visible',ctrl:'vBARKGMTIN',prop:'Visible'},{av:'edtavBarkgstt_Visible',ctrl:'vBARKGSTT',prop:'Visible'},{av:'AV82MatDsc',fld:'vMATDSC',pic:'',hsh:true},{av:'AV81MatCod',fld:'vMATCOD',pic:'ZZ9',hsh:true},{av:'A2316BarAgrLot',fld:'BARAGRLOT',pic:''},{av:'A457FasCod',fld:'FASCOD',pic:'@!'},{av:'A14054FasDivTime',fld:'FASDIVTIME',pic:''},{av:'A1933BarCodTin',fld:'BARCODTIN',pic:'ZZZZZZZ9'},{av:'A1934BarReoTin',fld:'BARREOTIN',pic:'9'},{av:'A1935BarParTin',fld:'BARPARTIN',pic:''},{av:'A1945BarMaqTin',fld:'BARMAQTIN',pic:''},{av:'A8563BarKgsTt',fld:'BARKGSTT',pic:'ZZZZZZ9.99'},{av:'A1947BarKgmTin',fld:'BARKGMTIN',pic:'ZZZZZ9.99'},{av:'A3705BarCosCol',fld:'BARCOSCOL',pic:'ZZZZZZ9.99'},{av:'A3658BarCosPA',fld:'BARCOSPA',pic:'ZZZZZZ9.99'},{av:'A3654BarCosPD',fld:'BARCOSPD',pic:'ZZZZZZ9.99'},{av:'A3657BarCosAA',fld:'BARCOSAA',pic:'ZZZZZZ9.99'},{av:'A3656BarCosAD',fld:'BARCOSAD',pic:'ZZZZZZ9.99'},{av:'A3706BarCosAnc',fld:'BARCOSANC',pic:'ZZZZZZ9.99'},{av:'sPrefix'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV15INEmprcod',fld:'vINEMPRCOD',pic:'@!'},{av:'AV16INHisEstReo',fld:'vINHISESTREO',pic:'9'},{av:'AV19INMaqCod1',fld:'vINMAQCOD1',pic:''},{av:'AV20INMaqCod2',fld:'vINMAQCOD2',pic:''},{av:'AV17INHisProFec1',fld:'vINHISPROFEC1',pic:'99/99/99 99:99:99'},{av:'AV18INHisProFec2',fld:'vINHISPROFEC2',pic:'99/99/99 99:99:99'},{av:'AV125OperarioFrom',fld:'vOPERARIOFROM',pic:'ZZZZZ9'},{av:'AV126OperarioTo',fld:'vOPERARIOTO',pic:'ZZZZZ9'},{av:'AV140Pgmname',fld:'vPGMNAME',pic:''},{av:'AV21OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV22OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV89TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV90TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV101TFMaqCod',fld:'vTFMAQCOD',pic:''},{av:'AV102TFMaqCod_Sel',fld:'vTFMAQCOD_SEL',pic:''},{av:'AV103TFHisProFec',fld:'vTFHISPROFEC',pic:''},{av:'AV105TFHisProKgr',fld:'vTFHISPROKGR',pic:'ZZZZZ9.99'},{av:'AV106TFHisProKgr_To',fld:'vTFHISPROKGR_TO',pic:'ZZZZZ9.99'},{av:'AV107TFHisProMtr',fld:'vTFHISPROMTR',pic:'ZZZZZ9.99'},{av:'AV108TFHisProMtr_To',fld:'vTFHISPROMTR_TO',pic:'ZZZZZ9.99'},{av:'AV109TFHisProTur',fld:'vTFHISPROTUR',pic:'9'},{av:'AV110TFHisProTur_To',fld:'vTFHISPROTUR_TO',pic:'9'},{av:'AV93TFHisProF',fld:'vTFHISPROF',pic:'@!'},{av:'AV94TFHisProF_Sel',fld:'vTFHISPROF_SEL',pic:'@!'},{av:'AV111TFHisProDTI',fld:'vTFHISPRODTI',pic:'99/99/99 99:99:99'},{av:'AV113TFHisProDTF',fld:'vTFHISPRODTF',pic:'99/99/99 99:99:99'},{av:'AV91TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV92TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV53TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV54TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV85TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV86TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV87TFBarColNum',fld:'vTFBARCOLNUM',pic:'ZZZZZ9'},{av:'AV88TFBarColNum_To',fld:'vTFBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV117TFFase',fld:'vTFFASE',pic:''},{av:'AV118TFFase_Sel',fld:'vTFFASE_SEL',pic:''},{av:'AV119TFFaseDescripcion',fld:'vTFFASEDESCRIPCION',pic:''},{av:'AV120TFFaseDescripcion_Sel',fld:'vTFFASEDESCRIPCION_SEL',pic:''},{av:'AV99TFBarTipArt',fld:'vTFBARTIPART',pic:'ZZZ9'},{av:'AV100TFBarTipArt_To',fld:'vTFBARTIPART_TO',pic:'ZZZ9'},{av:'AV121TFHisProTip',fld:'vTFHISPROTIP',pic:'ZZZ9'},{av:'AV122TFHisProTip_To',fld:'vTFHISPROTIP_TO',pic:'ZZZ9'},{av:'AV123TFHisProTc',fld:'vTFHISPROTC',pic:'Z9'},{av:'AV124TFHisProTc_To',fld:'vTFHISPROTC_TO',pic:'Z9'},{av:'AV46TFHisProDf',fld:'vTFHISPRODF',pic:''},{av:'AV37TFParCod',fld:'vTFPARCOD',pic:'ZZZ9'},{av:'AV38TFParCod_To',fld:'vTFPARCOD_TO',pic:'ZZZ9'},{av:'AV39TFParCodNom',fld:'vTFPARCODNOM',pic:''},{av:'AV40TFParCodNom_Sel',fld:'vTFPARCODNOM_SEL',pic:''},{av:'AV95TotHisProKgr',fld:'vTOTHISPROKGR',pic:'ZZZZZ9.99',hsh:true},{av:'AV96TotHisProMtr',fld:'vTOTHISPROMTR',pic:'ZZZZZ9.99',hsh:true},{av:'AV79fechadt',fld:'vFECHADT',pic:'99/99/99 99:99',hsh:true},{av:'AV30FasDivTime',fld:'vFASDIVTIME',pic:'',hsh:true},{av:'AV129MinutosTotal',fld:'vMINUTOSTOTAL',pic:'ZZZZZZZZZ9',hsh:true},{av:'AV133tiempom',fld:'vTIEMPOM',pic:'ZZZZZ9',hsh:true},{av:'AV6EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV57FasCod',fld:'vFASCOD',pic:'@!',hsh:true},{av:'AV61BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV62BarCodReo',fld:'vBARCODREO',pic:'9',hsh:true},{av:'AV63BarCodPar',fld:'vBARCODPAR',pic:'',hsh:true},{av:'A13696BarNHdr',fld:'BARNHDR',pic:''},{av:'A602MaqCod',fld:'MAQCOD',pic:''},{av:'A558HisProFec',fld:'HISPROFEC',pic:''},{av:'A1525HisProKgr',fld:'HISPROKGR',pic:'ZZZZZ9.99'},{av:'A1526HisProMtr',fld:'HISPROMTR',pic:'ZZZZZ9.99'},{av:'A566HisProTur',fld:'HISPROTUR',pic:'9'},{av:'A557HisProF',fld:'HISPROF',pic:'@!'},{av:'A4440HisProDTI',fld:'HISPRODTI',pic:'99/99/99 99:99:99'},{av:'A4441HisProDTF',fld:'HISPRODTF',pic:'99/99/99 99:99:99'},{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'A212BarSer',fld:'BARSER',pic:''},{av:'A135BarColNom',fld:'BARCOLNOM',pic:''},{av:'A136BarColNum',fld:'BARCOLNUM',pic:'ZZZZZ9'},{av:'A461Fase',fld:'FASE',pic:''},{av:'A13893FaseDescri',fld:'FASEDESCRI',pic:''},{av:'A217BarTipArt',fld:'BARTIPART',pic:'ZZZ9'},{av:'A2247HisProTip',fld:'HISPROTIP',pic:'ZZZ9'},{av:'A3611HisProTc',fld:'HISPROTC',pic:'Z9'},{av:'A5608HisProDf',fld:'HISPRODF',pic:''},{av:'A656ParCod',fld:'PARCOD',pic:'ZZZ9'},{av:'A867ParCodNom',fld:'PARCODNOM',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A3612HisProReo',fld:'HISPROREO',pic:'9'},{av:'A503GruOpeCod',fld:'GRUOPECOD',pic:'ZZZZZ9'}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV10GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV11GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV95TotHisProKgr',fld:'vTOTHISPROKGR',pic:'ZZZZZ9.99',hsh:true},{av:'AV96TotHisProMtr',fld:'vTOTHISPROMTR',pic:'ZZZZZ9.99',hsh:true},{av:'AV97TotValueHisProKgr',fld:'vTOTVALUEHISPROKGR',pic:''},{av:'AV98TotValueHisProMtr',fld:'vTOTVALUEHISPROMTR',pic:''}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e1125I2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV15INEmprcod',fld:'vINEMPRCOD',pic:'@!'},{av:'AV16INHisEstReo',fld:'vINHISESTREO',pic:'9'},{av:'AV19INMaqCod1',fld:'vINMAQCOD1',pic:''},{av:'AV20INMaqCod2',fld:'vINMAQCOD2',pic:''},{av:'AV17INHisProFec1',fld:'vINHISPROFEC1',pic:'99/99/99 99:99:99'},{av:'AV18INHisProFec2',fld:'vINHISPROFEC2',pic:'99/99/99 99:99:99'},{av:'AV125OperarioFrom',fld:'vOPERARIOFROM',pic:'ZZZZZ9'},{av:'AV126OperarioTo',fld:'vOPERARIOTO',pic:'ZZZZZ9'},{av:'AV140Pgmname',fld:'vPGMNAME',pic:''},{av:'AV21OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV22OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV89TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV90TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV101TFMaqCod',fld:'vTFMAQCOD',pic:''},{av:'AV102TFMaqCod_Sel',fld:'vTFMAQCOD_SEL',pic:''},{av:'AV103TFHisProFec',fld:'vTFHISPROFEC',pic:''},{av:'AV105TFHisProKgr',fld:'vTFHISPROKGR',pic:'ZZZZZ9.99'},{av:'AV106TFHisProKgr_To',fld:'vTFHISPROKGR_TO',pic:'ZZZZZ9.99'},{av:'AV107TFHisProMtr',fld:'vTFHISPROMTR',pic:'ZZZZZ9.99'},{av:'AV108TFHisProMtr_To',fld:'vTFHISPROMTR_TO',pic:'ZZZZZ9.99'},{av:'AV109TFHisProTur',fld:'vTFHISPROTUR',pic:'9'},{av:'AV110TFHisProTur_To',fld:'vTFHISPROTUR_TO',pic:'9'},{av:'AV93TFHisProF',fld:'vTFHISPROF',pic:'@!'},{av:'AV94TFHisProF_Sel',fld:'vTFHISPROF_SEL',pic:'@!'},{av:'AV111TFHisProDTI',fld:'vTFHISPRODTI',pic:'99/99/99 99:99:99'},{av:'AV113TFHisProDTF',fld:'vTFHISPRODTF',pic:'99/99/99 99:99:99'},{av:'AV91TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV92TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV53TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV54TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV85TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV86TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV87TFBarColNum',fld:'vTFBARCOLNUM',pic:'ZZZZZ9'},{av:'AV88TFBarColNum_To',fld:'vTFBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV117TFFase',fld:'vTFFASE',pic:''},{av:'AV118TFFase_Sel',fld:'vTFFASE_SEL',pic:''},{av:'AV119TFFaseDescripcion',fld:'vTFFASEDESCRIPCION',pic:''},{av:'AV120TFFaseDescripcion_Sel',fld:'vTFFASEDESCRIPCION_SEL',pic:''},{av:'AV99TFBarTipArt',fld:'vTFBARTIPART',pic:'ZZZ9'},{av:'AV100TFBarTipArt_To',fld:'vTFBARTIPART_TO',pic:'ZZZ9'},{av:'AV121TFHisProTip',fld:'vTFHISPROTIP',pic:'ZZZ9'},{av:'AV122TFHisProTip_To',fld:'vTFHISPROTIP_TO',pic:'ZZZ9'},{av:'AV123TFHisProTc',fld:'vTFHISPROTC',pic:'Z9'},{av:'AV124TFHisProTc_To',fld:'vTFHISPROTC_TO',pic:'Z9'},{av:'AV46TFHisProDf',fld:'vTFHISPRODF',pic:''},{av:'AV37TFParCod',fld:'vTFPARCOD',pic:'ZZZ9'},{av:'AV38TFParCod_To',fld:'vTFPARCOD_TO',pic:'ZZZ9'},{av:'AV39TFParCodNom',fld:'vTFPARCODNOM',pic:''},{av:'AV40TFParCodNom_Sel',fld:'vTFPARCODNOM_SEL',pic:''},{av:'AV95TotHisProKgr',fld:'vTOTHISPROKGR',pic:'ZZZZZ9.99',hsh:true},{av:'AV96TotHisProMtr',fld:'vTOTHISPROMTR',pic:'ZZZZZ9.99',hsh:true},{av:'edtavCostei_Visible',ctrl:'vCOSTEI',prop:'Visible'},{av:'edtavCostet_Visible',ctrl:'vCOSTET',prop:'Visible'},{av:'edtavCostek_Visible',ctrl:'vCOSTEK',prop:'Visible'},{av:'edtavBarkgmtin_Visible',ctrl:'vBARKGMTIN',prop:'Visible'},{av:'edtavBarkgstt_Visible',ctrl:'vBARKGSTT',prop:'Visible'},{av:'AV82MatDsc',fld:'vMATDSC',pic:'',hsh:true},{av:'AV81MatCod',fld:'vMATCOD',pic:'ZZ9',hsh:true},{av:'AV79fechadt',fld:'vFECHADT',pic:'99/99/99 99:99',hsh:true},{av:'A2316BarAgrLot',fld:'BARAGRLOT',pic:''},{av:'AV30FasDivTime',fld:'vFASDIVTIME',pic:'',hsh:true},{av:'AV129MinutosTotal',fld:'vMINUTOSTOTAL',pic:'ZZZZZZZZZ9',hsh:true},{av:'AV133tiempom',fld:'vTIEMPOM',pic:'ZZZZZ9',hsh:true},{av:'A457FasCod',fld:'FASCOD',pic:'@!'},{av:'AV6EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV57FasCod',fld:'vFASCOD',pic:'@!',hsh:true},{av:'A14054FasDivTime',fld:'FASDIVTIME',pic:''},{av:'A1933BarCodTin',fld:'BARCODTIN',pic:'ZZZZZZZ9'},{av:'A1934BarReoTin',fld:'BARREOTIN',pic:'9'},{av:'A1935BarParTin',fld:'BARPARTIN',pic:''},{av:'AV61BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV62BarCodReo',fld:'vBARCODREO',pic:'9',hsh:true},{av:'AV63BarCodPar',fld:'vBARCODPAR',pic:'',hsh:true},{av:'A1945BarMaqTin',fld:'BARMAQTIN',pic:''},{av:'A8563BarKgsTt',fld:'BARKGSTT',pic:'ZZZZZZ9.99'},{av:'A1947BarKgmTin',fld:'BARKGMTIN',pic:'ZZZZZ9.99'},{av:'A3705BarCosCol',fld:'BARCOSCOL',pic:'ZZZZZZ9.99'},{av:'A3658BarCosPA',fld:'BARCOSPA',pic:'ZZZZZZ9.99'},{av:'A3654BarCosPD',fld:'BARCOSPD',pic:'ZZZZZZ9.99'},{av:'A3657BarCosAA',fld:'BARCOSAA',pic:'ZZZZZZ9.99'},{av:'A3656BarCosAD',fld:'BARCOSAD',pic:'ZZZZZZ9.99'},{av:'A3706BarCosAnc',fld:'BARCOSANC',pic:'ZZZZZZ9.99'},{av:'sPrefix'},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e1225I2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV15INEmprcod',fld:'vINEMPRCOD',pic:'@!'},{av:'AV16INHisEstReo',fld:'vINHISESTREO',pic:'9'},{av:'AV19INMaqCod1',fld:'vINMAQCOD1',pic:''},{av:'AV20INMaqCod2',fld:'vINMAQCOD2',pic:''},{av:'AV17INHisProFec1',fld:'vINHISPROFEC1',pic:'99/99/99 99:99:99'},{av:'AV18INHisProFec2',fld:'vINHISPROFEC2',pic:'99/99/99 99:99:99'},{av:'AV125OperarioFrom',fld:'vOPERARIOFROM',pic:'ZZZZZ9'},{av:'AV126OperarioTo',fld:'vOPERARIOTO',pic:'ZZZZZ9'},{av:'AV140Pgmname',fld:'vPGMNAME',pic:''},{av:'AV21OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV22OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV89TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV90TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV101TFMaqCod',fld:'vTFMAQCOD',pic:''},{av:'AV102TFMaqCod_Sel',fld:'vTFMAQCOD_SEL',pic:''},{av:'AV103TFHisProFec',fld:'vTFHISPROFEC',pic:''},{av:'AV105TFHisProKgr',fld:'vTFHISPROKGR',pic:'ZZZZZ9.99'},{av:'AV106TFHisProKgr_To',fld:'vTFHISPROKGR_TO',pic:'ZZZZZ9.99'},{av:'AV107TFHisProMtr',fld:'vTFHISPROMTR',pic:'ZZZZZ9.99'},{av:'AV108TFHisProMtr_To',fld:'vTFHISPROMTR_TO',pic:'ZZZZZ9.99'},{av:'AV109TFHisProTur',fld:'vTFHISPROTUR',pic:'9'},{av:'AV110TFHisProTur_To',fld:'vTFHISPROTUR_TO',pic:'9'},{av:'AV93TFHisProF',fld:'vTFHISPROF',pic:'@!'},{av:'AV94TFHisProF_Sel',fld:'vTFHISPROF_SEL',pic:'@!'},{av:'AV111TFHisProDTI',fld:'vTFHISPRODTI',pic:'99/99/99 99:99:99'},{av:'AV113TFHisProDTF',fld:'vTFHISPRODTF',pic:'99/99/99 99:99:99'},{av:'AV91TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV92TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV53TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV54TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV85TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV86TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV87TFBarColNum',fld:'vTFBARCOLNUM',pic:'ZZZZZ9'},{av:'AV88TFBarColNum_To',fld:'vTFBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV117TFFase',fld:'vTFFASE',pic:''},{av:'AV118TFFase_Sel',fld:'vTFFASE_SEL',pic:''},{av:'AV119TFFaseDescripcion',fld:'vTFFASEDESCRIPCION',pic:''},{av:'AV120TFFaseDescripcion_Sel',fld:'vTFFASEDESCRIPCION_SEL',pic:''},{av:'AV99TFBarTipArt',fld:'vTFBARTIPART',pic:'ZZZ9'},{av:'AV100TFBarTipArt_To',fld:'vTFBARTIPART_TO',pic:'ZZZ9'},{av:'AV121TFHisProTip',fld:'vTFHISPROTIP',pic:'ZZZ9'},{av:'AV122TFHisProTip_To',fld:'vTFHISPROTIP_TO',pic:'ZZZ9'},{av:'AV123TFHisProTc',fld:'vTFHISPROTC',pic:'Z9'},{av:'AV124TFHisProTc_To',fld:'vTFHISPROTC_TO',pic:'Z9'},{av:'AV46TFHisProDf',fld:'vTFHISPRODF',pic:''},{av:'AV37TFParCod',fld:'vTFPARCOD',pic:'ZZZ9'},{av:'AV38TFParCod_To',fld:'vTFPARCOD_TO',pic:'ZZZ9'},{av:'AV39TFParCodNom',fld:'vTFPARCODNOM',pic:''},{av:'AV40TFParCodNom_Sel',fld:'vTFPARCODNOM_SEL',pic:''},{av:'AV95TotHisProKgr',fld:'vTOTHISPROKGR',pic:'ZZZZZ9.99',hsh:true},{av:'AV96TotHisProMtr',fld:'vTOTHISPROMTR',pic:'ZZZZZ9.99',hsh:true},{av:'edtavCostei_Visible',ctrl:'vCOSTEI',prop:'Visible'},{av:'edtavCostet_Visible',ctrl:'vCOSTET',prop:'Visible'},{av:'edtavCostek_Visible',ctrl:'vCOSTEK',prop:'Visible'},{av:'edtavBarkgmtin_Visible',ctrl:'vBARKGMTIN',prop:'Visible'},{av:'edtavBarkgstt_Visible',ctrl:'vBARKGSTT',prop:'Visible'},{av:'AV82MatDsc',fld:'vMATDSC',pic:'',hsh:true},{av:'AV81MatCod',fld:'vMATCOD',pic:'ZZ9',hsh:true},{av:'AV79fechadt',fld:'vFECHADT',pic:'99/99/99 99:99',hsh:true},{av:'A2316BarAgrLot',fld:'BARAGRLOT',pic:''},{av:'AV30FasDivTime',fld:'vFASDIVTIME',pic:'',hsh:true},{av:'AV129MinutosTotal',fld:'vMINUTOSTOTAL',pic:'ZZZZZZZZZ9',hsh:true},{av:'AV133tiempom',fld:'vTIEMPOM',pic:'ZZZZZ9',hsh:true},{av:'A457FasCod',fld:'FASCOD',pic:'@!'},{av:'AV6EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV57FasCod',fld:'vFASCOD',pic:'@!',hsh:true},{av:'A14054FasDivTime',fld:'FASDIVTIME',pic:''},{av:'A1933BarCodTin',fld:'BARCODTIN',pic:'ZZZZZZZ9'},{av:'A1934BarReoTin',fld:'BARREOTIN',pic:'9'},{av:'A1935BarParTin',fld:'BARPARTIN',pic:''},{av:'AV61BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV62BarCodReo',fld:'vBARCODREO',pic:'9',hsh:true},{av:'AV63BarCodPar',fld:'vBARCODPAR',pic:'',hsh:true},{av:'A1945BarMaqTin',fld:'BARMAQTIN',pic:''},{av:'A8563BarKgsTt',fld:'BARKGSTT',pic:'ZZZZZZ9.99'},{av:'A1947BarKgmTin',fld:'BARKGMTIN',pic:'ZZZZZ9.99'},{av:'A3705BarCosCol',fld:'BARCOSCOL',pic:'ZZZZZZ9.99'},{av:'A3658BarCosPA',fld:'BARCOSPA',pic:'ZZZZZZ9.99'},{av:'A3654BarCosPD',fld:'BARCOSPD',pic:'ZZZZZZ9.99'},{av:'A3657BarCosAA',fld:'BARCOSAA',pic:'ZZZZZZ9.99'},{av:'A3656BarCosAD',fld:'BARCOSAD',pic:'ZZZZZZ9.99'},{av:'A3706BarCosAnc',fld:'BARCOSANC',pic:'ZZZZZZ9.99'},{av:'sPrefix'},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e1325I2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV15INEmprcod',fld:'vINEMPRCOD',pic:'@!'},{av:'AV16INHisEstReo',fld:'vINHISESTREO',pic:'9'},{av:'AV19INMaqCod1',fld:'vINMAQCOD1',pic:''},{av:'AV20INMaqCod2',fld:'vINMAQCOD2',pic:''},{av:'AV17INHisProFec1',fld:'vINHISPROFEC1',pic:'99/99/99 99:99:99'},{av:'AV18INHisProFec2',fld:'vINHISPROFEC2',pic:'99/99/99 99:99:99'},{av:'AV125OperarioFrom',fld:'vOPERARIOFROM',pic:'ZZZZZ9'},{av:'AV126OperarioTo',fld:'vOPERARIOTO',pic:'ZZZZZ9'},{av:'AV140Pgmname',fld:'vPGMNAME',pic:''},{av:'AV21OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV22OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV89TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV90TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV101TFMaqCod',fld:'vTFMAQCOD',pic:''},{av:'AV102TFMaqCod_Sel',fld:'vTFMAQCOD_SEL',pic:''},{av:'AV103TFHisProFec',fld:'vTFHISPROFEC',pic:''},{av:'AV105TFHisProKgr',fld:'vTFHISPROKGR',pic:'ZZZZZ9.99'},{av:'AV106TFHisProKgr_To',fld:'vTFHISPROKGR_TO',pic:'ZZZZZ9.99'},{av:'AV107TFHisProMtr',fld:'vTFHISPROMTR',pic:'ZZZZZ9.99'},{av:'AV108TFHisProMtr_To',fld:'vTFHISPROMTR_TO',pic:'ZZZZZ9.99'},{av:'AV109TFHisProTur',fld:'vTFHISPROTUR',pic:'9'},{av:'AV110TFHisProTur_To',fld:'vTFHISPROTUR_TO',pic:'9'},{av:'AV93TFHisProF',fld:'vTFHISPROF',pic:'@!'},{av:'AV94TFHisProF_Sel',fld:'vTFHISPROF_SEL',pic:'@!'},{av:'AV111TFHisProDTI',fld:'vTFHISPRODTI',pic:'99/99/99 99:99:99'},{av:'AV113TFHisProDTF',fld:'vTFHISPRODTF',pic:'99/99/99 99:99:99'},{av:'AV91TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV92TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV53TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV54TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV85TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV86TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV87TFBarColNum',fld:'vTFBARCOLNUM',pic:'ZZZZZ9'},{av:'AV88TFBarColNum_To',fld:'vTFBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV117TFFase',fld:'vTFFASE',pic:''},{av:'AV118TFFase_Sel',fld:'vTFFASE_SEL',pic:''},{av:'AV119TFFaseDescripcion',fld:'vTFFASEDESCRIPCION',pic:''},{av:'AV120TFFaseDescripcion_Sel',fld:'vTFFASEDESCRIPCION_SEL',pic:''},{av:'AV99TFBarTipArt',fld:'vTFBARTIPART',pic:'ZZZ9'},{av:'AV100TFBarTipArt_To',fld:'vTFBARTIPART_TO',pic:'ZZZ9'},{av:'AV121TFHisProTip',fld:'vTFHISPROTIP',pic:'ZZZ9'},{av:'AV122TFHisProTip_To',fld:'vTFHISPROTIP_TO',pic:'ZZZ9'},{av:'AV123TFHisProTc',fld:'vTFHISPROTC',pic:'Z9'},{av:'AV124TFHisProTc_To',fld:'vTFHISPROTC_TO',pic:'Z9'},{av:'AV46TFHisProDf',fld:'vTFHISPRODF',pic:''},{av:'AV37TFParCod',fld:'vTFPARCOD',pic:'ZZZ9'},{av:'AV38TFParCod_To',fld:'vTFPARCOD_TO',pic:'ZZZ9'},{av:'AV39TFParCodNom',fld:'vTFPARCODNOM',pic:''},{av:'AV40TFParCodNom_Sel',fld:'vTFPARCODNOM_SEL',pic:''},{av:'AV95TotHisProKgr',fld:'vTOTHISPROKGR',pic:'ZZZZZ9.99',hsh:true},{av:'AV96TotHisProMtr',fld:'vTOTHISPROMTR',pic:'ZZZZZ9.99',hsh:true},{av:'edtavCostei_Visible',ctrl:'vCOSTEI',prop:'Visible'},{av:'edtavCostet_Visible',ctrl:'vCOSTET',prop:'Visible'},{av:'edtavCostek_Visible',ctrl:'vCOSTEK',prop:'Visible'},{av:'edtavBarkgmtin_Visible',ctrl:'vBARKGMTIN',prop:'Visible'},{av:'edtavBarkgstt_Visible',ctrl:'vBARKGSTT',prop:'Visible'},{av:'AV82MatDsc',fld:'vMATDSC',pic:'',hsh:true},{av:'AV81MatCod',fld:'vMATCOD',pic:'ZZ9',hsh:true},{av:'AV79fechadt',fld:'vFECHADT',pic:'99/99/99 99:99',hsh:true},{av:'A2316BarAgrLot',fld:'BARAGRLOT',pic:''},{av:'AV30FasDivTime',fld:'vFASDIVTIME',pic:'',hsh:true},{av:'AV129MinutosTotal',fld:'vMINUTOSTOTAL',pic:'ZZZZZZZZZ9',hsh:true},{av:'AV133tiempom',fld:'vTIEMPOM',pic:'ZZZZZ9',hsh:true},{av:'A457FasCod',fld:'FASCOD',pic:'@!'},{av:'AV6EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV57FasCod',fld:'vFASCOD',pic:'@!',hsh:true},{av:'A14054FasDivTime',fld:'FASDIVTIME',pic:''},{av:'A1933BarCodTin',fld:'BARCODTIN',pic:'ZZZZZZZ9'},{av:'A1934BarReoTin',fld:'BARREOTIN',pic:'9'},{av:'A1935BarParTin',fld:'BARPARTIN',pic:''},{av:'AV61BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV62BarCodReo',fld:'vBARCODREO',pic:'9',hsh:true},{av:'AV63BarCodPar',fld:'vBARCODPAR',pic:'',hsh:true},{av:'A1945BarMaqTin',fld:'BARMAQTIN',pic:''},{av:'A8563BarKgsTt',fld:'BARKGSTT',pic:'ZZZZZZ9.99'},{av:'A1947BarKgmTin',fld:'BARKGMTIN',pic:'ZZZZZ9.99'},{av:'A3705BarCosCol',fld:'BARCOSCOL',pic:'ZZZZZZ9.99'},{av:'A3658BarCosPA',fld:'BARCOSPA',pic:'ZZZZZZ9.99'},{av:'A3654BarCosPD',fld:'BARCOSPD',pic:'ZZZZZZ9.99'},{av:'A3657BarCosAA',fld:'BARCOSAA',pic:'ZZZZZZ9.99'},{av:'A3656BarCosAD',fld:'BARCOSAD',pic:'ZZZZZZ9.99'},{av:'A3706BarCosAnc',fld:'BARCOSANC',pic:'ZZZZZZ9.99'},{av:'sPrefix'},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'},{av:'Ddo_grid_Selectedvalue_get',ctrl:'DDO_GRID',prop:'SelectedValue_get'},{av:'Ddo_grid_Filteredtextto_get',ctrl:'DDO_GRID',prop:'FilteredTextTo_get'},{av:'Ddo_grid_Filteredtext_get',ctrl:'DDO_GRID',prop:'FilteredText_get'},{av:'Ddo_grid_Selectedcolumn',ctrl:'DDO_GRID',prop:'SelectedColumn'}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV21OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV22OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV39TFParCodNom',fld:'vTFPARCODNOM',pic:''},{av:'AV40TFParCodNom_Sel',fld:'vTFPARCODNOM_SEL',pic:''},{av:'AV37TFParCod',fld:'vTFPARCOD',pic:'ZZZ9'},{av:'AV38TFParCod_To',fld:'vTFPARCOD_TO',pic:'ZZZ9'},{av:'AV46TFHisProDf',fld:'vTFHISPRODF',pic:''},{av:'AV123TFHisProTc',fld:'vTFHISPROTC',pic:'Z9'},{av:'AV124TFHisProTc_To',fld:'vTFHISPROTC_TO',pic:'Z9'},{av:'AV121TFHisProTip',fld:'vTFHISPROTIP',pic:'ZZZ9'},{av:'AV122TFHisProTip_To',fld:'vTFHISPROTIP_TO',pic:'ZZZ9'},{av:'AV99TFBarTipArt',fld:'vTFBARTIPART',pic:'ZZZ9'},{av:'AV100TFBarTipArt_To',fld:'vTFBARTIPART_TO',pic:'ZZZ9'},{av:'AV119TFFaseDescripcion',fld:'vTFFASEDESCRIPCION',pic:''},{av:'AV120TFFaseDescripcion_Sel',fld:'vTFFASEDESCRIPCION_SEL',pic:''},{av:'AV117TFFase',fld:'vTFFASE',pic:''},{av:'AV118TFFase_Sel',fld:'vTFFASE_SEL',pic:''},{av:'AV87TFBarColNum',fld:'vTFBARCOLNUM',pic:'ZZZZZ9'},{av:'AV88TFBarColNum_To',fld:'vTFBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV85TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV86TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV53TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV54TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV91TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV92TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV113TFHisProDTF',fld:'vTFHISPRODTF',pic:'99/99/99 99:99:99'},{av:'AV111TFHisProDTI',fld:'vTFHISPRODTI',pic:'99/99/99 99:99:99'},{av:'AV93TFHisProF',fld:'vTFHISPROF',pic:'@!'},{av:'AV94TFHisProF_Sel',fld:'vTFHISPROF_SEL',pic:'@!'},{av:'AV109TFHisProTur',fld:'vTFHISPROTUR',pic:'9'},{av:'AV110TFHisProTur_To',fld:'vTFHISPROTUR_TO',pic:'9'},{av:'AV107TFHisProMtr',fld:'vTFHISPROMTR',pic:'ZZZZZ9.99'},{av:'AV108TFHisProMtr_To',fld:'vTFHISPROMTR_TO',pic:'ZZZZZ9.99'},{av:'AV105TFHisProKgr',fld:'vTFHISPROKGR',pic:'ZZZZZ9.99'},{av:'AV106TFHisProKgr_To',fld:'vTFHISPROKGR_TO',pic:'ZZZZZ9.99'},{av:'AV103TFHisProFec',fld:'vTFHISPROFEC',pic:''},{av:'AV101TFMaqCod',fld:'vTFMAQCOD',pic:''},{av:'AV102TFMaqCod_Sel',fld:'vTFMAQCOD_SEL',pic:''},{av:'AV89TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV90TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e1725I2',iparms:[{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A212BarSer',fld:'BARSER',pic:''},{av:'A135BarColNom',fld:'BARCOLNOM',pic:''},{av:'A136BarColNum',fld:'BARCOLNUM',pic:'ZZZZZ9'},{av:'A218BarTipCol',fld:'BARTIPCOL',pic:'Z9'},{av:'AV82MatDsc',fld:'vMATDSC',pic:'',hsh:true},{av:'AV81MatCod',fld:'vMATCOD',pic:'ZZ9',hsh:true},{av:'AV79fechadt',fld:'vFECHADT',pic:'99/99/99 99:99',hsh:true},{av:'A3610HisProLot',fld:'HISPROLOT',pic:''},{av:'A2247HisProTip',fld:'HISPROTIP',pic:'ZZZ9'},{av:'A3611HisProTc',fld:'HISPROTC',pic:'Z9'},{av:'A148BarEstReo',fld:'BARESTREO',pic:'9'},{av:'A833TipDefCod',fld:'TIPDEFCOD',pic:'ZZZ9'},{av:'A834TipDefDsc',fld:'TIPDEFDSC',pic:''},{av:'A2316BarAgrLot',fld:'BARAGRLOT',pic:''},{av:'A461Fase',fld:'FASE',pic:''},{av:'AV30FasDivTime',fld:'vFASDIVTIME',pic:'',hsh:true},{av:'A6680HisproTdab',fld:'HISPROTDAB',pic:'ZZZ9'},{av:'A5605HisProTr2',fld:'HISPROTR2',pic:'ZZZ9'},{av:'A556HisProEst',fld:'HISPROEST',pic:'9'},{av:'AV129MinutosTotal',fld:'vMINUTOSTOTAL',pic:'ZZZZZZZZZ9',hsh:true},{av:'AV133tiempom',fld:'vTIEMPOM',pic:'ZZZZZ9',hsh:true},{av:'A457FasCod',fld:'FASCOD',pic:'@!'},{av:'AV6EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV57FasCod',fld:'vFASCOD',pic:'@!',hsh:true},{av:'A14054FasDivTime',fld:'FASDIVTIME',pic:''},{av:'A1933BarCodTin',fld:'BARCODTIN',pic:'ZZZZZZZ9'},{av:'A1934BarReoTin',fld:'BARREOTIN',pic:'9'},{av:'A1935BarParTin',fld:'BARPARTIN',pic:''},{av:'AV61BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV62BarCodReo',fld:'vBARCODREO',pic:'9',hsh:true},{av:'AV63BarCodPar',fld:'vBARCODPAR',pic:'',hsh:true},{av:'A1945BarMaqTin',fld:'BARMAQTIN',pic:''},{av:'AV19INMaqCod1',fld:'vINMAQCOD1',pic:''},{av:'AV20INMaqCod2',fld:'vINMAQCOD2',pic:''},{av:'A8563BarKgsTt',fld:'BARKGSTT',pic:'ZZZZZZ9.99'},{av:'A1947BarKgmTin',fld:'BARKGMTIN',pic:'ZZZZZ9.99'},{av:'A3705BarCosCol',fld:'BARCOSCOL',pic:'ZZZZZZ9.99'},{av:'A3658BarCosPA',fld:'BARCOSPA',pic:'ZZZZZZ9.99'},{av:'A3654BarCosPD',fld:'BARCOSPD',pic:'ZZZZZZ9.99'},{av:'A3657BarCosAA',fld:'BARCOSAA',pic:'ZZZZZZ9.99'},{av:'A3656BarCosAD',fld:'BARCOSAD',pic:'ZZZZZZ9.99'},{av:'A3706BarCosAnc',fld:'BARCOSANC',pic:'ZZZZZZ9.99'}]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'AV61BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV62BarCodReo',fld:'vBARCODREO',pic:'9',hsh:true},{av:'AV63BarCodPar',fld:'vBARCODPAR',pic:'',hsh:true},{av:'AV79fechadt',fld:'vFECHADT',pic:'99/99/99 99:99',hsh:true},{av:'AV81MatCod',fld:'vMATCOD',pic:'ZZ9',hsh:true},{av:'AV82MatDsc',fld:'vMATDSC',pic:'',hsh:true},{av:'A218BarTipCol',fld:'BARTIPCOL',pic:'Z9'},{av:'A136BarColNum',fld:'BARCOLNUM',pic:'ZZZZZ9'},{av:'A135BarColNom',fld:'BARCOLNOM',pic:''},{av:'A212BarSer',fld:'BARSER',pic:''},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV80FlagMarca',fld:'vFLAGMARCA',pic:'9'},{av:'AV36TipArtDsc',fld:'vTIPARTDSC',pic:''},{av:'AV44TipColDsc',fld:'vTIPCOLDSC',pic:''},{av:'A3611HisProTc',fld:'HISPROTC',pic:'Z9'},{av:'AV45ForRGB',fld:'vFORRGB',pic:'ZZZZZZZZZ9'},{av:'AV42TipDefCod',fld:'vTIPDEFCOD',pic:'ZZZ9'},{av:'AV43TipDefDsc',fld:'vTIPDEFDSC',pic:''},{av:'AV59HdrP',fld:'vHDRP',pic:''},{av:'AV50B',fld:'vB',pic:'ZZ9'},{av:'AV49G',fld:'vG',pic:'ZZ9'},{av:'AV48R',fld:'vR',pic:'ZZ9'},{av:'AV57FasCod',fld:'vFASCOD',pic:'@!',hsh:true},{av:'AV73HhMmAlfa',fld:'vHHMMALFA',pic:''},{av:'AV74Minutos',fld:'vMINUTOS',pic:'ZZZZZZZZZ9'},{av:'AV67HisProTr2',fld:'vHISPROTR2',pic:'ZZZ9'},{av:'AV69HorReaInt',fld:'vHORREAINT',pic:'ZZZ9'},{av:'AV70MinRea',fld:'vMINREA',pic:'ZZZ9'},{av:'AV129MinutosTotal',fld:'vMINUTOSTOTAL',pic:'ZZZZZZZZZ9',hsh:true},{av:'AV133tiempom',fld:'vTIEMPOM',pic:'ZZZZZ9',hsh:true},{av:'AV30FasDivTime',fld:'vFASDIVTIME',pic:'',hsh:true},{av:'AV58BarKgsTt',fld:'vBARKGSTT',pic:'ZZZZZZ9.99'},{av:'AV60BarKgmTin',fld:'vBARKGMTIN',pic:'ZZZZZ9.99'},{av:'AV51CosteI',fld:'vCOSTEI',pic:'ZZZZZZ9.99'},{av:'AV52CosteT',fld:'vCOSTET',pic:'ZZZZZZ9.99'},{av:'AV77CosteK',fld:'vCOSTEK',pic:'ZZZZZZ9.99'}]}");
      setEventMetadata("'DOBUTTONEXCEL'","{handler:'e1425I2',iparms:[{av:'AV15INEmprcod',fld:'vINEMPRCOD',pic:'@!'},{av:'AV16INHisEstReo',fld:'vINHISESTREO',pic:'9'},{av:'AV19INMaqCod1',fld:'vINMAQCOD1',pic:''},{av:'AV20INMaqCod2',fld:'vINMAQCOD2',pic:''},{av:'AV17INHisProFec1',fld:'vINHISPROFEC1',pic:'99/99/99 99:99:99'},{av:'AV18INHisProFec2',fld:'vINHISPROFEC2',pic:'99/99/99 99:99:99'}]");
      setEventMetadata("'DOBUTTONEXCEL'",",oparms:[]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_BARCOD","{handler:'valid_Barcod',iparms:[]");
      setEventMetadata("VALID_BARCOD",",oparms:[]}");
      setEventMetadata("VALID_BARCODREO","{handler:'valid_Barcodreo',iparms:[]");
      setEventMetadata("VALID_BARCODREO",",oparms:[]}");
      setEventMetadata("VALID_BARCODPAR","{handler:'valid_Barcodpar',iparms:[]");
      setEventMetadata("VALID_BARCODPAR",",oparms:[]}");
      setEventMetadata("VALID_HISPRODTI","{handler:'valid_Hisprodti',iparms:[]");
      setEventMetadata("VALID_HISPRODTI",",oparms:[]}");
      setEventMetadata("VALID_HISPRODTF","{handler:'valid_Hisprodtf',iparms:[]");
      setEventMetadata("VALID_HISPRODTF",",oparms:[]}");
      setEventMetadata("VALID_GRUOPECOD","{handler:'valid_Gruopecod',iparms:[]");
      setEventMetadata("VALID_GRUOPECOD",",oparms:[]}");
      setEventMetadata("VALID_FASE","{handler:'valid_Fase',iparms:[]");
      setEventMetadata("VALID_FASE",",oparms:[]}");
      setEventMetadata("VALID_FASEDESCRI","{handler:'valid_Fasedescri',iparms:[]");
      setEventMetadata("VALID_FASEDESCRI",",oparms:[]}");
      setEventMetadata("VALID_PARCOD","{handler:'valid_Parcod',iparms:[]");
      setEventMetadata("VALID_PARCOD",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Hisproest',iparms:[]");
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
      wcpOAV15INEmprcod = "" ;
      wcpOAV19INMaqCod1 = "" ;
      wcpOAV20INMaqCod2 = "" ;
      wcpOAV17INHisProFec1 = GXutil.resetTime( GXutil.nullDate() );
      wcpOAV18INHisProFec2 = GXutil.resetTime( GXutil.nullDate() );
      Gridpaginationbar_Selectedpage = "" ;
      Ddo_grid_Activeeventkey = "" ;
      Ddo_grid_Selectedvalue_get = "" ;
      Ddo_grid_Filteredtextto_get = "" ;
      Ddo_grid_Filteredtext_get = "" ;
      Ddo_grid_Selectedcolumn = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      sPrefix = "" ;
      AV15INEmprcod = "" ;
      AV19INMaqCod1 = "" ;
      AV20INMaqCod2 = "" ;
      AV17INHisProFec1 = GXutil.resetTime( GXutil.nullDate() );
      AV18INHisProFec2 = GXutil.resetTime( GXutil.nullDate() );
      AV140Pgmname = "" ;
      AV89TFBarNHdr = "" ;
      AV90TFBarNHdr_Sel = "" ;
      AV101TFMaqCod = "" ;
      AV102TFMaqCod_Sel = "" ;
      AV103TFHisProFec = GXutil.nullDate() ;
      AV105TFHisProKgr = DecimalUtil.ZERO ;
      AV106TFHisProKgr_To = DecimalUtil.ZERO ;
      AV107TFHisProMtr = DecimalUtil.ZERO ;
      AV108TFHisProMtr_To = DecimalUtil.ZERO ;
      AV93TFHisProF = "" ;
      AV94TFHisProF_Sel = "" ;
      AV111TFHisProDTI = GXutil.resetTime( GXutil.nullDate() );
      AV113TFHisProDTF = GXutil.resetTime( GXutil.nullDate() );
      AV91TFCliNom = "" ;
      AV92TFCliNom_Sel = "" ;
      AV53TFBarSer = "" ;
      AV54TFBarSer_Sel = "" ;
      AV85TFBarColNom = "" ;
      AV86TFBarColNom_Sel = "" ;
      AV117TFFase = "" ;
      AV118TFFase_Sel = "" ;
      AV119TFFaseDescripcion = "" ;
      AV120TFFaseDescripcion_Sel = "" ;
      AV46TFHisProDf = GXutil.nullDate() ;
      AV39TFParCodNom = "" ;
      AV40TFParCodNom_Sel = "" ;
      AV95TotHisProKgr = DecimalUtil.ZERO ;
      AV96TotHisProMtr = DecimalUtil.ZERO ;
      AV82MatDsc = "" ;
      AV79fechadt = GXutil.resetTime( GXutil.nullDate() );
      A2316BarAgrLot = "" ;
      AV30FasDivTime = "" ;
      A457FasCod = "" ;
      AV6EmprCod = "" ;
      AV57FasCod = "" ;
      A14054FasDivTime = "" ;
      A1935BarParTin = "" ;
      AV63BarCodPar = "" ;
      A1945BarMaqTin = "" ;
      A8563BarKgsTt = DecimalUtil.ZERO ;
      A1947BarKgmTin = DecimalUtil.ZERO ;
      A3705BarCosCol = DecimalUtil.ZERO ;
      A3658BarCosPA = DecimalUtil.ZERO ;
      A3654BarCosPD = DecimalUtil.ZERO ;
      A3657BarCosAA = DecimalUtil.ZERO ;
      A3656BarCosAD = DecimalUtil.ZERO ;
      A3706BarCosAnc = DecimalUtil.ZERO ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      AV5DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      A834TipDefDsc = "" ;
      Ddo_grid_Caption = "" ;
      Ddo_grid_Filteredtext_set = "" ;
      Ddo_grid_Filteredtextto_set = "" ;
      Ddo_grid_Selectedvalue_set = "" ;
      Ddo_grid_Sortedstatus = "" ;
      Grid_empowerer_Gridinternalname = "" ;
      GX_FocusControl = "" ;
      ucDvpanel_tableheader = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      ClassString = "" ;
      StyleString = "" ;
      bttBtnbuttonexcel_Jsonclick = "" ;
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucGridpaginationbar = new com.genexus.webpanels.GXUserControl();
      ucDatamonjs = new com.genexus.webpanels.GXUserControl();
      ucDdo_grid = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      AV104DDO_HisProFecAuxDate = GXutil.nullDate() ;
      AV112DDO_HisProDTIAuxDate = GXutil.nullDate() ;
      AV114DDO_HisProDTFAuxDate = GXutil.nullDate() ;
      AV47DDO_HisProDfAuxDate = GXutil.nullDate() ;
      sXEvt = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      A396EmprCod = "" ;
      A130BarCodPar = "" ;
      A13696BarNHdr = "" ;
      A602MaqCod = "" ;
      A558HisProFec = GXutil.nullDate() ;
      A1525HisProKgr = DecimalUtil.ZERO ;
      A1526HisProMtr = DecimalUtil.ZERO ;
      A557HisProF = "" ;
      A4440HisProDTI = GXutil.resetTime( GXutil.nullDate() );
      A4441HisProDTF = GXutil.resetTime( GXutil.nullDate() );
      AV73HhMmAlfa = "" ;
      A279CliNom = "" ;
      A212BarSer = "" ;
      A135BarColNom = "" ;
      A13892GruOpeCodN = "" ;
      A461Fase = "" ;
      A13893FaseDescri = "" ;
      AV83Op4 = "" ;
      AV36TipArtDsc = "" ;
      AV44TipColDsc = "" ;
      A5608HisProDf = GXutil.nullDate() ;
      AV43TipDefDsc = "" ;
      AV51CosteI = DecimalUtil.ZERO ;
      AV52CosteT = DecimalUtil.ZERO ;
      AV77CosteK = DecimalUtil.ZERO ;
      AV59HdrP = "" ;
      AV60BarKgmTin = DecimalUtil.ZERO ;
      AV58BarKgsTt = DecimalUtil.ZERO ;
      A867ParCodNom = "" ;
      A3610HisProLot = "" ;
      scmdbuf = "" ;
      lV89TFBarNHdr = "" ;
      lV101TFMaqCod = "" ;
      lV93TFHisProF = "" ;
      lV91TFCliNom = "" ;
      lV53TFBarSer = "" ;
      lV85TFBarColNom = "" ;
      lV117TFFase = "" ;
      lV39TFParCodNom = "" ;
      H025I2_A3612HisProReo = new byte[1] ;
      H025I2_A252CliCod = new int[1] ;
      H025I2_n252CliCod = new boolean[] {false} ;
      H025I2_A833TipDefCod = new short[1] ;
      H025I2_n833TipDefCod = new boolean[] {false} ;
      H025I2_A148BarEstReo = new byte[1] ;
      H025I2_A834TipDefDsc = new String[] {""} ;
      H025I2_n834TipDefDsc = new boolean[] {false} ;
      H025I2_A6680HisproTdab = new short[1] ;
      H025I2_A556HisProEst = new byte[1] ;
      H025I2_A3610HisProLot = new String[] {""} ;
      H025I2_A218BarTipCol = new byte[1] ;
      H025I2_A867ParCodNom = new String[] {""} ;
      H025I2_n867ParCodNom = new boolean[] {false} ;
      H025I2_A656ParCod = new short[1] ;
      H025I2_n656ParCod = new boolean[] {false} ;
      H025I2_A5608HisProDf = new java.util.Date[] {GXutil.nullDate()} ;
      H025I2_A3611HisProTc = new byte[1] ;
      H025I2_A2247HisProTip = new short[1] ;
      H025I2_A217BarTipArt = new short[1] ;
      H025I2_n217BarTipArt = new boolean[] {false} ;
      H025I2_A136BarColNum = new int[1] ;
      H025I2_A135BarColNom = new String[] {""} ;
      H025I2_A212BarSer = new String[] {""} ;
      H025I2_A279CliNom = new String[] {""} ;
      H025I2_A557HisProF = new String[] {""} ;
      H025I2_A566HisProTur = new byte[1] ;
      H025I2_A1526HisProMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H025I2_A1525HisProKgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H025I2_A561HisProLin = new int[1] ;
      H025I2_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      H025I2_A602MaqCod = new String[] {""} ;
      H025I2_A130BarCodPar = new String[] {""} ;
      H025I2_A132BarCodReo = new byte[1] ;
      H025I2_A129BarCod = new int[1] ;
      H025I2_A503GruOpeCod = new int[1] ;
      H025I2_A461Fase = new String[] {""} ;
      H025I2_A396EmprCod = new String[] {""} ;
      H025I2_A4440HisProDTI = new java.util.Date[] {GXutil.nullDate()} ;
      H025I2_n4440HisProDTI = new boolean[] {false} ;
      H025I2_A4441HisProDTF = new java.util.Date[] {GXutil.nullDate()} ;
      H025I2_n4441HisProDTF = new boolean[] {false} ;
      H025I3_A3612HisProReo = new byte[1] ;
      H025I3_A252CliCod = new int[1] ;
      H025I3_n252CliCod = new boolean[] {false} ;
      H025I3_A833TipDefCod = new short[1] ;
      H025I3_n833TipDefCod = new boolean[] {false} ;
      H025I3_A148BarEstReo = new byte[1] ;
      H025I3_A834TipDefDsc = new String[] {""} ;
      H025I3_n834TipDefDsc = new boolean[] {false} ;
      H025I3_A6680HisproTdab = new short[1] ;
      H025I3_A556HisProEst = new byte[1] ;
      H025I3_A3610HisProLot = new String[] {""} ;
      H025I3_A218BarTipCol = new byte[1] ;
      H025I3_A867ParCodNom = new String[] {""} ;
      H025I3_n867ParCodNom = new boolean[] {false} ;
      H025I3_A656ParCod = new short[1] ;
      H025I3_n656ParCod = new boolean[] {false} ;
      H025I3_A5608HisProDf = new java.util.Date[] {GXutil.nullDate()} ;
      H025I3_A3611HisProTc = new byte[1] ;
      H025I3_A2247HisProTip = new short[1] ;
      H025I3_A217BarTipArt = new short[1] ;
      H025I3_n217BarTipArt = new boolean[] {false} ;
      H025I3_A136BarColNum = new int[1] ;
      H025I3_A135BarColNom = new String[] {""} ;
      H025I3_A212BarSer = new String[] {""} ;
      H025I3_A279CliNom = new String[] {""} ;
      H025I3_A557HisProF = new String[] {""} ;
      H025I3_A566HisProTur = new byte[1] ;
      H025I3_A1526HisProMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H025I3_A1525HisProKgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H025I3_A561HisProLin = new int[1] ;
      H025I3_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      H025I3_A602MaqCod = new String[] {""} ;
      H025I3_A130BarCodPar = new String[] {""} ;
      H025I3_A132BarCodReo = new byte[1] ;
      H025I3_A129BarCod = new int[1] ;
      H025I3_A503GruOpeCod = new int[1] ;
      H025I3_A461Fase = new String[] {""} ;
      H025I3_A396EmprCod = new String[] {""} ;
      H025I3_A4440HisProDTI = new java.util.Date[] {GXutil.nullDate()} ;
      H025I3_n4440HisProDTI = new boolean[] {false} ;
      H025I3_A4441HisProDTF = new java.util.Date[] {GXutil.nullDate()} ;
      H025I3_n4441HisProDTF = new boolean[] {false} ;
      AV97TotValueHisProKgr = "" ;
      AV98TotValueHisProMtr = "" ;
      hsh = "" ;
      AV25Station = "" ;
      AV7EmprNom = "" ;
      AV27UsurCod = "" ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV28WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext9 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      GXv_char4 = new String[1] ;
      GXv_int10 = new int[1] ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      GXv_int11 = new int[1] ;
      GXv_int8 = new byte[1] ;
      GXv_decimal25 = new java.math.BigDecimal[1] ;
      GXv_dtime26 = new java.util.Date[1] ;
      AV33HisProLot = "" ;
      GXv_int24 = new int[1] ;
      GXv_int18 = new int[1] ;
      GXv_int15 = new byte[1] ;
      GXv_int29 = new long[1] ;
      GXv_int21 = new short[1] ;
      GXv_int14 = new short[1] ;
      GXv_int30 = new short[1] ;
      AV66HhMm = DecimalUtil.ZERO ;
      AV71Mmalfa = "" ;
      AV72hhalfa = "" ;
      AV128TotValueHhMmAlfa = "" ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV9ExcelFilename = "" ;
      AV8ErrorMessage = "" ;
      AV24Session = httpContext.getWebSession();
      AV12GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV13GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      GXt_char37 = "" ;
      GXv_char23 = new String[1] ;
      GXt_char36 = "" ;
      GXv_char22 = new String[1] ;
      GXt_char35 = "" ;
      GXv_char20 = new String[1] ;
      GXt_char34 = "" ;
      GXv_char19 = new String[1] ;
      GXt_char33 = "" ;
      GXv_char17 = new String[1] ;
      GXt_char32 = "" ;
      GXv_char16 = new String[1] ;
      GXt_char31 = "" ;
      GXv_char13 = new String[1] ;
      GXt_char1 = "" ;
      GXv_char12 = new String[1] ;
      GXv_SdtWWPGridState39 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      AV26TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV14HTTPRequest = httpContext.getHttpRequest();
      H025I4_A561HisProLin = new int[1] ;
      H025I4_A252CliCod = new int[1] ;
      H025I4_n252CliCod = new boolean[] {false} ;
      H025I4_A503GruOpeCod = new int[1] ;
      H025I4_A3612HisProReo = new byte[1] ;
      H025I4_A867ParCodNom = new String[] {""} ;
      H025I4_n867ParCodNom = new boolean[] {false} ;
      H025I4_A656ParCod = new short[1] ;
      H025I4_n656ParCod = new boolean[] {false} ;
      H025I4_A5608HisProDf = new java.util.Date[] {GXutil.nullDate()} ;
      H025I4_A3611HisProTc = new byte[1] ;
      H025I4_A2247HisProTip = new short[1] ;
      H025I4_A217BarTipArt = new short[1] ;
      H025I4_n217BarTipArt = new boolean[] {false} ;
      H025I4_A136BarColNum = new int[1] ;
      H025I4_A135BarColNom = new String[] {""} ;
      H025I4_A212BarSer = new String[] {""} ;
      H025I4_A279CliNom = new String[] {""} ;
      H025I4_A4441HisProDTF = new java.util.Date[] {GXutil.nullDate()} ;
      H025I4_n4441HisProDTF = new boolean[] {false} ;
      H025I4_A4440HisProDTI = new java.util.Date[] {GXutil.nullDate()} ;
      H025I4_n4440HisProDTI = new boolean[] {false} ;
      H025I4_A557HisProF = new String[] {""} ;
      H025I4_A566HisProTur = new byte[1] ;
      H025I4_A1526HisProMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H025I4_A1525HisProKgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H025I4_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      H025I4_A602MaqCod = new String[] {""} ;
      H025I4_A130BarCodPar = new String[] {""} ;
      H025I4_A132BarCodReo = new byte[1] ;
      H025I4_A129BarCod = new int[1] ;
      H025I4_A461Fase = new String[] {""} ;
      H025I4_A396EmprCod = new String[] {""} ;
      GXt_char38 = "" ;
      GXv_char27 = new String[1] ;
      H025I5_A457FasCod = new String[] {""} ;
      H025I5_A396EmprCod = new String[] {""} ;
      H025I5_A14054FasDivTime = new String[] {""} ;
      H025I6_A3646EstTinAny = new short[1] ;
      H025I6_A3647EstTinMes = new byte[1] ;
      H025I6_A3648EstTinDia = new byte[1] ;
      H025I6_A1929EstTinNr = new short[1] ;
      H025I6_A1945BarMaqTin = new String[] {""} ;
      H025I6_n1945BarMaqTin = new boolean[] {false} ;
      H025I6_A1935BarParTin = new String[] {""} ;
      H025I6_n1935BarParTin = new boolean[] {false} ;
      H025I6_A1934BarReoTin = new byte[1] ;
      H025I6_n1934BarReoTin = new boolean[] {false} ;
      H025I6_A1933BarCodTin = new int[1] ;
      H025I6_n1933BarCodTin = new boolean[] {false} ;
      H025I6_A396EmprCod = new String[] {""} ;
      H025I6_A8563BarKgsTt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H025I6_n8563BarKgsTt = new boolean[] {false} ;
      H025I6_A1947BarKgmTin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H025I6_n1947BarKgmTin = new boolean[] {false} ;
      H025I6_A3654BarCosPD = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H025I6_n3654BarCosPD = new boolean[] {false} ;
      H025I6_A3658BarCosPA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H025I6_n3658BarCosPA = new boolean[] {false} ;
      H025I6_A3705BarCosCol = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H025I6_n3705BarCosCol = new boolean[] {false} ;
      H025I6_A3706BarCosAnc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H025I6_n3706BarCosAnc = new boolean[] {false} ;
      H025I6_A3656BarCosAD = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H025I6_n3656BarCosAD = new boolean[] {false} ;
      H025I6_A3657BarCosAA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H025I6_n3657BarCosAA = new boolean[] {false} ;
      H025I6_A2316BarAgrLot = new String[] {""} ;
      H025I6_n2316BarAgrLot = new boolean[] {false} ;
      AV78Dif = DecimalUtil.ZERO ;
      AV84Porc = DecimalUtil.ZERO ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlAV15INEmprcod = "" ;
      sCtrlAV16INHisEstReo = "" ;
      sCtrlAV19INMaqCod1 = "" ;
      sCtrlAV20INMaqCod2 = "" ;
      sCtrlAV17INHisProFec1 = "" ;
      sCtrlAV18INHisProFec2 = "" ;
      sCtrlAV125OperarioFrom = "" ;
      sCtrlAV126OperarioTo = "" ;
      subGrid_Linesclass = "" ;
      ROClassString = "" ;
      GXCCtl = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.produccion.informeproduccionresumenhdr_wc1__default(),
         new Object[] {
             new Object[] {
            H025I2_A3612HisProReo, H025I2_A252CliCod, H025I2_n252CliCod, H025I2_A833TipDefCod, H025I2_n833TipDefCod, H025I2_A148BarEstReo, H025I2_A834TipDefDsc, H025I2_n834TipDefDsc, H025I2_A6680HisproTdab, H025I2_A556HisProEst,
            H025I2_A3610HisProLot, H025I2_A218BarTipCol, H025I2_A867ParCodNom, H025I2_n867ParCodNom, H025I2_A656ParCod, H025I2_n656ParCod, H025I2_A5608HisProDf, H025I2_A3611HisProTc, H025I2_A2247HisProTip, H025I2_A217BarTipArt,
            H025I2_n217BarTipArt, H025I2_A136BarColNum, H025I2_A135BarColNom, H025I2_A212BarSer, H025I2_A279CliNom, H025I2_A557HisProF, H025I2_A566HisProTur, H025I2_A1526HisProMtr, H025I2_A1525HisProKgr, H025I2_A561HisProLin,
            H025I2_A558HisProFec, H025I2_A602MaqCod, H025I2_A130BarCodPar, H025I2_A132BarCodReo, H025I2_A129BarCod, H025I2_A503GruOpeCod, H025I2_A461Fase, H025I2_A396EmprCod, H025I2_A4440HisProDTI, H025I2_n4440HisProDTI,
            H025I2_A4441HisProDTF, H025I2_n4441HisProDTF
            }
            , new Object[] {
            H025I3_A3612HisProReo, H025I3_A252CliCod, H025I3_n252CliCod, H025I3_A833TipDefCod, H025I3_n833TipDefCod, H025I3_A148BarEstReo, H025I3_A834TipDefDsc, H025I3_n834TipDefDsc, H025I3_A6680HisproTdab, H025I3_A556HisProEst,
            H025I3_A3610HisProLot, H025I3_A218BarTipCol, H025I3_A867ParCodNom, H025I3_n867ParCodNom, H025I3_A656ParCod, H025I3_n656ParCod, H025I3_A5608HisProDf, H025I3_A3611HisProTc, H025I3_A2247HisProTip, H025I3_A217BarTipArt,
            H025I3_n217BarTipArt, H025I3_A136BarColNum, H025I3_A135BarColNom, H025I3_A212BarSer, H025I3_A279CliNom, H025I3_A557HisProF, H025I3_A566HisProTur, H025I3_A1526HisProMtr, H025I3_A1525HisProKgr, H025I3_A561HisProLin,
            H025I3_A558HisProFec, H025I3_A602MaqCod, H025I3_A130BarCodPar, H025I3_A132BarCodReo, H025I3_A129BarCod, H025I3_A503GruOpeCod, H025I3_A461Fase, H025I3_A396EmprCod, H025I3_A4440HisProDTI, H025I3_n4440HisProDTI,
            H025I3_A4441HisProDTF, H025I3_n4441HisProDTF
            }
            , new Object[] {
            H025I4_A561HisProLin, H025I4_A252CliCod, H025I4_n252CliCod, H025I4_A503GruOpeCod, H025I4_A3612HisProReo, H025I4_A867ParCodNom, H025I4_n867ParCodNom, H025I4_A656ParCod, H025I4_n656ParCod, H025I4_A5608HisProDf,
            H025I4_A3611HisProTc, H025I4_A2247HisProTip, H025I4_A217BarTipArt, H025I4_n217BarTipArt, H025I4_A136BarColNum, H025I4_A135BarColNom, H025I4_A212BarSer, H025I4_A279CliNom, H025I4_A4441HisProDTF, H025I4_n4441HisProDTF,
            H025I4_A4440HisProDTI, H025I4_n4440HisProDTI, H025I4_A557HisProF, H025I4_A566HisProTur, H025I4_A1526HisProMtr, H025I4_A1525HisProKgr, H025I4_A558HisProFec, H025I4_A602MaqCod, H025I4_A130BarCodPar, H025I4_A132BarCodReo,
            H025I4_A129BarCod, H025I4_A461Fase, H025I4_A396EmprCod
            }
            , new Object[] {
            H025I5_A457FasCod, H025I5_A396EmprCod, H025I5_A14054FasDivTime
            }
            , new Object[] {
            H025I6_A3646EstTinAny, H025I6_A3647EstTinMes, H025I6_A3648EstTinDia, H025I6_A1929EstTinNr, H025I6_A1945BarMaqTin, H025I6_n1945BarMaqTin, H025I6_A1935BarParTin, H025I6_n1935BarParTin, H025I6_A1934BarReoTin, H025I6_n1934BarReoTin,
            H025I6_A1933BarCodTin, H025I6_n1933BarCodTin, H025I6_A396EmprCod, H025I6_A8563BarKgsTt, H025I6_n8563BarKgsTt, H025I6_A1947BarKgmTin, H025I6_n1947BarKgmTin, H025I6_A3654BarCosPD, H025I6_n3654BarCosPD, H025I6_A3658BarCosPA,
            H025I6_n3658BarCosPA, H025I6_A3705BarCosCol, H025I6_n3705BarCosCol, H025I6_A3706BarCosAnc, H025I6_n3706BarCosAnc, H025I6_A3656BarCosAD, H025I6_n3656BarCosAD, H025I6_A3657BarCosAA, H025I6_n3657BarCosAA, H025I6_A2316BarAgrLot,
            H025I6_n2316BarAgrLot
            }
         }
      );
      AV140Pgmname = "Produccion.InformeProduccionResumenHdr_WC1" ;
      /* GeneXus formulas. */
      AV140Pgmname = "Produccion.InformeProduccionResumenHdr_WC1" ;
      Gx_err = (short)(0) ;
      edtavHhmmalfa_Enabled = 0 ;
      edtavMatcod_Enabled = 0 ;
      edtavMatdsc_Enabled = 0 ;
      edtavFlagmarca_Enabled = 0 ;
      edtavMinutos_Enabled = 0 ;
      chkavOp4.setEnabled( 0 );
      edtavTipartdsc_Enabled = 0 ;
      edtavTipcoldsc_Enabled = 0 ;
      edtavForrgb_Enabled = 0 ;
      edtavR_Enabled = 0 ;
      edtavG_Enabled = 0 ;
      edtavB_Enabled = 0 ;
      edtavTipdefcod_Enabled = 0 ;
      edtavTipdefdsc_Enabled = 0 ;
      edtavCostei_Enabled = 0 ;
      edtavCostet_Enabled = 0 ;
      edtavCostek_Enabled = 0 ;
      edtavHdrp_Enabled = 0 ;
      edtavBarkgmtin_Enabled = 0 ;
      edtavBarkgstt_Enabled = 0 ;
      edtavHisprotr2_Enabled = 0 ;
      edtavHorreaint_Enabled = 0 ;
      edtavMinrea_Enabled = 0 ;
      edtavTotvaluehisprokgr_Enabled = 0 ;
      edtavTotvaluehispromtr_Enabled = 0 ;
      edtavPgmname_Enabled = 0 ;
   }

   private byte wcpOAV16INHisEstReo ;
   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDynComponent ;
   private byte AV16INHisEstReo ;
   private byte AV109TFHisProTur ;
   private byte AV110TFHisProTur_To ;
   private byte AV123TFHisProTc ;
   private byte AV124TFHisProTc_To ;
   private byte A1934BarReoTin ;
   private byte AV62BarCodReo ;
   private byte A3612HisProReo ;
   private byte A148BarEstReo ;
   private byte nDraw ;
   private byte nDoneStart ;
   private byte A132BarCodReo ;
   private byte A566HisProTur ;
   private byte AV80FlagMarca ;
   private byte A3611HisProTc ;
   private byte A218BarTipCol ;
   private byte A556HisProEst ;
   private byte nDonePA ;
   private byte subGrid_Backcolorstyle ;
   private byte subGrid_Sortable ;
   private byte AV75Grulec ;
   private byte AV76lecotex ;
   private byte GXt_int7 ;
   private byte GXv_int8[] ;
   private byte GXv_int15[] ;
   private byte AV130Hrs ;
   private byte AV131Min ;
   private byte AV132Sec ;
   private byte nGXWrapped ;
   private byte subGrid_Backstyle ;
   private byte subGrid_Titlebackstyle ;
   private byte subGrid_Allowselection ;
   private byte subGrid_Allowhovering ;
   private byte subGrid_Allowcollapsing ;
   private byte subGrid_Collapsed ;
   private short nRcdExists_5 ;
   private short nIsMod_5 ;
   private short nRcdExists_4 ;
   private short nIsMod_4 ;
   private short nRcdExists_3 ;
   private short nIsMod_3 ;
   private short AV21OrderedBy ;
   private short AV99TFBarTipArt ;
   private short AV100TFBarTipArt_To ;
   private short AV121TFHisProTip ;
   private short AV122TFHisProTip_To ;
   private short AV37TFParCod ;
   private short AV38TFParCod_To ;
   private short AV81MatCod ;
   private short A833TipDefCod ;
   private short A6680HisproTdab ;
   private short A5605HisProTr2 ;
   private short wbEnd ;
   private short wbStart ;
   private short A217BarTipArt ;
   private short A2247HisProTip ;
   private short AV48R ;
   private short AV49G ;
   private short AV50B ;
   private short AV42TipDefCod ;
   private short AV67HisProTr2 ;
   private short AV69HorReaInt ;
   private short AV70MinRea ;
   private short A656ParCod ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short GXv_int21[] ;
   private short GXv_int14[] ;
   private short GXv_int30[] ;
   private short AV68HorRea ;
   private int wcpOAV125OperarioFrom ;
   private int wcpOAV126OperarioTo ;
   private int edtavCostei_Visible ;
   private int edtavCostet_Visible ;
   private int edtavCostek_Visible ;
   private int edtavBarkgmtin_Visible ;
   private int edtavBarkgstt_Visible ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_27 ;
   private int AV125OperarioFrom ;
   private int AV126OperarioTo ;
   private int nGXsfl_27_idx=1 ;
   private int AV87TFBarColNum ;
   private int AV88TFBarColNum_To ;
   private int AV133tiempom ;
   private int A1933BarCodTin ;
   private int AV61BarCod ;
   private int A252CliCod ;
   private int Gridpaginationbar_Pagestoshow ;
   private int edtavPgmname_Enabled ;
   private int A129BarCod ;
   private int A561HisProLin ;
   private int A136BarColNum ;
   private int A503GruOpeCod ;
   private int subGrid_Islastpage ;
   private int edtavHhmmalfa_Enabled ;
   private int edtavMatcod_Enabled ;
   private int edtavMatdsc_Enabled ;
   private int edtavFlagmarca_Enabled ;
   private int edtavMinutos_Enabled ;
   private int edtavTipartdsc_Enabled ;
   private int edtavTipcoldsc_Enabled ;
   private int edtavForrgb_Enabled ;
   private int edtavR_Enabled ;
   private int edtavG_Enabled ;
   private int edtavB_Enabled ;
   private int edtavTipdefcod_Enabled ;
   private int edtavTipdefdsc_Enabled ;
   private int edtavCostei_Enabled ;
   private int edtavCostet_Enabled ;
   private int edtavCostek_Enabled ;
   private int edtavHdrp_Enabled ;
   private int edtavBarkgmtin_Enabled ;
   private int edtavBarkgstt_Enabled ;
   private int edtavHisprotr2_Enabled ;
   private int edtavHorreaint_Enabled ;
   private int edtavMinrea_Enabled ;
   private int edtavTotvaluehisprokgr_Enabled ;
   private int edtavTotvaluehispromtr_Enabled ;
   private int AV23PageToGo ;
   private int GXv_int10[] ;
   private int GXv_int11[] ;
   private int GXv_int24[] ;
   private int GXv_int18[] ;
   private int AV141GXV1 ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long AV129MinutosTotal ;
   private long AV10GridCurrentPage ;
   private long AV11GridPageCount ;
   private long AV74Minutos ;
   private long AV45ForRGB ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private long GXt_int28 ;
   private long GXv_int29[] ;
   private java.math.BigDecimal AV105TFHisProKgr ;
   private java.math.BigDecimal AV106TFHisProKgr_To ;
   private java.math.BigDecimal AV107TFHisProMtr ;
   private java.math.BigDecimal AV108TFHisProMtr_To ;
   private java.math.BigDecimal AV95TotHisProKgr ;
   private java.math.BigDecimal AV96TotHisProMtr ;
   private java.math.BigDecimal A8563BarKgsTt ;
   private java.math.BigDecimal A1947BarKgmTin ;
   private java.math.BigDecimal A3705BarCosCol ;
   private java.math.BigDecimal A3658BarCosPA ;
   private java.math.BigDecimal A3654BarCosPD ;
   private java.math.BigDecimal A3657BarCosAA ;
   private java.math.BigDecimal A3656BarCosAD ;
   private java.math.BigDecimal A3706BarCosAnc ;
   private java.math.BigDecimal A1525HisProKgr ;
   private java.math.BigDecimal A1526HisProMtr ;
   private java.math.BigDecimal AV51CosteI ;
   private java.math.BigDecimal AV52CosteT ;
   private java.math.BigDecimal AV77CosteK ;
   private java.math.BigDecimal AV60BarKgmTin ;
   private java.math.BigDecimal AV58BarKgsTt ;
   private java.math.BigDecimal GXv_decimal25[] ;
   private java.math.BigDecimal AV66HhMm ;
   private java.math.BigDecimal AV78Dif ;
   private java.math.BigDecimal AV84Porc ;
   private String wcpOAV15INEmprcod ;
   private String wcpOAV19INMaqCod1 ;
   private String wcpOAV20INMaqCod2 ;
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
   private String AV15INEmprcod ;
   private String AV19INMaqCod1 ;
   private String AV20INMaqCod2 ;
   private String sGXsfl_27_idx="0001" ;
   private String edtavCostei_Internalname ;
   private String edtavCostet_Internalname ;
   private String edtavCostek_Internalname ;
   private String edtavBarkgmtin_Internalname ;
   private String edtavBarkgstt_Internalname ;
   private String AV140Pgmname ;
   private String AV89TFBarNHdr ;
   private String AV90TFBarNHdr_Sel ;
   private String AV101TFMaqCod ;
   private String AV102TFMaqCod_Sel ;
   private String AV93TFHisProF ;
   private String AV94TFHisProF_Sel ;
   private String AV91TFCliNom ;
   private String AV92TFCliNom_Sel ;
   private String AV53TFBarSer ;
   private String AV54TFBarSer_Sel ;
   private String AV85TFBarColNom ;
   private String AV86TFBarColNom_Sel ;
   private String AV117TFFase ;
   private String AV118TFFase_Sel ;
   private String AV119TFFaseDescripcion ;
   private String AV120TFFaseDescripcion_Sel ;
   private String AV39TFParCodNom ;
   private String AV40TFParCodNom_Sel ;
   private String AV82MatDsc ;
   private String A2316BarAgrLot ;
   private String AV30FasDivTime ;
   private String A457FasCod ;
   private String AV6EmprCod ;
   private String AV57FasCod ;
   private String A14054FasDivTime ;
   private String A1935BarParTin ;
   private String AV63BarCodPar ;
   private String A1945BarMaqTin ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String A834TipDefDsc ;
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
   private String Ddo_grid_Sortedstatus ;
   private String Ddo_grid_Includefilter ;
   private String Ddo_grid_Filtertype ;
   private String Ddo_grid_Filterisrange ;
   private String Ddo_grid_Includedatalist ;
   private String Ddo_grid_Datalisttype ;
   private String Ddo_grid_Datalistproc ;
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
   private String bttBtnbuttonexcel_Internalname ;
   private String bttBtnbuttonexcel_Jsonclick ;
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
   private String divDdo_hisprofecauxdates_Internalname ;
   private String edtavDdo_hisprofecauxdate_Internalname ;
   private String edtavDdo_hisprofecauxdate_Jsonclick ;
   private String divDdo_hisprodtiauxdates_Internalname ;
   private String edtavDdo_hisprodtiauxdate_Internalname ;
   private String edtavDdo_hisprodtiauxdate_Jsonclick ;
   private String divDdo_hisprodtfauxdates_Internalname ;
   private String edtavDdo_hisprodtfauxdate_Internalname ;
   private String edtavDdo_hisprodtfauxdate_Jsonclick ;
   private String divDdo_hisprodfauxdates_Internalname ;
   private String edtavDdo_hisprodfauxdate_Internalname ;
   private String edtavDdo_hisprodfauxdate_Jsonclick ;
   private String sXEvt ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtavTotvaluehisprokgr_Internalname ;
   private String A396EmprCod ;
   private String edtEmprCod_Internalname ;
   private String edtBarCod_Internalname ;
   private String edtBarCodReo_Internalname ;
   private String A130BarCodPar ;
   private String edtBarCodPar_Internalname ;
   private String A13696BarNHdr ;
   private String edtBarNHdr_Internalname ;
   private String A602MaqCod ;
   private String edtMaqCod_Internalname ;
   private String edtHisProFec_Internalname ;
   private String edtHisProLin_Internalname ;
   private String edtHisProKgr_Internalname ;
   private String edtHisProMtr_Internalname ;
   private String edtHisProTur_Internalname ;
   private String A557HisProF ;
   private String edtHisProF_Internalname ;
   private String edtHisProDTI_Internalname ;
   private String edtHisProDTF_Internalname ;
   private String AV73HhMmAlfa ;
   private String edtavHhmmalfa_Internalname ;
   private String A279CliNom ;
   private String edtCliNom_Internalname ;
   private String A212BarSer ;
   private String edtBarSer_Internalname ;
   private String A135BarColNom ;
   private String edtBarColNom_Internalname ;
   private String edtBarColNum_Internalname ;
   private String edtavMatcod_Internalname ;
   private String edtavMatdsc_Internalname ;
   private String edtGruOpeCod_Internalname ;
   private String A13892GruOpeCodN ;
   private String edtGruOpeCodN_Internalname ;
   private String A461Fase ;
   private String edtFase_Internalname ;
   private String A13893FaseDescri ;
   private String edtFaseDescri_Internalname ;
   private String edtavFlagmarca_Internalname ;
   private String edtavMinutos_Internalname ;
   private String AV83Op4 ;
   private String edtBarTipArt_Internalname ;
   private String edtHisProTip_Internalname ;
   private String AV36TipArtDsc ;
   private String edtavTipartdsc_Internalname ;
   private String edtHisProTc_Internalname ;
   private String AV44TipColDsc ;
   private String edtavTipcoldsc_Internalname ;
   private String edtHisProDf_Internalname ;
   private String edtavForrgb_Internalname ;
   private String edtavR_Internalname ;
   private String edtavG_Internalname ;
   private String edtavB_Internalname ;
   private String edtavTipdefcod_Internalname ;
   private String AV43TipDefDsc ;
   private String edtavTipdefdsc_Internalname ;
   private String AV59HdrP ;
   private String edtavHdrp_Internalname ;
   private String edtavHisprotr2_Internalname ;
   private String edtavHorreaint_Internalname ;
   private String edtavMinrea_Internalname ;
   private String edtParCod_Internalname ;
   private String A867ParCodNom ;
   private String edtParCodNom_Internalname ;
   private String edtBarTipCol_Internalname ;
   private String A3610HisProLot ;
   private String edtHisProLot_Internalname ;
   private String edtHisProEst_Internalname ;
   private String edtavTotvaluehispromtr_Internalname ;
   private String scmdbuf ;
   private String lV89TFBarNHdr ;
   private String lV101TFMaqCod ;
   private String lV93TFHisProF ;
   private String lV91TFCliNom ;
   private String lV53TFBarSer ;
   private String lV85TFBarColNom ;
   private String lV117TFFase ;
   private String lV39TFParCodNom ;
   private String hsh ;
   private String AV25Station ;
   private String AV7EmprNom ;
   private String AV27UsurCod ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String AV33HisProLot ;
   private String AV71Mmalfa ;
   private String AV72hhalfa ;
   private String GXt_char37 ;
   private String GXv_char23[] ;
   private String GXt_char36 ;
   private String GXv_char22[] ;
   private String GXt_char35 ;
   private String GXv_char20[] ;
   private String GXt_char34 ;
   private String GXv_char19[] ;
   private String GXt_char33 ;
   private String GXv_char17[] ;
   private String GXt_char32 ;
   private String GXv_char16[] ;
   private String GXt_char31 ;
   private String GXv_char13[] ;
   private String GXt_char1 ;
   private String GXv_char12[] ;
   private String GXt_char38 ;
   private String GXv_char27[] ;
   private String tblGridtabletotalizer_Internalname ;
   private String edtavTotvaluehisprokgr_Jsonclick ;
   private String edtavTotvaluehispromtr_Jsonclick ;
   private String sCtrlAV15INEmprcod ;
   private String sCtrlAV16INHisEstReo ;
   private String sCtrlAV19INMaqCod1 ;
   private String sCtrlAV20INMaqCod2 ;
   private String sCtrlAV17INHisProFec1 ;
   private String sCtrlAV18INHisProFec2 ;
   private String sCtrlAV125OperarioFrom ;
   private String sCtrlAV126OperarioTo ;
   private String sGXsfl_27_fel_idx="0001" ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String ROClassString ;
   private String edtEmprCod_Jsonclick ;
   private String edtBarCod_Jsonclick ;
   private String edtBarCodReo_Jsonclick ;
   private String edtBarCodPar_Jsonclick ;
   private String edtBarNHdr_Jsonclick ;
   private String edtMaqCod_Jsonclick ;
   private String edtHisProFec_Jsonclick ;
   private String edtHisProLin_Jsonclick ;
   private String edtHisProKgr_Jsonclick ;
   private String edtHisProMtr_Jsonclick ;
   private String edtHisProTur_Jsonclick ;
   private String edtHisProF_Jsonclick ;
   private String edtHisProDTI_Jsonclick ;
   private String edtHisProDTF_Jsonclick ;
   private String edtavHhmmalfa_Jsonclick ;
   private String edtCliNom_Jsonclick ;
   private String edtBarSer_Jsonclick ;
   private String edtBarColNom_Jsonclick ;
   private String edtBarColNum_Jsonclick ;
   private String edtavMatcod_Jsonclick ;
   private String edtavMatdsc_Jsonclick ;
   private String edtGruOpeCod_Jsonclick ;
   private String edtGruOpeCodN_Jsonclick ;
   private String edtFase_Jsonclick ;
   private String edtFaseDescri_Jsonclick ;
   private String edtavFlagmarca_Jsonclick ;
   private String edtavMinutos_Jsonclick ;
   private String GXCCtl ;
   private String edtBarTipArt_Jsonclick ;
   private String edtHisProTip_Jsonclick ;
   private String edtavTipartdsc_Jsonclick ;
   private String edtHisProTc_Jsonclick ;
   private String edtavTipcoldsc_Jsonclick ;
   private String edtHisProDf_Jsonclick ;
   private String edtavForrgb_Jsonclick ;
   private String edtavR_Jsonclick ;
   private String edtavG_Jsonclick ;
   private String edtavB_Jsonclick ;
   private String edtavTipdefcod_Jsonclick ;
   private String edtavTipdefdsc_Jsonclick ;
   private String edtavCostei_Jsonclick ;
   private String edtavCostet_Jsonclick ;
   private String edtavCostek_Jsonclick ;
   private String edtavHdrp_Jsonclick ;
   private String edtavBarkgmtin_Jsonclick ;
   private String edtavBarkgstt_Jsonclick ;
   private String edtavHisprotr2_Jsonclick ;
   private String edtavHorreaint_Jsonclick ;
   private String edtavMinrea_Jsonclick ;
   private String edtParCod_Jsonclick ;
   private String edtParCodNom_Jsonclick ;
   private String edtBarTipCol_Jsonclick ;
   private String edtHisProLot_Jsonclick ;
   private String edtHisProEst_Jsonclick ;
   private String subGrid_Header ;
   private java.util.Date wcpOAV17INHisProFec1 ;
   private java.util.Date wcpOAV18INHisProFec2 ;
   private java.util.Date AV17INHisProFec1 ;
   private java.util.Date AV18INHisProFec2 ;
   private java.util.Date AV111TFHisProDTI ;
   private java.util.Date AV113TFHisProDTF ;
   private java.util.Date AV79fechadt ;
   private java.util.Date A4440HisProDTI ;
   private java.util.Date A4441HisProDTF ;
   private java.util.Date GXv_dtime26[] ;
   private java.util.Date AV103TFHisProFec ;
   private java.util.Date AV46TFHisProDf ;
   private java.util.Date AV104DDO_HisProFecAuxDate ;
   private java.util.Date AV112DDO_HisProDTIAuxDate ;
   private java.util.Date AV114DDO_HisProDTFAuxDate ;
   private java.util.Date AV47DDO_HisProDfAuxDate ;
   private java.util.Date A558HisProFec ;
   private java.util.Date A5608HisProDf ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean bGXsfl_27_Refreshing=false ;
   private boolean AV22OrderedDsc ;
   private boolean n2316BarAgrLot ;
   private boolean n1933BarCodTin ;
   private boolean n1934BarReoTin ;
   private boolean n1935BarParTin ;
   private boolean n1945BarMaqTin ;
   private boolean n8563BarKgsTt ;
   private boolean n1947BarKgmTin ;
   private boolean n3705BarCosCol ;
   private boolean n3658BarCosPA ;
   private boolean n3654BarCosPD ;
   private boolean n3657BarCosAA ;
   private boolean n3656BarCosAD ;
   private boolean n3706BarCosAnc ;
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
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean n4440HisProDTI ;
   private boolean n4441HisProDTF ;
   private boolean n217BarTipArt ;
   private boolean n656ParCod ;
   private boolean n867ParCodNom ;
   private boolean n252CliCod ;
   private boolean n833TipDefCod ;
   private boolean n834TipDefDsc ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private String AV97TotValueHisProKgr ;
   private String AV98TotValueHisProMtr ;
   private String AV128TotValueHhMmAlfa ;
   private String AV9ExcelFilename ;
   private String AV8ErrorMessage ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV14HTTPRequest ;
   private com.genexus.webpanels.WebSession AV24Session ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableheader ;
   private com.genexus.webpanels.GXUserControl ucGridpaginationbar ;
   private com.genexus.webpanels.GXUserControl ucDatamonjs ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private ICheckbox chkavOp4 ;
   private IDataStoreProvider pr_default ;
   private byte[] H025I2_A3612HisProReo ;
   private int[] H025I2_A252CliCod ;
   private boolean[] H025I2_n252CliCod ;
   private short[] H025I2_A833TipDefCod ;
   private boolean[] H025I2_n833TipDefCod ;
   private byte[] H025I2_A148BarEstReo ;
   private String[] H025I2_A834TipDefDsc ;
   private boolean[] H025I2_n834TipDefDsc ;
   private short[] H025I2_A6680HisproTdab ;
   private byte[] H025I2_A556HisProEst ;
   private String[] H025I2_A3610HisProLot ;
   private byte[] H025I2_A218BarTipCol ;
   private String[] H025I2_A867ParCodNom ;
   private boolean[] H025I2_n867ParCodNom ;
   private short[] H025I2_A656ParCod ;
   private boolean[] H025I2_n656ParCod ;
   private java.util.Date[] H025I2_A5608HisProDf ;
   private byte[] H025I2_A3611HisProTc ;
   private short[] H025I2_A2247HisProTip ;
   private short[] H025I2_A217BarTipArt ;
   private boolean[] H025I2_n217BarTipArt ;
   private int[] H025I2_A136BarColNum ;
   private String[] H025I2_A135BarColNom ;
   private String[] H025I2_A212BarSer ;
   private String[] H025I2_A279CliNom ;
   private String[] H025I2_A557HisProF ;
   private byte[] H025I2_A566HisProTur ;
   private java.math.BigDecimal[] H025I2_A1526HisProMtr ;
   private java.math.BigDecimal[] H025I2_A1525HisProKgr ;
   private int[] H025I2_A561HisProLin ;
   private java.util.Date[] H025I2_A558HisProFec ;
   private String[] H025I2_A602MaqCod ;
   private String[] H025I2_A130BarCodPar ;
   private byte[] H025I2_A132BarCodReo ;
   private int[] H025I2_A129BarCod ;
   private int[] H025I2_A503GruOpeCod ;
   private String[] H025I2_A461Fase ;
   private String[] H025I2_A396EmprCod ;
   private java.util.Date[] H025I2_A4440HisProDTI ;
   private boolean[] H025I2_n4440HisProDTI ;
   private java.util.Date[] H025I2_A4441HisProDTF ;
   private boolean[] H025I2_n4441HisProDTF ;
   private byte[] H025I3_A3612HisProReo ;
   private int[] H025I3_A252CliCod ;
   private boolean[] H025I3_n252CliCod ;
   private short[] H025I3_A833TipDefCod ;
   private boolean[] H025I3_n833TipDefCod ;
   private byte[] H025I3_A148BarEstReo ;
   private String[] H025I3_A834TipDefDsc ;
   private boolean[] H025I3_n834TipDefDsc ;
   private short[] H025I3_A6680HisproTdab ;
   private byte[] H025I3_A556HisProEst ;
   private String[] H025I3_A3610HisProLot ;
   private byte[] H025I3_A218BarTipCol ;
   private String[] H025I3_A867ParCodNom ;
   private boolean[] H025I3_n867ParCodNom ;
   private short[] H025I3_A656ParCod ;
   private boolean[] H025I3_n656ParCod ;
   private java.util.Date[] H025I3_A5608HisProDf ;
   private byte[] H025I3_A3611HisProTc ;
   private short[] H025I3_A2247HisProTip ;
   private short[] H025I3_A217BarTipArt ;
   private boolean[] H025I3_n217BarTipArt ;
   private int[] H025I3_A136BarColNum ;
   private String[] H025I3_A135BarColNom ;
   private String[] H025I3_A212BarSer ;
   private String[] H025I3_A279CliNom ;
   private String[] H025I3_A557HisProF ;
   private byte[] H025I3_A566HisProTur ;
   private java.math.BigDecimal[] H025I3_A1526HisProMtr ;
   private java.math.BigDecimal[] H025I3_A1525HisProKgr ;
   private int[] H025I3_A561HisProLin ;
   private java.util.Date[] H025I3_A558HisProFec ;
   private String[] H025I3_A602MaqCod ;
   private String[] H025I3_A130BarCodPar ;
   private byte[] H025I3_A132BarCodReo ;
   private int[] H025I3_A129BarCod ;
   private int[] H025I3_A503GruOpeCod ;
   private String[] H025I3_A461Fase ;
   private String[] H025I3_A396EmprCod ;
   private java.util.Date[] H025I3_A4440HisProDTI ;
   private boolean[] H025I3_n4440HisProDTI ;
   private java.util.Date[] H025I3_A4441HisProDTF ;
   private boolean[] H025I3_n4441HisProDTF ;
   private int[] H025I4_A561HisProLin ;
   private int[] H025I4_A252CliCod ;
   private boolean[] H025I4_n252CliCod ;
   private int[] H025I4_A503GruOpeCod ;
   private byte[] H025I4_A3612HisProReo ;
   private String[] H025I4_A867ParCodNom ;
   private boolean[] H025I4_n867ParCodNom ;
   private short[] H025I4_A656ParCod ;
   private boolean[] H025I4_n656ParCod ;
   private java.util.Date[] H025I4_A5608HisProDf ;
   private byte[] H025I4_A3611HisProTc ;
   private short[] H025I4_A2247HisProTip ;
   private short[] H025I4_A217BarTipArt ;
   private boolean[] H025I4_n217BarTipArt ;
   private int[] H025I4_A136BarColNum ;
   private String[] H025I4_A135BarColNom ;
   private String[] H025I4_A212BarSer ;
   private String[] H025I4_A279CliNom ;
   private java.util.Date[] H025I4_A4441HisProDTF ;
   private boolean[] H025I4_n4441HisProDTF ;
   private java.util.Date[] H025I4_A4440HisProDTI ;
   private boolean[] H025I4_n4440HisProDTI ;
   private String[] H025I4_A557HisProF ;
   private byte[] H025I4_A566HisProTur ;
   private java.math.BigDecimal[] H025I4_A1526HisProMtr ;
   private java.math.BigDecimal[] H025I4_A1525HisProKgr ;
   private java.util.Date[] H025I4_A558HisProFec ;
   private String[] H025I4_A602MaqCod ;
   private String[] H025I4_A130BarCodPar ;
   private byte[] H025I4_A132BarCodReo ;
   private int[] H025I4_A129BarCod ;
   private String[] H025I4_A461Fase ;
   private String[] H025I4_A396EmprCod ;
   private String[] H025I5_A457FasCod ;
   private String[] H025I5_A396EmprCod ;
   private String[] H025I5_A14054FasDivTime ;
   private short[] H025I6_A3646EstTinAny ;
   private byte[] H025I6_A3647EstTinMes ;
   private byte[] H025I6_A3648EstTinDia ;
   private short[] H025I6_A1929EstTinNr ;
   private String[] H025I6_A1945BarMaqTin ;
   private boolean[] H025I6_n1945BarMaqTin ;
   private String[] H025I6_A1935BarParTin ;
   private boolean[] H025I6_n1935BarParTin ;
   private byte[] H025I6_A1934BarReoTin ;
   private boolean[] H025I6_n1934BarReoTin ;
   private int[] H025I6_A1933BarCodTin ;
   private boolean[] H025I6_n1933BarCodTin ;
   private String[] H025I6_A396EmprCod ;
   private java.math.BigDecimal[] H025I6_A8563BarKgsTt ;
   private boolean[] H025I6_n8563BarKgsTt ;
   private java.math.BigDecimal[] H025I6_A1947BarKgmTin ;
   private boolean[] H025I6_n1947BarKgmTin ;
   private java.math.BigDecimal[] H025I6_A3654BarCosPD ;
   private boolean[] H025I6_n3654BarCosPD ;
   private java.math.BigDecimal[] H025I6_A3658BarCosPA ;
   private boolean[] H025I6_n3658BarCosPA ;
   private java.math.BigDecimal[] H025I6_A3705BarCosCol ;
   private boolean[] H025I6_n3705BarCosCol ;
   private java.math.BigDecimal[] H025I6_A3706BarCosAnc ;
   private boolean[] H025I6_n3706BarCosAnc ;
   private java.math.BigDecimal[] H025I6_A3656BarCosAD ;
   private boolean[] H025I6_n3656BarCosAD ;
   private java.math.BigDecimal[] H025I6_A3657BarCosAA ;
   private boolean[] H025I6_n3657BarCosAA ;
   private String[] H025I6_A2316BarAgrLot ;
   private boolean[] H025I6_n2316BarAgrLot ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV5DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV12GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState39[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV13GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV26TrnContext ;
   private app.wwpbaseobjects.SdtWWPContext AV28WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext9[] ;
}

final  class informeproduccionresumenhdr_wc1__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H025I2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV90TFBarNHdr_Sel ,
                                          String AV89TFBarNHdr ,
                                          String AV102TFMaqCod_Sel ,
                                          String AV101TFMaqCod ,
                                          java.util.Date AV103TFHisProFec ,
                                          java.math.BigDecimal AV105TFHisProKgr ,
                                          java.math.BigDecimal AV106TFHisProKgr_To ,
                                          java.math.BigDecimal AV107TFHisProMtr ,
                                          java.math.BigDecimal AV108TFHisProMtr_To ,
                                          byte AV109TFHisProTur ,
                                          byte AV110TFHisProTur_To ,
                                          String AV94TFHisProF_Sel ,
                                          String AV93TFHisProF ,
                                          java.util.Date AV111TFHisProDTI ,
                                          java.util.Date AV113TFHisProDTF ,
                                          String AV92TFCliNom_Sel ,
                                          String AV91TFCliNom ,
                                          String AV54TFBarSer_Sel ,
                                          String AV53TFBarSer ,
                                          String AV86TFBarColNom_Sel ,
                                          String AV85TFBarColNom ,
                                          int AV87TFBarColNum ,
                                          int AV88TFBarColNum_To ,
                                          String AV118TFFase_Sel ,
                                          String AV117TFFase ,
                                          short AV99TFBarTipArt ,
                                          short AV100TFBarTipArt_To ,
                                          short AV121TFHisProTip ,
                                          short AV122TFHisProTip_To ,
                                          byte AV123TFHisProTc ,
                                          byte AV124TFHisProTc_To ,
                                          java.util.Date AV46TFHisProDf ,
                                          short AV37TFParCod ,
                                          short AV38TFParCod_To ,
                                          String AV40TFParCodNom_Sel ,
                                          String AV39TFParCodNom ,
                                          byte AV16INHisEstReo ,
                                          int AV125OperarioFrom ,
                                          int AV126OperarioTo ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          String A602MaqCod ,
                                          java.util.Date A558HisProFec ,
                                          java.math.BigDecimal A1525HisProKgr ,
                                          java.math.BigDecimal A1526HisProMtr ,
                                          byte A566HisProTur ,
                                          String A557HisProF ,
                                          java.util.Date A4440HisProDTI ,
                                          java.util.Date A4441HisProDTF ,
                                          String A279CliNom ,
                                          String A212BarSer ,
                                          String A135BarColNom ,
                                          int A136BarColNum ,
                                          String A461Fase ,
                                          short A217BarTipArt ,
                                          short A2247HisProTip ,
                                          byte A3611HisProTc ,
                                          java.util.Date A5608HisProDf ,
                                          short A656ParCod ,
                                          String A867ParCodNom ,
                                          byte A3612HisProReo ,
                                          int A503GruOpeCod ,
                                          short AV21OrderedBy ,
                                          boolean AV22OrderedDsc ,
                                          String AV120TFFaseDescripcion_Sel ,
                                          String AV119TFFaseDescripcion ,
                                          String A13893FaseDescri ,
                                          java.util.Date AV17INHisProFec1 ,
                                          java.util.Date AV18INHisProFec2 ,
                                          String AV15INEmprcod ,
                                          String AV19INMaqCod1 ,
                                          String A396EmprCod ,
                                          String AV20INMaqCod2 )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int40 = new byte[44];
      Object[] GXv_Object41 = new Object[2];
      scmdbuf = "SELECT T1.HisProReo, T2.CliCod, T2.TipDefCod, T2.BarEstReo, T4.TipDefDsc, T1.HisproTdab, T1.HisProEst, T1.HisProLot, T2.BarTipCol, T5.ParCodNom, T1.ParCod, T1.HisProDf," ;
      scmdbuf += " T1.HisProTc, T1.HisProTip, T2.BarTipArt, T2.BarColNum, T2.BarColNom, T2.BarSer, T3.CliNom, T1.HisProF, T1.HisProTur, T1.HisProMtr, T1.HisProKgr, T1.HisProLin, T1.HisProFec," ;
      scmdbuf += " T1.MaqCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.GruOpeCod, T1.Fase, T1.EmprCod, T1.HisProDTI, T1.HisProDTF FROM ((((TXPLHIPRO T1 INNER JOIN TXPBARCAD T2 ON" ;
      scmdbuf += " T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) LEFT JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T3.CliCod = T2.CliCod) LEFT JOIN TXPTIPDEF T4 ON T4.EmprCod = T1.EmprCod AND T4.TipDefCod = T2.TipDefCod) LEFT JOIN TXPCODPAR T5 ON T5.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T5.ParCod = T1.ParCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.MaqCod >= ?)");
      addWhere(sWhereString, "(T1.HisProDTF >= ?)");
      addWhere(sWhereString, "(T1.HisProDTF <= ?)");
      addWhere(sWhereString, "(T1.MaqCod <= ?)");
      if ( (GXutil.strcmp("", AV90TFBarNHdr_Sel)==0) && ( ! (GXutil.strcmp("", AV89TFBarNHdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int40[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV90TFBarNHdr_Sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int40[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV102TFMaqCod_Sel)==0) && ( ! (GXutil.strcmp("", AV101TFMaqCod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int40[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV102TFMaqCod_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCod = ?)");
      }
      else
      {
         GXv_int40[8] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV103TFHisProFec)) )
      {
         addWhere(sWhereString, "(T1.HisProFec >= ?)");
      }
      else
      {
         GXv_int40[9] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV105TFHisProKgr)==0) )
      {
         addWhere(sWhereString, "(T1.HisProKgr >= ?)");
      }
      else
      {
         GXv_int40[10] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV106TFHisProKgr_To)==0) )
      {
         addWhere(sWhereString, "(T1.HisProKgr <= ?)");
      }
      else
      {
         GXv_int40[11] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV107TFHisProMtr)==0) )
      {
         addWhere(sWhereString, "(T1.HisProMtr >= ?)");
      }
      else
      {
         GXv_int40[12] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV108TFHisProMtr_To)==0) )
      {
         addWhere(sWhereString, "(T1.HisProMtr <= ?)");
      }
      else
      {
         GXv_int40[13] = (byte)(1) ;
      }
      if ( ! (0==AV109TFHisProTur) )
      {
         addWhere(sWhereString, "(T1.HisProTur >= ?)");
      }
      else
      {
         GXv_int40[14] = (byte)(1) ;
      }
      if ( ! (0==AV110TFHisProTur_To) )
      {
         addWhere(sWhereString, "(T1.HisProTur <= ?)");
      }
      else
      {
         GXv_int40[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV94TFHisProF_Sel)==0) && ( ! (GXutil.strcmp("", AV93TFHisProF)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HisProF) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int40[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV94TFHisProF_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.HisProF = ?)");
      }
      else
      {
         GXv_int40[17] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV111TFHisProDTI) )
      {
         addWhere(sWhereString, "(T1.HisProDTI >= ?)");
      }
      else
      {
         GXv_int40[18] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV113TFHisProDTF) )
      {
         addWhere(sWhereString, "(T1.HisProDTF >= ?)");
      }
      else
      {
         GXv_int40[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV92TFCliNom_Sel)==0) && ( ! (GXutil.strcmp("", AV91TFCliNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int40[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV92TFCliNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int40[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV54TFBarSer_Sel)==0) && ( ! (GXutil.strcmp("", AV53TFBarSer)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int40[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV54TFBarSer_Sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarSer = ?)");
      }
      else
      {
         GXv_int40[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV86TFBarColNom_Sel)==0) && ( ! (GXutil.strcmp("", AV85TFBarColNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int40[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV86TFBarColNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarColNom = ?)");
      }
      else
      {
         GXv_int40[25] = (byte)(1) ;
      }
      if ( ! (0==AV87TFBarColNum) )
      {
         addWhere(sWhereString, "(T2.BarColNum >= ?)");
      }
      else
      {
         GXv_int40[26] = (byte)(1) ;
      }
      if ( ! (0==AV88TFBarColNum_To) )
      {
         addWhere(sWhereString, "(T2.BarColNum <= ?)");
      }
      else
      {
         GXv_int40[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV118TFFase_Sel)==0) && ( ! (GXutil.strcmp("", AV117TFFase)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Fase) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int40[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV118TFFase_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.Fase = ?)");
      }
      else
      {
         GXv_int40[29] = (byte)(1) ;
      }
      if ( ! (0==AV99TFBarTipArt) )
      {
         addWhere(sWhereString, "(T2.BarTipArt >= ?)");
      }
      else
      {
         GXv_int40[30] = (byte)(1) ;
      }
      if ( ! (0==AV100TFBarTipArt_To) )
      {
         addWhere(sWhereString, "(T2.BarTipArt <= ?)");
      }
      else
      {
         GXv_int40[31] = (byte)(1) ;
      }
      if ( ! (0==AV121TFHisProTip) )
      {
         addWhere(sWhereString, "(T1.HisProTip >= ?)");
      }
      else
      {
         GXv_int40[32] = (byte)(1) ;
      }
      if ( ! (0==AV122TFHisProTip_To) )
      {
         addWhere(sWhereString, "(T1.HisProTip <= ?)");
      }
      else
      {
         GXv_int40[33] = (byte)(1) ;
      }
      if ( ! (0==AV123TFHisProTc) )
      {
         addWhere(sWhereString, "(T1.HisProTc >= ?)");
      }
      else
      {
         GXv_int40[34] = (byte)(1) ;
      }
      if ( ! (0==AV124TFHisProTc_To) )
      {
         addWhere(sWhereString, "(T1.HisProTc <= ?)");
      }
      else
      {
         GXv_int40[35] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV46TFHisProDf)) )
      {
         addWhere(sWhereString, "(T1.HisProDf >= ?)");
      }
      else
      {
         GXv_int40[36] = (byte)(1) ;
      }
      if ( ! (0==AV37TFParCod) )
      {
         addWhere(sWhereString, "(T1.ParCod >= ?)");
      }
      else
      {
         GXv_int40[37] = (byte)(1) ;
      }
      if ( ! (0==AV38TFParCod_To) )
      {
         addWhere(sWhereString, "(T1.ParCod <= ?)");
      }
      else
      {
         GXv_int40[38] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV40TFParCodNom_Sel)==0) && ( ! (GXutil.strcmp("", AV39TFParCodNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T5.ParCodNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int40[39] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV40TFParCodNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T5.ParCodNom = ?)");
      }
      else
      {
         GXv_int40[40] = (byte)(1) ;
      }
      if ( ! ( AV16INHisEstReo == 9 ) )
      {
         addWhere(sWhereString, "(T1.HisProReo = ?)");
      }
      else
      {
         GXv_int40[41] = (byte)(1) ;
      }
      if ( ! (0==AV125OperarioFrom) )
      {
         addWhere(sWhereString, "(T1.GruOpeCod >= ?)");
      }
      else
      {
         GXv_int40[42] = (byte)(1) ;
      }
      if ( ! (0==AV126OperarioTo) )
      {
         addWhere(sWhereString, "(T1.GruOpeCod <= ?)");
      }
      else
      {
         GXv_int40[43] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV21OrderedBy == 1 ) && ! AV22OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.MaqCod" ;
      }
      else if ( ( AV21OrderedBy == 1 ) && ( AV22OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.MaqCod DESC" ;
      }
      else if ( ( AV21OrderedBy == 2 ) && ! AV22OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.HisProFec" ;
      }
      else if ( ( AV21OrderedBy == 2 ) && ( AV22OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.HisProFec DESC" ;
      }
      else if ( ( AV21OrderedBy == 3 ) && ! AV22OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.HisProKgr" ;
      }
      else if ( ( AV21OrderedBy == 3 ) && ( AV22OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.HisProKgr DESC" ;
      }
      else if ( ( AV21OrderedBy == 4 ) && ! AV22OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.HisProMtr" ;
      }
      else if ( ( AV21OrderedBy == 4 ) && ( AV22OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.HisProMtr DESC" ;
      }
      else if ( ( AV21OrderedBy == 5 ) && ! AV22OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.HisProTur" ;
      }
      else if ( ( AV21OrderedBy == 5 ) && ( AV22OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.HisProTur DESC" ;
      }
      else if ( ( AV21OrderedBy == 6 ) && ! AV22OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.HisProF" ;
      }
      else if ( ( AV21OrderedBy == 6 ) && ( AV22OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.HisProF DESC" ;
      }
      else if ( ( AV21OrderedBy == 7 ) && ! AV22OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.HisProDTI" ;
      }
      else if ( ( AV21OrderedBy == 7 ) && ( AV22OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.HisProDTI DESC" ;
      }
      else if ( ( AV21OrderedBy == 8 ) && ! AV22OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.HisProDTF" ;
      }
      else if ( ( AV21OrderedBy == 8 ) && ( AV22OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.HisProDTF DESC" ;
      }
      else if ( ( AV21OrderedBy == 9 ) && ! AV22OrderedDsc )
      {
         scmdbuf += " ORDER BY T3.CliNom" ;
      }
      else if ( ( AV21OrderedBy == 9 ) && ( AV22OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.CliNom DESC" ;
      }
      else if ( ( AV21OrderedBy == 10 ) && ! AV22OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.BarSer" ;
      }
      else if ( ( AV21OrderedBy == 10 ) && ( AV22OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.BarSer DESC" ;
      }
      else if ( ( AV21OrderedBy == 11 ) && ! AV22OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.BarColNom" ;
      }
      else if ( ( AV21OrderedBy == 11 ) && ( AV22OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.BarColNom DESC" ;
      }
      else if ( ( AV21OrderedBy == 12 ) && ! AV22OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.BarColNum" ;
      }
      else if ( ( AV21OrderedBy == 12 ) && ( AV22OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.BarColNum DESC" ;
      }
      else if ( ( AV21OrderedBy == 13 ) && ! AV22OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.GruOpeCod" ;
      }
      else if ( ( AV21OrderedBy == 13 ) && ( AV22OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.GruOpeCod DESC" ;
      }
      else if ( ( AV21OrderedBy == 14 ) && ! AV22OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.Fase" ;
      }
      else if ( ( AV21OrderedBy == 14 ) && ( AV22OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.Fase DESC" ;
      }
      else if ( ( AV21OrderedBy == 15 ) && ! AV22OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.BarTipArt" ;
      }
      else if ( ( AV21OrderedBy == 15 ) && ( AV22OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.BarTipArt DESC" ;
      }
      else if ( ( AV21OrderedBy == 16 ) && ! AV22OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.HisProTip" ;
      }
      else if ( ( AV21OrderedBy == 16 ) && ( AV22OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.HisProTip DESC" ;
      }
      else if ( ( AV21OrderedBy == 17 ) && ! AV22OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.HisProTc" ;
      }
      else if ( ( AV21OrderedBy == 17 ) && ( AV22OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.HisProTc DESC" ;
      }
      else if ( ( AV21OrderedBy == 18 ) && ! AV22OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.HisProDf" ;
      }
      else if ( ( AV21OrderedBy == 18 ) && ( AV22OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.HisProDf DESC" ;
      }
      else if ( ( AV21OrderedBy == 19 ) && ! AV22OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ParCod" ;
      }
      else if ( ( AV21OrderedBy == 19 ) && ( AV22OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ParCod DESC" ;
      }
      else if ( ( AV21OrderedBy == 20 ) && ! AV22OrderedDsc )
      {
         scmdbuf += " ORDER BY T5.ParCodNom" ;
      }
      else if ( ( AV21OrderedBy == 20 ) && ( AV22OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T5.ParCodNom DESC" ;
      }
      GXv_Object41[0] = scmdbuf ;
      GXv_Object41[1] = GXv_int40 ;
      return GXv_Object41 ;
   }

   protected Object[] conditional_H025I3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV90TFBarNHdr_Sel ,
                                          String AV89TFBarNHdr ,
                                          String AV102TFMaqCod_Sel ,
                                          String AV101TFMaqCod ,
                                          java.util.Date AV103TFHisProFec ,
                                          java.math.BigDecimal AV105TFHisProKgr ,
                                          java.math.BigDecimal AV106TFHisProKgr_To ,
                                          java.math.BigDecimal AV107TFHisProMtr ,
                                          java.math.BigDecimal AV108TFHisProMtr_To ,
                                          byte AV109TFHisProTur ,
                                          byte AV110TFHisProTur_To ,
                                          String AV94TFHisProF_Sel ,
                                          String AV93TFHisProF ,
                                          java.util.Date AV111TFHisProDTI ,
                                          java.util.Date AV113TFHisProDTF ,
                                          String AV92TFCliNom_Sel ,
                                          String AV91TFCliNom ,
                                          String AV54TFBarSer_Sel ,
                                          String AV53TFBarSer ,
                                          String AV86TFBarColNom_Sel ,
                                          String AV85TFBarColNom ,
                                          int AV87TFBarColNum ,
                                          int AV88TFBarColNum_To ,
                                          String AV118TFFase_Sel ,
                                          String AV117TFFase ,
                                          short AV99TFBarTipArt ,
                                          short AV100TFBarTipArt_To ,
                                          short AV121TFHisProTip ,
                                          short AV122TFHisProTip_To ,
                                          byte AV123TFHisProTc ,
                                          byte AV124TFHisProTc_To ,
                                          java.util.Date AV46TFHisProDf ,
                                          short AV37TFParCod ,
                                          short AV38TFParCod_To ,
                                          String AV40TFParCodNom_Sel ,
                                          String AV39TFParCodNom ,
                                          byte AV16INHisEstReo ,
                                          int AV125OperarioFrom ,
                                          int AV126OperarioTo ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          String A602MaqCod ,
                                          java.util.Date A558HisProFec ,
                                          java.math.BigDecimal A1525HisProKgr ,
                                          java.math.BigDecimal A1526HisProMtr ,
                                          byte A566HisProTur ,
                                          String A557HisProF ,
                                          java.util.Date A4440HisProDTI ,
                                          java.util.Date A4441HisProDTF ,
                                          String A279CliNom ,
                                          String A212BarSer ,
                                          String A135BarColNom ,
                                          int A136BarColNum ,
                                          String A461Fase ,
                                          short A217BarTipArt ,
                                          short A2247HisProTip ,
                                          byte A3611HisProTc ,
                                          java.util.Date A5608HisProDf ,
                                          short A656ParCod ,
                                          String A867ParCodNom ,
                                          byte A3612HisProReo ,
                                          int A503GruOpeCod ,
                                          short AV21OrderedBy ,
                                          boolean AV22OrderedDsc ,
                                          String AV120TFFaseDescripcion_Sel ,
                                          String AV119TFFaseDescripcion ,
                                          String A13893FaseDescri ,
                                          java.util.Date AV17INHisProFec1 ,
                                          java.util.Date AV18INHisProFec2 ,
                                          String AV15INEmprcod ,
                                          String AV19INMaqCod1 ,
                                          String A396EmprCod ,
                                          String AV20INMaqCod2 )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int42 = new byte[44];
      Object[] GXv_Object43 = new Object[2];
      scmdbuf = "SELECT T1.HisProReo, T2.CliCod, T2.TipDefCod, T2.BarEstReo, T4.TipDefDsc, T1.HisproTdab, T1.HisProEst, T1.HisProLot, T2.BarTipCol, T5.ParCodNom, T1.ParCod, T1.HisProDf," ;
      scmdbuf += " T1.HisProTc, T1.HisProTip, T2.BarTipArt, T2.BarColNum, T2.BarColNom, T2.BarSer, T3.CliNom, T1.HisProF, T1.HisProTur, T1.HisProMtr, T1.HisProKgr, T1.HisProLin, T1.HisProFec," ;
      scmdbuf += " T1.MaqCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.GruOpeCod, T1.Fase, T1.EmprCod, T1.HisProDTI, T1.HisProDTF FROM ((((TXPLHIPRO T1 INNER JOIN TXPBARCAD T2 ON" ;
      scmdbuf += " T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) LEFT JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T3.CliCod = T2.CliCod) LEFT JOIN TXPTIPDEF T4 ON T4.EmprCod = T1.EmprCod AND T4.TipDefCod = T2.TipDefCod) LEFT JOIN TXPCODPAR T5 ON T5.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T5.ParCod = T1.ParCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.MaqCod >= ?)");
      addWhere(sWhereString, "(T1.HisProDTF >= ?)");
      addWhere(sWhereString, "(T1.HisProDTF <= ?)");
      addWhere(sWhereString, "(T1.MaqCod <= ?)");
      if ( (GXutil.strcmp("", AV90TFBarNHdr_Sel)==0) && ( ! (GXutil.strcmp("", AV89TFBarNHdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int42[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV90TFBarNHdr_Sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int42[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV102TFMaqCod_Sel)==0) && ( ! (GXutil.strcmp("", AV101TFMaqCod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int42[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV102TFMaqCod_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCod = ?)");
      }
      else
      {
         GXv_int42[8] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV103TFHisProFec)) )
      {
         addWhere(sWhereString, "(T1.HisProFec >= ?)");
      }
      else
      {
         GXv_int42[9] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV105TFHisProKgr)==0) )
      {
         addWhere(sWhereString, "(T1.HisProKgr >= ?)");
      }
      else
      {
         GXv_int42[10] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV106TFHisProKgr_To)==0) )
      {
         addWhere(sWhereString, "(T1.HisProKgr <= ?)");
      }
      else
      {
         GXv_int42[11] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV107TFHisProMtr)==0) )
      {
         addWhere(sWhereString, "(T1.HisProMtr >= ?)");
      }
      else
      {
         GXv_int42[12] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV108TFHisProMtr_To)==0) )
      {
         addWhere(sWhereString, "(T1.HisProMtr <= ?)");
      }
      else
      {
         GXv_int42[13] = (byte)(1) ;
      }
      if ( ! (0==AV109TFHisProTur) )
      {
         addWhere(sWhereString, "(T1.HisProTur >= ?)");
      }
      else
      {
         GXv_int42[14] = (byte)(1) ;
      }
      if ( ! (0==AV110TFHisProTur_To) )
      {
         addWhere(sWhereString, "(T1.HisProTur <= ?)");
      }
      else
      {
         GXv_int42[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV94TFHisProF_Sel)==0) && ( ! (GXutil.strcmp("", AV93TFHisProF)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HisProF) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int42[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV94TFHisProF_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.HisProF = ?)");
      }
      else
      {
         GXv_int42[17] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV111TFHisProDTI) )
      {
         addWhere(sWhereString, "(T1.HisProDTI >= ?)");
      }
      else
      {
         GXv_int42[18] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV113TFHisProDTF) )
      {
         addWhere(sWhereString, "(T1.HisProDTF >= ?)");
      }
      else
      {
         GXv_int42[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV92TFCliNom_Sel)==0) && ( ! (GXutil.strcmp("", AV91TFCliNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int42[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV92TFCliNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int42[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV54TFBarSer_Sel)==0) && ( ! (GXutil.strcmp("", AV53TFBarSer)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int42[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV54TFBarSer_Sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarSer = ?)");
      }
      else
      {
         GXv_int42[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV86TFBarColNom_Sel)==0) && ( ! (GXutil.strcmp("", AV85TFBarColNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int42[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV86TFBarColNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarColNom = ?)");
      }
      else
      {
         GXv_int42[25] = (byte)(1) ;
      }
      if ( ! (0==AV87TFBarColNum) )
      {
         addWhere(sWhereString, "(T2.BarColNum >= ?)");
      }
      else
      {
         GXv_int42[26] = (byte)(1) ;
      }
      if ( ! (0==AV88TFBarColNum_To) )
      {
         addWhere(sWhereString, "(T2.BarColNum <= ?)");
      }
      else
      {
         GXv_int42[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV118TFFase_Sel)==0) && ( ! (GXutil.strcmp("", AV117TFFase)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Fase) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int42[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV118TFFase_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.Fase = ?)");
      }
      else
      {
         GXv_int42[29] = (byte)(1) ;
      }
      if ( ! (0==AV99TFBarTipArt) )
      {
         addWhere(sWhereString, "(T2.BarTipArt >= ?)");
      }
      else
      {
         GXv_int42[30] = (byte)(1) ;
      }
      if ( ! (0==AV100TFBarTipArt_To) )
      {
         addWhere(sWhereString, "(T2.BarTipArt <= ?)");
      }
      else
      {
         GXv_int42[31] = (byte)(1) ;
      }
      if ( ! (0==AV121TFHisProTip) )
      {
         addWhere(sWhereString, "(T1.HisProTip >= ?)");
      }
      else
      {
         GXv_int42[32] = (byte)(1) ;
      }
      if ( ! (0==AV122TFHisProTip_To) )
      {
         addWhere(sWhereString, "(T1.HisProTip <= ?)");
      }
      else
      {
         GXv_int42[33] = (byte)(1) ;
      }
      if ( ! (0==AV123TFHisProTc) )
      {
         addWhere(sWhereString, "(T1.HisProTc >= ?)");
      }
      else
      {
         GXv_int42[34] = (byte)(1) ;
      }
      if ( ! (0==AV124TFHisProTc_To) )
      {
         addWhere(sWhereString, "(T1.HisProTc <= ?)");
      }
      else
      {
         GXv_int42[35] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV46TFHisProDf)) )
      {
         addWhere(sWhereString, "(T1.HisProDf >= ?)");
      }
      else
      {
         GXv_int42[36] = (byte)(1) ;
      }
      if ( ! (0==AV37TFParCod) )
      {
         addWhere(sWhereString, "(T1.ParCod >= ?)");
      }
      else
      {
         GXv_int42[37] = (byte)(1) ;
      }
      if ( ! (0==AV38TFParCod_To) )
      {
         addWhere(sWhereString, "(T1.ParCod <= ?)");
      }
      else
      {
         GXv_int42[38] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV40TFParCodNom_Sel)==0) && ( ! (GXutil.strcmp("", AV39TFParCodNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T5.ParCodNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int42[39] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV40TFParCodNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T5.ParCodNom = ?)");
      }
      else
      {
         GXv_int42[40] = (byte)(1) ;
      }
      if ( ! ( AV16INHisEstReo == 9 ) )
      {
         addWhere(sWhereString, "(T1.HisProReo = ?)");
      }
      else
      {
         GXv_int42[41] = (byte)(1) ;
      }
      if ( ! (0==AV125OperarioFrom) )
      {
         addWhere(sWhereString, "(T1.GruOpeCod >= ?)");
      }
      else
      {
         GXv_int42[42] = (byte)(1) ;
      }
      if ( ! (0==AV126OperarioTo) )
      {
         addWhere(sWhereString, "(T1.GruOpeCod <= ?)");
      }
      else
      {
         GXv_int42[43] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV21OrderedBy == 1 ) && ! AV22OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.MaqCod" ;
      }
      else if ( ( AV21OrderedBy == 1 ) && ( AV22OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.MaqCod DESC" ;
      }
      else if ( ( AV21OrderedBy == 2 ) && ! AV22OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.HisProFec" ;
      }
      else if ( ( AV21OrderedBy == 2 ) && ( AV22OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.HisProFec DESC" ;
      }
      else if ( ( AV21OrderedBy == 3 ) && ! AV22OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.HisProKgr" ;
      }
      else if ( ( AV21OrderedBy == 3 ) && ( AV22OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.HisProKgr DESC" ;
      }
      else if ( ( AV21OrderedBy == 4 ) && ! AV22OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.HisProMtr" ;
      }
      else if ( ( AV21OrderedBy == 4 ) && ( AV22OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.HisProMtr DESC" ;
      }
      else if ( ( AV21OrderedBy == 5 ) && ! AV22OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.HisProTur" ;
      }
      else if ( ( AV21OrderedBy == 5 ) && ( AV22OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.HisProTur DESC" ;
      }
      else if ( ( AV21OrderedBy == 6 ) && ! AV22OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.HisProF" ;
      }
      else if ( ( AV21OrderedBy == 6 ) && ( AV22OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.HisProF DESC" ;
      }
      else if ( ( AV21OrderedBy == 7 ) && ! AV22OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.HisProDTI" ;
      }
      else if ( ( AV21OrderedBy == 7 ) && ( AV22OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.HisProDTI DESC" ;
      }
      else if ( ( AV21OrderedBy == 8 ) && ! AV22OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.HisProDTF" ;
      }
      else if ( ( AV21OrderedBy == 8 ) && ( AV22OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.HisProDTF DESC" ;
      }
      else if ( ( AV21OrderedBy == 9 ) && ! AV22OrderedDsc )
      {
         scmdbuf += " ORDER BY T3.CliNom" ;
      }
      else if ( ( AV21OrderedBy == 9 ) && ( AV22OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.CliNom DESC" ;
      }
      else if ( ( AV21OrderedBy == 10 ) && ! AV22OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.BarSer" ;
      }
      else if ( ( AV21OrderedBy == 10 ) && ( AV22OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.BarSer DESC" ;
      }
      else if ( ( AV21OrderedBy == 11 ) && ! AV22OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.BarColNom" ;
      }
      else if ( ( AV21OrderedBy == 11 ) && ( AV22OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.BarColNom DESC" ;
      }
      else if ( ( AV21OrderedBy == 12 ) && ! AV22OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.BarColNum" ;
      }
      else if ( ( AV21OrderedBy == 12 ) && ( AV22OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.BarColNum DESC" ;
      }
      else if ( ( AV21OrderedBy == 13 ) && ! AV22OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.GruOpeCod" ;
      }
      else if ( ( AV21OrderedBy == 13 ) && ( AV22OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.GruOpeCod DESC" ;
      }
      else if ( ( AV21OrderedBy == 14 ) && ! AV22OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.Fase" ;
      }
      else if ( ( AV21OrderedBy == 14 ) && ( AV22OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.Fase DESC" ;
      }
      else if ( ( AV21OrderedBy == 15 ) && ! AV22OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.BarTipArt" ;
      }
      else if ( ( AV21OrderedBy == 15 ) && ( AV22OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.BarTipArt DESC" ;
      }
      else if ( ( AV21OrderedBy == 16 ) && ! AV22OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.HisProTip" ;
      }
      else if ( ( AV21OrderedBy == 16 ) && ( AV22OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.HisProTip DESC" ;
      }
      else if ( ( AV21OrderedBy == 17 ) && ! AV22OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.HisProTc" ;
      }
      else if ( ( AV21OrderedBy == 17 ) && ( AV22OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.HisProTc DESC" ;
      }
      else if ( ( AV21OrderedBy == 18 ) && ! AV22OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.HisProDf" ;
      }
      else if ( ( AV21OrderedBy == 18 ) && ( AV22OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.HisProDf DESC" ;
      }
      else if ( ( AV21OrderedBy == 19 ) && ! AV22OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ParCod" ;
      }
      else if ( ( AV21OrderedBy == 19 ) && ( AV22OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ParCod DESC" ;
      }
      else if ( ( AV21OrderedBy == 20 ) && ! AV22OrderedDsc )
      {
         scmdbuf += " ORDER BY T5.ParCodNom" ;
      }
      else if ( ( AV21OrderedBy == 20 ) && ( AV22OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T5.ParCodNom DESC" ;
      }
      GXv_Object43[0] = scmdbuf ;
      GXv_Object43[1] = GXv_int42 ;
      return GXv_Object43 ;
   }

   protected Object[] conditional_H025I4( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV90TFBarNHdr_Sel ,
                                          String AV89TFBarNHdr ,
                                          String AV102TFMaqCod_Sel ,
                                          String AV101TFMaqCod ,
                                          java.util.Date AV103TFHisProFec ,
                                          java.math.BigDecimal AV105TFHisProKgr ,
                                          java.math.BigDecimal AV106TFHisProKgr_To ,
                                          java.math.BigDecimal AV107TFHisProMtr ,
                                          java.math.BigDecimal AV108TFHisProMtr_To ,
                                          byte AV109TFHisProTur ,
                                          byte AV110TFHisProTur_To ,
                                          String AV94TFHisProF_Sel ,
                                          String AV93TFHisProF ,
                                          java.util.Date AV111TFHisProDTI ,
                                          java.util.Date AV113TFHisProDTF ,
                                          String AV92TFCliNom_Sel ,
                                          String AV91TFCliNom ,
                                          String AV54TFBarSer_Sel ,
                                          String AV53TFBarSer ,
                                          String AV86TFBarColNom_Sel ,
                                          String AV85TFBarColNom ,
                                          int AV87TFBarColNum ,
                                          int AV88TFBarColNum_To ,
                                          String AV118TFFase_Sel ,
                                          String AV117TFFase ,
                                          short AV99TFBarTipArt ,
                                          short AV100TFBarTipArt_To ,
                                          short AV121TFHisProTip ,
                                          short AV122TFHisProTip_To ,
                                          byte AV123TFHisProTc ,
                                          byte AV124TFHisProTc_To ,
                                          java.util.Date AV46TFHisProDf ,
                                          short AV37TFParCod ,
                                          short AV38TFParCod_To ,
                                          String AV40TFParCodNom_Sel ,
                                          String AV39TFParCodNom ,
                                          byte AV16INHisEstReo ,
                                          int AV125OperarioFrom ,
                                          int AV126OperarioTo ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          String A602MaqCod ,
                                          java.util.Date A558HisProFec ,
                                          java.math.BigDecimal A1525HisProKgr ,
                                          java.math.BigDecimal A1526HisProMtr ,
                                          byte A566HisProTur ,
                                          String A557HisProF ,
                                          java.util.Date A4440HisProDTI ,
                                          java.util.Date A4441HisProDTF ,
                                          String A279CliNom ,
                                          String A212BarSer ,
                                          String A135BarColNom ,
                                          int A136BarColNum ,
                                          String A461Fase ,
                                          short A217BarTipArt ,
                                          short A2247HisProTip ,
                                          byte A3611HisProTc ,
                                          java.util.Date A5608HisProDf ,
                                          short A656ParCod ,
                                          String A867ParCodNom ,
                                          byte A3612HisProReo ,
                                          int A503GruOpeCod ,
                                          String AV120TFFaseDescripcion_Sel ,
                                          String AV119TFFaseDescripcion ,
                                          String A13893FaseDescri ,
                                          java.util.Date AV17INHisProFec1 ,
                                          java.util.Date AV18INHisProFec2 ,
                                          String AV15INEmprcod ,
                                          String AV19INMaqCod1 ,
                                          String A396EmprCod ,
                                          String AV20INMaqCod2 )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int44 = new byte[44];
      Object[] GXv_Object45 = new Object[2];
      scmdbuf = "SELECT T1.HisProLin, T2.CliCod, T1.GruOpeCod, T1.HisProReo, T4.ParCodNom, T1.ParCod, T1.HisProDf, T1.HisProTc, T1.HisProTip, T2.BarTipArt, T2.BarColNum, T2.BarColNom," ;
      scmdbuf += " T2.BarSer, T3.CliNom, T1.HisProDTF, T1.HisProDTI, T1.HisProF, T1.HisProTur, T1.HisProMtr, T1.HisProKgr, T1.HisProFec, T1.MaqCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod," ;
      scmdbuf += " T1.Fase, T1.EmprCod FROM (((TXPLHIPRO T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar" ;
      scmdbuf += " = T1.BarCodPar) LEFT JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T2.CliCod) LEFT JOIN TXPCODPAR T4 ON T4.EmprCod = T1.EmprCod AND T4.ParCod = T1.ParCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.MaqCod >= ?)");
      addWhere(sWhereString, "(T1.HisProDTF >= ?)");
      addWhere(sWhereString, "(T1.HisProDTF <= ?)");
      addWhere(sWhereString, "(T1.MaqCod <= ?)");
      if ( (GXutil.strcmp("", AV90TFBarNHdr_Sel)==0) && ( ! (GXutil.strcmp("", AV89TFBarNHdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int44[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV90TFBarNHdr_Sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int44[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV102TFMaqCod_Sel)==0) && ( ! (GXutil.strcmp("", AV101TFMaqCod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int44[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV102TFMaqCod_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCod = ?)");
      }
      else
      {
         GXv_int44[8] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV103TFHisProFec)) )
      {
         addWhere(sWhereString, "(T1.HisProFec >= ?)");
      }
      else
      {
         GXv_int44[9] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV105TFHisProKgr)==0) )
      {
         addWhere(sWhereString, "(T1.HisProKgr >= ?)");
      }
      else
      {
         GXv_int44[10] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV106TFHisProKgr_To)==0) )
      {
         addWhere(sWhereString, "(T1.HisProKgr <= ?)");
      }
      else
      {
         GXv_int44[11] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV107TFHisProMtr)==0) )
      {
         addWhere(sWhereString, "(T1.HisProMtr >= ?)");
      }
      else
      {
         GXv_int44[12] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV108TFHisProMtr_To)==0) )
      {
         addWhere(sWhereString, "(T1.HisProMtr <= ?)");
      }
      else
      {
         GXv_int44[13] = (byte)(1) ;
      }
      if ( ! (0==AV109TFHisProTur) )
      {
         addWhere(sWhereString, "(T1.HisProTur >= ?)");
      }
      else
      {
         GXv_int44[14] = (byte)(1) ;
      }
      if ( ! (0==AV110TFHisProTur_To) )
      {
         addWhere(sWhereString, "(T1.HisProTur <= ?)");
      }
      else
      {
         GXv_int44[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV94TFHisProF_Sel)==0) && ( ! (GXutil.strcmp("", AV93TFHisProF)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HisProF) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int44[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV94TFHisProF_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.HisProF = ?)");
      }
      else
      {
         GXv_int44[17] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV111TFHisProDTI) )
      {
         addWhere(sWhereString, "(T1.HisProDTI >= ?)");
      }
      else
      {
         GXv_int44[18] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV113TFHisProDTF) )
      {
         addWhere(sWhereString, "(T1.HisProDTF >= ?)");
      }
      else
      {
         GXv_int44[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV92TFCliNom_Sel)==0) && ( ! (GXutil.strcmp("", AV91TFCliNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int44[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV92TFCliNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int44[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV54TFBarSer_Sel)==0) && ( ! (GXutil.strcmp("", AV53TFBarSer)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int44[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV54TFBarSer_Sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarSer = ?)");
      }
      else
      {
         GXv_int44[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV86TFBarColNom_Sel)==0) && ( ! (GXutil.strcmp("", AV85TFBarColNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int44[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV86TFBarColNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarColNom = ?)");
      }
      else
      {
         GXv_int44[25] = (byte)(1) ;
      }
      if ( ! (0==AV87TFBarColNum) )
      {
         addWhere(sWhereString, "(T2.BarColNum >= ?)");
      }
      else
      {
         GXv_int44[26] = (byte)(1) ;
      }
      if ( ! (0==AV88TFBarColNum_To) )
      {
         addWhere(sWhereString, "(T2.BarColNum <= ?)");
      }
      else
      {
         GXv_int44[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV118TFFase_Sel)==0) && ( ! (GXutil.strcmp("", AV117TFFase)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Fase) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int44[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV118TFFase_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.Fase = ?)");
      }
      else
      {
         GXv_int44[29] = (byte)(1) ;
      }
      if ( ! (0==AV99TFBarTipArt) )
      {
         addWhere(sWhereString, "(T2.BarTipArt >= ?)");
      }
      else
      {
         GXv_int44[30] = (byte)(1) ;
      }
      if ( ! (0==AV100TFBarTipArt_To) )
      {
         addWhere(sWhereString, "(T2.BarTipArt <= ?)");
      }
      else
      {
         GXv_int44[31] = (byte)(1) ;
      }
      if ( ! (0==AV121TFHisProTip) )
      {
         addWhere(sWhereString, "(T1.HisProTip >= ?)");
      }
      else
      {
         GXv_int44[32] = (byte)(1) ;
      }
      if ( ! (0==AV122TFHisProTip_To) )
      {
         addWhere(sWhereString, "(T1.HisProTip <= ?)");
      }
      else
      {
         GXv_int44[33] = (byte)(1) ;
      }
      if ( ! (0==AV123TFHisProTc) )
      {
         addWhere(sWhereString, "(T1.HisProTc >= ?)");
      }
      else
      {
         GXv_int44[34] = (byte)(1) ;
      }
      if ( ! (0==AV124TFHisProTc_To) )
      {
         addWhere(sWhereString, "(T1.HisProTc <= ?)");
      }
      else
      {
         GXv_int44[35] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV46TFHisProDf)) )
      {
         addWhere(sWhereString, "(T1.HisProDf >= ?)");
      }
      else
      {
         GXv_int44[36] = (byte)(1) ;
      }
      if ( ! (0==AV37TFParCod) )
      {
         addWhere(sWhereString, "(T1.ParCod >= ?)");
      }
      else
      {
         GXv_int44[37] = (byte)(1) ;
      }
      if ( ! (0==AV38TFParCod_To) )
      {
         addWhere(sWhereString, "(T1.ParCod <= ?)");
      }
      else
      {
         GXv_int44[38] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV40TFParCodNom_Sel)==0) && ( ! (GXutil.strcmp("", AV39TFParCodNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.ParCodNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int44[39] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV40TFParCodNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T4.ParCodNom = ?)");
      }
      else
      {
         GXv_int44[40] = (byte)(1) ;
      }
      if ( ! ( AV16INHisEstReo == 9 ) )
      {
         addWhere(sWhereString, "(T1.HisProReo = ?)");
      }
      else
      {
         GXv_int44[41] = (byte)(1) ;
      }
      if ( ! (0==AV125OperarioFrom) )
      {
         addWhere(sWhereString, "(T1.GruOpeCod >= ?)");
      }
      else
      {
         GXv_int44[42] = (byte)(1) ;
      }
      if ( ! (0==AV126OperarioTo) )
      {
         addWhere(sWhereString, "(T1.GruOpeCod <= ?)");
      }
      else
      {
         GXv_int44[43] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod" ;
      GXv_Object45[0] = scmdbuf ;
      GXv_Object45[1] = GXv_int44 ;
      return GXv_Object45 ;
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
                  return conditional_H025I2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (java.util.Date)dynConstraints[4] , (java.math.BigDecimal)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , ((Number) dynConstraints[9]).byteValue() , ((Number) dynConstraints[10]).byteValue() , (String)dynConstraints[11] , (String)dynConstraints[12] , (java.util.Date)dynConstraints[13] , (java.util.Date)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , ((Number) dynConstraints[21]).intValue() , ((Number) dynConstraints[22]).intValue() , (String)dynConstraints[23] , (String)dynConstraints[24] , ((Number) dynConstraints[25]).shortValue() , ((Number) dynConstraints[26]).shortValue() , ((Number) dynConstraints[27]).shortValue() , ((Number) dynConstraints[28]).shortValue() , ((Number) dynConstraints[29]).byteValue() , ((Number) dynConstraints[30]).byteValue() , (java.util.Date)dynConstraints[31] , ((Number) dynConstraints[32]).shortValue() , ((Number) dynConstraints[33]).shortValue() , (String)dynConstraints[34] , (String)dynConstraints[35] , ((Number) dynConstraints[36]).byteValue() , ((Number) dynConstraints[37]).intValue() , ((Number) dynConstraints[38]).intValue() , ((Number) dynConstraints[39]).intValue() , ((Number) dynConstraints[40]).byteValue() , (String)dynConstraints[41] , (String)dynConstraints[42] , (java.util.Date)dynConstraints[43] , (java.math.BigDecimal)dynConstraints[44] , (java.math.BigDecimal)dynConstraints[45] , ((Number) dynConstraints[46]).byteValue() , (String)dynConstraints[47] , (java.util.Date)dynConstraints[48] , (java.util.Date)dynConstraints[49] , (String)dynConstraints[50] , (String)dynConstraints[51] , (String)dynConstraints[52] , ((Number) dynConstraints[53]).intValue() , (String)dynConstraints[54] , ((Number) dynConstraints[55]).shortValue() , ((Number) dynConstraints[56]).shortValue() , ((Number) dynConstraints[57]).byteValue() , (java.util.Date)dynConstraints[58] , ((Number) dynConstraints[59]).shortValue() , (String)dynConstraints[60] , ((Number) dynConstraints[61]).byteValue() , ((Number) dynConstraints[62]).intValue() , ((Number) dynConstraints[63]).shortValue() , ((Boolean) dynConstraints[64]).booleanValue() , (String)dynConstraints[65] , (String)dynConstraints[66] , (String)dynConstraints[67] , (java.util.Date)dynConstraints[68] , (java.util.Date)dynConstraints[69] , (String)dynConstraints[70] , (String)dynConstraints[71] , (String)dynConstraints[72] , (String)dynConstraints[73] );
            case 1 :
                  return conditional_H025I3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (java.util.Date)dynConstraints[4] , (java.math.BigDecimal)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , ((Number) dynConstraints[9]).byteValue() , ((Number) dynConstraints[10]).byteValue() , (String)dynConstraints[11] , (String)dynConstraints[12] , (java.util.Date)dynConstraints[13] , (java.util.Date)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , ((Number) dynConstraints[21]).intValue() , ((Number) dynConstraints[22]).intValue() , (String)dynConstraints[23] , (String)dynConstraints[24] , ((Number) dynConstraints[25]).shortValue() , ((Number) dynConstraints[26]).shortValue() , ((Number) dynConstraints[27]).shortValue() , ((Number) dynConstraints[28]).shortValue() , ((Number) dynConstraints[29]).byteValue() , ((Number) dynConstraints[30]).byteValue() , (java.util.Date)dynConstraints[31] , ((Number) dynConstraints[32]).shortValue() , ((Number) dynConstraints[33]).shortValue() , (String)dynConstraints[34] , (String)dynConstraints[35] , ((Number) dynConstraints[36]).byteValue() , ((Number) dynConstraints[37]).intValue() , ((Number) dynConstraints[38]).intValue() , ((Number) dynConstraints[39]).intValue() , ((Number) dynConstraints[40]).byteValue() , (String)dynConstraints[41] , (String)dynConstraints[42] , (java.util.Date)dynConstraints[43] , (java.math.BigDecimal)dynConstraints[44] , (java.math.BigDecimal)dynConstraints[45] , ((Number) dynConstraints[46]).byteValue() , (String)dynConstraints[47] , (java.util.Date)dynConstraints[48] , (java.util.Date)dynConstraints[49] , (String)dynConstraints[50] , (String)dynConstraints[51] , (String)dynConstraints[52] , ((Number) dynConstraints[53]).intValue() , (String)dynConstraints[54] , ((Number) dynConstraints[55]).shortValue() , ((Number) dynConstraints[56]).shortValue() , ((Number) dynConstraints[57]).byteValue() , (java.util.Date)dynConstraints[58] , ((Number) dynConstraints[59]).shortValue() , (String)dynConstraints[60] , ((Number) dynConstraints[61]).byteValue() , ((Number) dynConstraints[62]).intValue() , ((Number) dynConstraints[63]).shortValue() , ((Boolean) dynConstraints[64]).booleanValue() , (String)dynConstraints[65] , (String)dynConstraints[66] , (String)dynConstraints[67] , (java.util.Date)dynConstraints[68] , (java.util.Date)dynConstraints[69] , (String)dynConstraints[70] , (String)dynConstraints[71] , (String)dynConstraints[72] , (String)dynConstraints[73] );
            case 2 :
                  return conditional_H025I4(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (java.util.Date)dynConstraints[4] , (java.math.BigDecimal)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , ((Number) dynConstraints[9]).byteValue() , ((Number) dynConstraints[10]).byteValue() , (String)dynConstraints[11] , (String)dynConstraints[12] , (java.util.Date)dynConstraints[13] , (java.util.Date)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , ((Number) dynConstraints[21]).intValue() , ((Number) dynConstraints[22]).intValue() , (String)dynConstraints[23] , (String)dynConstraints[24] , ((Number) dynConstraints[25]).shortValue() , ((Number) dynConstraints[26]).shortValue() , ((Number) dynConstraints[27]).shortValue() , ((Number) dynConstraints[28]).shortValue() , ((Number) dynConstraints[29]).byteValue() , ((Number) dynConstraints[30]).byteValue() , (java.util.Date)dynConstraints[31] , ((Number) dynConstraints[32]).shortValue() , ((Number) dynConstraints[33]).shortValue() , (String)dynConstraints[34] , (String)dynConstraints[35] , ((Number) dynConstraints[36]).byteValue() , ((Number) dynConstraints[37]).intValue() , ((Number) dynConstraints[38]).intValue() , ((Number) dynConstraints[39]).intValue() , ((Number) dynConstraints[40]).byteValue() , (String)dynConstraints[41] , (String)dynConstraints[42] , (java.util.Date)dynConstraints[43] , (java.math.BigDecimal)dynConstraints[44] , (java.math.BigDecimal)dynConstraints[45] , ((Number) dynConstraints[46]).byteValue() , (String)dynConstraints[47] , (java.util.Date)dynConstraints[48] , (java.util.Date)dynConstraints[49] , (String)dynConstraints[50] , (String)dynConstraints[51] , (String)dynConstraints[52] , ((Number) dynConstraints[53]).intValue() , (String)dynConstraints[54] , ((Number) dynConstraints[55]).shortValue() , ((Number) dynConstraints[56]).shortValue() , ((Number) dynConstraints[57]).byteValue() , (java.util.Date)dynConstraints[58] , ((Number) dynConstraints[59]).shortValue() , (String)dynConstraints[60] , ((Number) dynConstraints[61]).byteValue() , ((Number) dynConstraints[62]).intValue() , (String)dynConstraints[63] , (String)dynConstraints[64] , (String)dynConstraints[65] , (java.util.Date)dynConstraints[66] , (java.util.Date)dynConstraints[67] , (String)dynConstraints[68] , (String)dynConstraints[69] , (String)dynConstraints[70] , (String)dynConstraints[71] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H025I2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H025I3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H025I4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H025I5", "SELECT FasCod, EmprCod, FasDivTime FROM TXPFASPRO WHERE EmprCod = ? and FasCod = ? ORDER BY EmprCod, FasCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("H025I6", "SELECT EstTinAny, EstTinMes, EstTinDia, EstTinNr, BarMaqTin, BarParTin, BarReoTin, BarCodTin, EmprCod, BarKgsTt, BarKgmTin, BarCosPD, BarCosPA, BarCosCol, BarCosAnc, BarCosAD, BarCosAA, BarAgrLot FROM TXPLCONTI WHERE (EmprCod = ? and BarCodTin = ? and BarReoTin = ? and BarParTin = ?) AND (BarMaqTin >= ?) AND (BarMaqTin <= ?) ORDER BY EmprCod, BarCodTin, BarReoTin, BarParTin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((short[]) buf[3])[0] = rslt.getShort(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((byte[]) buf[5])[0] = rslt.getByte(4);
               ((String[]) buf[6])[0] = rslt.getString(5, 30);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((short[]) buf[8])[0] = rslt.getShort(6);
               ((byte[]) buf[9])[0] = rslt.getByte(7);
               ((String[]) buf[10])[0] = rslt.getString(8, 10);
               ((byte[]) buf[11])[0] = rslt.getByte(9);
               ((String[]) buf[12])[0] = rslt.getString(10, 30);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((short[]) buf[14])[0] = rslt.getShort(11);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[16])[0] = rslt.getGXDate(12);
               ((byte[]) buf[17])[0] = rslt.getByte(13);
               ((short[]) buf[18])[0] = rslt.getShort(14);
               ((short[]) buf[19])[0] = rslt.getShort(15);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((int[]) buf[21])[0] = rslt.getInt(16);
               ((String[]) buf[22])[0] = rslt.getString(17, 13);
               ((String[]) buf[23])[0] = rslt.getString(18, 16);
               ((String[]) buf[24])[0] = rslt.getString(19, 30);
               ((String[]) buf[25])[0] = rslt.getString(20, 1);
               ((byte[]) buf[26])[0] = rslt.getByte(21);
               ((java.math.BigDecimal[]) buf[27])[0] = rslt.getBigDecimal(22,2);
               ((java.math.BigDecimal[]) buf[28])[0] = rslt.getBigDecimal(23,2);
               ((int[]) buf[29])[0] = rslt.getInt(24);
               ((java.util.Date[]) buf[30])[0] = rslt.getGXDate(25);
               ((String[]) buf[31])[0] = rslt.getString(26, 6);
               ((String[]) buf[32])[0] = rslt.getString(27, 1);
               ((byte[]) buf[33])[0] = rslt.getByte(28);
               ((int[]) buf[34])[0] = rslt.getInt(29);
               ((int[]) buf[35])[0] = rslt.getInt(30);
               ((String[]) buf[36])[0] = rslt.getString(31, 8);
               ((String[]) buf[37])[0] = rslt.getString(32, 3);
               ((java.util.Date[]) buf[38])[0] = rslt.getGXDateTime(33);
               ((boolean[]) buf[39])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[40])[0] = rslt.getGXDateTime(34);
               ((boolean[]) buf[41])[0] = rslt.wasNull();
               return;
            case 1 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((short[]) buf[3])[0] = rslt.getShort(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((byte[]) buf[5])[0] = rslt.getByte(4);
               ((String[]) buf[6])[0] = rslt.getString(5, 30);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((short[]) buf[8])[0] = rslt.getShort(6);
               ((byte[]) buf[9])[0] = rslt.getByte(7);
               ((String[]) buf[10])[0] = rslt.getString(8, 10);
               ((byte[]) buf[11])[0] = rslt.getByte(9);
               ((String[]) buf[12])[0] = rslt.getString(10, 30);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((short[]) buf[14])[0] = rslt.getShort(11);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[16])[0] = rslt.getGXDate(12);
               ((byte[]) buf[17])[0] = rslt.getByte(13);
               ((short[]) buf[18])[0] = rslt.getShort(14);
               ((short[]) buf[19])[0] = rslt.getShort(15);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((int[]) buf[21])[0] = rslt.getInt(16);
               ((String[]) buf[22])[0] = rslt.getString(17, 13);
               ((String[]) buf[23])[0] = rslt.getString(18, 16);
               ((String[]) buf[24])[0] = rslt.getString(19, 30);
               ((String[]) buf[25])[0] = rslt.getString(20, 1);
               ((byte[]) buf[26])[0] = rslt.getByte(21);
               ((java.math.BigDecimal[]) buf[27])[0] = rslt.getBigDecimal(22,2);
               ((java.math.BigDecimal[]) buf[28])[0] = rslt.getBigDecimal(23,2);
               ((int[]) buf[29])[0] = rslt.getInt(24);
               ((java.util.Date[]) buf[30])[0] = rslt.getGXDate(25);
               ((String[]) buf[31])[0] = rslt.getString(26, 6);
               ((String[]) buf[32])[0] = rslt.getString(27, 1);
               ((byte[]) buf[33])[0] = rslt.getByte(28);
               ((int[]) buf[34])[0] = rslt.getInt(29);
               ((int[]) buf[35])[0] = rslt.getInt(30);
               ((String[]) buf[36])[0] = rslt.getString(31, 8);
               ((String[]) buf[37])[0] = rslt.getString(32, 3);
               ((java.util.Date[]) buf[38])[0] = rslt.getGXDateTime(33);
               ((boolean[]) buf[39])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[40])[0] = rslt.getGXDateTime(34);
               ((boolean[]) buf[41])[0] = rslt.wasNull();
               return;
            case 2 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((byte[]) buf[4])[0] = rslt.getByte(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 30);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((short[]) buf[7])[0] = rslt.getShort(6);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDate(7);
               ((byte[]) buf[10])[0] = rslt.getByte(8);
               ((short[]) buf[11])[0] = rslt.getShort(9);
               ((short[]) buf[12])[0] = rslt.getShort(10);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((int[]) buf[14])[0] = rslt.getInt(11);
               ((String[]) buf[15])[0] = rslt.getString(12, 13);
               ((String[]) buf[16])[0] = rslt.getString(13, 16);
               ((String[]) buf[17])[0] = rslt.getString(14, 30);
               ((java.util.Date[]) buf[18])[0] = rslt.getGXDateTime(15);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[20])[0] = rslt.getGXDateTime(16);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getString(17, 1);
               ((byte[]) buf[23])[0] = rslt.getByte(18);
               ((java.math.BigDecimal[]) buf[24])[0] = rslt.getBigDecimal(19,2);
               ((java.math.BigDecimal[]) buf[25])[0] = rslt.getBigDecimal(20,2);
               ((java.util.Date[]) buf[26])[0] = rslt.getGXDate(21);
               ((String[]) buf[27])[0] = rslt.getString(22, 6);
               ((String[]) buf[28])[0] = rslt.getString(23, 1);
               ((byte[]) buf[29])[0] = rslt.getByte(24);
               ((int[]) buf[30])[0] = rslt.getInt(25);
               ((String[]) buf[31])[0] = rslt.getString(26, 8);
               ((String[]) buf[32])[0] = rslt.getString(27, 3);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               return;
            case 4 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 1);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((byte[]) buf[8])[0] = rslt.getByte(7);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((int[]) buf[10])[0] = rslt.getInt(8);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(9, 3);
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(10,2);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(11,2);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(12,2);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(13,2);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[21])[0] = rslt.getBigDecimal(14,2);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[23])[0] = rslt.getBigDecimal(15,2);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[25])[0] = rslt.getBigDecimal(16,2);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[27])[0] = rslt.getBigDecimal(17,2);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getString(18, 10);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
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
                  stmt.setString(sIdx, (String)parms[44], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[46], false);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[47], false);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 6);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 11);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 11);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 6);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 6);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[53]);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[54], 2);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[55], 2);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[56], 2);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[57], 2);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[58]).byteValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[59]).byteValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 1);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 1);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[62], false);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[63], false);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 30);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 30);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 16);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 16);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 13);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 13);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[70]).intValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[71]).intValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 8);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 8);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[74]).shortValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[75]).shortValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[76]).shortValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[77]).shortValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[78]).byteValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[79]).byteValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[80]);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[81]).shortValue());
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[82]).shortValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[83], 30);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[84], 30);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[85]).byteValue());
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[86]).intValue());
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[87]).intValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[46], false);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[47], false);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 6);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 11);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 11);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 6);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 6);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[53]);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[54], 2);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[55], 2);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[56], 2);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[57], 2);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[58]).byteValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[59]).byteValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 1);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 1);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[62], false);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[63], false);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 30);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 30);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 16);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 16);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 13);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 13);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[70]).intValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[71]).intValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 8);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 8);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[74]).shortValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[75]).shortValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[76]).shortValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[77]).shortValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[78]).byteValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[79]).byteValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[80]);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[81]).shortValue());
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[82]).shortValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[83], 30);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[84], 30);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[85]).byteValue());
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[86]).intValue());
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[87]).intValue());
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[46], false);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[47], false);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 6);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 11);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 11);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 6);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 6);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[53]);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[54], 2);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[55], 2);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[56], 2);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[57], 2);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[58]).byteValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[59]).byteValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 1);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 1);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[62], false);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[63], false);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 30);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 30);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 16);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 16);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 13);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 13);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[70]).intValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[71]).intValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 8);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 8);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[74]).shortValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[75]).shortValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[76]).shortValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[77]).shortValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[78]).byteValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[79]).byteValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[80]);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[81]).shortValue());
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[82]).shortValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[83], 30);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[84], 30);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[85]).byteValue());
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[86]).intValue());
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[87]).intValue());
               }
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 6);
               stmt.setString(6, (String)parms[5], 6);
               return;
      }
   }

}

