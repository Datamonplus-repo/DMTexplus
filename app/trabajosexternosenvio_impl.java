package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class trabajosexternosenvio_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action29") == 0 )
      {
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_29_1PS305( ) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action30") == 0 )
      {
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_30_1PS305( ) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action52") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A129BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
         A132BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
         A130BarCodPar = httpContext.GetPar( "BarCodPar") ;
         A654OrdLin = (short)(GXutil.lval( httpContext.GetPar( "OrdLin"))) ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_52_1PS910( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, A654OrdLin) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action53") == 0 )
      {
         Gx_mode = httpContext.GetPar( "Mode") ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A2248ManCod = (short)(GXutil.lval( httpContext.GetPar( "ManCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2248ManCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2248ManCod), 4, 0));
         A2253SalExtAlb = (int)(GXutil.lval( httpContext.GetPar( "SalExtAlb"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2253SalExtAlb", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2253SalExtAlb), 8, 0));
         A6248SalExNln = (short)(GXutil.lval( httpContext.GetPar( "SalExNln"))) ;
         A2256SalExtFec = localUtil.parseDateParm( httpContext.GetPar( "SalExtFec")) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2256SalExtFec", localUtil.format(A2256SalExtFec, "99/99/99"));
         A129BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
         A132BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
         A130BarCodPar = httpContext.GetPar( "BarCodPar") ;
         A654OrdLin = (short)(GXutil.lval( httpContext.GetPar( "OrdLin"))) ;
         A6558FasCodn = httpContext.GetPar( "FasCodn") ;
         A6256SalExKgE = CommonUtil.decimalVal( httpContext.GetPar( "SalExKgE"), ".") ;
         A6258SalExMtE = CommonUtil.decimalVal( httpContext.GetPar( "SalExMtE"), ".") ;
         A6257SalExCoE = (int)(GXutil.lval( httpContext.GetPar( "SalExCoE"))) ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_53_1PS910( Gx_mode, A396EmprCod, A2248ManCod, A2253SalExtAlb, A6248SalExNln, A2256SalExtFec, A129BarCod, A132BarCodReo, A130BarCodPar, A654OrdLin, A6558FasCodn, A6256SalExKgE, A6258SalExMtE, A6257SalExCoE) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action54") == 0 )
      {
         Gx_mode = httpContext.GetPar( "Mode") ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A2248ManCod = (short)(GXutil.lval( httpContext.GetPar( "ManCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2248ManCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2248ManCod), 4, 0));
         A2253SalExtAlb = (int)(GXutil.lval( httpContext.GetPar( "SalExtAlb"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2253SalExtAlb", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2253SalExtAlb), 8, 0));
         A6248SalExNln = (short)(GXutil.lval( httpContext.GetPar( "SalExNln"))) ;
         A2256SalExtFec = localUtil.parseDateParm( httpContext.GetPar( "SalExtFec")) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2256SalExtFec", localUtil.format(A2256SalExtFec, "99/99/99"));
         A129BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
         A132BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
         A130BarCodPar = httpContext.GetPar( "BarCodPar") ;
         A654OrdLin = (short)(GXutil.lval( httpContext.GetPar( "OrdLin"))) ;
         A6558FasCodn = httpContext.GetPar( "FasCodn") ;
         A6256SalExKgE = CommonUtil.decimalVal( httpContext.GetPar( "SalExKgE"), ".") ;
         A6258SalExMtE = CommonUtil.decimalVal( httpContext.GetPar( "SalExMtE"), ".") ;
         A6257SalExCoE = (int)(GXutil.lval( httpContext.GetPar( "SalExCoE"))) ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_54_1PS910( Gx_mode, A396EmprCod, A2248ManCod, A2253SalExtAlb, A6248SalExNln, A2256SalExtFec, A129BarCod, A132BarCodReo, A130BarCodPar, A654OrdLin, A6558FasCodn, A6256SalExKgE, A6258SalExMtE, A6257SalExCoE) ;
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
         xc_55_1PS910( ) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action56") == 0 )
      {
         Gx_mode = httpContext.GetPar( "Mode") ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A129BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
         A132BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
         A130BarCodPar = httpContext.GetPar( "BarCodPar") ;
         A6558FasCodn = httpContext.GetPar( "FasCodn") ;
         AV23Msg_err = httpContext.GetPar( "Msg_err") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV23Msg_err", AV23Msg_err);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_56_1PS910( Gx_mode, A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, A6558FasCodn, AV23Msg_err) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"MANCOD") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A13847ManNomID = httpContext.GetPar( "ManNomID") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxsgamancod1PS0( A396EmprCod, A13847ManNomID) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"TRNCOD") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A13738TrnCNom = httpContext.GetPar( "TrnCNom") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxsgatrncod1PS0( A396EmprCod, A13738TrnCNom) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"MANCOD") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A13847ManNomID = httpContext.GetPar( "ManNomID") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxsgamancod1PS0( A396EmprCod, A13847ManNomID) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxHideCode"+"_"+"MANCOD") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         h2248ManCod = httpContext.GetPar( "h2248ManCod") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxhcamancod1PS305( A396EmprCod, h2248ManCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"TRNCOD") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A13738TrnCNom = httpContext.GetPar( "TrnCNom") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxsgatrncod1PS0( A396EmprCod, A13738TrnCNom) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxHideCode"+"_"+"TRNCOD") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         h840TrnCod = httpContext.GetPar( "h840TrnCod") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxhcatrncod1PS305( A396EmprCod, h840TrnCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel12"+"_"+"") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxasa132441PS305( A396EmprCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel13"+"_"+"") == 0 )
      {
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel14"+"_"+"SALEXTHOR") == 0 )
      {
         A2256SalExtFec = localUtil.parseDateParm( httpContext.GetPar( "SalExtFec")) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2256SalExtFec", localUtil.format(A2256SalExtFec, "99/99/99"));
         Gx_mode = httpContext.GetPar( "Mode") ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx14asasalexthor1PS305( A2256SalExtFec, Gx_mode, A396EmprCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel40"+"_"+"SALEXKGE") == 0 )
      {
         Gx_mode = httpContext.GetPar( "Mode") ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A129BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
         A132BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
         A130BarCodPar = httpContext.GetPar( "BarCodPar") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx40asasalexkge1PS910( Gx_mode, A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel41"+"_"+"SALEXMTE") == 0 )
      {
         Gx_mode = httpContext.GetPar( "Mode") ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A129BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
         A132BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
         A130BarCodPar = httpContext.GetPar( "BarCodPar") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx41asasalexmte1PS910( Gx_mode, A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel42"+"_"+"SALEXCOE") == 0 )
      {
         Gx_mode = httpContext.GetPar( "Mode") ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A129BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
         A132BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
         A130BarCodPar = httpContext.GetPar( "BarCodPar") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx42asasalexcoe1PS910( Gx_mode, A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_65") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A840TrnCod = (short)(GXutil.lval( httpContext.GetPar( "TrnCod"))) ;
         n840TrnCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_65( A396EmprCod, A840TrnCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_66") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A2248ManCod = (short)(GXutil.lval( httpContext.GetPar( "ManCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2248ManCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2248ManCod), 4, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_66( A396EmprCod, A2248ManCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_68") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A6558FasCodn = httpContext.GetPar( "FasCodn") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_68( A396EmprCod, A6558FasCodn) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_69") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A129BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
         A132BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
         A130BarCodPar = httpContext.GetPar( "BarCodPar") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_69( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar) ;
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Gridlevel_level1") == 0 )
      {
         gxnrgridlevel_level1_newrow_invoke( ) ;
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
            AV7EmprCod = httpContext.GetPar( "EmprCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV7EmprCod", AV7EmprCod);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV7EmprCod, "@!"))));
            AV8SalExtAlb = (int)(GXutil.lval( httpContext.GetPar( "SalExtAlb"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV8SalExtAlb", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8SalExtAlb), 8, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSALEXTALB", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV8SalExtAlb), "ZZZZZZZ9")));
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Trabajos Externos (Envio)", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtSalExtFec_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      wbErr = false ;
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public void gxnrgridlevel_level1_newrow_invoke( )
   {
      nRC_GXsfl_84 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_84"))) ;
      nGXsfl_84_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_84_idx"))) ;
      sGXsfl_84_idx = httpContext.GetPar( "sGXsfl_84_idx") ;
      AV32imgPrompt = httpContext.GetPar( "imgPrompt") ;
      A6247SalExUln = (short)(GXutil.lval( httpContext.GetPar( "SalExUln"))) ;
      Gx_BScreen = (byte)(GXutil.lval( httpContext.GetPar( "Gx_BScreen"))) ;
      Gx_mode = httpContext.GetPar( "Mode") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxnrgridlevel_level1_newrow( ) ;
      /* End function gxnrGridlevel_level1_newrow_invoke */
   }

   public trabajosexternosenvio_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public trabajosexternosenvio_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( trabajosexternosenvio_impl.class ));
   }

   public trabajosexternosenvio_impl( int remoteHandle ,
                                      ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-9 col-md-12", "left", "top", "", "", "div");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtSalExtAlb_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtSalExtAlb_Internalname, httpContext.getMessage( "Nº Documento", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtSalExtAlb_Internalname, GXutil.ltrim( localUtil.ntoc( A2253SalExtAlb, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A2253SalExtAlb), "ZZZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,25);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSalExtAlb_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtSalExtAlb_Enabled, 1, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TrabajosExternosEnvio.htm");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtSalExtFec_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtSalExtFec_Internalname, httpContext.getMessage( "Fecha", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 33,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtSalExtFec_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtSalExtFec_Internalname, localUtil.format(A2256SalExtFec, "99/99/99"), localUtil.format( A2256SalExtFec, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,33);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSalExtFec_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtSalExtFec_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TrabajosExternosEnvio.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtSalExtFec_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtSalExtFec_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TrabajosExternosEnvio.htm");
      httpContext.writeTextNL( "</div>") ;
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtSalExtHor_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtSalExtHor_Internalname, httpContext.getMessage( "Hora", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 37,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtSalExtHor_Internalname, GXutil.rtrim( A6396SalExtHor), GXutil.rtrim( localUtil.format( A6396SalExtHor, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,37);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSalExtHor_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtSalExtHor_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TrabajosExternosEnvio.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtSalFecEnt_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtSalFecEnt_Internalname, httpContext.getMessage( "Fecha Entrega", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtSalFecEnt_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtSalFecEnt_Internalname, localUtil.format(A8655SalFecEnt, "99/99/99"), localUtil.format( A8655SalFecEnt, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,41);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSalFecEnt_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtSalFecEnt_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TrabajosExternosEnvio.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtSalFecEnt_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtSalFecEnt_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TrabajosExternosEnvio.htm");
      httpContext.writeTextNL( "</div>") ;
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtSalExtUsu_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtSalExtUsu_Internalname, httpContext.getMessage( "Usuario", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtSalExtUsu_Internalname, GXutil.rtrim( A7368SalExtUsu), GXutil.rtrim( localUtil.format( A7368SalExtUsu, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSalExtUsu_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtSalExtUsu_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TrabajosExternosEnvio.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtSalSts_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtSalSts_Internalname, httpContext.getMessage( "Estado", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtSalSts_Internalname, GXutil.rtrim( A10080SalSts), GXutil.rtrim( localUtil.format( A10080SalSts, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSalSts_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtSalSts_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TrabajosExternosEnvio.htm");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtManCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtManCod_Internalname, httpContext.getMessage( "Codigo Manufacturador", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 57,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtManCod_Internalname, h2248ManCod, GXutil.rtrim( localUtil.format( h2248ManCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,57);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtManCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtManCod_Enabled, 1, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(0), (byte)(0), (byte)(0), true, "", "left", true, "", "HLP_TrabajosExternosEnvio.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divSalextpre1_cell_Internalname, 1, 0, "px", 0, "px", divSalextpre1_cell_Class, "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", edtSalExtPre1_Visible, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtSalExtPre1_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtSalExtPre1_Internalname, httpContext.getMessage( "Precio", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtSalExtPre1_Internalname, GXutil.ltrim( localUtil.ntoc( A13244SalExtPre1, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtSalExtPre1_Enabled!=0) ? localUtil.format( A13244SalExtPre1, "ZZZZZZ9.99999") : localUtil.format( A13244SalExtPre1, "ZZZZZZ9.99999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,61);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSalExtPre1_Jsonclick, 0, "AttributeFL", "", "", "", "", edtSalExtPre1_Visible, edtSalExtPre1_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TrabajosExternosEnvio.htm");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtTrnCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtTrnCod_Internalname, httpContext.getMessage( "Codigo Transportista", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 69,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtTrnCod_Internalname, h840TrnCod, GXutil.rtrim( localUtil.format( h840TrnCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,69);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", httpContext.getMessage( "Codigo Transportista", ""), "", edtTrnCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtTrnCod_Enabled, 1, "text", "", 60, "chr", 1, "row", 60, (byte)(0), (short)(0), 0, (byte)(0), (byte)(0), (byte)(0), true, "", "left", true, "", "HLP_TrabajosExternosEnvio.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtSalExtMat_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtSalExtMat_Internalname, httpContext.getMessage( "Matricula", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 73,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtSalExtMat_Internalname, GXutil.rtrim( A6397SalExtMat), GXutil.rtrim( localUtil.format( A6397SalExtMat, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,73);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSalExtMat_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtSalExtMat_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TrabajosExternosEnvio.htm");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtSalExtObs_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtSalExtObs_Internalname, httpContext.getMessage( "Observaciones", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Multiple line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 78,'',false,'',0)\"" ;
      ClassString = "AttributeFL" ;
      StyleString = "" ;
      ClassString = "AttributeFL" ;
      StyleString = "" ;
      app.GxWebStd.gx_html_textarea( httpContext, edtSalExtObs_Internalname, A3554SalExtObs, "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,78);\"", (short)(0), 1, edtSalExtObs_Enabled, 0, 80, "chr", 10, "row", (byte)(0), StyleString, ClassString, "", "", "9999", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_TrabajosExternosEnvio.htm");
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
      app.GxWebStd.gx_div_start( httpContext, divTableleaflevel_level1_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 SectionGrid EditableGridCell_LinedAtts", "left", "top", "", "", "div");
      gxdraw_gridlevel_level1( ) ;
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 110,'',false,'',0)\"" ;
      ClassString = "ButtonMaterial" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtntrn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtntrn_enter_Visible, bttBtntrn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TrabajosExternosEnvio.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 112,'',false,'',0)\"" ;
      ClassString = "Button" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtneliminarlinea_Internalname, "", httpContext.getMessage( "Eliminar Linea", ""), bttBtneliminarlinea_Jsonclick, 7, httpContext.getMessage( "Eliminar Linea", ""), "", StyleString, ClassString, bttBtneliminarlinea_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"e111ps305_client"+"'", TempTags, "", 2, "HLP_TrabajosExternosEnvio.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 114,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtntrn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtntrn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TrabajosExternosEnvio.htm");
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
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 118,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtSalExtEst_Internalname, GXutil.ltrim( localUtil.ntoc( A2257SalExtEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtSalExtEst_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A2257SalExtEst), "9") : localUtil.format( DecimalUtil.doubleToDec(A2257SalExtEst), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,118);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSalExtEst_Jsonclick, 0, "Attribute", "", "", "", "", edtSalExtEst_Visible, edtSalExtEst_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TrabajosExternosEnvio.htm");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 119,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtSalExtLis_Internalname, GXutil.ltrim( localUtil.ntoc( A2258SalExtLis, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtSalExtLis_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A2258SalExtLis), "9") : localUtil.format( DecimalUtil.doubleToDec(A2258SalExtLis), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,119);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSalExtLis_Jsonclick, 0, "Attribute", "", "", "", "", edtSalExtLis_Visible, edtSalExtLis_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TrabajosExternosEnvio.htm");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 120,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtSalExtSec_Internalname, GXutil.rtrim( A2254SalExtSec), GXutil.rtrim( localUtil.format( A2254SalExtSec, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,120);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSalExtSec_Jsonclick, 0, "Attribute", "", "", "", "", edtSalExtSec_Visible, edtSalExtSec_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TrabajosExternosEnvio.htm");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtSalExUln_Internalname, GXutil.ltrim( localUtil.ntoc( A6247SalExUln, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtSalExUln_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A6247SalExUln), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A6247SalExUln), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSalExUln_Jsonclick, 0, "Attribute", "", "", "", "", edtSalExUln_Visible, edtSalExUln_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TrabajosExternosEnvio.htm");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 122,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtSalExtAT_Internalname, GXutil.rtrim( A10767SalExtAT), GXutil.rtrim( localUtil.format( A10767SalExtAT, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,122);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSalExtAT_Jsonclick, 0, "Attribute", "", "", "", "", edtSalExtAT_Visible, edtSalExtAT_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TrabajosExternosEnvio.htm");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 123,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtSalCodeID_Internalname, GXutil.rtrim( A10742SalCodeID), GXutil.rtrim( localUtil.format( A10742SalCodeID, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,123);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSalCodeID_Jsonclick, 0, "Attribute", "", "", "", "", edtSalCodeID_Visible, edtSalCodeID_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TrabajosExternosEnvio.htm");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 124,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtSalEnvAT_Internalname, GXutil.ltrim( localUtil.ntoc( A10741SalEnvAT, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtSalEnvAT_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A10741SalEnvAT), "9") : localUtil.format( DecimalUtil.doubleToDec(A10741SalEnvAT), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,124);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSalEnvAT_Jsonclick, 0, "Attribute", "", "", "", "", edtSalEnvAT_Visible, edtSalEnvAT_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TrabajosExternosEnvio.htm");
      /* Multiple line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 125,'',false,'',0)\"" ;
      ClassString = "Attribute" ;
      StyleString = "" ;
      ClassString = "Attribute" ;
      StyleString = "" ;
      app.GxWebStd.gx_html_textarea( httpContext, edtSalFmdD_Internalname, GXutil.rtrim( A10079SalFmdD), "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,125);\"", (short)(0), edtSalFmdD_Visible, edtSalFmdD_Enabled, 0, 80, "chr", 4, "row", (byte)(0), StyleString, ClassString, "", "", "300", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_TrabajosExternosEnvio.htm");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 126,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtSalGrossT_Internalname, GXutil.ltrim( localUtil.ntoc( A10078SalGrossT, (byte)(13), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtSalGrossT_Enabled!=0) ? localUtil.format( A10078SalGrossT, "ZZZZZZZZZ9.99") : localUtil.format( A10078SalGrossT, "ZZZZZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,126);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSalGrossT_Jsonclick, 0, "Attribute", "", "", "", "", edtSalGrossT_Visible, edtSalGrossT_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TrabajosExternosEnvio.htm");
      /* Multiple line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 127,'',false,'',0)\"" ;
      ClassString = "Attribute" ;
      StyleString = "" ;
      ClassString = "Attribute" ;
      StyleString = "" ;
      app.GxWebStd.gx_html_textarea( httpContext, edtSalFmd_Internalname, GXutil.rtrim( A10077SalFmd), "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,127);\"", (short)(0), edtSalFmd_Visible, edtSalFmd_Enabled, 0, 80, "chr", 3, "row", (byte)(0), StyleString, ClassString, "", "", "200", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_TrabajosExternosEnvio.htm");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 128,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtSalFhh_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtSalFhh_Internalname, localUtil.ttoc( A10076SalFhh, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.format( A10076SalFhh, "99/99/99 99:99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,128);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSalFhh_Jsonclick, 0, "Attribute", "", "", "", "", edtSalFhh_Visible, edtSalFhh_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TrabajosExternosEnvio.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtSalFhh_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((edtSalFhh_Visible==0)||(edtSalFhh_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TrabajosExternosEnvio.htm");
      httpContext.writeTextNL( "</div>") ;
      /* Table start */
      sStyleString = "" ;
      app.GxWebStd.gx_table_start( httpContext, tblTabledvelop_confirmpanel_eliminarlinea_Internalname, tblTabledvelop_confirmpanel_eliminarlinea_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", "", 0);
      httpContext.writeText( "<tbody>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td data-align=\"center\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-center;text-align:-moz-center;text-align:-webkit-center")+"\">") ;
      /* User Defined Control */
      ucDvelop_confirmpanel_eliminarlinea.setProperty("Title", Dvelop_confirmpanel_eliminarlinea_Title);
      ucDvelop_confirmpanel_eliminarlinea.setProperty("ConfirmationText", Dvelop_confirmpanel_eliminarlinea_Confirmationtext);
      ucDvelop_confirmpanel_eliminarlinea.setProperty("YesButtonCaption", Dvelop_confirmpanel_eliminarlinea_Yesbuttoncaption);
      ucDvelop_confirmpanel_eliminarlinea.setProperty("NoButtonCaption", Dvelop_confirmpanel_eliminarlinea_Nobuttoncaption);
      ucDvelop_confirmpanel_eliminarlinea.setProperty("CancelButtonCaption", Dvelop_confirmpanel_eliminarlinea_Cancelbuttoncaption);
      ucDvelop_confirmpanel_eliminarlinea.setProperty("YesButtonPosition", Dvelop_confirmpanel_eliminarlinea_Yesbuttonposition);
      ucDvelop_confirmpanel_eliminarlinea.setProperty("ConfirmType", Dvelop_confirmpanel_eliminarlinea_Confirmtype);
      ucDvelop_confirmpanel_eliminarlinea.render(context, "dvelop.gxbootstrap.confirmpanel", Dvelop_confirmpanel_eliminarlinea_Internalname, "DVELOP_CONFIRMPANEL_ELIMINARLINEAContainer");
      httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVELOP_CONFIRMPANEL_ELIMINARLINEAContainer"+"Body"+"\" style=\"display:none;\">") ;
      httpContext.writeText( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "</tbody>") ;
      /* End of table */
      httpContext.writeText( "</table>") ;
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
   }

   public void gxdraw_gridlevel_level1( )
   {
      /*  Grid Control  */
      startgridcontrol84( ) ;
      nGXsfl_84_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount910 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_910 = (short)(1) ;
            scanStart1PS910( ) ;
            while ( RcdFound910 != 0 )
            {
               init_level_properties910( ) ;
               getByPrimaryKey1PS910( ) ;
               addRow1PS910( ) ;
               scanNext1PS910( ) ;
            }
            scanEnd1PS910( ) ;
            nBlankRcdCount910 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         B6247SalExUln = A6247SalExUln ;
         httpContext.ajax_rsp_assign_attri("", false, "A6247SalExUln", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6247SalExUln), 4, 0));
         standaloneNotModal1PS910( ) ;
         standaloneModal1PS910( ) ;
         sMode910 = Gx_mode ;
         while ( nGXsfl_84_idx < nRC_GXsfl_84 )
         {
            bGXsfl_84_Refreshing = true ;
            readRow1PS910( ) ;
            edtSalExNln_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "SALEXNLN_"+sGXsfl_84_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtSalExNln_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSalExNln_Enabled), 5, 0), !bGXsfl_84_Refreshing);
            edtBarCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARCOD_"+sGXsfl_84_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCod_Enabled), 5, 0), !bGXsfl_84_Refreshing);
            edtBarCodReo_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARCODREO_"+sGXsfl_84_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarCodReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodReo_Enabled), 5, 0), !bGXsfl_84_Refreshing);
            edtBarCodPar_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARCODPAR_"+sGXsfl_84_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarCodPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodPar_Enabled), 5, 0), !bGXsfl_84_Refreshing);
            edtCliCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CLICOD_"+sGXsfl_84_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), !bGXsfl_84_Refreshing);
            edtBarSer_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARSER_"+sGXsfl_84_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarSer_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarSer_Enabled), 5, 0), !bGXsfl_84_Refreshing);
            edtBarSerDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARSERDSC_"+sGXsfl_84_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarSerDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarSerDsc_Enabled), 5, 0), !bGXsfl_84_Refreshing);
            edtBarColNom_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARCOLNOM_"+sGXsfl_84_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarColNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarColNom_Enabled), 5, 0), !bGXsfl_84_Refreshing);
            edtBarColNum_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARCOLNUM_"+sGXsfl_84_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarColNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarColNum_Enabled), 5, 0), !bGXsfl_84_Refreshing);
            edtBarNomCli_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARNOMCLI_"+sGXsfl_84_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarNomCli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarNomCli_Enabled), 5, 0), !bGXsfl_84_Refreshing);
            edtFasCodn_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FASCODN_"+sGXsfl_84_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtFasCodn_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasCodn_Enabled), 5, 0), !bGXsfl_84_Refreshing);
            edtavImgprompt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vIMGPROMPT_"+sGXsfl_84_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavImgprompt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavImgprompt_Enabled), 5, 0), !bGXsfl_84_Refreshing);
            edtavImgprompt_Link = httpContext.cgiGet( "vIMGPROMPT_"+sGXsfl_84_idx+"Link") ;
            httpContext.ajax_rsp_assign_prop("", false, edtavImgprompt_Internalname, "Link", edtavImgprompt_Link, !bGXsfl_84_Refreshing);
            edtavImgprompt_Visible = (int)(localUtil.ctol( httpContext.cgiGet( "vIMGPROMPT_"+sGXsfl_84_idx+"Visible"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavImgprompt_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavImgprompt_Visible), 5, 0), !bGXsfl_84_Refreshing);
            edtOrdLin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ORDLIN_"+sGXsfl_84_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtOrdLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOrdLin_Enabled), 5, 0), !bGXsfl_84_Refreshing);
            edtSalExCoE_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "SALEXCOE_"+sGXsfl_84_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtSalExCoE_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSalExCoE_Enabled), 5, 0), !bGXsfl_84_Refreshing);
            edtSalExKgE_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "SALEXKGE_"+sGXsfl_84_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtSalExKgE_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSalExKgE_Enabled), 5, 0), !bGXsfl_84_Refreshing);
            edtSalExMtE_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "SALEXMTE_"+sGXsfl_84_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtSalExMtE_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSalExMtE_Enabled), 5, 0), !bGXsfl_84_Refreshing);
            edtBarSit_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARSIT_"+sGXsfl_84_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarSit_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarSit_Enabled), 5, 0), !bGXsfl_84_Refreshing);
            edtMetrosRece_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "METROSRECE_"+sGXsfl_84_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMetrosRece_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetrosRece_Enabled), 5, 0), !bGXsfl_84_Refreshing);
            edtKilosRecep_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "KILOSRECEP_"+sGXsfl_84_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtKilosRecep_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtKilosRecep_Enabled), 5, 0), !bGXsfl_84_Refreshing);
            edtPiezasRece_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PIEZASRECE_"+sGXsfl_84_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPiezasRece_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPiezasRece_Enabled), 5, 0), !bGXsfl_84_Refreshing);
            edtBarExt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BAREXT_"+sGXsfl_84_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarExt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarExt_Enabled), 5, 0), !bGXsfl_84_Refreshing);
            if ( ( nRcdExists_910 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal1PS910( ) ;
            }
            sendRow1PS910( ) ;
            bGXsfl_84_Refreshing = false ;
         }
         Gx_mode = sMode910 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A6247SalExUln = B6247SalExUln ;
         httpContext.ajax_rsp_assign_attri("", false, "A6247SalExUln", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6247SalExUln), 4, 0));
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount910 = (short)(5) ;
         nRcdExists_910 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart1PS910( ) ;
            while ( RcdFound910 != 0 )
            {
               sGXsfl_84_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_84_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_84910( ) ;
               init_level_properties910( ) ;
               standaloneNotModal1PS910( ) ;
               getByPrimaryKey1PS910( ) ;
               standaloneModal1PS910( ) ;
               addRow1PS910( ) ;
               scanNext1PS910( ) ;
            }
            scanEnd1PS910( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      if ( ! isDsp( ) && ! isDlt( ) )
      {
         sMode910 = Gx_mode ;
         Gx_mode = "INS" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         sGXsfl_84_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_84_idx+1), 4, 0), (short)(4), "0") ;
         subsflControlProps_84910( ) ;
         initAll1PS910( ) ;
         init_level_properties910( ) ;
         B6247SalExUln = A6247SalExUln ;
         httpContext.ajax_rsp_assign_attri("", false, "A6247SalExUln", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6247SalExUln), 4, 0));
         nRcdExists_910 = (short)(0) ;
         nIsMod_910 = (short)(0) ;
         nRcdDeleted_910 = (short)(0) ;
         nBlankRcdCount910 = (short)(nBlankRcdUsr910+nBlankRcdCount910) ;
         fRowAdded = 0 ;
         while ( nBlankRcdCount910 > 0 )
         {
            standaloneNotModal1PS910( ) ;
            standaloneModal1PS910( ) ;
            addRow1PS910( ) ;
            if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
            {
               fRowAdded = 1 ;
               GX_FocusControl = edtSalExNln_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            nBlankRcdCount910 = (short)(nBlankRcdCount910-1) ;
         }
         Gx_mode = sMode910 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A6247SalExUln = B6247SalExUln ;
         httpContext.ajax_rsp_assign_attri("", false, "A6247SalExUln", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6247SalExUln), 4, 0));
      }
      sStyleString = "" ;
      httpContext.writeText( "<div id=\""+"Gridlevel_level1Container"+"Div\" "+sStyleString+">"+"</div>") ;
      httpContext.ajax_rsp_assign_grid("_"+"Gridlevel_level1", Gridlevel_level1Container, subGridlevel_level1_Internalname);
      if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Gridlevel_level1ContainerData", Gridlevel_level1Container.ToJavascriptSource());
      }
      if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Gridlevel_level1ContainerData"+"V", Gridlevel_level1Container.GridValuesHidden());
      }
      else
      {
         httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"Gridlevel_level1ContainerData"+"V"+"\" value='"+Gridlevel_level1Container.GridValuesHidden()+"'/>") ;
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
      e121PS2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z2253SalExtAlb = (int)(localUtil.ctol( httpContext.cgiGet( "Z2253SalExtAlb"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z6396SalExtHor = httpContext.cgiGet( "Z6396SalExtHor") ;
            Z2256SalExtFec = localUtil.ctod( httpContext.cgiGet( "Z2256SalExtFec"), 0) ;
            Z2257SalExtEst = (byte)(localUtil.ctol( httpContext.cgiGet( "Z2257SalExtEst"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z2258SalExtLis = (byte)(localUtil.ctol( httpContext.cgiGet( "Z2258SalExtLis"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z2254SalExtSec = httpContext.cgiGet( "Z2254SalExtSec") ;
            Z6247SalExUln = (short)(localUtil.ctol( httpContext.cgiGet( "Z6247SalExUln"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z6397SalExtMat = httpContext.cgiGet( "Z6397SalExtMat") ;
            Z7368SalExtUsu = httpContext.cgiGet( "Z7368SalExtUsu") ;
            Z7369SalExtRec = (int)(localUtil.ctol( httpContext.cgiGet( "Z7369SalExtRec"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z8655SalFecEnt = localUtil.ctod( httpContext.cgiGet( "Z8655SalFecEnt"), 0) ;
            Z11299SalExtFen = localUtil.ctod( httpContext.cgiGet( "Z11299SalExtFen"), 0) ;
            Z10767SalExtAT = httpContext.cgiGet( "Z10767SalExtAT") ;
            Z10742SalCodeID = httpContext.cgiGet( "Z10742SalCodeID") ;
            Z10741SalEnvAT = (byte)(localUtil.ctol( httpContext.cgiGet( "Z10741SalEnvAT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z10080SalSts = httpContext.cgiGet( "Z10080SalSts") ;
            Z10079SalFmdD = httpContext.cgiGet( "Z10079SalFmdD") ;
            Z10078SalGrossT = localUtil.ctond( httpContext.cgiGet( "Z10078SalGrossT")) ;
            Z10077SalFmd = httpContext.cgiGet( "Z10077SalFmd") ;
            Z10076SalFhh = localUtil.ctot( httpContext.cgiGet( "Z10076SalFhh"), 0) ;
            Z13244SalExtPre1 = localUtil.ctond( httpContext.cgiGet( "Z13244SalExtPre1")) ;
            Z840TrnCod = (short)(localUtil.ctol( httpContext.cgiGet( "Z840TrnCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z2248ManCod = (short)(localUtil.ctol( httpContext.cgiGet( "Z2248ManCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A7369SalExtRec = (int)(localUtil.ctol( httpContext.cgiGet( "Z7369SalExtRec"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A11299SalExtFen = localUtil.ctod( httpContext.cgiGet( "Z11299SalExtFen"), 0) ;
            O6247SalExUln = (short)(localUtil.ctol( httpContext.cgiGet( "O6247SalExUln"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_84 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_84"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            N2248ManCod = (short)(localUtil.ctol( httpContext.cgiGet( "N2248ManCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            N840TrnCod = (short)(localUtil.ctol( httpContext.cgiGet( "N840TrnCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV7EmprCod = httpContext.cgiGet( "vEMPRCOD") ;
            A396EmprCod = httpContext.cgiGet( "EMPRCOD") ;
            AV8SalExtAlb = (int)(localUtil.ctol( httpContext.cgiGet( "vSALEXTALB"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV12Insert_ManCod = (short)(localUtil.ctol( httpContext.cgiGet( "vINSERT_MANCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A2248ManCod = (short)(localUtil.ctol( httpContext.cgiGet( "GXHCMANCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV13Insert_TrnCod = (short)(localUtil.ctol( httpContext.cgiGet( "vINSERT_TRNCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A840TrnCod = (short)(localUtil.ctol( httpContext.cgiGet( "GXHCTRNCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_BScreen = (byte)(localUtil.ctol( httpContext.cgiGet( "vGXBSCREEN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV17UsurCod = httpContext.cgiGet( "vUSURCOD") ;
            AV31FlagCont = (short)(localUtil.ctol( httpContext.cgiGet( "vFLAGCONT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV30FlagAlb = (short)(localUtil.ctol( httpContext.cgiGet( "vFLAGALB"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV24firmad = (short)(localUtil.ctol( httpContext.cgiGet( "vFIRMAD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A7369SalExtRec = (int)(localUtil.ctol( httpContext.cgiGet( "SALEXTREC"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A11299SalExtFen = localUtil.ctod( httpContext.cgiGet( "SALEXTFEN"), 0) ;
            A407EmprNom = httpContext.cgiGet( "EMPRNOM") ;
            n407EmprNom = false ;
            A841TrnNom = httpContext.cgiGet( "TRNNOM") ;
            n841TrnNom = false ;
            A2249ManNom = httpContext.cgiGet( "MANNOM") ;
            n2249ManNom = false ;
            AV35Pgmname = httpContext.cgiGet( "vPGMNAME") ;
            A6251SalExKgR = localUtil.ctond( httpContext.cgiGet( "SALEXKGR")) ;
            A6252SalExCoR = (int)(localUtil.ctol( httpContext.cgiGet( "SALEXCOR"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A6255SalExMtR = localUtil.ctond( httpContext.cgiGet( "SALEXMTR")) ;
            AV20OldKg = localUtil.ctond( httpContext.cgiGet( "vOLDKG")) ;
            AV21OldMt = localUtil.ctond( httpContext.cgiGet( "vOLDMT")) ;
            AV22OldPz = (int)(localUtil.ctol( httpContext.cgiGet( "vOLDPZ"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV19msgerr = httpContext.cgiGet( "vMSGERR") ;
            AV23Msg_err = httpContext.cgiGet( "vMSG_ERR") ;
            A6249SalExObs = httpContext.cgiGet( "SALEXOBS") ;
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
            Dvelop_confirmpanel_eliminarlinea_Objectcall = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINARLINEA_Objectcall") ;
            Dvelop_confirmpanel_eliminarlinea_Enabled = GXutil.strtobool( httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINARLINEA_Enabled")) ;
            Dvelop_confirmpanel_eliminarlinea_Width = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINARLINEA_Width") ;
            Dvelop_confirmpanel_eliminarlinea_Height = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINARLINEA_Height") ;
            Dvelop_confirmpanel_eliminarlinea_Class = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINARLINEA_Class") ;
            Dvelop_confirmpanel_eliminarlinea_Title = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINARLINEA_Title") ;
            Dvelop_confirmpanel_eliminarlinea_Confirmationtext = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINARLINEA_Confirmationtext") ;
            Dvelop_confirmpanel_eliminarlinea_Yesbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINARLINEA_Yesbuttoncaption") ;
            Dvelop_confirmpanel_eliminarlinea_Nobuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINARLINEA_Nobuttoncaption") ;
            Dvelop_confirmpanel_eliminarlinea_Cancelbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINARLINEA_Cancelbuttoncaption") ;
            Dvelop_confirmpanel_eliminarlinea_Yesbuttonposition = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINARLINEA_Yesbuttonposition") ;
            Dvelop_confirmpanel_eliminarlinea_Confirmtype = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINARLINEA_Confirmtype") ;
            Dvelop_confirmpanel_eliminarlinea_Comment = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINARLINEA_Comment") ;
            Dvelop_confirmpanel_eliminarlinea_Bodytype = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINARLINEA_Bodytype") ;
            Dvelop_confirmpanel_eliminarlinea_Bodycontentinternalname = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINARLINEA_Bodycontentinternalname") ;
            Dvelop_confirmpanel_eliminarlinea_Result = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINARLINEA_Result") ;
            Dvelop_confirmpanel_eliminarlinea_Texttype = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINARLINEA_Texttype") ;
            Dvelop_confirmpanel_eliminarlinea_Visible = GXutil.strtobool( httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINARLINEA_Visible")) ;
            /* Read variables values. */
            A2253SalExtAlb = (int)(localUtil.ctol( httpContext.cgiGet( edtSalExtAlb_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A2253SalExtAlb", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2253SalExtAlb), 8, 0));
            if ( localUtil.vcdate( httpContext.cgiGet( edtSalExtFec_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "SALEXTFEC");
               AnyError = (short)(1) ;
               GX_FocusControl = edtSalExtFec_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A2256SalExtFec = GXutil.nullDate() ;
               httpContext.ajax_rsp_assign_attri("", false, "A2256SalExtFec", localUtil.format(A2256SalExtFec, "99/99/99"));
            }
            else
            {
               A2256SalExtFec = localUtil.ctod( httpContext.cgiGet( edtSalExtFec_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A2256SalExtFec", localUtil.format(A2256SalExtFec, "99/99/99"));
            }
            A6396SalExtHor = httpContext.cgiGet( edtSalExtHor_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A6396SalExtHor", A6396SalExtHor);
            if ( localUtil.vcdate( httpContext.cgiGet( edtSalFecEnt_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "SALFECENT");
               AnyError = (short)(1) ;
               GX_FocusControl = edtSalFecEnt_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A8655SalFecEnt = GXutil.nullDate() ;
               httpContext.ajax_rsp_assign_attri("", false, "A8655SalFecEnt", localUtil.format(A8655SalFecEnt, "99/99/99"));
            }
            else
            {
               A8655SalFecEnt = localUtil.ctod( httpContext.cgiGet( edtSalFecEnt_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A8655SalFecEnt", localUtil.format(A8655SalFecEnt, "99/99/99"));
            }
            A7368SalExtUsu = GXutil.upper( httpContext.cgiGet( edtSalExtUsu_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A7368SalExtUsu", A7368SalExtUsu);
            A10080SalSts = httpContext.cgiGet( edtSalSts_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A10080SalSts", A10080SalSts);
            h2248ManCod = httpContext.cgiGet( edtManCod_Internalname) ;
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtSalExtPre1_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtSalExtPre1_Internalname)), DecimalUtil.stringToDec("9999999.99999")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "SALEXTPRE1");
               AnyError = (short)(1) ;
               GX_FocusControl = edtSalExtPre1_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A13244SalExtPre1 = DecimalUtil.ZERO ;
               httpContext.ajax_rsp_assign_attri("", false, "A13244SalExtPre1", GXutil.ltrimstr( A13244SalExtPre1, 13, 5));
            }
            else
            {
               A13244SalExtPre1 = localUtil.ctond( httpContext.cgiGet( edtSalExtPre1_Internalname)) ;
               httpContext.ajax_rsp_assign_attri("", false, "A13244SalExtPre1", GXutil.ltrimstr( A13244SalExtPre1, 13, 5));
            }
            h840TrnCod = httpContext.cgiGet( edtTrnCod_Internalname) ;
            A6397SalExtMat = httpContext.cgiGet( edtSalExtMat_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A6397SalExtMat", A6397SalExtMat);
            A3554SalExtObs = httpContext.cgiGet( edtSalExtObs_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A3554SalExtObs", A3554SalExtObs);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtSalExtEst_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtSalExtEst_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "SALEXTEST");
               AnyError = (short)(1) ;
               GX_FocusControl = edtSalExtEst_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A2257SalExtEst = (byte)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A2257SalExtEst", GXutil.str( A2257SalExtEst, 1, 0));
            }
            else
            {
               A2257SalExtEst = (byte)(localUtil.ctol( httpContext.cgiGet( edtSalExtEst_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A2257SalExtEst", GXutil.str( A2257SalExtEst, 1, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtSalExtLis_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtSalExtLis_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "SALEXTLIS");
               AnyError = (short)(1) ;
               GX_FocusControl = edtSalExtLis_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A2258SalExtLis = (byte)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A2258SalExtLis", GXutil.str( A2258SalExtLis, 1, 0));
            }
            else
            {
               A2258SalExtLis = (byte)(localUtil.ctol( httpContext.cgiGet( edtSalExtLis_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A2258SalExtLis", GXutil.str( A2258SalExtLis, 1, 0));
            }
            A2254SalExtSec = httpContext.cgiGet( edtSalExtSec_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A2254SalExtSec", A2254SalExtSec);
            A6247SalExUln = (short)(localUtil.ctol( httpContext.cgiGet( edtSalExUln_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A6247SalExUln", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6247SalExUln), 4, 0));
            A10767SalExtAT = httpContext.cgiGet( edtSalExtAT_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A10767SalExtAT", A10767SalExtAT);
            A10742SalCodeID = httpContext.cgiGet( edtSalCodeID_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A10742SalCodeID", A10742SalCodeID);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtSalEnvAT_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtSalEnvAT_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "SALENVAT");
               AnyError = (short)(1) ;
               GX_FocusControl = edtSalEnvAT_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A10741SalEnvAT = (byte)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A10741SalEnvAT", GXutil.str( A10741SalEnvAT, 1, 0));
            }
            else
            {
               A10741SalEnvAT = (byte)(localUtil.ctol( httpContext.cgiGet( edtSalEnvAT_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A10741SalEnvAT", GXutil.str( A10741SalEnvAT, 1, 0));
            }
            A10079SalFmdD = httpContext.cgiGet( edtSalFmdD_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A10079SalFmdD", A10079SalFmdD);
            if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtSalGrossT_Internalname)), DecimalUtil.stringToDec("-999999999.99")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtSalGrossT_Internalname)), DecimalUtil.stringToDec("9999999999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "SALGROSST");
               AnyError = (short)(1) ;
               GX_FocusControl = edtSalGrossT_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A10078SalGrossT = DecimalUtil.ZERO ;
               httpContext.ajax_rsp_assign_attri("", false, "A10078SalGrossT", GXutil.ltrimstr( A10078SalGrossT, 13, 2));
            }
            else
            {
               A10078SalGrossT = localUtil.ctond( httpContext.cgiGet( edtSalGrossT_Internalname)) ;
               httpContext.ajax_rsp_assign_attri("", false, "A10078SalGrossT", GXutil.ltrimstr( A10078SalGrossT, 13, 2));
            }
            A10077SalFmd = httpContext.cgiGet( edtSalFmd_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A10077SalFmd", A10077SalFmd);
            if ( localUtil.vcdtime( httpContext.cgiGet( edtSalFhh_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))), (byte)(((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0))) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "SALFHH");
               AnyError = (short)(1) ;
               GX_FocusControl = edtSalFhh_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A10076SalFhh = GXutil.resetTime( GXutil.nullDate() );
               httpContext.ajax_rsp_assign_attri("", false, "A10076SalFhh", localUtil.ttoc( A10076SalFhh, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            }
            else
            {
               A10076SalFhh = localUtil.ctot( httpContext.cgiGet( edtSalFhh_Internalname)) ;
               httpContext.ajax_rsp_assign_attri("", false, "A10076SalFhh", localUtil.ttoc( A10076SalFhh, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            }
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = new com.genexus.util.GXProperties() ;
            forbiddenHiddens.add("hshsalt", "hsh"+"TrabajosExternosEnvio");
            A7368SalExtUsu = httpContext.cgiGet( edtSalExtUsu_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A7368SalExtUsu", A7368SalExtUsu);
            forbiddenHiddens.add("SalExtUsu", GXutil.rtrim( localUtil.format( A7368SalExtUsu, "@!")));
            forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
            forbiddenHiddens.add("SalExtRec", localUtil.format( DecimalUtil.doubleToDec(A7369SalExtRec), "ZZZZZ9"));
            forbiddenHiddens.add("SalExtFen", localUtil.format(A11299SalExtFen, "99/99/99"));
            A10080SalSts = httpContext.cgiGet( edtSalSts_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A10080SalSts", A10080SalSts);
            forbiddenHiddens.add("SalSts", GXutil.rtrim( localUtil.format( A10080SalSts, "")));
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ( ! ( ( A2253SalExtAlb != Z2253SalExtAlb ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
            {
               GXutil.writeLogError("trabajosexternosenvio:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
               A2253SalExtAlb = (int)(GXutil.lval( httpContext.GetPar( "SalExtAlb"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A2253SalExtAlb", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2253SalExtAlb), 8, 0));
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
                  sMode305 = Gx_mode ;
                  Gx_mode = "UPD" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  Gx_mode = sMode305 ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               }
               standaloneModal( ) ;
               if ( ! isIns( ) )
               {
                  getByPrimaryKey( ) ;
                  if ( RcdFound305 == 1 )
                  {
                     if ( isDlt( ) )
                     {
                        /* Confirm record */
                        confirm_1PS0( ) ;
                        if ( AnyError == 0 )
                        {
                           GX_FocusControl = bttBtntrn_enter_Internalname ;
                           httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                        }
                     }
                  }
                  else
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noinsert"), 1, "SALEXTALB");
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtSalExtAlb_Internalname ;
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
                     if ( GXutil.strcmp(sEvt, "DVELOP_CONFIRMPANEL_ELIMINARLINEA.CLOSE") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        e131PS2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "START") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: Start */
                        e121PS2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: After Trn */
                        e141PS2 ();
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
         e141PS2 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( isIns( )  )
         {
            /* Clear variables for new insertion. */
            initAll1PS305( ) ;
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
      if ( isDsp( ) || isDlt( ) )
      {
         if ( isDsp( ) )
         {
            bttBtntrn_enter_Visible = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, bttBtntrn_enter_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_enter_Visible), 5, 0), true);
         }
         disableAttributes1PS305( ) ;
      }
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

   public void confirm_1PS0( )
   {
      beforeValidate1PS305( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1PS305( ) ;
         }
         else
         {
            checkExtendedTable1PS305( ) ;
            closeExtendedTableCursors1PS305( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode305 = Gx_mode ;
         confirm_1PS910( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode305 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode305 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
   }

   public void confirm_1PS910( )
   {
      s6247SalExUln = O6247SalExUln ;
      httpContext.ajax_rsp_assign_attri("", false, "A6247SalExUln", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6247SalExUln), 4, 0));
      nGXsfl_84_idx = 0 ;
      while ( nGXsfl_84_idx < nRC_GXsfl_84 )
      {
         readRow1PS910( ) ;
         if ( ( nRcdExists_910 != 0 ) || ( nIsMod_910 != 0 ) )
         {
            getKey1PS910( ) ;
            if ( ( nRcdExists_910 == 0 ) && ( nRcdDeleted_910 == 0 ) )
            {
               if ( RcdFound910 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate1PS910( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1PS910( ) ;
                     closeExtendedTableCursors1PS910( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                     O6247SalExUln = A6247SalExUln ;
                     httpContext.ajax_rsp_assign_attri("", false, "A6247SalExUln", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6247SalExUln), 4, 0));
                  }
               }
               else
               {
                  GXCCtl = "SALEXNLN_" + sGXsfl_84_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtSalExNln_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound910 != 0 )
               {
                  if ( nRcdDeleted_910 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey1PS910( ) ;
                     load1PS910( ) ;
                     beforeValidate1PS910( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1PS910( ) ;
                        O6247SalExUln = A6247SalExUln ;
                        httpContext.ajax_rsp_assign_attri("", false, "A6247SalExUln", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6247SalExUln), 4, 0));
                     }
                  }
                  else
                  {
                     if ( nIsMod_910 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate1PS910( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1PS910( ) ;
                           closeExtendedTableCursors1PS910( ) ;
                           if ( AnyError == 0 )
                           {
                              IsConfirmed = (short)(1) ;
                              httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                           }
                           O6247SalExUln = A6247SalExUln ;
                           httpContext.ajax_rsp_assign_attri("", false, "A6247SalExUln", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6247SalExUln), 4, 0));
                        }
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_910 == 0 )
                  {
                     GXCCtl = "SALEXNLN_" + sGXsfl_84_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtSalExNln_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtSalExNln_Internalname, GXutil.ltrim( localUtil.ntoc( A6248SalExNln, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarCod_Internalname, GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarCodReo_Internalname, GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarCodPar_Internalname, GXutil.rtrim( A130BarCodPar)) ;
         httpContext.changePostValue( edtCliCod_Internalname, GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarSer_Internalname, GXutil.rtrim( A212BarSer)) ;
         httpContext.changePostValue( edtBarSerDsc_Internalname, GXutil.rtrim( A1652BarSerDsc)) ;
         httpContext.changePostValue( edtBarColNom_Internalname, GXutil.rtrim( A135BarColNom)) ;
         httpContext.changePostValue( edtBarColNum_Internalname, GXutil.ltrim( localUtil.ntoc( A136BarColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarNomCli_Internalname, GXutil.rtrim( A1234BarNomCli)) ;
         httpContext.changePostValue( edtFasCodn_Internalname, GXutil.rtrim( A6558FasCodn)) ;
         httpContext.changePostValue( edtavImgprompt_Internalname, AV32imgPrompt) ;
         httpContext.changePostValue( edtOrdLin_Internalname, GXutil.ltrim( localUtil.ntoc( A654OrdLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtSalExCoE_Internalname, GXutil.ltrim( localUtil.ntoc( A6257SalExCoE, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtSalExKgE_Internalname, GXutil.ltrim( localUtil.ntoc( A6256SalExKgE, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtSalExMtE_Internalname, GXutil.ltrim( localUtil.ntoc( A6258SalExMtE, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarSit_Internalname, GXutil.ltrim( localUtil.ntoc( A213BarSit, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMetrosRece_Internalname, GXutil.ltrim( localUtil.ntoc( A13849MetrosRece, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtKilosRecep_Internalname, GXutil.ltrim( localUtil.ntoc( A13850KilosRecep, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPiezasRece_Internalname, GXutil.ltrim( localUtil.ntoc( A13851PiezasRece, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarExt_Internalname, GXutil.ltrim( localUtil.ntoc( A2265BarExt, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z6248SalExNln_"+sGXsfl_84_idx, GXutil.ltrim( localUtil.ntoc( Z6248SalExNln, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z6256SalExKgE_"+sGXsfl_84_idx, GXutil.ltrim( localUtil.ntoc( Z6256SalExKgE, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z6258SalExMtE_"+sGXsfl_84_idx, GXutil.ltrim( localUtil.ntoc( Z6258SalExMtE, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z6257SalExCoE_"+sGXsfl_84_idx, GXutil.ltrim( localUtil.ntoc( Z6257SalExCoE, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z654OrdLin_"+sGXsfl_84_idx, GXutil.ltrim( localUtil.ntoc( Z654OrdLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z6249SalExObs_"+sGXsfl_84_idx, GXutil.rtrim( Z6249SalExObs)) ;
         httpContext.changePostValue( "ZT_"+"Z6255SalExMtR_"+sGXsfl_84_idx, GXutil.ltrim( localUtil.ntoc( Z6255SalExMtR, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z6251SalExKgR_"+sGXsfl_84_idx, GXutil.ltrim( localUtil.ntoc( Z6251SalExKgR, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z6252SalExCoR_"+sGXsfl_84_idx, GXutil.ltrim( localUtil.ntoc( Z6252SalExCoR, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z6558FasCodn_"+sGXsfl_84_idx, GXutil.rtrim( Z6558FasCodn)) ;
         httpContext.changePostValue( "ZT_"+"Z129BarCod_"+sGXsfl_84_idx, GXutil.ltrim( localUtil.ntoc( Z129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z132BarCodReo_"+sGXsfl_84_idx, GXutil.ltrim( localUtil.ntoc( Z132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z130BarCodPar_"+sGXsfl_84_idx, GXutil.rtrim( Z130BarCodPar)) ;
         httpContext.changePostValue( "T6257SalExCoE_"+sGXsfl_84_idx, GXutil.ltrim( localUtil.ntoc( O6257SalExCoE, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T6258SalExMtE_"+sGXsfl_84_idx, GXutil.ltrim( localUtil.ntoc( O6258SalExMtE, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T6256SalExKgE_"+sGXsfl_84_idx, GXutil.ltrim( localUtil.ntoc( O6256SalExKgE, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_910_"+sGXsfl_84_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_910, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_910_"+sGXsfl_84_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_910, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_910_"+sGXsfl_84_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_910, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_910 != 0 )
         {
            httpContext.changePostValue( "SALEXNLN_"+sGXsfl_84_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtSalExNln_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARCOD_"+sGXsfl_84_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARCODREO_"+sGXsfl_84_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarCodReo_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARCODPAR_"+sGXsfl_84_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarCodPar_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CLICOD_"+sGXsfl_84_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCliCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARSER_"+sGXsfl_84_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarSer_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARSERDSC_"+sGXsfl_84_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarSerDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARCOLNOM_"+sGXsfl_84_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarColNom_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARCOLNUM_"+sGXsfl_84_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarColNum_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARNOMCLI_"+sGXsfl_84_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarNomCli_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FASCODN_"+sGXsfl_84_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasCodn_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "vIMGPROMPT_"+sGXsfl_84_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavImgprompt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "vIMGPROMPT_"+sGXsfl_84_idx+"Link", GXutil.rtrim( edtavImgprompt_Link)) ;
            httpContext.changePostValue( "vIMGPROMPT_"+sGXsfl_84_idx+"Visible", GXutil.ltrim( localUtil.ntoc( edtavImgprompt_Visible, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ORDLIN_"+sGXsfl_84_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOrdLin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "SALEXCOE_"+sGXsfl_84_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtSalExCoE_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "SALEXKGE_"+sGXsfl_84_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtSalExKgE_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "SALEXMTE_"+sGXsfl_84_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtSalExMtE_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARSIT_"+sGXsfl_84_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarSit_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "METROSRECE_"+sGXsfl_84_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMetrosRece_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "KILOSRECEP_"+sGXsfl_84_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtKilosRecep_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PIEZASRECE_"+sGXsfl_84_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPiezasRece_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BAREXT_"+sGXsfl_84_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarExt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      O6247SalExUln = s6247SalExUln ;
      httpContext.ajax_rsp_assign_attri("", false, "A6247SalExUln", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6247SalExUln), 4, 0));
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption1PS0( )
   {
   }

   public void e121PS2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV15Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      trabajosexternosenvio_impl.this.GXt_char1 = GXv_char2[0] ;
      AV15Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15Station", AV15Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV16EmprNom ;
      GXv_char4[0] = AV17UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV15Station, GXv_char2, GXv_char3, GXv_char4) ;
      trabajosexternosenvio_impl.this.A396EmprCod = GXv_char2[0] ;
      trabajosexternosenvio_impl.this.AV16EmprNom = GXv_char3[0] ;
      trabajosexternosenvio_impl.this.AV17UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV16EmprNom", AV16EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV17UsurCod", AV17UsurCod);
      GXt_int5 = (byte)(AV18Biarprint) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "BIARPR", ""), GXv_int6) ;
      trabajosexternosenvio_impl.this.GXt_int5 = GXv_int6[0] ;
      AV18Biarprint = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18Biarprint", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV18Biarprint), 4, 0));
      GXt_int5 = (byte)(AV25Suprema) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "SUPREM", ""), GXv_int6) ;
      trabajosexternosenvio_impl.this.GXt_int5 = GXv_int6[0] ;
      AV25Suprema = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV25Suprema", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV25Suprema), 4, 0));
      GXt_int5 = (byte)(AV24firmad) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "FIRDGG", ""), GXv_int6) ;
      trabajosexternosenvio_impl.this.GXt_int5 = GXv_int6[0] ;
      AV24firmad = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV24firmad", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV24firmad), 4, 0));
      GXt_int5 = (byte)(AV26Moda21) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "MODA21", ""), GXv_int6) ;
      trabajosexternosenvio_impl.this.GXt_int5 = GXv_int6[0] ;
      AV26Moda21 = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV26Moda21", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV26Moda21), 4, 0));
      GXt_int5 = (byte)(AV27Tinamar) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "TINAMA", ""), GXv_int6) ;
      trabajosexternosenvio_impl.this.GXt_int5 = GXv_int6[0] ;
      AV27Tinamar = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV27Tinamar", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV27Tinamar), 4, 0));
      GXt_int5 = (byte)(AV28Ws) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "WSTE", ""), GXv_int6) ;
      trabajosexternosenvio_impl.this.GXt_int5 = GXv_int6[0] ;
      AV28Ws = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV28Ws", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV28Ws), 4, 0));
      GXt_int5 = (byte)(AV29Modhh) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "UPDHHS", ""), GXv_int6) ;
      trabajosexternosenvio_impl.this.GXt_int5 = GXv_int6[0] ;
      AV29Modhh = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV29Modhh", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29Modhh), 4, 0));
      GXt_char1 = AV15Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      trabajosexternosenvio_impl.this.GXt_char1 = GXv_char4[0] ;
      AV15Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15Station", AV15Station);
      GXv_char4[0] = AV7EmprCod ;
      GXv_char3[0] = AV16EmprNom ;
      GXv_char2[0] = AV17UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV15Station, GXv_char4, GXv_char3, GXv_char2) ;
      trabajosexternosenvio_impl.this.AV7EmprCod = GXv_char4[0] ;
      trabajosexternosenvio_impl.this.AV16EmprNom = GXv_char3[0] ;
      trabajosexternosenvio_impl.this.AV17UsurCod = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7EmprCod", AV7EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV7EmprCod, "@!"))));
      httpContext.ajax_rsp_assign_attri("", false, "AV16EmprNom", AV16EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV17UsurCod", AV17UsurCod);
      GXv_SdtWWPContext7[0] = AV9WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext7) ;
      AV9WWPContext = GXv_SdtWWPContext7[0] ;
      /* Execute user subroutine: 'ATTRIBUTESSECURITYCODE' */
      S112 ();
      if ( returnInSub )
      {
         pr_default.close(8);
         pr_default.close(7);
         pr_default.close(6);
         pr_default.close(5);
         pr_default.close(3);
         pr_default.close(2);
         pr_default.close(1);
         returnInSub = true;
         if (true) return;
      }
      AV10TrnContext.fromxml(AV11WebSession.getValue("TrnContext"), null, null);
      if ( ( GXutil.strcmp(AV10TrnContext.getgxTv_SdtWWPTransactionContext_Transactionname(), AV35Pgmname) == 0 ) && ( GXutil.strcmp(Gx_mode, "INS") == 0 ) )
      {
         AV36GXV1 = 1 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV36GXV1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36GXV1), 8, 0));
         while ( AV36GXV1 <= AV10TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().size() )
         {
            AV14TrnContextAtt = (app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)((app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)AV10TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().elementAt(-1+AV36GXV1));
            if ( GXutil.strcmp(AV14TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributename(), "ManCod") == 0 )
            {
               AV12Insert_ManCod = (short)(GXutil.lval( AV14TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributevalue())) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV12Insert_ManCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12Insert_ManCod), 4, 0));
            }
            else if ( GXutil.strcmp(AV14TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributename(), "TrnCod") == 0 )
            {
               AV13Insert_TrnCod = (short)(GXutil.lval( AV14TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributevalue())) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV13Insert_TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13Insert_TrnCod), 4, 0));
            }
            AV36GXV1 = (int)(AV36GXV1+1) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV36GXV1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36GXV1), 8, 0));
         }
      }
      edtSalExtEst_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSalExtEst_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSalExtEst_Visible), 5, 0), true);
      edtSalExtLis_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSalExtLis_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSalExtLis_Visible), 5, 0), true);
      edtSalExtSec_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSalExtSec_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSalExtSec_Visible), 5, 0), true);
      edtSalExUln_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSalExUln_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSalExUln_Visible), 5, 0), true);
      edtSalExtAT_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSalExtAT_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSalExtAT_Visible), 5, 0), true);
      edtSalCodeID_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSalCodeID_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSalCodeID_Visible), 5, 0), true);
      edtSalEnvAT_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSalEnvAT_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSalEnvAT_Visible), 5, 0), true);
      edtSalFmdD_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSalFmdD_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSalFmdD_Visible), 5, 0), true);
      edtSalGrossT_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSalGrossT_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSalGrossT_Visible), 5, 0), true);
      edtSalFmd_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSalFmd_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSalFmd_Visible), 5, 0), true);
      edtSalFhh_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSalFhh_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSalFhh_Visible), 5, 0), true);
      edtavImgprompt_gximage = "prompt" ;
      httpContext.ajax_rsp_assign_prop("", false, edtavImgprompt_Internalname, "gximage", edtavImgprompt_gximage, !bGXsfl_84_Refreshing);
      AV32imgPrompt = context.getHttpContext().getImagePath( "f5b04895-0024-488b-8e3b-b687ca4598ee", "", context.getHttpContext().getTheme( )) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavImgprompt_Internalname, "Bitmap", ((GXutil.strcmp("", AV32imgPrompt)==0) ? AV37Imgprompt_GXI : httpContext.convertURL( httpContext.getResourceRelative(AV32imgPrompt))), !bGXsfl_84_Refreshing);
      httpContext.ajax_rsp_assign_prop("", false, edtavImgprompt_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( AV32imgPrompt), true);
      AV37Imgprompt_GXI = GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "f5b04895-0024-488b-8e3b-b687ca4598ee", "", context.getHttpContext().getTheme( )), context.getHttpContext()) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavImgprompt_Internalname, "Bitmap", ((GXutil.strcmp("", AV32imgPrompt)==0) ? AV37Imgprompt_GXI : httpContext.convertURL( httpContext.getResourceRelative(AV32imgPrompt))), !bGXsfl_84_Refreshing);
      httpContext.ajax_rsp_assign_prop("", false, edtavImgprompt_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( AV32imgPrompt), true);
   }

   public void e141PS2( )
   {
      /* After Trn Routine */
      returnInSub = false ;
      if ( 1 == 0 )
      {
         if ( ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) && ! AV10TrnContext.getgxTv_SdtWWPTransactionContext_Callerondelete() )
         {
            callWebObject(formatLink("app.trabajosexternosenvioww", new String[] {}, new String[] {}) );
            httpContext.wjLocDisableFrm = (byte)(1) ;
         }
         httpContext.setWebReturnParms(new Object[] {});
         httpContext.setWebReturnParmsMetadata(new Object[] {});
         httpContext.wjLocDisableFrm = (byte)(1) ;
         httpContext.nUserReturn = (byte)(1) ;
         pr_default.close(8);
         pr_default.close(7);
         pr_default.close(6);
         pr_default.close(5);
         pr_default.close(3);
         pr_default.close(2);
         pr_default.close(1);
         returnInSub = true;
         if (true) return;
      }
   }

   public void e131PS2( )
   {
      /* Dvelop_confirmpanel_eliminarlinea_Close Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Dvelop_confirmpanel_eliminarlinea_Result, "Yes") == 0 )
      {
         /* Execute user subroutine: 'DO ACTION ELIMINARLINEA' */
         S122 ();
         if ( returnInSub )
         {
            pr_default.close(8);
            pr_default.close(7);
            pr_default.close(6);
            pr_default.close(5);
            pr_default.close(3);
            pr_default.close(2);
            pr_default.close(1);
            returnInSub = true;
            if (true) return;
         }
      }
      /*  Sending Event outputs  */
   }

   public void S122( )
   {
      /* 'DO ACTION ELIMINARLINEA' Routine */
      returnInSub = false ;
      if ( A2265BarExt < 2 )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_int8[0] = A2253SalExtAlb ;
         GXv_int9[0] = A6248SalExNln ;
         GXv_int6[0] = (byte)(AV33Flag) ;
         new app.trabajosexternos.phdrde33(remoteHandle, context).execute( GXv_char4, GXv_int8, GXv_int9, GXv_int6) ;
         trabajosexternosenvio_impl.this.A396EmprCod = GXv_char4[0] ;
         trabajosexternosenvio_impl.this.A2253SalExtAlb = GXv_int8[0] ;
         trabajosexternosenvio_impl.this.A6248SalExNln = GXv_int9[0] ;
         trabajosexternosenvio_impl.this.AV33Flag = GXv_int6[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A2253SalExtAlb", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2253SalExtAlb), 8, 0));
         if ( AV33Flag == 1 )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "Esta Linea ya esta Recepcionada¡¡¡", ""));
         }
         else
         {
            GXv_char4[0] = A396EmprCod ;
            GXv_int8[0] = A129BarCod ;
            GXv_int6[0] = A132BarCodReo ;
            GXv_char3[0] = A130BarCodPar ;
            GXv_char2[0] = A6558FasCodn ;
            GXv_date10[0] = A2256SalExtFec ;
            GXv_int11[0] = (byte)(0) ;
            GXv_int12[0] = A2253SalExtAlb ;
            GXv_int9[0] = A6248SalExNln ;
            GXv_char13[0] = "HDR" ;
            new app.phdrex9(remoteHandle, context).execute( GXv_char4, GXv_int8, GXv_int6, GXv_char3, GXv_char2, GXv_date10, GXv_int11, GXv_int12, GXv_int9, GXv_char13) ;
            trabajosexternosenvio_impl.this.A396EmprCod = GXv_char4[0] ;
            trabajosexternosenvio_impl.this.A129BarCod = GXv_int8[0] ;
            trabajosexternosenvio_impl.this.A132BarCodReo = GXv_int6[0] ;
            trabajosexternosenvio_impl.this.A130BarCodPar = GXv_char3[0] ;
            trabajosexternosenvio_impl.this.A6558FasCodn = GXv_char2[0] ;
            trabajosexternosenvio_impl.this.A2256SalExtFec = GXv_date10[0] ;
            trabajosexternosenvio_impl.this.A2253SalExtAlb = GXv_int12[0] ;
            trabajosexternosenvio_impl.this.A6248SalExNln = GXv_int9[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            httpContext.ajax_rsp_assign_attri("", false, "A2256SalExtFec", localUtil.format(A2256SalExtFec, "99/99/99"));
            httpContext.ajax_rsp_assign_attri("", false, "A2253SalExtAlb", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2253SalExtAlb), 8, 0));
            GXv_char13[0] = A396EmprCod ;
            GXv_int9[0] = A2248ManCod ;
            GXv_char4[0] = A6558FasCodn ;
            GXv_char3[0] = "E" ;
            GXv_int12[0] = A2253SalExtAlb ;
            GXv_int8[0] = A129BarCod ;
            GXv_int11[0] = A132BarCodReo ;
            GXv_char2[0] = A130BarCodPar ;
            new app.trabajosexternos.pbmvhdr(remoteHandle, context).execute( GXv_char13, GXv_int9, GXv_char4, GXv_char3, GXv_int12, GXv_int8, GXv_int11, GXv_char2) ;
            trabajosexternosenvio_impl.this.A396EmprCod = GXv_char13[0] ;
            trabajosexternosenvio_impl.this.A2248ManCod = GXv_int9[0] ;
            trabajosexternosenvio_impl.this.A6558FasCodn = GXv_char4[0] ;
            trabajosexternosenvio_impl.this.A2253SalExtAlb = GXv_int12[0] ;
            trabajosexternosenvio_impl.this.A129BarCod = GXv_int8[0] ;
            trabajosexternosenvio_impl.this.A132BarCodReo = GXv_int11[0] ;
            trabajosexternosenvio_impl.this.A130BarCodPar = GXv_char2[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            httpContext.ajax_rsp_assign_attri("", false, "A2248ManCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2248ManCod), 4, 0));
            httpContext.ajax_rsp_assign_attri("", false, "A2253SalExtAlb", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2253SalExtAlb), 8, 0));
         }
      }
      else
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Eliminacion no permitida", ""));
      }
   }

   public void S112( )
   {
      /* 'ATTRIBUTESSECURITYCODE' Routine */
      returnInSub = false ;
      divSalextpre1_cell_Class = "col-xs-12 col-sm-6 DataContentCell" ;
      httpContext.ajax_rsp_assign_prop("", false, divSalextpre1_cell_Internalname, "Class", divSalextpre1_cell_Class, true);
   }

   public void zm1PS305( int GX_JID )
   {
      if ( ( GX_JID == 63 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z6396SalExtHor = T01PS7_A6396SalExtHor[0] ;
            Z2256SalExtFec = T01PS7_A2256SalExtFec[0] ;
            Z2257SalExtEst = T01PS7_A2257SalExtEst[0] ;
            Z2258SalExtLis = T01PS7_A2258SalExtLis[0] ;
            Z2254SalExtSec = T01PS7_A2254SalExtSec[0] ;
            Z6247SalExUln = T01PS7_A6247SalExUln[0] ;
            Z6397SalExtMat = T01PS7_A6397SalExtMat[0] ;
            Z7368SalExtUsu = T01PS7_A7368SalExtUsu[0] ;
            Z7369SalExtRec = T01PS7_A7369SalExtRec[0] ;
            Z8655SalFecEnt = T01PS7_A8655SalFecEnt[0] ;
            Z11299SalExtFen = T01PS7_A11299SalExtFen[0] ;
            Z10767SalExtAT = T01PS7_A10767SalExtAT[0] ;
            Z10742SalCodeID = T01PS7_A10742SalCodeID[0] ;
            Z10741SalEnvAT = T01PS7_A10741SalEnvAT[0] ;
            Z10080SalSts = T01PS7_A10080SalSts[0] ;
            Z10079SalFmdD = T01PS7_A10079SalFmdD[0] ;
            Z10078SalGrossT = T01PS7_A10078SalGrossT[0] ;
            Z10077SalFmd = T01PS7_A10077SalFmd[0] ;
            Z10076SalFhh = T01PS7_A10076SalFhh[0] ;
            Z13244SalExtPre1 = T01PS7_A13244SalExtPre1[0] ;
            Z840TrnCod = T01PS7_A840TrnCod[0] ;
            Z2248ManCod = T01PS7_A2248ManCod[0] ;
         }
         else
         {
            Z6396SalExtHor = A6396SalExtHor ;
            Z2256SalExtFec = A2256SalExtFec ;
            Z2257SalExtEst = A2257SalExtEst ;
            Z2258SalExtLis = A2258SalExtLis ;
            Z2254SalExtSec = A2254SalExtSec ;
            Z6247SalExUln = A6247SalExUln ;
            Z6397SalExtMat = A6397SalExtMat ;
            Z7368SalExtUsu = A7368SalExtUsu ;
            Z7369SalExtRec = A7369SalExtRec ;
            Z8655SalFecEnt = A8655SalFecEnt ;
            Z11299SalExtFen = A11299SalExtFen ;
            Z10767SalExtAT = A10767SalExtAT ;
            Z10742SalCodeID = A10742SalCodeID ;
            Z10741SalEnvAT = A10741SalEnvAT ;
            Z10080SalSts = A10080SalSts ;
            Z10079SalFmdD = A10079SalFmdD ;
            Z10078SalGrossT = A10078SalGrossT ;
            Z10077SalFmd = A10077SalFmd ;
            Z10076SalFhh = A10076SalFhh ;
            Z13244SalExtPre1 = A13244SalExtPre1 ;
            Z840TrnCod = A840TrnCod ;
            Z2248ManCod = A2248ManCod ;
         }
      }
      if ( GX_JID == -63 )
      {
         Z2253SalExtAlb = A2253SalExtAlb ;
         Z6396SalExtHor = A6396SalExtHor ;
         Z2256SalExtFec = A2256SalExtFec ;
         Z2257SalExtEst = A2257SalExtEst ;
         Z2258SalExtLis = A2258SalExtLis ;
         Z2254SalExtSec = A2254SalExtSec ;
         Z6247SalExUln = A6247SalExUln ;
         Z6397SalExtMat = A6397SalExtMat ;
         Z7368SalExtUsu = A7368SalExtUsu ;
         Z7369SalExtRec = A7369SalExtRec ;
         Z8655SalFecEnt = A8655SalFecEnt ;
         Z11299SalExtFen = A11299SalExtFen ;
         Z10767SalExtAT = A10767SalExtAT ;
         Z10742SalCodeID = A10742SalCodeID ;
         Z10741SalEnvAT = A10741SalEnvAT ;
         Z10080SalSts = A10080SalSts ;
         Z10079SalFmdD = A10079SalFmdD ;
         Z10078SalGrossT = A10078SalGrossT ;
         Z10077SalFmd = A10077SalFmd ;
         Z10076SalFhh = A10076SalFhh ;
         Z3554SalExtObs = A3554SalExtObs ;
         Z13244SalExtPre1 = A13244SalExtPre1 ;
         Z396EmprCod = A396EmprCod ;
         Z840TrnCod = A840TrnCod ;
         Z2248ManCod = A2248ManCod ;
         Z407EmprNom = A407EmprNom ;
         Z2249ManNom = A2249ManNom ;
         Z841TrnNom = A841TrnNom ;
      }
   }

   public void standaloneNotModal( )
   {
      edtSalExtUsu_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSalExtUsu_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSalExtUsu_Enabled), 5, 0), true);
      edtSalSts_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSalSts_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSalSts_Enabled), 5, 0), true);
      edtSalExUln_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSalExUln_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSalExUln_Enabled), 5, 0), true);
      AV35Pgmname = "TrabajosExternosEnvio" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV35Pgmname", AV35Pgmname);
      Gx_BScreen = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      edtSalExtUsu_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSalExtUsu_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSalExtUsu_Enabled), 5, 0), true);
      edtSalSts_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSalSts_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSalSts_Enabled), 5, 0), true);
      edtSalExtAlb_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSalExtAlb_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSalExtAlb_Enabled), 5, 0), true);
      edtSalExUln_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSalExUln_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSalExUln_Enabled), 5, 0), true);
      if ( ! (GXutil.strcmp("", AV7EmprCod)==0) )
      {
         A396EmprCod = AV7EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      }
      /* Using cursor T01PS8 */
      pr_default.execute(6, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01PS8_A407EmprNom[0] ;
      n407EmprNom = T01PS8_n407EmprNom[0] ;
      pr_default.close(6);
      GXt_int5 = (byte)(0) ;
      GXv_int11[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "BIARPR", ""), ""), GXv_int11) ;
      trabajosexternosenvio_impl.this.GXt_int5 = GXv_int11[0] ;
      edtSalExtPre1_Visible = ((GXt_int5==1) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtSalExtPre1_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSalExtPre1_Visible), 5, 0), true);
      GXt_int5 = (byte)(0) ;
      GXv_int11[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "BIARPR", ""), ""), GXv_int11) ;
      trabajosexternosenvio_impl.this.GXt_int5 = GXv_int11[0] ;
      if ( ! ( ( GXt_int5 == 1 ) ) )
      {
         divSalextpre1_cell_Class = httpContext.getMessage( "Invisible", "") ;
         httpContext.ajax_rsp_assign_prop("", false, divSalextpre1_cell_Internalname, "Class", divSalextpre1_cell_Class, true);
      }
      else
      {
         GXt_int5 = (byte)(0) ;
         GXv_int11[0] = GXt_int5 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "BIARPR", ""), ""), GXv_int11) ;
         trabajosexternosenvio_impl.this.GXt_int5 = GXv_int11[0] ;
         if ( GXt_int5 == 1 )
         {
            divSalextpre1_cell_Class = httpContext.getMessage( "col-xs-12 col-sm-6 DataContentCell", "") ;
            httpContext.ajax_rsp_assign_prop("", false, divSalextpre1_cell_Internalname, "Class", divSalextpre1_cell_Class, true);
         }
      }
      if ( ! (0==AV8SalExtAlb) )
      {
         A2253SalExtAlb = AV8SalExtAlb ;
         httpContext.ajax_rsp_assign_attri("", false, "A2253SalExtAlb", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2253SalExtAlb), 8, 0));
      }
      if ( ! (0==AV8SalExtAlb) )
      {
         edtSalExtAlb_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtSalExtAlb_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSalExtAlb_Enabled), 5, 0), true);
      }
      else
      {
         if ( true )
         {
            edtSalExtAlb_Enabled = 1 ;
            httpContext.ajax_rsp_assign_prop("", false, edtSalExtAlb_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSalExtAlb_Enabled), 5, 0), true);
         }
         else
         {
            edtSalExtAlb_Enabled = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, edtSalExtAlb_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSalExtAlb_Enabled), 5, 0), true);
         }
      }
      if ( ! (0==AV8SalExtAlb) )
      {
         edtSalExtAlb_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtSalExtAlb_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSalExtAlb_Enabled), 5, 0), true);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV12Insert_ManCod) )
      {
         edtManCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtManCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtManCod_Enabled), 5, 0), true);
      }
      else
      {
         edtManCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtManCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtManCod_Enabled), 5, 0), true);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV13Insert_TrnCod) )
      {
         edtTrnCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTrnCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTrnCod_Enabled), 5, 0), true);
      }
      else
      {
         edtTrnCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTrnCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTrnCod_Enabled), 5, 0), true);
      }
   }

   public void standaloneModal( )
   {
      if ( isDlt( )  && true /* Level */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Funcion no permitida, pulse funcion Fn", ""), 1, "");
         AnyError = (short)(1) ;
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV13Insert_TrnCod) )
      {
         A840TrnCod = AV13Insert_TrnCod ;
         n840TrnCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
         /* Using cursor T01PS11 */
         pr_default.execute(9, new Object[] {A396EmprCod, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod)});
         h840TrnCod = "" ;
         while ( (pr_default.getStatus(9) != 101) )
         {
            h840TrnCod = T01PS11_A13738TrnCNom[0] ;
            if (true) break;
         }
         pr_default.close(9);
         httpContext.ajax_rsp_assign_attri("", false, "h840TrnCod", h840TrnCod);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV12Insert_ManCod) )
      {
         A2248ManCod = AV12Insert_ManCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A2248ManCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2248ManCod), 4, 0));
         /* Using cursor T01PS12 */
         pr_default.execute(10, new Object[] {A396EmprCod, Short.valueOf(A2248ManCod)});
         h2248ManCod = "" ;
         while ( (pr_default.getStatus(10) != 101) )
         {
            h2248ManCod = T01PS12_A13847ManNomID[0] ;
            if (true) break;
         }
         pr_default.close(10);
         httpContext.ajax_rsp_assign_attri("", false, "h2248ManCod", h2248ManCod);
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
      if ( isIns( )  && GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A2256SalExtFec)) && ( Gx_BScreen == 0 ) )
      {
         A2256SalExtFec = GXutil.today( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2256SalExtFec", localUtil.format(A2256SalExtFec, "99/99/99"));
      }
      if ( isIns( )  && (0==A2257SalExtEst) && ( Gx_BScreen == 0 ) )
      {
         A2257SalExtEst = (byte)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2257SalExtEst", GXutil.str( A2257SalExtEst, 1, 0));
      }
      if ( isIns( )  && (0==A2258SalExtLis) && ( Gx_BScreen == 0 ) )
      {
         A2258SalExtLis = (byte)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2258SalExtLis", GXutil.str( A2258SalExtLis, 1, 0));
      }
      if ( isIns( )  && (GXutil.strcmp("", A7368SalExtUsu)==0) && ( Gx_BScreen == 0 ) )
      {
         A7368SalExtUsu = AV17UsurCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A7368SalExtUsu", A7368SalExtUsu);
      }
      if ( isIns( )  && (GXutil.strcmp("", A10742SalCodeID)==0) && ( Gx_BScreen == 0 ) )
      {
         A10742SalCodeID = " " ;
         httpContext.ajax_rsp_assign_attri("", false, "A10742SalCodeID", A10742SalCodeID);
      }
      if ( isIns( )  && (0==A10741SalEnvAT) && ( Gx_BScreen == 0 ) )
      {
         A10741SalEnvAT = (byte)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A10741SalEnvAT", GXutil.str( A10741SalEnvAT, 1, 0));
      }
      if ( isIns( )  && (GXutil.strcmp("", A10767SalExtAT)==0) && ( Gx_BScreen == 0 ) )
      {
         A10767SalExtAT = " " ;
         httpContext.ajax_rsp_assign_attri("", false, "A10767SalExtAT", A10767SalExtAT);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ( Gx_BScreen == 0 ) )
      {
         /* Using cursor T01PS9 */
         pr_default.execute(7, new Object[] {A396EmprCod, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod)});
         A841TrnNom = T01PS9_A841TrnNom[0] ;
         n841TrnNom = T01PS9_n841TrnNom[0] ;
         pr_default.close(7);
         /* Using cursor T01PS10 */
         pr_default.execute(8, new Object[] {A396EmprCod, Short.valueOf(A2248ManCod)});
         A2249ManNom = T01PS10_A2249ManNom[0] ;
         n2249ManNom = T01PS10_n2249ManNom[0] ;
         pr_default.close(8);
      }
   }

   public void load1PS305( )
   {
      /* Using cursor T01PS13 */
      pr_default.execute(11, new Object[] {A396EmprCod, Integer.valueOf(A2253SalExtAlb)});
      if ( (pr_default.getStatus(11) != 101) )
      {
         RcdFound305 = (short)(1) ;
         A3554SalExtObs = T01PS13_A3554SalExtObs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3554SalExtObs", A3554SalExtObs);
         A6396SalExtHor = T01PS13_A6396SalExtHor[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6396SalExtHor", A6396SalExtHor);
         A407EmprNom = T01PS13_A407EmprNom[0] ;
         n407EmprNom = T01PS13_n407EmprNom[0] ;
         A2249ManNom = T01PS13_A2249ManNom[0] ;
         n2249ManNom = T01PS13_n2249ManNom[0] ;
         A841TrnNom = T01PS13_A841TrnNom[0] ;
         n841TrnNom = T01PS13_n841TrnNom[0] ;
         A2256SalExtFec = T01PS13_A2256SalExtFec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2256SalExtFec", localUtil.format(A2256SalExtFec, "99/99/99"));
         A2257SalExtEst = T01PS13_A2257SalExtEst[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2257SalExtEst", GXutil.str( A2257SalExtEst, 1, 0));
         A2258SalExtLis = T01PS13_A2258SalExtLis[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2258SalExtLis", GXutil.str( A2258SalExtLis, 1, 0));
         A2254SalExtSec = T01PS13_A2254SalExtSec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2254SalExtSec", A2254SalExtSec);
         A6247SalExUln = T01PS13_A6247SalExUln[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6247SalExUln", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6247SalExUln), 4, 0));
         A6397SalExtMat = T01PS13_A6397SalExtMat[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6397SalExtMat", A6397SalExtMat);
         A7368SalExtUsu = T01PS13_A7368SalExtUsu[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7368SalExtUsu", A7368SalExtUsu);
         A7369SalExtRec = T01PS13_A7369SalExtRec[0] ;
         A8655SalFecEnt = T01PS13_A8655SalFecEnt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8655SalFecEnt", localUtil.format(A8655SalFecEnt, "99/99/99"));
         A11299SalExtFen = T01PS13_A11299SalExtFen[0] ;
         A10767SalExtAT = T01PS13_A10767SalExtAT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10767SalExtAT", A10767SalExtAT);
         A10742SalCodeID = T01PS13_A10742SalCodeID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10742SalCodeID", A10742SalCodeID);
         A10741SalEnvAT = T01PS13_A10741SalEnvAT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10741SalEnvAT", GXutil.str( A10741SalEnvAT, 1, 0));
         A10080SalSts = T01PS13_A10080SalSts[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10080SalSts", A10080SalSts);
         A10079SalFmdD = T01PS13_A10079SalFmdD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10079SalFmdD", A10079SalFmdD);
         A10078SalGrossT = T01PS13_A10078SalGrossT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10078SalGrossT", GXutil.ltrimstr( A10078SalGrossT, 13, 2));
         A10077SalFmd = T01PS13_A10077SalFmd[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10077SalFmd", A10077SalFmd);
         A10076SalFhh = T01PS13_A10076SalFhh[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10076SalFhh", localUtil.ttoc( A10076SalFhh, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A13244SalExtPre1 = T01PS13_A13244SalExtPre1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13244SalExtPre1", GXutil.ltrimstr( A13244SalExtPre1, 13, 5));
         A840TrnCod = T01PS13_A840TrnCod[0] ;
         n840TrnCod = T01PS13_n840TrnCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
         A2248ManCod = T01PS13_A2248ManCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2248ManCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2248ManCod), 4, 0));
         zm1PS305( -63) ;
      }
      pr_default.close(11);
      onLoadActions1PS305( ) ;
   }

   public void onLoadActions1PS305( )
   {
      if ( isIns( )  && (GXutil.strcmp("", A6396SalExtHor)==0) && true /* After */ )
      {
         GXt_char1 = A6396SalExtHor ;
         GXv_char13[0] = A396EmprCod ;
         GXv_char4[0] = GXt_char1 ;
         new app.phragr3(remoteHandle, context).execute( GXv_char13, GXv_char4) ;
         trabajosexternosenvio_impl.this.A396EmprCod = GXv_char13[0] ;
         trabajosexternosenvio_impl.this.GXt_char1 = GXv_char4[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A6396SalExtHor = GXt_char1 ;
         httpContext.ajax_rsp_assign_attri("", false, "A6396SalExtHor", A6396SalExtHor);
      }
      /* Using cursor T01PS14 */
      pr_default.execute(12, new Object[] {A396EmprCod, Short.valueOf(A2248ManCod)});
      h2248ManCod = "" ;
      while ( (pr_default.getStatus(12) != 101) )
      {
         h2248ManCod = T01PS14_A13847ManNomID[0] ;
         if (true) break;
      }
      pr_default.close(12);
      httpContext.ajax_rsp_assign_attri("", false, "h2248ManCod", h2248ManCod);
      /* Using cursor T01PS15 */
      pr_default.execute(13, new Object[] {A396EmprCod, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod)});
      h840TrnCod = "" ;
      while ( (pr_default.getStatus(13) != 101) )
      {
         h840TrnCod = T01PS15_A13738TrnCNom[0] ;
         if (true) break;
      }
      pr_default.close(13);
      httpContext.ajax_rsp_assign_attri("", false, "h840TrnCod", h840TrnCod);
   }

   public void checkExtendedTable1PS305( )
   {
      nIsDirty_305 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal( ) ;
      if ( (GXutil.strcmp("", h2248ManCod)==0) )
      {
         nIsDirty_305 = (short)(1) ;
         A2248ManCod = (short)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2248ManCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2248ManCod), 4, 0));
      }
      else
      {
         A13847ManNomID = h2248ManCod ;
         /* Using cursor T01PS16 */
         pr_default.execute(14, new Object[] {A13847ManNomID, A396EmprCod});
         A396EmprCod = T01PS16_A396EmprCod[0] ;
         A2248ManCod = T01PS16_A2248ManCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2248ManCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2248ManCod), 4, 0));
         A2248ManCod = T01PS16_A2248ManCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2248ManCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2248ManCod), 4, 0));
         if ( ! ( (pr_default.getStatus(14) == 101) ) )
         {
            pr_default.readNext(14);
            if ( ! ( (pr_default.getStatus(14) == 101) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Codigo-Nombre", "")}), 1, "MANCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtManCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
         }
         pr_default.close(14);
      }
      httpContext.ajax_rsp_assign_attri("", false, "h2248ManCod", h2248ManCod);
      if ( (GXutil.strcmp("", h840TrnCod)==0) )
      {
         nIsDirty_305 = (short)(1) ;
         A840TrnCod = (short)(0) ;
         n840TrnCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
      }
      else
      {
         A13738TrnCNom = h840TrnCod ;
         /* Using cursor T01PS17 */
         pr_default.execute(15, new Object[] {A13738TrnCNom, A396EmprCod});
         A396EmprCod = T01PS17_A396EmprCod[0] ;
         A840TrnCod = T01PS17_A840TrnCod[0] ;
         n840TrnCod = T01PS17_n840TrnCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
         A840TrnCod = T01PS17_A840TrnCod[0] ;
         n840TrnCod = T01PS17_n840TrnCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
         if ( ! ( (pr_default.getStatus(15) == 101) ) )
         {
            pr_default.readNext(15);
            if ( ! ( (pr_default.getStatus(15) == 101) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Codigo-Nombre", "")}), 1, "TRNCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTrnCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
         }
         pr_default.close(15);
      }
      httpContext.ajax_rsp_assign_attri("", false, "h840TrnCod", h840TrnCod);
      if ( isIns( )  && (GXutil.strcmp("", A6396SalExtHor)==0) && true /* After */ )
      {
         nIsDirty_305 = (short)(1) ;
         GXt_char1 = A6396SalExtHor ;
         GXv_char13[0] = A396EmprCod ;
         GXv_char4[0] = GXt_char1 ;
         new app.phragr3(remoteHandle, context).execute( GXv_char13, GXv_char4) ;
         trabajosexternosenvio_impl.this.A396EmprCod = GXv_char13[0] ;
         trabajosexternosenvio_impl.this.GXt_char1 = GXv_char4[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A6396SalExtHor = GXt_char1 ;
         httpContext.ajax_rsp_assign_attri("", false, "A6396SalExtHor", A6396SalExtHor);
      }
      if ( isIns( )  && true /* Level */ && true /* After */ && ! (0==A2253SalExtAlb) && (0==AV24firmad) )
      {
         GXv_char13[0] = A396EmprCod ;
         GXv_char4[0] = httpContext.getMessage( "EXTHDR", "") ;
         GXv_int12[0] = A2253SalExtAlb ;
         GXv_int11[0] = (byte)(AV30FlagAlb) ;
         GXv_int6[0] = (byte)(AV31FlagCont) ;
         new app.pmanext(remoteHandle, context).execute( GXv_char13, GXv_char4, GXv_int12, GXv_int11, GXv_int6) ;
         trabajosexternosenvio_impl.this.A396EmprCod = GXv_char13[0] ;
         trabajosexternosenvio_impl.this.A2253SalExtAlb = GXv_int12[0] ;
         trabajosexternosenvio_impl.this.AV30FlagAlb = GXv_int11[0] ;
         trabajosexternosenvio_impl.this.AV31FlagCont = GXv_int6[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A2253SalExtAlb", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2253SalExtAlb), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV30FlagAlb", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV30FlagAlb), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV31FlagCont", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV31FlagCont), 4, 0));
      }
      if ( isIns( )  && ( AV31FlagCont == 1 ) && (0==AV24firmad) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "ERROR: Intentamos dar de ALTA un ALBARAN > CONTADOR manualmente", ""), 1, "");
         AnyError = (short)(1) ;
      }
      if ( isIns( )  && ! (0==A2253SalExtAlb) && (0==AV30FlagAlb) && (0==AV24firmad) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "ATENCION, Va a dar de ALTA un Albaran MANUALMENTE", ""), 0, "");
      }
      if ( (GXutil.strcmp("", h2248ManCod)==0) )
      {
         nIsDirty_305 = (short)(1) ;
         A2248ManCod = (short)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2248ManCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2248ManCod), 4, 0));
      }
      else
      {
         A13847ManNomID = h2248ManCod ;
         /* Using cursor T01PS18 */
         pr_default.execute(16, new Object[] {A13847ManNomID, A396EmprCod});
         A2248ManCod = T01PS18_A2248ManCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2248ManCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2248ManCod), 4, 0));
         A2248ManCod = T01PS18_A2248ManCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2248ManCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2248ManCod), 4, 0));
         if ( ! ( (pr_default.getStatus(16) == 101) ) )
         {
            pr_default.readNext(16);
            if ( ! ( (pr_default.getStatus(16) == 101) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Codigo-Nombre", "")}), 1, "MANCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtManCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
         }
         pr_default.close(16);
      }
      httpContext.ajax_rsp_assign_attri("", false, "h2248ManCod", h2248ManCod);
      if ( (GXutil.strcmp("", h840TrnCod)==0) )
      {
         nIsDirty_305 = (short)(1) ;
         A840TrnCod = (short)(0) ;
         n840TrnCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
      }
      else
      {
         A13738TrnCNom = h840TrnCod ;
         /* Using cursor T01PS19 */
         pr_default.execute(17, new Object[] {A13738TrnCNom, A396EmprCod});
         A840TrnCod = T01PS19_A840TrnCod[0] ;
         n840TrnCod = T01PS19_n840TrnCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
         A840TrnCod = T01PS19_A840TrnCod[0] ;
         n840TrnCod = T01PS19_n840TrnCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
         if ( ! ( (pr_default.getStatus(17) == 101) ) )
         {
            pr_default.readNext(17);
            if ( ! ( (pr_default.getStatus(17) == 101) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Codigo-Nombre", "")}), 1, "TRNCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTrnCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
         }
         pr_default.close(17);
      }
      httpContext.ajax_rsp_assign_attri("", false, "h840TrnCod", h840TrnCod);
      /* Using cursor T01PS9 */
      pr_default.execute(7, new Object[] {A396EmprCod, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod)});
      if ( (pr_default.getStatus(7) == 101) )
      {
         if ( ! ( (0==A840TrnCod) && (GXutil.strcmp("", A13738TrnCNom)==0) || (0==A840TrnCod) && n840TrnCod || (GXutil.strcmp("", A396EmprCod)==0) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TRANSP", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TRNCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTrnCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A841TrnNom = T01PS9_A841TrnNom[0] ;
      n841TrnNom = T01PS9_n841TrnNom[0] ;
      pr_default.close(7);
      /* Using cursor T01PS10 */
      pr_default.execute(8, new Object[] {A396EmprCod, Short.valueOf(A2248ManCod)});
      if ( (pr_default.getStatus(8) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "MANUFA", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "MANCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtManCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A2249ManNom = T01PS10_A2249ManNom[0] ;
      n2249ManNom = T01PS10_n2249ManNom[0] ;
      pr_default.close(8);
   }

   public void closeExtendedTableCursors1PS305( )
   {
      pr_default.close(7);
      pr_default.close(8);
   }

   public void enableDisable( )
   {
   }

   public void gxload_65( String A396EmprCod ,
                          short A840TrnCod )
   {
      /* Using cursor T01PS20 */
      pr_default.execute(18, new Object[] {A396EmprCod, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod)});
      if ( (pr_default.getStatus(18) == 101) )
      {
         if ( ! ( (0==A840TrnCod) && (GXutil.strcmp("", A13738TrnCNom)==0) || (0==A840TrnCod) && n840TrnCod || (GXutil.strcmp("", A396EmprCod)==0) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TRANSP", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TRNCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTrnCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A841TrnNom = T01PS20_A841TrnNom[0] ;
      n841TrnNom = T01PS20_n841TrnNom[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A841TrnNom))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(18) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(18);
   }

   public void gxload_66( String A396EmprCod ,
                          short A2248ManCod )
   {
      /* Using cursor T01PS21 */
      pr_default.execute(19, new Object[] {A396EmprCod, Short.valueOf(A2248ManCod)});
      if ( (pr_default.getStatus(19) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "MANUFA", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "MANCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtManCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A2249ManNom = T01PS21_A2249ManNom[0] ;
      n2249ManNom = T01PS21_n2249ManNom[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A2249ManNom))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(19) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(19);
   }

   public void getKey1PS305( )
   {
      /* Using cursor T01PS22 */
      pr_default.execute(20, new Object[] {A396EmprCod, Integer.valueOf(A2253SalExtAlb)});
      if ( (pr_default.getStatus(20) != 101) )
      {
         RcdFound305 = (short)(1) ;
      }
      else
      {
         RcdFound305 = (short)(0) ;
      }
      pr_default.close(20);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01PS7 */
      pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A2253SalExtAlb)});
      if ( (pr_default.getStatus(5) != 101) && ( GXutil.strcmp(T01PS7_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1PS305( 63) ;
         RcdFound305 = (short)(1) ;
         A3554SalExtObs = T01PS7_A3554SalExtObs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3554SalExtObs", A3554SalExtObs);
         A2253SalExtAlb = T01PS7_A2253SalExtAlb[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2253SalExtAlb", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2253SalExtAlb), 8, 0));
         A6396SalExtHor = T01PS7_A6396SalExtHor[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6396SalExtHor", A6396SalExtHor);
         A2256SalExtFec = T01PS7_A2256SalExtFec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2256SalExtFec", localUtil.format(A2256SalExtFec, "99/99/99"));
         A2257SalExtEst = T01PS7_A2257SalExtEst[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2257SalExtEst", GXutil.str( A2257SalExtEst, 1, 0));
         A2258SalExtLis = T01PS7_A2258SalExtLis[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2258SalExtLis", GXutil.str( A2258SalExtLis, 1, 0));
         A2254SalExtSec = T01PS7_A2254SalExtSec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2254SalExtSec", A2254SalExtSec);
         A6247SalExUln = T01PS7_A6247SalExUln[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6247SalExUln", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6247SalExUln), 4, 0));
         A6397SalExtMat = T01PS7_A6397SalExtMat[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6397SalExtMat", A6397SalExtMat);
         A7368SalExtUsu = T01PS7_A7368SalExtUsu[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7368SalExtUsu", A7368SalExtUsu);
         A7369SalExtRec = T01PS7_A7369SalExtRec[0] ;
         A8655SalFecEnt = T01PS7_A8655SalFecEnt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8655SalFecEnt", localUtil.format(A8655SalFecEnt, "99/99/99"));
         A11299SalExtFen = T01PS7_A11299SalExtFen[0] ;
         A10767SalExtAT = T01PS7_A10767SalExtAT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10767SalExtAT", A10767SalExtAT);
         A10742SalCodeID = T01PS7_A10742SalCodeID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10742SalCodeID", A10742SalCodeID);
         A10741SalEnvAT = T01PS7_A10741SalEnvAT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10741SalEnvAT", GXutil.str( A10741SalEnvAT, 1, 0));
         A10080SalSts = T01PS7_A10080SalSts[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10080SalSts", A10080SalSts);
         A10079SalFmdD = T01PS7_A10079SalFmdD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10079SalFmdD", A10079SalFmdD);
         A10078SalGrossT = T01PS7_A10078SalGrossT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10078SalGrossT", GXutil.ltrimstr( A10078SalGrossT, 13, 2));
         A10077SalFmd = T01PS7_A10077SalFmd[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10077SalFmd", A10077SalFmd);
         A10076SalFhh = T01PS7_A10076SalFhh[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10076SalFhh", localUtil.ttoc( A10076SalFhh, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A13244SalExtPre1 = T01PS7_A13244SalExtPre1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13244SalExtPre1", GXutil.ltrimstr( A13244SalExtPre1, 13, 5));
         A840TrnCod = T01PS7_A840TrnCod[0] ;
         n840TrnCod = T01PS7_n840TrnCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
         A2248ManCod = T01PS7_A2248ManCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2248ManCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2248ManCod), 4, 0));
         O6247SalExUln = A6247SalExUln ;
         httpContext.ajax_rsp_assign_attri("", false, "A6247SalExUln", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6247SalExUln), 4, 0));
         Z396EmprCod = A396EmprCod ;
         Z2253SalExtAlb = A2253SalExtAlb ;
         sMode305 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load1PS305( ) ;
         if ( AnyError == 1 )
         {
            RcdFound305 = (short)(0) ;
            initializeNonKey1PS305( ) ;
         }
         Gx_mode = sMode305 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound305 = (short)(0) ;
         initializeNonKey1PS305( ) ;
         sMode305 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode305 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(5);
   }

   public void getEqualNoModal( )
   {
      getKey1PS305( ) ;
      if ( RcdFound305 == 0 )
      {
      }
      else
      {
      }
      getByPrimaryKey( ) ;
   }

   public void move_next( )
   {
      RcdFound305 = (short)(0) ;
      /* Using cursor T01PS23 */
      pr_default.execute(21, new Object[] {Integer.valueOf(A2253SalExtAlb), A396EmprCod});
      if ( (pr_default.getStatus(21) != 101) )
      {
         while ( (pr_default.getStatus(21) != 101) && ( ( T01PS23_A2253SalExtAlb[0] < A2253SalExtAlb ) ) && ( GXutil.strcmp(T01PS23_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(21);
         }
         if ( (pr_default.getStatus(21) != 101) && ( ( T01PS23_A2253SalExtAlb[0] > A2253SalExtAlb ) ) && ( GXutil.strcmp(T01PS23_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A2253SalExtAlb = T01PS23_A2253SalExtAlb[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A2253SalExtAlb", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2253SalExtAlb), 8, 0));
            RcdFound305 = (short)(1) ;
         }
      }
      pr_default.close(21);
   }

   public void move_previous( )
   {
      RcdFound305 = (short)(0) ;
      /* Using cursor T01PS24 */
      pr_default.execute(22, new Object[] {Integer.valueOf(A2253SalExtAlb), A396EmprCod});
      if ( (pr_default.getStatus(22) != 101) )
      {
         while ( (pr_default.getStatus(22) != 101) && ( ( T01PS24_A2253SalExtAlb[0] > A2253SalExtAlb ) ) && ( GXutil.strcmp(T01PS24_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(22);
         }
         if ( (pr_default.getStatus(22) != 101) && ( ( T01PS24_A2253SalExtAlb[0] < A2253SalExtAlb ) ) && ( GXutil.strcmp(T01PS24_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A2253SalExtAlb = T01PS24_A2253SalExtAlb[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A2253SalExtAlb", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2253SalExtAlb), 8, 0));
            RcdFound305 = (short)(1) ;
         }
      }
      pr_default.close(22);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1PS305( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         A6247SalExUln = O6247SalExUln ;
         httpContext.ajax_rsp_assign_attri("", false, "A6247SalExUln", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6247SalExUln), 4, 0));
         GX_FocusControl = edtSalExtFec_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1PS305( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound305 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A2253SalExtAlb != Z2253SalExtAlb ) )
            {
               A2253SalExtAlb = Z2253SalExtAlb ;
               httpContext.ajax_rsp_assign_attri("", false, "A2253SalExtAlb", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2253SalExtAlb), 8, 0));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "SALEXTALB");
               AnyError = (short)(1) ;
               GX_FocusControl = edtSalExtAlb_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               A6247SalExUln = O6247SalExUln ;
               httpContext.ajax_rsp_assign_attri("", false, "A6247SalExUln", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6247SalExUln), 4, 0));
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtSalExtFec_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               /* Update record */
               A6247SalExUln = O6247SalExUln ;
               httpContext.ajax_rsp_assign_attri("", false, "A6247SalExUln", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6247SalExUln), 4, 0));
               update1PS305( ) ;
               GX_FocusControl = edtSalExtFec_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A2253SalExtAlb != Z2253SalExtAlb ) )
            {
               /* Insert record */
               A6247SalExUln = O6247SalExUln ;
               httpContext.ajax_rsp_assign_attri("", false, "A6247SalExUln", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6247SalExUln), 4, 0));
               GX_FocusControl = edtSalExtFec_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1PS305( ) ;
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
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "SALEXTALB");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtSalExtAlb_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               else
               {
                  /* Insert record */
                  A6247SalExUln = O6247SalExUln ;
                  httpContext.ajax_rsp_assign_attri("", false, "A6247SalExUln", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6247SalExUln), 4, 0));
                  GX_FocusControl = edtSalExtFec_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1PS305( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A2253SalExtAlb != Z2253SalExtAlb ) )
      {
         A2253SalExtAlb = Z2253SalExtAlb ;
         httpContext.ajax_rsp_assign_attri("", false, "A2253SalExtAlb", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2253SalExtAlb), 8, 0));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "SALEXTALB");
         AnyError = (short)(1) ;
         GX_FocusControl = edtSalExtAlb_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         A6247SalExUln = O6247SalExUln ;
         httpContext.ajax_rsp_assign_attri("", false, "A6247SalExUln", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6247SalExUln), 4, 0));
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtSalExtFec_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( AnyError != 0 )
      {
      }
   }

   public void checkOptimisticConcurrency1PS305( )
   {
      if ( isDlt( ) )
      {
         if ( (GXutil.strcmp("", h2248ManCod)==0) )
         {
            A2248ManCod = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A2248ManCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2248ManCod), 4, 0));
         }
         else
         {
            A13847ManNomID = h2248ManCod ;
            /* Using cursor T01PS25 */
            pr_default.execute(23, new Object[] {A13847ManNomID, A396EmprCod});
            A396EmprCod = T01PS25_A396EmprCod[0] ;
            A2248ManCod = T01PS25_A2248ManCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A2248ManCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2248ManCod), 4, 0));
            A2248ManCod = T01PS25_A2248ManCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A2248ManCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2248ManCod), 4, 0));
            if ( ! ( (pr_default.getStatus(23) == 101) ) )
            {
               pr_default.readNext(23);
               if ( ! ( (pr_default.getStatus(23) == 101) ) )
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Codigo-Nombre", "")}), 1, "MANCOD");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtManCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
            }
            pr_default.close(23);
         }
         httpContext.ajax_rsp_assign_attri("", false, "h2248ManCod", h2248ManCod);
         if ( (GXutil.strcmp("", h840TrnCod)==0) )
         {
            A840TrnCod = (short)(0) ;
            n840TrnCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
         }
         else
         {
            A13738TrnCNom = h840TrnCod ;
            /* Using cursor T01PS26 */
            pr_default.execute(24, new Object[] {A13738TrnCNom, A396EmprCod});
            A396EmprCod = T01PS26_A396EmprCod[0] ;
            A840TrnCod = T01PS26_A840TrnCod[0] ;
            n840TrnCod = T01PS26_n840TrnCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
            A840TrnCod = T01PS26_A840TrnCod[0] ;
            n840TrnCod = T01PS26_n840TrnCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
            if ( ! ( (pr_default.getStatus(24) == 101) ) )
            {
               pr_default.readNext(24);
               if ( ! ( (pr_default.getStatus(24) == 101) ) )
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Codigo-Nombre", "")}), 1, "TRNCOD");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtTrnCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
            }
            pr_default.close(24);
         }
         httpContext.ajax_rsp_assign_attri("", false, "h840TrnCod", h840TrnCod);
      }
      if ( ! isIns( ) )
      {
         /* Using cursor T01PS6 */
         pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A2253SalExtAlb)});
         if ( (pr_default.getStatus(4) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCEXTSA"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(4) == 101) || ( GXutil.strcmp(Z6396SalExtHor, T01PS6_A6396SalExtHor[0]) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(Z2256SalExtFec), GXutil.resetTime(T01PS6_A2256SalExtFec[0])) ) || ( Z2257SalExtEst != T01PS6_A2257SalExtEst[0] ) || ( Z2258SalExtLis != T01PS6_A2258SalExtLis[0] ) || ( GXutil.strcmp(Z2254SalExtSec, T01PS6_A2254SalExtSec[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z6247SalExUln != T01PS6_A6247SalExUln[0] ) || ( GXutil.strcmp(Z6397SalExtMat, T01PS6_A6397SalExtMat[0]) != 0 ) || ( GXutil.strcmp(Z7368SalExtUsu, T01PS6_A7368SalExtUsu[0]) != 0 ) || ( Z7369SalExtRec != T01PS6_A7369SalExtRec[0] ) || !( GXutil.dateCompare(GXutil.resetTime(Z8655SalFecEnt), GXutil.resetTime(T01PS6_A8655SalFecEnt[0])) ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || !( GXutil.dateCompare(GXutil.resetTime(Z11299SalExtFen), GXutil.resetTime(T01PS6_A11299SalExtFen[0])) ) || ( GXutil.strcmp(Z10767SalExtAT, T01PS6_A10767SalExtAT[0]) != 0 ) || ( GXutil.strcmp(Z10742SalCodeID, T01PS6_A10742SalCodeID[0]) != 0 ) || ( Z10741SalEnvAT != T01PS6_A10741SalEnvAT[0] ) || ( GXutil.strcmp(Z10080SalSts, T01PS6_A10080SalSts[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z10079SalFmdD, T01PS6_A10079SalFmdD[0]) != 0 ) || ( DecimalUtil.compareTo(Z10078SalGrossT, T01PS6_A10078SalGrossT[0]) != 0 ) || ( GXutil.strcmp(Z10077SalFmd, T01PS6_A10077SalFmd[0]) != 0 ) || !( GXutil.dateCompare(Z10076SalFhh, T01PS6_A10076SalFhh[0]) ) || ( DecimalUtil.compareTo(Z13244SalExtPre1, T01PS6_A13244SalExtPre1[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z840TrnCod != T01PS6_A840TrnCod[0] ) || ( Z2248ManCod != T01PS6_A2248ManCod[0] ) )
         {
            if ( GXutil.strcmp(Z6396SalExtHor, T01PS6_A6396SalExtHor[0]) != 0 )
            {
               GXutil.writeLogln("trabajosexternosenvio:[seudo value changed for attri]"+"SalExtHor");
               GXutil.writeLogRaw("Old: ",Z6396SalExtHor);
               GXutil.writeLogRaw("Current: ",T01PS6_A6396SalExtHor[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z2256SalExtFec), GXutil.resetTime(T01PS6_A2256SalExtFec[0])) ) )
            {
               GXutil.writeLogln("trabajosexternosenvio:[seudo value changed for attri]"+"SalExtFec");
               GXutil.writeLogRaw("Old: ",Z2256SalExtFec);
               GXutil.writeLogRaw("Current: ",T01PS6_A2256SalExtFec[0]);
            }
            if ( Z2257SalExtEst != T01PS6_A2257SalExtEst[0] )
            {
               GXutil.writeLogln("trabajosexternosenvio:[seudo value changed for attri]"+"SalExtEst");
               GXutil.writeLogRaw("Old: ",Z2257SalExtEst);
               GXutil.writeLogRaw("Current: ",T01PS6_A2257SalExtEst[0]);
            }
            if ( Z2258SalExtLis != T01PS6_A2258SalExtLis[0] )
            {
               GXutil.writeLogln("trabajosexternosenvio:[seudo value changed for attri]"+"SalExtLis");
               GXutil.writeLogRaw("Old: ",Z2258SalExtLis);
               GXutil.writeLogRaw("Current: ",T01PS6_A2258SalExtLis[0]);
            }
            if ( GXutil.strcmp(Z2254SalExtSec, T01PS6_A2254SalExtSec[0]) != 0 )
            {
               GXutil.writeLogln("trabajosexternosenvio:[seudo value changed for attri]"+"SalExtSec");
               GXutil.writeLogRaw("Old: ",Z2254SalExtSec);
               GXutil.writeLogRaw("Current: ",T01PS6_A2254SalExtSec[0]);
            }
            if ( Z6247SalExUln != T01PS6_A6247SalExUln[0] )
            {
               GXutil.writeLogln("trabajosexternosenvio:[seudo value changed for attri]"+"SalExUln");
               GXutil.writeLogRaw("Old: ",Z6247SalExUln);
               GXutil.writeLogRaw("Current: ",T01PS6_A6247SalExUln[0]);
            }
            if ( GXutil.strcmp(Z6397SalExtMat, T01PS6_A6397SalExtMat[0]) != 0 )
            {
               GXutil.writeLogln("trabajosexternosenvio:[seudo value changed for attri]"+"SalExtMat");
               GXutil.writeLogRaw("Old: ",Z6397SalExtMat);
               GXutil.writeLogRaw("Current: ",T01PS6_A6397SalExtMat[0]);
            }
            if ( GXutil.strcmp(Z7368SalExtUsu, T01PS6_A7368SalExtUsu[0]) != 0 )
            {
               GXutil.writeLogln("trabajosexternosenvio:[seudo value changed for attri]"+"SalExtUsu");
               GXutil.writeLogRaw("Old: ",Z7368SalExtUsu);
               GXutil.writeLogRaw("Current: ",T01PS6_A7368SalExtUsu[0]);
            }
            if ( Z7369SalExtRec != T01PS6_A7369SalExtRec[0] )
            {
               GXutil.writeLogln("trabajosexternosenvio:[seudo value changed for attri]"+"SalExtRec");
               GXutil.writeLogRaw("Old: ",Z7369SalExtRec);
               GXutil.writeLogRaw("Current: ",T01PS6_A7369SalExtRec[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z8655SalFecEnt), GXutil.resetTime(T01PS6_A8655SalFecEnt[0])) ) )
            {
               GXutil.writeLogln("trabajosexternosenvio:[seudo value changed for attri]"+"SalFecEnt");
               GXutil.writeLogRaw("Old: ",Z8655SalFecEnt);
               GXutil.writeLogRaw("Current: ",T01PS6_A8655SalFecEnt[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z11299SalExtFen), GXutil.resetTime(T01PS6_A11299SalExtFen[0])) ) )
            {
               GXutil.writeLogln("trabajosexternosenvio:[seudo value changed for attri]"+"SalExtFen");
               GXutil.writeLogRaw("Old: ",Z11299SalExtFen);
               GXutil.writeLogRaw("Current: ",T01PS6_A11299SalExtFen[0]);
            }
            if ( GXutil.strcmp(Z10767SalExtAT, T01PS6_A10767SalExtAT[0]) != 0 )
            {
               GXutil.writeLogln("trabajosexternosenvio:[seudo value changed for attri]"+"SalExtAT");
               GXutil.writeLogRaw("Old: ",Z10767SalExtAT);
               GXutil.writeLogRaw("Current: ",T01PS6_A10767SalExtAT[0]);
            }
            if ( GXutil.strcmp(Z10742SalCodeID, T01PS6_A10742SalCodeID[0]) != 0 )
            {
               GXutil.writeLogln("trabajosexternosenvio:[seudo value changed for attri]"+"SalCodeID");
               GXutil.writeLogRaw("Old: ",Z10742SalCodeID);
               GXutil.writeLogRaw("Current: ",T01PS6_A10742SalCodeID[0]);
            }
            if ( Z10741SalEnvAT != T01PS6_A10741SalEnvAT[0] )
            {
               GXutil.writeLogln("trabajosexternosenvio:[seudo value changed for attri]"+"SalEnvAT");
               GXutil.writeLogRaw("Old: ",Z10741SalEnvAT);
               GXutil.writeLogRaw("Current: ",T01PS6_A10741SalEnvAT[0]);
            }
            if ( GXutil.strcmp(Z10080SalSts, T01PS6_A10080SalSts[0]) != 0 )
            {
               GXutil.writeLogln("trabajosexternosenvio:[seudo value changed for attri]"+"SalSts");
               GXutil.writeLogRaw("Old: ",Z10080SalSts);
               GXutil.writeLogRaw("Current: ",T01PS6_A10080SalSts[0]);
            }
            if ( GXutil.strcmp(Z10079SalFmdD, T01PS6_A10079SalFmdD[0]) != 0 )
            {
               GXutil.writeLogln("trabajosexternosenvio:[seudo value changed for attri]"+"SalFmdD");
               GXutil.writeLogRaw("Old: ",Z10079SalFmdD);
               GXutil.writeLogRaw("Current: ",T01PS6_A10079SalFmdD[0]);
            }
            if ( DecimalUtil.compareTo(Z10078SalGrossT, T01PS6_A10078SalGrossT[0]) != 0 )
            {
               GXutil.writeLogln("trabajosexternosenvio:[seudo value changed for attri]"+"SalGrossT");
               GXutil.writeLogRaw("Old: ",Z10078SalGrossT);
               GXutil.writeLogRaw("Current: ",T01PS6_A10078SalGrossT[0]);
            }
            if ( GXutil.strcmp(Z10077SalFmd, T01PS6_A10077SalFmd[0]) != 0 )
            {
               GXutil.writeLogln("trabajosexternosenvio:[seudo value changed for attri]"+"SalFmd");
               GXutil.writeLogRaw("Old: ",Z10077SalFmd);
               GXutil.writeLogRaw("Current: ",T01PS6_A10077SalFmd[0]);
            }
            if ( !( GXutil.dateCompare(Z10076SalFhh, T01PS6_A10076SalFhh[0]) ) )
            {
               GXutil.writeLogln("trabajosexternosenvio:[seudo value changed for attri]"+"SalFhh");
               GXutil.writeLogRaw("Old: ",Z10076SalFhh);
               GXutil.writeLogRaw("Current: ",T01PS6_A10076SalFhh[0]);
            }
            if ( DecimalUtil.compareTo(Z13244SalExtPre1, T01PS6_A13244SalExtPre1[0]) != 0 )
            {
               GXutil.writeLogln("trabajosexternosenvio:[seudo value changed for attri]"+"SalExtPre1");
               GXutil.writeLogRaw("Old: ",Z13244SalExtPre1);
               GXutil.writeLogRaw("Current: ",T01PS6_A13244SalExtPre1[0]);
            }
            if ( Z840TrnCod != T01PS6_A840TrnCod[0] )
            {
               GXutil.writeLogln("trabajosexternosenvio:[seudo value changed for attri]"+"TrnCod");
               GXutil.writeLogRaw("Old: ",Z840TrnCod);
               GXutil.writeLogRaw("Current: ",T01PS6_A840TrnCod[0]);
            }
            if ( Z2248ManCod != T01PS6_A2248ManCod[0] )
            {
               GXutil.writeLogln("trabajosexternosenvio:[seudo value changed for attri]"+"ManCod");
               GXutil.writeLogRaw("Old: ",Z2248ManCod);
               GXutil.writeLogRaw("Current: ",T01PS6_A2248ManCod[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPCEXTSA"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1PS305( )
   {
      beforeValidate1PS305( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1PS305( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1PS305( 0) ;
         checkOptimisticConcurrency1PS305( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1PS305( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1PS305( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01PS27 */
                  pr_default.execute(25, new Object[] {Integer.valueOf(A2253SalExtAlb), A6396SalExtHor, A2256SalExtFec, Byte.valueOf(A2257SalExtEst), Byte.valueOf(A2258SalExtLis), A2254SalExtSec, Short.valueOf(A6247SalExUln), A6397SalExtMat, A7368SalExtUsu, Integer.valueOf(A7369SalExtRec), A8655SalFecEnt, A11299SalExtFen, A10767SalExtAT, A10742SalCodeID, Byte.valueOf(A10741SalEnvAT), A10080SalSts, A10079SalFmdD, A10078SalGrossT, A10077SalFmd, A10076SalFhh, A3554SalExtObs, A13244SalExtPre1, A396EmprCod, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod), Short.valueOf(A2248ManCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCEXTSA");
                  if ( (pr_default.getStatus(25) == 1) )
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
                        processLevel1PS305( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption1PS0( ) ;
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
            load1PS305( ) ;
         }
         endLevel1PS305( ) ;
      }
      closeExtendedTableCursors1PS305( ) ;
   }

   public void update1PS305( )
   {
      beforeValidate1PS305( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1PS305( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1PS305( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1PS305( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1PS305( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01PS28 */
                  pr_default.execute(26, new Object[] {A6396SalExtHor, A2256SalExtFec, Byte.valueOf(A2257SalExtEst), Byte.valueOf(A2258SalExtLis), A2254SalExtSec, Short.valueOf(A6247SalExUln), A6397SalExtMat, A7368SalExtUsu, Integer.valueOf(A7369SalExtRec), A8655SalFecEnt, A11299SalExtFen, A10767SalExtAT, A10742SalCodeID, Byte.valueOf(A10741SalEnvAT), A10080SalSts, A10079SalFmdD, A10078SalGrossT, A10077SalFmd, A10076SalFhh, A3554SalExtObs, A13244SalExtPre1, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod), Short.valueOf(A2248ManCod), A396EmprCod, Integer.valueOf(A2253SalExtAlb)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCEXTSA");
                  if ( (pr_default.getStatus(26) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCEXTSA"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1PS305( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel1PS305( ) ;
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
         endLevel1PS305( ) ;
      }
      closeExtendedTableCursors1PS305( ) ;
   }

   public void deferredUpdate1PS305( )
   {
   }

   public void delete( )
   {
      beforeValidate1PS305( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1PS305( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1PS305( ) ;
         afterConfirm1PS305( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1PS305( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01PS29 */
               pr_default.execute(27, new Object[] {A396EmprCod, Integer.valueOf(A2253SalExtAlb)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCEXTSA");
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
      sMode305 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1PS305( ) ;
      Gx_mode = sMode305 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1PS305( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         if ( isIns( )  && true /* Level */ && true /* After */ && ! (0==A2253SalExtAlb) && (0==AV24firmad) )
         {
            GXv_char13[0] = A396EmprCod ;
            GXv_char4[0] = httpContext.getMessage( "EXTHDR", "") ;
            GXv_int12[0] = A2253SalExtAlb ;
            GXv_int11[0] = (byte)(AV30FlagAlb) ;
            GXv_int6[0] = (byte)(AV31FlagCont) ;
            new app.pmanext(remoteHandle, context).execute( GXv_char13, GXv_char4, GXv_int12, GXv_int11, GXv_int6) ;
            trabajosexternosenvio_impl.this.A396EmprCod = GXv_char13[0] ;
            trabajosexternosenvio_impl.this.A2253SalExtAlb = GXv_int12[0] ;
            trabajosexternosenvio_impl.this.AV30FlagAlb = GXv_int11[0] ;
            trabajosexternosenvio_impl.this.AV31FlagCont = GXv_int6[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            httpContext.ajax_rsp_assign_attri("", false, "A2253SalExtAlb", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2253SalExtAlb), 8, 0));
            httpContext.ajax_rsp_assign_attri("", false, "AV30FlagAlb", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV30FlagAlb), 4, 0));
            httpContext.ajax_rsp_assign_attri("", false, "AV31FlagCont", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV31FlagCont), 4, 0));
         }
         if ( isIns( )  && ( AV31FlagCont == 1 ) && (0==AV24firmad) )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "ERROR: Intentamos dar de ALTA un ALBARAN > CONTADOR manualmente", ""), 1, "");
            AnyError = (short)(1) ;
         }
         if ( isIns( )  && ! (0==A2253SalExtAlb) && (0==AV30FlagAlb) && (0==AV24firmad) )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "ATENCION, Va a dar de ALTA un Albaran MANUALMENTE", ""), 0, "");
         }
         /* Using cursor T01PS30 */
         pr_default.execute(28, new Object[] {A396EmprCod, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod)});
         A841TrnNom = T01PS30_A841TrnNom[0] ;
         n841TrnNom = T01PS30_n841TrnNom[0] ;
         pr_default.close(28);
         /* Using cursor T01PS31 */
         pr_default.execute(29, new Object[] {A396EmprCod, Short.valueOf(A2248ManCod)});
         A2249ManNom = T01PS31_A2249ManNom[0] ;
         n2249ManNom = T01PS31_n2249ManNom[0] ;
         pr_default.close(29);
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T01PS32 */
         pr_default.execute(30, new Object[] {A396EmprCod, Integer.valueOf(A2253SalExtAlb)});
         if ( (pr_default.getStatus(30) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LEXTSA", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(30);
      }
   }

   public void processNestedLevel1PS910( )
   {
      s6247SalExUln = O6247SalExUln ;
      httpContext.ajax_rsp_assign_attri("", false, "A6247SalExUln", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6247SalExUln), 4, 0));
      nGXsfl_84_idx = 0 ;
      while ( nGXsfl_84_idx < nRC_GXsfl_84 )
      {
         readRow1PS910( ) ;
         if ( ( nRcdExists_910 != 0 ) || ( nIsMod_910 != 0 ) )
         {
            standaloneNotModal1PS910( ) ;
            getKey1PS910( ) ;
            if ( ( nRcdExists_910 == 0 ) && ( nRcdDeleted_910 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert1PS910( ) ;
            }
            else
            {
               if ( RcdFound910 != 0 )
               {
                  if ( ( nRcdDeleted_910 != 0 ) && ( nRcdExists_910 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete1PS910( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_910 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update1PS910( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_910 == 0 )
                  {
                     GXCCtl = "SALEXNLN_" + sGXsfl_84_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtSalExNln_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
            O6247SalExUln = A6247SalExUln ;
            httpContext.ajax_rsp_assign_attri("", false, "A6247SalExUln", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6247SalExUln), 4, 0));
         }
         httpContext.changePostValue( edtSalExNln_Internalname, GXutil.ltrim( localUtil.ntoc( A6248SalExNln, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarCod_Internalname, GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarCodReo_Internalname, GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarCodPar_Internalname, GXutil.rtrim( A130BarCodPar)) ;
         httpContext.changePostValue( edtCliCod_Internalname, GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarSer_Internalname, GXutil.rtrim( A212BarSer)) ;
         httpContext.changePostValue( edtBarSerDsc_Internalname, GXutil.rtrim( A1652BarSerDsc)) ;
         httpContext.changePostValue( edtBarColNom_Internalname, GXutil.rtrim( A135BarColNom)) ;
         httpContext.changePostValue( edtBarColNum_Internalname, GXutil.ltrim( localUtil.ntoc( A136BarColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarNomCli_Internalname, GXutil.rtrim( A1234BarNomCli)) ;
         httpContext.changePostValue( edtFasCodn_Internalname, GXutil.rtrim( A6558FasCodn)) ;
         httpContext.changePostValue( edtavImgprompt_Internalname, AV32imgPrompt) ;
         httpContext.changePostValue( edtOrdLin_Internalname, GXutil.ltrim( localUtil.ntoc( A654OrdLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtSalExCoE_Internalname, GXutil.ltrim( localUtil.ntoc( A6257SalExCoE, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtSalExKgE_Internalname, GXutil.ltrim( localUtil.ntoc( A6256SalExKgE, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtSalExMtE_Internalname, GXutil.ltrim( localUtil.ntoc( A6258SalExMtE, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarSit_Internalname, GXutil.ltrim( localUtil.ntoc( A213BarSit, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMetrosRece_Internalname, GXutil.ltrim( localUtil.ntoc( A13849MetrosRece, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtKilosRecep_Internalname, GXutil.ltrim( localUtil.ntoc( A13850KilosRecep, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPiezasRece_Internalname, GXutil.ltrim( localUtil.ntoc( A13851PiezasRece, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarExt_Internalname, GXutil.ltrim( localUtil.ntoc( A2265BarExt, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z6248SalExNln_"+sGXsfl_84_idx, GXutil.ltrim( localUtil.ntoc( Z6248SalExNln, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z6256SalExKgE_"+sGXsfl_84_idx, GXutil.ltrim( localUtil.ntoc( Z6256SalExKgE, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z6258SalExMtE_"+sGXsfl_84_idx, GXutil.ltrim( localUtil.ntoc( Z6258SalExMtE, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z6257SalExCoE_"+sGXsfl_84_idx, GXutil.ltrim( localUtil.ntoc( Z6257SalExCoE, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z654OrdLin_"+sGXsfl_84_idx, GXutil.ltrim( localUtil.ntoc( Z654OrdLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z6249SalExObs_"+sGXsfl_84_idx, GXutil.rtrim( Z6249SalExObs)) ;
         httpContext.changePostValue( "ZT_"+"Z6255SalExMtR_"+sGXsfl_84_idx, GXutil.ltrim( localUtil.ntoc( Z6255SalExMtR, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z6251SalExKgR_"+sGXsfl_84_idx, GXutil.ltrim( localUtil.ntoc( Z6251SalExKgR, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z6252SalExCoR_"+sGXsfl_84_idx, GXutil.ltrim( localUtil.ntoc( Z6252SalExCoR, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z6558FasCodn_"+sGXsfl_84_idx, GXutil.rtrim( Z6558FasCodn)) ;
         httpContext.changePostValue( "ZT_"+"Z129BarCod_"+sGXsfl_84_idx, GXutil.ltrim( localUtil.ntoc( Z129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z132BarCodReo_"+sGXsfl_84_idx, GXutil.ltrim( localUtil.ntoc( Z132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z130BarCodPar_"+sGXsfl_84_idx, GXutil.rtrim( Z130BarCodPar)) ;
         httpContext.changePostValue( "T6257SalExCoE_"+sGXsfl_84_idx, GXutil.ltrim( localUtil.ntoc( O6257SalExCoE, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T6258SalExMtE_"+sGXsfl_84_idx, GXutil.ltrim( localUtil.ntoc( O6258SalExMtE, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T6256SalExKgE_"+sGXsfl_84_idx, GXutil.ltrim( localUtil.ntoc( O6256SalExKgE, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_910_"+sGXsfl_84_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_910, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_910_"+sGXsfl_84_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_910, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_910_"+sGXsfl_84_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_910, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_910 != 0 )
         {
            httpContext.changePostValue( "SALEXNLN_"+sGXsfl_84_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtSalExNln_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARCOD_"+sGXsfl_84_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARCODREO_"+sGXsfl_84_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarCodReo_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARCODPAR_"+sGXsfl_84_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarCodPar_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CLICOD_"+sGXsfl_84_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCliCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARSER_"+sGXsfl_84_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarSer_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARSERDSC_"+sGXsfl_84_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarSerDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARCOLNOM_"+sGXsfl_84_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarColNom_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARCOLNUM_"+sGXsfl_84_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarColNum_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARNOMCLI_"+sGXsfl_84_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarNomCli_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FASCODN_"+sGXsfl_84_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasCodn_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "vIMGPROMPT_"+sGXsfl_84_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavImgprompt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "vIMGPROMPT_"+sGXsfl_84_idx+"Link", GXutil.rtrim( edtavImgprompt_Link)) ;
            httpContext.changePostValue( "vIMGPROMPT_"+sGXsfl_84_idx+"Visible", GXutil.ltrim( localUtil.ntoc( edtavImgprompt_Visible, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ORDLIN_"+sGXsfl_84_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOrdLin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "SALEXCOE_"+sGXsfl_84_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtSalExCoE_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "SALEXKGE_"+sGXsfl_84_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtSalExKgE_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "SALEXMTE_"+sGXsfl_84_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtSalExMtE_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARSIT_"+sGXsfl_84_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarSit_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "METROSRECE_"+sGXsfl_84_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMetrosRece_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "KILOSRECEP_"+sGXsfl_84_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtKilosRecep_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PIEZASRECE_"+sGXsfl_84_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPiezasRece_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BAREXT_"+sGXsfl_84_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarExt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll1PS910( ) ;
      if ( AnyError != 0 )
      {
         O6247SalExUln = s6247SalExUln ;
         httpContext.ajax_rsp_assign_attri("", false, "A6247SalExUln", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6247SalExUln), 4, 0));
      }
      nRcdExists_910 = (short)(0) ;
      nIsMod_910 = (short)(0) ;
      nRcdDeleted_910 = (short)(0) ;
   }

   public void processLevel1PS305( )
   {
      /* Save parent mode. */
      sMode305 = Gx_mode ;
      processNestedLevel1PS910( ) ;
      if ( AnyError != 0 )
      {
         O6247SalExUln = s6247SalExUln ;
         httpContext.ajax_rsp_assign_attri("", false, "A6247SalExUln", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6247SalExUln), 4, 0));
      }
      /* Restore parent mode. */
      Gx_mode = sMode305 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
      /* Using cursor T01PS33 */
      pr_default.execute(31, new Object[] {Short.valueOf(A6247SalExUln), A396EmprCod, Integer.valueOf(A2253SalExtAlb)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCEXTSA");
   }

   public void endLevel1PS305( )
   {
      pr_default.close(4);
      if ( AnyError == 0 )
      {
         beforeComplete1PS305( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "trabajosexternosenvio");
         if ( AnyError == 0 )
         {
            confirmValues1PS0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "trabajosexternosenvio");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1PS305( )
   {
      /* Scan By routine */
      /* Using cursor T01PS34 */
      pr_default.execute(32, new Object[] {A396EmprCod});
      RcdFound305 = (short)(0) ;
      if ( (pr_default.getStatus(32) != 101) )
      {
         RcdFound305 = (short)(1) ;
         A2253SalExtAlb = T01PS34_A2253SalExtAlb[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2253SalExtAlb", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2253SalExtAlb), 8, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1PS305( )
   {
      /* Scan next routine */
      pr_default.readNext(32);
      RcdFound305 = (short)(0) ;
      if ( (pr_default.getStatus(32) != 101) )
      {
         RcdFound305 = (short)(1) ;
         A2253SalExtAlb = T01PS34_A2253SalExtAlb[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2253SalExtAlb", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2253SalExtAlb), 8, 0));
      }
   }

   public void scanEnd1PS305( )
   {
      pr_default.close(32);
   }

   public void afterConfirm1PS305( )
   {
      /* After Confirm Rules */
      if ( (0==A2253SalExtAlb) && true /* Level */ && true /* After */ )
      {
         GXv_int12[0] = A2253SalExtAlb ;
         new app.pnumdoc(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "EXTHDR", ""), GXv_int12) ;
         trabajosexternosenvio_impl.this.A2253SalExtAlb = GXv_int12[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2253SalExtAlb", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2253SalExtAlb), 8, 0));
      }
   }

   public void beforeInsert1PS305( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1PS305( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1PS305( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1PS305( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1PS305( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1PS305( )
   {
      edtSalExtAlb_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSalExtAlb_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSalExtAlb_Enabled), 5, 0), true);
      edtSalExtFec_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSalExtFec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSalExtFec_Enabled), 5, 0), true);
      edtSalExtHor_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSalExtHor_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSalExtHor_Enabled), 5, 0), true);
      edtSalFecEnt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSalFecEnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSalFecEnt_Enabled), 5, 0), true);
      edtSalExtUsu_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSalExtUsu_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSalExtUsu_Enabled), 5, 0), true);
      edtSalSts_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSalSts_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSalSts_Enabled), 5, 0), true);
      edtManCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtManCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtManCod_Enabled), 5, 0), true);
      edtSalExtPre1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSalExtPre1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSalExtPre1_Enabled), 5, 0), true);
      edtTrnCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTrnCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTrnCod_Enabled), 5, 0), true);
      edtSalExtMat_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSalExtMat_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSalExtMat_Enabled), 5, 0), true);
      edtSalExtObs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSalExtObs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSalExtObs_Enabled), 5, 0), true);
      edtSalExtEst_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSalExtEst_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSalExtEst_Enabled), 5, 0), true);
      edtSalExtLis_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSalExtLis_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSalExtLis_Enabled), 5, 0), true);
      edtSalExtSec_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSalExtSec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSalExtSec_Enabled), 5, 0), true);
      edtSalExUln_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSalExUln_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSalExUln_Enabled), 5, 0), true);
      edtSalExtAT_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSalExtAT_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSalExtAT_Enabled), 5, 0), true);
      edtSalCodeID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSalCodeID_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSalCodeID_Enabled), 5, 0), true);
      edtSalEnvAT_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSalEnvAT_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSalEnvAT_Enabled), 5, 0), true);
      edtSalFmdD_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSalFmdD_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSalFmdD_Enabled), 5, 0), true);
      edtSalGrossT_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSalGrossT_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSalGrossT_Enabled), 5, 0), true);
      edtSalFmd_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSalFmd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSalFmd_Enabled), 5, 0), true);
      edtSalFhh_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSalFhh_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSalFhh_Enabled), 5, 0), true);
   }

   public void zm1PS910( int GX_JID )
   {
      if ( ( GX_JID == 67 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z6256SalExKgE = T01PS3_A6256SalExKgE[0] ;
            Z6258SalExMtE = T01PS3_A6258SalExMtE[0] ;
            Z6257SalExCoE = T01PS3_A6257SalExCoE[0] ;
            Z654OrdLin = T01PS3_A654OrdLin[0] ;
            Z6249SalExObs = T01PS3_A6249SalExObs[0] ;
            Z6255SalExMtR = T01PS3_A6255SalExMtR[0] ;
            Z6251SalExKgR = T01PS3_A6251SalExKgR[0] ;
            Z6252SalExCoR = T01PS3_A6252SalExCoR[0] ;
            Z6558FasCodn = T01PS3_A6558FasCodn[0] ;
            Z129BarCod = T01PS3_A129BarCod[0] ;
            Z132BarCodReo = T01PS3_A132BarCodReo[0] ;
            Z130BarCodPar = T01PS3_A130BarCodPar[0] ;
         }
         else
         {
            Z6256SalExKgE = A6256SalExKgE ;
            Z6258SalExMtE = A6258SalExMtE ;
            Z6257SalExCoE = A6257SalExCoE ;
            Z654OrdLin = A654OrdLin ;
            Z6249SalExObs = A6249SalExObs ;
            Z6255SalExMtR = A6255SalExMtR ;
            Z6251SalExKgR = A6251SalExKgR ;
            Z6252SalExCoR = A6252SalExCoR ;
            Z6558FasCodn = A6558FasCodn ;
            Z129BarCod = A129BarCod ;
            Z132BarCodReo = A132BarCodReo ;
            Z130BarCodPar = A130BarCodPar ;
         }
      }
      if ( GX_JID == -67 )
      {
         Z2253SalExtAlb = A2253SalExtAlb ;
         Z6248SalExNln = A6248SalExNln ;
         Z6256SalExKgE = A6256SalExKgE ;
         Z6258SalExMtE = A6258SalExMtE ;
         Z6257SalExCoE = A6257SalExCoE ;
         Z654OrdLin = A654OrdLin ;
         Z6249SalExObs = A6249SalExObs ;
         Z6255SalExMtR = A6255SalExMtR ;
         Z6251SalExKgR = A6251SalExKgR ;
         Z6252SalExCoR = A6252SalExCoR ;
         Z396EmprCod = A396EmprCod ;
         Z6558FasCodn = A6558FasCodn ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z2265BarExt = A2265BarExt ;
         Z212BarSer = A212BarSer ;
         Z1652BarSerDsc = A1652BarSerDsc ;
         Z135BarColNom = A135BarColNom ;
         Z136BarColNum = A136BarColNum ;
         Z1234BarNomCli = A1234BarNomCli ;
         Z213BarSit = A213BarSit ;
         Z252CliCod = A252CliCod ;
      }
   }

   public void standaloneNotModal1PS910( )
   {
      edtBarColNum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarColNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarColNum_Enabled), 5, 0), !bGXsfl_84_Refreshing);
      edtBarSit_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarSit_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarSit_Enabled), 5, 0), !bGXsfl_84_Refreshing);
      edtMetrosRece_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMetrosRece_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetrosRece_Enabled), 5, 0), !bGXsfl_84_Refreshing);
      edtKilosRecep_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtKilosRecep_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtKilosRecep_Enabled), 5, 0), !bGXsfl_84_Refreshing);
      edtPiezasRece_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPiezasRece_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPiezasRece_Enabled), 5, 0), !bGXsfl_84_Refreshing);
      edtBarExt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarExt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarExt_Enabled), 5, 0), !bGXsfl_84_Refreshing);
      edtSalExUln_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSalExUln_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSalExUln_Enabled), 5, 0), true);
      edtSalExUln_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSalExUln_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSalExUln_Enabled), 5, 0), true);
   }

   public void standaloneModal1PS910( )
   {
      if ( isDlt( )  && true /* Level */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Funcion no permitida, pulse funcion Fn", ""), 1, "");
         AnyError = (short)(1) ;
      }
      if ( isIns( )  )
      {
         A6247SalExUln = (short)(O6247SalExUln+5) ;
         httpContext.ajax_rsp_assign_attri("", false, "A6247SalExUln", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6247SalExUln), 4, 0));
      }
      if ( isIns( )  && ( Gx_BScreen == 1 ) )
      {
         A6248SalExNln = A6247SalExUln ;
      }
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtSalExNln_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtSalExNln_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSalExNln_Enabled), 5, 0), !bGXsfl_84_Refreshing);
      }
      else
      {
         edtSalExNln_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtSalExNln_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSalExNln_Enabled), 5, 0), !bGXsfl_84_Refreshing);
      }
   }

   public void load1PS910( )
   {
      /* Using cursor T01PS35 */
      pr_default.execute(33, new Object[] {A396EmprCod, Integer.valueOf(A2253SalExtAlb), Short.valueOf(A6248SalExNln)});
      if ( (pr_default.getStatus(33) != 101) )
      {
         RcdFound910 = (short)(1) ;
         A6256SalExKgE = T01PS35_A6256SalExKgE[0] ;
         A6258SalExMtE = T01PS35_A6258SalExMtE[0] ;
         A6257SalExCoE = T01PS35_A6257SalExCoE[0] ;
         A2265BarExt = T01PS35_A2265BarExt[0] ;
         n2265BarExt = T01PS35_n2265BarExt[0] ;
         A212BarSer = T01PS35_A212BarSer[0] ;
         A1652BarSerDsc = T01PS35_A1652BarSerDsc[0] ;
         A654OrdLin = T01PS35_A654OrdLin[0] ;
         A6249SalExObs = T01PS35_A6249SalExObs[0] ;
         A135BarColNom = T01PS35_A135BarColNom[0] ;
         A136BarColNum = T01PS35_A136BarColNum[0] ;
         A1234BarNomCli = T01PS35_A1234BarNomCli[0] ;
         A213BarSit = T01PS35_A213BarSit[0] ;
         A6255SalExMtR = T01PS35_A6255SalExMtR[0] ;
         A6251SalExKgR = T01PS35_A6251SalExKgR[0] ;
         A6252SalExCoR = T01PS35_A6252SalExCoR[0] ;
         A6558FasCodn = T01PS35_A6558FasCodn[0] ;
         A129BarCod = T01PS35_A129BarCod[0] ;
         A132BarCodReo = T01PS35_A132BarCodReo[0] ;
         A130BarCodPar = T01PS35_A130BarCodPar[0] ;
         A252CliCod = T01PS35_A252CliCod[0] ;
         n252CliCod = T01PS35_n252CliCod[0] ;
         zm1PS910( -67) ;
      }
      pr_default.close(33);
      onLoadActions1PS910( ) ;
   }

   public void onLoadActions1PS910( )
   {
      if ( isIns( )  )
      {
         GXt_decimal14 = A6256SalExKgE ;
         GXv_decimal15[0] = GXt_decimal14 ;
         new app.pkgsext(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, GXv_decimal15) ;
         trabajosexternosenvio_impl.this.GXt_decimal14 = GXv_decimal15[0] ;
         A6256SalExKgE = GXt_decimal14 ;
      }
      if ( isIns( )  )
      {
         GXt_decimal14 = A6258SalExMtE ;
         GXv_char13[0] = A396EmprCod ;
         GXv_int12[0] = A129BarCod ;
         GXv_int11[0] = A132BarCodReo ;
         GXv_char4[0] = A130BarCodPar ;
         GXv_decimal15[0] = GXt_decimal14 ;
         new app.pmtsext(remoteHandle, context).execute( GXv_char13, GXv_int12, GXv_int11, GXv_char4, GXv_decimal15) ;
         trabajosexternosenvio_impl.this.A396EmprCod = GXv_char13[0] ;
         trabajosexternosenvio_impl.this.A129BarCod = GXv_int12[0] ;
         trabajosexternosenvio_impl.this.A132BarCodReo = GXv_int11[0] ;
         trabajosexternosenvio_impl.this.A130BarCodPar = GXv_char4[0] ;
         trabajosexternosenvio_impl.this.GXt_decimal14 = GXv_decimal15[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A6258SalExMtE = GXt_decimal14 ;
      }
      if ( isIns( )  )
      {
         GXt_int16 = A6257SalExCoE ;
         GXv_char13[0] = A396EmprCod ;
         GXv_int12[0] = A129BarCod ;
         GXv_int11[0] = A132BarCodReo ;
         GXv_char4[0] = A130BarCodPar ;
         GXv_int8[0] = GXt_int16 ;
         new app.ppzsext(remoteHandle, context).execute( GXv_char13, GXv_int12, GXv_int11, GXv_char4, GXv_int8) ;
         trabajosexternosenvio_impl.this.A396EmprCod = GXv_char13[0] ;
         trabajosexternosenvio_impl.this.A129BarCod = GXv_int12[0] ;
         trabajosexternosenvio_impl.this.A132BarCodReo = GXv_int11[0] ;
         trabajosexternosenvio_impl.this.A130BarCodPar = GXv_char4[0] ;
         trabajosexternosenvio_impl.this.GXt_int16 = GXv_int8[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A6257SalExCoE = GXt_int16 ;
      }
      A13850KilosRecep = (A6256SalExKgE.subtract(A6251SalExKgR)) ;
      AV20OldKg = O6256SalExKgE ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20OldKg", GXutil.ltrimstr( AV20OldKg, 9, 2));
      A13851PiezasRece = (int)((A6257SalExCoE-A6252SalExCoR)) ;
      AV22OldPz = O6257SalExCoE ;
      httpContext.ajax_rsp_assign_attri("", false, "AV22OldPz", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV22OldPz), 6, 0));
      A13849MetrosRece = (A6258SalExMtE.subtract(A6255SalExMtR)) ;
      AV21OldMt = O6258SalExMtE ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21OldMt", GXutil.ltrimstr( AV21OldMt, 9, 2));
   }

   public void checkExtendedTable1PS910( )
   {
      nIsDirty_910 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal1PS910( ) ;
      /* Using cursor T01PS4 */
      pr_default.execute(2, new Object[] {A396EmprCod, A6558FasCodn});
      if ( (pr_default.getStatus(2) == 101) )
      {
         GXCCtl = "FASCODN_" + sGXsfl_84_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "FASPRO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtFasCodn_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(2);
      /* Using cursor T01PS5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(3) == 101) )
      {
         GXCCtl = "BARCODPAR_" + sGXsfl_84_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TXPBARCAD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A2265BarExt = T01PS5_A2265BarExt[0] ;
      n2265BarExt = T01PS5_n2265BarExt[0] ;
      A212BarSer = T01PS5_A212BarSer[0] ;
      A1652BarSerDsc = T01PS5_A1652BarSerDsc[0] ;
      A135BarColNom = T01PS5_A135BarColNom[0] ;
      A136BarColNum = T01PS5_A136BarColNum[0] ;
      A1234BarNomCli = T01PS5_A1234BarNomCli[0] ;
      A213BarSit = T01PS5_A213BarSit[0] ;
      A252CliCod = T01PS5_A252CliCod[0] ;
      n252CliCod = T01PS5_n252CliCod[0] ;
      pr_default.close(3);
      if ( A213BarSit >= 9 )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Hoja de Ruta CERRADA", ""), 1, "");
         AnyError = (short)(1) ;
      }
      if ( isIns( )  )
      {
         nIsDirty_910 = (short)(1) ;
         GXt_decimal14 = A6256SalExKgE ;
         GXv_decimal15[0] = GXt_decimal14 ;
         new app.pkgsext(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, GXv_decimal15) ;
         trabajosexternosenvio_impl.this.GXt_decimal14 = GXv_decimal15[0] ;
         A6256SalExKgE = GXt_decimal14 ;
      }
      if ( isIns( )  )
      {
         nIsDirty_910 = (short)(1) ;
         GXt_decimal14 = A6258SalExMtE ;
         GXv_char13[0] = A396EmprCod ;
         GXv_int12[0] = A129BarCod ;
         GXv_int11[0] = A132BarCodReo ;
         GXv_char4[0] = A130BarCodPar ;
         GXv_decimal15[0] = GXt_decimal14 ;
         new app.pmtsext(remoteHandle, context).execute( GXv_char13, GXv_int12, GXv_int11, GXv_char4, GXv_decimal15) ;
         trabajosexternosenvio_impl.this.A396EmprCod = GXv_char13[0] ;
         trabajosexternosenvio_impl.this.A129BarCod = GXv_int12[0] ;
         trabajosexternosenvio_impl.this.A132BarCodReo = GXv_int11[0] ;
         trabajosexternosenvio_impl.this.A130BarCodPar = GXv_char4[0] ;
         trabajosexternosenvio_impl.this.GXt_decimal14 = GXv_decimal15[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A6258SalExMtE = GXt_decimal14 ;
      }
      if ( isIns( )  )
      {
         nIsDirty_910 = (short)(1) ;
         GXt_int16 = A6257SalExCoE ;
         GXv_char13[0] = A396EmprCod ;
         GXv_int12[0] = A129BarCod ;
         GXv_int11[0] = A132BarCodReo ;
         GXv_char4[0] = A130BarCodPar ;
         GXv_int8[0] = GXt_int16 ;
         new app.ppzsext(remoteHandle, context).execute( GXv_char13, GXv_int12, GXv_int11, GXv_char4, GXv_int8) ;
         trabajosexternosenvio_impl.this.A396EmprCod = GXv_char13[0] ;
         trabajosexternosenvio_impl.this.A129BarCod = GXv_int12[0] ;
         trabajosexternosenvio_impl.this.A132BarCodReo = GXv_int11[0] ;
         trabajosexternosenvio_impl.this.A130BarCodPar = GXv_char4[0] ;
         trabajosexternosenvio_impl.this.GXt_int16 = GXv_int8[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A6257SalExCoE = GXt_int16 ;
      }
      if ( ( isIns( )  || isUpd( )  ) && true /* After */ && ! (GXutil.strcmp("", A6558FasCodn)==0) )
      {
         GXv_char13[0] = A396EmprCod ;
         GXv_int12[0] = A129BarCod ;
         GXv_int11[0] = A132BarCodReo ;
         GXv_char4[0] = A130BarCodPar ;
         GXv_char3[0] = A6558FasCodn ;
         GXv_char2[0] = AV23Msg_err ;
         new app.pfasanx(remoteHandle, context).execute( GXv_char13, GXv_int12, GXv_int11, GXv_char4, GXv_char3, GXv_char2) ;
         trabajosexternosenvio_impl.this.A396EmprCod = GXv_char13[0] ;
         trabajosexternosenvio_impl.this.A129BarCod = GXv_int12[0] ;
         trabajosexternosenvio_impl.this.A132BarCodReo = GXv_int11[0] ;
         trabajosexternosenvio_impl.this.A130BarCodPar = GXv_char4[0] ;
         trabajosexternosenvio_impl.this.A6558FasCodn = GXv_char3[0] ;
         trabajosexternosenvio_impl.this.AV23Msg_err = GXv_char2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "AV23Msg_err", AV23Msg_err);
      }
      if ( ( isIns( )  || isUpd( )  ) && true /* After */ && ! (GXutil.strcmp("", A6558FasCodn)==0) && ! (GXutil.strcmp("", AV23Msg_err)==0) )
      {
         GXCCtl = "FASCODN_" + sGXsfl_84_idx ;
         httpContext.GX_msglist.addItem(AV23Msg_err, 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtFasCodn_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( (GXutil.strcmp("", A6558FasCodn)==0) && true /* After */ )
      {
         GXCCtl = "FASCODN_" + sGXsfl_84_idx ;
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Falta Codigo Fase", ""), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtFasCodn_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( true /* After */ && ( A654OrdLin > 0 ) )
      {
         GXv_char13[0] = A396EmprCod ;
         GXv_int12[0] = A129BarCod ;
         GXv_int11[0] = A132BarCodReo ;
         GXv_char4[0] = A130BarCodPar ;
         GXv_int9[0] = A654OrdLin ;
         GXv_char3[0] = AV19msgerr ;
         new app.exorden(remoteHandle, context).execute( GXv_char13, GXv_int12, GXv_int11, GXv_char4, GXv_int9, GXv_char3) ;
         trabajosexternosenvio_impl.this.A396EmprCod = GXv_char13[0] ;
         trabajosexternosenvio_impl.this.A129BarCod = GXv_int12[0] ;
         trabajosexternosenvio_impl.this.A132BarCodReo = GXv_int11[0] ;
         trabajosexternosenvio_impl.this.A130BarCodPar = GXv_char4[0] ;
         trabajosexternosenvio_impl.this.A654OrdLin = GXv_int9[0] ;
         trabajosexternosenvio_impl.this.AV19msgerr = GXv_char3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "AV19msgerr", AV19msgerr);
      }
      if ( ! (GXutil.strcmp("", AV19msgerr)==0) && true /* After */ && ( A654OrdLin > 0 ) )
      {
         GXCCtl = "ORDLIN_" + sGXsfl_84_idx ;
         httpContext.GX_msglist.addItem(AV19msgerr, 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtOrdLin_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( (0==A654OrdLin) && true /* After */ )
      {
         GXCCtl = "ORDLIN_" + sGXsfl_84_idx ;
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Falta Orden Fase", ""), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtOrdLin_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      nIsDirty_910 = (short)(1) ;
      A13850KilosRecep = (A6256SalExKgE.subtract(A6251SalExKgR)) ;
      AV20OldKg = O6256SalExKgE ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20OldKg", GXutil.ltrimstr( AV20OldKg, 9, 2));
      nIsDirty_910 = (short)(1) ;
      A13851PiezasRece = (int)((A6257SalExCoE-A6252SalExCoR)) ;
      AV22OldPz = O6257SalExCoE ;
      httpContext.ajax_rsp_assign_attri("", false, "AV22OldPz", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV22OldPz), 6, 0));
      nIsDirty_910 = (short)(1) ;
      A13849MetrosRece = (A6258SalExMtE.subtract(A6255SalExMtR)) ;
      AV21OldMt = O6258SalExMtE ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21OldMt", GXutil.ltrimstr( AV21OldMt, 9, 2));
   }

   public void closeExtendedTableCursors1PS910( )
   {
      pr_default.close(2);
      pr_default.close(3);
   }

   public void enableDisable1PS910( )
   {
   }

   public void gxload_68( String A396EmprCod ,
                          String A6558FasCodn )
   {
      /* Using cursor T01PS36 */
      pr_default.execute(34, new Object[] {A396EmprCod, A6558FasCodn});
      if ( (pr_default.getStatus(34) == 101) )
      {
         GXCCtl = "FASCODN_" + sGXsfl_84_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "FASPRO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtFasCodn_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "]") ;
      if ( (pr_default.getStatus(34) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(34);
   }

   public void gxload_69( String A396EmprCod ,
                          int A129BarCod ,
                          byte A132BarCodReo ,
                          String A130BarCodPar )
   {
      /* Using cursor T01PS37 */
      pr_default.execute(35, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(35) == 101) )
      {
         GXCCtl = "BARCODPAR_" + sGXsfl_84_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TXPBARCAD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A2265BarExt = T01PS37_A2265BarExt[0] ;
      n2265BarExt = T01PS37_n2265BarExt[0] ;
      A212BarSer = T01PS37_A212BarSer[0] ;
      A1652BarSerDsc = T01PS37_A1652BarSerDsc[0] ;
      A135BarColNom = T01PS37_A135BarColNom[0] ;
      A136BarColNum = T01PS37_A136BarColNum[0] ;
      A1234BarNomCli = T01PS37_A1234BarNomCli[0] ;
      A213BarSit = T01PS37_A213BarSit[0] ;
      A252CliCod = T01PS37_A252CliCod[0] ;
      n252CliCod = T01PS37_n252CliCod[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A2265BarExt, (byte)(1), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A212BarSer))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A1652BarSerDsc))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A135BarColNom))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A136BarColNum, (byte)(6), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A1234BarNomCli))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A213BarSit, (byte)(2), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(35) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(35);
   }

   public void getKey1PS910( )
   {
      /* Using cursor T01PS38 */
      pr_default.execute(36, new Object[] {A396EmprCod, Integer.valueOf(A2253SalExtAlb), Short.valueOf(A6248SalExNln)});
      if ( (pr_default.getStatus(36) != 101) )
      {
         RcdFound910 = (short)(1) ;
      }
      else
      {
         RcdFound910 = (short)(0) ;
      }
      pr_default.close(36);
   }

   public void getByPrimaryKey1PS910( )
   {
      /* Using cursor T01PS3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A2253SalExtAlb), Short.valueOf(A6248SalExNln)});
      if ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(T01PS3_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1PS910( 67) ;
         RcdFound910 = (short)(1) ;
         initializeNonKey1PS910( ) ;
         A6248SalExNln = T01PS3_A6248SalExNln[0] ;
         A6256SalExKgE = T01PS3_A6256SalExKgE[0] ;
         A6258SalExMtE = T01PS3_A6258SalExMtE[0] ;
         A6257SalExCoE = T01PS3_A6257SalExCoE[0] ;
         A654OrdLin = T01PS3_A654OrdLin[0] ;
         A6249SalExObs = T01PS3_A6249SalExObs[0] ;
         A6255SalExMtR = T01PS3_A6255SalExMtR[0] ;
         A6251SalExKgR = T01PS3_A6251SalExKgR[0] ;
         A6252SalExCoR = T01PS3_A6252SalExCoR[0] ;
         A6558FasCodn = T01PS3_A6558FasCodn[0] ;
         A129BarCod = T01PS3_A129BarCod[0] ;
         A132BarCodReo = T01PS3_A132BarCodReo[0] ;
         A130BarCodPar = T01PS3_A130BarCodPar[0] ;
         O6257SalExCoE = A6257SalExCoE ;
         O6258SalExMtE = A6258SalExMtE ;
         O6256SalExKgE = A6256SalExKgE ;
         Z396EmprCod = A396EmprCod ;
         Z2253SalExtAlb = A2253SalExtAlb ;
         Z6248SalExNln = A6248SalExNln ;
         sMode910 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load1PS910( ) ;
         Gx_mode = sMode910 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound910 = (short)(0) ;
         initializeNonKey1PS910( ) ;
         sMode910 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1PS910( ) ;
         Gx_mode = sMode910 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1PS910( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency1PS910( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01PS2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A2253SalExtAlb), Short.valueOf(A6248SalExNln)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPEXHDPZ"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( DecimalUtil.compareTo(Z6256SalExKgE, T01PS2_A6256SalExKgE[0]) != 0 ) || ( DecimalUtil.compareTo(Z6258SalExMtE, T01PS2_A6258SalExMtE[0]) != 0 ) || ( Z6257SalExCoE != T01PS2_A6257SalExCoE[0] ) || ( Z654OrdLin != T01PS2_A654OrdLin[0] ) || ( GXutil.strcmp(Z6249SalExObs, T01PS2_A6249SalExObs[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( DecimalUtil.compareTo(Z6255SalExMtR, T01PS2_A6255SalExMtR[0]) != 0 ) || ( DecimalUtil.compareTo(Z6251SalExKgR, T01PS2_A6251SalExKgR[0]) != 0 ) || ( Z6252SalExCoR != T01PS2_A6252SalExCoR[0] ) || ( GXutil.strcmp(Z6558FasCodn, T01PS2_A6558FasCodn[0]) != 0 ) || ( Z129BarCod != T01PS2_A129BarCod[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z132BarCodReo != T01PS2_A132BarCodReo[0] ) || ( GXutil.strcmp(Z130BarCodPar, T01PS2_A130BarCodPar[0]) != 0 ) )
         {
            if ( DecimalUtil.compareTo(Z6256SalExKgE, T01PS2_A6256SalExKgE[0]) != 0 )
            {
               GXutil.writeLogln("trabajosexternosenvio:[seudo value changed for attri]"+"SalExKgE");
               GXutil.writeLogRaw("Old: ",Z6256SalExKgE);
               GXutil.writeLogRaw("Current: ",T01PS2_A6256SalExKgE[0]);
            }
            if ( DecimalUtil.compareTo(Z6258SalExMtE, T01PS2_A6258SalExMtE[0]) != 0 )
            {
               GXutil.writeLogln("trabajosexternosenvio:[seudo value changed for attri]"+"SalExMtE");
               GXutil.writeLogRaw("Old: ",Z6258SalExMtE);
               GXutil.writeLogRaw("Current: ",T01PS2_A6258SalExMtE[0]);
            }
            if ( Z6257SalExCoE != T01PS2_A6257SalExCoE[0] )
            {
               GXutil.writeLogln("trabajosexternosenvio:[seudo value changed for attri]"+"SalExCoE");
               GXutil.writeLogRaw("Old: ",Z6257SalExCoE);
               GXutil.writeLogRaw("Current: ",T01PS2_A6257SalExCoE[0]);
            }
            if ( Z654OrdLin != T01PS2_A654OrdLin[0] )
            {
               GXutil.writeLogln("trabajosexternosenvio:[seudo value changed for attri]"+"OrdLin");
               GXutil.writeLogRaw("Old: ",Z654OrdLin);
               GXutil.writeLogRaw("Current: ",T01PS2_A654OrdLin[0]);
            }
            if ( GXutil.strcmp(Z6249SalExObs, T01PS2_A6249SalExObs[0]) != 0 )
            {
               GXutil.writeLogln("trabajosexternosenvio:[seudo value changed for attri]"+"SalExObs");
               GXutil.writeLogRaw("Old: ",Z6249SalExObs);
               GXutil.writeLogRaw("Current: ",T01PS2_A6249SalExObs[0]);
            }
            if ( DecimalUtil.compareTo(Z6255SalExMtR, T01PS2_A6255SalExMtR[0]) != 0 )
            {
               GXutil.writeLogln("trabajosexternosenvio:[seudo value changed for attri]"+"SalExMtR");
               GXutil.writeLogRaw("Old: ",Z6255SalExMtR);
               GXutil.writeLogRaw("Current: ",T01PS2_A6255SalExMtR[0]);
            }
            if ( DecimalUtil.compareTo(Z6251SalExKgR, T01PS2_A6251SalExKgR[0]) != 0 )
            {
               GXutil.writeLogln("trabajosexternosenvio:[seudo value changed for attri]"+"SalExKgR");
               GXutil.writeLogRaw("Old: ",Z6251SalExKgR);
               GXutil.writeLogRaw("Current: ",T01PS2_A6251SalExKgR[0]);
            }
            if ( Z6252SalExCoR != T01PS2_A6252SalExCoR[0] )
            {
               GXutil.writeLogln("trabajosexternosenvio:[seudo value changed for attri]"+"SalExCoR");
               GXutil.writeLogRaw("Old: ",Z6252SalExCoR);
               GXutil.writeLogRaw("Current: ",T01PS2_A6252SalExCoR[0]);
            }
            if ( GXutil.strcmp(Z6558FasCodn, T01PS2_A6558FasCodn[0]) != 0 )
            {
               GXutil.writeLogln("trabajosexternosenvio:[seudo value changed for attri]"+"FasCodn");
               GXutil.writeLogRaw("Old: ",Z6558FasCodn);
               GXutil.writeLogRaw("Current: ",T01PS2_A6558FasCodn[0]);
            }
            if ( Z129BarCod != T01PS2_A129BarCod[0] )
            {
               GXutil.writeLogln("trabajosexternosenvio:[seudo value changed for attri]"+"BarCod");
               GXutil.writeLogRaw("Old: ",Z129BarCod);
               GXutil.writeLogRaw("Current: ",T01PS2_A129BarCod[0]);
            }
            if ( Z132BarCodReo != T01PS2_A132BarCodReo[0] )
            {
               GXutil.writeLogln("trabajosexternosenvio:[seudo value changed for attri]"+"BarCodReo");
               GXutil.writeLogRaw("Old: ",Z132BarCodReo);
               GXutil.writeLogRaw("Current: ",T01PS2_A132BarCodReo[0]);
            }
            if ( GXutil.strcmp(Z130BarCodPar, T01PS2_A130BarCodPar[0]) != 0 )
            {
               GXutil.writeLogln("trabajosexternosenvio:[seudo value changed for attri]"+"BarCodPar");
               GXutil.writeLogRaw("Old: ",Z130BarCodPar);
               GXutil.writeLogRaw("Current: ",T01PS2_A130BarCodPar[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPEXHDPZ"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1PS910( )
   {
      beforeValidate1PS910( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1PS910( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1PS910( 0) ;
         checkOptimisticConcurrency1PS910( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1PS910( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1PS910( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01PS39 */
                  pr_default.execute(37, new Object[] {Integer.valueOf(A2253SalExtAlb), Short.valueOf(A6248SalExNln), A6256SalExKgE, A6258SalExMtE, Integer.valueOf(A6257SalExCoE), Short.valueOf(A654OrdLin), A6249SalExObs, A6255SalExMtR, A6251SalExKgR, Integer.valueOf(A6252SalExCoR), A396EmprCod, A6558FasCodn, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPEXHDPZ");
                  if ( (pr_default.getStatus(37) == 1) )
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
            load1PS910( ) ;
         }
         endLevel1PS910( ) ;
      }
      closeExtendedTableCursors1PS910( ) ;
   }

   public void update1PS910( )
   {
      beforeValidate1PS910( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1PS910( ) ;
      }
      if ( ( nIsMod_910 != 0 ) || ( nIsDirty_910 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency1PS910( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm1PS910( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate1PS910( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T01PS40 */
                     pr_default.execute(38, new Object[] {A6256SalExKgE, A6258SalExMtE, Integer.valueOf(A6257SalExCoE), Short.valueOf(A654OrdLin), A6249SalExObs, A6255SalExMtR, A6251SalExKgR, Integer.valueOf(A6252SalExCoR), A6558FasCodn, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A396EmprCod, Integer.valueOf(A2253SalExtAlb), Short.valueOf(A6248SalExNln)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPEXHDPZ");
                     if ( (pr_default.getStatus(38) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPEXHDPZ"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate1PS910( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        if ( true /* After */ )
                        {
                           GXv_char13[0] = A396EmprCod ;
                           GXv_int9[0] = A2248ManCod ;
                           GXv_char4[0] = A6558FasCodn ;
                           GXv_char3[0] = httpContext.getMessage( "E", "") ;
                           GXv_int12[0] = A2253SalExtAlb ;
                           GXv_int8[0] = A129BarCod ;
                           GXv_int11[0] = A132BarCodReo ;
                           GXv_char2[0] = A130BarCodPar ;
                           GXv_decimal15[0] = A6256SalExKgE ;
                           GXv_decimal17[0] = AV20OldKg ;
                           GXv_decimal18[0] = A6258SalExMtE ;
                           GXv_decimal19[0] = AV21OldMt ;
                           GXv_int20[0] = (short)(A6257SalExCoE) ;
                           GXv_int21[0] = (short)(AV22OldPz) ;
                           GXv_date10[0] = A2256SalExtFec ;
                           GXv_int22[0] = A6248SalExNln ;
                           new app.pmmvexhd(remoteHandle, context).execute( GXv_char13, GXv_int9, GXv_char4, GXv_char3, GXv_int12, GXv_int8, GXv_int11, GXv_char2, GXv_decimal15, GXv_decimal17, GXv_decimal18, GXv_decimal19, GXv_int20, GXv_int21, GXv_date10, GXv_int22) ;
                           trabajosexternosenvio_impl.this.A396EmprCod = GXv_char13[0] ;
                           trabajosexternosenvio_impl.this.A2248ManCod = GXv_int9[0] ;
                           trabajosexternosenvio_impl.this.A6558FasCodn = GXv_char4[0] ;
                           trabajosexternosenvio_impl.this.A2253SalExtAlb = GXv_int12[0] ;
                           trabajosexternosenvio_impl.this.A129BarCod = GXv_int8[0] ;
                           trabajosexternosenvio_impl.this.A132BarCodReo = GXv_int11[0] ;
                           trabajosexternosenvio_impl.this.A130BarCodPar = GXv_char2[0] ;
                           trabajosexternosenvio_impl.this.A6256SalExKgE = GXv_decimal15[0] ;
                           trabajosexternosenvio_impl.this.AV20OldKg = GXv_decimal17[0] ;
                           trabajosexternosenvio_impl.this.A6258SalExMtE = GXv_decimal18[0] ;
                           trabajosexternosenvio_impl.this.AV21OldMt = GXv_decimal19[0] ;
                           trabajosexternosenvio_impl.this.A6257SalExCoE = GXv_int20[0] ;
                           trabajosexternosenvio_impl.this.AV22OldPz = GXv_int21[0] ;
                           trabajosexternosenvio_impl.this.A2256SalExtFec = GXv_date10[0] ;
                           trabajosexternosenvio_impl.this.A6248SalExNln = GXv_int22[0] ;
                           httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
                           httpContext.ajax_rsp_assign_attri("", false, "A2248ManCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2248ManCod), 4, 0));
                           httpContext.ajax_rsp_assign_attri("", false, "A2253SalExtAlb", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2253SalExtAlb), 8, 0));
                           httpContext.ajax_rsp_assign_attri("", false, "AV20OldKg", GXutil.ltrimstr( AV20OldKg, 9, 2));
                           httpContext.ajax_rsp_assign_attri("", false, "AV21OldMt", GXutil.ltrimstr( AV21OldMt, 9, 2));
                           httpContext.ajax_rsp_assign_attri("", false, "AV22OldPz", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV22OldPz), 6, 0));
                           httpContext.ajax_rsp_assign_attri("", false, "A2256SalExtFec", localUtil.format(A2256SalExtFec, "99/99/99"));
                        }
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey1PS910( ) ;
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
            endLevel1PS910( ) ;
         }
      }
      closeExtendedTableCursors1PS910( ) ;
   }

   public void deferredUpdate1PS910( )
   {
   }

   public void delete1PS910( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1PS910( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1PS910( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1PS910( ) ;
         afterConfirm1PS910( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1PS910( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01PS41 */
               pr_default.execute(39, new Object[] {A396EmprCod, Integer.valueOf(A2253SalExtAlb), Short.valueOf(A6248SalExNln)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPEXHDPZ");
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
      sMode910 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1PS910( ) ;
      Gx_mode = sMode910 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1PS910( )
   {
      standaloneModal1PS910( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         if ( ( isIns( )  || isUpd( )  ) && true /* After */ && ! (GXutil.strcmp("", A6558FasCodn)==0) )
         {
            GXv_char13[0] = A396EmprCod ;
            GXv_int12[0] = A129BarCod ;
            GXv_int11[0] = A132BarCodReo ;
            GXv_char4[0] = A130BarCodPar ;
            GXv_char3[0] = A6558FasCodn ;
            GXv_char2[0] = AV23Msg_err ;
            new app.pfasanx(remoteHandle, context).execute( GXv_char13, GXv_int12, GXv_int11, GXv_char4, GXv_char3, GXv_char2) ;
            trabajosexternosenvio_impl.this.A396EmprCod = GXv_char13[0] ;
            trabajosexternosenvio_impl.this.A129BarCod = GXv_int12[0] ;
            trabajosexternosenvio_impl.this.A132BarCodReo = GXv_int11[0] ;
            trabajosexternosenvio_impl.this.A130BarCodPar = GXv_char4[0] ;
            trabajosexternosenvio_impl.this.A6558FasCodn = GXv_char3[0] ;
            trabajosexternosenvio_impl.this.AV23Msg_err = GXv_char2[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            httpContext.ajax_rsp_assign_attri("", false, "AV23Msg_err", AV23Msg_err);
         }
         if ( ( isIns( )  || isUpd( )  ) && true /* After */ && ! (GXutil.strcmp("", A6558FasCodn)==0) && ! (GXutil.strcmp("", AV23Msg_err)==0) )
         {
            GXCCtl = "FASCODN_" + sGXsfl_84_idx ;
            httpContext.GX_msglist.addItem(AV23Msg_err, 1, GXCCtl);
            AnyError = (short)(1) ;
            GX_FocusControl = edtFasCodn_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         /* Using cursor T01PS42 */
         pr_default.execute(40, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         A2265BarExt = T01PS42_A2265BarExt[0] ;
         n2265BarExt = T01PS42_n2265BarExt[0] ;
         A212BarSer = T01PS42_A212BarSer[0] ;
         A1652BarSerDsc = T01PS42_A1652BarSerDsc[0] ;
         A135BarColNom = T01PS42_A135BarColNom[0] ;
         A136BarColNum = T01PS42_A136BarColNum[0] ;
         A1234BarNomCli = T01PS42_A1234BarNomCli[0] ;
         A213BarSit = T01PS42_A213BarSit[0] ;
         A252CliCod = T01PS42_A252CliCod[0] ;
         n252CliCod = T01PS42_n252CliCod[0] ;
         pr_default.close(40);
         AV20OldKg = O6256SalExKgE ;
         httpContext.ajax_rsp_assign_attri("", false, "AV20OldKg", GXutil.ltrimstr( AV20OldKg, 9, 2));
         AV22OldPz = O6257SalExCoE ;
         httpContext.ajax_rsp_assign_attri("", false, "AV22OldPz", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV22OldPz), 6, 0));
         AV21OldMt = O6258SalExMtE ;
         httpContext.ajax_rsp_assign_attri("", false, "AV21OldMt", GXutil.ltrimstr( AV21OldMt, 9, 2));
         A13849MetrosRece = (A6258SalExMtE.subtract(A6255SalExMtR)) ;
         A13850KilosRecep = (A6256SalExKgE.subtract(A6251SalExKgR)) ;
         A13851PiezasRece = (int)((A6257SalExCoE-A6252SalExCoR)) ;
      }
   }

   public void endLevel1PS910( )
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

   public void scanStart1PS910( )
   {
      /* Scan By routine */
      /* Using cursor T01PS43 */
      pr_default.execute(41, new Object[] {Integer.valueOf(A2253SalExtAlb), A396EmprCod});
      RcdFound910 = (short)(0) ;
      if ( (pr_default.getStatus(41) != 101) )
      {
         RcdFound910 = (short)(1) ;
         A6248SalExNln = T01PS43_A6248SalExNln[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1PS910( )
   {
      /* Scan next routine */
      pr_default.readNext(41);
      RcdFound910 = (short)(0) ;
      if ( (pr_default.getStatus(41) != 101) )
      {
         RcdFound910 = (short)(1) ;
         A6248SalExNln = T01PS43_A6248SalExNln[0] ;
      }
   }

   public void scanEnd1PS910( )
   {
      pr_default.close(41);
   }

   public void afterConfirm1PS910( )
   {
      /* After Confirm Rules */
      if ( isIns( )  && ! (GXutil.strcmp("", A6558FasCodn)==0) && true /* After */ )
      {
         GXv_char13[0] = A396EmprCod ;
         GXv_int22[0] = A2248ManCod ;
         GXv_int12[0] = A2253SalExtAlb ;
         GXv_int21[0] = A6248SalExNln ;
         GXv_date10[0] = A2256SalExtFec ;
         GXv_int8[0] = A129BarCod ;
         GXv_int11[0] = A132BarCodReo ;
         GXv_char4[0] = A130BarCodPar ;
         GXv_int20[0] = A654OrdLin ;
         GXv_char3[0] = A6558FasCodn ;
         GXv_decimal19[0] = A6256SalExKgE ;
         GXv_decimal18[0] = A6258SalExMtE ;
         GXv_int23[0] = A6257SalExCoE ;
         new app.trabajosexternos.pwork01(remoteHandle, context).execute( GXv_char13, GXv_int22, GXv_int12, GXv_int21, GXv_date10, GXv_int8, GXv_int11, GXv_char4, GXv_int20, GXv_char3, GXv_decimal19, GXv_decimal18, GXv_int23) ;
         trabajosexternosenvio_impl.this.A396EmprCod = GXv_char13[0] ;
         trabajosexternosenvio_impl.this.A2248ManCod = GXv_int22[0] ;
         trabajosexternosenvio_impl.this.A2253SalExtAlb = GXv_int12[0] ;
         trabajosexternosenvio_impl.this.A6248SalExNln = GXv_int21[0] ;
         trabajosexternosenvio_impl.this.A2256SalExtFec = GXv_date10[0] ;
         trabajosexternosenvio_impl.this.A129BarCod = GXv_int8[0] ;
         trabajosexternosenvio_impl.this.A132BarCodReo = GXv_int11[0] ;
         trabajosexternosenvio_impl.this.A130BarCodPar = GXv_char4[0] ;
         trabajosexternosenvio_impl.this.A654OrdLin = GXv_int20[0] ;
         trabajosexternosenvio_impl.this.A6558FasCodn = GXv_char3[0] ;
         trabajosexternosenvio_impl.this.A6256SalExKgE = GXv_decimal19[0] ;
         trabajosexternosenvio_impl.this.A6258SalExMtE = GXv_decimal18[0] ;
         trabajosexternosenvio_impl.this.A6257SalExCoE = GXv_int23[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A2248ManCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2248ManCod), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A2253SalExtAlb", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2253SalExtAlb), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A2256SalExtFec", localUtil.format(A2256SalExtFec, "99/99/99"));
      }
      if ( isUpd( )  && ! (GXutil.strcmp("", A6558FasCodn)==0) && true /* After */ )
      {
         GXv_char13[0] = A396EmprCod ;
         GXv_int22[0] = A2248ManCod ;
         GXv_int23[0] = A2253SalExtAlb ;
         GXv_int21[0] = A6248SalExNln ;
         GXv_date10[0] = A2256SalExtFec ;
         GXv_int12[0] = A129BarCod ;
         GXv_int11[0] = A132BarCodReo ;
         GXv_char4[0] = A130BarCodPar ;
         GXv_int20[0] = A654OrdLin ;
         GXv_char3[0] = A6558FasCodn ;
         GXv_decimal19[0] = A6256SalExKgE ;
         GXv_decimal18[0] = A6258SalExMtE ;
         GXv_int8[0] = A6257SalExCoE ;
         new app.pwork11(remoteHandle, context).execute( GXv_char13, GXv_int22, GXv_int23, GXv_int21, GXv_date10, GXv_int12, GXv_int11, GXv_char4, GXv_int20, GXv_char3, GXv_decimal19, GXv_decimal18, GXv_int8) ;
         trabajosexternosenvio_impl.this.A396EmprCod = GXv_char13[0] ;
         trabajosexternosenvio_impl.this.A2248ManCod = GXv_int22[0] ;
         trabajosexternosenvio_impl.this.A2253SalExtAlb = GXv_int23[0] ;
         trabajosexternosenvio_impl.this.A6248SalExNln = GXv_int21[0] ;
         trabajosexternosenvio_impl.this.A2256SalExtFec = GXv_date10[0] ;
         trabajosexternosenvio_impl.this.A129BarCod = GXv_int12[0] ;
         trabajosexternosenvio_impl.this.A132BarCodReo = GXv_int11[0] ;
         trabajosexternosenvio_impl.this.A130BarCodPar = GXv_char4[0] ;
         trabajosexternosenvio_impl.this.A654OrdLin = GXv_int20[0] ;
         trabajosexternosenvio_impl.this.A6558FasCodn = GXv_char3[0] ;
         trabajosexternosenvio_impl.this.A6256SalExKgE = GXv_decimal19[0] ;
         trabajosexternosenvio_impl.this.A6258SalExMtE = GXv_decimal18[0] ;
         trabajosexternosenvio_impl.this.A6257SalExCoE = GXv_int8[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A2248ManCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2248ManCod), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A2253SalExtAlb", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2253SalExtAlb), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A2256SalExtFec", localUtil.format(A2256SalExtFec, "99/99/99"));
      }
   }

   public void beforeInsert1PS910( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1PS910( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1PS910( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1PS910( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1PS910( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1PS910( )
   {
      edtSalExNln_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSalExNln_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSalExNln_Enabled), 5, 0), !bGXsfl_84_Refreshing);
      edtBarCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCod_Enabled), 5, 0), !bGXsfl_84_Refreshing);
      edtBarCodReo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCodReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodReo_Enabled), 5, 0), !bGXsfl_84_Refreshing);
      edtBarCodPar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCodPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodPar_Enabled), 5, 0), !bGXsfl_84_Refreshing);
      edtCliCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), !bGXsfl_84_Refreshing);
      edtBarSer_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarSer_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarSer_Enabled), 5, 0), !bGXsfl_84_Refreshing);
      edtBarSerDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarSerDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarSerDsc_Enabled), 5, 0), !bGXsfl_84_Refreshing);
      edtBarColNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarColNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarColNom_Enabled), 5, 0), !bGXsfl_84_Refreshing);
      edtBarColNum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarColNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarColNum_Enabled), 5, 0), !bGXsfl_84_Refreshing);
      edtBarNomCli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarNomCli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarNomCli_Enabled), 5, 0), !bGXsfl_84_Refreshing);
      edtFasCodn_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasCodn_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasCodn_Enabled), 5, 0), !bGXsfl_84_Refreshing);
      edtOrdLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOrdLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOrdLin_Enabled), 5, 0), !bGXsfl_84_Refreshing);
      edtSalExCoE_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSalExCoE_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSalExCoE_Enabled), 5, 0), !bGXsfl_84_Refreshing);
      edtSalExKgE_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSalExKgE_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSalExKgE_Enabled), 5, 0), !bGXsfl_84_Refreshing);
      edtSalExMtE_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSalExMtE_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSalExMtE_Enabled), 5, 0), !bGXsfl_84_Refreshing);
      edtBarSit_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarSit_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarSit_Enabled), 5, 0), !bGXsfl_84_Refreshing);
      edtMetrosRece_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMetrosRece_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetrosRece_Enabled), 5, 0), !bGXsfl_84_Refreshing);
      edtKilosRecep_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtKilosRecep_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtKilosRecep_Enabled), 5, 0), !bGXsfl_84_Refreshing);
      edtPiezasRece_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPiezasRece_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPiezasRece_Enabled), 5, 0), !bGXsfl_84_Refreshing);
      edtBarExt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarExt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarExt_Enabled), 5, 0), !bGXsfl_84_Refreshing);
   }

   public void send_integrity_lvl_hashes1PS910( )
   {
   }

   public void send_integrity_lvl_hashes1PS305( )
   {
   }

   public void subsflControlProps_84910( )
   {
      edtSalExNln_Internalname = "SALEXNLN_"+sGXsfl_84_idx ;
      edtBarCod_Internalname = "BARCOD_"+sGXsfl_84_idx ;
      edtBarCodReo_Internalname = "BARCODREO_"+sGXsfl_84_idx ;
      edtBarCodPar_Internalname = "BARCODPAR_"+sGXsfl_84_idx ;
      edtCliCod_Internalname = "CLICOD_"+sGXsfl_84_idx ;
      edtBarSer_Internalname = "BARSER_"+sGXsfl_84_idx ;
      edtBarSerDsc_Internalname = "BARSERDSC_"+sGXsfl_84_idx ;
      edtBarColNom_Internalname = "BARCOLNOM_"+sGXsfl_84_idx ;
      edtBarColNum_Internalname = "BARCOLNUM_"+sGXsfl_84_idx ;
      edtBarNomCli_Internalname = "BARNOMCLI_"+sGXsfl_84_idx ;
      edtFasCodn_Internalname = "FASCODN_"+sGXsfl_84_idx ;
      edtavImgprompt_Internalname = "vIMGPROMPT_"+sGXsfl_84_idx ;
      edtOrdLin_Internalname = "ORDLIN_"+sGXsfl_84_idx ;
      edtSalExCoE_Internalname = "SALEXCOE_"+sGXsfl_84_idx ;
      edtSalExKgE_Internalname = "SALEXKGE_"+sGXsfl_84_idx ;
      edtSalExMtE_Internalname = "SALEXMTE_"+sGXsfl_84_idx ;
      edtBarSit_Internalname = "BARSIT_"+sGXsfl_84_idx ;
      edtMetrosRece_Internalname = "METROSRECE_"+sGXsfl_84_idx ;
      edtKilosRecep_Internalname = "KILOSRECEP_"+sGXsfl_84_idx ;
      edtPiezasRece_Internalname = "PIEZASRECE_"+sGXsfl_84_idx ;
      edtBarExt_Internalname = "BAREXT_"+sGXsfl_84_idx ;
   }

   public void subsflControlProps_fel_84910( )
   {
      edtSalExNln_Internalname = "SALEXNLN_"+sGXsfl_84_fel_idx ;
      edtBarCod_Internalname = "BARCOD_"+sGXsfl_84_fel_idx ;
      edtBarCodReo_Internalname = "BARCODREO_"+sGXsfl_84_fel_idx ;
      edtBarCodPar_Internalname = "BARCODPAR_"+sGXsfl_84_fel_idx ;
      edtCliCod_Internalname = "CLICOD_"+sGXsfl_84_fel_idx ;
      edtBarSer_Internalname = "BARSER_"+sGXsfl_84_fel_idx ;
      edtBarSerDsc_Internalname = "BARSERDSC_"+sGXsfl_84_fel_idx ;
      edtBarColNom_Internalname = "BARCOLNOM_"+sGXsfl_84_fel_idx ;
      edtBarColNum_Internalname = "BARCOLNUM_"+sGXsfl_84_fel_idx ;
      edtBarNomCli_Internalname = "BARNOMCLI_"+sGXsfl_84_fel_idx ;
      edtFasCodn_Internalname = "FASCODN_"+sGXsfl_84_fel_idx ;
      edtavImgprompt_Internalname = "vIMGPROMPT_"+sGXsfl_84_fel_idx ;
      edtOrdLin_Internalname = "ORDLIN_"+sGXsfl_84_fel_idx ;
      edtSalExCoE_Internalname = "SALEXCOE_"+sGXsfl_84_fel_idx ;
      edtSalExKgE_Internalname = "SALEXKGE_"+sGXsfl_84_fel_idx ;
      edtSalExMtE_Internalname = "SALEXMTE_"+sGXsfl_84_fel_idx ;
      edtBarSit_Internalname = "BARSIT_"+sGXsfl_84_fel_idx ;
      edtMetrosRece_Internalname = "METROSRECE_"+sGXsfl_84_fel_idx ;
      edtKilosRecep_Internalname = "KILOSRECEP_"+sGXsfl_84_fel_idx ;
      edtPiezasRece_Internalname = "PIEZASRECE_"+sGXsfl_84_fel_idx ;
      edtBarExt_Internalname = "BAREXT_"+sGXsfl_84_fel_idx ;
   }

   public void addRow1PS910( )
   {
      nGXsfl_84_idx = (int)(nGXsfl_84_idx+1) ;
      sGXsfl_84_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_84_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_84910( ) ;
      sendRow1PS910( ) ;
   }

   public void sendRow1PS910( )
   {
      Gridlevel_level1Row = GXWebRow.GetNew(context) ;
      if ( subGridlevel_level1_Backcolorstyle == 0 )
      {
         /* None style subfile background logic. */
         subGridlevel_level1_Backstyle = (byte)(0) ;
         if ( GXutil.strcmp(subGridlevel_level1_Class, "") != 0 )
         {
            subGridlevel_level1_Linesclass = subGridlevel_level1_Class+"Odd" ;
         }
      }
      else if ( subGridlevel_level1_Backcolorstyle == 1 )
      {
         /* Uniform style subfile background logic. */
         subGridlevel_level1_Backstyle = (byte)(0) ;
         subGridlevel_level1_Backcolor = subGridlevel_level1_Allbackcolor ;
         if ( GXutil.strcmp(subGridlevel_level1_Class, "") != 0 )
         {
            subGridlevel_level1_Linesclass = subGridlevel_level1_Class+"Uniform" ;
         }
      }
      else if ( subGridlevel_level1_Backcolorstyle == 2 )
      {
         /* Header style subfile background logic. */
         subGridlevel_level1_Backstyle = (byte)(1) ;
         if ( GXutil.strcmp(subGridlevel_level1_Class, "") != 0 )
         {
            subGridlevel_level1_Linesclass = subGridlevel_level1_Class+"Odd" ;
         }
         subGridlevel_level1_Backcolor = (int)(0x0) ;
      }
      else if ( subGridlevel_level1_Backcolorstyle == 3 )
      {
         /* Report style subfile background logic. */
         subGridlevel_level1_Backstyle = (byte)(1) ;
         if ( ((int)((nGXsfl_84_idx) % (2))) == 0 )
         {
            subGridlevel_level1_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGridlevel_level1_Class, "") != 0 )
            {
               subGridlevel_level1_Linesclass = subGridlevel_level1_Class+"Even" ;
            }
         }
         else
         {
            subGridlevel_level1_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGridlevel_level1_Class, "") != 0 )
            {
               subGridlevel_level1_Linesclass = subGridlevel_level1_Class+"Odd" ;
            }
         }
      }
      edtavImgprompt_Link = ((GXutil.strcmp(Gx_mode, "DSP")==0) ? "" : "javascript:"+"gx.popup.openPrompt('"+"app.seleccionfasehdrtrabajosexternos"+"',["+"'"+WebUtils.htmlEncode( GXutil.strReplace( GXutil.rtrim( A396EmprCod), "'", "\\'"))+"'"+","+"{Ctrl:gx.dom.el('"+"BARCOD_"+sGXsfl_84_idx+"'), id:'"+"BARCOD_"+sGXsfl_84_idx+"'"+",IOType:'in'}"+","+"{Ctrl:gx.dom.el('"+"BARCODREO_"+sGXsfl_84_idx+"'), id:'"+"BARCODREO_"+sGXsfl_84_idx+"'"+",IOType:'in'}"+","+"{Ctrl:gx.dom.el('"+"BARCODPAR_"+sGXsfl_84_idx+"'), id:'"+"BARCODPAR_"+sGXsfl_84_idx+"'"+",IOType:'in'}"+","+"{Ctrl:gx.dom.el('"+"ORDLIN_"+sGXsfl_84_idx+"'), id:'"+"ORDLIN_"+sGXsfl_84_idx+"'"+",IOType:'out'}"+","+"{Ctrl:gx.dom.el('"+"FASCODN_"+sGXsfl_84_idx+"'), id:'"+"FASCODN_"+sGXsfl_84_idx+"'"+",IOType:'out'}"+"],"+"gx.dom.form()."+"nIsMod_910_"+sGXsfl_84_idx+","+"'', false"+","+"false"+");") ;
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_910_" + sGXsfl_84_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 85,'',false,'" + sGXsfl_84_idx + "',84)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtSalExNln_Internalname,GXutil.ltrim( localUtil.ntoc( A6248SalExNln, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A6248SalExNln), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,85);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtSalExNln_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn TagColumn TagColumn","",Integer.valueOf(-1),Integer.valueOf(edtSalExNln_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(84),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_910_" + sGXsfl_84_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 86,'',false,'" + sGXsfl_84_idx + "',84)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarCod_Internalname,GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtBarCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,86);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn TagColumn TagColumn","",Integer.valueOf(-1),Integer.valueOf(edtBarCod_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(84),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_910_" + sGXsfl_84_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 87,'',false,'" + sGXsfl_84_idx + "',84)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarCodReo_Internalname,GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtBarCodReo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9") : localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,87);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarCodReo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn TagColumn TagColumn","",Integer.valueOf(-1),Integer.valueOf(edtBarCodReo_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(84),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_910_" + sGXsfl_84_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 88,'',false,'" + sGXsfl_84_idx + "',84)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarCodPar_Internalname,GXutil.rtrim( A130BarCodPar),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,88);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarCodPar_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn TagColumn TagColumn","",Integer.valueOf(-1),Integer.valueOf(edtBarCodPar_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(84),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCliCod_Internalname,GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtCliCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCliCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn TagColumn TagColumn","",Integer.valueOf(-1),Integer.valueOf(edtCliCod_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(84),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarSer_Internalname,GXutil.rtrim( A212BarSer),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarSer_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn TagColumn TagColumn","",Integer.valueOf(-1),Integer.valueOf(edtBarSer_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(84),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "TagColumn" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarSerDsc_Internalname,GXutil.rtrim( A1652BarSerDsc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarSerDsc_Jsonclick,Integer.valueOf(0),"TagColumn","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtBarSerDsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(84),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarColNom_Internalname,GXutil.rtrim( A135BarColNom),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarColNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn TagColumn TagColumn","",Integer.valueOf(-1),Integer.valueOf(edtBarColNom_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(84),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarColNum_Internalname,GXutil.ltrim( localUtil.ntoc( A136BarColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtBarColNum_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A136BarColNum), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A136BarColNum), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarColNum_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(0),Integer.valueOf(edtBarColNum_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(84),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarNomCli_Internalname,GXutil.rtrim( A1234BarNomCli),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarNomCli_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtBarNomCli_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(84),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_910_" + sGXsfl_84_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 95,'',false,'" + sGXsfl_84_idx + "',84)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFasCodn_Internalname,GXutil.rtrim( A6558FasCodn),GXutil.rtrim( localUtil.format( A6558FasCodn, "@!")),TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,95);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFasCodn_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn TagColumn TagColumn","",Integer.valueOf(-1),Integer.valueOf(edtFasCodn_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(84),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Static Bitmap Variable */
      ClassString = "Image" + " " + ((GXutil.strcmp(edtavImgprompt_gximage, "")==0) ? "" : "GX_Image_"+edtavImgprompt_gximage+"_Class") ;
      StyleString = "" ;
      AV32imgPrompt_IsBlob = (boolean)(((GXutil.strcmp("", AV32imgPrompt)==0)&&(GXutil.strcmp("", AV37Imgprompt_GXI)==0))||!(GXutil.strcmp("", AV32imgPrompt)==0)) ;
      sImgUrl = ((GXutil.strcmp("", AV32imgPrompt)==0) ? AV37Imgprompt_GXI : httpContext.getResourceRelative(AV32imgPrompt)) ;
      Gridlevel_level1Row.AddColumnProperties("bitmap", 1, isAjaxCallMode( ), new Object[] {edtavImgprompt_Internalname,sImgUrl,edtavImgprompt_Link,"","",context.getHttpContext().getTheme( ),Integer.valueOf(edtavImgprompt_Visible),Integer.valueOf(edtavImgprompt_Enabled),"","",Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),"px",Integer.valueOf(0),"px",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"","",StyleString,ClassString,"TrnColumn TagColumn","","","","","","",Integer.valueOf(1),Boolean.valueOf(AV32imgPrompt_IsBlob),Boolean.valueOf(false),context.getHttpContext().getImageSrcSet( sImgUrl)});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_910_" + sGXsfl_84_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 97,'',false,'" + sGXsfl_84_idx + "',84)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtOrdLin_Internalname,GXutil.ltrim( localUtil.ntoc( A654OrdLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtOrdLin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A654OrdLin), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A654OrdLin), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,97);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtOrdLin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn TagColumn TagColumn","",Integer.valueOf(-1),Integer.valueOf(edtOrdLin_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(84),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_910_" + sGXsfl_84_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 98,'',false,'" + sGXsfl_84_idx + "',84)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtSalExCoE_Internalname,GXutil.ltrim( localUtil.ntoc( A6257SalExCoE, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtSalExCoE_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A6257SalExCoE), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A6257SalExCoE), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,98);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtSalExCoE_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn TagColumn TagColumn","",Integer.valueOf(-1),Integer.valueOf(edtSalExCoE_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(84),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_910_" + sGXsfl_84_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 99,'',false,'" + sGXsfl_84_idx + "',84)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtSalExKgE_Internalname,GXutil.ltrim( localUtil.ntoc( A6256SalExKgE, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtSalExKgE_Enabled!=0) ? localUtil.format( A6256SalExKgE, "ZZZZZ9.99") : localUtil.format( A6256SalExKgE, "ZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,99);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtSalExKgE_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn TagColumn TagColumn","",Integer.valueOf(-1),Integer.valueOf(edtSalExKgE_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(84),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_910_" + sGXsfl_84_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 100,'',false,'" + sGXsfl_84_idx + "',84)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtSalExMtE_Internalname,GXutil.ltrim( localUtil.ntoc( A6258SalExMtE, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtSalExMtE_Enabled!=0) ? localUtil.format( A6258SalExMtE, "ZZZZZ9.99") : localUtil.format( A6258SalExMtE, "ZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,100);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtSalExMtE_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn TagColumn TagColumn","",Integer.valueOf(-1),Integer.valueOf(edtSalExMtE_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(84),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarSit_Internalname,GXutil.ltrim( localUtil.ntoc( A213BarSit, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtBarSit_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A213BarSit), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A213BarSit), "Z9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarSit_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(0),Integer.valueOf(edtBarSit_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(84),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMetrosRece_Internalname,GXutil.ltrim( localUtil.ntoc( A13849MetrosRece, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtMetrosRece_Enabled!=0) ? localUtil.format( A13849MetrosRece, "ZZZZZ9.99") : localUtil.format( A13849MetrosRece, "ZZZZZ9.99"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMetrosRece_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(0),Integer.valueOf(edtMetrosRece_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(84),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtKilosRecep_Internalname,GXutil.ltrim( localUtil.ntoc( A13850KilosRecep, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtKilosRecep_Enabled!=0) ? localUtil.format( A13850KilosRecep, "ZZZZZ9.99") : localUtil.format( A13850KilosRecep, "ZZZZZ9.99"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtKilosRecep_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(0),Integer.valueOf(edtKilosRecep_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(84),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPiezasRece_Internalname,GXutil.ltrim( localUtil.ntoc( A13851PiezasRece, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtPiezasRece_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A13851PiezasRece), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A13851PiezasRece), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPiezasRece_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(0),Integer.valueOf(edtPiezasRece_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(84),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarExt_Internalname,GXutil.ltrim( localUtil.ntoc( A2265BarExt, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtBarExt_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A2265BarExt), "9") : localUtil.format( DecimalUtil.doubleToDec(A2265BarExt), "9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarExt_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(0),Integer.valueOf(edtBarExt_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(84),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      httpContext.ajax_sending_grid_row(Gridlevel_level1Row);
      send_integrity_lvl_hashes1PS910( ) ;
      GXCCtl = "Z6248SalExNln_" + sGXsfl_84_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z6248SalExNln, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z6256SalExKgE_" + sGXsfl_84_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z6256SalExKgE, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z6258SalExMtE_" + sGXsfl_84_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z6258SalExMtE, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z6257SalExCoE_" + sGXsfl_84_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z6257SalExCoE, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z654OrdLin_" + sGXsfl_84_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z654OrdLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z6249SalExObs_" + sGXsfl_84_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z6249SalExObs));
      GXCCtl = "Z6255SalExMtR_" + sGXsfl_84_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z6255SalExMtR, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z6251SalExKgR_" + sGXsfl_84_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z6251SalExKgR, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z6252SalExCoR_" + sGXsfl_84_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z6252SalExCoR, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z6558FasCodn_" + sGXsfl_84_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z6558FasCodn));
      GXCCtl = "Z129BarCod_" + sGXsfl_84_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z132BarCodReo_" + sGXsfl_84_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z130BarCodPar_" + sGXsfl_84_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z130BarCodPar));
      GXCCtl = "O6257SalExCoE_" + sGXsfl_84_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( O6257SalExCoE, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "O6258SalExMtE_" + sGXsfl_84_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( O6258SalExMtE, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "O6256SalExKgE_" + sGXsfl_84_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( O6256SalExKgE, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_910_" + sGXsfl_84_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_910, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_910_" + sGXsfl_84_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_910, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_910_" + sGXsfl_84_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_910, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vMODE_" + sGXsfl_84_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Gx_mode));
      GXCCtl = "vTRNCONTEXT_" + sGXsfl_84_idx ;
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, GXCCtl, AV10TrnContext);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(GXCCtl, AV10TrnContext);
      }
      GXCCtl = "EMPRCOD_" + sGXsfl_84_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( A396EmprCod));
      GXCCtl = "vEMPRCOD_" + sGXsfl_84_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( AV7EmprCod));
      GXCCtl = "vSALEXTALB_" + sGXsfl_84_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( AV8SalExtAlb, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "SALEXNLN_"+sGXsfl_84_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtSalExNln_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARCOD_"+sGXsfl_84_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARCODREO_"+sGXsfl_84_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarCodReo_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARCODPAR_"+sGXsfl_84_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarCodPar_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CLICOD_"+sGXsfl_84_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCliCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARSER_"+sGXsfl_84_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarSer_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARSERDSC_"+sGXsfl_84_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarSerDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARCOLNOM_"+sGXsfl_84_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarColNom_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARCOLNUM_"+sGXsfl_84_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarColNum_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARNOMCLI_"+sGXsfl_84_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarNomCli_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FASCODN_"+sGXsfl_84_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasCodn_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vIMGPROMPT_"+sGXsfl_84_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavImgprompt_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vIMGPROMPT_"+sGXsfl_84_idx+"Link", GXutil.rtrim( edtavImgprompt_Link));
      app.GxWebStd.gx_hidden_field( httpContext, "vIMGPROMPT_"+sGXsfl_84_idx+"Visible", GXutil.ltrim( localUtil.ntoc( edtavImgprompt_Visible, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ORDLIN_"+sGXsfl_84_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOrdLin_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "SALEXCOE_"+sGXsfl_84_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtSalExCoE_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "SALEXKGE_"+sGXsfl_84_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtSalExKgE_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "SALEXMTE_"+sGXsfl_84_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtSalExMtE_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARSIT_"+sGXsfl_84_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarSit_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "METROSRECE_"+sGXsfl_84_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMetrosRece_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "KILOSRECEP_"+sGXsfl_84_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtKilosRecep_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PIEZASRECE_"+sGXsfl_84_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPiezasRece_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BAREXT_"+sGXsfl_84_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarExt_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Gridlevel_level1Container.AddRow(Gridlevel_level1Row);
   }

   public void readRow1PS910( )
   {
      nGXsfl_84_idx = (int)(nGXsfl_84_idx+1) ;
      sGXsfl_84_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_84_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_84910( ) ;
      edtSalExNln_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "SALEXNLN_"+sGXsfl_84_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARCOD_"+sGXsfl_84_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarCodReo_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARCODREO_"+sGXsfl_84_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarCodPar_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARCODPAR_"+sGXsfl_84_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtCliCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CLICOD_"+sGXsfl_84_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarSer_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARSER_"+sGXsfl_84_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarSerDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARSERDSC_"+sGXsfl_84_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarColNom_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARCOLNOM_"+sGXsfl_84_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarColNum_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARCOLNUM_"+sGXsfl_84_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarNomCli_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARNOMCLI_"+sGXsfl_84_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtFasCodn_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FASCODN_"+sGXsfl_84_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtavImgprompt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vIMGPROMPT_"+sGXsfl_84_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtavImgprompt_Link = httpContext.cgiGet( "vIMGPROMPT_"+sGXsfl_84_idx+"Link") ;
      edtavImgprompt_Visible = (int)(localUtil.ctol( httpContext.cgiGet( "vIMGPROMPT_"+sGXsfl_84_idx+"Visible"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtOrdLin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ORDLIN_"+sGXsfl_84_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtSalExCoE_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "SALEXCOE_"+sGXsfl_84_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtSalExKgE_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "SALEXKGE_"+sGXsfl_84_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtSalExMtE_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "SALEXMTE_"+sGXsfl_84_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarSit_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARSIT_"+sGXsfl_84_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMetrosRece_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "METROSRECE_"+sGXsfl_84_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtKilosRecep_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "KILOSRECEP_"+sGXsfl_84_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPiezasRece_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PIEZASRECE_"+sGXsfl_84_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarExt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BAREXT_"+sGXsfl_84_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtSalExNln_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtSalExNln_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "SALEXNLN_" + sGXsfl_84_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtSalExNln_Internalname ;
         wbErr = true ;
         A6248SalExNln = (short)(0) ;
      }
      else
      {
         A6248SalExNln = (short)(localUtil.ctol( httpContext.cgiGet( edtSalExNln_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
      {
         GXCCtl = "BARCOD_" + sGXsfl_84_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarCod_Internalname ;
         wbErr = true ;
         A129BarCod = 0 ;
      }
      else
      {
         A129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( edtBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBarCodReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBarCodReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
      {
         GXCCtl = "BARCODREO_" + sGXsfl_84_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarCodReo_Internalname ;
         wbErr = true ;
         A132BarCodReo = (byte)(0) ;
      }
      else
      {
         A132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarCodReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A130BarCodPar = httpContext.cgiGet( edtBarCodPar_Internalname) ;
      A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      n252CliCod = false ;
      A212BarSer = httpContext.cgiGet( edtBarSer_Internalname) ;
      A1652BarSerDsc = httpContext.cgiGet( edtBarSerDsc_Internalname) ;
      A135BarColNom = httpContext.cgiGet( edtBarColNom_Internalname) ;
      A136BarColNum = (int)(localUtil.ctol( httpContext.cgiGet( edtBarColNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      A1234BarNomCli = httpContext.cgiGet( edtBarNomCli_Internalname) ;
      A6558FasCodn = GXutil.upper( httpContext.cgiGet( edtFasCodn_Internalname)) ;
      AV32imgPrompt = httpContext.cgiGet( edtavImgprompt_Internalname) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtOrdLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtOrdLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "ORDLIN_" + sGXsfl_84_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtOrdLin_Internalname ;
         wbErr = true ;
         A654OrdLin = (short)(0) ;
      }
      else
      {
         A654OrdLin = (short)(localUtil.ctol( httpContext.cgiGet( edtOrdLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtSalExCoE_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtSalExCoE_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
      {
         GXCCtl = "SALEXCOE_" + sGXsfl_84_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtSalExCoE_Internalname ;
         wbErr = true ;
         A6257SalExCoE = 0 ;
      }
      else
      {
         A6257SalExCoE = (int)(localUtil.ctol( httpContext.cgiGet( edtSalExCoE_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtSalExKgE_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtSalExKgE_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
      {
         GXCCtl = "SALEXKGE_" + sGXsfl_84_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtSalExKgE_Internalname ;
         wbErr = true ;
         A6256SalExKgE = DecimalUtil.ZERO ;
      }
      else
      {
         A6256SalExKgE = localUtil.ctond( httpContext.cgiGet( edtSalExKgE_Internalname)) ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtSalExMtE_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtSalExMtE_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
      {
         GXCCtl = "SALEXMTE_" + sGXsfl_84_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtSalExMtE_Internalname ;
         wbErr = true ;
         A6258SalExMtE = DecimalUtil.ZERO ;
      }
      else
      {
         A6258SalExMtE = localUtil.ctond( httpContext.cgiGet( edtSalExMtE_Internalname)) ;
      }
      A213BarSit = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarSit_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      A13849MetrosRece = localUtil.ctond( httpContext.cgiGet( edtMetrosRece_Internalname)) ;
      A13850KilosRecep = localUtil.ctond( httpContext.cgiGet( edtKilosRecep_Internalname)) ;
      A13851PiezasRece = (int)(localUtil.ctol( httpContext.cgiGet( edtPiezasRece_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      A2265BarExt = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarExt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      n2265BarExt = false ;
      GXCCtl = "Z6248SalExNln_" + sGXsfl_84_idx ;
      Z6248SalExNln = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z6256SalExKgE_" + sGXsfl_84_idx ;
      Z6256SalExKgE = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z6258SalExMtE_" + sGXsfl_84_idx ;
      Z6258SalExMtE = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z6257SalExCoE_" + sGXsfl_84_idx ;
      Z6257SalExCoE = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z654OrdLin_" + sGXsfl_84_idx ;
      Z654OrdLin = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z6249SalExObs_" + sGXsfl_84_idx ;
      Z6249SalExObs = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z6255SalExMtR_" + sGXsfl_84_idx ;
      Z6255SalExMtR = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z6251SalExKgR_" + sGXsfl_84_idx ;
      Z6251SalExKgR = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z6252SalExCoR_" + sGXsfl_84_idx ;
      Z6252SalExCoR = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z6558FasCodn_" + sGXsfl_84_idx ;
      Z6558FasCodn = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z129BarCod_" + sGXsfl_84_idx ;
      Z129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z132BarCodReo_" + sGXsfl_84_idx ;
      Z132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z130BarCodPar_" + sGXsfl_84_idx ;
      Z130BarCodPar = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z6249SalExObs_" + sGXsfl_84_idx ;
      A6249SalExObs = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z6255SalExMtR_" + sGXsfl_84_idx ;
      A6255SalExMtR = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z6251SalExKgR_" + sGXsfl_84_idx ;
      A6251SalExKgR = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z6252SalExCoR_" + sGXsfl_84_idx ;
      A6252SalExCoR = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "O6257SalExCoE_" + sGXsfl_84_idx ;
      O6257SalExCoE = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "O6258SalExMtE_" + sGXsfl_84_idx ;
      O6258SalExMtE = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "O6256SalExKgE_" + sGXsfl_84_idx ;
      O6256SalExKgE = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "nRcdDeleted_910_" + sGXsfl_84_idx ;
      nRcdDeleted_910 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_910_" + sGXsfl_84_idx ;
      nRcdExists_910 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_910_" + sGXsfl_84_idx ;
      nIsMod_910 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtBarExt_Enabled = edtBarExt_Enabled ;
      defedtPiezasRece_Enabled = edtPiezasRece_Enabled ;
      defedtKilosRecep_Enabled = edtKilosRecep_Enabled ;
      defedtMetrosRece_Enabled = edtMetrosRece_Enabled ;
      defedtBarSit_Enabled = edtBarSit_Enabled ;
      defedtBarColNum_Enabled = edtBarColNum_Enabled ;
      defedtSalExNln_Enabled = edtSalExNln_Enabled ;
   }

   public void confirmValues1PS0( )
   {
      nGXsfl_84_idx = 0 ;
      sGXsfl_84_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_84_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_84910( ) ;
      while ( nGXsfl_84_idx < nRC_GXsfl_84 )
      {
         nGXsfl_84_idx = (int)(nGXsfl_84_idx+1) ;
         sGXsfl_84_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_84_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_84910( ) ;
         httpContext.changePostValue( "Z6248SalExNln_"+sGXsfl_84_idx, httpContext.cgiGet( "ZT_"+"Z6248SalExNln_"+sGXsfl_84_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z6248SalExNln_"+sGXsfl_84_idx) ;
         httpContext.changePostValue( "Z6256SalExKgE_"+sGXsfl_84_idx, httpContext.cgiGet( "ZT_"+"Z6256SalExKgE_"+sGXsfl_84_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z6256SalExKgE_"+sGXsfl_84_idx) ;
         httpContext.changePostValue( "Z6258SalExMtE_"+sGXsfl_84_idx, httpContext.cgiGet( "ZT_"+"Z6258SalExMtE_"+sGXsfl_84_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z6258SalExMtE_"+sGXsfl_84_idx) ;
         httpContext.changePostValue( "Z6257SalExCoE_"+sGXsfl_84_idx, httpContext.cgiGet( "ZT_"+"Z6257SalExCoE_"+sGXsfl_84_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z6257SalExCoE_"+sGXsfl_84_idx) ;
         httpContext.changePostValue( "Z654OrdLin_"+sGXsfl_84_idx, httpContext.cgiGet( "ZT_"+"Z654OrdLin_"+sGXsfl_84_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z654OrdLin_"+sGXsfl_84_idx) ;
         httpContext.changePostValue( "Z6249SalExObs_"+sGXsfl_84_idx, httpContext.cgiGet( "ZT_"+"Z6249SalExObs_"+sGXsfl_84_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z6249SalExObs_"+sGXsfl_84_idx) ;
         httpContext.changePostValue( "Z6255SalExMtR_"+sGXsfl_84_idx, httpContext.cgiGet( "ZT_"+"Z6255SalExMtR_"+sGXsfl_84_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z6255SalExMtR_"+sGXsfl_84_idx) ;
         httpContext.changePostValue( "Z6251SalExKgR_"+sGXsfl_84_idx, httpContext.cgiGet( "ZT_"+"Z6251SalExKgR_"+sGXsfl_84_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z6251SalExKgR_"+sGXsfl_84_idx) ;
         httpContext.changePostValue( "Z6252SalExCoR_"+sGXsfl_84_idx, httpContext.cgiGet( "ZT_"+"Z6252SalExCoR_"+sGXsfl_84_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z6252SalExCoR_"+sGXsfl_84_idx) ;
         httpContext.changePostValue( "Z6558FasCodn_"+sGXsfl_84_idx, httpContext.cgiGet( "ZT_"+"Z6558FasCodn_"+sGXsfl_84_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z6558FasCodn_"+sGXsfl_84_idx) ;
         httpContext.changePostValue( "Z129BarCod_"+sGXsfl_84_idx, httpContext.cgiGet( "ZT_"+"Z129BarCod_"+sGXsfl_84_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z129BarCod_"+sGXsfl_84_idx) ;
         httpContext.changePostValue( "Z132BarCodReo_"+sGXsfl_84_idx, httpContext.cgiGet( "ZT_"+"Z132BarCodReo_"+sGXsfl_84_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z132BarCodReo_"+sGXsfl_84_idx) ;
         httpContext.changePostValue( "Z130BarCodPar_"+sGXsfl_84_idx, httpContext.cgiGet( "ZT_"+"Z130BarCodPar_"+sGXsfl_84_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z130BarCodPar_"+sGXsfl_84_idx) ;
      }
      httpContext.changePostValue( "O6257SalExCoE", httpContext.cgiGet( "T6257SalExCoE")) ;
      httpContext.deletePostValue( "T6257SalExCoE") ;
      httpContext.changePostValue( "O6258SalExMtE", httpContext.cgiGet( "T6258SalExMtE")) ;
      httpContext.deletePostValue( "T6258SalExMtE") ;
      httpContext.changePostValue( "O6256SalExKgE", httpContext.cgiGet( "T6256SalExKgE")) ;
      httpContext.deletePostValue( "T6256SalExKgE") ;
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.trabajosexternosenvio", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV7EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV8SalExtAlb,8,0))}, new String[] {"Gx_mode","EmprCod","SalExtAlb"}) +"\">") ;
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
      forbiddenHiddens.add("hshsalt", "hsh"+"TrabajosExternosEnvio");
      forbiddenHiddens.add("SalExtUsu", GXutil.rtrim( localUtil.format( A7368SalExtUsu, "@!")));
      forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
      forbiddenHiddens.add("SalExtRec", localUtil.format( DecimalUtil.doubleToDec(A7369SalExtRec), "ZZZZZ9"));
      forbiddenHiddens.add("SalExtFen", localUtil.format(A11299SalExtFen, "99/99/99"));
      forbiddenHiddens.add("SalSts", GXutil.rtrim( localUtil.format( A10080SalSts, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("trabajosexternosenvio:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2253SalExtAlb", GXutil.ltrim( localUtil.ntoc( Z2253SalExtAlb, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6396SalExtHor", GXutil.rtrim( Z6396SalExtHor));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2256SalExtFec", localUtil.dtoc( Z2256SalExtFec, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2257SalExtEst", GXutil.ltrim( localUtil.ntoc( Z2257SalExtEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2258SalExtLis", GXutil.ltrim( localUtil.ntoc( Z2258SalExtLis, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2254SalExtSec", GXutil.rtrim( Z2254SalExtSec));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6247SalExUln", GXutil.ltrim( localUtil.ntoc( Z6247SalExUln, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6397SalExtMat", GXutil.rtrim( Z6397SalExtMat));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7368SalExtUsu", GXutil.rtrim( Z7368SalExtUsu));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7369SalExtRec", GXutil.ltrim( localUtil.ntoc( Z7369SalExtRec, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8655SalFecEnt", localUtil.dtoc( Z8655SalFecEnt, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11299SalExtFen", localUtil.dtoc( Z11299SalExtFen, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10767SalExtAT", GXutil.rtrim( Z10767SalExtAT));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10742SalCodeID", GXutil.rtrim( Z10742SalCodeID));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10741SalEnvAT", GXutil.ltrim( localUtil.ntoc( Z10741SalEnvAT, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10080SalSts", GXutil.rtrim( Z10080SalSts));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10079SalFmdD", GXutil.rtrim( Z10079SalFmdD));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10078SalGrossT", GXutil.ltrim( localUtil.ntoc( Z10078SalGrossT, (byte)(13), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10077SalFmd", GXutil.rtrim( Z10077SalFmd));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10076SalFhh", localUtil.ttoc( Z10076SalFhh, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13244SalExtPre1", GXutil.ltrim( localUtil.ntoc( Z13244SalExtPre1, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z840TrnCod", GXutil.ltrim( localUtil.ntoc( Z840TrnCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2248ManCod", GXutil.ltrim( localUtil.ntoc( Z2248ManCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O6247SalExUln", GXutil.ltrim( localUtil.ntoc( O6247SalExUln, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_Mode", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_84", GXutil.ltrim( localUtil.ntoc( nGXsfl_84_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "N2248ManCod", GXutil.ltrim( localUtil.ntoc( A2248ManCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "N840TrnCod", GXutil.ltrim( localUtil.ntoc( A840TrnCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTRNCONTEXT", AV10TrnContext);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTRNCONTEXT", AV10TrnContext);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTRNCONTEXT", getSecureSignedToken( "", AV10TrnContext));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV7EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV7EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vSALEXTALB", GXutil.ltrim( localUtil.ntoc( AV8SalExtAlb, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSALEXTALB", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV8SalExtAlb), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vINSERT_MANCOD", GXutil.ltrim( localUtil.ntoc( AV12Insert_ManCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GXHCMANCOD", GXutil.ltrim( localUtil.ntoc( A2248ManCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vINSERT_TRNCOD", GXutil.ltrim( localUtil.ntoc( AV13Insert_TrnCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GXHCTRNCOD", GXutil.ltrim( localUtil.ntoc( A840TrnCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGXBSCREEN", GXutil.ltrim( localUtil.ntoc( Gx_BScreen, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vUSURCOD", GXutil.rtrim( AV17UsurCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vFLAGCONT", GXutil.ltrim( localUtil.ntoc( AV31FlagCont, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vFLAGALB", GXutil.ltrim( localUtil.ntoc( AV30FlagAlb, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vFIRMAD", GXutil.ltrim( localUtil.ntoc( AV24firmad, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "SALEXTREC", GXutil.ltrim( localUtil.ntoc( A7369SalExtRec, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "SALEXTFEN", localUtil.dtoc( A11299SalExtFen, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRNOM", GXutil.rtrim( A407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "TRNNOM", GXutil.rtrim( A841TrnNom));
      app.GxWebStd.gx_hidden_field( httpContext, "MANNOM", GXutil.rtrim( A2249ManNom));
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV35Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, "SALEXKGR", GXutil.ltrim( localUtil.ntoc( A6251SalExKgR, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "SALEXCOR", GXutil.ltrim( localUtil.ntoc( A6252SalExCoR, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "SALEXMTR", GXutil.ltrim( localUtil.ntoc( A6255SalExMtR, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vOLDKG", GXutil.ltrim( localUtil.ntoc( AV20OldKg, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vOLDMT", GXutil.ltrim( localUtil.ntoc( AV21OldMt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vOLDPZ", GXutil.ltrim( localUtil.ntoc( AV22OldPz, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMSGERR", AV19msgerr);
      app.GxWebStd.gx_hidden_field( httpContext, "vMSG_ERR", AV23Msg_err);
      app.GxWebStd.gx_hidden_field( httpContext, "SALEXOBS", GXutil.rtrim( A6249SalExObs));
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
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINARLINEA_Objectcall", GXutil.rtrim( Dvelop_confirmpanel_eliminarlinea_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINARLINEA_Enabled", GXutil.booltostr( Dvelop_confirmpanel_eliminarlinea_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINARLINEA_Title", GXutil.rtrim( Dvelop_confirmpanel_eliminarlinea_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINARLINEA_Confirmationtext", GXutil.rtrim( Dvelop_confirmpanel_eliminarlinea_Confirmationtext));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINARLINEA_Yesbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_eliminarlinea_Yesbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINARLINEA_Nobuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_eliminarlinea_Nobuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINARLINEA_Cancelbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_eliminarlinea_Cancelbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINARLINEA_Yesbuttonposition", GXutil.rtrim( Dvelop_confirmpanel_eliminarlinea_Yesbuttonposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINARLINEA_Confirmtype", GXutil.rtrim( Dvelop_confirmpanel_eliminarlinea_Confirmtype));
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
      return formatLink("app.trabajosexternosenvio", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV7EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV8SalExtAlb,8,0))}, new String[] {"Gx_mode","EmprCod","SalExtAlb"})  ;
   }

   public String getPgmname( )
   {
      return "TrabajosExternosEnvio" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Trabajos Externos (Envio)", "") ;
   }

   public void initializeNonKey1PS305( )
   {
      h2248ManCod = "" ;
      h840TrnCod = "" ;
      A6396SalExtHor = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A6396SalExtHor", A6396SalExtHor);
      AV31FlagCont = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV31FlagCont", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV31FlagCont), 4, 0));
      AV30FlagAlb = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV30FlagAlb", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV30FlagAlb), 4, 0));
      A2249ManNom = "" ;
      n2249ManNom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A2249ManNom", A2249ManNom);
      A841TrnNom = "" ;
      n841TrnNom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A841TrnNom", A841TrnNom);
      A2254SalExtSec = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A2254SalExtSec", A2254SalExtSec);
      A6247SalExUln = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A6247SalExUln", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6247SalExUln), 4, 0));
      A6397SalExtMat = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A6397SalExtMat", A6397SalExtMat);
      A7369SalExtRec = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A7369SalExtRec", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7369SalExtRec), 6, 0));
      A8655SalFecEnt = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "A8655SalFecEnt", localUtil.format(A8655SalFecEnt, "99/99/99"));
      A11299SalExtFen = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "A11299SalExtFen", localUtil.format(A11299SalExtFen, "99/99/99"));
      A10080SalSts = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A10080SalSts", A10080SalSts);
      A10079SalFmdD = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A10079SalFmdD", A10079SalFmdD);
      A10078SalGrossT = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A10078SalGrossT", GXutil.ltrimstr( A10078SalGrossT, 13, 2));
      A10077SalFmd = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A10077SalFmd", A10077SalFmd);
      A10076SalFhh = GXutil.resetTime( GXutil.nullDate() );
      httpContext.ajax_rsp_assign_attri("", false, "A10076SalFhh", localUtil.ttoc( A10076SalFhh, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      A3554SalExtObs = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A3554SalExtObs", A3554SalExtObs);
      A13244SalExtPre1 = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A13244SalExtPre1", GXutil.ltrimstr( A13244SalExtPre1, 13, 5));
      A2256SalExtFec = GXutil.today( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "A2256SalExtFec", localUtil.format(A2256SalExtFec, "99/99/99"));
      A2257SalExtEst = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A2257SalExtEst", GXutil.str( A2257SalExtEst, 1, 0));
      A2258SalExtLis = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A2258SalExtLis", GXutil.str( A2258SalExtLis, 1, 0));
      A7368SalExtUsu = AV17UsurCod ;
      httpContext.ajax_rsp_assign_attri("", false, "A7368SalExtUsu", A7368SalExtUsu);
      A10767SalExtAT = " " ;
      httpContext.ajax_rsp_assign_attri("", false, "A10767SalExtAT", A10767SalExtAT);
      A10742SalCodeID = " " ;
      httpContext.ajax_rsp_assign_attri("", false, "A10742SalCodeID", A10742SalCodeID);
      A10741SalEnvAT = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A10741SalEnvAT", GXutil.str( A10741SalEnvAT, 1, 0));
      O6247SalExUln = A6247SalExUln ;
      httpContext.ajax_rsp_assign_attri("", false, "A6247SalExUln", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6247SalExUln), 4, 0));
      Z6396SalExtHor = "" ;
      Z2256SalExtFec = GXutil.nullDate() ;
      Z2257SalExtEst = (byte)(0) ;
      Z2258SalExtLis = (byte)(0) ;
      Z2254SalExtSec = "" ;
      Z6247SalExUln = (short)(0) ;
      Z6397SalExtMat = "" ;
      Z7368SalExtUsu = "" ;
      Z7369SalExtRec = 0 ;
      Z8655SalFecEnt = GXutil.nullDate() ;
      Z11299SalExtFen = GXutil.nullDate() ;
      Z10767SalExtAT = "" ;
      Z10742SalCodeID = "" ;
      Z10741SalEnvAT = (byte)(0) ;
      Z10080SalSts = "" ;
      Z10079SalFmdD = "" ;
      Z10078SalGrossT = DecimalUtil.ZERO ;
      Z10077SalFmd = "" ;
      Z10076SalFhh = GXutil.resetTime( GXutil.nullDate() );
      Z13244SalExtPre1 = DecimalUtil.ZERO ;
      Z840TrnCod = (short)(0) ;
      Z2248ManCod = (short)(0) ;
   }

   public void initAll1PS305( )
   {
      A2253SalExtAlb = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A2253SalExtAlb", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2253SalExtAlb), 8, 0));
      initializeNonKey1PS305( ) ;
   }

   public void standaloneModalInsert( )
   {
      A2256SalExtFec = i2256SalExtFec ;
      httpContext.ajax_rsp_assign_attri("", false, "A2256SalExtFec", localUtil.format(A2256SalExtFec, "99/99/99"));
      A2257SalExtEst = i2257SalExtEst ;
      httpContext.ajax_rsp_assign_attri("", false, "A2257SalExtEst", GXutil.str( A2257SalExtEst, 1, 0));
      A2258SalExtLis = i2258SalExtLis ;
      httpContext.ajax_rsp_assign_attri("", false, "A2258SalExtLis", GXutil.str( A2258SalExtLis, 1, 0));
      A7368SalExtUsu = i7368SalExtUsu ;
      httpContext.ajax_rsp_assign_attri("", false, "A7368SalExtUsu", A7368SalExtUsu);
      A10742SalCodeID = i10742SalCodeID ;
      httpContext.ajax_rsp_assign_attri("", false, "A10742SalCodeID", A10742SalCodeID);
      A10741SalEnvAT = i10741SalEnvAT ;
      httpContext.ajax_rsp_assign_attri("", false, "A10741SalEnvAT", GXutil.str( A10741SalEnvAT, 1, 0));
      A10767SalExtAT = i10767SalExtAT ;
      httpContext.ajax_rsp_assign_attri("", false, "A10767SalExtAT", A10767SalExtAT);
   }

   public void initializeNonKey1PS910( )
   {
      A457FasCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A457FasCod", A457FasCod);
      AV20OldKg = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20OldKg", GXutil.ltrimstr( AV20OldKg, 9, 2));
      AV21OldMt = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21OldMt", GXutil.ltrimstr( AV21OldMt, 9, 2));
      AV22OldPz = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV22OldPz", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV22OldPz), 6, 0));
      A6256SalExKgE = DecimalUtil.ZERO ;
      A6258SalExMtE = DecimalUtil.ZERO ;
      A6257SalExCoE = 0 ;
      AV19msgerr = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19msgerr", AV19msgerr);
      AV23Msg_err = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV23Msg_err", AV23Msg_err);
      A13849MetrosRece = DecimalUtil.ZERO ;
      A13851PiezasRece = 0 ;
      A13850KilosRecep = DecimalUtil.ZERO ;
      A129BarCod = 0 ;
      A132BarCodReo = (byte)(0) ;
      A130BarCodPar = "" ;
      A2265BarExt = (byte)(0) ;
      n2265BarExt = false ;
      A212BarSer = "" ;
      A1652BarSerDsc = "" ;
      A6558FasCodn = "" ;
      A654OrdLin = (short)(0) ;
      A6249SalExObs = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A6249SalExObs", A6249SalExObs);
      A252CliCod = 0 ;
      n252CliCod = false ;
      A135BarColNom = "" ;
      A136BarColNum = 0 ;
      A1234BarNomCli = "" ;
      A213BarSit = (byte)(0) ;
      A6255SalExMtR = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A6255SalExMtR", GXutil.ltrimstr( A6255SalExMtR, 9, 2));
      A6251SalExKgR = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A6251SalExKgR", GXutil.ltrimstr( A6251SalExKgR, 9, 2));
      A6252SalExCoR = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A6252SalExCoR", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6252SalExCoR), 6, 0));
      O6257SalExCoE = A6257SalExCoE ;
      O6258SalExMtE = A6258SalExMtE ;
      O6256SalExKgE = A6256SalExKgE ;
      Z6256SalExKgE = DecimalUtil.ZERO ;
      Z6258SalExMtE = DecimalUtil.ZERO ;
      Z6257SalExCoE = 0 ;
      Z654OrdLin = (short)(0) ;
      Z6249SalExObs = "" ;
      Z6255SalExMtR = DecimalUtil.ZERO ;
      Z6251SalExKgR = DecimalUtil.ZERO ;
      Z6252SalExCoR = 0 ;
      Z6558FasCodn = "" ;
      Z129BarCod = 0 ;
      Z132BarCodReo = (byte)(0) ;
      Z130BarCodPar = "" ;
   }

   public void initAll1PS910( )
   {
      A6248SalExNln = (short)(0) ;
      initializeNonKey1PS910( ) ;
   }

   public void standaloneModalInsert1PS910( )
   {
      A6247SalExUln = i6247SalExUln ;
      httpContext.ajax_rsp_assign_attri("", false, "A6247SalExUln", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6247SalExUln), 4, 0));
   }

   public void define_styles( )
   {
      httpContext.AddStyleSheetFile("DVelop/Bootstrap/Shared/DVelopBootstrap.css", "");
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268211684947", true, true);
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
      httpContext.AddJavascriptSource("trabajosexternosenvio.js", "?20268211684947", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties910( )
   {
      edtBarExt_Enabled = defedtBarExt_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarExt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarExt_Enabled), 5, 0), !bGXsfl_84_Refreshing);
      edtPiezasRece_Enabled = defedtPiezasRece_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtPiezasRece_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPiezasRece_Enabled), 5, 0), !bGXsfl_84_Refreshing);
      edtKilosRecep_Enabled = defedtKilosRecep_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtKilosRecep_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtKilosRecep_Enabled), 5, 0), !bGXsfl_84_Refreshing);
      edtMetrosRece_Enabled = defedtMetrosRece_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtMetrosRece_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetrosRece_Enabled), 5, 0), !bGXsfl_84_Refreshing);
      edtBarSit_Enabled = defedtBarSit_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarSit_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarSit_Enabled), 5, 0), !bGXsfl_84_Refreshing);
      edtBarColNum_Enabled = defedtBarColNum_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarColNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarColNum_Enabled), 5, 0), !bGXsfl_84_Refreshing);
      edtSalExNln_Enabled = defedtSalExNln_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtSalExNln_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSalExNln_Enabled), 5, 0), !bGXsfl_84_Refreshing);
   }

   public void startgridcontrol84( )
   {
      Gridlevel_level1Container.AddObjectProperty("GridName", "Gridlevel_level1");
      Gridlevel_level1Container.AddObjectProperty("Header", subGridlevel_level1_Header);
      Gridlevel_level1Container.AddObjectProperty("DeleteMethod", "none");
      Gridlevel_level1Container.AddObjectProperty("Class", "GridNoBorder WorkWith");
      Gridlevel_level1Container.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGridlevel_level1_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddObjectProperty("CmpContext", "");
      Gridlevel_level1Container.AddObjectProperty("InMasterPage", "false");
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A6248SalExNln, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtSalExNln_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarCodReo_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.rtrim( A130BarCodPar));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarCodPar_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtCliCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.rtrim( A212BarSer));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarSer_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.rtrim( A1652BarSerDsc));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarSerDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.rtrim( A135BarColNom));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarColNom_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A136BarColNum, (byte)(6), (byte)(0), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarColNum_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.rtrim( A1234BarNomCli));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarNomCli_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.rtrim( A6558FasCodn));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtFasCodn_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", httpContext.convertURL( AV32imgPrompt));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavImgprompt_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Link", GXutil.rtrim( edtavImgprompt_Link));
      Gridlevel_level1Column.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavImgprompt_Visible, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A654OrdLin, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtOrdLin_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A6257SalExCoE, (byte)(6), (byte)(0), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtSalExCoE_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A6256SalExKgE, (byte)(9), (byte)(2), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtSalExKgE_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A6258SalExMtE, (byte)(9), (byte)(2), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtSalExMtE_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A213BarSit, (byte)(2), (byte)(0), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarSit_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A13849MetrosRece, (byte)(9), (byte)(2), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMetrosRece_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A13850KilosRecep, (byte)(9), (byte)(2), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtKilosRecep_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A13851PiezasRece, (byte)(6), (byte)(0), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPiezasRece_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A2265BarExt, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarExt_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Container.AddObjectProperty("Selectedindex", GXutil.ltrim( localUtil.ntoc( subGridlevel_level1_Selectedindex, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGridlevel_level1_Allowselection, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGridlevel_level1_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGridlevel_level1_Allowhovering, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGridlevel_level1_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGridlevel_level1_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGridlevel_level1_Collapsed, (byte)(1), (byte)(0), ".", "")));
   }

   public void init_default_properties( )
   {
      edtSalExtAlb_Internalname = "SALEXTALB" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      edtSalExtFec_Internalname = "SALEXTFEC" ;
      edtSalExtHor_Internalname = "SALEXTHOR" ;
      edtSalFecEnt_Internalname = "SALFECENT" ;
      edtSalExtUsu_Internalname = "SALEXTUSU" ;
      edtSalSts_Internalname = "SALSTS" ;
      divUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
      edtManCod_Internalname = "MANCOD" ;
      edtSalExtPre1_Internalname = "SALEXTPRE1" ;
      divSalextpre1_cell_Internalname = "SALEXTPRE1_CELL" ;
      divUnnamedtable3_Internalname = "UNNAMEDTABLE3" ;
      edtTrnCod_Internalname = "TRNCOD" ;
      edtSalExtMat_Internalname = "SALEXTMAT" ;
      divUnnamedtable4_Internalname = "UNNAMEDTABLE4" ;
      edtSalExtObs_Internalname = "SALEXTOBS" ;
      divTableattributes_Internalname = "TABLEATTRIBUTES" ;
      Dvpanel_tableattributes_Internalname = "DVPANEL_TABLEATTRIBUTES" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      edtSalExNln_Internalname = "SALEXNLN" ;
      edtBarCod_Internalname = "BARCOD" ;
      edtBarCodReo_Internalname = "BARCODREO" ;
      edtBarCodPar_Internalname = "BARCODPAR" ;
      edtCliCod_Internalname = "CLICOD" ;
      edtBarSer_Internalname = "BARSER" ;
      edtBarSerDsc_Internalname = "BARSERDSC" ;
      edtBarColNom_Internalname = "BARCOLNOM" ;
      edtBarColNum_Internalname = "BARCOLNUM" ;
      edtBarNomCli_Internalname = "BARNOMCLI" ;
      edtFasCodn_Internalname = "FASCODN" ;
      edtavImgprompt_Internalname = "vIMGPROMPT" ;
      edtOrdLin_Internalname = "ORDLIN" ;
      edtSalExCoE_Internalname = "SALEXCOE" ;
      edtSalExKgE_Internalname = "SALEXKGE" ;
      edtSalExMtE_Internalname = "SALEXMTE" ;
      edtBarSit_Internalname = "BARSIT" ;
      edtMetrosRece_Internalname = "METROSRECE" ;
      edtKilosRecep_Internalname = "KILOSRECEP" ;
      edtPiezasRece_Internalname = "PIEZASRECE" ;
      edtBarExt_Internalname = "BAREXT" ;
      divTableleaflevel_level1_Internalname = "TABLELEAFLEVEL_LEVEL1" ;
      bttBtntrn_enter_Internalname = "BTNTRN_ENTER" ;
      bttBtneliminarlinea_Internalname = "BTNELIMINARLINEA" ;
      bttBtntrn_cancel_Internalname = "BTNTRN_CANCEL" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      edtSalExtEst_Internalname = "SALEXTEST" ;
      edtSalExtLis_Internalname = "SALEXTLIS" ;
      edtSalExtSec_Internalname = "SALEXTSEC" ;
      edtSalExUln_Internalname = "SALEXULN" ;
      edtSalExtAT_Internalname = "SALEXTAT" ;
      edtSalCodeID_Internalname = "SALCODEID" ;
      edtSalEnvAT_Internalname = "SALENVAT" ;
      edtSalFmdD_Internalname = "SALFMDD" ;
      edtSalGrossT_Internalname = "SALGROSST" ;
      edtSalFmd_Internalname = "SALFMD" ;
      edtSalFhh_Internalname = "SALFHH" ;
      Dvelop_confirmpanel_eliminarlinea_Internalname = "DVELOP_CONFIRMPANEL_ELIMINARLINEA" ;
      tblTabledvelop_confirmpanel_eliminarlinea_Internalname = "TABLEDVELOP_CONFIRMPANEL_ELIMINARLINEA" ;
      divHtml_bottomauxiliarcontrols_Internalname = "HTML_BOTTOMAUXILIARCONTROLS" ;
      divLayoutmaintable_Internalname = "LAYOUTMAINTABLE" ;
      Form.setInternalname( "FORM" );
      subGridlevel_level1_Internalname = "GRIDLEVEL_LEVEL1" ;
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
      subGridlevel_level1_Allowcollapsing = (byte)(0) ;
      subGridlevel_level1_Allowselection = (byte)(0) ;
      subGridlevel_level1_Header = "" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "Trabajos Externos (Envio)", "") );
      edtBarExt_Jsonclick = "" ;
      edtPiezasRece_Jsonclick = "" ;
      edtKilosRecep_Jsonclick = "" ;
      edtMetrosRece_Jsonclick = "" ;
      edtBarSit_Jsonclick = "" ;
      edtSalExMtE_Jsonclick = "" ;
      edtSalExKgE_Jsonclick = "" ;
      edtSalExCoE_Jsonclick = "" ;
      edtOrdLin_Jsonclick = "" ;
      edtFasCodn_Jsonclick = "" ;
      edtBarNomCli_Jsonclick = "" ;
      edtBarColNum_Jsonclick = "" ;
      edtBarColNom_Jsonclick = "" ;
      edtBarSerDsc_Jsonclick = "" ;
      edtBarSer_Jsonclick = "" ;
      edtCliCod_Jsonclick = "" ;
      edtBarCodPar_Jsonclick = "" ;
      edtBarCodReo_Jsonclick = "" ;
      edtBarCod_Jsonclick = "" ;
      edtSalExNln_Jsonclick = "" ;
      subGridlevel_level1_Class = "GridNoBorder WorkWith" ;
      subGridlevel_level1_Backcolorstyle = (byte)(0) ;
      edtavImgprompt_gximage = "" ;
      edtBarExt_Enabled = 0 ;
      edtPiezasRece_Enabled = 0 ;
      edtKilosRecep_Enabled = 0 ;
      edtMetrosRece_Enabled = 0 ;
      edtBarSit_Enabled = 0 ;
      edtSalExMtE_Enabled = 1 ;
      edtSalExKgE_Enabled = 1 ;
      edtSalExCoE_Enabled = 1 ;
      edtOrdLin_Enabled = 1 ;
      edtavImgprompt_Visible = -1 ;
      edtavImgprompt_Link = "" ;
      edtavImgprompt_Enabled = 1 ;
      edtFasCodn_Enabled = 1 ;
      edtBarNomCli_Enabled = 0 ;
      edtBarColNum_Enabled = 0 ;
      edtBarColNom_Enabled = 0 ;
      edtBarSerDsc_Enabled = 0 ;
      edtBarSer_Enabled = 0 ;
      edtCliCod_Enabled = 0 ;
      edtBarCodPar_Enabled = 1 ;
      edtBarCodReo_Enabled = 1 ;
      edtBarCod_Enabled = 1 ;
      edtSalExNln_Enabled = 1 ;
      Dvelop_confirmpanel_eliminarlinea_Confirmtype = "1" ;
      Dvelop_confirmpanel_eliminarlinea_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_eliminarlinea_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_eliminarlinea_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_eliminarlinea_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_eliminarlinea_Confirmationtext = "¿Desea eliminar la linea?" ;
      Dvelop_confirmpanel_eliminarlinea_Title = "" ;
      edtSalFhh_Jsonclick = "" ;
      edtSalFhh_Enabled = 1 ;
      edtSalFhh_Visible = 1 ;
      edtSalFmd_Enabled = 1 ;
      edtSalFmd_Visible = 1 ;
      edtSalGrossT_Jsonclick = "" ;
      edtSalGrossT_Enabled = 1 ;
      edtSalGrossT_Visible = 1 ;
      edtSalFmdD_Enabled = 1 ;
      edtSalFmdD_Visible = 1 ;
      edtSalEnvAT_Jsonclick = "" ;
      edtSalEnvAT_Enabled = 1 ;
      edtSalEnvAT_Visible = 1 ;
      edtSalCodeID_Jsonclick = "" ;
      edtSalCodeID_Enabled = 1 ;
      edtSalCodeID_Visible = 1 ;
      edtSalExtAT_Jsonclick = "" ;
      edtSalExtAT_Enabled = 1 ;
      edtSalExtAT_Visible = 1 ;
      edtSalExUln_Jsonclick = "" ;
      edtSalExUln_Enabled = 0 ;
      edtSalExUln_Visible = 1 ;
      edtSalExtSec_Jsonclick = "" ;
      edtSalExtSec_Enabled = 1 ;
      edtSalExtSec_Visible = 1 ;
      edtSalExtLis_Jsonclick = "" ;
      edtSalExtLis_Enabled = 1 ;
      edtSalExtLis_Visible = 1 ;
      edtSalExtEst_Jsonclick = "" ;
      edtSalExtEst_Enabled = 1 ;
      edtSalExtEst_Visible = 1 ;
      bttBtntrn_cancel_Visible = 1 ;
      bttBtneliminarlinea_Visible = 1 ;
      bttBtntrn_enter_Enabled = 1 ;
      bttBtntrn_enter_Visible = 1 ;
      edtSalExtObs_Enabled = 1 ;
      edtSalExtMat_Jsonclick = "" ;
      edtSalExtMat_Enabled = 1 ;
      edtTrnCod_Jsonclick = "" ;
      edtTrnCod_Enabled = 1 ;
      edtSalExtPre1_Jsonclick = "" ;
      edtSalExtPre1_Enabled = 1 ;
      edtSalExtPre1_Visible = 1 ;
      divSalextpre1_cell_Class = "col-xs-12 col-sm-6" ;
      edtManCod_Jsonclick = "" ;
      edtManCod_Enabled = 1 ;
      edtSalSts_Jsonclick = "" ;
      edtSalSts_Enabled = 0 ;
      edtSalExtUsu_Jsonclick = "" ;
      edtSalExtUsu_Enabled = 0 ;
      edtSalFecEnt_Jsonclick = "" ;
      edtSalFecEnt_Enabled = 1 ;
      edtSalExtHor_Jsonclick = "" ;
      edtSalExtHor_Enabled = 1 ;
      edtSalExtFec_Jsonclick = "" ;
      edtSalExtFec_Enabled = 1 ;
      edtSalExtAlb_Jsonclick = "" ;
      edtSalExtAlb_Enabled = 0 ;
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

   public void gxsgamancod1PS0( String A396EmprCod ,
                                String A13847ManNomID )
   {
      if ( ! httpContext.isAjaxRequest( ) )
      {
         httpContext.GX_webresponse.addHeader("Cache-Control", "no-store");
      }
      addString( "[[") ;
      gxsgamancod_data1PS0( A396EmprCod, A13847ManNomID) ;
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

   protected void gxsgamancod_data1PS0( String A396EmprCod ,
                                        String A13847ManNomID )
   {
      l13847ManNomID = GXutil.concat( GXutil.rtrim( A13847ManNomID), "%", "") ;
      /* Using cursor T01PS44 */
      pr_default.execute(42, new Object[] {A396EmprCod, l13847ManNomID});
      gxdynajaxctrlcodr.removeAllItems();
      gxdynajaxctrldescr.removeAllItems();
      while ( (pr_default.getStatus(42) != 101) )
      {
         gxdynajaxctrlcodr.add(T01PS44_A13847ManNomID[0]);
         gxdynajaxctrldescr.add(T01PS44_A13847ManNomID[0]);
         pr_default.readNext(42);
      }
      pr_default.close(42);
   }

   public void gxsgatrncod1PS0( String A396EmprCod ,
                                String A13738TrnCNom )
   {
      if ( ! httpContext.isAjaxRequest( ) )
      {
         httpContext.GX_webresponse.addHeader("Cache-Control", "no-store");
      }
      addString( "[[") ;
      gxsgatrncod_data1PS0( A396EmprCod, A13738TrnCNom) ;
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

   protected void gxsgatrncod_data1PS0( String A396EmprCod ,
                                        String A13738TrnCNom )
   {
      l13738TrnCNom = GXutil.concat( GXutil.rtrim( A13738TrnCNom), "%", "") ;
      /* Using cursor T01PS45 */
      pr_default.execute(43, new Object[] {A396EmprCod, l13738TrnCNom});
      gxdynajaxctrlcodr.removeAllItems();
      gxdynajaxctrldescr.removeAllItems();
      while ( (pr_default.getStatus(43) != 101) )
      {
         gxdynajaxctrlcodr.add(T01PS45_A13738TrnCNom[0]);
         gxdynajaxctrldescr.add(T01PS45_A13738TrnCNom[0]);
         pr_default.readNext(43);
      }
      pr_default.close(43);
   }

   public void gxhcamancod1PS305( String A396EmprCod ,
                                  String A13847ManNomID )
   {
      /* Using cursor T01PS46 */
      pr_default.execute(44, new Object[] {A13847ManNomID, A396EmprCod});
      gxhchits = (short)(0) ;
      while ( (pr_default.getStatus(44) != 101) )
      {
         gxhchits = (short)(gxhchits+1) ;
         if ( gxhchits > 1 )
         {
            if (true) break;
         }
         A13847ManNomID = T01PS46_A13847ManNomID[0] ;
         A396EmprCod = T01PS46_A396EmprCod[0] ;
         A2248ManCod = T01PS46_A2248ManCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2248ManCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2248ManCod), 4, 0));
         pr_default.readNext(44);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A2248ManCod, (byte)(4), (byte)(0), ".", "")))+"\"") ;
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
      pr_default.close(44);
   }

   public void gxhcatrncod1PS305( String A396EmprCod ,
                                  String A13738TrnCNom )
   {
      /* Using cursor T01PS47 */
      pr_default.execute(45, new Object[] {A13738TrnCNom, A396EmprCod});
      gxhchits = (short)(0) ;
      while ( (pr_default.getStatus(45) != 101) )
      {
         gxhchits = (short)(gxhchits+1) ;
         if ( gxhchits > 1 )
         {
            if (true) break;
         }
         A13738TrnCNom = T01PS47_A13738TrnCNom[0] ;
         A396EmprCod = T01PS47_A396EmprCod[0] ;
         A840TrnCod = T01PS47_A840TrnCod[0] ;
         n840TrnCod = T01PS47_n840TrnCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
         pr_default.readNext(45);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A840TrnCod, (byte)(4), (byte)(0), ".", "")))+"\"") ;
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
      pr_default.close(45);
   }

   public void gxasa132441PS305( String A396EmprCod )
   {
      GXt_int5 = (byte)(0) ;
      GXv_int11[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "BIARPR", ""), ""), GXv_int11) ;
      trabajosexternosenvio_impl.this.GXt_int5 = GXv_int11[0] ;
      edtSalExtPre1_Visible = ((GXt_int5==1) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtSalExtPre1_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSalExtPre1_Visible), 5, 0), true);
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

   public void gx14asasalexthor1PS305( java.util.Date A2256SalExtFec ,
                                       String Gx_mode ,
                                       String A396EmprCod )
   {
      if ( isIns( )  && (GXutil.strcmp("", A6396SalExtHor)==0) && true /* After */ )
      {
         GXt_char1 = A6396SalExtHor ;
         GXv_char13[0] = A396EmprCod ;
         GXv_char4[0] = GXt_char1 ;
         new app.phragr3(remoteHandle, context).execute( GXv_char13, GXv_char4) ;
         trabajosexternosenvio_impl.this.A396EmprCod = GXv_char13[0] ;
         trabajosexternosenvio_impl.this.GXt_char1 = GXv_char4[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A6396SalExtHor = GXt_char1 ;
         httpContext.ajax_rsp_assign_attri("", false, "A6396SalExtHor", A6396SalExtHor);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A6396SalExtHor))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void gx40asasalexkge1PS910( String Gx_mode ,
                                      String A396EmprCod ,
                                      int A129BarCod ,
                                      byte A132BarCodReo ,
                                      String A130BarCodPar )
   {
      if ( isIns( )  )
      {
         GXt_decimal14 = A6256SalExKgE ;
         GXv_decimal19[0] = GXt_decimal14 ;
         new app.pkgsext(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, GXv_decimal19) ;
         trabajosexternosenvio_impl.this.GXt_decimal14 = GXv_decimal19[0] ;
         A6256SalExKgE = GXt_decimal14 ;
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A6256SalExKgE, (byte)(9), (byte)(2), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void gx41asasalexmte1PS910( String Gx_mode ,
                                      String A396EmprCod ,
                                      int A129BarCod ,
                                      byte A132BarCodReo ,
                                      String A130BarCodPar )
   {
      if ( isIns( )  )
      {
         GXt_decimal14 = A6258SalExMtE ;
         GXv_char13[0] = A396EmprCod ;
         GXv_int23[0] = A129BarCod ;
         GXv_int11[0] = A132BarCodReo ;
         GXv_char4[0] = A130BarCodPar ;
         GXv_decimal19[0] = GXt_decimal14 ;
         new app.pmtsext(remoteHandle, context).execute( GXv_char13, GXv_int23, GXv_int11, GXv_char4, GXv_decimal19) ;
         trabajosexternosenvio_impl.this.A396EmprCod = GXv_char13[0] ;
         trabajosexternosenvio_impl.this.A129BarCod = GXv_int23[0] ;
         trabajosexternosenvio_impl.this.A132BarCodReo = GXv_int11[0] ;
         trabajosexternosenvio_impl.this.A130BarCodPar = GXv_char4[0] ;
         trabajosexternosenvio_impl.this.GXt_decimal14 = GXv_decimal19[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A6258SalExMtE = GXt_decimal14 ;
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A6258SalExMtE, (byte)(9), (byte)(2), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void gx42asasalexcoe1PS910( String Gx_mode ,
                                      String A396EmprCod ,
                                      int A129BarCod ,
                                      byte A132BarCodReo ,
                                      String A130BarCodPar )
   {
      if ( isIns( )  )
      {
         GXt_int16 = A6257SalExCoE ;
         GXv_char13[0] = A396EmprCod ;
         GXv_int23[0] = A129BarCod ;
         GXv_int11[0] = A132BarCodReo ;
         GXv_char4[0] = A130BarCodPar ;
         GXv_int12[0] = GXt_int16 ;
         new app.ppzsext(remoteHandle, context).execute( GXv_char13, GXv_int23, GXv_int11, GXv_char4, GXv_int12) ;
         trabajosexternosenvio_impl.this.A396EmprCod = GXv_char13[0] ;
         trabajosexternosenvio_impl.this.A129BarCod = GXv_int23[0] ;
         trabajosexternosenvio_impl.this.A132BarCodReo = GXv_int11[0] ;
         trabajosexternosenvio_impl.this.A130BarCodPar = GXv_char4[0] ;
         trabajosexternosenvio_impl.this.GXt_int16 = GXv_int12[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A6257SalExCoE = GXt_int16 ;
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A6257SalExCoE, (byte)(6), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_29_1PS305( )
   {
      if ( isIns( )  && true /* Level */ && true /* After */ && ! (0==A2253SalExtAlb) && (0==AV24firmad) )
      {
         GXv_char13[0] = A396EmprCod ;
         GXv_char4[0] = httpContext.getMessage( "EXTHDR", "") ;
         GXv_int23[0] = A2253SalExtAlb ;
         GXv_int11[0] = (byte)(AV30FlagAlb) ;
         GXv_int6[0] = (byte)(AV31FlagCont) ;
         new app.pmanext(remoteHandle, context).execute( GXv_char13, GXv_char4, GXv_int23, GXv_int11, GXv_int6) ;
         A396EmprCod = GXv_char13[0] ;
         A2253SalExtAlb = GXv_int23[0] ;
         AV30FlagAlb = GXv_int11[0] ;
         AV31FlagCont = GXv_int6[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A2253SalExtAlb", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2253SalExtAlb), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV30FlagAlb", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV30FlagAlb), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV31FlagCont", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV31FlagCont), 4, 0));
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

   public void xc_30_1PS305( )
   {
      if ( (0==A2253SalExtAlb) && true /* Level */ && true /* After */ )
      {
         GXv_int23[0] = A2253SalExtAlb ;
         new app.pnumdoc(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "EXTHDR", ""), GXv_int23) ;
         A2253SalExtAlb = GXv_int23[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2253SalExtAlb", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2253SalExtAlb), 8, 0));
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

   public void xc_52_1PS910( String A396EmprCod ,
                             int A129BarCod ,
                             byte A132BarCodReo ,
                             String A130BarCodPar ,
                             short A654OrdLin )
   {
      if ( true /* After */ && ( A654OrdLin > 0 ) )
      {
         GXv_char13[0] = A396EmprCod ;
         GXv_int23[0] = A129BarCod ;
         GXv_int11[0] = A132BarCodReo ;
         GXv_char4[0] = A130BarCodPar ;
         GXv_int22[0] = A654OrdLin ;
         GXv_char3[0] = AV19msgerr ;
         new app.exorden(remoteHandle, context).execute( GXv_char13, GXv_int23, GXv_int11, GXv_char4, GXv_int22, GXv_char3) ;
         A396EmprCod = GXv_char13[0] ;
         A129BarCod = GXv_int23[0] ;
         A132BarCodReo = GXv_int11[0] ;
         A130BarCodPar = GXv_char4[0] ;
         A654OrdLin = GXv_int22[0] ;
         AV19msgerr = GXv_char3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "AV19msgerr", AV19msgerr);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A130BarCodPar))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A654OrdLin, (byte)(4), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( AV19msgerr)+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_53_1PS910( String Gx_mode ,
                             String A396EmprCod ,
                             short A2248ManCod ,
                             int A2253SalExtAlb ,
                             short A6248SalExNln ,
                             java.util.Date A2256SalExtFec ,
                             int A129BarCod ,
                             byte A132BarCodReo ,
                             String A130BarCodPar ,
                             short A654OrdLin ,
                             String A6558FasCodn ,
                             java.math.BigDecimal A6256SalExKgE ,
                             java.math.BigDecimal A6258SalExMtE ,
                             int A6257SalExCoE )
   {
      if ( isIns( )  && ! (GXutil.strcmp("", A6558FasCodn)==0) && true /* After */ )
      {
         GXv_char13[0] = A396EmprCod ;
         GXv_int22[0] = A2248ManCod ;
         GXv_int23[0] = A2253SalExtAlb ;
         GXv_int21[0] = A6248SalExNln ;
         GXv_date10[0] = A2256SalExtFec ;
         GXv_int12[0] = A129BarCod ;
         GXv_int11[0] = A132BarCodReo ;
         GXv_char4[0] = A130BarCodPar ;
         GXv_int20[0] = A654OrdLin ;
         GXv_char3[0] = A6558FasCodn ;
         GXv_decimal19[0] = A6256SalExKgE ;
         GXv_decimal18[0] = A6258SalExMtE ;
         GXv_int8[0] = A6257SalExCoE ;
         new app.trabajosexternos.pwork01(remoteHandle, context).execute( GXv_char13, GXv_int22, GXv_int23, GXv_int21, GXv_date10, GXv_int12, GXv_int11, GXv_char4, GXv_int20, GXv_char3, GXv_decimal19, GXv_decimal18, GXv_int8) ;
         A396EmprCod = GXv_char13[0] ;
         A2248ManCod = GXv_int22[0] ;
         A2253SalExtAlb = GXv_int23[0] ;
         A6248SalExNln = GXv_int21[0] ;
         A2256SalExtFec = GXv_date10[0] ;
         A129BarCod = GXv_int12[0] ;
         A132BarCodReo = GXv_int11[0] ;
         A130BarCodPar = GXv_char4[0] ;
         A654OrdLin = GXv_int20[0] ;
         A6558FasCodn = GXv_char3[0] ;
         A6256SalExKgE = GXv_decimal19[0] ;
         A6258SalExMtE = GXv_decimal18[0] ;
         A6257SalExCoE = GXv_int8[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A2248ManCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2248ManCod), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A2253SalExtAlb", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2253SalExtAlb), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A2256SalExtFec", localUtil.format(A2256SalExtFec, "99/99/99"));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A2248ManCod, (byte)(4), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A2253SalExtAlb, (byte)(8), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A6248SalExNln, (byte)(4), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( localUtil.format(A2256SalExtFec, "99/99/99"))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A130BarCodPar))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A654OrdLin, (byte)(4), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A6558FasCodn))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A6256SalExKgE, (byte)(9), (byte)(2), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A6258SalExMtE, (byte)(9), (byte)(2), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A6257SalExCoE, (byte)(6), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_54_1PS910( String Gx_mode ,
                             String A396EmprCod ,
                             short A2248ManCod ,
                             int A2253SalExtAlb ,
                             short A6248SalExNln ,
                             java.util.Date A2256SalExtFec ,
                             int A129BarCod ,
                             byte A132BarCodReo ,
                             String A130BarCodPar ,
                             short A654OrdLin ,
                             String A6558FasCodn ,
                             java.math.BigDecimal A6256SalExKgE ,
                             java.math.BigDecimal A6258SalExMtE ,
                             int A6257SalExCoE )
   {
      if ( isUpd( )  && ! (GXutil.strcmp("", A6558FasCodn)==0) && true /* After */ )
      {
         GXv_char13[0] = A396EmprCod ;
         GXv_int22[0] = A2248ManCod ;
         GXv_int23[0] = A2253SalExtAlb ;
         GXv_int21[0] = A6248SalExNln ;
         GXv_date10[0] = A2256SalExtFec ;
         GXv_int12[0] = A129BarCod ;
         GXv_int11[0] = A132BarCodReo ;
         GXv_char4[0] = A130BarCodPar ;
         GXv_int20[0] = A654OrdLin ;
         GXv_char3[0] = A6558FasCodn ;
         GXv_decimal19[0] = A6256SalExKgE ;
         GXv_decimal18[0] = A6258SalExMtE ;
         GXv_int8[0] = A6257SalExCoE ;
         new app.pwork11(remoteHandle, context).execute( GXv_char13, GXv_int22, GXv_int23, GXv_int21, GXv_date10, GXv_int12, GXv_int11, GXv_char4, GXv_int20, GXv_char3, GXv_decimal19, GXv_decimal18, GXv_int8) ;
         A396EmprCod = GXv_char13[0] ;
         A2248ManCod = GXv_int22[0] ;
         A2253SalExtAlb = GXv_int23[0] ;
         A6248SalExNln = GXv_int21[0] ;
         A2256SalExtFec = GXv_date10[0] ;
         A129BarCod = GXv_int12[0] ;
         A132BarCodReo = GXv_int11[0] ;
         A130BarCodPar = GXv_char4[0] ;
         A654OrdLin = GXv_int20[0] ;
         A6558FasCodn = GXv_char3[0] ;
         A6256SalExKgE = GXv_decimal19[0] ;
         A6258SalExMtE = GXv_decimal18[0] ;
         A6257SalExCoE = GXv_int8[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A2248ManCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2248ManCod), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A2253SalExtAlb", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2253SalExtAlb), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A2256SalExtFec", localUtil.format(A2256SalExtFec, "99/99/99"));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A2248ManCod, (byte)(4), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A2253SalExtAlb, (byte)(8), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A6248SalExNln, (byte)(4), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( localUtil.format(A2256SalExtFec, "99/99/99"))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A130BarCodPar))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A654OrdLin, (byte)(4), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A6558FasCodn))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A6256SalExKgE, (byte)(9), (byte)(2), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A6258SalExMtE, (byte)(9), (byte)(2), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A6257SalExCoE, (byte)(6), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_55_1PS910( )
   {
      if ( true /* After */ )
      {
         GXv_char13[0] = A396EmprCod ;
         GXv_int22[0] = A2248ManCod ;
         GXv_char4[0] = A6558FasCodn ;
         GXv_char3[0] = httpContext.getMessage( "E", "") ;
         GXv_int23[0] = A2253SalExtAlb ;
         GXv_int12[0] = A129BarCod ;
         GXv_int11[0] = A132BarCodReo ;
         GXv_char2[0] = A130BarCodPar ;
         GXv_decimal19[0] = A6256SalExKgE ;
         GXv_decimal18[0] = AV20OldKg ;
         GXv_decimal17[0] = A6258SalExMtE ;
         GXv_decimal15[0] = AV21OldMt ;
         GXv_int21[0] = (short)(A6257SalExCoE) ;
         GXv_int20[0] = (short)(AV22OldPz) ;
         GXv_date10[0] = A2256SalExtFec ;
         GXv_int9[0] = A6248SalExNln ;
         new app.pmmvexhd(remoteHandle, context).execute( GXv_char13, GXv_int22, GXv_char4, GXv_char3, GXv_int23, GXv_int12, GXv_int11, GXv_char2, GXv_decimal19, GXv_decimal18, GXv_decimal17, GXv_decimal15, GXv_int21, GXv_int20, GXv_date10, GXv_int9) ;
         A396EmprCod = GXv_char13[0] ;
         A2248ManCod = GXv_int22[0] ;
         A6558FasCodn = GXv_char4[0] ;
         A2253SalExtAlb = GXv_int23[0] ;
         A129BarCod = GXv_int12[0] ;
         A132BarCodReo = GXv_int11[0] ;
         A130BarCodPar = GXv_char2[0] ;
         A6256SalExKgE = GXv_decimal19[0] ;
         AV20OldKg = GXv_decimal18[0] ;
         A6258SalExMtE = GXv_decimal17[0] ;
         AV21OldMt = GXv_decimal15[0] ;
         A6257SalExCoE = GXv_int21[0] ;
         AV22OldPz = GXv_int20[0] ;
         A2256SalExtFec = GXv_date10[0] ;
         A6248SalExNln = GXv_int9[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A2248ManCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2248ManCod), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A2253SalExtAlb", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2253SalExtAlb), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV20OldKg", GXutil.ltrimstr( AV20OldKg, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "AV21OldMt", GXutil.ltrimstr( AV21OldMt, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "AV22OldPz", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV22OldPz), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A2256SalExtFec", localUtil.format(A2256SalExtFec, "99/99/99"));
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

   public void xc_56_1PS910( String Gx_mode ,
                             String A396EmprCod ,
                             int A129BarCod ,
                             byte A132BarCodReo ,
                             String A130BarCodPar ,
                             String A6558FasCodn ,
                             String AV23Msg_err )
   {
      if ( ( isIns( )  || isUpd( )  ) && true /* After */ && ! (GXutil.strcmp("", A6558FasCodn)==0) )
      {
         GXv_char13[0] = A396EmprCod ;
         GXv_int23[0] = A129BarCod ;
         GXv_int11[0] = A132BarCodReo ;
         GXv_char4[0] = A130BarCodPar ;
         GXv_char3[0] = A6558FasCodn ;
         GXv_char2[0] = AV23Msg_err ;
         new app.pfasanx(remoteHandle, context).execute( GXv_char13, GXv_int23, GXv_int11, GXv_char4, GXv_char3, GXv_char2) ;
         A396EmprCod = GXv_char13[0] ;
         A129BarCod = GXv_int23[0] ;
         A132BarCodReo = GXv_int11[0] ;
         A130BarCodPar = GXv_char4[0] ;
         A6558FasCodn = GXv_char3[0] ;
         AV23Msg_err = GXv_char2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "AV23Msg_err", AV23Msg_err);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A130BarCodPar))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A6558FasCodn))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( AV23Msg_err)+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void gxnrgridlevel_level1_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      subsflControlProps_84910( ) ;
      while ( nGXsfl_84_idx <= nRC_GXsfl_84 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal1PS910( ) ;
         standaloneModal1PS910( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow1PS910( ) ;
         nGXsfl_84_idx = (int)(nGXsfl_84_idx+1) ;
         sGXsfl_84_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_84_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_84910( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Gridlevel_level1Container)) ;
      /* End function gxnrGridlevel_level1_newrow */
   }

   public void init_web_controls( )
   {
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

   public void valid_Salextfec( )
   {
      if ( isIns( )  && (GXutil.strcmp("", A6396SalExtHor)==0) && true /* After */ )
      {
         GXt_char1 = A6396SalExtHor ;
         GXv_char13[0] = A396EmprCod ;
         GXv_char4[0] = GXt_char1 ;
         new app.phragr3(remoteHandle, context).execute( GXv_char13, GXv_char4) ;
         trabajosexternosenvio_impl.this.A396EmprCod = GXv_char13[0] ;
         trabajosexternosenvio_impl.this.GXt_char1 = GXv_char4[0] ;
         A6396SalExtHor = GXt_char1 ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A6396SalExtHor", GXutil.rtrim( A6396SalExtHor));
   }

   public void valid_Mancod( )
   {
      n2249ManNom = false ;
      if ( (GXutil.strcmp("", h2248ManCod)==0) )
      {
         A2248ManCod = (short)(0) ;
      }
      else
      {
         A13847ManNomID = h2248ManCod ;
         /* Using cursor T01PS48 */
         pr_default.execute(46, new Object[] {A13847ManNomID, A396EmprCod});
         A2248ManCod = T01PS48_A2248ManCod[0] ;
         A2248ManCod = T01PS48_A2248ManCod[0] ;
         if ( ! ( (pr_default.getStatus(46) == 101) ) )
         {
            pr_default.readNext(46);
            if ( ! ( (pr_default.getStatus(46) == 101) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Codigo-Nombre", "")}), 1, "MANCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtManCod_Internalname ;
            }
         }
         else
         {
         }
         pr_default.close(46);
      }
      httpContext.ajax_rsp_assign_attri("", false, "h2248ManCod", h2248ManCod);
      /* Using cursor T01PS49 */
      pr_default.execute(47, new Object[] {A396EmprCod, Short.valueOf(A2248ManCod)});
      if ( (pr_default.getStatus(47) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "MANUFA", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "MANCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtManCod_Internalname ;
      }
      A2249ManNom = T01PS49_A2249ManNom[0] ;
      n2249ManNom = T01PS49_n2249ManNom[0] ;
      pr_default.close(47);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", GXutil.rtrim( A396EmprCod));
      httpContext.ajax_rsp_assign_attri("", false, "A2248ManCod", GXutil.ltrim( localUtil.ntoc( A2248ManCod, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A2249ManNom", GXutil.rtrim( A2249ManNom));
      httpContext.ajax_rsp_assign_attri("", false, "h2248ManCod", h2248ManCod);
   }

   public void valid_Trncod( )
   {
      n840TrnCod = false ;
      n841TrnNom = false ;
      if ( (GXutil.strcmp("", h840TrnCod)==0) )
      {
         A840TrnCod = (short)(0) ;
         n840TrnCod = false ;
      }
      else
      {
         A13738TrnCNom = h840TrnCod ;
         /* Using cursor T01PS50 */
         pr_default.execute(48, new Object[] {A13738TrnCNom, A396EmprCod});
         A840TrnCod = T01PS50_A840TrnCod[0] ;
         n840TrnCod = T01PS50_n840TrnCod[0] ;
         A840TrnCod = T01PS50_A840TrnCod[0] ;
         n840TrnCod = T01PS50_n840TrnCod[0] ;
         if ( ! ( (pr_default.getStatus(48) == 101) ) )
         {
            pr_default.readNext(48);
            if ( ! ( (pr_default.getStatus(48) == 101) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Codigo-Nombre", "")}), 1, "TRNCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTrnCod_Internalname ;
            }
         }
         else
         {
         }
         pr_default.close(48);
      }
      httpContext.ajax_rsp_assign_attri("", false, "h840TrnCod", h840TrnCod);
      /* Using cursor T01PS51 */
      pr_default.execute(49, new Object[] {A396EmprCod, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod)});
      if ( (pr_default.getStatus(49) == 101) )
      {
         if ( ! ( (0==A840TrnCod) && (GXutil.strcmp("", A13738TrnCNom)==0) || (0==A840TrnCod) && n840TrnCod || (GXutil.strcmp("", A396EmprCod)==0) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TRANSP", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TRNCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTrnCod_Internalname ;
         }
      }
      A841TrnNom = T01PS51_A841TrnNom[0] ;
      n841TrnNom = T01PS51_n841TrnNom[0] ;
      pr_default.close(49);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", GXutil.rtrim( A396EmprCod));
      httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrim( localUtil.ntoc( A840TrnCod, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A841TrnNom", GXutil.rtrim( A841TrnNom));
      httpContext.ajax_rsp_assign_attri("", false, "h840TrnCod", h840TrnCod);
   }

   public void valid_Salextsec( )
   {
      if ( isIns( )  && true /* Level */ && true /* After */ && ! (0==A2253SalExtAlb) && (0==AV24firmad) )
      {
         GXv_char13[0] = A396EmprCod ;
         GXv_char4[0] = httpContext.getMessage( "EXTHDR", "") ;
         GXv_int23[0] = A2253SalExtAlb ;
         GXv_int11[0] = (byte)(AV30FlagAlb) ;
         GXv_int6[0] = (byte)(AV31FlagCont) ;
         new app.pmanext(remoteHandle, context).execute( GXv_char13, GXv_char4, GXv_int23, GXv_int11, GXv_int6) ;
         trabajosexternosenvio_impl.this.A396EmprCod = GXv_char13[0] ;
         trabajosexternosenvio_impl.this.A2253SalExtAlb = GXv_int23[0] ;
         trabajosexternosenvio_impl.this.AV30FlagAlb = GXv_int11[0] ;
         AV30FlagAlb = this.AV30FlagAlb ;
         trabajosexternosenvio_impl.this.AV31FlagCont = GXv_int6[0] ;
         AV31FlagCont = this.AV31FlagCont ;
      }
      if ( isIns( )  && ( AV31FlagCont == 1 ) && (0==AV24firmad) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "ERROR: Intentamos dar de ALTA un ALBARAN > CONTADOR manualmente", ""), 1, "SALEXTSEC");
         AnyError = (short)(1) ;
         GX_FocusControl = edtSalExtSec_Internalname ;
      }
      if ( isIns( )  && ! (0==A2253SalExtAlb) && (0==AV30FlagAlb) && (0==AV24firmad) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "ATENCION, Va a dar de ALTA un Albaran MANUALMENTE", ""), 0, "");
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "AV31FlagCont", GXutil.ltrim( localUtil.ntoc( AV31FlagCont, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV30FlagAlb", GXutil.ltrim( localUtil.ntoc( AV30FlagAlb, (byte)(4), (byte)(0), ".", "")));
   }

   public void valid_Barcodpar( )
   {
      n2265BarExt = false ;
      n252CliCod = false ;
      /* Using cursor T01PS42 */
      pr_default.execute(40, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(40) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TXPBARCAD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "BARCODPAR");
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarCod_Internalname ;
      }
      A2265BarExt = T01PS42_A2265BarExt[0] ;
      n2265BarExt = T01PS42_n2265BarExt[0] ;
      A212BarSer = T01PS42_A212BarSer[0] ;
      A1652BarSerDsc = T01PS42_A1652BarSerDsc[0] ;
      A135BarColNom = T01PS42_A135BarColNom[0] ;
      A136BarColNum = T01PS42_A136BarColNum[0] ;
      A1234BarNomCli = T01PS42_A1234BarNomCli[0] ;
      A213BarSit = T01PS42_A213BarSit[0] ;
      A252CliCod = T01PS42_A252CliCod[0] ;
      n252CliCod = T01PS42_n252CliCod[0] ;
      pr_default.close(40);
      if ( A213BarSit >= 9 )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Hoja de Ruta CERRADA", ""), 1, "BARCODPAR");
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarCodPar_Internalname ;
      }
      if ( isIns( )  )
      {
         GXt_decimal14 = A6256SalExKgE ;
         GXv_decimal19[0] = GXt_decimal14 ;
         new app.pkgsext(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, GXv_decimal19) ;
         trabajosexternosenvio_impl.this.GXt_decimal14 = GXv_decimal19[0] ;
         A6256SalExKgE = GXt_decimal14 ;
      }
      if ( isIns( )  )
      {
         GXt_decimal14 = A6258SalExMtE ;
         GXv_char13[0] = A396EmprCod ;
         GXv_int23[0] = A129BarCod ;
         GXv_int11[0] = A132BarCodReo ;
         GXv_char4[0] = A130BarCodPar ;
         GXv_decimal19[0] = GXt_decimal14 ;
         new app.pmtsext(remoteHandle, context).execute( GXv_char13, GXv_int23, GXv_int11, GXv_char4, GXv_decimal19) ;
         trabajosexternosenvio_impl.this.A396EmprCod = GXv_char13[0] ;
         trabajosexternosenvio_impl.this.A129BarCod = GXv_int23[0] ;
         trabajosexternosenvio_impl.this.A132BarCodReo = GXv_int11[0] ;
         trabajosexternosenvio_impl.this.A130BarCodPar = GXv_char4[0] ;
         trabajosexternosenvio_impl.this.GXt_decimal14 = GXv_decimal19[0] ;
         A6258SalExMtE = GXt_decimal14 ;
      }
      if ( isIns( )  )
      {
         GXt_int16 = A6257SalExCoE ;
         GXv_char13[0] = A396EmprCod ;
         GXv_int23[0] = A129BarCod ;
         GXv_int11[0] = A132BarCodReo ;
         GXv_char4[0] = A130BarCodPar ;
         GXv_int12[0] = GXt_int16 ;
         new app.ppzsext(remoteHandle, context).execute( GXv_char13, GXv_int23, GXv_int11, GXv_char4, GXv_int12) ;
         trabajosexternosenvio_impl.this.A396EmprCod = GXv_char13[0] ;
         trabajosexternosenvio_impl.this.A129BarCod = GXv_int23[0] ;
         trabajosexternosenvio_impl.this.A132BarCodReo = GXv_int11[0] ;
         trabajosexternosenvio_impl.this.A130BarCodPar = GXv_char4[0] ;
         trabajosexternosenvio_impl.this.GXt_int16 = GXv_int12[0] ;
         A6257SalExCoE = GXt_int16 ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A2265BarExt", GXutil.ltrim( localUtil.ntoc( A2265BarExt, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A212BarSer", GXutil.rtrim( A212BarSer));
      httpContext.ajax_rsp_assign_attri("", false, "A1652BarSerDsc", GXutil.rtrim( A1652BarSerDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A135BarColNom", GXutil.rtrim( A135BarColNom));
      httpContext.ajax_rsp_assign_attri("", false, "A136BarColNum", GXutil.ltrim( localUtil.ntoc( A136BarColNum, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A1234BarNomCli", GXutil.rtrim( A1234BarNomCli));
      httpContext.ajax_rsp_assign_attri("", false, "A213BarSit", GXutil.ltrim( localUtil.ntoc( A213BarSit, (byte)(2), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A6256SalExKgE", GXutil.ltrim( localUtil.ntoc( A6256SalExKgE, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A6258SalExMtE", GXutil.ltrim( localUtil.ntoc( A6258SalExMtE, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A6257SalExCoE", GXutil.ltrim( localUtil.ntoc( A6257SalExCoE, (byte)(6), (byte)(0), ".", "")));
   }

   public void valid_Fascodn( )
   {
      /* Using cursor T01PS52 */
      pr_default.execute(50, new Object[] {A396EmprCod, A6558FasCodn});
      if ( (pr_default.getStatus(50) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "FASPRO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "FASCODN");
         AnyError = (short)(1) ;
         GX_FocusControl = edtFasCodn_Internalname ;
      }
      pr_default.close(50);
      if ( ( isIns( )  || isUpd( )  ) && true /* After */ && ! (GXutil.strcmp("", A6558FasCodn)==0) )
      {
         GXv_char13[0] = A396EmprCod ;
         GXv_int23[0] = A129BarCod ;
         GXv_int11[0] = A132BarCodReo ;
         GXv_char4[0] = A130BarCodPar ;
         GXv_char3[0] = A6558FasCodn ;
         GXv_char2[0] = AV23Msg_err ;
         new app.pfasanx(remoteHandle, context).execute( GXv_char13, GXv_int23, GXv_int11, GXv_char4, GXv_char3, GXv_char2) ;
         trabajosexternosenvio_impl.this.A396EmprCod = GXv_char13[0] ;
         A396EmprCod = this.A396EmprCod ;
         trabajosexternosenvio_impl.this.A129BarCod = GXv_int23[0] ;
         A129BarCod = this.A129BarCod ;
         trabajosexternosenvio_impl.this.A132BarCodReo = GXv_int11[0] ;
         A132BarCodReo = this.A132BarCodReo ;
         trabajosexternosenvio_impl.this.A130BarCodPar = GXv_char4[0] ;
         A130BarCodPar = this.A130BarCodPar ;
         trabajosexternosenvio_impl.this.A6558FasCodn = GXv_char3[0] ;
         A6558FasCodn = this.A6558FasCodn ;
         trabajosexternosenvio_impl.this.AV23Msg_err = GXv_char2[0] ;
         AV23Msg_err = this.AV23Msg_err ;
      }
      if ( ( isIns( )  || isUpd( )  ) && true /* After */ && ! (GXutil.strcmp("", A6558FasCodn)==0) && ! (GXutil.strcmp("", AV23Msg_err)==0) )
      {
         httpContext.GX_msglist.addItem(AV23Msg_err, 1, "FASCODN");
         AnyError = (short)(1) ;
         GX_FocusControl = edtFasCodn_Internalname ;
      }
      if ( (GXutil.strcmp("", A6558FasCodn)==0) && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Falta Codigo Fase", ""), 1, "FASCODN");
         AnyError = (short)(1) ;
         GX_FocusControl = edtFasCodn_Internalname ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", GXutil.rtrim( A396EmprCod));
      httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", GXutil.rtrim( A130BarCodPar));
      httpContext.ajax_rsp_assign_attri("", false, "A6558FasCodn", GXutil.rtrim( A6558FasCodn));
      httpContext.ajax_rsp_assign_attri("", false, "AV23Msg_err", AV23Msg_err);
   }

   public void valid_Ordlin( )
   {
      if ( true /* After */ && ( A654OrdLin > 0 ) )
      {
         GXv_char13[0] = A396EmprCod ;
         GXv_int23[0] = A129BarCod ;
         GXv_int11[0] = A132BarCodReo ;
         GXv_char4[0] = A130BarCodPar ;
         GXv_int22[0] = A654OrdLin ;
         GXv_char3[0] = AV19msgerr ;
         new app.exorden(remoteHandle, context).execute( GXv_char13, GXv_int23, GXv_int11, GXv_char4, GXv_int22, GXv_char3) ;
         trabajosexternosenvio_impl.this.A396EmprCod = GXv_char13[0] ;
         A396EmprCod = this.A396EmprCod ;
         trabajosexternosenvio_impl.this.A129BarCod = GXv_int23[0] ;
         A129BarCod = this.A129BarCod ;
         trabajosexternosenvio_impl.this.A132BarCodReo = GXv_int11[0] ;
         A132BarCodReo = this.A132BarCodReo ;
         trabajosexternosenvio_impl.this.A130BarCodPar = GXv_char4[0] ;
         A130BarCodPar = this.A130BarCodPar ;
         trabajosexternosenvio_impl.this.A654OrdLin = GXv_int22[0] ;
         A654OrdLin = this.A654OrdLin ;
         trabajosexternosenvio_impl.this.AV19msgerr = GXv_char3[0] ;
         AV19msgerr = this.AV19msgerr ;
      }
      if ( ! (GXutil.strcmp("", AV19msgerr)==0) && true /* After */ && ( A654OrdLin > 0 ) )
      {
         httpContext.GX_msglist.addItem(AV19msgerr, 1, "ORDLIN");
         AnyError = (short)(1) ;
         GX_FocusControl = edtOrdLin_Internalname ;
      }
      if ( (0==A654OrdLin) && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Falta Orden Fase", ""), 1, "ORDLIN");
         AnyError = (short)(1) ;
         GX_FocusControl = edtOrdLin_Internalname ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", GXutil.rtrim( A396EmprCod));
      httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", GXutil.rtrim( A130BarCodPar));
      httpContext.ajax_rsp_assign_attri("", false, "A654OrdLin", GXutil.ltrim( localUtil.ntoc( A654OrdLin, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV19msgerr", AV19msgerr);
   }

   public void valid_Salexcoe( )
   {
      A13851PiezasRece = (int)((A6257SalExCoE-A6252SalExCoR)) ;
      AV22OldPz = O6257SalExCoE ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A13851PiezasRece", GXutil.ltrim( localUtil.ntoc( A13851PiezasRece, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV22OldPz", GXutil.ltrim( localUtil.ntoc( AV22OldPz, (byte)(6), (byte)(0), ".", "")));
   }

   public void valid_Salexkge( )
   {
      A13850KilosRecep = (A6256SalExKgE.subtract(A6251SalExKgR)) ;
      AV20OldKg = O6256SalExKgE ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A13850KilosRecep", GXutil.ltrim( localUtil.ntoc( A13850KilosRecep, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV20OldKg", GXutil.ltrim( localUtil.ntoc( AV20OldKg, (byte)(9), (byte)(2), ".", "")));
   }

   public void valid_Salexmte( )
   {
      A13849MetrosRece = (A6258SalExMtE.subtract(A6255SalExMtR)) ;
      AV21OldMt = O6258SalExMtE ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A13849MetrosRece", GXutil.ltrim( localUtil.ntoc( A13849MetrosRece, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV21OldMt", GXutil.ltrim( localUtil.ntoc( AV21OldMt, (byte)(9), (byte)(2), ".", "")));
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV7EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV8SalExtAlb',fld:'vSALEXTALB',pic:'ZZZZZZZ9',hsh:true}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV10TrnContext',fld:'vTRNCONTEXT',pic:'',hsh:true},{av:'AV7EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV8SalExtAlb',fld:'vSALEXTALB',pic:'ZZZZZZZ9',hsh:true},{av:'A7368SalExtUsu',fld:'SALEXTUSU',pic:'@!'},{av:'A7369SalExtRec',fld:'SALEXTREC',pic:'ZZZZZ9'},{av:'A11299SalExtFen',fld:'SALEXTFEN',pic:''},{av:'A10080SalSts',fld:'SALSTS',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("AFTER TRN","{handler:'e141PS2',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV10TrnContext',fld:'vTRNCONTEXT',pic:'',hsh:true}]");
      setEventMetadata("AFTER TRN",",oparms:[]}");
      setEventMetadata("'DOELIMINARLINEA'","{handler:'e111PS305',iparms:[{av:'A6248SalExNln',fld:'SALEXNLN',pic:'ZZZ9'}]");
      setEventMetadata("'DOELIMINARLINEA'",",oparms:[{av:'Dvelop_confirmpanel_eliminarlinea_Confirmationtext',ctrl:'DVELOP_CONFIRMPANEL_ELIMINARLINEA',prop:'ConfirmationText'}]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_ELIMINARLINEA.CLOSE","{handler:'e131PS2',iparms:[{av:'Dvelop_confirmpanel_eliminarlinea_Result',ctrl:'DVELOP_CONFIRMPANEL_ELIMINARLINEA',prop:'Result'},{av:'A2265BarExt',fld:'BAREXT',pic:'9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A2253SalExtAlb',fld:'SALEXTALB',pic:'ZZZZZZZ9'},{av:'A6248SalExNln',fld:'SALEXNLN',pic:'ZZZ9'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A6558FasCodn',fld:'FASCODN',pic:'@!'},{av:'A2256SalExtFec',fld:'SALEXTFEC',pic:''},{av:'A2248ManCod',fld:'MANCOD',pic:'ZZZ9'}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_ELIMINARLINEA.CLOSE",",oparms:[{av:'A6248SalExNln',fld:'SALEXNLN',pic:'ZZZ9'},{av:'A2253SalExtAlb',fld:'SALEXTALB',pic:'ZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A2256SalExtFec',fld:'SALEXTFEC',pic:''},{av:'A6558FasCodn',fld:'FASCODN',pic:'@!'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A2248ManCod',fld:'MANCOD',pic:'ZZZ9'}]}");
      setEventMetadata("VALID_SALEXTALB","{handler:'valid_Salextalb',iparms:[]");
      setEventMetadata("VALID_SALEXTALB",",oparms:[]}");
      setEventMetadata("VALID_SALEXTFEC","{handler:'valid_Salextfec',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'A2256SalExtFec',fld:'SALEXTFEC',pic:''},{av:'A6396SalExtHor',fld:'SALEXTHOR',pic:''}]");
      setEventMetadata("VALID_SALEXTFEC",",oparms:[{av:'A6396SalExtHor',fld:'SALEXTHOR',pic:''}]}");
      setEventMetadata("VALID_MANCOD","{handler:'valid_Mancod',iparms:[{av:'h2248ManCod'},{av:'A2248ManCod',fld:'MANCOD',pic:'ZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A2249ManNom',fld:'MANNOM',pic:''}]");
      setEventMetadata("VALID_MANCOD",",oparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A2248ManCod',fld:'MANCOD',pic:'ZZZ9'},{av:'A2249ManNom',fld:'MANNOM',pic:''},{av:'h2248ManCod'}]}");
      setEventMetadata("VALID_TRNCOD","{handler:'valid_Trncod',iparms:[{av:'h840TrnCod'},{av:'A840TrnCod',fld:'TRNCOD',pic:'ZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A841TrnNom',fld:'TRNNOM',pic:''}]");
      setEventMetadata("VALID_TRNCOD",",oparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A840TrnCod',fld:'TRNCOD',pic:'ZZZ9'},{av:'A841TrnNom',fld:'TRNNOM',pic:''},{av:'h840TrnCod'}]}");
      setEventMetadata("VALID_SALEXTSEC","{handler:'valid_Salextsec',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'A2254SalExtSec',fld:'SALEXTSEC',pic:''},{av:'AV31FlagCont',fld:'vFLAGCONT',pic:'ZZZ9'},{av:'AV24firmad',fld:'vFIRMAD',pic:'ZZZ9'},{av:'A2253SalExtAlb',fld:'SALEXTALB',pic:'ZZZZZZZ9'},{av:'AV30FlagAlb',fld:'vFLAGALB',pic:'ZZZ9'}]");
      setEventMetadata("VALID_SALEXTSEC",",oparms:[{av:'AV31FlagCont',fld:'vFLAGCONT',pic:'ZZZ9'},{av:'AV30FlagAlb',fld:'vFLAGALB',pic:'ZZZ9'}]}");
      setEventMetadata("VALID_SALEXULN","{handler:'valid_Salexuln',iparms:[]");
      setEventMetadata("VALID_SALEXULN",",oparms:[]}");
      setEventMetadata("VALID_SALEXNLN","{handler:'valid_Salexnln',iparms:[]");
      setEventMetadata("VALID_SALEXNLN",",oparms:[]}");
      setEventMetadata("VALID_BARCOD","{handler:'valid_Barcod',iparms:[]");
      setEventMetadata("VALID_BARCOD",",oparms:[]}");
      setEventMetadata("VALID_BARCODREO","{handler:'valid_Barcodreo',iparms:[]");
      setEventMetadata("VALID_BARCODREO",",oparms:[]}");
      setEventMetadata("VALID_BARCODPAR","{handler:'valid_Barcodpar',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A213BarSit',fld:'BARSIT',pic:'Z9'},{av:'A2265BarExt',fld:'BAREXT',pic:'9'},{av:'A212BarSer',fld:'BARSER',pic:''},{av:'A1652BarSerDsc',fld:'BARSERDSC',pic:''},{av:'A135BarColNom',fld:'BARCOLNOM',pic:''},{av:'A136BarColNum',fld:'BARCOLNUM',pic:'ZZZZZ9'},{av:'A1234BarNomCli',fld:'BARNOMCLI',pic:''},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A6256SalExKgE',fld:'SALEXKGE',pic:'ZZZZZ9.99'},{av:'A6258SalExMtE',fld:'SALEXMTE',pic:'ZZZZZ9.99'},{av:'A6257SalExCoE',fld:'SALEXCOE',pic:'ZZZZZ9'}]");
      setEventMetadata("VALID_BARCODPAR",",oparms:[{av:'A2265BarExt',fld:'BAREXT',pic:'9'},{av:'A212BarSer',fld:'BARSER',pic:''},{av:'A1652BarSerDsc',fld:'BARSERDSC',pic:''},{av:'A135BarColNom',fld:'BARCOLNOM',pic:''},{av:'A136BarColNum',fld:'BARCOLNUM',pic:'ZZZZZ9'},{av:'A1234BarNomCli',fld:'BARNOMCLI',pic:''},{av:'A213BarSit',fld:'BARSIT',pic:'Z9'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A6256SalExKgE',fld:'SALEXKGE',pic:'ZZZZZ9.99'},{av:'A6258SalExMtE',fld:'SALEXMTE',pic:'ZZZZZ9.99'},{av:'A6257SalExCoE',fld:'SALEXCOE',pic:'ZZZZZ9'}]}");
      setEventMetadata("VALID_FASCODN","{handler:'valid_Fascodn',iparms:[{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A6558FasCodn',fld:'FASCODN',pic:'@!'},{av:'AV23Msg_err',fld:'vMSG_ERR',pic:''}]");
      setEventMetadata("VALID_FASCODN",",oparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A6558FasCodn',fld:'FASCODN',pic:'@!'},{av:'AV23Msg_err',fld:'vMSG_ERR',pic:''}]}");
      setEventMetadata("VALID_ORDLIN","{handler:'valid_Ordlin',iparms:[{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A654OrdLin',fld:'ORDLIN',pic:'ZZZ9'},{av:'AV19msgerr',fld:'vMSGERR',pic:''}]");
      setEventMetadata("VALID_ORDLIN",",oparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A654OrdLin',fld:'ORDLIN',pic:'ZZZ9'},{av:'AV19msgerr',fld:'vMSGERR',pic:''}]}");
      setEventMetadata("VALID_SALEXCOE","{handler:'valid_Salexcoe',iparms:[{av:'O6257SalExCoE'},{av:'A6257SalExCoE',fld:'SALEXCOE',pic:'ZZZZZ9'},{av:'A6252SalExCoR',fld:'SALEXCOR',pic:'ZZZZZ9'},{av:'A13851PiezasRece',fld:'PIEZASRECE',pic:'ZZZZZ9'},{av:'AV22OldPz',fld:'vOLDPZ',pic:'ZZZZZ9'}]");
      setEventMetadata("VALID_SALEXCOE",",oparms:[{av:'A13851PiezasRece',fld:'PIEZASRECE',pic:'ZZZZZ9'},{av:'AV22OldPz',fld:'vOLDPZ',pic:'ZZZZZ9'}]}");
      setEventMetadata("VALID_SALEXKGE","{handler:'valid_Salexkge',iparms:[{av:'O6256SalExKgE'},{av:'A6256SalExKgE',fld:'SALEXKGE',pic:'ZZZZZ9.99'},{av:'A6251SalExKgR',fld:'SALEXKGR',pic:'ZZZZZ9.99'},{av:'A13850KilosRecep',fld:'KILOSRECEP',pic:'ZZZZZ9.99'},{av:'AV20OldKg',fld:'vOLDKG',pic:'ZZZZZ9.99'}]");
      setEventMetadata("VALID_SALEXKGE",",oparms:[{av:'A13850KilosRecep',fld:'KILOSRECEP',pic:'ZZZZZ9.99'},{av:'AV20OldKg',fld:'vOLDKG',pic:'ZZZZZ9.99'}]}");
      setEventMetadata("VALID_SALEXMTE","{handler:'valid_Salexmte',iparms:[{av:'O6258SalExMtE'},{av:'A6258SalExMtE',fld:'SALEXMTE',pic:'ZZZZZ9.99'},{av:'A6255SalExMtR',fld:'SALEXMTR',pic:'ZZZZZ9.99'},{av:'A13849MetrosRece',fld:'METROSRECE',pic:'ZZZZZ9.99'},{av:'AV21OldMt',fld:'vOLDMT',pic:'ZZZZZ9.99'}]");
      setEventMetadata("VALID_SALEXMTE",",oparms:[{av:'A13849MetrosRece',fld:'METROSRECE',pic:'ZZZZZ9.99'},{av:'AV21OldMt',fld:'vOLDMT',pic:'ZZZZZ9.99'}]}");
      setEventMetadata("VALID_BARSIT","{handler:'valid_Barsit',iparms:[]");
      setEventMetadata("VALID_BARSIT",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Barext',iparms:[]");
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
      pr_default.close(50);
      pr_default.close(40);
      pr_default.close(49);
      pr_default.close(28);
      pr_default.close(47);
      pr_default.close(29);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOGx_mode = "" ;
      wcpOAV7EmprCod = "" ;
      Z396EmprCod = "" ;
      Z6396SalExtHor = "" ;
      Z2256SalExtFec = GXutil.nullDate() ;
      Z2254SalExtSec = "" ;
      Z6397SalExtMat = "" ;
      Z7368SalExtUsu = "" ;
      Z8655SalFecEnt = GXutil.nullDate() ;
      Z11299SalExtFen = GXutil.nullDate() ;
      Z10767SalExtAT = "" ;
      Z10742SalCodeID = "" ;
      Z10080SalSts = "" ;
      Z10079SalFmdD = "" ;
      Z10078SalGrossT = DecimalUtil.ZERO ;
      Z10077SalFmd = "" ;
      Z10076SalFhh = GXutil.resetTime( GXutil.nullDate() );
      Z13244SalExtPre1 = DecimalUtil.ZERO ;
      Dvelop_confirmpanel_eliminarlinea_Result = "" ;
      Z6256SalExKgE = DecimalUtil.ZERO ;
      Z6258SalExMtE = DecimalUtil.ZERO ;
      Z6249SalExObs = "" ;
      Z6255SalExMtR = DecimalUtil.ZERO ;
      Z6251SalExKgR = DecimalUtil.ZERO ;
      Z6558FasCodn = "" ;
      Z130BarCodPar = "" ;
      O6258SalExMtE = DecimalUtil.ZERO ;
      O6256SalExKgE = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A130BarCodPar = "" ;
      Gx_mode = "" ;
      A2256SalExtFec = GXutil.nullDate() ;
      A6558FasCodn = "" ;
      A6256SalExKgE = DecimalUtil.ZERO ;
      A6258SalExMtE = DecimalUtil.ZERO ;
      AV23Msg_err = "" ;
      A13847ManNomID = "" ;
      A13738TrnCNom = "" ;
      h2248ManCod = "" ;
      h840TrnCod = "" ;
      AV7EmprCod = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      GX_FocusControl = "" ;
      AV32imgPrompt = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_tableattributes = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      A6396SalExtHor = "" ;
      A8655SalFecEnt = GXutil.nullDate() ;
      A7368SalExtUsu = "" ;
      A10080SalSts = "" ;
      A13244SalExtPre1 = DecimalUtil.ZERO ;
      A6397SalExtMat = "" ;
      A3554SalExtObs = "" ;
      bttBtntrn_enter_Jsonclick = "" ;
      bttBtneliminarlinea_Jsonclick = "" ;
      bttBtntrn_cancel_Jsonclick = "" ;
      A2254SalExtSec = "" ;
      A10767SalExtAT = "" ;
      A10742SalCodeID = "" ;
      A10079SalFmdD = "" ;
      A10078SalGrossT = DecimalUtil.ZERO ;
      A10077SalFmd = "" ;
      A10076SalFhh = GXutil.resetTime( GXutil.nullDate() );
      sStyleString = "" ;
      ucDvelop_confirmpanel_eliminarlinea = new com.genexus.webpanels.GXUserControl();
      Gridlevel_level1Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode910 = "" ;
      A11299SalExtFen = GXutil.nullDate() ;
      AV17UsurCod = "" ;
      A407EmprNom = "" ;
      A841TrnNom = "" ;
      A2249ManNom = "" ;
      AV35Pgmname = "" ;
      A6251SalExKgR = DecimalUtil.ZERO ;
      A6255SalExMtR = DecimalUtil.ZERO ;
      AV20OldKg = DecimalUtil.ZERO ;
      AV21OldMt = DecimalUtil.ZERO ;
      AV19msgerr = "" ;
      A6249SalExObs = "" ;
      Dvpanel_tableattributes_Objectcall = "" ;
      Dvpanel_tableattributes_Class = "" ;
      Dvpanel_tableattributes_Height = "" ;
      Dvelop_confirmpanel_eliminarlinea_Objectcall = "" ;
      Dvelop_confirmpanel_eliminarlinea_Width = "" ;
      Dvelop_confirmpanel_eliminarlinea_Height = "" ;
      Dvelop_confirmpanel_eliminarlinea_Class = "" ;
      Dvelop_confirmpanel_eliminarlinea_Comment = "" ;
      Dvelop_confirmpanel_eliminarlinea_Bodytype = "" ;
      Dvelop_confirmpanel_eliminarlinea_Bodycontentinternalname = "" ;
      Dvelop_confirmpanel_eliminarlinea_Texttype = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      hsh = "" ;
      sMode305 = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      GXCCtl = "" ;
      A212BarSer = "" ;
      A1652BarSerDsc = "" ;
      A135BarColNom = "" ;
      A1234BarNomCli = "" ;
      A13849MetrosRece = DecimalUtil.ZERO ;
      A13850KilosRecep = DecimalUtil.ZERO ;
      T6258SalExMtE = DecimalUtil.ZERO ;
      T6256SalExKgE = DecimalUtil.ZERO ;
      AV15Station = "" ;
      AV16EmprNom = "" ;
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext7 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV10TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV11WebSession = httpContext.getWebSession();
      AV14TrnContextAtt = new app.wwpbaseobjects.SdtWWPTransactionContext_Attribute(remoteHandle, context);
      AV37Imgprompt_GXI = "" ;
      Z3554SalExtObs = "" ;
      Z407EmprNom = "" ;
      Z2249ManNom = "" ;
      Z841TrnNom = "" ;
      T01PS8_A407EmprNom = new String[] {""} ;
      T01PS8_n407EmprNom = new boolean[] {false} ;
      T01PS11_A13738TrnCNom = new String[] {""} ;
      T01PS11_A396EmprCod = new String[] {""} ;
      T01PS11_A840TrnCod = new short[1] ;
      T01PS11_n840TrnCod = new boolean[] {false} ;
      T01PS12_A13847ManNomID = new String[] {""} ;
      T01PS12_A396EmprCod = new String[] {""} ;
      T01PS12_A2248ManCod = new short[1] ;
      T01PS9_A841TrnNom = new String[] {""} ;
      T01PS9_n841TrnNom = new boolean[] {false} ;
      T01PS10_A2249ManNom = new String[] {""} ;
      T01PS10_n2249ManNom = new boolean[] {false} ;
      T01PS13_A3554SalExtObs = new String[] {""} ;
      T01PS13_A2253SalExtAlb = new int[1] ;
      T01PS13_A6396SalExtHor = new String[] {""} ;
      T01PS13_A407EmprNom = new String[] {""} ;
      T01PS13_n407EmprNom = new boolean[] {false} ;
      T01PS13_A2249ManNom = new String[] {""} ;
      T01PS13_n2249ManNom = new boolean[] {false} ;
      T01PS13_A841TrnNom = new String[] {""} ;
      T01PS13_n841TrnNom = new boolean[] {false} ;
      T01PS13_A2256SalExtFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01PS13_A2257SalExtEst = new byte[1] ;
      T01PS13_A2258SalExtLis = new byte[1] ;
      T01PS13_A2254SalExtSec = new String[] {""} ;
      T01PS13_A6247SalExUln = new short[1] ;
      T01PS13_A6397SalExtMat = new String[] {""} ;
      T01PS13_A7368SalExtUsu = new String[] {""} ;
      T01PS13_A7369SalExtRec = new int[1] ;
      T01PS13_A8655SalFecEnt = new java.util.Date[] {GXutil.nullDate()} ;
      T01PS13_A11299SalExtFen = new java.util.Date[] {GXutil.nullDate()} ;
      T01PS13_A10767SalExtAT = new String[] {""} ;
      T01PS13_A10742SalCodeID = new String[] {""} ;
      T01PS13_A10741SalEnvAT = new byte[1] ;
      T01PS13_A10080SalSts = new String[] {""} ;
      T01PS13_A10079SalFmdD = new String[] {""} ;
      T01PS13_A10078SalGrossT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01PS13_A10077SalFmd = new String[] {""} ;
      T01PS13_A10076SalFhh = new java.util.Date[] {GXutil.nullDate()} ;
      T01PS13_A13244SalExtPre1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01PS13_A396EmprCod = new String[] {""} ;
      T01PS13_A840TrnCod = new short[1] ;
      T01PS13_n840TrnCod = new boolean[] {false} ;
      T01PS13_A2248ManCod = new short[1] ;
      T01PS14_A13847ManNomID = new String[] {""} ;
      T01PS14_A396EmprCod = new String[] {""} ;
      T01PS14_A2248ManCod = new short[1] ;
      T01PS15_A13738TrnCNom = new String[] {""} ;
      T01PS15_A396EmprCod = new String[] {""} ;
      T01PS15_A840TrnCod = new short[1] ;
      T01PS15_n840TrnCod = new boolean[] {false} ;
      T01PS16_A13847ManNomID = new String[] {""} ;
      T01PS16_A396EmprCod = new String[] {""} ;
      T01PS16_A2248ManCod = new short[1] ;
      T01PS17_A13738TrnCNom = new String[] {""} ;
      T01PS17_A396EmprCod = new String[] {""} ;
      T01PS17_A840TrnCod = new short[1] ;
      T01PS17_n840TrnCod = new boolean[] {false} ;
      T01PS18_A13847ManNomID = new String[] {""} ;
      T01PS18_A396EmprCod = new String[] {""} ;
      T01PS18_A2248ManCod = new short[1] ;
      T01PS19_A13738TrnCNom = new String[] {""} ;
      T01PS19_A396EmprCod = new String[] {""} ;
      T01PS19_A840TrnCod = new short[1] ;
      T01PS19_n840TrnCod = new boolean[] {false} ;
      T01PS20_A841TrnNom = new String[] {""} ;
      T01PS20_n841TrnNom = new boolean[] {false} ;
      T01PS21_A2249ManNom = new String[] {""} ;
      T01PS21_n2249ManNom = new boolean[] {false} ;
      T01PS22_A396EmprCod = new String[] {""} ;
      T01PS22_A2253SalExtAlb = new int[1] ;
      T01PS7_A3554SalExtObs = new String[] {""} ;
      T01PS7_A2253SalExtAlb = new int[1] ;
      T01PS7_A6396SalExtHor = new String[] {""} ;
      T01PS7_A2256SalExtFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01PS7_A2257SalExtEst = new byte[1] ;
      T01PS7_A2258SalExtLis = new byte[1] ;
      T01PS7_A2254SalExtSec = new String[] {""} ;
      T01PS7_A6247SalExUln = new short[1] ;
      T01PS7_A6397SalExtMat = new String[] {""} ;
      T01PS7_A7368SalExtUsu = new String[] {""} ;
      T01PS7_A7369SalExtRec = new int[1] ;
      T01PS7_A8655SalFecEnt = new java.util.Date[] {GXutil.nullDate()} ;
      T01PS7_A11299SalExtFen = new java.util.Date[] {GXutil.nullDate()} ;
      T01PS7_A10767SalExtAT = new String[] {""} ;
      T01PS7_A10742SalCodeID = new String[] {""} ;
      T01PS7_A10741SalEnvAT = new byte[1] ;
      T01PS7_A10080SalSts = new String[] {""} ;
      T01PS7_A10079SalFmdD = new String[] {""} ;
      T01PS7_A10078SalGrossT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01PS7_A10077SalFmd = new String[] {""} ;
      T01PS7_A10076SalFhh = new java.util.Date[] {GXutil.nullDate()} ;
      T01PS7_A13244SalExtPre1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01PS7_A396EmprCod = new String[] {""} ;
      T01PS7_A840TrnCod = new short[1] ;
      T01PS7_n840TrnCod = new boolean[] {false} ;
      T01PS7_A2248ManCod = new short[1] ;
      T01PS23_A396EmprCod = new String[] {""} ;
      T01PS23_A2253SalExtAlb = new int[1] ;
      T01PS24_A396EmprCod = new String[] {""} ;
      T01PS24_A2253SalExtAlb = new int[1] ;
      T01PS25_A13847ManNomID = new String[] {""} ;
      T01PS25_A396EmprCod = new String[] {""} ;
      T01PS25_A2248ManCod = new short[1] ;
      T01PS26_A13738TrnCNom = new String[] {""} ;
      T01PS26_A396EmprCod = new String[] {""} ;
      T01PS26_A840TrnCod = new short[1] ;
      T01PS26_n840TrnCod = new boolean[] {false} ;
      T01PS6_A3554SalExtObs = new String[] {""} ;
      T01PS6_A2253SalExtAlb = new int[1] ;
      T01PS6_A6396SalExtHor = new String[] {""} ;
      T01PS6_A2256SalExtFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01PS6_A2257SalExtEst = new byte[1] ;
      T01PS6_A2258SalExtLis = new byte[1] ;
      T01PS6_A2254SalExtSec = new String[] {""} ;
      T01PS6_A6247SalExUln = new short[1] ;
      T01PS6_A6397SalExtMat = new String[] {""} ;
      T01PS6_A7368SalExtUsu = new String[] {""} ;
      T01PS6_A7369SalExtRec = new int[1] ;
      T01PS6_A8655SalFecEnt = new java.util.Date[] {GXutil.nullDate()} ;
      T01PS6_A11299SalExtFen = new java.util.Date[] {GXutil.nullDate()} ;
      T01PS6_A10767SalExtAT = new String[] {""} ;
      T01PS6_A10742SalCodeID = new String[] {""} ;
      T01PS6_A10741SalEnvAT = new byte[1] ;
      T01PS6_A10080SalSts = new String[] {""} ;
      T01PS6_A10079SalFmdD = new String[] {""} ;
      T01PS6_A10078SalGrossT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01PS6_A10077SalFmd = new String[] {""} ;
      T01PS6_A10076SalFhh = new java.util.Date[] {GXutil.nullDate()} ;
      T01PS6_A13244SalExtPre1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01PS6_A396EmprCod = new String[] {""} ;
      T01PS6_A840TrnCod = new short[1] ;
      T01PS6_n840TrnCod = new boolean[] {false} ;
      T01PS6_A2248ManCod = new short[1] ;
      T01PS30_A841TrnNom = new String[] {""} ;
      T01PS30_n841TrnNom = new boolean[] {false} ;
      T01PS31_A2249ManNom = new String[] {""} ;
      T01PS31_n2249ManNom = new boolean[] {false} ;
      T01PS32_A396EmprCod = new String[] {""} ;
      T01PS32_A2253SalExtAlb = new int[1] ;
      T01PS32_A129BarCod = new int[1] ;
      T01PS32_A132BarCodReo = new byte[1] ;
      T01PS32_A130BarCodPar = new String[] {""} ;
      T01PS34_A396EmprCod = new String[] {""} ;
      T01PS34_A2253SalExtAlb = new int[1] ;
      Z212BarSer = "" ;
      Z1652BarSerDsc = "" ;
      Z135BarColNom = "" ;
      Z1234BarNomCli = "" ;
      T01PS35_A2253SalExtAlb = new int[1] ;
      T01PS35_A6248SalExNln = new short[1] ;
      T01PS35_A6256SalExKgE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01PS35_A6258SalExMtE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01PS35_A6257SalExCoE = new int[1] ;
      T01PS35_A2265BarExt = new byte[1] ;
      T01PS35_n2265BarExt = new boolean[] {false} ;
      T01PS35_A212BarSer = new String[] {""} ;
      T01PS35_A1652BarSerDsc = new String[] {""} ;
      T01PS35_A654OrdLin = new short[1] ;
      T01PS35_A6249SalExObs = new String[] {""} ;
      T01PS35_A135BarColNom = new String[] {""} ;
      T01PS35_A136BarColNum = new int[1] ;
      T01PS35_A1234BarNomCli = new String[] {""} ;
      T01PS35_A213BarSit = new byte[1] ;
      T01PS35_A6255SalExMtR = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01PS35_A6251SalExKgR = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01PS35_A6252SalExCoR = new int[1] ;
      T01PS35_A396EmprCod = new String[] {""} ;
      T01PS35_A6558FasCodn = new String[] {""} ;
      T01PS35_A129BarCod = new int[1] ;
      T01PS35_A132BarCodReo = new byte[1] ;
      T01PS35_A130BarCodPar = new String[] {""} ;
      T01PS35_A252CliCod = new int[1] ;
      T01PS35_n252CliCod = new boolean[] {false} ;
      T01PS4_A457FasCod = new String[] {""} ;
      T01PS5_A2265BarExt = new byte[1] ;
      T01PS5_n2265BarExt = new boolean[] {false} ;
      T01PS5_A212BarSer = new String[] {""} ;
      T01PS5_A1652BarSerDsc = new String[] {""} ;
      T01PS5_A135BarColNom = new String[] {""} ;
      T01PS5_A136BarColNum = new int[1] ;
      T01PS5_A1234BarNomCli = new String[] {""} ;
      T01PS5_A213BarSit = new byte[1] ;
      T01PS5_A252CliCod = new int[1] ;
      T01PS5_n252CliCod = new boolean[] {false} ;
      T01PS36_A457FasCod = new String[] {""} ;
      T01PS37_A2265BarExt = new byte[1] ;
      T01PS37_n2265BarExt = new boolean[] {false} ;
      T01PS37_A212BarSer = new String[] {""} ;
      T01PS37_A1652BarSerDsc = new String[] {""} ;
      T01PS37_A135BarColNom = new String[] {""} ;
      T01PS37_A136BarColNum = new int[1] ;
      T01PS37_A1234BarNomCli = new String[] {""} ;
      T01PS37_A213BarSit = new byte[1] ;
      T01PS37_A252CliCod = new int[1] ;
      T01PS37_n252CliCod = new boolean[] {false} ;
      T01PS38_A396EmprCod = new String[] {""} ;
      T01PS38_A2253SalExtAlb = new int[1] ;
      T01PS38_A6248SalExNln = new short[1] ;
      T01PS3_A2253SalExtAlb = new int[1] ;
      T01PS3_A6248SalExNln = new short[1] ;
      T01PS3_A6256SalExKgE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01PS3_A6258SalExMtE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01PS3_A6257SalExCoE = new int[1] ;
      T01PS3_A654OrdLin = new short[1] ;
      T01PS3_A6249SalExObs = new String[] {""} ;
      T01PS3_A6255SalExMtR = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01PS3_A6251SalExKgR = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01PS3_A6252SalExCoR = new int[1] ;
      T01PS3_A396EmprCod = new String[] {""} ;
      T01PS3_A6558FasCodn = new String[] {""} ;
      T01PS3_A129BarCod = new int[1] ;
      T01PS3_A132BarCodReo = new byte[1] ;
      T01PS3_A130BarCodPar = new String[] {""} ;
      T01PS2_A2253SalExtAlb = new int[1] ;
      T01PS2_A6248SalExNln = new short[1] ;
      T01PS2_A6256SalExKgE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01PS2_A6258SalExMtE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01PS2_A6257SalExCoE = new int[1] ;
      T01PS2_A654OrdLin = new short[1] ;
      T01PS2_A6249SalExObs = new String[] {""} ;
      T01PS2_A6255SalExMtR = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01PS2_A6251SalExKgR = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01PS2_A6252SalExCoR = new int[1] ;
      T01PS2_A396EmprCod = new String[] {""} ;
      T01PS2_A6558FasCodn = new String[] {""} ;
      T01PS2_A129BarCod = new int[1] ;
      T01PS2_A132BarCodReo = new byte[1] ;
      T01PS2_A130BarCodPar = new String[] {""} ;
      T01PS42_A2265BarExt = new byte[1] ;
      T01PS42_n2265BarExt = new boolean[] {false} ;
      T01PS42_A212BarSer = new String[] {""} ;
      T01PS42_A1652BarSerDsc = new String[] {""} ;
      T01PS42_A135BarColNom = new String[] {""} ;
      T01PS42_A136BarColNum = new int[1] ;
      T01PS42_A1234BarNomCli = new String[] {""} ;
      T01PS42_A213BarSit = new byte[1] ;
      T01PS42_A252CliCod = new int[1] ;
      T01PS42_n252CliCod = new boolean[] {false} ;
      T01PS43_A396EmprCod = new String[] {""} ;
      T01PS43_A2253SalExtAlb = new int[1] ;
      T01PS43_A6248SalExNln = new short[1] ;
      Gridlevel_level1Row = new com.genexus.webpanels.GXWebRow();
      subGridlevel_level1_Linesclass = "" ;
      ROClassString = "" ;
      sImgUrl = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      i2256SalExtFec = GXutil.nullDate() ;
      i7368SalExtUsu = "" ;
      i10742SalCodeID = "" ;
      i10767SalExtAT = "" ;
      A457FasCod = "" ;
      Gridlevel_level1Column = new com.genexus.webpanels.GXWebColumn();
      gxdynajaxctrlcodr = new com.genexus.internet.StringCollection();
      gxdynajaxctrldescr = new com.genexus.internet.StringCollection();
      gxwrpcisep = "" ;
      l13847ManNomID = "" ;
      T01PS44_A13847ManNomID = new String[] {""} ;
      l13738TrnCNom = "" ;
      T01PS45_A13738TrnCNom = new String[] {""} ;
      T01PS46_A13847ManNomID = new String[] {""} ;
      T01PS46_A396EmprCod = new String[] {""} ;
      T01PS46_A2248ManCod = new short[1] ;
      T01PS47_A13738TrnCNom = new String[] {""} ;
      T01PS47_A396EmprCod = new String[] {""} ;
      T01PS47_A840TrnCod = new short[1] ;
      T01PS47_n840TrnCod = new boolean[] {false} ;
      GXv_int8 = new int[1] ;
      GXv_decimal18 = new java.math.BigDecimal[1] ;
      GXv_decimal17 = new java.math.BigDecimal[1] ;
      GXv_decimal15 = new java.math.BigDecimal[1] ;
      GXv_int21 = new short[1] ;
      GXv_int20 = new short[1] ;
      GXv_date10 = new java.util.Date[1] ;
      GXv_int9 = new short[1] ;
      GXt_char1 = "" ;
      T01PS48_A13847ManNomID = new String[] {""} ;
      T01PS48_A396EmprCod = new String[] {""} ;
      T01PS48_A2248ManCod = new short[1] ;
      T01PS49_A2249ManNom = new String[] {""} ;
      T01PS49_n2249ManNom = new boolean[] {false} ;
      Zh2248ManCod = "" ;
      T01PS50_A13738TrnCNom = new String[] {""} ;
      T01PS50_A396EmprCod = new String[] {""} ;
      T01PS50_A840TrnCod = new short[1] ;
      T01PS50_n840TrnCod = new boolean[] {false} ;
      T01PS51_A841TrnNom = new String[] {""} ;
      T01PS51_n841TrnNom = new boolean[] {false} ;
      Zh840TrnCod = "" ;
      GXv_int6 = new byte[1] ;
      GXt_decimal14 = DecimalUtil.ZERO ;
      GXv_decimal19 = new java.math.BigDecimal[1] ;
      GXv_int12 = new int[1] ;
      T01PS52_A457FasCod = new String[] {""} ;
      GXv_char2 = new String[1] ;
      ZV23Msg_err = "" ;
      GXv_char13 = new String[1] ;
      GXv_int23 = new int[1] ;
      GXv_int11 = new byte[1] ;
      GXv_char4 = new String[1] ;
      GXv_int22 = new short[1] ;
      GXv_char3 = new String[1] ;
      ZV19msgerr = "" ;
      Z13850KilosRecep = DecimalUtil.ZERO ;
      ZV20OldKg = DecimalUtil.ZERO ;
      Z13849MetrosRece = DecimalUtil.ZERO ;
      ZV21OldMt = DecimalUtil.ZERO ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.trabajosexternosenvio__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.trabajosexternosenvio__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.trabajosexternosenvio__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.trabajosexternosenvio__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.trabajosexternosenvio__default(),
         new Object[] {
             new Object[] {
            T01PS2_A2253SalExtAlb, T01PS2_A6248SalExNln, T01PS2_A6256SalExKgE, T01PS2_A6258SalExMtE, T01PS2_A6257SalExCoE, T01PS2_A654OrdLin, T01PS2_A6249SalExObs, T01PS2_A6255SalExMtR, T01PS2_A6251SalExKgR, T01PS2_A6252SalExCoR,
            T01PS2_A396EmprCod, T01PS2_A6558FasCodn, T01PS2_A129BarCod, T01PS2_A132BarCodReo, T01PS2_A130BarCodPar
            }
            , new Object[] {
            T01PS3_A2253SalExtAlb, T01PS3_A6248SalExNln, T01PS3_A6256SalExKgE, T01PS3_A6258SalExMtE, T01PS3_A6257SalExCoE, T01PS3_A654OrdLin, T01PS3_A6249SalExObs, T01PS3_A6255SalExMtR, T01PS3_A6251SalExKgR, T01PS3_A6252SalExCoR,
            T01PS3_A396EmprCod, T01PS3_A6558FasCodn, T01PS3_A129BarCod, T01PS3_A132BarCodReo, T01PS3_A130BarCodPar
            }
            , new Object[] {
            T01PS4_A457FasCod
            }
            , new Object[] {
            T01PS5_A2265BarExt, T01PS5_n2265BarExt, T01PS5_A212BarSer, T01PS5_A1652BarSerDsc, T01PS5_A135BarColNom, T01PS5_A136BarColNum, T01PS5_A1234BarNomCli, T01PS5_A213BarSit, T01PS5_A252CliCod, T01PS5_n252CliCod
            }
            , new Object[] {
            T01PS6_A3554SalExtObs, T01PS6_A2253SalExtAlb, T01PS6_A6396SalExtHor, T01PS6_A2256SalExtFec, T01PS6_A2257SalExtEst, T01PS6_A2258SalExtLis, T01PS6_A2254SalExtSec, T01PS6_A6247SalExUln, T01PS6_A6397SalExtMat, T01PS6_A7368SalExtUsu,
            T01PS6_A7369SalExtRec, T01PS6_A8655SalFecEnt, T01PS6_A11299SalExtFen, T01PS6_A10767SalExtAT, T01PS6_A10742SalCodeID, T01PS6_A10741SalEnvAT, T01PS6_A10080SalSts, T01PS6_A10079SalFmdD, T01PS6_A10078SalGrossT, T01PS6_A10077SalFmd,
            T01PS6_A10076SalFhh, T01PS6_A13244SalExtPre1, T01PS6_A396EmprCod, T01PS6_A840TrnCod, T01PS6_n840TrnCod, T01PS6_A2248ManCod
            }
            , new Object[] {
            T01PS7_A3554SalExtObs, T01PS7_A2253SalExtAlb, T01PS7_A6396SalExtHor, T01PS7_A2256SalExtFec, T01PS7_A2257SalExtEst, T01PS7_A2258SalExtLis, T01PS7_A2254SalExtSec, T01PS7_A6247SalExUln, T01PS7_A6397SalExtMat, T01PS7_A7368SalExtUsu,
            T01PS7_A7369SalExtRec, T01PS7_A8655SalFecEnt, T01PS7_A11299SalExtFen, T01PS7_A10767SalExtAT, T01PS7_A10742SalCodeID, T01PS7_A10741SalEnvAT, T01PS7_A10080SalSts, T01PS7_A10079SalFmdD, T01PS7_A10078SalGrossT, T01PS7_A10077SalFmd,
            T01PS7_A10076SalFhh, T01PS7_A13244SalExtPre1, T01PS7_A396EmprCod, T01PS7_A840TrnCod, T01PS7_n840TrnCod, T01PS7_A2248ManCod
            }
            , new Object[] {
            T01PS8_A407EmprNom, T01PS8_n407EmprNom
            }
            , new Object[] {
            T01PS9_A841TrnNom, T01PS9_n841TrnNom
            }
            , new Object[] {
            T01PS10_A2249ManNom, T01PS10_n2249ManNom
            }
            , new Object[] {
            T01PS11_A13738TrnCNom, T01PS11_A396EmprCod, T01PS11_A840TrnCod
            }
            , new Object[] {
            T01PS12_A13847ManNomID, T01PS12_A396EmprCod, T01PS12_A2248ManCod
            }
            , new Object[] {
            T01PS13_A3554SalExtObs, T01PS13_A2253SalExtAlb, T01PS13_A6396SalExtHor, T01PS13_A407EmprNom, T01PS13_n407EmprNom, T01PS13_A2249ManNom, T01PS13_n2249ManNom, T01PS13_A841TrnNom, T01PS13_n841TrnNom, T01PS13_A2256SalExtFec,
            T01PS13_A2257SalExtEst, T01PS13_A2258SalExtLis, T01PS13_A2254SalExtSec, T01PS13_A6247SalExUln, T01PS13_A6397SalExtMat, T01PS13_A7368SalExtUsu, T01PS13_A7369SalExtRec, T01PS13_A8655SalFecEnt, T01PS13_A11299SalExtFen, T01PS13_A10767SalExtAT,
            T01PS13_A10742SalCodeID, T01PS13_A10741SalEnvAT, T01PS13_A10080SalSts, T01PS13_A10079SalFmdD, T01PS13_A10078SalGrossT, T01PS13_A10077SalFmd, T01PS13_A10076SalFhh, T01PS13_A13244SalExtPre1, T01PS13_A396EmprCod, T01PS13_A840TrnCod,
            T01PS13_n840TrnCod, T01PS13_A2248ManCod
            }
            , new Object[] {
            T01PS14_A13847ManNomID, T01PS14_A396EmprCod, T01PS14_A2248ManCod
            }
            , new Object[] {
            T01PS15_A13738TrnCNom, T01PS15_A396EmprCod, T01PS15_A840TrnCod
            }
            , new Object[] {
            T01PS16_A13847ManNomID, T01PS16_A396EmprCod, T01PS16_A2248ManCod
            }
            , new Object[] {
            T01PS17_A13738TrnCNom, T01PS17_A396EmprCod, T01PS17_A840TrnCod
            }
            , new Object[] {
            T01PS18_A13847ManNomID, T01PS18_A396EmprCod, T01PS18_A2248ManCod
            }
            , new Object[] {
            T01PS19_A13738TrnCNom, T01PS19_A396EmprCod, T01PS19_A840TrnCod
            }
            , new Object[] {
            T01PS20_A841TrnNom, T01PS20_n841TrnNom
            }
            , new Object[] {
            T01PS21_A2249ManNom, T01PS21_n2249ManNom
            }
            , new Object[] {
            T01PS22_A396EmprCod, T01PS22_A2253SalExtAlb
            }
            , new Object[] {
            T01PS23_A396EmprCod, T01PS23_A2253SalExtAlb
            }
            , new Object[] {
            T01PS24_A396EmprCod, T01PS24_A2253SalExtAlb
            }
            , new Object[] {
            T01PS25_A13847ManNomID, T01PS25_A396EmprCod, T01PS25_A2248ManCod
            }
            , new Object[] {
            T01PS26_A13738TrnCNom, T01PS26_A396EmprCod, T01PS26_A840TrnCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01PS30_A841TrnNom, T01PS30_n841TrnNom
            }
            , new Object[] {
            T01PS31_A2249ManNom, T01PS31_n2249ManNom
            }
            , new Object[] {
            T01PS32_A396EmprCod, T01PS32_A2253SalExtAlb, T01PS32_A129BarCod, T01PS32_A132BarCodReo, T01PS32_A130BarCodPar
            }
            , new Object[] {
            }
            , new Object[] {
            T01PS34_A396EmprCod, T01PS34_A2253SalExtAlb
            }
            , new Object[] {
            T01PS35_A2253SalExtAlb, T01PS35_A6248SalExNln, T01PS35_A6256SalExKgE, T01PS35_A6258SalExMtE, T01PS35_A6257SalExCoE, T01PS35_A2265BarExt, T01PS35_n2265BarExt, T01PS35_A212BarSer, T01PS35_A1652BarSerDsc, T01PS35_A654OrdLin,
            T01PS35_A6249SalExObs, T01PS35_A135BarColNom, T01PS35_A136BarColNum, T01PS35_A1234BarNomCli, T01PS35_A213BarSit, T01PS35_A6255SalExMtR, T01PS35_A6251SalExKgR, T01PS35_A6252SalExCoR, T01PS35_A396EmprCod, T01PS35_A6558FasCodn,
            T01PS35_A129BarCod, T01PS35_A132BarCodReo, T01PS35_A130BarCodPar, T01PS35_A252CliCod, T01PS35_n252CliCod
            }
            , new Object[] {
            T01PS36_A457FasCod
            }
            , new Object[] {
            T01PS37_A2265BarExt, T01PS37_n2265BarExt, T01PS37_A212BarSer, T01PS37_A1652BarSerDsc, T01PS37_A135BarColNom, T01PS37_A136BarColNum, T01PS37_A1234BarNomCli, T01PS37_A213BarSit, T01PS37_A252CliCod, T01PS37_n252CliCod
            }
            , new Object[] {
            T01PS38_A396EmprCod, T01PS38_A2253SalExtAlb, T01PS38_A6248SalExNln
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01PS42_A2265BarExt, T01PS42_n2265BarExt, T01PS42_A212BarSer, T01PS42_A1652BarSerDsc, T01PS42_A135BarColNom, T01PS42_A136BarColNum, T01PS42_A1234BarNomCli, T01PS42_A213BarSit, T01PS42_A252CliCod, T01PS42_n252CliCod
            }
            , new Object[] {
            T01PS43_A396EmprCod, T01PS43_A2253SalExtAlb, T01PS43_A6248SalExNln
            }
            , new Object[] {
            T01PS44_A13847ManNomID
            }
            , new Object[] {
            T01PS45_A13738TrnCNom
            }
            , new Object[] {
            T01PS46_A13847ManNomID, T01PS46_A396EmprCod, T01PS46_A2248ManCod
            }
            , new Object[] {
            T01PS47_A13738TrnCNom, T01PS47_A396EmprCod, T01PS47_A840TrnCod
            }
            , new Object[] {
            T01PS48_A13847ManNomID, T01PS48_A396EmprCod, T01PS48_A2248ManCod
            }
            , new Object[] {
            T01PS49_A2249ManNom, T01PS49_n2249ManNom
            }
            , new Object[] {
            T01PS50_A13738TrnCNom, T01PS50_A396EmprCod, T01PS50_A840TrnCod
            }
            , new Object[] {
            T01PS51_A841TrnNom, T01PS51_n841TrnNom
            }
            , new Object[] {
            T01PS52_A457FasCod
            }
         }
      );
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
      AV35Pgmname = "TrabajosExternosEnvio" ;
      Z10767SalExtAT = " " ;
      A10767SalExtAT = " " ;
      i10767SalExtAT = " " ;
      Z10741SalEnvAT = (byte)(0) ;
      A10741SalEnvAT = (byte)(0) ;
      i10741SalEnvAT = (byte)(0) ;
      Z10742SalCodeID = " " ;
      A10742SalCodeID = " " ;
      i10742SalCodeID = " " ;
      Z7368SalExtUsu = "" ;
      A7368SalExtUsu = "" ;
      i7368SalExtUsu = "" ;
      Z2258SalExtLis = (byte)(0) ;
      A2258SalExtLis = (byte)(0) ;
      i2258SalExtLis = (byte)(0) ;
      Z2257SalExtEst = (byte)(0) ;
      A2257SalExtEst = (byte)(0) ;
      i2257SalExtEst = (byte)(0) ;
      Z2256SalExtFec = GXutil.today( ) ;
      i2256SalExtFec = GXutil.today( ) ;
      A2256SalExtFec = GXutil.today( ) ;
   }

   private byte Z2257SalExtEst ;
   private byte Z2258SalExtLis ;
   private byte Z10741SalEnvAT ;
   private byte Z132BarCodReo ;
   private byte GxWebError ;
   private byte A132BarCodReo ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte A2257SalExtEst ;
   private byte A2258SalExtLis ;
   private byte A10741SalEnvAT ;
   private byte A213BarSit ;
   private byte A2265BarExt ;
   private byte Z2265BarExt ;
   private byte Z213BarSit ;
   private byte subGridlevel_level1_Backcolorstyle ;
   private byte subGridlevel_level1_Backstyle ;
   private byte gxajaxcallmode ;
   private byte i2257SalExtEst ;
   private byte i2258SalExtLis ;
   private byte i10741SalEnvAT ;
   private byte subGridlevel_level1_Allowselection ;
   private byte subGridlevel_level1_Allowhovering ;
   private byte subGridlevel_level1_Allowcollapsing ;
   private byte subGridlevel_level1_Collapsed ;
   private byte GXt_int5 ;
   private byte GXv_int6[] ;
   private byte GXv_int11[] ;
   private short nIsMod_910 ;
   private short Z6247SalExUln ;
   private short Z840TrnCod ;
   private short Z2248ManCod ;
   private short O6247SalExUln ;
   private short N2248ManCod ;
   private short N840TrnCod ;
   private short Z6248SalExNln ;
   private short Z654OrdLin ;
   private short nRcdDeleted_910 ;
   private short nRcdExists_910 ;
   private short A654OrdLin ;
   private short A2248ManCod ;
   private short A6248SalExNln ;
   private short A840TrnCod ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A6247SalExUln ;
   private short nBlankRcdCount910 ;
   private short RcdFound910 ;
   private short B6247SalExUln ;
   private short nBlankRcdUsr910 ;
   private short AV12Insert_ManCod ;
   private short AV13Insert_TrnCod ;
   private short AV31FlagCont ;
   private short AV30FlagAlb ;
   private short AV24firmad ;
   private short RcdFound305 ;
   private short s6247SalExUln ;
   private short AV18Biarprint ;
   private short AV25Suprema ;
   private short AV26Moda21 ;
   private short AV27Tinamar ;
   private short AV28Ws ;
   private short AV29Modhh ;
   private short AV33Flag ;
   private short nIsDirty_305 ;
   private short nIsDirty_910 ;
   private short i6247SalExUln ;
   private short gxhchits ;
   private short GXv_int21[] ;
   private short GXv_int20[] ;
   private short GXv_int9[] ;
   private short ZV31FlagCont ;
   private short ZV30FlagAlb ;
   private short GXv_int22[] ;
   private int wcpOAV8SalExtAlb ;
   private int Z2253SalExtAlb ;
   private int Z7369SalExtRec ;
   private int nRC_GXsfl_84 ;
   private int nGXsfl_84_idx=1 ;
   private int Z6257SalExCoE ;
   private int Z6252SalExCoR ;
   private int Z129BarCod ;
   private int O6257SalExCoE ;
   private int A129BarCod ;
   private int A2253SalExtAlb ;
   private int A6257SalExCoE ;
   private int AV8SalExtAlb ;
   private int trnEnded ;
   private int edtSalExtAlb_Enabled ;
   private int edtSalExtFec_Enabled ;
   private int edtSalExtHor_Enabled ;
   private int edtSalFecEnt_Enabled ;
   private int edtSalExtUsu_Enabled ;
   private int edtSalSts_Enabled ;
   private int edtManCod_Enabled ;
   private int edtSalExtPre1_Visible ;
   private int edtSalExtPre1_Enabled ;
   private int edtTrnCod_Enabled ;
   private int edtSalExtMat_Enabled ;
   private int edtSalExtObs_Enabled ;
   private int bttBtntrn_enter_Visible ;
   private int bttBtntrn_enter_Enabled ;
   private int bttBtneliminarlinea_Visible ;
   private int bttBtntrn_cancel_Visible ;
   private int edtSalExtEst_Enabled ;
   private int edtSalExtEst_Visible ;
   private int edtSalExtLis_Enabled ;
   private int edtSalExtLis_Visible ;
   private int edtSalExtSec_Visible ;
   private int edtSalExtSec_Enabled ;
   private int edtSalExUln_Enabled ;
   private int edtSalExUln_Visible ;
   private int edtSalExtAT_Visible ;
   private int edtSalExtAT_Enabled ;
   private int edtSalCodeID_Visible ;
   private int edtSalCodeID_Enabled ;
   private int edtSalEnvAT_Enabled ;
   private int edtSalEnvAT_Visible ;
   private int edtSalFmdD_Visible ;
   private int edtSalFmdD_Enabled ;
   private int edtSalGrossT_Enabled ;
   private int edtSalGrossT_Visible ;
   private int edtSalFmd_Visible ;
   private int edtSalFmd_Enabled ;
   private int edtSalFhh_Visible ;
   private int edtSalFhh_Enabled ;
   private int edtSalExNln_Enabled ;
   private int edtBarCod_Enabled ;
   private int edtBarCodReo_Enabled ;
   private int edtBarCodPar_Enabled ;
   private int edtCliCod_Enabled ;
   private int edtBarSer_Enabled ;
   private int edtBarSerDsc_Enabled ;
   private int edtBarColNom_Enabled ;
   private int edtBarColNum_Enabled ;
   private int edtBarNomCli_Enabled ;
   private int edtFasCodn_Enabled ;
   private int edtavImgprompt_Enabled ;
   private int edtavImgprompt_Visible ;
   private int edtOrdLin_Enabled ;
   private int edtSalExCoE_Enabled ;
   private int edtSalExKgE_Enabled ;
   private int edtSalExMtE_Enabled ;
   private int edtBarSit_Enabled ;
   private int edtMetrosRece_Enabled ;
   private int edtKilosRecep_Enabled ;
   private int edtPiezasRece_Enabled ;
   private int edtBarExt_Enabled ;
   private int fRowAdded ;
   private int A7369SalExtRec ;
   private int A6252SalExCoR ;
   private int AV22OldPz ;
   private int A252CliCod ;
   private int A136BarColNum ;
   private int A13851PiezasRece ;
   private int T6257SalExCoE ;
   private int AV36GXV1 ;
   private int GX_JID ;
   private int Z136BarColNum ;
   private int Z252CliCod ;
   private int subGridlevel_level1_Backcolor ;
   private int subGridlevel_level1_Allbackcolor ;
   private int defedtBarExt_Enabled ;
   private int defedtPiezasRece_Enabled ;
   private int defedtKilosRecep_Enabled ;
   private int defedtMetrosRece_Enabled ;
   private int defedtBarSit_Enabled ;
   private int defedtBarColNum_Enabled ;
   private int defedtSalExNln_Enabled ;
   private int idxLst ;
   private int subGridlevel_level1_Selectedindex ;
   private int subGridlevel_level1_Selectioncolor ;
   private int subGridlevel_level1_Hoveringcolor ;
   private int gxdynajaxindex ;
   private int GXv_int8[] ;
   private int GXt_int16 ;
   private int GXv_int12[] ;
   private int GXv_int23[] ;
   private int Z13851PiezasRece ;
   private int ZV22OldPz ;
   private long GRIDLEVEL_LEVEL1_nFirstRecordOnPage ;
   private java.math.BigDecimal Z10078SalGrossT ;
   private java.math.BigDecimal Z13244SalExtPre1 ;
   private java.math.BigDecimal Z6256SalExKgE ;
   private java.math.BigDecimal Z6258SalExMtE ;
   private java.math.BigDecimal Z6255SalExMtR ;
   private java.math.BigDecimal Z6251SalExKgR ;
   private java.math.BigDecimal O6258SalExMtE ;
   private java.math.BigDecimal O6256SalExKgE ;
   private java.math.BigDecimal A6256SalExKgE ;
   private java.math.BigDecimal A6258SalExMtE ;
   private java.math.BigDecimal A13244SalExtPre1 ;
   private java.math.BigDecimal A10078SalGrossT ;
   private java.math.BigDecimal A6251SalExKgR ;
   private java.math.BigDecimal A6255SalExMtR ;
   private java.math.BigDecimal AV20OldKg ;
   private java.math.BigDecimal AV21OldMt ;
   private java.math.BigDecimal A13849MetrosRece ;
   private java.math.BigDecimal A13850KilosRecep ;
   private java.math.BigDecimal T6258SalExMtE ;
   private java.math.BigDecimal T6256SalExKgE ;
   private java.math.BigDecimal GXv_decimal18[] ;
   private java.math.BigDecimal GXv_decimal17[] ;
   private java.math.BigDecimal GXv_decimal15[] ;
   private java.math.BigDecimal GXt_decimal14 ;
   private java.math.BigDecimal GXv_decimal19[] ;
   private java.math.BigDecimal Z13850KilosRecep ;
   private java.math.BigDecimal ZV20OldKg ;
   private java.math.BigDecimal Z13849MetrosRece ;
   private java.math.BigDecimal ZV21OldMt ;
   private String sPrefix ;
   private String sGXsfl_84_idx="0001" ;
   private String wcpOGx_mode ;
   private String wcpOAV7EmprCod ;
   private String Z396EmprCod ;
   private String Z6396SalExtHor ;
   private String Z2254SalExtSec ;
   private String Z6397SalExtMat ;
   private String Z7368SalExtUsu ;
   private String Z10767SalExtAT ;
   private String Z10742SalCodeID ;
   private String Z10080SalSts ;
   private String Z10079SalFmdD ;
   private String Z10077SalFmd ;
   private String Dvelop_confirmpanel_eliminarlinea_Result ;
   private String Z6249SalExObs ;
   private String Z6558FasCodn ;
   private String Z130BarCodPar ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String Gx_mode ;
   private String A6558FasCodn ;
   private String AV7EmprCod ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtSalExtFec_Internalname ;
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
   private String edtSalExtAlb_Internalname ;
   private String TempTags ;
   private String edtSalExtAlb_Jsonclick ;
   private String divUnnamedtable2_Internalname ;
   private String edtSalExtFec_Jsonclick ;
   private String edtSalExtHor_Internalname ;
   private String A6396SalExtHor ;
   private String edtSalExtHor_Jsonclick ;
   private String edtSalFecEnt_Internalname ;
   private String edtSalFecEnt_Jsonclick ;
   private String edtSalExtUsu_Internalname ;
   private String A7368SalExtUsu ;
   private String edtSalExtUsu_Jsonclick ;
   private String edtSalSts_Internalname ;
   private String A10080SalSts ;
   private String edtSalSts_Jsonclick ;
   private String divUnnamedtable3_Internalname ;
   private String edtManCod_Internalname ;
   private String edtManCod_Jsonclick ;
   private String divSalextpre1_cell_Internalname ;
   private String divSalextpre1_cell_Class ;
   private String edtSalExtPre1_Internalname ;
   private String edtSalExtPre1_Jsonclick ;
   private String divUnnamedtable4_Internalname ;
   private String edtTrnCod_Internalname ;
   private String edtTrnCod_Jsonclick ;
   private String edtSalExtMat_Internalname ;
   private String A6397SalExtMat ;
   private String edtSalExtMat_Jsonclick ;
   private String edtSalExtObs_Internalname ;
   private String divTableleaflevel_level1_Internalname ;
   private String bttBtntrn_enter_Internalname ;
   private String bttBtntrn_enter_Jsonclick ;
   private String bttBtneliminarlinea_Internalname ;
   private String bttBtneliminarlinea_Jsonclick ;
   private String bttBtntrn_cancel_Internalname ;
   private String bttBtntrn_cancel_Jsonclick ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String edtSalExtEst_Internalname ;
   private String edtSalExtEst_Jsonclick ;
   private String edtSalExtLis_Internalname ;
   private String edtSalExtLis_Jsonclick ;
   private String edtSalExtSec_Internalname ;
   private String A2254SalExtSec ;
   private String edtSalExtSec_Jsonclick ;
   private String edtSalExUln_Internalname ;
   private String edtSalExUln_Jsonclick ;
   private String edtSalExtAT_Internalname ;
   private String A10767SalExtAT ;
   private String edtSalExtAT_Jsonclick ;
   private String edtSalCodeID_Internalname ;
   private String A10742SalCodeID ;
   private String edtSalCodeID_Jsonclick ;
   private String edtSalEnvAT_Internalname ;
   private String edtSalEnvAT_Jsonclick ;
   private String edtSalFmdD_Internalname ;
   private String A10079SalFmdD ;
   private String edtSalGrossT_Internalname ;
   private String edtSalGrossT_Jsonclick ;
   private String edtSalFmd_Internalname ;
   private String A10077SalFmd ;
   private String edtSalFhh_Internalname ;
   private String edtSalFhh_Jsonclick ;
   private String sStyleString ;
   private String tblTabledvelop_confirmpanel_eliminarlinea_Internalname ;
   private String Dvelop_confirmpanel_eliminarlinea_Title ;
   private String Dvelop_confirmpanel_eliminarlinea_Confirmationtext ;
   private String Dvelop_confirmpanel_eliminarlinea_Yesbuttoncaption ;
   private String Dvelop_confirmpanel_eliminarlinea_Nobuttoncaption ;
   private String Dvelop_confirmpanel_eliminarlinea_Cancelbuttoncaption ;
   private String Dvelop_confirmpanel_eliminarlinea_Yesbuttonposition ;
   private String Dvelop_confirmpanel_eliminarlinea_Confirmtype ;
   private String Dvelop_confirmpanel_eliminarlinea_Internalname ;
   private String sMode910 ;
   private String edtSalExNln_Internalname ;
   private String edtBarCod_Internalname ;
   private String edtBarCodReo_Internalname ;
   private String edtBarCodPar_Internalname ;
   private String edtCliCod_Internalname ;
   private String edtBarSer_Internalname ;
   private String edtBarSerDsc_Internalname ;
   private String edtBarColNom_Internalname ;
   private String edtBarColNum_Internalname ;
   private String edtBarNomCli_Internalname ;
   private String edtFasCodn_Internalname ;
   private String edtavImgprompt_Internalname ;
   private String edtavImgprompt_Link ;
   private String edtOrdLin_Internalname ;
   private String edtSalExCoE_Internalname ;
   private String edtSalExKgE_Internalname ;
   private String edtSalExMtE_Internalname ;
   private String edtBarSit_Internalname ;
   private String edtMetrosRece_Internalname ;
   private String edtKilosRecep_Internalname ;
   private String edtPiezasRece_Internalname ;
   private String edtBarExt_Internalname ;
   private String subGridlevel_level1_Internalname ;
   private String AV17UsurCod ;
   private String A407EmprNom ;
   private String A841TrnNom ;
   private String A2249ManNom ;
   private String AV35Pgmname ;
   private String A6249SalExObs ;
   private String Dvpanel_tableattributes_Objectcall ;
   private String Dvpanel_tableattributes_Class ;
   private String Dvpanel_tableattributes_Height ;
   private String Dvelop_confirmpanel_eliminarlinea_Objectcall ;
   private String Dvelop_confirmpanel_eliminarlinea_Width ;
   private String Dvelop_confirmpanel_eliminarlinea_Height ;
   private String Dvelop_confirmpanel_eliminarlinea_Class ;
   private String Dvelop_confirmpanel_eliminarlinea_Comment ;
   private String Dvelop_confirmpanel_eliminarlinea_Bodytype ;
   private String Dvelop_confirmpanel_eliminarlinea_Bodycontentinternalname ;
   private String Dvelop_confirmpanel_eliminarlinea_Texttype ;
   private String hsh ;
   private String sMode305 ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String GXCCtl ;
   private String A212BarSer ;
   private String A1652BarSerDsc ;
   private String A135BarColNom ;
   private String A1234BarNomCli ;
   private String AV15Station ;
   private String AV16EmprNom ;
   private String edtavImgprompt_gximage ;
   private String Z407EmprNom ;
   private String Z2249ManNom ;
   private String Z841TrnNom ;
   private String Z212BarSer ;
   private String Z1652BarSerDsc ;
   private String Z135BarColNom ;
   private String Z1234BarNomCli ;
   private String sGXsfl_84_fel_idx="0001" ;
   private String subGridlevel_level1_Class ;
   private String subGridlevel_level1_Linesclass ;
   private String ROClassString ;
   private String edtSalExNln_Jsonclick ;
   private String edtBarCod_Jsonclick ;
   private String edtBarCodReo_Jsonclick ;
   private String edtBarCodPar_Jsonclick ;
   private String edtCliCod_Jsonclick ;
   private String edtBarSer_Jsonclick ;
   private String edtBarSerDsc_Jsonclick ;
   private String edtBarColNom_Jsonclick ;
   private String edtBarColNum_Jsonclick ;
   private String edtBarNomCli_Jsonclick ;
   private String edtFasCodn_Jsonclick ;
   private String sImgUrl ;
   private String edtOrdLin_Jsonclick ;
   private String edtSalExCoE_Jsonclick ;
   private String edtSalExKgE_Jsonclick ;
   private String edtSalExMtE_Jsonclick ;
   private String edtBarSit_Jsonclick ;
   private String edtMetrosRece_Jsonclick ;
   private String edtKilosRecep_Jsonclick ;
   private String edtPiezasRece_Jsonclick ;
   private String edtBarExt_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String i7368SalExtUsu ;
   private String i10742SalCodeID ;
   private String i10767SalExtAT ;
   private String A457FasCod ;
   private String subGridlevel_level1_Header ;
   private String gxwrpcisep ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String GXv_char13[] ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private java.util.Date Z10076SalFhh ;
   private java.util.Date A10076SalFhh ;
   private java.util.Date Z2256SalExtFec ;
   private java.util.Date Z8655SalFecEnt ;
   private java.util.Date Z11299SalExtFen ;
   private java.util.Date A2256SalExtFec ;
   private java.util.Date A8655SalFecEnt ;
   private java.util.Date A11299SalExtFen ;
   private java.util.Date i2256SalExtFec ;
   private java.util.Date GXv_date10[] ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n840TrnCod ;
   private boolean wbErr ;
   private boolean Dvpanel_tableattributes_Autowidth ;
   private boolean Dvpanel_tableattributes_Autoheight ;
   private boolean Dvpanel_tableattributes_Collapsible ;
   private boolean Dvpanel_tableattributes_Collapsed ;
   private boolean Dvpanel_tableattributes_Showcollapseicon ;
   private boolean Dvpanel_tableattributes_Autoscroll ;
   private boolean bGXsfl_84_Refreshing=false ;
   private boolean n407EmprNom ;
   private boolean n841TrnNom ;
   private boolean n2249ManNom ;
   private boolean Dvpanel_tableattributes_Enabled ;
   private boolean Dvpanel_tableattributes_Showheader ;
   private boolean Dvpanel_tableattributes_Visible ;
   private boolean Dvelop_confirmpanel_eliminarlinea_Enabled ;
   private boolean Dvelop_confirmpanel_eliminarlinea_Visible ;
   private boolean returnInSub ;
   private boolean Gx_longc ;
   private boolean n2265BarExt ;
   private boolean n252CliCod ;
   private boolean AV32imgPrompt_IsBlob ;
   private String A3554SalExtObs ;
   private String Z3554SalExtObs ;
   private String AV23Msg_err ;
   private String A13847ManNomID ;
   private String A13738TrnCNom ;
   private String h2248ManCod ;
   private String h840TrnCod ;
   private String AV19msgerr ;
   private String AV37Imgprompt_GXI ;
   private String l13847ManNomID ;
   private String l13738TrnCNom ;
   private String Zh2248ManCod ;
   private String Zh840TrnCod ;
   private String ZV23Msg_err ;
   private String ZV19msgerr ;
   private String AV32imgPrompt ;
   private com.genexus.webpanels.GXWebGrid Gridlevel_level1Container ;
   private com.genexus.webpanels.GXWebRow Gridlevel_level1Row ;
   private com.genexus.webpanels.GXWebColumn Gridlevel_level1Column ;
   private com.genexus.internet.StringCollection gxdynajaxctrlcodr ;
   private com.genexus.internet.StringCollection gxdynajaxctrldescr ;
   private com.genexus.webpanels.WebSession AV11WebSession ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableattributes ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_eliminarlinea ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private IDataStoreProvider pr_default ;
   private String[] T01PS8_A407EmprNom ;
   private boolean[] T01PS8_n407EmprNom ;
   private String[] T01PS11_A13738TrnCNom ;
   private String[] T01PS11_A396EmprCod ;
   private short[] T01PS11_A840TrnCod ;
   private boolean[] T01PS11_n840TrnCod ;
   private String[] T01PS12_A13847ManNomID ;
   private String[] T01PS12_A396EmprCod ;
   private short[] T01PS12_A2248ManCod ;
   private String[] T01PS9_A841TrnNom ;
   private boolean[] T01PS9_n841TrnNom ;
   private String[] T01PS10_A2249ManNom ;
   private boolean[] T01PS10_n2249ManNom ;
   private String[] T01PS13_A3554SalExtObs ;
   private int[] T01PS13_A2253SalExtAlb ;
   private String[] T01PS13_A6396SalExtHor ;
   private String[] T01PS13_A407EmprNom ;
   private boolean[] T01PS13_n407EmprNom ;
   private String[] T01PS13_A2249ManNom ;
   private boolean[] T01PS13_n2249ManNom ;
   private String[] T01PS13_A841TrnNom ;
   private boolean[] T01PS13_n841TrnNom ;
   private java.util.Date[] T01PS13_A2256SalExtFec ;
   private byte[] T01PS13_A2257SalExtEst ;
   private byte[] T01PS13_A2258SalExtLis ;
   private String[] T01PS13_A2254SalExtSec ;
   private short[] T01PS13_A6247SalExUln ;
   private String[] T01PS13_A6397SalExtMat ;
   private String[] T01PS13_A7368SalExtUsu ;
   private int[] T01PS13_A7369SalExtRec ;
   private java.util.Date[] T01PS13_A8655SalFecEnt ;
   private java.util.Date[] T01PS13_A11299SalExtFen ;
   private String[] T01PS13_A10767SalExtAT ;
   private String[] T01PS13_A10742SalCodeID ;
   private byte[] T01PS13_A10741SalEnvAT ;
   private String[] T01PS13_A10080SalSts ;
   private String[] T01PS13_A10079SalFmdD ;
   private java.math.BigDecimal[] T01PS13_A10078SalGrossT ;
   private String[] T01PS13_A10077SalFmd ;
   private java.util.Date[] T01PS13_A10076SalFhh ;
   private java.math.BigDecimal[] T01PS13_A13244SalExtPre1 ;
   private String[] T01PS13_A396EmprCod ;
   private short[] T01PS13_A840TrnCod ;
   private boolean[] T01PS13_n840TrnCod ;
   private short[] T01PS13_A2248ManCod ;
   private String[] T01PS14_A13847ManNomID ;
   private String[] T01PS14_A396EmprCod ;
   private short[] T01PS14_A2248ManCod ;
   private String[] T01PS15_A13738TrnCNom ;
   private String[] T01PS15_A396EmprCod ;
   private short[] T01PS15_A840TrnCod ;
   private boolean[] T01PS15_n840TrnCod ;
   private String[] T01PS16_A13847ManNomID ;
   private String[] T01PS16_A396EmprCod ;
   private short[] T01PS16_A2248ManCod ;
   private String[] T01PS17_A13738TrnCNom ;
   private String[] T01PS17_A396EmprCod ;
   private short[] T01PS17_A840TrnCod ;
   private boolean[] T01PS17_n840TrnCod ;
   private String[] T01PS18_A13847ManNomID ;
   private String[] T01PS18_A396EmprCod ;
   private short[] T01PS18_A2248ManCod ;
   private String[] T01PS19_A13738TrnCNom ;
   private String[] T01PS19_A396EmprCod ;
   private short[] T01PS19_A840TrnCod ;
   private boolean[] T01PS19_n840TrnCod ;
   private String[] T01PS20_A841TrnNom ;
   private boolean[] T01PS20_n841TrnNom ;
   private String[] T01PS21_A2249ManNom ;
   private boolean[] T01PS21_n2249ManNom ;
   private String[] T01PS22_A396EmprCod ;
   private int[] T01PS22_A2253SalExtAlb ;
   private String[] T01PS7_A3554SalExtObs ;
   private int[] T01PS7_A2253SalExtAlb ;
   private String[] T01PS7_A6396SalExtHor ;
   private java.util.Date[] T01PS7_A2256SalExtFec ;
   private byte[] T01PS7_A2257SalExtEst ;
   private byte[] T01PS7_A2258SalExtLis ;
   private String[] T01PS7_A2254SalExtSec ;
   private short[] T01PS7_A6247SalExUln ;
   private String[] T01PS7_A6397SalExtMat ;
   private String[] T01PS7_A7368SalExtUsu ;
   private int[] T01PS7_A7369SalExtRec ;
   private java.util.Date[] T01PS7_A8655SalFecEnt ;
   private java.util.Date[] T01PS7_A11299SalExtFen ;
   private String[] T01PS7_A10767SalExtAT ;
   private String[] T01PS7_A10742SalCodeID ;
   private byte[] T01PS7_A10741SalEnvAT ;
   private String[] T01PS7_A10080SalSts ;
   private String[] T01PS7_A10079SalFmdD ;
   private java.math.BigDecimal[] T01PS7_A10078SalGrossT ;
   private String[] T01PS7_A10077SalFmd ;
   private java.util.Date[] T01PS7_A10076SalFhh ;
   private java.math.BigDecimal[] T01PS7_A13244SalExtPre1 ;
   private String[] T01PS7_A396EmprCod ;
   private short[] T01PS7_A840TrnCod ;
   private boolean[] T01PS7_n840TrnCod ;
   private short[] T01PS7_A2248ManCod ;
   private String[] T01PS23_A396EmprCod ;
   private int[] T01PS23_A2253SalExtAlb ;
   private String[] T01PS24_A396EmprCod ;
   private int[] T01PS24_A2253SalExtAlb ;
   private String[] T01PS25_A13847ManNomID ;
   private String[] T01PS25_A396EmprCod ;
   private short[] T01PS25_A2248ManCod ;
   private String[] T01PS26_A13738TrnCNom ;
   private String[] T01PS26_A396EmprCod ;
   private short[] T01PS26_A840TrnCod ;
   private boolean[] T01PS26_n840TrnCod ;
   private String[] T01PS6_A3554SalExtObs ;
   private int[] T01PS6_A2253SalExtAlb ;
   private String[] T01PS6_A6396SalExtHor ;
   private java.util.Date[] T01PS6_A2256SalExtFec ;
   private byte[] T01PS6_A2257SalExtEst ;
   private byte[] T01PS6_A2258SalExtLis ;
   private String[] T01PS6_A2254SalExtSec ;
   private short[] T01PS6_A6247SalExUln ;
   private String[] T01PS6_A6397SalExtMat ;
   private String[] T01PS6_A7368SalExtUsu ;
   private int[] T01PS6_A7369SalExtRec ;
   private java.util.Date[] T01PS6_A8655SalFecEnt ;
   private java.util.Date[] T01PS6_A11299SalExtFen ;
   private String[] T01PS6_A10767SalExtAT ;
   private String[] T01PS6_A10742SalCodeID ;
   private byte[] T01PS6_A10741SalEnvAT ;
   private String[] T01PS6_A10080SalSts ;
   private String[] T01PS6_A10079SalFmdD ;
   private java.math.BigDecimal[] T01PS6_A10078SalGrossT ;
   private String[] T01PS6_A10077SalFmd ;
   private java.util.Date[] T01PS6_A10076SalFhh ;
   private java.math.BigDecimal[] T01PS6_A13244SalExtPre1 ;
   private String[] T01PS6_A396EmprCod ;
   private short[] T01PS6_A840TrnCod ;
   private boolean[] T01PS6_n840TrnCod ;
   private short[] T01PS6_A2248ManCod ;
   private String[] T01PS30_A841TrnNom ;
   private boolean[] T01PS30_n841TrnNom ;
   private String[] T01PS31_A2249ManNom ;
   private boolean[] T01PS31_n2249ManNom ;
   private String[] T01PS32_A396EmprCod ;
   private int[] T01PS32_A2253SalExtAlb ;
   private int[] T01PS32_A129BarCod ;
   private byte[] T01PS32_A132BarCodReo ;
   private String[] T01PS32_A130BarCodPar ;
   private String[] T01PS34_A396EmprCod ;
   private int[] T01PS34_A2253SalExtAlb ;
   private int[] T01PS35_A2253SalExtAlb ;
   private short[] T01PS35_A6248SalExNln ;
   private java.math.BigDecimal[] T01PS35_A6256SalExKgE ;
   private java.math.BigDecimal[] T01PS35_A6258SalExMtE ;
   private int[] T01PS35_A6257SalExCoE ;
   private byte[] T01PS35_A2265BarExt ;
   private boolean[] T01PS35_n2265BarExt ;
   private String[] T01PS35_A212BarSer ;
   private String[] T01PS35_A1652BarSerDsc ;
   private short[] T01PS35_A654OrdLin ;
   private String[] T01PS35_A6249SalExObs ;
   private String[] T01PS35_A135BarColNom ;
   private int[] T01PS35_A136BarColNum ;
   private String[] T01PS35_A1234BarNomCli ;
   private byte[] T01PS35_A213BarSit ;
   private java.math.BigDecimal[] T01PS35_A6255SalExMtR ;
   private java.math.BigDecimal[] T01PS35_A6251SalExKgR ;
   private int[] T01PS35_A6252SalExCoR ;
   private String[] T01PS35_A396EmprCod ;
   private String[] T01PS35_A6558FasCodn ;
   private int[] T01PS35_A129BarCod ;
   private byte[] T01PS35_A132BarCodReo ;
   private String[] T01PS35_A130BarCodPar ;
   private int[] T01PS35_A252CliCod ;
   private boolean[] T01PS35_n252CliCod ;
   private String[] T01PS4_A457FasCod ;
   private byte[] T01PS5_A2265BarExt ;
   private boolean[] T01PS5_n2265BarExt ;
   private String[] T01PS5_A212BarSer ;
   private String[] T01PS5_A1652BarSerDsc ;
   private String[] T01PS5_A135BarColNom ;
   private int[] T01PS5_A136BarColNum ;
   private String[] T01PS5_A1234BarNomCli ;
   private byte[] T01PS5_A213BarSit ;
   private int[] T01PS5_A252CliCod ;
   private boolean[] T01PS5_n252CliCod ;
   private String[] T01PS36_A457FasCod ;
   private byte[] T01PS37_A2265BarExt ;
   private boolean[] T01PS37_n2265BarExt ;
   private String[] T01PS37_A212BarSer ;
   private String[] T01PS37_A1652BarSerDsc ;
   private String[] T01PS37_A135BarColNom ;
   private int[] T01PS37_A136BarColNum ;
   private String[] T01PS37_A1234BarNomCli ;
   private byte[] T01PS37_A213BarSit ;
   private int[] T01PS37_A252CliCod ;
   private boolean[] T01PS37_n252CliCod ;
   private String[] T01PS38_A396EmprCod ;
   private int[] T01PS38_A2253SalExtAlb ;
   private short[] T01PS38_A6248SalExNln ;
   private int[] T01PS3_A2253SalExtAlb ;
   private short[] T01PS3_A6248SalExNln ;
   private java.math.BigDecimal[] T01PS3_A6256SalExKgE ;
   private java.math.BigDecimal[] T01PS3_A6258SalExMtE ;
   private int[] T01PS3_A6257SalExCoE ;
   private short[] T01PS3_A654OrdLin ;
   private String[] T01PS3_A6249SalExObs ;
   private java.math.BigDecimal[] T01PS3_A6255SalExMtR ;
   private java.math.BigDecimal[] T01PS3_A6251SalExKgR ;
   private int[] T01PS3_A6252SalExCoR ;
   private String[] T01PS3_A396EmprCod ;
   private String[] T01PS3_A6558FasCodn ;
   private int[] T01PS3_A129BarCod ;
   private byte[] T01PS3_A132BarCodReo ;
   private String[] T01PS3_A130BarCodPar ;
   private int[] T01PS2_A2253SalExtAlb ;
   private short[] T01PS2_A6248SalExNln ;
   private java.math.BigDecimal[] T01PS2_A6256SalExKgE ;
   private java.math.BigDecimal[] T01PS2_A6258SalExMtE ;
   private int[] T01PS2_A6257SalExCoE ;
   private short[] T01PS2_A654OrdLin ;
   private String[] T01PS2_A6249SalExObs ;
   private java.math.BigDecimal[] T01PS2_A6255SalExMtR ;
   private java.math.BigDecimal[] T01PS2_A6251SalExKgR ;
   private int[] T01PS2_A6252SalExCoR ;
   private String[] T01PS2_A396EmprCod ;
   private String[] T01PS2_A6558FasCodn ;
   private int[] T01PS2_A129BarCod ;
   private byte[] T01PS2_A132BarCodReo ;
   private String[] T01PS2_A130BarCodPar ;
   private byte[] T01PS42_A2265BarExt ;
   private boolean[] T01PS42_n2265BarExt ;
   private String[] T01PS42_A212BarSer ;
   private String[] T01PS42_A1652BarSerDsc ;
   private String[] T01PS42_A135BarColNom ;
   private int[] T01PS42_A136BarColNum ;
   private String[] T01PS42_A1234BarNomCli ;
   private byte[] T01PS42_A213BarSit ;
   private int[] T01PS42_A252CliCod ;
   private boolean[] T01PS42_n252CliCod ;
   private String[] T01PS43_A396EmprCod ;
   private int[] T01PS43_A2253SalExtAlb ;
   private short[] T01PS43_A6248SalExNln ;
   private String[] T01PS44_A13847ManNomID ;
   private String[] T01PS45_A13738TrnCNom ;
   private String[] T01PS46_A13847ManNomID ;
   private String[] T01PS46_A396EmprCod ;
   private short[] T01PS46_A2248ManCod ;
   private String[] T01PS47_A13738TrnCNom ;
   private String[] T01PS47_A396EmprCod ;
   private short[] T01PS47_A840TrnCod ;
   private boolean[] T01PS47_n840TrnCod ;
   private String[] T01PS48_A13847ManNomID ;
   private String[] T01PS48_A396EmprCod ;
   private short[] T01PS48_A2248ManCod ;
   private String[] T01PS49_A2249ManNom ;
   private boolean[] T01PS49_n2249ManNom ;
   private String[] T01PS50_A13738TrnCNom ;
   private String[] T01PS50_A396EmprCod ;
   private short[] T01PS50_A840TrnCod ;
   private boolean[] T01PS50_n840TrnCod ;
   private String[] T01PS51_A841TrnNom ;
   private boolean[] T01PS51_n841TrnNom ;
   private String[] T01PS52_A457FasCod ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext7[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV10TrnContext ;
   private app.wwpbaseobjects.SdtWWPTransactionContext_Attribute AV14TrnContextAtt ;
}

final  class trabajosexternosenvio__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class trabajosexternosenvio__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class trabajosexternosenvio__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class trabajosexternosenvio__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class trabajosexternosenvio__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01PS2", "SELECT SalExtAlb, SalExNln, SalExKgE, SalExMtE, SalExCoE, OrdLin, SalExObs, SalExMtR, SalExKgR, SalExCoR, EmprCod, FasCodn, BarCod, BarCodReo, BarCodPar FROM TXPEXHDPZ WHERE EmprCod = ? AND SalExtAlb = ? AND SalExNln = ?  FOR UPDATE OF SalExKgE, SalExMtE, SalExCoE, OrdLin, SalExObs, SalExMtR, SalExKgR, SalExCoR, FasCodn, BarCod, BarCodReo, BarCodPar NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PS3", "SELECT SalExtAlb, SalExNln, SalExKgE, SalExMtE, SalExCoE, OrdLin, SalExObs, SalExMtR, SalExKgR, SalExCoR, EmprCod, FasCodn, BarCod, BarCodReo, BarCodPar FROM TXPEXHDPZ WHERE EmprCod = ? AND SalExtAlb = ? AND SalExNln = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PS4", "SELECT FasCod FROM TXPFASPRO WHERE EmprCod = ? AND FasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PS5", "SELECT BarExt, BarSer, BarSerDsc, BarColNom, BarColNum, BarNomCli, BarSit, CliCod FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PS6", "SELECT SalExtObs, SalExtAlb, SalExtHor, SalExtFec, SalExtEst, SalExtLis, SalExtSec, SalExUln, SalExtMat, SalExtUsu, SalExtRec, SalFecEnt, SalExtFen, SalExtAT, SalCodeID, SalEnvAT, SalSts, SalFmdD, SalGrossT, SalFmd, SalFhh, SalExtPre1, EmprCod, TrnCod, ManCod FROM TXPCEXTSA WHERE EmprCod = ? AND SalExtAlb = ?  FOR UPDATE OF SalExtHor, SalExtFec, SalExtEst, SalExtLis, SalExtSec, SalExUln, SalExtMat, SalExtUsu, SalExtRec, SalFecEnt, SalExtFen, SalExtAT, SalCodeID, SalEnvAT, SalSts, SalFmdD, SalGrossT, SalFmd, SalFhh, SalExtObs, SalExtPre1, TrnCod, ManCod NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PS7", "SELECT SalExtObs, SalExtAlb, SalExtHor, SalExtFec, SalExtEst, SalExtLis, SalExtSec, SalExUln, SalExtMat, SalExtUsu, SalExtRec, SalFecEnt, SalExtFen, SalExtAT, SalCodeID, SalEnvAT, SalSts, SalFmdD, SalGrossT, SalFmd, SalFhh, SalExtPre1, EmprCod, TrnCod, ManCod FROM TXPCEXTSA WHERE EmprCod = ? AND SalExtAlb = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PS8", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PS9", "SELECT TrnNom FROM TXPTRANSP WHERE EmprCod = ? AND TrnCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PS10", "SELECT ManNom FROM TXPMANUFA WHERE EmprCod = ? AND ManCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PS11", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(TrnCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( TrnNom, ''))) AS TrnCNom, EmprCod, TrnCod FROM TXPTRANSP WHERE (EmprCod = ?) AND (TrnCod = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PS12", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(ManCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( ManNom, ''))) AS ManNomID, EmprCod, ManCod FROM TXPMANUFA WHERE (EmprCod = ?) AND (ManCod = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PS13", "SELECT /*+ FIRST_ROWS(100) */ TM1.SalExtObs, TM1.SalExtAlb, TM1.SalExtHor, T2.EmprNom, T3.ManNom, T4.TrnNom, TM1.SalExtFec, TM1.SalExtEst, TM1.SalExtLis, TM1.SalExtSec, TM1.SalExUln, TM1.SalExtMat, TM1.SalExtUsu, TM1.SalExtRec, TM1.SalFecEnt, TM1.SalExtFen, TM1.SalExtAT, TM1.SalCodeID, TM1.SalEnvAT, TM1.SalSts, TM1.SalFmdD, TM1.SalGrossT, TM1.SalFmd, TM1.SalFhh, TM1.SalExtPre1, TM1.EmprCod, TM1.TrnCod, TM1.ManCod FROM (((TXPCEXTSA TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) INNER JOIN TXPMANUFA T3 ON T3.EmprCod = TM1.EmprCod AND T3.ManCod = TM1.ManCod) LEFT JOIN TXPTRANSP T4 ON T4.EmprCod = TM1.EmprCod AND T4.TrnCod = TM1.TrnCod) WHERE TM1.EmprCod = ? and TM1.SalExtAlb = ? ORDER BY TM1.EmprCod, TM1.SalExtAlb ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PS14", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(ManCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( ManNom, ''))) AS ManNomID, EmprCod, ManCod FROM TXPMANUFA WHERE (EmprCod = ?) AND (ManCod = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PS15", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(TrnCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( TrnNom, ''))) AS TrnCNom, EmprCod, TrnCod FROM TXPTRANSP WHERE (EmprCod = ?) AND (TrnCod = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PS16", "SELECT /*+ FIRST_ROWS */ RTRIM(LTRIM(SUBSTR(TO_CHAR(ManCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( ManNom, ''))) AS ManNomID, EmprCod, ManCod FROM TXPMANUFA WHERE (RTRIM(LTRIM(SUBSTR(TO_CHAR(ManCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( ManNom, ''))) = ?) AND (EmprCod = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PS17", "SELECT /*+ FIRST_ROWS */ RTRIM(LTRIM(SUBSTR(TO_CHAR(TrnCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( TrnNom, ''))) AS TrnCNom, EmprCod, TrnCod FROM TXPTRANSP WHERE (RTRIM(LTRIM(SUBSTR(TO_CHAR(TrnCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( TrnNom, ''))) = ?) AND (EmprCod = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PS18", "SELECT /*+ FIRST_ROWS */ RTRIM(LTRIM(SUBSTR(TO_CHAR(ManCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( ManNom, ''))) AS ManNomID, EmprCod, ManCod FROM TXPMANUFA WHERE (RTRIM(LTRIM(SUBSTR(TO_CHAR(ManCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( ManNom, ''))) = ?) AND (EmprCod = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PS19", "SELECT /*+ FIRST_ROWS */ RTRIM(LTRIM(SUBSTR(TO_CHAR(TrnCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( TrnNom, ''))) AS TrnCNom, EmprCod, TrnCod FROM TXPTRANSP WHERE (RTRIM(LTRIM(SUBSTR(TO_CHAR(TrnCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( TrnNom, ''))) = ?) AND (EmprCod = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PS20", "SELECT TrnNom FROM TXPTRANSP WHERE EmprCod = ? AND TrnCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PS21", "SELECT ManNom FROM TXPMANUFA WHERE EmprCod = ? AND ManCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PS22", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, SalExtAlb FROM TXPCEXTSA WHERE EmprCod = ? AND SalExtAlb = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PS23", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, SalExtAlb FROM TXPCEXTSA WHERE ( SalExtAlb > ?) and EmprCod = ? ORDER BY EmprCod, SalExtAlb) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01PS24", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, SalExtAlb FROM TXPCEXTSA WHERE ( SalExtAlb < ?) and EmprCod = ? ORDER BY EmprCod DESC, SalExtAlb DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01PS25", "SELECT /*+ FIRST_ROWS */ RTRIM(LTRIM(SUBSTR(TO_CHAR(ManCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( ManNom, ''))) AS ManNomID, EmprCod, ManCod FROM TXPMANUFA WHERE (RTRIM(LTRIM(SUBSTR(TO_CHAR(ManCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( ManNom, ''))) = ?) AND (EmprCod = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PS26", "SELECT /*+ FIRST_ROWS */ RTRIM(LTRIM(SUBSTR(TO_CHAR(TrnCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( TrnNom, ''))) AS TrnCNom, EmprCod, TrnCod FROM TXPTRANSP WHERE (RTRIM(LTRIM(SUBSTR(TO_CHAR(TrnCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( TrnNom, ''))) = ?) AND (EmprCod = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01PS27", "INSERT INTO TXPCEXTSA(SalExtAlb, SalExtHor, SalExtFec, SalExtEst, SalExtLis, SalExtSec, SalExUln, SalExtMat, SalExtUsu, SalExtRec, SalFecEnt, SalExtFen, SalExtAT, SalCodeID, SalEnvAT, SalSts, SalFmdD, SalGrossT, SalFmd, SalFhh, SalExtObs, SalExtPre1, EmprCod, TrnCod, ManCod, ManCod_o, SalExtATCU, SalExtSerA, SalExtTipA, SalFecSal) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, ' ', ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'))", GX_NOMASK, "TXPCEXTSA")
         ,new UpdateCursor("T01PS28", "UPDATE TXPCEXTSA SET SalExtHor=?, SalExtFec=?, SalExtEst=?, SalExtLis=?, SalExtSec=?, SalExUln=?, SalExtMat=?, SalExtUsu=?, SalExtRec=?, SalFecEnt=?, SalExtFen=?, SalExtAT=?, SalCodeID=?, SalEnvAT=?, SalSts=?, SalFmdD=?, SalGrossT=?, SalFmd=?, SalFhh=?, SalExtObs=?, SalExtPre1=?, TrnCod=?, ManCod=?  WHERE EmprCod = ? AND SalExtAlb = ?", GX_NOMASK, "TXPCEXTSA")
         ,new UpdateCursor("T01PS29", "DELETE FROM TXPCEXTSA  WHERE EmprCod = ? AND SalExtAlb = ?", GX_NOMASK, "TXPCEXTSA")
         ,new ForEachCursor("T01PS30", "SELECT TrnNom FROM TXPTRANSP WHERE EmprCod = ? AND TrnCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PS31", "SELECT ManNom FROM TXPMANUFA WHERE EmprCod = ? AND ManCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PS32", "SELECT * FROM (SELECT EmprCod, SalExtAlb, BarCod, BarCodReo, BarCodPar FROM TXPLEXTSA WHERE EmprCod = ? AND SalExtAlb = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01PS33", "UPDATE TXPCEXTSA SET SalExUln=?  WHERE EmprCod = ? AND SalExtAlb = ?", GX_NOMASK, "TXPCEXTSA")
         ,new ForEachCursor("T01PS34", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, SalExtAlb FROM TXPCEXTSA WHERE EmprCod = ? ORDER BY EmprCod, SalExtAlb ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PS35", "SELECT T1.SalExtAlb, T1.SalExNln, T1.SalExKgE, T1.SalExMtE, T1.SalExCoE, T2.BarExt, T2.BarSer, T2.BarSerDsc, T1.OrdLin, T1.SalExObs, T2.BarColNom, T2.BarColNum, T2.BarNomCli, T2.BarSit, T1.SalExMtR, T1.SalExKgR, T1.SalExCoR, T1.EmprCod, T1.FasCodn, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T2.CliCod FROM (TXPEXHDPZ T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.SalExtAlb = ? and T1.SalExNln = ? ORDER BY T1.EmprCod, T1.SalExtAlb, T1.SalExNln ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PS36", "SELECT FasCod FROM TXPFASPRO WHERE EmprCod = ? AND FasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PS37", "SELECT BarExt, BarSer, BarSerDsc, BarColNom, BarColNum, BarNomCli, BarSit, CliCod FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PS38", "SELECT EmprCod, SalExtAlb, SalExNln FROM TXPEXHDPZ WHERE EmprCod = ? AND SalExtAlb = ? AND SalExNln = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01PS39", "INSERT INTO TXPEXHDPZ(SalExtAlb, SalExNln, SalExKgE, SalExMtE, SalExCoE, OrdLin, SalExObs, SalExMtR, SalExKgR, SalExCoR, EmprCod, FasCodn, BarCod, BarCodReo, BarCodPar, SalExFeR, SalExEsB, SalExEnt, ObsM, FasDscMn) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, ' ', ' ', ' ')", GX_NOMASK, "TXPEXHDPZ")
         ,new UpdateCursor("T01PS40", "UPDATE TXPEXHDPZ SET SalExKgE=?, SalExMtE=?, SalExCoE=?, OrdLin=?, SalExObs=?, SalExMtR=?, SalExKgR=?, SalExCoR=?, FasCodn=?, BarCod=?, BarCodReo=?, BarCodPar=?  WHERE EmprCod = ? AND SalExtAlb = ? AND SalExNln = ?", GX_NOMASK, "TXPEXHDPZ")
         ,new UpdateCursor("T01PS41", "DELETE FROM TXPEXHDPZ  WHERE EmprCod = ? AND SalExtAlb = ? AND SalExNln = ?", GX_NOMASK, "TXPEXHDPZ")
         ,new ForEachCursor("T01PS42", "SELECT BarExt, BarSer, BarSerDsc, BarColNom, BarColNum, BarNomCli, BarSit, CliCod FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PS43", "SELECT EmprCod, SalExtAlb, SalExNln FROM TXPEXHDPZ WHERE SalExtAlb = ? and EmprCod = ? ORDER BY EmprCod, SalExtAlb, SalExNln ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PS44", "SELECT * FROM (SELECT DISTINCT RTRIM(LTRIM(SUBSTR(TO_CHAR(ManCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( ManNom, ''))) AS ManNomID FROM TXPMANUFA WHERE (EmprCod = ?) AND (UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(ManCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( ManNom, '')))) like '%' || UPPER(?)) ORDER BY ManNomID) WHERE rownum <= 20 ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PS45", "SELECT * FROM (SELECT DISTINCT RTRIM(LTRIM(SUBSTR(TO_CHAR(TrnCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( TrnNom, ''))) AS TrnCNom FROM TXPTRANSP WHERE (EmprCod = ?) AND (UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(TrnCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( TrnNom, '')))) like '%' || UPPER(?)) ORDER BY TrnCNom) WHERE rownum <= 20 ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PS46", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(ManCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( ManNom, ''))) AS ManNomID, EmprCod, ManCod FROM TXPMANUFA WHERE (RTRIM(LTRIM(SUBSTR(TO_CHAR(ManCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( ManNom, ''))) = ?) AND (EmprCod = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PS47", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(TrnCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( TrnNom, ''))) AS TrnCNom, EmprCod, TrnCod FROM TXPTRANSP WHERE (RTRIM(LTRIM(SUBSTR(TO_CHAR(TrnCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( TrnNom, ''))) = ?) AND (EmprCod = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PS48", "SELECT /*+ FIRST_ROWS */ RTRIM(LTRIM(SUBSTR(TO_CHAR(ManCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( ManNom, ''))) AS ManNomID, EmprCod, ManCod FROM TXPMANUFA WHERE (RTRIM(LTRIM(SUBSTR(TO_CHAR(ManCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( ManNom, ''))) = ?) AND (EmprCod = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PS49", "SELECT ManNom FROM TXPMANUFA WHERE EmprCod = ? AND ManCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PS50", "SELECT /*+ FIRST_ROWS */ RTRIM(LTRIM(SUBSTR(TO_CHAR(TrnCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( TrnNom, ''))) AS TrnCNom, EmprCod, TrnCod FROM TXPTRANSP WHERE (RTRIM(LTRIM(SUBSTR(TO_CHAR(TrnCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( TrnNom, ''))) = ?) AND (EmprCod = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PS51", "SELECT TrnNom FROM TXPTRANSP WHERE EmprCod = ? AND TrnCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PS52", "SELECT FasCod FROM TXPFASPRO WHERE EmprCod = ? AND FasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 40);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,2);
               ((int[]) buf[9])[0] = rslt.getInt(10);
               ((String[]) buf[10])[0] = rslt.getString(11, 3);
               ((String[]) buf[11])[0] = rslt.getString(12, 8);
               ((int[]) buf[12])[0] = rslt.getInt(13);
               ((byte[]) buf[13])[0] = rslt.getByte(14);
               ((String[]) buf[14])[0] = rslt.getString(15, 1);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 40);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,2);
               ((int[]) buf[9])[0] = rslt.getInt(10);
               ((String[]) buf[10])[0] = rslt.getString(11, 3);
               ((String[]) buf[11])[0] = rslt.getString(12, 8);
               ((int[]) buf[12])[0] = rslt.getInt(13);
               ((byte[]) buf[13])[0] = rslt.getByte(14);
               ((String[]) buf[14])[0] = rslt.getString(15, 1);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               return;
            case 3 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 16);
               ((String[]) buf[3])[0] = rslt.getString(3, 26);
               ((String[]) buf[4])[0] = rslt.getString(4, 13);
               ((int[]) buf[5])[0] = rslt.getInt(5);
               ((String[]) buf[6])[0] = rslt.getString(6, 13);
               ((byte[]) buf[7])[0] = rslt.getByte(7);
               ((int[]) buf[8])[0] = rslt.getInt(8);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getLongVarchar(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 20);
               ((String[]) buf[9])[0] = rslt.getString(10, 8);
               ((int[]) buf[10])[0] = rslt.getInt(11);
               ((java.util.Date[]) buf[11])[0] = rslt.getGXDate(12);
               ((java.util.Date[]) buf[12])[0] = rslt.getGXDate(13);
               ((String[]) buf[13])[0] = rslt.getString(14, 1);
               ((String[]) buf[14])[0] = rslt.getString(15, 20);
               ((byte[]) buf[15])[0] = rslt.getByte(16);
               ((String[]) buf[16])[0] = rslt.getString(17, 1);
               ((String[]) buf[17])[0] = rslt.getString(18, 300);
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(19,2);
               ((String[]) buf[19])[0] = rslt.getString(20, 200);
               ((java.util.Date[]) buf[20])[0] = rslt.getGXDateTime(21);
               ((java.math.BigDecimal[]) buf[21])[0] = rslt.getBigDecimal(22,5);
               ((String[]) buf[22])[0] = rslt.getString(23, 3);
               ((short[]) buf[23])[0] = rslt.getShort(24);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((short[]) buf[25])[0] = rslt.getShort(25);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getLongVarchar(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 20);
               ((String[]) buf[9])[0] = rslt.getString(10, 8);
               ((int[]) buf[10])[0] = rslt.getInt(11);
               ((java.util.Date[]) buf[11])[0] = rslt.getGXDate(12);
               ((java.util.Date[]) buf[12])[0] = rslt.getGXDate(13);
               ((String[]) buf[13])[0] = rslt.getString(14, 1);
               ((String[]) buf[14])[0] = rslt.getString(15, 20);
               ((byte[]) buf[15])[0] = rslt.getByte(16);
               ((String[]) buf[16])[0] = rslt.getString(17, 1);
               ((String[]) buf[17])[0] = rslt.getString(18, 300);
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(19,2);
               ((String[]) buf[19])[0] = rslt.getString(20, 200);
               ((java.util.Date[]) buf[20])[0] = rslt.getGXDateTime(21);
               ((java.math.BigDecimal[]) buf[21])[0] = rslt.getBigDecimal(22,5);
               ((String[]) buf[22])[0] = rslt.getString(23, 3);
               ((short[]) buf[23])[0] = rslt.getShort(24);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((short[]) buf[25])[0] = rslt.getShort(25);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getLongVarchar(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 30);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(6, 30);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDate(7);
               ((byte[]) buf[10])[0] = rslt.getByte(8);
               ((byte[]) buf[11])[0] = rslt.getByte(9);
               ((String[]) buf[12])[0] = rslt.getString(10, 1);
               ((short[]) buf[13])[0] = rslt.getShort(11);
               ((String[]) buf[14])[0] = rslt.getString(12, 20);
               ((String[]) buf[15])[0] = rslt.getString(13, 8);
               ((int[]) buf[16])[0] = rslt.getInt(14);
               ((java.util.Date[]) buf[17])[0] = rslt.getGXDate(15);
               ((java.util.Date[]) buf[18])[0] = rslt.getGXDate(16);
               ((String[]) buf[19])[0] = rslt.getString(17, 1);
               ((String[]) buf[20])[0] = rslt.getString(18, 20);
               ((byte[]) buf[21])[0] = rslt.getByte(19);
               ((String[]) buf[22])[0] = rslt.getString(20, 1);
               ((String[]) buf[23])[0] = rslt.getString(21, 300);
               ((java.math.BigDecimal[]) buf[24])[0] = rslt.getBigDecimal(22,2);
               ((String[]) buf[25])[0] = rslt.getString(23, 200);
               ((java.util.Date[]) buf[26])[0] = rslt.getGXDateTime(24);
               ((java.math.BigDecimal[]) buf[27])[0] = rslt.getBigDecimal(25,5);
               ((String[]) buf[28])[0] = rslt.getString(26, 3);
               ((short[]) buf[29])[0] = rslt.getShort(27);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((short[]) buf[31])[0] = rslt.getShort(28);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 28 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 29 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
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
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               return;
            case 32 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 33 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(7, 16);
               ((String[]) buf[8])[0] = rslt.getString(8, 26);
               ((short[]) buf[9])[0] = rslt.getShort(9);
               ((String[]) buf[10])[0] = rslt.getString(10, 40);
               ((String[]) buf[11])[0] = rslt.getString(11, 13);
               ((int[]) buf[12])[0] = rslt.getInt(12);
               ((String[]) buf[13])[0] = rslt.getString(13, 13);
               ((byte[]) buf[14])[0] = rslt.getByte(14);
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(15,2);
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(16,2);
               ((int[]) buf[17])[0] = rslt.getInt(17);
               ((String[]) buf[18])[0] = rslt.getString(18, 3);
               ((String[]) buf[19])[0] = rslt.getString(19, 8);
               ((int[]) buf[20])[0] = rslt.getInt(20);
               ((byte[]) buf[21])[0] = rslt.getByte(21);
               ((String[]) buf[22])[0] = rslt.getString(22, 1);
               ((int[]) buf[23])[0] = rslt.getInt(23);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               return;
            case 34 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               return;
            case 35 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 16);
               ((String[]) buf[3])[0] = rslt.getString(3, 26);
               ((String[]) buf[4])[0] = rslt.getString(4, 13);
               ((int[]) buf[5])[0] = rslt.getInt(5);
               ((String[]) buf[6])[0] = rslt.getString(6, 13);
               ((byte[]) buf[7])[0] = rslt.getByte(7);
               ((int[]) buf[8])[0] = rslt.getInt(8);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               return;
            case 36 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 40 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 16);
               ((String[]) buf[3])[0] = rslt.getString(3, 26);
               ((String[]) buf[4])[0] = rslt.getString(4, 13);
               ((int[]) buf[5])[0] = rslt.getInt(5);
               ((String[]) buf[6])[0] = rslt.getString(6, 13);
               ((byte[]) buf[7])[0] = rslt.getByte(7);
               ((int[]) buf[8])[0] = rslt.getInt(8);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               return;
            case 41 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 42 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               return;
            case 43 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               return;
            case 44 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 45 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 46 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 47 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 48 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 49 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 50 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
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
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(2, ((Number) parms[2]).shortValue());
               }
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(2, ((Number) parms[2]).shortValue());
               }
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(2, ((Number) parms[2]).shortValue());
               }
               return;
            case 14 :
               stmt.setVarchar(1, (String)parms[0], 40);
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 15 :
               stmt.setVarchar(1, (String)parms[0], 60);
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 16 :
               stmt.setVarchar(1, (String)parms[0], 40);
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 17 :
               stmt.setVarchar(1, (String)parms[0], 60);
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(2, ((Number) parms[2]).shortValue());
               }
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 21 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 22 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 23 :
               stmt.setVarchar(1, (String)parms[0], 40);
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 24 :
               stmt.setVarchar(1, (String)parms[0], 60);
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 25 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setString(2, (String)parms[1], 8);
               stmt.setDate(3, (java.util.Date)parms[2]);
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 1);
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               stmt.setString(8, (String)parms[7], 20);
               stmt.setString(9, (String)parms[8], 8);
               stmt.setInt(10, ((Number) parms[9]).intValue());
               stmt.setDate(11, (java.util.Date)parms[10]);
               stmt.setDate(12, (java.util.Date)parms[11]);
               stmt.setString(13, (String)parms[12], 1);
               stmt.setString(14, (String)parms[13], 20);
               stmt.setByte(15, ((Number) parms[14]).byteValue());
               stmt.setString(16, (String)parms[15], 1);
               stmt.setString(17, (String)parms[16], 300);
               stmt.setBigDecimal(18, (java.math.BigDecimal)parms[17], 2);
               stmt.setString(19, (String)parms[18], 200);
               stmt.setDateTime(20, (java.util.Date)parms[19], false);
               stmt.setLongVarchar(21, (String)parms[20], false);
               stmt.setBigDecimal(22, (java.math.BigDecimal)parms[21], 5);
               stmt.setString(23, (String)parms[22], 3);
               if ( ((Boolean) parms[23]).booleanValue() )
               {
                  stmt.setNull( 24 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(24, ((Number) parms[24]).shortValue());
               }
               stmt.setShort(25, ((Number) parms[25]).shortValue());
               return;
            case 26 :
               stmt.setString(1, (String)parms[0], 8);
               stmt.setDate(2, (java.util.Date)parms[1]);
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setString(7, (String)parms[6], 20);
               stmt.setString(8, (String)parms[7], 8);
               stmt.setInt(9, ((Number) parms[8]).intValue());
               stmt.setDate(10, (java.util.Date)parms[9]);
               stmt.setDate(11, (java.util.Date)parms[10]);
               stmt.setString(12, (String)parms[11], 1);
               stmt.setString(13, (String)parms[12], 20);
               stmt.setByte(14, ((Number) parms[13]).byteValue());
               stmt.setString(15, (String)parms[14], 1);
               stmt.setString(16, (String)parms[15], 300);
               stmt.setBigDecimal(17, (java.math.BigDecimal)parms[16], 2);
               stmt.setString(18, (String)parms[17], 200);
               stmt.setDateTime(19, (java.util.Date)parms[18], false);
               stmt.setLongVarchar(20, (String)parms[19], false);
               stmt.setBigDecimal(21, (java.math.BigDecimal)parms[20], 5);
               if ( ((Boolean) parms[21]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(22, ((Number) parms[22]).shortValue());
               }
               stmt.setShort(23, ((Number) parms[23]).shortValue());
               stmt.setString(24, (String)parms[24], 3);
               stmt.setInt(25, ((Number) parms[25]).intValue());
               return;
            case 27 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 28 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(2, ((Number) parms[2]).shortValue());
               }
               return;
            case 29 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 31 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 32 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 33 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 34 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 35 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 36 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 37 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[2], 2);
               stmt.setBigDecimal(4, (java.math.BigDecimal)parms[3], 2);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setString(7, (String)parms[6], 40);
               stmt.setBigDecimal(8, (java.math.BigDecimal)parms[7], 2);
               stmt.setBigDecimal(9, (java.math.BigDecimal)parms[8], 2);
               stmt.setInt(10, ((Number) parms[9]).intValue());
               stmt.setString(11, (String)parms[10], 3);
               stmt.setString(12, (String)parms[11], 8);
               stmt.setInt(13, ((Number) parms[12]).intValue());
               stmt.setByte(14, ((Number) parms[13]).byteValue());
               stmt.setString(15, (String)parms[14], 1);
               return;
            case 38 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 2);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setString(5, (String)parms[4], 40);
               stmt.setBigDecimal(6, (java.math.BigDecimal)parms[5], 2);
               stmt.setBigDecimal(7, (java.math.BigDecimal)parms[6], 2);
               stmt.setInt(8, ((Number) parms[7]).intValue());
               stmt.setString(9, (String)parms[8], 8);
               stmt.setInt(10, ((Number) parms[9]).intValue());
               stmt.setByte(11, ((Number) parms[10]).byteValue());
               stmt.setString(12, (String)parms[11], 1);
               stmt.setString(13, (String)parms[12], 3);
               stmt.setInt(14, ((Number) parms[13]).intValue());
               stmt.setShort(15, ((Number) parms[14]).shortValue());
               return;
            case 39 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 40 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 41 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 42 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setVarchar(2, (String)parms[1], 40);
               return;
            case 43 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setVarchar(2, (String)parms[1], 60);
               return;
            case 44 :
               stmt.setVarchar(1, (String)parms[0], 40);
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 45 :
               stmt.setVarchar(1, (String)parms[0], 60);
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 46 :
               stmt.setVarchar(1, (String)parms[0], 40);
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 47 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 48 :
               stmt.setVarchar(1, (String)parms[0], 60);
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 49 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(2, ((Number) parms[2]).shortValue());
               }
               return;
            case 50 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
      }
   }

}

