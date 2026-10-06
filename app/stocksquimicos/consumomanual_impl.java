package app.stocksquimicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class consumomanual_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action25") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A859CumCodCont = (int)(GXutil.lval( httpContext.GetPar( "CumCodCont"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A859CumCodCont", GXutil.ltrimstr( DecimalUtil.doubleToDec(A859CumCodCont), 8, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_25_1SF111( A396EmprCod, A859CumCodCont) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action50") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A719PrdNum = httpContext.GetPar( "PrdNum") ;
         A862CumConFec = localUtil.parseDateParm( httpContext.GetPar( "CumConFec")) ;
         httpContext.ajax_rsp_assign_attri("", false, "A862CumConFec", localUtil.format(A862CumConFec, "99/99/99"));
         A861CumConCbis = CommonUtil.decimalVal( httpContext.GetPar( "CumConCbis"), ".") ;
         A726PrdPreMed = CommonUtil.decimalVal( httpContext.GetPar( "PrdPreMed"), ".") ;
         AV30FlagPreMed = (short)(GXutil.lval( httpContext.GetPar( "FlagPreMed"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV30FlagPreMed", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV30FlagPreMed), 4, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_50_1SF112( A396EmprCod, A719PrdNum, A862CumConFec, A861CumConCbis, A726PrdPreMed, AV30FlagPreMed) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action51") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A719PrdNum = httpContext.GetPar( "PrdNum") ;
         A862CumConFec = localUtil.parseDateParm( httpContext.GetPar( "CumConFec")) ;
         httpContext.ajax_rsp_assign_attri("", false, "A862CumConFec", localUtil.format(A862CumConFec, "99/99/99"));
         A861CumConCbis = CommonUtil.decimalVal( httpContext.GetPar( "CumConCbis"), ".") ;
         A724PrdPreAct = CommonUtil.decimalVal( httpContext.GetPar( "PrdPreAct"), ".") ;
         AV30FlagPreMed = (short)(GXutil.lval( httpContext.GetPar( "FlagPreMed"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV30FlagPreMed", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV30FlagPreMed), 4, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_51_1SF112( A396EmprCod, A719PrdNum, A862CumConFec, A861CumConCbis, A724PrdPreAct, AV30FlagPreMed) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action52") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A719PrdNum = httpContext.GetPar( "PrdNum") ;
         AV29Year = (short)(GXutil.lval( httpContext.GetPar( "Year"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV29Year", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29Year), 4, 0));
         AV28Mes = (short)(GXutil.lval( httpContext.GetPar( "Mes"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV28Mes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV28Mes), 4, 0));
         A861CumConCbis = CommonUtil.decimalVal( httpContext.GetPar( "CumConCbis"), ".") ;
         AV27CumConOld = CommonUtil.decimalVal( httpContext.GetPar( "CumConOld"), ".") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV27CumConOld", GXutil.ltrimstr( AV27CumConOld, 12, 4));
         A726PrdPreMed = CommonUtil.decimalVal( httpContext.GetPar( "PrdPreMed"), ".") ;
         A862CumConFec = localUtil.parseDateParm( httpContext.GetPar( "CumConFec")) ;
         httpContext.ajax_rsp_assign_attri("", false, "A862CumConFec", localUtil.format(A862CumConFec, "99/99/99"));
         A860CumConCant = CommonUtil.decimalVal( httpContext.GetPar( "CumConCant"), ".") ;
         AV30FlagPreMed = (short)(GXutil.lval( httpContext.GetPar( "FlagPreMed"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV30FlagPreMed", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV30FlagPreMed), 4, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_52_1SF112( A396EmprCod, A719PrdNum, AV29Year, AV28Mes, A861CumConCbis, AV27CumConOld, A726PrdPreMed, A862CumConFec, A860CumConCant, AV30FlagPreMed) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action53") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A719PrdNum = httpContext.GetPar( "PrdNum") ;
         AV29Year = (short)(GXutil.lval( httpContext.GetPar( "Year"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV29Year", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29Year), 4, 0));
         AV28Mes = (short)(GXutil.lval( httpContext.GetPar( "Mes"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV28Mes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV28Mes), 4, 0));
         A861CumConCbis = CommonUtil.decimalVal( httpContext.GetPar( "CumConCbis"), ".") ;
         AV27CumConOld = CommonUtil.decimalVal( httpContext.GetPar( "CumConOld"), ".") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV27CumConOld", GXutil.ltrimstr( AV27CumConOld, 12, 4));
         A724PrdPreAct = CommonUtil.decimalVal( httpContext.GetPar( "PrdPreAct"), ".") ;
         A862CumConFec = localUtil.parseDateParm( httpContext.GetPar( "CumConFec")) ;
         httpContext.ajax_rsp_assign_attri("", false, "A862CumConFec", localUtil.format(A862CumConFec, "99/99/99"));
         A860CumConCant = CommonUtil.decimalVal( httpContext.GetPar( "CumConCant"), ".") ;
         AV30FlagPreMed = (short)(GXutil.lval( httpContext.GetPar( "FlagPreMed"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV30FlagPreMed", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV30FlagPreMed), 4, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_53_1SF112( A396EmprCod, A719PrdNum, AV29Year, AV28Mes, A861CumConCbis, AV27CumConOld, A724PrdPreAct, A862CumConFec, A860CumConCant, AV30FlagPreMed) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action54") == 0 )
      {
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_54_1SF112( ) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action55") == 0 )
      {
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_55_1SF112( ) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action56") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A719PrdNum = httpContext.GetPar( "PrdNum") ;
         A859CumCodCont = (int)(GXutil.lval( httpContext.GetPar( "CumCodCont"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A859CumCodCont", GXutil.ltrimstr( DecimalUtil.doubleToDec(A859CumCodCont), 8, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_56_1SF112( A396EmprCod, A719PrdNum, A859CumCodCont) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action57") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A719PrdNum = httpContext.GetPar( "PrdNum") ;
         A5862CumConLot = httpContext.GetPar( "CumConLot") ;
         AV25Moda21 = (short)(GXutil.lval( httpContext.GetPar( "Moda21"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV25Moda21", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV25Moda21), 4, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_57_1SF112( A396EmprCod, A719PrdNum, A5862CumConLot, AV25Moda21) ;
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
         gx3asacc_almdc1SF111( A396EmprCod, A8925CC_AlmCd) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel4"+"_"+"CUMCCOSD") == 0 )
      {
         A10777CumCCos = (short)(GXutil.lval( httpContext.GetPar( "CumCCos"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A10777CumCCos", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10777CumCCos), 3, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx4asacumccosd1SF111( A10777CumCCos) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel9"+"_"+"") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxasa7051SF111( A396EmprCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel10"+"_"+"") == 0 )
      {
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel11"+"_"+"") == 0 )
      {
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel12"+"_"+"") == 0 )
      {
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel26"+"_"+"ULTFECCCS") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A719PrdNum = httpContext.GetPar( "PrdNum") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx26asaultfecccs1SF112( A396EmprCod, A719PrdNum) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_61") == 0 )
      {
         A3839CcoCod = (short)(GXutil.lval( httpContext.GetPar( "CcoCod"))) ;
         n3839CcoCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A3839CcoCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3839CcoCod), 3, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_61( A3839CcoCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_63") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A719PrdNum = httpContext.GetPar( "PrdNum") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_63( A396EmprCod, A719PrdNum) ;
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Gridlevel_producto") == 0 )
      {
         gxnrgridlevel_producto_newrow_invoke( ) ;
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
         Gx_mode = gxfirstwebparm ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
         {
            AV10EmprCod = httpContext.GetPar( "EmprCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV10EmprCod", AV10EmprCod);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV10EmprCod, "@!"))));
            AV11CumCodCont = (int)(GXutil.lval( httpContext.GetPar( "CumCodCont"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV11CumCodCont", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV11CumCodCont), 8, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCUMCODCONT", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV11CumCodCont), "ZZZZZZZ9")));
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Consumo Manual", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtCumCodCont_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      wbErr = false ;
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public void gxnrgridlevel_producto_newrow_invoke( )
   {
      nRC_GXsfl_59 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_59"))) ;
      nGXsfl_59_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_59_idx"))) ;
      sGXsfl_59_idx = httpContext.GetPar( "sGXsfl_59_idx") ;
      AV23ConMan = (short)(GXutil.lval( httpContext.GetPar( "ConMan"))) ;
      Gx_BScreen = (byte)(GXutil.lval( httpContext.GetPar( "Gx_BScreen"))) ;
      A396EmprCod = httpContext.GetPar( "EmprCod") ;
      Gx_mode = httpContext.GetPar( "Mode") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxnrgridlevel_producto_newrow( ) ;
      /* End function gxnrGridlevel_producto_newrow_invoke */
   }

   public consumomanual_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public consumomanual_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( consumomanual_impl.class ));
   }

   public consumomanual_impl( int remoteHandle ,
                              ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbCumUnidad = new HTMLChoice();
      cmbCumUMed = new HTMLChoice();
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
      app.GxWebStd.gx_div_start( httpContext, divTablecontent_Internalname, 1, 0, "px", 0, "px", "TableContent", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
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
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable1_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCumCodCont_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtCumCodCont_Internalname, httpContext.getMessage( "Nº Documento", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCumCodCont_Internalname, GXutil.ltrim( localUtil.ntoc( A859CumCodCont, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A859CumCodCont), "ZZZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,25);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCumCodCont_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtCumCodCont_Enabled, 1, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_StocksQuimicos\\ConsumoManual.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCumConFec_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtCumConFec_Internalname, httpContext.getMessage( "Fecha ", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 29,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtCumConFec_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCumConFec_Internalname, localUtil.format(A862CumConFec, "99/99/99"), localUtil.format( A862CumConFec, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,29);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCumConFec_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtCumConFec_Enabled, 1, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_StocksQuimicos\\ConsumoManual.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtCumConFec_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtCumConFec_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_StocksQuimicos\\ConsumoManual.htm");
      httpContext.writeTextNL( "</div>") ;
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell DscTop ExtendedComboCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divTablesplittedcumccos_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockcumccos_Internalname, httpContext.getMessage( "Centro Coste", ""), "", "", lblTextblockcumccos_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_StocksQuimicos\\ConsumoManual.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* User Defined Control */
      ucCombo_cumccos.setProperty("Caption", Combo_cumccos_Caption);
      ucCombo_cumccos.setProperty("Cls", Combo_cumccos_Cls);
      ucCombo_cumccos.setProperty("DropDownOptionsData", AV17CumCCos_Data);
      ucCombo_cumccos.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_cumccos_Internalname, "COMBO_CUMCCOSContainer");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 Invisible", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtCumCCos_Internalname, httpContext.getMessage( "Centro Coste", ""), "col-sm-3 AttributeLabel", 0, true, "");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 39,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCumCCos_Internalname, GXutil.ltrim( localUtil.ntoc( A10777CumCCos, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCumCCos_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A10777CumCCos), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A10777CumCCos), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,39);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCumCCos_Jsonclick, 0, "Attribute", "", "", "", "", edtCumCCos_Visible, edtCumCCos_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_StocksQuimicos\\ConsumoManual.htm");
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
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable2_Internalname, divUnnamedtable2_Visible, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divCombo_cc_almcd_cell_Internalname, 1, 0, "px", 0, "px", divCombo_cc_almcd_cell_Class, "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divTablesplittedcc_almcd_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockcc_almcd_Internalname, httpContext.getMessage( "Almacen", ""), "", "", lblTextblockcc_almcd_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_StocksQuimicos\\ConsumoManual.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* User Defined Control */
      ucCombo_cc_almcd.setProperty("Caption", Combo_cc_almcd_Caption);
      ucCombo_cc_almcd.setProperty("Cls", Combo_cc_almcd_Cls);
      ucCombo_cc_almcd.setProperty("DropDownOptionsData", AV20CC_AlmCd_Data);
      ucCombo_cc_almcd.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_cc_almcd_Internalname, "COMBO_CC_ALMCDContainer");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 Invisible", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtCC_AlmCd_Internalname, httpContext.getMessage( "Almacen", ""), "col-sm-3 AttributeLabel", 0, true, "");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 53,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCC_AlmCd_Internalname, GXutil.ltrim( localUtil.ntoc( A8925CC_AlmCd, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCC_AlmCd_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A8925CC_AlmCd), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A8925CC_AlmCd), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,53);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCC_AlmCd_Jsonclick, 0, "Attribute", "", "", "", "", edtCC_AlmCd_Visible, edtCC_AlmCd_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_StocksQuimicos\\ConsumoManual.htm");
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
      httpContext.writeText( "</div>") ;
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
      app.GxWebStd.gx_div_start( httpContext, divTableleaflevel_producto_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 SectionGrid EditableGridCell_LinedAtts", "left", "top", "", "", "div");
      gxdraw_gridlevel_producto( ) ;
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 86,'',false,'',0)\"" ;
      ClassString = "ButtonMaterial" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtntrn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtntrn_enter_Visible, bttBtntrn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_StocksQuimicos\\ConsumoManual.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 88,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtntrn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtntrn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_StocksQuimicos\\ConsumoManual.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 90,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtntrn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtntrn_delete_Visible, bttBtntrn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_StocksQuimicos\\ConsumoManual.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV36Pgmname), GXutil.rtrim( localUtil.format( AV36Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_StocksQuimicos\\ConsumoManual.htm");
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
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divSectionattribute_cumccos_Internalname, 1, 0, "px", 0, "px", "Section", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtavCombocumccos_Internalname, GXutil.ltrim( localUtil.ntoc( AV19ComboCumCCos, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavCombocumccos_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV19ComboCumCCos), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV19ComboCumCCos), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCombocumccos_Jsonclick, 0, "Attribute", "", "", "", "", edtavCombocumccos_Visible, edtavCombocumccos_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_StocksQuimicos\\ConsumoManual.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divSectionattribute_cc_almcd_Internalname, 1, 0, "px", 0, "px", "Section", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtavCombocc_almcd_Internalname, GXutil.ltrim( localUtil.ntoc( AV21ComboCC_AlmCd, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavCombocc_almcd_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV21ComboCC_AlmCd), "Z9") : localUtil.format( DecimalUtil.doubleToDec(AV21ComboCC_AlmCd), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCombocc_almcd_Jsonclick, 0, "Attribute", "", "", "", "", edtavCombocc_almcd_Visible, edtavCombocc_almcd_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_StocksQuimicos\\ConsumoManual.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* User Defined Control */
      ucCombo_prdnum.setProperty("Caption", Combo_prdnum_Caption);
      ucCombo_prdnum.setProperty("Cls", Combo_prdnum_Cls);
      ucCombo_prdnum.setProperty("IsGridItem", Combo_prdnum_Isgriditem);
      ucCombo_prdnum.setProperty("EmptyItem", Combo_prdnum_Emptyitem);
      ucCombo_prdnum.setProperty("DropDownOptionsData", AV24PrdNum_Data);
      ucCombo_prdnum.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_prdnum_Internalname, "COMBO_PRDNUMContainer");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmpNumDec_Internalname, GXutil.ltrim( localUtil.ntoc( A3915EmpNumDec, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtEmpNumDec_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A3915EmpNumDec), "9") : localUtil.format( DecimalUtil.doubleToDec(A3915EmpNumDec), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmpNumDec_Jsonclick, 0, "Attribute", "", "", "", "", edtEmpNumDec_Visible, edtEmpNumDec_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_StocksQuimicos\\ConsumoManual.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
   }

   public void gxdraw_gridlevel_producto( )
   {
      /*  Grid Control  */
      startgridcontrol59( ) ;
      nGXsfl_59_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount112 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_112 = (short)(1) ;
            scanStart1SF112( ) ;
            while ( RcdFound112 != 0 )
            {
               init_level_properties112( ) ;
               getByPrimaryKey1SF112( ) ;
               addRow1SF112( ) ;
               scanNext1SF112( ) ;
            }
            scanEnd1SF112( ) ;
            nBlankRcdCount112 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModal1SF112( ) ;
         standaloneModal1SF112( ) ;
         sMode112 = Gx_mode ;
         while ( nGXsfl_59_idx < nRC_GXsfl_59 )
         {
            bGXsfl_59_Refreshing = true ;
            readRow1SF112( ) ;
            edtPrdNum_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRDNUM_"+sGXsfl_59_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPrdNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNum_Enabled), 5, 0), !bGXsfl_59_Refreshing);
            edtPrdNom_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRDNOM_"+sGXsfl_59_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPrdNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNom_Enabled), 5, 0), !bGXsfl_59_Refreshing);
            edtPrdFacCon_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRDFACCON_"+sGXsfl_59_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPrdFacCon_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdFacCon_Enabled), 5, 0), !bGXsfl_59_Refreshing);
            edtPrdExiAlm_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRDEXIALM_"+sGXsfl_59_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPrdExiAlm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdExiAlm_Enabled), 5, 0), !bGXsfl_59_Refreshing);
            edtPrdExiCC_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRDEXICC_"+sGXsfl_59_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPrdExiCC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdExiCC_Enabled), 5, 0), !bGXsfl_59_Refreshing);
            edtPrdExiCC_Visible = (int)(localUtil.ctol( httpContext.cgiGet( "PRDEXICC_"+sGXsfl_59_idx+"Visible"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPrdExiCC_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdExiCC_Visible), 5, 0), !bGXsfl_59_Refreshing);
            edtPrdCanRes_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRDCANRES_"+sGXsfl_59_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPrdCanRes_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdCanRes_Enabled), 5, 0), !bGXsfl_59_Refreshing);
            edtCumConCant_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CUMCONCANT_"+sGXsfl_59_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtCumConCant_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCumConCant_Enabled), 5, 0), !bGXsfl_59_Refreshing);
            cmbCumUnidad.setEnabled( (int)(localUtil.ctol( httpContext.cgiGet( "CUMUNIDAD_"+sGXsfl_59_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) );
            httpContext.ajax_rsp_assign_prop("", false, cmbCumUnidad.getInternalname(), "Enabled", GXutil.ltrimstr( cmbCumUnidad.getEnabled(), 5, 0), !bGXsfl_59_Refreshing);
            edtCumConLot_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CUMCONLOT_"+sGXsfl_59_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtCumConLot_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCumConLot_Enabled), 5, 0), !bGXsfl_59_Refreshing);
            edtCumConCbis_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CUMCONCBIS_"+sGXsfl_59_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtCumConCbis_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCumConCbis_Enabled), 5, 0), !bGXsfl_59_Refreshing);
            edtCumCosPro_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CUMCOSPRO_"+sGXsfl_59_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtCumCosPro_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCumCosPro_Enabled), 5, 0), !bGXsfl_59_Refreshing);
            edtPrdPreAct_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRDPREACT_"+sGXsfl_59_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPrdPreAct_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdPreAct_Enabled), 5, 0), !bGXsfl_59_Refreshing);
            edtPrdPreMed_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRDPREMED_"+sGXsfl_59_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPrdPreMed_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdPreMed_Enabled), 5, 0), !bGXsfl_59_Refreshing);
            edtUltFecCCs_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ULTFECCCS_"+sGXsfl_59_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtUltFecCCs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtUltFecCCs_Enabled), 5, 0), !bGXsfl_59_Refreshing);
            edtPrdValStk_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRDVALSTK_"+sGXsfl_59_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPrdValStk_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdValStk_Enabled), 5, 0), !bGXsfl_59_Refreshing);
            edtForPrdUMe_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FORPRDUME_"+sGXsfl_59_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtForPrdUMe_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForPrdUMe_Enabled), 5, 0), !bGXsfl_59_Refreshing);
            edtForPrdDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FORPRDDSC_"+sGXsfl_59_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtForPrdDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForPrdDsc_Enabled), 5, 0), !bGXsfl_59_Refreshing);
            edtPrdComID_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRDCOMID_"+sGXsfl_59_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPrdComID_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdComID_Enabled), 5, 0), !bGXsfl_59_Refreshing);
            edtPrdLote_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRDLOTE_"+sGXsfl_59_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPrdLote_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdLote_Enabled), 5, 0), !bGXsfl_59_Refreshing);
            cmbCumUMed.setEnabled( (int)(localUtil.ctol( httpContext.cgiGet( "CUMUMED_"+sGXsfl_59_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) );
            httpContext.ajax_rsp_assign_prop("", false, cmbCumUMed.getInternalname(), "Enabled", GXutil.ltrimstr( cmbCumUMed.getEnabled(), 5, 0), !bGXsfl_59_Refreshing);
            edtCumLotAlm_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CUMLOTALM_"+sGXsfl_59_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtCumLotAlm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCumLotAlm_Enabled), 5, 0), !bGXsfl_59_Refreshing);
            edtValCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "VALCOD_"+sGXsfl_59_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtValCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtValCod_Enabled), 5, 0), !bGXsfl_59_Refreshing);
            if ( ( nRcdExists_112 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal1SF112( ) ;
            }
            sendRow1SF112( ) ;
            bGXsfl_59_Refreshing = false ;
         }
         Gx_mode = sMode112 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount112 = (short)(5) ;
         nRcdExists_112 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart1SF112( ) ;
            while ( RcdFound112 != 0 )
            {
               sGXsfl_59_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_59_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_59112( ) ;
               init_level_properties112( ) ;
               standaloneNotModal1SF112( ) ;
               getByPrimaryKey1SF112( ) ;
               standaloneModal1SF112( ) ;
               addRow1SF112( ) ;
               scanNext1SF112( ) ;
            }
            scanEnd1SF112( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      if ( ! isDsp( ) && ! isDlt( ) )
      {
         sMode112 = Gx_mode ;
         Gx_mode = "INS" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         sGXsfl_59_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_59_idx+1), 4, 0), (short)(4), "0") ;
         subsflControlProps_59112( ) ;
         initAll1SF112( ) ;
         init_level_properties112( ) ;
         nRcdExists_112 = (short)(0) ;
         nIsMod_112 = (short)(0) ;
         nRcdDeleted_112 = (short)(0) ;
         nBlankRcdCount112 = (short)(nBlankRcdUsr112+nBlankRcdCount112) ;
         fRowAdded = 0 ;
         while ( nBlankRcdCount112 > 0 )
         {
            standaloneNotModal1SF112( ) ;
            standaloneModal1SF112( ) ;
            addRow1SF112( ) ;
            if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
            {
               fRowAdded = 1 ;
               GX_FocusControl = edtPrdNum_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            nBlankRcdCount112 = (short)(nBlankRcdCount112-1) ;
         }
         Gx_mode = sMode112 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      sStyleString = "" ;
      httpContext.writeText( "<div id=\""+"Gridlevel_productoContainer"+"Div\" "+sStyleString+">"+"</div>") ;
      httpContext.ajax_rsp_assign_grid("_"+"Gridlevel_producto", Gridlevel_productoContainer, subGridlevel_producto_Internalname);
      if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Gridlevel_productoContainerData", Gridlevel_productoContainer.ToJavascriptSource());
      }
      if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Gridlevel_productoContainerData"+"V", Gridlevel_productoContainer.GridValuesHidden());
      }
      else
      {
         httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"Gridlevel_productoContainerData"+"V"+"\" value='"+Gridlevel_productoContainer.GridValuesHidden()+"'/>") ;
      }
   }

   public void userMain( )
   {
      standaloneStartup( ) ;
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
      e111SF2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vCUMCCOS_DATA"), AV17CumCCos_Data);
            httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vCC_ALMCD_DATA"), AV20CC_AlmCd_Data);
            httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vPRDNUM_DATA"), AV24PrdNum_Data);
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z859CumCodCont = (int)(localUtil.ctol( httpContext.cgiGet( "Z859CumCodCont"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z8925CC_AlmCd = (byte)(localUtil.ctol( httpContext.cgiGet( "Z8925CC_AlmCd"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z10777CumCCos = (short)(localUtil.ctol( httpContext.cgiGet( "Z10777CumCCos"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z11368CumConTipo = (byte)(localUtil.ctol( httpContext.cgiGet( "Z11368CumConTipo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z862CumConFec = localUtil.ctod( httpContext.cgiGet( "Z862CumConFec"), 0) ;
            Z3839CcoCod = (short)(localUtil.ctol( httpContext.cgiGet( "Z3839CcoCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A11368CumConTipo = (byte)(localUtil.ctol( httpContext.cgiGet( "Z11368CumConTipo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A3839CcoCod = (short)(localUtil.ctol( httpContext.cgiGet( "Z3839CcoCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n3839CcoCod = false ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_59 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_59"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            N3839CcoCod = (short)(localUtil.ctol( httpContext.cgiGet( "N3839CcoCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A396EmprCod = httpContext.cgiGet( "EMPRCOD") ;
            A8926CC_AlmDc = httpContext.cgiGet( "CC_ALMDC") ;
            A10778CumCCosD = httpContext.cgiGet( "CUMCCOSD") ;
            AV10EmprCod = httpContext.cgiGet( "vEMPRCOD") ;
            AV11CumCodCont = (int)(localUtil.ctol( httpContext.cgiGet( "vCUMCODCONT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV15Insert_CcoCod = (short)(localUtil.ctol( httpContext.cgiGet( "vINSERT_CCOCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A3839CcoCod = (short)(localUtil.ctol( httpContext.cgiGet( "CCOCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV28Mes = (short)(localUtil.ctol( httpContext.cgiGet( "vMES"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV29Year = (short)(localUtil.ctol( httpContext.cgiGet( "vYEAR"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_BScreen = (byte)(localUtil.ctol( httpContext.cgiGet( "vGXBSCREEN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A11368CumConTipo = (byte)(localUtil.ctol( httpContext.cgiGet( "CUMCONTIPO"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A407EmprNom = httpContext.cgiGet( "EMPRNOM") ;
            n407EmprNom = false ;
            AV23ConMan = (short)(localUtil.ctol( httpContext.cgiGet( "vCONMAN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV27CumConOld = localUtil.ctond( httpContext.cgiGet( "vCUMCONOLD")) ;
            AV34CumConCbis = localUtil.ctond( httpContext.cgiGet( "vCUMCONCBIS")) ;
            AV30FlagPreMed = (short)(localUtil.ctol( httpContext.cgiGet( "vFLAGPREMED"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV31Precio_stk = (short)(localUtil.ctol( httpContext.cgiGet( "vPRECIO_STK"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV9UsurCod = httpContext.cgiGet( "vUSURCOD") ;
            AV25Moda21 = (short)(localUtil.ctol( httpContext.cgiGet( "vMODA21"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV26Ok = httpContext.cgiGet( "vOK") ;
            Combo_cumccos_Objectcall = httpContext.cgiGet( "COMBO_CUMCCOS_Objectcall") ;
            Combo_cumccos_Class = httpContext.cgiGet( "COMBO_CUMCCOS_Class") ;
            Combo_cumccos_Icontype = httpContext.cgiGet( "COMBO_CUMCCOS_Icontype") ;
            Combo_cumccos_Icon = httpContext.cgiGet( "COMBO_CUMCCOS_Icon") ;
            Combo_cumccos_Caption = httpContext.cgiGet( "COMBO_CUMCCOS_Caption") ;
            Combo_cumccos_Tooltip = httpContext.cgiGet( "COMBO_CUMCCOS_Tooltip") ;
            Combo_cumccos_Cls = httpContext.cgiGet( "COMBO_CUMCCOS_Cls") ;
            Combo_cumccos_Selectedvalue_set = httpContext.cgiGet( "COMBO_CUMCCOS_Selectedvalue_set") ;
            Combo_cumccos_Selectedvalue_get = httpContext.cgiGet( "COMBO_CUMCCOS_Selectedvalue_get") ;
            Combo_cumccos_Selectedtext_set = httpContext.cgiGet( "COMBO_CUMCCOS_Selectedtext_set") ;
            Combo_cumccos_Selectedtext_get = httpContext.cgiGet( "COMBO_CUMCCOS_Selectedtext_get") ;
            Combo_cumccos_Gamoauthtoken = httpContext.cgiGet( "COMBO_CUMCCOS_Gamoauthtoken") ;
            Combo_cumccos_Ddointernalname = httpContext.cgiGet( "COMBO_CUMCCOS_Ddointernalname") ;
            Combo_cumccos_Titlecontrolalign = httpContext.cgiGet( "COMBO_CUMCCOS_Titlecontrolalign") ;
            Combo_cumccos_Dropdownoptionstype = httpContext.cgiGet( "COMBO_CUMCCOS_Dropdownoptionstype") ;
            Combo_cumccos_Enabled = GXutil.strtobool( httpContext.cgiGet( "COMBO_CUMCCOS_Enabled")) ;
            Combo_cumccos_Visible = GXutil.strtobool( httpContext.cgiGet( "COMBO_CUMCCOS_Visible")) ;
            Combo_cumccos_Titlecontrolidtoreplace = httpContext.cgiGet( "COMBO_CUMCCOS_Titlecontrolidtoreplace") ;
            Combo_cumccos_Datalisttype = httpContext.cgiGet( "COMBO_CUMCCOS_Datalisttype") ;
            Combo_cumccos_Allowmultipleselection = GXutil.strtobool( httpContext.cgiGet( "COMBO_CUMCCOS_Allowmultipleselection")) ;
            Combo_cumccos_Datalistfixedvalues = httpContext.cgiGet( "COMBO_CUMCCOS_Datalistfixedvalues") ;
            Combo_cumccos_Isgriditem = GXutil.strtobool( httpContext.cgiGet( "COMBO_CUMCCOS_Isgriditem")) ;
            Combo_cumccos_Hasdescription = GXutil.strtobool( httpContext.cgiGet( "COMBO_CUMCCOS_Hasdescription")) ;
            Combo_cumccos_Datalistproc = httpContext.cgiGet( "COMBO_CUMCCOS_Datalistproc") ;
            Combo_cumccos_Datalistprocparametersprefix = httpContext.cgiGet( "COMBO_CUMCCOS_Datalistprocparametersprefix") ;
            Combo_cumccos_Remoteservicesparameters = httpContext.cgiGet( "COMBO_CUMCCOS_Remoteservicesparameters") ;
            Combo_cumccos_Datalistupdateminimumcharacters = (int)(localUtil.ctol( httpContext.cgiGet( "COMBO_CUMCCOS_Datalistupdateminimumcharacters"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Combo_cumccos_Includeonlyselectedoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_CUMCCOS_Includeonlyselectedoption")) ;
            Combo_cumccos_Includeselectalloption = GXutil.strtobool( httpContext.cgiGet( "COMBO_CUMCCOS_Includeselectalloption")) ;
            Combo_cumccos_Emptyitem = GXutil.strtobool( httpContext.cgiGet( "COMBO_CUMCCOS_Emptyitem")) ;
            Combo_cumccos_Includeaddnewoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_CUMCCOS_Includeaddnewoption")) ;
            Combo_cumccos_Htmltemplate = httpContext.cgiGet( "COMBO_CUMCCOS_Htmltemplate") ;
            Combo_cumccos_Multiplevaluestype = httpContext.cgiGet( "COMBO_CUMCCOS_Multiplevaluestype") ;
            Combo_cumccos_Loadingdata = httpContext.cgiGet( "COMBO_CUMCCOS_Loadingdata") ;
            Combo_cumccos_Noresultsfound = httpContext.cgiGet( "COMBO_CUMCCOS_Noresultsfound") ;
            Combo_cumccos_Emptyitemtext = httpContext.cgiGet( "COMBO_CUMCCOS_Emptyitemtext") ;
            Combo_cumccos_Onlyselectedvalues = httpContext.cgiGet( "COMBO_CUMCCOS_Onlyselectedvalues") ;
            Combo_cumccos_Selectalltext = httpContext.cgiGet( "COMBO_CUMCCOS_Selectalltext") ;
            Combo_cumccos_Multiplevaluesseparator = httpContext.cgiGet( "COMBO_CUMCCOS_Multiplevaluesseparator") ;
            Combo_cumccos_Addnewoptiontext = httpContext.cgiGet( "COMBO_CUMCCOS_Addnewoptiontext") ;
            Combo_cc_almcd_Objectcall = httpContext.cgiGet( "COMBO_CC_ALMCD_Objectcall") ;
            Combo_cc_almcd_Class = httpContext.cgiGet( "COMBO_CC_ALMCD_Class") ;
            Combo_cc_almcd_Icontype = httpContext.cgiGet( "COMBO_CC_ALMCD_Icontype") ;
            Combo_cc_almcd_Icon = httpContext.cgiGet( "COMBO_CC_ALMCD_Icon") ;
            Combo_cc_almcd_Caption = httpContext.cgiGet( "COMBO_CC_ALMCD_Caption") ;
            Combo_cc_almcd_Tooltip = httpContext.cgiGet( "COMBO_CC_ALMCD_Tooltip") ;
            Combo_cc_almcd_Cls = httpContext.cgiGet( "COMBO_CC_ALMCD_Cls") ;
            Combo_cc_almcd_Selectedvalue_set = httpContext.cgiGet( "COMBO_CC_ALMCD_Selectedvalue_set") ;
            Combo_cc_almcd_Selectedvalue_get = httpContext.cgiGet( "COMBO_CC_ALMCD_Selectedvalue_get") ;
            Combo_cc_almcd_Selectedtext_set = httpContext.cgiGet( "COMBO_CC_ALMCD_Selectedtext_set") ;
            Combo_cc_almcd_Selectedtext_get = httpContext.cgiGet( "COMBO_CC_ALMCD_Selectedtext_get") ;
            Combo_cc_almcd_Gamoauthtoken = httpContext.cgiGet( "COMBO_CC_ALMCD_Gamoauthtoken") ;
            Combo_cc_almcd_Ddointernalname = httpContext.cgiGet( "COMBO_CC_ALMCD_Ddointernalname") ;
            Combo_cc_almcd_Titlecontrolalign = httpContext.cgiGet( "COMBO_CC_ALMCD_Titlecontrolalign") ;
            Combo_cc_almcd_Dropdownoptionstype = httpContext.cgiGet( "COMBO_CC_ALMCD_Dropdownoptionstype") ;
            Combo_cc_almcd_Enabled = GXutil.strtobool( httpContext.cgiGet( "COMBO_CC_ALMCD_Enabled")) ;
            Combo_cc_almcd_Visible = GXutil.strtobool( httpContext.cgiGet( "COMBO_CC_ALMCD_Visible")) ;
            Combo_cc_almcd_Titlecontrolidtoreplace = httpContext.cgiGet( "COMBO_CC_ALMCD_Titlecontrolidtoreplace") ;
            Combo_cc_almcd_Datalisttype = httpContext.cgiGet( "COMBO_CC_ALMCD_Datalisttype") ;
            Combo_cc_almcd_Allowmultipleselection = GXutil.strtobool( httpContext.cgiGet( "COMBO_CC_ALMCD_Allowmultipleselection")) ;
            Combo_cc_almcd_Datalistfixedvalues = httpContext.cgiGet( "COMBO_CC_ALMCD_Datalistfixedvalues") ;
            Combo_cc_almcd_Isgriditem = GXutil.strtobool( httpContext.cgiGet( "COMBO_CC_ALMCD_Isgriditem")) ;
            Combo_cc_almcd_Hasdescription = GXutil.strtobool( httpContext.cgiGet( "COMBO_CC_ALMCD_Hasdescription")) ;
            Combo_cc_almcd_Datalistproc = httpContext.cgiGet( "COMBO_CC_ALMCD_Datalistproc") ;
            Combo_cc_almcd_Datalistprocparametersprefix = httpContext.cgiGet( "COMBO_CC_ALMCD_Datalistprocparametersprefix") ;
            Combo_cc_almcd_Remoteservicesparameters = httpContext.cgiGet( "COMBO_CC_ALMCD_Remoteservicesparameters") ;
            Combo_cc_almcd_Datalistupdateminimumcharacters = (int)(localUtil.ctol( httpContext.cgiGet( "COMBO_CC_ALMCD_Datalistupdateminimumcharacters"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Combo_cc_almcd_Includeonlyselectedoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_CC_ALMCD_Includeonlyselectedoption")) ;
            Combo_cc_almcd_Includeselectalloption = GXutil.strtobool( httpContext.cgiGet( "COMBO_CC_ALMCD_Includeselectalloption")) ;
            Combo_cc_almcd_Emptyitem = GXutil.strtobool( httpContext.cgiGet( "COMBO_CC_ALMCD_Emptyitem")) ;
            Combo_cc_almcd_Includeaddnewoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_CC_ALMCD_Includeaddnewoption")) ;
            Combo_cc_almcd_Htmltemplate = httpContext.cgiGet( "COMBO_CC_ALMCD_Htmltemplate") ;
            Combo_cc_almcd_Multiplevaluestype = httpContext.cgiGet( "COMBO_CC_ALMCD_Multiplevaluestype") ;
            Combo_cc_almcd_Loadingdata = httpContext.cgiGet( "COMBO_CC_ALMCD_Loadingdata") ;
            Combo_cc_almcd_Noresultsfound = httpContext.cgiGet( "COMBO_CC_ALMCD_Noresultsfound") ;
            Combo_cc_almcd_Emptyitemtext = httpContext.cgiGet( "COMBO_CC_ALMCD_Emptyitemtext") ;
            Combo_cc_almcd_Onlyselectedvalues = httpContext.cgiGet( "COMBO_CC_ALMCD_Onlyselectedvalues") ;
            Combo_cc_almcd_Selectalltext = httpContext.cgiGet( "COMBO_CC_ALMCD_Selectalltext") ;
            Combo_cc_almcd_Multiplevaluesseparator = httpContext.cgiGet( "COMBO_CC_ALMCD_Multiplevaluesseparator") ;
            Combo_cc_almcd_Addnewoptiontext = httpContext.cgiGet( "COMBO_CC_ALMCD_Addnewoptiontext") ;
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
            /* Read variables values. */
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtCumCodCont_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtCumCodCont_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CUMCODCONT");
               AnyError = (short)(1) ;
               GX_FocusControl = edtCumCodCont_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A859CumCodCont = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A859CumCodCont", GXutil.ltrimstr( DecimalUtil.doubleToDec(A859CumCodCont), 8, 0));
            }
            else
            {
               A859CumCodCont = (int)(localUtil.ctol( httpContext.cgiGet( edtCumCodCont_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A859CumCodCont", GXutil.ltrimstr( DecimalUtil.doubleToDec(A859CumCodCont), 8, 0));
            }
            if ( localUtil.vcdate( httpContext.cgiGet( edtCumConFec_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "CUMCONFEC");
               AnyError = (short)(1) ;
               GX_FocusControl = edtCumConFec_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A862CumConFec = GXutil.nullDate() ;
               httpContext.ajax_rsp_assign_attri("", false, "A862CumConFec", localUtil.format(A862CumConFec, "99/99/99"));
            }
            else
            {
               A862CumConFec = localUtil.ctod( httpContext.cgiGet( edtCumConFec_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A862CumConFec", localUtil.format(A862CumConFec, "99/99/99"));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtCumCCos_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtCumCCos_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CUMCCOS");
               AnyError = (short)(1) ;
               GX_FocusControl = edtCumCCos_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A10777CumCCos = (short)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A10777CumCCos", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10777CumCCos), 3, 0));
            }
            else
            {
               A10777CumCCos = (short)(localUtil.ctol( httpContext.cgiGet( edtCumCCos_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A10777CumCCos", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10777CumCCos), 3, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtCC_AlmCd_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtCC_AlmCd_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CC_ALMCD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtCC_AlmCd_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A8925CC_AlmCd = (byte)(0) ;
               n8925CC_AlmCd = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A8925CC_AlmCd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8925CC_AlmCd), 2, 0));
            }
            else
            {
               A8925CC_AlmCd = (byte)(localUtil.ctol( httpContext.cgiGet( edtCC_AlmCd_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n8925CC_AlmCd = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A8925CC_AlmCd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8925CC_AlmCd), 2, 0));
            }
            AV36Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV36Pgmname", AV36Pgmname);
            AV19ComboCumCCos = (short)(localUtil.ctol( httpContext.cgiGet( edtavCombocumccos_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV19ComboCumCCos", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19ComboCumCCos), 3, 0));
            AV21ComboCC_AlmCd = (byte)(localUtil.ctol( httpContext.cgiGet( edtavCombocc_almcd_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV21ComboCC_AlmCd", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV21ComboCC_AlmCd), 2, 0));
            A3915EmpNumDec = (byte)(localUtil.ctol( httpContext.cgiGet( edtEmpNumDec_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n3915EmpNumDec = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3915EmpNumDec", GXutil.str( A3915EmpNumDec, 1, 0));
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = new com.genexus.util.GXProperties() ;
            forbiddenHiddens.add("hshsalt", "hsh"+"ConsumoManual");
            forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
            AV36Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV36Pgmname", AV36Pgmname);
            forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV36Pgmname, "")));
            forbiddenHiddens.add("CumConTipo", localUtil.format( DecimalUtil.doubleToDec(A11368CumConTipo), "Z9"));
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ( ! ( ( A859CumCodCont != Z859CumCodCont ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
            {
               GXutil.writeLogError("stocksquimicos\\consumomanual:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
               GxWebError = (byte)(1) ;
               httpContext.sendError( 403 );
               GXutil.writeLog("send_http_error_code 403");
               AnyError = (short)(1) ;
               return  ;
            }
            /* Check if conditions changed and reset current page numbers */
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
                  sMode111 = Gx_mode ;
                  Gx_mode = "UPD" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  Gx_mode = sMode111 ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               }
               standaloneModal( ) ;
               if ( ! isIns( ) )
               {
                  getByPrimaryKey( ) ;
                  if ( RcdFound111 == 1 )
                  {
                     if ( isDlt( ) )
                     {
                        /* Confirm record */
                        confirm_1SF0( ) ;
                        if ( AnyError == 0 )
                        {
                           GX_FocusControl = bttBtntrn_enter_Internalname ;
                           httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                        }
                     }
                  }
                  else
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noinsert"), 1, "CUMCODCONT");
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtCumCodCont_Internalname ;
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
                        e111SF2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: After Trn */
                        e121SF2 ();
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
                     sEvtType = GXutil.right( sEvt, 4) ;
                     sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-4) ;
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
         e121SF2 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( isIns( )  )
         {
            /* Clear variables for new insertion. */
            initAll1SF111( ) ;
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
         disableAttributes1SF111( ) ;
      }
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, edtavCombocumccos_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCombocumccos_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, edtavCombocc_almcd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCombocc_almcd_Enabled), 5, 0), true);
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

   public void confirm_1SF0( )
   {
      beforeValidate1SF111( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1SF111( ) ;
         }
         else
         {
            checkExtendedTable1SF111( ) ;
            closeExtendedTableCursors1SF111( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode111 = Gx_mode ;
         confirm_1SF112( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode111 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode111 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
   }

   public void confirm_1SF112( )
   {
      nGXsfl_59_idx = 0 ;
      while ( nGXsfl_59_idx < nRC_GXsfl_59 )
      {
         readRow1SF112( ) ;
         if ( ( nRcdExists_112 != 0 ) || ( nIsMod_112 != 0 ) )
         {
            getKey1SF112( ) ;
            if ( ( nRcdExists_112 == 0 ) && ( nRcdDeleted_112 == 0 ) )
            {
               if ( RcdFound112 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate1SF112( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1SF112( ) ;
                     closeExtendedTableCursors1SF112( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                  }
               }
               else
               {
                  GXCCtl = "PRDNUM_" + sGXsfl_59_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtPrdNum_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound112 != 0 )
               {
                  if ( nRcdDeleted_112 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey1SF112( ) ;
                     load1SF112( ) ;
                     beforeValidate1SF112( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1SF112( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_112 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate1SF112( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1SF112( ) ;
                           closeExtendedTableCursors1SF112( ) ;
                           if ( AnyError == 0 )
                           {
                              IsConfirmed = (short)(1) ;
                              httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                           }
                        }
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_112 == 0 )
                  {
                     GXCCtl = "PRDNUM_" + sGXsfl_59_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtPrdNum_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtPrdNum_Internalname, GXutil.rtrim( A719PrdNum)) ;
         httpContext.changePostValue( edtPrdNom_Internalname, GXutil.rtrim( A718PrdNom)) ;
         httpContext.changePostValue( edtPrdFacCon_Internalname, GXutil.ltrim( localUtil.ntoc( A707PrdFacCon, (byte)(7), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPrdExiAlm_Internalname, GXutil.ltrim( localUtil.ntoc( A704PrdExiAlm, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPrdExiCC_Internalname, GXutil.ltrim( localUtil.ntoc( A705PrdExiCC, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPrdCanRes_Internalname, GXutil.ltrim( localUtil.ntoc( A685PrdCanRes, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtCumConCant_Internalname, GXutil.ltrim( localUtil.ntoc( A860CumConCant, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( cmbCumUnidad.getInternalname(), GXutil.ltrim( localUtil.ntoc( A8639CumUnidad, (byte)(1), (byte)(0), ".", ""))) ;
         httpContext.changePostValue( edtCumConLot_Internalname, GXutil.rtrim( A5862CumConLot)) ;
         httpContext.changePostValue( edtCumConCbis_Internalname, GXutil.ltrim( localUtil.ntoc( A861CumConCbis, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtCumCosPro_Internalname, GXutil.ltrim( localUtil.ntoc( A863CumCosPro, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPrdPreAct_Internalname, GXutil.ltrim( localUtil.ntoc( A724PrdPreAct, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPrdPreMed_Internalname, GXutil.ltrim( localUtil.ntoc( A726PrdPreMed, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtUltFecCCs_Internalname, localUtil.format(A3835UltFecCCs, "99/99/99")) ;
         httpContext.changePostValue( edtPrdValStk_Internalname, GXutil.ltrim( localUtil.ntoc( A750PrdValStk, (byte)(11), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtForPrdUMe_Internalname, GXutil.ltrim( localUtil.ntoc( A490ForPrdUMe, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtForPrdDsc_Internalname, GXutil.rtrim( A488ForPrdDsc)) ;
         httpContext.changePostValue( edtPrdComID_Internalname, GXutil.rtrim( A12257PrdComID)) ;
         httpContext.changePostValue( edtPrdLote_Internalname, GXutil.rtrim( A10881PrdLote)) ;
         httpContext.changePostValue( cmbCumUMed.getInternalname(), GXutil.ltrim( localUtil.ntoc( A12700CumUMed, (byte)(1), (byte)(0), ".", ""))) ;
         httpContext.changePostValue( edtCumLotAlm_Internalname, GXutil.ltrim( localUtil.ntoc( A14039CumLotAlm, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtValCod_Internalname, GXutil.ltrim( localUtil.ntoc( A856ValCod, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z719PrdNum_"+sGXsfl_59_idx, GXutil.rtrim( Z719PrdNum)) ;
         httpContext.changePostValue( "ZT_"+"Z8639CumUnidad_"+sGXsfl_59_idx, GXutil.ltrim( localUtil.ntoc( Z8639CumUnidad, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z5862CumConLot_"+sGXsfl_59_idx, GXutil.rtrim( Z5862CumConLot)) ;
         httpContext.changePostValue( "ZT_"+"Z861CumConCbis_"+sGXsfl_59_idx, GXutil.ltrim( localUtil.ntoc( Z861CumConCbis, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z860CumConCant_"+sGXsfl_59_idx, GXutil.ltrim( localUtil.ntoc( Z860CumConCant, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z12257PrdComID_"+sGXsfl_59_idx, GXutil.rtrim( Z12257PrdComID)) ;
         httpContext.changePostValue( "ZT_"+"Z12700CumUMed_"+sGXsfl_59_idx, GXutil.ltrim( localUtil.ntoc( Z12700CumUMed, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z14039CumLotAlm_"+sGXsfl_59_idx, GXutil.ltrim( localUtil.ntoc( Z14039CumLotAlm, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z490ForPrdUMe_"+sGXsfl_59_idx, GXutil.ltrim( localUtil.ntoc( Z490ForPrdUMe, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z718PrdNom_"+sGXsfl_59_idx, GXutil.rtrim( Z718PrdNom)) ;
         httpContext.changePostValue( "ZT_"+"Z707PrdFacCon_"+sGXsfl_59_idx, GXutil.ltrim( localUtil.ntoc( Z707PrdFacCon, (byte)(7), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z705PrdExiCC_"+sGXsfl_59_idx, GXutil.ltrim( localUtil.ntoc( Z705PrdExiCC, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z685PrdCanRes_"+sGXsfl_59_idx, GXutil.ltrim( localUtil.ntoc( Z685PrdCanRes, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z724PrdPreAct_"+sGXsfl_59_idx, GXutil.ltrim( localUtil.ntoc( Z724PrdPreAct, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z726PrdPreMed_"+sGXsfl_59_idx, GXutil.ltrim( localUtil.ntoc( Z726PrdPreMed, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10881PrdLote_"+sGXsfl_59_idx, GXutil.rtrim( Z10881PrdLote)) ;
         httpContext.changePostValue( "ZT_"+"Z856ValCod_"+sGXsfl_59_idx, GXutil.ltrim( localUtil.ntoc( Z856ValCod, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T750PrdValStk_"+sGXsfl_59_idx, GXutil.ltrim( localUtil.ntoc( O750PrdValStk, (byte)(11), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T861CumConCbis_"+sGXsfl_59_idx, GXutil.ltrim( localUtil.ntoc( O861CumConCbis, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T704PrdExiAlm_"+sGXsfl_59_idx, GXutil.ltrim( localUtil.ntoc( O704PrdExiAlm, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T860CumConCant_"+sGXsfl_59_idx, GXutil.ltrim( localUtil.ntoc( O860CumConCant, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_112_"+sGXsfl_59_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_112, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_112_"+sGXsfl_59_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_112, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_112_"+sGXsfl_59_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_112, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_112 != 0 )
         {
            httpContext.changePostValue( "PRDNUM_"+sGXsfl_59_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdNum_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRDNOM_"+sGXsfl_59_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdNom_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRDFACCON_"+sGXsfl_59_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdFacCon_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRDEXIALM_"+sGXsfl_59_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdExiAlm_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRDEXICC_"+sGXsfl_59_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdExiCC_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRDEXICC_"+sGXsfl_59_idx+"Visible", GXutil.ltrim( localUtil.ntoc( edtPrdExiCC_Visible, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRDCANRES_"+sGXsfl_59_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdCanRes_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CUMCONCANT_"+sGXsfl_59_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCumConCant_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CUMUNIDAD_"+sGXsfl_59_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( cmbCumUnidad.getEnabled(), (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CUMCONLOT_"+sGXsfl_59_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCumConLot_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CUMCONCBIS_"+sGXsfl_59_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCumConCbis_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CUMCOSPRO_"+sGXsfl_59_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCumCosPro_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRDPREACT_"+sGXsfl_59_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdPreAct_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRDPREMED_"+sGXsfl_59_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdPreMed_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ULTFECCCS_"+sGXsfl_59_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtUltFecCCs_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRDVALSTK_"+sGXsfl_59_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdValStk_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FORPRDUME_"+sGXsfl_59_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtForPrdUMe_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FORPRDDSC_"+sGXsfl_59_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtForPrdDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRDCOMID_"+sGXsfl_59_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdComID_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRDLOTE_"+sGXsfl_59_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdLote_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CUMUMED_"+sGXsfl_59_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( cmbCumUMed.getEnabled(), (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CUMLOTALM_"+sGXsfl_59_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCumLotAlm_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "VALCOD_"+sGXsfl_59_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtValCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption1SF0( )
   {
   }

   public void e111SF2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV7Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      consumomanual_impl.this.GXt_char1 = GXv_char2[0] ;
      AV7Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Station", AV7Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV8EmprNom ;
      GXv_char4[0] = AV9UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV7Station, GXv_char2, GXv_char3, GXv_char4) ;
      consumomanual_impl.this.A396EmprCod = GXv_char2[0] ;
      consumomanual_impl.this.AV8EmprNom = GXv_char3[0] ;
      consumomanual_impl.this.AV9UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV8EmprNom", AV8EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV9UsurCod", AV9UsurCod);
      GXt_int5 = (byte)(AV23ConMan) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "CONMAN", ""), GXv_int6) ;
      consumomanual_impl.this.GXt_int5 = GXv_int6[0] ;
      AV23ConMan = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV23ConMan", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV23ConMan), 4, 0));
      GXt_int7 = AV22Contval ;
      GXv_char4[0] = A396EmprCod ;
      GXv_char3[0] = httpContext.getMessage( "CONMAN", "") ;
      GXv_int8[0] = GXt_int7 ;
      new app.pvalcon(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_int8) ;
      consumomanual_impl.this.A396EmprCod = GXv_char4[0] ;
      consumomanual_impl.this.GXt_int7 = GXv_int8[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      AV22Contval = (byte)(GXt_int7) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV22Contval", GXutil.str( AV22Contval, 1, 0));
      GXt_int5 = (byte)(AV25Moda21) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "MODA21", ""), GXv_int6) ;
      consumomanual_impl.this.GXt_int5 = GXv_int6[0] ;
      AV25Moda21 = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV25Moda21", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV25Moda21), 4, 0));
      GXt_int5 = (byte)(AV30FlagPreMed) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "PREMED", ""), GXv_int6) ;
      consumomanual_impl.this.GXt_int5 = GXv_int6[0] ;
      AV30FlagPreMed = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV30FlagPreMed", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV30FlagPreMed), 4, 0));
      GXt_int5 = (byte)(AV32Val_stk) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "VALSTK", ""), GXv_int6) ;
      consumomanual_impl.this.GXt_int5 = GXv_int6[0] ;
      AV32Val_stk = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32Val_stk", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV32Val_stk), 4, 0));
      GXt_int7 = AV31Precio_stk ;
      GXv_int8[0] = GXt_int7 ;
      new app.pbuscon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "VALSTK", ""), GXv_int8) ;
      consumomanual_impl.this.GXt_int7 = GXv_int8[0] ;
      AV31Precio_stk = (short)(GXt_int7) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV31Precio_stk", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV31Precio_stk), 4, 0));
      GXt_char1 = AV7Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      consumomanual_impl.this.GXt_char1 = GXv_char4[0] ;
      AV7Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Station", AV7Station);
      GXv_char4[0] = AV10EmprCod ;
      GXv_char3[0] = AV8EmprNom ;
      GXv_char2[0] = AV9UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV7Station, GXv_char4, GXv_char3, GXv_char2) ;
      consumomanual_impl.this.AV10EmprCod = GXv_char4[0] ;
      consumomanual_impl.this.AV8EmprNom = GXv_char3[0] ;
      consumomanual_impl.this.AV9UsurCod = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10EmprCod", AV10EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV10EmprCod, "@!"))));
      httpContext.ajax_rsp_assign_attri("", false, "AV8EmprNom", AV8EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV9UsurCod", AV9UsurCod);
      GXv_SdtWWPContext9[0] = AV12WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext9) ;
      AV12WWPContext = GXv_SdtWWPContext9[0] ;
      Combo_prdnum_Titlecontrolidtoreplace = edtPrdNum_Internalname ;
      ucCombo_prdnum.sendProperty(context, "", false, Combo_prdnum_Internalname, "TitleControlIdToReplace", Combo_prdnum_Titlecontrolidtoreplace);
      edtCC_AlmCd_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCC_AlmCd_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCC_AlmCd_Visible), 5, 0), true);
      AV21ComboCC_AlmCd = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21ComboCC_AlmCd", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV21ComboCC_AlmCd), 2, 0));
      edtavCombocc_almcd_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCombocc_almcd_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCombocc_almcd_Visible), 5, 0), true);
      edtCumCCos_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCumCCos_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCumCCos_Visible), 5, 0), true);
      AV19ComboCumCCos = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19ComboCumCCos", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19ComboCumCCos), 3, 0));
      edtavCombocumccos_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCombocumccos_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCombocumccos_Visible), 5, 0), true);
      /* Execute user subroutine: 'LOADCOMBOCUMCCOS' */
      S112 ();
      if ( returnInSub )
      {
         pr_default.close(8);
         pr_default.close(7);
         pr_default.close(6);
         pr_default.close(4);
         pr_default.close(3);
         pr_default.close(1);
         returnInSub = true;
         if (true) return;
      }
      /* Execute user subroutine: 'LOADCOMBOCC_ALMCD' */
      S122 ();
      if ( returnInSub )
      {
         pr_default.close(8);
         pr_default.close(7);
         pr_default.close(6);
         pr_default.close(4);
         pr_default.close(3);
         pr_default.close(1);
         returnInSub = true;
         if (true) return;
      }
      /* Execute user subroutine: 'LOADCOMBOPRDNUM' */
      S132 ();
      if ( returnInSub )
      {
         pr_default.close(8);
         pr_default.close(7);
         pr_default.close(6);
         pr_default.close(4);
         pr_default.close(3);
         pr_default.close(1);
         returnInSub = true;
         if (true) return;
      }
      /* Execute user subroutine: 'ATTRIBUTESSECURITYCODE' */
      S142 ();
      if ( returnInSub )
      {
         pr_default.close(8);
         pr_default.close(7);
         pr_default.close(6);
         pr_default.close(4);
         pr_default.close(3);
         pr_default.close(1);
         returnInSub = true;
         if (true) return;
      }
      AV13TrnContext.fromxml(AV14WebSession.getValue("TrnContext"), null, null);
      if ( ( GXutil.strcmp(AV13TrnContext.getgxTv_SdtWWPTransactionContext_Transactionname(), AV36Pgmname) == 0 ) && ( GXutil.strcmp(Gx_mode, "INS") == 0 ) )
      {
         AV37GXV1 = 1 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV37GXV1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV37GXV1), 8, 0));
         while ( AV37GXV1 <= AV13TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().size() )
         {
            AV16TrnContextAtt = (app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)((app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)AV13TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().elementAt(-1+AV37GXV1));
            if ( GXutil.strcmp(AV16TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributename(), "CcoCod") == 0 )
            {
               AV15Insert_CcoCod = (short)(GXutil.lval( AV16TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributevalue())) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV15Insert_CcoCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV15Insert_CcoCod), 3, 0));
            }
            AV37GXV1 = (int)(AV37GXV1+1) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV37GXV1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV37GXV1), 8, 0));
         }
      }
      edtEmpNumDec_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmpNumDec_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmpNumDec_Visible), 5, 0), true);
   }

   public void e121SF2( )
   {
      /* After Trn Routine */
      returnInSub = false ;
      if ( ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) && ! AV13TrnContext.getgxTv_SdtWWPTransactionContext_Callerondelete() )
      {
         callWebObject(formatLink("app.stocksquimicos.consumomanualww", new String[] {}, new String[] {}) );
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
      httpContext.setWebReturnParms(new Object[] {});
      httpContext.setWebReturnParmsMetadata(new Object[] {});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      pr_default.close(8);
      pr_default.close(7);
      pr_default.close(6);
      pr_default.close(4);
      pr_default.close(3);
      pr_default.close(1);
      returnInSub = true;
      if (true) return;
   }

   public void S142( )
   {
      /* 'ATTRIBUTESSECURITYCODE' Routine */
      returnInSub = false ;
      Combo_cc_almcd_Visible = false ;
      ucCombo_cc_almcd.sendProperty(context, "", false, Combo_cc_almcd_Internalname, "Visible", GXutil.booltostr( Combo_cc_almcd_Visible));
      divCombo_cc_almcd_cell_Class = "Invisible" ;
      httpContext.ajax_rsp_assign_prop("", false, divCombo_cc_almcd_cell_Internalname, "Class", divCombo_cc_almcd_cell_Class, true);
      if ( ! Combo_cc_almcd_Visible )
      {
         divUnnamedtable2_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, divUnnamedtable2_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(divUnnamedtable2_Visible), 5, 0), true);
      }
   }

   public void S132( )
   {
      /* 'LOADCOMBOPRDNUM' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTComboData_Item10 = AV24PrdNum_Data ;
      GXv_char4[0] = AV18ComboSelectedValue ;
      GXv_objcol_SdtDVB_SDTComboData_Item11[0] = GXt_objcol_SdtDVB_SDTComboData_Item10 ;
      new app.stocksquimicos.consumomanualloaddvcombo(remoteHandle, context).execute( "PrdNum", Gx_mode, AV10EmprCod, AV11CumCodCont, GXv_char4, GXv_objcol_SdtDVB_SDTComboData_Item11) ;
      consumomanual_impl.this.AV18ComboSelectedValue = GXv_char4[0] ;
      GXt_objcol_SdtDVB_SDTComboData_Item10 = GXv_objcol_SdtDVB_SDTComboData_Item11[0] ;
      AV24PrdNum_Data = GXt_objcol_SdtDVB_SDTComboData_Item10 ;
   }

   public void S122( )
   {
      /* 'LOADCOMBOCC_ALMCD' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTComboData_Item10 = AV20CC_AlmCd_Data ;
      GXv_char4[0] = AV18ComboSelectedValue ;
      GXv_objcol_SdtDVB_SDTComboData_Item11[0] = GXt_objcol_SdtDVB_SDTComboData_Item10 ;
      new app.stocksquimicos.consumomanualloaddvcombo(remoteHandle, context).execute( "CC_AlmCd", Gx_mode, AV10EmprCod, AV11CumCodCont, GXv_char4, GXv_objcol_SdtDVB_SDTComboData_Item11) ;
      consumomanual_impl.this.AV18ComboSelectedValue = GXv_char4[0] ;
      GXt_objcol_SdtDVB_SDTComboData_Item10 = GXv_objcol_SdtDVB_SDTComboData_Item11[0] ;
      AV20CC_AlmCd_Data = GXt_objcol_SdtDVB_SDTComboData_Item10 ;
      Combo_cc_almcd_Selectedvalue_set = AV18ComboSelectedValue ;
      ucCombo_cc_almcd.sendProperty(context, "", false, Combo_cc_almcd_Internalname, "SelectedValue_set", Combo_cc_almcd_Selectedvalue_set);
      AV21ComboCC_AlmCd = (byte)(GXutil.lval( AV18ComboSelectedValue)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21ComboCC_AlmCd", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV21ComboCC_AlmCd), 2, 0));
      if ( ( GXutil.strcmp(Gx_mode, "DSP") == 0 ) || ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) )
      {
         Combo_cc_almcd_Enabled = false ;
         ucCombo_cc_almcd.sendProperty(context, "", false, Combo_cc_almcd_Internalname, "Enabled", GXutil.booltostr( Combo_cc_almcd_Enabled));
      }
   }

   public void S112( )
   {
      /* 'LOADCOMBOCUMCCOS' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTComboData_Item10 = AV17CumCCos_Data ;
      GXv_char4[0] = AV18ComboSelectedValue ;
      GXv_objcol_SdtDVB_SDTComboData_Item11[0] = GXt_objcol_SdtDVB_SDTComboData_Item10 ;
      new app.stocksquimicos.consumomanualloaddvcombo(remoteHandle, context).execute( "CumCCos", Gx_mode, AV10EmprCod, AV11CumCodCont, GXv_char4, GXv_objcol_SdtDVB_SDTComboData_Item11) ;
      consumomanual_impl.this.AV18ComboSelectedValue = GXv_char4[0] ;
      GXt_objcol_SdtDVB_SDTComboData_Item10 = GXv_objcol_SdtDVB_SDTComboData_Item11[0] ;
      AV17CumCCos_Data = GXt_objcol_SdtDVB_SDTComboData_Item10 ;
      Combo_cumccos_Selectedvalue_set = AV18ComboSelectedValue ;
      ucCombo_cumccos.sendProperty(context, "", false, Combo_cumccos_Internalname, "SelectedValue_set", Combo_cumccos_Selectedvalue_set);
      AV19ComboCumCCos = (short)(GXutil.lval( AV18ComboSelectedValue)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19ComboCumCCos", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19ComboCumCCos), 3, 0));
      if ( ( GXutil.strcmp(Gx_mode, "DSP") == 0 ) || ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) )
      {
         Combo_cumccos_Enabled = false ;
         ucCombo_cumccos.sendProperty(context, "", false, Combo_cumccos_Internalname, "Enabled", GXutil.booltostr( Combo_cumccos_Enabled));
      }
   }

   public void zm1SF111( int GX_JID )
   {
      if ( ( GX_JID == 59 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z8925CC_AlmCd = T01SF8_A8925CC_AlmCd[0] ;
            Z10777CumCCos = T01SF8_A10777CumCCos[0] ;
            Z11368CumConTipo = T01SF8_A11368CumConTipo[0] ;
            Z862CumConFec = T01SF8_A862CumConFec[0] ;
            Z3839CcoCod = T01SF8_A3839CcoCod[0] ;
         }
         else
         {
            Z8925CC_AlmCd = A8925CC_AlmCd ;
            Z10777CumCCos = A10777CumCCos ;
            Z11368CumConTipo = A11368CumConTipo ;
            Z862CumConFec = A862CumConFec ;
            Z3839CcoCod = A3839CcoCod ;
         }
      }
      if ( GX_JID == -59 )
      {
         Z859CumCodCont = A859CumCodCont ;
         Z8925CC_AlmCd = A8925CC_AlmCd ;
         Z10777CumCCos = A10777CumCCos ;
         Z11368CumConTipo = A11368CumConTipo ;
         Z862CumConFec = A862CumConFec ;
         Z396EmprCod = A396EmprCod ;
         Z3839CcoCod = A3839CcoCod ;
         Z407EmprNom = A407EmprNom ;
         Z3915EmpNumDec = A3915EmpNumDec ;
      }
   }

   public void standaloneNotModal( )
   {
      AV36Pgmname = "StocksQuimicos.ConsumoManual" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV36Pgmname", AV36Pgmname);
      Gx_BScreen = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      bttBtntrn_delete_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtntrn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_delete_Enabled), 5, 0), true);
      if ( ! (GXutil.strcmp("", AV10EmprCod)==0) )
      {
         A396EmprCod = AV10EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      }
      /* Using cursor T01SF9 */
      pr_default.execute(7, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(7) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01SF9_A407EmprNom[0] ;
      n407EmprNom = T01SF9_n407EmprNom[0] ;
      A3915EmpNumDec = T01SF9_A3915EmpNumDec[0] ;
      n3915EmpNumDec = T01SF9_n3915EmpNumDec[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A3915EmpNumDec", GXutil.str( A3915EmpNumDec, 1, 0));
      pr_default.close(7);
      GXt_int7 = 0 ;
      GXv_int8[0] = GXt_int7 ;
      new app.pbuscon(remoteHandle, context).execute( A396EmprCod, "011100", GXv_int8) ;
      consumomanual_impl.this.GXt_int7 = GXv_int8[0] ;
      edtPrdExiCC_Visible = ((GXt_int7==0) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdExiCC_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdExiCC_Visible), 5, 0), !bGXsfl_59_Refreshing);
      GXt_int5 = (byte)(0) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "TELIOT", ""), ""), GXv_int6) ;
      consumomanual_impl.this.GXt_int5 = GXv_int6[0] ;
      Combo_cc_almcd_Visible = (boolean)((GXt_int5==1)) ;
      ucCombo_cc_almcd.sendProperty(context, "", false, Combo_cc_almcd_Internalname, "Visible", GXutil.booltostr( Combo_cc_almcd_Visible));
      GXt_int5 = (byte)(0) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "TELIOT", ""), ""), GXv_int6) ;
      consumomanual_impl.this.GXt_int5 = GXv_int6[0] ;
      if ( ! ( ( GXt_int5 == 1 ) ) )
      {
         divCombo_cc_almcd_cell_Class = httpContext.getMessage( "Invisible", "") ;
         httpContext.ajax_rsp_assign_prop("", false, divCombo_cc_almcd_cell_Internalname, "Class", divCombo_cc_almcd_cell_Class, true);
      }
      else
      {
         GXt_int5 = (byte)(0) ;
         GXv_int6[0] = GXt_int5 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "TELIOT", ""), ""), GXv_int6) ;
         consumomanual_impl.this.GXt_int5 = GXv_int6[0] ;
         if ( GXt_int5 == 1 )
         {
            divCombo_cc_almcd_cell_Class = httpContext.getMessage( "col-xs-12 DataContentCell DscTop ExtendedComboCell", "") ;
            httpContext.ajax_rsp_assign_prop("", false, divCombo_cc_almcd_cell_Internalname, "Class", divCombo_cc_almcd_cell_Class, true);
         }
      }
      GXt_int5 = (byte)(0) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "TELIOT", ""), ""), GXv_int6) ;
      consumomanual_impl.this.GXt_int5 = GXv_int6[0] ;
      divUnnamedtable2_Visible = ((((GXt_int5==1))) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, divUnnamedtable2_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(divUnnamedtable2_Visible), 5, 0), true);
      if ( ! (0==AV11CumCodCont) )
      {
         A859CumCodCont = AV11CumCodCont ;
         httpContext.ajax_rsp_assign_attri("", false, "A859CumCodCont", GXutil.ltrimstr( DecimalUtil.doubleToDec(A859CumCodCont), 8, 0));
      }
      if ( ! (0==AV11CumCodCont) )
      {
         edtCumCodCont_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCumCodCont_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCumCodCont_Enabled), 5, 0), true);
      }
   }

   public void standaloneModal( )
   {
      if ( isUpd( )  )
      {
         edtCumConFec_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCumConFec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCumConFec_Enabled), 5, 0), true);
      }
      else
      {
         edtCumConFec_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCumConFec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCumConFec_Enabled), 5, 0), true);
      }
      if ( isUpd( )  )
      {
         edtCumConFec_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCumConFec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCumConFec_Enabled), 5, 0), true);
      }
      if ( isIns( )  )
      {
         edtCumCodCont_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCumCodCont_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCumCodCont_Enabled), 5, 0), true);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV15Insert_CcoCod) )
      {
         A3839CcoCod = AV15Insert_CcoCod ;
         n3839CcoCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A3839CcoCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3839CcoCod), 3, 0));
      }
      A10777CumCCos = AV19ComboCumCCos ;
      httpContext.ajax_rsp_assign_attri("", false, "A10777CumCCos", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10777CumCCos), 3, 0));
      A8925CC_AlmCd = AV21ComboCC_AlmCd ;
      n8925CC_AlmCd = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A8925CC_AlmCd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8925CC_AlmCd), 2, 0));
      if ( ! (0==AV11CumCodCont) )
      {
         edtCumCodCont_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCumCodCont_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCumCodCont_Enabled), 5, 0), true);
      }
      else
      {
         if ( isIns( )  )
         {
            edtCumCodCont_Enabled = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, edtCumCodCont_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCumCodCont_Enabled), 5, 0), true);
         }
         else
         {
            edtCumCodCont_Enabled = 1 ;
            httpContext.ajax_rsp_assign_prop("", false, edtCumCodCont_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCumCodCont_Enabled), 5, 0), true);
         }
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
      if ( isIns( )  && GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A862CumConFec)) && ( Gx_BScreen == 0 ) )
      {
         A862CumConFec = GXutil.today( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "A862CumConFec", localUtil.format(A862CumConFec, "99/99/99"));
      }
      if ( isIns( )  && (0==A11368CumConTipo) && ( Gx_BScreen == 0 ) )
      {
         A11368CumConTipo = (byte)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A11368CumConTipo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11368CumConTipo), 2, 0));
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ( Gx_BScreen == 0 ) )
      {
         GXt_char1 = A10778CumCCosD ;
         GXv_int12[0] = A10777CumCCos ;
         GXv_char4[0] = GXt_char1 ;
         new app.pccdsc(remoteHandle, context).execute( GXv_int12, GXv_char4) ;
         consumomanual_impl.this.A10777CumCCos = GXv_int12[0] ;
         consumomanual_impl.this.GXt_char1 = GXv_char4[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10777CumCCos", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10777CumCCos), 3, 0));
         A10778CumCCosD = GXt_char1 ;
         httpContext.ajax_rsp_assign_attri("", false, "A10778CumCCosD", A10778CumCCosD);
         GXt_char1 = A8926CC_AlmDc ;
         GXv_char4[0] = A396EmprCod ;
         GXv_int6[0] = A8925CC_AlmCd ;
         GXv_char3[0] = GXt_char1 ;
         new app.pexialmc(remoteHandle, context).execute( GXv_char4, GXv_int6, GXv_char3) ;
         consumomanual_impl.this.A396EmprCod = GXv_char4[0] ;
         consumomanual_impl.this.A8925CC_AlmCd = GXv_int6[0] ;
         consumomanual_impl.this.GXt_char1 = GXv_char3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A8925CC_AlmCd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8925CC_AlmCd), 2, 0));
         A8926CC_AlmDc = GXt_char1 ;
         httpContext.ajax_rsp_assign_attri("", false, "A8926CC_AlmDc", A8926CC_AlmDc);
         AV28Mes = (short)(GXutil.month( A862CumConFec)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV28Mes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV28Mes), 4, 0));
         AV29Year = (short)(GXutil.year( A862CumConFec)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV29Year", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29Year), 4, 0));
      }
   }

   public void load1SF111( )
   {
      /* Using cursor T01SF11 */
      pr_default.execute(9, new Object[] {A396EmprCod, Integer.valueOf(A859CumCodCont)});
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound111 = (short)(1) ;
         A8925CC_AlmCd = T01SF11_A8925CC_AlmCd[0] ;
         n8925CC_AlmCd = T01SF11_n8925CC_AlmCd[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8925CC_AlmCd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8925CC_AlmCd), 2, 0));
         A10777CumCCos = T01SF11_A10777CumCCos[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10777CumCCos", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10777CumCCos), 3, 0));
         A407EmprNom = T01SF11_A407EmprNom[0] ;
         n407EmprNom = T01SF11_n407EmprNom[0] ;
         A3915EmpNumDec = T01SF11_A3915EmpNumDec[0] ;
         n3915EmpNumDec = T01SF11_n3915EmpNumDec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3915EmpNumDec", GXutil.str( A3915EmpNumDec, 1, 0));
         A11368CumConTipo = T01SF11_A11368CumConTipo[0] ;
         A862CumConFec = T01SF11_A862CumConFec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A862CumConFec", localUtil.format(A862CumConFec, "99/99/99"));
         A3839CcoCod = T01SF11_A3839CcoCod[0] ;
         n3839CcoCod = T01SF11_n3839CcoCod[0] ;
         zm1SF111( -59) ;
      }
      pr_default.close(9);
      onLoadActions1SF111( ) ;
   }

   public void onLoadActions1SF111( )
   {
      AV28Mes = (short)(GXutil.month( A862CumConFec)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV28Mes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV28Mes), 4, 0));
      AV29Year = (short)(GXutil.year( A862CumConFec)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV29Year", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29Year), 4, 0));
      GXt_char1 = A10778CumCCosD ;
      GXv_int12[0] = A10777CumCCos ;
      GXv_char4[0] = GXt_char1 ;
      new app.pccdsc(remoteHandle, context).execute( GXv_int12, GXv_char4) ;
      consumomanual_impl.this.A10777CumCCos = GXv_int12[0] ;
      consumomanual_impl.this.GXt_char1 = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A10777CumCCos", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10777CumCCos), 3, 0));
      A10778CumCCosD = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "A10778CumCCosD", A10778CumCCosD);
      GXt_char1 = A8926CC_AlmDc ;
      GXv_char4[0] = A396EmprCod ;
      GXv_int6[0] = A8925CC_AlmCd ;
      GXv_char3[0] = GXt_char1 ;
      new app.pexialmc(remoteHandle, context).execute( GXv_char4, GXv_int6, GXv_char3) ;
      consumomanual_impl.this.A396EmprCod = GXv_char4[0] ;
      consumomanual_impl.this.A8925CC_AlmCd = GXv_int6[0] ;
      consumomanual_impl.this.GXt_char1 = GXv_char3[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A8925CC_AlmCd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8925CC_AlmCd), 2, 0));
      A8926CC_AlmDc = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "A8926CC_AlmDc", A8926CC_AlmDc);
   }

   public void checkExtendedTable1SF111( )
   {
      nIsDirty_111 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal( ) ;
      AV28Mes = (short)(GXutil.month( A862CumConFec)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV28Mes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV28Mes), 4, 0));
      AV29Year = (short)(GXutil.year( A862CumConFec)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV29Year", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29Year), 4, 0));
      nIsDirty_111 = (short)(1) ;
      GXt_char1 = A10778CumCCosD ;
      GXv_int12[0] = A10777CumCCos ;
      GXv_char4[0] = GXt_char1 ;
      new app.pccdsc(remoteHandle, context).execute( GXv_int12, GXv_char4) ;
      consumomanual_impl.this.A10777CumCCos = GXv_int12[0] ;
      consumomanual_impl.this.GXt_char1 = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A10777CumCCos", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10777CumCCos), 3, 0));
      A10778CumCCosD = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "A10778CumCCosD", A10778CumCCosD);
      /* Using cursor T01SF10 */
      pr_default.execute(8, new Object[] {Boolean.valueOf(n3839CcoCod), Short.valueOf(A3839CcoCod)});
      if ( (pr_default.getStatus(8) == 101) )
      {
         if ( ! ( (0==A3839CcoCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CENTCO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CCOCOD");
            AnyError = (short)(1) ;
         }
      }
      pr_default.close(8);
      nIsDirty_111 = (short)(1) ;
      GXt_char1 = A8926CC_AlmDc ;
      GXv_char4[0] = A396EmprCod ;
      GXv_int6[0] = A8925CC_AlmCd ;
      GXv_char3[0] = GXt_char1 ;
      new app.pexialmc(remoteHandle, context).execute( GXv_char4, GXv_int6, GXv_char3) ;
      consumomanual_impl.this.A396EmprCod = GXv_char4[0] ;
      consumomanual_impl.this.A8925CC_AlmCd = GXv_int6[0] ;
      consumomanual_impl.this.GXt_char1 = GXv_char3[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A8925CC_AlmCd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8925CC_AlmCd), 2, 0));
      A8926CC_AlmDc = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "A8926CC_AlmDc", A8926CC_AlmDc);
   }

   public void closeExtendedTableCursors1SF111( )
   {
      pr_default.close(8);
   }

   public void enableDisable( )
   {
   }

   public void gxload_61( short A3839CcoCod )
   {
      /* Using cursor T01SF12 */
      pr_default.execute(10, new Object[] {Boolean.valueOf(n3839CcoCod), Short.valueOf(A3839CcoCod)});
      if ( (pr_default.getStatus(10) == 101) )
      {
         if ( ! ( (0==A3839CcoCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CENTCO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CCOCOD");
            AnyError = (short)(1) ;
         }
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "]") ;
      if ( (pr_default.getStatus(10) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(10);
   }

   public void getKey1SF111( )
   {
      /* Using cursor T01SF13 */
      pr_default.execute(11, new Object[] {A396EmprCod, Integer.valueOf(A859CumCodCont)});
      if ( (pr_default.getStatus(11) != 101) )
      {
         RcdFound111 = (short)(1) ;
      }
      else
      {
         RcdFound111 = (short)(0) ;
      }
      pr_default.close(11);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01SF8 */
      pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A859CumCodCont)});
      if ( (pr_default.getStatus(6) != 101) && ( GXutil.strcmp(T01SF8_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1SF111( 59) ;
         RcdFound111 = (short)(1) ;
         A859CumCodCont = T01SF8_A859CumCodCont[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A859CumCodCont", GXutil.ltrimstr( DecimalUtil.doubleToDec(A859CumCodCont), 8, 0));
         A8925CC_AlmCd = T01SF8_A8925CC_AlmCd[0] ;
         n8925CC_AlmCd = T01SF8_n8925CC_AlmCd[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8925CC_AlmCd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8925CC_AlmCd), 2, 0));
         A10777CumCCos = T01SF8_A10777CumCCos[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10777CumCCos", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10777CumCCos), 3, 0));
         A11368CumConTipo = T01SF8_A11368CumConTipo[0] ;
         A862CumConFec = T01SF8_A862CumConFec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A862CumConFec", localUtil.format(A862CumConFec, "99/99/99"));
         A3839CcoCod = T01SF8_A3839CcoCod[0] ;
         n3839CcoCod = T01SF8_n3839CcoCod[0] ;
         Z396EmprCod = A396EmprCod ;
         Z859CumCodCont = A859CumCodCont ;
         sMode111 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load1SF111( ) ;
         if ( AnyError == 1 )
         {
            RcdFound111 = (short)(0) ;
            initializeNonKey1SF111( ) ;
         }
         Gx_mode = sMode111 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound111 = (short)(0) ;
         initializeNonKey1SF111( ) ;
         sMode111 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode111 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(6);
   }

   public void getEqualNoModal( )
   {
      getKey1SF111( ) ;
      if ( RcdFound111 == 0 )
      {
      }
      else
      {
      }
      getByPrimaryKey( ) ;
   }

   public void move_next( )
   {
      RcdFound111 = (short)(0) ;
      /* Using cursor T01SF14 */
      pr_default.execute(12, new Object[] {Integer.valueOf(A859CumCodCont), A396EmprCod});
      if ( (pr_default.getStatus(12) != 101) )
      {
         while ( (pr_default.getStatus(12) != 101) && ( ( T01SF14_A859CumCodCont[0] < A859CumCodCont ) ) && ( GXutil.strcmp(T01SF14_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(12);
         }
         if ( (pr_default.getStatus(12) != 101) && ( ( T01SF14_A859CumCodCont[0] > A859CumCodCont ) ) && ( GXutil.strcmp(T01SF14_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A859CumCodCont = T01SF14_A859CumCodCont[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A859CumCodCont", GXutil.ltrimstr( DecimalUtil.doubleToDec(A859CumCodCont), 8, 0));
            RcdFound111 = (short)(1) ;
         }
      }
      pr_default.close(12);
   }

   public void move_previous( )
   {
      RcdFound111 = (short)(0) ;
      /* Using cursor T01SF15 */
      pr_default.execute(13, new Object[] {Integer.valueOf(A859CumCodCont), A396EmprCod});
      if ( (pr_default.getStatus(13) != 101) )
      {
         while ( (pr_default.getStatus(13) != 101) && ( ( T01SF15_A859CumCodCont[0] > A859CumCodCont ) ) && ( GXutil.strcmp(T01SF15_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(13);
         }
         if ( (pr_default.getStatus(13) != 101) && ( ( T01SF15_A859CumCodCont[0] < A859CumCodCont ) ) && ( GXutil.strcmp(T01SF15_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A859CumCodCont = T01SF15_A859CumCodCont[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A859CumCodCont", GXutil.ltrimstr( DecimalUtil.doubleToDec(A859CumCodCont), 8, 0));
            RcdFound111 = (short)(1) ;
         }
      }
      pr_default.close(13);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1SF111( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtCumCodCont_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1SF111( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound111 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A859CumCodCont != Z859CumCodCont ) )
            {
               A859CumCodCont = Z859CumCodCont ;
               httpContext.ajax_rsp_assign_attri("", false, "A859CumCodCont", GXutil.ltrimstr( DecimalUtil.doubleToDec(A859CumCodCont), 8, 0));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "CUMCODCONT");
               AnyError = (short)(1) ;
               GX_FocusControl = edtCumCodCont_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtCumCodCont_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               /* Update record */
               update1SF111( ) ;
               GX_FocusControl = edtCumCodCont_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A859CumCodCont != Z859CumCodCont ) )
            {
               /* Insert record */
               GX_FocusControl = edtCumCodCont_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1SF111( ) ;
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
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "CUMCODCONT");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtCumCodCont_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               else
               {
                  /* Insert record */
                  GX_FocusControl = edtCumCodCont_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1SF111( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A859CumCodCont != Z859CumCodCont ) )
      {
         A859CumCodCont = Z859CumCodCont ;
         httpContext.ajax_rsp_assign_attri("", false, "A859CumCodCont", GXutil.ltrimstr( DecimalUtil.doubleToDec(A859CumCodCont), 8, 0));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "CUMCODCONT");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCumCodCont_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtCumCodCont_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( AnyError != 0 )
      {
      }
   }

   public void checkOptimisticConcurrency1SF111( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01SF7 */
         pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A859CumCodCont)});
         if ( (pr_default.getStatus(5) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCCUMCO"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(5) == 101) || ( Z8925CC_AlmCd != T01SF7_A8925CC_AlmCd[0] ) || ( Z10777CumCCos != T01SF7_A10777CumCCos[0] ) || ( Z11368CumConTipo != T01SF7_A11368CumConTipo[0] ) || !( GXutil.dateCompare(GXutil.resetTime(Z862CumConFec), GXutil.resetTime(T01SF7_A862CumConFec[0])) ) || ( Z3839CcoCod != T01SF7_A3839CcoCod[0] ) )
         {
            if ( Z8925CC_AlmCd != T01SF7_A8925CC_AlmCd[0] )
            {
               GXutil.writeLogln("stocksquimicos.consumomanual:[seudo value changed for attri]"+"CC_AlmCd");
               GXutil.writeLogRaw("Old: ",Z8925CC_AlmCd);
               GXutil.writeLogRaw("Current: ",T01SF7_A8925CC_AlmCd[0]);
            }
            if ( Z10777CumCCos != T01SF7_A10777CumCCos[0] )
            {
               GXutil.writeLogln("stocksquimicos.consumomanual:[seudo value changed for attri]"+"CumCCos");
               GXutil.writeLogRaw("Old: ",Z10777CumCCos);
               GXutil.writeLogRaw("Current: ",T01SF7_A10777CumCCos[0]);
            }
            if ( Z11368CumConTipo != T01SF7_A11368CumConTipo[0] )
            {
               GXutil.writeLogln("stocksquimicos.consumomanual:[seudo value changed for attri]"+"CumConTipo");
               GXutil.writeLogRaw("Old: ",Z11368CumConTipo);
               GXutil.writeLogRaw("Current: ",T01SF7_A11368CumConTipo[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z862CumConFec), GXutil.resetTime(T01SF7_A862CumConFec[0])) ) )
            {
               GXutil.writeLogln("stocksquimicos.consumomanual:[seudo value changed for attri]"+"CumConFec");
               GXutil.writeLogRaw("Old: ",Z862CumConFec);
               GXutil.writeLogRaw("Current: ",T01SF7_A862CumConFec[0]);
            }
            if ( Z3839CcoCod != T01SF7_A3839CcoCod[0] )
            {
               GXutil.writeLogln("stocksquimicos.consumomanual:[seudo value changed for attri]"+"CcoCod");
               GXutil.writeLogRaw("Old: ",Z3839CcoCod);
               GXutil.writeLogRaw("Current: ",T01SF7_A3839CcoCod[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPCCUMCO"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1SF111( )
   {
      beforeValidate1SF111( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1SF111( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1SF111( 0) ;
         checkOptimisticConcurrency1SF111( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1SF111( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1SF111( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01SF16 */
                  pr_default.execute(14, new Object[] {Integer.valueOf(A859CumCodCont), Boolean.valueOf(n8925CC_AlmCd), Byte.valueOf(A8925CC_AlmCd), Short.valueOf(A10777CumCCos), Byte.valueOf(A11368CumConTipo), A862CumConFec, A396EmprCod, Boolean.valueOf(n3839CcoCod), Short.valueOf(A3839CcoCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCCUMCO");
                  if ( (pr_default.getStatus(14) == 1) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
                     AnyError = (short)(1) ;
                  }
                  if ( AnyError == 0 )
                  {
                     /* Start of After( Insert) rules */
                     /* End of After( Insert) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel1SF111( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption1SF0( ) ;
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
         else
         {
            load1SF111( ) ;
         }
         endLevel1SF111( ) ;
      }
      closeExtendedTableCursors1SF111( ) ;
   }

   public void update1SF111( )
   {
      beforeValidate1SF111( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1SF111( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1SF111( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1SF111( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1SF111( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01SF17 */
                  pr_default.execute(15, new Object[] {Boolean.valueOf(n8925CC_AlmCd), Byte.valueOf(A8925CC_AlmCd), Short.valueOf(A10777CumCCos), Byte.valueOf(A11368CumConTipo), A862CumConFec, Boolean.valueOf(n3839CcoCod), Short.valueOf(A3839CcoCod), A396EmprCod, Integer.valueOf(A859CumCodCont)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCCUMCO");
                  if ( (pr_default.getStatus(15) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCCUMCO"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1SF111( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel1SF111( ) ;
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
                  }
                  else
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_unexp"), 1, "");
                     AnyError = (short)(1) ;
                  }
               }
            }
         }
         endLevel1SF111( ) ;
      }
      closeExtendedTableCursors1SF111( ) ;
   }

   public void deferredUpdate1SF111( )
   {
   }

   public void delete( )
   {
      beforeValidate1SF111( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1SF111( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1SF111( ) ;
         afterConfirm1SF111( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1SF111( ) ;
            if ( AnyError == 0 )
            {
               scanStart1SF112( ) ;
               while ( RcdFound112 != 0 )
               {
                  getByPrimaryKey1SF112( ) ;
                  delete1SF112( ) ;
                  scanNext1SF112( ) ;
               }
               scanEnd1SF112( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01SF18 */
                  pr_default.execute(16, new Object[] {A396EmprCod, Integer.valueOf(A859CumCodCont)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCCUMCO");
                  if ( AnyError == 0 )
                  {
                     /* Start of After( delete) rules */
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
      }
      sMode111 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1SF111( ) ;
      Gx_mode = sMode111 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1SF111( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         AV28Mes = (short)(GXutil.month( A862CumConFec)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV28Mes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV28Mes), 4, 0));
         AV29Year = (short)(GXutil.year( A862CumConFec)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV29Year", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29Year), 4, 0));
         GXt_char1 = A10778CumCCosD ;
         GXv_int12[0] = A10777CumCCos ;
         GXv_char4[0] = GXt_char1 ;
         new app.pccdsc(remoteHandle, context).execute( GXv_int12, GXv_char4) ;
         consumomanual_impl.this.A10777CumCCos = GXv_int12[0] ;
         consumomanual_impl.this.GXt_char1 = GXv_char4[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10777CumCCos", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10777CumCCos), 3, 0));
         A10778CumCCosD = GXt_char1 ;
         httpContext.ajax_rsp_assign_attri("", false, "A10778CumCCosD", A10778CumCCosD);
         GXt_char1 = A8926CC_AlmDc ;
         GXv_char4[0] = A396EmprCod ;
         GXv_int6[0] = A8925CC_AlmCd ;
         GXv_char3[0] = GXt_char1 ;
         new app.pexialmc(remoteHandle, context).execute( GXv_char4, GXv_int6, GXv_char3) ;
         consumomanual_impl.this.A396EmprCod = GXv_char4[0] ;
         consumomanual_impl.this.A8925CC_AlmCd = GXv_int6[0] ;
         consumomanual_impl.this.GXt_char1 = GXv_char3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A8925CC_AlmCd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8925CC_AlmCd), 2, 0));
         A8926CC_AlmDc = GXt_char1 ;
         httpContext.ajax_rsp_assign_attri("", false, "A8926CC_AlmDc", A8926CC_AlmDc);
      }
   }

   public void processNestedLevel1SF112( )
   {
      nGXsfl_59_idx = 0 ;
      while ( nGXsfl_59_idx < nRC_GXsfl_59 )
      {
         readRow1SF112( ) ;
         if ( ( nRcdExists_112 != 0 ) || ( nIsMod_112 != 0 ) )
         {
            standaloneNotModal1SF112( ) ;
            getKey1SF112( ) ;
            if ( ( nRcdExists_112 == 0 ) && ( nRcdDeleted_112 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert1SF112( ) ;
            }
            else
            {
               if ( RcdFound112 != 0 )
               {
                  if ( ( nRcdDeleted_112 != 0 ) && ( nRcdExists_112 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete1SF112( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_112 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update1SF112( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_112 == 0 )
                  {
                     GXCCtl = "PRDNUM_" + sGXsfl_59_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtPrdNum_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtPrdNum_Internalname, GXutil.rtrim( A719PrdNum)) ;
         httpContext.changePostValue( edtPrdNom_Internalname, GXutil.rtrim( A718PrdNom)) ;
         httpContext.changePostValue( edtPrdFacCon_Internalname, GXutil.ltrim( localUtil.ntoc( A707PrdFacCon, (byte)(7), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPrdExiAlm_Internalname, GXutil.ltrim( localUtil.ntoc( A704PrdExiAlm, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPrdExiCC_Internalname, GXutil.ltrim( localUtil.ntoc( A705PrdExiCC, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPrdCanRes_Internalname, GXutil.ltrim( localUtil.ntoc( A685PrdCanRes, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtCumConCant_Internalname, GXutil.ltrim( localUtil.ntoc( A860CumConCant, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( cmbCumUnidad.getInternalname(), GXutil.ltrim( localUtil.ntoc( A8639CumUnidad, (byte)(1), (byte)(0), ".", ""))) ;
         httpContext.changePostValue( edtCumConLot_Internalname, GXutil.rtrim( A5862CumConLot)) ;
         httpContext.changePostValue( edtCumConCbis_Internalname, GXutil.ltrim( localUtil.ntoc( A861CumConCbis, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtCumCosPro_Internalname, GXutil.ltrim( localUtil.ntoc( A863CumCosPro, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPrdPreAct_Internalname, GXutil.ltrim( localUtil.ntoc( A724PrdPreAct, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPrdPreMed_Internalname, GXutil.ltrim( localUtil.ntoc( A726PrdPreMed, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtUltFecCCs_Internalname, localUtil.format(A3835UltFecCCs, "99/99/99")) ;
         httpContext.changePostValue( edtPrdValStk_Internalname, GXutil.ltrim( localUtil.ntoc( A750PrdValStk, (byte)(11), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtForPrdUMe_Internalname, GXutil.ltrim( localUtil.ntoc( A490ForPrdUMe, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtForPrdDsc_Internalname, GXutil.rtrim( A488ForPrdDsc)) ;
         httpContext.changePostValue( edtPrdComID_Internalname, GXutil.rtrim( A12257PrdComID)) ;
         httpContext.changePostValue( edtPrdLote_Internalname, GXutil.rtrim( A10881PrdLote)) ;
         httpContext.changePostValue( cmbCumUMed.getInternalname(), GXutil.ltrim( localUtil.ntoc( A12700CumUMed, (byte)(1), (byte)(0), ".", ""))) ;
         httpContext.changePostValue( edtCumLotAlm_Internalname, GXutil.ltrim( localUtil.ntoc( A14039CumLotAlm, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtValCod_Internalname, GXutil.ltrim( localUtil.ntoc( A856ValCod, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z719PrdNum_"+sGXsfl_59_idx, GXutil.rtrim( Z719PrdNum)) ;
         httpContext.changePostValue( "ZT_"+"Z8639CumUnidad_"+sGXsfl_59_idx, GXutil.ltrim( localUtil.ntoc( Z8639CumUnidad, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z5862CumConLot_"+sGXsfl_59_idx, GXutil.rtrim( Z5862CumConLot)) ;
         httpContext.changePostValue( "ZT_"+"Z861CumConCbis_"+sGXsfl_59_idx, GXutil.ltrim( localUtil.ntoc( Z861CumConCbis, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z860CumConCant_"+sGXsfl_59_idx, GXutil.ltrim( localUtil.ntoc( Z860CumConCant, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z12257PrdComID_"+sGXsfl_59_idx, GXutil.rtrim( Z12257PrdComID)) ;
         httpContext.changePostValue( "ZT_"+"Z12700CumUMed_"+sGXsfl_59_idx, GXutil.ltrim( localUtil.ntoc( Z12700CumUMed, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z14039CumLotAlm_"+sGXsfl_59_idx, GXutil.ltrim( localUtil.ntoc( Z14039CumLotAlm, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z490ForPrdUMe_"+sGXsfl_59_idx, GXutil.ltrim( localUtil.ntoc( Z490ForPrdUMe, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z718PrdNom_"+sGXsfl_59_idx, GXutil.rtrim( Z718PrdNom)) ;
         httpContext.changePostValue( "ZT_"+"Z707PrdFacCon_"+sGXsfl_59_idx, GXutil.ltrim( localUtil.ntoc( Z707PrdFacCon, (byte)(7), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z705PrdExiCC_"+sGXsfl_59_idx, GXutil.ltrim( localUtil.ntoc( Z705PrdExiCC, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z685PrdCanRes_"+sGXsfl_59_idx, GXutil.ltrim( localUtil.ntoc( Z685PrdCanRes, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z724PrdPreAct_"+sGXsfl_59_idx, GXutil.ltrim( localUtil.ntoc( Z724PrdPreAct, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z726PrdPreMed_"+sGXsfl_59_idx, GXutil.ltrim( localUtil.ntoc( Z726PrdPreMed, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10881PrdLote_"+sGXsfl_59_idx, GXutil.rtrim( Z10881PrdLote)) ;
         httpContext.changePostValue( "ZT_"+"Z856ValCod_"+sGXsfl_59_idx, GXutil.ltrim( localUtil.ntoc( Z856ValCod, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T750PrdValStk_"+sGXsfl_59_idx, GXutil.ltrim( localUtil.ntoc( O750PrdValStk, (byte)(11), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T861CumConCbis_"+sGXsfl_59_idx, GXutil.ltrim( localUtil.ntoc( O861CumConCbis, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T704PrdExiAlm_"+sGXsfl_59_idx, GXutil.ltrim( localUtil.ntoc( O704PrdExiAlm, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T860CumConCant_"+sGXsfl_59_idx, GXutil.ltrim( localUtil.ntoc( O860CumConCant, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_112_"+sGXsfl_59_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_112, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_112_"+sGXsfl_59_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_112, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_112_"+sGXsfl_59_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_112, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_112 != 0 )
         {
            httpContext.changePostValue( "PRDNUM_"+sGXsfl_59_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdNum_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRDNOM_"+sGXsfl_59_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdNom_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRDFACCON_"+sGXsfl_59_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdFacCon_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRDEXIALM_"+sGXsfl_59_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdExiAlm_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRDEXICC_"+sGXsfl_59_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdExiCC_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRDEXICC_"+sGXsfl_59_idx+"Visible", GXutil.ltrim( localUtil.ntoc( edtPrdExiCC_Visible, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRDCANRES_"+sGXsfl_59_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdCanRes_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CUMCONCANT_"+sGXsfl_59_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCumConCant_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CUMUNIDAD_"+sGXsfl_59_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( cmbCumUnidad.getEnabled(), (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CUMCONLOT_"+sGXsfl_59_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCumConLot_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CUMCONCBIS_"+sGXsfl_59_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCumConCbis_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CUMCOSPRO_"+sGXsfl_59_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCumCosPro_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRDPREACT_"+sGXsfl_59_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdPreAct_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRDPREMED_"+sGXsfl_59_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdPreMed_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ULTFECCCS_"+sGXsfl_59_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtUltFecCCs_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRDVALSTK_"+sGXsfl_59_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdValStk_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FORPRDUME_"+sGXsfl_59_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtForPrdUMe_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FORPRDDSC_"+sGXsfl_59_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtForPrdDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRDCOMID_"+sGXsfl_59_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdComID_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRDLOTE_"+sGXsfl_59_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdLote_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CUMUMED_"+sGXsfl_59_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( cmbCumUMed.getEnabled(), (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CUMLOTALM_"+sGXsfl_59_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCumLotAlm_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "VALCOD_"+sGXsfl_59_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtValCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll1SF112( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_112 = (short)(0) ;
      nIsMod_112 = (short)(0) ;
      nRcdDeleted_112 = (short)(0) ;
   }

   public void processLevel1SF111( )
   {
      /* Save parent mode. */
      sMode111 = Gx_mode ;
      processNestedLevel1SF112( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode111 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevel1SF111( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(5);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1SF111( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "stocksquimicos.consumomanual");
         if ( AnyError == 0 )
         {
            confirmValues1SF0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "stocksquimicos.consumomanual");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1SF111( )
   {
      /* Scan By routine */
      /* Using cursor T01SF19 */
      pr_default.execute(17, new Object[] {A396EmprCod});
      RcdFound111 = (short)(0) ;
      if ( (pr_default.getStatus(17) != 101) )
      {
         RcdFound111 = (short)(1) ;
         A859CumCodCont = T01SF19_A859CumCodCont[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A859CumCodCont", GXutil.ltrimstr( DecimalUtil.doubleToDec(A859CumCodCont), 8, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1SF111( )
   {
      /* Scan next routine */
      pr_default.readNext(17);
      RcdFound111 = (short)(0) ;
      if ( (pr_default.getStatus(17) != 101) )
      {
         RcdFound111 = (short)(1) ;
         A859CumCodCont = T01SF19_A859CumCodCont[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A859CumCodCont", GXutil.ltrimstr( DecimalUtil.doubleToDec(A859CumCodCont), 8, 0));
      }
   }

   public void scanEnd1SF111( )
   {
      pr_default.close(17);
   }

   public void afterConfirm1SF111( )
   {
      /* After Confirm Rules */
      if ( (0==A859CumCodCont) && true /* After */ )
      {
         GXv_int8[0] = A859CumCodCont ;
         new app.pnumdoc(remoteHandle, context).execute( A396EmprCod, "111111", GXv_int8) ;
         consumomanual_impl.this.A859CumCodCont = GXv_int8[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A859CumCodCont", GXutil.ltrimstr( DecimalUtil.doubleToDec(A859CumCodCont), 8, 0));
      }
   }

   public void beforeInsert1SF111( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1SF111( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1SF111( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1SF111( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1SF111( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1SF111( )
   {
      edtCumCodCont_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCumCodCont_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCumCodCont_Enabled), 5, 0), true);
      edtCumConFec_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCumConFec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCumConFec_Enabled), 5, 0), true);
      edtCumCCos_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCumCCos_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCumCCos_Enabled), 5, 0), true);
      edtCC_AlmCd_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCC_AlmCd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCC_AlmCd_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      edtavCombocumccos_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCombocumccos_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCombocumccos_Enabled), 5, 0), true);
      edtavCombocc_almcd_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCombocc_almcd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCombocc_almcd_Enabled), 5, 0), true);
      edtEmpNumDec_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmpNumDec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmpNumDec_Enabled), 5, 0), true);
   }

   public void zm1SF112( int GX_JID )
   {
      if ( ( GX_JID == 62 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z8639CumUnidad = T01SF3_A8639CumUnidad[0] ;
            Z5862CumConLot = T01SF3_A5862CumConLot[0] ;
            Z861CumConCbis = T01SF3_A861CumConCbis[0] ;
            Z860CumConCant = T01SF3_A860CumConCant[0] ;
            Z12257PrdComID = T01SF3_A12257PrdComID[0] ;
            Z12700CumUMed = T01SF3_A12700CumUMed[0] ;
            Z14039CumLotAlm = T01SF3_A14039CumLotAlm[0] ;
            Z490ForPrdUMe = T01SF3_A490ForPrdUMe[0] ;
         }
         else
         {
            Z8639CumUnidad = A8639CumUnidad ;
            Z5862CumConLot = A5862CumConLot ;
            Z861CumConCbis = A861CumConCbis ;
            Z860CumConCant = A860CumConCant ;
            Z12257PrdComID = A12257PrdComID ;
            Z12700CumUMed = A12700CumUMed ;
            Z14039CumLotAlm = A14039CumLotAlm ;
            Z490ForPrdUMe = A490ForPrdUMe ;
         }
      }
      if ( ( GX_JID == 63 ) || ( GX_JID == 0 ) )
      {
         Z718PrdNom = T01SF5_A718PrdNom[0] ;
         Z707PrdFacCon = T01SF5_A707PrdFacCon[0] ;
         Z705PrdExiCC = T01SF5_A705PrdExiCC[0] ;
         Z685PrdCanRes = T01SF5_A685PrdCanRes[0] ;
         Z724PrdPreAct = T01SF5_A724PrdPreAct[0] ;
         Z726PrdPreMed = T01SF5_A726PrdPreMed[0] ;
         Z10881PrdLote = T01SF5_A10881PrdLote[0] ;
         Z856ValCod = T01SF5_A856ValCod[0] ;
      }
      if ( GX_JID == -62 )
      {
         Z859CumCodCont = A859CumCodCont ;
         Z8639CumUnidad = A8639CumUnidad ;
         Z5862CumConLot = A5862CumConLot ;
         Z861CumConCbis = A861CumConCbis ;
         Z860CumConCant = A860CumConCant ;
         Z12257PrdComID = A12257PrdComID ;
         Z12700CumUMed = A12700CumUMed ;
         Z14039CumLotAlm = A14039CumLotAlm ;
         Z396EmprCod = A396EmprCod ;
         Z719PrdNum = A719PrdNum ;
         Z490ForPrdUMe = A490ForPrdUMe ;
         Z488ForPrdDsc = A488ForPrdDsc ;
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

   public void standaloneNotModal1SF112( )
   {
      edtPrdExiAlm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdExiAlm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdExiAlm_Enabled), 5, 0), !bGXsfl_59_Refreshing);
      edtPrdNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNom_Enabled), 5, 0), !bGXsfl_59_Refreshing);
      edtCumCosPro_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCumCosPro_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCumCosPro_Enabled), 5, 0), !bGXsfl_59_Refreshing);
      edtPrdPreAct_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdPreAct_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdPreAct_Enabled), 5, 0), !bGXsfl_59_Refreshing);
      edtPrdPreMed_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdPreMed_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdPreMed_Enabled), 5, 0), !bGXsfl_59_Refreshing);
      edtUltFecCCs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtUltFecCCs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtUltFecCCs_Enabled), 5, 0), !bGXsfl_59_Refreshing);
      edtPrdValStk_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdValStk_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdValStk_Enabled), 5, 0), !bGXsfl_59_Refreshing);
      edtForPrdUMe_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtForPrdUMe_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForPrdUMe_Enabled), 5, 0), !bGXsfl_59_Refreshing);
      edtForPrdDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtForPrdDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForPrdDsc_Enabled), 5, 0), !bGXsfl_59_Refreshing);
      edtPrdComID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdComID_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdComID_Enabled), 5, 0), !bGXsfl_59_Refreshing);
      edtPrdLote_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdLote_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdLote_Enabled), 5, 0), !bGXsfl_59_Refreshing);
      cmbCumUMed.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbCumUMed.getInternalname(), "Enabled", GXutil.ltrimstr( cmbCumUMed.getEnabled(), 5, 0), !bGXsfl_59_Refreshing);
      edtCumLotAlm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCumLotAlm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCumLotAlm_Enabled), 5, 0), !bGXsfl_59_Refreshing);
      edtValCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtValCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtValCod_Enabled), 5, 0), !bGXsfl_59_Refreshing);
   }

   public void standaloneModal1SF112( )
   {
      if ( isIns( )  && (0==A8639CumUnidad) && ( Gx_BScreen == 0 ) )
      {
         A8639CumUnidad = (byte)(AV23ConMan) ;
      }
      /* Using cursor T01SF6 */
      pr_default.execute(4, new Object[] {A396EmprCod, Byte.valueOf(A490ForPrdUMe)});
      if ( (pr_default.getStatus(4) == 101) )
      {
         GXCCtl = "FORPRDUME_" + sGXsfl_59_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "UNMEPR", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
      }
      A488ForPrdDsc = T01SF6_A488ForPrdDsc[0] ;
      n488ForPrdDsc = T01SF6_n488ForPrdDsc[0] ;
      pr_default.close(4);
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtPrdNum_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtPrdNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNum_Enabled), 5, 0), !bGXsfl_59_Refreshing);
      }
      else
      {
         edtPrdNum_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtPrdNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNum_Enabled), 5, 0), !bGXsfl_59_Refreshing);
      }
   }

   public void load1SF112( )
   {
      /* Using cursor T01SF20 */
      pr_default.execute(18, new Object[] {A396EmprCod, Integer.valueOf(A859CumCodCont), A719PrdNum});
      if ( (pr_default.getStatus(18) != 101) )
      {
         RcdFound112 = (short)(1) ;
         A8639CumUnidad = T01SF20_A8639CumUnidad[0] ;
         A5862CumConLot = T01SF20_A5862CumConLot[0] ;
         A861CumConCbis = T01SF20_A861CumConCbis[0] ;
         A704PrdExiAlm = T01SF20_A704PrdExiAlm[0] ;
         A750PrdValStk = T01SF20_A750PrdValStk[0] ;
         A718PrdNom = T01SF20_A718PrdNom[0] ;
         A707PrdFacCon = T01SF20_A707PrdFacCon[0] ;
         A705PrdExiCC = T01SF20_A705PrdExiCC[0] ;
         A685PrdCanRes = T01SF20_A685PrdCanRes[0] ;
         A860CumConCant = T01SF20_A860CumConCant[0] ;
         A724PrdPreAct = T01SF20_A724PrdPreAct[0] ;
         A726PrdPreMed = T01SF20_A726PrdPreMed[0] ;
         A488ForPrdDsc = T01SF20_A488ForPrdDsc[0] ;
         n488ForPrdDsc = T01SF20_n488ForPrdDsc[0] ;
         A12257PrdComID = T01SF20_A12257PrdComID[0] ;
         A10881PrdLote = T01SF20_A10881PrdLote[0] ;
         A12700CumUMed = T01SF20_A12700CumUMed[0] ;
         A14039CumLotAlm = T01SF20_A14039CumLotAlm[0] ;
         A490ForPrdUMe = T01SF20_A490ForPrdUMe[0] ;
         A856ValCod = T01SF20_A856ValCod[0] ;
         zm1SF112( -62) ;
      }
      pr_default.close(18);
      onLoadActions1SF112( ) ;
   }

   public void onLoadActions1SF112( )
   {
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
         AV27CumConOld = (O860CumConCant.divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN)).multiply(A707PrdFacCon) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV27CumConOld", GXutil.ltrimstr( AV27CumConOld, 12, 4));
      }
      else
      {
         if ( A8639CumUnidad == 1 )
         {
            AV27CumConOld = O860CumConCant.multiply(A707PrdFacCon) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV27CumConOld", GXutil.ltrimstr( AV27CumConOld, 12, 4));
         }
      }
      if ( A3915EmpNumDec == 0 )
      {
         A863CumCosPro = GXutil.roundDecimal( A861CumConCbis.multiply(A724PrdPreAct), 0) ;
      }
      else
      {
         if ( A3915EmpNumDec == 2 )
         {
            A863CumCosPro = GXutil.roundDecimal( A861CumConCbis.multiply(A724PrdPreAct), 2) ;
         }
         else
         {
            A863CumCosPro = DecimalUtil.doubleToDec(0) ;
         }
      }
      if ( isIns( )  && (GXutil.strcmp("", A5862CumConLot)==0) && ( Gx_BScreen == 0 ) )
      {
         A5862CumConLot = A10881PrdLote ;
      }
      GXt_date13 = A3835UltFecCCs ;
      GXv_char4[0] = A396EmprCod ;
      GXv_char3[0] = A719PrdNum ;
      GXv_date14[0] = GXt_date13 ;
      new app.pstm005(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_date14) ;
      consumomanual_impl.this.A396EmprCod = GXv_char4[0] ;
      consumomanual_impl.this.A719PrdNum = GXv_char3[0] ;
      consumomanual_impl.this.GXt_date13 = GXv_date14[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A3835UltFecCCs = GXt_date13 ;
      if ( isDlt( )  )
      {
         A704PrdExiAlm = O704PrdExiAlm.add(O861CumConCbis) ;
      }
      else
      {
         if ( isIns( )  || isUpd( )  || isDlt( )  )
         {
            A704PrdExiAlm = O704PrdExiAlm.subtract(A861CumConCbis).add(O861CumConCbis) ;
         }
      }
   }

   public void checkExtendedTable1SF112( )
   {
      nIsDirty_112 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal1SF112( ) ;
      /* Using cursor T01SF5 */
      pr_default.execute(3, new Object[] {A396EmprCod, A719PrdNum});
      if ( (pr_default.getStatus(3) == 101) )
      {
         GXCCtl = "PRDNUM_" + sGXsfl_59_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PRODUC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtPrdNum_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A704PrdExiAlm = T01SF5_A704PrdExiAlm[0] ;
      A750PrdValStk = T01SF5_A750PrdValStk[0] ;
      A718PrdNom = T01SF5_A718PrdNom[0] ;
      A707PrdFacCon = T01SF5_A707PrdFacCon[0] ;
      A705PrdExiCC = T01SF5_A705PrdExiCC[0] ;
      A685PrdCanRes = T01SF5_A685PrdCanRes[0] ;
      A724PrdPreAct = T01SF5_A724PrdPreAct[0] ;
      A726PrdPreMed = T01SF5_A726PrdPreMed[0] ;
      A10881PrdLote = T01SF5_A10881PrdLote[0] ;
      A856ValCod = T01SF5_A856ValCod[0] ;
      nIsDirty_112 = (short)(1) ;
      O750PrdValStk = A750PrdValStk ;
      nIsDirty_112 = (short)(1) ;
      O704PrdExiAlm = A704PrdExiAlm ;
      pr_default.close(3);
      if ( A8639CumUnidad == 0 )
      {
         nIsDirty_112 = (short)(1) ;
         A861CumConCbis = (A860CumConCant.divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN)).multiply(A707PrdFacCon) ;
      }
      else
      {
         if ( A8639CumUnidad == 1 )
         {
            nIsDirty_112 = (short)(1) ;
            A861CumConCbis = A860CumConCant.multiply(A707PrdFacCon) ;
         }
      }
      if ( A8639CumUnidad == 0 )
      {
         AV27CumConOld = (O860CumConCant.divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN)).multiply(A707PrdFacCon) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV27CumConOld", GXutil.ltrimstr( AV27CumConOld, 12, 4));
      }
      else
      {
         if ( A8639CumUnidad == 1 )
         {
            AV27CumConOld = O860CumConCant.multiply(A707PrdFacCon) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV27CumConOld", GXutil.ltrimstr( AV27CumConOld, 12, 4));
         }
      }
      if ( A3915EmpNumDec == 0 )
      {
         nIsDirty_112 = (short)(1) ;
         A863CumCosPro = GXutil.roundDecimal( A861CumConCbis.multiply(A724PrdPreAct), 0) ;
      }
      else
      {
         if ( A3915EmpNumDec == 2 )
         {
            nIsDirty_112 = (short)(1) ;
            A863CumCosPro = GXutil.roundDecimal( A861CumConCbis.multiply(A724PrdPreAct), 2) ;
         }
         else
         {
            nIsDirty_112 = (short)(1) ;
            A863CumCosPro = DecimalUtil.doubleToDec(0) ;
         }
      }
      if ( isIns( )  && (GXutil.strcmp("", A5862CumConLot)==0) && ( Gx_BScreen == 0 ) )
      {
         nIsDirty_112 = (short)(1) ;
         A5862CumConLot = A10881PrdLote ;
      }
      nIsDirty_112 = (short)(1) ;
      GXt_date13 = A3835UltFecCCs ;
      GXv_char4[0] = A396EmprCod ;
      GXv_char3[0] = A719PrdNum ;
      GXv_date14[0] = GXt_date13 ;
      new app.pstm005(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_date14) ;
      consumomanual_impl.this.A396EmprCod = GXv_char4[0] ;
      consumomanual_impl.this.A719PrdNum = GXv_char3[0] ;
      consumomanual_impl.this.GXt_date13 = GXv_date14[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A3835UltFecCCs = GXt_date13 ;
      if ( isDlt( )  )
      {
         nIsDirty_112 = (short)(1) ;
         A704PrdExiAlm = O704PrdExiAlm.add(O861CumConCbis) ;
      }
      else
      {
         if ( isIns( )  || isUpd( )  || isDlt( )  )
         {
            nIsDirty_112 = (short)(1) ;
            A704PrdExiAlm = O704PrdExiAlm.subtract(A861CumConCbis).add(O861CumConCbis) ;
         }
      }
      if ( ( A704PrdExiAlm.doubleValue() < 0 ) && ( GXutil.strcmp(GXutil.substring( A719PrdNum, 1, 1), "0") != 0 ) )
      {
         GXCCtl = "PRDNUM_" + sGXsfl_59_idx ;
         httpContext.GX_msglist.addItem(httpContext.getMessage( "AVISO.Cantidad Insuficiente", ""), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtPrdNum_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
   }

   public void closeExtendedTableCursors1SF112( )
   {
      pr_default.close(2);
   }

   public void enableDisable1SF112( )
   {
   }

   public void gxload_63( String A396EmprCod ,
                          String A719PrdNum )
   {
      /* Using cursor T01SF5 */
      pr_default.execute(3, new Object[] {A396EmprCod, A719PrdNum});
      if ( (pr_default.getStatus(3) == 101) )
      {
         GXCCtl = "PRDNUM_" + sGXsfl_59_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PRODUC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtPrdNum_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A704PrdExiAlm = T01SF5_A704PrdExiAlm[0] ;
      A750PrdValStk = T01SF5_A750PrdValStk[0] ;
      A718PrdNom = T01SF5_A718PrdNom[0] ;
      A707PrdFacCon = T01SF5_A707PrdFacCon[0] ;
      A705PrdExiCC = T01SF5_A705PrdExiCC[0] ;
      A685PrdCanRes = T01SF5_A685PrdCanRes[0] ;
      A724PrdPreAct = T01SF5_A724PrdPreAct[0] ;
      A726PrdPreMed = T01SF5_A726PrdPreMed[0] ;
      A10881PrdLote = T01SF5_A10881PrdLote[0] ;
      A856ValCod = T01SF5_A856ValCod[0] ;
      O750PrdValStk = A750PrdValStk ;
      O704PrdExiAlm = A704PrdExiAlm ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A704PrdExiAlm, (byte)(12), (byte)(4), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A750PrdValStk, (byte)(11), (byte)(2), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A718PrdNom))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A707PrdFacCon, (byte)(7), (byte)(4), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A705PrdExiCC, (byte)(12), (byte)(4), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A685PrdCanRes, (byte)(12), (byte)(4), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A724PrdPreAct, (byte)(14), (byte)(5), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A726PrdPreMed, (byte)(14), (byte)(5), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A10881PrdLote))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A856ValCod, (byte)(1), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(3) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(3);
   }

   public void getKey1SF112( )
   {
      /* Using cursor T01SF21 */
      pr_default.execute(19, new Object[] {A396EmprCod, Integer.valueOf(A859CumCodCont), A719PrdNum});
      if ( (pr_default.getStatus(19) != 101) )
      {
         RcdFound112 = (short)(1) ;
      }
      else
      {
         RcdFound112 = (short)(0) ;
      }
      pr_default.close(19);
   }

   public void getByPrimaryKey1SF112( )
   {
      /* Using cursor T01SF3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A859CumCodCont), A719PrdNum});
      if ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(T01SF3_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1SF112( 62) ;
         RcdFound112 = (short)(1) ;
         initializeNonKey1SF112( ) ;
         A8639CumUnidad = T01SF3_A8639CumUnidad[0] ;
         A5862CumConLot = T01SF3_A5862CumConLot[0] ;
         A861CumConCbis = T01SF3_A861CumConCbis[0] ;
         A860CumConCant = T01SF3_A860CumConCant[0] ;
         A12257PrdComID = T01SF3_A12257PrdComID[0] ;
         A12700CumUMed = T01SF3_A12700CumUMed[0] ;
         A14039CumLotAlm = T01SF3_A14039CumLotAlm[0] ;
         A719PrdNum = T01SF3_A719PrdNum[0] ;
         A490ForPrdUMe = T01SF3_A490ForPrdUMe[0] ;
         O861CumConCbis = A861CumConCbis ;
         O860CumConCant = A860CumConCant ;
         Z396EmprCod = A396EmprCod ;
         Z859CumCodCont = A859CumCodCont ;
         Z719PrdNum = A719PrdNum ;
         sMode112 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load1SF112( ) ;
         Gx_mode = sMode112 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound112 = (short)(0) ;
         initializeNonKey1SF112( ) ;
         sMode112 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1SF112( ) ;
         Gx_mode = sMode112 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1SF112( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency1SF112( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01SF2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A859CumCodCont), A719PrdNum});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPLCUMCO"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( Z8639CumUnidad != T01SF2_A8639CumUnidad[0] ) || ( GXutil.strcmp(Z5862CumConLot, T01SF2_A5862CumConLot[0]) != 0 ) || ( DecimalUtil.compareTo(Z861CumConCbis, T01SF2_A861CumConCbis[0]) != 0 ) || ( DecimalUtil.compareTo(Z860CumConCant, T01SF2_A860CumConCant[0]) != 0 ) || ( GXutil.strcmp(Z12257PrdComID, T01SF2_A12257PrdComID[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z12700CumUMed != T01SF2_A12700CumUMed[0] ) || ( Z14039CumLotAlm != T01SF2_A14039CumLotAlm[0] ) || ( Z490ForPrdUMe != T01SF2_A490ForPrdUMe[0] ) )
         {
            if ( Z8639CumUnidad != T01SF2_A8639CumUnidad[0] )
            {
               GXutil.writeLogln("stocksquimicos.consumomanual:[seudo value changed for attri]"+"CumUnidad");
               GXutil.writeLogRaw("Old: ",Z8639CumUnidad);
               GXutil.writeLogRaw("Current: ",T01SF2_A8639CumUnidad[0]);
            }
            if ( GXutil.strcmp(Z5862CumConLot, T01SF2_A5862CumConLot[0]) != 0 )
            {
               GXutil.writeLogln("stocksquimicos.consumomanual:[seudo value changed for attri]"+"CumConLot");
               GXutil.writeLogRaw("Old: ",Z5862CumConLot);
               GXutil.writeLogRaw("Current: ",T01SF2_A5862CumConLot[0]);
            }
            if ( DecimalUtil.compareTo(Z861CumConCbis, T01SF2_A861CumConCbis[0]) != 0 )
            {
               GXutil.writeLogln("stocksquimicos.consumomanual:[seudo value changed for attri]"+"CumConCbis");
               GXutil.writeLogRaw("Old: ",Z861CumConCbis);
               GXutil.writeLogRaw("Current: ",T01SF2_A861CumConCbis[0]);
            }
            if ( DecimalUtil.compareTo(Z860CumConCant, T01SF2_A860CumConCant[0]) != 0 )
            {
               GXutil.writeLogln("stocksquimicos.consumomanual:[seudo value changed for attri]"+"CumConCant");
               GXutil.writeLogRaw("Old: ",Z860CumConCant);
               GXutil.writeLogRaw("Current: ",T01SF2_A860CumConCant[0]);
            }
            if ( GXutil.strcmp(Z12257PrdComID, T01SF2_A12257PrdComID[0]) != 0 )
            {
               GXutil.writeLogln("stocksquimicos.consumomanual:[seudo value changed for attri]"+"PrdComID");
               GXutil.writeLogRaw("Old: ",Z12257PrdComID);
               GXutil.writeLogRaw("Current: ",T01SF2_A12257PrdComID[0]);
            }
            if ( Z12700CumUMed != T01SF2_A12700CumUMed[0] )
            {
               GXutil.writeLogln("stocksquimicos.consumomanual:[seudo value changed for attri]"+"CumUMed");
               GXutil.writeLogRaw("Old: ",Z12700CumUMed);
               GXutil.writeLogRaw("Current: ",T01SF2_A12700CumUMed[0]);
            }
            if ( Z14039CumLotAlm != T01SF2_A14039CumLotAlm[0] )
            {
               GXutil.writeLogln("stocksquimicos.consumomanual:[seudo value changed for attri]"+"CumLotAlm");
               GXutil.writeLogRaw("Old: ",Z14039CumLotAlm);
               GXutil.writeLogRaw("Current: ",T01SF2_A14039CumLotAlm[0]);
            }
            if ( Z490ForPrdUMe != T01SF2_A490ForPrdUMe[0] )
            {
               GXutil.writeLogln("stocksquimicos.consumomanual:[seudo value changed for attri]"+"ForPrdUMe");
               GXutil.writeLogRaw("Old: ",Z490ForPrdUMe);
               GXutil.writeLogRaw("Current: ",T01SF2_A490ForPrdUMe[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPLCUMCO"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
      /* Using cursor T01SF22 */
      pr_default.execute(20, new Object[] {A396EmprCod, A719PrdNum});
      if ( (pr_default.getStatus(20) == 103) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPPRODUC"}), "RecordIsLocked", 1, "");
         AnyError = (short)(1) ;
         return  ;
      }
      if ( ! isIns( ) )
      {
         Gx_longc = false ;
         if ( false || ( GXutil.strcmp(Z718PrdNom, T01SF22_A718PrdNom[0]) != 0 ) || ( DecimalUtil.compareTo(Z707PrdFacCon, T01SF22_A707PrdFacCon[0]) != 0 ) || ( DecimalUtil.compareTo(Z705PrdExiCC, T01SF22_A705PrdExiCC[0]) != 0 ) || ( DecimalUtil.compareTo(Z685PrdCanRes, T01SF22_A685PrdCanRes[0]) != 0 ) || ( DecimalUtil.compareTo(Z724PrdPreAct, T01SF22_A724PrdPreAct[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( DecimalUtil.compareTo(Z726PrdPreMed, T01SF22_A726PrdPreMed[0]) != 0 ) || ( GXutil.strcmp(Z10881PrdLote, T01SF22_A10881PrdLote[0]) != 0 ) || ( Z856ValCod != T01SF22_A856ValCod[0] ) )
         {
            if ( GXutil.strcmp(Z718PrdNom, T01SF22_A718PrdNom[0]) != 0 )
            {
               GXutil.writeLogln("stocksquimicos.consumomanual:[seudo value changed for attri]"+"PrdNom");
               GXutil.writeLogRaw("Old: ",Z718PrdNom);
               GXutil.writeLogRaw("Current: ",T01SF22_A718PrdNom[0]);
            }
            if ( DecimalUtil.compareTo(Z707PrdFacCon, T01SF22_A707PrdFacCon[0]) != 0 )
            {
               GXutil.writeLogln("stocksquimicos.consumomanual:[seudo value changed for attri]"+"PrdFacCon");
               GXutil.writeLogRaw("Old: ",Z707PrdFacCon);
               GXutil.writeLogRaw("Current: ",T01SF22_A707PrdFacCon[0]);
            }
            if ( DecimalUtil.compareTo(Z705PrdExiCC, T01SF22_A705PrdExiCC[0]) != 0 )
            {
               GXutil.writeLogln("stocksquimicos.consumomanual:[seudo value changed for attri]"+"PrdExiCC");
               GXutil.writeLogRaw("Old: ",Z705PrdExiCC);
               GXutil.writeLogRaw("Current: ",T01SF22_A705PrdExiCC[0]);
            }
            if ( DecimalUtil.compareTo(Z685PrdCanRes, T01SF22_A685PrdCanRes[0]) != 0 )
            {
               GXutil.writeLogln("stocksquimicos.consumomanual:[seudo value changed for attri]"+"PrdCanRes");
               GXutil.writeLogRaw("Old: ",Z685PrdCanRes);
               GXutil.writeLogRaw("Current: ",T01SF22_A685PrdCanRes[0]);
            }
            if ( DecimalUtil.compareTo(Z724PrdPreAct, T01SF22_A724PrdPreAct[0]) != 0 )
            {
               GXutil.writeLogln("stocksquimicos.consumomanual:[seudo value changed for attri]"+"PrdPreAct");
               GXutil.writeLogRaw("Old: ",Z724PrdPreAct);
               GXutil.writeLogRaw("Current: ",T01SF22_A724PrdPreAct[0]);
            }
            if ( DecimalUtil.compareTo(Z726PrdPreMed, T01SF22_A726PrdPreMed[0]) != 0 )
            {
               GXutil.writeLogln("stocksquimicos.consumomanual:[seudo value changed for attri]"+"PrdPreMed");
               GXutil.writeLogRaw("Old: ",Z726PrdPreMed);
               GXutil.writeLogRaw("Current: ",T01SF22_A726PrdPreMed[0]);
            }
            if ( GXutil.strcmp(Z10881PrdLote, T01SF22_A10881PrdLote[0]) != 0 )
            {
               GXutil.writeLogln("stocksquimicos.consumomanual:[seudo value changed for attri]"+"PrdLote");
               GXutil.writeLogRaw("Old: ",Z10881PrdLote);
               GXutil.writeLogRaw("Current: ",T01SF22_A10881PrdLote[0]);
            }
            if ( Z856ValCod != T01SF22_A856ValCod[0] )
            {
               GXutil.writeLogln("stocksquimicos.consumomanual:[seudo value changed for attri]"+"ValCod");
               GXutil.writeLogRaw("Old: ",Z856ValCod);
               GXutil.writeLogRaw("Current: ",T01SF22_A856ValCod[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPPRODUC"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1SF112( )
   {
      beforeValidate1SF112( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1SF112( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1SF112( 0) ;
         checkOptimisticConcurrency1SF112( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1SF112( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1SF112( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01SF23 */
                  pr_default.execute(21, new Object[] {Integer.valueOf(A859CumCodCont), Byte.valueOf(A8639CumUnidad), A5862CumConLot, A861CumConCbis, A860CumConCant, A12257PrdComID, Byte.valueOf(A12700CumUMed), Short.valueOf(A14039CumLotAlm), A396EmprCod, A719PrdNum, Byte.valueOf(A490ForPrdUMe)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLCUMCO");
                  if ( (pr_default.getStatus(21) == 1) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
                     AnyError = (short)(1) ;
                  }
                  if ( AnyError == 0 )
                  {
                     updateTablesN11SF112( ) ;
                     /* Start of After( Insert) rules */
                     if ( ( DecimalUtil.compareTo(A860CumConCant, AV27CumConOld) != 0 ) && ( true /* After */ || true /* After */ ) && ( AV30FlagPreMed == 1 ) )
                     {
                        new app.pentpr2(remoteHandle, context).execute( A396EmprCod, A719PrdNum, AV29Year, (byte)(AV28Mes), A861CumConCbis, AV27CumConOld, A726PrdPreMed, A862CumConFec) ;
                     }
                     if ( ( DecimalUtil.compareTo(A860CumConCant, AV27CumConOld) != 0 ) && ( true /* After */ || true /* After */ ) && ( AV30FlagPreMed == 0 ) )
                     {
                        new app.pentpr2(remoteHandle, context).execute( A396EmprCod, A719PrdNum, AV29Year, (byte)(AV28Mes), A861CumConCbis, AV27CumConOld, A724PrdPreAct, A862CumConFec) ;
                     }
                     if ( ( DecimalUtil.compareTo(A860CumConCant, AV27CumConOld) != 0 ) && ( true /* After */ && true /* After */ ) && ( AV30FlagPreMed == 1 ) )
                     {
                        new app.pnewcc8(remoteHandle, context).execute( A396EmprCod, A719PrdNum, DecimalUtil.doubleToDec(0), A861CumConCbis, httpContext.getMessage( "SM", ""), "1", A726PrdPreMed, 0, (byte)(0), " ", A859CumCodCont, " ", AV9UsurCod, httpContext.getMessage( "Consumo Manual Almacen,WEB", ""), (short)(0), AV27CumConOld, DecimalUtil.doubleToDec(0), A862CumConFec, A10777CumCCos, A5862CumConLot) ;
                     }
                     if ( ( DecimalUtil.compareTo(A860CumConCant, AV27CumConOld) != 0 ) && ( true /* After */ || true /* After */ ) && ( AV30FlagPreMed == 0 ) )
                     {
                        new app.pnewcc8(remoteHandle, context).execute( A396EmprCod, A719PrdNum, DecimalUtil.doubleToDec(0), A861CumConCbis, httpContext.getMessage( "SM", ""), "1", A724PrdPreAct, 0, (byte)(0), " ", A859CumCodCont, " ", AV9UsurCod, httpContext.getMessage( "Consumo Manual Almacen,WEB", ""), (short)(0), AV27CumConOld, DecimalUtil.doubleToDec(0), A862CumConFec, A10777CumCCos, A5862CumConLot) ;
                     }
                     /* End of After( Insert) rules */
                     if ( AnyError == 0 )
                     {
                        /* Save values for previous() function. */
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
            load1SF112( ) ;
         }
         endLevel1SF112( ) ;
      }
      closeExtendedTableCursors1SF112( ) ;
   }

   public void update1SF112( )
   {
      beforeValidate1SF112( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1SF112( ) ;
      }
      if ( ( nIsMod_112 != 0 ) || ( nIsDirty_112 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency1SF112( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm1SF112( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate1SF112( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T01SF24 */
                     pr_default.execute(22, new Object[] {Byte.valueOf(A8639CumUnidad), A5862CumConLot, A861CumConCbis, A860CumConCant, A12257PrdComID, Byte.valueOf(A12700CumUMed), Short.valueOf(A14039CumLotAlm), Byte.valueOf(A490ForPrdUMe), A396EmprCod, Integer.valueOf(A859CumCodCont), A719PrdNum});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLCUMCO");
                     if ( (pr_default.getStatus(22) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPLCUMCO"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate1SF112( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        if ( ( DecimalUtil.compareTo(A860CumConCant, AV27CumConOld) != 0 ) && ( true /* After */ || true /* After */ ) && ( AV30FlagPreMed == 1 ) )
                        {
                           new app.pentpr2(remoteHandle, context).execute( A396EmprCod, A719PrdNum, AV29Year, (byte)(AV28Mes), A861CumConCbis, AV27CumConOld, A726PrdPreMed, A862CumConFec) ;
                        }
                        if ( ( DecimalUtil.compareTo(A860CumConCant, AV27CumConOld) != 0 ) && ( true /* After */ || true /* After */ ) && ( AV30FlagPreMed == 0 ) )
                        {
                           new app.pentpr2(remoteHandle, context).execute( A396EmprCod, A719PrdNum, AV29Year, (byte)(AV28Mes), A861CumConCbis, AV27CumConOld, A724PrdPreAct, A862CumConFec) ;
                        }
                        if ( ( DecimalUtil.compareTo(A860CumConCant, AV27CumConOld) != 0 ) && ( true /* After */ && true /* After */ ) && ( AV30FlagPreMed == 1 ) )
                        {
                           new app.pnewcc8(remoteHandle, context).execute( A396EmprCod, A719PrdNum, DecimalUtil.doubleToDec(0), A861CumConCbis, httpContext.getMessage( "SM", ""), "1", A726PrdPreMed, 0, (byte)(0), " ", A859CumCodCont, " ", AV9UsurCod, httpContext.getMessage( "Consumo Manual Almacen,WEB", ""), (short)(0), AV27CumConOld, DecimalUtil.doubleToDec(0), A862CumConFec, A10777CumCCos, A5862CumConLot) ;
                        }
                        if ( ( DecimalUtil.compareTo(A860CumConCant, AV27CumConOld) != 0 ) && ( true /* After */ || true /* After */ ) && ( AV30FlagPreMed == 0 ) )
                        {
                           new app.pnewcc8(remoteHandle, context).execute( A396EmprCod, A719PrdNum, DecimalUtil.doubleToDec(0), A861CumConCbis, httpContext.getMessage( "SM", ""), "1", A724PrdPreAct, 0, (byte)(0), " ", A859CumCodCont, " ", AV9UsurCod, httpContext.getMessage( "Consumo Manual Almacen,WEB", ""), (short)(0), AV27CumConOld, DecimalUtil.doubleToDec(0), A862CumConFec, A10777CumCCos, A5862CumConLot) ;
                        }
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           updateTablesN11SF112( ) ;
                           getByPrimaryKey1SF112( ) ;
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
            endLevel1SF112( ) ;
         }
      }
      closeExtendedTableCursors1SF112( ) ;
   }

   public void deferredUpdate1SF112( )
   {
   }

   public void delete1SF112( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1SF112( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1SF112( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1SF112( ) ;
         afterConfirm1SF112( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1SF112( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01SF25 */
               pr_default.execute(23, new Object[] {A396EmprCod, Integer.valueOf(A859CumCodCont), A719PrdNum});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLCUMCO");
               if ( AnyError == 0 )
               {
                  updateTablesN11SF112( ) ;
                  /* Start of After( delete) rules */
                  if ( true /* After */ && true /* Level */ )
                  {
                     new app.peliccsag(remoteHandle, context).execute( A396EmprCod, A719PrdNum, A859CumCodCont) ;
                  }
                  if ( true /* After */ && true /* Level */ && ( AV30FlagPreMed == 0 ) )
                  {
                     new app.pacesp2(remoteHandle, context).execute( A396EmprCod, A719PrdNum, A862CumConFec, A861CumConCbis, A724PrdPreAct) ;
                  }
                  if ( true /* After */ && true /* Level */ && ( AV30FlagPreMed == 1 ) )
                  {
                     new app.pacesp2(remoteHandle, context).execute( A396EmprCod, A719PrdNum, A862CumConFec, A861CumConCbis, A726PrdPreMed) ;
                  }
                  /* End of After( delete) rules */
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
      endLevel1SF112( ) ;
      Gx_mode = sMode112 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1SF112( )
   {
      standaloneModal1SF112( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T01SF26 */
         pr_default.execute(24, new Object[] {A396EmprCod, A719PrdNum});
         Z718PrdNom = T01SF26_A718PrdNom[0] ;
         Z707PrdFacCon = T01SF26_A707PrdFacCon[0] ;
         Z705PrdExiCC = T01SF26_A705PrdExiCC[0] ;
         Z685PrdCanRes = T01SF26_A685PrdCanRes[0] ;
         Z724PrdPreAct = T01SF26_A724PrdPreAct[0] ;
         Z726PrdPreMed = T01SF26_A726PrdPreMed[0] ;
         Z10881PrdLote = T01SF26_A10881PrdLote[0] ;
         Z856ValCod = T01SF26_A856ValCod[0] ;
         A704PrdExiAlm = T01SF26_A704PrdExiAlm[0] ;
         A750PrdValStk = T01SF26_A750PrdValStk[0] ;
         A718PrdNom = T01SF26_A718PrdNom[0] ;
         A707PrdFacCon = T01SF26_A707PrdFacCon[0] ;
         A705PrdExiCC = T01SF26_A705PrdExiCC[0] ;
         A685PrdCanRes = T01SF26_A685PrdCanRes[0] ;
         A724PrdPreAct = T01SF26_A724PrdPreAct[0] ;
         A726PrdPreMed = T01SF26_A726PrdPreMed[0] ;
         A10881PrdLote = T01SF26_A10881PrdLote[0] ;
         A856ValCod = T01SF26_A856ValCod[0] ;
         O750PrdValStk = A750PrdValStk ;
         O704PrdExiAlm = A704PrdExiAlm ;
         pr_default.close(24);
         GXt_date13 = A3835UltFecCCs ;
         GXv_char4[0] = A396EmprCod ;
         GXv_char3[0] = A719PrdNum ;
         GXv_date14[0] = GXt_date13 ;
         new app.pstm005(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_date14) ;
         consumomanual_impl.this.A396EmprCod = GXv_char4[0] ;
         consumomanual_impl.this.A719PrdNum = GXv_char3[0] ;
         consumomanual_impl.this.GXt_date13 = GXv_date14[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A3835UltFecCCs = GXt_date13 ;
         if ( A8639CumUnidad == 0 )
         {
            AV27CumConOld = (O860CumConCant.divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN)).multiply(A707PrdFacCon) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV27CumConOld", GXutil.ltrimstr( AV27CumConOld, 12, 4));
         }
         else
         {
            if ( A8639CumUnidad == 1 )
            {
               AV27CumConOld = O860CumConCant.multiply(A707PrdFacCon) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV27CumConOld", GXutil.ltrimstr( AV27CumConOld, 12, 4));
            }
         }
         if ( A3915EmpNumDec == 0 )
         {
            A863CumCosPro = GXutil.roundDecimal( A861CumConCbis.multiply(A724PrdPreAct), 0) ;
         }
         else
         {
            if ( A3915EmpNumDec == 2 )
            {
               A863CumCosPro = GXutil.roundDecimal( A861CumConCbis.multiply(A724PrdPreAct), 2) ;
            }
            else
            {
               A863CumCosPro = DecimalUtil.doubleToDec(0) ;
            }
         }
         if ( isDlt( )  )
         {
            A704PrdExiAlm = O704PrdExiAlm.add(O861CumConCbis) ;
         }
         else
         {
            if ( isIns( )  || isUpd( )  || isDlt( )  )
            {
               A704PrdExiAlm = O704PrdExiAlm.subtract(A861CumConCbis).add(O861CumConCbis) ;
            }
         }
      }
   }

   public void updateTablesN11SF112( )
   {
      /* Using cursor T01SF27 */
      pr_default.execute(25, new Object[] {A704PrdExiAlm, A750PrdValStk, A396EmprCod, A719PrdNum});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPRODUC");
   }

   public void endLevel1SF112( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      pr_default.close(20);
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1SF112( )
   {
      /* Scan By routine */
      /* Using cursor T01SF28 */
      pr_default.execute(26, new Object[] {A396EmprCod, Integer.valueOf(A859CumCodCont)});
      RcdFound112 = (short)(0) ;
      if ( (pr_default.getStatus(26) != 101) )
      {
         RcdFound112 = (short)(1) ;
         A719PrdNum = T01SF28_A719PrdNum[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1SF112( )
   {
      /* Scan next routine */
      pr_default.readNext(26);
      RcdFound112 = (short)(0) ;
      if ( (pr_default.getStatus(26) != 101) )
      {
         RcdFound112 = (short)(1) ;
         A719PrdNum = T01SF28_A719PrdNum[0] ;
      }
   }

   public void scanEnd1SF112( )
   {
      pr_default.close(26);
   }

   public void afterConfirm1SF112( )
   {
      /* After Confirm Rules */
      AV34CumConCbis = A861CumConCbis ;
      httpContext.ajax_rsp_assign_attri("", false, "AV34CumConCbis", GXutil.ltrimstr( AV34CumConCbis, 12, 4));
   }

   public void beforeInsert1SF112( )
   {
      /* Before Insert Rules */
      if ( ( AV25Moda21 == 1 ) && ! (GXutil.strcmp("", A5862CumConLot)==0) )
      {
         GXv_char4[0] = AV26Ok ;
         new app.plotectrl(remoteHandle, context).execute( A396EmprCod, A719PrdNum, A5862CumConLot, GXv_char4) ;
         consumomanual_impl.this.AV26Ok = GXv_char4[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV26Ok", AV26Ok);
      }
      if ( ( AV25Moda21 == 1 ) && ( GXutil.strcmp(AV26Ok, "N") == 0 ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Nao Existe LOTE ¡¡¡", ""), 1, "");
         AnyError = (short)(1) ;
      }
   }

   public void beforeUpdate1SF112( )
   {
      /* Before Update Rules */
      if ( ( AV25Moda21 == 1 ) && ! (GXutil.strcmp("", A5862CumConLot)==0) )
      {
         GXv_char4[0] = AV26Ok ;
         new app.plotectrl(remoteHandle, context).execute( A396EmprCod, A719PrdNum, A5862CumConLot, GXv_char4) ;
         consumomanual_impl.this.AV26Ok = GXv_char4[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV26Ok", AV26Ok);
      }
      if ( ( AV25Moda21 == 1 ) && ( GXutil.strcmp(AV26Ok, "N") == 0 ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Nao Existe LOTE ¡¡¡", ""), 1, "");
         AnyError = (short)(1) ;
      }
   }

   public void beforeDelete1SF112( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1SF112( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1SF112( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1SF112( )
   {
      edtPrdNum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNum_Enabled), 5, 0), !bGXsfl_59_Refreshing);
      edtPrdNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNom_Enabled), 5, 0), !bGXsfl_59_Refreshing);
      edtPrdFacCon_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdFacCon_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdFacCon_Enabled), 5, 0), !bGXsfl_59_Refreshing);
      edtPrdExiAlm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdExiAlm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdExiAlm_Enabled), 5, 0), !bGXsfl_59_Refreshing);
      edtPrdExiCC_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdExiCC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdExiCC_Enabled), 5, 0), !bGXsfl_59_Refreshing);
      edtPrdCanRes_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdCanRes_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdCanRes_Enabled), 5, 0), !bGXsfl_59_Refreshing);
      edtCumConCant_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCumConCant_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCumConCant_Enabled), 5, 0), !bGXsfl_59_Refreshing);
      cmbCumUnidad.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbCumUnidad.getInternalname(), "Enabled", GXutil.ltrimstr( cmbCumUnidad.getEnabled(), 5, 0), !bGXsfl_59_Refreshing);
      edtCumConLot_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCumConLot_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCumConLot_Enabled), 5, 0), !bGXsfl_59_Refreshing);
      edtCumConCbis_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCumConCbis_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCumConCbis_Enabled), 5, 0), !bGXsfl_59_Refreshing);
      edtCumCosPro_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCumCosPro_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCumCosPro_Enabled), 5, 0), !bGXsfl_59_Refreshing);
      edtPrdPreAct_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdPreAct_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdPreAct_Enabled), 5, 0), !bGXsfl_59_Refreshing);
      edtPrdPreMed_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdPreMed_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdPreMed_Enabled), 5, 0), !bGXsfl_59_Refreshing);
      edtUltFecCCs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtUltFecCCs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtUltFecCCs_Enabled), 5, 0), !bGXsfl_59_Refreshing);
      edtPrdValStk_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdValStk_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdValStk_Enabled), 5, 0), !bGXsfl_59_Refreshing);
      edtForPrdUMe_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtForPrdUMe_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForPrdUMe_Enabled), 5, 0), !bGXsfl_59_Refreshing);
      edtForPrdDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtForPrdDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForPrdDsc_Enabled), 5, 0), !bGXsfl_59_Refreshing);
      edtPrdComID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdComID_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdComID_Enabled), 5, 0), !bGXsfl_59_Refreshing);
      edtPrdLote_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdLote_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdLote_Enabled), 5, 0), !bGXsfl_59_Refreshing);
      cmbCumUMed.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbCumUMed.getInternalname(), "Enabled", GXutil.ltrimstr( cmbCumUMed.getEnabled(), 5, 0), !bGXsfl_59_Refreshing);
      edtCumLotAlm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCumLotAlm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCumLotAlm_Enabled), 5, 0), !bGXsfl_59_Refreshing);
      edtValCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtValCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtValCod_Enabled), 5, 0), !bGXsfl_59_Refreshing);
   }

   public void send_integrity_lvl_hashes1SF112( )
   {
   }

   public void send_integrity_lvl_hashes1SF111( )
   {
   }

   public void subsflControlProps_59112( )
   {
      edtPrdNum_Internalname = "PRDNUM_"+sGXsfl_59_idx ;
      edtPrdNom_Internalname = "PRDNOM_"+sGXsfl_59_idx ;
      edtPrdFacCon_Internalname = "PRDFACCON_"+sGXsfl_59_idx ;
      edtPrdExiAlm_Internalname = "PRDEXIALM_"+sGXsfl_59_idx ;
      edtPrdExiCC_Internalname = "PRDEXICC_"+sGXsfl_59_idx ;
      edtPrdCanRes_Internalname = "PRDCANRES_"+sGXsfl_59_idx ;
      edtCumConCant_Internalname = "CUMCONCANT_"+sGXsfl_59_idx ;
      cmbCumUnidad.setInternalname( "CUMUNIDAD_"+sGXsfl_59_idx );
      edtCumConLot_Internalname = "CUMCONLOT_"+sGXsfl_59_idx ;
      edtCumConCbis_Internalname = "CUMCONCBIS_"+sGXsfl_59_idx ;
      edtCumCosPro_Internalname = "CUMCOSPRO_"+sGXsfl_59_idx ;
      edtPrdPreAct_Internalname = "PRDPREACT_"+sGXsfl_59_idx ;
      edtPrdPreMed_Internalname = "PRDPREMED_"+sGXsfl_59_idx ;
      edtUltFecCCs_Internalname = "ULTFECCCS_"+sGXsfl_59_idx ;
      edtPrdValStk_Internalname = "PRDVALSTK_"+sGXsfl_59_idx ;
      edtForPrdUMe_Internalname = "FORPRDUME_"+sGXsfl_59_idx ;
      edtForPrdDsc_Internalname = "FORPRDDSC_"+sGXsfl_59_idx ;
      edtPrdComID_Internalname = "PRDCOMID_"+sGXsfl_59_idx ;
      edtPrdLote_Internalname = "PRDLOTE_"+sGXsfl_59_idx ;
      cmbCumUMed.setInternalname( "CUMUMED_"+sGXsfl_59_idx );
      edtCumLotAlm_Internalname = "CUMLOTALM_"+sGXsfl_59_idx ;
      edtValCod_Internalname = "VALCOD_"+sGXsfl_59_idx ;
   }

   public void subsflControlProps_fel_59112( )
   {
      edtPrdNum_Internalname = "PRDNUM_"+sGXsfl_59_fel_idx ;
      edtPrdNom_Internalname = "PRDNOM_"+sGXsfl_59_fel_idx ;
      edtPrdFacCon_Internalname = "PRDFACCON_"+sGXsfl_59_fel_idx ;
      edtPrdExiAlm_Internalname = "PRDEXIALM_"+sGXsfl_59_fel_idx ;
      edtPrdExiCC_Internalname = "PRDEXICC_"+sGXsfl_59_fel_idx ;
      edtPrdCanRes_Internalname = "PRDCANRES_"+sGXsfl_59_fel_idx ;
      edtCumConCant_Internalname = "CUMCONCANT_"+sGXsfl_59_fel_idx ;
      cmbCumUnidad.setInternalname( "CUMUNIDAD_"+sGXsfl_59_fel_idx );
      edtCumConLot_Internalname = "CUMCONLOT_"+sGXsfl_59_fel_idx ;
      edtCumConCbis_Internalname = "CUMCONCBIS_"+sGXsfl_59_fel_idx ;
      edtCumCosPro_Internalname = "CUMCOSPRO_"+sGXsfl_59_fel_idx ;
      edtPrdPreAct_Internalname = "PRDPREACT_"+sGXsfl_59_fel_idx ;
      edtPrdPreMed_Internalname = "PRDPREMED_"+sGXsfl_59_fel_idx ;
      edtUltFecCCs_Internalname = "ULTFECCCS_"+sGXsfl_59_fel_idx ;
      edtPrdValStk_Internalname = "PRDVALSTK_"+sGXsfl_59_fel_idx ;
      edtForPrdUMe_Internalname = "FORPRDUME_"+sGXsfl_59_fel_idx ;
      edtForPrdDsc_Internalname = "FORPRDDSC_"+sGXsfl_59_fel_idx ;
      edtPrdComID_Internalname = "PRDCOMID_"+sGXsfl_59_fel_idx ;
      edtPrdLote_Internalname = "PRDLOTE_"+sGXsfl_59_fel_idx ;
      cmbCumUMed.setInternalname( "CUMUMED_"+sGXsfl_59_fel_idx );
      edtCumLotAlm_Internalname = "CUMLOTALM_"+sGXsfl_59_fel_idx ;
      edtValCod_Internalname = "VALCOD_"+sGXsfl_59_fel_idx ;
   }

   public void addRow1SF112( )
   {
      nGXsfl_59_idx = (int)(nGXsfl_59_idx+1) ;
      sGXsfl_59_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_59_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_59112( ) ;
      sendRow1SF112( ) ;
   }

   public void sendRow1SF112( )
   {
      Gridlevel_productoRow = GXWebRow.GetNew(context) ;
      if ( subGridlevel_producto_Backcolorstyle == 0 )
      {
         /* None style subfile background logic. */
         subGridlevel_producto_Backstyle = (byte)(0) ;
         if ( GXutil.strcmp(subGridlevel_producto_Class, "") != 0 )
         {
            subGridlevel_producto_Linesclass = subGridlevel_producto_Class+"Odd" ;
         }
      }
      else if ( subGridlevel_producto_Backcolorstyle == 1 )
      {
         /* Uniform style subfile background logic. */
         subGridlevel_producto_Backstyle = (byte)(0) ;
         subGridlevel_producto_Backcolor = subGridlevel_producto_Allbackcolor ;
         if ( GXutil.strcmp(subGridlevel_producto_Class, "") != 0 )
         {
            subGridlevel_producto_Linesclass = subGridlevel_producto_Class+"Uniform" ;
         }
      }
      else if ( subGridlevel_producto_Backcolorstyle == 2 )
      {
         /* Header style subfile background logic. */
         subGridlevel_producto_Backstyle = (byte)(1) ;
         if ( GXutil.strcmp(subGridlevel_producto_Class, "") != 0 )
         {
            subGridlevel_producto_Linesclass = subGridlevel_producto_Class+"Odd" ;
         }
         subGridlevel_producto_Backcolor = (int)(0x0) ;
      }
      else if ( subGridlevel_producto_Backcolorstyle == 3 )
      {
         /* Report style subfile background logic. */
         subGridlevel_producto_Backstyle = (byte)(1) ;
         if ( ((int)((nGXsfl_59_idx) % (2))) == 0 )
         {
            subGridlevel_producto_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGridlevel_producto_Class, "") != 0 )
            {
               subGridlevel_producto_Linesclass = subGridlevel_producto_Class+"Even" ;
            }
         }
         else
         {
            subGridlevel_producto_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGridlevel_producto_Class, "") != 0 )
            {
               subGridlevel_producto_Linesclass = subGridlevel_producto_Class+"Odd" ;
            }
         }
      }
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_112_" + sGXsfl_59_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 60,'',false,'" + sGXsfl_59_idx + "',59)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_productoRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdNum_Internalname,GXutil.rtrim( A719PrdNum),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,60);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrdNum_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtPrdNum_Enabled),Integer.valueOf(1),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(59),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_productoRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdNom_Internalname,GXutil.rtrim( A718PrdNom),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrdNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(0),Integer.valueOf(edtPrdNom_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(59),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_productoRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdFacCon_Internalname,GXutil.ltrim( localUtil.ntoc( A707PrdFacCon, (byte)(7), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtPrdFacCon_Enabled!=0) ? localUtil.format( A707PrdFacCon, "Z9.9999") : localUtil.format( A707PrdFacCon, "Z9.9999"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrdFacCon_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtPrdFacCon_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(7),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(59),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_productoRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdExiAlm_Internalname,GXutil.ltrim( localUtil.ntoc( A704PrdExiAlm, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtPrdExiAlm_Enabled!=0) ? localUtil.format( A704PrdExiAlm, "ZZZZZZ9.9999") : localUtil.format( A704PrdExiAlm, "ZZZZZZ9.9999"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrdExiAlm_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtPrdExiAlm_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(59),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_productoRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdExiCC_Internalname,GXutil.ltrim( localUtil.ntoc( A705PrdExiCC, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtPrdExiCC_Enabled!=0) ? localUtil.format( A705PrdExiCC, "ZZZZZZ9.9999") : localUtil.format( A705PrdExiCC, "ZZZZZZ9.9999"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrdExiCC_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(edtPrdExiCC_Visible),Integer.valueOf(edtPrdExiCC_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(59),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_productoRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdCanRes_Internalname,GXutil.ltrim( localUtil.ntoc( A685PrdCanRes, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtPrdCanRes_Enabled!=0) ? localUtil.format( A685PrdCanRes, "ZZZZZZ9.9999") : localUtil.format( A685PrdCanRes, "ZZZZZZ9.9999"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrdCanRes_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtPrdCanRes_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(59),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_112_" + sGXsfl_59_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 66,'',false,'" + sGXsfl_59_idx + "',59)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_productoRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCumConCant_Internalname,GXutil.ltrim( localUtil.ntoc( A860CumConCant, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtCumConCant_Enabled!=0) ? localUtil.format( A860CumConCant, "ZZZZZZ9.9999") : localUtil.format( A860CumConCant, "ZZZZZZ9.9999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onblur(this,66);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCumConCant_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtCumConCant_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(59),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_112_" + sGXsfl_59_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 67,'',false,'" + sGXsfl_59_idx + "',59)\"" ;
      GXCCtl = "CUMUNIDAD_" + sGXsfl_59_idx ;
      cmbCumUnidad.setName( GXCCtl );
      cmbCumUnidad.setWebtags( "" );
      cmbCumUnidad.addItem("1", httpContext.getMessage( "kg/lt", ""), (short)(0));
      cmbCumUnidad.addItem("0", httpContext.getMessage( "gr/cc", ""), (short)(0));
      if ( cmbCumUnidad.getItemCount() > 0 )
      {
         if ( isIns( ) && (0==A8639CumUnidad) )
         {
            A8639CumUnidad = (byte)(AV23ConMan) ;
         }
      }
      /* ComboBox */
      Gridlevel_productoRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbCumUnidad,cmbCumUnidad.getInternalname(),GXutil.trim( GXutil.str( A8639CumUnidad, 1, 0)),Integer.valueOf(1),cmbCumUnidad.getJsonclick(),Integer.valueOf(0),"'"+""+"'"+",false,"+"'"+""+"'","int","",Integer.valueOf(-1),Integer.valueOf(cmbCumUnidad.getEnabled()),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","Attribute","TrnColumn","",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,67);\"","",Boolean.valueOf(true),Integer.valueOf(0)});
      cmbCumUnidad.setValue( GXutil.trim( GXutil.str( A8639CumUnidad, 1, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbCumUnidad.getInternalname(), "Values", cmbCumUnidad.ToJavascriptSource(), !bGXsfl_59_Refreshing);
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_112_" + sGXsfl_59_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 68,'',false,'" + sGXsfl_59_idx + "',59)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_productoRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCumConLot_Internalname,GXutil.rtrim( A5862CumConLot),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,68);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCumConLot_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtCumConLot_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(59),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_112_" + sGXsfl_59_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 69,'',false,'" + sGXsfl_59_idx + "',59)\"" ;
      ROClassString = "Invisible" ;
      Gridlevel_productoRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCumConCbis_Internalname,GXutil.ltrim( localUtil.ntoc( A861CumConCbis, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtCumConCbis_Enabled!=0) ? localUtil.format( A861CumConCbis, "ZZZZZZ9.9999") : localUtil.format( A861CumConCbis, "ZZZZZZ9.9999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onblur(this,69);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCumConCbis_Jsonclick,Integer.valueOf(0),"Invisible","",ROClassString,"TrnColumn ColumnAlignRight ColumnAlignRight","",Integer.valueOf(-1),Integer.valueOf(edtCumConCbis_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(59),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_productoRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCumCosPro_Internalname,GXutil.ltrim( localUtil.ntoc( A863CumCosPro, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtCumCosPro_Enabled!=0) ? localUtil.format( A863CumCosPro, "ZZZZZZ9.99") : localUtil.format( A863CumCosPro, "ZZZZZZ9.99"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCumCosPro_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(0),Integer.valueOf(edtCumCosPro_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(59),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_productoRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdPreAct_Internalname,GXutil.ltrim( localUtil.ntoc( A724PrdPreAct, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtPrdPreAct_Enabled!=0) ? localUtil.format( A724PrdPreAct, "ZZZZZZZ9.999") : localUtil.format( A724PrdPreAct, "ZZZZZZZ9.999"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrdPreAct_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(0),Integer.valueOf(edtPrdPreAct_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(14),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(59),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_productoRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdPreMed_Internalname,GXutil.ltrim( localUtil.ntoc( A726PrdPreMed, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtPrdPreMed_Enabled!=0) ? localUtil.format( A726PrdPreMed, "ZZZZZZZ9.999") : localUtil.format( A726PrdPreMed, "ZZZZZZZ9.999"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrdPreMed_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(0),Integer.valueOf(edtPrdPreMed_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(14),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(59),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_productoRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtUltFecCCs_Internalname,localUtil.format(A3835UltFecCCs, "99/99/99"),localUtil.format( A3835UltFecCCs, "99/99/99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtUltFecCCs_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(0),Integer.valueOf(edtUltFecCCs_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(59),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_productoRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdValStk_Internalname,GXutil.ltrim( localUtil.ntoc( A750PrdValStk, (byte)(11), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtPrdValStk_Enabled!=0) ? localUtil.format( A750PrdValStk, "ZZZZZZZ9.99") : localUtil.format( A750PrdValStk, "ZZZZZZZ9.99"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrdValStk_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(0),Integer.valueOf(edtPrdValStk_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(11),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(59),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_productoRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtForPrdUMe_Internalname,GXutil.ltrim( localUtil.ntoc( A490ForPrdUMe, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtForPrdUMe_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A490ForPrdUMe), "9") : localUtil.format( DecimalUtil.doubleToDec(A490ForPrdUMe), "9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtForPrdUMe_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(0),Integer.valueOf(edtForPrdUMe_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(59),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_productoRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtForPrdDsc_Internalname,GXutil.rtrim( A488ForPrdDsc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtForPrdDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(0),Integer.valueOf(edtForPrdDsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(5),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(59),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_productoRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdComID_Internalname,GXutil.rtrim( A12257PrdComID),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrdComID_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(0),Integer.valueOf(edtPrdComID_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(59),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_productoRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdLote_Internalname,GXutil.rtrim( A10881PrdLote),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrdLote_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(0),Integer.valueOf(edtPrdLote_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(59),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      if ( ( cmbCumUMed.getItemCount() == 0 ) && isAjaxCallMode( ) )
      {
         GXCCtl = "CUMUMED_" + sGXsfl_59_idx ;
         cmbCumUMed.setName( GXCCtl );
         cmbCumUMed.setWebtags( "" );
         cmbCumUMed.addItem("0", httpContext.getMessage( "Sin Definir", ""), (short)(0));
         cmbCumUMed.addItem("1", httpContext.getMessage( "Kilos", ""), (short)(0));
         cmbCumUMed.addItem("2", httpContext.getMessage( "Gramos", ""), (short)(0));
         cmbCumUMed.addItem("3", httpContext.getMessage( "Litros", ""), (short)(0));
         cmbCumUMed.addItem("4", httpContext.getMessage( "Mililitros", ""), (short)(0));
         if ( cmbCumUMed.getItemCount() > 0 )
         {
            A12700CumUMed = (byte)(GXutil.lval( cmbCumUMed.getValidValue(GXutil.trim( GXutil.str( A12700CumUMed, 1, 0))))) ;
         }
      }
      /* ComboBox */
      Gridlevel_productoRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbCumUMed,cmbCumUMed.getInternalname(),GXutil.trim( GXutil.str( A12700CumUMed, 1, 0)),Integer.valueOf(1),cmbCumUMed.getJsonclick(),Integer.valueOf(0),"'"+""+"'"+",false,"+"'"+""+"'","int","",Integer.valueOf(0),Integer.valueOf(cmbCumUMed.getEnabled()),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","Attribute","TrnColumn","","","",Boolean.valueOf(true),Integer.valueOf(0)});
      cmbCumUMed.setValue( GXutil.trim( GXutil.str( A12700CumUMed, 1, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbCumUMed.getInternalname(), "Values", cmbCumUMed.ToJavascriptSource(), !bGXsfl_59_Refreshing);
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_productoRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCumLotAlm_Internalname,GXutil.ltrim( localUtil.ntoc( A14039CumLotAlm, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtCumLotAlm_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A14039CumLotAlm), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A14039CumLotAlm), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCumLotAlm_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(0),Integer.valueOf(edtCumLotAlm_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(59),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_productoRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtValCod_Internalname,GXutil.ltrim( localUtil.ntoc( A856ValCod, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtValCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A856ValCod), "9") : localUtil.format( DecimalUtil.doubleToDec(A856ValCod), "9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtValCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(0),Integer.valueOf(edtValCod_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(59),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      httpContext.ajax_sending_grid_row(Gridlevel_productoRow);
      send_integrity_lvl_hashes1SF112( ) ;
      GXCCtl = "Z719PrdNum_" + sGXsfl_59_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z719PrdNum));
      GXCCtl = "Z8639CumUnidad_" + sGXsfl_59_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z8639CumUnidad, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z5862CumConLot_" + sGXsfl_59_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z5862CumConLot));
      GXCCtl = "Z861CumConCbis_" + sGXsfl_59_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z861CumConCbis, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z860CumConCant_" + sGXsfl_59_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z860CumConCant, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z12257PrdComID_" + sGXsfl_59_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z12257PrdComID));
      GXCCtl = "Z12700CumUMed_" + sGXsfl_59_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z12700CumUMed, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z14039CumLotAlm_" + sGXsfl_59_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z14039CumLotAlm, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z490ForPrdUMe_" + sGXsfl_59_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z490ForPrdUMe, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z718PrdNom_" + sGXsfl_59_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z718PrdNom));
      GXCCtl = "Z707PrdFacCon_" + sGXsfl_59_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z707PrdFacCon, (byte)(7), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z705PrdExiCC_" + sGXsfl_59_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z705PrdExiCC, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z685PrdCanRes_" + sGXsfl_59_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z685PrdCanRes, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z724PrdPreAct_" + sGXsfl_59_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z724PrdPreAct, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z726PrdPreMed_" + sGXsfl_59_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z726PrdPreMed, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z10881PrdLote_" + sGXsfl_59_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z10881PrdLote));
      GXCCtl = "Z856ValCod_" + sGXsfl_59_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z856ValCod, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "O750PrdValStk_" + sGXsfl_59_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( O750PrdValStk, (byte)(11), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "O861CumConCbis_" + sGXsfl_59_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( O861CumConCbis, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "O704PrdExiAlm_" + sGXsfl_59_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( O704PrdExiAlm, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "O860CumConCant_" + sGXsfl_59_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( O860CumConCant, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_112_" + sGXsfl_59_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_112, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_112_" + sGXsfl_59_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_112, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_112_" + sGXsfl_59_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_112, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vMODE_" + sGXsfl_59_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Gx_mode));
      GXCCtl = "vTRNCONTEXT_" + sGXsfl_59_idx ;
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, GXCCtl, AV13TrnContext);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(GXCCtl, AV13TrnContext);
      }
      GXCCtl = "vEMPRCOD_" + sGXsfl_59_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( AV10EmprCod));
      GXCCtl = "vCUMCODCONT_" + sGXsfl_59_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( AV11CumCodCont, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "EMPRCOD_" + sGXsfl_59_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDNUM_"+sGXsfl_59_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdNum_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDNOM_"+sGXsfl_59_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdNom_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDFACCON_"+sGXsfl_59_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdFacCon_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDEXIALM_"+sGXsfl_59_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdExiAlm_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDEXICC_"+sGXsfl_59_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdExiCC_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDEXICC_"+sGXsfl_59_idx+"Visible", GXutil.ltrim( localUtil.ntoc( edtPrdExiCC_Visible, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDCANRES_"+sGXsfl_59_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdCanRes_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CUMCONCANT_"+sGXsfl_59_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCumConCant_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CUMUNIDAD_"+sGXsfl_59_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( cmbCumUnidad.getEnabled(), (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CUMCONLOT_"+sGXsfl_59_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCumConLot_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CUMCONCBIS_"+sGXsfl_59_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCumConCbis_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CUMCOSPRO_"+sGXsfl_59_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCumCosPro_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDPREACT_"+sGXsfl_59_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdPreAct_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDPREMED_"+sGXsfl_59_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdPreMed_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ULTFECCCS_"+sGXsfl_59_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtUltFecCCs_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDVALSTK_"+sGXsfl_59_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdValStk_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FORPRDUME_"+sGXsfl_59_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtForPrdUMe_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FORPRDDSC_"+sGXsfl_59_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtForPrdDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDCOMID_"+sGXsfl_59_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdComID_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDLOTE_"+sGXsfl_59_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdLote_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CUMUMED_"+sGXsfl_59_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( cmbCumUMed.getEnabled(), (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CUMLOTALM_"+sGXsfl_59_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCumLotAlm_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "VALCOD_"+sGXsfl_59_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtValCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Gridlevel_productoContainer.AddRow(Gridlevel_productoRow);
   }

   public void readRow1SF112( )
   {
      nGXsfl_59_idx = (int)(nGXsfl_59_idx+1) ;
      sGXsfl_59_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_59_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_59112( ) ;
      edtPrdNum_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRDNUM_"+sGXsfl_59_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPrdNom_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRDNOM_"+sGXsfl_59_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPrdFacCon_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRDFACCON_"+sGXsfl_59_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPrdExiAlm_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRDEXIALM_"+sGXsfl_59_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPrdExiCC_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRDEXICC_"+sGXsfl_59_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPrdExiCC_Visible = (int)(localUtil.ctol( httpContext.cgiGet( "PRDEXICC_"+sGXsfl_59_idx+"Visible"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPrdCanRes_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRDCANRES_"+sGXsfl_59_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtCumConCant_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CUMCONCANT_"+sGXsfl_59_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      cmbCumUnidad.setEnabled( (int)(localUtil.ctol( httpContext.cgiGet( "CUMUNIDAD_"+sGXsfl_59_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) );
      edtCumConLot_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CUMCONLOT_"+sGXsfl_59_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtCumConCbis_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CUMCONCBIS_"+sGXsfl_59_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtCumCosPro_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CUMCOSPRO_"+sGXsfl_59_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPrdPreAct_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRDPREACT_"+sGXsfl_59_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPrdPreMed_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRDPREMED_"+sGXsfl_59_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtUltFecCCs_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ULTFECCCS_"+sGXsfl_59_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPrdValStk_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRDVALSTK_"+sGXsfl_59_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtForPrdUMe_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FORPRDUME_"+sGXsfl_59_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtForPrdDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FORPRDDSC_"+sGXsfl_59_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPrdComID_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRDCOMID_"+sGXsfl_59_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPrdLote_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRDLOTE_"+sGXsfl_59_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      cmbCumUMed.setEnabled( (int)(localUtil.ctol( httpContext.cgiGet( "CUMUMED_"+sGXsfl_59_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) );
      edtCumLotAlm_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CUMLOTALM_"+sGXsfl_59_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtValCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "VALCOD_"+sGXsfl_59_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      A719PrdNum = httpContext.cgiGet( edtPrdNum_Internalname) ;
      A718PrdNom = httpContext.cgiGet( edtPrdNom_Internalname) ;
      A707PrdFacCon = localUtil.ctond( httpContext.cgiGet( edtPrdFacCon_Internalname)) ;
      A704PrdExiAlm = localUtil.ctond( httpContext.cgiGet( edtPrdExiAlm_Internalname)) ;
      A705PrdExiCC = localUtil.ctond( httpContext.cgiGet( edtPrdExiCC_Internalname)) ;
      A685PrdCanRes = localUtil.ctond( httpContext.cgiGet( edtPrdCanRes_Internalname)) ;
      if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtCumConCant_Internalname)), DecimalUtil.stringToDec("-999999.9999")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtCumConCant_Internalname)), DecimalUtil.stringToDec("9999999.9999")) > 0 ) ) )
      {
         GXCCtl = "CUMCONCANT_" + sGXsfl_59_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtCumConCant_Internalname ;
         wbErr = true ;
         A860CumConCant = DecimalUtil.ZERO ;
      }
      else
      {
         A860CumConCant = localUtil.ctond( httpContext.cgiGet( edtCumConCant_Internalname)) ;
      }
      cmbCumUnidad.setName( cmbCumUnidad.getInternalname() );
      cmbCumUnidad.setValue( httpContext.cgiGet( cmbCumUnidad.getInternalname()) );
      A8639CumUnidad = (byte)(GXutil.lval( httpContext.cgiGet( cmbCumUnidad.getInternalname()))) ;
      A5862CumConLot = httpContext.cgiGet( edtCumConLot_Internalname) ;
      if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtCumConCbis_Internalname)), DecimalUtil.stringToDec("-999999.9999")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtCumConCbis_Internalname)), DecimalUtil.stringToDec("9999999.9999")) > 0 ) ) )
      {
         GXCCtl = "CUMCONCBIS_" + sGXsfl_59_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtCumConCbis_Internalname ;
         wbErr = true ;
         A861CumConCbis = DecimalUtil.ZERO ;
      }
      else
      {
         A861CumConCbis = localUtil.ctond( httpContext.cgiGet( edtCumConCbis_Internalname)) ;
      }
      A863CumCosPro = localUtil.ctond( httpContext.cgiGet( edtCumCosPro_Internalname)) ;
      A724PrdPreAct = localUtil.ctond( httpContext.cgiGet( edtPrdPreAct_Internalname)) ;
      A726PrdPreMed = localUtil.ctond( httpContext.cgiGet( edtPrdPreMed_Internalname)) ;
      A3835UltFecCCs = localUtil.ctod( httpContext.cgiGet( edtUltFecCCs_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
      A750PrdValStk = localUtil.ctond( httpContext.cgiGet( edtPrdValStk_Internalname)) ;
      A490ForPrdUMe = (byte)(localUtil.ctol( httpContext.cgiGet( edtForPrdUMe_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      A488ForPrdDsc = httpContext.cgiGet( edtForPrdDsc_Internalname) ;
      n488ForPrdDsc = false ;
      A12257PrdComID = httpContext.cgiGet( edtPrdComID_Internalname) ;
      A10881PrdLote = httpContext.cgiGet( edtPrdLote_Internalname) ;
      cmbCumUMed.setName( cmbCumUMed.getInternalname() );
      cmbCumUMed.setValue( httpContext.cgiGet( cmbCumUMed.getInternalname()) );
      A12700CumUMed = (byte)(GXutil.lval( httpContext.cgiGet( cmbCumUMed.getInternalname()))) ;
      A14039CumLotAlm = (short)(localUtil.ctol( httpContext.cgiGet( edtCumLotAlm_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      A856ValCod = (byte)(localUtil.ctol( httpContext.cgiGet( edtValCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z719PrdNum_" + sGXsfl_59_idx ;
      Z719PrdNum = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z8639CumUnidad_" + sGXsfl_59_idx ;
      Z8639CumUnidad = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z5862CumConLot_" + sGXsfl_59_idx ;
      Z5862CumConLot = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z861CumConCbis_" + sGXsfl_59_idx ;
      Z861CumConCbis = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z860CumConCant_" + sGXsfl_59_idx ;
      Z860CumConCant = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z12257PrdComID_" + sGXsfl_59_idx ;
      Z12257PrdComID = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z12700CumUMed_" + sGXsfl_59_idx ;
      Z12700CumUMed = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z14039CumLotAlm_" + sGXsfl_59_idx ;
      Z14039CumLotAlm = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z490ForPrdUMe_" + sGXsfl_59_idx ;
      Z490ForPrdUMe = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z718PrdNom_" + sGXsfl_59_idx ;
      Z718PrdNom = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z707PrdFacCon_" + sGXsfl_59_idx ;
      Z707PrdFacCon = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z705PrdExiCC_" + sGXsfl_59_idx ;
      Z705PrdExiCC = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z685PrdCanRes_" + sGXsfl_59_idx ;
      Z685PrdCanRes = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z724PrdPreAct_" + sGXsfl_59_idx ;
      Z724PrdPreAct = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z726PrdPreMed_" + sGXsfl_59_idx ;
      Z726PrdPreMed = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z10881PrdLote_" + sGXsfl_59_idx ;
      Z10881PrdLote = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z856ValCod_" + sGXsfl_59_idx ;
      Z856ValCod = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "O750PrdValStk_" + sGXsfl_59_idx ;
      O750PrdValStk = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "O861CumConCbis_" + sGXsfl_59_idx ;
      O861CumConCbis = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "O704PrdExiAlm_" + sGXsfl_59_idx ;
      O704PrdExiAlm = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "O860CumConCant_" + sGXsfl_59_idx ;
      O860CumConCant = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "nRcdDeleted_112_" + sGXsfl_59_idx ;
      nRcdDeleted_112 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_112_" + sGXsfl_59_idx ;
      nRcdExists_112 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_112_" + sGXsfl_59_idx ;
      nIsMod_112 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtValCod_Enabled = edtValCod_Enabled ;
      defedtCumLotAlm_Enabled = edtCumLotAlm_Enabled ;
      defcmbCumUMed_Enabled = cmbCumUMed.getEnabled() ;
      defedtPrdLote_Enabled = edtPrdLote_Enabled ;
      defedtPrdComID_Enabled = edtPrdComID_Enabled ;
      defedtForPrdDsc_Enabled = edtForPrdDsc_Enabled ;
      defedtForPrdUMe_Enabled = edtForPrdUMe_Enabled ;
      defedtPrdValStk_Enabled = edtPrdValStk_Enabled ;
      defedtUltFecCCs_Enabled = edtUltFecCCs_Enabled ;
      defedtPrdPreMed_Enabled = edtPrdPreMed_Enabled ;
      defedtPrdPreAct_Enabled = edtPrdPreAct_Enabled ;
      defedtCumCosPro_Enabled = edtCumCosPro_Enabled ;
      defedtPrdExiAlm_Enabled = edtPrdExiAlm_Enabled ;
      defedtPrdNom_Enabled = edtPrdNom_Enabled ;
      defedtPrdNum_Enabled = edtPrdNum_Enabled ;
   }

   public void confirmValues1SF0( )
   {
      nGXsfl_59_idx = 0 ;
      sGXsfl_59_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_59_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_59112( ) ;
      while ( nGXsfl_59_idx < nRC_GXsfl_59 )
      {
         nGXsfl_59_idx = (int)(nGXsfl_59_idx+1) ;
         sGXsfl_59_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_59_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_59112( ) ;
         httpContext.changePostValue( "Z719PrdNum_"+sGXsfl_59_idx, httpContext.cgiGet( "ZT_"+"Z719PrdNum_"+sGXsfl_59_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z719PrdNum_"+sGXsfl_59_idx) ;
         httpContext.changePostValue( "Z8639CumUnidad_"+sGXsfl_59_idx, httpContext.cgiGet( "ZT_"+"Z8639CumUnidad_"+sGXsfl_59_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z8639CumUnidad_"+sGXsfl_59_idx) ;
         httpContext.changePostValue( "Z5862CumConLot_"+sGXsfl_59_idx, httpContext.cgiGet( "ZT_"+"Z5862CumConLot_"+sGXsfl_59_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z5862CumConLot_"+sGXsfl_59_idx) ;
         httpContext.changePostValue( "Z861CumConCbis_"+sGXsfl_59_idx, httpContext.cgiGet( "ZT_"+"Z861CumConCbis_"+sGXsfl_59_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z861CumConCbis_"+sGXsfl_59_idx) ;
         httpContext.changePostValue( "Z860CumConCant_"+sGXsfl_59_idx, httpContext.cgiGet( "ZT_"+"Z860CumConCant_"+sGXsfl_59_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z860CumConCant_"+sGXsfl_59_idx) ;
         httpContext.changePostValue( "Z12257PrdComID_"+sGXsfl_59_idx, httpContext.cgiGet( "ZT_"+"Z12257PrdComID_"+sGXsfl_59_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z12257PrdComID_"+sGXsfl_59_idx) ;
         httpContext.changePostValue( "Z12700CumUMed_"+sGXsfl_59_idx, httpContext.cgiGet( "ZT_"+"Z12700CumUMed_"+sGXsfl_59_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z12700CumUMed_"+sGXsfl_59_idx) ;
         httpContext.changePostValue( "Z14039CumLotAlm_"+sGXsfl_59_idx, httpContext.cgiGet( "ZT_"+"Z14039CumLotAlm_"+sGXsfl_59_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z14039CumLotAlm_"+sGXsfl_59_idx) ;
         httpContext.changePostValue( "Z490ForPrdUMe_"+sGXsfl_59_idx, httpContext.cgiGet( "ZT_"+"Z490ForPrdUMe_"+sGXsfl_59_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z490ForPrdUMe_"+sGXsfl_59_idx) ;
         httpContext.changePostValue( "Z718PrdNom_"+sGXsfl_59_idx, httpContext.cgiGet( "ZT_"+"Z718PrdNom_"+sGXsfl_59_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z718PrdNom_"+sGXsfl_59_idx) ;
         httpContext.changePostValue( "Z707PrdFacCon_"+sGXsfl_59_idx, httpContext.cgiGet( "ZT_"+"Z707PrdFacCon_"+sGXsfl_59_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z707PrdFacCon_"+sGXsfl_59_idx) ;
         httpContext.changePostValue( "Z705PrdExiCC_"+sGXsfl_59_idx, httpContext.cgiGet( "ZT_"+"Z705PrdExiCC_"+sGXsfl_59_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z705PrdExiCC_"+sGXsfl_59_idx) ;
         httpContext.changePostValue( "Z685PrdCanRes_"+sGXsfl_59_idx, httpContext.cgiGet( "ZT_"+"Z685PrdCanRes_"+sGXsfl_59_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z685PrdCanRes_"+sGXsfl_59_idx) ;
         httpContext.changePostValue( "Z724PrdPreAct_"+sGXsfl_59_idx, httpContext.cgiGet( "ZT_"+"Z724PrdPreAct_"+sGXsfl_59_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z724PrdPreAct_"+sGXsfl_59_idx) ;
         httpContext.changePostValue( "Z726PrdPreMed_"+sGXsfl_59_idx, httpContext.cgiGet( "ZT_"+"Z726PrdPreMed_"+sGXsfl_59_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z726PrdPreMed_"+sGXsfl_59_idx) ;
         httpContext.changePostValue( "Z10881PrdLote_"+sGXsfl_59_idx, httpContext.cgiGet( "ZT_"+"Z10881PrdLote_"+sGXsfl_59_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10881PrdLote_"+sGXsfl_59_idx) ;
         httpContext.changePostValue( "Z856ValCod_"+sGXsfl_59_idx, httpContext.cgiGet( "ZT_"+"Z856ValCod_"+sGXsfl_59_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z856ValCod_"+sGXsfl_59_idx) ;
      }
      httpContext.changePostValue( "O750PrdValStk", httpContext.cgiGet( "T750PrdValStk")) ;
      httpContext.deletePostValue( "T750PrdValStk") ;
      httpContext.changePostValue( "O861CumConCbis", httpContext.cgiGet( "T861CumConCbis")) ;
      httpContext.deletePostValue( "T861CumConCbis") ;
      httpContext.changePostValue( "O704PrdExiAlm", httpContext.cgiGet( "T704PrdExiAlm")) ;
      httpContext.deletePostValue( "T704PrdExiAlm") ;
      httpContext.changePostValue( "O860CumConCant", httpContext.cgiGet( "T860CumConCant")) ;
      httpContext.deletePostValue( "T860CumConCant") ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.stocksquimicos.consumomanual", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV10EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV11CumCodCont,8,0))}, new String[] {"Gx_mode","EmprCod","CumCodCont"}) +"\">") ;
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
      forbiddenHiddens.add("hshsalt", "hsh"+"ConsumoManual");
      forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV36Pgmname, "")));
      forbiddenHiddens.add("CumConTipo", localUtil.format( DecimalUtil.doubleToDec(A11368CumConTipo), "Z9"));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("stocksquimicos\\consumomanual:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z859CumCodCont", GXutil.ltrim( localUtil.ntoc( Z859CumCodCont, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8925CC_AlmCd", GXutil.ltrim( localUtil.ntoc( Z8925CC_AlmCd, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10777CumCCos", GXutil.ltrim( localUtil.ntoc( Z10777CumCCos, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11368CumConTipo", GXutil.ltrim( localUtil.ntoc( Z11368CumConTipo, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z862CumConFec", localUtil.dtoc( Z862CumConFec, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3839CcoCod", GXutil.ltrim( localUtil.ntoc( Z3839CcoCod, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_Mode", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_59", GXutil.ltrim( localUtil.ntoc( nGXsfl_59_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "N3839CcoCod", GXutil.ltrim( localUtil.ntoc( A3839CcoCod, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vCUMCCOS_DATA", AV17CumCCos_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vCUMCCOS_DATA", AV17CumCCos_Data);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vCC_ALMCD_DATA", AV20CC_AlmCd_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vCC_ALMCD_DATA", AV20CC_AlmCd_Data);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vPRDNUM_DATA", AV24PrdNum_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vPRDNUM_DATA", AV24PrdNum_Data);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTRNCONTEXT", AV13TrnContext);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTRNCONTEXT", AV13TrnContext);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTRNCONTEXT", getSecureSignedToken( "", AV13TrnContext));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "CC_ALMDC", GXutil.rtrim( A8926CC_AlmDc));
      app.GxWebStd.gx_hidden_field( httpContext, "CUMCCOSD", GXutil.rtrim( A10778CumCCosD));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV10EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV10EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vCUMCODCONT", GXutil.ltrim( localUtil.ntoc( AV11CumCodCont, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCUMCODCONT", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV11CumCodCont), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vINSERT_CCOCOD", GXutil.ltrim( localUtil.ntoc( AV15Insert_CcoCod, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CCOCOD", GXutil.ltrim( localUtil.ntoc( A3839CcoCod, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMES", GXutil.ltrim( localUtil.ntoc( AV28Mes, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vYEAR", GXutil.ltrim( localUtil.ntoc( AV29Year, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGXBSCREEN", GXutil.ltrim( localUtil.ntoc( Gx_BScreen, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CUMCONTIPO", GXutil.ltrim( localUtil.ntoc( A11368CumConTipo, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRNOM", GXutil.rtrim( A407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "vCONMAN", GXutil.ltrim( localUtil.ntoc( AV23ConMan, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vCUMCONOLD", GXutil.ltrim( localUtil.ntoc( AV27CumConOld, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vCUMCONCBIS", GXutil.ltrim( localUtil.ntoc( AV34CumConCbis, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vFLAGPREMED", GXutil.ltrim( localUtil.ntoc( AV30FlagPreMed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vPRECIO_STK", GXutil.ltrim( localUtil.ntoc( AV31Precio_stk, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vUSURCOD", GXutil.rtrim( AV9UsurCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vMODA21", GXutil.ltrim( localUtil.ntoc( AV25Moda21, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vOK", GXutil.rtrim( AV26Ok));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CUMCCOS_Objectcall", GXutil.rtrim( Combo_cumccos_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CUMCCOS_Cls", GXutil.rtrim( Combo_cumccos_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CUMCCOS_Selectedvalue_set", GXutil.rtrim( Combo_cumccos_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CUMCCOS_Enabled", GXutil.booltostr( Combo_cumccos_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CC_ALMCD_Objectcall", GXutil.rtrim( Combo_cc_almcd_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CC_ALMCD_Cls", GXutil.rtrim( Combo_cc_almcd_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CC_ALMCD_Selectedvalue_set", GXutil.rtrim( Combo_cc_almcd_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CC_ALMCD_Enabled", GXutil.booltostr( Combo_cc_almcd_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CC_ALMCD_Visible", GXutil.booltostr( Combo_cc_almcd_Visible));
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
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PRDNUM_Objectcall", GXutil.rtrim( Combo_prdnum_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PRDNUM_Cls", GXutil.rtrim( Combo_prdnum_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PRDNUM_Enabled", GXutil.booltostr( Combo_prdnum_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PRDNUM_Titlecontrolidtoreplace", GXutil.rtrim( Combo_prdnum_Titlecontrolidtoreplace));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PRDNUM_Isgriditem", GXutil.booltostr( Combo_prdnum_Isgriditem));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PRDNUM_Emptyitem", GXutil.booltostr( Combo_prdnum_Emptyitem));
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

   public byte executeStartEvent( )
   {
      standaloneStartup( ) ;
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
      return formatLink("app.stocksquimicos.consumomanual", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV10EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV11CumCodCont,8,0))}, new String[] {"Gx_mode","EmprCod","CumCodCont"})  ;
   }

   public String getPgmname( )
   {
      return "StocksQuimicos.ConsumoManual" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Consumo Manual", "") ;
   }

   public void initializeNonKey1SF111( )
   {
      A3839CcoCod = (short)(0) ;
      n3839CcoCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3839CcoCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3839CcoCod), 3, 0));
      A8925CC_AlmCd = (byte)(0) ;
      n8925CC_AlmCd = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A8925CC_AlmCd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8925CC_AlmCd), 2, 0));
      A10777CumCCos = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A10777CumCCos", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10777CumCCos), 3, 0));
      AV28Mes = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV28Mes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV28Mes), 4, 0));
      AV29Year = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV29Year", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29Year), 4, 0));
      A10778CumCCosD = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A10778CumCCosD", A10778CumCCosD);
      A8926CC_AlmDc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A8926CC_AlmDc", A8926CC_AlmDc);
      A11368CumConTipo = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A11368CumConTipo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11368CumConTipo), 2, 0));
      A862CumConFec = GXutil.today( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "A862CumConFec", localUtil.format(A862CumConFec, "99/99/99"));
      Z8925CC_AlmCd = (byte)(0) ;
      Z10777CumCCos = (short)(0) ;
      Z11368CumConTipo = (byte)(0) ;
      Z862CumConFec = GXutil.nullDate() ;
      Z3839CcoCod = (short)(0) ;
   }

   public void initAll1SF111( )
   {
      A859CumCodCont = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A859CumCodCont", GXutil.ltrimstr( DecimalUtil.doubleToDec(A859CumCodCont), 8, 0));
      initializeNonKey1SF111( ) ;
   }

   public void standaloneModalInsert( )
   {
      A862CumConFec = i862CumConFec ;
      httpContext.ajax_rsp_assign_attri("", false, "A862CumConFec", localUtil.format(A862CumConFec, "99/99/99"));
      A11368CumConTipo = i11368CumConTipo ;
      httpContext.ajax_rsp_assign_attri("", false, "A11368CumConTipo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11368CumConTipo), 2, 0));
   }

   public void initializeNonKey1SF112( )
   {
      A861CumConCbis = DecimalUtil.ZERO ;
      AV27CumConOld = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV27CumConOld", GXutil.ltrimstr( AV27CumConOld, 12, 4));
      A704PrdExiAlm = DecimalUtil.ZERO ;
      AV34CumConCbis = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV34CumConCbis", GXutil.ltrimstr( AV34CumConCbis, 12, 4));
      A750PrdValStk = DecimalUtil.ZERO ;
      AV26Ok = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV26Ok", AV26Ok);
      A863CumCosPro = DecimalUtil.ZERO ;
      A3835UltFecCCs = GXutil.nullDate() ;
      A718PrdNom = "" ;
      A707PrdFacCon = DecimalUtil.ZERO ;
      A705PrdExiCC = DecimalUtil.ZERO ;
      A685PrdCanRes = DecimalUtil.ZERO ;
      A860CumConCant = DecimalUtil.ZERO ;
      A724PrdPreAct = DecimalUtil.ZERO ;
      A726PrdPreMed = DecimalUtil.ZERO ;
      A490ForPrdUMe = (byte)(0) ;
      A488ForPrdDsc = "" ;
      n488ForPrdDsc = false ;
      A12257PrdComID = "" ;
      A10881PrdLote = "" ;
      A12700CumUMed = (byte)(0) ;
      A14039CumLotAlm = (short)(0) ;
      A856ValCod = (byte)(0) ;
      A8639CumUnidad = (byte)(AV23ConMan) ;
      A5862CumConLot = "" ;
      O750PrdValStk = A750PrdValStk ;
      O861CumConCbis = A861CumConCbis ;
      O704PrdExiAlm = A704PrdExiAlm ;
      O860CumConCant = A860CumConCant ;
      Z8639CumUnidad = (byte)(0) ;
      Z5862CumConLot = "" ;
      Z861CumConCbis = DecimalUtil.ZERO ;
      Z860CumConCant = DecimalUtil.ZERO ;
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

   public void initAll1SF112( )
   {
      A719PrdNum = "" ;
      initializeNonKey1SF112( ) ;
   }

   public void standaloneModalInsert1SF112( )
   {
      A8639CumUnidad = i8639CumUnidad ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268211693774", true, true);
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
      httpContext.AddJavascriptSource("stocksquimicos/consumomanual.js", "?20268211693774", false, true);
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
      /* End function include_jscripts */
   }

   public void init_level_properties112( )
   {
      edtValCod_Enabled = defedtValCod_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtValCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtValCod_Enabled), 5, 0), !bGXsfl_59_Refreshing);
      edtCumLotAlm_Enabled = defedtCumLotAlm_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtCumLotAlm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCumLotAlm_Enabled), 5, 0), !bGXsfl_59_Refreshing);
      cmbCumUMed.setEnabled( defcmbCumUMed_Enabled );
      httpContext.ajax_rsp_assign_prop("", false, cmbCumUMed.getInternalname(), "Enabled", GXutil.ltrimstr( cmbCumUMed.getEnabled(), 5, 0), !bGXsfl_59_Refreshing);
      edtPrdLote_Enabled = defedtPrdLote_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdLote_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdLote_Enabled), 5, 0), !bGXsfl_59_Refreshing);
      edtPrdComID_Enabled = defedtPrdComID_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdComID_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdComID_Enabled), 5, 0), !bGXsfl_59_Refreshing);
      edtForPrdDsc_Enabled = defedtForPrdDsc_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtForPrdDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForPrdDsc_Enabled), 5, 0), !bGXsfl_59_Refreshing);
      edtForPrdUMe_Enabled = defedtForPrdUMe_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtForPrdUMe_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForPrdUMe_Enabled), 5, 0), !bGXsfl_59_Refreshing);
      edtPrdValStk_Enabled = defedtPrdValStk_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdValStk_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdValStk_Enabled), 5, 0), !bGXsfl_59_Refreshing);
      edtUltFecCCs_Enabled = defedtUltFecCCs_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtUltFecCCs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtUltFecCCs_Enabled), 5, 0), !bGXsfl_59_Refreshing);
      edtPrdPreMed_Enabled = defedtPrdPreMed_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdPreMed_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdPreMed_Enabled), 5, 0), !bGXsfl_59_Refreshing);
      edtPrdPreAct_Enabled = defedtPrdPreAct_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdPreAct_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdPreAct_Enabled), 5, 0), !bGXsfl_59_Refreshing);
      edtCumCosPro_Enabled = defedtCumCosPro_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtCumCosPro_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCumCosPro_Enabled), 5, 0), !bGXsfl_59_Refreshing);
      edtPrdExiAlm_Enabled = defedtPrdExiAlm_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdExiAlm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdExiAlm_Enabled), 5, 0), !bGXsfl_59_Refreshing);
      edtPrdNom_Enabled = defedtPrdNom_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNom_Enabled), 5, 0), !bGXsfl_59_Refreshing);
      edtPrdNum_Enabled = defedtPrdNum_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNum_Enabled), 5, 0), !bGXsfl_59_Refreshing);
   }

   public void startgridcontrol59( )
   {
      Gridlevel_productoContainer.AddObjectProperty("GridName", "Gridlevel_producto");
      Gridlevel_productoContainer.AddObjectProperty("Header", subGridlevel_producto_Header);
      Gridlevel_productoContainer.AddObjectProperty("Class", "GridNoBorder WorkWith");
      Gridlevel_productoContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_productoContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_productoContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGridlevel_producto_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_productoContainer.AddObjectProperty("CmpContext", "");
      Gridlevel_productoContainer.AddObjectProperty("InMasterPage", "false");
      Gridlevel_productoColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_productoColumn.AddObjectProperty("Value", GXutil.rtrim( A719PrdNum));
      Gridlevel_productoColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdNum_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_productoContainer.AddColumnProperties(Gridlevel_productoColumn);
      Gridlevel_productoColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_productoColumn.AddObjectProperty("Value", GXutil.rtrim( A718PrdNom));
      Gridlevel_productoColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdNom_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_productoContainer.AddColumnProperties(Gridlevel_productoColumn);
      Gridlevel_productoColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_productoColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A707PrdFacCon, (byte)(7), (byte)(4), ".", "")));
      Gridlevel_productoColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdFacCon_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_productoContainer.AddColumnProperties(Gridlevel_productoColumn);
      Gridlevel_productoColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_productoColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A704PrdExiAlm, (byte)(12), (byte)(4), ".", "")));
      Gridlevel_productoColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdExiAlm_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_productoContainer.AddColumnProperties(Gridlevel_productoColumn);
      Gridlevel_productoColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_productoColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A705PrdExiCC, (byte)(12), (byte)(4), ".", "")));
      Gridlevel_productoColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdExiCC_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_productoColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtPrdExiCC_Visible, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_productoContainer.AddColumnProperties(Gridlevel_productoColumn);
      Gridlevel_productoColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_productoColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A685PrdCanRes, (byte)(12), (byte)(4), ".", "")));
      Gridlevel_productoColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdCanRes_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_productoContainer.AddColumnProperties(Gridlevel_productoColumn);
      Gridlevel_productoColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_productoColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A860CumConCant, (byte)(12), (byte)(4), ".", "")));
      Gridlevel_productoColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtCumConCant_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_productoContainer.AddColumnProperties(Gridlevel_productoColumn);
      Gridlevel_productoColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_productoColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A8639CumUnidad, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_productoColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( cmbCumUnidad.getEnabled(), (byte)(5), (byte)(0), ".", "")));
      Gridlevel_productoContainer.AddColumnProperties(Gridlevel_productoColumn);
      Gridlevel_productoColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_productoColumn.AddObjectProperty("Value", GXutil.rtrim( A5862CumConLot));
      Gridlevel_productoColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtCumConLot_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_productoContainer.AddColumnProperties(Gridlevel_productoColumn);
      Gridlevel_productoColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_productoColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A861CumConCbis, (byte)(12), (byte)(4), ".", "")));
      Gridlevel_productoColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtCumConCbis_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_productoContainer.AddColumnProperties(Gridlevel_productoColumn);
      Gridlevel_productoColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_productoColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A863CumCosPro, (byte)(10), (byte)(2), ".", "")));
      Gridlevel_productoColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtCumCosPro_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_productoContainer.AddColumnProperties(Gridlevel_productoColumn);
      Gridlevel_productoColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_productoColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A724PrdPreAct, (byte)(14), (byte)(5), ".", "")));
      Gridlevel_productoColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdPreAct_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_productoContainer.AddColumnProperties(Gridlevel_productoColumn);
      Gridlevel_productoColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_productoColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A726PrdPreMed, (byte)(14), (byte)(5), ".", "")));
      Gridlevel_productoColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdPreMed_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_productoContainer.AddColumnProperties(Gridlevel_productoColumn);
      Gridlevel_productoColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_productoColumn.AddObjectProperty("Value", localUtil.format(A3835UltFecCCs, "99/99/99"));
      Gridlevel_productoColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtUltFecCCs_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_productoContainer.AddColumnProperties(Gridlevel_productoColumn);
      Gridlevel_productoColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_productoColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A750PrdValStk, (byte)(11), (byte)(2), ".", "")));
      Gridlevel_productoColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdValStk_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_productoContainer.AddColumnProperties(Gridlevel_productoColumn);
      Gridlevel_productoColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_productoColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A490ForPrdUMe, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_productoColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtForPrdUMe_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_productoContainer.AddColumnProperties(Gridlevel_productoColumn);
      Gridlevel_productoColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_productoColumn.AddObjectProperty("Value", GXutil.rtrim( A488ForPrdDsc));
      Gridlevel_productoColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtForPrdDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_productoContainer.AddColumnProperties(Gridlevel_productoColumn);
      Gridlevel_productoColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_productoColumn.AddObjectProperty("Value", GXutil.rtrim( A12257PrdComID));
      Gridlevel_productoColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdComID_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_productoContainer.AddColumnProperties(Gridlevel_productoColumn);
      Gridlevel_productoColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_productoColumn.AddObjectProperty("Value", GXutil.rtrim( A10881PrdLote));
      Gridlevel_productoColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdLote_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_productoContainer.AddColumnProperties(Gridlevel_productoColumn);
      Gridlevel_productoColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_productoColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A12700CumUMed, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_productoColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( cmbCumUMed.getEnabled(), (byte)(5), (byte)(0), ".", "")));
      Gridlevel_productoContainer.AddColumnProperties(Gridlevel_productoColumn);
      Gridlevel_productoColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_productoColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A14039CumLotAlm, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_productoColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtCumLotAlm_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_productoContainer.AddColumnProperties(Gridlevel_productoColumn);
      Gridlevel_productoColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_productoColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A856ValCod, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_productoColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtValCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_productoContainer.AddColumnProperties(Gridlevel_productoColumn);
      Gridlevel_productoContainer.AddObjectProperty("Selectedindex", GXutil.ltrim( localUtil.ntoc( subGridlevel_producto_Selectedindex, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_productoContainer.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGridlevel_producto_Allowselection, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_productoContainer.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGridlevel_producto_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
      Gridlevel_productoContainer.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGridlevel_producto_Allowhovering, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_productoContainer.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGridlevel_producto_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
      Gridlevel_productoContainer.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGridlevel_producto_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_productoContainer.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGridlevel_producto_Collapsed, (byte)(1), (byte)(0), ".", "")));
   }

   public void init_default_properties( )
   {
      edtCumCodCont_Internalname = "CUMCODCONT" ;
      edtCumConFec_Internalname = "CUMCONFEC" ;
      lblTextblockcumccos_Internalname = "TEXTBLOCKCUMCCOS" ;
      Combo_cumccos_Internalname = "COMBO_CUMCCOS" ;
      edtCumCCos_Internalname = "CUMCCOS" ;
      divTablesplittedcumccos_Internalname = "TABLESPLITTEDCUMCCOS" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      lblTextblockcc_almcd_Internalname = "TEXTBLOCKCC_ALMCD" ;
      Combo_cc_almcd_Internalname = "COMBO_CC_ALMCD" ;
      edtCC_AlmCd_Internalname = "CC_ALMCD" ;
      divTablesplittedcc_almcd_Internalname = "TABLESPLITTEDCC_ALMCD" ;
      divCombo_cc_almcd_cell_Internalname = "COMBO_CC_ALMCD_CELL" ;
      divUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
      divTableattributes_Internalname = "TABLEATTRIBUTES" ;
      Dvpanel_tableattributes_Internalname = "DVPANEL_TABLEATTRIBUTES" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      edtPrdNum_Internalname = "PRDNUM" ;
      edtPrdNom_Internalname = "PRDNOM" ;
      edtPrdFacCon_Internalname = "PRDFACCON" ;
      edtPrdExiAlm_Internalname = "PRDEXIALM" ;
      edtPrdExiCC_Internalname = "PRDEXICC" ;
      edtPrdCanRes_Internalname = "PRDCANRES" ;
      edtCumConCant_Internalname = "CUMCONCANT" ;
      cmbCumUnidad.setInternalname( "CUMUNIDAD" );
      edtCumConLot_Internalname = "CUMCONLOT" ;
      edtCumConCbis_Internalname = "CUMCONCBIS" ;
      edtCumCosPro_Internalname = "CUMCOSPRO" ;
      edtPrdPreAct_Internalname = "PRDPREACT" ;
      edtPrdPreMed_Internalname = "PRDPREMED" ;
      edtUltFecCCs_Internalname = "ULTFECCCS" ;
      edtPrdValStk_Internalname = "PRDVALSTK" ;
      edtForPrdUMe_Internalname = "FORPRDUME" ;
      edtForPrdDsc_Internalname = "FORPRDDSC" ;
      edtPrdComID_Internalname = "PRDCOMID" ;
      edtPrdLote_Internalname = "PRDLOTE" ;
      cmbCumUMed.setInternalname( "CUMUMED" );
      edtCumLotAlm_Internalname = "CUMLOTALM" ;
      edtValCod_Internalname = "VALCOD" ;
      divTableleaflevel_producto_Internalname = "TABLELEAFLEVEL_PRODUCTO" ;
      bttBtntrn_enter_Internalname = "BTNTRN_ENTER" ;
      bttBtntrn_cancel_Internalname = "BTNTRN_CANCEL" ;
      bttBtntrn_delete_Internalname = "BTNTRN_DELETE" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      edtavCombocumccos_Internalname = "vCOMBOCUMCCOS" ;
      divSectionattribute_cumccos_Internalname = "SECTIONATTRIBUTE_CUMCCOS" ;
      edtavCombocc_almcd_Internalname = "vCOMBOCC_ALMCD" ;
      divSectionattribute_cc_almcd_Internalname = "SECTIONATTRIBUTE_CC_ALMCD" ;
      Combo_prdnum_Internalname = "COMBO_PRDNUM" ;
      edtEmpNumDec_Internalname = "EMPNUMDEC" ;
      divHtml_bottomauxiliarcontrols_Internalname = "HTML_BOTTOMAUXILIARCONTROLS" ;
      divLayoutmaintable_Internalname = "LAYOUTMAINTABLE" ;
      Form.setInternalname( "FORM" );
      subGridlevel_producto_Internalname = "GRIDLEVEL_PRODUCTO" ;
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
      subGridlevel_producto_Allowcollapsing = (byte)(0) ;
      subGridlevel_producto_Allowselection = (byte)(0) ;
      subGridlevel_producto_Header = "" ;
      Combo_prdnum_Enabled = GXutil.toBoolean( -1) ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "Consumo Manual", "") );
      edtValCod_Jsonclick = "" ;
      edtCumLotAlm_Jsonclick = "" ;
      cmbCumUMed.setJsonclick( "" );
      edtPrdLote_Jsonclick = "" ;
      edtPrdComID_Jsonclick = "" ;
      edtForPrdDsc_Jsonclick = "" ;
      edtForPrdUMe_Jsonclick = "" ;
      edtPrdValStk_Jsonclick = "" ;
      edtUltFecCCs_Jsonclick = "" ;
      edtPrdPreMed_Jsonclick = "" ;
      edtPrdPreAct_Jsonclick = "" ;
      edtCumCosPro_Jsonclick = "" ;
      edtCumConCbis_Jsonclick = "" ;
      edtCumConLot_Jsonclick = "" ;
      cmbCumUnidad.setJsonclick( "" );
      edtCumConCant_Jsonclick = "" ;
      edtPrdCanRes_Jsonclick = "" ;
      edtPrdExiCC_Jsonclick = "" ;
      edtPrdExiAlm_Jsonclick = "" ;
      edtPrdFacCon_Jsonclick = "" ;
      edtPrdNom_Jsonclick = "" ;
      edtPrdNum_Jsonclick = "" ;
      subGridlevel_producto_Class = "GridNoBorder WorkWith" ;
      subGridlevel_producto_Backcolorstyle = (byte)(0) ;
      Combo_cc_almcd_Visible = GXutil.toBoolean( -1) ;
      Combo_prdnum_Titlecontrolidtoreplace = "" ;
      edtValCod_Enabled = 0 ;
      edtCumLotAlm_Enabled = 0 ;
      cmbCumUMed.setEnabled( 0 );
      edtPrdLote_Enabled = 0 ;
      edtPrdComID_Enabled = 0 ;
      edtForPrdDsc_Enabled = 0 ;
      edtForPrdUMe_Enabled = 0 ;
      edtPrdValStk_Enabled = 0 ;
      edtUltFecCCs_Enabled = 0 ;
      edtPrdPreMed_Enabled = 0 ;
      edtPrdPreAct_Enabled = 0 ;
      edtCumCosPro_Enabled = 0 ;
      edtCumConCbis_Enabled = 1 ;
      edtCumConLot_Enabled = 1 ;
      cmbCumUnidad.setEnabled( 1 );
      edtCumConCant_Enabled = 1 ;
      edtPrdCanRes_Enabled = 0 ;
      edtPrdExiCC_Visible = -1 ;
      edtPrdExiCC_Enabled = 0 ;
      edtPrdExiAlm_Enabled = 0 ;
      edtPrdFacCon_Enabled = 0 ;
      edtPrdNom_Enabled = 0 ;
      edtPrdNum_Enabled = 1 ;
      edtEmpNumDec_Jsonclick = "" ;
      edtEmpNumDec_Enabled = 0 ;
      edtEmpNumDec_Visible = 1 ;
      Combo_prdnum_Emptyitem = GXutil.toBoolean( 0) ;
      Combo_prdnum_Isgriditem = GXutil.toBoolean( -1) ;
      Combo_prdnum_Cls = "ExtendedCombo" ;
      edtavCombocc_almcd_Jsonclick = "" ;
      edtavCombocc_almcd_Enabled = 0 ;
      edtavCombocc_almcd_Visible = 1 ;
      edtavCombocumccos_Jsonclick = "" ;
      edtavCombocumccos_Enabled = 0 ;
      edtavCombocumccos_Visible = 1 ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      bttBtntrn_delete_Enabled = 0 ;
      bttBtntrn_delete_Visible = 1 ;
      bttBtntrn_cancel_Visible = 1 ;
      bttBtntrn_enter_Enabled = 1 ;
      bttBtntrn_enter_Visible = 1 ;
      edtCC_AlmCd_Jsonclick = "" ;
      edtCC_AlmCd_Enabled = 1 ;
      edtCC_AlmCd_Visible = 1 ;
      Combo_cc_almcd_Cls = "ExtendedCombo AttributeFL" ;
      Combo_cc_almcd_Enabled = GXutil.toBoolean( -1) ;
      divCombo_cc_almcd_cell_Class = "col-xs-12" ;
      divUnnamedtable2_Visible = 1 ;
      edtCumCCos_Jsonclick = "" ;
      edtCumCCos_Enabled = 1 ;
      edtCumCCos_Visible = 1 ;
      Combo_cumccos_Cls = "ExtendedCombo AttributeFL" ;
      Combo_cumccos_Enabled = GXutil.toBoolean( -1) ;
      edtCumConFec_Jsonclick = "" ;
      edtCumConFec_Enabled = 1 ;
      edtCumCodCont_Jsonclick = "" ;
      edtCumCodCont_Enabled = 1 ;
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

   public void gx3asacc_almdc1SF111( String A396EmprCod ,
                                     byte A8925CC_AlmCd )
   {
      GXt_char1 = A8926CC_AlmDc ;
      GXv_char4[0] = A396EmprCod ;
      GXv_int6[0] = A8925CC_AlmCd ;
      GXv_char3[0] = GXt_char1 ;
      new app.pexialmc(remoteHandle, context).execute( GXv_char4, GXv_int6, GXv_char3) ;
      consumomanual_impl.this.A396EmprCod = GXv_char4[0] ;
      consumomanual_impl.this.A8925CC_AlmCd = GXv_int6[0] ;
      consumomanual_impl.this.GXt_char1 = GXv_char3[0] ;
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

   public void gx4asacumccosd1SF111( short A10777CumCCos )
   {
      GXt_char1 = A10778CumCCosD ;
      GXv_int12[0] = A10777CumCCos ;
      GXv_char4[0] = GXt_char1 ;
      new app.pccdsc(remoteHandle, context).execute( GXv_int12, GXv_char4) ;
      consumomanual_impl.this.A10777CumCCos = GXv_int12[0] ;
      consumomanual_impl.this.GXt_char1 = GXv_char4[0] ;
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

   public void gxasa7051SF111( String A396EmprCod )
   {
      GXt_int7 = 0 ;
      GXv_int8[0] = GXt_int7 ;
      new app.pbuscon(remoteHandle, context).execute( A396EmprCod, "011100", GXv_int8) ;
      consumomanual_impl.this.GXt_int7 = GXv_int8[0] ;
      edtPrdExiCC_Visible = ((GXt_int7==0) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdExiCC_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdExiCC_Visible), 5, 0), !bGXsfl_59_Refreshing);
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

   public void gx26asaultfecccs1SF112( String A396EmprCod ,
                                       String A719PrdNum )
   {
      GXt_date13 = A3835UltFecCCs ;
      GXv_char4[0] = A396EmprCod ;
      GXv_char3[0] = A719PrdNum ;
      GXv_date14[0] = GXt_date13 ;
      new app.pstm005(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_date14) ;
      consumomanual_impl.this.A396EmprCod = GXv_char4[0] ;
      consumomanual_impl.this.A719PrdNum = GXv_char3[0] ;
      consumomanual_impl.this.GXt_date13 = GXv_date14[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A3835UltFecCCs = GXt_date13 ;
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

   public void xc_25_1SF111( String A396EmprCod ,
                             int A859CumCodCont )
   {
      if ( (0==A859CumCodCont) && true /* After */ )
      {
         GXv_int8[0] = A859CumCodCont ;
         new app.pnumdoc(remoteHandle, context).execute( A396EmprCod, "111111", GXv_int8) ;
         A859CumCodCont = GXv_int8[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A859CumCodCont", GXutil.ltrimstr( DecimalUtil.doubleToDec(A859CumCodCont), 8, 0));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A859CumCodCont, (byte)(8), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_50_1SF112( String A396EmprCod ,
                             String A719PrdNum ,
                             java.util.Date A862CumConFec ,
                             java.math.BigDecimal A861CumConCbis ,
                             java.math.BigDecimal A726PrdPreMed ,
                             short AV30FlagPreMed )
   {
      if ( true /* After */ && true /* Level */ && ( AV30FlagPreMed == 1 ) )
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

   public void xc_51_1SF112( String A396EmprCod ,
                             String A719PrdNum ,
                             java.util.Date A862CumConFec ,
                             java.math.BigDecimal A861CumConCbis ,
                             java.math.BigDecimal A724PrdPreAct ,
                             short AV30FlagPreMed )
   {
      if ( true /* After */ && true /* Level */ && ( AV30FlagPreMed == 0 ) )
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

   public void xc_52_1SF112( String A396EmprCod ,
                             String A719PrdNum ,
                             short AV29Year ,
                             short AV28Mes ,
                             java.math.BigDecimal A861CumConCbis ,
                             java.math.BigDecimal AV27CumConOld ,
                             java.math.BigDecimal A726PrdPreMed ,
                             java.util.Date A862CumConFec ,
                             java.math.BigDecimal A860CumConCant ,
                             short AV30FlagPreMed )
   {
      if ( ( DecimalUtil.compareTo(A860CumConCant, AV27CumConOld) != 0 ) && ( true /* After */ || true /* After */ ) && ( AV30FlagPreMed == 1 ) )
      {
         new app.pentpr2(remoteHandle, context).execute( A396EmprCod, A719PrdNum, AV29Year, (byte)(AV28Mes), A861CumConCbis, AV27CumConOld, A726PrdPreMed, A862CumConFec) ;
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

   public void xc_53_1SF112( String A396EmprCod ,
                             String A719PrdNum ,
                             short AV29Year ,
                             short AV28Mes ,
                             java.math.BigDecimal A861CumConCbis ,
                             java.math.BigDecimal AV27CumConOld ,
                             java.math.BigDecimal A724PrdPreAct ,
                             java.util.Date A862CumConFec ,
                             java.math.BigDecimal A860CumConCant ,
                             short AV30FlagPreMed )
   {
      if ( ( DecimalUtil.compareTo(A860CumConCant, AV27CumConOld) != 0 ) && ( true /* After */ || true /* After */ ) && ( AV30FlagPreMed == 0 ) )
      {
         new app.pentpr2(remoteHandle, context).execute( A396EmprCod, A719PrdNum, AV29Year, (byte)(AV28Mes), A861CumConCbis, AV27CumConOld, A724PrdPreAct, A862CumConFec) ;
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

   public void xc_54_1SF112( )
   {
      if ( ( DecimalUtil.compareTo(A860CumConCant, AV27CumConOld) != 0 ) && ( true /* After */ && true /* After */ ) && ( AV30FlagPreMed == 1 ) )
      {
         new app.pnewcc8(remoteHandle, context).execute( A396EmprCod, A719PrdNum, DecimalUtil.doubleToDec(0), A861CumConCbis, httpContext.getMessage( "SM", ""), "1", A726PrdPreMed, 0, (byte)(0), " ", A859CumCodCont, " ", AV9UsurCod, httpContext.getMessage( "Consumo Manual Almacen,WEB", ""), (short)(0), AV27CumConOld, DecimalUtil.doubleToDec(0), A862CumConFec, A10777CumCCos, A5862CumConLot) ;
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

   public void xc_55_1SF112( )
   {
      if ( ( DecimalUtil.compareTo(A860CumConCant, AV27CumConOld) != 0 ) && ( true /* After */ || true /* After */ ) && ( AV30FlagPreMed == 0 ) )
      {
         new app.pnewcc8(remoteHandle, context).execute( A396EmprCod, A719PrdNum, DecimalUtil.doubleToDec(0), A861CumConCbis, httpContext.getMessage( "SM", ""), "1", A724PrdPreAct, 0, (byte)(0), " ", A859CumCodCont, " ", AV9UsurCod, httpContext.getMessage( "Consumo Manual Almacen,WEB", ""), (short)(0), AV27CumConOld, DecimalUtil.doubleToDec(0), A862CumConFec, A10777CumCCos, A5862CumConLot) ;
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

   public void xc_56_1SF112( String A396EmprCod ,
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

   public void xc_57_1SF112( String A396EmprCod ,
                             String A719PrdNum ,
                             String A5862CumConLot ,
                             short AV25Moda21 )
   {
      if ( ( AV25Moda21 == 1 ) && ! (GXutil.strcmp("", A5862CumConLot)==0) )
      {
         GXv_char4[0] = AV26Ok ;
         new app.plotectrl(remoteHandle, context).execute( A396EmprCod, A719PrdNum, A5862CumConLot, GXv_char4) ;
         AV26Ok = GXv_char4[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV26Ok", AV26Ok);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( AV26Ok))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void gxnrgridlevel_producto_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      subsflControlProps_59112( ) ;
      while ( nGXsfl_59_idx <= nRC_GXsfl_59 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal1SF112( ) ;
         standaloneModal1SF112( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow1SF112( ) ;
         nGXsfl_59_idx = (int)(nGXsfl_59_idx+1) ;
         sGXsfl_59_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_59_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_59112( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Gridlevel_productoContainer)) ;
      /* End function gxnrGridlevel_producto_newrow */
   }

   public void init_web_controls( )
   {
      GXCCtl = "CUMUNIDAD_" + sGXsfl_59_idx ;
      cmbCumUnidad.setName( GXCCtl );
      cmbCumUnidad.setWebtags( "" );
      cmbCumUnidad.addItem("1", httpContext.getMessage( "kg/lt", ""), (short)(0));
      cmbCumUnidad.addItem("0", httpContext.getMessage( "gr/cc", ""), (short)(0));
      if ( cmbCumUnidad.getItemCount() > 0 )
      {
         if ( isIns( ) && (0==A8639CumUnidad) )
         {
            A8639CumUnidad = (byte)(AV23ConMan) ;
         }
      }
      GXCCtl = "CUMUMED_" + sGXsfl_59_idx ;
      cmbCumUMed.setName( GXCCtl );
      cmbCumUMed.setWebtags( "" );
      cmbCumUMed.addItem("0", httpContext.getMessage( "Sin Definir", ""), (short)(0));
      cmbCumUMed.addItem("1", httpContext.getMessage( "Kilos", ""), (short)(0));
      cmbCumUMed.addItem("2", httpContext.getMessage( "Gramos", ""), (short)(0));
      cmbCumUMed.addItem("3", httpContext.getMessage( "Litros", ""), (short)(0));
      cmbCumUMed.addItem("4", httpContext.getMessage( "Mililitros", ""), (short)(0));
      if ( cmbCumUMed.getItemCount() > 0 )
      {
         A12700CumUMed = (byte)(GXutil.lval( cmbCumUMed.getValidValue(GXutil.trim( GXutil.str( A12700CumUMed, 1, 0))))) ;
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

   public void valid_Cumconfec( )
   {
      AV28Mes = (short)(GXutil.month( A862CumConFec)) ;
      AV29Year = (short)(GXutil.year( A862CumConFec)) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "AV28Mes", GXutil.ltrim( localUtil.ntoc( AV28Mes, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV29Year", GXutil.ltrim( localUtil.ntoc( AV29Year, (byte)(4), (byte)(0), ".", "")));
   }

   public void valid_Cumccos( )
   {
      GXt_char1 = A10778CumCCosD ;
      GXv_int12[0] = A10777CumCCos ;
      GXv_char4[0] = GXt_char1 ;
      new app.pccdsc(remoteHandle, context).execute( GXv_int12, GXv_char4) ;
      consumomanual_impl.this.A10777CumCCos = GXv_int12[0] ;
      consumomanual_impl.this.GXt_char1 = GXv_char4[0] ;
      A10778CumCCosD = GXt_char1 ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A10778CumCCosD", GXutil.rtrim( A10778CumCCosD));
   }

   public void valid_Cc_almcd( )
   {
      n8925CC_AlmCd = false ;
      GXt_char1 = A8926CC_AlmDc ;
      GXv_char4[0] = A396EmprCod ;
      GXv_int6[0] = A8925CC_AlmCd ;
      GXv_char3[0] = GXt_char1 ;
      new app.pexialmc(remoteHandle, context).execute( GXv_char4, GXv_int6, GXv_char3) ;
      consumomanual_impl.this.A396EmprCod = GXv_char4[0] ;
      consumomanual_impl.this.A8925CC_AlmCd = GXv_int6[0] ;
      consumomanual_impl.this.GXt_char1 = GXv_char3[0] ;
      A8926CC_AlmDc = GXt_char1 ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A8926CC_AlmDc", GXutil.rtrim( A8926CC_AlmDc));
   }

   public void valid_Prdnum( )
   {
      /* Using cursor T01SF26 */
      pr_default.execute(24, new Object[] {A396EmprCod, A719PrdNum});
      Z718PrdNom = T01SF26_A718PrdNom[0] ;
      Z707PrdFacCon = T01SF26_A707PrdFacCon[0] ;
      Z705PrdExiCC = T01SF26_A705PrdExiCC[0] ;
      Z685PrdCanRes = T01SF26_A685PrdCanRes[0] ;
      Z724PrdPreAct = T01SF26_A724PrdPreAct[0] ;
      Z726PrdPreMed = T01SF26_A726PrdPreMed[0] ;
      Z10881PrdLote = T01SF26_A10881PrdLote[0] ;
      Z856ValCod = T01SF26_A856ValCod[0] ;
      if ( (pr_default.getStatus(24) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PRODUC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PRDNUM");
         AnyError = (short)(1) ;
         GX_FocusControl = edtPrdNum_Internalname ;
      }
      A704PrdExiAlm = T01SF26_A704PrdExiAlm[0] ;
      A750PrdValStk = T01SF26_A750PrdValStk[0] ;
      A718PrdNom = T01SF26_A718PrdNom[0] ;
      A707PrdFacCon = T01SF26_A707PrdFacCon[0] ;
      A705PrdExiCC = T01SF26_A705PrdExiCC[0] ;
      A685PrdCanRes = T01SF26_A685PrdCanRes[0] ;
      A724PrdPreAct = T01SF26_A724PrdPreAct[0] ;
      A726PrdPreMed = T01SF26_A726PrdPreMed[0] ;
      A10881PrdLote = T01SF26_A10881PrdLote[0] ;
      A856ValCod = T01SF26_A856ValCod[0] ;
      O750PrdValStk = A750PrdValStk ;
      O704PrdExiAlm = A704PrdExiAlm ;
      pr_default.close(24);
      if ( isIns( )  && (GXutil.strcmp("", A5862CumConLot)==0) && ( Gx_BScreen == 0 ) )
      {
         A5862CumConLot = A10881PrdLote ;
      }
      GXt_date13 = A3835UltFecCCs ;
      GXv_char4[0] = A396EmprCod ;
      GXv_char3[0] = A719PrdNum ;
      GXv_date14[0] = GXt_date13 ;
      new app.pstm005(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_date14) ;
      consumomanual_impl.this.A396EmprCod = GXv_char4[0] ;
      consumomanual_impl.this.A719PrdNum = GXv_char3[0] ;
      consumomanual_impl.this.GXt_date13 = GXv_date14[0] ;
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
         AV27CumConOld = (O860CumConCant.divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN)).multiply(A707PrdFacCon) ;
      }
      else
      {
         if ( A8639CumUnidad == 1 )
         {
            AV27CumConOld = O860CumConCant.multiply(A707PrdFacCon) ;
         }
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A861CumConCbis", GXutil.ltrim( localUtil.ntoc( A861CumConCbis, (byte)(12), (byte)(4), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV27CumConOld", GXutil.ltrim( localUtil.ntoc( AV27CumConOld, (byte)(12), (byte)(4), ".", "")));
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV10EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV11CumCodCont',fld:'vCUMCODCONT',pic:'ZZZZZZZ9',hsh:true}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV13TrnContext',fld:'vTRNCONTEXT',pic:'',hsh:true},{av:'AV10EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV11CumCodCont',fld:'vCUMCODCONT',pic:'ZZZZZZZ9',hsh:true},{av:'AV36Pgmname',fld:'vPGMNAME',pic:''},{av:'A11368CumConTipo',fld:'CUMCONTIPO',pic:'Z9'}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("AFTER TRN","{handler:'e121SF2',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV13TrnContext',fld:'vTRNCONTEXT',pic:'',hsh:true}]");
      setEventMetadata("AFTER TRN",",oparms:[]}");
      setEventMetadata("VALID_CUMCODCONT","{handler:'valid_Cumcodcont',iparms:[]");
      setEventMetadata("VALID_CUMCODCONT",",oparms:[]}");
      setEventMetadata("VALID_CUMCONFEC","{handler:'valid_Cumconfec',iparms:[{av:'A862CumConFec',fld:'CUMCONFEC',pic:''},{av:'AV28Mes',fld:'vMES',pic:'ZZZ9'},{av:'AV29Year',fld:'vYEAR',pic:'ZZZ9'}]");
      setEventMetadata("VALID_CUMCONFEC",",oparms:[{av:'AV28Mes',fld:'vMES',pic:'ZZZ9'},{av:'AV29Year',fld:'vYEAR',pic:'ZZZ9'}]}");
      setEventMetadata("VALID_CUMCCOS","{handler:'valid_Cumccos',iparms:[{av:'A10777CumCCos',fld:'CUMCCOS',pic:'ZZ9'},{av:'A10778CumCCosD',fld:'CUMCCOSD',pic:''}]");
      setEventMetadata("VALID_CUMCCOS",",oparms:[{av:'A10778CumCCosD',fld:'CUMCCOSD',pic:''}]}");
      setEventMetadata("VALID_CC_ALMCD","{handler:'valid_Cc_almcd',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A8925CC_AlmCd',fld:'CC_ALMCD',pic:'Z9'},{av:'A8926CC_AlmDc',fld:'CC_ALMDC',pic:''}]");
      setEventMetadata("VALID_CC_ALMCD",",oparms:[{av:'A8926CC_AlmDc',fld:'CC_ALMDC',pic:''}]}");
      setEventMetadata("VALIDV_COMBOCUMCCOS","{handler:'validv_Combocumccos',iparms:[]");
      setEventMetadata("VALIDV_COMBOCUMCCOS",",oparms:[]}");
      setEventMetadata("VALIDV_COMBOCC_ALMCD","{handler:'validv_Combocc_almcd',iparms:[]");
      setEventMetadata("VALIDV_COMBOCC_ALMCD",",oparms:[]}");
      setEventMetadata("VALID_EMPNUMDEC","{handler:'valid_Empnumdec',iparms:[]");
      setEventMetadata("VALID_EMPNUMDEC",",oparms:[]}");
      setEventMetadata("VALID_PRDNUM","{handler:'valid_Prdnum',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A719PrdNum',fld:'PRDNUM',pic:''},{av:'A10881PrdLote',fld:'PRDLOTE',pic:''},{av:'Gx_BScreen',fld:'vGXBSCREEN',pic:'9'},{av:'A704PrdExiAlm',fld:'PRDEXIALM',pic:'ZZZZZZ9.9999'},{av:'A750PrdValStk',fld:'PRDVALSTK',pic:'ZZZZZZZ9.99'},{av:'A718PrdNom',fld:'PRDNOM',pic:''},{av:'A707PrdFacCon',fld:'PRDFACCON',pic:'Z9.9999'},{av:'A705PrdExiCC',fld:'PRDEXICC',pic:'ZZZZZZ9.9999'},{av:'A685PrdCanRes',fld:'PRDCANRES',pic:'ZZZZZZ9.9999'},{av:'A724PrdPreAct',fld:'PRDPREACT',pic:'ZZZZZZZ9.999'},{av:'A726PrdPreMed',fld:'PRDPREMED',pic:'ZZZZZZZ9.999'},{av:'A856ValCod',fld:'VALCOD',pic:'9'},{av:'A5862CumConLot',fld:'CUMCONLOT',pic:''},{av:'A3835UltFecCCs',fld:'ULTFECCCS',pic:''}]");
      setEventMetadata("VALID_PRDNUM",",oparms:[{av:'O704PrdExiAlm'},{av:'O750PrdValStk'},{av:'A704PrdExiAlm',fld:'PRDEXIALM',pic:'ZZZZZZ9.9999'},{av:'A750PrdValStk',fld:'PRDVALSTK',pic:'ZZZZZZZ9.99'},{av:'A718PrdNom',fld:'PRDNOM',pic:''},{av:'A707PrdFacCon',fld:'PRDFACCON',pic:'Z9.9999'},{av:'A705PrdExiCC',fld:'PRDEXICC',pic:'ZZZZZZ9.9999'},{av:'A685PrdCanRes',fld:'PRDCANRES',pic:'ZZZZZZ9.9999'},{av:'A724PrdPreAct',fld:'PRDPREACT',pic:'ZZZZZZZ9.999'},{av:'A726PrdPreMed',fld:'PRDPREMED',pic:'ZZZZZZZ9.999'},{av:'A10881PrdLote',fld:'PRDLOTE',pic:''},{av:'A856ValCod',fld:'VALCOD',pic:'9'},{av:'A5862CumConLot',fld:'CUMCONLOT',pic:''},{av:'A3835UltFecCCs',fld:'ULTFECCCS',pic:''}]}");
      setEventMetadata("VALID_PRDFACCON","{handler:'valid_Prdfaccon',iparms:[]");
      setEventMetadata("VALID_PRDFACCON",",oparms:[]}");
      setEventMetadata("VALID_PRDEXIALM","{handler:'valid_Prdexialm',iparms:[]");
      setEventMetadata("VALID_PRDEXIALM",",oparms:[]}");
      setEventMetadata("VALID_CUMCONCANT","{handler:'valid_Cumconcant',iparms:[]");
      setEventMetadata("VALID_CUMCONCANT",",oparms:[]}");
      setEventMetadata("VALID_CUMUNIDAD","{handler:'valid_Cumunidad',iparms:[{av:'O860CumConCant'},{av:'A860CumConCant',fld:'CUMCONCANT',pic:'ZZZZZZ9.9999'},{av:'A707PrdFacCon',fld:'PRDFACCON',pic:'Z9.9999'},{av:'cmbCumUnidad'},{av:'A8639CumUnidad',fld:'CUMUNIDAD',pic:'9'},{av:'A861CumConCbis',fld:'CUMCONCBIS',pic:'ZZZZZZ9.9999'},{av:'AV27CumConOld',fld:'vCUMCONOLD',pic:'ZZZZZZ9.9999'}]");
      setEventMetadata("VALID_CUMUNIDAD",",oparms:[{av:'A861CumConCbis',fld:'CUMCONCBIS',pic:'ZZZZZZ9.9999'},{av:'AV27CumConOld',fld:'vCUMCONOLD',pic:'ZZZZZZ9.9999'}]}");
      setEventMetadata("VALID_CUMCONLOT","{handler:'valid_Cumconlot',iparms:[]");
      setEventMetadata("VALID_CUMCONLOT",",oparms:[]}");
      setEventMetadata("VALID_CUMCONCBIS","{handler:'valid_Cumconcbis',iparms:[]");
      setEventMetadata("VALID_CUMCONCBIS",",oparms:[]}");
      setEventMetadata("VALID_PRDPREACT","{handler:'valid_Prdpreact',iparms:[]");
      setEventMetadata("VALID_PRDPREACT",",oparms:[]}");
      setEventMetadata("VALID_PRDPREMED","{handler:'valid_Prdpremed',iparms:[]");
      setEventMetadata("VALID_PRDPREMED",",oparms:[]}");
      setEventMetadata("VALID_PRDVALSTK","{handler:'valid_Prdvalstk',iparms:[]");
      setEventMetadata("VALID_PRDVALSTK",",oparms:[]}");
      setEventMetadata("VALID_FORPRDUME","{handler:'valid_Forprdume',iparms:[]");
      setEventMetadata("VALID_FORPRDUME",",oparms:[]}");
      setEventMetadata("VALID_PRDLOTE","{handler:'valid_Prdlote',iparms:[]");
      setEventMetadata("VALID_PRDLOTE",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Valcod',iparms:[]");
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
      pr_default.close(24);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOGx_mode = "" ;
      wcpOAV10EmprCod = "" ;
      Z396EmprCod = "" ;
      Z862CumConFec = GXutil.nullDate() ;
      Combo_cc_almcd_Selectedvalue_get = "" ;
      Combo_cumccos_Selectedvalue_get = "" ;
      Z719PrdNum = "" ;
      Z5862CumConLot = "" ;
      Z861CumConCbis = DecimalUtil.ZERO ;
      Z860CumConCant = DecimalUtil.ZERO ;
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
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A719PrdNum = "" ;
      A862CumConFec = GXutil.nullDate() ;
      A861CumConCbis = DecimalUtil.ZERO ;
      A726PrdPreMed = DecimalUtil.ZERO ;
      A724PrdPreAct = DecimalUtil.ZERO ;
      AV27CumConOld = DecimalUtil.ZERO ;
      A860CumConCant = DecimalUtil.ZERO ;
      A5862CumConLot = "" ;
      Gx_mode = "" ;
      AV10EmprCod = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      GX_FocusControl = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_tableattributes = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      lblTextblockcumccos_Jsonclick = "" ;
      ucCombo_cumccos = new com.genexus.webpanels.GXUserControl();
      Combo_cumccos_Caption = "" ;
      AV17CumCCos_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      lblTextblockcc_almcd_Jsonclick = "" ;
      ucCombo_cc_almcd = new com.genexus.webpanels.GXUserControl();
      Combo_cc_almcd_Caption = "" ;
      AV20CC_AlmCd_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      bttBtntrn_enter_Jsonclick = "" ;
      bttBtntrn_cancel_Jsonclick = "" ;
      bttBtntrn_delete_Jsonclick = "" ;
      AV36Pgmname = "" ;
      ucCombo_prdnum = new com.genexus.webpanels.GXUserControl();
      Combo_prdnum_Caption = "" ;
      AV24PrdNum_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      Gridlevel_productoContainer = new com.genexus.webpanels.GXWebGrid(context);
      sMode112 = "" ;
      sStyleString = "" ;
      A8926CC_AlmDc = "" ;
      A10778CumCCosD = "" ;
      A407EmprNom = "" ;
      AV34CumConCbis = DecimalUtil.ZERO ;
      AV9UsurCod = "" ;
      AV26Ok = "" ;
      Combo_cumccos_Objectcall = "" ;
      Combo_cumccos_Class = "" ;
      Combo_cumccos_Icontype = "" ;
      Combo_cumccos_Icon = "" ;
      Combo_cumccos_Tooltip = "" ;
      Combo_cumccos_Selectedvalue_set = "" ;
      Combo_cumccos_Selectedtext_set = "" ;
      Combo_cumccos_Selectedtext_get = "" ;
      Combo_cumccos_Gamoauthtoken = "" ;
      Combo_cumccos_Ddointernalname = "" ;
      Combo_cumccos_Titlecontrolalign = "" ;
      Combo_cumccos_Dropdownoptionstype = "" ;
      Combo_cumccos_Titlecontrolidtoreplace = "" ;
      Combo_cumccos_Datalisttype = "" ;
      Combo_cumccos_Datalistfixedvalues = "" ;
      Combo_cumccos_Datalistproc = "" ;
      Combo_cumccos_Datalistprocparametersprefix = "" ;
      Combo_cumccos_Remoteservicesparameters = "" ;
      Combo_cumccos_Htmltemplate = "" ;
      Combo_cumccos_Multiplevaluestype = "" ;
      Combo_cumccos_Loadingdata = "" ;
      Combo_cumccos_Noresultsfound = "" ;
      Combo_cumccos_Emptyitemtext = "" ;
      Combo_cumccos_Onlyselectedvalues = "" ;
      Combo_cumccos_Selectalltext = "" ;
      Combo_cumccos_Multiplevaluesseparator = "" ;
      Combo_cumccos_Addnewoptiontext = "" ;
      Combo_cc_almcd_Objectcall = "" ;
      Combo_cc_almcd_Class = "" ;
      Combo_cc_almcd_Icontype = "" ;
      Combo_cc_almcd_Icon = "" ;
      Combo_cc_almcd_Tooltip = "" ;
      Combo_cc_almcd_Selectedvalue_set = "" ;
      Combo_cc_almcd_Selectedtext_set = "" ;
      Combo_cc_almcd_Selectedtext_get = "" ;
      Combo_cc_almcd_Gamoauthtoken = "" ;
      Combo_cc_almcd_Ddointernalname = "" ;
      Combo_cc_almcd_Titlecontrolalign = "" ;
      Combo_cc_almcd_Dropdownoptionstype = "" ;
      Combo_cc_almcd_Titlecontrolidtoreplace = "" ;
      Combo_cc_almcd_Datalisttype = "" ;
      Combo_cc_almcd_Datalistfixedvalues = "" ;
      Combo_cc_almcd_Datalistproc = "" ;
      Combo_cc_almcd_Datalistprocparametersprefix = "" ;
      Combo_cc_almcd_Remoteservicesparameters = "" ;
      Combo_cc_almcd_Htmltemplate = "" ;
      Combo_cc_almcd_Multiplevaluestype = "" ;
      Combo_cc_almcd_Loadingdata = "" ;
      Combo_cc_almcd_Noresultsfound = "" ;
      Combo_cc_almcd_Emptyitemtext = "" ;
      Combo_cc_almcd_Onlyselectedvalues = "" ;
      Combo_cc_almcd_Selectalltext = "" ;
      Combo_cc_almcd_Multiplevaluesseparator = "" ;
      Combo_cc_almcd_Addnewoptiontext = "" ;
      Dvpanel_tableattributes_Objectcall = "" ;
      Dvpanel_tableattributes_Class = "" ;
      Dvpanel_tableattributes_Height = "" ;
      Combo_prdnum_Objectcall = "" ;
      Combo_prdnum_Class = "" ;
      Combo_prdnum_Icontype = "" ;
      Combo_prdnum_Icon = "" ;
      Combo_prdnum_Tooltip = "" ;
      Combo_prdnum_Selectedvalue_set = "" ;
      Combo_prdnum_Selectedvalue_get = "" ;
      Combo_prdnum_Selectedtext_set = "" ;
      Combo_prdnum_Selectedtext_get = "" ;
      Combo_prdnum_Gamoauthtoken = "" ;
      Combo_prdnum_Ddointernalname = "" ;
      Combo_prdnum_Titlecontrolalign = "" ;
      Combo_prdnum_Dropdownoptionstype = "" ;
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
      forbiddenHiddens = new com.genexus.util.GXProperties();
      hsh = "" ;
      sMode111 = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      GXCCtl = "" ;
      A718PrdNom = "" ;
      A707PrdFacCon = DecimalUtil.ZERO ;
      A704PrdExiAlm = DecimalUtil.ZERO ;
      A705PrdExiCC = DecimalUtil.ZERO ;
      A685PrdCanRes = DecimalUtil.ZERO ;
      A863CumCosPro = DecimalUtil.ZERO ;
      A3835UltFecCCs = GXutil.nullDate() ;
      A750PrdValStk = DecimalUtil.ZERO ;
      A488ForPrdDsc = "" ;
      A12257PrdComID = "" ;
      A10881PrdLote = "" ;
      T750PrdValStk = DecimalUtil.ZERO ;
      T861CumConCbis = DecimalUtil.ZERO ;
      T704PrdExiAlm = DecimalUtil.ZERO ;
      T860CumConCant = DecimalUtil.ZERO ;
      AV7Station = "" ;
      AV8EmprNom = "" ;
      GXv_char2 = new String[1] ;
      AV12WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext9 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV13TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV14WebSession = httpContext.getWebSession();
      AV16TrnContextAtt = new app.wwpbaseobjects.SdtWWPTransactionContext_Attribute(remoteHandle, context);
      AV18ComboSelectedValue = "" ;
      GXt_objcol_SdtDVB_SDTComboData_Item10 = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      GXv_objcol_SdtDVB_SDTComboData_Item11 = new GXBaseCollection[1] ;
      Z407EmprNom = "" ;
      T01SF9_A407EmprNom = new String[] {""} ;
      T01SF9_n407EmprNom = new boolean[] {false} ;
      T01SF9_A3915EmpNumDec = new byte[1] ;
      T01SF9_n3915EmpNumDec = new boolean[] {false} ;
      T01SF11_A859CumCodCont = new int[1] ;
      T01SF11_A8925CC_AlmCd = new byte[1] ;
      T01SF11_n8925CC_AlmCd = new boolean[] {false} ;
      T01SF11_A10777CumCCos = new short[1] ;
      T01SF11_A407EmprNom = new String[] {""} ;
      T01SF11_n407EmprNom = new boolean[] {false} ;
      T01SF11_A3915EmpNumDec = new byte[1] ;
      T01SF11_n3915EmpNumDec = new boolean[] {false} ;
      T01SF11_A11368CumConTipo = new byte[1] ;
      T01SF11_A862CumConFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01SF11_A396EmprCod = new String[] {""} ;
      T01SF11_A3839CcoCod = new short[1] ;
      T01SF11_n3839CcoCod = new boolean[] {false} ;
      T01SF10_A3839CcoCod = new short[1] ;
      T01SF10_n3839CcoCod = new boolean[] {false} ;
      T01SF12_A3839CcoCod = new short[1] ;
      T01SF12_n3839CcoCod = new boolean[] {false} ;
      T01SF13_A396EmprCod = new String[] {""} ;
      T01SF13_A859CumCodCont = new int[1] ;
      T01SF8_A859CumCodCont = new int[1] ;
      T01SF8_A8925CC_AlmCd = new byte[1] ;
      T01SF8_n8925CC_AlmCd = new boolean[] {false} ;
      T01SF8_A10777CumCCos = new short[1] ;
      T01SF8_A11368CumConTipo = new byte[1] ;
      T01SF8_A862CumConFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01SF8_A396EmprCod = new String[] {""} ;
      T01SF8_A3839CcoCod = new short[1] ;
      T01SF8_n3839CcoCod = new boolean[] {false} ;
      T01SF14_A396EmprCod = new String[] {""} ;
      T01SF14_A859CumCodCont = new int[1] ;
      T01SF15_A396EmprCod = new String[] {""} ;
      T01SF15_A859CumCodCont = new int[1] ;
      T01SF7_A859CumCodCont = new int[1] ;
      T01SF7_A8925CC_AlmCd = new byte[1] ;
      T01SF7_n8925CC_AlmCd = new boolean[] {false} ;
      T01SF7_A10777CumCCos = new short[1] ;
      T01SF7_A11368CumConTipo = new byte[1] ;
      T01SF7_A862CumConFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01SF7_A396EmprCod = new String[] {""} ;
      T01SF7_A3839CcoCod = new short[1] ;
      T01SF7_n3839CcoCod = new boolean[] {false} ;
      T01SF19_A396EmprCod = new String[] {""} ;
      T01SF19_A859CumCodCont = new int[1] ;
      Z488ForPrdDsc = "" ;
      Z704PrdExiAlm = DecimalUtil.ZERO ;
      Z750PrdValStk = DecimalUtil.ZERO ;
      T01SF6_A488ForPrdDsc = new String[] {""} ;
      T01SF6_n488ForPrdDsc = new boolean[] {false} ;
      T01SF20_A859CumCodCont = new int[1] ;
      T01SF20_A8639CumUnidad = new byte[1] ;
      T01SF20_A5862CumConLot = new String[] {""} ;
      T01SF20_A861CumConCbis = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SF20_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SF20_A750PrdValStk = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SF20_A718PrdNom = new String[] {""} ;
      T01SF20_A707PrdFacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SF20_A705PrdExiCC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SF20_A685PrdCanRes = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SF20_A860CumConCant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SF20_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SF20_A726PrdPreMed = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SF20_A488ForPrdDsc = new String[] {""} ;
      T01SF20_n488ForPrdDsc = new boolean[] {false} ;
      T01SF20_A12257PrdComID = new String[] {""} ;
      T01SF20_A10881PrdLote = new String[] {""} ;
      T01SF20_A12700CumUMed = new byte[1] ;
      T01SF20_A14039CumLotAlm = new short[1] ;
      T01SF20_A396EmprCod = new String[] {""} ;
      T01SF20_A719PrdNum = new String[] {""} ;
      T01SF20_A490ForPrdUMe = new byte[1] ;
      T01SF20_A856ValCod = new byte[1] ;
      T01SF5_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SF5_A750PrdValStk = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SF5_A718PrdNom = new String[] {""} ;
      T01SF5_A707PrdFacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SF5_A705PrdExiCC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SF5_A685PrdCanRes = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SF5_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SF5_A726PrdPreMed = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SF5_A10881PrdLote = new String[] {""} ;
      T01SF5_A856ValCod = new byte[1] ;
      T01SF21_A396EmprCod = new String[] {""} ;
      T01SF21_A859CumCodCont = new int[1] ;
      T01SF21_A719PrdNum = new String[] {""} ;
      T01SF3_A859CumCodCont = new int[1] ;
      T01SF3_A8639CumUnidad = new byte[1] ;
      T01SF3_A5862CumConLot = new String[] {""} ;
      T01SF3_A861CumConCbis = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SF3_A860CumConCant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SF3_A12257PrdComID = new String[] {""} ;
      T01SF3_A12700CumUMed = new byte[1] ;
      T01SF3_A14039CumLotAlm = new short[1] ;
      T01SF3_A396EmprCod = new String[] {""} ;
      T01SF3_A719PrdNum = new String[] {""} ;
      T01SF3_A490ForPrdUMe = new byte[1] ;
      T01SF2_A859CumCodCont = new int[1] ;
      T01SF2_A8639CumUnidad = new byte[1] ;
      T01SF2_A5862CumConLot = new String[] {""} ;
      T01SF2_A861CumConCbis = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SF2_A860CumConCant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SF2_A12257PrdComID = new String[] {""} ;
      T01SF2_A12700CumUMed = new byte[1] ;
      T01SF2_A14039CumLotAlm = new short[1] ;
      T01SF2_A396EmprCod = new String[] {""} ;
      T01SF2_A719PrdNum = new String[] {""} ;
      T01SF2_A490ForPrdUMe = new byte[1] ;
      T01SF22_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SF22_A750PrdValStk = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SF22_A718PrdNom = new String[] {""} ;
      T01SF22_A707PrdFacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SF22_A705PrdExiCC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SF22_A685PrdCanRes = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SF22_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SF22_A726PrdPreMed = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SF22_A10881PrdLote = new String[] {""} ;
      T01SF22_A856ValCod = new byte[1] ;
      T01SF26_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SF26_A750PrdValStk = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SF26_A718PrdNom = new String[] {""} ;
      T01SF26_A707PrdFacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SF26_A705PrdExiCC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SF26_A685PrdCanRes = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SF26_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SF26_A726PrdPreMed = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SF26_A10881PrdLote = new String[] {""} ;
      T01SF26_A856ValCod = new byte[1] ;
      T01SF28_A396EmprCod = new String[] {""} ;
      T01SF28_A859CumCodCont = new int[1] ;
      T01SF28_A719PrdNum = new String[] {""} ;
      Gridlevel_productoRow = new com.genexus.webpanels.GXWebRow();
      subGridlevel_producto_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      i862CumConFec = GXutil.nullDate() ;
      Gridlevel_productoColumn = new com.genexus.webpanels.GXWebColumn();
      GXv_int8 = new int[1] ;
      GXv_int12 = new short[1] ;
      Z10778CumCCosD = "" ;
      GXt_char1 = "" ;
      GXv_int6 = new byte[1] ;
      Z8926CC_AlmDc = "" ;
      GXt_date13 = GXutil.nullDate() ;
      GXv_char4 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_date14 = new java.util.Date[1] ;
      ZO704PrdExiAlm = DecimalUtil.ZERO ;
      ZO750PrdValStk = DecimalUtil.ZERO ;
      Z3835UltFecCCs = GXutil.nullDate() ;
      ZV27CumConOld = DecimalUtil.ZERO ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.stocksquimicos.consumomanual__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.stocksquimicos.consumomanual__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.stocksquimicos.consumomanual__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.stocksquimicos.consumomanual__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.stocksquimicos.consumomanual__default(),
         new Object[] {
             new Object[] {
            T01SF2_A859CumCodCont, T01SF2_A8639CumUnidad, T01SF2_A5862CumConLot, T01SF2_A861CumConCbis, T01SF2_A860CumConCant, T01SF2_A12257PrdComID, T01SF2_A12700CumUMed, T01SF2_A14039CumLotAlm, T01SF2_A396EmprCod, T01SF2_A719PrdNum,
            T01SF2_A490ForPrdUMe
            }
            , new Object[] {
            T01SF3_A859CumCodCont, T01SF3_A8639CumUnidad, T01SF3_A5862CumConLot, T01SF3_A861CumConCbis, T01SF3_A860CumConCant, T01SF3_A12257PrdComID, T01SF3_A12700CumUMed, T01SF3_A14039CumLotAlm, T01SF3_A396EmprCod, T01SF3_A719PrdNum,
            T01SF3_A490ForPrdUMe
            }
            , new Object[] {
            T01SF4_A704PrdExiAlm, T01SF4_A750PrdValStk, T01SF4_A718PrdNom, T01SF4_A707PrdFacCon, T01SF4_A705PrdExiCC, T01SF4_A685PrdCanRes, T01SF4_A724PrdPreAct, T01SF4_A726PrdPreMed, T01SF4_A10881PrdLote, T01SF4_A856ValCod
            }
            , new Object[] {
            T01SF5_A704PrdExiAlm, T01SF5_A750PrdValStk, T01SF5_A718PrdNom, T01SF5_A707PrdFacCon, T01SF5_A705PrdExiCC, T01SF5_A685PrdCanRes, T01SF5_A724PrdPreAct, T01SF5_A726PrdPreMed, T01SF5_A10881PrdLote, T01SF5_A856ValCod
            }
            , new Object[] {
            T01SF6_A488ForPrdDsc, T01SF6_n488ForPrdDsc
            }
            , new Object[] {
            T01SF7_A859CumCodCont, T01SF7_A8925CC_AlmCd, T01SF7_n8925CC_AlmCd, T01SF7_A10777CumCCos, T01SF7_A11368CumConTipo, T01SF7_A862CumConFec, T01SF7_A396EmprCod, T01SF7_A3839CcoCod, T01SF7_n3839CcoCod
            }
            , new Object[] {
            T01SF8_A859CumCodCont, T01SF8_A8925CC_AlmCd, T01SF8_n8925CC_AlmCd, T01SF8_A10777CumCCos, T01SF8_A11368CumConTipo, T01SF8_A862CumConFec, T01SF8_A396EmprCod, T01SF8_A3839CcoCod, T01SF8_n3839CcoCod
            }
            , new Object[] {
            T01SF9_A407EmprNom, T01SF9_n407EmprNom, T01SF9_A3915EmpNumDec, T01SF9_n3915EmpNumDec
            }
            , new Object[] {
            T01SF10_A3839CcoCod
            }
            , new Object[] {
            T01SF11_A859CumCodCont, T01SF11_A8925CC_AlmCd, T01SF11_n8925CC_AlmCd, T01SF11_A10777CumCCos, T01SF11_A407EmprNom, T01SF11_n407EmprNom, T01SF11_A3915EmpNumDec, T01SF11_n3915EmpNumDec, T01SF11_A11368CumConTipo, T01SF11_A862CumConFec,
            T01SF11_A396EmprCod, T01SF11_A3839CcoCod, T01SF11_n3839CcoCod
            }
            , new Object[] {
            T01SF12_A3839CcoCod
            }
            , new Object[] {
            T01SF13_A396EmprCod, T01SF13_A859CumCodCont
            }
            , new Object[] {
            T01SF14_A396EmprCod, T01SF14_A859CumCodCont
            }
            , new Object[] {
            T01SF15_A396EmprCod, T01SF15_A859CumCodCont
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01SF19_A396EmprCod, T01SF19_A859CumCodCont
            }
            , new Object[] {
            T01SF20_A859CumCodCont, T01SF20_A8639CumUnidad, T01SF20_A5862CumConLot, T01SF20_A861CumConCbis, T01SF20_A704PrdExiAlm, T01SF20_A750PrdValStk, T01SF20_A718PrdNom, T01SF20_A707PrdFacCon, T01SF20_A705PrdExiCC, T01SF20_A685PrdCanRes,
            T01SF20_A860CumConCant, T01SF20_A724PrdPreAct, T01SF20_A726PrdPreMed, T01SF20_A488ForPrdDsc, T01SF20_n488ForPrdDsc, T01SF20_A12257PrdComID, T01SF20_A10881PrdLote, T01SF20_A12700CumUMed, T01SF20_A14039CumLotAlm, T01SF20_A396EmprCod,
            T01SF20_A719PrdNum, T01SF20_A490ForPrdUMe, T01SF20_A856ValCod
            }
            , new Object[] {
            T01SF21_A396EmprCod, T01SF21_A859CumCodCont, T01SF21_A719PrdNum
            }
            , new Object[] {
            T01SF22_A704PrdExiAlm, T01SF22_A750PrdValStk, T01SF22_A718PrdNom, T01SF22_A707PrdFacCon, T01SF22_A705PrdExiCC, T01SF22_A685PrdCanRes, T01SF22_A724PrdPreAct, T01SF22_A726PrdPreMed, T01SF22_A10881PrdLote, T01SF22_A856ValCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01SF26_A704PrdExiAlm, T01SF26_A750PrdValStk, T01SF26_A718PrdNom, T01SF26_A707PrdFacCon, T01SF26_A705PrdExiCC, T01SF26_A685PrdCanRes, T01SF26_A724PrdPreAct, T01SF26_A726PrdPreMed, T01SF26_A10881PrdLote, T01SF26_A856ValCod
            }
            , new Object[] {
            }
            , new Object[] {
            T01SF28_A396EmprCod, T01SF28_A859CumCodCont, T01SF28_A719PrdNum
            }
         }
      );
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
      AV36Pgmname = "StocksQuimicos.ConsumoManual" ;
      Z5862CumConLot = "" ;
      A5862CumConLot = "" ;
      Z8639CumUnidad = (byte)(0) ;
      A8639CumUnidad = (byte)(0) ;
      i8639CumUnidad = (byte)(0) ;
      Z11368CumConTipo = (byte)(0) ;
      A11368CumConTipo = (byte)(0) ;
      i11368CumConTipo = (byte)(0) ;
      Z862CumConFec = GXutil.today( ) ;
      i862CumConFec = GXutil.today( ) ;
      A862CumConFec = GXutil.today( ) ;
   }

   private byte Z8925CC_AlmCd ;
   private byte Z11368CumConTipo ;
   private byte Z8639CumUnidad ;
   private byte Z12700CumUMed ;
   private byte Z490ForPrdUMe ;
   private byte Z856ValCod ;
   private byte GxWebError ;
   private byte A8925CC_AlmCd ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte AV21ComboCC_AlmCd ;
   private byte A3915EmpNumDec ;
   private byte A11368CumConTipo ;
   private byte A8639CumUnidad ;
   private byte A490ForPrdUMe ;
   private byte A12700CumUMed ;
   private byte A856ValCod ;
   private byte AV22Contval ;
   private byte Z3915EmpNumDec ;
   private byte GXt_int5 ;
   private byte subGridlevel_producto_Backcolorstyle ;
   private byte subGridlevel_producto_Backstyle ;
   private byte gxajaxcallmode ;
   private byte i11368CumConTipo ;
   private byte i8639CumUnidad ;
   private byte subGridlevel_producto_Allowselection ;
   private byte subGridlevel_producto_Allowhovering ;
   private byte subGridlevel_producto_Allowcollapsing ;
   private byte subGridlevel_producto_Collapsed ;
   private byte GXv_int6[] ;
   private short Z10777CumCCos ;
   private short Z3839CcoCod ;
   private short N3839CcoCod ;
   private short Z14039CumLotAlm ;
   private short nRcdDeleted_112 ;
   private short nRcdExists_112 ;
   private short nIsMod_112 ;
   private short AV30FlagPreMed ;
   private short AV29Year ;
   private short AV28Mes ;
   private short AV25Moda21 ;
   private short A10777CumCCos ;
   private short A3839CcoCod ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short AV23ConMan ;
   private short AV19ComboCumCCos ;
   private short nBlankRcdCount112 ;
   private short RcdFound112 ;
   private short nBlankRcdUsr112 ;
   private short AV15Insert_CcoCod ;
   private short AV31Precio_stk ;
   private short RcdFound111 ;
   private short A14039CumLotAlm ;
   private short AV32Val_stk ;
   private short nIsDirty_111 ;
   private short nIsDirty_112 ;
   private short ZV28Mes ;
   private short ZV29Year ;
   private short GXv_int12[] ;
   private int wcpOAV11CumCodCont ;
   private int Z859CumCodCont ;
   private int nRC_GXsfl_59 ;
   private int nGXsfl_59_idx=1 ;
   private int A859CumCodCont ;
   private int AV11CumCodCont ;
   private int trnEnded ;
   private int edtCumCodCont_Enabled ;
   private int edtCumConFec_Enabled ;
   private int edtCumCCos_Enabled ;
   private int edtCumCCos_Visible ;
   private int divUnnamedtable2_Visible ;
   private int edtCC_AlmCd_Enabled ;
   private int edtCC_AlmCd_Visible ;
   private int bttBtntrn_enter_Visible ;
   private int bttBtntrn_enter_Enabled ;
   private int bttBtntrn_cancel_Visible ;
   private int bttBtntrn_delete_Visible ;
   private int bttBtntrn_delete_Enabled ;
   private int edtavPgmname_Enabled ;
   private int edtavCombocumccos_Enabled ;
   private int edtavCombocumccos_Visible ;
   private int edtavCombocc_almcd_Enabled ;
   private int edtavCombocc_almcd_Visible ;
   private int edtEmpNumDec_Enabled ;
   private int edtEmpNumDec_Visible ;
   private int edtPrdNum_Enabled ;
   private int edtPrdNom_Enabled ;
   private int edtPrdFacCon_Enabled ;
   private int edtPrdExiAlm_Enabled ;
   private int edtPrdExiCC_Enabled ;
   private int edtPrdExiCC_Visible ;
   private int edtPrdCanRes_Enabled ;
   private int edtCumConCant_Enabled ;
   private int edtCumConLot_Enabled ;
   private int edtCumConCbis_Enabled ;
   private int edtCumCosPro_Enabled ;
   private int edtPrdPreAct_Enabled ;
   private int edtPrdPreMed_Enabled ;
   private int edtUltFecCCs_Enabled ;
   private int edtPrdValStk_Enabled ;
   private int edtForPrdUMe_Enabled ;
   private int edtForPrdDsc_Enabled ;
   private int edtPrdComID_Enabled ;
   private int edtPrdLote_Enabled ;
   private int edtCumLotAlm_Enabled ;
   private int edtValCod_Enabled ;
   private int fRowAdded ;
   private int Combo_cumccos_Datalistupdateminimumcharacters ;
   private int Combo_cc_almcd_Datalistupdateminimumcharacters ;
   private int Combo_prdnum_Datalistupdateminimumcharacters ;
   private int AV37GXV1 ;
   private int GX_JID ;
   private int subGridlevel_producto_Backcolor ;
   private int subGridlevel_producto_Allbackcolor ;
   private int defedtValCod_Enabled ;
   private int defedtCumLotAlm_Enabled ;
   private int defcmbCumUMed_Enabled ;
   private int defedtPrdLote_Enabled ;
   private int defedtPrdComID_Enabled ;
   private int defedtForPrdDsc_Enabled ;
   private int defedtForPrdUMe_Enabled ;
   private int defedtPrdValStk_Enabled ;
   private int defedtUltFecCCs_Enabled ;
   private int defedtPrdPreMed_Enabled ;
   private int defedtPrdPreAct_Enabled ;
   private int defedtCumCosPro_Enabled ;
   private int defedtPrdExiAlm_Enabled ;
   private int defedtPrdNom_Enabled ;
   private int defedtPrdNum_Enabled ;
   private int idxLst ;
   private int subGridlevel_producto_Selectedindex ;
   private int subGridlevel_producto_Selectioncolor ;
   private int subGridlevel_producto_Hoveringcolor ;
   private int GXt_int7 ;
   private int GXv_int8[] ;
   private long GRIDLEVEL_PRODUCTO_nFirstRecordOnPage ;
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
   private java.math.BigDecimal AV27CumConOld ;
   private java.math.BigDecimal A860CumConCant ;
   private java.math.BigDecimal AV34CumConCbis ;
   private java.math.BigDecimal A707PrdFacCon ;
   private java.math.BigDecimal A704PrdExiAlm ;
   private java.math.BigDecimal A705PrdExiCC ;
   private java.math.BigDecimal A685PrdCanRes ;
   private java.math.BigDecimal A863CumCosPro ;
   private java.math.BigDecimal A750PrdValStk ;
   private java.math.BigDecimal T750PrdValStk ;
   private java.math.BigDecimal T861CumConCbis ;
   private java.math.BigDecimal T704PrdExiAlm ;
   private java.math.BigDecimal T860CumConCant ;
   private java.math.BigDecimal Z704PrdExiAlm ;
   private java.math.BigDecimal Z750PrdValStk ;
   private java.math.BigDecimal ZO704PrdExiAlm ;
   private java.math.BigDecimal ZO750PrdValStk ;
   private java.math.BigDecimal ZV27CumConOld ;
   private String sPrefix ;
   private String wcpOGx_mode ;
   private String wcpOAV10EmprCod ;
   private String Z396EmprCod ;
   private String Combo_cc_almcd_Selectedvalue_get ;
   private String Combo_cumccos_Selectedvalue_get ;
   private String Z719PrdNum ;
   private String Z5862CumConLot ;
   private String Z12257PrdComID ;
   private String Z718PrdNom ;
   private String Z10881PrdLote ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A719PrdNum ;
   private String A5862CumConLot ;
   private String Gx_mode ;
   private String AV10EmprCod ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtCumCodCont_Internalname ;
   private String sGXsfl_59_idx="0001" ;
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
   private String divUnnamedtable1_Internalname ;
   private String TempTags ;
   private String edtCumCodCont_Jsonclick ;
   private String edtCumConFec_Internalname ;
   private String edtCumConFec_Jsonclick ;
   private String divTablesplittedcumccos_Internalname ;
   private String lblTextblockcumccos_Internalname ;
   private String lblTextblockcumccos_Jsonclick ;
   private String Combo_cumccos_Caption ;
   private String Combo_cumccos_Cls ;
   private String Combo_cumccos_Internalname ;
   private String edtCumCCos_Internalname ;
   private String edtCumCCos_Jsonclick ;
   private String divUnnamedtable2_Internalname ;
   private String divCombo_cc_almcd_cell_Internalname ;
   private String divCombo_cc_almcd_cell_Class ;
   private String divTablesplittedcc_almcd_Internalname ;
   private String lblTextblockcc_almcd_Internalname ;
   private String lblTextblockcc_almcd_Jsonclick ;
   private String Combo_cc_almcd_Caption ;
   private String Combo_cc_almcd_Cls ;
   private String Combo_cc_almcd_Internalname ;
   private String edtCC_AlmCd_Internalname ;
   private String edtCC_AlmCd_Jsonclick ;
   private String divTableleaflevel_producto_Internalname ;
   private String bttBtntrn_enter_Internalname ;
   private String bttBtntrn_enter_Jsonclick ;
   private String bttBtntrn_cancel_Internalname ;
   private String bttBtntrn_cancel_Jsonclick ;
   private String bttBtntrn_delete_Internalname ;
   private String bttBtntrn_delete_Jsonclick ;
   private String edtavPgmname_Internalname ;
   private String AV36Pgmname ;
   private String edtavPgmname_Jsonclick ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String divSectionattribute_cumccos_Internalname ;
   private String edtavCombocumccos_Internalname ;
   private String edtavCombocumccos_Jsonclick ;
   private String divSectionattribute_cc_almcd_Internalname ;
   private String edtavCombocc_almcd_Internalname ;
   private String edtavCombocc_almcd_Jsonclick ;
   private String Combo_prdnum_Caption ;
   private String Combo_prdnum_Cls ;
   private String Combo_prdnum_Internalname ;
   private String edtEmpNumDec_Internalname ;
   private String edtEmpNumDec_Jsonclick ;
   private String sMode112 ;
   private String edtPrdNum_Internalname ;
   private String edtPrdNom_Internalname ;
   private String edtPrdFacCon_Internalname ;
   private String edtPrdExiAlm_Internalname ;
   private String edtPrdExiCC_Internalname ;
   private String edtPrdCanRes_Internalname ;
   private String edtCumConCant_Internalname ;
   private String edtCumConLot_Internalname ;
   private String edtCumConCbis_Internalname ;
   private String edtCumCosPro_Internalname ;
   private String edtPrdPreAct_Internalname ;
   private String edtPrdPreMed_Internalname ;
   private String edtUltFecCCs_Internalname ;
   private String edtPrdValStk_Internalname ;
   private String edtForPrdUMe_Internalname ;
   private String edtForPrdDsc_Internalname ;
   private String edtPrdComID_Internalname ;
   private String edtPrdLote_Internalname ;
   private String edtCumLotAlm_Internalname ;
   private String edtValCod_Internalname ;
   private String sStyleString ;
   private String subGridlevel_producto_Internalname ;
   private String A8926CC_AlmDc ;
   private String A10778CumCCosD ;
   private String A407EmprNom ;
   private String AV9UsurCod ;
   private String AV26Ok ;
   private String Combo_cumccos_Objectcall ;
   private String Combo_cumccos_Class ;
   private String Combo_cumccos_Icontype ;
   private String Combo_cumccos_Icon ;
   private String Combo_cumccos_Tooltip ;
   private String Combo_cumccos_Selectedvalue_set ;
   private String Combo_cumccos_Selectedtext_set ;
   private String Combo_cumccos_Selectedtext_get ;
   private String Combo_cumccos_Gamoauthtoken ;
   private String Combo_cumccos_Ddointernalname ;
   private String Combo_cumccos_Titlecontrolalign ;
   private String Combo_cumccos_Dropdownoptionstype ;
   private String Combo_cumccos_Titlecontrolidtoreplace ;
   private String Combo_cumccos_Datalisttype ;
   private String Combo_cumccos_Datalistfixedvalues ;
   private String Combo_cumccos_Datalistproc ;
   private String Combo_cumccos_Datalistprocparametersprefix ;
   private String Combo_cumccos_Remoteservicesparameters ;
   private String Combo_cumccos_Htmltemplate ;
   private String Combo_cumccos_Multiplevaluestype ;
   private String Combo_cumccos_Loadingdata ;
   private String Combo_cumccos_Noresultsfound ;
   private String Combo_cumccos_Emptyitemtext ;
   private String Combo_cumccos_Onlyselectedvalues ;
   private String Combo_cumccos_Selectalltext ;
   private String Combo_cumccos_Multiplevaluesseparator ;
   private String Combo_cumccos_Addnewoptiontext ;
   private String Combo_cc_almcd_Objectcall ;
   private String Combo_cc_almcd_Class ;
   private String Combo_cc_almcd_Icontype ;
   private String Combo_cc_almcd_Icon ;
   private String Combo_cc_almcd_Tooltip ;
   private String Combo_cc_almcd_Selectedvalue_set ;
   private String Combo_cc_almcd_Selectedtext_set ;
   private String Combo_cc_almcd_Selectedtext_get ;
   private String Combo_cc_almcd_Gamoauthtoken ;
   private String Combo_cc_almcd_Ddointernalname ;
   private String Combo_cc_almcd_Titlecontrolalign ;
   private String Combo_cc_almcd_Dropdownoptionstype ;
   private String Combo_cc_almcd_Titlecontrolidtoreplace ;
   private String Combo_cc_almcd_Datalisttype ;
   private String Combo_cc_almcd_Datalistfixedvalues ;
   private String Combo_cc_almcd_Datalistproc ;
   private String Combo_cc_almcd_Datalistprocparametersprefix ;
   private String Combo_cc_almcd_Remoteservicesparameters ;
   private String Combo_cc_almcd_Htmltemplate ;
   private String Combo_cc_almcd_Multiplevaluestype ;
   private String Combo_cc_almcd_Loadingdata ;
   private String Combo_cc_almcd_Noresultsfound ;
   private String Combo_cc_almcd_Emptyitemtext ;
   private String Combo_cc_almcd_Onlyselectedvalues ;
   private String Combo_cc_almcd_Selectalltext ;
   private String Combo_cc_almcd_Multiplevaluesseparator ;
   private String Combo_cc_almcd_Addnewoptiontext ;
   private String Dvpanel_tableattributes_Objectcall ;
   private String Dvpanel_tableattributes_Class ;
   private String Dvpanel_tableattributes_Height ;
   private String Combo_prdnum_Objectcall ;
   private String Combo_prdnum_Class ;
   private String Combo_prdnum_Icontype ;
   private String Combo_prdnum_Icon ;
   private String Combo_prdnum_Tooltip ;
   private String Combo_prdnum_Selectedvalue_set ;
   private String Combo_prdnum_Selectedvalue_get ;
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
   private String hsh ;
   private String sMode111 ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String GXCCtl ;
   private String A718PrdNom ;
   private String A488ForPrdDsc ;
   private String A12257PrdComID ;
   private String A10881PrdLote ;
   private String AV7Station ;
   private String AV8EmprNom ;
   private String GXv_char2[] ;
   private String Z407EmprNom ;
   private String Z488ForPrdDsc ;
   private String sGXsfl_59_fel_idx="0001" ;
   private String subGridlevel_producto_Class ;
   private String subGridlevel_producto_Linesclass ;
   private String ROClassString ;
   private String edtPrdNum_Jsonclick ;
   private String edtPrdNom_Jsonclick ;
   private String edtPrdFacCon_Jsonclick ;
   private String edtPrdExiAlm_Jsonclick ;
   private String edtPrdExiCC_Jsonclick ;
   private String edtPrdCanRes_Jsonclick ;
   private String edtCumConCant_Jsonclick ;
   private String edtCumConLot_Jsonclick ;
   private String edtCumConCbis_Jsonclick ;
   private String edtCumCosPro_Jsonclick ;
   private String edtPrdPreAct_Jsonclick ;
   private String edtPrdPreMed_Jsonclick ;
   private String edtUltFecCCs_Jsonclick ;
   private String edtPrdValStk_Jsonclick ;
   private String edtForPrdUMe_Jsonclick ;
   private String edtForPrdDsc_Jsonclick ;
   private String edtPrdComID_Jsonclick ;
   private String edtPrdLote_Jsonclick ;
   private String edtCumLotAlm_Jsonclick ;
   private String edtValCod_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGridlevel_producto_Header ;
   private String Z10778CumCCosD ;
   private String GXt_char1 ;
   private String Z8926CC_AlmDc ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private java.util.Date Z862CumConFec ;
   private java.util.Date A862CumConFec ;
   private java.util.Date A3835UltFecCCs ;
   private java.util.Date i862CumConFec ;
   private java.util.Date GXt_date13 ;
   private java.util.Date GXv_date14[] ;
   private java.util.Date Z3835UltFecCCs ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n8925CC_AlmCd ;
   private boolean n3839CcoCod ;
   private boolean wbErr ;
   private boolean Dvpanel_tableattributes_Autowidth ;
   private boolean Dvpanel_tableattributes_Autoheight ;
   private boolean Dvpanel_tableattributes_Collapsible ;
   private boolean Dvpanel_tableattributes_Collapsed ;
   private boolean Dvpanel_tableattributes_Showcollapseicon ;
   private boolean Dvpanel_tableattributes_Autoscroll ;
   private boolean Combo_prdnum_Isgriditem ;
   private boolean Combo_prdnum_Emptyitem ;
   private boolean bGXsfl_59_Refreshing=false ;
   private boolean n407EmprNom ;
   private boolean Combo_cumccos_Enabled ;
   private boolean Combo_cumccos_Visible ;
   private boolean Combo_cumccos_Allowmultipleselection ;
   private boolean Combo_cumccos_Isgriditem ;
   private boolean Combo_cumccos_Hasdescription ;
   private boolean Combo_cumccos_Includeonlyselectedoption ;
   private boolean Combo_cumccos_Includeselectalloption ;
   private boolean Combo_cumccos_Emptyitem ;
   private boolean Combo_cumccos_Includeaddnewoption ;
   private boolean Combo_cc_almcd_Enabled ;
   private boolean Combo_cc_almcd_Visible ;
   private boolean Combo_cc_almcd_Allowmultipleselection ;
   private boolean Combo_cc_almcd_Isgriditem ;
   private boolean Combo_cc_almcd_Hasdescription ;
   private boolean Combo_cc_almcd_Includeonlyselectedoption ;
   private boolean Combo_cc_almcd_Includeselectalloption ;
   private boolean Combo_cc_almcd_Emptyitem ;
   private boolean Combo_cc_almcd_Includeaddnewoption ;
   private boolean Dvpanel_tableattributes_Enabled ;
   private boolean Dvpanel_tableattributes_Showheader ;
   private boolean Dvpanel_tableattributes_Visible ;
   private boolean Combo_prdnum_Enabled ;
   private boolean Combo_prdnum_Visible ;
   private boolean Combo_prdnum_Allowmultipleselection ;
   private boolean Combo_prdnum_Hasdescription ;
   private boolean Combo_prdnum_Includeonlyselectedoption ;
   private boolean Combo_prdnum_Includeselectalloption ;
   private boolean Combo_prdnum_Includeaddnewoption ;
   private boolean n3915EmpNumDec ;
   private boolean returnInSub ;
   private boolean n488ForPrdDsc ;
   private boolean Gx_longc ;
   private String AV18ComboSelectedValue ;
   private com.genexus.webpanels.GXWebGrid Gridlevel_productoContainer ;
   private com.genexus.webpanels.GXWebRow Gridlevel_productoRow ;
   private com.genexus.webpanels.GXWebColumn Gridlevel_productoColumn ;
   private com.genexus.webpanels.WebSession AV14WebSession ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableattributes ;
   private com.genexus.webpanels.GXUserControl ucCombo_cumccos ;
   private com.genexus.webpanels.GXUserControl ucCombo_cc_almcd ;
   private com.genexus.webpanels.GXUserControl ucCombo_prdnum ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private HTMLChoice cmbCumUnidad ;
   private HTMLChoice cmbCumUMed ;
   private IDataStoreProvider pr_default ;
   private String[] T01SF9_A407EmprNom ;
   private boolean[] T01SF9_n407EmprNom ;
   private byte[] T01SF9_A3915EmpNumDec ;
   private boolean[] T01SF9_n3915EmpNumDec ;
   private int[] T01SF11_A859CumCodCont ;
   private byte[] T01SF11_A8925CC_AlmCd ;
   private boolean[] T01SF11_n8925CC_AlmCd ;
   private short[] T01SF11_A10777CumCCos ;
   private String[] T01SF11_A407EmprNom ;
   private boolean[] T01SF11_n407EmprNom ;
   private byte[] T01SF11_A3915EmpNumDec ;
   private boolean[] T01SF11_n3915EmpNumDec ;
   private byte[] T01SF11_A11368CumConTipo ;
   private java.util.Date[] T01SF11_A862CumConFec ;
   private String[] T01SF11_A396EmprCod ;
   private short[] T01SF11_A3839CcoCod ;
   private boolean[] T01SF11_n3839CcoCod ;
   private short[] T01SF10_A3839CcoCod ;
   private boolean[] T01SF10_n3839CcoCod ;
   private short[] T01SF12_A3839CcoCod ;
   private boolean[] T01SF12_n3839CcoCod ;
   private String[] T01SF13_A396EmprCod ;
   private int[] T01SF13_A859CumCodCont ;
   private int[] T01SF8_A859CumCodCont ;
   private byte[] T01SF8_A8925CC_AlmCd ;
   private boolean[] T01SF8_n8925CC_AlmCd ;
   private short[] T01SF8_A10777CumCCos ;
   private byte[] T01SF8_A11368CumConTipo ;
   private java.util.Date[] T01SF8_A862CumConFec ;
   private String[] T01SF8_A396EmprCod ;
   private short[] T01SF8_A3839CcoCod ;
   private boolean[] T01SF8_n3839CcoCod ;
   private String[] T01SF14_A396EmprCod ;
   private int[] T01SF14_A859CumCodCont ;
   private String[] T01SF15_A396EmprCod ;
   private int[] T01SF15_A859CumCodCont ;
   private int[] T01SF7_A859CumCodCont ;
   private byte[] T01SF7_A8925CC_AlmCd ;
   private boolean[] T01SF7_n8925CC_AlmCd ;
   private short[] T01SF7_A10777CumCCos ;
   private byte[] T01SF7_A11368CumConTipo ;
   private java.util.Date[] T01SF7_A862CumConFec ;
   private String[] T01SF7_A396EmprCod ;
   private short[] T01SF7_A3839CcoCod ;
   private boolean[] T01SF7_n3839CcoCod ;
   private String[] T01SF19_A396EmprCod ;
   private int[] T01SF19_A859CumCodCont ;
   private String[] T01SF6_A488ForPrdDsc ;
   private boolean[] T01SF6_n488ForPrdDsc ;
   private int[] T01SF20_A859CumCodCont ;
   private byte[] T01SF20_A8639CumUnidad ;
   private String[] T01SF20_A5862CumConLot ;
   private java.math.BigDecimal[] T01SF20_A861CumConCbis ;
   private java.math.BigDecimal[] T01SF20_A704PrdExiAlm ;
   private java.math.BigDecimal[] T01SF20_A750PrdValStk ;
   private String[] T01SF20_A718PrdNom ;
   private java.math.BigDecimal[] T01SF20_A707PrdFacCon ;
   private java.math.BigDecimal[] T01SF20_A705PrdExiCC ;
   private java.math.BigDecimal[] T01SF20_A685PrdCanRes ;
   private java.math.BigDecimal[] T01SF20_A860CumConCant ;
   private java.math.BigDecimal[] T01SF20_A724PrdPreAct ;
   private java.math.BigDecimal[] T01SF20_A726PrdPreMed ;
   private String[] T01SF20_A488ForPrdDsc ;
   private boolean[] T01SF20_n488ForPrdDsc ;
   private String[] T01SF20_A12257PrdComID ;
   private String[] T01SF20_A10881PrdLote ;
   private byte[] T01SF20_A12700CumUMed ;
   private short[] T01SF20_A14039CumLotAlm ;
   private String[] T01SF20_A396EmprCod ;
   private String[] T01SF20_A719PrdNum ;
   private byte[] T01SF20_A490ForPrdUMe ;
   private byte[] T01SF20_A856ValCod ;
   private java.math.BigDecimal[] T01SF5_A704PrdExiAlm ;
   private java.math.BigDecimal[] T01SF5_A750PrdValStk ;
   private String[] T01SF5_A718PrdNom ;
   private java.math.BigDecimal[] T01SF5_A707PrdFacCon ;
   private java.math.BigDecimal[] T01SF5_A705PrdExiCC ;
   private java.math.BigDecimal[] T01SF5_A685PrdCanRes ;
   private java.math.BigDecimal[] T01SF5_A724PrdPreAct ;
   private java.math.BigDecimal[] T01SF5_A726PrdPreMed ;
   private String[] T01SF5_A10881PrdLote ;
   private byte[] T01SF5_A856ValCod ;
   private String[] T01SF21_A396EmprCod ;
   private int[] T01SF21_A859CumCodCont ;
   private String[] T01SF21_A719PrdNum ;
   private int[] T01SF3_A859CumCodCont ;
   private byte[] T01SF3_A8639CumUnidad ;
   private String[] T01SF3_A5862CumConLot ;
   private java.math.BigDecimal[] T01SF3_A861CumConCbis ;
   private java.math.BigDecimal[] T01SF3_A860CumConCant ;
   private String[] T01SF3_A12257PrdComID ;
   private byte[] T01SF3_A12700CumUMed ;
   private short[] T01SF3_A14039CumLotAlm ;
   private String[] T01SF3_A396EmprCod ;
   private String[] T01SF3_A719PrdNum ;
   private byte[] T01SF3_A490ForPrdUMe ;
   private int[] T01SF2_A859CumCodCont ;
   private byte[] T01SF2_A8639CumUnidad ;
   private String[] T01SF2_A5862CumConLot ;
   private java.math.BigDecimal[] T01SF2_A861CumConCbis ;
   private java.math.BigDecimal[] T01SF2_A860CumConCant ;
   private String[] T01SF2_A12257PrdComID ;
   private byte[] T01SF2_A12700CumUMed ;
   private short[] T01SF2_A14039CumLotAlm ;
   private String[] T01SF2_A396EmprCod ;
   private String[] T01SF2_A719PrdNum ;
   private byte[] T01SF2_A490ForPrdUMe ;
   private java.math.BigDecimal[] T01SF22_A704PrdExiAlm ;
   private java.math.BigDecimal[] T01SF22_A750PrdValStk ;
   private String[] T01SF22_A718PrdNom ;
   private java.math.BigDecimal[] T01SF22_A707PrdFacCon ;
   private java.math.BigDecimal[] T01SF22_A705PrdExiCC ;
   private java.math.BigDecimal[] T01SF22_A685PrdCanRes ;
   private java.math.BigDecimal[] T01SF22_A724PrdPreAct ;
   private java.math.BigDecimal[] T01SF22_A726PrdPreMed ;
   private String[] T01SF22_A10881PrdLote ;
   private byte[] T01SF22_A856ValCod ;
   private java.math.BigDecimal[] T01SF26_A704PrdExiAlm ;
   private java.math.BigDecimal[] T01SF26_A750PrdValStk ;
   private String[] T01SF26_A718PrdNom ;
   private java.math.BigDecimal[] T01SF26_A707PrdFacCon ;
   private java.math.BigDecimal[] T01SF26_A705PrdExiCC ;
   private java.math.BigDecimal[] T01SF26_A685PrdCanRes ;
   private java.math.BigDecimal[] T01SF26_A724PrdPreAct ;
   private java.math.BigDecimal[] T01SF26_A726PrdPreMed ;
   private String[] T01SF26_A10881PrdLote ;
   private byte[] T01SF26_A856ValCod ;
   private String[] T01SF28_A396EmprCod ;
   private int[] T01SF28_A859CumCodCont ;
   private String[] T01SF28_A719PrdNum ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private java.math.BigDecimal[] T01SF4_A704PrdExiAlm ;
   private java.math.BigDecimal[] T01SF4_A750PrdValStk ;
   private String[] T01SF4_A718PrdNom ;
   private java.math.BigDecimal[] T01SF4_A707PrdFacCon ;
   private java.math.BigDecimal[] T01SF4_A705PrdExiCC ;
   private java.math.BigDecimal[] T01SF4_A685PrdCanRes ;
   private java.math.BigDecimal[] T01SF4_A724PrdPreAct ;
   private java.math.BigDecimal[] T01SF4_A726PrdPreMed ;
   private String[] T01SF4_A10881PrdLote ;
   private byte[] T01SF4_A856ValCod ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV17CumCCos_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV20CC_AlmCd_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV24PrdNum_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> GXt_objcol_SdtDVB_SDTComboData_Item10 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> GXv_objcol_SdtDVB_SDTComboData_Item11[] ;
   private app.wwpbaseobjects.SdtWWPContext AV12WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext9[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV13TrnContext ;
   private app.wwpbaseobjects.SdtWWPTransactionContext_Attribute AV16TrnContextAtt ;
}

final  class consumomanual__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class consumomanual__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class consumomanual__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class consumomanual__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class consumomanual__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01SF2", "SELECT CumCodCont, CumUnidad, CumConLot, CumConCbis, CumConCant, PrdComID, CumUMed, CumLotAlm, EmprCod, PrdNum, ForPrdUMe FROM TXPLCUMCO WHERE EmprCod = ? AND CumCodCont = ? AND PrdNum = ?  FOR UPDATE OF CumUnidad, CumConLot, CumConCbis, CumConCant, PrdComID, CumUMed, CumLotAlm, ForPrdUMe NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SF3", "SELECT CumCodCont, CumUnidad, CumConLot, CumConCbis, CumConCant, PrdComID, CumUMed, CumLotAlm, EmprCod, PrdNum, ForPrdUMe FROM TXPLCUMCO WHERE EmprCod = ? AND CumCodCont = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SF4", "SELECT PrdExiAlm, PrdValStk, PrdNom, PrdFacCon, PrdExiCC, PrdCanRes, PrdPreAct, PrdPreMed, PrdLote, ValCod FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ?  FOR UPDATE OF PrdExiAlm, PrdValStk NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SF5", "SELECT PrdExiAlm, PrdValStk, PrdNom, PrdFacCon, PrdExiCC, PrdCanRes, PrdPreAct, PrdPreMed, PrdLote, ValCod FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SF6", "SELECT ForPrdDsc FROM TXPUNMEPR WHERE EmprCod = ? AND ForPrdUMe = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SF7", "SELECT CumCodCont, CC_AlmCd, CumCCos, CumConTipo, CumConFec, EmprCod, CcoCod FROM TXPCCUMCO WHERE EmprCod = ? AND CumCodCont = ?  FOR UPDATE OF CC_AlmCd, CumCCos, CumConTipo, CumConFec, CcoCod NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SF8", "SELECT CumCodCont, CC_AlmCd, CumCCos, CumConTipo, CumConFec, EmprCod, CcoCod FROM TXPCCUMCO WHERE EmprCod = ? AND CumCodCont = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SF9", "SELECT EmprNom, EmpNumDec FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SF10", "SELECT CcoCod FROM TXPCENTCO WHERE CcoCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SF11", "SELECT /*+ FIRST_ROWS(100) */ TM1.CumCodCont, TM1.CC_AlmCd, TM1.CumCCos, T2.EmprNom, T2.EmpNumDec, TM1.CumConTipo, TM1.CumConFec, TM1.EmprCod, TM1.CcoCod FROM (TXPCCUMCO TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) WHERE TM1.EmprCod = ? and TM1.CumCodCont = ? ORDER BY TM1.EmprCod, TM1.CumCodCont ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SF12", "SELECT CcoCod FROM TXPCENTCO WHERE CcoCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SF13", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, CumCodCont FROM TXPCCUMCO WHERE EmprCod = ? AND CumCodCont = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SF14", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, CumCodCont FROM TXPCCUMCO WHERE ( CumCodCont > ?) and EmprCod = ? ORDER BY EmprCod, CumCodCont) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01SF15", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, CumCodCont FROM TXPCCUMCO WHERE ( CumCodCont < ?) and EmprCod = ? ORDER BY EmprCod DESC, CumCodCont DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01SF16", "INSERT INTO TXPCCUMCO(CumCodCont, CC_AlmCd, CumCCos, CumConTipo, CumConFec, EmprCod, CcoCod, BarCod, BarCodReo, BarCodPar) VALUES(?, ?, ?, ?, ?, ?, ?, 0, 0, ' ')", GX_NOMASK, "TXPCCUMCO")
         ,new UpdateCursor("T01SF17", "UPDATE TXPCCUMCO SET CC_AlmCd=?, CumCCos=?, CumConTipo=?, CumConFec=?, CcoCod=?  WHERE EmprCod = ? AND CumCodCont = ?", GX_NOMASK, "TXPCCUMCO")
         ,new UpdateCursor("T01SF18", "DELETE FROM TXPCCUMCO  WHERE EmprCod = ? AND CumCodCont = ?", GX_NOMASK, "TXPCCUMCO")
         ,new ForEachCursor("T01SF19", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, CumCodCont FROM TXPCCUMCO WHERE EmprCod = ? ORDER BY EmprCod, CumCodCont ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SF20", "SELECT T1.CumCodCont, T1.CumUnidad, T1.CumConLot, T1.CumConCbis, T3.PrdExiAlm, T3.PrdValStk, T3.PrdNom, T3.PrdFacCon, T3.PrdExiCC, T3.PrdCanRes, T1.CumConCant, T3.PrdPreAct, T3.PrdPreMed, T2.ForPrdDsc, T1.PrdComID, T3.PrdLote, T1.CumUMed, T1.CumLotAlm, T1.EmprCod, T1.PrdNum, T1.ForPrdUMe, T3.ValCod FROM ((TXPLCUMCO T1 INNER JOIN TXPUNMEPR T2 ON T2.EmprCod = T1.EmprCod AND T2.ForPrdUMe = T1.ForPrdUMe) INNER JOIN TXPPRODUC T3 ON T3.EmprCod = T1.EmprCod AND T3.PrdNum = T1.PrdNum) WHERE T1.EmprCod = ? and T1.CumCodCont = ? and T1.PrdNum = ? ORDER BY T1.EmprCod, T1.CumCodCont, T1.PrdNum ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SF21", "SELECT EmprCod, CumCodCont, PrdNum FROM TXPLCUMCO WHERE EmprCod = ? AND CumCodCont = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SF22", "SELECT PrdExiAlm, PrdValStk, PrdNom, PrdFacCon, PrdExiCC, PrdCanRes, PrdPreAct, PrdPreMed, PrdLote, ValCod FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ?  FOR UPDATE OF PrdExiAlm, PrdValStk NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01SF23", "INSERT INTO TXPLCUMCO(CumCodCont, CumUnidad, CumConLot, CumConCbis, CumConCant, PrdComID, CumUMed, CumLotAlm, EmprCod, PrdNum, ForPrdUMe) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPLCUMCO")
         ,new UpdateCursor("T01SF24", "UPDATE TXPLCUMCO SET CumUnidad=?, CumConLot=?, CumConCbis=?, CumConCant=?, PrdComID=?, CumUMed=?, CumLotAlm=?, ForPrdUMe=?  WHERE EmprCod = ? AND CumCodCont = ? AND PrdNum = ?", GX_NOMASK, "TXPLCUMCO")
         ,new UpdateCursor("T01SF25", "DELETE FROM TXPLCUMCO  WHERE EmprCod = ? AND CumCodCont = ? AND PrdNum = ?", GX_NOMASK, "TXPLCUMCO")
         ,new ForEachCursor("T01SF26", "SELECT PrdExiAlm, PrdValStk, PrdNom, PrdFacCon, PrdExiCC, PrdCanRes, PrdPreAct, PrdPreMed, PrdLote, ValCod FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01SF27", "UPDATE TXPPRODUC SET PrdExiAlm=?, PrdValStk=?  WHERE EmprCod = ? AND PrdNum = ?", GX_NOMASK, "TXPPRODUC")
         ,new ForEachCursor("T01SF28", "SELECT EmprCod, CumCodCont, PrdNum FROM TXPLCUMCO WHERE EmprCod = ? and CumCodCont = ? ORDER BY EmprCod, CumCodCont, PrdNum ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
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
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 26);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,4);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 3);
               ((String[]) buf[9])[0] = rslt.getString(10, 6);
               ((byte[]) buf[10])[0] = rslt.getByte(11);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 26);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,4);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 3);
               ((String[]) buf[9])[0] = rslt.getString(10, 6);
               ((byte[]) buf[10])[0] = rslt.getByte(11);
               return;
            case 2 :
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
               ((String[]) buf[0])[0] = rslt.getString(1, 5);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 5 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((short[]) buf[3])[0] = rslt.getShort(3);
               ((byte[]) buf[4])[0] = rslt.getByte(4);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(5);
               ((String[]) buf[6])[0] = rslt.getString(6, 3);
               ((short[]) buf[7])[0] = rslt.getShort(7);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               return;
            case 6 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((short[]) buf[3])[0] = rslt.getShort(3);
               ((byte[]) buf[4])[0] = rslt.getByte(4);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(5);
               ((String[]) buf[6])[0] = rslt.getString(6, 3);
               ((short[]) buf[7])[0] = rslt.getShort(7);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((byte[]) buf[2])[0] = rslt.getByte(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 8 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               return;
            case 9 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((short[]) buf[3])[0] = rslt.getShort(3);
               ((String[]) buf[4])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((byte[]) buf[6])[0] = rslt.getByte(5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((byte[]) buf[8])[0] = rslt.getByte(6);
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDate(7);
               ((String[]) buf[10])[0] = rslt.getString(8, 3);
               ((short[]) buf[11])[0] = rslt.getShort(9);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               return;
            case 10 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 18 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 26);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,4);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((String[]) buf[6])[0] = rslt.getString(7, 26);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,4);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,4);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(10,4);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(11,4);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(12,5);
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(13,5);
               ((String[]) buf[13])[0] = rslt.getString(14, 5);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(15, 6);
               ((String[]) buf[16])[0] = rslt.getString(16, 26);
               ((byte[]) buf[17])[0] = rslt.getByte(17);
               ((short[]) buf[18])[0] = rslt.getShort(18);
               ((String[]) buf[19])[0] = rslt.getString(19, 3);
               ((String[]) buf[20])[0] = rslt.getString(20, 6);
               ((byte[]) buf[21])[0] = rslt.getByte(21);
               ((byte[]) buf[22])[0] = rslt.getByte(22);
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 20 :
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
            case 24 :
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
            case 26 :
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
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 8 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(1, ((Number) parms[1]).shortValue());
               }
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 10 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(1, ((Number) parms[1]).shortValue());
               }
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 12 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 13 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 14 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(2, ((Number) parms[2]).byteValue());
               }
               stmt.setShort(3, ((Number) parms[3]).shortValue());
               stmt.setByte(4, ((Number) parms[4]).byteValue());
               stmt.setDate(5, (java.util.Date)parms[5]);
               stmt.setString(6, (String)parms[6], 3);
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(7, ((Number) parms[8]).shortValue());
               }
               return;
            case 15 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(1, ((Number) parms[1]).byteValue());
               }
               stmt.setShort(2, ((Number) parms[2]).shortValue());
               stmt.setByte(3, ((Number) parms[3]).byteValue());
               stmt.setDate(4, (java.util.Date)parms[4]);
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(5, ((Number) parms[6]).shortValue());
               }
               stmt.setString(6, (String)parms[7], 3);
               stmt.setInt(7, ((Number) parms[8]).intValue());
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 6);
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 6);
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 21 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setString(3, (String)parms[2], 26);
               stmt.setBigDecimal(4, (java.math.BigDecimal)parms[3], 4);
               stmt.setBigDecimal(5, (java.math.BigDecimal)parms[4], 4);
               stmt.setString(6, (String)parms[5], 6);
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               stmt.setShort(8, ((Number) parms[7]).shortValue());
               stmt.setString(9, (String)parms[8], 3);
               stmt.setString(10, (String)parms[9], 6);
               stmt.setByte(11, ((Number) parms[10]).byteValue());
               return;
            case 22 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setString(2, (String)parms[1], 26);
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[2], 4);
               stmt.setBigDecimal(4, (java.math.BigDecimal)parms[3], 4);
               stmt.setString(5, (String)parms[4], 6);
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               stmt.setByte(8, ((Number) parms[7]).byteValue());
               stmt.setString(9, (String)parms[8], 3);
               stmt.setInt(10, ((Number) parms[9]).intValue());
               stmt.setString(11, (String)parms[10], 6);
               return;
            case 23 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 6);
               return;
            case 24 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 25 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 4);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 2);
               stmt.setString(3, (String)parms[2], 3);
               stmt.setString(4, (String)parms[3], 6);
               return;
            case 26 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

