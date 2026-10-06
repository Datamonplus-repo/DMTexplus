package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class entradaproducto_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action79") == 0 )
      {
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_79_1SH42( ) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action80") == 0 )
      {
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_80_1SH42( ) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action91") == 0 )
      {
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_91_1SH42( ) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action92") == 0 )
      {
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_92_1SH42( ) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action93") == 0 )
      {
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_93_1SH42( ) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action94") == 0 )
      {
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_94_1SH42( ) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action95") == 0 )
      {
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_95_1SH42( ) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action96") == 0 )
      {
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_96_1SH42( ) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action97") == 0 )
      {
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_97_1SH42( ) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action98") == 0 )
      {
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_98_1SH42( ) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action99") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A719PrdNum = httpContext.GetPar( "PrdNum") ;
         n719PrdNum = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         A6156EntPrvNum = (int)(GXutil.lval( httpContext.GetPar( "EntPrvNum"))) ;
         n6156EntPrvNum = false ;
         A417EntPre = CommonUtil.decimalVal( httpContext.GetPar( "EntPre"), ".") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_99_1SH42( A396EmprCod, A719PrdNum, A6156EntPrvNum, A417EntPre) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action100") == 0 )
      {
         Gx_mode = httpContext.GetPar( "Mode") ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A6156EntPrvNum = (int)(GXutil.lval( httpContext.GetPar( "EntPrvNum"))) ;
         n6156EntPrvNum = false ;
         A415EntFecEnt = localUtil.parseDateParm( httpContext.GetPar( "EntFecEnt")) ;
         A658PedCod = (int)(GXutil.lval( httpContext.GetPar( "PedCod"))) ;
         n658PedCod = false ;
         A418EntUniEnt = CommonUtil.decimalVal( httpContext.GetPar( "EntUniEnt"), ".") ;
         A417EntPre = CommonUtil.decimalVal( httpContext.GetPar( "EntPre"), ".") ;
         AV44PedPri = httpContext.GetPar( "PedPri") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV44PedPri", AV44PedPri);
         A597LinEnt = (short)(GXutil.lval( httpContext.GetPar( "LinEnt"))) ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_100_1SH42( Gx_mode, A396EmprCod, A6156EntPrvNum, A415EntFecEnt, A658PedCod, A418EntUniEnt, A417EntPre, AV44PedPri, A597LinEnt) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action101") == 0 )
      {
         Gx_mode = httpContext.GetPar( "Mode") ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A6156EntPrvNum = (int)(GXutil.lval( httpContext.GetPar( "EntPrvNum"))) ;
         n6156EntPrvNum = false ;
         A719PrdNum = httpContext.GetPar( "PrdNum") ;
         n719PrdNum = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         A718PrdNom = httpContext.GetPar( "PrdNom") ;
         httpContext.ajax_rsp_assign_attri("", false, "A718PrdNom", A718PrdNom);
         A415EntFecEnt = localUtil.parseDateParm( httpContext.GetPar( "EntFecEnt")) ;
         A658PedCod = (int)(GXutil.lval( httpContext.GetPar( "PedCod"))) ;
         n658PedCod = false ;
         A418EntUniEnt = CommonUtil.decimalVal( httpContext.GetPar( "EntUniEnt"), ".") ;
         A417EntPre = CommonUtil.decimalVal( httpContext.GetPar( "EntPre"), ".") ;
         AV44PedPri = httpContext.GetPar( "PedPri") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV44PedPri", AV44PedPri);
         A597LinEnt = (short)(GXutil.lval( httpContext.GetPar( "LinEnt"))) ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_101_1SH42( Gx_mode, A396EmprCod, A6156EntPrvNum, A719PrdNum, A718PrdNom, A415EntFecEnt, A658PedCod, A418EntUniEnt, A417EntPre, AV44PedPri, A597LinEnt) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action102") == 0 )
      {
         Gx_mode = httpContext.GetPar( "Mode") ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A719PrdNum = httpContext.GetPar( "PrdNum") ;
         n719PrdNum = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         A415EntFecEnt = localUtil.parseDateParm( httpContext.GetPar( "EntFecEnt")) ;
         A418EntUniEnt = CommonUtil.decimalVal( httpContext.GetPar( "EntUniEnt"), ".") ;
         A417EntPre = CommonUtil.decimalVal( httpContext.GetPar( "EntPre"), ".") ;
         A597LinEnt = (short)(GXutil.lval( httpContext.GetPar( "LinEnt"))) ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_102_1SH42( Gx_mode, A396EmprCod, A719PrdNum, A415EntFecEnt, A418EntUniEnt, A417EntPre, A597LinEnt) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action103") == 0 )
      {
         Gx_mode = httpContext.GetPar( "Mode") ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A719PrdNum = httpContext.GetPar( "PrdNum") ;
         n719PrdNum = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         A597LinEnt = (short)(GXutil.lval( httpContext.GetPar( "LinEnt"))) ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_103_1SH42( Gx_mode, A396EmprCod, A719PrdNum, A597LinEnt) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action104") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         AV62Pgmname = httpContext.GetPar( "Pgmname") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV62Pgmname", AV62Pgmname);
         AV56UsurCod = httpContext.GetPar( "UsurCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV56UsurCod", AV56UsurCod);
         AV50Station = httpContext.GetPar( "Station") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV50Station", AV50Station);
         AV26Inc_obs = httpContext.GetPar( "Inc_obs") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV26Inc_obs", AV26Inc_obs);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_104_1SH42( A396EmprCod, AV62Pgmname, AV56UsurCod, AV50Station, AV26Inc_obs) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action105") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         AV62Pgmname = httpContext.GetPar( "Pgmname") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV62Pgmname", AV62Pgmname);
         AV56UsurCod = httpContext.GetPar( "UsurCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV56UsurCod", AV56UsurCod);
         AV50Station = httpContext.GetPar( "Station") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV50Station", AV50Station);
         AV26Inc_obs = httpContext.GetPar( "Inc_obs") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV26Inc_obs", AV26Inc_obs);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_105_1SH42( A396EmprCod, AV62Pgmname, AV56UsurCod, AV50Station, AV26Inc_obs) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel3"+"_"+"PRDULTMOVF") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A719PrdNum = httpContext.GetPar( "PrdNum") ;
         n719PrdNum = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx3asaprdultmovf1SH29( A396EmprCod, A719PrdNum) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel4"+"_"+"ULTFECCCS") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A719PrdNum = httpContext.GetPar( "PrdNum") ;
         n719PrdNum = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx4asaultfecccs1SH29( A396EmprCod, A719PrdNum) ;
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
         gxasa111SH29( A396EmprCod) ;
         return  ;
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
         gxasa128571SH29( A396EmprCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel14"+"_"+"") == 0 )
      {
         AV18EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV18EmprCod", AV18EmprCod);
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV18EmprCod, "@!"))));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxasa140351SH29( AV18EmprCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel23"+"_"+"PRDULTMOVF") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A719PrdNum = httpContext.GetPar( "PrdNum") ;
         n719PrdNum = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx23asaprdultmovf1SH42( A396EmprCod, A719PrdNum) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel66"+"_"+"vPRDNOMX") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A6156EntPrvNum = (int)(GXutil.lval( httpContext.GetPar( "EntPrvNum"))) ;
         n6156EntPrvNum = false ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx66asaprdnomx1SH42( A396EmprCod, A6156EntPrvNum) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel77"+"_"+"PEDNUMLIN") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A658PedCod = (int)(GXutil.lval( httpContext.GetPar( "PedCod"))) ;
         n658PedCod = false ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx77asapednumlin1SH42( A396EmprCod, A658PedCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_120") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A795PrvNum = (int)(GXutil.lval( httpContext.GetPar( "PrvNum"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A795PrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A795PrvNum), 6, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_120( A396EmprCod, A795PrvNum) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_121") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A856ValCod = (byte)(GXutil.lval( httpContext.GetPar( "ValCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A856ValCod", GXutil.str( A856ValCod, 1, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_121( A396EmprCod, A856ValCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_122") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A719PrdNum = httpContext.GetPar( "PrdNum") ;
         n719PrdNum = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_122( A396EmprCod, A719PrdNum) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_124") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A658PedCod = (int)(GXutil.lval( httpContext.GetPar( "PedCod"))) ;
         n658PedCod = false ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_124( A396EmprCod, A658PedCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_125") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A658PedCod = (int)(GXutil.lval( httpContext.GetPar( "PedCod"))) ;
         n658PedCod = false ;
         A719PrdNum = httpContext.GetPar( "PrdNum") ;
         n719PrdNum = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_125( A396EmprCod, A658PedCod, A719PrdNum) ;
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Gridlevel_lineas") == 0 )
      {
         gxnrgridlevel_lineas_newrow_invoke( ) ;
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
            AV18EmprCod = httpContext.GetPar( "EmprCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV18EmprCod", AV18EmprCod);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV18EmprCod, "@!"))));
            AV46PrdNum = httpContext.GetPar( "PrdNum") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV46PrdNum", AV46PrdNum);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPRDNUM", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV46PrdNum, ""))));
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Entrada Producto", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
      }
      wbErr = false ;
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public void gxnrgridlevel_lineas_newrow_invoke( )
   {
      nRC_GXsfl_40 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_40"))) ;
      nGXsfl_40_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_40_idx"))) ;
      sGXsfl_40_idx = httpContext.GetPar( "sGXsfl_40_idx") ;
      AV43PedCodPrompt = httpContext.GetPar( "PedCodPrompt") ;
      A795PrvNum = (int)(GXutil.lval( httpContext.GetPar( "PrvNum"))) ;
      Gx_BScreen = (byte)(GXutil.lval( httpContext.GetPar( "Gx_BScreen"))) ;
      A847UltLinEnt = (short)(GXutil.lval( httpContext.GetPar( "UltLinEnt"))) ;
      Gx_mode = httpContext.GetPar( "Mode") ;
      A396EmprCod = httpContext.GetPar( "EmprCod") ;
      A719PrdNum = httpContext.GetPar( "PrdNum") ;
      n719PrdNum = false ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxnrgridlevel_lineas_newrow( ) ;
      /* End function gxnrGridlevel_lineas_newrow_invoke */
   }

   public entradaproducto_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public entradaproducto_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( entradaproducto_impl.class ));
   }

   public entradaproducto_impl( int remoteHandle ,
                                ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbEntPedCum = new HTMLChoice();
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdNum_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPrdNum_Internalname, httpContext.getMessage( "Producto", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdNum_Internalname, GXutil.rtrim( A719PrdNum), GXutil.rtrim( localUtil.format( A719PrdNum, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdNum_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPrdNum_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_EntradaProducto.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdNom_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPrdNom_Internalname, httpContext.getMessage( "Descripcion", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdNom_Internalname, GXutil.rtrim( A718PrdNom), GXutil.rtrim( localUtil.format( A718PrdNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdNom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPrdNom_Enabled, 0, "text", "", 26, "chr", 1, "row", 26, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_EntradaProducto.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdExiAlm_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPrdExiAlm_Internalname, httpContext.getMessage( "Existencias Almacen", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdExiAlm_Internalname, GXutil.ltrim( localUtil.ntoc( A704PrdExiAlm, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrdExiAlm_Enabled!=0) ? localUtil.format( A704PrdExiAlm, "ZZZZZZ9.9999") : localUtil.format( A704PrdExiAlm, "ZZZZZZ9.9999"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdExiAlm_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPrdExiAlm_Enabled, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_EntradaProducto.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdUltMovF_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPrdUltMovF_Internalname, httpContext.getMessage( "Ult.  Mov. Fecha", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      httpContext.writeText( "<div id=\""+edtPrdUltMovF_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdUltMovF_Internalname, localUtil.format(A14040PrdUltMovF, "99/99/99"), localUtil.format( A14040PrdUltMovF, "99/99/99"), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdUltMovF_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPrdUltMovF_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_EntradaProducto.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtPrdUltMovF_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtPrdUltMovF_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_EntradaProducto.htm");
      httpContext.writeTextNL( "</div>") ;
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
      app.GxWebStd.gx_div_start( httpContext, divTableleaflevel_lineas_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 SectionGrid EditableGridCell_LinedAtts", "left", "top", "", "", "div");
      gxdraw_gridlevel_lineas( ) ;
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 60,'',false,'',0)\"" ;
      ClassString = "ButtonMaterial" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtntrn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtntrn_enter_Visible, bttBtntrn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_EntradaProducto.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 62,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtntrn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtntrn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_EntradaProducto.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 64,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtntrn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtntrn_delete_Visible, bttBtntrn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_EntradaProducto.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV62Pgmname), GXutil.rtrim( localUtil.format( AV62Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_EntradaProducto.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "Right", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
   }

   public void gxdraw_gridlevel_lineas( )
   {
      /*  Grid Control  */
      startgridcontrol40( ) ;
      nGXsfl_40_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount42 = (short)(1) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_42 = (short)(1) ;
            scanStart1SH42( ) ;
            while ( RcdFound42 != 0 )
            {
               init_level_properties42( ) ;
               getByPrimaryKey1SH42( ) ;
               addRow1SH42( ) ;
               scanNext1SH42( ) ;
            }
            scanEnd1SH42( ) ;
            nBlankRcdCount42 = (short)(1) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         B724PrdPreAct = A724PrdPreAct ;
         httpContext.ajax_rsp_assign_attri("", false, "A724PrdPreAct", GXutil.ltrimstr( A724PrdPreAct, 14, 5));
         B704PrdExiAlm = A704PrdExiAlm ;
         httpContext.ajax_rsp_assign_attri("", false, "A704PrdExiAlm", GXutil.ltrimstr( A704PrdExiAlm, 12, 4));
         B750PrdValStk = A750PrdValStk ;
         httpContext.ajax_rsp_assign_attri("", false, "A750PrdValStk", GXutil.ltrimstr( A750PrdValStk, 11, 2));
         B847UltLinEnt = A847UltLinEnt ;
         httpContext.ajax_rsp_assign_attri("", false, "A847UltLinEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A847UltLinEnt), 4, 0));
         standaloneNotModal1SH42( ) ;
         standaloneModal1SH42( ) ;
         sMode42 = Gx_mode ;
         while ( nGXsfl_40_idx < nRC_GXsfl_40 )
         {
            bGXsfl_40_Refreshing = true ;
            readRow1SH42( ) ;
            edtLinEnt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "LINENT_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtLinEnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLinEnt_Enabled), 5, 0), !bGXsfl_40_Refreshing);
            edtEntFecEnt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ENTFECENT_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtEntFecEnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEntFecEnt_Enabled), 5, 0), !bGXsfl_40_Refreshing);
            edtAlbaran_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBARAN_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbaran_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbaran_Enabled), 5, 0), !bGXsfl_40_Refreshing);
            edtAlbaran_Visible = (int)(localUtil.ctol( httpContext.cgiGet( "ALBARAN_"+sGXsfl_40_idx+"Visible"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbaran_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbaran_Visible), 5, 0), !bGXsfl_40_Refreshing);
            edtEntNAlbar_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ENTNALBAR_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtEntNAlbar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEntNAlbar_Enabled), 5, 0), !bGXsfl_40_Refreshing);
            edtEntNAlbar_Visible = (int)(localUtil.ctol( httpContext.cgiGet( "ENTNALBAR_"+sGXsfl_40_idx+"Visible"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtEntNAlbar_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEntNAlbar_Visible), 5, 0), !bGXsfl_40_Refreshing);
            edtPedCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PEDCOD_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPedCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPedCod_Enabled), 5, 0), !bGXsfl_40_Refreshing);
            edtavPedcodprompt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vPEDCODPROMPT_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavPedcodprompt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPedcodprompt_Enabled), 5, 0), !bGXsfl_40_Refreshing);
            edtavPedcodprompt_Link = httpContext.cgiGet( "vPEDCODPROMPT_"+sGXsfl_40_idx+"Link") ;
            httpContext.ajax_rsp_assign_prop("", false, edtavPedcodprompt_Internalname, "Link", edtavPedcodprompt_Link, !bGXsfl_40_Refreshing);
            edtavPedcodprompt_Visible = (int)(localUtil.ctol( httpContext.cgiGet( "vPEDCODPROMPT_"+sGXsfl_40_idx+"Visible"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavPedcodprompt_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPedcodprompt_Visible), 5, 0), !bGXsfl_40_Refreshing);
            edtEntNEmb_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ENTNEMB_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtEntNEmb_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEntNEmb_Enabled), 5, 0), !bGXsfl_40_Refreshing);
            edtEntNEmb_Visible = (int)(localUtil.ctol( httpContext.cgiGet( "ENTNEMB_"+sGXsfl_40_idx+"Visible"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtEntNEmb_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEntNEmb_Visible), 5, 0), !bGXsfl_40_Refreshing);
            edtEntPrvNum_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ENTPRVNUM_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtEntPrvNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEntPrvNum_Enabled), 5, 0), !bGXsfl_40_Refreshing);
            edtEntUniEnt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ENTUNIENT_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtEntUniEnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEntUniEnt_Enabled), 5, 0), !bGXsfl_40_Refreshing);
            edtEntCump_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ENTCUMP_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtEntCump_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEntCump_Enabled), 5, 0), !bGXsfl_40_Refreshing);
            cmbEntPedCum.setEnabled( (int)(localUtil.ctol( httpContext.cgiGet( "ENTPEDCUM_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) );
            httpContext.ajax_rsp_assign_prop("", false, cmbEntPedCum.getInternalname(), "Enabled", GXutil.ltrimstr( cmbEntPedCum.getEnabled(), 5, 0), !bGXsfl_40_Refreshing);
            edtEntPre_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ENTPRE_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtEntPre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEntPre_Enabled), 5, 0), !bGXsfl_40_Refreshing);
            edtEntUniRem_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ENTUNIREM_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtEntUniRem_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEntUniRem_Enabled), 5, 0), !bGXsfl_40_Refreshing);
            edtEntLotN_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ENTLOTN_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtEntLotN_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEntLotN_Enabled), 5, 0), !bGXsfl_40_Refreshing);
            edtEntFVal_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ENTFVAL_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtEntFVal_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEntFVal_Enabled), 5, 0), !bGXsfl_40_Refreshing);
            imgprompt_6156_Link = httpContext.cgiGet( "PROMPT_6156_"+sGXsfl_40_idx+"Link") ;
            if ( ( nRcdExists_42 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal1SH42( ) ;
            }
            sendRow1SH42( ) ;
            bGXsfl_40_Refreshing = false ;
         }
         Gx_mode = sMode42 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A724PrdPreAct = B724PrdPreAct ;
         httpContext.ajax_rsp_assign_attri("", false, "A724PrdPreAct", GXutil.ltrimstr( A724PrdPreAct, 14, 5));
         A704PrdExiAlm = B704PrdExiAlm ;
         httpContext.ajax_rsp_assign_attri("", false, "A704PrdExiAlm", GXutil.ltrimstr( A704PrdExiAlm, 12, 4));
         A750PrdValStk = B750PrdValStk ;
         httpContext.ajax_rsp_assign_attri("", false, "A750PrdValStk", GXutil.ltrimstr( A750PrdValStk, 11, 2));
         A847UltLinEnt = B847UltLinEnt ;
         httpContext.ajax_rsp_assign_attri("", false, "A847UltLinEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A847UltLinEnt), 4, 0));
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount42 = (short)(1) ;
         nRcdExists_42 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart1SH42( ) ;
            while ( RcdFound42 != 0 )
            {
               sGXsfl_40_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_40_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_4042( ) ;
               init_level_properties42( ) ;
               standaloneNotModal1SH42( ) ;
               getByPrimaryKey1SH42( ) ;
               standaloneModal1SH42( ) ;
               addRow1SH42( ) ;
               scanNext1SH42( ) ;
            }
            scanEnd1SH42( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      if ( ! isDsp( ) && ! isDlt( ) )
      {
         sMode42 = Gx_mode ;
         Gx_mode = "INS" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         sGXsfl_40_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_40_idx+1), 4, 0), (short)(4), "0") ;
         subsflControlProps_4042( ) ;
         initAll1SH42( ) ;
         init_level_properties42( ) ;
         B724PrdPreAct = A724PrdPreAct ;
         httpContext.ajax_rsp_assign_attri("", false, "A724PrdPreAct", GXutil.ltrimstr( A724PrdPreAct, 14, 5));
         B704PrdExiAlm = A704PrdExiAlm ;
         httpContext.ajax_rsp_assign_attri("", false, "A704PrdExiAlm", GXutil.ltrimstr( A704PrdExiAlm, 12, 4));
         B750PrdValStk = A750PrdValStk ;
         httpContext.ajax_rsp_assign_attri("", false, "A750PrdValStk", GXutil.ltrimstr( A750PrdValStk, 11, 2));
         B847UltLinEnt = A847UltLinEnt ;
         httpContext.ajax_rsp_assign_attri("", false, "A847UltLinEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A847UltLinEnt), 4, 0));
         nRcdExists_42 = (short)(0) ;
         nIsMod_42 = (short)(0) ;
         nRcdDeleted_42 = (short)(0) ;
         nBlankRcdCount42 = (short)(nBlankRcdUsr42+nBlankRcdCount42) ;
         fRowAdded = 0 ;
         while ( nBlankRcdCount42 > 0 )
         {
            standaloneNotModal1SH42( ) ;
            standaloneModal1SH42( ) ;
            addRow1SH42( ) ;
            if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
            {
               fRowAdded = 1 ;
               GX_FocusControl = edtLinEnt_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            nBlankRcdCount42 = (short)(nBlankRcdCount42-1) ;
         }
         Gx_mode = sMode42 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A724PrdPreAct = B724PrdPreAct ;
         httpContext.ajax_rsp_assign_attri("", false, "A724PrdPreAct", GXutil.ltrimstr( A724PrdPreAct, 14, 5));
         A704PrdExiAlm = B704PrdExiAlm ;
         httpContext.ajax_rsp_assign_attri("", false, "A704PrdExiAlm", GXutil.ltrimstr( A704PrdExiAlm, 12, 4));
         A750PrdValStk = B750PrdValStk ;
         httpContext.ajax_rsp_assign_attri("", false, "A750PrdValStk", GXutil.ltrimstr( A750PrdValStk, 11, 2));
         A847UltLinEnt = B847UltLinEnt ;
         httpContext.ajax_rsp_assign_attri("", false, "A847UltLinEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A847UltLinEnt), 4, 0));
      }
      sStyleString = "" ;
      httpContext.writeText( "<div id=\""+"Gridlevel_lineasContainer"+"Div\" "+sStyleString+">"+"</div>") ;
      httpContext.ajax_rsp_assign_grid("_"+"Gridlevel_lineas", Gridlevel_lineasContainer, subGridlevel_lineas_Internalname);
      if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Gridlevel_lineasContainerData", Gridlevel_lineasContainer.ToJavascriptSource());
      }
      if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Gridlevel_lineasContainerData"+"V", Gridlevel_lineasContainer.GridValuesHidden());
      }
      else
      {
         httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"Gridlevel_lineasContainerData"+"V"+"\" value='"+Gridlevel_lineasContainer.GridValuesHidden()+"'/>") ;
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
      e111SH2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z719PrdNum = httpContext.cgiGet( "Z719PrdNum") ;
            Z726PrdPreMed = localUtil.ctond( httpContext.cgiGet( "Z726PrdPreMed")) ;
            Z725PrdPreAnt = localUtil.ctond( httpContext.cgiGet( "Z725PrdPreAnt")) ;
            Z718PrdNom = httpContext.cgiGet( "Z718PrdNom") ;
            Z724PrdPreAct = localUtil.ctond( httpContext.cgiGet( "Z724PrdPreAct")) ;
            Z704PrdExiAlm = localUtil.ctond( httpContext.cgiGet( "Z704PrdExiAlm")) ;
            Z847UltLinEnt = (short)(localUtil.ctol( httpContext.cgiGet( "Z847UltLinEnt"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z698PrdDetPar = httpContext.cgiGet( "Z698PrdDetPar") ;
            Z713PrdFulEnt = localUtil.ctod( httpContext.cgiGet( "Z713PrdFulEnt"), 0) ;
            Z684PrdCanPen = localUtil.ctond( httpContext.cgiGet( "Z684PrdCanPen")) ;
            Z729PrdRotRea = localUtil.ctond( httpContext.cgiGet( "Z729PrdRotRea")) ;
            Z727PrdRec = httpContext.cgiGet( "Z727PrdRec") ;
            Z709PrdFecPre = localUtil.ctod( httpContext.cgiGet( "Z709PrdFecPre"), 0) ;
            Z5255PrdPreAc2 = localUtil.ctond( httpContext.cgiGet( "Z5255PrdPreAc2")) ;
            Z750PrdValStk = localUtil.ctond( httpContext.cgiGet( "Z750PrdValStk")) ;
            Z705PrdExiCC = localUtil.ctond( httpContext.cgiGet( "Z705PrdExiCC")) ;
            Z795PrvNum = (int)(localUtil.ctol( httpContext.cgiGet( "Z795PrvNum"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z856ValCod = (byte)(localUtil.ctol( httpContext.cgiGet( "Z856ValCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A726PrdPreMed = localUtil.ctond( httpContext.cgiGet( "Z726PrdPreMed")) ;
            A725PrdPreAnt = localUtil.ctond( httpContext.cgiGet( "Z725PrdPreAnt")) ;
            A724PrdPreAct = localUtil.ctond( httpContext.cgiGet( "Z724PrdPreAct")) ;
            A847UltLinEnt = (short)(localUtil.ctol( httpContext.cgiGet( "Z847UltLinEnt"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A698PrdDetPar = httpContext.cgiGet( "Z698PrdDetPar") ;
            A713PrdFulEnt = localUtil.ctod( httpContext.cgiGet( "Z713PrdFulEnt"), 0) ;
            A684PrdCanPen = localUtil.ctond( httpContext.cgiGet( "Z684PrdCanPen")) ;
            A729PrdRotRea = localUtil.ctond( httpContext.cgiGet( "Z729PrdRotRea")) ;
            A727PrdRec = httpContext.cgiGet( "Z727PrdRec") ;
            A709PrdFecPre = localUtil.ctod( httpContext.cgiGet( "Z709PrdFecPre"), 0) ;
            A5255PrdPreAc2 = localUtil.ctond( httpContext.cgiGet( "Z5255PrdPreAc2")) ;
            A750PrdValStk = localUtil.ctond( httpContext.cgiGet( "Z750PrdValStk")) ;
            A705PrdExiCC = localUtil.ctond( httpContext.cgiGet( "Z705PrdExiCC")) ;
            A795PrvNum = (int)(localUtil.ctol( httpContext.cgiGet( "Z795PrvNum"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A856ValCod = (byte)(localUtil.ctol( httpContext.cgiGet( "Z856ValCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            O724PrdPreAct = localUtil.ctond( httpContext.cgiGet( "O724PrdPreAct")) ;
            O704PrdExiAlm = localUtil.ctond( httpContext.cgiGet( "O704PrdExiAlm")) ;
            O750PrdValStk = localUtil.ctond( httpContext.cgiGet( "O750PrdValStk")) ;
            O847UltLinEnt = (short)(localUtil.ctol( httpContext.cgiGet( "O847UltLinEnt"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_40 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_40"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            N795PrvNum = (int)(localUtil.ctol( httpContext.cgiGet( "N795PrvNum"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            N856ValCod = (byte)(localUtil.ctol( httpContext.cgiGet( "N856ValCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A396EmprCod = httpContext.cgiGet( "EMPRCOD") ;
            A3835UltFecCCs = localUtil.ctod( httpContext.cgiGet( "ULTFECCCS"), 0) ;
            AV18EmprCod = httpContext.cgiGet( "vEMPRCOD") ;
            AV46PrdNum = httpContext.cgiGet( "vPRDNUM") ;
            AV27Insert_PrvNum = (int)(localUtil.ctol( httpContext.cgiGet( "vINSERT_PRVNUM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A795PrvNum = (int)(localUtil.ctol( httpContext.cgiGet( "PRVNUM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV28Insert_ValCod = (byte)(localUtil.ctol( httpContext.cgiGet( "vINSERT_VALCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A856ValCod = (byte)(localUtil.ctol( httpContext.cgiGet( "VALCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A800PrvPri = (byte)(localUtil.ctol( httpContext.cgiGet( "PRVPRI"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n800PrvPri = false ;
            AV44PedPri = httpContext.cgiGet( "vPEDPRI") ;
            AV40OldExiAlm = localUtil.ctond( httpContext.cgiGet( "vOLDEXIALM")) ;
            A750PrdValStk = localUtil.ctond( httpContext.cgiGet( "PRDVALSTK")) ;
            AV14Consumos = (short)(localUtil.ctol( httpContext.cgiGet( "vCONSUMOS"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A705PrdExiCC = localUtil.ctond( httpContext.cgiGet( "PRDEXICC")) ;
            A726PrdPreMed = localUtil.ctond( httpContext.cgiGet( "PRDPREMED")) ;
            A724PrdPreAct = localUtil.ctond( httpContext.cgiGet( "PRDPREACT")) ;
            AV36NoUpd = (short)(localUtil.ctol( httpContext.cgiGet( "vNOUPD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A725PrdPreAnt = localUtil.ctond( httpContext.cgiGet( "PRDPREANT")) ;
            A847UltLinEnt = (short)(localUtil.ctol( httpContext.cgiGet( "ULTLINENT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A698PrdDetPar = httpContext.cgiGet( "PRDDETPAR") ;
            A713PrdFulEnt = localUtil.ctod( httpContext.cgiGet( "PRDFULENT"), 0) ;
            A684PrdCanPen = localUtil.ctond( httpContext.cgiGet( "PRDCANPEN")) ;
            A729PrdRotRea = localUtil.ctond( httpContext.cgiGet( "PRDROTREA")) ;
            A727PrdRec = httpContext.cgiGet( "PRDREC") ;
            A709PrdFecPre = localUtil.ctod( httpContext.cgiGet( "PRDFECPRE"), 0) ;
            A5255PrdPreAc2 = localUtil.ctond( httpContext.cgiGet( "PRDPREAC2")) ;
            A407EmprNom = httpContext.cgiGet( "EMPRNOM") ;
            n407EmprNom = false ;
            A3915EmpNumDec = (byte)(localUtil.ctol( httpContext.cgiGet( "EMPNUMDEC"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n3915EmpNumDec = false ;
            A794PrvNom = httpContext.cgiGet( "PRVNOM") ;
            n794PrvNom = false ;
            A913StockRem = localUtil.ctond( httpContext.cgiGet( "STOCKREM")) ;
            n913StockRem = false ;
            Gx_date = localUtil.ctod( httpContext.cgiGet( "vTODAY"), 0) ;
            Gx_BScreen = (byte)(localUtil.ctol( httpContext.cgiGet( "vGXBSCREEN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A657PedCanEnt = localUtil.ctond( httpContext.cgiGet( "PEDCANENT")) ;
            A669PedUni = localUtil.ctond( httpContext.cgiGet( "PEDUNI")) ;
            A12716EntFabId = (int)(localUtil.ctol( httpContext.cgiGet( "ENTFABID"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A10184EntRemTpo = httpContext.cgiGet( "ENTREMTPO") ;
            A411EntCon = (byte)(localUtil.ctol( httpContext.cgiGet( "ENTCON"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV59Year = (short)(localUtil.ctol( httpContext.cgiGet( "vYEAR"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV30Mes = (byte)(localUtil.ctol( httpContext.cgiGet( "vMES"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A666PedPri = httpContext.cgiGet( "PEDPRI") ;
            AV38OldEntPre = localUtil.ctond( httpContext.cgiGet( "vOLDENTPRE")) ;
            AV39OldEntUni = localUtil.ctond( httpContext.cgiGet( "vOLDENTUNI")) ;
            AV42OldRemanente = localUtil.ctond( httpContext.cgiGet( "vOLDREMANENTE")) ;
            AV37oldEntFecent = localUtil.ctod( httpContext.cgiGet( "vOLDENTFECENT"), 0) ;
            AV41oldlote = httpContext.cgiGet( "vOLDLOTE") ;
            AV55UniOld = localUtil.ctond( httpContext.cgiGet( "vUNIOLD")) ;
            AV22FecAnt = localUtil.ctod( httpContext.cgiGet( "vFECANT"), 0) ;
            AV48PrecAnt = localUtil.ctond( httpContext.cgiGet( "vPRECANT")) ;
            AV12AnyAnt = (short)(localUtil.ctol( httpContext.cgiGet( "vANYANT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV31MesAnt = (byte)(localUtil.ctol( httpContext.cgiGet( "vMESANT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A663PedFulEnt = localUtil.ctod( httpContext.cgiGet( "PEDFULENT"), 0) ;
            A665PedPre = localUtil.ctond( httpContext.cgiGet( "PEDPRE")) ;
            A660PedDto = localUtil.ctond( httpContext.cgiGet( "PEDDTO")) ;
            AV45PrdNomX = httpContext.cgiGet( "vPRDNOMX") ;
            AV34msg_ctrl_fecha = httpContext.cgiGet( "vMSG_CTRL_FECHA") ;
            AV23Fecha = localUtil.ctod( httpContext.cgiGet( "vFECHA"), 0) ;
            AV26Inc_obs = httpContext.cgiGet( "vINC_OBS") ;
            AV17DiasFin = (short)(localUtil.ctol( httpContext.cgiGet( "vDIASFIN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A664PedNumLin = (short)(localUtil.ctol( httpContext.cgiGet( "PEDNUMLIN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV35Nalbaran20 = (short)(localUtil.ctol( httpContext.cgiGet( "vNALBARAN20"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV56UsurCod = httpContext.cgiGet( "vUSURCOD") ;
            AV50Station = httpContext.cgiGet( "vSTATION") ;
            AV60FlagPre = (short)(localUtil.ctol( httpContext.cgiGet( "vFLAGPRE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV25FlagFecCcs = (short)(localUtil.ctol( httpContext.cgiGet( "vFLAGFECCCS"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A416EntNumCon = (short)(localUtil.ctol( httpContext.cgiGet( "ENTNUMCON"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A414EntEti = (byte)(localUtil.ctol( httpContext.cgiGet( "ENTETI"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A413EntConIni = (int)(localUtil.ctol( httpContext.cgiGet( "ENTCONINI"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A412EntConFin = (int)(localUtil.ctol( httpContext.cgiGet( "ENTCONFIN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A5691EntBnc = httpContext.cgiGet( "ENTBNC") ;
            A7695EntCC = httpContext.cgiGet( "ENTCC") ;
            A7696EntCCoCod = (short)(localUtil.ctol( httpContext.cgiGet( "ENTCCOCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A10782EntUniAlb = localUtil.ctond( httpContext.cgiGet( "ENTUNIALB")) ;
            A10783EntObs = httpContext.cgiGet( "ENTOBS") ;
            A10187EntRemNro = httpContext.cgiGet( "ENTREMNRO") ;
            A10186EntRemFch = localUtil.ctod( httpContext.cgiGet( "ENTREMFCH"), 0) ;
            A10185EntRemSuc = httpContext.cgiGet( "ENTREMSUC") ;
            A13235EntLoteID = localUtil.ctol( httpContext.cgiGet( "ENTLOTEID"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
            A13456EntUbicaci = httpContext.cgiGet( "ENTUBICACI") ;
            A5690EntHfCon = GXutil.resetDate(localUtil.ctot( httpContext.cgiGet( "ENTHFCON"), 0)) ;
            A5689EntFfCon = localUtil.ctod( httpContext.cgiGet( "ENTFFCON"), 0) ;
            A5688EntHiCon = GXutil.resetDate(localUtil.ctot( httpContext.cgiGet( "ENTHICON"), 0)) ;
            A5687EntFiCon = localUtil.ctod( httpContext.cgiGet( "ENTFICON"), 0) ;
            A661PedFec = localUtil.ctod( httpContext.cgiGet( "PEDFEC"), 0) ;
            A667PedSit = httpContext.cgiGet( "PEDSIT") ;
            A12580PedAlmc = (byte)(localUtil.ctol( httpContext.cgiGet( "PEDALMC"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A659PedCum = httpContext.cgiGet( "PEDCUM") ;
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
            n719PrdNum = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
            A718PrdNom = httpContext.cgiGet( edtPrdNom_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A718PrdNom", A718PrdNom);
            A704PrdExiAlm = localUtil.ctond( httpContext.cgiGet( edtPrdExiAlm_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A704PrdExiAlm", GXutil.ltrimstr( A704PrdExiAlm, 12, 4));
            A14040PrdUltMovF = localUtil.ctod( httpContext.cgiGet( edtPrdUltMovF_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14040PrdUltMovF", localUtil.format(A14040PrdUltMovF, "99/99/99"));
            AV62Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV62Pgmname", AV62Pgmname);
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = new com.genexus.util.GXProperties() ;
            forbiddenHiddens.add("hshsalt", "hsh"+"EntradaProducto");
            forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
            AV62Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV62Pgmname", AV62Pgmname);
            forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV62Pgmname, "")));
            forbiddenHiddens.add("PrdDetPar", GXutil.rtrim( localUtil.format( A698PrdDetPar, "")));
            forbiddenHiddens.add("PrdRotRea", localUtil.format( A729PrdRotRea, "ZZZZZ9.999"));
            forbiddenHiddens.add("PrdRec", GXutil.rtrim( localUtil.format( A727PrdRec, "")));
            forbiddenHiddens.add("PrdPreAc2", localUtil.format( A5255PrdPreAc2, "ZZZZZZZ9.999"));
            forbiddenHiddens.add("PrdExiCC", localUtil.format( A705PrdExiCC, "ZZZZZZ9.9999"));
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ( ! ( ( GXutil.strcmp(A719PrdNum, Z719PrdNum) != 0 ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
            {
               GXutil.writeLogError("entradaproducto:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
               GxWebError = (byte)(1) ;
               httpContext.sendError( 403 );
               GXutil.writeLog("send_http_error_code 403");
               AnyError = (short)(1) ;
               return  ;
            }
            /* Check if conditions changed and reset current page numbers */
            if ( localUtil.ctol( httpContext.cgiGet( "GXH_T(658,23)"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) != A658PedCod )
            {
               GRIDLEVEL_LINEAS_nFirstRecordOnPage = 0 ;
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
               A719PrdNum = httpContext.GetPar( "PrdNum") ;
               n719PrdNum = false ;
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
                  sMode29 = Gx_mode ;
                  Gx_mode = "UPD" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  Gx_mode = sMode29 ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               }
               standaloneModal( ) ;
               if ( ! isIns( ) )
               {
                  getByPrimaryKey( ) ;
                  if ( RcdFound29 == 1 )
                  {
                     if ( isDlt( ) )
                     {
                        /* Confirm record */
                        confirm_1SH0( ) ;
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
                        e111SH2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: After Trn */
                        e121SH2 ();
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
         e121SH2 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( isIns( )  )
         {
            /* Clear variables for new insertion. */
            initAll1SH29( ) ;
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
         disableAttributes1SH29( ) ;
      }
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
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

   public void confirm_1SH0( )
   {
      beforeValidate1SH29( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1SH29( ) ;
         }
         else
         {
            checkExtendedTable1SH29( ) ;
            closeExtendedTableCursors1SH29( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode29 = Gx_mode ;
         confirm_1SH42( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode29 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode29 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
   }

   public void confirm_1SH42( )
   {
      s724PrdPreAct = O724PrdPreAct ;
      httpContext.ajax_rsp_assign_attri("", false, "A724PrdPreAct", GXutil.ltrimstr( A724PrdPreAct, 14, 5));
      s704PrdExiAlm = O704PrdExiAlm ;
      httpContext.ajax_rsp_assign_attri("", false, "A704PrdExiAlm", GXutil.ltrimstr( A704PrdExiAlm, 12, 4));
      s750PrdValStk = O750PrdValStk ;
      httpContext.ajax_rsp_assign_attri("", false, "A750PrdValStk", GXutil.ltrimstr( A750PrdValStk, 11, 2));
      s847UltLinEnt = O847UltLinEnt ;
      httpContext.ajax_rsp_assign_attri("", false, "A847UltLinEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A847UltLinEnt), 4, 0));
      sV44PedPri = OV44PedPri ;
      httpContext.ajax_rsp_assign_attri("", false, "AV44PedPri", AV44PedPri);
      s713PrdFulEnt = O713PrdFulEnt ;
      httpContext.ajax_rsp_assign_attri("", false, "A713PrdFulEnt", localUtil.format(A713PrdFulEnt, "99/99/99"));
      s709PrdFecPre = O709PrdFecPre ;
      httpContext.ajax_rsp_assign_attri("", false, "A709PrdFecPre", localUtil.format(A709PrdFecPre, "99/99/99"));
      s684PrdCanPen = O684PrdCanPen ;
      httpContext.ajax_rsp_assign_attri("", false, "A684PrdCanPen", GXutil.ltrimstr( A684PrdCanPen, 12, 4));
      s14040PrdUltMovF = O14040PrdUltMovF ;
      httpContext.ajax_rsp_assign_attri("", false, "A14040PrdUltMovF", localUtil.format(A14040PrdUltMovF, "99/99/99"));
      sV40OldExiAlm = OV40OldExiAlm ;
      httpContext.ajax_rsp_assign_attri("", false, "AV40OldExiAlm", GXutil.ltrimstr( AV40OldExiAlm, 12, 4));
      s726PrdPreMed = O726PrdPreMed ;
      httpContext.ajax_rsp_assign_attri("", false, "A726PrdPreMed", GXutil.ltrimstr( A726PrdPreMed, 14, 5));
      s725PrdPreAnt = O725PrdPreAnt ;
      httpContext.ajax_rsp_assign_attri("", false, "A725PrdPreAnt", GXutil.ltrimstr( A725PrdPreAnt, 14, 5));
      nGXsfl_40_idx = 0 ;
      while ( nGXsfl_40_idx < nRC_GXsfl_40 )
      {
         readRow1SH42( ) ;
         if ( ( nRcdExists_42 != 0 ) || ( nIsMod_42 != 0 ) )
         {
            getKey1SH42( ) ;
            if ( ( nRcdExists_42 == 0 ) && ( nRcdDeleted_42 == 0 ) )
            {
               if ( RcdFound42 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate1SH42( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1SH42( ) ;
                     closeExtendedTableCursors1SH42( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                     O724PrdPreAct = A724PrdPreAct ;
                     httpContext.ajax_rsp_assign_attri("", false, "A724PrdPreAct", GXutil.ltrimstr( A724PrdPreAct, 14, 5));
                     O704PrdExiAlm = A704PrdExiAlm ;
                     httpContext.ajax_rsp_assign_attri("", false, "A704PrdExiAlm", GXutil.ltrimstr( A704PrdExiAlm, 12, 4));
                     O750PrdValStk = A750PrdValStk ;
                     httpContext.ajax_rsp_assign_attri("", false, "A750PrdValStk", GXutil.ltrimstr( A750PrdValStk, 11, 2));
                     O847UltLinEnt = A847UltLinEnt ;
                     httpContext.ajax_rsp_assign_attri("", false, "A847UltLinEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A847UltLinEnt), 4, 0));
                     OV44PedPri = AV44PedPri ;
                     httpContext.ajax_rsp_assign_attri("", false, "AV44PedPri", AV44PedPri);
                     O713PrdFulEnt = A713PrdFulEnt ;
                     httpContext.ajax_rsp_assign_attri("", false, "A713PrdFulEnt", localUtil.format(A713PrdFulEnt, "99/99/99"));
                     O709PrdFecPre = A709PrdFecPre ;
                     httpContext.ajax_rsp_assign_attri("", false, "A709PrdFecPre", localUtil.format(A709PrdFecPre, "99/99/99"));
                     O684PrdCanPen = A684PrdCanPen ;
                     httpContext.ajax_rsp_assign_attri("", false, "A684PrdCanPen", GXutil.ltrimstr( A684PrdCanPen, 12, 4));
                     O14040PrdUltMovF = A14040PrdUltMovF ;
                     httpContext.ajax_rsp_assign_attri("", false, "A14040PrdUltMovF", localUtil.format(A14040PrdUltMovF, "99/99/99"));
                     OV40OldExiAlm = AV40OldExiAlm ;
                     httpContext.ajax_rsp_assign_attri("", false, "AV40OldExiAlm", GXutil.ltrimstr( AV40OldExiAlm, 12, 4));
                     O726PrdPreMed = A726PrdPreMed ;
                     httpContext.ajax_rsp_assign_attri("", false, "A726PrdPreMed", GXutil.ltrimstr( A726PrdPreMed, 14, 5));
                     O725PrdPreAnt = A725PrdPreAnt ;
                     httpContext.ajax_rsp_assign_attri("", false, "A725PrdPreAnt", GXutil.ltrimstr( A725PrdPreAnt, 14, 5));
                  }
               }
               else
               {
                  GXCCtl = "LINENT_" + sGXsfl_40_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtLinEnt_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound42 != 0 )
               {
                  if ( nRcdDeleted_42 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey1SH42( ) ;
                     load1SH42( ) ;
                     beforeValidate1SH42( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1SH42( ) ;
                        O724PrdPreAct = A724PrdPreAct ;
                        httpContext.ajax_rsp_assign_attri("", false, "A724PrdPreAct", GXutil.ltrimstr( A724PrdPreAct, 14, 5));
                        O704PrdExiAlm = A704PrdExiAlm ;
                        httpContext.ajax_rsp_assign_attri("", false, "A704PrdExiAlm", GXutil.ltrimstr( A704PrdExiAlm, 12, 4));
                        O750PrdValStk = A750PrdValStk ;
                        httpContext.ajax_rsp_assign_attri("", false, "A750PrdValStk", GXutil.ltrimstr( A750PrdValStk, 11, 2));
                        O847UltLinEnt = A847UltLinEnt ;
                        httpContext.ajax_rsp_assign_attri("", false, "A847UltLinEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A847UltLinEnt), 4, 0));
                        OV44PedPri = AV44PedPri ;
                        httpContext.ajax_rsp_assign_attri("", false, "AV44PedPri", AV44PedPri);
                        O713PrdFulEnt = A713PrdFulEnt ;
                        httpContext.ajax_rsp_assign_attri("", false, "A713PrdFulEnt", localUtil.format(A713PrdFulEnt, "99/99/99"));
                        O709PrdFecPre = A709PrdFecPre ;
                        httpContext.ajax_rsp_assign_attri("", false, "A709PrdFecPre", localUtil.format(A709PrdFecPre, "99/99/99"));
                        O684PrdCanPen = A684PrdCanPen ;
                        httpContext.ajax_rsp_assign_attri("", false, "A684PrdCanPen", GXutil.ltrimstr( A684PrdCanPen, 12, 4));
                        O14040PrdUltMovF = A14040PrdUltMovF ;
                        httpContext.ajax_rsp_assign_attri("", false, "A14040PrdUltMovF", localUtil.format(A14040PrdUltMovF, "99/99/99"));
                        OV40OldExiAlm = AV40OldExiAlm ;
                        httpContext.ajax_rsp_assign_attri("", false, "AV40OldExiAlm", GXutil.ltrimstr( AV40OldExiAlm, 12, 4));
                        O726PrdPreMed = A726PrdPreMed ;
                        httpContext.ajax_rsp_assign_attri("", false, "A726PrdPreMed", GXutil.ltrimstr( A726PrdPreMed, 14, 5));
                        O725PrdPreAnt = A725PrdPreAnt ;
                        httpContext.ajax_rsp_assign_attri("", false, "A725PrdPreAnt", GXutil.ltrimstr( A725PrdPreAnt, 14, 5));
                     }
                  }
                  else
                  {
                     if ( nIsMod_42 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate1SH42( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1SH42( ) ;
                           closeExtendedTableCursors1SH42( ) ;
                           if ( AnyError == 0 )
                           {
                              IsConfirmed = (short)(1) ;
                              httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                           }
                           O724PrdPreAct = A724PrdPreAct ;
                           httpContext.ajax_rsp_assign_attri("", false, "A724PrdPreAct", GXutil.ltrimstr( A724PrdPreAct, 14, 5));
                           O704PrdExiAlm = A704PrdExiAlm ;
                           httpContext.ajax_rsp_assign_attri("", false, "A704PrdExiAlm", GXutil.ltrimstr( A704PrdExiAlm, 12, 4));
                           O750PrdValStk = A750PrdValStk ;
                           httpContext.ajax_rsp_assign_attri("", false, "A750PrdValStk", GXutil.ltrimstr( A750PrdValStk, 11, 2));
                           O847UltLinEnt = A847UltLinEnt ;
                           httpContext.ajax_rsp_assign_attri("", false, "A847UltLinEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A847UltLinEnt), 4, 0));
                           OV44PedPri = AV44PedPri ;
                           httpContext.ajax_rsp_assign_attri("", false, "AV44PedPri", AV44PedPri);
                           O713PrdFulEnt = A713PrdFulEnt ;
                           httpContext.ajax_rsp_assign_attri("", false, "A713PrdFulEnt", localUtil.format(A713PrdFulEnt, "99/99/99"));
                           O709PrdFecPre = A709PrdFecPre ;
                           httpContext.ajax_rsp_assign_attri("", false, "A709PrdFecPre", localUtil.format(A709PrdFecPre, "99/99/99"));
                           O684PrdCanPen = A684PrdCanPen ;
                           httpContext.ajax_rsp_assign_attri("", false, "A684PrdCanPen", GXutil.ltrimstr( A684PrdCanPen, 12, 4));
                           O14040PrdUltMovF = A14040PrdUltMovF ;
                           httpContext.ajax_rsp_assign_attri("", false, "A14040PrdUltMovF", localUtil.format(A14040PrdUltMovF, "99/99/99"));
                           OV40OldExiAlm = AV40OldExiAlm ;
                           httpContext.ajax_rsp_assign_attri("", false, "AV40OldExiAlm", GXutil.ltrimstr( AV40OldExiAlm, 12, 4));
                           O726PrdPreMed = A726PrdPreMed ;
                           httpContext.ajax_rsp_assign_attri("", false, "A726PrdPreMed", GXutil.ltrimstr( A726PrdPreMed, 14, 5));
                           O725PrdPreAnt = A725PrdPreAnt ;
                           httpContext.ajax_rsp_assign_attri("", false, "A725PrdPreAnt", GXutil.ltrimstr( A725PrdPreAnt, 14, 5));
                        }
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_42 == 0 )
                  {
                     GXCCtl = "LINENT_" + sGXsfl_40_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtLinEnt_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtLinEnt_Internalname, GXutil.ltrim( localUtil.ntoc( A597LinEnt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtEntFecEnt_Internalname, localUtil.format(A415EntFecEnt, "99/99/99")) ;
         httpContext.changePostValue( edtAlbaran_Internalname, GXutil.rtrim( A11Albaran)) ;
         httpContext.changePostValue( edtEntNAlbar_Internalname, GXutil.rtrim( A12857EntNAlbar)) ;
         httpContext.changePostValue( edtPedCod_Internalname, GXutil.ltrim( localUtil.ntoc( A658PedCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtavPedcodprompt_Internalname, AV43PedCodPrompt) ;
         httpContext.changePostValue( edtEntNEmb_Internalname, GXutil.ltrim( localUtil.ntoc( A14035EntNEmb, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtEntPrvNum_Internalname, GXutil.ltrim( localUtil.ntoc( A6156EntPrvNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtEntUniEnt_Internalname, GXutil.ltrim( localUtil.ntoc( A418EntUniEnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtEntCump_Internalname, GXutil.rtrim( A14041EntCump)) ;
         httpContext.changePostValue( cmbEntPedCum.getInternalname(), GXutil.rtrim( A3404EntPedCum)) ;
         httpContext.changePostValue( edtEntPre_Internalname, GXutil.ltrim( localUtil.ntoc( A417EntPre, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtEntUniRem_Internalname, GXutil.ltrim( localUtil.ntoc( A419EntUniRem, (byte)(11), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtEntLotN_Internalname, GXutil.rtrim( A5686EntLotN)) ;
         httpContext.changePostValue( edtEntFVal_Internalname, localUtil.format(A5685EntFVal, "99/99/99")) ;
         httpContext.changePostValue( "ZT_"+"Z597LinEnt_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( Z597LinEnt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z12716EntFabId_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( Z12716EntFabId, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z6156EntPrvNum_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( Z6156EntPrvNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z415EntFecEnt_"+sGXsfl_40_idx, localUtil.dtoc( Z415EntFecEnt, 0, "/")) ;
         httpContext.changePostValue( "ZT_"+"Z10184EntRemTpo_"+sGXsfl_40_idx, GXutil.rtrim( Z10184EntRemTpo)) ;
         httpContext.changePostValue( "ZT_"+"Z3404EntPedCum_"+sGXsfl_40_idx, GXutil.rtrim( Z3404EntPedCum)) ;
         httpContext.changePostValue( "ZT_"+"Z411EntCon_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( Z411EntCon, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z419EntUniRem_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( Z419EntUniRem, (byte)(11), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z417EntPre_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( Z417EntPre, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z11Albaran_"+sGXsfl_40_idx, GXutil.rtrim( Z11Albaran)) ;
         httpContext.changePostValue( "ZT_"+"Z12857EntNAlbar_"+sGXsfl_40_idx, GXutil.rtrim( Z12857EntNAlbar)) ;
         httpContext.changePostValue( "ZT_"+"Z418EntUniEnt_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( Z418EntUniEnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z416EntNumCon_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( Z416EntNumCon, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z5686EntLotN_"+sGXsfl_40_idx, GXutil.rtrim( Z5686EntLotN)) ;
         httpContext.changePostValue( "ZT_"+"Z5685EntFVal_"+sGXsfl_40_idx, localUtil.dtoc( Z5685EntFVal, 0, "/")) ;
         httpContext.changePostValue( "ZT_"+"Z414EntEti_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( Z414EntEti, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z413EntConIni_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( Z413EntConIni, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z412EntConFin_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( Z412EntConFin, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z5691EntBnc_"+sGXsfl_40_idx, GXutil.rtrim( Z5691EntBnc)) ;
         httpContext.changePostValue( "ZT_"+"Z7695EntCC_"+sGXsfl_40_idx, GXutil.rtrim( Z7695EntCC)) ;
         httpContext.changePostValue( "ZT_"+"Z7696EntCCoCod_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( Z7696EntCCoCod, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10782EntUniAlb_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( Z10782EntUniAlb, (byte)(11), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10783EntObs_"+sGXsfl_40_idx, GXutil.rtrim( Z10783EntObs)) ;
         httpContext.changePostValue( "ZT_"+"Z10187EntRemNro_"+sGXsfl_40_idx, GXutil.rtrim( Z10187EntRemNro)) ;
         httpContext.changePostValue( "ZT_"+"Z10186EntRemFch_"+sGXsfl_40_idx, localUtil.dtoc( Z10186EntRemFch, 0, "/")) ;
         httpContext.changePostValue( "ZT_"+"Z10185EntRemSuc_"+sGXsfl_40_idx, GXutil.rtrim( Z10185EntRemSuc)) ;
         httpContext.changePostValue( "ZT_"+"Z13235EntLoteID_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( Z13235EntLoteID, (byte)(12), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z13456EntUbicaci_"+sGXsfl_40_idx, GXutil.rtrim( Z13456EntUbicaci)) ;
         httpContext.changePostValue( "ZT_"+"Z5690EntHfCon_"+sGXsfl_40_idx, localUtil.ttoc( Z5690EntHfCon, 10, 8, 0, 0, "/", ":", " ")) ;
         httpContext.changePostValue( "ZT_"+"Z5689EntFfCon_"+sGXsfl_40_idx, localUtil.dtoc( Z5689EntFfCon, 0, "/")) ;
         httpContext.changePostValue( "ZT_"+"Z5688EntHiCon_"+sGXsfl_40_idx, localUtil.ttoc( Z5688EntHiCon, 10, 8, 0, 0, "/", ":", " ")) ;
         httpContext.changePostValue( "ZT_"+"Z5687EntFiCon_"+sGXsfl_40_idx, localUtil.dtoc( Z5687EntFiCon, 0, "/")) ;
         httpContext.changePostValue( "ZT_"+"Z14035EntNEmb_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( Z14035EntNEmb, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z658PedCod_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( Z658PedCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z663PedFulEnt_"+sGXsfl_40_idx, localUtil.dtoc( Z663PedFulEnt, 0, "/")) ;
         httpContext.changePostValue( "ZT_"+"Z665PedPre_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( Z665PedPre, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z669PedUni_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( Z669PedUni, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z659PedCum_"+sGXsfl_40_idx, GXutil.rtrim( Z659PedCum)) ;
         httpContext.changePostValue( "ZT_"+"Z660PedDto_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( Z660PedDto, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T419EntUniRem_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( O419EntUniRem, (byte)(11), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T418EntUniEnt_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( O418EntUniEnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T657PedCanEnt_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( O657PedCanEnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T415EntFecEnt_"+sGXsfl_40_idx, localUtil.dtoc( O415EntFecEnt, 0, "/")) ;
         httpContext.changePostValue( "T417EntPre_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( O417EntPre, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T5686EntLotN_"+sGXsfl_40_idx, GXutil.rtrim( O5686EntLotN)) ;
         httpContext.changePostValue( "T3404EntPedCum_"+sGXsfl_40_idx, GXutil.rtrim( O3404EntPedCum)) ;
         httpContext.changePostValue( "nRcdDeleted_42_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_42, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_42_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_42, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_42_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_42, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "N415EntFecEnt_"+sGXsfl_40_idx, localUtil.dtoc( A415EntFecEnt, 0, "/")) ;
         httpContext.changePostValue( "N11Albaran_"+sGXsfl_40_idx, GXutil.rtrim( A11Albaran)) ;
         httpContext.changePostValue( "N12857EntNAlbar_"+sGXsfl_40_idx, GXutil.rtrim( A12857EntNAlbar)) ;
         httpContext.changePostValue( "N6156EntPrvNum_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( A6156EntPrvNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "N418EntUniEnt_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( A418EntUniEnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "N3404EntPedCum_"+sGXsfl_40_idx, GXutil.rtrim( A3404EntPedCum)) ;
         httpContext.changePostValue( "N417EntPre_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( A417EntPre, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "N5686EntLotN_"+sGXsfl_40_idx, GXutil.rtrim( A5686EntLotN)) ;
         httpContext.changePostValue( "N5685EntFVal_"+sGXsfl_40_idx, localUtil.dtoc( A5685EntFVal, 0, "/")) ;
         if ( nIsMod_42 != 0 )
         {
            httpContext.changePostValue( "LINENT_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLinEnt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ENTFECENT_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtEntFecEnt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBARAN_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbaran_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBARAN_"+sGXsfl_40_idx+"Visible", GXutil.ltrim( localUtil.ntoc( edtAlbaran_Visible, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ENTNALBAR_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtEntNAlbar_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ENTNALBAR_"+sGXsfl_40_idx+"Visible", GXutil.ltrim( localUtil.ntoc( edtEntNAlbar_Visible, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PEDCOD_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPedCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "vPEDCODPROMPT_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavPedcodprompt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "vPEDCODPROMPT_"+sGXsfl_40_idx+"Link", GXutil.rtrim( edtavPedcodprompt_Link)) ;
            httpContext.changePostValue( "vPEDCODPROMPT_"+sGXsfl_40_idx+"Visible", GXutil.ltrim( localUtil.ntoc( edtavPedcodprompt_Visible, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ENTNEMB_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtEntNEmb_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ENTNEMB_"+sGXsfl_40_idx+"Visible", GXutil.ltrim( localUtil.ntoc( edtEntNEmb_Visible, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ENTPRVNUM_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtEntPrvNum_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ENTUNIENT_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtEntUniEnt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ENTCUMP_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtEntCump_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ENTPEDCUM_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( cmbEntPedCum.getEnabled(), (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ENTPRE_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtEntPre_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ENTUNIREM_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtEntUniRem_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ENTLOTN_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtEntLotN_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ENTFVAL_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtEntFVal_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      O724PrdPreAct = s724PrdPreAct ;
      httpContext.ajax_rsp_assign_attri("", false, "A724PrdPreAct", GXutil.ltrimstr( A724PrdPreAct, 14, 5));
      O704PrdExiAlm = s704PrdExiAlm ;
      httpContext.ajax_rsp_assign_attri("", false, "A704PrdExiAlm", GXutil.ltrimstr( A704PrdExiAlm, 12, 4));
      O750PrdValStk = s750PrdValStk ;
      httpContext.ajax_rsp_assign_attri("", false, "A750PrdValStk", GXutil.ltrimstr( A750PrdValStk, 11, 2));
      O847UltLinEnt = s847UltLinEnt ;
      httpContext.ajax_rsp_assign_attri("", false, "A847UltLinEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A847UltLinEnt), 4, 0));
      OV44PedPri = sV44PedPri ;
      httpContext.ajax_rsp_assign_attri("", false, "AV44PedPri", AV44PedPri);
      O713PrdFulEnt = s713PrdFulEnt ;
      httpContext.ajax_rsp_assign_attri("", false, "A713PrdFulEnt", localUtil.format(A713PrdFulEnt, "99/99/99"));
      O709PrdFecPre = s709PrdFecPre ;
      httpContext.ajax_rsp_assign_attri("", false, "A709PrdFecPre", localUtil.format(A709PrdFecPre, "99/99/99"));
      O684PrdCanPen = s684PrdCanPen ;
      httpContext.ajax_rsp_assign_attri("", false, "A684PrdCanPen", GXutil.ltrimstr( A684PrdCanPen, 12, 4));
      O14040PrdUltMovF = s14040PrdUltMovF ;
      httpContext.ajax_rsp_assign_attri("", false, "A14040PrdUltMovF", localUtil.format(A14040PrdUltMovF, "99/99/99"));
      OV40OldExiAlm = sV40OldExiAlm ;
      httpContext.ajax_rsp_assign_attri("", false, "AV40OldExiAlm", GXutil.ltrimstr( AV40OldExiAlm, 12, 4));
      O726PrdPreMed = s726PrdPreMed ;
      httpContext.ajax_rsp_assign_attri("", false, "A726PrdPreMed", GXutil.ltrimstr( A726PrdPreMed, 14, 5));
      O725PrdPreAnt = s725PrdPreAnt ;
      httpContext.ajax_rsp_assign_attri("", false, "A725PrdPreAnt", GXutil.ltrimstr( A725PrdPreAnt, 14, 5));
      /* Start of After( level) rules */
      /* Using cursor T01SH8 */
      pr_default.execute(5, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
      if ( (pr_default.getStatus(5) != 101) )
      {
         A913StockRem = T01SH8_A913StockRem[0] ;
         n913StockRem = T01SH8_n913StockRem[0] ;
      }
      else
      {
         A913StockRem = DecimalUtil.doubleToDec(0) ;
         n913StockRem = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A913StockRem", GXutil.ltrimstr( A913StockRem, 12, 4));
      }
      /* End of After( level) rules */
   }

   public void resetCaption1SH0( )
   {
   }

   public void e111SH2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV50Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      entradaproducto_impl.this.GXt_char1 = GXv_char2[0] ;
      AV50Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV50Station", AV50Station);
      GXv_char2[0] = AV18EmprCod ;
      GXv_char3[0] = AV19EmprNom ;
      GXv_char4[0] = AV56UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV50Station, GXv_char2, GXv_char3, GXv_char4) ;
      entradaproducto_impl.this.AV18EmprCod = GXv_char2[0] ;
      entradaproducto_impl.this.AV19EmprNom = GXv_char3[0] ;
      entradaproducto_impl.this.AV56UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18EmprCod", AV18EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV18EmprCod, "@!"))));
      httpContext.ajax_rsp_assign_attri("", false, "AV19EmprNom", AV19EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV56UsurCod", AV56UsurCod);
      GXt_int5 = (byte)(AV36NoUpd) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV18EmprCod, httpContext.getMessage( "NOUPPR", ""), GXv_int6) ;
      entradaproducto_impl.this.GXt_int5 = GXv_int6[0] ;
      AV36NoUpd = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV36NoUpd", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36NoUpd), 4, 0));
      GXt_int7 = AV14Consumos ;
      GXv_int8[0] = GXt_int7 ;
      new app.pbuscon(remoteHandle, context).execute( AV18EmprCod, "011100", GXv_int8) ;
      entradaproducto_impl.this.GXt_int7 = GXv_int8[0] ;
      AV14Consumos = (short)(GXt_int7) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14Consumos", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14Consumos), 4, 0));
      GXt_int5 = (byte)(AV35Nalbaran20) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV18EmprCod, httpContext.getMessage( "ALBA20", ""), GXv_int6) ;
      entradaproducto_impl.this.GXt_int5 = GXv_int6[0] ;
      AV35Nalbaran20 = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV35Nalbaran20", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV35Nalbaran20), 4, 0));
      GXt_int5 = (byte)(AV60FlagPre) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV18EmprCod, httpContext.getMessage( "ENTPRE", ""), GXv_int6) ;
      entradaproducto_impl.this.GXt_int5 = GXv_int6[0] ;
      AV60FlagPre = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV60FlagPre", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV60FlagPre), 4, 0));
      GXt_int5 = (byte)(AV25FlagFecCcs) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV18EmprCod, httpContext.getMessage( "FECCCS", ""), GXv_int6) ;
      entradaproducto_impl.this.GXt_int5 = GXv_int6[0] ;
      AV25FlagFecCcs = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV25FlagFecCcs", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV25FlagFecCcs), 4, 0));
      GXt_char1 = AV50Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      entradaproducto_impl.this.GXt_char1 = GXv_char4[0] ;
      AV50Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV50Station", AV50Station);
      GXv_char4[0] = AV18EmprCod ;
      GXv_char3[0] = AV19EmprNom ;
      GXv_char2[0] = AV56UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV50Station, GXv_char4, GXv_char3, GXv_char2) ;
      entradaproducto_impl.this.AV18EmprCod = GXv_char4[0] ;
      entradaproducto_impl.this.AV19EmprNom = GXv_char3[0] ;
      entradaproducto_impl.this.AV56UsurCod = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18EmprCod", AV18EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV18EmprCod, "@!"))));
      httpContext.ajax_rsp_assign_attri("", false, "AV19EmprNom", AV19EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV56UsurCod", AV56UsurCod);
      GXv_SdtWWPContext9[0] = AV58WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext9) ;
      AV58WWPContext = GXv_SdtWWPContext9[0] ;
      AV52TrnContext.fromxml(AV57WebSession.getValue("TrnContext"), null, null);
      if ( ( GXutil.strcmp(AV52TrnContext.getgxTv_SdtWWPTransactionContext_Transactionname(), AV62Pgmname) == 0 ) && ( GXutil.strcmp(Gx_mode, "INS") == 0 ) )
      {
         AV64GXV1 = 1 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV64GXV1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV64GXV1), 8, 0));
         while ( AV64GXV1 <= AV52TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().size() )
         {
            AV53TrnContextAtt = (app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)((app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)AV52TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().elementAt(-1+AV64GXV1));
            if ( GXutil.strcmp(AV53TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributename(), "PrvNum") == 0 )
            {
               AV27Insert_PrvNum = (int)(GXutil.lval( AV53TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributevalue())) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV27Insert_PrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV27Insert_PrvNum), 6, 0));
            }
            else if ( GXutil.strcmp(AV53TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributename(), "ValCod") == 0 )
            {
               AV28Insert_ValCod = (byte)(GXutil.lval( AV53TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributevalue())) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV28Insert_ValCod", GXutil.str( AV28Insert_ValCod, 1, 0));
            }
            AV64GXV1 = (int)(AV64GXV1+1) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV64GXV1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV64GXV1), 8, 0));
         }
      }
      edtavPedcodprompt_gximage = "prompt" ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPedcodprompt_Internalname, "gximage", edtavPedcodprompt_gximage, !bGXsfl_40_Refreshing);
      AV43PedCodPrompt = context.getHttpContext().getImagePath( "f5b04895-0024-488b-8e3b-b687ca4598ee", "", context.getHttpContext().getTheme( )) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPedcodprompt_Internalname, "Bitmap", ((GXutil.strcmp("", AV43PedCodPrompt)==0) ? AV65Pedcodprompt_GXI : httpContext.convertURL( httpContext.getResourceRelative(AV43PedCodPrompt))), !bGXsfl_40_Refreshing);
      httpContext.ajax_rsp_assign_prop("", false, edtavPedcodprompt_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( AV43PedCodPrompt), true);
      AV65Pedcodprompt_GXI = GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "f5b04895-0024-488b-8e3b-b687ca4598ee", "", context.getHttpContext().getTheme( )), context.getHttpContext()) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPedcodprompt_Internalname, "Bitmap", ((GXutil.strcmp("", AV43PedCodPrompt)==0) ? AV65Pedcodprompt_GXI : httpContext.convertURL( httpContext.getResourceRelative(AV43PedCodPrompt))), !bGXsfl_40_Refreshing);
      httpContext.ajax_rsp_assign_prop("", false, edtavPedcodprompt_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( AV43PedCodPrompt), true);
   }

   public void e121SH2( )
   {
      /* After Trn Routine */
      returnInSub = false ;
      httpContext.setWebReturnParms(new Object[] {});
      httpContext.setWebReturnParmsMetadata(new Object[] {});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      pr_default.close(10);
      pr_default.close(9);
      pr_default.close(8);
      pr_default.close(7);
      pr_default.close(5);
      pr_default.close(4);
      pr_default.close(2);
      pr_default.close(1);
      returnInSub = true;
      if (true) return;
   }

   public void zm1SH29( int GX_JID )
   {
      if ( ( GX_JID == 118 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z726PrdPreMed = T01SH10_A726PrdPreMed[0] ;
            Z725PrdPreAnt = T01SH10_A725PrdPreAnt[0] ;
            Z718PrdNom = T01SH10_A718PrdNom[0] ;
            Z724PrdPreAct = T01SH10_A724PrdPreAct[0] ;
            Z704PrdExiAlm = T01SH10_A704PrdExiAlm[0] ;
            Z847UltLinEnt = T01SH10_A847UltLinEnt[0] ;
            Z698PrdDetPar = T01SH10_A698PrdDetPar[0] ;
            Z713PrdFulEnt = T01SH10_A713PrdFulEnt[0] ;
            Z684PrdCanPen = T01SH10_A684PrdCanPen[0] ;
            Z729PrdRotRea = T01SH10_A729PrdRotRea[0] ;
            Z727PrdRec = T01SH10_A727PrdRec[0] ;
            Z709PrdFecPre = T01SH10_A709PrdFecPre[0] ;
            Z5255PrdPreAc2 = T01SH10_A5255PrdPreAc2[0] ;
            Z750PrdValStk = T01SH10_A750PrdValStk[0] ;
            Z705PrdExiCC = T01SH10_A705PrdExiCC[0] ;
            Z795PrvNum = T01SH10_A795PrvNum[0] ;
            Z856ValCod = T01SH10_A856ValCod[0] ;
         }
         else
         {
            Z726PrdPreMed = A726PrdPreMed ;
            Z725PrdPreAnt = A725PrdPreAnt ;
            Z718PrdNom = A718PrdNom ;
            Z724PrdPreAct = A724PrdPreAct ;
            Z704PrdExiAlm = A704PrdExiAlm ;
            Z847UltLinEnt = A847UltLinEnt ;
            Z698PrdDetPar = A698PrdDetPar ;
            Z713PrdFulEnt = A713PrdFulEnt ;
            Z684PrdCanPen = A684PrdCanPen ;
            Z729PrdRotRea = A729PrdRotRea ;
            Z727PrdRec = A727PrdRec ;
            Z709PrdFecPre = A709PrdFecPre ;
            Z5255PrdPreAc2 = A5255PrdPreAc2 ;
            Z750PrdValStk = A750PrdValStk ;
            Z705PrdExiCC = A705PrdExiCC ;
            Z795PrvNum = A795PrvNum ;
            Z856ValCod = A856ValCod ;
         }
      }
      if ( GX_JID == -118 )
      {
         Z719PrdNum = A719PrdNum ;
         Z726PrdPreMed = A726PrdPreMed ;
         Z725PrdPreAnt = A725PrdPreAnt ;
         Z718PrdNom = A718PrdNom ;
         Z724PrdPreAct = A724PrdPreAct ;
         Z704PrdExiAlm = A704PrdExiAlm ;
         Z847UltLinEnt = A847UltLinEnt ;
         Z698PrdDetPar = A698PrdDetPar ;
         Z713PrdFulEnt = A713PrdFulEnt ;
         Z684PrdCanPen = A684PrdCanPen ;
         Z729PrdRotRea = A729PrdRotRea ;
         Z727PrdRec = A727PrdRec ;
         Z709PrdFecPre = A709PrdFecPre ;
         Z5255PrdPreAc2 = A5255PrdPreAc2 ;
         Z750PrdValStk = A750PrdValStk ;
         Z705PrdExiCC = A705PrdExiCC ;
         Z396EmprCod = A396EmprCod ;
         Z795PrvNum = A795PrvNum ;
         Z856ValCod = A856ValCod ;
         Z407EmprNom = A407EmprNom ;
         Z3915EmpNumDec = A3915EmpNumDec ;
         Z794PrvNom = A794PrvNom ;
         Z800PrvPri = A800PrvPri ;
         Z913StockRem = A913StockRem ;
      }
   }

   public void standaloneNotModal( )
   {
      edtPrdNum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNum_Enabled), 5, 0), true);
      edtPrdNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNom_Enabled), 5, 0), true);
      edtPrdExiAlm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdExiAlm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdExiAlm_Enabled), 5, 0), true);
      Gx_date = GXutil.today( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_date", localUtil.format(Gx_date, "99/99/99"));
      AV62Pgmname = "EntradaProducto" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV62Pgmname", AV62Pgmname);
      Gx_BScreen = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      edtPrdNum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNum_Enabled), 5, 0), true);
      edtPrdNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNom_Enabled), 5, 0), true);
      edtPrdExiAlm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdExiAlm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdExiAlm_Enabled), 5, 0), true);
      bttBtntrn_delete_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtntrn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_delete_Enabled), 5, 0), true);
      if ( ! (GXutil.strcmp("", AV18EmprCod)==0) )
      {
         A396EmprCod = AV18EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      }
      /* Using cursor T01SH11 */
      pr_default.execute(8, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(8) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01SH11_A407EmprNom[0] ;
      n407EmprNom = T01SH11_n407EmprNom[0] ;
      A3915EmpNumDec = T01SH11_A3915EmpNumDec[0] ;
      n3915EmpNumDec = T01SH11_n3915EmpNumDec[0] ;
      pr_default.close(8);
      GXt_int5 = (byte)(0) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "ALBA20", ""), ""), GXv_int6) ;
      entradaproducto_impl.this.GXt_int5 = GXv_int6[0] ;
      edtAlbaran_Visible = ((GXt_int5==0) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbaran_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbaran_Visible), 5, 0), !bGXsfl_40_Refreshing);
      GXt_int5 = (byte)(0) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "ALBA20", ""), ""), GXv_int6) ;
      entradaproducto_impl.this.GXt_int5 = GXv_int6[0] ;
      edtEntNAlbar_Visible = ((GXt_int5==1) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtEntNAlbar_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEntNAlbar_Visible), 5, 0), !bGXsfl_40_Refreshing);
      GXt_int5 = (byte)(0) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV18EmprCod, httpContext.getMessage( httpContext.getMessage( "MODA21", ""), ""), GXv_int6) ;
      entradaproducto_impl.this.GXt_int5 = GXv_int6[0] ;
      edtEntNEmb_Visible = ((GXt_int5==1) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtEntNEmb_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEntNEmb_Visible), 5, 0), !bGXsfl_40_Refreshing);
      if ( ! (GXutil.strcmp("", AV46PrdNum)==0) )
      {
         A719PrdNum = AV46PrdNum ;
         n719PrdNum = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
      }
   }

   public void standaloneModal( )
   {
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV28Insert_ValCod) )
      {
         A856ValCod = AV28Insert_ValCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A856ValCod", GXutil.str( A856ValCod, 1, 0));
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV27Insert_PrvNum) )
      {
         A795PrvNum = AV27Insert_PrvNum ;
         httpContext.ajax_rsp_assign_attri("", false, "A795PrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A795PrvNum), 6, 0));
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
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ( Gx_BScreen == 0 ) )
      {
         /* Using cursor T01SH8 */
         pr_default.execute(5, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(5) != 101) )
         {
            A913StockRem = T01SH8_A913StockRem[0] ;
            n913StockRem = T01SH8_n913StockRem[0] ;
         }
         else
         {
            A913StockRem = DecimalUtil.doubleToDec(0) ;
            n913StockRem = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A913StockRem", GXutil.ltrimstr( A913StockRem, 12, 4));
         }
         pr_default.close(5);
         GXt_date10 = A14040PrdUltMovF ;
         GXv_char4[0] = A396EmprCod ;
         GXv_char3[0] = A719PrdNum ;
         GXv_date11[0] = GXt_date10 ;
         new app.pstm005(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_date11) ;
         entradaproducto_impl.this.A396EmprCod = GXv_char4[0] ;
         entradaproducto_impl.this.A719PrdNum = GXv_char3[0] ;
         entradaproducto_impl.this.GXt_date10 = GXv_date11[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         A14040PrdUltMovF = GXt_date10 ;
         httpContext.ajax_rsp_assign_attri("", false, "A14040PrdUltMovF", localUtil.format(A14040PrdUltMovF, "99/99/99"));
         GXt_date10 = A3835UltFecCCs ;
         GXv_char4[0] = A396EmprCod ;
         GXv_char3[0] = A719PrdNum ;
         GXv_date11[0] = GXt_date10 ;
         new app.pstm005(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_date11) ;
         entradaproducto_impl.this.A396EmprCod = GXv_char4[0] ;
         entradaproducto_impl.this.A719PrdNum = GXv_char3[0] ;
         entradaproducto_impl.this.GXt_date10 = GXv_date11[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         A3835UltFecCCs = GXt_date10 ;
         httpContext.ajax_rsp_assign_attri("", false, "A3835UltFecCCs", localUtil.format(A3835UltFecCCs, "99/99/99"));
         /* Using cursor T01SH12 */
         pr_default.execute(9, new Object[] {A396EmprCod, Integer.valueOf(A795PrvNum)});
         A794PrvNom = T01SH12_A794PrvNom[0] ;
         n794PrvNom = T01SH12_n794PrvNom[0] ;
         A800PrvPri = T01SH12_A800PrvPri[0] ;
         n800PrvPri = T01SH12_n800PrvPri[0] ;
         pr_default.close(9);
         AV44PedPri = GXutil.str( A800PrvPri, 1, 0) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV44PedPri", AV44PedPri);
      }
   }

   public void load1SH29( )
   {
      /* Using cursor T01SH15 */
      pr_default.execute(11, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
      if ( (pr_default.getStatus(11) != 101) )
      {
         RcdFound29 = (short)(1) ;
         A726PrdPreMed = T01SH15_A726PrdPreMed[0] ;
         A725PrdPreAnt = T01SH15_A725PrdPreAnt[0] ;
         A718PrdNom = T01SH15_A718PrdNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A718PrdNom", A718PrdNom);
         A794PrvNom = T01SH15_A794PrvNom[0] ;
         n794PrvNom = T01SH15_n794PrvNom[0] ;
         A724PrdPreAct = T01SH15_A724PrdPreAct[0] ;
         A704PrdExiAlm = T01SH15_A704PrdExiAlm[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A704PrdExiAlm", GXutil.ltrimstr( A704PrdExiAlm, 12, 4));
         A847UltLinEnt = T01SH15_A847UltLinEnt[0] ;
         A698PrdDetPar = T01SH15_A698PrdDetPar[0] ;
         A713PrdFulEnt = T01SH15_A713PrdFulEnt[0] ;
         A684PrdCanPen = T01SH15_A684PrdCanPen[0] ;
         A729PrdRotRea = T01SH15_A729PrdRotRea[0] ;
         A727PrdRec = T01SH15_A727PrdRec[0] ;
         A709PrdFecPre = T01SH15_A709PrdFecPre[0] ;
         A407EmprNom = T01SH15_A407EmprNom[0] ;
         n407EmprNom = T01SH15_n407EmprNom[0] ;
         A800PrvPri = T01SH15_A800PrvPri[0] ;
         n800PrvPri = T01SH15_n800PrvPri[0] ;
         A3915EmpNumDec = T01SH15_A3915EmpNumDec[0] ;
         n3915EmpNumDec = T01SH15_n3915EmpNumDec[0] ;
         A5255PrdPreAc2 = T01SH15_A5255PrdPreAc2[0] ;
         A750PrdValStk = T01SH15_A750PrdValStk[0] ;
         A705PrdExiCC = T01SH15_A705PrdExiCC[0] ;
         A795PrvNum = T01SH15_A795PrvNum[0] ;
         A856ValCod = T01SH15_A856ValCod[0] ;
         A913StockRem = T01SH15_A913StockRem[0] ;
         n913StockRem = T01SH15_n913StockRem[0] ;
         zm1SH29( -118) ;
      }
      pr_default.close(11);
      onLoadActions1SH29( ) ;
   }

   public void onLoadActions1SH29( )
   {
      if ( ( isIns( )  || isUpd( )  ) && ( AV36NoUpd == 0 ) )
      {
         A725PrdPreAnt = O724PrdPreAct ;
         httpContext.ajax_rsp_assign_attri("", false, "A725PrdPreAnt", GXutil.ltrimstr( A725PrdPreAnt, 14, 5));
      }
      if ( ( A704PrdExiAlm.doubleValue() != 0 ) && ( AV14Consumos == 1 ) && ( A750PrdValStk.doubleValue() > 0 ) )
      {
         A726PrdPreMed = GXutil.roundDecimal( A750PrdValStk.divide(A704PrdExiAlm, 18, java.math.RoundingMode.DOWN), 3) ;
         httpContext.ajax_rsp_assign_attri("", false, "A726PrdPreMed", GXutil.ltrimstr( A726PrdPreMed, 14, 5));
      }
      else
      {
         if ( ( A704PrdExiAlm.doubleValue() == 0 ) && ( AV14Consumos == 1 ) && ( A750PrdValStk.doubleValue() == 0 ) )
         {
            A726PrdPreMed = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A726PrdPreMed", GXutil.ltrimstr( A726PrdPreMed, 14, 5));
         }
         else
         {
            if ( ( ( A704PrdExiAlm.doubleValue() != 0 ) || ( A705PrdExiCC.doubleValue() != 0 ) ) && ( AV14Consumos == 0 ) )
            {
               A726PrdPreMed = GXutil.roundDecimal( A750PrdValStk.divide((A704PrdExiAlm.add(A705PrdExiCC)), 18, java.math.RoundingMode.DOWN), 3) ;
               httpContext.ajax_rsp_assign_attri("", false, "A726PrdPreMed", GXutil.ltrimstr( A726PrdPreMed, 14, 5));
            }
            else
            {
               if ( ( A704PrdExiAlm.doubleValue() == 0 ) && ( A705PrdExiCC.doubleValue() == 0 ) && ( AV14Consumos == 0 ) )
               {
                  A726PrdPreMed = DecimalUtil.doubleToDec(0) ;
                  httpContext.ajax_rsp_assign_attri("", false, "A726PrdPreMed", GXutil.ltrimstr( A726PrdPreMed, 14, 5));
               }
            }
         }
      }
      AV40OldExiAlm = O704PrdExiAlm ;
      httpContext.ajax_rsp_assign_attri("", false, "AV40OldExiAlm", GXutil.ltrimstr( AV40OldExiAlm, 12, 4));
      AV44PedPri = GXutil.str( A800PrvPri, 1, 0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV44PedPri", AV44PedPri);
      GXt_date10 = A14040PrdUltMovF ;
      GXv_char4[0] = A396EmprCod ;
      GXv_char3[0] = A719PrdNum ;
      GXv_date11[0] = GXt_date10 ;
      new app.pstm005(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_date11) ;
      entradaproducto_impl.this.A396EmprCod = GXv_char4[0] ;
      entradaproducto_impl.this.A719PrdNum = GXv_char3[0] ;
      entradaproducto_impl.this.GXt_date10 = GXv_date11[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
      A14040PrdUltMovF = GXt_date10 ;
      httpContext.ajax_rsp_assign_attri("", false, "A14040PrdUltMovF", localUtil.format(A14040PrdUltMovF, "99/99/99"));
      GXt_date10 = A3835UltFecCCs ;
      GXv_char4[0] = A396EmprCod ;
      GXv_char3[0] = A719PrdNum ;
      GXv_date11[0] = GXt_date10 ;
      new app.pstm005(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_date11) ;
      entradaproducto_impl.this.A396EmprCod = GXv_char4[0] ;
      entradaproducto_impl.this.A719PrdNum = GXv_char3[0] ;
      entradaproducto_impl.this.GXt_date10 = GXv_date11[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
      A3835UltFecCCs = GXt_date10 ;
      httpContext.ajax_rsp_assign_attri("", false, "A3835UltFecCCs", localUtil.format(A3835UltFecCCs, "99/99/99"));
   }

   public void checkExtendedTable1SH29( )
   {
      nIsDirty_29 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal( ) ;
      if ( ( isIns( )  || isUpd( )  ) && ( AV36NoUpd == 0 ) )
      {
         nIsDirty_29 = (short)(1) ;
         A725PrdPreAnt = O724PrdPreAct ;
         httpContext.ajax_rsp_assign_attri("", false, "A725PrdPreAnt", GXutil.ltrimstr( A725PrdPreAnt, 14, 5));
      }
      if ( ( A704PrdExiAlm.doubleValue() != 0 ) && ( AV14Consumos == 1 ) && ( A750PrdValStk.doubleValue() > 0 ) )
      {
         nIsDirty_29 = (short)(1) ;
         A726PrdPreMed = GXutil.roundDecimal( A750PrdValStk.divide(A704PrdExiAlm, 18, java.math.RoundingMode.DOWN), 3) ;
         httpContext.ajax_rsp_assign_attri("", false, "A726PrdPreMed", GXutil.ltrimstr( A726PrdPreMed, 14, 5));
      }
      else
      {
         if ( ( A704PrdExiAlm.doubleValue() == 0 ) && ( AV14Consumos == 1 ) && ( A750PrdValStk.doubleValue() == 0 ) )
         {
            nIsDirty_29 = (short)(1) ;
            A726PrdPreMed = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A726PrdPreMed", GXutil.ltrimstr( A726PrdPreMed, 14, 5));
         }
         else
         {
            if ( ( ( A704PrdExiAlm.doubleValue() != 0 ) || ( A705PrdExiCC.doubleValue() != 0 ) ) && ( AV14Consumos == 0 ) )
            {
               nIsDirty_29 = (short)(1) ;
               A726PrdPreMed = GXutil.roundDecimal( A750PrdValStk.divide((A704PrdExiAlm.add(A705PrdExiCC)), 18, java.math.RoundingMode.DOWN), 3) ;
               httpContext.ajax_rsp_assign_attri("", false, "A726PrdPreMed", GXutil.ltrimstr( A726PrdPreMed, 14, 5));
            }
            else
            {
               if ( ( A704PrdExiAlm.doubleValue() == 0 ) && ( A705PrdExiCC.doubleValue() == 0 ) && ( AV14Consumos == 0 ) )
               {
                  nIsDirty_29 = (short)(1) ;
                  A726PrdPreMed = DecimalUtil.doubleToDec(0) ;
                  httpContext.ajax_rsp_assign_attri("", false, "A726PrdPreMed", GXutil.ltrimstr( A726PrdPreMed, 14, 5));
               }
            }
         }
      }
      AV40OldExiAlm = O704PrdExiAlm ;
      httpContext.ajax_rsp_assign_attri("", false, "AV40OldExiAlm", GXutil.ltrimstr( AV40OldExiAlm, 12, 4));
      /* Using cursor T01SH12 */
      pr_default.execute(9, new Object[] {A396EmprCod, Integer.valueOf(A795PrvNum)});
      if ( (pr_default.getStatus(9) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PRVGEN", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PRVNUM");
         AnyError = (short)(1) ;
      }
      A794PrvNom = T01SH12_A794PrvNom[0] ;
      n794PrvNom = T01SH12_n794PrvNom[0] ;
      A800PrvPri = T01SH12_A800PrvPri[0] ;
      n800PrvPri = T01SH12_n800PrvPri[0] ;
      pr_default.close(9);
      AV44PedPri = GXutil.str( A800PrvPri, 1, 0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV44PedPri", AV44PedPri);
      /* Using cursor T01SH13 */
      pr_default.execute(10, new Object[] {A396EmprCod, Byte.valueOf(A856ValCod)});
      if ( (pr_default.getStatus(10) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TIPVAL", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "VALCOD");
         AnyError = (short)(1) ;
      }
      pr_default.close(10);
      /* Using cursor T01SH8 */
      pr_default.execute(5, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
      if ( (pr_default.getStatus(5) != 101) )
      {
         A913StockRem = T01SH8_A913StockRem[0] ;
         n913StockRem = T01SH8_n913StockRem[0] ;
      }
      else
      {
         nIsDirty_29 = (short)(1) ;
         A913StockRem = DecimalUtil.doubleToDec(0) ;
         n913StockRem = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A913StockRem", GXutil.ltrimstr( A913StockRem, 12, 4));
      }
      pr_default.close(5);
      nIsDirty_29 = (short)(1) ;
      GXt_date10 = A14040PrdUltMovF ;
      GXv_char4[0] = A396EmprCod ;
      GXv_char3[0] = A719PrdNum ;
      GXv_date11[0] = GXt_date10 ;
      new app.pstm005(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_date11) ;
      entradaproducto_impl.this.A396EmprCod = GXv_char4[0] ;
      entradaproducto_impl.this.A719PrdNum = GXv_char3[0] ;
      entradaproducto_impl.this.GXt_date10 = GXv_date11[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
      A14040PrdUltMovF = GXt_date10 ;
      httpContext.ajax_rsp_assign_attri("", false, "A14040PrdUltMovF", localUtil.format(A14040PrdUltMovF, "99/99/99"));
      nIsDirty_29 = (short)(1) ;
      GXt_date10 = A3835UltFecCCs ;
      GXv_char4[0] = A396EmprCod ;
      GXv_char3[0] = A719PrdNum ;
      GXv_date11[0] = GXt_date10 ;
      new app.pstm005(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_date11) ;
      entradaproducto_impl.this.A396EmprCod = GXv_char4[0] ;
      entradaproducto_impl.this.A719PrdNum = GXv_char3[0] ;
      entradaproducto_impl.this.GXt_date10 = GXv_date11[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
      A3835UltFecCCs = GXt_date10 ;
      httpContext.ajax_rsp_assign_attri("", false, "A3835UltFecCCs", localUtil.format(A3835UltFecCCs, "99/99/99"));
   }

   public void closeExtendedTableCursors1SH29( )
   {
      pr_default.close(9);
      pr_default.close(10);
      pr_default.close(5);
   }

   public void enableDisable( )
   {
   }

   public void gxload_120( String A396EmprCod ,
                           int A795PrvNum )
   {
      /* Using cursor T01SH16 */
      pr_default.execute(12, new Object[] {A396EmprCod, Integer.valueOf(A795PrvNum)});
      if ( (pr_default.getStatus(12) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PRVGEN", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PRVNUM");
         AnyError = (short)(1) ;
      }
      A794PrvNom = T01SH16_A794PrvNom[0] ;
      n794PrvNom = T01SH16_n794PrvNom[0] ;
      A800PrvPri = T01SH16_A800PrvPri[0] ;
      n800PrvPri = T01SH16_n800PrvPri[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A794PrvNom))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A800PrvPri, (byte)(1), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(12) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(12);
   }

   public void gxload_121( String A396EmprCod ,
                           byte A856ValCod )
   {
      /* Using cursor T01SH17 */
      pr_default.execute(13, new Object[] {A396EmprCod, Byte.valueOf(A856ValCod)});
      if ( (pr_default.getStatus(13) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TIPVAL", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "VALCOD");
         AnyError = (short)(1) ;
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "]") ;
      if ( (pr_default.getStatus(13) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(13);
   }

   public void gxload_122( String A396EmprCod ,
                           String A719PrdNum )
   {
      /* Using cursor T01SH19 */
      pr_default.execute(14, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
      if ( (pr_default.getStatus(14) != 101) )
      {
         A913StockRem = T01SH19_A913StockRem[0] ;
         n913StockRem = T01SH19_n913StockRem[0] ;
      }
      else
      {
         A913StockRem = DecimalUtil.doubleToDec(0) ;
         n913StockRem = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A913StockRem", GXutil.ltrimstr( A913StockRem, 12, 4));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A913StockRem, (byte)(12), (byte)(4), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(14) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(14);
   }

   public void getKey1SH29( )
   {
      /* Using cursor T01SH20 */
      pr_default.execute(15, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
      if ( (pr_default.getStatus(15) != 101) )
      {
         RcdFound29 = (short)(1) ;
      }
      else
      {
         RcdFound29 = (short)(0) ;
      }
      pr_default.close(15);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01SH10 */
      pr_default.execute(7, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
      if ( (pr_default.getStatus(7) != 101) )
      {
         zm1SH29( 118) ;
         RcdFound29 = (short)(1) ;
         A719PrdNum = T01SH10_A719PrdNum[0] ;
         n719PrdNum = T01SH10_n719PrdNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         A726PrdPreMed = T01SH10_A726PrdPreMed[0] ;
         A725PrdPreAnt = T01SH10_A725PrdPreAnt[0] ;
         A718PrdNom = T01SH10_A718PrdNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A718PrdNom", A718PrdNom);
         A724PrdPreAct = T01SH10_A724PrdPreAct[0] ;
         A704PrdExiAlm = T01SH10_A704PrdExiAlm[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A704PrdExiAlm", GXutil.ltrimstr( A704PrdExiAlm, 12, 4));
         A847UltLinEnt = T01SH10_A847UltLinEnt[0] ;
         A698PrdDetPar = T01SH10_A698PrdDetPar[0] ;
         A713PrdFulEnt = T01SH10_A713PrdFulEnt[0] ;
         A684PrdCanPen = T01SH10_A684PrdCanPen[0] ;
         A729PrdRotRea = T01SH10_A729PrdRotRea[0] ;
         A727PrdRec = T01SH10_A727PrdRec[0] ;
         A709PrdFecPre = T01SH10_A709PrdFecPre[0] ;
         A5255PrdPreAc2 = T01SH10_A5255PrdPreAc2[0] ;
         A750PrdValStk = T01SH10_A750PrdValStk[0] ;
         A705PrdExiCC = T01SH10_A705PrdExiCC[0] ;
         A396EmprCod = T01SH10_A396EmprCod[0] ;
         A795PrvNum = T01SH10_A795PrvNum[0] ;
         A856ValCod = T01SH10_A856ValCod[0] ;
         O724PrdPreAct = A724PrdPreAct ;
         httpContext.ajax_rsp_assign_attri("", false, "A724PrdPreAct", GXutil.ltrimstr( A724PrdPreAct, 14, 5));
         O750PrdValStk = A750PrdValStk ;
         httpContext.ajax_rsp_assign_attri("", false, "A750PrdValStk", GXutil.ltrimstr( A750PrdValStk, 11, 2));
         O704PrdExiAlm = A704PrdExiAlm ;
         httpContext.ajax_rsp_assign_attri("", false, "A704PrdExiAlm", GXutil.ltrimstr( A704PrdExiAlm, 12, 4));
         O847UltLinEnt = A847UltLinEnt ;
         httpContext.ajax_rsp_assign_attri("", false, "A847UltLinEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A847UltLinEnt), 4, 0));
         Z396EmprCod = A396EmprCod ;
         Z719PrdNum = A719PrdNum ;
         sMode29 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load1SH29( ) ;
         if ( AnyError == 1 )
         {
            RcdFound29 = (short)(0) ;
            initializeNonKey1SH29( ) ;
         }
         Gx_mode = sMode29 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound29 = (short)(0) ;
         initializeNonKey1SH29( ) ;
         sMode29 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode29 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(7);
   }

   public void getEqualNoModal( )
   {
      getKey1SH29( ) ;
      if ( RcdFound29 == 0 )
      {
      }
      else
      {
      }
      getByPrimaryKey( ) ;
   }

   public void move_next( )
   {
      RcdFound29 = (short)(0) ;
      /* Using cursor T01SH21 */
      pr_default.execute(16, new Object[] {A396EmprCod, A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
      if ( (pr_default.getStatus(16) != 101) )
      {
         while ( (pr_default.getStatus(16) != 101) && ( ( GXutil.strcmp(T01SH21_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01SH21_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01SH21_A719PrdNum[0], A719PrdNum) < 0 ) ) )
         {
            pr_default.readNext(16);
         }
         if ( (pr_default.getStatus(16) != 101) && ( ( GXutil.strcmp(T01SH21_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01SH21_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01SH21_A719PrdNum[0], A719PrdNum) > 0 ) ) )
         {
            A396EmprCod = T01SH21_A396EmprCod[0] ;
            A719PrdNum = T01SH21_A719PrdNum[0] ;
            n719PrdNum = T01SH21_n719PrdNum[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
            RcdFound29 = (short)(1) ;
         }
      }
      pr_default.close(16);
   }

   public void move_previous( )
   {
      RcdFound29 = (short)(0) ;
      /* Using cursor T01SH22 */
      pr_default.execute(17, new Object[] {A396EmprCod, A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
      if ( (pr_default.getStatus(17) != 101) )
      {
         while ( (pr_default.getStatus(17) != 101) && ( ( GXutil.strcmp(T01SH22_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01SH22_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01SH22_A719PrdNum[0], A719PrdNum) > 0 ) ) )
         {
            pr_default.readNext(17);
         }
         if ( (pr_default.getStatus(17) != 101) && ( ( GXutil.strcmp(T01SH22_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01SH22_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01SH22_A719PrdNum[0], A719PrdNum) < 0 ) ) )
         {
            A396EmprCod = T01SH22_A396EmprCod[0] ;
            A719PrdNum = T01SH22_A719PrdNum[0] ;
            n719PrdNum = T01SH22_n719PrdNum[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
            RcdFound29 = (short)(1) ;
         }
      }
      pr_default.close(17);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1SH29( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         A724PrdPreAct = O724PrdPreAct ;
         httpContext.ajax_rsp_assign_attri("", false, "A724PrdPreAct", GXutil.ltrimstr( A724PrdPreAct, 14, 5));
         A704PrdExiAlm = O704PrdExiAlm ;
         httpContext.ajax_rsp_assign_attri("", false, "A704PrdExiAlm", GXutil.ltrimstr( A704PrdExiAlm, 12, 4));
         A750PrdValStk = O750PrdValStk ;
         httpContext.ajax_rsp_assign_attri("", false, "A750PrdValStk", GXutil.ltrimstr( A750PrdValStk, 11, 2));
         A847UltLinEnt = O847UltLinEnt ;
         httpContext.ajax_rsp_assign_attri("", false, "A847UltLinEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A847UltLinEnt), 4, 0));
         AV44PedPri = OV44PedPri ;
         httpContext.ajax_rsp_assign_attri("", false, "AV44PedPri", AV44PedPri);
         A713PrdFulEnt = O713PrdFulEnt ;
         httpContext.ajax_rsp_assign_attri("", false, "A713PrdFulEnt", localUtil.format(A713PrdFulEnt, "99/99/99"));
         A709PrdFecPre = O709PrdFecPre ;
         httpContext.ajax_rsp_assign_attri("", false, "A709PrdFecPre", localUtil.format(A709PrdFecPre, "99/99/99"));
         A684PrdCanPen = O684PrdCanPen ;
         httpContext.ajax_rsp_assign_attri("", false, "A684PrdCanPen", GXutil.ltrimstr( A684PrdCanPen, 12, 4));
         A14040PrdUltMovF = O14040PrdUltMovF ;
         httpContext.ajax_rsp_assign_attri("", false, "A14040PrdUltMovF", localUtil.format(A14040PrdUltMovF, "99/99/99"));
         AV40OldExiAlm = OV40OldExiAlm ;
         httpContext.ajax_rsp_assign_attri("", false, "AV40OldExiAlm", GXutil.ltrimstr( AV40OldExiAlm, 12, 4));
         A726PrdPreMed = O726PrdPreMed ;
         httpContext.ajax_rsp_assign_attri("", false, "A726PrdPreMed", GXutil.ltrimstr( A726PrdPreMed, 14, 5));
         A725PrdPreAnt = O725PrdPreAnt ;
         httpContext.ajax_rsp_assign_attri("", false, "A725PrdPreAnt", GXutil.ltrimstr( A725PrdPreAnt, 14, 5));
         insert1SH29( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound29 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A719PrdNum, Z719PrdNum) != 0 ) )
            {
               A396EmprCod = Z396EmprCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
               A719PrdNum = Z719PrdNum ;
               n719PrdNum = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "PRDNUM");
               AnyError = (short)(1) ;
               GX_FocusControl = edtPrdNum_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               A724PrdPreAct = O724PrdPreAct ;
               httpContext.ajax_rsp_assign_attri("", false, "A724PrdPreAct", GXutil.ltrimstr( A724PrdPreAct, 14, 5));
               A704PrdExiAlm = O704PrdExiAlm ;
               httpContext.ajax_rsp_assign_attri("", false, "A704PrdExiAlm", GXutil.ltrimstr( A704PrdExiAlm, 12, 4));
               A750PrdValStk = O750PrdValStk ;
               httpContext.ajax_rsp_assign_attri("", false, "A750PrdValStk", GXutil.ltrimstr( A750PrdValStk, 11, 2));
               A847UltLinEnt = O847UltLinEnt ;
               httpContext.ajax_rsp_assign_attri("", false, "A847UltLinEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A847UltLinEnt), 4, 0));
               AV44PedPri = OV44PedPri ;
               httpContext.ajax_rsp_assign_attri("", false, "AV44PedPri", AV44PedPri);
               A713PrdFulEnt = O713PrdFulEnt ;
               httpContext.ajax_rsp_assign_attri("", false, "A713PrdFulEnt", localUtil.format(A713PrdFulEnt, "99/99/99"));
               A709PrdFecPre = O709PrdFecPre ;
               httpContext.ajax_rsp_assign_attri("", false, "A709PrdFecPre", localUtil.format(A709PrdFecPre, "99/99/99"));
               A684PrdCanPen = O684PrdCanPen ;
               httpContext.ajax_rsp_assign_attri("", false, "A684PrdCanPen", GXutil.ltrimstr( A684PrdCanPen, 12, 4));
               A14040PrdUltMovF = O14040PrdUltMovF ;
               httpContext.ajax_rsp_assign_attri("", false, "A14040PrdUltMovF", localUtil.format(A14040PrdUltMovF, "99/99/99"));
               AV40OldExiAlm = OV40OldExiAlm ;
               httpContext.ajax_rsp_assign_attri("", false, "AV40OldExiAlm", GXutil.ltrimstr( AV40OldExiAlm, 12, 4));
               A726PrdPreMed = O726PrdPreMed ;
               httpContext.ajax_rsp_assign_attri("", false, "A726PrdPreMed", GXutil.ltrimstr( A726PrdPreMed, 14, 5));
               A725PrdPreAnt = O725PrdPreAnt ;
               httpContext.ajax_rsp_assign_attri("", false, "A725PrdPreAnt", GXutil.ltrimstr( A725PrdPreAnt, 14, 5));
               delete( ) ;
               afterTrn( ) ;
            }
            else
            {
               /* Update record */
               A724PrdPreAct = O724PrdPreAct ;
               httpContext.ajax_rsp_assign_attri("", false, "A724PrdPreAct", GXutil.ltrimstr( A724PrdPreAct, 14, 5));
               A704PrdExiAlm = O704PrdExiAlm ;
               httpContext.ajax_rsp_assign_attri("", false, "A704PrdExiAlm", GXutil.ltrimstr( A704PrdExiAlm, 12, 4));
               A750PrdValStk = O750PrdValStk ;
               httpContext.ajax_rsp_assign_attri("", false, "A750PrdValStk", GXutil.ltrimstr( A750PrdValStk, 11, 2));
               A847UltLinEnt = O847UltLinEnt ;
               httpContext.ajax_rsp_assign_attri("", false, "A847UltLinEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A847UltLinEnt), 4, 0));
               AV44PedPri = OV44PedPri ;
               httpContext.ajax_rsp_assign_attri("", false, "AV44PedPri", AV44PedPri);
               A713PrdFulEnt = O713PrdFulEnt ;
               httpContext.ajax_rsp_assign_attri("", false, "A713PrdFulEnt", localUtil.format(A713PrdFulEnt, "99/99/99"));
               A709PrdFecPre = O709PrdFecPre ;
               httpContext.ajax_rsp_assign_attri("", false, "A709PrdFecPre", localUtil.format(A709PrdFecPre, "99/99/99"));
               A684PrdCanPen = O684PrdCanPen ;
               httpContext.ajax_rsp_assign_attri("", false, "A684PrdCanPen", GXutil.ltrimstr( A684PrdCanPen, 12, 4));
               A14040PrdUltMovF = O14040PrdUltMovF ;
               httpContext.ajax_rsp_assign_attri("", false, "A14040PrdUltMovF", localUtil.format(A14040PrdUltMovF, "99/99/99"));
               AV40OldExiAlm = OV40OldExiAlm ;
               httpContext.ajax_rsp_assign_attri("", false, "AV40OldExiAlm", GXutil.ltrimstr( AV40OldExiAlm, 12, 4));
               A726PrdPreMed = O726PrdPreMed ;
               httpContext.ajax_rsp_assign_attri("", false, "A726PrdPreMed", GXutil.ltrimstr( A726PrdPreMed, 14, 5));
               A725PrdPreAnt = O725PrdPreAnt ;
               httpContext.ajax_rsp_assign_attri("", false, "A725PrdPreAnt", GXutil.ltrimstr( A725PrdPreAnt, 14, 5));
               update1SH29( ) ;
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A719PrdNum, Z719PrdNum) != 0 ) )
            {
               /* Insert record */
               A724PrdPreAct = O724PrdPreAct ;
               httpContext.ajax_rsp_assign_attri("", false, "A724PrdPreAct", GXutil.ltrimstr( A724PrdPreAct, 14, 5));
               A704PrdExiAlm = O704PrdExiAlm ;
               httpContext.ajax_rsp_assign_attri("", false, "A704PrdExiAlm", GXutil.ltrimstr( A704PrdExiAlm, 12, 4));
               A750PrdValStk = O750PrdValStk ;
               httpContext.ajax_rsp_assign_attri("", false, "A750PrdValStk", GXutil.ltrimstr( A750PrdValStk, 11, 2));
               A847UltLinEnt = O847UltLinEnt ;
               httpContext.ajax_rsp_assign_attri("", false, "A847UltLinEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A847UltLinEnt), 4, 0));
               AV44PedPri = OV44PedPri ;
               httpContext.ajax_rsp_assign_attri("", false, "AV44PedPri", AV44PedPri);
               A713PrdFulEnt = O713PrdFulEnt ;
               httpContext.ajax_rsp_assign_attri("", false, "A713PrdFulEnt", localUtil.format(A713PrdFulEnt, "99/99/99"));
               A709PrdFecPre = O709PrdFecPre ;
               httpContext.ajax_rsp_assign_attri("", false, "A709PrdFecPre", localUtil.format(A709PrdFecPre, "99/99/99"));
               A684PrdCanPen = O684PrdCanPen ;
               httpContext.ajax_rsp_assign_attri("", false, "A684PrdCanPen", GXutil.ltrimstr( A684PrdCanPen, 12, 4));
               A14040PrdUltMovF = O14040PrdUltMovF ;
               httpContext.ajax_rsp_assign_attri("", false, "A14040PrdUltMovF", localUtil.format(A14040PrdUltMovF, "99/99/99"));
               AV40OldExiAlm = OV40OldExiAlm ;
               httpContext.ajax_rsp_assign_attri("", false, "AV40OldExiAlm", GXutil.ltrimstr( AV40OldExiAlm, 12, 4));
               A726PrdPreMed = O726PrdPreMed ;
               httpContext.ajax_rsp_assign_attri("", false, "A726PrdPreMed", GXutil.ltrimstr( A726PrdPreMed, 14, 5));
               A725PrdPreAnt = O725PrdPreAnt ;
               httpContext.ajax_rsp_assign_attri("", false, "A725PrdPreAnt", GXutil.ltrimstr( A725PrdPreAnt, 14, 5));
               insert1SH29( ) ;
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
                  A724PrdPreAct = O724PrdPreAct ;
                  httpContext.ajax_rsp_assign_attri("", false, "A724PrdPreAct", GXutil.ltrimstr( A724PrdPreAct, 14, 5));
                  A704PrdExiAlm = O704PrdExiAlm ;
                  httpContext.ajax_rsp_assign_attri("", false, "A704PrdExiAlm", GXutil.ltrimstr( A704PrdExiAlm, 12, 4));
                  A750PrdValStk = O750PrdValStk ;
                  httpContext.ajax_rsp_assign_attri("", false, "A750PrdValStk", GXutil.ltrimstr( A750PrdValStk, 11, 2));
                  A847UltLinEnt = O847UltLinEnt ;
                  httpContext.ajax_rsp_assign_attri("", false, "A847UltLinEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A847UltLinEnt), 4, 0));
                  AV44PedPri = OV44PedPri ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV44PedPri", AV44PedPri);
                  A713PrdFulEnt = O713PrdFulEnt ;
                  httpContext.ajax_rsp_assign_attri("", false, "A713PrdFulEnt", localUtil.format(A713PrdFulEnt, "99/99/99"));
                  A709PrdFecPre = O709PrdFecPre ;
                  httpContext.ajax_rsp_assign_attri("", false, "A709PrdFecPre", localUtil.format(A709PrdFecPre, "99/99/99"));
                  A684PrdCanPen = O684PrdCanPen ;
                  httpContext.ajax_rsp_assign_attri("", false, "A684PrdCanPen", GXutil.ltrimstr( A684PrdCanPen, 12, 4));
                  A14040PrdUltMovF = O14040PrdUltMovF ;
                  httpContext.ajax_rsp_assign_attri("", false, "A14040PrdUltMovF", localUtil.format(A14040PrdUltMovF, "99/99/99"));
                  AV40OldExiAlm = OV40OldExiAlm ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV40OldExiAlm", GXutil.ltrimstr( AV40OldExiAlm, 12, 4));
                  A726PrdPreMed = O726PrdPreMed ;
                  httpContext.ajax_rsp_assign_attri("", false, "A726PrdPreMed", GXutil.ltrimstr( A726PrdPreMed, 14, 5));
                  A725PrdPreAnt = O725PrdPreAnt ;
                  httpContext.ajax_rsp_assign_attri("", false, "A725PrdPreAnt", GXutil.ltrimstr( A725PrdPreAnt, 14, 5));
                  insert1SH29( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A719PrdNum, Z719PrdNum) != 0 ) )
      {
         A396EmprCod = Z396EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A719PrdNum = Z719PrdNum ;
         n719PrdNum = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "PRDNUM");
         AnyError = (short)(1) ;
         GX_FocusControl = edtPrdNum_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         A724PrdPreAct = O724PrdPreAct ;
         httpContext.ajax_rsp_assign_attri("", false, "A724PrdPreAct", GXutil.ltrimstr( A724PrdPreAct, 14, 5));
         A704PrdExiAlm = O704PrdExiAlm ;
         httpContext.ajax_rsp_assign_attri("", false, "A704PrdExiAlm", GXutil.ltrimstr( A704PrdExiAlm, 12, 4));
         A750PrdValStk = O750PrdValStk ;
         httpContext.ajax_rsp_assign_attri("", false, "A750PrdValStk", GXutil.ltrimstr( A750PrdValStk, 11, 2));
         A847UltLinEnt = O847UltLinEnt ;
         httpContext.ajax_rsp_assign_attri("", false, "A847UltLinEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A847UltLinEnt), 4, 0));
         AV44PedPri = OV44PedPri ;
         httpContext.ajax_rsp_assign_attri("", false, "AV44PedPri", AV44PedPri);
         A713PrdFulEnt = O713PrdFulEnt ;
         httpContext.ajax_rsp_assign_attri("", false, "A713PrdFulEnt", localUtil.format(A713PrdFulEnt, "99/99/99"));
         A709PrdFecPre = O709PrdFecPre ;
         httpContext.ajax_rsp_assign_attri("", false, "A709PrdFecPre", localUtil.format(A709PrdFecPre, "99/99/99"));
         A684PrdCanPen = O684PrdCanPen ;
         httpContext.ajax_rsp_assign_attri("", false, "A684PrdCanPen", GXutil.ltrimstr( A684PrdCanPen, 12, 4));
         A14040PrdUltMovF = O14040PrdUltMovF ;
         httpContext.ajax_rsp_assign_attri("", false, "A14040PrdUltMovF", localUtil.format(A14040PrdUltMovF, "99/99/99"));
         AV40OldExiAlm = OV40OldExiAlm ;
         httpContext.ajax_rsp_assign_attri("", false, "AV40OldExiAlm", GXutil.ltrimstr( AV40OldExiAlm, 12, 4));
         A726PrdPreMed = O726PrdPreMed ;
         httpContext.ajax_rsp_assign_attri("", false, "A726PrdPreMed", GXutil.ltrimstr( A726PrdPreMed, 14, 5));
         A725PrdPreAnt = O725PrdPreAnt ;
         httpContext.ajax_rsp_assign_attri("", false, "A725PrdPreAnt", GXutil.ltrimstr( A725PrdPreAnt, 14, 5));
         delete( ) ;
         afterTrn( ) ;
      }
      if ( AnyError != 0 )
      {
      }
   }

   public void checkOptimisticConcurrency1SH29( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01SH9 */
         pr_default.execute(6, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(6) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPPRODUC"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(6) == 101) || ( DecimalUtil.compareTo(Z726PrdPreMed, T01SH9_A726PrdPreMed[0]) != 0 ) || ( DecimalUtil.compareTo(Z725PrdPreAnt, T01SH9_A725PrdPreAnt[0]) != 0 ) || ( GXutil.strcmp(Z718PrdNom, T01SH9_A718PrdNom[0]) != 0 ) || ( DecimalUtil.compareTo(Z724PrdPreAct, T01SH9_A724PrdPreAct[0]) != 0 ) || ( DecimalUtil.compareTo(Z704PrdExiAlm, T01SH9_A704PrdExiAlm[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z847UltLinEnt != T01SH9_A847UltLinEnt[0] ) || ( GXutil.strcmp(Z698PrdDetPar, T01SH9_A698PrdDetPar[0]) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(Z713PrdFulEnt), GXutil.resetTime(T01SH9_A713PrdFulEnt[0])) ) || ( DecimalUtil.compareTo(Z684PrdCanPen, T01SH9_A684PrdCanPen[0]) != 0 ) || ( DecimalUtil.compareTo(Z729PrdRotRea, T01SH9_A729PrdRotRea[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z727PrdRec, T01SH9_A727PrdRec[0]) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(Z709PrdFecPre), GXutil.resetTime(T01SH9_A709PrdFecPre[0])) ) || ( DecimalUtil.compareTo(Z5255PrdPreAc2, T01SH9_A5255PrdPreAc2[0]) != 0 ) || ( DecimalUtil.compareTo(Z750PrdValStk, T01SH9_A750PrdValStk[0]) != 0 ) || ( DecimalUtil.compareTo(Z705PrdExiCC, T01SH9_A705PrdExiCC[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z795PrvNum != T01SH9_A795PrvNum[0] ) || ( Z856ValCod != T01SH9_A856ValCod[0] ) )
         {
            if ( DecimalUtil.compareTo(Z726PrdPreMed, T01SH9_A726PrdPreMed[0]) != 0 )
            {
               GXutil.writeLogln("entradaproducto:[seudo value changed for attri]"+"PrdPreMed");
               GXutil.writeLogRaw("Old: ",Z726PrdPreMed);
               GXutil.writeLogRaw("Current: ",T01SH9_A726PrdPreMed[0]);
            }
            if ( DecimalUtil.compareTo(Z725PrdPreAnt, T01SH9_A725PrdPreAnt[0]) != 0 )
            {
               GXutil.writeLogln("entradaproducto:[seudo value changed for attri]"+"PrdPreAnt");
               GXutil.writeLogRaw("Old: ",Z725PrdPreAnt);
               GXutil.writeLogRaw("Current: ",T01SH9_A725PrdPreAnt[0]);
            }
            if ( GXutil.strcmp(Z718PrdNom, T01SH9_A718PrdNom[0]) != 0 )
            {
               GXutil.writeLogln("entradaproducto:[seudo value changed for attri]"+"PrdNom");
               GXutil.writeLogRaw("Old: ",Z718PrdNom);
               GXutil.writeLogRaw("Current: ",T01SH9_A718PrdNom[0]);
            }
            if ( DecimalUtil.compareTo(Z724PrdPreAct, T01SH9_A724PrdPreAct[0]) != 0 )
            {
               GXutil.writeLogln("entradaproducto:[seudo value changed for attri]"+"PrdPreAct");
               GXutil.writeLogRaw("Old: ",Z724PrdPreAct);
               GXutil.writeLogRaw("Current: ",T01SH9_A724PrdPreAct[0]);
            }
            if ( DecimalUtil.compareTo(Z704PrdExiAlm, T01SH9_A704PrdExiAlm[0]) != 0 )
            {
               GXutil.writeLogln("entradaproducto:[seudo value changed for attri]"+"PrdExiAlm");
               GXutil.writeLogRaw("Old: ",Z704PrdExiAlm);
               GXutil.writeLogRaw("Current: ",T01SH9_A704PrdExiAlm[0]);
            }
            if ( Z847UltLinEnt != T01SH9_A847UltLinEnt[0] )
            {
               GXutil.writeLogln("entradaproducto:[seudo value changed for attri]"+"UltLinEnt");
               GXutil.writeLogRaw("Old: ",Z847UltLinEnt);
               GXutil.writeLogRaw("Current: ",T01SH9_A847UltLinEnt[0]);
            }
            if ( GXutil.strcmp(Z698PrdDetPar, T01SH9_A698PrdDetPar[0]) != 0 )
            {
               GXutil.writeLogln("entradaproducto:[seudo value changed for attri]"+"PrdDetPar");
               GXutil.writeLogRaw("Old: ",Z698PrdDetPar);
               GXutil.writeLogRaw("Current: ",T01SH9_A698PrdDetPar[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z713PrdFulEnt), GXutil.resetTime(T01SH9_A713PrdFulEnt[0])) ) )
            {
               GXutil.writeLogln("entradaproducto:[seudo value changed for attri]"+"PrdFulEnt");
               GXutil.writeLogRaw("Old: ",Z713PrdFulEnt);
               GXutil.writeLogRaw("Current: ",T01SH9_A713PrdFulEnt[0]);
            }
            if ( DecimalUtil.compareTo(Z684PrdCanPen, T01SH9_A684PrdCanPen[0]) != 0 )
            {
               GXutil.writeLogln("entradaproducto:[seudo value changed for attri]"+"PrdCanPen");
               GXutil.writeLogRaw("Old: ",Z684PrdCanPen);
               GXutil.writeLogRaw("Current: ",T01SH9_A684PrdCanPen[0]);
            }
            if ( DecimalUtil.compareTo(Z729PrdRotRea, T01SH9_A729PrdRotRea[0]) != 0 )
            {
               GXutil.writeLogln("entradaproducto:[seudo value changed for attri]"+"PrdRotRea");
               GXutil.writeLogRaw("Old: ",Z729PrdRotRea);
               GXutil.writeLogRaw("Current: ",T01SH9_A729PrdRotRea[0]);
            }
            if ( GXutil.strcmp(Z727PrdRec, T01SH9_A727PrdRec[0]) != 0 )
            {
               GXutil.writeLogln("entradaproducto:[seudo value changed for attri]"+"PrdRec");
               GXutil.writeLogRaw("Old: ",Z727PrdRec);
               GXutil.writeLogRaw("Current: ",T01SH9_A727PrdRec[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z709PrdFecPre), GXutil.resetTime(T01SH9_A709PrdFecPre[0])) ) )
            {
               GXutil.writeLogln("entradaproducto:[seudo value changed for attri]"+"PrdFecPre");
               GXutil.writeLogRaw("Old: ",Z709PrdFecPre);
               GXutil.writeLogRaw("Current: ",T01SH9_A709PrdFecPre[0]);
            }
            if ( DecimalUtil.compareTo(Z5255PrdPreAc2, T01SH9_A5255PrdPreAc2[0]) != 0 )
            {
               GXutil.writeLogln("entradaproducto:[seudo value changed for attri]"+"PrdPreAc2");
               GXutil.writeLogRaw("Old: ",Z5255PrdPreAc2);
               GXutil.writeLogRaw("Current: ",T01SH9_A5255PrdPreAc2[0]);
            }
            if ( DecimalUtil.compareTo(Z750PrdValStk, T01SH9_A750PrdValStk[0]) != 0 )
            {
               GXutil.writeLogln("entradaproducto:[seudo value changed for attri]"+"PrdValStk");
               GXutil.writeLogRaw("Old: ",Z750PrdValStk);
               GXutil.writeLogRaw("Current: ",T01SH9_A750PrdValStk[0]);
            }
            if ( DecimalUtil.compareTo(Z705PrdExiCC, T01SH9_A705PrdExiCC[0]) != 0 )
            {
               GXutil.writeLogln("entradaproducto:[seudo value changed for attri]"+"PrdExiCC");
               GXutil.writeLogRaw("Old: ",Z705PrdExiCC);
               GXutil.writeLogRaw("Current: ",T01SH9_A705PrdExiCC[0]);
            }
            if ( Z795PrvNum != T01SH9_A795PrvNum[0] )
            {
               GXutil.writeLogln("entradaproducto:[seudo value changed for attri]"+"PrvNum");
               GXutil.writeLogRaw("Old: ",Z795PrvNum);
               GXutil.writeLogRaw("Current: ",T01SH9_A795PrvNum[0]);
            }
            if ( Z856ValCod != T01SH9_A856ValCod[0] )
            {
               GXutil.writeLogln("entradaproducto:[seudo value changed for attri]"+"ValCod");
               GXutil.writeLogRaw("Old: ",Z856ValCod);
               GXutil.writeLogRaw("Current: ",T01SH9_A856ValCod[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPPRODUC"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1SH29( )
   {
      beforeValidate1SH29( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1SH29( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1SH29( 0) ;
         checkOptimisticConcurrency1SH29( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1SH29( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1SH29( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01SH23 */
                  pr_default.execute(18, new Object[] {Boolean.valueOf(n719PrdNum), A719PrdNum, A726PrdPreMed, A725PrdPreAnt, A718PrdNom, A724PrdPreAct, A704PrdExiAlm, Short.valueOf(A847UltLinEnt), A698PrdDetPar, A713PrdFulEnt, A684PrdCanPen, A729PrdRotRea, A727PrdRec, A709PrdFecPre, A5255PrdPreAc2, A750PrdValStk, A705PrdExiCC, A396EmprCod, Integer.valueOf(A795PrvNum), Byte.valueOf(A856ValCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPRODUC");
                  if ( (pr_default.getStatus(18) == 1) )
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
                        processLevel1SH29( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption1SH0( ) ;
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
            load1SH29( ) ;
         }
         endLevel1SH29( ) ;
      }
      closeExtendedTableCursors1SH29( ) ;
   }

   public void update1SH29( )
   {
      beforeValidate1SH29( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1SH29( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1SH29( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1SH29( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1SH29( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01SH24 */
                  pr_default.execute(19, new Object[] {A726PrdPreMed, A725PrdPreAnt, A718PrdNom, A724PrdPreAct, A704PrdExiAlm, Short.valueOf(A847UltLinEnt), A698PrdDetPar, A713PrdFulEnt, A684PrdCanPen, A729PrdRotRea, A727PrdRec, A709PrdFecPre, A5255PrdPreAc2, A750PrdValStk, A705PrdExiCC, Integer.valueOf(A795PrvNum), Byte.valueOf(A856ValCod), A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPRODUC");
                  if ( (pr_default.getStatus(19) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPPRODUC"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1SH29( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel1SH29( ) ;
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
         endLevel1SH29( ) ;
      }
      closeExtendedTableCursors1SH29( ) ;
   }

   public void deferredUpdate1SH29( )
   {
   }

   public void delete( )
   {
      beforeValidate1SH29( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1SH29( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1SH29( ) ;
         afterConfirm1SH29( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1SH29( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01SH25 */
               pr_default.execute(20, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPRODUC");
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
      sMode29 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1SH29( ) ;
      Gx_mode = sMode29 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1SH29( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         AV40OldExiAlm = O704PrdExiAlm ;
         httpContext.ajax_rsp_assign_attri("", false, "AV40OldExiAlm", GXutil.ltrimstr( AV40OldExiAlm, 12, 4));
         /* Using cursor T01SH26 */
         pr_default.execute(21, new Object[] {A396EmprCod, Integer.valueOf(A795PrvNum)});
         A794PrvNom = T01SH26_A794PrvNom[0] ;
         n794PrvNom = T01SH26_n794PrvNom[0] ;
         A800PrvPri = T01SH26_A800PrvPri[0] ;
         n800PrvPri = T01SH26_n800PrvPri[0] ;
         pr_default.close(21);
         AV44PedPri = GXutil.str( A800PrvPri, 1, 0) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV44PedPri", AV44PedPri);
         /* Using cursor T01SH28 */
         pr_default.execute(22, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(22) != 101) )
         {
            A913StockRem = T01SH28_A913StockRem[0] ;
            n913StockRem = T01SH28_n913StockRem[0] ;
         }
         else
         {
            A913StockRem = DecimalUtil.doubleToDec(0) ;
            n913StockRem = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A913StockRem", GXutil.ltrimstr( A913StockRem, 12, 4));
         }
         pr_default.close(22);
         GXt_date10 = A14040PrdUltMovF ;
         GXv_char4[0] = A396EmprCod ;
         GXv_char3[0] = A719PrdNum ;
         GXv_date11[0] = GXt_date10 ;
         new app.pstm005(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_date11) ;
         entradaproducto_impl.this.A396EmprCod = GXv_char4[0] ;
         entradaproducto_impl.this.A719PrdNum = GXv_char3[0] ;
         entradaproducto_impl.this.GXt_date10 = GXv_date11[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         A14040PrdUltMovF = GXt_date10 ;
         httpContext.ajax_rsp_assign_attri("", false, "A14040PrdUltMovF", localUtil.format(A14040PrdUltMovF, "99/99/99"));
         GXt_date10 = A3835UltFecCCs ;
         GXv_char4[0] = A396EmprCod ;
         GXv_char3[0] = A719PrdNum ;
         GXv_date11[0] = GXt_date10 ;
         new app.pstm005(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_date11) ;
         entradaproducto_impl.this.A396EmprCod = GXv_char4[0] ;
         entradaproducto_impl.this.A719PrdNum = GXv_char3[0] ;
         entradaproducto_impl.this.GXt_date10 = GXv_date11[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         A3835UltFecCCs = GXt_date10 ;
         httpContext.ajax_rsp_assign_attri("", false, "A3835UltFecCCs", localUtil.format(A3835UltFecCCs, "99/99/99"));
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T01SH29 */
         pr_default.execute(23, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(23) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PrdNor", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(23);
         /* Using cursor T01SH30 */
         pr_default.execute(24, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(24) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Sustancias a controlar en Thelist", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(24);
         /* Using cursor T01SH31 */
         pr_default.execute(25, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(25) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Colorantes o Productos", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(25);
         /* Using cursor T01SH32 */
         pr_default.execute(26, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(26) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Productos", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(26);
         /* Using cursor T01SH33 */
         pr_default.execute(27, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(27) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Pastas", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(27);
         /* Using cursor T01SH34 */
         pr_default.execute(28, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(28) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level2", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(28);
         /* Using cursor T01SH35 */
         pr_default.execute(29, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(29) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Productos", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(29);
         /* Using cursor T01SH36 */
         pr_default.execute(30, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(30) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(30);
         /* Using cursor T01SH37 */
         pr_default.execute(31, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(31) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(31);
         /* Using cursor T01SH38 */
         pr_default.execute(32, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(32) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(32);
         /* Using cursor T01SH39 */
         pr_default.execute(33, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(33) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Disolucion Quimicos", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(33);
         /* Using cursor T01SH40 */
         pr_default.execute(34, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(34) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Detalle Productos", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(34);
         /* Using cursor T01SH41 */
         pr_default.execute(35, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(35) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LOTES PRODUCTOS QUIMICOS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(35);
         /* Using cursor T01SH42 */
         pr_default.execute(36, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(36) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DEVOLUCION COMPRAS (Lineas)", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(36);
         /* Using cursor T01SH43 */
         pr_default.execute(37, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(37) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LINEAS ENSAYO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(37);
         /* Using cursor T01SH44 */
         pr_default.execute(38, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(38) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "lreest", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(38);
         /* Using cursor T01SH45 */
         pr_default.execute(39, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(39) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Lineas Productos Especiales Es", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(39);
         /* Using cursor T01SH46 */
         pr_default.execute(40, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(40) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Lineas productos estampacion", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(40);
         /* Using cursor T01SH47 */
         pr_default.execute(41, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(41) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(41);
         /* Using cursor T01SH48 */
         pr_default.execute(42, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(42) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(42);
         /* Using cursor T01SH49 */
         pr_default.execute(43, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(43) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HISTORICO MOV PRODUCTOS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(43);
         /* Using cursor T01SH50 */
         pr_default.execute(44, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(44) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(44);
         /* Using cursor T01SH51 */
         pr_default.execute(45, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(45) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(45);
         /* Using cursor T01SH52 */
         pr_default.execute(46, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(46) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(46);
         /* Using cursor T01SH53 */
         pr_default.execute(47, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(47) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "JOTA01", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(47);
         /* Using cursor T01SH54 */
         pr_default.execute(48, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(48) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "BANYO1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(48);
         /* Using cursor T01SH55 */
         pr_default.execute(49, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(49) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ZEPHYR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(49);
         /* Using cursor T01SH56 */
         pr_default.execute(50, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(50) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PRDTB2", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(50);
         /* Using cursor T01SH57 */
         pr_default.execute(51, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(51) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PRDCERTI", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(51);
         /* Using cursor T01SH58 */
         pr_default.execute(52, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(52) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HISOE4", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(52);
         /* Using cursor T01SH59 */
         pr_default.execute(53, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(53) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HISOE2", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(53);
         /* Using cursor T01SH60 */
         pr_default.execute(54, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(54) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "MAKEP1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(54);
         /* Using cursor T01SH61 */
         pr_default.execute(55, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(55) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PRDALMC", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(55);
         /* Using cursor T01SH62 */
         pr_default.execute(56, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(56) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ALMCONS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(56);
         /* Using cursor T01SH63 */
         pr_default.execute(57, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(57) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "MATPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(57);
         /* Using cursor T01SH64 */
         pr_default.execute(58, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(58) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PETCC1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(58);
         /* Using cursor T01SH65 */
         pr_default.execute(59, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(59) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "INVPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(59);
         /* Using cursor T01SH66 */
         pr_default.execute(60, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(60) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "INSEST", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(60);
         /* Using cursor T01SH67 */
         pr_default.execute(61, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(61) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "FORLISs", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(61);
         /* Using cursor T01SH68 */
         pr_default.execute(62, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(62) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ALMVI1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(62);
         /* Using cursor T01SH69 */
         pr_default.execute(63, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(63) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ENS007", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(63);
         /* Using cursor T01SH70 */
         pr_default.execute(64, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(64) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PRESO1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(64);
         /* Using cursor T01SH71 */
         pr_default.execute(65, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(65) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PROPRV", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(65);
         /* Using cursor T01SH72 */
         pr_default.execute(66, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(66) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PRDSUS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(66);
         /* Using cursor T01SH73 */
         pr_default.execute(67, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(67) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ENSPR1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(67);
         /* Using cursor T01SH74 */
         pr_default.execute(68, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(68) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TXPENS004", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(68);
         /* Using cursor T01SH75 */
         pr_default.execute(69, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(69) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TXPENS003", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(69);
         /* Using cursor T01SH76 */
         pr_default.execute(70, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(70) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "EstSo1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(70);
         /* Using cursor T01SH77 */
         pr_default.execute(71, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(71) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PRERLN", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(71);
         /* Using cursor T01SH78 */
         pr_default.execute(72, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(72) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HISTORICO RECETAS (Lineas)", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(72);
         /* Using cursor T01SH79 */
         pr_default.execute(73, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(73) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HISREA", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(73);
         /* Using cursor T01SH80 */
         pr_default.execute(74, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(74) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Formula Color Estampación", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(74);
         /* Using cursor T01SH81 */
         pr_default.execute(75, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(75) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "RECDEP", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(75);
         /* Using cursor T01SH82 */
         pr_default.execute(76, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(76) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "RECPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(76);
         /* Using cursor T01SH83 */
         pr_default.execute(77, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(77) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LPASTA", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(77);
         /* Using cursor T01SH84 */
         pr_default.execute(78, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(78) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HISCOL", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(78);
         /* Using cursor T01SH85 */
         pr_default.execute(79, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(79) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "RECPR2", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(79);
         /* Using cursor T01SH86 */
         pr_default.execute(80, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(80) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CCSTKS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(80);
         /* Using cursor T01SH87 */
         pr_default.execute(81, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(81) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HISMAC", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(81);
         /* Using cursor T01SH88 */
         pr_default.execute(82, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(82) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LANYAD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(82);
         /* Using cursor T01SH89 */
         pr_default.execute(83, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(83) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LRECET", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(83);
         /* Using cursor T01SH90 */
         pr_default.execute(84, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(84) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "BARDOS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(84);
         /* Using cursor T01SH91 */
         pr_default.execute(85, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(85) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LENLAB", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(85);
         /* Using cursor T01SH92 */
         pr_default.execute(86, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(86) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ESCMAN", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(86);
         /* Using cursor T01SH93 */
         pr_default.execute(87, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(87) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TXPLCUMCO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(87);
         /* Using cursor T01SH94 */
         pr_default.execute(88, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(88) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "RECUEN", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(88);
         /* Using cursor T01SH95 */
         pr_default.execute(89, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(89) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LPRFOR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(89);
         /* Using cursor T01SH96 */
         pr_default.execute(90, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(90) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CPRDES", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(90);
         /* Using cursor T01SH97 */
         pr_default.execute(91, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(91) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LPRDCO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(91);
         /* Using cursor T01SH98 */
         pr_default.execute(92, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(92) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PRDALT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(92);
         /* Using cursor T01SH99 */
         pr_default.execute(93, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(93) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LPEDID", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(93);
         /* Using cursor T01SH100 */
         pr_default.execute(94, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(94) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LDFORM", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(94);
         /* Using cursor T01SH101 */
         pr_default.execute(95, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(95) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DETCON", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(95);
      }
   }

   public void processNestedLevel1SH42( )
   {
      s724PrdPreAct = O724PrdPreAct ;
      httpContext.ajax_rsp_assign_attri("", false, "A724PrdPreAct", GXutil.ltrimstr( A724PrdPreAct, 14, 5));
      s704PrdExiAlm = O704PrdExiAlm ;
      httpContext.ajax_rsp_assign_attri("", false, "A704PrdExiAlm", GXutil.ltrimstr( A704PrdExiAlm, 12, 4));
      s750PrdValStk = O750PrdValStk ;
      httpContext.ajax_rsp_assign_attri("", false, "A750PrdValStk", GXutil.ltrimstr( A750PrdValStk, 11, 2));
      s847UltLinEnt = O847UltLinEnt ;
      httpContext.ajax_rsp_assign_attri("", false, "A847UltLinEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A847UltLinEnt), 4, 0));
      sV44PedPri = OV44PedPri ;
      httpContext.ajax_rsp_assign_attri("", false, "AV44PedPri", AV44PedPri);
      s713PrdFulEnt = O713PrdFulEnt ;
      httpContext.ajax_rsp_assign_attri("", false, "A713PrdFulEnt", localUtil.format(A713PrdFulEnt, "99/99/99"));
      s709PrdFecPre = O709PrdFecPre ;
      httpContext.ajax_rsp_assign_attri("", false, "A709PrdFecPre", localUtil.format(A709PrdFecPre, "99/99/99"));
      s684PrdCanPen = O684PrdCanPen ;
      httpContext.ajax_rsp_assign_attri("", false, "A684PrdCanPen", GXutil.ltrimstr( A684PrdCanPen, 12, 4));
      s14040PrdUltMovF = O14040PrdUltMovF ;
      httpContext.ajax_rsp_assign_attri("", false, "A14040PrdUltMovF", localUtil.format(A14040PrdUltMovF, "99/99/99"));
      sV40OldExiAlm = OV40OldExiAlm ;
      httpContext.ajax_rsp_assign_attri("", false, "AV40OldExiAlm", GXutil.ltrimstr( AV40OldExiAlm, 12, 4));
      s726PrdPreMed = O726PrdPreMed ;
      httpContext.ajax_rsp_assign_attri("", false, "A726PrdPreMed", GXutil.ltrimstr( A726PrdPreMed, 14, 5));
      s725PrdPreAnt = O725PrdPreAnt ;
      httpContext.ajax_rsp_assign_attri("", false, "A725PrdPreAnt", GXutil.ltrimstr( A725PrdPreAnt, 14, 5));
      nGXsfl_40_idx = 0 ;
      while ( nGXsfl_40_idx < nRC_GXsfl_40 )
      {
         readRow1SH42( ) ;
         if ( ( nRcdExists_42 != 0 ) || ( nIsMod_42 != 0 ) )
         {
            standaloneNotModal1SH42( ) ;
            getKey1SH42( ) ;
            if ( ( nRcdExists_42 == 0 ) && ( nRcdDeleted_42 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert1SH42( ) ;
            }
            else
            {
               if ( RcdFound42 != 0 )
               {
                  if ( ( nRcdDeleted_42 != 0 ) && ( nRcdExists_42 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete1SH42( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_42 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update1SH42( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_42 == 0 )
                  {
                     GXCCtl = "LINENT_" + sGXsfl_40_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtLinEnt_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
            O724PrdPreAct = A724PrdPreAct ;
            httpContext.ajax_rsp_assign_attri("", false, "A724PrdPreAct", GXutil.ltrimstr( A724PrdPreAct, 14, 5));
            O704PrdExiAlm = A704PrdExiAlm ;
            httpContext.ajax_rsp_assign_attri("", false, "A704PrdExiAlm", GXutil.ltrimstr( A704PrdExiAlm, 12, 4));
            O750PrdValStk = A750PrdValStk ;
            httpContext.ajax_rsp_assign_attri("", false, "A750PrdValStk", GXutil.ltrimstr( A750PrdValStk, 11, 2));
            O847UltLinEnt = A847UltLinEnt ;
            httpContext.ajax_rsp_assign_attri("", false, "A847UltLinEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A847UltLinEnt), 4, 0));
            OV44PedPri = AV44PedPri ;
            httpContext.ajax_rsp_assign_attri("", false, "AV44PedPri", AV44PedPri);
            O713PrdFulEnt = A713PrdFulEnt ;
            httpContext.ajax_rsp_assign_attri("", false, "A713PrdFulEnt", localUtil.format(A713PrdFulEnt, "99/99/99"));
            O709PrdFecPre = A709PrdFecPre ;
            httpContext.ajax_rsp_assign_attri("", false, "A709PrdFecPre", localUtil.format(A709PrdFecPre, "99/99/99"));
            O684PrdCanPen = A684PrdCanPen ;
            httpContext.ajax_rsp_assign_attri("", false, "A684PrdCanPen", GXutil.ltrimstr( A684PrdCanPen, 12, 4));
            O14040PrdUltMovF = A14040PrdUltMovF ;
            httpContext.ajax_rsp_assign_attri("", false, "A14040PrdUltMovF", localUtil.format(A14040PrdUltMovF, "99/99/99"));
            OV40OldExiAlm = AV40OldExiAlm ;
            httpContext.ajax_rsp_assign_attri("", false, "AV40OldExiAlm", GXutil.ltrimstr( AV40OldExiAlm, 12, 4));
            O726PrdPreMed = A726PrdPreMed ;
            httpContext.ajax_rsp_assign_attri("", false, "A726PrdPreMed", GXutil.ltrimstr( A726PrdPreMed, 14, 5));
            O725PrdPreAnt = A725PrdPreAnt ;
            httpContext.ajax_rsp_assign_attri("", false, "A725PrdPreAnt", GXutil.ltrimstr( A725PrdPreAnt, 14, 5));
         }
         httpContext.changePostValue( edtLinEnt_Internalname, GXutil.ltrim( localUtil.ntoc( A597LinEnt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtEntFecEnt_Internalname, localUtil.format(A415EntFecEnt, "99/99/99")) ;
         httpContext.changePostValue( edtAlbaran_Internalname, GXutil.rtrim( A11Albaran)) ;
         httpContext.changePostValue( edtEntNAlbar_Internalname, GXutil.rtrim( A12857EntNAlbar)) ;
         httpContext.changePostValue( edtPedCod_Internalname, GXutil.ltrim( localUtil.ntoc( A658PedCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtavPedcodprompt_Internalname, AV43PedCodPrompt) ;
         httpContext.changePostValue( edtEntNEmb_Internalname, GXutil.ltrim( localUtil.ntoc( A14035EntNEmb, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtEntPrvNum_Internalname, GXutil.ltrim( localUtil.ntoc( A6156EntPrvNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtEntUniEnt_Internalname, GXutil.ltrim( localUtil.ntoc( A418EntUniEnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtEntCump_Internalname, GXutil.rtrim( A14041EntCump)) ;
         httpContext.changePostValue( cmbEntPedCum.getInternalname(), GXutil.rtrim( A3404EntPedCum)) ;
         httpContext.changePostValue( edtEntPre_Internalname, GXutil.ltrim( localUtil.ntoc( A417EntPre, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtEntUniRem_Internalname, GXutil.ltrim( localUtil.ntoc( A419EntUniRem, (byte)(11), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtEntLotN_Internalname, GXutil.rtrim( A5686EntLotN)) ;
         httpContext.changePostValue( edtEntFVal_Internalname, localUtil.format(A5685EntFVal, "99/99/99")) ;
         httpContext.changePostValue( "ZT_"+"Z597LinEnt_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( Z597LinEnt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z12716EntFabId_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( Z12716EntFabId, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z6156EntPrvNum_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( Z6156EntPrvNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z415EntFecEnt_"+sGXsfl_40_idx, localUtil.dtoc( Z415EntFecEnt, 0, "/")) ;
         httpContext.changePostValue( "ZT_"+"Z10184EntRemTpo_"+sGXsfl_40_idx, GXutil.rtrim( Z10184EntRemTpo)) ;
         httpContext.changePostValue( "ZT_"+"Z3404EntPedCum_"+sGXsfl_40_idx, GXutil.rtrim( Z3404EntPedCum)) ;
         httpContext.changePostValue( "ZT_"+"Z411EntCon_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( Z411EntCon, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z419EntUniRem_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( Z419EntUniRem, (byte)(11), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z417EntPre_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( Z417EntPre, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z11Albaran_"+sGXsfl_40_idx, GXutil.rtrim( Z11Albaran)) ;
         httpContext.changePostValue( "ZT_"+"Z12857EntNAlbar_"+sGXsfl_40_idx, GXutil.rtrim( Z12857EntNAlbar)) ;
         httpContext.changePostValue( "ZT_"+"Z418EntUniEnt_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( Z418EntUniEnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z416EntNumCon_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( Z416EntNumCon, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z5686EntLotN_"+sGXsfl_40_idx, GXutil.rtrim( Z5686EntLotN)) ;
         httpContext.changePostValue( "ZT_"+"Z5685EntFVal_"+sGXsfl_40_idx, localUtil.dtoc( Z5685EntFVal, 0, "/")) ;
         httpContext.changePostValue( "ZT_"+"Z414EntEti_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( Z414EntEti, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z413EntConIni_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( Z413EntConIni, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z412EntConFin_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( Z412EntConFin, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z5691EntBnc_"+sGXsfl_40_idx, GXutil.rtrim( Z5691EntBnc)) ;
         httpContext.changePostValue( "ZT_"+"Z7695EntCC_"+sGXsfl_40_idx, GXutil.rtrim( Z7695EntCC)) ;
         httpContext.changePostValue( "ZT_"+"Z7696EntCCoCod_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( Z7696EntCCoCod, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10782EntUniAlb_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( Z10782EntUniAlb, (byte)(11), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10783EntObs_"+sGXsfl_40_idx, GXutil.rtrim( Z10783EntObs)) ;
         httpContext.changePostValue( "ZT_"+"Z10187EntRemNro_"+sGXsfl_40_idx, GXutil.rtrim( Z10187EntRemNro)) ;
         httpContext.changePostValue( "ZT_"+"Z10186EntRemFch_"+sGXsfl_40_idx, localUtil.dtoc( Z10186EntRemFch, 0, "/")) ;
         httpContext.changePostValue( "ZT_"+"Z10185EntRemSuc_"+sGXsfl_40_idx, GXutil.rtrim( Z10185EntRemSuc)) ;
         httpContext.changePostValue( "ZT_"+"Z13235EntLoteID_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( Z13235EntLoteID, (byte)(12), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z13456EntUbicaci_"+sGXsfl_40_idx, GXutil.rtrim( Z13456EntUbicaci)) ;
         httpContext.changePostValue( "ZT_"+"Z5690EntHfCon_"+sGXsfl_40_idx, localUtil.ttoc( Z5690EntHfCon, 10, 8, 0, 0, "/", ":", " ")) ;
         httpContext.changePostValue( "ZT_"+"Z5689EntFfCon_"+sGXsfl_40_idx, localUtil.dtoc( Z5689EntFfCon, 0, "/")) ;
         httpContext.changePostValue( "ZT_"+"Z5688EntHiCon_"+sGXsfl_40_idx, localUtil.ttoc( Z5688EntHiCon, 10, 8, 0, 0, "/", ":", " ")) ;
         httpContext.changePostValue( "ZT_"+"Z5687EntFiCon_"+sGXsfl_40_idx, localUtil.dtoc( Z5687EntFiCon, 0, "/")) ;
         httpContext.changePostValue( "ZT_"+"Z14035EntNEmb_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( Z14035EntNEmb, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z658PedCod_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( Z658PedCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z663PedFulEnt_"+sGXsfl_40_idx, localUtil.dtoc( Z663PedFulEnt, 0, "/")) ;
         httpContext.changePostValue( "ZT_"+"Z665PedPre_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( Z665PedPre, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z669PedUni_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( Z669PedUni, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z659PedCum_"+sGXsfl_40_idx, GXutil.rtrim( Z659PedCum)) ;
         httpContext.changePostValue( "ZT_"+"Z660PedDto_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( Z660PedDto, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T419EntUniRem_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( O419EntUniRem, (byte)(11), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T418EntUniEnt_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( O418EntUniEnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T657PedCanEnt_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( O657PedCanEnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T415EntFecEnt_"+sGXsfl_40_idx, localUtil.dtoc( O415EntFecEnt, 0, "/")) ;
         httpContext.changePostValue( "T417EntPre_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( O417EntPre, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T5686EntLotN_"+sGXsfl_40_idx, GXutil.rtrim( O5686EntLotN)) ;
         httpContext.changePostValue( "T3404EntPedCum_"+sGXsfl_40_idx, GXutil.rtrim( O3404EntPedCum)) ;
         httpContext.changePostValue( "nRcdDeleted_42_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_42, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_42_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_42, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_42_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_42, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "N415EntFecEnt_"+sGXsfl_40_idx, localUtil.dtoc( A415EntFecEnt, 0, "/")) ;
         httpContext.changePostValue( "N11Albaran_"+sGXsfl_40_idx, GXutil.rtrim( A11Albaran)) ;
         httpContext.changePostValue( "N12857EntNAlbar_"+sGXsfl_40_idx, GXutil.rtrim( A12857EntNAlbar)) ;
         httpContext.changePostValue( "N6156EntPrvNum_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( A6156EntPrvNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "N418EntUniEnt_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( A418EntUniEnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "N3404EntPedCum_"+sGXsfl_40_idx, GXutil.rtrim( A3404EntPedCum)) ;
         httpContext.changePostValue( "N417EntPre_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( A417EntPre, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "N5686EntLotN_"+sGXsfl_40_idx, GXutil.rtrim( A5686EntLotN)) ;
         httpContext.changePostValue( "N5685EntFVal_"+sGXsfl_40_idx, localUtil.dtoc( A5685EntFVal, 0, "/")) ;
         if ( nIsMod_42 != 0 )
         {
            httpContext.changePostValue( "LINENT_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLinEnt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ENTFECENT_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtEntFecEnt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBARAN_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbaran_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBARAN_"+sGXsfl_40_idx+"Visible", GXutil.ltrim( localUtil.ntoc( edtAlbaran_Visible, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ENTNALBAR_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtEntNAlbar_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ENTNALBAR_"+sGXsfl_40_idx+"Visible", GXutil.ltrim( localUtil.ntoc( edtEntNAlbar_Visible, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PEDCOD_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPedCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "vPEDCODPROMPT_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavPedcodprompt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "vPEDCODPROMPT_"+sGXsfl_40_idx+"Link", GXutil.rtrim( edtavPedcodprompt_Link)) ;
            httpContext.changePostValue( "vPEDCODPROMPT_"+sGXsfl_40_idx+"Visible", GXutil.ltrim( localUtil.ntoc( edtavPedcodprompt_Visible, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ENTNEMB_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtEntNEmb_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ENTNEMB_"+sGXsfl_40_idx+"Visible", GXutil.ltrim( localUtil.ntoc( edtEntNEmb_Visible, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ENTPRVNUM_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtEntPrvNum_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ENTUNIENT_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtEntUniEnt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ENTCUMP_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtEntCump_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ENTPEDCUM_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( cmbEntPedCum.getEnabled(), (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ENTPRE_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtEntPre_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ENTUNIREM_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtEntUniRem_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ENTLOTN_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtEntLotN_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ENTFVAL_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtEntFVal_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* Using cursor T01SH28 */
      pr_default.execute(22, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
      if ( (pr_default.getStatus(22) != 101) )
      {
         A913StockRem = T01SH28_A913StockRem[0] ;
         n913StockRem = T01SH28_n913StockRem[0] ;
      }
      else
      {
         A913StockRem = DecimalUtil.doubleToDec(0) ;
         n913StockRem = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A913StockRem", GXutil.ltrimstr( A913StockRem, 12, 4));
      }
      /* End of After( level) rules */
      initAll1SH42( ) ;
      if ( AnyError != 0 )
      {
         O724PrdPreAct = s724PrdPreAct ;
         httpContext.ajax_rsp_assign_attri("", false, "A724PrdPreAct", GXutil.ltrimstr( A724PrdPreAct, 14, 5));
         O704PrdExiAlm = s704PrdExiAlm ;
         httpContext.ajax_rsp_assign_attri("", false, "A704PrdExiAlm", GXutil.ltrimstr( A704PrdExiAlm, 12, 4));
         O750PrdValStk = s750PrdValStk ;
         httpContext.ajax_rsp_assign_attri("", false, "A750PrdValStk", GXutil.ltrimstr( A750PrdValStk, 11, 2));
         O847UltLinEnt = s847UltLinEnt ;
         httpContext.ajax_rsp_assign_attri("", false, "A847UltLinEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A847UltLinEnt), 4, 0));
         OV44PedPri = sV44PedPri ;
         httpContext.ajax_rsp_assign_attri("", false, "AV44PedPri", AV44PedPri);
         O713PrdFulEnt = s713PrdFulEnt ;
         httpContext.ajax_rsp_assign_attri("", false, "A713PrdFulEnt", localUtil.format(A713PrdFulEnt, "99/99/99"));
         O709PrdFecPre = s709PrdFecPre ;
         httpContext.ajax_rsp_assign_attri("", false, "A709PrdFecPre", localUtil.format(A709PrdFecPre, "99/99/99"));
         O684PrdCanPen = s684PrdCanPen ;
         httpContext.ajax_rsp_assign_attri("", false, "A684PrdCanPen", GXutil.ltrimstr( A684PrdCanPen, 12, 4));
         O14040PrdUltMovF = s14040PrdUltMovF ;
         httpContext.ajax_rsp_assign_attri("", false, "A14040PrdUltMovF", localUtil.format(A14040PrdUltMovF, "99/99/99"));
         OV40OldExiAlm = sV40OldExiAlm ;
         httpContext.ajax_rsp_assign_attri("", false, "AV40OldExiAlm", GXutil.ltrimstr( AV40OldExiAlm, 12, 4));
         O726PrdPreMed = s726PrdPreMed ;
         httpContext.ajax_rsp_assign_attri("", false, "A726PrdPreMed", GXutil.ltrimstr( A726PrdPreMed, 14, 5));
         O725PrdPreAnt = s725PrdPreAnt ;
         httpContext.ajax_rsp_assign_attri("", false, "A725PrdPreAnt", GXutil.ltrimstr( A725PrdPreAnt, 14, 5));
      }
      nRcdExists_42 = (short)(0) ;
      nIsMod_42 = (short)(0) ;
      nRcdDeleted_42 = (short)(0) ;
   }

   public void processLevel1SH29( )
   {
      /* Save parent mode. */
      sMode29 = Gx_mode ;
      processNestedLevel1SH42( ) ;
      if ( AnyError != 0 )
      {
         O724PrdPreAct = s724PrdPreAct ;
         httpContext.ajax_rsp_assign_attri("", false, "A724PrdPreAct", GXutil.ltrimstr( A724PrdPreAct, 14, 5));
         O704PrdExiAlm = s704PrdExiAlm ;
         httpContext.ajax_rsp_assign_attri("", false, "A704PrdExiAlm", GXutil.ltrimstr( A704PrdExiAlm, 12, 4));
         O750PrdValStk = s750PrdValStk ;
         httpContext.ajax_rsp_assign_attri("", false, "A750PrdValStk", GXutil.ltrimstr( A750PrdValStk, 11, 2));
         O847UltLinEnt = s847UltLinEnt ;
         httpContext.ajax_rsp_assign_attri("", false, "A847UltLinEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A847UltLinEnt), 4, 0));
         OV44PedPri = sV44PedPri ;
         httpContext.ajax_rsp_assign_attri("", false, "AV44PedPri", AV44PedPri);
         O713PrdFulEnt = s713PrdFulEnt ;
         httpContext.ajax_rsp_assign_attri("", false, "A713PrdFulEnt", localUtil.format(A713PrdFulEnt, "99/99/99"));
         O709PrdFecPre = s709PrdFecPre ;
         httpContext.ajax_rsp_assign_attri("", false, "A709PrdFecPre", localUtil.format(A709PrdFecPre, "99/99/99"));
         O684PrdCanPen = s684PrdCanPen ;
         httpContext.ajax_rsp_assign_attri("", false, "A684PrdCanPen", GXutil.ltrimstr( A684PrdCanPen, 12, 4));
         O14040PrdUltMovF = s14040PrdUltMovF ;
         httpContext.ajax_rsp_assign_attri("", false, "A14040PrdUltMovF", localUtil.format(A14040PrdUltMovF, "99/99/99"));
         OV40OldExiAlm = sV40OldExiAlm ;
         httpContext.ajax_rsp_assign_attri("", false, "AV40OldExiAlm", GXutil.ltrimstr( AV40OldExiAlm, 12, 4));
         O726PrdPreMed = s726PrdPreMed ;
         httpContext.ajax_rsp_assign_attri("", false, "A726PrdPreMed", GXutil.ltrimstr( A726PrdPreMed, 14, 5));
         O725PrdPreAnt = s725PrdPreAnt ;
         httpContext.ajax_rsp_assign_attri("", false, "A725PrdPreAnt", GXutil.ltrimstr( A725PrdPreAnt, 14, 5));
      }
      /* Restore parent mode. */
      Gx_mode = sMode29 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
      /* Using cursor T01SH102 */
      pr_default.execute(96, new Object[] {Short.valueOf(A847UltLinEnt), A704PrdExiAlm, A750PrdValStk, A713PrdFulEnt, A709PrdFecPre, A724PrdPreAct, A684PrdCanPen, A726PrdPreMed, A725PrdPreAnt, A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPRODUC");
   }

   public void endLevel1SH29( )
   {
      pr_default.close(6);
      if ( AnyError == 0 )
      {
         beforeComplete1SH29( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "entradaproducto");
         if ( AnyError == 0 )
         {
            confirmValues1SH0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "entradaproducto");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1SH29( )
   {
      /* Scan By routine */
      /* Using cursor T01SH103 */
      pr_default.execute(97);
      RcdFound29 = (short)(0) ;
      if ( (pr_default.getStatus(97) != 101) )
      {
         RcdFound29 = (short)(1) ;
         A396EmprCod = T01SH103_A396EmprCod[0] ;
         A719PrdNum = T01SH103_A719PrdNum[0] ;
         n719PrdNum = T01SH103_n719PrdNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1SH29( )
   {
      /* Scan next routine */
      pr_default.readNext(97);
      RcdFound29 = (short)(0) ;
      if ( (pr_default.getStatus(97) != 101) )
      {
         RcdFound29 = (short)(1) ;
         A396EmprCod = T01SH103_A396EmprCod[0] ;
         A719PrdNum = T01SH103_A719PrdNum[0] ;
         n719PrdNum = T01SH103_n719PrdNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
      }
   }

   public void scanEnd1SH29( )
   {
      pr_default.close(97);
   }

   public void afterConfirm1SH29( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1SH29( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1SH29( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1SH29( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1SH29( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1SH29( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1SH29( )
   {
      edtPrdNum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNum_Enabled), 5, 0), true);
      edtPrdNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNom_Enabled), 5, 0), true);
      edtPrdExiAlm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdExiAlm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdExiAlm_Enabled), 5, 0), true);
      edtPrdUltMovF_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdUltMovF_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdUltMovF_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void zm1SH42( int GX_JID )
   {
      if ( ( GX_JID == 123 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z12716EntFabId = T01SH3_A12716EntFabId[0] ;
            Z6156EntPrvNum = T01SH3_A6156EntPrvNum[0] ;
            Z415EntFecEnt = T01SH3_A415EntFecEnt[0] ;
            Z10184EntRemTpo = T01SH3_A10184EntRemTpo[0] ;
            Z3404EntPedCum = T01SH3_A3404EntPedCum[0] ;
            Z411EntCon = T01SH3_A411EntCon[0] ;
            Z419EntUniRem = T01SH3_A419EntUniRem[0] ;
            Z417EntPre = T01SH3_A417EntPre[0] ;
            Z11Albaran = T01SH3_A11Albaran[0] ;
            Z12857EntNAlbar = T01SH3_A12857EntNAlbar[0] ;
            Z418EntUniEnt = T01SH3_A418EntUniEnt[0] ;
            Z416EntNumCon = T01SH3_A416EntNumCon[0] ;
            Z5686EntLotN = T01SH3_A5686EntLotN[0] ;
            Z5685EntFVal = T01SH3_A5685EntFVal[0] ;
            Z414EntEti = T01SH3_A414EntEti[0] ;
            Z413EntConIni = T01SH3_A413EntConIni[0] ;
            Z412EntConFin = T01SH3_A412EntConFin[0] ;
            Z5691EntBnc = T01SH3_A5691EntBnc[0] ;
            Z7695EntCC = T01SH3_A7695EntCC[0] ;
            Z7696EntCCoCod = T01SH3_A7696EntCCoCod[0] ;
            Z10782EntUniAlb = T01SH3_A10782EntUniAlb[0] ;
            Z10783EntObs = T01SH3_A10783EntObs[0] ;
            Z10187EntRemNro = T01SH3_A10187EntRemNro[0] ;
            Z10186EntRemFch = T01SH3_A10186EntRemFch[0] ;
            Z10185EntRemSuc = T01SH3_A10185EntRemSuc[0] ;
            Z13235EntLoteID = T01SH3_A13235EntLoteID[0] ;
            Z13456EntUbicaci = T01SH3_A13456EntUbicaci[0] ;
            Z5690EntHfCon = T01SH3_A5690EntHfCon[0] ;
            Z5689EntFfCon = T01SH3_A5689EntFfCon[0] ;
            Z5688EntHiCon = T01SH3_A5688EntHiCon[0] ;
            Z5687EntFiCon = T01SH3_A5687EntFiCon[0] ;
            Z14035EntNEmb = T01SH3_A14035EntNEmb[0] ;
            Z658PedCod = T01SH3_A658PedCod[0] ;
         }
         else
         {
            Z12716EntFabId = A12716EntFabId ;
            Z6156EntPrvNum = A6156EntPrvNum ;
            Z415EntFecEnt = A415EntFecEnt ;
            Z10184EntRemTpo = A10184EntRemTpo ;
            Z3404EntPedCum = A3404EntPedCum ;
            Z411EntCon = A411EntCon ;
            Z419EntUniRem = A419EntUniRem ;
            Z417EntPre = A417EntPre ;
            Z11Albaran = A11Albaran ;
            Z12857EntNAlbar = A12857EntNAlbar ;
            Z418EntUniEnt = A418EntUniEnt ;
            Z416EntNumCon = A416EntNumCon ;
            Z5686EntLotN = A5686EntLotN ;
            Z5685EntFVal = A5685EntFVal ;
            Z414EntEti = A414EntEti ;
            Z413EntConIni = A413EntConIni ;
            Z412EntConFin = A412EntConFin ;
            Z5691EntBnc = A5691EntBnc ;
            Z7695EntCC = A7695EntCC ;
            Z7696EntCCoCod = A7696EntCCoCod ;
            Z10782EntUniAlb = A10782EntUniAlb ;
            Z10783EntObs = A10783EntObs ;
            Z10187EntRemNro = A10187EntRemNro ;
            Z10186EntRemFch = A10186EntRemFch ;
            Z10185EntRemSuc = A10185EntRemSuc ;
            Z13235EntLoteID = A13235EntLoteID ;
            Z13456EntUbicaci = A13456EntUbicaci ;
            Z5690EntHfCon = A5690EntHfCon ;
            Z5689EntFfCon = A5689EntFfCon ;
            Z5688EntHiCon = A5688EntHiCon ;
            Z5687EntFiCon = A5687EntFiCon ;
            Z14035EntNEmb = A14035EntNEmb ;
            Z658PedCod = A658PedCod ;
         }
      }
      if ( ( GX_JID == 125 ) || ( GX_JID == 0 ) )
      {
         Z663PedFulEnt = T01SH6_A663PedFulEnt[0] ;
         Z665PedPre = T01SH6_A665PedPre[0] ;
         Z669PedUni = T01SH6_A669PedUni[0] ;
         Z659PedCum = T01SH6_A659PedCum[0] ;
         Z660PedDto = T01SH6_A660PedDto[0] ;
      }
      if ( GX_JID == -123 )
      {
         Z597LinEnt = A597LinEnt ;
         Z12716EntFabId = A12716EntFabId ;
         Z6156EntPrvNum = A6156EntPrvNum ;
         Z415EntFecEnt = A415EntFecEnt ;
         Z10184EntRemTpo = A10184EntRemTpo ;
         Z3404EntPedCum = A3404EntPedCum ;
         Z411EntCon = A411EntCon ;
         Z419EntUniRem = A419EntUniRem ;
         Z417EntPre = A417EntPre ;
         Z11Albaran = A11Albaran ;
         Z12857EntNAlbar = A12857EntNAlbar ;
         Z418EntUniEnt = A418EntUniEnt ;
         Z416EntNumCon = A416EntNumCon ;
         Z5686EntLotN = A5686EntLotN ;
         Z5685EntFVal = A5685EntFVal ;
         Z414EntEti = A414EntEti ;
         Z413EntConIni = A413EntConIni ;
         Z412EntConFin = A412EntConFin ;
         Z5691EntBnc = A5691EntBnc ;
         Z7695EntCC = A7695EntCC ;
         Z7696EntCCoCod = A7696EntCCoCod ;
         Z10782EntUniAlb = A10782EntUniAlb ;
         Z10783EntObs = A10783EntObs ;
         Z10187EntRemNro = A10187EntRemNro ;
         Z10186EntRemFch = A10186EntRemFch ;
         Z10185EntRemSuc = A10185EntRemSuc ;
         Z13235EntLoteID = A13235EntLoteID ;
         Z13456EntUbicaci = A13456EntUbicaci ;
         Z5690EntHfCon = A5690EntHfCon ;
         Z5689EntFfCon = A5689EntFfCon ;
         Z5688EntHiCon = A5688EntHiCon ;
         Z5687EntFiCon = A5687EntFiCon ;
         Z14035EntNEmb = A14035EntNEmb ;
         Z396EmprCod = A396EmprCod ;
         Z658PedCod = A658PedCod ;
         Z719PrdNum = A719PrdNum ;
         Z661PedFec = A661PedFec ;
         Z667PedSit = A667PedSit ;
         Z666PedPri = A666PedPri ;
         Z12580PedAlmc = A12580PedAlmc ;
         Z657PedCanEnt = A657PedCanEnt ;
         Z663PedFulEnt = A663PedFulEnt ;
         Z665PedPre = A665PedPre ;
         Z669PedUni = A669PedUni ;
         Z659PedCum = A659PedCum ;
         Z660PedDto = A660PedDto ;
      }
   }

   public void standaloneNotModal1SH42( )
   {
      edtEntUniRem_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEntUniRem_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEntUniRem_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      edtEntCump_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEntCump_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEntCump_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      edtPrdExiAlm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdExiAlm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdExiAlm_Enabled), 5, 0), true);
      edtPrdExiAlm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdExiAlm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdExiAlm_Enabled), 5, 0), true);
      GXt_date10 = A14040PrdUltMovF ;
      GXv_char4[0] = A396EmprCod ;
      GXv_char3[0] = A719PrdNum ;
      GXv_date11[0] = GXt_date10 ;
      new app.pstm005(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_date11) ;
      entradaproducto_impl.this.A396EmprCod = GXv_char4[0] ;
      entradaproducto_impl.this.A719PrdNum = GXv_char3[0] ;
      entradaproducto_impl.this.GXt_date10 = GXv_date11[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
      A14040PrdUltMovF = GXt_date10 ;
      httpContext.ajax_rsp_assign_attri("", false, "A14040PrdUltMovF", localUtil.format(A14040PrdUltMovF, "99/99/99"));
   }

   public void standaloneModal1SH42( )
   {
      if ( isIns( )  )
      {
         A411EntCon = (byte)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A411EntCon", GXutil.str( A411EntCon, 1, 0));
      }
      if ( isIns( )  )
      {
         A847UltLinEnt = (short)(O847UltLinEnt+1) ;
         httpContext.ajax_rsp_assign_attri("", false, "A847UltLinEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A847UltLinEnt), 4, 0));
      }
      if ( isIns( )  && (0==A6156EntPrvNum) && ( Gx_BScreen == 0 ) )
      {
         A6156EntPrvNum = A795PrvNum ;
         n6156EntPrvNum = false ;
      }
      if ( isIns( )  && GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A415EntFecEnt)) && ( Gx_BScreen == 0 ) )
      {
         A415EntFecEnt = GXutil.today( ) ;
      }
      if ( isIns( )  && (GXutil.strcmp("", A10184EntRemTpo)==0) && ( Gx_BScreen == 0 ) )
      {
         A10184EntRemTpo = " " ;
         httpContext.ajax_rsp_assign_attri("", false, "A10184EntRemTpo", A10184EntRemTpo);
      }
      if ( isIns( )  && ( Gx_BScreen == 1 ) )
      {
         A597LinEnt = A847UltLinEnt ;
      }
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtLinEnt_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtLinEnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLinEnt_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      }
      else
      {
         edtLinEnt_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtLinEnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLinEnt_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ( Gx_BScreen == 0 ) )
      {
         if ( true /* After */ )
         {
            GXt_char1 = AV45PrdNomX ;
            GXv_char4[0] = A396EmprCod ;
            GXv_int8[0] = A6156EntPrvNum ;
            GXv_char3[0] = GXt_char1 ;
            new app.pctrprv(remoteHandle, context).execute( GXv_char4, GXv_int8, GXv_char3) ;
            entradaproducto_impl.this.A396EmprCod = GXv_char4[0] ;
            entradaproducto_impl.this.A6156EntPrvNum = GXv_int8[0] ;
            entradaproducto_impl.this.GXt_char1 = GXv_char3[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            AV45PrdNomX = GXt_char1 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV45PrdNomX", AV45PrdNomX);
         }
         AV59Year = (short)(GXutil.year( A415EntFecEnt)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV59Year", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV59Year), 4, 0));
         AV23Fecha = localUtil.ymdtod( AV59Year, 12, 1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV23Fecha", localUtil.format(AV23Fecha, "99/99/99"));
         AV30Mes = (byte)(GXutil.month( A415EntFecEnt)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV30Mes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV30Mes), 2, 0));
         AV37oldEntFecent = O415EntFecEnt ;
         httpContext.ajax_rsp_assign_attri("", false, "AV37oldEntFecent", localUtil.format(AV37oldEntFecent, "99/99/99"));
         AV22FecAnt = O415EntFecEnt ;
         httpContext.ajax_rsp_assign_attri("", false, "AV22FecAnt", localUtil.format(AV22FecAnt, "99/99/99"));
         AV12AnyAnt = (short)(GXutil.year( O415EntFecEnt)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV12AnyAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12AnyAnt), 4, 0));
         AV31MesAnt = (byte)(GXutil.month( O415EntFecEnt)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV31MesAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV31MesAnt), 2, 0));
         AV34msg_ctrl_fecha = httpContext.getMessage( httpContext.getMessage( "Atencion.Ultimo Mov Fecha ", ""), "") + GXutil.trim( localUtil.dtoc( A14040PrdUltMovF, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")) + httpContext.getMessage( httpContext.getMessage( " superior a Fecha Mov ", ""), "") + GXutil.trim( localUtil.dtoc( A415EntFecEnt, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV34msg_ctrl_fecha", AV34msg_ctrl_fecha);
         AV17DiasFin = (short)(GXutil.ddiff(GXutil.eomdate( AV23Fecha),A415EntFecEnt)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV17DiasFin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV17DiasFin), 3, 0));
      }
   }

   public void load1SH42( )
   {
      /* Using cursor T01SH104 */
      pr_default.execute(98, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum, Short.valueOf(A597LinEnt)});
      if ( (pr_default.getStatus(98) != 101) )
      {
         RcdFound42 = (short)(1) ;
         A12716EntFabId = T01SH104_A12716EntFabId[0] ;
         A6156EntPrvNum = T01SH104_A6156EntPrvNum[0] ;
         n6156EntPrvNum = T01SH104_n6156EntPrvNum[0] ;
         A415EntFecEnt = T01SH104_A415EntFecEnt[0] ;
         A10184EntRemTpo = T01SH104_A10184EntRemTpo[0] ;
         A3404EntPedCum = T01SH104_A3404EntPedCum[0] ;
         A411EntCon = T01SH104_A411EntCon[0] ;
         A657PedCanEnt = T01SH104_A657PedCanEnt[0] ;
         A663PedFulEnt = T01SH104_A663PedFulEnt[0] ;
         A419EntUniRem = T01SH104_A419EntUniRem[0] ;
         A417EntPre = T01SH104_A417EntPre[0] ;
         A11Albaran = T01SH104_A11Albaran[0] ;
         A12857EntNAlbar = T01SH104_A12857EntNAlbar[0] ;
         A661PedFec = T01SH104_A661PedFec[0] ;
         A418EntUniEnt = T01SH104_A418EntUniEnt[0] ;
         A665PedPre = T01SH104_A665PedPre[0] ;
         A669PedUni = T01SH104_A669PedUni[0] ;
         A416EntNumCon = T01SH104_A416EntNumCon[0] ;
         A5686EntLotN = T01SH104_A5686EntLotN[0] ;
         A5685EntFVal = T01SH104_A5685EntFVal[0] ;
         A414EntEti = T01SH104_A414EntEti[0] ;
         A413EntConIni = T01SH104_A413EntConIni[0] ;
         A412EntConFin = T01SH104_A412EntConFin[0] ;
         A659PedCum = T01SH104_A659PedCum[0] ;
         A667PedSit = T01SH104_A667PedSit[0] ;
         A666PedPri = T01SH104_A666PedPri[0] ;
         A660PedDto = T01SH104_A660PedDto[0] ;
         A5691EntBnc = T01SH104_A5691EntBnc[0] ;
         A7695EntCC = T01SH104_A7695EntCC[0] ;
         A7696EntCCoCod = T01SH104_A7696EntCCoCod[0] ;
         A10782EntUniAlb = T01SH104_A10782EntUniAlb[0] ;
         A10783EntObs = T01SH104_A10783EntObs[0] ;
         A10187EntRemNro = T01SH104_A10187EntRemNro[0] ;
         A10186EntRemFch = T01SH104_A10186EntRemFch[0] ;
         A10185EntRemSuc = T01SH104_A10185EntRemSuc[0] ;
         A12580PedAlmc = T01SH104_A12580PedAlmc[0] ;
         A13235EntLoteID = T01SH104_A13235EntLoteID[0] ;
         A13456EntUbicaci = T01SH104_A13456EntUbicaci[0] ;
         A5690EntHfCon = T01SH104_A5690EntHfCon[0] ;
         A5689EntFfCon = T01SH104_A5689EntFfCon[0] ;
         A5688EntHiCon = T01SH104_A5688EntHiCon[0] ;
         A5687EntFiCon = T01SH104_A5687EntFiCon[0] ;
         A14035EntNEmb = T01SH104_A14035EntNEmb[0] ;
         A658PedCod = T01SH104_A658PedCod[0] ;
         n658PedCod = T01SH104_n658PedCod[0] ;
         zm1SH42( -123) ;
      }
      pr_default.close(98);
      onLoadActions1SH42( ) ;
   }

   public void onLoadActions1SH42( )
   {
      A664PedNumLin = (short)(getPedNumLin0( A396EmprCod, A658PedCod)) ;
      httpContext.ajax_rsp_assign_attri("", false, "A664PedNumLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A664PedNumLin), 3, 0));
      if ( isIns( )  && ! (0==A658PedCod) )
      {
         A657PedCanEnt = O657PedCanEnt.add(A418EntUniEnt) ;
         httpContext.ajax_rsp_assign_attri("", false, "A657PedCanEnt", GXutil.ltrimstr( A657PedCanEnt, 9, 2));
      }
      else
      {
         if ( isUpd( )  && ! (0==A658PedCod) )
         {
            A657PedCanEnt = O657PedCanEnt.add(A418EntUniEnt).subtract(O418EntUniEnt) ;
            httpContext.ajax_rsp_assign_attri("", false, "A657PedCanEnt", GXutil.ltrimstr( A657PedCanEnt, 9, 2));
         }
         else
         {
            if ( isDlt( )  && ! (0==A658PedCod) )
            {
               A657PedCanEnt = O657PedCanEnt.subtract(A418EntUniEnt) ;
               httpContext.ajax_rsp_assign_attri("", false, "A657PedCanEnt", GXutil.ltrimstr( A657PedCanEnt, 9, 2));
            }
         }
      }
      if ( ( ( DecimalUtil.compareTo(A657PedCanEnt, A669PedUni) == 0 ) ) && ! (0==A658PedCod) )
      {
         A14041EntCump = "S" ;
      }
      else
      {
         if ( ( ( DecimalUtil.compareTo(A657PedCanEnt, A669PedUni) > 0 ) ) && ! (0==A658PedCod) )
         {
            A14041EntCump = "S" ;
         }
         else
         {
            if ( ( DecimalUtil.compareTo(A657PedCanEnt, A669PedUni) < 0 ) && ! (0==A658PedCod) )
            {
               A14041EntCump = "N" ;
            }
            else
            {
               if ( (0==A658PedCod) )
               {
                  A14041EntCump = "S" ;
               }
               else
               {
                  A14041EntCump = "" ;
               }
            }
         }
      }
      if ( ! (0==A658PedCod) && isIns( )  && ( A660PedDto.doubleValue() > 0 ) )
      {
         A417EntPre = GXutil.roundDecimal( A665PedPre.multiply((DecimalUtil.doubleToDec(1).subtract((A660PedDto.divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN))))), 2) ;
      }
      else
      {
         if ( ! (0==A658PedCod) && isIns( )  && ( A660PedDto.doubleValue() == 0 ) )
         {
            A417EntPre = A665PedPre ;
         }
      }
      if ( isIns( )  && (0==A12716EntFabId) && ( Gx_BScreen == 0 ) )
      {
         A12716EntFabId = A6156EntPrvNum ;
         httpContext.ajax_rsp_assign_attri("", false, "A12716EntFabId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12716EntFabId), 6, 0));
      }
      if ( isIns( )  && (GXutil.strcmp("", A3404EntPedCum)==0) && ( Gx_BScreen == 0 ) )
      {
         A3404EntPedCum = httpContext.getMessage( httpContext.getMessage( "N", ""), "") ;
      }
      else
      {
         if ( isIns( )  && ! (0==A658PedCod) && ( GXutil.strcmp(O3404EntPedCum, A3404EntPedCum) == 0 ) )
         {
            A3404EntPedCum = A14041EntCump ;
         }
      }
      if ( ( isIns( )  || isUpd( )  ) && ( AV36NoUpd == 0 ) )
      {
         A713PrdFulEnt = A415EntFecEnt ;
         httpContext.ajax_rsp_assign_attri("", false, "A713PrdFulEnt", localUtil.format(A713PrdFulEnt, "99/99/99"));
      }
      if ( ( isIns( )  || isUpd( )  ) && ( AV36NoUpd == 0 ) )
      {
         A709PrdFecPre = A415EntFecEnt ;
         httpContext.ajax_rsp_assign_attri("", false, "A709PrdFecPre", localUtil.format(A709PrdFecPre, "99/99/99"));
      }
      if ( ( AV36NoUpd == 0 ) && ( isIns( )  || isUpd( )  ) )
      {
         A724PrdPreAct = A417EntPre ;
         httpContext.ajax_rsp_assign_attri("", false, "A724PrdPreAct", GXutil.ltrimstr( A724PrdPreAct, 14, 5));
      }
      if ( ( isIns( )  || isUpd( )  ) && ( AV36NoUpd == 0 ) )
      {
         A725PrdPreAnt = O724PrdPreAct ;
         httpContext.ajax_rsp_assign_attri("", false, "A725PrdPreAnt", GXutil.ltrimstr( A725PrdPreAnt, 14, 5));
      }
      if ( true )
      {
         AV44PedPri = GXutil.str( A800PrvPri, 1, 0) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV44PedPri", AV44PedPri);
      }
      else
      {
         if ( true /* Level */ && ! (0==A658PedCod) )
         {
            AV44PedPri = A666PedPri ;
            httpContext.ajax_rsp_assign_attri("", false, "AV44PedPri", AV44PedPri);
         }
      }
      AV59Year = (short)(GXutil.year( A415EntFecEnt)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV59Year", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV59Year), 4, 0));
      AV23Fecha = localUtil.ymdtod( AV59Year, 12, 1) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV23Fecha", localUtil.format(AV23Fecha, "99/99/99"));
      AV30Mes = (byte)(GXutil.month( A415EntFecEnt)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV30Mes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV30Mes), 2, 0));
      AV37oldEntFecent = O415EntFecEnt ;
      httpContext.ajax_rsp_assign_attri("", false, "AV37oldEntFecent", localUtil.format(AV37oldEntFecent, "99/99/99"));
      AV22FecAnt = O415EntFecEnt ;
      httpContext.ajax_rsp_assign_attri("", false, "AV22FecAnt", localUtil.format(AV22FecAnt, "99/99/99"));
      AV12AnyAnt = (short)(GXutil.year( O415EntFecEnt)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12AnyAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12AnyAnt), 4, 0));
      AV31MesAnt = (byte)(GXutil.month( O415EntFecEnt)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV31MesAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV31MesAnt), 2, 0));
      AV17DiasFin = (short)(GXutil.ddiff(GXutil.eomdate( AV23Fecha),A415EntFecEnt)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17DiasFin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV17DiasFin), 3, 0));
      if ( ( A684PrdCanPen.doubleValue() < 0 ) && ! (0==A658PedCod) )
      {
         A684PrdCanPen = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A684PrdCanPen", GXutil.ltrimstr( A684PrdCanPen, 12, 4));
      }
      if ( true /* After */ )
      {
         GXt_char1 = AV45PrdNomX ;
         GXv_char4[0] = A396EmprCod ;
         GXv_int8[0] = A6156EntPrvNum ;
         GXv_char3[0] = GXt_char1 ;
         new app.pctrprv(remoteHandle, context).execute( GXv_char4, GXv_int8, GXv_char3) ;
         entradaproducto_impl.this.A396EmprCod = GXv_char4[0] ;
         entradaproducto_impl.this.A6156EntPrvNum = GXv_int8[0] ;
         entradaproducto_impl.this.GXt_char1 = GXv_char3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         AV45PrdNomX = GXt_char1 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV45PrdNomX", AV45PrdNomX);
      }
      if ( isDlt( )  )
      {
         A704PrdExiAlm = O704PrdExiAlm.subtract(O418EntUniEnt) ;
         httpContext.ajax_rsp_assign_attri("", false, "A704PrdExiAlm", GXutil.ltrimstr( A704PrdExiAlm, 12, 4));
      }
      else
      {
         if ( isIns( )  || isUpd( )  || isDlt( )  )
         {
            A704PrdExiAlm = O704PrdExiAlm.add(A418EntUniEnt).subtract(O418EntUniEnt) ;
            httpContext.ajax_rsp_assign_attri("", false, "A704PrdExiAlm", GXutil.ltrimstr( A704PrdExiAlm, 12, 4));
         }
      }
      AV40OldExiAlm = O704PrdExiAlm ;
      httpContext.ajax_rsp_assign_attri("", false, "AV40OldExiAlm", GXutil.ltrimstr( AV40OldExiAlm, 12, 4));
      AV39OldEntUni = O418EntUniEnt ;
      httpContext.ajax_rsp_assign_attri("", false, "AV39OldEntUni", GXutil.ltrimstr( AV39OldEntUni, 9, 2));
      AV55UniOld = O418EntUniEnt ;
      httpContext.ajax_rsp_assign_attri("", false, "AV55UniOld", GXutil.ltrimstr( AV55UniOld, 9, 2));
      if ( isIns( )  )
      {
         A419EntUniRem = O419EntUniRem.add(A418EntUniEnt) ;
      }
      else
      {
         if ( isUpd( )  )
         {
            A419EntUniRem = (O419EntUniRem.add(A418EntUniEnt).subtract(O418EntUniEnt)) ;
         }
         else
         {
            if ( isDlt( )  )
            {
               A419EntUniRem = (O419EntUniRem.subtract(A418EntUniEnt)) ;
            }
         }
      }
      if ( isDsp( )  || (0==A658PedCod) )
      {
         cmbEntPedCum.setEnabled( 0 );
         httpContext.ajax_rsp_assign_prop("", false, cmbEntPedCum.getInternalname(), "Enabled", GXutil.ltrimstr( cmbEntPedCum.getEnabled(), 5, 0), !bGXsfl_40_Refreshing);
      }
      else
      {
         if ( isUpd( )  && ( DecimalUtil.compareTo(A419EntUniRem, A418EntUniEnt) != 0 ) )
         {
            cmbEntPedCum.setEnabled( 0 );
            httpContext.ajax_rsp_assign_prop("", false, cmbEntPedCum.getInternalname(), "Enabled", GXutil.ltrimstr( cmbEntPedCum.getEnabled(), 5, 0), !bGXsfl_40_Refreshing);
         }
         else
         {
            cmbEntPedCum.setEnabled( 1 );
            httpContext.ajax_rsp_assign_prop("", false, cmbEntPedCum.getInternalname(), "Enabled", GXutil.ltrimstr( cmbEntPedCum.getEnabled(), 5, 0), !bGXsfl_40_Refreshing);
         }
      }
      if ( isDsp( )  || isDlt( )  || isUpd( )  && ( DecimalUtil.compareTo(A419EntUniRem, A418EntUniEnt) != 0 ) )
      {
         edtEntFecEnt_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtEntFecEnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEntFecEnt_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      }
      else
      {
         edtEntFecEnt_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtEntFecEnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEntFecEnt_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      }
      if ( isDsp( )  || isDlt( )  || isUpd( )  && ( DecimalUtil.compareTo(A419EntUniRem, A418EntUniEnt) != 0 ) )
      {
         edtAlbaran_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAlbaran_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbaran_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      }
      else
      {
         edtAlbaran_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAlbaran_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbaran_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      }
      if ( isDsp( )  || isDlt( )  || isUpd( )  && ( DecimalUtil.compareTo(A419EntUniRem, A418EntUniEnt) != 0 ) )
      {
         edtEntNAlbar_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtEntNAlbar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEntNAlbar_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      }
      else
      {
         edtEntNAlbar_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtEntNAlbar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEntNAlbar_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      }
      if ( isDsp( )  || isDlt( )  || isUpd( )  && ( DecimalUtil.compareTo(A419EntUniRem, A418EntUniEnt) != 0 ) )
      {
         edtEntPrvNum_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtEntPrvNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEntPrvNum_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      }
      else
      {
         edtEntPrvNum_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtEntPrvNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEntPrvNum_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      }
      if ( isDsp( )  || isDlt( )  || isUpd( )  && ( DecimalUtil.compareTo(A419EntUniRem, A418EntUniEnt) != 0 ) )
      {
         edtEntUniEnt_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtEntUniEnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEntUniEnt_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      }
      else
      {
         edtEntUniEnt_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtEntUniEnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEntUniEnt_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      }
      if ( isDsp( )  || isDlt( )  || isUpd( )  && ( DecimalUtil.compareTo(A419EntUniRem, A418EntUniEnt) != 0 ) )
      {
         edtEntLotN_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtEntLotN_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEntLotN_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      }
      else
      {
         edtEntLotN_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtEntLotN_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEntLotN_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      }
      if ( isDsp( )  || isDlt( )  || isUpd( )  && ( DecimalUtil.compareTo(A419EntUniRem, A418EntUniEnt) != 0 ) )
      {
         edtEntPre_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtEntPre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEntPre_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      }
      else
      {
         edtEntPre_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtEntPre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEntPre_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      }
      if ( isDsp( )  || isDlt( )  || isUpd( )  && ( DecimalUtil.compareTo(A419EntUniRem, A418EntUniEnt) != 0 ) )
      {
         edtEntFVal_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtEntFVal_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEntFVal_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      }
      else
      {
         edtEntFVal_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtEntFVal_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEntFVal_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      }
      AV38OldEntPre = O417EntPre ;
      httpContext.ajax_rsp_assign_attri("", false, "AV38OldEntPre", GXutil.ltrimstr( AV38OldEntPre, 14, 5));
      AV48PrecAnt = O417EntPre ;
      httpContext.ajax_rsp_assign_attri("", false, "AV48PrecAnt", GXutil.ltrimstr( AV48PrecAnt, 14, 5));
      if ( isIns( )  )
      {
         A750PrdValStk = O750PrdValStk.add(GXutil.roundDecimal( A417EntPre.multiply(A418EntUniEnt), 2)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A750PrdValStk", GXutil.ltrimstr( A750PrdValStk, 11, 2));
      }
      else
      {
         if ( isUpd( )  )
         {
            A750PrdValStk = O750PrdValStk.add((GXutil.roundDecimal( A417EntPre.multiply(A418EntUniEnt), 2).subtract(GXutil.roundDecimal( AV38OldEntPre.multiply(AV39OldEntUni), 2)))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A750PrdValStk", GXutil.ltrimstr( A750PrdValStk, 11, 2));
         }
         else
         {
            if ( isDlt( )  )
            {
               A750PrdValStk = O750PrdValStk.subtract(GXutil.roundDecimal( A417EntPre.multiply(A418EntUniEnt), 2)) ;
               httpContext.ajax_rsp_assign_attri("", false, "A750PrdValStk", GXutil.ltrimstr( A750PrdValStk, 11, 2));
            }
         }
      }
      if ( ( A704PrdExiAlm.doubleValue() != 0 ) && ( AV14Consumos == 1 ) && ( A750PrdValStk.doubleValue() > 0 ) )
      {
         A726PrdPreMed = GXutil.roundDecimal( A750PrdValStk.divide(A704PrdExiAlm, 18, java.math.RoundingMode.DOWN), 3) ;
         httpContext.ajax_rsp_assign_attri("", false, "A726PrdPreMed", GXutil.ltrimstr( A726PrdPreMed, 14, 5));
      }
      else
      {
         if ( ( A704PrdExiAlm.doubleValue() == 0 ) && ( AV14Consumos == 1 ) && ( A750PrdValStk.doubleValue() == 0 ) )
         {
            A726PrdPreMed = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A726PrdPreMed", GXutil.ltrimstr( A726PrdPreMed, 14, 5));
         }
         else
         {
            if ( ( ( A704PrdExiAlm.doubleValue() != 0 ) || ( A705PrdExiCC.doubleValue() != 0 ) ) && ( AV14Consumos == 0 ) )
            {
               A726PrdPreMed = GXutil.roundDecimal( A750PrdValStk.divide((A704PrdExiAlm.add(A705PrdExiCC)), 18, java.math.RoundingMode.DOWN), 3) ;
               httpContext.ajax_rsp_assign_attri("", false, "A726PrdPreMed", GXutil.ltrimstr( A726PrdPreMed, 14, 5));
            }
            else
            {
               if ( ( A704PrdExiAlm.doubleValue() == 0 ) && ( A705PrdExiCC.doubleValue() == 0 ) && ( AV14Consumos == 0 ) )
               {
                  A726PrdPreMed = DecimalUtil.doubleToDec(0) ;
                  httpContext.ajax_rsp_assign_attri("", false, "A726PrdPreMed", GXutil.ltrimstr( A726PrdPreMed, 14, 5));
               }
            }
         }
      }
      AV41oldlote = O5686EntLotN ;
      httpContext.ajax_rsp_assign_attri("", false, "AV41oldlote", AV41oldlote);
      AV42OldRemanente = O419EntUniRem ;
      httpContext.ajax_rsp_assign_attri("", false, "AV42OldRemanente", GXutil.ltrimstr( AV42OldRemanente, 11, 4));
      AV34msg_ctrl_fecha = httpContext.getMessage( httpContext.getMessage( "Atencion.Ultimo Mov Fecha ", ""), "") + GXutil.trim( localUtil.dtoc( A14040PrdUltMovF, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")) + httpContext.getMessage( httpContext.getMessage( " superior a Fecha Mov ", ""), "") + GXutil.trim( localUtil.dtoc( A415EntFecEnt, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV34msg_ctrl_fecha", AV34msg_ctrl_fecha);
   }

   public void checkExtendedTable1SH42( )
   {
      nIsDirty_42 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal1SH42( ) ;
      /* Using cursor T01SH4 */
      pr_default.execute(2, new Object[] {A396EmprCod, Boolean.valueOf(n658PedCod), Integer.valueOf(A658PedCod)});
      if ( (pr_default.getStatus(2) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A658PedCod) ) )
         {
            GXCCtl = "PEDCOD_" + sGXsfl_40_idx ;
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CPEDID", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
            AnyError = (short)(1) ;
            GX_FocusControl = edtPedCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A661PedFec = T01SH4_A661PedFec[0] ;
      A667PedSit = T01SH4_A667PedSit[0] ;
      A666PedPri = T01SH4_A666PedPri[0] ;
      A12580PedAlmc = T01SH4_A12580PedAlmc[0] ;
      pr_default.close(2);
      nIsDirty_42 = (short)(1) ;
      A664PedNumLin = (short)(getPedNumLin0( A396EmprCod, A658PedCod)) ;
      httpContext.ajax_rsp_assign_attri("", false, "A664PedNumLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A664PedNumLin), 3, 0));
      /* Using cursor T01SH6 */
      pr_default.execute(4, new Object[] {A396EmprCod, Boolean.valueOf(n658PedCod), Integer.valueOf(A658PedCod), Boolean.valueOf(n719PrdNum), A719PrdNum});
      if ( (pr_default.getStatus(4) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A658PedCod) || (GXutil.strcmp("", A719PrdNum)==0) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "LPEDID", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PRDNUM");
            AnyError = (short)(1) ;
            GX_FocusControl = edtPedCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A657PedCanEnt = T01SH6_A657PedCanEnt[0] ;
      A663PedFulEnt = T01SH6_A663PedFulEnt[0] ;
      A665PedPre = T01SH6_A665PedPre[0] ;
      A669PedUni = T01SH6_A669PedUni[0] ;
      A659PedCum = T01SH6_A659PedCum[0] ;
      A660PedDto = T01SH6_A660PedDto[0] ;
      nIsDirty_42 = (short)(1) ;
      O657PedCanEnt = A657PedCanEnt ;
      httpContext.ajax_rsp_assign_attri("", false, "A657PedCanEnt", GXutil.ltrimstr( A657PedCanEnt, 9, 2));
      pr_default.close(4);
      if ( isIns( )  && ! (0==A658PedCod) )
      {
         nIsDirty_42 = (short)(1) ;
         A657PedCanEnt = O657PedCanEnt.add(A418EntUniEnt) ;
         httpContext.ajax_rsp_assign_attri("", false, "A657PedCanEnt", GXutil.ltrimstr( A657PedCanEnt, 9, 2));
      }
      else
      {
         if ( isUpd( )  && ! (0==A658PedCod) )
         {
            nIsDirty_42 = (short)(1) ;
            A657PedCanEnt = O657PedCanEnt.add(A418EntUniEnt).subtract(O418EntUniEnt) ;
            httpContext.ajax_rsp_assign_attri("", false, "A657PedCanEnt", GXutil.ltrimstr( A657PedCanEnt, 9, 2));
         }
         else
         {
            if ( isDlt( )  && ! (0==A658PedCod) )
            {
               nIsDirty_42 = (short)(1) ;
               A657PedCanEnt = O657PedCanEnt.subtract(A418EntUniEnt) ;
               httpContext.ajax_rsp_assign_attri("", false, "A657PedCanEnt", GXutil.ltrimstr( A657PedCanEnt, 9, 2));
            }
         }
      }
      if ( ( ( DecimalUtil.compareTo(A657PedCanEnt, A669PedUni) == 0 ) ) && ! (0==A658PedCod) )
      {
         nIsDirty_42 = (short)(1) ;
         A14041EntCump = "S" ;
      }
      else
      {
         if ( ( ( DecimalUtil.compareTo(A657PedCanEnt, A669PedUni) > 0 ) ) && ! (0==A658PedCod) )
         {
            nIsDirty_42 = (short)(1) ;
            A14041EntCump = "S" ;
         }
         else
         {
            if ( ( DecimalUtil.compareTo(A657PedCanEnt, A669PedUni) < 0 ) && ! (0==A658PedCod) )
            {
               nIsDirty_42 = (short)(1) ;
               A14041EntCump = "N" ;
            }
            else
            {
               if ( (0==A658PedCod) )
               {
                  nIsDirty_42 = (short)(1) ;
                  A14041EntCump = "S" ;
               }
               else
               {
                  nIsDirty_42 = (short)(1) ;
                  A14041EntCump = "" ;
               }
            }
         }
      }
      if ( ( ( DecimalUtil.compareTo(A657PedCanEnt, A669PedUni) > 0 ) ) && ( ! (0==A658PedCod) ) )
      {
         GXCCtl = "PEDCOD_" + sGXsfl_40_idx ;
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Cantidad entregada superior a la pedida", ""), 0, GXCCtl);
      }
      if ( ! (0==A658PedCod) && isIns( )  && ( A660PedDto.doubleValue() > 0 ) )
      {
         nIsDirty_42 = (short)(1) ;
         A417EntPre = GXutil.roundDecimal( A665PedPre.multiply((DecimalUtil.doubleToDec(1).subtract((A660PedDto.divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN))))), 2) ;
      }
      else
      {
         if ( ! (0==A658PedCod) && isIns( )  && ( A660PedDto.doubleValue() == 0 ) )
         {
            nIsDirty_42 = (short)(1) ;
            A417EntPre = A665PedPre ;
         }
      }
      if ( isIns( )  && (0==A12716EntFabId) && ( Gx_BScreen == 0 ) )
      {
         nIsDirty_42 = (short)(1) ;
         A12716EntFabId = A6156EntPrvNum ;
         httpContext.ajax_rsp_assign_attri("", false, "A12716EntFabId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12716EntFabId), 6, 0));
      }
      if ( isIns( )  && (GXutil.strcmp("", A3404EntPedCum)==0) && ( Gx_BScreen == 0 ) )
      {
         nIsDirty_42 = (short)(1) ;
         A3404EntPedCum = httpContext.getMessage( httpContext.getMessage( "N", ""), "") ;
      }
      else
      {
         if ( isIns( )  && ! (0==A658PedCod) && ( GXutil.strcmp(O3404EntPedCum, A3404EntPedCum) == 0 ) )
         {
            nIsDirty_42 = (short)(1) ;
            A3404EntPedCum = A14041EntCump ;
         }
      }
      if ( ( isIns( )  || isUpd( )  ) && ( AV36NoUpd == 0 ) )
      {
         nIsDirty_42 = (short)(1) ;
         A713PrdFulEnt = A415EntFecEnt ;
         httpContext.ajax_rsp_assign_attri("", false, "A713PrdFulEnt", localUtil.format(A713PrdFulEnt, "99/99/99"));
      }
      if ( ( isIns( )  || isUpd( )  ) && ( AV36NoUpd == 0 ) )
      {
         nIsDirty_42 = (short)(1) ;
         A709PrdFecPre = A415EntFecEnt ;
         httpContext.ajax_rsp_assign_attri("", false, "A709PrdFecPre", localUtil.format(A709PrdFecPre, "99/99/99"));
      }
      if ( ( AV36NoUpd == 0 ) && ( isIns( )  || isUpd( )  ) )
      {
         nIsDirty_42 = (short)(1) ;
         A724PrdPreAct = A417EntPre ;
         httpContext.ajax_rsp_assign_attri("", false, "A724PrdPreAct", GXutil.ltrimstr( A724PrdPreAct, 14, 5));
      }
      if ( ( isIns( )  || isUpd( )  ) && ( AV36NoUpd == 0 ) )
      {
         nIsDirty_42 = (short)(1) ;
         A725PrdPreAnt = O724PrdPreAct ;
         httpContext.ajax_rsp_assign_attri("", false, "A725PrdPreAnt", GXutil.ltrimstr( A725PrdPreAnt, 14, 5));
      }
      if ( true )
      {
         AV44PedPri = GXutil.str( A800PrvPri, 1, 0) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV44PedPri", AV44PedPri);
      }
      else
      {
         if ( true /* Level */ && ! (0==A658PedCod) )
         {
            AV44PedPri = A666PedPri ;
            httpContext.ajax_rsp_assign_attri("", false, "AV44PedPri", AV44PedPri);
         }
      }
      AV59Year = (short)(GXutil.year( A415EntFecEnt)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV59Year", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV59Year), 4, 0));
      AV23Fecha = localUtil.ymdtod( AV59Year, 12, 1) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV23Fecha", localUtil.format(AV23Fecha, "99/99/99"));
      AV30Mes = (byte)(GXutil.month( A415EntFecEnt)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV30Mes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV30Mes), 2, 0));
      AV37oldEntFecent = O415EntFecEnt ;
      httpContext.ajax_rsp_assign_attri("", false, "AV37oldEntFecent", localUtil.format(AV37oldEntFecent, "99/99/99"));
      AV22FecAnt = O415EntFecEnt ;
      httpContext.ajax_rsp_assign_attri("", false, "AV22FecAnt", localUtil.format(AV22FecAnt, "99/99/99"));
      AV12AnyAnt = (short)(GXutil.year( O415EntFecEnt)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12AnyAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12AnyAnt), 4, 0));
      AV31MesAnt = (byte)(GXutil.month( O415EntFecEnt)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV31MesAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV31MesAnt), 2, 0));
      AV17DiasFin = (short)(GXutil.ddiff(GXutil.eomdate( AV23Fecha),A415EntFecEnt)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17DiasFin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV17DiasFin), 3, 0));
      if ( true /* Level */ && true /* After */ && GXutil.resetTime(A415EntFecEnt).after( GXutil.resetTime( Gx_date )) && isIns( )  )
      {
         GXCCtl = "ENTFECENT_" + sGXsfl_40_idx ;
         httpContext.GX_msglist.addItem(httpContext.getMessage( "ERROR.Fecha Entrada mayor a la Fecha del Dia", ""), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtEntFecEnt_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( true /* After */ && ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A14040PrdUltMovF)) && GXutil.resetTime(A14040PrdUltMovF).after( GXutil.resetTime( A415EntFecEnt )) && ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A415EntFecEnt)) && ( isIns( )  || isUpd( )  ) && ( AV25FlagFecCcs == 0 ) )
      {
         GXCCtl = "ENTFECENT_" + sGXsfl_40_idx ;
         httpContext.GX_msglist.addItem(AV34msg_ctrl_fecha, 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtEntFecEnt_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( true /* Level */ && true /* After */ && ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A14040PrdUltMovF)) && GXutil.resetTime(A14040PrdUltMovF).after( GXutil.resetTime( A415EntFecEnt )) && ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A415EntFecEnt)) && ( isIns( )  || isUpd( )  ) && ( AV25FlagFecCcs == 1 ) )
      {
         GXCCtl = "ENTFECENT_" + sGXsfl_40_idx ;
         httpContext.GX_msglist.addItem(AV34msg_ctrl_fecha, 0, GXCCtl);
      }
      if ( ( A684PrdCanPen.doubleValue() < 0 ) && ! (0==A658PedCod) )
      {
         nIsDirty_42 = (short)(1) ;
         A684PrdCanPen = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A684PrdCanPen", GXutil.ltrimstr( A684PrdCanPen, 12, 4));
      }
      if ( ( A684PrdCanPen.doubleValue() < 0 ) && ( ! (0==A658PedCod) ) )
      {
         GXCCtl = "PEDCOD_" + sGXsfl_40_idx ;
         httpContext.GX_msglist.addItem(httpContext.getMessage( "¡ATENCION! Cantidad Entregada superior a la Pendiente", ""), 0, GXCCtl);
      }
      if ( true /* After */ )
      {
         GXt_char1 = AV45PrdNomX ;
         GXv_char4[0] = A396EmprCod ;
         GXv_int8[0] = A6156EntPrvNum ;
         GXv_char3[0] = GXt_char1 ;
         new app.pctrprv(remoteHandle, context).execute( GXv_char4, GXv_int8, GXv_char3) ;
         entradaproducto_impl.this.A396EmprCod = GXv_char4[0] ;
         entradaproducto_impl.this.A6156EntPrvNum = GXv_int8[0] ;
         entradaproducto_impl.this.GXt_char1 = GXv_char3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         AV45PrdNomX = GXt_char1 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV45PrdNomX", AV45PrdNomX);
      }
      if ( ( GXutil.strcmp(GXutil.trim( AV45PrdNomX), httpContext.getMessage( "Inexistente", "")) == 0 ) && true /* After */ )
      {
         GXCCtl = "ENTPRVNUM_" + sGXsfl_40_idx ;
         httpContext.GX_msglist.addItem(httpContext.getMessage( "No existe Proveedor¡", ""), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtEntPrvNum_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ( A6156EntPrvNum == 0 ) && true /* After */ )
      {
         GXCCtl = "ENTPRVNUM_" + sGXsfl_40_idx ;
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Proveedor con codigo vacio¡", ""), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtEntPrvNum_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( isDlt( )  )
      {
         nIsDirty_42 = (short)(1) ;
         A704PrdExiAlm = O704PrdExiAlm.subtract(O418EntUniEnt) ;
         httpContext.ajax_rsp_assign_attri("", false, "A704PrdExiAlm", GXutil.ltrimstr( A704PrdExiAlm, 12, 4));
      }
      else
      {
         if ( isIns( )  || isUpd( )  || isDlt( )  )
         {
            nIsDirty_42 = (short)(1) ;
            A704PrdExiAlm = O704PrdExiAlm.add(A418EntUniEnt).subtract(O418EntUniEnt) ;
            httpContext.ajax_rsp_assign_attri("", false, "A704PrdExiAlm", GXutil.ltrimstr( A704PrdExiAlm, 12, 4));
         }
      }
      AV40OldExiAlm = O704PrdExiAlm ;
      httpContext.ajax_rsp_assign_attri("", false, "AV40OldExiAlm", GXutil.ltrimstr( AV40OldExiAlm, 12, 4));
      AV39OldEntUni = O418EntUniEnt ;
      httpContext.ajax_rsp_assign_attri("", false, "AV39OldEntUni", GXutil.ltrimstr( AV39OldEntUni, 9, 2));
      AV55UniOld = O418EntUniEnt ;
      httpContext.ajax_rsp_assign_attri("", false, "AV55UniOld", GXutil.ltrimstr( AV55UniOld, 9, 2));
      if ( isIns( )  )
      {
         nIsDirty_42 = (short)(1) ;
         A419EntUniRem = O419EntUniRem.add(A418EntUniEnt) ;
      }
      else
      {
         if ( isUpd( )  )
         {
            nIsDirty_42 = (short)(1) ;
            A419EntUniRem = (O419EntUniRem.add(A418EntUniEnt).subtract(O418EntUniEnt)) ;
         }
         else
         {
            if ( isDlt( )  )
            {
               nIsDirty_42 = (short)(1) ;
               A419EntUniRem = (O419EntUniRem.subtract(A418EntUniEnt)) ;
            }
         }
      }
      if ( isDsp( )  || (0==A658PedCod) )
      {
         cmbEntPedCum.setEnabled( 0 );
         httpContext.ajax_rsp_assign_prop("", false, cmbEntPedCum.getInternalname(), "Enabled", GXutil.ltrimstr( cmbEntPedCum.getEnabled(), 5, 0), !bGXsfl_40_Refreshing);
      }
      else
      {
         if ( isUpd( )  && ( DecimalUtil.compareTo(A419EntUniRem, A418EntUniEnt) != 0 ) )
         {
            cmbEntPedCum.setEnabled( 0 );
            httpContext.ajax_rsp_assign_prop("", false, cmbEntPedCum.getInternalname(), "Enabled", GXutil.ltrimstr( cmbEntPedCum.getEnabled(), 5, 0), !bGXsfl_40_Refreshing);
         }
         else
         {
            cmbEntPedCum.setEnabled( 1 );
            httpContext.ajax_rsp_assign_prop("", false, cmbEntPedCum.getInternalname(), "Enabled", GXutil.ltrimstr( cmbEntPedCum.getEnabled(), 5, 0), !bGXsfl_40_Refreshing);
         }
      }
      if ( isDsp( )  || isDlt( )  || isUpd( )  && ( DecimalUtil.compareTo(A419EntUniRem, A418EntUniEnt) != 0 ) )
      {
         edtEntFecEnt_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtEntFecEnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEntFecEnt_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      }
      else
      {
         edtEntFecEnt_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtEntFecEnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEntFecEnt_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      }
      if ( isDsp( )  || isDlt( )  || isUpd( )  && ( DecimalUtil.compareTo(A419EntUniRem, A418EntUniEnt) != 0 ) )
      {
         edtAlbaran_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAlbaran_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbaran_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      }
      else
      {
         edtAlbaran_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAlbaran_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbaran_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      }
      if ( isDsp( )  || isDlt( )  || isUpd( )  && ( DecimalUtil.compareTo(A419EntUniRem, A418EntUniEnt) != 0 ) )
      {
         edtEntNAlbar_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtEntNAlbar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEntNAlbar_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      }
      else
      {
         edtEntNAlbar_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtEntNAlbar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEntNAlbar_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      }
      if ( isDsp( )  || isDlt( )  || isUpd( )  && ( DecimalUtil.compareTo(A419EntUniRem, A418EntUniEnt) != 0 ) )
      {
         edtEntPrvNum_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtEntPrvNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEntPrvNum_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      }
      else
      {
         edtEntPrvNum_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtEntPrvNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEntPrvNum_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      }
      if ( isDsp( )  || isDlt( )  || isUpd( )  && ( DecimalUtil.compareTo(A419EntUniRem, A418EntUniEnt) != 0 ) )
      {
         edtEntUniEnt_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtEntUniEnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEntUniEnt_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      }
      else
      {
         edtEntUniEnt_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtEntUniEnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEntUniEnt_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      }
      if ( isDsp( )  || isDlt( )  || isUpd( )  && ( DecimalUtil.compareTo(A419EntUniRem, A418EntUniEnt) != 0 ) )
      {
         edtEntLotN_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtEntLotN_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEntLotN_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      }
      else
      {
         edtEntLotN_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtEntLotN_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEntLotN_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      }
      if ( isDsp( )  || isDlt( )  || isUpd( )  && ( DecimalUtil.compareTo(A419EntUniRem, A418EntUniEnt) != 0 ) )
      {
         edtEntPre_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtEntPre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEntPre_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      }
      else
      {
         edtEntPre_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtEntPre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEntPre_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      }
      if ( isDsp( )  || isDlt( )  || isUpd( )  && ( DecimalUtil.compareTo(A419EntUniRem, A418EntUniEnt) != 0 ) )
      {
         edtEntFVal_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtEntFVal_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEntFVal_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      }
      else
      {
         edtEntFVal_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtEntFVal_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEntFVal_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      }
      if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, A418EntUniEnt)==0) )
      {
         GXCCtl = "ENTUNIENT_" + sGXsfl_40_idx ;
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Debe entrar unidades", ""), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtEntUniEnt_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ! ( ( GXutil.strcmp(A3404EntPedCum, "S") == 0 ) || ( GXutil.strcmp(A3404EntPedCum, "N") == 0 ) ) )
      {
         GXCCtl = "ENTPEDCUM_" + sGXsfl_40_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Cerrar?", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = cmbEntPedCum.getInternalname() ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      AV38OldEntPre = O417EntPre ;
      httpContext.ajax_rsp_assign_attri("", false, "AV38OldEntPre", GXutil.ltrimstr( AV38OldEntPre, 14, 5));
      AV48PrecAnt = O417EntPre ;
      httpContext.ajax_rsp_assign_attri("", false, "AV48PrecAnt", GXutil.ltrimstr( AV48PrecAnt, 14, 5));
      if ( isIns( )  )
      {
         nIsDirty_42 = (short)(1) ;
         A750PrdValStk = O750PrdValStk.add(GXutil.roundDecimal( A417EntPre.multiply(A418EntUniEnt), 2)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A750PrdValStk", GXutil.ltrimstr( A750PrdValStk, 11, 2));
      }
      else
      {
         if ( isUpd( )  )
         {
            nIsDirty_42 = (short)(1) ;
            A750PrdValStk = O750PrdValStk.add((GXutil.roundDecimal( A417EntPre.multiply(A418EntUniEnt), 2).subtract(GXutil.roundDecimal( AV38OldEntPre.multiply(AV39OldEntUni), 2)))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A750PrdValStk", GXutil.ltrimstr( A750PrdValStk, 11, 2));
         }
         else
         {
            if ( isDlt( )  )
            {
               nIsDirty_42 = (short)(1) ;
               A750PrdValStk = O750PrdValStk.subtract(GXutil.roundDecimal( A417EntPre.multiply(A418EntUniEnt), 2)) ;
               httpContext.ajax_rsp_assign_attri("", false, "A750PrdValStk", GXutil.ltrimstr( A750PrdValStk, 11, 2));
            }
         }
      }
      if ( ( A704PrdExiAlm.doubleValue() != 0 ) && ( AV14Consumos == 1 ) && ( A750PrdValStk.doubleValue() > 0 ) )
      {
         nIsDirty_42 = (short)(1) ;
         A726PrdPreMed = GXutil.roundDecimal( A750PrdValStk.divide(A704PrdExiAlm, 18, java.math.RoundingMode.DOWN), 3) ;
         httpContext.ajax_rsp_assign_attri("", false, "A726PrdPreMed", GXutil.ltrimstr( A726PrdPreMed, 14, 5));
      }
      else
      {
         if ( ( A704PrdExiAlm.doubleValue() == 0 ) && ( AV14Consumos == 1 ) && ( A750PrdValStk.doubleValue() == 0 ) )
         {
            nIsDirty_42 = (short)(1) ;
            A726PrdPreMed = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A726PrdPreMed", GXutil.ltrimstr( A726PrdPreMed, 14, 5));
         }
         else
         {
            if ( ( ( A704PrdExiAlm.doubleValue() != 0 ) || ( A705PrdExiCC.doubleValue() != 0 ) ) && ( AV14Consumos == 0 ) )
            {
               nIsDirty_42 = (short)(1) ;
               A726PrdPreMed = GXutil.roundDecimal( A750PrdValStk.divide((A704PrdExiAlm.add(A705PrdExiCC)), 18, java.math.RoundingMode.DOWN), 3) ;
               httpContext.ajax_rsp_assign_attri("", false, "A726PrdPreMed", GXutil.ltrimstr( A726PrdPreMed, 14, 5));
            }
            else
            {
               if ( ( A704PrdExiAlm.doubleValue() == 0 ) && ( A705PrdExiCC.doubleValue() == 0 ) && ( AV14Consumos == 0 ) )
               {
                  nIsDirty_42 = (short)(1) ;
                  A726PrdPreMed = DecimalUtil.doubleToDec(0) ;
                  httpContext.ajax_rsp_assign_attri("", false, "A726PrdPreMed", GXutil.ltrimstr( A726PrdPreMed, 14, 5));
               }
            }
         }
      }
      if ( true /* Level */ && true /* After */ && (DecimalUtil.compareTo(DecimalUtil.ZERO, A417EntPre)==0) && (0==AV60FlagPre) )
      {
         GXCCtl = "ENTPRE_" + sGXsfl_40_idx ;
         httpContext.GX_msglist.addItem(httpContext.getMessage( "ERROR.Precio con valor CERO", ""), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtEntPre_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( true /* Level */ && true /* After */ && (DecimalUtil.compareTo(DecimalUtil.ZERO, A417EntPre)==0) && ( AV60FlagPre == 1 ) )
      {
         GXCCtl = "ENTPRE_" + sGXsfl_40_idx ;
         httpContext.GX_msglist.addItem(httpContext.getMessage( "MENSAJE.Precio con valor CERO", ""), 0, GXCCtl);
      }
      AV41oldlote = O5686EntLotN ;
      httpContext.ajax_rsp_assign_attri("", false, "AV41oldlote", AV41oldlote);
      AV42OldRemanente = O419EntUniRem ;
      httpContext.ajax_rsp_assign_attri("", false, "AV42OldRemanente", GXutil.ltrimstr( AV42OldRemanente, 11, 4));
      AV34msg_ctrl_fecha = httpContext.getMessage( httpContext.getMessage( "Atencion.Ultimo Mov Fecha ", ""), "") + GXutil.trim( localUtil.dtoc( A14040PrdUltMovF, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")) + httpContext.getMessage( httpContext.getMessage( " superior a Fecha Mov ", ""), "") + GXutil.trim( localUtil.dtoc( A415EntFecEnt, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV34msg_ctrl_fecha", AV34msg_ctrl_fecha);
   }

   public void closeExtendedTableCursors1SH42( )
   {
      pr_default.close(2);
      pr_default.close(3);
   }

   public void enableDisable1SH42( )
   {
   }

   public void gxload_124( String A396EmprCod ,
                           int A658PedCod )
   {
      /* Using cursor T01SH105 */
      pr_default.execute(99, new Object[] {A396EmprCod, Boolean.valueOf(n658PedCod), Integer.valueOf(A658PedCod)});
      if ( (pr_default.getStatus(99) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A658PedCod) ) )
         {
            GXCCtl = "PEDCOD_" + sGXsfl_40_idx ;
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CPEDID", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
            AnyError = (short)(1) ;
            GX_FocusControl = edtPedCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A661PedFec = T01SH105_A661PedFec[0] ;
      A667PedSit = T01SH105_A667PedSit[0] ;
      A666PedPri = T01SH105_A666PedPri[0] ;
      A12580PedAlmc = T01SH105_A12580PedAlmc[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( localUtil.format(A661PedFec, "99/99/99"))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A667PedSit))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A666PedPri))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A12580PedAlmc, (byte)(1), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(99) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(99);
   }

   public void gxload_125( String A396EmprCod ,
                           int A658PedCod ,
                           String A719PrdNum )
   {
      /* Using cursor T01SH6 */
      pr_default.execute(4, new Object[] {A396EmprCod, Boolean.valueOf(n658PedCod), Integer.valueOf(A658PedCod), Boolean.valueOf(n719PrdNum), A719PrdNum});
      if ( (pr_default.getStatus(4) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A658PedCod) || (GXutil.strcmp("", A719PrdNum)==0) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "LPEDID", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PRDNUM");
            AnyError = (short)(1) ;
            GX_FocusControl = edtPedCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A657PedCanEnt = T01SH6_A657PedCanEnt[0] ;
      A663PedFulEnt = T01SH6_A663PedFulEnt[0] ;
      A665PedPre = T01SH6_A665PedPre[0] ;
      A669PedUni = T01SH6_A669PedUni[0] ;
      A659PedCum = T01SH6_A659PedCum[0] ;
      A660PedDto = T01SH6_A660PedDto[0] ;
      O657PedCanEnt = A657PedCanEnt ;
      httpContext.ajax_rsp_assign_attri("", false, "A657PedCanEnt", GXutil.ltrimstr( A657PedCanEnt, 9, 2));
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A657PedCanEnt, (byte)(9), (byte)(2), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( localUtil.format(A663PedFulEnt, "99/99/99"))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A665PedPre, (byte)(14), (byte)(5), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A669PedUni, (byte)(9), (byte)(2), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A659PedCum))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A660PedDto, (byte)(5), (byte)(2), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(4) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(4);
   }

   public void getKey1SH42( )
   {
      /* Using cursor T01SH106 */
      pr_default.execute(100, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum, Short.valueOf(A597LinEnt)});
      if ( (pr_default.getStatus(100) != 101) )
      {
         RcdFound42 = (short)(1) ;
      }
      else
      {
         RcdFound42 = (short)(0) ;
      }
      pr_default.close(100);
   }

   public void getByPrimaryKey1SH42( )
   {
      /* Using cursor T01SH3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum, Short.valueOf(A597LinEnt)});
      if ( (pr_default.getStatus(1) != 101) && ( T01SH3_A411EntCon[0] == 0 ) )
      {
         zm1SH42( 123) ;
         RcdFound42 = (short)(1) ;
         initializeNonKey1SH42( ) ;
         A597LinEnt = T01SH3_A597LinEnt[0] ;
         A12716EntFabId = T01SH3_A12716EntFabId[0] ;
         A6156EntPrvNum = T01SH3_A6156EntPrvNum[0] ;
         n6156EntPrvNum = T01SH3_n6156EntPrvNum[0] ;
         A415EntFecEnt = T01SH3_A415EntFecEnt[0] ;
         A10184EntRemTpo = T01SH3_A10184EntRemTpo[0] ;
         A3404EntPedCum = T01SH3_A3404EntPedCum[0] ;
         A411EntCon = T01SH3_A411EntCon[0] ;
         A419EntUniRem = T01SH3_A419EntUniRem[0] ;
         A417EntPre = T01SH3_A417EntPre[0] ;
         A11Albaran = T01SH3_A11Albaran[0] ;
         A12857EntNAlbar = T01SH3_A12857EntNAlbar[0] ;
         A418EntUniEnt = T01SH3_A418EntUniEnt[0] ;
         A416EntNumCon = T01SH3_A416EntNumCon[0] ;
         A5686EntLotN = T01SH3_A5686EntLotN[0] ;
         A5685EntFVal = T01SH3_A5685EntFVal[0] ;
         A414EntEti = T01SH3_A414EntEti[0] ;
         A413EntConIni = T01SH3_A413EntConIni[0] ;
         A412EntConFin = T01SH3_A412EntConFin[0] ;
         A5691EntBnc = T01SH3_A5691EntBnc[0] ;
         A7695EntCC = T01SH3_A7695EntCC[0] ;
         A7696EntCCoCod = T01SH3_A7696EntCCoCod[0] ;
         A10782EntUniAlb = T01SH3_A10782EntUniAlb[0] ;
         A10783EntObs = T01SH3_A10783EntObs[0] ;
         A10187EntRemNro = T01SH3_A10187EntRemNro[0] ;
         A10186EntRemFch = T01SH3_A10186EntRemFch[0] ;
         A10185EntRemSuc = T01SH3_A10185EntRemSuc[0] ;
         A13235EntLoteID = T01SH3_A13235EntLoteID[0] ;
         A13456EntUbicaci = T01SH3_A13456EntUbicaci[0] ;
         A5690EntHfCon = T01SH3_A5690EntHfCon[0] ;
         A5689EntFfCon = T01SH3_A5689EntFfCon[0] ;
         A5688EntHiCon = T01SH3_A5688EntHiCon[0] ;
         A5687EntFiCon = T01SH3_A5687EntFiCon[0] ;
         A14035EntNEmb = T01SH3_A14035EntNEmb[0] ;
         A658PedCod = T01SH3_A658PedCod[0] ;
         n658PedCod = T01SH3_n658PedCod[0] ;
         O419EntUniRem = A419EntUniRem ;
         O418EntUniEnt = A418EntUniEnt ;
         O415EntFecEnt = A415EntFecEnt ;
         O417EntPre = A417EntPre ;
         O5686EntLotN = A5686EntLotN ;
         O3404EntPedCum = A3404EntPedCum ;
         Z396EmprCod = A396EmprCod ;
         Z719PrdNum = A719PrdNum ;
         Z597LinEnt = A597LinEnt ;
         sMode42 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load1SH42( ) ;
         Gx_mode = sMode42 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound42 = (short)(0) ;
         initializeNonKey1SH42( ) ;
         sMode42 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1SH42( ) ;
         Gx_mode = sMode42 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1SH42( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency1SH42( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01SH2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum, Short.valueOf(A597LinEnt)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPENTALM"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( Z12716EntFabId != T01SH2_A12716EntFabId[0] ) || ( Z6156EntPrvNum != T01SH2_A6156EntPrvNum[0] ) || !( GXutil.dateCompare(GXutil.resetTime(Z415EntFecEnt), GXutil.resetTime(T01SH2_A415EntFecEnt[0])) ) || ( GXutil.strcmp(Z10184EntRemTpo, T01SH2_A10184EntRemTpo[0]) != 0 ) || ( GXutil.strcmp(Z3404EntPedCum, T01SH2_A3404EntPedCum[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z411EntCon != T01SH2_A411EntCon[0] ) || ( DecimalUtil.compareTo(Z419EntUniRem, T01SH2_A419EntUniRem[0]) != 0 ) || ( DecimalUtil.compareTo(Z417EntPre, T01SH2_A417EntPre[0]) != 0 ) || ( GXutil.strcmp(Z11Albaran, T01SH2_A11Albaran[0]) != 0 ) || ( GXutil.strcmp(Z12857EntNAlbar, T01SH2_A12857EntNAlbar[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( DecimalUtil.compareTo(Z418EntUniEnt, T01SH2_A418EntUniEnt[0]) != 0 ) || ( Z416EntNumCon != T01SH2_A416EntNumCon[0] ) || ( GXutil.strcmp(Z5686EntLotN, T01SH2_A5686EntLotN[0]) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(Z5685EntFVal), GXutil.resetTime(T01SH2_A5685EntFVal[0])) ) || ( Z414EntEti != T01SH2_A414EntEti[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z413EntConIni != T01SH2_A413EntConIni[0] ) || ( Z412EntConFin != T01SH2_A412EntConFin[0] ) || ( GXutil.strcmp(Z5691EntBnc, T01SH2_A5691EntBnc[0]) != 0 ) || ( GXutil.strcmp(Z7695EntCC, T01SH2_A7695EntCC[0]) != 0 ) || ( Z7696EntCCoCod != T01SH2_A7696EntCCoCod[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( DecimalUtil.compareTo(Z10782EntUniAlb, T01SH2_A10782EntUniAlb[0]) != 0 ) || ( GXutil.strcmp(Z10783EntObs, T01SH2_A10783EntObs[0]) != 0 ) || ( GXutil.strcmp(Z10187EntRemNro, T01SH2_A10187EntRemNro[0]) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(Z10186EntRemFch), GXutil.resetTime(T01SH2_A10186EntRemFch[0])) ) || ( GXutil.strcmp(Z10185EntRemSuc, T01SH2_A10185EntRemSuc[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z13235EntLoteID != T01SH2_A13235EntLoteID[0] ) || ( GXutil.strcmp(Z13456EntUbicaci, T01SH2_A13456EntUbicaci[0]) != 0 ) || !( GXutil.dateCompare(Z5690EntHfCon, T01SH2_A5690EntHfCon[0]) ) || !( GXutil.dateCompare(GXutil.resetTime(Z5689EntFfCon), GXutil.resetTime(T01SH2_A5689EntFfCon[0])) ) || !( GXutil.dateCompare(Z5688EntHiCon, T01SH2_A5688EntHiCon[0]) ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || !( GXutil.dateCompare(GXutil.resetTime(Z5687EntFiCon), GXutil.resetTime(T01SH2_A5687EntFiCon[0])) ) || ( Z14035EntNEmb != T01SH2_A14035EntNEmb[0] ) || ( Z658PedCod != T01SH2_A658PedCod[0] ) )
         {
            if ( Z12716EntFabId != T01SH2_A12716EntFabId[0] )
            {
               GXutil.writeLogln("entradaproducto:[seudo value changed for attri]"+"EntFabId");
               GXutil.writeLogRaw("Old: ",Z12716EntFabId);
               GXutil.writeLogRaw("Current: ",T01SH2_A12716EntFabId[0]);
            }
            if ( Z6156EntPrvNum != T01SH2_A6156EntPrvNum[0] )
            {
               GXutil.writeLogln("entradaproducto:[seudo value changed for attri]"+"EntPrvNum");
               GXutil.writeLogRaw("Old: ",Z6156EntPrvNum);
               GXutil.writeLogRaw("Current: ",T01SH2_A6156EntPrvNum[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z415EntFecEnt), GXutil.resetTime(T01SH2_A415EntFecEnt[0])) ) )
            {
               GXutil.writeLogln("entradaproducto:[seudo value changed for attri]"+"EntFecEnt");
               GXutil.writeLogRaw("Old: ",Z415EntFecEnt);
               GXutil.writeLogRaw("Current: ",T01SH2_A415EntFecEnt[0]);
            }
            if ( GXutil.strcmp(Z10184EntRemTpo, T01SH2_A10184EntRemTpo[0]) != 0 )
            {
               GXutil.writeLogln("entradaproducto:[seudo value changed for attri]"+"EntRemTpo");
               GXutil.writeLogRaw("Old: ",Z10184EntRemTpo);
               GXutil.writeLogRaw("Current: ",T01SH2_A10184EntRemTpo[0]);
            }
            if ( GXutil.strcmp(Z3404EntPedCum, T01SH2_A3404EntPedCum[0]) != 0 )
            {
               GXutil.writeLogln("entradaproducto:[seudo value changed for attri]"+"EntPedCum");
               GXutil.writeLogRaw("Old: ",Z3404EntPedCum);
               GXutil.writeLogRaw("Current: ",T01SH2_A3404EntPedCum[0]);
            }
            if ( Z411EntCon != T01SH2_A411EntCon[0] )
            {
               GXutil.writeLogln("entradaproducto:[seudo value changed for attri]"+"EntCon");
               GXutil.writeLogRaw("Old: ",Z411EntCon);
               GXutil.writeLogRaw("Current: ",T01SH2_A411EntCon[0]);
            }
            if ( DecimalUtil.compareTo(Z419EntUniRem, T01SH2_A419EntUniRem[0]) != 0 )
            {
               GXutil.writeLogln("entradaproducto:[seudo value changed for attri]"+"EntUniRem");
               GXutil.writeLogRaw("Old: ",Z419EntUniRem);
               GXutil.writeLogRaw("Current: ",T01SH2_A419EntUniRem[0]);
            }
            if ( DecimalUtil.compareTo(Z417EntPre, T01SH2_A417EntPre[0]) != 0 )
            {
               GXutil.writeLogln("entradaproducto:[seudo value changed for attri]"+"EntPre");
               GXutil.writeLogRaw("Old: ",Z417EntPre);
               GXutil.writeLogRaw("Current: ",T01SH2_A417EntPre[0]);
            }
            if ( GXutil.strcmp(Z11Albaran, T01SH2_A11Albaran[0]) != 0 )
            {
               GXutil.writeLogln("entradaproducto:[seudo value changed for attri]"+"Albaran");
               GXutil.writeLogRaw("Old: ",Z11Albaran);
               GXutil.writeLogRaw("Current: ",T01SH2_A11Albaran[0]);
            }
            if ( GXutil.strcmp(Z12857EntNAlbar, T01SH2_A12857EntNAlbar[0]) != 0 )
            {
               GXutil.writeLogln("entradaproducto:[seudo value changed for attri]"+"EntNAlbar");
               GXutil.writeLogRaw("Old: ",Z12857EntNAlbar);
               GXutil.writeLogRaw("Current: ",T01SH2_A12857EntNAlbar[0]);
            }
            if ( DecimalUtil.compareTo(Z418EntUniEnt, T01SH2_A418EntUniEnt[0]) != 0 )
            {
               GXutil.writeLogln("entradaproducto:[seudo value changed for attri]"+"EntUniEnt");
               GXutil.writeLogRaw("Old: ",Z418EntUniEnt);
               GXutil.writeLogRaw("Current: ",T01SH2_A418EntUniEnt[0]);
            }
            if ( Z416EntNumCon != T01SH2_A416EntNumCon[0] )
            {
               GXutil.writeLogln("entradaproducto:[seudo value changed for attri]"+"EntNumCon");
               GXutil.writeLogRaw("Old: ",Z416EntNumCon);
               GXutil.writeLogRaw("Current: ",T01SH2_A416EntNumCon[0]);
            }
            if ( GXutil.strcmp(Z5686EntLotN, T01SH2_A5686EntLotN[0]) != 0 )
            {
               GXutil.writeLogln("entradaproducto:[seudo value changed for attri]"+"EntLotN");
               GXutil.writeLogRaw("Old: ",Z5686EntLotN);
               GXutil.writeLogRaw("Current: ",T01SH2_A5686EntLotN[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z5685EntFVal), GXutil.resetTime(T01SH2_A5685EntFVal[0])) ) )
            {
               GXutil.writeLogln("entradaproducto:[seudo value changed for attri]"+"EntFVal");
               GXutil.writeLogRaw("Old: ",Z5685EntFVal);
               GXutil.writeLogRaw("Current: ",T01SH2_A5685EntFVal[0]);
            }
            if ( Z414EntEti != T01SH2_A414EntEti[0] )
            {
               GXutil.writeLogln("entradaproducto:[seudo value changed for attri]"+"EntEti");
               GXutil.writeLogRaw("Old: ",Z414EntEti);
               GXutil.writeLogRaw("Current: ",T01SH2_A414EntEti[0]);
            }
            if ( Z413EntConIni != T01SH2_A413EntConIni[0] )
            {
               GXutil.writeLogln("entradaproducto:[seudo value changed for attri]"+"EntConIni");
               GXutil.writeLogRaw("Old: ",Z413EntConIni);
               GXutil.writeLogRaw("Current: ",T01SH2_A413EntConIni[0]);
            }
            if ( Z412EntConFin != T01SH2_A412EntConFin[0] )
            {
               GXutil.writeLogln("entradaproducto:[seudo value changed for attri]"+"EntConFin");
               GXutil.writeLogRaw("Old: ",Z412EntConFin);
               GXutil.writeLogRaw("Current: ",T01SH2_A412EntConFin[0]);
            }
            if ( GXutil.strcmp(Z5691EntBnc, T01SH2_A5691EntBnc[0]) != 0 )
            {
               GXutil.writeLogln("entradaproducto:[seudo value changed for attri]"+"EntBnc");
               GXutil.writeLogRaw("Old: ",Z5691EntBnc);
               GXutil.writeLogRaw("Current: ",T01SH2_A5691EntBnc[0]);
            }
            if ( GXutil.strcmp(Z7695EntCC, T01SH2_A7695EntCC[0]) != 0 )
            {
               GXutil.writeLogln("entradaproducto:[seudo value changed for attri]"+"EntCC");
               GXutil.writeLogRaw("Old: ",Z7695EntCC);
               GXutil.writeLogRaw("Current: ",T01SH2_A7695EntCC[0]);
            }
            if ( Z7696EntCCoCod != T01SH2_A7696EntCCoCod[0] )
            {
               GXutil.writeLogln("entradaproducto:[seudo value changed for attri]"+"EntCCoCod");
               GXutil.writeLogRaw("Old: ",Z7696EntCCoCod);
               GXutil.writeLogRaw("Current: ",T01SH2_A7696EntCCoCod[0]);
            }
            if ( DecimalUtil.compareTo(Z10782EntUniAlb, T01SH2_A10782EntUniAlb[0]) != 0 )
            {
               GXutil.writeLogln("entradaproducto:[seudo value changed for attri]"+"EntUniAlb");
               GXutil.writeLogRaw("Old: ",Z10782EntUniAlb);
               GXutil.writeLogRaw("Current: ",T01SH2_A10782EntUniAlb[0]);
            }
            if ( GXutil.strcmp(Z10783EntObs, T01SH2_A10783EntObs[0]) != 0 )
            {
               GXutil.writeLogln("entradaproducto:[seudo value changed for attri]"+"EntObs");
               GXutil.writeLogRaw("Old: ",Z10783EntObs);
               GXutil.writeLogRaw("Current: ",T01SH2_A10783EntObs[0]);
            }
            if ( GXutil.strcmp(Z10187EntRemNro, T01SH2_A10187EntRemNro[0]) != 0 )
            {
               GXutil.writeLogln("entradaproducto:[seudo value changed for attri]"+"EntRemNro");
               GXutil.writeLogRaw("Old: ",Z10187EntRemNro);
               GXutil.writeLogRaw("Current: ",T01SH2_A10187EntRemNro[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z10186EntRemFch), GXutil.resetTime(T01SH2_A10186EntRemFch[0])) ) )
            {
               GXutil.writeLogln("entradaproducto:[seudo value changed for attri]"+"EntRemFch");
               GXutil.writeLogRaw("Old: ",Z10186EntRemFch);
               GXutil.writeLogRaw("Current: ",T01SH2_A10186EntRemFch[0]);
            }
            if ( GXutil.strcmp(Z10185EntRemSuc, T01SH2_A10185EntRemSuc[0]) != 0 )
            {
               GXutil.writeLogln("entradaproducto:[seudo value changed for attri]"+"EntRemSuc");
               GXutil.writeLogRaw("Old: ",Z10185EntRemSuc);
               GXutil.writeLogRaw("Current: ",T01SH2_A10185EntRemSuc[0]);
            }
            if ( Z13235EntLoteID != T01SH2_A13235EntLoteID[0] )
            {
               GXutil.writeLogln("entradaproducto:[seudo value changed for attri]"+"EntLoteID");
               GXutil.writeLogRaw("Old: ",Z13235EntLoteID);
               GXutil.writeLogRaw("Current: ",T01SH2_A13235EntLoteID[0]);
            }
            if ( GXutil.strcmp(Z13456EntUbicaci, T01SH2_A13456EntUbicaci[0]) != 0 )
            {
               GXutil.writeLogln("entradaproducto:[seudo value changed for attri]"+"EntUbicaci");
               GXutil.writeLogRaw("Old: ",Z13456EntUbicaci);
               GXutil.writeLogRaw("Current: ",T01SH2_A13456EntUbicaci[0]);
            }
            if ( !( GXutil.dateCompare(Z5690EntHfCon, T01SH2_A5690EntHfCon[0]) ) )
            {
               GXutil.writeLogln("entradaproducto:[seudo value changed for attri]"+"EntHfCon");
               GXutil.writeLogRaw("Old: ",Z5690EntHfCon);
               GXutil.writeLogRaw("Current: ",T01SH2_A5690EntHfCon[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z5689EntFfCon), GXutil.resetTime(T01SH2_A5689EntFfCon[0])) ) )
            {
               GXutil.writeLogln("entradaproducto:[seudo value changed for attri]"+"EntFfCon");
               GXutil.writeLogRaw("Old: ",Z5689EntFfCon);
               GXutil.writeLogRaw("Current: ",T01SH2_A5689EntFfCon[0]);
            }
            if ( !( GXutil.dateCompare(Z5688EntHiCon, T01SH2_A5688EntHiCon[0]) ) )
            {
               GXutil.writeLogln("entradaproducto:[seudo value changed for attri]"+"EntHiCon");
               GXutil.writeLogRaw("Old: ",Z5688EntHiCon);
               GXutil.writeLogRaw("Current: ",T01SH2_A5688EntHiCon[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z5687EntFiCon), GXutil.resetTime(T01SH2_A5687EntFiCon[0])) ) )
            {
               GXutil.writeLogln("entradaproducto:[seudo value changed for attri]"+"EntFiCon");
               GXutil.writeLogRaw("Old: ",Z5687EntFiCon);
               GXutil.writeLogRaw("Current: ",T01SH2_A5687EntFiCon[0]);
            }
            if ( Z14035EntNEmb != T01SH2_A14035EntNEmb[0] )
            {
               GXutil.writeLogln("entradaproducto:[seudo value changed for attri]"+"EntNEmb");
               GXutil.writeLogRaw("Old: ",Z14035EntNEmb);
               GXutil.writeLogRaw("Current: ",T01SH2_A14035EntNEmb[0]);
            }
            if ( Z658PedCod != T01SH2_A658PedCod[0] )
            {
               GXutil.writeLogln("entradaproducto:[seudo value changed for attri]"+"PedCod");
               GXutil.writeLogRaw("Old: ",Z658PedCod);
               GXutil.writeLogRaw("Current: ",T01SH2_A658PedCod[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPENTALM"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
      /* Using cursor T01SH107 */
      pr_default.execute(101, new Object[] {A396EmprCod, Boolean.valueOf(n658PedCod), Integer.valueOf(A658PedCod), Boolean.valueOf(n719PrdNum), A719PrdNum});
      if ( (pr_default.getStatus(101) == 103) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPLPEDID"}), "RecordIsLocked", 1, "");
         AnyError = (short)(1) ;
         return  ;
      }
      if ( ! isIns( ) )
      {
         if ( false || !( GXutil.dateCompare(GXutil.resetTime(Z663PedFulEnt), GXutil.resetTime(T01SH107_A663PedFulEnt[0])) ) || ( DecimalUtil.compareTo(Z665PedPre, T01SH107_A665PedPre[0]) != 0 ) || ( DecimalUtil.compareTo(Z669PedUni, T01SH107_A669PedUni[0]) != 0 ) || ( GXutil.strcmp(Z659PedCum, T01SH107_A659PedCum[0]) != 0 ) || ( DecimalUtil.compareTo(Z660PedDto, T01SH107_A660PedDto[0]) != 0 ) )
         {
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z663PedFulEnt), GXutil.resetTime(T01SH107_A663PedFulEnt[0])) ) )
            {
               GXutil.writeLogln("entradaproducto:[seudo value changed for attri]"+"PedFulEnt");
               GXutil.writeLogRaw("Old: ",Z663PedFulEnt);
               GXutil.writeLogRaw("Current: ",T01SH107_A663PedFulEnt[0]);
            }
            if ( DecimalUtil.compareTo(Z665PedPre, T01SH107_A665PedPre[0]) != 0 )
            {
               GXutil.writeLogln("entradaproducto:[seudo value changed for attri]"+"PedPre");
               GXutil.writeLogRaw("Old: ",Z665PedPre);
               GXutil.writeLogRaw("Current: ",T01SH107_A665PedPre[0]);
            }
            if ( DecimalUtil.compareTo(Z669PedUni, T01SH107_A669PedUni[0]) != 0 )
            {
               GXutil.writeLogln("entradaproducto:[seudo value changed for attri]"+"PedUni");
               GXutil.writeLogRaw("Old: ",Z669PedUni);
               GXutil.writeLogRaw("Current: ",T01SH107_A669PedUni[0]);
            }
            if ( GXutil.strcmp(Z659PedCum, T01SH107_A659PedCum[0]) != 0 )
            {
               GXutil.writeLogln("entradaproducto:[seudo value changed for attri]"+"PedCum");
               GXutil.writeLogRaw("Old: ",Z659PedCum);
               GXutil.writeLogRaw("Current: ",T01SH107_A659PedCum[0]);
            }
            if ( DecimalUtil.compareTo(Z660PedDto, T01SH107_A660PedDto[0]) != 0 )
            {
               GXutil.writeLogln("entradaproducto:[seudo value changed for attri]"+"PedDto");
               GXutil.writeLogRaw("Old: ",Z660PedDto);
               GXutil.writeLogRaw("Current: ",T01SH107_A660PedDto[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPLPEDID"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1SH42( )
   {
      beforeValidate1SH42( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1SH42( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1SH42( 0) ;
         checkOptimisticConcurrency1SH42( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1SH42( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1SH42( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01SH108 */
                  pr_default.execute(102, new Object[] {Short.valueOf(A597LinEnt), Integer.valueOf(A12716EntFabId), Boolean.valueOf(n6156EntPrvNum), Integer.valueOf(A6156EntPrvNum), A415EntFecEnt, A10184EntRemTpo, A3404EntPedCum, Byte.valueOf(A411EntCon), A419EntUniRem, A417EntPre, A11Albaran, A12857EntNAlbar, A418EntUniEnt, Short.valueOf(A416EntNumCon), A5686EntLotN, A5685EntFVal, Byte.valueOf(A414EntEti), Integer.valueOf(A413EntConIni), Integer.valueOf(A412EntConFin), A5691EntBnc, A7695EntCC, Short.valueOf(A7696EntCCoCod), A10782EntUniAlb, A10783EntObs, A10187EntRemNro, A10186EntRemFch, A10185EntRemSuc, Long.valueOf(A13235EntLoteID), A13456EntUbicaci, A5690EntHfCon, A5689EntFfCon, A5688EntHiCon, A5687EntFiCon, Byte.valueOf(A14035EntNEmb), A396EmprCod, Boolean.valueOf(n658PedCod), Integer.valueOf(A658PedCod), Boolean.valueOf(n719PrdNum), A719PrdNum});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPENTALM");
                  if ( (pr_default.getStatus(102) == 1) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
                     AnyError = (short)(1) ;
                  }
                  if ( AnyError == 0 )
                  {
                     updateTablesN11SH42( ) ;
                     /* Start of After( Insert) rules */
                     if ( true /* After */ || true /* After */ )
                     {
                        GXv_char4[0] = A396EmprCod ;
                        GXv_char3[0] = A719PrdNum ;
                        GXv_int8[0] = A6156EntPrvNum ;
                        GXv_decimal12[0] = A417EntPre ;
                        new app.pprenp(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_int8, GXv_decimal12) ;
                        entradaproducto_impl.this.A396EmprCod = GXv_char4[0] ;
                        entradaproducto_impl.this.A719PrdNum = GXv_char3[0] ;
                        entradaproducto_impl.this.A6156EntPrvNum = GXv_int8[0] ;
                        entradaproducto_impl.this.A417EntPre = GXv_decimal12[0] ;
                        httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
                        httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
                     }
                     if ( ! (0==A658PedCod) && ( true /* After */ || true /* After */ ) )
                     {
                        GXv_char4[0] = A396EmprCod ;
                        GXv_int8[0] = A658PedCod ;
                        GXv_char3[0] = A719PrdNum ;
                        GXv_char2[0] = httpContext.getMessage( "INS", "") ;
                        GXv_char13[0] = A3404EntPedCum ;
                        new app.ppedcum2(remoteHandle, context).execute( GXv_char4, GXv_int8, GXv_char3, GXv_char2, GXv_char13) ;
                        entradaproducto_impl.this.A396EmprCod = GXv_char4[0] ;
                        entradaproducto_impl.this.A658PedCod = GXv_int8[0] ;
                        entradaproducto_impl.this.A719PrdNum = GXv_char3[0] ;
                        entradaproducto_impl.this.A3404EntPedCum = GXv_char13[0] ;
                        httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
                        httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
                     }
                     if ( true /* After */ || true /* After */ )
                     {
                        AV26Inc_obs = GXutil.trim( A719PrdNum) + ",# " + GXutil.trim( GXutil.str( A597LinEnt, 4, 0)) + httpContext.getMessage( httpContext.getMessage( ",Fecha ", ""), "") + GXutil.trim( localUtil.dtoc( AV37oldEntFecent, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")) + "/" + GXutil.trim( localUtil.dtoc( A415EntFecEnt, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")) + httpContext.getMessage( httpContext.getMessage( ",Ped ", ""), "") + GXutil.trim( GXutil.str( A658PedCod, 8, 0)) + httpContext.getMessage( httpContext.getMessage( ",Cant ", ""), "") + GXutil.str( AV39OldEntUni, 9, 2) + "/" + GXutil.trim( GXutil.str( A418EntUniEnt, 9, 2)) + httpContext.getMessage( httpContext.getMessage( ",Prec ", ""), "") + GXutil.str( AV38OldEntPre, 14, 5) + "/" + GXutil.trim( GXutil.str( A417EntPre, 14, 5)) + httpContext.getMessage( httpContext.getMessage( ",Rema ", ""), "") + GXutil.trim( GXutil.str( AV42OldRemanente, 11, 4)) + "/" + GXutil.trim( GXutil.str( A419EntUniRem, 11, 4)) + httpContext.getMessage( httpContext.getMessage( ",Lote ", ""), "") + GXutil.trim( AV41oldlote) + "/" + GXutil.trim( A5686EntLotN) ;
                        httpContext.ajax_rsp_assign_attri("", false, "AV26Inc_obs", AV26Inc_obs);
                     }
                     if ( true /* After */ || true /* After */ )
                     {
                        new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV62Pgmname, AV56UsurCod, AV50Station, AV26Inc_obs, 99999999, (byte)(0), " ") ;
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
            load1SH42( ) ;
         }
         endLevel1SH42( ) ;
      }
      closeExtendedTableCursors1SH42( ) ;
   }

   public void update1SH42( )
   {
      beforeValidate1SH42( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1SH42( ) ;
      }
      if ( ( nIsMod_42 != 0 ) || ( nIsDirty_42 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency1SH42( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm1SH42( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate1SH42( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T01SH109 */
                     pr_default.execute(103, new Object[] {Integer.valueOf(A12716EntFabId), Boolean.valueOf(n6156EntPrvNum), Integer.valueOf(A6156EntPrvNum), A415EntFecEnt, A10184EntRemTpo, A3404EntPedCum, Byte.valueOf(A411EntCon), A419EntUniRem, A417EntPre, A11Albaran, A12857EntNAlbar, A418EntUniEnt, Short.valueOf(A416EntNumCon), A5686EntLotN, A5685EntFVal, Byte.valueOf(A414EntEti), Integer.valueOf(A413EntConIni), Integer.valueOf(A412EntConFin), A5691EntBnc, A7695EntCC, Short.valueOf(A7696EntCCoCod), A10782EntUniAlb, A10783EntObs, A10187EntRemNro, A10186EntRemFch, A10185EntRemSuc, Long.valueOf(A13235EntLoteID), A13456EntUbicaci, A5690EntHfCon, A5689EntFfCon, A5688EntHiCon, A5687EntFiCon, Byte.valueOf(A14035EntNEmb), Boolean.valueOf(n658PedCod), Integer.valueOf(A658PedCod), A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum, Short.valueOf(A597LinEnt)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPENTALM");
                     if ( (pr_default.getStatus(103) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPENTALM"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate1SH42( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        if ( true /* After */ || true /* After */ )
                        {
                           GXv_char13[0] = A396EmprCod ;
                           GXv_char4[0] = A719PrdNum ;
                           GXv_int8[0] = A6156EntPrvNum ;
                           GXv_decimal12[0] = A417EntPre ;
                           new app.pprenp(remoteHandle, context).execute( GXv_char13, GXv_char4, GXv_int8, GXv_decimal12) ;
                           entradaproducto_impl.this.A396EmprCod = GXv_char13[0] ;
                           entradaproducto_impl.this.A719PrdNum = GXv_char4[0] ;
                           entradaproducto_impl.this.A6156EntPrvNum = GXv_int8[0] ;
                           entradaproducto_impl.this.A417EntPre = GXv_decimal12[0] ;
                           httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
                           httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
                        }
                        if ( ! (0==A658PedCod) && ( true /* After */ || true /* After */ ) )
                        {
                           GXv_char13[0] = A396EmprCod ;
                           GXv_int8[0] = A658PedCod ;
                           GXv_char4[0] = A719PrdNum ;
                           GXv_char3[0] = httpContext.getMessage( "INS", "") ;
                           GXv_char2[0] = A3404EntPedCum ;
                           new app.ppedcum2(remoteHandle, context).execute( GXv_char13, GXv_int8, GXv_char4, GXv_char3, GXv_char2) ;
                           entradaproducto_impl.this.A396EmprCod = GXv_char13[0] ;
                           entradaproducto_impl.this.A658PedCod = GXv_int8[0] ;
                           entradaproducto_impl.this.A719PrdNum = GXv_char4[0] ;
                           entradaproducto_impl.this.A3404EntPedCum = GXv_char2[0] ;
                           httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
                           httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
                        }
                        if ( true /* After */ || true /* After */ )
                        {
                           AV26Inc_obs = GXutil.trim( A719PrdNum) + ",# " + GXutil.trim( GXutil.str( A597LinEnt, 4, 0)) + httpContext.getMessage( httpContext.getMessage( ",Fecha ", ""), "") + GXutil.trim( localUtil.dtoc( AV37oldEntFecent, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")) + "/" + GXutil.trim( localUtil.dtoc( A415EntFecEnt, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")) + httpContext.getMessage( httpContext.getMessage( ",Ped ", ""), "") + GXutil.trim( GXutil.str( A658PedCod, 8, 0)) + httpContext.getMessage( httpContext.getMessage( ",Cant ", ""), "") + GXutil.str( AV39OldEntUni, 9, 2) + "/" + GXutil.trim( GXutil.str( A418EntUniEnt, 9, 2)) + httpContext.getMessage( httpContext.getMessage( ",Prec ", ""), "") + GXutil.str( AV38OldEntPre, 14, 5) + "/" + GXutil.trim( GXutil.str( A417EntPre, 14, 5)) + httpContext.getMessage( httpContext.getMessage( ",Rema ", ""), "") + GXutil.trim( GXutil.str( AV42OldRemanente, 11, 4)) + "/" + GXutil.trim( GXutil.str( A419EntUniRem, 11, 4)) + httpContext.getMessage( httpContext.getMessage( ",Lote ", ""), "") + GXutil.trim( AV41oldlote) + "/" + GXutil.trim( A5686EntLotN) ;
                           httpContext.ajax_rsp_assign_attri("", false, "AV26Inc_obs", AV26Inc_obs);
                        }
                        if ( true /* After */ || true /* After */ )
                        {
                           new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV62Pgmname, AV56UsurCod, AV50Station, AV26Inc_obs, 99999999, (byte)(0), " ") ;
                        }
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           updateTablesN11SH42( ) ;
                           getByPrimaryKey1SH42( ) ;
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
            endLevel1SH42( ) ;
         }
      }
      closeExtendedTableCursors1SH42( ) ;
   }

   public void deferredUpdate1SH42( )
   {
   }

   public void delete1SH42( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1SH42( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1SH42( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1SH42( ) ;
         afterConfirm1SH42( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1SH42( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01SH110 */
               pr_default.execute(104, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum, Short.valueOf(A597LinEnt)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPENTALM");
               if ( AnyError == 0 )
               {
                  updateTablesN11SH42( ) ;
                  /* Start of After( delete) rules */
                  if ( ! (0==A658PedCod) && true /* After */ )
                  {
                     GXv_char13[0] = A396EmprCod ;
                     GXv_int8[0] = A658PedCod ;
                     GXv_char4[0] = A719PrdNum ;
                     GXv_char3[0] = httpContext.getMessage( "DEL", "") ;
                     GXv_char2[0] = A3404EntPedCum ;
                     new app.ppedcum2(remoteHandle, context).execute( GXv_char13, GXv_int8, GXv_char4, GXv_char3, GXv_char2) ;
                     entradaproducto_impl.this.A396EmprCod = GXv_char13[0] ;
                     entradaproducto_impl.this.A658PedCod = GXv_int8[0] ;
                     entradaproducto_impl.this.A719PrdNum = GXv_char4[0] ;
                     entradaproducto_impl.this.A3404EntPedCum = GXv_char2[0] ;
                     httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
                     httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
                  }
                  if ( true /* After */ )
                  {
                     AV26Inc_obs = GXutil.trim( A719PrdNum) + ",# " + GXutil.trim( GXutil.str( A597LinEnt, 4, 0)) + httpContext.getMessage( httpContext.getMessage( ",Fecha ", ""), "") + GXutil.trim( localUtil.dtoc( A415EntFecEnt, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")) + httpContext.getMessage( httpContext.getMessage( ",Ped ", ""), "") + GXutil.trim( GXutil.str( A658PedCod, 8, 0)) + httpContext.getMessage( httpContext.getMessage( ",Cant ", ""), "") + GXutil.trim( GXutil.str( A418EntUniEnt, 9, 2)) + httpContext.getMessage( httpContext.getMessage( ",Prec ", ""), "") + GXutil.str( AV38OldEntPre, 14, 5) + "/" + GXutil.trim( GXutil.str( A417EntPre, 14, 5)) + httpContext.getMessage( httpContext.getMessage( ",Rema ", ""), "") + GXutil.trim( GXutil.str( AV42OldRemanente, 11, 4)) + httpContext.getMessage( httpContext.getMessage( ",Lote ", ""), "") + GXutil.trim( A5686EntLotN) ;
                     httpContext.ajax_rsp_assign_attri("", false, "AV26Inc_obs", AV26Inc_obs);
                  }
                  if ( true /* After */ )
                  {
                     new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV62Pgmname, AV56UsurCod, AV50Station, AV26Inc_obs, 99999999, (byte)(0), " ") ;
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
      sMode42 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1SH42( ) ;
      Gx_mode = sMode42 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1SH42( )
   {
      standaloneModal1SH42( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         if ( true /* Level */ && true /* After */ && GXutil.resetTime(A415EntFecEnt).after( GXutil.resetTime( Gx_date )) && isIns( )  )
         {
            GXCCtl = "ENTFECENT_" + sGXsfl_40_idx ;
            httpContext.GX_msglist.addItem(httpContext.getMessage( "ERROR.Fecha Entrada mayor a la Fecha del Dia", ""), 1, GXCCtl);
            AnyError = (short)(1) ;
            GX_FocusControl = edtEntFecEnt_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         if ( true /* After */ && ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A14040PrdUltMovF)) && GXutil.resetTime(A14040PrdUltMovF).after( GXutil.resetTime( A415EntFecEnt )) && ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A415EntFecEnt)) && ( isIns( )  || isUpd( )  ) && ( AV25FlagFecCcs == 0 ) )
         {
            GXCCtl = "ENTFECENT_" + sGXsfl_40_idx ;
            httpContext.GX_msglist.addItem(AV34msg_ctrl_fecha, 1, GXCCtl);
            AnyError = (short)(1) ;
            GX_FocusControl = edtEntFecEnt_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         if ( true /* Level */ && true /* After */ && ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A14040PrdUltMovF)) && GXutil.resetTime(A14040PrdUltMovF).after( GXutil.resetTime( A415EntFecEnt )) && ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A415EntFecEnt)) && ( isIns( )  || isUpd( )  ) && ( AV25FlagFecCcs == 1 ) )
         {
            GXCCtl = "ENTFECENT_" + sGXsfl_40_idx ;
            httpContext.GX_msglist.addItem(AV34msg_ctrl_fecha, 0, GXCCtl);
         }
         AV59Year = (short)(GXutil.year( A415EntFecEnt)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV59Year", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV59Year), 4, 0));
         AV23Fecha = localUtil.ymdtod( AV59Year, 12, 1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV23Fecha", localUtil.format(AV23Fecha, "99/99/99"));
         AV30Mes = (byte)(GXutil.month( A415EntFecEnt)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV30Mes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV30Mes), 2, 0));
         AV37oldEntFecent = O415EntFecEnt ;
         httpContext.ajax_rsp_assign_attri("", false, "AV37oldEntFecent", localUtil.format(AV37oldEntFecent, "99/99/99"));
         AV22FecAnt = O415EntFecEnt ;
         httpContext.ajax_rsp_assign_attri("", false, "AV22FecAnt", localUtil.format(AV22FecAnt, "99/99/99"));
         AV12AnyAnt = (short)(GXutil.year( O415EntFecEnt)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV12AnyAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12AnyAnt), 4, 0));
         AV31MesAnt = (byte)(GXutil.month( O415EntFecEnt)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV31MesAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV31MesAnt), 2, 0));
         if ( ( isIns( )  || isUpd( )  ) && ( AV36NoUpd == 0 ) )
         {
            A713PrdFulEnt = A415EntFecEnt ;
            httpContext.ajax_rsp_assign_attri("", false, "A713PrdFulEnt", localUtil.format(A713PrdFulEnt, "99/99/99"));
         }
         if ( ( isIns( )  || isUpd( )  ) && ( AV36NoUpd == 0 ) )
         {
            A709PrdFecPre = A415EntFecEnt ;
            httpContext.ajax_rsp_assign_attri("", false, "A709PrdFecPre", localUtil.format(A709PrdFecPre, "99/99/99"));
         }
         AV17DiasFin = (short)(GXutil.ddiff(GXutil.eomdate( AV23Fecha),A415EntFecEnt)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV17DiasFin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV17DiasFin), 3, 0));
         /* Using cursor T01SH111 */
         pr_default.execute(105, new Object[] {A396EmprCod, Boolean.valueOf(n658PedCod), Integer.valueOf(A658PedCod)});
         A661PedFec = T01SH111_A661PedFec[0] ;
         A667PedSit = T01SH111_A667PedSit[0] ;
         A666PedPri = T01SH111_A666PedPri[0] ;
         A12580PedAlmc = T01SH111_A12580PedAlmc[0] ;
         pr_default.close(105);
         /* Using cursor T01SH112 */
         pr_default.execute(106, new Object[] {A396EmprCod, Boolean.valueOf(n658PedCod), Integer.valueOf(A658PedCod), Boolean.valueOf(n719PrdNum), A719PrdNum});
         Z663PedFulEnt = T01SH112_A663PedFulEnt[0] ;
         Z665PedPre = T01SH112_A665PedPre[0] ;
         Z669PedUni = T01SH112_A669PedUni[0] ;
         Z659PedCum = T01SH112_A659PedCum[0] ;
         Z660PedDto = T01SH112_A660PedDto[0] ;
         A657PedCanEnt = T01SH112_A657PedCanEnt[0] ;
         A663PedFulEnt = T01SH112_A663PedFulEnt[0] ;
         A665PedPre = T01SH112_A665PedPre[0] ;
         A669PedUni = T01SH112_A669PedUni[0] ;
         A659PedCum = T01SH112_A659PedCum[0] ;
         A660PedDto = T01SH112_A660PedDto[0] ;
         O657PedCanEnt = A657PedCanEnt ;
         httpContext.ajax_rsp_assign_attri("", false, "A657PedCanEnt", GXutil.ltrimstr( A657PedCanEnt, 9, 2));
         pr_default.close(106);
         if ( true )
         {
            AV44PedPri = GXutil.str( A800PrvPri, 1, 0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV44PedPri", AV44PedPri);
         }
         else
         {
            if ( true /* Level */ && ! (0==A658PedCod) )
            {
               AV44PedPri = A666PedPri ;
               httpContext.ajax_rsp_assign_attri("", false, "AV44PedPri", AV44PedPri);
            }
         }
         if ( ( A684PrdCanPen.doubleValue() < 0 ) && ! (0==A658PedCod) )
         {
            A684PrdCanPen = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A684PrdCanPen", GXutil.ltrimstr( A684PrdCanPen, 12, 4));
         }
         A664PedNumLin = (short)(getPedNumLin0( A396EmprCod, A658PedCod)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A664PedNumLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A664PedNumLin), 3, 0));
         if ( true /* After */ )
         {
            GXt_char1 = AV45PrdNomX ;
            GXv_char13[0] = A396EmprCod ;
            GXv_int8[0] = A6156EntPrvNum ;
            GXv_char4[0] = GXt_char1 ;
            new app.pctrprv(remoteHandle, context).execute( GXv_char13, GXv_int8, GXv_char4) ;
            entradaproducto_impl.this.A396EmprCod = GXv_char13[0] ;
            entradaproducto_impl.this.A6156EntPrvNum = GXv_int8[0] ;
            entradaproducto_impl.this.GXt_char1 = GXv_char4[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            AV45PrdNomX = GXt_char1 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV45PrdNomX", AV45PrdNomX);
         }
         if ( isDlt( )  )
         {
            A704PrdExiAlm = O704PrdExiAlm.subtract(O418EntUniEnt) ;
            httpContext.ajax_rsp_assign_attri("", false, "A704PrdExiAlm", GXutil.ltrimstr( A704PrdExiAlm, 12, 4));
         }
         else
         {
            if ( isIns( )  || isUpd( )  || isDlt( )  )
            {
               A704PrdExiAlm = O704PrdExiAlm.add(A418EntUniEnt).subtract(O418EntUniEnt) ;
               httpContext.ajax_rsp_assign_attri("", false, "A704PrdExiAlm", GXutil.ltrimstr( A704PrdExiAlm, 12, 4));
            }
         }
         AV40OldExiAlm = O704PrdExiAlm ;
         httpContext.ajax_rsp_assign_attri("", false, "AV40OldExiAlm", GXutil.ltrimstr( AV40OldExiAlm, 12, 4));
         AV39OldEntUni = O418EntUniEnt ;
         httpContext.ajax_rsp_assign_attri("", false, "AV39OldEntUni", GXutil.ltrimstr( AV39OldEntUni, 9, 2));
         AV55UniOld = O418EntUniEnt ;
         httpContext.ajax_rsp_assign_attri("", false, "AV55UniOld", GXutil.ltrimstr( AV55UniOld, 9, 2));
         if ( isIns( )  && ! (0==A658PedCod) )
         {
            A657PedCanEnt = O657PedCanEnt.add(A418EntUniEnt) ;
            httpContext.ajax_rsp_assign_attri("", false, "A657PedCanEnt", GXutil.ltrimstr( A657PedCanEnt, 9, 2));
         }
         else
         {
            if ( isUpd( )  && ! (0==A658PedCod) )
            {
               A657PedCanEnt = O657PedCanEnt.add(A418EntUniEnt).subtract(O418EntUniEnt) ;
               httpContext.ajax_rsp_assign_attri("", false, "A657PedCanEnt", GXutil.ltrimstr( A657PedCanEnt, 9, 2));
            }
            else
            {
               if ( isDlt( )  && ! (0==A658PedCod) )
               {
                  A657PedCanEnt = O657PedCanEnt.subtract(A418EntUniEnt) ;
                  httpContext.ajax_rsp_assign_attri("", false, "A657PedCanEnt", GXutil.ltrimstr( A657PedCanEnt, 9, 2));
               }
            }
         }
         if ( ( ( DecimalUtil.compareTo(A657PedCanEnt, A669PedUni) == 0 ) ) && ! (0==A658PedCod) )
         {
            A14041EntCump = "S" ;
         }
         else
         {
            if ( ( ( DecimalUtil.compareTo(A657PedCanEnt, A669PedUni) > 0 ) ) && ! (0==A658PedCod) )
            {
               A14041EntCump = "S" ;
            }
            else
            {
               if ( ( DecimalUtil.compareTo(A657PedCanEnt, A669PedUni) < 0 ) && ! (0==A658PedCod) )
               {
                  A14041EntCump = "N" ;
               }
               else
               {
                  if ( (0==A658PedCod) )
                  {
                     A14041EntCump = "S" ;
                  }
                  else
                  {
                     A14041EntCump = "" ;
                  }
               }
            }
         }
         AV38OldEntPre = O417EntPre ;
         httpContext.ajax_rsp_assign_attri("", false, "AV38OldEntPre", GXutil.ltrimstr( AV38OldEntPre, 14, 5));
         AV48PrecAnt = O417EntPre ;
         httpContext.ajax_rsp_assign_attri("", false, "AV48PrecAnt", GXutil.ltrimstr( AV48PrecAnt, 14, 5));
         if ( isIns( )  )
         {
            A750PrdValStk = O750PrdValStk.add(GXutil.roundDecimal( A417EntPre.multiply(A418EntUniEnt), 2)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A750PrdValStk", GXutil.ltrimstr( A750PrdValStk, 11, 2));
         }
         else
         {
            if ( isUpd( )  )
            {
               A750PrdValStk = O750PrdValStk.add((GXutil.roundDecimal( A417EntPre.multiply(A418EntUniEnt), 2).subtract(GXutil.roundDecimal( AV38OldEntPre.multiply(AV39OldEntUni), 2)))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A750PrdValStk", GXutil.ltrimstr( A750PrdValStk, 11, 2));
            }
            else
            {
               if ( isDlt( )  )
               {
                  A750PrdValStk = O750PrdValStk.subtract(GXutil.roundDecimal( A417EntPre.multiply(A418EntUniEnt), 2)) ;
                  httpContext.ajax_rsp_assign_attri("", false, "A750PrdValStk", GXutil.ltrimstr( A750PrdValStk, 11, 2));
               }
            }
         }
         if ( ( A704PrdExiAlm.doubleValue() != 0 ) && ( AV14Consumos == 1 ) && ( A750PrdValStk.doubleValue() > 0 ) )
         {
            A726PrdPreMed = GXutil.roundDecimal( A750PrdValStk.divide(A704PrdExiAlm, 18, java.math.RoundingMode.DOWN), 3) ;
            httpContext.ajax_rsp_assign_attri("", false, "A726PrdPreMed", GXutil.ltrimstr( A726PrdPreMed, 14, 5));
         }
         else
         {
            if ( ( A704PrdExiAlm.doubleValue() == 0 ) && ( AV14Consumos == 1 ) && ( A750PrdValStk.doubleValue() == 0 ) )
            {
               A726PrdPreMed = DecimalUtil.doubleToDec(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A726PrdPreMed", GXutil.ltrimstr( A726PrdPreMed, 14, 5));
            }
            else
            {
               if ( ( ( A704PrdExiAlm.doubleValue() != 0 ) || ( A705PrdExiCC.doubleValue() != 0 ) ) && ( AV14Consumos == 0 ) )
               {
                  A726PrdPreMed = GXutil.roundDecimal( A750PrdValStk.divide((A704PrdExiAlm.add(A705PrdExiCC)), 18, java.math.RoundingMode.DOWN), 3) ;
                  httpContext.ajax_rsp_assign_attri("", false, "A726PrdPreMed", GXutil.ltrimstr( A726PrdPreMed, 14, 5));
               }
               else
               {
                  if ( ( A704PrdExiAlm.doubleValue() == 0 ) && ( A705PrdExiCC.doubleValue() == 0 ) && ( AV14Consumos == 0 ) )
                  {
                     A726PrdPreMed = DecimalUtil.doubleToDec(0) ;
                     httpContext.ajax_rsp_assign_attri("", false, "A726PrdPreMed", GXutil.ltrimstr( A726PrdPreMed, 14, 5));
                  }
               }
            }
         }
         if ( ( AV36NoUpd == 0 ) && ( isIns( )  || isUpd( )  ) )
         {
            A724PrdPreAct = A417EntPre ;
            httpContext.ajax_rsp_assign_attri("", false, "A724PrdPreAct", GXutil.ltrimstr( A724PrdPreAct, 14, 5));
         }
         if ( ( isIns( )  || isUpd( )  ) && ( AV36NoUpd == 0 ) )
         {
            A725PrdPreAnt = O724PrdPreAct ;
            httpContext.ajax_rsp_assign_attri("", false, "A725PrdPreAnt", GXutil.ltrimstr( A725PrdPreAnt, 14, 5));
         }
         AV41oldlote = O5686EntLotN ;
         httpContext.ajax_rsp_assign_attri("", false, "AV41oldlote", AV41oldlote);
         AV42OldRemanente = O419EntUniRem ;
         httpContext.ajax_rsp_assign_attri("", false, "AV42OldRemanente", GXutil.ltrimstr( AV42OldRemanente, 11, 4));
         if ( isDsp( )  || (0==A658PedCod) )
         {
            cmbEntPedCum.setEnabled( 0 );
            httpContext.ajax_rsp_assign_prop("", false, cmbEntPedCum.getInternalname(), "Enabled", GXutil.ltrimstr( cmbEntPedCum.getEnabled(), 5, 0), !bGXsfl_40_Refreshing);
         }
         else
         {
            if ( isUpd( )  && ( DecimalUtil.compareTo(A419EntUniRem, A418EntUniEnt) != 0 ) )
            {
               cmbEntPedCum.setEnabled( 0 );
               httpContext.ajax_rsp_assign_prop("", false, cmbEntPedCum.getInternalname(), "Enabled", GXutil.ltrimstr( cmbEntPedCum.getEnabled(), 5, 0), !bGXsfl_40_Refreshing);
            }
            else
            {
               cmbEntPedCum.setEnabled( 1 );
               httpContext.ajax_rsp_assign_prop("", false, cmbEntPedCum.getInternalname(), "Enabled", GXutil.ltrimstr( cmbEntPedCum.getEnabled(), 5, 0), !bGXsfl_40_Refreshing);
            }
         }
         if ( isDsp( )  || isDlt( )  || isUpd( )  && ( DecimalUtil.compareTo(A419EntUniRem, A418EntUniEnt) != 0 ) )
         {
            edtEntFecEnt_Enabled = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, edtEntFecEnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEntFecEnt_Enabled), 5, 0), !bGXsfl_40_Refreshing);
         }
         else
         {
            edtEntFecEnt_Enabled = 1 ;
            httpContext.ajax_rsp_assign_prop("", false, edtEntFecEnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEntFecEnt_Enabled), 5, 0), !bGXsfl_40_Refreshing);
         }
         if ( isDsp( )  || isDlt( )  || isUpd( )  && ( DecimalUtil.compareTo(A419EntUniRem, A418EntUniEnt) != 0 ) )
         {
            edtAlbaran_Enabled = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbaran_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbaran_Enabled), 5, 0), !bGXsfl_40_Refreshing);
         }
         else
         {
            edtAlbaran_Enabled = 1 ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbaran_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbaran_Enabled), 5, 0), !bGXsfl_40_Refreshing);
         }
         if ( isDsp( )  || isDlt( )  || isUpd( )  && ( DecimalUtil.compareTo(A419EntUniRem, A418EntUniEnt) != 0 ) )
         {
            edtEntNAlbar_Enabled = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, edtEntNAlbar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEntNAlbar_Enabled), 5, 0), !bGXsfl_40_Refreshing);
         }
         else
         {
            edtEntNAlbar_Enabled = 1 ;
            httpContext.ajax_rsp_assign_prop("", false, edtEntNAlbar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEntNAlbar_Enabled), 5, 0), !bGXsfl_40_Refreshing);
         }
         if ( isDsp( )  || isDlt( )  || isUpd( )  && ( DecimalUtil.compareTo(A419EntUniRem, A418EntUniEnt) != 0 ) )
         {
            edtEntPrvNum_Enabled = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, edtEntPrvNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEntPrvNum_Enabled), 5, 0), !bGXsfl_40_Refreshing);
         }
         else
         {
            edtEntPrvNum_Enabled = 1 ;
            httpContext.ajax_rsp_assign_prop("", false, edtEntPrvNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEntPrvNum_Enabled), 5, 0), !bGXsfl_40_Refreshing);
         }
         if ( isDsp( )  || isDlt( )  || isUpd( )  && ( DecimalUtil.compareTo(A419EntUniRem, A418EntUniEnt) != 0 ) )
         {
            edtEntUniEnt_Enabled = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, edtEntUniEnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEntUniEnt_Enabled), 5, 0), !bGXsfl_40_Refreshing);
         }
         else
         {
            edtEntUniEnt_Enabled = 1 ;
            httpContext.ajax_rsp_assign_prop("", false, edtEntUniEnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEntUniEnt_Enabled), 5, 0), !bGXsfl_40_Refreshing);
         }
         if ( isDsp( )  || isDlt( )  || isUpd( )  && ( DecimalUtil.compareTo(A419EntUniRem, A418EntUniEnt) != 0 ) )
         {
            edtEntLotN_Enabled = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, edtEntLotN_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEntLotN_Enabled), 5, 0), !bGXsfl_40_Refreshing);
         }
         else
         {
            edtEntLotN_Enabled = 1 ;
            httpContext.ajax_rsp_assign_prop("", false, edtEntLotN_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEntLotN_Enabled), 5, 0), !bGXsfl_40_Refreshing);
         }
         if ( isDsp( )  || isDlt( )  || isUpd( )  && ( DecimalUtil.compareTo(A419EntUniRem, A418EntUniEnt) != 0 ) )
         {
            edtEntPre_Enabled = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, edtEntPre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEntPre_Enabled), 5, 0), !bGXsfl_40_Refreshing);
         }
         else
         {
            edtEntPre_Enabled = 1 ;
            httpContext.ajax_rsp_assign_prop("", false, edtEntPre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEntPre_Enabled), 5, 0), !bGXsfl_40_Refreshing);
         }
         if ( isDsp( )  || isDlt( )  || isUpd( )  && ( DecimalUtil.compareTo(A419EntUniRem, A418EntUniEnt) != 0 ) )
         {
            edtEntFVal_Enabled = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, edtEntFVal_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEntFVal_Enabled), 5, 0), !bGXsfl_40_Refreshing);
         }
         else
         {
            edtEntFVal_Enabled = 1 ;
            httpContext.ajax_rsp_assign_prop("", false, edtEntFVal_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEntFVal_Enabled), 5, 0), !bGXsfl_40_Refreshing);
         }
         AV34msg_ctrl_fecha = httpContext.getMessage( httpContext.getMessage( "Atencion.Ultimo Mov Fecha ", ""), "") + GXutil.trim( localUtil.dtoc( A14040PrdUltMovF, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")) + httpContext.getMessage( httpContext.getMessage( " superior a Fecha Mov ", ""), "") + GXutil.trim( localUtil.dtoc( A415EntFecEnt, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV34msg_ctrl_fecha", AV34msg_ctrl_fecha);
         if ( true /* Level */ && ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A14040PrdUltMovF)) && GXutil.resetTime(A14040PrdUltMovF).after( GXutil.resetTime( A415EntFecEnt )) && ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A415EntFecEnt)) && isDlt( )  && ( AV25FlagFecCcs == 0 ) )
         {
            GXCCtl = "ENTFECENT_" + sGXsfl_40_idx ;
            httpContext.GX_msglist.addItem(AV34msg_ctrl_fecha, 1, GXCCtl);
            AnyError = (short)(1) ;
            GX_FocusControl = edtEntFecEnt_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         if ( true /* Level */ && ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A14040PrdUltMovF)) && GXutil.resetTime(A14040PrdUltMovF).after( GXutil.resetTime( A415EntFecEnt )) && ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A415EntFecEnt)) && isDlt( )  && ( AV25FlagFecCcs == 1 ) )
         {
            GXCCtl = "ENTFECENT_" + sGXsfl_40_idx ;
            httpContext.GX_msglist.addItem(AV34msg_ctrl_fecha, 0, GXCCtl);
         }
      }
   }

   public void updateTablesN11SH42( )
   {
      /* Using cursor T01SH113 */
      pr_default.execute(107, new Object[] {A657PedCanEnt, A663PedFulEnt, A396EmprCod, Boolean.valueOf(n658PedCod), Integer.valueOf(A658PedCod), Boolean.valueOf(n719PrdNum), A719PrdNum});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLPEDID");
   }

   public void endLevel1SH42( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      pr_default.close(101);
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1SH42( )
   {
      /* Scan By routine */
      /* Using cursor T01SH114 */
      pr_default.execute(108, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
      RcdFound42 = (short)(0) ;
      if ( (pr_default.getStatus(108) != 101) )
      {
         RcdFound42 = (short)(1) ;
         A597LinEnt = T01SH114_A597LinEnt[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1SH42( )
   {
      /* Scan next routine */
      pr_default.readNext(108);
      RcdFound42 = (short)(0) ;
      if ( (pr_default.getStatus(108) != 101) )
      {
         RcdFound42 = (short)(1) ;
         A597LinEnt = T01SH114_A597LinEnt[0] ;
      }
   }

   public void scanEnd1SH42( )
   {
      pr_default.close(108);
   }

   public void afterConfirm1SH42( )
   {
      /* After Confirm Rules */
      if ( true /* Level */ && isDlt( )  && true /* After */ )
      {
         GXv_char13[0] = A396EmprCod ;
         GXv_char4[0] = A719PrdNum ;
         GXv_int14[0] = A597LinEnt ;
         new app.peliccs(remoteHandle, context).execute( GXv_char13, GXv_char4, GXv_int14) ;
         entradaproducto_impl.this.A396EmprCod = GXv_char13[0] ;
         entradaproducto_impl.this.A719PrdNum = GXv_char4[0] ;
         entradaproducto_impl.this.A597LinEnt = GXv_int14[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
      }
      if ( true /* After */ && ! (0==A658PedCod) )
      {
         A663PedFulEnt = A415EntFecEnt ;
         httpContext.ajax_rsp_assign_attri("", false, "A663PedFulEnt", localUtil.format(A663PedFulEnt, "99/99/99"));
      }
      if ( isIns( )  && true /* After */ )
      {
         GXv_char13[0] = A396EmprCod ;
         GXv_int8[0] = A6156EntPrvNum ;
         GXv_int14[0] = AV59Year ;
         GXv_int6[0] = AV30Mes ;
         GXv_decimal12[0] = A418EntUniEnt ;
         GXv_decimal15[0] = AV55UniOld ;
         GXv_decimal16[0] = A417EntPre ;
         GXv_char4[0] = AV44PedPri ;
         GXv_int17[0] = AV59Year ;
         GXv_int18[0] = AV12AnyAnt ;
         GXv_int19[0] = AV30Mes ;
         GXv_int20[0] = AV31MesAnt ;
         GXv_decimal21[0] = AV48PrecAnt ;
         GXv_date11[0] = A415EntFecEnt ;
         GXv_date22[0] = AV22FecAnt ;
         GXv_char3[0] = httpContext.getMessage( "INS", "") ;
         new app.pprdes2(remoteHandle, context).execute( GXv_char13, GXv_int8, GXv_int14, GXv_int6, GXv_decimal12, GXv_decimal15, GXv_decimal16, GXv_char4, GXv_int17, GXv_int18, GXv_int19, GXv_int20, GXv_decimal21, GXv_date11, GXv_date22, GXv_char3) ;
         entradaproducto_impl.this.A396EmprCod = GXv_char13[0] ;
         entradaproducto_impl.this.A6156EntPrvNum = GXv_int8[0] ;
         entradaproducto_impl.this.AV59Year = GXv_int14[0] ;
         entradaproducto_impl.this.AV30Mes = GXv_int6[0] ;
         entradaproducto_impl.this.A418EntUniEnt = GXv_decimal12[0] ;
         entradaproducto_impl.this.AV55UniOld = GXv_decimal15[0] ;
         entradaproducto_impl.this.A417EntPre = GXv_decimal16[0] ;
         entradaproducto_impl.this.AV44PedPri = GXv_char4[0] ;
         entradaproducto_impl.this.AV59Year = GXv_int17[0] ;
         entradaproducto_impl.this.AV12AnyAnt = GXv_int18[0] ;
         entradaproducto_impl.this.AV30Mes = GXv_int19[0] ;
         entradaproducto_impl.this.AV31MesAnt = GXv_int20[0] ;
         entradaproducto_impl.this.AV48PrecAnt = GXv_decimal21[0] ;
         entradaproducto_impl.this.A415EntFecEnt = GXv_date11[0] ;
         entradaproducto_impl.this.AV22FecAnt = GXv_date22[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "AV59Year", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV59Year), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV30Mes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV30Mes), 2, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV55UniOld", GXutil.ltrimstr( AV55UniOld, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "AV44PedPri", AV44PedPri);
         httpContext.ajax_rsp_assign_attri("", false, "AV59Year", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV59Year), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV12AnyAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12AnyAnt), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV30Mes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV30Mes), 2, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV31MesAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV31MesAnt), 2, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV48PrecAnt", GXutil.ltrimstr( AV48PrecAnt, 14, 5));
         httpContext.ajax_rsp_assign_attri("", false, "AV22FecAnt", localUtil.format(AV22FecAnt, "99/99/99"));
      }
      if ( ( ( ( DecimalUtil.compareTo(A418EntUniEnt, AV55UniOld) != 0 ) ) || ( !( GXutil.dateCompare(GXutil.resetTime(A415EntFecEnt), GXutil.resetTime(AV22FecAnt)) ) ) || ( ( DecimalUtil.compareTo(A417EntPre, AV48PrecAnt) != 0 ) ) ) && isUpd( )  && true /* After */ )
      {
         GXv_char13[0] = A396EmprCod ;
         GXv_int8[0] = A6156EntPrvNum ;
         GXv_int18[0] = AV59Year ;
         GXv_int20[0] = AV30Mes ;
         GXv_decimal21[0] = A418EntUniEnt ;
         GXv_decimal16[0] = AV55UniOld ;
         GXv_decimal15[0] = A417EntPre ;
         GXv_char4[0] = AV44PedPri ;
         GXv_int17[0] = AV59Year ;
         GXv_int14[0] = AV12AnyAnt ;
         GXv_int19[0] = AV30Mes ;
         GXv_int6[0] = AV31MesAnt ;
         GXv_decimal12[0] = AV48PrecAnt ;
         GXv_date22[0] = A415EntFecEnt ;
         GXv_date11[0] = AV22FecAnt ;
         GXv_char3[0] = httpContext.getMessage( "UPD", "") ;
         new app.pprdes2(remoteHandle, context).execute( GXv_char13, GXv_int8, GXv_int18, GXv_int20, GXv_decimal21, GXv_decimal16, GXv_decimal15, GXv_char4, GXv_int17, GXv_int14, GXv_int19, GXv_int6, GXv_decimal12, GXv_date22, GXv_date11, GXv_char3) ;
         entradaproducto_impl.this.A396EmprCod = GXv_char13[0] ;
         entradaproducto_impl.this.A6156EntPrvNum = GXv_int8[0] ;
         entradaproducto_impl.this.AV59Year = GXv_int18[0] ;
         entradaproducto_impl.this.AV30Mes = GXv_int20[0] ;
         entradaproducto_impl.this.A418EntUniEnt = GXv_decimal21[0] ;
         entradaproducto_impl.this.AV55UniOld = GXv_decimal16[0] ;
         entradaproducto_impl.this.A417EntPre = GXv_decimal15[0] ;
         entradaproducto_impl.this.AV44PedPri = GXv_char4[0] ;
         entradaproducto_impl.this.AV59Year = GXv_int17[0] ;
         entradaproducto_impl.this.AV12AnyAnt = GXv_int14[0] ;
         entradaproducto_impl.this.AV30Mes = GXv_int19[0] ;
         entradaproducto_impl.this.AV31MesAnt = GXv_int6[0] ;
         entradaproducto_impl.this.AV48PrecAnt = GXv_decimal12[0] ;
         entradaproducto_impl.this.A415EntFecEnt = GXv_date22[0] ;
         entradaproducto_impl.this.AV22FecAnt = GXv_date11[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "AV59Year", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV59Year), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV30Mes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV30Mes), 2, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV55UniOld", GXutil.ltrimstr( AV55UniOld, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "AV44PedPri", AV44PedPri);
         httpContext.ajax_rsp_assign_attri("", false, "AV59Year", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV59Year), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV12AnyAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12AnyAnt), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV30Mes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV30Mes), 2, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV31MesAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV31MesAnt), 2, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV48PrecAnt", GXutil.ltrimstr( AV48PrecAnt, 14, 5));
         httpContext.ajax_rsp_assign_attri("", false, "AV22FecAnt", localUtil.format(AV22FecAnt, "99/99/99"));
      }
      if ( isIns( )  && true /* After */ )
      {
         GXv_char13[0] = A396EmprCod ;
         GXv_int8[0] = A6156EntPrvNum ;
         GXv_char4[0] = A719PrdNum ;
         GXv_char3[0] = A718PrdNom ;
         GXv_int18[0] = AV59Year ;
         GXv_int20[0] = AV30Mes ;
         GXv_decimal21[0] = A418EntUniEnt ;
         GXv_decimal16[0] = AV55UniOld ;
         GXv_decimal15[0] = A417EntPre ;
         GXv_char2[0] = AV44PedPri ;
         GXv_int17[0] = AV59Year ;
         GXv_int14[0] = AV12AnyAnt ;
         GXv_int19[0] = AV30Mes ;
         GXv_int6[0] = AV31MesAnt ;
         GXv_decimal12[0] = AV48PrecAnt ;
         GXv_date22[0] = A415EntFecEnt ;
         GXv_date11[0] = AV22FecAnt ;
         GXv_char23[0] = httpContext.getMessage( "INS", "") ;
         new app.pprdes3(remoteHandle, context).execute( GXv_char13, GXv_int8, GXv_char4, GXv_char3, GXv_int18, GXv_int20, GXv_decimal21, GXv_decimal16, GXv_decimal15, GXv_char2, GXv_int17, GXv_int14, GXv_int19, GXv_int6, GXv_decimal12, GXv_date22, GXv_date11, GXv_char23) ;
         entradaproducto_impl.this.A396EmprCod = GXv_char13[0] ;
         entradaproducto_impl.this.A6156EntPrvNum = GXv_int8[0] ;
         entradaproducto_impl.this.A719PrdNum = GXv_char4[0] ;
         entradaproducto_impl.this.A718PrdNom = GXv_char3[0] ;
         entradaproducto_impl.this.AV59Year = GXv_int18[0] ;
         entradaproducto_impl.this.AV30Mes = GXv_int20[0] ;
         entradaproducto_impl.this.A418EntUniEnt = GXv_decimal21[0] ;
         entradaproducto_impl.this.AV55UniOld = GXv_decimal16[0] ;
         entradaproducto_impl.this.A417EntPre = GXv_decimal15[0] ;
         entradaproducto_impl.this.AV44PedPri = GXv_char2[0] ;
         entradaproducto_impl.this.AV59Year = GXv_int17[0] ;
         entradaproducto_impl.this.AV12AnyAnt = GXv_int14[0] ;
         entradaproducto_impl.this.AV30Mes = GXv_int19[0] ;
         entradaproducto_impl.this.AV31MesAnt = GXv_int6[0] ;
         entradaproducto_impl.this.AV48PrecAnt = GXv_decimal12[0] ;
         entradaproducto_impl.this.A415EntFecEnt = GXv_date22[0] ;
         entradaproducto_impl.this.AV22FecAnt = GXv_date11[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         httpContext.ajax_rsp_assign_attri("", false, "A718PrdNom", A718PrdNom);
         httpContext.ajax_rsp_assign_attri("", false, "AV59Year", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV59Year), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV30Mes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV30Mes), 2, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV55UniOld", GXutil.ltrimstr( AV55UniOld, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "AV44PedPri", AV44PedPri);
         httpContext.ajax_rsp_assign_attri("", false, "AV59Year", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV59Year), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV12AnyAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12AnyAnt), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV30Mes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV30Mes), 2, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV31MesAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV31MesAnt), 2, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV48PrecAnt", GXutil.ltrimstr( AV48PrecAnt, 14, 5));
         httpContext.ajax_rsp_assign_attri("", false, "AV22FecAnt", localUtil.format(AV22FecAnt, "99/99/99"));
      }
      if ( ( ( ( DecimalUtil.compareTo(A418EntUniEnt, AV55UniOld) != 0 ) ) || ( !( GXutil.dateCompare(GXutil.resetTime(A415EntFecEnt), GXutil.resetTime(AV22FecAnt)) ) ) || ( ( DecimalUtil.compareTo(A417EntPre, AV48PrecAnt) != 0 ) ) ) && isUpd( )  && true /* After */ )
      {
         GXv_char23[0] = A396EmprCod ;
         GXv_int8[0] = A6156EntPrvNum ;
         GXv_char13[0] = A719PrdNum ;
         GXv_char4[0] = A718PrdNom ;
         GXv_int18[0] = AV59Year ;
         GXv_int20[0] = AV30Mes ;
         GXv_decimal21[0] = A418EntUniEnt ;
         GXv_decimal16[0] = AV55UniOld ;
         GXv_decimal15[0] = A417EntPre ;
         GXv_char3[0] = AV44PedPri ;
         GXv_int17[0] = AV59Year ;
         GXv_int14[0] = AV12AnyAnt ;
         GXv_int19[0] = AV30Mes ;
         GXv_int6[0] = AV31MesAnt ;
         GXv_decimal12[0] = AV48PrecAnt ;
         GXv_date22[0] = A415EntFecEnt ;
         GXv_date11[0] = AV22FecAnt ;
         GXv_char2[0] = httpContext.getMessage( "UPD", "") ;
         new app.pprdes3(remoteHandle, context).execute( GXv_char23, GXv_int8, GXv_char13, GXv_char4, GXv_int18, GXv_int20, GXv_decimal21, GXv_decimal16, GXv_decimal15, GXv_char3, GXv_int17, GXv_int14, GXv_int19, GXv_int6, GXv_decimal12, GXv_date22, GXv_date11, GXv_char2) ;
         entradaproducto_impl.this.A396EmprCod = GXv_char23[0] ;
         entradaproducto_impl.this.A6156EntPrvNum = GXv_int8[0] ;
         entradaproducto_impl.this.A719PrdNum = GXv_char13[0] ;
         entradaproducto_impl.this.A718PrdNom = GXv_char4[0] ;
         entradaproducto_impl.this.AV59Year = GXv_int18[0] ;
         entradaproducto_impl.this.AV30Mes = GXv_int20[0] ;
         entradaproducto_impl.this.A418EntUniEnt = GXv_decimal21[0] ;
         entradaproducto_impl.this.AV55UniOld = GXv_decimal16[0] ;
         entradaproducto_impl.this.A417EntPre = GXv_decimal15[0] ;
         entradaproducto_impl.this.AV44PedPri = GXv_char3[0] ;
         entradaproducto_impl.this.AV59Year = GXv_int17[0] ;
         entradaproducto_impl.this.AV12AnyAnt = GXv_int14[0] ;
         entradaproducto_impl.this.AV30Mes = GXv_int19[0] ;
         entradaproducto_impl.this.AV31MesAnt = GXv_int6[0] ;
         entradaproducto_impl.this.AV48PrecAnt = GXv_decimal12[0] ;
         entradaproducto_impl.this.A415EntFecEnt = GXv_date22[0] ;
         entradaproducto_impl.this.AV22FecAnt = GXv_date11[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         httpContext.ajax_rsp_assign_attri("", false, "A718PrdNom", A718PrdNom);
         httpContext.ajax_rsp_assign_attri("", false, "AV59Year", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV59Year), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV30Mes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV30Mes), 2, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV55UniOld", GXutil.ltrimstr( AV55UniOld, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "AV44PedPri", AV44PedPri);
         httpContext.ajax_rsp_assign_attri("", false, "AV59Year", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV59Year), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV12AnyAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12AnyAnt), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV30Mes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV30Mes), 2, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV31MesAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV31MesAnt), 2, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV48PrecAnt", GXutil.ltrimstr( AV48PrecAnt, 14, 5));
         httpContext.ajax_rsp_assign_attri("", false, "AV22FecAnt", localUtil.format(AV22FecAnt, "99/99/99"));
      }
      if ( isIns( )  && true /* After */ )
      {
         GXv_char23[0] = A396EmprCod ;
         GXv_char13[0] = A719PrdNum ;
         GXv_int18[0] = AV59Year ;
         GXv_int20[0] = AV30Mes ;
         GXv_decimal21[0] = A418EntUniEnt ;
         GXv_decimal16[0] = AV55UniOld ;
         GXv_decimal15[0] = A417EntPre ;
         GXv_int17[0] = AV59Year ;
         GXv_int14[0] = AV12AnyAnt ;
         GXv_int19[0] = AV30Mes ;
         GXv_int6[0] = AV31MesAnt ;
         GXv_decimal12[0] = AV48PrecAnt ;
         GXv_date22[0] = A415EntFecEnt ;
         GXv_date11[0] = AV22FecAnt ;
         GXv_char4[0] = AV44PedPri ;
         GXv_char3[0] = httpContext.getMessage( "INS", "") ;
         new app.pprden2(remoteHandle, context).execute( GXv_char23, GXv_char13, GXv_int18, GXv_int20, GXv_decimal21, GXv_decimal16, GXv_decimal15, GXv_int17, GXv_int14, GXv_int19, GXv_int6, GXv_decimal12, GXv_date22, GXv_date11, GXv_char4, GXv_char3) ;
         entradaproducto_impl.this.A396EmprCod = GXv_char23[0] ;
         entradaproducto_impl.this.A719PrdNum = GXv_char13[0] ;
         entradaproducto_impl.this.AV59Year = GXv_int18[0] ;
         entradaproducto_impl.this.AV30Mes = GXv_int20[0] ;
         entradaproducto_impl.this.A418EntUniEnt = GXv_decimal21[0] ;
         entradaproducto_impl.this.AV55UniOld = GXv_decimal16[0] ;
         entradaproducto_impl.this.A417EntPre = GXv_decimal15[0] ;
         entradaproducto_impl.this.AV59Year = GXv_int17[0] ;
         entradaproducto_impl.this.AV12AnyAnt = GXv_int14[0] ;
         entradaproducto_impl.this.AV30Mes = GXv_int19[0] ;
         entradaproducto_impl.this.AV31MesAnt = GXv_int6[0] ;
         entradaproducto_impl.this.AV48PrecAnt = GXv_decimal12[0] ;
         entradaproducto_impl.this.A415EntFecEnt = GXv_date22[0] ;
         entradaproducto_impl.this.AV22FecAnt = GXv_date11[0] ;
         entradaproducto_impl.this.AV44PedPri = GXv_char4[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         httpContext.ajax_rsp_assign_attri("", false, "AV59Year", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV59Year), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV30Mes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV30Mes), 2, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV55UniOld", GXutil.ltrimstr( AV55UniOld, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "AV59Year", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV59Year), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV12AnyAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12AnyAnt), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV30Mes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV30Mes), 2, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV31MesAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV31MesAnt), 2, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV48PrecAnt", GXutil.ltrimstr( AV48PrecAnt, 14, 5));
         httpContext.ajax_rsp_assign_attri("", false, "AV22FecAnt", localUtil.format(AV22FecAnt, "99/99/99"));
         httpContext.ajax_rsp_assign_attri("", false, "AV44PedPri", AV44PedPri);
      }
      if ( ( ( ( DecimalUtil.compareTo(A418EntUniEnt, AV55UniOld) != 0 ) ) || ( !( GXutil.dateCompare(GXutil.resetTime(A415EntFecEnt), GXutil.resetTime(AV22FecAnt)) ) ) || ( ( DecimalUtil.compareTo(A417EntPre, AV48PrecAnt) != 0 ) ) ) && isUpd( )  && true /* After */ )
      {
         GXv_char23[0] = A396EmprCod ;
         GXv_char13[0] = A719PrdNum ;
         GXv_int18[0] = AV59Year ;
         GXv_int20[0] = AV30Mes ;
         GXv_decimal21[0] = A418EntUniEnt ;
         GXv_decimal16[0] = AV55UniOld ;
         GXv_decimal15[0] = A417EntPre ;
         GXv_int17[0] = AV59Year ;
         GXv_int14[0] = AV12AnyAnt ;
         GXv_int19[0] = AV30Mes ;
         GXv_int6[0] = AV31MesAnt ;
         GXv_decimal12[0] = AV48PrecAnt ;
         GXv_date22[0] = A415EntFecEnt ;
         GXv_date11[0] = AV22FecAnt ;
         GXv_char4[0] = AV44PedPri ;
         GXv_char3[0] = httpContext.getMessage( "UPD", "") ;
         new app.pprden2(remoteHandle, context).execute( GXv_char23, GXv_char13, GXv_int18, GXv_int20, GXv_decimal21, GXv_decimal16, GXv_decimal15, GXv_int17, GXv_int14, GXv_int19, GXv_int6, GXv_decimal12, GXv_date22, GXv_date11, GXv_char4, GXv_char3) ;
         entradaproducto_impl.this.A396EmprCod = GXv_char23[0] ;
         entradaproducto_impl.this.A719PrdNum = GXv_char13[0] ;
         entradaproducto_impl.this.AV59Year = GXv_int18[0] ;
         entradaproducto_impl.this.AV30Mes = GXv_int20[0] ;
         entradaproducto_impl.this.A418EntUniEnt = GXv_decimal21[0] ;
         entradaproducto_impl.this.AV55UniOld = GXv_decimal16[0] ;
         entradaproducto_impl.this.A417EntPre = GXv_decimal15[0] ;
         entradaproducto_impl.this.AV59Year = GXv_int17[0] ;
         entradaproducto_impl.this.AV12AnyAnt = GXv_int14[0] ;
         entradaproducto_impl.this.AV30Mes = GXv_int19[0] ;
         entradaproducto_impl.this.AV31MesAnt = GXv_int6[0] ;
         entradaproducto_impl.this.AV48PrecAnt = GXv_decimal12[0] ;
         entradaproducto_impl.this.A415EntFecEnt = GXv_date22[0] ;
         entradaproducto_impl.this.AV22FecAnt = GXv_date11[0] ;
         entradaproducto_impl.this.AV44PedPri = GXv_char4[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         httpContext.ajax_rsp_assign_attri("", false, "AV59Year", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV59Year), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV30Mes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV30Mes), 2, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV55UniOld", GXutil.ltrimstr( AV55UniOld, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "AV59Year", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV59Year), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV12AnyAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12AnyAnt), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV30Mes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV30Mes), 2, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV31MesAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV31MesAnt), 2, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV48PrecAnt", GXutil.ltrimstr( AV48PrecAnt, 14, 5));
         httpContext.ajax_rsp_assign_attri("", false, "AV22FecAnt", localUtil.format(AV22FecAnt, "99/99/99"));
         httpContext.ajax_rsp_assign_attri("", false, "AV44PedPri", AV44PedPri);
      }
      if ( isDlt( )  && true /* Level */ && true /* After */ )
      {
         GXv_char23[0] = A396EmprCod ;
         GXv_int8[0] = A6156EntPrvNum ;
         GXv_date22[0] = A415EntFecEnt ;
         GXv_int24[0] = A658PedCod ;
         GXv_decimal21[0] = A418EntUniEnt ;
         GXv_decimal16[0] = A417EntPre ;
         GXv_char13[0] = AV44PedPri ;
         new app.pacespr(remoteHandle, context).execute( GXv_char23, GXv_int8, GXv_date22, GXv_int24, GXv_decimal21, GXv_decimal16, GXv_char13) ;
         entradaproducto_impl.this.A396EmprCod = GXv_char23[0] ;
         entradaproducto_impl.this.A6156EntPrvNum = GXv_int8[0] ;
         entradaproducto_impl.this.A415EntFecEnt = GXv_date22[0] ;
         entradaproducto_impl.this.A658PedCod = GXv_int24[0] ;
         entradaproducto_impl.this.A418EntUniEnt = GXv_decimal21[0] ;
         entradaproducto_impl.this.A417EntPre = GXv_decimal16[0] ;
         entradaproducto_impl.this.AV44PedPri = GXv_char13[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "AV44PedPri", AV44PedPri);
      }
      if ( isDlt( )  && true /* Level */ && true /* After */ )
      {
         GXv_char23[0] = A396EmprCod ;
         GXv_int24[0] = A6156EntPrvNum ;
         GXv_char13[0] = A719PrdNum ;
         GXv_char4[0] = A718PrdNom ;
         GXv_date22[0] = A415EntFecEnt ;
         GXv_int8[0] = A658PedCod ;
         GXv_decimal21[0] = A418EntUniEnt ;
         GXv_decimal16[0] = A417EntPre ;
         GXv_char3[0] = AV44PedPri ;
         new app.pacesprx(remoteHandle, context).execute( GXv_char23, GXv_int24, GXv_char13, GXv_char4, GXv_date22, GXv_int8, GXv_decimal21, GXv_decimal16, GXv_char3) ;
         entradaproducto_impl.this.A396EmprCod = GXv_char23[0] ;
         entradaproducto_impl.this.A6156EntPrvNum = GXv_int24[0] ;
         entradaproducto_impl.this.A719PrdNum = GXv_char13[0] ;
         entradaproducto_impl.this.A718PrdNom = GXv_char4[0] ;
         entradaproducto_impl.this.A415EntFecEnt = GXv_date22[0] ;
         entradaproducto_impl.this.A658PedCod = GXv_int8[0] ;
         entradaproducto_impl.this.A418EntUniEnt = GXv_decimal21[0] ;
         entradaproducto_impl.this.A417EntPre = GXv_decimal16[0] ;
         entradaproducto_impl.this.AV44PedPri = GXv_char3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         httpContext.ajax_rsp_assign_attri("", false, "A718PrdNom", A718PrdNom);
         httpContext.ajax_rsp_assign_attri("", false, "AV44PedPri", AV44PedPri);
      }
      if ( isDlt( )  && true /* Level */ && true /* After */ )
      {
         GXv_char23[0] = A396EmprCod ;
         GXv_char13[0] = A719PrdNum ;
         GXv_date22[0] = A415EntFecEnt ;
         GXv_decimal21[0] = A418EntUniEnt ;
         GXv_decimal16[0] = A417EntPre ;
         new app.pacespd(remoteHandle, context).execute( GXv_char23, GXv_char13, GXv_date22, GXv_decimal21, GXv_decimal16) ;
         entradaproducto_impl.this.A396EmprCod = GXv_char23[0] ;
         entradaproducto_impl.this.A719PrdNum = GXv_char13[0] ;
         entradaproducto_impl.this.A415EntFecEnt = GXv_date22[0] ;
         entradaproducto_impl.this.A418EntUniEnt = GXv_decimal21[0] ;
         entradaproducto_impl.this.A417EntPre = GXv_decimal16[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
      }
      if ( ( isIns( )  || isUpd( )  ) && true /* After */ && ( AV35Nalbaran20 == 0 ) )
      {
         GXv_char23[0] = A396EmprCod ;
         GXv_char13[0] = A719PrdNum ;
         GXv_decimal21[0] = A418EntUniEnt ;
         GXv_decimal16[0] = DecimalUtil.doubleToDec(0) ;
         GXv_char4[0] = httpContext.getMessage( "EN", "") ;
         GXv_char3[0] = AV44PedPri ;
         GXv_decimal15[0] = A417EntPre ;
         GXv_int24[0] = 0 ;
         GXv_int20[0] = (byte)(0) ;
         GXv_char2[0] = " " ;
         GXv_int8[0] = A658PedCod ;
         GXv_char25[0] = A11Albaran ;
         GXv_char26[0] = AV56UsurCod ;
         GXv_char27[0] = httpContext.getMessage( "Entrada por Pedido", "") ;
         GXv_int18[0] = A597LinEnt ;
         GXv_decimal12[0] = AV55UniOld ;
         GXv_decimal28[0] = DecimalUtil.doubleToDec(0) ;
         GXv_date22[0] = A415EntFecEnt ;
         GXv_int29[0] = A6156EntPrvNum ;
         GXv_char30[0] = A5686EntLotN ;
         new app.pnewcc9(remoteHandle, context).execute( GXv_char23, GXv_char13, GXv_decimal21, GXv_decimal16, GXv_char4, GXv_char3, GXv_decimal15, GXv_int24, GXv_int20, GXv_char2, GXv_int8, GXv_char25, GXv_char26, GXv_char27, GXv_int18, GXv_decimal12, GXv_decimal28, GXv_date22, GXv_int29, GXv_char30) ;
         entradaproducto_impl.this.A396EmprCod = GXv_char23[0] ;
         entradaproducto_impl.this.A719PrdNum = GXv_char13[0] ;
         entradaproducto_impl.this.A418EntUniEnt = GXv_decimal21[0] ;
         entradaproducto_impl.this.AV44PedPri = GXv_char3[0] ;
         entradaproducto_impl.this.A417EntPre = GXv_decimal15[0] ;
         entradaproducto_impl.this.A658PedCod = GXv_int8[0] ;
         entradaproducto_impl.this.A11Albaran = GXv_char25[0] ;
         entradaproducto_impl.this.AV56UsurCod = GXv_char26[0] ;
         entradaproducto_impl.this.A597LinEnt = GXv_int18[0] ;
         entradaproducto_impl.this.AV55UniOld = GXv_decimal12[0] ;
         entradaproducto_impl.this.A415EntFecEnt = GXv_date22[0] ;
         entradaproducto_impl.this.A6156EntPrvNum = GXv_int29[0] ;
         entradaproducto_impl.this.A5686EntLotN = GXv_char30[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         httpContext.ajax_rsp_assign_attri("", false, "AV44PedPri", AV44PedPri);
         httpContext.ajax_rsp_assign_attri("", false, "AV56UsurCod", AV56UsurCod);
         httpContext.ajax_rsp_assign_attri("", false, "AV55UniOld", GXutil.ltrimstr( AV55UniOld, 9, 2));
      }
      if ( ( isIns( )  || isUpd( )  ) && true /* After */ && ( AV35Nalbaran20 == 1 ) )
      {
         GXv_char30[0] = A396EmprCod ;
         GXv_char27[0] = A719PrdNum ;
         GXv_decimal28[0] = A418EntUniEnt ;
         GXv_decimal21[0] = DecimalUtil.doubleToDec(0) ;
         GXv_char26[0] = httpContext.getMessage( "EN", "") ;
         GXv_char25[0] = AV44PedPri ;
         GXv_decimal16[0] = A417EntPre ;
         GXv_int29[0] = 0 ;
         GXv_int20[0] = (byte)(0) ;
         GXv_char23[0] = " " ;
         GXv_int24[0] = A658PedCod ;
         GXv_char13[0] = A11Albaran ;
         GXv_char4[0] = AV56UsurCod ;
         GXv_char3[0] = httpContext.getMessage( "Entrada por Pedido", "") ;
         GXv_int18[0] = A597LinEnt ;
         GXv_decimal15[0] = AV55UniOld ;
         GXv_decimal12[0] = DecimalUtil.doubleToDec(0) ;
         GXv_date22[0] = A415EntFecEnt ;
         GXv_int8[0] = A6156EntPrvNum ;
         GXv_char2[0] = A5686EntLotN ;
         GXv_char31[0] = A12857EntNAlbar ;
         new app.pccstk20(remoteHandle, context).execute( GXv_char30, GXv_char27, GXv_decimal28, GXv_decimal21, GXv_char26, GXv_char25, GXv_decimal16, GXv_int29, GXv_int20, GXv_char23, GXv_int24, GXv_char13, GXv_char4, GXv_char3, GXv_int18, GXv_decimal15, GXv_decimal12, GXv_date22, GXv_int8, GXv_char2, GXv_char31) ;
         entradaproducto_impl.this.A396EmprCod = GXv_char30[0] ;
         entradaproducto_impl.this.A719PrdNum = GXv_char27[0] ;
         entradaproducto_impl.this.A418EntUniEnt = GXv_decimal28[0] ;
         entradaproducto_impl.this.AV44PedPri = GXv_char25[0] ;
         entradaproducto_impl.this.A417EntPre = GXv_decimal16[0] ;
         entradaproducto_impl.this.A658PedCod = GXv_int24[0] ;
         entradaproducto_impl.this.A11Albaran = GXv_char13[0] ;
         entradaproducto_impl.this.AV56UsurCod = GXv_char4[0] ;
         entradaproducto_impl.this.A597LinEnt = GXv_int18[0] ;
         entradaproducto_impl.this.AV55UniOld = GXv_decimal15[0] ;
         entradaproducto_impl.this.A415EntFecEnt = GXv_date22[0] ;
         entradaproducto_impl.this.A6156EntPrvNum = GXv_int8[0] ;
         entradaproducto_impl.this.A5686EntLotN = GXv_char2[0] ;
         entradaproducto_impl.this.A12857EntNAlbar = GXv_char31[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         httpContext.ajax_rsp_assign_attri("", false, "AV44PedPri", AV44PedPri);
         httpContext.ajax_rsp_assign_attri("", false, "AV56UsurCod", AV56UsurCod);
         httpContext.ajax_rsp_assign_attri("", false, "AV55UniOld", GXutil.ltrimstr( AV55UniOld, 9, 2));
      }
   }

   public void beforeInsert1SH42( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1SH42( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1SH42( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1SH42( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1SH42( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1SH42( )
   {
      edtLinEnt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLinEnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLinEnt_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      edtEntFecEnt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEntFecEnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEntFecEnt_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      edtAlbaran_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbaran_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbaran_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      edtEntNAlbar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEntNAlbar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEntNAlbar_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      edtPedCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPedCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPedCod_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      edtEntNEmb_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEntNEmb_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEntNEmb_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      edtEntPrvNum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEntPrvNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEntPrvNum_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      edtEntUniEnt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEntUniEnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEntUniEnt_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      edtEntCump_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEntCump_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEntCump_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      cmbEntPedCum.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbEntPedCum.getInternalname(), "Enabled", GXutil.ltrimstr( cmbEntPedCum.getEnabled(), 5, 0), !bGXsfl_40_Refreshing);
      edtEntPre_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEntPre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEntPre_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      edtEntUniRem_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEntUniRem_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEntUniRem_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      edtEntLotN_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEntLotN_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEntLotN_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      edtEntFVal_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEntFVal_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEntFVal_Enabled), 5, 0), !bGXsfl_40_Refreshing);
   }

   public void send_integrity_lvl_hashes1SH42( )
   {
   }

   public void send_integrity_lvl_hashes1SH29( )
   {
   }

   public void subsflControlProps_4042( )
   {
      edtLinEnt_Internalname = "LINENT_"+sGXsfl_40_idx ;
      edtEntFecEnt_Internalname = "ENTFECENT_"+sGXsfl_40_idx ;
      edtAlbaran_Internalname = "ALBARAN_"+sGXsfl_40_idx ;
      edtEntNAlbar_Internalname = "ENTNALBAR_"+sGXsfl_40_idx ;
      edtPedCod_Internalname = "PEDCOD_"+sGXsfl_40_idx ;
      edtavPedcodprompt_Internalname = "vPEDCODPROMPT_"+sGXsfl_40_idx ;
      edtEntNEmb_Internalname = "ENTNEMB_"+sGXsfl_40_idx ;
      edtEntPrvNum_Internalname = "ENTPRVNUM_"+sGXsfl_40_idx ;
      imgprompt_6156_Internalname = "PROMPT_6156_"+sGXsfl_40_idx ;
      edtEntUniEnt_Internalname = "ENTUNIENT_"+sGXsfl_40_idx ;
      edtEntCump_Internalname = "ENTCUMP_"+sGXsfl_40_idx ;
      cmbEntPedCum.setInternalname( "ENTPEDCUM_"+sGXsfl_40_idx );
      edtEntPre_Internalname = "ENTPRE_"+sGXsfl_40_idx ;
      edtEntUniRem_Internalname = "ENTUNIREM_"+sGXsfl_40_idx ;
      edtEntLotN_Internalname = "ENTLOTN_"+sGXsfl_40_idx ;
      edtEntFVal_Internalname = "ENTFVAL_"+sGXsfl_40_idx ;
   }

   public void subsflControlProps_fel_4042( )
   {
      edtLinEnt_Internalname = "LINENT_"+sGXsfl_40_fel_idx ;
      edtEntFecEnt_Internalname = "ENTFECENT_"+sGXsfl_40_fel_idx ;
      edtAlbaran_Internalname = "ALBARAN_"+sGXsfl_40_fel_idx ;
      edtEntNAlbar_Internalname = "ENTNALBAR_"+sGXsfl_40_fel_idx ;
      edtPedCod_Internalname = "PEDCOD_"+sGXsfl_40_fel_idx ;
      edtavPedcodprompt_Internalname = "vPEDCODPROMPT_"+sGXsfl_40_fel_idx ;
      edtEntNEmb_Internalname = "ENTNEMB_"+sGXsfl_40_fel_idx ;
      edtEntPrvNum_Internalname = "ENTPRVNUM_"+sGXsfl_40_fel_idx ;
      imgprompt_6156_Internalname = "PROMPT_6156_"+sGXsfl_40_fel_idx ;
      edtEntUniEnt_Internalname = "ENTUNIENT_"+sGXsfl_40_fel_idx ;
      edtEntCump_Internalname = "ENTCUMP_"+sGXsfl_40_fel_idx ;
      cmbEntPedCum.setInternalname( "ENTPEDCUM_"+sGXsfl_40_fel_idx );
      edtEntPre_Internalname = "ENTPRE_"+sGXsfl_40_fel_idx ;
      edtEntUniRem_Internalname = "ENTUNIREM_"+sGXsfl_40_fel_idx ;
      edtEntLotN_Internalname = "ENTLOTN_"+sGXsfl_40_fel_idx ;
      edtEntFVal_Internalname = "ENTFVAL_"+sGXsfl_40_fel_idx ;
   }

   public void addRow1SH42( )
   {
      nGXsfl_40_idx = (int)(nGXsfl_40_idx+1) ;
      sGXsfl_40_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_40_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_4042( ) ;
      sendRow1SH42( ) ;
   }

   public void sendRow1SH42( )
   {
      Gridlevel_lineasRow = GXWebRow.GetNew(context) ;
      if ( subGridlevel_lineas_Backcolorstyle == 0 )
      {
         /* None style subfile background logic. */
         subGridlevel_lineas_Backstyle = (byte)(0) ;
         if ( GXutil.strcmp(subGridlevel_lineas_Class, "") != 0 )
         {
            subGridlevel_lineas_Linesclass = subGridlevel_lineas_Class+"Odd" ;
         }
      }
      else if ( subGridlevel_lineas_Backcolorstyle == 1 )
      {
         /* Uniform style subfile background logic. */
         subGridlevel_lineas_Backstyle = (byte)(0) ;
         subGridlevel_lineas_Backcolor = subGridlevel_lineas_Allbackcolor ;
         if ( GXutil.strcmp(subGridlevel_lineas_Class, "") != 0 )
         {
            subGridlevel_lineas_Linesclass = subGridlevel_lineas_Class+"Uniform" ;
         }
      }
      else if ( subGridlevel_lineas_Backcolorstyle == 2 )
      {
         /* Header style subfile background logic. */
         subGridlevel_lineas_Backstyle = (byte)(1) ;
         if ( GXutil.strcmp(subGridlevel_lineas_Class, "") != 0 )
         {
            subGridlevel_lineas_Linesclass = subGridlevel_lineas_Class+"Odd" ;
         }
         subGridlevel_lineas_Backcolor = (int)(0x0) ;
      }
      else if ( subGridlevel_lineas_Backcolorstyle == 3 )
      {
         /* Report style subfile background logic. */
         subGridlevel_lineas_Backstyle = (byte)(1) ;
         if ( ((int)((nGXsfl_40_idx) % (2))) == 0 )
         {
            subGridlevel_lineas_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGridlevel_lineas_Class, "") != 0 )
            {
               subGridlevel_lineas_Linesclass = subGridlevel_lineas_Class+"Even" ;
            }
         }
         else
         {
            subGridlevel_lineas_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGridlevel_lineas_Class, "") != 0 )
            {
               subGridlevel_lineas_Linesclass = subGridlevel_lineas_Class+"Odd" ;
            }
         }
      }
      edtavPedcodprompt_Link = ((GXutil.strcmp(Gx_mode, "DSP")==0) ? "" : "javascript:"+"gx.popup.openPrompt('"+"app.stocksquimicos.pedidoporproducto_wp"+"',["+"'"+WebUtils.htmlEncode( GXutil.strReplace( GXutil.rtrim( A396EmprCod), "'", "\\'"))+"'"+","+"'"+WebUtils.htmlEncode( GXutil.strReplace( GXutil.rtrim( A719PrdNum), "'", "\\'"))+"'"+","+"{Ctrl:gx.dom.el('"+"PEDCOD_"+sGXsfl_40_idx+"'), id:'"+"PEDCOD_"+sGXsfl_40_idx+"'"+",IOType:'out'}"+","+"{Ctrl:gx.dom.el('"+"ENTUNIENT_"+sGXsfl_40_idx+"'), id:'"+"ENTUNIENT_"+sGXsfl_40_idx+"'"+",IOType:'out'}"+","+"{Ctrl:gx.dom.el('"+"ENTPRVNUM_"+sGXsfl_40_idx+"'), id:'"+"ENTPRVNUM_"+sGXsfl_40_idx+"'"+",IOType:'out'}"+","+"{Ctrl:gx.dom.el('"+"PEDCANENT"+"'), id:'"+"PEDCANENT"+"'"+",IOType:'out'}"+","+"{Ctrl:gx.dom.el('"+"PEDUNI"+"'), id:'"+"PEDUNI"+"'"+",IOType:'out'}"+"],"+"gx.dom.form()."+"nIsMod_42_"+sGXsfl_40_idx+","+"'', false"+","+"false"+");") ;
      imgprompt_6156_Link = ((GXutil.strcmp(Gx_mode, "DSP")==0) ? "" : "javascript:"+"gx.popup.openPrompt('"+"app.proveedorporproducto_wp"+"',["+"'"+WebUtils.htmlEncode( GXutil.strReplace( GXutil.rtrim( A396EmprCod), "'", "\\'"))+"'"+","+"'"+WebUtils.htmlEncode( GXutil.strReplace( GXutil.rtrim( A719PrdNum), "'", "\\'"))+"'"+","+"{Ctrl:gx.dom.el('"+"ENTPRVNUM_"+sGXsfl_40_idx+"'), id:'"+"ENTPRVNUM_"+sGXsfl_40_idx+"'"+",IOType:'out'}"+"],"+"gx.dom.form()."+"nIsMod_42_"+sGXsfl_40_idx+","+"'', false"+","+"false"+");") ;
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_42_" + sGXsfl_40_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 41,'',false,'" + sGXsfl_40_idx + "',40)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_lineasRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLinEnt_Internalname,GXutil.ltrim( localUtil.ntoc( A597LinEnt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A597LinEnt), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,41);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtLinEnt_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtLinEnt_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_42_" + sGXsfl_40_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 42,'',false,'" + sGXsfl_40_idx + "',40)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_lineasRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtEntFecEnt_Internalname,localUtil.format(A415EntFecEnt, "99/99/99"),localUtil.format( A415EntFecEnt, "99/99/99"),TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,42);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtEntFecEnt_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtEntFecEnt_Enabled),Integer.valueOf(1),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_42_" + sGXsfl_40_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 43,'',false,'" + sGXsfl_40_idx + "',40)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_lineasRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbaran_Internalname,GXutil.rtrim( A11Albaran),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,43);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbaran_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(edtAlbaran_Visible),Integer.valueOf(edtAlbaran_Enabled),Integer.valueOf(1),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_42_" + sGXsfl_40_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 44,'',false,'" + sGXsfl_40_idx + "',40)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_lineasRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtEntNAlbar_Internalname,GXutil.rtrim( A12857EntNAlbar),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,44);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtEntNAlbar_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(edtEntNAlbar_Visible),Integer.valueOf(edtEntNAlbar_Enabled),Integer.valueOf(1),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_42_" + sGXsfl_40_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 45,'',false,'" + sGXsfl_40_idx + "',40)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_lineasRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPedCod_Internalname,GXutil.ltrim( localUtil.ntoc( A658PedCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtPedCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A658PedCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A658PedCod), "ZZZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,45);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPedCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtPedCod_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Static Bitmap Variable */
      ClassString = "ImagePrompt" + " " + ((GXutil.strcmp(edtavPedcodprompt_gximage, "")==0) ? "" : "GX_Image_"+edtavPedcodprompt_gximage+"_Class") ;
      StyleString = "" ;
      AV43PedCodPrompt_IsBlob = (boolean)(((GXutil.strcmp("", AV43PedCodPrompt)==0)&&(GXutil.strcmp("", AV65Pedcodprompt_GXI)==0))||!(GXutil.strcmp("", AV43PedCodPrompt)==0)) ;
      sImgUrl = ((GXutil.strcmp("", AV43PedCodPrompt)==0) ? AV65Pedcodprompt_GXI : httpContext.getResourceRelative(AV43PedCodPrompt)) ;
      Gridlevel_lineasRow.AddColumnProperties("bitmap", 1, isAjaxCallMode( ), new Object[] {edtavPedcodprompt_Internalname,sImgUrl,edtavPedcodprompt_Link,"","",context.getHttpContext().getTheme( ),Integer.valueOf(edtavPedcodprompt_Visible),Integer.valueOf(edtavPedcodprompt_Enabled),"","",Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),"px",Integer.valueOf(0),"px",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"","",StyleString,ClassString,"TrnColumn","","","","","","",Integer.valueOf(1),Boolean.valueOf(AV43PedCodPrompt_IsBlob),Boolean.valueOf(false),context.getHttpContext().getImageSrcSet( sImgUrl)});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_42_" + sGXsfl_40_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 47,'',false,'" + sGXsfl_40_idx + "',40)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_lineasRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtEntNEmb_Internalname,GXutil.ltrim( localUtil.ntoc( A14035EntNEmb, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtEntNEmb_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A14035EntNEmb), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A14035EntNEmb), "Z9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,47);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtEntNEmb_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(edtEntNEmb_Visible),Integer.valueOf(edtEntNEmb_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_42_" + sGXsfl_40_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 48,'',false,'" + sGXsfl_40_idx + "',40)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_lineasRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtEntPrvNum_Internalname,GXutil.ltrim( localUtil.ntoc( A6156EntPrvNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A6156EntPrvNum), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,48);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtEntPrvNum_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtEntPrvNum_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Static images/pictures */
      ClassString = "gx-prompt Image" + " " + ((GXutil.strcmp(imgprompt_6156_gximage, "")==0) ? "" : "GX_Image_"+imgprompt_6156_gximage+"_Class") ;
      StyleString = "" ;
      sImgUrl = context.getHttpContext().getImagePath( "f5b04895-0024-488b-8e3b-b687ca4598ee", "", context.getHttpContext().getTheme( )) ;
      Gridlevel_lineasRow.AddColumnProperties("bitmap", 1, isAjaxCallMode( ), new Object[] {imgprompt_6156_Internalname,sImgUrl,imgprompt_6156_Link,"","",context.getHttpContext().getTheme( ),Integer.valueOf(imgprompt_6156_Visible),Integer.valueOf(1),"","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"",Integer.valueOf(0),"",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"","",StyleString,ClassString,"","","","","","","",Integer.valueOf(1),Boolean.valueOf(false),Boolean.valueOf(false),context.getHttpContext().getImageSrcSet( sImgUrl)});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_42_" + sGXsfl_40_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 49,'',false,'" + sGXsfl_40_idx + "',40)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_lineasRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtEntUniEnt_Internalname,GXutil.ltrim( localUtil.ntoc( A418EntUniEnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A418EntUniEnt, "ZZZZZ9.99")),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,49);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtEntUniEnt_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtEntUniEnt_Enabled),Integer.valueOf(1),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_lineasRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtEntCump_Internalname,GXutil.rtrim( A14041EntCump),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtEntCump_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(0),Integer.valueOf(edtEntCump_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_42_" + sGXsfl_40_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 51,'',false,'" + sGXsfl_40_idx + "',40)\"" ;
      GXCCtl = "ENTPEDCUM_" + sGXsfl_40_idx ;
      cmbEntPedCum.setName( GXCCtl );
      cmbEntPedCum.setWebtags( "" );
      cmbEntPedCum.addItem("S", httpContext.getMessage( "S", ""), (short)(0));
      cmbEntPedCum.addItem("N", httpContext.getMessage( "N", ""), (short)(0));
      if ( cmbEntPedCum.getItemCount() > 0 )
      {
         if ( isIns( ) && (GXutil.strcmp("", A3404EntPedCum)==0) )
         {
            A3404EntPedCum = httpContext.getMessage( "N", "") ;
         }
      }
      /* ComboBox */
      Gridlevel_lineasRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbEntPedCum,cmbEntPedCum.getInternalname(),GXutil.rtrim( A3404EntPedCum),Integer.valueOf(1),cmbEntPedCum.getJsonclick(),Integer.valueOf(0),"'"+""+"'"+",false,"+"'"+""+"'","char","",Integer.valueOf(-1),Integer.valueOf(cmbEntPedCum.getEnabled()),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","Attribute","TrnColumn","",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,51);\"","",Boolean.valueOf(true),Integer.valueOf(0)});
      cmbEntPedCum.setValue( GXutil.rtrim( A3404EntPedCum) );
      httpContext.ajax_rsp_assign_prop("", false, cmbEntPedCum.getInternalname(), "Values", cmbEntPedCum.ToJavascriptSource(), !bGXsfl_40_Refreshing);
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_42_" + sGXsfl_40_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 52,'',false,'" + sGXsfl_40_idx + "',40)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_lineasRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtEntPre_Internalname,GXutil.ltrim( localUtil.ntoc( A417EntPre, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A417EntPre, "ZZZZZZZ9.999")),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,52);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtEntPre_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtEntPre_Enabled),Integer.valueOf(1),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(14),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_lineasRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtEntUniRem_Internalname,GXutil.ltrim( localUtil.ntoc( A419EntUniRem, (byte)(11), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtEntUniRem_Enabled!=0) ? localUtil.format( A419EntUniRem, "ZZZZZ9.9999") : localUtil.format( A419EntUniRem, "ZZZZZ9.9999"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtEntUniRem_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtEntUniRem_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(11),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_42_" + sGXsfl_40_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 54,'',false,'" + sGXsfl_40_idx + "',40)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_lineasRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtEntLotN_Internalname,GXutil.rtrim( A5686EntLotN),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,54);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtEntLotN_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtEntLotN_Enabled),Integer.valueOf(1),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_42_" + sGXsfl_40_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 55,'',false,'" + sGXsfl_40_idx + "',40)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_lineasRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtEntFVal_Internalname,localUtil.format(A5685EntFVal, "99/99/99"),localUtil.format( A5685EntFVal, "99/99/99"),TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,55);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtEntFVal_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtEntFVal_Enabled),Integer.valueOf(1),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      httpContext.ajax_sending_grid_row(Gridlevel_lineasRow);
      send_integrity_lvl_hashes1SH42( ) ;
      GXCCtl = "Z597LinEnt_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z597LinEnt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z12716EntFabId_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z12716EntFabId, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z6156EntPrvNum_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z6156EntPrvNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z415EntFecEnt_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, localUtil.dtoc( Z415EntFecEnt, 0, "/"));
      GXCCtl = "Z10184EntRemTpo_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z10184EntRemTpo));
      GXCCtl = "Z3404EntPedCum_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z3404EntPedCum));
      GXCCtl = "Z411EntCon_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z411EntCon, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z419EntUniRem_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z419EntUniRem, (byte)(11), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z417EntPre_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z417EntPre, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z11Albaran_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z11Albaran));
      GXCCtl = "Z12857EntNAlbar_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z12857EntNAlbar));
      GXCCtl = "Z418EntUniEnt_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z418EntUniEnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z416EntNumCon_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z416EntNumCon, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z5686EntLotN_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z5686EntLotN));
      GXCCtl = "Z5685EntFVal_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, localUtil.dtoc( Z5685EntFVal, 0, "/"));
      GXCCtl = "Z414EntEti_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z414EntEti, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z413EntConIni_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z413EntConIni, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z412EntConFin_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z412EntConFin, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z5691EntBnc_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z5691EntBnc));
      GXCCtl = "Z7695EntCC_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z7695EntCC));
      GXCCtl = "Z7696EntCCoCod_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z7696EntCCoCod, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z10782EntUniAlb_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z10782EntUniAlb, (byte)(11), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z10783EntObs_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z10783EntObs));
      GXCCtl = "Z10187EntRemNro_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z10187EntRemNro));
      GXCCtl = "Z10186EntRemFch_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, localUtil.dtoc( Z10186EntRemFch, 0, "/"));
      GXCCtl = "Z10185EntRemSuc_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z10185EntRemSuc));
      GXCCtl = "Z13235EntLoteID_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z13235EntLoteID, (byte)(12), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z13456EntUbicaci_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z13456EntUbicaci));
      GXCCtl = "Z5690EntHfCon_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, localUtil.ttoc( Z5690EntHfCon, 10, 8, 0, 0, "/", ":", " "));
      GXCCtl = "Z5689EntFfCon_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, localUtil.dtoc( Z5689EntFfCon, 0, "/"));
      GXCCtl = "Z5688EntHiCon_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, localUtil.ttoc( Z5688EntHiCon, 10, 8, 0, 0, "/", ":", " "));
      GXCCtl = "Z5687EntFiCon_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, localUtil.dtoc( Z5687EntFiCon, 0, "/"));
      GXCCtl = "Z14035EntNEmb_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z14035EntNEmb, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z658PedCod_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z658PedCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z663PedFulEnt_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, localUtil.dtoc( Z663PedFulEnt, 0, "/"));
      GXCCtl = "Z665PedPre_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z665PedPre, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z669PedUni_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z669PedUni, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z659PedCum_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z659PedCum));
      GXCCtl = "Z660PedDto_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z660PedDto, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "O419EntUniRem_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( O419EntUniRem, (byte)(11), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "O418EntUniEnt_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( O418EntUniEnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "O657PedCanEnt_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( O657PedCanEnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "O415EntFecEnt_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, localUtil.dtoc( O415EntFecEnt, 0, "/"));
      GXCCtl = "O417EntPre_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( O417EntPre, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "O5686EntLotN_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( O5686EntLotN));
      GXCCtl = "O3404EntPedCum_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( O3404EntPedCum));
      GXCCtl = "PEDCANENT_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( A657PedCanEnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_42_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_42, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_42_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_42, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_42_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_42, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "N415EntFecEnt_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, localUtil.dtoc( A415EntFecEnt, 0, "/"));
      GXCCtl = "N11Albaran_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( A11Albaran));
      GXCCtl = "N12857EntNAlbar_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( A12857EntNAlbar));
      GXCCtl = "N6156EntPrvNum_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( A6156EntPrvNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "N418EntUniEnt_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( A418EntUniEnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "N3404EntPedCum_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( A3404EntPedCum));
      GXCCtl = "N417EntPre_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( A417EntPre, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "N5686EntLotN_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( A5686EntLotN));
      GXCCtl = "N5685EntFVal_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, localUtil.dtoc( A5685EntFVal, 0, "/"));
      GXCCtl = "vMODE_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Gx_mode));
      GXCCtl = "vEMPRCOD_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( AV18EmprCod));
      GXCCtl = "vPRDNUM_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( AV46PrdNum));
      GXCCtl = "EMPRCOD_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( A396EmprCod));
      GXCCtl = "ENTCON_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( A411EntCon, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "ENTREMTPO_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( A10184EntRemTpo));
      app.GxWebStd.gx_hidden_field( httpContext, "LINENT_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLinEnt_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ENTFECENT_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtEntFecEnt_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBARAN_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbaran_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBARAN_"+sGXsfl_40_idx+"Visible", GXutil.ltrim( localUtil.ntoc( edtAlbaran_Visible, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ENTNALBAR_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtEntNAlbar_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ENTNALBAR_"+sGXsfl_40_idx+"Visible", GXutil.ltrim( localUtil.ntoc( edtEntNAlbar_Visible, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PEDCOD_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPedCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vPEDCODPROMPT_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavPedcodprompt_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vPEDCODPROMPT_"+sGXsfl_40_idx+"Link", GXutil.rtrim( edtavPedcodprompt_Link));
      app.GxWebStd.gx_hidden_field( httpContext, "vPEDCODPROMPT_"+sGXsfl_40_idx+"Visible", GXutil.ltrim( localUtil.ntoc( edtavPedcodprompt_Visible, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ENTNEMB_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtEntNEmb_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ENTNEMB_"+sGXsfl_40_idx+"Visible", GXutil.ltrim( localUtil.ntoc( edtEntNEmb_Visible, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ENTPRVNUM_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtEntPrvNum_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ENTUNIENT_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtEntUniEnt_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ENTCUMP_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtEntCump_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ENTPEDCUM_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( cmbEntPedCum.getEnabled(), (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ENTPRE_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtEntPre_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ENTUNIREM_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtEntUniRem_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ENTLOTN_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtEntLotN_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ENTFVAL_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtEntFVal_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PROMPT_6156_"+sGXsfl_40_idx+"Link", GXutil.rtrim( imgprompt_6156_Link));
      httpContext.ajax_sending_grid_row(null);
      Gridlevel_lineasContainer.AddRow(Gridlevel_lineasRow);
   }

   public void readRow1SH42( )
   {
      nGXsfl_40_idx = (int)(nGXsfl_40_idx+1) ;
      sGXsfl_40_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_40_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_4042( ) ;
      edtLinEnt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "LINENT_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtEntFecEnt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ENTFECENT_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlbaran_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBARAN_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlbaran_Visible = (int)(localUtil.ctol( httpContext.cgiGet( "ALBARAN_"+sGXsfl_40_idx+"Visible"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtEntNAlbar_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ENTNALBAR_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtEntNAlbar_Visible = (int)(localUtil.ctol( httpContext.cgiGet( "ENTNALBAR_"+sGXsfl_40_idx+"Visible"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPedCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PEDCOD_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtavPedcodprompt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vPEDCODPROMPT_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtavPedcodprompt_Link = httpContext.cgiGet( "vPEDCODPROMPT_"+sGXsfl_40_idx+"Link") ;
      edtavPedcodprompt_Visible = (int)(localUtil.ctol( httpContext.cgiGet( "vPEDCODPROMPT_"+sGXsfl_40_idx+"Visible"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtEntNEmb_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ENTNEMB_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtEntNEmb_Visible = (int)(localUtil.ctol( httpContext.cgiGet( "ENTNEMB_"+sGXsfl_40_idx+"Visible"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtEntPrvNum_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ENTPRVNUM_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtEntUniEnt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ENTUNIENT_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtEntCump_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ENTCUMP_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      cmbEntPedCum.setEnabled( (int)(localUtil.ctol( httpContext.cgiGet( "ENTPEDCUM_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) );
      edtEntPre_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ENTPRE_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtEntUniRem_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ENTUNIREM_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtEntLotN_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ENTLOTN_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtEntFVal_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ENTFVAL_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      imgprompt_6156_Link = httpContext.cgiGet( "PROMPT_6156_"+sGXsfl_40_idx+"Link") ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtLinEnt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtLinEnt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "LINENT_" + sGXsfl_40_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtLinEnt_Internalname ;
         wbErr = true ;
         A597LinEnt = (short)(0) ;
      }
      else
      {
         A597LinEnt = (short)(localUtil.ctol( httpContext.cgiGet( edtLinEnt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( localUtil.vcdate( httpContext.cgiGet( edtEntFecEnt_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
      {
         GXCCtl = "ENTFECENT_" + sGXsfl_40_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtEntFecEnt_Internalname ;
         wbErr = true ;
         A415EntFecEnt = GXutil.nullDate() ;
      }
      else
      {
         A415EntFecEnt = localUtil.ctod( httpContext.cgiGet( edtEntFecEnt_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
      }
      A11Albaran = httpContext.cgiGet( edtAlbaran_Internalname) ;
      A12857EntNAlbar = httpContext.cgiGet( edtEntNAlbar_Internalname) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtPedCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtPedCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
      {
         GXCCtl = "PEDCOD_" + sGXsfl_40_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtPedCod_Internalname ;
         wbErr = true ;
         A658PedCod = 0 ;
         n658PedCod = false ;
      }
      else
      {
         A658PedCod = (int)(localUtil.ctol( httpContext.cgiGet( edtPedCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n658PedCod = false ;
      }
      AV43PedCodPrompt = httpContext.cgiGet( edtavPedcodprompt_Internalname) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtEntNEmb_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtEntNEmb_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
      {
         GXCCtl = "ENTNEMB_" + sGXsfl_40_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtEntNEmb_Internalname ;
         wbErr = true ;
         A14035EntNEmb = (byte)(0) ;
      }
      else
      {
         A14035EntNEmb = (byte)(localUtil.ctol( httpContext.cgiGet( edtEntNEmb_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtEntPrvNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtEntPrvNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
      {
         GXCCtl = "ENTPRVNUM_" + sGXsfl_40_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtEntPrvNum_Internalname ;
         wbErr = true ;
         A6156EntPrvNum = 0 ;
         n6156EntPrvNum = false ;
      }
      else
      {
         A6156EntPrvNum = (int)(localUtil.ctol( httpContext.cgiGet( edtEntPrvNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n6156EntPrvNum = false ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtEntUniEnt_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtEntUniEnt_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
      {
         GXCCtl = "ENTUNIENT_" + sGXsfl_40_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtEntUniEnt_Internalname ;
         wbErr = true ;
         A418EntUniEnt = DecimalUtil.ZERO ;
      }
      else
      {
         A418EntUniEnt = localUtil.ctond( httpContext.cgiGet( edtEntUniEnt_Internalname)) ;
      }
      A14041EntCump = httpContext.cgiGet( edtEntCump_Internalname) ;
      cmbEntPedCum.setName( cmbEntPedCum.getInternalname() );
      cmbEntPedCum.setValue( httpContext.cgiGet( cmbEntPedCum.getInternalname()) );
      A3404EntPedCum = httpContext.cgiGet( cmbEntPedCum.getInternalname()) ;
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtEntPre_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtEntPre_Internalname)), DecimalUtil.stringToDec("99999999.99999")) > 0 ) ) )
      {
         GXCCtl = "ENTPRE_" + sGXsfl_40_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtEntPre_Internalname ;
         wbErr = true ;
         A417EntPre = DecimalUtil.ZERO ;
      }
      else
      {
         A417EntPre = localUtil.ctond( httpContext.cgiGet( edtEntPre_Internalname)) ;
      }
      A419EntUniRem = localUtil.ctond( httpContext.cgiGet( edtEntUniRem_Internalname)) ;
      A5686EntLotN = httpContext.cgiGet( edtEntLotN_Internalname) ;
      if ( localUtil.vcdate( httpContext.cgiGet( edtEntFVal_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
      {
         GXCCtl = "ENTFVAL_" + sGXsfl_40_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtEntFVal_Internalname ;
         wbErr = true ;
         A5685EntFVal = GXutil.nullDate() ;
      }
      else
      {
         A5685EntFVal = localUtil.ctod( httpContext.cgiGet( edtEntFVal_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
      }
      GXCCtl = "Z597LinEnt_" + sGXsfl_40_idx ;
      Z597LinEnt = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z12716EntFabId_" + sGXsfl_40_idx ;
      Z12716EntFabId = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z6156EntPrvNum_" + sGXsfl_40_idx ;
      Z6156EntPrvNum = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z415EntFecEnt_" + sGXsfl_40_idx ;
      Z415EntFecEnt = localUtil.ctod( httpContext.cgiGet( GXCCtl), 0) ;
      GXCCtl = "Z10184EntRemTpo_" + sGXsfl_40_idx ;
      Z10184EntRemTpo = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z3404EntPedCum_" + sGXsfl_40_idx ;
      Z3404EntPedCum = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z411EntCon_" + sGXsfl_40_idx ;
      Z411EntCon = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z419EntUniRem_" + sGXsfl_40_idx ;
      Z419EntUniRem = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z417EntPre_" + sGXsfl_40_idx ;
      Z417EntPre = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z11Albaran_" + sGXsfl_40_idx ;
      Z11Albaran = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z12857EntNAlbar_" + sGXsfl_40_idx ;
      Z12857EntNAlbar = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z418EntUniEnt_" + sGXsfl_40_idx ;
      Z418EntUniEnt = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z416EntNumCon_" + sGXsfl_40_idx ;
      Z416EntNumCon = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z5686EntLotN_" + sGXsfl_40_idx ;
      Z5686EntLotN = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z5685EntFVal_" + sGXsfl_40_idx ;
      Z5685EntFVal = localUtil.ctod( httpContext.cgiGet( GXCCtl), 0) ;
      GXCCtl = "Z414EntEti_" + sGXsfl_40_idx ;
      Z414EntEti = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z413EntConIni_" + sGXsfl_40_idx ;
      Z413EntConIni = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z412EntConFin_" + sGXsfl_40_idx ;
      Z412EntConFin = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z5691EntBnc_" + sGXsfl_40_idx ;
      Z5691EntBnc = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z7695EntCC_" + sGXsfl_40_idx ;
      Z7695EntCC = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z7696EntCCoCod_" + sGXsfl_40_idx ;
      Z7696EntCCoCod = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z10782EntUniAlb_" + sGXsfl_40_idx ;
      Z10782EntUniAlb = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z10783EntObs_" + sGXsfl_40_idx ;
      Z10783EntObs = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z10187EntRemNro_" + sGXsfl_40_idx ;
      Z10187EntRemNro = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z10186EntRemFch_" + sGXsfl_40_idx ;
      Z10186EntRemFch = localUtil.ctod( httpContext.cgiGet( GXCCtl), 0) ;
      GXCCtl = "Z10185EntRemSuc_" + sGXsfl_40_idx ;
      Z10185EntRemSuc = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z13235EntLoteID_" + sGXsfl_40_idx ;
      Z13235EntLoteID = localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
      GXCCtl = "Z13456EntUbicaci_" + sGXsfl_40_idx ;
      Z13456EntUbicaci = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z5690EntHfCon_" + sGXsfl_40_idx ;
      Z5690EntHfCon = GXutil.resetDate(localUtil.ctot( httpContext.cgiGet( GXCCtl), 0)) ;
      GXCCtl = "Z5689EntFfCon_" + sGXsfl_40_idx ;
      Z5689EntFfCon = localUtil.ctod( httpContext.cgiGet( GXCCtl), 0) ;
      GXCCtl = "Z5688EntHiCon_" + sGXsfl_40_idx ;
      Z5688EntHiCon = GXutil.resetDate(localUtil.ctot( httpContext.cgiGet( GXCCtl), 0)) ;
      GXCCtl = "Z5687EntFiCon_" + sGXsfl_40_idx ;
      Z5687EntFiCon = localUtil.ctod( httpContext.cgiGet( GXCCtl), 0) ;
      GXCCtl = "Z14035EntNEmb_" + sGXsfl_40_idx ;
      Z14035EntNEmb = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z658PedCod_" + sGXsfl_40_idx ;
      Z658PedCod = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z663PedFulEnt_" + sGXsfl_40_idx ;
      Z663PedFulEnt = localUtil.ctod( httpContext.cgiGet( GXCCtl), 0) ;
      GXCCtl = "Z665PedPre_" + sGXsfl_40_idx ;
      Z665PedPre = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z669PedUni_" + sGXsfl_40_idx ;
      Z669PedUni = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z659PedCum_" + sGXsfl_40_idx ;
      Z659PedCum = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z660PedDto_" + sGXsfl_40_idx ;
      Z660PedDto = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z12716EntFabId_" + sGXsfl_40_idx ;
      A12716EntFabId = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z10184EntRemTpo_" + sGXsfl_40_idx ;
      A10184EntRemTpo = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z411EntCon_" + sGXsfl_40_idx ;
      A411EntCon = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z416EntNumCon_" + sGXsfl_40_idx ;
      A416EntNumCon = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z414EntEti_" + sGXsfl_40_idx ;
      A414EntEti = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z413EntConIni_" + sGXsfl_40_idx ;
      A413EntConIni = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z412EntConFin_" + sGXsfl_40_idx ;
      A412EntConFin = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z5691EntBnc_" + sGXsfl_40_idx ;
      A5691EntBnc = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z7695EntCC_" + sGXsfl_40_idx ;
      A7695EntCC = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z7696EntCCoCod_" + sGXsfl_40_idx ;
      A7696EntCCoCod = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z10782EntUniAlb_" + sGXsfl_40_idx ;
      A10782EntUniAlb = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z10783EntObs_" + sGXsfl_40_idx ;
      A10783EntObs = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z10187EntRemNro_" + sGXsfl_40_idx ;
      A10187EntRemNro = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z10186EntRemFch_" + sGXsfl_40_idx ;
      A10186EntRemFch = localUtil.ctod( httpContext.cgiGet( GXCCtl), 0) ;
      GXCCtl = "Z10185EntRemSuc_" + sGXsfl_40_idx ;
      A10185EntRemSuc = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z13235EntLoteID_" + sGXsfl_40_idx ;
      A13235EntLoteID = localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
      GXCCtl = "Z13456EntUbicaci_" + sGXsfl_40_idx ;
      A13456EntUbicaci = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z5690EntHfCon_" + sGXsfl_40_idx ;
      A5690EntHfCon = GXutil.resetDate(localUtil.ctot( httpContext.cgiGet( GXCCtl), 0)) ;
      GXCCtl = "Z5689EntFfCon_" + sGXsfl_40_idx ;
      A5689EntFfCon = localUtil.ctod( httpContext.cgiGet( GXCCtl), 0) ;
      GXCCtl = "Z5688EntHiCon_" + sGXsfl_40_idx ;
      A5688EntHiCon = GXutil.resetDate(localUtil.ctot( httpContext.cgiGet( GXCCtl), 0)) ;
      GXCCtl = "Z5687EntFiCon_" + sGXsfl_40_idx ;
      A5687EntFiCon = localUtil.ctod( httpContext.cgiGet( GXCCtl), 0) ;
      GXCCtl = "Z663PedFulEnt_" + sGXsfl_40_idx ;
      A663PedFulEnt = localUtil.ctod( httpContext.cgiGet( GXCCtl), 0) ;
      GXCCtl = "Z665PedPre_" + sGXsfl_40_idx ;
      A665PedPre = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z669PedUni_" + sGXsfl_40_idx ;
      A669PedUni = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z659PedCum_" + sGXsfl_40_idx ;
      A659PedCum = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z660PedDto_" + sGXsfl_40_idx ;
      A660PedDto = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "O419EntUniRem_" + sGXsfl_40_idx ;
      O419EntUniRem = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "O418EntUniEnt_" + sGXsfl_40_idx ;
      O418EntUniEnt = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "O657PedCanEnt_" + sGXsfl_40_idx ;
      O657PedCanEnt = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "O415EntFecEnt_" + sGXsfl_40_idx ;
      O415EntFecEnt = localUtil.ctod( httpContext.cgiGet( GXCCtl), 0) ;
      GXCCtl = "O417EntPre_" + sGXsfl_40_idx ;
      O417EntPre = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "O5686EntLotN_" + sGXsfl_40_idx ;
      O5686EntLotN = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "O3404EntPedCum_" + sGXsfl_40_idx ;
      O3404EntPedCum = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "PEDCANENT_" + sGXsfl_40_idx ;
      A657PedCanEnt = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "nRcdDeleted_42_" + sGXsfl_40_idx ;
      nRcdDeleted_42 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_42_" + sGXsfl_40_idx ;
      nRcdExists_42 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_42_" + sGXsfl_40_idx ;
      nIsMod_42 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "N415EntFecEnt_" + sGXsfl_40_idx ;
      N415EntFecEnt = localUtil.ctod( httpContext.cgiGet( GXCCtl), 0) ;
      GXCCtl = "N11Albaran_" + sGXsfl_40_idx ;
      N11Albaran = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "N12857EntNAlbar_" + sGXsfl_40_idx ;
      N12857EntNAlbar = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "N6156EntPrvNum_" + sGXsfl_40_idx ;
      N6156EntPrvNum = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "N418EntUniEnt_" + sGXsfl_40_idx ;
      N418EntUniEnt = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "N3404EntPedCum_" + sGXsfl_40_idx ;
      N3404EntPedCum = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "N417EntPre_" + sGXsfl_40_idx ;
      N417EntPre = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "N5686EntLotN_" + sGXsfl_40_idx ;
      N5686EntLotN = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "N5685EntFVal_" + sGXsfl_40_idx ;
      N5685EntFVal = localUtil.ctod( httpContext.cgiGet( GXCCtl), 0) ;
      GXCCtl = "ENTCON_" + sGXsfl_40_idx ;
      A411EntCon = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "ENTREMTPO_" + sGXsfl_40_idx ;
      A10184EntRemTpo = httpContext.cgiGet( GXCCtl) ;
   }

   public void assign_properties_default( )
   {
      defedtEntFVal_Enabled = edtEntFVal_Enabled ;
      defedtEntLotN_Enabled = edtEntLotN_Enabled ;
      defedtEntUniRem_Enabled = edtEntUniRem_Enabled ;
      defedtEntPre_Enabled = edtEntPre_Enabled ;
      defcmbEntPedCum_Enabled = cmbEntPedCum.getEnabled() ;
      defedtEntCump_Enabled = edtEntCump_Enabled ;
      defedtEntUniEnt_Enabled = edtEntUniEnt_Enabled ;
      defedtEntPrvNum_Enabled = edtEntPrvNum_Enabled ;
      defedtEntNAlbar_Enabled = edtEntNAlbar_Enabled ;
      defedtAlbaran_Enabled = edtAlbaran_Enabled ;
      defedtEntFecEnt_Enabled = edtEntFecEnt_Enabled ;
      defedtLinEnt_Enabled = edtLinEnt_Enabled ;
   }

   public void confirmValues1SH0( )
   {
      nGXsfl_40_idx = 0 ;
      sGXsfl_40_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_40_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_4042( ) ;
      while ( nGXsfl_40_idx < nRC_GXsfl_40 )
      {
         nGXsfl_40_idx = (int)(nGXsfl_40_idx+1) ;
         sGXsfl_40_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_40_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_4042( ) ;
         httpContext.changePostValue( "Z597LinEnt_"+sGXsfl_40_idx, httpContext.cgiGet( "ZT_"+"Z597LinEnt_"+sGXsfl_40_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z597LinEnt_"+sGXsfl_40_idx) ;
         httpContext.changePostValue( "Z12716EntFabId_"+sGXsfl_40_idx, httpContext.cgiGet( "ZT_"+"Z12716EntFabId_"+sGXsfl_40_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z12716EntFabId_"+sGXsfl_40_idx) ;
         httpContext.changePostValue( "Z6156EntPrvNum_"+sGXsfl_40_idx, httpContext.cgiGet( "ZT_"+"Z6156EntPrvNum_"+sGXsfl_40_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z6156EntPrvNum_"+sGXsfl_40_idx) ;
         httpContext.changePostValue( "Z415EntFecEnt_"+sGXsfl_40_idx, httpContext.cgiGet( "ZT_"+"Z415EntFecEnt_"+sGXsfl_40_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z415EntFecEnt_"+sGXsfl_40_idx) ;
         httpContext.changePostValue( "Z10184EntRemTpo_"+sGXsfl_40_idx, httpContext.cgiGet( "ZT_"+"Z10184EntRemTpo_"+sGXsfl_40_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10184EntRemTpo_"+sGXsfl_40_idx) ;
         httpContext.changePostValue( "Z3404EntPedCum_"+sGXsfl_40_idx, httpContext.cgiGet( "ZT_"+"Z3404EntPedCum_"+sGXsfl_40_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z3404EntPedCum_"+sGXsfl_40_idx) ;
         httpContext.changePostValue( "Z411EntCon_"+sGXsfl_40_idx, httpContext.cgiGet( "ZT_"+"Z411EntCon_"+sGXsfl_40_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z411EntCon_"+sGXsfl_40_idx) ;
         httpContext.changePostValue( "Z419EntUniRem_"+sGXsfl_40_idx, httpContext.cgiGet( "ZT_"+"Z419EntUniRem_"+sGXsfl_40_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z419EntUniRem_"+sGXsfl_40_idx) ;
         httpContext.changePostValue( "Z417EntPre_"+sGXsfl_40_idx, httpContext.cgiGet( "ZT_"+"Z417EntPre_"+sGXsfl_40_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z417EntPre_"+sGXsfl_40_idx) ;
         httpContext.changePostValue( "Z11Albaran_"+sGXsfl_40_idx, httpContext.cgiGet( "ZT_"+"Z11Albaran_"+sGXsfl_40_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z11Albaran_"+sGXsfl_40_idx) ;
         httpContext.changePostValue( "Z12857EntNAlbar_"+sGXsfl_40_idx, httpContext.cgiGet( "ZT_"+"Z12857EntNAlbar_"+sGXsfl_40_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z12857EntNAlbar_"+sGXsfl_40_idx) ;
         httpContext.changePostValue( "Z418EntUniEnt_"+sGXsfl_40_idx, httpContext.cgiGet( "ZT_"+"Z418EntUniEnt_"+sGXsfl_40_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z418EntUniEnt_"+sGXsfl_40_idx) ;
         httpContext.changePostValue( "Z416EntNumCon_"+sGXsfl_40_idx, httpContext.cgiGet( "ZT_"+"Z416EntNumCon_"+sGXsfl_40_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z416EntNumCon_"+sGXsfl_40_idx) ;
         httpContext.changePostValue( "Z5686EntLotN_"+sGXsfl_40_idx, httpContext.cgiGet( "ZT_"+"Z5686EntLotN_"+sGXsfl_40_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z5686EntLotN_"+sGXsfl_40_idx) ;
         httpContext.changePostValue( "Z5685EntFVal_"+sGXsfl_40_idx, httpContext.cgiGet( "ZT_"+"Z5685EntFVal_"+sGXsfl_40_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z5685EntFVal_"+sGXsfl_40_idx) ;
         httpContext.changePostValue( "Z414EntEti_"+sGXsfl_40_idx, httpContext.cgiGet( "ZT_"+"Z414EntEti_"+sGXsfl_40_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z414EntEti_"+sGXsfl_40_idx) ;
         httpContext.changePostValue( "Z413EntConIni_"+sGXsfl_40_idx, httpContext.cgiGet( "ZT_"+"Z413EntConIni_"+sGXsfl_40_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z413EntConIni_"+sGXsfl_40_idx) ;
         httpContext.changePostValue( "Z412EntConFin_"+sGXsfl_40_idx, httpContext.cgiGet( "ZT_"+"Z412EntConFin_"+sGXsfl_40_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z412EntConFin_"+sGXsfl_40_idx) ;
         httpContext.changePostValue( "Z5691EntBnc_"+sGXsfl_40_idx, httpContext.cgiGet( "ZT_"+"Z5691EntBnc_"+sGXsfl_40_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z5691EntBnc_"+sGXsfl_40_idx) ;
         httpContext.changePostValue( "Z7695EntCC_"+sGXsfl_40_idx, httpContext.cgiGet( "ZT_"+"Z7695EntCC_"+sGXsfl_40_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z7695EntCC_"+sGXsfl_40_idx) ;
         httpContext.changePostValue( "Z7696EntCCoCod_"+sGXsfl_40_idx, httpContext.cgiGet( "ZT_"+"Z7696EntCCoCod_"+sGXsfl_40_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z7696EntCCoCod_"+sGXsfl_40_idx) ;
         httpContext.changePostValue( "Z10782EntUniAlb_"+sGXsfl_40_idx, httpContext.cgiGet( "ZT_"+"Z10782EntUniAlb_"+sGXsfl_40_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10782EntUniAlb_"+sGXsfl_40_idx) ;
         httpContext.changePostValue( "Z10783EntObs_"+sGXsfl_40_idx, httpContext.cgiGet( "ZT_"+"Z10783EntObs_"+sGXsfl_40_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10783EntObs_"+sGXsfl_40_idx) ;
         httpContext.changePostValue( "Z10187EntRemNro_"+sGXsfl_40_idx, httpContext.cgiGet( "ZT_"+"Z10187EntRemNro_"+sGXsfl_40_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10187EntRemNro_"+sGXsfl_40_idx) ;
         httpContext.changePostValue( "Z10186EntRemFch_"+sGXsfl_40_idx, httpContext.cgiGet( "ZT_"+"Z10186EntRemFch_"+sGXsfl_40_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10186EntRemFch_"+sGXsfl_40_idx) ;
         httpContext.changePostValue( "Z10185EntRemSuc_"+sGXsfl_40_idx, httpContext.cgiGet( "ZT_"+"Z10185EntRemSuc_"+sGXsfl_40_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10185EntRemSuc_"+sGXsfl_40_idx) ;
         httpContext.changePostValue( "Z13235EntLoteID_"+sGXsfl_40_idx, httpContext.cgiGet( "ZT_"+"Z13235EntLoteID_"+sGXsfl_40_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z13235EntLoteID_"+sGXsfl_40_idx) ;
         httpContext.changePostValue( "Z13456EntUbicaci_"+sGXsfl_40_idx, httpContext.cgiGet( "ZT_"+"Z13456EntUbicaci_"+sGXsfl_40_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z13456EntUbicaci_"+sGXsfl_40_idx) ;
         httpContext.changePostValue( "Z5690EntHfCon_"+sGXsfl_40_idx, httpContext.cgiGet( "ZT_"+"Z5690EntHfCon_"+sGXsfl_40_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z5690EntHfCon_"+sGXsfl_40_idx) ;
         httpContext.changePostValue( "Z5689EntFfCon_"+sGXsfl_40_idx, httpContext.cgiGet( "ZT_"+"Z5689EntFfCon_"+sGXsfl_40_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z5689EntFfCon_"+sGXsfl_40_idx) ;
         httpContext.changePostValue( "Z5688EntHiCon_"+sGXsfl_40_idx, httpContext.cgiGet( "ZT_"+"Z5688EntHiCon_"+sGXsfl_40_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z5688EntHiCon_"+sGXsfl_40_idx) ;
         httpContext.changePostValue( "Z5687EntFiCon_"+sGXsfl_40_idx, httpContext.cgiGet( "ZT_"+"Z5687EntFiCon_"+sGXsfl_40_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z5687EntFiCon_"+sGXsfl_40_idx) ;
         httpContext.changePostValue( "Z14035EntNEmb_"+sGXsfl_40_idx, httpContext.cgiGet( "ZT_"+"Z14035EntNEmb_"+sGXsfl_40_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z14035EntNEmb_"+sGXsfl_40_idx) ;
         httpContext.changePostValue( "Z658PedCod_"+sGXsfl_40_idx, httpContext.cgiGet( "ZT_"+"Z658PedCod_"+sGXsfl_40_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z658PedCod_"+sGXsfl_40_idx) ;
         httpContext.changePostValue( "Z663PedFulEnt_"+sGXsfl_40_idx, httpContext.cgiGet( "ZT_"+"Z663PedFulEnt_"+sGXsfl_40_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z663PedFulEnt_"+sGXsfl_40_idx) ;
         httpContext.changePostValue( "Z665PedPre_"+sGXsfl_40_idx, httpContext.cgiGet( "ZT_"+"Z665PedPre_"+sGXsfl_40_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z665PedPre_"+sGXsfl_40_idx) ;
         httpContext.changePostValue( "Z669PedUni_"+sGXsfl_40_idx, httpContext.cgiGet( "ZT_"+"Z669PedUni_"+sGXsfl_40_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z669PedUni_"+sGXsfl_40_idx) ;
         httpContext.changePostValue( "Z659PedCum_"+sGXsfl_40_idx, httpContext.cgiGet( "ZT_"+"Z659PedCum_"+sGXsfl_40_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z659PedCum_"+sGXsfl_40_idx) ;
         httpContext.changePostValue( "Z660PedDto_"+sGXsfl_40_idx, httpContext.cgiGet( "ZT_"+"Z660PedDto_"+sGXsfl_40_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z660PedDto_"+sGXsfl_40_idx) ;
      }
      httpContext.changePostValue( "O419EntUniRem", httpContext.cgiGet( "T419EntUniRem")) ;
      httpContext.deletePostValue( "T419EntUniRem") ;
      httpContext.changePostValue( "O418EntUniEnt", httpContext.cgiGet( "T418EntUniEnt")) ;
      httpContext.deletePostValue( "T418EntUniEnt") ;
      httpContext.changePostValue( "O657PedCanEnt", httpContext.cgiGet( "T657PedCanEnt")) ;
      httpContext.deletePostValue( "T657PedCanEnt") ;
      httpContext.changePostValue( "O415EntFecEnt", httpContext.cgiGet( "T415EntFecEnt")) ;
      httpContext.deletePostValue( "T415EntFecEnt") ;
      httpContext.changePostValue( "O417EntPre", httpContext.cgiGet( "T417EntPre")) ;
      httpContext.deletePostValue( "T417EntPre") ;
      httpContext.changePostValue( "O5686EntLotN", httpContext.cgiGet( "T5686EntLotN")) ;
      httpContext.deletePostValue( "T5686EntLotN") ;
      httpContext.changePostValue( "O3404EntPedCum", httpContext.cgiGet( "T3404EntPedCum")) ;
      httpContext.deletePostValue( "T3404EntPedCum") ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.entradaproducto", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV18EmprCod)),GXutil.URLEncode(GXutil.rtrim(AV46PrdNum))}, new String[] {"Gx_mode","EmprCod","PrdNum"}) +"\">") ;
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
      forbiddenHiddens.add("hshsalt", "hsh"+"EntradaProducto");
      forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV62Pgmname, "")));
      forbiddenHiddens.add("PrdDetPar", GXutil.rtrim( localUtil.format( A698PrdDetPar, "")));
      forbiddenHiddens.add("PrdRotRea", localUtil.format( A729PrdRotRea, "ZZZZZ9.999"));
      forbiddenHiddens.add("PrdRec", GXutil.rtrim( localUtil.format( A727PrdRec, "")));
      forbiddenHiddens.add("PrdPreAc2", localUtil.format( A5255PrdPreAc2, "ZZZZZZZ9.999"));
      forbiddenHiddens.add("PrdExiCC", localUtil.format( A705PrdExiCC, "ZZZZZZ9.9999"));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("entradaproducto:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z719PrdNum", GXutil.rtrim( Z719PrdNum));
      app.GxWebStd.gx_hidden_field( httpContext, "Z726PrdPreMed", GXutil.ltrim( localUtil.ntoc( Z726PrdPreMed, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z725PrdPreAnt", GXutil.ltrim( localUtil.ntoc( Z725PrdPreAnt, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z718PrdNom", GXutil.rtrim( Z718PrdNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z724PrdPreAct", GXutil.ltrim( localUtil.ntoc( Z724PrdPreAct, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z704PrdExiAlm", GXutil.ltrim( localUtil.ntoc( Z704PrdExiAlm, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z847UltLinEnt", GXutil.ltrim( localUtil.ntoc( Z847UltLinEnt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z698PrdDetPar", GXutil.rtrim( Z698PrdDetPar));
      app.GxWebStd.gx_hidden_field( httpContext, "Z713PrdFulEnt", localUtil.dtoc( Z713PrdFulEnt, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z684PrdCanPen", GXutil.ltrim( localUtil.ntoc( Z684PrdCanPen, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z729PrdRotRea", GXutil.ltrim( localUtil.ntoc( Z729PrdRotRea, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z727PrdRec", GXutil.rtrim( Z727PrdRec));
      app.GxWebStd.gx_hidden_field( httpContext, "Z709PrdFecPre", localUtil.dtoc( Z709PrdFecPre, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5255PrdPreAc2", GXutil.ltrim( localUtil.ntoc( Z5255PrdPreAc2, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z750PrdValStk", GXutil.ltrim( localUtil.ntoc( Z750PrdValStk, (byte)(11), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z705PrdExiCC", GXutil.ltrim( localUtil.ntoc( Z705PrdExiCC, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z795PrvNum", GXutil.ltrim( localUtil.ntoc( Z795PrvNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z856ValCod", GXutil.ltrim( localUtil.ntoc( Z856ValCod, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O724PrdPreAct", GXutil.ltrim( localUtil.ntoc( O724PrdPreAct, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O704PrdExiAlm", GXutil.ltrim( localUtil.ntoc( O704PrdExiAlm, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O750PrdValStk", GXutil.ltrim( localUtil.ntoc( O750PrdValStk, (byte)(11), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O847UltLinEnt", GXutil.ltrim( localUtil.ntoc( O847UltLinEnt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_Mode", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_40", GXutil.ltrim( localUtil.ntoc( nGXsfl_40_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "N795PrvNum", GXutil.ltrim( localUtil.ntoc( A795PrvNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "N856ValCod", GXutil.ltrim( localUtil.ntoc( A856ValCod, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "ULTFECCCS", localUtil.dtoc( A3835UltFecCCs, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV18EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV18EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vPRDNUM", GXutil.rtrim( AV46PrdNum));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPRDNUM", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV46PrdNum, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vINSERT_PRVNUM", GXutil.ltrim( localUtil.ntoc( AV27Insert_PrvNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PRVNUM", GXutil.ltrim( localUtil.ntoc( A795PrvNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vINSERT_VALCOD", GXutil.ltrim( localUtil.ntoc( AV28Insert_ValCod, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "VALCOD", GXutil.ltrim( localUtil.ntoc( A856ValCod, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PRVPRI", GXutil.ltrim( localUtil.ntoc( A800PrvPri, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vPEDPRI", GXutil.rtrim( AV44PedPri));
      app.GxWebStd.gx_hidden_field( httpContext, "vOLDEXIALM", GXutil.ltrim( localUtil.ntoc( AV40OldExiAlm, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDVALSTK", GXutil.ltrim( localUtil.ntoc( A750PrdValStk, (byte)(11), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vCONSUMOS", GXutil.ltrim( localUtil.ntoc( AV14Consumos, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDEXICC", GXutil.ltrim( localUtil.ntoc( A705PrdExiCC, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDPREMED", GXutil.ltrim( localUtil.ntoc( A726PrdPreMed, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDPREACT", GXutil.ltrim( localUtil.ntoc( A724PrdPreAct, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vNOUPD", GXutil.ltrim( localUtil.ntoc( AV36NoUpd, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDPREANT", GXutil.ltrim( localUtil.ntoc( A725PrdPreAnt, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ULTLINENT", GXutil.ltrim( localUtil.ntoc( A847UltLinEnt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDDETPAR", GXutil.rtrim( A698PrdDetPar));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDFULENT", localUtil.dtoc( A713PrdFulEnt, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDCANPEN", GXutil.ltrim( localUtil.ntoc( A684PrdCanPen, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDROTREA", GXutil.ltrim( localUtil.ntoc( A729PrdRotRea, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDREC", GXutil.rtrim( A727PrdRec));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDFECPRE", localUtil.dtoc( A709PrdFecPre, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDPREAC2", GXutil.ltrim( localUtil.ntoc( A5255PrdPreAc2, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRNOM", GXutil.rtrim( A407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPNUMDEC", GXutil.ltrim( localUtil.ntoc( A3915EmpNumDec, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PRVNOM", GXutil.rtrim( A794PrvNom));
      app.GxWebStd.gx_hidden_field( httpContext, "STOCKREM", GXutil.ltrim( localUtil.ntoc( A913StockRem, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTODAY", localUtil.dtoc( Gx_date, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "vGXBSCREEN", GXutil.ltrim( localUtil.ntoc( Gx_BScreen, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PEDCANENT", GXutil.ltrim( localUtil.ntoc( A657PedCanEnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PEDUNI", GXutil.ltrim( localUtil.ntoc( A669PedUni, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ENTFABID", GXutil.ltrim( localUtil.ntoc( A12716EntFabId, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ENTREMTPO", GXutil.rtrim( A10184EntRemTpo));
      app.GxWebStd.gx_hidden_field( httpContext, "ENTCON", GXutil.ltrim( localUtil.ntoc( A411EntCon, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vYEAR", GXutil.ltrim( localUtil.ntoc( AV59Year, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMES", GXutil.ltrim( localUtil.ntoc( AV30Mes, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PEDPRI", GXutil.rtrim( A666PedPri));
      app.GxWebStd.gx_hidden_field( httpContext, "vOLDENTPRE", GXutil.ltrim( localUtil.ntoc( AV38OldEntPre, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vOLDENTUNI", GXutil.ltrim( localUtil.ntoc( AV39OldEntUni, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vOLDREMANENTE", GXutil.ltrim( localUtil.ntoc( AV42OldRemanente, (byte)(11), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vOLDENTFECENT", localUtil.dtoc( AV37oldEntFecent, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "vOLDLOTE", GXutil.rtrim( AV41oldlote));
      app.GxWebStd.gx_hidden_field( httpContext, "vUNIOLD", GXutil.ltrim( localUtil.ntoc( AV55UniOld, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vFECANT", localUtil.dtoc( AV22FecAnt, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "vPRECANT", GXutil.ltrim( localUtil.ntoc( AV48PrecAnt, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vANYANT", GXutil.ltrim( localUtil.ntoc( AV12AnyAnt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMESANT", GXutil.ltrim( localUtil.ntoc( AV31MesAnt, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PEDFULENT", localUtil.dtoc( A663PedFulEnt, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "PEDPRE", GXutil.ltrim( localUtil.ntoc( A665PedPre, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PEDDTO", GXutil.ltrim( localUtil.ntoc( A660PedDto, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vPRDNOMX", GXutil.rtrim( AV45PrdNomX));
      app.GxWebStd.gx_hidden_field( httpContext, "vMSG_CTRL_FECHA", AV34msg_ctrl_fecha);
      app.GxWebStd.gx_hidden_field( httpContext, "vFECHA", localUtil.dtoc( AV23Fecha, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "vINC_OBS", AV26Inc_obs);
      app.GxWebStd.gx_hidden_field( httpContext, "vDIASFIN", GXutil.ltrim( localUtil.ntoc( AV17DiasFin, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PEDNUMLIN", GXutil.ltrim( localUtil.ntoc( A664PedNumLin, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vNALBARAN20", GXutil.ltrim( localUtil.ntoc( AV35Nalbaran20, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vUSURCOD", GXutil.rtrim( AV56UsurCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vSTATION", GXutil.rtrim( AV50Station));
      app.GxWebStd.gx_hidden_field( httpContext, "vFLAGPRE", GXutil.ltrim( localUtil.ntoc( AV60FlagPre, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vFLAGFECCCS", GXutil.ltrim( localUtil.ntoc( AV25FlagFecCcs, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ENTNUMCON", GXutil.ltrim( localUtil.ntoc( A416EntNumCon, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ENTETI", GXutil.ltrim( localUtil.ntoc( A414EntEti, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ENTCONINI", GXutil.ltrim( localUtil.ntoc( A413EntConIni, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ENTCONFIN", GXutil.ltrim( localUtil.ntoc( A412EntConFin, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ENTBNC", GXutil.rtrim( A5691EntBnc));
      app.GxWebStd.gx_hidden_field( httpContext, "ENTCC", GXutil.rtrim( A7695EntCC));
      app.GxWebStd.gx_hidden_field( httpContext, "ENTCCOCOD", GXutil.ltrim( localUtil.ntoc( A7696EntCCoCod, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ENTUNIALB", GXutil.ltrim( localUtil.ntoc( A10782EntUniAlb, (byte)(11), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ENTOBS", GXutil.rtrim( A10783EntObs));
      app.GxWebStd.gx_hidden_field( httpContext, "ENTREMNRO", GXutil.rtrim( A10187EntRemNro));
      app.GxWebStd.gx_hidden_field( httpContext, "ENTREMFCH", localUtil.dtoc( A10186EntRemFch, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "ENTREMSUC", GXutil.rtrim( A10185EntRemSuc));
      app.GxWebStd.gx_hidden_field( httpContext, "ENTLOTEID", GXutil.ltrim( localUtil.ntoc( A13235EntLoteID, (byte)(12), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ENTUBICACI", GXutil.rtrim( A13456EntUbicaci));
      app.GxWebStd.gx_hidden_field( httpContext, "ENTHFCON", localUtil.ttoc( A5690EntHfCon, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "ENTFFCON", localUtil.dtoc( A5689EntFfCon, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "ENTHICON", localUtil.ttoc( A5688EntHiCon, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "ENTFICON", localUtil.dtoc( A5687EntFiCon, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "PEDFEC", localUtil.dtoc( A661PedFec, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "PEDSIT", GXutil.rtrim( A667PedSit));
      app.GxWebStd.gx_hidden_field( httpContext, "PEDALMC", GXutil.ltrim( localUtil.ntoc( A12580PedAlmc, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PEDCUM", GXutil.rtrim( A659PedCum));
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
      return formatLink("app.entradaproducto", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV18EmprCod)),GXutil.URLEncode(GXutil.rtrim(AV46PrdNum))}, new String[] {"Gx_mode","EmprCod","PrdNum"})  ;
   }

   public String getPgmname( )
   {
      return "EntradaProducto" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Entrada Producto", "") ;
   }

   public void initializeNonKey1SH29( )
   {
      A795PrvNum = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A795PrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A795PrvNum), 6, 0));
      A856ValCod = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A856ValCod", GXutil.str( A856ValCod, 1, 0));
      AV44PedPri = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV44PedPri", AV44PedPri);
      AV40OldExiAlm = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV40OldExiAlm", GXutil.ltrimstr( AV40OldExiAlm, 12, 4));
      A726PrdPreMed = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A726PrdPreMed", GXutil.ltrimstr( A726PrdPreMed, 14, 5));
      A725PrdPreAnt = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A725PrdPreAnt", GXutil.ltrimstr( A725PrdPreAnt, 14, 5));
      A3835UltFecCCs = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "A3835UltFecCCs", localUtil.format(A3835UltFecCCs, "99/99/99"));
      A14040PrdUltMovF = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "A14040PrdUltMovF", localUtil.format(A14040PrdUltMovF, "99/99/99"));
      A718PrdNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A718PrdNom", A718PrdNom);
      A794PrvNom = "" ;
      n794PrvNom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A794PrvNom", A794PrvNom);
      A724PrdPreAct = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A724PrdPreAct", GXutil.ltrimstr( A724PrdPreAct, 14, 5));
      A704PrdExiAlm = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A704PrdExiAlm", GXutil.ltrimstr( A704PrdExiAlm, 12, 4));
      A847UltLinEnt = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A847UltLinEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A847UltLinEnt), 4, 0));
      A698PrdDetPar = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A698PrdDetPar", A698PrdDetPar);
      A713PrdFulEnt = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "A713PrdFulEnt", localUtil.format(A713PrdFulEnt, "99/99/99"));
      A684PrdCanPen = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A684PrdCanPen", GXutil.ltrimstr( A684PrdCanPen, 12, 4));
      A729PrdRotRea = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A729PrdRotRea", GXutil.ltrimstr( A729PrdRotRea, 12, 5));
      A727PrdRec = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A727PrdRec", A727PrdRec);
      A709PrdFecPre = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "A709PrdFecPre", localUtil.format(A709PrdFecPre, "99/99/99"));
      A913StockRem = DecimalUtil.ZERO ;
      n913StockRem = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A913StockRem", GXutil.ltrimstr( A913StockRem, 12, 4));
      A800PrvPri = (byte)(0) ;
      n800PrvPri = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A800PrvPri", GXutil.str( A800PrvPri, 1, 0));
      A5255PrdPreAc2 = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A5255PrdPreAc2", GXutil.ltrimstr( A5255PrdPreAc2, 14, 5));
      A750PrdValStk = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A750PrdValStk", GXutil.ltrimstr( A750PrdValStk, 11, 2));
      A705PrdExiCC = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A705PrdExiCC", GXutil.ltrimstr( A705PrdExiCC, 12, 4));
      O724PrdPreAct = A724PrdPreAct ;
      httpContext.ajax_rsp_assign_attri("", false, "A724PrdPreAct", GXutil.ltrimstr( A724PrdPreAct, 14, 5));
      O704PrdExiAlm = A704PrdExiAlm ;
      httpContext.ajax_rsp_assign_attri("", false, "A704PrdExiAlm", GXutil.ltrimstr( A704PrdExiAlm, 12, 4));
      O750PrdValStk = A750PrdValStk ;
      httpContext.ajax_rsp_assign_attri("", false, "A750PrdValStk", GXutil.ltrimstr( A750PrdValStk, 11, 2));
      O847UltLinEnt = A847UltLinEnt ;
      httpContext.ajax_rsp_assign_attri("", false, "A847UltLinEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A847UltLinEnt), 4, 0));
      Z726PrdPreMed = DecimalUtil.ZERO ;
      Z725PrdPreAnt = DecimalUtil.ZERO ;
      Z718PrdNom = "" ;
      Z724PrdPreAct = DecimalUtil.ZERO ;
      Z704PrdExiAlm = DecimalUtil.ZERO ;
      Z847UltLinEnt = (short)(0) ;
      Z698PrdDetPar = "" ;
      Z713PrdFulEnt = GXutil.nullDate() ;
      Z684PrdCanPen = DecimalUtil.ZERO ;
      Z729PrdRotRea = DecimalUtil.ZERO ;
      Z727PrdRec = "" ;
      Z709PrdFecPre = GXutil.nullDate() ;
      Z5255PrdPreAc2 = DecimalUtil.ZERO ;
      Z750PrdValStk = DecimalUtil.ZERO ;
      Z705PrdExiCC = DecimalUtil.ZERO ;
      Z795PrvNum = 0 ;
      Z856ValCod = (byte)(0) ;
   }

   public void initAll1SH29( )
   {
      A396EmprCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A719PrdNum = "" ;
      n719PrdNum = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
      initializeNonKey1SH29( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey1SH42( )
   {
      A3404EntPedCum = httpContext.getMessage( "N", "") ;
      AV59Year = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV59Year", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV59Year), 4, 0));
      AV30Mes = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV30Mes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV30Mes), 2, 0));
      AV38OldEntPre = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV38OldEntPre", GXutil.ltrimstr( AV38OldEntPre, 14, 5));
      AV39OldEntUni = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV39OldEntUni", GXutil.ltrimstr( AV39OldEntUni, 9, 2));
      AV42OldRemanente = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV42OldRemanente", GXutil.ltrimstr( AV42OldRemanente, 11, 4));
      AV37oldEntFecent = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV37oldEntFecent", localUtil.format(AV37oldEntFecent, "99/99/99"));
      AV41oldlote = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV41oldlote", AV41oldlote);
      AV55UniOld = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV55UniOld", GXutil.ltrimstr( AV55UniOld, 9, 2));
      AV22FecAnt = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV22FecAnt", localUtil.format(AV22FecAnt, "99/99/99"));
      AV48PrecAnt = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV48PrecAnt", GXutil.ltrimstr( AV48PrecAnt, 14, 5));
      AV12AnyAnt = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12AnyAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12AnyAnt), 4, 0));
      AV31MesAnt = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV31MesAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV31MesAnt), 2, 0));
      A657PedCanEnt = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A657PedCanEnt", GXutil.ltrimstr( A657PedCanEnt, 9, 2));
      A663PedFulEnt = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "A663PedFulEnt", localUtil.format(A663PedFulEnt, "99/99/99"));
      A419EntUniRem = DecimalUtil.ZERO ;
      A417EntPre = DecimalUtil.ZERO ;
      AV45PrdNomX = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV45PrdNomX", AV45PrdNomX);
      AV34msg_ctrl_fecha = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV34msg_ctrl_fecha", AV34msg_ctrl_fecha);
      A664PedNumLin = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A664PedNumLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A664PedNumLin), 3, 0));
      A14041EntCump = "" ;
      A11Albaran = "" ;
      A12857EntNAlbar = "" ;
      A658PedCod = 0 ;
      n658PedCod = false ;
      A661PedFec = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "A661PedFec", localUtil.format(A661PedFec, "99/99/99"));
      A418EntUniEnt = DecimalUtil.ZERO ;
      A665PedPre = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A665PedPre", GXutil.ltrimstr( A665PedPre, 14, 5));
      A669PedUni = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A669PedUni", GXutil.ltrimstr( A669PedUni, 9, 2));
      A416EntNumCon = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A416EntNumCon", GXutil.ltrimstr( DecimalUtil.doubleToDec(A416EntNumCon), 3, 0));
      A5686EntLotN = "" ;
      A5685EntFVal = GXutil.nullDate() ;
      A414EntEti = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A414EntEti", GXutil.str( A414EntEti, 1, 0));
      A413EntConIni = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A413EntConIni", GXutil.ltrimstr( DecimalUtil.doubleToDec(A413EntConIni), 8, 0));
      A412EntConFin = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A412EntConFin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A412EntConFin), 8, 0));
      A659PedCum = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A659PedCum", A659PedCum);
      A667PedSit = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A667PedSit", A667PedSit);
      A666PedPri = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A666PedPri", A666PedPri);
      A660PedDto = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A660PedDto", GXutil.ltrimstr( A660PedDto, 5, 2));
      A5691EntBnc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A5691EntBnc", A5691EntBnc);
      A7695EntCC = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A7695EntCC", A7695EntCC);
      A7696EntCCoCod = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A7696EntCCoCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7696EntCCoCod), 3, 0));
      A10782EntUniAlb = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A10782EntUniAlb", GXutil.ltrimstr( A10782EntUniAlb, 11, 4));
      A10783EntObs = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A10783EntObs", A10783EntObs);
      A10187EntRemNro = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A10187EntRemNro", A10187EntRemNro);
      A10186EntRemFch = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "A10186EntRemFch", localUtil.format(A10186EntRemFch, "99/99/99"));
      A10185EntRemSuc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A10185EntRemSuc", A10185EntRemSuc);
      A12580PedAlmc = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A12580PedAlmc", GXutil.str( A12580PedAlmc, 1, 0));
      A13235EntLoteID = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A13235EntLoteID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13235EntLoteID), 12, 0));
      A13456EntUbicaci = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A13456EntUbicaci", A13456EntUbicaci);
      A5690EntHfCon = GXutil.resetTime( GXutil.nullDate() );
      httpContext.ajax_rsp_assign_attri("", false, "A5690EntHfCon", localUtil.ttoc( A5690EntHfCon, 0, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      A5689EntFfCon = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "A5689EntFfCon", localUtil.format(A5689EntFfCon, "99/99/99"));
      A5688EntHiCon = GXutil.resetTime( GXutil.nullDate() );
      httpContext.ajax_rsp_assign_attri("", false, "A5688EntHiCon", localUtil.ttoc( A5688EntHiCon, 0, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      A5687EntFiCon = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "A5687EntFiCon", localUtil.format(A5687EntFiCon, "99/99/99"));
      A14035EntNEmb = (byte)(0) ;
      AV23Fecha = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV23Fecha", localUtil.format(AV23Fecha, "99/99/99"));
      AV26Inc_obs = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV26Inc_obs", AV26Inc_obs);
      AV17DiasFin = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17DiasFin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV17DiasFin), 3, 0));
      A12716EntFabId = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A12716EntFabId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12716EntFabId), 6, 0));
      A6156EntPrvNum = A795PrvNum ;
      n6156EntPrvNum = false ;
      A415EntFecEnt = GXutil.today( ) ;
      A10184EntRemTpo = " " ;
      httpContext.ajax_rsp_assign_attri("", false, "A10184EntRemTpo", A10184EntRemTpo);
      O419EntUniRem = A419EntUniRem ;
      O418EntUniEnt = A418EntUniEnt ;
      O657PedCanEnt = A657PedCanEnt ;
      httpContext.ajax_rsp_assign_attri("", false, "A657PedCanEnt", GXutil.ltrimstr( A657PedCanEnt, 9, 2));
      O415EntFecEnt = A415EntFecEnt ;
      O417EntPre = A417EntPre ;
      O5686EntLotN = A5686EntLotN ;
      O3404EntPedCum = A3404EntPedCum ;
      Z12716EntFabId = 0 ;
      Z6156EntPrvNum = 0 ;
      Z415EntFecEnt = GXutil.nullDate() ;
      Z10184EntRemTpo = "" ;
      Z3404EntPedCum = "" ;
      Z411EntCon = (byte)(0) ;
      Z419EntUniRem = DecimalUtil.ZERO ;
      Z417EntPre = DecimalUtil.ZERO ;
      Z11Albaran = "" ;
      Z12857EntNAlbar = "" ;
      Z418EntUniEnt = DecimalUtil.ZERO ;
      Z416EntNumCon = (short)(0) ;
      Z5686EntLotN = "" ;
      Z5685EntFVal = GXutil.nullDate() ;
      Z414EntEti = (byte)(0) ;
      Z413EntConIni = 0 ;
      Z412EntConFin = 0 ;
      Z5691EntBnc = "" ;
      Z7695EntCC = "" ;
      Z7696EntCCoCod = (short)(0) ;
      Z10782EntUniAlb = DecimalUtil.ZERO ;
      Z10783EntObs = "" ;
      Z10187EntRemNro = "" ;
      Z10186EntRemFch = GXutil.nullDate() ;
      Z10185EntRemSuc = "" ;
      Z13235EntLoteID = 0 ;
      Z13456EntUbicaci = "" ;
      Z5690EntHfCon = GXutil.resetTime( GXutil.nullDate() );
      Z5689EntFfCon = GXutil.nullDate() ;
      Z5688EntHiCon = GXutil.resetTime( GXutil.nullDate() );
      Z5687EntFiCon = GXutil.nullDate() ;
      Z14035EntNEmb = (byte)(0) ;
      Z658PedCod = 0 ;
      Z663PedFulEnt = GXutil.nullDate() ;
      Z665PedPre = DecimalUtil.ZERO ;
      Z669PedUni = DecimalUtil.ZERO ;
      Z659PedCum = "" ;
      Z660PedDto = DecimalUtil.ZERO ;
   }

   public void initAll1SH42( )
   {
      A597LinEnt = (short)(0) ;
      initializeNonKey1SH42( ) ;
   }

   public void standaloneModalInsert1SH42( )
   {
      A411EntCon = i411EntCon ;
      httpContext.ajax_rsp_assign_attri("", false, "A411EntCon", GXutil.str( A411EntCon, 1, 0));
      A847UltLinEnt = i847UltLinEnt ;
      httpContext.ajax_rsp_assign_attri("", false, "A847UltLinEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A847UltLinEnt), 4, 0));
      A6156EntPrvNum = i6156EntPrvNum ;
      n6156EntPrvNum = false ;
      A415EntFecEnt = i415EntFecEnt ;
      A10184EntRemTpo = i10184EntRemTpo ;
      httpContext.ajax_rsp_assign_attri("", false, "A10184EntRemTpo", A10184EntRemTpo);
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268211610179", true, true);
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
      httpContext.AddJavascriptSource("entradaproducto.js", "?20268211610179", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties42( )
   {
      edtEntFVal_Enabled = defedtEntFVal_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtEntFVal_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEntFVal_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      edtEntLotN_Enabled = defedtEntLotN_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtEntLotN_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEntLotN_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      edtEntUniRem_Enabled = defedtEntUniRem_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtEntUniRem_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEntUniRem_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      edtEntPre_Enabled = defedtEntPre_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtEntPre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEntPre_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      cmbEntPedCum.setEnabled( defcmbEntPedCum_Enabled );
      httpContext.ajax_rsp_assign_prop("", false, cmbEntPedCum.getInternalname(), "Enabled", GXutil.ltrimstr( cmbEntPedCum.getEnabled(), 5, 0), !bGXsfl_40_Refreshing);
      edtEntCump_Enabled = defedtEntCump_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtEntCump_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEntCump_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      edtEntUniEnt_Enabled = defedtEntUniEnt_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtEntUniEnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEntUniEnt_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      edtEntPrvNum_Enabled = defedtEntPrvNum_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtEntPrvNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEntPrvNum_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      edtEntNAlbar_Enabled = defedtEntNAlbar_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtEntNAlbar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEntNAlbar_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      edtAlbaran_Enabled = defedtAlbaran_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbaran_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbaran_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      edtEntFecEnt_Enabled = defedtEntFecEnt_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtEntFecEnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEntFecEnt_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      edtLinEnt_Enabled = defedtLinEnt_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtLinEnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLinEnt_Enabled), 5, 0), !bGXsfl_40_Refreshing);
   }

   public void startgridcontrol40( )
   {
      Gridlevel_lineasContainer.AddObjectProperty("GridName", "Gridlevel_lineas");
      Gridlevel_lineasContainer.AddObjectProperty("Header", subGridlevel_lineas_Header);
      Gridlevel_lineasContainer.AddObjectProperty("Class", "GridNoBorder WorkWith");
      Gridlevel_lineasContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_lineasContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_lineasContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGridlevel_lineas_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_lineasContainer.AddObjectProperty("CmpContext", "");
      Gridlevel_lineasContainer.AddObjectProperty("InMasterPage", "false");
      Gridlevel_lineasColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_lineasColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A597LinEnt, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_lineasColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtLinEnt_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_lineasContainer.AddColumnProperties(Gridlevel_lineasColumn);
      Gridlevel_lineasColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_lineasColumn.AddObjectProperty("Value", localUtil.format(A415EntFecEnt, "99/99/99"));
      Gridlevel_lineasColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtEntFecEnt_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_lineasContainer.AddColumnProperties(Gridlevel_lineasColumn);
      Gridlevel_lineasColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_lineasColumn.AddObjectProperty("Value", GXutil.rtrim( A11Albaran));
      Gridlevel_lineasColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbaran_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_lineasColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtAlbaran_Visible, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_lineasContainer.AddColumnProperties(Gridlevel_lineasColumn);
      Gridlevel_lineasColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_lineasColumn.AddObjectProperty("Value", GXutil.rtrim( A12857EntNAlbar));
      Gridlevel_lineasColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtEntNAlbar_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_lineasColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtEntNAlbar_Visible, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_lineasContainer.AddColumnProperties(Gridlevel_lineasColumn);
      Gridlevel_lineasColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_lineasColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A658PedCod, (byte)(8), (byte)(0), ".", "")));
      Gridlevel_lineasColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPedCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_lineasContainer.AddColumnProperties(Gridlevel_lineasColumn);
      Gridlevel_lineasColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_lineasColumn.AddObjectProperty("Value", httpContext.convertURL( AV43PedCodPrompt));
      Gridlevel_lineasColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavPedcodprompt_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_lineasColumn.AddObjectProperty("Link", GXutil.rtrim( edtavPedcodprompt_Link));
      Gridlevel_lineasColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavPedcodprompt_Visible, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_lineasContainer.AddColumnProperties(Gridlevel_lineasColumn);
      Gridlevel_lineasColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_lineasColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A14035EntNEmb, (byte)(2), (byte)(0), ".", "")));
      Gridlevel_lineasColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtEntNEmb_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_lineasColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtEntNEmb_Visible, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_lineasContainer.AddColumnProperties(Gridlevel_lineasColumn);
      Gridlevel_lineasColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_lineasColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A6156EntPrvNum, (byte)(6), (byte)(0), ".", "")));
      Gridlevel_lineasColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtEntPrvNum_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_lineasContainer.AddColumnProperties(Gridlevel_lineasColumn);
      Gridlevel_lineasColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_lineasContainer.AddColumnProperties(Gridlevel_lineasColumn);
      Gridlevel_lineasColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_lineasColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A418EntUniEnt, (byte)(9), (byte)(2), ".", "")));
      Gridlevel_lineasColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtEntUniEnt_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_lineasContainer.AddColumnProperties(Gridlevel_lineasColumn);
      Gridlevel_lineasColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_lineasColumn.AddObjectProperty("Value", GXutil.rtrim( A14041EntCump));
      Gridlevel_lineasColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtEntCump_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_lineasContainer.AddColumnProperties(Gridlevel_lineasColumn);
      Gridlevel_lineasColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_lineasColumn.AddObjectProperty("Value", GXutil.rtrim( A3404EntPedCum));
      Gridlevel_lineasColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( cmbEntPedCum.getEnabled(), (byte)(5), (byte)(0), ".", "")));
      Gridlevel_lineasContainer.AddColumnProperties(Gridlevel_lineasColumn);
      Gridlevel_lineasColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_lineasColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A417EntPre, (byte)(14), (byte)(5), ".", "")));
      Gridlevel_lineasColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtEntPre_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_lineasContainer.AddColumnProperties(Gridlevel_lineasColumn);
      Gridlevel_lineasColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_lineasColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A419EntUniRem, (byte)(11), (byte)(4), ".", "")));
      Gridlevel_lineasColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtEntUniRem_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_lineasContainer.AddColumnProperties(Gridlevel_lineasColumn);
      Gridlevel_lineasColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_lineasColumn.AddObjectProperty("Value", GXutil.rtrim( A5686EntLotN));
      Gridlevel_lineasColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtEntLotN_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_lineasContainer.AddColumnProperties(Gridlevel_lineasColumn);
      Gridlevel_lineasColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_lineasColumn.AddObjectProperty("Value", localUtil.format(A5685EntFVal, "99/99/99"));
      Gridlevel_lineasColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtEntFVal_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_lineasContainer.AddColumnProperties(Gridlevel_lineasColumn);
      Gridlevel_lineasContainer.AddObjectProperty("Selectedindex", GXutil.ltrim( localUtil.ntoc( subGridlevel_lineas_Selectedindex, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_lineasContainer.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGridlevel_lineas_Allowselection, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_lineasContainer.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGridlevel_lineas_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
      Gridlevel_lineasContainer.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGridlevel_lineas_Allowhovering, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_lineasContainer.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGridlevel_lineas_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
      Gridlevel_lineasContainer.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGridlevel_lineas_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_lineasContainer.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGridlevel_lineas_Collapsed, (byte)(1), (byte)(0), ".", "")));
   }

   public void init_default_properties( )
   {
      edtPrdNum_Internalname = "PRDNUM" ;
      edtPrdNom_Internalname = "PRDNOM" ;
      edtPrdExiAlm_Internalname = "PRDEXIALM" ;
      edtPrdUltMovF_Internalname = "PRDULTMOVF" ;
      divTableattributes_Internalname = "TABLEATTRIBUTES" ;
      Dvpanel_tableattributes_Internalname = "DVPANEL_TABLEATTRIBUTES" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      edtLinEnt_Internalname = "LINENT" ;
      edtEntFecEnt_Internalname = "ENTFECENT" ;
      edtAlbaran_Internalname = "ALBARAN" ;
      edtEntNAlbar_Internalname = "ENTNALBAR" ;
      edtPedCod_Internalname = "PEDCOD" ;
      edtavPedcodprompt_Internalname = "vPEDCODPROMPT" ;
      edtEntNEmb_Internalname = "ENTNEMB" ;
      edtEntPrvNum_Internalname = "ENTPRVNUM" ;
      edtEntUniEnt_Internalname = "ENTUNIENT" ;
      edtEntCump_Internalname = "ENTCUMP" ;
      cmbEntPedCum.setInternalname( "ENTPEDCUM" );
      edtEntPre_Internalname = "ENTPRE" ;
      edtEntUniRem_Internalname = "ENTUNIREM" ;
      edtEntLotN_Internalname = "ENTLOTN" ;
      edtEntFVal_Internalname = "ENTFVAL" ;
      divTableleaflevel_lineas_Internalname = "TABLELEAFLEVEL_LINEAS" ;
      bttBtntrn_enter_Internalname = "BTNTRN_ENTER" ;
      bttBtntrn_cancel_Internalname = "BTNTRN_CANCEL" ;
      bttBtntrn_delete_Internalname = "BTNTRN_DELETE" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      divLayoutmaintable_Internalname = "LAYOUTMAINTABLE" ;
      Form.setInternalname( "FORM" );
      imgprompt_6156_Internalname = "PROMPT_6156" ;
      subGridlevel_lineas_Internalname = "GRIDLEVEL_LINEAS" ;
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
      subGridlevel_lineas_Allowcollapsing = (byte)(0) ;
      subGridlevel_lineas_Allowselection = (byte)(0) ;
      subGridlevel_lineas_Header = "" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "Entrada Producto", "") );
      edtEntFVal_Jsonclick = "" ;
      edtEntLotN_Jsonclick = "" ;
      edtEntUniRem_Jsonclick = "" ;
      edtEntPre_Jsonclick = "" ;
      cmbEntPedCum.setJsonclick( "" );
      edtEntCump_Jsonclick = "" ;
      edtEntUniEnt_Jsonclick = "" ;
      imgprompt_6156_Visible = 1 ;
      imgprompt_6156_Link = "" ;
      imgprompt_6156_Visible = 1 ;
      edtEntPrvNum_Jsonclick = "" ;
      edtEntNEmb_Jsonclick = "" ;
      edtPedCod_Jsonclick = "" ;
      edtEntNAlbar_Jsonclick = "" ;
      edtAlbaran_Jsonclick = "" ;
      edtEntFecEnt_Jsonclick = "" ;
      edtLinEnt_Jsonclick = "" ;
      subGridlevel_lineas_Class = "GridNoBorder WorkWith" ;
      subGridlevel_lineas_Backcolorstyle = (byte)(0) ;
      edtavPedcodprompt_gximage = "" ;
      edtEntFVal_Enabled = 1 ;
      edtEntLotN_Enabled = 1 ;
      edtEntUniRem_Enabled = 0 ;
      edtEntPre_Enabled = 1 ;
      cmbEntPedCum.setEnabled( 1 );
      edtEntCump_Enabled = 0 ;
      edtEntUniEnt_Enabled = 1 ;
      edtEntPrvNum_Enabled = 1 ;
      edtEntNEmb_Visible = -1 ;
      edtEntNEmb_Enabled = 1 ;
      edtavPedcodprompt_Visible = -1 ;
      edtavPedcodprompt_Link = "" ;
      edtavPedcodprompt_Enabled = 1 ;
      edtPedCod_Enabled = 1 ;
      edtEntNAlbar_Visible = -1 ;
      edtEntNAlbar_Enabled = 1 ;
      edtAlbaran_Visible = -1 ;
      edtAlbaran_Enabled = 1 ;
      edtEntFecEnt_Enabled = 1 ;
      edtLinEnt_Enabled = 1 ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      bttBtntrn_delete_Enabled = 0 ;
      bttBtntrn_delete_Visible = 1 ;
      bttBtntrn_cancel_Visible = 1 ;
      bttBtntrn_enter_Enabled = 1 ;
      bttBtntrn_enter_Visible = 1 ;
      edtPrdUltMovF_Jsonclick = "" ;
      edtPrdUltMovF_Enabled = 0 ;
      edtPrdExiAlm_Jsonclick = "" ;
      edtPrdExiAlm_Enabled = 0 ;
      edtPrdNom_Jsonclick = "" ;
      edtPrdNom_Enabled = 0 ;
      edtPrdNum_Jsonclick = "" ;
      edtPrdNum_Enabled = 0 ;
      Dvpanel_tableattributes_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_tableattributes_Iconposition = "Right" ;
      Dvpanel_tableattributes_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_tableattributes_Collapsed = GXutil.toBoolean( 1) ;
      Dvpanel_tableattributes_Collapsible = GXutil.toBoolean( -1) ;
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

   public void gx3asaprdultmovf1SH29( String A396EmprCod ,
                                      String A719PrdNum )
   {
      GXt_date10 = A14040PrdUltMovF ;
      GXv_char31[0] = A396EmprCod ;
      GXv_char30[0] = A719PrdNum ;
      GXv_date22[0] = GXt_date10 ;
      new app.pstm005(remoteHandle, context).execute( GXv_char31, GXv_char30, GXv_date22) ;
      entradaproducto_impl.this.A396EmprCod = GXv_char31[0] ;
      entradaproducto_impl.this.A719PrdNum = GXv_char30[0] ;
      entradaproducto_impl.this.GXt_date10 = GXv_date22[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
      A14040PrdUltMovF = GXt_date10 ;
      httpContext.ajax_rsp_assign_attri("", false, "A14040PrdUltMovF", localUtil.format(A14040PrdUltMovF, "99/99/99"));
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( localUtil.format(A14040PrdUltMovF, "99/99/99"))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void gx4asaultfecccs1SH29( String A396EmprCod ,
                                     String A719PrdNum )
   {
      GXt_date10 = A3835UltFecCCs ;
      GXv_char31[0] = A396EmprCod ;
      GXv_char30[0] = A719PrdNum ;
      GXv_date22[0] = GXt_date10 ;
      new app.pstm005(remoteHandle, context).execute( GXv_char31, GXv_char30, GXv_date22) ;
      entradaproducto_impl.this.A396EmprCod = GXv_char31[0] ;
      entradaproducto_impl.this.A719PrdNum = GXv_char30[0] ;
      entradaproducto_impl.this.GXt_date10 = GXv_date22[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
      A3835UltFecCCs = GXt_date10 ;
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

   public void gxasa111SH29( String A396EmprCod )
   {
      GXt_int5 = (byte)(0) ;
      GXv_int20[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "ALBA20", ""), ""), GXv_int20) ;
      entradaproducto_impl.this.GXt_int5 = GXv_int20[0] ;
      edtAlbaran_Visible = ((GXt_int5==0) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbaran_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbaran_Visible), 5, 0), !bGXsfl_40_Refreshing);
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

   public void gxasa128571SH29( String A396EmprCod )
   {
      GXt_int5 = (byte)(0) ;
      GXv_int20[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "ALBA20", ""), ""), GXv_int20) ;
      entradaproducto_impl.this.GXt_int5 = GXv_int20[0] ;
      edtEntNAlbar_Visible = ((GXt_int5==1) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtEntNAlbar_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEntNAlbar_Visible), 5, 0), !bGXsfl_40_Refreshing);
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

   public void gxasa140351SH29( String AV18EmprCod )
   {
      GXt_int5 = (byte)(0) ;
      GXv_int20[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV18EmprCod, httpContext.getMessage( httpContext.getMessage( "MODA21", ""), ""), GXv_int20) ;
      entradaproducto_impl.this.GXt_int5 = GXv_int20[0] ;
      edtEntNEmb_Visible = ((GXt_int5==1) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtEntNEmb_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEntNEmb_Visible), 5, 0), !bGXsfl_40_Refreshing);
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

   public void gx23asaprdultmovf1SH42( String A396EmprCod ,
                                       String A719PrdNum )
   {
      GXt_date10 = A14040PrdUltMovF ;
      GXv_char31[0] = A396EmprCod ;
      GXv_char30[0] = A719PrdNum ;
      GXv_date22[0] = GXt_date10 ;
      new app.pstm005(remoteHandle, context).execute( GXv_char31, GXv_char30, GXv_date22) ;
      entradaproducto_impl.this.A396EmprCod = GXv_char31[0] ;
      entradaproducto_impl.this.A719PrdNum = GXv_char30[0] ;
      entradaproducto_impl.this.GXt_date10 = GXv_date22[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
      A14040PrdUltMovF = GXt_date10 ;
      httpContext.ajax_rsp_assign_attri("", false, "A14040PrdUltMovF", localUtil.format(A14040PrdUltMovF, "99/99/99"));
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( localUtil.format(A14040PrdUltMovF, "99/99/99"))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void gx66asaprdnomx1SH42( String A396EmprCod ,
                                    int A6156EntPrvNum )
   {
      if ( true /* After */ )
      {
         GXt_char1 = AV45PrdNomX ;
         GXv_char31[0] = A396EmprCod ;
         GXv_int29[0] = A6156EntPrvNum ;
         GXv_char30[0] = GXt_char1 ;
         new app.pctrprv(remoteHandle, context).execute( GXv_char31, GXv_int29, GXv_char30) ;
         entradaproducto_impl.this.A396EmprCod = GXv_char31[0] ;
         entradaproducto_impl.this.A6156EntPrvNum = GXv_int29[0] ;
         entradaproducto_impl.this.GXt_char1 = GXv_char30[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         AV45PrdNomX = GXt_char1 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV45PrdNomX", AV45PrdNomX);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( AV45PrdNomX))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void gx77asapednumlin1SH42( String A396EmprCod ,
                                      int A658PedCod )
   {
      A664PedNumLin = (short)(getPedNumLin0( A396EmprCod, A658PedCod)) ;
      httpContext.ajax_rsp_assign_attri("", false, "A664PedNumLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A664PedNumLin), 3, 0));
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A664PedNumLin, (byte)(3), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_79_1SH42( )
   {
      if ( ! (0==A658PedCod) && ( true /* After */ || true /* After */ ) )
      {
         GXv_char31[0] = A396EmprCod ;
         GXv_int29[0] = A658PedCod ;
         GXv_char30[0] = A719PrdNum ;
         GXv_char27[0] = httpContext.getMessage( "INS", "") ;
         GXv_char26[0] = A3404EntPedCum ;
         new app.ppedcum2(remoteHandle, context).execute( GXv_char31, GXv_int29, GXv_char30, GXv_char27, GXv_char26) ;
         A396EmprCod = GXv_char31[0] ;
         A658PedCod = GXv_int29[0] ;
         A719PrdNum = GXv_char30[0] ;
         A3404EntPedCum = GXv_char26[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
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

   public void xc_80_1SH42( )
   {
      if ( ! (0==A658PedCod) && true /* After */ )
      {
         GXv_char31[0] = A396EmprCod ;
         GXv_int29[0] = A658PedCod ;
         GXv_char30[0] = A719PrdNum ;
         GXv_char27[0] = httpContext.getMessage( "DEL", "") ;
         GXv_char26[0] = A3404EntPedCum ;
         new app.ppedcum2(remoteHandle, context).execute( GXv_char31, GXv_int29, GXv_char30, GXv_char27, GXv_char26) ;
         A396EmprCod = GXv_char31[0] ;
         A658PedCod = GXv_int29[0] ;
         A719PrdNum = GXv_char30[0] ;
         A3404EntPedCum = GXv_char26[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
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

   public void xc_91_1SH42( )
   {
      if ( isIns( )  && true /* After */ )
      {
         GXv_char31[0] = A396EmprCod ;
         GXv_int29[0] = A6156EntPrvNum ;
         GXv_int18[0] = AV59Year ;
         GXv_int20[0] = AV30Mes ;
         GXv_decimal28[0] = A418EntUniEnt ;
         GXv_decimal21[0] = AV55UniOld ;
         GXv_decimal16[0] = A417EntPre ;
         GXv_char30[0] = AV44PedPri ;
         GXv_int17[0] = AV59Year ;
         GXv_int14[0] = AV12AnyAnt ;
         GXv_int19[0] = AV30Mes ;
         GXv_int6[0] = AV31MesAnt ;
         GXv_decimal15[0] = AV48PrecAnt ;
         GXv_date22[0] = A415EntFecEnt ;
         GXv_date11[0] = AV22FecAnt ;
         GXv_char27[0] = httpContext.getMessage( "INS", "") ;
         new app.pprdes2(remoteHandle, context).execute( GXv_char31, GXv_int29, GXv_int18, GXv_int20, GXv_decimal28, GXv_decimal21, GXv_decimal16, GXv_char30, GXv_int17, GXv_int14, GXv_int19, GXv_int6, GXv_decimal15, GXv_date22, GXv_date11, GXv_char27) ;
         A396EmprCod = GXv_char31[0] ;
         A6156EntPrvNum = GXv_int29[0] ;
         AV59Year = GXv_int18[0] ;
         AV30Mes = GXv_int20[0] ;
         A418EntUniEnt = GXv_decimal28[0] ;
         AV55UniOld = GXv_decimal21[0] ;
         A417EntPre = GXv_decimal16[0] ;
         AV44PedPri = GXv_char30[0] ;
         AV59Year = GXv_int17[0] ;
         AV12AnyAnt = GXv_int14[0] ;
         AV30Mes = GXv_int19[0] ;
         AV31MesAnt = GXv_int6[0] ;
         AV48PrecAnt = GXv_decimal15[0] ;
         A415EntFecEnt = GXv_date22[0] ;
         AV22FecAnt = GXv_date11[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "AV59Year", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV59Year), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV30Mes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV30Mes), 2, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV55UniOld", GXutil.ltrimstr( AV55UniOld, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "AV44PedPri", AV44PedPri);
         httpContext.ajax_rsp_assign_attri("", false, "AV59Year", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV59Year), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV12AnyAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12AnyAnt), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV30Mes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV30Mes), 2, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV31MesAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV31MesAnt), 2, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV48PrecAnt", GXutil.ltrimstr( AV48PrecAnt, 14, 5));
         httpContext.ajax_rsp_assign_attri("", false, "AV22FecAnt", localUtil.format(AV22FecAnt, "99/99/99"));
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

   public void xc_92_1SH42( )
   {
      if ( ( ( ( DecimalUtil.compareTo(A418EntUniEnt, AV55UniOld) != 0 ) ) || ( !( GXutil.dateCompare(GXutil.resetTime(A415EntFecEnt), GXutil.resetTime(AV22FecAnt)) ) ) || ( ( DecimalUtil.compareTo(A417EntPre, AV48PrecAnt) != 0 ) ) ) && isUpd( )  && true /* After */ )
      {
         GXv_char31[0] = A396EmprCod ;
         GXv_int29[0] = A6156EntPrvNum ;
         GXv_int18[0] = AV59Year ;
         GXv_int20[0] = AV30Mes ;
         GXv_decimal28[0] = A418EntUniEnt ;
         GXv_decimal21[0] = AV55UniOld ;
         GXv_decimal16[0] = A417EntPre ;
         GXv_char30[0] = AV44PedPri ;
         GXv_int17[0] = AV59Year ;
         GXv_int14[0] = AV12AnyAnt ;
         GXv_int19[0] = AV30Mes ;
         GXv_int6[0] = AV31MesAnt ;
         GXv_decimal15[0] = AV48PrecAnt ;
         GXv_date22[0] = A415EntFecEnt ;
         GXv_date11[0] = AV22FecAnt ;
         GXv_char27[0] = httpContext.getMessage( "UPD", "") ;
         new app.pprdes2(remoteHandle, context).execute( GXv_char31, GXv_int29, GXv_int18, GXv_int20, GXv_decimal28, GXv_decimal21, GXv_decimal16, GXv_char30, GXv_int17, GXv_int14, GXv_int19, GXv_int6, GXv_decimal15, GXv_date22, GXv_date11, GXv_char27) ;
         A396EmprCod = GXv_char31[0] ;
         A6156EntPrvNum = GXv_int29[0] ;
         AV59Year = GXv_int18[0] ;
         AV30Mes = GXv_int20[0] ;
         A418EntUniEnt = GXv_decimal28[0] ;
         AV55UniOld = GXv_decimal21[0] ;
         A417EntPre = GXv_decimal16[0] ;
         AV44PedPri = GXv_char30[0] ;
         AV59Year = GXv_int17[0] ;
         AV12AnyAnt = GXv_int14[0] ;
         AV30Mes = GXv_int19[0] ;
         AV31MesAnt = GXv_int6[0] ;
         AV48PrecAnt = GXv_decimal15[0] ;
         A415EntFecEnt = GXv_date22[0] ;
         AV22FecAnt = GXv_date11[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "AV59Year", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV59Year), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV30Mes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV30Mes), 2, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV55UniOld", GXutil.ltrimstr( AV55UniOld, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "AV44PedPri", AV44PedPri);
         httpContext.ajax_rsp_assign_attri("", false, "AV59Year", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV59Year), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV12AnyAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12AnyAnt), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV30Mes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV30Mes), 2, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV31MesAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV31MesAnt), 2, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV48PrecAnt", GXutil.ltrimstr( AV48PrecAnt, 14, 5));
         httpContext.ajax_rsp_assign_attri("", false, "AV22FecAnt", localUtil.format(AV22FecAnt, "99/99/99"));
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

   public void xc_93_1SH42( )
   {
      if ( isIns( )  && true /* After */ )
      {
         GXv_char31[0] = A396EmprCod ;
         GXv_int29[0] = A6156EntPrvNum ;
         GXv_char30[0] = A719PrdNum ;
         GXv_char27[0] = A718PrdNom ;
         GXv_int18[0] = AV59Year ;
         GXv_int20[0] = AV30Mes ;
         GXv_decimal28[0] = A418EntUniEnt ;
         GXv_decimal21[0] = AV55UniOld ;
         GXv_decimal16[0] = A417EntPre ;
         GXv_char26[0] = AV44PedPri ;
         GXv_int17[0] = AV59Year ;
         GXv_int14[0] = AV12AnyAnt ;
         GXv_int19[0] = AV30Mes ;
         GXv_int6[0] = AV31MesAnt ;
         GXv_decimal15[0] = AV48PrecAnt ;
         GXv_date22[0] = A415EntFecEnt ;
         GXv_date11[0] = AV22FecAnt ;
         GXv_char25[0] = httpContext.getMessage( "INS", "") ;
         new app.pprdes3(remoteHandle, context).execute( GXv_char31, GXv_int29, GXv_char30, GXv_char27, GXv_int18, GXv_int20, GXv_decimal28, GXv_decimal21, GXv_decimal16, GXv_char26, GXv_int17, GXv_int14, GXv_int19, GXv_int6, GXv_decimal15, GXv_date22, GXv_date11, GXv_char25) ;
         A396EmprCod = GXv_char31[0] ;
         A6156EntPrvNum = GXv_int29[0] ;
         A719PrdNum = GXv_char30[0] ;
         A718PrdNom = GXv_char27[0] ;
         AV59Year = GXv_int18[0] ;
         AV30Mes = GXv_int20[0] ;
         A418EntUniEnt = GXv_decimal28[0] ;
         AV55UniOld = GXv_decimal21[0] ;
         A417EntPre = GXv_decimal16[0] ;
         AV44PedPri = GXv_char26[0] ;
         AV59Year = GXv_int17[0] ;
         AV12AnyAnt = GXv_int14[0] ;
         AV30Mes = GXv_int19[0] ;
         AV31MesAnt = GXv_int6[0] ;
         AV48PrecAnt = GXv_decimal15[0] ;
         A415EntFecEnt = GXv_date22[0] ;
         AV22FecAnt = GXv_date11[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         httpContext.ajax_rsp_assign_attri("", false, "A718PrdNom", A718PrdNom);
         httpContext.ajax_rsp_assign_attri("", false, "AV59Year", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV59Year), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV30Mes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV30Mes), 2, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV55UniOld", GXutil.ltrimstr( AV55UniOld, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "AV44PedPri", AV44PedPri);
         httpContext.ajax_rsp_assign_attri("", false, "AV59Year", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV59Year), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV12AnyAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12AnyAnt), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV30Mes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV30Mes), 2, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV31MesAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV31MesAnt), 2, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV48PrecAnt", GXutil.ltrimstr( AV48PrecAnt, 14, 5));
         httpContext.ajax_rsp_assign_attri("", false, "AV22FecAnt", localUtil.format(AV22FecAnt, "99/99/99"));
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

   public void xc_94_1SH42( )
   {
      if ( ( ( ( DecimalUtil.compareTo(A418EntUniEnt, AV55UniOld) != 0 ) ) || ( !( GXutil.dateCompare(GXutil.resetTime(A415EntFecEnt), GXutil.resetTime(AV22FecAnt)) ) ) || ( ( DecimalUtil.compareTo(A417EntPre, AV48PrecAnt) != 0 ) ) ) && isUpd( )  && true /* After */ )
      {
         GXv_char31[0] = A396EmprCod ;
         GXv_int29[0] = A6156EntPrvNum ;
         GXv_char30[0] = A719PrdNum ;
         GXv_char27[0] = A718PrdNom ;
         GXv_int18[0] = AV59Year ;
         GXv_int20[0] = AV30Mes ;
         GXv_decimal28[0] = A418EntUniEnt ;
         GXv_decimal21[0] = AV55UniOld ;
         GXv_decimal16[0] = A417EntPre ;
         GXv_char26[0] = AV44PedPri ;
         GXv_int17[0] = AV59Year ;
         GXv_int14[0] = AV12AnyAnt ;
         GXv_int19[0] = AV30Mes ;
         GXv_int6[0] = AV31MesAnt ;
         GXv_decimal15[0] = AV48PrecAnt ;
         GXv_date22[0] = A415EntFecEnt ;
         GXv_date11[0] = AV22FecAnt ;
         GXv_char25[0] = httpContext.getMessage( "UPD", "") ;
         new app.pprdes3(remoteHandle, context).execute( GXv_char31, GXv_int29, GXv_char30, GXv_char27, GXv_int18, GXv_int20, GXv_decimal28, GXv_decimal21, GXv_decimal16, GXv_char26, GXv_int17, GXv_int14, GXv_int19, GXv_int6, GXv_decimal15, GXv_date22, GXv_date11, GXv_char25) ;
         A396EmprCod = GXv_char31[0] ;
         A6156EntPrvNum = GXv_int29[0] ;
         A719PrdNum = GXv_char30[0] ;
         A718PrdNom = GXv_char27[0] ;
         AV59Year = GXv_int18[0] ;
         AV30Mes = GXv_int20[0] ;
         A418EntUniEnt = GXv_decimal28[0] ;
         AV55UniOld = GXv_decimal21[0] ;
         A417EntPre = GXv_decimal16[0] ;
         AV44PedPri = GXv_char26[0] ;
         AV59Year = GXv_int17[0] ;
         AV12AnyAnt = GXv_int14[0] ;
         AV30Mes = GXv_int19[0] ;
         AV31MesAnt = GXv_int6[0] ;
         AV48PrecAnt = GXv_decimal15[0] ;
         A415EntFecEnt = GXv_date22[0] ;
         AV22FecAnt = GXv_date11[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         httpContext.ajax_rsp_assign_attri("", false, "A718PrdNom", A718PrdNom);
         httpContext.ajax_rsp_assign_attri("", false, "AV59Year", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV59Year), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV30Mes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV30Mes), 2, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV55UniOld", GXutil.ltrimstr( AV55UniOld, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "AV44PedPri", AV44PedPri);
         httpContext.ajax_rsp_assign_attri("", false, "AV59Year", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV59Year), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV12AnyAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12AnyAnt), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV30Mes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV30Mes), 2, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV31MesAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV31MesAnt), 2, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV48PrecAnt", GXutil.ltrimstr( AV48PrecAnt, 14, 5));
         httpContext.ajax_rsp_assign_attri("", false, "AV22FecAnt", localUtil.format(AV22FecAnt, "99/99/99"));
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

   public void xc_95_1SH42( )
   {
      if ( isIns( )  && true /* After */ )
      {
         GXv_char31[0] = A396EmprCod ;
         GXv_char30[0] = A719PrdNum ;
         GXv_int18[0] = AV59Year ;
         GXv_int20[0] = AV30Mes ;
         GXv_decimal28[0] = A418EntUniEnt ;
         GXv_decimal21[0] = AV55UniOld ;
         GXv_decimal16[0] = A417EntPre ;
         GXv_int17[0] = AV59Year ;
         GXv_int14[0] = AV12AnyAnt ;
         GXv_int19[0] = AV30Mes ;
         GXv_int6[0] = AV31MesAnt ;
         GXv_decimal15[0] = AV48PrecAnt ;
         GXv_date22[0] = A415EntFecEnt ;
         GXv_date11[0] = AV22FecAnt ;
         GXv_char27[0] = AV44PedPri ;
         GXv_char26[0] = httpContext.getMessage( "INS", "") ;
         new app.pprden2(remoteHandle, context).execute( GXv_char31, GXv_char30, GXv_int18, GXv_int20, GXv_decimal28, GXv_decimal21, GXv_decimal16, GXv_int17, GXv_int14, GXv_int19, GXv_int6, GXv_decimal15, GXv_date22, GXv_date11, GXv_char27, GXv_char26) ;
         A396EmprCod = GXv_char31[0] ;
         A719PrdNum = GXv_char30[0] ;
         AV59Year = GXv_int18[0] ;
         AV30Mes = GXv_int20[0] ;
         A418EntUniEnt = GXv_decimal28[0] ;
         AV55UniOld = GXv_decimal21[0] ;
         A417EntPre = GXv_decimal16[0] ;
         AV59Year = GXv_int17[0] ;
         AV12AnyAnt = GXv_int14[0] ;
         AV30Mes = GXv_int19[0] ;
         AV31MesAnt = GXv_int6[0] ;
         AV48PrecAnt = GXv_decimal15[0] ;
         A415EntFecEnt = GXv_date22[0] ;
         AV22FecAnt = GXv_date11[0] ;
         AV44PedPri = GXv_char27[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         httpContext.ajax_rsp_assign_attri("", false, "AV59Year", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV59Year), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV30Mes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV30Mes), 2, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV55UniOld", GXutil.ltrimstr( AV55UniOld, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "AV59Year", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV59Year), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV12AnyAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12AnyAnt), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV30Mes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV30Mes), 2, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV31MesAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV31MesAnt), 2, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV48PrecAnt", GXutil.ltrimstr( AV48PrecAnt, 14, 5));
         httpContext.ajax_rsp_assign_attri("", false, "AV22FecAnt", localUtil.format(AV22FecAnt, "99/99/99"));
         httpContext.ajax_rsp_assign_attri("", false, "AV44PedPri", AV44PedPri);
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

   public void xc_96_1SH42( )
   {
      if ( ( ( ( DecimalUtil.compareTo(A418EntUniEnt, AV55UniOld) != 0 ) ) || ( !( GXutil.dateCompare(GXutil.resetTime(A415EntFecEnt), GXutil.resetTime(AV22FecAnt)) ) ) || ( ( DecimalUtil.compareTo(A417EntPre, AV48PrecAnt) != 0 ) ) ) && isUpd( )  && true /* After */ )
      {
         GXv_char31[0] = A396EmprCod ;
         GXv_char30[0] = A719PrdNum ;
         GXv_int18[0] = AV59Year ;
         GXv_int20[0] = AV30Mes ;
         GXv_decimal28[0] = A418EntUniEnt ;
         GXv_decimal21[0] = AV55UniOld ;
         GXv_decimal16[0] = A417EntPre ;
         GXv_int17[0] = AV59Year ;
         GXv_int14[0] = AV12AnyAnt ;
         GXv_int19[0] = AV30Mes ;
         GXv_int6[0] = AV31MesAnt ;
         GXv_decimal15[0] = AV48PrecAnt ;
         GXv_date22[0] = A415EntFecEnt ;
         GXv_date11[0] = AV22FecAnt ;
         GXv_char27[0] = AV44PedPri ;
         GXv_char26[0] = httpContext.getMessage( "UPD", "") ;
         new app.pprden2(remoteHandle, context).execute( GXv_char31, GXv_char30, GXv_int18, GXv_int20, GXv_decimal28, GXv_decimal21, GXv_decimal16, GXv_int17, GXv_int14, GXv_int19, GXv_int6, GXv_decimal15, GXv_date22, GXv_date11, GXv_char27, GXv_char26) ;
         A396EmprCod = GXv_char31[0] ;
         A719PrdNum = GXv_char30[0] ;
         AV59Year = GXv_int18[0] ;
         AV30Mes = GXv_int20[0] ;
         A418EntUniEnt = GXv_decimal28[0] ;
         AV55UniOld = GXv_decimal21[0] ;
         A417EntPre = GXv_decimal16[0] ;
         AV59Year = GXv_int17[0] ;
         AV12AnyAnt = GXv_int14[0] ;
         AV30Mes = GXv_int19[0] ;
         AV31MesAnt = GXv_int6[0] ;
         AV48PrecAnt = GXv_decimal15[0] ;
         A415EntFecEnt = GXv_date22[0] ;
         AV22FecAnt = GXv_date11[0] ;
         AV44PedPri = GXv_char27[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         httpContext.ajax_rsp_assign_attri("", false, "AV59Year", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV59Year), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV30Mes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV30Mes), 2, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV55UniOld", GXutil.ltrimstr( AV55UniOld, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "AV59Year", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV59Year), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV12AnyAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12AnyAnt), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV30Mes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV30Mes), 2, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV31MesAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV31MesAnt), 2, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV48PrecAnt", GXutil.ltrimstr( AV48PrecAnt, 14, 5));
         httpContext.ajax_rsp_assign_attri("", false, "AV22FecAnt", localUtil.format(AV22FecAnt, "99/99/99"));
         httpContext.ajax_rsp_assign_attri("", false, "AV44PedPri", AV44PedPri);
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

   public void xc_97_1SH42( )
   {
      if ( ( isIns( )  || isUpd( )  ) && true /* After */ && ( AV35Nalbaran20 == 0 ) )
      {
         GXv_char31[0] = A396EmprCod ;
         GXv_char30[0] = A719PrdNum ;
         GXv_decimal28[0] = A418EntUniEnt ;
         GXv_decimal21[0] = DecimalUtil.doubleToDec(0) ;
         GXv_char27[0] = httpContext.getMessage( "EN", "") ;
         GXv_char26[0] = AV44PedPri ;
         GXv_decimal16[0] = A417EntPre ;
         GXv_int29[0] = 0 ;
         GXv_int20[0] = (byte)(0) ;
         GXv_char25[0] = " " ;
         GXv_int24[0] = A658PedCod ;
         GXv_char23[0] = A11Albaran ;
         GXv_char13[0] = AV56UsurCod ;
         GXv_char4[0] = httpContext.getMessage( "Entrada por Pedido", "") ;
         GXv_int18[0] = A597LinEnt ;
         GXv_decimal15[0] = AV55UniOld ;
         GXv_decimal12[0] = DecimalUtil.doubleToDec(0) ;
         GXv_date22[0] = A415EntFecEnt ;
         GXv_int8[0] = A6156EntPrvNum ;
         GXv_char3[0] = A5686EntLotN ;
         new app.pnewcc9(remoteHandle, context).execute( GXv_char31, GXv_char30, GXv_decimal28, GXv_decimal21, GXv_char27, GXv_char26, GXv_decimal16, GXv_int29, GXv_int20, GXv_char25, GXv_int24, GXv_char23, GXv_char13, GXv_char4, GXv_int18, GXv_decimal15, GXv_decimal12, GXv_date22, GXv_int8, GXv_char3) ;
         A396EmprCod = GXv_char31[0] ;
         A719PrdNum = GXv_char30[0] ;
         A418EntUniEnt = GXv_decimal28[0] ;
         AV44PedPri = GXv_char26[0] ;
         A417EntPre = GXv_decimal16[0] ;
         A658PedCod = GXv_int24[0] ;
         A11Albaran = GXv_char23[0] ;
         AV56UsurCod = GXv_char13[0] ;
         A597LinEnt = GXv_int18[0] ;
         AV55UniOld = GXv_decimal15[0] ;
         A415EntFecEnt = GXv_date22[0] ;
         A6156EntPrvNum = GXv_int8[0] ;
         A5686EntLotN = GXv_char3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         httpContext.ajax_rsp_assign_attri("", false, "AV44PedPri", AV44PedPri);
         httpContext.ajax_rsp_assign_attri("", false, "AV56UsurCod", AV56UsurCod);
         httpContext.ajax_rsp_assign_attri("", false, "AV55UniOld", GXutil.ltrimstr( AV55UniOld, 9, 2));
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

   public void xc_98_1SH42( )
   {
      if ( ( isIns( )  || isUpd( )  ) && true /* After */ && ( AV35Nalbaran20 == 1 ) )
      {
         GXv_char31[0] = A396EmprCod ;
         GXv_char30[0] = A719PrdNum ;
         GXv_decimal28[0] = A418EntUniEnt ;
         GXv_decimal21[0] = DecimalUtil.doubleToDec(0) ;
         GXv_char27[0] = httpContext.getMessage( "EN", "") ;
         GXv_char26[0] = AV44PedPri ;
         GXv_decimal16[0] = A417EntPre ;
         GXv_int29[0] = 0 ;
         GXv_int20[0] = (byte)(0) ;
         GXv_char25[0] = " " ;
         GXv_int24[0] = A658PedCod ;
         GXv_char23[0] = A11Albaran ;
         GXv_char13[0] = AV56UsurCod ;
         GXv_char4[0] = httpContext.getMessage( "Entrada por Pedido", "") ;
         GXv_int18[0] = A597LinEnt ;
         GXv_decimal15[0] = AV55UniOld ;
         GXv_decimal12[0] = DecimalUtil.doubleToDec(0) ;
         GXv_date22[0] = A415EntFecEnt ;
         GXv_int8[0] = A6156EntPrvNum ;
         GXv_char3[0] = A5686EntLotN ;
         GXv_char2[0] = A12857EntNAlbar ;
         new app.pccstk20(remoteHandle, context).execute( GXv_char31, GXv_char30, GXv_decimal28, GXv_decimal21, GXv_char27, GXv_char26, GXv_decimal16, GXv_int29, GXv_int20, GXv_char25, GXv_int24, GXv_char23, GXv_char13, GXv_char4, GXv_int18, GXv_decimal15, GXv_decimal12, GXv_date22, GXv_int8, GXv_char3, GXv_char2) ;
         A396EmprCod = GXv_char31[0] ;
         A719PrdNum = GXv_char30[0] ;
         A418EntUniEnt = GXv_decimal28[0] ;
         AV44PedPri = GXv_char26[0] ;
         A417EntPre = GXv_decimal16[0] ;
         A658PedCod = GXv_int24[0] ;
         A11Albaran = GXv_char23[0] ;
         AV56UsurCod = GXv_char13[0] ;
         A597LinEnt = GXv_int18[0] ;
         AV55UniOld = GXv_decimal15[0] ;
         A415EntFecEnt = GXv_date22[0] ;
         A6156EntPrvNum = GXv_int8[0] ;
         A5686EntLotN = GXv_char3[0] ;
         A12857EntNAlbar = GXv_char2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         httpContext.ajax_rsp_assign_attri("", false, "AV44PedPri", AV44PedPri);
         httpContext.ajax_rsp_assign_attri("", false, "AV56UsurCod", AV56UsurCod);
         httpContext.ajax_rsp_assign_attri("", false, "AV55UniOld", GXutil.ltrimstr( AV55UniOld, 9, 2));
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

   public void xc_99_1SH42( String A396EmprCod ,
                            String A719PrdNum ,
                            int A6156EntPrvNum ,
                            java.math.BigDecimal A417EntPre )
   {
      if ( true /* After */ || true /* After */ )
      {
         GXv_char31[0] = A396EmprCod ;
         GXv_char30[0] = A719PrdNum ;
         GXv_int29[0] = A6156EntPrvNum ;
         GXv_decimal28[0] = A417EntPre ;
         new app.pprenp(remoteHandle, context).execute( GXv_char31, GXv_char30, GXv_int29, GXv_decimal28) ;
         A396EmprCod = GXv_char31[0] ;
         A719PrdNum = GXv_char30[0] ;
         A6156EntPrvNum = GXv_int29[0] ;
         A417EntPre = GXv_decimal28[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A719PrdNum))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A6156EntPrvNum, (byte)(6), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A417EntPre, (byte)(14), (byte)(5), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_100_1SH42( String Gx_mode ,
                             String A396EmprCod ,
                             int A6156EntPrvNum ,
                             java.util.Date A415EntFecEnt ,
                             int A658PedCod ,
                             java.math.BigDecimal A418EntUniEnt ,
                             java.math.BigDecimal A417EntPre ,
                             String AV44PedPri ,
                             short A597LinEnt )
   {
      if ( isDlt( )  && true /* Level */ && true /* After */ )
      {
         GXv_char31[0] = A396EmprCod ;
         GXv_int29[0] = A6156EntPrvNum ;
         GXv_date22[0] = A415EntFecEnt ;
         GXv_int24[0] = A658PedCod ;
         GXv_decimal28[0] = A418EntUniEnt ;
         GXv_decimal21[0] = A417EntPre ;
         GXv_char30[0] = AV44PedPri ;
         new app.pacespr(remoteHandle, context).execute( GXv_char31, GXv_int29, GXv_date22, GXv_int24, GXv_decimal28, GXv_decimal21, GXv_char30) ;
         A396EmprCod = GXv_char31[0] ;
         A6156EntPrvNum = GXv_int29[0] ;
         A415EntFecEnt = GXv_date22[0] ;
         A658PedCod = GXv_int24[0] ;
         A418EntUniEnt = GXv_decimal28[0] ;
         A417EntPre = GXv_decimal21[0] ;
         AV44PedPri = GXv_char30[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "AV44PedPri", AV44PedPri);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A6156EntPrvNum, (byte)(6), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( localUtil.format(A415EntFecEnt, "99/99/99"))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A658PedCod, (byte)(8), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A418EntUniEnt, (byte)(9), (byte)(2), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A417EntPre, (byte)(14), (byte)(5), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( AV44PedPri))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_101_1SH42( String Gx_mode ,
                             String A396EmprCod ,
                             int A6156EntPrvNum ,
                             String A719PrdNum ,
                             String A718PrdNom ,
                             java.util.Date A415EntFecEnt ,
                             int A658PedCod ,
                             java.math.BigDecimal A418EntUniEnt ,
                             java.math.BigDecimal A417EntPre ,
                             String AV44PedPri ,
                             short A597LinEnt )
   {
      if ( isDlt( )  && true /* Level */ && true /* After */ )
      {
         GXv_char31[0] = A396EmprCod ;
         GXv_int29[0] = A6156EntPrvNum ;
         GXv_char30[0] = A719PrdNum ;
         GXv_char27[0] = A718PrdNom ;
         GXv_date22[0] = A415EntFecEnt ;
         GXv_int24[0] = A658PedCod ;
         GXv_decimal28[0] = A418EntUniEnt ;
         GXv_decimal21[0] = A417EntPre ;
         GXv_char26[0] = AV44PedPri ;
         new app.pacesprx(remoteHandle, context).execute( GXv_char31, GXv_int29, GXv_char30, GXv_char27, GXv_date22, GXv_int24, GXv_decimal28, GXv_decimal21, GXv_char26) ;
         A396EmprCod = GXv_char31[0] ;
         A6156EntPrvNum = GXv_int29[0] ;
         A719PrdNum = GXv_char30[0] ;
         A718PrdNom = GXv_char27[0] ;
         A415EntFecEnt = GXv_date22[0] ;
         A658PedCod = GXv_int24[0] ;
         A418EntUniEnt = GXv_decimal28[0] ;
         A417EntPre = GXv_decimal21[0] ;
         AV44PedPri = GXv_char26[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         httpContext.ajax_rsp_assign_attri("", false, "A718PrdNom", A718PrdNom);
         httpContext.ajax_rsp_assign_attri("", false, "AV44PedPri", AV44PedPri);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A6156EntPrvNum, (byte)(6), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A719PrdNum))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A718PrdNom))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( localUtil.format(A415EntFecEnt, "99/99/99"))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A658PedCod, (byte)(8), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A418EntUniEnt, (byte)(9), (byte)(2), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A417EntPre, (byte)(14), (byte)(5), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( AV44PedPri))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_102_1SH42( String Gx_mode ,
                             String A396EmprCod ,
                             String A719PrdNum ,
                             java.util.Date A415EntFecEnt ,
                             java.math.BigDecimal A418EntUniEnt ,
                             java.math.BigDecimal A417EntPre ,
                             short A597LinEnt )
   {
      if ( isDlt( )  && true /* Level */ && true /* After */ )
      {
         GXv_char31[0] = A396EmprCod ;
         GXv_char30[0] = A719PrdNum ;
         GXv_date22[0] = A415EntFecEnt ;
         GXv_decimal28[0] = A418EntUniEnt ;
         GXv_decimal21[0] = A417EntPre ;
         new app.pacespd(remoteHandle, context).execute( GXv_char31, GXv_char30, GXv_date22, GXv_decimal28, GXv_decimal21) ;
         A396EmprCod = GXv_char31[0] ;
         A719PrdNum = GXv_char30[0] ;
         A415EntFecEnt = GXv_date22[0] ;
         A418EntUniEnt = GXv_decimal28[0] ;
         A417EntPre = GXv_decimal21[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A719PrdNum))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( localUtil.format(A415EntFecEnt, "99/99/99"))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A418EntUniEnt, (byte)(9), (byte)(2), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A417EntPre, (byte)(14), (byte)(5), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_103_1SH42( String Gx_mode ,
                             String A396EmprCod ,
                             String A719PrdNum ,
                             short A597LinEnt )
   {
      if ( true /* Level */ && isDlt( )  && true /* After */ )
      {
         GXv_char31[0] = A396EmprCod ;
         GXv_char30[0] = A719PrdNum ;
         GXv_int18[0] = A597LinEnt ;
         new app.peliccs(remoteHandle, context).execute( GXv_char31, GXv_char30, GXv_int18) ;
         A396EmprCod = GXv_char31[0] ;
         A719PrdNum = GXv_char30[0] ;
         A597LinEnt = GXv_int18[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A719PrdNum))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A597LinEnt, (byte)(4), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_104_1SH42( String A396EmprCod ,
                             String AV62Pgmname ,
                             String AV56UsurCod ,
                             String AV50Station ,
                             String AV26Inc_obs )
   {
      if ( true /* After */ )
      {
         new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV62Pgmname, AV56UsurCod, AV50Station, AV26Inc_obs, 99999999, (byte)(0), " ") ;
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

   public void xc_105_1SH42( String A396EmprCod ,
                             String AV62Pgmname ,
                             String AV56UsurCod ,
                             String AV50Station ,
                             String AV26Inc_obs )
   {
      if ( true /* After */ || true /* After */ )
      {
         new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV62Pgmname, AV56UsurCod, AV50Station, AV26Inc_obs, 99999999, (byte)(0), " ") ;
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

   public void gxnrgridlevel_lineas_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      subsflControlProps_4042( ) ;
      while ( nGXsfl_40_idx <= nRC_GXsfl_40 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal1SH42( ) ;
         standaloneModal1SH42( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow1SH42( ) ;
         nGXsfl_40_idx = (int)(nGXsfl_40_idx+1) ;
         sGXsfl_40_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_40_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_4042( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Gridlevel_lineasContainer)) ;
      /* End function gxnrGridlevel_lineas_newrow */
   }

   public void init_web_controls( )
   {
      GXCCtl = "ENTPEDCUM_" + sGXsfl_40_idx ;
      cmbEntPedCum.setName( GXCCtl );
      cmbEntPedCum.setWebtags( "" );
      cmbEntPedCum.addItem("S", httpContext.getMessage( "S", ""), (short)(0));
      cmbEntPedCum.addItem("N", httpContext.getMessage( "N", ""), (short)(0));
      if ( cmbEntPedCum.getItemCount() > 0 )
      {
         if ( isIns( ) && (GXutil.strcmp("", A3404EntPedCum)==0) )
         {
            A3404EntPedCum = httpContext.getMessage( "N", "") ;
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
      n719PrdNum = false ;
      n913StockRem = false ;
      /* Using cursor T01SH28 */
      pr_default.execute(22, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
      if ( (pr_default.getStatus(22) != 101) )
      {
         A913StockRem = T01SH28_A913StockRem[0] ;
         n913StockRem = T01SH28_n913StockRem[0] ;
      }
      else
      {
         A913StockRem = DecimalUtil.doubleToDec(0) ;
         n913StockRem = false ;
      }
      pr_default.close(22);
      GXt_date10 = A14040PrdUltMovF ;
      GXv_char31[0] = A396EmprCod ;
      GXv_char30[0] = A719PrdNum ;
      GXv_date22[0] = GXt_date10 ;
      new app.pstm005(remoteHandle, context).execute( GXv_char31, GXv_char30, GXv_date22) ;
      entradaproducto_impl.this.A396EmprCod = GXv_char31[0] ;
      entradaproducto_impl.this.A719PrdNum = GXv_char30[0] ;
      entradaproducto_impl.this.GXt_date10 = GXv_date22[0] ;
      A14040PrdUltMovF = GXt_date10 ;
      GXt_date10 = A3835UltFecCCs ;
      GXv_char31[0] = A396EmprCod ;
      GXv_char30[0] = A719PrdNum ;
      GXv_date22[0] = GXt_date10 ;
      new app.pstm005(remoteHandle, context).execute( GXv_char31, GXv_char30, GXv_date22) ;
      entradaproducto_impl.this.A396EmprCod = GXv_char31[0] ;
      entradaproducto_impl.this.A719PrdNum = GXv_char30[0] ;
      entradaproducto_impl.this.GXt_date10 = GXv_date22[0] ;
      A3835UltFecCCs = GXt_date10 ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A913StockRem", GXutil.ltrim( localUtil.ntoc( A913StockRem, (byte)(12), (byte)(4), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A14040PrdUltMovF", localUtil.format(A14040PrdUltMovF, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A3835UltFecCCs", localUtil.format(A3835UltFecCCs, "99/99/99"));
   }

   public void valid_Prdexialm( )
   {
      AV40OldExiAlm = O704PrdExiAlm ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "AV40OldExiAlm", GXutil.ltrim( localUtil.ntoc( AV40OldExiAlm, (byte)(12), (byte)(4), ".", "")));
   }

   public void valid_Entfecent( )
   {
      AV59Year = (short)(GXutil.year( A415EntFecEnt)) ;
      AV23Fecha = localUtil.ymdtod( AV59Year, 12, 1) ;
      AV30Mes = (byte)(GXutil.month( A415EntFecEnt)) ;
      AV37oldEntFecent = O415EntFecEnt ;
      AV22FecAnt = O415EntFecEnt ;
      AV12AnyAnt = (short)(GXutil.year( O415EntFecEnt)) ;
      AV31MesAnt = (byte)(GXutil.month( O415EntFecEnt)) ;
      if ( ( isIns( )  || isUpd( )  ) && ( AV36NoUpd == 0 ) )
      {
         A713PrdFulEnt = A415EntFecEnt ;
      }
      if ( ( isIns( )  || isUpd( )  ) && ( AV36NoUpd == 0 ) )
      {
         A709PrdFecPre = A415EntFecEnt ;
      }
      AV34msg_ctrl_fecha = httpContext.getMessage( httpContext.getMessage( "Atencion.Ultimo Mov Fecha ", ""), "") + GXutil.trim( localUtil.dtoc( A14040PrdUltMovF, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")) + httpContext.getMessage( httpContext.getMessage( " superior a Fecha Mov ", ""), "") + GXutil.trim( localUtil.dtoc( A415EntFecEnt, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")) ;
      AV17DiasFin = (short)(GXutil.ddiff(GXutil.eomdate( AV23Fecha),A415EntFecEnt)) ;
      if ( true /* Level */ && true /* After */ && GXutil.resetTime(A415EntFecEnt).after( GXutil.resetTime( Gx_date )) && isIns( )  )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "ERROR.Fecha Entrada mayor a la Fecha del Dia", ""), 1, "ENTFECENT");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEntFecEnt_Internalname ;
      }
      if ( true /* After */ && ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A14040PrdUltMovF)) && GXutil.resetTime(A14040PrdUltMovF).after( GXutil.resetTime( A415EntFecEnt )) && ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A415EntFecEnt)) && ( isIns( )  || isUpd( )  ) && ( AV25FlagFecCcs == 0 ) )
      {
         httpContext.GX_msglist.addItem(AV34msg_ctrl_fecha, 1, "ENTFECENT");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEntFecEnt_Internalname ;
      }
      if ( true /* Level */ && ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A14040PrdUltMovF)) && GXutil.resetTime(A14040PrdUltMovF).after( GXutil.resetTime( A415EntFecEnt )) && ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A415EntFecEnt)) && isDlt( )  && ( AV25FlagFecCcs == 0 ) )
      {
         httpContext.GX_msglist.addItem(AV34msg_ctrl_fecha, 1, "ENTFECENT");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEntFecEnt_Internalname ;
      }
      if ( true /* Level */ && true /* After */ && ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A14040PrdUltMovF)) && GXutil.resetTime(A14040PrdUltMovF).after( GXutil.resetTime( A415EntFecEnt )) && ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A415EntFecEnt)) && ( isIns( )  || isUpd( )  ) && ( AV25FlagFecCcs == 1 ) )
      {
         httpContext.GX_msglist.addItem(AV34msg_ctrl_fecha, 0, "ENTFECENT");
      }
      if ( true /* Level */ && ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A14040PrdUltMovF)) && GXutil.resetTime(A14040PrdUltMovF).after( GXutil.resetTime( A415EntFecEnt )) && ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A415EntFecEnt)) && isDlt( )  && ( AV25FlagFecCcs == 1 ) )
      {
         httpContext.GX_msglist.addItem(AV34msg_ctrl_fecha, 0, "ENTFECENT");
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "AV59Year", GXutil.ltrim( localUtil.ntoc( AV59Year, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV23Fecha", localUtil.format(AV23Fecha, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "AV30Mes", GXutil.ltrim( localUtil.ntoc( AV30Mes, (byte)(2), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV37oldEntFecent", localUtil.format(AV37oldEntFecent, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "AV22FecAnt", localUtil.format(AV22FecAnt, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "AV12AnyAnt", GXutil.ltrim( localUtil.ntoc( AV12AnyAnt, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV31MesAnt", GXutil.ltrim( localUtil.ntoc( AV31MesAnt, (byte)(2), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV34msg_ctrl_fecha", AV34msg_ctrl_fecha);
      httpContext.ajax_rsp_assign_attri("", false, "AV17DiasFin", GXutil.ltrim( localUtil.ntoc( AV17DiasFin, (byte)(3), (byte)(0), ".", "")));
   }

   public void valid_Pedcod( )
   {
      n658PedCod = false ;
      n719PrdNum = false ;
      n800PrvPri = false ;
      /* Using cursor T01SH111 */
      pr_default.execute(105, new Object[] {A396EmprCod, Boolean.valueOf(n658PedCod), Integer.valueOf(A658PedCod)});
      if ( (pr_default.getStatus(105) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A658PedCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CPEDID", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PEDCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtPedCod_Internalname ;
         }
      }
      A661PedFec = T01SH111_A661PedFec[0] ;
      A667PedSit = T01SH111_A667PedSit[0] ;
      A666PedPri = T01SH111_A666PedPri[0] ;
      A12580PedAlmc = T01SH111_A12580PedAlmc[0] ;
      pr_default.close(105);
      /* Using cursor T01SH112 */
      pr_default.execute(106, new Object[] {A396EmprCod, Boolean.valueOf(n658PedCod), Integer.valueOf(A658PedCod), Boolean.valueOf(n719PrdNum), A719PrdNum});
      Z663PedFulEnt = T01SH112_A663PedFulEnt[0] ;
      Z665PedPre = T01SH112_A665PedPre[0] ;
      Z669PedUni = T01SH112_A669PedUni[0] ;
      Z659PedCum = T01SH112_A659PedCum[0] ;
      Z660PedDto = T01SH112_A660PedDto[0] ;
      if ( (pr_default.getStatus(106) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A658PedCod) || (GXutil.strcmp("", A719PrdNum)==0) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "LPEDID", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PRDNUM");
            AnyError = (short)(1) ;
            GX_FocusControl = edtPedCod_Internalname ;
         }
      }
      A657PedCanEnt = T01SH112_A657PedCanEnt[0] ;
      A663PedFulEnt = T01SH112_A663PedFulEnt[0] ;
      A665PedPre = T01SH112_A665PedPre[0] ;
      A669PedUni = T01SH112_A669PedUni[0] ;
      A659PedCum = T01SH112_A659PedCum[0] ;
      A660PedDto = T01SH112_A660PedDto[0] ;
      O657PedCanEnt = A657PedCanEnt ;
      pr_default.close(106);
      if ( true )
      {
         AV44PedPri = GXutil.str( A800PrvPri, 1, 0) ;
      }
      else
      {
         if ( true /* Level */ && ! (0==A658PedCod) )
         {
            AV44PedPri = A666PedPri ;
         }
      }
      if ( ( A684PrdCanPen.doubleValue() < 0 ) && ! (0==A658PedCod) )
      {
         A684PrdCanPen = DecimalUtil.doubleToDec(0) ;
      }
      if ( ! (0==A658PedCod) && isIns( )  && ( A660PedDto.doubleValue() > 0 ) )
      {
         A417EntPre = GXutil.roundDecimal( A665PedPre.multiply((DecimalUtil.doubleToDec(1).subtract((A660PedDto.divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN))))), 2) ;
      }
      else
      {
         if ( ! (0==A658PedCod) && isIns( )  && ( A660PedDto.doubleValue() == 0 ) )
         {
            A417EntPre = A665PedPre ;
         }
      }
      A664PedNumLin = (short)(getPedNumLin0( A396EmprCod, A658PedCod)) ;
      if ( ( A684PrdCanPen.doubleValue() < 0 ) && ( ! (0==A658PedCod) ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "¡ATENCION! Cantidad Entregada superior a la Pendiente", ""), 0, "PEDCOD");
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "O657PedCanEnt", GXutil.ltrim( localUtil.ntoc( O657PedCanEnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      httpContext.ajax_rsp_assign_attri("", false, "A661PedFec", localUtil.format(A661PedFec, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A667PedSit", GXutil.rtrim( A667PedSit));
      httpContext.ajax_rsp_assign_attri("", false, "A666PedPri", GXutil.rtrim( A666PedPri));
      httpContext.ajax_rsp_assign_attri("", false, "A12580PedAlmc", GXutil.ltrim( localUtil.ntoc( A12580PedAlmc, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A657PedCanEnt", GXutil.ltrim( localUtil.ntoc( A657PedCanEnt, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A663PedFulEnt", localUtil.format(A663PedFulEnt, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A665PedPre", GXutil.ltrim( localUtil.ntoc( A665PedPre, (byte)(14), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A669PedUni", GXutil.ltrim( localUtil.ntoc( A669PedUni, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A659PedCum", GXutil.rtrim( A659PedCum));
      httpContext.ajax_rsp_assign_attri("", false, "A660PedDto", GXutil.ltrim( localUtil.ntoc( A660PedDto, (byte)(5), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV44PedPri", GXutil.rtrim( AV44PedPri));
      httpContext.ajax_rsp_assign_attri("", false, "A417EntPre", GXutil.ltrim( localUtil.ntoc( A417EntPre, (byte)(14), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A664PedNumLin", GXutil.ltrim( localUtil.ntoc( A664PedNumLin, (byte)(3), (byte)(0), ".", "")));
   }

   public void valid_Entprvnum( )
   {
      n6156EntPrvNum = false ;
      if ( isIns( )  && (0==A12716EntFabId) && ( Gx_BScreen == 0 ) )
      {
         A12716EntFabId = A6156EntPrvNum ;
      }
      if ( true /* After */ )
      {
         GXt_char1 = AV45PrdNomX ;
         GXv_char31[0] = A396EmprCod ;
         GXv_int29[0] = A6156EntPrvNum ;
         GXv_char30[0] = GXt_char1 ;
         new app.pctrprv(remoteHandle, context).execute( GXv_char31, GXv_int29, GXv_char30) ;
         entradaproducto_impl.this.A396EmprCod = GXv_char31[0] ;
         entradaproducto_impl.this.A6156EntPrvNum = GXv_int29[0] ;
         entradaproducto_impl.this.GXt_char1 = GXv_char30[0] ;
         AV45PrdNomX = GXt_char1 ;
      }
      if ( ( GXutil.strcmp(GXutil.trim( AV45PrdNomX), httpContext.getMessage( "Inexistente", "")) == 0 ) && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "No existe Proveedor¡", ""), 1, "ENTPRVNUM");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEntPrvNum_Internalname ;
      }
      if ( ( A6156EntPrvNum == 0 ) && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Proveedor con codigo vacio¡", ""), 1, "ENTPRVNUM");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEntPrvNum_Internalname ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A12716EntFabId", GXutil.ltrim( localUtil.ntoc( A12716EntFabId, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV45PrdNomX", GXutil.rtrim( AV45PrdNomX));
   }

   public void valid_Entunient( )
   {
      n658PedCod = false ;
      if ( isDlt( )  )
      {
         A704PrdExiAlm = O704PrdExiAlm.subtract(O418EntUniEnt) ;
      }
      else
      {
         if ( isIns( )  || isUpd( )  || isDlt( )  )
         {
            A704PrdExiAlm = O704PrdExiAlm.add(A418EntUniEnt).subtract(O418EntUniEnt) ;
         }
      }
      AV40OldExiAlm = O704PrdExiAlm ;
      AV39OldEntUni = O418EntUniEnt ;
      AV55UniOld = O418EntUniEnt ;
      if ( isIns( )  && ! (0==A658PedCod) )
      {
         A657PedCanEnt = O657PedCanEnt.add(A418EntUniEnt) ;
      }
      else
      {
         if ( isUpd( )  && ! (0==A658PedCod) )
         {
            A657PedCanEnt = O657PedCanEnt.add(A418EntUniEnt).subtract(O418EntUniEnt) ;
         }
         else
         {
            if ( isDlt( )  && ! (0==A658PedCod) )
            {
               A657PedCanEnt = O657PedCanEnt.subtract(A418EntUniEnt) ;
            }
         }
      }
      if ( ( ( DecimalUtil.compareTo(A657PedCanEnt, A669PedUni) == 0 ) ) && ! (0==A658PedCod) )
      {
         A14041EntCump = "S" ;
      }
      else
      {
         if ( ( ( DecimalUtil.compareTo(A657PedCanEnt, A669PedUni) > 0 ) ) && ! (0==A658PedCod) )
         {
            A14041EntCump = "S" ;
         }
         else
         {
            if ( ( DecimalUtil.compareTo(A657PedCanEnt, A669PedUni) < 0 ) && ! (0==A658PedCod) )
            {
               A14041EntCump = "N" ;
            }
            else
            {
               if ( (0==A658PedCod) )
               {
                  A14041EntCump = "S" ;
               }
               else
               {
                  A14041EntCump = "" ;
               }
            }
         }
      }
      if ( ( ( DecimalUtil.compareTo(A657PedCanEnt, A669PedUni) > 0 ) ) && ( ! (0==A658PedCod) ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Cantidad entregada superior a la pedida", ""), 0, "PEDCOD");
      }
      if ( isIns( )  )
      {
         A419EntUniRem = O419EntUniRem.add(A418EntUniEnt) ;
      }
      else
      {
         if ( isUpd( )  )
         {
            A419EntUniRem = (O419EntUniRem.add(A418EntUniEnt).subtract(O418EntUniEnt)) ;
         }
         else
         {
            if ( isDlt( )  )
            {
               A419EntUniRem = (O419EntUniRem.subtract(A418EntUniEnt)) ;
            }
         }
      }
      AV42OldRemanente = O419EntUniRem ;
      if ( isDsp( )  || (0==A658PedCod) )
      {
         cmbEntPedCum.setEnabled( 0 );
      }
      else
      {
         if ( isUpd( )  && ( DecimalUtil.compareTo(A419EntUniRem, A418EntUniEnt) != 0 ) )
         {
            cmbEntPedCum.setEnabled( 0 );
         }
         else
         {
            cmbEntPedCum.setEnabled( 1 );
         }
      }
      if ( isDsp( )  || isDlt( )  || isUpd( )  && ( DecimalUtil.compareTo(A419EntUniRem, A418EntUniEnt) != 0 ) )
      {
         edtEntFecEnt_Enabled = 0 ;
      }
      else
      {
         edtEntFecEnt_Enabled = 1 ;
      }
      if ( isDsp( )  || isDlt( )  || isUpd( )  && ( DecimalUtil.compareTo(A419EntUniRem, A418EntUniEnt) != 0 ) )
      {
         edtAlbaran_Enabled = 0 ;
      }
      else
      {
         edtAlbaran_Enabled = 1 ;
      }
      if ( isDsp( )  || isDlt( )  || isUpd( )  && ( DecimalUtil.compareTo(A419EntUniRem, A418EntUniEnt) != 0 ) )
      {
         edtEntNAlbar_Enabled = 0 ;
      }
      else
      {
         edtEntNAlbar_Enabled = 1 ;
      }
      if ( isDsp( )  || isDlt( )  || isUpd( )  && ( DecimalUtil.compareTo(A419EntUniRem, A418EntUniEnt) != 0 ) )
      {
         edtEntPrvNum_Enabled = 0 ;
      }
      else
      {
         edtEntPrvNum_Enabled = 1 ;
      }
      if ( isDsp( )  || isDlt( )  || isUpd( )  && ( DecimalUtil.compareTo(A419EntUniRem, A418EntUniEnt) != 0 ) )
      {
         edtEntUniEnt_Enabled = 0 ;
      }
      else
      {
         edtEntUniEnt_Enabled = 1 ;
      }
      if ( isDsp( )  || isDlt( )  || isUpd( )  && ( DecimalUtil.compareTo(A419EntUniRem, A418EntUniEnt) != 0 ) )
      {
         edtEntLotN_Enabled = 0 ;
      }
      else
      {
         edtEntLotN_Enabled = 1 ;
      }
      if ( isDsp( )  || isDlt( )  || isUpd( )  && ( DecimalUtil.compareTo(A419EntUniRem, A418EntUniEnt) != 0 ) )
      {
         edtEntPre_Enabled = 0 ;
      }
      else
      {
         edtEntPre_Enabled = 1 ;
      }
      if ( isDsp( )  || isDlt( )  || isUpd( )  && ( DecimalUtil.compareTo(A419EntUniRem, A418EntUniEnt) != 0 ) )
      {
         edtEntFVal_Enabled = 0 ;
      }
      else
      {
         edtEntFVal_Enabled = 1 ;
      }
      if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, A418EntUniEnt)==0) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Debe entrar unidades", ""), 1, "ENTUNIENT");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEntUniEnt_Internalname ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "AV40OldExiAlm", GXutil.ltrim( localUtil.ntoc( AV40OldExiAlm, (byte)(12), (byte)(4), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV39OldEntUni", GXutil.ltrim( localUtil.ntoc( AV39OldEntUni, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV55UniOld", GXutil.ltrim( localUtil.ntoc( AV55UniOld, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A657PedCanEnt", GXutil.ltrim( localUtil.ntoc( A657PedCanEnt, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A14041EntCump", GXutil.rtrim( A14041EntCump));
      httpContext.ajax_rsp_assign_attri("", false, "A419EntUniRem", GXutil.ltrim( localUtil.ntoc( A419EntUniRem, (byte)(11), (byte)(4), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV42OldRemanente", GXutil.ltrim( localUtil.ntoc( AV42OldRemanente, (byte)(11), (byte)(4), ".", "")));
      httpContext.ajax_rsp_assign_prop("", false, cmbEntPedCum.getInternalname(), "Enabled", GXutil.ltrimstr( cmbEntPedCum.getEnabled(), 5, 0), !bGXsfl_40_Refreshing);
      httpContext.ajax_rsp_assign_prop("", false, edtEntFecEnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEntFecEnt_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      httpContext.ajax_rsp_assign_prop("", false, edtAlbaran_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbaran_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      httpContext.ajax_rsp_assign_prop("", false, edtEntNAlbar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEntNAlbar_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      httpContext.ajax_rsp_assign_prop("", false, edtEntPrvNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEntPrvNum_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      httpContext.ajax_rsp_assign_prop("", false, edtEntUniEnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEntUniEnt_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      httpContext.ajax_rsp_assign_prop("", false, edtEntLotN_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEntLotN_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      httpContext.ajax_rsp_assign_prop("", false, edtEntPre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEntPre_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      httpContext.ajax_rsp_assign_prop("", false, edtEntFVal_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEntFVal_Enabled), 5, 0), !bGXsfl_40_Refreshing);
   }

   public void valid_Entpre( )
   {
      AV38OldEntPre = O417EntPre ;
      AV48PrecAnt = O417EntPre ;
      if ( isIns( )  )
      {
         A750PrdValStk = O750PrdValStk.add(GXutil.roundDecimal( A417EntPre.multiply(A418EntUniEnt), 2)) ;
      }
      else
      {
         if ( isUpd( )  )
         {
            A750PrdValStk = O750PrdValStk.add((GXutil.roundDecimal( A417EntPre.multiply(A418EntUniEnt), 2).subtract(GXutil.roundDecimal( AV38OldEntPre.multiply(AV39OldEntUni), 2)))) ;
         }
         else
         {
            if ( isDlt( )  )
            {
               A750PrdValStk = O750PrdValStk.subtract(GXutil.roundDecimal( A417EntPre.multiply(A418EntUniEnt), 2)) ;
            }
         }
      }
      if ( ( A704PrdExiAlm.doubleValue() != 0 ) && ( AV14Consumos == 1 ) && ( A750PrdValStk.doubleValue() > 0 ) )
      {
         A726PrdPreMed = GXutil.roundDecimal( A750PrdValStk.divide(A704PrdExiAlm, 18, java.math.RoundingMode.DOWN), 3) ;
      }
      else
      {
         if ( ( A704PrdExiAlm.doubleValue() == 0 ) && ( AV14Consumos == 1 ) && ( A750PrdValStk.doubleValue() == 0 ) )
         {
            A726PrdPreMed = DecimalUtil.doubleToDec(0) ;
         }
         else
         {
            if ( ( ( A704PrdExiAlm.doubleValue() != 0 ) || ( A705PrdExiCC.doubleValue() != 0 ) ) && ( AV14Consumos == 0 ) )
            {
               A726PrdPreMed = GXutil.roundDecimal( A750PrdValStk.divide((A704PrdExiAlm.add(A705PrdExiCC)), 18, java.math.RoundingMode.DOWN), 3) ;
            }
            else
            {
               if ( ( A704PrdExiAlm.doubleValue() == 0 ) && ( A705PrdExiCC.doubleValue() == 0 ) && ( AV14Consumos == 0 ) )
               {
                  A726PrdPreMed = DecimalUtil.doubleToDec(0) ;
               }
            }
         }
      }
      if ( ( AV36NoUpd == 0 ) && ( isIns( )  || isUpd( )  ) )
      {
         A724PrdPreAct = A417EntPre ;
      }
      if ( ( isIns( )  || isUpd( )  ) && ( AV36NoUpd == 0 ) )
      {
         A725PrdPreAnt = O724PrdPreAct ;
      }
      if ( true /* Level */ && true /* After */ && (DecimalUtil.compareTo(DecimalUtil.ZERO, A417EntPre)==0) && (0==AV60FlagPre) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "ERROR.Precio con valor CERO", ""), 1, "ENTPRE");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEntPre_Internalname ;
      }
      if ( true /* Level */ && true /* After */ && (DecimalUtil.compareTo(DecimalUtil.ZERO, A417EntPre)==0) && ( AV60FlagPre == 1 ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "MENSAJE.Precio con valor CERO", ""), 0, "ENTPRE");
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "AV38OldEntPre", GXutil.ltrim( localUtil.ntoc( AV38OldEntPre, (byte)(14), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV48PrecAnt", GXutil.ltrim( localUtil.ntoc( AV48PrecAnt, (byte)(14), (byte)(5), ".", "")));
   }

   public void valid_Entlotn( )
   {
      AV41oldlote = O5686EntLotN ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "AV41oldlote", GXutil.rtrim( AV41oldlote));
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV18EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV46PrdNum',fld:'vPRDNUM',pic:'',hsh:true}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV18EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV46PrdNum',fld:'vPRDNUM',pic:'',hsh:true},{av:'AV62Pgmname',fld:'vPGMNAME',pic:''},{av:'A698PrdDetPar',fld:'PRDDETPAR',pic:''},{av:'A729PrdRotRea',fld:'PRDROTREA',pic:'ZZZZZ9.999'},{av:'A727PrdRec',fld:'PRDREC',pic:''},{av:'A5255PrdPreAc2',fld:'PRDPREAC2',pic:'ZZZZZZZ9.999'},{av:'A705PrdExiCC',fld:'PRDEXICC',pic:'ZZZZZZ9.9999'}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("AFTER TRN","{handler:'e121SH2',iparms:[]");
      setEventMetadata("AFTER TRN",",oparms:[]}");
      setEventMetadata("VALID_PRDNUM","{handler:'valid_Prdnum',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A719PrdNum',fld:'PRDNUM',pic:''},{av:'A913StockRem',fld:'STOCKREM',pic:'ZZZZZZ9.9999'},{av:'A14040PrdUltMovF',fld:'PRDULTMOVF',pic:''},{av:'A3835UltFecCCs',fld:'ULTFECCCS',pic:''}]");
      setEventMetadata("VALID_PRDNUM",",oparms:[{av:'A913StockRem',fld:'STOCKREM',pic:'ZZZZZZ9.9999'},{av:'A14040PrdUltMovF',fld:'PRDULTMOVF',pic:''},{av:'A3835UltFecCCs',fld:'ULTFECCCS',pic:''}]}");
      setEventMetadata("VALID_PRDNOM","{handler:'valid_Prdnom',iparms:[]");
      setEventMetadata("VALID_PRDNOM",",oparms:[]}");
      setEventMetadata("VALID_PRDEXIALM","{handler:'valid_Prdexialm',iparms:[{av:'O704PrdExiAlm'},{av:'A704PrdExiAlm',fld:'PRDEXIALM',pic:'ZZZZZZ9.9999'},{av:'AV40OldExiAlm',fld:'vOLDEXIALM',pic:'ZZZZZZ9.9999'}]");
      setEventMetadata("VALID_PRDEXIALM",",oparms:[{av:'AV40OldExiAlm',fld:'vOLDEXIALM',pic:'ZZZZZZ9.9999'}]}");
      setEventMetadata("VALID_PRDULTMOVF","{handler:'valid_Prdultmovf',iparms:[]");
      setEventMetadata("VALID_PRDULTMOVF",",oparms:[]}");
      setEventMetadata("VALIDV_PGMNAME","{handler:'validv_Pgmname',iparms:[]");
      setEventMetadata("VALIDV_PGMNAME",",oparms:[]}");
      setEventMetadata("VALID_LINENT","{handler:'valid_Linent',iparms:[]");
      setEventMetadata("VALID_LINENT",",oparms:[]}");
      setEventMetadata("VALID_ENTFECENT","{handler:'valid_Entfecent',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'O415EntFecEnt'},{av:'A415EntFecEnt',fld:'ENTFECENT',pic:''},{av:'AV59Year',fld:'vYEAR',pic:'ZZZ9'},{av:'AV36NoUpd',fld:'vNOUPD',pic:'ZZZ9'},{av:'A14040PrdUltMovF',fld:'PRDULTMOVF',pic:''},{av:'AV23Fecha',fld:'vFECHA',pic:''},{av:'AV34msg_ctrl_fecha',fld:'vMSG_CTRL_FECHA',pic:''},{av:'AV25FlagFecCcs',fld:'vFLAGFECCCS',pic:'ZZZ9'},{av:'AV30Mes',fld:'vMES',pic:'Z9'},{av:'AV37oldEntFecent',fld:'vOLDENTFECENT',pic:''},{av:'AV22FecAnt',fld:'vFECANT',pic:''},{av:'AV12AnyAnt',fld:'vANYANT',pic:'ZZZ9'},{av:'AV31MesAnt',fld:'vMESANT',pic:'Z9'},{av:'AV17DiasFin',fld:'vDIASFIN',pic:'ZZ9'}]");
      setEventMetadata("VALID_ENTFECENT",",oparms:[{av:'AV59Year',fld:'vYEAR',pic:'ZZZ9'},{av:'AV23Fecha',fld:'vFECHA',pic:''},{av:'AV30Mes',fld:'vMES',pic:'Z9'},{av:'AV37oldEntFecent',fld:'vOLDENTFECENT',pic:''},{av:'AV22FecAnt',fld:'vFECANT',pic:''},{av:'AV12AnyAnt',fld:'vANYANT',pic:'ZZZ9'},{av:'AV31MesAnt',fld:'vMESANT',pic:'Z9'},{av:'AV34msg_ctrl_fecha',fld:'vMSG_CTRL_FECHA',pic:''},{av:'AV17DiasFin',fld:'vDIASFIN',pic:'ZZ9'}]}");
      setEventMetadata("VALID_ALBARAN","{handler:'valid_Albaran',iparms:[]");
      setEventMetadata("VALID_ALBARAN",",oparms:[]}");
      setEventMetadata("VALID_ENTNALBAR","{handler:'valid_Entnalbar',iparms:[]");
      setEventMetadata("VALID_ENTNALBAR",",oparms:[]}");
      setEventMetadata("VALID_PEDCOD","{handler:'valid_Pedcod',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A658PedCod',fld:'PEDCOD',pic:'ZZZZZZZ9'},{av:'A719PrdNum',fld:'PRDNUM',pic:''},{av:'A800PrvPri',fld:'PRVPRI',pic:'9'},{av:'A666PedPri',fld:'PEDPRI',pic:'9'},{av:'A665PedPre',fld:'PEDPRE',pic:'ZZZZZZZ9.999'},{av:'A660PedDto',fld:'PEDDTO',pic:'Z9.99'},{av:'A684PrdCanPen',fld:'PRDCANPEN',pic:'ZZZZZZ9.9999'},{av:'A661PedFec',fld:'PEDFEC',pic:''},{av:'A667PedSit',fld:'PEDSIT',pic:'@!'},{av:'A12580PedAlmc',fld:'PEDALMC',pic:'9'},{av:'A657PedCanEnt',fld:'PEDCANENT',pic:'ZZZZZ9.99'},{av:'A663PedFulEnt',fld:'PEDFULENT',pic:''},{av:'A669PedUni',fld:'PEDUNI',pic:'ZZZZZ9.99'},{av:'A659PedCum',fld:'PEDCUM',pic:'@!'},{av:'AV44PedPri',fld:'vPEDPRI',pic:'9'},{av:'A417EntPre',fld:'ENTPRE',pic:'ZZZZZZZ9.999'},{av:'A664PedNumLin',fld:'PEDNUMLIN',pic:'ZZ9'}]");
      setEventMetadata("VALID_PEDCOD",",oparms:[{av:'O657PedCanEnt'},{av:'A661PedFec',fld:'PEDFEC',pic:''},{av:'A667PedSit',fld:'PEDSIT',pic:'@!'},{av:'A666PedPri',fld:'PEDPRI',pic:'9'},{av:'A12580PedAlmc',fld:'PEDALMC',pic:'9'},{av:'A657PedCanEnt',fld:'PEDCANENT',pic:'ZZZZZ9.99'},{av:'A663PedFulEnt',fld:'PEDFULENT',pic:''},{av:'A665PedPre',fld:'PEDPRE',pic:'ZZZZZZZ9.999'},{av:'A669PedUni',fld:'PEDUNI',pic:'ZZZZZ9.99'},{av:'A659PedCum',fld:'PEDCUM',pic:'@!'},{av:'A660PedDto',fld:'PEDDTO',pic:'Z9.99'},{av:'AV44PedPri',fld:'vPEDPRI',pic:'9'},{av:'A417EntPre',fld:'ENTPRE',pic:'ZZZZZZZ9.999'},{av:'A664PedNumLin',fld:'PEDNUMLIN',pic:'ZZ9'}]}");
      setEventMetadata("VALID_ENTPRVNUM","{handler:'valid_Entprvnum',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'A6156EntPrvNum',fld:'ENTPRVNUM',pic:'ZZZZZ9'},{av:'Gx_BScreen',fld:'vGXBSCREEN',pic:'9'},{av:'A12716EntFabId',fld:'ENTFABID',pic:'ZZZZZ9'},{av:'AV45PrdNomX',fld:'vPRDNOMX',pic:''}]");
      setEventMetadata("VALID_ENTPRVNUM",",oparms:[{av:'A12716EntFabId',fld:'ENTFABID',pic:'ZZZZZ9'},{av:'AV45PrdNomX',fld:'vPRDNOMX',pic:''}]}");
      setEventMetadata("VALID_ENTUNIENT","{handler:'valid_Entunient',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'O419EntUniRem'},{av:'O657PedCanEnt'},{av:'O418EntUniEnt'},{av:'O704PrdExiAlm'},{av:'A418EntUniEnt',fld:'ENTUNIENT',pic:'ZZZZZ9.99'},{av:'A704PrdExiAlm',fld:'PRDEXIALM',pic:'ZZZZZZ9.9999'},{av:'A657PedCanEnt',fld:'PEDCANENT',pic:'ZZZZZ9.99'},{av:'A658PedCod',fld:'PEDCOD',pic:'ZZZZZZZ9'},{av:'A669PedUni',fld:'PEDUNI',pic:'ZZZZZ9.99'},{av:'A419EntUniRem',fld:'ENTUNIREM',pic:'ZZZZZ9.9999'},{av:'AV40OldExiAlm',fld:'vOLDEXIALM',pic:'ZZZZZZ9.9999'},{av:'AV39OldEntUni',fld:'vOLDENTUNI',pic:'ZZZZZ9.99'},{av:'AV55UniOld',fld:'vUNIOLD',pic:'ZZZZZ9.99'},{av:'A14041EntCump',fld:'ENTCUMP',pic:''},{av:'AV42OldRemanente',fld:'vOLDREMANENTE',pic:'ZZZZZ9.9999'}]");
      setEventMetadata("VALID_ENTUNIENT",",oparms:[{av:'AV40OldExiAlm',fld:'vOLDEXIALM',pic:'ZZZZZZ9.9999'},{av:'AV39OldEntUni',fld:'vOLDENTUNI',pic:'ZZZZZ9.99'},{av:'AV55UniOld',fld:'vUNIOLD',pic:'ZZZZZ9.99'},{av:'A657PedCanEnt',fld:'PEDCANENT',pic:'ZZZZZ9.99'},{av:'A14041EntCump',fld:'ENTCUMP',pic:''},{av:'A419EntUniRem',fld:'ENTUNIREM',pic:'ZZZZZ9.9999'},{av:'AV42OldRemanente',fld:'vOLDREMANENTE',pic:'ZZZZZ9.9999'},{av:'cmbEntPedCum'},{av:'edtEntFecEnt_Enabled',ctrl:'ENTFECENT',prop:'Enabled'},{av:'edtAlbaran_Enabled',ctrl:'ALBARAN',prop:'Enabled'},{av:'edtEntNAlbar_Enabled',ctrl:'ENTNALBAR',prop:'Enabled'},{av:'edtEntPrvNum_Enabled',ctrl:'ENTPRVNUM',prop:'Enabled'},{av:'edtEntUniEnt_Enabled',ctrl:'ENTUNIENT',prop:'Enabled'},{av:'edtEntLotN_Enabled',ctrl:'ENTLOTN',prop:'Enabled'},{av:'edtEntPre_Enabled',ctrl:'ENTPRE',prop:'Enabled'},{av:'edtEntFVal_Enabled',ctrl:'ENTFVAL',prop:'Enabled'}]}");
      setEventMetadata("VALID_ENTCUMP","{handler:'valid_Entcump',iparms:[]");
      setEventMetadata("VALID_ENTCUMP",",oparms:[]}");
      setEventMetadata("VALID_ENTPEDCUM","{handler:'valid_Entpedcum',iparms:[]");
      setEventMetadata("VALID_ENTPEDCUM",",oparms:[]}");
      setEventMetadata("VALID_ENTPRE","{handler:'valid_Entpre',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'O724PrdPreAct'},{av:'O750PrdValStk'},{av:'O417EntPre'},{av:'A417EntPre',fld:'ENTPRE',pic:'ZZZZZZZ9.999'},{av:'A418EntUniEnt',fld:'ENTUNIENT',pic:'ZZZZZ9.99'},{av:'AV38OldEntPre',fld:'vOLDENTPRE',pic:'ZZZZZZZ9.999'},{av:'AV39OldEntUni',fld:'vOLDENTUNI',pic:'ZZZZZ9.99'},{av:'A750PrdValStk',fld:'PRDVALSTK',pic:'ZZZZZZZ9.99'},{av:'A704PrdExiAlm',fld:'PRDEXIALM',pic:'ZZZZZZ9.9999'},{av:'AV14Consumos',fld:'vCONSUMOS',pic:'ZZZ9'},{av:'A705PrdExiCC',fld:'PRDEXICC',pic:'ZZZZZZ9.9999'},{av:'AV36NoUpd',fld:'vNOUPD',pic:'ZZZ9'},{av:'A724PrdPreAct',fld:'PRDPREACT',pic:'ZZZZZZZ9.999'},{av:'AV48PrecAnt',fld:'vPRECANT',pic:'ZZZZZZZ9.999'}]");
      setEventMetadata("VALID_ENTPRE",",oparms:[{av:'AV38OldEntPre',fld:'vOLDENTPRE',pic:'ZZZZZZZ9.999'},{av:'AV48PrecAnt',fld:'vPRECANT',pic:'ZZZZZZZ9.999'}]}");
      setEventMetadata("VALID_ENTUNIREM","{handler:'valid_Entunirem',iparms:[]");
      setEventMetadata("VALID_ENTUNIREM",",oparms:[]}");
      setEventMetadata("VALID_ENTLOTN","{handler:'valid_Entlotn',iparms:[{av:'O5686EntLotN'},{av:'A5686EntLotN',fld:'ENTLOTN',pic:''},{av:'AV41oldlote',fld:'vOLDLOTE',pic:''}]");
      setEventMetadata("VALID_ENTLOTN",",oparms:[{av:'AV41oldlote',fld:'vOLDLOTE',pic:''}]}");
      setEventMetadata("NULL","{handler:'valid_Entfval',iparms:[]");
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
      pr_default.close(105);
      pr_default.close(106);
      pr_default.close(21);
      pr_default.close(22);
   }

   /* Aggregate/select formulas */
   public int getPedNumLin0( String E396EmprCod ,
                             int E658PedCod )
   {
      Gx_cnt = 0 ;
      Gx_first = true ;
      /* Using cursor T01SH115 */
      pr_default.execute(109, new Object[] {E396EmprCod, Boolean.valueOf(nA658PedCod), Integer.valueOf(E658PedCod)});
      while ( (pr_default.getStatus(109) != 101) )
      {
         if ( ( ( GXutil.strcmp(T01SH115_A659PedCum[0], httpContext.getMessage( httpContext.getMessage( "N", ""), "")) == 0 ) ) && ( ( GXutil.strcmp(E396EmprCod, E396EmprCod) == 0 ) && ( E658PedCod == E658PedCod ) ) )
         {
            if ( Gx_first )
            {
               Gx_cnt = 1 ;
               Gx_first = false ;
            }
            else
            {
               Gx_cnt = (int)(Gx_cnt+1) ;
            }
         }
         pr_default.readNext(109);
      }
      pr_default.close(109);
      return Gx_cnt ;
   }

   public void initialize( )
   {
      sPrefix = "" ;
      wcpOGx_mode = "" ;
      wcpOAV18EmprCod = "" ;
      wcpOAV46PrdNum = "" ;
      Z396EmprCod = "" ;
      Z719PrdNum = "" ;
      Z726PrdPreMed = DecimalUtil.ZERO ;
      Z725PrdPreAnt = DecimalUtil.ZERO ;
      Z718PrdNom = "" ;
      Z724PrdPreAct = DecimalUtil.ZERO ;
      Z704PrdExiAlm = DecimalUtil.ZERO ;
      Z698PrdDetPar = "" ;
      Z713PrdFulEnt = GXutil.nullDate() ;
      Z684PrdCanPen = DecimalUtil.ZERO ;
      Z729PrdRotRea = DecimalUtil.ZERO ;
      Z727PrdRec = "" ;
      Z709PrdFecPre = GXutil.nullDate() ;
      Z5255PrdPreAc2 = DecimalUtil.ZERO ;
      Z750PrdValStk = DecimalUtil.ZERO ;
      Z705PrdExiCC = DecimalUtil.ZERO ;
      O724PrdPreAct = DecimalUtil.ZERO ;
      O704PrdExiAlm = DecimalUtil.ZERO ;
      O750PrdValStk = DecimalUtil.ZERO ;
      Z415EntFecEnt = GXutil.nullDate() ;
      Z10184EntRemTpo = "" ;
      Z3404EntPedCum = "" ;
      Z419EntUniRem = DecimalUtil.ZERO ;
      Z417EntPre = DecimalUtil.ZERO ;
      Z11Albaran = "" ;
      Z12857EntNAlbar = "" ;
      Z418EntUniEnt = DecimalUtil.ZERO ;
      Z5686EntLotN = "" ;
      Z5685EntFVal = GXutil.nullDate() ;
      Z5691EntBnc = "" ;
      Z7695EntCC = "" ;
      Z10782EntUniAlb = DecimalUtil.ZERO ;
      Z10783EntObs = "" ;
      Z10187EntRemNro = "" ;
      Z10186EntRemFch = GXutil.nullDate() ;
      Z10185EntRemSuc = "" ;
      Z13456EntUbicaci = "" ;
      Z5690EntHfCon = GXutil.resetTime( GXutil.nullDate() );
      Z5689EntFfCon = GXutil.nullDate() ;
      Z5688EntHiCon = GXutil.resetTime( GXutil.nullDate() );
      Z5687EntFiCon = GXutil.nullDate() ;
      Z663PedFulEnt = GXutil.nullDate() ;
      Z665PedPre = DecimalUtil.ZERO ;
      Z669PedUni = DecimalUtil.ZERO ;
      Z659PedCum = "" ;
      Z660PedDto = DecimalUtil.ZERO ;
      O419EntUniRem = DecimalUtil.ZERO ;
      O418EntUniEnt = DecimalUtil.ZERO ;
      O657PedCanEnt = DecimalUtil.ZERO ;
      O415EntFecEnt = GXutil.nullDate() ;
      O417EntPre = DecimalUtil.ZERO ;
      O5686EntLotN = "" ;
      O3404EntPedCum = "" ;
      N415EntFecEnt = GXutil.nullDate() ;
      N11Albaran = "" ;
      N12857EntNAlbar = "" ;
      N418EntUniEnt = DecimalUtil.ZERO ;
      N3404EntPedCum = "" ;
      N417EntPre = DecimalUtil.ZERO ;
      N5686EntLotN = "" ;
      N5685EntFVal = GXutil.nullDate() ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A719PrdNum = "" ;
      A417EntPre = DecimalUtil.ZERO ;
      Gx_mode = "" ;
      A415EntFecEnt = GXutil.nullDate() ;
      A418EntUniEnt = DecimalUtil.ZERO ;
      AV44PedPri = "" ;
      A718PrdNom = "" ;
      AV62Pgmname = "" ;
      AV56UsurCod = "" ;
      AV50Station = "" ;
      AV26Inc_obs = "" ;
      AV18EmprCod = "" ;
      AV46PrdNum = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      AV43PedCodPrompt = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_tableattributes = new com.genexus.webpanels.GXUserControl();
      A704PrdExiAlm = DecimalUtil.ZERO ;
      A14040PrdUltMovF = GXutil.nullDate() ;
      TempTags = "" ;
      bttBtntrn_enter_Jsonclick = "" ;
      bttBtntrn_cancel_Jsonclick = "" ;
      bttBtntrn_delete_Jsonclick = "" ;
      Gridlevel_lineasContainer = new com.genexus.webpanels.GXWebGrid(context);
      B724PrdPreAct = DecimalUtil.ZERO ;
      A724PrdPreAct = DecimalUtil.ZERO ;
      B704PrdExiAlm = DecimalUtil.ZERO ;
      B750PrdValStk = DecimalUtil.ZERO ;
      A750PrdValStk = DecimalUtil.ZERO ;
      sMode42 = "" ;
      GX_FocusControl = "" ;
      sStyleString = "" ;
      A726PrdPreMed = DecimalUtil.ZERO ;
      A725PrdPreAnt = DecimalUtil.ZERO ;
      A698PrdDetPar = "" ;
      A713PrdFulEnt = GXutil.nullDate() ;
      A684PrdCanPen = DecimalUtil.ZERO ;
      A729PrdRotRea = DecimalUtil.ZERO ;
      A727PrdRec = "" ;
      A709PrdFecPre = GXutil.nullDate() ;
      A5255PrdPreAc2 = DecimalUtil.ZERO ;
      A705PrdExiCC = DecimalUtil.ZERO ;
      A3835UltFecCCs = GXutil.nullDate() ;
      AV40OldExiAlm = DecimalUtil.ZERO ;
      A407EmprNom = "" ;
      A794PrvNom = "" ;
      A913StockRem = DecimalUtil.ZERO ;
      Gx_date = GXutil.nullDate() ;
      A657PedCanEnt = DecimalUtil.ZERO ;
      A669PedUni = DecimalUtil.ZERO ;
      A10184EntRemTpo = "" ;
      A666PedPri = "" ;
      AV38OldEntPre = DecimalUtil.ZERO ;
      AV39OldEntUni = DecimalUtil.ZERO ;
      AV42OldRemanente = DecimalUtil.ZERO ;
      AV37oldEntFecent = GXutil.nullDate() ;
      AV41oldlote = "" ;
      AV55UniOld = DecimalUtil.ZERO ;
      AV22FecAnt = GXutil.nullDate() ;
      AV48PrecAnt = DecimalUtil.ZERO ;
      A663PedFulEnt = GXutil.nullDate() ;
      A665PedPre = DecimalUtil.ZERO ;
      A660PedDto = DecimalUtil.ZERO ;
      AV45PrdNomX = "" ;
      AV34msg_ctrl_fecha = "" ;
      AV23Fecha = GXutil.nullDate() ;
      A5691EntBnc = "" ;
      A7695EntCC = "" ;
      A10782EntUniAlb = DecimalUtil.ZERO ;
      A10783EntObs = "" ;
      A10187EntRemNro = "" ;
      A10186EntRemFch = GXutil.nullDate() ;
      A10185EntRemSuc = "" ;
      A13456EntUbicaci = "" ;
      A5690EntHfCon = GXutil.resetTime( GXutil.nullDate() );
      A5689EntFfCon = GXutil.nullDate() ;
      A5688EntHiCon = GXutil.resetTime( GXutil.nullDate() );
      A5687EntFiCon = GXutil.nullDate() ;
      A661PedFec = GXutil.nullDate() ;
      A667PedSit = "" ;
      A659PedCum = "" ;
      Dvpanel_tableattributes_Objectcall = "" ;
      Dvpanel_tableattributes_Class = "" ;
      Dvpanel_tableattributes_Height = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      hsh = "" ;
      sMode29 = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      s724PrdPreAct = DecimalUtil.ZERO ;
      s704PrdExiAlm = DecimalUtil.ZERO ;
      s750PrdValStk = DecimalUtil.ZERO ;
      sV44PedPri = "" ;
      OV44PedPri = "" ;
      s713PrdFulEnt = GXutil.nullDate() ;
      O713PrdFulEnt = GXutil.nullDate() ;
      s709PrdFecPre = GXutil.nullDate() ;
      O709PrdFecPre = GXutil.nullDate() ;
      s684PrdCanPen = DecimalUtil.ZERO ;
      O684PrdCanPen = DecimalUtil.ZERO ;
      s14040PrdUltMovF = GXutil.nullDate() ;
      O14040PrdUltMovF = GXutil.nullDate() ;
      sV40OldExiAlm = DecimalUtil.ZERO ;
      OV40OldExiAlm = DecimalUtil.ZERO ;
      s726PrdPreMed = DecimalUtil.ZERO ;
      O726PrdPreMed = DecimalUtil.ZERO ;
      s725PrdPreAnt = DecimalUtil.ZERO ;
      O725PrdPreAnt = DecimalUtil.ZERO ;
      GXCCtl = "" ;
      A11Albaran = "" ;
      A12857EntNAlbar = "" ;
      A14041EntCump = "" ;
      A3404EntPedCum = "" ;
      A419EntUniRem = DecimalUtil.ZERO ;
      A5686EntLotN = "" ;
      A5685EntFVal = GXutil.nullDate() ;
      T419EntUniRem = DecimalUtil.ZERO ;
      T418EntUniEnt = DecimalUtil.ZERO ;
      T657PedCanEnt = DecimalUtil.ZERO ;
      T415EntFecEnt = GXutil.nullDate() ;
      T417EntPre = DecimalUtil.ZERO ;
      T5686EntLotN = "" ;
      T3404EntPedCum = "" ;
      T01SH8_A913StockRem = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SH8_n913StockRem = new boolean[] {false} ;
      AV19EmprNom = "" ;
      AV58WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext9 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV52TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV57WebSession = httpContext.getWebSession();
      AV53TrnContextAtt = new app.wwpbaseobjects.SdtWWPTransactionContext_Attribute(remoteHandle, context);
      AV65Pedcodprompt_GXI = "" ;
      Z407EmprNom = "" ;
      Z794PrvNom = "" ;
      Z913StockRem = DecimalUtil.ZERO ;
      T01SH11_A407EmprNom = new String[] {""} ;
      T01SH11_n407EmprNom = new boolean[] {false} ;
      T01SH11_A3915EmpNumDec = new byte[1] ;
      T01SH11_n3915EmpNumDec = new boolean[] {false} ;
      T01SH12_A794PrvNom = new String[] {""} ;
      T01SH12_n794PrvNom = new boolean[] {false} ;
      T01SH12_A800PrvPri = new byte[1] ;
      T01SH12_n800PrvPri = new boolean[] {false} ;
      T01SH15_A719PrdNum = new String[] {""} ;
      T01SH15_n719PrdNum = new boolean[] {false} ;
      T01SH15_A726PrdPreMed = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SH15_A725PrdPreAnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SH15_A718PrdNom = new String[] {""} ;
      T01SH15_A794PrvNom = new String[] {""} ;
      T01SH15_n794PrvNom = new boolean[] {false} ;
      T01SH15_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SH15_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SH15_A847UltLinEnt = new short[1] ;
      T01SH15_A698PrdDetPar = new String[] {""} ;
      T01SH15_A713PrdFulEnt = new java.util.Date[] {GXutil.nullDate()} ;
      T01SH15_A684PrdCanPen = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SH15_A729PrdRotRea = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SH15_A727PrdRec = new String[] {""} ;
      T01SH15_A709PrdFecPre = new java.util.Date[] {GXutil.nullDate()} ;
      T01SH15_A407EmprNom = new String[] {""} ;
      T01SH15_n407EmprNom = new boolean[] {false} ;
      T01SH15_A800PrvPri = new byte[1] ;
      T01SH15_n800PrvPri = new boolean[] {false} ;
      T01SH15_A3915EmpNumDec = new byte[1] ;
      T01SH15_n3915EmpNumDec = new boolean[] {false} ;
      T01SH15_A5255PrdPreAc2 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SH15_A750PrdValStk = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SH15_A705PrdExiCC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SH15_A396EmprCod = new String[] {""} ;
      T01SH15_A795PrvNum = new int[1] ;
      T01SH15_A856ValCod = new byte[1] ;
      T01SH15_A913StockRem = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SH15_n913StockRem = new boolean[] {false} ;
      T01SH13_A396EmprCod = new String[] {""} ;
      T01SH16_A794PrvNom = new String[] {""} ;
      T01SH16_n794PrvNom = new boolean[] {false} ;
      T01SH16_A800PrvPri = new byte[1] ;
      T01SH16_n800PrvPri = new boolean[] {false} ;
      T01SH17_A396EmprCod = new String[] {""} ;
      T01SH19_A913StockRem = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SH19_n913StockRem = new boolean[] {false} ;
      T01SH20_A396EmprCod = new String[] {""} ;
      T01SH20_A719PrdNum = new String[] {""} ;
      T01SH20_n719PrdNum = new boolean[] {false} ;
      T01SH10_A719PrdNum = new String[] {""} ;
      T01SH10_n719PrdNum = new boolean[] {false} ;
      T01SH10_A726PrdPreMed = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SH10_A725PrdPreAnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SH10_A718PrdNom = new String[] {""} ;
      T01SH10_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SH10_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SH10_A847UltLinEnt = new short[1] ;
      T01SH10_A698PrdDetPar = new String[] {""} ;
      T01SH10_A713PrdFulEnt = new java.util.Date[] {GXutil.nullDate()} ;
      T01SH10_A684PrdCanPen = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SH10_A729PrdRotRea = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SH10_A727PrdRec = new String[] {""} ;
      T01SH10_A709PrdFecPre = new java.util.Date[] {GXutil.nullDate()} ;
      T01SH10_A5255PrdPreAc2 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SH10_A750PrdValStk = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SH10_A705PrdExiCC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SH10_A396EmprCod = new String[] {""} ;
      T01SH10_A795PrvNum = new int[1] ;
      T01SH10_A856ValCod = new byte[1] ;
      T01SH21_A396EmprCod = new String[] {""} ;
      T01SH21_A719PrdNum = new String[] {""} ;
      T01SH21_n719PrdNum = new boolean[] {false} ;
      T01SH22_A396EmprCod = new String[] {""} ;
      T01SH22_A719PrdNum = new String[] {""} ;
      T01SH22_n719PrdNum = new boolean[] {false} ;
      T01SH9_A719PrdNum = new String[] {""} ;
      T01SH9_n719PrdNum = new boolean[] {false} ;
      T01SH9_A726PrdPreMed = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SH9_A725PrdPreAnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SH9_A718PrdNom = new String[] {""} ;
      T01SH9_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SH9_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SH9_A847UltLinEnt = new short[1] ;
      T01SH9_A698PrdDetPar = new String[] {""} ;
      T01SH9_A713PrdFulEnt = new java.util.Date[] {GXutil.nullDate()} ;
      T01SH9_A684PrdCanPen = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SH9_A729PrdRotRea = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SH9_A727PrdRec = new String[] {""} ;
      T01SH9_A709PrdFecPre = new java.util.Date[] {GXutil.nullDate()} ;
      T01SH9_A5255PrdPreAc2 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SH9_A750PrdValStk = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SH9_A705PrdExiCC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SH9_A396EmprCod = new String[] {""} ;
      T01SH9_A795PrvNum = new int[1] ;
      T01SH9_A856ValCod = new byte[1] ;
      T01SH26_A794PrvNom = new String[] {""} ;
      T01SH26_n794PrvNom = new boolean[] {false} ;
      T01SH26_A800PrvPri = new byte[1] ;
      T01SH26_n800PrvPri = new boolean[] {false} ;
      T01SH28_A913StockRem = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SH28_n913StockRem = new boolean[] {false} ;
      T01SH29_A396EmprCod = new String[] {""} ;
      T01SH29_A719PrdNum = new String[] {""} ;
      T01SH29_n719PrdNum = new boolean[] {false} ;
      T01SH29_A13217NormaID = new String[] {""} ;
      T01SH30_A396EmprCod = new String[] {""} ;
      T01SH30_A719PrdNum = new String[] {""} ;
      T01SH30_n719PrdNum = new boolean[] {false} ;
      T01SH30_A13586TheList = new String[] {""} ;
      T01SH31_A396EmprCod = new String[] {""} ;
      T01SH31_A5532Lb_numero = new int[1] ;
      T01SH31_A5555Lb_opcion = new String[] {""} ;
      T01SH31_A13460Lb_linCP = new short[1] ;
      T01SH31_A13458Lb_TipCP = new String[] {""} ;
      T01SH32_A396EmprCod = new String[] {""} ;
      T01SH32_A13418AlbProID = new int[1] ;
      T01SH32_A13442AlbProLine = new short[1] ;
      T01SH33_A396EmprCod = new String[] {""} ;
      T01SH33_A13324LDESID = new int[1] ;
      T01SH33_A13333LDESNPeque = new String[] {""} ;
      T01SH33_A13337LDESComb = new String[] {""} ;
      T01SH33_A13339LDESFondo = new String[] {""} ;
      T01SH33_A13342LDESLinea = new short[1] ;
      T01SH34_A396EmprCod = new String[] {""} ;
      T01SH34_A13312Lb_NLab = new int[1] ;
      T01SH34_A13305Lb_IDVeces = new short[1] ;
      T01SH34_A13306Lb_LinID = new short[1] ;
      T01SH35_A396EmprCod = new String[] {""} ;
      T01SH35_A12673LavMqId = new int[1] ;
      T01SH35_A12692LavMqLnPq = new short[1] ;
      T01SH35_A12681LavMqLn = new short[1] ;
      T01SH36_A396EmprCod = new String[] {""} ;
      T01SH36_A719PrdNum = new String[] {""} ;
      T01SH36_n719PrdNum = new boolean[] {false} ;
      T01SH36_A9713Tb1_Cod = new short[1] ;
      T01SH37_A396EmprCod = new String[] {""} ;
      T01SH37_A12236PrdNumD = new String[] {""} ;
      T01SH37_A719PrdNum = new String[] {""} ;
      T01SH37_n719PrdNum = new boolean[] {false} ;
      T01SH38_A396EmprCod = new String[] {""} ;
      T01SH38_A12225DocDisID = new long[1] ;
      T01SH38_A12226LinDisID = new short[1] ;
      T01SH39_A396EmprCod = new String[] {""} ;
      T01SH39_A12225DocDisID = new long[1] ;
      T01SH40_A396EmprCod = new String[] {""} ;
      T01SH40_A12205OrdenCID = new long[1] ;
      T01SH40_A12206OrdenCLnId = new short[1] ;
      T01SH41_A396EmprCod = new String[] {""} ;
      T01SH41_A719PrdNum = new String[] {""} ;
      T01SH41_n719PrdNum = new boolean[] {false} ;
      T01SH41_A11664LoteID = new String[] {""} ;
      T01SH41_A11665LoteFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01SH42_A396EmprCod = new String[] {""} ;
      T01SH42_A4850DevComCod = new int[1] ;
      T01SH42_A719PrdNum = new String[] {""} ;
      T01SH42_n719PrdNum = new boolean[] {false} ;
      T01SH43_A396EmprCod = new String[] {""} ;
      T01SH43_A252CliCod = new int[1] ;
      T01SH43_A494ForSer = new String[] {""} ;
      T01SH43_A482ForColNom = new String[] {""} ;
      T01SH43_A483ForColNum = new int[1] ;
      T01SH43_A831TipColCod = new byte[1] ;
      T01SH43_A3571EnsCod = new String[] {""} ;
      T01SH43_A3582EnsLin = new short[1] ;
      T01SH44_A396EmprCod = new String[] {""} ;
      T01SH44_A129BarCod = new int[1] ;
      T01SH44_A132BarCodReo = new byte[1] ;
      T01SH44_A130BarCodPar = new String[] {""} ;
      T01SH44_A4075recestncol = new byte[1] ;
      T01SH44_A4076recestnpro = new byte[1] ;
      T01SH44_A4108recestlin = new short[1] ;
      T01SH45_A396EmprCod = new String[] {""} ;
      T01SH45_A4052EstNumFor = new int[1] ;
      T01SH45_A4053EstNumCol = new byte[1] ;
      T01SH45_A4090EstEspLin = new byte[1] ;
      T01SH46_A396EmprCod = new String[] {""} ;
      T01SH46_A4052EstNumFor = new int[1] ;
      T01SH46_A4053EstNumCol = new byte[1] ;
      T01SH46_A4084EstProLin = new byte[1] ;
      T01SH47_A396EmprCod = new String[] {""} ;
      T01SH47_A11644TransferId = new long[1] ;
      T01SH47_A11653TransferLn = new int[1] ;
      T01SH48_A396EmprCod = new String[] {""} ;
      T01SH48_A11634TaesId = new String[] {""} ;
      T01SH48_A11637TaesLn = new short[1] ;
      T01SH48_A11641TaesLnP = new short[1] ;
      T01SH49_A396EmprCod = new String[] {""} ;
      T01SH49_A719PrdNum = new String[] {""} ;
      T01SH49_n719PrdNum = new boolean[] {false} ;
      T01SH49_A11329H_stklin = new long[1] ;
      T01SH50_A396EmprCod = new String[] {""} ;
      T01SH50_A11270Pot_num = new int[1] ;
      T01SH50_A11271Pot_lin = new short[1] ;
      T01SH51_A396EmprCod = new String[] {""} ;
      T01SH51_A719PrdNum = new String[] {""} ;
      T01SH51_n719PrdNum = new boolean[] {false} ;
      T01SH51_A11199PrdNcasC = new String[] {""} ;
      T01SH52_A396EmprCod = new String[] {""} ;
      T01SH52_A719PrdNum = new String[] {""} ;
      T01SH52_n719PrdNum = new boolean[] {false} ;
      T01SH52_A11197CFraseR = new String[] {""} ;
      T01SH53_A396EmprCod = new String[] {""} ;
      T01SH53_A10243Jt_codigo = new short[1] ;
      T01SH53_A10246Jt_ord = new short[1] ;
      T01SH54_A396EmprCod = new String[] {""} ;
      T01SH54_A10236Bny_dia = new java.util.Date[] {GXutil.nullDate()} ;
      T01SH54_A10238Bny_lin = new short[1] ;
      T01SH55_A396EmprCod = new String[] {""} ;
      T01SH55_A129BarCod = new int[1] ;
      T01SH55_A132BarCodReo = new byte[1] ;
      T01SH55_A130BarCodPar = new String[] {""} ;
      T01SH55_A758ProCod = new String[] {""} ;
      T01SH55_A194BarOrdLin = new short[1] ;
      T01SH55_A719PrdNum = new String[] {""} ;
      T01SH55_n719PrdNum = new boolean[] {false} ;
      T01SH56_A396EmprCod = new String[] {""} ;
      T01SH56_A719PrdNum = new String[] {""} ;
      T01SH56_n719PrdNum = new boolean[] {false} ;
      T01SH56_A9735Cod_Rgo = new String[] {""} ;
      T01SH57_A396EmprCod = new String[] {""} ;
      T01SH57_A719PrdNum = new String[] {""} ;
      T01SH57_n719PrdNum = new boolean[] {false} ;
      T01SH57_A9711Ct_codigo = new short[1] ;
      T01SH58_A396EmprCod = new String[] {""} ;
      T01SH58_A9652OeNum = new long[1] ;
      T01SH58_A9653OeHdr = new int[1] ;
      T01SH58_A9654OeHdrr = new byte[1] ;
      T01SH58_A9655OeHdrp = new String[] {""} ;
      T01SH58_A9656OeLinC = new byte[1] ;
      T01SH58_A9657OeComb = new String[] {""} ;
      T01SH58_A9658Oefondo = new String[] {""} ;
      T01SH58_A9659OeMolCil = new byte[1] ;
      T01SH58_A9686OePasLin = new short[1] ;
      T01SH58_A9694OePasPLi = new short[1] ;
      T01SH59_A396EmprCod = new String[] {""} ;
      T01SH59_A9652OeNum = new long[1] ;
      T01SH59_A9653OeHdr = new int[1] ;
      T01SH59_A9654OeHdrr = new byte[1] ;
      T01SH59_A9655OeHdrp = new String[] {""} ;
      T01SH59_A9656OeLinC = new byte[1] ;
      T01SH59_A9657OeComb = new String[] {""} ;
      T01SH59_A9658Oefondo = new String[] {""} ;
      T01SH59_A9659OeMolCil = new byte[1] ;
      T01SH59_A9677OeMolLin = new byte[1] ;
      T01SH60_A396EmprCod = new String[] {""} ;
      T01SH60_A9578Pas_Num = new int[1] ;
      T01SH60_A719PrdNum = new String[] {""} ;
      T01SH60_n719PrdNum = new boolean[] {false} ;
      T01SH61_A396EmprCod = new String[] {""} ;
      T01SH61_A719PrdNum = new String[] {""} ;
      T01SH61_n719PrdNum = new boolean[] {false} ;
      T01SH61_A8908CC_AlmCod = new byte[1] ;
      T01SH62_A396EmprCod = new String[] {""} ;
      T01SH62_A719PrdNum = new String[] {""} ;
      T01SH62_n719PrdNum = new boolean[] {false} ;
      T01SH62_A8661Almc_Ln = new int[1] ;
      T01SH63_A396EmprCod = new String[] {""} ;
      T01SH63_A719PrdNum = new String[] {""} ;
      T01SH63_n719PrdNum = new boolean[] {false} ;
      T01SH63_A8648Mat_PrdN = new String[] {""} ;
      T01SH64_A396EmprCod = new String[] {""} ;
      T01SH64_A8585Pet_cod = new long[1] ;
      T01SH64_A719PrdNum = new String[] {""} ;
      T01SH64_n719PrdNum = new boolean[] {false} ;
      T01SH65_A396EmprCod = new String[] {""} ;
      T01SH65_A719PrdNum = new String[] {""} ;
      T01SH65_n719PrdNum = new boolean[] {false} ;
      T01SH65_A8577RecFecHr = new java.util.Date[] {GXutil.nullDate()} ;
      T01SH66_A396EmprCod = new String[] {""} ;
      T01SH66_A719PrdNum = new String[] {""} ;
      T01SH66_n719PrdNum = new boolean[] {false} ;
      T01SH66_A8366PrdAnyo = new short[1] ;
      T01SH66_A8360PrdProv = new int[1] ;
      T01SH67_A396EmprCod = new String[] {""} ;
      T01SH67_A252CliCod = new int[1] ;
      T01SH67_A494ForSer = new String[] {""} ;
      T01SH67_A482ForColNom = new String[] {""} ;
      T01SH67_A483ForColNum = new int[1] ;
      T01SH67_A831TipColCod = new byte[1] ;
      T01SH67_A7797Sim_lin = new short[1] ;
      T01SH68_A396EmprCod = new String[] {""} ;
      T01SH68_A7163Vir_Codigo = new int[1] ;
      T01SH68_A719PrdNum = new String[] {""} ;
      T01SH68_n719PrdNum = new boolean[] {false} ;
      T01SH69_A396EmprCod = new String[] {""} ;
      T01SH69_A6310Lb_TaAuxC = new String[] {""} ;
      T01SH69_A6313lb_TaAuxL = new short[1] ;
      T01SH69_A6378Lb_TauxLP = new short[1] ;
      T01SH70_A396EmprCod = new String[] {""} ;
      T01SH70_A6290PreCoNum = new int[1] ;
      T01SH70_A719PrdNum = new String[] {""} ;
      T01SH70_n719PrdNum = new boolean[] {false} ;
      T01SH71_A396EmprCod = new String[] {""} ;
      T01SH71_A719PrdNum = new String[] {""} ;
      T01SH71_n719PrdNum = new boolean[] {false} ;
      T01SH71_A6158PrdPrv = new int[1] ;
      T01SH72_A396EmprCod = new String[] {""} ;
      T01SH72_A719PrdNum = new String[] {""} ;
      T01SH72_n719PrdNum = new boolean[] {false} ;
      T01SH72_A5973PrdSusNum = new String[] {""} ;
      T01SH73_A396EmprCod = new String[] {""} ;
      T01SH73_A5612Lb_CodGru = new String[] {""} ;
      T01SH73_A5615Lb_LinGru = new short[1] ;
      T01SH74_A396EmprCod = new String[] {""} ;
      T01SH74_A5532Lb_numero = new int[1] ;
      T01SH74_A5555Lb_opcion = new String[] {""} ;
      T01SH74_A5560Lb_LineaPr = new short[1] ;
      T01SH75_A396EmprCod = new String[] {""} ;
      T01SH75_A5532Lb_numero = new int[1] ;
      T01SH75_A5555Lb_opcion = new String[] {""} ;
      T01SH75_A5557Lb_LineaC = new short[1] ;
      T01SH76_A396EmprCod = new String[] {""} ;
      T01SH76_A5145SobCod = new int[1] ;
      T01SH76_A719PrdNum = new String[] {""} ;
      T01SH76_n719PrdNum = new boolean[] {false} ;
      T01SH77_A396EmprCod = new String[] {""} ;
      T01SH77_A4744RecPreCod = new int[1] ;
      T01SH77_A4762RecPreLin = new short[1] ;
      T01SH77_A4763RecPreNli = new short[1] ;
      T01SH78_A396EmprCod = new String[] {""} ;
      T01SH78_A4492HreBarCod = new int[1] ;
      T01SH78_A4493HreBarReo = new byte[1] ;
      T01SH78_A4494HreBarPar = new String[] {""} ;
      T01SH78_A4495HreNumCie = new byte[1] ;
      T01SH78_A4545HreLinMaq = new short[1] ;
      T01SH78_A4550HreLinPro = new byte[1] ;
      T01SH78_A4557HreRecLin = new short[1] ;
      T01SH79_A396EmprCod = new String[] {""} ;
      T01SH79_A4492HreBarCod = new int[1] ;
      T01SH79_A4493HreBarReo = new byte[1] ;
      T01SH79_A4494HreBarPar = new String[] {""} ;
      T01SH79_A4495HreNumCie = new byte[1] ;
      T01SH79_A4508HreLinMAL = new short[1] ;
      T01SH79_A4509HreNumAny = new byte[1] ;
      T01SH79_A719PrdNum = new String[] {""} ;
      T01SH79_n719PrdNum = new boolean[] {false} ;
      T01SH80_A396EmprCod = new String[] {""} ;
      T01SH80_A252CliCod = new int[1] ;
      T01SH80_A4415EstCol = new String[] {""} ;
      T01SH80_A4416EstColLin = new short[1] ;
      T01SH81_A396EmprCod = new String[] {""} ;
      T01SH81_A129BarCod = new int[1] ;
      T01SH81_A132BarCodReo = new byte[1] ;
      T01SH81_A130BarCodPar = new String[] {""} ;
      T01SH81_A2524DisComLin = new byte[1] ;
      T01SH81_A1056DisComCod = new String[] {""} ;
      T01SH81_A1032FonCod = new String[] {""} ;
      T01SH81_A2124RecMolCod = new byte[1] ;
      T01SH81_A2672RecPasLin = new short[1] ;
      T01SH81_A2675RecPasPLi = new short[1] ;
      T01SH82_A396EmprCod = new String[] {""} ;
      T01SH82_A129BarCod = new int[1] ;
      T01SH82_A132BarCodReo = new byte[1] ;
      T01SH82_A130BarCodPar = new String[] {""} ;
      T01SH82_A2524DisComLin = new byte[1] ;
      T01SH82_A1056DisComCod = new String[] {""} ;
      T01SH82_A1032FonCod = new String[] {""} ;
      T01SH82_A2124RecMolCod = new byte[1] ;
      T01SH82_A2126RecMolLin = new byte[1] ;
      T01SH83_A396EmprCod = new String[] {""} ;
      T01SH83_A2107PasCod = new String[] {""} ;
      T01SH83_A719PrdNum = new String[] {""} ;
      T01SH83_n719PrdNum = new boolean[] {false} ;
      T01SH84_A396EmprCod = new String[] {""} ;
      T01SH84_A2637HisEstHRu = new int[1] ;
      T01SH84_A2636HisEstHRe = new byte[1] ;
      T01SH84_A2635HisEstHPa = new String[] {""} ;
      T01SH84_A2638HisEstLCo = new byte[1] ;
      T01SH84_A2630HisEstCom = new String[] {""} ;
      T01SH84_A2634HisEstFon = new String[] {""} ;
      T01SH84_A719PrdNum = new String[] {""} ;
      T01SH84_n719PrdNum = new boolean[] {false} ;
      T01SH85_A396EmprCod = new String[] {""} ;
      T01SH85_A252CliCod = new int[1] ;
      T01SH85_A2141SerEst = new String[] {""} ;
      T01SH85_A1013DibCli = new String[] {""} ;
      T01SH85_A1014DibInt = new int[1] ;
      T01SH85_A2074ColCom = new String[] {""} ;
      T01SH85_A2078ColFon = new String[] {""} ;
      T01SH85_A2098MolCod = new byte[1] ;
      T01SH85_A2535ForPrdLin = new short[1] ;
      T01SH86_A396EmprCod = new String[] {""} ;
      T01SH86_A719PrdNum = new String[] {""} ;
      T01SH86_n719PrdNum = new boolean[] {false} ;
      T01SH86_A3342CCStkLin = new long[1] ;
      T01SH87_A396EmprCod = new String[] {""} ;
      T01SH87_A252CliCod = new int[1] ;
      T01SH87_A2891HMaForSer = new String[] {""} ;
      T01SH87_A2892HMaForCNom = new String[] {""} ;
      T01SH87_A2893HMaForCNum = new int[1] ;
      T01SH87_A2894HMaTipCCod = new byte[1] ;
      T01SH87_A2895HMaForNumC = new int[1] ;
      T01SH87_A2897HMaColLin = new short[1] ;
      T01SH87_A2896HMaFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01SH87_A2907HmaLin = new short[1] ;
      T01SH88_A396EmprCod = new String[] {""} ;
      T01SH88_A129BarCod = new int[1] ;
      T01SH88_A132BarCodReo = new byte[1] ;
      T01SH88_A130BarCodPar = new String[] {""} ;
      T01SH88_A2808RecLinMAL = new short[1] ;
      T01SH88_A1377RecNumAny = new byte[1] ;
      T01SH88_A719PrdNum = new String[] {""} ;
      T01SH88_n719PrdNum = new boolean[] {false} ;
      T01SH89_A396EmprCod = new String[] {""} ;
      T01SH89_A129BarCod = new int[1] ;
      T01SH89_A132BarCodReo = new byte[1] ;
      T01SH89_A130BarCodPar = new String[] {""} ;
      T01SH89_A2804RecLinMaq = new short[1] ;
      T01SH89_A1273RecLinPro = new byte[1] ;
      T01SH89_A811RecLin = new short[1] ;
      T01SH90_A396EmprCod = new String[] {""} ;
      T01SH90_A129BarCod = new int[1] ;
      T01SH90_A132BarCodReo = new byte[1] ;
      T01SH90_A130BarCodPar = new String[] {""} ;
      T01SH90_A2494BarDosPro = new String[] {""} ;
      T01SH90_A719PrdNum = new String[] {""} ;
      T01SH90_n719PrdNum = new boolean[] {false} ;
      T01SH91_A396EmprCod = new String[] {""} ;
      T01SH91_A1314EnsLabCod = new int[1] ;
      T01SH91_A1317EnsLabLin = new short[1] ;
      T01SH92_A396EmprCod = new String[] {""} ;
      T01SH92_A910Workstat = new String[] {""} ;
      T01SH92_A887EscMLin = new int[1] ;
      T01SH93_A396EmprCod = new String[] {""} ;
      T01SH93_A859CumCodCont = new int[1] ;
      T01SH93_A719PrdNum = new String[] {""} ;
      T01SH93_n719PrdNum = new boolean[] {false} ;
      T01SH94_A396EmprCod = new String[] {""} ;
      T01SH94_A719PrdNum = new String[] {""} ;
      T01SH94_n719PrdNum = new boolean[] {false} ;
      T01SH94_A810RecFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01SH95_A396EmprCod = new String[] {""} ;
      T01SH95_A486ForNumCol = new int[1] ;
      T01SH95_A715PrdLin = new short[1] ;
      T01SH96_A396EmprCod = new String[] {""} ;
      T01SH96_A719PrdNum = new String[] {""} ;
      T01SH96_n719PrdNum = new boolean[] {false} ;
      T01SH96_A681PrdAny = new short[1] ;
      T01SH97_A396EmprCod = new String[] {""} ;
      T01SH97_A719PrdNum = new String[] {""} ;
      T01SH97_n719PrdNum = new boolean[] {false} ;
      T01SH97_A688PrdComCod = new String[] {""} ;
      T01SH98_A396EmprCod = new String[] {""} ;
      T01SH98_A719PrdNum = new String[] {""} ;
      T01SH98_n719PrdNum = new boolean[] {false} ;
      T01SH98_A680PrdAltNum = new String[] {""} ;
      T01SH99_A396EmprCod = new String[] {""} ;
      T01SH99_A658PedCod = new int[1] ;
      T01SH99_n658PedCod = new boolean[] {false} ;
      T01SH99_A719PrdNum = new String[] {""} ;
      T01SH99_n719PrdNum = new boolean[] {false} ;
      T01SH100_A396EmprCod = new String[] {""} ;
      T01SH100_A486ForNumCol = new int[1] ;
      T01SH100_A309ColLin = new short[1] ;
      T01SH101_A396EmprCod = new String[] {""} ;
      T01SH101_A719PrdNum = new String[] {""} ;
      T01SH101_n719PrdNum = new boolean[] {false} ;
      T01SH101_A647NumCon = new int[1] ;
      T01SH103_A396EmprCod = new String[] {""} ;
      T01SH103_A719PrdNum = new String[] {""} ;
      T01SH103_n719PrdNum = new boolean[] {false} ;
      Z661PedFec = GXutil.nullDate() ;
      Z667PedSit = "" ;
      Z666PedPri = "" ;
      Z657PedCanEnt = DecimalUtil.ZERO ;
      T01SH104_A597LinEnt = new short[1] ;
      T01SH104_A12716EntFabId = new int[1] ;
      T01SH104_A6156EntPrvNum = new int[1] ;
      T01SH104_n6156EntPrvNum = new boolean[] {false} ;
      T01SH104_A415EntFecEnt = new java.util.Date[] {GXutil.nullDate()} ;
      T01SH104_A10184EntRemTpo = new String[] {""} ;
      T01SH104_A3404EntPedCum = new String[] {""} ;
      T01SH104_A411EntCon = new byte[1] ;
      T01SH104_A657PedCanEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SH104_A663PedFulEnt = new java.util.Date[] {GXutil.nullDate()} ;
      T01SH104_A419EntUniRem = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SH104_A417EntPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SH104_A11Albaran = new String[] {""} ;
      T01SH104_A12857EntNAlbar = new String[] {""} ;
      T01SH104_A661PedFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01SH104_A418EntUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SH104_A665PedPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SH104_A669PedUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SH104_A416EntNumCon = new short[1] ;
      T01SH104_A5686EntLotN = new String[] {""} ;
      T01SH104_A5685EntFVal = new java.util.Date[] {GXutil.nullDate()} ;
      T01SH104_A414EntEti = new byte[1] ;
      T01SH104_A413EntConIni = new int[1] ;
      T01SH104_A412EntConFin = new int[1] ;
      T01SH104_A659PedCum = new String[] {""} ;
      T01SH104_A667PedSit = new String[] {""} ;
      T01SH104_A666PedPri = new String[] {""} ;
      T01SH104_A660PedDto = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SH104_A5691EntBnc = new String[] {""} ;
      T01SH104_A7695EntCC = new String[] {""} ;
      T01SH104_A7696EntCCoCod = new short[1] ;
      T01SH104_A10782EntUniAlb = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SH104_A10783EntObs = new String[] {""} ;
      T01SH104_A10187EntRemNro = new String[] {""} ;
      T01SH104_A10186EntRemFch = new java.util.Date[] {GXutil.nullDate()} ;
      T01SH104_A10185EntRemSuc = new String[] {""} ;
      T01SH104_A12580PedAlmc = new byte[1] ;
      T01SH104_A13235EntLoteID = new long[1] ;
      T01SH104_A13456EntUbicaci = new String[] {""} ;
      T01SH104_A5690EntHfCon = new java.util.Date[] {GXutil.nullDate()} ;
      T01SH104_A5689EntFfCon = new java.util.Date[] {GXutil.nullDate()} ;
      T01SH104_A5688EntHiCon = new java.util.Date[] {GXutil.nullDate()} ;
      T01SH104_A5687EntFiCon = new java.util.Date[] {GXutil.nullDate()} ;
      T01SH104_A14035EntNEmb = new byte[1] ;
      T01SH104_A396EmprCod = new String[] {""} ;
      T01SH104_A658PedCod = new int[1] ;
      T01SH104_n658PedCod = new boolean[] {false} ;
      T01SH104_A719PrdNum = new String[] {""} ;
      T01SH104_n719PrdNum = new boolean[] {false} ;
      T01SH4_A661PedFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01SH4_A667PedSit = new String[] {""} ;
      T01SH4_A666PedPri = new String[] {""} ;
      T01SH4_A12580PedAlmc = new byte[1] ;
      T01SH6_A657PedCanEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SH6_A663PedFulEnt = new java.util.Date[] {GXutil.nullDate()} ;
      T01SH6_A665PedPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SH6_A669PedUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SH6_A659PedCum = new String[] {""} ;
      T01SH6_A660PedDto = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SH105_A661PedFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01SH105_A667PedSit = new String[] {""} ;
      T01SH105_A666PedPri = new String[] {""} ;
      T01SH105_A12580PedAlmc = new byte[1] ;
      T01SH106_A396EmprCod = new String[] {""} ;
      T01SH106_A719PrdNum = new String[] {""} ;
      T01SH106_n719PrdNum = new boolean[] {false} ;
      T01SH106_A597LinEnt = new short[1] ;
      T01SH3_A597LinEnt = new short[1] ;
      T01SH3_A12716EntFabId = new int[1] ;
      T01SH3_A6156EntPrvNum = new int[1] ;
      T01SH3_n6156EntPrvNum = new boolean[] {false} ;
      T01SH3_A415EntFecEnt = new java.util.Date[] {GXutil.nullDate()} ;
      T01SH3_A10184EntRemTpo = new String[] {""} ;
      T01SH3_A3404EntPedCum = new String[] {""} ;
      T01SH3_A411EntCon = new byte[1] ;
      T01SH3_A419EntUniRem = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SH3_A417EntPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SH3_A11Albaran = new String[] {""} ;
      T01SH3_A12857EntNAlbar = new String[] {""} ;
      T01SH3_A418EntUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SH3_A416EntNumCon = new short[1] ;
      T01SH3_A5686EntLotN = new String[] {""} ;
      T01SH3_A5685EntFVal = new java.util.Date[] {GXutil.nullDate()} ;
      T01SH3_A414EntEti = new byte[1] ;
      T01SH3_A413EntConIni = new int[1] ;
      T01SH3_A412EntConFin = new int[1] ;
      T01SH3_A5691EntBnc = new String[] {""} ;
      T01SH3_A7695EntCC = new String[] {""} ;
      T01SH3_A7696EntCCoCod = new short[1] ;
      T01SH3_A10782EntUniAlb = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SH3_A10783EntObs = new String[] {""} ;
      T01SH3_A10187EntRemNro = new String[] {""} ;
      T01SH3_A10186EntRemFch = new java.util.Date[] {GXutil.nullDate()} ;
      T01SH3_A10185EntRemSuc = new String[] {""} ;
      T01SH3_A13235EntLoteID = new long[1] ;
      T01SH3_A13456EntUbicaci = new String[] {""} ;
      T01SH3_A5690EntHfCon = new java.util.Date[] {GXutil.nullDate()} ;
      T01SH3_A5689EntFfCon = new java.util.Date[] {GXutil.nullDate()} ;
      T01SH3_A5688EntHiCon = new java.util.Date[] {GXutil.nullDate()} ;
      T01SH3_A5687EntFiCon = new java.util.Date[] {GXutil.nullDate()} ;
      T01SH3_A14035EntNEmb = new byte[1] ;
      T01SH3_A396EmprCod = new String[] {""} ;
      T01SH3_A658PedCod = new int[1] ;
      T01SH3_n658PedCod = new boolean[] {false} ;
      T01SH3_A719PrdNum = new String[] {""} ;
      T01SH3_n719PrdNum = new boolean[] {false} ;
      T01SH2_A597LinEnt = new short[1] ;
      T01SH2_A12716EntFabId = new int[1] ;
      T01SH2_A6156EntPrvNum = new int[1] ;
      T01SH2_n6156EntPrvNum = new boolean[] {false} ;
      T01SH2_A415EntFecEnt = new java.util.Date[] {GXutil.nullDate()} ;
      T01SH2_A10184EntRemTpo = new String[] {""} ;
      T01SH2_A3404EntPedCum = new String[] {""} ;
      T01SH2_A411EntCon = new byte[1] ;
      T01SH2_A419EntUniRem = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SH2_A417EntPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SH2_A11Albaran = new String[] {""} ;
      T01SH2_A12857EntNAlbar = new String[] {""} ;
      T01SH2_A418EntUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SH2_A416EntNumCon = new short[1] ;
      T01SH2_A5686EntLotN = new String[] {""} ;
      T01SH2_A5685EntFVal = new java.util.Date[] {GXutil.nullDate()} ;
      T01SH2_A414EntEti = new byte[1] ;
      T01SH2_A413EntConIni = new int[1] ;
      T01SH2_A412EntConFin = new int[1] ;
      T01SH2_A5691EntBnc = new String[] {""} ;
      T01SH2_A7695EntCC = new String[] {""} ;
      T01SH2_A7696EntCCoCod = new short[1] ;
      T01SH2_A10782EntUniAlb = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SH2_A10783EntObs = new String[] {""} ;
      T01SH2_A10187EntRemNro = new String[] {""} ;
      T01SH2_A10186EntRemFch = new java.util.Date[] {GXutil.nullDate()} ;
      T01SH2_A10185EntRemSuc = new String[] {""} ;
      T01SH2_A13235EntLoteID = new long[1] ;
      T01SH2_A13456EntUbicaci = new String[] {""} ;
      T01SH2_A5690EntHfCon = new java.util.Date[] {GXutil.nullDate()} ;
      T01SH2_A5689EntFfCon = new java.util.Date[] {GXutil.nullDate()} ;
      T01SH2_A5688EntHiCon = new java.util.Date[] {GXutil.nullDate()} ;
      T01SH2_A5687EntFiCon = new java.util.Date[] {GXutil.nullDate()} ;
      T01SH2_A14035EntNEmb = new byte[1] ;
      T01SH2_A396EmprCod = new String[] {""} ;
      T01SH2_A658PedCod = new int[1] ;
      T01SH2_n658PedCod = new boolean[] {false} ;
      T01SH2_A719PrdNum = new String[] {""} ;
      T01SH2_n719PrdNum = new boolean[] {false} ;
      T01SH107_A657PedCanEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SH107_A663PedFulEnt = new java.util.Date[] {GXutil.nullDate()} ;
      T01SH107_A665PedPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SH107_A669PedUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SH107_A659PedCum = new String[] {""} ;
      T01SH107_A660PedDto = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SH111_A661PedFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01SH111_A667PedSit = new String[] {""} ;
      T01SH111_A666PedPri = new String[] {""} ;
      T01SH111_A12580PedAlmc = new byte[1] ;
      T01SH112_A657PedCanEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SH112_A663PedFulEnt = new java.util.Date[] {GXutil.nullDate()} ;
      T01SH112_A665PedPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SH112_A669PedUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SH112_A659PedCum = new String[] {""} ;
      T01SH112_A660PedDto = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SH114_A396EmprCod = new String[] {""} ;
      T01SH114_A719PrdNum = new String[] {""} ;
      T01SH114_n719PrdNum = new boolean[] {false} ;
      T01SH114_A597LinEnt = new short[1] ;
      Gridlevel_lineasRow = new com.genexus.webpanels.GXWebRow();
      subGridlevel_lineas_Linesclass = "" ;
      ROClassString = "" ;
      sImgUrl = "" ;
      imgprompt_6156_gximage = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      i415EntFecEnt = GXutil.nullDate() ;
      i10184EntRemTpo = "" ;
      Gridlevel_lineasColumn = new com.genexus.webpanels.GXWebColumn();
      GXv_int17 = new short[1] ;
      GXv_int14 = new short[1] ;
      GXv_int19 = new byte[1] ;
      GXv_int6 = new byte[1] ;
      GXv_date11 = new java.util.Date[1] ;
      GXv_decimal16 = new java.math.BigDecimal[1] ;
      GXv_int20 = new byte[1] ;
      GXv_char25 = new String[1] ;
      GXv_char23 = new String[1] ;
      GXv_char13 = new String[1] ;
      GXv_char4 = new String[1] ;
      GXv_decimal15 = new java.math.BigDecimal[1] ;
      GXv_decimal12 = new java.math.BigDecimal[1] ;
      GXv_int8 = new int[1] ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      GXv_char27 = new String[1] ;
      GXv_int24 = new int[1] ;
      GXv_char26 = new String[1] ;
      GXv_decimal28 = new java.math.BigDecimal[1] ;
      GXv_decimal21 = new java.math.BigDecimal[1] ;
      GXv_int18 = new short[1] ;
      GXt_date10 = GXutil.nullDate() ;
      GXv_date22 = new java.util.Date[1] ;
      Z14040PrdUltMovF = GXutil.nullDate() ;
      Z3835UltFecCCs = GXutil.nullDate() ;
      ZV40OldExiAlm = DecimalUtil.ZERO ;
      ZV23Fecha = GXutil.nullDate() ;
      ZV37oldEntFecent = GXutil.nullDate() ;
      ZV22FecAnt = GXutil.nullDate() ;
      ZV34msg_ctrl_fecha = "" ;
      ZO657PedCanEnt = DecimalUtil.ZERO ;
      ZV44PedPri = "" ;
      GXt_char1 = "" ;
      GXv_char31 = new String[1] ;
      GXv_int29 = new int[1] ;
      GXv_char30 = new String[1] ;
      ZV45PrdNomX = "" ;
      ZV39OldEntUni = DecimalUtil.ZERO ;
      ZV55UniOld = DecimalUtil.ZERO ;
      Z14041EntCump = "" ;
      ZV42OldRemanente = DecimalUtil.ZERO ;
      ZV38OldEntPre = DecimalUtil.ZERO ;
      ZV48PrecAnt = DecimalUtil.ZERO ;
      ZV41oldlote = "" ;
      E396EmprCod = "" ;
      T01SH115_A396EmprCod = new String[] {""} ;
      T01SH115_A658PedCod = new int[1] ;
      T01SH115_n658PedCod = new boolean[] {false} ;
      T01SH115_A719PrdNum = new String[] {""} ;
      T01SH115_n719PrdNum = new boolean[] {false} ;
      T01SH115_A659PedCum = new String[] {""} ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.entradaproducto__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.entradaproducto__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.entradaproducto__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.entradaproducto__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.entradaproducto__default(),
         new Object[] {
             new Object[] {
            T01SH2_A597LinEnt, T01SH2_A12716EntFabId, T01SH2_A6156EntPrvNum, T01SH2_n6156EntPrvNum, T01SH2_A415EntFecEnt, T01SH2_A10184EntRemTpo, T01SH2_A3404EntPedCum, T01SH2_A411EntCon, T01SH2_A419EntUniRem, T01SH2_A417EntPre,
            T01SH2_A11Albaran, T01SH2_A12857EntNAlbar, T01SH2_A418EntUniEnt, T01SH2_A416EntNumCon, T01SH2_A5686EntLotN, T01SH2_A5685EntFVal, T01SH2_A414EntEti, T01SH2_A413EntConIni, T01SH2_A412EntConFin, T01SH2_A5691EntBnc,
            T01SH2_A7695EntCC, T01SH2_A7696EntCCoCod, T01SH2_A10782EntUniAlb, T01SH2_A10783EntObs, T01SH2_A10187EntRemNro, T01SH2_A10186EntRemFch, T01SH2_A10185EntRemSuc, T01SH2_A13235EntLoteID, T01SH2_A13456EntUbicaci, T01SH2_A5690EntHfCon,
            T01SH2_A5689EntFfCon, T01SH2_A5688EntHiCon, T01SH2_A5687EntFiCon, T01SH2_A14035EntNEmb, T01SH2_A396EmprCod, T01SH2_A658PedCod, T01SH2_n658PedCod, T01SH2_A719PrdNum
            }
            , new Object[] {
            T01SH3_A597LinEnt, T01SH3_A12716EntFabId, T01SH3_A6156EntPrvNum, T01SH3_n6156EntPrvNum, T01SH3_A415EntFecEnt, T01SH3_A10184EntRemTpo, T01SH3_A3404EntPedCum, T01SH3_A411EntCon, T01SH3_A419EntUniRem, T01SH3_A417EntPre,
            T01SH3_A11Albaran, T01SH3_A12857EntNAlbar, T01SH3_A418EntUniEnt, T01SH3_A416EntNumCon, T01SH3_A5686EntLotN, T01SH3_A5685EntFVal, T01SH3_A414EntEti, T01SH3_A413EntConIni, T01SH3_A412EntConFin, T01SH3_A5691EntBnc,
            T01SH3_A7695EntCC, T01SH3_A7696EntCCoCod, T01SH3_A10782EntUniAlb, T01SH3_A10783EntObs, T01SH3_A10187EntRemNro, T01SH3_A10186EntRemFch, T01SH3_A10185EntRemSuc, T01SH3_A13235EntLoteID, T01SH3_A13456EntUbicaci, T01SH3_A5690EntHfCon,
            T01SH3_A5689EntFfCon, T01SH3_A5688EntHiCon, T01SH3_A5687EntFiCon, T01SH3_A14035EntNEmb, T01SH3_A396EmprCod, T01SH3_A658PedCod, T01SH3_n658PedCod, T01SH3_A719PrdNum
            }
            , new Object[] {
            T01SH4_A661PedFec, T01SH4_A667PedSit, T01SH4_A666PedPri, T01SH4_A12580PedAlmc
            }
            , new Object[] {
            T01SH5_A657PedCanEnt, T01SH5_A663PedFulEnt, T01SH5_A665PedPre, T01SH5_A669PedUni, T01SH5_A659PedCum, T01SH5_A660PedDto
            }
            , new Object[] {
            T01SH6_A657PedCanEnt, T01SH6_A663PedFulEnt, T01SH6_A665PedPre, T01SH6_A669PedUni, T01SH6_A659PedCum, T01SH6_A660PedDto
            }
            , new Object[] {
            T01SH8_A913StockRem, T01SH8_n913StockRem
            }
            , new Object[] {
            T01SH9_A719PrdNum, T01SH9_A726PrdPreMed, T01SH9_A725PrdPreAnt, T01SH9_A718PrdNom, T01SH9_A724PrdPreAct, T01SH9_A704PrdExiAlm, T01SH9_A847UltLinEnt, T01SH9_A698PrdDetPar, T01SH9_A713PrdFulEnt, T01SH9_A684PrdCanPen,
            T01SH9_A729PrdRotRea, T01SH9_A727PrdRec, T01SH9_A709PrdFecPre, T01SH9_A5255PrdPreAc2, T01SH9_A750PrdValStk, T01SH9_A705PrdExiCC, T01SH9_A396EmprCod, T01SH9_A795PrvNum, T01SH9_A856ValCod
            }
            , new Object[] {
            T01SH10_A719PrdNum, T01SH10_A726PrdPreMed, T01SH10_A725PrdPreAnt, T01SH10_A718PrdNom, T01SH10_A724PrdPreAct, T01SH10_A704PrdExiAlm, T01SH10_A847UltLinEnt, T01SH10_A698PrdDetPar, T01SH10_A713PrdFulEnt, T01SH10_A684PrdCanPen,
            T01SH10_A729PrdRotRea, T01SH10_A727PrdRec, T01SH10_A709PrdFecPre, T01SH10_A5255PrdPreAc2, T01SH10_A750PrdValStk, T01SH10_A705PrdExiCC, T01SH10_A396EmprCod, T01SH10_A795PrvNum, T01SH10_A856ValCod
            }
            , new Object[] {
            T01SH11_A407EmprNom, T01SH11_n407EmprNom, T01SH11_A3915EmpNumDec, T01SH11_n3915EmpNumDec
            }
            , new Object[] {
            T01SH12_A794PrvNom, T01SH12_n794PrvNom, T01SH12_A800PrvPri, T01SH12_n800PrvPri
            }
            , new Object[] {
            T01SH13_A396EmprCod
            }
            , new Object[] {
            T01SH15_A719PrdNum, T01SH15_A726PrdPreMed, T01SH15_A725PrdPreAnt, T01SH15_A718PrdNom, T01SH15_A794PrvNom, T01SH15_n794PrvNom, T01SH15_A724PrdPreAct, T01SH15_A704PrdExiAlm, T01SH15_A847UltLinEnt, T01SH15_A698PrdDetPar,
            T01SH15_A713PrdFulEnt, T01SH15_A684PrdCanPen, T01SH15_A729PrdRotRea, T01SH15_A727PrdRec, T01SH15_A709PrdFecPre, T01SH15_A407EmprNom, T01SH15_n407EmprNom, T01SH15_A800PrvPri, T01SH15_n800PrvPri, T01SH15_A3915EmpNumDec,
            T01SH15_n3915EmpNumDec, T01SH15_A5255PrdPreAc2, T01SH15_A750PrdValStk, T01SH15_A705PrdExiCC, T01SH15_A396EmprCod, T01SH15_A795PrvNum, T01SH15_A856ValCod, T01SH15_A913StockRem, T01SH15_n913StockRem
            }
            , new Object[] {
            T01SH16_A794PrvNom, T01SH16_n794PrvNom, T01SH16_A800PrvPri, T01SH16_n800PrvPri
            }
            , new Object[] {
            T01SH17_A396EmprCod
            }
            , new Object[] {
            T01SH19_A913StockRem, T01SH19_n913StockRem
            }
            , new Object[] {
            T01SH20_A396EmprCod, T01SH20_A719PrdNum
            }
            , new Object[] {
            T01SH21_A396EmprCod, T01SH21_A719PrdNum
            }
            , new Object[] {
            T01SH22_A396EmprCod, T01SH22_A719PrdNum
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01SH26_A794PrvNom, T01SH26_n794PrvNom, T01SH26_A800PrvPri, T01SH26_n800PrvPri
            }
            , new Object[] {
            T01SH28_A913StockRem, T01SH28_n913StockRem
            }
            , new Object[] {
            T01SH29_A396EmprCod, T01SH29_A719PrdNum, T01SH29_A13217NormaID
            }
            , new Object[] {
            T01SH30_A396EmprCod, T01SH30_A719PrdNum, T01SH30_A13586TheList
            }
            , new Object[] {
            T01SH31_A396EmprCod, T01SH31_A5532Lb_numero, T01SH31_A5555Lb_opcion, T01SH31_A13460Lb_linCP, T01SH31_A13458Lb_TipCP
            }
            , new Object[] {
            T01SH32_A396EmprCod, T01SH32_A13418AlbProID, T01SH32_A13442AlbProLine
            }
            , new Object[] {
            T01SH33_A396EmprCod, T01SH33_A13324LDESID, T01SH33_A13333LDESNPeque, T01SH33_A13337LDESComb, T01SH33_A13339LDESFondo, T01SH33_A13342LDESLinea
            }
            , new Object[] {
            T01SH34_A396EmprCod, T01SH34_A13312Lb_NLab, T01SH34_A13305Lb_IDVeces, T01SH34_A13306Lb_LinID
            }
            , new Object[] {
            T01SH35_A396EmprCod, T01SH35_A12673LavMqId, T01SH35_A12692LavMqLnPq, T01SH35_A12681LavMqLn
            }
            , new Object[] {
            T01SH36_A396EmprCod, T01SH36_A719PrdNum, T01SH36_A9713Tb1_Cod
            }
            , new Object[] {
            T01SH37_A396EmprCod, T01SH37_A12236PrdNumD, T01SH37_A719PrdNum
            }
            , new Object[] {
            T01SH38_A396EmprCod, T01SH38_A12225DocDisID, T01SH38_A12226LinDisID
            }
            , new Object[] {
            T01SH39_A396EmprCod, T01SH39_A12225DocDisID
            }
            , new Object[] {
            T01SH40_A396EmprCod, T01SH40_A12205OrdenCID, T01SH40_A12206OrdenCLnId
            }
            , new Object[] {
            T01SH41_A396EmprCod, T01SH41_A719PrdNum, T01SH41_A11664LoteID, T01SH41_A11665LoteFec
            }
            , new Object[] {
            T01SH42_A396EmprCod, T01SH42_A4850DevComCod, T01SH42_A719PrdNum
            }
            , new Object[] {
            T01SH43_A396EmprCod, T01SH43_A252CliCod, T01SH43_A494ForSer, T01SH43_A482ForColNom, T01SH43_A483ForColNum, T01SH43_A831TipColCod, T01SH43_A3571EnsCod, T01SH43_A3582EnsLin
            }
            , new Object[] {
            T01SH44_A396EmprCod, T01SH44_A129BarCod, T01SH44_A132BarCodReo, T01SH44_A130BarCodPar, T01SH44_A4075recestncol, T01SH44_A4076recestnpro, T01SH44_A4108recestlin
            }
            , new Object[] {
            T01SH45_A396EmprCod, T01SH45_A4052EstNumFor, T01SH45_A4053EstNumCol, T01SH45_A4090EstEspLin
            }
            , new Object[] {
            T01SH46_A396EmprCod, T01SH46_A4052EstNumFor, T01SH46_A4053EstNumCol, T01SH46_A4084EstProLin
            }
            , new Object[] {
            T01SH47_A396EmprCod, T01SH47_A11644TransferId, T01SH47_A11653TransferLn
            }
            , new Object[] {
            T01SH48_A396EmprCod, T01SH48_A11634TaesId, T01SH48_A11637TaesLn, T01SH48_A11641TaesLnP
            }
            , new Object[] {
            T01SH49_A396EmprCod, T01SH49_A719PrdNum, T01SH49_A11329H_stklin
            }
            , new Object[] {
            T01SH50_A396EmprCod, T01SH50_A11270Pot_num, T01SH50_A11271Pot_lin
            }
            , new Object[] {
            T01SH51_A396EmprCod, T01SH51_A719PrdNum, T01SH51_A11199PrdNcasC
            }
            , new Object[] {
            T01SH52_A396EmprCod, T01SH52_A719PrdNum, T01SH52_A11197CFraseR
            }
            , new Object[] {
            T01SH53_A396EmprCod, T01SH53_A10243Jt_codigo, T01SH53_A10246Jt_ord
            }
            , new Object[] {
            T01SH54_A396EmprCod, T01SH54_A10236Bny_dia, T01SH54_A10238Bny_lin
            }
            , new Object[] {
            T01SH55_A396EmprCod, T01SH55_A129BarCod, T01SH55_A132BarCodReo, T01SH55_A130BarCodPar, T01SH55_A758ProCod, T01SH55_A194BarOrdLin, T01SH55_A719PrdNum
            }
            , new Object[] {
            T01SH56_A396EmprCod, T01SH56_A719PrdNum, T01SH56_A9735Cod_Rgo
            }
            , new Object[] {
            T01SH57_A396EmprCod, T01SH57_A719PrdNum, T01SH57_A9711Ct_codigo
            }
            , new Object[] {
            T01SH58_A396EmprCod, T01SH58_A9652OeNum, T01SH58_A9653OeHdr, T01SH58_A9654OeHdrr, T01SH58_A9655OeHdrp, T01SH58_A9656OeLinC, T01SH58_A9657OeComb, T01SH58_A9658Oefondo, T01SH58_A9659OeMolCil, T01SH58_A9686OePasLin,
            T01SH58_A9694OePasPLi
            }
            , new Object[] {
            T01SH59_A396EmprCod, T01SH59_A9652OeNum, T01SH59_A9653OeHdr, T01SH59_A9654OeHdrr, T01SH59_A9655OeHdrp, T01SH59_A9656OeLinC, T01SH59_A9657OeComb, T01SH59_A9658Oefondo, T01SH59_A9659OeMolCil, T01SH59_A9677OeMolLin
            }
            , new Object[] {
            T01SH60_A396EmprCod, T01SH60_A9578Pas_Num, T01SH60_A719PrdNum
            }
            , new Object[] {
            T01SH61_A396EmprCod, T01SH61_A719PrdNum, T01SH61_A8908CC_AlmCod
            }
            , new Object[] {
            T01SH62_A396EmprCod, T01SH62_A719PrdNum, T01SH62_A8661Almc_Ln
            }
            , new Object[] {
            T01SH63_A396EmprCod, T01SH63_A719PrdNum, T01SH63_A8648Mat_PrdN
            }
            , new Object[] {
            T01SH64_A396EmprCod, T01SH64_A8585Pet_cod, T01SH64_A719PrdNum
            }
            , new Object[] {
            T01SH65_A396EmprCod, T01SH65_A719PrdNum, T01SH65_A8577RecFecHr
            }
            , new Object[] {
            T01SH66_A396EmprCod, T01SH66_A719PrdNum, T01SH66_A8366PrdAnyo, T01SH66_A8360PrdProv
            }
            , new Object[] {
            T01SH67_A396EmprCod, T01SH67_A252CliCod, T01SH67_A494ForSer, T01SH67_A482ForColNom, T01SH67_A483ForColNum, T01SH67_A831TipColCod, T01SH67_A7797Sim_lin
            }
            , new Object[] {
            T01SH68_A396EmprCod, T01SH68_A7163Vir_Codigo, T01SH68_A719PrdNum
            }
            , new Object[] {
            T01SH69_A396EmprCod, T01SH69_A6310Lb_TaAuxC, T01SH69_A6313lb_TaAuxL, T01SH69_A6378Lb_TauxLP
            }
            , new Object[] {
            T01SH70_A396EmprCod, T01SH70_A6290PreCoNum, T01SH70_A719PrdNum
            }
            , new Object[] {
            T01SH71_A396EmprCod, T01SH71_A719PrdNum, T01SH71_A6158PrdPrv
            }
            , new Object[] {
            T01SH72_A396EmprCod, T01SH72_A719PrdNum, T01SH72_A5973PrdSusNum
            }
            , new Object[] {
            T01SH73_A396EmprCod, T01SH73_A5612Lb_CodGru, T01SH73_A5615Lb_LinGru
            }
            , new Object[] {
            T01SH74_A396EmprCod, T01SH74_A5532Lb_numero, T01SH74_A5555Lb_opcion, T01SH74_A5560Lb_LineaPr
            }
            , new Object[] {
            T01SH75_A396EmprCod, T01SH75_A5532Lb_numero, T01SH75_A5555Lb_opcion, T01SH75_A5557Lb_LineaC
            }
            , new Object[] {
            T01SH76_A396EmprCod, T01SH76_A5145SobCod, T01SH76_A719PrdNum
            }
            , new Object[] {
            T01SH77_A396EmprCod, T01SH77_A4744RecPreCod, T01SH77_A4762RecPreLin, T01SH77_A4763RecPreNli
            }
            , new Object[] {
            T01SH78_A396EmprCod, T01SH78_A4492HreBarCod, T01SH78_A4493HreBarReo, T01SH78_A4494HreBarPar, T01SH78_A4495HreNumCie, T01SH78_A4545HreLinMaq, T01SH78_A4550HreLinPro, T01SH78_A4557HreRecLin
            }
            , new Object[] {
            T01SH79_A396EmprCod, T01SH79_A4492HreBarCod, T01SH79_A4493HreBarReo, T01SH79_A4494HreBarPar, T01SH79_A4495HreNumCie, T01SH79_A4508HreLinMAL, T01SH79_A4509HreNumAny, T01SH79_A719PrdNum
            }
            , new Object[] {
            T01SH80_A396EmprCod, T01SH80_A252CliCod, T01SH80_A4415EstCol, T01SH80_A4416EstColLin
            }
            , new Object[] {
            T01SH81_A396EmprCod, T01SH81_A129BarCod, T01SH81_A132BarCodReo, T01SH81_A130BarCodPar, T01SH81_A2524DisComLin, T01SH81_A1056DisComCod, T01SH81_A1032FonCod, T01SH81_A2124RecMolCod, T01SH81_A2672RecPasLin, T01SH81_A2675RecPasPLi
            }
            , new Object[] {
            T01SH82_A396EmprCod, T01SH82_A129BarCod, T01SH82_A132BarCodReo, T01SH82_A130BarCodPar, T01SH82_A2524DisComLin, T01SH82_A1056DisComCod, T01SH82_A1032FonCod, T01SH82_A2124RecMolCod, T01SH82_A2126RecMolLin
            }
            , new Object[] {
            T01SH83_A396EmprCod, T01SH83_A2107PasCod, T01SH83_A719PrdNum
            }
            , new Object[] {
            T01SH84_A396EmprCod, T01SH84_A2637HisEstHRu, T01SH84_A2636HisEstHRe, T01SH84_A2635HisEstHPa, T01SH84_A2638HisEstLCo, T01SH84_A2630HisEstCom, T01SH84_A2634HisEstFon, T01SH84_A719PrdNum
            }
            , new Object[] {
            T01SH85_A396EmprCod, T01SH85_A252CliCod, T01SH85_A2141SerEst, T01SH85_A1013DibCli, T01SH85_A1014DibInt, T01SH85_A2074ColCom, T01SH85_A2078ColFon, T01SH85_A2098MolCod, T01SH85_A2535ForPrdLin
            }
            , new Object[] {
            T01SH86_A396EmprCod, T01SH86_A719PrdNum, T01SH86_A3342CCStkLin
            }
            , new Object[] {
            T01SH87_A396EmprCod, T01SH87_A252CliCod, T01SH87_A2891HMaForSer, T01SH87_A2892HMaForCNom, T01SH87_A2893HMaForCNum, T01SH87_A2894HMaTipCCod, T01SH87_A2895HMaForNumC, T01SH87_A2897HMaColLin, T01SH87_A2896HMaFec, T01SH87_A2907HmaLin
            }
            , new Object[] {
            T01SH88_A396EmprCod, T01SH88_A129BarCod, T01SH88_A132BarCodReo, T01SH88_A130BarCodPar, T01SH88_A2808RecLinMAL, T01SH88_A1377RecNumAny, T01SH88_A719PrdNum
            }
            , new Object[] {
            T01SH89_A396EmprCod, T01SH89_A129BarCod, T01SH89_A132BarCodReo, T01SH89_A130BarCodPar, T01SH89_A2804RecLinMaq, T01SH89_A1273RecLinPro, T01SH89_A811RecLin
            }
            , new Object[] {
            T01SH90_A396EmprCod, T01SH90_A129BarCod, T01SH90_A132BarCodReo, T01SH90_A130BarCodPar, T01SH90_A2494BarDosPro, T01SH90_A719PrdNum
            }
            , new Object[] {
            T01SH91_A396EmprCod, T01SH91_A1314EnsLabCod, T01SH91_A1317EnsLabLin
            }
            , new Object[] {
            T01SH92_A396EmprCod, T01SH92_A910Workstat, T01SH92_A887EscMLin
            }
            , new Object[] {
            T01SH93_A396EmprCod, T01SH93_A859CumCodCont, T01SH93_A719PrdNum
            }
            , new Object[] {
            T01SH94_A396EmprCod, T01SH94_A719PrdNum, T01SH94_A810RecFec
            }
            , new Object[] {
            T01SH95_A396EmprCod, T01SH95_A486ForNumCol, T01SH95_A715PrdLin
            }
            , new Object[] {
            T01SH96_A396EmprCod, T01SH96_A719PrdNum, T01SH96_A681PrdAny
            }
            , new Object[] {
            T01SH97_A396EmprCod, T01SH97_A719PrdNum, T01SH97_A688PrdComCod
            }
            , new Object[] {
            T01SH98_A396EmprCod, T01SH98_A719PrdNum, T01SH98_A680PrdAltNum
            }
            , new Object[] {
            T01SH99_A396EmprCod, T01SH99_A658PedCod, T01SH99_A719PrdNum
            }
            , new Object[] {
            T01SH100_A396EmprCod, T01SH100_A486ForNumCol, T01SH100_A309ColLin
            }
            , new Object[] {
            T01SH101_A396EmprCod, T01SH101_A719PrdNum, T01SH101_A647NumCon
            }
            , new Object[] {
            }
            , new Object[] {
            T01SH103_A396EmprCod, T01SH103_A719PrdNum
            }
            , new Object[] {
            T01SH104_A597LinEnt, T01SH104_A12716EntFabId, T01SH104_A6156EntPrvNum, T01SH104_n6156EntPrvNum, T01SH104_A415EntFecEnt, T01SH104_A10184EntRemTpo, T01SH104_A3404EntPedCum, T01SH104_A411EntCon, T01SH104_A657PedCanEnt, T01SH104_A663PedFulEnt,
            T01SH104_A419EntUniRem, T01SH104_A417EntPre, T01SH104_A11Albaran, T01SH104_A12857EntNAlbar, T01SH104_A661PedFec, T01SH104_A418EntUniEnt, T01SH104_A665PedPre, T01SH104_A669PedUni, T01SH104_A416EntNumCon, T01SH104_A5686EntLotN,
            T01SH104_A5685EntFVal, T01SH104_A414EntEti, T01SH104_A413EntConIni, T01SH104_A412EntConFin, T01SH104_A659PedCum, T01SH104_A667PedSit, T01SH104_A666PedPri, T01SH104_A660PedDto, T01SH104_A5691EntBnc, T01SH104_A7695EntCC,
            T01SH104_A7696EntCCoCod, T01SH104_A10782EntUniAlb, T01SH104_A10783EntObs, T01SH104_A10187EntRemNro, T01SH104_A10186EntRemFch, T01SH104_A10185EntRemSuc, T01SH104_A12580PedAlmc, T01SH104_A13235EntLoteID, T01SH104_A13456EntUbicaci, T01SH104_A5690EntHfCon,
            T01SH104_A5689EntFfCon, T01SH104_A5688EntHiCon, T01SH104_A5687EntFiCon, T01SH104_A14035EntNEmb, T01SH104_A396EmprCod, T01SH104_A658PedCod, T01SH104_n658PedCod, T01SH104_A719PrdNum
            }
            , new Object[] {
            T01SH105_A661PedFec, T01SH105_A667PedSit, T01SH105_A666PedPri, T01SH105_A12580PedAlmc
            }
            , new Object[] {
            T01SH106_A396EmprCod, T01SH106_A719PrdNum, T01SH106_A597LinEnt
            }
            , new Object[] {
            T01SH107_A657PedCanEnt, T01SH107_A663PedFulEnt, T01SH107_A665PedPre, T01SH107_A669PedUni, T01SH107_A659PedCum, T01SH107_A660PedDto
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01SH111_A661PedFec, T01SH111_A667PedSit, T01SH111_A666PedPri, T01SH111_A12580PedAlmc
            }
            , new Object[] {
            T01SH112_A657PedCanEnt, T01SH112_A663PedFulEnt, T01SH112_A665PedPre, T01SH112_A669PedUni, T01SH112_A659PedCum, T01SH112_A660PedDto
            }
            , new Object[] {
            }
            , new Object[] {
            T01SH114_A396EmprCod, T01SH114_A719PrdNum, T01SH114_A597LinEnt
            }
            , new Object[] {
            T01SH115_A396EmprCod, T01SH115_A658PedCod, T01SH115_A719PrdNum, T01SH115_A659PedCum
            }
         }
      );
      Gx_date = GXutil.today( ) ;
      AV62Pgmname = "EntradaProducto" ;
      Z411EntCon = (byte)(0) ;
      A411EntCon = (byte)(0) ;
      i411EntCon = (byte)(0) ;
      Z3404EntPedCum = httpContext.getMessage( "N", "") ;
      O3404EntPedCum = httpContext.getMessage( "N", "") ;
      N3404EntPedCum = httpContext.getMessage( "N", "") ;
      A3404EntPedCum = httpContext.getMessage( "N", "") ;
      T3404EntPedCum = httpContext.getMessage( "N", "") ;
      Z10184EntRemTpo = " " ;
      A10184EntRemTpo = " " ;
      i10184EntRemTpo = " " ;
      Z415EntFecEnt = GXutil.today( ) ;
      O415EntFecEnt = GXutil.today( ) ;
      N415EntFecEnt = GXutil.today( ) ;
      T415EntFecEnt = GXutil.today( ) ;
      i415EntFecEnt = GXutil.today( ) ;
      A415EntFecEnt = GXutil.today( ) ;
      Z6156EntPrvNum = 0 ;
      n6156EntPrvNum = false ;
      N6156EntPrvNum = 0 ;
      n6156EntPrvNum = false ;
      i6156EntPrvNum = 0 ;
      n6156EntPrvNum = false ;
      A6156EntPrvNum = 0 ;
      n6156EntPrvNum = false ;
      Z12716EntFabId = 0 ;
      A12716EntFabId = 0 ;
   }

   private byte Z856ValCod ;
   private byte N856ValCod ;
   private byte Z411EntCon ;
   private byte Z414EntEti ;
   private byte Z14035EntNEmb ;
   private byte GxWebError ;
   private byte A856ValCod ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte AV28Insert_ValCod ;
   private byte A800PrvPri ;
   private byte A3915EmpNumDec ;
   private byte A411EntCon ;
   private byte AV30Mes ;
   private byte AV31MesAnt ;
   private byte A414EntEti ;
   private byte A12580PedAlmc ;
   private byte A14035EntNEmb ;
   private byte Z3915EmpNumDec ;
   private byte Z800PrvPri ;
   private byte Z12580PedAlmc ;
   private byte subGridlevel_lineas_Backcolorstyle ;
   private byte subGridlevel_lineas_Backstyle ;
   private byte gxajaxcallmode ;
   private byte i411EntCon ;
   private byte subGridlevel_lineas_Allowselection ;
   private byte subGridlevel_lineas_Allowhovering ;
   private byte subGridlevel_lineas_Allowcollapsing ;
   private byte subGridlevel_lineas_Collapsed ;
   private byte GXt_int5 ;
   private byte GXv_int19[] ;
   private byte GXv_int6[] ;
   private byte GXv_int20[] ;
   private byte ZV30Mes ;
   private byte ZV31MesAnt ;
   private short nIsMod_42 ;
   private short Z847UltLinEnt ;
   private short O847UltLinEnt ;
   private short Z597LinEnt ;
   private short Z416EntNumCon ;
   private short Z7696EntCCoCod ;
   private short nRcdDeleted_42 ;
   private short nRcdExists_42 ;
   private short A597LinEnt ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A847UltLinEnt ;
   private short nBlankRcdCount42 ;
   private short RcdFound42 ;
   private short B847UltLinEnt ;
   private short nBlankRcdUsr42 ;
   private short AV14Consumos ;
   private short AV36NoUpd ;
   private short AV59Year ;
   private short AV12AnyAnt ;
   private short AV17DiasFin ;
   private short A664PedNumLin ;
   private short AV35Nalbaran20 ;
   private short AV60FlagPre ;
   private short AV25FlagFecCcs ;
   private short A416EntNumCon ;
   private short A7696EntCCoCod ;
   private short RcdFound29 ;
   private short s847UltLinEnt ;
   private short nIsDirty_29 ;
   private short nIsDirty_42 ;
   private short i847UltLinEnt ;
   private short GXv_int17[] ;
   private short GXv_int14[] ;
   private short GXv_int18[] ;
   private short ZV59Year ;
   private short ZV12AnyAnt ;
   private short ZV17DiasFin ;
   private short Z664PedNumLin ;
   private int Z795PrvNum ;
   private int nRC_GXsfl_40 ;
   private int nGXsfl_40_idx=1 ;
   private int N795PrvNum ;
   private int Z12716EntFabId ;
   private int Z6156EntPrvNum ;
   private int Z413EntConIni ;
   private int Z412EntConFin ;
   private int Z658PedCod ;
   private int N6156EntPrvNum ;
   private int A6156EntPrvNum ;
   private int A658PedCod ;
   private int A795PrvNum ;
   private int trnEnded ;
   private int edtPrdNum_Enabled ;
   private int edtPrdNom_Enabled ;
   private int edtPrdExiAlm_Enabled ;
   private int edtPrdUltMovF_Enabled ;
   private int bttBtntrn_enter_Visible ;
   private int bttBtntrn_enter_Enabled ;
   private int bttBtntrn_cancel_Visible ;
   private int bttBtntrn_delete_Visible ;
   private int bttBtntrn_delete_Enabled ;
   private int edtavPgmname_Enabled ;
   private int edtLinEnt_Enabled ;
   private int edtEntFecEnt_Enabled ;
   private int edtAlbaran_Enabled ;
   private int edtAlbaran_Visible ;
   private int edtEntNAlbar_Enabled ;
   private int edtEntNAlbar_Visible ;
   private int edtPedCod_Enabled ;
   private int edtavPedcodprompt_Enabled ;
   private int edtavPedcodprompt_Visible ;
   private int edtEntNEmb_Enabled ;
   private int edtEntNEmb_Visible ;
   private int edtEntPrvNum_Enabled ;
   private int edtEntUniEnt_Enabled ;
   private int edtEntCump_Enabled ;
   private int edtEntPre_Enabled ;
   private int edtEntUniRem_Enabled ;
   private int edtEntLotN_Enabled ;
   private int edtEntFVal_Enabled ;
   private int fRowAdded ;
   private int AV27Insert_PrvNum ;
   private int A12716EntFabId ;
   private int A413EntConIni ;
   private int A412EntConFin ;
   private int GXt_int7 ;
   private int AV64GXV1 ;
   private int GX_JID ;
   private int subGridlevel_lineas_Backcolor ;
   private int subGridlevel_lineas_Allbackcolor ;
   private int imgprompt_6156_Visible ;
   private int defedtEntFVal_Enabled ;
   private int defedtEntLotN_Enabled ;
   private int defedtEntUniRem_Enabled ;
   private int defedtEntPre_Enabled ;
   private int defcmbEntPedCum_Enabled ;
   private int defedtEntCump_Enabled ;
   private int defedtEntUniEnt_Enabled ;
   private int defedtEntPrvNum_Enabled ;
   private int defedtEntNAlbar_Enabled ;
   private int defedtAlbaran_Enabled ;
   private int defedtEntFecEnt_Enabled ;
   private int defedtLinEnt_Enabled ;
   private int i6156EntPrvNum ;
   private int idxLst ;
   private int subGridlevel_lineas_Selectedindex ;
   private int subGridlevel_lineas_Selectioncolor ;
   private int subGridlevel_lineas_Hoveringcolor ;
   private int GXv_int8[] ;
   private int GXv_int24[] ;
   private int GXv_int29[] ;
   private int Gx_cnt ;
   private int E658PedCod ;
   private long Z13235EntLoteID ;
   private long A13235EntLoteID ;
   private long GRIDLEVEL_LINEAS_nFirstRecordOnPage ;
   private java.math.BigDecimal Z726PrdPreMed ;
   private java.math.BigDecimal Z725PrdPreAnt ;
   private java.math.BigDecimal Z724PrdPreAct ;
   private java.math.BigDecimal Z704PrdExiAlm ;
   private java.math.BigDecimal Z684PrdCanPen ;
   private java.math.BigDecimal Z729PrdRotRea ;
   private java.math.BigDecimal Z5255PrdPreAc2 ;
   private java.math.BigDecimal Z750PrdValStk ;
   private java.math.BigDecimal Z705PrdExiCC ;
   private java.math.BigDecimal O724PrdPreAct ;
   private java.math.BigDecimal O704PrdExiAlm ;
   private java.math.BigDecimal O750PrdValStk ;
   private java.math.BigDecimal Z419EntUniRem ;
   private java.math.BigDecimal Z417EntPre ;
   private java.math.BigDecimal Z418EntUniEnt ;
   private java.math.BigDecimal Z10782EntUniAlb ;
   private java.math.BigDecimal Z665PedPre ;
   private java.math.BigDecimal Z669PedUni ;
   private java.math.BigDecimal Z660PedDto ;
   private java.math.BigDecimal O419EntUniRem ;
   private java.math.BigDecimal O418EntUniEnt ;
   private java.math.BigDecimal O657PedCanEnt ;
   private java.math.BigDecimal O417EntPre ;
   private java.math.BigDecimal N418EntUniEnt ;
   private java.math.BigDecimal N417EntPre ;
   private java.math.BigDecimal A417EntPre ;
   private java.math.BigDecimal A418EntUniEnt ;
   private java.math.BigDecimal A704PrdExiAlm ;
   private java.math.BigDecimal B724PrdPreAct ;
   private java.math.BigDecimal A724PrdPreAct ;
   private java.math.BigDecimal B704PrdExiAlm ;
   private java.math.BigDecimal B750PrdValStk ;
   private java.math.BigDecimal A750PrdValStk ;
   private java.math.BigDecimal A726PrdPreMed ;
   private java.math.BigDecimal A725PrdPreAnt ;
   private java.math.BigDecimal A684PrdCanPen ;
   private java.math.BigDecimal A729PrdRotRea ;
   private java.math.BigDecimal A5255PrdPreAc2 ;
   private java.math.BigDecimal A705PrdExiCC ;
   private java.math.BigDecimal AV40OldExiAlm ;
   private java.math.BigDecimal A913StockRem ;
   private java.math.BigDecimal A657PedCanEnt ;
   private java.math.BigDecimal A669PedUni ;
   private java.math.BigDecimal AV38OldEntPre ;
   private java.math.BigDecimal AV39OldEntUni ;
   private java.math.BigDecimal AV42OldRemanente ;
   private java.math.BigDecimal AV55UniOld ;
   private java.math.BigDecimal AV48PrecAnt ;
   private java.math.BigDecimal A665PedPre ;
   private java.math.BigDecimal A660PedDto ;
   private java.math.BigDecimal A10782EntUniAlb ;
   private java.math.BigDecimal s724PrdPreAct ;
   private java.math.BigDecimal s704PrdExiAlm ;
   private java.math.BigDecimal s750PrdValStk ;
   private java.math.BigDecimal s684PrdCanPen ;
   private java.math.BigDecimal O684PrdCanPen ;
   private java.math.BigDecimal sV40OldExiAlm ;
   private java.math.BigDecimal OV40OldExiAlm ;
   private java.math.BigDecimal s726PrdPreMed ;
   private java.math.BigDecimal O726PrdPreMed ;
   private java.math.BigDecimal s725PrdPreAnt ;
   private java.math.BigDecimal O725PrdPreAnt ;
   private java.math.BigDecimal A419EntUniRem ;
   private java.math.BigDecimal T419EntUniRem ;
   private java.math.BigDecimal T418EntUniEnt ;
   private java.math.BigDecimal T657PedCanEnt ;
   private java.math.BigDecimal T417EntPre ;
   private java.math.BigDecimal Z913StockRem ;
   private java.math.BigDecimal Z657PedCanEnt ;
   private java.math.BigDecimal GXv_decimal16[] ;
   private java.math.BigDecimal GXv_decimal15[] ;
   private java.math.BigDecimal GXv_decimal12[] ;
   private java.math.BigDecimal GXv_decimal28[] ;
   private java.math.BigDecimal GXv_decimal21[] ;
   private java.math.BigDecimal ZV40OldExiAlm ;
   private java.math.BigDecimal ZO657PedCanEnt ;
   private java.math.BigDecimal ZV39OldEntUni ;
   private java.math.BigDecimal ZV55UniOld ;
   private java.math.BigDecimal ZV42OldRemanente ;
   private java.math.BigDecimal ZV38OldEntPre ;
   private java.math.BigDecimal ZV48PrecAnt ;
   private String sPrefix ;
   private String sGXsfl_40_idx="0001" ;
   private String wcpOGx_mode ;
   private String wcpOAV18EmprCod ;
   private String wcpOAV46PrdNum ;
   private String Z396EmprCod ;
   private String Z719PrdNum ;
   private String Z718PrdNom ;
   private String Z698PrdDetPar ;
   private String Z727PrdRec ;
   private String Z10184EntRemTpo ;
   private String Z3404EntPedCum ;
   private String Z11Albaran ;
   private String Z12857EntNAlbar ;
   private String Z5686EntLotN ;
   private String Z5691EntBnc ;
   private String Z7695EntCC ;
   private String Z10783EntObs ;
   private String Z10187EntRemNro ;
   private String Z10185EntRemSuc ;
   private String Z13456EntUbicaci ;
   private String Z659PedCum ;
   private String O5686EntLotN ;
   private String O3404EntPedCum ;
   private String N11Albaran ;
   private String N12857EntNAlbar ;
   private String N3404EntPedCum ;
   private String N5686EntLotN ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A719PrdNum ;
   private String Gx_mode ;
   private String AV44PedPri ;
   private String A718PrdNom ;
   private String AV62Pgmname ;
   private String AV56UsurCod ;
   private String AV50Station ;
   private String AV18EmprCod ;
   private String AV46PrdNum ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
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
   private String edtPrdNum_Internalname ;
   private String edtPrdNum_Jsonclick ;
   private String edtPrdNom_Internalname ;
   private String edtPrdNom_Jsonclick ;
   private String edtPrdExiAlm_Internalname ;
   private String edtPrdExiAlm_Jsonclick ;
   private String edtPrdUltMovF_Internalname ;
   private String edtPrdUltMovF_Jsonclick ;
   private String divTableleaflevel_lineas_Internalname ;
   private String TempTags ;
   private String bttBtntrn_enter_Internalname ;
   private String bttBtntrn_enter_Jsonclick ;
   private String bttBtntrn_cancel_Internalname ;
   private String bttBtntrn_cancel_Jsonclick ;
   private String bttBtntrn_delete_Internalname ;
   private String bttBtntrn_delete_Jsonclick ;
   private String edtavPgmname_Internalname ;
   private String edtavPgmname_Jsonclick ;
   private String sMode42 ;
   private String edtLinEnt_Internalname ;
   private String edtEntFecEnt_Internalname ;
   private String edtAlbaran_Internalname ;
   private String edtEntNAlbar_Internalname ;
   private String edtPedCod_Internalname ;
   private String edtavPedcodprompt_Internalname ;
   private String edtavPedcodprompt_Link ;
   private String edtEntNEmb_Internalname ;
   private String edtEntPrvNum_Internalname ;
   private String edtEntUniEnt_Internalname ;
   private String edtEntCump_Internalname ;
   private String edtEntPre_Internalname ;
   private String edtEntUniRem_Internalname ;
   private String edtEntLotN_Internalname ;
   private String edtEntFVal_Internalname ;
   private String imgprompt_6156_Link ;
   private String GX_FocusControl ;
   private String sStyleString ;
   private String subGridlevel_lineas_Internalname ;
   private String A698PrdDetPar ;
   private String A727PrdRec ;
   private String A407EmprNom ;
   private String A794PrvNom ;
   private String A10184EntRemTpo ;
   private String A666PedPri ;
   private String AV41oldlote ;
   private String AV45PrdNomX ;
   private String A5691EntBnc ;
   private String A7695EntCC ;
   private String A10783EntObs ;
   private String A10187EntRemNro ;
   private String A10185EntRemSuc ;
   private String A13456EntUbicaci ;
   private String A667PedSit ;
   private String A659PedCum ;
   private String Dvpanel_tableattributes_Objectcall ;
   private String Dvpanel_tableattributes_Class ;
   private String Dvpanel_tableattributes_Height ;
   private String hsh ;
   private String sMode29 ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String sV44PedPri ;
   private String OV44PedPri ;
   private String GXCCtl ;
   private String A11Albaran ;
   private String A12857EntNAlbar ;
   private String A14041EntCump ;
   private String A3404EntPedCum ;
   private String A5686EntLotN ;
   private String T5686EntLotN ;
   private String T3404EntPedCum ;
   private String AV19EmprNom ;
   private String edtavPedcodprompt_gximage ;
   private String Z407EmprNom ;
   private String Z794PrvNom ;
   private String Z667PedSit ;
   private String Z666PedPri ;
   private String imgprompt_6156_Internalname ;
   private String sGXsfl_40_fel_idx="0001" ;
   private String subGridlevel_lineas_Class ;
   private String subGridlevel_lineas_Linesclass ;
   private String ROClassString ;
   private String edtLinEnt_Jsonclick ;
   private String edtEntFecEnt_Jsonclick ;
   private String edtAlbaran_Jsonclick ;
   private String edtEntNAlbar_Jsonclick ;
   private String edtPedCod_Jsonclick ;
   private String sImgUrl ;
   private String edtEntNEmb_Jsonclick ;
   private String edtEntPrvNum_Jsonclick ;
   private String imgprompt_6156_gximage ;
   private String edtEntUniEnt_Jsonclick ;
   private String edtEntCump_Jsonclick ;
   private String edtEntPre_Jsonclick ;
   private String edtEntUniRem_Jsonclick ;
   private String edtEntLotN_Jsonclick ;
   private String edtEntFVal_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String i10184EntRemTpo ;
   private String subGridlevel_lineas_Header ;
   private String GXv_char25[] ;
   private String GXv_char23[] ;
   private String GXv_char13[] ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String GXv_char27[] ;
   private String GXv_char26[] ;
   private String ZV44PedPri ;
   private String GXt_char1 ;
   private String GXv_char31[] ;
   private String GXv_char30[] ;
   private String ZV45PrdNomX ;
   private String Z14041EntCump ;
   private String ZV41oldlote ;
   private String E396EmprCod ;
   private java.util.Date Z5690EntHfCon ;
   private java.util.Date Z5688EntHiCon ;
   private java.util.Date A5690EntHfCon ;
   private java.util.Date A5688EntHiCon ;
   private java.util.Date Z713PrdFulEnt ;
   private java.util.Date Z709PrdFecPre ;
   private java.util.Date Z415EntFecEnt ;
   private java.util.Date Z5685EntFVal ;
   private java.util.Date Z10186EntRemFch ;
   private java.util.Date Z5689EntFfCon ;
   private java.util.Date Z5687EntFiCon ;
   private java.util.Date Z663PedFulEnt ;
   private java.util.Date O415EntFecEnt ;
   private java.util.Date N415EntFecEnt ;
   private java.util.Date N5685EntFVal ;
   private java.util.Date A415EntFecEnt ;
   private java.util.Date A14040PrdUltMovF ;
   private java.util.Date A713PrdFulEnt ;
   private java.util.Date A709PrdFecPre ;
   private java.util.Date A3835UltFecCCs ;
   private java.util.Date Gx_date ;
   private java.util.Date AV37oldEntFecent ;
   private java.util.Date AV22FecAnt ;
   private java.util.Date A663PedFulEnt ;
   private java.util.Date AV23Fecha ;
   private java.util.Date A10186EntRemFch ;
   private java.util.Date A5689EntFfCon ;
   private java.util.Date A5687EntFiCon ;
   private java.util.Date A661PedFec ;
   private java.util.Date s713PrdFulEnt ;
   private java.util.Date O713PrdFulEnt ;
   private java.util.Date s709PrdFecPre ;
   private java.util.Date O709PrdFecPre ;
   private java.util.Date s14040PrdUltMovF ;
   private java.util.Date O14040PrdUltMovF ;
   private java.util.Date A5685EntFVal ;
   private java.util.Date T415EntFecEnt ;
   private java.util.Date Z661PedFec ;
   private java.util.Date i415EntFecEnt ;
   private java.util.Date GXv_date11[] ;
   private java.util.Date GXt_date10 ;
   private java.util.Date GXv_date22[] ;
   private java.util.Date Z14040PrdUltMovF ;
   private java.util.Date Z3835UltFecCCs ;
   private java.util.Date ZV23Fecha ;
   private java.util.Date ZV37oldEntFecent ;
   private java.util.Date ZV22FecAnt ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n719PrdNum ;
   private boolean n6156EntPrvNum ;
   private boolean n658PedCod ;
   private boolean wbErr ;
   private boolean Dvpanel_tableattributes_Autowidth ;
   private boolean Dvpanel_tableattributes_Autoheight ;
   private boolean Dvpanel_tableattributes_Collapsible ;
   private boolean Dvpanel_tableattributes_Collapsed ;
   private boolean Dvpanel_tableattributes_Showcollapseicon ;
   private boolean Dvpanel_tableattributes_Autoscroll ;
   private boolean bGXsfl_40_Refreshing=false ;
   private boolean n800PrvPri ;
   private boolean n407EmprNom ;
   private boolean n3915EmpNumDec ;
   private boolean n794PrvNom ;
   private boolean n913StockRem ;
   private boolean Dvpanel_tableattributes_Enabled ;
   private boolean Dvpanel_tableattributes_Showheader ;
   private boolean Dvpanel_tableattributes_Visible ;
   private boolean returnInSub ;
   private boolean Gx_longc ;
   private boolean AV43PedCodPrompt_IsBlob ;
   private boolean Gx_first ;
   private boolean nA658PedCod ;
   private String AV26Inc_obs ;
   private String AV34msg_ctrl_fecha ;
   private String AV65Pedcodprompt_GXI ;
   private String ZV34msg_ctrl_fecha ;
   private String AV43PedCodPrompt ;
   private com.genexus.webpanels.GXWebGrid Gridlevel_lineasContainer ;
   private com.genexus.webpanels.GXWebRow Gridlevel_lineasRow ;
   private com.genexus.webpanels.GXWebColumn Gridlevel_lineasColumn ;
   private com.genexus.webpanels.WebSession AV57WebSession ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableattributes ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private HTMLChoice cmbEntPedCum ;
   private IDataStoreProvider pr_default ;
   private java.math.BigDecimal[] T01SH8_A913StockRem ;
   private boolean[] T01SH8_n913StockRem ;
   private String[] T01SH11_A407EmprNom ;
   private boolean[] T01SH11_n407EmprNom ;
   private byte[] T01SH11_A3915EmpNumDec ;
   private boolean[] T01SH11_n3915EmpNumDec ;
   private String[] T01SH12_A794PrvNom ;
   private boolean[] T01SH12_n794PrvNom ;
   private byte[] T01SH12_A800PrvPri ;
   private boolean[] T01SH12_n800PrvPri ;
   private String[] T01SH15_A719PrdNum ;
   private boolean[] T01SH15_n719PrdNum ;
   private java.math.BigDecimal[] T01SH15_A726PrdPreMed ;
   private java.math.BigDecimal[] T01SH15_A725PrdPreAnt ;
   private String[] T01SH15_A718PrdNom ;
   private String[] T01SH15_A794PrvNom ;
   private boolean[] T01SH15_n794PrvNom ;
   private java.math.BigDecimal[] T01SH15_A724PrdPreAct ;
   private java.math.BigDecimal[] T01SH15_A704PrdExiAlm ;
   private short[] T01SH15_A847UltLinEnt ;
   private String[] T01SH15_A698PrdDetPar ;
   private java.util.Date[] T01SH15_A713PrdFulEnt ;
   private java.math.BigDecimal[] T01SH15_A684PrdCanPen ;
   private java.math.BigDecimal[] T01SH15_A729PrdRotRea ;
   private String[] T01SH15_A727PrdRec ;
   private java.util.Date[] T01SH15_A709PrdFecPre ;
   private String[] T01SH15_A407EmprNom ;
   private boolean[] T01SH15_n407EmprNom ;
   private byte[] T01SH15_A800PrvPri ;
   private boolean[] T01SH15_n800PrvPri ;
   private byte[] T01SH15_A3915EmpNumDec ;
   private boolean[] T01SH15_n3915EmpNumDec ;
   private java.math.BigDecimal[] T01SH15_A5255PrdPreAc2 ;
   private java.math.BigDecimal[] T01SH15_A750PrdValStk ;
   private java.math.BigDecimal[] T01SH15_A705PrdExiCC ;
   private String[] T01SH15_A396EmprCod ;
   private int[] T01SH15_A795PrvNum ;
   private byte[] T01SH15_A856ValCod ;
   private java.math.BigDecimal[] T01SH15_A913StockRem ;
   private boolean[] T01SH15_n913StockRem ;
   private String[] T01SH13_A396EmprCod ;
   private String[] T01SH16_A794PrvNom ;
   private boolean[] T01SH16_n794PrvNom ;
   private byte[] T01SH16_A800PrvPri ;
   private boolean[] T01SH16_n800PrvPri ;
   private String[] T01SH17_A396EmprCod ;
   private java.math.BigDecimal[] T01SH19_A913StockRem ;
   private boolean[] T01SH19_n913StockRem ;
   private String[] T01SH20_A396EmprCod ;
   private String[] T01SH20_A719PrdNum ;
   private boolean[] T01SH20_n719PrdNum ;
   private String[] T01SH10_A719PrdNum ;
   private boolean[] T01SH10_n719PrdNum ;
   private java.math.BigDecimal[] T01SH10_A726PrdPreMed ;
   private java.math.BigDecimal[] T01SH10_A725PrdPreAnt ;
   private String[] T01SH10_A718PrdNom ;
   private java.math.BigDecimal[] T01SH10_A724PrdPreAct ;
   private java.math.BigDecimal[] T01SH10_A704PrdExiAlm ;
   private short[] T01SH10_A847UltLinEnt ;
   private String[] T01SH10_A698PrdDetPar ;
   private java.util.Date[] T01SH10_A713PrdFulEnt ;
   private java.math.BigDecimal[] T01SH10_A684PrdCanPen ;
   private java.math.BigDecimal[] T01SH10_A729PrdRotRea ;
   private String[] T01SH10_A727PrdRec ;
   private java.util.Date[] T01SH10_A709PrdFecPre ;
   private java.math.BigDecimal[] T01SH10_A5255PrdPreAc2 ;
   private java.math.BigDecimal[] T01SH10_A750PrdValStk ;
   private java.math.BigDecimal[] T01SH10_A705PrdExiCC ;
   private String[] T01SH10_A396EmprCod ;
   private int[] T01SH10_A795PrvNum ;
   private byte[] T01SH10_A856ValCod ;
   private String[] T01SH21_A396EmprCod ;
   private String[] T01SH21_A719PrdNum ;
   private boolean[] T01SH21_n719PrdNum ;
   private String[] T01SH22_A396EmprCod ;
   private String[] T01SH22_A719PrdNum ;
   private boolean[] T01SH22_n719PrdNum ;
   private String[] T01SH9_A719PrdNum ;
   private boolean[] T01SH9_n719PrdNum ;
   private java.math.BigDecimal[] T01SH9_A726PrdPreMed ;
   private java.math.BigDecimal[] T01SH9_A725PrdPreAnt ;
   private String[] T01SH9_A718PrdNom ;
   private java.math.BigDecimal[] T01SH9_A724PrdPreAct ;
   private java.math.BigDecimal[] T01SH9_A704PrdExiAlm ;
   private short[] T01SH9_A847UltLinEnt ;
   private String[] T01SH9_A698PrdDetPar ;
   private java.util.Date[] T01SH9_A713PrdFulEnt ;
   private java.math.BigDecimal[] T01SH9_A684PrdCanPen ;
   private java.math.BigDecimal[] T01SH9_A729PrdRotRea ;
   private String[] T01SH9_A727PrdRec ;
   private java.util.Date[] T01SH9_A709PrdFecPre ;
   private java.math.BigDecimal[] T01SH9_A5255PrdPreAc2 ;
   private java.math.BigDecimal[] T01SH9_A750PrdValStk ;
   private java.math.BigDecimal[] T01SH9_A705PrdExiCC ;
   private String[] T01SH9_A396EmprCod ;
   private int[] T01SH9_A795PrvNum ;
   private byte[] T01SH9_A856ValCod ;
   private String[] T01SH26_A794PrvNom ;
   private boolean[] T01SH26_n794PrvNom ;
   private byte[] T01SH26_A800PrvPri ;
   private boolean[] T01SH26_n800PrvPri ;
   private java.math.BigDecimal[] T01SH28_A913StockRem ;
   private boolean[] T01SH28_n913StockRem ;
   private String[] T01SH29_A396EmprCod ;
   private String[] T01SH29_A719PrdNum ;
   private boolean[] T01SH29_n719PrdNum ;
   private String[] T01SH29_A13217NormaID ;
   private String[] T01SH30_A396EmprCod ;
   private String[] T01SH30_A719PrdNum ;
   private boolean[] T01SH30_n719PrdNum ;
   private String[] T01SH30_A13586TheList ;
   private String[] T01SH31_A396EmprCod ;
   private int[] T01SH31_A5532Lb_numero ;
   private String[] T01SH31_A5555Lb_opcion ;
   private short[] T01SH31_A13460Lb_linCP ;
   private String[] T01SH31_A13458Lb_TipCP ;
   private String[] T01SH32_A396EmprCod ;
   private int[] T01SH32_A13418AlbProID ;
   private short[] T01SH32_A13442AlbProLine ;
   private String[] T01SH33_A396EmprCod ;
   private int[] T01SH33_A13324LDESID ;
   private String[] T01SH33_A13333LDESNPeque ;
   private String[] T01SH33_A13337LDESComb ;
   private String[] T01SH33_A13339LDESFondo ;
   private short[] T01SH33_A13342LDESLinea ;
   private String[] T01SH34_A396EmprCod ;
   private int[] T01SH34_A13312Lb_NLab ;
   private short[] T01SH34_A13305Lb_IDVeces ;
   private short[] T01SH34_A13306Lb_LinID ;
   private String[] T01SH35_A396EmprCod ;
   private int[] T01SH35_A12673LavMqId ;
   private short[] T01SH35_A12692LavMqLnPq ;
   private short[] T01SH35_A12681LavMqLn ;
   private String[] T01SH36_A396EmprCod ;
   private String[] T01SH36_A719PrdNum ;
   private boolean[] T01SH36_n719PrdNum ;
   private short[] T01SH36_A9713Tb1_Cod ;
   private String[] T01SH37_A396EmprCod ;
   private String[] T01SH37_A12236PrdNumD ;
   private String[] T01SH37_A719PrdNum ;
   private boolean[] T01SH37_n719PrdNum ;
   private String[] T01SH38_A396EmprCod ;
   private long[] T01SH38_A12225DocDisID ;
   private short[] T01SH38_A12226LinDisID ;
   private String[] T01SH39_A396EmprCod ;
   private long[] T01SH39_A12225DocDisID ;
   private String[] T01SH40_A396EmprCod ;
   private long[] T01SH40_A12205OrdenCID ;
   private short[] T01SH40_A12206OrdenCLnId ;
   private String[] T01SH41_A396EmprCod ;
   private String[] T01SH41_A719PrdNum ;
   private boolean[] T01SH41_n719PrdNum ;
   private String[] T01SH41_A11664LoteID ;
   private java.util.Date[] T01SH41_A11665LoteFec ;
   private String[] T01SH42_A396EmprCod ;
   private int[] T01SH42_A4850DevComCod ;
   private String[] T01SH42_A719PrdNum ;
   private boolean[] T01SH42_n719PrdNum ;
   private String[] T01SH43_A396EmprCod ;
   private int[] T01SH43_A252CliCod ;
   private String[] T01SH43_A494ForSer ;
   private String[] T01SH43_A482ForColNom ;
   private int[] T01SH43_A483ForColNum ;
   private byte[] T01SH43_A831TipColCod ;
   private String[] T01SH43_A3571EnsCod ;
   private short[] T01SH43_A3582EnsLin ;
   private String[] T01SH44_A396EmprCod ;
   private int[] T01SH44_A129BarCod ;
   private byte[] T01SH44_A132BarCodReo ;
   private String[] T01SH44_A130BarCodPar ;
   private byte[] T01SH44_A4075recestncol ;
   private byte[] T01SH44_A4076recestnpro ;
   private short[] T01SH44_A4108recestlin ;
   private String[] T01SH45_A396EmprCod ;
   private int[] T01SH45_A4052EstNumFor ;
   private byte[] T01SH45_A4053EstNumCol ;
   private byte[] T01SH45_A4090EstEspLin ;
   private String[] T01SH46_A396EmprCod ;
   private int[] T01SH46_A4052EstNumFor ;
   private byte[] T01SH46_A4053EstNumCol ;
   private byte[] T01SH46_A4084EstProLin ;
   private String[] T01SH47_A396EmprCod ;
   private long[] T01SH47_A11644TransferId ;
   private int[] T01SH47_A11653TransferLn ;
   private String[] T01SH48_A396EmprCod ;
   private String[] T01SH48_A11634TaesId ;
   private short[] T01SH48_A11637TaesLn ;
   private short[] T01SH48_A11641TaesLnP ;
   private String[] T01SH49_A396EmprCod ;
   private String[] T01SH49_A719PrdNum ;
   private boolean[] T01SH49_n719PrdNum ;
   private long[] T01SH49_A11329H_stklin ;
   private String[] T01SH50_A396EmprCod ;
   private int[] T01SH50_A11270Pot_num ;
   private short[] T01SH50_A11271Pot_lin ;
   private String[] T01SH51_A396EmprCod ;
   private String[] T01SH51_A719PrdNum ;
   private boolean[] T01SH51_n719PrdNum ;
   private String[] T01SH51_A11199PrdNcasC ;
   private String[] T01SH52_A396EmprCod ;
   private String[] T01SH52_A719PrdNum ;
   private boolean[] T01SH52_n719PrdNum ;
   private String[] T01SH52_A11197CFraseR ;
   private String[] T01SH53_A396EmprCod ;
   private short[] T01SH53_A10243Jt_codigo ;
   private short[] T01SH53_A10246Jt_ord ;
   private String[] T01SH54_A396EmprCod ;
   private java.util.Date[] T01SH54_A10236Bny_dia ;
   private short[] T01SH54_A10238Bny_lin ;
   private String[] T01SH55_A396EmprCod ;
   private int[] T01SH55_A129BarCod ;
   private byte[] T01SH55_A132BarCodReo ;
   private String[] T01SH55_A130BarCodPar ;
   private String[] T01SH55_A758ProCod ;
   private short[] T01SH55_A194BarOrdLin ;
   private String[] T01SH55_A719PrdNum ;
   private boolean[] T01SH55_n719PrdNum ;
   private String[] T01SH56_A396EmprCod ;
   private String[] T01SH56_A719PrdNum ;
   private boolean[] T01SH56_n719PrdNum ;
   private String[] T01SH56_A9735Cod_Rgo ;
   private String[] T01SH57_A396EmprCod ;
   private String[] T01SH57_A719PrdNum ;
   private boolean[] T01SH57_n719PrdNum ;
   private short[] T01SH57_A9711Ct_codigo ;
   private String[] T01SH58_A396EmprCod ;
   private long[] T01SH58_A9652OeNum ;
   private int[] T01SH58_A9653OeHdr ;
   private byte[] T01SH58_A9654OeHdrr ;
   private String[] T01SH58_A9655OeHdrp ;
   private byte[] T01SH58_A9656OeLinC ;
   private String[] T01SH58_A9657OeComb ;
   private String[] T01SH58_A9658Oefondo ;
   private byte[] T01SH58_A9659OeMolCil ;
   private short[] T01SH58_A9686OePasLin ;
   private short[] T01SH58_A9694OePasPLi ;
   private String[] T01SH59_A396EmprCod ;
   private long[] T01SH59_A9652OeNum ;
   private int[] T01SH59_A9653OeHdr ;
   private byte[] T01SH59_A9654OeHdrr ;
   private String[] T01SH59_A9655OeHdrp ;
   private byte[] T01SH59_A9656OeLinC ;
   private String[] T01SH59_A9657OeComb ;
   private String[] T01SH59_A9658Oefondo ;
   private byte[] T01SH59_A9659OeMolCil ;
   private byte[] T01SH59_A9677OeMolLin ;
   private String[] T01SH60_A396EmprCod ;
   private int[] T01SH60_A9578Pas_Num ;
   private String[] T01SH60_A719PrdNum ;
   private boolean[] T01SH60_n719PrdNum ;
   private String[] T01SH61_A396EmprCod ;
   private String[] T01SH61_A719PrdNum ;
   private boolean[] T01SH61_n719PrdNum ;
   private byte[] T01SH61_A8908CC_AlmCod ;
   private String[] T01SH62_A396EmprCod ;
   private String[] T01SH62_A719PrdNum ;
   private boolean[] T01SH62_n719PrdNum ;
   private int[] T01SH62_A8661Almc_Ln ;
   private String[] T01SH63_A396EmprCod ;
   private String[] T01SH63_A719PrdNum ;
   private boolean[] T01SH63_n719PrdNum ;
   private String[] T01SH63_A8648Mat_PrdN ;
   private String[] T01SH64_A396EmprCod ;
   private long[] T01SH64_A8585Pet_cod ;
   private String[] T01SH64_A719PrdNum ;
   private boolean[] T01SH64_n719PrdNum ;
   private String[] T01SH65_A396EmprCod ;
   private String[] T01SH65_A719PrdNum ;
   private boolean[] T01SH65_n719PrdNum ;
   private java.util.Date[] T01SH65_A8577RecFecHr ;
   private String[] T01SH66_A396EmprCod ;
   private String[] T01SH66_A719PrdNum ;
   private boolean[] T01SH66_n719PrdNum ;
   private short[] T01SH66_A8366PrdAnyo ;
   private int[] T01SH66_A8360PrdProv ;
   private String[] T01SH67_A396EmprCod ;
   private int[] T01SH67_A252CliCod ;
   private String[] T01SH67_A494ForSer ;
   private String[] T01SH67_A482ForColNom ;
   private int[] T01SH67_A483ForColNum ;
   private byte[] T01SH67_A831TipColCod ;
   private short[] T01SH67_A7797Sim_lin ;
   private String[] T01SH68_A396EmprCod ;
   private int[] T01SH68_A7163Vir_Codigo ;
   private String[] T01SH68_A719PrdNum ;
   private boolean[] T01SH68_n719PrdNum ;
   private String[] T01SH69_A396EmprCod ;
   private String[] T01SH69_A6310Lb_TaAuxC ;
   private short[] T01SH69_A6313lb_TaAuxL ;
   private short[] T01SH69_A6378Lb_TauxLP ;
   private String[] T01SH70_A396EmprCod ;
   private int[] T01SH70_A6290PreCoNum ;
   private String[] T01SH70_A719PrdNum ;
   private boolean[] T01SH70_n719PrdNum ;
   private String[] T01SH71_A396EmprCod ;
   private String[] T01SH71_A719PrdNum ;
   private boolean[] T01SH71_n719PrdNum ;
   private int[] T01SH71_A6158PrdPrv ;
   private String[] T01SH72_A396EmprCod ;
   private String[] T01SH72_A719PrdNum ;
   private boolean[] T01SH72_n719PrdNum ;
   private String[] T01SH72_A5973PrdSusNum ;
   private String[] T01SH73_A396EmprCod ;
   private String[] T01SH73_A5612Lb_CodGru ;
   private short[] T01SH73_A5615Lb_LinGru ;
   private String[] T01SH74_A396EmprCod ;
   private int[] T01SH74_A5532Lb_numero ;
   private String[] T01SH74_A5555Lb_opcion ;
   private short[] T01SH74_A5560Lb_LineaPr ;
   private String[] T01SH75_A396EmprCod ;
   private int[] T01SH75_A5532Lb_numero ;
   private String[] T01SH75_A5555Lb_opcion ;
   private short[] T01SH75_A5557Lb_LineaC ;
   private String[] T01SH76_A396EmprCod ;
   private int[] T01SH76_A5145SobCod ;
   private String[] T01SH76_A719PrdNum ;
   private boolean[] T01SH76_n719PrdNum ;
   private String[] T01SH77_A396EmprCod ;
   private int[] T01SH77_A4744RecPreCod ;
   private short[] T01SH77_A4762RecPreLin ;
   private short[] T01SH77_A4763RecPreNli ;
   private String[] T01SH78_A396EmprCod ;
   private int[] T01SH78_A4492HreBarCod ;
   private byte[] T01SH78_A4493HreBarReo ;
   private String[] T01SH78_A4494HreBarPar ;
   private byte[] T01SH78_A4495HreNumCie ;
   private short[] T01SH78_A4545HreLinMaq ;
   private byte[] T01SH78_A4550HreLinPro ;
   private short[] T01SH78_A4557HreRecLin ;
   private String[] T01SH79_A396EmprCod ;
   private int[] T01SH79_A4492HreBarCod ;
   private byte[] T01SH79_A4493HreBarReo ;
   private String[] T01SH79_A4494HreBarPar ;
   private byte[] T01SH79_A4495HreNumCie ;
   private short[] T01SH79_A4508HreLinMAL ;
   private byte[] T01SH79_A4509HreNumAny ;
   private String[] T01SH79_A719PrdNum ;
   private boolean[] T01SH79_n719PrdNum ;
   private String[] T01SH80_A396EmprCod ;
   private int[] T01SH80_A252CliCod ;
   private String[] T01SH80_A4415EstCol ;
   private short[] T01SH80_A4416EstColLin ;
   private String[] T01SH81_A396EmprCod ;
   private int[] T01SH81_A129BarCod ;
   private byte[] T01SH81_A132BarCodReo ;
   private String[] T01SH81_A130BarCodPar ;
   private byte[] T01SH81_A2524DisComLin ;
   private String[] T01SH81_A1056DisComCod ;
   private String[] T01SH81_A1032FonCod ;
   private byte[] T01SH81_A2124RecMolCod ;
   private short[] T01SH81_A2672RecPasLin ;
   private short[] T01SH81_A2675RecPasPLi ;
   private String[] T01SH82_A396EmprCod ;
   private int[] T01SH82_A129BarCod ;
   private byte[] T01SH82_A132BarCodReo ;
   private String[] T01SH82_A130BarCodPar ;
   private byte[] T01SH82_A2524DisComLin ;
   private String[] T01SH82_A1056DisComCod ;
   private String[] T01SH82_A1032FonCod ;
   private byte[] T01SH82_A2124RecMolCod ;
   private byte[] T01SH82_A2126RecMolLin ;
   private String[] T01SH83_A396EmprCod ;
   private String[] T01SH83_A2107PasCod ;
   private String[] T01SH83_A719PrdNum ;
   private boolean[] T01SH83_n719PrdNum ;
   private String[] T01SH84_A396EmprCod ;
   private int[] T01SH84_A2637HisEstHRu ;
   private byte[] T01SH84_A2636HisEstHRe ;
   private String[] T01SH84_A2635HisEstHPa ;
   private byte[] T01SH84_A2638HisEstLCo ;
   private String[] T01SH84_A2630HisEstCom ;
   private String[] T01SH84_A2634HisEstFon ;
   private String[] T01SH84_A719PrdNum ;
   private boolean[] T01SH84_n719PrdNum ;
   private String[] T01SH85_A396EmprCod ;
   private int[] T01SH85_A252CliCod ;
   private String[] T01SH85_A2141SerEst ;
   private String[] T01SH85_A1013DibCli ;
   private int[] T01SH85_A1014DibInt ;
   private String[] T01SH85_A2074ColCom ;
   private String[] T01SH85_A2078ColFon ;
   private byte[] T01SH85_A2098MolCod ;
   private short[] T01SH85_A2535ForPrdLin ;
   private String[] T01SH86_A396EmprCod ;
   private String[] T01SH86_A719PrdNum ;
   private boolean[] T01SH86_n719PrdNum ;
   private long[] T01SH86_A3342CCStkLin ;
   private String[] T01SH87_A396EmprCod ;
   private int[] T01SH87_A252CliCod ;
   private String[] T01SH87_A2891HMaForSer ;
   private String[] T01SH87_A2892HMaForCNom ;
   private int[] T01SH87_A2893HMaForCNum ;
   private byte[] T01SH87_A2894HMaTipCCod ;
   private int[] T01SH87_A2895HMaForNumC ;
   private short[] T01SH87_A2897HMaColLin ;
   private java.util.Date[] T01SH87_A2896HMaFec ;
   private short[] T01SH87_A2907HmaLin ;
   private String[] T01SH88_A396EmprCod ;
   private int[] T01SH88_A129BarCod ;
   private byte[] T01SH88_A132BarCodReo ;
   private String[] T01SH88_A130BarCodPar ;
   private short[] T01SH88_A2808RecLinMAL ;
   private byte[] T01SH88_A1377RecNumAny ;
   private String[] T01SH88_A719PrdNum ;
   private boolean[] T01SH88_n719PrdNum ;
   private String[] T01SH89_A396EmprCod ;
   private int[] T01SH89_A129BarCod ;
   private byte[] T01SH89_A132BarCodReo ;
   private String[] T01SH89_A130BarCodPar ;
   private short[] T01SH89_A2804RecLinMaq ;
   private byte[] T01SH89_A1273RecLinPro ;
   private short[] T01SH89_A811RecLin ;
   private String[] T01SH90_A396EmprCod ;
   private int[] T01SH90_A129BarCod ;
   private byte[] T01SH90_A132BarCodReo ;
   private String[] T01SH90_A130BarCodPar ;
   private String[] T01SH90_A2494BarDosPro ;
   private String[] T01SH90_A719PrdNum ;
   private boolean[] T01SH90_n719PrdNum ;
   private String[] T01SH91_A396EmprCod ;
   private int[] T01SH91_A1314EnsLabCod ;
   private short[] T01SH91_A1317EnsLabLin ;
   private String[] T01SH92_A396EmprCod ;
   private String[] T01SH92_A910Workstat ;
   private int[] T01SH92_A887EscMLin ;
   private String[] T01SH93_A396EmprCod ;
   private int[] T01SH93_A859CumCodCont ;
   private String[] T01SH93_A719PrdNum ;
   private boolean[] T01SH93_n719PrdNum ;
   private String[] T01SH94_A396EmprCod ;
   private String[] T01SH94_A719PrdNum ;
   private boolean[] T01SH94_n719PrdNum ;
   private java.util.Date[] T01SH94_A810RecFec ;
   private String[] T01SH95_A396EmprCod ;
   private int[] T01SH95_A486ForNumCol ;
   private short[] T01SH95_A715PrdLin ;
   private String[] T01SH96_A396EmprCod ;
   private String[] T01SH96_A719PrdNum ;
   private boolean[] T01SH96_n719PrdNum ;
   private short[] T01SH96_A681PrdAny ;
   private String[] T01SH97_A396EmprCod ;
   private String[] T01SH97_A719PrdNum ;
   private boolean[] T01SH97_n719PrdNum ;
   private String[] T01SH97_A688PrdComCod ;
   private String[] T01SH98_A396EmprCod ;
   private String[] T01SH98_A719PrdNum ;
   private boolean[] T01SH98_n719PrdNum ;
   private String[] T01SH98_A680PrdAltNum ;
   private String[] T01SH99_A396EmprCod ;
   private int[] T01SH99_A658PedCod ;
   private boolean[] T01SH99_n658PedCod ;
   private String[] T01SH99_A719PrdNum ;
   private boolean[] T01SH99_n719PrdNum ;
   private String[] T01SH100_A396EmprCod ;
   private int[] T01SH100_A486ForNumCol ;
   private short[] T01SH100_A309ColLin ;
   private String[] T01SH101_A396EmprCod ;
   private String[] T01SH101_A719PrdNum ;
   private boolean[] T01SH101_n719PrdNum ;
   private int[] T01SH101_A647NumCon ;
   private String[] T01SH103_A396EmprCod ;
   private String[] T01SH103_A719PrdNum ;
   private boolean[] T01SH103_n719PrdNum ;
   private short[] T01SH104_A597LinEnt ;
   private int[] T01SH104_A12716EntFabId ;
   private int[] T01SH104_A6156EntPrvNum ;
   private boolean[] T01SH104_n6156EntPrvNum ;
   private java.util.Date[] T01SH104_A415EntFecEnt ;
   private String[] T01SH104_A10184EntRemTpo ;
   private String[] T01SH104_A3404EntPedCum ;
   private byte[] T01SH104_A411EntCon ;
   private java.math.BigDecimal[] T01SH104_A657PedCanEnt ;
   private java.util.Date[] T01SH104_A663PedFulEnt ;
   private java.math.BigDecimal[] T01SH104_A419EntUniRem ;
   private java.math.BigDecimal[] T01SH104_A417EntPre ;
   private String[] T01SH104_A11Albaran ;
   private String[] T01SH104_A12857EntNAlbar ;
   private java.util.Date[] T01SH104_A661PedFec ;
   private java.math.BigDecimal[] T01SH104_A418EntUniEnt ;
   private java.math.BigDecimal[] T01SH104_A665PedPre ;
   private java.math.BigDecimal[] T01SH104_A669PedUni ;
   private short[] T01SH104_A416EntNumCon ;
   private String[] T01SH104_A5686EntLotN ;
   private java.util.Date[] T01SH104_A5685EntFVal ;
   private byte[] T01SH104_A414EntEti ;
   private int[] T01SH104_A413EntConIni ;
   private int[] T01SH104_A412EntConFin ;
   private String[] T01SH104_A659PedCum ;
   private String[] T01SH104_A667PedSit ;
   private String[] T01SH104_A666PedPri ;
   private java.math.BigDecimal[] T01SH104_A660PedDto ;
   private String[] T01SH104_A5691EntBnc ;
   private String[] T01SH104_A7695EntCC ;
   private short[] T01SH104_A7696EntCCoCod ;
   private java.math.BigDecimal[] T01SH104_A10782EntUniAlb ;
   private String[] T01SH104_A10783EntObs ;
   private String[] T01SH104_A10187EntRemNro ;
   private java.util.Date[] T01SH104_A10186EntRemFch ;
   private String[] T01SH104_A10185EntRemSuc ;
   private byte[] T01SH104_A12580PedAlmc ;
   private long[] T01SH104_A13235EntLoteID ;
   private String[] T01SH104_A13456EntUbicaci ;
   private java.util.Date[] T01SH104_A5690EntHfCon ;
   private java.util.Date[] T01SH104_A5689EntFfCon ;
   private java.util.Date[] T01SH104_A5688EntHiCon ;
   private java.util.Date[] T01SH104_A5687EntFiCon ;
   private byte[] T01SH104_A14035EntNEmb ;
   private String[] T01SH104_A396EmprCod ;
   private int[] T01SH104_A658PedCod ;
   private boolean[] T01SH104_n658PedCod ;
   private String[] T01SH104_A719PrdNum ;
   private boolean[] T01SH104_n719PrdNum ;
   private java.util.Date[] T01SH4_A661PedFec ;
   private String[] T01SH4_A667PedSit ;
   private String[] T01SH4_A666PedPri ;
   private byte[] T01SH4_A12580PedAlmc ;
   private java.math.BigDecimal[] T01SH6_A657PedCanEnt ;
   private java.util.Date[] T01SH6_A663PedFulEnt ;
   private java.math.BigDecimal[] T01SH6_A665PedPre ;
   private java.math.BigDecimal[] T01SH6_A669PedUni ;
   private String[] T01SH6_A659PedCum ;
   private java.math.BigDecimal[] T01SH6_A660PedDto ;
   private java.util.Date[] T01SH105_A661PedFec ;
   private String[] T01SH105_A667PedSit ;
   private String[] T01SH105_A666PedPri ;
   private byte[] T01SH105_A12580PedAlmc ;
   private String[] T01SH106_A396EmprCod ;
   private String[] T01SH106_A719PrdNum ;
   private boolean[] T01SH106_n719PrdNum ;
   private short[] T01SH106_A597LinEnt ;
   private short[] T01SH3_A597LinEnt ;
   private int[] T01SH3_A12716EntFabId ;
   private int[] T01SH3_A6156EntPrvNum ;
   private boolean[] T01SH3_n6156EntPrvNum ;
   private java.util.Date[] T01SH3_A415EntFecEnt ;
   private String[] T01SH3_A10184EntRemTpo ;
   private String[] T01SH3_A3404EntPedCum ;
   private byte[] T01SH3_A411EntCon ;
   private java.math.BigDecimal[] T01SH3_A419EntUniRem ;
   private java.math.BigDecimal[] T01SH3_A417EntPre ;
   private String[] T01SH3_A11Albaran ;
   private String[] T01SH3_A12857EntNAlbar ;
   private java.math.BigDecimal[] T01SH3_A418EntUniEnt ;
   private short[] T01SH3_A416EntNumCon ;
   private String[] T01SH3_A5686EntLotN ;
   private java.util.Date[] T01SH3_A5685EntFVal ;
   private byte[] T01SH3_A414EntEti ;
   private int[] T01SH3_A413EntConIni ;
   private int[] T01SH3_A412EntConFin ;
   private String[] T01SH3_A5691EntBnc ;
   private String[] T01SH3_A7695EntCC ;
   private short[] T01SH3_A7696EntCCoCod ;
   private java.math.BigDecimal[] T01SH3_A10782EntUniAlb ;
   private String[] T01SH3_A10783EntObs ;
   private String[] T01SH3_A10187EntRemNro ;
   private java.util.Date[] T01SH3_A10186EntRemFch ;
   private String[] T01SH3_A10185EntRemSuc ;
   private long[] T01SH3_A13235EntLoteID ;
   private String[] T01SH3_A13456EntUbicaci ;
   private java.util.Date[] T01SH3_A5690EntHfCon ;
   private java.util.Date[] T01SH3_A5689EntFfCon ;
   private java.util.Date[] T01SH3_A5688EntHiCon ;
   private java.util.Date[] T01SH3_A5687EntFiCon ;
   private byte[] T01SH3_A14035EntNEmb ;
   private String[] T01SH3_A396EmprCod ;
   private int[] T01SH3_A658PedCod ;
   private boolean[] T01SH3_n658PedCod ;
   private String[] T01SH3_A719PrdNum ;
   private boolean[] T01SH3_n719PrdNum ;
   private short[] T01SH2_A597LinEnt ;
   private int[] T01SH2_A12716EntFabId ;
   private int[] T01SH2_A6156EntPrvNum ;
   private boolean[] T01SH2_n6156EntPrvNum ;
   private java.util.Date[] T01SH2_A415EntFecEnt ;
   private String[] T01SH2_A10184EntRemTpo ;
   private String[] T01SH2_A3404EntPedCum ;
   private byte[] T01SH2_A411EntCon ;
   private java.math.BigDecimal[] T01SH2_A419EntUniRem ;
   private java.math.BigDecimal[] T01SH2_A417EntPre ;
   private String[] T01SH2_A11Albaran ;
   private String[] T01SH2_A12857EntNAlbar ;
   private java.math.BigDecimal[] T01SH2_A418EntUniEnt ;
   private short[] T01SH2_A416EntNumCon ;
   private String[] T01SH2_A5686EntLotN ;
   private java.util.Date[] T01SH2_A5685EntFVal ;
   private byte[] T01SH2_A414EntEti ;
   private int[] T01SH2_A413EntConIni ;
   private int[] T01SH2_A412EntConFin ;
   private String[] T01SH2_A5691EntBnc ;
   private String[] T01SH2_A7695EntCC ;
   private short[] T01SH2_A7696EntCCoCod ;
   private java.math.BigDecimal[] T01SH2_A10782EntUniAlb ;
   private String[] T01SH2_A10783EntObs ;
   private String[] T01SH2_A10187EntRemNro ;
   private java.util.Date[] T01SH2_A10186EntRemFch ;
   private String[] T01SH2_A10185EntRemSuc ;
   private long[] T01SH2_A13235EntLoteID ;
   private String[] T01SH2_A13456EntUbicaci ;
   private java.util.Date[] T01SH2_A5690EntHfCon ;
   private java.util.Date[] T01SH2_A5689EntFfCon ;
   private java.util.Date[] T01SH2_A5688EntHiCon ;
   private java.util.Date[] T01SH2_A5687EntFiCon ;
   private byte[] T01SH2_A14035EntNEmb ;
   private String[] T01SH2_A396EmprCod ;
   private int[] T01SH2_A658PedCod ;
   private boolean[] T01SH2_n658PedCod ;
   private String[] T01SH2_A719PrdNum ;
   private boolean[] T01SH2_n719PrdNum ;
   private java.math.BigDecimal[] T01SH107_A657PedCanEnt ;
   private java.util.Date[] T01SH107_A663PedFulEnt ;
   private java.math.BigDecimal[] T01SH107_A665PedPre ;
   private java.math.BigDecimal[] T01SH107_A669PedUni ;
   private String[] T01SH107_A659PedCum ;
   private java.math.BigDecimal[] T01SH107_A660PedDto ;
   private java.util.Date[] T01SH111_A661PedFec ;
   private String[] T01SH111_A667PedSit ;
   private String[] T01SH111_A666PedPri ;
   private byte[] T01SH111_A12580PedAlmc ;
   private java.math.BigDecimal[] T01SH112_A657PedCanEnt ;
   private java.util.Date[] T01SH112_A663PedFulEnt ;
   private java.math.BigDecimal[] T01SH112_A665PedPre ;
   private java.math.BigDecimal[] T01SH112_A669PedUni ;
   private String[] T01SH112_A659PedCum ;
   private java.math.BigDecimal[] T01SH112_A660PedDto ;
   private String[] T01SH114_A396EmprCod ;
   private String[] T01SH114_A719PrdNum ;
   private boolean[] T01SH114_n719PrdNum ;
   private short[] T01SH114_A597LinEnt ;
   private String[] T01SH115_A396EmprCod ;
   private int[] T01SH115_A658PedCod ;
   private boolean[] T01SH115_n658PedCod ;
   private String[] T01SH115_A719PrdNum ;
   private boolean[] T01SH115_n719PrdNum ;
   private String[] T01SH115_A659PedCum ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private java.math.BigDecimal[] T01SH5_A657PedCanEnt ;
   private java.util.Date[] T01SH5_A663PedFulEnt ;
   private java.math.BigDecimal[] T01SH5_A665PedPre ;
   private java.math.BigDecimal[] T01SH5_A669PedUni ;
   private String[] T01SH5_A659PedCum ;
   private java.math.BigDecimal[] T01SH5_A660PedDto ;
   private com.genexus.webpanels.GXWebForm Form ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV52TrnContext ;
   private app.wwpbaseobjects.SdtWWPTransactionContext_Attribute AV53TrnContextAtt ;
   private app.wwpbaseobjects.SdtWWPContext AV58WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext9[] ;
}

final  class entradaproducto__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class entradaproducto__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class entradaproducto__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class entradaproducto__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class entradaproducto__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01SH2", "SELECT LinEnt, EntFabId, EntPrvNum, EntFecEnt, EntRemTpo, EntPedCum, EntCon, EntUniRem, EntPre, Albaran, EntNAlbar, EntUniEnt, EntNumCon, EntLotN, EntFVal, EntEti, EntConIni, EntConFin, EntBnc, EntCC, EntCCoCod, EntUniAlb, EntObs, EntRemNro, EntRemFch, EntRemSuc, EntLoteID, EntUbicaci, EntHfCon, EntFfCon, EntHiCon, EntFiCon, EntNEmb, EmprCod, PedCod, PrdNum FROM TXPENTALM WHERE EmprCod = ? AND PrdNum = ? AND LinEnt = ?  FOR UPDATE OF EntFabId, EntPrvNum, EntFecEnt, EntRemTpo, EntPedCum, EntCon, EntUniRem, EntPre, Albaran, EntNAlbar, EntUniEnt, EntNumCon, EntLotN, EntFVal, EntEti, EntConIni, EntConFin, EntBnc, EntCC, EntCCoCod, EntUniAlb, EntObs, EntRemNro, EntRemFch, EntRemSuc, EntLoteID, EntUbicaci, EntHfCon, EntFfCon, EntHiCon, EntFiCon, EntNEmb, PedCod NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SH3", "SELECT LinEnt, EntFabId, EntPrvNum, EntFecEnt, EntRemTpo, EntPedCum, EntCon, EntUniRem, EntPre, Albaran, EntNAlbar, EntUniEnt, EntNumCon, EntLotN, EntFVal, EntEti, EntConIni, EntConFin, EntBnc, EntCC, EntCCoCod, EntUniAlb, EntObs, EntRemNro, EntRemFch, EntRemSuc, EntLoteID, EntUbicaci, EntHfCon, EntFfCon, EntHiCon, EntFiCon, EntNEmb, EmprCod, PedCod, PrdNum FROM TXPENTALM WHERE EmprCod = ? AND PrdNum = ? AND LinEnt = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SH4", "SELECT PedFec, PedSit, PedPri, PedAlmc FROM TXPCPEDID WHERE EmprCod = ? AND PedCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SH5", "SELECT PedCanEnt, PedFulEnt, PedPre, PedUni, PedCum, PedDto FROM TXPLPEDID WHERE EmprCod = ? AND PedCod = ? AND PrdNum = ?  FOR UPDATE OF PedCanEnt, PedFulEnt NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SH6", "SELECT PedCanEnt, PedFulEnt, PedPre, PedUni, PedCum, PedDto FROM TXPLPEDID WHERE EmprCod = ? AND PedCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SH8", "SELECT COALESCE( T1.StockRem, 0) AS StockRem FROM (SELECT SUM(EntUniRem) AS StockRem, EmprCod, PrdNum FROM TXPENTALM GROUP BY EmprCod, PrdNum ) T1 WHERE T1.EmprCod = ? AND T1.PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SH9", "SELECT PrdNum, PrdPreMed, PrdPreAnt, PrdNom, PrdPreAct, PrdExiAlm, UltLinEnt, PrdDetPar, PrdFulEnt, PrdCanPen, PrdRotRea, PrdRec, PrdFecPre, PrdPreAc2, PrdValStk, PrdExiCC, EmprCod, PrvNum, ValCod FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ?  FOR UPDATE OF PrdPreMed, PrdPreAnt, PrdNom, PrdPreAct, PrdExiAlm, UltLinEnt, PrdDetPar, PrdFulEnt, PrdCanPen, PrdRotRea, PrdRec, PrdFecPre, PrdPreAc2, PrdValStk, PrdExiCC, PrvNum, ValCod NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SH10", "SELECT PrdNum, PrdPreMed, PrdPreAnt, PrdNom, PrdPreAct, PrdExiAlm, UltLinEnt, PrdDetPar, PrdFulEnt, PrdCanPen, PrdRotRea, PrdRec, PrdFecPre, PrdPreAc2, PrdValStk, PrdExiCC, EmprCod, PrvNum, ValCod FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SH11", "SELECT EmprNom, EmpNumDec FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SH12", "SELECT PrvNom, PrvPri FROM TXPPRVGEN WHERE EmprCod = ? AND PrvNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SH13", "SELECT EmprCod FROM TXPTIPVAL WHERE EmprCod = ? AND ValCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SH15", "SELECT /*+ FIRST_ROWS(100) */ TM1.PrdNum, TM1.PrdPreMed, TM1.PrdPreAnt, TM1.PrdNom, T3.PrvNom, TM1.PrdPreAct, TM1.PrdExiAlm, TM1.UltLinEnt, TM1.PrdDetPar, TM1.PrdFulEnt, TM1.PrdCanPen, TM1.PrdRotRea, TM1.PrdRec, TM1.PrdFecPre, T2.EmprNom, T3.PrvPri, T2.EmpNumDec, TM1.PrdPreAc2, TM1.PrdValStk, TM1.PrdExiCC, TM1.EmprCod, TM1.PrvNum, TM1.ValCod, COALESCE( T4.StockRem, 0) AS StockRem FROM (((TXPPRODUC TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) INNER JOIN TXPPRVGEN T3 ON T3.EmprCod = TM1.EmprCod AND T3.PrvNum = TM1.PrvNum) LEFT JOIN (SELECT SUM(EntUniRem) AS StockRem, EmprCod, PrdNum FROM TXPENTALM GROUP BY EmprCod, PrdNum ) T4 ON T4.EmprCod = TM1.EmprCod AND T4.PrdNum = TM1.PrdNum) WHERE TM1.EmprCod = ? and TM1.PrdNum = ? ORDER BY TM1.EmprCod, TM1.PrdNum ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SH16", "SELECT PrvNom, PrvPri FROM TXPPRVGEN WHERE EmprCod = ? AND PrvNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SH17", "SELECT EmprCod FROM TXPTIPVAL WHERE EmprCod = ? AND ValCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SH19", "SELECT COALESCE( T1.StockRem, 0) AS StockRem FROM (SELECT SUM(EntUniRem) AS StockRem, EmprCod, PrdNum FROM TXPENTALM GROUP BY EmprCod, PrdNum ) T1 WHERE T1.EmprCod = ? AND T1.PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SH20", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, PrdNum FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SH21", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, PrdNum FROM TXPPRODUC WHERE ( EmprCod > ? or EmprCod = ? and PrdNum > ?) ORDER BY EmprCod, PrdNum) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01SH22", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, PrdNum FROM TXPPRODUC WHERE ( EmprCod < ? or EmprCod = ? and PrdNum < ?) ORDER BY EmprCod DESC, PrdNum DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01SH23", "INSERT INTO TXPPRODUC(PrdNum, PrdPreMed, PrdPreAnt, PrdNom, PrdPreAct, PrdExiAlm, UltLinEnt, PrdDetPar, PrdFulEnt, PrdCanPen, PrdRotRea, PrdRec, PrdFecPre, PrdPreAc2, PrdValStk, PrdExiCC, EmprCod, PrvNum, ValCod, MovEspULin, PrdUltDCC, PrdUltECC, PrdUltCCC, PrdExiCCP, PrdDifCC, PrdFacCon, PrdConDia, PrdStkMinU, PrdStkMinD, PrdDiaRot, PrdPlaEnt, MetCod, PrdLotMin, PrdNumUco, PrdCanRes, PrdFulPed, PrdFulCC, PrdConCC, PrdDscTec, PrdUniCom, PrdUniCon, PrdRefPrv, PrdSus, PrdCalNec, PrdSit, TipDtoCod, DifValStk, PrdFecEnt, PrdPosX, PrdPosY, PrdTip, PrdDqo, PrdRev, PrdTnq, CCStKULin, PrdUMeFo, PrdNom2, PrdNum2, PrdObs, PrdDensS, PrdConcS, PrdSalM, PrdSolub, PrdNumCent, TipPrdCod, PrdNumct1, PrdNumct2, PrdHorMad, PrdPreRef, Mat_Lts, PrdExiAlmc, Almc_Ult, PrdAltAct, PrdPesCon, PrdPesTerm, CC_Ultln, PrdSal, SubFamCod, PrdInc, PrdComp, PrdAox, PrdNCAS, PrdFT, PrdFFT, PrdHS, PrdFHS, PrdReach, PrdOkotex, PrdColIdx, PrdLote, PrdRTM, PrdCtw1, PrdCtw2, PrdCtw3, PrdNroCAS, PrdGots, PrdHm, PrdConct, PrdEINECS, PrdFuncion, PrdNmQu, PrdEqLP, PrdConc, PrdCtw4, PrdList, PrdFabId, PrdLoteOb, PrdRGB, PrdZDHC, PrdTHELIST, PrdUbicaci, PrdCantAtM, PrdGruFamI, PrdMatSeca, AlmPrdID, PrdLoteFch, PrdFTdoc, PrdFSdoc, PrdGRS, LocUtiID, ForAlmID, PrdFibra, PrdCosto, PrdZDHCId) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, ' ', 0, 0, ' ', ' ', ' ', 0, 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, ' ', 0, ' ', 0, 0, 0, ' ', ' ', ' ', 0, 0, ' ', 0, ' ', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, ' ', 0, ' ', 0, ' ', ' ', 0, ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', 0, ' ', ' ', ' ', ' ', 0, ' ', ' ', 0, ' ', 0, ' ', ' ', ' ', 0, 0, 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', ' ', ' ', 0, 0, ' ', 0, ' ')", GX_NOMASK, "TXPPRODUC")
         ,new UpdateCursor("T01SH24", "UPDATE TXPPRODUC SET PrdPreMed=?, PrdPreAnt=?, PrdNom=?, PrdPreAct=?, PrdExiAlm=?, UltLinEnt=?, PrdDetPar=?, PrdFulEnt=?, PrdCanPen=?, PrdRotRea=?, PrdRec=?, PrdFecPre=?, PrdPreAc2=?, PrdValStk=?, PrdExiCC=?, PrvNum=?, ValCod=?  WHERE EmprCod = ? AND PrdNum = ?", GX_NOMASK, "TXPPRODUC")
         ,new UpdateCursor("T01SH25", "DELETE FROM TXPPRODUC  WHERE EmprCod = ? AND PrdNum = ?", GX_NOMASK, "TXPPRODUC")
         ,new ForEachCursor("T01SH26", "SELECT PrvNom, PrvPri FROM TXPPRVGEN WHERE EmprCod = ? AND PrvNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SH28", "SELECT COALESCE( T1.StockRem, 0) AS StockRem FROM (SELECT SUM(EntUniRem) AS StockRem, EmprCod, PrdNum FROM TXPENTALM GROUP BY EmprCod, PrdNum ) T1 WHERE T1.EmprCod = ? AND T1.PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SH29", "SELECT * FROM (SELECT EmprCod, PrdNum, NormaID FROM TXPPrdNor WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01SH30", "SELECT * FROM (SELECT EmprCod, PrdNum, TheList FROM TXPCATSUS WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01SH31", "SELECT * FROM (SELECT EmprCod, Lb_numero, Lb_opcion, Lb_linCP, Lb_TipCP FROM TXPENS304 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01SH32", "SELECT * FROM (SELECT EmprCod, AlbProID, AlbProLine FROM TXPLALPRO WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01SH33", "SELECT * FROM (SELECT EmprCod, LDESID, LDESNPeque, LDESComb, LDESFondo, LDESLinea FROM TXPLDES04 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01SH34", "SELECT * FROM (SELECT EmprCod, Lb_NLab, Lb_IDVeces, Lb_LinID FROM TXPENDT02 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01SH35", "SELECT * FROM (SELECT EmprCod, LavMqId, LavMqLnPq, LavMqLn FROM TXPLAVMQ2 WHERE EmprCod = ? AND LavMqPrd = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01SH36", "SELECT * FROM (SELECT EmprCod, PrdNum, Tb1_Cod FROM TXPCdnEnc WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01SH37", "SELECT * FROM (SELECT EmprCod, PrdNumD, PrdNum FROM TXPPRDDI1 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01SH38", "SELECT * FROM (SELECT EmprCod, DocDisID, LinDisID FROM TXPDisPq1 WHERE EmprCod = ? AND PrdDisQu = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01SH39", "SELECT * FROM (SELECT EmprCod, DocDisID FROM TXPDisPqu WHERE EmprCod = ? AND PrdDisQ = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01SH40", "SELECT * FROM (SELECT EmprCod, OrdenCID, OrdenCLnId FROM TXPIngQu1 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01SH41", "SELECT * FROM (SELECT EmprCod, PrdNum, LoteID, LoteFec FROM TXPLOTPRD WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01SH42", "SELECT * FROM (SELECT EmprCod, DevComCod, PrdNum FROM TXPDEVLCO WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01SH43", "SELECT * FROM (SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, EnsCod, EnsLin FROM TXPENSLIN WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01SH44", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, recestncol, recestnpro, recestlin FROM TXPlreest WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01SH45", "SELECT * FROM (SELECT EmprCod, EstNumFor, EstNumCol, EstEspLin FROM TXPLcoprv WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01SH46", "SELECT * FROM (SELECT EmprCod, EstNumFor, EstNumCol, EstProLin FROM TXPLcocol WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01SH47", "SELECT * FROM (SELECT EmprCod, TransferId, TransferLn FROM TXPTRF001 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01SH48", "SELECT * FROM (SELECT EmprCod, TaesId, TaesLn, TaesLnP FROM TXPTAES02 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01SH49", "SELECT * FROM (SELECT EmprCod, PrdNum, H_stklin FROM TXPHCCSTK WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01SH50", "SELECT * FROM (SELECT EmprCod, Pot_num, Pot_lin FROM TXPRECPO1 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01SH51", "SELECT * FROM (SELECT EmprCod, PrdNum, PrdNcasC FROM TXPPRDNCA WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01SH52", "SELECT * FROM (SELECT EmprCod, PrdNum, CFraseR FROM TXPPRDFRR WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01SH53", "SELECT * FROM (SELECT EmprCod, Jt_codigo, Jt_ord FROM TXPJOTA01 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01SH54", "SELECT * FROM (SELECT EmprCod, Bny_dia, Bny_lin FROM TXPBANYO1 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01SH55", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, PrdNum FROM TXPZEPHYR WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01SH56", "SELECT * FROM (SELECT EmprCod, PrdNum, Cod_Rgo FROM TXPPRDTB2 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01SH57", "SELECT * FROM (SELECT EmprCod, PrdNum, Ct_codigo FROM TXPPRDCER WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01SH58", "SELECT * FROM (SELECT EmprCod, OeNum, OeHdr, OeHdrr, OeHdrp, OeLinC, OeComb, Oefondo, OeMolCil, OePasLin, OePasPLi FROM TXPHISOE4 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01SH59", "SELECT * FROM (SELECT EmprCod, OeNum, OeHdr, OeHdrr, OeHdrp, OeLinC, OeComb, Oefondo, OeMolCil, OeMolLin FROM TXPHISOE2 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01SH60", "SELECT * FROM (SELECT EmprCod, Pas_Num, PrdNum FROM TXPMAKEP1 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01SH61", "SELECT * FROM (SELECT EmprCod, PrdNum, CC_AlmCod FROM TXPPRDALM WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01SH62", "SELECT * FROM (SELECT EmprCod, PrdNum, Almc_Ln FROM TXPALMCON WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01SH63", "SELECT * FROM (SELECT EmprCod, PrdNum, Mat_PrdN FROM TXPMATPRD WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01SH64", "SELECT * FROM (SELECT EmprCod, Pet_cod, PrdNum FROM TXPPETCC1 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01SH65", "SELECT * FROM (SELECT EmprCod, PrdNum, RecFecHr FROM TXPINVPRD WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01SH66", "SELECT * FROM (SELECT EmprCod, PrdNum, PrdAnyo, PrdProv FROM TXPINSEST WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01SH67", "SELECT * FROM (SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, Sim_lin FROM TXPFORLIS WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01SH68", "SELECT * FROM (SELECT EmprCod, Vir_Codigo, PrdNum FROM TXPALMVI1 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01SH69", "SELECT * FROM (SELECT EmprCod, Lb_TaAuxC, lb_TaAuxL, Lb_TauxLP FROM TXPENS007 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01SH70", "SELECT * FROM (SELECT EmprCod, PreCoNum, PrdNum FROM TXPPRESO1 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01SH71", "SELECT * FROM (SELECT EmprCod, PrdNum, PrdPrv FROM TXPPROPRV WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01SH72", "SELECT * FROM (SELECT EmprCod, PrdNum, PrdSusNum FROM TXPPRDSUS WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01SH73", "SELECT * FROM (SELECT EmprCod, Lb_CodGru, Lb_LinGru FROM TXPENSPR1 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01SH74", "SELECT * FROM (SELECT EmprCod, Lb_numero, Lb_opcion, Lb_LineaPr FROM TXPENS004 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01SH75", "SELECT * FROM (SELECT EmprCod, Lb_numero, Lb_opcion, Lb_LineaC FROM TXPENS003 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01SH76", "SELECT * FROM (SELECT EmprCod, SobCod, PrdNum FROM TXPEstSo1 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01SH77", "SELECT * FROM (SELECT EmprCod, RecPreCod, RecPreLin, RecPreNli FROM TXPPRERLN WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01SH78", "SELECT * FROM (SELECT EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreLinMaq, HreLinPro, HreRecLin FROM TXPHISLRE WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01SH79", "SELECT * FROM (SELECT EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreLinMAL, HreNumAny, PrdNum FROM TXPHISREA WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01SH80", "SELECT * FROM (SELECT EmprCod, CliCod, EstCol, EstColLin FROM TXPLEstCo WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01SH81", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, DisComLin, DisComCod, FonCod, RecMolCod, RecPasLin, RecPasPLi FROM TXPRECDEP WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01SH82", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, DisComLin, DisComCod, FonCod, RecMolCod, RecMolLin FROM TXPRECPRD WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01SH83", "SELECT * FROM (SELECT EmprCod, PasCod, PrdNum FROM TXPLPASTA WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01SH84", "SELECT * FROM (SELECT EmprCod, HisEstHRu, HisEstHRe, HisEstHPa, HisEstLCo, HisEstCom, HisEstFon, PrdNum FROM TXPHISCOL WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01SH85", "SELECT * FROM (SELECT EmprCod, CliCod, SerEst, DibCli, DibInt, ColCom, ColFon, MolCod, ForPrdLin FROM TXPRECPR2 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01SH86", "SELECT * FROM (SELECT EmprCod, PrdNum, CCStkLin FROM TXPCCSTKS WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01SH87", "SELECT * FROM (SELECT EmprCod, CliCod, HMaForSer, HMaForCNom, HMaForCNum, HMaTipCCod, HMaForNumC, HMaColLin, HMaFec, HmaLin FROM TXPHISMAC WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01SH88", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMAL, RecNumAny, PrdNum FROM TXPLANYAD WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01SH89", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq, RecLinPro, RecLin FROM TXPLRECET WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01SH90", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarDosPro, PrdNum FROM TXPBARDOS WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01SH91", "SELECT * FROM (SELECT EmprCod, EnsLabCod, EnsLabLin FROM TXPLENLAB WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01SH92", "SELECT * FROM (SELECT EmprCod, Workstat, EscMLin FROM TXPESCMAN WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01SH93", "SELECT * FROM (SELECT EmprCod, CumCodCont, PrdNum FROM TXPLCUMCO WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01SH94", "SELECT * FROM (SELECT EmprCod, PrdNum, RecFec FROM TXPRECUEN WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01SH95", "SELECT * FROM (SELECT EmprCod, ForNumCol, PrdLin FROM TXPLPRFOR WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01SH96", "SELECT * FROM (SELECT EmprCod, PrdNum, PrdAny FROM TXPCPRDES WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01SH97", "SELECT * FROM (SELECT EmprCod, PrdNum, PrdComCod FROM TXPLPRDCO WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01SH98", "SELECT * FROM (SELECT EmprCod, PrdNum, PrdAltNum FROM TXPPRDALT WHERE EmprCod = ? AND PrdAltNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01SH99", "SELECT * FROM (SELECT EmprCod, PedCod, PrdNum FROM TXPLPEDID WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01SH100", "SELECT * FROM (SELECT EmprCod, ForNumCol, ColLin FROM TXPLDFORM WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01SH101", "SELECT * FROM (SELECT EmprCod, PrdNum, NumCon FROM TXPDETCON WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01SH102", "UPDATE TXPPRODUC SET UltLinEnt=?, PrdExiAlm=?, PrdValStk=?, PrdFulEnt=?, PrdFecPre=?, PrdPreAct=?, PrdCanPen=?, PrdPreMed=?, PrdPreAnt=?  WHERE EmprCod = ? AND PrdNum = ?", GX_NOMASK, "TXPPRODUC")
         ,new ForEachCursor("T01SH103", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, PrdNum FROM TXPPRODUC ORDER BY EmprCod, PrdNum ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SH104", "SELECT T1.LinEnt, T1.EntFabId, T1.EntPrvNum, T1.EntFecEnt, T1.EntRemTpo, T1.EntPedCum, T1.EntCon, T3.PedCanEnt, T3.PedFulEnt, T1.EntUniRem, T1.EntPre, T1.Albaran, T1.EntNAlbar, T2.PedFec, T1.EntUniEnt, T3.PedPre, T3.PedUni, T1.EntNumCon, T1.EntLotN, T1.EntFVal, T1.EntEti, T1.EntConIni, T1.EntConFin, T3.PedCum, T2.PedSit, T2.PedPri, T3.PedDto, T1.EntBnc, T1.EntCC, T1.EntCCoCod, T1.EntUniAlb, T1.EntObs, T1.EntRemNro, T1.EntRemFch, T1.EntRemSuc, T2.PedAlmc, T1.EntLoteID, T1.EntUbicaci, T1.EntHfCon, T1.EntFfCon, T1.EntHiCon, T1.EntFiCon, T1.EntNEmb, T1.EmprCod, T1.PedCod, T1.PrdNum FROM ((TXPENTALM T1 LEFT JOIN TXPCPEDID T2 ON T2.EmprCod = T1.EmprCod AND T2.PedCod = T1.PedCod) LEFT JOIN TXPLPEDID T3 ON T3.EmprCod = T1.EmprCod AND T3.PedCod = T1.PedCod AND T3.PrdNum = T1.PrdNum) WHERE T1.EmprCod = ? and T1.PrdNum = ? and T1.LinEnt = ? and T1.EntCon = 0 ORDER BY T1.EmprCod, T1.PrdNum, T1.LinEnt ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SH105", "SELECT PedFec, PedSit, PedPri, PedAlmc FROM TXPCPEDID WHERE EmprCod = ? AND PedCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SH106", "SELECT EmprCod, PrdNum, LinEnt FROM TXPENTALM WHERE EmprCod = ? AND PrdNum = ? AND LinEnt = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SH107", "SELECT PedCanEnt, PedFulEnt, PedPre, PedUni, PedCum, PedDto FROM TXPLPEDID WHERE EmprCod = ? AND PedCod = ? AND PrdNum = ?  FOR UPDATE OF PedCanEnt, PedFulEnt NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01SH108", "INSERT INTO TXPENTALM(LinEnt, EntFabId, EntPrvNum, EntFecEnt, EntRemTpo, EntPedCum, EntCon, EntUniRem, EntPre, Albaran, EntNAlbar, EntUniEnt, EntNumCon, EntLotN, EntFVal, EntEti, EntConIni, EntConFin, EntBnc, EntCC, EntCCoCod, EntUniAlb, EntObs, EntRemNro, EntRemFch, EntRemSuc, EntLoteID, EntUbicaci, EntHfCon, EntFfCon, EntHiCon, EntFiCon, EntNEmb, EmprCod, PedCod, PrdNum, EntNro) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0)", GX_NOMASK, "TXPENTALM")
         ,new UpdateCursor("T01SH109", "UPDATE TXPENTALM SET EntFabId=?, EntPrvNum=?, EntFecEnt=?, EntRemTpo=?, EntPedCum=?, EntCon=?, EntUniRem=?, EntPre=?, Albaran=?, EntNAlbar=?, EntUniEnt=?, EntNumCon=?, EntLotN=?, EntFVal=?, EntEti=?, EntConIni=?, EntConFin=?, EntBnc=?, EntCC=?, EntCCoCod=?, EntUniAlb=?, EntObs=?, EntRemNro=?, EntRemFch=?, EntRemSuc=?, EntLoteID=?, EntUbicaci=?, EntHfCon=?, EntFfCon=?, EntHiCon=?, EntFiCon=?, EntNEmb=?, PedCod=?  WHERE EmprCod = ? AND PrdNum = ? AND LinEnt = ?", GX_NOMASK, "TXPENTALM")
         ,new UpdateCursor("T01SH110", "DELETE FROM TXPENTALM  WHERE EmprCod = ? AND PrdNum = ? AND LinEnt = ?", GX_NOMASK, "TXPENTALM")
         ,new ForEachCursor("T01SH111", "SELECT PedFec, PedSit, PedPri, PedAlmc FROM TXPCPEDID WHERE EmprCod = ? AND PedCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SH112", "SELECT PedCanEnt, PedFulEnt, PedPre, PedUni, PedCum, PedDto FROM TXPLPEDID WHERE EmprCod = ? AND PedCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01SH113", "UPDATE TXPLPEDID SET PedCanEnt=?, PedFulEnt=?  WHERE EmprCod = ? AND PedCod = ? AND PrdNum = ?", GX_NOMASK, "TXPLPEDID")
         ,new ForEachCursor("T01SH114", "SELECT EmprCod, PrdNum, LinEnt FROM TXPENTALM WHERE EmprCod = ? and PrdNum = ? and EntCon = 0 ORDER BY EmprCod, PrdNum, LinEnt ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SH115", "SELECT EmprCod, PedCod, PrdNum, PedCum FROM TXPLPEDID WHERE EmprCod = ? AND PedCod = ? ORDER BY EmprCod, PedCod, PrdNum ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
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
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 4);
               ((String[]) buf[6])[0] = rslt.getString(6, 1);
               ((byte[]) buf[7])[0] = rslt.getByte(7);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(8,4);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(9,5);
               ((String[]) buf[10])[0] = rslt.getString(10, 10);
               ((String[]) buf[11])[0] = rslt.getString(11, 20);
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(12,2);
               ((short[]) buf[13])[0] = rslt.getShort(13);
               ((String[]) buf[14])[0] = rslt.getString(14, 26);
               ((java.util.Date[]) buf[15])[0] = rslt.getGXDate(15);
               ((byte[]) buf[16])[0] = rslt.getByte(16);
               ((int[]) buf[17])[0] = rslt.getInt(17);
               ((int[]) buf[18])[0] = rslt.getInt(18);
               ((String[]) buf[19])[0] = rslt.getString(19, 10);
               ((String[]) buf[20])[0] = rslt.getString(20, 1);
               ((short[]) buf[21])[0] = rslt.getShort(21);
               ((java.math.BigDecimal[]) buf[22])[0] = rslt.getBigDecimal(22,4);
               ((String[]) buf[23])[0] = rslt.getString(23, 100);
               ((String[]) buf[24])[0] = rslt.getString(24, 12);
               ((java.util.Date[]) buf[25])[0] = rslt.getGXDate(25);
               ((String[]) buf[26])[0] = rslt.getString(26, 4);
               ((long[]) buf[27])[0] = rslt.getLong(27);
               ((String[]) buf[28])[0] = rslt.getString(28, 20);
               ((java.util.Date[]) buf[29])[0] = GXutil.resetDate(rslt.getGXDateTime(29));
               ((java.util.Date[]) buf[30])[0] = rslt.getGXDate(30);
               ((java.util.Date[]) buf[31])[0] = GXutil.resetDate(rslt.getGXDateTime(31));
               ((java.util.Date[]) buf[32])[0] = rslt.getGXDate(32);
               ((byte[]) buf[33])[0] = rslt.getByte(33);
               ((String[]) buf[34])[0] = rslt.getString(34, 3);
               ((int[]) buf[35])[0] = rslt.getInt(35);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((String[]) buf[37])[0] = rslt.getString(36, 6);
               return;
            case 1 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 4);
               ((String[]) buf[6])[0] = rslt.getString(6, 1);
               ((byte[]) buf[7])[0] = rslt.getByte(7);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(8,4);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(9,5);
               ((String[]) buf[10])[0] = rslt.getString(10, 10);
               ((String[]) buf[11])[0] = rslt.getString(11, 20);
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(12,2);
               ((short[]) buf[13])[0] = rslt.getShort(13);
               ((String[]) buf[14])[0] = rslt.getString(14, 26);
               ((java.util.Date[]) buf[15])[0] = rslt.getGXDate(15);
               ((byte[]) buf[16])[0] = rslt.getByte(16);
               ((int[]) buf[17])[0] = rslt.getInt(17);
               ((int[]) buf[18])[0] = rslt.getInt(18);
               ((String[]) buf[19])[0] = rslt.getString(19, 10);
               ((String[]) buf[20])[0] = rslt.getString(20, 1);
               ((short[]) buf[21])[0] = rslt.getShort(21);
               ((java.math.BigDecimal[]) buf[22])[0] = rslt.getBigDecimal(22,4);
               ((String[]) buf[23])[0] = rslt.getString(23, 100);
               ((String[]) buf[24])[0] = rslt.getString(24, 12);
               ((java.util.Date[]) buf[25])[0] = rslt.getGXDate(25);
               ((String[]) buf[26])[0] = rslt.getString(26, 4);
               ((long[]) buf[27])[0] = rslt.getLong(27);
               ((String[]) buf[28])[0] = rslt.getString(28, 20);
               ((java.util.Date[]) buf[29])[0] = GXutil.resetDate(rslt.getGXDateTime(29));
               ((java.util.Date[]) buf[30])[0] = rslt.getGXDate(30);
               ((java.util.Date[]) buf[31])[0] = GXutil.resetDate(rslt.getGXDateTime(31));
               ((java.util.Date[]) buf[32])[0] = rslt.getGXDate(32);
               ((byte[]) buf[33])[0] = rslt.getByte(33);
               ((String[]) buf[34])[0] = rslt.getString(34, 3);
               ((int[]) buf[35])[0] = rslt.getInt(35);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((String[]) buf[37])[0] = rslt.getString(36, 6);
               return;
            case 2 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDate(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 3 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,5);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               return;
            case 4 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,5);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               return;
            case 5 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,4);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,5);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,5);
               ((String[]) buf[3])[0] = rslt.getString(4, 26);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,4);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDate(9);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(10,4);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(11,5);
               ((String[]) buf[11])[0] = rslt.getString(12, 1);
               ((java.util.Date[]) buf[12])[0] = rslt.getGXDate(13);
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(14,5);
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(15,2);
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(16,4);
               ((String[]) buf[16])[0] = rslt.getString(17, 3);
               ((int[]) buf[17])[0] = rslt.getInt(18);
               ((byte[]) buf[18])[0] = rslt.getByte(19);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,5);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,5);
               ((String[]) buf[3])[0] = rslt.getString(4, 26);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,4);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDate(9);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(10,4);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(11,5);
               ((String[]) buf[11])[0] = rslt.getString(12, 1);
               ((java.util.Date[]) buf[12])[0] = rslt.getGXDate(13);
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(14,5);
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(15,2);
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(16,4);
               ((String[]) buf[16])[0] = rslt.getString(17, 3);
               ((int[]) buf[17])[0] = rslt.getInt(18);
               ((byte[]) buf[18])[0] = rslt.getByte(19);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((byte[]) buf[2])[0] = rslt.getByte(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((byte[]) buf[2])[0] = rslt.getByte(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,5);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,5);
               ((String[]) buf[3])[0] = rslt.getString(4, 26);
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(6,5);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,4);
               ((short[]) buf[8])[0] = rslt.getShort(8);
               ((String[]) buf[9])[0] = rslt.getString(9, 1);
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDate(10);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(11,4);
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(12,5);
               ((String[]) buf[13])[0] = rslt.getString(13, 1);
               ((java.util.Date[]) buf[14])[0] = rslt.getGXDate(14);
               ((String[]) buf[15])[0] = rslt.getString(15, 30);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((byte[]) buf[17])[0] = rslt.getByte(16);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((byte[]) buf[19])[0] = rslt.getByte(17);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[21])[0] = rslt.getBigDecimal(18,5);
               ((java.math.BigDecimal[]) buf[22])[0] = rslt.getBigDecimal(19,2);
               ((java.math.BigDecimal[]) buf[23])[0] = rslt.getBigDecimal(20,4);
               ((String[]) buf[24])[0] = rslt.getString(21, 3);
               ((int[]) buf[25])[0] = rslt.getInt(22);
               ((byte[]) buf[26])[0] = rslt.getByte(23);
               ((java.math.BigDecimal[]) buf[27])[0] = rslt.getBigDecimal(24,4);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((byte[]) buf[2])[0] = rslt.getByte(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 14 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,4);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((byte[]) buf[2])[0] = rslt.getByte(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 22 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,4);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 4);
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 4);
               return;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               return;
            case 26 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 27 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 12);
               ((String[]) buf[3])[0] = rslt.getString(4, 12);
               ((String[]) buf[4])[0] = rslt.getString(5, 12);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 28 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 29 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
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
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 31 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 32 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 33 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 34 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 35 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 26);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               return;
            case 36 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 37 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               return;
            case 38 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 39 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 40 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 41 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 42 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 43 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((long[]) buf[2])[0] = rslt.getLong(3);
               return;
            case 44 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 45 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 20);
               return;
            case 46 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 20);
               return;
            case 47 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 48 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 49 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               return;
            case 50 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 4);
               return;
            case 51 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 52 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               ((String[]) buf[7])[0] = rslt.getString(8, 12);
               ((byte[]) buf[8])[0] = rslt.getByte(9);
               ((short[]) buf[9])[0] = rslt.getShort(10);
               ((short[]) buf[10])[0] = rslt.getShort(11);
               return;
            case 53 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               ((String[]) buf[7])[0] = rslt.getString(8, 12);
               ((byte[]) buf[8])[0] = rslt.getByte(9);
               ((byte[]) buf[9])[0] = rslt.getByte(10);
               return;
            case 54 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 55 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 56 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 57 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 58 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 59 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDateTime(3);
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
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               return;
            case 61 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 62 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 63 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 4);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 64 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 65 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 66 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 67 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 68 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 69 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 70 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 71 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 72 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               return;
            case 73 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 6);
               return;
            case 74 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 20);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 75 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 12);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((short[]) buf[8])[0] = rslt.getShort(9);
               ((short[]) buf[9])[0] = rslt.getShort(10);
               return;
            case 76 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 12);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((byte[]) buf[8])[0] = rslt.getByte(9);
               return;
            case 77 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 78 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 12);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               ((String[]) buf[7])[0] = rslt.getString(8, 6);
               return;
            case 79 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 12);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((short[]) buf[8])[0] = rslt.getShort(9);
               return;
            case 80 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((long[]) buf[2])[0] = rslt.getLong(3);
               return;
            case 81 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDate(9);
               ((short[]) buf[9])[0] = rslt.getShort(10);
               return;
            case 82 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               return;
            case 83 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 84 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               return;
            case 85 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 86 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 87 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 88 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               return;
            case 89 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
      }
      getresults90( cursor, rslt, buf) ;
   }

   public void getresults90( int cursor ,
                             IFieldGetter rslt ,
                             Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 90 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 91 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 92 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 93 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 94 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 95 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 97 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               return;
            case 98 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 4);
               ((String[]) buf[6])[0] = rslt.getString(6, 1);
               ((byte[]) buf[7])[0] = rslt.getByte(7);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(8,2);
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDate(9);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(10,4);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(11,5);
               ((String[]) buf[12])[0] = rslt.getString(12, 10);
               ((String[]) buf[13])[0] = rslt.getString(13, 20);
               ((java.util.Date[]) buf[14])[0] = rslt.getGXDate(14);
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(15,2);
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(16,5);
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(17,2);
               ((short[]) buf[18])[0] = rslt.getShort(18);
               ((String[]) buf[19])[0] = rslt.getString(19, 26);
               ((java.util.Date[]) buf[20])[0] = rslt.getGXDate(20);
               ((byte[]) buf[21])[0] = rslt.getByte(21);
               ((int[]) buf[22])[0] = rslt.getInt(22);
               ((int[]) buf[23])[0] = rslt.getInt(23);
               ((String[]) buf[24])[0] = rslt.getString(24, 1);
               ((String[]) buf[25])[0] = rslt.getString(25, 1);
               ((String[]) buf[26])[0] = rslt.getString(26, 1);
               ((java.math.BigDecimal[]) buf[27])[0] = rslt.getBigDecimal(27,2);
               ((String[]) buf[28])[0] = rslt.getString(28, 10);
               ((String[]) buf[29])[0] = rslt.getString(29, 1);
               ((short[]) buf[30])[0] = rslt.getShort(30);
               ((java.math.BigDecimal[]) buf[31])[0] = rslt.getBigDecimal(31,4);
               ((String[]) buf[32])[0] = rslt.getString(32, 100);
               ((String[]) buf[33])[0] = rslt.getString(33, 12);
               ((java.util.Date[]) buf[34])[0] = rslt.getGXDate(34);
               ((String[]) buf[35])[0] = rslt.getString(35, 4);
               ((byte[]) buf[36])[0] = rslt.getByte(36);
               ((long[]) buf[37])[0] = rslt.getLong(37);
               ((String[]) buf[38])[0] = rslt.getString(38, 20);
               ((java.util.Date[]) buf[39])[0] = GXutil.resetDate(rslt.getGXDateTime(39));
               ((java.util.Date[]) buf[40])[0] = rslt.getGXDate(40);
               ((java.util.Date[]) buf[41])[0] = GXutil.resetDate(rslt.getGXDateTime(41));
               ((java.util.Date[]) buf[42])[0] = rslt.getGXDate(42);
               ((byte[]) buf[43])[0] = rslt.getByte(43);
               ((String[]) buf[44])[0] = rslt.getString(44, 3);
               ((int[]) buf[45])[0] = rslt.getInt(45);
               ((boolean[]) buf[46])[0] = rslt.wasNull();
               ((String[]) buf[47])[0] = rslt.getString(46, 6);
               return;
            case 99 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDate(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 100 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 101 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,5);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               return;
            case 105 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDate(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 106 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,5);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               return;
            case 108 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 109 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
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
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 6);
               }
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 6);
               }
               return;
            case 5 :
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               return;
            case 14 :
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
            case 15 :
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
            case 16 :
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
            case 17 :
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
            case 18 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 6);
               }
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[2], 5);
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[3], 5);
               stmt.setString(4, (String)parms[4], 26);
               stmt.setBigDecimal(5, (java.math.BigDecimal)parms[5], 5);
               stmt.setBigDecimal(6, (java.math.BigDecimal)parms[6], 4);
               stmt.setShort(7, ((Number) parms[7]).shortValue());
               stmt.setString(8, (String)parms[8], 1);
               stmt.setDate(9, (java.util.Date)parms[9]);
               stmt.setBigDecimal(10, (java.math.BigDecimal)parms[10], 4);
               stmt.setBigDecimal(11, (java.math.BigDecimal)parms[11], 5);
               stmt.setString(12, (String)parms[12], 1);
               stmt.setDate(13, (java.util.Date)parms[13]);
               stmt.setBigDecimal(14, (java.math.BigDecimal)parms[14], 5);
               stmt.setBigDecimal(15, (java.math.BigDecimal)parms[15], 2);
               stmt.setBigDecimal(16, (java.math.BigDecimal)parms[16], 4);
               stmt.setString(17, (String)parms[17], 3);
               stmt.setInt(18, ((Number) parms[18]).intValue());
               stmt.setByte(19, ((Number) parms[19]).byteValue());
               return;
            case 19 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 5);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 5);
               stmt.setString(3, (String)parms[2], 26);
               stmt.setBigDecimal(4, (java.math.BigDecimal)parms[3], 5);
               stmt.setBigDecimal(5, (java.math.BigDecimal)parms[4], 4);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setString(7, (String)parms[6], 1);
               stmt.setDate(8, (java.util.Date)parms[7]);
               stmt.setBigDecimal(9, (java.math.BigDecimal)parms[8], 4);
               stmt.setBigDecimal(10, (java.math.BigDecimal)parms[9], 5);
               stmt.setString(11, (String)parms[10], 1);
               stmt.setDate(12, (java.util.Date)parms[11]);
               stmt.setBigDecimal(13, (java.math.BigDecimal)parms[12], 5);
               stmt.setBigDecimal(14, (java.math.BigDecimal)parms[13], 2);
               stmt.setBigDecimal(15, (java.math.BigDecimal)parms[14], 4);
               stmt.setInt(16, ((Number) parms[15]).intValue());
               stmt.setByte(17, ((Number) parms[16]).byteValue());
               stmt.setString(18, (String)parms[17], 3);
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(19, (String)parms[19], 6);
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
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
            case 41 :
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
               return;
            case 43 :
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
            case 44 :
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
            case 45 :
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
            case 46 :
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
            case 47 :
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
            case 48 :
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
            case 49 :
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
            case 50 :
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
            case 51 :
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
            case 52 :
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
               return;
            case 54 :
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
            case 55 :
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
            case 56 :
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
               return;
            case 58 :
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
            case 59 :
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
      setparameters60( cursor, stmt, parms) ;
   }

   public void setparameters60( int cursor ,
                                IFieldSetter stmt ,
                                Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 60 :
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
            case 61 :
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
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 64 :
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
            case 65 :
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
            case 66 :
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
            case 67 :
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
            case 68 :
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
            case 69 :
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
            case 70 :
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
            case 71 :
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
            case 72 :
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
            case 73 :
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
            case 74 :
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
            case 75 :
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
            case 76 :
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
            case 77 :
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
            case 78 :
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
            case 79 :
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
            case 80 :
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
            case 81 :
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
            case 82 :
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
            case 83 :
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
            case 84 :
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
            case 85 :
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
            case 86 :
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
            case 87 :
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
            case 88 :
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
            case 89 :
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
      setparameters90( cursor, stmt, parms) ;
   }

   public void setparameters90( int cursor ,
                                IFieldSetter stmt ,
                                Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 90 :
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
            case 91 :
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
            case 92 :
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
            case 93 :
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
            case 94 :
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
            case 95 :
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
            case 96 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 4);
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[2], 2);
               stmt.setDate(4, (java.util.Date)parms[3]);
               stmt.setDate(5, (java.util.Date)parms[4]);
               stmt.setBigDecimal(6, (java.math.BigDecimal)parms[5], 5);
               stmt.setBigDecimal(7, (java.math.BigDecimal)parms[6], 4);
               stmt.setBigDecimal(8, (java.math.BigDecimal)parms[7], 5);
               stmt.setBigDecimal(9, (java.math.BigDecimal)parms[8], 5);
               stmt.setString(10, (String)parms[9], 3);
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(11, (String)parms[11], 6);
               }
               return;
            case 98 :
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
            case 99 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 100 :
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
            case 101 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 6);
               }
               return;
            case 102 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(3, ((Number) parms[3]).intValue());
               }
               stmt.setDate(4, (java.util.Date)parms[4]);
               stmt.setString(5, (String)parms[5], 4);
               stmt.setString(6, (String)parms[6], 1);
               stmt.setByte(7, ((Number) parms[7]).byteValue());
               stmt.setBigDecimal(8, (java.math.BigDecimal)parms[8], 4);
               stmt.setBigDecimal(9, (java.math.BigDecimal)parms[9], 5);
               stmt.setString(10, (String)parms[10], 10);
               stmt.setString(11, (String)parms[11], 20);
               stmt.setBigDecimal(12, (java.math.BigDecimal)parms[12], 2);
               stmt.setShort(13, ((Number) parms[13]).shortValue());
               stmt.setString(14, (String)parms[14], 26);
               stmt.setDate(15, (java.util.Date)parms[15]);
               stmt.setByte(16, ((Number) parms[16]).byteValue());
               stmt.setInt(17, ((Number) parms[17]).intValue());
               stmt.setInt(18, ((Number) parms[18]).intValue());
               stmt.setString(19, (String)parms[19], 10);
               stmt.setString(20, (String)parms[20], 1);
               stmt.setShort(21, ((Number) parms[21]).shortValue());
               stmt.setBigDecimal(22, (java.math.BigDecimal)parms[22], 4);
               stmt.setString(23, (String)parms[23], 100);
               stmt.setString(24, (String)parms[24], 12);
               stmt.setDate(25, (java.util.Date)parms[25]);
               stmt.setString(26, (String)parms[26], 4);
               stmt.setLong(27, ((Number) parms[27]).longValue());
               stmt.setString(28, (String)parms[28], 20);
               stmt.setDateTime(29, (java.util.Date)parms[29], true);
               stmt.setDate(30, (java.util.Date)parms[30]);
               stmt.setDateTime(31, (java.util.Date)parms[31], true);
               stmt.setDate(32, (java.util.Date)parms[32]);
               stmt.setByte(33, ((Number) parms[33]).byteValue());
               stmt.setString(34, (String)parms[34], 3);
               if ( ((Boolean) parms[35]).booleanValue() )
               {
                  stmt.setNull( 35 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(35, ((Number) parms[36]).intValue());
               }
               if ( ((Boolean) parms[37]).booleanValue() )
               {
                  stmt.setNull( 36 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(36, (String)parms[38], 6);
               }
               return;
            case 103 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               stmt.setDate(3, (java.util.Date)parms[3]);
               stmt.setString(4, (String)parms[4], 4);
               stmt.setString(5, (String)parms[5], 1);
               stmt.setByte(6, ((Number) parms[6]).byteValue());
               stmt.setBigDecimal(7, (java.math.BigDecimal)parms[7], 4);
               stmt.setBigDecimal(8, (java.math.BigDecimal)parms[8], 5);
               stmt.setString(9, (String)parms[9], 10);
               stmt.setString(10, (String)parms[10], 20);
               stmt.setBigDecimal(11, (java.math.BigDecimal)parms[11], 2);
               stmt.setShort(12, ((Number) parms[12]).shortValue());
               stmt.setString(13, (String)parms[13], 26);
               stmt.setDate(14, (java.util.Date)parms[14]);
               stmt.setByte(15, ((Number) parms[15]).byteValue());
               stmt.setInt(16, ((Number) parms[16]).intValue());
               stmt.setInt(17, ((Number) parms[17]).intValue());
               stmt.setString(18, (String)parms[18], 10);
               stmt.setString(19, (String)parms[19], 1);
               stmt.setShort(20, ((Number) parms[20]).shortValue());
               stmt.setBigDecimal(21, (java.math.BigDecimal)parms[21], 4);
               stmt.setString(22, (String)parms[22], 100);
               stmt.setString(23, (String)parms[23], 12);
               stmt.setDate(24, (java.util.Date)parms[24]);
               stmt.setString(25, (String)parms[25], 4);
               stmt.setLong(26, ((Number) parms[26]).longValue());
               stmt.setString(27, (String)parms[27], 20);
               stmt.setDateTime(28, (java.util.Date)parms[28], true);
               stmt.setDate(29, (java.util.Date)parms[29]);
               stmt.setDateTime(30, (java.util.Date)parms[30], true);
               stmt.setDate(31, (java.util.Date)parms[31]);
               stmt.setByte(32, ((Number) parms[32]).byteValue());
               if ( ((Boolean) parms[33]).booleanValue() )
               {
                  stmt.setNull( 33 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(33, ((Number) parms[34]).intValue());
               }
               stmt.setString(34, (String)parms[35], 3);
               if ( ((Boolean) parms[36]).booleanValue() )
               {
                  stmt.setNull( 35 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(35, (String)parms[37], 6);
               }
               stmt.setShort(36, ((Number) parms[38]).shortValue());
               return;
            case 104 :
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
            case 105 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 106 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 6);
               }
               return;
            case 107 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setDate(2, (java.util.Date)parms[1]);
               stmt.setString(3, (String)parms[2], 3);
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(4, ((Number) parms[4]).intValue());
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[6], 6);
               }
               return;
            case 108 :
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
            case 109 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
      }
   }

}

