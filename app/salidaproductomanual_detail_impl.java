package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class salidaproductomanual_detail_impl extends GXDataArea
{
   public void initenv( )
   {
      if ( GxWebError != 0 )
      {
         return  ;
      }
   }

   public void inittrn( )
   {
      initialize_properties( ) ;
      entryPointCalled = false ;
      gxfirstwebparm = httpContext.GetFirstPar( "Mode") ;
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action27") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A719PrdNum = httpContext.GetPar( "PrdNum") ;
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         A862CumConFec = localUtil.parseDateParm( httpContext.GetPar( "CumConFec")) ;
         httpContext.ajax_rsp_assign_attri("", false, "A862CumConFec", localUtil.format(A862CumConFec, "99/99/99"));
         A861CumConCbis = CommonUtil.decimalVal( httpContext.GetPar( "CumConCbis"), ".") ;
         httpContext.ajax_rsp_assign_attri("", false, "A861CumConCbis", GXutil.ltrimstr( A861CumConCbis, 12, 4));
         A726PrdPreMed = CommonUtil.decimalVal( httpContext.GetPar( "PrdPreMed"), ".") ;
         httpContext.ajax_rsp_assign_attri("", false, "A726PrdPreMed", GXutil.ltrimstr( A726PrdPreMed, 14, 5));
         AV15FlagPreMed = (short)(GXutil.lval( httpContext.GetPar( "FlagPreMed"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV15FlagPreMed", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV15FlagPreMed), 4, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_27_1TA112( A396EmprCod, A719PrdNum, A862CumConFec, A861CumConCbis, A726PrdPreMed, AV15FlagPreMed) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action28") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A719PrdNum = httpContext.GetPar( "PrdNum") ;
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         A862CumConFec = localUtil.parseDateParm( httpContext.GetPar( "CumConFec")) ;
         httpContext.ajax_rsp_assign_attri("", false, "A862CumConFec", localUtil.format(A862CumConFec, "99/99/99"));
         A861CumConCbis = CommonUtil.decimalVal( httpContext.GetPar( "CumConCbis"), ".") ;
         httpContext.ajax_rsp_assign_attri("", false, "A861CumConCbis", GXutil.ltrimstr( A861CumConCbis, 12, 4));
         A724PrdPreAct = CommonUtil.decimalVal( httpContext.GetPar( "PrdPreAct"), ".") ;
         httpContext.ajax_rsp_assign_attri("", false, "A724PrdPreAct", GXutil.ltrimstr( A724PrdPreAct, 14, 5));
         AV15FlagPreMed = (short)(GXutil.lval( httpContext.GetPar( "FlagPreMed"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV15FlagPreMed", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV15FlagPreMed), 4, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_28_1TA112( A396EmprCod, A719PrdNum, A862CumConFec, A861CumConCbis, A724PrdPreAct, AV15FlagPreMed) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action29") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A719PrdNum = httpContext.GetPar( "PrdNum") ;
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         AV26Year = (short)(GXutil.lval( httpContext.GetPar( "Year"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV26Year", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV26Year), 4, 0));
         AV25Mes = (byte)(GXutil.lval( httpContext.GetPar( "Mes"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV25Mes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV25Mes), 2, 0));
         A861CumConCbis = CommonUtil.decimalVal( httpContext.GetPar( "CumConCbis"), ".") ;
         httpContext.ajax_rsp_assign_attri("", false, "A861CumConCbis", GXutil.ltrimstr( A861CumConCbis, 12, 4));
         AV16CumConOld = CommonUtil.decimalVal( httpContext.GetPar( "CumConOld"), ".") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV16CumConOld", GXutil.ltrimstr( AV16CumConOld, 12, 4));
         A726PrdPreMed = CommonUtil.decimalVal( httpContext.GetPar( "PrdPreMed"), ".") ;
         httpContext.ajax_rsp_assign_attri("", false, "A726PrdPreMed", GXutil.ltrimstr( A726PrdPreMed, 14, 5));
         A862CumConFec = localUtil.parseDateParm( httpContext.GetPar( "CumConFec")) ;
         httpContext.ajax_rsp_assign_attri("", false, "A862CumConFec", localUtil.format(A862CumConFec, "99/99/99"));
         A860CumConCant = CommonUtil.decimalVal( httpContext.GetPar( "CumConCant"), ".") ;
         httpContext.ajax_rsp_assign_attri("", false, "A860CumConCant", GXutil.ltrimstr( A860CumConCant, 12, 4));
         AV15FlagPreMed = (short)(GXutil.lval( httpContext.GetPar( "FlagPreMed"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV15FlagPreMed", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV15FlagPreMed), 4, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_29_1TA112( A396EmprCod, A719PrdNum, AV26Year, AV25Mes, A861CumConCbis, AV16CumConOld, A726PrdPreMed, A862CumConFec, A860CumConCant, AV15FlagPreMed) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action30") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A719PrdNum = httpContext.GetPar( "PrdNum") ;
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         AV26Year = (short)(GXutil.lval( httpContext.GetPar( "Year"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV26Year", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV26Year), 4, 0));
         AV25Mes = (byte)(GXutil.lval( httpContext.GetPar( "Mes"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV25Mes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV25Mes), 2, 0));
         A861CumConCbis = CommonUtil.decimalVal( httpContext.GetPar( "CumConCbis"), ".") ;
         httpContext.ajax_rsp_assign_attri("", false, "A861CumConCbis", GXutil.ltrimstr( A861CumConCbis, 12, 4));
         AV16CumConOld = CommonUtil.decimalVal( httpContext.GetPar( "CumConOld"), ".") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV16CumConOld", GXutil.ltrimstr( AV16CumConOld, 12, 4));
         A724PrdPreAct = CommonUtil.decimalVal( httpContext.GetPar( "PrdPreAct"), ".") ;
         httpContext.ajax_rsp_assign_attri("", false, "A724PrdPreAct", GXutil.ltrimstr( A724PrdPreAct, 14, 5));
         A862CumConFec = localUtil.parseDateParm( httpContext.GetPar( "CumConFec")) ;
         httpContext.ajax_rsp_assign_attri("", false, "A862CumConFec", localUtil.format(A862CumConFec, "99/99/99"));
         A860CumConCant = CommonUtil.decimalVal( httpContext.GetPar( "CumConCant"), ".") ;
         httpContext.ajax_rsp_assign_attri("", false, "A860CumConCant", GXutil.ltrimstr( A860CumConCant, 12, 4));
         AV15FlagPreMed = (short)(GXutil.lval( httpContext.GetPar( "FlagPreMed"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV15FlagPreMed", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV15FlagPreMed), 4, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_30_1TA112( A396EmprCod, A719PrdNum, AV26Year, AV25Mes, A861CumConCbis, AV16CumConOld, A724PrdPreAct, A862CumConFec, A860CumConCant, AV15FlagPreMed) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action31") == 0 )
      {
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_31_1TA112( ) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action32") == 0 )
      {
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_32_1TA112( ) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action33") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A719PrdNum = httpContext.GetPar( "PrdNum") ;
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         A859CumCodCont = (int)(GXutil.lval( httpContext.GetPar( "CumCodCont"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A859CumCodCont", GXutil.ltrimstr( DecimalUtil.doubleToDec(A859CumCodCont), 8, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_33_1TA112( A396EmprCod, A719PrdNum, A859CumCodCont) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action34") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A719PrdNum = httpContext.GetPar( "PrdNum") ;
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         A5862CumConLot = httpContext.GetPar( "CumConLot") ;
         httpContext.ajax_rsp_assign_attri("", false, "A5862CumConLot", A5862CumConLot);
         AV22Moda21 = (short)(GXutil.lval( httpContext.GetPar( "Moda21"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV22Moda21", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV22Moda21), 4, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_34_1TA112( A396EmprCod, A719PrdNum, A5862CumConLot, AV22Moda21) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel3"+"_"+"CC_ALMDC") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A8925CC_AlmCd = (byte)(GXutil.lval( httpContext.GetPar( "CC_AlmCd"))) ;
         n8925CC_AlmCd = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A8925CC_AlmCd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8925CC_AlmCd), 2, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx3asacc_almdc1TA112( A396EmprCod, A8925CC_AlmCd) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel4"+"_"+"ULTFECCCS") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A719PrdNum = httpContext.GetPar( "PrdNum") ;
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx4asaultfecccs1TA112( A396EmprCod, A719PrdNum) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel6"+"_"+"CUMCCOSD") == 0 )
      {
         A10777CumCCos = (short)(GXutil.lval( httpContext.GetPar( "CumCCos"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A10777CumCCos", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10777CumCCos), 3, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx6asacumccosd1TA112( A10777CumCCos) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_38") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A719PrdNum = httpContext.GetPar( "PrdNum") ;
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_38( A396EmprCod, A719PrdNum) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_39") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A490ForPrdUMe = (byte)(GXutil.lval( httpContext.GetPar( "ForPrdUMe"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A490ForPrdUMe", GXutil.str( A490ForPrdUMe, 1, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_39( A396EmprCod, A490ForPrdUMe) ;
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
         gxfirstwebparm = httpContext.GetFirstPar( "Mode") ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxfullajaxEvt") == 0 )
      {
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxfirstwebparm = httpContext.GetFirstPar( "Mode") ;
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
         Gx_mode = gxfirstwebparm ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
         {
            AV7EmprCod = httpContext.GetPar( "EmprCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV7EmprCod", AV7EmprCod);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV7EmprCod, "@!"))));
            AV8CumCodCont = (int)(GXutil.lval( httpContext.GetPar( "CumCodCont"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV8CumCodCont", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8CumCodCont), 8, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCUMCODCONT", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV8CumCodCont), "ZZZZZZZ9")));
            AV9PrdNum = httpContext.GetPar( "PrdNum") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV9PrdNum", AV9PrdNum);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPRDNUM", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV9PrdNum, ""))));
         }
      }
      if ( toggleJsOutput )
      {
         if ( httpContext.isSpaRequest( ) )
         {
            httpContext.enableJsOutput();
         }
      }
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
      if ( ! httpContext.isSpaRequest( ) )
      {
         if ( httpContext.exposeMetadata( ) )
         {
            Form.getMeta().addItem("generator", "GeneXus Java 17_0_11-163677", (short)(0)) ;
         }
         Form.getMeta().addItem("description", httpContext.getMessage( "Salida Producto Manual Lineas", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtPrdNum_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      wbErr = false ;
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public salidaproductomanual_detail_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public salidaproductomanual_detail_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( salidaproductomanual_detail_impl.class ));
   }

   public salidaproductomanual_detail_impl( int remoteHandle ,
                                            ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbCumUnidad = new HTMLChoice();
   }

   public void webExecute( )
   {
      initenv( ) ;
      inittrn( ) ;
      if ( ( GxWebError == 0 ) && ! isAjaxCallMode( ) )
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

   public void fix_multi_value_controls( )
   {
      if ( cmbCumUnidad.getItemCount() > 0 )
      {
         A8639CumUnidad = (byte)(GXutil.lval( cmbCumUnidad.getValidValue(GXutil.trim( GXutil.str( A8639CumUnidad, 1, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A8639CumUnidad", GXutil.str( A8639CumUnidad, 1, 0));
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbCumUnidad.setValue( GXutil.trim( GXutil.str( A8639CumUnidad, 1, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbCumUnidad.getInternalname(), "Values", cmbCumUnidad.ToJavascriptSource(), true);
      }
   }

   public void draw( )
   {
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.disableOutput();
      }
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         disable_std_buttons( ) ;
         enableDisable( ) ;
         set_caption( ) ;
         /* Form start */
         drawControls( ) ;
         fix_multi_value_controls( ) ;
      }
      /* Execute Exit event if defined. */
   }

   public void drawControls( )
   {
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "Section", "left", "top", " "+"data-gx-base-lib=\"bootstrapv3\""+" "+"data-abstract-form"+" ", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divLayoutmaintable_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divTablemain_Internalname, 1, 0, "px", 0, "px", "TableMainTransaction", "left", "top", "", "", "div");
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
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divTablecontent_Internalname, 1, 0, "px", 0, "px", "TableContent15", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
      /* User Defined Control */
      ucDvpanel_tableattributes.setProperty("Width", Dvpanel_tableattributes_Width);
      ucDvpanel_tableattributes.setProperty("AutoWidth", Dvpanel_tableattributes_Autowidth);
      ucDvpanel_tableattributes.setProperty("AutoHeight", Dvpanel_tableattributes_Autoheight);
      ucDvpanel_tableattributes.setProperty("Cls", Dvpanel_tableattributes_Cls);
      ucDvpanel_tableattributes.setProperty("Title", Dvpanel_tableattributes_Title);
      ucDvpanel_tableattributes.setProperty("Collapsible", Dvpanel_tableattributes_Collapsible);
      ucDvpanel_tableattributes.setProperty("Collapsed", Dvpanel_tableattributes_Collapsed);
      ucDvpanel_tableattributes.setProperty("ShowCollapseIcon", Dvpanel_tableattributes_Showcollapseicon);
      ucDvpanel_tableattributes.setProperty("IconPosition", Dvpanel_tableattributes_Iconposition);
      ucDvpanel_tableattributes.setProperty("AutoScroll", Dvpanel_tableattributes_Autoscroll);
      ucDvpanel_tableattributes.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_tableattributes_Internalname, "DVPANEL_TABLEATTRIBUTESContainer");
      httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_TABLEATTRIBUTESContainer"+"TableAttributes"+"\" style=\"display:none;\">") ;
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divTableattributes_Internalname, 1, 0, "px", 0, "px", "TableData", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable2_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell DscTop ExtendedComboCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divTablesplittedprdnum_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockprdnum_Internalname, httpContext.getMessage( "Producto", ""), "", "", lblTextblockprdnum_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_SalidaProductoManual_detail.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* User Defined Control */
      ucCombo_prdnum.setProperty("Caption", Combo_prdnum_Caption);
      ucCombo_prdnum.setProperty("Cls", Combo_prdnum_Cls);
      ucCombo_prdnum.setProperty("EmptyItem", Combo_prdnum_Emptyitem);
      ucCombo_prdnum.setProperty("DropDownOptionsData", AV29PrdNum_Data);
      ucCombo_prdnum.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_prdnum_Internalname, "COMBO_PRDNUMContainer");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 Invisible", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPrdNum_Internalname, httpContext.getMessage( "Producto", ""), "col-sm-3 AttributeLabel", 0, true, "");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 31,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdNum_Internalname, GXutil.rtrim( A719PrdNum), GXutil.rtrim( localUtil.format( A719PrdNum, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,31);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdNum_Jsonclick, 0, "Attribute", "", "", "", "", edtPrdNum_Visible, edtPrdNum_Enabled, 1, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_SalidaProductoManual_detail.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCumConCant_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtCumConCant_Internalname, httpContext.getMessage( "Cantidad", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 35,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCumConCant_Internalname, GXutil.ltrim( localUtil.ntoc( A860CumConCant, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCumConCant_Enabled!=0) ? localUtil.format( A860CumConCant, "ZZZZZZ9.9999") : localUtil.format( A860CumConCant, "ZZZZZZ9.9999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onblur(this,35);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCumConCant_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtCumConCant_Enabled, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_SalidaProductoManual_detail.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbCumUnidad.getInternalname()+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, cmbCumUnidad.getInternalname(), httpContext.getMessage( "Unidad", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 39,'',false,'',0)\"" ;
      /* ComboBox */
      app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbCumUnidad, cmbCumUnidad.getInternalname(), GXutil.trim( GXutil.str( A8639CumUnidad, 1, 0)), 1, cmbCumUnidad.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "int", "", 1, cmbCumUnidad.getEnabled(), 1, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,39);\"", "", true, (byte)(0), "HLP_SalidaProductoManual_detail.htm");
      cmbCumUnidad.setValue( GXutil.trim( GXutil.str( A8639CumUnidad, 1, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbCumUnidad.getInternalname(), "Values", cmbCumUnidad.ToJavascriptSource(), true);
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCumConLot_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtCumConLot_Internalname, httpContext.getMessage( "Lote", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 43,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCumConLot_Internalname, GXutil.rtrim( A5862CumConLot), GXutil.rtrim( localUtil.format( A5862CumConLot, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,43);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCumConLot_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtCumConLot_Enabled, 0, "text", "", 26, "chr", 1, "row", 26, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_SalidaProductoManual_detail.htm");
      /* Static images/pictures */
      ClassString = "gx-prompt Image" + " " + ((GXutil.strcmp(imgprompt_719_5862_gximage, "")==0) ? "" : "GX_Image_"+imgprompt_719_5862_gximage+"_Class") ;
      StyleString = "" ;
      sImgUrl = context.getHttpContext().getImagePath( "f5b04895-0024-488b-8e3b-b687ca4598ee", "", context.getHttpContext().getTheme( )) ;
      app.GxWebStd.gx_bitmap( httpContext, imgprompt_719_5862_Internalname, sImgUrl, imgprompt_719_5862_Link, "", "", context.getHttpContext().getTheme( ), imgprompt_719_5862_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 0, "", "", StyleString, ClassString, "", "", "", "", "", "", "", 1, false, false, context.getHttpContext().getImageSrcSet( sImgUrl), "HLP_SalidaProductoManual_detail.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCumConCbis_Internalname+"\"", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 47,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCumConCbis_Internalname, GXutil.ltrim( localUtil.ntoc( A861CumConCbis, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCumConCbis_Enabled!=0) ? localUtil.format( A861CumConCbis, "ZZZZZZ9.9999") : localUtil.format( A861CumConCbis, "ZZZZZZ9.9999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onblur(this,47);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCumConCbis_Jsonclick, 0, "Invisible", "", "", "", "", 1, edtCumConCbis_Enabled, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_SalidaProductoManual_detail.htm");
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
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable3_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdFacCon_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPrdFacCon_Internalname, httpContext.getMessage( "Factor", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdFacCon_Internalname, GXutil.ltrim( localUtil.ntoc( A707PrdFacCon, (byte)(7), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrdFacCon_Enabled!=0) ? localUtil.format( A707PrdFacCon, "Z9.9999") : localUtil.format( A707PrdFacCon, "Z9.9999"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdFacCon_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPrdFacCon_Enabled, 0, "text", "", 7, "chr", 1, "row", 7, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_SalidaProductoManual_detail.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdExiAlm_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPrdExiAlm_Internalname, httpContext.getMessage( "Existencias", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdExiAlm_Internalname, GXutil.ltrim( localUtil.ntoc( A704PrdExiAlm, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrdExiAlm_Enabled!=0) ? localUtil.format( A704PrdExiAlm, "ZZZZZZ9.9999") : localUtil.format( A704PrdExiAlm, "ZZZZZZ9.9999"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdExiAlm_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPrdExiAlm_Enabled, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_SalidaProductoManual_detail.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdCanRes_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPrdCanRes_Internalname, httpContext.getMessage( "Reserva", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdCanRes_Internalname, GXutil.ltrim( localUtil.ntoc( A685PrdCanRes, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrdCanRes_Enabled!=0) ? localUtil.format( A685PrdCanRes, "ZZZZZZ9.9999") : localUtil.format( A685PrdCanRes, "ZZZZZZ9.9999"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdCanRes_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPrdCanRes_Enabled, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_SalidaProductoManual_detail.htm");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable1_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      if ( ! isFullAjaxMode( ) )
      {
         /* WebComponent */
         app.GxWebStd.gx_hidden_field( httpContext, "W0069"+"", GXutil.rtrim( WebComp_Webcomponent1_Component));
         httpContext.writeText( "<div") ;
         app.GxWebStd.classAttribute( httpContext, "gxwebcomponent");
         httpContext.writeText( " id=\""+"gxHTMLWrpW0069"+""+"\""+"") ;
         httpContext.writeText( ">") ;
         if ( GXutil.len( WebComp_Webcomponent1_Component) != 0 )
         {
            if ( GXutil.strcmp(GXutil.lower( OldWebcomponent1), GXutil.lower( WebComp_Webcomponent1_Component)) != 0 )
            {
               httpContext.ajax_rspStartCmp("gxHTMLWrpW0069"+"");
            }
            WebComp_Webcomponent1.componentdraw();
            if ( GXutil.strcmp(GXutil.lower( OldWebcomponent1), GXutil.lower( WebComp_Webcomponent1_Component)) != 0 )
            {
               httpContext.ajax_rspEndCmp();
            }
         }
         httpContext.writeText( "</div>") ;
      }
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group TrnActionGroup", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 74,'',false,'',0)\"" ;
      ClassString = "ButtonMaterial" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtntrn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtntrn_enter_Visible, bttBtntrn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_SalidaProductoManual_detail.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 76,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtntrn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtntrn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_SalidaProductoManual_detail.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 78,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtntrn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtntrn_delete_Visible, bttBtntrn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_SalidaProductoManual_detail.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV33Pgmname), GXutil.rtrim( localUtil.format( AV33Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_SalidaProductoManual_detail.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "Right", "top", "div");
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
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divSectionattribute_prdnum_Internalname, 1, 0, "px", 0, "px", "Section", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtavComboprdnum_Internalname, GXutil.rtrim( AV31ComboPrdNum), GXutil.rtrim( localUtil.format( AV31ComboPrdNum, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavComboprdnum_Jsonclick, 0, "Attribute", "", "", "", "", edtavComboprdnum_Visible, edtavComboprdnum_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_SalidaProductoManual_detail.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
   }

   public void userMain( )
   {
      standaloneStartup( ) ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         if ( 1 != 0 )
         {
            if ( GXutil.len( WebComp_Webcomponent1_Component) != 0 )
            {
               WebComp_Webcomponent1.componentstart();
            }
         }
      }
   }

   public void userMainFullajax( )
   {
      initenv( ) ;
      inittrn( ) ;
      userMain( ) ;
      draw( ) ;
      sendCloseFormHiddens( ) ;
   }

   public void standaloneStartup( )
   {
      standaloneStartupServer( ) ;
      disable_std_buttons( ) ;
      enableDisable( ) ;
      process( ) ;
   }

   public void standaloneStartupServer( )
   {
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e111TA2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vPRDNUM_DATA"), AV29PrdNum_Data);
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z859CumCodCont = (int)(localUtil.ctol( httpContext.cgiGet( "Z859CumCodCont"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z719PrdNum = httpContext.cgiGet( "Z719PrdNum") ;
            Z861CumConCbis = localUtil.ctond( httpContext.cgiGet( "Z861CumConCbis")) ;
            Z860CumConCant = localUtil.ctond( httpContext.cgiGet( "Z860CumConCant")) ;
            Z8639CumUnidad = (byte)(localUtil.ctol( httpContext.cgiGet( "Z8639CumUnidad"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z5862CumConLot = httpContext.cgiGet( "Z5862CumConLot") ;
            Z12257PrdComID = httpContext.cgiGet( "Z12257PrdComID") ;
            Z12700CumUMed = (byte)(localUtil.ctol( httpContext.cgiGet( "Z12700CumUMed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z14039CumLotAlm = (short)(localUtil.ctol( httpContext.cgiGet( "Z14039CumLotAlm"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z490ForPrdUMe = (byte)(localUtil.ctol( httpContext.cgiGet( "Z490ForPrdUMe"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z718PrdNom = httpContext.cgiGet( "Z718PrdNom") ;
            Z707PrdFacCon = localUtil.ctond( httpContext.cgiGet( "Z707PrdFacCon")) ;
            Z705PrdExiCC = localUtil.ctond( httpContext.cgiGet( "Z705PrdExiCC")) ;
            Z685PrdCanRes = localUtil.ctond( httpContext.cgiGet( "Z685PrdCanRes")) ;
            Z724PrdPreAct = localUtil.ctond( httpContext.cgiGet( "Z724PrdPreAct")) ;
            Z726PrdPreMed = localUtil.ctond( httpContext.cgiGet( "Z726PrdPreMed")) ;
            Z10881PrdLote = httpContext.cgiGet( "Z10881PrdLote") ;
            Z856ValCod = (byte)(localUtil.ctol( httpContext.cgiGet( "Z856ValCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A12257PrdComID = httpContext.cgiGet( "Z12257PrdComID") ;
            A12700CumUMed = (byte)(localUtil.ctol( httpContext.cgiGet( "Z12700CumUMed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A14039CumLotAlm = (short)(localUtil.ctol( httpContext.cgiGet( "Z14039CumLotAlm"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A490ForPrdUMe = (byte)(localUtil.ctol( httpContext.cgiGet( "Z490ForPrdUMe"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A718PrdNom = httpContext.cgiGet( "Z718PrdNom") ;
            A705PrdExiCC = localUtil.ctond( httpContext.cgiGet( "Z705PrdExiCC")) ;
            A724PrdPreAct = localUtil.ctond( httpContext.cgiGet( "Z724PrdPreAct")) ;
            A726PrdPreMed = localUtil.ctond( httpContext.cgiGet( "Z726PrdPreMed")) ;
            A10881PrdLote = httpContext.cgiGet( "Z10881PrdLote") ;
            A856ValCod = (byte)(localUtil.ctol( httpContext.cgiGet( "Z856ValCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            O750PrdValStk = localUtil.ctond( httpContext.cgiGet( "O750PrdValStk")) ;
            O861CumConCbis = localUtil.ctond( httpContext.cgiGet( "O861CumConCbis")) ;
            O704PrdExiAlm = localUtil.ctond( httpContext.cgiGet( "O704PrdExiAlm")) ;
            O860CumConCant = localUtil.ctond( httpContext.cgiGet( "O860CumConCant")) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            N490ForPrdUMe = (byte)(localUtil.ctol( httpContext.cgiGet( "N490ForPrdUMe"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A396EmprCod = httpContext.cgiGet( "EMPRCOD") ;
            A8925CC_AlmCd = (byte)(localUtil.ctol( httpContext.cgiGet( "CC_ALMCD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A8926CC_AlmDc = httpContext.cgiGet( "CC_ALMDC") ;
            A3835UltFecCCs = localUtil.ctod( httpContext.cgiGet( "ULTFECCCS"), 0) ;
            A724PrdPreAct = localUtil.ctond( httpContext.cgiGet( "PRDPREACT")) ;
            A3915EmpNumDec = (byte)(localUtil.ctol( httpContext.cgiGet( "EMPNUMDEC"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n3915EmpNumDec = false ;
            A863CumCosPro = localUtil.ctond( httpContext.cgiGet( "CUMCOSPRO")) ;
            A10777CumCCos = (short)(localUtil.ctol( httpContext.cgiGet( "CUMCCOS"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A10778CumCCosD = httpContext.cgiGet( "CUMCCOSD") ;
            AV7EmprCod = httpContext.cgiGet( "vEMPRCOD") ;
            AV8CumCodCont = (int)(localUtil.ctol( httpContext.cgiGet( "vCUMCODCONT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A859CumCodCont = (int)(localUtil.ctol( httpContext.cgiGet( "CUMCODCONT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV9PrdNum = httpContext.cgiGet( "vPRDNUM") ;
            AV13Insert_ForPrdUMe = (byte)(localUtil.ctol( httpContext.cgiGet( "vINSERT_FORPRDUME"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A490ForPrdUMe = (byte)(localUtil.ctol( httpContext.cgiGet( "FORPRDUME"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV16CumConOld = localUtil.ctond( httpContext.cgiGet( "vCUMCONOLD")) ;
            A862CumConFec = localUtil.ctod( httpContext.cgiGet( "CUMCONFEC"), 0) ;
            AV25Mes = (byte)(localUtil.ctol( httpContext.cgiGet( "vMES"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV26Year = (short)(localUtil.ctol( httpContext.cgiGet( "vYEAR"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV27CumConCbis = localUtil.ctond( httpContext.cgiGet( "vCUMCONCBIS")) ;
            A750PrdValStk = localUtil.ctond( httpContext.cgiGet( "PRDVALSTK")) ;
            A726PrdPreMed = localUtil.ctond( httpContext.cgiGet( "PRDPREMED")) ;
            AV15FlagPreMed = (short)(localUtil.ctol( httpContext.cgiGet( "vFLAGPREMED"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV24Precio_stk = (short)(localUtil.ctol( httpContext.cgiGet( "vPRECIO_STK"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV20ConMan = (short)(localUtil.ctol( httpContext.cgiGet( "vCONMAN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_BScreen = (byte)(localUtil.ctol( httpContext.cgiGet( "vGXBSCREEN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A10881PrdLote = httpContext.cgiGet( "PRDLOTE") ;
            AV17UsurCod = httpContext.cgiGet( "vUSURCOD") ;
            AV22Moda21 = (short)(localUtil.ctol( httpContext.cgiGet( "vMODA21"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV28Ok = httpContext.cgiGet( "vOK") ;
            A12257PrdComID = httpContext.cgiGet( "PRDCOMID") ;
            A12700CumUMed = (byte)(localUtil.ctol( httpContext.cgiGet( "CUMUMED"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A14039CumLotAlm = (short)(localUtil.ctol( httpContext.cgiGet( "CUMLOTALM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A407EmprNom = httpContext.cgiGet( "EMPRNOM") ;
            n407EmprNom = false ;
            A718PrdNom = httpContext.cgiGet( "PRDNOM") ;
            A705PrdExiCC = localUtil.ctond( httpContext.cgiGet( "PRDEXICC")) ;
            A856ValCod = (byte)(localUtil.ctol( httpContext.cgiGet( "VALCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A488ForPrdDsc = httpContext.cgiGet( "FORPRDDSC") ;
            n488ForPrdDsc = false ;
            A11368CumConTipo = (byte)(localUtil.ctol( httpContext.cgiGet( "CUMCONTIPO"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A3839CcoCod = (short)(localUtil.ctol( httpContext.cgiGet( "CCOCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n3839CcoCod = false ;
            Combo_prdnum_Objectcall = httpContext.cgiGet( "COMBO_PRDNUM_Objectcall") ;
            Combo_prdnum_Class = httpContext.cgiGet( "COMBO_PRDNUM_Class") ;
            Combo_prdnum_Icontype = httpContext.cgiGet( "COMBO_PRDNUM_Icontype") ;
            Combo_prdnum_Icon = httpContext.cgiGet( "COMBO_PRDNUM_Icon") ;
            Combo_prdnum_Caption = httpContext.cgiGet( "COMBO_PRDNUM_Caption") ;
            Combo_prdnum_Tooltip = httpContext.cgiGet( "COMBO_PRDNUM_Tooltip") ;
            Combo_prdnum_Cls = httpContext.cgiGet( "COMBO_PRDNUM_Cls") ;
            Combo_prdnum_Selectedvalue_set = httpContext.cgiGet( "COMBO_PRDNUM_Selectedvalue_set") ;
            Combo_prdnum_Selectedvalue_get = httpContext.cgiGet( "COMBO_PRDNUM_Selectedvalue_get") ;
            Combo_prdnum_Selectedtext_set = httpContext.cgiGet( "COMBO_PRDNUM_Selectedtext_set") ;
            Combo_prdnum_Selectedtext_get = httpContext.cgiGet( "COMBO_PRDNUM_Selectedtext_get") ;
            Combo_prdnum_Gamoauthtoken = httpContext.cgiGet( "COMBO_PRDNUM_Gamoauthtoken") ;
            Combo_prdnum_Ddointernalname = httpContext.cgiGet( "COMBO_PRDNUM_Ddointernalname") ;
            Combo_prdnum_Titlecontrolalign = httpContext.cgiGet( "COMBO_PRDNUM_Titlecontrolalign") ;
            Combo_prdnum_Dropdownoptionstype = httpContext.cgiGet( "COMBO_PRDNUM_Dropdownoptionstype") ;
            Combo_prdnum_Enabled = GXutil.strtobool( httpContext.cgiGet( "COMBO_PRDNUM_Enabled")) ;
            Combo_prdnum_Visible = GXutil.strtobool( httpContext.cgiGet( "COMBO_PRDNUM_Visible")) ;
            Combo_prdnum_Titlecontrolidtoreplace = httpContext.cgiGet( "COMBO_PRDNUM_Titlecontrolidtoreplace") ;
            Combo_prdnum_Datalisttype = httpContext.cgiGet( "COMBO_PRDNUM_Datalisttype") ;
            Combo_prdnum_Allowmultipleselection = GXutil.strtobool( httpContext.cgiGet( "COMBO_PRDNUM_Allowmultipleselection")) ;
            Combo_prdnum_Datalistfixedvalues = httpContext.cgiGet( "COMBO_PRDNUM_Datalistfixedvalues") ;
            Combo_prdnum_Isgriditem = GXutil.strtobool( httpContext.cgiGet( "COMBO_PRDNUM_Isgriditem")) ;
            Combo_prdnum_Hasdescription = GXutil.strtobool( httpContext.cgiGet( "COMBO_PRDNUM_Hasdescription")) ;
            Combo_prdnum_Datalistproc = httpContext.cgiGet( "COMBO_PRDNUM_Datalistproc") ;
            Combo_prdnum_Datalistprocparametersprefix = httpContext.cgiGet( "COMBO_PRDNUM_Datalistprocparametersprefix") ;
            Combo_prdnum_Remoteservicesparameters = httpContext.cgiGet( "COMBO_PRDNUM_Remoteservicesparameters") ;
            Combo_prdnum_Datalistupdateminimumcharacters = (int)(localUtil.ctol( httpContext.cgiGet( "COMBO_PRDNUM_Datalistupdateminimumcharacters"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Combo_prdnum_Includeonlyselectedoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_PRDNUM_Includeonlyselectedoption")) ;
            Combo_prdnum_Includeselectalloption = GXutil.strtobool( httpContext.cgiGet( "COMBO_PRDNUM_Includeselectalloption")) ;
            Combo_prdnum_Emptyitem = GXutil.strtobool( httpContext.cgiGet( "COMBO_PRDNUM_Emptyitem")) ;
            Combo_prdnum_Includeaddnewoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_PRDNUM_Includeaddnewoption")) ;
            Combo_prdnum_Htmltemplate = httpContext.cgiGet( "COMBO_PRDNUM_Htmltemplate") ;
            Combo_prdnum_Multiplevaluestype = httpContext.cgiGet( "COMBO_PRDNUM_Multiplevaluestype") ;
            Combo_prdnum_Loadingdata = httpContext.cgiGet( "COMBO_PRDNUM_Loadingdata") ;
            Combo_prdnum_Noresultsfound = httpContext.cgiGet( "COMBO_PRDNUM_Noresultsfound") ;
            Combo_prdnum_Emptyitemtext = httpContext.cgiGet( "COMBO_PRDNUM_Emptyitemtext") ;
            Combo_prdnum_Onlyselectedvalues = httpContext.cgiGet( "COMBO_PRDNUM_Onlyselectedvalues") ;
            Combo_prdnum_Selectalltext = httpContext.cgiGet( "COMBO_PRDNUM_Selectalltext") ;
            Combo_prdnum_Multiplevaluesseparator = httpContext.cgiGet( "COMBO_PRDNUM_Multiplevaluesseparator") ;
            Combo_prdnum_Addnewoptiontext = httpContext.cgiGet( "COMBO_PRDNUM_Addnewoptiontext") ;
            Dvpanel_tableattributes_Objectcall = httpContext.cgiGet( "DVPANEL_TABLEATTRIBUTES_Objectcall") ;
            Dvpanel_tableattributes_Class = httpContext.cgiGet( "DVPANEL_TABLEATTRIBUTES_Class") ;
            Dvpanel_tableattributes_Enabled = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEATTRIBUTES_Enabled")) ;
            Dvpanel_tableattributes_Width = httpContext.cgiGet( "DVPANEL_TABLEATTRIBUTES_Width") ;
            Dvpanel_tableattributes_Height = httpContext.cgiGet( "DVPANEL_TABLEATTRIBUTES_Height") ;
            Dvpanel_tableattributes_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEATTRIBUTES_Autowidth")) ;
            Dvpanel_tableattributes_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEATTRIBUTES_Autoheight")) ;
            Dvpanel_tableattributes_Cls = httpContext.cgiGet( "DVPANEL_TABLEATTRIBUTES_Cls") ;
            Dvpanel_tableattributes_Showheader = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEATTRIBUTES_Showheader")) ;
            Dvpanel_tableattributes_Title = httpContext.cgiGet( "DVPANEL_TABLEATTRIBUTES_Title") ;
            Dvpanel_tableattributes_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEATTRIBUTES_Collapsible")) ;
            Dvpanel_tableattributes_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEATTRIBUTES_Collapsed")) ;
            Dvpanel_tableattributes_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEATTRIBUTES_Showcollapseicon")) ;
            Dvpanel_tableattributes_Iconposition = httpContext.cgiGet( "DVPANEL_TABLEATTRIBUTES_Iconposition") ;
            Dvpanel_tableattributes_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEATTRIBUTES_Autoscroll")) ;
            Dvpanel_tableattributes_Visible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEATTRIBUTES_Visible")) ;
            /* Read variables values. */
            A719PrdNum = httpContext.cgiGet( edtPrdNum_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
            if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtCumConCant_Internalname)), DecimalUtil.stringToDec("-999999.9999")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtCumConCant_Internalname)), DecimalUtil.stringToDec("9999999.9999")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CUMCONCANT");
               AnyError = (short)(1) ;
               GX_FocusControl = edtCumConCant_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A860CumConCant = DecimalUtil.ZERO ;
               httpContext.ajax_rsp_assign_attri("", false, "A860CumConCant", GXutil.ltrimstr( A860CumConCant, 12, 4));
            }
            else
            {
               A860CumConCant = localUtil.ctond( httpContext.cgiGet( edtCumConCant_Internalname)) ;
               httpContext.ajax_rsp_assign_attri("", false, "A860CumConCant", GXutil.ltrimstr( A860CumConCant, 12, 4));
            }
            cmbCumUnidad.setValue( httpContext.cgiGet( cmbCumUnidad.getInternalname()) );
            A8639CumUnidad = (byte)(GXutil.lval( httpContext.cgiGet( cmbCumUnidad.getInternalname()))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A8639CumUnidad", GXutil.str( A8639CumUnidad, 1, 0));
            A5862CumConLot = httpContext.cgiGet( edtCumConLot_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A5862CumConLot", A5862CumConLot);
            if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtCumConCbis_Internalname)), DecimalUtil.stringToDec("-999999.9999")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtCumConCbis_Internalname)), DecimalUtil.stringToDec("9999999.9999")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CUMCONCBIS");
               AnyError = (short)(1) ;
               GX_FocusControl = edtCumConCbis_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A861CumConCbis = DecimalUtil.ZERO ;
               httpContext.ajax_rsp_assign_attri("", false, "A861CumConCbis", GXutil.ltrimstr( A861CumConCbis, 12, 4));
            }
            else
            {
               A861CumConCbis = localUtil.ctond( httpContext.cgiGet( edtCumConCbis_Internalname)) ;
               httpContext.ajax_rsp_assign_attri("", false, "A861CumConCbis", GXutil.ltrimstr( A861CumConCbis, 12, 4));
            }
            A707PrdFacCon = localUtil.ctond( httpContext.cgiGet( edtPrdFacCon_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A707PrdFacCon", GXutil.ltrimstr( A707PrdFacCon, 7, 4));
            A704PrdExiAlm = localUtil.ctond( httpContext.cgiGet( edtPrdExiAlm_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A704PrdExiAlm", GXutil.ltrimstr( A704PrdExiAlm, 12, 4));
            A685PrdCanRes = localUtil.ctond( httpContext.cgiGet( edtPrdCanRes_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A685PrdCanRes", GXutil.ltrimstr( A685PrdCanRes, 12, 4));
            AV33Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV33Pgmname", AV33Pgmname);
            AV31ComboPrdNum = httpContext.cgiGet( edtavComboprdnum_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV31ComboPrdNum", AV31ComboPrdNum);
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = new com.genexus.util.GXProperties() ;
            forbiddenHiddens.add("hshsalt", "hsh"+"SalidaProductoManual_detail");
            forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
            AV33Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV33Pgmname", AV33Pgmname);
            forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV33Pgmname, "")));
            forbiddenHiddens.add("PrdComID", GXutil.rtrim( localUtil.format( A12257PrdComID, "")));
            forbiddenHiddens.add("CumUMed", localUtil.format( DecimalUtil.doubleToDec(A12700CumUMed), "9"));
            forbiddenHiddens.add("CumLotAlm", localUtil.format( DecimalUtil.doubleToDec(A14039CumLotAlm), "ZZZ9"));
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ( ! ( ( GXutil.strcmp(A719PrdNum, Z719PrdNum) != 0 ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
            {
               GXutil.writeLogError("salidaproductomanual_detail:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
               GxWebError = (byte)(1) ;
               httpContext.sendError( 403 );
               GXutil.writeLog("send_http_error_code 403");
               AnyError = (short)(1) ;
               return  ;
            }
            standaloneNotModal( ) ;
         }
         else
         {
            standaloneNotModal( ) ;
            if ( GXutil.strcmp(gxfirstwebparm, "viewer") == 0 )
            {
               Gx_mode = "DSP" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               A396EmprCod = httpContext.GetPar( "EmprCod") ;
               httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
               A859CumCodCont = (int)(GXutil.lval( httpContext.GetPar( "CumCodCont"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A859CumCodCont", GXutil.ltrimstr( DecimalUtil.doubleToDec(A859CumCodCont), 8, 0));
               A719PrdNum = httpContext.GetPar( "PrdNum") ;
               httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
               getEqualNoModal( ) ;
               Gx_mode = "DSP" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               disable_std_buttons( ) ;
               standaloneModal( ) ;
            }
            else
            {
               if ( isDsp( ) )
               {
                  sMode112 = Gx_mode ;
                  Gx_mode = "UPD" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  Gx_mode = sMode112 ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               }
               standaloneModal( ) ;
               if ( ! isIns( ) )
               {
                  getByPrimaryKey( ) ;
                  if ( RcdFound112 == 1 )
                  {
                     if ( isDlt( ) )
                     {
                        /* Confirm record */
                        confirm_1TA0( ) ;
                        if ( AnyError == 0 )
                        {
                           GX_FocusControl = bttBtntrn_enter_Internalname ;
                           httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                        }
                     }
                  }
                  else
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noinsert"), 1, "PRDNUM");
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtPrdNum_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
      }
   }

   public void process( )
   {
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read Transaction buttons. */
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
                     if ( GXutil.strcmp(sEvt, "START") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: Start */
                        e111TA2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: After Trn */
                        e121TA2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        if ( ! isDsp( ) )
                        {
                           btn_enter( ) ;
                        }
                        /* No code required for Cancel button. It is implemented as the Reset button. */
                     }
                  }
                  else
                  {
                  }
               }
               else if ( GXutil.strcmp(sEvtType, "W") == 0 )
               {
                  sEvtType = GXutil.left( sEvt, 4) ;
                  sEvt = GXutil.right( sEvt, GXutil.len( sEvt)-4) ;
                  nCmpId = (short)(GXutil.lval( sEvtType)) ;
                  if ( nCmpId == 69 )
                  {
                     OldWebcomponent1 = httpContext.cgiGet( "W0069") ;
                     if ( ( GXutil.len( OldWebcomponent1) == 0 ) || ( GXutil.strcmp(OldWebcomponent1, WebComp_Webcomponent1_Component) != 0 ) )
                     {
                        WebComp_Webcomponent1 = WebUtils.getWebComponent(getClass(), "app." + OldWebcomponent1 + "_impl", remoteHandle, context);
                        WebComp_Webcomponent1_Component = OldWebcomponent1 ;
                     }
                     if ( GXutil.len( WebComp_Webcomponent1_Component) != 0 )
                     {
                        WebComp_Webcomponent1.componentprocess("W0069", "", sEvt);
                     }
                     WebComp_Webcomponent1_Component = OldWebcomponent1 ;
                  }
               }
               httpContext.wbHandled = (byte)(1) ;
            }
         }
      }
   }

   public void afterTrn( )
   {
      if ( trnEnded == 1 )
      {
         if ( ! (GXutil.strcmp("", endTrnMsgTxt)==0) )
         {
            httpContext.GX_msglist.addItem(endTrnMsgTxt, endTrnMsgCod, 0, "", true);
         }
         /* Execute user event: After Trn */
         e121TA2 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( isIns( )  )
         {
            /* Clear variables for new insertion. */
            initAll1TA112( ) ;
            standaloneNotModal( ) ;
            standaloneModal( ) ;
         }
      }
      endTrnMsgTxt = "" ;
   }

   public String toString( )
   {
      return "" ;
   }

   public GXContentInfo getContentInfo( )
   {
      return (GXContentInfo)(null) ;
   }

   public void disable_std_buttons( )
   {
      bttBtntrn_delete_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtntrn_delete_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_delete_Visible), 5, 0), true);
      if ( isDsp( ) || isDlt( ) )
      {
         bttBtntrn_delete_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, bttBtntrn_delete_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_delete_Visible), 5, 0), true);
         if ( isDsp( ) )
         {
            bttBtntrn_enter_Visible = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, bttBtntrn_enter_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_enter_Visible), 5, 0), true);
         }
         disableAttributes1TA112( ) ;
      }
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, edtavComboprdnum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavComboprdnum_Enabled), 5, 0), true);
   }

   public void set_caption( )
   {
      if ( ( IsConfirmed == 1 ) && ( AnyError == 0 ) )
      {
         if ( isDlt( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_confdelete"), 0, "", true);
         }
         else
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_mustconfirm"), 0, "", true);
         }
      }
   }

   public void confirm_1TA0( )
   {
      beforeValidate1TA112( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1TA112( ) ;
         }
         else
         {
            checkExtendedTable1TA112( ) ;
            closeExtendedTableCursors1TA112( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      }
   }

   public void resetCaption1TA0( )
   {
   }

   public void e111TA2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV18Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      salidaproductomanual_detail_impl.this.GXt_char1 = GXv_char2[0] ;
      AV18Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18Station", AV18Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV19EmprNom ;
      GXv_char4[0] = AV17UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV18Station, GXv_char2, GXv_char3, GXv_char4) ;
      salidaproductomanual_detail_impl.this.A396EmprCod = GXv_char2[0] ;
      salidaproductomanual_detail_impl.this.AV19EmprNom = GXv_char3[0] ;
      salidaproductomanual_detail_impl.this.AV17UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV19EmprNom", AV19EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV17UsurCod", AV17UsurCod);
      GXt_int5 = (byte)(AV20ConMan) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "CONMAN", ""), GXv_int6) ;
      salidaproductomanual_detail_impl.this.GXt_int5 = GXv_int6[0] ;
      AV20ConMan = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20ConMan", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV20ConMan), 4, 0));
      GXt_int7 = AV21Contval ;
      GXv_char4[0] = A396EmprCod ;
      GXv_char3[0] = httpContext.getMessage( "CONMAN", "") ;
      GXv_int8[0] = GXt_int7 ;
      new app.pvalcon(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_int8) ;
      salidaproductomanual_detail_impl.this.A396EmprCod = GXv_char4[0] ;
      salidaproductomanual_detail_impl.this.GXt_int7 = GXv_int8[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      AV21Contval = GXt_int7 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21Contval", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV21Contval), 8, 0));
      GXt_int5 = (byte)(AV22Moda21) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "MODA21", ""), GXv_int6) ;
      salidaproductomanual_detail_impl.this.GXt_int5 = GXv_int6[0] ;
      AV22Moda21 = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV22Moda21", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV22Moda21), 4, 0));
      GXt_int5 = (byte)(AV15FlagPreMed) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "PREMED", ""), GXv_int6) ;
      salidaproductomanual_detail_impl.this.GXt_int5 = GXv_int6[0] ;
      AV15FlagPreMed = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15FlagPreMed", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV15FlagPreMed), 4, 0));
      GXt_int5 = (byte)(AV23Val_stk) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "VALSTK", ""), GXv_int6) ;
      salidaproductomanual_detail_impl.this.GXt_int5 = GXv_int6[0] ;
      AV23Val_stk = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV23Val_stk", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV23Val_stk), 4, 0));
      GXt_int7 = AV24Precio_stk ;
      GXv_int8[0] = GXt_int7 ;
      new app.pbuscon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "VALSTK", ""), GXv_int8) ;
      salidaproductomanual_detail_impl.this.GXt_int7 = GXv_int8[0] ;
      AV24Precio_stk = (short)(GXt_int7) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV24Precio_stk", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV24Precio_stk), 4, 0));
      GXt_char1 = AV18Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      salidaproductomanual_detail_impl.this.GXt_char1 = GXv_char4[0] ;
      AV18Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18Station", AV18Station);
      GXv_char4[0] = AV7EmprCod ;
      GXv_char3[0] = AV19EmprNom ;
      GXv_char2[0] = AV17UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV18Station, GXv_char4, GXv_char3, GXv_char2) ;
      salidaproductomanual_detail_impl.this.AV7EmprCod = GXv_char4[0] ;
      salidaproductomanual_detail_impl.this.AV19EmprNom = GXv_char3[0] ;
      salidaproductomanual_detail_impl.this.AV17UsurCod = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7EmprCod", AV7EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV7EmprCod, "@!"))));
      httpContext.ajax_rsp_assign_attri("", false, "AV19EmprNom", AV19EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV17UsurCod", AV17UsurCod);
      GXv_SdtWWPContext9[0] = AV10WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext9) ;
      AV10WWPContext = GXv_SdtWWPContext9[0] ;
      edtPrdNum_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdNum_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNum_Visible), 5, 0), true);
      AV31ComboPrdNum = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV31ComboPrdNum", AV31ComboPrdNum);
      edtavComboprdnum_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavComboprdnum_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavComboprdnum_Visible), 5, 0), true);
      /* Execute user subroutine: 'LOADCOMBOPRDNUM' */
      S112 ();
      if ( returnInSub )
      {
         pr_default.close(6);
         pr_default.close(5);
         pr_default.close(4);
         pr_default.close(2);
         pr_default.close(1);
         returnInSub = true;
         if (true) return;
      }
      AV11TrnContext.fromxml(AV12WebSession.getValue("TrnContext"), null, null);
      if ( ( GXutil.strcmp(AV11TrnContext.getgxTv_SdtWWPTransactionContext_Transactionname(), AV33Pgmname) == 0 ) && ( GXutil.strcmp(Gx_mode, "INS") == 0 ) )
      {
         AV34GXV1 = 1 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV34GXV1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34GXV1), 8, 0));
         while ( AV34GXV1 <= AV11TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().size() )
         {
            AV14TrnContextAtt = (app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)((app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)AV11TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().elementAt(-1+AV34GXV1));
            if ( GXutil.strcmp(AV14TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributename(), "ForPrdUMe") == 0 )
            {
               AV13Insert_ForPrdUMe = (byte)(GXutil.lval( AV14TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributevalue())) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV13Insert_ForPrdUMe", GXutil.str( AV13Insert_ForPrdUMe, 1, 0));
            }
            AV34GXV1 = (int)(AV34GXV1+1) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV34GXV1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34GXV1), 8, 0));
         }
      }
      /* Object Property */
      if ( true )
      {
         bDynCreated_Webcomponent1 = true ;
      }
      if ( GXutil.strcmp(GXutil.lower( WebComp_Webcomponent1_Component), GXutil.lower( "SalidaProductoManual_WC")) != 0 )
      {
         WebComp_Webcomponent1 = WebUtils.getWebComponent(getClass(), "app.salidaproductomanual_wc_impl", remoteHandle, context);
         WebComp_Webcomponent1_Component = "SalidaProductoManual_WC" ;
      }
      if ( GXutil.len( WebComp_Webcomponent1_Component) != 0 )
      {
         WebComp_Webcomponent1.setjustcreated();
         WebComp_Webcomponent1.componentprepare(new Object[] {"W0069","",AV7EmprCod,Integer.valueOf(AV8CumCodCont)});
         WebComp_Webcomponent1.componentbind(new Object[] {"",""});
      }
   }

   public void e121TA2( )
   {
      /* After Trn Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         httpContext.setWebReturnParms(new Object[] {});
         httpContext.setWebReturnParmsMetadata(new Object[] {});
         httpContext.wjLocDisableFrm = (byte)(1) ;
         httpContext.nUserReturn = (byte)(1) ;
         pr_default.close(6);
         pr_default.close(5);
         pr_default.close(4);
         pr_default.close(2);
         pr_default.close(1);
         returnInSub = true;
         if (true) return;
      }
      else
      {
         callWebObject(formatLink("app.salidaproductomanual_detail", new String[] {GXutil.URLEncode(GXutil.rtrim("INS")),GXutil.URLEncode(GXutil.rtrim(AV7EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV8CumCodCont,8,0)),GXutil.URLEncode(GXutil.rtrim(""))}, new String[] {"Mode","EmprCod","CumCodCont","PrdNum"}) );
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
      if ( 1 == 0 )
      {
         httpContext.setWebReturnParms(new Object[] {});
         httpContext.setWebReturnParmsMetadata(new Object[] {});
         httpContext.wjLocDisableFrm = (byte)(1) ;
         httpContext.nUserReturn = (byte)(1) ;
         pr_default.close(6);
         pr_default.close(5);
         pr_default.close(4);
         pr_default.close(2);
         pr_default.close(1);
         returnInSub = true;
         if (true) return;
      }
   }

   public void S112( )
   {
      /* 'LOADCOMBOPRDNUM' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTComboData_Item10 = AV29PrdNum_Data ;
      GXv_char4[0] = AV30ComboSelectedValue ;
      GXv_objcol_SdtDVB_SDTComboData_Item11[0] = GXt_objcol_SdtDVB_SDTComboData_Item10 ;
      new app.salidaproductomanual_detailloaddvcombo(remoteHandle, context).execute( "PrdNum", Gx_mode, AV7EmprCod, AV8CumCodCont, AV9PrdNum, GXv_char4, GXv_objcol_SdtDVB_SDTComboData_Item11) ;
      salidaproductomanual_detail_impl.this.AV30ComboSelectedValue = GXv_char4[0] ;
      GXt_objcol_SdtDVB_SDTComboData_Item10 = GXv_objcol_SdtDVB_SDTComboData_Item11[0] ;
      AV29PrdNum_Data = GXt_objcol_SdtDVB_SDTComboData_Item10 ;
      Combo_prdnum_Selectedvalue_set = AV30ComboSelectedValue ;
      ucCombo_prdnum.sendProperty(context, "", false, Combo_prdnum_Internalname, "SelectedValue_set", Combo_prdnum_Selectedvalue_set);
      AV31ComboPrdNum = AV30ComboSelectedValue ;
      httpContext.ajax_rsp_assign_attri("", false, "AV31ComboPrdNum", AV31ComboPrdNum);
      if ( ( GXutil.strcmp(Gx_mode, "INS") != 0 ) || ! (GXutil.strcmp("", AV9PrdNum)==0) )
      {
         Combo_prdnum_Enabled = false ;
         ucCombo_prdnum.sendProperty(context, "", false, Combo_prdnum_Internalname, "Enabled", GXutil.booltostr( Combo_prdnum_Enabled));
      }
   }

   public void zm1TA112( int GX_JID )
   {
      if ( ( GX_JID == 36 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z861CumConCbis = T01TA3_A861CumConCbis[0] ;
            Z860CumConCant = T01TA3_A860CumConCant[0] ;
            Z8639CumUnidad = T01TA3_A8639CumUnidad[0] ;
            Z5862CumConLot = T01TA3_A5862CumConLot[0] ;
            Z12257PrdComID = T01TA3_A12257PrdComID[0] ;
            Z12700CumUMed = T01TA3_A12700CumUMed[0] ;
            Z14039CumLotAlm = T01TA3_A14039CumLotAlm[0] ;
            Z490ForPrdUMe = T01TA3_A490ForPrdUMe[0] ;
         }
         else
         {
            Z861CumConCbis = A861CumConCbis ;
            Z860CumConCant = A860CumConCant ;
            Z8639CumUnidad = A8639CumUnidad ;
            Z5862CumConLot = A5862CumConLot ;
            Z12257PrdComID = A12257PrdComID ;
            Z12700CumUMed = A12700CumUMed ;
            Z14039CumLotAlm = A14039CumLotAlm ;
            Z490ForPrdUMe = A490ForPrdUMe ;
         }
      }
      if ( ( GX_JID == 38 ) || ( GX_JID == 0 ) )
      {
         Z718PrdNom = T01TA6_A718PrdNom[0] ;
         Z707PrdFacCon = T01TA6_A707PrdFacCon[0] ;
         Z705PrdExiCC = T01TA6_A705PrdExiCC[0] ;
         Z685PrdCanRes = T01TA6_A685PrdCanRes[0] ;
         Z724PrdPreAct = T01TA6_A724PrdPreAct[0] ;
         Z726PrdPreMed = T01TA6_A726PrdPreMed[0] ;
         Z10881PrdLote = T01TA6_A10881PrdLote[0] ;
         Z856ValCod = T01TA6_A856ValCod[0] ;
      }
      if ( GX_JID == -36 )
      {
         Z861CumConCbis = A861CumConCbis ;
         Z860CumConCant = A860CumConCant ;
         Z8639CumUnidad = A8639CumUnidad ;
         Z5862CumConLot = A5862CumConLot ;
         Z12257PrdComID = A12257PrdComID ;
         Z12700CumUMed = A12700CumUMed ;
         Z14039CumLotAlm = A14039CumLotAlm ;
         Z396EmprCod = A396EmprCod ;
         Z719PrdNum = A719PrdNum ;
         Z490ForPrdUMe = A490ForPrdUMe ;
         Z859CumCodCont = A859CumCodCont ;
         Z407EmprNom = A407EmprNom ;
         Z3915EmpNumDec = A3915EmpNumDec ;
         Z488ForPrdDsc = A488ForPrdDsc ;
         Z11368CumConTipo = A11368CumConTipo ;
         Z862CumConFec = A862CumConFec ;
         Z10777CumCCos = A10777CumCCos ;
         Z8925CC_AlmCd = A8925CC_AlmCd ;
         Z3839CcoCod = A3839CcoCod ;
         Z704PrdExiAlm = A704PrdExiAlm ;
         Z750PrdValStk = A750PrdValStk ;
         Z718PrdNom = A718PrdNom ;
         Z707PrdFacCon = A707PrdFacCon ;
         Z705PrdExiCC = A705PrdExiCC ;
         Z685PrdCanRes = A685PrdCanRes ;
         Z724PrdPreAct = A724PrdPreAct ;
         Z726PrdPreMed = A726PrdPreMed ;
         Z10881PrdLote = A10881PrdLote ;
         Z856ValCod = A856ValCod ;
      }
   }

   public void standaloneNotModal( )
   {
      edtPrdExiAlm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdExiAlm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdExiAlm_Enabled), 5, 0), true);
      AV33Pgmname = "SalidaProductoManual_detail" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV33Pgmname", AV33Pgmname);
      Gx_BScreen = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      edtPrdExiAlm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdExiAlm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdExiAlm_Enabled), 5, 0), true);
      bttBtntrn_delete_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtntrn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_delete_Enabled), 5, 0), true);
      if ( ! (GXutil.strcmp("", AV7EmprCod)==0) )
      {
         A396EmprCod = AV7EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      }
      /* Using cursor T01TA4 */
      pr_default.execute(2, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01TA4_A407EmprNom[0] ;
      n407EmprNom = T01TA4_n407EmprNom[0] ;
      A3915EmpNumDec = T01TA4_A3915EmpNumDec[0] ;
      n3915EmpNumDec = T01TA4_n3915EmpNumDec[0] ;
      pr_default.close(2);
      imgprompt_719_5862_Link = ((GXutil.strcmp(Gx_mode, "DSP")==0) ? "" : "javascript:"+"gx.popup.openPrompt('"+"app.seleccionloteproducto"+"',["+"'"+WebUtils.htmlEncode( GXutil.strReplace( GXutil.rtrim( A396EmprCod), "'", "\\'"))+"'"+","+"{Ctrl:gx.dom.el('"+"PRDNUM"+"'), id:'"+"PRDNUM"+"'"+",IOType:'in',isKey:true,isLastKey:true}"+","+"{Ctrl:gx.dom.el('"+"CUMCONLOT"+"'), id:'"+"CUMCONLOT"+"'"+",IOType:'inout'}"+"],"+"null"+","+"'', false"+","+"false"+");") ;
      if ( ! (0==AV8CumCodCont) )
      {
         A859CumCodCont = AV8CumCodCont ;
         httpContext.ajax_rsp_assign_attri("", false, "A859CumCodCont", GXutil.ltrimstr( DecimalUtil.doubleToDec(A859CumCodCont), 8, 0));
      }
      /* Using cursor T01TA8 */
      pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A859CumCodCont)});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CCUMCO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CUMCODCONT");
         AnyError = (short)(1) ;
      }
      A11368CumConTipo = T01TA8_A11368CumConTipo[0] ;
      A862CumConFec = T01TA8_A862CumConFec[0] ;
      A10777CumCCos = T01TA8_A10777CumCCos[0] ;
      A8925CC_AlmCd = T01TA8_A8925CC_AlmCd[0] ;
      n8925CC_AlmCd = T01TA8_n8925CC_AlmCd[0] ;
      A3839CcoCod = T01TA8_A3839CcoCod[0] ;
      n3839CcoCod = T01TA8_n3839CcoCod[0] ;
      pr_default.close(6);
      AV25Mes = (byte)(GXutil.month( A862CumConFec)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV25Mes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV25Mes), 2, 0));
      AV26Year = (short)(GXutil.year( A862CumConFec)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV26Year", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV26Year), 4, 0));
      GXt_char1 = A10778CumCCosD ;
      GXv_int12[0] = A10777CumCCos ;
      GXv_char4[0] = GXt_char1 ;
      new app.pccdsc(remoteHandle, context).execute( GXv_int12, GXv_char4) ;
      salidaproductomanual_detail_impl.this.A10777CumCCos = GXv_int12[0] ;
      salidaproductomanual_detail_impl.this.GXt_char1 = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A10777CumCCos", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10777CumCCos), 3, 0));
      A10778CumCCosD = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "A10778CumCCosD", A10778CumCCosD);
      GXt_char1 = A8926CC_AlmDc ;
      GXv_char4[0] = A396EmprCod ;
      GXv_int6[0] = A8925CC_AlmCd ;
      GXv_char3[0] = GXt_char1 ;
      new app.pexialmc(remoteHandle, context).execute( GXv_char4, GXv_int6, GXv_char3) ;
      salidaproductomanual_detail_impl.this.A396EmprCod = GXv_char4[0] ;
      salidaproductomanual_detail_impl.this.A8925CC_AlmCd = GXv_int6[0] ;
      salidaproductomanual_detail_impl.this.GXt_char1 = GXv_char3[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A8925CC_AlmCd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8925CC_AlmCd), 2, 0));
      A8926CC_AlmDc = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "A8926CC_AlmDc", A8926CC_AlmDc);
      if ( ! (GXutil.strcmp("", AV9PrdNum)==0) )
      {
         edtPrdNum_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtPrdNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNum_Enabled), 5, 0), true);
      }
      else
      {
         edtPrdNum_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtPrdNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNum_Enabled), 5, 0), true);
      }
      if ( ! (GXutil.strcmp("", AV9PrdNum)==0) )
      {
         edtPrdNum_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtPrdNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNum_Enabled), 5, 0), true);
      }
      if ( ! (GXutil.strcmp("", AV9PrdNum)==0) )
      {
         A719PrdNum = AV9PrdNum ;
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
      }
      else
      {
         A719PrdNum = AV31ComboPrdNum ;
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
      }
   }

   public void standaloneModal( )
   {
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV13Insert_ForPrdUMe) )
      {
         A490ForPrdUMe = AV13Insert_ForPrdUMe ;
         httpContext.ajax_rsp_assign_attri("", false, "A490ForPrdUMe", GXutil.str( A490ForPrdUMe, 1, 0));
      }
      if ( GXutil.strcmp(Gx_mode, "DSP") == 0 )
      {
         bttBtntrn_enter_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, bttBtntrn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_enter_Enabled), 5, 0), true);
      }
      else
      {
         bttBtntrn_enter_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, bttBtntrn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_enter_Enabled), 5, 0), true);
      }
      if ( isIns( )  && (0==A8639CumUnidad) && ( Gx_BScreen == 0 ) )
      {
         A8639CumUnidad = (byte)(AV20ConMan) ;
         httpContext.ajax_rsp_assign_attri("", false, "A8639CumUnidad", GXutil.str( A8639CumUnidad, 1, 0));
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ( Gx_BScreen == 0 ) )
      {
         /* Using cursor T01TA6 */
         pr_default.execute(4, new Object[] {A396EmprCod, A719PrdNum});
         zm1TA112( 38) ;
         A704PrdExiAlm = T01TA6_A704PrdExiAlm[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A704PrdExiAlm", GXutil.ltrimstr( A704PrdExiAlm, 12, 4));
         A750PrdValStk = T01TA6_A750PrdValStk[0] ;
         A718PrdNom = T01TA6_A718PrdNom[0] ;
         A707PrdFacCon = T01TA6_A707PrdFacCon[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A707PrdFacCon", GXutil.ltrimstr( A707PrdFacCon, 7, 4));
         A705PrdExiCC = T01TA6_A705PrdExiCC[0] ;
         A685PrdCanRes = T01TA6_A685PrdCanRes[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A685PrdCanRes", GXutil.ltrimstr( A685PrdCanRes, 12, 4));
         A724PrdPreAct = T01TA6_A724PrdPreAct[0] ;
         A726PrdPreMed = T01TA6_A726PrdPreMed[0] ;
         A10881PrdLote = T01TA6_A10881PrdLote[0] ;
         A856ValCod = T01TA6_A856ValCod[0] ;
         O750PrdValStk = A750PrdValStk ;
         httpContext.ajax_rsp_assign_attri("", false, "A750PrdValStk", GXutil.ltrimstr( A750PrdValStk, 11, 2));
         O704PrdExiAlm = A704PrdExiAlm ;
         httpContext.ajax_rsp_assign_attri("", false, "A704PrdExiAlm", GXutil.ltrimstr( A704PrdExiAlm, 12, 4));
         pr_default.close(4);
         GXt_date13 = A3835UltFecCCs ;
         GXv_char4[0] = A396EmprCod ;
         GXv_char3[0] = A719PrdNum ;
         GXv_date14[0] = GXt_date13 ;
         new app.pstm005(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_date14) ;
         salidaproductomanual_detail_impl.this.A396EmprCod = GXv_char4[0] ;
         salidaproductomanual_detail_impl.this.A719PrdNum = GXv_char3[0] ;
         salidaproductomanual_detail_impl.this.GXt_date13 = GXv_date14[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         A3835UltFecCCs = GXt_date13 ;
         httpContext.ajax_rsp_assign_attri("", false, "A3835UltFecCCs", localUtil.format(A3835UltFecCCs, "99/99/99"));
         /* Using cursor T01TA7 */
         pr_default.execute(5, new Object[] {A396EmprCod, Byte.valueOf(A490ForPrdUMe)});
         A488ForPrdDsc = T01TA7_A488ForPrdDsc[0] ;
         n488ForPrdDsc = T01TA7_n488ForPrdDsc[0] ;
         pr_default.close(5);
      }
   }

   public void load1TA112( )
   {
      /* Using cursor T01TA9 */
      pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A859CumCodCont), A719PrdNum});
      if ( (pr_default.getStatus(7) != 101) )
      {
         RcdFound112 = (short)(1) ;
         A861CumConCbis = T01TA9_A861CumConCbis[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A861CumConCbis", GXutil.ltrimstr( A861CumConCbis, 12, 4));
         A704PrdExiAlm = T01TA9_A704PrdExiAlm[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A704PrdExiAlm", GXutil.ltrimstr( A704PrdExiAlm, 12, 4));
         A750PrdValStk = T01TA9_A750PrdValStk[0] ;
         A407EmprNom = T01TA9_A407EmprNom[0] ;
         n407EmprNom = T01TA9_n407EmprNom[0] ;
         A3915EmpNumDec = T01TA9_A3915EmpNumDec[0] ;
         n3915EmpNumDec = T01TA9_n3915EmpNumDec[0] ;
         A11368CumConTipo = T01TA9_A11368CumConTipo[0] ;
         A862CumConFec = T01TA9_A862CumConFec[0] ;
         A10777CumCCos = T01TA9_A10777CumCCos[0] ;
         A8925CC_AlmCd = T01TA9_A8925CC_AlmCd[0] ;
         n8925CC_AlmCd = T01TA9_n8925CC_AlmCd[0] ;
         A718PrdNom = T01TA9_A718PrdNom[0] ;
         A707PrdFacCon = T01TA9_A707PrdFacCon[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A707PrdFacCon", GXutil.ltrimstr( A707PrdFacCon, 7, 4));
         A705PrdExiCC = T01TA9_A705PrdExiCC[0] ;
         A685PrdCanRes = T01TA9_A685PrdCanRes[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A685PrdCanRes", GXutil.ltrimstr( A685PrdCanRes, 12, 4));
         A860CumConCant = T01TA9_A860CumConCant[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A860CumConCant", GXutil.ltrimstr( A860CumConCant, 12, 4));
         A8639CumUnidad = T01TA9_A8639CumUnidad[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8639CumUnidad", GXutil.str( A8639CumUnidad, 1, 0));
         A5862CumConLot = T01TA9_A5862CumConLot[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5862CumConLot", A5862CumConLot);
         A724PrdPreAct = T01TA9_A724PrdPreAct[0] ;
         A726PrdPreMed = T01TA9_A726PrdPreMed[0] ;
         A488ForPrdDsc = T01TA9_A488ForPrdDsc[0] ;
         n488ForPrdDsc = T01TA9_n488ForPrdDsc[0] ;
         A12257PrdComID = T01TA9_A12257PrdComID[0] ;
         A10881PrdLote = T01TA9_A10881PrdLote[0] ;
         A12700CumUMed = T01TA9_A12700CumUMed[0] ;
         A14039CumLotAlm = T01TA9_A14039CumLotAlm[0] ;
         A490ForPrdUMe = T01TA9_A490ForPrdUMe[0] ;
         A856ValCod = T01TA9_A856ValCod[0] ;
         A3839CcoCod = T01TA9_A3839CcoCod[0] ;
         n3839CcoCod = T01TA9_n3839CcoCod[0] ;
         zm1TA112( -36) ;
      }
      pr_default.close(7);
      onLoadActions1TA112( ) ;
   }

   public void onLoadActions1TA112( )
   {
      O750PrdValStk = A750PrdValStk ;
      httpContext.ajax_rsp_assign_attri("", false, "A750PrdValStk", GXutil.ltrimstr( A750PrdValStk, 11, 2));
      O704PrdExiAlm = A704PrdExiAlm ;
      httpContext.ajax_rsp_assign_attri("", false, "A704PrdExiAlm", GXutil.ltrimstr( A704PrdExiAlm, 12, 4));
      if ( A8639CumUnidad == 0 )
      {
         A861CumConCbis = (A860CumConCant.divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN)).multiply(A707PrdFacCon) ;
         httpContext.ajax_rsp_assign_attri("", false, "A861CumConCbis", GXutil.ltrimstr( A861CumConCbis, 12, 4));
      }
      else
      {
         if ( A8639CumUnidad == 1 )
         {
            A861CumConCbis = A860CumConCant.multiply(A707PrdFacCon) ;
            httpContext.ajax_rsp_assign_attri("", false, "A861CumConCbis", GXutil.ltrimstr( A861CumConCbis, 12, 4));
         }
      }
      if ( A8639CumUnidad == 0 )
      {
         AV16CumConOld = (O860CumConCant.divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN)).multiply(A707PrdFacCon) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV16CumConOld", GXutil.ltrimstr( AV16CumConOld, 12, 4));
      }
      else
      {
         if ( A8639CumUnidad == 1 )
         {
            AV16CumConOld = O860CumConCant.multiply(A707PrdFacCon) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV16CumConOld", GXutil.ltrimstr( AV16CumConOld, 12, 4));
         }
      }
      if ( A3915EmpNumDec == 0 )
      {
         A863CumCosPro = GXutil.roundDecimal( A861CumConCbis.multiply(A724PrdPreAct), 0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A863CumCosPro", GXutil.ltrimstr( A863CumCosPro, 10, 2));
      }
      else
      {
         if ( A3915EmpNumDec == 2 )
         {
            A863CumCosPro = GXutil.roundDecimal( A861CumConCbis.multiply(A724PrdPreAct), 2) ;
            httpContext.ajax_rsp_assign_attri("", false, "A863CumCosPro", GXutil.ltrimstr( A863CumCosPro, 10, 2));
         }
         else
         {
            A863CumCosPro = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A863CumCosPro", GXutil.ltrimstr( A863CumCosPro, 10, 2));
         }
      }
      if ( isIns( )  && (GXutil.strcmp("", A5862CumConLot)==0) && ( Gx_BScreen == 0 ) )
      {
         A5862CumConLot = A10881PrdLote ;
         httpContext.ajax_rsp_assign_attri("", false, "A5862CumConLot", A5862CumConLot);
      }
      GXt_date13 = A3835UltFecCCs ;
      GXv_char4[0] = A396EmprCod ;
      GXv_char3[0] = A719PrdNum ;
      GXv_date14[0] = GXt_date13 ;
      new app.pstm005(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_date14) ;
      salidaproductomanual_detail_impl.this.A396EmprCod = GXv_char4[0] ;
      salidaproductomanual_detail_impl.this.A719PrdNum = GXv_char3[0] ;
      salidaproductomanual_detail_impl.this.GXt_date13 = GXv_date14[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
      A3835UltFecCCs = GXt_date13 ;
      httpContext.ajax_rsp_assign_attri("", false, "A3835UltFecCCs", localUtil.format(A3835UltFecCCs, "99/99/99"));
      if ( isDlt( )  )
      {
         A704PrdExiAlm = O704PrdExiAlm.add(O861CumConCbis) ;
         httpContext.ajax_rsp_assign_attri("", false, "A704PrdExiAlm", GXutil.ltrimstr( A704PrdExiAlm, 12, 4));
      }
      else
      {
         if ( isIns( )  || isUpd( )  || isDlt( )  )
         {
            A704PrdExiAlm = O704PrdExiAlm.subtract(A861CumConCbis).add(O861CumConCbis) ;
            httpContext.ajax_rsp_assign_attri("", false, "A704PrdExiAlm", GXutil.ltrimstr( A704PrdExiAlm, 12, 4));
         }
      }
   }

   public void checkExtendedTable1TA112( )
   {
      nIsDirty_112 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal( ) ;
      /* Using cursor T01TA6 */
      pr_default.execute(4, new Object[] {A396EmprCod, A719PrdNum});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PRODUC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PRDNUM");
         AnyError = (short)(1) ;
         GX_FocusControl = edtPrdNum_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A704PrdExiAlm = T01TA6_A704PrdExiAlm[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A704PrdExiAlm", GXutil.ltrimstr( A704PrdExiAlm, 12, 4));
      A750PrdValStk = T01TA6_A750PrdValStk[0] ;
      A718PrdNom = T01TA6_A718PrdNom[0] ;
      A707PrdFacCon = T01TA6_A707PrdFacCon[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A707PrdFacCon", GXutil.ltrimstr( A707PrdFacCon, 7, 4));
      A705PrdExiCC = T01TA6_A705PrdExiCC[0] ;
      A685PrdCanRes = T01TA6_A685PrdCanRes[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A685PrdCanRes", GXutil.ltrimstr( A685PrdCanRes, 12, 4));
      A724PrdPreAct = T01TA6_A724PrdPreAct[0] ;
      A726PrdPreMed = T01TA6_A726PrdPreMed[0] ;
      A10881PrdLote = T01TA6_A10881PrdLote[0] ;
      A856ValCod = T01TA6_A856ValCod[0] ;
      nIsDirty_112 = (short)(1) ;
      O750PrdValStk = A750PrdValStk ;
      httpContext.ajax_rsp_assign_attri("", false, "A750PrdValStk", GXutil.ltrimstr( A750PrdValStk, 11, 2));
      nIsDirty_112 = (short)(1) ;
      O704PrdExiAlm = A704PrdExiAlm ;
      httpContext.ajax_rsp_assign_attri("", false, "A704PrdExiAlm", GXutil.ltrimstr( A704PrdExiAlm, 12, 4));
      pr_default.close(4);
      if ( A8639CumUnidad == 0 )
      {
         nIsDirty_112 = (short)(1) ;
         A861CumConCbis = (A860CumConCant.divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN)).multiply(A707PrdFacCon) ;
         httpContext.ajax_rsp_assign_attri("", false, "A861CumConCbis", GXutil.ltrimstr( A861CumConCbis, 12, 4));
      }
      else
      {
         if ( A8639CumUnidad == 1 )
         {
            nIsDirty_112 = (short)(1) ;
            A861CumConCbis = A860CumConCant.multiply(A707PrdFacCon) ;
            httpContext.ajax_rsp_assign_attri("", false, "A861CumConCbis", GXutil.ltrimstr( A861CumConCbis, 12, 4));
         }
      }
      if ( A8639CumUnidad == 0 )
      {
         AV16CumConOld = (O860CumConCant.divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN)).multiply(A707PrdFacCon) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV16CumConOld", GXutil.ltrimstr( AV16CumConOld, 12, 4));
      }
      else
      {
         if ( A8639CumUnidad == 1 )
         {
            AV16CumConOld = O860CumConCant.multiply(A707PrdFacCon) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV16CumConOld", GXutil.ltrimstr( AV16CumConOld, 12, 4));
         }
      }
      if ( A3915EmpNumDec == 0 )
      {
         nIsDirty_112 = (short)(1) ;
         A863CumCosPro = GXutil.roundDecimal( A861CumConCbis.multiply(A724PrdPreAct), 0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A863CumCosPro", GXutil.ltrimstr( A863CumCosPro, 10, 2));
      }
      else
      {
         if ( A3915EmpNumDec == 2 )
         {
            nIsDirty_112 = (short)(1) ;
            A863CumCosPro = GXutil.roundDecimal( A861CumConCbis.multiply(A724PrdPreAct), 2) ;
            httpContext.ajax_rsp_assign_attri("", false, "A863CumCosPro", GXutil.ltrimstr( A863CumCosPro, 10, 2));
         }
         else
         {
            nIsDirty_112 = (short)(1) ;
            A863CumCosPro = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A863CumCosPro", GXutil.ltrimstr( A863CumCosPro, 10, 2));
         }
      }
      if ( isIns( )  && (GXutil.strcmp("", A5862CumConLot)==0) && ( Gx_BScreen == 0 ) )
      {
         nIsDirty_112 = (short)(1) ;
         A5862CumConLot = A10881PrdLote ;
         httpContext.ajax_rsp_assign_attri("", false, "A5862CumConLot", A5862CumConLot);
      }
      /* Using cursor T01TA7 */
      pr_default.execute(5, new Object[] {A396EmprCod, Byte.valueOf(A490ForPrdUMe)});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "UNMEPR", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "FORPRDUME");
         AnyError = (short)(1) ;
      }
      A488ForPrdDsc = T01TA7_A488ForPrdDsc[0] ;
      n488ForPrdDsc = T01TA7_n488ForPrdDsc[0] ;
      pr_default.close(5);
      nIsDirty_112 = (short)(1) ;
      GXt_date13 = A3835UltFecCCs ;
      GXv_char4[0] = A396EmprCod ;
      GXv_char3[0] = A719PrdNum ;
      GXv_date14[0] = GXt_date13 ;
      new app.pstm005(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_date14) ;
      salidaproductomanual_detail_impl.this.A396EmprCod = GXv_char4[0] ;
      salidaproductomanual_detail_impl.this.A719PrdNum = GXv_char3[0] ;
      salidaproductomanual_detail_impl.this.GXt_date13 = GXv_date14[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
      A3835UltFecCCs = GXt_date13 ;
      httpContext.ajax_rsp_assign_attri("", false, "A3835UltFecCCs", localUtil.format(A3835UltFecCCs, "99/99/99"));
      if ( isDlt( )  )
      {
         nIsDirty_112 = (short)(1) ;
         A704PrdExiAlm = O704PrdExiAlm.add(O861CumConCbis) ;
         httpContext.ajax_rsp_assign_attri("", false, "A704PrdExiAlm", GXutil.ltrimstr( A704PrdExiAlm, 12, 4));
      }
      else
      {
         if ( isIns( )  || isUpd( )  || isDlt( )  )
         {
            nIsDirty_112 = (short)(1) ;
            A704PrdExiAlm = O704PrdExiAlm.subtract(A861CumConCbis).add(O861CumConCbis) ;
            httpContext.ajax_rsp_assign_attri("", false, "A704PrdExiAlm", GXutil.ltrimstr( A704PrdExiAlm, 12, 4));
         }
      }
      if ( ( A704PrdExiAlm.doubleValue() < 0 ) && ( GXutil.strcmp(GXutil.substring( A719PrdNum, 1, 1), "0") != 0 ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "AVISO.Cantidad Insuficiente", ""), 1, "PRDNUM");
         AnyError = (short)(1) ;
         GX_FocusControl = edtPrdNum_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
   }

   public void closeExtendedTableCursors1TA112( )
   {
      pr_default.close(3);
      pr_default.close(5);
   }

   public void enableDisable( )
   {
   }

   public void gxload_38( String A396EmprCod ,
                          String A719PrdNum )
   {
      /* Using cursor T01TA6 */
      pr_default.execute(4, new Object[] {A396EmprCod, A719PrdNum});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PRODUC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PRDNUM");
         AnyError = (short)(1) ;
         GX_FocusControl = edtPrdNum_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A704PrdExiAlm = T01TA6_A704PrdExiAlm[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A704PrdExiAlm", GXutil.ltrimstr( A704PrdExiAlm, 12, 4));
      A750PrdValStk = T01TA6_A750PrdValStk[0] ;
      A718PrdNom = T01TA6_A718PrdNom[0] ;
      A707PrdFacCon = T01TA6_A707PrdFacCon[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A707PrdFacCon", GXutil.ltrimstr( A707PrdFacCon, 7, 4));
      A705PrdExiCC = T01TA6_A705PrdExiCC[0] ;
      A685PrdCanRes = T01TA6_A685PrdCanRes[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A685PrdCanRes", GXutil.ltrimstr( A685PrdCanRes, 12, 4));
      A724PrdPreAct = T01TA6_A724PrdPreAct[0] ;
      A726PrdPreMed = T01TA6_A726PrdPreMed[0] ;
      A10881PrdLote = T01TA6_A10881PrdLote[0] ;
      A856ValCod = T01TA6_A856ValCod[0] ;
      O750PrdValStk = A750PrdValStk ;
      httpContext.ajax_rsp_assign_attri("", false, "A750PrdValStk", GXutil.ltrimstr( A750PrdValStk, 11, 2));
      O704PrdExiAlm = A704PrdExiAlm ;
      httpContext.ajax_rsp_assign_attri("", false, "A704PrdExiAlm", GXutil.ltrimstr( A704PrdExiAlm, 12, 4));
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A704PrdExiAlm, (byte)(12), (byte)(4), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A750PrdValStk, (byte)(11), (byte)(2), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A718PrdNom))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A707PrdFacCon, (byte)(7), (byte)(4), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A705PrdExiCC, (byte)(12), (byte)(4), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A685PrdCanRes, (byte)(12), (byte)(4), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A724PrdPreAct, (byte)(14), (byte)(5), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A726PrdPreMed, (byte)(14), (byte)(5), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A10881PrdLote))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A856ValCod, (byte)(1), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(4) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(4);
   }

   public void gxload_39( String A396EmprCod ,
                          byte A490ForPrdUMe )
   {
      /* Using cursor T01TA10 */
      pr_default.execute(8, new Object[] {A396EmprCod, Byte.valueOf(A490ForPrdUMe)});
      if ( (pr_default.getStatus(8) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "UNMEPR", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "FORPRDUME");
         AnyError = (short)(1) ;
      }
      A488ForPrdDsc = T01TA10_A488ForPrdDsc[0] ;
      n488ForPrdDsc = T01TA10_n488ForPrdDsc[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A488ForPrdDsc))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(8) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(8);
   }

   public void getKey1TA112( )
   {
      /* Using cursor T01TA11 */
      pr_default.execute(9, new Object[] {A396EmprCod, Integer.valueOf(A859CumCodCont), A719PrdNum});
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound112 = (short)(1) ;
      }
      else
      {
         RcdFound112 = (short)(0) ;
      }
      pr_default.close(9);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01TA3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A859CumCodCont), A719PrdNum});
      if ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(T01TA3_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1TA112( 36) ;
         RcdFound112 = (short)(1) ;
         A861CumConCbis = T01TA3_A861CumConCbis[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A861CumConCbis", GXutil.ltrimstr( A861CumConCbis, 12, 4));
         A860CumConCant = T01TA3_A860CumConCant[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A860CumConCant", GXutil.ltrimstr( A860CumConCant, 12, 4));
         A8639CumUnidad = T01TA3_A8639CumUnidad[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8639CumUnidad", GXutil.str( A8639CumUnidad, 1, 0));
         A5862CumConLot = T01TA3_A5862CumConLot[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5862CumConLot", A5862CumConLot);
         A12257PrdComID = T01TA3_A12257PrdComID[0] ;
         A12700CumUMed = T01TA3_A12700CumUMed[0] ;
         A14039CumLotAlm = T01TA3_A14039CumLotAlm[0] ;
         A719PrdNum = T01TA3_A719PrdNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         A490ForPrdUMe = T01TA3_A490ForPrdUMe[0] ;
         A859CumCodCont = T01TA3_A859CumCodCont[0] ;
         O861CumConCbis = A861CumConCbis ;
         httpContext.ajax_rsp_assign_attri("", false, "A861CumConCbis", GXutil.ltrimstr( A861CumConCbis, 12, 4));
         O860CumConCant = A860CumConCant ;
         httpContext.ajax_rsp_assign_attri("", false, "A860CumConCant", GXutil.ltrimstr( A860CumConCant, 12, 4));
         Z396EmprCod = A396EmprCod ;
         Z859CumCodCont = A859CumCodCont ;
         Z719PrdNum = A719PrdNum ;
         sMode112 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load1TA112( ) ;
         if ( AnyError == 1 )
         {
            RcdFound112 = (short)(0) ;
            initializeNonKey1TA112( ) ;
         }
         Gx_mode = sMode112 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound112 = (short)(0) ;
         initializeNonKey1TA112( ) ;
         sMode112 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode112 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey1TA112( ) ;
      if ( RcdFound112 == 0 )
      {
      }
      else
      {
      }
      getByPrimaryKey( ) ;
   }

   public void move_next( )
   {
      RcdFound112 = (short)(0) ;
      /* Using cursor T01TA12 */
      pr_default.execute(10, new Object[] {Integer.valueOf(A859CumCodCont), Integer.valueOf(A859CumCodCont), A719PrdNum, A396EmprCod});
      if ( (pr_default.getStatus(10) != 101) )
      {
         while ( (pr_default.getStatus(10) != 101) && ( ( T01TA12_A859CumCodCont[0] < A859CumCodCont ) || ( T01TA12_A859CumCodCont[0] == A859CumCodCont ) && ( GXutil.strcmp(T01TA12_A719PrdNum[0], A719PrdNum) < 0 ) ) && ( GXutil.strcmp(T01TA12_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(10);
         }
         if ( (pr_default.getStatus(10) != 101) && ( ( T01TA12_A859CumCodCont[0] > A859CumCodCont ) || ( T01TA12_A859CumCodCont[0] == A859CumCodCont ) && ( GXutil.strcmp(T01TA12_A719PrdNum[0], A719PrdNum) > 0 ) ) && ( GXutil.strcmp(T01TA12_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A859CumCodCont = T01TA12_A859CumCodCont[0] ;
            A719PrdNum = T01TA12_A719PrdNum[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
            RcdFound112 = (short)(1) ;
         }
      }
      pr_default.close(10);
   }

   public void move_previous( )
   {
      RcdFound112 = (short)(0) ;
      /* Using cursor T01TA13 */
      pr_default.execute(11, new Object[] {Integer.valueOf(A859CumCodCont), Integer.valueOf(A859CumCodCont), A719PrdNum, A396EmprCod});
      if ( (pr_default.getStatus(11) != 101) )
      {
         while ( (pr_default.getStatus(11) != 101) && ( ( T01TA13_A859CumCodCont[0] > A859CumCodCont ) || ( T01TA13_A859CumCodCont[0] == A859CumCodCont ) && ( GXutil.strcmp(T01TA13_A719PrdNum[0], A719PrdNum) > 0 ) ) && ( GXutil.strcmp(T01TA13_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(11);
         }
         if ( (pr_default.getStatus(11) != 101) && ( ( T01TA13_A859CumCodCont[0] < A859CumCodCont ) || ( T01TA13_A859CumCodCont[0] == A859CumCodCont ) && ( GXutil.strcmp(T01TA13_A719PrdNum[0], A719PrdNum) < 0 ) ) && ( GXutil.strcmp(T01TA13_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A859CumCodCont = T01TA13_A859CumCodCont[0] ;
            A719PrdNum = T01TA13_A719PrdNum[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
            RcdFound112 = (short)(1) ;
         }
      }
      pr_default.close(11);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1TA112( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtPrdNum_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1TA112( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound112 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A859CumCodCont != Z859CumCodCont ) || ( GXutil.strcmp(A719PrdNum, Z719PrdNum) != 0 ) )
            {
               A859CumCodCont = Z859CumCodCont ;
               httpContext.ajax_rsp_assign_attri("", false, "A859CumCodCont", GXutil.ltrimstr( DecimalUtil.doubleToDec(A859CumCodCont), 8, 0));
               A719PrdNum = Z719PrdNum ;
               httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "PRDNUM");
               AnyError = (short)(1) ;
               GX_FocusControl = edtPrdNum_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtPrdNum_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               /* Update record */
               update1TA112( ) ;
               GX_FocusControl = edtPrdNum_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A859CumCodCont != Z859CumCodCont ) || ( GXutil.strcmp(A719PrdNum, Z719PrdNum) != 0 ) )
            {
               /* Insert record */
               GX_FocusControl = edtPrdNum_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1TA112( ) ;
               if ( AnyError == 1 )
               {
                  GX_FocusControl = "" ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( GXutil.strcmp(Gx_mode, "UPD") == 0 )
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "PRDNUM");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtPrdNum_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               else
               {
                  /* Insert record */
                  GX_FocusControl = edtPrdNum_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1TA112( ) ;
                  if ( AnyError == 1 )
                  {
                     GX_FocusControl = "" ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
      }
      afterTrn( ) ;
      if ( isUpd( ) || isDlt( ) )
      {
         if ( AnyError == 0 )
         {
            httpContext.nUserReturn = (byte)(1) ;
         }
      }
   }

   public void btn_delete( )
   {
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A859CumCodCont != Z859CumCodCont ) || ( GXutil.strcmp(A719PrdNum, Z719PrdNum) != 0 ) )
      {
         A859CumCodCont = Z859CumCodCont ;
         httpContext.ajax_rsp_assign_attri("", false, "A859CumCodCont", GXutil.ltrimstr( DecimalUtil.doubleToDec(A859CumCodCont), 8, 0));
         A719PrdNum = Z719PrdNum ;
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "PRDNUM");
         AnyError = (short)(1) ;
         GX_FocusControl = edtPrdNum_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtPrdNum_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( AnyError != 0 )
      {
      }
   }

   public void checkOptimisticConcurrency1TA112( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01TA2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A859CumCodCont), A719PrdNum});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPLCUMCO"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( DecimalUtil.compareTo(Z861CumConCbis, T01TA2_A861CumConCbis[0]) != 0 ) || ( DecimalUtil.compareTo(Z860CumConCant, T01TA2_A860CumConCant[0]) != 0 ) || ( Z8639CumUnidad != T01TA2_A8639CumUnidad[0] ) || ( GXutil.strcmp(Z5862CumConLot, T01TA2_A5862CumConLot[0]) != 0 ) || ( GXutil.strcmp(Z12257PrdComID, T01TA2_A12257PrdComID[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z12700CumUMed != T01TA2_A12700CumUMed[0] ) || ( Z14039CumLotAlm != T01TA2_A14039CumLotAlm[0] ) || ( Z490ForPrdUMe != T01TA2_A490ForPrdUMe[0] ) )
         {
            if ( DecimalUtil.compareTo(Z861CumConCbis, T01TA2_A861CumConCbis[0]) != 0 )
            {
               GXutil.writeLogln("salidaproductomanual_detail:[seudo value changed for attri]"+"CumConCbis");
               GXutil.writeLogRaw("Old: ",Z861CumConCbis);
               GXutil.writeLogRaw("Current: ",T01TA2_A861CumConCbis[0]);
            }
            if ( DecimalUtil.compareTo(Z860CumConCant, T01TA2_A860CumConCant[0]) != 0 )
            {
               GXutil.writeLogln("salidaproductomanual_detail:[seudo value changed for attri]"+"CumConCant");
               GXutil.writeLogRaw("Old: ",Z860CumConCant);
               GXutil.writeLogRaw("Current: ",T01TA2_A860CumConCant[0]);
            }
            if ( Z8639CumUnidad != T01TA2_A8639CumUnidad[0] )
            {
               GXutil.writeLogln("salidaproductomanual_detail:[seudo value changed for attri]"+"CumUnidad");
               GXutil.writeLogRaw("Old: ",Z8639CumUnidad);
               GXutil.writeLogRaw("Current: ",T01TA2_A8639CumUnidad[0]);
            }
            if ( GXutil.strcmp(Z5862CumConLot, T01TA2_A5862CumConLot[0]) != 0 )
            {
               GXutil.writeLogln("salidaproductomanual_detail:[seudo value changed for attri]"+"CumConLot");
               GXutil.writeLogRaw("Old: ",Z5862CumConLot);
               GXutil.writeLogRaw("Current: ",T01TA2_A5862CumConLot[0]);
            }
            if ( GXutil.strcmp(Z12257PrdComID, T01TA2_A12257PrdComID[0]) != 0 )
            {
               GXutil.writeLogln("salidaproductomanual_detail:[seudo value changed for attri]"+"PrdComID");
               GXutil.writeLogRaw("Old: ",Z12257PrdComID);
               GXutil.writeLogRaw("Current: ",T01TA2_A12257PrdComID[0]);
            }
            if ( Z12700CumUMed != T01TA2_A12700CumUMed[0] )
            {
               GXutil.writeLogln("salidaproductomanual_detail:[seudo value changed for attri]"+"CumUMed");
               GXutil.writeLogRaw("Old: ",Z12700CumUMed);
               GXutil.writeLogRaw("Current: ",T01TA2_A12700CumUMed[0]);
            }
            if ( Z14039CumLotAlm != T01TA2_A14039CumLotAlm[0] )
            {
               GXutil.writeLogln("salidaproductomanual_detail:[seudo value changed for attri]"+"CumLotAlm");
               GXutil.writeLogRaw("Old: ",Z14039CumLotAlm);
               GXutil.writeLogRaw("Current: ",T01TA2_A14039CumLotAlm[0]);
            }
            if ( Z490ForPrdUMe != T01TA2_A490ForPrdUMe[0] )
            {
               GXutil.writeLogln("salidaproductomanual_detail:[seudo value changed for attri]"+"ForPrdUMe");
               GXutil.writeLogRaw("Old: ",Z490ForPrdUMe);
               GXutil.writeLogRaw("Current: ",T01TA2_A490ForPrdUMe[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPLCUMCO"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
      /* Using cursor T01TA14 */
      pr_default.execute(12, new Object[] {A396EmprCod, A719PrdNum});
      if ( (pr_default.getStatus(12) == 103) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPPRODUC"}), "RecordIsLocked", 1, "");
         AnyError = (short)(1) ;
         return  ;
      }
      if ( ! isIns( ) )
      {
         Gx_longc = false ;
         if ( false || ( GXutil.strcmp(Z718PrdNom, T01TA14_A718PrdNom[0]) != 0 ) || ( DecimalUtil.compareTo(Z707PrdFacCon, T01TA14_A707PrdFacCon[0]) != 0 ) || ( DecimalUtil.compareTo(Z705PrdExiCC, T01TA14_A705PrdExiCC[0]) != 0 ) || ( DecimalUtil.compareTo(Z685PrdCanRes, T01TA14_A685PrdCanRes[0]) != 0 ) || ( DecimalUtil.compareTo(Z724PrdPreAct, T01TA14_A724PrdPreAct[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( DecimalUtil.compareTo(Z726PrdPreMed, T01TA14_A726PrdPreMed[0]) != 0 ) || ( GXutil.strcmp(Z10881PrdLote, T01TA14_A10881PrdLote[0]) != 0 ) || ( Z856ValCod != T01TA14_A856ValCod[0] ) )
         {
            if ( GXutil.strcmp(Z718PrdNom, T01TA14_A718PrdNom[0]) != 0 )
            {
               GXutil.writeLogln("salidaproductomanual_detail:[seudo value changed for attri]"+"PrdNom");
               GXutil.writeLogRaw("Old: ",Z718PrdNom);
               GXutil.writeLogRaw("Current: ",T01TA14_A718PrdNom[0]);
            }
            if ( DecimalUtil.compareTo(Z707PrdFacCon, T01TA14_A707PrdFacCon[0]) != 0 )
            {
               GXutil.writeLogln("salidaproductomanual_detail:[seudo value changed for attri]"+"PrdFacCon");
               GXutil.writeLogRaw("Old: ",Z707PrdFacCon);
               GXutil.writeLogRaw("Current: ",T01TA14_A707PrdFacCon[0]);
            }
            if ( DecimalUtil.compareTo(Z705PrdExiCC, T01TA14_A705PrdExiCC[0]) != 0 )
            {
               GXutil.writeLogln("salidaproductomanual_detail:[seudo value changed for attri]"+"PrdExiCC");
               GXutil.writeLogRaw("Old: ",Z705PrdExiCC);
               GXutil.writeLogRaw("Current: ",T01TA14_A705PrdExiCC[0]);
            }
            if ( DecimalUtil.compareTo(Z685PrdCanRes, T01TA14_A685PrdCanRes[0]) != 0 )
            {
               GXutil.writeLogln("salidaproductomanual_detail:[seudo value changed for attri]"+"PrdCanRes");
               GXutil.writeLogRaw("Old: ",Z685PrdCanRes);
               GXutil.writeLogRaw("Current: ",T01TA14_A685PrdCanRes[0]);
            }
            if ( DecimalUtil.compareTo(Z724PrdPreAct, T01TA14_A724PrdPreAct[0]) != 0 )
            {
               GXutil.writeLogln("salidaproductomanual_detail:[seudo value changed for attri]"+"PrdPreAct");
               GXutil.writeLogRaw("Old: ",Z724PrdPreAct);
               GXutil.writeLogRaw("Current: ",T01TA14_A724PrdPreAct[0]);
            }
            if ( DecimalUtil.compareTo(Z726PrdPreMed, T01TA14_A726PrdPreMed[0]) != 0 )
            {
               GXutil.writeLogln("salidaproductomanual_detail:[seudo value changed for attri]"+"PrdPreMed");
               GXutil.writeLogRaw("Old: ",Z726PrdPreMed);
               GXutil.writeLogRaw("Current: ",T01TA14_A726PrdPreMed[0]);
            }
            if ( GXutil.strcmp(Z10881PrdLote, T01TA14_A10881PrdLote[0]) != 0 )
            {
               GXutil.writeLogln("salidaproductomanual_detail:[seudo value changed for attri]"+"PrdLote");
               GXutil.writeLogRaw("Old: ",Z10881PrdLote);
               GXutil.writeLogRaw("Current: ",T01TA14_A10881PrdLote[0]);
            }
            if ( Z856ValCod != T01TA14_A856ValCod[0] )
            {
               GXutil.writeLogln("salidaproductomanual_detail:[seudo value changed for attri]"+"ValCod");
               GXutil.writeLogRaw("Old: ",Z856ValCod);
               GXutil.writeLogRaw("Current: ",T01TA14_A856ValCod[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPPRODUC"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1TA112( )
   {
      beforeValidate1TA112( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1TA112( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1TA112( 0) ;
         checkOptimisticConcurrency1TA112( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1TA112( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1TA112( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01TA15 */
                  pr_default.execute(13, new Object[] {A861CumConCbis, A860CumConCant, Byte.valueOf(A8639CumUnidad), A5862CumConLot, A12257PrdComID, Byte.valueOf(A12700CumUMed), Short.valueOf(A14039CumLotAlm), A396EmprCod, A719PrdNum, Byte.valueOf(A490ForPrdUMe), Integer.valueOf(A859CumCodCont)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLCUMCO");
                  if ( (pr_default.getStatus(13) == 1) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
                     AnyError = (short)(1) ;
                  }
                  if ( AnyError == 0 )
                  {
                     updateTablesN11TA112( ) ;
                     /* Start of After( Insert) rules */
                     if ( ( DecimalUtil.compareTo(A860CumConCant, AV16CumConOld) != 0 ) && ( true /* After */ || true /* After */ ) && ( AV15FlagPreMed == 0 ) )
                     {
                        new app.pentpr2(remoteHandle, context).execute( A396EmprCod, A719PrdNum, AV26Year, AV25Mes, A861CumConCbis, AV16CumConOld, A724PrdPreAct, A862CumConFec) ;
                     }
                     if ( ( DecimalUtil.compareTo(A860CumConCant, AV16CumConOld) != 0 ) && ( true /* After */ || true /* After */ ) && ( AV15FlagPreMed == 0 ) )
                     {
                        new app.pnewcc8(remoteHandle, context).execute( A396EmprCod, A719PrdNum, DecimalUtil.doubleToDec(0), A861CumConCbis, httpContext.getMessage( "SM", ""), "1", A724PrdPreAct, 0, (byte)(0), " ", A859CumCodCont, " ", AV17UsurCod, httpContext.getMessage( "Consumo Manual Almacen,WEB", ""), (short)(0), AV16CumConOld, DecimalUtil.doubleToDec(0), A862CumConFec, A10777CumCCos, A5862CumConLot) ;
                     }
                     if ( ( DecimalUtil.compareTo(A860CumConCant, AV16CumConOld) != 0 ) && ( true /* After */ || true /* After */ ) && ( AV15FlagPreMed == 1 ) )
                     {
                        new app.pentpr2(remoteHandle, context).execute( A396EmprCod, A719PrdNum, AV26Year, AV25Mes, A861CumConCbis, AV16CumConOld, A726PrdPreMed, A862CumConFec) ;
                     }
                     if ( ( DecimalUtil.compareTo(A860CumConCant, AV16CumConOld) != 0 ) && ( true /* After */ && true /* After */ ) && ( AV15FlagPreMed == 1 ) )
                     {
                        new app.pnewcc8(remoteHandle, context).execute( A396EmprCod, A719PrdNum, DecimalUtil.doubleToDec(0), A861CumConCbis, httpContext.getMessage( "SM", ""), "1", A726PrdPreMed, 0, (byte)(0), " ", A859CumCodCont, " ", AV17UsurCod, httpContext.getMessage( "Consumo Manual Almacen,WEB", ""), (short)(0), AV16CumConOld, DecimalUtil.doubleToDec(0), A862CumConFec, A10777CumCCos, A5862CumConLot) ;
                     }
                     /* End of After( Insert) rules */
                     if ( AnyError == 0 )
                     {
                        /* Save values for previous() function. */
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                        endTrnMsgCod = "SuccessfullyAdded" ;
                        resetCaption1TA0( ) ;
                     }
                  }
               }
               else
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_unexp"), 1, "");
                  AnyError = (short)(1) ;
               }
            }
         }
         else
         {
            load1TA112( ) ;
         }
         endLevel1TA112( ) ;
      }
      closeExtendedTableCursors1TA112( ) ;
   }

   public void update1TA112( )
   {
      beforeValidate1TA112( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1TA112( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1TA112( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1TA112( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1TA112( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01TA16 */
                  pr_default.execute(14, new Object[] {A861CumConCbis, A860CumConCant, Byte.valueOf(A8639CumUnidad), A5862CumConLot, A12257PrdComID, Byte.valueOf(A12700CumUMed), Short.valueOf(A14039CumLotAlm), Byte.valueOf(A490ForPrdUMe), A396EmprCod, Integer.valueOf(A859CumCodCont), A719PrdNum});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLCUMCO");
                  if ( (pr_default.getStatus(14) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPLCUMCO"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1TA112( ) ;
                  if ( AnyError == 0 )
                  {
                     updateTablesN11TA112( ) ;
                     /* Start of After( update) rules */
                     if ( ( DecimalUtil.compareTo(A860CumConCant, AV16CumConOld) != 0 ) && ( true /* After */ || true /* After */ ) && ( AV15FlagPreMed == 0 ) )
                     {
                        new app.pentpr2(remoteHandle, context).execute( A396EmprCod, A719PrdNum, AV26Year, AV25Mes, A861CumConCbis, AV16CumConOld, A724PrdPreAct, A862CumConFec) ;
                     }
                     if ( ( DecimalUtil.compareTo(A860CumConCant, AV16CumConOld) != 0 ) && ( true /* After */ || true /* After */ ) && ( AV15FlagPreMed == 0 ) )
                     {
                        new app.pnewcc8(remoteHandle, context).execute( A396EmprCod, A719PrdNum, DecimalUtil.doubleToDec(0), A861CumConCbis, httpContext.getMessage( "SM", ""), "1", A724PrdPreAct, 0, (byte)(0), " ", A859CumCodCont, " ", AV17UsurCod, httpContext.getMessage( "Consumo Manual Almacen,WEB", ""), (short)(0), AV16CumConOld, DecimalUtil.doubleToDec(0), A862CumConFec, A10777CumCCos, A5862CumConLot) ;
                     }
                     if ( ( DecimalUtil.compareTo(A860CumConCant, AV16CumConOld) != 0 ) && ( true /* After */ || true /* After */ ) && ( AV15FlagPreMed == 1 ) )
                     {
                        new app.pentpr2(remoteHandle, context).execute( A396EmprCod, A719PrdNum, AV26Year, AV25Mes, A861CumConCbis, AV16CumConOld, A726PrdPreMed, A862CumConFec) ;
                     }
                     if ( ( DecimalUtil.compareTo(A860CumConCant, AV16CumConOld) != 0 ) && ( true /* After */ && true /* After */ ) && ( AV15FlagPreMed == 1 ) )
                     {
                        new app.pnewcc8(remoteHandle, context).execute( A396EmprCod, A719PrdNum, DecimalUtil.doubleToDec(0), A861CumConCbis, httpContext.getMessage( "SM", ""), "1", A726PrdPreMed, 0, (byte)(0), " ", A859CumCodCont, " ", AV17UsurCod, httpContext.getMessage( "Consumo Manual Almacen,WEB", ""), (short)(0), AV16CumConOld, DecimalUtil.doubleToDec(0), A862CumConFec, A10777CumCCos, A5862CumConLot) ;
                     }
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        if ( isUpd( ) || isDlt( ) )
                        {
                           if ( AnyError == 0 )
                           {
                              httpContext.nUserReturn = (byte)(1) ;
                           }
                        }
                     }
                  }
                  else
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_unexp"), 1, "");
                     AnyError = (short)(1) ;
                  }
               }
            }
         }
         endLevel1TA112( ) ;
      }
      closeExtendedTableCursors1TA112( ) ;
   }

   public void deferredUpdate1TA112( )
   {
   }

   public void delete( )
   {
      beforeValidate1TA112( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1TA112( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1TA112( ) ;
         afterConfirm1TA112( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1TA112( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01TA17 */
               pr_default.execute(15, new Object[] {A396EmprCod, Integer.valueOf(A859CumCodCont), A719PrdNum});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLCUMCO");
               if ( AnyError == 0 )
               {
                  updateTablesN11TA112( ) ;
                  /* Start of After( delete) rules */
                  if ( true /* After */ && true /* Level */ )
                  {
                     new app.peliccsag(remoteHandle, context).execute( A396EmprCod, A719PrdNum, A859CumCodCont) ;
                  }
                  if ( true /* After */ && true /* Level */ && ( AV15FlagPreMed == 0 ) )
                  {
                     new app.pacesp2(remoteHandle, context).execute( A396EmprCod, A719PrdNum, A862CumConFec, A861CumConCbis, A724PrdPreAct) ;
                  }
                  if ( true /* After */ && true /* Level */ && ( AV15FlagPreMed == 1 ) )
                  {
                     new app.pacesp2(remoteHandle, context).execute( A396EmprCod, A719PrdNum, A862CumConFec, A861CumConCbis, A726PrdPreMed) ;
                  }
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     if ( isUpd( ) || isDlt( ) )
                     {
                        if ( AnyError == 0 )
                        {
                           httpContext.nUserReturn = (byte)(1) ;
                        }
                     }
                  }
               }
               else
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_unexp"), 1, "");
                  AnyError = (short)(1) ;
               }
            }
         }
      }
      sMode112 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1TA112( ) ;
      Gx_mode = sMode112 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1TA112( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T01TA18 */
         pr_default.execute(16, new Object[] {A396EmprCod, A719PrdNum});
         Z718PrdNom = T01TA18_A718PrdNom[0] ;
         Z707PrdFacCon = T01TA18_A707PrdFacCon[0] ;
         Z705PrdExiCC = T01TA18_A705PrdExiCC[0] ;
         Z685PrdCanRes = T01TA18_A685PrdCanRes[0] ;
         Z724PrdPreAct = T01TA18_A724PrdPreAct[0] ;
         Z726PrdPreMed = T01TA18_A726PrdPreMed[0] ;
         Z10881PrdLote = T01TA18_A10881PrdLote[0] ;
         Z856ValCod = T01TA18_A856ValCod[0] ;
         A704PrdExiAlm = T01TA18_A704PrdExiAlm[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A704PrdExiAlm", GXutil.ltrimstr( A704PrdExiAlm, 12, 4));
         A750PrdValStk = T01TA18_A750PrdValStk[0] ;
         A718PrdNom = T01TA18_A718PrdNom[0] ;
         A707PrdFacCon = T01TA18_A707PrdFacCon[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A707PrdFacCon", GXutil.ltrimstr( A707PrdFacCon, 7, 4));
         A705PrdExiCC = T01TA18_A705PrdExiCC[0] ;
         A685PrdCanRes = T01TA18_A685PrdCanRes[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A685PrdCanRes", GXutil.ltrimstr( A685PrdCanRes, 12, 4));
         A724PrdPreAct = T01TA18_A724PrdPreAct[0] ;
         A726PrdPreMed = T01TA18_A726PrdPreMed[0] ;
         A10881PrdLote = T01TA18_A10881PrdLote[0] ;
         A856ValCod = T01TA18_A856ValCod[0] ;
         O750PrdValStk = A750PrdValStk ;
         httpContext.ajax_rsp_assign_attri("", false, "A750PrdValStk", GXutil.ltrimstr( A750PrdValStk, 11, 2));
         O704PrdExiAlm = A704PrdExiAlm ;
         httpContext.ajax_rsp_assign_attri("", false, "A704PrdExiAlm", GXutil.ltrimstr( A704PrdExiAlm, 12, 4));
         pr_default.close(16);
         if ( isDlt( )  )
         {
            A704PrdExiAlm = O704PrdExiAlm.add(O861CumConCbis) ;
            httpContext.ajax_rsp_assign_attri("", false, "A704PrdExiAlm", GXutil.ltrimstr( A704PrdExiAlm, 12, 4));
         }
         else
         {
            if ( isIns( )  || isUpd( )  || isDlt( )  )
            {
               A704PrdExiAlm = O704PrdExiAlm.subtract(A861CumConCbis).add(O861CumConCbis) ;
               httpContext.ajax_rsp_assign_attri("", false, "A704PrdExiAlm", GXutil.ltrimstr( A704PrdExiAlm, 12, 4));
            }
         }
         if ( A8639CumUnidad == 0 )
         {
            AV16CumConOld = (O860CumConCant.divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN)).multiply(A707PrdFacCon) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV16CumConOld", GXutil.ltrimstr( AV16CumConOld, 12, 4));
         }
         else
         {
            if ( A8639CumUnidad == 1 )
            {
               AV16CumConOld = O860CumConCant.multiply(A707PrdFacCon) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV16CumConOld", GXutil.ltrimstr( AV16CumConOld, 12, 4));
            }
         }
         if ( A3915EmpNumDec == 0 )
         {
            A863CumCosPro = GXutil.roundDecimal( A861CumConCbis.multiply(A724PrdPreAct), 0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A863CumCosPro", GXutil.ltrimstr( A863CumCosPro, 10, 2));
         }
         else
         {
            if ( A3915EmpNumDec == 2 )
            {
               A863CumCosPro = GXutil.roundDecimal( A861CumConCbis.multiply(A724PrdPreAct), 2) ;
               httpContext.ajax_rsp_assign_attri("", false, "A863CumCosPro", GXutil.ltrimstr( A863CumCosPro, 10, 2));
            }
            else
            {
               A863CumCosPro = DecimalUtil.doubleToDec(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A863CumCosPro", GXutil.ltrimstr( A863CumCosPro, 10, 2));
            }
         }
         /* Using cursor T01TA19 */
         pr_default.execute(17, new Object[] {A396EmprCod, Byte.valueOf(A490ForPrdUMe)});
         A488ForPrdDsc = T01TA19_A488ForPrdDsc[0] ;
         n488ForPrdDsc = T01TA19_n488ForPrdDsc[0] ;
         pr_default.close(17);
         GXt_date13 = A3835UltFecCCs ;
         GXv_char4[0] = A396EmprCod ;
         GXv_char3[0] = A719PrdNum ;
         GXv_date14[0] = GXt_date13 ;
         new app.pstm005(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_date14) ;
         salidaproductomanual_detail_impl.this.A396EmprCod = GXv_char4[0] ;
         salidaproductomanual_detail_impl.this.A719PrdNum = GXv_char3[0] ;
         salidaproductomanual_detail_impl.this.GXt_date13 = GXv_date14[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         A3835UltFecCCs = GXt_date13 ;
         httpContext.ajax_rsp_assign_attri("", false, "A3835UltFecCCs", localUtil.format(A3835UltFecCCs, "99/99/99"));
      }
   }

   public void updateTablesN11TA112( )
   {
      /* Using cursor T01TA20 */
      pr_default.execute(18, new Object[] {A704PrdExiAlm, A750PrdValStk, A396EmprCod, A719PrdNum});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPRODUC");
   }

   public void endLevel1TA112( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      pr_default.close(12);
      if ( AnyError == 0 )
      {
         beforeComplete1TA112( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "salidaproductomanual_detail");
         if ( AnyError == 0 )
         {
            confirmValues1TA0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "salidaproductomanual_detail");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1TA112( )
   {
      /* Scan By routine */
      /* Using cursor T01TA21 */
      pr_default.execute(19, new Object[] {A396EmprCod});
      RcdFound112 = (short)(0) ;
      if ( (pr_default.getStatus(19) != 101) )
      {
         RcdFound112 = (short)(1) ;
         A859CumCodCont = T01TA21_A859CumCodCont[0] ;
         A719PrdNum = T01TA21_A719PrdNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1TA112( )
   {
      /* Scan next routine */
      pr_default.readNext(19);
      RcdFound112 = (short)(0) ;
      if ( (pr_default.getStatus(19) != 101) )
      {
         RcdFound112 = (short)(1) ;
         A859CumCodCont = T01TA21_A859CumCodCont[0] ;
         A719PrdNum = T01TA21_A719PrdNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
      }
   }

   public void scanEnd1TA112( )
   {
      pr_default.close(19);
   }

   public void afterConfirm1TA112( )
   {
      /* After Confirm Rules */
      AV27CumConCbis = A861CumConCbis ;
      httpContext.ajax_rsp_assign_attri("", false, "AV27CumConCbis", GXutil.ltrimstr( AV27CumConCbis, 12, 4));
   }

   public void beforeInsert1TA112( )
   {
      /* Before Insert Rules */
      if ( ( AV22Moda21 == 1 ) && ! (GXutil.strcmp("", A5862CumConLot)==0) )
      {
         GXv_char4[0] = AV28Ok ;
         new app.plotectrl(remoteHandle, context).execute( A396EmprCod, A719PrdNum, A5862CumConLot, GXv_char4) ;
         salidaproductomanual_detail_impl.this.AV28Ok = GXv_char4[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV28Ok", AV28Ok);
      }
      if ( ( AV22Moda21 == 1 ) && ( GXutil.strcmp(AV28Ok, "N") == 0 ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Nao Existe LOTE ¡¡¡", ""), 1, "");
         AnyError = (short)(1) ;
      }
   }

   public void beforeUpdate1TA112( )
   {
      /* Before Update Rules */
      if ( ( AV22Moda21 == 1 ) && ! (GXutil.strcmp("", A5862CumConLot)==0) )
      {
         GXv_char4[0] = AV28Ok ;
         new app.plotectrl(remoteHandle, context).execute( A396EmprCod, A719PrdNum, A5862CumConLot, GXv_char4) ;
         salidaproductomanual_detail_impl.this.AV28Ok = GXv_char4[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV28Ok", AV28Ok);
      }
      if ( ( AV22Moda21 == 1 ) && ( GXutil.strcmp(AV28Ok, "N") == 0 ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Nao Existe LOTE ¡¡¡", ""), 1, "");
         AnyError = (short)(1) ;
      }
   }

   public void beforeDelete1TA112( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1TA112( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1TA112( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1TA112( )
   {
      edtPrdNum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNum_Enabled), 5, 0), true);
      edtCumConCant_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCumConCant_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCumConCant_Enabled), 5, 0), true);
      cmbCumUnidad.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbCumUnidad.getInternalname(), "Enabled", GXutil.ltrimstr( cmbCumUnidad.getEnabled(), 5, 0), true);
      edtCumConLot_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCumConLot_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCumConLot_Enabled), 5, 0), true);
      edtCumConCbis_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCumConCbis_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCumConCbis_Enabled), 5, 0), true);
      edtPrdFacCon_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdFacCon_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdFacCon_Enabled), 5, 0), true);
      edtPrdExiAlm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdExiAlm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdExiAlm_Enabled), 5, 0), true);
      edtPrdCanRes_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdCanRes_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdCanRes_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      edtavComboprdnum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavComboprdnum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavComboprdnum_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashes1TA112( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues1TA0( )
   {
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
      MasterPageObj.master_styles();
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.writeText( Form.getHeaderrawhtml()) ;
      httpContext.closeHtmlHeader();
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.disableOutput();
      }
      FormProcess = " data-HasEnter=\"true\" data-Skiponenter=\"false\"" ;
      httpContext.writeText( "<body ") ;
      bodyStyle = "" + "background-color:" + WebUtils.getHTMLColor( Form.getIBackground()) + ";color:" + WebUtils.getHTMLColor( Form.getTextcolor()) + ";" ;
      bodyStyle += "-moz-opacity:0;opacity:0;" ;
      if ( ! ( (GXutil.strcmp("", Form.getBackground())==0) ) )
      {
         bodyStyle += " background-image:url(" + httpContext.convertURL( Form.getBackground()) + ")" ;
      }
      httpContext.writeText( " "+"class=\"form-horizontal Form\""+" "+ "style='"+bodyStyle+"'") ;
      httpContext.writeText( FormProcess+">") ;
      httpContext.skipLines( 1 );
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.salidaproductomanual_detail", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV7EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV8CumCodCont,8,0)),GXutil.URLEncode(GXutil.rtrim(AV9PrdNum))}, new String[] {"Gx_mode","EmprCod","CumCodCont","PrdNum"}) +"\">") ;
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
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"SalidaProductoManual_detail");
      forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV33Pgmname, "")));
      forbiddenHiddens.add("PrdComID", GXutil.rtrim( localUtil.format( A12257PrdComID, "")));
      forbiddenHiddens.add("CumUMed", localUtil.format( DecimalUtil.doubleToDec(A12700CumUMed), "9"));
      forbiddenHiddens.add("CumLotAlm", localUtil.format( DecimalUtil.doubleToDec(A14039CumLotAlm), "ZZZ9"));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("salidaproductomanual_detail:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z859CumCodCont", GXutil.ltrim( localUtil.ntoc( Z859CumCodCont, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z719PrdNum", GXutil.rtrim( Z719PrdNum));
      app.GxWebStd.gx_hidden_field( httpContext, "Z861CumConCbis", GXutil.ltrim( localUtil.ntoc( Z861CumConCbis, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z860CumConCant", GXutil.ltrim( localUtil.ntoc( Z860CumConCant, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8639CumUnidad", GXutil.ltrim( localUtil.ntoc( Z8639CumUnidad, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5862CumConLot", GXutil.rtrim( Z5862CumConLot));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12257PrdComID", GXutil.rtrim( Z12257PrdComID));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12700CumUMed", GXutil.ltrim( localUtil.ntoc( Z12700CumUMed, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14039CumLotAlm", GXutil.ltrim( localUtil.ntoc( Z14039CumLotAlm, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z490ForPrdUMe", GXutil.ltrim( localUtil.ntoc( Z490ForPrdUMe, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z718PrdNom", GXutil.rtrim( Z718PrdNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z707PrdFacCon", GXutil.ltrim( localUtil.ntoc( Z707PrdFacCon, (byte)(7), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z705PrdExiCC", GXutil.ltrim( localUtil.ntoc( Z705PrdExiCC, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z685PrdCanRes", GXutil.ltrim( localUtil.ntoc( Z685PrdCanRes, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z724PrdPreAct", GXutil.ltrim( localUtil.ntoc( Z724PrdPreAct, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z726PrdPreMed", GXutil.ltrim( localUtil.ntoc( Z726PrdPreMed, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10881PrdLote", GXutil.rtrim( Z10881PrdLote));
      app.GxWebStd.gx_hidden_field( httpContext, "Z856ValCod", GXutil.ltrim( localUtil.ntoc( Z856ValCod, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O750PrdValStk", GXutil.ltrim( localUtil.ntoc( O750PrdValStk, (byte)(11), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O861CumConCbis", GXutil.ltrim( localUtil.ntoc( O861CumConCbis, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O704PrdExiAlm", GXutil.ltrim( localUtil.ntoc( O704PrdExiAlm, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O860CumConCant", GXutil.ltrim( localUtil.ntoc( O860CumConCant, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_Mode", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "N490ForPrdUMe", GXutil.ltrim( localUtil.ntoc( A490ForPrdUMe, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vPRDNUM_DATA", AV29PrdNum_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vPRDNUM_DATA", AV29PrdNum_Data);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "CC_ALMCD", GXutil.ltrim( localUtil.ntoc( A8925CC_AlmCd, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CC_ALMDC", GXutil.rtrim( A8926CC_AlmDc));
      app.GxWebStd.gx_hidden_field( httpContext, "ULTFECCCS", localUtil.dtoc( A3835UltFecCCs, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDPREACT", GXutil.ltrim( localUtil.ntoc( A724PrdPreAct, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPNUMDEC", GXutil.ltrim( localUtil.ntoc( A3915EmpNumDec, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CUMCOSPRO", GXutil.ltrim( localUtil.ntoc( A863CumCosPro, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CUMCCOS", GXutil.ltrim( localUtil.ntoc( A10777CumCCos, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CUMCCOSD", GXutil.rtrim( A10778CumCCosD));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV7EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV7EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vCUMCODCONT", GXutil.ltrim( localUtil.ntoc( AV8CumCodCont, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCUMCODCONT", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV8CumCodCont), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "CUMCODCONT", GXutil.ltrim( localUtil.ntoc( A859CumCodCont, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vPRDNUM", GXutil.rtrim( AV9PrdNum));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPRDNUM", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV9PrdNum, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vINSERT_FORPRDUME", GXutil.ltrim( localUtil.ntoc( AV13Insert_ForPrdUMe, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FORPRDUME", GXutil.ltrim( localUtil.ntoc( A490ForPrdUMe, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vCUMCONOLD", GXutil.ltrim( localUtil.ntoc( AV16CumConOld, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CUMCONFEC", localUtil.dtoc( A862CumConFec, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "vMES", GXutil.ltrim( localUtil.ntoc( AV25Mes, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vYEAR", GXutil.ltrim( localUtil.ntoc( AV26Year, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vCUMCONCBIS", GXutil.ltrim( localUtil.ntoc( AV27CumConCbis, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDVALSTK", GXutil.ltrim( localUtil.ntoc( A750PrdValStk, (byte)(11), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDPREMED", GXutil.ltrim( localUtil.ntoc( A726PrdPreMed, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vFLAGPREMED", GXutil.ltrim( localUtil.ntoc( AV15FlagPreMed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vPRECIO_STK", GXutil.ltrim( localUtil.ntoc( AV24Precio_stk, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vCONMAN", GXutil.ltrim( localUtil.ntoc( AV20ConMan, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGXBSCREEN", GXutil.ltrim( localUtil.ntoc( Gx_BScreen, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDLOTE", GXutil.rtrim( A10881PrdLote));
      app.GxWebStd.gx_hidden_field( httpContext, "vUSURCOD", GXutil.rtrim( AV17UsurCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vMODA21", GXutil.ltrim( localUtil.ntoc( AV22Moda21, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vOK", GXutil.rtrim( AV28Ok));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDCOMID", GXutil.rtrim( A12257PrdComID));
      app.GxWebStd.gx_hidden_field( httpContext, "CUMUMED", GXutil.ltrim( localUtil.ntoc( A12700CumUMed, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CUMLOTALM", GXutil.ltrim( localUtil.ntoc( A14039CumLotAlm, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRNOM", GXutil.rtrim( A407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDNOM", GXutil.rtrim( A718PrdNom));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDEXICC", GXutil.ltrim( localUtil.ntoc( A705PrdExiCC, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "VALCOD", GXutil.ltrim( localUtil.ntoc( A856ValCod, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FORPRDDSC", GXutil.rtrim( A488ForPrdDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "CUMCONTIPO", GXutil.ltrim( localUtil.ntoc( A11368CumConTipo, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CCOCOD", GXutil.ltrim( localUtil.ntoc( A3839CcoCod, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PRDNUM_Objectcall", GXutil.rtrim( Combo_prdnum_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PRDNUM_Cls", GXutil.rtrim( Combo_prdnum_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PRDNUM_Selectedvalue_set", GXutil.rtrim( Combo_prdnum_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PRDNUM_Enabled", GXutil.booltostr( Combo_prdnum_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PRDNUM_Emptyitem", GXutil.booltostr( Combo_prdnum_Emptyitem));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEATTRIBUTES_Objectcall", GXutil.rtrim( Dvpanel_tableattributes_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEATTRIBUTES_Enabled", GXutil.booltostr( Dvpanel_tableattributes_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEATTRIBUTES_Width", GXutil.rtrim( Dvpanel_tableattributes_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEATTRIBUTES_Autowidth", GXutil.booltostr( Dvpanel_tableattributes_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEATTRIBUTES_Autoheight", GXutil.booltostr( Dvpanel_tableattributes_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEATTRIBUTES_Cls", GXutil.rtrim( Dvpanel_tableattributes_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEATTRIBUTES_Title", GXutil.rtrim( Dvpanel_tableattributes_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEATTRIBUTES_Collapsible", GXutil.booltostr( Dvpanel_tableattributes_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEATTRIBUTES_Collapsed", GXutil.booltostr( Dvpanel_tableattributes_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEATTRIBUTES_Showcollapseicon", GXutil.booltostr( Dvpanel_tableattributes_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEATTRIBUTES_Iconposition", GXutil.rtrim( Dvpanel_tableattributes_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEATTRIBUTES_Autoscroll", GXutil.booltostr( Dvpanel_tableattributes_Autoscroll));
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
      if ( ! ( WebComp_Webcomponent1 == null ) )
      {
         WebComp_Webcomponent1.componentjscripts();
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
   }

   public byte executeStartEvent( )
   {
      standaloneStartup( ) ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         if ( 1 != 0 )
         {
            if ( GXutil.len( WebComp_Webcomponent1_Component) != 0 )
            {
               WebComp_Webcomponent1.componentstart();
            }
         }
      }
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         if ( 1 != 0 )
         {
            if ( GXutil.len( WebComp_Webcomponent1_Component) != 0 )
            {
               WebComp_Webcomponent1.componentstart();
            }
         }
      }
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      return gxajaxcallmode ;
   }

   public void renderHtmlContent( )
   {
      httpContext.writeText( "<div") ;
      app.GxWebStd.classAttribute( httpContext, "gx-ct-body"+" "+((GXutil.strcmp("", Form.getThemeClass())==0) ? "form-horizontal Form" : Form.getThemeClass())+"-fx");
      httpContext.writeText( ">") ;
      draw( ) ;
      httpContext.writeText( "</div>") ;
   }

   public void dispatchEvents( )
   {
      process( ) ;
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
      return formatLink("app.salidaproductomanual_detail", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV7EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV8CumCodCont,8,0)),GXutil.URLEncode(GXutil.rtrim(AV9PrdNum))}, new String[] {"Gx_mode","EmprCod","CumCodCont","PrdNum"})  ;
   }

   public String getPgmname( )
   {
      return "SalidaProductoManual_detail" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Salida Producto Manual Lineas", "") ;
   }

   public void initializeNonKey1TA112( )
   {
      A490ForPrdUMe = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A490ForPrdUMe", GXutil.str( A490ForPrdUMe, 1, 0));
      A861CumConCbis = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A861CumConCbis", GXutil.ltrimstr( A861CumConCbis, 12, 4));
      AV16CumConOld = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16CumConOld", GXutil.ltrimstr( AV16CumConOld, 12, 4));
      A704PrdExiAlm = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A704PrdExiAlm", GXutil.ltrimstr( A704PrdExiAlm, 12, 4));
      AV27CumConCbis = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV27CumConCbis", GXutil.ltrimstr( AV27CumConCbis, 12, 4));
      A750PrdValStk = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A750PrdValStk", GXutil.ltrimstr( A750PrdValStk, 11, 2));
      AV28Ok = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV28Ok", AV28Ok);
      A863CumCosPro = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A863CumCosPro", GXutil.ltrimstr( A863CumCosPro, 10, 2));
      A3835UltFecCCs = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "A3835UltFecCCs", localUtil.format(A3835UltFecCCs, "99/99/99"));
      A718PrdNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A718PrdNom", A718PrdNom);
      A707PrdFacCon = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A707PrdFacCon", GXutil.ltrimstr( A707PrdFacCon, 7, 4));
      A705PrdExiCC = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A705PrdExiCC", GXutil.ltrimstr( A705PrdExiCC, 12, 4));
      A685PrdCanRes = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A685PrdCanRes", GXutil.ltrimstr( A685PrdCanRes, 12, 4));
      A860CumConCant = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A860CumConCant", GXutil.ltrimstr( A860CumConCant, 12, 4));
      A724PrdPreAct = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A724PrdPreAct", GXutil.ltrimstr( A724PrdPreAct, 14, 5));
      A726PrdPreMed = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A726PrdPreMed", GXutil.ltrimstr( A726PrdPreMed, 14, 5));
      A488ForPrdDsc = "" ;
      n488ForPrdDsc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A488ForPrdDsc", A488ForPrdDsc);
      A12257PrdComID = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A12257PrdComID", A12257PrdComID);
      A10881PrdLote = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A10881PrdLote", A10881PrdLote);
      A12700CumUMed = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A12700CumUMed", GXutil.str( A12700CumUMed, 1, 0));
      A14039CumLotAlm = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A14039CumLotAlm", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14039CumLotAlm), 4, 0));
      A856ValCod = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A856ValCod", GXutil.str( A856ValCod, 1, 0));
      A8639CumUnidad = (byte)(AV20ConMan) ;
      httpContext.ajax_rsp_assign_attri("", false, "A8639CumUnidad", GXutil.str( A8639CumUnidad, 1, 0));
      A5862CumConLot = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A5862CumConLot", A5862CumConLot);
      O750PrdValStk = A750PrdValStk ;
      httpContext.ajax_rsp_assign_attri("", false, "A750PrdValStk", GXutil.ltrimstr( A750PrdValStk, 11, 2));
      O861CumConCbis = A861CumConCbis ;
      httpContext.ajax_rsp_assign_attri("", false, "A861CumConCbis", GXutil.ltrimstr( A861CumConCbis, 12, 4));
      O704PrdExiAlm = A704PrdExiAlm ;
      httpContext.ajax_rsp_assign_attri("", false, "A704PrdExiAlm", GXutil.ltrimstr( A704PrdExiAlm, 12, 4));
      O860CumConCant = A860CumConCant ;
      httpContext.ajax_rsp_assign_attri("", false, "A860CumConCant", GXutil.ltrimstr( A860CumConCant, 12, 4));
      Z861CumConCbis = DecimalUtil.ZERO ;
      Z860CumConCant = DecimalUtil.ZERO ;
      Z8639CumUnidad = (byte)(0) ;
      Z5862CumConLot = "" ;
      Z12257PrdComID = "" ;
      Z12700CumUMed = (byte)(0) ;
      Z14039CumLotAlm = (short)(0) ;
      Z490ForPrdUMe = (byte)(0) ;
      Z718PrdNom = "" ;
      Z707PrdFacCon = DecimalUtil.ZERO ;
      Z705PrdExiCC = DecimalUtil.ZERO ;
      Z685PrdCanRes = DecimalUtil.ZERO ;
      Z724PrdPreAct = DecimalUtil.ZERO ;
      Z726PrdPreMed = DecimalUtil.ZERO ;
      Z10881PrdLote = "" ;
      Z856ValCod = (byte)(0) ;
   }

   public void initAll1TA112( )
   {
      A859CumCodCont = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A859CumCodCont", GXutil.ltrimstr( DecimalUtil.doubleToDec(A859CumCodCont), 8, 0));
      A719PrdNum = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
      initializeNonKey1TA112( ) ;
   }

   public void standaloneModalInsert( )
   {
      A8639CumUnidad = i8639CumUnidad ;
      httpContext.ajax_rsp_assign_attri("", false, "A8639CumUnidad", GXutil.str( A8639CumUnidad, 1, 0));
   }

   public void define_styles( )
   {
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?"+httpContext.getCacheInvalidationToken( ));
      if ( ! ( WebComp_Webcomponent1 == null ) )
      {
         if ( GXutil.len( WebComp_Webcomponent1_Component) != 0 )
         {
            WebComp_Webcomponent1.componentthemes();
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268211695726", true, true);
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
      httpContext.AddJavascriptSource("salidaproductomanual_detail.js", "?20268211695727", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      lblTextblockprdnum_Internalname = "TEXTBLOCKPRDNUM" ;
      Combo_prdnum_Internalname = "COMBO_PRDNUM" ;
      edtPrdNum_Internalname = "PRDNUM" ;
      divTablesplittedprdnum_Internalname = "TABLESPLITTEDPRDNUM" ;
      edtCumConCant_Internalname = "CUMCONCANT" ;
      cmbCumUnidad.setInternalname( "CUMUNIDAD" );
      edtCumConLot_Internalname = "CUMCONLOT" ;
      edtCumConCbis_Internalname = "CUMCONCBIS" ;
      divUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
      edtPrdFacCon_Internalname = "PRDFACCON" ;
      edtPrdExiAlm_Internalname = "PRDEXIALM" ;
      edtPrdCanRes_Internalname = "PRDCANRES" ;
      divUnnamedtable3_Internalname = "UNNAMEDTABLE3" ;
      divTableattributes_Internalname = "TABLEATTRIBUTES" ;
      Dvpanel_tableattributes_Internalname = "DVPANEL_TABLEATTRIBUTES" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      bttBtntrn_enter_Internalname = "BTNTRN_ENTER" ;
      bttBtntrn_cancel_Internalname = "BTNTRN_CANCEL" ;
      bttBtntrn_delete_Internalname = "BTNTRN_DELETE" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      edtavComboprdnum_Internalname = "vCOMBOPRDNUM" ;
      divSectionattribute_prdnum_Internalname = "SECTIONATTRIBUTE_PRDNUM" ;
      divHtml_bottomauxiliarcontrols_Internalname = "HTML_BOTTOMAUXILIARCONTROLS" ;
      divLayoutmaintable_Internalname = "LAYOUTMAINTABLE" ;
      Form.setInternalname( "FORM" );
      imgprompt_719_5862_Internalname = "PROMPT_719_5862" ;
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
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "Salida Producto Manual Lineas", "") );
      edtavComboprdnum_Jsonclick = "" ;
      edtavComboprdnum_Enabled = 0 ;
      edtavComboprdnum_Visible = 1 ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      bttBtntrn_delete_Enabled = 0 ;
      bttBtntrn_delete_Visible = 1 ;
      bttBtntrn_cancel_Visible = 1 ;
      bttBtntrn_enter_Enabled = 1 ;
      bttBtntrn_enter_Visible = 1 ;
      edtPrdCanRes_Jsonclick = "" ;
      edtPrdCanRes_Enabled = 0 ;
      edtPrdExiAlm_Jsonclick = "" ;
      edtPrdExiAlm_Enabled = 0 ;
      edtPrdFacCon_Jsonclick = "" ;
      edtPrdFacCon_Enabled = 0 ;
      edtCumConCbis_Jsonclick = "" ;
      edtCumConCbis_Enabled = 1 ;
      imgprompt_719_5862_Visible = 1 ;
      imgprompt_719_5862_Link = "" ;
      edtCumConLot_Jsonclick = "" ;
      edtCumConLot_Enabled = 1 ;
      cmbCumUnidad.setJsonclick( "" );
      cmbCumUnidad.setEnabled( 1 );
      edtCumConCant_Jsonclick = "" ;
      edtCumConCant_Enabled = 1 ;
      edtPrdNum_Jsonclick = "" ;
      edtPrdNum_Enabled = 1 ;
      edtPrdNum_Visible = 1 ;
      Combo_prdnum_Emptyitem = GXutil.toBoolean( 0) ;
      Combo_prdnum_Cls = "ExtendedCombo AttributeFL" ;
      Combo_prdnum_Enabled = GXutil.toBoolean( -1) ;
      Dvpanel_tableattributes_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_tableattributes_Iconposition = "Right" ;
      Dvpanel_tableattributes_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_tableattributes_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_tableattributes_Collapsible = GXutil.toBoolean( 0) ;
      Dvpanel_tableattributes_Title = httpContext.getMessage( "WWP_TemplateDataPanelTitle", "") ;
      Dvpanel_tableattributes_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_tableattributes_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_tableattributes_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_tableattributes_Width = "100%" ;
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
      }
   }

   public void dynload_actions( )
   {
      /* End function dynload_actions */
   }

   public void gx3asacc_almdc1TA112( String A396EmprCod ,
                                     byte A8925CC_AlmCd )
   {
      GXt_char1 = A8926CC_AlmDc ;
      GXv_char4[0] = A396EmprCod ;
      GXv_int6[0] = A8925CC_AlmCd ;
      GXv_char3[0] = GXt_char1 ;
      new app.pexialmc(remoteHandle, context).execute( GXv_char4, GXv_int6, GXv_char3) ;
      salidaproductomanual_detail_impl.this.A396EmprCod = GXv_char4[0] ;
      salidaproductomanual_detail_impl.this.A8925CC_AlmCd = GXv_int6[0] ;
      salidaproductomanual_detail_impl.this.GXt_char1 = GXv_char3[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A8925CC_AlmCd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8925CC_AlmCd), 2, 0));
      A8926CC_AlmDc = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "A8926CC_AlmDc", A8926CC_AlmDc);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A8926CC_AlmDc))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void gx4asaultfecccs1TA112( String A396EmprCod ,
                                      String A719PrdNum )
   {
      GXt_date13 = A3835UltFecCCs ;
      GXv_char4[0] = A396EmprCod ;
      GXv_char3[0] = A719PrdNum ;
      GXv_date14[0] = GXt_date13 ;
      new app.pstm005(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_date14) ;
      salidaproductomanual_detail_impl.this.A396EmprCod = GXv_char4[0] ;
      salidaproductomanual_detail_impl.this.A719PrdNum = GXv_char3[0] ;
      salidaproductomanual_detail_impl.this.GXt_date13 = GXv_date14[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
      A3835UltFecCCs = GXt_date13 ;
      httpContext.ajax_rsp_assign_attri("", false, "A3835UltFecCCs", localUtil.format(A3835UltFecCCs, "99/99/99"));
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( localUtil.format(A3835UltFecCCs, "99/99/99"))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void gx6asacumccosd1TA112( short A10777CumCCos )
   {
      GXt_char1 = A10778CumCCosD ;
      GXv_int12[0] = A10777CumCCos ;
      GXv_char4[0] = GXt_char1 ;
      new app.pccdsc(remoteHandle, context).execute( GXv_int12, GXv_char4) ;
      salidaproductomanual_detail_impl.this.A10777CumCCos = GXv_int12[0] ;
      salidaproductomanual_detail_impl.this.GXt_char1 = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A10777CumCCos", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10777CumCCos), 3, 0));
      A10778CumCCosD = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "A10778CumCCosD", A10778CumCCosD);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A10778CumCCosD))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_27_1TA112( String A396EmprCod ,
                             String A719PrdNum ,
                             java.util.Date A862CumConFec ,
                             java.math.BigDecimal A861CumConCbis ,
                             java.math.BigDecimal A726PrdPreMed ,
                             short AV15FlagPreMed )
   {
      if ( true /* After */ && true /* Level */ && ( AV15FlagPreMed == 1 ) )
      {
         new app.pacesp2(remoteHandle, context).execute( A396EmprCod, A719PrdNum, A862CumConFec, A861CumConCbis, A726PrdPreMed) ;
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_28_1TA112( String A396EmprCod ,
                             String A719PrdNum ,
                             java.util.Date A862CumConFec ,
                             java.math.BigDecimal A861CumConCbis ,
                             java.math.BigDecimal A724PrdPreAct ,
                             short AV15FlagPreMed )
   {
      if ( true /* After */ && true /* Level */ && ( AV15FlagPreMed == 0 ) )
      {
         new app.pacesp2(remoteHandle, context).execute( A396EmprCod, A719PrdNum, A862CumConFec, A861CumConCbis, A724PrdPreAct) ;
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_29_1TA112( String A396EmprCod ,
                             String A719PrdNum ,
                             short AV26Year ,
                             byte AV25Mes ,
                             java.math.BigDecimal A861CumConCbis ,
                             java.math.BigDecimal AV16CumConOld ,
                             java.math.BigDecimal A726PrdPreMed ,
                             java.util.Date A862CumConFec ,
                             java.math.BigDecimal A860CumConCant ,
                             short AV15FlagPreMed )
   {
      if ( ( DecimalUtil.compareTo(A860CumConCant, AV16CumConOld) != 0 ) && ( true /* After */ || true /* After */ ) && ( AV15FlagPreMed == 1 ) )
      {
         new app.pentpr2(remoteHandle, context).execute( A396EmprCod, A719PrdNum, AV26Year, AV25Mes, A861CumConCbis, AV16CumConOld, A726PrdPreMed, A862CumConFec) ;
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_30_1TA112( String A396EmprCod ,
                             String A719PrdNum ,
                             short AV26Year ,
                             byte AV25Mes ,
                             java.math.BigDecimal A861CumConCbis ,
                             java.math.BigDecimal AV16CumConOld ,
                             java.math.BigDecimal A724PrdPreAct ,
                             java.util.Date A862CumConFec ,
                             java.math.BigDecimal A860CumConCant ,
                             short AV15FlagPreMed )
   {
      if ( ( DecimalUtil.compareTo(A860CumConCant, AV16CumConOld) != 0 ) && ( true /* After */ || true /* After */ ) && ( AV15FlagPreMed == 0 ) )
      {
         new app.pentpr2(remoteHandle, context).execute( A396EmprCod, A719PrdNum, AV26Year, AV25Mes, A861CumConCbis, AV16CumConOld, A724PrdPreAct, A862CumConFec) ;
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_31_1TA112( )
   {
      if ( ( DecimalUtil.compareTo(A860CumConCant, AV16CumConOld) != 0 ) && ( true /* After */ && true /* After */ ) && ( AV15FlagPreMed == 1 ) )
      {
         new app.pnewcc8(remoteHandle, context).execute( A396EmprCod, A719PrdNum, DecimalUtil.doubleToDec(0), A861CumConCbis, httpContext.getMessage( "SM", ""), "1", A726PrdPreMed, 0, (byte)(0), " ", A859CumCodCont, " ", AV17UsurCod, httpContext.getMessage( "Consumo Manual Almacen,WEB", ""), (short)(0), AV16CumConOld, DecimalUtil.doubleToDec(0), A862CumConFec, A10777CumCCos, A5862CumConLot) ;
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_32_1TA112( )
   {
      if ( ( DecimalUtil.compareTo(A860CumConCant, AV16CumConOld) != 0 ) && ( true /* After */ || true /* After */ ) && ( AV15FlagPreMed == 0 ) )
      {
         new app.pnewcc8(remoteHandle, context).execute( A396EmprCod, A719PrdNum, DecimalUtil.doubleToDec(0), A861CumConCbis, httpContext.getMessage( "SM", ""), "1", A724PrdPreAct, 0, (byte)(0), " ", A859CumCodCont, " ", AV17UsurCod, httpContext.getMessage( "Consumo Manual Almacen,WEB", ""), (short)(0), AV16CumConOld, DecimalUtil.doubleToDec(0), A862CumConFec, A10777CumCCos, A5862CumConLot) ;
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_33_1TA112( String A396EmprCod ,
                             String A719PrdNum ,
                             int A859CumCodCont )
   {
      if ( true /* After */ && true /* Level */ )
      {
         new app.peliccsag(remoteHandle, context).execute( A396EmprCod, A719PrdNum, A859CumCodCont) ;
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_34_1TA112( String A396EmprCod ,
                             String A719PrdNum ,
                             String A5862CumConLot ,
                             short AV22Moda21 )
   {
      if ( ( AV22Moda21 == 1 ) && ! (GXutil.strcmp("", A5862CumConLot)==0) )
      {
         GXv_char4[0] = AV28Ok ;
         new app.plotectrl(remoteHandle, context).execute( A396EmprCod, A719PrdNum, A5862CumConLot, GXv_char4) ;
         AV28Ok = GXv_char4[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV28Ok", AV28Ok);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( AV28Ok))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void init_web_controls( )
   {
      cmbCumUnidad.setName( "CUMUNIDAD" );
      cmbCumUnidad.setWebtags( "" );
      cmbCumUnidad.addItem("1", httpContext.getMessage( "kg o lt", ""), (short)(0));
      cmbCumUnidad.addItem("0", httpContext.getMessage( "gr o cc", ""), (short)(0));
      if ( cmbCumUnidad.getItemCount() > 0 )
      {
         if ( isIns( ) && (0==A8639CumUnidad) )
         {
            A8639CumUnidad = (byte)(AV20ConMan) ;
            httpContext.ajax_rsp_assign_attri("", false, "A8639CumUnidad", GXutil.str( A8639CumUnidad, 1, 0));
         }
      }
      /* End function init_web_controls */
   }

   public boolean isIns( )
   {
      return ((GXutil.strcmp(Gx_mode, "INS")==0) ? true : false) ;
   }

   public boolean isDlt( )
   {
      return ((GXutil.strcmp(Gx_mode, "DLT")==0) ? true : false) ;
   }

   public boolean isUpd( )
   {
      return ((GXutil.strcmp(Gx_mode, "UPD")==0) ? true : false) ;
   }

   public boolean isDsp( )
   {
      return ((GXutil.strcmp(Gx_mode, "DSP")==0) ? true : false) ;
   }

   public void valid_Prdnum( )
   {
      /* Using cursor T01TA18 */
      pr_default.execute(16, new Object[] {A396EmprCod, A719PrdNum});
      Z718PrdNom = T01TA18_A718PrdNom[0] ;
      Z707PrdFacCon = T01TA18_A707PrdFacCon[0] ;
      Z705PrdExiCC = T01TA18_A705PrdExiCC[0] ;
      Z685PrdCanRes = T01TA18_A685PrdCanRes[0] ;
      Z724PrdPreAct = T01TA18_A724PrdPreAct[0] ;
      Z726PrdPreMed = T01TA18_A726PrdPreMed[0] ;
      Z10881PrdLote = T01TA18_A10881PrdLote[0] ;
      Z856ValCod = T01TA18_A856ValCod[0] ;
      if ( (pr_default.getStatus(16) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PRODUC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PRDNUM");
         AnyError = (short)(1) ;
         GX_FocusControl = edtPrdNum_Internalname ;
      }
      A704PrdExiAlm = T01TA18_A704PrdExiAlm[0] ;
      A750PrdValStk = T01TA18_A750PrdValStk[0] ;
      A718PrdNom = T01TA18_A718PrdNom[0] ;
      A707PrdFacCon = T01TA18_A707PrdFacCon[0] ;
      A705PrdExiCC = T01TA18_A705PrdExiCC[0] ;
      A685PrdCanRes = T01TA18_A685PrdCanRes[0] ;
      A724PrdPreAct = T01TA18_A724PrdPreAct[0] ;
      A726PrdPreMed = T01TA18_A726PrdPreMed[0] ;
      A10881PrdLote = T01TA18_A10881PrdLote[0] ;
      A856ValCod = T01TA18_A856ValCod[0] ;
      O750PrdValStk = A750PrdValStk ;
      O704PrdExiAlm = A704PrdExiAlm ;
      pr_default.close(16);
      if ( isIns( )  && (GXutil.strcmp("", A5862CumConLot)==0) && ( Gx_BScreen == 0 ) )
      {
         A5862CumConLot = A10881PrdLote ;
      }
      GXt_date13 = A3835UltFecCCs ;
      GXv_char4[0] = A396EmprCod ;
      GXv_char3[0] = A719PrdNum ;
      GXv_date14[0] = GXt_date13 ;
      new app.pstm005(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_date14) ;
      salidaproductomanual_detail_impl.this.A396EmprCod = GXv_char4[0] ;
      salidaproductomanual_detail_impl.this.A719PrdNum = GXv_char3[0] ;
      salidaproductomanual_detail_impl.this.GXt_date13 = GXv_date14[0] ;
      A3835UltFecCCs = GXt_date13 ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "O704PrdExiAlm", GXutil.ltrim( localUtil.ntoc( O704PrdExiAlm, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      httpContext.ajax_rsp_assign_attri("", false, "O750PrdValStk", GXutil.ltrim( localUtil.ntoc( O750PrdValStk, (byte)(11), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      httpContext.ajax_rsp_assign_attri("", false, "A704PrdExiAlm", GXutil.ltrim( localUtil.ntoc( A704PrdExiAlm, (byte)(12), (byte)(4), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A750PrdValStk", GXutil.ltrim( localUtil.ntoc( A750PrdValStk, (byte)(11), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A718PrdNom", GXutil.rtrim( A718PrdNom));
      httpContext.ajax_rsp_assign_attri("", false, "A707PrdFacCon", GXutil.ltrim( localUtil.ntoc( A707PrdFacCon, (byte)(7), (byte)(4), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A705PrdExiCC", GXutil.ltrim( localUtil.ntoc( A705PrdExiCC, (byte)(12), (byte)(4), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A685PrdCanRes", GXutil.ltrim( localUtil.ntoc( A685PrdCanRes, (byte)(12), (byte)(4), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A724PrdPreAct", GXutil.ltrim( localUtil.ntoc( A724PrdPreAct, (byte)(14), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A726PrdPreMed", GXutil.ltrim( localUtil.ntoc( A726PrdPreMed, (byte)(14), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A10881PrdLote", GXutil.rtrim( A10881PrdLote));
      httpContext.ajax_rsp_assign_attri("", false, "A856ValCod", GXutil.ltrim( localUtil.ntoc( A856ValCod, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A5862CumConLot", GXutil.rtrim( A5862CumConLot));
      httpContext.ajax_rsp_assign_attri("", false, "A3835UltFecCCs", localUtil.format(A3835UltFecCCs, "99/99/99"));
   }

   public void valid_Cumunidad( )
   {
      A8639CumUnidad = (byte)(GXutil.lval( cmbCumUnidad.getValue())) ;
      if ( A8639CumUnidad == 0 )
      {
         A861CumConCbis = (A860CumConCant.divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN)).multiply(A707PrdFacCon) ;
      }
      else
      {
         if ( A8639CumUnidad == 1 )
         {
            A861CumConCbis = A860CumConCant.multiply(A707PrdFacCon) ;
         }
      }
      if ( A8639CumUnidad == 0 )
      {
         AV16CumConOld = (O860CumConCant.divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN)).multiply(A707PrdFacCon) ;
      }
      else
      {
         if ( A8639CumUnidad == 1 )
         {
            AV16CumConOld = O860CumConCant.multiply(A707PrdFacCon) ;
         }
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A861CumConCbis", GXutil.ltrim( localUtil.ntoc( A861CumConCbis, (byte)(12), (byte)(4), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV16CumConOld", GXutil.ltrim( localUtil.ntoc( AV16CumConOld, (byte)(12), (byte)(4), ".", "")));
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV7EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV8CumCodCont',fld:'vCUMCODCONT',pic:'ZZZZZZZ9',hsh:true},{av:'AV9PrdNum',fld:'vPRDNUM',pic:'',hsh:true}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV7EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV8CumCodCont',fld:'vCUMCODCONT',pic:'ZZZZZZZ9',hsh:true},{av:'AV9PrdNum',fld:'vPRDNUM',pic:'',hsh:true},{av:'AV33Pgmname',fld:'vPGMNAME',pic:''},{av:'A12257PrdComID',fld:'PRDCOMID',pic:''},{av:'A12700CumUMed',fld:'CUMUMED',pic:'9'},{av:'A14039CumLotAlm',fld:'CUMLOTALM',pic:'ZZZ9'}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("AFTER TRN","{handler:'e121TA2',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV7EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV8CumCodCont',fld:'vCUMCODCONT',pic:'ZZZZZZZ9',hsh:true},{av:'A719PrdNum',fld:'PRDNUM',pic:''}]");
      setEventMetadata("AFTER TRN",",oparms:[]}");
      setEventMetadata("VALID_PRDNUM","{handler:'valid_Prdnum',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A719PrdNum',fld:'PRDNUM',pic:''},{av:'A10881PrdLote',fld:'PRDLOTE',pic:''},{av:'Gx_BScreen',fld:'vGXBSCREEN',pic:'9'},{av:'A704PrdExiAlm',fld:'PRDEXIALM',pic:'ZZZZZZ9.9999'},{av:'A750PrdValStk',fld:'PRDVALSTK',pic:'ZZZZZZZ9.99'},{av:'A718PrdNom',fld:'PRDNOM',pic:''},{av:'A707PrdFacCon',fld:'PRDFACCON',pic:'Z9.9999'},{av:'A705PrdExiCC',fld:'PRDEXICC',pic:'ZZZZZZ9.9999'},{av:'A685PrdCanRes',fld:'PRDCANRES',pic:'ZZZZZZ9.9999'},{av:'A724PrdPreAct',fld:'PRDPREACT',pic:'ZZZZZZZ9.999'},{av:'A726PrdPreMed',fld:'PRDPREMED',pic:'ZZZZZZZ9.999'},{av:'A856ValCod',fld:'VALCOD',pic:'9'},{av:'A5862CumConLot',fld:'CUMCONLOT',pic:''},{av:'A3835UltFecCCs',fld:'ULTFECCCS',pic:''}]");
      setEventMetadata("VALID_PRDNUM",",oparms:[{av:'O704PrdExiAlm'},{av:'O750PrdValStk'},{av:'A704PrdExiAlm',fld:'PRDEXIALM',pic:'ZZZZZZ9.9999'},{av:'A750PrdValStk',fld:'PRDVALSTK',pic:'ZZZZZZZ9.99'},{av:'A718PrdNom',fld:'PRDNOM',pic:''},{av:'A707PrdFacCon',fld:'PRDFACCON',pic:'Z9.9999'},{av:'A705PrdExiCC',fld:'PRDEXICC',pic:'ZZZZZZ9.9999'},{av:'A685PrdCanRes',fld:'PRDCANRES',pic:'ZZZZZZ9.9999'},{av:'A724PrdPreAct',fld:'PRDPREACT',pic:'ZZZZZZZ9.999'},{av:'A726PrdPreMed',fld:'PRDPREMED',pic:'ZZZZZZZ9.999'},{av:'A10881PrdLote',fld:'PRDLOTE',pic:''},{av:'A856ValCod',fld:'VALCOD',pic:'9'},{av:'A5862CumConLot',fld:'CUMCONLOT',pic:''},{av:'A3835UltFecCCs',fld:'ULTFECCCS',pic:''}]}");
      setEventMetadata("VALID_CUMCONCANT","{handler:'valid_Cumconcant',iparms:[]");
      setEventMetadata("VALID_CUMCONCANT",",oparms:[]}");
      setEventMetadata("VALID_CUMUNIDAD","{handler:'valid_Cumunidad',iparms:[{av:'O860CumConCant'},{av:'A860CumConCant',fld:'CUMCONCANT',pic:'ZZZZZZ9.9999'},{av:'A707PrdFacCon',fld:'PRDFACCON',pic:'Z9.9999'},{av:'cmbCumUnidad'},{av:'A8639CumUnidad',fld:'CUMUNIDAD',pic:'9'},{av:'A861CumConCbis',fld:'CUMCONCBIS',pic:'ZZZZZZ9.9999'},{av:'AV16CumConOld',fld:'vCUMCONOLD',pic:'ZZZZZZ9.9999'}]");
      setEventMetadata("VALID_CUMUNIDAD",",oparms:[{av:'A861CumConCbis',fld:'CUMCONCBIS',pic:'ZZZZZZ9.9999'},{av:'AV16CumConOld',fld:'vCUMCONOLD',pic:'ZZZZZZ9.9999'}]}");
      setEventMetadata("VALID_CUMCONLOT","{handler:'valid_Cumconlot',iparms:[]");
      setEventMetadata("VALID_CUMCONLOT",",oparms:[]}");
      setEventMetadata("VALID_CUMCONCBIS","{handler:'valid_Cumconcbis',iparms:[]");
      setEventMetadata("VALID_CUMCONCBIS",",oparms:[]}");
      setEventMetadata("VALID_PRDFACCON","{handler:'valid_Prdfaccon',iparms:[]");
      setEventMetadata("VALID_PRDFACCON",",oparms:[]}");
      setEventMetadata("VALID_PRDEXIALM","{handler:'valid_Prdexialm',iparms:[]");
      setEventMetadata("VALID_PRDEXIALM",",oparms:[]}");
      setEventMetadata("VALIDV_COMBOPRDNUM","{handler:'validv_Comboprdnum',iparms:[]");
      setEventMetadata("VALIDV_COMBOPRDNUM",",oparms:[]}");
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
      pr_default.close(16);
      pr_default.close(17);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOGx_mode = "" ;
      wcpOAV7EmprCod = "" ;
      wcpOAV9PrdNum = "" ;
      Z396EmprCod = "" ;
      Z719PrdNum = "" ;
      Z861CumConCbis = DecimalUtil.ZERO ;
      Z860CumConCant = DecimalUtil.ZERO ;
      Z5862CumConLot = "" ;
      Z12257PrdComID = "" ;
      Z718PrdNom = "" ;
      Z707PrdFacCon = DecimalUtil.ZERO ;
      Z705PrdExiCC = DecimalUtil.ZERO ;
      Z685PrdCanRes = DecimalUtil.ZERO ;
      Z724PrdPreAct = DecimalUtil.ZERO ;
      Z726PrdPreMed = DecimalUtil.ZERO ;
      Z10881PrdLote = "" ;
      O750PrdValStk = DecimalUtil.ZERO ;
      O861CumConCbis = DecimalUtil.ZERO ;
      O704PrdExiAlm = DecimalUtil.ZERO ;
      O860CumConCant = DecimalUtil.ZERO ;
      Combo_prdnum_Selectedvalue_get = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A719PrdNum = "" ;
      A862CumConFec = GXutil.nullDate() ;
      A861CumConCbis = DecimalUtil.ZERO ;
      A726PrdPreMed = DecimalUtil.ZERO ;
      A724PrdPreAct = DecimalUtil.ZERO ;
      AV16CumConOld = DecimalUtil.ZERO ;
      A860CumConCant = DecimalUtil.ZERO ;
      A5862CumConLot = "" ;
      Gx_mode = "" ;
      AV7EmprCod = "" ;
      AV9PrdNum = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      GX_FocusControl = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_tableattributes = new com.genexus.webpanels.GXUserControl();
      lblTextblockprdnum_Jsonclick = "" ;
      ucCombo_prdnum = new com.genexus.webpanels.GXUserControl();
      Combo_prdnum_Caption = "" ;
      AV29PrdNum_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      TempTags = "" ;
      imgprompt_719_5862_gximage = "" ;
      sImgUrl = "" ;
      A707PrdFacCon = DecimalUtil.ZERO ;
      A704PrdExiAlm = DecimalUtil.ZERO ;
      A685PrdCanRes = DecimalUtil.ZERO ;
      WebComp_Webcomponent1_Component = "" ;
      OldWebcomponent1 = "" ;
      bttBtntrn_enter_Jsonclick = "" ;
      bttBtntrn_cancel_Jsonclick = "" ;
      bttBtntrn_delete_Jsonclick = "" ;
      AV33Pgmname = "" ;
      AV31ComboPrdNum = "" ;
      A12257PrdComID = "" ;
      A718PrdNom = "" ;
      A705PrdExiCC = DecimalUtil.ZERO ;
      A10881PrdLote = "" ;
      A8926CC_AlmDc = "" ;
      A3835UltFecCCs = GXutil.nullDate() ;
      A863CumCosPro = DecimalUtil.ZERO ;
      A10778CumCCosD = "" ;
      AV27CumConCbis = DecimalUtil.ZERO ;
      A750PrdValStk = DecimalUtil.ZERO ;
      AV17UsurCod = "" ;
      AV28Ok = "" ;
      A407EmprNom = "" ;
      A488ForPrdDsc = "" ;
      Combo_prdnum_Objectcall = "" ;
      Combo_prdnum_Class = "" ;
      Combo_prdnum_Icontype = "" ;
      Combo_prdnum_Icon = "" ;
      Combo_prdnum_Tooltip = "" ;
      Combo_prdnum_Selectedvalue_set = "" ;
      Combo_prdnum_Selectedtext_set = "" ;
      Combo_prdnum_Selectedtext_get = "" ;
      Combo_prdnum_Gamoauthtoken = "" ;
      Combo_prdnum_Ddointernalname = "" ;
      Combo_prdnum_Titlecontrolalign = "" ;
      Combo_prdnum_Dropdownoptionstype = "" ;
      Combo_prdnum_Titlecontrolidtoreplace = "" ;
      Combo_prdnum_Datalisttype = "" ;
      Combo_prdnum_Datalistfixedvalues = "" ;
      Combo_prdnum_Datalistproc = "" ;
      Combo_prdnum_Datalistprocparametersprefix = "" ;
      Combo_prdnum_Remoteservicesparameters = "" ;
      Combo_prdnum_Htmltemplate = "" ;
      Combo_prdnum_Multiplevaluestype = "" ;
      Combo_prdnum_Loadingdata = "" ;
      Combo_prdnum_Noresultsfound = "" ;
      Combo_prdnum_Emptyitemtext = "" ;
      Combo_prdnum_Onlyselectedvalues = "" ;
      Combo_prdnum_Selectalltext = "" ;
      Combo_prdnum_Multiplevaluesseparator = "" ;
      Combo_prdnum_Addnewoptiontext = "" ;
      Dvpanel_tableattributes_Objectcall = "" ;
      Dvpanel_tableattributes_Class = "" ;
      Dvpanel_tableattributes_Height = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      hsh = "" ;
      sMode112 = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      AV18Station = "" ;
      AV19EmprNom = "" ;
      GXv_int8 = new int[1] ;
      GXv_char2 = new String[1] ;
      AV10WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext9 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV11TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV12WebSession = httpContext.getWebSession();
      AV14TrnContextAtt = new app.wwpbaseobjects.SdtWWPTransactionContext_Attribute(remoteHandle, context);
      GXt_objcol_SdtDVB_SDTComboData_Item10 = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV30ComboSelectedValue = "" ;
      GXv_objcol_SdtDVB_SDTComboData_Item11 = new GXBaseCollection[1] ;
      Z407EmprNom = "" ;
      Z488ForPrdDsc = "" ;
      Z862CumConFec = GXutil.nullDate() ;
      Z704PrdExiAlm = DecimalUtil.ZERO ;
      Z750PrdValStk = DecimalUtil.ZERO ;
      T01TA4_A407EmprNom = new String[] {""} ;
      T01TA4_n407EmprNom = new boolean[] {false} ;
      T01TA4_A3915EmpNumDec = new byte[1] ;
      T01TA4_n3915EmpNumDec = new boolean[] {false} ;
      T01TA8_A11368CumConTipo = new byte[1] ;
      T01TA8_A862CumConFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01TA8_A10777CumCCos = new short[1] ;
      T01TA8_A8925CC_AlmCd = new byte[1] ;
      T01TA8_n8925CC_AlmCd = new boolean[] {false} ;
      T01TA8_A3839CcoCod = new short[1] ;
      T01TA8_n3839CcoCod = new boolean[] {false} ;
      T01TA6_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TA6_A750PrdValStk = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TA6_A718PrdNom = new String[] {""} ;
      T01TA6_A707PrdFacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TA6_A705PrdExiCC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TA6_A685PrdCanRes = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TA6_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TA6_A726PrdPreMed = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TA6_A10881PrdLote = new String[] {""} ;
      T01TA6_A856ValCod = new byte[1] ;
      T01TA7_A488ForPrdDsc = new String[] {""} ;
      T01TA7_n488ForPrdDsc = new boolean[] {false} ;
      T01TA9_A861CumConCbis = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TA9_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TA9_A750PrdValStk = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TA9_A407EmprNom = new String[] {""} ;
      T01TA9_n407EmprNom = new boolean[] {false} ;
      T01TA9_A3915EmpNumDec = new byte[1] ;
      T01TA9_n3915EmpNumDec = new boolean[] {false} ;
      T01TA9_A11368CumConTipo = new byte[1] ;
      T01TA9_A862CumConFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01TA9_A10777CumCCos = new short[1] ;
      T01TA9_A8925CC_AlmCd = new byte[1] ;
      T01TA9_n8925CC_AlmCd = new boolean[] {false} ;
      T01TA9_A718PrdNom = new String[] {""} ;
      T01TA9_A707PrdFacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TA9_A705PrdExiCC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TA9_A685PrdCanRes = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TA9_A860CumConCant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TA9_A8639CumUnidad = new byte[1] ;
      T01TA9_A5862CumConLot = new String[] {""} ;
      T01TA9_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TA9_A726PrdPreMed = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TA9_A488ForPrdDsc = new String[] {""} ;
      T01TA9_n488ForPrdDsc = new boolean[] {false} ;
      T01TA9_A12257PrdComID = new String[] {""} ;
      T01TA9_A10881PrdLote = new String[] {""} ;
      T01TA9_A12700CumUMed = new byte[1] ;
      T01TA9_A14039CumLotAlm = new short[1] ;
      T01TA9_A396EmprCod = new String[] {""} ;
      T01TA9_A719PrdNum = new String[] {""} ;
      T01TA9_A490ForPrdUMe = new byte[1] ;
      T01TA9_A859CumCodCont = new int[1] ;
      T01TA9_A856ValCod = new byte[1] ;
      T01TA9_A3839CcoCod = new short[1] ;
      T01TA9_n3839CcoCod = new boolean[] {false} ;
      T01TA10_A488ForPrdDsc = new String[] {""} ;
      T01TA10_n488ForPrdDsc = new boolean[] {false} ;
      T01TA11_A396EmprCod = new String[] {""} ;
      T01TA11_A859CumCodCont = new int[1] ;
      T01TA11_A719PrdNum = new String[] {""} ;
      T01TA3_A861CumConCbis = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TA3_A860CumConCant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TA3_A8639CumUnidad = new byte[1] ;
      T01TA3_A5862CumConLot = new String[] {""} ;
      T01TA3_A12257PrdComID = new String[] {""} ;
      T01TA3_A12700CumUMed = new byte[1] ;
      T01TA3_A14039CumLotAlm = new short[1] ;
      T01TA3_A396EmprCod = new String[] {""} ;
      T01TA3_A719PrdNum = new String[] {""} ;
      T01TA3_A490ForPrdUMe = new byte[1] ;
      T01TA3_A859CumCodCont = new int[1] ;
      T01TA12_A396EmprCod = new String[] {""} ;
      T01TA12_A859CumCodCont = new int[1] ;
      T01TA12_A719PrdNum = new String[] {""} ;
      T01TA13_A396EmprCod = new String[] {""} ;
      T01TA13_A859CumCodCont = new int[1] ;
      T01TA13_A719PrdNum = new String[] {""} ;
      T01TA2_A861CumConCbis = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TA2_A860CumConCant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TA2_A8639CumUnidad = new byte[1] ;
      T01TA2_A5862CumConLot = new String[] {""} ;
      T01TA2_A12257PrdComID = new String[] {""} ;
      T01TA2_A12700CumUMed = new byte[1] ;
      T01TA2_A14039CumLotAlm = new short[1] ;
      T01TA2_A396EmprCod = new String[] {""} ;
      T01TA2_A719PrdNum = new String[] {""} ;
      T01TA2_A490ForPrdUMe = new byte[1] ;
      T01TA2_A859CumCodCont = new int[1] ;
      T01TA14_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TA14_A750PrdValStk = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TA14_A718PrdNom = new String[] {""} ;
      T01TA14_A707PrdFacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TA14_A705PrdExiCC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TA14_A685PrdCanRes = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TA14_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TA14_A726PrdPreMed = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TA14_A10881PrdLote = new String[] {""} ;
      T01TA14_A856ValCod = new byte[1] ;
      T01TA18_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TA18_A750PrdValStk = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TA18_A718PrdNom = new String[] {""} ;
      T01TA18_A707PrdFacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TA18_A705PrdExiCC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TA18_A685PrdCanRes = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TA18_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TA18_A726PrdPreMed = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TA18_A10881PrdLote = new String[] {""} ;
      T01TA18_A856ValCod = new byte[1] ;
      T01TA19_A488ForPrdDsc = new String[] {""} ;
      T01TA19_n488ForPrdDsc = new boolean[] {false} ;
      T01TA21_A396EmprCod = new String[] {""} ;
      T01TA21_A859CumCodCont = new int[1] ;
      T01TA21_A719PrdNum = new String[] {""} ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXv_int6 = new byte[1] ;
      GXt_char1 = "" ;
      GXv_int12 = new short[1] ;
      GXt_date13 = GXutil.nullDate() ;
      GXv_char4 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_date14 = new java.util.Date[1] ;
      ZO704PrdExiAlm = DecimalUtil.ZERO ;
      ZO750PrdValStk = DecimalUtil.ZERO ;
      Z3835UltFecCCs = GXutil.nullDate() ;
      ZV16CumConOld = DecimalUtil.ZERO ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.salidaproductomanual_detail__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.salidaproductomanual_detail__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.salidaproductomanual_detail__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.salidaproductomanual_detail__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.salidaproductomanual_detail__default(),
         new Object[] {
             new Object[] {
            T01TA2_A861CumConCbis, T01TA2_A860CumConCant, T01TA2_A8639CumUnidad, T01TA2_A5862CumConLot, T01TA2_A12257PrdComID, T01TA2_A12700CumUMed, T01TA2_A14039CumLotAlm, T01TA2_A396EmprCod, T01TA2_A719PrdNum, T01TA2_A490ForPrdUMe,
            T01TA2_A859CumCodCont
            }
            , new Object[] {
            T01TA3_A861CumConCbis, T01TA3_A860CumConCant, T01TA3_A8639CumUnidad, T01TA3_A5862CumConLot, T01TA3_A12257PrdComID, T01TA3_A12700CumUMed, T01TA3_A14039CumLotAlm, T01TA3_A396EmprCod, T01TA3_A719PrdNum, T01TA3_A490ForPrdUMe,
            T01TA3_A859CumCodCont
            }
            , new Object[] {
            T01TA4_A407EmprNom, T01TA4_n407EmprNom, T01TA4_A3915EmpNumDec, T01TA4_n3915EmpNumDec
            }
            , new Object[] {
            T01TA5_A704PrdExiAlm, T01TA5_A750PrdValStk, T01TA5_A718PrdNom, T01TA5_A707PrdFacCon, T01TA5_A705PrdExiCC, T01TA5_A685PrdCanRes, T01TA5_A724PrdPreAct, T01TA5_A726PrdPreMed, T01TA5_A10881PrdLote, T01TA5_A856ValCod
            }
            , new Object[] {
            T01TA6_A704PrdExiAlm, T01TA6_A750PrdValStk, T01TA6_A718PrdNom, T01TA6_A707PrdFacCon, T01TA6_A705PrdExiCC, T01TA6_A685PrdCanRes, T01TA6_A724PrdPreAct, T01TA6_A726PrdPreMed, T01TA6_A10881PrdLote, T01TA6_A856ValCod
            }
            , new Object[] {
            T01TA7_A488ForPrdDsc, T01TA7_n488ForPrdDsc
            }
            , new Object[] {
            T01TA8_A11368CumConTipo, T01TA8_A862CumConFec, T01TA8_A10777CumCCos, T01TA8_A8925CC_AlmCd, T01TA8_n8925CC_AlmCd, T01TA8_A3839CcoCod, T01TA8_n3839CcoCod
            }
            , new Object[] {
            T01TA9_A861CumConCbis, T01TA9_A704PrdExiAlm, T01TA9_A750PrdValStk, T01TA9_A407EmprNom, T01TA9_n407EmprNom, T01TA9_A3915EmpNumDec, T01TA9_n3915EmpNumDec, T01TA9_A11368CumConTipo, T01TA9_A862CumConFec, T01TA9_A10777CumCCos,
            T01TA9_A8925CC_AlmCd, T01TA9_n8925CC_AlmCd, T01TA9_A718PrdNom, T01TA9_A707PrdFacCon, T01TA9_A705PrdExiCC, T01TA9_A685PrdCanRes, T01TA9_A860CumConCant, T01TA9_A8639CumUnidad, T01TA9_A5862CumConLot, T01TA9_A724PrdPreAct,
            T01TA9_A726PrdPreMed, T01TA9_A488ForPrdDsc, T01TA9_n488ForPrdDsc, T01TA9_A12257PrdComID, T01TA9_A10881PrdLote, T01TA9_A12700CumUMed, T01TA9_A14039CumLotAlm, T01TA9_A396EmprCod, T01TA9_A719PrdNum, T01TA9_A490ForPrdUMe,
            T01TA9_A859CumCodCont, T01TA9_A856ValCod, T01TA9_A3839CcoCod, T01TA9_n3839CcoCod
            }
            , new Object[] {
            T01TA10_A488ForPrdDsc, T01TA10_n488ForPrdDsc
            }
            , new Object[] {
            T01TA11_A396EmprCod, T01TA11_A859CumCodCont, T01TA11_A719PrdNum
            }
            , new Object[] {
            T01TA12_A396EmprCod, T01TA12_A859CumCodCont, T01TA12_A719PrdNum
            }
            , new Object[] {
            T01TA13_A396EmprCod, T01TA13_A859CumCodCont, T01TA13_A719PrdNum
            }
            , new Object[] {
            T01TA14_A704PrdExiAlm, T01TA14_A750PrdValStk, T01TA14_A718PrdNom, T01TA14_A707PrdFacCon, T01TA14_A705PrdExiCC, T01TA14_A685PrdCanRes, T01TA14_A724PrdPreAct, T01TA14_A726PrdPreMed, T01TA14_A10881PrdLote, T01TA14_A856ValCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01TA18_A704PrdExiAlm, T01TA18_A750PrdValStk, T01TA18_A718PrdNom, T01TA18_A707PrdFacCon, T01TA18_A705PrdExiCC, T01TA18_A685PrdCanRes, T01TA18_A724PrdPreAct, T01TA18_A726PrdPreMed, T01TA18_A10881PrdLote, T01TA18_A856ValCod
            }
            , new Object[] {
            T01TA19_A488ForPrdDsc, T01TA19_n488ForPrdDsc
            }
            , new Object[] {
            }
            , new Object[] {
            T01TA21_A396EmprCod, T01TA21_A859CumCodCont, T01TA21_A719PrdNum
            }
         }
      );
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
      AV33Pgmname = "SalidaProductoManual_detail" ;
      Z5862CumConLot = "" ;
      A5862CumConLot = "" ;
      Z8639CumUnidad = (byte)(0) ;
      A8639CumUnidad = (byte)(0) ;
      i8639CumUnidad = (byte)(0) ;
      WebComp_Webcomponent1 = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
   }

   private byte Z8639CumUnidad ;
   private byte Z12700CumUMed ;
   private byte Z490ForPrdUMe ;
   private byte Z856ValCod ;
   private byte N490ForPrdUMe ;
   private byte GxWebError ;
   private byte AV25Mes ;
   private byte A8925CC_AlmCd ;
   private byte A490ForPrdUMe ;
   private byte nKeyPressed ;
   private byte A8639CumUnidad ;
   private byte A12700CumUMed ;
   private byte A856ValCod ;
   private byte A3915EmpNumDec ;
   private byte AV13Insert_ForPrdUMe ;
   private byte Gx_BScreen ;
   private byte A11368CumConTipo ;
   private byte GXt_int5 ;
   private byte Z3915EmpNumDec ;
   private byte Z11368CumConTipo ;
   private byte Z8925CC_AlmCd ;
   private byte gxajaxcallmode ;
   private byte i8639CumUnidad ;
   private byte GXv_int6[] ;
   private short Z14039CumLotAlm ;
   private short AV15FlagPreMed ;
   private short AV26Year ;
   private short AV22Moda21 ;
   private short A10777CumCCos ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A14039CumLotAlm ;
   private short AV24Precio_stk ;
   private short AV20ConMan ;
   private short A3839CcoCod ;
   private short RcdFound112 ;
   private short nCmpId ;
   private short AV23Val_stk ;
   private short Z10777CumCCos ;
   private short Z3839CcoCod ;
   private short nIsDirty_112 ;
   private short GXv_int12[] ;
   private int wcpOAV8CumCodCont ;
   private int Z859CumCodCont ;
   private int A859CumCodCont ;
   private int AV8CumCodCont ;
   private int trnEnded ;
   private int edtPrdNum_Visible ;
   private int edtPrdNum_Enabled ;
   private int edtCumConCant_Enabled ;
   private int edtCumConLot_Enabled ;
   private int imgprompt_719_5862_Visible ;
   private int edtCumConCbis_Enabled ;
   private int edtPrdFacCon_Enabled ;
   private int edtPrdExiAlm_Enabled ;
   private int edtPrdCanRes_Enabled ;
   private int bttBtntrn_enter_Visible ;
   private int bttBtntrn_enter_Enabled ;
   private int bttBtntrn_cancel_Visible ;
   private int bttBtntrn_delete_Visible ;
   private int bttBtntrn_delete_Enabled ;
   private int edtavPgmname_Enabled ;
   private int edtavComboprdnum_Visible ;
   private int edtavComboprdnum_Enabled ;
   private int Combo_prdnum_Datalistupdateminimumcharacters ;
   private int AV21Contval ;
   private int GXt_int7 ;
   private int GXv_int8[] ;
   private int AV34GXV1 ;
   private int GX_JID ;
   private int idxLst ;
   private java.math.BigDecimal Z861CumConCbis ;
   private java.math.BigDecimal Z860CumConCant ;
   private java.math.BigDecimal Z707PrdFacCon ;
   private java.math.BigDecimal Z705PrdExiCC ;
   private java.math.BigDecimal Z685PrdCanRes ;
   private java.math.BigDecimal Z724PrdPreAct ;
   private java.math.BigDecimal Z726PrdPreMed ;
   private java.math.BigDecimal O750PrdValStk ;
   private java.math.BigDecimal O861CumConCbis ;
   private java.math.BigDecimal O704PrdExiAlm ;
   private java.math.BigDecimal O860CumConCant ;
   private java.math.BigDecimal A861CumConCbis ;
   private java.math.BigDecimal A726PrdPreMed ;
   private java.math.BigDecimal A724PrdPreAct ;
   private java.math.BigDecimal AV16CumConOld ;
   private java.math.BigDecimal A860CumConCant ;
   private java.math.BigDecimal A707PrdFacCon ;
   private java.math.BigDecimal A704PrdExiAlm ;
   private java.math.BigDecimal A685PrdCanRes ;
   private java.math.BigDecimal A705PrdExiCC ;
   private java.math.BigDecimal A863CumCosPro ;
   private java.math.BigDecimal AV27CumConCbis ;
   private java.math.BigDecimal A750PrdValStk ;
   private java.math.BigDecimal Z704PrdExiAlm ;
   private java.math.BigDecimal Z750PrdValStk ;
   private java.math.BigDecimal ZO704PrdExiAlm ;
   private java.math.BigDecimal ZO750PrdValStk ;
   private java.math.BigDecimal ZV16CumConOld ;
   private String sPrefix ;
   private String wcpOGx_mode ;
   private String wcpOAV7EmprCod ;
   private String wcpOAV9PrdNum ;
   private String Z396EmprCod ;
   private String Z719PrdNum ;
   private String Z5862CumConLot ;
   private String Z12257PrdComID ;
   private String Z718PrdNom ;
   private String Z10881PrdLote ;
   private String Combo_prdnum_Selectedvalue_get ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A719PrdNum ;
   private String A5862CumConLot ;
   private String Gx_mode ;
   private String AV7EmprCod ;
   private String AV9PrdNum ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtPrdNum_Internalname ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String divTablecontent_Internalname ;
   private String Dvpanel_tableattributes_Width ;
   private String Dvpanel_tableattributes_Cls ;
   private String Dvpanel_tableattributes_Title ;
   private String Dvpanel_tableattributes_Iconposition ;
   private String Dvpanel_tableattributes_Internalname ;
   private String divTableattributes_Internalname ;
   private String divUnnamedtable2_Internalname ;
   private String divTablesplittedprdnum_Internalname ;
   private String lblTextblockprdnum_Internalname ;
   private String lblTextblockprdnum_Jsonclick ;
   private String Combo_prdnum_Caption ;
   private String Combo_prdnum_Cls ;
   private String Combo_prdnum_Internalname ;
   private String TempTags ;
   private String edtPrdNum_Jsonclick ;
   private String edtCumConCant_Internalname ;
   private String edtCumConCant_Jsonclick ;
   private String edtCumConLot_Internalname ;
   private String edtCumConLot_Jsonclick ;
   private String imgprompt_719_5862_gximage ;
   private String sImgUrl ;
   private String imgprompt_719_5862_Internalname ;
   private String imgprompt_719_5862_Link ;
   private String edtCumConCbis_Internalname ;
   private String edtCumConCbis_Jsonclick ;
   private String divUnnamedtable3_Internalname ;
   private String edtPrdFacCon_Internalname ;
   private String edtPrdFacCon_Jsonclick ;
   private String edtPrdExiAlm_Internalname ;
   private String edtPrdExiAlm_Jsonclick ;
   private String edtPrdCanRes_Internalname ;
   private String edtPrdCanRes_Jsonclick ;
   private String divUnnamedtable1_Internalname ;
   private String WebComp_Webcomponent1_Component ;
   private String OldWebcomponent1 ;
   private String bttBtntrn_enter_Internalname ;
   private String bttBtntrn_enter_Jsonclick ;
   private String bttBtntrn_cancel_Internalname ;
   private String bttBtntrn_cancel_Jsonclick ;
   private String bttBtntrn_delete_Internalname ;
   private String bttBtntrn_delete_Jsonclick ;
   private String edtavPgmname_Internalname ;
   private String AV33Pgmname ;
   private String edtavPgmname_Jsonclick ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String divSectionattribute_prdnum_Internalname ;
   private String edtavComboprdnum_Internalname ;
   private String AV31ComboPrdNum ;
   private String edtavComboprdnum_Jsonclick ;
   private String A12257PrdComID ;
   private String A718PrdNom ;
   private String A10881PrdLote ;
   private String A8926CC_AlmDc ;
   private String A10778CumCCosD ;
   private String AV17UsurCod ;
   private String AV28Ok ;
   private String A407EmprNom ;
   private String A488ForPrdDsc ;
   private String Combo_prdnum_Objectcall ;
   private String Combo_prdnum_Class ;
   private String Combo_prdnum_Icontype ;
   private String Combo_prdnum_Icon ;
   private String Combo_prdnum_Tooltip ;
   private String Combo_prdnum_Selectedvalue_set ;
   private String Combo_prdnum_Selectedtext_set ;
   private String Combo_prdnum_Selectedtext_get ;
   private String Combo_prdnum_Gamoauthtoken ;
   private String Combo_prdnum_Ddointernalname ;
   private String Combo_prdnum_Titlecontrolalign ;
   private String Combo_prdnum_Dropdownoptionstype ;
   private String Combo_prdnum_Titlecontrolidtoreplace ;
   private String Combo_prdnum_Datalisttype ;
   private String Combo_prdnum_Datalistfixedvalues ;
   private String Combo_prdnum_Datalistproc ;
   private String Combo_prdnum_Datalistprocparametersprefix ;
   private String Combo_prdnum_Remoteservicesparameters ;
   private String Combo_prdnum_Htmltemplate ;
   private String Combo_prdnum_Multiplevaluestype ;
   private String Combo_prdnum_Loadingdata ;
   private String Combo_prdnum_Noresultsfound ;
   private String Combo_prdnum_Emptyitemtext ;
   private String Combo_prdnum_Onlyselectedvalues ;
   private String Combo_prdnum_Selectalltext ;
   private String Combo_prdnum_Multiplevaluesseparator ;
   private String Combo_prdnum_Addnewoptiontext ;
   private String Dvpanel_tableattributes_Objectcall ;
   private String Dvpanel_tableattributes_Class ;
   private String Dvpanel_tableattributes_Height ;
   private String hsh ;
   private String sMode112 ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String AV18Station ;
   private String AV19EmprNom ;
   private String GXv_char2[] ;
   private String Z407EmprNom ;
   private String Z488ForPrdDsc ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXt_char1 ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private java.util.Date A862CumConFec ;
   private java.util.Date A3835UltFecCCs ;
   private java.util.Date Z862CumConFec ;
   private java.util.Date GXt_date13 ;
   private java.util.Date GXv_date14[] ;
   private java.util.Date Z3835UltFecCCs ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n8925CC_AlmCd ;
   private boolean wbErr ;
   private boolean Dvpanel_tableattributes_Autowidth ;
   private boolean Dvpanel_tableattributes_Autoheight ;
   private boolean Dvpanel_tableattributes_Collapsible ;
   private boolean Dvpanel_tableattributes_Collapsed ;
   private boolean Dvpanel_tableattributes_Showcollapseicon ;
   private boolean Dvpanel_tableattributes_Autoscroll ;
   private boolean Combo_prdnum_Emptyitem ;
   private boolean n3915EmpNumDec ;
   private boolean n407EmprNom ;
   private boolean n488ForPrdDsc ;
   private boolean n3839CcoCod ;
   private boolean Combo_prdnum_Enabled ;
   private boolean Combo_prdnum_Visible ;
   private boolean Combo_prdnum_Allowmultipleselection ;
   private boolean Combo_prdnum_Isgriditem ;
   private boolean Combo_prdnum_Hasdescription ;
   private boolean Combo_prdnum_Includeonlyselectedoption ;
   private boolean Combo_prdnum_Includeselectalloption ;
   private boolean Combo_prdnum_Includeaddnewoption ;
   private boolean Dvpanel_tableattributes_Enabled ;
   private boolean Dvpanel_tableattributes_Showheader ;
   private boolean Dvpanel_tableattributes_Visible ;
   private boolean returnInSub ;
   private boolean bDynCreated_Webcomponent1 ;
   private boolean Gx_longc ;
   private String AV30ComboSelectedValue ;
   private GXWebComponent WebComp_Webcomponent1 ;
   private com.genexus.webpanels.WebSession AV12WebSession ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableattributes ;
   private com.genexus.webpanels.GXUserControl ucCombo_prdnum ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private HTMLChoice cmbCumUnidad ;
   private IDataStoreProvider pr_default ;
   private String[] T01TA4_A407EmprNom ;
   private boolean[] T01TA4_n407EmprNom ;
   private byte[] T01TA4_A3915EmpNumDec ;
   private boolean[] T01TA4_n3915EmpNumDec ;
   private byte[] T01TA8_A11368CumConTipo ;
   private java.util.Date[] T01TA8_A862CumConFec ;
   private short[] T01TA8_A10777CumCCos ;
   private byte[] T01TA8_A8925CC_AlmCd ;
   private boolean[] T01TA8_n8925CC_AlmCd ;
   private short[] T01TA8_A3839CcoCod ;
   private boolean[] T01TA8_n3839CcoCod ;
   private java.math.BigDecimal[] T01TA6_A704PrdExiAlm ;
   private java.math.BigDecimal[] T01TA6_A750PrdValStk ;
   private String[] T01TA6_A718PrdNom ;
   private java.math.BigDecimal[] T01TA6_A707PrdFacCon ;
   private java.math.BigDecimal[] T01TA6_A705PrdExiCC ;
   private java.math.BigDecimal[] T01TA6_A685PrdCanRes ;
   private java.math.BigDecimal[] T01TA6_A724PrdPreAct ;
   private java.math.BigDecimal[] T01TA6_A726PrdPreMed ;
   private String[] T01TA6_A10881PrdLote ;
   private byte[] T01TA6_A856ValCod ;
   private String[] T01TA7_A488ForPrdDsc ;
   private boolean[] T01TA7_n488ForPrdDsc ;
   private java.math.BigDecimal[] T01TA9_A861CumConCbis ;
   private java.math.BigDecimal[] T01TA9_A704PrdExiAlm ;
   private java.math.BigDecimal[] T01TA9_A750PrdValStk ;
   private String[] T01TA9_A407EmprNom ;
   private boolean[] T01TA9_n407EmprNom ;
   private byte[] T01TA9_A3915EmpNumDec ;
   private boolean[] T01TA9_n3915EmpNumDec ;
   private byte[] T01TA9_A11368CumConTipo ;
   private java.util.Date[] T01TA9_A862CumConFec ;
   private short[] T01TA9_A10777CumCCos ;
   private byte[] T01TA9_A8925CC_AlmCd ;
   private boolean[] T01TA9_n8925CC_AlmCd ;
   private String[] T01TA9_A718PrdNom ;
   private java.math.BigDecimal[] T01TA9_A707PrdFacCon ;
   private java.math.BigDecimal[] T01TA9_A705PrdExiCC ;
   private java.math.BigDecimal[] T01TA9_A685PrdCanRes ;
   private java.math.BigDecimal[] T01TA9_A860CumConCant ;
   private byte[] T01TA9_A8639CumUnidad ;
   private String[] T01TA9_A5862CumConLot ;
   private java.math.BigDecimal[] T01TA9_A724PrdPreAct ;
   private java.math.BigDecimal[] T01TA9_A726PrdPreMed ;
   private String[] T01TA9_A488ForPrdDsc ;
   private boolean[] T01TA9_n488ForPrdDsc ;
   private String[] T01TA9_A12257PrdComID ;
   private String[] T01TA9_A10881PrdLote ;
   private byte[] T01TA9_A12700CumUMed ;
   private short[] T01TA9_A14039CumLotAlm ;
   private String[] T01TA9_A396EmprCod ;
   private String[] T01TA9_A719PrdNum ;
   private byte[] T01TA9_A490ForPrdUMe ;
   private int[] T01TA9_A859CumCodCont ;
   private byte[] T01TA9_A856ValCod ;
   private short[] T01TA9_A3839CcoCod ;
   private boolean[] T01TA9_n3839CcoCod ;
   private String[] T01TA10_A488ForPrdDsc ;
   private boolean[] T01TA10_n488ForPrdDsc ;
   private String[] T01TA11_A396EmprCod ;
   private int[] T01TA11_A859CumCodCont ;
   private String[] T01TA11_A719PrdNum ;
   private java.math.BigDecimal[] T01TA3_A861CumConCbis ;
   private java.math.BigDecimal[] T01TA3_A860CumConCant ;
   private byte[] T01TA3_A8639CumUnidad ;
   private String[] T01TA3_A5862CumConLot ;
   private String[] T01TA3_A12257PrdComID ;
   private byte[] T01TA3_A12700CumUMed ;
   private short[] T01TA3_A14039CumLotAlm ;
   private String[] T01TA3_A396EmprCod ;
   private String[] T01TA3_A719PrdNum ;
   private byte[] T01TA3_A490ForPrdUMe ;
   private int[] T01TA3_A859CumCodCont ;
   private String[] T01TA12_A396EmprCod ;
   private int[] T01TA12_A859CumCodCont ;
   private String[] T01TA12_A719PrdNum ;
   private String[] T01TA13_A396EmprCod ;
   private int[] T01TA13_A859CumCodCont ;
   private String[] T01TA13_A719PrdNum ;
   private java.math.BigDecimal[] T01TA2_A861CumConCbis ;
   private java.math.BigDecimal[] T01TA2_A860CumConCant ;
   private byte[] T01TA2_A8639CumUnidad ;
   private String[] T01TA2_A5862CumConLot ;
   private String[] T01TA2_A12257PrdComID ;
   private byte[] T01TA2_A12700CumUMed ;
   private short[] T01TA2_A14039CumLotAlm ;
   private String[] T01TA2_A396EmprCod ;
   private String[] T01TA2_A719PrdNum ;
   private byte[] T01TA2_A490ForPrdUMe ;
   private int[] T01TA2_A859CumCodCont ;
   private java.math.BigDecimal[] T01TA14_A704PrdExiAlm ;
   private java.math.BigDecimal[] T01TA14_A750PrdValStk ;
   private String[] T01TA14_A718PrdNom ;
   private java.math.BigDecimal[] T01TA14_A707PrdFacCon ;
   private java.math.BigDecimal[] T01TA14_A705PrdExiCC ;
   private java.math.BigDecimal[] T01TA14_A685PrdCanRes ;
   private java.math.BigDecimal[] T01TA14_A724PrdPreAct ;
   private java.math.BigDecimal[] T01TA14_A726PrdPreMed ;
   private String[] T01TA14_A10881PrdLote ;
   private byte[] T01TA14_A856ValCod ;
   private java.math.BigDecimal[] T01TA18_A704PrdExiAlm ;
   private java.math.BigDecimal[] T01TA18_A750PrdValStk ;
   private String[] T01TA18_A718PrdNom ;
   private java.math.BigDecimal[] T01TA18_A707PrdFacCon ;
   private java.math.BigDecimal[] T01TA18_A705PrdExiCC ;
   private java.math.BigDecimal[] T01TA18_A685PrdCanRes ;
   private java.math.BigDecimal[] T01TA18_A724PrdPreAct ;
   private java.math.BigDecimal[] T01TA18_A726PrdPreMed ;
   private String[] T01TA18_A10881PrdLote ;
   private byte[] T01TA18_A856ValCod ;
   private String[] T01TA19_A488ForPrdDsc ;
   private boolean[] T01TA19_n488ForPrdDsc ;
   private String[] T01TA21_A396EmprCod ;
   private int[] T01TA21_A859CumCodCont ;
   private String[] T01TA21_A719PrdNum ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private java.math.BigDecimal[] T01TA5_A704PrdExiAlm ;
   private java.math.BigDecimal[] T01TA5_A750PrdValStk ;
   private String[] T01TA5_A718PrdNom ;
   private java.math.BigDecimal[] T01TA5_A707PrdFacCon ;
   private java.math.BigDecimal[] T01TA5_A705PrdExiCC ;
   private java.math.BigDecimal[] T01TA5_A685PrdCanRes ;
   private java.math.BigDecimal[] T01TA5_A724PrdPreAct ;
   private java.math.BigDecimal[] T01TA5_A726PrdPreMed ;
   private String[] T01TA5_A10881PrdLote ;
   private byte[] T01TA5_A856ValCod ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV29PrdNum_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> GXt_objcol_SdtDVB_SDTComboData_Item10 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> GXv_objcol_SdtDVB_SDTComboData_Item11[] ;
   private app.wwpbaseobjects.SdtWWPContext AV10WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext9[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV11TrnContext ;
   private app.wwpbaseobjects.SdtWWPTransactionContext_Attribute AV14TrnContextAtt ;
}

final  class salidaproductomanual_detail__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

   public String getDataStoreName( )
   {
      return "MODA21";
   }

}

final  class salidaproductomanual_detail__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

   public String getDataStoreName( )
   {
      return "VERTEX";
   }

}

final  class salidaproductomanual_detail__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

   public String getDataStoreName( )
   {
      return "COLORSERVICE";
   }

}

final  class salidaproductomanual_detail__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

   public String getDataStoreName( )
   {
      return "EKAMAT";
   }

}

final  class salidaproductomanual_detail__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01TA2", "SELECT CumConCbis, CumConCant, CumUnidad, CumConLot, PrdComID, CumUMed, CumLotAlm, EmprCod, PrdNum, ForPrdUMe, CumCodCont FROM TXPLCUMCO WHERE EmprCod = ? AND CumCodCont = ? AND PrdNum = ?  FOR UPDATE OF CumConCbis, CumConCant, CumUnidad, CumConLot, PrdComID, CumUMed, CumLotAlm, ForPrdUMe NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TA3", "SELECT CumConCbis, CumConCant, CumUnidad, CumConLot, PrdComID, CumUMed, CumLotAlm, EmprCod, PrdNum, ForPrdUMe, CumCodCont FROM TXPLCUMCO WHERE EmprCod = ? AND CumCodCont = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TA4", "SELECT EmprNom, EmpNumDec FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TA5", "SELECT PrdExiAlm, PrdValStk, PrdNom, PrdFacCon, PrdExiCC, PrdCanRes, PrdPreAct, PrdPreMed, PrdLote, ValCod FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ?  FOR UPDATE OF PrdExiAlm, PrdValStk NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TA6", "SELECT PrdExiAlm, PrdValStk, PrdNom, PrdFacCon, PrdExiCC, PrdCanRes, PrdPreAct, PrdPreMed, PrdLote, ValCod FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TA7", "SELECT ForPrdDsc FROM TXPUNMEPR WHERE EmprCod = ? AND ForPrdUMe = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TA8", "SELECT CumConTipo, CumConFec, CumCCos, CC_AlmCd, CcoCod FROM TXPCCUMCO WHERE EmprCod = ? AND CumCodCont = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TA9", "SELECT /*+ FIRST_ROWS(100) */ TM1.CumConCbis, T5.PrdExiAlm, T5.PrdValStk, T2.EmprNom, T2.EmpNumDec, T4.CumConTipo, T4.CumConFec, T4.CumCCos, T4.CC_AlmCd, T5.PrdNom, T5.PrdFacCon, T5.PrdExiCC, T5.PrdCanRes, TM1.CumConCant, TM1.CumUnidad, TM1.CumConLot, T5.PrdPreAct, T5.PrdPreMed, T3.ForPrdDsc, TM1.PrdComID, T5.PrdLote, TM1.CumUMed, TM1.CumLotAlm, TM1.EmprCod, TM1.PrdNum, TM1.ForPrdUMe, TM1.CumCodCont, T5.ValCod, T4.CcoCod FROM ((((TXPLCUMCO TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) INNER JOIN TXPUNMEPR T3 ON T3.EmprCod = TM1.EmprCod AND T3.ForPrdUMe = TM1.ForPrdUMe) INNER JOIN TXPCCUMCO T4 ON T4.EmprCod = TM1.EmprCod AND T4.CumCodCont = TM1.CumCodCont) INNER JOIN TXPPRODUC T5 ON T5.EmprCod = TM1.EmprCod AND T5.PrdNum = TM1.PrdNum) WHERE TM1.EmprCod = ? and TM1.CumCodCont = ? and TM1.PrdNum = ? ORDER BY TM1.EmprCod, TM1.CumCodCont, TM1.PrdNum ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TA10", "SELECT ForPrdDsc FROM TXPUNMEPR WHERE EmprCod = ? AND ForPrdUMe = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TA11", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, CumCodCont, PrdNum FROM TXPLCUMCO WHERE EmprCod = ? AND CumCodCont = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TA12", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, CumCodCont, PrdNum FROM TXPLCUMCO WHERE ( CumCodCont > ? or CumCodCont = ? and PrdNum > ?) and EmprCod = ? ORDER BY EmprCod, CumCodCont, PrdNum) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01TA13", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, CumCodCont, PrdNum FROM TXPLCUMCO WHERE ( CumCodCont < ? or CumCodCont = ? and PrdNum < ?) and EmprCod = ? ORDER BY EmprCod DESC, CumCodCont DESC, PrdNum DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01TA14", "SELECT PrdExiAlm, PrdValStk, PrdNom, PrdFacCon, PrdExiCC, PrdCanRes, PrdPreAct, PrdPreMed, PrdLote, ValCod FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ?  FOR UPDATE OF PrdExiAlm, PrdValStk NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01TA15", "INSERT INTO TXPLCUMCO(CumConCbis, CumConCant, CumUnidad, CumConLot, PrdComID, CumUMed, CumLotAlm, EmprCod, PrdNum, ForPrdUMe, CumCodCont) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPLCUMCO")
         ,new UpdateCursor("T01TA16", "UPDATE TXPLCUMCO SET CumConCbis=?, CumConCant=?, CumUnidad=?, CumConLot=?, PrdComID=?, CumUMed=?, CumLotAlm=?, ForPrdUMe=?  WHERE EmprCod = ? AND CumCodCont = ? AND PrdNum = ?", GX_NOMASK, "TXPLCUMCO")
         ,new UpdateCursor("T01TA17", "DELETE FROM TXPLCUMCO  WHERE EmprCod = ? AND CumCodCont = ? AND PrdNum = ?", GX_NOMASK, "TXPLCUMCO")
         ,new ForEachCursor("T01TA18", "SELECT PrdExiAlm, PrdValStk, PrdNom, PrdFacCon, PrdExiCC, PrdCanRes, PrdPreAct, PrdPreMed, PrdLote, ValCod FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TA19", "SELECT ForPrdDsc FROM TXPUNMEPR WHERE EmprCod = ? AND ForPrdUMe = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01TA20", "UPDATE TXPPRODUC SET PrdExiAlm=?, PrdValStk=?  WHERE EmprCod = ? AND PrdNum = ?", GX_NOMASK, "TXPPRODUC")
         ,new ForEachCursor("T01TA21", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, CumCodCont, PrdNum FROM TXPLCUMCO WHERE EmprCod = ? ORDER BY EmprCod, CumCodCont, PrdNum ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,4);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,4);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 26);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 3);
               ((String[]) buf[8])[0] = rslt.getString(9, 6);
               ((byte[]) buf[9])[0] = rslt.getByte(10);
               ((int[]) buf[10])[0] = rslt.getInt(11);
               return;
            case 1 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,4);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,4);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 26);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 3);
               ((String[]) buf[8])[0] = rslt.getString(9, 6);
               ((byte[]) buf[9])[0] = rslt.getByte(10);
               ((int[]) buf[10])[0] = rslt.getInt(11);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((byte[]) buf[2])[0] = rslt.getByte(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 3 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,4);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((String[]) buf[2])[0] = rslt.getString(3, 26);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,4);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,4);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,5);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,5);
               ((String[]) buf[8])[0] = rslt.getString(9, 26);
               ((byte[]) buf[9])[0] = rslt.getByte(10);
               return;
            case 4 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,4);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((String[]) buf[2])[0] = rslt.getString(3, 26);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,4);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,4);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,5);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,5);
               ((String[]) buf[8])[0] = rslt.getString(9, 26);
               ((byte[]) buf[9])[0] = rslt.getByte(10);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 5);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 6 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               return;
            case 7 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,4);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,4);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((byte[]) buf[5])[0] = rslt.getByte(5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((byte[]) buf[7])[0] = rslt.getByte(6);
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDate(7);
               ((short[]) buf[9])[0] = rslt.getShort(8);
               ((byte[]) buf[10])[0] = rslt.getByte(9);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(10, 26);
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(11,4);
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(12,4);
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(13,4);
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(14,4);
               ((byte[]) buf[17])[0] = rslt.getByte(15);
               ((String[]) buf[18])[0] = rslt.getString(16, 26);
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(17,5);
               ((java.math.BigDecimal[]) buf[20])[0] = rslt.getBigDecimal(18,5);
               ((String[]) buf[21])[0] = rslt.getString(19, 5);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(20, 6);
               ((String[]) buf[24])[0] = rslt.getString(21, 26);
               ((byte[]) buf[25])[0] = rslt.getByte(22);
               ((short[]) buf[26])[0] = rslt.getShort(23);
               ((String[]) buf[27])[0] = rslt.getString(24, 3);
               ((String[]) buf[28])[0] = rslt.getString(25, 6);
               ((byte[]) buf[29])[0] = rslt.getByte(26);
               ((int[]) buf[30])[0] = rslt.getInt(27);
               ((byte[]) buf[31])[0] = rslt.getByte(28);
               ((short[]) buf[32])[0] = rslt.getShort(29);
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 5);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 12 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,4);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((String[]) buf[2])[0] = rslt.getString(3, 26);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,4);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,4);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,5);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,5);
               ((String[]) buf[8])[0] = rslt.getString(9, 26);
               ((byte[]) buf[9])[0] = rslt.getByte(10);
               return;
            case 16 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,4);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((String[]) buf[2])[0] = rslt.getString(3, 26);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,4);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,4);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,5);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,5);
               ((String[]) buf[8])[0] = rslt.getString(9, 26);
               ((byte[]) buf[9])[0] = rslt.getByte(10);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 5);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 6);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 6);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 6);
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 6);
               return;
            case 10 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 6);
               stmt.setString(4, (String)parms[3], 3);
               return;
            case 11 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 6);
               stmt.setString(4, (String)parms[3], 3);
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 13 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 4);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 4);
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 26);
               stmt.setString(5, (String)parms[4], 6);
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               stmt.setString(8, (String)parms[7], 3);
               stmt.setString(9, (String)parms[8], 6);
               stmt.setByte(10, ((Number) parms[9]).byteValue());
               stmt.setInt(11, ((Number) parms[10]).intValue());
               return;
            case 14 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 4);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 4);
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 26);
               stmt.setString(5, (String)parms[4], 6);
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               stmt.setByte(8, ((Number) parms[7]).byteValue());
               stmt.setString(9, (String)parms[8], 3);
               stmt.setInt(10, ((Number) parms[9]).intValue());
               stmt.setString(11, (String)parms[10], 6);
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 6);
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               return;
            case 18 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 4);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 2);
               stmt.setString(3, (String)parms[2], 3);
               stmt.setString(4, (String)parms[3], 6);
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               return;
      }
   }

}

