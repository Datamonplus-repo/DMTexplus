package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class procesosquimicos_trn_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action32") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A6061ProForLab = httpContext.GetPar( "ProForLab") ;
         httpContext.ajax_rsp_assign_attri("", false, "A6061ProForLab", A6061ProForLab);
         AV38Exis_pro = (short)(GXutil.lval( httpContext.GetPar( "Exis_pro"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV38Exis_pro", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV38Exis_pro), 4, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_32_1RW89( A396EmprCod, A6061ProForLab, AV38Exis_pro) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action59") == 0 )
      {
         Gx_mode = httpContext.GetPar( "Mode") ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         AV53Pgmname = httpContext.GetPar( "Pgmname") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV53Pgmname", AV53Pgmname);
         AV8Usurcod = httpContext.GetPar( "Usurcod") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV8Usurcod", AV8Usurcod);
         AV9Station = httpContext.GetPar( "Station") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV9Station", AV9Station);
         AV10Msg_e = httpContext.GetPar( "Msg_e") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV10Msg_e", AV10Msg_e);
         A767ProForLin = (short)(GXutil.lval( httpContext.GetPar( "ProForLin"))) ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_59_1RW90( Gx_mode, A396EmprCod, AV53Pgmname, AV8Usurcod, AV9Station, AV10Msg_e, A767ProForLin) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action60") == 0 )
      {
         Gx_mode = httpContext.GetPar( "Mode") ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         AV53Pgmname = httpContext.GetPar( "Pgmname") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV53Pgmname", AV53Pgmname);
         AV8Usurcod = httpContext.GetPar( "Usurcod") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV8Usurcod", AV8Usurcod);
         AV9Station = httpContext.GetPar( "Station") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV9Station", AV9Station);
         AV10Msg_e = httpContext.GetPar( "Msg_e") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV10Msg_e", AV10Msg_e);
         A767ProForLin = (short)(GXutil.lval( httpContext.GetPar( "ProForLin"))) ;
         A762ProForCan = CommonUtil.decimalVal( httpContext.GetPar( "ProForCan"), ".") ;
         A490ForPrdUMe = (byte)(GXutil.lval( httpContext.GetPar( "ForPrdUMe"))) ;
         A763ProForCla = httpContext.GetPar( "ProForCla") ;
         A5358ProForClv = httpContext.GetPar( "ProForClv") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_60_1RW90( Gx_mode, A396EmprCod, AV53Pgmname, AV8Usurcod, AV9Station, AV10Msg_e, A767ProForLin, A762ProForCan, A490ForPrdUMe, A763ProForCla, A5358ProForClv) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action61") == 0 )
      {
         Gx_mode = httpContext.GetPar( "Mode") ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         AV53Pgmname = httpContext.GetPar( "Pgmname") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV53Pgmname", AV53Pgmname);
         AV8Usurcod = httpContext.GetPar( "Usurcod") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV8Usurcod", AV8Usurcod);
         AV9Station = httpContext.GetPar( "Station") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV9Station", AV9Station);
         AV39Msg_del = httpContext.GetPar( "Msg_del") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV39Msg_del", AV39Msg_del);
         A767ProForLin = (short)(GXutil.lval( httpContext.GetPar( "ProForLin"))) ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_61_1RW90( Gx_mode, A396EmprCod, AV53Pgmname, AV8Usurcod, AV9Station, AV39Msg_del, A767ProForLin) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"PROFORPRD") == 0 )
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
         gxsgaproforprd1RW0( A396EmprCod, A719PrdNum) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"FORPRDUME") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A13746ForPrdCDsc = httpContext.GetPar( "ForPrdCDsc") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxsgaforprdume1RW0( A396EmprCod, A13746ForPrdCDsc) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"FORPRDUME") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A13746ForPrdCDsc = httpContext.GetPar( "ForPrdCDsc") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxsgaforprdume1RW0( A396EmprCod, A13746ForPrdCDsc) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxHideCode"+"_"+"FORPRDUME") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         h490ForPrdUMe = httpContext.GetPar( "h490ForPrdUMe") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxhcaforprdume1RW90( A396EmprCod, h490ForPrdUMe) ;
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
         gxasa60621RW89( A396EmprCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel10"+"_"+"") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxasa53581RW89( A396EmprCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel11"+"_"+"") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxasa47051RW89( A396EmprCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel12"+"_"+"") == 0 )
      {
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel13"+"_"+"") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxasa85271RW89( A396EmprCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel14"+"_"+"") == 0 )
      {
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel15"+"_"+"") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxasa85281RW89( A396EmprCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel16"+"_"+"") == 0 )
      {
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel17"+"_"+"") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxasa101201RW89( A396EmprCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel18"+"_"+"") == 0 )
      {
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel19"+"_"+"") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxasa105471RW89( A396EmprCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel20"+"_"+"") == 0 )
      {
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel21"+"_"+"") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxasa139361RW89( A396EmprCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel22"+"_"+"") == 0 )
      {
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel35"+"_"+"PRDNOMFORM") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A770ProForPrd = httpContext.GetPar( "ProForPrd") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx35asaprdnomform1RW90( A396EmprCod, A770ProForPrd) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_63") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_63( A396EmprCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_68") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A770ProForPrd = httpContext.GetPar( "ProForPrd") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_68( A396EmprCod, A770ProForPrd) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_65") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A764ProForCod = httpContext.GetPar( "ProForCod") ;
         n764ProForCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A764ProForCod", A764ProForCod);
         A767ProForLin = (short)(GXutil.lval( httpContext.GetPar( "ProForLin"))) ;
         A710PrdFind = httpContext.GetPar( "PrdFind") ;
         n710PrdFind = false ;
         A770ProForPrd = httpContext.GetPar( "ProForPrd") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_65( A396EmprCod, A764ProForCod, A767ProForLin, A710PrdFind, A770ProForPrd) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_66") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A764ProForCod = httpContext.GetPar( "ProForCod") ;
         n764ProForCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A764ProForCod", A764ProForCod);
         A767ProForLin = (short)(GXutil.lval( httpContext.GetPar( "ProForLin"))) ;
         A768ProForLinV = (short)(GXutil.lval( httpContext.GetPar( "ProForLinV"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A768ProForLinV", GXutil.ltrimstr( DecimalUtil.doubleToDec(A768ProForLinV), 4, 0));
         A941EmprCodV2 = httpContext.GetPar( "EmprCodV2") ;
         httpContext.ajax_rsp_assign_attri("", false, "A941EmprCodV2", A941EmprCodV2);
         A920ProForCodV = httpContext.GetPar( "ProForCodV") ;
         httpContext.ajax_rsp_assign_attri("", false, "A920ProForCodV", A920ProForCodV);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_66( A396EmprCod, A764ProForCod, A767ProForLin, A768ProForLinV, A941EmprCodV2, A920ProForCodV) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_67") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A490ForPrdUMe = (byte)(GXutil.lval( httpContext.GetPar( "ForPrdUMe"))) ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_67( A396EmprCod, A490ForPrdUMe) ;
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Gridlevel_procesosquimicoslineas") == 0 )
      {
         gxnrgridlevel_procesosquimicoslineas_newrow_invoke( ) ;
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
            AV12EmprCod = httpContext.GetPar( "EmprCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV12EmprCod", AV12EmprCod);
            AV32ProForCod = httpContext.GetPar( "ProForCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV32ProForCod", AV32ProForCod);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPROFORCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV32ProForCod, ""))));
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Procesos Quimicos", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtProForCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      wbErr = false ;
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public void gxnrgridlevel_procesosquimicoslineas_newrow_invoke( )
   {
      nRC_GXsfl_125 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_125"))) ;
      nGXsfl_125_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_125_idx"))) ;
      sGXsfl_125_idx = httpContext.GetPar( "sGXsfl_125_idx") ;
      AV41Claves = httpContext.GetPar( "Claves") ;
      AV45Clavesdel = httpContext.GetPar( "Clavesdel") ;
      edtavClaves_Tooltiptext = httpContext.GetNextPar( ) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavClaves_Internalname, "Tooltiptext", edtavClaves_Tooltiptext, !bGXsfl_125_Refreshing);
      edtavClavesdel_Tooltiptext = httpContext.GetNextPar( ) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavClavesdel_Internalname, "Tooltiptext", edtavClavesdel_Tooltiptext, !bGXsfl_125_Refreshing);
      edtavClaves_Enabled = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavClaves_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavClaves_Enabled), 5, 0), !bGXsfl_125_Refreshing);
      edtavClavesdel_Enabled = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavClavesdel_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavClavesdel_Enabled), 5, 0), !bGXsfl_125_Refreshing);
      Gx_BScreen = (byte)(GXutil.lval( httpContext.GetPar( "Gx_BScreen"))) ;
      Gx_mode = httpContext.GetPar( "Mode") ;
      AV13CdpPor = (short)(GXutil.lval( httpContext.GetPar( "CdpPor"))) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxnrgridlevel_procesosquimicoslineas_newrow( ) ;
      /* End function gxnrGridlevel_procesosquimicoslineas_newrow_invoke */
   }

   public procesosquimicos_trn_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public procesosquimicos_trn_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( procesosquimicos_trn_impl.class ));
   }

   public procesosquimicos_trn_impl( int remoteHandle ,
                                     ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      chkProForAct = UIFactory.getCheckbox(this);
      cmbProRev = new HTMLChoice();
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
      A13133ProForAct = ((GXutil.strcmp(GXutil.rtrim( A13133ProForAct), "S")==0) ? "S" : "N") ;
      httpContext.ajax_rsp_assign_attri("", false, "A13133ProForAct", A13133ProForAct);
      if ( cmbProRev.getItemCount() > 0 )
      {
         A3005ProRev = cmbProRev.getValidValue(A3005ProRev) ;
         httpContext.ajax_rsp_assign_attri("", false, "A3005ProRev", A3005ProRev);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbProRev.setValue( GXutil.rtrim( A3005ProRev) );
         httpContext.ajax_rsp_assign_prop("", false, cmbProRev.getInternalname(), "Values", cmbProRev.ToJavascriptSource(), true);
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
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable2_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtProForCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtProForCod_Internalname, httpContext.getMessage( "Proceso", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtProForCod_Internalname, GXutil.rtrim( A764ProForCod), GXutil.rtrim( localUtil.format( A764ProForCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,25);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProForCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtProForCod_Enabled, 1, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\ProcesosQuimicos_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtProForDsc_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtProForDsc_Internalname, httpContext.getMessage( "Descripcion", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 29,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtProForDsc_Internalname, GXutil.rtrim( A766ProForDsc), GXutil.rtrim( localUtil.format( A766ProForDsc, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,29);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProForDsc_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtProForDsc_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\ProcesosQuimicos_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtProForDsc2_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtProForDsc2_Internalname, httpContext.getMessage( "Descripcion (Large)", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 33,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtProForDsc2_Internalname, GXutil.rtrim( A4715ProForDsc2), GXutil.rtrim( localUtil.format( A4715ProForDsc2, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,33);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProForDsc2_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtProForDsc2_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\ProcesosQuimicos_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+chkProForAct.getInternalname()+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, chkProForAct.getInternalname(), httpContext.getMessage( "Activo", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Check box */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 37,'',false,'',0)\"" ;
      ClassString = "AttributeFL" ;
      StyleString = "" ;
      app.GxWebStd.gx_checkbox_ctrl( httpContext, chkProForAct.getInternalname(), A13133ProForAct, "", httpContext.getMessage( "Activo", ""), 1, chkProForAct.getEnabled(), "S", "", StyleString, ClassString, "", "", TempTags+" onclick="+"\"gx.fn.checkboxClick(37, this, 'S', 'N',"+"''"+");"+"gx.evt.onchange(this, event);\""+" onblur=\""+""+";gx.evt.onblur(this,37);\"");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtProForTip_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtProForTip_Internalname, httpContext.getMessage( "Tip. Proc.", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtProForTip_Internalname, GXutil.rtrim( A5523ProForTip), GXutil.rtrim( localUtil.format( A5523ProForTip, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,41);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProForTip_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtProForTip_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\ProcesosQuimicos_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divProforrs_cell_Internalname, 1, 0, "px", 0, "px", divProforrs_cell_Class, "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", edtProForRs_Visible, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtProForRs_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtProForRs_Internalname, httpContext.getMessage( "Resina?", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 45,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtProForRs_Internalname, GXutil.rtrim( A13936ProForRs), GXutil.rtrim( localUtil.format( A13936ProForRs, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,45);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProForRs_Jsonclick, 0, "AttributeFL", "", "", "", "", edtProForRs_Visible, edtProForRs_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\ProcesosQuimicos_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbProRev.getInternalname()+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, cmbProRev.getInternalname(), httpContext.getMessage( "Revision", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 49,'',false,'',0)\"" ;
      /* ComboBox */
      app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbProRev, cmbProRev.getInternalname(), GXutil.rtrim( A3005ProRev), 1, cmbProRev.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbProRev.getEnabled(), 1, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,49);\"", "", true, (byte)(0), "HLP_FormulacionTinte\\ProcesosQuimicos_TRN.htm");
      cmbProRev.setValue( GXutil.rtrim( A3005ProRev) );
      httpContext.ajax_rsp_assign_prop("", false, cmbProRev.getInternalname(), "Values", cmbProRev.ToJavascriptSource(), true);
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtProForTie_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtProForTie_Internalname, httpContext.getMessage( "Tiempo", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 57,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtProForTie_Internalname, GXutil.ltrim( localUtil.ntoc( A771ProForTie, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtProForTie_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A771ProForTie), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A771ProForTie), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,57);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProForTie_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtProForTie_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\ProcesosQuimicos_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtProForTmx_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtProForTmx_Internalname, httpContext.getMessage( "Temp.", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtProForTmx_Internalname, GXutil.ltrim( localUtil.ntoc( A772ProForTmx, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtProForTmx_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A772ProForTmx), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A772ProForTmx), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,61);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProForTmx_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtProForTmx_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\ProcesosQuimicos_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtProForMat_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtProForMat_Internalname, httpContext.getMessage( "Materia", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 65,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtProForMat_Internalname, GXutil.rtrim( A769ProForMat), GXutil.rtrim( localUtil.format( A769ProForMat, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,65);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProForMat_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtProForMat_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\ProcesosQuimicos_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtProForRb_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtProForRb_Internalname, httpContext.getMessage( "Rb", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 69,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtProForRb_Internalname, GXutil.ltrim( localUtil.ntoc( A4706ProForRb, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtProForRb_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4706ProForRb), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A4706ProForRb), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,69);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProForRb_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtProForRb_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\ProcesosQuimicos_TRN.htm");
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
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable4_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell DscTop ExtendedComboCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divTablesplittedproforlab_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockproforlab_Internalname, httpContext.getMessage( "Proc. Lab.", ""), "", "", lblTextblockproforlab_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_FormulacionTinte\\ProcesosQuimicos_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* User Defined Control */
      ucCombo_proforlab.setProperty("Caption", Combo_proforlab_Caption);
      ucCombo_proforlab.setProperty("Cls", Combo_proforlab_Cls);
      ucCombo_proforlab.setProperty("EmptyItemText", Combo_proforlab_Emptyitemtext);
      ucCombo_proforlab.setProperty("DropDownOptionsData", AV48ProForLab_Data);
      ucCombo_proforlab.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_proforlab_Internalname, "COMBO_PROFORLABContainer");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 Invisible", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtProForLab_Internalname, httpContext.getMessage( "Proceso Laboratorio", ""), "col-sm-3 AttributeLabel", 0, true, "");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 83,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtProForLab_Internalname, GXutil.rtrim( A6061ProForLab), GXutil.rtrim( localUtil.format( A6061ProForLab, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,83);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProForLab_Jsonclick, 0, "Attribute", "", "", "", "", edtProForLab_Visible, edtProForLab_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\ProcesosQuimicos_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divProforabs_cell_Internalname, 1, 0, "px", 0, "px", divProforabs_cell_Class, "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", edtProForAbs_Visible, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtProForAbs_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtProForAbs_Internalname, httpContext.getMessage( "FAbs", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 87,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtProForAbs_Internalname, GXutil.ltrim( localUtil.ntoc( A8527ProForAbs, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtProForAbs_Enabled!=0) ? localUtil.format( A8527ProForAbs, "ZZ9.99") : localUtil.format( A8527ProForAbs, "ZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,87);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProForAbs_Jsonclick, 0, "AttributeFL", "", "", "", "", edtProForAbs_Visible, edtProForAbs_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\ProcesosQuimicos_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divProforcos_cell_Internalname, 1, 0, "px", 0, "px", divProforcos_cell_Class, "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", edtProForCos_Visible, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtProForCos_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtProForCos_Internalname, httpContext.getMessage( "Coste Proceso", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 91,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtProForCos_Internalname, GXutil.ltrim( localUtil.ntoc( A8528ProForCos, (byte)(8), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtProForCos_Enabled!=0) ? localUtil.format( A8528ProForCos, "ZZ9.9999") : localUtil.format( A8528ProForCos, "ZZ9.9999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onblur(this,91);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProForCos_Jsonclick, 0, "AttributeFL", "", "", "", "", edtProForCos_Visible, edtProForCos_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\ProcesosQuimicos_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divProforvl_cell_Internalname, 1, 0, "px", 0, "px", divProforvl_cell_Class, "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", edtProforVl_Visible, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtProforVl_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtProforVl_Internalname, httpContext.getMessage( "Volumen", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 95,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtProforVl_Internalname, GXutil.ltrim( localUtil.ntoc( A10120ProforVl, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtProforVl_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A10120ProforVl), "ZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A10120ProforVl), "ZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,95);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProforVl_Jsonclick, 0, "AttributeFL", "", "", "", "", edtProforVl_Visible, edtProforVl_Enabled, 0, "text", "1", 5, "chr", 1, "row", 5, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\ProcesosQuimicos_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divProh2o_cell_Internalname, 1, 0, "px", 0, "px", divProh2o_cell_Class, "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", edtProH2O_Visible, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtProH2O_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtProH2O_Internalname, httpContext.getMessage( "Nº Aguas", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 99,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtProH2O_Internalname, GXutil.ltrim( localUtil.ntoc( A10547ProH2O, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtProH2O_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A10547ProH2O), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A10547ProH2O), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,99);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProH2O_Jsonclick, 0, "AttributeFL", "", "", "", "", edtProH2O_Visible, edtProH2O_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\ProcesosQuimicos_TRN.htm");
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
      /* Control Group */
      app.GxWebStd.gx_group_start( httpContext, grpUnnamedgroup6_Internalname, httpContext.getMessage( "Automatismos", ""), 1, 0, "px", 0, "px", "Group", "", "HLP_FormulacionTinte\\ProcesosQuimicos_TRN.htm");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable5_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtProNumPro_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtProNumPro_Internalname, httpContext.getMessage( "Nº Prog.", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 108,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtProNumPro_Internalname, GXutil.ltrim( localUtil.ntoc( A2392ProNumPro, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtProNumPro_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A2392ProNumPro), "ZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A2392ProNumPro), "ZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,108);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProNumPro_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtProNumPro_Enabled, 0, "text", "1", 5, "chr", 1, "row", 5, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\ProcesosQuimicos_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtProNumRec_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtProNumRec_Internalname, httpContext.getMessage( "Receta Nº Prog.", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 112,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtProNumRec_Internalname, GXutil.ltrim( localUtil.ntoc( A2393ProNumRec, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtProNumRec_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A2393ProNumRec), "ZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A2393ProNumRec), "ZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,112);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProNumRec_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtProNumRec_Enabled, 0, "text", "1", 5, "chr", 1, "row", 5, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\ProcesosQuimicos_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divProforpau_cell_Internalname, 1, 0, "px", 0, "px", divProforpau_cell_Class, "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", edtProForPau_Visible, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtProForPau_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtProForPau_Internalname, httpContext.getMessage( "Tiempo Pausa", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 116,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtProForPau_Internalname, GXutil.ltrim( localUtil.ntoc( A4705ProForPau, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtProForPau_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4705ProForPau), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A4705ProForPau), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,116);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProForPau_Jsonclick, 0, "AttributeFL", "", "", "", "", edtProForPau_Visible, edtProForPau_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\ProcesosQuimicos_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      httpContext.writeText( "</fieldset>") ;
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
      app.GxWebStd.gx_div_start( httpContext, divTableleaflevel_procesosquimicoslineas_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 SectionGrid EditableGridCell_LinedAtts", "left", "top", "", "", "div");
      gxdraw_gridlevel_procesosquimicoslineas( ) ;
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 145,'',false,'',0)\"" ;
      ClassString = "ButtonMaterial" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtntrn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtntrn_enter_Visible, bttBtntrn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_FormulacionTinte\\ProcesosQuimicos_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 147,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtntrn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtntrn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_FormulacionTinte\\ProcesosQuimicos_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 149,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtntrn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtntrn_delete_Visible, bttBtntrn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_FormulacionTinte\\ProcesosQuimicos_TRN.htm");
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
      app.GxWebStd.gx_div_start( httpContext, divSectionattribute_proforlab_Internalname, 1, 0, "px", 0, "px", "Section", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtavComboproforlab_Internalname, GXutil.rtrim( AV50ComboProForLab), GXutil.rtrim( localUtil.format( AV50ComboProForLab, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavComboproforlab_Jsonclick, 0, "Attribute", "", "", "", "", edtavComboproforlab_Visible, edtavComboproforlab_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\ProcesosQuimicos_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 155,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtProForCCi_Internalname, GXutil.rtrim( A4864ProForCCi), GXutil.rtrim( localUtil.format( A4864ProForCCi, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,155);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProForCCi_Jsonclick, 0, "Attribute", "", "", "", "", edtProForCCi_Visible, edtProForCCi_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\ProcesosQuimicos_TRN.htm");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 156,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtProForDCi_Internalname, GXutil.rtrim( A4865ProForDCi), GXutil.rtrim( localUtil.format( A4865ProForDCi, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,156);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProForDCi_Jsonclick, 0, "Attribute", "", "", "", "", edtProForDCi_Visible, edtProForDCi_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\ProcesosQuimicos_TRN.htm");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 157,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtProForMer_Internalname, GXutil.ltrim( localUtil.ntoc( A3589ProForMer, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtProForMer_Enabled!=0) ? localUtil.format( A3589ProForMer, "ZZ9.99") : localUtil.format( A3589ProForMer, "ZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,157);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProForMer_Jsonclick, 0, "Attribute", "", "", "", "", edtProForMer_Visible, edtProForMer_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\ProcesosQuimicos_TRN.htm");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtProFDsc_Internalname, A13740ProFDsc, GXutil.rtrim( localUtil.format( A13740ProFDsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProFDsc_Jsonclick, 0, "Attribute", "", "", "", "", edtProFDsc_Visible, edtProFDsc_Enabled, 0, "text", "", 60, "chr", 1, "row", 60, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\ProcesosQuimicos_TRN.htm");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtProForCodV_Internalname, GXutil.rtrim( A920ProForCodV), GXutil.rtrim( localUtil.format( A920ProForCodV, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProForCodV_Jsonclick, 0, "Attribute", "", "", "", "", edtProForCodV_Visible, edtProForCodV_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\ProcesosQuimicos_TRN.htm");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCodV2_Internalname, GXutil.rtrim( A941EmprCodV2), GXutil.rtrim( localUtil.format( A941EmprCodV2, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCodV2_Jsonclick, 0, "Attribute", "", "", "", "", edtEmprCodV2_Visible, edtEmprCodV2_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\ProcesosQuimicos_TRN.htm");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 161,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,161);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "Attribute", "", "", "", "", edtEmprCod_Visible, edtEmprCod_Enabled, 1, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\ProcesosQuimicos_TRN.htm");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "Attribute", "", "", "", "", edtEmprNom_Visible, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\ProcesosQuimicos_TRN.htm");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 163,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtPorForFul_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPorForFul_Internalname, localUtil.format(A674PorForFul, "99/99/99"), localUtil.format( A674PorForFul, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,163);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPorForFul_Jsonclick, 0, "Attribute", "", "", "", "", edtPorForFul_Visible, edtPorForFul_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\ProcesosQuimicos_TRN.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtPorForFul_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((edtPorForFul_Visible==0)||(edtPorForFul_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_FormulacionTinte\\ProcesosQuimicos_TRN.htm");
      httpContext.writeTextNL( "</div>") ;
      /* User Defined Control */
      ucGridlevel_procesosquimicoslineas_titlescategories.setProperty("GridTitlesCategories", Gridlevel_procesosquimicoslineas_titlescategories_Gridtitlescategories);
      ucGridlevel_procesosquimicoslineas_titlescategories.render(context, "dvelop.gridtitlescategories", Gridlevel_procesosquimicoslineas_titlescategories_Internalname, "GRIDLEVEL_PROCESOSQUIMICOSLINEAS_TITLESCATEGORIESContainer");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
   }

   public void gxdraw_gridlevel_procesosquimicoslineas( )
   {
      /*  Grid Control  */
      startgridcontrol125( ) ;
      nGXsfl_125_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount90 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_90 = (short)(1) ;
            scanStart1RW90( ) ;
            while ( RcdFound90 != 0 )
            {
               init_level_properties90( ) ;
               getByPrimaryKey1RW90( ) ;
               addRow1RW90( ) ;
               scanNext1RW90( ) ;
            }
            scanEnd1RW90( ) ;
            nBlankRcdCount90 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModal1RW90( ) ;
         standaloneModal1RW90( ) ;
         sMode90 = Gx_mode ;
         while ( nGXsfl_125_idx < nRC_GXsfl_125 )
         {
            bGXsfl_125_Refreshing = true ;
            readRow1RW90( ) ;
            edtProForLin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PROFORLIN_"+sGXsfl_125_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtProForLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForLin_Enabled), 5, 0), !bGXsfl_125_Refreshing);
            edtProForPrd_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PROFORPRD_"+sGXsfl_125_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtProForPrd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForPrd_Enabled), 5, 0), !bGXsfl_125_Refreshing);
            edtPrdFind_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRDFIND_"+sGXsfl_125_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPrdFind_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdFind_Enabled), 5, 0), !bGXsfl_125_Refreshing);
            edtPrdNomForm_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRDNOMFORM_"+sGXsfl_125_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPrdNomForm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNomForm_Enabled), 5, 0), !bGXsfl_125_Refreshing);
            edtProForDes_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PROFORDES_"+sGXsfl_125_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtProForDes_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForDes_Enabled), 5, 0), !bGXsfl_125_Refreshing);
            edtProForCPo_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PROFORCPO_"+sGXsfl_125_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtProForCPo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForCPo_Enabled), 5, 0), !bGXsfl_125_Refreshing);
            edtProForCPo_Visible = (int)(localUtil.ctol( httpContext.cgiGet( "PROFORCPO_"+sGXsfl_125_idx+"Visible"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtProForCPo_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForCPo_Visible), 5, 0), !bGXsfl_125_Refreshing);
            edtProForCan_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PROFORCAN_"+sGXsfl_125_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtProForCan_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForCan_Enabled), 5, 0), !bGXsfl_125_Refreshing);
            edtForPrdUMe_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FORPRDUME_"+sGXsfl_125_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtForPrdUMe_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForPrdUMe_Enabled), 5, 0), !bGXsfl_125_Refreshing);
            edtavClaves_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vCLAVES_"+sGXsfl_125_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavClaves_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavClaves_Enabled), 5, 0), !bGXsfl_125_Refreshing);
            edtavClaves_Tooltiptext = httpContext.cgiGet( "vCLAVES_"+sGXsfl_125_idx+"Tooltiptext") ;
            httpContext.ajax_rsp_assign_prop("", false, edtavClaves_Internalname, "Tooltiptext", edtavClaves_Tooltiptext, !bGXsfl_125_Refreshing);
            edtavClaves_Visible = (int)(localUtil.ctol( httpContext.cgiGet( "vCLAVES_"+sGXsfl_125_idx+"Visible"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavClaves_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavClaves_Visible), 5, 0), !bGXsfl_125_Refreshing);
            edtavClavesdel_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vCLAVESDEL_"+sGXsfl_125_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavClavesdel_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavClavesdel_Enabled), 5, 0), !bGXsfl_125_Refreshing);
            edtavClavesdel_Tooltiptext = httpContext.cgiGet( "vCLAVESDEL_"+sGXsfl_125_idx+"Tooltiptext") ;
            httpContext.ajax_rsp_assign_prop("", false, edtavClavesdel_Internalname, "Tooltiptext", edtavClavesdel_Tooltiptext, !bGXsfl_125_Refreshing);
            edtavClavesdel_Visible = (int)(localUtil.ctol( httpContext.cgiGet( "vCLAVESDEL_"+sGXsfl_125_idx+"Visible"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavClavesdel_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavClavesdel_Visible), 5, 0), !bGXsfl_125_Refreshing);
            edtProForCla_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PROFORCLA_"+sGXsfl_125_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtProForCla_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForCla_Enabled), 5, 0), !bGXsfl_125_Refreshing);
            edtProForClv_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PROFORCLV_"+sGXsfl_125_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtProForClv_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForClv_Enabled), 5, 0), !bGXsfl_125_Refreshing);
            edtProForClv_Visible = (int)(localUtil.ctol( httpContext.cgiGet( "PROFORCLV_"+sGXsfl_125_idx+"Visible"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtProForClv_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForClv_Visible), 5, 0), !bGXsfl_125_Refreshing);
            edtProForNro_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PROFORNRO_"+sGXsfl_125_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtProForNro_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForNro_Enabled), 5, 0), !bGXsfl_125_Refreshing);
            edtProForTnq_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PROFORTNQ_"+sGXsfl_125_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtProForTnq_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForTnq_Enabled), 5, 0), !bGXsfl_125_Refreshing);
            edtPrdMaxFind_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRDMAXFIND_"+sGXsfl_125_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPrdMaxFind_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdMaxFind_Enabled), 5, 0), !bGXsfl_125_Refreshing);
            if ( ( nRcdExists_90 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal1RW90( ) ;
            }
            sendRow1RW90( ) ;
            bGXsfl_125_Refreshing = false ;
         }
         Gx_mode = sMode90 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount90 = (short)(5) ;
         nRcdExists_90 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart1RW90( ) ;
            while ( RcdFound90 != 0 )
            {
               sGXsfl_125_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_125_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_12590( ) ;
               init_level_properties90( ) ;
               standaloneNotModal1RW90( ) ;
               getByPrimaryKey1RW90( ) ;
               standaloneModal1RW90( ) ;
               addRow1RW90( ) ;
               scanNext1RW90( ) ;
            }
            scanEnd1RW90( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      if ( ! isDsp( ) && ! isDlt( ) )
      {
         sMode90 = Gx_mode ;
         Gx_mode = "INS" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         sGXsfl_125_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_125_idx+1), 4, 0), (short)(4), "0") ;
         subsflControlProps_12590( ) ;
         initAll1RW90( ) ;
         init_level_properties90( ) ;
         nRcdExists_90 = (short)(0) ;
         nIsMod_90 = (short)(0) ;
         nRcdDeleted_90 = (short)(0) ;
         nBlankRcdCount90 = (short)(nBlankRcdUsr90+nBlankRcdCount90) ;
         fRowAdded = 0 ;
         while ( nBlankRcdCount90 > 0 )
         {
            standaloneNotModal1RW90( ) ;
            standaloneModal1RW90( ) ;
            addRow1RW90( ) ;
            if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
            {
               fRowAdded = 1 ;
               GX_FocusControl = edtProForLin_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            nBlankRcdCount90 = (short)(nBlankRcdCount90-1) ;
         }
         Gx_mode = sMode90 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      sStyleString = "" ;
      httpContext.writeText( "<div id=\""+"Gridlevel_procesosquimicoslineasContainer"+"Div\" "+sStyleString+">"+"</div>") ;
      httpContext.ajax_rsp_assign_grid("_"+"Gridlevel_procesosquimicoslineas", Gridlevel_procesosquimicoslineasContainer, subGridlevel_procesosquimicoslineas_Internalname);
      if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Gridlevel_procesosquimicoslineasContainerData", Gridlevel_procesosquimicoslineasContainer.ToJavascriptSource());
      }
      if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Gridlevel_procesosquimicoslineasContainerData"+"V", Gridlevel_procesosquimicoslineasContainer.GridValuesHidden());
      }
      else
      {
         httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"Gridlevel_procesosquimicoslineasContainerData"+"V"+"\" value='"+Gridlevel_procesosquimicoslineasContainer.GridValuesHidden()+"'/>") ;
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
      e111RW2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vPROFORLAB_DATA"), AV48ProForLab_Data);
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z764ProForCod = httpContext.cgiGet( "Z764ProForCod") ;
            Z6061ProForLab = httpContext.cgiGet( "Z6061ProForLab") ;
            Z766ProForDsc = httpContext.cgiGet( "Z766ProForDsc") ;
            Z4715ProForDsc2 = httpContext.cgiGet( "Z4715ProForDsc2") ;
            Z771ProForTie = (short)(localUtil.ctol( httpContext.cgiGet( "Z771ProForTie"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z772ProForTmx = (short)(localUtil.ctol( httpContext.cgiGet( "Z772ProForTmx"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z769ProForMat = httpContext.cgiGet( "Z769ProForMat") ;
            Z674PorForFul = localUtil.ctod( httpContext.cgiGet( "Z674PorForFul"), 0) ;
            Z773ProForUli = (short)(localUtil.ctol( httpContext.cgiGet( "Z773ProForUli"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z2392ProNumPro = (int)(localUtil.ctol( httpContext.cgiGet( "Z2392ProNumPro"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z2393ProNumRec = (int)(localUtil.ctol( httpContext.cgiGet( "Z2393ProNumRec"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z3005ProRev = httpContext.cgiGet( "Z3005ProRev") ;
            Z4705ProForPau = (short)(localUtil.ctol( httpContext.cgiGet( "Z4705ProForPau"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z4706ProForRb = (short)(localUtil.ctol( httpContext.cgiGet( "Z4706ProForRb"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z4864ProForCCi = httpContext.cgiGet( "Z4864ProForCCi") ;
            Z4865ProForDCi = httpContext.cgiGet( "Z4865ProForDCi") ;
            Z5523ProForTip = httpContext.cgiGet( "Z5523ProForTip") ;
            Z8527ProForAbs = localUtil.ctond( httpContext.cgiGet( "Z8527ProForAbs")) ;
            Z8528ProForCos = localUtil.ctond( httpContext.cgiGet( "Z8528ProForCos")) ;
            Z10120ProforVl = (int)(localUtil.ctol( httpContext.cgiGet( "Z10120ProforVl"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z10547ProH2O = (short)(localUtil.ctol( httpContext.cgiGet( "Z10547ProH2O"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z3589ProForMer = localUtil.ctond( httpContext.cgiGet( "Z3589ProForMer")) ;
            Z13133ProForAct = httpContext.cgiGet( "Z13133ProForAct") ;
            Z13936ProForRs = httpContext.cgiGet( "Z13936ProForRs") ;
            A773ProForUli = (short)(localUtil.ctol( httpContext.cgiGet( "Z773ProForUli"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_125 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_125"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV12EmprCod = httpContext.cgiGet( "vEMPRCOD") ;
            AV32ProForCod = httpContext.cgiGet( "vPROFORCOD") ;
            Gx_BScreen = (byte)(localUtil.ctol( httpContext.cgiGet( "vGXBSCREEN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV38Exis_pro = (short)(localUtil.ctol( httpContext.cgiGet( "vEXIS_PRO"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV29Msg1 = httpContext.cgiGet( "vMSG1") ;
            AV24Orient = (short)(localUtil.ctol( httpContext.cgiGet( "vORIENT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A773ProForUli = (short)(localUtil.ctol( httpContext.cgiGet( "PROFORULI"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV53Pgmname = httpContext.cgiGet( "vPGMNAME") ;
            A490ForPrdUMe = (byte)(localUtil.ctol( httpContext.cgiGet( "GXHCFORPRDUME"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A768ProForLinV = (short)(localUtil.ctol( httpContext.cgiGet( "PROFORLINV"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A13178ProForFT = httpContext.cgiGet( "PROFORFT") ;
            A4340PrdUMeFind = (byte)(localUtil.ctol( httpContext.cgiGet( "PRDUMEFIND"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n4340PrdUMeFind = false ;
            AV13CdpPor = (short)(localUtil.ctol( httpContext.cgiGet( "vCDPPOR"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV30oldCant = localUtil.ctond( httpContext.cgiGet( "vOLDCANT")) ;
            AV31Un = (byte)(localUtil.ctol( httpContext.cgiGet( "vUN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV7oldProforlin = (short)(localUtil.ctol( httpContext.cgiGet( "vOLDPROFORLIN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV10Msg_e = httpContext.cgiGet( "vMSG_E") ;
            AV39Msg_del = httpContext.cgiGet( "vMSG_DEL") ;
            AV8Usurcod = httpContext.cgiGet( "vUSURCOD") ;
            AV9Station = httpContext.cgiGet( "vSTATION") ;
            A13111ProForDe2 = httpContext.cgiGet( "PROFORDE2") ;
            A488ForPrdDsc = httpContext.cgiGet( "FORPRDDSC") ;
            n488ForPrdDsc = false ;
            Combo_proforlab_Objectcall = httpContext.cgiGet( "COMBO_PROFORLAB_Objectcall") ;
            Combo_proforlab_Class = httpContext.cgiGet( "COMBO_PROFORLAB_Class") ;
            Combo_proforlab_Icontype = httpContext.cgiGet( "COMBO_PROFORLAB_Icontype") ;
            Combo_proforlab_Icon = httpContext.cgiGet( "COMBO_PROFORLAB_Icon") ;
            Combo_proforlab_Caption = httpContext.cgiGet( "COMBO_PROFORLAB_Caption") ;
            Combo_proforlab_Tooltip = httpContext.cgiGet( "COMBO_PROFORLAB_Tooltip") ;
            Combo_proforlab_Cls = httpContext.cgiGet( "COMBO_PROFORLAB_Cls") ;
            Combo_proforlab_Selectedvalue_set = httpContext.cgiGet( "COMBO_PROFORLAB_Selectedvalue_set") ;
            Combo_proforlab_Selectedvalue_get = httpContext.cgiGet( "COMBO_PROFORLAB_Selectedvalue_get") ;
            Combo_proforlab_Selectedtext_set = httpContext.cgiGet( "COMBO_PROFORLAB_Selectedtext_set") ;
            Combo_proforlab_Selectedtext_get = httpContext.cgiGet( "COMBO_PROFORLAB_Selectedtext_get") ;
            Combo_proforlab_Gamoauthtoken = httpContext.cgiGet( "COMBO_PROFORLAB_Gamoauthtoken") ;
            Combo_proforlab_Ddointernalname = httpContext.cgiGet( "COMBO_PROFORLAB_Ddointernalname") ;
            Combo_proforlab_Titlecontrolalign = httpContext.cgiGet( "COMBO_PROFORLAB_Titlecontrolalign") ;
            Combo_proforlab_Dropdownoptionstype = httpContext.cgiGet( "COMBO_PROFORLAB_Dropdownoptionstype") ;
            Combo_proforlab_Enabled = GXutil.strtobool( httpContext.cgiGet( "COMBO_PROFORLAB_Enabled")) ;
            Combo_proforlab_Visible = GXutil.strtobool( httpContext.cgiGet( "COMBO_PROFORLAB_Visible")) ;
            Combo_proforlab_Titlecontrolidtoreplace = httpContext.cgiGet( "COMBO_PROFORLAB_Titlecontrolidtoreplace") ;
            Combo_proforlab_Datalisttype = httpContext.cgiGet( "COMBO_PROFORLAB_Datalisttype") ;
            Combo_proforlab_Allowmultipleselection = GXutil.strtobool( httpContext.cgiGet( "COMBO_PROFORLAB_Allowmultipleselection")) ;
            Combo_proforlab_Datalistfixedvalues = httpContext.cgiGet( "COMBO_PROFORLAB_Datalistfixedvalues") ;
            Combo_proforlab_Isgriditem = GXutil.strtobool( httpContext.cgiGet( "COMBO_PROFORLAB_Isgriditem")) ;
            Combo_proforlab_Hasdescription = GXutil.strtobool( httpContext.cgiGet( "COMBO_PROFORLAB_Hasdescription")) ;
            Combo_proforlab_Datalistproc = httpContext.cgiGet( "COMBO_PROFORLAB_Datalistproc") ;
            Combo_proforlab_Datalistprocparametersprefix = httpContext.cgiGet( "COMBO_PROFORLAB_Datalistprocparametersprefix") ;
            Combo_proforlab_Remoteservicesparameters = httpContext.cgiGet( "COMBO_PROFORLAB_Remoteservicesparameters") ;
            Combo_proforlab_Datalistupdateminimumcharacters = (int)(localUtil.ctol( httpContext.cgiGet( "COMBO_PROFORLAB_Datalistupdateminimumcharacters"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Combo_proforlab_Includeonlyselectedoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_PROFORLAB_Includeonlyselectedoption")) ;
            Combo_proforlab_Includeselectalloption = GXutil.strtobool( httpContext.cgiGet( "COMBO_PROFORLAB_Includeselectalloption")) ;
            Combo_proforlab_Emptyitem = GXutil.strtobool( httpContext.cgiGet( "COMBO_PROFORLAB_Emptyitem")) ;
            Combo_proforlab_Includeaddnewoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_PROFORLAB_Includeaddnewoption")) ;
            Combo_proforlab_Htmltemplate = httpContext.cgiGet( "COMBO_PROFORLAB_Htmltemplate") ;
            Combo_proforlab_Multiplevaluestype = httpContext.cgiGet( "COMBO_PROFORLAB_Multiplevaluestype") ;
            Combo_proforlab_Loadingdata = httpContext.cgiGet( "COMBO_PROFORLAB_Loadingdata") ;
            Combo_proforlab_Noresultsfound = httpContext.cgiGet( "COMBO_PROFORLAB_Noresultsfound") ;
            Combo_proforlab_Emptyitemtext = httpContext.cgiGet( "COMBO_PROFORLAB_Emptyitemtext") ;
            Combo_proforlab_Onlyselectedvalues = httpContext.cgiGet( "COMBO_PROFORLAB_Onlyselectedvalues") ;
            Combo_proforlab_Selectalltext = httpContext.cgiGet( "COMBO_PROFORLAB_Selectalltext") ;
            Combo_proforlab_Multiplevaluesseparator = httpContext.cgiGet( "COMBO_PROFORLAB_Multiplevaluesseparator") ;
            Combo_proforlab_Addnewoptiontext = httpContext.cgiGet( "COMBO_PROFORLAB_Addnewoptiontext") ;
            Combo_proforlab_Gxcontroltype = (int)(localUtil.ctol( httpContext.cgiGet( "COMBO_PROFORLAB_Gxcontroltype"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
            Dvpanel_tableattributes_Gxcontroltype = (int)(localUtil.ctol( httpContext.cgiGet( "DVPANEL_TABLEATTRIBUTES_Gxcontroltype"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gridlevel_procesosquimicoslineas_titlescategories_Objectcall = httpContext.cgiGet( "GRIDLEVEL_PROCESOSQUIMICOSLINEAS_TITLESCATEGORIES_Objectcall") ;
            Gridlevel_procesosquimicoslineas_titlescategories_Class = httpContext.cgiGet( "GRIDLEVEL_PROCESOSQUIMICOSLINEAS_TITLESCATEGORIES_Class") ;
            Gridlevel_procesosquimicoslineas_titlescategories_Enabled = GXutil.strtobool( httpContext.cgiGet( "GRIDLEVEL_PROCESOSQUIMICOSLINEAS_TITLESCATEGORIES_Enabled")) ;
            Gridlevel_procesosquimicoslineas_titlescategories_Gridinternalname = httpContext.cgiGet( "GRIDLEVEL_PROCESOSQUIMICOSLINEAS_TITLESCATEGORIES_Gridinternalname") ;
            Gridlevel_procesosquimicoslineas_titlescategories_Gridtitlescategories = httpContext.cgiGet( "GRIDLEVEL_PROCESOSQUIMICOSLINEAS_TITLESCATEGORIES_Gridtitlescategories") ;
            Gridlevel_procesosquimicoslineas_titlescategories_Visible = GXutil.strtobool( httpContext.cgiGet( "GRIDLEVEL_PROCESOSQUIMICOSLINEAS_TITLESCATEGORIES_Visible")) ;
            /* Read variables values. */
            A764ProForCod = httpContext.cgiGet( edtProForCod_Internalname) ;
            n764ProForCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A764ProForCod", A764ProForCod);
            A766ProForDsc = httpContext.cgiGet( edtProForDsc_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A766ProForDsc", A766ProForDsc);
            A4715ProForDsc2 = httpContext.cgiGet( edtProForDsc2_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4715ProForDsc2", A4715ProForDsc2);
            A13133ProForAct = ((GXutil.strcmp(httpContext.cgiGet( chkProForAct.getInternalname()), "S")==0) ? "S" : "N") ;
            httpContext.ajax_rsp_assign_attri("", false, "A13133ProForAct", A13133ProForAct);
            A5523ProForTip = httpContext.cgiGet( edtProForTip_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A5523ProForTip", A5523ProForTip);
            A13936ProForRs = httpContext.cgiGet( edtProForRs_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A13936ProForRs", A13936ProForRs);
            cmbProRev.setName( cmbProRev.getInternalname() );
            cmbProRev.setValue( httpContext.cgiGet( cmbProRev.getInternalname()) );
            A3005ProRev = httpContext.cgiGet( cmbProRev.getInternalname()) ;
            httpContext.ajax_rsp_assign_attri("", false, "A3005ProRev", A3005ProRev);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtProForTie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtProForTie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PROFORTIE");
               AnyError = (short)(1) ;
               GX_FocusControl = edtProForTie_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A771ProForTie = (short)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A771ProForTie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A771ProForTie), 4, 0));
            }
            else
            {
               A771ProForTie = (short)(localUtil.ctol( httpContext.cgiGet( edtProForTie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A771ProForTie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A771ProForTie), 4, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtProForTmx_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtProForTmx_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PROFORTMX");
               AnyError = (short)(1) ;
               GX_FocusControl = edtProForTmx_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A772ProForTmx = (short)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A772ProForTmx", GXutil.ltrimstr( DecimalUtil.doubleToDec(A772ProForTmx), 4, 0));
            }
            else
            {
               A772ProForTmx = (short)(localUtil.ctol( httpContext.cgiGet( edtProForTmx_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A772ProForTmx", GXutil.ltrimstr( DecimalUtil.doubleToDec(A772ProForTmx), 4, 0));
            }
            A769ProForMat = httpContext.cgiGet( edtProForMat_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A769ProForMat", A769ProForMat);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtProForRb_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtProForRb_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PROFORRB");
               AnyError = (short)(1) ;
               GX_FocusControl = edtProForRb_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A4706ProForRb = (short)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A4706ProForRb", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4706ProForRb), 4, 0));
            }
            else
            {
               A4706ProForRb = (short)(localUtil.ctol( httpContext.cgiGet( edtProForRb_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A4706ProForRb", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4706ProForRb), 4, 0));
            }
            A6061ProForLab = httpContext.cgiGet( edtProForLab_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A6061ProForLab", A6061ProForLab);
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtProForAbs_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtProForAbs_Internalname)), DecimalUtil.stringToDec("999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PROFORABS");
               AnyError = (short)(1) ;
               GX_FocusControl = edtProForAbs_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A8527ProForAbs = DecimalUtil.ZERO ;
               httpContext.ajax_rsp_assign_attri("", false, "A8527ProForAbs", GXutil.ltrimstr( A8527ProForAbs, 6, 2));
            }
            else
            {
               A8527ProForAbs = localUtil.ctond( httpContext.cgiGet( edtProForAbs_Internalname)) ;
               httpContext.ajax_rsp_assign_attri("", false, "A8527ProForAbs", GXutil.ltrimstr( A8527ProForAbs, 6, 2));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtProForCos_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtProForCos_Internalname)), DecimalUtil.stringToDec("999.9999")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PROFORCOS");
               AnyError = (short)(1) ;
               GX_FocusControl = edtProForCos_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A8528ProForCos = DecimalUtil.ZERO ;
               httpContext.ajax_rsp_assign_attri("", false, "A8528ProForCos", GXutil.ltrimstr( A8528ProForCos, 8, 4));
            }
            else
            {
               A8528ProForCos = localUtil.ctond( httpContext.cgiGet( edtProForCos_Internalname)) ;
               httpContext.ajax_rsp_assign_attri("", false, "A8528ProForCos", GXutil.ltrimstr( A8528ProForCos, 8, 4));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtProforVl_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtProforVl_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PROFORVL");
               AnyError = (short)(1) ;
               GX_FocusControl = edtProforVl_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A10120ProforVl = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A10120ProforVl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10120ProforVl), 5, 0));
            }
            else
            {
               A10120ProforVl = (int)(localUtil.ctol( httpContext.cgiGet( edtProforVl_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A10120ProforVl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10120ProforVl), 5, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtProH2O_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtProH2O_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PROH2O");
               AnyError = (short)(1) ;
               GX_FocusControl = edtProH2O_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A10547ProH2O = (short)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A10547ProH2O", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10547ProH2O), 4, 0));
            }
            else
            {
               A10547ProH2O = (short)(localUtil.ctol( httpContext.cgiGet( edtProH2O_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A10547ProH2O", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10547ProH2O), 4, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtProNumPro_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtProNumPro_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PRONUMPRO");
               AnyError = (short)(1) ;
               GX_FocusControl = edtProNumPro_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A2392ProNumPro = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A2392ProNumPro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2392ProNumPro), 5, 0));
            }
            else
            {
               A2392ProNumPro = (int)(localUtil.ctol( httpContext.cgiGet( edtProNumPro_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A2392ProNumPro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2392ProNumPro), 5, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtProNumRec_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtProNumRec_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PRONUMREC");
               AnyError = (short)(1) ;
               GX_FocusControl = edtProNumRec_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A2393ProNumRec = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A2393ProNumRec", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2393ProNumRec), 5, 0));
            }
            else
            {
               A2393ProNumRec = (int)(localUtil.ctol( httpContext.cgiGet( edtProNumRec_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A2393ProNumRec", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2393ProNumRec), 5, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtProForPau_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtProForPau_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PROFORPAU");
               AnyError = (short)(1) ;
               GX_FocusControl = edtProForPau_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A4705ProForPau = (short)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A4705ProForPau", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4705ProForPau), 4, 0));
            }
            else
            {
               A4705ProForPau = (short)(localUtil.ctol( httpContext.cgiGet( edtProForPau_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A4705ProForPau", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4705ProForPau), 4, 0));
            }
            AV50ComboProForLab = httpContext.cgiGet( edtavComboproforlab_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV50ComboProForLab", AV50ComboProForLab);
            A4864ProForCCi = httpContext.cgiGet( edtProForCCi_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4864ProForCCi", A4864ProForCCi);
            A4865ProForDCi = httpContext.cgiGet( edtProForDCi_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4865ProForDCi", A4865ProForDCi);
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtProForMer_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtProForMer_Internalname)), DecimalUtil.stringToDec("999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PROFORMER");
               AnyError = (short)(1) ;
               GX_FocusControl = edtProForMer_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A3589ProForMer = DecimalUtil.ZERO ;
               httpContext.ajax_rsp_assign_attri("", false, "A3589ProForMer", GXutil.ltrimstr( A3589ProForMer, 6, 2));
            }
            else
            {
               A3589ProForMer = localUtil.ctond( httpContext.cgiGet( edtProForMer_Internalname)) ;
               httpContext.ajax_rsp_assign_attri("", false, "A3589ProForMer", GXutil.ltrimstr( A3589ProForMer, 6, 2));
            }
            A13740ProFDsc = httpContext.cgiGet( edtProFDsc_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A13740ProFDsc", A13740ProFDsc);
            A920ProForCodV = httpContext.cgiGet( edtProForCodV_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A920ProForCodV", A920ProForCodV);
            A941EmprCodV2 = GXutil.upper( httpContext.cgiGet( edtEmprCodV2_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A941EmprCodV2", A941EmprCodV2);
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
            n407EmprNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
            if ( localUtil.vcdate( httpContext.cgiGet( edtPorForFul_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "PORFORFUL");
               AnyError = (short)(1) ;
               GX_FocusControl = edtPorForFul_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A674PorForFul = GXutil.nullDate() ;
               httpContext.ajax_rsp_assign_attri("", false, "A674PorForFul", localUtil.format(A674PorForFul, "99/99/99"));
            }
            else
            {
               A674PorForFul = localUtil.ctod( httpContext.cgiGet( edtPorForFul_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A674PorForFul", localUtil.format(A674PorForFul, "99/99/99"));
            }
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = new com.genexus.util.GXProperties() ;
            forbiddenHiddens.add("hshsalt", "hsh"+"ProcesosQuimicos_TRN");
            forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ( ! ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A764ProForCod, Z764ProForCod) != 0 ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
            {
               GXutil.writeLogError("formulaciontinte\\procesosquimicos_trn:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
               A764ProForCod = httpContext.GetPar( "ProForCod") ;
               n764ProForCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A764ProForCod", A764ProForCod);
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
                  sMode89 = Gx_mode ;
                  Gx_mode = "UPD" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  Gx_mode = sMode89 ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               }
               standaloneModal( ) ;
               if ( ! isIns( ) )
               {
                  getByPrimaryKey( ) ;
                  if ( RcdFound89 == 1 )
                  {
                     if ( isDlt( ) )
                     {
                        /* Confirm record */
                        confirm_1RW0( ) ;
                        if ( AnyError == 0 )
                        {
                           GX_FocusControl = bttBtntrn_enter_Internalname ;
                           httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                        }
                     }
                  }
                  else
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noinsert"), 1, "EMPRCOD");
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtEmprCod_Internalname ;
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
                        e111RW2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: After Trn */
                        e121RW2 ();
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
                     if ( ( GXutil.strcmp(GXutil.left( sEvt, 13), "VCLAVES.CLICK") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 13), "VCLAVES.CLICK") == 0 ) )
                     {
                        nGXsfl_125_idx = (int)(GXutil.lval( sEvtType)) ;
                        sGXsfl_125_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_125_idx), 4, 0), (short)(4), "0") ;
                        subsflControlProps_12590( ) ;
                        if ( ( ( localUtil.ctol( httpContext.cgiGet( edtProForLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtProForLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
                        {
                           GXCCtl = "PROFORLIN_" + sGXsfl_125_idx ;
                           httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
                           AnyError = (short)(1) ;
                           GX_FocusControl = edtProForLin_Internalname ;
                           httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                           wbErr = true ;
                           A767ProForLin = (short)(0) ;
                        }
                        else
                        {
                           A767ProForLin = (short)(localUtil.ctol( httpContext.cgiGet( edtProForLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                        }
                        A770ProForPrd = httpContext.cgiGet( edtProForPrd_Internalname) ;
                        A710PrdFind = httpContext.cgiGet( edtPrdFind_Internalname) ;
                        n710PrdFind = false ;
                        A13976PrdNomForm = httpContext.cgiGet( edtPrdNomForm_Internalname) ;
                        A765ProForDes = httpContext.cgiGet( edtProForDes_Internalname) ;
                        if ( ( ( localUtil.ctond( httpContext.cgiGet( edtProForCPo_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtProForCPo_Internalname)), DecimalUtil.stringToDec("999.99")) > 0 ) ) )
                        {
                           GXCCtl = "PROFORCPO_" + sGXsfl_125_idx ;
                           httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
                           AnyError = (short)(1) ;
                           GX_FocusControl = edtProForCPo_Internalname ;
                           httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                           wbErr = true ;
                           A6062ProForCPo = DecimalUtil.ZERO ;
                        }
                        else
                        {
                           A6062ProForCPo = localUtil.ctond( httpContext.cgiGet( edtProForCPo_Internalname)) ;
                        }
                        if ( ( ( localUtil.ctond( httpContext.cgiGet( edtProForCan_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtProForCan_Internalname)), DecimalUtil.stringToDec("999999.99999")) > 0 ) ) )
                        {
                           GXCCtl = "PROFORCAN_" + sGXsfl_125_idx ;
                           httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
                           AnyError = (short)(1) ;
                           GX_FocusControl = edtProForCan_Internalname ;
                           httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                           wbErr = true ;
                           A762ProForCan = DecimalUtil.ZERO ;
                        }
                        else
                        {
                           A762ProForCan = localUtil.ctond( httpContext.cgiGet( edtProForCan_Internalname)) ;
                        }
                        h490ForPrdUMe = httpContext.cgiGet( edtForPrdUMe_Internalname) ;
                        AV41Claves = httpContext.cgiGet( edtavClaves_Internalname) ;
                        httpContext.ajax_rsp_assign_prop("", false, edtavClaves_Internalname, "Bitmap", ((GXutil.strcmp("", AV41Claves)==0) ? AV55Claves_GXI : httpContext.convertURL( httpContext.getResourceRelative(AV41Claves))), !bGXsfl_125_Refreshing);
                        httpContext.ajax_rsp_assign_prop("", false, edtavClaves_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( AV41Claves), true);
                        AV45Clavesdel = httpContext.cgiGet( edtavClavesdel_Internalname) ;
                        httpContext.ajax_rsp_assign_prop("", false, edtavClavesdel_Internalname, "Bitmap", ((GXutil.strcmp("", AV45Clavesdel)==0) ? AV56Clavesdel_GXI : httpContext.convertURL( httpContext.getResourceRelative(AV45Clavesdel))), !bGXsfl_125_Refreshing);
                        httpContext.ajax_rsp_assign_prop("", false, edtavClavesdel_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( AV45Clavesdel), true);
                        A763ProForCla = httpContext.cgiGet( edtProForCla_Internalname) ;
                        A5358ProForClv = httpContext.cgiGet( edtProForClv_Internalname) ;
                        if ( ( ( localUtil.ctol( httpContext.cgiGet( edtProForNro_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtProForNro_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
                        {
                           GXCCtl = "PROFORNRO_" + sGXsfl_125_idx ;
                           httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
                           AnyError = (short)(1) ;
                           GX_FocusControl = edtProForNro_Internalname ;
                           httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                           wbErr = true ;
                           A1645ProForNro = (byte)(0) ;
                        }
                        else
                        {
                           A1645ProForNro = (byte)(localUtil.ctol( httpContext.cgiGet( edtProForNro_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                        }
                        if ( ( ( localUtil.ctol( httpContext.cgiGet( edtProForTnq_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtProForTnq_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
                        {
                           GXCCtl = "PROFORTNQ_" + sGXsfl_125_idx ;
                           httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
                           AnyError = (short)(1) ;
                           GX_FocusControl = edtProForTnq_Internalname ;
                           httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                           wbErr = true ;
                           A3379ProForTnq = (byte)(0) ;
                        }
                        else
                        {
                           A3379ProForTnq = (byte)(localUtil.ctol( httpContext.cgiGet( edtProForTnq_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                        }
                        A717PrdMaxFind = httpContext.cgiGet( edtPrdMaxFind_Internalname) ;
                        n717PrdMaxFind = false ;
                        GXCCtl = "GXHCFORPRDUME_" + sGXsfl_125_idx ;
                        A490ForPrdUMe = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                        GXCCtl = "Z767ProForLin_" + sGXsfl_125_idx ;
                        Z767ProForLin = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                        GXCCtl = "Z6062ProForCPo_" + sGXsfl_125_idx ;
                        Z6062ProForCPo = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
                        GXCCtl = "Z13178ProForFT_" + sGXsfl_125_idx ;
                        Z13178ProForFT = httpContext.cgiGet( GXCCtl) ;
                        GXCCtl = "Z765ProForDes_" + sGXsfl_125_idx ;
                        Z765ProForDes = httpContext.cgiGet( GXCCtl) ;
                        GXCCtl = "Z770ProForPrd_" + sGXsfl_125_idx ;
                        Z770ProForPrd = httpContext.cgiGet( GXCCtl) ;
                        GXCCtl = "Z13111ProForDe2_" + sGXsfl_125_idx ;
                        Z13111ProForDe2 = httpContext.cgiGet( GXCCtl) ;
                        GXCCtl = "Z762ProForCan_" + sGXsfl_125_idx ;
                        Z762ProForCan = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
                        GXCCtl = "Z1645ProForNro_" + sGXsfl_125_idx ;
                        Z1645ProForNro = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                        GXCCtl = "Z3379ProForTnq_" + sGXsfl_125_idx ;
                        Z3379ProForTnq = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                        GXCCtl = "Z763ProForCla_" + sGXsfl_125_idx ;
                        Z763ProForCla = httpContext.cgiGet( GXCCtl) ;
                        GXCCtl = "Z5358ProForClv_" + sGXsfl_125_idx ;
                        Z5358ProForClv = httpContext.cgiGet( GXCCtl) ;
                        GXCCtl = "Z490ForPrdUMe_" + sGXsfl_125_idx ;
                        Z490ForPrdUMe = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                        GXCCtl = "Z13178ProForFT_" + sGXsfl_125_idx ;
                        A13178ProForFT = httpContext.cgiGet( GXCCtl) ;
                        GXCCtl = "Z13111ProForDe2_" + sGXsfl_125_idx ;
                        A13111ProForDe2 = httpContext.cgiGet( GXCCtl) ;
                        GXCCtl = "O762ProForCan_" + sGXsfl_125_idx ;
                        O762ProForCan = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
                        GXCCtl = "O767ProForLin_" + sGXsfl_125_idx ;
                        O767ProForLin = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                        GXCCtl = "O490ForPrdUMe_" + sGXsfl_125_idx ;
                        O490ForPrdUMe = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                        GXCCtl = "O763ProForCla_" + sGXsfl_125_idx ;
                        O763ProForCla = httpContext.cgiGet( GXCCtl) ;
                        GXCCtl = "O5358ProForClv_" + sGXsfl_125_idx ;
                        O5358ProForClv = httpContext.cgiGet( GXCCtl) ;
                        GXCCtl = "PROFORLINV_" + sGXsfl_125_idx ;
                        A768ProForLinV = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                        GXCCtl = "nRcdDeleted_90_" + sGXsfl_125_idx ;
                        nRcdDeleted_90 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                        GXCCtl = "nRcdExists_90_" + sGXsfl_125_idx ;
                        nRcdExists_90 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                        GXCCtl = "nIsMod_90_" + sGXsfl_125_idx ;
                        nIsMod_90 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                        GXCCtl = "N6062ProForCPo_" + sGXsfl_125_idx ;
                        N6062ProForCPo = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
                        GXCCtl = "vEMPRCOD_" + sGXsfl_125_idx ;
                        AV12EmprCod = httpContext.cgiGet( GXCCtl) ;
                        GXCCtl = "PROFORFT_" + sGXsfl_125_idx ;
                        A13178ProForFT = httpContext.cgiGet( GXCCtl) ;
                        sEvtType = GXutil.right( sEvt, 1) ;
                        if ( GXutil.strcmp(sEvtType, ".") == 0 )
                        {
                           sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                           if ( GXutil.strcmp(sEvt, "VCLAVES.CLICK") == 0 )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              dynload_actions( ) ;
                              e131RW2 ();
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

   public void afterTrn( )
   {
      if ( trnEnded == 1 )
      {
         if ( ! (GXutil.strcmp("", endTrnMsgTxt)==0) )
         {
            httpContext.GX_msglist.addItem(endTrnMsgTxt, endTrnMsgCod, 0, "", true);
         }
         /* Execute user event: After Trn */
         e121RW2 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( isIns( )  )
         {
            /* Clear variables for new insertion. */
            initAll1RW89( ) ;
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
         disableAttributes1RW89( ) ;
      }
      httpContext.ajax_rsp_assign_prop("", false, edtavComboproforlab_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavComboproforlab_Enabled), 5, 0), true);
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

   public void confirm_1RW0( )
   {
      beforeValidate1RW89( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1RW89( ) ;
         }
         else
         {
            checkExtendedTable1RW89( ) ;
            closeExtendedTableCursors1RW89( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode89 = Gx_mode ;
         confirm_1RW90( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode89 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode89 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
   }

   public void confirm_1RW90( )
   {
      nGXsfl_125_idx = 0 ;
      while ( nGXsfl_125_idx < nRC_GXsfl_125 )
      {
         readRow1RW90( ) ;
         if ( ( nRcdExists_90 != 0 ) || ( nIsMod_90 != 0 ) )
         {
            getKey1RW90( ) ;
            if ( ( nRcdExists_90 == 0 ) && ( nRcdDeleted_90 == 0 ) )
            {
               if ( RcdFound90 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate1RW90( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1RW90( ) ;
                     closeExtendedTableCursors1RW90( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                  }
               }
               else
               {
                  GXCCtl = "PROFORLIN_" + sGXsfl_125_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtProForLin_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound90 != 0 )
               {
                  if ( nRcdDeleted_90 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey1RW90( ) ;
                     load1RW90( ) ;
                     beforeValidate1RW90( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1RW90( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_90 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate1RW90( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1RW90( ) ;
                           closeExtendedTableCursors1RW90( ) ;
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
                  if ( nRcdDeleted_90 == 0 )
                  {
                     GXCCtl = "PROFORLIN_" + sGXsfl_125_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtProForLin_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtProForLin_Internalname, GXutil.ltrim( localUtil.ntoc( A767ProForLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtProForPrd_Internalname, GXutil.rtrim( A770ProForPrd)) ;
         httpContext.changePostValue( edtPrdFind_Internalname, GXutil.rtrim( A710PrdFind)) ;
         httpContext.changePostValue( edtPrdNomForm_Internalname, GXutil.rtrim( A13976PrdNomForm)) ;
         httpContext.changePostValue( edtProForDes_Internalname, GXutil.rtrim( A765ProForDes)) ;
         httpContext.changePostValue( edtProForCPo_Internalname, GXutil.ltrim( localUtil.ntoc( A6062ProForCPo, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtProForCan_Internalname, GXutil.ltrim( localUtil.ntoc( A762ProForCan, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtForPrdUMe_Internalname, h490ForPrdUMe) ;
         httpContext.changePostValue( edtavClaves_Internalname, AV41Claves) ;
         httpContext.changePostValue( edtavClavesdel_Internalname, AV45Clavesdel) ;
         httpContext.changePostValue( edtProForCla_Internalname, GXutil.rtrim( A763ProForCla)) ;
         httpContext.changePostValue( edtProForClv_Internalname, GXutil.rtrim( A5358ProForClv)) ;
         httpContext.changePostValue( edtProForNro_Internalname, GXutil.ltrim( localUtil.ntoc( A1645ProForNro, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtProForTnq_Internalname, GXutil.ltrim( localUtil.ntoc( A3379ProForTnq, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPrdMaxFind_Internalname, GXutil.rtrim( A717PrdMaxFind)) ;
         httpContext.changePostValue( "ZT_"+"Z767ProForLin_"+sGXsfl_125_idx, GXutil.ltrim( localUtil.ntoc( Z767ProForLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z6062ProForCPo_"+sGXsfl_125_idx, GXutil.ltrim( localUtil.ntoc( Z6062ProForCPo, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z13178ProForFT_"+sGXsfl_125_idx, GXutil.rtrim( Z13178ProForFT)) ;
         httpContext.changePostValue( "ZT_"+"Z765ProForDes_"+sGXsfl_125_idx, GXutil.rtrim( Z765ProForDes)) ;
         httpContext.changePostValue( "ZT_"+"Z770ProForPrd_"+sGXsfl_125_idx, GXutil.rtrim( Z770ProForPrd)) ;
         httpContext.changePostValue( "ZT_"+"Z13111ProForDe2_"+sGXsfl_125_idx, GXutil.rtrim( Z13111ProForDe2)) ;
         httpContext.changePostValue( "ZT_"+"Z762ProForCan_"+sGXsfl_125_idx, GXutil.ltrim( localUtil.ntoc( Z762ProForCan, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z1645ProForNro_"+sGXsfl_125_idx, GXutil.ltrim( localUtil.ntoc( Z1645ProForNro, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z3379ProForTnq_"+sGXsfl_125_idx, GXutil.ltrim( localUtil.ntoc( Z3379ProForTnq, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z763ProForCla_"+sGXsfl_125_idx, GXutil.rtrim( Z763ProForCla)) ;
         httpContext.changePostValue( "ZT_"+"Z5358ProForClv_"+sGXsfl_125_idx, GXutil.rtrim( Z5358ProForClv)) ;
         httpContext.changePostValue( "ZT_"+"Z490ForPrdUMe_"+sGXsfl_125_idx, GXutil.ltrim( localUtil.ntoc( Z490ForPrdUMe, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T762ProForCan_"+sGXsfl_125_idx, GXutil.ltrim( localUtil.ntoc( O762ProForCan, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T767ProForLin_"+sGXsfl_125_idx, GXutil.ltrim( localUtil.ntoc( O767ProForLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T490ForPrdUMe_"+sGXsfl_125_idx, GXutil.ltrim( localUtil.ntoc( O490ForPrdUMe, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T763ProForCla_"+sGXsfl_125_idx, GXutil.rtrim( O763ProForCla)) ;
         httpContext.changePostValue( "T5358ProForClv_"+sGXsfl_125_idx, GXutil.rtrim( O5358ProForClv)) ;
         httpContext.changePostValue( "nRcdDeleted_90_"+sGXsfl_125_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_90, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_90_"+sGXsfl_125_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_90, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_90_"+sGXsfl_125_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_90, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "N6062ProForCPo_"+sGXsfl_125_idx, GXutil.ltrim( localUtil.ntoc( A6062ProForCPo, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_90 != 0 )
         {
            httpContext.changePostValue( "PROFORLIN_"+sGXsfl_125_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProForLin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PROFORPRD_"+sGXsfl_125_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProForPrd_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRDFIND_"+sGXsfl_125_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdFind_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRDNOMFORM_"+sGXsfl_125_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdNomForm_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PROFORDES_"+sGXsfl_125_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProForDes_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PROFORCPO_"+sGXsfl_125_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProForCPo_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PROFORCPO_"+sGXsfl_125_idx+"Visible", GXutil.ltrim( localUtil.ntoc( edtProForCPo_Visible, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PROFORCAN_"+sGXsfl_125_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProForCan_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FORPRDUME_"+sGXsfl_125_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtForPrdUMe_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "vCLAVES_"+sGXsfl_125_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavClaves_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "vCLAVES_"+sGXsfl_125_idx+"Tooltiptext", GXutil.rtrim( edtavClaves_Tooltiptext)) ;
            httpContext.changePostValue( "vCLAVES_"+sGXsfl_125_idx+"Visible", GXutil.ltrim( localUtil.ntoc( edtavClaves_Visible, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "vCLAVESDEL_"+sGXsfl_125_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavClavesdel_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "vCLAVESDEL_"+sGXsfl_125_idx+"Tooltiptext", GXutil.rtrim( edtavClavesdel_Tooltiptext)) ;
            httpContext.changePostValue( "vCLAVESDEL_"+sGXsfl_125_idx+"Visible", GXutil.ltrim( localUtil.ntoc( edtavClavesdel_Visible, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PROFORCLA_"+sGXsfl_125_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProForCla_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PROFORCLV_"+sGXsfl_125_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProForClv_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PROFORCLV_"+sGXsfl_125_idx+"Visible", GXutil.ltrim( localUtil.ntoc( edtProForClv_Visible, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PROFORNRO_"+sGXsfl_125_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProForNro_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PROFORTNQ_"+sGXsfl_125_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProForTnq_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRDMAXFIND_"+sGXsfl_125_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdMaxFind_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption1RW0( )
   {
   }

   public void e111RW2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV9Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      procesosquimicos_trn_impl.this.GXt_char1 = GXv_char2[0] ;
      AV9Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9Station", AV9Station);
      GXv_char2[0] = AV12EmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char4[0] = AV8Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV9Station, GXv_char2, GXv_char3, GXv_char4) ;
      procesosquimicos_trn_impl.this.AV12EmprCod = GXv_char2[0] ;
      procesosquimicos_trn_impl.this.AV11EmprNom = GXv_char3[0] ;
      procesosquimicos_trn_impl.this.AV8Usurcod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12EmprCod", AV12EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprNom", AV11EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8Usurcod", AV8Usurcod);
      GXv_int5[0] = (byte)(AV36ObsPrf) ;
      new app.pexicon(remoteHandle, context).execute( AV12EmprCod, httpContext.getMessage( "OBSPRF", ""), GXv_int5) ;
      procesosquimicos_trn_impl.this.AV36ObsPrf = GXv_int5[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV36ObsPrf", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36ObsPrf), 4, 0));
      GXv_int5[0] = (byte)(AV37FlagLav) ;
      new app.pexicon(remoteHandle, context).execute( AV12EmprCod, httpContext.getMessage( "LAVAND", ""), GXv_int5) ;
      procesosquimicos_trn_impl.this.AV37FlagLav = GXv_int5[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV37FlagLav", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV37FlagLav), 4, 0));
      GXt_int6 = (byte)(AV13CdpPor) ;
      GXv_int5[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( AV12EmprCod, httpContext.getMessage( "%CDP", ""), GXv_int5) ;
      procesosquimicos_trn_impl.this.GXt_int6 = GXv_int5[0] ;
      AV13CdpPor = GXt_int6 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13CdpPor", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13CdpPor), 4, 0));
      GXt_int6 = (byte)(AV14Tecido) ;
      GXv_int5[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( AV12EmprCod, httpContext.getMessage( "TEJIDO", ""), GXv_int5) ;
      procesosquimicos_trn_impl.this.GXt_int6 = GXv_int5[0] ;
      AV14Tecido = GXt_int6 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14Tecido", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14Tecido), 4, 0));
      GXt_int6 = (byte)(AV15Lavado) ;
      GXv_int5[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( AV12EmprCod, httpContext.getMessage( "LAVADO", ""), GXv_int5) ;
      procesosquimicos_trn_impl.this.GXt_int6 = GXv_int5[0] ;
      AV15Lavado = GXt_int6 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15Lavado", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV15Lavado), 4, 0));
      GXt_int6 = (byte)(AV16Erfoc) ;
      GXv_int5[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( AV12EmprCod, httpContext.getMessage( "ERFOC", ""), GXv_int5) ;
      procesosquimicos_trn_impl.this.GXt_int6 = GXv_int5[0] ;
      AV16Erfoc = GXt_int6 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16Erfoc", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16Erfoc), 4, 0));
      GXt_int6 = (byte)(AV17Texfina) ;
      GXv_int5[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( AV12EmprCod, httpContext.getMessage( "TEXFNA", ""), GXv_int5) ;
      procesosquimicos_trn_impl.this.GXt_int6 = GXv_int5[0] ;
      AV17Texfina = GXt_int6 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17Texfina", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV17Texfina), 4, 0));
      GXt_int6 = (byte)(AV18Clave2) ;
      GXv_int5[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( AV12EmprCod, httpContext.getMessage( "CLAVE2", ""), GXv_int5) ;
      procesosquimicos_trn_impl.this.GXt_int6 = GXv_int5[0] ;
      AV18Clave2 = GXt_int6 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18Clave2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV18Clave2), 4, 0));
      GXt_int6 = (byte)(AV19NoVisible) ;
      GXv_int5[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( AV12EmprCod, httpContext.getMessage( "NOVISC", ""), GXv_int5) ;
      procesosquimicos_trn_impl.this.GXt_int6 = GXv_int5[0] ;
      AV19NoVisible = GXt_int6 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19NoVisible", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19NoVisible), 4, 0));
      GXt_int6 = (byte)(AV20Velta) ;
      GXv_int5[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( AV12EmprCod, httpContext.getMessage( "TINTTO", ""), GXv_int5) ;
      procesosquimicos_trn_impl.this.GXt_int6 = GXv_int5[0] ;
      AV20Velta = GXt_int6 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20Velta", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV20Velta), 4, 0));
      GXt_int6 = (byte)(AV21Filasur) ;
      GXv_int5[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( AV12EmprCod, httpContext.getMessage( "FILASU", ""), GXv_int5) ;
      procesosquimicos_trn_impl.this.GXt_int6 = GXv_int5[0] ;
      AV21Filasur = GXt_int6 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21Filasur", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV21Filasur), 4, 0));
      GXt_int6 = (byte)(AV22Pathter) ;
      GXv_int5[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( AV12EmprCod, httpContext.getMessage( "PATHTE", ""), GXv_int5) ;
      procesosquimicos_trn_impl.this.GXt_int6 = GXv_int5[0] ;
      AV22Pathter = GXt_int6 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV22Pathter", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV22Pathter), 4, 0));
      GXt_int6 = (byte)(AV23jpf) ;
      GXv_int5[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( AV12EmprCod, httpContext.getMessage( "JPF", ""), GXv_int5) ;
      procesosquimicos_trn_impl.this.GXt_int6 = GXv_int5[0] ;
      AV23jpf = GXt_int6 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV23jpf", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV23jpf), 4, 0));
      GXt_int6 = (byte)(AV24Orient) ;
      GXv_int5[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( AV12EmprCod, httpContext.getMessage( "TORIEN", ""), GXv_int5) ;
      procesosquimicos_trn_impl.this.GXt_int6 = GXv_int5[0] ;
      AV24Orient = GXt_int6 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV24Orient", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV24Orient), 4, 0));
      GXt_int6 = (byte)(AV25tintutex) ;
      GXv_int5[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( AV12EmprCod, httpContext.getMessage( "TINTUT", ""), GXv_int5) ;
      procesosquimicos_trn_impl.this.GXt_int6 = GXv_int5[0] ;
      AV25tintutex = GXt_int6 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV25tintutex", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV25tintutex), 4, 0));
      GXt_int6 = (byte)(AV26TiposTecnologias) ;
      GXv_int5[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( AV12EmprCod, httpContext.getMessage( "TIETEC", ""), GXv_int5) ;
      procesosquimicos_trn_impl.this.GXt_int6 = GXv_int5[0] ;
      AV26TiposTecnologias = GXt_int6 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV26TiposTecnologias", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV26TiposTecnologias), 4, 0));
      AV27Fabs = (short)(100) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV27Fabs", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV27Fabs), 4, 0));
      AV54Op = " " ;
      httpContext.ajax_rsp_assign_attri("", false, "AV54Op", AV54Op);
      GXt_char1 = AV28msg0 ;
      GXv_char4[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WMSG088_", ""), (byte)(99), GXv_char4) ;
      procesosquimicos_trn_impl.this.GXt_char1 = GXv_char4[0] ;
      AV28msg0 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV28msg0", AV28msg0);
      GXt_char1 = AV29Msg1 ;
      GXv_char4[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WMSG168_", ""), (byte)(99), GXv_char4) ;
      procesosquimicos_trn_impl.this.GXt_char1 = GXv_char4[0] ;
      AV29Msg1 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV29Msg1", AV29Msg1);
      AV29Msg1 = GXutil.trim( AV29Msg1) + httpContext.getMessage( " Item Proceso Lab", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV29Msg1", AV29Msg1);
      GXt_char1 = AV9Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      procesosquimicos_trn_impl.this.GXt_char1 = GXv_char4[0] ;
      AV9Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9Station", AV9Station);
      GXv_char4[0] = AV12EmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char2[0] = AV8Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV9Station, GXv_char4, GXv_char3, GXv_char2) ;
      procesosquimicos_trn_impl.this.AV12EmprCod = GXv_char4[0] ;
      procesosquimicos_trn_impl.this.AV11EmprNom = GXv_char3[0] ;
      procesosquimicos_trn_impl.this.AV8Usurcod = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12EmprCod", AV12EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprNom", AV11EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8Usurcod", AV8Usurcod);
      GXv_SdtWWPContext7[0] = AV33WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext7) ;
      AV33WWPContext = GXv_SdtWWPContext7[0] ;
      edtProForLab_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProForLab_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForLab_Visible), 5, 0), true);
      AV50ComboProForLab = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV50ComboProForLab", AV50ComboProForLab);
      edtavComboproforlab_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavComboproforlab_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavComboproforlab_Visible), 5, 0), true);
      /* Execute user subroutine: 'LOADCOMBOPROFORLAB' */
      S112 ();
      if ( returnInSub )
      {
         pr_default.close(8);
         pr_default.close(7);
         pr_default.close(5);
         pr_default.close(4);
         pr_default.close(3);
         pr_default.close(2);
         pr_default.close(1);
         returnInSub = true;
         if (true) return;
      }
      /* Execute user subroutine: 'ATTRIBUTESSECURITYCODE' */
      S122 ();
      if ( returnInSub )
      {
         pr_default.close(8);
         pr_default.close(7);
         pr_default.close(5);
         pr_default.close(4);
         pr_default.close(3);
         pr_default.close(2);
         pr_default.close(1);
         returnInSub = true;
         if (true) return;
      }
      AV34TrnContext.fromxml(AV35WebSession.getValue("TrnContext"), null, null);
      edtProForCCi_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProForCCi_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForCCi_Visible), 5, 0), true);
      edtProForDCi_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProForDCi_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForDCi_Visible), 5, 0), true);
      edtProForMer_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProForMer_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForMer_Visible), 5, 0), true);
      edtProFDsc_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProFDsc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProFDsc_Visible), 5, 0), true);
      edtProForCodV_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProForCodV_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForCodV_Visible), 5, 0), true);
      edtEmprCodV2_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCodV2_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCodV2_Visible), 5, 0), true);
      edtEmprCod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Visible), 5, 0), true);
      edtEmprNom_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Visible), 5, 0), true);
      edtPorForFul_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPorForFul_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPorForFul_Visible), 5, 0), true);
      Gridlevel_procesosquimicoslineas_titlescategories_Gridinternalname = subGridlevel_procesosquimicoslineas_Internalname ;
      ucGridlevel_procesosquimicoslineas_titlescategories.sendProperty(context, "", false, Gridlevel_procesosquimicoslineas_titlescategories_Internalname, "GridInternalName", Gridlevel_procesosquimicoslineas_titlescategories_Gridinternalname);
      edtavClaves_gximage = "ActionInsert" ;
      httpContext.ajax_rsp_assign_prop("", false, edtavClaves_Internalname, "gximage", edtavClaves_gximage, !bGXsfl_125_Refreshing);
      AV41Claves = context.getHttpContext().getImagePath( "5649fbb8-8ce0-4810-a5ce-bd649ea83c3a", "", context.getHttpContext().getTheme( )) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavClaves_Internalname, "Bitmap", ((GXutil.strcmp("", AV41Claves)==0) ? AV55Claves_GXI : httpContext.convertURL( httpContext.getResourceRelative(AV41Claves))), !bGXsfl_125_Refreshing);
      httpContext.ajax_rsp_assign_prop("", false, edtavClaves_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( AV41Claves), true);
      AV55Claves_GXI = GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "5649fbb8-8ce0-4810-a5ce-bd649ea83c3a", "", context.getHttpContext().getTheme( )), context.getHttpContext()) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavClaves_Internalname, "Bitmap", ((GXutil.strcmp("", AV41Claves)==0) ? AV55Claves_GXI : httpContext.convertURL( httpContext.getResourceRelative(AV41Claves))), !bGXsfl_125_Refreshing);
      httpContext.ajax_rsp_assign_prop("", false, edtavClaves_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( AV41Claves), true);
      edtavClavesdel_gximage = "ActionDelete" ;
      httpContext.ajax_rsp_assign_prop("", false, edtavClavesdel_Internalname, "gximage", edtavClavesdel_gximage, !bGXsfl_125_Refreshing);
      AV45Clavesdel = context.getHttpContext().getImagePath( "7695fe89-52c9-4b7e-871e-0e11548f823e", "", context.getHttpContext().getTheme( )) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavClavesdel_Internalname, "Bitmap", ((GXutil.strcmp("", AV45Clavesdel)==0) ? AV56Clavesdel_GXI : httpContext.convertURL( httpContext.getResourceRelative(AV45Clavesdel))), !bGXsfl_125_Refreshing);
      httpContext.ajax_rsp_assign_prop("", false, edtavClavesdel_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( AV45Clavesdel), true);
      AV56Clavesdel_GXI = GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "7695fe89-52c9-4b7e-871e-0e11548f823e", "", context.getHttpContext().getTheme( )), context.getHttpContext()) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavClavesdel_Internalname, "Bitmap", ((GXutil.strcmp("", AV45Clavesdel)==0) ? AV56Clavesdel_GXI : httpContext.convertURL( httpContext.getResourceRelative(AV45Clavesdel))), !bGXsfl_125_Refreshing);
      httpContext.ajax_rsp_assign_prop("", false, edtavClavesdel_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( AV45Clavesdel), true);
      edtavClaves_Tooltiptext = httpContext.getMessage( "Agregar clave", "") ;
      httpContext.ajax_rsp_assign_prop("", false, edtavClaves_Internalname, "Tooltiptext", edtavClaves_Tooltiptext, !bGXsfl_125_Refreshing);
      edtavClavesdel_Tooltiptext = httpContext.getMessage( "Anular clave", "") ;
      httpContext.ajax_rsp_assign_prop("", false, edtavClavesdel_Internalname, "Tooltiptext", edtavClavesdel_Tooltiptext, !bGXsfl_125_Refreshing);
      edtavClaves_Enabled = (((GXutil.strcmp(Gx_mode, "DSP")==0) ? false : true) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavClaves_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavClaves_Enabled), 5, 0), !bGXsfl_125_Refreshing);
      edtavClavesdel_Enabled = (((GXutil.strcmp(Gx_mode, "DSP")==0) ? false : true) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavClavesdel_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavClavesdel_Enabled), 5, 0), !bGXsfl_125_Refreshing);
   }

   public void e121RW2( )
   {
      /* After Trn Routine */
      returnInSub = false ;
      if ( ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) && ! AV34TrnContext.getgxTv_SdtWWPTransactionContext_Callerondelete() )
      {
         callWebObject(formatLink("app.formulaciontinte.procesosquimicos_trnww", new String[] {}, new String[] {}) );
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
      httpContext.setWebReturnParms(new Object[] {});
      httpContext.setWebReturnParmsMetadata(new Object[] {});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      pr_default.close(8);
      pr_default.close(7);
      pr_default.close(5);
      pr_default.close(4);
      pr_default.close(3);
      pr_default.close(2);
      pr_default.close(1);
      returnInSub = true;
      if (true) return;
   }

   public void S122( )
   {
      /* 'ATTRIBUTESSECURITYCODE' Routine */
      returnInSub = false ;
      edtProForPau_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProForPau_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForPau_Visible), 5, 0), true);
      divProforpau_cell_Class = "Invisible" ;
      httpContext.ajax_rsp_assign_prop("", false, divProforpau_cell_Internalname, "Class", divProforpau_cell_Class, true);
      edtProForAbs_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProForAbs_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForAbs_Visible), 5, 0), true);
      divProforabs_cell_Class = "Invisible" ;
      httpContext.ajax_rsp_assign_prop("", false, divProforabs_cell_Internalname, "Class", divProforabs_cell_Class, true);
      edtProForCos_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProForCos_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForCos_Visible), 5, 0), true);
      divProforcos_cell_Class = "Invisible" ;
      httpContext.ajax_rsp_assign_prop("", false, divProforcos_cell_Internalname, "Class", divProforcos_cell_Class, true);
      edtProforVl_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProforVl_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProforVl_Visible), 5, 0), true);
      divProforvl_cell_Class = "Invisible" ;
      httpContext.ajax_rsp_assign_prop("", false, divProforvl_cell_Internalname, "Class", divProforvl_cell_Class, true);
      edtProH2O_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProH2O_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProH2O_Visible), 5, 0), true);
      divProh2o_cell_Class = "Invisible" ;
      httpContext.ajax_rsp_assign_prop("", false, divProh2o_cell_Internalname, "Class", divProh2o_cell_Class, true);
      edtProForRs_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProForRs_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForRs_Visible), 5, 0), true);
      divProforrs_cell_Class = "Invisible" ;
      httpContext.ajax_rsp_assign_prop("", false, divProforrs_cell_Internalname, "Class", divProforrs_cell_Class, true);
   }

   public void S112( )
   {
      /* 'LOADCOMBOPROFORLAB' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTComboData_Item8 = AV48ProForLab_Data ;
      GXv_char4[0] = AV49ComboSelectedValue ;
      GXv_objcol_SdtDVB_SDTComboData_Item9[0] = GXt_objcol_SdtDVB_SDTComboData_Item8 ;
      new app.formulaciontinte.procesosquimicos_trnloaddvcombo(remoteHandle, context).execute( "ProForLab", Gx_mode, AV12EmprCod, AV32ProForCod, GXv_char4, GXv_objcol_SdtDVB_SDTComboData_Item9) ;
      procesosquimicos_trn_impl.this.AV49ComboSelectedValue = GXv_char4[0] ;
      GXt_objcol_SdtDVB_SDTComboData_Item8 = GXv_objcol_SdtDVB_SDTComboData_Item9[0] ;
      AV48ProForLab_Data = GXt_objcol_SdtDVB_SDTComboData_Item8 ;
      Combo_proforlab_Selectedvalue_set = AV49ComboSelectedValue ;
      ucCombo_proforlab.sendProperty(context, "", false, Combo_proforlab_Internalname, "SelectedValue_set", Combo_proforlab_Selectedvalue_set);
      AV50ComboProForLab = AV49ComboSelectedValue ;
      httpContext.ajax_rsp_assign_attri("", false, "AV50ComboProForLab", AV50ComboProForLab);
      if ( ( GXutil.strcmp(Gx_mode, "DSP") == 0 ) || ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) )
      {
         Combo_proforlab_Enabled = false ;
         ucCombo_proforlab.sendProperty(context, "", false, Combo_proforlab_Internalname, "Enabled", GXutil.booltostr( Combo_proforlab_Enabled));
      }
   }

   public void e131RW2( )
   {
      /* Claves_Click Routine */
      returnInSub = false ;
      if ( ( A767ProForLin > 0 ) && ! (GXutil.strcmp("", A770ProForPrd)==0) )
      {
         GXv_char4[0] = AV12EmprCod ;
         GXv_char3[0] = A764ProForCod ;
         GXv_int10[0] = A767ProForLin ;
         GXv_char2[0] = AV51Proforprd ;
         new app.formulaciontinte.procesoquimico_lineaanterior(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_int10, GXv_char2) ;
         procesosquimicos_trn_impl.this.AV12EmprCod = GXv_char4[0] ;
         procesosquimicos_trn_impl.this.A764ProForCod = GXv_char3[0] ;
         procesosquimicos_trn_impl.this.A767ProForLin = GXv_int10[0] ;
         procesosquimicos_trn_impl.this.AV51Proforprd = GXv_char2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV12EmprCod", AV12EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A764ProForCod", A764ProForCod);
         httpContext.popup(formatLink("app.formulaciontinte.procesosquimicos_claves_wp", new String[] {GXutil.URLEncode(GXutil.rtrim(AV12EmprCod)),GXutil.URLEncode(GXutil.rtrim(A764ProForCod)),GXutil.URLEncode(GXutil.rtrim(A766ProForDsc)),GXutil.URLEncode(GXutil.rtrim("")),GXutil.URLEncode(GXutil.rtrim("")),GXutil.URLEncode(GXutil.rtrim(AV51Proforprd)),GXutil.URLEncode(GXutil.ltrimstr(A773ProForUli,4,0))}, new String[] {"Emprcod","Proforcod","Profordsc","ProForCla","ProForClv","Producto","UltimaLinea"}) , new Object[] {"AV12EmprCod","A764ProForCod","A766ProForDsc","A763ProForCla","A5358ProForClv","AV51Proforprd","A773ProForUli"});
         GX_FocusControl = edtProForCan_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         httpContext.doAjaxSetFocus(GX_FocusControl);
      }
      else
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "NO ha introducido Linea o NO es un producto¡", ""));
      }
      /*  Sending Event outputs  */
   }

   public void zm1RW89( int GX_JID )
   {
      if ( ( GX_JID == 62 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z6061ProForLab = T01RW16_A6061ProForLab[0] ;
            Z766ProForDsc = T01RW16_A766ProForDsc[0] ;
            Z4715ProForDsc2 = T01RW16_A4715ProForDsc2[0] ;
            Z771ProForTie = T01RW16_A771ProForTie[0] ;
            Z772ProForTmx = T01RW16_A772ProForTmx[0] ;
            Z769ProForMat = T01RW16_A769ProForMat[0] ;
            Z674PorForFul = T01RW16_A674PorForFul[0] ;
            Z773ProForUli = T01RW16_A773ProForUli[0] ;
            Z2392ProNumPro = T01RW16_A2392ProNumPro[0] ;
            Z2393ProNumRec = T01RW16_A2393ProNumRec[0] ;
            Z3005ProRev = T01RW16_A3005ProRev[0] ;
            Z4705ProForPau = T01RW16_A4705ProForPau[0] ;
            Z4706ProForRb = T01RW16_A4706ProForRb[0] ;
            Z4864ProForCCi = T01RW16_A4864ProForCCi[0] ;
            Z4865ProForDCi = T01RW16_A4865ProForDCi[0] ;
            Z5523ProForTip = T01RW16_A5523ProForTip[0] ;
            Z8527ProForAbs = T01RW16_A8527ProForAbs[0] ;
            Z8528ProForCos = T01RW16_A8528ProForCos[0] ;
            Z10120ProforVl = T01RW16_A10120ProforVl[0] ;
            Z10547ProH2O = T01RW16_A10547ProH2O[0] ;
            Z3589ProForMer = T01RW16_A3589ProForMer[0] ;
            Z13133ProForAct = T01RW16_A13133ProForAct[0] ;
            Z13936ProForRs = T01RW16_A13936ProForRs[0] ;
         }
         else
         {
            Z6061ProForLab = A6061ProForLab ;
            Z766ProForDsc = A766ProForDsc ;
            Z4715ProForDsc2 = A4715ProForDsc2 ;
            Z771ProForTie = A771ProForTie ;
            Z772ProForTmx = A772ProForTmx ;
            Z769ProForMat = A769ProForMat ;
            Z674PorForFul = A674PorForFul ;
            Z773ProForUli = A773ProForUli ;
            Z2392ProNumPro = A2392ProNumPro ;
            Z2393ProNumRec = A2393ProNumRec ;
            Z3005ProRev = A3005ProRev ;
            Z4705ProForPau = A4705ProForPau ;
            Z4706ProForRb = A4706ProForRb ;
            Z4864ProForCCi = A4864ProForCCi ;
            Z4865ProForDCi = A4865ProForDCi ;
            Z5523ProForTip = A5523ProForTip ;
            Z8527ProForAbs = A8527ProForAbs ;
            Z8528ProForCos = A8528ProForCos ;
            Z10120ProforVl = A10120ProforVl ;
            Z10547ProH2O = A10547ProH2O ;
            Z3589ProForMer = A3589ProForMer ;
            Z13133ProForAct = A13133ProForAct ;
            Z13936ProForRs = A13936ProForRs ;
         }
      }
      if ( GX_JID == -62 )
      {
         Z764ProForCod = A764ProForCod ;
         Z6061ProForLab = A6061ProForLab ;
         Z766ProForDsc = A766ProForDsc ;
         Z4715ProForDsc2 = A4715ProForDsc2 ;
         Z771ProForTie = A771ProForTie ;
         Z772ProForTmx = A772ProForTmx ;
         Z769ProForMat = A769ProForMat ;
         Z674PorForFul = A674PorForFul ;
         Z773ProForUli = A773ProForUli ;
         Z2392ProNumPro = A2392ProNumPro ;
         Z2393ProNumRec = A2393ProNumRec ;
         Z3005ProRev = A3005ProRev ;
         Z4705ProForPau = A4705ProForPau ;
         Z4706ProForRb = A4706ProForRb ;
         Z4864ProForCCi = A4864ProForCCi ;
         Z4865ProForDCi = A4865ProForDCi ;
         Z5523ProForTip = A5523ProForTip ;
         Z8527ProForAbs = A8527ProForAbs ;
         Z8528ProForCos = A8528ProForCos ;
         Z10120ProforVl = A10120ProforVl ;
         Z10547ProH2O = A10547ProH2O ;
         Z3589ProForMer = A3589ProForMer ;
         Z13133ProForAct = A13133ProForAct ;
         Z13936ProForRs = A13936ProForRs ;
         Z396EmprCod = A396EmprCod ;
         Z407EmprNom = A407EmprNom ;
      }
   }

   public void standaloneNotModal( )
   {
      AV53Pgmname = "FormulacionTinte.ProcesosQuimicos_TRN" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV53Pgmname", AV53Pgmname);
      Gx_BScreen = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      bttBtntrn_delete_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtntrn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_delete_Enabled), 5, 0), true);
      if ( ! (GXutil.strcmp("", AV12EmprCod)==0) )
      {
         A396EmprCod = AV12EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      }
      if ( ! (GXutil.strcmp("", AV12EmprCod)==0) )
      {
         edtEmprCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      }
      else
      {
         edtEmprCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      }
      if ( ! (GXutil.strcmp("", AV12EmprCod)==0) )
      {
         edtEmprCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      }
      if ( ! (GXutil.strcmp("", AV32ProForCod)==0) )
      {
         A764ProForCod = AV32ProForCod ;
         n764ProForCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A764ProForCod", A764ProForCod);
      }
      if ( ! (GXutil.strcmp("", AV32ProForCod)==0) )
      {
         edtProForCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtProForCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForCod_Enabled), 5, 0), true);
      }
      else
      {
         edtProForCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtProForCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForCod_Enabled), 5, 0), true);
      }
      if ( ! (GXutil.strcmp("", AV32ProForCod)==0) )
      {
         edtProForCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtProForCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForCod_Enabled), 5, 0), true);
      }
   }

   public void standaloneModal( )
   {
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
      if ( isIns( )  && (GXutil.strcmp("", A13133ProForAct)==0) && ( Gx_BScreen == 0 ) )
      {
         A13133ProForAct = httpContext.getMessage( httpContext.getMessage( "S", ""), "") ;
         httpContext.ajax_rsp_assign_attri("", false, "A13133ProForAct", A13133ProForAct);
      }
      if ( isIns( )  && (GXutil.strcmp("", A3005ProRev)==0) && ( Gx_BScreen == 0 ) )
      {
         A3005ProRev = httpContext.getMessage( httpContext.getMessage( "N", ""), "") ;
         httpContext.ajax_rsp_assign_attri("", false, "A3005ProRev", A3005ProRev);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ( Gx_BScreen == 0 ) )
      {
         /* Using cursor T01RW17 */
         pr_default.execute(8, new Object[] {A396EmprCod});
         A407EmprNom = T01RW17_A407EmprNom[0] ;
         n407EmprNom = T01RW17_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         pr_default.close(8);
         A941EmprCodV2 = A396EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A941EmprCodV2", A941EmprCodV2);
         GXt_int6 = (byte)(0) ;
         GXv_int5[0] = GXt_int6 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "%CDP", ""), ""), GXv_int5) ;
         procesosquimicos_trn_impl.this.GXt_int6 = GXv_int5[0] ;
         edtProForCPo_Visible = ((GXt_int6==1) ? 1 : 0) ;
         httpContext.ajax_rsp_assign_prop("", false, edtProForCPo_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForCPo_Visible), 5, 0), !bGXsfl_125_Refreshing);
         GXt_int6 = (byte)(0) ;
         GXv_int5[0] = GXt_int6 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "CLAVE2", ""), ""), GXv_int5) ;
         procesosquimicos_trn_impl.this.GXt_int6 = GXv_int5[0] ;
         edtProForClv_Visible = ((GXt_int6==1) ? 1 : 0) ;
         httpContext.ajax_rsp_assign_prop("", false, edtProForClv_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForClv_Visible), 5, 0), !bGXsfl_125_Refreshing);
         GXt_int6 = (byte)(0) ;
         GXv_int5[0] = GXt_int6 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "LAVAND", ""), ""), GXv_int5) ;
         procesosquimicos_trn_impl.this.GXt_int6 = GXv_int5[0] ;
         edtProForPau_Visible = ((GXt_int6==1) ? 1 : 0) ;
         httpContext.ajax_rsp_assign_prop("", false, edtProForPau_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForPau_Visible), 5, 0), true);
         GXt_int6 = (byte)(0) ;
         GXv_int5[0] = GXt_int6 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "LAVAND", ""), ""), GXv_int5) ;
         procesosquimicos_trn_impl.this.GXt_int6 = GXv_int5[0] ;
         if ( ! ( ( GXt_int6 == 1 ) ) )
         {
            divProforpau_cell_Class = httpContext.getMessage( "Invisible", "") ;
            httpContext.ajax_rsp_assign_prop("", false, divProforpau_cell_Internalname, "Class", divProforpau_cell_Class, true);
         }
         else
         {
            GXt_int6 = (byte)(0) ;
            GXv_int5[0] = GXt_int6 ;
            new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "LAVAND", ""), ""), GXv_int5) ;
            procesosquimicos_trn_impl.this.GXt_int6 = GXv_int5[0] ;
            if ( GXt_int6 == 1 )
            {
               divProforpau_cell_Class = httpContext.getMessage( "col-xs-12 col-sm-4 DataContentCell", "") ;
               httpContext.ajax_rsp_assign_prop("", false, divProforpau_cell_Internalname, "Class", divProforpau_cell_Class, true);
            }
         }
         GXt_int6 = (byte)(0) ;
         GXv_int5[0] = GXt_int6 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "TINTTO", ""), ""), GXv_int5) ;
         procesosquimicos_trn_impl.this.GXt_int6 = GXv_int5[0] ;
         edtProForAbs_Visible = ((GXt_int6==1) ? 1 : 0) ;
         httpContext.ajax_rsp_assign_prop("", false, edtProForAbs_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForAbs_Visible), 5, 0), true);
         GXt_int6 = (byte)(0) ;
         GXv_int5[0] = GXt_int6 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "TINTTO", ""), ""), GXv_int5) ;
         procesosquimicos_trn_impl.this.GXt_int6 = GXv_int5[0] ;
         if ( ! ( ( GXt_int6 == 1 ) ) )
         {
            divProforabs_cell_Class = httpContext.getMessage( "Invisible", "") ;
            httpContext.ajax_rsp_assign_prop("", false, divProforabs_cell_Internalname, "Class", divProforabs_cell_Class, true);
         }
         else
         {
            GXt_int6 = (byte)(0) ;
            GXv_int5[0] = GXt_int6 ;
            new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "TINTTO", ""), ""), GXv_int5) ;
            procesosquimicos_trn_impl.this.GXt_int6 = GXv_int5[0] ;
            if ( GXt_int6 == 1 )
            {
               divProforabs_cell_Class = httpContext.getMessage( "col-xs-12 col-sm-3 DataContentCell", "") ;
               httpContext.ajax_rsp_assign_prop("", false, divProforabs_cell_Internalname, "Class", divProforabs_cell_Class, true);
            }
         }
         GXt_int6 = (byte)(0) ;
         GXv_int5[0] = GXt_int6 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "TINTTO", ""), ""), GXv_int5) ;
         procesosquimicos_trn_impl.this.GXt_int6 = GXv_int5[0] ;
         edtProForCos_Visible = ((GXt_int6==1) ? 1 : 0) ;
         httpContext.ajax_rsp_assign_prop("", false, edtProForCos_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForCos_Visible), 5, 0), true);
         GXt_int6 = (byte)(0) ;
         GXv_int5[0] = GXt_int6 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "TINTTO", ""), ""), GXv_int5) ;
         procesosquimicos_trn_impl.this.GXt_int6 = GXv_int5[0] ;
         if ( ! ( ( GXt_int6 == 1 ) ) )
         {
            divProforcos_cell_Class = httpContext.getMessage( "Invisible", "") ;
            httpContext.ajax_rsp_assign_prop("", false, divProforcos_cell_Internalname, "Class", divProforcos_cell_Class, true);
         }
         else
         {
            GXt_int6 = (byte)(0) ;
            GXv_int5[0] = GXt_int6 ;
            new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "TINTTO", ""), ""), GXv_int5) ;
            procesosquimicos_trn_impl.this.GXt_int6 = GXv_int5[0] ;
            if ( GXt_int6 == 1 )
            {
               divProforcos_cell_Class = httpContext.getMessage( "col-xs-12 col-sm-2 DataContentCell", "") ;
               httpContext.ajax_rsp_assign_prop("", false, divProforcos_cell_Internalname, "Class", divProforcos_cell_Class, true);
            }
         }
         GXt_int6 = (byte)(0) ;
         GXv_int5[0] = GXt_int6 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "TEJIDO", ""), ""), GXv_int5) ;
         procesosquimicos_trn_impl.this.GXt_int6 = GXv_int5[0] ;
         GXt_int11 = (byte)(0) ;
         GXv_int12[0] = GXt_int11 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "LAVADO", ""), ""), GXv_int12) ;
         procesosquimicos_trn_impl.this.GXt_int11 = GXv_int12[0] ;
         edtProforVl_Visible = ((GXt_int6==1)||(GXt_int11==1) ? 1 : 0) ;
         httpContext.ajax_rsp_assign_prop("", false, edtProforVl_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProforVl_Visible), 5, 0), true);
         GXt_int11 = (byte)(0) ;
         GXv_int12[0] = GXt_int11 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "TEJIDO", ""), ""), GXv_int12) ;
         procesosquimicos_trn_impl.this.GXt_int11 = GXv_int12[0] ;
         GXt_int6 = (byte)(0) ;
         GXv_int5[0] = GXt_int6 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "LAVADO", ""), ""), GXv_int5) ;
         procesosquimicos_trn_impl.this.GXt_int6 = GXv_int5[0] ;
         if ( ! ( ( GXt_int11 == 1 ) || ( GXt_int6 == 1 ) ) )
         {
            divProforvl_cell_Class = httpContext.getMessage( "Invisible", "") ;
            httpContext.ajax_rsp_assign_prop("", false, divProforvl_cell_Internalname, "Class", divProforvl_cell_Class, true);
         }
         else
         {
            GXt_int11 = (byte)(0) ;
            GXv_int12[0] = GXt_int11 ;
            new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "TEJIDO", ""), ""), GXv_int12) ;
            procesosquimicos_trn_impl.this.GXt_int11 = GXv_int12[0] ;
            GXt_int6 = (byte)(0) ;
            GXv_int5[0] = GXt_int6 ;
            new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "LAVADO", ""), ""), GXv_int5) ;
            procesosquimicos_trn_impl.this.GXt_int6 = GXv_int5[0] ;
            if ( ( GXt_int11 == 1 ) || ( GXt_int6 == 1 ) )
            {
               divProforvl_cell_Class = httpContext.getMessage( "col-xs-12 col-sm-2 DataContentCell", "") ;
               httpContext.ajax_rsp_assign_prop("", false, divProforvl_cell_Internalname, "Class", divProforvl_cell_Class, true);
            }
         }
         GXt_int11 = (byte)(0) ;
         GXv_int12[0] = GXt_int11 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "JPF", ""), ""), GXv_int12) ;
         procesosquimicos_trn_impl.this.GXt_int11 = GXv_int12[0] ;
         edtProH2O_Visible = ((GXt_int11==1) ? 1 : 0) ;
         httpContext.ajax_rsp_assign_prop("", false, edtProH2O_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProH2O_Visible), 5, 0), true);
         GXt_int11 = (byte)(0) ;
         GXv_int12[0] = GXt_int11 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "JPF", ""), ""), GXv_int12) ;
         procesosquimicos_trn_impl.this.GXt_int11 = GXv_int12[0] ;
         if ( ! ( ( GXt_int11 == 1 ) ) )
         {
            divProh2o_cell_Class = httpContext.getMessage( "Invisible", "") ;
            httpContext.ajax_rsp_assign_prop("", false, divProh2o_cell_Internalname, "Class", divProh2o_cell_Class, true);
         }
         else
         {
            GXt_int11 = (byte)(0) ;
            GXv_int12[0] = GXt_int11 ;
            new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "JPF", ""), ""), GXv_int12) ;
            procesosquimicos_trn_impl.this.GXt_int11 = GXv_int12[0] ;
            if ( GXt_int11 == 1 )
            {
               divProh2o_cell_Class = httpContext.getMessage( "col-xs-12 col-sm-2 DataContentCell", "") ;
               httpContext.ajax_rsp_assign_prop("", false, divProh2o_cell_Internalname, "Class", divProh2o_cell_Class, true);
            }
         }
         GXt_int11 = (byte)(0) ;
         GXv_int12[0] = GXt_int11 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "AC2013", ""), ""), GXv_int12) ;
         procesosquimicos_trn_impl.this.GXt_int11 = GXv_int12[0] ;
         edtProForRs_Visible = ((GXt_int11==1) ? 1 : 0) ;
         httpContext.ajax_rsp_assign_prop("", false, edtProForRs_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForRs_Visible), 5, 0), true);
         GXt_int11 = (byte)(0) ;
         GXv_int12[0] = GXt_int11 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "AC2013", ""), ""), GXv_int12) ;
         procesosquimicos_trn_impl.this.GXt_int11 = GXv_int12[0] ;
         if ( ! ( ( GXt_int11 == 1 ) ) )
         {
            divProforrs_cell_Class = httpContext.getMessage( "Invisible", "") ;
            httpContext.ajax_rsp_assign_prop("", false, divProforrs_cell_Internalname, "Class", divProforrs_cell_Class, true);
         }
         else
         {
            GXt_int11 = (byte)(0) ;
            GXv_int12[0] = GXt_int11 ;
            new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "AC2013", ""), ""), GXv_int12) ;
            procesosquimicos_trn_impl.this.GXt_int11 = GXv_int12[0] ;
            if ( GXt_int11 == 1 )
            {
               divProforrs_cell_Class = httpContext.getMessage( "col-xs-12 col-sm-2 DataContentCell", "") ;
               httpContext.ajax_rsp_assign_prop("", false, divProforrs_cell_Internalname, "Class", divProforrs_cell_Class, true);
            }
         }
         A920ProForCodV = A764ProForCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A920ProForCodV", A920ProForCodV);
      }
   }

   public void load1RW89( )
   {
      /* Using cursor T01RW18 */
      pr_default.execute(9, new Object[] {A396EmprCod, Boolean.valueOf(n764ProForCod), A764ProForCod});
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound89 = (short)(1) ;
         A6061ProForLab = T01RW18_A6061ProForLab[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6061ProForLab", A6061ProForLab);
         A407EmprNom = T01RW18_A407EmprNom[0] ;
         n407EmprNom = T01RW18_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A766ProForDsc = T01RW18_A766ProForDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A766ProForDsc", A766ProForDsc);
         A4715ProForDsc2 = T01RW18_A4715ProForDsc2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4715ProForDsc2", A4715ProForDsc2);
         A771ProForTie = T01RW18_A771ProForTie[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A771ProForTie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A771ProForTie), 4, 0));
         A772ProForTmx = T01RW18_A772ProForTmx[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A772ProForTmx", GXutil.ltrimstr( DecimalUtil.doubleToDec(A772ProForTmx), 4, 0));
         A769ProForMat = T01RW18_A769ProForMat[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A769ProForMat", A769ProForMat);
         A674PorForFul = T01RW18_A674PorForFul[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A674PorForFul", localUtil.format(A674PorForFul, "99/99/99"));
         A773ProForUli = T01RW18_A773ProForUli[0] ;
         A2392ProNumPro = T01RW18_A2392ProNumPro[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2392ProNumPro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2392ProNumPro), 5, 0));
         A2393ProNumRec = T01RW18_A2393ProNumRec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2393ProNumRec", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2393ProNumRec), 5, 0));
         A3005ProRev = T01RW18_A3005ProRev[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3005ProRev", A3005ProRev);
         A4705ProForPau = T01RW18_A4705ProForPau[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4705ProForPau", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4705ProForPau), 4, 0));
         A4706ProForRb = T01RW18_A4706ProForRb[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4706ProForRb", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4706ProForRb), 4, 0));
         A4864ProForCCi = T01RW18_A4864ProForCCi[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4864ProForCCi", A4864ProForCCi);
         A4865ProForDCi = T01RW18_A4865ProForDCi[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4865ProForDCi", A4865ProForDCi);
         A5523ProForTip = T01RW18_A5523ProForTip[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5523ProForTip", A5523ProForTip);
         A8527ProForAbs = T01RW18_A8527ProForAbs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8527ProForAbs", GXutil.ltrimstr( A8527ProForAbs, 6, 2));
         A8528ProForCos = T01RW18_A8528ProForCos[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8528ProForCos", GXutil.ltrimstr( A8528ProForCos, 8, 4));
         A10120ProforVl = T01RW18_A10120ProforVl[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10120ProforVl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10120ProforVl), 5, 0));
         A10547ProH2O = T01RW18_A10547ProH2O[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10547ProH2O", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10547ProH2O), 4, 0));
         A3589ProForMer = T01RW18_A3589ProForMer[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3589ProForMer", GXutil.ltrimstr( A3589ProForMer, 6, 2));
         A13133ProForAct = T01RW18_A13133ProForAct[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13133ProForAct", A13133ProForAct);
         A13936ProForRs = T01RW18_A13936ProForRs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13936ProForRs", A13936ProForRs);
         zm1RW89( -62) ;
      }
      pr_default.close(9);
      onLoadActions1RW89( ) ;
   }

   public void onLoadActions1RW89( )
   {
      A941EmprCodV2 = A396EmprCod ;
      httpContext.ajax_rsp_assign_attri("", false, "A941EmprCodV2", A941EmprCodV2);
      GXt_int11 = (byte)(0) ;
      GXv_int12[0] = GXt_int11 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "%CDP", ""), ""), GXv_int12) ;
      procesosquimicos_trn_impl.this.GXt_int11 = GXv_int12[0] ;
      edtProForCPo_Visible = ((GXt_int11==1) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtProForCPo_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForCPo_Visible), 5, 0), !bGXsfl_125_Refreshing);
      GXt_int11 = (byte)(0) ;
      GXv_int12[0] = GXt_int11 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "CLAVE2", ""), ""), GXv_int12) ;
      procesosquimicos_trn_impl.this.GXt_int11 = GXv_int12[0] ;
      edtProForClv_Visible = ((GXt_int11==1) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtProForClv_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForClv_Visible), 5, 0), !bGXsfl_125_Refreshing);
      GXt_int11 = (byte)(0) ;
      GXv_int12[0] = GXt_int11 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "LAVAND", ""), ""), GXv_int12) ;
      procesosquimicos_trn_impl.this.GXt_int11 = GXv_int12[0] ;
      edtProForPau_Visible = ((GXt_int11==1) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtProForPau_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForPau_Visible), 5, 0), true);
      GXt_int11 = (byte)(0) ;
      GXv_int12[0] = GXt_int11 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "LAVAND", ""), ""), GXv_int12) ;
      procesosquimicos_trn_impl.this.GXt_int11 = GXv_int12[0] ;
      if ( ! ( ( GXt_int11 == 1 ) ) )
      {
         divProforpau_cell_Class = httpContext.getMessage( "Invisible", "") ;
         httpContext.ajax_rsp_assign_prop("", false, divProforpau_cell_Internalname, "Class", divProforpau_cell_Class, true);
      }
      else
      {
         GXt_int11 = (byte)(0) ;
         GXv_int12[0] = GXt_int11 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "LAVAND", ""), ""), GXv_int12) ;
         procesosquimicos_trn_impl.this.GXt_int11 = GXv_int12[0] ;
         if ( GXt_int11 == 1 )
         {
            divProforpau_cell_Class = httpContext.getMessage( "col-xs-12 col-sm-4 DataContentCell", "") ;
            httpContext.ajax_rsp_assign_prop("", false, divProforpau_cell_Internalname, "Class", divProforpau_cell_Class, true);
         }
      }
      GXt_int11 = (byte)(0) ;
      GXv_int12[0] = GXt_int11 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "TINTTO", ""), ""), GXv_int12) ;
      procesosquimicos_trn_impl.this.GXt_int11 = GXv_int12[0] ;
      edtProForAbs_Visible = ((GXt_int11==1) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtProForAbs_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForAbs_Visible), 5, 0), true);
      GXt_int11 = (byte)(0) ;
      GXv_int12[0] = GXt_int11 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "TINTTO", ""), ""), GXv_int12) ;
      procesosquimicos_trn_impl.this.GXt_int11 = GXv_int12[0] ;
      if ( ! ( ( GXt_int11 == 1 ) ) )
      {
         divProforabs_cell_Class = httpContext.getMessage( "Invisible", "") ;
         httpContext.ajax_rsp_assign_prop("", false, divProforabs_cell_Internalname, "Class", divProforabs_cell_Class, true);
      }
      else
      {
         GXt_int11 = (byte)(0) ;
         GXv_int12[0] = GXt_int11 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "TINTTO", ""), ""), GXv_int12) ;
         procesosquimicos_trn_impl.this.GXt_int11 = GXv_int12[0] ;
         if ( GXt_int11 == 1 )
         {
            divProforabs_cell_Class = httpContext.getMessage( "col-xs-12 col-sm-3 DataContentCell", "") ;
            httpContext.ajax_rsp_assign_prop("", false, divProforabs_cell_Internalname, "Class", divProforabs_cell_Class, true);
         }
      }
      GXt_int11 = (byte)(0) ;
      GXv_int12[0] = GXt_int11 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "TINTTO", ""), ""), GXv_int12) ;
      procesosquimicos_trn_impl.this.GXt_int11 = GXv_int12[0] ;
      edtProForCos_Visible = ((GXt_int11==1) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtProForCos_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForCos_Visible), 5, 0), true);
      GXt_int11 = (byte)(0) ;
      GXv_int12[0] = GXt_int11 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "TINTTO", ""), ""), GXv_int12) ;
      procesosquimicos_trn_impl.this.GXt_int11 = GXv_int12[0] ;
      if ( ! ( ( GXt_int11 == 1 ) ) )
      {
         divProforcos_cell_Class = httpContext.getMessage( "Invisible", "") ;
         httpContext.ajax_rsp_assign_prop("", false, divProforcos_cell_Internalname, "Class", divProforcos_cell_Class, true);
      }
      else
      {
         GXt_int11 = (byte)(0) ;
         GXv_int12[0] = GXt_int11 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "TINTTO", ""), ""), GXv_int12) ;
         procesosquimicos_trn_impl.this.GXt_int11 = GXv_int12[0] ;
         if ( GXt_int11 == 1 )
         {
            divProforcos_cell_Class = httpContext.getMessage( "col-xs-12 col-sm-2 DataContentCell", "") ;
            httpContext.ajax_rsp_assign_prop("", false, divProforcos_cell_Internalname, "Class", divProforcos_cell_Class, true);
         }
      }
      GXt_int11 = (byte)(0) ;
      GXv_int12[0] = GXt_int11 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "TEJIDO", ""), ""), GXv_int12) ;
      procesosquimicos_trn_impl.this.GXt_int11 = GXv_int12[0] ;
      GXt_int6 = (byte)(0) ;
      GXv_int5[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "LAVADO", ""), ""), GXv_int5) ;
      procesosquimicos_trn_impl.this.GXt_int6 = GXv_int5[0] ;
      edtProforVl_Visible = ((GXt_int11==1)||(GXt_int6==1) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtProforVl_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProforVl_Visible), 5, 0), true);
      GXt_int11 = (byte)(0) ;
      GXv_int12[0] = GXt_int11 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "TEJIDO", ""), ""), GXv_int12) ;
      procesosquimicos_trn_impl.this.GXt_int11 = GXv_int12[0] ;
      GXt_int6 = (byte)(0) ;
      GXv_int5[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "LAVADO", ""), ""), GXv_int5) ;
      procesosquimicos_trn_impl.this.GXt_int6 = GXv_int5[0] ;
      if ( ! ( ( GXt_int11 == 1 ) || ( GXt_int6 == 1 ) ) )
      {
         divProforvl_cell_Class = httpContext.getMessage( "Invisible", "") ;
         httpContext.ajax_rsp_assign_prop("", false, divProforvl_cell_Internalname, "Class", divProforvl_cell_Class, true);
      }
      else
      {
         GXt_int11 = (byte)(0) ;
         GXv_int12[0] = GXt_int11 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "TEJIDO", ""), ""), GXv_int12) ;
         procesosquimicos_trn_impl.this.GXt_int11 = GXv_int12[0] ;
         GXt_int6 = (byte)(0) ;
         GXv_int5[0] = GXt_int6 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "LAVADO", ""), ""), GXv_int5) ;
         procesosquimicos_trn_impl.this.GXt_int6 = GXv_int5[0] ;
         if ( ( GXt_int11 == 1 ) || ( GXt_int6 == 1 ) )
         {
            divProforvl_cell_Class = httpContext.getMessage( "col-xs-12 col-sm-2 DataContentCell", "") ;
            httpContext.ajax_rsp_assign_prop("", false, divProforvl_cell_Internalname, "Class", divProforvl_cell_Class, true);
         }
      }
      GXt_int11 = (byte)(0) ;
      GXv_int12[0] = GXt_int11 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "JPF", ""), ""), GXv_int12) ;
      procesosquimicos_trn_impl.this.GXt_int11 = GXv_int12[0] ;
      edtProH2O_Visible = ((GXt_int11==1) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtProH2O_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProH2O_Visible), 5, 0), true);
      GXt_int11 = (byte)(0) ;
      GXv_int12[0] = GXt_int11 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "JPF", ""), ""), GXv_int12) ;
      procesosquimicos_trn_impl.this.GXt_int11 = GXv_int12[0] ;
      if ( ! ( ( GXt_int11 == 1 ) ) )
      {
         divProh2o_cell_Class = httpContext.getMessage( "Invisible", "") ;
         httpContext.ajax_rsp_assign_prop("", false, divProh2o_cell_Internalname, "Class", divProh2o_cell_Class, true);
      }
      else
      {
         GXt_int11 = (byte)(0) ;
         GXv_int12[0] = GXt_int11 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "JPF", ""), ""), GXv_int12) ;
         procesosquimicos_trn_impl.this.GXt_int11 = GXv_int12[0] ;
         if ( GXt_int11 == 1 )
         {
            divProh2o_cell_Class = httpContext.getMessage( "col-xs-12 col-sm-2 DataContentCell", "") ;
            httpContext.ajax_rsp_assign_prop("", false, divProh2o_cell_Internalname, "Class", divProh2o_cell_Class, true);
         }
      }
      GXt_int11 = (byte)(0) ;
      GXv_int12[0] = GXt_int11 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "AC2013", ""), ""), GXv_int12) ;
      procesosquimicos_trn_impl.this.GXt_int11 = GXv_int12[0] ;
      edtProForRs_Visible = ((GXt_int11==1) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtProForRs_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForRs_Visible), 5, 0), true);
      GXt_int11 = (byte)(0) ;
      GXv_int12[0] = GXt_int11 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "AC2013", ""), ""), GXv_int12) ;
      procesosquimicos_trn_impl.this.GXt_int11 = GXv_int12[0] ;
      if ( ! ( ( GXt_int11 == 1 ) ) )
      {
         divProforrs_cell_Class = httpContext.getMessage( "Invisible", "") ;
         httpContext.ajax_rsp_assign_prop("", false, divProforrs_cell_Internalname, "Class", divProforrs_cell_Class, true);
      }
      else
      {
         GXt_int11 = (byte)(0) ;
         GXv_int12[0] = GXt_int11 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "AC2013", ""), ""), GXv_int12) ;
         procesosquimicos_trn_impl.this.GXt_int11 = GXv_int12[0] ;
         if ( GXt_int11 == 1 )
         {
            divProforrs_cell_Class = httpContext.getMessage( "col-xs-12 col-sm-2 DataContentCell", "") ;
            httpContext.ajax_rsp_assign_prop("", false, divProforrs_cell_Internalname, "Class", divProforrs_cell_Class, true);
         }
      }
      A13740ProFDsc = GXutil.trim( A764ProForCod) + "-" + GXutil.trim( A766ProForDsc) ;
      httpContext.ajax_rsp_assign_attri("", false, "A13740ProFDsc", A13740ProFDsc);
      A920ProForCodV = A764ProForCod ;
      httpContext.ajax_rsp_assign_attri("", false, "A920ProForCodV", A920ProForCodV);
      if ( true )
      {
         A6061ProForLab = AV50ComboProForLab ;
         httpContext.ajax_rsp_assign_attri("", false, "A6061ProForLab", A6061ProForLab);
      }
      else
      {
         if ( isIns( )  && (GXutil.strcmp("", A6061ProForLab)==0) && ( Gx_BScreen == 0 ) )
         {
            A6061ProForLab = A764ProForCod ;
            httpContext.ajax_rsp_assign_attri("", false, "A6061ProForLab", A6061ProForLab);
         }
      }
   }

   public void checkExtendedTable1RW89( )
   {
      nIsDirty_89 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal( ) ;
      /* Using cursor T01RW17 */
      pr_default.execute(8, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(8) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T01RW17_A407EmprNom[0] ;
      n407EmprNom = T01RW17_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(8);
      nIsDirty_89 = (short)(1) ;
      A941EmprCodV2 = A396EmprCod ;
      httpContext.ajax_rsp_assign_attri("", false, "A941EmprCodV2", A941EmprCodV2);
      GXt_int11 = (byte)(0) ;
      GXv_int12[0] = GXt_int11 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "%CDP", ""), ""), GXv_int12) ;
      procesosquimicos_trn_impl.this.GXt_int11 = GXv_int12[0] ;
      edtProForCPo_Visible = ((GXt_int11==1) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtProForCPo_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForCPo_Visible), 5, 0), !bGXsfl_125_Refreshing);
      GXt_int11 = (byte)(0) ;
      GXv_int12[0] = GXt_int11 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "CLAVE2", ""), ""), GXv_int12) ;
      procesosquimicos_trn_impl.this.GXt_int11 = GXv_int12[0] ;
      edtProForClv_Visible = ((GXt_int11==1) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtProForClv_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForClv_Visible), 5, 0), !bGXsfl_125_Refreshing);
      GXt_int11 = (byte)(0) ;
      GXv_int12[0] = GXt_int11 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "LAVAND", ""), ""), GXv_int12) ;
      procesosquimicos_trn_impl.this.GXt_int11 = GXv_int12[0] ;
      edtProForPau_Visible = ((GXt_int11==1) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtProForPau_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForPau_Visible), 5, 0), true);
      GXt_int11 = (byte)(0) ;
      GXv_int12[0] = GXt_int11 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "LAVAND", ""), ""), GXv_int12) ;
      procesosquimicos_trn_impl.this.GXt_int11 = GXv_int12[0] ;
      if ( ! ( ( GXt_int11 == 1 ) ) )
      {
         divProforpau_cell_Class = httpContext.getMessage( "Invisible", "") ;
         httpContext.ajax_rsp_assign_prop("", false, divProforpau_cell_Internalname, "Class", divProforpau_cell_Class, true);
      }
      else
      {
         GXt_int11 = (byte)(0) ;
         GXv_int12[0] = GXt_int11 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "LAVAND", ""), ""), GXv_int12) ;
         procesosquimicos_trn_impl.this.GXt_int11 = GXv_int12[0] ;
         if ( GXt_int11 == 1 )
         {
            divProforpau_cell_Class = httpContext.getMessage( "col-xs-12 col-sm-4 DataContentCell", "") ;
            httpContext.ajax_rsp_assign_prop("", false, divProforpau_cell_Internalname, "Class", divProforpau_cell_Class, true);
         }
      }
      GXt_int11 = (byte)(0) ;
      GXv_int12[0] = GXt_int11 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "TINTTO", ""), ""), GXv_int12) ;
      procesosquimicos_trn_impl.this.GXt_int11 = GXv_int12[0] ;
      edtProForAbs_Visible = ((GXt_int11==1) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtProForAbs_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForAbs_Visible), 5, 0), true);
      GXt_int11 = (byte)(0) ;
      GXv_int12[0] = GXt_int11 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "TINTTO", ""), ""), GXv_int12) ;
      procesosquimicos_trn_impl.this.GXt_int11 = GXv_int12[0] ;
      if ( ! ( ( GXt_int11 == 1 ) ) )
      {
         divProforabs_cell_Class = httpContext.getMessage( "Invisible", "") ;
         httpContext.ajax_rsp_assign_prop("", false, divProforabs_cell_Internalname, "Class", divProforabs_cell_Class, true);
      }
      else
      {
         GXt_int11 = (byte)(0) ;
         GXv_int12[0] = GXt_int11 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "TINTTO", ""), ""), GXv_int12) ;
         procesosquimicos_trn_impl.this.GXt_int11 = GXv_int12[0] ;
         if ( GXt_int11 == 1 )
         {
            divProforabs_cell_Class = httpContext.getMessage( "col-xs-12 col-sm-3 DataContentCell", "") ;
            httpContext.ajax_rsp_assign_prop("", false, divProforabs_cell_Internalname, "Class", divProforabs_cell_Class, true);
         }
      }
      GXt_int11 = (byte)(0) ;
      GXv_int12[0] = GXt_int11 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "TINTTO", ""), ""), GXv_int12) ;
      procesosquimicos_trn_impl.this.GXt_int11 = GXv_int12[0] ;
      edtProForCos_Visible = ((GXt_int11==1) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtProForCos_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForCos_Visible), 5, 0), true);
      GXt_int11 = (byte)(0) ;
      GXv_int12[0] = GXt_int11 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "TINTTO", ""), ""), GXv_int12) ;
      procesosquimicos_trn_impl.this.GXt_int11 = GXv_int12[0] ;
      if ( ! ( ( GXt_int11 == 1 ) ) )
      {
         divProforcos_cell_Class = httpContext.getMessage( "Invisible", "") ;
         httpContext.ajax_rsp_assign_prop("", false, divProforcos_cell_Internalname, "Class", divProforcos_cell_Class, true);
      }
      else
      {
         GXt_int11 = (byte)(0) ;
         GXv_int12[0] = GXt_int11 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "TINTTO", ""), ""), GXv_int12) ;
         procesosquimicos_trn_impl.this.GXt_int11 = GXv_int12[0] ;
         if ( GXt_int11 == 1 )
         {
            divProforcos_cell_Class = httpContext.getMessage( "col-xs-12 col-sm-2 DataContentCell", "") ;
            httpContext.ajax_rsp_assign_prop("", false, divProforcos_cell_Internalname, "Class", divProforcos_cell_Class, true);
         }
      }
      GXt_int11 = (byte)(0) ;
      GXv_int12[0] = GXt_int11 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "TEJIDO", ""), ""), GXv_int12) ;
      procesosquimicos_trn_impl.this.GXt_int11 = GXv_int12[0] ;
      GXt_int6 = (byte)(0) ;
      GXv_int5[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "LAVADO", ""), ""), GXv_int5) ;
      procesosquimicos_trn_impl.this.GXt_int6 = GXv_int5[0] ;
      edtProforVl_Visible = ((GXt_int11==1)||(GXt_int6==1) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtProforVl_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProforVl_Visible), 5, 0), true);
      GXt_int11 = (byte)(0) ;
      GXv_int12[0] = GXt_int11 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "TEJIDO", ""), ""), GXv_int12) ;
      procesosquimicos_trn_impl.this.GXt_int11 = GXv_int12[0] ;
      GXt_int6 = (byte)(0) ;
      GXv_int5[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "LAVADO", ""), ""), GXv_int5) ;
      procesosquimicos_trn_impl.this.GXt_int6 = GXv_int5[0] ;
      if ( ! ( ( GXt_int11 == 1 ) || ( GXt_int6 == 1 ) ) )
      {
         divProforvl_cell_Class = httpContext.getMessage( "Invisible", "") ;
         httpContext.ajax_rsp_assign_prop("", false, divProforvl_cell_Internalname, "Class", divProforvl_cell_Class, true);
      }
      else
      {
         GXt_int11 = (byte)(0) ;
         GXv_int12[0] = GXt_int11 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "TEJIDO", ""), ""), GXv_int12) ;
         procesosquimicos_trn_impl.this.GXt_int11 = GXv_int12[0] ;
         GXt_int6 = (byte)(0) ;
         GXv_int5[0] = GXt_int6 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "LAVADO", ""), ""), GXv_int5) ;
         procesosquimicos_trn_impl.this.GXt_int6 = GXv_int5[0] ;
         if ( ( GXt_int11 == 1 ) || ( GXt_int6 == 1 ) )
         {
            divProforvl_cell_Class = httpContext.getMessage( "col-xs-12 col-sm-2 DataContentCell", "") ;
            httpContext.ajax_rsp_assign_prop("", false, divProforvl_cell_Internalname, "Class", divProforvl_cell_Class, true);
         }
      }
      GXt_int11 = (byte)(0) ;
      GXv_int12[0] = GXt_int11 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "JPF", ""), ""), GXv_int12) ;
      procesosquimicos_trn_impl.this.GXt_int11 = GXv_int12[0] ;
      edtProH2O_Visible = ((GXt_int11==1) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtProH2O_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProH2O_Visible), 5, 0), true);
      GXt_int11 = (byte)(0) ;
      GXv_int12[0] = GXt_int11 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "JPF", ""), ""), GXv_int12) ;
      procesosquimicos_trn_impl.this.GXt_int11 = GXv_int12[0] ;
      if ( ! ( ( GXt_int11 == 1 ) ) )
      {
         divProh2o_cell_Class = httpContext.getMessage( "Invisible", "") ;
         httpContext.ajax_rsp_assign_prop("", false, divProh2o_cell_Internalname, "Class", divProh2o_cell_Class, true);
      }
      else
      {
         GXt_int11 = (byte)(0) ;
         GXv_int12[0] = GXt_int11 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "JPF", ""), ""), GXv_int12) ;
         procesosquimicos_trn_impl.this.GXt_int11 = GXv_int12[0] ;
         if ( GXt_int11 == 1 )
         {
            divProh2o_cell_Class = httpContext.getMessage( "col-xs-12 col-sm-2 DataContentCell", "") ;
            httpContext.ajax_rsp_assign_prop("", false, divProh2o_cell_Internalname, "Class", divProh2o_cell_Class, true);
         }
      }
      GXt_int11 = (byte)(0) ;
      GXv_int12[0] = GXt_int11 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "AC2013", ""), ""), GXv_int12) ;
      procesosquimicos_trn_impl.this.GXt_int11 = GXv_int12[0] ;
      edtProForRs_Visible = ((GXt_int11==1) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtProForRs_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForRs_Visible), 5, 0), true);
      GXt_int11 = (byte)(0) ;
      GXv_int12[0] = GXt_int11 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "AC2013", ""), ""), GXv_int12) ;
      procesosquimicos_trn_impl.this.GXt_int11 = GXv_int12[0] ;
      if ( ! ( ( GXt_int11 == 1 ) ) )
      {
         divProforrs_cell_Class = httpContext.getMessage( "Invisible", "") ;
         httpContext.ajax_rsp_assign_prop("", false, divProforrs_cell_Internalname, "Class", divProforrs_cell_Class, true);
      }
      else
      {
         GXt_int11 = (byte)(0) ;
         GXv_int12[0] = GXt_int11 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "AC2013", ""), ""), GXv_int12) ;
         procesosquimicos_trn_impl.this.GXt_int11 = GXv_int12[0] ;
         if ( GXt_int11 == 1 )
         {
            divProforrs_cell_Class = httpContext.getMessage( "col-xs-12 col-sm-2 DataContentCell", "") ;
            httpContext.ajax_rsp_assign_prop("", false, divProforrs_cell_Internalname, "Class", divProforrs_cell_Class, true);
         }
      }
      nIsDirty_89 = (short)(1) ;
      A13740ProFDsc = GXutil.trim( A764ProForCod) + "-" + GXutil.trim( A766ProForDsc) ;
      httpContext.ajax_rsp_assign_attri("", false, "A13740ProFDsc", A13740ProFDsc);
      nIsDirty_89 = (short)(1) ;
      A920ProForCodV = A764ProForCod ;
      httpContext.ajax_rsp_assign_attri("", false, "A920ProForCodV", A920ProForCodV);
      if ( (GXutil.strcmp("", A764ProForCod)==0) )
      {
         httpContext.GX_msglist.addItem("Código de proceso nulo", 1, "PROFORCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtProForCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ( A772ProForTmx == 0 ) && ( AV24Orient == 1 ) && true /* After */ )
      {
         httpContext.GX_msglist.addItem("No se ha introducido Temperatura¡¡¡", 1, "PROFORTMX");
         AnyError = (short)(1) ;
         GX_FocusControl = edtProForTmx_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ! ( ( GXutil.strcmp(A3005ProRev, "S") == 0 ) || ( GXutil.strcmp(A3005ProRev, "N") == 0 ) ) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Revision", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, "PROREV");
         AnyError = (short)(1) ;
         GX_FocusControl = cmbProRev.getInternalname() ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( (0==A4706ProForRb) && true /* After */ && ( AV37FlagLav == 1 ) )
      {
         httpContext.GX_msglist.addItem("Atencion. No se ha entrado lao Relación de Baño", 0, "PROFORRB");
      }
      if ( true )
      {
         nIsDirty_89 = (short)(1) ;
         A6061ProForLab = AV50ComboProForLab ;
         httpContext.ajax_rsp_assign_attri("", false, "A6061ProForLab", A6061ProForLab);
      }
      else
      {
         if ( isIns( )  && (GXutil.strcmp("", A6061ProForLab)==0) && ( Gx_BScreen == 0 ) )
         {
            nIsDirty_89 = (short)(1) ;
            A6061ProForLab = A764ProForCod ;
            httpContext.ajax_rsp_assign_attri("", false, "A6061ProForLab", A6061ProForLab);
         }
      }
   }

   public void closeExtendedTableCursors1RW89( )
   {
      pr_default.close(8);
   }

   public void enableDisable( )
   {
   }

   public void gxload_63( String A396EmprCod )
   {
      /* Using cursor T01RW19 */
      pr_default.execute(10, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(10) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T01RW19_A407EmprNom[0] ;
      n407EmprNom = T01RW19_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A407EmprNom))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(10) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(10);
   }

   public void getKey1RW89( )
   {
      /* Using cursor T01RW20 */
      pr_default.execute(11, new Object[] {A396EmprCod, Boolean.valueOf(n764ProForCod), A764ProForCod});
      if ( (pr_default.getStatus(11) != 101) )
      {
         RcdFound89 = (short)(1) ;
      }
      else
      {
         RcdFound89 = (short)(0) ;
      }
      pr_default.close(11);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01RW16 */
      pr_default.execute(7, new Object[] {A396EmprCod, Boolean.valueOf(n764ProForCod), A764ProForCod});
      if ( (pr_default.getStatus(7) != 101) )
      {
         zm1RW89( 62) ;
         RcdFound89 = (short)(1) ;
         A764ProForCod = T01RW16_A764ProForCod[0] ;
         n764ProForCod = T01RW16_n764ProForCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A764ProForCod", A764ProForCod);
         A6061ProForLab = T01RW16_A6061ProForLab[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6061ProForLab", A6061ProForLab);
         A766ProForDsc = T01RW16_A766ProForDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A766ProForDsc", A766ProForDsc);
         A4715ProForDsc2 = T01RW16_A4715ProForDsc2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4715ProForDsc2", A4715ProForDsc2);
         A771ProForTie = T01RW16_A771ProForTie[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A771ProForTie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A771ProForTie), 4, 0));
         A772ProForTmx = T01RW16_A772ProForTmx[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A772ProForTmx", GXutil.ltrimstr( DecimalUtil.doubleToDec(A772ProForTmx), 4, 0));
         A769ProForMat = T01RW16_A769ProForMat[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A769ProForMat", A769ProForMat);
         A674PorForFul = T01RW16_A674PorForFul[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A674PorForFul", localUtil.format(A674PorForFul, "99/99/99"));
         A773ProForUli = T01RW16_A773ProForUli[0] ;
         A2392ProNumPro = T01RW16_A2392ProNumPro[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2392ProNumPro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2392ProNumPro), 5, 0));
         A2393ProNumRec = T01RW16_A2393ProNumRec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2393ProNumRec", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2393ProNumRec), 5, 0));
         A3005ProRev = T01RW16_A3005ProRev[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3005ProRev", A3005ProRev);
         A4705ProForPau = T01RW16_A4705ProForPau[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4705ProForPau", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4705ProForPau), 4, 0));
         A4706ProForRb = T01RW16_A4706ProForRb[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4706ProForRb", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4706ProForRb), 4, 0));
         A4864ProForCCi = T01RW16_A4864ProForCCi[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4864ProForCCi", A4864ProForCCi);
         A4865ProForDCi = T01RW16_A4865ProForDCi[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4865ProForDCi", A4865ProForDCi);
         A5523ProForTip = T01RW16_A5523ProForTip[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5523ProForTip", A5523ProForTip);
         A8527ProForAbs = T01RW16_A8527ProForAbs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8527ProForAbs", GXutil.ltrimstr( A8527ProForAbs, 6, 2));
         A8528ProForCos = T01RW16_A8528ProForCos[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8528ProForCos", GXutil.ltrimstr( A8528ProForCos, 8, 4));
         A10120ProforVl = T01RW16_A10120ProforVl[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10120ProforVl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10120ProforVl), 5, 0));
         A10547ProH2O = T01RW16_A10547ProH2O[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10547ProH2O", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10547ProH2O), 4, 0));
         A3589ProForMer = T01RW16_A3589ProForMer[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3589ProForMer", GXutil.ltrimstr( A3589ProForMer, 6, 2));
         A13133ProForAct = T01RW16_A13133ProForAct[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13133ProForAct", A13133ProForAct);
         A13936ProForRs = T01RW16_A13936ProForRs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13936ProForRs", A13936ProForRs);
         A396EmprCod = T01RW16_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         Z396EmprCod = A396EmprCod ;
         Z764ProForCod = A764ProForCod ;
         sMode89 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load1RW89( ) ;
         if ( AnyError == 1 )
         {
            RcdFound89 = (short)(0) ;
            initializeNonKey1RW89( ) ;
         }
         Gx_mode = sMode89 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound89 = (short)(0) ;
         initializeNonKey1RW89( ) ;
         sMode89 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode89 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(7);
   }

   public void getEqualNoModal( )
   {
      getKey1RW89( ) ;
      if ( RcdFound89 == 0 )
      {
      }
      else
      {
      }
      getByPrimaryKey( ) ;
   }

   public void move_next( )
   {
      RcdFound89 = (short)(0) ;
      /* Using cursor T01RW21 */
      pr_default.execute(12, new Object[] {A396EmprCod, A396EmprCod, Boolean.valueOf(n764ProForCod), A764ProForCod});
      if ( (pr_default.getStatus(12) != 101) )
      {
         while ( (pr_default.getStatus(12) != 101) && ( ( GXutil.strcmp(T01RW21_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01RW21_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01RW21_A764ProForCod[0], A764ProForCod) < 0 ) ) )
         {
            pr_default.readNext(12);
         }
         if ( (pr_default.getStatus(12) != 101) && ( ( GXutil.strcmp(T01RW21_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01RW21_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01RW21_A764ProForCod[0], A764ProForCod) > 0 ) ) )
         {
            A396EmprCod = T01RW21_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A764ProForCod = T01RW21_A764ProForCod[0] ;
            n764ProForCod = T01RW21_n764ProForCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A764ProForCod", A764ProForCod);
            RcdFound89 = (short)(1) ;
         }
      }
      pr_default.close(12);
   }

   public void move_previous( )
   {
      RcdFound89 = (short)(0) ;
      /* Using cursor T01RW22 */
      pr_default.execute(13, new Object[] {A396EmprCod, A396EmprCod, Boolean.valueOf(n764ProForCod), A764ProForCod});
      if ( (pr_default.getStatus(13) != 101) )
      {
         while ( (pr_default.getStatus(13) != 101) && ( ( GXutil.strcmp(T01RW22_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01RW22_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01RW22_A764ProForCod[0], A764ProForCod) > 0 ) ) )
         {
            pr_default.readNext(13);
         }
         if ( (pr_default.getStatus(13) != 101) && ( ( GXutil.strcmp(T01RW22_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01RW22_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01RW22_A764ProForCod[0], A764ProForCod) < 0 ) ) )
         {
            A396EmprCod = T01RW22_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A764ProForCod = T01RW22_A764ProForCod[0] ;
            n764ProForCod = T01RW22_n764ProForCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A764ProForCod", A764ProForCod);
            RcdFound89 = (short)(1) ;
         }
      }
      pr_default.close(13);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1RW89( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtProForCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1RW89( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound89 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A764ProForCod, Z764ProForCod) != 0 ) )
            {
               A396EmprCod = Z396EmprCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
               A764ProForCod = Z764ProForCod ;
               n764ProForCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A764ProForCod", A764ProForCod);
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtProForCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               /* Update record */
               update1RW89( ) ;
               GX_FocusControl = edtProForCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A764ProForCod, Z764ProForCod) != 0 ) )
            {
               /* Insert record */
               GX_FocusControl = edtProForCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1RW89( ) ;
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
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "EMPRCOD");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtEmprCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               else
               {
                  /* Insert record */
                  GX_FocusControl = edtProForCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1RW89( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A764ProForCod, Z764ProForCod) != 0 ) )
      {
         A396EmprCod = Z396EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A764ProForCod = Z764ProForCod ;
         n764ProForCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A764ProForCod", A764ProForCod);
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtProForCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( AnyError != 0 )
      {
      }
   }

   public void checkOptimisticConcurrency1RW89( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01RW15 */
         pr_default.execute(6, new Object[] {A396EmprCod, Boolean.valueOf(n764ProForCod), A764ProForCod});
         if ( (pr_default.getStatus(6) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCPROFO"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(6) == 101) || ( GXutil.strcmp(Z6061ProForLab, T01RW15_A6061ProForLab[0]) != 0 ) || ( GXutil.strcmp(Z766ProForDsc, T01RW15_A766ProForDsc[0]) != 0 ) || ( GXutil.strcmp(Z4715ProForDsc2, T01RW15_A4715ProForDsc2[0]) != 0 ) || ( Z771ProForTie != T01RW15_A771ProForTie[0] ) || ( Z772ProForTmx != T01RW15_A772ProForTmx[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z769ProForMat, T01RW15_A769ProForMat[0]) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(Z674PorForFul), GXutil.resetTime(T01RW15_A674PorForFul[0])) ) || ( Z773ProForUli != T01RW15_A773ProForUli[0] ) || ( Z2392ProNumPro != T01RW15_A2392ProNumPro[0] ) || ( Z2393ProNumRec != T01RW15_A2393ProNumRec[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z3005ProRev, T01RW15_A3005ProRev[0]) != 0 ) || ( Z4705ProForPau != T01RW15_A4705ProForPau[0] ) || ( Z4706ProForRb != T01RW15_A4706ProForRb[0] ) || ( GXutil.strcmp(Z4864ProForCCi, T01RW15_A4864ProForCCi[0]) != 0 ) || ( GXutil.strcmp(Z4865ProForDCi, T01RW15_A4865ProForDCi[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z5523ProForTip, T01RW15_A5523ProForTip[0]) != 0 ) || ( DecimalUtil.compareTo(Z8527ProForAbs, T01RW15_A8527ProForAbs[0]) != 0 ) || ( DecimalUtil.compareTo(Z8528ProForCos, T01RW15_A8528ProForCos[0]) != 0 ) || ( Z10120ProforVl != T01RW15_A10120ProforVl[0] ) || ( Z10547ProH2O != T01RW15_A10547ProH2O[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( DecimalUtil.compareTo(Z3589ProForMer, T01RW15_A3589ProForMer[0]) != 0 ) || ( GXutil.strcmp(Z13133ProForAct, T01RW15_A13133ProForAct[0]) != 0 ) || ( GXutil.strcmp(Z13936ProForRs, T01RW15_A13936ProForRs[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z6061ProForLab, T01RW15_A6061ProForLab[0]) != 0 )
            {
               GXutil.writeLogln("formulaciontinte.procesosquimicos_trn:[seudo value changed for attri]"+"ProForLab");
               GXutil.writeLogRaw("Old: ",Z6061ProForLab);
               GXutil.writeLogRaw("Current: ",T01RW15_A6061ProForLab[0]);
            }
            if ( GXutil.strcmp(Z766ProForDsc, T01RW15_A766ProForDsc[0]) != 0 )
            {
               GXutil.writeLogln("formulaciontinte.procesosquimicos_trn:[seudo value changed for attri]"+"ProForDsc");
               GXutil.writeLogRaw("Old: ",Z766ProForDsc);
               GXutil.writeLogRaw("Current: ",T01RW15_A766ProForDsc[0]);
            }
            if ( GXutil.strcmp(Z4715ProForDsc2, T01RW15_A4715ProForDsc2[0]) != 0 )
            {
               GXutil.writeLogln("formulaciontinte.procesosquimicos_trn:[seudo value changed for attri]"+"ProForDsc2");
               GXutil.writeLogRaw("Old: ",Z4715ProForDsc2);
               GXutil.writeLogRaw("Current: ",T01RW15_A4715ProForDsc2[0]);
            }
            if ( Z771ProForTie != T01RW15_A771ProForTie[0] )
            {
               GXutil.writeLogln("formulaciontinte.procesosquimicos_trn:[seudo value changed for attri]"+"ProForTie");
               GXutil.writeLogRaw("Old: ",Z771ProForTie);
               GXutil.writeLogRaw("Current: ",T01RW15_A771ProForTie[0]);
            }
            if ( Z772ProForTmx != T01RW15_A772ProForTmx[0] )
            {
               GXutil.writeLogln("formulaciontinte.procesosquimicos_trn:[seudo value changed for attri]"+"ProForTmx");
               GXutil.writeLogRaw("Old: ",Z772ProForTmx);
               GXutil.writeLogRaw("Current: ",T01RW15_A772ProForTmx[0]);
            }
            if ( GXutil.strcmp(Z769ProForMat, T01RW15_A769ProForMat[0]) != 0 )
            {
               GXutil.writeLogln("formulaciontinte.procesosquimicos_trn:[seudo value changed for attri]"+"ProForMat");
               GXutil.writeLogRaw("Old: ",Z769ProForMat);
               GXutil.writeLogRaw("Current: ",T01RW15_A769ProForMat[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z674PorForFul), GXutil.resetTime(T01RW15_A674PorForFul[0])) ) )
            {
               GXutil.writeLogln("formulaciontinte.procesosquimicos_trn:[seudo value changed for attri]"+"PorForFul");
               GXutil.writeLogRaw("Old: ",Z674PorForFul);
               GXutil.writeLogRaw("Current: ",T01RW15_A674PorForFul[0]);
            }
            if ( Z773ProForUli != T01RW15_A773ProForUli[0] )
            {
               GXutil.writeLogln("formulaciontinte.procesosquimicos_trn:[seudo value changed for attri]"+"ProForUli");
               GXutil.writeLogRaw("Old: ",Z773ProForUli);
               GXutil.writeLogRaw("Current: ",T01RW15_A773ProForUli[0]);
            }
            if ( Z2392ProNumPro != T01RW15_A2392ProNumPro[0] )
            {
               GXutil.writeLogln("formulaciontinte.procesosquimicos_trn:[seudo value changed for attri]"+"ProNumPro");
               GXutil.writeLogRaw("Old: ",Z2392ProNumPro);
               GXutil.writeLogRaw("Current: ",T01RW15_A2392ProNumPro[0]);
            }
            if ( Z2393ProNumRec != T01RW15_A2393ProNumRec[0] )
            {
               GXutil.writeLogln("formulaciontinte.procesosquimicos_trn:[seudo value changed for attri]"+"ProNumRec");
               GXutil.writeLogRaw("Old: ",Z2393ProNumRec);
               GXutil.writeLogRaw("Current: ",T01RW15_A2393ProNumRec[0]);
            }
            if ( GXutil.strcmp(Z3005ProRev, T01RW15_A3005ProRev[0]) != 0 )
            {
               GXutil.writeLogln("formulaciontinte.procesosquimicos_trn:[seudo value changed for attri]"+"ProRev");
               GXutil.writeLogRaw("Old: ",Z3005ProRev);
               GXutil.writeLogRaw("Current: ",T01RW15_A3005ProRev[0]);
            }
            if ( Z4705ProForPau != T01RW15_A4705ProForPau[0] )
            {
               GXutil.writeLogln("formulaciontinte.procesosquimicos_trn:[seudo value changed for attri]"+"ProForPau");
               GXutil.writeLogRaw("Old: ",Z4705ProForPau);
               GXutil.writeLogRaw("Current: ",T01RW15_A4705ProForPau[0]);
            }
            if ( Z4706ProForRb != T01RW15_A4706ProForRb[0] )
            {
               GXutil.writeLogln("formulaciontinte.procesosquimicos_trn:[seudo value changed for attri]"+"ProForRb");
               GXutil.writeLogRaw("Old: ",Z4706ProForRb);
               GXutil.writeLogRaw("Current: ",T01RW15_A4706ProForRb[0]);
            }
            if ( GXutil.strcmp(Z4864ProForCCi, T01RW15_A4864ProForCCi[0]) != 0 )
            {
               GXutil.writeLogln("formulaciontinte.procesosquimicos_trn:[seudo value changed for attri]"+"ProForCCi");
               GXutil.writeLogRaw("Old: ",Z4864ProForCCi);
               GXutil.writeLogRaw("Current: ",T01RW15_A4864ProForCCi[0]);
            }
            if ( GXutil.strcmp(Z4865ProForDCi, T01RW15_A4865ProForDCi[0]) != 0 )
            {
               GXutil.writeLogln("formulaciontinte.procesosquimicos_trn:[seudo value changed for attri]"+"ProForDCi");
               GXutil.writeLogRaw("Old: ",Z4865ProForDCi);
               GXutil.writeLogRaw("Current: ",T01RW15_A4865ProForDCi[0]);
            }
            if ( GXutil.strcmp(Z5523ProForTip, T01RW15_A5523ProForTip[0]) != 0 )
            {
               GXutil.writeLogln("formulaciontinte.procesosquimicos_trn:[seudo value changed for attri]"+"ProForTip");
               GXutil.writeLogRaw("Old: ",Z5523ProForTip);
               GXutil.writeLogRaw("Current: ",T01RW15_A5523ProForTip[0]);
            }
            if ( DecimalUtil.compareTo(Z8527ProForAbs, T01RW15_A8527ProForAbs[0]) != 0 )
            {
               GXutil.writeLogln("formulaciontinte.procesosquimicos_trn:[seudo value changed for attri]"+"ProForAbs");
               GXutil.writeLogRaw("Old: ",Z8527ProForAbs);
               GXutil.writeLogRaw("Current: ",T01RW15_A8527ProForAbs[0]);
            }
            if ( DecimalUtil.compareTo(Z8528ProForCos, T01RW15_A8528ProForCos[0]) != 0 )
            {
               GXutil.writeLogln("formulaciontinte.procesosquimicos_trn:[seudo value changed for attri]"+"ProForCos");
               GXutil.writeLogRaw("Old: ",Z8528ProForCos);
               GXutil.writeLogRaw("Current: ",T01RW15_A8528ProForCos[0]);
            }
            if ( Z10120ProforVl != T01RW15_A10120ProforVl[0] )
            {
               GXutil.writeLogln("formulaciontinte.procesosquimicos_trn:[seudo value changed for attri]"+"ProforVl");
               GXutil.writeLogRaw("Old: ",Z10120ProforVl);
               GXutil.writeLogRaw("Current: ",T01RW15_A10120ProforVl[0]);
            }
            if ( Z10547ProH2O != T01RW15_A10547ProH2O[0] )
            {
               GXutil.writeLogln("formulaciontinte.procesosquimicos_trn:[seudo value changed for attri]"+"ProH2O");
               GXutil.writeLogRaw("Old: ",Z10547ProH2O);
               GXutil.writeLogRaw("Current: ",T01RW15_A10547ProH2O[0]);
            }
            if ( DecimalUtil.compareTo(Z3589ProForMer, T01RW15_A3589ProForMer[0]) != 0 )
            {
               GXutil.writeLogln("formulaciontinte.procesosquimicos_trn:[seudo value changed for attri]"+"ProForMer");
               GXutil.writeLogRaw("Old: ",Z3589ProForMer);
               GXutil.writeLogRaw("Current: ",T01RW15_A3589ProForMer[0]);
            }
            if ( GXutil.strcmp(Z13133ProForAct, T01RW15_A13133ProForAct[0]) != 0 )
            {
               GXutil.writeLogln("formulaciontinte.procesosquimicos_trn:[seudo value changed for attri]"+"ProForAct");
               GXutil.writeLogRaw("Old: ",Z13133ProForAct);
               GXutil.writeLogRaw("Current: ",T01RW15_A13133ProForAct[0]);
            }
            if ( GXutil.strcmp(Z13936ProForRs, T01RW15_A13936ProForRs[0]) != 0 )
            {
               GXutil.writeLogln("formulaciontinte.procesosquimicos_trn:[seudo value changed for attri]"+"ProForRs");
               GXutil.writeLogRaw("Old: ",Z13936ProForRs);
               GXutil.writeLogRaw("Current: ",T01RW15_A13936ProForRs[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPCPROFO"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1RW89( )
   {
      beforeValidate1RW89( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1RW89( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1RW89( 0) ;
         checkOptimisticConcurrency1RW89( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1RW89( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1RW89( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01RW23 */
                  pr_default.execute(14, new Object[] {Boolean.valueOf(n764ProForCod), A764ProForCod, A6061ProForLab, A766ProForDsc, A4715ProForDsc2, Short.valueOf(A771ProForTie), Short.valueOf(A772ProForTmx), A769ProForMat, A674PorForFul, Short.valueOf(A773ProForUli), Integer.valueOf(A2392ProNumPro), Integer.valueOf(A2393ProNumRec), A3005ProRev, Short.valueOf(A4705ProForPau), Short.valueOf(A4706ProForRb), A4864ProForCCi, A4865ProForDCi, A5523ProForTip, A8527ProForAbs, A8528ProForCos, Integer.valueOf(A10120ProforVl), Short.valueOf(A10547ProH2O), A3589ProForMer, A13133ProForAct, A13936ProForRs, A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCPROFO");
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
                        processLevel1RW89( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption1RW0( ) ;
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
            load1RW89( ) ;
         }
         endLevel1RW89( ) ;
      }
      closeExtendedTableCursors1RW89( ) ;
   }

   public void update1RW89( )
   {
      beforeValidate1RW89( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1RW89( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1RW89( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1RW89( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1RW89( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01RW24 */
                  pr_default.execute(15, new Object[] {A6061ProForLab, A766ProForDsc, A4715ProForDsc2, Short.valueOf(A771ProForTie), Short.valueOf(A772ProForTmx), A769ProForMat, A674PorForFul, Short.valueOf(A773ProForUli), Integer.valueOf(A2392ProNumPro), Integer.valueOf(A2393ProNumRec), A3005ProRev, Short.valueOf(A4705ProForPau), Short.valueOf(A4706ProForRb), A4864ProForCCi, A4865ProForDCi, A5523ProForTip, A8527ProForAbs, A8528ProForCos, Integer.valueOf(A10120ProforVl), Short.valueOf(A10547ProH2O), A3589ProForMer, A13133ProForAct, A13936ProForRs, A396EmprCod, Boolean.valueOf(n764ProForCod), A764ProForCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCPROFO");
                  if ( (pr_default.getStatus(15) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCPROFO"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1RW89( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel1RW89( ) ;
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
         endLevel1RW89( ) ;
      }
      closeExtendedTableCursors1RW89( ) ;
   }

   public void deferredUpdate1RW89( )
   {
   }

   public void delete( )
   {
      beforeValidate1RW89( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1RW89( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1RW89( ) ;
         afterConfirm1RW89( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1RW89( ) ;
            if ( AnyError == 0 )
            {
               scanStart1RW90( ) ;
               while ( RcdFound90 != 0 )
               {
                  getByPrimaryKey1RW90( ) ;
                  delete1RW90( ) ;
                  scanNext1RW90( ) ;
               }
               scanEnd1RW90( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01RW25 */
                  pr_default.execute(16, new Object[] {A396EmprCod, Boolean.valueOf(n764ProForCod), A764ProForCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCPROFO");
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
      sMode89 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1RW89( ) ;
      Gx_mode = sMode89 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1RW89( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T01RW26 */
         pr_default.execute(17, new Object[] {A396EmprCod});
         A407EmprNom = T01RW26_A407EmprNom[0] ;
         n407EmprNom = T01RW26_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         pr_default.close(17);
         A941EmprCodV2 = A396EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A941EmprCodV2", A941EmprCodV2);
         GXt_int11 = (byte)(0) ;
         GXv_int12[0] = GXt_int11 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "%CDP", ""), ""), GXv_int12) ;
         procesosquimicos_trn_impl.this.GXt_int11 = GXv_int12[0] ;
         edtProForCPo_Visible = ((GXt_int11==1) ? 1 : 0) ;
         httpContext.ajax_rsp_assign_prop("", false, edtProForCPo_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForCPo_Visible), 5, 0), !bGXsfl_125_Refreshing);
         GXt_int11 = (byte)(0) ;
         GXv_int12[0] = GXt_int11 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "CLAVE2", ""), ""), GXv_int12) ;
         procesosquimicos_trn_impl.this.GXt_int11 = GXv_int12[0] ;
         edtProForClv_Visible = ((GXt_int11==1) ? 1 : 0) ;
         httpContext.ajax_rsp_assign_prop("", false, edtProForClv_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForClv_Visible), 5, 0), !bGXsfl_125_Refreshing);
         GXt_int11 = (byte)(0) ;
         GXv_int12[0] = GXt_int11 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "LAVAND", ""), ""), GXv_int12) ;
         procesosquimicos_trn_impl.this.GXt_int11 = GXv_int12[0] ;
         edtProForPau_Visible = ((GXt_int11==1) ? 1 : 0) ;
         httpContext.ajax_rsp_assign_prop("", false, edtProForPau_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForPau_Visible), 5, 0), true);
         GXt_int11 = (byte)(0) ;
         GXv_int12[0] = GXt_int11 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "LAVAND", ""), ""), GXv_int12) ;
         procesosquimicos_trn_impl.this.GXt_int11 = GXv_int12[0] ;
         if ( ! ( ( GXt_int11 == 1 ) ) )
         {
            divProforpau_cell_Class = httpContext.getMessage( "Invisible", "") ;
            httpContext.ajax_rsp_assign_prop("", false, divProforpau_cell_Internalname, "Class", divProforpau_cell_Class, true);
         }
         else
         {
            GXt_int11 = (byte)(0) ;
            GXv_int12[0] = GXt_int11 ;
            new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "LAVAND", ""), ""), GXv_int12) ;
            procesosquimicos_trn_impl.this.GXt_int11 = GXv_int12[0] ;
            if ( GXt_int11 == 1 )
            {
               divProforpau_cell_Class = httpContext.getMessage( "col-xs-12 col-sm-4 DataContentCell", "") ;
               httpContext.ajax_rsp_assign_prop("", false, divProforpau_cell_Internalname, "Class", divProforpau_cell_Class, true);
            }
         }
         GXt_int11 = (byte)(0) ;
         GXv_int12[0] = GXt_int11 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "TINTTO", ""), ""), GXv_int12) ;
         procesosquimicos_trn_impl.this.GXt_int11 = GXv_int12[0] ;
         edtProForAbs_Visible = ((GXt_int11==1) ? 1 : 0) ;
         httpContext.ajax_rsp_assign_prop("", false, edtProForAbs_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForAbs_Visible), 5, 0), true);
         GXt_int11 = (byte)(0) ;
         GXv_int12[0] = GXt_int11 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "TINTTO", ""), ""), GXv_int12) ;
         procesosquimicos_trn_impl.this.GXt_int11 = GXv_int12[0] ;
         if ( ! ( ( GXt_int11 == 1 ) ) )
         {
            divProforabs_cell_Class = httpContext.getMessage( "Invisible", "") ;
            httpContext.ajax_rsp_assign_prop("", false, divProforabs_cell_Internalname, "Class", divProforabs_cell_Class, true);
         }
         else
         {
            GXt_int11 = (byte)(0) ;
            GXv_int12[0] = GXt_int11 ;
            new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "TINTTO", ""), ""), GXv_int12) ;
            procesosquimicos_trn_impl.this.GXt_int11 = GXv_int12[0] ;
            if ( GXt_int11 == 1 )
            {
               divProforabs_cell_Class = httpContext.getMessage( "col-xs-12 col-sm-3 DataContentCell", "") ;
               httpContext.ajax_rsp_assign_prop("", false, divProforabs_cell_Internalname, "Class", divProforabs_cell_Class, true);
            }
         }
         GXt_int11 = (byte)(0) ;
         GXv_int12[0] = GXt_int11 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "TINTTO", ""), ""), GXv_int12) ;
         procesosquimicos_trn_impl.this.GXt_int11 = GXv_int12[0] ;
         edtProForCos_Visible = ((GXt_int11==1) ? 1 : 0) ;
         httpContext.ajax_rsp_assign_prop("", false, edtProForCos_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForCos_Visible), 5, 0), true);
         GXt_int11 = (byte)(0) ;
         GXv_int12[0] = GXt_int11 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "TINTTO", ""), ""), GXv_int12) ;
         procesosquimicos_trn_impl.this.GXt_int11 = GXv_int12[0] ;
         if ( ! ( ( GXt_int11 == 1 ) ) )
         {
            divProforcos_cell_Class = httpContext.getMessage( "Invisible", "") ;
            httpContext.ajax_rsp_assign_prop("", false, divProforcos_cell_Internalname, "Class", divProforcos_cell_Class, true);
         }
         else
         {
            GXt_int11 = (byte)(0) ;
            GXv_int12[0] = GXt_int11 ;
            new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "TINTTO", ""), ""), GXv_int12) ;
            procesosquimicos_trn_impl.this.GXt_int11 = GXv_int12[0] ;
            if ( GXt_int11 == 1 )
            {
               divProforcos_cell_Class = httpContext.getMessage( "col-xs-12 col-sm-2 DataContentCell", "") ;
               httpContext.ajax_rsp_assign_prop("", false, divProforcos_cell_Internalname, "Class", divProforcos_cell_Class, true);
            }
         }
         GXt_int11 = (byte)(0) ;
         GXv_int12[0] = GXt_int11 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "TEJIDO", ""), ""), GXv_int12) ;
         procesosquimicos_trn_impl.this.GXt_int11 = GXv_int12[0] ;
         GXt_int6 = (byte)(0) ;
         GXv_int5[0] = GXt_int6 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "LAVADO", ""), ""), GXv_int5) ;
         procesosquimicos_trn_impl.this.GXt_int6 = GXv_int5[0] ;
         edtProforVl_Visible = ((GXt_int11==1)||(GXt_int6==1) ? 1 : 0) ;
         httpContext.ajax_rsp_assign_prop("", false, edtProforVl_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProforVl_Visible), 5, 0), true);
         GXt_int11 = (byte)(0) ;
         GXv_int12[0] = GXt_int11 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "TEJIDO", ""), ""), GXv_int12) ;
         procesosquimicos_trn_impl.this.GXt_int11 = GXv_int12[0] ;
         GXt_int6 = (byte)(0) ;
         GXv_int5[0] = GXt_int6 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "LAVADO", ""), ""), GXv_int5) ;
         procesosquimicos_trn_impl.this.GXt_int6 = GXv_int5[0] ;
         if ( ! ( ( GXt_int11 == 1 ) || ( GXt_int6 == 1 ) ) )
         {
            divProforvl_cell_Class = httpContext.getMessage( "Invisible", "") ;
            httpContext.ajax_rsp_assign_prop("", false, divProforvl_cell_Internalname, "Class", divProforvl_cell_Class, true);
         }
         else
         {
            GXt_int11 = (byte)(0) ;
            GXv_int12[0] = GXt_int11 ;
            new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "TEJIDO", ""), ""), GXv_int12) ;
            procesosquimicos_trn_impl.this.GXt_int11 = GXv_int12[0] ;
            GXt_int6 = (byte)(0) ;
            GXv_int5[0] = GXt_int6 ;
            new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "LAVADO", ""), ""), GXv_int5) ;
            procesosquimicos_trn_impl.this.GXt_int6 = GXv_int5[0] ;
            if ( ( GXt_int11 == 1 ) || ( GXt_int6 == 1 ) )
            {
               divProforvl_cell_Class = httpContext.getMessage( "col-xs-12 col-sm-2 DataContentCell", "") ;
               httpContext.ajax_rsp_assign_prop("", false, divProforvl_cell_Internalname, "Class", divProforvl_cell_Class, true);
            }
         }
         GXt_int11 = (byte)(0) ;
         GXv_int12[0] = GXt_int11 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "JPF", ""), ""), GXv_int12) ;
         procesosquimicos_trn_impl.this.GXt_int11 = GXv_int12[0] ;
         edtProH2O_Visible = ((GXt_int11==1) ? 1 : 0) ;
         httpContext.ajax_rsp_assign_prop("", false, edtProH2O_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProH2O_Visible), 5, 0), true);
         GXt_int11 = (byte)(0) ;
         GXv_int12[0] = GXt_int11 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "JPF", ""), ""), GXv_int12) ;
         procesosquimicos_trn_impl.this.GXt_int11 = GXv_int12[0] ;
         if ( ! ( ( GXt_int11 == 1 ) ) )
         {
            divProh2o_cell_Class = httpContext.getMessage( "Invisible", "") ;
            httpContext.ajax_rsp_assign_prop("", false, divProh2o_cell_Internalname, "Class", divProh2o_cell_Class, true);
         }
         else
         {
            GXt_int11 = (byte)(0) ;
            GXv_int12[0] = GXt_int11 ;
            new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "JPF", ""), ""), GXv_int12) ;
            procesosquimicos_trn_impl.this.GXt_int11 = GXv_int12[0] ;
            if ( GXt_int11 == 1 )
            {
               divProh2o_cell_Class = httpContext.getMessage( "col-xs-12 col-sm-2 DataContentCell", "") ;
               httpContext.ajax_rsp_assign_prop("", false, divProh2o_cell_Internalname, "Class", divProh2o_cell_Class, true);
            }
         }
         GXt_int11 = (byte)(0) ;
         GXv_int12[0] = GXt_int11 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "AC2013", ""), ""), GXv_int12) ;
         procesosquimicos_trn_impl.this.GXt_int11 = GXv_int12[0] ;
         edtProForRs_Visible = ((GXt_int11==1) ? 1 : 0) ;
         httpContext.ajax_rsp_assign_prop("", false, edtProForRs_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForRs_Visible), 5, 0), true);
         GXt_int11 = (byte)(0) ;
         GXv_int12[0] = GXt_int11 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "AC2013", ""), ""), GXv_int12) ;
         procesosquimicos_trn_impl.this.GXt_int11 = GXv_int12[0] ;
         if ( ! ( ( GXt_int11 == 1 ) ) )
         {
            divProforrs_cell_Class = httpContext.getMessage( "Invisible", "") ;
            httpContext.ajax_rsp_assign_prop("", false, divProforrs_cell_Internalname, "Class", divProforrs_cell_Class, true);
         }
         else
         {
            GXt_int11 = (byte)(0) ;
            GXv_int12[0] = GXt_int11 ;
            new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "AC2013", ""), ""), GXv_int12) ;
            procesosquimicos_trn_impl.this.GXt_int11 = GXv_int12[0] ;
            if ( GXt_int11 == 1 )
            {
               divProforrs_cell_Class = httpContext.getMessage( "col-xs-12 col-sm-2 DataContentCell", "") ;
               httpContext.ajax_rsp_assign_prop("", false, divProforrs_cell_Internalname, "Class", divProforrs_cell_Class, true);
            }
         }
         A920ProForCodV = A764ProForCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A920ProForCodV", A920ProForCodV);
         A13740ProFDsc = GXutil.trim( A764ProForCod) + "-" + GXutil.trim( A766ProForDsc) ;
         httpContext.ajax_rsp_assign_attri("", false, "A13740ProFDsc", A13740ProFDsc);
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T01RW27 */
         pr_default.execute(18, new Object[] {A396EmprCod, Boolean.valueOf(n764ProForCod), A764ProForCod});
         if ( (pr_default.getStatus(18) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(18);
         /* Using cursor T01RW28 */
         pr_default.execute(19, new Object[] {A396EmprCod, Boolean.valueOf(n764ProForCod), A764ProForCod});
         if ( (pr_default.getStatus(19) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Tratamientos Quimicos", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(19);
         /* Using cursor T01RW29 */
         pr_default.execute(20, new Object[] {A396EmprCod, Boolean.valueOf(n764ProForCod), A764ProForCod});
         if ( (pr_default.getStatus(20) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Procesos", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(20);
         /* Using cursor T01RW30 */
         pr_default.execute(21, new Object[] {A396EmprCod, Boolean.valueOf(n764ProForCod), A764ProForCod});
         if ( (pr_default.getStatus(21) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "creest", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(21);
         /* Using cursor T01RW31 */
         pr_default.execute(22, new Object[] {A396EmprCod, Boolean.valueOf(n764ProForCod), A764ProForCod});
         if ( (pr_default.getStatus(22) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Procesos", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(22);
         /* Using cursor T01RW32 */
         pr_default.execute(23, new Object[] {A396EmprCod, Boolean.valueOf(n764ProForCod), A764ProForCod});
         if ( (pr_default.getStatus(23) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "FTPQS1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(23);
         /* Using cursor T01RW33 */
         pr_default.execute(24, new Object[] {A396EmprCod, Boolean.valueOf(n764ProForCod), A764ProForCod});
         if ( (pr_default.getStatus(24) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "RECETAS ACABADO , OLLAS (POT)", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(24);
         /* Using cursor T01RW34 */
         pr_default.execute(25, new Object[] {A396EmprCod, Boolean.valueOf(n764ProForCod), A764ProForCod});
         if ( (pr_default.getStatus(25) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PQPRGNO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(25);
         /* Using cursor T01RW35 */
         pr_default.execute(26, new Object[] {A396EmprCod, Boolean.valueOf(n764ProForCod), A764ProForCod});
         if ( (pr_default.getStatus(26) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CORAQ", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(26);
         /* Using cursor T01RW36 */
         pr_default.execute(27, new Object[] {A396EmprCod, Boolean.valueOf(n764ProForCod), A764ProForCod});
         if ( (pr_default.getStatus(27) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PROFSA", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(27);
         /* Using cursor T01RW37 */
         pr_default.execute(28, new Object[] {A396EmprCod, Boolean.valueOf(n764ProForCod), A764ProForCod});
         if ( (pr_default.getStatus(28) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CRECE1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(28);
         /* Using cursor T01RW38 */
         pr_default.execute(29, new Object[] {A396EmprCod, Boolean.valueOf(n764ProForCod), A764ProForCod});
         if ( (pr_default.getStatus(29) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DISQUI", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(29);
         /* Using cursor T01RW39 */
         pr_default.execute(30, new Object[] {A396EmprCod, Boolean.valueOf(n764ProForCod), A764ProForCod});
         if ( (pr_default.getStatus(30) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "FASQUI", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(30);
         /* Using cursor T01RW40 */
         pr_default.execute(31, new Object[] {A396EmprCod, Boolean.valueOf(n764ProForCod), A764ProForCod});
         if ( (pr_default.getStatus(31) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PROFOC", "")+" ("+httpContext.getMessage( "PQuimicos", "")+")"}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(31);
         /* Using cursor T01RW41 */
         pr_default.execute(32, new Object[] {A396EmprCod, Boolean.valueOf(n764ProForCod), A764ProForCod});
         if ( (pr_default.getStatus(32) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PROFOC", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(32);
         /* Using cursor T01RW42 */
         pr_default.execute(33, new Object[] {A396EmprCod, Boolean.valueOf(n764ProForCod), A764ProForCod});
         if ( (pr_default.getStatus(33) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TIPCOP", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(33);
         /* Using cursor T01RW43 */
         pr_default.execute(34, new Object[] {A396EmprCod, Boolean.valueOf(n764ProForCod), A764ProForCod});
         if ( (pr_default.getStatus(34) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PRERE1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(34);
         /* Using cursor T01RW44 */
         pr_default.execute(35, new Object[] {A396EmprCod, Boolean.valueOf(n764ProForCod), A764ProForCod});
         if ( (pr_default.getStatus(35) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Lineas de Formulación por Fase", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(35);
         /* Using cursor T01RW45 */
         pr_default.execute(36, new Object[] {A396EmprCod, Boolean.valueOf(n764ProForCod), A764ProForCod});
         if ( (pr_default.getStatus(36) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "FASPR1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(36);
         /* Using cursor T01RW46 */
         pr_default.execute(37, new Object[] {A396EmprCod, Boolean.valueOf(n764ProForCod), A764ProForCod});
         if ( (pr_default.getStatus(37) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CRECET", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(37);
         /* Using cursor T01RW47 */
         pr_default.execute(38, new Object[] {A396EmprCod, Boolean.valueOf(n764ProForCod), A764ProForCod});
         if ( (pr_default.getStatus(38) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LMACPR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(38);
         /* Using cursor T01RW48 */
         pr_default.execute(39, new Object[] {A396EmprCod, Boolean.valueOf(n764ProForCod), A764ProForCod});
         if ( (pr_default.getStatus(39) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LFORMU", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(39);
         /* Using cursor T01RW49 */
         pr_default.execute(40, new Object[] {A396EmprCod, Boolean.valueOf(n764ProForCod), A764ProForCod});
         if ( (pr_default.getStatus(40) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ESCMAN", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(40);
      }
   }

   public void processNestedLevel1RW90( )
   {
      nGXsfl_125_idx = 0 ;
      while ( nGXsfl_125_idx < nRC_GXsfl_125 )
      {
         readRow1RW90( ) ;
         if ( ( nRcdExists_90 != 0 ) || ( nIsMod_90 != 0 ) )
         {
            standaloneNotModal1RW90( ) ;
            getKey1RW90( ) ;
            if ( ( nRcdExists_90 == 0 ) && ( nRcdDeleted_90 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert1RW90( ) ;
            }
            else
            {
               if ( RcdFound90 != 0 )
               {
                  if ( ( nRcdDeleted_90 != 0 ) && ( nRcdExists_90 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete1RW90( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_90 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update1RW90( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_90 == 0 )
                  {
                     GXCCtl = "PROFORLIN_" + sGXsfl_125_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtProForLin_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtProForLin_Internalname, GXutil.ltrim( localUtil.ntoc( A767ProForLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtProForPrd_Internalname, GXutil.rtrim( A770ProForPrd)) ;
         httpContext.changePostValue( edtPrdFind_Internalname, GXutil.rtrim( A710PrdFind)) ;
         httpContext.changePostValue( edtPrdNomForm_Internalname, GXutil.rtrim( A13976PrdNomForm)) ;
         httpContext.changePostValue( edtProForDes_Internalname, GXutil.rtrim( A765ProForDes)) ;
         httpContext.changePostValue( edtProForCPo_Internalname, GXutil.ltrim( localUtil.ntoc( A6062ProForCPo, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtProForCan_Internalname, GXutil.ltrim( localUtil.ntoc( A762ProForCan, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtForPrdUMe_Internalname, h490ForPrdUMe) ;
         httpContext.changePostValue( edtavClaves_Internalname, AV41Claves) ;
         httpContext.changePostValue( edtavClavesdel_Internalname, AV45Clavesdel) ;
         httpContext.changePostValue( edtProForCla_Internalname, GXutil.rtrim( A763ProForCla)) ;
         httpContext.changePostValue( edtProForClv_Internalname, GXutil.rtrim( A5358ProForClv)) ;
         httpContext.changePostValue( edtProForNro_Internalname, GXutil.ltrim( localUtil.ntoc( A1645ProForNro, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtProForTnq_Internalname, GXutil.ltrim( localUtil.ntoc( A3379ProForTnq, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPrdMaxFind_Internalname, GXutil.rtrim( A717PrdMaxFind)) ;
         httpContext.changePostValue( "ZT_"+"Z767ProForLin_"+sGXsfl_125_idx, GXutil.ltrim( localUtil.ntoc( Z767ProForLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z6062ProForCPo_"+sGXsfl_125_idx, GXutil.ltrim( localUtil.ntoc( Z6062ProForCPo, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z13178ProForFT_"+sGXsfl_125_idx, GXutil.rtrim( Z13178ProForFT)) ;
         httpContext.changePostValue( "ZT_"+"Z765ProForDes_"+sGXsfl_125_idx, GXutil.rtrim( Z765ProForDes)) ;
         httpContext.changePostValue( "ZT_"+"Z770ProForPrd_"+sGXsfl_125_idx, GXutil.rtrim( Z770ProForPrd)) ;
         httpContext.changePostValue( "ZT_"+"Z13111ProForDe2_"+sGXsfl_125_idx, GXutil.rtrim( Z13111ProForDe2)) ;
         httpContext.changePostValue( "ZT_"+"Z762ProForCan_"+sGXsfl_125_idx, GXutil.ltrim( localUtil.ntoc( Z762ProForCan, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z1645ProForNro_"+sGXsfl_125_idx, GXutil.ltrim( localUtil.ntoc( Z1645ProForNro, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z3379ProForTnq_"+sGXsfl_125_idx, GXutil.ltrim( localUtil.ntoc( Z3379ProForTnq, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z763ProForCla_"+sGXsfl_125_idx, GXutil.rtrim( Z763ProForCla)) ;
         httpContext.changePostValue( "ZT_"+"Z5358ProForClv_"+sGXsfl_125_idx, GXutil.rtrim( Z5358ProForClv)) ;
         httpContext.changePostValue( "ZT_"+"Z490ForPrdUMe_"+sGXsfl_125_idx, GXutil.ltrim( localUtil.ntoc( Z490ForPrdUMe, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T762ProForCan_"+sGXsfl_125_idx, GXutil.ltrim( localUtil.ntoc( O762ProForCan, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T767ProForLin_"+sGXsfl_125_idx, GXutil.ltrim( localUtil.ntoc( O767ProForLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T490ForPrdUMe_"+sGXsfl_125_idx, GXutil.ltrim( localUtil.ntoc( O490ForPrdUMe, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T763ProForCla_"+sGXsfl_125_idx, GXutil.rtrim( O763ProForCla)) ;
         httpContext.changePostValue( "T5358ProForClv_"+sGXsfl_125_idx, GXutil.rtrim( O5358ProForClv)) ;
         httpContext.changePostValue( "nRcdDeleted_90_"+sGXsfl_125_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_90, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_90_"+sGXsfl_125_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_90, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_90_"+sGXsfl_125_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_90, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "N6062ProForCPo_"+sGXsfl_125_idx, GXutil.ltrim( localUtil.ntoc( A6062ProForCPo, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_90 != 0 )
         {
            httpContext.changePostValue( "PROFORLIN_"+sGXsfl_125_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProForLin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PROFORPRD_"+sGXsfl_125_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProForPrd_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRDFIND_"+sGXsfl_125_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdFind_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRDNOMFORM_"+sGXsfl_125_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdNomForm_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PROFORDES_"+sGXsfl_125_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProForDes_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PROFORCPO_"+sGXsfl_125_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProForCPo_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PROFORCPO_"+sGXsfl_125_idx+"Visible", GXutil.ltrim( localUtil.ntoc( edtProForCPo_Visible, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PROFORCAN_"+sGXsfl_125_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProForCan_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FORPRDUME_"+sGXsfl_125_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtForPrdUMe_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "vCLAVES_"+sGXsfl_125_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavClaves_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "vCLAVES_"+sGXsfl_125_idx+"Tooltiptext", GXutil.rtrim( edtavClaves_Tooltiptext)) ;
            httpContext.changePostValue( "vCLAVES_"+sGXsfl_125_idx+"Visible", GXutil.ltrim( localUtil.ntoc( edtavClaves_Visible, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "vCLAVESDEL_"+sGXsfl_125_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavClavesdel_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "vCLAVESDEL_"+sGXsfl_125_idx+"Tooltiptext", GXutil.rtrim( edtavClavesdel_Tooltiptext)) ;
            httpContext.changePostValue( "vCLAVESDEL_"+sGXsfl_125_idx+"Visible", GXutil.ltrim( localUtil.ntoc( edtavClavesdel_Visible, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PROFORCLA_"+sGXsfl_125_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProForCla_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PROFORCLV_"+sGXsfl_125_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProForClv_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PROFORCLV_"+sGXsfl_125_idx+"Visible", GXutil.ltrim( localUtil.ntoc( edtProForClv_Visible, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PROFORNRO_"+sGXsfl_125_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProForNro_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PROFORTNQ_"+sGXsfl_125_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProForTnq_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRDMAXFIND_"+sGXsfl_125_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdMaxFind_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll1RW90( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_90 = (short)(0) ;
      nIsMod_90 = (short)(0) ;
      nRcdDeleted_90 = (short)(0) ;
   }

   public void processLevel1RW89( )
   {
      /* Save parent mode. */
      sMode89 = Gx_mode ;
      processNestedLevel1RW90( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode89 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevel1RW89( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(6);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1RW89( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "formulaciontinte.procesosquimicos_trn");
         if ( AnyError == 0 )
         {
            confirmValues1RW0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "formulaciontinte.procesosquimicos_trn");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1RW89( )
   {
      /* Scan By routine */
      /* Using cursor T01RW50 */
      pr_default.execute(41);
      RcdFound89 = (short)(0) ;
      if ( (pr_default.getStatus(41) != 101) )
      {
         RcdFound89 = (short)(1) ;
         A396EmprCod = T01RW50_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A764ProForCod = T01RW50_A764ProForCod[0] ;
         n764ProForCod = T01RW50_n764ProForCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A764ProForCod", A764ProForCod);
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1RW89( )
   {
      /* Scan next routine */
      pr_default.readNext(41);
      RcdFound89 = (short)(0) ;
      if ( (pr_default.getStatus(41) != 101) )
      {
         RcdFound89 = (short)(1) ;
         A396EmprCod = T01RW50_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A764ProForCod = T01RW50_A764ProForCod[0] ;
         n764ProForCod = T01RW50_n764ProForCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A764ProForCod", A764ProForCod);
      }
   }

   public void scanEnd1RW89( )
   {
      pr_default.close(41);
   }

   public void afterConfirm1RW89( )
   {
      /* After Confirm Rules */
      if ( true /* After */ && ! (GXutil.strcmp("", A6061ProForLab)==0) )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_char3[0] = A6061ProForLab ;
         GXv_int12[0] = (byte)(AV38Exis_pro) ;
         new app.pexiprq(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_int12) ;
         procesosquimicos_trn_impl.this.A396EmprCod = GXv_char4[0] ;
         procesosquimicos_trn_impl.this.A6061ProForLab = GXv_char3[0] ;
         procesosquimicos_trn_impl.this.AV38Exis_pro = GXv_int12[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A6061ProForLab", A6061ProForLab);
         httpContext.ajax_rsp_assign_attri("", false, "AV38Exis_pro", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV38Exis_pro), 4, 0));
      }
      if ( true /* After */ && ! (GXutil.strcmp("", A6061ProForLab)==0) && ( AV38Exis_pro == 0 ) && ( GXutil.strcmp(A764ProForCod, A6061ProForLab) != 0 ) )
      {
         httpContext.GX_msglist.addItem(AV29Msg1, 1, "PROFORCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtProForCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         return  ;
      }
   }

   public void beforeInsert1RW89( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1RW89( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1RW89( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1RW89( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1RW89( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1RW89( )
   {
      edtProForCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProForCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForCod_Enabled), 5, 0), true);
      edtProForDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProForDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForDsc_Enabled), 5, 0), true);
      edtProForDsc2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProForDsc2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForDsc2_Enabled), 5, 0), true);
      chkProForAct.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, chkProForAct.getInternalname(), "Enabled", GXutil.ltrimstr( chkProForAct.getEnabled(), 5, 0), true);
      edtProForTip_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProForTip_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForTip_Enabled), 5, 0), true);
      edtProForRs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProForRs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForRs_Enabled), 5, 0), true);
      cmbProRev.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbProRev.getInternalname(), "Enabled", GXutil.ltrimstr( cmbProRev.getEnabled(), 5, 0), true);
      edtProForTie_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProForTie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForTie_Enabled), 5, 0), true);
      edtProForTmx_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProForTmx_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForTmx_Enabled), 5, 0), true);
      edtProForMat_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProForMat_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForMat_Enabled), 5, 0), true);
      edtProForRb_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProForRb_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForRb_Enabled), 5, 0), true);
      edtProForLab_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProForLab_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForLab_Enabled), 5, 0), true);
      edtProForAbs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProForAbs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForAbs_Enabled), 5, 0), true);
      edtProForCos_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProForCos_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForCos_Enabled), 5, 0), true);
      edtProforVl_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProforVl_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProforVl_Enabled), 5, 0), true);
      edtProH2O_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProH2O_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProH2O_Enabled), 5, 0), true);
      edtProNumPro_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProNumPro_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProNumPro_Enabled), 5, 0), true);
      edtProNumRec_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProNumRec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProNumRec_Enabled), 5, 0), true);
      edtProForPau_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProForPau_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForPau_Enabled), 5, 0), true);
      edtavComboproforlab_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavComboproforlab_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavComboproforlab_Enabled), 5, 0), true);
      edtProForCCi_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProForCCi_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForCCi_Enabled), 5, 0), true);
      edtProForDCi_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProForDCi_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForDCi_Enabled), 5, 0), true);
      edtProForMer_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProForMer_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForMer_Enabled), 5, 0), true);
      edtProFDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProFDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProFDsc_Enabled), 5, 0), true);
      edtProForCodV_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProForCodV_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForCodV_Enabled), 5, 0), true);
      edtEmprCodV2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCodV2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCodV2_Enabled), 5, 0), true);
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtPorForFul_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPorForFul_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPorForFul_Enabled), 5, 0), true);
   }

   public void zm1RW90( int GX_JID )
   {
      if ( ( GX_JID == 64 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z6062ProForCPo = T01RW3_A6062ProForCPo[0] ;
            Z13178ProForFT = T01RW3_A13178ProForFT[0] ;
            Z765ProForDes = T01RW3_A765ProForDes[0] ;
            Z770ProForPrd = T01RW3_A770ProForPrd[0] ;
            Z13111ProForDe2 = T01RW3_A13111ProForDe2[0] ;
            Z762ProForCan = T01RW3_A762ProForCan[0] ;
            Z1645ProForNro = T01RW3_A1645ProForNro[0] ;
            Z3379ProForTnq = T01RW3_A3379ProForTnq[0] ;
            Z763ProForCla = T01RW3_A763ProForCla[0] ;
            Z5358ProForClv = T01RW3_A5358ProForClv[0] ;
            Z490ForPrdUMe = T01RW3_A490ForPrdUMe[0] ;
         }
         else
         {
            Z6062ProForCPo = A6062ProForCPo ;
            Z13178ProForFT = A13178ProForFT ;
            Z765ProForDes = A765ProForDes ;
            Z770ProForPrd = A770ProForPrd ;
            Z13111ProForDe2 = A13111ProForDe2 ;
            Z762ProForCan = A762ProForCan ;
            Z1645ProForNro = A1645ProForNro ;
            Z3379ProForTnq = A3379ProForTnq ;
            Z763ProForCla = A763ProForCla ;
            Z5358ProForClv = A5358ProForClv ;
            Z490ForPrdUMe = A490ForPrdUMe ;
         }
      }
      if ( GX_JID == -64 )
      {
         Z764ProForCod = A764ProForCod ;
         Z767ProForLin = A767ProForLin ;
         Z6062ProForCPo = A6062ProForCPo ;
         Z13178ProForFT = A13178ProForFT ;
         Z765ProForDes = A765ProForDes ;
         Z770ProForPrd = A770ProForPrd ;
         Z13111ProForDe2 = A13111ProForDe2 ;
         Z762ProForCan = A762ProForCan ;
         Z1645ProForNro = A1645ProForNro ;
         Z3379ProForTnq = A3379ProForTnq ;
         Z763ProForCla = A763ProForCla ;
         Z5358ProForClv = A5358ProForClv ;
         Z396EmprCod = A396EmprCod ;
         Z490ForPrdUMe = A490ForPrdUMe ;
         Z710PrdFind = A710PrdFind ;
         Z488ForPrdDsc = A488ForPrdDsc ;
      }
   }

   public void standaloneNotModal1RW90( )
   {
      edtProForCla_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProForCla_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForCla_Enabled), 5, 0), !bGXsfl_125_Refreshing);
      edtProForClv_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProForClv_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForClv_Enabled), 5, 0), !bGXsfl_125_Refreshing);
      edtPrdFind_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdFind_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdFind_Enabled), 5, 0), !bGXsfl_125_Refreshing);
      edtPrdNomForm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdNomForm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNomForm_Enabled), 5, 0), !bGXsfl_125_Refreshing);
      edtPrdMaxFind_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdMaxFind_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdMaxFind_Enabled), 5, 0), !bGXsfl_125_Refreshing);
      if ( (0==AV13CdpPor) )
      {
         edtProForCPo_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtProForCPo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForCPo_Enabled), 5, 0), !bGXsfl_125_Refreshing);
      }
      else
      {
         edtProForCPo_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtProForCPo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForCPo_Enabled), 5, 0), !bGXsfl_125_Refreshing);
      }
   }

   public void standaloneModal1RW90( )
   {
      if ( isIns( )  && (DecimalUtil.compareTo(DecimalUtil.ZERO, A6062ProForCPo)==0) && ( Gx_BScreen == 0 ) )
      {
         A6062ProForCPo = DecimalUtil.stringToDec("100.00") ;
      }
      if ( isIns( )  && (GXutil.strcmp("", A13178ProForFT)==0) && ( Gx_BScreen == 0 ) )
      {
         A13178ProForFT = " " ;
         httpContext.ajax_rsp_assign_attri("", false, "A13178ProForFT", A13178ProForFT);
      }
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtProForLin_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtProForLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForLin_Enabled), 5, 0), !bGXsfl_125_Refreshing);
      }
      else
      {
         edtProForLin_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtProForLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForLin_Enabled), 5, 0), !bGXsfl_125_Refreshing);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ( Gx_BScreen == 0 ) )
      {
      }
   }

   public void load1RW90( )
   {
      /* Using cursor T01RW51 */
      pr_default.execute(42, new Object[] {A396EmprCod, Boolean.valueOf(n764ProForCod), A764ProForCod, Short.valueOf(A767ProForLin)});
      if ( (pr_default.getStatus(42) != 101) )
      {
         RcdFound90 = (short)(1) ;
         A6062ProForCPo = T01RW51_A6062ProForCPo[0] ;
         A13178ProForFT = T01RW51_A13178ProForFT[0] ;
         A765ProForDes = T01RW51_A765ProForDes[0] ;
         A770ProForPrd = T01RW51_A770ProForPrd[0] ;
         A13111ProForDe2 = T01RW51_A13111ProForDe2[0] ;
         A488ForPrdDsc = T01RW51_A488ForPrdDsc[0] ;
         n488ForPrdDsc = T01RW51_n488ForPrdDsc[0] ;
         A762ProForCan = T01RW51_A762ProForCan[0] ;
         A1645ProForNro = T01RW51_A1645ProForNro[0] ;
         A3379ProForTnq = T01RW51_A3379ProForTnq[0] ;
         A763ProForCla = T01RW51_A763ProForCla[0] ;
         A5358ProForClv = T01RW51_A5358ProForClv[0] ;
         A490ForPrdUMe = T01RW51_A490ForPrdUMe[0] ;
         A710PrdFind = T01RW51_A710PrdFind[0] ;
         n710PrdFind = T01RW51_n710PrdFind[0] ;
         zm1RW90( -64) ;
      }
      pr_default.close(42);
      onLoadActions1RW90( ) ;
   }

   public void onLoadActions1RW90( )
   {
      GXt_char1 = A13976PrdNomForm ;
      GXv_char4[0] = A396EmprCod ;
      GXv_char3[0] = A770ProForPrd ;
      GXv_char2[0] = GXt_char1 ;
      new app.pprddsc(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2) ;
      procesosquimicos_trn_impl.this.A396EmprCod = GXv_char4[0] ;
      procesosquimicos_trn_impl.this.A770ProForPrd = GXv_char3[0] ;
      procesosquimicos_trn_impl.this.GXt_char1 = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A13976PrdNomForm = GXt_char1 ;
      /* Using cursor T01RW6 */
      pr_default.execute(2, new Object[] {Boolean.valueOf(n710PrdFind), A710PrdFind, A770ProForPrd, A396EmprCod});
      if ( (pr_default.getStatus(2) != 101) )
      {
         A4340PrdUMeFind = T01RW6_A4340PrdUMeFind[0] ;
         n4340PrdUMeFind = T01RW6_n4340PrdUMeFind[0] ;
      }
      else
      {
         A4340PrdUMeFind = (byte)(0) ;
         n4340PrdUMeFind = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A4340PrdUMeFind", GXutil.str( A4340PrdUMeFind, 1, 0));
      }
      pr_default.close(2);
      if ( ( GXutil.strcmp(A710PrdFind, "xxxxxx") != 0 ) && ! (GXutil.strcmp("", A770ProForPrd)==0) && isIns( )  )
      {
         A490ForPrdUMe = A4340PrdUMeFind ;
         /* Using cursor T01RW52 */
         pr_default.execute(43, new Object[] {A396EmprCod, Byte.valueOf(A490ForPrdUMe)});
         h490ForPrdUMe = "" ;
         while ( (pr_default.getStatus(43) != 101) )
         {
            h490ForPrdUMe = T01RW52_A13746ForPrdCDsc[0] ;
            if (true) break;
         }
         pr_default.close(43);
         httpContext.ajax_rsp_assign_attri("", false, "h490ForPrdUMe", h490ForPrdUMe);
      }
      A768ProForLinV = A767ProForLin ;
      httpContext.ajax_rsp_assign_attri("", false, "A768ProForLinV", GXutil.ltrimstr( DecimalUtil.doubleToDec(A768ProForLinV), 4, 0));
      /* Using cursor T01RW12 */
      pr_default.execute(3, new Object[] {Short.valueOf(A768ProForLinV), A941EmprCodV2, A920ProForCodV, A941EmprCodV2, A920ProForCodV, Short.valueOf(A768ProForLinV), A941EmprCodV2, A920ProForCodV, Short.valueOf(A768ProForLinV), A941EmprCodV2, A920ProForCodV});
      if ( (pr_default.getStatus(3) != 101) )
      {
         A717PrdMaxFind = T01RW12_A717PrdMaxFind[0] ;
         n717PrdMaxFind = T01RW12_n717PrdMaxFind[0] ;
      }
      else
      {
         A717PrdMaxFind = "" ;
         n717PrdMaxFind = false ;
      }
      pr_default.close(3);
      AV7oldProforlin = O767ProForLin ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7oldProforlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV7oldProforlin), 4, 0));
      AV39Msg_del = httpContext.getMessage( "Proceso=", "") + GXutil.trim( A764ProForCod) + httpContext.getMessage( " DEL Linea=", "") + GXutil.str( A767ProForLin, 4, 0) + httpContext.getMessage( " Producto=", "") + GXutil.trim( A770ProForPrd) + httpContext.getMessage( " Un=", "") + GXutil.str( A490ForPrdUMe, 1, 0) + httpContext.getMessage( " Cant= ", "") + GXutil.str( A762ProForCan, 12, 5) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV39Msg_del", AV39Msg_del);
      if ( ( GXutil.strcmp(A710PrdFind, "xxxxxx") != 0 ) && true /* After */ && isIns( )  )
      {
         A765ProForDes = A13976PrdNomForm ;
      }
      AV31Un = O490ForPrdUMe ;
      httpContext.ajax_rsp_assign_attri("", false, "AV31Un", GXutil.str( AV31Un, 1, 0));
      AV30oldCant = O762ProForCan ;
      httpContext.ajax_rsp_assign_attri("", false, "AV30oldCant", GXutil.ltrimstr( AV30oldCant, 12, 5));
      if ( isUpd( )  && true /* Level */ && ( DecimalUtil.compareTo(A762ProForCan, O762ProForCan) != 0 ) )
      {
         AV10Msg_e = httpContext.getMessage( "Proceso=", "") + GXutil.trim( A764ProForCod) + httpContext.getMessage( "UPD Linea=", "") + GXutil.str( A767ProForLin, 4, 0) + httpContext.getMessage( " Un New=", "") + GXutil.str( A490ForPrdUMe, 1, 0) + httpContext.getMessage( httpContext.getMessage( " Cant New=", ""), "") + GXutil.trim( GXutil.str( A762ProForCan, 12, 5)) + httpContext.getMessage( " Un New=", "") + GXutil.str( A490ForPrdUMe, 1, 0) + httpContext.getMessage( " Cant Old=", "") + GXutil.str( AV30oldCant, 12, 5) + GXutil.trim( GXutil.str( AV31Un, 1, 0)) + httpContext.getMessage( "Clave= ", "") + A763ProForCla + httpContext.getMessage( "ClaveII= ", "") + A5358ProForClv ;
         httpContext.ajax_rsp_assign_attri("", false, "AV10Msg_e", AV10Msg_e);
      }
      /* Using cursor T01RW53 */
      pr_default.execute(44, new Object[] {A396EmprCod, Byte.valueOf(A490ForPrdUMe)});
      h490ForPrdUMe = "" ;
      while ( (pr_default.getStatus(44) != 101) )
      {
         h490ForPrdUMe = T01RW53_A13746ForPrdCDsc[0] ;
         if (true) break;
      }
      pr_default.close(44);
      httpContext.ajax_rsp_assign_attri("", false, "h490ForPrdUMe", h490ForPrdUMe);
   }

   public void checkExtendedTable1RW90( )
   {
      nIsDirty_90 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal1RW90( ) ;
      if ( (GXutil.strcmp("", h490ForPrdUMe)==0) )
      {
         nIsDirty_90 = (short)(1) ;
         A490ForPrdUMe = (byte)(0) ;
      }
      else
      {
         A13746ForPrdCDsc = h490ForPrdUMe ;
         /* Using cursor T01RW54 */
         pr_default.execute(45, new Object[] {A13746ForPrdCDsc, A396EmprCod});
         A396EmprCod = T01RW54_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A490ForPrdUMe = T01RW54_A490ForPrdUMe[0] ;
         A490ForPrdUMe = T01RW54_A490ForPrdUMe[0] ;
         if ( ! ( (pr_default.getStatus(45) == 101) ) )
         {
            pr_default.readNext(45);
            if ( ! ( (pr_default.getStatus(45) == 101) ) )
            {
               GXCCtl = "FORPRDUME_" + sGXsfl_125_idx ;
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Codigo-Descripcion", "")}), 1, GXCCtl);
               AnyError = (short)(1) ;
               GX_FocusControl = edtForPrdUMe_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
         }
         pr_default.close(45);
      }
      httpContext.ajax_rsp_assign_attri("", false, "h490ForPrdUMe", h490ForPrdUMe);
      if ( (GXutil.strcmp("", h490ForPrdUMe)==0) )
      {
         nIsDirty_90 = (short)(1) ;
         A490ForPrdUMe = (byte)(0) ;
      }
      else
      {
         A13746ForPrdCDsc = h490ForPrdUMe ;
         /* Using cursor T01RW55 */
         pr_default.execute(46, new Object[] {A13746ForPrdCDsc, A396EmprCod});
         A490ForPrdUMe = T01RW55_A490ForPrdUMe[0] ;
         A490ForPrdUMe = T01RW55_A490ForPrdUMe[0] ;
         if ( ! ( (pr_default.getStatus(46) == 101) ) )
         {
            pr_default.readNext(46);
            if ( ! ( (pr_default.getStatus(46) == 101) ) )
            {
               GXCCtl = "FORPRDUME_" + sGXsfl_125_idx ;
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Codigo-Descripcion", "")}), 1, GXCCtl);
               AnyError = (short)(1) ;
               GX_FocusControl = edtForPrdUMe_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
         }
         pr_default.close(46);
      }
      httpContext.ajax_rsp_assign_attri("", false, "h490ForPrdUMe", h490ForPrdUMe);
      /* Using cursor T01RW13 */
      pr_default.execute(4, new Object[] {A396EmprCod, Byte.valueOf(A490ForPrdUMe)});
      if ( (pr_default.getStatus(4) == 101) )
      {
         GXCCtl = "FORPRDUME_" + sGXsfl_125_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "UNMEPR", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtForPrdUMe_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A488ForPrdDsc = T01RW13_A488ForPrdDsc[0] ;
      n488ForPrdDsc = T01RW13_n488ForPrdDsc[0] ;
      pr_default.close(4);
      /* Using cursor T01RW14 */
      pr_default.execute(5, new Object[] {A396EmprCod, A770ProForPrd});
      if ( (pr_default.getStatus(5) != 101) )
      {
         A710PrdFind = T01RW14_A710PrdFind[0] ;
         n710PrdFind = T01RW14_n710PrdFind[0] ;
      }
      else
      {
         nIsDirty_90 = (short)(1) ;
         A710PrdFind = "xxxxxx" ;
         n710PrdFind = false ;
      }
      pr_default.close(5);
      nIsDirty_90 = (short)(1) ;
      GXt_char1 = A13976PrdNomForm ;
      GXv_char4[0] = A396EmprCod ;
      GXv_char3[0] = A770ProForPrd ;
      GXv_char2[0] = GXt_char1 ;
      new app.pprddsc(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2) ;
      procesosquimicos_trn_impl.this.A396EmprCod = GXv_char4[0] ;
      procesosquimicos_trn_impl.this.A770ProForPrd = GXv_char3[0] ;
      procesosquimicos_trn_impl.this.GXt_char1 = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A13976PrdNomForm = GXt_char1 ;
      /* Using cursor T01RW6 */
      pr_default.execute(2, new Object[] {Boolean.valueOf(n710PrdFind), A710PrdFind, A770ProForPrd, A396EmprCod});
      if ( (pr_default.getStatus(2) != 101) )
      {
         A4340PrdUMeFind = T01RW6_A4340PrdUMeFind[0] ;
         n4340PrdUMeFind = T01RW6_n4340PrdUMeFind[0] ;
      }
      else
      {
         nIsDirty_90 = (short)(1) ;
         A4340PrdUMeFind = (byte)(0) ;
         n4340PrdUMeFind = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A4340PrdUMeFind", GXutil.str( A4340PrdUMeFind, 1, 0));
      }
      pr_default.close(2);
      if ( ( GXutil.strcmp(A710PrdFind, "xxxxxx") != 0 ) && ! (GXutil.strcmp("", A770ProForPrd)==0) && isIns( )  )
      {
         nIsDirty_90 = (short)(1) ;
         A490ForPrdUMe = A4340PrdUMeFind ;
         /* Using cursor T01RW56 */
         pr_default.execute(47, new Object[] {A396EmprCod, Byte.valueOf(A490ForPrdUMe)});
         h490ForPrdUMe = "" ;
         while ( (pr_default.getStatus(47) != 101) )
         {
            h490ForPrdUMe = T01RW56_A13746ForPrdCDsc[0] ;
            if (true) break;
         }
         pr_default.close(47);
         httpContext.ajax_rsp_assign_attri("", false, "h490ForPrdUMe", h490ForPrdUMe);
      }
      nIsDirty_90 = (short)(1) ;
      A768ProForLinV = A767ProForLin ;
      httpContext.ajax_rsp_assign_attri("", false, "A768ProForLinV", GXutil.ltrimstr( DecimalUtil.doubleToDec(A768ProForLinV), 4, 0));
      /* Using cursor T01RW12 */
      pr_default.execute(3, new Object[] {Short.valueOf(A768ProForLinV), A941EmprCodV2, A920ProForCodV, A941EmprCodV2, A920ProForCodV, Short.valueOf(A768ProForLinV), A941EmprCodV2, A920ProForCodV, Short.valueOf(A768ProForLinV), A941EmprCodV2, A920ProForCodV});
      if ( (pr_default.getStatus(3) != 101) )
      {
         A717PrdMaxFind = T01RW12_A717PrdMaxFind[0] ;
         n717PrdMaxFind = T01RW12_n717PrdMaxFind[0] ;
      }
      else
      {
         nIsDirty_90 = (short)(1) ;
         A717PrdMaxFind = "" ;
         n717PrdMaxFind = false ;
      }
      pr_default.close(3);
      AV7oldProforlin = O767ProForLin ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7oldProforlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV7oldProforlin), 4, 0));
      AV39Msg_del = httpContext.getMessage( "Proceso=", "") + GXutil.trim( A764ProForCod) + httpContext.getMessage( " DEL Linea=", "") + GXutil.str( A767ProForLin, 4, 0) + httpContext.getMessage( " Producto=", "") + GXutil.trim( A770ProForPrd) + httpContext.getMessage( " Un=", "") + GXutil.str( A490ForPrdUMe, 1, 0) + httpContext.getMessage( " Cant= ", "") + GXutil.str( A762ProForCan, 12, 5) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV39Msg_del", AV39Msg_del);
      if ( true /* After */ && (0==A767ProForLin) && ( isIns( )  || isUpd( )  ) )
      {
         GXCCtl = "PROFORLIN_" + sGXsfl_125_idx ;
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Numero de linea incorrecto ¡", ""), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtProForLin_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ( GXutil.strcmp(A710PrdFind, "xxxxxx") != 0 ) && true /* After */ && isIns( )  )
      {
         nIsDirty_90 = (short)(1) ;
         A765ProForDes = A13976PrdNomForm ;
      }
      if ( (GXutil.strcmp("", A770ProForPrd)==0) && (GXutil.strcmp("", A765ProForDes)==0) && true /* After */ )
      {
         GXCCtl = "PROFORDES_" + sGXsfl_125_idx ;
         httpContext.GX_msglist.addItem("Es necesario introducir un producto o una descripcion", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtProForDes_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ! ( ( A490ForPrdUMe == 0 ) || ( A490ForPrdUMe == 1 ) || ( A490ForPrdUMe == 2 ) || ( A490ForPrdUMe == 3 ) ) )
      {
         GXCCtl = "FORPRDUME_" + sGXsfl_125_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Unidad Medida", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtForPrdUMe_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      AV31Un = O490ForPrdUMe ;
      httpContext.ajax_rsp_assign_attri("", false, "AV31Un", GXutil.str( AV31Un, 1, 0));
      if ( true /* After */ && (0==A767ProForLin) && ( isIns( )  || isUpd( )  ) )
      {
         GXCCtl = "FORPRDUME_" + sGXsfl_125_idx ;
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Numero de linea incorrecto ¡", ""), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtForPrdUMe_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      AV30oldCant = O762ProForCan ;
      httpContext.ajax_rsp_assign_attri("", false, "AV30oldCant", GXutil.ltrimstr( AV30oldCant, 12, 5));
      if ( isUpd( )  && true /* Level */ && ( DecimalUtil.compareTo(A762ProForCan, O762ProForCan) != 0 ) )
      {
         AV10Msg_e = httpContext.getMessage( "Proceso=", "") + GXutil.trim( A764ProForCod) + httpContext.getMessage( "UPD Linea=", "") + GXutil.str( A767ProForLin, 4, 0) + httpContext.getMessage( " Un New=", "") + GXutil.str( A490ForPrdUMe, 1, 0) + httpContext.getMessage( httpContext.getMessage( " Cant New=", ""), "") + GXutil.trim( GXutil.str( A762ProForCan, 12, 5)) + httpContext.getMessage( " Un New=", "") + GXutil.str( A490ForPrdUMe, 1, 0) + httpContext.getMessage( " Cant Old=", "") + GXutil.str( AV30oldCant, 12, 5) + GXutil.trim( GXutil.str( AV31Un, 1, 0)) + httpContext.getMessage( "Clave= ", "") + A763ProForCla + httpContext.getMessage( "ClaveII= ", "") + A5358ProForClv ;
         httpContext.ajax_rsp_assign_attri("", false, "AV10Msg_e", AV10Msg_e);
      }
      if ( isUpd( )  && true /* Level */ && ( ( DecimalUtil.compareTo(A762ProForCan, O762ProForCan) != 0 ) || ( A490ForPrdUMe != O490ForPrdUMe ) || ( GXutil.strcmp(A763ProForCla, O763ProForCla) != 0 ) || ( GXutil.strcmp(A5358ProForClv, O5358ProForClv) != 0 ) ) )
      {
         new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV53Pgmname, AV8Usurcod, AV9Station, AV10Msg_e, 99999999, (byte)(0), "@") ;
      }
      if ( ( DecimalUtil.compareTo(A6062ProForCPo, DecimalUtil.stringToDec("100.00")) > 0 ) && ( AV13CdpPor == 1 ) && true /* After */ )
      {
         GXCCtl = "PROFORCPO_" + sGXsfl_125_idx ;
         httpContext.GX_msglist.addItem("Cantidad(%Cdp) superior al 100,00%", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtProForCPo_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ( DecimalUtil.compareTo(A6062ProForCPo, DecimalUtil.stringToDec("0.00")) == 0 ) && ( AV13CdpPor == 1 ) && true /* After */ )
      {
         GXCCtl = "PROFORCPO_" + sGXsfl_125_idx ;
         httpContext.GX_msglist.addItem("Cantidad(%Cdp) igual a Cero", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtProForCPo_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
   }

   public void closeExtendedTableCursors1RW90( )
   {
      pr_default.close(5);
      pr_default.close(2);
      pr_default.close(3);
      pr_default.close(4);
   }

   public void enableDisable1RW90( )
   {
   }

   public void gxload_68( String A396EmprCod ,
                          String A770ProForPrd )
   {
      /* Using cursor T01RW57 */
      pr_default.execute(48, new Object[] {A396EmprCod, A770ProForPrd});
      if ( (pr_default.getStatus(48) != 101) )
      {
         A710PrdFind = T01RW57_A710PrdFind[0] ;
         n710PrdFind = T01RW57_n710PrdFind[0] ;
      }
      else
      {
         A710PrdFind = "xxxxxx" ;
         n710PrdFind = false ;
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A710PrdFind))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(48) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(48);
   }

   public void gxload_65( String A396EmprCod ,
                          String A764ProForCod ,
                          short A767ProForLin ,
                          String A710PrdFind ,
                          String A770ProForPrd )
   {
      /* Using cursor T01RW60 */
      pr_default.execute(49, new Object[] {Boolean.valueOf(n710PrdFind), A710PrdFind, A770ProForPrd, A396EmprCod});
      if ( (pr_default.getStatus(49) != 101) )
      {
         A4340PrdUMeFind = T01RW60_A4340PrdUMeFind[0] ;
         n4340PrdUMeFind = T01RW60_n4340PrdUMeFind[0] ;
      }
      else
      {
         A4340PrdUMeFind = (byte)(0) ;
         n4340PrdUMeFind = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A4340PrdUMeFind", GXutil.str( A4340PrdUMeFind, 1, 0));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A4340PrdUMeFind, (byte)(1), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(49) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(49);
   }

   public void gxload_66( String A396EmprCod ,
                          String A764ProForCod ,
                          short A767ProForLin ,
                          short A768ProForLinV ,
                          String A941EmprCodV2 ,
                          String A920ProForCodV )
   {
      /* Using cursor T01RW66 */
      pr_default.execute(50, new Object[] {Short.valueOf(A768ProForLinV), A941EmprCodV2, A920ProForCodV, A941EmprCodV2, A920ProForCodV, Short.valueOf(A768ProForLinV), A941EmprCodV2, A920ProForCodV, Short.valueOf(A768ProForLinV), A941EmprCodV2, A920ProForCodV});
      if ( (pr_default.getStatus(50) != 101) )
      {
         A717PrdMaxFind = T01RW66_A717PrdMaxFind[0] ;
         n717PrdMaxFind = T01RW66_n717PrdMaxFind[0] ;
      }
      else
      {
         A717PrdMaxFind = "" ;
         n717PrdMaxFind = false ;
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A717PrdMaxFind))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(50) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(50);
   }

   public void gxload_67( String A396EmprCod ,
                          byte A490ForPrdUMe )
   {
      /* Using cursor T01RW67 */
      pr_default.execute(51, new Object[] {A396EmprCod, Byte.valueOf(A490ForPrdUMe)});
      if ( (pr_default.getStatus(51) == 101) )
      {
         GXCCtl = "FORPRDUME_" + sGXsfl_125_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "UNMEPR", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtForPrdUMe_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A488ForPrdDsc = T01RW67_A488ForPrdDsc[0] ;
      n488ForPrdDsc = T01RW67_n488ForPrdDsc[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A488ForPrdDsc))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(51) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(51);
   }

   public void getKey1RW90( )
   {
      if ( (GXutil.strcmp("", h490ForPrdUMe)==0) )
      {
         A490ForPrdUMe = (byte)(0) ;
      }
      else
      {
         A13746ForPrdCDsc = h490ForPrdUMe ;
         /* Using cursor T01RW68 */
         pr_default.execute(52, new Object[] {A13746ForPrdCDsc, A396EmprCod});
         A396EmprCod = T01RW68_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A490ForPrdUMe = T01RW68_A490ForPrdUMe[0] ;
         A490ForPrdUMe = T01RW68_A490ForPrdUMe[0] ;
         if ( ! ( (pr_default.getStatus(52) == 101) ) )
         {
            pr_default.readNext(52);
            if ( ! ( (pr_default.getStatus(52) == 101) ) )
            {
               GXCCtl = "FORPRDUME_" + sGXsfl_125_idx ;
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Codigo-Descripcion", "")}), 1, GXCCtl);
               AnyError = (short)(1) ;
               GX_FocusControl = edtForPrdUMe_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
         }
         pr_default.close(52);
      }
      httpContext.ajax_rsp_assign_attri("", false, "h490ForPrdUMe", h490ForPrdUMe);
      /* Using cursor T01RW69 */
      pr_default.execute(53, new Object[] {A396EmprCod, Boolean.valueOf(n764ProForCod), A764ProForCod, Short.valueOf(A767ProForLin)});
      if ( (pr_default.getStatus(53) != 101) )
      {
         RcdFound90 = (short)(1) ;
      }
      else
      {
         RcdFound90 = (short)(0) ;
      }
      pr_default.close(53);
   }

   public void getByPrimaryKey1RW90( )
   {
      /* Using cursor T01RW3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Boolean.valueOf(n764ProForCod), A764ProForCod, Short.valueOf(A767ProForLin)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1RW90( 64) ;
         RcdFound90 = (short)(1) ;
         initializeNonKey1RW90( ) ;
         A767ProForLin = T01RW3_A767ProForLin[0] ;
         A6062ProForCPo = T01RW3_A6062ProForCPo[0] ;
         A13178ProForFT = T01RW3_A13178ProForFT[0] ;
         A765ProForDes = T01RW3_A765ProForDes[0] ;
         A770ProForPrd = T01RW3_A770ProForPrd[0] ;
         A13111ProForDe2 = T01RW3_A13111ProForDe2[0] ;
         A762ProForCan = T01RW3_A762ProForCan[0] ;
         A1645ProForNro = T01RW3_A1645ProForNro[0] ;
         A3379ProForTnq = T01RW3_A3379ProForTnq[0] ;
         A763ProForCla = T01RW3_A763ProForCla[0] ;
         A5358ProForClv = T01RW3_A5358ProForClv[0] ;
         A490ForPrdUMe = T01RW3_A490ForPrdUMe[0] ;
         O762ProForCan = A762ProForCan ;
         O767ProForLin = A767ProForLin ;
         O490ForPrdUMe = A490ForPrdUMe ;
         O763ProForCla = A763ProForCla ;
         O5358ProForClv = A5358ProForClv ;
         Z396EmprCod = A396EmprCod ;
         Z764ProForCod = A764ProForCod ;
         Z767ProForLin = A767ProForLin ;
         sMode90 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load1RW90( ) ;
         Gx_mode = sMode90 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound90 = (short)(0) ;
         initializeNonKey1RW90( ) ;
         sMode90 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1RW90( ) ;
         Gx_mode = sMode90 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1RW90( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency1RW90( )
   {
      if ( isDlt( ) )
      {
         if ( (GXutil.strcmp("", h490ForPrdUMe)==0) )
         {
            A490ForPrdUMe = (byte)(0) ;
         }
         else
         {
            A13746ForPrdCDsc = h490ForPrdUMe ;
            /* Using cursor T01RW70 */
            pr_default.execute(54, new Object[] {A13746ForPrdCDsc, A396EmprCod});
            A396EmprCod = T01RW70_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A490ForPrdUMe = T01RW70_A490ForPrdUMe[0] ;
            A490ForPrdUMe = T01RW70_A490ForPrdUMe[0] ;
            if ( ! ( (pr_default.getStatus(54) == 101) ) )
            {
               pr_default.readNext(54);
               if ( ! ( (pr_default.getStatus(54) == 101) ) )
               {
                  GXCCtl = "FORPRDUME_" + sGXsfl_125_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Codigo-Descripcion", "")}), 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtForPrdUMe_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
            }
            pr_default.close(54);
         }
         httpContext.ajax_rsp_assign_attri("", false, "h490ForPrdUMe", h490ForPrdUMe);
      }
      if ( ! isIns( ) )
      {
         /* Using cursor T01RW2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Boolean.valueOf(n764ProForCod), A764ProForCod, Short.valueOf(A767ProForLin)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPLPROFO"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( DecimalUtil.compareTo(Z6062ProForCPo, T01RW2_A6062ProForCPo[0]) != 0 ) || ( GXutil.strcmp(Z13178ProForFT, T01RW2_A13178ProForFT[0]) != 0 ) || ( GXutil.strcmp(Z765ProForDes, T01RW2_A765ProForDes[0]) != 0 ) || ( GXutil.strcmp(Z770ProForPrd, T01RW2_A770ProForPrd[0]) != 0 ) || ( GXutil.strcmp(Z13111ProForDe2, T01RW2_A13111ProForDe2[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( DecimalUtil.compareTo(Z762ProForCan, T01RW2_A762ProForCan[0]) != 0 ) || ( Z1645ProForNro != T01RW2_A1645ProForNro[0] ) || ( Z3379ProForTnq != T01RW2_A3379ProForTnq[0] ) || ( GXutil.strcmp(Z763ProForCla, T01RW2_A763ProForCla[0]) != 0 ) || ( GXutil.strcmp(Z5358ProForClv, T01RW2_A5358ProForClv[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z490ForPrdUMe != T01RW2_A490ForPrdUMe[0] ) )
         {
            if ( DecimalUtil.compareTo(Z6062ProForCPo, T01RW2_A6062ProForCPo[0]) != 0 )
            {
               GXutil.writeLogln("formulaciontinte.procesosquimicos_trn:[seudo value changed for attri]"+"ProForCPo");
               GXutil.writeLogRaw("Old: ",Z6062ProForCPo);
               GXutil.writeLogRaw("Current: ",T01RW2_A6062ProForCPo[0]);
            }
            if ( GXutil.strcmp(Z13178ProForFT, T01RW2_A13178ProForFT[0]) != 0 )
            {
               GXutil.writeLogln("formulaciontinte.procesosquimicos_trn:[seudo value changed for attri]"+"ProForFT");
               GXutil.writeLogRaw("Old: ",Z13178ProForFT);
               GXutil.writeLogRaw("Current: ",T01RW2_A13178ProForFT[0]);
            }
            if ( GXutil.strcmp(Z765ProForDes, T01RW2_A765ProForDes[0]) != 0 )
            {
               GXutil.writeLogln("formulaciontinte.procesosquimicos_trn:[seudo value changed for attri]"+"ProForDes");
               GXutil.writeLogRaw("Old: ",Z765ProForDes);
               GXutil.writeLogRaw("Current: ",T01RW2_A765ProForDes[0]);
            }
            if ( GXutil.strcmp(Z770ProForPrd, T01RW2_A770ProForPrd[0]) != 0 )
            {
               GXutil.writeLogln("formulaciontinte.procesosquimicos_trn:[seudo value changed for attri]"+"ProForPrd");
               GXutil.writeLogRaw("Old: ",Z770ProForPrd);
               GXutil.writeLogRaw("Current: ",T01RW2_A770ProForPrd[0]);
            }
            if ( GXutil.strcmp(Z13111ProForDe2, T01RW2_A13111ProForDe2[0]) != 0 )
            {
               GXutil.writeLogln("formulaciontinte.procesosquimicos_trn:[seudo value changed for attri]"+"ProForDe2");
               GXutil.writeLogRaw("Old: ",Z13111ProForDe2);
               GXutil.writeLogRaw("Current: ",T01RW2_A13111ProForDe2[0]);
            }
            if ( DecimalUtil.compareTo(Z762ProForCan, T01RW2_A762ProForCan[0]) != 0 )
            {
               GXutil.writeLogln("formulaciontinte.procesosquimicos_trn:[seudo value changed for attri]"+"ProForCan");
               GXutil.writeLogRaw("Old: ",Z762ProForCan);
               GXutil.writeLogRaw("Current: ",T01RW2_A762ProForCan[0]);
            }
            if ( Z1645ProForNro != T01RW2_A1645ProForNro[0] )
            {
               GXutil.writeLogln("formulaciontinte.procesosquimicos_trn:[seudo value changed for attri]"+"ProForNro");
               GXutil.writeLogRaw("Old: ",Z1645ProForNro);
               GXutil.writeLogRaw("Current: ",T01RW2_A1645ProForNro[0]);
            }
            if ( Z3379ProForTnq != T01RW2_A3379ProForTnq[0] )
            {
               GXutil.writeLogln("formulaciontinte.procesosquimicos_trn:[seudo value changed for attri]"+"ProForTnq");
               GXutil.writeLogRaw("Old: ",Z3379ProForTnq);
               GXutil.writeLogRaw("Current: ",T01RW2_A3379ProForTnq[0]);
            }
            if ( GXutil.strcmp(Z763ProForCla, T01RW2_A763ProForCla[0]) != 0 )
            {
               GXutil.writeLogln("formulaciontinte.procesosquimicos_trn:[seudo value changed for attri]"+"ProForCla");
               GXutil.writeLogRaw("Old: ",Z763ProForCla);
               GXutil.writeLogRaw("Current: ",T01RW2_A763ProForCla[0]);
            }
            if ( GXutil.strcmp(Z5358ProForClv, T01RW2_A5358ProForClv[0]) != 0 )
            {
               GXutil.writeLogln("formulaciontinte.procesosquimicos_trn:[seudo value changed for attri]"+"ProForClv");
               GXutil.writeLogRaw("Old: ",Z5358ProForClv);
               GXutil.writeLogRaw("Current: ",T01RW2_A5358ProForClv[0]);
            }
            if ( Z490ForPrdUMe != T01RW2_A490ForPrdUMe[0] )
            {
               GXutil.writeLogln("formulaciontinte.procesosquimicos_trn:[seudo value changed for attri]"+"ForPrdUMe");
               GXutil.writeLogRaw("Old: ",Z490ForPrdUMe);
               GXutil.writeLogRaw("Current: ",T01RW2_A490ForPrdUMe[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPLPROFO"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1RW90( )
   {
      beforeValidate1RW90( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1RW90( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1RW90( 0) ;
         checkOptimisticConcurrency1RW90( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1RW90( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1RW90( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01RW71 */
                  pr_default.execute(55, new Object[] {Boolean.valueOf(n764ProForCod), A764ProForCod, Short.valueOf(A767ProForLin), A6062ProForCPo, A13178ProForFT, A765ProForDes, A770ProForPrd, A13111ProForDe2, A762ProForCan, Byte.valueOf(A1645ProForNro), Byte.valueOf(A3379ProForTnq), A763ProForCla, A5358ProForClv, A396EmprCod, Byte.valueOf(A490ForPrdUMe)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLPROFO");
                  if ( (pr_default.getStatus(55) == 1) )
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
            load1RW90( ) ;
         }
         endLevel1RW90( ) ;
      }
      closeExtendedTableCursors1RW90( ) ;
   }

   public void update1RW90( )
   {
      beforeValidate1RW90( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1RW90( ) ;
      }
      if ( ( nIsMod_90 != 0 ) || ( nIsDirty_90 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency1RW90( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm1RW90( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate1RW90( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T01RW72 */
                     pr_default.execute(56, new Object[] {A6062ProForCPo, A13178ProForFT, A765ProForDes, A770ProForPrd, A13111ProForDe2, A762ProForCan, Byte.valueOf(A1645ProForNro), Byte.valueOf(A3379ProForTnq), A763ProForCla, A5358ProForClv, Byte.valueOf(A490ForPrdUMe), A396EmprCod, Boolean.valueOf(n764ProForCod), A764ProForCod, Short.valueOf(A767ProForLin)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLPROFO");
                     if ( (pr_default.getStatus(56) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPLPROFO"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate1RW90( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey1RW90( ) ;
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
            endLevel1RW90( ) ;
         }
      }
      closeExtendedTableCursors1RW90( ) ;
   }

   public void deferredUpdate1RW90( )
   {
   }

   public void delete1RW90( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1RW90( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1RW90( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1RW90( ) ;
         afterConfirm1RW90( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1RW90( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01RW73 */
               pr_default.execute(57, new Object[] {A396EmprCod, Boolean.valueOf(n764ProForCod), A764ProForCod, Short.valueOf(A767ProForLin)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLPROFO");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
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
      sMode90 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1RW90( ) ;
      Gx_mode = sMode90 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1RW90( )
   {
      standaloneModal1RW90( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         if ( true /* After */ && (0==A767ProForLin) && ( isIns( )  || isUpd( )  ) )
         {
            GXCCtl = "PROFORLIN_" + sGXsfl_125_idx ;
            httpContext.GX_msglist.addItem(httpContext.getMessage( "Numero de linea incorrecto ¡", ""), 1, GXCCtl);
            AnyError = (short)(1) ;
            GX_FocusControl = edtProForLin_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         if ( true /* After */ && (0==A767ProForLin) && ( isIns( )  || isUpd( )  ) )
         {
            GXCCtl = "FORPRDUME_" + sGXsfl_125_idx ;
            httpContext.GX_msglist.addItem(httpContext.getMessage( "Numero de linea incorrecto ¡", ""), 1, GXCCtl);
            AnyError = (short)(1) ;
            GX_FocusControl = edtForPrdUMe_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         A768ProForLinV = A767ProForLin ;
         httpContext.ajax_rsp_assign_attri("", false, "A768ProForLinV", GXutil.ltrimstr( DecimalUtil.doubleToDec(A768ProForLinV), 4, 0));
         /* Using cursor T01RW79 */
         pr_default.execute(58, new Object[] {Short.valueOf(A768ProForLinV), A941EmprCodV2, A920ProForCodV, A941EmprCodV2, A920ProForCodV, Short.valueOf(A768ProForLinV), A941EmprCodV2, A920ProForCodV, Short.valueOf(A768ProForLinV), A941EmprCodV2, A920ProForCodV});
         if ( (pr_default.getStatus(58) != 101) )
         {
            A717PrdMaxFind = T01RW79_A717PrdMaxFind[0] ;
            n717PrdMaxFind = T01RW79_n717PrdMaxFind[0] ;
         }
         else
         {
            A717PrdMaxFind = "" ;
            n717PrdMaxFind = false ;
         }
         pr_default.close(58);
         AV7oldProforlin = O767ProForLin ;
         httpContext.ajax_rsp_assign_attri("", false, "AV7oldProforlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV7oldProforlin), 4, 0));
         /* Using cursor T01RW80 */
         pr_default.execute(59, new Object[] {A396EmprCod, A770ProForPrd});
         if ( (pr_default.getStatus(59) != 101) )
         {
            A710PrdFind = T01RW80_A710PrdFind[0] ;
            n710PrdFind = T01RW80_n710PrdFind[0] ;
         }
         else
         {
            A710PrdFind = "xxxxxx" ;
            n710PrdFind = false ;
         }
         pr_default.close(59);
         /* Using cursor T01RW83 */
         pr_default.execute(60, new Object[] {Boolean.valueOf(n710PrdFind), A710PrdFind, A770ProForPrd, A396EmprCod});
         if ( (pr_default.getStatus(60) != 101) )
         {
            A4340PrdUMeFind = T01RW83_A4340PrdUMeFind[0] ;
            n4340PrdUMeFind = T01RW83_n4340PrdUMeFind[0] ;
         }
         else
         {
            A4340PrdUMeFind = (byte)(0) ;
            n4340PrdUMeFind = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A4340PrdUMeFind", GXutil.str( A4340PrdUMeFind, 1, 0));
         }
         pr_default.close(60);
         GXt_char1 = A13976PrdNomForm ;
         GXv_char4[0] = A396EmprCod ;
         GXv_char3[0] = A770ProForPrd ;
         GXv_char2[0] = GXt_char1 ;
         new app.pprddsc(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2) ;
         procesosquimicos_trn_impl.this.A396EmprCod = GXv_char4[0] ;
         procesosquimicos_trn_impl.this.A770ProForPrd = GXv_char3[0] ;
         procesosquimicos_trn_impl.this.GXt_char1 = GXv_char2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A13976PrdNomForm = GXt_char1 ;
         /* Using cursor T01RW84 */
         pr_default.execute(61, new Object[] {A396EmprCod, Byte.valueOf(A490ForPrdUMe)});
         A488ForPrdDsc = T01RW84_A488ForPrdDsc[0] ;
         n488ForPrdDsc = T01RW84_n488ForPrdDsc[0] ;
         pr_default.close(61);
         AV31Un = O490ForPrdUMe ;
         httpContext.ajax_rsp_assign_attri("", false, "AV31Un", GXutil.str( AV31Un, 1, 0));
         AV30oldCant = O762ProForCan ;
         httpContext.ajax_rsp_assign_attri("", false, "AV30oldCant", GXutil.ltrimstr( AV30oldCant, 12, 5));
         AV39Msg_del = httpContext.getMessage( "Proceso=", "") + GXutil.trim( A764ProForCod) + httpContext.getMessage( " DEL Linea=", "") + GXutil.str( A767ProForLin, 4, 0) + httpContext.getMessage( " Producto=", "") + GXutil.trim( A770ProForPrd) + httpContext.getMessage( " Un=", "") + GXutil.str( A490ForPrdUMe, 1, 0) + httpContext.getMessage( " Cant= ", "") + GXutil.str( A762ProForCan, 12, 5) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV39Msg_del", AV39Msg_del);
         if ( isDlt( )  && true /* Level */ )
         {
            new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV53Pgmname, AV8Usurcod, AV9Station, AV39Msg_del, A767ProForLin, (byte)(0), "@") ;
         }
         if ( isUpd( )  && true /* Level */ && ( DecimalUtil.compareTo(A762ProForCan, O762ProForCan) != 0 ) )
         {
            AV10Msg_e = httpContext.getMessage( "Proceso=", "") + GXutil.trim( A764ProForCod) + httpContext.getMessage( "UPD Linea=", "") + GXutil.str( A767ProForLin, 4, 0) + httpContext.getMessage( " Un New=", "") + GXutil.str( A490ForPrdUMe, 1, 0) + httpContext.getMessage( httpContext.getMessage( " Cant New=", ""), "") + GXutil.trim( GXutil.str( A762ProForCan, 12, 5)) + httpContext.getMessage( " Un New=", "") + GXutil.str( A490ForPrdUMe, 1, 0) + httpContext.getMessage( " Cant Old=", "") + GXutil.str( AV30oldCant, 12, 5) + GXutil.trim( GXutil.str( AV31Un, 1, 0)) + httpContext.getMessage( "Clave= ", "") + A763ProForCla + httpContext.getMessage( "ClaveII= ", "") + A5358ProForClv ;
            httpContext.ajax_rsp_assign_attri("", false, "AV10Msg_e", AV10Msg_e);
         }
      }
   }

   public void endLevel1RW90( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1RW90( )
   {
      /* Scan By routine */
      /* Using cursor T01RW85 */
      pr_default.execute(62, new Object[] {A396EmprCod, Boolean.valueOf(n764ProForCod), A764ProForCod});
      RcdFound90 = (short)(0) ;
      if ( (pr_default.getStatus(62) != 101) )
      {
         RcdFound90 = (short)(1) ;
         A767ProForLin = T01RW85_A767ProForLin[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1RW90( )
   {
      /* Scan next routine */
      pr_default.readNext(62);
      RcdFound90 = (short)(0) ;
      if ( (pr_default.getStatus(62) != 101) )
      {
         RcdFound90 = (short)(1) ;
         A767ProForLin = T01RW85_A767ProForLin[0] ;
      }
   }

   public void scanEnd1RW90( )
   {
      pr_default.close(62);
   }

   public void afterConfirm1RW90( )
   {
      /* After Confirm Rules */
      if ( isIns( )  && true /* After */ )
      {
         AV10Msg_e = httpContext.getMessage( "Proceso=", "") + GXutil.trim( A764ProForCod) + httpContext.getMessage( " IN Linea=", "") + GXutil.str( A767ProForLin, 4, 0) + httpContext.getMessage( " Producto=", "") + GXutil.trim( A770ProForPrd) + httpContext.getMessage( " Un=", "") + GXutil.str( A490ForPrdUMe, 1, 0) + httpContext.getMessage( " Cant= ", "") + GXutil.str( A762ProForCan, 12, 5) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV10Msg_e", AV10Msg_e);
      }
      if ( isIns( )  && true /* After */ )
      {
         new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV53Pgmname, AV8Usurcod, AV9Station, AV10Msg_e, A767ProForLin, (byte)(0), "@") ;
      }
   }

   public void beforeInsert1RW90( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1RW90( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1RW90( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1RW90( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1RW90( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1RW90( )
   {
      edtProForLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProForLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForLin_Enabled), 5, 0), !bGXsfl_125_Refreshing);
      edtProForPrd_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProForPrd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForPrd_Enabled), 5, 0), !bGXsfl_125_Refreshing);
      edtPrdFind_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdFind_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdFind_Enabled), 5, 0), !bGXsfl_125_Refreshing);
      edtPrdNomForm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdNomForm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNomForm_Enabled), 5, 0), !bGXsfl_125_Refreshing);
      edtProForDes_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProForDes_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForDes_Enabled), 5, 0), !bGXsfl_125_Refreshing);
      edtProForCPo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProForCPo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForCPo_Enabled), 5, 0), !bGXsfl_125_Refreshing);
      edtProForCan_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProForCan_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForCan_Enabled), 5, 0), !bGXsfl_125_Refreshing);
      edtForPrdUMe_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtForPrdUMe_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForPrdUMe_Enabled), 5, 0), !bGXsfl_125_Refreshing);
      edtProForCla_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProForCla_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForCla_Enabled), 5, 0), !bGXsfl_125_Refreshing);
      edtProForClv_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProForClv_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForClv_Enabled), 5, 0), !bGXsfl_125_Refreshing);
      edtProForNro_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProForNro_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForNro_Enabled), 5, 0), !bGXsfl_125_Refreshing);
      edtProForTnq_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProForTnq_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForTnq_Enabled), 5, 0), !bGXsfl_125_Refreshing);
      edtPrdMaxFind_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdMaxFind_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdMaxFind_Enabled), 5, 0), !bGXsfl_125_Refreshing);
   }

   public void send_integrity_lvl_hashes1RW90( )
   {
   }

   public void send_integrity_lvl_hashes1RW89( )
   {
   }

   public void subsflControlProps_12590( )
   {
      edtProForLin_Internalname = "PROFORLIN_"+sGXsfl_125_idx ;
      edtProForPrd_Internalname = "PROFORPRD_"+sGXsfl_125_idx ;
      edtPrdFind_Internalname = "PRDFIND_"+sGXsfl_125_idx ;
      edtPrdNomForm_Internalname = "PRDNOMFORM_"+sGXsfl_125_idx ;
      edtProForDes_Internalname = "PROFORDES_"+sGXsfl_125_idx ;
      edtProForCPo_Internalname = "PROFORCPO_"+sGXsfl_125_idx ;
      edtProForCan_Internalname = "PROFORCAN_"+sGXsfl_125_idx ;
      edtForPrdUMe_Internalname = "FORPRDUME_"+sGXsfl_125_idx ;
      edtavClaves_Internalname = "vCLAVES_"+sGXsfl_125_idx ;
      edtavClavesdel_Internalname = "vCLAVESDEL_"+sGXsfl_125_idx ;
      edtProForCla_Internalname = "PROFORCLA_"+sGXsfl_125_idx ;
      edtProForClv_Internalname = "PROFORCLV_"+sGXsfl_125_idx ;
      edtProForNro_Internalname = "PROFORNRO_"+sGXsfl_125_idx ;
      edtProForTnq_Internalname = "PROFORTNQ_"+sGXsfl_125_idx ;
      edtPrdMaxFind_Internalname = "PRDMAXFIND_"+sGXsfl_125_idx ;
   }

   public void subsflControlProps_fel_12590( )
   {
      edtProForLin_Internalname = "PROFORLIN_"+sGXsfl_125_fel_idx ;
      edtProForPrd_Internalname = "PROFORPRD_"+sGXsfl_125_fel_idx ;
      edtPrdFind_Internalname = "PRDFIND_"+sGXsfl_125_fel_idx ;
      edtPrdNomForm_Internalname = "PRDNOMFORM_"+sGXsfl_125_fel_idx ;
      edtProForDes_Internalname = "PROFORDES_"+sGXsfl_125_fel_idx ;
      edtProForCPo_Internalname = "PROFORCPO_"+sGXsfl_125_fel_idx ;
      edtProForCan_Internalname = "PROFORCAN_"+sGXsfl_125_fel_idx ;
      edtForPrdUMe_Internalname = "FORPRDUME_"+sGXsfl_125_fel_idx ;
      edtavClaves_Internalname = "vCLAVES_"+sGXsfl_125_fel_idx ;
      edtavClavesdel_Internalname = "vCLAVESDEL_"+sGXsfl_125_fel_idx ;
      edtProForCla_Internalname = "PROFORCLA_"+sGXsfl_125_fel_idx ;
      edtProForClv_Internalname = "PROFORCLV_"+sGXsfl_125_fel_idx ;
      edtProForNro_Internalname = "PROFORNRO_"+sGXsfl_125_fel_idx ;
      edtProForTnq_Internalname = "PROFORTNQ_"+sGXsfl_125_fel_idx ;
      edtPrdMaxFind_Internalname = "PRDMAXFIND_"+sGXsfl_125_fel_idx ;
   }

   public void addRow1RW90( )
   {
      nGXsfl_125_idx = (int)(nGXsfl_125_idx+1) ;
      sGXsfl_125_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_125_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_12590( ) ;
      sendRow1RW90( ) ;
   }

   public void sendRow1RW90( )
   {
      Gridlevel_procesosquimicoslineasRow = GXWebRow.GetNew(context) ;
      if ( subGridlevel_procesosquimicoslineas_Backcolorstyle == 0 )
      {
         /* None style subfile background logic. */
         subGridlevel_procesosquimicoslineas_Backstyle = (byte)(0) ;
         if ( GXutil.strcmp(subGridlevel_procesosquimicoslineas_Class, "") != 0 )
         {
            subGridlevel_procesosquimicoslineas_Linesclass = subGridlevel_procesosquimicoslineas_Class+"Odd" ;
         }
      }
      else if ( subGridlevel_procesosquimicoslineas_Backcolorstyle == 1 )
      {
         /* Uniform style subfile background logic. */
         subGridlevel_procesosquimicoslineas_Backstyle = (byte)(0) ;
         subGridlevel_procesosquimicoslineas_Backcolor = subGridlevel_procesosquimicoslineas_Allbackcolor ;
         if ( GXutil.strcmp(subGridlevel_procesosquimicoslineas_Class, "") != 0 )
         {
            subGridlevel_procesosquimicoslineas_Linesclass = subGridlevel_procesosquimicoslineas_Class+"Uniform" ;
         }
      }
      else if ( subGridlevel_procesosquimicoslineas_Backcolorstyle == 2 )
      {
         /* Header style subfile background logic. */
         subGridlevel_procesosquimicoslineas_Backstyle = (byte)(1) ;
         if ( GXutil.strcmp(subGridlevel_procesosquimicoslineas_Class, "") != 0 )
         {
            subGridlevel_procesosquimicoslineas_Linesclass = subGridlevel_procesosquimicoslineas_Class+"Odd" ;
         }
         subGridlevel_procesosquimicoslineas_Backcolor = (int)(0x0) ;
      }
      else if ( subGridlevel_procesosquimicoslineas_Backcolorstyle == 3 )
      {
         /* Report style subfile background logic. */
         subGridlevel_procesosquimicoslineas_Backstyle = (byte)(1) ;
         if ( ((int)((nGXsfl_125_idx) % (2))) == 0 )
         {
            subGridlevel_procesosquimicoslineas_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGridlevel_procesosquimicoslineas_Class, "") != 0 )
            {
               subGridlevel_procesosquimicoslineas_Linesclass = subGridlevel_procesosquimicoslineas_Class+"Even" ;
            }
         }
         else
         {
            subGridlevel_procesosquimicoslineas_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGridlevel_procesosquimicoslineas_Class, "") != 0 )
            {
               subGridlevel_procesosquimicoslineas_Linesclass = subGridlevel_procesosquimicoslineas_Class+"Odd" ;
            }
         }
      }
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_90_" + sGXsfl_125_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 126,'',false,'" + sGXsfl_125_idx + "',125)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_procesosquimicoslineasRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtProForLin_Internalname,GXutil.ltrim( localUtil.ntoc( A767ProForLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A767ProForLin), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,126);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtProForLin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtProForLin_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(125),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_90_" + sGXsfl_125_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 127,'',false,'" + sGXsfl_125_idx + "',125)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_procesosquimicoslineasRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtProForPrd_Internalname,GXutil.rtrim( A770ProForPrd),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,127);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtProForPrd_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtProForPrd_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(125),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_procesosquimicoslineasRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdFind_Internalname,GXutil.rtrim( A710PrdFind),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrdFind_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(0),Integer.valueOf(edtPrdFind_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(125),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_procesosquimicoslineasRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdNomForm_Internalname,GXutil.rtrim( A13976PrdNomForm),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrdNomForm_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(0),Integer.valueOf(edtPrdNomForm_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(125),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_90_" + sGXsfl_125_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 130,'',false,'" + sGXsfl_125_idx + "',125)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_procesosquimicoslineasRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtProForDes_Internalname,GXutil.rtrim( A765ProForDes),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,130);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtProForDes_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtProForDes_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(125),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_90_" + sGXsfl_125_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 131,'',false,'" + sGXsfl_125_idx + "',125)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_procesosquimicoslineasRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtProForCPo_Internalname,GXutil.ltrim( localUtil.ntoc( A6062ProForCPo, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A6062ProForCPo, "ZZ9.99")),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,131);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtProForCPo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(edtProForCPo_Visible),Integer.valueOf(edtProForCPo_Enabled),Integer.valueOf(1),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(125),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_90_" + sGXsfl_125_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 132,'',false,'" + sGXsfl_125_idx + "',125)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_procesosquimicoslineasRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtProForCan_Internalname,GXutil.ltrim( localUtil.ntoc( A762ProForCan, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtProForCan_Enabled!=0) ? localUtil.format( A762ProForCan, "ZZZZZ9.9999") : localUtil.format( A762ProForCan, "ZZZZZ9.9999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,132);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtProForCan_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtProForCan_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(125),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_90_" + sGXsfl_125_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 133,'',false,'" + sGXsfl_125_idx + "',125)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_procesosquimicoslineasRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtForPrdUMe_Internalname,h490ForPrdUMe,"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,133);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtForPrdUMe_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtForPrdUMe_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(125),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Active Bitmap Variable */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 134,'',false,'',125)\"" ;
      ClassString = "ImagePrompt" + " " + ((GXutil.strcmp(edtavClaves_gximage, "")==0) ? "" : "GX_Image_"+edtavClaves_gximage+"_Class") ;
      StyleString = "" ;
      AV41Claves_IsBlob = (boolean)(((GXutil.strcmp("", AV41Claves)==0)&&(GXutil.strcmp("", AV55Claves_GXI)==0))||!(GXutil.strcmp("", AV41Claves)==0)) ;
      sImgUrl = ((GXutil.strcmp("", AV41Claves)==0) ? AV55Claves_GXI : httpContext.getResourceRelative(AV41Claves)) ;
      Gridlevel_procesosquimicoslineasRow.AddColumnProperties("bitmap", 1, isAjaxCallMode( ), new Object[] {edtavClaves_Internalname,sImgUrl,"","","",context.getHttpContext().getTheme( ),Integer.valueOf(edtavClaves_Visible),Integer.valueOf(edtavClaves_Enabled),"",edtavClaves_Tooltiptext,Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),"px",Integer.valueOf(0),"px",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(5),edtavClaves_Jsonclick,"'"+""+"'"+",false,"+"'"+"EVCLAVES.CLICK."+sGXsfl_125_idx+"'",StyleString,ClassString,"TrnColumn","","","",""+TempTags,"","",Integer.valueOf(1),Boolean.valueOf(AV41Claves_IsBlob),Boolean.valueOf(false),context.getHttpContext().getImageSrcSet( sImgUrl)});
      /* Subfile cell */
      /* Active Bitmap Variable */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 135,'',false,'',125)\"" ;
      ClassString = "ImagePrompt" + " " + ((GXutil.strcmp(edtavClavesdel_gximage, "")==0) ? "" : "GX_Image_"+edtavClavesdel_gximage+"_Class") ;
      StyleString = "" ;
      AV45Clavesdel_IsBlob = (boolean)(((GXutil.strcmp("", AV45Clavesdel)==0)&&(GXutil.strcmp("", AV56Clavesdel_GXI)==0))||!(GXutil.strcmp("", AV45Clavesdel)==0)) ;
      sImgUrl = ((GXutil.strcmp("", AV45Clavesdel)==0) ? AV56Clavesdel_GXI : httpContext.getResourceRelative(AV45Clavesdel)) ;
      Gridlevel_procesosquimicoslineasRow.AddColumnProperties("bitmap", 1, isAjaxCallMode( ), new Object[] {edtavClavesdel_Internalname,sImgUrl,"","","",context.getHttpContext().getTheme( ),Integer.valueOf(edtavClavesdel_Visible),Integer.valueOf(edtavClavesdel_Enabled),"",edtavClavesdel_Tooltiptext,Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),"px",Integer.valueOf(0),"px",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(7),edtavClavesdel_Jsonclick,"'"+""+"'"+",false,"+"'"+"e141rw90_client"+"'",StyleString,ClassString,"TrnColumn","","","",""+TempTags,"","",Integer.valueOf(1),Boolean.valueOf(AV45Clavesdel_IsBlob),Boolean.valueOf(false),context.getHttpContext().getImageSrcSet( sImgUrl)});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_procesosquimicoslineasRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtProForCla_Internalname,GXutil.rtrim( A763ProForCla),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtProForCla_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtProForCla_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(125),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_procesosquimicoslineasRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtProForClv_Internalname,GXutil.rtrim( A5358ProForClv),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtProForClv_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(edtProForClv_Visible),Integer.valueOf(edtProForClv_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(125),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_90_" + sGXsfl_125_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 138,'',false,'" + sGXsfl_125_idx + "',125)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_procesosquimicoslineasRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtProForNro_Internalname,GXutil.ltrim( localUtil.ntoc( A1645ProForNro, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtProForNro_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1645ProForNro), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A1645ProForNro), "Z9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,138);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtProForNro_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtProForNro_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(125),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_90_" + sGXsfl_125_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 139,'',false,'" + sGXsfl_125_idx + "',125)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_procesosquimicoslineasRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtProForTnq_Internalname,GXutil.ltrim( localUtil.ntoc( A3379ProForTnq, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtProForTnq_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A3379ProForTnq), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A3379ProForTnq), "Z9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,139);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtProForTnq_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtProForTnq_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(125),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_procesosquimicoslineasRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdMaxFind_Internalname,GXutil.rtrim( A717PrdMaxFind),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrdMaxFind_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(0),Integer.valueOf(edtPrdMaxFind_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(125),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      httpContext.ajax_sending_grid_row(Gridlevel_procesosquimicoslineasRow);
      send_integrity_lvl_hashes1RW90( ) ;
      GXCCtl = "GXHCFORPRDUME_" + sGXsfl_125_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( A490ForPrdUMe, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z767ProForLin_" + sGXsfl_125_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z767ProForLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z6062ProForCPo_" + sGXsfl_125_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z6062ProForCPo, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z13178ProForFT_" + sGXsfl_125_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z13178ProForFT));
      GXCCtl = "Z765ProForDes_" + sGXsfl_125_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z765ProForDes));
      GXCCtl = "Z770ProForPrd_" + sGXsfl_125_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z770ProForPrd));
      GXCCtl = "Z13111ProForDe2_" + sGXsfl_125_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z13111ProForDe2));
      GXCCtl = "Z762ProForCan_" + sGXsfl_125_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z762ProForCan, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z1645ProForNro_" + sGXsfl_125_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z1645ProForNro, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z3379ProForTnq_" + sGXsfl_125_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z3379ProForTnq, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z763ProForCla_" + sGXsfl_125_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z763ProForCla));
      GXCCtl = "Z5358ProForClv_" + sGXsfl_125_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z5358ProForClv));
      GXCCtl = "Z490ForPrdUMe_" + sGXsfl_125_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z490ForPrdUMe, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "O762ProForCan_" + sGXsfl_125_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( O762ProForCan, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "O767ProForLin_" + sGXsfl_125_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( O767ProForLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "O490ForPrdUMe_" + sGXsfl_125_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( O490ForPrdUMe, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "O763ProForCla_" + sGXsfl_125_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( O763ProForCla));
      GXCCtl = "O5358ProForClv_" + sGXsfl_125_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( O5358ProForClv));
      GXCCtl = "PROFORLINV_" + sGXsfl_125_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( A768ProForLinV, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_90_" + sGXsfl_125_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_90, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_90_" + sGXsfl_125_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_90, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_90_" + sGXsfl_125_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_90, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "N6062ProForCPo_" + sGXsfl_125_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( A6062ProForCPo, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vMODE_" + sGXsfl_125_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Gx_mode));
      GXCCtl = "vTRNCONTEXT_" + sGXsfl_125_idx ;
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, GXCCtl, AV34TrnContext);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(GXCCtl, AV34TrnContext);
      }
      GXCCtl = "vEMPRCOD_" + sGXsfl_125_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( AV12EmprCod));
      GXCCtl = "PROFORULI_" + sGXsfl_125_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( A773ProForUli, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vPROFORCOD_" + sGXsfl_125_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( AV32ProForCod));
      GXCCtl = "PROFORFT_" + sGXsfl_125_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( A13178ProForFT));
      app.GxWebStd.gx_hidden_field( httpContext, "PROFORLIN_"+sGXsfl_125_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProForLin_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PROFORPRD_"+sGXsfl_125_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProForPrd_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDFIND_"+sGXsfl_125_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdFind_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDNOMFORM_"+sGXsfl_125_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdNomForm_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PROFORDES_"+sGXsfl_125_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProForDes_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PROFORCPO_"+sGXsfl_125_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProForCPo_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PROFORCPO_"+sGXsfl_125_idx+"Visible", GXutil.ltrim( localUtil.ntoc( edtProForCPo_Visible, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PROFORCAN_"+sGXsfl_125_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProForCan_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FORPRDUME_"+sGXsfl_125_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtForPrdUMe_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vCLAVES_"+sGXsfl_125_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavClaves_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vCLAVES_"+sGXsfl_125_idx+"Tooltiptext", GXutil.rtrim( edtavClaves_Tooltiptext));
      app.GxWebStd.gx_hidden_field( httpContext, "vCLAVES_"+sGXsfl_125_idx+"Visible", GXutil.ltrim( localUtil.ntoc( edtavClaves_Visible, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vCLAVESDEL_"+sGXsfl_125_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavClavesdel_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vCLAVESDEL_"+sGXsfl_125_idx+"Tooltiptext", GXutil.rtrim( edtavClavesdel_Tooltiptext));
      app.GxWebStd.gx_hidden_field( httpContext, "vCLAVESDEL_"+sGXsfl_125_idx+"Visible", GXutil.ltrim( localUtil.ntoc( edtavClavesdel_Visible, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PROFORCLA_"+sGXsfl_125_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProForCla_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PROFORCLV_"+sGXsfl_125_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProForClv_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PROFORCLV_"+sGXsfl_125_idx+"Visible", GXutil.ltrim( localUtil.ntoc( edtProForClv_Visible, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PROFORNRO_"+sGXsfl_125_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProForNro_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PROFORTNQ_"+sGXsfl_125_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProForTnq_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDMAXFIND_"+sGXsfl_125_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdMaxFind_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Gridlevel_procesosquimicoslineasContainer.AddRow(Gridlevel_procesosquimicoslineasRow);
   }

   public void readRow1RW90( )
   {
      nGXsfl_125_idx = (int)(nGXsfl_125_idx+1) ;
      sGXsfl_125_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_125_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_12590( ) ;
      edtProForLin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PROFORLIN_"+sGXsfl_125_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtProForPrd_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PROFORPRD_"+sGXsfl_125_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPrdFind_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRDFIND_"+sGXsfl_125_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPrdNomForm_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRDNOMFORM_"+sGXsfl_125_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtProForDes_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PROFORDES_"+sGXsfl_125_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtProForCPo_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PROFORCPO_"+sGXsfl_125_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtProForCPo_Visible = (int)(localUtil.ctol( httpContext.cgiGet( "PROFORCPO_"+sGXsfl_125_idx+"Visible"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtProForCan_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PROFORCAN_"+sGXsfl_125_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtForPrdUMe_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FORPRDUME_"+sGXsfl_125_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtavClaves_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vCLAVES_"+sGXsfl_125_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtavClaves_Tooltiptext = httpContext.cgiGet( "vCLAVES_"+sGXsfl_125_idx+"Tooltiptext") ;
      edtavClaves_Visible = (int)(localUtil.ctol( httpContext.cgiGet( "vCLAVES_"+sGXsfl_125_idx+"Visible"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtavClavesdel_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vCLAVESDEL_"+sGXsfl_125_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtavClavesdel_Tooltiptext = httpContext.cgiGet( "vCLAVESDEL_"+sGXsfl_125_idx+"Tooltiptext") ;
      edtavClavesdel_Visible = (int)(localUtil.ctol( httpContext.cgiGet( "vCLAVESDEL_"+sGXsfl_125_idx+"Visible"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtProForCla_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PROFORCLA_"+sGXsfl_125_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtProForClv_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PROFORCLV_"+sGXsfl_125_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtProForClv_Visible = (int)(localUtil.ctol( httpContext.cgiGet( "PROFORCLV_"+sGXsfl_125_idx+"Visible"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtProForNro_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PROFORNRO_"+sGXsfl_125_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtProForTnq_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PROFORTNQ_"+sGXsfl_125_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPrdMaxFind_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRDMAXFIND_"+sGXsfl_125_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtProForLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtProForLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "PROFORLIN_" + sGXsfl_125_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtProForLin_Internalname ;
         wbErr = true ;
         A767ProForLin = (short)(0) ;
      }
      else
      {
         A767ProForLin = (short)(localUtil.ctol( httpContext.cgiGet( edtProForLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A770ProForPrd = httpContext.cgiGet( edtProForPrd_Internalname) ;
      A710PrdFind = httpContext.cgiGet( edtPrdFind_Internalname) ;
      n710PrdFind = false ;
      A13976PrdNomForm = httpContext.cgiGet( edtPrdNomForm_Internalname) ;
      A765ProForDes = httpContext.cgiGet( edtProForDes_Internalname) ;
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtProForCPo_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtProForCPo_Internalname)), DecimalUtil.stringToDec("999.99")) > 0 ) ) )
      {
         GXCCtl = "PROFORCPO_" + sGXsfl_125_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtProForCPo_Internalname ;
         wbErr = true ;
         A6062ProForCPo = DecimalUtil.ZERO ;
      }
      else
      {
         A6062ProForCPo = localUtil.ctond( httpContext.cgiGet( edtProForCPo_Internalname)) ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtProForCan_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtProForCan_Internalname)), DecimalUtil.stringToDec("999999.99999")) > 0 ) ) )
      {
         GXCCtl = "PROFORCAN_" + sGXsfl_125_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtProForCan_Internalname ;
         wbErr = true ;
         A762ProForCan = DecimalUtil.ZERO ;
      }
      else
      {
         A762ProForCan = localUtil.ctond( httpContext.cgiGet( edtProForCan_Internalname)) ;
      }
      h490ForPrdUMe = httpContext.cgiGet( edtForPrdUMe_Internalname) ;
      AV41Claves = httpContext.cgiGet( edtavClaves_Internalname) ;
      AV45Clavesdel = httpContext.cgiGet( edtavClavesdel_Internalname) ;
      A763ProForCla = httpContext.cgiGet( edtProForCla_Internalname) ;
      A5358ProForClv = httpContext.cgiGet( edtProForClv_Internalname) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtProForNro_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtProForNro_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
      {
         GXCCtl = "PROFORNRO_" + sGXsfl_125_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtProForNro_Internalname ;
         wbErr = true ;
         A1645ProForNro = (byte)(0) ;
      }
      else
      {
         A1645ProForNro = (byte)(localUtil.ctol( httpContext.cgiGet( edtProForNro_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtProForTnq_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtProForTnq_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
      {
         GXCCtl = "PROFORTNQ_" + sGXsfl_125_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtProForTnq_Internalname ;
         wbErr = true ;
         A3379ProForTnq = (byte)(0) ;
      }
      else
      {
         A3379ProForTnq = (byte)(localUtil.ctol( httpContext.cgiGet( edtProForTnq_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A717PrdMaxFind = httpContext.cgiGet( edtPrdMaxFind_Internalname) ;
      n717PrdMaxFind = false ;
      GXCCtl = "GXHCFORPRDUME_" + sGXsfl_125_idx ;
      A490ForPrdUMe = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z767ProForLin_" + sGXsfl_125_idx ;
      Z767ProForLin = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z6062ProForCPo_" + sGXsfl_125_idx ;
      Z6062ProForCPo = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z13178ProForFT_" + sGXsfl_125_idx ;
      Z13178ProForFT = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z765ProForDes_" + sGXsfl_125_idx ;
      Z765ProForDes = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z770ProForPrd_" + sGXsfl_125_idx ;
      Z770ProForPrd = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z13111ProForDe2_" + sGXsfl_125_idx ;
      Z13111ProForDe2 = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z762ProForCan_" + sGXsfl_125_idx ;
      Z762ProForCan = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z1645ProForNro_" + sGXsfl_125_idx ;
      Z1645ProForNro = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z3379ProForTnq_" + sGXsfl_125_idx ;
      Z3379ProForTnq = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z763ProForCla_" + sGXsfl_125_idx ;
      Z763ProForCla = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z5358ProForClv_" + sGXsfl_125_idx ;
      Z5358ProForClv = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z490ForPrdUMe_" + sGXsfl_125_idx ;
      Z490ForPrdUMe = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z13178ProForFT_" + sGXsfl_125_idx ;
      A13178ProForFT = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z13111ProForDe2_" + sGXsfl_125_idx ;
      A13111ProForDe2 = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "O762ProForCan_" + sGXsfl_125_idx ;
      O762ProForCan = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "O767ProForLin_" + sGXsfl_125_idx ;
      O767ProForLin = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "O490ForPrdUMe_" + sGXsfl_125_idx ;
      O490ForPrdUMe = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "O763ProForCla_" + sGXsfl_125_idx ;
      O763ProForCla = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "O5358ProForClv_" + sGXsfl_125_idx ;
      O5358ProForClv = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "PROFORLINV_" + sGXsfl_125_idx ;
      A768ProForLinV = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdDeleted_90_" + sGXsfl_125_idx ;
      nRcdDeleted_90 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_90_" + sGXsfl_125_idx ;
      nRcdExists_90 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_90_" + sGXsfl_125_idx ;
      nIsMod_90 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "N6062ProForCPo_" + sGXsfl_125_idx ;
      N6062ProForCPo = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "vEMPRCOD_" + sGXsfl_125_idx ;
      AV12EmprCod = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "PROFORFT_" + sGXsfl_125_idx ;
      A13178ProForFT = httpContext.cgiGet( GXCCtl) ;
   }

   public void assign_properties_default( )
   {
      defedtPrdMaxFind_Enabled = edtPrdMaxFind_Enabled ;
      defedtProForClv_Enabled = edtProForClv_Enabled ;
      defedtProForCla_Enabled = edtProForCla_Enabled ;
      defedtProForCPo_Enabled = edtProForCPo_Enabled ;
      defedtPrdNomForm_Enabled = edtPrdNomForm_Enabled ;
      defedtPrdFind_Enabled = edtPrdFind_Enabled ;
      defedtProForLin_Enabled = edtProForLin_Enabled ;
   }

   public void confirmValues1RW0( )
   {
      nGXsfl_125_idx = 0 ;
      sGXsfl_125_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_125_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_12590( ) ;
      while ( nGXsfl_125_idx < nRC_GXsfl_125 )
      {
         nGXsfl_125_idx = (int)(nGXsfl_125_idx+1) ;
         sGXsfl_125_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_125_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_12590( ) ;
         httpContext.changePostValue( "Z767ProForLin_"+sGXsfl_125_idx, httpContext.cgiGet( "ZT_"+"Z767ProForLin_"+sGXsfl_125_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z767ProForLin_"+sGXsfl_125_idx) ;
         httpContext.changePostValue( "Z6062ProForCPo_"+sGXsfl_125_idx, httpContext.cgiGet( "ZT_"+"Z6062ProForCPo_"+sGXsfl_125_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z6062ProForCPo_"+sGXsfl_125_idx) ;
         httpContext.changePostValue( "Z13178ProForFT_"+sGXsfl_125_idx, httpContext.cgiGet( "ZT_"+"Z13178ProForFT_"+sGXsfl_125_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z13178ProForFT_"+sGXsfl_125_idx) ;
         httpContext.changePostValue( "Z765ProForDes_"+sGXsfl_125_idx, httpContext.cgiGet( "ZT_"+"Z765ProForDes_"+sGXsfl_125_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z765ProForDes_"+sGXsfl_125_idx) ;
         httpContext.changePostValue( "Z770ProForPrd_"+sGXsfl_125_idx, httpContext.cgiGet( "ZT_"+"Z770ProForPrd_"+sGXsfl_125_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z770ProForPrd_"+sGXsfl_125_idx) ;
         httpContext.changePostValue( "Z13111ProForDe2_"+sGXsfl_125_idx, httpContext.cgiGet( "ZT_"+"Z13111ProForDe2_"+sGXsfl_125_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z13111ProForDe2_"+sGXsfl_125_idx) ;
         httpContext.changePostValue( "Z762ProForCan_"+sGXsfl_125_idx, httpContext.cgiGet( "ZT_"+"Z762ProForCan_"+sGXsfl_125_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z762ProForCan_"+sGXsfl_125_idx) ;
         httpContext.changePostValue( "Z1645ProForNro_"+sGXsfl_125_idx, httpContext.cgiGet( "ZT_"+"Z1645ProForNro_"+sGXsfl_125_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z1645ProForNro_"+sGXsfl_125_idx) ;
         httpContext.changePostValue( "Z3379ProForTnq_"+sGXsfl_125_idx, httpContext.cgiGet( "ZT_"+"Z3379ProForTnq_"+sGXsfl_125_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z3379ProForTnq_"+sGXsfl_125_idx) ;
         httpContext.changePostValue( "Z763ProForCla_"+sGXsfl_125_idx, httpContext.cgiGet( "ZT_"+"Z763ProForCla_"+sGXsfl_125_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z763ProForCla_"+sGXsfl_125_idx) ;
         httpContext.changePostValue( "Z5358ProForClv_"+sGXsfl_125_idx, httpContext.cgiGet( "ZT_"+"Z5358ProForClv_"+sGXsfl_125_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z5358ProForClv_"+sGXsfl_125_idx) ;
         httpContext.changePostValue( "Z490ForPrdUMe_"+sGXsfl_125_idx, httpContext.cgiGet( "ZT_"+"Z490ForPrdUMe_"+sGXsfl_125_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z490ForPrdUMe_"+sGXsfl_125_idx) ;
      }
      httpContext.changePostValue( "O762ProForCan", httpContext.cgiGet( "T762ProForCan")) ;
      httpContext.deletePostValue( "T762ProForCan") ;
      httpContext.changePostValue( "O767ProForLin", httpContext.cgiGet( "T767ProForLin")) ;
      httpContext.deletePostValue( "T767ProForLin") ;
      httpContext.changePostValue( "O490ForPrdUMe", httpContext.cgiGet( "T490ForPrdUMe")) ;
      httpContext.deletePostValue( "T490ForPrdUMe") ;
      httpContext.changePostValue( "O763ProForCla", httpContext.cgiGet( "T763ProForCla")) ;
      httpContext.deletePostValue( "T763ProForCla") ;
      httpContext.changePostValue( "O5358ProForClv", httpContext.cgiGet( "T5358ProForClv")) ;
      httpContext.deletePostValue( "T5358ProForClv") ;
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
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridTitlesCategories/GridTitlesCategoriesRender.js", "", false, true);
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.formulaciontinte.procesosquimicos_trn", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV12EmprCod)),GXutil.URLEncode(GXutil.rtrim(AV32ProForCod))}, new String[] {"Gx_mode","EmprCod","ProForCod"}) +"\">") ;
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
      forbiddenHiddens.add("hshsalt", "hsh"+"ProcesosQuimicos_TRN");
      forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("formulaciontinte\\procesosquimicos_trn:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z764ProForCod", GXutil.rtrim( Z764ProForCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6061ProForLab", GXutil.rtrim( Z6061ProForLab));
      app.GxWebStd.gx_hidden_field( httpContext, "Z766ProForDsc", GXutil.rtrim( Z766ProForDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4715ProForDsc2", GXutil.rtrim( Z4715ProForDsc2));
      app.GxWebStd.gx_hidden_field( httpContext, "Z771ProForTie", GXutil.ltrim( localUtil.ntoc( Z771ProForTie, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z772ProForTmx", GXutil.ltrim( localUtil.ntoc( Z772ProForTmx, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z769ProForMat", GXutil.rtrim( Z769ProForMat));
      app.GxWebStd.gx_hidden_field( httpContext, "Z674PorForFul", localUtil.dtoc( Z674PorForFul, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z773ProForUli", GXutil.ltrim( localUtil.ntoc( Z773ProForUli, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2392ProNumPro", GXutil.ltrim( localUtil.ntoc( Z2392ProNumPro, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2393ProNumRec", GXutil.ltrim( localUtil.ntoc( Z2393ProNumRec, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3005ProRev", GXutil.rtrim( Z3005ProRev));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4705ProForPau", GXutil.ltrim( localUtil.ntoc( Z4705ProForPau, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4706ProForRb", GXutil.ltrim( localUtil.ntoc( Z4706ProForRb, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4864ProForCCi", GXutil.rtrim( Z4864ProForCCi));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4865ProForDCi", GXutil.rtrim( Z4865ProForDCi));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5523ProForTip", GXutil.rtrim( Z5523ProForTip));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8527ProForAbs", GXutil.ltrim( localUtil.ntoc( Z8527ProForAbs, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8528ProForCos", GXutil.ltrim( localUtil.ntoc( Z8528ProForCos, (byte)(8), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10120ProforVl", GXutil.ltrim( localUtil.ntoc( Z10120ProforVl, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10547ProH2O", GXutil.ltrim( localUtil.ntoc( Z10547ProH2O, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3589ProForMer", GXutil.ltrim( localUtil.ntoc( Z3589ProForMer, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13133ProForAct", GXutil.rtrim( Z13133ProForAct));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13936ProForRs", GXutil.rtrim( Z13936ProForRs));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_Mode", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_125", GXutil.ltrim( localUtil.ntoc( nGXsfl_125_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vPROFORLAB_DATA", AV48ProForLab_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vPROFORLAB_DATA", AV48ProForLab_Data);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTRNCONTEXT", AV34TrnContext);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTRNCONTEXT", AV34TrnContext);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTRNCONTEXT", getSecureSignedToken( "", AV34TrnContext));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV12EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vPROFORCOD", GXutil.rtrim( AV32ProForCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPROFORCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV32ProForCod, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vGXBSCREEN", GXutil.ltrim( localUtil.ntoc( Gx_BScreen, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vEXIS_PRO", GXutil.ltrim( localUtil.ntoc( AV38Exis_pro, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMSG1", GXutil.rtrim( AV29Msg1));
      app.GxWebStd.gx_hidden_field( httpContext, "vORIENT", GXutil.ltrim( localUtil.ntoc( AV24Orient, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PROFORULI", GXutil.ltrim( localUtil.ntoc( A773ProForUli, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV53Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, "GXHCFORPRDUME", GXutil.ltrim( localUtil.ntoc( A490ForPrdUMe, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PROFORLINV", GXutil.ltrim( localUtil.ntoc( A768ProForLinV, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PROFORFT", GXutil.rtrim( A13178ProForFT));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDUMEFIND", GXutil.ltrim( localUtil.ntoc( A4340PrdUMeFind, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vCDPPOR", GXutil.ltrim( localUtil.ntoc( AV13CdpPor, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vOLDCANT", GXutil.ltrim( localUtil.ntoc( AV30oldCant, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vUN", GXutil.ltrim( localUtil.ntoc( AV31Un, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vOLDPROFORLIN", GXutil.ltrim( localUtil.ntoc( AV7oldProforlin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMSG_E", GXutil.rtrim( AV10Msg_e));
      app.GxWebStd.gx_hidden_field( httpContext, "vMSG_DEL", GXutil.rtrim( AV39Msg_del));
      app.GxWebStd.gx_hidden_field( httpContext, "vUSURCOD", GXutil.rtrim( AV8Usurcod));
      app.GxWebStd.gx_hidden_field( httpContext, "vSTATION", GXutil.rtrim( AV9Station));
      app.GxWebStd.gx_hidden_field( httpContext, "PROFORDE2", GXutil.rtrim( A13111ProForDe2));
      app.GxWebStd.gx_hidden_field( httpContext, "FORPRDDSC", GXutil.rtrim( A488ForPrdDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PROFORLAB_Objectcall", GXutil.rtrim( Combo_proforlab_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PROFORLAB_Cls", GXutil.rtrim( Combo_proforlab_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PROFORLAB_Selectedvalue_set", GXutil.rtrim( Combo_proforlab_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PROFORLAB_Enabled", GXutil.booltostr( Combo_proforlab_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PROFORLAB_Emptyitemtext", GXutil.rtrim( Combo_proforlab_Emptyitemtext));
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
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDLEVEL_PROCESOSQUIMICOSLINEAS_TITLESCATEGORIES_Objectcall", GXutil.rtrim( Gridlevel_procesosquimicoslineas_titlescategories_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDLEVEL_PROCESOSQUIMICOSLINEAS_TITLESCATEGORIES_Enabled", GXutil.booltostr( Gridlevel_procesosquimicoslineas_titlescategories_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDLEVEL_PROCESOSQUIMICOSLINEAS_TITLESCATEGORIES_Gridinternalname", GXutil.rtrim( Gridlevel_procesosquimicoslineas_titlescategories_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDLEVEL_PROCESOSQUIMICOSLINEAS_TITLESCATEGORIES_Gridtitlescategories", GXutil.rtrim( Gridlevel_procesosquimicoslineas_titlescategories_Gridtitlescategories));
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
      return formatLink("app.formulaciontinte.procesosquimicos_trn", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV12EmprCod)),GXutil.URLEncode(GXutil.rtrim(AV32ProForCod))}, new String[] {"Gx_mode","EmprCod","ProForCod"})  ;
   }

   public String getPgmname( )
   {
      return "FormulacionTinte.ProcesosQuimicos_TRN" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Procesos Quimicos", "") ;
   }

   public void initializeNonKey1RW89( )
   {
      AV38Exis_pro = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV38Exis_pro", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV38Exis_pro), 4, 0));
      A920ProForCodV = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A920ProForCodV", A920ProForCodV);
      A13740ProFDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A13740ProFDsc", A13740ProFDsc);
      A941EmprCodV2 = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A941EmprCodV2", A941EmprCodV2);
      A407EmprNom = "" ;
      n407EmprNom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      A766ProForDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A766ProForDsc", A766ProForDsc);
      A4715ProForDsc2 = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A4715ProForDsc2", A4715ProForDsc2);
      A771ProForTie = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A771ProForTie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A771ProForTie), 4, 0));
      A772ProForTmx = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A772ProForTmx", GXutil.ltrimstr( DecimalUtil.doubleToDec(A772ProForTmx), 4, 0));
      A769ProForMat = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A769ProForMat", A769ProForMat);
      A674PorForFul = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "A674PorForFul", localUtil.format(A674PorForFul, "99/99/99"));
      A773ProForUli = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A773ProForUli", GXutil.ltrimstr( DecimalUtil.doubleToDec(A773ProForUli), 4, 0));
      A2392ProNumPro = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A2392ProNumPro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2392ProNumPro), 5, 0));
      A2393ProNumRec = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A2393ProNumRec", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2393ProNumRec), 5, 0));
      A4705ProForPau = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A4705ProForPau", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4705ProForPau), 4, 0));
      A4706ProForRb = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A4706ProForRb", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4706ProForRb), 4, 0));
      A4864ProForCCi = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A4864ProForCCi", A4864ProForCCi);
      A4865ProForDCi = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A4865ProForDCi", A4865ProForDCi);
      A5523ProForTip = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A5523ProForTip", A5523ProForTip);
      A8527ProForAbs = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A8527ProForAbs", GXutil.ltrimstr( A8527ProForAbs, 6, 2));
      A8528ProForCos = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A8528ProForCos", GXutil.ltrimstr( A8528ProForCos, 8, 4));
      A10120ProforVl = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A10120ProforVl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10120ProforVl), 5, 0));
      A10547ProH2O = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A10547ProH2O", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10547ProH2O), 4, 0));
      A3589ProForMer = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A3589ProForMer", GXutil.ltrimstr( A3589ProForMer, 6, 2));
      A13936ProForRs = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A13936ProForRs", A13936ProForRs);
      A6061ProForLab = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A6061ProForLab", A6061ProForLab);
      A3005ProRev = httpContext.getMessage( "N", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "A3005ProRev", A3005ProRev);
      A13133ProForAct = httpContext.getMessage( "S", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "A13133ProForAct", A13133ProForAct);
      Z6061ProForLab = "" ;
      Z766ProForDsc = "" ;
      Z4715ProForDsc2 = "" ;
      Z771ProForTie = (short)(0) ;
      Z772ProForTmx = (short)(0) ;
      Z769ProForMat = "" ;
      Z674PorForFul = GXutil.nullDate() ;
      Z773ProForUli = (short)(0) ;
      Z2392ProNumPro = 0 ;
      Z2393ProNumRec = 0 ;
      Z3005ProRev = "" ;
      Z4705ProForPau = (short)(0) ;
      Z4706ProForRb = (short)(0) ;
      Z4864ProForCCi = "" ;
      Z4865ProForDCi = "" ;
      Z5523ProForTip = "" ;
      Z8527ProForAbs = DecimalUtil.ZERO ;
      Z8528ProForCos = DecimalUtil.ZERO ;
      Z10120ProforVl = 0 ;
      Z10547ProH2O = (short)(0) ;
      Z3589ProForMer = DecimalUtil.ZERO ;
      Z13133ProForAct = "" ;
      Z13936ProForRs = "" ;
   }

   public void initAll1RW89( )
   {
      A396EmprCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A764ProForCod = "" ;
      n764ProForCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A764ProForCod", A764ProForCod);
      initializeNonKey1RW89( ) ;
   }

   public void standaloneModalInsert( )
   {
      A13133ProForAct = i13133ProForAct ;
      httpContext.ajax_rsp_assign_attri("", false, "A13133ProForAct", A13133ProForAct);
      A3005ProRev = i3005ProRev ;
      httpContext.ajax_rsp_assign_attri("", false, "A3005ProRev", A3005ProRev);
   }

   public void initializeNonKey1RW90( )
   {
      A765ProForDes = "" ;
      h490ForPrdUMe = "" ;
      AV30oldCant = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV30oldCant", GXutil.ltrimstr( AV30oldCant, 12, 5));
      AV31Un = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV31Un", GXutil.str( AV31Un, 1, 0));
      AV7oldProforlin = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7oldProforlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV7oldProforlin), 4, 0));
      AV10Msg_e = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10Msg_e", AV10Msg_e);
      AV39Msg_del = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV39Msg_del", AV39Msg_del);
      A710PrdFind = "" ;
      n710PrdFind = false ;
      A4340PrdUMeFind = (byte)(0) ;
      n4340PrdUMeFind = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4340PrdUMeFind", GXutil.str( A4340PrdUMeFind, 1, 0));
      A13976PrdNomForm = "" ;
      A717PrdMaxFind = "" ;
      n717PrdMaxFind = false ;
      A768ProForLinV = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A768ProForLinV", GXutil.ltrimstr( DecimalUtil.doubleToDec(A768ProForLinV), 4, 0));
      A770ProForPrd = "" ;
      A13111ProForDe2 = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A13111ProForDe2", A13111ProForDe2);
      A488ForPrdDsc = "" ;
      n488ForPrdDsc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A488ForPrdDsc", A488ForPrdDsc);
      A762ProForCan = DecimalUtil.ZERO ;
      A1645ProForNro = (byte)(0) ;
      A3379ProForTnq = (byte)(0) ;
      A763ProForCla = "" ;
      A5358ProForClv = "" ;
      A6062ProForCPo = DecimalUtil.stringToDec("100.00") ;
      A13178ProForFT = " " ;
      httpContext.ajax_rsp_assign_attri("", false, "A13178ProForFT", A13178ProForFT);
      O762ProForCan = A762ProForCan ;
      O490ForPrdUMe = A490ForPrdUMe ;
      O763ProForCla = A763ProForCla ;
      O5358ProForClv = A5358ProForClv ;
      Z6062ProForCPo = DecimalUtil.ZERO ;
      Z13178ProForFT = "" ;
      Z765ProForDes = "" ;
      Z770ProForPrd = "" ;
      Z13111ProForDe2 = "" ;
      Z762ProForCan = DecimalUtil.ZERO ;
      Z1645ProForNro = (byte)(0) ;
      Z3379ProForTnq = (byte)(0) ;
      Z763ProForCla = "" ;
      Z5358ProForClv = "" ;
      Z490ForPrdUMe = (byte)(0) ;
   }

   public void initAll1RW90( )
   {
      A767ProForLin = (short)(0) ;
      initializeNonKey1RW90( ) ;
   }

   public void standaloneModalInsert1RW90( )
   {
      A6062ProForCPo = i6062ProForCPo ;
      A13178ProForFT = i13178ProForFT ;
      httpContext.ajax_rsp_assign_attri("", false, "A13178ProForFT", A13178ProForFT);
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682415114047", true, true);
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
      httpContext.AddJavascriptSource("formulaciontinte/procesosquimicos_trn.js", "?202682415114047", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridTitlesCategories/GridTitlesCategoriesRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties90( )
   {
      edtPrdMaxFind_Enabled = defedtPrdMaxFind_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdMaxFind_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdMaxFind_Enabled), 5, 0), !bGXsfl_125_Refreshing);
      edtProForClv_Enabled = defedtProForClv_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtProForClv_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForClv_Enabled), 5, 0), !bGXsfl_125_Refreshing);
      edtProForCla_Enabled = defedtProForCla_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtProForCla_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForCla_Enabled), 5, 0), !bGXsfl_125_Refreshing);
      edtProForCPo_Enabled = defedtProForCPo_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtProForCPo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForCPo_Enabled), 5, 0), !bGXsfl_125_Refreshing);
      edtPrdNomForm_Enabled = defedtPrdNomForm_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdNomForm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNomForm_Enabled), 5, 0), !bGXsfl_125_Refreshing);
      edtPrdFind_Enabled = defedtPrdFind_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdFind_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdFind_Enabled), 5, 0), !bGXsfl_125_Refreshing);
      edtProForLin_Enabled = defedtProForLin_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtProForLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForLin_Enabled), 5, 0), !bGXsfl_125_Refreshing);
   }

   public void startgridcontrol125( )
   {
      Gridlevel_procesosquimicoslineasContainer.AddObjectProperty("GridName", "Gridlevel_procesosquimicoslineas");
      Gridlevel_procesosquimicoslineasContainer.AddObjectProperty("Header", subGridlevel_procesosquimicoslineas_Header);
      Gridlevel_procesosquimicoslineasContainer.AddObjectProperty("Class", "GridNoBorder WorkWith");
      Gridlevel_procesosquimicoslineasContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_procesosquimicoslineasContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_procesosquimicoslineasContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGridlevel_procesosquimicoslineas_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_procesosquimicoslineasContainer.AddObjectProperty("CmpContext", "");
      Gridlevel_procesosquimicoslineasContainer.AddObjectProperty("InMasterPage", "false");
      Gridlevel_procesosquimicoslineasColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_procesosquimicoslineasColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A767ProForLin, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_procesosquimicoslineasColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtProForLin_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_procesosquimicoslineasContainer.AddColumnProperties(Gridlevel_procesosquimicoslineasColumn);
      Gridlevel_procesosquimicoslineasColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_procesosquimicoslineasColumn.AddObjectProperty("Value", GXutil.rtrim( A770ProForPrd));
      Gridlevel_procesosquimicoslineasColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtProForPrd_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_procesosquimicoslineasContainer.AddColumnProperties(Gridlevel_procesosquimicoslineasColumn);
      Gridlevel_procesosquimicoslineasColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_procesosquimicoslineasColumn.AddObjectProperty("Value", GXutil.rtrim( A710PrdFind));
      Gridlevel_procesosquimicoslineasColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdFind_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_procesosquimicoslineasContainer.AddColumnProperties(Gridlevel_procesosquimicoslineasColumn);
      Gridlevel_procesosquimicoslineasColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_procesosquimicoslineasColumn.AddObjectProperty("Value", GXutil.rtrim( A13976PrdNomForm));
      Gridlevel_procesosquimicoslineasColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdNomForm_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_procesosquimicoslineasContainer.AddColumnProperties(Gridlevel_procesosquimicoslineasColumn);
      Gridlevel_procesosquimicoslineasColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_procesosquimicoslineasColumn.AddObjectProperty("Value", GXutil.rtrim( A765ProForDes));
      Gridlevel_procesosquimicoslineasColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtProForDes_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_procesosquimicoslineasContainer.AddColumnProperties(Gridlevel_procesosquimicoslineasColumn);
      Gridlevel_procesosquimicoslineasColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_procesosquimicoslineasColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A6062ProForCPo, (byte)(6), (byte)(2), ".", "")));
      Gridlevel_procesosquimicoslineasColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtProForCPo_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_procesosquimicoslineasColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtProForCPo_Visible, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_procesosquimicoslineasContainer.AddColumnProperties(Gridlevel_procesosquimicoslineasColumn);
      Gridlevel_procesosquimicoslineasColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_procesosquimicoslineasColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A762ProForCan, (byte)(12), (byte)(5), ".", "")));
      Gridlevel_procesosquimicoslineasColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtProForCan_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_procesosquimicoslineasContainer.AddColumnProperties(Gridlevel_procesosquimicoslineasColumn);
      Gridlevel_procesosquimicoslineasColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_procesosquimicoslineasColumn.AddObjectProperty("Value", h490ForPrdUMe);
      Gridlevel_procesosquimicoslineasColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtForPrdUMe_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_procesosquimicoslineasContainer.AddColumnProperties(Gridlevel_procesosquimicoslineasColumn);
      Gridlevel_procesosquimicoslineasColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_procesosquimicoslineasColumn.AddObjectProperty("Value", httpContext.convertURL( AV41Claves));
      Gridlevel_procesosquimicoslineasColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavClaves_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_procesosquimicoslineasColumn.AddObjectProperty("Tooltiptext", GXutil.rtrim( edtavClaves_Tooltiptext));
      Gridlevel_procesosquimicoslineasColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavClaves_Visible, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_procesosquimicoslineasContainer.AddColumnProperties(Gridlevel_procesosquimicoslineasColumn);
      Gridlevel_procesosquimicoslineasColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_procesosquimicoslineasColumn.AddObjectProperty("Value", httpContext.convertURL( AV45Clavesdel));
      Gridlevel_procesosquimicoslineasColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavClavesdel_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_procesosquimicoslineasColumn.AddObjectProperty("Tooltiptext", GXutil.rtrim( edtavClavesdel_Tooltiptext));
      Gridlevel_procesosquimicoslineasColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavClavesdel_Visible, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_procesosquimicoslineasContainer.AddColumnProperties(Gridlevel_procesosquimicoslineasColumn);
      Gridlevel_procesosquimicoslineasColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_procesosquimicoslineasColumn.AddObjectProperty("Value", GXutil.rtrim( A763ProForCla));
      Gridlevel_procesosquimicoslineasColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtProForCla_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_procesosquimicoslineasContainer.AddColumnProperties(Gridlevel_procesosquimicoslineasColumn);
      Gridlevel_procesosquimicoslineasColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_procesosquimicoslineasColumn.AddObjectProperty("Value", GXutil.rtrim( A5358ProForClv));
      Gridlevel_procesosquimicoslineasColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtProForClv_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_procesosquimicoslineasColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtProForClv_Visible, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_procesosquimicoslineasContainer.AddColumnProperties(Gridlevel_procesosquimicoslineasColumn);
      Gridlevel_procesosquimicoslineasColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_procesosquimicoslineasColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1645ProForNro, (byte)(2), (byte)(0), ".", "")));
      Gridlevel_procesosquimicoslineasColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtProForNro_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_procesosquimicoslineasContainer.AddColumnProperties(Gridlevel_procesosquimicoslineasColumn);
      Gridlevel_procesosquimicoslineasColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_procesosquimicoslineasColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A3379ProForTnq, (byte)(2), (byte)(0), ".", "")));
      Gridlevel_procesosquimicoslineasColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtProForTnq_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_procesosquimicoslineasContainer.AddColumnProperties(Gridlevel_procesosquimicoslineasColumn);
      Gridlevel_procesosquimicoslineasColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_procesosquimicoslineasColumn.AddObjectProperty("Value", GXutil.rtrim( A717PrdMaxFind));
      Gridlevel_procesosquimicoslineasColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdMaxFind_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_procesosquimicoslineasContainer.AddColumnProperties(Gridlevel_procesosquimicoslineasColumn);
      Gridlevel_procesosquimicoslineasContainer.AddObjectProperty("Selectedindex", GXutil.ltrim( localUtil.ntoc( subGridlevel_procesosquimicoslineas_Selectedindex, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_procesosquimicoslineasContainer.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGridlevel_procesosquimicoslineas_Allowselection, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_procesosquimicoslineasContainer.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGridlevel_procesosquimicoslineas_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
      Gridlevel_procesosquimicoslineasContainer.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGridlevel_procesosquimicoslineas_Allowhovering, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_procesosquimicoslineasContainer.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGridlevel_procesosquimicoslineas_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
      Gridlevel_procesosquimicoslineasContainer.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGridlevel_procesosquimicoslineas_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_procesosquimicoslineasContainer.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGridlevel_procesosquimicoslineas_Collapsed, (byte)(1), (byte)(0), ".", "")));
   }

   public void init_default_properties( )
   {
      edtProForCod_Internalname = "PROFORCOD" ;
      edtProForDsc_Internalname = "PROFORDSC" ;
      edtProForDsc2_Internalname = "PROFORDSC2" ;
      chkProForAct.setInternalname( "PROFORACT" );
      edtProForTip_Internalname = "PROFORTIP" ;
      edtProForRs_Internalname = "PROFORRS" ;
      divProforrs_cell_Internalname = "PROFORRS_CELL" ;
      cmbProRev.setInternalname( "PROREV" );
      divUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
      edtProForTie_Internalname = "PROFORTIE" ;
      edtProForTmx_Internalname = "PROFORTMX" ;
      edtProForMat_Internalname = "PROFORMAT" ;
      edtProForRb_Internalname = "PROFORRB" ;
      divUnnamedtable3_Internalname = "UNNAMEDTABLE3" ;
      lblTextblockproforlab_Internalname = "TEXTBLOCKPROFORLAB" ;
      Combo_proforlab_Internalname = "COMBO_PROFORLAB" ;
      edtProForLab_Internalname = "PROFORLAB" ;
      divTablesplittedproforlab_Internalname = "TABLESPLITTEDPROFORLAB" ;
      edtProForAbs_Internalname = "PROFORABS" ;
      divProforabs_cell_Internalname = "PROFORABS_CELL" ;
      edtProForCos_Internalname = "PROFORCOS" ;
      divProforcos_cell_Internalname = "PROFORCOS_CELL" ;
      edtProforVl_Internalname = "PROFORVL" ;
      divProforvl_cell_Internalname = "PROFORVL_CELL" ;
      edtProH2O_Internalname = "PROH2O" ;
      divProh2o_cell_Internalname = "PROH2O_CELL" ;
      divUnnamedtable4_Internalname = "UNNAMEDTABLE4" ;
      edtProNumPro_Internalname = "PRONUMPRO" ;
      edtProNumRec_Internalname = "PRONUMREC" ;
      edtProForPau_Internalname = "PROFORPAU" ;
      divProforpau_cell_Internalname = "PROFORPAU_CELL" ;
      divUnnamedtable5_Internalname = "UNNAMEDTABLE5" ;
      grpUnnamedgroup6_Internalname = "UNNAMEDGROUP6" ;
      divTableattributes_Internalname = "TABLEATTRIBUTES" ;
      Dvpanel_tableattributes_Internalname = "DVPANEL_TABLEATTRIBUTES" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      edtProForLin_Internalname = "PROFORLIN" ;
      edtProForPrd_Internalname = "PROFORPRD" ;
      edtPrdFind_Internalname = "PRDFIND" ;
      edtPrdNomForm_Internalname = "PRDNOMFORM" ;
      edtProForDes_Internalname = "PROFORDES" ;
      edtProForCPo_Internalname = "PROFORCPO" ;
      edtProForCan_Internalname = "PROFORCAN" ;
      edtForPrdUMe_Internalname = "FORPRDUME" ;
      edtavClaves_Internalname = "vCLAVES" ;
      edtavClavesdel_Internalname = "vCLAVESDEL" ;
      edtProForCla_Internalname = "PROFORCLA" ;
      edtProForClv_Internalname = "PROFORCLV" ;
      edtProForNro_Internalname = "PROFORNRO" ;
      edtProForTnq_Internalname = "PROFORTNQ" ;
      edtPrdMaxFind_Internalname = "PRDMAXFIND" ;
      divTableleaflevel_procesosquimicoslineas_Internalname = "TABLELEAFLEVEL_PROCESOSQUIMICOSLINEAS" ;
      bttBtntrn_enter_Internalname = "BTNTRN_ENTER" ;
      bttBtntrn_cancel_Internalname = "BTNTRN_CANCEL" ;
      bttBtntrn_delete_Internalname = "BTNTRN_DELETE" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      edtavComboproforlab_Internalname = "vCOMBOPROFORLAB" ;
      divSectionattribute_proforlab_Internalname = "SECTIONATTRIBUTE_PROFORLAB" ;
      edtProForCCi_Internalname = "PROFORCCI" ;
      edtProForDCi_Internalname = "PROFORDCI" ;
      edtProForMer_Internalname = "PROFORMER" ;
      edtProFDsc_Internalname = "PROFDSC" ;
      edtProForCodV_Internalname = "PROFORCODV" ;
      edtEmprCodV2_Internalname = "EMPRCODV2" ;
      edtEmprCod_Internalname = "EMPRCOD" ;
      edtEmprNom_Internalname = "EMPRNOM" ;
      edtPorForFul_Internalname = "PORFORFUL" ;
      Gridlevel_procesosquimicoslineas_titlescategories_Internalname = "GRIDLEVEL_PROCESOSQUIMICOSLINEAS_TITLESCATEGORIES" ;
      divHtml_bottomauxiliarcontrols_Internalname = "HTML_BOTTOMAUXILIARCONTROLS" ;
      divLayoutmaintable_Internalname = "LAYOUTMAINTABLE" ;
      Form.setInternalname( "FORM" );
      subGridlevel_procesosquimicoslineas_Internalname = "GRIDLEVEL_PROCESOSQUIMICOSLINEAS" ;
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
      subGridlevel_procesosquimicoslineas_Allowcollapsing = (byte)(0) ;
      subGridlevel_procesosquimicoslineas_Allowselection = (byte)(0) ;
      subGridlevel_procesosquimicoslineas_Header = "" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "Procesos Quimicos", "") );
      edtPrdMaxFind_Jsonclick = "" ;
      edtProForTnq_Jsonclick = "" ;
      edtProForNro_Jsonclick = "" ;
      edtProForClv_Jsonclick = "" ;
      edtProForCla_Jsonclick = "" ;
      edtavClavesdel_Jsonclick = "" ;
      edtavClaves_Jsonclick = "" ;
      edtForPrdUMe_Jsonclick = "" ;
      edtProForCan_Jsonclick = "" ;
      edtProForCPo_Jsonclick = "" ;
      edtProForDes_Jsonclick = "" ;
      edtPrdNomForm_Jsonclick = "" ;
      edtPrdFind_Jsonclick = "" ;
      edtProForPrd_Jsonclick = "" ;
      edtProForLin_Jsonclick = "" ;
      subGridlevel_procesosquimicoslineas_Class = "GridNoBorder WorkWith" ;
      subGridlevel_procesosquimicoslineas_Backcolorstyle = (byte)(0) ;
      edtavClavesdel_gximage = "" ;
      edtavClaves_gximage = "" ;
      edtPrdMaxFind_Enabled = 0 ;
      edtProForTnq_Enabled = 1 ;
      edtProForNro_Enabled = 1 ;
      edtProForClv_Visible = -1 ;
      edtProForClv_Enabled = 0 ;
      edtProForCla_Enabled = 0 ;
      edtavClavesdel_Visible = -1 ;
      edtavClaves_Visible = -1 ;
      edtForPrdUMe_Enabled = 1 ;
      edtProForCan_Enabled = 1 ;
      edtProForCPo_Visible = -1 ;
      edtProForCPo_Enabled = 1 ;
      edtProForDes_Enabled = 1 ;
      edtPrdNomForm_Enabled = 0 ;
      edtPrdFind_Enabled = 0 ;
      edtProForPrd_Enabled = 1 ;
      edtProForLin_Enabled = 1 ;
      Gridlevel_procesosquimicoslineas_titlescategories_Gridtitlescategories = ";;;;;;;;;Claves;Claves;Claves;Claves;;;" ;
      edtPorForFul_Jsonclick = "" ;
      edtPorForFul_Enabled = 1 ;
      edtPorForFul_Visible = 1 ;
      edtEmprNom_Jsonclick = "" ;
      edtEmprNom_Enabled = 0 ;
      edtEmprNom_Visible = 1 ;
      edtEmprCod_Jsonclick = "" ;
      edtEmprCod_Enabled = 1 ;
      edtEmprCod_Visible = 1 ;
      edtEmprCodV2_Jsonclick = "" ;
      edtEmprCodV2_Enabled = 0 ;
      edtEmprCodV2_Visible = 1 ;
      edtProForCodV_Jsonclick = "" ;
      edtProForCodV_Enabled = 0 ;
      edtProForCodV_Visible = 1 ;
      edtProFDsc_Jsonclick = "" ;
      edtProFDsc_Enabled = 0 ;
      edtProFDsc_Visible = 1 ;
      edtProForMer_Jsonclick = "" ;
      edtProForMer_Enabled = 1 ;
      edtProForMer_Visible = 1 ;
      edtProForDCi_Jsonclick = "" ;
      edtProForDCi_Enabled = 1 ;
      edtProForDCi_Visible = 1 ;
      edtProForCCi_Jsonclick = "" ;
      edtProForCCi_Enabled = 1 ;
      edtProForCCi_Visible = 1 ;
      edtavComboproforlab_Jsonclick = "" ;
      edtavComboproforlab_Enabled = 0 ;
      edtavComboproforlab_Visible = 1 ;
      bttBtntrn_delete_Enabled = 0 ;
      bttBtntrn_delete_Visible = 1 ;
      bttBtntrn_cancel_Visible = 1 ;
      bttBtntrn_enter_Enabled = 1 ;
      bttBtntrn_enter_Visible = 1 ;
      edtProForPau_Jsonclick = "" ;
      edtProForPau_Enabled = 1 ;
      edtProForPau_Visible = 1 ;
      divProforpau_cell_Class = "col-xs-12 col-sm-4" ;
      edtProNumRec_Jsonclick = "" ;
      edtProNumRec_Enabled = 1 ;
      edtProNumPro_Jsonclick = "" ;
      edtProNumPro_Enabled = 1 ;
      edtProH2O_Jsonclick = "" ;
      edtProH2O_Enabled = 1 ;
      edtProH2O_Visible = 1 ;
      divProh2o_cell_Class = "col-xs-12 col-sm-2" ;
      edtProforVl_Jsonclick = "" ;
      edtProforVl_Enabled = 1 ;
      edtProforVl_Visible = 1 ;
      divProforvl_cell_Class = "col-xs-12 col-sm-2" ;
      edtProForCos_Jsonclick = "" ;
      edtProForCos_Enabled = 1 ;
      edtProForCos_Visible = 1 ;
      divProforcos_cell_Class = "col-xs-12 col-sm-2" ;
      edtProForAbs_Jsonclick = "" ;
      edtProForAbs_Enabled = 1 ;
      edtProForAbs_Visible = 1 ;
      divProforabs_cell_Class = "col-xs-12 col-sm-3" ;
      edtProForLab_Jsonclick = "" ;
      edtProForLab_Enabled = 1 ;
      edtProForLab_Visible = 1 ;
      Combo_proforlab_Emptyitemtext = "s/d" ;
      Combo_proforlab_Cls = "ExtendedCombo AttributeFL" ;
      Combo_proforlab_Enabled = GXutil.toBoolean( -1) ;
      edtProForRb_Jsonclick = "" ;
      edtProForRb_Enabled = 1 ;
      edtProForMat_Jsonclick = "" ;
      edtProForMat_Enabled = 1 ;
      edtProForTmx_Jsonclick = "" ;
      edtProForTmx_Enabled = 1 ;
      edtProForTie_Jsonclick = "" ;
      edtProForTie_Enabled = 1 ;
      cmbProRev.setJsonclick( "" );
      cmbProRev.setEnabled( 1 );
      edtProForRs_Jsonclick = "" ;
      edtProForRs_Enabled = 1 ;
      edtProForRs_Visible = 1 ;
      divProforrs_cell_Class = "col-xs-12 col-sm-2" ;
      edtProForTip_Jsonclick = "" ;
      edtProForTip_Enabled = 1 ;
      chkProForAct.setEnabled( 1 );
      edtProForDsc2_Jsonclick = "" ;
      edtProForDsc2_Enabled = 1 ;
      edtProForDsc_Jsonclick = "" ;
      edtProForDsc_Enabled = 1 ;
      edtProForCod_Jsonclick = "" ;
      edtProForCod_Enabled = 1 ;
      Dvpanel_tableattributes_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_tableattributes_Iconposition = "Right" ;
      Dvpanel_tableattributes_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_tableattributes_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_tableattributes_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_tableattributes_Title = httpContext.getMessage( "WWP_TemplateDataPanelTitle", "") ;
      Dvpanel_tableattributes_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_tableattributes_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_tableattributes_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_tableattributes_Width = "100%" ;
      edtavClavesdel_Enabled = 1 ;
      edtavClaves_Enabled = 1 ;
      edtavClavesdel_Tooltiptext = "" ;
      edtavClaves_Tooltiptext = "" ;
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

   public void gxsgaproforprd1RW0( String A396EmprCod ,
                                   String A719PrdNum )
   {
      if ( ! httpContext.isAjaxRequest( ) )
      {
         httpContext.GX_webresponse.addHeader("Cache-Control", "no-store");
      }
      addString( "[[") ;
      gxsgaproforprd_data1RW0( A396EmprCod, A719PrdNum) ;
      gxdynajaxindex = 1 ;
      while ( gxdynajaxindex <= gxdynajaxctrlcodr.getCount() )
      {
         addString( gxwrpcisep+"{\"c\":\""+PrivateUtilities.encodeJSConstant( gxdynajaxctrlcodr.item(gxdynajaxindex))+"\",\"d\":\""+PrivateUtilities.encodeJSConstant( gxdynajaxctrldescr.item(gxdynajaxindex))+"\"}") ;
         gxdynajaxindex = (int)(gxdynajaxindex+1) ;
         gxwrpcisep = "," ;
      }
      addString( "]") ;
      if ( gxdynajaxctrlcodr.getCount() == 0 )
      {
         addString( ",101") ;
      }
      addString( "]") ;
   }

   protected void gxsgaproforprd_data1RW0( String A396EmprCod ,
                                           String A719PrdNum )
   {
      l719PrdNum = GXutil.padr( GXutil.rtrim( A719PrdNum), 6, "%") ;
      /* Using cursor T01RW86 */
      pr_default.execute(63, new Object[] {A396EmprCod, l719PrdNum});
      gxdynajaxctrlcodr.removeAllItems();
      gxdynajaxctrldescr.removeAllItems();
      while ( (pr_default.getStatus(63) != 101) )
      {
         gxdynajaxctrlcodr.add(GXutil.rtrim( T01RW86_A719PrdNum[0]));
         gxdynajaxctrldescr.add(GXutil.rtrim( T01RW86_A719PrdNum[0]));
         pr_default.readNext(63);
      }
      pr_default.close(63);
   }

   public void gxsgaforprdume1RW0( String A396EmprCod ,
                                   String A13746ForPrdCDsc )
   {
      if ( ! httpContext.isAjaxRequest( ) )
      {
         httpContext.GX_webresponse.addHeader("Cache-Control", "no-store");
      }
      addString( "[[") ;
      gxsgaforprdume_data1RW0( A396EmprCod, A13746ForPrdCDsc) ;
      gxdynajaxindex = 1 ;
      while ( gxdynajaxindex <= gxdynajaxctrlcodr.getCount() )
      {
         addString( gxwrpcisep+"{\"c\":\""+PrivateUtilities.encodeJSConstant( gxdynajaxctrlcodr.item(gxdynajaxindex))+"\",\"d\":\""+PrivateUtilities.encodeJSConstant( gxdynajaxctrldescr.item(gxdynajaxindex))+"\"}") ;
         gxdynajaxindex = (int)(gxdynajaxindex+1) ;
         gxwrpcisep = "," ;
      }
      addString( "]") ;
      if ( gxdynajaxctrlcodr.getCount() == 0 )
      {
         addString( ",101") ;
      }
      addString( "]") ;
   }

   protected void gxsgaforprdume_data1RW0( String A396EmprCod ,
                                           String A13746ForPrdCDsc )
   {
      l13746ForPrdCDsc = GXutil.concat( GXutil.rtrim( A13746ForPrdCDsc), "%", "") ;
      /* Using cursor T01RW87 */
      pr_default.execute(64, new Object[] {A396EmprCod, l13746ForPrdCDsc});
      gxdynajaxctrlcodr.removeAllItems();
      gxdynajaxctrldescr.removeAllItems();
      while ( (pr_default.getStatus(64) != 101) )
      {
         gxdynajaxctrlcodr.add(T01RW87_A13746ForPrdCDsc[0]);
         gxdynajaxctrldescr.add(T01RW87_A13746ForPrdCDsc[0]);
         pr_default.readNext(64);
      }
      pr_default.close(64);
   }

   public void gxhcaforprdume1RW90( String A396EmprCod ,
                                    String A13746ForPrdCDsc )
   {
      /* Using cursor T01RW88 */
      pr_default.execute(65, new Object[] {A13746ForPrdCDsc, A396EmprCod});
      gxhchits = (short)(0) ;
      while ( (pr_default.getStatus(65) != 101) )
      {
         gxhchits = (short)(gxhchits+1) ;
         if ( gxhchits > 1 )
         {
            if (true) break;
         }
         A13746ForPrdCDsc = T01RW88_A13746ForPrdCDsc[0] ;
         A396EmprCod = T01RW88_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A490ForPrdUMe = T01RW88_A490ForPrdUMe[0] ;
         pr_default.readNext(65);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A490ForPrdUMe, (byte)(1), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( gxhchits > 1 )
      {
         addString( ",") ;
         addString( "\"ambiguousck\"") ;
      }
      if ( gxhchits == 0 )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(65);
   }

   public void gxasa60621RW89( String A396EmprCod )
   {
      GXt_int11 = (byte)(0) ;
      GXv_int12[0] = GXt_int11 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "%CDP", ""), ""), GXv_int12) ;
      procesosquimicos_trn_impl.this.GXt_int11 = GXv_int12[0] ;
      edtProForCPo_Visible = ((GXt_int11==1) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtProForCPo_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForCPo_Visible), 5, 0), !bGXsfl_125_Refreshing);
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

   public void gxasa53581RW89( String A396EmprCod )
   {
      GXt_int11 = (byte)(0) ;
      GXv_int12[0] = GXt_int11 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "CLAVE2", ""), ""), GXv_int12) ;
      procesosquimicos_trn_impl.this.GXt_int11 = GXv_int12[0] ;
      edtProForClv_Visible = ((GXt_int11==1) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtProForClv_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForClv_Visible), 5, 0), !bGXsfl_125_Refreshing);
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

   public void gxasa47051RW89( String A396EmprCod )
   {
      GXt_int11 = (byte)(0) ;
      GXv_int12[0] = GXt_int11 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "LAVAND", ""), ""), GXv_int12) ;
      procesosquimicos_trn_impl.this.GXt_int11 = GXv_int12[0] ;
      edtProForPau_Visible = ((GXt_int11==1) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtProForPau_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForPau_Visible), 5, 0), true);
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

   public void gxasa85271RW89( String A396EmprCod )
   {
      GXt_int11 = (byte)(0) ;
      GXv_int12[0] = GXt_int11 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "TINTTO", ""), ""), GXv_int12) ;
      procesosquimicos_trn_impl.this.GXt_int11 = GXv_int12[0] ;
      edtProForAbs_Visible = ((GXt_int11==1) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtProForAbs_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForAbs_Visible), 5, 0), true);
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

   public void gxasa85281RW89( String A396EmprCod )
   {
      GXt_int11 = (byte)(0) ;
      GXv_int12[0] = GXt_int11 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "TINTTO", ""), ""), GXv_int12) ;
      procesosquimicos_trn_impl.this.GXt_int11 = GXv_int12[0] ;
      edtProForCos_Visible = ((GXt_int11==1) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtProForCos_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForCos_Visible), 5, 0), true);
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

   public void gxasa101201RW89( String A396EmprCod )
   {
      GXt_int11 = (byte)(0) ;
      GXv_int12[0] = GXt_int11 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "TEJIDO", ""), ""), GXv_int12) ;
      procesosquimicos_trn_impl.this.GXt_int11 = GXv_int12[0] ;
      GXt_int6 = (byte)(0) ;
      GXv_int5[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "LAVADO", ""), ""), GXv_int5) ;
      procesosquimicos_trn_impl.this.GXt_int6 = GXv_int5[0] ;
      edtProforVl_Visible = ((GXt_int11==1)||(GXt_int6==1) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtProforVl_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProforVl_Visible), 5, 0), true);
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

   public void gxasa105471RW89( String A396EmprCod )
   {
      GXt_int11 = (byte)(0) ;
      GXv_int12[0] = GXt_int11 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "JPF", ""), ""), GXv_int12) ;
      procesosquimicos_trn_impl.this.GXt_int11 = GXv_int12[0] ;
      edtProH2O_Visible = ((GXt_int11==1) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtProH2O_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProH2O_Visible), 5, 0), true);
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

   public void gxasa139361RW89( String A396EmprCod )
   {
      GXt_int11 = (byte)(0) ;
      GXv_int12[0] = GXt_int11 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "AC2013", ""), ""), GXv_int12) ;
      procesosquimicos_trn_impl.this.GXt_int11 = GXv_int12[0] ;
      edtProForRs_Visible = ((GXt_int11==1) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtProForRs_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForRs_Visible), 5, 0), true);
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

   public void gx35asaprdnomform1RW90( String A396EmprCod ,
                                       String A770ProForPrd )
   {
      GXt_char1 = A13976PrdNomForm ;
      GXv_char4[0] = A396EmprCod ;
      GXv_char3[0] = A770ProForPrd ;
      GXv_char2[0] = GXt_char1 ;
      new app.pprddsc(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2) ;
      procesosquimicos_trn_impl.this.A396EmprCod = GXv_char4[0] ;
      procesosquimicos_trn_impl.this.A770ProForPrd = GXv_char3[0] ;
      procesosquimicos_trn_impl.this.GXt_char1 = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A13976PrdNomForm = GXt_char1 ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A13976PrdNomForm))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_32_1RW89( String A396EmprCod ,
                            String A6061ProForLab ,
                            short AV38Exis_pro )
   {
      if ( true /* After */ && ! (GXutil.strcmp("", A6061ProForLab)==0) )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_char3[0] = A6061ProForLab ;
         GXv_int12[0] = (byte)(AV38Exis_pro) ;
         new app.pexiprq(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_int12) ;
         A396EmprCod = GXv_char4[0] ;
         A6061ProForLab = GXv_char3[0] ;
         AV38Exis_pro = GXv_int12[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A6061ProForLab", A6061ProForLab);
         httpContext.ajax_rsp_assign_attri("", false, "AV38Exis_pro", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV38Exis_pro), 4, 0));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A6061ProForLab))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV38Exis_pro, (byte)(4), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_59_1RW90( String Gx_mode ,
                            String A396EmprCod ,
                            String AV53Pgmname ,
                            String AV8Usurcod ,
                            String AV9Station ,
                            String AV10Msg_e ,
                            short A767ProForLin )
   {
      if ( isIns( )  && true /* After */ )
      {
         new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV53Pgmname, AV8Usurcod, AV9Station, AV10Msg_e, A767ProForLin, (byte)(0), "@") ;
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

   public void xc_60_1RW90( String Gx_mode ,
                            String A396EmprCod ,
                            String AV53Pgmname ,
                            String AV8Usurcod ,
                            String AV9Station ,
                            String AV10Msg_e ,
                            short A767ProForLin ,
                            java.math.BigDecimal A762ProForCan ,
                            byte A490ForPrdUMe ,
                            String A763ProForCla ,
                            String A5358ProForClv )
   {
      if ( isUpd( )  && true /* Level */ && ( ( DecimalUtil.compareTo(A762ProForCan, O762ProForCan) != 0 ) || ( A490ForPrdUMe != O490ForPrdUMe ) || ( GXutil.strcmp(A763ProForCla, O763ProForCla) != 0 ) || ( GXutil.strcmp(A5358ProForClv, O5358ProForClv) != 0 ) ) )
      {
         new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV53Pgmname, AV8Usurcod, AV9Station, AV10Msg_e, 99999999, (byte)(0), "@") ;
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

   public void xc_61_1RW90( String Gx_mode ,
                            String A396EmprCod ,
                            String AV53Pgmname ,
                            String AV8Usurcod ,
                            String AV9Station ,
                            String AV39Msg_del ,
                            short A767ProForLin )
   {
      if ( isDlt( )  && true /* Level */ )
      {
         new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV53Pgmname, AV8Usurcod, AV9Station, AV39Msg_del, A767ProForLin, (byte)(0), "@") ;
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

   public void gxnrgridlevel_procesosquimicoslineas_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      subsflControlProps_12590( ) ;
      while ( nGXsfl_125_idx <= nRC_GXsfl_125 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal1RW90( ) ;
         standaloneModal1RW90( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow1RW90( ) ;
         nGXsfl_125_idx = (int)(nGXsfl_125_idx+1) ;
         sGXsfl_125_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_125_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_12590( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Gridlevel_procesosquimicoslineasContainer)) ;
      /* End function gxnrGridlevel_procesosquimicoslineas_newrow */
   }

   public void init_web_controls( )
   {
      chkProForAct.setName( "PROFORACT" );
      chkProForAct.setWebtags( "" );
      chkProForAct.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkProForAct.getInternalname(), "TitleCaption", chkProForAct.getCaption(), true);
      chkProForAct.setCheckedValue( "N" );
      if ( isIns( ) && (GXutil.strcmp("", A13133ProForAct)==0) )
      {
         A13133ProForAct = httpContext.getMessage( "S", "") ;
         httpContext.ajax_rsp_assign_attri("", false, "A13133ProForAct", A13133ProForAct);
      }
      cmbProRev.setName( "PROREV" );
      cmbProRev.setWebtags( "" );
      cmbProRev.addItem("N", httpContext.getMessage( "N", ""), (short)(0));
      cmbProRev.addItem("S", httpContext.getMessage( "S", ""), (short)(0));
      if ( cmbProRev.getItemCount() > 0 )
      {
         if ( isIns( ) && (GXutil.strcmp("", A3005ProRev)==0) )
         {
            A3005ProRev = httpContext.getMessage( "N", "") ;
            httpContext.ajax_rsp_assign_attri("", false, "A3005ProRev", A3005ProRev);
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

   public void valid_Proforcod( )
   {
      n764ProForCod = false ;
      A920ProForCodV = A764ProForCod ;
      if ( true )
      {
         A6061ProForLab = AV50ComboProForLab ;
      }
      else
      {
         if ( isIns( )  && (GXutil.strcmp("", A6061ProForLab)==0) && ( Gx_BScreen == 0 ) )
         {
            A6061ProForLab = A764ProForCod ;
         }
      }
      if ( (GXutil.strcmp("", A764ProForCod)==0) )
      {
         httpContext.GX_msglist.addItem("Código de proceso nulo", 1, "PROFORCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtProForCod_Internalname ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A920ProForCodV", GXutil.rtrim( A920ProForCodV));
      httpContext.ajax_rsp_assign_attri("", false, "A6061ProForLab", GXutil.rtrim( A6061ProForLab));
   }

   public void valid_Emprcod( )
   {
      n407EmprNom = false ;
      /* Using cursor T01RW26 */
      pr_default.execute(17, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(17) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A407EmprNom = T01RW26_A407EmprNom[0] ;
      n407EmprNom = T01RW26_n407EmprNom[0] ;
      pr_default.close(17);
      A941EmprCodV2 = A396EmprCod ;
      GXt_int11 = (byte)(0) ;
      GXv_int12[0] = GXt_int11 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "%CDP", ""), ""), GXv_int12) ;
      procesosquimicos_trn_impl.this.GXt_int11 = GXv_int12[0] ;
      edtProForCPo_Visible = ((GXt_int11==1) ? 1 : 0) ;
      GXt_int11 = (byte)(0) ;
      GXv_int12[0] = GXt_int11 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "CLAVE2", ""), ""), GXv_int12) ;
      procesosquimicos_trn_impl.this.GXt_int11 = GXv_int12[0] ;
      edtProForClv_Visible = ((GXt_int11==1) ? 1 : 0) ;
      GXt_int11 = (byte)(0) ;
      GXv_int12[0] = GXt_int11 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "LAVAND", ""), ""), GXv_int12) ;
      procesosquimicos_trn_impl.this.GXt_int11 = GXv_int12[0] ;
      edtProForPau_Visible = ((GXt_int11==1) ? 1 : 0) ;
      GXt_int11 = (byte)(0) ;
      GXv_int12[0] = GXt_int11 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "LAVAND", ""), ""), GXv_int12) ;
      procesosquimicos_trn_impl.this.GXt_int11 = GXv_int12[0] ;
      if ( ! ( ( GXt_int11 == 1 ) ) )
      {
         divProforpau_cell_Class = httpContext.getMessage( "Invisible", "") ;
      }
      else
      {
         GXt_int11 = (byte)(0) ;
         GXv_int12[0] = GXt_int11 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "LAVAND", ""), ""), GXv_int12) ;
         procesosquimicos_trn_impl.this.GXt_int11 = GXv_int12[0] ;
         if ( GXt_int11 == 1 )
         {
            divProforpau_cell_Class = httpContext.getMessage( "col-xs-12 col-sm-4 DataContentCell", "") ;
         }
      }
      GXt_int11 = (byte)(0) ;
      GXv_int12[0] = GXt_int11 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "TINTTO", ""), ""), GXv_int12) ;
      procesosquimicos_trn_impl.this.GXt_int11 = GXv_int12[0] ;
      edtProForAbs_Visible = ((GXt_int11==1) ? 1 : 0) ;
      GXt_int11 = (byte)(0) ;
      GXv_int12[0] = GXt_int11 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "TINTTO", ""), ""), GXv_int12) ;
      procesosquimicos_trn_impl.this.GXt_int11 = GXv_int12[0] ;
      if ( ! ( ( GXt_int11 == 1 ) ) )
      {
         divProforabs_cell_Class = httpContext.getMessage( "Invisible", "") ;
      }
      else
      {
         GXt_int11 = (byte)(0) ;
         GXv_int12[0] = GXt_int11 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "TINTTO", ""), ""), GXv_int12) ;
         procesosquimicos_trn_impl.this.GXt_int11 = GXv_int12[0] ;
         if ( GXt_int11 == 1 )
         {
            divProforabs_cell_Class = httpContext.getMessage( "col-xs-12 col-sm-3 DataContentCell", "") ;
         }
      }
      GXt_int11 = (byte)(0) ;
      GXv_int12[0] = GXt_int11 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "TINTTO", ""), ""), GXv_int12) ;
      procesosquimicos_trn_impl.this.GXt_int11 = GXv_int12[0] ;
      edtProForCos_Visible = ((GXt_int11==1) ? 1 : 0) ;
      GXt_int11 = (byte)(0) ;
      GXv_int12[0] = GXt_int11 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "TINTTO", ""), ""), GXv_int12) ;
      procesosquimicos_trn_impl.this.GXt_int11 = GXv_int12[0] ;
      if ( ! ( ( GXt_int11 == 1 ) ) )
      {
         divProforcos_cell_Class = httpContext.getMessage( "Invisible", "") ;
      }
      else
      {
         GXt_int11 = (byte)(0) ;
         GXv_int12[0] = GXt_int11 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "TINTTO", ""), ""), GXv_int12) ;
         procesosquimicos_trn_impl.this.GXt_int11 = GXv_int12[0] ;
         if ( GXt_int11 == 1 )
         {
            divProforcos_cell_Class = httpContext.getMessage( "col-xs-12 col-sm-2 DataContentCell", "") ;
         }
      }
      GXt_int11 = (byte)(0) ;
      GXv_int12[0] = GXt_int11 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "TEJIDO", ""), ""), GXv_int12) ;
      procesosquimicos_trn_impl.this.GXt_int11 = GXv_int12[0] ;
      GXt_int6 = (byte)(0) ;
      GXv_int5[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "LAVADO", ""), ""), GXv_int5) ;
      procesosquimicos_trn_impl.this.GXt_int6 = GXv_int5[0] ;
      edtProforVl_Visible = ((GXt_int11==1)||(GXt_int6==1) ? 1 : 0) ;
      GXt_int11 = (byte)(0) ;
      GXv_int12[0] = GXt_int11 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "TEJIDO", ""), ""), GXv_int12) ;
      procesosquimicos_trn_impl.this.GXt_int11 = GXv_int12[0] ;
      GXt_int6 = (byte)(0) ;
      GXv_int5[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "LAVADO", ""), ""), GXv_int5) ;
      procesosquimicos_trn_impl.this.GXt_int6 = GXv_int5[0] ;
      if ( ! ( ( GXt_int11 == 1 ) || ( GXt_int6 == 1 ) ) )
      {
         divProforvl_cell_Class = httpContext.getMessage( "Invisible", "") ;
      }
      else
      {
         GXt_int11 = (byte)(0) ;
         GXv_int12[0] = GXt_int11 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "TEJIDO", ""), ""), GXv_int12) ;
         procesosquimicos_trn_impl.this.GXt_int11 = GXv_int12[0] ;
         GXt_int6 = (byte)(0) ;
         GXv_int5[0] = GXt_int6 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "LAVADO", ""), ""), GXv_int5) ;
         procesosquimicos_trn_impl.this.GXt_int6 = GXv_int5[0] ;
         if ( ( GXt_int11 == 1 ) || ( GXt_int6 == 1 ) )
         {
            divProforvl_cell_Class = httpContext.getMessage( "col-xs-12 col-sm-2 DataContentCell", "") ;
         }
      }
      GXt_int11 = (byte)(0) ;
      GXv_int12[0] = GXt_int11 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "JPF", ""), ""), GXv_int12) ;
      procesosquimicos_trn_impl.this.GXt_int11 = GXv_int12[0] ;
      edtProH2O_Visible = ((GXt_int11==1) ? 1 : 0) ;
      GXt_int11 = (byte)(0) ;
      GXv_int12[0] = GXt_int11 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "JPF", ""), ""), GXv_int12) ;
      procesosquimicos_trn_impl.this.GXt_int11 = GXv_int12[0] ;
      if ( ! ( ( GXt_int11 == 1 ) ) )
      {
         divProh2o_cell_Class = httpContext.getMessage( "Invisible", "") ;
      }
      else
      {
         GXt_int11 = (byte)(0) ;
         GXv_int12[0] = GXt_int11 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "JPF", ""), ""), GXv_int12) ;
         procesosquimicos_trn_impl.this.GXt_int11 = GXv_int12[0] ;
         if ( GXt_int11 == 1 )
         {
            divProh2o_cell_Class = httpContext.getMessage( "col-xs-12 col-sm-2 DataContentCell", "") ;
         }
      }
      GXt_int11 = (byte)(0) ;
      GXv_int12[0] = GXt_int11 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "AC2013", ""), ""), GXv_int12) ;
      procesosquimicos_trn_impl.this.GXt_int11 = GXv_int12[0] ;
      edtProForRs_Visible = ((GXt_int11==1) ? 1 : 0) ;
      GXt_int11 = (byte)(0) ;
      GXv_int12[0] = GXt_int11 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "AC2013", ""), ""), GXv_int12) ;
      procesosquimicos_trn_impl.this.GXt_int11 = GXv_int12[0] ;
      if ( ! ( ( GXt_int11 == 1 ) ) )
      {
         divProforrs_cell_Class = httpContext.getMessage( "Invisible", "") ;
      }
      else
      {
         GXt_int11 = (byte)(0) ;
         GXv_int12[0] = GXt_int11 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "AC2013", ""), ""), GXv_int12) ;
         procesosquimicos_trn_impl.this.GXt_int11 = GXv_int12[0] ;
         if ( GXt_int11 == 1 )
         {
            divProforrs_cell_Class = httpContext.getMessage( "col-xs-12 col-sm-2 DataContentCell", "") ;
         }
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A941EmprCodV2", GXutil.rtrim( A941EmprCodV2));
      httpContext.ajax_rsp_assign_prop("", false, edtProForCPo_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForCPo_Visible), 5, 0), !bGXsfl_125_Refreshing);
      httpContext.ajax_rsp_assign_prop("", false, edtProForClv_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForClv_Visible), 5, 0), !bGXsfl_125_Refreshing);
      httpContext.ajax_rsp_assign_prop("", false, edtProForPau_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForPau_Visible), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, divProforpau_cell_Internalname, "Class", divProforpau_cell_Class, true);
      httpContext.ajax_rsp_assign_prop("", false, edtProForAbs_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForAbs_Visible), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, divProforabs_cell_Internalname, "Class", divProforabs_cell_Class, true);
      httpContext.ajax_rsp_assign_prop("", false, edtProForCos_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForCos_Visible), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, divProforcos_cell_Internalname, "Class", divProforcos_cell_Class, true);
      httpContext.ajax_rsp_assign_prop("", false, edtProforVl_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProforVl_Visible), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, divProforvl_cell_Internalname, "Class", divProforvl_cell_Class, true);
      httpContext.ajax_rsp_assign_prop("", false, edtProH2O_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProH2O_Visible), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, divProh2o_cell_Internalname, "Class", divProh2o_cell_Class, true);
      httpContext.ajax_rsp_assign_prop("", false, edtProForRs_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForRs_Visible), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, divProforrs_cell_Internalname, "Class", divProforrs_cell_Class, true);
   }

   public void valid_Proforlin( )
   {
      n764ProForCod = false ;
      n717PrdMaxFind = false ;
      A768ProForLinV = A767ProForLin ;
      /* Using cursor T01RW94 */
      pr_default.execute(66, new Object[] {Short.valueOf(A768ProForLinV), A941EmprCodV2, A920ProForCodV, A941EmprCodV2, A920ProForCodV, Short.valueOf(A768ProForLinV), A941EmprCodV2, A920ProForCodV, Short.valueOf(A768ProForLinV), A941EmprCodV2, A920ProForCodV});
      if ( (pr_default.getStatus(66) != 101) )
      {
         A717PrdMaxFind = T01RW94_A717PrdMaxFind[0] ;
         n717PrdMaxFind = T01RW94_n717PrdMaxFind[0] ;
      }
      else
      {
         A717PrdMaxFind = "" ;
         n717PrdMaxFind = false ;
      }
      pr_default.close(66);
      AV7oldProforlin = O767ProForLin ;
      if ( true /* After */ && (0==A767ProForLin) && ( isIns( )  || isUpd( )  ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Numero de linea incorrecto ¡", ""), 1, "PROFORLIN");
         AnyError = (short)(1) ;
         GX_FocusControl = edtProForLin_Internalname ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A768ProForLinV", GXutil.ltrim( localUtil.ntoc( A768ProForLinV, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A717PrdMaxFind", GXutil.rtrim( A717PrdMaxFind));
      httpContext.ajax_rsp_assign_attri("", false, "AV7oldProforlin", GXutil.ltrim( localUtil.ntoc( AV7oldProforlin, (byte)(4), (byte)(0), ".", "")));
   }

   public void valid_Proforprd( )
   {
      n764ProForCod = false ;
      n710PrdFind = false ;
      n4340PrdUMeFind = false ;
      /* Using cursor T01RW95 */
      pr_default.execute(67, new Object[] {A396EmprCod, A770ProForPrd});
      if ( (pr_default.getStatus(67) != 101) )
      {
         A710PrdFind = T01RW95_A710PrdFind[0] ;
         n710PrdFind = T01RW95_n710PrdFind[0] ;
      }
      else
      {
         A710PrdFind = "xxxxxx" ;
         n710PrdFind = false ;
      }
      pr_default.close(67);
      /* Using cursor T01RW98 */
      pr_default.execute(68, new Object[] {Boolean.valueOf(n710PrdFind), A710PrdFind, A770ProForPrd, A396EmprCod});
      if ( (pr_default.getStatus(68) != 101) )
      {
         A4340PrdUMeFind = T01RW98_A4340PrdUMeFind[0] ;
         n4340PrdUMeFind = T01RW98_n4340PrdUMeFind[0] ;
      }
      else
      {
         A4340PrdUMeFind = (byte)(0) ;
         n4340PrdUMeFind = false ;
      }
      pr_default.close(68);
      GXt_char1 = A13976PrdNomForm ;
      GXv_char4[0] = A396EmprCod ;
      GXv_char3[0] = A770ProForPrd ;
      GXv_char2[0] = GXt_char1 ;
      new app.pprddsc(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2) ;
      procesosquimicos_trn_impl.this.A396EmprCod = GXv_char4[0] ;
      procesosquimicos_trn_impl.this.A770ProForPrd = GXv_char3[0] ;
      procesosquimicos_trn_impl.this.GXt_char1 = GXv_char2[0] ;
      A13976PrdNomForm = GXt_char1 ;
      if ( ( GXutil.strcmp(A710PrdFind, "xxxxxx") != 0 ) && true /* After */ && isIns( )  )
      {
         A765ProForDes = A13976PrdNomForm ;
      }
      if ( ( GXutil.strcmp(A710PrdFind, "xxxxxx") != 0 ) && ! (GXutil.strcmp("", A770ProForPrd)==0) && isIns( )  )
      {
         A490ForPrdUMe = A4340PrdUMeFind ;
         /* Using cursor T01RW99 */
         pr_default.execute(69, new Object[] {A396EmprCod, Byte.valueOf(A490ForPrdUMe)});
         h490ForPrdUMe = "" ;
         while ( (pr_default.getStatus(69) != 101) )
         {
            h490ForPrdUMe = T01RW99_A13746ForPrdCDsc[0] ;
            if (true) break;
         }
         pr_default.close(69);
         httpContext.ajax_rsp_assign_attri("", false, "h490ForPrdUMe", h490ForPrdUMe);
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A710PrdFind", GXutil.rtrim( A710PrdFind));
      httpContext.ajax_rsp_assign_attri("", false, "A4340PrdUMeFind", GXutil.ltrim( localUtil.ntoc( A4340PrdUMeFind, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A13976PrdNomForm", GXutil.rtrim( A13976PrdNomForm));
      httpContext.ajax_rsp_assign_attri("", false, "A765ProForDes", GXutil.rtrim( A765ProForDes));
      httpContext.ajax_rsp_assign_attri("", false, "A490ForPrdUMe", GXutil.ltrim( localUtil.ntoc( A490ForPrdUMe, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "h490ForPrdUMe", h490ForPrdUMe);
   }

   public void valid_Proforcan( )
   {
      AV30oldCant = O762ProForCan ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "AV30oldCant", GXutil.ltrim( localUtil.ntoc( AV30oldCant, (byte)(12), (byte)(5), ".", "")));
   }

   public void valid_Forprdume( )
   {
      n764ProForCod = false ;
      n488ForPrdDsc = false ;
      if ( (GXutil.strcmp("", h490ForPrdUMe)==0) )
      {
         A490ForPrdUMe = (byte)(0) ;
      }
      else
      {
         A13746ForPrdCDsc = h490ForPrdUMe ;
         /* Using cursor T01RW100 */
         pr_default.execute(70, new Object[] {A13746ForPrdCDsc, A396EmprCod});
         A490ForPrdUMe = T01RW100_A490ForPrdUMe[0] ;
         A490ForPrdUMe = T01RW100_A490ForPrdUMe[0] ;
         if ( ! ( (pr_default.getStatus(70) == 101) ) )
         {
            pr_default.readNext(70);
            if ( ! ( (pr_default.getStatus(70) == 101) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Codigo-Descripcion", "")}), 1, "FORPRDUME");
               AnyError = (short)(1) ;
               GX_FocusControl = edtForPrdUMe_Internalname ;
            }
         }
         else
         {
         }
         pr_default.close(70);
      }
      httpContext.ajax_rsp_assign_attri("", false, "h490ForPrdUMe", h490ForPrdUMe);
      /* Using cursor T01RW101 */
      pr_default.execute(71, new Object[] {A396EmprCod, Byte.valueOf(A490ForPrdUMe)});
      if ( (pr_default.getStatus(71) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "UNMEPR", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "FORPRDUME");
         AnyError = (short)(1) ;
         GX_FocusControl = edtForPrdUMe_Internalname ;
      }
      A488ForPrdDsc = T01RW101_A488ForPrdDsc[0] ;
      n488ForPrdDsc = T01RW101_n488ForPrdDsc[0] ;
      pr_default.close(71);
      if ( ! ( ( A490ForPrdUMe == 0 ) || ( A490ForPrdUMe == 1 ) || ( A490ForPrdUMe == 2 ) || ( A490ForPrdUMe == 3 ) ) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Unidad Medida", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, "FORPRDUME");
         AnyError = (short)(1) ;
         GX_FocusControl = edtForPrdUMe_Internalname ;
      }
      AV31Un = O490ForPrdUMe ;
      if ( isUpd( )  && true /* Level */ && ( DecimalUtil.compareTo(A762ProForCan, O762ProForCan) != 0 ) )
      {
         AV10Msg_e = httpContext.getMessage( "Proceso=", "") + GXutil.trim( A764ProForCod) + httpContext.getMessage( "UPD Linea=", "") + GXutil.str( A767ProForLin, 4, 0) + httpContext.getMessage( " Un New=", "") + GXutil.str( A490ForPrdUMe, 1, 0) + httpContext.getMessage( httpContext.getMessage( " Cant New=", ""), "") + GXutil.trim( GXutil.str( A762ProForCan, 12, 5)) + httpContext.getMessage( " Un New=", "") + GXutil.str( A490ForPrdUMe, 1, 0) + httpContext.getMessage( " Cant Old=", "") + GXutil.str( AV30oldCant, 12, 5) + GXutil.trim( GXutil.str( AV31Un, 1, 0)) + httpContext.getMessage( "Clave= ", "") + A763ProForCla + httpContext.getMessage( "ClaveII= ", "") + A5358ProForClv ;
      }
      AV39Msg_del = httpContext.getMessage( "Proceso=", "") + GXutil.trim( A764ProForCod) + httpContext.getMessage( " DEL Linea=", "") + GXutil.str( A767ProForLin, 4, 0) + httpContext.getMessage( " Producto=", "") + GXutil.trim( A770ProForPrd) + httpContext.getMessage( " Un=", "") + GXutil.str( A490ForPrdUMe, 1, 0) + httpContext.getMessage( " Cant= ", "") + GXutil.str( A762ProForCan, 12, 5) ;
      if ( isDlt( )  && true /* Level */ )
      {
         new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV53Pgmname, AV8Usurcod, AV9Station, AV39Msg_del, A767ProForLin, (byte)(0), "@") ;
      }
      if ( true /* After */ && (0==A767ProForLin) && ( isIns( )  || isUpd( )  ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Numero de linea incorrecto ¡", ""), 1, "FORPRDUME");
         AnyError = (short)(1) ;
         GX_FocusControl = edtForPrdUMe_Internalname ;
      }
      if ( isUpd( )  && true /* Level */ && ( ( DecimalUtil.compareTo(A762ProForCan, O762ProForCan) != 0 ) || ( A490ForPrdUMe != O490ForPrdUMe ) || ( GXutil.strcmp(A763ProForCla, O763ProForCla) != 0 ) || ( GXutil.strcmp(A5358ProForClv, O5358ProForClv) != 0 ) ) )
      {
         new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV53Pgmname, AV8Usurcod, AV9Station, AV10Msg_e, 99999999, (byte)(0), "@") ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A490ForPrdUMe", GXutil.ltrim( localUtil.ntoc( A490ForPrdUMe, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A488ForPrdDsc", GXutil.rtrim( A488ForPrdDsc));
      httpContext.ajax_rsp_assign_attri("", false, "AV31Un", GXutil.ltrim( localUtil.ntoc( AV31Un, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV10Msg_e", GXutil.rtrim( AV10Msg_e));
      httpContext.ajax_rsp_assign_attri("", false, "AV39Msg_del", GXutil.rtrim( AV39Msg_del));
      httpContext.ajax_rsp_assign_attri("", false, "h490ForPrdUMe", h490ForPrdUMe);
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV12EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV32ProForCod',fld:'vPROFORCOD',pic:'',hsh:true},{av:'A13133ProForAct',fld:'PROFORACT',pic:''}]");
      setEventMetadata("ENTER",",oparms:[{av:'A13133ProForAct',fld:'PROFORACT',pic:''}]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV34TrnContext',fld:'vTRNCONTEXT',pic:'',hsh:true},{av:'AV32ProForCod',fld:'vPROFORCOD',pic:'',hsh:true},{av:'A13133ProForAct',fld:'PROFORACT',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[{av:'A13133ProForAct',fld:'PROFORACT',pic:''}]}");
      setEventMetadata("AFTER TRN","{handler:'e121RW2',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV34TrnContext',fld:'vTRNCONTEXT',pic:'',hsh:true},{av:'A13133ProForAct',fld:'PROFORACT',pic:''}]");
      setEventMetadata("AFTER TRN",",oparms:[{av:'A13133ProForAct',fld:'PROFORACT',pic:''}]}");
      setEventMetadata("VCLAVES.CLICK","{handler:'e131RW2',iparms:[{av:'A767ProForLin',fld:'PROFORLIN',pic:'ZZZ9'},{av:'A770ProForPrd',fld:'PROFORPRD',pic:''},{av:'AV12EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'A764ProForCod',fld:'PROFORCOD',pic:''},{av:'A766ProForDsc',fld:'PROFORDSC',pic:''},{av:'A773ProForUli',fld:'PROFORULI',pic:'ZZZ9'},{av:'A13133ProForAct',fld:'PROFORACT',pic:''}]");
      setEventMetadata("VCLAVES.CLICK",",oparms:[{av:'A767ProForLin',fld:'PROFORLIN',pic:'ZZZ9'},{av:'A764ProForCod',fld:'PROFORCOD',pic:''},{av:'AV12EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'A773ProForUli',fld:'PROFORULI',pic:'ZZZ9'},{av:'A5358ProForClv',fld:'PROFORCLV',pic:''},{av:'A763ProForCla',fld:'PROFORCLA',pic:''},{av:'A766ProForDsc',fld:'PROFORDSC',pic:''},{av:'A13133ProForAct',fld:'PROFORACT',pic:''}]}");
      setEventMetadata("VCLAVESDEL.CLICK","{handler:'e141RW90',iparms:[{av:'AV12EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'A764ProForCod',fld:'PROFORCOD',pic:''},{av:'A766ProForDsc',fld:'PROFORDSC',pic:''},{av:'A763ProForCla',fld:'PROFORCLA',pic:''},{av:'A5358ProForClv',fld:'PROFORCLV',pic:''},{av:'AV45Clavesdel',fld:'vCLAVESDEL',pic:''},{av:'A13133ProForAct',fld:'PROFORACT',pic:''}]");
      setEventMetadata("VCLAVESDEL.CLICK",",oparms:[{av:'A5358ProForClv',fld:'PROFORCLV',pic:''},{av:'A763ProForCla',fld:'PROFORCLA',pic:''},{av:'A13133ProForAct',fld:'PROFORACT',pic:''}]}");
      setEventMetadata("VALID_PROFORCOD","{handler:'valid_Proforcod',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'A764ProForCod',fld:'PROFORCOD',pic:''},{av:'AV50ComboProForLab',fld:'vCOMBOPROFORLAB',pic:''},{av:'Gx_BScreen',fld:'vGXBSCREEN',pic:'9'},{av:'A920ProForCodV',fld:'PROFORCODV',pic:''},{av:'A6061ProForLab',fld:'PROFORLAB',pic:''},{av:'A13133ProForAct',fld:'PROFORACT',pic:''}]");
      setEventMetadata("VALID_PROFORCOD",",oparms:[{av:'A920ProForCodV',fld:'PROFORCODV',pic:''},{av:'A6061ProForLab',fld:'PROFORLAB',pic:''},{av:'A13133ProForAct',fld:'PROFORACT',pic:''}]}");
      setEventMetadata("VALID_PROFORDSC","{handler:'valid_Profordsc',iparms:[{av:'A13133ProForAct',fld:'PROFORACT',pic:''}]");
      setEventMetadata("VALID_PROFORDSC",",oparms:[{av:'A13133ProForAct',fld:'PROFORACT',pic:''}]}");
      setEventMetadata("VALID_PROREV","{handler:'valid_Prorev',iparms:[{av:'A13133ProForAct',fld:'PROFORACT',pic:''}]");
      setEventMetadata("VALID_PROREV",",oparms:[{av:'A13133ProForAct',fld:'PROFORACT',pic:''}]}");
      setEventMetadata("VALID_PROFORTMX","{handler:'valid_Profortmx',iparms:[{av:'A13133ProForAct',fld:'PROFORACT',pic:''}]");
      setEventMetadata("VALID_PROFORTMX",",oparms:[{av:'A13133ProForAct',fld:'PROFORACT',pic:''}]}");
      setEventMetadata("VALID_PROFORRB","{handler:'valid_Proforrb',iparms:[{av:'A13133ProForAct',fld:'PROFORACT',pic:''}]");
      setEventMetadata("VALID_PROFORRB",",oparms:[{av:'A13133ProForAct',fld:'PROFORACT',pic:''}]}");
      setEventMetadata("VALID_PROFORLAB","{handler:'valid_Proforlab',iparms:[{av:'A13133ProForAct',fld:'PROFORACT',pic:''}]");
      setEventMetadata("VALID_PROFORLAB",",oparms:[{av:'A13133ProForAct',fld:'PROFORACT',pic:''}]}");
      setEventMetadata("VALIDV_COMBOPROFORLAB","{handler:'validv_Comboproforlab',iparms:[{av:'A13133ProForAct',fld:'PROFORACT',pic:''}]");
      setEventMetadata("VALIDV_COMBOPROFORLAB",",oparms:[{av:'A13133ProForAct',fld:'PROFORACT',pic:''}]}");
      setEventMetadata("VALID_PROFORCODV","{handler:'valid_Proforcodv',iparms:[{av:'A13133ProForAct',fld:'PROFORACT',pic:''}]");
      setEventMetadata("VALID_PROFORCODV",",oparms:[{av:'A13133ProForAct',fld:'PROFORACT',pic:''}]}");
      setEventMetadata("VALID_EMPRCODV2","{handler:'valid_Emprcodv2',iparms:[{av:'A13133ProForAct',fld:'PROFORACT',pic:''}]");
      setEventMetadata("VALID_EMPRCODV2",",oparms:[{av:'A13133ProForAct',fld:'PROFORACT',pic:''}]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A941EmprCodV2',fld:'EMPRCODV2',pic:'@!'},{av:'A13133ProForAct',fld:'PROFORACT',pic:''}]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A941EmprCodV2',fld:'EMPRCODV2',pic:'@!'},{av:'edtProForCPo_Visible',ctrl:'PROFORCPO',prop:'Visible'},{av:'edtProForClv_Visible',ctrl:'PROFORCLV',prop:'Visible'},{av:'edtProForPau_Visible',ctrl:'PROFORPAU',prop:'Visible'},{av:'divProforpau_cell_Class',ctrl:'PROFORPAU_CELL',prop:'Class'},{av:'edtProForAbs_Visible',ctrl:'PROFORABS',prop:'Visible'},{av:'divProforabs_cell_Class',ctrl:'PROFORABS_CELL',prop:'Class'},{av:'edtProForCos_Visible',ctrl:'PROFORCOS',prop:'Visible'},{av:'divProforcos_cell_Class',ctrl:'PROFORCOS_CELL',prop:'Class'},{av:'edtProforVl_Visible',ctrl:'PROFORVL',prop:'Visible'},{av:'divProforvl_cell_Class',ctrl:'PROFORVL_CELL',prop:'Class'},{av:'edtProH2O_Visible',ctrl:'PROH2O',prop:'Visible'},{av:'divProh2o_cell_Class',ctrl:'PROH2O_CELL',prop:'Class'},{av:'edtProForRs_Visible',ctrl:'PROFORRS',prop:'Visible'},{av:'divProforrs_cell_Class',ctrl:'PROFORRS_CELL',prop:'Class'},{av:'A13133ProForAct',fld:'PROFORACT',pic:''}]}");
      setEventMetadata("VALID_PROFORLIN","{handler:'valid_Proforlin',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'O767ProForLin'},{av:'A767ProForLin',fld:'PROFORLIN',pic:'ZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A764ProForCod',fld:'PROFORCOD',pic:''},{av:'A768ProForLinV',fld:'PROFORLINV',pic:'ZZZ9'},{av:'A941EmprCodV2',fld:'EMPRCODV2',pic:'@!'},{av:'A920ProForCodV',fld:'PROFORCODV',pic:''},{av:'A717PrdMaxFind',fld:'PRDMAXFIND',pic:''},{av:'AV7oldProforlin',fld:'vOLDPROFORLIN',pic:'ZZZ9'},{av:'A13133ProForAct',fld:'PROFORACT',pic:''}]");
      setEventMetadata("VALID_PROFORLIN",",oparms:[{av:'A768ProForLinV',fld:'PROFORLINV',pic:'ZZZ9'},{av:'A717PrdMaxFind',fld:'PRDMAXFIND',pic:''},{av:'AV7oldProforlin',fld:'vOLDPROFORLIN',pic:'ZZZ9'},{av:'A13133ProForAct',fld:'PROFORACT',pic:''}]}");
      setEventMetadata("VALID_PROFORPRD","{handler:'valid_Proforprd',iparms:[{av:'h490ForPrdUMe'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A770ProForPrd',fld:'PROFORPRD',pic:''},{av:'A764ProForCod',fld:'PROFORCOD',pic:''},{av:'A767ProForLin',fld:'PROFORLIN',pic:'ZZZ9'},{av:'A710PrdFind',fld:'PRDFIND',pic:''},{av:'A4340PrdUMeFind',fld:'PRDUMEFIND',pic:'9'},{av:'A13976PrdNomForm',fld:'PRDNOMFORM',pic:''},{av:'A765ProForDes',fld:'PROFORDES',pic:''},{av:'A490ForPrdUMe',fld:'FORPRDUME',pic:'9'},{av:'A13133ProForAct',fld:'PROFORACT',pic:''}]");
      setEventMetadata("VALID_PROFORPRD",",oparms:[{av:'A710PrdFind',fld:'PRDFIND',pic:''},{av:'A4340PrdUMeFind',fld:'PRDUMEFIND',pic:'9'},{av:'A13976PrdNomForm',fld:'PRDNOMFORM',pic:''},{av:'A765ProForDes',fld:'PROFORDES',pic:''},{av:'A490ForPrdUMe',fld:'FORPRDUME',pic:'9'},{av:'h490ForPrdUMe'},{av:'A13133ProForAct',fld:'PROFORACT',pic:''}]}");
      setEventMetadata("VALID_PRDFIND","{handler:'valid_Prdfind',iparms:[{av:'A13133ProForAct',fld:'PROFORACT',pic:''}]");
      setEventMetadata("VALID_PRDFIND",",oparms:[{av:'A13133ProForAct',fld:'PROFORACT',pic:''}]}");
      setEventMetadata("VALID_PROFORDES","{handler:'valid_Profordes',iparms:[{av:'A13133ProForAct',fld:'PROFORACT',pic:''}]");
      setEventMetadata("VALID_PROFORDES",",oparms:[{av:'A13133ProForAct',fld:'PROFORACT',pic:''}]}");
      setEventMetadata("VALID_PROFORCPO","{handler:'valid_Proforcpo',iparms:[{av:'A13133ProForAct',fld:'PROFORACT',pic:''}]");
      setEventMetadata("VALID_PROFORCPO",",oparms:[{av:'A13133ProForAct',fld:'PROFORACT',pic:''}]}");
      setEventMetadata("VALID_PROFORCAN","{handler:'valid_Proforcan',iparms:[{av:'O762ProForCan'},{av:'A762ProForCan',fld:'PROFORCAN',pic:'ZZZZZ9.9999'},{av:'AV30oldCant',fld:'vOLDCANT',pic:'ZZZZZ9.9999'},{av:'A13133ProForAct',fld:'PROFORACT',pic:''}]");
      setEventMetadata("VALID_PROFORCAN",",oparms:[{av:'AV30oldCant',fld:'vOLDCANT',pic:'ZZZZZ9.9999'},{av:'A13133ProForAct',fld:'PROFORACT',pic:''}]}");
      setEventMetadata("VALID_FORPRDUME","{handler:'valid_Forprdume',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'O5358ProForClv'},{av:'O763ProForCla'},{av:'O762ProForCan'},{av:'O490ForPrdUMe'},{av:'h490ForPrdUMe'},{av:'A490ForPrdUMe',fld:'FORPRDUME',pic:'9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A764ProForCod',fld:'PROFORCOD',pic:''},{av:'A767ProForLin',fld:'PROFORLIN',pic:'ZZZ9'},{av:'A762ProForCan',fld:'PROFORCAN',pic:'ZZZZZ9.9999'},{av:'AV30oldCant',fld:'vOLDCANT',pic:'ZZZZZ9.9999'},{av:'AV31Un',fld:'vUN',pic:'9'},{av:'A763ProForCla',fld:'PROFORCLA',pic:''},{av:'A5358ProForClv',fld:'PROFORCLV',pic:''},{av:'A770ProForPrd',fld:'PROFORPRD',pic:''},{av:'AV53Pgmname',fld:'vPGMNAME',pic:''},{av:'AV8Usurcod',fld:'vUSURCOD',pic:'@!'},{av:'AV9Station',fld:'vSTATION',pic:''},{av:'AV39Msg_del',fld:'vMSG_DEL',pic:''},{av:'AV10Msg_e',fld:'vMSG_E',pic:''},{av:'A488ForPrdDsc',fld:'FORPRDDSC',pic:''},{av:'A13133ProForAct',fld:'PROFORACT',pic:''}]");
      setEventMetadata("VALID_FORPRDUME",",oparms:[{av:'A490ForPrdUMe',fld:'FORPRDUME',pic:'9'},{av:'A488ForPrdDsc',fld:'FORPRDDSC',pic:''},{av:'AV31Un',fld:'vUN',pic:'9'},{av:'AV10Msg_e',fld:'vMSG_E',pic:''},{av:'AV39Msg_del',fld:'vMSG_DEL',pic:''},{av:'h490ForPrdUMe'},{av:'A13133ProForAct',fld:'PROFORACT',pic:''}]}");
      setEventMetadata("VALID_PROFORCLA","{handler:'valid_Proforcla',iparms:[{av:'A13133ProForAct',fld:'PROFORACT',pic:''}]");
      setEventMetadata("VALID_PROFORCLA",",oparms:[{av:'A13133ProForAct',fld:'PROFORACT',pic:''}]}");
      setEventMetadata("VALID_PROFORCLV","{handler:'valid_Proforclv',iparms:[{av:'A13133ProForAct',fld:'PROFORACT',pic:''}]");
      setEventMetadata("VALID_PROFORCLV",",oparms:[{av:'A13133ProForAct',fld:'PROFORACT',pic:''}]}");
      setEventMetadata("NULL","{handler:'valid_Prdmaxfind',iparms:[{av:'A13133ProForAct',fld:'PROFORACT',pic:''}]");
      setEventMetadata("NULL",",oparms:[{av:'A13133ProForAct',fld:'PROFORACT',pic:''}]}");
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
      pr_default.close(71);
      pr_default.close(61);
      pr_default.close(67);
      pr_default.close(59);
      pr_default.close(68);
      pr_default.close(60);
      pr_default.close(66);
      pr_default.close(58);
      pr_default.close(17);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOGx_mode = "" ;
      wcpOAV12EmprCod = "" ;
      wcpOAV32ProForCod = "" ;
      Z396EmprCod = "" ;
      Z764ProForCod = "" ;
      Z6061ProForLab = "" ;
      Z766ProForDsc = "" ;
      Z4715ProForDsc2 = "" ;
      Z769ProForMat = "" ;
      Z674PorForFul = GXutil.nullDate() ;
      Z3005ProRev = "" ;
      Z4864ProForCCi = "" ;
      Z4865ProForDCi = "" ;
      Z5523ProForTip = "" ;
      Z8527ProForAbs = DecimalUtil.ZERO ;
      Z8528ProForCos = DecimalUtil.ZERO ;
      Z3589ProForMer = DecimalUtil.ZERO ;
      Z13133ProForAct = "" ;
      Z13936ProForRs = "" ;
      Combo_proforlab_Selectedvalue_get = "" ;
      Z6062ProForCPo = DecimalUtil.ZERO ;
      Z13178ProForFT = "" ;
      Z765ProForDes = "" ;
      Z770ProForPrd = "" ;
      Z13111ProForDe2 = "" ;
      Z762ProForCan = DecimalUtil.ZERO ;
      Z763ProForCla = "" ;
      Z5358ProForClv = "" ;
      O762ProForCan = DecimalUtil.ZERO ;
      O763ProForCla = "" ;
      O5358ProForClv = "" ;
      N6062ProForCPo = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A6061ProForLab = "" ;
      Gx_mode = "" ;
      AV53Pgmname = "" ;
      AV8Usurcod = "" ;
      AV9Station = "" ;
      AV10Msg_e = "" ;
      A762ProForCan = DecimalUtil.ZERO ;
      A763ProForCla = "" ;
      A5358ProForClv = "" ;
      AV39Msg_del = "" ;
      A719PrdNum = "" ;
      A13746ForPrdCDsc = "" ;
      h490ForPrdUMe = "" ;
      A770ProForPrd = "" ;
      A764ProForCod = "" ;
      A710PrdFind = "" ;
      A941EmprCodV2 = "" ;
      A920ProForCodV = "" ;
      AV12EmprCod = "" ;
      AV32ProForCod = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      GX_FocusControl = "" ;
      AV41Claves = "" ;
      AV45Clavesdel = "" ;
      A13133ProForAct = "" ;
      A3005ProRev = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_tableattributes = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      A766ProForDsc = "" ;
      A4715ProForDsc2 = "" ;
      A5523ProForTip = "" ;
      A13936ProForRs = "" ;
      A769ProForMat = "" ;
      lblTextblockproforlab_Jsonclick = "" ;
      ucCombo_proforlab = new com.genexus.webpanels.GXUserControl();
      Combo_proforlab_Caption = "" ;
      AV48ProForLab_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      A8527ProForAbs = DecimalUtil.ZERO ;
      A8528ProForCos = DecimalUtil.ZERO ;
      bttBtntrn_enter_Jsonclick = "" ;
      bttBtntrn_cancel_Jsonclick = "" ;
      bttBtntrn_delete_Jsonclick = "" ;
      AV50ComboProForLab = "" ;
      A4864ProForCCi = "" ;
      A4865ProForDCi = "" ;
      A3589ProForMer = DecimalUtil.ZERO ;
      A13740ProFDsc = "" ;
      A407EmprNom = "" ;
      A674PorForFul = GXutil.nullDate() ;
      ucGridlevel_procesosquimicoslineas_titlescategories = new com.genexus.webpanels.GXUserControl();
      Gridlevel_procesosquimicoslineasContainer = new com.genexus.webpanels.GXWebGrid(context);
      sMode90 = "" ;
      sStyleString = "" ;
      AV29Msg1 = "" ;
      A13178ProForFT = "" ;
      AV30oldCant = DecimalUtil.ZERO ;
      A13111ProForDe2 = "" ;
      A488ForPrdDsc = "" ;
      Combo_proforlab_Objectcall = "" ;
      Combo_proforlab_Class = "" ;
      Combo_proforlab_Icontype = "" ;
      Combo_proforlab_Icon = "" ;
      Combo_proforlab_Tooltip = "" ;
      Combo_proforlab_Selectedvalue_set = "" ;
      Combo_proforlab_Selectedtext_set = "" ;
      Combo_proforlab_Selectedtext_get = "" ;
      Combo_proforlab_Gamoauthtoken = "" ;
      Combo_proforlab_Ddointernalname = "" ;
      Combo_proforlab_Titlecontrolalign = "" ;
      Combo_proforlab_Dropdownoptionstype = "" ;
      Combo_proforlab_Titlecontrolidtoreplace = "" ;
      Combo_proforlab_Datalisttype = "" ;
      Combo_proforlab_Datalistfixedvalues = "" ;
      Combo_proforlab_Datalistproc = "" ;
      Combo_proforlab_Datalistprocparametersprefix = "" ;
      Combo_proforlab_Remoteservicesparameters = "" ;
      Combo_proforlab_Htmltemplate = "" ;
      Combo_proforlab_Multiplevaluestype = "" ;
      Combo_proforlab_Loadingdata = "" ;
      Combo_proforlab_Noresultsfound = "" ;
      Combo_proforlab_Onlyselectedvalues = "" ;
      Combo_proforlab_Selectalltext = "" ;
      Combo_proforlab_Multiplevaluesseparator = "" ;
      Combo_proforlab_Addnewoptiontext = "" ;
      Dvpanel_tableattributes_Objectcall = "" ;
      Dvpanel_tableattributes_Class = "" ;
      Dvpanel_tableattributes_Height = "" ;
      Gridlevel_procesosquimicoslineas_titlescategories_Objectcall = "" ;
      Gridlevel_procesosquimicoslineas_titlescategories_Class = "" ;
      Gridlevel_procesosquimicoslineas_titlescategories_Gridinternalname = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      hsh = "" ;
      sMode89 = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      GXCCtl = "" ;
      A13976PrdNomForm = "" ;
      A765ProForDes = "" ;
      A6062ProForCPo = DecimalUtil.ZERO ;
      AV55Claves_GXI = "" ;
      AV56Clavesdel_GXI = "" ;
      A717PrdMaxFind = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      T762ProForCan = DecimalUtil.ZERO ;
      T763ProForCla = "" ;
      T5358ProForClv = "" ;
      AV11EmprNom = "" ;
      AV54Op = "" ;
      AV28msg0 = "" ;
      AV33WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext7 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV34TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV35WebSession = httpContext.getWebSession();
      GXt_objcol_SdtDVB_SDTComboData_Item8 = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV49ComboSelectedValue = "" ;
      GXv_objcol_SdtDVB_SDTComboData_Item9 = new GXBaseCollection[1] ;
      GXv_int10 = new short[1] ;
      AV51Proforprd = "" ;
      Z407EmprNom = "" ;
      T01RW17_A407EmprNom = new String[] {""} ;
      T01RW17_n407EmprNom = new boolean[] {false} ;
      T01RW18_A764ProForCod = new String[] {""} ;
      T01RW18_n764ProForCod = new boolean[] {false} ;
      T01RW18_A6061ProForLab = new String[] {""} ;
      T01RW18_A407EmprNom = new String[] {""} ;
      T01RW18_n407EmprNom = new boolean[] {false} ;
      T01RW18_A766ProForDsc = new String[] {""} ;
      T01RW18_A4715ProForDsc2 = new String[] {""} ;
      T01RW18_A771ProForTie = new short[1] ;
      T01RW18_A772ProForTmx = new short[1] ;
      T01RW18_A769ProForMat = new String[] {""} ;
      T01RW18_A674PorForFul = new java.util.Date[] {GXutil.nullDate()} ;
      T01RW18_A773ProForUli = new short[1] ;
      T01RW18_A2392ProNumPro = new int[1] ;
      T01RW18_A2393ProNumRec = new int[1] ;
      T01RW18_A3005ProRev = new String[] {""} ;
      T01RW18_A4705ProForPau = new short[1] ;
      T01RW18_A4706ProForRb = new short[1] ;
      T01RW18_A4864ProForCCi = new String[] {""} ;
      T01RW18_A4865ProForDCi = new String[] {""} ;
      T01RW18_A5523ProForTip = new String[] {""} ;
      T01RW18_A8527ProForAbs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01RW18_A8528ProForCos = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01RW18_A10120ProforVl = new int[1] ;
      T01RW18_A10547ProH2O = new short[1] ;
      T01RW18_A3589ProForMer = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01RW18_A13133ProForAct = new String[] {""} ;
      T01RW18_A13936ProForRs = new String[] {""} ;
      T01RW18_A396EmprCod = new String[] {""} ;
      T01RW19_A407EmprNom = new String[] {""} ;
      T01RW19_n407EmprNom = new boolean[] {false} ;
      T01RW20_A396EmprCod = new String[] {""} ;
      T01RW20_A764ProForCod = new String[] {""} ;
      T01RW20_n764ProForCod = new boolean[] {false} ;
      T01RW16_A764ProForCod = new String[] {""} ;
      T01RW16_n764ProForCod = new boolean[] {false} ;
      T01RW16_A6061ProForLab = new String[] {""} ;
      T01RW16_A766ProForDsc = new String[] {""} ;
      T01RW16_A4715ProForDsc2 = new String[] {""} ;
      T01RW16_A771ProForTie = new short[1] ;
      T01RW16_A772ProForTmx = new short[1] ;
      T01RW16_A769ProForMat = new String[] {""} ;
      T01RW16_A674PorForFul = new java.util.Date[] {GXutil.nullDate()} ;
      T01RW16_A773ProForUli = new short[1] ;
      T01RW16_A2392ProNumPro = new int[1] ;
      T01RW16_A2393ProNumRec = new int[1] ;
      T01RW16_A3005ProRev = new String[] {""} ;
      T01RW16_A4705ProForPau = new short[1] ;
      T01RW16_A4706ProForRb = new short[1] ;
      T01RW16_A4864ProForCCi = new String[] {""} ;
      T01RW16_A4865ProForDCi = new String[] {""} ;
      T01RW16_A5523ProForTip = new String[] {""} ;
      T01RW16_A8527ProForAbs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01RW16_A8528ProForCos = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01RW16_A10120ProforVl = new int[1] ;
      T01RW16_A10547ProH2O = new short[1] ;
      T01RW16_A3589ProForMer = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01RW16_A13133ProForAct = new String[] {""} ;
      T01RW16_A13936ProForRs = new String[] {""} ;
      T01RW16_A396EmprCod = new String[] {""} ;
      T01RW21_A396EmprCod = new String[] {""} ;
      T01RW21_A764ProForCod = new String[] {""} ;
      T01RW21_n764ProForCod = new boolean[] {false} ;
      T01RW22_A396EmprCod = new String[] {""} ;
      T01RW22_A764ProForCod = new String[] {""} ;
      T01RW22_n764ProForCod = new boolean[] {false} ;
      T01RW15_A764ProForCod = new String[] {""} ;
      T01RW15_n764ProForCod = new boolean[] {false} ;
      T01RW15_A6061ProForLab = new String[] {""} ;
      T01RW15_A766ProForDsc = new String[] {""} ;
      T01RW15_A4715ProForDsc2 = new String[] {""} ;
      T01RW15_A771ProForTie = new short[1] ;
      T01RW15_A772ProForTmx = new short[1] ;
      T01RW15_A769ProForMat = new String[] {""} ;
      T01RW15_A674PorForFul = new java.util.Date[] {GXutil.nullDate()} ;
      T01RW15_A773ProForUli = new short[1] ;
      T01RW15_A2392ProNumPro = new int[1] ;
      T01RW15_A2393ProNumRec = new int[1] ;
      T01RW15_A3005ProRev = new String[] {""} ;
      T01RW15_A4705ProForPau = new short[1] ;
      T01RW15_A4706ProForRb = new short[1] ;
      T01RW15_A4864ProForCCi = new String[] {""} ;
      T01RW15_A4865ProForDCi = new String[] {""} ;
      T01RW15_A5523ProForTip = new String[] {""} ;
      T01RW15_A8527ProForAbs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01RW15_A8528ProForCos = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01RW15_A10120ProforVl = new int[1] ;
      T01RW15_A10547ProH2O = new short[1] ;
      T01RW15_A3589ProForMer = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01RW15_A13133ProForAct = new String[] {""} ;
      T01RW15_A13936ProForRs = new String[] {""} ;
      T01RW15_A396EmprCod = new String[] {""} ;
      T01RW26_A407EmprNom = new String[] {""} ;
      T01RW26_n407EmprNom = new boolean[] {false} ;
      T01RW27_A396EmprCod = new String[] {""} ;
      T01RW27_A252CliCod = new int[1] ;
      T01RW27_A13381CliProQui = new String[] {""} ;
      T01RW28_A396EmprCod = new String[] {""} ;
      T01RW28_A13026PedDGId = new int[1] ;
      T01RW28_A758ProCod = new String[] {""} ;
      T01RW28_A13045PedDGFasLi = new short[1] ;
      T01RW28_A13057PedDGPQLin = new short[1] ;
      T01RW29_A396EmprCod = new String[] {""} ;
      T01RW29_A12673LavMqId = new int[1] ;
      T01RW29_A12692LavMqLnPq = new short[1] ;
      T01RW30_A396EmprCod = new String[] {""} ;
      T01RW30_A129BarCod = new int[1] ;
      T01RW30_A132BarCodReo = new byte[1] ;
      T01RW30_A130BarCodPar = new String[] {""} ;
      T01RW30_A4075recestncol = new byte[1] ;
      T01RW30_A4076recestnpro = new byte[1] ;
      T01RW31_A396EmprCod = new String[] {""} ;
      T01RW31_A4052EstNumFor = new int[1] ;
      T01RW31_A4053EstNumCol = new byte[1] ;
      T01RW31_A4057EstNumLin = new byte[1] ;
      T01RW32_A396EmprCod = new String[] {""} ;
      T01RW32_A6380Ft_procod = new String[] {""} ;
      T01RW32_A6383Ft_ProLin = new short[1] ;
      T01RW33_A396EmprCod = new String[] {""} ;
      T01RW33_A11270Pot_num = new int[1] ;
      T01RW34_A396EmprCod = new String[] {""} ;
      T01RW34_A764ProForCod = new String[] {""} ;
      T01RW34_n764ProForCod = new boolean[] {false} ;
      T01RW34_A8877Prg_Cod = new int[1] ;
      T01RW35_A396EmprCod = new String[] {""} ;
      T01RW35_A252CliCod = new int[1] ;
      T01RW35_A494ForSer = new String[] {""} ;
      T01RW35_A482ForColNom = new String[] {""} ;
      T01RW35_A483ForColNum = new int[1] ;
      T01RW35_A831TipColCod = new byte[1] ;
      T01RW35_A7094Acab_Ter = new String[] {""} ;
      T01RW36_A396EmprCod = new String[] {""} ;
      T01RW36_A758ProCod = new String[] {""} ;
      T01RW36_A774ProNumLin = new short[1] ;
      T01RW36_A6438ProFsaL = new short[1] ;
      T01RW37_A396EmprCod = new String[] {""} ;
      T01RW37_A6319C_Barcod = new int[1] ;
      T01RW37_A6320C_Barcodre = new byte[1] ;
      T01RW37_A6321C_Barcodpa = new String[] {""} ;
      T01RW37_A6322C_Reclinma = new short[1] ;
      T01RW37_A6323C_Reclinpr = new byte[1] ;
      T01RW38_A396EmprCod = new String[] {""} ;
      T01RW38_A361DisCod = new int[1] ;
      T01RW38_A758ProCod = new String[] {""} ;
      T01RW38_A368DisFasLin = new short[1] ;
      T01RW38_A5377DisQuiLin = new short[1] ;
      T01RW39_A396EmprCod = new String[] {""} ;
      T01RW39_A129BarCod = new int[1] ;
      T01RW39_A132BarCodReo = new byte[1] ;
      T01RW39_A130BarCodPar = new String[] {""} ;
      T01RW39_A758ProCod = new String[] {""} ;
      T01RW39_A194BarOrdLin = new short[1] ;
      T01RW39_A5371FasQuiLin = new short[1] ;
      T01RW40_A396EmprCod = new String[] {""} ;
      T01RW40_A764ProForCod = new String[] {""} ;
      T01RW40_n764ProForCod = new boolean[] {false} ;
      T01RW40_A5191ProForLC = new short[1] ;
      T01RW41_A396EmprCod = new String[] {""} ;
      T01RW41_A764ProForCod = new String[] {""} ;
      T01RW41_n764ProForCod = new boolean[] {false} ;
      T01RW41_A5191ProForLC = new short[1] ;
      T01RW42_A396EmprCod = new String[] {""} ;
      T01RW42_A831TipColCod = new byte[1] ;
      T01RW42_A5162TipColLin = new short[1] ;
      T01RW43_A396EmprCod = new String[] {""} ;
      T01RW43_A4744RecPreCod = new int[1] ;
      T01RW43_A4762RecPreLin = new short[1] ;
      T01RW44_A396EmprCod = new String[] {""} ;
      T01RW44_A252CliCod = new int[1] ;
      T01RW44_A65ArtCod = new String[] {""} ;
      T01RW44_A4658MdlCod = new String[] {""} ;
      T01RW44_A457FasCod = new String[] {""} ;
      T01RW44_A4660FasProLin = new short[1] ;
      T01RW45_A396EmprCod = new String[] {""} ;
      T01RW45_A457FasCod = new String[] {""} ;
      T01RW45_A4650FasForLin = new short[1] ;
      T01RW46_A396EmprCod = new String[] {""} ;
      T01RW46_A129BarCod = new int[1] ;
      T01RW46_A132BarCodReo = new byte[1] ;
      T01RW46_A130BarCodPar = new String[] {""} ;
      T01RW46_A2804RecLinMaq = new short[1] ;
      T01RW46_A1273RecLinPro = new byte[1] ;
      T01RW47_A396EmprCod = new String[] {""} ;
      T01RW47_A1514MacProCod = new String[] {""} ;
      T01RW47_A1517MacProLin = new short[1] ;
      T01RW48_A396EmprCod = new String[] {""} ;
      T01RW48_A252CliCod = new int[1] ;
      T01RW48_A494ForSer = new String[] {""} ;
      T01RW48_A482ForColNom = new String[] {""} ;
      T01RW48_A483ForColNum = new int[1] ;
      T01RW48_A831TipColCod = new byte[1] ;
      T01RW48_A1160ProForL = new short[1] ;
      T01RW49_A396EmprCod = new String[] {""} ;
      T01RW49_A910Workstat = new String[] {""} ;
      T01RW49_A887EscMLin = new int[1] ;
      T01RW50_A396EmprCod = new String[] {""} ;
      T01RW50_A764ProForCod = new String[] {""} ;
      T01RW50_n764ProForCod = new boolean[] {false} ;
      Z710PrdFind = "" ;
      Z488ForPrdDsc = "" ;
      T01RW51_A719PrdNum = new String[] {""} ;
      T01RW51_A764ProForCod = new String[] {""} ;
      T01RW51_n764ProForCod = new boolean[] {false} ;
      T01RW51_A767ProForLin = new short[1] ;
      T01RW51_A6062ProForCPo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01RW51_A13178ProForFT = new String[] {""} ;
      T01RW51_A765ProForDes = new String[] {""} ;
      T01RW51_A770ProForPrd = new String[] {""} ;
      T01RW51_A13111ProForDe2 = new String[] {""} ;
      T01RW51_A488ForPrdDsc = new String[] {""} ;
      T01RW51_n488ForPrdDsc = new boolean[] {false} ;
      T01RW51_A762ProForCan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01RW51_A1645ProForNro = new byte[1] ;
      T01RW51_A3379ProForTnq = new byte[1] ;
      T01RW51_A763ProForCla = new String[] {""} ;
      T01RW51_A5358ProForClv = new String[] {""} ;
      T01RW51_A396EmprCod = new String[] {""} ;
      T01RW51_A490ForPrdUMe = new byte[1] ;
      T01RW51_A710PrdFind = new String[] {""} ;
      T01RW51_n710PrdFind = new boolean[] {false} ;
      T01RW6_A4340PrdUMeFind = new byte[1] ;
      T01RW6_n4340PrdUMeFind = new boolean[] {false} ;
      T01RW52_A13746ForPrdCDsc = new String[] {""} ;
      T01RW52_A396EmprCod = new String[] {""} ;
      T01RW52_A490ForPrdUMe = new byte[1] ;
      T01RW12_A717PrdMaxFind = new String[] {""} ;
      T01RW12_n717PrdMaxFind = new boolean[] {false} ;
      T01RW53_A13746ForPrdCDsc = new String[] {""} ;
      T01RW53_A396EmprCod = new String[] {""} ;
      T01RW53_A490ForPrdUMe = new byte[1] ;
      T01RW54_A13746ForPrdCDsc = new String[] {""} ;
      T01RW54_A396EmprCod = new String[] {""} ;
      T01RW54_A490ForPrdUMe = new byte[1] ;
      T01RW55_A13746ForPrdCDsc = new String[] {""} ;
      T01RW55_A396EmprCod = new String[] {""} ;
      T01RW55_A490ForPrdUMe = new byte[1] ;
      T01RW13_A488ForPrdDsc = new String[] {""} ;
      T01RW13_n488ForPrdDsc = new boolean[] {false} ;
      T01RW14_A710PrdFind = new String[] {""} ;
      T01RW14_n710PrdFind = new boolean[] {false} ;
      T01RW56_A13746ForPrdCDsc = new String[] {""} ;
      T01RW56_A396EmprCod = new String[] {""} ;
      T01RW56_A490ForPrdUMe = new byte[1] ;
      T01RW57_A710PrdFind = new String[] {""} ;
      T01RW57_n710PrdFind = new boolean[] {false} ;
      T01RW60_A4340PrdUMeFind = new byte[1] ;
      T01RW60_n4340PrdUMeFind = new boolean[] {false} ;
      T01RW66_A717PrdMaxFind = new String[] {""} ;
      T01RW66_n717PrdMaxFind = new boolean[] {false} ;
      T01RW67_A488ForPrdDsc = new String[] {""} ;
      T01RW67_n488ForPrdDsc = new boolean[] {false} ;
      T01RW68_A13746ForPrdCDsc = new String[] {""} ;
      T01RW68_A396EmprCod = new String[] {""} ;
      T01RW68_A490ForPrdUMe = new byte[1] ;
      T01RW69_A396EmprCod = new String[] {""} ;
      T01RW69_A764ProForCod = new String[] {""} ;
      T01RW69_n764ProForCod = new boolean[] {false} ;
      T01RW69_A767ProForLin = new short[1] ;
      T01RW3_A764ProForCod = new String[] {""} ;
      T01RW3_n764ProForCod = new boolean[] {false} ;
      T01RW3_A767ProForLin = new short[1] ;
      T01RW3_A6062ProForCPo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01RW3_A13178ProForFT = new String[] {""} ;
      T01RW3_A765ProForDes = new String[] {""} ;
      T01RW3_A770ProForPrd = new String[] {""} ;
      T01RW3_A13111ProForDe2 = new String[] {""} ;
      T01RW3_A762ProForCan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01RW3_A1645ProForNro = new byte[1] ;
      T01RW3_A3379ProForTnq = new byte[1] ;
      T01RW3_A763ProForCla = new String[] {""} ;
      T01RW3_A5358ProForClv = new String[] {""} ;
      T01RW3_A396EmprCod = new String[] {""} ;
      T01RW3_A490ForPrdUMe = new byte[1] ;
      T01RW70_A13746ForPrdCDsc = new String[] {""} ;
      T01RW70_A396EmprCod = new String[] {""} ;
      T01RW70_A490ForPrdUMe = new byte[1] ;
      T01RW2_A764ProForCod = new String[] {""} ;
      T01RW2_n764ProForCod = new boolean[] {false} ;
      T01RW2_A767ProForLin = new short[1] ;
      T01RW2_A6062ProForCPo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01RW2_A13178ProForFT = new String[] {""} ;
      T01RW2_A765ProForDes = new String[] {""} ;
      T01RW2_A770ProForPrd = new String[] {""} ;
      T01RW2_A13111ProForDe2 = new String[] {""} ;
      T01RW2_A762ProForCan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01RW2_A1645ProForNro = new byte[1] ;
      T01RW2_A3379ProForTnq = new byte[1] ;
      T01RW2_A763ProForCla = new String[] {""} ;
      T01RW2_A5358ProForClv = new String[] {""} ;
      T01RW2_A396EmprCod = new String[] {""} ;
      T01RW2_A490ForPrdUMe = new byte[1] ;
      T01RW79_A717PrdMaxFind = new String[] {""} ;
      T01RW79_n717PrdMaxFind = new boolean[] {false} ;
      T01RW80_A710PrdFind = new String[] {""} ;
      T01RW80_n710PrdFind = new boolean[] {false} ;
      T01RW83_A4340PrdUMeFind = new byte[1] ;
      T01RW83_n4340PrdUMeFind = new boolean[] {false} ;
      T01RW84_A488ForPrdDsc = new String[] {""} ;
      T01RW84_n488ForPrdDsc = new boolean[] {false} ;
      T01RW85_A396EmprCod = new String[] {""} ;
      T01RW85_A764ProForCod = new String[] {""} ;
      T01RW85_n764ProForCod = new boolean[] {false} ;
      T01RW85_A767ProForLin = new short[1] ;
      Gridlevel_procesosquimicoslineasRow = new com.genexus.webpanels.GXWebRow();
      subGridlevel_procesosquimicoslineas_Linesclass = "" ;
      ROClassString = "" ;
      sImgUrl = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      i13133ProForAct = "" ;
      i3005ProRev = "" ;
      i6062ProForCPo = DecimalUtil.ZERO ;
      i13178ProForFT = "" ;
      Gridlevel_procesosquimicoslineasColumn = new com.genexus.webpanels.GXWebColumn();
      gxdynajaxctrlcodr = new com.genexus.internet.StringCollection();
      gxdynajaxctrldescr = new com.genexus.internet.StringCollection();
      gxwrpcisep = "" ;
      l719PrdNum = "" ;
      T01RW86_A396EmprCod = new String[] {""} ;
      T01RW86_A719PrdNum = new String[] {""} ;
      l13746ForPrdCDsc = "" ;
      T01RW87_A13746ForPrdCDsc = new String[] {""} ;
      T01RW88_A13746ForPrdCDsc = new String[] {""} ;
      T01RW88_A396EmprCod = new String[] {""} ;
      T01RW88_A490ForPrdUMe = new byte[1] ;
      Z920ProForCodV = "" ;
      GXv_int5 = new byte[1] ;
      GXv_int12 = new byte[1] ;
      Z941EmprCodV2 = "" ;
      T01RW94_A717PrdMaxFind = new String[] {""} ;
      T01RW94_n717PrdMaxFind = new boolean[] {false} ;
      Z717PrdMaxFind = "" ;
      T01RW95_A710PrdFind = new String[] {""} ;
      T01RW95_n710PrdFind = new boolean[] {false} ;
      T01RW98_A4340PrdUMeFind = new byte[1] ;
      T01RW98_n4340PrdUMeFind = new boolean[] {false} ;
      GXt_char1 = "" ;
      GXv_char4 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      T01RW99_A13746ForPrdCDsc = new String[] {""} ;
      T01RW99_A396EmprCod = new String[] {""} ;
      T01RW99_A490ForPrdUMe = new byte[1] ;
      Z13976PrdNomForm = "" ;
      Zh490ForPrdUMe = "" ;
      ZV30oldCant = DecimalUtil.ZERO ;
      T01RW100_A13746ForPrdCDsc = new String[] {""} ;
      T01RW100_A396EmprCod = new String[] {""} ;
      T01RW100_A490ForPrdUMe = new byte[1] ;
      T01RW101_A488ForPrdDsc = new String[] {""} ;
      T01RW101_n488ForPrdDsc = new boolean[] {false} ;
      ZV10Msg_e = "" ;
      ZV39Msg_del = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.procesosquimicos_trn__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.procesosquimicos_trn__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.procesosquimicos_trn__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.procesosquimicos_trn__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.procesosquimicos_trn__default(),
         new Object[] {
             new Object[] {
            T01RW2_A764ProForCod, T01RW2_A767ProForLin, T01RW2_A6062ProForCPo, T01RW2_A13178ProForFT, T01RW2_A765ProForDes, T01RW2_A770ProForPrd, T01RW2_A13111ProForDe2, T01RW2_A762ProForCan, T01RW2_A1645ProForNro, T01RW2_A3379ProForTnq,
            T01RW2_A763ProForCla, T01RW2_A5358ProForClv, T01RW2_A396EmprCod, T01RW2_A490ForPrdUMe
            }
            , new Object[] {
            T01RW3_A764ProForCod, T01RW3_A767ProForLin, T01RW3_A6062ProForCPo, T01RW3_A13178ProForFT, T01RW3_A765ProForDes, T01RW3_A770ProForPrd, T01RW3_A13111ProForDe2, T01RW3_A762ProForCan, T01RW3_A1645ProForNro, T01RW3_A3379ProForTnq,
            T01RW3_A763ProForCla, T01RW3_A5358ProForClv, T01RW3_A396EmprCod, T01RW3_A490ForPrdUMe
            }
            , new Object[] {
            T01RW6_A4340PrdUMeFind, T01RW6_n4340PrdUMeFind
            }
            , new Object[] {
            T01RW12_A717PrdMaxFind, T01RW12_n717PrdMaxFind
            }
            , new Object[] {
            T01RW13_A488ForPrdDsc, T01RW13_n488ForPrdDsc
            }
            , new Object[] {
            T01RW14_A710PrdFind, T01RW14_n710PrdFind
            }
            , new Object[] {
            T01RW15_A764ProForCod, T01RW15_A6061ProForLab, T01RW15_A766ProForDsc, T01RW15_A4715ProForDsc2, T01RW15_A771ProForTie, T01RW15_A772ProForTmx, T01RW15_A769ProForMat, T01RW15_A674PorForFul, T01RW15_A773ProForUli, T01RW15_A2392ProNumPro,
            T01RW15_A2393ProNumRec, T01RW15_A3005ProRev, T01RW15_A4705ProForPau, T01RW15_A4706ProForRb, T01RW15_A4864ProForCCi, T01RW15_A4865ProForDCi, T01RW15_A5523ProForTip, T01RW15_A8527ProForAbs, T01RW15_A8528ProForCos, T01RW15_A10120ProforVl,
            T01RW15_A10547ProH2O, T01RW15_A3589ProForMer, T01RW15_A13133ProForAct, T01RW15_A13936ProForRs, T01RW15_A396EmprCod
            }
            , new Object[] {
            T01RW16_A764ProForCod, T01RW16_A6061ProForLab, T01RW16_A766ProForDsc, T01RW16_A4715ProForDsc2, T01RW16_A771ProForTie, T01RW16_A772ProForTmx, T01RW16_A769ProForMat, T01RW16_A674PorForFul, T01RW16_A773ProForUli, T01RW16_A2392ProNumPro,
            T01RW16_A2393ProNumRec, T01RW16_A3005ProRev, T01RW16_A4705ProForPau, T01RW16_A4706ProForRb, T01RW16_A4864ProForCCi, T01RW16_A4865ProForDCi, T01RW16_A5523ProForTip, T01RW16_A8527ProForAbs, T01RW16_A8528ProForCos, T01RW16_A10120ProforVl,
            T01RW16_A10547ProH2O, T01RW16_A3589ProForMer, T01RW16_A13133ProForAct, T01RW16_A13936ProForRs, T01RW16_A396EmprCod
            }
            , new Object[] {
            T01RW17_A407EmprNom, T01RW17_n407EmprNom
            }
            , new Object[] {
            T01RW18_A764ProForCod, T01RW18_A6061ProForLab, T01RW18_A407EmprNom, T01RW18_n407EmprNom, T01RW18_A766ProForDsc, T01RW18_A4715ProForDsc2, T01RW18_A771ProForTie, T01RW18_A772ProForTmx, T01RW18_A769ProForMat, T01RW18_A674PorForFul,
            T01RW18_A773ProForUli, T01RW18_A2392ProNumPro, T01RW18_A2393ProNumRec, T01RW18_A3005ProRev, T01RW18_A4705ProForPau, T01RW18_A4706ProForRb, T01RW18_A4864ProForCCi, T01RW18_A4865ProForDCi, T01RW18_A5523ProForTip, T01RW18_A8527ProForAbs,
            T01RW18_A8528ProForCos, T01RW18_A10120ProforVl, T01RW18_A10547ProH2O, T01RW18_A3589ProForMer, T01RW18_A13133ProForAct, T01RW18_A13936ProForRs, T01RW18_A396EmprCod
            }
            , new Object[] {
            T01RW19_A407EmprNom, T01RW19_n407EmprNom
            }
            , new Object[] {
            T01RW20_A396EmprCod, T01RW20_A764ProForCod
            }
            , new Object[] {
            T01RW21_A396EmprCod, T01RW21_A764ProForCod
            }
            , new Object[] {
            T01RW22_A396EmprCod, T01RW22_A764ProForCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01RW26_A407EmprNom, T01RW26_n407EmprNom
            }
            , new Object[] {
            T01RW27_A396EmprCod, T01RW27_A252CliCod, T01RW27_A13381CliProQui
            }
            , new Object[] {
            T01RW28_A396EmprCod, T01RW28_A13026PedDGId, T01RW28_A758ProCod, T01RW28_A13045PedDGFasLi, T01RW28_A13057PedDGPQLin
            }
            , new Object[] {
            T01RW29_A396EmprCod, T01RW29_A12673LavMqId, T01RW29_A12692LavMqLnPq
            }
            , new Object[] {
            T01RW30_A396EmprCod, T01RW30_A129BarCod, T01RW30_A132BarCodReo, T01RW30_A130BarCodPar, T01RW30_A4075recestncol, T01RW30_A4076recestnpro
            }
            , new Object[] {
            T01RW31_A396EmprCod, T01RW31_A4052EstNumFor, T01RW31_A4053EstNumCol, T01RW31_A4057EstNumLin
            }
            , new Object[] {
            T01RW32_A396EmprCod, T01RW32_A6380Ft_procod, T01RW32_A6383Ft_ProLin
            }
            , new Object[] {
            T01RW33_A396EmprCod, T01RW33_A11270Pot_num
            }
            , new Object[] {
            T01RW34_A396EmprCod, T01RW34_A764ProForCod, T01RW34_A8877Prg_Cod
            }
            , new Object[] {
            T01RW35_A396EmprCod, T01RW35_A252CliCod, T01RW35_A494ForSer, T01RW35_A482ForColNom, T01RW35_A483ForColNum, T01RW35_A831TipColCod, T01RW35_A7094Acab_Ter
            }
            , new Object[] {
            T01RW36_A396EmprCod, T01RW36_A758ProCod, T01RW36_A774ProNumLin, T01RW36_A6438ProFsaL
            }
            , new Object[] {
            T01RW37_A396EmprCod, T01RW37_A6319C_Barcod, T01RW37_A6320C_Barcodre, T01RW37_A6321C_Barcodpa, T01RW37_A6322C_Reclinma, T01RW37_A6323C_Reclinpr
            }
            , new Object[] {
            T01RW38_A396EmprCod, T01RW38_A361DisCod, T01RW38_A758ProCod, T01RW38_A368DisFasLin, T01RW38_A5377DisQuiLin
            }
            , new Object[] {
            T01RW39_A396EmprCod, T01RW39_A129BarCod, T01RW39_A132BarCodReo, T01RW39_A130BarCodPar, T01RW39_A758ProCod, T01RW39_A194BarOrdLin, T01RW39_A5371FasQuiLin
            }
            , new Object[] {
            T01RW40_A396EmprCod, T01RW40_A764ProForCod, T01RW40_A5191ProForLC
            }
            , new Object[] {
            T01RW41_A396EmprCod, T01RW41_A764ProForCod, T01RW41_A5191ProForLC
            }
            , new Object[] {
            T01RW42_A396EmprCod, T01RW42_A831TipColCod, T01RW42_A5162TipColLin
            }
            , new Object[] {
            T01RW43_A396EmprCod, T01RW43_A4744RecPreCod, T01RW43_A4762RecPreLin
            }
            , new Object[] {
            T01RW44_A396EmprCod, T01RW44_A252CliCod, T01RW44_A65ArtCod, T01RW44_A4658MdlCod, T01RW44_A457FasCod, T01RW44_A4660FasProLin
            }
            , new Object[] {
            T01RW45_A396EmprCod, T01RW45_A457FasCod, T01RW45_A4650FasForLin
            }
            , new Object[] {
            T01RW46_A396EmprCod, T01RW46_A129BarCod, T01RW46_A132BarCodReo, T01RW46_A130BarCodPar, T01RW46_A2804RecLinMaq, T01RW46_A1273RecLinPro
            }
            , new Object[] {
            T01RW47_A396EmprCod, T01RW47_A1514MacProCod, T01RW47_A1517MacProLin
            }
            , new Object[] {
            T01RW48_A396EmprCod, T01RW48_A252CliCod, T01RW48_A494ForSer, T01RW48_A482ForColNom, T01RW48_A483ForColNum, T01RW48_A831TipColCod, T01RW48_A1160ProForL
            }
            , new Object[] {
            T01RW49_A396EmprCod, T01RW49_A910Workstat, T01RW49_A887EscMLin
            }
            , new Object[] {
            T01RW50_A396EmprCod, T01RW50_A764ProForCod
            }
            , new Object[] {
            T01RW51_A719PrdNum, T01RW51_A764ProForCod, T01RW51_A767ProForLin, T01RW51_A6062ProForCPo, T01RW51_A13178ProForFT, T01RW51_A765ProForDes, T01RW51_A770ProForPrd, T01RW51_A13111ProForDe2, T01RW51_A488ForPrdDsc, T01RW51_n488ForPrdDsc,
            T01RW51_A762ProForCan, T01RW51_A1645ProForNro, T01RW51_A3379ProForTnq, T01RW51_A763ProForCla, T01RW51_A5358ProForClv, T01RW51_A396EmprCod, T01RW51_A490ForPrdUMe, T01RW51_A710PrdFind, T01RW51_n710PrdFind
            }
            , new Object[] {
            T01RW52_A13746ForPrdCDsc, T01RW52_A396EmprCod, T01RW52_A490ForPrdUMe
            }
            , new Object[] {
            T01RW53_A13746ForPrdCDsc, T01RW53_A396EmprCod, T01RW53_A490ForPrdUMe
            }
            , new Object[] {
            T01RW54_A13746ForPrdCDsc, T01RW54_A396EmprCod, T01RW54_A490ForPrdUMe
            }
            , new Object[] {
            T01RW55_A13746ForPrdCDsc, T01RW55_A396EmprCod, T01RW55_A490ForPrdUMe
            }
            , new Object[] {
            T01RW56_A13746ForPrdCDsc, T01RW56_A396EmprCod, T01RW56_A490ForPrdUMe
            }
            , new Object[] {
            T01RW57_A710PrdFind, T01RW57_n710PrdFind
            }
            , new Object[] {
            T01RW60_A4340PrdUMeFind, T01RW60_n4340PrdUMeFind
            }
            , new Object[] {
            T01RW66_A717PrdMaxFind, T01RW66_n717PrdMaxFind
            }
            , new Object[] {
            T01RW67_A488ForPrdDsc, T01RW67_n488ForPrdDsc
            }
            , new Object[] {
            T01RW68_A13746ForPrdCDsc, T01RW68_A396EmprCod, T01RW68_A490ForPrdUMe
            }
            , new Object[] {
            T01RW69_A396EmprCod, T01RW69_A764ProForCod, T01RW69_A767ProForLin
            }
            , new Object[] {
            T01RW70_A13746ForPrdCDsc, T01RW70_A396EmprCod, T01RW70_A490ForPrdUMe
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01RW79_A717PrdMaxFind, T01RW79_n717PrdMaxFind
            }
            , new Object[] {
            T01RW80_A710PrdFind, T01RW80_n710PrdFind
            }
            , new Object[] {
            T01RW83_A4340PrdUMeFind, T01RW83_n4340PrdUMeFind
            }
            , new Object[] {
            T01RW84_A488ForPrdDsc, T01RW84_n488ForPrdDsc
            }
            , new Object[] {
            T01RW85_A396EmprCod, T01RW85_A764ProForCod, T01RW85_A767ProForLin
            }
            , new Object[] {
            T01RW86_A396EmprCod, T01RW86_A719PrdNum
            }
            , new Object[] {
            T01RW87_A13746ForPrdCDsc
            }
            , new Object[] {
            T01RW88_A13746ForPrdCDsc, T01RW88_A396EmprCod, T01RW88_A490ForPrdUMe
            }
            , new Object[] {
            T01RW94_A717PrdMaxFind, T01RW94_n717PrdMaxFind
            }
            , new Object[] {
            T01RW95_A710PrdFind, T01RW95_n710PrdFind
            }
            , new Object[] {
            T01RW98_A4340PrdUMeFind, T01RW98_n4340PrdUMeFind
            }
            , new Object[] {
            T01RW99_A13746ForPrdCDsc, T01RW99_A396EmprCod, T01RW99_A490ForPrdUMe
            }
            , new Object[] {
            T01RW100_A13746ForPrdCDsc, T01RW100_A396EmprCod, T01RW100_A490ForPrdUMe
            }
            , new Object[] {
            T01RW101_A488ForPrdDsc, T01RW101_n488ForPrdDsc
            }
         }
      );
      AV53Pgmname = "FormulacionTinte.ProcesosQuimicos_TRN" ;
      Z3005ProRev = httpContext.getMessage( "N", "") ;
      A3005ProRev = httpContext.getMessage( "N", "") ;
      i3005ProRev = httpContext.getMessage( "N", "") ;
      Z13178ProForFT = " " ;
      A13178ProForFT = " " ;
      i13178ProForFT = " " ;
      Z13133ProForAct = httpContext.getMessage( "S", "") ;
      A13133ProForAct = httpContext.getMessage( "S", "") ;
      i13133ProForAct = httpContext.getMessage( "S", "") ;
      Z6061ProForLab = "" ;
      A6061ProForLab = "" ;
      Z6062ProForCPo = DecimalUtil.stringToDec("100.00") ;
      N6062ProForCPo = DecimalUtil.stringToDec("100.00") ;
      A6062ProForCPo = DecimalUtil.stringToDec("100.00") ;
      i6062ProForCPo = DecimalUtil.stringToDec("100.00") ;
   }

   private byte Z1645ProForNro ;
   private byte Z3379ProForTnq ;
   private byte Z490ForPrdUMe ;
   private byte O490ForPrdUMe ;
   private byte GxWebError ;
   private byte A490ForPrdUMe ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte A4340PrdUMeFind ;
   private byte AV31Un ;
   private byte A1645ProForNro ;
   private byte A3379ProForTnq ;
   private byte T490ForPrdUMe ;
   private byte subGridlevel_procesosquimicoslineas_Backcolorstyle ;
   private byte subGridlevel_procesosquimicoslineas_Backstyle ;
   private byte gxajaxcallmode ;
   private byte subGridlevel_procesosquimicoslineas_Allowselection ;
   private byte subGridlevel_procesosquimicoslineas_Allowhovering ;
   private byte subGridlevel_procesosquimicoslineas_Allowcollapsing ;
   private byte subGridlevel_procesosquimicoslineas_Collapsed ;
   private byte GXt_int6 ;
   private byte GXv_int5[] ;
   private byte GXt_int11 ;
   private byte GXv_int12[] ;
   private byte Z4340PrdUMeFind ;
   private byte ZV31Un ;
   private short Z771ProForTie ;
   private short Z772ProForTmx ;
   private short Z773ProForUli ;
   private short Z4705ProForPau ;
   private short Z4706ProForRb ;
   private short Z10547ProH2O ;
   private short Z767ProForLin ;
   private short O767ProForLin ;
   private short nRcdDeleted_90 ;
   private short nRcdExists_90 ;
   private short nIsMod_90 ;
   private short AV38Exis_pro ;
   private short A767ProForLin ;
   private short A768ProForLinV ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short AV13CdpPor ;
   private short A771ProForTie ;
   private short A772ProForTmx ;
   private short A4706ProForRb ;
   private short A10547ProH2O ;
   private short A4705ProForPau ;
   private short nBlankRcdCount90 ;
   private short RcdFound90 ;
   private short nBlankRcdUsr90 ;
   private short A773ProForUli ;
   private short AV24Orient ;
   private short AV7oldProforlin ;
   private short RcdFound89 ;
   private short T767ProForLin ;
   private short AV36ObsPrf ;
   private short AV37FlagLav ;
   private short AV14Tecido ;
   private short AV15Lavado ;
   private short AV16Erfoc ;
   private short AV17Texfina ;
   private short AV18Clave2 ;
   private short AV19NoVisible ;
   private short AV20Velta ;
   private short AV21Filasur ;
   private short AV22Pathter ;
   private short AV23jpf ;
   private short AV25tintutex ;
   private short AV26TiposTecnologias ;
   private short AV27Fabs ;
   private short GXv_int10[] ;
   private short nIsDirty_89 ;
   private short nIsDirty_90 ;
   private short gxhchits ;
   private short Z768ProForLinV ;
   private short ZV7oldProforlin ;
   private int Z2392ProNumPro ;
   private int Z2393ProNumRec ;
   private int Z10120ProforVl ;
   private int nRC_GXsfl_125 ;
   private int nGXsfl_125_idx=1 ;
   private int trnEnded ;
   private int edtavClaves_Enabled ;
   private int edtavClavesdel_Enabled ;
   private int edtProForCod_Enabled ;
   private int edtProForDsc_Enabled ;
   private int edtProForDsc2_Enabled ;
   private int edtProForTip_Enabled ;
   private int edtProForRs_Visible ;
   private int edtProForRs_Enabled ;
   private int edtProForTie_Enabled ;
   private int edtProForTmx_Enabled ;
   private int edtProForMat_Enabled ;
   private int edtProForRb_Enabled ;
   private int edtProForLab_Visible ;
   private int edtProForLab_Enabled ;
   private int edtProForAbs_Visible ;
   private int edtProForAbs_Enabled ;
   private int edtProForCos_Visible ;
   private int edtProForCos_Enabled ;
   private int edtProforVl_Visible ;
   private int A10120ProforVl ;
   private int edtProforVl_Enabled ;
   private int edtProH2O_Visible ;
   private int edtProH2O_Enabled ;
   private int A2392ProNumPro ;
   private int edtProNumPro_Enabled ;
   private int A2393ProNumRec ;
   private int edtProNumRec_Enabled ;
   private int edtProForPau_Visible ;
   private int edtProForPau_Enabled ;
   private int bttBtntrn_enter_Visible ;
   private int bttBtntrn_enter_Enabled ;
   private int bttBtntrn_cancel_Visible ;
   private int bttBtntrn_delete_Visible ;
   private int bttBtntrn_delete_Enabled ;
   private int edtavComboproforlab_Visible ;
   private int edtavComboproforlab_Enabled ;
   private int edtProForCCi_Visible ;
   private int edtProForCCi_Enabled ;
   private int edtProForDCi_Visible ;
   private int edtProForDCi_Enabled ;
   private int edtProForMer_Enabled ;
   private int edtProForMer_Visible ;
   private int edtProFDsc_Visible ;
   private int edtProFDsc_Enabled ;
   private int edtProForCodV_Visible ;
   private int edtProForCodV_Enabled ;
   private int edtEmprCodV2_Visible ;
   private int edtEmprCodV2_Enabled ;
   private int edtEmprCod_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtEmprNom_Visible ;
   private int edtEmprNom_Enabled ;
   private int edtPorForFul_Visible ;
   private int edtPorForFul_Enabled ;
   private int edtProForLin_Enabled ;
   private int edtProForPrd_Enabled ;
   private int edtPrdFind_Enabled ;
   private int edtPrdNomForm_Enabled ;
   private int edtProForDes_Enabled ;
   private int edtProForCPo_Enabled ;
   private int edtProForCPo_Visible ;
   private int edtProForCan_Enabled ;
   private int edtForPrdUMe_Enabled ;
   private int edtavClaves_Visible ;
   private int edtavClavesdel_Visible ;
   private int edtProForCla_Enabled ;
   private int edtProForClv_Enabled ;
   private int edtProForClv_Visible ;
   private int edtProForNro_Enabled ;
   private int edtProForTnq_Enabled ;
   private int edtPrdMaxFind_Enabled ;
   private int fRowAdded ;
   private int Combo_proforlab_Datalistupdateminimumcharacters ;
   private int Combo_proforlab_Gxcontroltype ;
   private int Dvpanel_tableattributes_Gxcontroltype ;
   private int GX_JID ;
   private int subGridlevel_procesosquimicoslineas_Backcolor ;
   private int subGridlevel_procesosquimicoslineas_Allbackcolor ;
   private int defedtPrdMaxFind_Enabled ;
   private int defedtProForClv_Enabled ;
   private int defedtProForCla_Enabled ;
   private int defedtProForCPo_Enabled ;
   private int defedtPrdNomForm_Enabled ;
   private int defedtPrdFind_Enabled ;
   private int defedtProForLin_Enabled ;
   private int idxLst ;
   private int subGridlevel_procesosquimicoslineas_Selectedindex ;
   private int subGridlevel_procesosquimicoslineas_Selectioncolor ;
   private int subGridlevel_procesosquimicoslineas_Hoveringcolor ;
   private int gxdynajaxindex ;
   private long GRIDLEVEL_PROCESOSQUIMICOSLINEAS_nFirstRecordOnPage ;
   private java.math.BigDecimal Z8527ProForAbs ;
   private java.math.BigDecimal Z8528ProForCos ;
   private java.math.BigDecimal Z3589ProForMer ;
   private java.math.BigDecimal Z6062ProForCPo ;
   private java.math.BigDecimal Z762ProForCan ;
   private java.math.BigDecimal O762ProForCan ;
   private java.math.BigDecimal N6062ProForCPo ;
   private java.math.BigDecimal A762ProForCan ;
   private java.math.BigDecimal A8527ProForAbs ;
   private java.math.BigDecimal A8528ProForCos ;
   private java.math.BigDecimal A3589ProForMer ;
   private java.math.BigDecimal AV30oldCant ;
   private java.math.BigDecimal A6062ProForCPo ;
   private java.math.BigDecimal T762ProForCan ;
   private java.math.BigDecimal i6062ProForCPo ;
   private java.math.BigDecimal ZV30oldCant ;
   private String sPrefix ;
   private String wcpOGx_mode ;
   private String wcpOAV12EmprCod ;
   private String wcpOAV32ProForCod ;
   private String Z396EmprCod ;
   private String Z764ProForCod ;
   private String Z6061ProForLab ;
   private String Z766ProForDsc ;
   private String Z4715ProForDsc2 ;
   private String Z769ProForMat ;
   private String Z3005ProRev ;
   private String Z4864ProForCCi ;
   private String Z4865ProForDCi ;
   private String Z5523ProForTip ;
   private String Z13133ProForAct ;
   private String Z13936ProForRs ;
   private String Combo_proforlab_Selectedvalue_get ;
   private String Z13178ProForFT ;
   private String Z765ProForDes ;
   private String Z770ProForPrd ;
   private String Z13111ProForDe2 ;
   private String Z763ProForCla ;
   private String Z5358ProForClv ;
   private String O763ProForCla ;
   private String O5358ProForClv ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A6061ProForLab ;
   private String Gx_mode ;
   private String AV53Pgmname ;
   private String AV8Usurcod ;
   private String AV9Station ;
   private String AV10Msg_e ;
   private String A763ProForCla ;
   private String A5358ProForClv ;
   private String AV39Msg_del ;
   private String A719PrdNum ;
   private String A770ProForPrd ;
   private String A764ProForCod ;
   private String A710PrdFind ;
   private String A941EmprCodV2 ;
   private String A920ProForCodV ;
   private String AV12EmprCod ;
   private String AV32ProForCod ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtProForCod_Internalname ;
   private String sGXsfl_125_idx="0001" ;
   private String edtavClaves_Tooltiptext ;
   private String edtavClaves_Internalname ;
   private String edtavClavesdel_Tooltiptext ;
   private String edtavClavesdel_Internalname ;
   private String A13133ProForAct ;
   private String A3005ProRev ;
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
   private String TempTags ;
   private String edtProForCod_Jsonclick ;
   private String edtProForDsc_Internalname ;
   private String A766ProForDsc ;
   private String edtProForDsc_Jsonclick ;
   private String edtProForDsc2_Internalname ;
   private String A4715ProForDsc2 ;
   private String edtProForDsc2_Jsonclick ;
   private String edtProForTip_Internalname ;
   private String A5523ProForTip ;
   private String edtProForTip_Jsonclick ;
   private String divProforrs_cell_Internalname ;
   private String divProforrs_cell_Class ;
   private String edtProForRs_Internalname ;
   private String A13936ProForRs ;
   private String edtProForRs_Jsonclick ;
   private String divUnnamedtable3_Internalname ;
   private String edtProForTie_Internalname ;
   private String edtProForTie_Jsonclick ;
   private String edtProForTmx_Internalname ;
   private String edtProForTmx_Jsonclick ;
   private String edtProForMat_Internalname ;
   private String A769ProForMat ;
   private String edtProForMat_Jsonclick ;
   private String edtProForRb_Internalname ;
   private String edtProForRb_Jsonclick ;
   private String divUnnamedtable4_Internalname ;
   private String divTablesplittedproforlab_Internalname ;
   private String lblTextblockproforlab_Internalname ;
   private String lblTextblockproforlab_Jsonclick ;
   private String Combo_proforlab_Caption ;
   private String Combo_proforlab_Cls ;
   private String Combo_proforlab_Emptyitemtext ;
   private String Combo_proforlab_Internalname ;
   private String edtProForLab_Internalname ;
   private String edtProForLab_Jsonclick ;
   private String divProforabs_cell_Internalname ;
   private String divProforabs_cell_Class ;
   private String edtProForAbs_Internalname ;
   private String edtProForAbs_Jsonclick ;
   private String divProforcos_cell_Internalname ;
   private String divProforcos_cell_Class ;
   private String edtProForCos_Internalname ;
   private String edtProForCos_Jsonclick ;
   private String divProforvl_cell_Internalname ;
   private String divProforvl_cell_Class ;
   private String edtProforVl_Internalname ;
   private String edtProforVl_Jsonclick ;
   private String divProh2o_cell_Internalname ;
   private String divProh2o_cell_Class ;
   private String edtProH2O_Internalname ;
   private String edtProH2O_Jsonclick ;
   private String grpUnnamedgroup6_Internalname ;
   private String divUnnamedtable5_Internalname ;
   private String edtProNumPro_Internalname ;
   private String edtProNumPro_Jsonclick ;
   private String edtProNumRec_Internalname ;
   private String edtProNumRec_Jsonclick ;
   private String divProforpau_cell_Internalname ;
   private String divProforpau_cell_Class ;
   private String edtProForPau_Internalname ;
   private String edtProForPau_Jsonclick ;
   private String divUnnamedtable1_Internalname ;
   private String divTableleaflevel_procesosquimicoslineas_Internalname ;
   private String bttBtntrn_enter_Internalname ;
   private String bttBtntrn_enter_Jsonclick ;
   private String bttBtntrn_cancel_Internalname ;
   private String bttBtntrn_cancel_Jsonclick ;
   private String bttBtntrn_delete_Internalname ;
   private String bttBtntrn_delete_Jsonclick ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String divSectionattribute_proforlab_Internalname ;
   private String edtavComboproforlab_Internalname ;
   private String AV50ComboProForLab ;
   private String edtavComboproforlab_Jsonclick ;
   private String edtProForCCi_Internalname ;
   private String A4864ProForCCi ;
   private String edtProForCCi_Jsonclick ;
   private String edtProForDCi_Internalname ;
   private String A4865ProForDCi ;
   private String edtProForDCi_Jsonclick ;
   private String edtProForMer_Internalname ;
   private String edtProForMer_Jsonclick ;
   private String edtProFDsc_Internalname ;
   private String edtProFDsc_Jsonclick ;
   private String edtProForCodV_Internalname ;
   private String edtProForCodV_Jsonclick ;
   private String edtEmprCodV2_Internalname ;
   private String edtEmprCodV2_Jsonclick ;
   private String edtEmprCod_Internalname ;
   private String edtEmprCod_Jsonclick ;
   private String edtEmprNom_Internalname ;
   private String A407EmprNom ;
   private String edtEmprNom_Jsonclick ;
   private String edtPorForFul_Internalname ;
   private String edtPorForFul_Jsonclick ;
   private String Gridlevel_procesosquimicoslineas_titlescategories_Gridtitlescategories ;
   private String Gridlevel_procesosquimicoslineas_titlescategories_Internalname ;
   private String sMode90 ;
   private String edtProForLin_Internalname ;
   private String edtProForPrd_Internalname ;
   private String edtPrdFind_Internalname ;
   private String edtPrdNomForm_Internalname ;
   private String edtProForDes_Internalname ;
   private String edtProForCPo_Internalname ;
   private String edtProForCan_Internalname ;
   private String edtForPrdUMe_Internalname ;
   private String edtProForCla_Internalname ;
   private String edtProForClv_Internalname ;
   private String edtProForNro_Internalname ;
   private String edtProForTnq_Internalname ;
   private String edtPrdMaxFind_Internalname ;
   private String sStyleString ;
   private String subGridlevel_procesosquimicoslineas_Internalname ;
   private String AV29Msg1 ;
   private String A13178ProForFT ;
   private String A13111ProForDe2 ;
   private String A488ForPrdDsc ;
   private String Combo_proforlab_Objectcall ;
   private String Combo_proforlab_Class ;
   private String Combo_proforlab_Icontype ;
   private String Combo_proforlab_Icon ;
   private String Combo_proforlab_Tooltip ;
   private String Combo_proforlab_Selectedvalue_set ;
   private String Combo_proforlab_Selectedtext_set ;
   private String Combo_proforlab_Selectedtext_get ;
   private String Combo_proforlab_Gamoauthtoken ;
   private String Combo_proforlab_Ddointernalname ;
   private String Combo_proforlab_Titlecontrolalign ;
   private String Combo_proforlab_Dropdownoptionstype ;
   private String Combo_proforlab_Titlecontrolidtoreplace ;
   private String Combo_proforlab_Datalisttype ;
   private String Combo_proforlab_Datalistfixedvalues ;
   private String Combo_proforlab_Datalistproc ;
   private String Combo_proforlab_Datalistprocparametersprefix ;
   private String Combo_proforlab_Remoteservicesparameters ;
   private String Combo_proforlab_Htmltemplate ;
   private String Combo_proforlab_Multiplevaluestype ;
   private String Combo_proforlab_Loadingdata ;
   private String Combo_proforlab_Noresultsfound ;
   private String Combo_proforlab_Onlyselectedvalues ;
   private String Combo_proforlab_Selectalltext ;
   private String Combo_proforlab_Multiplevaluesseparator ;
   private String Combo_proforlab_Addnewoptiontext ;
   private String Dvpanel_tableattributes_Objectcall ;
   private String Dvpanel_tableattributes_Class ;
   private String Dvpanel_tableattributes_Height ;
   private String Gridlevel_procesosquimicoslineas_titlescategories_Objectcall ;
   private String Gridlevel_procesosquimicoslineas_titlescategories_Class ;
   private String Gridlevel_procesosquimicoslineas_titlescategories_Gridinternalname ;
   private String hsh ;
   private String sMode89 ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String GXCCtl ;
   private String A13976PrdNomForm ;
   private String A765ProForDes ;
   private String A717PrdMaxFind ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String T763ProForCla ;
   private String T5358ProForClv ;
   private String AV11EmprNom ;
   private String AV54Op ;
   private String AV28msg0 ;
   private String edtavClaves_gximage ;
   private String edtavClavesdel_gximage ;
   private String AV51Proforprd ;
   private String Z407EmprNom ;
   private String Z710PrdFind ;
   private String Z488ForPrdDsc ;
   private String sGXsfl_125_fel_idx="0001" ;
   private String subGridlevel_procesosquimicoslineas_Class ;
   private String subGridlevel_procesosquimicoslineas_Linesclass ;
   private String ROClassString ;
   private String edtProForLin_Jsonclick ;
   private String edtProForPrd_Jsonclick ;
   private String edtPrdFind_Jsonclick ;
   private String edtPrdNomForm_Jsonclick ;
   private String edtProForDes_Jsonclick ;
   private String edtProForCPo_Jsonclick ;
   private String edtProForCan_Jsonclick ;
   private String edtForPrdUMe_Jsonclick ;
   private String sImgUrl ;
   private String edtavClaves_Jsonclick ;
   private String edtavClavesdel_Jsonclick ;
   private String edtProForCla_Jsonclick ;
   private String edtProForClv_Jsonclick ;
   private String edtProForNro_Jsonclick ;
   private String edtProForTnq_Jsonclick ;
   private String edtPrdMaxFind_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String i13133ProForAct ;
   private String i3005ProRev ;
   private String i13178ProForFT ;
   private String subGridlevel_procesosquimicoslineas_Header ;
   private String gxwrpcisep ;
   private String l719PrdNum ;
   private String Z920ProForCodV ;
   private String Z941EmprCodV2 ;
   private String Z717PrdMaxFind ;
   private String GXt_char1 ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String Z13976PrdNomForm ;
   private String ZV10Msg_e ;
   private String ZV39Msg_del ;
   private java.util.Date Z674PorForFul ;
   private java.util.Date A674PorForFul ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n764ProForCod ;
   private boolean n710PrdFind ;
   private boolean wbErr ;
   private boolean bGXsfl_125_Refreshing=false ;
   private boolean Dvpanel_tableattributes_Autowidth ;
   private boolean Dvpanel_tableattributes_Autoheight ;
   private boolean Dvpanel_tableattributes_Collapsible ;
   private boolean Dvpanel_tableattributes_Collapsed ;
   private boolean Dvpanel_tableattributes_Showcollapseicon ;
   private boolean Dvpanel_tableattributes_Autoscroll ;
   private boolean n4340PrdUMeFind ;
   private boolean n488ForPrdDsc ;
   private boolean Combo_proforlab_Enabled ;
   private boolean Combo_proforlab_Visible ;
   private boolean Combo_proforlab_Allowmultipleselection ;
   private boolean Combo_proforlab_Isgriditem ;
   private boolean Combo_proforlab_Hasdescription ;
   private boolean Combo_proforlab_Includeonlyselectedoption ;
   private boolean Combo_proforlab_Includeselectalloption ;
   private boolean Combo_proforlab_Emptyitem ;
   private boolean Combo_proforlab_Includeaddnewoption ;
   private boolean Dvpanel_tableattributes_Enabled ;
   private boolean Dvpanel_tableattributes_Showheader ;
   private boolean Dvpanel_tableattributes_Visible ;
   private boolean Gridlevel_procesosquimicoslineas_titlescategories_Enabled ;
   private boolean Gridlevel_procesosquimicoslineas_titlescategories_Visible ;
   private boolean n407EmprNom ;
   private boolean n717PrdMaxFind ;
   private boolean returnInSub ;
   private boolean Gx_longc ;
   private boolean AV41Claves_IsBlob ;
   private boolean AV45Clavesdel_IsBlob ;
   private String A13746ForPrdCDsc ;
   private String h490ForPrdUMe ;
   private String A13740ProFDsc ;
   private String AV55Claves_GXI ;
   private String AV56Clavesdel_GXI ;
   private String AV49ComboSelectedValue ;
   private String l13746ForPrdCDsc ;
   private String Zh490ForPrdUMe ;
   private String AV41Claves ;
   private String AV45Clavesdel ;
   private com.genexus.webpanels.GXWebGrid Gridlevel_procesosquimicoslineasContainer ;
   private com.genexus.webpanels.GXWebRow Gridlevel_procesosquimicoslineasRow ;
   private com.genexus.webpanels.GXWebColumn Gridlevel_procesosquimicoslineasColumn ;
   private com.genexus.internet.StringCollection gxdynajaxctrlcodr ;
   private com.genexus.internet.StringCollection gxdynajaxctrldescr ;
   private com.genexus.webpanels.WebSession AV35WebSession ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableattributes ;
   private com.genexus.webpanels.GXUserControl ucCombo_proforlab ;
   private com.genexus.webpanels.GXUserControl ucGridlevel_procesosquimicoslineas_titlescategories ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private ICheckbox chkProForAct ;
   private HTMLChoice cmbProRev ;
   private IDataStoreProvider pr_default ;
   private String[] T01RW17_A407EmprNom ;
   private boolean[] T01RW17_n407EmprNom ;
   private String[] T01RW18_A764ProForCod ;
   private boolean[] T01RW18_n764ProForCod ;
   private String[] T01RW18_A6061ProForLab ;
   private String[] T01RW18_A407EmprNom ;
   private boolean[] T01RW18_n407EmprNom ;
   private String[] T01RW18_A766ProForDsc ;
   private String[] T01RW18_A4715ProForDsc2 ;
   private short[] T01RW18_A771ProForTie ;
   private short[] T01RW18_A772ProForTmx ;
   private String[] T01RW18_A769ProForMat ;
   private java.util.Date[] T01RW18_A674PorForFul ;
   private short[] T01RW18_A773ProForUli ;
   private int[] T01RW18_A2392ProNumPro ;
   private int[] T01RW18_A2393ProNumRec ;
   private String[] T01RW18_A3005ProRev ;
   private short[] T01RW18_A4705ProForPau ;
   private short[] T01RW18_A4706ProForRb ;
   private String[] T01RW18_A4864ProForCCi ;
   private String[] T01RW18_A4865ProForDCi ;
   private String[] T01RW18_A5523ProForTip ;
   private java.math.BigDecimal[] T01RW18_A8527ProForAbs ;
   private java.math.BigDecimal[] T01RW18_A8528ProForCos ;
   private int[] T01RW18_A10120ProforVl ;
   private short[] T01RW18_A10547ProH2O ;
   private java.math.BigDecimal[] T01RW18_A3589ProForMer ;
   private String[] T01RW18_A13133ProForAct ;
   private String[] T01RW18_A13936ProForRs ;
   private String[] T01RW18_A396EmprCod ;
   private String[] T01RW19_A407EmprNom ;
   private boolean[] T01RW19_n407EmprNom ;
   private String[] T01RW20_A396EmprCod ;
   private String[] T01RW20_A764ProForCod ;
   private boolean[] T01RW20_n764ProForCod ;
   private String[] T01RW16_A764ProForCod ;
   private boolean[] T01RW16_n764ProForCod ;
   private String[] T01RW16_A6061ProForLab ;
   private String[] T01RW16_A766ProForDsc ;
   private String[] T01RW16_A4715ProForDsc2 ;
   private short[] T01RW16_A771ProForTie ;
   private short[] T01RW16_A772ProForTmx ;
   private String[] T01RW16_A769ProForMat ;
   private java.util.Date[] T01RW16_A674PorForFul ;
   private short[] T01RW16_A773ProForUli ;
   private int[] T01RW16_A2392ProNumPro ;
   private int[] T01RW16_A2393ProNumRec ;
   private String[] T01RW16_A3005ProRev ;
   private short[] T01RW16_A4705ProForPau ;
   private short[] T01RW16_A4706ProForRb ;
   private String[] T01RW16_A4864ProForCCi ;
   private String[] T01RW16_A4865ProForDCi ;
   private String[] T01RW16_A5523ProForTip ;
   private java.math.BigDecimal[] T01RW16_A8527ProForAbs ;
   private java.math.BigDecimal[] T01RW16_A8528ProForCos ;
   private int[] T01RW16_A10120ProforVl ;
   private short[] T01RW16_A10547ProH2O ;
   private java.math.BigDecimal[] T01RW16_A3589ProForMer ;
   private String[] T01RW16_A13133ProForAct ;
   private String[] T01RW16_A13936ProForRs ;
   private String[] T01RW16_A396EmprCod ;
   private String[] T01RW21_A396EmprCod ;
   private String[] T01RW21_A764ProForCod ;
   private boolean[] T01RW21_n764ProForCod ;
   private String[] T01RW22_A396EmprCod ;
   private String[] T01RW22_A764ProForCod ;
   private boolean[] T01RW22_n764ProForCod ;
   private String[] T01RW15_A764ProForCod ;
   private boolean[] T01RW15_n764ProForCod ;
   private String[] T01RW15_A6061ProForLab ;
   private String[] T01RW15_A766ProForDsc ;
   private String[] T01RW15_A4715ProForDsc2 ;
   private short[] T01RW15_A771ProForTie ;
   private short[] T01RW15_A772ProForTmx ;
   private String[] T01RW15_A769ProForMat ;
   private java.util.Date[] T01RW15_A674PorForFul ;
   private short[] T01RW15_A773ProForUli ;
   private int[] T01RW15_A2392ProNumPro ;
   private int[] T01RW15_A2393ProNumRec ;
   private String[] T01RW15_A3005ProRev ;
   private short[] T01RW15_A4705ProForPau ;
   private short[] T01RW15_A4706ProForRb ;
   private String[] T01RW15_A4864ProForCCi ;
   private String[] T01RW15_A4865ProForDCi ;
   private String[] T01RW15_A5523ProForTip ;
   private java.math.BigDecimal[] T01RW15_A8527ProForAbs ;
   private java.math.BigDecimal[] T01RW15_A8528ProForCos ;
   private int[] T01RW15_A10120ProforVl ;
   private short[] T01RW15_A10547ProH2O ;
   private java.math.BigDecimal[] T01RW15_A3589ProForMer ;
   private String[] T01RW15_A13133ProForAct ;
   private String[] T01RW15_A13936ProForRs ;
   private String[] T01RW15_A396EmprCod ;
   private String[] T01RW26_A407EmprNom ;
   private boolean[] T01RW26_n407EmprNom ;
   private String[] T01RW27_A396EmprCod ;
   private int[] T01RW27_A252CliCod ;
   private String[] T01RW27_A13381CliProQui ;
   private String[] T01RW28_A396EmprCod ;
   private int[] T01RW28_A13026PedDGId ;
   private String[] T01RW28_A758ProCod ;
   private short[] T01RW28_A13045PedDGFasLi ;
   private short[] T01RW28_A13057PedDGPQLin ;
   private String[] T01RW29_A396EmprCod ;
   private int[] T01RW29_A12673LavMqId ;
   private short[] T01RW29_A12692LavMqLnPq ;
   private String[] T01RW30_A396EmprCod ;
   private int[] T01RW30_A129BarCod ;
   private byte[] T01RW30_A132BarCodReo ;
   private String[] T01RW30_A130BarCodPar ;
   private byte[] T01RW30_A4075recestncol ;
   private byte[] T01RW30_A4076recestnpro ;
   private String[] T01RW31_A396EmprCod ;
   private int[] T01RW31_A4052EstNumFor ;
   private byte[] T01RW31_A4053EstNumCol ;
   private byte[] T01RW31_A4057EstNumLin ;
   private String[] T01RW32_A396EmprCod ;
   private String[] T01RW32_A6380Ft_procod ;
   private short[] T01RW32_A6383Ft_ProLin ;
   private String[] T01RW33_A396EmprCod ;
   private int[] T01RW33_A11270Pot_num ;
   private String[] T01RW34_A396EmprCod ;
   private String[] T01RW34_A764ProForCod ;
   private boolean[] T01RW34_n764ProForCod ;
   private int[] T01RW34_A8877Prg_Cod ;
   private String[] T01RW35_A396EmprCod ;
   private int[] T01RW35_A252CliCod ;
   private String[] T01RW35_A494ForSer ;
   private String[] T01RW35_A482ForColNom ;
   private int[] T01RW35_A483ForColNum ;
   private byte[] T01RW35_A831TipColCod ;
   private String[] T01RW35_A7094Acab_Ter ;
   private String[] T01RW36_A396EmprCod ;
   private String[] T01RW36_A758ProCod ;
   private short[] T01RW36_A774ProNumLin ;
   private short[] T01RW36_A6438ProFsaL ;
   private String[] T01RW37_A396EmprCod ;
   private int[] T01RW37_A6319C_Barcod ;
   private byte[] T01RW37_A6320C_Barcodre ;
   private String[] T01RW37_A6321C_Barcodpa ;
   private short[] T01RW37_A6322C_Reclinma ;
   private byte[] T01RW37_A6323C_Reclinpr ;
   private String[] T01RW38_A396EmprCod ;
   private int[] T01RW38_A361DisCod ;
   private String[] T01RW38_A758ProCod ;
   private short[] T01RW38_A368DisFasLin ;
   private short[] T01RW38_A5377DisQuiLin ;
   private String[] T01RW39_A396EmprCod ;
   private int[] T01RW39_A129BarCod ;
   private byte[] T01RW39_A132BarCodReo ;
   private String[] T01RW39_A130BarCodPar ;
   private String[] T01RW39_A758ProCod ;
   private short[] T01RW39_A194BarOrdLin ;
   private short[] T01RW39_A5371FasQuiLin ;
   private String[] T01RW40_A396EmprCod ;
   private String[] T01RW40_A764ProForCod ;
   private boolean[] T01RW40_n764ProForCod ;
   private short[] T01RW40_A5191ProForLC ;
   private String[] T01RW41_A396EmprCod ;
   private String[] T01RW41_A764ProForCod ;
   private boolean[] T01RW41_n764ProForCod ;
   private short[] T01RW41_A5191ProForLC ;
   private String[] T01RW42_A396EmprCod ;
   private byte[] T01RW42_A831TipColCod ;
   private short[] T01RW42_A5162TipColLin ;
   private String[] T01RW43_A396EmprCod ;
   private int[] T01RW43_A4744RecPreCod ;
   private short[] T01RW43_A4762RecPreLin ;
   private String[] T01RW44_A396EmprCod ;
   private int[] T01RW44_A252CliCod ;
   private String[] T01RW44_A65ArtCod ;
   private String[] T01RW44_A4658MdlCod ;
   private String[] T01RW44_A457FasCod ;
   private short[] T01RW44_A4660FasProLin ;
   private String[] T01RW45_A396EmprCod ;
   private String[] T01RW45_A457FasCod ;
   private short[] T01RW45_A4650FasForLin ;
   private String[] T01RW46_A396EmprCod ;
   private int[] T01RW46_A129BarCod ;
   private byte[] T01RW46_A132BarCodReo ;
   private String[] T01RW46_A130BarCodPar ;
   private short[] T01RW46_A2804RecLinMaq ;
   private byte[] T01RW46_A1273RecLinPro ;
   private String[] T01RW47_A396EmprCod ;
   private String[] T01RW47_A1514MacProCod ;
   private short[] T01RW47_A1517MacProLin ;
   private String[] T01RW48_A396EmprCod ;
   private int[] T01RW48_A252CliCod ;
   private String[] T01RW48_A494ForSer ;
   private String[] T01RW48_A482ForColNom ;
   private int[] T01RW48_A483ForColNum ;
   private byte[] T01RW48_A831TipColCod ;
   private short[] T01RW48_A1160ProForL ;
   private String[] T01RW49_A396EmprCod ;
   private String[] T01RW49_A910Workstat ;
   private int[] T01RW49_A887EscMLin ;
   private String[] T01RW50_A396EmprCod ;
   private String[] T01RW50_A764ProForCod ;
   private boolean[] T01RW50_n764ProForCod ;
   private String[] T01RW51_A719PrdNum ;
   private String[] T01RW51_A764ProForCod ;
   private boolean[] T01RW51_n764ProForCod ;
   private short[] T01RW51_A767ProForLin ;
   private java.math.BigDecimal[] T01RW51_A6062ProForCPo ;
   private String[] T01RW51_A13178ProForFT ;
   private String[] T01RW51_A765ProForDes ;
   private String[] T01RW51_A770ProForPrd ;
   private String[] T01RW51_A13111ProForDe2 ;
   private String[] T01RW51_A488ForPrdDsc ;
   private boolean[] T01RW51_n488ForPrdDsc ;
   private java.math.BigDecimal[] T01RW51_A762ProForCan ;
   private byte[] T01RW51_A1645ProForNro ;
   private byte[] T01RW51_A3379ProForTnq ;
   private String[] T01RW51_A763ProForCla ;
   private String[] T01RW51_A5358ProForClv ;
   private String[] T01RW51_A396EmprCod ;
   private byte[] T01RW51_A490ForPrdUMe ;
   private String[] T01RW51_A710PrdFind ;
   private boolean[] T01RW51_n710PrdFind ;
   private byte[] T01RW6_A4340PrdUMeFind ;
   private boolean[] T01RW6_n4340PrdUMeFind ;
   private String[] T01RW52_A13746ForPrdCDsc ;
   private String[] T01RW52_A396EmprCod ;
   private byte[] T01RW52_A490ForPrdUMe ;
   private String[] T01RW12_A717PrdMaxFind ;
   private boolean[] T01RW12_n717PrdMaxFind ;
   private String[] T01RW53_A13746ForPrdCDsc ;
   private String[] T01RW53_A396EmprCod ;
   private byte[] T01RW53_A490ForPrdUMe ;
   private String[] T01RW54_A13746ForPrdCDsc ;
   private String[] T01RW54_A396EmprCod ;
   private byte[] T01RW54_A490ForPrdUMe ;
   private String[] T01RW55_A13746ForPrdCDsc ;
   private String[] T01RW55_A396EmprCod ;
   private byte[] T01RW55_A490ForPrdUMe ;
   private String[] T01RW13_A488ForPrdDsc ;
   private boolean[] T01RW13_n488ForPrdDsc ;
   private String[] T01RW14_A710PrdFind ;
   private boolean[] T01RW14_n710PrdFind ;
   private String[] T01RW56_A13746ForPrdCDsc ;
   private String[] T01RW56_A396EmprCod ;
   private byte[] T01RW56_A490ForPrdUMe ;
   private String[] T01RW57_A710PrdFind ;
   private boolean[] T01RW57_n710PrdFind ;
   private byte[] T01RW60_A4340PrdUMeFind ;
   private boolean[] T01RW60_n4340PrdUMeFind ;
   private String[] T01RW66_A717PrdMaxFind ;
   private boolean[] T01RW66_n717PrdMaxFind ;
   private String[] T01RW67_A488ForPrdDsc ;
   private boolean[] T01RW67_n488ForPrdDsc ;
   private String[] T01RW68_A13746ForPrdCDsc ;
   private String[] T01RW68_A396EmprCod ;
   private byte[] T01RW68_A490ForPrdUMe ;
   private String[] T01RW69_A396EmprCod ;
   private String[] T01RW69_A764ProForCod ;
   private boolean[] T01RW69_n764ProForCod ;
   private short[] T01RW69_A767ProForLin ;
   private String[] T01RW3_A764ProForCod ;
   private boolean[] T01RW3_n764ProForCod ;
   private short[] T01RW3_A767ProForLin ;
   private java.math.BigDecimal[] T01RW3_A6062ProForCPo ;
   private String[] T01RW3_A13178ProForFT ;
   private String[] T01RW3_A765ProForDes ;
   private String[] T01RW3_A770ProForPrd ;
   private String[] T01RW3_A13111ProForDe2 ;
   private java.math.BigDecimal[] T01RW3_A762ProForCan ;
   private byte[] T01RW3_A1645ProForNro ;
   private byte[] T01RW3_A3379ProForTnq ;
   private String[] T01RW3_A763ProForCla ;
   private String[] T01RW3_A5358ProForClv ;
   private String[] T01RW3_A396EmprCod ;
   private byte[] T01RW3_A490ForPrdUMe ;
   private String[] T01RW70_A13746ForPrdCDsc ;
   private String[] T01RW70_A396EmprCod ;
   private byte[] T01RW70_A490ForPrdUMe ;
   private String[] T01RW2_A764ProForCod ;
   private boolean[] T01RW2_n764ProForCod ;
   private short[] T01RW2_A767ProForLin ;
   private java.math.BigDecimal[] T01RW2_A6062ProForCPo ;
   private String[] T01RW2_A13178ProForFT ;
   private String[] T01RW2_A765ProForDes ;
   private String[] T01RW2_A770ProForPrd ;
   private String[] T01RW2_A13111ProForDe2 ;
   private java.math.BigDecimal[] T01RW2_A762ProForCan ;
   private byte[] T01RW2_A1645ProForNro ;
   private byte[] T01RW2_A3379ProForTnq ;
   private String[] T01RW2_A763ProForCla ;
   private String[] T01RW2_A5358ProForClv ;
   private String[] T01RW2_A396EmprCod ;
   private byte[] T01RW2_A490ForPrdUMe ;
   private String[] T01RW79_A717PrdMaxFind ;
   private boolean[] T01RW79_n717PrdMaxFind ;
   private String[] T01RW80_A710PrdFind ;
   private boolean[] T01RW80_n710PrdFind ;
   private byte[] T01RW83_A4340PrdUMeFind ;
   private boolean[] T01RW83_n4340PrdUMeFind ;
   private String[] T01RW84_A488ForPrdDsc ;
   private boolean[] T01RW84_n488ForPrdDsc ;
   private String[] T01RW85_A396EmprCod ;
   private String[] T01RW85_A764ProForCod ;
   private boolean[] T01RW85_n764ProForCod ;
   private short[] T01RW85_A767ProForLin ;
   private String[] T01RW86_A396EmprCod ;
   private String[] T01RW86_A719PrdNum ;
   private String[] T01RW87_A13746ForPrdCDsc ;
   private String[] T01RW88_A13746ForPrdCDsc ;
   private String[] T01RW88_A396EmprCod ;
   private byte[] T01RW88_A490ForPrdUMe ;
   private String[] T01RW94_A717PrdMaxFind ;
   private boolean[] T01RW94_n717PrdMaxFind ;
   private String[] T01RW95_A710PrdFind ;
   private boolean[] T01RW95_n710PrdFind ;
   private byte[] T01RW98_A4340PrdUMeFind ;
   private boolean[] T01RW98_n4340PrdUMeFind ;
   private String[] T01RW99_A13746ForPrdCDsc ;
   private String[] T01RW99_A396EmprCod ;
   private byte[] T01RW99_A490ForPrdUMe ;
   private String[] T01RW100_A13746ForPrdCDsc ;
   private String[] T01RW100_A396EmprCod ;
   private byte[] T01RW100_A490ForPrdUMe ;
   private String[] T01RW101_A488ForPrdDsc ;
   private boolean[] T01RW101_n488ForPrdDsc ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV48ProForLab_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> GXt_objcol_SdtDVB_SDTComboData_Item8 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> GXv_objcol_SdtDVB_SDTComboData_Item9[] ;
   private app.wwpbaseobjects.SdtWWPContext AV33WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext7[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV34TrnContext ;
}

final  class procesosquimicos_trn__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class procesosquimicos_trn__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class procesosquimicos_trn__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class procesosquimicos_trn__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class procesosquimicos_trn__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01RW2", "SELECT ProForCod, ProForLin, ProForCPo, ProForFT, ProForDes, ProForPrd, ProForDe2, ProForCan, ProForNro, ProForTnq, ProForCla, ProForClv, EmprCod, ForPrdUMe FROM TXPLPROFO WHERE EmprCod = ? AND ProForCod = ? AND ProForLin = ?  FOR UPDATE OF ProForCPo, ProForFT, ProForDes, ProForPrd, ProForDe2, ProForCan, ProForNro, ProForTnq, ProForCla, ProForClv, ForPrdUMe NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RW3", "SELECT ProForCod, ProForLin, ProForCPo, ProForFT, ProForDes, ProForPrd, ProForDe2, ProForCan, ProForNro, ProForTnq, ProForCla, ProForClv, EmprCod, ForPrdUMe FROM TXPLPROFO WHERE EmprCod = ? AND ProForCod = ? AND ProForLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RW6", "SELECT COALESCE( T1.PrdUMeFind, 0) AS PrdUMeFind FROM (SELECT CASE  WHEN ? <> 'xxxxxx' THEN COALESCE( T2.PrdUMeFo, 0) END AS PrdUMeFind FROM (SELECT PrdUMeFo, EmprCod, PrdNum FROM TXPPRODUC WHERE PrdNum = ? ) T2 WHERE T2.EmprCod = ? ) T1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RW12", "SELECT COALESCE( T1.PrdMaxFind, '') AS PrdMaxFind FROM (SELECT CASE  WHEN Not (? = 0) THEN COALESCE( T3.GXC3, ' ') ELSE COALESCE( T2.GXC4, ' ') END AS PrdMaxFind FROM (SELECT T4.ProForPrd AS GXC4, T4.ProForLin, T5.GXC7 AS GXC7, T4.EmprCod, T4.ProForCod FROM TXPLPROFO T4 FULL OUTER JOIN  (SELECT MAX(ProForLin) AS GXC7 FROM TXPLPROFO WHERE (EmprCod = ?) AND (ProForCod = ?) ) T5 ON 1=1 WHERE (T4.ProForLin = T5.GXC7) AND (T4.EmprCod = ?) AND (T4.ProForCod = ?) ) T2 FULL OUTER JOIN  (SELECT T4.ProForPrd AS GXC3, T4.ProForLin, T5.GXC6 AS GXC6, T4.EmprCod, T4.ProForCod FROM TXPLPROFO T4 FULL OUTER JOIN  (SELECT MAX(ProForLin) AS GXC6 FROM TXPLPROFO WHERE (ProForLin < ?) AND (EmprCod = ?) AND (ProForCod = ?) ) T5 ON 1=1 WHERE (T4.ProForLin = T5.GXC6) AND (T4.ProForLin < ?) AND (T4.EmprCod = ?) AND (T4.ProForCod = ?) ) T3 ON 1=1 ) T1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RW13", "SELECT ForPrdDsc FROM TXPUNMEPR WHERE EmprCod = ? AND ForPrdUMe = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RW14", "SELECT COALESCE( PrdNum, 'xxxxxx') AS PrdFind FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RW15", "SELECT ProForCod, ProForLab, ProForDsc, ProForDsc2, ProForTie, ProForTmx, ProForMat, PorForFul, ProForUli, ProNumPro, ProNumRec, ProRev, ProForPau, ProForRb, ProForCCi, ProForDCi, ProForTip, ProForAbs, ProForCos, ProforVl, ProH2O, ProForMer, ProForAct, ProForRs, EmprCod FROM TXPCPROFO WHERE EmprCod = ? AND ProForCod = ?  FOR UPDATE OF ProForLab, ProForDsc, ProForDsc2, ProForTie, ProForTmx, ProForMat, PorForFul, ProForUli, ProNumPro, ProNumRec, ProRev, ProForPau, ProForRb, ProForCCi, ProForDCi, ProForTip, ProForAbs, ProForCos, ProforVl, ProH2O, ProForMer, ProForAct, ProForRs NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RW16", "SELECT ProForCod, ProForLab, ProForDsc, ProForDsc2, ProForTie, ProForTmx, ProForMat, PorForFul, ProForUli, ProNumPro, ProNumRec, ProRev, ProForPau, ProForRb, ProForCCi, ProForDCi, ProForTip, ProForAbs, ProForCos, ProforVl, ProH2O, ProForMer, ProForAct, ProForRs, EmprCod FROM TXPCPROFO WHERE EmprCod = ? AND ProForCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RW17", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RW18", "SELECT /*+ FIRST_ROWS(100) */ TM1.ProForCod, TM1.ProForLab, T2.EmprNom, TM1.ProForDsc, TM1.ProForDsc2, TM1.ProForTie, TM1.ProForTmx, TM1.ProForMat, TM1.PorForFul, TM1.ProForUli, TM1.ProNumPro, TM1.ProNumRec, TM1.ProRev, TM1.ProForPau, TM1.ProForRb, TM1.ProForCCi, TM1.ProForDCi, TM1.ProForTip, TM1.ProForAbs, TM1.ProForCos, TM1.ProforVl, TM1.ProH2O, TM1.ProForMer, TM1.ProForAct, TM1.ProForRs, TM1.EmprCod FROM (TXPCPROFO TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) WHERE TM1.EmprCod = ? and TM1.ProForCod = ? ORDER BY TM1.EmprCod, TM1.ProForCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RW19", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RW20", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, ProForCod FROM TXPCPROFO WHERE EmprCod = ? AND ProForCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RW21", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, ProForCod FROM TXPCPROFO WHERE ( EmprCod > ? or EmprCod = ? and ProForCod > ?) ORDER BY EmprCod, ProForCod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RW22", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, ProForCod FROM TXPCPROFO WHERE ( EmprCod < ? or EmprCod = ? and ProForCod < ?) ORDER BY EmprCod DESC, ProForCod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01RW23", "INSERT INTO TXPCPROFO(ProForCod, ProForLab, ProForDsc, ProForDsc2, ProForTie, ProForTmx, ProForMat, PorForFul, ProForUli, ProNumPro, ProNumRec, ProRev, ProForPau, ProForRb, ProForCCi, ProForDCi, ProForTip, ProForAbs, ProForCos, ProforVl, ProH2O, ProForMer, ProForAct, ProForRs, EmprCod, ProForObs, ProFoLCU, ProForFac, IntCodF2, ProForFab, ProForCol, ProForPhx, ProForPhn, ProNh2o) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ' ', 0, ' ', 0, ' ', ' ', 0, 0, 0)", GX_NOMASK, "TXPCPROFO")
         ,new UpdateCursor("T01RW24", "UPDATE TXPCPROFO SET ProForLab=?, ProForDsc=?, ProForDsc2=?, ProForTie=?, ProForTmx=?, ProForMat=?, PorForFul=?, ProForUli=?, ProNumPro=?, ProNumRec=?, ProRev=?, ProForPau=?, ProForRb=?, ProForCCi=?, ProForDCi=?, ProForTip=?, ProForAbs=?, ProForCos=?, ProforVl=?, ProH2O=?, ProForMer=?, ProForAct=?, ProForRs=?  WHERE EmprCod = ? AND ProForCod = ?", GX_NOMASK, "TXPCPROFO")
         ,new UpdateCursor("T01RW25", "DELETE FROM TXPCPROFO  WHERE EmprCod = ? AND ProForCod = ?", GX_NOMASK, "TXPCPROFO")
         ,new ForEachCursor("T01RW26", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RW27", "SELECT * FROM (SELECT EmprCod, CliCod, CliProQui FROM TXPCLIPQU WHERE EmprCod = ? AND CliProQui = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RW28", "SELECT * FROM (SELECT EmprCod, PedDGId, ProCod, PedDGFasLi, PedDGPQLin FROM TXPPEDDG7 WHERE EmprCod = ? AND ProForCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RW29", "SELECT * FROM (SELECT EmprCod, LavMqId, LavMqLnPq FROM TXPLAVMQ1 WHERE EmprCod = ? AND ProForCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RW30", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, recestncol, recestnpro FROM TXPcreest WHERE EmprCod = ? AND ProForCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RW31", "SELECT * FROM (SELECT EmprCod, EstNumFor, EstNumCol, EstNumLin FROM TXPLCoPro WHERE EmprCod = ? AND ProForCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RW32", "SELECT * FROM (SELECT EmprCod, Ft_procod, Ft_ProLin FROM TXPFTPQS1 WHERE EmprCod = ? AND ProForCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RW33", "SELECT * FROM (SELECT EmprCod, Pot_num FROM TXPRECPOT WHERE EmprCod = ? AND ProForCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RW34", "SELECT * FROM (SELECT EmprCod, ProForCod, Prg_Cod FROM TXPPQPRGN WHERE EmprCod = ? AND ProForCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RW35", "SELECT * FROM (SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, Acab_Ter FROM TXPCORAQ WHERE EmprCod = ? AND Acab_Ter = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RW36", "SELECT * FROM (SELECT EmprCod, ProCod, ProNumLin, ProFsaL FROM TXPPROFSA WHERE EmprCod = ? AND ProForCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RW37", "SELECT * FROM (SELECT EmprCod, C_Barcod, C_Barcodre, C_Barcodpa, C_Reclinma, C_Reclinpr FROM TXPCRECE1 WHERE EmprCod = ? AND ProForCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RW38", "SELECT * FROM (SELECT EmprCod, DisCod, ProCod, DisFasLin, DisQuiLin FROM TXPDISQUI WHERE EmprCod = ? AND ProForCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RW39", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, FasQuiLin FROM TXPFASQUI WHERE EmprCod = ? AND ProForCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RW40", "SELECT * FROM (SELECT EmprCod, ProForCod, ProForLC FROM TXPPROFOC WHERE EmprCod = ? AND ProFoQuC = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RW41", "SELECT * FROM (SELECT EmprCod, ProForCod, ProForLC FROM TXPPROFOC WHERE EmprCod = ? AND ProForCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RW42", "SELECT * FROM (SELECT EmprCod, TipColCod, TipColLin FROM TXPTIPCOP WHERE EmprCod = ? AND ProForCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RW43", "SELECT * FROM (SELECT EmprCod, RecPreCod, RecPreLin FROM TXPPRERE1 WHERE EmprCod = ? AND ProForCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RW44", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, MdlCod, FasCod, FasProLin FROM TXPLForFa WHERE EmprCod = ? AND ProForCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RW45", "SELECT * FROM (SELECT EmprCod, FasCod, FasForLin FROM TXPFASPR1 WHERE EmprCod = ? AND ProForCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RW46", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq, RecLinPro FROM TXPCRECET WHERE EmprCod = ? AND ProForCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RW47", "SELECT * FROM (SELECT EmprCod, MacProCod, MacProLin FROM TXPLMACPR WHERE EmprCod = ? AND ProForCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RW48", "SELECT * FROM (SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, ProForL FROM TXPLFORMU WHERE EmprCod = ? AND ProForCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RW49", "SELECT * FROM (SELECT EmprCod, Workstat, EscMLin FROM TXPESCMAN WHERE EmprCod = ? AND ProForCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RW50", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, ProForCod FROM TXPCPROFO ORDER BY EmprCod, ProForCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RW51", "SELECT T2.PrdNum, T1.ProForCod, T1.ProForLin, T1.ProForCPo, T1.ProForFT, T1.ProForDes, T1.ProForPrd, T1.ProForDe2, T3.ForPrdDsc, T1.ProForCan, T1.ProForNro, T1.ProForTnq, T1.ProForCla, T1.ProForClv, T1.EmprCod, T1.ForPrdUMe, COALESCE( T2.PrdNum, 'xxxxxx') AS PrdFind FROM ((TXPLPROFO T1 LEFT JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.ProForPrd) INNER JOIN TXPUNMEPR T3 ON T3.EmprCod = T1.EmprCod AND T3.ForPrdUMe = T1.ForPrdUMe) WHERE T1.EmprCod = ? and T1.ProForCod = ? and T1.ProForLin = ? ORDER BY T1.EmprCod, T1.ProForCod, T1.ProForLin ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RW52", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(ForPrdUMe,'90'), 2))) || '-' || RTRIM(LTRIM(COALESCE( ForPrdDsc, ''))) AS ForPrdCDsc, EmprCod, ForPrdUMe FROM TXPUNMEPR WHERE (EmprCod = ?) AND (ForPrdUMe = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RW53", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(ForPrdUMe,'90'), 2))) || '-' || RTRIM(LTRIM(COALESCE( ForPrdDsc, ''))) AS ForPrdCDsc, EmprCod, ForPrdUMe FROM TXPUNMEPR WHERE (EmprCod = ?) AND (ForPrdUMe = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RW54", "SELECT /*+ FIRST_ROWS */ RTRIM(LTRIM(SUBSTR(TO_CHAR(ForPrdUMe,'90'), 2))) || '-' || RTRIM(LTRIM(COALESCE( ForPrdDsc, ''))) AS ForPrdCDsc, EmprCod, ForPrdUMe FROM TXPUNMEPR WHERE (RTRIM(LTRIM(SUBSTR(TO_CHAR(ForPrdUMe,'90'), 2))) || '-' || RTRIM(LTRIM(COALESCE( ForPrdDsc, ''))) = ?) AND (EmprCod = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RW55", "SELECT /*+ FIRST_ROWS */ RTRIM(LTRIM(SUBSTR(TO_CHAR(ForPrdUMe,'90'), 2))) || '-' || RTRIM(LTRIM(COALESCE( ForPrdDsc, ''))) AS ForPrdCDsc, EmprCod, ForPrdUMe FROM TXPUNMEPR WHERE (RTRIM(LTRIM(SUBSTR(TO_CHAR(ForPrdUMe,'90'), 2))) || '-' || RTRIM(LTRIM(COALESCE( ForPrdDsc, ''))) = ?) AND (EmprCod = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RW56", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(ForPrdUMe,'90'), 2))) || '-' || RTRIM(LTRIM(COALESCE( ForPrdDsc, ''))) AS ForPrdCDsc, EmprCod, ForPrdUMe FROM TXPUNMEPR WHERE (EmprCod = ?) AND (ForPrdUMe = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RW57", "SELECT COALESCE( PrdNum, 'xxxxxx') AS PrdFind FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RW60", "SELECT COALESCE( T1.PrdUMeFind, 0) AS PrdUMeFind FROM (SELECT CASE  WHEN ? <> 'xxxxxx' THEN COALESCE( T2.PrdUMeFo, 0) END AS PrdUMeFind FROM (SELECT PrdUMeFo, EmprCod, PrdNum FROM TXPPRODUC WHERE PrdNum = ? ) T2 WHERE T2.EmprCod = ? ) T1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RW66", "SELECT COALESCE( T1.PrdMaxFind, '') AS PrdMaxFind FROM (SELECT CASE  WHEN Not (? = 0) THEN COALESCE( T3.GXC3, ' ') ELSE COALESCE( T2.GXC4, ' ') END AS PrdMaxFind FROM (SELECT T4.ProForPrd AS GXC4, T4.ProForLin, T5.GXC7 AS GXC7, T4.EmprCod, T4.ProForCod FROM TXPLPROFO T4 FULL OUTER JOIN  (SELECT MAX(ProForLin) AS GXC7 FROM TXPLPROFO WHERE (EmprCod = ?) AND (ProForCod = ?) ) T5 ON 1=1 WHERE (T4.ProForLin = T5.GXC7) AND (T4.EmprCod = ?) AND (T4.ProForCod = ?) ) T2 FULL OUTER JOIN  (SELECT T4.ProForPrd AS GXC3, T4.ProForLin, T5.GXC6 AS GXC6, T4.EmprCod, T4.ProForCod FROM TXPLPROFO T4 FULL OUTER JOIN  (SELECT MAX(ProForLin) AS GXC6 FROM TXPLPROFO WHERE (ProForLin < ?) AND (EmprCod = ?) AND (ProForCod = ?) ) T5 ON 1=1 WHERE (T4.ProForLin = T5.GXC6) AND (T4.ProForLin < ?) AND (T4.EmprCod = ?) AND (T4.ProForCod = ?) ) T3 ON 1=1 ) T1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RW67", "SELECT ForPrdDsc FROM TXPUNMEPR WHERE EmprCod = ? AND ForPrdUMe = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RW68", "SELECT /*+ FIRST_ROWS */ RTRIM(LTRIM(SUBSTR(TO_CHAR(ForPrdUMe,'90'), 2))) || '-' || RTRIM(LTRIM(COALESCE( ForPrdDsc, ''))) AS ForPrdCDsc, EmprCod, ForPrdUMe FROM TXPUNMEPR WHERE (RTRIM(LTRIM(SUBSTR(TO_CHAR(ForPrdUMe,'90'), 2))) || '-' || RTRIM(LTRIM(COALESCE( ForPrdDsc, ''))) = ?) AND (EmprCod = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RW69", "SELECT EmprCod, ProForCod, ProForLin FROM TXPLPROFO WHERE EmprCod = ? AND ProForCod = ? AND ProForLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RW70", "SELECT /*+ FIRST_ROWS */ RTRIM(LTRIM(SUBSTR(TO_CHAR(ForPrdUMe,'90'), 2))) || '-' || RTRIM(LTRIM(COALESCE( ForPrdDsc, ''))) AS ForPrdCDsc, EmprCod, ForPrdUMe FROM TXPUNMEPR WHERE (RTRIM(LTRIM(SUBSTR(TO_CHAR(ForPrdUMe,'90'), 2))) || '-' || RTRIM(LTRIM(COALESCE( ForPrdDsc, ''))) = ?) AND (EmprCod = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01RW71", "INSERT INTO TXPLPROFO(ProForCod, ProForLin, ProForCPo, ProForFT, ProForDes, ProForPrd, ProForDe2, ProForCan, ProForNro, ProForTnq, ProForCla, ProForClv, EmprCod, ForPrdUMe) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPLPROFO")
         ,new UpdateCursor("T01RW72", "UPDATE TXPLPROFO SET ProForCPo=?, ProForFT=?, ProForDes=?, ProForPrd=?, ProForDe2=?, ProForCan=?, ProForNro=?, ProForTnq=?, ProForCla=?, ProForClv=?, ForPrdUMe=?  WHERE EmprCod = ? AND ProForCod = ? AND ProForLin = ?", GX_NOMASK, "TXPLPROFO")
         ,new UpdateCursor("T01RW73", "DELETE FROM TXPLPROFO  WHERE EmprCod = ? AND ProForCod = ? AND ProForLin = ?", GX_NOMASK, "TXPLPROFO")
         ,new ForEachCursor("T01RW79", "SELECT COALESCE( T1.PrdMaxFind, '') AS PrdMaxFind FROM (SELECT CASE  WHEN Not (? = 0) THEN COALESCE( T3.GXC3, ' ') ELSE COALESCE( T2.GXC4, ' ') END AS PrdMaxFind FROM (SELECT T4.ProForPrd AS GXC4, T4.ProForLin, T5.GXC7 AS GXC7, T4.EmprCod, T4.ProForCod FROM TXPLPROFO T4 FULL OUTER JOIN  (SELECT MAX(ProForLin) AS GXC7 FROM TXPLPROFO WHERE (EmprCod = ?) AND (ProForCod = ?) ) T5 ON 1=1 WHERE (T4.ProForLin = T5.GXC7) AND (T4.EmprCod = ?) AND (T4.ProForCod = ?) ) T2 FULL OUTER JOIN  (SELECT T4.ProForPrd AS GXC3, T4.ProForLin, T5.GXC6 AS GXC6, T4.EmprCod, T4.ProForCod FROM TXPLPROFO T4 FULL OUTER JOIN  (SELECT MAX(ProForLin) AS GXC6 FROM TXPLPROFO WHERE (ProForLin < ?) AND (EmprCod = ?) AND (ProForCod = ?) ) T5 ON 1=1 WHERE (T4.ProForLin = T5.GXC6) AND (T4.ProForLin < ?) AND (T4.EmprCod = ?) AND (T4.ProForCod = ?) ) T3 ON 1=1 ) T1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RW80", "SELECT COALESCE( PrdNum, 'xxxxxx') AS PrdFind FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RW83", "SELECT COALESCE( T1.PrdUMeFind, 0) AS PrdUMeFind FROM (SELECT CASE  WHEN ? <> 'xxxxxx' THEN COALESCE( T2.PrdUMeFo, 0) END AS PrdUMeFind FROM (SELECT PrdUMeFo, EmprCod, PrdNum FROM TXPPRODUC WHERE PrdNum = ? ) T2 WHERE T2.EmprCod = ? ) T1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RW84", "SELECT ForPrdDsc FROM TXPUNMEPR WHERE EmprCod = ? AND ForPrdUMe = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RW85", "SELECT EmprCod, ProForCod, ProForLin FROM TXPLPROFO WHERE EmprCod = ? and ProForCod = ? ORDER BY EmprCod, ProForCod, ProForLin ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RW86", "SELECT * FROM (SELECT EmprCod, PrdNum FROM TXPPRODUC WHERE (EmprCod = ?) AND (UPPER(PrdNum) like '%' || UPPER(?)) ORDER BY PrdNum) WHERE rownum <= 50 ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RW87", "SELECT * FROM (SELECT DISTINCT RTRIM(LTRIM(SUBSTR(TO_CHAR(ForPrdUMe,'90'), 2))) || '-' || RTRIM(LTRIM(COALESCE( ForPrdDsc, ''))) AS ForPrdCDsc FROM TXPUNMEPR WHERE (EmprCod = ?) AND (UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(ForPrdUMe,'90'), 2))) || '-' || RTRIM(LTRIM(COALESCE( ForPrdDsc, '')))) like '%' || UPPER(?)) ORDER BY ForPrdCDsc) WHERE rownum <= 5 ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RW88", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(ForPrdUMe,'90'), 2))) || '-' || RTRIM(LTRIM(COALESCE( ForPrdDsc, ''))) AS ForPrdCDsc, EmprCod, ForPrdUMe FROM TXPUNMEPR WHERE (RTRIM(LTRIM(SUBSTR(TO_CHAR(ForPrdUMe,'90'), 2))) || '-' || RTRIM(LTRIM(COALESCE( ForPrdDsc, ''))) = ?) AND (EmprCod = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RW94", "SELECT COALESCE( T1.PrdMaxFind, '') AS PrdMaxFind FROM (SELECT CASE  WHEN Not (? = 0) THEN COALESCE( T3.GXC3, ' ') ELSE COALESCE( T2.GXC4, ' ') END AS PrdMaxFind FROM (SELECT T4.ProForPrd AS GXC4, T4.ProForLin, T5.GXC7 AS GXC7, T4.EmprCod, T4.ProForCod FROM TXPLPROFO T4 FULL OUTER JOIN  (SELECT MAX(ProForLin) AS GXC7 FROM TXPLPROFO WHERE (EmprCod = ?) AND (ProForCod = ?) ) T5 ON 1=1 WHERE (T4.ProForLin = T5.GXC7) AND (T4.EmprCod = ?) AND (T4.ProForCod = ?) ) T2 FULL OUTER JOIN  (SELECT T4.ProForPrd AS GXC3, T4.ProForLin, T5.GXC6 AS GXC6, T4.EmprCod, T4.ProForCod FROM TXPLPROFO T4 FULL OUTER JOIN  (SELECT MAX(ProForLin) AS GXC6 FROM TXPLPROFO WHERE (ProForLin < ?) AND (EmprCod = ?) AND (ProForCod = ?) ) T5 ON 1=1 WHERE (T4.ProForLin = T5.GXC6) AND (T4.ProForLin < ?) AND (T4.EmprCod = ?) AND (T4.ProForCod = ?) ) T3 ON 1=1 ) T1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RW95", "SELECT COALESCE( PrdNum, 'xxxxxx') AS PrdFind FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RW98", "SELECT COALESCE( T1.PrdUMeFind, 0) AS PrdUMeFind FROM (SELECT CASE  WHEN ? <> 'xxxxxx' THEN COALESCE( T2.PrdUMeFo, 0) END AS PrdUMeFind FROM (SELECT PrdUMeFo, EmprCod, PrdNum FROM TXPPRODUC WHERE PrdNum = ? ) T2 WHERE T2.EmprCod = ? ) T1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RW99", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(ForPrdUMe,'90'), 2))) || '-' || RTRIM(LTRIM(COALESCE( ForPrdDsc, ''))) AS ForPrdCDsc, EmprCod, ForPrdUMe FROM TXPUNMEPR WHERE (EmprCod = ?) AND (ForPrdUMe = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RW100", "SELECT /*+ FIRST_ROWS */ RTRIM(LTRIM(SUBSTR(TO_CHAR(ForPrdUMe,'90'), 2))) || '-' || RTRIM(LTRIM(COALESCE( ForPrdDsc, ''))) AS ForPrdCDsc, EmprCod, ForPrdUMe FROM TXPUNMEPR WHERE (RTRIM(LTRIM(SUBSTR(TO_CHAR(ForPrdUMe,'90'), 2))) || '-' || RTRIM(LTRIM(COALESCE( ForPrdDsc, ''))) = ?) AND (EmprCod = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RW101", "SELECT ForPrdDsc FROM TXPUNMEPR WHERE EmprCod = ? AND ForPrdUMe = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               ((String[]) buf[4])[0] = rslt.getString(5, 26);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               ((String[]) buf[6])[0] = rslt.getString(7, 40);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,5);
               ((byte[]) buf[8])[0] = rslt.getByte(9);
               ((byte[]) buf[9])[0] = rslt.getByte(10);
               ((String[]) buf[10])[0] = rslt.getString(11, 16);
               ((String[]) buf[11])[0] = rslt.getString(12, 30);
               ((String[]) buf[12])[0] = rslt.getString(13, 3);
               ((byte[]) buf[13])[0] = rslt.getByte(14);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               ((String[]) buf[4])[0] = rslt.getString(5, 26);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               ((String[]) buf[6])[0] = rslt.getString(7, 40);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,5);
               ((byte[]) buf[8])[0] = rslt.getByte(9);
               ((byte[]) buf[9])[0] = rslt.getByte(10);
               ((String[]) buf[10])[0] = rslt.getString(11, 16);
               ((String[]) buf[11])[0] = rslt.getString(12, 30);
               ((String[]) buf[12])[0] = rslt.getString(13, 3);
               ((byte[]) buf[13])[0] = rslt.getByte(14);
               return;
            case 2 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 5);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((String[]) buf[3])[0] = rslt.getString(4, 40);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 16);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(8);
               ((short[]) buf[8])[0] = rslt.getShort(9);
               ((int[]) buf[9])[0] = rslt.getInt(10);
               ((int[]) buf[10])[0] = rslt.getInt(11);
               ((String[]) buf[11])[0] = rslt.getString(12, 1);
               ((short[]) buf[12])[0] = rslt.getShort(13);
               ((short[]) buf[13])[0] = rslt.getShort(14);
               ((String[]) buf[14])[0] = rslt.getString(15, 10);
               ((String[]) buf[15])[0] = rslt.getString(16, 16);
               ((String[]) buf[16])[0] = rslt.getString(17, 1);
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(18,2);
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(19,4);
               ((int[]) buf[19])[0] = rslt.getInt(20);
               ((short[]) buf[20])[0] = rslt.getShort(21);
               ((java.math.BigDecimal[]) buf[21])[0] = rslt.getBigDecimal(22,2);
               ((String[]) buf[22])[0] = rslt.getString(23, 1);
               ((String[]) buf[23])[0] = rslt.getString(24, 1);
               ((String[]) buf[24])[0] = rslt.getString(25, 3);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((String[]) buf[3])[0] = rslt.getString(4, 40);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 16);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(8);
               ((short[]) buf[8])[0] = rslt.getShort(9);
               ((int[]) buf[9])[0] = rslt.getInt(10);
               ((int[]) buf[10])[0] = rslt.getInt(11);
               ((String[]) buf[11])[0] = rslt.getString(12, 1);
               ((short[]) buf[12])[0] = rslt.getShort(13);
               ((short[]) buf[13])[0] = rslt.getShort(14);
               ((String[]) buf[14])[0] = rslt.getString(15, 10);
               ((String[]) buf[15])[0] = rslt.getString(16, 16);
               ((String[]) buf[16])[0] = rslt.getString(17, 1);
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(18,2);
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(19,4);
               ((int[]) buf[19])[0] = rslt.getInt(20);
               ((short[]) buf[20])[0] = rslt.getShort(21);
               ((java.math.BigDecimal[]) buf[21])[0] = rslt.getBigDecimal(22,2);
               ((String[]) buf[22])[0] = rslt.getString(23, 1);
               ((String[]) buf[23])[0] = rslt.getString(24, 1);
               ((String[]) buf[24])[0] = rslt.getString(25, 3);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 30);
               ((String[]) buf[5])[0] = rslt.getString(5, 40);
               ((short[]) buf[6])[0] = rslt.getShort(6);
               ((short[]) buf[7])[0] = rslt.getShort(7);
               ((String[]) buf[8])[0] = rslt.getString(8, 16);
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDate(9);
               ((short[]) buf[10])[0] = rslt.getShort(10);
               ((int[]) buf[11])[0] = rslt.getInt(11);
               ((int[]) buf[12])[0] = rslt.getInt(12);
               ((String[]) buf[13])[0] = rslt.getString(13, 1);
               ((short[]) buf[14])[0] = rslt.getShort(14);
               ((short[]) buf[15])[0] = rslt.getShort(15);
               ((String[]) buf[16])[0] = rslt.getString(16, 10);
               ((String[]) buf[17])[0] = rslt.getString(17, 16);
               ((String[]) buf[18])[0] = rslt.getString(18, 1);
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(19,2);
               ((java.math.BigDecimal[]) buf[20])[0] = rslt.getBigDecimal(20,4);
               ((int[]) buf[21])[0] = rslt.getInt(21);
               ((short[]) buf[22])[0] = rslt.getShort(22);
               ((java.math.BigDecimal[]) buf[23])[0] = rslt.getBigDecimal(23,2);
               ((String[]) buf[24])[0] = rslt.getString(24, 1);
               ((String[]) buf[25])[0] = rslt.getString(25, 1);
               ((String[]) buf[26])[0] = rslt.getString(26, 3);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 26 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               return;
            case 27 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 28 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               return;
            case 29 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
      }
      getresults30( cursor, rslt, buf) ;
   }

   public void getresults30( int cursor ,
                             IFieldGetter rslt ,
                             Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 30 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 31 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 32 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 33 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 34 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 35 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 36 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 37 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               return;
            case 38 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 39 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 40 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 41 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               return;
            case 42 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               ((String[]) buf[5])[0] = rslt.getString(6, 26);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               ((String[]) buf[7])[0] = rslt.getString(8, 40);
               ((String[]) buf[8])[0] = rslt.getString(9, 5);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(10,5);
               ((byte[]) buf[11])[0] = rslt.getByte(11);
               ((byte[]) buf[12])[0] = rslt.getByte(12);
               ((String[]) buf[13])[0] = rslt.getString(13, 16);
               ((String[]) buf[14])[0] = rslt.getString(14, 30);
               ((String[]) buf[15])[0] = rslt.getString(15, 3);
               ((byte[]) buf[16])[0] = rslt.getByte(16);
               ((String[]) buf[17])[0] = rslt.getString(17, 6);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               return;
            case 43 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 44 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 45 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 46 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 47 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 48 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 49 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 50 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 51 :
               ((String[]) buf[0])[0] = rslt.getString(1, 5);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 52 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 53 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 54 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 58 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 59 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
      }
      getresults60( cursor, rslt, buf) ;
   }

   public void getresults60( int cursor ,
                             IFieldGetter rslt ,
                             Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 60 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 61 :
               ((String[]) buf[0])[0] = rslt.getString(1, 5);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 62 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 63 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               return;
            case 64 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               return;
            case 65 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 66 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 67 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 68 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 69 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 70 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 71 :
               ((String[]) buf[0])[0] = rslt.getString(1, 5);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
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
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               stmt.setShort(3, ((Number) parms[3]).shortValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               stmt.setShort(3, ((Number) parms[3]).shortValue());
               return;
            case 2 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 6);
               }
               stmt.setString(2, (String)parms[2], 6);
               stmt.setString(3, (String)parms[3], 3);
               return;
            case 3 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setString(3, (String)parms[2], 6);
               stmt.setString(4, (String)parms[3], 3);
               stmt.setString(5, (String)parms[4], 6);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setString(7, (String)parms[6], 3);
               stmt.setString(8, (String)parms[7], 6);
               stmt.setShort(9, ((Number) parms[8]).shortValue());
               stmt.setString(10, (String)parms[9], 3);
               stmt.setString(11, (String)parms[10], 6);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[3], 6);
               }
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[3], 6);
               }
               return;
            case 14 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 6);
               }
               stmt.setString(2, (String)parms[2], 6);
               stmt.setString(3, (String)parms[3], 30);
               stmt.setString(4, (String)parms[4], 40);
               stmt.setShort(5, ((Number) parms[5]).shortValue());
               stmt.setShort(6, ((Number) parms[6]).shortValue());
               stmt.setString(7, (String)parms[7], 16);
               stmt.setDate(8, (java.util.Date)parms[8]);
               stmt.setShort(9, ((Number) parms[9]).shortValue());
               stmt.setInt(10, ((Number) parms[10]).intValue());
               stmt.setInt(11, ((Number) parms[11]).intValue());
               stmt.setString(12, (String)parms[12], 1);
               stmt.setShort(13, ((Number) parms[13]).shortValue());
               stmt.setShort(14, ((Number) parms[14]).shortValue());
               stmt.setString(15, (String)parms[15], 10);
               stmt.setString(16, (String)parms[16], 16);
               stmt.setString(17, (String)parms[17], 1);
               stmt.setBigDecimal(18, (java.math.BigDecimal)parms[18], 2);
               stmt.setBigDecimal(19, (java.math.BigDecimal)parms[19], 4);
               stmt.setInt(20, ((Number) parms[20]).intValue());
               stmt.setShort(21, ((Number) parms[21]).shortValue());
               stmt.setBigDecimal(22, (java.math.BigDecimal)parms[22], 2);
               stmt.setString(23, (String)parms[23], 1);
               stmt.setString(24, (String)parms[24], 1);
               stmt.setString(25, (String)parms[25], 3);
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 6);
               stmt.setString(2, (String)parms[1], 30);
               stmt.setString(3, (String)parms[2], 40);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setString(6, (String)parms[5], 16);
               stmt.setDate(7, (java.util.Date)parms[6]);
               stmt.setShort(8, ((Number) parms[7]).shortValue());
               stmt.setInt(9, ((Number) parms[8]).intValue());
               stmt.setInt(10, ((Number) parms[9]).intValue());
               stmt.setString(11, (String)parms[10], 1);
               stmt.setShort(12, ((Number) parms[11]).shortValue());
               stmt.setShort(13, ((Number) parms[12]).shortValue());
               stmt.setString(14, (String)parms[13], 10);
               stmt.setString(15, (String)parms[14], 16);
               stmt.setString(16, (String)parms[15], 1);
               stmt.setBigDecimal(17, (java.math.BigDecimal)parms[16], 2);
               stmt.setBigDecimal(18, (java.math.BigDecimal)parms[17], 4);
               stmt.setInt(19, ((Number) parms[18]).intValue());
               stmt.setShort(20, ((Number) parms[19]).shortValue());
               stmt.setBigDecimal(21, (java.math.BigDecimal)parms[20], 2);
               stmt.setString(22, (String)parms[21], 1);
               stmt.setString(23, (String)parms[22], 1);
               stmt.setString(24, (String)parms[23], 3);
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 25 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(25, (String)parms[25], 6);
               }
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 22 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 23 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 24 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 25 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 26 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 27 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 28 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 29 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
      }
      setparameters30( cursor, stmt, parms) ;
   }

   public void setparameters30( int cursor ,
                                IFieldSetter stmt ,
                                Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 30 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 31 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 32 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 33 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 34 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 35 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 36 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 37 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 38 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 39 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 40 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 42 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               stmt.setShort(3, ((Number) parms[3]).shortValue());
               return;
            case 43 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               return;
            case 44 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               return;
            case 45 :
               stmt.setVarchar(1, (String)parms[0], 60);
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 46 :
               stmt.setVarchar(1, (String)parms[0], 60);
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 47 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               return;
            case 48 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 49 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 6);
               }
               stmt.setString(2, (String)parms[2], 6);
               stmt.setString(3, (String)parms[3], 3);
               return;
            case 50 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setString(3, (String)parms[2], 6);
               stmt.setString(4, (String)parms[3], 3);
               stmt.setString(5, (String)parms[4], 6);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setString(7, (String)parms[6], 3);
               stmt.setString(8, (String)parms[7], 6);
               stmt.setShort(9, ((Number) parms[8]).shortValue());
               stmt.setString(10, (String)parms[9], 3);
               stmt.setString(11, (String)parms[10], 6);
               return;
            case 51 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               return;
            case 52 :
               stmt.setVarchar(1, (String)parms[0], 60);
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 53 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               stmt.setShort(3, ((Number) parms[3]).shortValue());
               return;
            case 54 :
               stmt.setVarchar(1, (String)parms[0], 60);
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 55 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 6);
               }
               stmt.setShort(2, ((Number) parms[2]).shortValue());
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[3], 2);
               stmt.setString(4, (String)parms[4], 6);
               stmt.setString(5, (String)parms[5], 26);
               stmt.setString(6, (String)parms[6], 6);
               stmt.setString(7, (String)parms[7], 40);
               stmt.setBigDecimal(8, (java.math.BigDecimal)parms[8], 5);
               stmt.setByte(9, ((Number) parms[9]).byteValue());
               stmt.setByte(10, ((Number) parms[10]).byteValue());
               stmt.setString(11, (String)parms[11], 16);
               stmt.setString(12, (String)parms[12], 30);
               stmt.setString(13, (String)parms[13], 3);
               stmt.setByte(14, ((Number) parms[14]).byteValue());
               return;
            case 56 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setString(3, (String)parms[2], 26);
               stmt.setString(4, (String)parms[3], 6);
               stmt.setString(5, (String)parms[4], 40);
               stmt.setBigDecimal(6, (java.math.BigDecimal)parms[5], 5);
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               stmt.setByte(8, ((Number) parms[7]).byteValue());
               stmt.setString(9, (String)parms[8], 16);
               stmt.setString(10, (String)parms[9], 30);
               stmt.setByte(11, ((Number) parms[10]).byteValue());
               stmt.setString(12, (String)parms[11], 3);
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(13, (String)parms[13], 6);
               }
               stmt.setShort(14, ((Number) parms[14]).shortValue());
               return;
            case 57 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               stmt.setShort(3, ((Number) parms[3]).shortValue());
               return;
            case 58 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setString(3, (String)parms[2], 6);
               stmt.setString(4, (String)parms[3], 3);
               stmt.setString(5, (String)parms[4], 6);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setString(7, (String)parms[6], 3);
               stmt.setString(8, (String)parms[7], 6);
               stmt.setShort(9, ((Number) parms[8]).shortValue());
               stmt.setString(10, (String)parms[9], 3);
               stmt.setString(11, (String)parms[10], 6);
               return;
            case 59 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
      }
      setparameters60( cursor, stmt, parms) ;
   }

   public void setparameters60( int cursor ,
                                IFieldSetter stmt ,
                                Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 60 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 6);
               }
               stmt.setString(2, (String)parms[2], 6);
               stmt.setString(3, (String)parms[3], 3);
               return;
            case 61 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               return;
            case 62 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 63 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 64 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setVarchar(2, (String)parms[1], 60);
               return;
            case 65 :
               stmt.setVarchar(1, (String)parms[0], 60);
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 66 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setString(3, (String)parms[2], 6);
               stmt.setString(4, (String)parms[3], 3);
               stmt.setString(5, (String)parms[4], 6);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setString(7, (String)parms[6], 3);
               stmt.setString(8, (String)parms[7], 6);
               stmt.setShort(9, ((Number) parms[8]).shortValue());
               stmt.setString(10, (String)parms[9], 3);
               stmt.setString(11, (String)parms[10], 6);
               return;
            case 67 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 68 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 6);
               }
               stmt.setString(2, (String)parms[2], 6);
               stmt.setString(3, (String)parms[3], 3);
               return;
            case 69 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               return;
            case 70 :
               stmt.setVarchar(1, (String)parms[0], 60);
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 71 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               return;
      }
   }

}

