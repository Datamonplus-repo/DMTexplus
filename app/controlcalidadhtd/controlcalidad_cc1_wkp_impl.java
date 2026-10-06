package app.controlcalidadhtd ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class controlcalidad_cc1_wkp_impl extends GXDataArea
{
   public controlcalidad_cc1_wkp_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public controlcalidad_cc1_wkp_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( controlcalidad_cc1_wkp_impl.class ));
   }

   public controlcalidad_cc1_wkp_impl( int remoteHandle ,
                                       ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      chkavCcoklin = UIFactory.getCheckbox(this);
      chkavCcoklingrid = UIFactory.getCheckbox(this);
   }

   public void initweb( )
   {
      initialize_properties( ) ;
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
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Gridcontrolcalidad_ccsta_sdts") == 0 )
         {
            gxnrgridcontrolcalidad_ccsta_sdts_newrow_invoke( ) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxGridRefresh_"+"Gridcontrolcalidad_ccsta_sdts") == 0 )
         {
            gxgrgridcontrolcalidad_ccsta_sdts_refresh_invoke( ) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Gridcontrolcalidad_valoresestandars_ccsta_sdts") == 0 )
         {
            gxnrgridcontrolcalidad_valoresestandars_ccsta_sdts_newrow_invoke( ) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxGridRefresh_"+"Gridcontrolcalidad_valoresestandars_ccsta_sdts") == 0 )
         {
            gxgrgridcontrolcalidad_valoresestandars_ccsta_sdts_refresh_invoke( ) ;
            return  ;
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
            AV31EmprCod = gxfirstwebparm ;
            httpContext.ajax_rsp_assign_attri("", false, "AV31EmprCod", AV31EmprCod);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV31EmprCod, "@!"))));
            if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
            {
               AV9BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV9BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9BarCod), 8, 0));
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV9BarCod), "ZZZZZZZ9")));
               AV11BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV11BarCodReo", GXutil.str( AV11BarCodReo, 1, 0));
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODREO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV11BarCodReo), "9")));
               AV10BarCodPar = httpContext.GetPar( "BarCodPar") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV10BarCodPar", AV10BarCodPar);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODPAR", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV10BarCodPar, ""))));
               AV48ProCod = httpContext.GetPar( "ProCod") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV48ProCod", AV48ProCod);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPROCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV48ProCod, ""))));
               AV49ProDsc = httpContext.GetPar( "ProDsc") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV49ProDsc", AV49ProDsc);
               AV14BarOrdLin = (short)(GXutil.lval( httpContext.GetPar( "BarOrdLin"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV14BarOrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14BarOrdLin), 4, 0));
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARORDLIN", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV14BarOrdLin), "ZZZ9")));
               AV32FasCod = httpContext.GetPar( "FasCod") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV32FasCod", AV32FasCod);
               AV33FasDsc = httpContext.GetPar( "FasDsc") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV33FasDsc", AV33FasDsc);
               AV19CCTCod = (int)(GXutil.lval( httpContext.GetPar( "CCTCod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV19CCTCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19CCTCod), 6, 0));
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCCTCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV19CCTCod), "ZZZZZ9")));
               AV20CCTDsc = httpContext.GetPar( "CCTDsc") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV20CCTDsc", AV20CCTDsc);
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
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public void gxnrgridcontrolcalidad_ccsta_sdts_newrow_invoke( )
   {
      nRC_GXsfl_131 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_131"))) ;
      nGXsfl_131_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_131_idx"))) ;
      sGXsfl_131_idx = httpContext.GetPar( "sGXsfl_131_idx") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxnrgridcontrolcalidad_ccsta_sdts_newrow( ) ;
      /* End function gxnrGridcontrolcalidad_ccsta_sdts_newrow_invoke */
   }

   public void gxgrgridcontrolcalidad_ccsta_sdts_refresh_invoke( )
   {
      subGridcontrolcalidad_ccsta_sdts_Rows = (int)(GXutil.lval( httpContext.GetPar( "subGridcontrolcalidad_ccsta_sdts_Rows"))) ;
      subGridcontrolcalidad_valoresestandars_ccsta_sdts_Rows = (int)(GXutil.lval( httpContext.GetPar( "subGridcontrolcalidad_valoresestandars_ccsta_sdts_Rows"))) ;
      subGrid_Rows = (int)(GXutil.lval( httpContext.GetPar( "subGrid_Rows"))) ;
      AV96Pgmname = httpContext.GetPar( "Pgmname") ;
      AV45OrderedBy = (short)(GXutil.lval( httpContext.GetPar( "OrderedBy"))) ;
      AV46OrderedDsc = GXutil.strtobool( httpContext.GetPar( "OrderedDsc")) ;
      AV58TFCCTLin = (short)(GXutil.lval( httpContext.GetPar( "TFCCTLin"))) ;
      AV59TFCCTLin_To = (short)(GXutil.lval( httpContext.GetPar( "TFCCTLin_To"))) ;
      AV62TFCCTLinDsc = httpContext.GetPar( "TFCCTLinDsc") ;
      AV63TFCCTLinDsc_Sel = httpContext.GetPar( "TFCCTLinDsc_Sel") ;
      AV60TFCCTLinDc2 = httpContext.GetPar( "TFCCTLinDc2") ;
      AV61TFCCTLinDc2_Sel = httpContext.GetPar( "TFCCTLinDc2_Sel") ;
      AV54TFCCMetodo = httpContext.GetPar( "TFCCMetodo") ;
      AV55TFCCMetodo_Sel = httpContext.GetPar( "TFCCMetodo_Sel") ;
      AV52TFCCEspecif = httpContext.GetPar( "TFCCEspecif") ;
      AV53TFCCEspecif_Sel = httpContext.GetPar( "TFCCEspecif_Sel") ;
      AV64TFCCVal = httpContext.GetPar( "TFCCVal") ;
      AV65TFCCVal_Sel = httpContext.GetPar( "TFCCVal_Sel") ;
      AV5CCOkLin = (byte)(GXutil.lval( httpContext.GetPar( "CCOkLin"))) ;
      AV31EmprCod = httpContext.GetPar( "EmprCod") ;
      AV25clicod = (int)(GXutil.lval( httpContext.GetPar( "clicod"))) ;
      AV15Barser = httpContext.GetPar( "Barser") ;
      AV12barcolnom = httpContext.GetPar( "barcolnom") ;
      AV13barcolnum = (int)(GXutil.lval( httpContext.GetPar( "barcolnum"))) ;
      AV71AvisoCC = (short)(GXutil.lval( httpContext.GetPar( "AvisoCC"))) ;
      AV73CCTVal = httpContext.GetPar( "CCTVal") ;
      AV9BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
      AV11BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
      AV10BarCodPar = httpContext.GetPar( "BarCodPar") ;
      AV48ProCod = httpContext.GetPar( "ProCod") ;
      AV14BarOrdLin = (short)(GXutil.lval( httpContext.GetPar( "BarOrdLin"))) ;
      AV19CCTCod = (int)(GXutil.lval( httpContext.GetPar( "CCTCod"))) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgridcontrolcalidad_ccsta_sdts_refresh( subGridcontrolcalidad_ccsta_sdts_Rows, subGridcontrolcalidad_valoresestandars_ccsta_sdts_Rows, subGrid_Rows, AV96Pgmname, AV45OrderedBy, AV46OrderedDsc, AV58TFCCTLin, AV59TFCCTLin_To, AV62TFCCTLinDsc, AV63TFCCTLinDsc_Sel, AV60TFCCTLinDc2, AV61TFCCTLinDc2_Sel, AV54TFCCMetodo, AV55TFCCMetodo_Sel, AV52TFCCEspecif, AV53TFCCEspecif_Sel, AV64TFCCVal, AV65TFCCVal_Sel, AV5CCOkLin, AV31EmprCod, AV25clicod, AV15Barser, AV12barcolnom, AV13barcolnum, AV71AvisoCC, AV73CCTVal, AV9BarCod, AV11BarCodReo, AV10BarCodPar, AV48ProCod, AV14BarOrdLin, AV19CCTCod) ;
      addString( httpContext.getJSONResponse( )) ;
      /* End function gxgrGridcontrolcalidad_ccsta_sdts_refresh_invoke */
   }

   public void gxnrgridcontrolcalidad_valoresestandars_ccsta_sdts_newrow_invoke( )
   {
      nRC_GXsfl_141 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_141"))) ;
      nGXsfl_141_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_141_idx"))) ;
      sGXsfl_141_idx = httpContext.GetPar( "sGXsfl_141_idx") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxnrgridcontrolcalidad_valoresestandars_ccsta_sdts_newrow( ) ;
      /* End function gxnrGridcontrolcalidad_valoresestandars_ccsta_sdts_newrow_invoke */
   }

   public void gxgrgridcontrolcalidad_valoresestandars_ccsta_sdts_refresh_invoke( )
   {
      subGridcontrolcalidad_ccsta_sdts_Rows = (int)(GXutil.lval( httpContext.GetPar( "subGridcontrolcalidad_ccsta_sdts_Rows"))) ;
      subGridcontrolcalidad_valoresestandars_ccsta_sdts_Rows = (int)(GXutil.lval( httpContext.GetPar( "subGridcontrolcalidad_valoresestandars_ccsta_sdts_Rows"))) ;
      subGrid_Rows = (int)(GXutil.lval( httpContext.GetPar( "subGrid_Rows"))) ;
      AV96Pgmname = httpContext.GetPar( "Pgmname") ;
      AV45OrderedBy = (short)(GXutil.lval( httpContext.GetPar( "OrderedBy"))) ;
      AV46OrderedDsc = GXutil.strtobool( httpContext.GetPar( "OrderedDsc")) ;
      AV58TFCCTLin = (short)(GXutil.lval( httpContext.GetPar( "TFCCTLin"))) ;
      AV59TFCCTLin_To = (short)(GXutil.lval( httpContext.GetPar( "TFCCTLin_To"))) ;
      AV62TFCCTLinDsc = httpContext.GetPar( "TFCCTLinDsc") ;
      AV63TFCCTLinDsc_Sel = httpContext.GetPar( "TFCCTLinDsc_Sel") ;
      AV60TFCCTLinDc2 = httpContext.GetPar( "TFCCTLinDc2") ;
      AV61TFCCTLinDc2_Sel = httpContext.GetPar( "TFCCTLinDc2_Sel") ;
      AV54TFCCMetodo = httpContext.GetPar( "TFCCMetodo") ;
      AV55TFCCMetodo_Sel = httpContext.GetPar( "TFCCMetodo_Sel") ;
      AV52TFCCEspecif = httpContext.GetPar( "TFCCEspecif") ;
      AV53TFCCEspecif_Sel = httpContext.GetPar( "TFCCEspecif_Sel") ;
      AV64TFCCVal = httpContext.GetPar( "TFCCVal") ;
      AV65TFCCVal_Sel = httpContext.GetPar( "TFCCVal_Sel") ;
      AV5CCOkLin = (byte)(GXutil.lval( httpContext.GetPar( "CCOkLin"))) ;
      AV31EmprCod = httpContext.GetPar( "EmprCod") ;
      AV25clicod = (int)(GXutil.lval( httpContext.GetPar( "clicod"))) ;
      AV15Barser = httpContext.GetPar( "Barser") ;
      AV12barcolnom = httpContext.GetPar( "barcolnom") ;
      AV13barcolnum = (int)(GXutil.lval( httpContext.GetPar( "barcolnum"))) ;
      AV71AvisoCC = (short)(GXutil.lval( httpContext.GetPar( "AvisoCC"))) ;
      AV73CCTVal = httpContext.GetPar( "CCTVal") ;
      AV9BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
      AV11BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
      AV10BarCodPar = httpContext.GetPar( "BarCodPar") ;
      AV48ProCod = httpContext.GetPar( "ProCod") ;
      AV14BarOrdLin = (short)(GXutil.lval( httpContext.GetPar( "BarOrdLin"))) ;
      AV19CCTCod = (int)(GXutil.lval( httpContext.GetPar( "CCTCod"))) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgridcontrolcalidad_valoresestandars_ccsta_sdts_refresh( subGridcontrolcalidad_ccsta_sdts_Rows, subGridcontrolcalidad_valoresestandars_ccsta_sdts_Rows, subGrid_Rows, AV96Pgmname, AV45OrderedBy, AV46OrderedDsc, AV58TFCCTLin, AV59TFCCTLin_To, AV62TFCCTLinDsc, AV63TFCCTLinDsc_Sel, AV60TFCCTLinDc2, AV61TFCCTLinDc2_Sel, AV54TFCCMetodo, AV55TFCCMetodo_Sel, AV52TFCCEspecif, AV53TFCCEspecif_Sel, AV64TFCCVal, AV65TFCCVal_Sel, AV5CCOkLin, AV31EmprCod, AV25clicod, AV15Barser, AV12barcolnom, AV13barcolnum, AV71AvisoCC, AV73CCTVal, AV9BarCod, AV11BarCodReo, AV10BarCodPar, AV48ProCod, AV14BarOrdLin, AV19CCTCod) ;
      addString( httpContext.getJSONResponse( )) ;
      /* End function gxgrGridcontrolcalidad_valoresestandars_ccsta_sdts_refresh_invoke */
   }

   public void gxnrgrid_newrow_invoke( )
   {
      nRC_GXsfl_154 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_154"))) ;
      nGXsfl_154_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_154_idx"))) ;
      sGXsfl_154_idx = httpContext.GetPar( "sGXsfl_154_idx") ;
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
      subGridcontrolcalidad_ccsta_sdts_Rows = (int)(GXutil.lval( httpContext.GetPar( "subGridcontrolcalidad_ccsta_sdts_Rows"))) ;
      subGridcontrolcalidad_valoresestandars_ccsta_sdts_Rows = (int)(GXutil.lval( httpContext.GetPar( "subGridcontrolcalidad_valoresestandars_ccsta_sdts_Rows"))) ;
      subGrid_Rows = (int)(GXutil.lval( httpContext.GetPar( "subGrid_Rows"))) ;
      AV31EmprCod = httpContext.GetPar( "EmprCod") ;
      AV9BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
      AV11BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
      AV10BarCodPar = httpContext.GetPar( "BarCodPar") ;
      AV48ProCod = httpContext.GetPar( "ProCod") ;
      AV14BarOrdLin = (short)(GXutil.lval( httpContext.GetPar( "BarOrdLin"))) ;
      AV19CCTCod = (int)(GXutil.lval( httpContext.GetPar( "CCTCod"))) ;
      AV96Pgmname = httpContext.GetPar( "Pgmname") ;
      AV45OrderedBy = (short)(GXutil.lval( httpContext.GetPar( "OrderedBy"))) ;
      AV46OrderedDsc = GXutil.strtobool( httpContext.GetPar( "OrderedDsc")) ;
      AV58TFCCTLin = (short)(GXutil.lval( httpContext.GetPar( "TFCCTLin"))) ;
      AV59TFCCTLin_To = (short)(GXutil.lval( httpContext.GetPar( "TFCCTLin_To"))) ;
      AV62TFCCTLinDsc = httpContext.GetPar( "TFCCTLinDsc") ;
      AV63TFCCTLinDsc_Sel = httpContext.GetPar( "TFCCTLinDsc_Sel") ;
      AV60TFCCTLinDc2 = httpContext.GetPar( "TFCCTLinDc2") ;
      AV61TFCCTLinDc2_Sel = httpContext.GetPar( "TFCCTLinDc2_Sel") ;
      AV54TFCCMetodo = httpContext.GetPar( "TFCCMetodo") ;
      AV55TFCCMetodo_Sel = httpContext.GetPar( "TFCCMetodo_Sel") ;
      AV52TFCCEspecif = httpContext.GetPar( "TFCCEspecif") ;
      AV53TFCCEspecif_Sel = httpContext.GetPar( "TFCCEspecif_Sel") ;
      AV64TFCCVal = httpContext.GetPar( "TFCCVal") ;
      AV65TFCCVal_Sel = httpContext.GetPar( "TFCCVal_Sel") ;
      AV5CCOkLin = (byte)(GXutil.lval( httpContext.GetPar( "CCOkLin"))) ;
      AV25clicod = (int)(GXutil.lval( httpContext.GetPar( "clicod"))) ;
      AV15Barser = httpContext.GetPar( "Barser") ;
      AV12barcolnom = httpContext.GetPar( "barcolnom") ;
      AV13barcolnum = (int)(GXutil.lval( httpContext.GetPar( "barcolnum"))) ;
      AV71AvisoCC = (short)(GXutil.lval( httpContext.GetPar( "AvisoCC"))) ;
      AV73CCTVal = httpContext.GetPar( "CCTVal") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGridcontrolcalidad_ccsta_sdts_Rows, subGridcontrolcalidad_valoresestandars_ccsta_sdts_Rows, subGrid_Rows, AV31EmprCod, AV9BarCod, AV11BarCodReo, AV10BarCodPar, AV48ProCod, AV14BarOrdLin, AV19CCTCod, AV96Pgmname, AV45OrderedBy, AV46OrderedDsc, AV58TFCCTLin, AV59TFCCTLin_To, AV62TFCCTLinDsc, AV63TFCCTLinDsc_Sel, AV60TFCCTLinDc2, AV61TFCCTLinDc2_Sel, AV54TFCCMetodo, AV55TFCCMetodo_Sel, AV52TFCCEspecif, AV53TFCCEspecif_Sel, AV64TFCCVal, AV65TFCCVal_Sel, AV5CCOkLin, AV25clicod, AV15Barser, AV12barcolnom, AV13barcolnum, AV71AvisoCC, AV73CCTVal) ;
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
      pa2CE2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start2CE2( ) ;
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
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
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridTitlesCategories/GridTitlesCategoriesRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      httpContext.writeText( Form.getHeaderrawhtml()) ;
      httpContext.closeHtmlHeader();
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.disableOutput();
      }
      FormProcess = " data-HasEnter=\"true\" data-Skiponenter=\"false\"" ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.controlcalidadhtd.controlcalidad_cc1_wkp", new String[] {GXutil.URLEncode(GXutil.rtrim(AV31EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV9BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV11BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV10BarCodPar)),GXutil.URLEncode(GXutil.rtrim(AV48ProCod)),GXutil.URLEncode(GXutil.rtrim(AV49ProDsc)),GXutil.URLEncode(GXutil.ltrimstr(AV14BarOrdLin,4,0)),GXutil.URLEncode(GXutil.rtrim(AV32FasCod)),GXutil.URLEncode(GXutil.rtrim(AV33FasDsc)),GXutil.URLEncode(GXutil.ltrimstr(AV19CCTCod,6,0)),GXutil.URLEncode(GXutil.rtrim(AV20CCTDsc))}, new String[] {"EmprCod","BarCod","BarCodReo","BarCodPar","ProCod","ProDsc","BarOrdLin","FasCod","FasDsc","CCTCod","CCTDsc"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCLICOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV25clicod), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARSER", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV15Barser, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCOLNOM", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV12barcolnom, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCOLNUM", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV13barcolnum), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vAVISOCC", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV71AvisoCC), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCCTVAL", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV73CCTVal, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV31EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV9BarCod), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODREO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV11BarCodReo), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODPAR", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV10BarCodPar, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPROCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV48ProCod, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARORDLIN", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV14BarOrdLin), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCCTCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV19CCTCod), "ZZZZZ9")));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"ControlCalidad_CC1_WKP");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV96Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("controlcalidadhtd\\controlcalidad_cc1_wkp:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "Controlcalidad_ccsta_sdt", AV26ControlCalidad_CCSTA_SDT);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("Controlcalidad_ccsta_sdt", AV26ControlCalidad_CCSTA_SDT);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "Controlcalidad_valoresestandars_ccsta_sdt", AV28ControlCalidad_ValoresEstandars_CCsta_SDT);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("Controlcalidad_valoresestandars_ccsta_sdt", AV28ControlCalidad_ValoresEstandars_CCsta_SDT);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_131", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_131, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_141", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_141, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_154", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_154, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV36GridCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV37GridPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vDDO_TITLESETTINGSICONS", AV30DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vDDO_TITLESETTINGSICONS", AV30DDO_TitleSettingsIcons);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vORDEREDBY", GXutil.ltrim( localUtil.ntoc( AV45OrderedBy, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, "vORDEREDDSC", AV46OrderedDsc);
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCCTLIN", GXutil.ltrim( localUtil.ntoc( AV58TFCCTLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCCTLIN_TO", GXutil.ltrim( localUtil.ntoc( AV59TFCCTLin_To, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCCTLINDSC", GXutil.rtrim( AV62TFCCTLinDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCCTLINDSC_SEL", GXutil.rtrim( AV63TFCCTLinDsc_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCCTLINDC2", GXutil.rtrim( AV60TFCCTLinDc2));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCCTLINDC2_SEL", GXutil.rtrim( AV61TFCCTLinDc2_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCCMETODO", GXutil.rtrim( AV54TFCCMetodo));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCCMETODO_SEL", GXutil.rtrim( AV55TFCCMetodo_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCCESPECIF", GXutil.rtrim( AV52TFCCEspecif));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCCESPECIF_SEL", GXutil.rtrim( AV53TFCCEspecif_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCCVAL", GXutil.rtrim( AV64TFCCVal));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCCVAL_SEL", GXutil.rtrim( AV65TFCCVal_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV31EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV31EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vCLICOD", GXutil.ltrim( localUtil.ntoc( AV25clicod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCLICOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV25clicod), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARSER", GXutil.rtrim( AV15Barser));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARSER", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV15Barser, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCOLNOM", GXutil.rtrim( AV12barcolnom));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCOLNOM", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV12barcolnom, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCOLNUM", GXutil.ltrim( localUtil.ntoc( AV13barcolnum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCOLNUM", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV13barcolnum), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "CCTCOD", GXutil.ltrim( localUtil.ntoc( A4031CCTCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CCTVALLIN", GXutil.ltrim( localUtil.ntoc( A4049CCTValLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CCTVAL", GXutil.rtrim( A4051CCTVal));
      app.GxWebStd.gx_hidden_field( httpContext, "CCTVALDSC", GXutil.rtrim( A4050CCTValDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "vAVISOCC", GXutil.ltrim( localUtil.ntoc( AV71AvisoCC, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vAVISOCC", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV71AvisoCC), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMASK", AV43Mask);
      app.GxWebStd.gx_hidden_field( httpContext, "vCCTVAL", GXutil.rtrim( AV73CCTVal));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCCTVAL", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV73CCTVal, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMENSAJE", AV44mensaje);
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vCONTROLCALIDAD_CCSTA_SDT", AV26ControlCalidad_CCSTA_SDT);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vCONTROLCALIDAD_CCSTA_SDT", AV26ControlCalidad_CCSTA_SDT);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vCONTROLCALIDAD_VALORESESTANDARS_CCSTA_SDT", AV28ControlCalidad_ValoresEstandars_CCsta_SDT);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vCONTROLCALIDAD_VALORESESTANDARS_CCSTA_SDT", AV28ControlCalidad_ValoresEstandars_CCsta_SDT);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDCONTROLCALIDAD_CCSTA_SDTS_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRIDCONTROLCALIDAD_CCSTA_SDTS_nFirstRecordOnPage, (byte)(15), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDCONTROLCALIDAD_VALORESESTANDARS_CCSTA_SDTS_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRIDCONTROLCALIDAD_VALORESESTANDARS_CCSTA_SDTS_nFirstRecordOnPage, (byte)(15), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDCONTROLCALIDAD_CCSTA_SDTS_nEOF", GXutil.ltrim( localUtil.ntoc( GRIDCONTROLCALIDAD_CCSTA_SDTS_nEOF, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDCONTROLCALIDAD_VALORESESTANDARS_CCSTA_SDTS_nEOF", GXutil.ltrim( localUtil.ntoc( GRIDCONTROLCALIDAD_VALORESESTANDARS_CCSTA_SDTS_nEOF, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDCONTROLCALIDAD_CCSTA_SDTS_Rows", GXutil.ltrim( localUtil.ntoc( subGridcontrolcalidad_ccsta_sdts_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDCONTROLCALIDAD_VALORESESTANDARS_CCSTA_SDTS_Rows", GXutil.ltrim( localUtil.ntoc( subGridcontrolcalidad_valoresestandars_ccsta_sdts_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
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
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE6_Width", GXutil.rtrim( Dvpanel_unnamedtable6_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE6_Autowidth", GXutil.booltostr( Dvpanel_unnamedtable6_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE6_Autoheight", GXutil.booltostr( Dvpanel_unnamedtable6_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE6_Cls", GXutil.rtrim( Dvpanel_unnamedtable6_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE6_Title", GXutil.rtrim( Dvpanel_unnamedtable6_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE6_Collapsible", GXutil.booltostr( Dvpanel_unnamedtable6_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE6_Collapsed", GXutil.booltostr( Dvpanel_unnamedtable6_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE6_Showcollapseicon", GXutil.booltostr( Dvpanel_unnamedtable6_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE6_Iconposition", GXutil.rtrim( Dvpanel_unnamedtable6_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE6_Autoscroll", GXutil.booltostr( Dvpanel_unnamedtable6_Autoscroll));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELVALORESTANDAR_Width", GXutil.rtrim( Dvpanel_panelvalorestandar_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELVALORESTANDAR_Autowidth", GXutil.booltostr( Dvpanel_panelvalorestandar_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELVALORESTANDAR_Autoheight", GXutil.booltostr( Dvpanel_panelvalorestandar_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELVALORESTANDAR_Cls", GXutil.rtrim( Dvpanel_panelvalorestandar_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELVALORESTANDAR_Title", GXutil.rtrim( Dvpanel_panelvalorestandar_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELVALORESTANDAR_Collapsible", GXutil.booltostr( Dvpanel_panelvalorestandar_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELVALORESTANDAR_Collapsed", GXutil.booltostr( Dvpanel_panelvalorestandar_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELVALORESTANDAR_Showcollapseicon", GXutil.booltostr( Dvpanel_panelvalorestandar_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELVALORESTANDAR_Iconposition", GXutil.rtrim( Dvpanel_panelvalorestandar_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELVALORESTANDAR_Autoscroll", GXutil.booltostr( Dvpanel_panelvalorestandar_Autoscroll));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE5_Width", GXutil.rtrim( Dvpanel_unnamedtable5_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE5_Autowidth", GXutil.booltostr( Dvpanel_unnamedtable5_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE5_Autoheight", GXutil.booltostr( Dvpanel_unnamedtable5_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE5_Cls", GXutil.rtrim( Dvpanel_unnamedtable5_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE5_Title", GXutil.rtrim( Dvpanel_unnamedtable5_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE5_Collapsible", GXutil.booltostr( Dvpanel_unnamedtable5_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE5_Collapsed", GXutil.booltostr( Dvpanel_unnamedtable5_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE5_Showcollapseicon", GXutil.booltostr( Dvpanel_unnamedtable5_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE5_Iconposition", GXutil.rtrim( Dvpanel_unnamedtable5_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE5_Autoscroll", GXutil.booltostr( Dvpanel_unnamedtable5_Autoscroll));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE1_Width", GXutil.rtrim( Dvpanel_unnamedtable1_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE1_Autowidth", GXutil.booltostr( Dvpanel_unnamedtable1_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE1_Autoheight", GXutil.booltostr( Dvpanel_unnamedtable1_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE1_Cls", GXutil.rtrim( Dvpanel_unnamedtable1_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE1_Title", GXutil.rtrim( Dvpanel_unnamedtable1_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE1_Collapsible", GXutil.booltostr( Dvpanel_unnamedtable1_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE1_Collapsed", GXutil.booltostr( Dvpanel_unnamedtable1_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE1_Showcollapseicon", GXutil.booltostr( Dvpanel_unnamedtable1_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE1_Iconposition", GXutil.rtrim( Dvpanel_unnamedtable1_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE1_Autoscroll", GXutil.booltostr( Dvpanel_unnamedtable1_Autoscroll));
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
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Sortedstatus", GXutil.rtrim( Ddo_grid_Sortedstatus));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Includefilter", GXutil.rtrim( Ddo_grid_Includefilter));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filtertype", GXutil.rtrim( Ddo_grid_Filtertype));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filterisrange", GXutil.rtrim( Ddo_grid_Filterisrange));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Includedatalist", GXutil.rtrim( Ddo_grid_Includedatalist));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Datalisttype", GXutil.rtrim( Ddo_grid_Datalisttype));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Datalistproc", GXutil.rtrim( Ddo_grid_Datalistproc));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Gridinternalname", GXutil.rtrim( Grid_empowerer_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Hastitlesettings", GXutil.booltostr( Grid_empowerer_Hastitlesettings));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDCONTROLCALIDAD_VALORESESTANDARS_CCSTA_SDTS_TITLESCATEGORIES_Gridinternalname", GXutil.rtrim( Gridcontrolcalidad_valoresestandars_ccsta_sdts_titlescategories_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDCONTROLCALIDAD_VALORESESTANDARS_CCSTA_SDTS_TITLESCATEGORIES_Gridtitlescategories", GXutil.rtrim( Gridcontrolcalidad_valoresestandars_ccsta_sdts_titlescategories_Gridtitlescategories));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDCONTROLCALIDAD_VALORESESTANDARS_CCSTA_SDTS_EMPOWERER_Gridinternalname", GXutil.rtrim( Gridcontrolcalidad_valoresestandars_ccsta_sdts_empowerer_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDCONTROLCALIDAD_VALORESESTANDARS_CCSTA_SDTS_EMPOWERER_Hascategories", GXutil.booltostr( Gridcontrolcalidad_valoresestandars_ccsta_sdts_empowerer_Hascategories));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDCONTROLCALIDAD_CCSTA_SDTS_EMPOWERER_Gridinternalname", GXutil.rtrim( Gridcontrolcalidad_ccsta_sdts_empowerer_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Activeeventkey", GXutil.rtrim( Ddo_grid_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedvalue_get", GXutil.rtrim( Ddo_grid_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtextto_get", GXutil.rtrim( Ddo_grid_Filteredtextto_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtext_get", GXutil.rtrim( Ddo_grid_Filteredtext_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedcolumn", GXutil.rtrim( Ddo_grid_Selectedcolumn));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Activeeventkey", GXutil.rtrim( Ddo_grid_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedvalue_get", GXutil.rtrim( Ddo_grid_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtextto_get", GXutil.rtrim( Ddo_grid_Filteredtextto_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtext_get", GXutil.rtrim( Ddo_grid_Filteredtext_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedcolumn", GXutil.rtrim( Ddo_grid_Selectedcolumn));
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
         we2CE2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt2CE2( ) ;
   }

   public boolean hasEnterEvent( )
   {
      return true ;
   }

   public com.genexus.webpanels.GXWebForm getForm( )
   {
      return Form ;
   }

   public String getSelfLink( )
   {
      return formatLink("app.controlcalidadhtd.controlcalidad_cc1_wkp", new String[] {GXutil.URLEncode(GXutil.rtrim(AV31EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV9BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV11BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV10BarCodPar)),GXutil.URLEncode(GXutil.rtrim(AV48ProCod)),GXutil.URLEncode(GXutil.rtrim(AV49ProDsc)),GXutil.URLEncode(GXutil.ltrimstr(AV14BarOrdLin,4,0)),GXutil.URLEncode(GXutil.rtrim(AV32FasCod)),GXutil.URLEncode(GXutil.rtrim(AV33FasDsc)),GXutil.URLEncode(GXutil.ltrimstr(AV19CCTCod,6,0)),GXutil.URLEncode(GXutil.rtrim(AV20CCTDsc))}, new String[] {"EmprCod","BarCod","BarCodReo","BarCodPar","ProCod","ProDsc","BarOrdLin","FasCod","FasDsc","CCTCod","CCTDsc"})  ;
   }

   public String getPgmname( )
   {
      return "ControlCalidadHTD.ControlCalidad_CC1_WKP" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( " Datos Lineas (CC1)", "") ;
   }

   public void wb2CE0( )
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
         app.GxWebStd.gx_div_start( httpContext, divTableheader_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable7_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarcod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarcod_Internalname, httpContext.getMessage( "Nº Hdr", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcod_Internalname, GXutil.ltrim( localUtil.ntoc( AV9BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarcod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV9BarCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV9BarCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ControlCalidadHTD\\ControlCalidad_CC1_WKP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarcodreo_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarcodreo_Internalname, httpContext.getMessage( "R", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcodreo_Internalname, GXutil.ltrim( localUtil.ntoc( AV11BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarcodreo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV11BarCodReo), "9") : localUtil.format( DecimalUtil.doubleToDec(AV11BarCodReo), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcodreo_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcodreo_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ControlCalidadHTD\\ControlCalidad_CC1_WKP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarcodpar_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarcodpar_Internalname, httpContext.getMessage( "P", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcodpar_Internalname, GXutil.rtrim( AV10BarCodPar), GXutil.rtrim( localUtil.format( AV10BarCodPar, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcodpar_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcodpar_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ControlCalidadHTD\\ControlCalidad_CC1_WKP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavCctcod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavCctcod_Internalname, httpContext.getMessage( "Código", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavCctcod_Internalname, GXutil.ltrim( localUtil.ntoc( AV19CCTCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavCctcod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV19CCTCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV19CCTCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCctcod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavCctcod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ControlCalidadHTD\\ControlCalidad_CC1_WKP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-5", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavCctdsc_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavCctdsc_Internalname, httpContext.getMessage( "Descripción", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavCctdsc_Internalname, GXutil.rtrim( AV20CCTDsc), GXutil.rtrim( localUtil.format( AV20CCTDsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCctdsc_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavCctdsc_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ControlCalidadHTD\\ControlCalidad_CC1_WKP.htm");
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable8_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavProcod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavProcod_Internalname, httpContext.getMessage( "Proceso", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavProcod_Internalname, GXutil.rtrim( AV48ProCod), GXutil.rtrim( localUtil.format( AV48ProCod, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavProcod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavProcod_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ControlCalidadHTD\\ControlCalidad_CC1_WKP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavProdsc_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavProdsc_Internalname, httpContext.getMessage( "Descripcion", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavProdsc_Internalname, GXutil.rtrim( AV49ProDsc), GXutil.rtrim( localUtil.format( AV49ProDsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavProdsc_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavProdsc_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ControlCalidadHTD\\ControlCalidad_CC1_WKP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarordlin_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarordlin_Internalname, httpContext.getMessage( "Orden", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarordlin_Internalname, GXutil.ltrim( localUtil.ntoc( AV14BarOrdLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarordlin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV14BarOrdLin), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV14BarOrdLin), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarordlin_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarordlin_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ControlCalidadHTD\\ControlCalidad_CC1_WKP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavFascod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavFascod_Internalname, httpContext.getMessage( "Fase", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFascod_Internalname, GXutil.rtrim( AV32FasCod), GXutil.rtrim( localUtil.format( AV32FasCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavFascod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavFascod_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ControlCalidadHTD\\ControlCalidad_CC1_WKP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavFasdsc_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavFasdsc_Internalname, httpContext.getMessage( "Descripcion", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFasdsc_Internalname, GXutil.rtrim( AV33FasDsc), GXutil.rtrim( localUtil.format( AV33FasDsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavFasdsc_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavFasdsc_Enabled, 0, "text", "", 28, "chr", 1, "row", 28, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ControlCalidadHTD\\ControlCalidad_CC1_WKP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         ClassString = "ErrorViewer" ;
         StyleString = "" ;
         app.GxWebStd.gx_msg_list( httpContext, "", httpContext.GX_msglist.getDisplaymode(), StyleString, ClassString, "", "false");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
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
         ucDvpanel_unnamedtable1.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_unnamedtable1_Internalname, "DVPANEL_UNNAMEDTABLE1Container");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_UNNAMEDTABLE1Container"+"UnnamedTable1"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable1_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable2_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavCctlin_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavCctlin_Internalname, httpContext.getMessage( "# Lín", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 75,'',false,'" + sGXsfl_131_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavCctlin_Internalname, GXutil.ltrim( localUtil.ntoc( AV21CCTLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavCctlin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV21CCTLin), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV21CCTLin), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,75);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCctlin_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavCctlin_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ControlCalidadHTD\\ControlCalidad_CC1_WKP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavCctlindsc_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavCctlindsc_Internalname, httpContext.getMessage( "Descripción", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 79,'',false,'" + sGXsfl_131_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavCctlindsc_Internalname, GXutil.rtrim( AV23CCTLinDsc), GXutil.rtrim( localUtil.format( AV23CCTLinDsc, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,79);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCctlindsc_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavCctlindsc_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ControlCalidadHTD\\ControlCalidad_CC1_WKP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-5", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavCctlindc2_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavCctlindc2_Internalname, httpContext.getMessage( "Descripcion (cont)", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 83,'',false,'" + sGXsfl_131_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavCctlindc2_Internalname, GXutil.rtrim( AV22CCTLinDc2), GXutil.rtrim( localUtil.format( AV22CCTLinDc2, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,83);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCctlindc2_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavCctlindc2_Enabled, 0, "text", "", 60, "chr", 1, "row", 60, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ControlCalidadHTD\\ControlCalidad_CC1_WKP.htm");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable3_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavCcmetodo_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavCcmetodo_Internalname, httpContext.getMessage( "Metodo", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 91,'',false,'" + sGXsfl_131_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavCcmetodo_Internalname, GXutil.rtrim( AV18CCMetodo), GXutil.rtrim( localUtil.format( AV18CCMetodo, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,91);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCcmetodo_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavCcmetodo_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ControlCalidadHTD\\ControlCalidad_CC1_WKP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavCcespecif_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavCcespecif_Internalname, httpContext.getMessage( "Especificacion", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 95,'',false,'" + sGXsfl_131_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavCcespecif_Internalname, GXutil.rtrim( AV17CCEspecif), GXutil.rtrim( localUtil.format( AV17CCEspecif, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,95);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCcespecif_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavCcespecif_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ControlCalidadHTD\\ControlCalidad_CC1_WKP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavCcval_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavCcval_Internalname, httpContext.getMessage( "Valor", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 99,'',false,'" + sGXsfl_131_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavCcval_Internalname, GXutil.rtrim( AV24CCVal), GXutil.rtrim( localUtil.format( AV24CCVal, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,99);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCcval_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavCcval_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ControlCalidadHTD\\ControlCalidad_CC1_WKP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "Center", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+chkavCcoklin.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, chkavCcoklin.getInternalname(), httpContext.getMessage( "Ok?", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Check box */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 103,'',false,'" + sGXsfl_131_idx + "',0)\"" ;
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         app.GxWebStd.gx_checkbox_ctrl( httpContext, chkavCcoklin.getInternalname(), GXutil.str( AV5CCOkLin, 1, 0), "", httpContext.getMessage( "Ok?", ""), 1, chkavCcoklin.getEnabled(), "1", "", StyleString, ClassString, "", "", TempTags+" onclick="+"\"gx.fn.checkboxClick(103, this, 1, 0,"+"''"+");"+"gx.evt.onchange(this, event);\""+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,103);\"");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "Center", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTxtmensaje_Internalname, lblTxtmensaje_Caption, "", "", lblTxtmensaje_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextDanger", 0, "", 1, 1, 0, (short)(0), "HLP_ControlCalidadHTD\\ControlCalidad_CC1_WKP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "Center", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable4_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group ActionGroup", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 114,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnenter_Internalname, "gx.evt.setGridEvt("+GXutil.str( 131, 3, 0)+","+"null"+");", httpContext.getMessage( "Confirmar", ""), bttBtnenter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ControlCalidadHTD\\ControlCalidad_CC1_WKP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 116,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnlimpiarvariables_Internalname, "gx.evt.setGridEvt("+GXutil.str( 131, 3, 0)+","+"null"+");", httpContext.getMessage( "Limpiar Variables", ""), bttBtnlimpiarvariables_Jsonclick, 5, httpContext.getMessage( "Limpiar Variables", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOLIMPIARVARIABLES\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ControlCalidadHTD\\ControlCalidad_CC1_WKP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 118,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtncerrar_Internalname, "gx.evt.setGridEvt("+GXutil.str( 131, 3, 0)+","+"null"+");", httpContext.getMessage( "Cerrar", ""), bttBtncerrar_Jsonclick, 5, httpContext.getMessage( "Cerrar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOCERRAR\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ControlCalidadHTD\\ControlCalidad_CC1_WKP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "Center", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
         /* User Defined Control */
         ucDvpanel_unnamedtable5.setProperty("Width", Dvpanel_unnamedtable5_Width);
         ucDvpanel_unnamedtable5.setProperty("AutoWidth", Dvpanel_unnamedtable5_Autowidth);
         ucDvpanel_unnamedtable5.setProperty("AutoHeight", Dvpanel_unnamedtable5_Autoheight);
         ucDvpanel_unnamedtable5.setProperty("Cls", Dvpanel_unnamedtable5_Cls);
         ucDvpanel_unnamedtable5.setProperty("Title", Dvpanel_unnamedtable5_Title);
         ucDvpanel_unnamedtable5.setProperty("Collapsible", Dvpanel_unnamedtable5_Collapsible);
         ucDvpanel_unnamedtable5.setProperty("Collapsed", Dvpanel_unnamedtable5_Collapsed);
         ucDvpanel_unnamedtable5.setProperty("ShowCollapseIcon", Dvpanel_unnamedtable5_Showcollapseicon);
         ucDvpanel_unnamedtable5.setProperty("IconPosition", Dvpanel_unnamedtable5_Iconposition);
         ucDvpanel_unnamedtable5.setProperty("AutoScroll", Dvpanel_unnamedtable5_Autoscroll);
         ucDvpanel_unnamedtable5.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_unnamedtable5_Internalname, "DVPANEL_UNNAMEDTABLE5Container");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_UNNAMEDTABLE5Container"+"UnnamedTable5"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable5_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* User Defined Control */
         ucDvpanel_unnamedtable6.setProperty("Width", Dvpanel_unnamedtable6_Width);
         ucDvpanel_unnamedtable6.setProperty("AutoWidth", Dvpanel_unnamedtable6_Autowidth);
         ucDvpanel_unnamedtable6.setProperty("AutoHeight", Dvpanel_unnamedtable6_Autoheight);
         ucDvpanel_unnamedtable6.setProperty("Cls", Dvpanel_unnamedtable6_Cls);
         ucDvpanel_unnamedtable6.setProperty("Title", Dvpanel_unnamedtable6_Title);
         ucDvpanel_unnamedtable6.setProperty("Collapsible", Dvpanel_unnamedtable6_Collapsible);
         ucDvpanel_unnamedtable6.setProperty("Collapsed", Dvpanel_unnamedtable6_Collapsed);
         ucDvpanel_unnamedtable6.setProperty("ShowCollapseIcon", Dvpanel_unnamedtable6_Showcollapseicon);
         ucDvpanel_unnamedtable6.setProperty("IconPosition", Dvpanel_unnamedtable6_Iconposition);
         ucDvpanel_unnamedtable6.setProperty("AutoScroll", Dvpanel_unnamedtable6_Autoscroll);
         ucDvpanel_unnamedtable6.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_unnamedtable6_Internalname, "DVPANEL_UNNAMEDTABLE6Container");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_UNNAMEDTABLE6Container"+"UnnamedTable6"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable6_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 HasGridEmpowerer", "left", "top", "", "", "div");
         /*  Grid Control  */
         Gridcontrolcalidad_ccsta_sdtsContainer.SetWrapped(nGXWrapped);
         startgridcontrol131( ) ;
      }
      if ( wbEnd == 131 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_131 = (int)(nGXsfl_131_idx-1) ;
         if ( Gridcontrolcalidad_ccsta_sdtsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "</table>") ;
            httpContext.writeText( "</div>") ;
         }
         else
         {
            Gridcontrolcalidad_ccsta_sdtsContainer.AddObjectProperty("GRIDCONTROLCALIDAD_CCSTA_SDTS_nEOF", GRIDCONTROLCALIDAD_CCSTA_SDTS_nEOF);
            Gridcontrolcalidad_ccsta_sdtsContainer.AddObjectProperty("GRIDCONTROLCALIDAD_CCSTA_SDTS_nFirstRecordOnPage", GRIDCONTROLCALIDAD_CCSTA_SDTS_nFirstRecordOnPage);
            AV84GXV1 = nGXsfl_131_idx ;
            sStyleString = "" ;
            httpContext.writeText( "<div id=\""+"Gridcontrolcalidad_ccsta_sdtsContainer"+"Div\" "+sStyleString+">"+"</div>") ;
            httpContext.ajax_rsp_assign_grid("_"+"Gridcontrolcalidad_ccsta_sdts", Gridcontrolcalidad_ccsta_sdtsContainer, subGridcontrolcalidad_ccsta_sdts_Internalname);
            if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
            {
               app.GxWebStd.gx_hidden_field( httpContext, "Gridcontrolcalidad_ccsta_sdtsContainerData", Gridcontrolcalidad_ccsta_sdtsContainer.ToJavascriptSource());
            }
            if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
            {
               app.GxWebStd.gx_hidden_field( httpContext, "Gridcontrolcalidad_ccsta_sdtsContainerData"+"V", Gridcontrolcalidad_ccsta_sdtsContainer.GridValuesHidden());
            }
            else
            {
               httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"Gridcontrolcalidad_ccsta_sdtsContainerData"+"V"+"\" value='"+Gridcontrolcalidad_ccsta_sdtsContainer.GridValuesHidden()+"'/>") ;
            }
         }
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* User Defined Control */
         ucDvpanel_panelvalorestandar.setProperty("Width", Dvpanel_panelvalorestandar_Width);
         ucDvpanel_panelvalorestandar.setProperty("AutoWidth", Dvpanel_panelvalorestandar_Autowidth);
         ucDvpanel_panelvalorestandar.setProperty("AutoHeight", Dvpanel_panelvalorestandar_Autoheight);
         ucDvpanel_panelvalorestandar.setProperty("Cls", Dvpanel_panelvalorestandar_Cls);
         ucDvpanel_panelvalorestandar.setProperty("Title", Dvpanel_panelvalorestandar_Title);
         ucDvpanel_panelvalorestandar.setProperty("Collapsible", Dvpanel_panelvalorestandar_Collapsible);
         ucDvpanel_panelvalorestandar.setProperty("Collapsed", Dvpanel_panelvalorestandar_Collapsed);
         ucDvpanel_panelvalorestandar.setProperty("ShowCollapseIcon", Dvpanel_panelvalorestandar_Showcollapseicon);
         ucDvpanel_panelvalorestandar.setProperty("IconPosition", Dvpanel_panelvalorestandar_Iconposition);
         ucDvpanel_panelvalorestandar.setProperty("AutoScroll", Dvpanel_panelvalorestandar_Autoscroll);
         ucDvpanel_panelvalorestandar.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_panelvalorestandar_Internalname, "DVPANEL_PANELVALORESTANDARContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_PANELVALORESTANDARContainer"+"PanelValorEstandar"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divPanelvalorestandar_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 HasGridEmpowerer", "left", "top", "", "", "div");
         /*  Grid Control  */
         Gridcontrolcalidad_valoresestandars_ccsta_sdtsContainer.SetWrapped(nGXWrapped);
         startgridcontrol141( ) ;
      }
      if ( wbEnd == 141 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_141 = (int)(nGXsfl_141_idx-1) ;
         if ( Gridcontrolcalidad_valoresestandars_ccsta_sdtsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "</table>") ;
            httpContext.writeText( "</div>") ;
         }
         else
         {
            Gridcontrolcalidad_valoresestandars_ccsta_sdtsContainer.AddObjectProperty("GRIDCONTROLCALIDAD_VALORESESTANDARS_CCSTA_SDTS_nEOF", GRIDCONTROLCALIDAD_VALORESESTANDARS_CCSTA_SDTS_nEOF);
            Gridcontrolcalidad_valoresestandars_ccsta_sdtsContainer.AddObjectProperty("GRIDCONTROLCALIDAD_VALORESESTANDARS_CCSTA_SDTS_nFirstRecordOnPage", GRIDCONTROLCALIDAD_VALORESESTANDARS_CCSTA_SDTS_nFirstRecordOnPage);
            AV88GXV5 = nGXsfl_141_idx ;
            sStyleString = "" ;
            httpContext.writeText( "<div id=\""+"Gridcontrolcalidad_valoresestandars_ccsta_sdtsContainer"+"Div\" "+sStyleString+">"+"</div>") ;
            httpContext.ajax_rsp_assign_grid("_"+"Gridcontrolcalidad_valoresestandars_ccsta_sdts", Gridcontrolcalidad_valoresestandars_ccsta_sdtsContainer, subGridcontrolcalidad_valoresestandars_ccsta_sdts_Internalname);
            if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
            {
               app.GxWebStd.gx_hidden_field( httpContext, "Gridcontrolcalidad_valoresestandars_ccsta_sdtsContainerData", Gridcontrolcalidad_valoresestandars_ccsta_sdtsContainer.ToJavascriptSource());
            }
            if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
            {
               app.GxWebStd.gx_hidden_field( httpContext, "Gridcontrolcalidad_valoresestandars_ccsta_sdtsContainerData"+"V", Gridcontrolcalidad_valoresestandars_ccsta_sdtsContainer.GridValuesHidden());
            }
            else
            {
               httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"Gridcontrolcalidad_valoresestandars_ccsta_sdtsContainerData"+"V"+"\" value='"+Gridcontrolcalidad_valoresestandars_ccsta_sdtsContainer.GridValuesHidden()+"'/>") ;
            }
         }
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</div>") ;
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
         startgridcontrol154( ) ;
      }
      if ( wbEnd == 154 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_154 = (int)(nGXsfl_154_idx-1) ;
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
         ucGridpaginationbar.setProperty("CurrentPage", AV36GridCurrentPage);
         ucGridpaginationbar.setProperty("PageCount", AV37GridPageCount);
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV96Pgmname), GXutil.rtrim( localUtil.format( AV96Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ControlCalidadHTD\\ControlCalidad_CC1_WKP.htm");
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
         ucDdo_grid.setProperty("IncludeFilter", Ddo_grid_Includefilter);
         ucDdo_grid.setProperty("FilterType", Ddo_grid_Filtertype);
         ucDdo_grid.setProperty("FilterIsRange", Ddo_grid_Filterisrange);
         ucDdo_grid.setProperty("IncludeDataList", Ddo_grid_Includedatalist);
         ucDdo_grid.setProperty("DataListType", Ddo_grid_Datalisttype);
         ucDdo_grid.setProperty("DataListProc", Ddo_grid_Datalistproc);
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV30DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, "DDO_GRIDContainer");
         /* User Defined Control */
         ucGrid_empowerer.setProperty("HasTitleSettings", Grid_empowerer_Hastitlesettings);
         ucGrid_empowerer.render(context, "wwp.gridempowerer", Grid_empowerer_Internalname, "GRID_EMPOWERERContainer");
         /* User Defined Control */
         ucGridcontrolcalidad_valoresestandars_ccsta_sdts_titlescategories.setProperty("GridTitlesCategories", Gridcontrolcalidad_valoresestandars_ccsta_sdts_titlescategories_Gridtitlescategories);
         ucGridcontrolcalidad_valoresestandars_ccsta_sdts_titlescategories.render(context, "dvelop.gridtitlescategories", Gridcontrolcalidad_valoresestandars_ccsta_sdts_titlescategories_Internalname, "GRIDCONTROLCALIDAD_VALORESESTANDARS_CCSTA_SDTS_TITLESCATEGORIESContainer");
         /* User Defined Control */
         ucGridcontrolcalidad_valoresestandars_ccsta_sdts_empowerer.setProperty("HasCategories", Gridcontrolcalidad_valoresestandars_ccsta_sdts_empowerer_Hascategories);
         ucGridcontrolcalidad_valoresestandars_ccsta_sdts_empowerer.render(context, "wwp.gridempowerer", Gridcontrolcalidad_valoresestandars_ccsta_sdts_empowerer_Internalname, "GRIDCONTROLCALIDAD_VALORESESTANDARS_CCSTA_SDTS_EMPOWERERContainer");
         /* User Defined Control */
         ucGridcontrolcalidad_ccsta_sdts_empowerer.render(context, "wwp.gridempowerer", Gridcontrolcalidad_ccsta_sdts_empowerer_Internalname, "GRIDCONTROLCALIDAD_CCSTA_SDTS_EMPOWERERContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      if ( wbEnd == 131 )
      {
         wbEnd = (short)(0) ;
         if ( isFullAjaxMode( ) )
         {
            if ( Gridcontrolcalidad_ccsta_sdtsContainer.GetWrapped() == 1 )
            {
               httpContext.writeText( "</table>") ;
               httpContext.writeText( "</div>") ;
            }
            else
            {
               Gridcontrolcalidad_ccsta_sdtsContainer.AddObjectProperty("GRIDCONTROLCALIDAD_CCSTA_SDTS_nEOF", GRIDCONTROLCALIDAD_CCSTA_SDTS_nEOF);
               Gridcontrolcalidad_ccsta_sdtsContainer.AddObjectProperty("GRIDCONTROLCALIDAD_CCSTA_SDTS_nFirstRecordOnPage", GRIDCONTROLCALIDAD_CCSTA_SDTS_nFirstRecordOnPage);
               AV84GXV1 = nGXsfl_131_idx ;
               sStyleString = "" ;
               httpContext.writeText( "<div id=\""+"Gridcontrolcalidad_ccsta_sdtsContainer"+"Div\" "+sStyleString+">"+"</div>") ;
               httpContext.ajax_rsp_assign_grid("_"+"Gridcontrolcalidad_ccsta_sdts", Gridcontrolcalidad_ccsta_sdtsContainer, subGridcontrolcalidad_ccsta_sdts_Internalname);
               if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
               {
                  app.GxWebStd.gx_hidden_field( httpContext, "Gridcontrolcalidad_ccsta_sdtsContainerData", Gridcontrolcalidad_ccsta_sdtsContainer.ToJavascriptSource());
               }
               if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
               {
                  app.GxWebStd.gx_hidden_field( httpContext, "Gridcontrolcalidad_ccsta_sdtsContainerData"+"V", Gridcontrolcalidad_ccsta_sdtsContainer.GridValuesHidden());
               }
               else
               {
                  httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"Gridcontrolcalidad_ccsta_sdtsContainerData"+"V"+"\" value='"+Gridcontrolcalidad_ccsta_sdtsContainer.GridValuesHidden()+"'/>") ;
               }
            }
         }
      }
      if ( wbEnd == 141 )
      {
         wbEnd = (short)(0) ;
         if ( isFullAjaxMode( ) )
         {
            if ( Gridcontrolcalidad_valoresestandars_ccsta_sdtsContainer.GetWrapped() == 1 )
            {
               httpContext.writeText( "</table>") ;
               httpContext.writeText( "</div>") ;
            }
            else
            {
               Gridcontrolcalidad_valoresestandars_ccsta_sdtsContainer.AddObjectProperty("GRIDCONTROLCALIDAD_VALORESESTANDARS_CCSTA_SDTS_nEOF", GRIDCONTROLCALIDAD_VALORESESTANDARS_CCSTA_SDTS_nEOF);
               Gridcontrolcalidad_valoresestandars_ccsta_sdtsContainer.AddObjectProperty("GRIDCONTROLCALIDAD_VALORESESTANDARS_CCSTA_SDTS_nFirstRecordOnPage", GRIDCONTROLCALIDAD_VALORESESTANDARS_CCSTA_SDTS_nFirstRecordOnPage);
               AV88GXV5 = nGXsfl_141_idx ;
               sStyleString = "" ;
               httpContext.writeText( "<div id=\""+"Gridcontrolcalidad_valoresestandars_ccsta_sdtsContainer"+"Div\" "+sStyleString+">"+"</div>") ;
               httpContext.ajax_rsp_assign_grid("_"+"Gridcontrolcalidad_valoresestandars_ccsta_sdts", Gridcontrolcalidad_valoresestandars_ccsta_sdtsContainer, subGridcontrolcalidad_valoresestandars_ccsta_sdts_Internalname);
               if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
               {
                  app.GxWebStd.gx_hidden_field( httpContext, "Gridcontrolcalidad_valoresestandars_ccsta_sdtsContainerData", Gridcontrolcalidad_valoresestandars_ccsta_sdtsContainer.ToJavascriptSource());
               }
               if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
               {
                  app.GxWebStd.gx_hidden_field( httpContext, "Gridcontrolcalidad_valoresestandars_ccsta_sdtsContainerData"+"V", Gridcontrolcalidad_valoresestandars_ccsta_sdtsContainer.GridValuesHidden());
               }
               else
               {
                  httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"Gridcontrolcalidad_valoresestandars_ccsta_sdtsContainerData"+"V"+"\" value='"+Gridcontrolcalidad_valoresestandars_ccsta_sdtsContainer.GridValuesHidden()+"'/>") ;
               }
            }
         }
      }
      if ( wbEnd == 154 )
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

   public void start2CE2( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( " Datos Lineas (CC1)", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup2CE0( ) ;
   }

   public void ws2CE2( )
   {
      start2CE2( ) ;
      evt2CE2( ) ;
   }

   public void evt2CE2( )
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
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e112CE2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e122CE2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRID.ONOPTIONCLICKED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e132CE2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOLIMPIARVARIABLES'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoLimpiarVariables' */
                           e142CE2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOCERRAR'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoCerrar' */
                           e152CE2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VCCVAL.ISVALID") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e162CE2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           if ( ! wbErr )
                           {
                              Rfr0gs = false ;
                              if ( ! Rfr0gs )
                              {
                                 /* Execute user event: Enter */
                                 e172CE2 ();
                              }
                              dynload_actions( ) ;
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDCONTROLCALIDAD_CCSTA_SDTSPAGING") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           sEvt = httpContext.cgiGet( "GRIDCONTROLCALIDAD_CCSTA_SDTSPAGING") ;
                           if ( GXutil.strcmp(sEvt, "FIRST") == 0 )
                           {
                              subgridcontrolcalidad_ccsta_sdts_firstpage( ) ;
                           }
                           else if ( GXutil.strcmp(sEvt, "PREV") == 0 )
                           {
                              subgridcontrolcalidad_ccsta_sdts_previouspage( ) ;
                           }
                           else if ( GXutil.strcmp(sEvt, "NEXT") == 0 )
                           {
                              subgridcontrolcalidad_ccsta_sdts_nextpage( ) ;
                           }
                           else if ( GXutil.strcmp(sEvt, "LAST") == 0 )
                           {
                              subgridcontrolcalidad_ccsta_sdts_lastpage( ) ;
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDCONTROLCALIDAD_VALORESESTANDARS_CCSTA_SDTSPAGING") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           sEvt = httpContext.cgiGet( "GRIDCONTROLCALIDAD_VALORESESTANDARS_CCSTA_SDTSPAGING") ;
                           if ( GXutil.strcmp(sEvt, "FIRST") == 0 )
                           {
                              subgridcontrolcalidad_valoresestandars_ccsta_sdts_firstpage( ) ;
                           }
                           else if ( GXutil.strcmp(sEvt, "PREV") == 0 )
                           {
                              subgridcontrolcalidad_valoresestandars_ccsta_sdts_previouspage( ) ;
                           }
                           else if ( GXutil.strcmp(sEvt, "NEXT") == 0 )
                           {
                              subgridcontrolcalidad_valoresestandars_ccsta_sdts_nextpage( ) ;
                           }
                           else if ( GXutil.strcmp(sEvt, "LAST") == 0 )
                           {
                              subgridcontrolcalidad_valoresestandars_ccsta_sdts_lastpage( ) ;
                           }
                           dynload_actions( ) ;
                        }
                     }
                     else
                     {
                        sEvtType = GXutil.right( sEvt, 4) ;
                        sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-4) ;
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 7), "REFRESH") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 34), "GRIDCONTROLCALIDAD_CCSTA_SDTS.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) )
                        {
                           nGXsfl_131_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_131_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_131_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_1312( ) ;
                           AV84GXV1 = (int)(nGXsfl_131_idx+GRIDCONTROLCALIDAD_CCSTA_SDTS_nFirstRecordOnPage) ;
                           if ( ( AV26ControlCalidad_CCSTA_SDT.size() >= AV84GXV1 ) && ( AV84GXV1 > 0 ) )
                           {
                              AV26ControlCalidad_CCSTA_SDT.currentItem( ((app.controlcalidadhtd.SdtControlCalidad_CCSTA_SDT_Item)AV26ControlCalidad_CCSTA_SDT.elementAt(-1+AV84GXV1)) );
                           }
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e182CE2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Refresh */
                                 e192CE2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "GRIDCONTROLCALIDAD_CCSTA_SDTS.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e202CE2 ();
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
                        else if ( GXutil.strcmp(GXutil.left( sEvt, 51), "GRIDCONTROLCALIDAD_VALORESESTANDARS_CCSTA_SDTS.LOAD") == 0 )
                        {
                           nGXsfl_141_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_141_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_141_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_1415( ) ;
                           AV88GXV5 = (int)(nGXsfl_141_idx+GRIDCONTROLCALIDAD_VALORESESTANDARS_CCSTA_SDTS_nFirstRecordOnPage) ;
                           if ( ( AV28ControlCalidad_ValoresEstandars_CCsta_SDT.size() >= AV88GXV5 ) && ( AV88GXV5 > 0 ) )
                           {
                              AV28ControlCalidad_ValoresEstandars_CCsta_SDT.currentItem( ((app.controlcalidadhtd.SdtControlCalidad_ValoresEstandars_CCsta_SDT_Item)AV28ControlCalidad_ValoresEstandars_CCsta_SDT.elementAt(-1+AV88GXV5)) );
                           }
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "GRIDCONTROLCALIDAD_VALORESESTANDARS_CCSTA_SDTS.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e212CE5 ();
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
                        else if ( ( GXutil.strcmp(GXutil.left( sEvt, 9), "GRID.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 12), "CCTLIN.CLICK") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 12), "GRID.REFRESH") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 12), "CCTLIN.CLICK") == 0 ) )
                        {
                           nGXsfl_154_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_154_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_154_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_1544( ) ;
                           A4034CCTLin = (short)(localUtil.ctol( httpContext.cgiGet( edtCCTLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A4043CCTLinDsc = httpContext.cgiGet( edtCCTLinDsc_Internalname) ;
                           A14344CCTLinDc2 = httpContext.cgiGet( edtCCTLinDc2_Internalname) ;
                           A13251CCMetodo = httpContext.cgiGet( edtCCMetodo_Internalname) ;
                           A13252CCEspecif = httpContext.cgiGet( edtCCEspecif_Internalname) ;
                           A4035CCVal = httpContext.cgiGet( edtCCVal_Internalname) ;
                           A12750CCOkLin = (byte)(localUtil.ctol( httpContext.cgiGet( edtCCOkLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           AV76CCOkLingrid = GXutil.strtobool( httpContext.cgiGet( chkavCcoklingrid.getInternalname())) ;
                           httpContext.ajax_rsp_assign_attri("", false, chkavCcoklingrid.getInternalname(), AV76CCOkLingrid);
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "GRID.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e222CE4 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "CCTLIN.CLICK") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e232CE2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "GRID.REFRESH") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e242CE4 ();
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

   public void we2CE2( )
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

   public void pa2CE2( )
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
            GX_FocusControl = edtavCctlin_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nDonePA = (byte)(1) ;
      }
   }

   public void dynload_actions( )
   {
      /* End function dynload_actions */
   }

   public void gxnrgridcontrolcalidad_ccsta_sdts_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      subsflControlProps_1312( ) ;
      while ( nGXsfl_131_idx <= nRC_GXsfl_131 )
      {
         sendrow_1312( ) ;
         nGXsfl_131_idx = ((subGridcontrolcalidad_ccsta_sdts_Islastpage==1)&&(nGXsfl_131_idx+1>subgridcontrolcalidad_ccsta_sdts_fnc_recordsperpage( )) ? 1 : nGXsfl_131_idx+1) ;
         sGXsfl_131_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_131_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1312( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Gridcontrolcalidad_ccsta_sdtsContainer)) ;
      /* End function gxnrGridcontrolcalidad_ccsta_sdts_newrow */
   }

   public void gxnrgrid_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      subsflControlProps_1544( ) ;
      while ( nGXsfl_154_idx <= nRC_GXsfl_154 )
      {
         sendrow_1544( ) ;
         nGXsfl_154_idx = ((subGrid_Islastpage==1)&&(nGXsfl_154_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_154_idx+1) ;
         sGXsfl_154_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_154_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1544( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxnrgridcontrolcalidad_valoresestandars_ccsta_sdts_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      subsflControlProps_1415( ) ;
      while ( nGXsfl_141_idx <= nRC_GXsfl_141 )
      {
         sendrow_1415( ) ;
         nGXsfl_141_idx = ((subGridcontrolcalidad_valoresestandars_ccsta_sdts_Islastpage==1)&&(nGXsfl_141_idx+1>subgridcontrolcalidad_valoresestandars_ccsta_sdts_fnc_recordsperpage( )) ? 1 : nGXsfl_141_idx+1) ;
         sGXsfl_141_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_141_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1415( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Gridcontrolcalidad_valoresestandars_ccsta_sdtsContainer)) ;
      /* End function gxnrGridcontrolcalidad_valoresestandars_ccsta_sdts_newrow */
   }

   public void gxgrgridcontrolcalidad_ccsta_sdts_refresh( int subGridcontrolcalidad_ccsta_sdts_Rows ,
                                                          int subGridcontrolcalidad_valoresestandars_ccsta_sdts_Rows ,
                                                          int subGrid_Rows ,
                                                          String AV96Pgmname ,
                                                          short AV45OrderedBy ,
                                                          boolean AV46OrderedDsc ,
                                                          short AV58TFCCTLin ,
                                                          short AV59TFCCTLin_To ,
                                                          String AV62TFCCTLinDsc ,
                                                          String AV63TFCCTLinDsc_Sel ,
                                                          String AV60TFCCTLinDc2 ,
                                                          String AV61TFCCTLinDc2_Sel ,
                                                          String AV54TFCCMetodo ,
                                                          String AV55TFCCMetodo_Sel ,
                                                          String AV52TFCCEspecif ,
                                                          String AV53TFCCEspecif_Sel ,
                                                          String AV64TFCCVal ,
                                                          String AV65TFCCVal_Sel ,
                                                          byte AV5CCOkLin ,
                                                          String AV31EmprCod ,
                                                          int AV25clicod ,
                                                          String AV15Barser ,
                                                          String AV12barcolnom ,
                                                          int AV13barcolnum ,
                                                          short AV71AvisoCC ,
                                                          String AV73CCTVal ,
                                                          int AV9BarCod ,
                                                          byte AV11BarCodReo ,
                                                          String AV10BarCodPar ,
                                                          String AV48ProCod ,
                                                          short AV14BarOrdLin ,
                                                          int AV19CCTCod )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e192CE2 ();
      GRIDCONTROLCALIDAD_CCSTA_SDTS_nCurrentRecord = 0 ;
      rf2CE2( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"ControlCalidad_CC1_WKP");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV96Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("controlcalidadhtd\\controlcalidad_cc1_wkp:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
      /* End function gxgrGridcontrolcalidad_ccsta_sdts_refresh */
   }

   public void gxgrgridcontrolcalidad_valoresestandars_ccsta_sdts_refresh( int subGridcontrolcalidad_ccsta_sdts_Rows ,
                                                                           int subGridcontrolcalidad_valoresestandars_ccsta_sdts_Rows ,
                                                                           int subGrid_Rows ,
                                                                           String AV96Pgmname ,
                                                                           short AV45OrderedBy ,
                                                                           boolean AV46OrderedDsc ,
                                                                           short AV58TFCCTLin ,
                                                                           short AV59TFCCTLin_To ,
                                                                           String AV62TFCCTLinDsc ,
                                                                           String AV63TFCCTLinDsc_Sel ,
                                                                           String AV60TFCCTLinDc2 ,
                                                                           String AV61TFCCTLinDc2_Sel ,
                                                                           String AV54TFCCMetodo ,
                                                                           String AV55TFCCMetodo_Sel ,
                                                                           String AV52TFCCEspecif ,
                                                                           String AV53TFCCEspecif_Sel ,
                                                                           String AV64TFCCVal ,
                                                                           String AV65TFCCVal_Sel ,
                                                                           byte AV5CCOkLin ,
                                                                           String AV31EmprCod ,
                                                                           int AV25clicod ,
                                                                           String AV15Barser ,
                                                                           String AV12barcolnom ,
                                                                           int AV13barcolnum ,
                                                                           short AV71AvisoCC ,
                                                                           String AV73CCTVal ,
                                                                           int AV9BarCod ,
                                                                           byte AV11BarCodReo ,
                                                                           String AV10BarCodPar ,
                                                                           String AV48ProCod ,
                                                                           short AV14BarOrdLin ,
                                                                           int AV19CCTCod )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e192CE2 ();
      GRIDCONTROLCALIDAD_VALORESESTANDARS_CCSTA_SDTS_nCurrentRecord = 0 ;
      rf2CE5( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"ControlCalidad_CC1_WKP");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV96Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("controlcalidadhtd\\controlcalidad_cc1_wkp:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
      /* End function gxgrGridcontrolcalidad_valoresestandars_ccsta_sdts_refresh */
   }

   public void gxgrgrid_refresh( int subGridcontrolcalidad_ccsta_sdts_Rows ,
                                 int subGridcontrolcalidad_valoresestandars_ccsta_sdts_Rows ,
                                 int subGrid_Rows ,
                                 String AV31EmprCod ,
                                 int AV9BarCod ,
                                 byte AV11BarCodReo ,
                                 String AV10BarCodPar ,
                                 String AV48ProCod ,
                                 short AV14BarOrdLin ,
                                 int AV19CCTCod ,
                                 String AV96Pgmname ,
                                 short AV45OrderedBy ,
                                 boolean AV46OrderedDsc ,
                                 short AV58TFCCTLin ,
                                 short AV59TFCCTLin_To ,
                                 String AV62TFCCTLinDsc ,
                                 String AV63TFCCTLinDsc_Sel ,
                                 String AV60TFCCTLinDc2 ,
                                 String AV61TFCCTLinDc2_Sel ,
                                 String AV54TFCCMetodo ,
                                 String AV55TFCCMetodo_Sel ,
                                 String AV52TFCCEspecif ,
                                 String AV53TFCCEspecif_Sel ,
                                 String AV64TFCCVal ,
                                 String AV65TFCCVal_Sel ,
                                 byte AV5CCOkLin ,
                                 int AV25clicod ,
                                 String AV15Barser ,
                                 String AV12barcolnom ,
                                 int AV13barcolnum ,
                                 short AV71AvisoCC ,
                                 String AV73CCTVal )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e192CE2 ();
      GRID_nCurrentRecord = 0 ;
      rf2CE4( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"ControlCalidad_CC1_WKP");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV96Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("controlcalidadhtd\\controlcalidad_cc1_wkp:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
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
      AV5CCOkLin = (byte)(((GXutil.strcmp(GXutil.ltrim( localUtil.ntoc( AV5CCOkLin, (byte)(1), (byte)(0), ".", "")), "1")==0) ? 1 : 0)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV5CCOkLin", GXutil.str( AV5CCOkLin, 1, 0));
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rf2CE2( ) ;
      rf2CE5( ) ;
      rf2CE4( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV96Pgmname = "ControlCalidadHTD.ControlCalidad_CC1_WKP" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV96Pgmname", AV96Pgmname);
      Gx_err = (short)(0) ;
      edtavBarcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcod_Enabled), 5, 0), true);
      edtavBarcodreo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarcodreo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcodreo_Enabled), 5, 0), true);
      edtavBarcodpar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarcodpar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcodpar_Enabled), 5, 0), true);
      edtavCctcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCctcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCctcod_Enabled), 5, 0), true);
      edtavCctdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCctdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCctdsc_Enabled), 5, 0), true);
      edtavProcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavProcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavProcod_Enabled), 5, 0), true);
      edtavProdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavProdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavProdsc_Enabled), 5, 0), true);
      edtavBarordlin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarordlin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarordlin_Enabled), 5, 0), true);
      edtavFascod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavFascod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavFascod_Enabled), 5, 0), true);
      edtavFasdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavFasdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavFasdsc_Enabled), 5, 0), true);
      edtavCctlin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCctlin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCctlin_Enabled), 5, 0), true);
      edtavCctlindsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCctlindsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCctlindsc_Enabled), 5, 0), true);
      edtavCctlindc2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCctlindc2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCctlindc2_Enabled), 5, 0), true);
      chkavCcoklin.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, chkavCcoklin.getInternalname(), "Enabled", GXutil.ltrimstr( chkavCcoklin.getEnabled(), 5, 0), true);
      edtavControlcalidad_ccsta_sdt__cctvallin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavControlcalidad_ccsta_sdt__cctvallin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavControlcalidad_ccsta_sdt__cctvallin_Enabled), 5, 0), !bGXsfl_131_Refreshing);
      edtavControlcalidad_ccsta_sdt__cctvaldsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavControlcalidad_ccsta_sdt__cctvaldsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavControlcalidad_ccsta_sdt__cctvaldsc_Enabled), 5, 0), !bGXsfl_131_Refreshing);
      edtavControlcalidad_ccsta_sdt__cctval_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavControlcalidad_ccsta_sdt__cctval_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavControlcalidad_ccsta_sdt__cctval_Enabled), 5, 0), !bGXsfl_131_Refreshing);
      edtavControlcalidad_valoresestandars_ccsta_sdt__cctlin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavControlcalidad_valoresestandars_ccsta_sdt__cctlin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavControlcalidad_valoresestandars_ccsta_sdt__cctlin_Enabled), 5, 0), !bGXsfl_141_Refreshing);
      edtavControlcalidad_valoresestandars_ccsta_sdt__cctlindsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavControlcalidad_valoresestandars_ccsta_sdt__cctlindsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavControlcalidad_valoresestandars_ccsta_sdt__cctlindsc_Enabled), 5, 0), !bGXsfl_141_Refreshing);
      edtavControlcalidad_valoresestandars_ccsta_sdt__ccsauto_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavControlcalidad_valoresestandars_ccsta_sdt__ccsauto_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavControlcalidad_valoresestandars_ccsta_sdt__ccsauto_Enabled), 5, 0), !bGXsfl_141_Refreshing);
      edtavControlcalidad_valoresestandars_ccsta_sdt__ccsvtol_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavControlcalidad_valoresestandars_ccsta_sdt__ccsvtol_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavControlcalidad_valoresestandars_ccsta_sdt__ccsvtol_Enabled), 5, 0), !bGXsfl_141_Refreshing);
      edtavControlcalidad_valoresestandars_ccsta_sdt__ccsmin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavControlcalidad_valoresestandars_ccsta_sdt__ccsmin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavControlcalidad_valoresestandars_ccsta_sdt__ccsmin_Enabled), 5, 0), !bGXsfl_141_Refreshing);
      edtavControlcalidad_valoresestandars_ccsta_sdt__ccsmax_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavControlcalidad_valoresestandars_ccsta_sdt__ccsmax_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavControlcalidad_valoresestandars_ccsta_sdt__ccsmax_Enabled), 5, 0), !bGXsfl_141_Refreshing);
      edtavControlcalidad_valoresestandars_ccsta_sdt__ccvdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavControlcalidad_valoresestandars_ccsta_sdt__ccvdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavControlcalidad_valoresestandars_ccsta_sdt__ccvdsc_Enabled), 5, 0), !bGXsfl_141_Refreshing);
      chkavCcoklingrid.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, chkavCcoklingrid.getInternalname(), "Enabled", GXutil.ltrimstr( chkavCcoklingrid.getEnabled(), 5, 0), !bGXsfl_154_Refreshing);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void rf2CE2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         Gridcontrolcalidad_ccsta_sdtsContainer.ClearRows();
      }
      wbStart = (short)(131) ;
      /* Execute user event: Refresh */
      e192CE2 ();
      nGXsfl_131_idx = 1 ;
      sGXsfl_131_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_131_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_1312( ) ;
      bGXsfl_131_Refreshing = true ;
      Gridcontrolcalidad_ccsta_sdtsContainer.AddObjectProperty("GridName", "Gridcontrolcalidad_ccsta_sdts");
      Gridcontrolcalidad_ccsta_sdtsContainer.AddObjectProperty("CmpContext", "");
      Gridcontrolcalidad_ccsta_sdtsContainer.AddObjectProperty("InMasterPage", "false");
      Gridcontrolcalidad_ccsta_sdtsContainer.AddObjectProperty("Class", "GridNoBorder WorkWith");
      Gridcontrolcalidad_ccsta_sdtsContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Gridcontrolcalidad_ccsta_sdtsContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      Gridcontrolcalidad_ccsta_sdtsContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGridcontrolcalidad_ccsta_sdts_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      Gridcontrolcalidad_ccsta_sdtsContainer.setPageSize( subgridcontrolcalidad_ccsta_sdts_fnc_recordsperpage( ) );
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         subsflControlProps_1312( ) ;
         e202CE2 ();
         if ( ( GRIDCONTROLCALIDAD_CCSTA_SDTS_nCurrentRecord > 0 ) && ( GRIDCONTROLCALIDAD_CCSTA_SDTS_nGridOutOfScope == 0 ) && ( nGXsfl_131_idx == 1 ) )
         {
            GRIDCONTROLCALIDAD_CCSTA_SDTS_nCurrentRecord = 0 ;
            GRIDCONTROLCALIDAD_CCSTA_SDTS_nGridOutOfScope = 1 ;
            subgridcontrolcalidad_ccsta_sdts_firstpage( ) ;
            e202CE2 ();
         }
         wbEnd = (short)(131) ;
         wb2CE0( ) ;
      }
      bGXsfl_131_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes2CE2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "vCLICOD", GXutil.ltrim( localUtil.ntoc( AV25clicod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCLICOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV25clicod), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARSER", GXutil.rtrim( AV15Barser));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARSER", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV15Barser, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCOLNOM", GXutil.rtrim( AV12barcolnom));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCOLNOM", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV12barcolnom, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCOLNUM", GXutil.ltrim( localUtil.ntoc( AV13barcolnum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCOLNUM", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV13barcolnum), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vAVISOCC", GXutil.ltrim( localUtil.ntoc( AV71AvisoCC, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vAVISOCC", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV71AvisoCC), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vCCTVAL", GXutil.rtrim( AV73CCTVal));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCCTVAL", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV73CCTVal, ""))));
   }

   public void rf2CE4( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(154) ;
      e242CE4 ();
      nGXsfl_154_idx = 1 ;
      sGXsfl_154_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_154_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_1544( ) ;
      bGXsfl_154_Refreshing = true ;
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
         subsflControlProps_1544( ) ;
         GXPagingFrom4 = (int)(((subGrid_Rows==0) ? 1 : GRID_nFirstRecordOnPage+1)) ;
         GXPagingTo4 = (int)(((subGrid_Rows==0) ? 10000 : GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )+1)) ;
         pr_default.dynParam(0, new Object[]{ new Object[]{
                                              Short.valueOf(AV100Controlcalidadhtd_controlcalidad_cc1_wkpds_1_tfcctlin) ,
                                              Short.valueOf(AV101Controlcalidadhtd_controlcalidad_cc1_wkpds_2_tfcctlin_to) ,
                                              AV103Controlcalidadhtd_controlcalidad_cc1_wkpds_4_tfcctlindsc_sel ,
                                              AV102Controlcalidadhtd_controlcalidad_cc1_wkpds_3_tfcctlindsc ,
                                              AV105Controlcalidadhtd_controlcalidad_cc1_wkpds_6_tfcctlindc2_sel ,
                                              AV104Controlcalidadhtd_controlcalidad_cc1_wkpds_5_tfcctlindc2 ,
                                              AV107Controlcalidadhtd_controlcalidad_cc1_wkpds_8_tfccmetodo_sel ,
                                              AV106Controlcalidadhtd_controlcalidad_cc1_wkpds_7_tfccmetodo ,
                                              AV109Controlcalidadhtd_controlcalidad_cc1_wkpds_10_tfccespecif_sel ,
                                              AV108Controlcalidadhtd_controlcalidad_cc1_wkpds_9_tfccespecif ,
                                              AV111Controlcalidadhtd_controlcalidad_cc1_wkpds_12_tfccval_sel ,
                                              AV110Controlcalidadhtd_controlcalidad_cc1_wkpds_11_tfccval ,
                                              Short.valueOf(A4034CCTLin) ,
                                              A4043CCTLinDsc ,
                                              A14344CCTLinDc2 ,
                                              A13251CCMetodo ,
                                              A13252CCEspecif ,
                                              A4035CCVal ,
                                              Short.valueOf(AV45OrderedBy) ,
                                              Boolean.valueOf(AV46OrderedDsc) ,
                                              AV31EmprCod ,
                                              Integer.valueOf(AV9BarCod) ,
                                              Byte.valueOf(AV11BarCodReo) ,
                                              AV10BarCodPar ,
                                              AV48ProCod ,
                                              Short.valueOf(AV14BarOrdLin) ,
                                              Integer.valueOf(AV19CCTCod) ,
                                              A396EmprCod ,
                                              Integer.valueOf(A129BarCod) ,
                                              Byte.valueOf(A132BarCodReo) ,
                                              A130BarCodPar ,
                                              A758ProCod ,
                                              Short.valueOf(A194BarOrdLin) ,
                                              Integer.valueOf(A4031CCTCod) } ,
                                              new int[]{
                                              TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN,
                                              TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.INT
                                              }
         });
         lV102Controlcalidadhtd_controlcalidad_cc1_wkpds_3_tfcctlindsc = GXutil.padr( GXutil.rtrim( AV102Controlcalidadhtd_controlcalidad_cc1_wkpds_3_tfcctlindsc), 30, "%") ;
         lV104Controlcalidadhtd_controlcalidad_cc1_wkpds_5_tfcctlindc2 = GXutil.padr( GXutil.rtrim( AV104Controlcalidadhtd_controlcalidad_cc1_wkpds_5_tfcctlindc2), 60, "%") ;
         lV106Controlcalidadhtd_controlcalidad_cc1_wkpds_7_tfccmetodo = GXutil.padr( GXutil.rtrim( AV106Controlcalidadhtd_controlcalidad_cc1_wkpds_7_tfccmetodo), 30, "%") ;
         lV108Controlcalidadhtd_controlcalidad_cc1_wkpds_9_tfccespecif = GXutil.padr( GXutil.rtrim( AV108Controlcalidadhtd_controlcalidad_cc1_wkpds_9_tfccespecif), 30, "%") ;
         lV110Controlcalidadhtd_controlcalidad_cc1_wkpds_11_tfccval = GXutil.padr( GXutil.rtrim( AV110Controlcalidadhtd_controlcalidad_cc1_wkpds_11_tfccval), 40, "%") ;
         /* Using cursor H02CE2 */
         pr_default.execute(0, new Object[] {AV31EmprCod, Integer.valueOf(AV9BarCod), Byte.valueOf(AV11BarCodReo), AV10BarCodPar, AV48ProCod, Short.valueOf(AV14BarOrdLin), Integer.valueOf(AV19CCTCod), Short.valueOf(AV100Controlcalidadhtd_controlcalidad_cc1_wkpds_1_tfcctlin), Short.valueOf(AV101Controlcalidadhtd_controlcalidad_cc1_wkpds_2_tfcctlin_to), lV102Controlcalidadhtd_controlcalidad_cc1_wkpds_3_tfcctlindsc, AV103Controlcalidadhtd_controlcalidad_cc1_wkpds_4_tfcctlindsc_sel, lV104Controlcalidadhtd_controlcalidad_cc1_wkpds_5_tfcctlindc2, AV105Controlcalidadhtd_controlcalidad_cc1_wkpds_6_tfcctlindc2_sel, lV106Controlcalidadhtd_controlcalidad_cc1_wkpds_7_tfccmetodo, AV107Controlcalidadhtd_controlcalidad_cc1_wkpds_8_tfccmetodo_sel, lV108Controlcalidadhtd_controlcalidad_cc1_wkpds_9_tfccespecif, AV109Controlcalidadhtd_controlcalidad_cc1_wkpds_10_tfccespecif_sel, lV110Controlcalidadhtd_controlcalidad_cc1_wkpds_11_tfccval, AV111Controlcalidadhtd_controlcalidad_cc1_wkpds_12_tfccval_sel, Integer.valueOf(GXPagingFrom4), Integer.valueOf(GXPagingTo4), Integer.valueOf(GXPagingTo4), Integer.valueOf(GXPagingFrom4), Integer.valueOf(GXPagingFrom4)});
         nGXsfl_154_idx = 1 ;
         sGXsfl_154_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_154_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1544( ) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A4031CCTCod = H02CE2_A4031CCTCod[0] ;
            A194BarOrdLin = H02CE2_A194BarOrdLin[0] ;
            A758ProCod = H02CE2_A758ProCod[0] ;
            A130BarCodPar = H02CE2_A130BarCodPar[0] ;
            A132BarCodReo = H02CE2_A132BarCodReo[0] ;
            A129BarCod = H02CE2_A129BarCod[0] ;
            A396EmprCod = H02CE2_A396EmprCod[0] ;
            A12750CCOkLin = H02CE2_A12750CCOkLin[0] ;
            A4035CCVal = H02CE2_A4035CCVal[0] ;
            A13252CCEspecif = H02CE2_A13252CCEspecif[0] ;
            A13251CCMetodo = H02CE2_A13251CCMetodo[0] ;
            A14344CCTLinDc2 = H02CE2_A14344CCTLinDc2[0] ;
            A4043CCTLinDsc = H02CE2_A4043CCTLinDsc[0] ;
            A4034CCTLin = H02CE2_A4034CCTLin[0] ;
            A14344CCTLinDc2 = H02CE2_A14344CCTLinDc2[0] ;
            A4043CCTLinDsc = H02CE2_A4043CCTLinDsc[0] ;
            e222CE4 ();
            pr_default.readNext(0);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(154) ;
         wb2CE0( ) ;
      }
      bGXsfl_154_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes2CE4( )
   {
   }

   public void rf2CE5( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         Gridcontrolcalidad_valoresestandars_ccsta_sdtsContainer.ClearRows();
      }
      wbStart = (short)(141) ;
      nGXsfl_141_idx = 1 ;
      sGXsfl_141_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_141_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_1415( ) ;
      bGXsfl_141_Refreshing = true ;
      Gridcontrolcalidad_valoresestandars_ccsta_sdtsContainer.AddObjectProperty("GridName", "Gridcontrolcalidad_valoresestandars_ccsta_sdts");
      Gridcontrolcalidad_valoresestandars_ccsta_sdtsContainer.AddObjectProperty("CmpContext", "");
      Gridcontrolcalidad_valoresestandars_ccsta_sdtsContainer.AddObjectProperty("InMasterPage", "false");
      Gridcontrolcalidad_valoresestandars_ccsta_sdtsContainer.AddObjectProperty("Class", "GridNoBorder WorkWith");
      Gridcontrolcalidad_valoresestandars_ccsta_sdtsContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Gridcontrolcalidad_valoresestandars_ccsta_sdtsContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      Gridcontrolcalidad_valoresestandars_ccsta_sdtsContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGridcontrolcalidad_valoresestandars_ccsta_sdts_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      Gridcontrolcalidad_valoresestandars_ccsta_sdtsContainer.setPageSize( subgridcontrolcalidad_valoresestandars_ccsta_sdts_fnc_recordsperpage( ) );
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         subsflControlProps_1415( ) ;
         e212CE5 ();
         if ( ( GRIDCONTROLCALIDAD_VALORESESTANDARS_CCSTA_SDTS_nCurrentRecord > 0 ) && ( GRIDCONTROLCALIDAD_VALORESESTANDARS_CCSTA_SDTS_nGridOutOfScope == 0 ) && ( nGXsfl_141_idx == 1 ) )
         {
            GRIDCONTROLCALIDAD_VALORESESTANDARS_CCSTA_SDTS_nCurrentRecord = 0 ;
            GRIDCONTROLCALIDAD_VALORESESTANDARS_CCSTA_SDTS_nGridOutOfScope = 1 ;
            subgridcontrolcalidad_valoresestandars_ccsta_sdts_firstpage( ) ;
            e212CE5 ();
         }
         wbEnd = (short)(141) ;
         wb2CE0( ) ;
      }
      bGXsfl_141_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes2CE5( )
   {
   }

   public int subgridcontrolcalidad_ccsta_sdts_fnc_pagecount( )
   {
      GRIDCONTROLCALIDAD_CCSTA_SDTS_nRecordCount = subgridcontrolcalidad_ccsta_sdts_fnc_recordcount( ) ;
      if ( ((int)((GRIDCONTROLCALIDAD_CCSTA_SDTS_nRecordCount) % (subgridcontrolcalidad_ccsta_sdts_fnc_recordsperpage( )))) == 0 )
      {
         return (int)(GXutil.Int( GRIDCONTROLCALIDAD_CCSTA_SDTS_nRecordCount/ (double) (subgridcontrolcalidad_ccsta_sdts_fnc_recordsperpage( )))) ;
      }
      return (int)(GXutil.Int( GRIDCONTROLCALIDAD_CCSTA_SDTS_nRecordCount/ (double) (subgridcontrolcalidad_ccsta_sdts_fnc_recordsperpage( )))+1) ;
   }

   public int subgridcontrolcalidad_ccsta_sdts_fnc_recordcount( )
   {
      return AV26ControlCalidad_CCSTA_SDT.size() ;
   }

   public int subgridcontrolcalidad_ccsta_sdts_fnc_recordsperpage( )
   {
      if ( subGridcontrolcalidad_ccsta_sdts_Rows > 0 )
      {
         return subGridcontrolcalidad_ccsta_sdts_Rows*1 ;
      }
      else
      {
         return -1 ;
      }
   }

   public int subgridcontrolcalidad_ccsta_sdts_fnc_currentpage( )
   {
      return (int)(GXutil.Int( GRIDCONTROLCALIDAD_CCSTA_SDTS_nFirstRecordOnPage/ (double) (subgridcontrolcalidad_ccsta_sdts_fnc_recordsperpage( )))+1) ;
   }

   public short subgridcontrolcalidad_ccsta_sdts_firstpage( )
   {
      GRIDCONTROLCALIDAD_CCSTA_SDTS_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDCONTROLCALIDAD_CCSTA_SDTS_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRIDCONTROLCALIDAD_CCSTA_SDTS_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgridcontrolcalidad_ccsta_sdts_refresh( subGridcontrolcalidad_ccsta_sdts_Rows, subGridcontrolcalidad_valoresestandars_ccsta_sdts_Rows, subGrid_Rows, AV96Pgmname, AV45OrderedBy, AV46OrderedDsc, AV58TFCCTLin, AV59TFCCTLin_To, AV62TFCCTLinDsc, AV63TFCCTLinDsc_Sel, AV60TFCCTLinDc2, AV61TFCCTLinDc2_Sel, AV54TFCCMetodo, AV55TFCCMetodo_Sel, AV52TFCCEspecif, AV53TFCCEspecif_Sel, AV64TFCCVal, AV65TFCCVal_Sel, AV5CCOkLin, AV31EmprCod, AV25clicod, AV15Barser, AV12barcolnom, AV13barcolnum, AV71AvisoCC, AV73CCTVal, AV9BarCod, AV11BarCodReo, AV10BarCodPar, AV48ProCod, AV14BarOrdLin, AV19CCTCod) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgridcontrolcalidad_ccsta_sdts_nextpage( )
   {
      GRIDCONTROLCALIDAD_CCSTA_SDTS_nRecordCount = subgridcontrolcalidad_ccsta_sdts_fnc_recordcount( ) ;
      if ( ( GRIDCONTROLCALIDAD_CCSTA_SDTS_nRecordCount >= subgridcontrolcalidad_ccsta_sdts_fnc_recordsperpage( ) ) && ( GRIDCONTROLCALIDAD_CCSTA_SDTS_nEOF == 0 ) )
      {
         GRIDCONTROLCALIDAD_CCSTA_SDTS_nFirstRecordOnPage = (long)(GRIDCONTROLCALIDAD_CCSTA_SDTS_nFirstRecordOnPage+subgridcontrolcalidad_ccsta_sdts_fnc_recordsperpage( )) ;
      }
      else
      {
         return (short)(2) ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDCONTROLCALIDAD_CCSTA_SDTS_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRIDCONTROLCALIDAD_CCSTA_SDTS_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      Gridcontrolcalidad_ccsta_sdtsContainer.AddObjectProperty("GRIDCONTROLCALIDAD_CCSTA_SDTS_nFirstRecordOnPage", GRIDCONTROLCALIDAD_CCSTA_SDTS_nFirstRecordOnPage);
      if ( isFullAjaxMode( ) )
      {
         gxgrgridcontrolcalidad_ccsta_sdts_refresh( subGridcontrolcalidad_ccsta_sdts_Rows, subGridcontrolcalidad_valoresestandars_ccsta_sdts_Rows, subGrid_Rows, AV96Pgmname, AV45OrderedBy, AV46OrderedDsc, AV58TFCCTLin, AV59TFCCTLin_To, AV62TFCCTLinDsc, AV63TFCCTLinDsc_Sel, AV60TFCCTLinDc2, AV61TFCCTLinDc2_Sel, AV54TFCCMetodo, AV55TFCCMetodo_Sel, AV52TFCCEspecif, AV53TFCCEspecif_Sel, AV64TFCCVal, AV65TFCCVal_Sel, AV5CCOkLin, AV31EmprCod, AV25clicod, AV15Barser, AV12barcolnom, AV13barcolnum, AV71AvisoCC, AV73CCTVal, AV9BarCod, AV11BarCodReo, AV10BarCodPar, AV48ProCod, AV14BarOrdLin, AV19CCTCod) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRIDCONTROLCALIDAD_CCSTA_SDTS_nEOF==0) ? 0 : 2)) ;
   }

   public short subgridcontrolcalidad_ccsta_sdts_previouspage( )
   {
      if ( GRIDCONTROLCALIDAD_CCSTA_SDTS_nFirstRecordOnPage >= subgridcontrolcalidad_ccsta_sdts_fnc_recordsperpage( ) )
      {
         GRIDCONTROLCALIDAD_CCSTA_SDTS_nFirstRecordOnPage = (long)(GRIDCONTROLCALIDAD_CCSTA_SDTS_nFirstRecordOnPage-subgridcontrolcalidad_ccsta_sdts_fnc_recordsperpage( )) ;
      }
      else
      {
         return (short)(2) ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDCONTROLCALIDAD_CCSTA_SDTS_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRIDCONTROLCALIDAD_CCSTA_SDTS_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgridcontrolcalidad_ccsta_sdts_refresh( subGridcontrolcalidad_ccsta_sdts_Rows, subGridcontrolcalidad_valoresestandars_ccsta_sdts_Rows, subGrid_Rows, AV96Pgmname, AV45OrderedBy, AV46OrderedDsc, AV58TFCCTLin, AV59TFCCTLin_To, AV62TFCCTLinDsc, AV63TFCCTLinDsc_Sel, AV60TFCCTLinDc2, AV61TFCCTLinDc2_Sel, AV54TFCCMetodo, AV55TFCCMetodo_Sel, AV52TFCCEspecif, AV53TFCCEspecif_Sel, AV64TFCCVal, AV65TFCCVal_Sel, AV5CCOkLin, AV31EmprCod, AV25clicod, AV15Barser, AV12barcolnom, AV13barcolnum, AV71AvisoCC, AV73CCTVal, AV9BarCod, AV11BarCodReo, AV10BarCodPar, AV48ProCod, AV14BarOrdLin, AV19CCTCod) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgridcontrolcalidad_ccsta_sdts_lastpage( )
   {
      GRIDCONTROLCALIDAD_CCSTA_SDTS_nRecordCount = subgridcontrolcalidad_ccsta_sdts_fnc_recordcount( ) ;
      if ( GRIDCONTROLCALIDAD_CCSTA_SDTS_nRecordCount > subgridcontrolcalidad_ccsta_sdts_fnc_recordsperpage( ) )
      {
         if ( ((int)((GRIDCONTROLCALIDAD_CCSTA_SDTS_nRecordCount) % (subgridcontrolcalidad_ccsta_sdts_fnc_recordsperpage( )))) == 0 )
         {
            GRIDCONTROLCALIDAD_CCSTA_SDTS_nFirstRecordOnPage = (long)(GRIDCONTROLCALIDAD_CCSTA_SDTS_nRecordCount-subgridcontrolcalidad_ccsta_sdts_fnc_recordsperpage( )) ;
         }
         else
         {
            GRIDCONTROLCALIDAD_CCSTA_SDTS_nFirstRecordOnPage = (long)(GRIDCONTROLCALIDAD_CCSTA_SDTS_nRecordCount-((int)((GRIDCONTROLCALIDAD_CCSTA_SDTS_nRecordCount) % (subgridcontrolcalidad_ccsta_sdts_fnc_recordsperpage( ))))) ;
         }
      }
      else
      {
         GRIDCONTROLCALIDAD_CCSTA_SDTS_nFirstRecordOnPage = 0 ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDCONTROLCALIDAD_CCSTA_SDTS_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRIDCONTROLCALIDAD_CCSTA_SDTS_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgridcontrolcalidad_ccsta_sdts_refresh( subGridcontrolcalidad_ccsta_sdts_Rows, subGridcontrolcalidad_valoresestandars_ccsta_sdts_Rows, subGrid_Rows, AV96Pgmname, AV45OrderedBy, AV46OrderedDsc, AV58TFCCTLin, AV59TFCCTLin_To, AV62TFCCTLinDsc, AV63TFCCTLinDsc_Sel, AV60TFCCTLinDc2, AV61TFCCTLinDc2_Sel, AV54TFCCMetodo, AV55TFCCMetodo_Sel, AV52TFCCEspecif, AV53TFCCEspecif_Sel, AV64TFCCVal, AV65TFCCVal_Sel, AV5CCOkLin, AV31EmprCod, AV25clicod, AV15Barser, AV12barcolnom, AV13barcolnum, AV71AvisoCC, AV73CCTVal, AV9BarCod, AV11BarCodReo, AV10BarCodPar, AV48ProCod, AV14BarOrdLin, AV19CCTCod) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgridcontrolcalidad_ccsta_sdts_gotopage( int nPageNo )
   {
      if ( nPageNo > 0 )
      {
         GRIDCONTROLCALIDAD_CCSTA_SDTS_nFirstRecordOnPage = (long)(subgridcontrolcalidad_ccsta_sdts_fnc_recordsperpage( )*(nPageNo-1)) ;
      }
      else
      {
         GRIDCONTROLCALIDAD_CCSTA_SDTS_nFirstRecordOnPage = 0 ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDCONTROLCALIDAD_CCSTA_SDTS_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRIDCONTROLCALIDAD_CCSTA_SDTS_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgridcontrolcalidad_ccsta_sdts_refresh( subGridcontrolcalidad_ccsta_sdts_Rows, subGridcontrolcalidad_valoresestandars_ccsta_sdts_Rows, subGrid_Rows, AV96Pgmname, AV45OrderedBy, AV46OrderedDsc, AV58TFCCTLin, AV59TFCCTLin_To, AV62TFCCTLinDsc, AV63TFCCTLinDsc_Sel, AV60TFCCTLinDc2, AV61TFCCTLinDc2_Sel, AV54TFCCMetodo, AV55TFCCMetodo_Sel, AV52TFCCEspecif, AV53TFCCEspecif_Sel, AV64TFCCVal, AV65TFCCVal_Sel, AV5CCOkLin, AV31EmprCod, AV25clicod, AV15Barser, AV12barcolnom, AV13barcolnum, AV71AvisoCC, AV73CCTVal, AV9BarCod, AV11BarCodReo, AV10BarCodPar, AV48ProCod, AV14BarOrdLin, AV19CCTCod) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
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
      AV100Controlcalidadhtd_controlcalidad_cc1_wkpds_1_tfcctlin = AV58TFCCTLin ;
      AV101Controlcalidadhtd_controlcalidad_cc1_wkpds_2_tfcctlin_to = AV59TFCCTLin_To ;
      AV102Controlcalidadhtd_controlcalidad_cc1_wkpds_3_tfcctlindsc = AV62TFCCTLinDsc ;
      AV103Controlcalidadhtd_controlcalidad_cc1_wkpds_4_tfcctlindsc_sel = AV63TFCCTLinDsc_Sel ;
      AV104Controlcalidadhtd_controlcalidad_cc1_wkpds_5_tfcctlindc2 = AV60TFCCTLinDc2 ;
      AV105Controlcalidadhtd_controlcalidad_cc1_wkpds_6_tfcctlindc2_sel = AV61TFCCTLinDc2_Sel ;
      AV106Controlcalidadhtd_controlcalidad_cc1_wkpds_7_tfccmetodo = AV54TFCCMetodo ;
      AV107Controlcalidadhtd_controlcalidad_cc1_wkpds_8_tfccmetodo_sel = AV55TFCCMetodo_Sel ;
      AV108Controlcalidadhtd_controlcalidad_cc1_wkpds_9_tfccespecif = AV52TFCCEspecif ;
      AV109Controlcalidadhtd_controlcalidad_cc1_wkpds_10_tfccespecif_sel = AV53TFCCEspecif_Sel ;
      AV110Controlcalidadhtd_controlcalidad_cc1_wkpds_11_tfccval = AV64TFCCVal ;
      AV111Controlcalidadhtd_controlcalidad_cc1_wkpds_12_tfccval_sel = AV65TFCCVal_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           Short.valueOf(AV100Controlcalidadhtd_controlcalidad_cc1_wkpds_1_tfcctlin) ,
                                           Short.valueOf(AV101Controlcalidadhtd_controlcalidad_cc1_wkpds_2_tfcctlin_to) ,
                                           AV103Controlcalidadhtd_controlcalidad_cc1_wkpds_4_tfcctlindsc_sel ,
                                           AV102Controlcalidadhtd_controlcalidad_cc1_wkpds_3_tfcctlindsc ,
                                           AV105Controlcalidadhtd_controlcalidad_cc1_wkpds_6_tfcctlindc2_sel ,
                                           AV104Controlcalidadhtd_controlcalidad_cc1_wkpds_5_tfcctlindc2 ,
                                           AV107Controlcalidadhtd_controlcalidad_cc1_wkpds_8_tfccmetodo_sel ,
                                           AV106Controlcalidadhtd_controlcalidad_cc1_wkpds_7_tfccmetodo ,
                                           AV109Controlcalidadhtd_controlcalidad_cc1_wkpds_10_tfccespecif_sel ,
                                           AV108Controlcalidadhtd_controlcalidad_cc1_wkpds_9_tfccespecif ,
                                           AV111Controlcalidadhtd_controlcalidad_cc1_wkpds_12_tfccval_sel ,
                                           AV110Controlcalidadhtd_controlcalidad_cc1_wkpds_11_tfccval ,
                                           Short.valueOf(A4034CCTLin) ,
                                           A4043CCTLinDsc ,
                                           A14344CCTLinDc2 ,
                                           A13251CCMetodo ,
                                           A13252CCEspecif ,
                                           A4035CCVal ,
                                           Short.valueOf(AV45OrderedBy) ,
                                           Boolean.valueOf(AV46OrderedDsc) ,
                                           AV31EmprCod ,
                                           Integer.valueOf(AV9BarCod) ,
                                           Byte.valueOf(AV11BarCodReo) ,
                                           AV10BarCodPar ,
                                           AV48ProCod ,
                                           Short.valueOf(AV14BarOrdLin) ,
                                           Integer.valueOf(AV19CCTCod) ,
                                           A396EmprCod ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           A758ProCod ,
                                           Short.valueOf(A194BarOrdLin) ,
                                           Integer.valueOf(A4031CCTCod) } ,
                                           new int[]{
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.INT
                                           }
      });
      lV102Controlcalidadhtd_controlcalidad_cc1_wkpds_3_tfcctlindsc = GXutil.padr( GXutil.rtrim( AV102Controlcalidadhtd_controlcalidad_cc1_wkpds_3_tfcctlindsc), 30, "%") ;
      lV104Controlcalidadhtd_controlcalidad_cc1_wkpds_5_tfcctlindc2 = GXutil.padr( GXutil.rtrim( AV104Controlcalidadhtd_controlcalidad_cc1_wkpds_5_tfcctlindc2), 60, "%") ;
      lV106Controlcalidadhtd_controlcalidad_cc1_wkpds_7_tfccmetodo = GXutil.padr( GXutil.rtrim( AV106Controlcalidadhtd_controlcalidad_cc1_wkpds_7_tfccmetodo), 30, "%") ;
      lV108Controlcalidadhtd_controlcalidad_cc1_wkpds_9_tfccespecif = GXutil.padr( GXutil.rtrim( AV108Controlcalidadhtd_controlcalidad_cc1_wkpds_9_tfccespecif), 30, "%") ;
      lV110Controlcalidadhtd_controlcalidad_cc1_wkpds_11_tfccval = GXutil.padr( GXutil.rtrim( AV110Controlcalidadhtd_controlcalidad_cc1_wkpds_11_tfccval), 40, "%") ;
      /* Using cursor H02CE3 */
      pr_default.execute(1, new Object[] {AV31EmprCod, Integer.valueOf(AV9BarCod), Byte.valueOf(AV11BarCodReo), AV10BarCodPar, AV48ProCod, Short.valueOf(AV14BarOrdLin), Integer.valueOf(AV19CCTCod), Short.valueOf(AV100Controlcalidadhtd_controlcalidad_cc1_wkpds_1_tfcctlin), Short.valueOf(AV101Controlcalidadhtd_controlcalidad_cc1_wkpds_2_tfcctlin_to), lV102Controlcalidadhtd_controlcalidad_cc1_wkpds_3_tfcctlindsc, AV103Controlcalidadhtd_controlcalidad_cc1_wkpds_4_tfcctlindsc_sel, lV104Controlcalidadhtd_controlcalidad_cc1_wkpds_5_tfcctlindc2, AV105Controlcalidadhtd_controlcalidad_cc1_wkpds_6_tfcctlindc2_sel, lV106Controlcalidadhtd_controlcalidad_cc1_wkpds_7_tfccmetodo, AV107Controlcalidadhtd_controlcalidad_cc1_wkpds_8_tfccmetodo_sel, lV108Controlcalidadhtd_controlcalidad_cc1_wkpds_9_tfccespecif, AV109Controlcalidadhtd_controlcalidad_cc1_wkpds_10_tfccespecif_sel, lV110Controlcalidadhtd_controlcalidad_cc1_wkpds_11_tfccval, AV111Controlcalidadhtd_controlcalidad_cc1_wkpds_12_tfccval_sel});
      GRID_nRecordCount = H02CE3_AGRID_nRecordCount[0] ;
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
      AV100Controlcalidadhtd_controlcalidad_cc1_wkpds_1_tfcctlin = AV58TFCCTLin ;
      AV101Controlcalidadhtd_controlcalidad_cc1_wkpds_2_tfcctlin_to = AV59TFCCTLin_To ;
      AV102Controlcalidadhtd_controlcalidad_cc1_wkpds_3_tfcctlindsc = AV62TFCCTLinDsc ;
      AV103Controlcalidadhtd_controlcalidad_cc1_wkpds_4_tfcctlindsc_sel = AV63TFCCTLinDsc_Sel ;
      AV104Controlcalidadhtd_controlcalidad_cc1_wkpds_5_tfcctlindc2 = AV60TFCCTLinDc2 ;
      AV105Controlcalidadhtd_controlcalidad_cc1_wkpds_6_tfcctlindc2_sel = AV61TFCCTLinDc2_Sel ;
      AV106Controlcalidadhtd_controlcalidad_cc1_wkpds_7_tfccmetodo = AV54TFCCMetodo ;
      AV107Controlcalidadhtd_controlcalidad_cc1_wkpds_8_tfccmetodo_sel = AV55TFCCMetodo_Sel ;
      AV108Controlcalidadhtd_controlcalidad_cc1_wkpds_9_tfccespecif = AV52TFCCEspecif ;
      AV109Controlcalidadhtd_controlcalidad_cc1_wkpds_10_tfccespecif_sel = AV53TFCCEspecif_Sel ;
      AV110Controlcalidadhtd_controlcalidad_cc1_wkpds_11_tfccval = AV64TFCCVal ;
      AV111Controlcalidadhtd_controlcalidad_cc1_wkpds_12_tfccval_sel = AV65TFCCVal_Sel ;
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGridcontrolcalidad_ccsta_sdts_Rows, subGridcontrolcalidad_valoresestandars_ccsta_sdts_Rows, subGrid_Rows, AV31EmprCod, AV9BarCod, AV11BarCodReo, AV10BarCodPar, AV48ProCod, AV14BarOrdLin, AV19CCTCod, AV96Pgmname, AV45OrderedBy, AV46OrderedDsc, AV58TFCCTLin, AV59TFCCTLin_To, AV62TFCCTLinDsc, AV63TFCCTLinDsc_Sel, AV60TFCCTLinDc2, AV61TFCCTLinDc2_Sel, AV54TFCCMetodo, AV55TFCCMetodo_Sel, AV52TFCCEspecif, AV53TFCCEspecif_Sel, AV64TFCCVal, AV65TFCCVal_Sel, AV5CCOkLin, AV25clicod, AV15Barser, AV12barcolnom, AV13barcolnum, AV71AvisoCC, AV73CCTVal) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      AV100Controlcalidadhtd_controlcalidad_cc1_wkpds_1_tfcctlin = AV58TFCCTLin ;
      AV101Controlcalidadhtd_controlcalidad_cc1_wkpds_2_tfcctlin_to = AV59TFCCTLin_To ;
      AV102Controlcalidadhtd_controlcalidad_cc1_wkpds_3_tfcctlindsc = AV62TFCCTLinDsc ;
      AV103Controlcalidadhtd_controlcalidad_cc1_wkpds_4_tfcctlindsc_sel = AV63TFCCTLinDsc_Sel ;
      AV104Controlcalidadhtd_controlcalidad_cc1_wkpds_5_tfcctlindc2 = AV60TFCCTLinDc2 ;
      AV105Controlcalidadhtd_controlcalidad_cc1_wkpds_6_tfcctlindc2_sel = AV61TFCCTLinDc2_Sel ;
      AV106Controlcalidadhtd_controlcalidad_cc1_wkpds_7_tfccmetodo = AV54TFCCMetodo ;
      AV107Controlcalidadhtd_controlcalidad_cc1_wkpds_8_tfccmetodo_sel = AV55TFCCMetodo_Sel ;
      AV108Controlcalidadhtd_controlcalidad_cc1_wkpds_9_tfccespecif = AV52TFCCEspecif ;
      AV109Controlcalidadhtd_controlcalidad_cc1_wkpds_10_tfccespecif_sel = AV53TFCCEspecif_Sel ;
      AV110Controlcalidadhtd_controlcalidad_cc1_wkpds_11_tfccval = AV64TFCCVal ;
      AV111Controlcalidadhtd_controlcalidad_cc1_wkpds_12_tfccval_sel = AV65TFCCVal_Sel ;
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
         gxgrgrid_refresh( subGridcontrolcalidad_ccsta_sdts_Rows, subGridcontrolcalidad_valoresestandars_ccsta_sdts_Rows, subGrid_Rows, AV31EmprCod, AV9BarCod, AV11BarCodReo, AV10BarCodPar, AV48ProCod, AV14BarOrdLin, AV19CCTCod, AV96Pgmname, AV45OrderedBy, AV46OrderedDsc, AV58TFCCTLin, AV59TFCCTLin_To, AV62TFCCTLinDsc, AV63TFCCTLinDsc_Sel, AV60TFCCTLinDc2, AV61TFCCTLinDc2_Sel, AV54TFCCMetodo, AV55TFCCMetodo_Sel, AV52TFCCEspecif, AV53TFCCEspecif_Sel, AV64TFCCVal, AV65TFCCVal_Sel, AV5CCOkLin, AV25clicod, AV15Barser, AV12barcolnom, AV13barcolnum, AV71AvisoCC, AV73CCTVal) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid_previouspage( )
   {
      AV100Controlcalidadhtd_controlcalidad_cc1_wkpds_1_tfcctlin = AV58TFCCTLin ;
      AV101Controlcalidadhtd_controlcalidad_cc1_wkpds_2_tfcctlin_to = AV59TFCCTLin_To ;
      AV102Controlcalidadhtd_controlcalidad_cc1_wkpds_3_tfcctlindsc = AV62TFCCTLinDsc ;
      AV103Controlcalidadhtd_controlcalidad_cc1_wkpds_4_tfcctlindsc_sel = AV63TFCCTLinDsc_Sel ;
      AV104Controlcalidadhtd_controlcalidad_cc1_wkpds_5_tfcctlindc2 = AV60TFCCTLinDc2 ;
      AV105Controlcalidadhtd_controlcalidad_cc1_wkpds_6_tfcctlindc2_sel = AV61TFCCTLinDc2_Sel ;
      AV106Controlcalidadhtd_controlcalidad_cc1_wkpds_7_tfccmetodo = AV54TFCCMetodo ;
      AV107Controlcalidadhtd_controlcalidad_cc1_wkpds_8_tfccmetodo_sel = AV55TFCCMetodo_Sel ;
      AV108Controlcalidadhtd_controlcalidad_cc1_wkpds_9_tfccespecif = AV52TFCCEspecif ;
      AV109Controlcalidadhtd_controlcalidad_cc1_wkpds_10_tfccespecif_sel = AV53TFCCEspecif_Sel ;
      AV110Controlcalidadhtd_controlcalidad_cc1_wkpds_11_tfccval = AV64TFCCVal ;
      AV111Controlcalidadhtd_controlcalidad_cc1_wkpds_12_tfccval_sel = AV65TFCCVal_Sel ;
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
         gxgrgrid_refresh( subGridcontrolcalidad_ccsta_sdts_Rows, subGridcontrolcalidad_valoresestandars_ccsta_sdts_Rows, subGrid_Rows, AV31EmprCod, AV9BarCod, AV11BarCodReo, AV10BarCodPar, AV48ProCod, AV14BarOrdLin, AV19CCTCod, AV96Pgmname, AV45OrderedBy, AV46OrderedDsc, AV58TFCCTLin, AV59TFCCTLin_To, AV62TFCCTLinDsc, AV63TFCCTLinDsc_Sel, AV60TFCCTLinDc2, AV61TFCCTLinDc2_Sel, AV54TFCCMetodo, AV55TFCCMetodo_Sel, AV52TFCCEspecif, AV53TFCCEspecif_Sel, AV64TFCCVal, AV65TFCCVal_Sel, AV5CCOkLin, AV25clicod, AV15Barser, AV12barcolnom, AV13barcolnum, AV71AvisoCC, AV73CCTVal) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      AV100Controlcalidadhtd_controlcalidad_cc1_wkpds_1_tfcctlin = AV58TFCCTLin ;
      AV101Controlcalidadhtd_controlcalidad_cc1_wkpds_2_tfcctlin_to = AV59TFCCTLin_To ;
      AV102Controlcalidadhtd_controlcalidad_cc1_wkpds_3_tfcctlindsc = AV62TFCCTLinDsc ;
      AV103Controlcalidadhtd_controlcalidad_cc1_wkpds_4_tfcctlindsc_sel = AV63TFCCTLinDsc_Sel ;
      AV104Controlcalidadhtd_controlcalidad_cc1_wkpds_5_tfcctlindc2 = AV60TFCCTLinDc2 ;
      AV105Controlcalidadhtd_controlcalidad_cc1_wkpds_6_tfcctlindc2_sel = AV61TFCCTLinDc2_Sel ;
      AV106Controlcalidadhtd_controlcalidad_cc1_wkpds_7_tfccmetodo = AV54TFCCMetodo ;
      AV107Controlcalidadhtd_controlcalidad_cc1_wkpds_8_tfccmetodo_sel = AV55TFCCMetodo_Sel ;
      AV108Controlcalidadhtd_controlcalidad_cc1_wkpds_9_tfccespecif = AV52TFCCEspecif ;
      AV109Controlcalidadhtd_controlcalidad_cc1_wkpds_10_tfccespecif_sel = AV53TFCCEspecif_Sel ;
      AV110Controlcalidadhtd_controlcalidad_cc1_wkpds_11_tfccval = AV64TFCCVal ;
      AV111Controlcalidadhtd_controlcalidad_cc1_wkpds_12_tfccval_sel = AV65TFCCVal_Sel ;
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
         gxgrgrid_refresh( subGridcontrolcalidad_ccsta_sdts_Rows, subGridcontrolcalidad_valoresestandars_ccsta_sdts_Rows, subGrid_Rows, AV31EmprCod, AV9BarCod, AV11BarCodReo, AV10BarCodPar, AV48ProCod, AV14BarOrdLin, AV19CCTCod, AV96Pgmname, AV45OrderedBy, AV46OrderedDsc, AV58TFCCTLin, AV59TFCCTLin_To, AV62TFCCTLinDsc, AV63TFCCTLinDsc_Sel, AV60TFCCTLinDc2, AV61TFCCTLinDc2_Sel, AV54TFCCMetodo, AV55TFCCMetodo_Sel, AV52TFCCEspecif, AV53TFCCEspecif_Sel, AV64TFCCVal, AV65TFCCVal_Sel, AV5CCOkLin, AV25clicod, AV15Barser, AV12barcolnom, AV13barcolnum, AV71AvisoCC, AV73CCTVal) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid_gotopage( int nPageNo )
   {
      AV100Controlcalidadhtd_controlcalidad_cc1_wkpds_1_tfcctlin = AV58TFCCTLin ;
      AV101Controlcalidadhtd_controlcalidad_cc1_wkpds_2_tfcctlin_to = AV59TFCCTLin_To ;
      AV102Controlcalidadhtd_controlcalidad_cc1_wkpds_3_tfcctlindsc = AV62TFCCTLinDsc ;
      AV103Controlcalidadhtd_controlcalidad_cc1_wkpds_4_tfcctlindsc_sel = AV63TFCCTLinDsc_Sel ;
      AV104Controlcalidadhtd_controlcalidad_cc1_wkpds_5_tfcctlindc2 = AV60TFCCTLinDc2 ;
      AV105Controlcalidadhtd_controlcalidad_cc1_wkpds_6_tfcctlindc2_sel = AV61TFCCTLinDc2_Sel ;
      AV106Controlcalidadhtd_controlcalidad_cc1_wkpds_7_tfccmetodo = AV54TFCCMetodo ;
      AV107Controlcalidadhtd_controlcalidad_cc1_wkpds_8_tfccmetodo_sel = AV55TFCCMetodo_Sel ;
      AV108Controlcalidadhtd_controlcalidad_cc1_wkpds_9_tfccespecif = AV52TFCCEspecif ;
      AV109Controlcalidadhtd_controlcalidad_cc1_wkpds_10_tfccespecif_sel = AV53TFCCEspecif_Sel ;
      AV110Controlcalidadhtd_controlcalidad_cc1_wkpds_11_tfccval = AV64TFCCVal ;
      AV111Controlcalidadhtd_controlcalidad_cc1_wkpds_12_tfccval_sel = AV65TFCCVal_Sel ;
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
         gxgrgrid_refresh( subGridcontrolcalidad_ccsta_sdts_Rows, subGridcontrolcalidad_valoresestandars_ccsta_sdts_Rows, subGrid_Rows, AV31EmprCod, AV9BarCod, AV11BarCodReo, AV10BarCodPar, AV48ProCod, AV14BarOrdLin, AV19CCTCod, AV96Pgmname, AV45OrderedBy, AV46OrderedDsc, AV58TFCCTLin, AV59TFCCTLin_To, AV62TFCCTLinDsc, AV63TFCCTLinDsc_Sel, AV60TFCCTLinDc2, AV61TFCCTLinDc2_Sel, AV54TFCCMetodo, AV55TFCCMetodo_Sel, AV52TFCCEspecif, AV53TFCCEspecif_Sel, AV64TFCCVal, AV65TFCCVal_Sel, AV5CCOkLin, AV25clicod, AV15Barser, AV12barcolnom, AV13barcolnum, AV71AvisoCC, AV73CCTVal) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public int subgridcontrolcalidad_valoresestandars_ccsta_sdts_fnc_pagecount( )
   {
      GRIDCONTROLCALIDAD_VALORESESTANDARS_CCSTA_SDTS_nRecordCount = subgridcontrolcalidad_valoresestandars_ccsta_sdts_fnc_recordcount( ) ;
      if ( ((int)((GRIDCONTROLCALIDAD_VALORESESTANDARS_CCSTA_SDTS_nRecordCount) % (subgridcontrolcalidad_valoresestandars_ccsta_sdts_fnc_recordsperpage( )))) == 0 )
      {
         return (int)(GXutil.Int( GRIDCONTROLCALIDAD_VALORESESTANDARS_CCSTA_SDTS_nRecordCount/ (double) (subgridcontrolcalidad_valoresestandars_ccsta_sdts_fnc_recordsperpage( )))) ;
      }
      return (int)(GXutil.Int( GRIDCONTROLCALIDAD_VALORESESTANDARS_CCSTA_SDTS_nRecordCount/ (double) (subgridcontrolcalidad_valoresestandars_ccsta_sdts_fnc_recordsperpage( )))+1) ;
   }

   public int subgridcontrolcalidad_valoresestandars_ccsta_sdts_fnc_recordcount( )
   {
      return AV28ControlCalidad_ValoresEstandars_CCsta_SDT.size() ;
   }

   public int subgridcontrolcalidad_valoresestandars_ccsta_sdts_fnc_recordsperpage( )
   {
      if ( subGridcontrolcalidad_valoresestandars_ccsta_sdts_Rows > 0 )
      {
         return subGridcontrolcalidad_valoresestandars_ccsta_sdts_Rows*1 ;
      }
      else
      {
         return -1 ;
      }
   }

   public int subgridcontrolcalidad_valoresestandars_ccsta_sdts_fnc_currentpage( )
   {
      return (int)(GXutil.Int( GRIDCONTROLCALIDAD_VALORESESTANDARS_CCSTA_SDTS_nFirstRecordOnPage/ (double) (subgridcontrolcalidad_valoresestandars_ccsta_sdts_fnc_recordsperpage( )))+1) ;
   }

   public short subgridcontrolcalidad_valoresestandars_ccsta_sdts_firstpage( )
   {
      GRIDCONTROLCALIDAD_VALORESESTANDARS_CCSTA_SDTS_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDCONTROLCALIDAD_VALORESESTANDARS_CCSTA_SDTS_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRIDCONTROLCALIDAD_VALORESESTANDARS_CCSTA_SDTS_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgridcontrolcalidad_valoresestandars_ccsta_sdts_refresh( subGridcontrolcalidad_ccsta_sdts_Rows, subGridcontrolcalidad_valoresestandars_ccsta_sdts_Rows, subGrid_Rows, AV96Pgmname, AV45OrderedBy, AV46OrderedDsc, AV58TFCCTLin, AV59TFCCTLin_To, AV62TFCCTLinDsc, AV63TFCCTLinDsc_Sel, AV60TFCCTLinDc2, AV61TFCCTLinDc2_Sel, AV54TFCCMetodo, AV55TFCCMetodo_Sel, AV52TFCCEspecif, AV53TFCCEspecif_Sel, AV64TFCCVal, AV65TFCCVal_Sel, AV5CCOkLin, AV31EmprCod, AV25clicod, AV15Barser, AV12barcolnom, AV13barcolnum, AV71AvisoCC, AV73CCTVal, AV9BarCod, AV11BarCodReo, AV10BarCodPar, AV48ProCod, AV14BarOrdLin, AV19CCTCod) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgridcontrolcalidad_valoresestandars_ccsta_sdts_nextpage( )
   {
      GRIDCONTROLCALIDAD_VALORESESTANDARS_CCSTA_SDTS_nRecordCount = subgridcontrolcalidad_valoresestandars_ccsta_sdts_fnc_recordcount( ) ;
      if ( ( GRIDCONTROLCALIDAD_VALORESESTANDARS_CCSTA_SDTS_nRecordCount >= subgridcontrolcalidad_valoresestandars_ccsta_sdts_fnc_recordsperpage( ) ) && ( GRIDCONTROLCALIDAD_VALORESESTANDARS_CCSTA_SDTS_nEOF == 0 ) )
      {
         GRIDCONTROLCALIDAD_VALORESESTANDARS_CCSTA_SDTS_nFirstRecordOnPage = (long)(GRIDCONTROLCALIDAD_VALORESESTANDARS_CCSTA_SDTS_nFirstRecordOnPage+subgridcontrolcalidad_valoresestandars_ccsta_sdts_fnc_recordsperpage( )) ;
      }
      else
      {
         return (short)(2) ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDCONTROLCALIDAD_VALORESESTANDARS_CCSTA_SDTS_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRIDCONTROLCALIDAD_VALORESESTANDARS_CCSTA_SDTS_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      Gridcontrolcalidad_valoresestandars_ccsta_sdtsContainer.AddObjectProperty("GRIDCONTROLCALIDAD_VALORESESTANDARS_CCSTA_SDTS_nFirstRecordOnPage", GRIDCONTROLCALIDAD_VALORESESTANDARS_CCSTA_SDTS_nFirstRecordOnPage);
      if ( isFullAjaxMode( ) )
      {
         gxgrgridcontrolcalidad_valoresestandars_ccsta_sdts_refresh( subGridcontrolcalidad_ccsta_sdts_Rows, subGridcontrolcalidad_valoresestandars_ccsta_sdts_Rows, subGrid_Rows, AV96Pgmname, AV45OrderedBy, AV46OrderedDsc, AV58TFCCTLin, AV59TFCCTLin_To, AV62TFCCTLinDsc, AV63TFCCTLinDsc_Sel, AV60TFCCTLinDc2, AV61TFCCTLinDc2_Sel, AV54TFCCMetodo, AV55TFCCMetodo_Sel, AV52TFCCEspecif, AV53TFCCEspecif_Sel, AV64TFCCVal, AV65TFCCVal_Sel, AV5CCOkLin, AV31EmprCod, AV25clicod, AV15Barser, AV12barcolnom, AV13barcolnum, AV71AvisoCC, AV73CCTVal, AV9BarCod, AV11BarCodReo, AV10BarCodPar, AV48ProCod, AV14BarOrdLin, AV19CCTCod) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRIDCONTROLCALIDAD_VALORESESTANDARS_CCSTA_SDTS_nEOF==0) ? 0 : 2)) ;
   }

   public short subgridcontrolcalidad_valoresestandars_ccsta_sdts_previouspage( )
   {
      if ( GRIDCONTROLCALIDAD_VALORESESTANDARS_CCSTA_SDTS_nFirstRecordOnPage >= subgridcontrolcalidad_valoresestandars_ccsta_sdts_fnc_recordsperpage( ) )
      {
         GRIDCONTROLCALIDAD_VALORESESTANDARS_CCSTA_SDTS_nFirstRecordOnPage = (long)(GRIDCONTROLCALIDAD_VALORESESTANDARS_CCSTA_SDTS_nFirstRecordOnPage-subgridcontrolcalidad_valoresestandars_ccsta_sdts_fnc_recordsperpage( )) ;
      }
      else
      {
         return (short)(2) ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDCONTROLCALIDAD_VALORESESTANDARS_CCSTA_SDTS_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRIDCONTROLCALIDAD_VALORESESTANDARS_CCSTA_SDTS_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgridcontrolcalidad_valoresestandars_ccsta_sdts_refresh( subGridcontrolcalidad_ccsta_sdts_Rows, subGridcontrolcalidad_valoresestandars_ccsta_sdts_Rows, subGrid_Rows, AV96Pgmname, AV45OrderedBy, AV46OrderedDsc, AV58TFCCTLin, AV59TFCCTLin_To, AV62TFCCTLinDsc, AV63TFCCTLinDsc_Sel, AV60TFCCTLinDc2, AV61TFCCTLinDc2_Sel, AV54TFCCMetodo, AV55TFCCMetodo_Sel, AV52TFCCEspecif, AV53TFCCEspecif_Sel, AV64TFCCVal, AV65TFCCVal_Sel, AV5CCOkLin, AV31EmprCod, AV25clicod, AV15Barser, AV12barcolnom, AV13barcolnum, AV71AvisoCC, AV73CCTVal, AV9BarCod, AV11BarCodReo, AV10BarCodPar, AV48ProCod, AV14BarOrdLin, AV19CCTCod) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgridcontrolcalidad_valoresestandars_ccsta_sdts_lastpage( )
   {
      GRIDCONTROLCALIDAD_VALORESESTANDARS_CCSTA_SDTS_nRecordCount = subgridcontrolcalidad_valoresestandars_ccsta_sdts_fnc_recordcount( ) ;
      if ( GRIDCONTROLCALIDAD_VALORESESTANDARS_CCSTA_SDTS_nRecordCount > subgridcontrolcalidad_valoresestandars_ccsta_sdts_fnc_recordsperpage( ) )
      {
         if ( ((int)((GRIDCONTROLCALIDAD_VALORESESTANDARS_CCSTA_SDTS_nRecordCount) % (subgridcontrolcalidad_valoresestandars_ccsta_sdts_fnc_recordsperpage( )))) == 0 )
         {
            GRIDCONTROLCALIDAD_VALORESESTANDARS_CCSTA_SDTS_nFirstRecordOnPage = (long)(GRIDCONTROLCALIDAD_VALORESESTANDARS_CCSTA_SDTS_nRecordCount-subgridcontrolcalidad_valoresestandars_ccsta_sdts_fnc_recordsperpage( )) ;
         }
         else
         {
            GRIDCONTROLCALIDAD_VALORESESTANDARS_CCSTA_SDTS_nFirstRecordOnPage = (long)(GRIDCONTROLCALIDAD_VALORESESTANDARS_CCSTA_SDTS_nRecordCount-((int)((GRIDCONTROLCALIDAD_VALORESESTANDARS_CCSTA_SDTS_nRecordCount) % (subgridcontrolcalidad_valoresestandars_ccsta_sdts_fnc_recordsperpage( ))))) ;
         }
      }
      else
      {
         GRIDCONTROLCALIDAD_VALORESESTANDARS_CCSTA_SDTS_nFirstRecordOnPage = 0 ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDCONTROLCALIDAD_VALORESESTANDARS_CCSTA_SDTS_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRIDCONTROLCALIDAD_VALORESESTANDARS_CCSTA_SDTS_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgridcontrolcalidad_valoresestandars_ccsta_sdts_refresh( subGridcontrolcalidad_ccsta_sdts_Rows, subGridcontrolcalidad_valoresestandars_ccsta_sdts_Rows, subGrid_Rows, AV96Pgmname, AV45OrderedBy, AV46OrderedDsc, AV58TFCCTLin, AV59TFCCTLin_To, AV62TFCCTLinDsc, AV63TFCCTLinDsc_Sel, AV60TFCCTLinDc2, AV61TFCCTLinDc2_Sel, AV54TFCCMetodo, AV55TFCCMetodo_Sel, AV52TFCCEspecif, AV53TFCCEspecif_Sel, AV64TFCCVal, AV65TFCCVal_Sel, AV5CCOkLin, AV31EmprCod, AV25clicod, AV15Barser, AV12barcolnom, AV13barcolnum, AV71AvisoCC, AV73CCTVal, AV9BarCod, AV11BarCodReo, AV10BarCodPar, AV48ProCod, AV14BarOrdLin, AV19CCTCod) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgridcontrolcalidad_valoresestandars_ccsta_sdts_gotopage( int nPageNo )
   {
      if ( nPageNo > 0 )
      {
         GRIDCONTROLCALIDAD_VALORESESTANDARS_CCSTA_SDTS_nFirstRecordOnPage = (long)(subgridcontrolcalidad_valoresestandars_ccsta_sdts_fnc_recordsperpage( )*(nPageNo-1)) ;
      }
      else
      {
         GRIDCONTROLCALIDAD_VALORESESTANDARS_CCSTA_SDTS_nFirstRecordOnPage = 0 ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDCONTROLCALIDAD_VALORESESTANDARS_CCSTA_SDTS_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRIDCONTROLCALIDAD_VALORESESTANDARS_CCSTA_SDTS_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgridcontrolcalidad_valoresestandars_ccsta_sdts_refresh( subGridcontrolcalidad_ccsta_sdts_Rows, subGridcontrolcalidad_valoresestandars_ccsta_sdts_Rows, subGrid_Rows, AV96Pgmname, AV45OrderedBy, AV46OrderedDsc, AV58TFCCTLin, AV59TFCCTLin_To, AV62TFCCTLinDsc, AV63TFCCTLinDsc_Sel, AV60TFCCTLinDc2, AV61TFCCTLinDc2_Sel, AV54TFCCMetodo, AV55TFCCMetodo_Sel, AV52TFCCEspecif, AV53TFCCEspecif_Sel, AV64TFCCVal, AV65TFCCVal_Sel, AV5CCOkLin, AV31EmprCod, AV25clicod, AV15Barser, AV12barcolnom, AV13barcolnum, AV71AvisoCC, AV73CCTVal, AV9BarCod, AV11BarCodReo, AV10BarCodPar, AV48ProCod, AV14BarOrdLin, AV19CCTCod) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV96Pgmname = "ControlCalidadHTD.ControlCalidad_CC1_WKP" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV96Pgmname", AV96Pgmname);
      Gx_err = (short)(0) ;
      edtavBarcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcod_Enabled), 5, 0), true);
      edtavBarcodreo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarcodreo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcodreo_Enabled), 5, 0), true);
      edtavBarcodpar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarcodpar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcodpar_Enabled), 5, 0), true);
      edtavCctcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCctcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCctcod_Enabled), 5, 0), true);
      edtavCctdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCctdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCctdsc_Enabled), 5, 0), true);
      edtavProcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavProcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavProcod_Enabled), 5, 0), true);
      edtavProdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavProdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavProdsc_Enabled), 5, 0), true);
      edtavBarordlin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarordlin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarordlin_Enabled), 5, 0), true);
      edtavFascod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavFascod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavFascod_Enabled), 5, 0), true);
      edtavFasdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavFasdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavFasdsc_Enabled), 5, 0), true);
      edtavCctlin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCctlin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCctlin_Enabled), 5, 0), true);
      edtavCctlindsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCctlindsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCctlindsc_Enabled), 5, 0), true);
      edtavCctlindc2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCctlindc2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCctlindc2_Enabled), 5, 0), true);
      chkavCcoklin.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, chkavCcoklin.getInternalname(), "Enabled", GXutil.ltrimstr( chkavCcoklin.getEnabled(), 5, 0), true);
      edtavControlcalidad_ccsta_sdt__cctvallin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavControlcalidad_ccsta_sdt__cctvallin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavControlcalidad_ccsta_sdt__cctvallin_Enabled), 5, 0), !bGXsfl_131_Refreshing);
      edtavControlcalidad_ccsta_sdt__cctvaldsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavControlcalidad_ccsta_sdt__cctvaldsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavControlcalidad_ccsta_sdt__cctvaldsc_Enabled), 5, 0), !bGXsfl_131_Refreshing);
      edtavControlcalidad_ccsta_sdt__cctval_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavControlcalidad_ccsta_sdt__cctval_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavControlcalidad_ccsta_sdt__cctval_Enabled), 5, 0), !bGXsfl_131_Refreshing);
      edtavControlcalidad_valoresestandars_ccsta_sdt__cctlin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavControlcalidad_valoresestandars_ccsta_sdt__cctlin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavControlcalidad_valoresestandars_ccsta_sdt__cctlin_Enabled), 5, 0), !bGXsfl_141_Refreshing);
      edtavControlcalidad_valoresestandars_ccsta_sdt__cctlindsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavControlcalidad_valoresestandars_ccsta_sdt__cctlindsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavControlcalidad_valoresestandars_ccsta_sdt__cctlindsc_Enabled), 5, 0), !bGXsfl_141_Refreshing);
      edtavControlcalidad_valoresestandars_ccsta_sdt__ccsauto_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavControlcalidad_valoresestandars_ccsta_sdt__ccsauto_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavControlcalidad_valoresestandars_ccsta_sdt__ccsauto_Enabled), 5, 0), !bGXsfl_141_Refreshing);
      edtavControlcalidad_valoresestandars_ccsta_sdt__ccsvtol_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavControlcalidad_valoresestandars_ccsta_sdt__ccsvtol_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavControlcalidad_valoresestandars_ccsta_sdt__ccsvtol_Enabled), 5, 0), !bGXsfl_141_Refreshing);
      edtavControlcalidad_valoresestandars_ccsta_sdt__ccsmin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavControlcalidad_valoresestandars_ccsta_sdt__ccsmin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavControlcalidad_valoresestandars_ccsta_sdt__ccsmin_Enabled), 5, 0), !bGXsfl_141_Refreshing);
      edtavControlcalidad_valoresestandars_ccsta_sdt__ccsmax_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavControlcalidad_valoresestandars_ccsta_sdt__ccsmax_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavControlcalidad_valoresestandars_ccsta_sdt__ccsmax_Enabled), 5, 0), !bGXsfl_141_Refreshing);
      edtavControlcalidad_valoresestandars_ccsta_sdt__ccvdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavControlcalidad_valoresestandars_ccsta_sdt__ccvdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavControlcalidad_valoresestandars_ccsta_sdt__ccvdsc_Enabled), 5, 0), !bGXsfl_141_Refreshing);
      chkavCcoklingrid.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, chkavCcoklingrid.getInternalname(), "Enabled", GXutil.ltrimstr( chkavCcoklingrid.getEnabled(), 5, 0), !bGXsfl_154_Refreshing);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup2CE0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e182CE2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "Controlcalidad_ccsta_sdt"), AV26ControlCalidad_CCSTA_SDT);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "Controlcalidad_valoresestandars_ccsta_sdt"), AV28ControlCalidad_ValoresEstandars_CCsta_SDT);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vDDO_TITLESETTINGSICONS"), AV30DDO_TitleSettingsIcons);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vCONTROLCALIDAD_CCSTA_SDT"), AV26ControlCalidad_CCSTA_SDT);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vCONTROLCALIDAD_VALORESESTANDARS_CCSTA_SDT"), AV28ControlCalidad_ValoresEstandars_CCsta_SDT);
         /* Read saved values. */
         nRC_GXsfl_131 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_131"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         nRC_GXsfl_141 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_141"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         nRC_GXsfl_154 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_154"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV36GridCurrentPage = localUtil.ctol( httpContext.cgiGet( "vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV37GridPageCount = localUtil.ctol( httpContext.cgiGet( "vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         GRIDCONTROLCALIDAD_CCSTA_SDTS_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( "GRIDCONTROLCALIDAD_CCSTA_SDTS_nFirstRecordOnPage"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         GRIDCONTROLCALIDAD_VALORESESTANDARS_CCSTA_SDTS_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( "GRIDCONTROLCALIDAD_VALORESESTANDARS_CCSTA_SDTS_nFirstRecordOnPage"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         GRID_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( "GRID_nFirstRecordOnPage"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         GRIDCONTROLCALIDAD_CCSTA_SDTS_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( "GRIDCONTROLCALIDAD_CCSTA_SDTS_nEOF"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         GRIDCONTROLCALIDAD_VALORESESTANDARS_CCSTA_SDTS_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( "GRIDCONTROLCALIDAD_VALORESESTANDARS_CCSTA_SDTS_nEOF"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         GRID_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( "GRID_nEOF"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         subGridcontrolcalidad_ccsta_sdts_Rows = (int)(localUtil.ctol( httpContext.cgiGet( "GRIDCONTROLCALIDAD_CCSTA_SDTS_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRIDCONTROLCALIDAD_CCSTA_SDTS_Rows", GXutil.ltrim( localUtil.ntoc( subGridcontrolcalidad_ccsta_sdts_Rows, (byte)(6), (byte)(0), ".", "")));
         subGridcontrolcalidad_valoresestandars_ccsta_sdts_Rows = (int)(localUtil.ctol( httpContext.cgiGet( "GRIDCONTROLCALIDAD_VALORESESTANDARS_CCSTA_SDTS_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRIDCONTROLCALIDAD_VALORESESTANDARS_CCSTA_SDTS_Rows", GXutil.ltrim( localUtil.ntoc( subGridcontrolcalidad_valoresestandars_ccsta_sdts_Rows, (byte)(6), (byte)(0), ".", "")));
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( "GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
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
         Dvpanel_unnamedtable6_Width = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE6_Width") ;
         Dvpanel_unnamedtable6_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE6_Autowidth")) ;
         Dvpanel_unnamedtable6_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE6_Autoheight")) ;
         Dvpanel_unnamedtable6_Cls = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE6_Cls") ;
         Dvpanel_unnamedtable6_Title = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE6_Title") ;
         Dvpanel_unnamedtable6_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE6_Collapsible")) ;
         Dvpanel_unnamedtable6_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE6_Collapsed")) ;
         Dvpanel_unnamedtable6_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE6_Showcollapseicon")) ;
         Dvpanel_unnamedtable6_Iconposition = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE6_Iconposition") ;
         Dvpanel_unnamedtable6_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE6_Autoscroll")) ;
         Dvpanel_panelvalorestandar_Width = httpContext.cgiGet( "DVPANEL_PANELVALORESTANDAR_Width") ;
         Dvpanel_panelvalorestandar_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELVALORESTANDAR_Autowidth")) ;
         Dvpanel_panelvalorestandar_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELVALORESTANDAR_Autoheight")) ;
         Dvpanel_panelvalorestandar_Cls = httpContext.cgiGet( "DVPANEL_PANELVALORESTANDAR_Cls") ;
         Dvpanel_panelvalorestandar_Title = httpContext.cgiGet( "DVPANEL_PANELVALORESTANDAR_Title") ;
         Dvpanel_panelvalorestandar_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELVALORESTANDAR_Collapsible")) ;
         Dvpanel_panelvalorestandar_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELVALORESTANDAR_Collapsed")) ;
         Dvpanel_panelvalorestandar_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELVALORESTANDAR_Showcollapseicon")) ;
         Dvpanel_panelvalorestandar_Iconposition = httpContext.cgiGet( "DVPANEL_PANELVALORESTANDAR_Iconposition") ;
         Dvpanel_panelvalorestandar_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELVALORESTANDAR_Autoscroll")) ;
         Dvpanel_unnamedtable5_Width = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE5_Width") ;
         Dvpanel_unnamedtable5_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE5_Autowidth")) ;
         Dvpanel_unnamedtable5_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE5_Autoheight")) ;
         Dvpanel_unnamedtable5_Cls = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE5_Cls") ;
         Dvpanel_unnamedtable5_Title = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE5_Title") ;
         Dvpanel_unnamedtable5_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE5_Collapsible")) ;
         Dvpanel_unnamedtable5_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE5_Collapsed")) ;
         Dvpanel_unnamedtable5_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE5_Showcollapseicon")) ;
         Dvpanel_unnamedtable5_Iconposition = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE5_Iconposition") ;
         Dvpanel_unnamedtable5_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE5_Autoscroll")) ;
         Dvpanel_unnamedtable1_Width = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Width") ;
         Dvpanel_unnamedtable1_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Autowidth")) ;
         Dvpanel_unnamedtable1_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Autoheight")) ;
         Dvpanel_unnamedtable1_Cls = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Cls") ;
         Dvpanel_unnamedtable1_Title = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Title") ;
         Dvpanel_unnamedtable1_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Collapsible")) ;
         Dvpanel_unnamedtable1_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Collapsed")) ;
         Dvpanel_unnamedtable1_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Showcollapseicon")) ;
         Dvpanel_unnamedtable1_Iconposition = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Iconposition") ;
         Dvpanel_unnamedtable1_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Autoscroll")) ;
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
         Ddo_grid_Sortedstatus = httpContext.cgiGet( "DDO_GRID_Sortedstatus") ;
         Ddo_grid_Includefilter = httpContext.cgiGet( "DDO_GRID_Includefilter") ;
         Ddo_grid_Filtertype = httpContext.cgiGet( "DDO_GRID_Filtertype") ;
         Ddo_grid_Filterisrange = httpContext.cgiGet( "DDO_GRID_Filterisrange") ;
         Ddo_grid_Includedatalist = httpContext.cgiGet( "DDO_GRID_Includedatalist") ;
         Ddo_grid_Datalisttype = httpContext.cgiGet( "DDO_GRID_Datalisttype") ;
         Ddo_grid_Datalistproc = httpContext.cgiGet( "DDO_GRID_Datalistproc") ;
         Grid_empowerer_Gridinternalname = httpContext.cgiGet( "GRID_EMPOWERER_Gridinternalname") ;
         Grid_empowerer_Hastitlesettings = GXutil.strtobool( httpContext.cgiGet( "GRID_EMPOWERER_Hastitlesettings")) ;
         Gridcontrolcalidad_valoresestandars_ccsta_sdts_titlescategories_Gridinternalname = httpContext.cgiGet( "GRIDCONTROLCALIDAD_VALORESESTANDARS_CCSTA_SDTS_TITLESCATEGORIES_Gridinternalname") ;
         Gridcontrolcalidad_valoresestandars_ccsta_sdts_titlescategories_Gridtitlescategories = httpContext.cgiGet( "GRIDCONTROLCALIDAD_VALORESESTANDARS_CCSTA_SDTS_TITLESCATEGORIES_Gridtitlescategories") ;
         Gridcontrolcalidad_valoresestandars_ccsta_sdts_empowerer_Gridinternalname = httpContext.cgiGet( "GRIDCONTROLCALIDAD_VALORESESTANDARS_CCSTA_SDTS_EMPOWERER_Gridinternalname") ;
         Gridcontrolcalidad_valoresestandars_ccsta_sdts_empowerer_Hascategories = GXutil.strtobool( httpContext.cgiGet( "GRIDCONTROLCALIDAD_VALORESESTANDARS_CCSTA_SDTS_EMPOWERER_Hascategories")) ;
         Gridcontrolcalidad_ccsta_sdts_empowerer_Gridinternalname = httpContext.cgiGet( "GRIDCONTROLCALIDAD_CCSTA_SDTS_EMPOWERER_Gridinternalname") ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( "GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
         Gridpaginationbar_Selectedpage = httpContext.cgiGet( "GRIDPAGINATIONBAR_Selectedpage") ;
         Gridpaginationbar_Rowsperpageselectedvalue = (int)(localUtil.ctol( httpContext.cgiGet( "GRIDPAGINATIONBAR_Rowsperpageselectedvalue"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Ddo_grid_Activeeventkey = httpContext.cgiGet( "DDO_GRID_Activeeventkey") ;
         Ddo_grid_Selectedvalue_get = httpContext.cgiGet( "DDO_GRID_Selectedvalue_get") ;
         Ddo_grid_Filteredtextto_get = httpContext.cgiGet( "DDO_GRID_Filteredtextto_get") ;
         Ddo_grid_Filteredtext_get = httpContext.cgiGet( "DDO_GRID_Filteredtext_get") ;
         Ddo_grid_Selectedcolumn = httpContext.cgiGet( "DDO_GRID_Selectedcolumn") ;
         nRC_GXsfl_131 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_131"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         nGXsfl_131_fel_idx = 0 ;
         while ( nGXsfl_131_fel_idx < nRC_GXsfl_131 )
         {
            nGXsfl_131_fel_idx = ((subGridcontrolcalidad_ccsta_sdts_Islastpage==1)&&(nGXsfl_131_fel_idx+1>subgridcontrolcalidad_ccsta_sdts_fnc_recordsperpage( )) ? 1 : nGXsfl_131_fel_idx+1) ;
            sGXsfl_131_fel_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_131_fel_idx), 4, 0), (short)(4), "0") ;
            subsflControlProps_fel_1312( ) ;
            AV84GXV1 = (int)(nGXsfl_131_fel_idx+GRIDCONTROLCALIDAD_CCSTA_SDTS_nFirstRecordOnPage) ;
            if ( ( AV26ControlCalidad_CCSTA_SDT.size() >= AV84GXV1 ) && ( AV84GXV1 > 0 ) )
            {
               AV26ControlCalidad_CCSTA_SDT.currentItem( ((app.controlcalidadhtd.SdtControlCalidad_CCSTA_SDT_Item)AV26ControlCalidad_CCSTA_SDT.elementAt(-1+AV84GXV1)) );
            }
         }
         if ( nGXsfl_131_fel_idx == 0 )
         {
            nGXsfl_131_idx = 1 ;
            sGXsfl_131_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_131_idx), 4, 0), (short)(4), "0") ;
            subsflControlProps_1312( ) ;
         }
         nGXsfl_131_fel_idx = 1 ;
         nRC_GXsfl_141 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_141"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         nGXsfl_141_fel_idx = 0 ;
         while ( nGXsfl_141_fel_idx < nRC_GXsfl_141 )
         {
            nGXsfl_141_fel_idx = ((subGridcontrolcalidad_valoresestandars_ccsta_sdts_Islastpage==1)&&(nGXsfl_141_fel_idx+1>subgridcontrolcalidad_valoresestandars_ccsta_sdts_fnc_recordsperpage( )) ? 1 : nGXsfl_141_fel_idx+1) ;
            sGXsfl_141_fel_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_141_fel_idx), 4, 0), (short)(4), "0") ;
            subsflControlProps_fel_1415( ) ;
            AV88GXV5 = (int)(nGXsfl_141_fel_idx+GRIDCONTROLCALIDAD_VALORESESTANDARS_CCSTA_SDTS_nFirstRecordOnPage) ;
            if ( ( AV28ControlCalidad_ValoresEstandars_CCsta_SDT.size() >= AV88GXV5 ) && ( AV88GXV5 > 0 ) )
            {
               AV28ControlCalidad_ValoresEstandars_CCsta_SDT.currentItem( ((app.controlcalidadhtd.SdtControlCalidad_ValoresEstandars_CCsta_SDT_Item)AV28ControlCalidad_ValoresEstandars_CCsta_SDT.elementAt(-1+AV88GXV5)) );
            }
         }
         if ( nGXsfl_141_fel_idx == 0 )
         {
            nGXsfl_141_idx = 1 ;
            sGXsfl_141_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_141_idx), 4, 0), (short)(4), "0") ;
            subsflControlProps_1415( ) ;
         }
         nGXsfl_141_fel_idx = 1 ;
         /* Read variables values. */
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCctlin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCctlin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCCTLIN");
            GX_FocusControl = edtavCctlin_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV21CCTLin = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV21CCTLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV21CCTLin), 4, 0));
         }
         else
         {
            AV21CCTLin = (short)(localUtil.ctol( httpContext.cgiGet( edtavCctlin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV21CCTLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV21CCTLin), 4, 0));
         }
         AV23CCTLinDsc = httpContext.cgiGet( edtavCctlindsc_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV23CCTLinDsc", AV23CCTLinDsc);
         AV22CCTLinDc2 = httpContext.cgiGet( edtavCctlindc2_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV22CCTLinDc2", AV22CCTLinDc2);
         AV18CCMetodo = httpContext.cgiGet( edtavCcmetodo_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV18CCMetodo", AV18CCMetodo);
         AV17CCEspecif = httpContext.cgiGet( edtavCcespecif_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV17CCEspecif", AV17CCEspecif);
         AV24CCVal = httpContext.cgiGet( edtavCcval_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV24CCVal", AV24CCVal);
         if ( ( ( ((GXutil.strcmp(httpContext.cgiGet( chkavCcoklin.getInternalname()), "1")==0) ? 1 : 0) < 0 ) ) || ( ( ((GXutil.strcmp(httpContext.cgiGet( chkavCcoklin.getInternalname()), "1")==0) ? 1 : 0) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCCOKLIN");
            GX_FocusControl = chkavCcoklin.getInternalname() ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV5CCOkLin = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV5CCOkLin", GXutil.str( AV5CCOkLin, 1, 0));
         }
         else
         {
            AV5CCOkLin = (byte)(((GXutil.strcmp(httpContext.cgiGet( chkavCcoklin.getInternalname()), "1")==0) ? 1 : 0)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV5CCOkLin", GXutil.str( AV5CCOkLin, 1, 0));
         }
         AV96Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV96Pgmname", AV96Pgmname);
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", "hsh"+"ControlCalidad_CC1_WKP");
         AV96Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV96Pgmname", AV96Pgmname);
         forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV96Pgmname, "")));
         hsh = httpContext.cgiGet( "hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("controlcalidadhtd\\controlcalidad_cc1_wkp:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
            GxWebError = (byte)(1) ;
            httpContext.sendError( 403 );
            GXutil.writeLog("send_http_error_code 403");
            return  ;
         }
         /* Check if conditions changed and reset current page numbers */
         /* Check if conditions changed and reset current page numbers */
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
      e182CE2 ();
      if (returnInSub) return;
   }

   public void e182CE2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV7Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      controlcalidad_cc1_wkp_impl.this.GXt_char1 = GXv_char2[0] ;
      AV7Station = GXt_char1 ;
      GXv_char2[0] = AV31EmprCod ;
      GXv_char3[0] = AV6EmprNom ;
      GXv_char4[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV7Station, GXv_char2, GXv_char3, GXv_char4) ;
      controlcalidad_cc1_wkp_impl.this.AV31EmprCod = GXv_char2[0] ;
      controlcalidad_cc1_wkp_impl.this.AV6EmprNom = GXv_char3[0] ;
      controlcalidad_cc1_wkp_impl.this.AV8UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV31EmprCod", AV31EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV31EmprCod, "@!"))));
      subGrid_Rows = 10 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      Grid_empowerer_Gridinternalname = subGrid_Internalname ;
      ucGrid_empowerer.sendProperty(context, "", false, Grid_empowerer_Internalname, "GridInternalName", Grid_empowerer_Gridinternalname);
      Ddo_grid_Gridinternalname = subGrid_Internalname ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "GridInternalName", Ddo_grid_Gridinternalname);
      Form.setCaption( httpContext.getMessage( " Datos Lineas (CC1)", "") );
      httpContext.ajax_rsp_assign_prop("", false, "FORM", "Caption", Form.getCaption(), true);
      /* Execute user subroutine: 'PREPARETRANSACTION' */
      S112 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S122 ();
      if (returnInSub) return;
      if ( AV45OrderedBy < 1 )
      {
         AV45OrderedBy = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV45OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV45OrderedBy), 4, 0));
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S132 ();
         if (returnInSub) return;
      }
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = AV30DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] ;
      AV30DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, "", false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
      Gridcontrolcalidad_valoresestandars_ccsta_sdts_empowerer_Gridinternalname = subGridcontrolcalidad_valoresestandars_ccsta_sdts_Internalname ;
      ucGridcontrolcalidad_valoresestandars_ccsta_sdts_empowerer.sendProperty(context, "", false, Gridcontrolcalidad_valoresestandars_ccsta_sdts_empowerer_Internalname, "GridInternalName", Gridcontrolcalidad_valoresestandars_ccsta_sdts_empowerer_Gridinternalname);
      subGridcontrolcalidad_valoresestandars_ccsta_sdts_Rows = 10 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDCONTROLCALIDAD_VALORESESTANDARS_CCSTA_SDTS_Rows", GXutil.ltrim( localUtil.ntoc( subGridcontrolcalidad_valoresestandars_ccsta_sdts_Rows, (byte)(6), (byte)(0), ".", "")));
      Gridcontrolcalidad_valoresestandars_ccsta_sdts_titlescategories_Gridinternalname = subGridcontrolcalidad_valoresestandars_ccsta_sdts_Internalname ;
      ucGridcontrolcalidad_valoresestandars_ccsta_sdts_titlescategories.sendProperty(context, "", false, Gridcontrolcalidad_valoresestandars_ccsta_sdts_titlescategories_Internalname, "GridInternalName", Gridcontrolcalidad_valoresestandars_ccsta_sdts_titlescategories_Gridinternalname);
      Gridcontrolcalidad_ccsta_sdts_empowerer_Gridinternalname = subGridcontrolcalidad_ccsta_sdts_Internalname ;
      ucGridcontrolcalidad_ccsta_sdts_empowerer.sendProperty(context, "", false, Gridcontrolcalidad_ccsta_sdts_empowerer_Internalname, "GridInternalName", Gridcontrolcalidad_ccsta_sdts_empowerer_Gridinternalname);
      subGridcontrolcalidad_ccsta_sdts_Rows = 10 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDCONTROLCALIDAD_CCSTA_SDTS_Rows", GXutil.ltrim( localUtil.ntoc( subGridcontrolcalidad_ccsta_sdts_Rows, (byte)(6), (byte)(0), ".", "")));
      /* Using cursor H02CE4 */
      pr_default.execute(2, new Object[] {AV31EmprCod, Integer.valueOf(AV9BarCod), Byte.valueOf(AV11BarCodReo), AV10BarCodPar});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A130BarCodPar = H02CE4_A130BarCodPar[0] ;
         A132BarCodReo = H02CE4_A132BarCodReo[0] ;
         A129BarCod = H02CE4_A129BarCod[0] ;
         A396EmprCod = H02CE4_A396EmprCod[0] ;
         A252CliCod = H02CE4_A252CliCod[0] ;
         n252CliCod = H02CE4_n252CliCod[0] ;
         A212BarSer = H02CE4_A212BarSer[0] ;
         A135BarColNom = H02CE4_A135BarColNom[0] ;
         A136BarColNum = H02CE4_A136BarColNum[0] ;
         AV25clicod = A252CliCod ;
         httpContext.ajax_rsp_assign_attri("", false, "AV25clicod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV25clicod), 6, 0));
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCLICOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV25clicod), "ZZZZZ9")));
         AV15Barser = A212BarSer ;
         httpContext.ajax_rsp_assign_attri("", false, "AV15Barser", AV15Barser);
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARSER", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV15Barser, ""))));
         AV12barcolnom = A135BarColNom ;
         httpContext.ajax_rsp_assign_attri("", false, "AV12barcolnom", AV12barcolnom);
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCOLNOM", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV12barcolnom, ""))));
         AV13barcolnum = A136BarColNum ;
         httpContext.ajax_rsp_assign_attri("", false, "AV13barcolnum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13barcolnum), 6, 0));
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCOLNUM", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV13barcolnum), "ZZZZZ9")));
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(2);
      GXt_int7 = (byte)(AV71AvisoCC) ;
      GXv_int8[0] = GXt_int7 ;
      new app.pexicon(remoteHandle, context).execute( AV31EmprCod, httpContext.getMessage( "WARGCC", ""), GXv_int8) ;
      controlcalidad_cc1_wkp_impl.this.GXt_int7 = GXv_int8[0] ;
      AV71AvisoCC = GXt_int7 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV71AvisoCC", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV71AvisoCC), 4, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vAVISOCC", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV71AvisoCC), "ZZZ9")));
   }

   public void e192CE2( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
      GXv_SdtWWPContext9[0] = AV69WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext9) ;
      AV69WWPContext = GXv_SdtWWPContext9[0] ;
      /* Execute user subroutine: 'SAVEGRIDSTATE' */
      S142 ();
      if (returnInSub) return;
      AV36GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV36GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36GridCurrentPage), 10, 0));
      AV37GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV37GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV37GridPageCount), 10, 0));
      edtCCVal_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCVal_Internalname, "Columnheaderclass", edtCCVal_Columnheaderclass, !bGXsfl_154_Refreshing);
      /*  Sending Event outputs  */
   }

   public void e112CE2( )
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
         AV47PageToGo = (int)(GXutil.lval( Gridpaginationbar_Selectedpage)) ;
         subgrid_gotopage( AV47PageToGo) ;
      }
   }

   public void e122CE2( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   public void e132CE2( )
   {
      /* Ddo_grid_Onoptionclicked Routine */
      returnInSub = false ;
      if ( ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderASC#>") == 0 ) || ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>") == 0 ) )
      {
         AV45OrderedBy = (short)(GXutil.lval( Ddo_grid_Selectedvalue_get)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV45OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV45OrderedBy), 4, 0));
         AV46OrderedDsc = ((GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>")==0) ? true : false) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV46OrderedDsc", AV46OrderedDsc);
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S132 ();
         if (returnInSub) return;
         subgrid_firstpage( ) ;
      }
      else if ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#Filter#>") == 0 )
      {
         if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "CCTLin") == 0 )
         {
            AV58TFCCTLin = (short)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV58TFCCTLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV58TFCCTLin), 4, 0));
            AV59TFCCTLin_To = (short)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV59TFCCTLin_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV59TFCCTLin_To), 4, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "CCTLinDsc") == 0 )
         {
            AV62TFCCTLinDsc = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV62TFCCTLinDsc", AV62TFCCTLinDsc);
            AV63TFCCTLinDsc_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV63TFCCTLinDsc_Sel", AV63TFCCTLinDsc_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "CCTLinDc2") == 0 )
         {
            AV60TFCCTLinDc2 = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV60TFCCTLinDc2", AV60TFCCTLinDc2);
            AV61TFCCTLinDc2_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV61TFCCTLinDc2_Sel", AV61TFCCTLinDc2_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "CCMetodo") == 0 )
         {
            AV54TFCCMetodo = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV54TFCCMetodo", AV54TFCCMetodo);
            AV55TFCCMetodo_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV55TFCCMetodo_Sel", AV55TFCCMetodo_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "CCEspecif") == 0 )
         {
            AV52TFCCEspecif = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV52TFCCEspecif", AV52TFCCEspecif);
            AV53TFCCEspecif_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV53TFCCEspecif_Sel", AV53TFCCEspecif_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "CCVal") == 0 )
         {
            AV64TFCCVal = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV64TFCCVal", AV64TFCCVal);
            AV65TFCCVal_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV65TFCCVal_Sel", AV65TFCCVal_Sel);
         }
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
   }

   public void e142CE2( )
   {
      AV88GXV5 = (int)(nGXsfl_141_idx+GRIDCONTROLCALIDAD_VALORESESTANDARS_CCSTA_SDTS_nFirstRecordOnPage) ;
      if ( ( AV88GXV5 > 0 ) && ( AV28ControlCalidad_ValoresEstandars_CCsta_SDT.size() >= AV88GXV5 ) )
      {
         AV28ControlCalidad_ValoresEstandars_CCsta_SDT.currentItem( ((app.controlcalidadhtd.SdtControlCalidad_ValoresEstandars_CCsta_SDT_Item)AV28ControlCalidad_ValoresEstandars_CCsta_SDT.elementAt(-1+AV88GXV5)) );
      }
      /* 'DoLimpiarVariables' Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'LIMPIARVARIABLES' */
      S152 ();
      if (returnInSub) return;
      httpContext.doAjaxRefresh();
      /*  Sending Event outputs  */
      if ( gx_BV131 )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV26ControlCalidad_CCSTA_SDT", AV26ControlCalidad_CCSTA_SDT);
         nGXsfl_131_bak_idx = nGXsfl_131_idx ;
         gxgrgridcontrolcalidad_ccsta_sdts_refresh( subGridcontrolcalidad_ccsta_sdts_Rows, subGridcontrolcalidad_valoresestandars_ccsta_sdts_Rows, subGrid_Rows, AV96Pgmname, AV45OrderedBy, AV46OrderedDsc, AV58TFCCTLin, AV59TFCCTLin_To, AV62TFCCTLinDsc, AV63TFCCTLinDsc_Sel, AV60TFCCTLinDc2, AV61TFCCTLinDc2_Sel, AV54TFCCMetodo, AV55TFCCMetodo_Sel, AV52TFCCEspecif, AV53TFCCEspecif_Sel, AV64TFCCVal, AV65TFCCVal_Sel, AV5CCOkLin, AV31EmprCod, AV25clicod, AV15Barser, AV12barcolnom, AV13barcolnum, AV71AvisoCC, AV73CCTVal, AV9BarCod, AV11BarCodReo, AV10BarCodPar, AV48ProCod, AV14BarOrdLin, AV19CCTCod) ;
         nGXsfl_131_idx = nGXsfl_131_bak_idx ;
         sGXsfl_131_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_131_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1312( ) ;
      }
      if ( gx_BV141 )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV28ControlCalidad_ValoresEstandars_CCsta_SDT", AV28ControlCalidad_ValoresEstandars_CCsta_SDT);
         nGXsfl_141_bak_idx = nGXsfl_141_idx ;
         gxgrgridcontrolcalidad_valoresestandars_ccsta_sdts_refresh( subGridcontrolcalidad_ccsta_sdts_Rows, subGridcontrolcalidad_valoresestandars_ccsta_sdts_Rows, subGrid_Rows, AV96Pgmname, AV45OrderedBy, AV46OrderedDsc, AV58TFCCTLin, AV59TFCCTLin_To, AV62TFCCTLinDsc, AV63TFCCTLinDsc_Sel, AV60TFCCTLinDc2, AV61TFCCTLinDc2_Sel, AV54TFCCMetodo, AV55TFCCMetodo_Sel, AV52TFCCEspecif, AV53TFCCEspecif_Sel, AV64TFCCVal, AV65TFCCVal_Sel, AV5CCOkLin, AV31EmprCod, AV25clicod, AV15Barser, AV12barcolnom, AV13barcolnum, AV71AvisoCC, AV73CCTVal, AV9BarCod, AV11BarCodReo, AV10BarCodPar, AV48ProCod, AV14BarOrdLin, AV19CCTCod) ;
         nGXsfl_141_idx = nGXsfl_141_bak_idx ;
         sGXsfl_141_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_141_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1415( ) ;
      }
   }

   public void e152CE2( )
   {
      /* 'DoCerrar' Routine */
      returnInSub = false ;
      httpContext.setWebReturnParms(new Object[] {});
      httpContext.setWebReturnParmsMetadata(new Object[] {});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      returnInSub = true;
      if (true) return;
   }

   private void e202CE2( )
   {
      /* Gridcontrolcalidad_ccsta_sdts_Load Routine */
      returnInSub = false ;
      AV84GXV1 = 1 ;
      while ( AV84GXV1 <= AV26ControlCalidad_CCSTA_SDT.size() )
      {
         AV26ControlCalidad_CCSTA_SDT.currentItem( ((app.controlcalidadhtd.SdtControlCalidad_CCSTA_SDT_Item)AV26ControlCalidad_CCSTA_SDT.elementAt(-1+AV84GXV1)) );
         /* Load Method */
         if ( wbStart != -1 )
         {
            wbStart = (short)(131) ;
         }
         if ( ( subGridcontrolcalidad_ccsta_sdts_Islastpage == 1 ) || ( subGridcontrolcalidad_ccsta_sdts_Rows == 0 ) || ( ( GRIDCONTROLCALIDAD_CCSTA_SDTS_nCurrentRecord >= GRIDCONTROLCALIDAD_CCSTA_SDTS_nFirstRecordOnPage ) && ( GRIDCONTROLCALIDAD_CCSTA_SDTS_nCurrentRecord < GRIDCONTROLCALIDAD_CCSTA_SDTS_nFirstRecordOnPage + subgridcontrolcalidad_ccsta_sdts_fnc_recordsperpage( ) ) ) )
         {
            sendrow_1312( ) ;
            GRIDCONTROLCALIDAD_CCSTA_SDTS_nEOF = (byte)(0) ;
            app.GxWebStd.gx_hidden_field( httpContext, "GRIDCONTROLCALIDAD_CCSTA_SDTS_nEOF", GXutil.ltrim( localUtil.ntoc( GRIDCONTROLCALIDAD_CCSTA_SDTS_nEOF, (byte)(1), (byte)(0), ".", "")));
            if ( GRIDCONTROLCALIDAD_CCSTA_SDTS_nCurrentRecord + 1 >= subgridcontrolcalidad_ccsta_sdts_fnc_recordcount( ) )
            {
               GRIDCONTROLCALIDAD_CCSTA_SDTS_nEOF = (byte)(1) ;
               app.GxWebStd.gx_hidden_field( httpContext, "GRIDCONTROLCALIDAD_CCSTA_SDTS_nEOF", GXutil.ltrim( localUtil.ntoc( GRIDCONTROLCALIDAD_CCSTA_SDTS_nEOF, (byte)(1), (byte)(0), ".", "")));
            }
         }
         GRIDCONTROLCALIDAD_CCSTA_SDTS_nCurrentRecord = (long)(GRIDCONTROLCALIDAD_CCSTA_SDTS_nCurrentRecord+1) ;
         if ( isFullAjaxMode( ) && ! bGXsfl_131_Refreshing )
         {
            httpContext.doAjaxLoad(131, Gridcontrolcalidad_ccsta_sdtsRow);
         }
         AV84GXV1 = (int)(AV84GXV1+1) ;
      }
   }

   public void S132( )
   {
      /* 'SETDDOSORTEDSTATUS' Routine */
      returnInSub = false ;
      Ddo_grid_Sortedstatus = GXutil.trim( GXutil.str( AV45OrderedBy, 4, 0))+":"+(AV46OrderedDsc ? "DSC" : "ASC") ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SortedStatus", Ddo_grid_Sortedstatus);
   }

   public void S122( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV51Session.getValue(AV96Pgmname+"GridState"), "") == 0 )
      {
         AV38GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV96Pgmname+"GridState"), null, null);
      }
      else
      {
         AV38GridState.fromxml(AV51Session.getValue(AV96Pgmname+"GridState"), null, null);
      }
      AV45OrderedBy = AV38GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV45OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV45OrderedBy), 4, 0));
      AV46OrderedDsc = AV38GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV46OrderedDsc", AV46OrderedDsc);
      /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
      S132 ();
      if (returnInSub) return;
      AV98GXV13 = 1 ;
      while ( AV98GXV13 <= AV38GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV39GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV38GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV98GXV13));
         if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCTLIN") == 0 )
         {
            AV58TFCCTLin = (short)(GXutil.lval( AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV58TFCCTLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV58TFCCTLin), 4, 0));
            AV59TFCCTLin_To = (short)(GXutil.lval( AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV59TFCCTLin_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV59TFCCTLin_To), 4, 0));
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCTLINDSC") == 0 )
         {
            AV62TFCCTLinDsc = AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV62TFCCTLinDsc", AV62TFCCTLinDsc);
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCTLINDSC_SEL") == 0 )
         {
            AV63TFCCTLinDsc_Sel = AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV63TFCCTLinDsc_Sel", AV63TFCCTLinDsc_Sel);
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCTLINDC2") == 0 )
         {
            AV60TFCCTLinDc2 = AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV60TFCCTLinDc2", AV60TFCCTLinDc2);
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCTLINDC2_SEL") == 0 )
         {
            AV61TFCCTLinDc2_Sel = AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV61TFCCTLinDc2_Sel", AV61TFCCTLinDc2_Sel);
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCMETODO") == 0 )
         {
            AV54TFCCMetodo = AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV54TFCCMetodo", AV54TFCCMetodo);
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCMETODO_SEL") == 0 )
         {
            AV55TFCCMetodo_Sel = AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV55TFCCMetodo_Sel", AV55TFCCMetodo_Sel);
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCESPECIF") == 0 )
         {
            AV52TFCCEspecif = AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV52TFCCEspecif", AV52TFCCEspecif);
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCESPECIF_SEL") == 0 )
         {
            AV53TFCCEspecif_Sel = AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV53TFCCEspecif_Sel", AV53TFCCEspecif_Sel);
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCVAL") == 0 )
         {
            AV64TFCCVal = AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV64TFCCVal", AV64TFCCVal);
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCVAL_SEL") == 0 )
         {
            AV65TFCCVal_Sel = AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV65TFCCVal_Sel", AV65TFCCVal_Sel);
         }
         AV98GXV13 = (int)(AV98GXV13+1) ;
      }
      GXt_char1 = "" ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV63TFCCTLinDsc_Sel)==0), AV63TFCCTLinDsc_Sel, GXv_char4) ;
      controlcalidad_cc1_wkp_impl.this.GXt_char1 = GXv_char4[0] ;
      GXt_char10 = "" ;
      GXv_char3[0] = GXt_char10 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV61TFCCTLinDc2_Sel)==0), AV61TFCCTLinDc2_Sel, GXv_char3) ;
      controlcalidad_cc1_wkp_impl.this.GXt_char10 = GXv_char3[0] ;
      GXt_char11 = "" ;
      GXv_char2[0] = GXt_char11 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV55TFCCMetodo_Sel)==0), AV55TFCCMetodo_Sel, GXv_char2) ;
      controlcalidad_cc1_wkp_impl.this.GXt_char11 = GXv_char2[0] ;
      GXt_char12 = "" ;
      GXv_char13[0] = GXt_char12 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV53TFCCEspecif_Sel)==0), AV53TFCCEspecif_Sel, GXv_char13) ;
      controlcalidad_cc1_wkp_impl.this.GXt_char12 = GXv_char13[0] ;
      GXt_char14 = "" ;
      GXv_char15[0] = GXt_char14 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV65TFCCVal_Sel)==0), AV65TFCCVal_Sel, GXv_char15) ;
      controlcalidad_cc1_wkp_impl.this.GXt_char14 = GXv_char15[0] ;
      Ddo_grid_Selectedvalue_set = "|"+GXt_char1+"|"+GXt_char10+"|"+GXt_char11+"|"+GXt_char12+"|"+GXt_char14 ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      GXt_char14 = "" ;
      GXv_char15[0] = GXt_char14 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV62TFCCTLinDsc)==0), AV62TFCCTLinDsc, GXv_char15) ;
      controlcalidad_cc1_wkp_impl.this.GXt_char14 = GXv_char15[0] ;
      GXt_char12 = "" ;
      GXv_char13[0] = GXt_char12 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV60TFCCTLinDc2)==0), AV60TFCCTLinDc2, GXv_char13) ;
      controlcalidad_cc1_wkp_impl.this.GXt_char12 = GXv_char13[0] ;
      GXt_char11 = "" ;
      GXv_char4[0] = GXt_char11 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV54TFCCMetodo)==0), AV54TFCCMetodo, GXv_char4) ;
      controlcalidad_cc1_wkp_impl.this.GXt_char11 = GXv_char4[0] ;
      GXt_char10 = "" ;
      GXv_char3[0] = GXt_char10 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV52TFCCEspecif)==0), AV52TFCCEspecif, GXv_char3) ;
      controlcalidad_cc1_wkp_impl.this.GXt_char10 = GXv_char3[0] ;
      GXt_char1 = "" ;
      GXv_char2[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV64TFCCVal)==0), AV64TFCCVal, GXv_char2) ;
      controlcalidad_cc1_wkp_impl.this.GXt_char1 = GXv_char2[0] ;
      Ddo_grid_Filteredtext_set = ((0==AV58TFCCTLin) ? "" : GXutil.str( AV58TFCCTLin, 4, 0))+"|"+GXt_char14+"|"+GXt_char12+"|"+GXt_char11+"|"+GXt_char10+"|"+GXt_char1 ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = ((0==AV59TFCCTLin_To) ? "" : GXutil.str( AV59TFCCTLin_To, 4, 0))+"|||||" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
      if ( ! (GXutil.strcmp("", GXutil.trim( AV38GridState.getgxTv_SdtWWPGridState_Pagesize()))==0) )
      {
         subGrid_Rows = (int)(GXutil.lval( AV38GridState.getgxTv_SdtWWPGridState_Pagesize())) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      }
      subgrid_gotopage( AV38GridState.getgxTv_SdtWWPGridState_Currentpage()) ;
   }

   public void S142( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV38GridState.fromxml(AV51Session.getValue(AV96Pgmname+"GridState"), null, null);
      AV38GridState.setgxTv_SdtWWPGridState_Orderedby( AV45OrderedBy );
      AV38GridState.setgxTv_SdtWWPGridState_Ordereddsc( AV46OrderedDsc );
      AV38GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState16[0] = AV38GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState16, "TFCCTLIN", "", !((0==AV58TFCCTLin)&&(0==AV59TFCCTLin_To)), (short)(0), GXutil.trim( GXutil.str( AV58TFCCTLin, 4, 0)), GXutil.trim( GXutil.str( AV59TFCCTLin_To, 4, 0))) ;
      AV38GridState = GXv_SdtWWPGridState16[0] ;
      GXv_SdtWWPGridState16[0] = AV38GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState16, "TFCCTLINDSC", "", !(GXutil.strcmp("", AV62TFCCTLinDsc)==0), (short)(0), AV62TFCCTLinDsc, "", !(GXutil.strcmp("", AV63TFCCTLinDsc_Sel)==0), AV63TFCCTLinDsc_Sel, "") ;
      AV38GridState = GXv_SdtWWPGridState16[0] ;
      GXv_SdtWWPGridState16[0] = AV38GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState16, "TFCCTLINDC2", "", !(GXutil.strcmp("", AV60TFCCTLinDc2)==0), (short)(0), AV60TFCCTLinDc2, "", !(GXutil.strcmp("", AV61TFCCTLinDc2_Sel)==0), AV61TFCCTLinDc2_Sel, "") ;
      AV38GridState = GXv_SdtWWPGridState16[0] ;
      GXv_SdtWWPGridState16[0] = AV38GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState16, "TFCCMETODO", "", !(GXutil.strcmp("", AV54TFCCMetodo)==0), (short)(0), AV54TFCCMetodo, "", !(GXutil.strcmp("", AV55TFCCMetodo_Sel)==0), AV55TFCCMetodo_Sel, "") ;
      AV38GridState = GXv_SdtWWPGridState16[0] ;
      GXv_SdtWWPGridState16[0] = AV38GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState16, "TFCCESPECIF", "", !(GXutil.strcmp("", AV52TFCCEspecif)==0), (short)(0), AV52TFCCEspecif, "", !(GXutil.strcmp("", AV53TFCCEspecif_Sel)==0), AV53TFCCEspecif_Sel, "") ;
      AV38GridState = GXv_SdtWWPGridState16[0] ;
      GXv_SdtWWPGridState16[0] = AV38GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState16, "TFCCVAL", "", !(GXutil.strcmp("", AV64TFCCVal)==0), (short)(0), AV64TFCCVal, "", !(GXutil.strcmp("", AV65TFCCVal_Sel)==0), AV65TFCCVal_Sel, "") ;
      AV38GridState = GXv_SdtWWPGridState16[0] ;
      AV38GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV38GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV96Pgmname+"GridState", AV38GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S112( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV66TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV66TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV96Pgmname );
      AV66TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( true );
      AV66TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV40HTTPRequest.getScriptName()+"?"+AV40HTTPRequest.getQuerystring() );
      AV66TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "ControlCalidadHTD.ControlCalidad_CC1_TRN" );
      AV51Session.setValue("TrnContext", AV66TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   public void e162CE2( )
   {
      /* Ccval_Isvalid Routine */
      returnInSub = false ;
      lblTxtmensaje_Caption = " " ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxtmensaje_Internalname, "Caption", lblTxtmensaje_Caption, true);
      AV5CCOkLin = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV5CCOkLin", GXutil.str( AV5CCOkLin, 1, 0));
      if ( ! (GXutil.strcmp("", AV24CCVal)==0) )
      {
         GXv_char15[0] = AV44mensaje ;
         GXv_int8[0] = (byte)(AV68var_ok) ;
         GXv_char13[0] = AV43Mask ;
         new app.controlcalidadhtd.controlcalidad_cc1_auditovalorentrado(remoteHandle, context).execute( AV31EmprCod, AV9BarCod, AV11BarCodReo, AV10BarCodPar, AV48ProCod, AV14BarOrdLin, AV19CCTCod, AV21CCTLin, AV24CCVal, GXv_char15, GXv_int8, GXv_char13) ;
         controlcalidad_cc1_wkp_impl.this.AV44mensaje = GXv_char15[0] ;
         controlcalidad_cc1_wkp_impl.this.AV68var_ok = GXv_int8[0] ;
         controlcalidad_cc1_wkp_impl.this.AV43Mask = GXv_char13[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV44mensaje", AV44mensaje);
         httpContext.ajax_rsp_assign_attri("", false, "AV43Mask", AV43Mask);
         if ( ! (GXutil.strcmp("", AV44mensaje)==0) )
         {
            GX_FocusControl = edtavCcval_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            httpContext.doAjaxSetFocus(GX_FocusControl);
            httpContext.doAjaxRefresh();
            lblTxtmensaje_Caption = AV44mensaje ;
            httpContext.ajax_rsp_assign_prop("", false, lblTxtmensaje_Internalname, "Caption", lblTxtmensaje_Caption, true);
         }
         else
         {
            /* Execute user subroutine: 'CONTROLMASCARA' */
            S162 ();
            if (returnInSub) return;
            if ( ! (GXutil.strcmp("", AV44mensaje)==0) )
            {
               GX_FocusControl = edtavCcval_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               httpContext.doAjaxSetFocus(GX_FocusControl);
               httpContext.doAjaxRefresh();
               lblTxtmensaje_Caption = AV44mensaje ;
               httpContext.ajax_rsp_assign_prop("", false, lblTxtmensaje_Internalname, "Caption", lblTxtmensaje_Caption, true);
            }
            else
            {
               GXv_char15[0] = AV44mensaje ;
               GXv_int8[0] = (byte)(AV68var_ok) ;
               new app.controlcalidadhtd.controlcalidad_cc1_auditovalor_estandar(remoteHandle, context).execute( AV31EmprCod, AV25clicod, AV15Barser, AV12barcolnom, AV13barcolnum, AV9BarCod, AV11BarCodReo, AV10BarCodPar, AV48ProCod, AV14BarOrdLin, AV19CCTCod, AV21CCTLin, AV23CCTLinDsc, AV24CCVal, GXv_char15, GXv_int8) ;
               controlcalidad_cc1_wkp_impl.this.AV44mensaje = GXv_char15[0] ;
               controlcalidad_cc1_wkp_impl.this.AV68var_ok = GXv_int8[0] ;
               httpContext.ajax_rsp_assign_attri("", false, "AV44mensaje", AV44mensaje);
               if ( ( AV68var_ok == 0 ) && ( AV71AvisoCC == 0 ) )
               {
                  GX_FocusControl = edtavCcval_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  httpContext.doAjaxSetFocus(GX_FocusControl);
                  httpContext.doAjaxRefresh();
                  lblTxtmensaje_Caption = AV44mensaje ;
                  httpContext.ajax_rsp_assign_prop("", false, lblTxtmensaje_Internalname, "Caption", lblTxtmensaje_Caption, true);
               }
               AV5CCOkLin = (byte)(AV68var_ok) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV5CCOkLin", GXutil.str( AV5CCOkLin, 1, 0));
            }
         }
      }
      /*  Sending Event outputs  */
   }

   public void e232CE2( )
   {
      AV88GXV5 = (int)(nGXsfl_141_idx+GRIDCONTROLCALIDAD_VALORESESTANDARS_CCSTA_SDTS_nFirstRecordOnPage) ;
      if ( ( AV88GXV5 > 0 ) && ( AV28ControlCalidad_ValoresEstandars_CCsta_SDT.size() >= AV88GXV5 ) )
      {
         AV28ControlCalidad_ValoresEstandars_CCsta_SDT.currentItem( ((app.controlcalidadhtd.SdtControlCalidad_ValoresEstandars_CCsta_SDT_Item)AV28ControlCalidad_ValoresEstandars_CCsta_SDT.elementAt(-1+AV88GXV5)) );
      }
      /* CCTLin_Click Routine */
      returnInSub = false ;
      lblTxtmensaje_Caption = " " ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxtmensaje_Internalname, "Caption", lblTxtmensaje_Caption, true);
      GXv_char15[0] = AV18CCMetodo ;
      GXv_char13[0] = AV17CCEspecif ;
      GXv_char4[0] = AV24CCVal ;
      GXv_int8[0] = AV5CCOkLin ;
      GXv_char3[0] = AV23CCTLinDsc ;
      GXv_char2[0] = AV22CCTLinDc2 ;
      GXv_char17[0] = AV43Mask ;
      new app.controlcalidadhtd.controlcalidad_cc1_get(remoteHandle, context).execute( AV31EmprCod, AV9BarCod, AV11BarCodReo, AV10BarCodPar, AV48ProCod, AV14BarOrdLin, AV19CCTCod, A4034CCTLin, GXv_char15, GXv_char13, GXv_char4, GXv_int8, GXv_char3, GXv_char2, GXv_char17) ;
      controlcalidad_cc1_wkp_impl.this.AV18CCMetodo = GXv_char15[0] ;
      controlcalidad_cc1_wkp_impl.this.AV17CCEspecif = GXv_char13[0] ;
      controlcalidad_cc1_wkp_impl.this.AV24CCVal = GXv_char4[0] ;
      controlcalidad_cc1_wkp_impl.this.AV5CCOkLin = GXv_int8[0] ;
      controlcalidad_cc1_wkp_impl.this.AV23CCTLinDsc = GXv_char3[0] ;
      controlcalidad_cc1_wkp_impl.this.AV22CCTLinDc2 = GXv_char2[0] ;
      controlcalidad_cc1_wkp_impl.this.AV43Mask = GXv_char17[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18CCMetodo", AV18CCMetodo);
      httpContext.ajax_rsp_assign_attri("", false, "AV17CCEspecif", AV17CCEspecif);
      httpContext.ajax_rsp_assign_attri("", false, "AV24CCVal", AV24CCVal);
      httpContext.ajax_rsp_assign_attri("", false, "AV5CCOkLin", GXutil.str( AV5CCOkLin, 1, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV23CCTLinDsc", AV23CCTLinDsc);
      httpContext.ajax_rsp_assign_attri("", false, "AV22CCTLinDc2", AV22CCTLinDc2);
      httpContext.ajax_rsp_assign_attri("", false, "AV43Mask", AV43Mask);
      AV21CCTLin = A4034CCTLin ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21CCTLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV21CCTLin), 4, 0));
      /* Execute user subroutine: 'VALORES' */
      S172 ();
      if (returnInSub) return;
      httpContext.doAjaxRefresh();
      /*  Sending Event outputs  */
      if ( gx_BV131 )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV26ControlCalidad_CCSTA_SDT", AV26ControlCalidad_CCSTA_SDT);
         nGXsfl_131_bak_idx = nGXsfl_131_idx ;
         gxgrgridcontrolcalidad_ccsta_sdts_refresh( subGridcontrolcalidad_ccsta_sdts_Rows, subGridcontrolcalidad_valoresestandars_ccsta_sdts_Rows, subGrid_Rows, AV96Pgmname, AV45OrderedBy, AV46OrderedDsc, AV58TFCCTLin, AV59TFCCTLin_To, AV62TFCCTLinDsc, AV63TFCCTLinDsc_Sel, AV60TFCCTLinDc2, AV61TFCCTLinDc2_Sel, AV54TFCCMetodo, AV55TFCCMetodo_Sel, AV52TFCCEspecif, AV53TFCCEspecif_Sel, AV64TFCCVal, AV65TFCCVal_Sel, AV5CCOkLin, AV31EmprCod, AV25clicod, AV15Barser, AV12barcolnom, AV13barcolnum, AV71AvisoCC, AV73CCTVal, AV9BarCod, AV11BarCodReo, AV10BarCodPar, AV48ProCod, AV14BarOrdLin, AV19CCTCod) ;
         nGXsfl_131_idx = nGXsfl_131_bak_idx ;
         sGXsfl_131_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_131_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1312( ) ;
      }
      if ( gx_BV141 )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV28ControlCalidad_ValoresEstandars_CCsta_SDT", AV28ControlCalidad_ValoresEstandars_CCsta_SDT);
         nGXsfl_141_bak_idx = nGXsfl_141_idx ;
         gxgrgridcontrolcalidad_valoresestandars_ccsta_sdts_refresh( subGridcontrolcalidad_ccsta_sdts_Rows, subGridcontrolcalidad_valoresestandars_ccsta_sdts_Rows, subGrid_Rows, AV96Pgmname, AV45OrderedBy, AV46OrderedDsc, AV58TFCCTLin, AV59TFCCTLin_To, AV62TFCCTLinDsc, AV63TFCCTLinDsc_Sel, AV60TFCCTLinDc2, AV61TFCCTLinDc2_Sel, AV54TFCCMetodo, AV55TFCCMetodo_Sel, AV52TFCCEspecif, AV53TFCCEspecif_Sel, AV64TFCCVal, AV65TFCCVal_Sel, AV5CCOkLin, AV31EmprCod, AV25clicod, AV15Barser, AV12barcolnom, AV13barcolnum, AV71AvisoCC, AV73CCTVal, AV9BarCod, AV11BarCodReo, AV10BarCodPar, AV48ProCod, AV14BarOrdLin, AV19CCTCod) ;
         nGXsfl_141_idx = nGXsfl_141_bak_idx ;
         sGXsfl_141_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_141_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1415( ) ;
      }
   }

   public void GXEnter( )
   {
      /* Execute user event: Enter */
      e172CE2 ();
      if (returnInSub) return;
   }

   public void e172CE2( )
   {
      AV88GXV5 = (int)(nGXsfl_141_idx+GRIDCONTROLCALIDAD_VALORESESTANDARS_CCSTA_SDTS_nFirstRecordOnPage) ;
      if ( ( AV88GXV5 > 0 ) && ( AV28ControlCalidad_ValoresEstandars_CCsta_SDT.size() >= AV88GXV5 ) )
      {
         AV28ControlCalidad_ValoresEstandars_CCsta_SDT.currentItem( ((app.controlcalidadhtd.SdtControlCalidad_ValoresEstandars_CCsta_SDT_Item)AV28ControlCalidad_ValoresEstandars_CCsta_SDT.elementAt(-1+AV88GXV5)) );
      }
      /* Enter Routine */
      returnInSub = false ;
      lblTxtmensaje_Caption = " " ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxtmensaje_Internalname, "Caption", lblTxtmensaje_Caption, true);
      AV72confirmamos = (short)(1) ;
      if ( (0==AV21CCTLin) )
      {
         AV44mensaje = httpContext.getMessage( "NO ha seleccionado linea", "") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV44mensaje", AV44mensaje);
         AV72confirmamos = (short)(0) ;
      }
      if ( ! (GXutil.strcmp("", AV24CCVal)==0) && ! (0==AV21CCTLin) )
      {
         GXv_char17[0] = AV44mensaje ;
         GXv_int8[0] = (byte)(AV68var_ok) ;
         GXv_char15[0] = AV43Mask ;
         new app.controlcalidadhtd.controlcalidad_cc1_auditovalorentrado(remoteHandle, context).execute( AV31EmprCod, AV9BarCod, AV11BarCodReo, AV10BarCodPar, AV48ProCod, AV14BarOrdLin, AV19CCTCod, AV21CCTLin, AV24CCVal, GXv_char17, GXv_int8, GXv_char15) ;
         controlcalidad_cc1_wkp_impl.this.AV44mensaje = GXv_char17[0] ;
         controlcalidad_cc1_wkp_impl.this.AV68var_ok = GXv_int8[0] ;
         controlcalidad_cc1_wkp_impl.this.AV43Mask = GXv_char15[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV44mensaje", AV44mensaje);
         httpContext.ajax_rsp_assign_attri("", false, "AV43Mask", AV43Mask);
         if ( ! (GXutil.strcmp("", AV44mensaje)==0) )
         {
            AV72confirmamos = (short)(0) ;
         }
         else
         {
            /* Execute user subroutine: 'CONTROLMASCARA' */
            S162 ();
            if (returnInSub) return;
            if ( ! (GXutil.strcmp("", AV44mensaje)==0) )
            {
               AV72confirmamos = (short)(0) ;
            }
            else
            {
               AV44mensaje = "" ;
               httpContext.ajax_rsp_assign_attri("", false, "AV44mensaje", AV44mensaje);
               GXv_char17[0] = AV44mensaje ;
               GXv_int8[0] = (byte)(AV68var_ok) ;
               new app.controlcalidadhtd.controlcalidad_cc1_auditovalor_estandar(remoteHandle, context).execute( AV31EmprCod, AV25clicod, AV15Barser, AV12barcolnom, AV13barcolnum, AV9BarCod, AV11BarCodReo, AV10BarCodPar, AV48ProCod, AV14BarOrdLin, AV19CCTCod, AV21CCTLin, AV23CCTLinDsc, AV24CCVal, GXv_char17, GXv_int8) ;
               controlcalidad_cc1_wkp_impl.this.AV44mensaje = GXv_char17[0] ;
               controlcalidad_cc1_wkp_impl.this.AV68var_ok = GXv_int8[0] ;
               httpContext.ajax_rsp_assign_attri("", false, "AV44mensaje", AV44mensaje);
               if ( ( AV68var_ok == 0 ) && ( AV71AvisoCC == 0 ) )
               {
                  AV72confirmamos = (short)(0) ;
               }
               else
               {
                  if ( ! (GXutil.strcmp("", AV44mensaje)==0) )
                  {
                     httpContext.popup(formatLink("app.aviso", new String[] {GXutil.URLEncode(GXutil.rtrim(AV44mensaje))}, new String[] {"Mensaje"}) , new Object[] {});
                  }
               }
            }
         }
      }
      if ( AV72confirmamos == 1 )
      {
         AV5CCOkLin = (byte)(((GXutil.strcmp("", AV24CCVal)==0) ? 0 : AV5CCOkLin)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV5CCOkLin", GXutil.str( AV5CCOkLin, 1, 0));
         new app.controlcalidadhtd.controlcalidad_cc1_upd(remoteHandle, context).execute( AV31EmprCod, AV9BarCod, AV11BarCodReo, AV10BarCodPar, AV48ProCod, AV14BarOrdLin, AV19CCTCod, AV21CCTLin, AV18CCMetodo, AV17CCEspecif, AV24CCVal, AV5CCOkLin) ;
         /* Execute user subroutine: 'LIMPIARVARIABLES' */
         S152 ();
         if (returnInSub) return;
         httpContext.doAjaxRefresh();
      }
      else
      {
         GX_FocusControl = edtavCcval_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         httpContext.doAjaxSetFocus(GX_FocusControl);
         lblTxtmensaje_Caption = AV44mensaje ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxtmensaje_Internalname, "Caption", lblTxtmensaje_Caption, true);
      }
      /*  Sending Event outputs  */
      if ( gx_BV131 )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV26ControlCalidad_CCSTA_SDT", AV26ControlCalidad_CCSTA_SDT);
         nGXsfl_131_bak_idx = nGXsfl_131_idx ;
         gxgrgridcontrolcalidad_ccsta_sdts_refresh( subGridcontrolcalidad_ccsta_sdts_Rows, subGridcontrolcalidad_valoresestandars_ccsta_sdts_Rows, subGrid_Rows, AV96Pgmname, AV45OrderedBy, AV46OrderedDsc, AV58TFCCTLin, AV59TFCCTLin_To, AV62TFCCTLinDsc, AV63TFCCTLinDsc_Sel, AV60TFCCTLinDc2, AV61TFCCTLinDc2_Sel, AV54TFCCMetodo, AV55TFCCMetodo_Sel, AV52TFCCEspecif, AV53TFCCEspecif_Sel, AV64TFCCVal, AV65TFCCVal_Sel, AV5CCOkLin, AV31EmprCod, AV25clicod, AV15Barser, AV12barcolnom, AV13barcolnum, AV71AvisoCC, AV73CCTVal, AV9BarCod, AV11BarCodReo, AV10BarCodPar, AV48ProCod, AV14BarOrdLin, AV19CCTCod) ;
         nGXsfl_131_idx = nGXsfl_131_bak_idx ;
         sGXsfl_131_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_131_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1312( ) ;
      }
      if ( gx_BV141 )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV28ControlCalidad_ValoresEstandars_CCsta_SDT", AV28ControlCalidad_ValoresEstandars_CCsta_SDT);
         nGXsfl_141_bak_idx = nGXsfl_141_idx ;
         gxgrgridcontrolcalidad_valoresestandars_ccsta_sdts_refresh( subGridcontrolcalidad_ccsta_sdts_Rows, subGridcontrolcalidad_valoresestandars_ccsta_sdts_Rows, subGrid_Rows, AV96Pgmname, AV45OrderedBy, AV46OrderedDsc, AV58TFCCTLin, AV59TFCCTLin_To, AV62TFCCTLinDsc, AV63TFCCTLinDsc_Sel, AV60TFCCTLinDc2, AV61TFCCTLinDc2_Sel, AV54TFCCMetodo, AV55TFCCMetodo_Sel, AV52TFCCEspecif, AV53TFCCEspecif_Sel, AV64TFCCVal, AV65TFCCVal_Sel, AV5CCOkLin, AV31EmprCod, AV25clicod, AV15Barser, AV12barcolnom, AV13barcolnum, AV71AvisoCC, AV73CCTVal, AV9BarCod, AV11BarCodReo, AV10BarCodPar, AV48ProCod, AV14BarOrdLin, AV19CCTCod) ;
         nGXsfl_141_idx = nGXsfl_141_bak_idx ;
         sGXsfl_141_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_141_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1415( ) ;
      }
   }

   public void S182( )
   {
      /* 'PICTURETOREGEXNUMBER' Routine */
      returnInSub = false ;
      AV50Regex = "^" ;
      AV41i = (short)(1) ;
      while ( AV41i <= GXutil.len( AV43Mask) )
      {
         AV16c = GXutil.substring( AV43Mask, AV41i, 1) ;
         if ( GXutil.strcmp(AV16c, "9") == 0 )
         {
            AV50Regex += httpContext.getMessage( "\\d", "") ;
         }
         else if ( GXutil.strcmp(AV16c, httpContext.getMessage( "Z", "")) == 0 )
         {
            AV50Regex += httpContext.getMessage( "\\d?", "") ;
         }
         else if ( GXutil.strcmp(AV16c, "#") == 0 )
         {
            AV50Regex += httpContext.getMessage( "\\d?", "") ;
         }
         else if ( GXutil.strcmp(AV16c, ".") == 0 )
         {
            AV50Regex += "\\." ;
         }
         else if ( GXutil.strcmp(AV16c, ",") == 0 )
         {
            AV50Regex += "," ;
         }
         else
         {
            AV50Regex += AV16c ;
         }
         AV41i = (short)(AV41i+1) ;
      }
      AV50Regex += "$" ;
   }

   public void S172( )
   {
      /* 'VALORES' Routine */
      returnInSub = false ;
      AV26ControlCalidad_CCSTA_SDT.clear();
      gx_BV131 = true ;
      GXt_objcol_SdtControlCalidad_ValoresEstandars_CCsta_SDT_Item18 = AV28ControlCalidad_ValoresEstandars_CCsta_SDT ;
      GXv_objcol_SdtControlCalidad_ValoresEstandars_CCsta_SDT_Item19[0] = GXt_objcol_SdtControlCalidad_ValoresEstandars_CCsta_SDT_Item18 ;
      new app.controlcalidadhtd.controlcalidad_valoresestandars_ccsta_dp(remoteHandle, context).execute( AV31EmprCod, AV25clicod, AV15Barser, AV12barcolnom, AV13barcolnum, AV19CCTCod, AV21CCTLin, GXv_objcol_SdtControlCalidad_ValoresEstandars_CCsta_SDT_Item19) ;
      GXt_objcol_SdtControlCalidad_ValoresEstandars_CCsta_SDT_Item18 = GXv_objcol_SdtControlCalidad_ValoresEstandars_CCsta_SDT_Item19[0] ;
      AV28ControlCalidad_ValoresEstandars_CCsta_SDT = GXt_objcol_SdtControlCalidad_ValoresEstandars_CCsta_SDT_Item18 ;
      gx_BV141 = true ;
      /* Using cursor H02CE5 */
      pr_default.execute(3, new Object[] {AV31EmprCod, Integer.valueOf(AV19CCTCod), Short.valueOf(AV21CCTLin)});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A4034CCTLin = H02CE5_A4034CCTLin[0] ;
         A4031CCTCod = H02CE5_A4031CCTCod[0] ;
         A396EmprCod = H02CE5_A396EmprCod[0] ;
         A4049CCTValLin = H02CE5_A4049CCTValLin[0] ;
         A4051CCTVal = H02CE5_A4051CCTVal[0] ;
         A4050CCTValDsc = H02CE5_A4050CCTValDsc[0] ;
         AV27ControlCalidad_CCSTA_SDT_item = (app.controlcalidadhtd.SdtControlCalidad_CCSTA_SDT_Item)new app.controlcalidadhtd.SdtControlCalidad_CCSTA_SDT_Item(remoteHandle, context);
         AV27ControlCalidad_CCSTA_SDT_item.setgxTv_SdtControlCalidad_CCSTA_SDT_Item_Cctvallin( A4049CCTValLin );
         AV27ControlCalidad_CCSTA_SDT_item.setgxTv_SdtControlCalidad_CCSTA_SDT_Item_Cctval( A4051CCTVal );
         AV27ControlCalidad_CCSTA_SDT_item.setgxTv_SdtControlCalidad_CCSTA_SDT_Item_Cctvaldsc( A4050CCTValDsc );
         AV26ControlCalidad_CCSTA_SDT.add(AV27ControlCalidad_CCSTA_SDT_item, 0);
         gx_BV131 = true ;
         pr_default.readNext(3);
      }
      pr_default.close(3);
   }

   public void S152( )
   {
      /* 'LIMPIARVARIABLES' Routine */
      returnInSub = false ;
      AV21CCTLin = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21CCTLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV21CCTLin), 4, 0));
      AV17CCEspecif = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17CCEspecif", AV17CCEspecif);
      AV18CCMetodo = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18CCMetodo", AV18CCMetodo);
      AV5CCOkLin = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV5CCOkLin", GXutil.str( AV5CCOkLin, 1, 0));
      AV22CCTLinDc2 = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV22CCTLinDc2", AV22CCTLinDc2);
      AV23CCTLinDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV23CCTLinDsc", AV23CCTLinDsc);
      AV24CCVal = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV24CCVal", AV24CCVal);
      lblTxtmensaje_Caption = " " ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxtmensaje_Internalname, "Caption", lblTxtmensaje_Caption, true);
      /* Execute user subroutine: 'VALORES' */
      S172 ();
      if (returnInSub) return;
   }

   public void S162( )
   {
      /* 'CONTROLMASCARA' Routine */
      returnInSub = false ;
      AV80PosPunto = (short)(GXutil.strSearch( AV43Mask, ".", 1)) ;
      AV79Length = DecimalUtil.doubleToDec(GXutil.len( AV43Mask)) ;
      if ( AV80PosPunto > 0 )
      {
         AV78EnterosPermitidos = (short)(AV80PosPunto-1) ;
         AV77DecimalesPermitidos = (short)(DecimalUtil.decToDouble(AV79Length.subtract(DecimalUtil.doubleToDec(AV80PosPunto)))) ;
      }
      else
      {
         AV78EnterosPermitidos = (short)(DecimalUtil.decToDouble(AV79Length)) ;
         AV77DecimalesPermitidos = (short)(0) ;
      }
      AV81PosPuntoValor = (short)(GXutil.strSearch( AV73CCTVal, ".", 1)) ;
      AV79Length = DecimalUtil.doubleToDec(GXutil.len( AV73CCTVal)) ;
      if ( AV81PosPuntoValor > 0 )
      {
         AV75CantEnteros = (short)(AV81PosPuntoValor-1) ;
         AV74CantDecimales = (short)(DecimalUtil.decToDouble(AV79Length.subtract(DecimalUtil.doubleToDec(AV81PosPuntoValor)))) ;
      }
      else
      {
         AV75CantEnteros = (short)(DecimalUtil.decToDouble(AV79Length)) ;
         AV74CantDecimales = (short)(0) ;
      }
      if ( AV75CantEnteros > AV78EnterosPermitidos )
      {
         AV44mensaje = (GXutil.format( httpContext.getMessage( "Máximo %1 enteros", ""), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV78EnterosPermitidos), 4, 0), "", "", "", "", "", "", "", "")) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV44mensaje", AV44mensaje);
      }
      if ( AV74CantDecimales > AV77DecimalesPermitidos )
      {
         AV44mensaje = (GXutil.format( httpContext.getMessage( "Máximo %1 decimales", ""), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV77DecimalesPermitidos), 4, 0), "", "", "", "", "", "", "", "")) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV44mensaje", AV44mensaje);
      }
   }

   private void e222CE4( )
   {
      /* Grid_Load Routine */
      returnInSub = false ;
      AV76CCOkLingrid = ((A12750CCOkLin==1) ? true : false) ;
      httpContext.ajax_rsp_assign_attri("", false, chkavCcoklingrid.getInternalname(), AV76CCOkLingrid);
      edtCCVal_Columnclass = ((A12750CCOkLin==0)&&!(GXutil.strcmp("", A4035CCVal)==0) ? "WWColumn WWColumnDanger WWColumnDangerSingleCell" : "WWColumn") ;
      /* Load Method */
      if ( wbStart != -1 )
      {
         wbStart = (short)(154) ;
      }
      sendrow_1544( ) ;
      GRID_nCurrentRecord = (long)(GRID_nCurrentRecord+1) ;
      if ( isFullAjaxMode( ) && ! bGXsfl_154_Refreshing )
      {
         httpContext.doAjaxLoad(154, GridRow);
      }
      /*  Sending Event outputs  */
   }

   public void e242CE4( )
   {
      /* Grid_Refresh Routine */
      returnInSub = false ;
      AV100Controlcalidadhtd_controlcalidad_cc1_wkpds_1_tfcctlin = AV58TFCCTLin ;
      AV101Controlcalidadhtd_controlcalidad_cc1_wkpds_2_tfcctlin_to = AV59TFCCTLin_To ;
      AV102Controlcalidadhtd_controlcalidad_cc1_wkpds_3_tfcctlindsc = AV62TFCCTLinDsc ;
      AV103Controlcalidadhtd_controlcalidad_cc1_wkpds_4_tfcctlindsc_sel = AV63TFCCTLinDsc_Sel ;
      AV104Controlcalidadhtd_controlcalidad_cc1_wkpds_5_tfcctlindc2 = AV60TFCCTLinDc2 ;
      AV105Controlcalidadhtd_controlcalidad_cc1_wkpds_6_tfcctlindc2_sel = AV61TFCCTLinDc2_Sel ;
      AV106Controlcalidadhtd_controlcalidad_cc1_wkpds_7_tfccmetodo = AV54TFCCMetodo ;
      AV107Controlcalidadhtd_controlcalidad_cc1_wkpds_8_tfccmetodo_sel = AV55TFCCMetodo_Sel ;
      AV108Controlcalidadhtd_controlcalidad_cc1_wkpds_9_tfccespecif = AV52TFCCEspecif ;
      AV109Controlcalidadhtd_controlcalidad_cc1_wkpds_10_tfccespecif_sel = AV53TFCCEspecif_Sel ;
      AV110Controlcalidadhtd_controlcalidad_cc1_wkpds_11_tfccval = AV64TFCCVal ;
      AV111Controlcalidadhtd_controlcalidad_cc1_wkpds_12_tfccval_sel = AV65TFCCVal_Sel ;
   }

   private void e212CE5( )
   {
      /* Gridcontrolcalidad_valoresestandars_ccsta_sdts_Load Routine */
      returnInSub = false ;
      AV88GXV5 = 1 ;
      while ( AV88GXV5 <= AV28ControlCalidad_ValoresEstandars_CCsta_SDT.size() )
      {
         AV28ControlCalidad_ValoresEstandars_CCsta_SDT.currentItem( ((app.controlcalidadhtd.SdtControlCalidad_ValoresEstandars_CCsta_SDT_Item)AV28ControlCalidad_ValoresEstandars_CCsta_SDT.elementAt(-1+AV88GXV5)) );
         /* Load Method */
         if ( wbStart != -1 )
         {
            wbStart = (short)(141) ;
         }
         if ( ( subGridcontrolcalidad_valoresestandars_ccsta_sdts_Islastpage == 1 ) || ( subGridcontrolcalidad_valoresestandars_ccsta_sdts_Rows == 0 ) || ( ( GRIDCONTROLCALIDAD_VALORESESTANDARS_CCSTA_SDTS_nCurrentRecord >= GRIDCONTROLCALIDAD_VALORESESTANDARS_CCSTA_SDTS_nFirstRecordOnPage ) && ( GRIDCONTROLCALIDAD_VALORESESTANDARS_CCSTA_SDTS_nCurrentRecord < GRIDCONTROLCALIDAD_VALORESESTANDARS_CCSTA_SDTS_nFirstRecordOnPage + subgridcontrolcalidad_valoresestandars_ccsta_sdts_fnc_recordsperpage( ) ) ) )
         {
            sendrow_1415( ) ;
            GRIDCONTROLCALIDAD_VALORESESTANDARS_CCSTA_SDTS_nEOF = (byte)(0) ;
            app.GxWebStd.gx_hidden_field( httpContext, "GRIDCONTROLCALIDAD_VALORESESTANDARS_CCSTA_SDTS_nEOF", GXutil.ltrim( localUtil.ntoc( GRIDCONTROLCALIDAD_VALORESESTANDARS_CCSTA_SDTS_nEOF, (byte)(1), (byte)(0), ".", "")));
            if ( GRIDCONTROLCALIDAD_VALORESESTANDARS_CCSTA_SDTS_nCurrentRecord + 1 >= subgridcontrolcalidad_valoresestandars_ccsta_sdts_fnc_recordcount( ) )
            {
               GRIDCONTROLCALIDAD_VALORESESTANDARS_CCSTA_SDTS_nEOF = (byte)(1) ;
               app.GxWebStd.gx_hidden_field( httpContext, "GRIDCONTROLCALIDAD_VALORESESTANDARS_CCSTA_SDTS_nEOF", GXutil.ltrim( localUtil.ntoc( GRIDCONTROLCALIDAD_VALORESESTANDARS_CCSTA_SDTS_nEOF, (byte)(1), (byte)(0), ".", "")));
            }
         }
         GRIDCONTROLCALIDAD_VALORESESTANDARS_CCSTA_SDTS_nCurrentRecord = (long)(GRIDCONTROLCALIDAD_VALORESESTANDARS_CCSTA_SDTS_nCurrentRecord+1) ;
         if ( isFullAjaxMode( ) && ! bGXsfl_141_Refreshing )
         {
            httpContext.doAjaxLoad(141, Gridcontrolcalidad_valoresestandars_ccsta_sdtsRow);
         }
         AV88GXV5 = (int)(AV88GXV5+1) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV31EmprCod = (String)getParm(obj,0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV31EmprCod", AV31EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV31EmprCod, "@!"))));
      AV9BarCod = ((Number) GXutil.testNumericType( getParm(obj,1), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9BarCod), 8, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV9BarCod), "ZZZZZZZ9")));
      AV11BarCodReo = ((Number) GXutil.testNumericType( getParm(obj,2), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV11BarCodReo", GXutil.str( AV11BarCodReo, 1, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODREO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV11BarCodReo), "9")));
      AV10BarCodPar = (String)getParm(obj,3) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10BarCodPar", AV10BarCodPar);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODPAR", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV10BarCodPar, ""))));
      AV48ProCod = (String)getParm(obj,4) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV48ProCod", AV48ProCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPROCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV48ProCod, ""))));
      AV49ProDsc = (String)getParm(obj,5) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV49ProDsc", AV49ProDsc);
      AV14BarOrdLin = ((Number) GXutil.testNumericType( getParm(obj,6), TypeConstants.SHORT)).shortValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14BarOrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14BarOrdLin), 4, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARORDLIN", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV14BarOrdLin), "ZZZ9")));
      AV32FasCod = (String)getParm(obj,7) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32FasCod", AV32FasCod);
      AV33FasDsc = (String)getParm(obj,8) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV33FasDsc", AV33FasDsc);
      AV19CCTCod = ((Number) GXutil.testNumericType( getParm(obj,9), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19CCTCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19CCTCod), 6, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCCTCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV19CCTCod), "ZZZZZ9")));
      AV20CCTDsc = (String)getParm(obj,10) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20CCTDsc", AV20CCTDsc);
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
      pa2CE2( ) ;
      ws2CE2( ) ;
      we2CE2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682116155010", true, true);
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
      httpContext.AddJavascriptSource("controlcalidadhtd/controlcalidad_cc1_wkp.js", "?202682116155010", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
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
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridTitlesCategories/GridTitlesCategoriesRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void subsflControlProps_1312( )
   {
      edtavControlcalidad_ccsta_sdt__cctvallin_Internalname = "CONTROLCALIDAD_CCSTA_SDT__CCTVALLIN_"+sGXsfl_131_idx ;
      edtavControlcalidad_ccsta_sdt__cctvaldsc_Internalname = "CONTROLCALIDAD_CCSTA_SDT__CCTVALDSC_"+sGXsfl_131_idx ;
      edtavControlcalidad_ccsta_sdt__cctval_Internalname = "CONTROLCALIDAD_CCSTA_SDT__CCTVAL_"+sGXsfl_131_idx ;
   }

   public void subsflControlProps_fel_1312( )
   {
      edtavControlcalidad_ccsta_sdt__cctvallin_Internalname = "CONTROLCALIDAD_CCSTA_SDT__CCTVALLIN_"+sGXsfl_131_fel_idx ;
      edtavControlcalidad_ccsta_sdt__cctvaldsc_Internalname = "CONTROLCALIDAD_CCSTA_SDT__CCTVALDSC_"+sGXsfl_131_fel_idx ;
      edtavControlcalidad_ccsta_sdt__cctval_Internalname = "CONTROLCALIDAD_CCSTA_SDT__CCTVAL_"+sGXsfl_131_fel_idx ;
   }

   public void sendrow_1312( )
   {
      subsflControlProps_1312( ) ;
      wb2CE0( ) ;
      if ( ( subGridcontrolcalidad_ccsta_sdts_Rows * 1 == 0 ) || ( nGXsfl_131_idx <= subgridcontrolcalidad_ccsta_sdts_fnc_recordsperpage( ) * 1 ) )
      {
         Gridcontrolcalidad_ccsta_sdtsRow = GXWebRow.GetNew(context,Gridcontrolcalidad_ccsta_sdtsContainer) ;
         if ( subGridcontrolcalidad_ccsta_sdts_Backcolorstyle == 0 )
         {
            /* None style subfile background logic. */
            subGridcontrolcalidad_ccsta_sdts_Backstyle = (byte)(0) ;
            if ( GXutil.strcmp(subGridcontrolcalidad_ccsta_sdts_Class, "") != 0 )
            {
               subGridcontrolcalidad_ccsta_sdts_Linesclass = subGridcontrolcalidad_ccsta_sdts_Class+"Odd" ;
            }
         }
         else if ( subGridcontrolcalidad_ccsta_sdts_Backcolorstyle == 1 )
         {
            /* Uniform style subfile background logic. */
            subGridcontrolcalidad_ccsta_sdts_Backstyle = (byte)(0) ;
            subGridcontrolcalidad_ccsta_sdts_Backcolor = subGridcontrolcalidad_ccsta_sdts_Allbackcolor ;
            if ( GXutil.strcmp(subGridcontrolcalidad_ccsta_sdts_Class, "") != 0 )
            {
               subGridcontrolcalidad_ccsta_sdts_Linesclass = subGridcontrolcalidad_ccsta_sdts_Class+"Uniform" ;
            }
         }
         else if ( subGridcontrolcalidad_ccsta_sdts_Backcolorstyle == 2 )
         {
            /* Header style subfile background logic. */
            subGridcontrolcalidad_ccsta_sdts_Backstyle = (byte)(1) ;
            if ( GXutil.strcmp(subGridcontrolcalidad_ccsta_sdts_Class, "") != 0 )
            {
               subGridcontrolcalidad_ccsta_sdts_Linesclass = subGridcontrolcalidad_ccsta_sdts_Class+"Odd" ;
            }
            subGridcontrolcalidad_ccsta_sdts_Backcolor = (int)(0x0) ;
         }
         else if ( subGridcontrolcalidad_ccsta_sdts_Backcolorstyle == 3 )
         {
            /* Report style subfile background logic. */
            subGridcontrolcalidad_ccsta_sdts_Backstyle = (byte)(1) ;
            if ( ((int)((nGXsfl_131_idx) % (2))) == 0 )
            {
               subGridcontrolcalidad_ccsta_sdts_Backcolor = (int)(0x0) ;
               if ( GXutil.strcmp(subGridcontrolcalidad_ccsta_sdts_Class, "") != 0 )
               {
                  subGridcontrolcalidad_ccsta_sdts_Linesclass = subGridcontrolcalidad_ccsta_sdts_Class+"Even" ;
               }
            }
            else
            {
               subGridcontrolcalidad_ccsta_sdts_Backcolor = (int)(0x0) ;
               if ( GXutil.strcmp(subGridcontrolcalidad_ccsta_sdts_Class, "") != 0 )
               {
                  subGridcontrolcalidad_ccsta_sdts_Linesclass = subGridcontrolcalidad_ccsta_sdts_Class+"Odd" ;
               }
            }
         }
         if ( Gridcontrolcalidad_ccsta_sdtsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<tr ") ;
            httpContext.writeText( " class=\""+"GridNoBorder WorkWith"+"\" style=\""+""+"\"") ;
            httpContext.writeText( " gxrow=\""+sGXsfl_131_idx+"\">") ;
         }
         /* Subfile cell */
         if ( Gridcontrolcalidad_ccsta_sdtsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Gridcontrolcalidad_ccsta_sdtsRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavControlcalidad_ccsta_sdt__cctvallin_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.controlcalidadhtd.SdtControlCalidad_CCSTA_SDT_Item)AV26ControlCalidad_CCSTA_SDT.elementAt(-1+AV84GXV1)).getgxTv_SdtControlCalidad_CCSTA_SDT_Item_Cctvallin(), (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavControlcalidad_ccsta_sdt__cctvallin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.controlcalidadhtd.SdtControlCalidad_CCSTA_SDT_Item)AV26ControlCalidad_CCSTA_SDT.elementAt(-1+AV84GXV1)).getgxTv_SdtControlCalidad_CCSTA_SDT_Item_Cctvallin()), "Z9") : localUtil.format( DecimalUtil.doubleToDec(((app.controlcalidadhtd.SdtControlCalidad_CCSTA_SDT_Item)AV26ControlCalidad_CCSTA_SDT.elementAt(-1+AV84GXV1)).getgxTv_SdtControlCalidad_CCSTA_SDT_Item_Cctvallin()), "Z9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavControlcalidad_ccsta_sdt__cctvallin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavControlcalidad_ccsta_sdt__cctvallin_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(131),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( Gridcontrolcalidad_ccsta_sdtsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Gridcontrolcalidad_ccsta_sdtsRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavControlcalidad_ccsta_sdt__cctvaldsc_Internalname,GXutil.rtrim( ((app.controlcalidadhtd.SdtControlCalidad_CCSTA_SDT_Item)AV26ControlCalidad_CCSTA_SDT.elementAt(-1+AV84GXV1)).getgxTv_SdtControlCalidad_CCSTA_SDT_Item_Cctvaldsc()),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavControlcalidad_ccsta_sdt__cctvaldsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavControlcalidad_ccsta_sdt__cctvaldsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(131),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( Gridcontrolcalidad_ccsta_sdtsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Gridcontrolcalidad_ccsta_sdtsRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavControlcalidad_ccsta_sdt__cctval_Internalname,GXutil.rtrim( ((app.controlcalidadhtd.SdtControlCalidad_CCSTA_SDT_Item)AV26ControlCalidad_CCSTA_SDT.elementAt(-1+AV84GXV1)).getgxTv_SdtControlCalidad_CCSTA_SDT_Item_Cctval()),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavControlcalidad_ccsta_sdt__cctval_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavControlcalidad_ccsta_sdt__cctval_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(131),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         send_integrity_lvl_hashes2CE2( ) ;
         Gridcontrolcalidad_ccsta_sdtsContainer.AddRow(Gridcontrolcalidad_ccsta_sdtsRow);
         nGXsfl_131_idx = ((subGridcontrolcalidad_ccsta_sdts_Islastpage==1)&&(nGXsfl_131_idx+1>subgridcontrolcalidad_ccsta_sdts_fnc_recordsperpage( )) ? 1 : nGXsfl_131_idx+1) ;
         sGXsfl_131_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_131_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1312( ) ;
      }
      /* End function sendrow_1312 */
   }

   public void subsflControlProps_1415( )
   {
      edtavControlcalidad_valoresestandars_ccsta_sdt__cctlin_Internalname = "CONTROLCALIDAD_VALORESESTANDARS_CCSTA_SDT__CCTLIN_"+sGXsfl_141_idx ;
      edtavControlcalidad_valoresestandars_ccsta_sdt__cctlindsc_Internalname = "CONTROLCALIDAD_VALORESESTANDARS_CCSTA_SDT__CCTLINDSC_"+sGXsfl_141_idx ;
      edtavControlcalidad_valoresestandars_ccsta_sdt__ccsauto_Internalname = "CONTROLCALIDAD_VALORESESTANDARS_CCSTA_SDT__CCSAUTO_"+sGXsfl_141_idx ;
      edtavControlcalidad_valoresestandars_ccsta_sdt__ccsvtol_Internalname = "CONTROLCALIDAD_VALORESESTANDARS_CCSTA_SDT__CCSVTOL_"+sGXsfl_141_idx ;
      edtavControlcalidad_valoresestandars_ccsta_sdt__ccsmin_Internalname = "CONTROLCALIDAD_VALORESESTANDARS_CCSTA_SDT__CCSMIN_"+sGXsfl_141_idx ;
      edtavControlcalidad_valoresestandars_ccsta_sdt__ccsmax_Internalname = "CONTROLCALIDAD_VALORESESTANDARS_CCSTA_SDT__CCSMAX_"+sGXsfl_141_idx ;
      edtavControlcalidad_valoresestandars_ccsta_sdt__ccvdsc_Internalname = "CONTROLCALIDAD_VALORESESTANDARS_CCSTA_SDT__CCVDSC_"+sGXsfl_141_idx ;
   }

   public void subsflControlProps_fel_1415( )
   {
      edtavControlcalidad_valoresestandars_ccsta_sdt__cctlin_Internalname = "CONTROLCALIDAD_VALORESESTANDARS_CCSTA_SDT__CCTLIN_"+sGXsfl_141_fel_idx ;
      edtavControlcalidad_valoresestandars_ccsta_sdt__cctlindsc_Internalname = "CONTROLCALIDAD_VALORESESTANDARS_CCSTA_SDT__CCTLINDSC_"+sGXsfl_141_fel_idx ;
      edtavControlcalidad_valoresestandars_ccsta_sdt__ccsauto_Internalname = "CONTROLCALIDAD_VALORESESTANDARS_CCSTA_SDT__CCSAUTO_"+sGXsfl_141_fel_idx ;
      edtavControlcalidad_valoresestandars_ccsta_sdt__ccsvtol_Internalname = "CONTROLCALIDAD_VALORESESTANDARS_CCSTA_SDT__CCSVTOL_"+sGXsfl_141_fel_idx ;
      edtavControlcalidad_valoresestandars_ccsta_sdt__ccsmin_Internalname = "CONTROLCALIDAD_VALORESESTANDARS_CCSTA_SDT__CCSMIN_"+sGXsfl_141_fel_idx ;
      edtavControlcalidad_valoresestandars_ccsta_sdt__ccsmax_Internalname = "CONTROLCALIDAD_VALORESESTANDARS_CCSTA_SDT__CCSMAX_"+sGXsfl_141_fel_idx ;
      edtavControlcalidad_valoresestandars_ccsta_sdt__ccvdsc_Internalname = "CONTROLCALIDAD_VALORESESTANDARS_CCSTA_SDT__CCVDSC_"+sGXsfl_141_fel_idx ;
   }

   public void sendrow_1415( )
   {
      subsflControlProps_1415( ) ;
      wb2CE0( ) ;
      if ( ( subGridcontrolcalidad_valoresestandars_ccsta_sdts_Rows * 1 == 0 ) || ( nGXsfl_141_idx <= subgridcontrolcalidad_valoresestandars_ccsta_sdts_fnc_recordsperpage( ) * 1 ) )
      {
         Gridcontrolcalidad_valoresestandars_ccsta_sdtsRow = GXWebRow.GetNew(context,Gridcontrolcalidad_valoresestandars_ccsta_sdtsContainer) ;
         if ( subGridcontrolcalidad_valoresestandars_ccsta_sdts_Backcolorstyle == 0 )
         {
            /* None style subfile background logic. */
            subGridcontrolcalidad_valoresestandars_ccsta_sdts_Backstyle = (byte)(0) ;
            if ( GXutil.strcmp(subGridcontrolcalidad_valoresestandars_ccsta_sdts_Class, "") != 0 )
            {
               subGridcontrolcalidad_valoresestandars_ccsta_sdts_Linesclass = subGridcontrolcalidad_valoresestandars_ccsta_sdts_Class+"Odd" ;
            }
         }
         else if ( subGridcontrolcalidad_valoresestandars_ccsta_sdts_Backcolorstyle == 1 )
         {
            /* Uniform style subfile background logic. */
            subGridcontrolcalidad_valoresestandars_ccsta_sdts_Backstyle = (byte)(0) ;
            subGridcontrolcalidad_valoresestandars_ccsta_sdts_Backcolor = subGridcontrolcalidad_valoresestandars_ccsta_sdts_Allbackcolor ;
            if ( GXutil.strcmp(subGridcontrolcalidad_valoresestandars_ccsta_sdts_Class, "") != 0 )
            {
               subGridcontrolcalidad_valoresestandars_ccsta_sdts_Linesclass = subGridcontrolcalidad_valoresestandars_ccsta_sdts_Class+"Uniform" ;
            }
         }
         else if ( subGridcontrolcalidad_valoresestandars_ccsta_sdts_Backcolorstyle == 2 )
         {
            /* Header style subfile background logic. */
            subGridcontrolcalidad_valoresestandars_ccsta_sdts_Backstyle = (byte)(1) ;
            if ( GXutil.strcmp(subGridcontrolcalidad_valoresestandars_ccsta_sdts_Class, "") != 0 )
            {
               subGridcontrolcalidad_valoresestandars_ccsta_sdts_Linesclass = subGridcontrolcalidad_valoresestandars_ccsta_sdts_Class+"Odd" ;
            }
            subGridcontrolcalidad_valoresestandars_ccsta_sdts_Backcolor = (int)(0x0) ;
         }
         else if ( subGridcontrolcalidad_valoresestandars_ccsta_sdts_Backcolorstyle == 3 )
         {
            /* Report style subfile background logic. */
            subGridcontrolcalidad_valoresestandars_ccsta_sdts_Backstyle = (byte)(1) ;
            if ( ((int)((nGXsfl_141_idx) % (2))) == 0 )
            {
               subGridcontrolcalidad_valoresestandars_ccsta_sdts_Backcolor = (int)(0x0) ;
               if ( GXutil.strcmp(subGridcontrolcalidad_valoresestandars_ccsta_sdts_Class, "") != 0 )
               {
                  subGridcontrolcalidad_valoresestandars_ccsta_sdts_Linesclass = subGridcontrolcalidad_valoresestandars_ccsta_sdts_Class+"Even" ;
               }
            }
            else
            {
               subGridcontrolcalidad_valoresestandars_ccsta_sdts_Backcolor = (int)(0x0) ;
               if ( GXutil.strcmp(subGridcontrolcalidad_valoresestandars_ccsta_sdts_Class, "") != 0 )
               {
                  subGridcontrolcalidad_valoresestandars_ccsta_sdts_Linesclass = subGridcontrolcalidad_valoresestandars_ccsta_sdts_Class+"Odd" ;
               }
            }
         }
         if ( Gridcontrolcalidad_valoresestandars_ccsta_sdtsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<tr ") ;
            httpContext.writeText( " class=\""+"GridNoBorder WorkWith"+"\" style=\""+""+"\"") ;
            httpContext.writeText( " gxrow=\""+sGXsfl_141_idx+"\">") ;
         }
         /* Subfile cell */
         if ( Gridcontrolcalidad_valoresestandars_ccsta_sdtsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Gridcontrolcalidad_valoresestandars_ccsta_sdtsRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavControlcalidad_valoresestandars_ccsta_sdt__cctlin_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.controlcalidadhtd.SdtControlCalidad_ValoresEstandars_CCsta_SDT_Item)AV28ControlCalidad_ValoresEstandars_CCsta_SDT.elementAt(-1+AV88GXV5)).getgxTv_SdtControlCalidad_ValoresEstandars_CCsta_SDT_Item_Cctlin(), (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavControlcalidad_valoresestandars_ccsta_sdt__cctlin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.controlcalidadhtd.SdtControlCalidad_ValoresEstandars_CCsta_SDT_Item)AV28ControlCalidad_ValoresEstandars_CCsta_SDT.elementAt(-1+AV88GXV5)).getgxTv_SdtControlCalidad_ValoresEstandars_CCsta_SDT_Item_Cctlin()), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(((app.controlcalidadhtd.SdtControlCalidad_ValoresEstandars_CCsta_SDT_Item)AV28ControlCalidad_ValoresEstandars_CCsta_SDT.elementAt(-1+AV88GXV5)).getgxTv_SdtControlCalidad_ValoresEstandars_CCsta_SDT_Item_Cctlin()), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavControlcalidad_valoresestandars_ccsta_sdt__cctlin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavControlcalidad_valoresestandars_ccsta_sdt__cctlin_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(141),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(false),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( Gridcontrolcalidad_valoresestandars_ccsta_sdtsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Gridcontrolcalidad_valoresestandars_ccsta_sdtsRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavControlcalidad_valoresestandars_ccsta_sdt__cctlindsc_Internalname,GXutil.rtrim( ((app.controlcalidadhtd.SdtControlCalidad_ValoresEstandars_CCsta_SDT_Item)AV28ControlCalidad_ValoresEstandars_CCsta_SDT.elementAt(-1+AV88GXV5)).getgxTv_SdtControlCalidad_ValoresEstandars_CCsta_SDT_Item_Cctlindsc()),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavControlcalidad_valoresestandars_ccsta_sdt__cctlindsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavControlcalidad_valoresestandars_ccsta_sdt__cctlindsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(141),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(false),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( Gridcontrolcalidad_valoresestandars_ccsta_sdtsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Gridcontrolcalidad_valoresestandars_ccsta_sdtsRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavControlcalidad_valoresestandars_ccsta_sdt__ccsauto_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.controlcalidadhtd.SdtControlCalidad_ValoresEstandars_CCsta_SDT_Item)AV28ControlCalidad_ValoresEstandars_CCsta_SDT.elementAt(-1+AV88GXV5)).getgxTv_SdtControlCalidad_ValoresEstandars_CCsta_SDT_Item_Ccsauto(), (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavControlcalidad_valoresestandars_ccsta_sdt__ccsauto_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.controlcalidadhtd.SdtControlCalidad_ValoresEstandars_CCsta_SDT_Item)AV28ControlCalidad_ValoresEstandars_CCsta_SDT.elementAt(-1+AV88GXV5)).getgxTv_SdtControlCalidad_ValoresEstandars_CCsta_SDT_Item_Ccsauto()), "9") : localUtil.format( DecimalUtil.doubleToDec(((app.controlcalidadhtd.SdtControlCalidad_ValoresEstandars_CCsta_SDT_Item)AV28ControlCalidad_ValoresEstandars_CCsta_SDT.elementAt(-1+AV88GXV5)).getgxTv_SdtControlCalidad_ValoresEstandars_CCsta_SDT_Item_Ccsauto()), "9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavControlcalidad_valoresestandars_ccsta_sdt__ccsauto_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavControlcalidad_valoresestandars_ccsta_sdt__ccsauto_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(141),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(false),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( Gridcontrolcalidad_valoresestandars_ccsta_sdtsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Gridcontrolcalidad_valoresestandars_ccsta_sdtsRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavControlcalidad_valoresestandars_ccsta_sdt__ccsvtol_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.controlcalidadhtd.SdtControlCalidad_ValoresEstandars_CCsta_SDT_Item)AV28ControlCalidad_ValoresEstandars_CCsta_SDT.elementAt(-1+AV88GXV5)).getgxTv_SdtControlCalidad_ValoresEstandars_CCsta_SDT_Item_Ccsvtol(), (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavControlcalidad_valoresestandars_ccsta_sdt__ccsvtol_Enabled!=0) ? localUtil.format( ((app.controlcalidadhtd.SdtControlCalidad_ValoresEstandars_CCsta_SDT_Item)AV28ControlCalidad_ValoresEstandars_CCsta_SDT.elementAt(-1+AV88GXV5)).getgxTv_SdtControlCalidad_ValoresEstandars_CCsta_SDT_Item_Ccsvtol(), "Z9.99") : localUtil.format( ((app.controlcalidadhtd.SdtControlCalidad_ValoresEstandars_CCsta_SDT_Item)AV28ControlCalidad_ValoresEstandars_CCsta_SDT.elementAt(-1+AV88GXV5)).getgxTv_SdtControlCalidad_ValoresEstandars_CCsta_SDT_Item_Ccsvtol(), "Z9.99"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavControlcalidad_valoresestandars_ccsta_sdt__ccsvtol_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavControlcalidad_valoresestandars_ccsta_sdt__ccsvtol_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(5),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(141),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(false),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( Gridcontrolcalidad_valoresestandars_ccsta_sdtsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Gridcontrolcalidad_valoresestandars_ccsta_sdtsRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavControlcalidad_valoresestandars_ccsta_sdt__ccsmin_Internalname,GXutil.rtrim( ((app.controlcalidadhtd.SdtControlCalidad_ValoresEstandars_CCsta_SDT_Item)AV28ControlCalidad_ValoresEstandars_CCsta_SDT.elementAt(-1+AV88GXV5)).getgxTv_SdtControlCalidad_ValoresEstandars_CCsta_SDT_Item_Ccsmin()),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavControlcalidad_valoresestandars_ccsta_sdt__ccsmin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavControlcalidad_valoresestandars_ccsta_sdt__ccsmin_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(141),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(false),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( Gridcontrolcalidad_valoresestandars_ccsta_sdtsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Gridcontrolcalidad_valoresestandars_ccsta_sdtsRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavControlcalidad_valoresestandars_ccsta_sdt__ccsmax_Internalname,GXutil.rtrim( ((app.controlcalidadhtd.SdtControlCalidad_ValoresEstandars_CCsta_SDT_Item)AV28ControlCalidad_ValoresEstandars_CCsta_SDT.elementAt(-1+AV88GXV5)).getgxTv_SdtControlCalidad_ValoresEstandars_CCsta_SDT_Item_Ccsmax()),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavControlcalidad_valoresestandars_ccsta_sdt__ccsmax_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavControlcalidad_valoresestandars_ccsta_sdt__ccsmax_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(141),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(false),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( Gridcontrolcalidad_valoresestandars_ccsta_sdtsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Gridcontrolcalidad_valoresestandars_ccsta_sdtsRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavControlcalidad_valoresestandars_ccsta_sdt__ccvdsc_Internalname,GXutil.rtrim( ((app.controlcalidadhtd.SdtControlCalidad_ValoresEstandars_CCsta_SDT_Item)AV28ControlCalidad_ValoresEstandars_CCsta_SDT.elementAt(-1+AV88GXV5)).getgxTv_SdtControlCalidad_ValoresEstandars_CCsta_SDT_Item_Ccvdsc()),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavControlcalidad_valoresestandars_ccsta_sdt__ccvdsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavControlcalidad_valoresestandars_ccsta_sdt__ccvdsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(141),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(false),"","left",Boolean.valueOf(true),""});
         send_integrity_lvl_hashes2CE5( ) ;
         Gridcontrolcalidad_valoresestandars_ccsta_sdtsContainer.AddRow(Gridcontrolcalidad_valoresestandars_ccsta_sdtsRow);
         nGXsfl_141_idx = ((subGridcontrolcalidad_valoresestandars_ccsta_sdts_Islastpage==1)&&(nGXsfl_141_idx+1>subgridcontrolcalidad_valoresestandars_ccsta_sdts_fnc_recordsperpage( )) ? 1 : nGXsfl_141_idx+1) ;
         sGXsfl_141_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_141_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1415( ) ;
      }
      /* End function sendrow_1415 */
   }

   public void subsflControlProps_1544( )
   {
      edtCCTLin_Internalname = "CCTLIN_"+sGXsfl_154_idx ;
      edtCCTLinDsc_Internalname = "CCTLINDSC_"+sGXsfl_154_idx ;
      edtCCTLinDc2_Internalname = "CCTLINDC2_"+sGXsfl_154_idx ;
      edtCCMetodo_Internalname = "CCMETODO_"+sGXsfl_154_idx ;
      edtCCEspecif_Internalname = "CCESPECIF_"+sGXsfl_154_idx ;
      edtCCVal_Internalname = "CCVAL_"+sGXsfl_154_idx ;
      edtCCOkLin_Internalname = "CCOKLIN_"+sGXsfl_154_idx ;
      chkavCcoklingrid.setInternalname( "vCCOKLINGRID_"+sGXsfl_154_idx );
   }

   public void subsflControlProps_fel_1544( )
   {
      edtCCTLin_Internalname = "CCTLIN_"+sGXsfl_154_fel_idx ;
      edtCCTLinDsc_Internalname = "CCTLINDSC_"+sGXsfl_154_fel_idx ;
      edtCCTLinDc2_Internalname = "CCTLINDC2_"+sGXsfl_154_fel_idx ;
      edtCCMetodo_Internalname = "CCMETODO_"+sGXsfl_154_fel_idx ;
      edtCCEspecif_Internalname = "CCESPECIF_"+sGXsfl_154_fel_idx ;
      edtCCVal_Internalname = "CCVAL_"+sGXsfl_154_fel_idx ;
      edtCCOkLin_Internalname = "CCOKLIN_"+sGXsfl_154_fel_idx ;
      chkavCcoklingrid.setInternalname( "vCCOKLINGRID_"+sGXsfl_154_fel_idx );
   }

   public void sendrow_1544( )
   {
      subsflControlProps_1544( ) ;
      wb2CE0( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_154_idx <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_154_idx) % (2))) == 0 )
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
            httpContext.writeText( " gxrow=\""+sGXsfl_154_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCCTLin_Internalname,GXutil.ltrim( localUtil.ntoc( A4034CCTLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A4034CCTLin), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+"ECCTLIN.CLICK."+sGXsfl_154_idx+"'","","","","",edtCCTLin_Jsonclick,Integer.valueOf(5),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(154),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCCTLinDsc_Internalname,GXutil.rtrim( A4043CCTLinDsc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCCTLinDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(154),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCCTLinDc2_Internalname,GXutil.rtrim( A14344CCTLinDc2),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCCTLinDc2_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(154),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCCMetodo_Internalname,GXutil.rtrim( A13251CCMetodo),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCCMetodo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(154),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCCEspecif_Internalname,GXutil.rtrim( A13252CCEspecif),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCCEspecif_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(154),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCCVal_Internalname,GXutil.rtrim( A4035CCVal),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCCVal_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtCCVal_Columnclass,edtCCVal_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(154),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCCOkLin_Internalname,GXutil.ltrim( localUtil.ntoc( A12750CCOkLin, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A12750CCOkLin), "9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCCOkLin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(154),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+""+"\""+" style=\""+""+"\">") ;
         }
         /* Check box */
         TempTags = " " + ((chkavCcoklingrid.getEnabled()!=0)&&(chkavCcoklingrid.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 162,'',false,'"+sGXsfl_154_idx+"',154)\"" : " ") ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GXCCtl = "vCCOKLINGRID_" + sGXsfl_154_idx ;
         chkavCcoklingrid.setName( GXCCtl );
         chkavCcoklingrid.setWebtags( "" );
         chkavCcoklingrid.setCaption( "" );
         httpContext.ajax_rsp_assign_prop("", false, chkavCcoklingrid.getInternalname(), "TitleCaption", chkavCcoklingrid.getCaption(), !bGXsfl_154_Refreshing);
         chkavCcoklingrid.setCheckedValue( "false" );
         AV76CCOkLingrid = GXutil.strtobool( GXutil.booltostr( AV76CCOkLingrid)) ;
         httpContext.ajax_rsp_assign_attri("", false, chkavCcoklingrid.getInternalname(), AV76CCOkLingrid);
         GridRow.AddColumnProperties("checkbox", 1, isAjaxCallMode( ), new Object[] {chkavCcoklingrid.getInternalname(),GXutil.booltostr( AV76CCOkLingrid),"","",Integer.valueOf(-1),Integer.valueOf(chkavCcoklingrid.getEnabled()),"true","",StyleString,ClassString,"WWColumn","",TempTags+" onclick="+"\"gx.fn.checkboxClick(162, this, 'true', 'false',"+"''"+");"+"gx.evt.onchange(this, event);\""+((chkavCcoklingrid.getEnabled()!=0)&&(chkavCcoklingrid.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,162);\"" : " ")});
         send_integrity_lvl_hashes2CE4( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_154_idx = ((subGrid_Islastpage==1)&&(nGXsfl_154_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_154_idx+1) ;
         sGXsfl_154_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_154_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1544( ) ;
      }
      /* End function sendrow_1544 */
   }

   public void startgridcontrol131( )
   {
      if ( Gridcontrolcalidad_ccsta_sdtsContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+"Gridcontrolcalidad_ccsta_sdtsContainer"+"DivS\" data-gxgridid=\"131\">") ;
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, subGridcontrolcalidad_ccsta_sdts_Internalname, subGridcontrolcalidad_ccsta_sdts_Internalname, "", "GridNoBorder WorkWith", 0, "", "", 1, 2, sStyleString, "", "", 0);
         /* Subfile titles */
         httpContext.writeText( "<tr") ;
         httpContext.writeTextNL( ">") ;
         if ( subGridcontrolcalidad_ccsta_sdts_Backcolorstyle == 0 )
         {
            subGridcontrolcalidad_ccsta_sdts_Titlebackstyle = (byte)(0) ;
            if ( GXutil.len( subGridcontrolcalidad_ccsta_sdts_Class) > 0 )
            {
               subGridcontrolcalidad_ccsta_sdts_Linesclass = subGridcontrolcalidad_ccsta_sdts_Class+"Title" ;
            }
         }
         else
         {
            subGridcontrolcalidad_ccsta_sdts_Titlebackstyle = (byte)(1) ;
            if ( subGridcontrolcalidad_ccsta_sdts_Backcolorstyle == 1 )
            {
               subGridcontrolcalidad_ccsta_sdts_Titlebackcolor = subGridcontrolcalidad_ccsta_sdts_Allbackcolor ;
               if ( GXutil.len( subGridcontrolcalidad_ccsta_sdts_Class) > 0 )
               {
                  subGridcontrolcalidad_ccsta_sdts_Linesclass = subGridcontrolcalidad_ccsta_sdts_Class+"UniformTitle" ;
               }
            }
            else
            {
               if ( GXutil.len( subGridcontrolcalidad_ccsta_sdts_Class) > 0 )
               {
                  subGridcontrolcalidad_ccsta_sdts_Linesclass = subGridcontrolcalidad_ccsta_sdts_Class+"Title" ;
               }
            }
         }
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( "#") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripción", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Valor", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeTextNL( "</tr>") ;
         Gridcontrolcalidad_ccsta_sdtsContainer.AddObjectProperty("GridName", "Gridcontrolcalidad_ccsta_sdts");
      }
      else
      {
         Gridcontrolcalidad_ccsta_sdtsContainer.AddObjectProperty("GridName", "Gridcontrolcalidad_ccsta_sdts");
         Gridcontrolcalidad_ccsta_sdtsContainer.AddObjectProperty("Header", subGridcontrolcalidad_ccsta_sdts_Header);
         Gridcontrolcalidad_ccsta_sdtsContainer.AddObjectProperty("Class", "GridNoBorder WorkWith");
         Gridcontrolcalidad_ccsta_sdtsContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
         Gridcontrolcalidad_ccsta_sdtsContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
         Gridcontrolcalidad_ccsta_sdtsContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGridcontrolcalidad_ccsta_sdts_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
         Gridcontrolcalidad_ccsta_sdtsContainer.AddObjectProperty("CmpContext", "");
         Gridcontrolcalidad_ccsta_sdtsContainer.AddObjectProperty("InMasterPage", "false");
         Gridcontrolcalidad_ccsta_sdtsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Gridcontrolcalidad_ccsta_sdtsColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavControlcalidad_ccsta_sdt__cctvallin_Enabled, (byte)(5), (byte)(0), ".", "")));
         Gridcontrolcalidad_ccsta_sdtsContainer.AddColumnProperties(Gridcontrolcalidad_ccsta_sdtsColumn);
         Gridcontrolcalidad_ccsta_sdtsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Gridcontrolcalidad_ccsta_sdtsColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavControlcalidad_ccsta_sdt__cctvaldsc_Enabled, (byte)(5), (byte)(0), ".", "")));
         Gridcontrolcalidad_ccsta_sdtsContainer.AddColumnProperties(Gridcontrolcalidad_ccsta_sdtsColumn);
         Gridcontrolcalidad_ccsta_sdtsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Gridcontrolcalidad_ccsta_sdtsColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavControlcalidad_ccsta_sdt__cctval_Enabled, (byte)(5), (byte)(0), ".", "")));
         Gridcontrolcalidad_ccsta_sdtsContainer.AddColumnProperties(Gridcontrolcalidad_ccsta_sdtsColumn);
         Gridcontrolcalidad_ccsta_sdtsContainer.AddObjectProperty("Selectedindex", GXutil.ltrim( localUtil.ntoc( subGridcontrolcalidad_ccsta_sdts_Selectedindex, (byte)(4), (byte)(0), ".", "")));
         Gridcontrolcalidad_ccsta_sdtsContainer.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGridcontrolcalidad_ccsta_sdts_Allowselection, (byte)(1), (byte)(0), ".", "")));
         Gridcontrolcalidad_ccsta_sdtsContainer.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGridcontrolcalidad_ccsta_sdts_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
         Gridcontrolcalidad_ccsta_sdtsContainer.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGridcontrolcalidad_ccsta_sdts_Allowhovering, (byte)(1), (byte)(0), ".", "")));
         Gridcontrolcalidad_ccsta_sdtsContainer.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGridcontrolcalidad_ccsta_sdts_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
         Gridcontrolcalidad_ccsta_sdtsContainer.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGridcontrolcalidad_ccsta_sdts_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
         Gridcontrolcalidad_ccsta_sdtsContainer.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGridcontrolcalidad_ccsta_sdts_Collapsed, (byte)(1), (byte)(0), ".", "")));
      }
   }

   public void startgridcontrol141( )
   {
      if ( Gridcontrolcalidad_valoresestandars_ccsta_sdtsContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+"Gridcontrolcalidad_valoresestandars_ccsta_sdtsContainer"+"DivS\" data-gxgridid=\"141\">") ;
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, subGridcontrolcalidad_valoresestandars_ccsta_sdts_Internalname, subGridcontrolcalidad_valoresestandars_ccsta_sdts_Internalname, "", "GridNoBorder WorkWith", 0, "", "", 1, 2, sStyleString, "", "", 0);
         /* Subfile titles */
         httpContext.writeText( "<tr") ;
         httpContext.writeTextNL( ">") ;
         if ( subGridcontrolcalidad_valoresestandars_ccsta_sdts_Backcolorstyle == 0 )
         {
            subGridcontrolcalidad_valoresestandars_ccsta_sdts_Titlebackstyle = (byte)(0) ;
            if ( GXutil.len( subGridcontrolcalidad_valoresestandars_ccsta_sdts_Class) > 0 )
            {
               subGridcontrolcalidad_valoresestandars_ccsta_sdts_Linesclass = subGridcontrolcalidad_valoresestandars_ccsta_sdts_Class+"Title" ;
            }
         }
         else
         {
            subGridcontrolcalidad_valoresestandars_ccsta_sdts_Titlebackstyle = (byte)(1) ;
            if ( subGridcontrolcalidad_valoresestandars_ccsta_sdts_Backcolorstyle == 1 )
            {
               subGridcontrolcalidad_valoresestandars_ccsta_sdts_Titlebackcolor = subGridcontrolcalidad_valoresestandars_ccsta_sdts_Allbackcolor ;
               if ( GXutil.len( subGridcontrolcalidad_valoresestandars_ccsta_sdts_Class) > 0 )
               {
                  subGridcontrolcalidad_valoresestandars_ccsta_sdts_Linesclass = subGridcontrolcalidad_valoresestandars_ccsta_sdts_Class+"UniformTitle" ;
               }
            }
            else
            {
               if ( GXutil.len( subGridcontrolcalidad_valoresestandars_ccsta_sdts_Class) > 0 )
               {
                  subGridcontrolcalidad_valoresestandars_ccsta_sdts_Linesclass = subGridcontrolcalidad_valoresestandars_ccsta_sdts_Class+"Title" ;
               }
            }
         }
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "# Lín", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripción", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Auto", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Tolerancia", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Min.", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Max.", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripción", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeTextNL( "</tr>") ;
         Gridcontrolcalidad_valoresestandars_ccsta_sdtsContainer.AddObjectProperty("GridName", "Gridcontrolcalidad_valoresestandars_ccsta_sdts");
      }
      else
      {
         Gridcontrolcalidad_valoresestandars_ccsta_sdtsContainer.AddObjectProperty("GridName", "Gridcontrolcalidad_valoresestandars_ccsta_sdts");
         Gridcontrolcalidad_valoresestandars_ccsta_sdtsContainer.AddObjectProperty("Header", subGridcontrolcalidad_valoresestandars_ccsta_sdts_Header);
         Gridcontrolcalidad_valoresestandars_ccsta_sdtsContainer.AddObjectProperty("Class", "GridNoBorder WorkWith");
         Gridcontrolcalidad_valoresestandars_ccsta_sdtsContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
         Gridcontrolcalidad_valoresestandars_ccsta_sdtsContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
         Gridcontrolcalidad_valoresestandars_ccsta_sdtsContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGridcontrolcalidad_valoresestandars_ccsta_sdts_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
         Gridcontrolcalidad_valoresestandars_ccsta_sdtsContainer.AddObjectProperty("CmpContext", "");
         Gridcontrolcalidad_valoresestandars_ccsta_sdtsContainer.AddObjectProperty("InMasterPage", "false");
         Gridcontrolcalidad_valoresestandars_ccsta_sdtsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Gridcontrolcalidad_valoresestandars_ccsta_sdtsColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavControlcalidad_valoresestandars_ccsta_sdt__cctlin_Enabled, (byte)(5), (byte)(0), ".", "")));
         Gridcontrolcalidad_valoresestandars_ccsta_sdtsContainer.AddColumnProperties(Gridcontrolcalidad_valoresestandars_ccsta_sdtsColumn);
         Gridcontrolcalidad_valoresestandars_ccsta_sdtsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Gridcontrolcalidad_valoresestandars_ccsta_sdtsColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavControlcalidad_valoresestandars_ccsta_sdt__cctlindsc_Enabled, (byte)(5), (byte)(0), ".", "")));
         Gridcontrolcalidad_valoresestandars_ccsta_sdtsContainer.AddColumnProperties(Gridcontrolcalidad_valoresestandars_ccsta_sdtsColumn);
         Gridcontrolcalidad_valoresestandars_ccsta_sdtsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Gridcontrolcalidad_valoresestandars_ccsta_sdtsColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavControlcalidad_valoresestandars_ccsta_sdt__ccsauto_Enabled, (byte)(5), (byte)(0), ".", "")));
         Gridcontrolcalidad_valoresestandars_ccsta_sdtsContainer.AddColumnProperties(Gridcontrolcalidad_valoresestandars_ccsta_sdtsColumn);
         Gridcontrolcalidad_valoresestandars_ccsta_sdtsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Gridcontrolcalidad_valoresestandars_ccsta_sdtsColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavControlcalidad_valoresestandars_ccsta_sdt__ccsvtol_Enabled, (byte)(5), (byte)(0), ".", "")));
         Gridcontrolcalidad_valoresestandars_ccsta_sdtsContainer.AddColumnProperties(Gridcontrolcalidad_valoresestandars_ccsta_sdtsColumn);
         Gridcontrolcalidad_valoresestandars_ccsta_sdtsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Gridcontrolcalidad_valoresestandars_ccsta_sdtsColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavControlcalidad_valoresestandars_ccsta_sdt__ccsmin_Enabled, (byte)(5), (byte)(0), ".", "")));
         Gridcontrolcalidad_valoresestandars_ccsta_sdtsContainer.AddColumnProperties(Gridcontrolcalidad_valoresestandars_ccsta_sdtsColumn);
         Gridcontrolcalidad_valoresestandars_ccsta_sdtsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Gridcontrolcalidad_valoresestandars_ccsta_sdtsColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavControlcalidad_valoresestandars_ccsta_sdt__ccsmax_Enabled, (byte)(5), (byte)(0), ".", "")));
         Gridcontrolcalidad_valoresestandars_ccsta_sdtsContainer.AddColumnProperties(Gridcontrolcalidad_valoresestandars_ccsta_sdtsColumn);
         Gridcontrolcalidad_valoresestandars_ccsta_sdtsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Gridcontrolcalidad_valoresestandars_ccsta_sdtsColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavControlcalidad_valoresestandars_ccsta_sdt__ccvdsc_Enabled, (byte)(5), (byte)(0), ".", "")));
         Gridcontrolcalidad_valoresestandars_ccsta_sdtsContainer.AddColumnProperties(Gridcontrolcalidad_valoresestandars_ccsta_sdtsColumn);
         Gridcontrolcalidad_valoresestandars_ccsta_sdtsContainer.AddObjectProperty("Selectedindex", GXutil.ltrim( localUtil.ntoc( subGridcontrolcalidad_valoresestandars_ccsta_sdts_Selectedindex, (byte)(4), (byte)(0), ".", "")));
         Gridcontrolcalidad_valoresestandars_ccsta_sdtsContainer.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGridcontrolcalidad_valoresestandars_ccsta_sdts_Allowselection, (byte)(1), (byte)(0), ".", "")));
         Gridcontrolcalidad_valoresestandars_ccsta_sdtsContainer.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGridcontrolcalidad_valoresestandars_ccsta_sdts_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
         Gridcontrolcalidad_valoresestandars_ccsta_sdtsContainer.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGridcontrolcalidad_valoresestandars_ccsta_sdts_Allowhovering, (byte)(1), (byte)(0), ".", "")));
         Gridcontrolcalidad_valoresestandars_ccsta_sdtsContainer.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGridcontrolcalidad_valoresestandars_ccsta_sdts_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
         Gridcontrolcalidad_valoresestandars_ccsta_sdtsContainer.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGridcontrolcalidad_valoresestandars_ccsta_sdts_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
         Gridcontrolcalidad_valoresestandars_ccsta_sdtsContainer.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGridcontrolcalidad_valoresestandars_ccsta_sdts_Collapsed, (byte)(1), (byte)(0), ".", "")));
      }
   }

   public void startgridcontrol154( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+"GridContainer"+"DivS\" data-gxgridid=\"154\">") ;
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
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "# Lín", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripción", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "(cont)", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Metodo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Especificacion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Valor", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Ok?", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+""+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Ok?", "")) ;
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
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A4034CCTLin, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A4043CCTLinDsc));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A14344CCTLinDc2));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A13251CCMetodo));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A13252CCEspecif));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A4035CCVal));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtCCVal_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtCCVal_Columnheaderclass));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A12750CCOkLin, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.booltostr( AV76CCOkLingrid));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( chkavCcoklingrid.getEnabled(), (byte)(5), (byte)(0), ".", "")));
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
      edtavBarcod_Internalname = "vBARCOD" ;
      edtavBarcodreo_Internalname = "vBARCODREO" ;
      edtavBarcodpar_Internalname = "vBARCODPAR" ;
      edtavCctcod_Internalname = "vCCTCOD" ;
      edtavCctdsc_Internalname = "vCCTDSC" ;
      divUnnamedtable7_Internalname = "UNNAMEDTABLE7" ;
      edtavProcod_Internalname = "vPROCOD" ;
      edtavProdsc_Internalname = "vPRODSC" ;
      edtavBarordlin_Internalname = "vBARORDLIN" ;
      edtavFascod_Internalname = "vFASCOD" ;
      edtavFasdsc_Internalname = "vFASDSC" ;
      divUnnamedtable8_Internalname = "UNNAMEDTABLE8" ;
      divTableheader_Internalname = "TABLEHEADER" ;
      Dvpanel_tableheader_Internalname = "DVPANEL_TABLEHEADER" ;
      edtavCctlin_Internalname = "vCCTLIN" ;
      edtavCctlindsc_Internalname = "vCCTLINDSC" ;
      edtavCctlindc2_Internalname = "vCCTLINDC2" ;
      divUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
      edtavCcmetodo_Internalname = "vCCMETODO" ;
      edtavCcespecif_Internalname = "vCCESPECIF" ;
      edtavCcval_Internalname = "vCCVAL" ;
      chkavCcoklin.setInternalname( "vCCOKLIN" );
      divUnnamedtable3_Internalname = "UNNAMEDTABLE3" ;
      lblTxtmensaje_Internalname = "TXTMENSAJE" ;
      bttBtnenter_Internalname = "BTNENTER" ;
      bttBtnlimpiarvariables_Internalname = "BTNLIMPIARVARIABLES" ;
      bttBtncerrar_Internalname = "BTNCERRAR" ;
      divUnnamedtable4_Internalname = "UNNAMEDTABLE4" ;
      edtavControlcalidad_ccsta_sdt__cctvallin_Internalname = "CONTROLCALIDAD_CCSTA_SDT__CCTVALLIN" ;
      edtavControlcalidad_ccsta_sdt__cctvaldsc_Internalname = "CONTROLCALIDAD_CCSTA_SDT__CCTVALDSC" ;
      edtavControlcalidad_ccsta_sdt__cctval_Internalname = "CONTROLCALIDAD_CCSTA_SDT__CCTVAL" ;
      divUnnamedtable6_Internalname = "UNNAMEDTABLE6" ;
      Dvpanel_unnamedtable6_Internalname = "DVPANEL_UNNAMEDTABLE6" ;
      edtavControlcalidad_valoresestandars_ccsta_sdt__cctlin_Internalname = "CONTROLCALIDAD_VALORESESTANDARS_CCSTA_SDT__CCTLIN" ;
      edtavControlcalidad_valoresestandars_ccsta_sdt__cctlindsc_Internalname = "CONTROLCALIDAD_VALORESESTANDARS_CCSTA_SDT__CCTLINDSC" ;
      edtavControlcalidad_valoresestandars_ccsta_sdt__ccsauto_Internalname = "CONTROLCALIDAD_VALORESESTANDARS_CCSTA_SDT__CCSAUTO" ;
      edtavControlcalidad_valoresestandars_ccsta_sdt__ccsvtol_Internalname = "CONTROLCALIDAD_VALORESESTANDARS_CCSTA_SDT__CCSVTOL" ;
      edtavControlcalidad_valoresestandars_ccsta_sdt__ccsmin_Internalname = "CONTROLCALIDAD_VALORESESTANDARS_CCSTA_SDT__CCSMIN" ;
      edtavControlcalidad_valoresestandars_ccsta_sdt__ccsmax_Internalname = "CONTROLCALIDAD_VALORESESTANDARS_CCSTA_SDT__CCSMAX" ;
      edtavControlcalidad_valoresestandars_ccsta_sdt__ccvdsc_Internalname = "CONTROLCALIDAD_VALORESESTANDARS_CCSTA_SDT__CCVDSC" ;
      divPanelvalorestandar_Internalname = "PANELVALORESTANDAR" ;
      Dvpanel_panelvalorestandar_Internalname = "DVPANEL_PANELVALORESTANDAR" ;
      divUnnamedtable5_Internalname = "UNNAMEDTABLE5" ;
      Dvpanel_unnamedtable5_Internalname = "DVPANEL_UNNAMEDTABLE5" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      Dvpanel_unnamedtable1_Internalname = "DVPANEL_UNNAMEDTABLE1" ;
      edtCCTLin_Internalname = "CCTLIN" ;
      edtCCTLinDsc_Internalname = "CCTLINDSC" ;
      edtCCTLinDc2_Internalname = "CCTLINDC2" ;
      edtCCMetodo_Internalname = "CCMETODO" ;
      edtCCEspecif_Internalname = "CCESPECIF" ;
      edtCCVal_Internalname = "CCVAL" ;
      edtCCOkLin_Internalname = "CCOKLIN" ;
      chkavCcoklingrid.setInternalname( "vCCOKLINGRID" );
      Gridpaginationbar_Internalname = "GRIDPAGINATIONBAR" ;
      divGridtablewithpaginationbar_Internalname = "GRIDTABLEWITHPAGINATIONBAR" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
      Datamonjs_Internalname = "DATAMONJS" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      Ddo_grid_Internalname = "DDO_GRID" ;
      Grid_empowerer_Internalname = "GRID_EMPOWERER" ;
      Gridcontrolcalidad_valoresestandars_ccsta_sdts_titlescategories_Internalname = "GRIDCONTROLCALIDAD_VALORESESTANDARS_CCSTA_SDTS_TITLESCATEGORIES" ;
      Gridcontrolcalidad_valoresestandars_ccsta_sdts_empowerer_Internalname = "GRIDCONTROLCALIDAD_VALORESESTANDARS_CCSTA_SDTS_EMPOWERER" ;
      Gridcontrolcalidad_ccsta_sdts_empowerer_Internalname = "GRIDCONTROLCALIDAD_CCSTA_SDTS_EMPOWERER" ;
      divHtml_bottomauxiliarcontrols_Internalname = "HTML_BOTTOMAUXILIARCONTROLS" ;
      divLayoutmaintable_Internalname = "LAYOUTMAINTABLE" ;
      Form.setInternalname( "FORM" );
      subGridcontrolcalidad_ccsta_sdts_Internalname = "GRIDCONTROLCALIDAD_CCSTA_SDTS" ;
      subGridcontrolcalidad_valoresestandars_ccsta_sdts_Internalname = "GRIDCONTROLCALIDAD_VALORESESTANDARS_CCSTA_SDTS" ;
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
      subGridcontrolcalidad_valoresestandars_ccsta_sdts_Allowcollapsing = (byte)(0) ;
      subGridcontrolcalidad_valoresestandars_ccsta_sdts_Allowselection = (byte)(0) ;
      subGridcontrolcalidad_valoresestandars_ccsta_sdts_Header = "" ;
      subGridcontrolcalidad_ccsta_sdts_Allowcollapsing = (byte)(0) ;
      subGridcontrolcalidad_ccsta_sdts_Allowselection = (byte)(0) ;
      subGridcontrolcalidad_ccsta_sdts_Header = "" ;
      chkavCcoklingrid.setCaption( "" );
      chkavCcoklingrid.setVisible( -1 );
      chkavCcoklingrid.setEnabled( 1 );
      edtCCOkLin_Jsonclick = "" ;
      edtCCVal_Jsonclick = "" ;
      edtCCVal_Columnclass = "WWColumn" ;
      edtCCEspecif_Jsonclick = "" ;
      edtCCMetodo_Jsonclick = "" ;
      edtCCTLinDc2_Jsonclick = "" ;
      edtCCTLinDsc_Jsonclick = "" ;
      edtCCTLin_Jsonclick = "" ;
      subGrid_Class = "GridWithPaginationBar GridNoBorder WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavControlcalidad_valoresestandars_ccsta_sdt__ccvdsc_Jsonclick = "" ;
      edtavControlcalidad_valoresestandars_ccsta_sdt__ccvdsc_Enabled = 0 ;
      edtavControlcalidad_valoresestandars_ccsta_sdt__ccsmax_Jsonclick = "" ;
      edtavControlcalidad_valoresestandars_ccsta_sdt__ccsmax_Enabled = 0 ;
      edtavControlcalidad_valoresestandars_ccsta_sdt__ccsmin_Jsonclick = "" ;
      edtavControlcalidad_valoresestandars_ccsta_sdt__ccsmin_Enabled = 0 ;
      edtavControlcalidad_valoresestandars_ccsta_sdt__ccsvtol_Jsonclick = "" ;
      edtavControlcalidad_valoresestandars_ccsta_sdt__ccsvtol_Enabled = 0 ;
      edtavControlcalidad_valoresestandars_ccsta_sdt__ccsauto_Jsonclick = "" ;
      edtavControlcalidad_valoresestandars_ccsta_sdt__ccsauto_Enabled = 0 ;
      edtavControlcalidad_valoresestandars_ccsta_sdt__cctlindsc_Jsonclick = "" ;
      edtavControlcalidad_valoresestandars_ccsta_sdt__cctlindsc_Enabled = 0 ;
      edtavControlcalidad_valoresestandars_ccsta_sdt__cctlin_Jsonclick = "" ;
      edtavControlcalidad_valoresestandars_ccsta_sdt__cctlin_Enabled = 0 ;
      subGridcontrolcalidad_valoresestandars_ccsta_sdts_Class = "GridNoBorder WorkWith" ;
      subGridcontrolcalidad_valoresestandars_ccsta_sdts_Backcolorstyle = (byte)(0) ;
      edtavControlcalidad_ccsta_sdt__cctval_Jsonclick = "" ;
      edtavControlcalidad_ccsta_sdt__cctval_Enabled = 0 ;
      edtavControlcalidad_ccsta_sdt__cctvaldsc_Jsonclick = "" ;
      edtavControlcalidad_ccsta_sdt__cctvaldsc_Enabled = 0 ;
      edtavControlcalidad_ccsta_sdt__cctvallin_Jsonclick = "" ;
      edtavControlcalidad_ccsta_sdt__cctvallin_Enabled = 0 ;
      subGridcontrolcalidad_ccsta_sdts_Class = "GridNoBorder WorkWith" ;
      subGridcontrolcalidad_ccsta_sdts_Backcolorstyle = (byte)(0) ;
      edtCCVal_Columnheaderclass = "" ;
      subGrid_Sortable = (byte)(0) ;
      edtavControlcalidad_valoresestandars_ccsta_sdt__ccvdsc_Enabled = -1 ;
      edtavControlcalidad_valoresestandars_ccsta_sdt__ccsmax_Enabled = -1 ;
      edtavControlcalidad_valoresestandars_ccsta_sdt__ccsmin_Enabled = -1 ;
      edtavControlcalidad_valoresestandars_ccsta_sdt__ccsvtol_Enabled = -1 ;
      edtavControlcalidad_valoresestandars_ccsta_sdt__ccsauto_Enabled = -1 ;
      edtavControlcalidad_valoresestandars_ccsta_sdt__cctlindsc_Enabled = -1 ;
      edtavControlcalidad_valoresestandars_ccsta_sdt__cctlin_Enabled = -1 ;
      edtavControlcalidad_ccsta_sdt__cctval_Enabled = -1 ;
      edtavControlcalidad_ccsta_sdt__cctvaldsc_Enabled = -1 ;
      edtavControlcalidad_ccsta_sdt__cctvallin_Enabled = -1 ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      lblTxtmensaje_Caption = "" ;
      chkavCcoklin.setEnabled( 1 );
      edtavCcval_Jsonclick = "" ;
      edtavCcval_Enabled = 1 ;
      edtavCcespecif_Jsonclick = "" ;
      edtavCcespecif_Enabled = 1 ;
      edtavCcmetodo_Jsonclick = "" ;
      edtavCcmetodo_Enabled = 1 ;
      edtavCctlindc2_Jsonclick = "" ;
      edtavCctlindc2_Enabled = 1 ;
      edtavCctlindsc_Jsonclick = "" ;
      edtavCctlindsc_Enabled = 1 ;
      edtavCctlin_Jsonclick = "" ;
      edtavCctlin_Enabled = 1 ;
      edtavFasdsc_Jsonclick = "" ;
      edtavFasdsc_Enabled = 0 ;
      edtavFascod_Jsonclick = "" ;
      edtavFascod_Enabled = 0 ;
      edtavBarordlin_Jsonclick = "" ;
      edtavBarordlin_Enabled = 0 ;
      edtavProdsc_Jsonclick = "" ;
      edtavProdsc_Enabled = 0 ;
      edtavProcod_Jsonclick = "" ;
      edtavProcod_Enabled = 0 ;
      edtavCctdsc_Jsonclick = "" ;
      edtavCctdsc_Enabled = 0 ;
      edtavCctcod_Jsonclick = "" ;
      edtavCctcod_Enabled = 0 ;
      edtavBarcodpar_Jsonclick = "" ;
      edtavBarcodpar_Enabled = 0 ;
      edtavBarcodreo_Jsonclick = "" ;
      edtavBarcodreo_Enabled = 0 ;
      edtavBarcod_Jsonclick = "" ;
      edtavBarcod_Enabled = 0 ;
      Gridcontrolcalidad_valoresestandars_ccsta_sdts_empowerer_Hascategories = GXutil.toBoolean( -1) ;
      Gridcontrolcalidad_valoresestandars_ccsta_sdts_titlescategories_Gridtitlescategories = ";;;;Valor;Valor;" ;
      Grid_empowerer_Hastitlesettings = GXutil.toBoolean( -1) ;
      Ddo_grid_Datalistproc = "ControlCalidadHTD.ControlCalidad_CC1_WKPGetFilterData" ;
      Ddo_grid_Datalisttype = "|Dynamic|Dynamic|Dynamic|Dynamic|Dynamic" ;
      Ddo_grid_Includedatalist = "|T|T|T|T|T" ;
      Ddo_grid_Filterisrange = "T|||||" ;
      Ddo_grid_Filtertype = "Numeric|Character|Character|Character|Character|Character" ;
      Ddo_grid_Includefilter = "T" ;
      Ddo_grid_Includesortasc = "T" ;
      Ddo_grid_Columnssortvalues = "2|3|4|5|6|7" ;
      Ddo_grid_Columnids = "0:CCTLin|1:CCTLinDsc|2:CCTLinDc2|3:CCMetodo|4:CCEspecif|5:CCVal" ;
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
      Dvpanel_unnamedtable1_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Iconposition = "Right" ;
      Dvpanel_unnamedtable1_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable1_Title = "" ;
      Dvpanel_unnamedtable1_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable1_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable1_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Width = "100%" ;
      Dvpanel_unnamedtable5_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable5_Iconposition = "Right" ;
      Dvpanel_unnamedtable5_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable5_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable5_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable5_Title = "" ;
      Dvpanel_unnamedtable5_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable5_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable5_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable5_Width = "100%" ;
      Dvpanel_panelvalorestandar_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_panelvalorestandar_Iconposition = "Right" ;
      Dvpanel_panelvalorestandar_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_panelvalorestandar_Collapsed = GXutil.toBoolean( 1) ;
      Dvpanel_panelvalorestandar_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_panelvalorestandar_Title = httpContext.getMessage( "Valores Estandars (#Lin)", "") ;
      Dvpanel_panelvalorestandar_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_panelvalorestandar_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_panelvalorestandar_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_panelvalorestandar_Width = "100%" ;
      Dvpanel_unnamedtable6_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable6_Iconposition = "Right" ;
      Dvpanel_unnamedtable6_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable6_Collapsed = GXutil.toBoolean( 1) ;
      Dvpanel_unnamedtable6_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable6_Title = httpContext.getMessage( "Informacion (#Lin)", "") ;
      Dvpanel_unnamedtable6_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable6_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable6_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable6_Width = "100%" ;
      Dvpanel_tableheader_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_tableheader_Iconposition = "Right" ;
      Dvpanel_tableheader_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_tableheader_Collapsed = GXutil.toBoolean( 1) ;
      Dvpanel_tableheader_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_tableheader_Title = httpContext.getMessage( "Informacion", "") ;
      Dvpanel_tableheader_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_tableheader_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_tableheader_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_tableheader_Width = "100%" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( " Datos Lineas (CC1)", "") );
      subGrid_Rows = 0 ;
      subGridcontrolcalidad_valoresestandars_ccsta_sdts_Rows = 0 ;
      subGridcontrolcalidad_ccsta_sdts_Rows = 0 ;
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
      }
   }

   public void init_web_controls( )
   {
      chkavCcoklin.setName( "vCCOKLIN" );
      chkavCcoklin.setWebtags( "" );
      chkavCcoklin.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkavCcoklin.getInternalname(), "TitleCaption", chkavCcoklin.getCaption(), true);
      chkavCcoklin.setCheckedValue( "0" );
      AV5CCOkLin = (byte)(((GXutil.strcmp(GXutil.ltrim( localUtil.ntoc( AV5CCOkLin, (byte)(1), (byte)(0), ".", "")), "1")==0) ? 1 : 0)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV5CCOkLin", GXutil.str( AV5CCOkLin, 1, 0));
      GXCCtl = "vCCOKLINGRID_" + sGXsfl_154_idx ;
      chkavCcoklingrid.setName( GXCCtl );
      chkavCcoklingrid.setWebtags( "" );
      chkavCcoklingrid.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkavCcoklingrid.getInternalname(), "TitleCaption", chkavCcoklingrid.getCaption(), !bGXsfl_154_Refreshing);
      chkavCcoklingrid.setCheckedValue( "false" );
      AV76CCOkLingrid = GXutil.strtobool( GXutil.booltostr( AV76CCOkLingrid)) ;
      httpContext.ajax_rsp_assign_attri("", false, chkavCcoklingrid.getInternalname(), AV76CCOkLingrid);
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRIDCONTROLCALIDAD_CCSTA_SDTS_nFirstRecordOnPage'},{av:'GRIDCONTROLCALIDAD_CCSTA_SDTS_nEOF'},{av:'AV26ControlCalidad_CCSTA_SDT',fld:'vCONTROLCALIDAD_CCSTA_SDT',grid:131,pic:''},{av:'nGXsfl_131_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:131},{av:'nRC_GXsfl_131',ctrl:'GRIDCONTROLCALIDAD_CCSTA_SDTS',prop:'GridRC',grid:131},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'GRIDCONTROLCALIDAD_VALORESESTANDARS_CCSTA_SDTS_nFirstRecordOnPage'},{av:'GRIDCONTROLCALIDAD_VALORESESTANDARS_CCSTA_SDTS_nEOF'},{av:'AV28ControlCalidad_ValoresEstandars_CCsta_SDT',fld:'vCONTROLCALIDAD_VALORESESTANDARS_CCSTA_SDT',grid:141,pic:''},{av:'nGXsfl_141_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:141},{av:'nRC_GXsfl_141',ctrl:'GRIDCONTROLCALIDAD_VALORESESTANDARS_CCSTA_SDTS',prop:'GridRC',grid:141},{av:'subGridcontrolcalidad_ccsta_sdts_Rows',ctrl:'GRIDCONTROLCALIDAD_CCSTA_SDTS',prop:'Rows'},{av:'subGridcontrolcalidad_valoresestandars_ccsta_sdts_Rows',ctrl:'GRIDCONTROLCALIDAD_VALORESESTANDARS_CCSTA_SDTS',prop:'Rows'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV31EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV9BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV11BarCodReo',fld:'vBARCODREO',pic:'9',hsh:true},{av:'AV10BarCodPar',fld:'vBARCODPAR',pic:'',hsh:true},{av:'AV48ProCod',fld:'vPROCOD',pic:'',hsh:true},{av:'AV14BarOrdLin',fld:'vBARORDLIN',pic:'ZZZ9',hsh:true},{av:'AV19CCTCod',fld:'vCCTCOD',pic:'ZZZZZ9',hsh:true},{av:'AV96Pgmname',fld:'vPGMNAME',pic:''},{av:'AV45OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV46OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV58TFCCTLin',fld:'vTFCCTLIN',pic:'ZZZ9'},{av:'AV59TFCCTLin_To',fld:'vTFCCTLIN_TO',pic:'ZZZ9'},{av:'AV62TFCCTLinDsc',fld:'vTFCCTLINDSC',pic:''},{av:'AV63TFCCTLinDsc_Sel',fld:'vTFCCTLINDSC_SEL',pic:''},{av:'AV60TFCCTLinDc2',fld:'vTFCCTLINDC2',pic:''},{av:'AV61TFCCTLinDc2_Sel',fld:'vTFCCTLINDC2_SEL',pic:''},{av:'AV54TFCCMetodo',fld:'vTFCCMETODO',pic:''},{av:'AV55TFCCMetodo_Sel',fld:'vTFCCMETODO_SEL',pic:''},{av:'AV52TFCCEspecif',fld:'vTFCCESPECIF',pic:''},{av:'AV53TFCCEspecif_Sel',fld:'vTFCCESPECIF_SEL',pic:''},{av:'AV64TFCCVal',fld:'vTFCCVAL',pic:''},{av:'AV65TFCCVal_Sel',fld:'vTFCCVAL_SEL',pic:''},{av:'AV5CCOkLin',fld:'vCCOKLIN',pic:'9'},{av:'AV25clicod',fld:'vCLICOD',pic:'ZZZZZ9',hsh:true},{av:'AV15Barser',fld:'vBARSER',pic:'',hsh:true},{av:'AV12barcolnom',fld:'vBARCOLNOM',pic:'',hsh:true},{av:'AV13barcolnum',fld:'vBARCOLNUM',pic:'ZZZZZ9',hsh:true},{av:'AV71AvisoCC',fld:'vAVISOCC',pic:'ZZZ9',hsh:true},{av:'AV73CCTVal',fld:'vCCTVAL',pic:'',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV36GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV37GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'edtCCVal_Columnheaderclass',ctrl:'CCVAL',prop:'Columnheaderclass'}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e112CE2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGridcontrolcalidad_ccsta_sdts_Rows',ctrl:'GRIDCONTROLCALIDAD_CCSTA_SDTS',prop:'Rows'},{av:'subGridcontrolcalidad_valoresestandars_ccsta_sdts_Rows',ctrl:'GRIDCONTROLCALIDAD_VALORESESTANDARS_CCSTA_SDTS',prop:'Rows'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV31EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV9BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV11BarCodReo',fld:'vBARCODREO',pic:'9',hsh:true},{av:'AV10BarCodPar',fld:'vBARCODPAR',pic:'',hsh:true},{av:'AV48ProCod',fld:'vPROCOD',pic:'',hsh:true},{av:'AV14BarOrdLin',fld:'vBARORDLIN',pic:'ZZZ9',hsh:true},{av:'AV19CCTCod',fld:'vCCTCOD',pic:'ZZZZZ9',hsh:true},{av:'AV96Pgmname',fld:'vPGMNAME',pic:''},{av:'AV45OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV46OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV58TFCCTLin',fld:'vTFCCTLIN',pic:'ZZZ9'},{av:'AV59TFCCTLin_To',fld:'vTFCCTLIN_TO',pic:'ZZZ9'},{av:'AV62TFCCTLinDsc',fld:'vTFCCTLINDSC',pic:''},{av:'AV63TFCCTLinDsc_Sel',fld:'vTFCCTLINDSC_SEL',pic:''},{av:'AV60TFCCTLinDc2',fld:'vTFCCTLINDC2',pic:''},{av:'AV61TFCCTLinDc2_Sel',fld:'vTFCCTLINDC2_SEL',pic:''},{av:'AV54TFCCMetodo',fld:'vTFCCMETODO',pic:''},{av:'AV55TFCCMetodo_Sel',fld:'vTFCCMETODO_SEL',pic:''},{av:'AV52TFCCEspecif',fld:'vTFCCESPECIF',pic:''},{av:'AV53TFCCEspecif_Sel',fld:'vTFCCESPECIF_SEL',pic:''},{av:'AV64TFCCVal',fld:'vTFCCVAL',pic:''},{av:'AV65TFCCVal_Sel',fld:'vTFCCVAL_SEL',pic:''},{av:'AV5CCOkLin',fld:'vCCOKLIN',pic:'9'},{av:'AV25clicod',fld:'vCLICOD',pic:'ZZZZZ9',hsh:true},{av:'AV15Barser',fld:'vBARSER',pic:'',hsh:true},{av:'AV12barcolnom',fld:'vBARCOLNOM',pic:'',hsh:true},{av:'AV13barcolnum',fld:'vBARCOLNUM',pic:'ZZZZZ9',hsh:true},{av:'AV71AvisoCC',fld:'vAVISOCC',pic:'ZZZ9',hsh:true},{av:'AV73CCTVal',fld:'vCCTVAL',pic:'',hsh:true},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e122CE2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGridcontrolcalidad_ccsta_sdts_Rows',ctrl:'GRIDCONTROLCALIDAD_CCSTA_SDTS',prop:'Rows'},{av:'subGridcontrolcalidad_valoresestandars_ccsta_sdts_Rows',ctrl:'GRIDCONTROLCALIDAD_VALORESESTANDARS_CCSTA_SDTS',prop:'Rows'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV31EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV9BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV11BarCodReo',fld:'vBARCODREO',pic:'9',hsh:true},{av:'AV10BarCodPar',fld:'vBARCODPAR',pic:'',hsh:true},{av:'AV48ProCod',fld:'vPROCOD',pic:'',hsh:true},{av:'AV14BarOrdLin',fld:'vBARORDLIN',pic:'ZZZ9',hsh:true},{av:'AV19CCTCod',fld:'vCCTCOD',pic:'ZZZZZ9',hsh:true},{av:'AV96Pgmname',fld:'vPGMNAME',pic:''},{av:'AV45OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV46OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV58TFCCTLin',fld:'vTFCCTLIN',pic:'ZZZ9'},{av:'AV59TFCCTLin_To',fld:'vTFCCTLIN_TO',pic:'ZZZ9'},{av:'AV62TFCCTLinDsc',fld:'vTFCCTLINDSC',pic:''},{av:'AV63TFCCTLinDsc_Sel',fld:'vTFCCTLINDSC_SEL',pic:''},{av:'AV60TFCCTLinDc2',fld:'vTFCCTLINDC2',pic:''},{av:'AV61TFCCTLinDc2_Sel',fld:'vTFCCTLINDC2_SEL',pic:''},{av:'AV54TFCCMetodo',fld:'vTFCCMETODO',pic:''},{av:'AV55TFCCMetodo_Sel',fld:'vTFCCMETODO_SEL',pic:''},{av:'AV52TFCCEspecif',fld:'vTFCCESPECIF',pic:''},{av:'AV53TFCCEspecif_Sel',fld:'vTFCCESPECIF_SEL',pic:''},{av:'AV64TFCCVal',fld:'vTFCCVAL',pic:''},{av:'AV65TFCCVal_Sel',fld:'vTFCCVAL_SEL',pic:''},{av:'AV5CCOkLin',fld:'vCCOKLIN',pic:'9'},{av:'AV25clicod',fld:'vCLICOD',pic:'ZZZZZ9',hsh:true},{av:'AV15Barser',fld:'vBARSER',pic:'',hsh:true},{av:'AV12barcolnom',fld:'vBARCOLNOM',pic:'',hsh:true},{av:'AV13barcolnum',fld:'vBARCOLNUM',pic:'ZZZZZ9',hsh:true},{av:'AV71AvisoCC',fld:'vAVISOCC',pic:'ZZZ9',hsh:true},{av:'AV73CCTVal',fld:'vCCTVAL',pic:'',hsh:true},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e132CE2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGridcontrolcalidad_ccsta_sdts_Rows',ctrl:'GRIDCONTROLCALIDAD_CCSTA_SDTS',prop:'Rows'},{av:'subGridcontrolcalidad_valoresestandars_ccsta_sdts_Rows',ctrl:'GRIDCONTROLCALIDAD_VALORESESTANDARS_CCSTA_SDTS',prop:'Rows'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV31EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV9BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV11BarCodReo',fld:'vBARCODREO',pic:'9',hsh:true},{av:'AV10BarCodPar',fld:'vBARCODPAR',pic:'',hsh:true},{av:'AV48ProCod',fld:'vPROCOD',pic:'',hsh:true},{av:'AV14BarOrdLin',fld:'vBARORDLIN',pic:'ZZZ9',hsh:true},{av:'AV19CCTCod',fld:'vCCTCOD',pic:'ZZZZZ9',hsh:true},{av:'AV96Pgmname',fld:'vPGMNAME',pic:''},{av:'AV45OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV46OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV58TFCCTLin',fld:'vTFCCTLIN',pic:'ZZZ9'},{av:'AV59TFCCTLin_To',fld:'vTFCCTLIN_TO',pic:'ZZZ9'},{av:'AV62TFCCTLinDsc',fld:'vTFCCTLINDSC',pic:''},{av:'AV63TFCCTLinDsc_Sel',fld:'vTFCCTLINDSC_SEL',pic:''},{av:'AV60TFCCTLinDc2',fld:'vTFCCTLINDC2',pic:''},{av:'AV61TFCCTLinDc2_Sel',fld:'vTFCCTLINDC2_SEL',pic:''},{av:'AV54TFCCMetodo',fld:'vTFCCMETODO',pic:''},{av:'AV55TFCCMetodo_Sel',fld:'vTFCCMETODO_SEL',pic:''},{av:'AV52TFCCEspecif',fld:'vTFCCESPECIF',pic:''},{av:'AV53TFCCEspecif_Sel',fld:'vTFCCESPECIF_SEL',pic:''},{av:'AV64TFCCVal',fld:'vTFCCVAL',pic:''},{av:'AV65TFCCVal_Sel',fld:'vTFCCVAL_SEL',pic:''},{av:'AV5CCOkLin',fld:'vCCOKLIN',pic:'9'},{av:'AV25clicod',fld:'vCLICOD',pic:'ZZZZZ9',hsh:true},{av:'AV15Barser',fld:'vBARSER',pic:'',hsh:true},{av:'AV12barcolnom',fld:'vBARCOLNOM',pic:'',hsh:true},{av:'AV13barcolnum',fld:'vBARCOLNUM',pic:'ZZZZZ9',hsh:true},{av:'AV71AvisoCC',fld:'vAVISOCC',pic:'ZZZ9',hsh:true},{av:'AV73CCTVal',fld:'vCCTVAL',pic:'',hsh:true},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'},{av:'Ddo_grid_Selectedvalue_get',ctrl:'DDO_GRID',prop:'SelectedValue_get'},{av:'Ddo_grid_Filteredtextto_get',ctrl:'DDO_GRID',prop:'FilteredTextTo_get'},{av:'Ddo_grid_Filteredtext_get',ctrl:'DDO_GRID',prop:'FilteredText_get'},{av:'Ddo_grid_Selectedcolumn',ctrl:'DDO_GRID',prop:'SelectedColumn'}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV45OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV46OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV64TFCCVal',fld:'vTFCCVAL',pic:''},{av:'AV65TFCCVal_Sel',fld:'vTFCCVAL_SEL',pic:''},{av:'AV52TFCCEspecif',fld:'vTFCCESPECIF',pic:''},{av:'AV53TFCCEspecif_Sel',fld:'vTFCCESPECIF_SEL',pic:''},{av:'AV54TFCCMetodo',fld:'vTFCCMETODO',pic:''},{av:'AV55TFCCMetodo_Sel',fld:'vTFCCMETODO_SEL',pic:''},{av:'AV60TFCCTLinDc2',fld:'vTFCCTLINDC2',pic:''},{av:'AV61TFCCTLinDc2_Sel',fld:'vTFCCTLINDC2_SEL',pic:''},{av:'AV62TFCCTLinDsc',fld:'vTFCCTLINDSC',pic:''},{av:'AV63TFCCTLinDsc_Sel',fld:'vTFCCTLINDSC_SEL',pic:''},{av:'AV58TFCCTLin',fld:'vTFCCTLIN',pic:'ZZZ9'},{av:'AV59TFCCTLin_To',fld:'vTFCCTLIN_TO',pic:'ZZZ9'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e222CE4',iparms:[{av:'A12750CCOkLin',fld:'CCOKLIN',pic:'9'},{av:'A4035CCVal',fld:'CCVAL',pic:''}]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'AV76CCOkLingrid',fld:'vCCOKLINGRID',pic:''},{av:'edtCCVal_Columnclass',ctrl:'CCVAL',prop:'Columnclass'}]}");
      setEventMetadata("'DOLIMPIARVARIABLES'","{handler:'e142CE2',iparms:[{av:'GRIDCONTROLCALIDAD_CCSTA_SDTS_nFirstRecordOnPage'},{av:'GRIDCONTROLCALIDAD_CCSTA_SDTS_nEOF'},{av:'AV26ControlCalidad_CCSTA_SDT',fld:'vCONTROLCALIDAD_CCSTA_SDT',grid:131,pic:''},{av:'nGXsfl_131_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:131},{av:'nRC_GXsfl_131',ctrl:'GRIDCONTROLCALIDAD_CCSTA_SDTS',prop:'GridRC',grid:131},{av:'subGridcontrolcalidad_ccsta_sdts_Rows',ctrl:'GRIDCONTROLCALIDAD_CCSTA_SDTS',prop:'Rows'},{av:'subGridcontrolcalidad_valoresestandars_ccsta_sdts_Rows',ctrl:'GRIDCONTROLCALIDAD_VALORESESTANDARS_CCSTA_SDTS',prop:'Rows'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV96Pgmname',fld:'vPGMNAME',pic:''},{av:'AV45OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV46OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV58TFCCTLin',fld:'vTFCCTLIN',pic:'ZZZ9'},{av:'AV59TFCCTLin_To',fld:'vTFCCTLIN_TO',pic:'ZZZ9'},{av:'AV62TFCCTLinDsc',fld:'vTFCCTLINDSC',pic:''},{av:'AV63TFCCTLinDsc_Sel',fld:'vTFCCTLINDSC_SEL',pic:''},{av:'AV60TFCCTLinDc2',fld:'vTFCCTLINDC2',pic:''},{av:'AV61TFCCTLinDc2_Sel',fld:'vTFCCTLINDC2_SEL',pic:''},{av:'AV54TFCCMetodo',fld:'vTFCCMETODO',pic:''},{av:'AV55TFCCMetodo_Sel',fld:'vTFCCMETODO_SEL',pic:''},{av:'AV52TFCCEspecif',fld:'vTFCCESPECIF',pic:''},{av:'AV53TFCCEspecif_Sel',fld:'vTFCCESPECIF_SEL',pic:''},{av:'AV64TFCCVal',fld:'vTFCCVAL',pic:''},{av:'AV65TFCCVal_Sel',fld:'vTFCCVAL_SEL',pic:''},{av:'AV5CCOkLin',fld:'vCCOKLIN',pic:'9'},{av:'AV31EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV25clicod',fld:'vCLICOD',pic:'ZZZZZ9',hsh:true},{av:'AV15Barser',fld:'vBARSER',pic:'',hsh:true},{av:'AV12barcolnom',fld:'vBARCOLNOM',pic:'',hsh:true},{av:'AV13barcolnum',fld:'vBARCOLNUM',pic:'ZZZZZ9',hsh:true},{av:'AV71AvisoCC',fld:'vAVISOCC',pic:'ZZZ9',hsh:true},{av:'AV73CCTVal',fld:'vCCTVAL',pic:'',hsh:true},{av:'AV9BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV11BarCodReo',fld:'vBARCODREO',pic:'9',hsh:true},{av:'AV10BarCodPar',fld:'vBARCODPAR',pic:'',hsh:true},{av:'AV48ProCod',fld:'vPROCOD',pic:'',hsh:true},{av:'AV14BarOrdLin',fld:'vBARORDLIN',pic:'ZZZ9',hsh:true},{av:'AV19CCTCod',fld:'vCCTCOD',pic:'ZZZZZ9',hsh:true},{av:'AV21CCTLin',fld:'vCCTLIN',pic:'ZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A4031CCTCod',fld:'CCTCOD',pic:'ZZZZZ9'},{av:'A4034CCTLin',fld:'CCTLIN',pic:'ZZZ9'},{av:'A4049CCTValLin',fld:'CCTVALLIN',pic:'Z9'},{av:'A4051CCTVal',fld:'CCTVAL',pic:''},{av:'A4050CCTValDsc',fld:'CCTVALDSC',pic:''},{av:'AV28ControlCalidad_ValoresEstandars_CCsta_SDT',fld:'vCONTROLCALIDAD_VALORESESTANDARS_CCSTA_SDT',grid:141,pic:''},{av:'nGXsfl_141_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:141},{av:'GRIDCONTROLCALIDAD_VALORESESTANDARS_CCSTA_SDTS_nFirstRecordOnPage'},{av:'nRC_GXsfl_141',ctrl:'GRIDCONTROLCALIDAD_VALORESESTANDARS_CCSTA_SDTS',prop:'GridRC',grid:141},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'GRIDCONTROLCALIDAD_VALORESESTANDARS_CCSTA_SDTS_nEOF'}]");
      setEventMetadata("'DOLIMPIARVARIABLES'",",oparms:[{av:'AV21CCTLin',fld:'vCCTLIN',pic:'ZZZ9'},{av:'AV17CCEspecif',fld:'vCCESPECIF',pic:''},{av:'AV18CCMetodo',fld:'vCCMETODO',pic:''},{av:'AV5CCOkLin',fld:'vCCOKLIN',pic:'9'},{av:'AV22CCTLinDc2',fld:'vCCTLINDC2',pic:''},{av:'AV23CCTLinDsc',fld:'vCCTLINDSC',pic:''},{av:'AV24CCVal',fld:'vCCVAL',pic:''},{av:'lblTxtmensaje_Caption',ctrl:'TXTMENSAJE',prop:'Caption'},{av:'AV26ControlCalidad_CCSTA_SDT',fld:'vCONTROLCALIDAD_CCSTA_SDT',grid:131,pic:''},{av:'nGXsfl_131_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:131},{av:'GRIDCONTROLCALIDAD_CCSTA_SDTS_nFirstRecordOnPage'},{av:'nRC_GXsfl_131',ctrl:'GRIDCONTROLCALIDAD_CCSTA_SDTS',prop:'GridRC',grid:131},{av:'AV28ControlCalidad_ValoresEstandars_CCsta_SDT',fld:'vCONTROLCALIDAD_VALORESESTANDARS_CCSTA_SDT',grid:141,pic:''},{av:'nGXsfl_141_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:141},{av:'GRIDCONTROLCALIDAD_VALORESESTANDARS_CCSTA_SDTS_nFirstRecordOnPage'},{av:'nRC_GXsfl_141',ctrl:'GRIDCONTROLCALIDAD_VALORESESTANDARS_CCSTA_SDTS',prop:'GridRC',grid:141},{av:'AV36GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV37GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'edtCCVal_Columnheaderclass',ctrl:'CCVAL',prop:'Columnheaderclass'}]}");
      setEventMetadata("'DOCERRAR'","{handler:'e152CE2',iparms:[]");
      setEventMetadata("'DOCERRAR'",",oparms:[]}");
      setEventMetadata("GRIDCONTROLCALIDAD_VALORESESTANDARS_CCSTA_SDTS.LOAD","{handler:'e212CE5',iparms:[]");
      setEventMetadata("GRIDCONTROLCALIDAD_VALORESESTANDARS_CCSTA_SDTS.LOAD",",oparms:[]}");
      setEventMetadata("GRIDCONTROLCALIDAD_CCSTA_SDTS.LOAD","{handler:'e202CE2',iparms:[]");
      setEventMetadata("GRIDCONTROLCALIDAD_CCSTA_SDTS.LOAD",",oparms:[]}");
      setEventMetadata("VCCVAL.ISVALID","{handler:'e162CE2',iparms:[{av:'GRIDCONTROLCALIDAD_CCSTA_SDTS_nFirstRecordOnPage'},{av:'GRIDCONTROLCALIDAD_CCSTA_SDTS_nEOF'},{av:'AV26ControlCalidad_CCSTA_SDT',fld:'vCONTROLCALIDAD_CCSTA_SDT',grid:131,pic:''},{av:'nGXsfl_131_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:131},{av:'nRC_GXsfl_131',ctrl:'GRIDCONTROLCALIDAD_CCSTA_SDTS',prop:'GridRC',grid:131},{av:'subGridcontrolcalidad_ccsta_sdts_Rows',ctrl:'GRIDCONTROLCALIDAD_CCSTA_SDTS',prop:'Rows'},{av:'subGridcontrolcalidad_valoresestandars_ccsta_sdts_Rows',ctrl:'GRIDCONTROLCALIDAD_VALORESESTANDARS_CCSTA_SDTS',prop:'Rows'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV96Pgmname',fld:'vPGMNAME',pic:''},{av:'AV45OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV46OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV58TFCCTLin',fld:'vTFCCTLIN',pic:'ZZZ9'},{av:'AV59TFCCTLin_To',fld:'vTFCCTLIN_TO',pic:'ZZZ9'},{av:'AV62TFCCTLinDsc',fld:'vTFCCTLINDSC',pic:''},{av:'AV63TFCCTLinDsc_Sel',fld:'vTFCCTLINDSC_SEL',pic:''},{av:'AV60TFCCTLinDc2',fld:'vTFCCTLINDC2',pic:''},{av:'AV61TFCCTLinDc2_Sel',fld:'vTFCCTLINDC2_SEL',pic:''},{av:'AV54TFCCMetodo',fld:'vTFCCMETODO',pic:''},{av:'AV55TFCCMetodo_Sel',fld:'vTFCCMETODO_SEL',pic:''},{av:'AV52TFCCEspecif',fld:'vTFCCESPECIF',pic:''},{av:'AV53TFCCEspecif_Sel',fld:'vTFCCESPECIF_SEL',pic:''},{av:'AV64TFCCVal',fld:'vTFCCVAL',pic:''},{av:'AV65TFCCVal_Sel',fld:'vTFCCVAL_SEL',pic:''},{av:'AV5CCOkLin',fld:'vCCOKLIN',pic:'9'},{av:'AV31EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV25clicod',fld:'vCLICOD',pic:'ZZZZZ9',hsh:true},{av:'AV15Barser',fld:'vBARSER',pic:'',hsh:true},{av:'AV12barcolnom',fld:'vBARCOLNOM',pic:'',hsh:true},{av:'AV13barcolnum',fld:'vBARCOLNUM',pic:'ZZZZZ9',hsh:true},{av:'AV71AvisoCC',fld:'vAVISOCC',pic:'ZZZ9',hsh:true},{av:'AV73CCTVal',fld:'vCCTVAL',pic:'',hsh:true},{av:'AV9BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV11BarCodReo',fld:'vBARCODREO',pic:'9',hsh:true},{av:'AV10BarCodPar',fld:'vBARCODPAR',pic:'',hsh:true},{av:'AV48ProCod',fld:'vPROCOD',pic:'',hsh:true},{av:'AV14BarOrdLin',fld:'vBARORDLIN',pic:'ZZZ9',hsh:true},{av:'AV19CCTCod',fld:'vCCTCOD',pic:'ZZZZZ9',hsh:true},{av:'AV24CCVal',fld:'vCCVAL',pic:''},{av:'AV21CCTLin',fld:'vCCTLIN',pic:'ZZZ9'},{av:'AV23CCTLinDsc',fld:'vCCTLINDSC',pic:''},{av:'AV43Mask',fld:'vMASK',pic:''},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'GRIDCONTROLCALIDAD_VALORESESTANDARS_CCSTA_SDTS_nFirstRecordOnPage'},{av:'GRIDCONTROLCALIDAD_VALORESESTANDARS_CCSTA_SDTS_nEOF'},{av:'AV28ControlCalidad_ValoresEstandars_CCsta_SDT',fld:'vCONTROLCALIDAD_VALORESESTANDARS_CCSTA_SDT',grid:141,pic:''},{av:'nGXsfl_141_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:141},{av:'nRC_GXsfl_141',ctrl:'GRIDCONTROLCALIDAD_VALORESESTANDARS_CCSTA_SDTS',prop:'GridRC',grid:141}]");
      setEventMetadata("VCCVAL.ISVALID",",oparms:[{av:'lblTxtmensaje_Caption',ctrl:'TXTMENSAJE',prop:'Caption'},{av:'AV5CCOkLin',fld:'vCCOKLIN',pic:'9'},{av:'AV43Mask',fld:'vMASK',pic:''},{av:'AV44mensaje',fld:'vMENSAJE',pic:''},{av:'AV36GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV37GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'edtCCVal_Columnheaderclass',ctrl:'CCVAL',prop:'Columnheaderclass'}]}");
      setEventMetadata("CCTLIN.CLICK","{handler:'e232CE2',iparms:[{av:'GRIDCONTROLCALIDAD_CCSTA_SDTS_nFirstRecordOnPage'},{av:'GRIDCONTROLCALIDAD_CCSTA_SDTS_nEOF'},{av:'AV26ControlCalidad_CCSTA_SDT',fld:'vCONTROLCALIDAD_CCSTA_SDT',grid:131,pic:''},{av:'nGXsfl_131_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:131},{av:'nRC_GXsfl_131',ctrl:'GRIDCONTROLCALIDAD_CCSTA_SDTS',prop:'GridRC',grid:131},{av:'subGridcontrolcalidad_ccsta_sdts_Rows',ctrl:'GRIDCONTROLCALIDAD_CCSTA_SDTS',prop:'Rows'},{av:'subGridcontrolcalidad_valoresestandars_ccsta_sdts_Rows',ctrl:'GRIDCONTROLCALIDAD_VALORESESTANDARS_CCSTA_SDTS',prop:'Rows'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV96Pgmname',fld:'vPGMNAME',pic:''},{av:'AV45OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV46OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV58TFCCTLin',fld:'vTFCCTLIN',pic:'ZZZ9'},{av:'AV59TFCCTLin_To',fld:'vTFCCTLIN_TO',pic:'ZZZ9'},{av:'AV62TFCCTLinDsc',fld:'vTFCCTLINDSC',pic:''},{av:'AV63TFCCTLinDsc_Sel',fld:'vTFCCTLINDSC_SEL',pic:''},{av:'AV60TFCCTLinDc2',fld:'vTFCCTLINDC2',pic:''},{av:'AV61TFCCTLinDc2_Sel',fld:'vTFCCTLINDC2_SEL',pic:''},{av:'AV54TFCCMetodo',fld:'vTFCCMETODO',pic:''},{av:'AV55TFCCMetodo_Sel',fld:'vTFCCMETODO_SEL',pic:''},{av:'AV52TFCCEspecif',fld:'vTFCCESPECIF',pic:''},{av:'AV53TFCCEspecif_Sel',fld:'vTFCCESPECIF_SEL',pic:''},{av:'AV64TFCCVal',fld:'vTFCCVAL',pic:''},{av:'AV65TFCCVal_Sel',fld:'vTFCCVAL_SEL',pic:''},{av:'AV5CCOkLin',fld:'vCCOKLIN',pic:'9'},{av:'AV31EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV25clicod',fld:'vCLICOD',pic:'ZZZZZ9',hsh:true},{av:'AV15Barser',fld:'vBARSER',pic:'',hsh:true},{av:'AV12barcolnom',fld:'vBARCOLNOM',pic:'',hsh:true},{av:'AV13barcolnum',fld:'vBARCOLNUM',pic:'ZZZZZ9',hsh:true},{av:'AV71AvisoCC',fld:'vAVISOCC',pic:'ZZZ9',hsh:true},{av:'AV73CCTVal',fld:'vCCTVAL',pic:'',hsh:true},{av:'AV9BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV11BarCodReo',fld:'vBARCODREO',pic:'9',hsh:true},{av:'AV10BarCodPar',fld:'vBARCODPAR',pic:'',hsh:true},{av:'AV48ProCod',fld:'vPROCOD',pic:'',hsh:true},{av:'AV14BarOrdLin',fld:'vBARORDLIN',pic:'ZZZ9',hsh:true},{av:'AV19CCTCod',fld:'vCCTCOD',pic:'ZZZZZ9',hsh:true},{av:'A4034CCTLin',fld:'CCTLIN',pic:'ZZZ9'},{av:'AV21CCTLin',fld:'vCCTLIN',pic:'ZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A4031CCTCod',fld:'CCTCOD',pic:'ZZZZZ9'},{av:'A4049CCTValLin',fld:'CCTVALLIN',pic:'Z9'},{av:'A4051CCTVal',fld:'CCTVAL',pic:''},{av:'A4050CCTValDsc',fld:'CCTVALDSC',pic:''},{av:'AV28ControlCalidad_ValoresEstandars_CCsta_SDT',fld:'vCONTROLCALIDAD_VALORESESTANDARS_CCSTA_SDT',grid:141,pic:''},{av:'nGXsfl_141_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:141},{av:'GRIDCONTROLCALIDAD_VALORESESTANDARS_CCSTA_SDTS_nFirstRecordOnPage'},{av:'nRC_GXsfl_141',ctrl:'GRIDCONTROLCALIDAD_VALORESESTANDARS_CCSTA_SDTS',prop:'GridRC',grid:141},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'GRIDCONTROLCALIDAD_VALORESESTANDARS_CCSTA_SDTS_nEOF'}]");
      setEventMetadata("CCTLIN.CLICK",",oparms:[{av:'lblTxtmensaje_Caption',ctrl:'TXTMENSAJE',prop:'Caption'},{av:'AV43Mask',fld:'vMASK',pic:''},{av:'AV22CCTLinDc2',fld:'vCCTLINDC2',pic:''},{av:'AV23CCTLinDsc',fld:'vCCTLINDSC',pic:''},{av:'AV5CCOkLin',fld:'vCCOKLIN',pic:'9'},{av:'AV24CCVal',fld:'vCCVAL',pic:''},{av:'AV17CCEspecif',fld:'vCCESPECIF',pic:''},{av:'AV18CCMetodo',fld:'vCCMETODO',pic:''},{av:'AV21CCTLin',fld:'vCCTLIN',pic:'ZZZ9'},{av:'AV26ControlCalidad_CCSTA_SDT',fld:'vCONTROLCALIDAD_CCSTA_SDT',grid:131,pic:''},{av:'nGXsfl_131_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:131},{av:'GRIDCONTROLCALIDAD_CCSTA_SDTS_nFirstRecordOnPage'},{av:'nRC_GXsfl_131',ctrl:'GRIDCONTROLCALIDAD_CCSTA_SDTS',prop:'GridRC',grid:131},{av:'AV28ControlCalidad_ValoresEstandars_CCsta_SDT',fld:'vCONTROLCALIDAD_VALORESESTANDARS_CCSTA_SDT',grid:141,pic:''},{av:'nGXsfl_141_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:141},{av:'GRIDCONTROLCALIDAD_VALORESESTANDARS_CCSTA_SDTS_nFirstRecordOnPage'},{av:'nRC_GXsfl_141',ctrl:'GRIDCONTROLCALIDAD_VALORESESTANDARS_CCSTA_SDTS',prop:'GridRC',grid:141},{av:'AV36GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV37GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'edtCCVal_Columnheaderclass',ctrl:'CCVAL',prop:'Columnheaderclass'}]}");
      setEventMetadata("ENTER","{handler:'e172CE2',iparms:[{av:'GRIDCONTROLCALIDAD_CCSTA_SDTS_nFirstRecordOnPage'},{av:'GRIDCONTROLCALIDAD_CCSTA_SDTS_nEOF'},{av:'AV26ControlCalidad_CCSTA_SDT',fld:'vCONTROLCALIDAD_CCSTA_SDT',grid:131,pic:''},{av:'nGXsfl_131_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:131},{av:'nRC_GXsfl_131',ctrl:'GRIDCONTROLCALIDAD_CCSTA_SDTS',prop:'GridRC',grid:131},{av:'subGridcontrolcalidad_ccsta_sdts_Rows',ctrl:'GRIDCONTROLCALIDAD_CCSTA_SDTS',prop:'Rows'},{av:'subGridcontrolcalidad_valoresestandars_ccsta_sdts_Rows',ctrl:'GRIDCONTROLCALIDAD_VALORESESTANDARS_CCSTA_SDTS',prop:'Rows'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV96Pgmname',fld:'vPGMNAME',pic:''},{av:'AV45OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV46OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV58TFCCTLin',fld:'vTFCCTLIN',pic:'ZZZ9'},{av:'AV59TFCCTLin_To',fld:'vTFCCTLIN_TO',pic:'ZZZ9'},{av:'AV62TFCCTLinDsc',fld:'vTFCCTLINDSC',pic:''},{av:'AV63TFCCTLinDsc_Sel',fld:'vTFCCTLINDSC_SEL',pic:''},{av:'AV60TFCCTLinDc2',fld:'vTFCCTLINDC2',pic:''},{av:'AV61TFCCTLinDc2_Sel',fld:'vTFCCTLINDC2_SEL',pic:''},{av:'AV54TFCCMetodo',fld:'vTFCCMETODO',pic:''},{av:'AV55TFCCMetodo_Sel',fld:'vTFCCMETODO_SEL',pic:''},{av:'AV52TFCCEspecif',fld:'vTFCCESPECIF',pic:''},{av:'AV53TFCCEspecif_Sel',fld:'vTFCCESPECIF_SEL',pic:''},{av:'AV64TFCCVal',fld:'vTFCCVAL',pic:''},{av:'AV65TFCCVal_Sel',fld:'vTFCCVAL_SEL',pic:''},{av:'AV5CCOkLin',fld:'vCCOKLIN',pic:'9'},{av:'AV31EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV25clicod',fld:'vCLICOD',pic:'ZZZZZ9',hsh:true},{av:'AV15Barser',fld:'vBARSER',pic:'',hsh:true},{av:'AV12barcolnom',fld:'vBARCOLNOM',pic:'',hsh:true},{av:'AV13barcolnum',fld:'vBARCOLNUM',pic:'ZZZZZ9',hsh:true},{av:'AV71AvisoCC',fld:'vAVISOCC',pic:'ZZZ9',hsh:true},{av:'AV73CCTVal',fld:'vCCTVAL',pic:'',hsh:true},{av:'AV9BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV11BarCodReo',fld:'vBARCODREO',pic:'9',hsh:true},{av:'AV10BarCodPar',fld:'vBARCODPAR',pic:'',hsh:true},{av:'AV48ProCod',fld:'vPROCOD',pic:'',hsh:true},{av:'AV14BarOrdLin',fld:'vBARORDLIN',pic:'ZZZ9',hsh:true},{av:'AV19CCTCod',fld:'vCCTCOD',pic:'ZZZZZ9',hsh:true},{av:'AV21CCTLin',fld:'vCCTLIN',pic:'ZZZ9'},{av:'AV24CCVal',fld:'vCCVAL',pic:''},{av:'AV23CCTLinDsc',fld:'vCCTLINDSC',pic:''},{av:'AV18CCMetodo',fld:'vCCMETODO',pic:''},{av:'AV17CCEspecif',fld:'vCCESPECIF',pic:''},{av:'AV44mensaje',fld:'vMENSAJE',pic:''},{av:'AV43Mask',fld:'vMASK',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A4031CCTCod',fld:'CCTCOD',pic:'ZZZZZ9'},{av:'A4034CCTLin',fld:'CCTLIN',pic:'ZZZ9'},{av:'A4049CCTValLin',fld:'CCTVALLIN',pic:'Z9'},{av:'A4051CCTVal',fld:'CCTVAL',pic:''},{av:'A4050CCTValDsc',fld:'CCTVALDSC',pic:''},{av:'AV28ControlCalidad_ValoresEstandars_CCsta_SDT',fld:'vCONTROLCALIDAD_VALORESESTANDARS_CCSTA_SDT',grid:141,pic:''},{av:'nGXsfl_141_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:141},{av:'GRIDCONTROLCALIDAD_VALORESESTANDARS_CCSTA_SDTS_nFirstRecordOnPage'},{av:'nRC_GXsfl_141',ctrl:'GRIDCONTROLCALIDAD_VALORESESTANDARS_CCSTA_SDTS',prop:'GridRC',grid:141},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'GRIDCONTROLCALIDAD_VALORESESTANDARS_CCSTA_SDTS_nEOF'}]");
      setEventMetadata("ENTER",",oparms:[{av:'lblTxtmensaje_Caption',ctrl:'TXTMENSAJE',prop:'Caption'},{av:'AV44mensaje',fld:'vMENSAJE',pic:''},{av:'AV43Mask',fld:'vMASK',pic:''},{av:'AV5CCOkLin',fld:'vCCOKLIN',pic:'9'},{av:'AV21CCTLin',fld:'vCCTLIN',pic:'ZZZ9'},{av:'AV17CCEspecif',fld:'vCCESPECIF',pic:''},{av:'AV18CCMetodo',fld:'vCCMETODO',pic:''},{av:'AV22CCTLinDc2',fld:'vCCTLINDC2',pic:''},{av:'AV23CCTLinDsc',fld:'vCCTLINDSC',pic:''},{av:'AV24CCVal',fld:'vCCVAL',pic:''},{av:'AV26ControlCalidad_CCSTA_SDT',fld:'vCONTROLCALIDAD_CCSTA_SDT',grid:131,pic:''},{av:'nGXsfl_131_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:131},{av:'GRIDCONTROLCALIDAD_CCSTA_SDTS_nFirstRecordOnPage'},{av:'nRC_GXsfl_131',ctrl:'GRIDCONTROLCALIDAD_CCSTA_SDTS',prop:'GridRC',grid:131},{av:'AV28ControlCalidad_ValoresEstandars_CCsta_SDT',fld:'vCONTROLCALIDAD_VALORESESTANDARS_CCSTA_SDT',grid:141,pic:''},{av:'nGXsfl_141_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:141},{av:'GRIDCONTROLCALIDAD_VALORESESTANDARS_CCSTA_SDTS_nFirstRecordOnPage'},{av:'nRC_GXsfl_141',ctrl:'GRIDCONTROLCALIDAD_VALORESESTANDARS_CCSTA_SDTS',prop:'GridRC',grid:141},{av:'AV36GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV37GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'edtCCVal_Columnheaderclass',ctrl:'CCVAL',prop:'Columnheaderclass'}]}");
      setEventMetadata("GRIDCONTROLCALIDAD_CCSTA_SDTS_FIRSTPAGE","{handler:'subgridcontrolcalidad_ccsta_sdts_firstpage',iparms:[{av:'GRIDCONTROLCALIDAD_CCSTA_SDTS_nFirstRecordOnPage'},{av:'GRIDCONTROLCALIDAD_CCSTA_SDTS_nEOF'},{av:'subGridcontrolcalidad_ccsta_sdts_Rows',ctrl:'GRIDCONTROLCALIDAD_CCSTA_SDTS',prop:'Rows'},{av:'subGridcontrolcalidad_valoresestandars_ccsta_sdts_Rows',ctrl:'GRIDCONTROLCALIDAD_VALORESESTANDARS_CCSTA_SDTS',prop:'Rows'},{av:'AV31EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV25clicod',fld:'vCLICOD',pic:'ZZZZZ9',hsh:true},{av:'AV15Barser',fld:'vBARSER',pic:'',hsh:true},{av:'AV12barcolnom',fld:'vBARCOLNOM',pic:'',hsh:true},{av:'AV13barcolnum',fld:'vBARCOLNUM',pic:'ZZZZZ9',hsh:true},{av:'AV71AvisoCC',fld:'vAVISOCC',pic:'ZZZ9',hsh:true},{av:'AV73CCTVal',fld:'vCCTVAL',pic:'',hsh:true},{av:'AV9BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV11BarCodReo',fld:'vBARCODREO',pic:'9',hsh:true},{av:'AV10BarCodPar',fld:'vBARCODPAR',pic:'',hsh:true},{av:'AV48ProCod',fld:'vPROCOD',pic:'',hsh:true},{av:'AV14BarOrdLin',fld:'vBARORDLIN',pic:'ZZZ9',hsh:true},{av:'AV19CCTCod',fld:'vCCTCOD',pic:'ZZZZZ9',hsh:true},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV96Pgmname',fld:'vPGMNAME',pic:''},{av:'AV45OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV46OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV58TFCCTLin',fld:'vTFCCTLIN',pic:'ZZZ9'},{av:'AV59TFCCTLin_To',fld:'vTFCCTLIN_TO',pic:'ZZZ9'},{av:'AV62TFCCTLinDsc',fld:'vTFCCTLINDSC',pic:''},{av:'AV63TFCCTLinDsc_Sel',fld:'vTFCCTLINDSC_SEL',pic:''},{av:'AV60TFCCTLinDc2',fld:'vTFCCTLINDC2',pic:''},{av:'AV61TFCCTLinDc2_Sel',fld:'vTFCCTLINDC2_SEL',pic:''},{av:'AV54TFCCMetodo',fld:'vTFCCMETODO',pic:''},{av:'AV55TFCCMetodo_Sel',fld:'vTFCCMETODO_SEL',pic:''},{av:'AV52TFCCEspecif',fld:'vTFCCESPECIF',pic:''},{av:'AV53TFCCEspecif_Sel',fld:'vTFCCESPECIF_SEL',pic:''},{av:'AV64TFCCVal',fld:'vTFCCVAL',pic:''},{av:'AV65TFCCVal_Sel',fld:'vTFCCVAL_SEL',pic:''},{av:'AV5CCOkLin',fld:'vCCOKLIN',pic:'9'},{av:'AV26ControlCalidad_CCSTA_SDT',fld:'vCONTROLCALIDAD_CCSTA_SDT',grid:131,pic:''},{av:'nGXsfl_131_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:131},{av:'nRC_GXsfl_131',ctrl:'GRIDCONTROLCALIDAD_CCSTA_SDTS',prop:'GridRC',grid:131}]");
      setEventMetadata("GRIDCONTROLCALIDAD_CCSTA_SDTS_FIRSTPAGE",",oparms:[{av:'AV36GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV37GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'edtCCVal_Columnheaderclass',ctrl:'CCVAL',prop:'Columnheaderclass'}]}");
      setEventMetadata("GRIDCONTROLCALIDAD_CCSTA_SDTS_PREVPAGE","{handler:'subgridcontrolcalidad_ccsta_sdts_previouspage',iparms:[{av:'GRIDCONTROLCALIDAD_CCSTA_SDTS_nFirstRecordOnPage'},{av:'GRIDCONTROLCALIDAD_CCSTA_SDTS_nEOF'},{av:'subGridcontrolcalidad_ccsta_sdts_Rows',ctrl:'GRIDCONTROLCALIDAD_CCSTA_SDTS',prop:'Rows'},{av:'subGridcontrolcalidad_valoresestandars_ccsta_sdts_Rows',ctrl:'GRIDCONTROLCALIDAD_VALORESESTANDARS_CCSTA_SDTS',prop:'Rows'},{av:'AV31EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV25clicod',fld:'vCLICOD',pic:'ZZZZZ9',hsh:true},{av:'AV15Barser',fld:'vBARSER',pic:'',hsh:true},{av:'AV12barcolnom',fld:'vBARCOLNOM',pic:'',hsh:true},{av:'AV13barcolnum',fld:'vBARCOLNUM',pic:'ZZZZZ9',hsh:true},{av:'AV71AvisoCC',fld:'vAVISOCC',pic:'ZZZ9',hsh:true},{av:'AV73CCTVal',fld:'vCCTVAL',pic:'',hsh:true},{av:'AV9BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV11BarCodReo',fld:'vBARCODREO',pic:'9',hsh:true},{av:'AV10BarCodPar',fld:'vBARCODPAR',pic:'',hsh:true},{av:'AV48ProCod',fld:'vPROCOD',pic:'',hsh:true},{av:'AV14BarOrdLin',fld:'vBARORDLIN',pic:'ZZZ9',hsh:true},{av:'AV19CCTCod',fld:'vCCTCOD',pic:'ZZZZZ9',hsh:true},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV96Pgmname',fld:'vPGMNAME',pic:''},{av:'AV45OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV46OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV58TFCCTLin',fld:'vTFCCTLIN',pic:'ZZZ9'},{av:'AV59TFCCTLin_To',fld:'vTFCCTLIN_TO',pic:'ZZZ9'},{av:'AV62TFCCTLinDsc',fld:'vTFCCTLINDSC',pic:''},{av:'AV63TFCCTLinDsc_Sel',fld:'vTFCCTLINDSC_SEL',pic:''},{av:'AV60TFCCTLinDc2',fld:'vTFCCTLINDC2',pic:''},{av:'AV61TFCCTLinDc2_Sel',fld:'vTFCCTLINDC2_SEL',pic:''},{av:'AV54TFCCMetodo',fld:'vTFCCMETODO',pic:''},{av:'AV55TFCCMetodo_Sel',fld:'vTFCCMETODO_SEL',pic:''},{av:'AV52TFCCEspecif',fld:'vTFCCESPECIF',pic:''},{av:'AV53TFCCEspecif_Sel',fld:'vTFCCESPECIF_SEL',pic:''},{av:'AV64TFCCVal',fld:'vTFCCVAL',pic:''},{av:'AV65TFCCVal_Sel',fld:'vTFCCVAL_SEL',pic:''},{av:'AV5CCOkLin',fld:'vCCOKLIN',pic:'9'},{av:'AV26ControlCalidad_CCSTA_SDT',fld:'vCONTROLCALIDAD_CCSTA_SDT',grid:131,pic:''},{av:'nGXsfl_131_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:131},{av:'nRC_GXsfl_131',ctrl:'GRIDCONTROLCALIDAD_CCSTA_SDTS',prop:'GridRC',grid:131}]");
      setEventMetadata("GRIDCONTROLCALIDAD_CCSTA_SDTS_PREVPAGE",",oparms:[{av:'AV36GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV37GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'edtCCVal_Columnheaderclass',ctrl:'CCVAL',prop:'Columnheaderclass'}]}");
      setEventMetadata("GRIDCONTROLCALIDAD_CCSTA_SDTS_NEXTPAGE","{handler:'subgridcontrolcalidad_ccsta_sdts_nextpage',iparms:[{av:'GRIDCONTROLCALIDAD_CCSTA_SDTS_nFirstRecordOnPage'},{av:'GRIDCONTROLCALIDAD_CCSTA_SDTS_nEOF'},{av:'subGridcontrolcalidad_ccsta_sdts_Rows',ctrl:'GRIDCONTROLCALIDAD_CCSTA_SDTS',prop:'Rows'},{av:'subGridcontrolcalidad_valoresestandars_ccsta_sdts_Rows',ctrl:'GRIDCONTROLCALIDAD_VALORESESTANDARS_CCSTA_SDTS',prop:'Rows'},{av:'AV31EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV25clicod',fld:'vCLICOD',pic:'ZZZZZ9',hsh:true},{av:'AV15Barser',fld:'vBARSER',pic:'',hsh:true},{av:'AV12barcolnom',fld:'vBARCOLNOM',pic:'',hsh:true},{av:'AV13barcolnum',fld:'vBARCOLNUM',pic:'ZZZZZ9',hsh:true},{av:'AV71AvisoCC',fld:'vAVISOCC',pic:'ZZZ9',hsh:true},{av:'AV73CCTVal',fld:'vCCTVAL',pic:'',hsh:true},{av:'AV9BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV11BarCodReo',fld:'vBARCODREO',pic:'9',hsh:true},{av:'AV10BarCodPar',fld:'vBARCODPAR',pic:'',hsh:true},{av:'AV48ProCod',fld:'vPROCOD',pic:'',hsh:true},{av:'AV14BarOrdLin',fld:'vBARORDLIN',pic:'ZZZ9',hsh:true},{av:'AV19CCTCod',fld:'vCCTCOD',pic:'ZZZZZ9',hsh:true},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV96Pgmname',fld:'vPGMNAME',pic:''},{av:'AV45OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV46OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV58TFCCTLin',fld:'vTFCCTLIN',pic:'ZZZ9'},{av:'AV59TFCCTLin_To',fld:'vTFCCTLIN_TO',pic:'ZZZ9'},{av:'AV62TFCCTLinDsc',fld:'vTFCCTLINDSC',pic:''},{av:'AV63TFCCTLinDsc_Sel',fld:'vTFCCTLINDSC_SEL',pic:''},{av:'AV60TFCCTLinDc2',fld:'vTFCCTLINDC2',pic:''},{av:'AV61TFCCTLinDc2_Sel',fld:'vTFCCTLINDC2_SEL',pic:''},{av:'AV54TFCCMetodo',fld:'vTFCCMETODO',pic:''},{av:'AV55TFCCMetodo_Sel',fld:'vTFCCMETODO_SEL',pic:''},{av:'AV52TFCCEspecif',fld:'vTFCCESPECIF',pic:''},{av:'AV53TFCCEspecif_Sel',fld:'vTFCCESPECIF_SEL',pic:''},{av:'AV64TFCCVal',fld:'vTFCCVAL',pic:''},{av:'AV65TFCCVal_Sel',fld:'vTFCCVAL_SEL',pic:''},{av:'AV5CCOkLin',fld:'vCCOKLIN',pic:'9'},{av:'AV26ControlCalidad_CCSTA_SDT',fld:'vCONTROLCALIDAD_CCSTA_SDT',grid:131,pic:''},{av:'nGXsfl_131_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:131},{av:'nRC_GXsfl_131',ctrl:'GRIDCONTROLCALIDAD_CCSTA_SDTS',prop:'GridRC',grid:131}]");
      setEventMetadata("GRIDCONTROLCALIDAD_CCSTA_SDTS_NEXTPAGE",",oparms:[{av:'AV36GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV37GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'edtCCVal_Columnheaderclass',ctrl:'CCVAL',prop:'Columnheaderclass'}]}");
      setEventMetadata("GRIDCONTROLCALIDAD_CCSTA_SDTS_LASTPAGE","{handler:'subgridcontrolcalidad_ccsta_sdts_lastpage',iparms:[{av:'GRIDCONTROLCALIDAD_CCSTA_SDTS_nFirstRecordOnPage'},{av:'GRIDCONTROLCALIDAD_CCSTA_SDTS_nEOF'},{av:'subGridcontrolcalidad_ccsta_sdts_Rows',ctrl:'GRIDCONTROLCALIDAD_CCSTA_SDTS',prop:'Rows'},{av:'subGridcontrolcalidad_valoresestandars_ccsta_sdts_Rows',ctrl:'GRIDCONTROLCALIDAD_VALORESESTANDARS_CCSTA_SDTS',prop:'Rows'},{av:'AV31EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV25clicod',fld:'vCLICOD',pic:'ZZZZZ9',hsh:true},{av:'AV15Barser',fld:'vBARSER',pic:'',hsh:true},{av:'AV12barcolnom',fld:'vBARCOLNOM',pic:'',hsh:true},{av:'AV13barcolnum',fld:'vBARCOLNUM',pic:'ZZZZZ9',hsh:true},{av:'AV71AvisoCC',fld:'vAVISOCC',pic:'ZZZ9',hsh:true},{av:'AV73CCTVal',fld:'vCCTVAL',pic:'',hsh:true},{av:'AV9BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV11BarCodReo',fld:'vBARCODREO',pic:'9',hsh:true},{av:'AV10BarCodPar',fld:'vBARCODPAR',pic:'',hsh:true},{av:'AV48ProCod',fld:'vPROCOD',pic:'',hsh:true},{av:'AV14BarOrdLin',fld:'vBARORDLIN',pic:'ZZZ9',hsh:true},{av:'AV19CCTCod',fld:'vCCTCOD',pic:'ZZZZZ9',hsh:true},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV96Pgmname',fld:'vPGMNAME',pic:''},{av:'AV45OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV46OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV58TFCCTLin',fld:'vTFCCTLIN',pic:'ZZZ9'},{av:'AV59TFCCTLin_To',fld:'vTFCCTLIN_TO',pic:'ZZZ9'},{av:'AV62TFCCTLinDsc',fld:'vTFCCTLINDSC',pic:''},{av:'AV63TFCCTLinDsc_Sel',fld:'vTFCCTLINDSC_SEL',pic:''},{av:'AV60TFCCTLinDc2',fld:'vTFCCTLINDC2',pic:''},{av:'AV61TFCCTLinDc2_Sel',fld:'vTFCCTLINDC2_SEL',pic:''},{av:'AV54TFCCMetodo',fld:'vTFCCMETODO',pic:''},{av:'AV55TFCCMetodo_Sel',fld:'vTFCCMETODO_SEL',pic:''},{av:'AV52TFCCEspecif',fld:'vTFCCESPECIF',pic:''},{av:'AV53TFCCEspecif_Sel',fld:'vTFCCESPECIF_SEL',pic:''},{av:'AV64TFCCVal',fld:'vTFCCVAL',pic:''},{av:'AV65TFCCVal_Sel',fld:'vTFCCVAL_SEL',pic:''},{av:'AV5CCOkLin',fld:'vCCOKLIN',pic:'9'},{av:'AV26ControlCalidad_CCSTA_SDT',fld:'vCONTROLCALIDAD_CCSTA_SDT',grid:131,pic:''},{av:'nGXsfl_131_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:131},{av:'nRC_GXsfl_131',ctrl:'GRIDCONTROLCALIDAD_CCSTA_SDTS',prop:'GridRC',grid:131}]");
      setEventMetadata("GRIDCONTROLCALIDAD_CCSTA_SDTS_LASTPAGE",",oparms:[{av:'AV36GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV37GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'edtCCVal_Columnheaderclass',ctrl:'CCVAL',prop:'Columnheaderclass'}]}");
      setEventMetadata("GRIDCONTROLCALIDAD_VALORESESTANDARS_CCSTA_SDTS_FIRSTPAGE","{handler:'subgridcontrolcalidad_valoresestandars_ccsta_sdts_firstpage',iparms:[{av:'GRIDCONTROLCALIDAD_VALORESESTANDARS_CCSTA_SDTS_nFirstRecordOnPage'},{av:'GRIDCONTROLCALIDAD_VALORESESTANDARS_CCSTA_SDTS_nEOF'},{av:'subGridcontrolcalidad_ccsta_sdts_Rows',ctrl:'GRIDCONTROLCALIDAD_CCSTA_SDTS',prop:'Rows'},{av:'subGridcontrolcalidad_valoresestandars_ccsta_sdts_Rows',ctrl:'GRIDCONTROLCALIDAD_VALORESESTANDARS_CCSTA_SDTS',prop:'Rows'},{av:'AV31EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV25clicod',fld:'vCLICOD',pic:'ZZZZZ9',hsh:true},{av:'AV15Barser',fld:'vBARSER',pic:'',hsh:true},{av:'AV12barcolnom',fld:'vBARCOLNOM',pic:'',hsh:true},{av:'AV13barcolnum',fld:'vBARCOLNUM',pic:'ZZZZZ9',hsh:true},{av:'AV71AvisoCC',fld:'vAVISOCC',pic:'ZZZ9',hsh:true},{av:'AV73CCTVal',fld:'vCCTVAL',pic:'',hsh:true},{av:'AV9BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV11BarCodReo',fld:'vBARCODREO',pic:'9',hsh:true},{av:'AV10BarCodPar',fld:'vBARCODPAR',pic:'',hsh:true},{av:'AV48ProCod',fld:'vPROCOD',pic:'',hsh:true},{av:'AV14BarOrdLin',fld:'vBARORDLIN',pic:'ZZZ9',hsh:true},{av:'AV19CCTCod',fld:'vCCTCOD',pic:'ZZZZZ9',hsh:true},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV96Pgmname',fld:'vPGMNAME',pic:''},{av:'AV45OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV46OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV58TFCCTLin',fld:'vTFCCTLIN',pic:'ZZZ9'},{av:'AV59TFCCTLin_To',fld:'vTFCCTLIN_TO',pic:'ZZZ9'},{av:'AV62TFCCTLinDsc',fld:'vTFCCTLINDSC',pic:''},{av:'AV63TFCCTLinDsc_Sel',fld:'vTFCCTLINDSC_SEL',pic:''},{av:'AV60TFCCTLinDc2',fld:'vTFCCTLINDC2',pic:''},{av:'AV61TFCCTLinDc2_Sel',fld:'vTFCCTLINDC2_SEL',pic:''},{av:'AV54TFCCMetodo',fld:'vTFCCMETODO',pic:''},{av:'AV55TFCCMetodo_Sel',fld:'vTFCCMETODO_SEL',pic:''},{av:'AV52TFCCEspecif',fld:'vTFCCESPECIF',pic:''},{av:'AV53TFCCEspecif_Sel',fld:'vTFCCESPECIF_SEL',pic:''},{av:'AV64TFCCVal',fld:'vTFCCVAL',pic:''},{av:'AV65TFCCVal_Sel',fld:'vTFCCVAL_SEL',pic:''},{av:'AV5CCOkLin',fld:'vCCOKLIN',pic:'9'},{av:'AV28ControlCalidad_ValoresEstandars_CCsta_SDT',fld:'vCONTROLCALIDAD_VALORESESTANDARS_CCSTA_SDT',grid:141,pic:''},{av:'nGXsfl_141_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:141},{av:'nRC_GXsfl_141',ctrl:'GRIDCONTROLCALIDAD_VALORESESTANDARS_CCSTA_SDTS',prop:'GridRC',grid:141}]");
      setEventMetadata("GRIDCONTROLCALIDAD_VALORESESTANDARS_CCSTA_SDTS_FIRSTPAGE",",oparms:[{av:'AV36GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV37GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'edtCCVal_Columnheaderclass',ctrl:'CCVAL',prop:'Columnheaderclass'}]}");
      setEventMetadata("GRIDCONTROLCALIDAD_VALORESESTANDARS_CCSTA_SDTS_PREVPAGE","{handler:'subgridcontrolcalidad_valoresestandars_ccsta_sdts_previouspage',iparms:[{av:'GRIDCONTROLCALIDAD_VALORESESTANDARS_CCSTA_SDTS_nFirstRecordOnPage'},{av:'GRIDCONTROLCALIDAD_VALORESESTANDARS_CCSTA_SDTS_nEOF'},{av:'subGridcontrolcalidad_ccsta_sdts_Rows',ctrl:'GRIDCONTROLCALIDAD_CCSTA_SDTS',prop:'Rows'},{av:'subGridcontrolcalidad_valoresestandars_ccsta_sdts_Rows',ctrl:'GRIDCONTROLCALIDAD_VALORESESTANDARS_CCSTA_SDTS',prop:'Rows'},{av:'AV31EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV25clicod',fld:'vCLICOD',pic:'ZZZZZ9',hsh:true},{av:'AV15Barser',fld:'vBARSER',pic:'',hsh:true},{av:'AV12barcolnom',fld:'vBARCOLNOM',pic:'',hsh:true},{av:'AV13barcolnum',fld:'vBARCOLNUM',pic:'ZZZZZ9',hsh:true},{av:'AV71AvisoCC',fld:'vAVISOCC',pic:'ZZZ9',hsh:true},{av:'AV73CCTVal',fld:'vCCTVAL',pic:'',hsh:true},{av:'AV9BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV11BarCodReo',fld:'vBARCODREO',pic:'9',hsh:true},{av:'AV10BarCodPar',fld:'vBARCODPAR',pic:'',hsh:true},{av:'AV48ProCod',fld:'vPROCOD',pic:'',hsh:true},{av:'AV14BarOrdLin',fld:'vBARORDLIN',pic:'ZZZ9',hsh:true},{av:'AV19CCTCod',fld:'vCCTCOD',pic:'ZZZZZ9',hsh:true},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV96Pgmname',fld:'vPGMNAME',pic:''},{av:'AV45OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV46OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV58TFCCTLin',fld:'vTFCCTLIN',pic:'ZZZ9'},{av:'AV59TFCCTLin_To',fld:'vTFCCTLIN_TO',pic:'ZZZ9'},{av:'AV62TFCCTLinDsc',fld:'vTFCCTLINDSC',pic:''},{av:'AV63TFCCTLinDsc_Sel',fld:'vTFCCTLINDSC_SEL',pic:''},{av:'AV60TFCCTLinDc2',fld:'vTFCCTLINDC2',pic:''},{av:'AV61TFCCTLinDc2_Sel',fld:'vTFCCTLINDC2_SEL',pic:''},{av:'AV54TFCCMetodo',fld:'vTFCCMETODO',pic:''},{av:'AV55TFCCMetodo_Sel',fld:'vTFCCMETODO_SEL',pic:''},{av:'AV52TFCCEspecif',fld:'vTFCCESPECIF',pic:''},{av:'AV53TFCCEspecif_Sel',fld:'vTFCCESPECIF_SEL',pic:''},{av:'AV64TFCCVal',fld:'vTFCCVAL',pic:''},{av:'AV65TFCCVal_Sel',fld:'vTFCCVAL_SEL',pic:''},{av:'AV5CCOkLin',fld:'vCCOKLIN',pic:'9'},{av:'AV28ControlCalidad_ValoresEstandars_CCsta_SDT',fld:'vCONTROLCALIDAD_VALORESESTANDARS_CCSTA_SDT',grid:141,pic:''},{av:'nGXsfl_141_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:141},{av:'nRC_GXsfl_141',ctrl:'GRIDCONTROLCALIDAD_VALORESESTANDARS_CCSTA_SDTS',prop:'GridRC',grid:141}]");
      setEventMetadata("GRIDCONTROLCALIDAD_VALORESESTANDARS_CCSTA_SDTS_PREVPAGE",",oparms:[{av:'AV36GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV37GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'edtCCVal_Columnheaderclass',ctrl:'CCVAL',prop:'Columnheaderclass'}]}");
      setEventMetadata("GRIDCONTROLCALIDAD_VALORESESTANDARS_CCSTA_SDTS_NEXTPAGE","{handler:'subgridcontrolcalidad_valoresestandars_ccsta_sdts_nextpage',iparms:[{av:'GRIDCONTROLCALIDAD_VALORESESTANDARS_CCSTA_SDTS_nFirstRecordOnPage'},{av:'GRIDCONTROLCALIDAD_VALORESESTANDARS_CCSTA_SDTS_nEOF'},{av:'subGridcontrolcalidad_ccsta_sdts_Rows',ctrl:'GRIDCONTROLCALIDAD_CCSTA_SDTS',prop:'Rows'},{av:'subGridcontrolcalidad_valoresestandars_ccsta_sdts_Rows',ctrl:'GRIDCONTROLCALIDAD_VALORESESTANDARS_CCSTA_SDTS',prop:'Rows'},{av:'AV31EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV25clicod',fld:'vCLICOD',pic:'ZZZZZ9',hsh:true},{av:'AV15Barser',fld:'vBARSER',pic:'',hsh:true},{av:'AV12barcolnom',fld:'vBARCOLNOM',pic:'',hsh:true},{av:'AV13barcolnum',fld:'vBARCOLNUM',pic:'ZZZZZ9',hsh:true},{av:'AV71AvisoCC',fld:'vAVISOCC',pic:'ZZZ9',hsh:true},{av:'AV73CCTVal',fld:'vCCTVAL',pic:'',hsh:true},{av:'AV9BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV11BarCodReo',fld:'vBARCODREO',pic:'9',hsh:true},{av:'AV10BarCodPar',fld:'vBARCODPAR',pic:'',hsh:true},{av:'AV48ProCod',fld:'vPROCOD',pic:'',hsh:true},{av:'AV14BarOrdLin',fld:'vBARORDLIN',pic:'ZZZ9',hsh:true},{av:'AV19CCTCod',fld:'vCCTCOD',pic:'ZZZZZ9',hsh:true},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV96Pgmname',fld:'vPGMNAME',pic:''},{av:'AV45OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV46OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV58TFCCTLin',fld:'vTFCCTLIN',pic:'ZZZ9'},{av:'AV59TFCCTLin_To',fld:'vTFCCTLIN_TO',pic:'ZZZ9'},{av:'AV62TFCCTLinDsc',fld:'vTFCCTLINDSC',pic:''},{av:'AV63TFCCTLinDsc_Sel',fld:'vTFCCTLINDSC_SEL',pic:''},{av:'AV60TFCCTLinDc2',fld:'vTFCCTLINDC2',pic:''},{av:'AV61TFCCTLinDc2_Sel',fld:'vTFCCTLINDC2_SEL',pic:''},{av:'AV54TFCCMetodo',fld:'vTFCCMETODO',pic:''},{av:'AV55TFCCMetodo_Sel',fld:'vTFCCMETODO_SEL',pic:''},{av:'AV52TFCCEspecif',fld:'vTFCCESPECIF',pic:''},{av:'AV53TFCCEspecif_Sel',fld:'vTFCCESPECIF_SEL',pic:''},{av:'AV64TFCCVal',fld:'vTFCCVAL',pic:''},{av:'AV65TFCCVal_Sel',fld:'vTFCCVAL_SEL',pic:''},{av:'AV5CCOkLin',fld:'vCCOKLIN',pic:'9'},{av:'AV28ControlCalidad_ValoresEstandars_CCsta_SDT',fld:'vCONTROLCALIDAD_VALORESESTANDARS_CCSTA_SDT',grid:141,pic:''},{av:'nGXsfl_141_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:141},{av:'nRC_GXsfl_141',ctrl:'GRIDCONTROLCALIDAD_VALORESESTANDARS_CCSTA_SDTS',prop:'GridRC',grid:141}]");
      setEventMetadata("GRIDCONTROLCALIDAD_VALORESESTANDARS_CCSTA_SDTS_NEXTPAGE",",oparms:[{av:'AV36GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV37GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'edtCCVal_Columnheaderclass',ctrl:'CCVAL',prop:'Columnheaderclass'}]}");
      setEventMetadata("GRIDCONTROLCALIDAD_VALORESESTANDARS_CCSTA_SDTS_LASTPAGE","{handler:'subgridcontrolcalidad_valoresestandars_ccsta_sdts_lastpage',iparms:[{av:'GRIDCONTROLCALIDAD_VALORESESTANDARS_CCSTA_SDTS_nFirstRecordOnPage'},{av:'GRIDCONTROLCALIDAD_VALORESESTANDARS_CCSTA_SDTS_nEOF'},{av:'subGridcontrolcalidad_ccsta_sdts_Rows',ctrl:'GRIDCONTROLCALIDAD_CCSTA_SDTS',prop:'Rows'},{av:'subGridcontrolcalidad_valoresestandars_ccsta_sdts_Rows',ctrl:'GRIDCONTROLCALIDAD_VALORESESTANDARS_CCSTA_SDTS',prop:'Rows'},{av:'AV31EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV25clicod',fld:'vCLICOD',pic:'ZZZZZ9',hsh:true},{av:'AV15Barser',fld:'vBARSER',pic:'',hsh:true},{av:'AV12barcolnom',fld:'vBARCOLNOM',pic:'',hsh:true},{av:'AV13barcolnum',fld:'vBARCOLNUM',pic:'ZZZZZ9',hsh:true},{av:'AV71AvisoCC',fld:'vAVISOCC',pic:'ZZZ9',hsh:true},{av:'AV73CCTVal',fld:'vCCTVAL',pic:'',hsh:true},{av:'AV9BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV11BarCodReo',fld:'vBARCODREO',pic:'9',hsh:true},{av:'AV10BarCodPar',fld:'vBARCODPAR',pic:'',hsh:true},{av:'AV48ProCod',fld:'vPROCOD',pic:'',hsh:true},{av:'AV14BarOrdLin',fld:'vBARORDLIN',pic:'ZZZ9',hsh:true},{av:'AV19CCTCod',fld:'vCCTCOD',pic:'ZZZZZ9',hsh:true},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV96Pgmname',fld:'vPGMNAME',pic:''},{av:'AV45OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV46OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV58TFCCTLin',fld:'vTFCCTLIN',pic:'ZZZ9'},{av:'AV59TFCCTLin_To',fld:'vTFCCTLIN_TO',pic:'ZZZ9'},{av:'AV62TFCCTLinDsc',fld:'vTFCCTLINDSC',pic:''},{av:'AV63TFCCTLinDsc_Sel',fld:'vTFCCTLINDSC_SEL',pic:''},{av:'AV60TFCCTLinDc2',fld:'vTFCCTLINDC2',pic:''},{av:'AV61TFCCTLinDc2_Sel',fld:'vTFCCTLINDC2_SEL',pic:''},{av:'AV54TFCCMetodo',fld:'vTFCCMETODO',pic:''},{av:'AV55TFCCMetodo_Sel',fld:'vTFCCMETODO_SEL',pic:''},{av:'AV52TFCCEspecif',fld:'vTFCCESPECIF',pic:''},{av:'AV53TFCCEspecif_Sel',fld:'vTFCCESPECIF_SEL',pic:''},{av:'AV64TFCCVal',fld:'vTFCCVAL',pic:''},{av:'AV65TFCCVal_Sel',fld:'vTFCCVAL_SEL',pic:''},{av:'AV5CCOkLin',fld:'vCCOKLIN',pic:'9'},{av:'AV28ControlCalidad_ValoresEstandars_CCsta_SDT',fld:'vCONTROLCALIDAD_VALORESESTANDARS_CCSTA_SDT',grid:141,pic:''},{av:'nGXsfl_141_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:141},{av:'nRC_GXsfl_141',ctrl:'GRIDCONTROLCALIDAD_VALORESESTANDARS_CCSTA_SDTS',prop:'GridRC',grid:141}]");
      setEventMetadata("GRIDCONTROLCALIDAD_VALORESESTANDARS_CCSTA_SDTS_LASTPAGE",",oparms:[{av:'AV36GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV37GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'edtCCVal_Columnheaderclass',ctrl:'CCVAL',prop:'Columnheaderclass'}]}");
      setEventMetadata("VALIDV_BARCOD","{handler:'validv_Barcod',iparms:[]");
      setEventMetadata("VALIDV_BARCOD",",oparms:[]}");
      setEventMetadata("VALIDV_BARCODREO","{handler:'validv_Barcodreo',iparms:[]");
      setEventMetadata("VALIDV_BARCODREO",",oparms:[]}");
      setEventMetadata("VALIDV_BARCODPAR","{handler:'validv_Barcodpar',iparms:[]");
      setEventMetadata("VALIDV_BARCODPAR",",oparms:[]}");
      setEventMetadata("VALIDV_CCTCOD","{handler:'validv_Cctcod',iparms:[]");
      setEventMetadata("VALIDV_CCTCOD",",oparms:[]}");
      setEventMetadata("VALIDV_PROCOD","{handler:'validv_Procod',iparms:[]");
      setEventMetadata("VALIDV_PROCOD",",oparms:[]}");
      setEventMetadata("VALIDV_BARORDLIN","{handler:'validv_Barordlin',iparms:[]");
      setEventMetadata("VALIDV_BARORDLIN",",oparms:[]}");
      setEventMetadata("VALIDV_CCTLIN","{handler:'validv_Cctlin',iparms:[]");
      setEventMetadata("VALIDV_CCTLIN",",oparms:[]}");
      setEventMetadata("NULL","{handler:'validv_Gxv4',iparms:[]");
      setEventMetadata("NULL",",oparms:[]}");
      setEventMetadata("NULL","{handler:'validv_Gxv12',iparms:[]");
      setEventMetadata("NULL",",oparms:[]}");
      setEventMetadata("VALID_CCTLIN","{handler:'valid_Cctlin',iparms:[]");
      setEventMetadata("VALID_CCTLIN",",oparms:[]}");
      setEventMetadata("NULL","{handler:'validv_Ccoklingrid',iparms:[]");
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
      wcpOAV31EmprCod = "" ;
      wcpOAV10BarCodPar = "" ;
      wcpOAV48ProCod = "" ;
      wcpOAV49ProDsc = "" ;
      wcpOAV32FasCod = "" ;
      wcpOAV33FasDsc = "" ;
      wcpOAV20CCTDsc = "" ;
      Gridpaginationbar_Selectedpage = "" ;
      Ddo_grid_Activeeventkey = "" ;
      Ddo_grid_Selectedvalue_get = "" ;
      Ddo_grid_Filteredtextto_get = "" ;
      Ddo_grid_Filteredtext_get = "" ;
      Ddo_grid_Selectedcolumn = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      AV31EmprCod = "" ;
      AV10BarCodPar = "" ;
      AV48ProCod = "" ;
      AV49ProDsc = "" ;
      AV32FasCod = "" ;
      AV33FasDsc = "" ;
      AV20CCTDsc = "" ;
      AV96Pgmname = "" ;
      AV62TFCCTLinDsc = "" ;
      AV63TFCCTLinDsc_Sel = "" ;
      AV60TFCCTLinDc2 = "" ;
      AV61TFCCTLinDc2_Sel = "" ;
      AV54TFCCMetodo = "" ;
      AV55TFCCMetodo_Sel = "" ;
      AV52TFCCEspecif = "" ;
      AV53TFCCEspecif_Sel = "" ;
      AV64TFCCVal = "" ;
      AV65TFCCVal_Sel = "" ;
      AV15Barser = "" ;
      AV12barcolnom = "" ;
      AV73CCTVal = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      AV26ControlCalidad_CCSTA_SDT = new GXBaseCollection<app.controlcalidadhtd.SdtControlCalidad_CCSTA_SDT_Item>(app.controlcalidadhtd.SdtControlCalidad_CCSTA_SDT_Item.class, "Item", "TexplusNET", remoteHandle);
      AV28ControlCalidad_ValoresEstandars_CCsta_SDT = new GXBaseCollection<app.controlcalidadhtd.SdtControlCalidad_ValoresEstandars_CCsta_SDT_Item>(app.controlcalidadhtd.SdtControlCalidad_ValoresEstandars_CCsta_SDT_Item.class, "Item", "TexplusNET", remoteHandle);
      AV30DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      A396EmprCod = "" ;
      A4051CCTVal = "" ;
      A4050CCTValDsc = "" ;
      AV43Mask = "" ;
      AV44mensaje = "" ;
      Ddo_grid_Caption = "" ;
      Ddo_grid_Filteredtext_set = "" ;
      Ddo_grid_Filteredtextto_set = "" ;
      Ddo_grid_Selectedvalue_set = "" ;
      Ddo_grid_Sortedstatus = "" ;
      Grid_empowerer_Gridinternalname = "" ;
      Gridcontrolcalidad_valoresestandars_ccsta_sdts_titlescategories_Gridinternalname = "" ;
      Gridcontrolcalidad_valoresestandars_ccsta_sdts_empowerer_Gridinternalname = "" ;
      Gridcontrolcalidad_ccsta_sdts_empowerer_Gridinternalname = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      ucDvpanel_tableheader = new com.genexus.webpanels.GXUserControl();
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_unnamedtable1 = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      AV23CCTLinDsc = "" ;
      AV22CCTLinDc2 = "" ;
      AV18CCMetodo = "" ;
      AV17CCEspecif = "" ;
      AV24CCVal = "" ;
      lblTxtmensaje_Jsonclick = "" ;
      bttBtnenter_Jsonclick = "" ;
      bttBtnlimpiarvariables_Jsonclick = "" ;
      bttBtncerrar_Jsonclick = "" ;
      ucDvpanel_unnamedtable5 = new com.genexus.webpanels.GXUserControl();
      ucDvpanel_unnamedtable6 = new com.genexus.webpanels.GXUserControl();
      Gridcontrolcalidad_ccsta_sdtsContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucDvpanel_panelvalorestandar = new com.genexus.webpanels.GXUserControl();
      Gridcontrolcalidad_valoresestandars_ccsta_sdtsContainer = new com.genexus.webpanels.GXWebGrid(context);
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      ucGridpaginationbar = new com.genexus.webpanels.GXUserControl();
      ucDatamonjs = new com.genexus.webpanels.GXUserControl();
      ucDdo_grid = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      ucGridcontrolcalidad_valoresestandars_ccsta_sdts_titlescategories = new com.genexus.webpanels.GXUserControl();
      ucGridcontrolcalidad_valoresestandars_ccsta_sdts_empowerer = new com.genexus.webpanels.GXUserControl();
      ucGridcontrolcalidad_ccsta_sdts_empowerer = new com.genexus.webpanels.GXUserControl();
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      A4043CCTLinDsc = "" ;
      A14344CCTLinDc2 = "" ;
      A13251CCMetodo = "" ;
      A13252CCEspecif = "" ;
      A4035CCVal = "" ;
      scmdbuf = "" ;
      lV102Controlcalidadhtd_controlcalidad_cc1_wkpds_3_tfcctlindsc = "" ;
      lV104Controlcalidadhtd_controlcalidad_cc1_wkpds_5_tfcctlindc2 = "" ;
      lV106Controlcalidadhtd_controlcalidad_cc1_wkpds_7_tfccmetodo = "" ;
      lV108Controlcalidadhtd_controlcalidad_cc1_wkpds_9_tfccespecif = "" ;
      lV110Controlcalidadhtd_controlcalidad_cc1_wkpds_11_tfccval = "" ;
      AV103Controlcalidadhtd_controlcalidad_cc1_wkpds_4_tfcctlindsc_sel = "" ;
      AV102Controlcalidadhtd_controlcalidad_cc1_wkpds_3_tfcctlindsc = "" ;
      AV105Controlcalidadhtd_controlcalidad_cc1_wkpds_6_tfcctlindc2_sel = "" ;
      AV104Controlcalidadhtd_controlcalidad_cc1_wkpds_5_tfcctlindc2 = "" ;
      AV107Controlcalidadhtd_controlcalidad_cc1_wkpds_8_tfccmetodo_sel = "" ;
      AV106Controlcalidadhtd_controlcalidad_cc1_wkpds_7_tfccmetodo = "" ;
      AV109Controlcalidadhtd_controlcalidad_cc1_wkpds_10_tfccespecif_sel = "" ;
      AV108Controlcalidadhtd_controlcalidad_cc1_wkpds_9_tfccespecif = "" ;
      AV111Controlcalidadhtd_controlcalidad_cc1_wkpds_12_tfccval_sel = "" ;
      AV110Controlcalidadhtd_controlcalidad_cc1_wkpds_11_tfccval = "" ;
      A130BarCodPar = "" ;
      A758ProCod = "" ;
      H02CE2_A4031CCTCod = new int[1] ;
      H02CE2_A194BarOrdLin = new short[1] ;
      H02CE2_A758ProCod = new String[] {""} ;
      H02CE2_A130BarCodPar = new String[] {""} ;
      H02CE2_A132BarCodReo = new byte[1] ;
      H02CE2_A129BarCod = new int[1] ;
      H02CE2_A396EmprCod = new String[] {""} ;
      H02CE2_A12750CCOkLin = new byte[1] ;
      H02CE2_A4035CCVal = new String[] {""} ;
      H02CE2_A13252CCEspecif = new String[] {""} ;
      H02CE2_A13251CCMetodo = new String[] {""} ;
      H02CE2_A14344CCTLinDc2 = new String[] {""} ;
      H02CE2_A4043CCTLinDsc = new String[] {""} ;
      H02CE2_A4034CCTLin = new short[1] ;
      H02CE3_AGRID_nRecordCount = new long[1] ;
      hsh = "" ;
      AV7Station = "" ;
      AV6EmprNom = "" ;
      AV8UsurCod = "" ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      H02CE4_A130BarCodPar = new String[] {""} ;
      H02CE4_A132BarCodReo = new byte[1] ;
      H02CE4_A129BarCod = new int[1] ;
      H02CE4_A396EmprCod = new String[] {""} ;
      H02CE4_A252CliCod = new int[1] ;
      H02CE4_n252CliCod = new boolean[] {false} ;
      H02CE4_A212BarSer = new String[] {""} ;
      H02CE4_A135BarColNom = new String[] {""} ;
      H02CE4_A136BarColNum = new int[1] ;
      A212BarSer = "" ;
      A135BarColNom = "" ;
      AV69WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext9 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      Gridcontrolcalidad_ccsta_sdtsRow = new com.genexus.webpanels.GXWebRow();
      AV51Session = httpContext.getWebSession();
      AV38GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV39GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      GXt_char14 = "" ;
      GXt_char12 = "" ;
      GXt_char11 = "" ;
      GXt_char10 = "" ;
      GXt_char1 = "" ;
      GXv_SdtWWPGridState16 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      AV66TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV40HTTPRequest = httpContext.getHttpRequest();
      GXv_char13 = new String[1] ;
      GXv_char4 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      GXv_char15 = new String[1] ;
      GXv_char17 = new String[1] ;
      GXv_int8 = new byte[1] ;
      AV50Regex = "" ;
      AV16c = "" ;
      GXt_objcol_SdtControlCalidad_ValoresEstandars_CCsta_SDT_Item18 = new GXBaseCollection<app.controlcalidadhtd.SdtControlCalidad_ValoresEstandars_CCsta_SDT_Item>(app.controlcalidadhtd.SdtControlCalidad_ValoresEstandars_CCsta_SDT_Item.class, "Item", "TexplusNET", remoteHandle);
      GXv_objcol_SdtControlCalidad_ValoresEstandars_CCsta_SDT_Item19 = new GXBaseCollection[1] ;
      H02CE5_A4034CCTLin = new short[1] ;
      H02CE5_A4031CCTCod = new int[1] ;
      H02CE5_A396EmprCod = new String[] {""} ;
      H02CE5_A4049CCTValLin = new byte[1] ;
      H02CE5_A4051CCTVal = new String[] {""} ;
      H02CE5_A4050CCTValDsc = new String[] {""} ;
      AV27ControlCalidad_CCSTA_SDT_item = new app.controlcalidadhtd.SdtControlCalidad_CCSTA_SDT_Item(remoteHandle, context);
      AV79Length = DecimalUtil.ZERO ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      Gridcontrolcalidad_valoresestandars_ccsta_sdtsRow = new com.genexus.webpanels.GXWebRow();
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      subGridcontrolcalidad_ccsta_sdts_Linesclass = "" ;
      ROClassString = "" ;
      subGridcontrolcalidad_valoresestandars_ccsta_sdts_Linesclass = "" ;
      subGrid_Linesclass = "" ;
      GXCCtl = "" ;
      Gridcontrolcalidad_ccsta_sdtsColumn = new com.genexus.webpanels.GXWebColumn();
      Gridcontrolcalidad_valoresestandars_ccsta_sdtsColumn = new com.genexus.webpanels.GXWebColumn();
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.controlcalidadhtd.controlcalidad_cc1_wkp__default(),
         new Object[] {
             new Object[] {
            H02CE2_A4031CCTCod, H02CE2_A194BarOrdLin, H02CE2_A758ProCod, H02CE2_A130BarCodPar, H02CE2_A132BarCodReo, H02CE2_A129BarCod, H02CE2_A396EmprCod, H02CE2_A12750CCOkLin, H02CE2_A4035CCVal, H02CE2_A13252CCEspecif,
            H02CE2_A13251CCMetodo, H02CE2_A14344CCTLinDc2, H02CE2_A4043CCTLinDsc, H02CE2_A4034CCTLin
            }
            , new Object[] {
            H02CE3_AGRID_nRecordCount
            }
            , new Object[] {
            H02CE4_A130BarCodPar, H02CE4_A132BarCodReo, H02CE4_A129BarCod, H02CE4_A396EmprCod, H02CE4_A252CliCod, H02CE4_n252CliCod, H02CE4_A212BarSer, H02CE4_A135BarColNom, H02CE4_A136BarColNum
            }
            , new Object[] {
            H02CE5_A4034CCTLin, H02CE5_A4031CCTCod, H02CE5_A396EmprCod, H02CE5_A4049CCTValLin, H02CE5_A4051CCTVal, H02CE5_A4050CCTValDsc
            }
         }
      );
      AV96Pgmname = "ControlCalidadHTD.ControlCalidad_CC1_WKP" ;
      /* GeneXus formulas. */
      AV96Pgmname = "ControlCalidadHTD.ControlCalidad_CC1_WKP" ;
      Gx_err = (short)(0) ;
      edtavBarcod_Enabled = 0 ;
      edtavBarcodreo_Enabled = 0 ;
      edtavBarcodpar_Enabled = 0 ;
      edtavCctcod_Enabled = 0 ;
      edtavCctdsc_Enabled = 0 ;
      edtavProcod_Enabled = 0 ;
      edtavProdsc_Enabled = 0 ;
      edtavBarordlin_Enabled = 0 ;
      edtavFascod_Enabled = 0 ;
      edtavFasdsc_Enabled = 0 ;
      edtavCctlin_Enabled = 0 ;
      edtavCctlindsc_Enabled = 0 ;
      edtavCctlindc2_Enabled = 0 ;
      chkavCcoklin.setEnabled( 0 );
      edtavControlcalidad_ccsta_sdt__cctvallin_Enabled = 0 ;
      edtavControlcalidad_ccsta_sdt__cctvaldsc_Enabled = 0 ;
      edtavControlcalidad_ccsta_sdt__cctval_Enabled = 0 ;
      edtavControlcalidad_valoresestandars_ccsta_sdt__cctlin_Enabled = 0 ;
      edtavControlcalidad_valoresestandars_ccsta_sdt__cctlindsc_Enabled = 0 ;
      edtavControlcalidad_valoresestandars_ccsta_sdt__ccsauto_Enabled = 0 ;
      edtavControlcalidad_valoresestandars_ccsta_sdt__ccsvtol_Enabled = 0 ;
      edtavControlcalidad_valoresestandars_ccsta_sdt__ccsmin_Enabled = 0 ;
      edtavControlcalidad_valoresestandars_ccsta_sdt__ccsmax_Enabled = 0 ;
      edtavControlcalidad_valoresestandars_ccsta_sdt__ccvdsc_Enabled = 0 ;
      chkavCcoklingrid.setEnabled( 0 );
      edtavPgmname_Enabled = 0 ;
   }

   private byte wcpOAV11BarCodReo ;
   private byte GRIDCONTROLCALIDAD_CCSTA_SDTS_nEOF ;
   private byte GRIDCONTROLCALIDAD_VALORESESTANDARS_CCSTA_SDTS_nEOF ;
   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte AV11BarCodReo ;
   private byte AV5CCOkLin ;
   private byte gxajaxcallmode ;
   private byte A4049CCTValLin ;
   private byte A12750CCOkLin ;
   private byte nDonePA ;
   private byte subGridcontrolcalidad_ccsta_sdts_Backcolorstyle ;
   private byte subGrid_Backcolorstyle ;
   private byte subGrid_Sortable ;
   private byte A132BarCodReo ;
   private byte subGridcontrolcalidad_valoresestandars_ccsta_sdts_Backcolorstyle ;
   private byte GXt_int7 ;
   private byte GXv_int8[] ;
   private byte nGXWrapped ;
   private byte subGridcontrolcalidad_ccsta_sdts_Backstyle ;
   private byte subGridcontrolcalidad_valoresestandars_ccsta_sdts_Backstyle ;
   private byte subGrid_Backstyle ;
   private byte subGridcontrolcalidad_ccsta_sdts_Titlebackstyle ;
   private byte subGridcontrolcalidad_ccsta_sdts_Allowselection ;
   private byte subGridcontrolcalidad_ccsta_sdts_Allowhovering ;
   private byte subGridcontrolcalidad_ccsta_sdts_Allowcollapsing ;
   private byte subGridcontrolcalidad_ccsta_sdts_Collapsed ;
   private byte subGridcontrolcalidad_valoresestandars_ccsta_sdts_Titlebackstyle ;
   private byte subGridcontrolcalidad_valoresestandars_ccsta_sdts_Allowselection ;
   private byte subGridcontrolcalidad_valoresestandars_ccsta_sdts_Allowhovering ;
   private byte subGridcontrolcalidad_valoresestandars_ccsta_sdts_Allowcollapsing ;
   private byte subGridcontrolcalidad_valoresestandars_ccsta_sdts_Collapsed ;
   private byte subGrid_Titlebackstyle ;
   private byte subGrid_Allowselection ;
   private byte subGrid_Allowhovering ;
   private byte subGrid_Allowcollapsing ;
   private byte subGrid_Collapsed ;
   private short wcpOAV14BarOrdLin ;
   private short nRcdExists_6 ;
   private short nIsMod_6 ;
   private short nRcdExists_5 ;
   private short nIsMod_5 ;
   private short nRcdExists_4 ;
   private short nIsMod_4 ;
   private short nRcdExists_3 ;
   private short nIsMod_3 ;
   private short AV14BarOrdLin ;
   private short AV45OrderedBy ;
   private short AV58TFCCTLin ;
   private short AV59TFCCTLin_To ;
   private short AV71AvisoCC ;
   private short wbEnd ;
   private short wbStart ;
   private short AV21CCTLin ;
   private short A4034CCTLin ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV100Controlcalidadhtd_controlcalidad_cc1_wkpds_1_tfcctlin ;
   private short AV101Controlcalidadhtd_controlcalidad_cc1_wkpds_2_tfcctlin_to ;
   private short A194BarOrdLin ;
   private short AV68var_ok ;
   private short AV72confirmamos ;
   private short AV41i ;
   private short AV80PosPunto ;
   private short AV78EnterosPermitidos ;
   private short AV77DecimalesPermitidos ;
   private short AV81PosPuntoValor ;
   private short AV75CantEnteros ;
   private short AV74CantDecimales ;
   private int wcpOAV9BarCod ;
   private int wcpOAV19CCTCod ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_131 ;
   private int nRC_GXsfl_141 ;
   private int nRC_GXsfl_154 ;
   private int subGridcontrolcalidad_ccsta_sdts_Rows ;
   private int subGridcontrolcalidad_valoresestandars_ccsta_sdts_Rows ;
   private int AV9BarCod ;
   private int AV19CCTCod ;
   private int nGXsfl_131_idx=1 ;
   private int AV25clicod ;
   private int AV13barcolnum ;
   private int nGXsfl_141_idx=1 ;
   private int nGXsfl_154_idx=1 ;
   private int A4031CCTCod ;
   private int Gridpaginationbar_Pagestoshow ;
   private int edtavBarcod_Enabled ;
   private int edtavBarcodreo_Enabled ;
   private int edtavBarcodpar_Enabled ;
   private int edtavCctcod_Enabled ;
   private int edtavCctdsc_Enabled ;
   private int edtavProcod_Enabled ;
   private int edtavProdsc_Enabled ;
   private int edtavBarordlin_Enabled ;
   private int edtavFascod_Enabled ;
   private int edtavFasdsc_Enabled ;
   private int edtavCctlin_Enabled ;
   private int edtavCctlindsc_Enabled ;
   private int edtavCctlindc2_Enabled ;
   private int edtavCcmetodo_Enabled ;
   private int edtavCcespecif_Enabled ;
   private int edtavCcval_Enabled ;
   private int AV84GXV1 ;
   private int AV88GXV5 ;
   private int edtavPgmname_Enabled ;
   private int subGridcontrolcalidad_ccsta_sdts_Islastpage ;
   private int subGrid_Islastpage ;
   private int subGridcontrolcalidad_valoresestandars_ccsta_sdts_Islastpage ;
   private int edtavControlcalidad_ccsta_sdt__cctvallin_Enabled ;
   private int edtavControlcalidad_ccsta_sdt__cctvaldsc_Enabled ;
   private int edtavControlcalidad_ccsta_sdt__cctval_Enabled ;
   private int edtavControlcalidad_valoresestandars_ccsta_sdt__cctlin_Enabled ;
   private int edtavControlcalidad_valoresestandars_ccsta_sdt__cctlindsc_Enabled ;
   private int edtavControlcalidad_valoresestandars_ccsta_sdt__ccsauto_Enabled ;
   private int edtavControlcalidad_valoresestandars_ccsta_sdt__ccsvtol_Enabled ;
   private int edtavControlcalidad_valoresestandars_ccsta_sdt__ccsmin_Enabled ;
   private int edtavControlcalidad_valoresestandars_ccsta_sdt__ccsmax_Enabled ;
   private int edtavControlcalidad_valoresestandars_ccsta_sdt__ccvdsc_Enabled ;
   private int GRIDCONTROLCALIDAD_CCSTA_SDTS_nGridOutOfScope ;
   private int GXPagingFrom4 ;
   private int GXPagingTo4 ;
   private int A129BarCod ;
   private int GRIDCONTROLCALIDAD_VALORESESTANDARS_CCSTA_SDTS_nGridOutOfScope ;
   private int nGXsfl_131_fel_idx=1 ;
   private int nGXsfl_141_fel_idx=1 ;
   private int A252CliCod ;
   private int A136BarColNum ;
   private int AV47PageToGo ;
   private int nGXsfl_131_bak_idx=1 ;
   private int nGXsfl_141_bak_idx=1 ;
   private int AV98GXV13 ;
   private int idxLst ;
   private int subGridcontrolcalidad_ccsta_sdts_Backcolor ;
   private int subGridcontrolcalidad_ccsta_sdts_Allbackcolor ;
   private int subGridcontrolcalidad_valoresestandars_ccsta_sdts_Backcolor ;
   private int subGridcontrolcalidad_valoresestandars_ccsta_sdts_Allbackcolor ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int subGridcontrolcalidad_ccsta_sdts_Titlebackcolor ;
   private int subGridcontrolcalidad_ccsta_sdts_Selectedindex ;
   private int subGridcontrolcalidad_ccsta_sdts_Selectioncolor ;
   private int subGridcontrolcalidad_ccsta_sdts_Hoveringcolor ;
   private int subGridcontrolcalidad_valoresestandars_ccsta_sdts_Titlebackcolor ;
   private int subGridcontrolcalidad_valoresestandars_ccsta_sdts_Selectedindex ;
   private int subGridcontrolcalidad_valoresestandars_ccsta_sdts_Selectioncolor ;
   private int subGridcontrolcalidad_valoresestandars_ccsta_sdts_Hoveringcolor ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRIDCONTROLCALIDAD_CCSTA_SDTS_nFirstRecordOnPage ;
   private long GRIDCONTROLCALIDAD_VALORESESTANDARS_CCSTA_SDTS_nFirstRecordOnPage ;
   private long GRID_nFirstRecordOnPage ;
   private long AV36GridCurrentPage ;
   private long AV37GridPageCount ;
   private long GRIDCONTROLCALIDAD_CCSTA_SDTS_nCurrentRecord ;
   private long GRIDCONTROLCALIDAD_VALORESESTANDARS_CCSTA_SDTS_nCurrentRecord ;
   private long GRID_nCurrentRecord ;
   private long GRIDCONTROLCALIDAD_CCSTA_SDTS_nRecordCount ;
   private long GRID_nRecordCount ;
   private long GRIDCONTROLCALIDAD_VALORESESTANDARS_CCSTA_SDTS_nRecordCount ;
   private java.math.BigDecimal AV79Length ;
   private String wcpOAV31EmprCod ;
   private String wcpOAV10BarCodPar ;
   private String wcpOAV48ProCod ;
   private String wcpOAV49ProDsc ;
   private String wcpOAV32FasCod ;
   private String wcpOAV33FasDsc ;
   private String wcpOAV20CCTDsc ;
   private String Gridpaginationbar_Selectedpage ;
   private String Ddo_grid_Activeeventkey ;
   private String Ddo_grid_Selectedvalue_get ;
   private String Ddo_grid_Filteredtextto_get ;
   private String Ddo_grid_Filteredtext_get ;
   private String Ddo_grid_Selectedcolumn ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String AV31EmprCod ;
   private String AV10BarCodPar ;
   private String AV48ProCod ;
   private String AV49ProDsc ;
   private String AV32FasCod ;
   private String AV33FasDsc ;
   private String AV20CCTDsc ;
   private String sGXsfl_131_idx="0001" ;
   private String AV96Pgmname ;
   private String AV62TFCCTLinDsc ;
   private String AV63TFCCTLinDsc_Sel ;
   private String AV60TFCCTLinDc2 ;
   private String AV61TFCCTLinDc2_Sel ;
   private String AV54TFCCMetodo ;
   private String AV55TFCCMetodo_Sel ;
   private String AV52TFCCEspecif ;
   private String AV53TFCCEspecif_Sel ;
   private String AV64TFCCVal ;
   private String AV65TFCCVal_Sel ;
   private String AV15Barser ;
   private String AV12barcolnom ;
   private String AV73CCTVal ;
   private String sGXsfl_141_idx="0001" ;
   private String sGXsfl_154_idx="0001" ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String A396EmprCod ;
   private String A4051CCTVal ;
   private String A4050CCTValDsc ;
   private String Dvpanel_tableheader_Width ;
   private String Dvpanel_tableheader_Cls ;
   private String Dvpanel_tableheader_Title ;
   private String Dvpanel_tableheader_Iconposition ;
   private String Dvpanel_unnamedtable6_Width ;
   private String Dvpanel_unnamedtable6_Cls ;
   private String Dvpanel_unnamedtable6_Title ;
   private String Dvpanel_unnamedtable6_Iconposition ;
   private String Dvpanel_panelvalorestandar_Width ;
   private String Dvpanel_panelvalorestandar_Cls ;
   private String Dvpanel_panelvalorestandar_Title ;
   private String Dvpanel_panelvalorestandar_Iconposition ;
   private String Dvpanel_unnamedtable5_Width ;
   private String Dvpanel_unnamedtable5_Cls ;
   private String Dvpanel_unnamedtable5_Title ;
   private String Dvpanel_unnamedtable5_Iconposition ;
   private String Dvpanel_unnamedtable1_Width ;
   private String Dvpanel_unnamedtable1_Cls ;
   private String Dvpanel_unnamedtable1_Title ;
   private String Dvpanel_unnamedtable1_Iconposition ;
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
   private String Gridcontrolcalidad_valoresestandars_ccsta_sdts_titlescategories_Gridinternalname ;
   private String Gridcontrolcalidad_valoresestandars_ccsta_sdts_titlescategories_Gridtitlescategories ;
   private String Gridcontrolcalidad_valoresestandars_ccsta_sdts_empowerer_Gridinternalname ;
   private String Gridcontrolcalidad_ccsta_sdts_empowerer_Gridinternalname ;
   private String GX_FocusControl ;
   private String sPrefix ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String Dvpanel_tableheader_Internalname ;
   private String divTableheader_Internalname ;
   private String divUnnamedtable7_Internalname ;
   private String edtavBarcod_Internalname ;
   private String edtavBarcod_Jsonclick ;
   private String edtavBarcodreo_Internalname ;
   private String edtavBarcodreo_Jsonclick ;
   private String edtavBarcodpar_Internalname ;
   private String edtavBarcodpar_Jsonclick ;
   private String edtavCctcod_Internalname ;
   private String edtavCctcod_Jsonclick ;
   private String edtavCctdsc_Internalname ;
   private String edtavCctdsc_Jsonclick ;
   private String divUnnamedtable8_Internalname ;
   private String edtavProcod_Internalname ;
   private String edtavProcod_Jsonclick ;
   private String edtavProdsc_Internalname ;
   private String edtavProdsc_Jsonclick ;
   private String edtavBarordlin_Internalname ;
   private String edtavBarordlin_Jsonclick ;
   private String edtavFascod_Internalname ;
   private String edtavFascod_Jsonclick ;
   private String edtavFasdsc_Internalname ;
   private String edtavFasdsc_Jsonclick ;
   private String ClassString ;
   private String StyleString ;
   private String Dvpanel_unnamedtable1_Internalname ;
   private String divUnnamedtable1_Internalname ;
   private String divUnnamedtable2_Internalname ;
   private String edtavCctlin_Internalname ;
   private String TempTags ;
   private String edtavCctlin_Jsonclick ;
   private String edtavCctlindsc_Internalname ;
   private String AV23CCTLinDsc ;
   private String edtavCctlindsc_Jsonclick ;
   private String edtavCctlindc2_Internalname ;
   private String AV22CCTLinDc2 ;
   private String edtavCctlindc2_Jsonclick ;
   private String divUnnamedtable3_Internalname ;
   private String edtavCcmetodo_Internalname ;
   private String AV18CCMetodo ;
   private String edtavCcmetodo_Jsonclick ;
   private String edtavCcespecif_Internalname ;
   private String AV17CCEspecif ;
   private String edtavCcespecif_Jsonclick ;
   private String edtavCcval_Internalname ;
   private String AV24CCVal ;
   private String edtavCcval_Jsonclick ;
   private String lblTxtmensaje_Internalname ;
   private String lblTxtmensaje_Caption ;
   private String lblTxtmensaje_Jsonclick ;
   private String divUnnamedtable4_Internalname ;
   private String bttBtnenter_Internalname ;
   private String bttBtnenter_Jsonclick ;
   private String bttBtnlimpiarvariables_Internalname ;
   private String bttBtnlimpiarvariables_Jsonclick ;
   private String bttBtncerrar_Internalname ;
   private String bttBtncerrar_Jsonclick ;
   private String Dvpanel_unnamedtable5_Internalname ;
   private String divUnnamedtable5_Internalname ;
   private String Dvpanel_unnamedtable6_Internalname ;
   private String divUnnamedtable6_Internalname ;
   private String sStyleString ;
   private String subGridcontrolcalidad_ccsta_sdts_Internalname ;
   private String Dvpanel_panelvalorestandar_Internalname ;
   private String divPanelvalorestandar_Internalname ;
   private String subGridcontrolcalidad_valoresestandars_ccsta_sdts_Internalname ;
   private String divGridtablewithpaginationbar_Internalname ;
   private String subGrid_Internalname ;
   private String Gridpaginationbar_Internalname ;
   private String edtavPgmname_Internalname ;
   private String edtavPgmname_Jsonclick ;
   private String Datamonjs_Internalname ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String Ddo_grid_Internalname ;
   private String Grid_empowerer_Internalname ;
   private String Gridcontrolcalidad_valoresestandars_ccsta_sdts_titlescategories_Internalname ;
   private String Gridcontrolcalidad_valoresestandars_ccsta_sdts_empowerer_Internalname ;
   private String Gridcontrolcalidad_ccsta_sdts_empowerer_Internalname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtCCTLin_Internalname ;
   private String A4043CCTLinDsc ;
   private String edtCCTLinDsc_Internalname ;
   private String A14344CCTLinDc2 ;
   private String edtCCTLinDc2_Internalname ;
   private String A13251CCMetodo ;
   private String edtCCMetodo_Internalname ;
   private String A13252CCEspecif ;
   private String edtCCEspecif_Internalname ;
   private String A4035CCVal ;
   private String edtCCVal_Internalname ;
   private String edtCCOkLin_Internalname ;
   private String edtavControlcalidad_ccsta_sdt__cctvallin_Internalname ;
   private String edtavControlcalidad_ccsta_sdt__cctvaldsc_Internalname ;
   private String edtavControlcalidad_ccsta_sdt__cctval_Internalname ;
   private String edtavControlcalidad_valoresestandars_ccsta_sdt__cctlin_Internalname ;
   private String edtavControlcalidad_valoresestandars_ccsta_sdt__cctlindsc_Internalname ;
   private String edtavControlcalidad_valoresestandars_ccsta_sdt__ccsauto_Internalname ;
   private String edtavControlcalidad_valoresestandars_ccsta_sdt__ccsvtol_Internalname ;
   private String edtavControlcalidad_valoresestandars_ccsta_sdt__ccsmin_Internalname ;
   private String edtavControlcalidad_valoresestandars_ccsta_sdt__ccsmax_Internalname ;
   private String edtavControlcalidad_valoresestandars_ccsta_sdt__ccvdsc_Internalname ;
   private String scmdbuf ;
   private String lV102Controlcalidadhtd_controlcalidad_cc1_wkpds_3_tfcctlindsc ;
   private String lV104Controlcalidadhtd_controlcalidad_cc1_wkpds_5_tfcctlindc2 ;
   private String lV106Controlcalidadhtd_controlcalidad_cc1_wkpds_7_tfccmetodo ;
   private String lV108Controlcalidadhtd_controlcalidad_cc1_wkpds_9_tfccespecif ;
   private String lV110Controlcalidadhtd_controlcalidad_cc1_wkpds_11_tfccval ;
   private String AV103Controlcalidadhtd_controlcalidad_cc1_wkpds_4_tfcctlindsc_sel ;
   private String AV102Controlcalidadhtd_controlcalidad_cc1_wkpds_3_tfcctlindsc ;
   private String AV105Controlcalidadhtd_controlcalidad_cc1_wkpds_6_tfcctlindc2_sel ;
   private String AV104Controlcalidadhtd_controlcalidad_cc1_wkpds_5_tfcctlindc2 ;
   private String AV107Controlcalidadhtd_controlcalidad_cc1_wkpds_8_tfccmetodo_sel ;
   private String AV106Controlcalidadhtd_controlcalidad_cc1_wkpds_7_tfccmetodo ;
   private String AV109Controlcalidadhtd_controlcalidad_cc1_wkpds_10_tfccespecif_sel ;
   private String AV108Controlcalidadhtd_controlcalidad_cc1_wkpds_9_tfccespecif ;
   private String AV111Controlcalidadhtd_controlcalidad_cc1_wkpds_12_tfccval_sel ;
   private String AV110Controlcalidadhtd_controlcalidad_cc1_wkpds_11_tfccval ;
   private String A130BarCodPar ;
   private String A758ProCod ;
   private String sGXsfl_131_fel_idx="0001" ;
   private String sGXsfl_141_fel_idx="0001" ;
   private String hsh ;
   private String AV7Station ;
   private String AV6EmprNom ;
   private String AV8UsurCod ;
   private String A212BarSer ;
   private String A135BarColNom ;
   private String edtCCVal_Columnheaderclass ;
   private String GXt_char14 ;
   private String GXt_char12 ;
   private String GXt_char11 ;
   private String GXt_char10 ;
   private String GXt_char1 ;
   private String GXv_char13[] ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String GXv_char15[] ;
   private String GXv_char17[] ;
   private String edtCCVal_Columnclass ;
   private String subGridcontrolcalidad_ccsta_sdts_Class ;
   private String subGridcontrolcalidad_ccsta_sdts_Linesclass ;
   private String ROClassString ;
   private String edtavControlcalidad_ccsta_sdt__cctvallin_Jsonclick ;
   private String edtavControlcalidad_ccsta_sdt__cctvaldsc_Jsonclick ;
   private String edtavControlcalidad_ccsta_sdt__cctval_Jsonclick ;
   private String subGridcontrolcalidad_valoresestandars_ccsta_sdts_Class ;
   private String subGridcontrolcalidad_valoresestandars_ccsta_sdts_Linesclass ;
   private String edtavControlcalidad_valoresestandars_ccsta_sdt__cctlin_Jsonclick ;
   private String edtavControlcalidad_valoresestandars_ccsta_sdt__cctlindsc_Jsonclick ;
   private String edtavControlcalidad_valoresestandars_ccsta_sdt__ccsauto_Jsonclick ;
   private String edtavControlcalidad_valoresestandars_ccsta_sdt__ccsvtol_Jsonclick ;
   private String edtavControlcalidad_valoresestandars_ccsta_sdt__ccsmin_Jsonclick ;
   private String edtavControlcalidad_valoresestandars_ccsta_sdt__ccsmax_Jsonclick ;
   private String edtavControlcalidad_valoresestandars_ccsta_sdt__ccvdsc_Jsonclick ;
   private String sGXsfl_154_fel_idx="0001" ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String edtCCTLin_Jsonclick ;
   private String edtCCTLinDsc_Jsonclick ;
   private String edtCCTLinDc2_Jsonclick ;
   private String edtCCMetodo_Jsonclick ;
   private String edtCCEspecif_Jsonclick ;
   private String edtCCVal_Jsonclick ;
   private String edtCCOkLin_Jsonclick ;
   private String GXCCtl ;
   private String subGridcontrolcalidad_ccsta_sdts_Header ;
   private String subGridcontrolcalidad_valoresestandars_ccsta_sdts_Header ;
   private String subGrid_Header ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean AV46OrderedDsc ;
   private boolean Dvpanel_tableheader_Autowidth ;
   private boolean Dvpanel_tableheader_Autoheight ;
   private boolean Dvpanel_tableheader_Collapsible ;
   private boolean Dvpanel_tableheader_Collapsed ;
   private boolean Dvpanel_tableheader_Showcollapseicon ;
   private boolean Dvpanel_tableheader_Autoscroll ;
   private boolean Dvpanel_unnamedtable6_Autowidth ;
   private boolean Dvpanel_unnamedtable6_Autoheight ;
   private boolean Dvpanel_unnamedtable6_Collapsible ;
   private boolean Dvpanel_unnamedtable6_Collapsed ;
   private boolean Dvpanel_unnamedtable6_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable6_Autoscroll ;
   private boolean Dvpanel_panelvalorestandar_Autowidth ;
   private boolean Dvpanel_panelvalorestandar_Autoheight ;
   private boolean Dvpanel_panelvalorestandar_Collapsible ;
   private boolean Dvpanel_panelvalorestandar_Collapsed ;
   private boolean Dvpanel_panelvalorestandar_Showcollapseicon ;
   private boolean Dvpanel_panelvalorestandar_Autoscroll ;
   private boolean Dvpanel_unnamedtable5_Autowidth ;
   private boolean Dvpanel_unnamedtable5_Autoheight ;
   private boolean Dvpanel_unnamedtable5_Collapsible ;
   private boolean Dvpanel_unnamedtable5_Collapsed ;
   private boolean Dvpanel_unnamedtable5_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable5_Autoscroll ;
   private boolean Dvpanel_unnamedtable1_Autowidth ;
   private boolean Dvpanel_unnamedtable1_Autoheight ;
   private boolean Dvpanel_unnamedtable1_Collapsible ;
   private boolean Dvpanel_unnamedtable1_Collapsed ;
   private boolean Dvpanel_unnamedtable1_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable1_Autoscroll ;
   private boolean Gridpaginationbar_Showfirst ;
   private boolean Gridpaginationbar_Showprevious ;
   private boolean Gridpaginationbar_Shownext ;
   private boolean Gridpaginationbar_Showlast ;
   private boolean Gridpaginationbar_Rowsperpageselector ;
   private boolean Grid_empowerer_Hastitlesettings ;
   private boolean Gridcontrolcalidad_valoresestandars_ccsta_sdts_empowerer_Hascategories ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean AV76CCOkLingrid ;
   private boolean bGXsfl_131_Refreshing=false ;
   private boolean bGXsfl_141_Refreshing=false ;
   private boolean bGXsfl_154_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean n252CliCod ;
   private boolean gx_refresh_fired ;
   private boolean gx_BV131 ;
   private boolean gx_BV141 ;
   private String AV43Mask ;
   private String AV44mensaje ;
   private String AV50Regex ;
   private String AV16c ;
   private com.genexus.webpanels.GXWebGrid Gridcontrolcalidad_ccsta_sdtsContainer ;
   private com.genexus.webpanels.GXWebGrid Gridcontrolcalidad_valoresestandars_ccsta_sdtsContainer ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow Gridcontrolcalidad_ccsta_sdtsRow ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebRow Gridcontrolcalidad_valoresestandars_ccsta_sdtsRow ;
   private com.genexus.webpanels.GXWebColumn Gridcontrolcalidad_ccsta_sdtsColumn ;
   private com.genexus.webpanels.GXWebColumn Gridcontrolcalidad_valoresestandars_ccsta_sdtsColumn ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV40HTTPRequest ;
   private com.genexus.webpanels.WebSession AV51Session ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableheader ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable1 ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable5 ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable6 ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_panelvalorestandar ;
   private com.genexus.webpanels.GXUserControl ucGridpaginationbar ;
   private com.genexus.webpanels.GXUserControl ucDatamonjs ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.webpanels.GXUserControl ucGridcontrolcalidad_valoresestandars_ccsta_sdts_titlescategories ;
   private com.genexus.webpanels.GXUserControl ucGridcontrolcalidad_valoresestandars_ccsta_sdts_empowerer ;
   private com.genexus.webpanels.GXUserControl ucGridcontrolcalidad_ccsta_sdts_empowerer ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private ICheckbox chkavCcoklin ;
   private ICheckbox chkavCcoklingrid ;
   private IDataStoreProvider pr_default ;
   private int[] H02CE2_A4031CCTCod ;
   private short[] H02CE2_A194BarOrdLin ;
   private String[] H02CE2_A758ProCod ;
   private String[] H02CE2_A130BarCodPar ;
   private byte[] H02CE2_A132BarCodReo ;
   private int[] H02CE2_A129BarCod ;
   private String[] H02CE2_A396EmprCod ;
   private byte[] H02CE2_A12750CCOkLin ;
   private String[] H02CE2_A4035CCVal ;
   private String[] H02CE2_A13252CCEspecif ;
   private String[] H02CE2_A13251CCMetodo ;
   private String[] H02CE2_A14344CCTLinDc2 ;
   private String[] H02CE2_A4043CCTLinDsc ;
   private short[] H02CE2_A4034CCTLin ;
   private long[] H02CE3_AGRID_nRecordCount ;
   private String[] H02CE4_A130BarCodPar ;
   private byte[] H02CE4_A132BarCodReo ;
   private int[] H02CE4_A129BarCod ;
   private String[] H02CE4_A396EmprCod ;
   private int[] H02CE4_A252CliCod ;
   private boolean[] H02CE4_n252CliCod ;
   private String[] H02CE4_A212BarSer ;
   private String[] H02CE4_A135BarColNom ;
   private int[] H02CE4_A136BarColNum ;
   private short[] H02CE5_A4034CCTLin ;
   private int[] H02CE5_A4031CCTCod ;
   private String[] H02CE5_A396EmprCod ;
   private byte[] H02CE5_A4049CCTValLin ;
   private String[] H02CE5_A4051CCTVal ;
   private String[] H02CE5_A4050CCTValDsc ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXBaseCollection<app.controlcalidadhtd.SdtControlCalidad_CCSTA_SDT_Item> AV26ControlCalidad_CCSTA_SDT ;
   private GXBaseCollection<app.controlcalidadhtd.SdtControlCalidad_ValoresEstandars_CCsta_SDT_Item> AV28ControlCalidad_ValoresEstandars_CCsta_SDT ;
   private GXBaseCollection<app.controlcalidadhtd.SdtControlCalidad_ValoresEstandars_CCsta_SDT_Item> GXt_objcol_SdtControlCalidad_ValoresEstandars_CCsta_SDT_Item18 ;
   private GXBaseCollection<app.controlcalidadhtd.SdtControlCalidad_ValoresEstandars_CCsta_SDT_Item> GXv_objcol_SdtControlCalidad_ValoresEstandars_CCsta_SDT_Item19[] ;
   private app.controlcalidadhtd.SdtControlCalidad_CCSTA_SDT_Item AV27ControlCalidad_CCSTA_SDT_item ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV30DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV38GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState16[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV39GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV66TrnContext ;
   private app.wwpbaseobjects.SdtWWPContext AV69WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext9[] ;
}

final  class controlcalidad_cc1_wkp__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H02CE2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          short AV100Controlcalidadhtd_controlcalidad_cc1_wkpds_1_tfcctlin ,
                                          short AV101Controlcalidadhtd_controlcalidad_cc1_wkpds_2_tfcctlin_to ,
                                          String AV103Controlcalidadhtd_controlcalidad_cc1_wkpds_4_tfcctlindsc_sel ,
                                          String AV102Controlcalidadhtd_controlcalidad_cc1_wkpds_3_tfcctlindsc ,
                                          String AV105Controlcalidadhtd_controlcalidad_cc1_wkpds_6_tfcctlindc2_sel ,
                                          String AV104Controlcalidadhtd_controlcalidad_cc1_wkpds_5_tfcctlindc2 ,
                                          String AV107Controlcalidadhtd_controlcalidad_cc1_wkpds_8_tfccmetodo_sel ,
                                          String AV106Controlcalidadhtd_controlcalidad_cc1_wkpds_7_tfccmetodo ,
                                          String AV109Controlcalidadhtd_controlcalidad_cc1_wkpds_10_tfccespecif_sel ,
                                          String AV108Controlcalidadhtd_controlcalidad_cc1_wkpds_9_tfccespecif ,
                                          String AV111Controlcalidadhtd_controlcalidad_cc1_wkpds_12_tfccval_sel ,
                                          String AV110Controlcalidadhtd_controlcalidad_cc1_wkpds_11_tfccval ,
                                          short A4034CCTLin ,
                                          String A4043CCTLinDsc ,
                                          String A14344CCTLinDc2 ,
                                          String A13251CCMetodo ,
                                          String A13252CCEspecif ,
                                          String A4035CCVal ,
                                          short AV45OrderedBy ,
                                          boolean AV46OrderedDsc ,
                                          String AV31EmprCod ,
                                          int AV9BarCod ,
                                          byte AV11BarCodReo ,
                                          String AV10BarCodPar ,
                                          String AV48ProCod ,
                                          short AV14BarOrdLin ,
                                          int AV19CCTCod ,
                                          String A396EmprCod ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          String A758ProCod ,
                                          short A194BarOrdLin ,
                                          int A4031CCTCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int20 = new byte[24];
      Object[] GXv_Object21 = new Object[2];
      String sSelectString;
      String sFromString;
      String sOrderString;
      sSelectString = " T1.CCTCod, T1.BarOrdLin, T1.ProCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.EmprCod, T1.CCOkLin, T1.CCVal, T1.CCEspecif, T1.CCMetodo, T2.CCTLinDc2, T2.CCTLinDsc," ;
      sSelectString += " T1.CCTLin" ;
      sFromString = " FROM (TXPCC1 T1 INNER JOIN TXPCCDef1 T2 ON T2.EmprCod = T1.EmprCod AND T2.CCTCod = T1.CCTCod AND T2.CCTLin = T1.CCTLin)" ;
      sOrderString = "" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? and T1.ProCod = ? and T1.BarOrdLin = ? and T1.CCTCod = ?)");
      if ( ! (0==AV100Controlcalidadhtd_controlcalidad_cc1_wkpds_1_tfcctlin) )
      {
         addWhere(sWhereString, "(T1.CCTLin >= ?)");
      }
      else
      {
         GXv_int20[7] = (byte)(1) ;
      }
      if ( ! (0==AV101Controlcalidadhtd_controlcalidad_cc1_wkpds_2_tfcctlin_to) )
      {
         addWhere(sWhereString, "(T1.CCTLin <= ?)");
      }
      else
      {
         GXv_int20[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV103Controlcalidadhtd_controlcalidad_cc1_wkpds_4_tfcctlindsc_sel)==0) && ( ! (GXutil.strcmp("", AV102Controlcalidadhtd_controlcalidad_cc1_wkpds_3_tfcctlindsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CCTLinDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV103Controlcalidadhtd_controlcalidad_cc1_wkpds_4_tfcctlindsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CCTLinDsc = ?)");
      }
      else
      {
         GXv_int20[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV105Controlcalidadhtd_controlcalidad_cc1_wkpds_6_tfcctlindc2_sel)==0) && ( ! (GXutil.strcmp("", AV104Controlcalidadhtd_controlcalidad_cc1_wkpds_5_tfcctlindc2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CCTLinDc2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV105Controlcalidadhtd_controlcalidad_cc1_wkpds_6_tfcctlindc2_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CCTLinDc2 = ?)");
      }
      else
      {
         GXv_int20[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV107Controlcalidadhtd_controlcalidad_cc1_wkpds_8_tfccmetodo_sel)==0) && ( ! (GXutil.strcmp("", AV106Controlcalidadhtd_controlcalidad_cc1_wkpds_7_tfccmetodo)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CCMetodo) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV107Controlcalidadhtd_controlcalidad_cc1_wkpds_8_tfccmetodo_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CCMetodo = ?)");
      }
      else
      {
         GXv_int20[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV109Controlcalidadhtd_controlcalidad_cc1_wkpds_10_tfccespecif_sel)==0) && ( ! (GXutil.strcmp("", AV108Controlcalidadhtd_controlcalidad_cc1_wkpds_9_tfccespecif)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CCEspecif) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV109Controlcalidadhtd_controlcalidad_cc1_wkpds_10_tfccespecif_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CCEspecif = ?)");
      }
      else
      {
         GXv_int20[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV111Controlcalidadhtd_controlcalidad_cc1_wkpds_12_tfccval_sel)==0) && ( ! (GXutil.strcmp("", AV110Controlcalidadhtd_controlcalidad_cc1_wkpds_11_tfccval)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CCVal) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV111Controlcalidadhtd_controlcalidad_cc1_wkpds_12_tfccval_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CCVal = ?)");
      }
      else
      {
         GXv_int20[18] = (byte)(1) ;
      }
      if ( AV45OrderedBy == 1 )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.ProCod, T1.BarOrdLin, T1.CCTCod, T1.CCTLin" ;
      }
      else if ( ( AV45OrderedBy == 2 ) && ! AV46OrderedDsc )
      {
         sOrderString += " ORDER BY T1.CCTLin" ;
      }
      else if ( ( AV45OrderedBy == 2 ) && ( AV46OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.CCTLin DESC" ;
      }
      else if ( ( AV45OrderedBy == 3 ) && ! AV46OrderedDsc )
      {
         sOrderString += " ORDER BY T2.CCTLinDsc" ;
      }
      else if ( ( AV45OrderedBy == 3 ) && ( AV46OrderedDsc ) )
      {
         sOrderString += " ORDER BY T2.CCTLinDsc DESC" ;
      }
      else if ( ( AV45OrderedBy == 4 ) && ! AV46OrderedDsc )
      {
         sOrderString += " ORDER BY T2.CCTLinDc2" ;
      }
      else if ( ( AV45OrderedBy == 4 ) && ( AV46OrderedDsc ) )
      {
         sOrderString += " ORDER BY T2.CCTLinDc2 DESC" ;
      }
      else if ( ( AV45OrderedBy == 5 ) && ! AV46OrderedDsc )
      {
         sOrderString += " ORDER BY T1.CCMetodo" ;
      }
      else if ( ( AV45OrderedBy == 5 ) && ( AV46OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.CCMetodo DESC" ;
      }
      else if ( ( AV45OrderedBy == 6 ) && ! AV46OrderedDsc )
      {
         sOrderString += " ORDER BY T1.CCEspecif" ;
      }
      else if ( ( AV45OrderedBy == 6 ) && ( AV46OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.CCEspecif DESC" ;
      }
      else if ( ( AV45OrderedBy == 7 ) && ! AV46OrderedDsc )
      {
         sOrderString += " ORDER BY T1.CCVal" ;
      }
      else if ( ( AV45OrderedBy == 7 ) && ( AV46OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.CCVal DESC" ;
      }
      else if ( true )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.ProCod, T1.BarOrdLin, T1.CCTCod, T1.CCTLin" ;
      }
      scmdbuf = "SELECT * FROM ( SELECT GX_CTE.*, ROWNUM GX_ROW_NUMBER FROM (SELECT " + sSelectString + sFromString + sWhereString + sOrderString + "" + ") GX_CTE) WHERE GX_ROW_NUMBER" + " BETWEEN " + "?" + " AND " + "?" + " OR " + "?" + " < " + "?" + " AND GX_ROW_NUMBER >= " + "?" ;
      GXv_Object21[0] = scmdbuf ;
      GXv_Object21[1] = GXv_int20 ;
      return GXv_Object21 ;
   }

   protected Object[] conditional_H02CE3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          short AV100Controlcalidadhtd_controlcalidad_cc1_wkpds_1_tfcctlin ,
                                          short AV101Controlcalidadhtd_controlcalidad_cc1_wkpds_2_tfcctlin_to ,
                                          String AV103Controlcalidadhtd_controlcalidad_cc1_wkpds_4_tfcctlindsc_sel ,
                                          String AV102Controlcalidadhtd_controlcalidad_cc1_wkpds_3_tfcctlindsc ,
                                          String AV105Controlcalidadhtd_controlcalidad_cc1_wkpds_6_tfcctlindc2_sel ,
                                          String AV104Controlcalidadhtd_controlcalidad_cc1_wkpds_5_tfcctlindc2 ,
                                          String AV107Controlcalidadhtd_controlcalidad_cc1_wkpds_8_tfccmetodo_sel ,
                                          String AV106Controlcalidadhtd_controlcalidad_cc1_wkpds_7_tfccmetodo ,
                                          String AV109Controlcalidadhtd_controlcalidad_cc1_wkpds_10_tfccespecif_sel ,
                                          String AV108Controlcalidadhtd_controlcalidad_cc1_wkpds_9_tfccespecif ,
                                          String AV111Controlcalidadhtd_controlcalidad_cc1_wkpds_12_tfccval_sel ,
                                          String AV110Controlcalidadhtd_controlcalidad_cc1_wkpds_11_tfccval ,
                                          short A4034CCTLin ,
                                          String A4043CCTLinDsc ,
                                          String A14344CCTLinDc2 ,
                                          String A13251CCMetodo ,
                                          String A13252CCEspecif ,
                                          String A4035CCVal ,
                                          short AV45OrderedBy ,
                                          boolean AV46OrderedDsc ,
                                          String AV31EmprCod ,
                                          int AV9BarCod ,
                                          byte AV11BarCodReo ,
                                          String AV10BarCodPar ,
                                          String AV48ProCod ,
                                          short AV14BarOrdLin ,
                                          int AV19CCTCod ,
                                          String A396EmprCod ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          String A758ProCod ,
                                          short A194BarOrdLin ,
                                          int A4031CCTCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int22 = new byte[19];
      Object[] GXv_Object23 = new Object[2];
      scmdbuf = "SELECT COUNT(*) FROM (TXPCC1 T1 INNER JOIN TXPCCDef1 T2 ON T2.EmprCod = T1.EmprCod AND T2.CCTCod = T1.CCTCod AND T2.CCTLin = T1.CCTLin)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? and T1.ProCod = ? and T1.BarOrdLin = ? and T1.CCTCod = ?)");
      if ( ! (0==AV100Controlcalidadhtd_controlcalidad_cc1_wkpds_1_tfcctlin) )
      {
         addWhere(sWhereString, "(T1.CCTLin >= ?)");
      }
      else
      {
         GXv_int22[7] = (byte)(1) ;
      }
      if ( ! (0==AV101Controlcalidadhtd_controlcalidad_cc1_wkpds_2_tfcctlin_to) )
      {
         addWhere(sWhereString, "(T1.CCTLin <= ?)");
      }
      else
      {
         GXv_int22[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV103Controlcalidadhtd_controlcalidad_cc1_wkpds_4_tfcctlindsc_sel)==0) && ( ! (GXutil.strcmp("", AV102Controlcalidadhtd_controlcalidad_cc1_wkpds_3_tfcctlindsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CCTLinDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int22[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV103Controlcalidadhtd_controlcalidad_cc1_wkpds_4_tfcctlindsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CCTLinDsc = ?)");
      }
      else
      {
         GXv_int22[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV105Controlcalidadhtd_controlcalidad_cc1_wkpds_6_tfcctlindc2_sel)==0) && ( ! (GXutil.strcmp("", AV104Controlcalidadhtd_controlcalidad_cc1_wkpds_5_tfcctlindc2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CCTLinDc2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int22[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV105Controlcalidadhtd_controlcalidad_cc1_wkpds_6_tfcctlindc2_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CCTLinDc2 = ?)");
      }
      else
      {
         GXv_int22[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV107Controlcalidadhtd_controlcalidad_cc1_wkpds_8_tfccmetodo_sel)==0) && ( ! (GXutil.strcmp("", AV106Controlcalidadhtd_controlcalidad_cc1_wkpds_7_tfccmetodo)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CCMetodo) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int22[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV107Controlcalidadhtd_controlcalidad_cc1_wkpds_8_tfccmetodo_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CCMetodo = ?)");
      }
      else
      {
         GXv_int22[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV109Controlcalidadhtd_controlcalidad_cc1_wkpds_10_tfccespecif_sel)==0) && ( ! (GXutil.strcmp("", AV108Controlcalidadhtd_controlcalidad_cc1_wkpds_9_tfccespecif)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CCEspecif) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int22[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV109Controlcalidadhtd_controlcalidad_cc1_wkpds_10_tfccespecif_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CCEspecif = ?)");
      }
      else
      {
         GXv_int22[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV111Controlcalidadhtd_controlcalidad_cc1_wkpds_12_tfccval_sel)==0) && ( ! (GXutil.strcmp("", AV110Controlcalidadhtd_controlcalidad_cc1_wkpds_11_tfccval)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CCVal) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int22[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV111Controlcalidadhtd_controlcalidad_cc1_wkpds_12_tfccval_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CCVal = ?)");
      }
      else
      {
         GXv_int22[18] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( AV45OrderedBy == 1 )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV45OrderedBy == 2 ) && ! AV46OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV45OrderedBy == 2 ) && ( AV46OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV45OrderedBy == 3 ) && ! AV46OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV45OrderedBy == 3 ) && ( AV46OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV45OrderedBy == 4 ) && ! AV46OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV45OrderedBy == 4 ) && ( AV46OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV45OrderedBy == 5 ) && ! AV46OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV45OrderedBy == 5 ) && ( AV46OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV45OrderedBy == 6 ) && ! AV46OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV45OrderedBy == 6 ) && ( AV46OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV45OrderedBy == 7 ) && ! AV46OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV45OrderedBy == 7 ) && ( AV46OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( true )
      {
         scmdbuf += "" ;
      }
      GXv_Object23[0] = scmdbuf ;
      GXv_Object23[1] = GXv_int22 ;
      return GXv_Object23 ;
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
                  return conditional_H02CE2(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , ((Number) dynConstraints[1]).shortValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).shortValue() , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).shortValue() , ((Boolean) dynConstraints[19]).booleanValue() , (String)dynConstraints[20] , ((Number) dynConstraints[21]).intValue() , ((Number) dynConstraints[22]).byteValue() , (String)dynConstraints[23] , (String)dynConstraints[24] , ((Number) dynConstraints[25]).shortValue() , ((Number) dynConstraints[26]).intValue() , (String)dynConstraints[27] , ((Number) dynConstraints[28]).intValue() , ((Number) dynConstraints[29]).byteValue() , (String)dynConstraints[30] , (String)dynConstraints[31] , ((Number) dynConstraints[32]).shortValue() , ((Number) dynConstraints[33]).intValue() );
            case 1 :
                  return conditional_H02CE3(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , ((Number) dynConstraints[1]).shortValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).shortValue() , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).shortValue() , ((Boolean) dynConstraints[19]).booleanValue() , (String)dynConstraints[20] , ((Number) dynConstraints[21]).intValue() , ((Number) dynConstraints[22]).byteValue() , (String)dynConstraints[23] , (String)dynConstraints[24] , ((Number) dynConstraints[25]).shortValue() , ((Number) dynConstraints[26]).intValue() , (String)dynConstraints[27] , ((Number) dynConstraints[28]).intValue() , ((Number) dynConstraints[29]).byteValue() , (String)dynConstraints[30] , (String)dynConstraints[31] , ((Number) dynConstraints[32]).shortValue() , ((Number) dynConstraints[33]).intValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H02CE2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H02CE3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H02CE4", "SELECT BarCodPar, BarCodReo, BarCod, EmprCod, CliCod, BarSer, BarColNom, BarColNum FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("H02CE5", "SELECT CCTLin, CCTCod, EmprCod, CCTValLin, CCTVal, CCTValDsc FROM TXPCCDef2 WHERE EmprCod = ? and CCTCod = ? and CCTLin = ? ORDER BY EmprCod, CCTCod, CCTLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 3);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 40);
               ((String[]) buf[9])[0] = rslt.getString(10, 30);
               ((String[]) buf[10])[0] = rslt.getString(11, 30);
               ((String[]) buf[11])[0] = rslt.getString(12, 60);
               ((String[]) buf[12])[0] = rslt.getString(13, 30);
               ((short[]) buf[13])[0] = rslt.getShort(14);
               return;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 16);
               ((String[]) buf[7])[0] = rslt.getString(7, 13);
               ((int[]) buf[8])[0] = rslt.getInt(8);
               return;
            case 3 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 40);
               ((String[]) buf[5])[0] = rslt.getString(6, 30);
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
                  stmt.setString(sIdx, (String)parms[24], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[25]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[26]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 8);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[29]).shortValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[30]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[31]).shortValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[32]).shortValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 30);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 30);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 60);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 60);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 30);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 30);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 30);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 40);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 40);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[43]).intValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[44]).intValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[45]).intValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[46]).intValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[47]).intValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[20]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[21]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 8);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[24]).shortValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[25]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[26]).shortValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[27]).shortValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 30);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 30);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 60);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 60);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 30);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 30);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 30);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 40);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 40);
               }
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
      }
   }

}

