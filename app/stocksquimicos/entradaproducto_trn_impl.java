package app.stocksquimicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class entradaproducto_trn_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action73") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         AV45Pgmname = httpContext.GetPar( "Pgmname") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV45Pgmname", AV45Pgmname);
         AV26UsurCod = httpContext.GetPar( "UsurCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV26UsurCod", AV26UsurCod);
         AV27Station = httpContext.GetPar( "Station") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV27Station", AV27Station);
         AV25Inc_obs = httpContext.GetPar( "Inc_obs") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV25Inc_obs", AV25Inc_obs);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_73_1SK42( A396EmprCod, AV45Pgmname, AV26UsurCod, AV27Station, AV25Inc_obs) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action74") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         AV45Pgmname = httpContext.GetPar( "Pgmname") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV45Pgmname", AV45Pgmname);
         AV26UsurCod = httpContext.GetPar( "UsurCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV26UsurCod", AV26UsurCod);
         AV27Station = httpContext.GetPar( "Station") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV27Station", AV27Station);
         AV25Inc_obs = httpContext.GetPar( "Inc_obs") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV25Inc_obs", AV25Inc_obs);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_74_1SK42( A396EmprCod, AV45Pgmname, AV26UsurCod, AV27Station, AV25Inc_obs) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action75") == 0 )
      {
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_75_1SK42( ) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action76") == 0 )
      {
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_76_1SK42( ) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action77") == 0 )
      {
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_77_1SK42( ) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action78") == 0 )
      {
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_78_1SK42( ) ;
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
         xc_79_1SK42( ) ;
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
         xc_80_1SK42( ) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action81") == 0 )
      {
         Gx_mode = httpContext.GetPar( "Mode") ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A6156EntPrvNum = (int)(GXutil.lval( httpContext.GetPar( "EntPrvNum"))) ;
         n6156EntPrvNum = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A6156EntPrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6156EntPrvNum), 6, 0));
         A415EntFecEnt = localUtil.parseDateParm( httpContext.GetPar( "EntFecEnt")) ;
         httpContext.ajax_rsp_assign_attri("", false, "A415EntFecEnt", localUtil.format(A415EntFecEnt, "99/99/99"));
         A658PedCod = (int)(GXutil.lval( httpContext.GetPar( "PedCod"))) ;
         n658PedCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A658PedCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A658PedCod), 8, 0));
         A418EntUniEnt = CommonUtil.decimalVal( httpContext.GetPar( "EntUniEnt"), ".") ;
         httpContext.ajax_rsp_assign_attri("", false, "A418EntUniEnt", GXutil.ltrimstr( A418EntUniEnt, 9, 2));
         A417EntPre = CommonUtil.decimalVal( httpContext.GetPar( "EntPre"), ".") ;
         httpContext.ajax_rsp_assign_attri("", false, "A417EntPre", GXutil.ltrimstr( A417EntPre, 14, 5));
         AV22PedPri = httpContext.GetPar( "PedPri") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV22PedPri", AV22PedPri);
         A597LinEnt = (short)(GXutil.lval( httpContext.GetPar( "LinEnt"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A597LinEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A597LinEnt), 4, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_81_1SK42( Gx_mode, A396EmprCod, A6156EntPrvNum, A415EntFecEnt, A658PedCod, A418EntUniEnt, A417EntPre, AV22PedPri, A597LinEnt) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action82") == 0 )
      {
         Gx_mode = httpContext.GetPar( "Mode") ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A6156EntPrvNum = (int)(GXutil.lval( httpContext.GetPar( "EntPrvNum"))) ;
         n6156EntPrvNum = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A6156EntPrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6156EntPrvNum), 6, 0));
         A719PrdNum = httpContext.GetPar( "PrdNum") ;
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         A718PrdNom = httpContext.GetPar( "PrdNom") ;
         httpContext.ajax_rsp_assign_attri("", false, "A718PrdNom", A718PrdNom);
         A415EntFecEnt = localUtil.parseDateParm( httpContext.GetPar( "EntFecEnt")) ;
         httpContext.ajax_rsp_assign_attri("", false, "A415EntFecEnt", localUtil.format(A415EntFecEnt, "99/99/99"));
         A658PedCod = (int)(GXutil.lval( httpContext.GetPar( "PedCod"))) ;
         n658PedCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A658PedCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A658PedCod), 8, 0));
         A418EntUniEnt = CommonUtil.decimalVal( httpContext.GetPar( "EntUniEnt"), ".") ;
         httpContext.ajax_rsp_assign_attri("", false, "A418EntUniEnt", GXutil.ltrimstr( A418EntUniEnt, 9, 2));
         A417EntPre = CommonUtil.decimalVal( httpContext.GetPar( "EntPre"), ".") ;
         httpContext.ajax_rsp_assign_attri("", false, "A417EntPre", GXutil.ltrimstr( A417EntPre, 14, 5));
         AV22PedPri = httpContext.GetPar( "PedPri") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV22PedPri", AV22PedPri);
         A597LinEnt = (short)(GXutil.lval( httpContext.GetPar( "LinEnt"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A597LinEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A597LinEnt), 4, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_82_1SK42( Gx_mode, A396EmprCod, A6156EntPrvNum, A719PrdNum, A718PrdNom, A415EntFecEnt, A658PedCod, A418EntUniEnt, A417EntPre, AV22PedPri, A597LinEnt) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action83") == 0 )
      {
         Gx_mode = httpContext.GetPar( "Mode") ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A719PrdNum = httpContext.GetPar( "PrdNum") ;
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         A415EntFecEnt = localUtil.parseDateParm( httpContext.GetPar( "EntFecEnt")) ;
         httpContext.ajax_rsp_assign_attri("", false, "A415EntFecEnt", localUtil.format(A415EntFecEnt, "99/99/99"));
         A418EntUniEnt = CommonUtil.decimalVal( httpContext.GetPar( "EntUniEnt"), ".") ;
         httpContext.ajax_rsp_assign_attri("", false, "A418EntUniEnt", GXutil.ltrimstr( A418EntUniEnt, 9, 2));
         A417EntPre = CommonUtil.decimalVal( httpContext.GetPar( "EntPre"), ".") ;
         httpContext.ajax_rsp_assign_attri("", false, "A417EntPre", GXutil.ltrimstr( A417EntPre, 14, 5));
         A597LinEnt = (short)(GXutil.lval( httpContext.GetPar( "LinEnt"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A597LinEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A597LinEnt), 4, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_83_1SK42( Gx_mode, A396EmprCod, A719PrdNum, A415EntFecEnt, A418EntUniEnt, A417EntPre, A597LinEnt) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action84") == 0 )
      {
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_84_1SK42( ) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action85") == 0 )
      {
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_85_1SK42( ) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action86") == 0 )
      {
         Gx_mode = httpContext.GetPar( "Mode") ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A719PrdNum = httpContext.GetPar( "PrdNum") ;
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         A597LinEnt = (short)(GXutil.lval( httpContext.GetPar( "LinEnt"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A597LinEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A597LinEnt), 4, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_86_1SK42( Gx_mode, A396EmprCod, A719PrdNum, A597LinEnt) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action87") == 0 )
      {
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_87_1SK42( ) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action88") == 0 )
      {
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_88_1SK42( ) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action89") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A719PrdNum = httpContext.GetPar( "PrdNum") ;
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         A6156EntPrvNum = (int)(GXutil.lval( httpContext.GetPar( "EntPrvNum"))) ;
         n6156EntPrvNum = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A6156EntPrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6156EntPrvNum), 6, 0));
         A417EntPre = CommonUtil.decimalVal( httpContext.GetPar( "EntPre"), ".") ;
         httpContext.ajax_rsp_assign_attri("", false, "A417EntPre", GXutil.ltrimstr( A417EntPre, 14, 5));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_89_1SK42( A396EmprCod, A719PrdNum, A6156EntPrvNum, A417EntPre) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel4"+"_"+"PRDULTMOVF") == 0 )
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
         gx4asaprdultmovf1SK42( A396EmprCod, A719PrdNum) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel5"+"_"+"ULTFECCCS") == 0 )
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
         gx5asaultfecccs1SK42( A396EmprCod, A719PrdNum) ;
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
         gxasa111SK42( A396EmprCod) ;
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
         gxasa128571SK42( A396EmprCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel16"+"_"+"") == 0 )
      {
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel58"+"_"+"PEDNUMLIN") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A658PedCod = (int)(GXutil.lval( httpContext.GetPar( "PedCod"))) ;
         n658PedCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A658PedCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A658PedCod), 8, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx58asapednumlin1SK42( A396EmprCod, A658PedCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_92") == 0 )
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
         gxload_92( A396EmprCod, A719PrdNum) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_93") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A658PedCod = (int)(GXutil.lval( httpContext.GetPar( "PedCod"))) ;
         n658PedCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A658PedCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A658PedCod), 8, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_93( A396EmprCod, A658PedCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_94") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A658PedCod = (int)(GXutil.lval( httpContext.GetPar( "PedCod"))) ;
         n658PedCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A658PedCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A658PedCod), 8, 0));
         A719PrdNum = httpContext.GetPar( "PrdNum") ;
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_94( A396EmprCod, A658PedCod, A719PrdNum) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_95") == 0 )
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
         gxload_95( A396EmprCod, A795PrvNum) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_96") == 0 )
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
         gxload_96( A396EmprCod, A719PrdNum) ;
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
            AV8PrdNum = httpContext.GetPar( "PrdNum") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV8PrdNum", AV8PrdNum);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPRDNUM", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV8PrdNum, ""))));
            AV9LinEnt = (short)(GXutil.lval( httpContext.GetPar( "LinEnt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV9LinEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9LinEnt), 4, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vLINENT", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV9LinEnt), "ZZZ9")));
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Entrada Producto (linea)", ""), (short)(0)) ;
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

   public entradaproducto_trn_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public entradaproducto_trn_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( entradaproducto_trn_impl.class ));
   }

   public entradaproducto_trn_impl( int remoteHandle ,
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdNum_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPrdNum_Internalname, httpContext.getMessage( "Producto", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 22,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdNum_Internalname, GXutil.rtrim( A719PrdNum), GXutil.rtrim( localUtil.format( A719PrdNum, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,22);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdNum_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPrdNum_Enabled, 1, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_StocksQuimicos\\EntradaProducto_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdNom_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPrdNom_Internalname, httpContext.getMessage( "Descripcion", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdNom_Internalname, GXutil.rtrim( A718PrdNom), GXutil.rtrim( localUtil.format( A718PrdNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdNom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPrdNom_Enabled, 0, "text", "", 26, "chr", 1, "row", 26, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_StocksQuimicos\\EntradaProducto_TRN.htm");
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
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable1_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
      /* User Defined Control */
      ucDvpanel_unnamedtable2.setProperty("Width", Dvpanel_unnamedtable2_Width);
      ucDvpanel_unnamedtable2.setProperty("AutoWidth", Dvpanel_unnamedtable2_Autowidth);
      ucDvpanel_unnamedtable2.setProperty("AutoHeight", Dvpanel_unnamedtable2_Autoheight);
      ucDvpanel_unnamedtable2.setProperty("Cls", Dvpanel_unnamedtable2_Cls);
      ucDvpanel_unnamedtable2.setProperty("Title", Dvpanel_unnamedtable2_Title);
      ucDvpanel_unnamedtable2.setProperty("Collapsible", Dvpanel_unnamedtable2_Collapsible);
      ucDvpanel_unnamedtable2.setProperty("Collapsed", Dvpanel_unnamedtable2_Collapsed);
      ucDvpanel_unnamedtable2.setProperty("ShowCollapseIcon", Dvpanel_unnamedtable2_Showcollapseicon);
      ucDvpanel_unnamedtable2.setProperty("IconPosition", Dvpanel_unnamedtable2_Iconposition);
      ucDvpanel_unnamedtable2.setProperty("AutoScroll", Dvpanel_unnamedtable2_Autoscroll);
      ucDvpanel_unnamedtable2.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_unnamedtable2_Internalname, "DVPANEL_UNNAMEDTABLE2Container");
      httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_UNNAMEDTABLE2Container"+"UnnamedTable2"+"\" style=\"display:none;\">") ;
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable2_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtLinEnt_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtLinEnt_Internalname, "#", "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 42,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtLinEnt_Internalname, GXutil.ltrim( localUtil.ntoc( A597LinEnt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A597LinEnt), "ZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,42);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtLinEnt_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtLinEnt_Enabled, 1, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_StocksQuimicos\\EntradaProducto_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtEntFecEnt_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtEntFecEnt_Internalname, httpContext.getMessage( "Fecha", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtEntFecEnt_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEntFecEnt_Internalname, localUtil.format(A415EntFecEnt, "99/99/99"), localUtil.format( A415EntFecEnt, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,46);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEntFecEnt_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtEntFecEnt_Enabled, 1, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_StocksQuimicos\\EntradaProducto_TRN.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtEntFecEnt_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtEntFecEnt_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_StocksQuimicos\\EntradaProducto_TRN.htm");
      httpContext.writeTextNL( "</div>") ;
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divAlbaran_cell_Internalname, 1, 0, "px", 0, "px", divAlbaran_cell_Class, "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", edtAlbaran_Visible, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbaran_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbaran_Internalname, httpContext.getMessage( "N Albaran", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 50,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbaran_Internalname, GXutil.rtrim( A11Albaran), GXutil.rtrim( localUtil.format( A11Albaran, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,50);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbaran_Jsonclick, 0, "AttributeFL", "", "", "", "", edtAlbaran_Visible, edtAlbaran_Enabled, 1, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_StocksQuimicos\\EntradaProducto_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divEntnalbar_cell_Internalname, 1, 0, "px", 0, "px", divEntnalbar_cell_Class, "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", edtEntNAlbar_Visible, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtEntNAlbar_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtEntNAlbar_Internalname, httpContext.getMessage( "N Albaran", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 54,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEntNAlbar_Internalname, GXutil.rtrim( A12857EntNAlbar), GXutil.rtrim( localUtil.format( A12857EntNAlbar, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,54);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEntNAlbar_Jsonclick, 0, "AttributeFL", "", "", "", "", edtEntNAlbar_Visible, edtEntNAlbar_Enabled, 1, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_StocksQuimicos\\EntradaProducto_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPedCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPedCod_Internalname, httpContext.getMessage( "Nº Pedido", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 58,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPedCod_Internalname, GXutil.ltrim( localUtil.ntoc( A658PedCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A658PedCod), "ZZZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,58);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPedCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPedCod_Enabled, 1, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_StocksQuimicos\\EntradaProducto_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtEntPrvNum_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtEntPrvNum_Internalname, httpContext.getMessage( "Proveedor", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 62,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEntPrvNum_Internalname, GXutil.ltrim( localUtil.ntoc( A6156EntPrvNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A6156EntPrvNum), "ZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,62);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEntPrvNum_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtEntPrvNum_Enabled, 1, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_StocksQuimicos\\EntradaProducto_TRN.htm");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtEntUniEnt_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtEntUniEnt_Internalname, httpContext.getMessage( "Uds  Ent", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 70,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEntUniEnt_Internalname, GXutil.ltrim( localUtil.ntoc( A418EntUniEnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( A418EntUniEnt, "ZZZZZ9.99")), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,70);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEntUniEnt_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtEntUniEnt_Enabled, 1, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_StocksQuimicos\\EntradaProducto_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtEntPre_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtEntPre_Internalname, httpContext.getMessage( "Precio", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 74,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEntPre_Internalname, GXutil.ltrim( localUtil.ntoc( A417EntPre, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( A417EntPre, "ZZZZZZZ9.999")), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,74);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEntPre_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtEntPre_Enabled, 1, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_StocksQuimicos\\EntradaProducto_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtEntLotN_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtEntLotN_Internalname, httpContext.getMessage( "Nº Lote", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 78,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEntLotN_Internalname, GXutil.rtrim( A5686EntLotN), GXutil.rtrim( localUtil.format( A5686EntLotN, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,78);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEntLotN_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtEntLotN_Enabled, 1, "text", "", 26, "chr", 1, "row", 26, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_StocksQuimicos\\EntradaProducto_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtEntFVal_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtEntFVal_Internalname, httpContext.getMessage( "Fecha Caducidad", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 82,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtEntFVal_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEntFVal_Internalname, localUtil.format(A5685EntFVal, "99/99/99"), localUtil.format( A5685EntFVal, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,82);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEntFVal_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtEntFVal_Enabled, 1, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_StocksQuimicos\\EntradaProducto_TRN.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtEntFVal_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtEntFVal_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_StocksQuimicos\\EntradaProducto_TRN.htm");
      httpContext.writeTextNL( "</div>") ;
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
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable5_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group TrnActionGroup", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 90,'',false,'',0)\"" ;
      ClassString = "ButtonMaterial" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtntrn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtntrn_enter_Visible, bttBtntrn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_StocksQuimicos\\EntradaProducto_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 92,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtntrn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtntrn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_StocksQuimicos\\EntradaProducto_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 94,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtntrn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtntrn_delete_Visible, bttBtntrn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_StocksQuimicos\\EntradaProducto_TRN.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV45Pgmname), GXutil.rtrim( localUtil.format( AV45Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_StocksQuimicos\\EntradaProducto_TRN.htm");
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
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 102,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEntPedCum_Internalname, GXutil.rtrim( A3404EntPedCum), GXutil.rtrim( localUtil.format( A3404EntPedCum, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,102);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEntPedCum_Jsonclick, 0, "Attribute", "", "", "", "", edtEntPedCum_Visible, edtEntPedCum_Enabled, 1, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_StocksQuimicos\\EntradaProducto_TRN.htm");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEntUniRem_Internalname, GXutil.ltrim( localUtil.ntoc( A419EntUniRem, (byte)(11), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtEntUniRem_Enabled!=0) ? localUtil.format( A419EntUniRem, "ZZZZZ9.9999") : localUtil.format( A419EntUniRem, "ZZZZZ9.9999"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEntUniRem_Jsonclick, 0, "Attribute", "", "", "", "", edtEntUniRem_Visible, edtEntUniRem_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_StocksQuimicos\\EntradaProducto_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
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
      e111SK2 ();
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
            Z597LinEnt = (short)(localUtil.ctol( httpContext.cgiGet( "Z597LinEnt"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z411EntCon = (byte)(localUtil.ctol( httpContext.cgiGet( "Z411EntCon"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z3404EntPedCum = httpContext.cgiGet( "Z3404EntPedCum") ;
            Z419EntUniRem = localUtil.ctond( httpContext.cgiGet( "Z419EntUniRem")) ;
            Z417EntPre = localUtil.ctond( httpContext.cgiGet( "Z417EntPre")) ;
            Z415EntFecEnt = localUtil.ctod( httpContext.cgiGet( "Z415EntFecEnt"), 0) ;
            Z11Albaran = httpContext.cgiGet( "Z11Albaran") ;
            Z12857EntNAlbar = httpContext.cgiGet( "Z12857EntNAlbar") ;
            Z6156EntPrvNum = (int)(localUtil.ctol( httpContext.cgiGet( "Z6156EntPrvNum"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z418EntUniEnt = localUtil.ctond( httpContext.cgiGet( "Z418EntUniEnt")) ;
            Z416EntNumCon = (short)(localUtil.ctol( httpContext.cgiGet( "Z416EntNumCon"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z5686EntLotN = httpContext.cgiGet( "Z5686EntLotN") ;
            Z5685EntFVal = localUtil.ctod( httpContext.cgiGet( "Z5685EntFVal"), 0) ;
            Z414EntEti = (byte)(localUtil.ctol( httpContext.cgiGet( "Z414EntEti"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z413EntConIni = (int)(localUtil.ctol( httpContext.cgiGet( "Z413EntConIni"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z412EntConFin = (int)(localUtil.ctol( httpContext.cgiGet( "Z412EntConFin"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z5691EntBnc = httpContext.cgiGet( "Z5691EntBnc") ;
            Z7695EntCC = httpContext.cgiGet( "Z7695EntCC") ;
            Z7696EntCCoCod = (short)(localUtil.ctol( httpContext.cgiGet( "Z7696EntCCoCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z10782EntUniAlb = localUtil.ctond( httpContext.cgiGet( "Z10782EntUniAlb")) ;
            Z10783EntObs = httpContext.cgiGet( "Z10783EntObs") ;
            Z10187EntRemNro = httpContext.cgiGet( "Z10187EntRemNro") ;
            Z10186EntRemFch = localUtil.ctod( httpContext.cgiGet( "Z10186EntRemFch"), 0) ;
            Z10185EntRemSuc = httpContext.cgiGet( "Z10185EntRemSuc") ;
            Z10184EntRemTpo = httpContext.cgiGet( "Z10184EntRemTpo") ;
            Z12716EntFabId = (int)(localUtil.ctol( httpContext.cgiGet( "Z12716EntFabId"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z13235EntLoteID = localUtil.ctol( httpContext.cgiGet( "Z13235EntLoteID"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
            Z13456EntUbicaci = httpContext.cgiGet( "Z13456EntUbicaci") ;
            Z5690EntHfCon = GXutil.resetDate(localUtil.ctot( httpContext.cgiGet( "Z5690EntHfCon"), 0)) ;
            Z5689EntFfCon = localUtil.ctod( httpContext.cgiGet( "Z5689EntFfCon"), 0) ;
            Z5688EntHiCon = GXutil.resetDate(localUtil.ctot( httpContext.cgiGet( "Z5688EntHiCon"), 0)) ;
            Z5687EntFiCon = localUtil.ctod( httpContext.cgiGet( "Z5687EntFiCon"), 0) ;
            Z658PedCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z658PedCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z726PrdPreMed = localUtil.ctond( httpContext.cgiGet( "Z726PrdPreMed")) ;
            Z718PrdNom = httpContext.cgiGet( "Z718PrdNom") ;
            Z724PrdPreAct = localUtil.ctond( httpContext.cgiGet( "Z724PrdPreAct")) ;
            Z698PrdDetPar = httpContext.cgiGet( "Z698PrdDetPar") ;
            Z713PrdFulEnt = localUtil.ctod( httpContext.cgiGet( "Z713PrdFulEnt"), 0) ;
            Z684PrdCanPen = localUtil.ctond( httpContext.cgiGet( "Z684PrdCanPen")) ;
            Z729PrdRotRea = localUtil.ctond( httpContext.cgiGet( "Z729PrdRotRea")) ;
            Z727PrdRec = httpContext.cgiGet( "Z727PrdRec") ;
            Z725PrdPreAnt = localUtil.ctond( httpContext.cgiGet( "Z725PrdPreAnt")) ;
            Z709PrdFecPre = localUtil.ctod( httpContext.cgiGet( "Z709PrdFecPre"), 0) ;
            Z5255PrdPreAc2 = localUtil.ctond( httpContext.cgiGet( "Z5255PrdPreAc2")) ;
            Z705PrdExiCC = localUtil.ctond( httpContext.cgiGet( "Z705PrdExiCC")) ;
            Z795PrvNum = (int)(localUtil.ctol( httpContext.cgiGet( "Z795PrvNum"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z856ValCod = (byte)(localUtil.ctol( httpContext.cgiGet( "Z856ValCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z665PedPre = localUtil.ctond( httpContext.cgiGet( "Z665PedPre")) ;
            Z669PedUni = localUtil.ctond( httpContext.cgiGet( "Z669PedUni")) ;
            Z663PedFulEnt = localUtil.ctod( httpContext.cgiGet( "Z663PedFulEnt"), 0) ;
            Z659PedCum = httpContext.cgiGet( "Z659PedCum") ;
            Z660PedDto = localUtil.ctond( httpContext.cgiGet( "Z660PedDto")) ;
            A411EntCon = (byte)(localUtil.ctol( httpContext.cgiGet( "Z411EntCon"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A416EntNumCon = (short)(localUtil.ctol( httpContext.cgiGet( "Z416EntNumCon"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A414EntEti = (byte)(localUtil.ctol( httpContext.cgiGet( "Z414EntEti"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A413EntConIni = (int)(localUtil.ctol( httpContext.cgiGet( "Z413EntConIni"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A412EntConFin = (int)(localUtil.ctol( httpContext.cgiGet( "Z412EntConFin"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A5691EntBnc = httpContext.cgiGet( "Z5691EntBnc") ;
            A7695EntCC = httpContext.cgiGet( "Z7695EntCC") ;
            A7696EntCCoCod = (short)(localUtil.ctol( httpContext.cgiGet( "Z7696EntCCoCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A10782EntUniAlb = localUtil.ctond( httpContext.cgiGet( "Z10782EntUniAlb")) ;
            A10783EntObs = httpContext.cgiGet( "Z10783EntObs") ;
            A10187EntRemNro = httpContext.cgiGet( "Z10187EntRemNro") ;
            A10186EntRemFch = localUtil.ctod( httpContext.cgiGet( "Z10186EntRemFch"), 0) ;
            A10185EntRemSuc = httpContext.cgiGet( "Z10185EntRemSuc") ;
            A10184EntRemTpo = httpContext.cgiGet( "Z10184EntRemTpo") ;
            A12716EntFabId = (int)(localUtil.ctol( httpContext.cgiGet( "Z12716EntFabId"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A13235EntLoteID = localUtil.ctol( httpContext.cgiGet( "Z13235EntLoteID"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
            A13456EntUbicaci = httpContext.cgiGet( "Z13456EntUbicaci") ;
            A5690EntHfCon = GXutil.resetDate(localUtil.ctot( httpContext.cgiGet( "Z5690EntHfCon"), 0)) ;
            A5689EntFfCon = localUtil.ctod( httpContext.cgiGet( "Z5689EntFfCon"), 0) ;
            A5688EntHiCon = GXutil.resetDate(localUtil.ctot( httpContext.cgiGet( "Z5688EntHiCon"), 0)) ;
            A5687EntFiCon = localUtil.ctod( httpContext.cgiGet( "Z5687EntFiCon"), 0) ;
            A726PrdPreMed = localUtil.ctond( httpContext.cgiGet( "Z726PrdPreMed")) ;
            A724PrdPreAct = localUtil.ctond( httpContext.cgiGet( "Z724PrdPreAct")) ;
            A698PrdDetPar = httpContext.cgiGet( "Z698PrdDetPar") ;
            A713PrdFulEnt = localUtil.ctod( httpContext.cgiGet( "Z713PrdFulEnt"), 0) ;
            A684PrdCanPen = localUtil.ctond( httpContext.cgiGet( "Z684PrdCanPen")) ;
            A729PrdRotRea = localUtil.ctond( httpContext.cgiGet( "Z729PrdRotRea")) ;
            A727PrdRec = httpContext.cgiGet( "Z727PrdRec") ;
            A725PrdPreAnt = localUtil.ctond( httpContext.cgiGet( "Z725PrdPreAnt")) ;
            A709PrdFecPre = localUtil.ctod( httpContext.cgiGet( "Z709PrdFecPre"), 0) ;
            A5255PrdPreAc2 = localUtil.ctond( httpContext.cgiGet( "Z5255PrdPreAc2")) ;
            A705PrdExiCC = localUtil.ctond( httpContext.cgiGet( "Z705PrdExiCC")) ;
            A795PrvNum = (int)(localUtil.ctol( httpContext.cgiGet( "Z795PrvNum"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A856ValCod = (byte)(localUtil.ctol( httpContext.cgiGet( "Z856ValCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A665PedPre = localUtil.ctond( httpContext.cgiGet( "Z665PedPre")) ;
            A669PedUni = localUtil.ctond( httpContext.cgiGet( "Z669PedUni")) ;
            A663PedFulEnt = localUtil.ctod( httpContext.cgiGet( "Z663PedFulEnt"), 0) ;
            A659PedCum = httpContext.cgiGet( "Z659PedCum") ;
            A660PedDto = localUtil.ctond( httpContext.cgiGet( "Z660PedDto")) ;
            O750PrdValStk = localUtil.ctond( httpContext.cgiGet( "O750PrdValStk")) ;
            O419EntUniRem = localUtil.ctond( httpContext.cgiGet( "O419EntUniRem")) ;
            O418EntUniEnt = localUtil.ctond( httpContext.cgiGet( "O418EntUniEnt")) ;
            O657PedCanEnt = localUtil.ctond( httpContext.cgiGet( "O657PedCanEnt")) ;
            O704PrdExiAlm = localUtil.ctond( httpContext.cgiGet( "O704PrdExiAlm")) ;
            O847UltLinEnt = (short)(localUtil.ctol( httpContext.cgiGet( "O847UltLinEnt"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            O415EntFecEnt = localUtil.ctod( httpContext.cgiGet( "O415EntFecEnt"), 0) ;
            O417EntPre = localUtil.ctond( httpContext.cgiGet( "O417EntPre")) ;
            O5686EntLotN = httpContext.cgiGet( "O5686EntLotN") ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            N658PedCod = (int)(localUtil.ctol( httpContext.cgiGet( "N658PedCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            N415EntFecEnt = localUtil.ctod( httpContext.cgiGet( "N415EntFecEnt"), 0) ;
            N11Albaran = httpContext.cgiGet( "N11Albaran") ;
            N12857EntNAlbar = httpContext.cgiGet( "N12857EntNAlbar") ;
            N6156EntPrvNum = (int)(localUtil.ctol( httpContext.cgiGet( "N6156EntPrvNum"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            N418EntUniEnt = localUtil.ctond( httpContext.cgiGet( "N418EntUniEnt")) ;
            N5686EntLotN = httpContext.cgiGet( "N5686EntLotN") ;
            N417EntPre = localUtil.ctond( httpContext.cgiGet( "N417EntPre")) ;
            N5685EntFVal = localUtil.ctod( httpContext.cgiGet( "N5685EntFVal"), 0) ;
            N3404EntPedCum = httpContext.cgiGet( "N3404EntPedCum") ;
            A396EmprCod = httpContext.cgiGet( "EMPRCOD") ;
            A14040PrdUltMovF = localUtil.ctod( httpContext.cgiGet( "PRDULTMOVF"), 0) ;
            A3835UltFecCCs = localUtil.ctod( httpContext.cgiGet( "ULTFECCCS"), 0) ;
            AV7EmprCod = httpContext.cgiGet( "vEMPRCOD") ;
            AV8PrdNum = httpContext.cgiGet( "vPRDNUM") ;
            AV9LinEnt = (short)(localUtil.ctol( httpContext.cgiGet( "vLINENT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A847UltLinEnt = (short)(localUtil.ctol( httpContext.cgiGet( "ULTLINENT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_BScreen = (byte)(localUtil.ctol( httpContext.cgiGet( "vGXBSCREEN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV13Insert_PedCod = (int)(localUtil.ctol( httpContext.cgiGet( "vINSERT_PEDCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV32Year = (short)(localUtil.ctol( httpContext.cgiGet( "vYEAR"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV34Mes = (short)(localUtil.ctol( httpContext.cgiGet( "vMES"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A800PrvPri = (byte)(localUtil.ctol( httpContext.cgiGet( "PRVPRI"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n800PrvPri = false ;
            A666PedPri = httpContext.cgiGet( "PEDPRI") ;
            AV22PedPri = httpContext.cgiGet( "vPEDPRI") ;
            AV23OldEntPre = localUtil.ctond( httpContext.cgiGet( "vOLDENTPRE")) ;
            A704PrdExiAlm = localUtil.ctond( httpContext.cgiGet( "PRDEXIALM")) ;
            AV35OldExiAlm = localUtil.ctond( httpContext.cgiGet( "vOLDEXIALM")) ;
            AV36OldEntUni = localUtil.ctond( httpContext.cgiGet( "vOLDENTUNI")) ;
            AV37OldRemanente = localUtil.ctond( httpContext.cgiGet( "vOLDREMANENTE")) ;
            AV24oldEntFecent = localUtil.ctod( httpContext.cgiGet( "vOLDENTFECENT"), 0) ;
            AV38oldlote = httpContext.cgiGet( "vOLDLOTE") ;
            AV40UniOld = localUtil.ctond( httpContext.cgiGet( "vUNIOLD")) ;
            AV39FecAnt = localUtil.ctod( httpContext.cgiGet( "vFECANT"), 0) ;
            AV41PrecAnt = localUtil.ctond( httpContext.cgiGet( "vPRECANT")) ;
            AV42AnyAnt = (short)(localUtil.ctol( httpContext.cgiGet( "vANYANT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV43MesAnt = (byte)(localUtil.ctol( httpContext.cgiGet( "vMESANT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A411EntCon = (byte)(localUtil.ctol( httpContext.cgiGet( "ENTCON"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A657PedCanEnt = localUtil.ctond( httpContext.cgiGet( "PEDCANENT")) ;
            A665PedPre = localUtil.ctond( httpContext.cgiGet( "PEDPRE")) ;
            A660PedDto = localUtil.ctond( httpContext.cgiGet( "PEDDTO")) ;
            A750PrdValStk = localUtil.ctond( httpContext.cgiGet( "PRDVALSTK")) ;
            AV30Consumos = (short)(localUtil.ctol( httpContext.cgiGet( "vCONSUMOS"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A705PrdExiCC = localUtil.ctond( httpContext.cgiGet( "PRDEXICC")) ;
            A726PrdPreMed = localUtil.ctond( httpContext.cgiGet( "PRDPREMED")) ;
            AV21Fecha = localUtil.ctod( httpContext.cgiGet( "vFECHA"), 0) ;
            A12716EntFabId = (int)(localUtil.ctol( httpContext.cgiGet( "ENTFABID"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A795PrvNum = (int)(localUtil.ctol( httpContext.cgiGet( "PRVNUM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A10184EntRemTpo = httpContext.cgiGet( "ENTREMTPO") ;
            AV25Inc_obs = httpContext.cgiGet( "vINC_OBS") ;
            AV33DiasFin = (short)(localUtil.ctol( httpContext.cgiGet( "vDIASFIN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A664PedNumLin = (short)(localUtil.ctol( httpContext.cgiGet( "PEDNUMLIN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV26UsurCod = httpContext.cgiGet( "vUSURCOD") ;
            AV27Station = httpContext.cgiGet( "vSTATION") ;
            AV31Nalbaran20 = (short)(localUtil.ctol( httpContext.cgiGet( "vNALBARAN20"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
            A407EmprNom = httpContext.cgiGet( "EMPRNOM") ;
            n407EmprNom = false ;
            A3915EmpNumDec = (byte)(localUtil.ctol( httpContext.cgiGet( "EMPNUMDEC"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n3915EmpNumDec = false ;
            A724PrdPreAct = localUtil.ctond( httpContext.cgiGet( "PRDPREACT")) ;
            A698PrdDetPar = httpContext.cgiGet( "PRDDETPAR") ;
            A713PrdFulEnt = localUtil.ctod( httpContext.cgiGet( "PRDFULENT"), 0) ;
            A684PrdCanPen = localUtil.ctond( httpContext.cgiGet( "PRDCANPEN")) ;
            A729PrdRotRea = localUtil.ctond( httpContext.cgiGet( "PRDROTREA")) ;
            A727PrdRec = httpContext.cgiGet( "PRDREC") ;
            A725PrdPreAnt = localUtil.ctond( httpContext.cgiGet( "PRDPREANT")) ;
            A709PrdFecPre = localUtil.ctod( httpContext.cgiGet( "PRDFECPRE"), 0) ;
            A5255PrdPreAc2 = localUtil.ctond( httpContext.cgiGet( "PRDPREAC2")) ;
            A856ValCod = (byte)(localUtil.ctol( httpContext.cgiGet( "VALCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A661PedFec = localUtil.ctod( httpContext.cgiGet( "PEDFEC"), 0) ;
            A667PedSit = httpContext.cgiGet( "PEDSIT") ;
            A12580PedAlmc = (byte)(localUtil.ctol( httpContext.cgiGet( "PEDALMC"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A669PedUni = localUtil.ctond( httpContext.cgiGet( "PEDUNI")) ;
            A663PedFulEnt = localUtil.ctod( httpContext.cgiGet( "PEDFULENT"), 0) ;
            A659PedCum = httpContext.cgiGet( "PEDCUM") ;
            A794PrvNom = httpContext.cgiGet( "PRVNOM") ;
            n794PrvNom = false ;
            A913StockRem = localUtil.ctond( httpContext.cgiGet( "STOCKREM")) ;
            n913StockRem = false ;
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
            Dvpanel_unnamedtable2_Objectcall = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Objectcall") ;
            Dvpanel_unnamedtable2_Class = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Class") ;
            Dvpanel_unnamedtable2_Enabled = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Enabled")) ;
            Dvpanel_unnamedtable2_Width = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Width") ;
            Dvpanel_unnamedtable2_Height = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Height") ;
            Dvpanel_unnamedtable2_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Autowidth")) ;
            Dvpanel_unnamedtable2_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Autoheight")) ;
            Dvpanel_unnamedtable2_Cls = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Cls") ;
            Dvpanel_unnamedtable2_Showheader = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Showheader")) ;
            Dvpanel_unnamedtable2_Title = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Title") ;
            Dvpanel_unnamedtable2_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Collapsible")) ;
            Dvpanel_unnamedtable2_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Collapsed")) ;
            Dvpanel_unnamedtable2_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Showcollapseicon")) ;
            Dvpanel_unnamedtable2_Iconposition = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Iconposition") ;
            Dvpanel_unnamedtable2_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Autoscroll")) ;
            Dvpanel_unnamedtable2_Visible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Visible")) ;
            /* Read variables values. */
            A719PrdNum = httpContext.cgiGet( edtPrdNum_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
            A718PrdNom = httpContext.cgiGet( edtPrdNom_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A718PrdNom", A718PrdNom);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtLinEnt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtLinEnt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "LINENT");
               AnyError = (short)(1) ;
               GX_FocusControl = edtLinEnt_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A597LinEnt = (short)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A597LinEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A597LinEnt), 4, 0));
            }
            else
            {
               A597LinEnt = (short)(localUtil.ctol( httpContext.cgiGet( edtLinEnt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A597LinEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A597LinEnt), 4, 0));
            }
            if ( localUtil.vcdate( httpContext.cgiGet( edtEntFecEnt_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "ENTFECENT");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEntFecEnt_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A415EntFecEnt = GXutil.nullDate() ;
               httpContext.ajax_rsp_assign_attri("", false, "A415EntFecEnt", localUtil.format(A415EntFecEnt, "99/99/99"));
            }
            else
            {
               A415EntFecEnt = localUtil.ctod( httpContext.cgiGet( edtEntFecEnt_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A415EntFecEnt", localUtil.format(A415EntFecEnt, "99/99/99"));
            }
            A11Albaran = httpContext.cgiGet( edtAlbaran_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A11Albaran", A11Albaran);
            A12857EntNAlbar = httpContext.cgiGet( edtEntNAlbar_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A12857EntNAlbar", A12857EntNAlbar);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtPedCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtPedCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PEDCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtPedCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A658PedCod = 0 ;
               n658PedCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A658PedCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A658PedCod), 8, 0));
            }
            else
            {
               A658PedCod = (int)(localUtil.ctol( httpContext.cgiGet( edtPedCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n658PedCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A658PedCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A658PedCod), 8, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtEntPrvNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtEntPrvNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ENTPRVNUM");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEntPrvNum_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A6156EntPrvNum = 0 ;
               n6156EntPrvNum = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A6156EntPrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6156EntPrvNum), 6, 0));
            }
            else
            {
               A6156EntPrvNum = (int)(localUtil.ctol( httpContext.cgiGet( edtEntPrvNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n6156EntPrvNum = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A6156EntPrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6156EntPrvNum), 6, 0));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtEntUniEnt_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtEntUniEnt_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ENTUNIENT");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEntUniEnt_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A418EntUniEnt = DecimalUtil.ZERO ;
               httpContext.ajax_rsp_assign_attri("", false, "A418EntUniEnt", GXutil.ltrimstr( A418EntUniEnt, 9, 2));
            }
            else
            {
               A418EntUniEnt = localUtil.ctond( httpContext.cgiGet( edtEntUniEnt_Internalname)) ;
               httpContext.ajax_rsp_assign_attri("", false, "A418EntUniEnt", GXutil.ltrimstr( A418EntUniEnt, 9, 2));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtEntPre_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtEntPre_Internalname)), DecimalUtil.stringToDec("99999999.99999")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ENTPRE");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEntPre_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A417EntPre = DecimalUtil.ZERO ;
               httpContext.ajax_rsp_assign_attri("", false, "A417EntPre", GXutil.ltrimstr( A417EntPre, 14, 5));
            }
            else
            {
               A417EntPre = localUtil.ctond( httpContext.cgiGet( edtEntPre_Internalname)) ;
               httpContext.ajax_rsp_assign_attri("", false, "A417EntPre", GXutil.ltrimstr( A417EntPre, 14, 5));
            }
            A5686EntLotN = httpContext.cgiGet( edtEntLotN_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A5686EntLotN", A5686EntLotN);
            if ( localUtil.vcdate( httpContext.cgiGet( edtEntFVal_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "ENTFVAL");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEntFVal_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A5685EntFVal = GXutil.nullDate() ;
               httpContext.ajax_rsp_assign_attri("", false, "A5685EntFVal", localUtil.format(A5685EntFVal, "99/99/99"));
            }
            else
            {
               A5685EntFVal = localUtil.ctod( httpContext.cgiGet( edtEntFVal_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A5685EntFVal", localUtil.format(A5685EntFVal, "99/99/99"));
            }
            AV45Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV45Pgmname", AV45Pgmname);
            A3404EntPedCum = GXutil.upper( httpContext.cgiGet( edtEntPedCum_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A3404EntPedCum", A3404EntPedCum);
            A419EntUniRem = localUtil.ctond( httpContext.cgiGet( edtEntUniRem_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A419EntUniRem", GXutil.ltrimstr( A419EntUniRem, 11, 4));
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = new com.genexus.util.GXProperties() ;
            forbiddenHiddens.add("hshsalt", "hsh"+"EntradaProducto_TRN");
            forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
            forbiddenHiddens.add("EntCon", localUtil.format( DecimalUtil.doubleToDec(A411EntCon), "9"));
            AV45Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV45Pgmname", AV45Pgmname);
            forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV45Pgmname, "")));
            forbiddenHiddens.add("EntNumCon", localUtil.format( DecimalUtil.doubleToDec(A416EntNumCon), "ZZ9"));
            forbiddenHiddens.add("EntEti", localUtil.format( DecimalUtil.doubleToDec(A414EntEti), "9"));
            forbiddenHiddens.add("EntConIni", localUtil.format( DecimalUtil.doubleToDec(A413EntConIni), "ZZZZZZZ9"));
            forbiddenHiddens.add("EntConFin", localUtil.format( DecimalUtil.doubleToDec(A412EntConFin), "ZZZZZZZ9"));
            forbiddenHiddens.add("EntBnc", GXutil.rtrim( localUtil.format( A5691EntBnc, "")));
            forbiddenHiddens.add("EntCC", GXutil.rtrim( localUtil.format( A7695EntCC, "")));
            forbiddenHiddens.add("EntCCoCod", localUtil.format( DecimalUtil.doubleToDec(A7696EntCCoCod), "ZZ9"));
            forbiddenHiddens.add("EntUniAlb", localUtil.format( A10782EntUniAlb, "ZZZZZ9.9999"));
            forbiddenHiddens.add("EntObs", GXutil.rtrim( localUtil.format( A10783EntObs, "")));
            forbiddenHiddens.add("EntRemNro", GXutil.rtrim( localUtil.format( A10187EntRemNro, "")));
            forbiddenHiddens.add("EntRemFch", localUtil.format(A10186EntRemFch, "99/99/99"));
            forbiddenHiddens.add("EntRemSuc", GXutil.rtrim( localUtil.format( A10185EntRemSuc, "")));
            forbiddenHiddens.add("EntRemTpo", GXutil.rtrim( localUtil.format( A10184EntRemTpo, "")));
            forbiddenHiddens.add("EntLoteID", localUtil.format( DecimalUtil.doubleToDec(A13235EntLoteID), "ZZZZZZZZZZZ9"));
            forbiddenHiddens.add("EntUbicaci", GXutil.rtrim( localUtil.format( A13456EntUbicaci, "")));
            forbiddenHiddens.add("EntHfCon", localUtil.format( A5690EntHfCon, "99:99"));
            forbiddenHiddens.add("EntFfCon", localUtil.format(A5689EntFfCon, "99/99/99"));
            forbiddenHiddens.add("EntHiCon", localUtil.format( A5688EntHiCon, "99:99"));
            forbiddenHiddens.add("EntFiCon", localUtil.format(A5687EntFiCon, "99/99/99"));
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ( ! ( ( GXutil.strcmp(A719PrdNum, Z719PrdNum) != 0 ) || ( A597LinEnt != Z597LinEnt ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
            {
               GXutil.writeLogError("stocksquimicos\\entradaproducto_trn:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
               A719PrdNum = httpContext.GetPar( "PrdNum") ;
               httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
               A597LinEnt = (short)(GXutil.lval( httpContext.GetPar( "LinEnt"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A597LinEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A597LinEnt), 4, 0));
               getEqualNoModal( ) ;
               if ( ! (0==AV9LinEnt) )
               {
                  A597LinEnt = AV9LinEnt ;
                  httpContext.ajax_rsp_assign_attri("", false, "A597LinEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A597LinEnt), 4, 0));
               }
               else
               {
                  if ( isIns( )  && ( Gx_BScreen == 1 ) )
                  {
                     A597LinEnt = A847UltLinEnt ;
                     httpContext.ajax_rsp_assign_attri("", false, "A597LinEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A597LinEnt), 4, 0));
                  }
               }
               Gx_mode = "DSP" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               disable_std_buttons( ) ;
               standaloneModal( ) ;
            }
            else
            {
               if ( isDsp( ) )
               {
                  sMode42 = Gx_mode ;
                  Gx_mode = "UPD" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  if ( ! (0==AV9LinEnt) )
                  {
                     A597LinEnt = AV9LinEnt ;
                     httpContext.ajax_rsp_assign_attri("", false, "A597LinEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A597LinEnt), 4, 0));
                  }
                  else
                  {
                     if ( isIns( )  && ( Gx_BScreen == 1 ) )
                     {
                        A597LinEnt = A847UltLinEnt ;
                        httpContext.ajax_rsp_assign_attri("", false, "A597LinEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A597LinEnt), 4, 0));
                     }
                  }
                  Gx_mode = sMode42 ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               }
               standaloneModal( ) ;
               if ( ! isIns( ) )
               {
                  getByPrimaryKey( ) ;
                  if ( RcdFound42 == 1 )
                  {
                     if ( isDlt( ) )
                     {
                        /* Confirm record */
                        confirm_1SK0( ) ;
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
                        e111SK2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: After Trn */
                        e121SK2 ();
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
         e121SK2 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( isIns( )  )
         {
            /* Clear variables for new insertion. */
            initAll1SK42( ) ;
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
         disableAttributes1SK42( ) ;
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

   public void confirm_1SK0( )
   {
      beforeValidate1SK42( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1SK42( ) ;
         }
         else
         {
            checkExtendedTable1SK42( ) ;
            closeExtendedTableCursors1SK42( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      }
   }

   public void resetCaption1SK0( )
   {
   }

   public void e111SK2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV27Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      entradaproducto_trn_impl.this.GXt_char1 = GXv_char2[0] ;
      AV27Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV27Station", AV27Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV28EmprNom ;
      GXv_char4[0] = AV26UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV27Station, GXv_char2, GXv_char3, GXv_char4) ;
      entradaproducto_trn_impl.this.A396EmprCod = GXv_char2[0] ;
      entradaproducto_trn_impl.this.AV28EmprNom = GXv_char3[0] ;
      entradaproducto_trn_impl.this.AV26UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV28EmprNom", AV28EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV26UsurCod", AV26UsurCod);
      GXt_int5 = (byte)(AV29NoUpd) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "NOUPPR", ""), GXv_int6) ;
      entradaproducto_trn_impl.this.GXt_int5 = GXv_int6[0] ;
      AV29NoUpd = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV29NoUpd", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29NoUpd), 4, 0));
      GXt_int7 = AV30Consumos ;
      GXv_int8[0] = GXt_int7 ;
      new app.pbuscon(remoteHandle, context).execute( A396EmprCod, "011100", GXv_int8) ;
      entradaproducto_trn_impl.this.GXt_int7 = GXv_int8[0] ;
      AV30Consumos = (short)(GXt_int7) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV30Consumos", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV30Consumos), 4, 0));
      GXt_int5 = (byte)(AV31Nalbaran20) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "ALBA20", ""), GXv_int6) ;
      entradaproducto_trn_impl.this.GXt_int5 = GXv_int6[0] ;
      AV31Nalbaran20 = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV31Nalbaran20", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV31Nalbaran20), 4, 0));
      GXt_char1 = AV27Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      entradaproducto_trn_impl.this.GXt_char1 = GXv_char4[0] ;
      AV27Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV27Station", AV27Station);
      GXv_char4[0] = AV7EmprCod ;
      GXv_char3[0] = AV28EmprNom ;
      GXv_char2[0] = AV26UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV27Station, GXv_char4, GXv_char3, GXv_char2) ;
      entradaproducto_trn_impl.this.AV7EmprCod = GXv_char4[0] ;
      entradaproducto_trn_impl.this.AV28EmprNom = GXv_char3[0] ;
      entradaproducto_trn_impl.this.AV26UsurCod = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7EmprCod", AV7EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV7EmprCod, "@!"))));
      httpContext.ajax_rsp_assign_attri("", false, "AV28EmprNom", AV28EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV26UsurCod", AV26UsurCod);
      GXv_SdtWWPContext9[0] = AV10WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext9) ;
      AV10WWPContext = GXv_SdtWWPContext9[0] ;
      /* Execute user subroutine: 'ATTRIBUTESSECURITYCODE' */
      S112 ();
      if ( returnInSub )
      {
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
      AV11TrnContext.fromxml(AV12WebSession.getValue("TrnContext"), null, null);
      if ( ( GXutil.strcmp(AV11TrnContext.getgxTv_SdtWWPTransactionContext_Transactionname(), AV45Pgmname) == 0 ) && ( GXutil.strcmp(Gx_mode, "INS") == 0 ) )
      {
         AV46GXV1 = 1 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV46GXV1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV46GXV1), 8, 0));
         while ( AV46GXV1 <= AV11TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().size() )
         {
            AV14TrnContextAtt = (app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)((app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)AV11TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().elementAt(-1+AV46GXV1));
            if ( GXutil.strcmp(AV14TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributename(), "PedCod") == 0 )
            {
               AV13Insert_PedCod = (int)(GXutil.lval( AV14TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributevalue())) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV13Insert_PedCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13Insert_PedCod), 8, 0));
            }
            AV46GXV1 = (int)(AV46GXV1+1) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV46GXV1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV46GXV1), 8, 0));
         }
      }
      edtEntPedCum_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEntPedCum_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEntPedCum_Visible), 5, 0), true);
      edtEntUniRem_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEntUniRem_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEntUniRem_Visible), 5, 0), true);
      imgPedcodprompt_gximage = "prompt" ;
      httpContext.ajax_rsp_assign_prop("", false, imgPedcodprompt_Internalname, "gximage", imgPedcodprompt_gximage, true);
      AV15PedCodPrompt = context.getHttpContext().getImagePath( "f5b04895-0024-488b-8e3b-b687ca4598ee", "", context.getHttpContext().getTheme( )) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15PedCodPrompt", AV15PedCodPrompt);
      AV47Pedcodprompt_GXI = GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "f5b04895-0024-488b-8e3b-b687ca4598ee", "", context.getHttpContext().getTheme( )), context.getHttpContext()) ;
   }

   public void e121SK2( )
   {
      /* After Trn Routine */
      returnInSub = false ;
      httpContext.setWebReturnParms(new Object[] {});
      httpContext.setWebReturnParmsMetadata(new Object[] {});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
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

   public void S112( )
   {
      /* 'ATTRIBUTESSECURITYCODE' Routine */
      returnInSub = false ;
      edtAlbaran_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbaran_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbaran_Visible), 5, 0), true);
      divAlbaran_cell_Class = "Invisible" ;
      httpContext.ajax_rsp_assign_prop("", false, divAlbaran_cell_Internalname, "Class", divAlbaran_cell_Class, true);
      edtEntNAlbar_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEntNAlbar_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEntNAlbar_Visible), 5, 0), true);
      divEntnalbar_cell_Class = "Invisible" ;
      httpContext.ajax_rsp_assign_prop("", false, divEntnalbar_cell_Internalname, "Class", divEntnalbar_cell_Class, true);
   }

   public void zm1SK42( int GX_JID )
   {
      if ( ( GX_JID == 90 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z411EntCon = T01SK3_A411EntCon[0] ;
            Z3404EntPedCum = T01SK3_A3404EntPedCum[0] ;
            Z419EntUniRem = T01SK3_A419EntUniRem[0] ;
            Z417EntPre = T01SK3_A417EntPre[0] ;
            Z415EntFecEnt = T01SK3_A415EntFecEnt[0] ;
            Z11Albaran = T01SK3_A11Albaran[0] ;
            Z12857EntNAlbar = T01SK3_A12857EntNAlbar[0] ;
            Z6156EntPrvNum = T01SK3_A6156EntPrvNum[0] ;
            Z418EntUniEnt = T01SK3_A418EntUniEnt[0] ;
            Z416EntNumCon = T01SK3_A416EntNumCon[0] ;
            Z5686EntLotN = T01SK3_A5686EntLotN[0] ;
            Z5685EntFVal = T01SK3_A5685EntFVal[0] ;
            Z414EntEti = T01SK3_A414EntEti[0] ;
            Z413EntConIni = T01SK3_A413EntConIni[0] ;
            Z412EntConFin = T01SK3_A412EntConFin[0] ;
            Z5691EntBnc = T01SK3_A5691EntBnc[0] ;
            Z7695EntCC = T01SK3_A7695EntCC[0] ;
            Z7696EntCCoCod = T01SK3_A7696EntCCoCod[0] ;
            Z10782EntUniAlb = T01SK3_A10782EntUniAlb[0] ;
            Z10783EntObs = T01SK3_A10783EntObs[0] ;
            Z10187EntRemNro = T01SK3_A10187EntRemNro[0] ;
            Z10186EntRemFch = T01SK3_A10186EntRemFch[0] ;
            Z10185EntRemSuc = T01SK3_A10185EntRemSuc[0] ;
            Z10184EntRemTpo = T01SK3_A10184EntRemTpo[0] ;
            Z12716EntFabId = T01SK3_A12716EntFabId[0] ;
            Z13235EntLoteID = T01SK3_A13235EntLoteID[0] ;
            Z13456EntUbicaci = T01SK3_A13456EntUbicaci[0] ;
            Z5690EntHfCon = T01SK3_A5690EntHfCon[0] ;
            Z5689EntFfCon = T01SK3_A5689EntFfCon[0] ;
            Z5688EntHiCon = T01SK3_A5688EntHiCon[0] ;
            Z5687EntFiCon = T01SK3_A5687EntFiCon[0] ;
            Z658PedCod = T01SK3_A658PedCod[0] ;
         }
         else
         {
            Z411EntCon = A411EntCon ;
            Z3404EntPedCum = A3404EntPedCum ;
            Z419EntUniRem = A419EntUniRem ;
            Z417EntPre = A417EntPre ;
            Z415EntFecEnt = A415EntFecEnt ;
            Z11Albaran = A11Albaran ;
            Z12857EntNAlbar = A12857EntNAlbar ;
            Z6156EntPrvNum = A6156EntPrvNum ;
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
            Z10184EntRemTpo = A10184EntRemTpo ;
            Z12716EntFabId = A12716EntFabId ;
            Z13235EntLoteID = A13235EntLoteID ;
            Z13456EntUbicaci = A13456EntUbicaci ;
            Z5690EntHfCon = A5690EntHfCon ;
            Z5689EntFfCon = A5689EntFfCon ;
            Z5688EntHiCon = A5688EntHiCon ;
            Z5687EntFiCon = A5687EntFiCon ;
            Z658PedCod = A658PedCod ;
         }
      }
      if ( ( GX_JID == 92 ) || ( GX_JID == 0 ) )
      {
         Z726PrdPreMed = T01SK6_A726PrdPreMed[0] ;
         Z718PrdNom = T01SK6_A718PrdNom[0] ;
         Z724PrdPreAct = T01SK6_A724PrdPreAct[0] ;
         Z698PrdDetPar = T01SK6_A698PrdDetPar[0] ;
         Z713PrdFulEnt = T01SK6_A713PrdFulEnt[0] ;
         Z684PrdCanPen = T01SK6_A684PrdCanPen[0] ;
         Z729PrdRotRea = T01SK6_A729PrdRotRea[0] ;
         Z727PrdRec = T01SK6_A727PrdRec[0] ;
         Z725PrdPreAnt = T01SK6_A725PrdPreAnt[0] ;
         Z709PrdFecPre = T01SK6_A709PrdFecPre[0] ;
         Z5255PrdPreAc2 = T01SK6_A5255PrdPreAc2[0] ;
         Z705PrdExiCC = T01SK6_A705PrdExiCC[0] ;
         Z795PrvNum = T01SK6_A795PrvNum[0] ;
         Z856ValCod = T01SK6_A856ValCod[0] ;
      }
      if ( ( GX_JID == 94 ) || ( GX_JID == 0 ) )
      {
         Z665PedPre = T01SK9_A665PedPre[0] ;
         Z669PedUni = T01SK9_A669PedUni[0] ;
         Z663PedFulEnt = T01SK9_A663PedFulEnt[0] ;
         Z659PedCum = T01SK9_A659PedCum[0] ;
         Z660PedDto = T01SK9_A660PedDto[0] ;
      }
      if ( GX_JID == -90 )
      {
         Z597LinEnt = A597LinEnt ;
         Z411EntCon = A411EntCon ;
         Z3404EntPedCum = A3404EntPedCum ;
         Z419EntUniRem = A419EntUniRem ;
         Z417EntPre = A417EntPre ;
         Z415EntFecEnt = A415EntFecEnt ;
         Z11Albaran = A11Albaran ;
         Z12857EntNAlbar = A12857EntNAlbar ;
         Z6156EntPrvNum = A6156EntPrvNum ;
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
         Z10184EntRemTpo = A10184EntRemTpo ;
         Z12716EntFabId = A12716EntFabId ;
         Z13235EntLoteID = A13235EntLoteID ;
         Z13456EntUbicaci = A13456EntUbicaci ;
         Z5690EntHfCon = A5690EntHfCon ;
         Z5689EntFfCon = A5689EntFfCon ;
         Z5688EntHiCon = A5688EntHiCon ;
         Z5687EntFiCon = A5687EntFiCon ;
         Z396EmprCod = A396EmprCod ;
         Z719PrdNum = A719PrdNum ;
         Z658PedCod = A658PedCod ;
         Z407EmprNom = A407EmprNom ;
         Z3915EmpNumDec = A3915EmpNumDec ;
         Z847UltLinEnt = A847UltLinEnt ;
         Z704PrdExiAlm = A704PrdExiAlm ;
         Z726PrdPreMed = A726PrdPreMed ;
         Z750PrdValStk = A750PrdValStk ;
         Z718PrdNom = A718PrdNom ;
         Z724PrdPreAct = A724PrdPreAct ;
         Z698PrdDetPar = A698PrdDetPar ;
         Z713PrdFulEnt = A713PrdFulEnt ;
         Z684PrdCanPen = A684PrdCanPen ;
         Z729PrdRotRea = A729PrdRotRea ;
         Z727PrdRec = A727PrdRec ;
         Z725PrdPreAnt = A725PrdPreAnt ;
         Z709PrdFecPre = A709PrdFecPre ;
         Z5255PrdPreAc2 = A5255PrdPreAc2 ;
         Z705PrdExiCC = A705PrdExiCC ;
         Z795PrvNum = A795PrvNum ;
         Z856ValCod = A856ValCod ;
         Z794PrvNom = A794PrvNom ;
         Z800PrvPri = A800PrvPri ;
         Z913StockRem = A913StockRem ;
         Z661PedFec = A661PedFec ;
         Z667PedSit = A667PedSit ;
         Z666PedPri = A666PedPri ;
         Z12580PedAlmc = A12580PedAlmc ;
         Z657PedCanEnt = A657PedCanEnt ;
         Z665PedPre = A665PedPre ;
         Z669PedUni = A669PedUni ;
         Z663PedFulEnt = A663PedFulEnt ;
         Z659PedCum = A659PedCum ;
         Z660PedDto = A660PedDto ;
      }
   }

   public void standaloneNotModal( )
   {
      edtEntUniRem_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEntUniRem_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEntUniRem_Enabled), 5, 0), true);
      AV45Pgmname = "StocksQuimicos.EntradaProducto_TRN" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV45Pgmname", AV45Pgmname);
      Gx_BScreen = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      edtEntUniRem_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEntUniRem_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEntUniRem_Enabled), 5, 0), true);
      bttBtntrn_delete_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtntrn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_delete_Enabled), 5, 0), true);
      if ( ! (GXutil.strcmp("", AV7EmprCod)==0) )
      {
         A396EmprCod = AV7EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      }
      /* Using cursor T01SK4 */
      pr_default.execute(2, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01SK4_A407EmprNom[0] ;
      n407EmprNom = T01SK4_n407EmprNom[0] ;
      A3915EmpNumDec = T01SK4_A3915EmpNumDec[0] ;
      n3915EmpNumDec = T01SK4_n3915EmpNumDec[0] ;
      pr_default.close(2);
      GXt_int5 = (byte)(0) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "ALBA20", ""), ""), GXv_int6) ;
      entradaproducto_trn_impl.this.GXt_int5 = GXv_int6[0] ;
      edtAlbaran_Visible = ((GXt_int5==0) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbaran_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbaran_Visible), 5, 0), true);
      GXt_int5 = (byte)(0) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "ALBA20", ""), ""), GXv_int6) ;
      entradaproducto_trn_impl.this.GXt_int5 = GXv_int6[0] ;
      if ( ! ( ( GXt_int5 == 0 ) ) )
      {
         divAlbaran_cell_Class = httpContext.getMessage( "Invisible", "") ;
         httpContext.ajax_rsp_assign_prop("", false, divAlbaran_cell_Internalname, "Class", divAlbaran_cell_Class, true);
      }
      else
      {
         GXt_int5 = (byte)(0) ;
         GXv_int6[0] = GXt_int5 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "ALBA20", ""), ""), GXv_int6) ;
         entradaproducto_trn_impl.this.GXt_int5 = GXv_int6[0] ;
         if ( GXt_int5 == 0 )
         {
            divAlbaran_cell_Class = httpContext.getMessage( "col-xs-12 col-sm-2 DataContentCell", "") ;
            httpContext.ajax_rsp_assign_prop("", false, divAlbaran_cell_Internalname, "Class", divAlbaran_cell_Class, true);
         }
      }
      GXt_int5 = (byte)(0) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "ALBA20", ""), ""), GXv_int6) ;
      entradaproducto_trn_impl.this.GXt_int5 = GXv_int6[0] ;
      edtEntNAlbar_Visible = ((GXt_int5==1) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtEntNAlbar_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEntNAlbar_Visible), 5, 0), true);
      GXt_int5 = (byte)(0) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "ALBA20", ""), ""), GXv_int6) ;
      entradaproducto_trn_impl.this.GXt_int5 = GXv_int6[0] ;
      if ( ! ( ( GXt_int5 == 1 ) ) )
      {
         divEntnalbar_cell_Class = httpContext.getMessage( "Invisible", "") ;
         httpContext.ajax_rsp_assign_prop("", false, divEntnalbar_cell_Internalname, "Class", divEntnalbar_cell_Class, true);
      }
      else
      {
         GXt_int5 = (byte)(0) ;
         GXv_int6[0] = GXt_int5 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "ALBA20", ""), ""), GXv_int6) ;
         entradaproducto_trn_impl.this.GXt_int5 = GXv_int6[0] ;
         if ( GXt_int5 == 1 )
         {
            divEntnalbar_cell_Class = httpContext.getMessage( "col-xs-12 col-sm-2 DataContentCell", "") ;
            httpContext.ajax_rsp_assign_prop("", false, divEntnalbar_cell_Internalname, "Class", divEntnalbar_cell_Class, true);
         }
      }
      if ( ! (GXutil.strcmp("", AV8PrdNum)==0) )
      {
         A719PrdNum = AV8PrdNum ;
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
      }
      if ( ! (GXutil.strcmp("", AV8PrdNum)==0) )
      {
         edtPrdNum_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtPrdNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNum_Enabled), 5, 0), true);
      }
      else
      {
         edtPrdNum_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtPrdNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNum_Enabled), 5, 0), true);
      }
      if ( ! (GXutil.strcmp("", AV8PrdNum)==0) )
      {
         edtPrdNum_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtPrdNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNum_Enabled), 5, 0), true);
      }
      if ( ! (0==AV9LinEnt) )
      {
         edtLinEnt_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtLinEnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLinEnt_Enabled), 5, 0), true);
      }
      else
      {
         edtLinEnt_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtLinEnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLinEnt_Enabled), 5, 0), true);
      }
      if ( ! (0==AV9LinEnt) )
      {
         edtLinEnt_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtLinEnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLinEnt_Enabled), 5, 0), true);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV13Insert_PedCod) )
      {
         edtPedCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtPedCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPedCod_Enabled), 5, 0), true);
      }
      else
      {
         edtPedCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtPedCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPedCod_Enabled), 5, 0), true);
      }
   }

   public void standaloneModal( )
   {
      if ( isIns( )  )
      {
         A411EntCon = (byte)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A411EntCon", GXutil.str( A411EntCon, 1, 0));
      }
      if ( isUpd( )  )
      {
         edtPedCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtPedCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPedCod_Enabled), 5, 0), true);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV13Insert_PedCod) )
      {
         A658PedCod = AV13Insert_PedCod ;
         n658PedCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A658PedCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A658PedCod), 8, 0));
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
      if ( isIns( )  && GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A415EntFecEnt)) && ( Gx_BScreen == 0 ) )
      {
         A415EntFecEnt = GXutil.today( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "A415EntFecEnt", localUtil.format(A415EntFecEnt, "99/99/99"));
      }
      if ( isIns( )  && (GXutil.strcmp("", A10184EntRemTpo)==0) && ( Gx_BScreen == 0 ) )
      {
         A10184EntRemTpo = " " ;
         httpContext.ajax_rsp_assign_attri("", false, "A10184EntRemTpo", A10184EntRemTpo);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ( Gx_BScreen == 0 ) )
      {
         /* Using cursor T01SK6 */
         pr_default.execute(4, new Object[] {A396EmprCod, A719PrdNum});
         zm1SK42( 92) ;
         A847UltLinEnt = T01SK6_A847UltLinEnt[0] ;
         A704PrdExiAlm = T01SK6_A704PrdExiAlm[0] ;
         A726PrdPreMed = T01SK6_A726PrdPreMed[0] ;
         A750PrdValStk = T01SK6_A750PrdValStk[0] ;
         A718PrdNom = T01SK6_A718PrdNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A718PrdNom", A718PrdNom);
         A724PrdPreAct = T01SK6_A724PrdPreAct[0] ;
         A698PrdDetPar = T01SK6_A698PrdDetPar[0] ;
         A713PrdFulEnt = T01SK6_A713PrdFulEnt[0] ;
         A684PrdCanPen = T01SK6_A684PrdCanPen[0] ;
         A729PrdRotRea = T01SK6_A729PrdRotRea[0] ;
         A727PrdRec = T01SK6_A727PrdRec[0] ;
         A725PrdPreAnt = T01SK6_A725PrdPreAnt[0] ;
         A709PrdFecPre = T01SK6_A709PrdFecPre[0] ;
         A5255PrdPreAc2 = T01SK6_A5255PrdPreAc2[0] ;
         A705PrdExiCC = T01SK6_A705PrdExiCC[0] ;
         A795PrvNum = T01SK6_A795PrvNum[0] ;
         A856ValCod = T01SK6_A856ValCod[0] ;
         O750PrdValStk = A750PrdValStk ;
         httpContext.ajax_rsp_assign_attri("", false, "A750PrdValStk", GXutil.ltrimstr( A750PrdValStk, 11, 2));
         O704PrdExiAlm = A704PrdExiAlm ;
         httpContext.ajax_rsp_assign_attri("", false, "A704PrdExiAlm", GXutil.ltrimstr( A704PrdExiAlm, 12, 4));
         O847UltLinEnt = A847UltLinEnt ;
         httpContext.ajax_rsp_assign_attri("", false, "A847UltLinEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A847UltLinEnt), 4, 0));
         pr_default.close(4);
         /* Using cursor T01SK10 */
         pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(A795PrvNum)});
         A794PrvNom = T01SK10_A794PrvNom[0] ;
         n794PrvNom = T01SK10_n794PrvNom[0] ;
         A800PrvPri = T01SK10_A800PrvPri[0] ;
         n800PrvPri = T01SK10_n800PrvPri[0] ;
         pr_default.close(8);
         /* Using cursor T01SK12 */
         pr_default.execute(9, new Object[] {A396EmprCod, A719PrdNum});
         if ( (pr_default.getStatus(9) != 101) )
         {
            A913StockRem = T01SK12_A913StockRem[0] ;
            n913StockRem = T01SK12_n913StockRem[0] ;
         }
         else
         {
            A913StockRem = DecimalUtil.doubleToDec(0) ;
            n913StockRem = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A913StockRem", GXutil.ltrimstr( A913StockRem, 12, 4));
         }
         pr_default.close(9);
         GXt_date10 = A14040PrdUltMovF ;
         GXv_char4[0] = A396EmprCod ;
         GXv_char3[0] = A719PrdNum ;
         GXv_date11[0] = GXt_date10 ;
         new app.pstm005(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_date11) ;
         entradaproducto_trn_impl.this.A396EmprCod = GXv_char4[0] ;
         entradaproducto_trn_impl.this.A719PrdNum = GXv_char3[0] ;
         entradaproducto_trn_impl.this.GXt_date10 = GXv_date11[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         A14040PrdUltMovF = GXt_date10 ;
         httpContext.ajax_rsp_assign_attri("", false, "A14040PrdUltMovF", localUtil.format(A14040PrdUltMovF, "99/99/99"));
         GXt_date10 = A3835UltFecCCs ;
         GXv_char4[0] = A396EmprCod ;
         GXv_char3[0] = A719PrdNum ;
         GXv_date11[0] = GXt_date10 ;
         new app.pstm005(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_date11) ;
         entradaproducto_trn_impl.this.A396EmprCod = GXv_char4[0] ;
         entradaproducto_trn_impl.this.A719PrdNum = GXv_char3[0] ;
         entradaproducto_trn_impl.this.GXt_date10 = GXv_date11[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         A3835UltFecCCs = GXt_date10 ;
         httpContext.ajax_rsp_assign_attri("", false, "A3835UltFecCCs", localUtil.format(A3835UltFecCCs, "99/99/99"));
         /* Using cursor T01SK7 */
         pr_default.execute(5, new Object[] {A396EmprCod, Boolean.valueOf(n658PedCod), Integer.valueOf(A658PedCod)});
         A661PedFec = T01SK7_A661PedFec[0] ;
         A667PedSit = T01SK7_A667PedSit[0] ;
         A666PedPri = T01SK7_A666PedPri[0] ;
         A12580PedAlmc = T01SK7_A12580PedAlmc[0] ;
         pr_default.close(5);
         /* Using cursor T01SK9 */
         pr_default.execute(7, new Object[] {A396EmprCod, Boolean.valueOf(n658PedCod), Integer.valueOf(A658PedCod), A719PrdNum});
         zm1SK42( 94) ;
         A657PedCanEnt = T01SK9_A657PedCanEnt[0] ;
         A665PedPre = T01SK9_A665PedPre[0] ;
         A669PedUni = T01SK9_A669PedUni[0] ;
         A663PedFulEnt = T01SK9_A663PedFulEnt[0] ;
         A659PedCum = T01SK9_A659PedCum[0] ;
         A660PedDto = T01SK9_A660PedDto[0] ;
         O657PedCanEnt = A657PedCanEnt ;
         httpContext.ajax_rsp_assign_attri("", false, "A657PedCanEnt", GXutil.ltrimstr( A657PedCanEnt, 9, 2));
         pr_default.close(7);
         if ( true )
         {
            AV22PedPri = GXutil.str( A800PrvPri, 1, 0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV22PedPri", AV22PedPri);
         }
         else
         {
            if ( true /* Level */ && ! (0==A658PedCod) )
            {
               AV22PedPri = A666PedPri ;
               httpContext.ajax_rsp_assign_attri("", false, "AV22PedPri", AV22PedPri);
            }
         }
         A664PedNumLin = (short)(getPedNumLin0( A396EmprCod, A658PedCod)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A664PedNumLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A664PedNumLin), 3, 0));
         AV32Year = (short)(GXutil.year( A415EntFecEnt)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV32Year", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV32Year), 4, 0));
         AV21Fecha = localUtil.ymdtod( AV32Year, 12, 1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV21Fecha", localUtil.format(AV21Fecha, "99/99/99"));
         AV34Mes = (short)(GXutil.month( A415EntFecEnt)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV34Mes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34Mes), 4, 0));
         AV24oldEntFecent = O415EntFecEnt ;
         httpContext.ajax_rsp_assign_attri("", false, "AV24oldEntFecent", localUtil.format(AV24oldEntFecent, "99/99/99"));
         AV39FecAnt = O415EntFecEnt ;
         httpContext.ajax_rsp_assign_attri("", false, "AV39FecAnt", localUtil.format(AV39FecAnt, "99/99/99"));
         AV42AnyAnt = (short)(GXutil.year( O415EntFecEnt)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV42AnyAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV42AnyAnt), 4, 0));
         AV43MesAnt = (byte)(GXutil.month( O415EntFecEnt)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV43MesAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV43MesAnt), 2, 0));
         AV33DiasFin = (short)(GXutil.ddiff(GXutil.eomdate( AV21Fecha),A415EntFecEnt)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV33DiasFin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV33DiasFin), 4, 0));
      }
   }

   public void load1SK42( )
   {
      /* Using cursor T01SK14 */
      pr_default.execute(10, new Object[] {A396EmprCod, A719PrdNum, Short.valueOf(A597LinEnt)});
      if ( (pr_default.getStatus(10) != 101) )
      {
         RcdFound42 = (short)(1) ;
         A847UltLinEnt = T01SK14_A847UltLinEnt[0] ;
         A704PrdExiAlm = T01SK14_A704PrdExiAlm[0] ;
         A411EntCon = T01SK14_A411EntCon[0] ;
         A657PedCanEnt = T01SK14_A657PedCanEnt[0] ;
         A3404EntPedCum = T01SK14_A3404EntPedCum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3404EntPedCum", A3404EntPedCum);
         A419EntUniRem = T01SK14_A419EntUniRem[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A419EntUniRem", GXutil.ltrimstr( A419EntUniRem, 11, 4));
         A417EntPre = T01SK14_A417EntPre[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A417EntPre", GXutil.ltrimstr( A417EntPre, 14, 5));
         A726PrdPreMed = T01SK14_A726PrdPreMed[0] ;
         A750PrdValStk = T01SK14_A750PrdValStk[0] ;
         A718PrdNom = T01SK14_A718PrdNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A718PrdNom", A718PrdNom);
         A794PrvNom = T01SK14_A794PrvNom[0] ;
         n794PrvNom = T01SK14_n794PrvNom[0] ;
         A724PrdPreAct = T01SK14_A724PrdPreAct[0] ;
         A698PrdDetPar = T01SK14_A698PrdDetPar[0] ;
         A713PrdFulEnt = T01SK14_A713PrdFulEnt[0] ;
         A684PrdCanPen = T01SK14_A684PrdCanPen[0] ;
         A729PrdRotRea = T01SK14_A729PrdRotRea[0] ;
         A727PrdRec = T01SK14_A727PrdRec[0] ;
         A725PrdPreAnt = T01SK14_A725PrdPreAnt[0] ;
         A709PrdFecPre = T01SK14_A709PrdFecPre[0] ;
         A407EmprNom = T01SK14_A407EmprNom[0] ;
         n407EmprNom = T01SK14_n407EmprNom[0] ;
         A800PrvPri = T01SK14_A800PrvPri[0] ;
         n800PrvPri = T01SK14_n800PrvPri[0] ;
         A3915EmpNumDec = T01SK14_A3915EmpNumDec[0] ;
         n3915EmpNumDec = T01SK14_n3915EmpNumDec[0] ;
         A5255PrdPreAc2 = T01SK14_A5255PrdPreAc2[0] ;
         A705PrdExiCC = T01SK14_A705PrdExiCC[0] ;
         A415EntFecEnt = T01SK14_A415EntFecEnt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A415EntFecEnt", localUtil.format(A415EntFecEnt, "99/99/99"));
         A11Albaran = T01SK14_A11Albaran[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11Albaran", A11Albaran);
         A12857EntNAlbar = T01SK14_A12857EntNAlbar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12857EntNAlbar", A12857EntNAlbar);
         A6156EntPrvNum = T01SK14_A6156EntPrvNum[0] ;
         n6156EntPrvNum = T01SK14_n6156EntPrvNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6156EntPrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6156EntPrvNum), 6, 0));
         A661PedFec = T01SK14_A661PedFec[0] ;
         A418EntUniEnt = T01SK14_A418EntUniEnt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A418EntUniEnt", GXutil.ltrimstr( A418EntUniEnt, 9, 2));
         A665PedPre = T01SK14_A665PedPre[0] ;
         A669PedUni = T01SK14_A669PedUni[0] ;
         A416EntNumCon = T01SK14_A416EntNumCon[0] ;
         A5686EntLotN = T01SK14_A5686EntLotN[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5686EntLotN", A5686EntLotN);
         A5685EntFVal = T01SK14_A5685EntFVal[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5685EntFVal", localUtil.format(A5685EntFVal, "99/99/99"));
         A414EntEti = T01SK14_A414EntEti[0] ;
         A413EntConIni = T01SK14_A413EntConIni[0] ;
         A412EntConFin = T01SK14_A412EntConFin[0] ;
         A663PedFulEnt = T01SK14_A663PedFulEnt[0] ;
         A659PedCum = T01SK14_A659PedCum[0] ;
         A667PedSit = T01SK14_A667PedSit[0] ;
         A666PedPri = T01SK14_A666PedPri[0] ;
         A660PedDto = T01SK14_A660PedDto[0] ;
         A5691EntBnc = T01SK14_A5691EntBnc[0] ;
         A7695EntCC = T01SK14_A7695EntCC[0] ;
         A7696EntCCoCod = T01SK14_A7696EntCCoCod[0] ;
         A10782EntUniAlb = T01SK14_A10782EntUniAlb[0] ;
         A10783EntObs = T01SK14_A10783EntObs[0] ;
         A10187EntRemNro = T01SK14_A10187EntRemNro[0] ;
         A10186EntRemFch = T01SK14_A10186EntRemFch[0] ;
         A10185EntRemSuc = T01SK14_A10185EntRemSuc[0] ;
         A10184EntRemTpo = T01SK14_A10184EntRemTpo[0] ;
         A12580PedAlmc = T01SK14_A12580PedAlmc[0] ;
         A12716EntFabId = T01SK14_A12716EntFabId[0] ;
         A13235EntLoteID = T01SK14_A13235EntLoteID[0] ;
         A13456EntUbicaci = T01SK14_A13456EntUbicaci[0] ;
         A5690EntHfCon = T01SK14_A5690EntHfCon[0] ;
         A5689EntFfCon = T01SK14_A5689EntFfCon[0] ;
         A5688EntHiCon = T01SK14_A5688EntHiCon[0] ;
         A5687EntFiCon = T01SK14_A5687EntFiCon[0] ;
         A658PedCod = T01SK14_A658PedCod[0] ;
         n658PedCod = T01SK14_n658PedCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A658PedCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A658PedCod), 8, 0));
         A795PrvNum = T01SK14_A795PrvNum[0] ;
         A856ValCod = T01SK14_A856ValCod[0] ;
         A913StockRem = T01SK14_A913StockRem[0] ;
         n913StockRem = T01SK14_n913StockRem[0] ;
         zm1SK42( -90) ;
      }
      pr_default.close(10);
      onLoadActions1SK42( ) ;
   }

   public void onLoadActions1SK42( )
   {
      O750PrdValStk = A750PrdValStk ;
      httpContext.ajax_rsp_assign_attri("", false, "A750PrdValStk", GXutil.ltrimstr( A750PrdValStk, 11, 2));
      O657PedCanEnt = A657PedCanEnt ;
      httpContext.ajax_rsp_assign_attri("", false, "A657PedCanEnt", GXutil.ltrimstr( A657PedCanEnt, 9, 2));
      O704PrdExiAlm = A704PrdExiAlm ;
      httpContext.ajax_rsp_assign_attri("", false, "A704PrdExiAlm", GXutil.ltrimstr( A704PrdExiAlm, 12, 4));
      O847UltLinEnt = A847UltLinEnt ;
      httpContext.ajax_rsp_assign_attri("", false, "A847UltLinEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A847UltLinEnt), 4, 0));
      AV32Year = (short)(GXutil.year( A415EntFecEnt)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32Year", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV32Year), 4, 0));
      AV21Fecha = localUtil.ymdtod( AV32Year, 12, 1) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21Fecha", localUtil.format(AV21Fecha, "99/99/99"));
      AV34Mes = (short)(GXutil.month( A415EntFecEnt)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV34Mes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34Mes), 4, 0));
      AV24oldEntFecent = O415EntFecEnt ;
      httpContext.ajax_rsp_assign_attri("", false, "AV24oldEntFecent", localUtil.format(AV24oldEntFecent, "99/99/99"));
      AV39FecAnt = O415EntFecEnt ;
      httpContext.ajax_rsp_assign_attri("", false, "AV39FecAnt", localUtil.format(AV39FecAnt, "99/99/99"));
      AV42AnyAnt = (short)(GXutil.year( O415EntFecEnt)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV42AnyAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV42AnyAnt), 4, 0));
      AV43MesAnt = (byte)(GXutil.month( O415EntFecEnt)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV43MesAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV43MesAnt), 2, 0));
      AV33DiasFin = (short)(GXutil.ddiff(GXutil.eomdate( AV21Fecha),A415EntFecEnt)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV33DiasFin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV33DiasFin), 4, 0));
      AV36OldEntUni = O418EntUniEnt ;
      httpContext.ajax_rsp_assign_attri("", false, "AV36OldEntUni", GXutil.ltrimstr( AV36OldEntUni, 9, 2));
      AV40UniOld = O418EntUniEnt ;
      httpContext.ajax_rsp_assign_attri("", false, "AV40UniOld", GXutil.ltrimstr( AV40UniOld, 9, 2));
      if ( isIns( )  && (GXutil.strcmp("", A3404EntPedCum)==0) && ( Gx_BScreen == 0 ) )
      {
         A3404EntPedCum = httpContext.getMessage( httpContext.getMessage( "N", ""), "") ;
         httpContext.ajax_rsp_assign_attri("", false, "A3404EntPedCum", A3404EntPedCum);
      }
      else
      {
         if ( (0==A658PedCod) )
         {
            A3404EntPedCum = httpContext.getMessage( httpContext.getMessage( "S", ""), "") ;
            httpContext.ajax_rsp_assign_attri("", false, "A3404EntPedCum", A3404EntPedCum);
         }
         else
         {
            if ( ( ( DecimalUtil.compareTo(A657PedCanEnt, A669PedUni) == 0 ) || ( DecimalUtil.compareTo(A657PedCanEnt, A669PedUni) > 0 ) ) && ! (0==A658PedCod) && true /* After */ )
            {
               A3404EntPedCum = httpContext.getMessage( httpContext.getMessage( "S", ""), "") ;
               httpContext.ajax_rsp_assign_attri("", false, "A3404EntPedCum", A3404EntPedCum);
            }
            else
            {
               if ( ( DecimalUtil.compareTo(A657PedCanEnt, A669PedUni) < 0 ) && ! (0==A658PedCod) && true /* After */ )
               {
                  A3404EntPedCum = httpContext.getMessage( httpContext.getMessage( "N", ""), "") ;
                  httpContext.ajax_rsp_assign_attri("", false, "A3404EntPedCum", A3404EntPedCum);
               }
            }
         }
      }
      if ( isIns( )  && true /* After */ )
      {
         A419EntUniRem = O419EntUniRem.add(A418EntUniEnt) ;
         httpContext.ajax_rsp_assign_attri("", false, "A419EntUniRem", GXutil.ltrimstr( A419EntUniRem, 11, 4));
      }
      else
      {
         if ( isUpd( )  && true /* After */ )
         {
            A419EntUniRem = (O419EntUniRem.add(A418EntUniEnt).subtract(O418EntUniEnt)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A419EntUniRem", GXutil.ltrimstr( A419EntUniRem, 11, 4));
         }
         else
         {
            if ( isDlt( )  && true /* After */ )
            {
               A419EntUniRem = (O419EntUniRem.subtract(A418EntUniEnt)) ;
               httpContext.ajax_rsp_assign_attri("", false, "A419EntUniRem", GXutil.ltrimstr( A419EntUniRem, 11, 4));
            }
         }
      }
      if ( isUpd( )  && ( DecimalUtil.compareTo(A419EntUniRem, A418EntUniEnt) != 0 ) )
      {
         edtEntFecEnt_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtEntFecEnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEntFecEnt_Enabled), 5, 0), true);
      }
      else
      {
         edtEntFecEnt_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtEntFecEnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEntFecEnt_Enabled), 5, 0), true);
      }
      if ( isUpd( )  && ( DecimalUtil.compareTo(A419EntUniRem, A418EntUniEnt) != 0 ) )
      {
         edtAlbaran_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAlbaran_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbaran_Enabled), 5, 0), true);
      }
      else
      {
         edtAlbaran_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAlbaran_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbaran_Enabled), 5, 0), true);
      }
      if ( isUpd( )  && ( DecimalUtil.compareTo(A419EntUniRem, A418EntUniEnt) != 0 ) )
      {
         edtEntNAlbar_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtEntNAlbar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEntNAlbar_Enabled), 5, 0), true);
      }
      else
      {
         edtEntNAlbar_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtEntNAlbar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEntNAlbar_Enabled), 5, 0), true);
      }
      if ( isUpd( )  && ( DecimalUtil.compareTo(A419EntUniRem, A418EntUniEnt) != 0 ) )
      {
         edtEntPrvNum_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtEntPrvNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEntPrvNum_Enabled), 5, 0), true);
      }
      else
      {
         edtEntPrvNum_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtEntPrvNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEntPrvNum_Enabled), 5, 0), true);
      }
      if ( isUpd( )  && ( DecimalUtil.compareTo(A419EntUniRem, A418EntUniEnt) != 0 ) )
      {
         edtEntUniEnt_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtEntUniEnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEntUniEnt_Enabled), 5, 0), true);
      }
      else
      {
         edtEntUniEnt_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtEntUniEnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEntUniEnt_Enabled), 5, 0), true);
      }
      if ( isUpd( )  && ( DecimalUtil.compareTo(A419EntUniRem, A418EntUniEnt) != 0 ) )
      {
         edtEntLotN_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtEntLotN_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEntLotN_Enabled), 5, 0), true);
      }
      else
      {
         edtEntLotN_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtEntLotN_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEntLotN_Enabled), 5, 0), true);
      }
      if ( isUpd( )  && ( DecimalUtil.compareTo(A419EntUniRem, A418EntUniEnt) != 0 ) )
      {
         edtEntPre_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtEntPre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEntPre_Enabled), 5, 0), true);
      }
      else
      {
         edtEntPre_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtEntPre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEntPre_Enabled), 5, 0), true);
      }
      if ( isUpd( )  && ( DecimalUtil.compareTo(A419EntUniRem, A418EntUniEnt) != 0 ) )
      {
         edtEntFVal_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtEntFVal_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEntFVal_Enabled), 5, 0), true);
      }
      else
      {
         edtEntFVal_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtEntFVal_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEntFVal_Enabled), 5, 0), true);
      }
      if ( isUpd( )  && ( DecimalUtil.compareTo(A419EntUniRem, A418EntUniEnt) != 0 ) )
      {
         edtEntPedCum_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtEntPedCum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEntPedCum_Enabled), 5, 0), true);
      }
      else
      {
         edtEntPedCum_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtEntPedCum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEntPedCum_Enabled), 5, 0), true);
      }
      AV38oldlote = O5686EntLotN ;
      httpContext.ajax_rsp_assign_attri("", false, "AV38oldlote", AV38oldlote);
      AV37OldRemanente = O419EntUniRem ;
      httpContext.ajax_rsp_assign_attri("", false, "AV37OldRemanente", GXutil.ltrimstr( AV37OldRemanente, 11, 4));
      if ( isIns( )  )
      {
         A847UltLinEnt = (short)(O847UltLinEnt+1) ;
         httpContext.ajax_rsp_assign_attri("", false, "A847UltLinEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A847UltLinEnt), 4, 0));
      }
      if ( ! (0==AV9LinEnt) )
      {
         A597LinEnt = AV9LinEnt ;
         httpContext.ajax_rsp_assign_attri("", false, "A597LinEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A597LinEnt), 4, 0));
      }
      else
      {
         if ( isIns( )  && ( Gx_BScreen == 1 ) )
         {
            A597LinEnt = A847UltLinEnt ;
            httpContext.ajax_rsp_assign_attri("", false, "A597LinEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A597LinEnt), 4, 0));
         }
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
      AV35OldExiAlm = O704PrdExiAlm ;
      httpContext.ajax_rsp_assign_attri("", false, "AV35OldExiAlm", GXutil.ltrimstr( AV35OldExiAlm, 12, 4));
      if ( isIns( )  && (0==A6156EntPrvNum) && ( Gx_BScreen == 0 ) )
      {
         A6156EntPrvNum = A795PrvNum ;
         n6156EntPrvNum = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A6156EntPrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6156EntPrvNum), 6, 0));
      }
      if ( isDlt( )  && ( ! (0==A658PedCod) ) )
      {
         A657PedCanEnt = O657PedCanEnt.subtract(O418EntUniEnt) ;
         httpContext.ajax_rsp_assign_attri("", false, "A657PedCanEnt", GXutil.ltrimstr( A657PedCanEnt, 9, 2));
      }
      else
      {
         if ( isUpd( )  && ! ( ! (0==A658PedCod) ) && ( ! (0==A658PedCod) ) )
         {
            A657PedCanEnt = O657PedCanEnt.subtract(O418EntUniEnt) ;
            httpContext.ajax_rsp_assign_attri("", false, "A657PedCanEnt", GXutil.ltrimstr( A657PedCanEnt, 9, 2));
         }
         else
         {
            if ( isUpd( )  && ( ! (0==A658PedCod) ) && ! ( ! (0==A658PedCod) ) )
            {
               A657PedCanEnt = O657PedCanEnt.add(A418EntUniEnt) ;
               httpContext.ajax_rsp_assign_attri("", false, "A657PedCanEnt", GXutil.ltrimstr( A657PedCanEnt, 9, 2));
            }
            else
            {
               if ( ( isIns( )  || isUpd( )  || isDlt( )  ) && ( ! (0==A658PedCod) ) )
               {
                  A657PedCanEnt = O657PedCanEnt.add(A418EntUniEnt).subtract(O418EntUniEnt) ;
                  httpContext.ajax_rsp_assign_attri("", false, "A657PedCanEnt", GXutil.ltrimstr( A657PedCanEnt, 9, 2));
               }
            }
         }
      }
      if ( ! (0==A658PedCod) && isIns( )  && ( A660PedDto.doubleValue() > 0 ) )
      {
         A417EntPre = GXutil.roundDecimal( A665PedPre.multiply((DecimalUtil.doubleToDec(1).subtract((A660PedDto.divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN))))), 2) ;
         httpContext.ajax_rsp_assign_attri("", false, "A417EntPre", GXutil.ltrimstr( A417EntPre, 14, 5));
      }
      else
      {
         if ( ! (0==A658PedCod) && isIns( )  && ( A660PedDto.doubleValue() == 0 ) )
         {
            A417EntPre = A665PedPre ;
            httpContext.ajax_rsp_assign_attri("", false, "A417EntPre", GXutil.ltrimstr( A417EntPre, 14, 5));
         }
      }
      if ( true )
      {
         AV22PedPri = GXutil.str( A800PrvPri, 1, 0) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV22PedPri", AV22PedPri);
      }
      else
      {
         if ( true /* Level */ && ! (0==A658PedCod) )
         {
            AV22PedPri = A666PedPri ;
            httpContext.ajax_rsp_assign_attri("", false, "AV22PedPri", AV22PedPri);
         }
      }
      GXt_date10 = A14040PrdUltMovF ;
      GXv_char4[0] = A396EmprCod ;
      GXv_char3[0] = A719PrdNum ;
      GXv_date11[0] = GXt_date10 ;
      new app.pstm005(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_date11) ;
      entradaproducto_trn_impl.this.A396EmprCod = GXv_char4[0] ;
      entradaproducto_trn_impl.this.A719PrdNum = GXv_char3[0] ;
      entradaproducto_trn_impl.this.GXt_date10 = GXv_date11[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
      A14040PrdUltMovF = GXt_date10 ;
      httpContext.ajax_rsp_assign_attri("", false, "A14040PrdUltMovF", localUtil.format(A14040PrdUltMovF, "99/99/99"));
      GXt_date10 = A3835UltFecCCs ;
      GXv_char4[0] = A396EmprCod ;
      GXv_char3[0] = A719PrdNum ;
      GXv_date11[0] = GXt_date10 ;
      new app.pstm005(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_date11) ;
      entradaproducto_trn_impl.this.A396EmprCod = GXv_char4[0] ;
      entradaproducto_trn_impl.this.A719PrdNum = GXv_char3[0] ;
      entradaproducto_trn_impl.this.GXt_date10 = GXv_date11[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
      A3835UltFecCCs = GXt_date10 ;
      httpContext.ajax_rsp_assign_attri("", false, "A3835UltFecCCs", localUtil.format(A3835UltFecCCs, "99/99/99"));
      A664PedNumLin = (short)(getPedNumLin0( A396EmprCod, A658PedCod)) ;
      httpContext.ajax_rsp_assign_attri("", false, "A664PedNumLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A664PedNumLin), 3, 0));
      if ( isIns( )  && (0==A12716EntFabId) && ( Gx_BScreen == 0 ) )
      {
         A12716EntFabId = A6156EntPrvNum ;
         httpContext.ajax_rsp_assign_attri("", false, "A12716EntFabId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12716EntFabId), 6, 0));
      }
      AV23OldEntPre = O417EntPre ;
      httpContext.ajax_rsp_assign_attri("", false, "AV23OldEntPre", GXutil.ltrimstr( AV23OldEntPre, 14, 5));
      AV41PrecAnt = O417EntPre ;
      httpContext.ajax_rsp_assign_attri("", false, "AV41PrecAnt", GXutil.ltrimstr( AV41PrecAnt, 14, 5));
      if ( isIns( )  && true /* Level */ )
      {
         A750PrdValStk = O750PrdValStk.add(GXutil.roundDecimal( A417EntPre.multiply(A418EntUniEnt), 2)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A750PrdValStk", GXutil.ltrimstr( A750PrdValStk, 11, 2));
      }
      else
      {
         if ( isUpd( )  && true /* Level */ )
         {
            A750PrdValStk = O750PrdValStk.add((GXutil.roundDecimal( A417EntPre.multiply(A418EntUniEnt), 2).subtract(GXutil.roundDecimal( AV23OldEntPre.multiply(AV36OldEntUni), 2)))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A750PrdValStk", GXutil.ltrimstr( A750PrdValStk, 11, 2));
         }
         else
         {
            if ( isDlt( )  && true /* Level */ )
            {
               A750PrdValStk = O750PrdValStk.subtract(GXutil.roundDecimal( A417EntPre.multiply(A418EntUniEnt), 2)) ;
               httpContext.ajax_rsp_assign_attri("", false, "A750PrdValStk", GXutil.ltrimstr( A750PrdValStk, 11, 2));
            }
         }
      }
      if ( ( A704PrdExiAlm.doubleValue() != 0 ) && ( AV30Consumos == 1 ) && ( A750PrdValStk.doubleValue() > 0 ) )
      {
         A726PrdPreMed = GXutil.roundDecimal( A750PrdValStk.divide(A704PrdExiAlm, 18, java.math.RoundingMode.DOWN), 3) ;
         httpContext.ajax_rsp_assign_attri("", false, "A726PrdPreMed", GXutil.ltrimstr( A726PrdPreMed, 14, 5));
      }
      else
      {
         if ( ( A704PrdExiAlm.doubleValue() == 0 ) && ( AV30Consumos == 1 ) && ( A750PrdValStk.doubleValue() == 0 ) )
         {
            A726PrdPreMed = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A726PrdPreMed", GXutil.ltrimstr( A726PrdPreMed, 14, 5));
         }
         else
         {
            if ( ( ( A704PrdExiAlm.doubleValue() != 0 ) || ( A705PrdExiCC.doubleValue() != 0 ) ) && ( AV30Consumos == 0 ) )
            {
               A726PrdPreMed = GXutil.roundDecimal( A750PrdValStk.divide((A704PrdExiAlm.add(A705PrdExiCC)), 18, java.math.RoundingMode.DOWN), 3) ;
               httpContext.ajax_rsp_assign_attri("", false, "A726PrdPreMed", GXutil.ltrimstr( A726PrdPreMed, 14, 5));
            }
            else
            {
               if ( ( A704PrdExiAlm.doubleValue() == 0 ) && ( A705PrdExiCC.doubleValue() == 0 ) && ( AV30Consumos == 0 ) )
               {
                  A726PrdPreMed = DecimalUtil.doubleToDec(0) ;
                  httpContext.ajax_rsp_assign_attri("", false, "A726PrdPreMed", GXutil.ltrimstr( A726PrdPreMed, 14, 5));
               }
            }
         }
      }
   }

   public void checkExtendedTable1SK42( )
   {
      nIsDirty_42 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal( ) ;
      AV32Year = (short)(GXutil.year( A415EntFecEnt)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32Year", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV32Year), 4, 0));
      AV21Fecha = localUtil.ymdtod( AV32Year, 12, 1) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21Fecha", localUtil.format(AV21Fecha, "99/99/99"));
      AV34Mes = (short)(GXutil.month( A415EntFecEnt)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV34Mes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34Mes), 4, 0));
      AV24oldEntFecent = O415EntFecEnt ;
      httpContext.ajax_rsp_assign_attri("", false, "AV24oldEntFecent", localUtil.format(AV24oldEntFecent, "99/99/99"));
      AV39FecAnt = O415EntFecEnt ;
      httpContext.ajax_rsp_assign_attri("", false, "AV39FecAnt", localUtil.format(AV39FecAnt, "99/99/99"));
      AV42AnyAnt = (short)(GXutil.year( O415EntFecEnt)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV42AnyAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV42AnyAnt), 4, 0));
      AV43MesAnt = (byte)(GXutil.month( O415EntFecEnt)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV43MesAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV43MesAnt), 2, 0));
      AV33DiasFin = (short)(GXutil.ddiff(GXutil.eomdate( AV21Fecha),A415EntFecEnt)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV33DiasFin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV33DiasFin), 4, 0));
      AV36OldEntUni = O418EntUniEnt ;
      httpContext.ajax_rsp_assign_attri("", false, "AV36OldEntUni", GXutil.ltrimstr( AV36OldEntUni, 9, 2));
      AV40UniOld = O418EntUniEnt ;
      httpContext.ajax_rsp_assign_attri("", false, "AV40UniOld", GXutil.ltrimstr( AV40UniOld, 9, 2));
      if ( isIns( )  && (GXutil.strcmp("", A3404EntPedCum)==0) && ( Gx_BScreen == 0 ) )
      {
         nIsDirty_42 = (short)(1) ;
         A3404EntPedCum = httpContext.getMessage( httpContext.getMessage( "N", ""), "") ;
         httpContext.ajax_rsp_assign_attri("", false, "A3404EntPedCum", A3404EntPedCum);
      }
      else
      {
         if ( (0==A658PedCod) )
         {
            nIsDirty_42 = (short)(1) ;
            A3404EntPedCum = httpContext.getMessage( httpContext.getMessage( "S", ""), "") ;
            httpContext.ajax_rsp_assign_attri("", false, "A3404EntPedCum", A3404EntPedCum);
         }
         else
         {
            if ( ( ( DecimalUtil.compareTo(A657PedCanEnt, A669PedUni) == 0 ) || ( DecimalUtil.compareTo(A657PedCanEnt, A669PedUni) > 0 ) ) && ! (0==A658PedCod) && true /* After */ )
            {
               nIsDirty_42 = (short)(1) ;
               A3404EntPedCum = httpContext.getMessage( httpContext.getMessage( "S", ""), "") ;
               httpContext.ajax_rsp_assign_attri("", false, "A3404EntPedCum", A3404EntPedCum);
            }
            else
            {
               if ( ( DecimalUtil.compareTo(A657PedCanEnt, A669PedUni) < 0 ) && ! (0==A658PedCod) && true /* After */ )
               {
                  nIsDirty_42 = (short)(1) ;
                  A3404EntPedCum = httpContext.getMessage( httpContext.getMessage( "N", ""), "") ;
                  httpContext.ajax_rsp_assign_attri("", false, "A3404EntPedCum", A3404EntPedCum);
               }
            }
         }
      }
      if ( isIns( )  && true /* After */ )
      {
         nIsDirty_42 = (short)(1) ;
         A419EntUniRem = O419EntUniRem.add(A418EntUniEnt) ;
         httpContext.ajax_rsp_assign_attri("", false, "A419EntUniRem", GXutil.ltrimstr( A419EntUniRem, 11, 4));
      }
      else
      {
         if ( isUpd( )  && true /* After */ )
         {
            nIsDirty_42 = (short)(1) ;
            A419EntUniRem = (O419EntUniRem.add(A418EntUniEnt).subtract(O418EntUniEnt)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A419EntUniRem", GXutil.ltrimstr( A419EntUniRem, 11, 4));
         }
         else
         {
            if ( isDlt( )  && true /* After */ )
            {
               nIsDirty_42 = (short)(1) ;
               A419EntUniRem = (O419EntUniRem.subtract(A418EntUniEnt)) ;
               httpContext.ajax_rsp_assign_attri("", false, "A419EntUniRem", GXutil.ltrimstr( A419EntUniRem, 11, 4));
            }
         }
      }
      if ( isUpd( )  && ( DecimalUtil.compareTo(A419EntUniRem, A418EntUniEnt) != 0 ) )
      {
         edtEntFecEnt_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtEntFecEnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEntFecEnt_Enabled), 5, 0), true);
      }
      else
      {
         edtEntFecEnt_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtEntFecEnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEntFecEnt_Enabled), 5, 0), true);
      }
      if ( isUpd( )  && ( DecimalUtil.compareTo(A419EntUniRem, A418EntUniEnt) != 0 ) )
      {
         edtAlbaran_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAlbaran_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbaran_Enabled), 5, 0), true);
      }
      else
      {
         edtAlbaran_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAlbaran_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbaran_Enabled), 5, 0), true);
      }
      if ( isUpd( )  && ( DecimalUtil.compareTo(A419EntUniRem, A418EntUniEnt) != 0 ) )
      {
         edtEntNAlbar_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtEntNAlbar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEntNAlbar_Enabled), 5, 0), true);
      }
      else
      {
         edtEntNAlbar_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtEntNAlbar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEntNAlbar_Enabled), 5, 0), true);
      }
      if ( isUpd( )  && ( DecimalUtil.compareTo(A419EntUniRem, A418EntUniEnt) != 0 ) )
      {
         edtEntPrvNum_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtEntPrvNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEntPrvNum_Enabled), 5, 0), true);
      }
      else
      {
         edtEntPrvNum_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtEntPrvNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEntPrvNum_Enabled), 5, 0), true);
      }
      if ( isUpd( )  && ( DecimalUtil.compareTo(A419EntUniRem, A418EntUniEnt) != 0 ) )
      {
         edtEntUniEnt_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtEntUniEnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEntUniEnt_Enabled), 5, 0), true);
      }
      else
      {
         edtEntUniEnt_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtEntUniEnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEntUniEnt_Enabled), 5, 0), true);
      }
      if ( isUpd( )  && ( DecimalUtil.compareTo(A419EntUniRem, A418EntUniEnt) != 0 ) )
      {
         edtEntLotN_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtEntLotN_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEntLotN_Enabled), 5, 0), true);
      }
      else
      {
         edtEntLotN_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtEntLotN_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEntLotN_Enabled), 5, 0), true);
      }
      if ( isUpd( )  && ( DecimalUtil.compareTo(A419EntUniRem, A418EntUniEnt) != 0 ) )
      {
         edtEntPre_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtEntPre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEntPre_Enabled), 5, 0), true);
      }
      else
      {
         edtEntPre_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtEntPre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEntPre_Enabled), 5, 0), true);
      }
      if ( isUpd( )  && ( DecimalUtil.compareTo(A419EntUniRem, A418EntUniEnt) != 0 ) )
      {
         edtEntFVal_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtEntFVal_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEntFVal_Enabled), 5, 0), true);
      }
      else
      {
         edtEntFVal_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtEntFVal_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEntFVal_Enabled), 5, 0), true);
      }
      if ( isUpd( )  && ( DecimalUtil.compareTo(A419EntUniRem, A418EntUniEnt) != 0 ) )
      {
         edtEntPedCum_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtEntPedCum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEntPedCum_Enabled), 5, 0), true);
      }
      else
      {
         edtEntPedCum_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtEntPedCum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEntPedCum_Enabled), 5, 0), true);
      }
      AV38oldlote = O5686EntLotN ;
      httpContext.ajax_rsp_assign_attri("", false, "AV38oldlote", AV38oldlote);
      if ( ! ( ( GXutil.strcmp(A3404EntPedCum, "S") == 0 ) || ( GXutil.strcmp(A3404EntPedCum, "N") == 0 ) ) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Cerrar?", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, "ENTPEDCUM");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEntPedCum_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      AV37OldRemanente = O419EntUniRem ;
      httpContext.ajax_rsp_assign_attri("", false, "AV37OldRemanente", GXutil.ltrimstr( AV37OldRemanente, 11, 4));
      /* Using cursor T01SK6 */
      pr_default.execute(4, new Object[] {A396EmprCod, A719PrdNum});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PRODUC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PRDNUM");
         AnyError = (short)(1) ;
         GX_FocusControl = edtPrdNum_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A847UltLinEnt = T01SK6_A847UltLinEnt[0] ;
      A704PrdExiAlm = T01SK6_A704PrdExiAlm[0] ;
      A726PrdPreMed = T01SK6_A726PrdPreMed[0] ;
      A750PrdValStk = T01SK6_A750PrdValStk[0] ;
      A718PrdNom = T01SK6_A718PrdNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A718PrdNom", A718PrdNom);
      A724PrdPreAct = T01SK6_A724PrdPreAct[0] ;
      A698PrdDetPar = T01SK6_A698PrdDetPar[0] ;
      A713PrdFulEnt = T01SK6_A713PrdFulEnt[0] ;
      A684PrdCanPen = T01SK6_A684PrdCanPen[0] ;
      A729PrdRotRea = T01SK6_A729PrdRotRea[0] ;
      A727PrdRec = T01SK6_A727PrdRec[0] ;
      A725PrdPreAnt = T01SK6_A725PrdPreAnt[0] ;
      A709PrdFecPre = T01SK6_A709PrdFecPre[0] ;
      A5255PrdPreAc2 = T01SK6_A5255PrdPreAc2[0] ;
      A705PrdExiCC = T01SK6_A705PrdExiCC[0] ;
      A795PrvNum = T01SK6_A795PrvNum[0] ;
      A856ValCod = T01SK6_A856ValCod[0] ;
      nIsDirty_42 = (short)(1) ;
      O750PrdValStk = A750PrdValStk ;
      httpContext.ajax_rsp_assign_attri("", false, "A750PrdValStk", GXutil.ltrimstr( A750PrdValStk, 11, 2));
      nIsDirty_42 = (short)(1) ;
      O704PrdExiAlm = A704PrdExiAlm ;
      httpContext.ajax_rsp_assign_attri("", false, "A704PrdExiAlm", GXutil.ltrimstr( A704PrdExiAlm, 12, 4));
      nIsDirty_42 = (short)(1) ;
      O847UltLinEnt = A847UltLinEnt ;
      httpContext.ajax_rsp_assign_attri("", false, "A847UltLinEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A847UltLinEnt), 4, 0));
      pr_default.close(4);
      if ( isIns( )  )
      {
         nIsDirty_42 = (short)(1) ;
         A847UltLinEnt = (short)(O847UltLinEnt+1) ;
         httpContext.ajax_rsp_assign_attri("", false, "A847UltLinEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A847UltLinEnt), 4, 0));
      }
      if ( ! (0==AV9LinEnt) )
      {
         nIsDirty_42 = (short)(1) ;
         A597LinEnt = AV9LinEnt ;
         httpContext.ajax_rsp_assign_attri("", false, "A597LinEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A597LinEnt), 4, 0));
      }
      else
      {
         if ( isIns( )  && ( Gx_BScreen == 1 ) )
         {
            nIsDirty_42 = (short)(1) ;
            A597LinEnt = A847UltLinEnt ;
            httpContext.ajax_rsp_assign_attri("", false, "A597LinEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A597LinEnt), 4, 0));
         }
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
      AV35OldExiAlm = O704PrdExiAlm ;
      httpContext.ajax_rsp_assign_attri("", false, "AV35OldExiAlm", GXutil.ltrimstr( AV35OldExiAlm, 12, 4));
      if ( isIns( )  && (0==A6156EntPrvNum) && ( Gx_BScreen == 0 ) )
      {
         nIsDirty_42 = (short)(1) ;
         A6156EntPrvNum = A795PrvNum ;
         n6156EntPrvNum = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A6156EntPrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6156EntPrvNum), 6, 0));
      }
      /* Using cursor T01SK7 */
      pr_default.execute(5, new Object[] {A396EmprCod, Boolean.valueOf(n658PedCod), Integer.valueOf(A658PedCod)});
      if ( (pr_default.getStatus(5) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A658PedCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CPEDID", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PEDCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtPedCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A661PedFec = T01SK7_A661PedFec[0] ;
      A667PedSit = T01SK7_A667PedSit[0] ;
      A666PedPri = T01SK7_A666PedPri[0] ;
      A12580PedAlmc = T01SK7_A12580PedAlmc[0] ;
      pr_default.close(5);
      /* Using cursor T01SK9 */
      pr_default.execute(7, new Object[] {A396EmprCod, Boolean.valueOf(n658PedCod), Integer.valueOf(A658PedCod), A719PrdNum});
      if ( (pr_default.getStatus(7) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A658PedCod) || (GXutil.strcmp("", A719PrdNum)==0) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "LPEDID", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PRDNUM");
            AnyError = (short)(1) ;
            GX_FocusControl = edtPedCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A657PedCanEnt = T01SK9_A657PedCanEnt[0] ;
      A665PedPre = T01SK9_A665PedPre[0] ;
      A669PedUni = T01SK9_A669PedUni[0] ;
      A663PedFulEnt = T01SK9_A663PedFulEnt[0] ;
      A659PedCum = T01SK9_A659PedCum[0] ;
      A660PedDto = T01SK9_A660PedDto[0] ;
      nIsDirty_42 = (short)(1) ;
      O657PedCanEnt = A657PedCanEnt ;
      httpContext.ajax_rsp_assign_attri("", false, "A657PedCanEnt", GXutil.ltrimstr( A657PedCanEnt, 9, 2));
      pr_default.close(7);
      if ( isDlt( )  && ( ! (0==A658PedCod) ) )
      {
         nIsDirty_42 = (short)(1) ;
         A657PedCanEnt = O657PedCanEnt.subtract(O418EntUniEnt) ;
         httpContext.ajax_rsp_assign_attri("", false, "A657PedCanEnt", GXutil.ltrimstr( A657PedCanEnt, 9, 2));
      }
      else
      {
         if ( isUpd( )  && ! ( ! (0==A658PedCod) ) && ( ! (0==A658PedCod) ) )
         {
            nIsDirty_42 = (short)(1) ;
            A657PedCanEnt = O657PedCanEnt.subtract(O418EntUniEnt) ;
            httpContext.ajax_rsp_assign_attri("", false, "A657PedCanEnt", GXutil.ltrimstr( A657PedCanEnt, 9, 2));
         }
         else
         {
            if ( isUpd( )  && ( ! (0==A658PedCod) ) && ! ( ! (0==A658PedCod) ) )
            {
               nIsDirty_42 = (short)(1) ;
               A657PedCanEnt = O657PedCanEnt.add(A418EntUniEnt) ;
               httpContext.ajax_rsp_assign_attri("", false, "A657PedCanEnt", GXutil.ltrimstr( A657PedCanEnt, 9, 2));
            }
            else
            {
               if ( ( isIns( )  || isUpd( )  || isDlt( )  ) && ( ! (0==A658PedCod) ) )
               {
                  nIsDirty_42 = (short)(1) ;
                  A657PedCanEnt = O657PedCanEnt.add(A418EntUniEnt).subtract(O418EntUniEnt) ;
                  httpContext.ajax_rsp_assign_attri("", false, "A657PedCanEnt", GXutil.ltrimstr( A657PedCanEnt, 9, 2));
               }
            }
         }
      }
      if ( ! (0==A658PedCod) && isIns( )  && ( A660PedDto.doubleValue() > 0 ) )
      {
         nIsDirty_42 = (short)(1) ;
         A417EntPre = GXutil.roundDecimal( A665PedPre.multiply((DecimalUtil.doubleToDec(1).subtract((A660PedDto.divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN))))), 2) ;
         httpContext.ajax_rsp_assign_attri("", false, "A417EntPre", GXutil.ltrimstr( A417EntPre, 14, 5));
      }
      else
      {
         if ( ! (0==A658PedCod) && isIns( )  && ( A660PedDto.doubleValue() == 0 ) )
         {
            nIsDirty_42 = (short)(1) ;
            A417EntPre = A665PedPre ;
            httpContext.ajax_rsp_assign_attri("", false, "A417EntPre", GXutil.ltrimstr( A417EntPre, 14, 5));
         }
      }
      /* Using cursor T01SK10 */
      pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(A795PrvNum)});
      if ( (pr_default.getStatus(8) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PRVGEN", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PRVNUM");
         AnyError = (short)(1) ;
      }
      A794PrvNom = T01SK10_A794PrvNom[0] ;
      n794PrvNom = T01SK10_n794PrvNom[0] ;
      A800PrvPri = T01SK10_A800PrvPri[0] ;
      n800PrvPri = T01SK10_n800PrvPri[0] ;
      pr_default.close(8);
      if ( true )
      {
         AV22PedPri = GXutil.str( A800PrvPri, 1, 0) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV22PedPri", AV22PedPri);
      }
      else
      {
         if ( true /* Level */ && ! (0==A658PedCod) )
         {
            AV22PedPri = A666PedPri ;
            httpContext.ajax_rsp_assign_attri("", false, "AV22PedPri", AV22PedPri);
         }
      }
      /* Using cursor T01SK12 */
      pr_default.execute(9, new Object[] {A396EmprCod, A719PrdNum});
      if ( (pr_default.getStatus(9) != 101) )
      {
         A913StockRem = T01SK12_A913StockRem[0] ;
         n913StockRem = T01SK12_n913StockRem[0] ;
      }
      else
      {
         nIsDirty_42 = (short)(1) ;
         A913StockRem = DecimalUtil.doubleToDec(0) ;
         n913StockRem = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A913StockRem", GXutil.ltrimstr( A913StockRem, 12, 4));
      }
      pr_default.close(9);
      nIsDirty_42 = (short)(1) ;
      GXt_date10 = A14040PrdUltMovF ;
      GXv_char4[0] = A396EmprCod ;
      GXv_char3[0] = A719PrdNum ;
      GXv_date11[0] = GXt_date10 ;
      new app.pstm005(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_date11) ;
      entradaproducto_trn_impl.this.A396EmprCod = GXv_char4[0] ;
      entradaproducto_trn_impl.this.A719PrdNum = GXv_char3[0] ;
      entradaproducto_trn_impl.this.GXt_date10 = GXv_date11[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
      A14040PrdUltMovF = GXt_date10 ;
      httpContext.ajax_rsp_assign_attri("", false, "A14040PrdUltMovF", localUtil.format(A14040PrdUltMovF, "99/99/99"));
      nIsDirty_42 = (short)(1) ;
      GXt_date10 = A3835UltFecCCs ;
      GXv_char4[0] = A396EmprCod ;
      GXv_char3[0] = A719PrdNum ;
      GXv_date11[0] = GXt_date10 ;
      new app.pstm005(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_date11) ;
      entradaproducto_trn_impl.this.A396EmprCod = GXv_char4[0] ;
      entradaproducto_trn_impl.this.A719PrdNum = GXv_char3[0] ;
      entradaproducto_trn_impl.this.GXt_date10 = GXv_date11[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
      A3835UltFecCCs = GXt_date10 ;
      httpContext.ajax_rsp_assign_attri("", false, "A3835UltFecCCs", localUtil.format(A3835UltFecCCs, "99/99/99"));
      nIsDirty_42 = (short)(1) ;
      A664PedNumLin = (short)(getPedNumLin0( A396EmprCod, A658PedCod)) ;
      httpContext.ajax_rsp_assign_attri("", false, "A664PedNumLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A664PedNumLin), 3, 0));
      if ( isIns( )  && (0==A12716EntFabId) && ( Gx_BScreen == 0 ) )
      {
         nIsDirty_42 = (short)(1) ;
         A12716EntFabId = A6156EntPrvNum ;
         httpContext.ajax_rsp_assign_attri("", false, "A12716EntFabId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12716EntFabId), 6, 0));
      }
      AV23OldEntPre = O417EntPre ;
      httpContext.ajax_rsp_assign_attri("", false, "AV23OldEntPre", GXutil.ltrimstr( AV23OldEntPre, 14, 5));
      AV41PrecAnt = O417EntPre ;
      httpContext.ajax_rsp_assign_attri("", false, "AV41PrecAnt", GXutil.ltrimstr( AV41PrecAnt, 14, 5));
      if ( isIns( )  && true /* Level */ )
      {
         nIsDirty_42 = (short)(1) ;
         A750PrdValStk = O750PrdValStk.add(GXutil.roundDecimal( A417EntPre.multiply(A418EntUniEnt), 2)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A750PrdValStk", GXutil.ltrimstr( A750PrdValStk, 11, 2));
      }
      else
      {
         if ( isUpd( )  && true /* Level */ )
         {
            nIsDirty_42 = (short)(1) ;
            A750PrdValStk = O750PrdValStk.add((GXutil.roundDecimal( A417EntPre.multiply(A418EntUniEnt), 2).subtract(GXutil.roundDecimal( AV23OldEntPre.multiply(AV36OldEntUni), 2)))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A750PrdValStk", GXutil.ltrimstr( A750PrdValStk, 11, 2));
         }
         else
         {
            if ( isDlt( )  && true /* Level */ )
            {
               nIsDirty_42 = (short)(1) ;
               A750PrdValStk = O750PrdValStk.subtract(GXutil.roundDecimal( A417EntPre.multiply(A418EntUniEnt), 2)) ;
               httpContext.ajax_rsp_assign_attri("", false, "A750PrdValStk", GXutil.ltrimstr( A750PrdValStk, 11, 2));
            }
         }
      }
      if ( ( A704PrdExiAlm.doubleValue() != 0 ) && ( AV30Consumos == 1 ) && ( A750PrdValStk.doubleValue() > 0 ) )
      {
         nIsDirty_42 = (short)(1) ;
         A726PrdPreMed = GXutil.roundDecimal( A750PrdValStk.divide(A704PrdExiAlm, 18, java.math.RoundingMode.DOWN), 3) ;
         httpContext.ajax_rsp_assign_attri("", false, "A726PrdPreMed", GXutil.ltrimstr( A726PrdPreMed, 14, 5));
      }
      else
      {
         if ( ( A704PrdExiAlm.doubleValue() == 0 ) && ( AV30Consumos == 1 ) && ( A750PrdValStk.doubleValue() == 0 ) )
         {
            nIsDirty_42 = (short)(1) ;
            A726PrdPreMed = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A726PrdPreMed", GXutil.ltrimstr( A726PrdPreMed, 14, 5));
         }
         else
         {
            if ( ( ( A704PrdExiAlm.doubleValue() != 0 ) || ( A705PrdExiCC.doubleValue() != 0 ) ) && ( AV30Consumos == 0 ) )
            {
               nIsDirty_42 = (short)(1) ;
               A726PrdPreMed = GXutil.roundDecimal( A750PrdValStk.divide((A704PrdExiAlm.add(A705PrdExiCC)), 18, java.math.RoundingMode.DOWN), 3) ;
               httpContext.ajax_rsp_assign_attri("", false, "A726PrdPreMed", GXutil.ltrimstr( A726PrdPreMed, 14, 5));
            }
            else
            {
               if ( ( A704PrdExiAlm.doubleValue() == 0 ) && ( A705PrdExiCC.doubleValue() == 0 ) && ( AV30Consumos == 0 ) )
               {
                  nIsDirty_42 = (short)(1) ;
                  A726PrdPreMed = DecimalUtil.doubleToDec(0) ;
                  httpContext.ajax_rsp_assign_attri("", false, "A726PrdPreMed", GXutil.ltrimstr( A726PrdPreMed, 14, 5));
               }
            }
         }
      }
   }

   public void closeExtendedTableCursors1SK42( )
   {
      pr_default.close(3);
      pr_default.close(5);
      pr_default.close(6);
      pr_default.close(8);
      pr_default.close(9);
   }

   public void enableDisable( )
   {
   }

   public void gxload_92( String A396EmprCod ,
                          String A719PrdNum )
   {
      /* Using cursor T01SK6 */
      pr_default.execute(4, new Object[] {A396EmprCod, A719PrdNum});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PRODUC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PRDNUM");
         AnyError = (short)(1) ;
         GX_FocusControl = edtPrdNum_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A847UltLinEnt = T01SK6_A847UltLinEnt[0] ;
      A704PrdExiAlm = T01SK6_A704PrdExiAlm[0] ;
      A726PrdPreMed = T01SK6_A726PrdPreMed[0] ;
      A750PrdValStk = T01SK6_A750PrdValStk[0] ;
      A718PrdNom = T01SK6_A718PrdNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A718PrdNom", A718PrdNom);
      A724PrdPreAct = T01SK6_A724PrdPreAct[0] ;
      A698PrdDetPar = T01SK6_A698PrdDetPar[0] ;
      A713PrdFulEnt = T01SK6_A713PrdFulEnt[0] ;
      A684PrdCanPen = T01SK6_A684PrdCanPen[0] ;
      A729PrdRotRea = T01SK6_A729PrdRotRea[0] ;
      A727PrdRec = T01SK6_A727PrdRec[0] ;
      A725PrdPreAnt = T01SK6_A725PrdPreAnt[0] ;
      A709PrdFecPre = T01SK6_A709PrdFecPre[0] ;
      A5255PrdPreAc2 = T01SK6_A5255PrdPreAc2[0] ;
      A705PrdExiCC = T01SK6_A705PrdExiCC[0] ;
      A795PrvNum = T01SK6_A795PrvNum[0] ;
      A856ValCod = T01SK6_A856ValCod[0] ;
      O750PrdValStk = A750PrdValStk ;
      httpContext.ajax_rsp_assign_attri("", false, "A750PrdValStk", GXutil.ltrimstr( A750PrdValStk, 11, 2));
      O704PrdExiAlm = A704PrdExiAlm ;
      httpContext.ajax_rsp_assign_attri("", false, "A704PrdExiAlm", GXutil.ltrimstr( A704PrdExiAlm, 12, 4));
      O847UltLinEnt = A847UltLinEnt ;
      httpContext.ajax_rsp_assign_attri("", false, "A847UltLinEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A847UltLinEnt), 4, 0));
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A847UltLinEnt, (byte)(4), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A704PrdExiAlm, (byte)(12), (byte)(4), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A726PrdPreMed, (byte)(14), (byte)(5), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A750PrdValStk, (byte)(11), (byte)(2), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A718PrdNom))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A724PrdPreAct, (byte)(14), (byte)(5), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A698PrdDetPar))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( localUtil.format(A713PrdFulEnt, "99/99/99"))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A684PrdCanPen, (byte)(12), (byte)(4), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A729PrdRotRea, (byte)(12), (byte)(5), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A727PrdRec))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A725PrdPreAnt, (byte)(14), (byte)(5), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( localUtil.format(A709PrdFecPre, "99/99/99"))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A5255PrdPreAc2, (byte)(14), (byte)(5), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A705PrdExiCC, (byte)(12), (byte)(4), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A795PrvNum, (byte)(6), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A856ValCod, (byte)(1), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(4) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(4);
   }

   public void gxload_93( String A396EmprCod ,
                          int A658PedCod )
   {
      /* Using cursor T01SK15 */
      pr_default.execute(11, new Object[] {A396EmprCod, Boolean.valueOf(n658PedCod), Integer.valueOf(A658PedCod)});
      if ( (pr_default.getStatus(11) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A658PedCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CPEDID", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PEDCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtPedCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A661PedFec = T01SK15_A661PedFec[0] ;
      A667PedSit = T01SK15_A667PedSit[0] ;
      A666PedPri = T01SK15_A666PedPri[0] ;
      A12580PedAlmc = T01SK15_A12580PedAlmc[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( localUtil.format(A661PedFec, "99/99/99"))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A667PedSit))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A666PedPri))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A12580PedAlmc, (byte)(1), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(11) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(11);
   }

   public void gxload_94( String A396EmprCod ,
                          int A658PedCod ,
                          String A719PrdNum )
   {
      /* Using cursor T01SK9 */
      pr_default.execute(7, new Object[] {A396EmprCod, Boolean.valueOf(n658PedCod), Integer.valueOf(A658PedCod), A719PrdNum});
      if ( (pr_default.getStatus(7) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A658PedCod) || (GXutil.strcmp("", A719PrdNum)==0) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "LPEDID", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PRDNUM");
            AnyError = (short)(1) ;
            GX_FocusControl = edtPedCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A657PedCanEnt = T01SK9_A657PedCanEnt[0] ;
      A665PedPre = T01SK9_A665PedPre[0] ;
      A669PedUni = T01SK9_A669PedUni[0] ;
      A663PedFulEnt = T01SK9_A663PedFulEnt[0] ;
      A659PedCum = T01SK9_A659PedCum[0] ;
      A660PedDto = T01SK9_A660PedDto[0] ;
      O657PedCanEnt = A657PedCanEnt ;
      httpContext.ajax_rsp_assign_attri("", false, "A657PedCanEnt", GXutil.ltrimstr( A657PedCanEnt, 9, 2));
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A657PedCanEnt, (byte)(9), (byte)(2), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A665PedPre, (byte)(14), (byte)(5), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A669PedUni, (byte)(9), (byte)(2), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( localUtil.format(A663PedFulEnt, "99/99/99"))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A659PedCum))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A660PedDto, (byte)(5), (byte)(2), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(7) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(7);
   }

   public void gxload_95( String A396EmprCod ,
                          int A795PrvNum )
   {
      /* Using cursor T01SK16 */
      pr_default.execute(12, new Object[] {A396EmprCod, Integer.valueOf(A795PrvNum)});
      if ( (pr_default.getStatus(12) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PRVGEN", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PRVNUM");
         AnyError = (short)(1) ;
      }
      A794PrvNom = T01SK16_A794PrvNom[0] ;
      n794PrvNom = T01SK16_n794PrvNom[0] ;
      A800PrvPri = T01SK16_A800PrvPri[0] ;
      n800PrvPri = T01SK16_n800PrvPri[0] ;
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

   public void gxload_96( String A396EmprCod ,
                          String A719PrdNum )
   {
      /* Using cursor T01SK18 */
      pr_default.execute(13, new Object[] {A396EmprCod, A719PrdNum});
      if ( (pr_default.getStatus(13) != 101) )
      {
         A913StockRem = T01SK18_A913StockRem[0] ;
         n913StockRem = T01SK18_n913StockRem[0] ;
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
      if ( (pr_default.getStatus(13) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(13);
   }

   public void getKey1SK42( )
   {
      /* Using cursor T01SK19 */
      pr_default.execute(14, new Object[] {A396EmprCod, A719PrdNum, Short.valueOf(A597LinEnt)});
      if ( (pr_default.getStatus(14) != 101) )
      {
         RcdFound42 = (short)(1) ;
      }
      else
      {
         RcdFound42 = (short)(0) ;
      }
      pr_default.close(14);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01SK3 */
      pr_default.execute(1, new Object[] {A396EmprCod, A719PrdNum, Short.valueOf(A597LinEnt)});
      if ( (pr_default.getStatus(1) != 101) && ( T01SK3_A411EntCon[0] == 0 ) && ( GXutil.strcmp(T01SK3_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1SK42( 90) ;
         RcdFound42 = (short)(1) ;
         A597LinEnt = T01SK3_A597LinEnt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A597LinEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A597LinEnt), 4, 0));
         A411EntCon = T01SK3_A411EntCon[0] ;
         A3404EntPedCum = T01SK3_A3404EntPedCum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3404EntPedCum", A3404EntPedCum);
         A419EntUniRem = T01SK3_A419EntUniRem[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A419EntUniRem", GXutil.ltrimstr( A419EntUniRem, 11, 4));
         A417EntPre = T01SK3_A417EntPre[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A417EntPre", GXutil.ltrimstr( A417EntPre, 14, 5));
         A415EntFecEnt = T01SK3_A415EntFecEnt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A415EntFecEnt", localUtil.format(A415EntFecEnt, "99/99/99"));
         A11Albaran = T01SK3_A11Albaran[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11Albaran", A11Albaran);
         A12857EntNAlbar = T01SK3_A12857EntNAlbar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12857EntNAlbar", A12857EntNAlbar);
         A6156EntPrvNum = T01SK3_A6156EntPrvNum[0] ;
         n6156EntPrvNum = T01SK3_n6156EntPrvNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6156EntPrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6156EntPrvNum), 6, 0));
         A418EntUniEnt = T01SK3_A418EntUniEnt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A418EntUniEnt", GXutil.ltrimstr( A418EntUniEnt, 9, 2));
         A416EntNumCon = T01SK3_A416EntNumCon[0] ;
         A5686EntLotN = T01SK3_A5686EntLotN[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5686EntLotN", A5686EntLotN);
         A5685EntFVal = T01SK3_A5685EntFVal[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5685EntFVal", localUtil.format(A5685EntFVal, "99/99/99"));
         A414EntEti = T01SK3_A414EntEti[0] ;
         A413EntConIni = T01SK3_A413EntConIni[0] ;
         A412EntConFin = T01SK3_A412EntConFin[0] ;
         A5691EntBnc = T01SK3_A5691EntBnc[0] ;
         A7695EntCC = T01SK3_A7695EntCC[0] ;
         A7696EntCCoCod = T01SK3_A7696EntCCoCod[0] ;
         A10782EntUniAlb = T01SK3_A10782EntUniAlb[0] ;
         A10783EntObs = T01SK3_A10783EntObs[0] ;
         A10187EntRemNro = T01SK3_A10187EntRemNro[0] ;
         A10186EntRemFch = T01SK3_A10186EntRemFch[0] ;
         A10185EntRemSuc = T01SK3_A10185EntRemSuc[0] ;
         A10184EntRemTpo = T01SK3_A10184EntRemTpo[0] ;
         A12716EntFabId = T01SK3_A12716EntFabId[0] ;
         A13235EntLoteID = T01SK3_A13235EntLoteID[0] ;
         A13456EntUbicaci = T01SK3_A13456EntUbicaci[0] ;
         A5690EntHfCon = T01SK3_A5690EntHfCon[0] ;
         A5689EntFfCon = T01SK3_A5689EntFfCon[0] ;
         A5688EntHiCon = T01SK3_A5688EntHiCon[0] ;
         A5687EntFiCon = T01SK3_A5687EntFiCon[0] ;
         A719PrdNum = T01SK3_A719PrdNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         A658PedCod = T01SK3_A658PedCod[0] ;
         n658PedCod = T01SK3_n658PedCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A658PedCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A658PedCod), 8, 0));
         O419EntUniRem = A419EntUniRem ;
         httpContext.ajax_rsp_assign_attri("", false, "A419EntUniRem", GXutil.ltrimstr( A419EntUniRem, 11, 4));
         O418EntUniEnt = A418EntUniEnt ;
         httpContext.ajax_rsp_assign_attri("", false, "A418EntUniEnt", GXutil.ltrimstr( A418EntUniEnt, 9, 2));
         O415EntFecEnt = A415EntFecEnt ;
         httpContext.ajax_rsp_assign_attri("", false, "A415EntFecEnt", localUtil.format(A415EntFecEnt, "99/99/99"));
         O417EntPre = A417EntPre ;
         httpContext.ajax_rsp_assign_attri("", false, "A417EntPre", GXutil.ltrimstr( A417EntPre, 14, 5));
         O5686EntLotN = A5686EntLotN ;
         httpContext.ajax_rsp_assign_attri("", false, "A5686EntLotN", A5686EntLotN);
         Z396EmprCod = A396EmprCod ;
         Z719PrdNum = A719PrdNum ;
         Z597LinEnt = A597LinEnt ;
         sMode42 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load1SK42( ) ;
         if ( AnyError == 1 )
         {
            RcdFound42 = (short)(0) ;
            initializeNonKey1SK42( ) ;
         }
         Gx_mode = sMode42 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound42 = (short)(0) ;
         initializeNonKey1SK42( ) ;
         sMode42 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode42 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey1SK42( ) ;
      if ( RcdFound42 == 0 )
      {
      }
      else
      {
      }
      getByPrimaryKey( ) ;
   }

   public void move_next( )
   {
      RcdFound42 = (short)(0) ;
      /* Using cursor T01SK20 */
      pr_default.execute(15, new Object[] {A719PrdNum, A719PrdNum, Short.valueOf(A597LinEnt), A396EmprCod});
      if ( (pr_default.getStatus(15) != 101) )
      {
         while ( (pr_default.getStatus(15) != 101) && ( ( GXutil.strcmp(T01SK20_A719PrdNum[0], A719PrdNum) < 0 ) || ( GXutil.strcmp(T01SK20_A719PrdNum[0], A719PrdNum) == 0 ) && ( T01SK20_A597LinEnt[0] < A597LinEnt ) ) && ( GXutil.strcmp(T01SK20_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01SK20_A411EntCon[0] == 0 ) )
         {
            pr_default.readNext(15);
         }
         if ( (pr_default.getStatus(15) != 101) && ( ( GXutil.strcmp(T01SK20_A719PrdNum[0], A719PrdNum) > 0 ) || ( GXutil.strcmp(T01SK20_A719PrdNum[0], A719PrdNum) == 0 ) && ( T01SK20_A597LinEnt[0] > A597LinEnt ) ) && ( GXutil.strcmp(T01SK20_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01SK20_A411EntCon[0] == 0 ) )
         {
            A719PrdNum = T01SK20_A719PrdNum[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
            A597LinEnt = T01SK20_A597LinEnt[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A597LinEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A597LinEnt), 4, 0));
            A411EntCon = T01SK20_A411EntCon[0] ;
            RcdFound42 = (short)(1) ;
         }
      }
      pr_default.close(15);
   }

   public void move_previous( )
   {
      RcdFound42 = (short)(0) ;
      /* Using cursor T01SK21 */
      pr_default.execute(16, new Object[] {A719PrdNum, A719PrdNum, Short.valueOf(A597LinEnt), A396EmprCod});
      if ( (pr_default.getStatus(16) != 101) )
      {
         while ( (pr_default.getStatus(16) != 101) && ( ( GXutil.strcmp(T01SK21_A719PrdNum[0], A719PrdNum) > 0 ) || ( GXutil.strcmp(T01SK21_A719PrdNum[0], A719PrdNum) == 0 ) && ( T01SK21_A597LinEnt[0] > A597LinEnt ) ) && ( GXutil.strcmp(T01SK21_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01SK21_A411EntCon[0] == 0 ) )
         {
            pr_default.readNext(16);
         }
         if ( (pr_default.getStatus(16) != 101) && ( ( GXutil.strcmp(T01SK21_A719PrdNum[0], A719PrdNum) < 0 ) || ( GXutil.strcmp(T01SK21_A719PrdNum[0], A719PrdNum) == 0 ) && ( T01SK21_A597LinEnt[0] < A597LinEnt ) ) && ( GXutil.strcmp(T01SK21_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01SK21_A411EntCon[0] == 0 ) )
         {
            A719PrdNum = T01SK21_A719PrdNum[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
            A597LinEnt = T01SK21_A597LinEnt[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A597LinEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A597LinEnt), 4, 0));
            A411EntCon = T01SK21_A411EntCon[0] ;
            RcdFound42 = (short)(1) ;
         }
      }
      pr_default.close(16);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1SK42( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtPrdNum_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1SK42( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound42 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A719PrdNum, Z719PrdNum) != 0 ) || ( A597LinEnt != Z597LinEnt ) )
            {
               A719PrdNum = Z719PrdNum ;
               httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
               A597LinEnt = Z597LinEnt ;
               httpContext.ajax_rsp_assign_attri("", false, "A597LinEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A597LinEnt), 4, 0));
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
               update1SK42( ) ;
               GX_FocusControl = edtPrdNum_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A719PrdNum, Z719PrdNum) != 0 ) || ( A597LinEnt != Z597LinEnt ) )
            {
               /* Insert record */
               GX_FocusControl = edtPrdNum_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1SK42( ) ;
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
                  insert1SK42( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A719PrdNum, Z719PrdNum) != 0 ) || ( A597LinEnt != Z597LinEnt ) )
      {
         A719PrdNum = Z719PrdNum ;
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         A597LinEnt = Z597LinEnt ;
         httpContext.ajax_rsp_assign_attri("", false, "A597LinEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A597LinEnt), 4, 0));
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

   public void checkOptimisticConcurrency1SK42( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01SK2 */
         pr_default.execute(0, new Object[] {A396EmprCod, A719PrdNum, Short.valueOf(A597LinEnt)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPENTALM"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( Z411EntCon != T01SK2_A411EntCon[0] ) || ( GXutil.strcmp(Z3404EntPedCum, T01SK2_A3404EntPedCum[0]) != 0 ) || ( DecimalUtil.compareTo(Z419EntUniRem, T01SK2_A419EntUniRem[0]) != 0 ) || ( DecimalUtil.compareTo(Z417EntPre, T01SK2_A417EntPre[0]) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(Z415EntFecEnt), GXutil.resetTime(T01SK2_A415EntFecEnt[0])) ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z11Albaran, T01SK2_A11Albaran[0]) != 0 ) || ( GXutil.strcmp(Z12857EntNAlbar, T01SK2_A12857EntNAlbar[0]) != 0 ) || ( Z6156EntPrvNum != T01SK2_A6156EntPrvNum[0] ) || ( DecimalUtil.compareTo(Z418EntUniEnt, T01SK2_A418EntUniEnt[0]) != 0 ) || ( Z416EntNumCon != T01SK2_A416EntNumCon[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z5686EntLotN, T01SK2_A5686EntLotN[0]) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(Z5685EntFVal), GXutil.resetTime(T01SK2_A5685EntFVal[0])) ) || ( Z414EntEti != T01SK2_A414EntEti[0] ) || ( Z413EntConIni != T01SK2_A413EntConIni[0] ) || ( Z412EntConFin != T01SK2_A412EntConFin[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z5691EntBnc, T01SK2_A5691EntBnc[0]) != 0 ) || ( GXutil.strcmp(Z7695EntCC, T01SK2_A7695EntCC[0]) != 0 ) || ( Z7696EntCCoCod != T01SK2_A7696EntCCoCod[0] ) || ( DecimalUtil.compareTo(Z10782EntUniAlb, T01SK2_A10782EntUniAlb[0]) != 0 ) || ( GXutil.strcmp(Z10783EntObs, T01SK2_A10783EntObs[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z10187EntRemNro, T01SK2_A10187EntRemNro[0]) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(Z10186EntRemFch), GXutil.resetTime(T01SK2_A10186EntRemFch[0])) ) || ( GXutil.strcmp(Z10185EntRemSuc, T01SK2_A10185EntRemSuc[0]) != 0 ) || ( GXutil.strcmp(Z10184EntRemTpo, T01SK2_A10184EntRemTpo[0]) != 0 ) || ( Z12716EntFabId != T01SK2_A12716EntFabId[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z13235EntLoteID != T01SK2_A13235EntLoteID[0] ) || ( GXutil.strcmp(Z13456EntUbicaci, T01SK2_A13456EntUbicaci[0]) != 0 ) || !( GXutil.dateCompare(Z5690EntHfCon, T01SK2_A5690EntHfCon[0]) ) || !( GXutil.dateCompare(GXutil.resetTime(Z5689EntFfCon), GXutil.resetTime(T01SK2_A5689EntFfCon[0])) ) || !( GXutil.dateCompare(Z5688EntHiCon, T01SK2_A5688EntHiCon[0]) ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || !( GXutil.dateCompare(GXutil.resetTime(Z5687EntFiCon), GXutil.resetTime(T01SK2_A5687EntFiCon[0])) ) || ( Z658PedCod != T01SK2_A658PedCod[0] ) )
         {
            if ( Z411EntCon != T01SK2_A411EntCon[0] )
            {
               GXutil.writeLogln("stocksquimicos.entradaproducto_trn:[seudo value changed for attri]"+"EntCon");
               GXutil.writeLogRaw("Old: ",Z411EntCon);
               GXutil.writeLogRaw("Current: ",T01SK2_A411EntCon[0]);
            }
            if ( GXutil.strcmp(Z3404EntPedCum, T01SK2_A3404EntPedCum[0]) != 0 )
            {
               GXutil.writeLogln("stocksquimicos.entradaproducto_trn:[seudo value changed for attri]"+"EntPedCum");
               GXutil.writeLogRaw("Old: ",Z3404EntPedCum);
               GXutil.writeLogRaw("Current: ",T01SK2_A3404EntPedCum[0]);
            }
            if ( DecimalUtil.compareTo(Z419EntUniRem, T01SK2_A419EntUniRem[0]) != 0 )
            {
               GXutil.writeLogln("stocksquimicos.entradaproducto_trn:[seudo value changed for attri]"+"EntUniRem");
               GXutil.writeLogRaw("Old: ",Z419EntUniRem);
               GXutil.writeLogRaw("Current: ",T01SK2_A419EntUniRem[0]);
            }
            if ( DecimalUtil.compareTo(Z417EntPre, T01SK2_A417EntPre[0]) != 0 )
            {
               GXutil.writeLogln("stocksquimicos.entradaproducto_trn:[seudo value changed for attri]"+"EntPre");
               GXutil.writeLogRaw("Old: ",Z417EntPre);
               GXutil.writeLogRaw("Current: ",T01SK2_A417EntPre[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z415EntFecEnt), GXutil.resetTime(T01SK2_A415EntFecEnt[0])) ) )
            {
               GXutil.writeLogln("stocksquimicos.entradaproducto_trn:[seudo value changed for attri]"+"EntFecEnt");
               GXutil.writeLogRaw("Old: ",Z415EntFecEnt);
               GXutil.writeLogRaw("Current: ",T01SK2_A415EntFecEnt[0]);
            }
            if ( GXutil.strcmp(Z11Albaran, T01SK2_A11Albaran[0]) != 0 )
            {
               GXutil.writeLogln("stocksquimicos.entradaproducto_trn:[seudo value changed for attri]"+"Albaran");
               GXutil.writeLogRaw("Old: ",Z11Albaran);
               GXutil.writeLogRaw("Current: ",T01SK2_A11Albaran[0]);
            }
            if ( GXutil.strcmp(Z12857EntNAlbar, T01SK2_A12857EntNAlbar[0]) != 0 )
            {
               GXutil.writeLogln("stocksquimicos.entradaproducto_trn:[seudo value changed for attri]"+"EntNAlbar");
               GXutil.writeLogRaw("Old: ",Z12857EntNAlbar);
               GXutil.writeLogRaw("Current: ",T01SK2_A12857EntNAlbar[0]);
            }
            if ( Z6156EntPrvNum != T01SK2_A6156EntPrvNum[0] )
            {
               GXutil.writeLogln("stocksquimicos.entradaproducto_trn:[seudo value changed for attri]"+"EntPrvNum");
               GXutil.writeLogRaw("Old: ",Z6156EntPrvNum);
               GXutil.writeLogRaw("Current: ",T01SK2_A6156EntPrvNum[0]);
            }
            if ( DecimalUtil.compareTo(Z418EntUniEnt, T01SK2_A418EntUniEnt[0]) != 0 )
            {
               GXutil.writeLogln("stocksquimicos.entradaproducto_trn:[seudo value changed for attri]"+"EntUniEnt");
               GXutil.writeLogRaw("Old: ",Z418EntUniEnt);
               GXutil.writeLogRaw("Current: ",T01SK2_A418EntUniEnt[0]);
            }
            if ( Z416EntNumCon != T01SK2_A416EntNumCon[0] )
            {
               GXutil.writeLogln("stocksquimicos.entradaproducto_trn:[seudo value changed for attri]"+"EntNumCon");
               GXutil.writeLogRaw("Old: ",Z416EntNumCon);
               GXutil.writeLogRaw("Current: ",T01SK2_A416EntNumCon[0]);
            }
            if ( GXutil.strcmp(Z5686EntLotN, T01SK2_A5686EntLotN[0]) != 0 )
            {
               GXutil.writeLogln("stocksquimicos.entradaproducto_trn:[seudo value changed for attri]"+"EntLotN");
               GXutil.writeLogRaw("Old: ",Z5686EntLotN);
               GXutil.writeLogRaw("Current: ",T01SK2_A5686EntLotN[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z5685EntFVal), GXutil.resetTime(T01SK2_A5685EntFVal[0])) ) )
            {
               GXutil.writeLogln("stocksquimicos.entradaproducto_trn:[seudo value changed for attri]"+"EntFVal");
               GXutil.writeLogRaw("Old: ",Z5685EntFVal);
               GXutil.writeLogRaw("Current: ",T01SK2_A5685EntFVal[0]);
            }
            if ( Z414EntEti != T01SK2_A414EntEti[0] )
            {
               GXutil.writeLogln("stocksquimicos.entradaproducto_trn:[seudo value changed for attri]"+"EntEti");
               GXutil.writeLogRaw("Old: ",Z414EntEti);
               GXutil.writeLogRaw("Current: ",T01SK2_A414EntEti[0]);
            }
            if ( Z413EntConIni != T01SK2_A413EntConIni[0] )
            {
               GXutil.writeLogln("stocksquimicos.entradaproducto_trn:[seudo value changed for attri]"+"EntConIni");
               GXutil.writeLogRaw("Old: ",Z413EntConIni);
               GXutil.writeLogRaw("Current: ",T01SK2_A413EntConIni[0]);
            }
            if ( Z412EntConFin != T01SK2_A412EntConFin[0] )
            {
               GXutil.writeLogln("stocksquimicos.entradaproducto_trn:[seudo value changed for attri]"+"EntConFin");
               GXutil.writeLogRaw("Old: ",Z412EntConFin);
               GXutil.writeLogRaw("Current: ",T01SK2_A412EntConFin[0]);
            }
            if ( GXutil.strcmp(Z5691EntBnc, T01SK2_A5691EntBnc[0]) != 0 )
            {
               GXutil.writeLogln("stocksquimicos.entradaproducto_trn:[seudo value changed for attri]"+"EntBnc");
               GXutil.writeLogRaw("Old: ",Z5691EntBnc);
               GXutil.writeLogRaw("Current: ",T01SK2_A5691EntBnc[0]);
            }
            if ( GXutil.strcmp(Z7695EntCC, T01SK2_A7695EntCC[0]) != 0 )
            {
               GXutil.writeLogln("stocksquimicos.entradaproducto_trn:[seudo value changed for attri]"+"EntCC");
               GXutil.writeLogRaw("Old: ",Z7695EntCC);
               GXutil.writeLogRaw("Current: ",T01SK2_A7695EntCC[0]);
            }
            if ( Z7696EntCCoCod != T01SK2_A7696EntCCoCod[0] )
            {
               GXutil.writeLogln("stocksquimicos.entradaproducto_trn:[seudo value changed for attri]"+"EntCCoCod");
               GXutil.writeLogRaw("Old: ",Z7696EntCCoCod);
               GXutil.writeLogRaw("Current: ",T01SK2_A7696EntCCoCod[0]);
            }
            if ( DecimalUtil.compareTo(Z10782EntUniAlb, T01SK2_A10782EntUniAlb[0]) != 0 )
            {
               GXutil.writeLogln("stocksquimicos.entradaproducto_trn:[seudo value changed for attri]"+"EntUniAlb");
               GXutil.writeLogRaw("Old: ",Z10782EntUniAlb);
               GXutil.writeLogRaw("Current: ",T01SK2_A10782EntUniAlb[0]);
            }
            if ( GXutil.strcmp(Z10783EntObs, T01SK2_A10783EntObs[0]) != 0 )
            {
               GXutil.writeLogln("stocksquimicos.entradaproducto_trn:[seudo value changed for attri]"+"EntObs");
               GXutil.writeLogRaw("Old: ",Z10783EntObs);
               GXutil.writeLogRaw("Current: ",T01SK2_A10783EntObs[0]);
            }
            if ( GXutil.strcmp(Z10187EntRemNro, T01SK2_A10187EntRemNro[0]) != 0 )
            {
               GXutil.writeLogln("stocksquimicos.entradaproducto_trn:[seudo value changed for attri]"+"EntRemNro");
               GXutil.writeLogRaw("Old: ",Z10187EntRemNro);
               GXutil.writeLogRaw("Current: ",T01SK2_A10187EntRemNro[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z10186EntRemFch), GXutil.resetTime(T01SK2_A10186EntRemFch[0])) ) )
            {
               GXutil.writeLogln("stocksquimicos.entradaproducto_trn:[seudo value changed for attri]"+"EntRemFch");
               GXutil.writeLogRaw("Old: ",Z10186EntRemFch);
               GXutil.writeLogRaw("Current: ",T01SK2_A10186EntRemFch[0]);
            }
            if ( GXutil.strcmp(Z10185EntRemSuc, T01SK2_A10185EntRemSuc[0]) != 0 )
            {
               GXutil.writeLogln("stocksquimicos.entradaproducto_trn:[seudo value changed for attri]"+"EntRemSuc");
               GXutil.writeLogRaw("Old: ",Z10185EntRemSuc);
               GXutil.writeLogRaw("Current: ",T01SK2_A10185EntRemSuc[0]);
            }
            if ( GXutil.strcmp(Z10184EntRemTpo, T01SK2_A10184EntRemTpo[0]) != 0 )
            {
               GXutil.writeLogln("stocksquimicos.entradaproducto_trn:[seudo value changed for attri]"+"EntRemTpo");
               GXutil.writeLogRaw("Old: ",Z10184EntRemTpo);
               GXutil.writeLogRaw("Current: ",T01SK2_A10184EntRemTpo[0]);
            }
            if ( Z12716EntFabId != T01SK2_A12716EntFabId[0] )
            {
               GXutil.writeLogln("stocksquimicos.entradaproducto_trn:[seudo value changed for attri]"+"EntFabId");
               GXutil.writeLogRaw("Old: ",Z12716EntFabId);
               GXutil.writeLogRaw("Current: ",T01SK2_A12716EntFabId[0]);
            }
            if ( Z13235EntLoteID != T01SK2_A13235EntLoteID[0] )
            {
               GXutil.writeLogln("stocksquimicos.entradaproducto_trn:[seudo value changed for attri]"+"EntLoteID");
               GXutil.writeLogRaw("Old: ",Z13235EntLoteID);
               GXutil.writeLogRaw("Current: ",T01SK2_A13235EntLoteID[0]);
            }
            if ( GXutil.strcmp(Z13456EntUbicaci, T01SK2_A13456EntUbicaci[0]) != 0 )
            {
               GXutil.writeLogln("stocksquimicos.entradaproducto_trn:[seudo value changed for attri]"+"EntUbicaci");
               GXutil.writeLogRaw("Old: ",Z13456EntUbicaci);
               GXutil.writeLogRaw("Current: ",T01SK2_A13456EntUbicaci[0]);
            }
            if ( !( GXutil.dateCompare(Z5690EntHfCon, T01SK2_A5690EntHfCon[0]) ) )
            {
               GXutil.writeLogln("stocksquimicos.entradaproducto_trn:[seudo value changed for attri]"+"EntHfCon");
               GXutil.writeLogRaw("Old: ",Z5690EntHfCon);
               GXutil.writeLogRaw("Current: ",T01SK2_A5690EntHfCon[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z5689EntFfCon), GXutil.resetTime(T01SK2_A5689EntFfCon[0])) ) )
            {
               GXutil.writeLogln("stocksquimicos.entradaproducto_trn:[seudo value changed for attri]"+"EntFfCon");
               GXutil.writeLogRaw("Old: ",Z5689EntFfCon);
               GXutil.writeLogRaw("Current: ",T01SK2_A5689EntFfCon[0]);
            }
            if ( !( GXutil.dateCompare(Z5688EntHiCon, T01SK2_A5688EntHiCon[0]) ) )
            {
               GXutil.writeLogln("stocksquimicos.entradaproducto_trn:[seudo value changed for attri]"+"EntHiCon");
               GXutil.writeLogRaw("Old: ",Z5688EntHiCon);
               GXutil.writeLogRaw("Current: ",T01SK2_A5688EntHiCon[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z5687EntFiCon), GXutil.resetTime(T01SK2_A5687EntFiCon[0])) ) )
            {
               GXutil.writeLogln("stocksquimicos.entradaproducto_trn:[seudo value changed for attri]"+"EntFiCon");
               GXutil.writeLogRaw("Old: ",Z5687EntFiCon);
               GXutil.writeLogRaw("Current: ",T01SK2_A5687EntFiCon[0]);
            }
            if ( Z658PedCod != T01SK2_A658PedCod[0] )
            {
               GXutil.writeLogln("stocksquimicos.entradaproducto_trn:[seudo value changed for attri]"+"PedCod");
               GXutil.writeLogRaw("Old: ",Z658PedCod);
               GXutil.writeLogRaw("Current: ",T01SK2_A658PedCod[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPENTALM"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
      /* Using cursor T01SK22 */
      pr_default.execute(17, new Object[] {A396EmprCod, A719PrdNum});
      if ( (pr_default.getStatus(17) == 103) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPPRODUC"}), "RecordIsLocked", 1, "");
         AnyError = (short)(1) ;
         return  ;
      }
      if ( ! isIns( ) )
      {
         Gx_longc = false ;
         if ( false || ( DecimalUtil.compareTo(Z726PrdPreMed, T01SK22_A726PrdPreMed[0]) != 0 ) || ( GXutil.strcmp(Z718PrdNom, T01SK22_A718PrdNom[0]) != 0 ) || ( DecimalUtil.compareTo(Z724PrdPreAct, T01SK22_A724PrdPreAct[0]) != 0 ) || ( GXutil.strcmp(Z698PrdDetPar, T01SK22_A698PrdDetPar[0]) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(Z713PrdFulEnt), GXutil.resetTime(T01SK22_A713PrdFulEnt[0])) ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( DecimalUtil.compareTo(Z684PrdCanPen, T01SK22_A684PrdCanPen[0]) != 0 ) || ( DecimalUtil.compareTo(Z729PrdRotRea, T01SK22_A729PrdRotRea[0]) != 0 ) || ( GXutil.strcmp(Z727PrdRec, T01SK22_A727PrdRec[0]) != 0 ) || ( DecimalUtil.compareTo(Z725PrdPreAnt, T01SK22_A725PrdPreAnt[0]) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(Z709PrdFecPre), GXutil.resetTime(T01SK22_A709PrdFecPre[0])) ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( DecimalUtil.compareTo(Z5255PrdPreAc2, T01SK22_A5255PrdPreAc2[0]) != 0 ) || ( DecimalUtil.compareTo(Z705PrdExiCC, T01SK22_A705PrdExiCC[0]) != 0 ) || ( Z795PrvNum != T01SK22_A795PrvNum[0] ) || ( Z856ValCod != T01SK22_A856ValCod[0] ) )
         {
            if ( DecimalUtil.compareTo(Z726PrdPreMed, T01SK22_A726PrdPreMed[0]) != 0 )
            {
               GXutil.writeLogln("stocksquimicos.entradaproducto_trn:[seudo value changed for attri]"+"PrdPreMed");
               GXutil.writeLogRaw("Old: ",Z726PrdPreMed);
               GXutil.writeLogRaw("Current: ",T01SK22_A726PrdPreMed[0]);
            }
            if ( GXutil.strcmp(Z718PrdNom, T01SK22_A718PrdNom[0]) != 0 )
            {
               GXutil.writeLogln("stocksquimicos.entradaproducto_trn:[seudo value changed for attri]"+"PrdNom");
               GXutil.writeLogRaw("Old: ",Z718PrdNom);
               GXutil.writeLogRaw("Current: ",T01SK22_A718PrdNom[0]);
            }
            if ( DecimalUtil.compareTo(Z724PrdPreAct, T01SK22_A724PrdPreAct[0]) != 0 )
            {
               GXutil.writeLogln("stocksquimicos.entradaproducto_trn:[seudo value changed for attri]"+"PrdPreAct");
               GXutil.writeLogRaw("Old: ",Z724PrdPreAct);
               GXutil.writeLogRaw("Current: ",T01SK22_A724PrdPreAct[0]);
            }
            if ( GXutil.strcmp(Z698PrdDetPar, T01SK22_A698PrdDetPar[0]) != 0 )
            {
               GXutil.writeLogln("stocksquimicos.entradaproducto_trn:[seudo value changed for attri]"+"PrdDetPar");
               GXutil.writeLogRaw("Old: ",Z698PrdDetPar);
               GXutil.writeLogRaw("Current: ",T01SK22_A698PrdDetPar[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z713PrdFulEnt), GXutil.resetTime(T01SK22_A713PrdFulEnt[0])) ) )
            {
               GXutil.writeLogln("stocksquimicos.entradaproducto_trn:[seudo value changed for attri]"+"PrdFulEnt");
               GXutil.writeLogRaw("Old: ",Z713PrdFulEnt);
               GXutil.writeLogRaw("Current: ",T01SK22_A713PrdFulEnt[0]);
            }
            if ( DecimalUtil.compareTo(Z684PrdCanPen, T01SK22_A684PrdCanPen[0]) != 0 )
            {
               GXutil.writeLogln("stocksquimicos.entradaproducto_trn:[seudo value changed for attri]"+"PrdCanPen");
               GXutil.writeLogRaw("Old: ",Z684PrdCanPen);
               GXutil.writeLogRaw("Current: ",T01SK22_A684PrdCanPen[0]);
            }
            if ( DecimalUtil.compareTo(Z729PrdRotRea, T01SK22_A729PrdRotRea[0]) != 0 )
            {
               GXutil.writeLogln("stocksquimicos.entradaproducto_trn:[seudo value changed for attri]"+"PrdRotRea");
               GXutil.writeLogRaw("Old: ",Z729PrdRotRea);
               GXutil.writeLogRaw("Current: ",T01SK22_A729PrdRotRea[0]);
            }
            if ( GXutil.strcmp(Z727PrdRec, T01SK22_A727PrdRec[0]) != 0 )
            {
               GXutil.writeLogln("stocksquimicos.entradaproducto_trn:[seudo value changed for attri]"+"PrdRec");
               GXutil.writeLogRaw("Old: ",Z727PrdRec);
               GXutil.writeLogRaw("Current: ",T01SK22_A727PrdRec[0]);
            }
            if ( DecimalUtil.compareTo(Z725PrdPreAnt, T01SK22_A725PrdPreAnt[0]) != 0 )
            {
               GXutil.writeLogln("stocksquimicos.entradaproducto_trn:[seudo value changed for attri]"+"PrdPreAnt");
               GXutil.writeLogRaw("Old: ",Z725PrdPreAnt);
               GXutil.writeLogRaw("Current: ",T01SK22_A725PrdPreAnt[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z709PrdFecPre), GXutil.resetTime(T01SK22_A709PrdFecPre[0])) ) )
            {
               GXutil.writeLogln("stocksquimicos.entradaproducto_trn:[seudo value changed for attri]"+"PrdFecPre");
               GXutil.writeLogRaw("Old: ",Z709PrdFecPre);
               GXutil.writeLogRaw("Current: ",T01SK22_A709PrdFecPre[0]);
            }
            if ( DecimalUtil.compareTo(Z5255PrdPreAc2, T01SK22_A5255PrdPreAc2[0]) != 0 )
            {
               GXutil.writeLogln("stocksquimicos.entradaproducto_trn:[seudo value changed for attri]"+"PrdPreAc2");
               GXutil.writeLogRaw("Old: ",Z5255PrdPreAc2);
               GXutil.writeLogRaw("Current: ",T01SK22_A5255PrdPreAc2[0]);
            }
            if ( DecimalUtil.compareTo(Z705PrdExiCC, T01SK22_A705PrdExiCC[0]) != 0 )
            {
               GXutil.writeLogln("stocksquimicos.entradaproducto_trn:[seudo value changed for attri]"+"PrdExiCC");
               GXutil.writeLogRaw("Old: ",Z705PrdExiCC);
               GXutil.writeLogRaw("Current: ",T01SK22_A705PrdExiCC[0]);
            }
            if ( Z795PrvNum != T01SK22_A795PrvNum[0] )
            {
               GXutil.writeLogln("stocksquimicos.entradaproducto_trn:[seudo value changed for attri]"+"PrvNum");
               GXutil.writeLogRaw("Old: ",Z795PrvNum);
               GXutil.writeLogRaw("Current: ",T01SK22_A795PrvNum[0]);
            }
            if ( Z856ValCod != T01SK22_A856ValCod[0] )
            {
               GXutil.writeLogln("stocksquimicos.entradaproducto_trn:[seudo value changed for attri]"+"ValCod");
               GXutil.writeLogRaw("Old: ",Z856ValCod);
               GXutil.writeLogRaw("Current: ",T01SK22_A856ValCod[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPPRODUC"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
      /* Using cursor T01SK23 */
      pr_default.execute(18, new Object[] {A396EmprCod, Boolean.valueOf(n658PedCod), Integer.valueOf(A658PedCod), A719PrdNum});
      if ( (pr_default.getStatus(18) == 103) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPLPEDID"}), "RecordIsLocked", 1, "");
         AnyError = (short)(1) ;
         return  ;
      }
      if ( ! isIns( ) )
      {
         if ( false || ( DecimalUtil.compareTo(Z665PedPre, T01SK23_A665PedPre[0]) != 0 ) || ( DecimalUtil.compareTo(Z669PedUni, T01SK23_A669PedUni[0]) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(Z663PedFulEnt), GXutil.resetTime(T01SK23_A663PedFulEnt[0])) ) || ( GXutil.strcmp(Z659PedCum, T01SK23_A659PedCum[0]) != 0 ) || ( DecimalUtil.compareTo(Z660PedDto, T01SK23_A660PedDto[0]) != 0 ) )
         {
            if ( DecimalUtil.compareTo(Z665PedPre, T01SK23_A665PedPre[0]) != 0 )
            {
               GXutil.writeLogln("stocksquimicos.entradaproducto_trn:[seudo value changed for attri]"+"PedPre");
               GXutil.writeLogRaw("Old: ",Z665PedPre);
               GXutil.writeLogRaw("Current: ",T01SK23_A665PedPre[0]);
            }
            if ( DecimalUtil.compareTo(Z669PedUni, T01SK23_A669PedUni[0]) != 0 )
            {
               GXutil.writeLogln("stocksquimicos.entradaproducto_trn:[seudo value changed for attri]"+"PedUni");
               GXutil.writeLogRaw("Old: ",Z669PedUni);
               GXutil.writeLogRaw("Current: ",T01SK23_A669PedUni[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z663PedFulEnt), GXutil.resetTime(T01SK23_A663PedFulEnt[0])) ) )
            {
               GXutil.writeLogln("stocksquimicos.entradaproducto_trn:[seudo value changed for attri]"+"PedFulEnt");
               GXutil.writeLogRaw("Old: ",Z663PedFulEnt);
               GXutil.writeLogRaw("Current: ",T01SK23_A663PedFulEnt[0]);
            }
            if ( GXutil.strcmp(Z659PedCum, T01SK23_A659PedCum[0]) != 0 )
            {
               GXutil.writeLogln("stocksquimicos.entradaproducto_trn:[seudo value changed for attri]"+"PedCum");
               GXutil.writeLogRaw("Old: ",Z659PedCum);
               GXutil.writeLogRaw("Current: ",T01SK23_A659PedCum[0]);
            }
            if ( DecimalUtil.compareTo(Z660PedDto, T01SK23_A660PedDto[0]) != 0 )
            {
               GXutil.writeLogln("stocksquimicos.entradaproducto_trn:[seudo value changed for attri]"+"PedDto");
               GXutil.writeLogRaw("Old: ",Z660PedDto);
               GXutil.writeLogRaw("Current: ",T01SK23_A660PedDto[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPLPEDID"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1SK42( )
   {
      beforeValidate1SK42( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1SK42( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1SK42( 0) ;
         checkOptimisticConcurrency1SK42( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1SK42( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1SK42( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01SK24 */
                  pr_default.execute(19, new Object[] {Short.valueOf(A597LinEnt), Byte.valueOf(A411EntCon), A3404EntPedCum, A419EntUniRem, A417EntPre, A415EntFecEnt, A11Albaran, A12857EntNAlbar, Boolean.valueOf(n6156EntPrvNum), Integer.valueOf(A6156EntPrvNum), A418EntUniEnt, Short.valueOf(A416EntNumCon), A5686EntLotN, A5685EntFVal, Byte.valueOf(A414EntEti), Integer.valueOf(A413EntConIni), Integer.valueOf(A412EntConFin), A5691EntBnc, A7695EntCC, Short.valueOf(A7696EntCCoCod), A10782EntUniAlb, A10783EntObs, A10187EntRemNro, A10186EntRemFch, A10185EntRemSuc, A10184EntRemTpo, Integer.valueOf(A12716EntFabId), Long.valueOf(A13235EntLoteID), A13456EntUbicaci, A5690EntHfCon, A5689EntFfCon, A5688EntHiCon, A5687EntFiCon, A396EmprCod, A719PrdNum, Boolean.valueOf(n658PedCod), Integer.valueOf(A658PedCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPENTALM");
                  if ( (pr_default.getStatus(19) == 1) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
                     AnyError = (short)(1) ;
                  }
                  if ( AnyError == 0 )
                  {
                     updateTablesN11SK42( ) ;
                     /* Start of After( Insert) rules */
                     if ( ! (0==A658PedCod) && ( true /* After */ || true /* After */ ) )
                     {
                        GXv_char4[0] = A396EmprCod ;
                        GXv_int8[0] = A658PedCod ;
                        GXv_char3[0] = A719PrdNum ;
                        GXv_char2[0] = httpContext.getMessage( "INS", "") ;
                        GXv_char12[0] = A3404EntPedCum ;
                        new app.ppedcum2(remoteHandle, context).execute( GXv_char4, GXv_int8, GXv_char3, GXv_char2, GXv_char12) ;
                        entradaproducto_trn_impl.this.A396EmprCod = GXv_char4[0] ;
                        entradaproducto_trn_impl.this.A658PedCod = GXv_int8[0] ;
                        entradaproducto_trn_impl.this.A719PrdNum = GXv_char3[0] ;
                        entradaproducto_trn_impl.this.A3404EntPedCum = GXv_char12[0] ;
                        httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
                        httpContext.ajax_rsp_assign_attri("", false, "A658PedCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A658PedCod), 8, 0));
                        httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
                        httpContext.ajax_rsp_assign_attri("", false, "A3404EntPedCum", A3404EntPedCum);
                     }
                     if ( true /* After */ || true /* After */ )
                     {
                        GXv_char12[0] = A396EmprCod ;
                        GXv_char4[0] = A719PrdNum ;
                        GXv_int8[0] = A6156EntPrvNum ;
                        GXv_decimal13[0] = A417EntPre ;
                        new app.pprenp(remoteHandle, context).execute( GXv_char12, GXv_char4, GXv_int8, GXv_decimal13) ;
                        entradaproducto_trn_impl.this.A396EmprCod = GXv_char12[0] ;
                        entradaproducto_trn_impl.this.A719PrdNum = GXv_char4[0] ;
                        entradaproducto_trn_impl.this.A6156EntPrvNum = GXv_int8[0] ;
                        entradaproducto_trn_impl.this.A417EntPre = GXv_decimal13[0] ;
                        httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
                        httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
                        httpContext.ajax_rsp_assign_attri("", false, "A6156EntPrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6156EntPrvNum), 6, 0));
                        httpContext.ajax_rsp_assign_attri("", false, "A417EntPre", GXutil.ltrimstr( A417EntPre, 14, 5));
                     }
                     if ( true /* After */ || true /* After */ )
                     {
                        AV25Inc_obs = GXutil.trim( A719PrdNum) + ",# " + GXutil.trim( GXutil.str( A597LinEnt, 4, 0)) + httpContext.getMessage( httpContext.getMessage( ",Fecha ", ""), "") + GXutil.trim( localUtil.dtoc( AV24oldEntFecent, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")) + "/" + GXutil.trim( localUtil.dtoc( A415EntFecEnt, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")) + httpContext.getMessage( httpContext.getMessage( ",Ped ", ""), "") + GXutil.trim( GXutil.str( A658PedCod, 8, 0)) + httpContext.getMessage( httpContext.getMessage( ",Cant ", ""), "") + GXutil.str( AV36OldEntUni, 9, 2) + "/" + GXutil.trim( GXutil.str( A418EntUniEnt, 9, 2)) + httpContext.getMessage( httpContext.getMessage( ",Prec ", ""), "") + GXutil.str( AV23OldEntPre, 14, 5) + "/" + GXutil.trim( GXutil.str( A417EntPre, 14, 5)) + httpContext.getMessage( httpContext.getMessage( ",Rema ", ""), "") + GXutil.trim( GXutil.str( AV37OldRemanente, 11, 4)) + "/" + GXutil.trim( GXutil.str( A419EntUniRem, 11, 4)) + httpContext.getMessage( httpContext.getMessage( ",Lote ", ""), "") + GXutil.trim( AV38oldlote) + "/" + GXutil.trim( A5686EntLotN) ;
                        httpContext.ajax_rsp_assign_attri("", false, "AV25Inc_obs", AV25Inc_obs);
                     }
                     if ( true /* After */ || true /* After */ )
                     {
                        new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV45Pgmname, AV26UsurCod, AV27Station, AV25Inc_obs, 99999999, (byte)(0), " ") ;
                     }
                     /* End of After( Insert) rules */
                     if ( AnyError == 0 )
                     {
                        /* Save values for previous() function. */
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                        endTrnMsgCod = "SuccessfullyAdded" ;
                        resetCaption1SK0( ) ;
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
            load1SK42( ) ;
         }
         endLevel1SK42( ) ;
      }
      closeExtendedTableCursors1SK42( ) ;
   }

   public void update1SK42( )
   {
      beforeValidate1SK42( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1SK42( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1SK42( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1SK42( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1SK42( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01SK25 */
                  pr_default.execute(20, new Object[] {Byte.valueOf(A411EntCon), A3404EntPedCum, A419EntUniRem, A417EntPre, A415EntFecEnt, A11Albaran, A12857EntNAlbar, Boolean.valueOf(n6156EntPrvNum), Integer.valueOf(A6156EntPrvNum), A418EntUniEnt, Short.valueOf(A416EntNumCon), A5686EntLotN, A5685EntFVal, Byte.valueOf(A414EntEti), Integer.valueOf(A413EntConIni), Integer.valueOf(A412EntConFin), A5691EntBnc, A7695EntCC, Short.valueOf(A7696EntCCoCod), A10782EntUniAlb, A10783EntObs, A10187EntRemNro, A10186EntRemFch, A10185EntRemSuc, A10184EntRemTpo, Integer.valueOf(A12716EntFabId), Long.valueOf(A13235EntLoteID), A13456EntUbicaci, A5690EntHfCon, A5689EntFfCon, A5688EntHiCon, A5687EntFiCon, Boolean.valueOf(n658PedCod), Integer.valueOf(A658PedCod), A396EmprCod, A719PrdNum, Short.valueOf(A597LinEnt)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPENTALM");
                  if ( (pr_default.getStatus(20) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPENTALM"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1SK42( ) ;
                  if ( AnyError == 0 )
                  {
                     updateTablesN11SK42( ) ;
                     /* Start of After( update) rules */
                     if ( ! (0==A658PedCod) && ( true /* After */ || true /* After */ ) )
                     {
                        GXv_char12[0] = A396EmprCod ;
                        GXv_int8[0] = A658PedCod ;
                        GXv_char4[0] = A719PrdNum ;
                        GXv_char3[0] = httpContext.getMessage( "INS", "") ;
                        GXv_char2[0] = A3404EntPedCum ;
                        new app.ppedcum2(remoteHandle, context).execute( GXv_char12, GXv_int8, GXv_char4, GXv_char3, GXv_char2) ;
                        entradaproducto_trn_impl.this.A396EmprCod = GXv_char12[0] ;
                        entradaproducto_trn_impl.this.A658PedCod = GXv_int8[0] ;
                        entradaproducto_trn_impl.this.A719PrdNum = GXv_char4[0] ;
                        entradaproducto_trn_impl.this.A3404EntPedCum = GXv_char2[0] ;
                        httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
                        httpContext.ajax_rsp_assign_attri("", false, "A658PedCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A658PedCod), 8, 0));
                        httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
                        httpContext.ajax_rsp_assign_attri("", false, "A3404EntPedCum", A3404EntPedCum);
                     }
                     if ( true /* After */ || true /* After */ )
                     {
                        GXv_char12[0] = A396EmprCod ;
                        GXv_char4[0] = A719PrdNum ;
                        GXv_int8[0] = A6156EntPrvNum ;
                        GXv_decimal13[0] = A417EntPre ;
                        new app.pprenp(remoteHandle, context).execute( GXv_char12, GXv_char4, GXv_int8, GXv_decimal13) ;
                        entradaproducto_trn_impl.this.A396EmprCod = GXv_char12[0] ;
                        entradaproducto_trn_impl.this.A719PrdNum = GXv_char4[0] ;
                        entradaproducto_trn_impl.this.A6156EntPrvNum = GXv_int8[0] ;
                        entradaproducto_trn_impl.this.A417EntPre = GXv_decimal13[0] ;
                        httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
                        httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
                        httpContext.ajax_rsp_assign_attri("", false, "A6156EntPrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6156EntPrvNum), 6, 0));
                        httpContext.ajax_rsp_assign_attri("", false, "A417EntPre", GXutil.ltrimstr( A417EntPre, 14, 5));
                     }
                     if ( true /* After */ || true /* After */ )
                     {
                        AV25Inc_obs = GXutil.trim( A719PrdNum) + ",# " + GXutil.trim( GXutil.str( A597LinEnt, 4, 0)) + httpContext.getMessage( httpContext.getMessage( ",Fecha ", ""), "") + GXutil.trim( localUtil.dtoc( AV24oldEntFecent, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")) + "/" + GXutil.trim( localUtil.dtoc( A415EntFecEnt, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")) + httpContext.getMessage( httpContext.getMessage( ",Ped ", ""), "") + GXutil.trim( GXutil.str( A658PedCod, 8, 0)) + httpContext.getMessage( httpContext.getMessage( ",Cant ", ""), "") + GXutil.str( AV36OldEntUni, 9, 2) + "/" + GXutil.trim( GXutil.str( A418EntUniEnt, 9, 2)) + httpContext.getMessage( httpContext.getMessage( ",Prec ", ""), "") + GXutil.str( AV23OldEntPre, 14, 5) + "/" + GXutil.trim( GXutil.str( A417EntPre, 14, 5)) + httpContext.getMessage( httpContext.getMessage( ",Rema ", ""), "") + GXutil.trim( GXutil.str( AV37OldRemanente, 11, 4)) + "/" + GXutil.trim( GXutil.str( A419EntUniRem, 11, 4)) + httpContext.getMessage( httpContext.getMessage( ",Lote ", ""), "") + GXutil.trim( AV38oldlote) + "/" + GXutil.trim( A5686EntLotN) ;
                        httpContext.ajax_rsp_assign_attri("", false, "AV25Inc_obs", AV25Inc_obs);
                     }
                     if ( true /* After */ || true /* After */ )
                     {
                        new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV45Pgmname, AV26UsurCod, AV27Station, AV25Inc_obs, 99999999, (byte)(0), " ") ;
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
         endLevel1SK42( ) ;
      }
      closeExtendedTableCursors1SK42( ) ;
   }

   public void deferredUpdate1SK42( )
   {
   }

   public void delete( )
   {
      beforeValidate1SK42( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1SK42( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1SK42( ) ;
         afterConfirm1SK42( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1SK42( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01SK26 */
               pr_default.execute(21, new Object[] {A396EmprCod, A719PrdNum, Short.valueOf(A597LinEnt)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPENTALM");
               if ( AnyError == 0 )
               {
                  updateTablesN11SK42( ) ;
                  /* Start of After( delete) rules */
                  if ( ! (0==A658PedCod) && true /* After */ )
                  {
                     GXv_char12[0] = A396EmprCod ;
                     GXv_int8[0] = A658PedCod ;
                     GXv_char4[0] = A719PrdNum ;
                     GXv_char3[0] = httpContext.getMessage( "DEL", "") ;
                     GXv_char2[0] = A3404EntPedCum ;
                     new app.ppedcum2(remoteHandle, context).execute( GXv_char12, GXv_int8, GXv_char4, GXv_char3, GXv_char2) ;
                     entradaproducto_trn_impl.this.A396EmprCod = GXv_char12[0] ;
                     entradaproducto_trn_impl.this.A658PedCod = GXv_int8[0] ;
                     entradaproducto_trn_impl.this.A719PrdNum = GXv_char4[0] ;
                     entradaproducto_trn_impl.this.A3404EntPedCum = GXv_char2[0] ;
                     httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
                     httpContext.ajax_rsp_assign_attri("", false, "A658PedCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A658PedCod), 8, 0));
                     httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
                     httpContext.ajax_rsp_assign_attri("", false, "A3404EntPedCum", A3404EntPedCum);
                  }
                  if ( true /* After */ )
                  {
                     AV25Inc_obs = GXutil.trim( A719PrdNum) + ",# " + GXutil.trim( GXutil.str( A597LinEnt, 4, 0)) + httpContext.getMessage( httpContext.getMessage( ",Fecha ", ""), "") + GXutil.trim( localUtil.dtoc( A415EntFecEnt, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")) + httpContext.getMessage( httpContext.getMessage( ",Ped ", ""), "") + GXutil.trim( GXutil.str( A658PedCod, 8, 0)) + httpContext.getMessage( httpContext.getMessage( ",Cant ", ""), "") + GXutil.trim( GXutil.str( A418EntUniEnt, 9, 2)) + httpContext.getMessage( httpContext.getMessage( ",Prec ", ""), "") + GXutil.str( AV23OldEntPre, 14, 5) + "/" + GXutil.trim( GXutil.str( A417EntPre, 14, 5)) + httpContext.getMessage( httpContext.getMessage( ",Rema ", ""), "") + GXutil.trim( GXutil.str( AV37OldRemanente, 11, 4)) + httpContext.getMessage( httpContext.getMessage( ",Lote ", ""), "") + GXutil.trim( A5686EntLotN) ;
                     httpContext.ajax_rsp_assign_attri("", false, "AV25Inc_obs", AV25Inc_obs);
                  }
                  if ( true /* After */ )
                  {
                     new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV45Pgmname, AV26UsurCod, AV27Station, AV25Inc_obs, 99999999, (byte)(0), " ") ;
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
      sMode42 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1SK42( ) ;
      Gx_mode = sMode42 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1SK42( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         AV32Year = (short)(GXutil.year( A415EntFecEnt)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV32Year", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV32Year), 4, 0));
         AV21Fecha = localUtil.ymdtod( AV32Year, 12, 1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV21Fecha", localUtil.format(AV21Fecha, "99/99/99"));
         AV34Mes = (short)(GXutil.month( A415EntFecEnt)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV34Mes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34Mes), 4, 0));
         AV24oldEntFecent = O415EntFecEnt ;
         httpContext.ajax_rsp_assign_attri("", false, "AV24oldEntFecent", localUtil.format(AV24oldEntFecent, "99/99/99"));
         AV39FecAnt = O415EntFecEnt ;
         httpContext.ajax_rsp_assign_attri("", false, "AV39FecAnt", localUtil.format(AV39FecAnt, "99/99/99"));
         AV42AnyAnt = (short)(GXutil.year( O415EntFecEnt)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV42AnyAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV42AnyAnt), 4, 0));
         AV43MesAnt = (byte)(GXutil.month( O415EntFecEnt)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV43MesAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV43MesAnt), 2, 0));
         AV33DiasFin = (short)(GXutil.ddiff(GXutil.eomdate( AV21Fecha),A415EntFecEnt)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV33DiasFin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV33DiasFin), 4, 0));
         AV36OldEntUni = O418EntUniEnt ;
         httpContext.ajax_rsp_assign_attri("", false, "AV36OldEntUni", GXutil.ltrimstr( AV36OldEntUni, 9, 2));
         AV40UniOld = O418EntUniEnt ;
         httpContext.ajax_rsp_assign_attri("", false, "AV40UniOld", GXutil.ltrimstr( AV40UniOld, 9, 2));
         AV23OldEntPre = O417EntPre ;
         httpContext.ajax_rsp_assign_attri("", false, "AV23OldEntPre", GXutil.ltrimstr( AV23OldEntPre, 14, 5));
         AV41PrecAnt = O417EntPre ;
         httpContext.ajax_rsp_assign_attri("", false, "AV41PrecAnt", GXutil.ltrimstr( AV41PrecAnt, 14, 5));
         AV38oldlote = O5686EntLotN ;
         httpContext.ajax_rsp_assign_attri("", false, "AV38oldlote", AV38oldlote);
         AV37OldRemanente = O419EntUniRem ;
         httpContext.ajax_rsp_assign_attri("", false, "AV37OldRemanente", GXutil.ltrimstr( AV37OldRemanente, 11, 4));
         if ( isUpd( )  && ( DecimalUtil.compareTo(A419EntUniRem, A418EntUniEnt) != 0 ) )
         {
            edtEntFecEnt_Enabled = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, edtEntFecEnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEntFecEnt_Enabled), 5, 0), true);
         }
         else
         {
            edtEntFecEnt_Enabled = 1 ;
            httpContext.ajax_rsp_assign_prop("", false, edtEntFecEnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEntFecEnt_Enabled), 5, 0), true);
         }
         if ( isUpd( )  && ( DecimalUtil.compareTo(A419EntUniRem, A418EntUniEnt) != 0 ) )
         {
            edtAlbaran_Enabled = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbaran_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbaran_Enabled), 5, 0), true);
         }
         else
         {
            edtAlbaran_Enabled = 1 ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbaran_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbaran_Enabled), 5, 0), true);
         }
         if ( isUpd( )  && ( DecimalUtil.compareTo(A419EntUniRem, A418EntUniEnt) != 0 ) )
         {
            edtEntNAlbar_Enabled = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, edtEntNAlbar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEntNAlbar_Enabled), 5, 0), true);
         }
         else
         {
            edtEntNAlbar_Enabled = 1 ;
            httpContext.ajax_rsp_assign_prop("", false, edtEntNAlbar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEntNAlbar_Enabled), 5, 0), true);
         }
         if ( isUpd( )  && ( DecimalUtil.compareTo(A419EntUniRem, A418EntUniEnt) != 0 ) )
         {
            edtEntPrvNum_Enabled = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, edtEntPrvNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEntPrvNum_Enabled), 5, 0), true);
         }
         else
         {
            edtEntPrvNum_Enabled = 1 ;
            httpContext.ajax_rsp_assign_prop("", false, edtEntPrvNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEntPrvNum_Enabled), 5, 0), true);
         }
         if ( isUpd( )  && ( DecimalUtil.compareTo(A419EntUniRem, A418EntUniEnt) != 0 ) )
         {
            edtEntUniEnt_Enabled = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, edtEntUniEnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEntUniEnt_Enabled), 5, 0), true);
         }
         else
         {
            edtEntUniEnt_Enabled = 1 ;
            httpContext.ajax_rsp_assign_prop("", false, edtEntUniEnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEntUniEnt_Enabled), 5, 0), true);
         }
         if ( isUpd( )  && ( DecimalUtil.compareTo(A419EntUniRem, A418EntUniEnt) != 0 ) )
         {
            edtEntLotN_Enabled = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, edtEntLotN_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEntLotN_Enabled), 5, 0), true);
         }
         else
         {
            edtEntLotN_Enabled = 1 ;
            httpContext.ajax_rsp_assign_prop("", false, edtEntLotN_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEntLotN_Enabled), 5, 0), true);
         }
         if ( isUpd( )  && ( DecimalUtil.compareTo(A419EntUniRem, A418EntUniEnt) != 0 ) )
         {
            edtEntPre_Enabled = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, edtEntPre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEntPre_Enabled), 5, 0), true);
         }
         else
         {
            edtEntPre_Enabled = 1 ;
            httpContext.ajax_rsp_assign_prop("", false, edtEntPre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEntPre_Enabled), 5, 0), true);
         }
         if ( isUpd( )  && ( DecimalUtil.compareTo(A419EntUniRem, A418EntUniEnt) != 0 ) )
         {
            edtEntFVal_Enabled = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, edtEntFVal_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEntFVal_Enabled), 5, 0), true);
         }
         else
         {
            edtEntFVal_Enabled = 1 ;
            httpContext.ajax_rsp_assign_prop("", false, edtEntFVal_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEntFVal_Enabled), 5, 0), true);
         }
         if ( isUpd( )  && ( DecimalUtil.compareTo(A419EntUniRem, A418EntUniEnt) != 0 ) )
         {
            edtEntPedCum_Enabled = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, edtEntPedCum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEntPedCum_Enabled), 5, 0), true);
         }
         else
         {
            edtEntPedCum_Enabled = 1 ;
            httpContext.ajax_rsp_assign_prop("", false, edtEntPedCum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEntPedCum_Enabled), 5, 0), true);
         }
         /* Using cursor T01SK27 */
         pr_default.execute(22, new Object[] {A396EmprCod, A719PrdNum});
         Z726PrdPreMed = T01SK27_A726PrdPreMed[0] ;
         Z718PrdNom = T01SK27_A718PrdNom[0] ;
         Z724PrdPreAct = T01SK27_A724PrdPreAct[0] ;
         Z698PrdDetPar = T01SK27_A698PrdDetPar[0] ;
         Z713PrdFulEnt = T01SK27_A713PrdFulEnt[0] ;
         Z684PrdCanPen = T01SK27_A684PrdCanPen[0] ;
         Z729PrdRotRea = T01SK27_A729PrdRotRea[0] ;
         Z727PrdRec = T01SK27_A727PrdRec[0] ;
         Z725PrdPreAnt = T01SK27_A725PrdPreAnt[0] ;
         Z709PrdFecPre = T01SK27_A709PrdFecPre[0] ;
         Z5255PrdPreAc2 = T01SK27_A5255PrdPreAc2[0] ;
         Z705PrdExiCC = T01SK27_A705PrdExiCC[0] ;
         Z795PrvNum = T01SK27_A795PrvNum[0] ;
         Z856ValCod = T01SK27_A856ValCod[0] ;
         A847UltLinEnt = T01SK27_A847UltLinEnt[0] ;
         A704PrdExiAlm = T01SK27_A704PrdExiAlm[0] ;
         A726PrdPreMed = T01SK27_A726PrdPreMed[0] ;
         A750PrdValStk = T01SK27_A750PrdValStk[0] ;
         A718PrdNom = T01SK27_A718PrdNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A718PrdNom", A718PrdNom);
         A724PrdPreAct = T01SK27_A724PrdPreAct[0] ;
         A698PrdDetPar = T01SK27_A698PrdDetPar[0] ;
         A713PrdFulEnt = T01SK27_A713PrdFulEnt[0] ;
         A684PrdCanPen = T01SK27_A684PrdCanPen[0] ;
         A729PrdRotRea = T01SK27_A729PrdRotRea[0] ;
         A727PrdRec = T01SK27_A727PrdRec[0] ;
         A725PrdPreAnt = T01SK27_A725PrdPreAnt[0] ;
         A709PrdFecPre = T01SK27_A709PrdFecPre[0] ;
         A5255PrdPreAc2 = T01SK27_A5255PrdPreAc2[0] ;
         A705PrdExiCC = T01SK27_A705PrdExiCC[0] ;
         A795PrvNum = T01SK27_A795PrvNum[0] ;
         A856ValCod = T01SK27_A856ValCod[0] ;
         O750PrdValStk = A750PrdValStk ;
         httpContext.ajax_rsp_assign_attri("", false, "A750PrdValStk", GXutil.ltrimstr( A750PrdValStk, 11, 2));
         O704PrdExiAlm = A704PrdExiAlm ;
         httpContext.ajax_rsp_assign_attri("", false, "A704PrdExiAlm", GXutil.ltrimstr( A704PrdExiAlm, 12, 4));
         O847UltLinEnt = A847UltLinEnt ;
         httpContext.ajax_rsp_assign_attri("", false, "A847UltLinEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A847UltLinEnt), 4, 0));
         pr_default.close(22);
         if ( isIns( )  )
         {
            A847UltLinEnt = (short)(O847UltLinEnt+1) ;
            httpContext.ajax_rsp_assign_attri("", false, "A847UltLinEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A847UltLinEnt), 4, 0));
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
         AV35OldExiAlm = O704PrdExiAlm ;
         httpContext.ajax_rsp_assign_attri("", false, "AV35OldExiAlm", GXutil.ltrimstr( AV35OldExiAlm, 12, 4));
         if ( isIns( )  && true /* Level */ )
         {
            A750PrdValStk = O750PrdValStk.add(GXutil.roundDecimal( A417EntPre.multiply(A418EntUniEnt), 2)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A750PrdValStk", GXutil.ltrimstr( A750PrdValStk, 11, 2));
         }
         else
         {
            if ( isUpd( )  && true /* Level */ )
            {
               A750PrdValStk = O750PrdValStk.add((GXutil.roundDecimal( A417EntPre.multiply(A418EntUniEnt), 2).subtract(GXutil.roundDecimal( AV23OldEntPre.multiply(AV36OldEntUni), 2)))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A750PrdValStk", GXutil.ltrimstr( A750PrdValStk, 11, 2));
            }
            else
            {
               if ( isDlt( )  && true /* Level */ )
               {
                  A750PrdValStk = O750PrdValStk.subtract(GXutil.roundDecimal( A417EntPre.multiply(A418EntUniEnt), 2)) ;
                  httpContext.ajax_rsp_assign_attri("", false, "A750PrdValStk", GXutil.ltrimstr( A750PrdValStk, 11, 2));
               }
            }
         }
         if ( ( A704PrdExiAlm.doubleValue() != 0 ) && ( AV30Consumos == 1 ) && ( A750PrdValStk.doubleValue() > 0 ) )
         {
            A726PrdPreMed = GXutil.roundDecimal( A750PrdValStk.divide(A704PrdExiAlm, 18, java.math.RoundingMode.DOWN), 3) ;
            httpContext.ajax_rsp_assign_attri("", false, "A726PrdPreMed", GXutil.ltrimstr( A726PrdPreMed, 14, 5));
         }
         else
         {
            if ( ( A704PrdExiAlm.doubleValue() == 0 ) && ( AV30Consumos == 1 ) && ( A750PrdValStk.doubleValue() == 0 ) )
            {
               A726PrdPreMed = DecimalUtil.doubleToDec(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A726PrdPreMed", GXutil.ltrimstr( A726PrdPreMed, 14, 5));
            }
            else
            {
               if ( ( ( A704PrdExiAlm.doubleValue() != 0 ) || ( A705PrdExiCC.doubleValue() != 0 ) ) && ( AV30Consumos == 0 ) )
               {
                  A726PrdPreMed = GXutil.roundDecimal( A750PrdValStk.divide((A704PrdExiAlm.add(A705PrdExiCC)), 18, java.math.RoundingMode.DOWN), 3) ;
                  httpContext.ajax_rsp_assign_attri("", false, "A726PrdPreMed", GXutil.ltrimstr( A726PrdPreMed, 14, 5));
               }
               else
               {
                  if ( ( A704PrdExiAlm.doubleValue() == 0 ) && ( A705PrdExiCC.doubleValue() == 0 ) && ( AV30Consumos == 0 ) )
                  {
                     A726PrdPreMed = DecimalUtil.doubleToDec(0) ;
                     httpContext.ajax_rsp_assign_attri("", false, "A726PrdPreMed", GXutil.ltrimstr( A726PrdPreMed, 14, 5));
                  }
               }
            }
         }
         /* Using cursor T01SK28 */
         pr_default.execute(23, new Object[] {A396EmprCod, Boolean.valueOf(n658PedCod), Integer.valueOf(A658PedCod)});
         A661PedFec = T01SK28_A661PedFec[0] ;
         A667PedSit = T01SK28_A667PedSit[0] ;
         A666PedPri = T01SK28_A666PedPri[0] ;
         A12580PedAlmc = T01SK28_A12580PedAlmc[0] ;
         pr_default.close(23);
         /* Using cursor T01SK29 */
         pr_default.execute(24, new Object[] {A396EmprCod, Boolean.valueOf(n658PedCod), Integer.valueOf(A658PedCod), A719PrdNum});
         Z665PedPre = T01SK29_A665PedPre[0] ;
         Z669PedUni = T01SK29_A669PedUni[0] ;
         Z663PedFulEnt = T01SK29_A663PedFulEnt[0] ;
         Z659PedCum = T01SK29_A659PedCum[0] ;
         Z660PedDto = T01SK29_A660PedDto[0] ;
         A657PedCanEnt = T01SK29_A657PedCanEnt[0] ;
         A665PedPre = T01SK29_A665PedPre[0] ;
         A669PedUni = T01SK29_A669PedUni[0] ;
         A663PedFulEnt = T01SK29_A663PedFulEnt[0] ;
         A659PedCum = T01SK29_A659PedCum[0] ;
         A660PedDto = T01SK29_A660PedDto[0] ;
         O657PedCanEnt = A657PedCanEnt ;
         httpContext.ajax_rsp_assign_attri("", false, "A657PedCanEnt", GXutil.ltrimstr( A657PedCanEnt, 9, 2));
         pr_default.close(24);
         if ( isDlt( )  && ( ! (0==A658PedCod) ) )
         {
            A657PedCanEnt = O657PedCanEnt.subtract(O418EntUniEnt) ;
            httpContext.ajax_rsp_assign_attri("", false, "A657PedCanEnt", GXutil.ltrimstr( A657PedCanEnt, 9, 2));
         }
         else
         {
            if ( isUpd( )  && ! ( ! (0==A658PedCod) ) && ( ! (0==A658PedCod) ) )
            {
               A657PedCanEnt = O657PedCanEnt.subtract(O418EntUniEnt) ;
               httpContext.ajax_rsp_assign_attri("", false, "A657PedCanEnt", GXutil.ltrimstr( A657PedCanEnt, 9, 2));
            }
            else
            {
               if ( isUpd( )  && ( ! (0==A658PedCod) ) && ! ( ! (0==A658PedCod) ) )
               {
                  A657PedCanEnt = O657PedCanEnt.add(A418EntUniEnt) ;
                  httpContext.ajax_rsp_assign_attri("", false, "A657PedCanEnt", GXutil.ltrimstr( A657PedCanEnt, 9, 2));
               }
               else
               {
                  if ( ( isIns( )  || isUpd( )  || isDlt( )  ) && ( ! (0==A658PedCod) ) )
                  {
                     A657PedCanEnt = O657PedCanEnt.add(A418EntUniEnt).subtract(O418EntUniEnt) ;
                     httpContext.ajax_rsp_assign_attri("", false, "A657PedCanEnt", GXutil.ltrimstr( A657PedCanEnt, 9, 2));
                  }
               }
            }
         }
         /* Using cursor T01SK30 */
         pr_default.execute(25, new Object[] {A396EmprCod, Integer.valueOf(A795PrvNum)});
         A794PrvNom = T01SK30_A794PrvNom[0] ;
         n794PrvNom = T01SK30_n794PrvNom[0] ;
         A800PrvPri = T01SK30_A800PrvPri[0] ;
         n800PrvPri = T01SK30_n800PrvPri[0] ;
         pr_default.close(25);
         if ( true )
         {
            AV22PedPri = GXutil.str( A800PrvPri, 1, 0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV22PedPri", AV22PedPri);
         }
         else
         {
            if ( true /* Level */ && ! (0==A658PedCod) )
            {
               AV22PedPri = A666PedPri ;
               httpContext.ajax_rsp_assign_attri("", false, "AV22PedPri", AV22PedPri);
            }
         }
         /* Using cursor T01SK32 */
         pr_default.execute(26, new Object[] {A396EmprCod, A719PrdNum});
         if ( (pr_default.getStatus(26) != 101) )
         {
            A913StockRem = T01SK32_A913StockRem[0] ;
            n913StockRem = T01SK32_n913StockRem[0] ;
         }
         else
         {
            A913StockRem = DecimalUtil.doubleToDec(0) ;
            n913StockRem = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A913StockRem", GXutil.ltrimstr( A913StockRem, 12, 4));
         }
         pr_default.close(26);
         GXt_date10 = A14040PrdUltMovF ;
         GXv_char12[0] = A396EmprCod ;
         GXv_char4[0] = A719PrdNum ;
         GXv_date11[0] = GXt_date10 ;
         new app.pstm005(remoteHandle, context).execute( GXv_char12, GXv_char4, GXv_date11) ;
         entradaproducto_trn_impl.this.A396EmprCod = GXv_char12[0] ;
         entradaproducto_trn_impl.this.A719PrdNum = GXv_char4[0] ;
         entradaproducto_trn_impl.this.GXt_date10 = GXv_date11[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         A14040PrdUltMovF = GXt_date10 ;
         httpContext.ajax_rsp_assign_attri("", false, "A14040PrdUltMovF", localUtil.format(A14040PrdUltMovF, "99/99/99"));
         GXt_date10 = A3835UltFecCCs ;
         GXv_char12[0] = A396EmprCod ;
         GXv_char4[0] = A719PrdNum ;
         GXv_date11[0] = GXt_date10 ;
         new app.pstm005(remoteHandle, context).execute( GXv_char12, GXv_char4, GXv_date11) ;
         entradaproducto_trn_impl.this.A396EmprCod = GXv_char12[0] ;
         entradaproducto_trn_impl.this.A719PrdNum = GXv_char4[0] ;
         entradaproducto_trn_impl.this.GXt_date10 = GXv_date11[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         A3835UltFecCCs = GXt_date10 ;
         httpContext.ajax_rsp_assign_attri("", false, "A3835UltFecCCs", localUtil.format(A3835UltFecCCs, "99/99/99"));
         A664PedNumLin = (short)(getPedNumLin0( A396EmprCod, A658PedCod)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A664PedNumLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A664PedNumLin), 3, 0));
      }
   }

   public void updateTablesN11SK42( )
   {
      /* Using cursor T01SK33 */
      pr_default.execute(27, new Object[] {Short.valueOf(A847UltLinEnt), A704PrdExiAlm, A726PrdPreMed, A750PrdValStk, A396EmprCod, A719PrdNum});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPRODUC");
      /* Using cursor T01SK34 */
      pr_default.execute(28, new Object[] {A657PedCanEnt, A396EmprCod, Boolean.valueOf(n658PedCod), Integer.valueOf(A658PedCod), A719PrdNum});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLPEDID");
   }

   public void endLevel1SK42( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      pr_default.close(17);
      pr_default.close(18);
      if ( AnyError == 0 )
      {
         beforeComplete1SK42( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "stocksquimicos.entradaproducto_trn");
         if ( AnyError == 0 )
         {
            confirmValues1SK0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "stocksquimicos.entradaproducto_trn");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1SK42( )
   {
      /* Scan By routine */
      /* Using cursor T01SK35 */
      pr_default.execute(29, new Object[] {A396EmprCod});
      RcdFound42 = (short)(0) ;
      if ( (pr_default.getStatus(29) != 101) )
      {
         RcdFound42 = (short)(1) ;
         A719PrdNum = T01SK35_A719PrdNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         A597LinEnt = T01SK35_A597LinEnt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A597LinEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A597LinEnt), 4, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1SK42( )
   {
      /* Scan next routine */
      pr_default.readNext(29);
      RcdFound42 = (short)(0) ;
      if ( (pr_default.getStatus(29) != 101) )
      {
         RcdFound42 = (short)(1) ;
         A719PrdNum = T01SK35_A719PrdNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         A597LinEnt = T01SK35_A597LinEnt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A597LinEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A597LinEnt), 4, 0));
      }
   }

   public void scanEnd1SK42( )
   {
      pr_default.close(29);
   }

   public void afterConfirm1SK42( )
   {
      /* After Confirm Rules */
      if ( true /* Level */ && isDlt( )  && true /* After */ )
      {
         GXv_char12[0] = A396EmprCod ;
         GXv_char4[0] = A719PrdNum ;
         GXv_int14[0] = A597LinEnt ;
         new app.peliccs(remoteHandle, context).execute( GXv_char12, GXv_char4, GXv_int14) ;
         entradaproducto_trn_impl.this.A396EmprCod = GXv_char12[0] ;
         entradaproducto_trn_impl.this.A719PrdNum = GXv_char4[0] ;
         entradaproducto_trn_impl.this.A597LinEnt = GXv_int14[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         httpContext.ajax_rsp_assign_attri("", false, "A597LinEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A597LinEnt), 4, 0));
      }
      if ( isIns( )  && true /* After */ )
      {
         GXv_char12[0] = A396EmprCod ;
         GXv_int8[0] = A6156EntPrvNum ;
         GXv_int14[0] = AV32Year ;
         GXv_int6[0] = (byte)(AV34Mes) ;
         GXv_decimal13[0] = A418EntUniEnt ;
         GXv_decimal15[0] = AV40UniOld ;
         GXv_decimal16[0] = A417EntPre ;
         GXv_char4[0] = AV22PedPri ;
         GXv_int17[0] = AV32Year ;
         GXv_int18[0] = AV42AnyAnt ;
         GXv_int19[0] = (byte)(AV34Mes) ;
         GXv_int20[0] = AV43MesAnt ;
         GXv_decimal21[0] = AV41PrecAnt ;
         GXv_date11[0] = A415EntFecEnt ;
         GXv_date22[0] = AV39FecAnt ;
         GXv_char3[0] = httpContext.getMessage( "INS", "") ;
         new app.pprdes2(remoteHandle, context).execute( GXv_char12, GXv_int8, GXv_int14, GXv_int6, GXv_decimal13, GXv_decimal15, GXv_decimal16, GXv_char4, GXv_int17, GXv_int18, GXv_int19, GXv_int20, GXv_decimal21, GXv_date11, GXv_date22, GXv_char3) ;
         entradaproducto_trn_impl.this.A396EmprCod = GXv_char12[0] ;
         entradaproducto_trn_impl.this.A6156EntPrvNum = GXv_int8[0] ;
         entradaproducto_trn_impl.this.AV32Year = GXv_int14[0] ;
         entradaproducto_trn_impl.this.AV34Mes = GXv_int6[0] ;
         entradaproducto_trn_impl.this.A418EntUniEnt = GXv_decimal13[0] ;
         entradaproducto_trn_impl.this.AV40UniOld = GXv_decimal15[0] ;
         entradaproducto_trn_impl.this.A417EntPre = GXv_decimal16[0] ;
         entradaproducto_trn_impl.this.AV22PedPri = GXv_char4[0] ;
         entradaproducto_trn_impl.this.AV32Year = GXv_int17[0] ;
         entradaproducto_trn_impl.this.AV42AnyAnt = GXv_int18[0] ;
         entradaproducto_trn_impl.this.AV34Mes = GXv_int19[0] ;
         entradaproducto_trn_impl.this.AV43MesAnt = GXv_int20[0] ;
         entradaproducto_trn_impl.this.AV41PrecAnt = GXv_decimal21[0] ;
         entradaproducto_trn_impl.this.A415EntFecEnt = GXv_date11[0] ;
         entradaproducto_trn_impl.this.AV39FecAnt = GXv_date22[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A6156EntPrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6156EntPrvNum), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV32Year", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV32Year), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV34Mes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34Mes), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A418EntUniEnt", GXutil.ltrimstr( A418EntUniEnt, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "AV40UniOld", GXutil.ltrimstr( AV40UniOld, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "A417EntPre", GXutil.ltrimstr( A417EntPre, 14, 5));
         httpContext.ajax_rsp_assign_attri("", false, "AV22PedPri", AV22PedPri);
         httpContext.ajax_rsp_assign_attri("", false, "AV32Year", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV32Year), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV42AnyAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV42AnyAnt), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV34Mes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34Mes), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV43MesAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV43MesAnt), 2, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV41PrecAnt", GXutil.ltrimstr( AV41PrecAnt, 14, 5));
         httpContext.ajax_rsp_assign_attri("", false, "A415EntFecEnt", localUtil.format(A415EntFecEnt, "99/99/99"));
         httpContext.ajax_rsp_assign_attri("", false, "AV39FecAnt", localUtil.format(AV39FecAnt, "99/99/99"));
      }
      if ( ( ( ( DecimalUtil.compareTo(A418EntUniEnt, AV40UniOld) != 0 ) ) || ( !( GXutil.dateCompare(GXutil.resetTime(A415EntFecEnt), GXutil.resetTime(AV39FecAnt)) ) ) || ( ( DecimalUtil.compareTo(A417EntPre, AV41PrecAnt) != 0 ) ) ) && isUpd( )  && true /* After */ )
      {
         GXv_char12[0] = A396EmprCod ;
         GXv_int8[0] = A6156EntPrvNum ;
         GXv_int18[0] = AV32Year ;
         GXv_int20[0] = (byte)(AV34Mes) ;
         GXv_decimal21[0] = A418EntUniEnt ;
         GXv_decimal16[0] = AV40UniOld ;
         GXv_decimal15[0] = A417EntPre ;
         GXv_char4[0] = AV22PedPri ;
         GXv_int17[0] = AV32Year ;
         GXv_int14[0] = AV42AnyAnt ;
         GXv_int19[0] = (byte)(AV34Mes) ;
         GXv_int6[0] = AV43MesAnt ;
         GXv_decimal13[0] = AV41PrecAnt ;
         GXv_date22[0] = A415EntFecEnt ;
         GXv_date11[0] = AV39FecAnt ;
         GXv_char3[0] = httpContext.getMessage( "UPD", "") ;
         new app.pprdes2(remoteHandle, context).execute( GXv_char12, GXv_int8, GXv_int18, GXv_int20, GXv_decimal21, GXv_decimal16, GXv_decimal15, GXv_char4, GXv_int17, GXv_int14, GXv_int19, GXv_int6, GXv_decimal13, GXv_date22, GXv_date11, GXv_char3) ;
         entradaproducto_trn_impl.this.A396EmprCod = GXv_char12[0] ;
         entradaproducto_trn_impl.this.A6156EntPrvNum = GXv_int8[0] ;
         entradaproducto_trn_impl.this.AV32Year = GXv_int18[0] ;
         entradaproducto_trn_impl.this.AV34Mes = GXv_int20[0] ;
         entradaproducto_trn_impl.this.A418EntUniEnt = GXv_decimal21[0] ;
         entradaproducto_trn_impl.this.AV40UniOld = GXv_decimal16[0] ;
         entradaproducto_trn_impl.this.A417EntPre = GXv_decimal15[0] ;
         entradaproducto_trn_impl.this.AV22PedPri = GXv_char4[0] ;
         entradaproducto_trn_impl.this.AV32Year = GXv_int17[0] ;
         entradaproducto_trn_impl.this.AV42AnyAnt = GXv_int14[0] ;
         entradaproducto_trn_impl.this.AV34Mes = GXv_int19[0] ;
         entradaproducto_trn_impl.this.AV43MesAnt = GXv_int6[0] ;
         entradaproducto_trn_impl.this.AV41PrecAnt = GXv_decimal13[0] ;
         entradaproducto_trn_impl.this.A415EntFecEnt = GXv_date22[0] ;
         entradaproducto_trn_impl.this.AV39FecAnt = GXv_date11[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A6156EntPrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6156EntPrvNum), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV32Year", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV32Year), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV34Mes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34Mes), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A418EntUniEnt", GXutil.ltrimstr( A418EntUniEnt, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "AV40UniOld", GXutil.ltrimstr( AV40UniOld, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "A417EntPre", GXutil.ltrimstr( A417EntPre, 14, 5));
         httpContext.ajax_rsp_assign_attri("", false, "AV22PedPri", AV22PedPri);
         httpContext.ajax_rsp_assign_attri("", false, "AV32Year", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV32Year), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV42AnyAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV42AnyAnt), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV34Mes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34Mes), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV43MesAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV43MesAnt), 2, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV41PrecAnt", GXutil.ltrimstr( AV41PrecAnt, 14, 5));
         httpContext.ajax_rsp_assign_attri("", false, "A415EntFecEnt", localUtil.format(A415EntFecEnt, "99/99/99"));
         httpContext.ajax_rsp_assign_attri("", false, "AV39FecAnt", localUtil.format(AV39FecAnt, "99/99/99"));
      }
      if ( isIns( )  && true /* After */ )
      {
         GXv_char12[0] = A396EmprCod ;
         GXv_int8[0] = A6156EntPrvNum ;
         GXv_char4[0] = A719PrdNum ;
         GXv_char3[0] = A718PrdNom ;
         GXv_int18[0] = AV32Year ;
         GXv_int20[0] = (byte)(AV34Mes) ;
         GXv_decimal21[0] = A418EntUniEnt ;
         GXv_decimal16[0] = AV40UniOld ;
         GXv_decimal15[0] = A417EntPre ;
         GXv_char2[0] = AV22PedPri ;
         GXv_int17[0] = AV32Year ;
         GXv_int14[0] = AV42AnyAnt ;
         GXv_int19[0] = (byte)(AV34Mes) ;
         GXv_int6[0] = AV43MesAnt ;
         GXv_decimal13[0] = AV41PrecAnt ;
         GXv_date22[0] = A415EntFecEnt ;
         GXv_date11[0] = AV39FecAnt ;
         GXv_char23[0] = httpContext.getMessage( "INS", "") ;
         new app.pprdes3(remoteHandle, context).execute( GXv_char12, GXv_int8, GXv_char4, GXv_char3, GXv_int18, GXv_int20, GXv_decimal21, GXv_decimal16, GXv_decimal15, GXv_char2, GXv_int17, GXv_int14, GXv_int19, GXv_int6, GXv_decimal13, GXv_date22, GXv_date11, GXv_char23) ;
         entradaproducto_trn_impl.this.A396EmprCod = GXv_char12[0] ;
         entradaproducto_trn_impl.this.A6156EntPrvNum = GXv_int8[0] ;
         entradaproducto_trn_impl.this.A719PrdNum = GXv_char4[0] ;
         entradaproducto_trn_impl.this.A718PrdNom = GXv_char3[0] ;
         entradaproducto_trn_impl.this.AV32Year = GXv_int18[0] ;
         entradaproducto_trn_impl.this.AV34Mes = GXv_int20[0] ;
         entradaproducto_trn_impl.this.A418EntUniEnt = GXv_decimal21[0] ;
         entradaproducto_trn_impl.this.AV40UniOld = GXv_decimal16[0] ;
         entradaproducto_trn_impl.this.A417EntPre = GXv_decimal15[0] ;
         entradaproducto_trn_impl.this.AV22PedPri = GXv_char2[0] ;
         entradaproducto_trn_impl.this.AV32Year = GXv_int17[0] ;
         entradaproducto_trn_impl.this.AV42AnyAnt = GXv_int14[0] ;
         entradaproducto_trn_impl.this.AV34Mes = GXv_int19[0] ;
         entradaproducto_trn_impl.this.AV43MesAnt = GXv_int6[0] ;
         entradaproducto_trn_impl.this.AV41PrecAnt = GXv_decimal13[0] ;
         entradaproducto_trn_impl.this.A415EntFecEnt = GXv_date22[0] ;
         entradaproducto_trn_impl.this.AV39FecAnt = GXv_date11[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A6156EntPrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6156EntPrvNum), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         httpContext.ajax_rsp_assign_attri("", false, "A718PrdNom", A718PrdNom);
         httpContext.ajax_rsp_assign_attri("", false, "AV32Year", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV32Year), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV34Mes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34Mes), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A418EntUniEnt", GXutil.ltrimstr( A418EntUniEnt, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "AV40UniOld", GXutil.ltrimstr( AV40UniOld, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "A417EntPre", GXutil.ltrimstr( A417EntPre, 14, 5));
         httpContext.ajax_rsp_assign_attri("", false, "AV22PedPri", AV22PedPri);
         httpContext.ajax_rsp_assign_attri("", false, "AV32Year", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV32Year), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV42AnyAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV42AnyAnt), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV34Mes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34Mes), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV43MesAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV43MesAnt), 2, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV41PrecAnt", GXutil.ltrimstr( AV41PrecAnt, 14, 5));
         httpContext.ajax_rsp_assign_attri("", false, "A415EntFecEnt", localUtil.format(A415EntFecEnt, "99/99/99"));
         httpContext.ajax_rsp_assign_attri("", false, "AV39FecAnt", localUtil.format(AV39FecAnt, "99/99/99"));
      }
      if ( ( ( ( DecimalUtil.compareTo(A418EntUniEnt, AV40UniOld) != 0 ) ) || ( !( GXutil.dateCompare(GXutil.resetTime(A415EntFecEnt), GXutil.resetTime(AV39FecAnt)) ) ) || ( ( DecimalUtil.compareTo(A417EntPre, AV41PrecAnt) != 0 ) ) ) && isUpd( )  && true /* After */ )
      {
         GXv_char23[0] = A396EmprCod ;
         GXv_int8[0] = A6156EntPrvNum ;
         GXv_char12[0] = A719PrdNum ;
         GXv_char4[0] = A718PrdNom ;
         GXv_int18[0] = AV32Year ;
         GXv_int20[0] = (byte)(AV34Mes) ;
         GXv_decimal21[0] = A418EntUniEnt ;
         GXv_decimal16[0] = AV40UniOld ;
         GXv_decimal15[0] = A417EntPre ;
         GXv_char3[0] = AV22PedPri ;
         GXv_int17[0] = AV32Year ;
         GXv_int14[0] = AV42AnyAnt ;
         GXv_int19[0] = (byte)(AV34Mes) ;
         GXv_int6[0] = AV43MesAnt ;
         GXv_decimal13[0] = AV41PrecAnt ;
         GXv_date22[0] = A415EntFecEnt ;
         GXv_date11[0] = AV39FecAnt ;
         GXv_char2[0] = httpContext.getMessage( "UPD", "") ;
         new app.pprdes3(remoteHandle, context).execute( GXv_char23, GXv_int8, GXv_char12, GXv_char4, GXv_int18, GXv_int20, GXv_decimal21, GXv_decimal16, GXv_decimal15, GXv_char3, GXv_int17, GXv_int14, GXv_int19, GXv_int6, GXv_decimal13, GXv_date22, GXv_date11, GXv_char2) ;
         entradaproducto_trn_impl.this.A396EmprCod = GXv_char23[0] ;
         entradaproducto_trn_impl.this.A6156EntPrvNum = GXv_int8[0] ;
         entradaproducto_trn_impl.this.A719PrdNum = GXv_char12[0] ;
         entradaproducto_trn_impl.this.A718PrdNom = GXv_char4[0] ;
         entradaproducto_trn_impl.this.AV32Year = GXv_int18[0] ;
         entradaproducto_trn_impl.this.AV34Mes = GXv_int20[0] ;
         entradaproducto_trn_impl.this.A418EntUniEnt = GXv_decimal21[0] ;
         entradaproducto_trn_impl.this.AV40UniOld = GXv_decimal16[0] ;
         entradaproducto_trn_impl.this.A417EntPre = GXv_decimal15[0] ;
         entradaproducto_trn_impl.this.AV22PedPri = GXv_char3[0] ;
         entradaproducto_trn_impl.this.AV32Year = GXv_int17[0] ;
         entradaproducto_trn_impl.this.AV42AnyAnt = GXv_int14[0] ;
         entradaproducto_trn_impl.this.AV34Mes = GXv_int19[0] ;
         entradaproducto_trn_impl.this.AV43MesAnt = GXv_int6[0] ;
         entradaproducto_trn_impl.this.AV41PrecAnt = GXv_decimal13[0] ;
         entradaproducto_trn_impl.this.A415EntFecEnt = GXv_date22[0] ;
         entradaproducto_trn_impl.this.AV39FecAnt = GXv_date11[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A6156EntPrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6156EntPrvNum), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         httpContext.ajax_rsp_assign_attri("", false, "A718PrdNom", A718PrdNom);
         httpContext.ajax_rsp_assign_attri("", false, "AV32Year", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV32Year), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV34Mes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34Mes), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A418EntUniEnt", GXutil.ltrimstr( A418EntUniEnt, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "AV40UniOld", GXutil.ltrimstr( AV40UniOld, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "A417EntPre", GXutil.ltrimstr( A417EntPre, 14, 5));
         httpContext.ajax_rsp_assign_attri("", false, "AV22PedPri", AV22PedPri);
         httpContext.ajax_rsp_assign_attri("", false, "AV32Year", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV32Year), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV42AnyAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV42AnyAnt), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV34Mes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34Mes), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV43MesAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV43MesAnt), 2, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV41PrecAnt", GXutil.ltrimstr( AV41PrecAnt, 14, 5));
         httpContext.ajax_rsp_assign_attri("", false, "A415EntFecEnt", localUtil.format(A415EntFecEnt, "99/99/99"));
         httpContext.ajax_rsp_assign_attri("", false, "AV39FecAnt", localUtil.format(AV39FecAnt, "99/99/99"));
      }
      if ( isIns( )  && true /* After */ )
      {
         GXv_char23[0] = A396EmprCod ;
         GXv_char12[0] = A719PrdNum ;
         GXv_int18[0] = AV32Year ;
         GXv_int20[0] = (byte)(AV34Mes) ;
         GXv_decimal21[0] = A418EntUniEnt ;
         GXv_decimal16[0] = AV40UniOld ;
         GXv_decimal15[0] = A417EntPre ;
         GXv_int17[0] = AV32Year ;
         GXv_int14[0] = AV42AnyAnt ;
         GXv_int19[0] = (byte)(AV34Mes) ;
         GXv_int6[0] = AV43MesAnt ;
         GXv_decimal13[0] = AV41PrecAnt ;
         GXv_date22[0] = A415EntFecEnt ;
         GXv_date11[0] = AV39FecAnt ;
         GXv_char4[0] = AV22PedPri ;
         GXv_char3[0] = httpContext.getMessage( "INS", "") ;
         new app.pprden2(remoteHandle, context).execute( GXv_char23, GXv_char12, GXv_int18, GXv_int20, GXv_decimal21, GXv_decimal16, GXv_decimal15, GXv_int17, GXv_int14, GXv_int19, GXv_int6, GXv_decimal13, GXv_date22, GXv_date11, GXv_char4, GXv_char3) ;
         entradaproducto_trn_impl.this.A396EmprCod = GXv_char23[0] ;
         entradaproducto_trn_impl.this.A719PrdNum = GXv_char12[0] ;
         entradaproducto_trn_impl.this.AV32Year = GXv_int18[0] ;
         entradaproducto_trn_impl.this.AV34Mes = GXv_int20[0] ;
         entradaproducto_trn_impl.this.A418EntUniEnt = GXv_decimal21[0] ;
         entradaproducto_trn_impl.this.AV40UniOld = GXv_decimal16[0] ;
         entradaproducto_trn_impl.this.A417EntPre = GXv_decimal15[0] ;
         entradaproducto_trn_impl.this.AV32Year = GXv_int17[0] ;
         entradaproducto_trn_impl.this.AV42AnyAnt = GXv_int14[0] ;
         entradaproducto_trn_impl.this.AV34Mes = GXv_int19[0] ;
         entradaproducto_trn_impl.this.AV43MesAnt = GXv_int6[0] ;
         entradaproducto_trn_impl.this.AV41PrecAnt = GXv_decimal13[0] ;
         entradaproducto_trn_impl.this.A415EntFecEnt = GXv_date22[0] ;
         entradaproducto_trn_impl.this.AV39FecAnt = GXv_date11[0] ;
         entradaproducto_trn_impl.this.AV22PedPri = GXv_char4[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         httpContext.ajax_rsp_assign_attri("", false, "AV32Year", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV32Year), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV34Mes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34Mes), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A418EntUniEnt", GXutil.ltrimstr( A418EntUniEnt, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "AV40UniOld", GXutil.ltrimstr( AV40UniOld, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "A417EntPre", GXutil.ltrimstr( A417EntPre, 14, 5));
         httpContext.ajax_rsp_assign_attri("", false, "AV32Year", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV32Year), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV42AnyAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV42AnyAnt), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV34Mes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34Mes), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV43MesAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV43MesAnt), 2, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV41PrecAnt", GXutil.ltrimstr( AV41PrecAnt, 14, 5));
         httpContext.ajax_rsp_assign_attri("", false, "A415EntFecEnt", localUtil.format(A415EntFecEnt, "99/99/99"));
         httpContext.ajax_rsp_assign_attri("", false, "AV39FecAnt", localUtil.format(AV39FecAnt, "99/99/99"));
         httpContext.ajax_rsp_assign_attri("", false, "AV22PedPri", AV22PedPri);
      }
      if ( ( ( ( DecimalUtil.compareTo(A418EntUniEnt, AV40UniOld) != 0 ) ) || ( !( GXutil.dateCompare(GXutil.resetTime(A415EntFecEnt), GXutil.resetTime(AV39FecAnt)) ) ) || ( ( DecimalUtil.compareTo(A417EntPre, AV41PrecAnt) != 0 ) ) ) && isUpd( )  && true /* After */ )
      {
         GXv_char23[0] = A396EmprCod ;
         GXv_char12[0] = A719PrdNum ;
         GXv_int18[0] = AV32Year ;
         GXv_int20[0] = (byte)(AV34Mes) ;
         GXv_decimal21[0] = A418EntUniEnt ;
         GXv_decimal16[0] = AV40UniOld ;
         GXv_decimal15[0] = A417EntPre ;
         GXv_int17[0] = AV32Year ;
         GXv_int14[0] = AV42AnyAnt ;
         GXv_int19[0] = (byte)(AV34Mes) ;
         GXv_int6[0] = AV43MesAnt ;
         GXv_decimal13[0] = AV41PrecAnt ;
         GXv_date22[0] = A415EntFecEnt ;
         GXv_date11[0] = AV39FecAnt ;
         GXv_char4[0] = AV22PedPri ;
         GXv_char3[0] = httpContext.getMessage( "UPD", "") ;
         new app.pprden2(remoteHandle, context).execute( GXv_char23, GXv_char12, GXv_int18, GXv_int20, GXv_decimal21, GXv_decimal16, GXv_decimal15, GXv_int17, GXv_int14, GXv_int19, GXv_int6, GXv_decimal13, GXv_date22, GXv_date11, GXv_char4, GXv_char3) ;
         entradaproducto_trn_impl.this.A396EmprCod = GXv_char23[0] ;
         entradaproducto_trn_impl.this.A719PrdNum = GXv_char12[0] ;
         entradaproducto_trn_impl.this.AV32Year = GXv_int18[0] ;
         entradaproducto_trn_impl.this.AV34Mes = GXv_int20[0] ;
         entradaproducto_trn_impl.this.A418EntUniEnt = GXv_decimal21[0] ;
         entradaproducto_trn_impl.this.AV40UniOld = GXv_decimal16[0] ;
         entradaproducto_trn_impl.this.A417EntPre = GXv_decimal15[0] ;
         entradaproducto_trn_impl.this.AV32Year = GXv_int17[0] ;
         entradaproducto_trn_impl.this.AV42AnyAnt = GXv_int14[0] ;
         entradaproducto_trn_impl.this.AV34Mes = GXv_int19[0] ;
         entradaproducto_trn_impl.this.AV43MesAnt = GXv_int6[0] ;
         entradaproducto_trn_impl.this.AV41PrecAnt = GXv_decimal13[0] ;
         entradaproducto_trn_impl.this.A415EntFecEnt = GXv_date22[0] ;
         entradaproducto_trn_impl.this.AV39FecAnt = GXv_date11[0] ;
         entradaproducto_trn_impl.this.AV22PedPri = GXv_char4[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         httpContext.ajax_rsp_assign_attri("", false, "AV32Year", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV32Year), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV34Mes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34Mes), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A418EntUniEnt", GXutil.ltrimstr( A418EntUniEnt, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "AV40UniOld", GXutil.ltrimstr( AV40UniOld, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "A417EntPre", GXutil.ltrimstr( A417EntPre, 14, 5));
         httpContext.ajax_rsp_assign_attri("", false, "AV32Year", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV32Year), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV42AnyAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV42AnyAnt), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV34Mes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34Mes), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV43MesAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV43MesAnt), 2, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV41PrecAnt", GXutil.ltrimstr( AV41PrecAnt, 14, 5));
         httpContext.ajax_rsp_assign_attri("", false, "A415EntFecEnt", localUtil.format(A415EntFecEnt, "99/99/99"));
         httpContext.ajax_rsp_assign_attri("", false, "AV39FecAnt", localUtil.format(AV39FecAnt, "99/99/99"));
         httpContext.ajax_rsp_assign_attri("", false, "AV22PedPri", AV22PedPri);
      }
      if ( isDlt( )  && true /* Level */ && true /* After */ )
      {
         GXv_char23[0] = A396EmprCod ;
         GXv_int8[0] = A6156EntPrvNum ;
         GXv_date22[0] = A415EntFecEnt ;
         GXv_int24[0] = A658PedCod ;
         GXv_decimal21[0] = A418EntUniEnt ;
         GXv_decimal16[0] = A417EntPre ;
         GXv_char12[0] = AV22PedPri ;
         new app.pacespr(remoteHandle, context).execute( GXv_char23, GXv_int8, GXv_date22, GXv_int24, GXv_decimal21, GXv_decimal16, GXv_char12) ;
         entradaproducto_trn_impl.this.A396EmprCod = GXv_char23[0] ;
         entradaproducto_trn_impl.this.A6156EntPrvNum = GXv_int8[0] ;
         entradaproducto_trn_impl.this.A415EntFecEnt = GXv_date22[0] ;
         entradaproducto_trn_impl.this.A658PedCod = GXv_int24[0] ;
         entradaproducto_trn_impl.this.A418EntUniEnt = GXv_decimal21[0] ;
         entradaproducto_trn_impl.this.A417EntPre = GXv_decimal16[0] ;
         entradaproducto_trn_impl.this.AV22PedPri = GXv_char12[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A6156EntPrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6156EntPrvNum), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A415EntFecEnt", localUtil.format(A415EntFecEnt, "99/99/99"));
         httpContext.ajax_rsp_assign_attri("", false, "A658PedCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A658PedCod), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A418EntUniEnt", GXutil.ltrimstr( A418EntUniEnt, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "A417EntPre", GXutil.ltrimstr( A417EntPre, 14, 5));
         httpContext.ajax_rsp_assign_attri("", false, "AV22PedPri", AV22PedPri);
      }
      if ( isDlt( )  && true /* Level */ && true /* After */ )
      {
         GXv_char23[0] = A396EmprCod ;
         GXv_int24[0] = A6156EntPrvNum ;
         GXv_char12[0] = A719PrdNum ;
         GXv_char4[0] = A718PrdNom ;
         GXv_date22[0] = A415EntFecEnt ;
         GXv_int8[0] = A658PedCod ;
         GXv_decimal21[0] = A418EntUniEnt ;
         GXv_decimal16[0] = A417EntPre ;
         GXv_char3[0] = AV22PedPri ;
         new app.pacesprx(remoteHandle, context).execute( GXv_char23, GXv_int24, GXv_char12, GXv_char4, GXv_date22, GXv_int8, GXv_decimal21, GXv_decimal16, GXv_char3) ;
         entradaproducto_trn_impl.this.A396EmprCod = GXv_char23[0] ;
         entradaproducto_trn_impl.this.A6156EntPrvNum = GXv_int24[0] ;
         entradaproducto_trn_impl.this.A719PrdNum = GXv_char12[0] ;
         entradaproducto_trn_impl.this.A718PrdNom = GXv_char4[0] ;
         entradaproducto_trn_impl.this.A415EntFecEnt = GXv_date22[0] ;
         entradaproducto_trn_impl.this.A658PedCod = GXv_int8[0] ;
         entradaproducto_trn_impl.this.A418EntUniEnt = GXv_decimal21[0] ;
         entradaproducto_trn_impl.this.A417EntPre = GXv_decimal16[0] ;
         entradaproducto_trn_impl.this.AV22PedPri = GXv_char3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A6156EntPrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6156EntPrvNum), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         httpContext.ajax_rsp_assign_attri("", false, "A718PrdNom", A718PrdNom);
         httpContext.ajax_rsp_assign_attri("", false, "A415EntFecEnt", localUtil.format(A415EntFecEnt, "99/99/99"));
         httpContext.ajax_rsp_assign_attri("", false, "A658PedCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A658PedCod), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A418EntUniEnt", GXutil.ltrimstr( A418EntUniEnt, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "A417EntPre", GXutil.ltrimstr( A417EntPre, 14, 5));
         httpContext.ajax_rsp_assign_attri("", false, "AV22PedPri", AV22PedPri);
      }
      if ( isDlt( )  && true /* Level */ && true /* After */ )
      {
         GXv_char23[0] = A396EmprCod ;
         GXv_char12[0] = A719PrdNum ;
         GXv_date22[0] = A415EntFecEnt ;
         GXv_decimal21[0] = A418EntUniEnt ;
         GXv_decimal16[0] = A417EntPre ;
         new app.pacespd(remoteHandle, context).execute( GXv_char23, GXv_char12, GXv_date22, GXv_decimal21, GXv_decimal16) ;
         entradaproducto_trn_impl.this.A396EmprCod = GXv_char23[0] ;
         entradaproducto_trn_impl.this.A719PrdNum = GXv_char12[0] ;
         entradaproducto_trn_impl.this.A415EntFecEnt = GXv_date22[0] ;
         entradaproducto_trn_impl.this.A418EntUniEnt = GXv_decimal21[0] ;
         entradaproducto_trn_impl.this.A417EntPre = GXv_decimal16[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         httpContext.ajax_rsp_assign_attri("", false, "A415EntFecEnt", localUtil.format(A415EntFecEnt, "99/99/99"));
         httpContext.ajax_rsp_assign_attri("", false, "A418EntUniEnt", GXutil.ltrimstr( A418EntUniEnt, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "A417EntPre", GXutil.ltrimstr( A417EntPre, 14, 5));
      }
      if ( ( isIns( )  || isUpd( )  ) && true /* After */ && ( AV31Nalbaran20 == 0 ) )
      {
         GXv_char23[0] = A396EmprCod ;
         GXv_char12[0] = A719PrdNum ;
         GXv_decimal21[0] = A418EntUniEnt ;
         GXv_decimal16[0] = DecimalUtil.doubleToDec(0) ;
         GXv_char4[0] = httpContext.getMessage( "EN", "") ;
         GXv_char3[0] = AV22PedPri ;
         GXv_decimal15[0] = A417EntPre ;
         GXv_int24[0] = 0 ;
         GXv_int20[0] = (byte)(0) ;
         GXv_char2[0] = " " ;
         GXv_int8[0] = A658PedCod ;
         GXv_char25[0] = A11Albaran ;
         GXv_char26[0] = AV26UsurCod ;
         GXv_char27[0] = httpContext.getMessage( "Entrada por Pedido", "") ;
         GXv_int18[0] = A597LinEnt ;
         GXv_decimal13[0] = AV40UniOld ;
         GXv_decimal28[0] = DecimalUtil.doubleToDec(0) ;
         GXv_date22[0] = A415EntFecEnt ;
         GXv_int29[0] = A6156EntPrvNum ;
         GXv_char30[0] = A5686EntLotN ;
         new app.pnewcc9(remoteHandle, context).execute( GXv_char23, GXv_char12, GXv_decimal21, GXv_decimal16, GXv_char4, GXv_char3, GXv_decimal15, GXv_int24, GXv_int20, GXv_char2, GXv_int8, GXv_char25, GXv_char26, GXv_char27, GXv_int18, GXv_decimal13, GXv_decimal28, GXv_date22, GXv_int29, GXv_char30) ;
         entradaproducto_trn_impl.this.A396EmprCod = GXv_char23[0] ;
         entradaproducto_trn_impl.this.A719PrdNum = GXv_char12[0] ;
         entradaproducto_trn_impl.this.A418EntUniEnt = GXv_decimal21[0] ;
         entradaproducto_trn_impl.this.AV22PedPri = GXv_char3[0] ;
         entradaproducto_trn_impl.this.A417EntPre = GXv_decimal15[0] ;
         entradaproducto_trn_impl.this.A658PedCod = GXv_int8[0] ;
         entradaproducto_trn_impl.this.A11Albaran = GXv_char25[0] ;
         entradaproducto_trn_impl.this.AV26UsurCod = GXv_char26[0] ;
         entradaproducto_trn_impl.this.A597LinEnt = GXv_int18[0] ;
         entradaproducto_trn_impl.this.AV40UniOld = GXv_decimal13[0] ;
         entradaproducto_trn_impl.this.A415EntFecEnt = GXv_date22[0] ;
         entradaproducto_trn_impl.this.A6156EntPrvNum = GXv_int29[0] ;
         entradaproducto_trn_impl.this.A5686EntLotN = GXv_char30[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         httpContext.ajax_rsp_assign_attri("", false, "A418EntUniEnt", GXutil.ltrimstr( A418EntUniEnt, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "AV22PedPri", AV22PedPri);
         httpContext.ajax_rsp_assign_attri("", false, "A417EntPre", GXutil.ltrimstr( A417EntPre, 14, 5));
         httpContext.ajax_rsp_assign_attri("", false, "A658PedCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A658PedCod), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A11Albaran", A11Albaran);
         httpContext.ajax_rsp_assign_attri("", false, "AV26UsurCod", AV26UsurCod);
         httpContext.ajax_rsp_assign_attri("", false, "A597LinEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A597LinEnt), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV40UniOld", GXutil.ltrimstr( AV40UniOld, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "A415EntFecEnt", localUtil.format(A415EntFecEnt, "99/99/99"));
         httpContext.ajax_rsp_assign_attri("", false, "A6156EntPrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6156EntPrvNum), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A5686EntLotN", A5686EntLotN);
      }
      if ( ( isIns( )  || isUpd( )  ) && true /* After */ && ( AV31Nalbaran20 == 1 ) )
      {
         GXv_char30[0] = A396EmprCod ;
         GXv_char27[0] = A719PrdNum ;
         GXv_decimal28[0] = A418EntUniEnt ;
         GXv_decimal21[0] = DecimalUtil.doubleToDec(0) ;
         GXv_char26[0] = httpContext.getMessage( "EN", "") ;
         GXv_char25[0] = AV22PedPri ;
         GXv_decimal16[0] = A417EntPre ;
         GXv_int29[0] = 0 ;
         GXv_int20[0] = (byte)(0) ;
         GXv_char23[0] = " " ;
         GXv_int24[0] = A658PedCod ;
         GXv_char12[0] = A11Albaran ;
         GXv_char4[0] = AV26UsurCod ;
         GXv_char3[0] = httpContext.getMessage( "Entrada por Pedido", "") ;
         GXv_int18[0] = A597LinEnt ;
         GXv_decimal15[0] = AV40UniOld ;
         GXv_decimal13[0] = DecimalUtil.doubleToDec(0) ;
         GXv_date22[0] = A415EntFecEnt ;
         GXv_int8[0] = A6156EntPrvNum ;
         GXv_char2[0] = A5686EntLotN ;
         GXv_char31[0] = A12857EntNAlbar ;
         new app.pccstk20(remoteHandle, context).execute( GXv_char30, GXv_char27, GXv_decimal28, GXv_decimal21, GXv_char26, GXv_char25, GXv_decimal16, GXv_int29, GXv_int20, GXv_char23, GXv_int24, GXv_char12, GXv_char4, GXv_char3, GXv_int18, GXv_decimal15, GXv_decimal13, GXv_date22, GXv_int8, GXv_char2, GXv_char31) ;
         entradaproducto_trn_impl.this.A396EmprCod = GXv_char30[0] ;
         entradaproducto_trn_impl.this.A719PrdNum = GXv_char27[0] ;
         entradaproducto_trn_impl.this.A418EntUniEnt = GXv_decimal28[0] ;
         entradaproducto_trn_impl.this.AV22PedPri = GXv_char25[0] ;
         entradaproducto_trn_impl.this.A417EntPre = GXv_decimal16[0] ;
         entradaproducto_trn_impl.this.A658PedCod = GXv_int24[0] ;
         entradaproducto_trn_impl.this.A11Albaran = GXv_char12[0] ;
         entradaproducto_trn_impl.this.AV26UsurCod = GXv_char4[0] ;
         entradaproducto_trn_impl.this.A597LinEnt = GXv_int18[0] ;
         entradaproducto_trn_impl.this.AV40UniOld = GXv_decimal15[0] ;
         entradaproducto_trn_impl.this.A415EntFecEnt = GXv_date22[0] ;
         entradaproducto_trn_impl.this.A6156EntPrvNum = GXv_int8[0] ;
         entradaproducto_trn_impl.this.A5686EntLotN = GXv_char2[0] ;
         entradaproducto_trn_impl.this.A12857EntNAlbar = GXv_char31[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         httpContext.ajax_rsp_assign_attri("", false, "A418EntUniEnt", GXutil.ltrimstr( A418EntUniEnt, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "AV22PedPri", AV22PedPri);
         httpContext.ajax_rsp_assign_attri("", false, "A417EntPre", GXutil.ltrimstr( A417EntPre, 14, 5));
         httpContext.ajax_rsp_assign_attri("", false, "A658PedCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A658PedCod), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A11Albaran", A11Albaran);
         httpContext.ajax_rsp_assign_attri("", false, "AV26UsurCod", AV26UsurCod);
         httpContext.ajax_rsp_assign_attri("", false, "A597LinEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A597LinEnt), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV40UniOld", GXutil.ltrimstr( AV40UniOld, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "A415EntFecEnt", localUtil.format(A415EntFecEnt, "99/99/99"));
         httpContext.ajax_rsp_assign_attri("", false, "A6156EntPrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6156EntPrvNum), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A5686EntLotN", A5686EntLotN);
         httpContext.ajax_rsp_assign_attri("", false, "A12857EntNAlbar", A12857EntNAlbar);
      }
   }

   public void beforeInsert1SK42( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1SK42( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1SK42( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1SK42( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1SK42( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1SK42( )
   {
      edtPrdNum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNum_Enabled), 5, 0), true);
      edtPrdNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNom_Enabled), 5, 0), true);
      edtLinEnt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLinEnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLinEnt_Enabled), 5, 0), true);
      edtEntFecEnt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEntFecEnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEntFecEnt_Enabled), 5, 0), true);
      edtAlbaran_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbaran_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbaran_Enabled), 5, 0), true);
      edtEntNAlbar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEntNAlbar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEntNAlbar_Enabled), 5, 0), true);
      edtPedCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPedCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPedCod_Enabled), 5, 0), true);
      edtEntPrvNum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEntPrvNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEntPrvNum_Enabled), 5, 0), true);
      edtEntUniEnt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEntUniEnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEntUniEnt_Enabled), 5, 0), true);
      edtEntPre_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEntPre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEntPre_Enabled), 5, 0), true);
      edtEntLotN_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEntLotN_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEntLotN_Enabled), 5, 0), true);
      edtEntFVal_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEntFVal_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEntFVal_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      edtEntPedCum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEntPedCum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEntPedCum_Enabled), 5, 0), true);
      edtEntUniRem_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEntUniRem_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEntUniRem_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashes1SK42( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues1SK0( )
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
      httpContext.AddJavascriptSource("calendar.js", "?"+httpContext.getBuildNumber( 214800), false, true);
      httpContext.AddJavascriptSource("calendar-setup.js", "?"+httpContext.getBuildNumber( 214800), false, true);
      httpContext.AddJavascriptSource("calendar-"+GXutil.substring( httpContext.getLanguageProperty( "culture"), 1, 2)+".js", "?"+httpContext.getBuildNumber( 214800), false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.stocksquimicos.entradaproducto_trn", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV7EmprCod)),GXutil.URLEncode(GXutil.rtrim(AV8PrdNum)),GXutil.URLEncode(GXutil.ltrimstr(AV9LinEnt,4,0))}, new String[] {"Gx_mode","EmprCod","PrdNum","LinEnt"}) +"\">") ;
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
      forbiddenHiddens.add("hshsalt", "hsh"+"EntradaProducto_TRN");
      forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
      forbiddenHiddens.add("EntCon", localUtil.format( DecimalUtil.doubleToDec(A411EntCon), "9"));
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV45Pgmname, "")));
      forbiddenHiddens.add("EntNumCon", localUtil.format( DecimalUtil.doubleToDec(A416EntNumCon), "ZZ9"));
      forbiddenHiddens.add("EntEti", localUtil.format( DecimalUtil.doubleToDec(A414EntEti), "9"));
      forbiddenHiddens.add("EntConIni", localUtil.format( DecimalUtil.doubleToDec(A413EntConIni), "ZZZZZZZ9"));
      forbiddenHiddens.add("EntConFin", localUtil.format( DecimalUtil.doubleToDec(A412EntConFin), "ZZZZZZZ9"));
      forbiddenHiddens.add("EntBnc", GXutil.rtrim( localUtil.format( A5691EntBnc, "")));
      forbiddenHiddens.add("EntCC", GXutil.rtrim( localUtil.format( A7695EntCC, "")));
      forbiddenHiddens.add("EntCCoCod", localUtil.format( DecimalUtil.doubleToDec(A7696EntCCoCod), "ZZ9"));
      forbiddenHiddens.add("EntUniAlb", localUtil.format( A10782EntUniAlb, "ZZZZZ9.9999"));
      forbiddenHiddens.add("EntObs", GXutil.rtrim( localUtil.format( A10783EntObs, "")));
      forbiddenHiddens.add("EntRemNro", GXutil.rtrim( localUtil.format( A10187EntRemNro, "")));
      forbiddenHiddens.add("EntRemFch", localUtil.format(A10186EntRemFch, "99/99/99"));
      forbiddenHiddens.add("EntRemSuc", GXutil.rtrim( localUtil.format( A10185EntRemSuc, "")));
      forbiddenHiddens.add("EntRemTpo", GXutil.rtrim( localUtil.format( A10184EntRemTpo, "")));
      forbiddenHiddens.add("EntLoteID", localUtil.format( DecimalUtil.doubleToDec(A13235EntLoteID), "ZZZZZZZZZZZ9"));
      forbiddenHiddens.add("EntUbicaci", GXutil.rtrim( localUtil.format( A13456EntUbicaci, "")));
      forbiddenHiddens.add("EntHfCon", localUtil.format( A5690EntHfCon, "99:99"));
      forbiddenHiddens.add("EntFfCon", localUtil.format(A5689EntFfCon, "99/99/99"));
      forbiddenHiddens.add("EntHiCon", localUtil.format( A5688EntHiCon, "99:99"));
      forbiddenHiddens.add("EntFiCon", localUtil.format(A5687EntFiCon, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("stocksquimicos\\entradaproducto_trn:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z719PrdNum", GXutil.rtrim( Z719PrdNum));
      app.GxWebStd.gx_hidden_field( httpContext, "Z597LinEnt", GXutil.ltrim( localUtil.ntoc( Z597LinEnt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z411EntCon", GXutil.ltrim( localUtil.ntoc( Z411EntCon, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3404EntPedCum", GXutil.rtrim( Z3404EntPedCum));
      app.GxWebStd.gx_hidden_field( httpContext, "Z419EntUniRem", GXutil.ltrim( localUtil.ntoc( Z419EntUniRem, (byte)(11), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z417EntPre", GXutil.ltrim( localUtil.ntoc( Z417EntPre, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z415EntFecEnt", localUtil.dtoc( Z415EntFecEnt, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11Albaran", GXutil.rtrim( Z11Albaran));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12857EntNAlbar", GXutil.rtrim( Z12857EntNAlbar));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6156EntPrvNum", GXutil.ltrim( localUtil.ntoc( Z6156EntPrvNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z418EntUniEnt", GXutil.ltrim( localUtil.ntoc( Z418EntUniEnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z416EntNumCon", GXutil.ltrim( localUtil.ntoc( Z416EntNumCon, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5686EntLotN", GXutil.rtrim( Z5686EntLotN));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5685EntFVal", localUtil.dtoc( Z5685EntFVal, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z414EntEti", GXutil.ltrim( localUtil.ntoc( Z414EntEti, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z413EntConIni", GXutil.ltrim( localUtil.ntoc( Z413EntConIni, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z412EntConFin", GXutil.ltrim( localUtil.ntoc( Z412EntConFin, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5691EntBnc", GXutil.rtrim( Z5691EntBnc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7695EntCC", GXutil.rtrim( Z7695EntCC));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7696EntCCoCod", GXutil.ltrim( localUtil.ntoc( Z7696EntCCoCod, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10782EntUniAlb", GXutil.ltrim( localUtil.ntoc( Z10782EntUniAlb, (byte)(11), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10783EntObs", GXutil.rtrim( Z10783EntObs));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10187EntRemNro", GXutil.rtrim( Z10187EntRemNro));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10186EntRemFch", localUtil.dtoc( Z10186EntRemFch, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10185EntRemSuc", GXutil.rtrim( Z10185EntRemSuc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10184EntRemTpo", GXutil.rtrim( Z10184EntRemTpo));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12716EntFabId", GXutil.ltrim( localUtil.ntoc( Z12716EntFabId, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13235EntLoteID", GXutil.ltrim( localUtil.ntoc( Z13235EntLoteID, (byte)(12), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13456EntUbicaci", GXutil.rtrim( Z13456EntUbicaci));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5690EntHfCon", localUtil.ttoc( Z5690EntHfCon, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5689EntFfCon", localUtil.dtoc( Z5689EntFfCon, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5688EntHiCon", localUtil.ttoc( Z5688EntHiCon, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5687EntFiCon", localUtil.dtoc( Z5687EntFiCon, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z658PedCod", GXutil.ltrim( localUtil.ntoc( Z658PedCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z726PrdPreMed", GXutil.ltrim( localUtil.ntoc( Z726PrdPreMed, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z718PrdNom", GXutil.rtrim( Z718PrdNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z724PrdPreAct", GXutil.ltrim( localUtil.ntoc( Z724PrdPreAct, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z698PrdDetPar", GXutil.rtrim( Z698PrdDetPar));
      app.GxWebStd.gx_hidden_field( httpContext, "Z713PrdFulEnt", localUtil.dtoc( Z713PrdFulEnt, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z684PrdCanPen", GXutil.ltrim( localUtil.ntoc( Z684PrdCanPen, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z729PrdRotRea", GXutil.ltrim( localUtil.ntoc( Z729PrdRotRea, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z727PrdRec", GXutil.rtrim( Z727PrdRec));
      app.GxWebStd.gx_hidden_field( httpContext, "Z725PrdPreAnt", GXutil.ltrim( localUtil.ntoc( Z725PrdPreAnt, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z709PrdFecPre", localUtil.dtoc( Z709PrdFecPre, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5255PrdPreAc2", GXutil.ltrim( localUtil.ntoc( Z5255PrdPreAc2, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z705PrdExiCC", GXutil.ltrim( localUtil.ntoc( Z705PrdExiCC, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z795PrvNum", GXutil.ltrim( localUtil.ntoc( Z795PrvNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z856ValCod", GXutil.ltrim( localUtil.ntoc( Z856ValCod, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z665PedPre", GXutil.ltrim( localUtil.ntoc( Z665PedPre, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z669PedUni", GXutil.ltrim( localUtil.ntoc( Z669PedUni, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z663PedFulEnt", localUtil.dtoc( Z663PedFulEnt, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z659PedCum", GXutil.rtrim( Z659PedCum));
      app.GxWebStd.gx_hidden_field( httpContext, "Z660PedDto", GXutil.ltrim( localUtil.ntoc( Z660PedDto, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O750PrdValStk", GXutil.ltrim( localUtil.ntoc( O750PrdValStk, (byte)(11), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O419EntUniRem", GXutil.ltrim( localUtil.ntoc( O419EntUniRem, (byte)(11), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O418EntUniEnt", GXutil.ltrim( localUtil.ntoc( O418EntUniEnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O657PedCanEnt", GXutil.ltrim( localUtil.ntoc( O657PedCanEnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O704PrdExiAlm", GXutil.ltrim( localUtil.ntoc( O704PrdExiAlm, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O847UltLinEnt", GXutil.ltrim( localUtil.ntoc( O847UltLinEnt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O415EntFecEnt", localUtil.dtoc( O415EntFecEnt, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "O417EntPre", GXutil.ltrim( localUtil.ntoc( O417EntPre, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O5686EntLotN", GXutil.rtrim( O5686EntLotN));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_Mode", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "N658PedCod", GXutil.ltrim( localUtil.ntoc( A658PedCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "N415EntFecEnt", localUtil.dtoc( A415EntFecEnt, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "N11Albaran", GXutil.rtrim( A11Albaran));
      app.GxWebStd.gx_hidden_field( httpContext, "N12857EntNAlbar", GXutil.rtrim( A12857EntNAlbar));
      app.GxWebStd.gx_hidden_field( httpContext, "N6156EntPrvNum", GXutil.ltrim( localUtil.ntoc( A6156EntPrvNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "N418EntUniEnt", GXutil.ltrim( localUtil.ntoc( A418EntUniEnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "N5686EntLotN", GXutil.rtrim( A5686EntLotN));
      app.GxWebStd.gx_hidden_field( httpContext, "N417EntPre", GXutil.ltrim( localUtil.ntoc( A417EntPre, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "N5685EntFVal", localUtil.dtoc( A5685EntFVal, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "N3404EntPedCum", GXutil.rtrim( A3404EntPedCum));
      app.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDULTMOVF", localUtil.dtoc( A14040PrdUltMovF, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "ULTFECCCS", localUtil.dtoc( A3835UltFecCCs, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV7EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV7EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vPRDNUM", GXutil.rtrim( AV8PrdNum));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPRDNUM", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV8PrdNum, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vLINENT", GXutil.ltrim( localUtil.ntoc( AV9LinEnt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vLINENT", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV9LinEnt), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "ULTLINENT", GXutil.ltrim( localUtil.ntoc( A847UltLinEnt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGXBSCREEN", GXutil.ltrim( localUtil.ntoc( Gx_BScreen, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vINSERT_PEDCOD", GXutil.ltrim( localUtil.ntoc( AV13Insert_PedCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vYEAR", GXutil.ltrim( localUtil.ntoc( AV32Year, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMES", GXutil.ltrim( localUtil.ntoc( AV34Mes, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PRVPRI", GXutil.ltrim( localUtil.ntoc( A800PrvPri, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PEDPRI", GXutil.rtrim( A666PedPri));
      app.GxWebStd.gx_hidden_field( httpContext, "vPEDPRI", GXutil.rtrim( AV22PedPri));
      app.GxWebStd.gx_hidden_field( httpContext, "vOLDENTPRE", GXutil.ltrim( localUtil.ntoc( AV23OldEntPre, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDEXIALM", GXutil.ltrim( localUtil.ntoc( A704PrdExiAlm, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vOLDEXIALM", GXutil.ltrim( localUtil.ntoc( AV35OldExiAlm, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vOLDENTUNI", GXutil.ltrim( localUtil.ntoc( AV36OldEntUni, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vOLDREMANENTE", GXutil.ltrim( localUtil.ntoc( AV37OldRemanente, (byte)(11), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vOLDENTFECENT", localUtil.dtoc( AV24oldEntFecent, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "vOLDLOTE", GXutil.rtrim( AV38oldlote));
      app.GxWebStd.gx_hidden_field( httpContext, "vUNIOLD", GXutil.ltrim( localUtil.ntoc( AV40UniOld, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vFECANT", localUtil.dtoc( AV39FecAnt, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "vPRECANT", GXutil.ltrim( localUtil.ntoc( AV41PrecAnt, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vANYANT", GXutil.ltrim( localUtil.ntoc( AV42AnyAnt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMESANT", GXutil.ltrim( localUtil.ntoc( AV43MesAnt, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ENTCON", GXutil.ltrim( localUtil.ntoc( A411EntCon, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PEDCANENT", GXutil.ltrim( localUtil.ntoc( A657PedCanEnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PEDPRE", GXutil.ltrim( localUtil.ntoc( A665PedPre, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PEDDTO", GXutil.ltrim( localUtil.ntoc( A660PedDto, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDVALSTK", GXutil.ltrim( localUtil.ntoc( A750PrdValStk, (byte)(11), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vCONSUMOS", GXutil.ltrim( localUtil.ntoc( AV30Consumos, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDEXICC", GXutil.ltrim( localUtil.ntoc( A705PrdExiCC, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDPREMED", GXutil.ltrim( localUtil.ntoc( A726PrdPreMed, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vFECHA", localUtil.dtoc( AV21Fecha, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "ENTFABID", GXutil.ltrim( localUtil.ntoc( A12716EntFabId, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PRVNUM", GXutil.ltrim( localUtil.ntoc( A795PrvNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ENTREMTPO", GXutil.rtrim( A10184EntRemTpo));
      app.GxWebStd.gx_hidden_field( httpContext, "vINC_OBS", AV25Inc_obs);
      app.GxWebStd.gx_hidden_field( httpContext, "vDIASFIN", GXutil.ltrim( localUtil.ntoc( AV33DiasFin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PEDNUMLIN", GXutil.ltrim( localUtil.ntoc( A664PedNumLin, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vUSURCOD", GXutil.rtrim( AV26UsurCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vSTATION", GXutil.rtrim( AV27Station));
      app.GxWebStd.gx_hidden_field( httpContext, "vNALBARAN20", GXutil.ltrim( localUtil.ntoc( AV31Nalbaran20, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRNOM", GXutil.rtrim( A407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPNUMDEC", GXutil.ltrim( localUtil.ntoc( A3915EmpNumDec, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDPREACT", GXutil.ltrim( localUtil.ntoc( A724PrdPreAct, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDDETPAR", GXutil.rtrim( A698PrdDetPar));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDFULENT", localUtil.dtoc( A713PrdFulEnt, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDCANPEN", GXutil.ltrim( localUtil.ntoc( A684PrdCanPen, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDROTREA", GXutil.ltrim( localUtil.ntoc( A729PrdRotRea, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDREC", GXutil.rtrim( A727PrdRec));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDPREANT", GXutil.ltrim( localUtil.ntoc( A725PrdPreAnt, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDFECPRE", localUtil.dtoc( A709PrdFecPre, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDPREAC2", GXutil.ltrim( localUtil.ntoc( A5255PrdPreAc2, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "VALCOD", GXutil.ltrim( localUtil.ntoc( A856ValCod, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PEDFEC", localUtil.dtoc( A661PedFec, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "PEDSIT", GXutil.rtrim( A667PedSit));
      app.GxWebStd.gx_hidden_field( httpContext, "PEDALMC", GXutil.ltrim( localUtil.ntoc( A12580PedAlmc, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PEDUNI", GXutil.ltrim( localUtil.ntoc( A669PedUni, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PEDFULENT", localUtil.dtoc( A663PedFulEnt, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "PEDCUM", GXutil.rtrim( A659PedCum));
      app.GxWebStd.gx_hidden_field( httpContext, "PRVNOM", GXutil.rtrim( A794PrvNom));
      app.GxWebStd.gx_hidden_field( httpContext, "STOCKREM", GXutil.ltrim( localUtil.ntoc( A913StockRem, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE2_Objectcall", GXutil.rtrim( Dvpanel_unnamedtable2_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE2_Enabled", GXutil.booltostr( Dvpanel_unnamedtable2_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE2_Width", GXutil.rtrim( Dvpanel_unnamedtable2_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE2_Autowidth", GXutil.booltostr( Dvpanel_unnamedtable2_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE2_Autoheight", GXutil.booltostr( Dvpanel_unnamedtable2_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE2_Cls", GXutil.rtrim( Dvpanel_unnamedtable2_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE2_Title", GXutil.rtrim( Dvpanel_unnamedtable2_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE2_Collapsible", GXutil.booltostr( Dvpanel_unnamedtable2_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE2_Collapsed", GXutil.booltostr( Dvpanel_unnamedtable2_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE2_Showcollapseicon", GXutil.booltostr( Dvpanel_unnamedtable2_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE2_Iconposition", GXutil.rtrim( Dvpanel_unnamedtable2_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE2_Autoscroll", GXutil.booltostr( Dvpanel_unnamedtable2_Autoscroll));
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
      return formatLink("app.stocksquimicos.entradaproducto_trn", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV7EmprCod)),GXutil.URLEncode(GXutil.rtrim(AV8PrdNum)),GXutil.URLEncode(GXutil.ltrimstr(AV9LinEnt,4,0))}, new String[] {"Gx_mode","EmprCod","PrdNum","LinEnt"})  ;
   }

   public String getPgmname( )
   {
      return "StocksQuimicos.EntradaProducto_TRN" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Entrada Producto (linea)", "") ;
   }

   public void initializeNonKey1SK42( )
   {
      A658PedCod = 0 ;
      n658PedCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A658PedCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A658PedCod), 8, 0));
      AV32Year = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32Year", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV32Year), 4, 0));
      AV34Mes = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV34Mes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34Mes), 4, 0));
      AV22PedPri = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV22PedPri", AV22PedPri);
      AV23OldEntPre = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV23OldEntPre", GXutil.ltrimstr( AV23OldEntPre, 14, 5));
      AV35OldExiAlm = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV35OldExiAlm", GXutil.ltrimstr( AV35OldExiAlm, 12, 4));
      AV36OldEntUni = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV36OldEntUni", GXutil.ltrimstr( AV36OldEntUni, 9, 2));
      AV37OldRemanente = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV37OldRemanente", GXutil.ltrimstr( AV37OldRemanente, 11, 4));
      AV24oldEntFecent = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV24oldEntFecent", localUtil.format(AV24oldEntFecent, "99/99/99"));
      AV38oldlote = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV38oldlote", AV38oldlote);
      AV40UniOld = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV40UniOld", GXutil.ltrimstr( AV40UniOld, 9, 2));
      AV39FecAnt = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV39FecAnt", localUtil.format(AV39FecAnt, "99/99/99"));
      AV41PrecAnt = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV41PrecAnt", GXutil.ltrimstr( AV41PrecAnt, 14, 5));
      AV42AnyAnt = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV42AnyAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV42AnyAnt), 4, 0));
      AV43MesAnt = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV43MesAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV43MesAnt), 2, 0));
      A847UltLinEnt = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A847UltLinEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A847UltLinEnt), 4, 0));
      A704PrdExiAlm = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A704PrdExiAlm", GXutil.ltrimstr( A704PrdExiAlm, 12, 4));
      A657PedCanEnt = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A657PedCanEnt", GXutil.ltrimstr( A657PedCanEnt, 9, 2));
      A419EntUniRem = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A419EntUniRem", GXutil.ltrimstr( A419EntUniRem, 11, 4));
      A417EntPre = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A417EntPre", GXutil.ltrimstr( A417EntPre, 14, 5));
      A726PrdPreMed = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A726PrdPreMed", GXutil.ltrimstr( A726PrdPreMed, 14, 5));
      A750PrdValStk = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A750PrdValStk", GXutil.ltrimstr( A750PrdValStk, 11, 2));
      A664PedNumLin = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A664PedNumLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A664PedNumLin), 3, 0));
      A913StockRem = DecimalUtil.ZERO ;
      n913StockRem = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A913StockRem", GXutil.ltrimstr( A913StockRem, 12, 4));
      A3835UltFecCCs = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "A3835UltFecCCs", localUtil.format(A3835UltFecCCs, "99/99/99"));
      A14040PrdUltMovF = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "A14040PrdUltMovF", localUtil.format(A14040PrdUltMovF, "99/99/99"));
      A718PrdNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A718PrdNom", A718PrdNom);
      A795PrvNum = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A795PrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A795PrvNum), 6, 0));
      A794PrvNom = "" ;
      n794PrvNom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A794PrvNom", A794PrvNom);
      A724PrdPreAct = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A724PrdPreAct", GXutil.ltrimstr( A724PrdPreAct, 14, 5));
      A698PrdDetPar = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A698PrdDetPar", A698PrdDetPar);
      A856ValCod = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A856ValCod", GXutil.str( A856ValCod, 1, 0));
      A713PrdFulEnt = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "A713PrdFulEnt", localUtil.format(A713PrdFulEnt, "99/99/99"));
      A684PrdCanPen = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A684PrdCanPen", GXutil.ltrimstr( A684PrdCanPen, 12, 4));
      A729PrdRotRea = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A729PrdRotRea", GXutil.ltrimstr( A729PrdRotRea, 12, 5));
      A727PrdRec = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A727PrdRec", A727PrdRec);
      A725PrdPreAnt = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A725PrdPreAnt", GXutil.ltrimstr( A725PrdPreAnt, 14, 5));
      A709PrdFecPre = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "A709PrdFecPre", localUtil.format(A709PrdFecPre, "99/99/99"));
      A800PrvPri = (byte)(0) ;
      n800PrvPri = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A800PrvPri", GXutil.str( A800PrvPri, 1, 0));
      A5255PrdPreAc2 = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A5255PrdPreAc2", GXutil.ltrimstr( A5255PrdPreAc2, 14, 5));
      A705PrdExiCC = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A705PrdExiCC", GXutil.ltrimstr( A705PrdExiCC, 12, 4));
      A11Albaran = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A11Albaran", A11Albaran);
      A12857EntNAlbar = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A12857EntNAlbar", A12857EntNAlbar);
      A661PedFec = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "A661PedFec", localUtil.format(A661PedFec, "99/99/99"));
      A418EntUniEnt = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A418EntUniEnt", GXutil.ltrimstr( A418EntUniEnt, 9, 2));
      A665PedPre = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A665PedPre", GXutil.ltrimstr( A665PedPre, 14, 5));
      A669PedUni = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A669PedUni", GXutil.ltrimstr( A669PedUni, 9, 2));
      A416EntNumCon = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A416EntNumCon", GXutil.ltrimstr( DecimalUtil.doubleToDec(A416EntNumCon), 3, 0));
      A5686EntLotN = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A5686EntLotN", A5686EntLotN);
      A5685EntFVal = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "A5685EntFVal", localUtil.format(A5685EntFVal, "99/99/99"));
      A414EntEti = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A414EntEti", GXutil.str( A414EntEti, 1, 0));
      A413EntConIni = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A413EntConIni", GXutil.ltrimstr( DecimalUtil.doubleToDec(A413EntConIni), 8, 0));
      A412EntConFin = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A412EntConFin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A412EntConFin), 8, 0));
      A663PedFulEnt = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "A663PedFulEnt", localUtil.format(A663PedFulEnt, "99/99/99"));
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
      AV21Fecha = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21Fecha", localUtil.format(AV21Fecha, "99/99/99"));
      AV25Inc_obs = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV25Inc_obs", AV25Inc_obs);
      AV33DiasFin = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV33DiasFin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV33DiasFin), 4, 0));
      A3404EntPedCum = httpContext.getMessage( "N", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "A3404EntPedCum", A3404EntPedCum);
      A415EntFecEnt = GXutil.today( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "A415EntFecEnt", localUtil.format(A415EntFecEnt, "99/99/99"));
      A6156EntPrvNum = 0 ;
      n6156EntPrvNum = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6156EntPrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6156EntPrvNum), 6, 0));
      A10184EntRemTpo = " " ;
      httpContext.ajax_rsp_assign_attri("", false, "A10184EntRemTpo", A10184EntRemTpo);
      A12716EntFabId = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A12716EntFabId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12716EntFabId), 6, 0));
      O750PrdValStk = A750PrdValStk ;
      httpContext.ajax_rsp_assign_attri("", false, "A750PrdValStk", GXutil.ltrimstr( A750PrdValStk, 11, 2));
      O419EntUniRem = A419EntUniRem ;
      httpContext.ajax_rsp_assign_attri("", false, "A419EntUniRem", GXutil.ltrimstr( A419EntUniRem, 11, 4));
      O418EntUniEnt = A418EntUniEnt ;
      httpContext.ajax_rsp_assign_attri("", false, "A418EntUniEnt", GXutil.ltrimstr( A418EntUniEnt, 9, 2));
      O657PedCanEnt = A657PedCanEnt ;
      httpContext.ajax_rsp_assign_attri("", false, "A657PedCanEnt", GXutil.ltrimstr( A657PedCanEnt, 9, 2));
      O704PrdExiAlm = A704PrdExiAlm ;
      httpContext.ajax_rsp_assign_attri("", false, "A704PrdExiAlm", GXutil.ltrimstr( A704PrdExiAlm, 12, 4));
      O847UltLinEnt = A847UltLinEnt ;
      httpContext.ajax_rsp_assign_attri("", false, "A847UltLinEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A847UltLinEnt), 4, 0));
      O415EntFecEnt = A415EntFecEnt ;
      httpContext.ajax_rsp_assign_attri("", false, "A415EntFecEnt", localUtil.format(A415EntFecEnt, "99/99/99"));
      O417EntPre = A417EntPre ;
      httpContext.ajax_rsp_assign_attri("", false, "A417EntPre", GXutil.ltrimstr( A417EntPre, 14, 5));
      O5686EntLotN = A5686EntLotN ;
      httpContext.ajax_rsp_assign_attri("", false, "A5686EntLotN", A5686EntLotN);
      Z411EntCon = (byte)(0) ;
      Z3404EntPedCum = "" ;
      Z419EntUniRem = DecimalUtil.ZERO ;
      Z417EntPre = DecimalUtil.ZERO ;
      Z415EntFecEnt = GXutil.nullDate() ;
      Z11Albaran = "" ;
      Z12857EntNAlbar = "" ;
      Z6156EntPrvNum = 0 ;
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
      Z10184EntRemTpo = "" ;
      Z12716EntFabId = 0 ;
      Z13235EntLoteID = 0 ;
      Z13456EntUbicaci = "" ;
      Z5690EntHfCon = GXutil.resetTime( GXutil.nullDate() );
      Z5689EntFfCon = GXutil.nullDate() ;
      Z5688EntHiCon = GXutil.resetTime( GXutil.nullDate() );
      Z5687EntFiCon = GXutil.nullDate() ;
      Z658PedCod = 0 ;
      Z726PrdPreMed = DecimalUtil.ZERO ;
      Z718PrdNom = "" ;
      Z724PrdPreAct = DecimalUtil.ZERO ;
      Z698PrdDetPar = "" ;
      Z713PrdFulEnt = GXutil.nullDate() ;
      Z684PrdCanPen = DecimalUtil.ZERO ;
      Z729PrdRotRea = DecimalUtil.ZERO ;
      Z727PrdRec = "" ;
      Z725PrdPreAnt = DecimalUtil.ZERO ;
      Z709PrdFecPre = GXutil.nullDate() ;
      Z5255PrdPreAc2 = DecimalUtil.ZERO ;
      Z705PrdExiCC = DecimalUtil.ZERO ;
      Z795PrvNum = 0 ;
      Z856ValCod = (byte)(0) ;
      Z665PedPre = DecimalUtil.ZERO ;
      Z669PedUni = DecimalUtil.ZERO ;
      Z663PedFulEnt = GXutil.nullDate() ;
      Z659PedCum = "" ;
      Z660PedDto = DecimalUtil.ZERO ;
   }

   public void initAll1SK42( )
   {
      A719PrdNum = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
      A597LinEnt = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A597LinEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A597LinEnt), 4, 0));
      initializeNonKey1SK42( ) ;
   }

   public void standaloneModalInsert( )
   {
      A411EntCon = i411EntCon ;
      httpContext.ajax_rsp_assign_attri("", false, "A411EntCon", GXutil.str( A411EntCon, 1, 0));
      A415EntFecEnt = i415EntFecEnt ;
      httpContext.ajax_rsp_assign_attri("", false, "A415EntFecEnt", localUtil.format(A415EntFecEnt, "99/99/99"));
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?2026821169422", true, true);
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
      httpContext.AddJavascriptSource("stocksquimicos/entradaproducto_trn.js", "?2026821169422", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      edtPrdNum_Internalname = "PRDNUM" ;
      edtPrdNom_Internalname = "PRDNOM" ;
      divTableattributes_Internalname = "TABLEATTRIBUTES" ;
      Dvpanel_tableattributes_Internalname = "DVPANEL_TABLEATTRIBUTES" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      edtLinEnt_Internalname = "LINENT" ;
      edtEntFecEnt_Internalname = "ENTFECENT" ;
      edtAlbaran_Internalname = "ALBARAN" ;
      divAlbaran_cell_Internalname = "ALBARAN_CELL" ;
      edtEntNAlbar_Internalname = "ENTNALBAR" ;
      divEntnalbar_cell_Internalname = "ENTNALBAR_CELL" ;
      edtPedCod_Internalname = "PEDCOD" ;
      edtEntPrvNum_Internalname = "ENTPRVNUM" ;
      divUnnamedtable3_Internalname = "UNNAMEDTABLE3" ;
      edtEntUniEnt_Internalname = "ENTUNIENT" ;
      edtEntPre_Internalname = "ENTPRE" ;
      edtEntLotN_Internalname = "ENTLOTN" ;
      edtEntFVal_Internalname = "ENTFVAL" ;
      divUnnamedtable4_Internalname = "UNNAMEDTABLE4" ;
      divUnnamedtable5_Internalname = "UNNAMEDTABLE5" ;
      divUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
      Dvpanel_unnamedtable2_Internalname = "DVPANEL_UNNAMEDTABLE2" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      bttBtntrn_enter_Internalname = "BTNTRN_ENTER" ;
      bttBtntrn_cancel_Internalname = "BTNTRN_CANCEL" ;
      bttBtntrn_delete_Internalname = "BTNTRN_DELETE" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      edtEntPedCum_Internalname = "ENTPEDCUM" ;
      edtEntUniRem_Internalname = "ENTUNIREM" ;
      divHtml_bottomauxiliarcontrols_Internalname = "HTML_BOTTOMAUXILIARCONTROLS" ;
      divLayoutmaintable_Internalname = "LAYOUTMAINTABLE" ;
      Form.setInternalname( "FORM" );
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
      Form.setCaption( httpContext.getMessage( "Entrada Producto (linea)", "") );
      edtEntUniRem_Jsonclick = "" ;
      edtEntUniRem_Enabled = 0 ;
      edtEntUniRem_Visible = 1 ;
      edtEntPedCum_Jsonclick = "" ;
      edtEntPedCum_Enabled = 1 ;
      edtEntPedCum_Visible = 1 ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      bttBtntrn_delete_Enabled = 0 ;
      bttBtntrn_delete_Visible = 1 ;
      bttBtntrn_cancel_Visible = 1 ;
      bttBtntrn_enter_Enabled = 1 ;
      bttBtntrn_enter_Visible = 1 ;
      edtEntFVal_Jsonclick = "" ;
      edtEntFVal_Enabled = 1 ;
      edtEntLotN_Jsonclick = "" ;
      edtEntLotN_Enabled = 1 ;
      edtEntPre_Jsonclick = "" ;
      edtEntPre_Enabled = 1 ;
      edtEntUniEnt_Jsonclick = "" ;
      edtEntUniEnt_Enabled = 1 ;
      edtEntPrvNum_Jsonclick = "" ;
      edtEntPrvNum_Enabled = 1 ;
      edtPedCod_Jsonclick = "" ;
      edtPedCod_Enabled = 1 ;
      edtEntNAlbar_Jsonclick = "" ;
      edtEntNAlbar_Enabled = 1 ;
      edtEntNAlbar_Visible = 1 ;
      divEntnalbar_cell_Class = "col-xs-12 col-sm-2" ;
      edtAlbaran_Jsonclick = "" ;
      edtAlbaran_Enabled = 1 ;
      edtAlbaran_Visible = 1 ;
      divAlbaran_cell_Class = "col-xs-12 col-sm-2" ;
      edtEntFecEnt_Jsonclick = "" ;
      edtEntFecEnt_Enabled = 1 ;
      edtLinEnt_Jsonclick = "" ;
      edtLinEnt_Enabled = 1 ;
      Dvpanel_unnamedtable2_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Iconposition = "Right" ;
      Dvpanel_unnamedtable2_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable2_Title = httpContext.getMessage( "Linea", "") ;
      Dvpanel_unnamedtable2_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable2_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable2_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Width = "100%" ;
      edtPrdNom_Jsonclick = "" ;
      edtPrdNom_Enabled = 0 ;
      edtPrdNum_Jsonclick = "" ;
      edtPrdNum_Enabled = 1 ;
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

   public void gx4asaprdultmovf1SK42( String A396EmprCod ,
                                      String A719PrdNum )
   {
      GXt_date10 = A14040PrdUltMovF ;
      GXv_char31[0] = A396EmprCod ;
      GXv_char30[0] = A719PrdNum ;
      GXv_date22[0] = GXt_date10 ;
      new app.pstm005(remoteHandle, context).execute( GXv_char31, GXv_char30, GXv_date22) ;
      entradaproducto_trn_impl.this.A396EmprCod = GXv_char31[0] ;
      entradaproducto_trn_impl.this.A719PrdNum = GXv_char30[0] ;
      entradaproducto_trn_impl.this.GXt_date10 = GXv_date22[0] ;
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

   public void gx5asaultfecccs1SK42( String A396EmprCod ,
                                     String A719PrdNum )
   {
      GXt_date10 = A3835UltFecCCs ;
      GXv_char31[0] = A396EmprCod ;
      GXv_char30[0] = A719PrdNum ;
      GXv_date22[0] = GXt_date10 ;
      new app.pstm005(remoteHandle, context).execute( GXv_char31, GXv_char30, GXv_date22) ;
      entradaproducto_trn_impl.this.A396EmprCod = GXv_char31[0] ;
      entradaproducto_trn_impl.this.A719PrdNum = GXv_char30[0] ;
      entradaproducto_trn_impl.this.GXt_date10 = GXv_date22[0] ;
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

   public void gxasa111SK42( String A396EmprCod )
   {
      GXt_int5 = (byte)(0) ;
      GXv_int20[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "ALBA20", ""), ""), GXv_int20) ;
      entradaproducto_trn_impl.this.GXt_int5 = GXv_int20[0] ;
      edtAlbaran_Visible = ((GXt_int5==0) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbaran_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbaran_Visible), 5, 0), true);
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

   public void gxasa128571SK42( String A396EmprCod )
   {
      GXt_int5 = (byte)(0) ;
      GXv_int20[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "ALBA20", ""), ""), GXv_int20) ;
      entradaproducto_trn_impl.this.GXt_int5 = GXv_int20[0] ;
      edtEntNAlbar_Visible = ((GXt_int5==1) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtEntNAlbar_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEntNAlbar_Visible), 5, 0), true);
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

   public void gx58asapednumlin1SK42( String A396EmprCod ,
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

   public void xc_73_1SK42( String A396EmprCod ,
                            String AV45Pgmname ,
                            String AV26UsurCod ,
                            String AV27Station ,
                            String AV25Inc_obs )
   {
      if ( true /* After */ )
      {
         new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV45Pgmname, AV26UsurCod, AV27Station, AV25Inc_obs, 99999999, (byte)(0), " ") ;
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

   public void xc_74_1SK42( String A396EmprCod ,
                            String AV45Pgmname ,
                            String AV26UsurCod ,
                            String AV27Station ,
                            String AV25Inc_obs )
   {
      if ( true /* After */ || true /* After */ )
      {
         new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV45Pgmname, AV26UsurCod, AV27Station, AV25Inc_obs, 99999999, (byte)(0), " ") ;
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

   public void xc_75_1SK42( )
   {
      if ( isIns( )  && true /* After */ )
      {
         GXv_char31[0] = A396EmprCod ;
         GXv_int29[0] = A6156EntPrvNum ;
         GXv_int18[0] = AV32Year ;
         GXv_int20[0] = (byte)(AV34Mes) ;
         GXv_decimal28[0] = A418EntUniEnt ;
         GXv_decimal21[0] = AV40UniOld ;
         GXv_decimal16[0] = A417EntPre ;
         GXv_char30[0] = AV22PedPri ;
         GXv_int17[0] = AV32Year ;
         GXv_int14[0] = AV42AnyAnt ;
         GXv_int19[0] = (byte)(AV34Mes) ;
         GXv_int6[0] = AV43MesAnt ;
         GXv_decimal15[0] = AV41PrecAnt ;
         GXv_date22[0] = A415EntFecEnt ;
         GXv_date11[0] = AV39FecAnt ;
         GXv_char27[0] = httpContext.getMessage( "INS", "") ;
         new app.pprdes2(remoteHandle, context).execute( GXv_char31, GXv_int29, GXv_int18, GXv_int20, GXv_decimal28, GXv_decimal21, GXv_decimal16, GXv_char30, GXv_int17, GXv_int14, GXv_int19, GXv_int6, GXv_decimal15, GXv_date22, GXv_date11, GXv_char27) ;
         A396EmprCod = GXv_char31[0] ;
         A6156EntPrvNum = GXv_int29[0] ;
         AV32Year = GXv_int18[0] ;
         AV34Mes = GXv_int20[0] ;
         A418EntUniEnt = GXv_decimal28[0] ;
         AV40UniOld = GXv_decimal21[0] ;
         A417EntPre = GXv_decimal16[0] ;
         AV22PedPri = GXv_char30[0] ;
         AV32Year = GXv_int17[0] ;
         AV42AnyAnt = GXv_int14[0] ;
         AV34Mes = GXv_int19[0] ;
         AV43MesAnt = GXv_int6[0] ;
         AV41PrecAnt = GXv_decimal15[0] ;
         A415EntFecEnt = GXv_date22[0] ;
         AV39FecAnt = GXv_date11[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A6156EntPrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6156EntPrvNum), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV32Year", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV32Year), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV34Mes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34Mes), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A418EntUniEnt", GXutil.ltrimstr( A418EntUniEnt, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "AV40UniOld", GXutil.ltrimstr( AV40UniOld, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "A417EntPre", GXutil.ltrimstr( A417EntPre, 14, 5));
         httpContext.ajax_rsp_assign_attri("", false, "AV22PedPri", AV22PedPri);
         httpContext.ajax_rsp_assign_attri("", false, "AV32Year", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV32Year), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV42AnyAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV42AnyAnt), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV34Mes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34Mes), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV43MesAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV43MesAnt), 2, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV41PrecAnt", GXutil.ltrimstr( AV41PrecAnt, 14, 5));
         httpContext.ajax_rsp_assign_attri("", false, "A415EntFecEnt", localUtil.format(A415EntFecEnt, "99/99/99"));
         httpContext.ajax_rsp_assign_attri("", false, "AV39FecAnt", localUtil.format(AV39FecAnt, "99/99/99"));
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

   public void xc_76_1SK42( )
   {
      if ( ( ( ( DecimalUtil.compareTo(A418EntUniEnt, AV40UniOld) != 0 ) ) || ( !( GXutil.dateCompare(GXutil.resetTime(A415EntFecEnt), GXutil.resetTime(AV39FecAnt)) ) ) || ( ( DecimalUtil.compareTo(A417EntPre, AV41PrecAnt) != 0 ) ) ) && isUpd( )  && true /* After */ )
      {
         GXv_char31[0] = A396EmprCod ;
         GXv_int29[0] = A6156EntPrvNum ;
         GXv_int18[0] = AV32Year ;
         GXv_int20[0] = (byte)(AV34Mes) ;
         GXv_decimal28[0] = A418EntUniEnt ;
         GXv_decimal21[0] = AV40UniOld ;
         GXv_decimal16[0] = A417EntPre ;
         GXv_char30[0] = AV22PedPri ;
         GXv_int17[0] = AV32Year ;
         GXv_int14[0] = AV42AnyAnt ;
         GXv_int19[0] = (byte)(AV34Mes) ;
         GXv_int6[0] = AV43MesAnt ;
         GXv_decimal15[0] = AV41PrecAnt ;
         GXv_date22[0] = A415EntFecEnt ;
         GXv_date11[0] = AV39FecAnt ;
         GXv_char27[0] = httpContext.getMessage( "UPD", "") ;
         new app.pprdes2(remoteHandle, context).execute( GXv_char31, GXv_int29, GXv_int18, GXv_int20, GXv_decimal28, GXv_decimal21, GXv_decimal16, GXv_char30, GXv_int17, GXv_int14, GXv_int19, GXv_int6, GXv_decimal15, GXv_date22, GXv_date11, GXv_char27) ;
         A396EmprCod = GXv_char31[0] ;
         A6156EntPrvNum = GXv_int29[0] ;
         AV32Year = GXv_int18[0] ;
         AV34Mes = GXv_int20[0] ;
         A418EntUniEnt = GXv_decimal28[0] ;
         AV40UniOld = GXv_decimal21[0] ;
         A417EntPre = GXv_decimal16[0] ;
         AV22PedPri = GXv_char30[0] ;
         AV32Year = GXv_int17[0] ;
         AV42AnyAnt = GXv_int14[0] ;
         AV34Mes = GXv_int19[0] ;
         AV43MesAnt = GXv_int6[0] ;
         AV41PrecAnt = GXv_decimal15[0] ;
         A415EntFecEnt = GXv_date22[0] ;
         AV39FecAnt = GXv_date11[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A6156EntPrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6156EntPrvNum), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV32Year", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV32Year), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV34Mes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34Mes), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A418EntUniEnt", GXutil.ltrimstr( A418EntUniEnt, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "AV40UniOld", GXutil.ltrimstr( AV40UniOld, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "A417EntPre", GXutil.ltrimstr( A417EntPre, 14, 5));
         httpContext.ajax_rsp_assign_attri("", false, "AV22PedPri", AV22PedPri);
         httpContext.ajax_rsp_assign_attri("", false, "AV32Year", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV32Year), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV42AnyAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV42AnyAnt), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV34Mes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34Mes), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV43MesAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV43MesAnt), 2, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV41PrecAnt", GXutil.ltrimstr( AV41PrecAnt, 14, 5));
         httpContext.ajax_rsp_assign_attri("", false, "A415EntFecEnt", localUtil.format(A415EntFecEnt, "99/99/99"));
         httpContext.ajax_rsp_assign_attri("", false, "AV39FecAnt", localUtil.format(AV39FecAnt, "99/99/99"));
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

   public void xc_77_1SK42( )
   {
      if ( isIns( )  && true /* After */ )
      {
         GXv_char31[0] = A396EmprCod ;
         GXv_int29[0] = A6156EntPrvNum ;
         GXv_char30[0] = A719PrdNum ;
         GXv_char27[0] = A718PrdNom ;
         GXv_int18[0] = AV32Year ;
         GXv_int20[0] = (byte)(AV34Mes) ;
         GXv_decimal28[0] = A418EntUniEnt ;
         GXv_decimal21[0] = AV40UniOld ;
         GXv_decimal16[0] = A417EntPre ;
         GXv_char26[0] = AV22PedPri ;
         GXv_int17[0] = AV32Year ;
         GXv_int14[0] = AV42AnyAnt ;
         GXv_int19[0] = (byte)(AV34Mes) ;
         GXv_int6[0] = AV43MesAnt ;
         GXv_decimal15[0] = AV41PrecAnt ;
         GXv_date22[0] = A415EntFecEnt ;
         GXv_date11[0] = AV39FecAnt ;
         GXv_char25[0] = httpContext.getMessage( "INS", "") ;
         new app.pprdes3(remoteHandle, context).execute( GXv_char31, GXv_int29, GXv_char30, GXv_char27, GXv_int18, GXv_int20, GXv_decimal28, GXv_decimal21, GXv_decimal16, GXv_char26, GXv_int17, GXv_int14, GXv_int19, GXv_int6, GXv_decimal15, GXv_date22, GXv_date11, GXv_char25) ;
         A396EmprCod = GXv_char31[0] ;
         A6156EntPrvNum = GXv_int29[0] ;
         A719PrdNum = GXv_char30[0] ;
         A718PrdNom = GXv_char27[0] ;
         AV32Year = GXv_int18[0] ;
         AV34Mes = GXv_int20[0] ;
         A418EntUniEnt = GXv_decimal28[0] ;
         AV40UniOld = GXv_decimal21[0] ;
         A417EntPre = GXv_decimal16[0] ;
         AV22PedPri = GXv_char26[0] ;
         AV32Year = GXv_int17[0] ;
         AV42AnyAnt = GXv_int14[0] ;
         AV34Mes = GXv_int19[0] ;
         AV43MesAnt = GXv_int6[0] ;
         AV41PrecAnt = GXv_decimal15[0] ;
         A415EntFecEnt = GXv_date22[0] ;
         AV39FecAnt = GXv_date11[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A6156EntPrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6156EntPrvNum), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         httpContext.ajax_rsp_assign_attri("", false, "A718PrdNom", A718PrdNom);
         httpContext.ajax_rsp_assign_attri("", false, "AV32Year", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV32Year), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV34Mes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34Mes), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A418EntUniEnt", GXutil.ltrimstr( A418EntUniEnt, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "AV40UniOld", GXutil.ltrimstr( AV40UniOld, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "A417EntPre", GXutil.ltrimstr( A417EntPre, 14, 5));
         httpContext.ajax_rsp_assign_attri("", false, "AV22PedPri", AV22PedPri);
         httpContext.ajax_rsp_assign_attri("", false, "AV32Year", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV32Year), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV42AnyAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV42AnyAnt), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV34Mes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34Mes), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV43MesAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV43MesAnt), 2, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV41PrecAnt", GXutil.ltrimstr( AV41PrecAnt, 14, 5));
         httpContext.ajax_rsp_assign_attri("", false, "A415EntFecEnt", localUtil.format(A415EntFecEnt, "99/99/99"));
         httpContext.ajax_rsp_assign_attri("", false, "AV39FecAnt", localUtil.format(AV39FecAnt, "99/99/99"));
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

   public void xc_78_1SK42( )
   {
      if ( ( ( ( DecimalUtil.compareTo(A418EntUniEnt, AV40UniOld) != 0 ) ) || ( !( GXutil.dateCompare(GXutil.resetTime(A415EntFecEnt), GXutil.resetTime(AV39FecAnt)) ) ) || ( ( DecimalUtil.compareTo(A417EntPre, AV41PrecAnt) != 0 ) ) ) && isUpd( )  && true /* After */ )
      {
         GXv_char31[0] = A396EmprCod ;
         GXv_int29[0] = A6156EntPrvNum ;
         GXv_char30[0] = A719PrdNum ;
         GXv_char27[0] = A718PrdNom ;
         GXv_int18[0] = AV32Year ;
         GXv_int20[0] = (byte)(AV34Mes) ;
         GXv_decimal28[0] = A418EntUniEnt ;
         GXv_decimal21[0] = AV40UniOld ;
         GXv_decimal16[0] = A417EntPre ;
         GXv_char26[0] = AV22PedPri ;
         GXv_int17[0] = AV32Year ;
         GXv_int14[0] = AV42AnyAnt ;
         GXv_int19[0] = (byte)(AV34Mes) ;
         GXv_int6[0] = AV43MesAnt ;
         GXv_decimal15[0] = AV41PrecAnt ;
         GXv_date22[0] = A415EntFecEnt ;
         GXv_date11[0] = AV39FecAnt ;
         GXv_char25[0] = httpContext.getMessage( "UPD", "") ;
         new app.pprdes3(remoteHandle, context).execute( GXv_char31, GXv_int29, GXv_char30, GXv_char27, GXv_int18, GXv_int20, GXv_decimal28, GXv_decimal21, GXv_decimal16, GXv_char26, GXv_int17, GXv_int14, GXv_int19, GXv_int6, GXv_decimal15, GXv_date22, GXv_date11, GXv_char25) ;
         A396EmprCod = GXv_char31[0] ;
         A6156EntPrvNum = GXv_int29[0] ;
         A719PrdNum = GXv_char30[0] ;
         A718PrdNom = GXv_char27[0] ;
         AV32Year = GXv_int18[0] ;
         AV34Mes = GXv_int20[0] ;
         A418EntUniEnt = GXv_decimal28[0] ;
         AV40UniOld = GXv_decimal21[0] ;
         A417EntPre = GXv_decimal16[0] ;
         AV22PedPri = GXv_char26[0] ;
         AV32Year = GXv_int17[0] ;
         AV42AnyAnt = GXv_int14[0] ;
         AV34Mes = GXv_int19[0] ;
         AV43MesAnt = GXv_int6[0] ;
         AV41PrecAnt = GXv_decimal15[0] ;
         A415EntFecEnt = GXv_date22[0] ;
         AV39FecAnt = GXv_date11[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A6156EntPrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6156EntPrvNum), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         httpContext.ajax_rsp_assign_attri("", false, "A718PrdNom", A718PrdNom);
         httpContext.ajax_rsp_assign_attri("", false, "AV32Year", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV32Year), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV34Mes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34Mes), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A418EntUniEnt", GXutil.ltrimstr( A418EntUniEnt, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "AV40UniOld", GXutil.ltrimstr( AV40UniOld, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "A417EntPre", GXutil.ltrimstr( A417EntPre, 14, 5));
         httpContext.ajax_rsp_assign_attri("", false, "AV22PedPri", AV22PedPri);
         httpContext.ajax_rsp_assign_attri("", false, "AV32Year", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV32Year), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV42AnyAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV42AnyAnt), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV34Mes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34Mes), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV43MesAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV43MesAnt), 2, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV41PrecAnt", GXutil.ltrimstr( AV41PrecAnt, 14, 5));
         httpContext.ajax_rsp_assign_attri("", false, "A415EntFecEnt", localUtil.format(A415EntFecEnt, "99/99/99"));
         httpContext.ajax_rsp_assign_attri("", false, "AV39FecAnt", localUtil.format(AV39FecAnt, "99/99/99"));
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

   public void xc_79_1SK42( )
   {
      if ( isIns( )  && true /* After */ )
      {
         GXv_char31[0] = A396EmprCod ;
         GXv_char30[0] = A719PrdNum ;
         GXv_int18[0] = AV32Year ;
         GXv_int20[0] = (byte)(AV34Mes) ;
         GXv_decimal28[0] = A418EntUniEnt ;
         GXv_decimal21[0] = AV40UniOld ;
         GXv_decimal16[0] = A417EntPre ;
         GXv_int17[0] = AV32Year ;
         GXv_int14[0] = AV42AnyAnt ;
         GXv_int19[0] = (byte)(AV34Mes) ;
         GXv_int6[0] = AV43MesAnt ;
         GXv_decimal15[0] = AV41PrecAnt ;
         GXv_date22[0] = A415EntFecEnt ;
         GXv_date11[0] = AV39FecAnt ;
         GXv_char27[0] = AV22PedPri ;
         GXv_char26[0] = httpContext.getMessage( "INS", "") ;
         new app.pprden2(remoteHandle, context).execute( GXv_char31, GXv_char30, GXv_int18, GXv_int20, GXv_decimal28, GXv_decimal21, GXv_decimal16, GXv_int17, GXv_int14, GXv_int19, GXv_int6, GXv_decimal15, GXv_date22, GXv_date11, GXv_char27, GXv_char26) ;
         A396EmprCod = GXv_char31[0] ;
         A719PrdNum = GXv_char30[0] ;
         AV32Year = GXv_int18[0] ;
         AV34Mes = GXv_int20[0] ;
         A418EntUniEnt = GXv_decimal28[0] ;
         AV40UniOld = GXv_decimal21[0] ;
         A417EntPre = GXv_decimal16[0] ;
         AV32Year = GXv_int17[0] ;
         AV42AnyAnt = GXv_int14[0] ;
         AV34Mes = GXv_int19[0] ;
         AV43MesAnt = GXv_int6[0] ;
         AV41PrecAnt = GXv_decimal15[0] ;
         A415EntFecEnt = GXv_date22[0] ;
         AV39FecAnt = GXv_date11[0] ;
         AV22PedPri = GXv_char27[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         httpContext.ajax_rsp_assign_attri("", false, "AV32Year", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV32Year), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV34Mes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34Mes), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A418EntUniEnt", GXutil.ltrimstr( A418EntUniEnt, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "AV40UniOld", GXutil.ltrimstr( AV40UniOld, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "A417EntPre", GXutil.ltrimstr( A417EntPre, 14, 5));
         httpContext.ajax_rsp_assign_attri("", false, "AV32Year", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV32Year), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV42AnyAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV42AnyAnt), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV34Mes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34Mes), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV43MesAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV43MesAnt), 2, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV41PrecAnt", GXutil.ltrimstr( AV41PrecAnt, 14, 5));
         httpContext.ajax_rsp_assign_attri("", false, "A415EntFecEnt", localUtil.format(A415EntFecEnt, "99/99/99"));
         httpContext.ajax_rsp_assign_attri("", false, "AV39FecAnt", localUtil.format(AV39FecAnt, "99/99/99"));
         httpContext.ajax_rsp_assign_attri("", false, "AV22PedPri", AV22PedPri);
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

   public void xc_80_1SK42( )
   {
      if ( ( ( ( DecimalUtil.compareTo(A418EntUniEnt, AV40UniOld) != 0 ) ) || ( !( GXutil.dateCompare(GXutil.resetTime(A415EntFecEnt), GXutil.resetTime(AV39FecAnt)) ) ) || ( ( DecimalUtil.compareTo(A417EntPre, AV41PrecAnt) != 0 ) ) ) && isUpd( )  && true /* After */ )
      {
         GXv_char31[0] = A396EmprCod ;
         GXv_char30[0] = A719PrdNum ;
         GXv_int18[0] = AV32Year ;
         GXv_int20[0] = (byte)(AV34Mes) ;
         GXv_decimal28[0] = A418EntUniEnt ;
         GXv_decimal21[0] = AV40UniOld ;
         GXv_decimal16[0] = A417EntPre ;
         GXv_int17[0] = AV32Year ;
         GXv_int14[0] = AV42AnyAnt ;
         GXv_int19[0] = (byte)(AV34Mes) ;
         GXv_int6[0] = AV43MesAnt ;
         GXv_decimal15[0] = AV41PrecAnt ;
         GXv_date22[0] = A415EntFecEnt ;
         GXv_date11[0] = AV39FecAnt ;
         GXv_char27[0] = AV22PedPri ;
         GXv_char26[0] = httpContext.getMessage( "UPD", "") ;
         new app.pprden2(remoteHandle, context).execute( GXv_char31, GXv_char30, GXv_int18, GXv_int20, GXv_decimal28, GXv_decimal21, GXv_decimal16, GXv_int17, GXv_int14, GXv_int19, GXv_int6, GXv_decimal15, GXv_date22, GXv_date11, GXv_char27, GXv_char26) ;
         A396EmprCod = GXv_char31[0] ;
         A719PrdNum = GXv_char30[0] ;
         AV32Year = GXv_int18[0] ;
         AV34Mes = GXv_int20[0] ;
         A418EntUniEnt = GXv_decimal28[0] ;
         AV40UniOld = GXv_decimal21[0] ;
         A417EntPre = GXv_decimal16[0] ;
         AV32Year = GXv_int17[0] ;
         AV42AnyAnt = GXv_int14[0] ;
         AV34Mes = GXv_int19[0] ;
         AV43MesAnt = GXv_int6[0] ;
         AV41PrecAnt = GXv_decimal15[0] ;
         A415EntFecEnt = GXv_date22[0] ;
         AV39FecAnt = GXv_date11[0] ;
         AV22PedPri = GXv_char27[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         httpContext.ajax_rsp_assign_attri("", false, "AV32Year", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV32Year), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV34Mes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34Mes), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A418EntUniEnt", GXutil.ltrimstr( A418EntUniEnt, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "AV40UniOld", GXutil.ltrimstr( AV40UniOld, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "A417EntPre", GXutil.ltrimstr( A417EntPre, 14, 5));
         httpContext.ajax_rsp_assign_attri("", false, "AV32Year", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV32Year), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV42AnyAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV42AnyAnt), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV34Mes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34Mes), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV43MesAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV43MesAnt), 2, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV41PrecAnt", GXutil.ltrimstr( AV41PrecAnt, 14, 5));
         httpContext.ajax_rsp_assign_attri("", false, "A415EntFecEnt", localUtil.format(A415EntFecEnt, "99/99/99"));
         httpContext.ajax_rsp_assign_attri("", false, "AV39FecAnt", localUtil.format(AV39FecAnt, "99/99/99"));
         httpContext.ajax_rsp_assign_attri("", false, "AV22PedPri", AV22PedPri);
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

   public void xc_81_1SK42( String Gx_mode ,
                            String A396EmprCod ,
                            int A6156EntPrvNum ,
                            java.util.Date A415EntFecEnt ,
                            int A658PedCod ,
                            java.math.BigDecimal A418EntUniEnt ,
                            java.math.BigDecimal A417EntPre ,
                            String AV22PedPri ,
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
         GXv_char30[0] = AV22PedPri ;
         new app.pacespr(remoteHandle, context).execute( GXv_char31, GXv_int29, GXv_date22, GXv_int24, GXv_decimal28, GXv_decimal21, GXv_char30) ;
         A396EmprCod = GXv_char31[0] ;
         A6156EntPrvNum = GXv_int29[0] ;
         A415EntFecEnt = GXv_date22[0] ;
         A658PedCod = GXv_int24[0] ;
         A418EntUniEnt = GXv_decimal28[0] ;
         A417EntPre = GXv_decimal21[0] ;
         AV22PedPri = GXv_char30[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A6156EntPrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6156EntPrvNum), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A415EntFecEnt", localUtil.format(A415EntFecEnt, "99/99/99"));
         httpContext.ajax_rsp_assign_attri("", false, "A658PedCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A658PedCod), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A418EntUniEnt", GXutil.ltrimstr( A418EntUniEnt, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "A417EntPre", GXutil.ltrimstr( A417EntPre, 14, 5));
         httpContext.ajax_rsp_assign_attri("", false, "AV22PedPri", AV22PedPri);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A6156EntPrvNum, (byte)(6), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( localUtil.format(A415EntFecEnt, "99/99/99"))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A658PedCod, (byte)(8), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A418EntUniEnt, (byte)(9), (byte)(2), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A417EntPre, (byte)(14), (byte)(5), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( AV22PedPri))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_82_1SK42( String Gx_mode ,
                            String A396EmprCod ,
                            int A6156EntPrvNum ,
                            String A719PrdNum ,
                            String A718PrdNom ,
                            java.util.Date A415EntFecEnt ,
                            int A658PedCod ,
                            java.math.BigDecimal A418EntUniEnt ,
                            java.math.BigDecimal A417EntPre ,
                            String AV22PedPri ,
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
         GXv_char26[0] = AV22PedPri ;
         new app.pacesprx(remoteHandle, context).execute( GXv_char31, GXv_int29, GXv_char30, GXv_char27, GXv_date22, GXv_int24, GXv_decimal28, GXv_decimal21, GXv_char26) ;
         A396EmprCod = GXv_char31[0] ;
         A6156EntPrvNum = GXv_int29[0] ;
         A719PrdNum = GXv_char30[0] ;
         A718PrdNom = GXv_char27[0] ;
         A415EntFecEnt = GXv_date22[0] ;
         A658PedCod = GXv_int24[0] ;
         A418EntUniEnt = GXv_decimal28[0] ;
         A417EntPre = GXv_decimal21[0] ;
         AV22PedPri = GXv_char26[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A6156EntPrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6156EntPrvNum), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         httpContext.ajax_rsp_assign_attri("", false, "A718PrdNom", A718PrdNom);
         httpContext.ajax_rsp_assign_attri("", false, "A415EntFecEnt", localUtil.format(A415EntFecEnt, "99/99/99"));
         httpContext.ajax_rsp_assign_attri("", false, "A658PedCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A658PedCod), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A418EntUniEnt", GXutil.ltrimstr( A418EntUniEnt, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "A417EntPre", GXutil.ltrimstr( A417EntPre, 14, 5));
         httpContext.ajax_rsp_assign_attri("", false, "AV22PedPri", AV22PedPri);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A6156EntPrvNum, (byte)(6), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A719PrdNum))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A718PrdNom))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( localUtil.format(A415EntFecEnt, "99/99/99"))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A658PedCod, (byte)(8), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A418EntUniEnt, (byte)(9), (byte)(2), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A417EntPre, (byte)(14), (byte)(5), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( AV22PedPri))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_83_1SK42( String Gx_mode ,
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
         httpContext.ajax_rsp_assign_attri("", false, "A415EntFecEnt", localUtil.format(A415EntFecEnt, "99/99/99"));
         httpContext.ajax_rsp_assign_attri("", false, "A418EntUniEnt", GXutil.ltrimstr( A418EntUniEnt, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "A417EntPre", GXutil.ltrimstr( A417EntPre, 14, 5));
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

   public void xc_84_1SK42( )
   {
      if ( ( isIns( )  || isUpd( )  ) && true /* After */ && ( AV31Nalbaran20 == 0 ) )
      {
         GXv_char31[0] = A396EmprCod ;
         GXv_char30[0] = A719PrdNum ;
         GXv_decimal28[0] = A418EntUniEnt ;
         GXv_decimal21[0] = DecimalUtil.doubleToDec(0) ;
         GXv_char27[0] = httpContext.getMessage( "EN", "") ;
         GXv_char26[0] = AV22PedPri ;
         GXv_decimal16[0] = A417EntPre ;
         GXv_int29[0] = 0 ;
         GXv_int20[0] = (byte)(0) ;
         GXv_char25[0] = " " ;
         GXv_int24[0] = A658PedCod ;
         GXv_char23[0] = A11Albaran ;
         GXv_char12[0] = AV26UsurCod ;
         GXv_char4[0] = httpContext.getMessage( "Entrada por Pedido", "") ;
         GXv_int18[0] = A597LinEnt ;
         GXv_decimal15[0] = AV40UniOld ;
         GXv_decimal13[0] = DecimalUtil.doubleToDec(0) ;
         GXv_date22[0] = A415EntFecEnt ;
         GXv_int8[0] = A6156EntPrvNum ;
         GXv_char3[0] = A5686EntLotN ;
         new app.pnewcc9(remoteHandle, context).execute( GXv_char31, GXv_char30, GXv_decimal28, GXv_decimal21, GXv_char27, GXv_char26, GXv_decimal16, GXv_int29, GXv_int20, GXv_char25, GXv_int24, GXv_char23, GXv_char12, GXv_char4, GXv_int18, GXv_decimal15, GXv_decimal13, GXv_date22, GXv_int8, GXv_char3) ;
         A396EmprCod = GXv_char31[0] ;
         A719PrdNum = GXv_char30[0] ;
         A418EntUniEnt = GXv_decimal28[0] ;
         AV22PedPri = GXv_char26[0] ;
         A417EntPre = GXv_decimal16[0] ;
         A658PedCod = GXv_int24[0] ;
         A11Albaran = GXv_char23[0] ;
         AV26UsurCod = GXv_char12[0] ;
         A597LinEnt = GXv_int18[0] ;
         AV40UniOld = GXv_decimal15[0] ;
         A415EntFecEnt = GXv_date22[0] ;
         A6156EntPrvNum = GXv_int8[0] ;
         A5686EntLotN = GXv_char3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         httpContext.ajax_rsp_assign_attri("", false, "A418EntUniEnt", GXutil.ltrimstr( A418EntUniEnt, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "AV22PedPri", AV22PedPri);
         httpContext.ajax_rsp_assign_attri("", false, "A417EntPre", GXutil.ltrimstr( A417EntPre, 14, 5));
         httpContext.ajax_rsp_assign_attri("", false, "A658PedCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A658PedCod), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A11Albaran", A11Albaran);
         httpContext.ajax_rsp_assign_attri("", false, "AV26UsurCod", AV26UsurCod);
         httpContext.ajax_rsp_assign_attri("", false, "A597LinEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A597LinEnt), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV40UniOld", GXutil.ltrimstr( AV40UniOld, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "A415EntFecEnt", localUtil.format(A415EntFecEnt, "99/99/99"));
         httpContext.ajax_rsp_assign_attri("", false, "A6156EntPrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6156EntPrvNum), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A5686EntLotN", A5686EntLotN);
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

   public void xc_85_1SK42( )
   {
      if ( ( isIns( )  || isUpd( )  ) && true /* After */ && ( AV31Nalbaran20 == 1 ) )
      {
         GXv_char31[0] = A396EmprCod ;
         GXv_char30[0] = A719PrdNum ;
         GXv_decimal28[0] = A418EntUniEnt ;
         GXv_decimal21[0] = DecimalUtil.doubleToDec(0) ;
         GXv_char27[0] = httpContext.getMessage( "EN", "") ;
         GXv_char26[0] = AV22PedPri ;
         GXv_decimal16[0] = A417EntPre ;
         GXv_int29[0] = 0 ;
         GXv_int20[0] = (byte)(0) ;
         GXv_char25[0] = " " ;
         GXv_int24[0] = A658PedCod ;
         GXv_char23[0] = A11Albaran ;
         GXv_char12[0] = AV26UsurCod ;
         GXv_char4[0] = httpContext.getMessage( "Entrada por Pedido", "") ;
         GXv_int18[0] = A597LinEnt ;
         GXv_decimal15[0] = AV40UniOld ;
         GXv_decimal13[0] = DecimalUtil.doubleToDec(0) ;
         GXv_date22[0] = A415EntFecEnt ;
         GXv_int8[0] = A6156EntPrvNum ;
         GXv_char3[0] = A5686EntLotN ;
         GXv_char2[0] = A12857EntNAlbar ;
         new app.pccstk20(remoteHandle, context).execute( GXv_char31, GXv_char30, GXv_decimal28, GXv_decimal21, GXv_char27, GXv_char26, GXv_decimal16, GXv_int29, GXv_int20, GXv_char25, GXv_int24, GXv_char23, GXv_char12, GXv_char4, GXv_int18, GXv_decimal15, GXv_decimal13, GXv_date22, GXv_int8, GXv_char3, GXv_char2) ;
         A396EmprCod = GXv_char31[0] ;
         A719PrdNum = GXv_char30[0] ;
         A418EntUniEnt = GXv_decimal28[0] ;
         AV22PedPri = GXv_char26[0] ;
         A417EntPre = GXv_decimal16[0] ;
         A658PedCod = GXv_int24[0] ;
         A11Albaran = GXv_char23[0] ;
         AV26UsurCod = GXv_char12[0] ;
         A597LinEnt = GXv_int18[0] ;
         AV40UniOld = GXv_decimal15[0] ;
         A415EntFecEnt = GXv_date22[0] ;
         A6156EntPrvNum = GXv_int8[0] ;
         A5686EntLotN = GXv_char3[0] ;
         A12857EntNAlbar = GXv_char2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         httpContext.ajax_rsp_assign_attri("", false, "A418EntUniEnt", GXutil.ltrimstr( A418EntUniEnt, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "AV22PedPri", AV22PedPri);
         httpContext.ajax_rsp_assign_attri("", false, "A417EntPre", GXutil.ltrimstr( A417EntPre, 14, 5));
         httpContext.ajax_rsp_assign_attri("", false, "A658PedCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A658PedCod), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A11Albaran", A11Albaran);
         httpContext.ajax_rsp_assign_attri("", false, "AV26UsurCod", AV26UsurCod);
         httpContext.ajax_rsp_assign_attri("", false, "A597LinEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A597LinEnt), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV40UniOld", GXutil.ltrimstr( AV40UniOld, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "A415EntFecEnt", localUtil.format(A415EntFecEnt, "99/99/99"));
         httpContext.ajax_rsp_assign_attri("", false, "A6156EntPrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6156EntPrvNum), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A5686EntLotN", A5686EntLotN);
         httpContext.ajax_rsp_assign_attri("", false, "A12857EntNAlbar", A12857EntNAlbar);
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

   public void xc_86_1SK42( String Gx_mode ,
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
         httpContext.ajax_rsp_assign_attri("", false, "A597LinEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A597LinEnt), 4, 0));
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

   public void xc_87_1SK42( )
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
         httpContext.ajax_rsp_assign_attri("", false, "A658PedCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A658PedCod), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         httpContext.ajax_rsp_assign_attri("", false, "A3404EntPedCum", A3404EntPedCum);
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

   public void xc_88_1SK42( )
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
         httpContext.ajax_rsp_assign_attri("", false, "A658PedCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A658PedCod), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         httpContext.ajax_rsp_assign_attri("", false, "A3404EntPedCum", A3404EntPedCum);
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

   public void xc_89_1SK42( String A396EmprCod ,
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
         httpContext.ajax_rsp_assign_attri("", false, "A6156EntPrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6156EntPrvNum), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A417EntPre", GXutil.ltrimstr( A417EntPre, 14, 5));
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

   public void valid_Prdnum( )
   {
      n794PrvNom = false ;
      n800PrvPri = false ;
      n6156EntPrvNum = false ;
      n913StockRem = false ;
      /* Using cursor T01SK27 */
      pr_default.execute(22, new Object[] {A396EmprCod, A719PrdNum});
      Z726PrdPreMed = T01SK27_A726PrdPreMed[0] ;
      Z718PrdNom = T01SK27_A718PrdNom[0] ;
      Z724PrdPreAct = T01SK27_A724PrdPreAct[0] ;
      Z698PrdDetPar = T01SK27_A698PrdDetPar[0] ;
      Z713PrdFulEnt = T01SK27_A713PrdFulEnt[0] ;
      Z684PrdCanPen = T01SK27_A684PrdCanPen[0] ;
      Z729PrdRotRea = T01SK27_A729PrdRotRea[0] ;
      Z727PrdRec = T01SK27_A727PrdRec[0] ;
      Z725PrdPreAnt = T01SK27_A725PrdPreAnt[0] ;
      Z709PrdFecPre = T01SK27_A709PrdFecPre[0] ;
      Z5255PrdPreAc2 = T01SK27_A5255PrdPreAc2[0] ;
      Z705PrdExiCC = T01SK27_A705PrdExiCC[0] ;
      Z795PrvNum = T01SK27_A795PrvNum[0] ;
      Z856ValCod = T01SK27_A856ValCod[0] ;
      if ( (pr_default.getStatus(22) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PRODUC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PRDNUM");
         AnyError = (short)(1) ;
         GX_FocusControl = edtPrdNum_Internalname ;
      }
      A847UltLinEnt = T01SK27_A847UltLinEnt[0] ;
      A704PrdExiAlm = T01SK27_A704PrdExiAlm[0] ;
      A726PrdPreMed = T01SK27_A726PrdPreMed[0] ;
      A750PrdValStk = T01SK27_A750PrdValStk[0] ;
      A718PrdNom = T01SK27_A718PrdNom[0] ;
      A724PrdPreAct = T01SK27_A724PrdPreAct[0] ;
      A698PrdDetPar = T01SK27_A698PrdDetPar[0] ;
      A713PrdFulEnt = T01SK27_A713PrdFulEnt[0] ;
      A684PrdCanPen = T01SK27_A684PrdCanPen[0] ;
      A729PrdRotRea = T01SK27_A729PrdRotRea[0] ;
      A727PrdRec = T01SK27_A727PrdRec[0] ;
      A725PrdPreAnt = T01SK27_A725PrdPreAnt[0] ;
      A709PrdFecPre = T01SK27_A709PrdFecPre[0] ;
      A5255PrdPreAc2 = T01SK27_A5255PrdPreAc2[0] ;
      A705PrdExiCC = T01SK27_A705PrdExiCC[0] ;
      A795PrvNum = T01SK27_A795PrvNum[0] ;
      A856ValCod = T01SK27_A856ValCod[0] ;
      O750PrdValStk = A750PrdValStk ;
      O704PrdExiAlm = A704PrdExiAlm ;
      O847UltLinEnt = A847UltLinEnt ;
      pr_default.close(22);
      if ( isIns( )  )
      {
         A847UltLinEnt = (short)(O847UltLinEnt+1) ;
      }
      /* Using cursor T01SK30 */
      pr_default.execute(25, new Object[] {A396EmprCod, Integer.valueOf(A795PrvNum)});
      if ( (pr_default.getStatus(25) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PRVGEN", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PRVNUM");
         AnyError = (short)(1) ;
      }
      A794PrvNom = T01SK30_A794PrvNom[0] ;
      n794PrvNom = T01SK30_n794PrvNom[0] ;
      A800PrvPri = T01SK30_A800PrvPri[0] ;
      n800PrvPri = T01SK30_n800PrvPri[0] ;
      pr_default.close(25);
      if ( isIns( )  && (0==A6156EntPrvNum) && ( Gx_BScreen == 0 ) )
      {
         A6156EntPrvNum = A795PrvNum ;
         n6156EntPrvNum = false ;
      }
      /* Using cursor T01SK32 */
      pr_default.execute(26, new Object[] {A396EmprCod, A719PrdNum});
      if ( (pr_default.getStatus(26) != 101) )
      {
         A913StockRem = T01SK32_A913StockRem[0] ;
         n913StockRem = T01SK32_n913StockRem[0] ;
      }
      else
      {
         A913StockRem = DecimalUtil.doubleToDec(0) ;
         n913StockRem = false ;
      }
      pr_default.close(26);
      GXt_date10 = A14040PrdUltMovF ;
      GXv_char31[0] = A396EmprCod ;
      GXv_char30[0] = A719PrdNum ;
      GXv_date22[0] = GXt_date10 ;
      new app.pstm005(remoteHandle, context).execute( GXv_char31, GXv_char30, GXv_date22) ;
      entradaproducto_trn_impl.this.A396EmprCod = GXv_char31[0] ;
      entradaproducto_trn_impl.this.A719PrdNum = GXv_char30[0] ;
      entradaproducto_trn_impl.this.GXt_date10 = GXv_date22[0] ;
      A14040PrdUltMovF = GXt_date10 ;
      GXt_date10 = A3835UltFecCCs ;
      GXv_char31[0] = A396EmprCod ;
      GXv_char30[0] = A719PrdNum ;
      GXv_date22[0] = GXt_date10 ;
      new app.pstm005(remoteHandle, context).execute( GXv_char31, GXv_char30, GXv_date22) ;
      entradaproducto_trn_impl.this.A396EmprCod = GXv_char31[0] ;
      entradaproducto_trn_impl.this.A719PrdNum = GXv_char30[0] ;
      entradaproducto_trn_impl.this.GXt_date10 = GXv_date22[0] ;
      A3835UltFecCCs = GXt_date10 ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "O847UltLinEnt", GXutil.ltrim( localUtil.ntoc( O847UltLinEnt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      httpContext.ajax_rsp_assign_attri("", false, "O704PrdExiAlm", GXutil.ltrim( localUtil.ntoc( O704PrdExiAlm, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      httpContext.ajax_rsp_assign_attri("", false, "O750PrdValStk", GXutil.ltrim( localUtil.ntoc( O750PrdValStk, (byte)(11), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      httpContext.ajax_rsp_assign_attri("", false, "A847UltLinEnt", GXutil.ltrim( localUtil.ntoc( A847UltLinEnt, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A704PrdExiAlm", GXutil.ltrim( localUtil.ntoc( A704PrdExiAlm, (byte)(12), (byte)(4), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A726PrdPreMed", GXutil.ltrim( localUtil.ntoc( A726PrdPreMed, (byte)(14), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A750PrdValStk", GXutil.ltrim( localUtil.ntoc( A750PrdValStk, (byte)(11), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A718PrdNom", GXutil.rtrim( A718PrdNom));
      httpContext.ajax_rsp_assign_attri("", false, "A724PrdPreAct", GXutil.ltrim( localUtil.ntoc( A724PrdPreAct, (byte)(14), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A698PrdDetPar", GXutil.rtrim( A698PrdDetPar));
      httpContext.ajax_rsp_assign_attri("", false, "A713PrdFulEnt", localUtil.format(A713PrdFulEnt, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A684PrdCanPen", GXutil.ltrim( localUtil.ntoc( A684PrdCanPen, (byte)(12), (byte)(4), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A729PrdRotRea", GXutil.ltrim( localUtil.ntoc( A729PrdRotRea, (byte)(12), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A727PrdRec", GXutil.rtrim( A727PrdRec));
      httpContext.ajax_rsp_assign_attri("", false, "A725PrdPreAnt", GXutil.ltrim( localUtil.ntoc( A725PrdPreAnt, (byte)(14), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A709PrdFecPre", localUtil.format(A709PrdFecPre, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A5255PrdPreAc2", GXutil.ltrim( localUtil.ntoc( A5255PrdPreAc2, (byte)(14), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A705PrdExiCC", GXutil.ltrim( localUtil.ntoc( A705PrdExiCC, (byte)(12), (byte)(4), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A795PrvNum", GXutil.ltrim( localUtil.ntoc( A795PrvNum, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A856ValCod", GXutil.ltrim( localUtil.ntoc( A856ValCod, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A597LinEnt", GXutil.ltrim( localUtil.ntoc( A597LinEnt, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A794PrvNom", GXutil.rtrim( A794PrvNom));
      httpContext.ajax_rsp_assign_attri("", false, "A800PrvPri", GXutil.ltrim( localUtil.ntoc( A800PrvPri, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A6156EntPrvNum", GXutil.ltrim( localUtil.ntoc( A6156EntPrvNum, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A913StockRem", GXutil.ltrim( localUtil.ntoc( A913StockRem, (byte)(12), (byte)(4), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A14040PrdUltMovF", localUtil.format(A14040PrdUltMovF, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A3835UltFecCCs", localUtil.format(A3835UltFecCCs, "99/99/99"));
   }

   public void valid_Entfecent( )
   {
      AV32Year = (short)(GXutil.year( A415EntFecEnt)) ;
      AV21Fecha = localUtil.ymdtod( AV32Year, 12, 1) ;
      AV34Mes = (short)(GXutil.month( A415EntFecEnt)) ;
      AV24oldEntFecent = O415EntFecEnt ;
      AV39FecAnt = O415EntFecEnt ;
      AV42AnyAnt = (short)(GXutil.year( O415EntFecEnt)) ;
      AV43MesAnt = (byte)(GXutil.month( O415EntFecEnt)) ;
      AV33DiasFin = (short)(GXutil.ddiff(GXutil.eomdate( AV21Fecha),A415EntFecEnt)) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "AV32Year", GXutil.ltrim( localUtil.ntoc( AV32Year, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV21Fecha", localUtil.format(AV21Fecha, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "AV34Mes", GXutil.ltrim( localUtil.ntoc( AV34Mes, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV24oldEntFecent", localUtil.format(AV24oldEntFecent, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "AV39FecAnt", localUtil.format(AV39FecAnt, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "AV42AnyAnt", GXutil.ltrim( localUtil.ntoc( AV42AnyAnt, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV43MesAnt", GXutil.ltrim( localUtil.ntoc( AV43MesAnt, (byte)(2), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV33DiasFin", GXutil.ltrim( localUtil.ntoc( AV33DiasFin, (byte)(4), (byte)(0), ".", "")));
   }

   public void valid_Pedcod( )
   {
      n658PedCod = false ;
      n800PrvPri = false ;
      /* Using cursor T01SK28 */
      pr_default.execute(23, new Object[] {A396EmprCod, Boolean.valueOf(n658PedCod), Integer.valueOf(A658PedCod)});
      if ( (pr_default.getStatus(23) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A658PedCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CPEDID", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PEDCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtPedCod_Internalname ;
         }
      }
      A661PedFec = T01SK28_A661PedFec[0] ;
      A667PedSit = T01SK28_A667PedSit[0] ;
      A666PedPri = T01SK28_A666PedPri[0] ;
      A12580PedAlmc = T01SK28_A12580PedAlmc[0] ;
      pr_default.close(23);
      /* Using cursor T01SK29 */
      pr_default.execute(24, new Object[] {A396EmprCod, Boolean.valueOf(n658PedCod), Integer.valueOf(A658PedCod), A719PrdNum});
      Z665PedPre = T01SK29_A665PedPre[0] ;
      Z669PedUni = T01SK29_A669PedUni[0] ;
      Z663PedFulEnt = T01SK29_A663PedFulEnt[0] ;
      Z659PedCum = T01SK29_A659PedCum[0] ;
      Z660PedDto = T01SK29_A660PedDto[0] ;
      if ( (pr_default.getStatus(24) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A658PedCod) || (GXutil.strcmp("", A719PrdNum)==0) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "LPEDID", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PRDNUM");
            AnyError = (short)(1) ;
            GX_FocusControl = edtPedCod_Internalname ;
         }
      }
      A657PedCanEnt = T01SK29_A657PedCanEnt[0] ;
      A665PedPre = T01SK29_A665PedPre[0] ;
      A669PedUni = T01SK29_A669PedUni[0] ;
      A663PedFulEnt = T01SK29_A663PedFulEnt[0] ;
      A659PedCum = T01SK29_A659PedCum[0] ;
      A660PedDto = T01SK29_A660PedDto[0] ;
      O657PedCanEnt = A657PedCanEnt ;
      pr_default.close(24);
      if ( true )
      {
         AV22PedPri = GXutil.str( A800PrvPri, 1, 0) ;
      }
      else
      {
         if ( true /* Level */ && ! (0==A658PedCod) )
         {
            AV22PedPri = A666PedPri ;
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
      A664PedNumLin = (short)(getPedNumLin0( A396EmprCod, A658PedCod)) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "O657PedCanEnt", GXutil.ltrim( localUtil.ntoc( O657PedCanEnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      httpContext.ajax_rsp_assign_attri("", false, "A661PedFec", localUtil.format(A661PedFec, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A667PedSit", GXutil.rtrim( A667PedSit));
      httpContext.ajax_rsp_assign_attri("", false, "A666PedPri", GXutil.rtrim( A666PedPri));
      httpContext.ajax_rsp_assign_attri("", false, "A12580PedAlmc", GXutil.ltrim( localUtil.ntoc( A12580PedAlmc, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A657PedCanEnt", GXutil.ltrim( localUtil.ntoc( A657PedCanEnt, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A665PedPre", GXutil.ltrim( localUtil.ntoc( A665PedPre, (byte)(14), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A669PedUni", GXutil.ltrim( localUtil.ntoc( A669PedUni, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A663PedFulEnt", localUtil.format(A663PedFulEnt, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A659PedCum", GXutil.rtrim( A659PedCum));
      httpContext.ajax_rsp_assign_attri("", false, "A660PedDto", GXutil.ltrim( localUtil.ntoc( A660PedDto, (byte)(5), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV22PedPri", GXutil.rtrim( AV22PedPri));
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
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A12716EntFabId", GXutil.ltrim( localUtil.ntoc( A12716EntFabId, (byte)(6), (byte)(0), ".", "")));
   }

   public void valid_Entunient( )
   {
      n658PedCod = false ;
      AV36OldEntUni = O418EntUniEnt ;
      AV40UniOld = O418EntUniEnt ;
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
      AV35OldExiAlm = O704PrdExiAlm ;
      if ( isDlt( )  && ( ! (0==A658PedCod) ) )
      {
         A657PedCanEnt = O657PedCanEnt.subtract(O418EntUniEnt) ;
      }
      else
      {
         if ( isUpd( )  && ! ( ! (0==A658PedCod) ) && ( ! (0==A658PedCod) ) )
         {
            A657PedCanEnt = O657PedCanEnt.subtract(O418EntUniEnt) ;
         }
         else
         {
            if ( isUpd( )  && ( ! (0==A658PedCod) ) && ! ( ! (0==A658PedCod) ) )
            {
               A657PedCanEnt = O657PedCanEnt.add(A418EntUniEnt) ;
            }
            else
            {
               if ( ( isIns( )  || isUpd( )  || isDlt( )  ) && ( ! (0==A658PedCod) ) )
               {
                  A657PedCanEnt = O657PedCanEnt.add(A418EntUniEnt).subtract(O418EntUniEnt) ;
               }
            }
         }
      }
      if ( isIns( )  && (GXutil.strcmp("", A3404EntPedCum)==0) && ( Gx_BScreen == 0 ) )
      {
         A3404EntPedCum = httpContext.getMessage( httpContext.getMessage( "N", ""), "") ;
      }
      else
      {
         if ( (0==A658PedCod) )
         {
            A3404EntPedCum = httpContext.getMessage( httpContext.getMessage( "S", ""), "") ;
         }
         else
         {
            if ( ( ( DecimalUtil.compareTo(A657PedCanEnt, A669PedUni) == 0 ) || ( DecimalUtil.compareTo(A657PedCanEnt, A669PedUni) > 0 ) ) && ! (0==A658PedCod) && true /* After */ )
            {
               A3404EntPedCum = httpContext.getMessage( httpContext.getMessage( "S", ""), "") ;
            }
            else
            {
               if ( ( DecimalUtil.compareTo(A657PedCanEnt, A669PedUni) < 0 ) && ! (0==A658PedCod) && true /* After */ )
               {
                  A3404EntPedCum = httpContext.getMessage( httpContext.getMessage( "N", ""), "") ;
               }
            }
         }
      }
      if ( isIns( )  && true /* After */ )
      {
         A419EntUniRem = O419EntUniRem.add(A418EntUniEnt) ;
      }
      else
      {
         if ( isUpd( )  && true /* After */ )
         {
            A419EntUniRem = (O419EntUniRem.add(A418EntUniEnt).subtract(O418EntUniEnt)) ;
         }
         else
         {
            if ( isDlt( )  && true /* After */ )
            {
               A419EntUniRem = (O419EntUniRem.subtract(A418EntUniEnt)) ;
            }
         }
      }
      AV37OldRemanente = O419EntUniRem ;
      if ( isUpd( )  && ( DecimalUtil.compareTo(A419EntUniRem, A418EntUniEnt) != 0 ) )
      {
         edtEntFecEnt_Enabled = 0 ;
      }
      else
      {
         edtEntFecEnt_Enabled = 1 ;
      }
      if ( isUpd( )  && ( DecimalUtil.compareTo(A419EntUniRem, A418EntUniEnt) != 0 ) )
      {
         edtAlbaran_Enabled = 0 ;
      }
      else
      {
         edtAlbaran_Enabled = 1 ;
      }
      if ( isUpd( )  && ( DecimalUtil.compareTo(A419EntUniRem, A418EntUniEnt) != 0 ) )
      {
         edtEntNAlbar_Enabled = 0 ;
      }
      else
      {
         edtEntNAlbar_Enabled = 1 ;
      }
      if ( isUpd( )  && ( DecimalUtil.compareTo(A419EntUniRem, A418EntUniEnt) != 0 ) )
      {
         edtEntPrvNum_Enabled = 0 ;
      }
      else
      {
         edtEntPrvNum_Enabled = 1 ;
      }
      if ( isUpd( )  && ( DecimalUtil.compareTo(A419EntUniRem, A418EntUniEnt) != 0 ) )
      {
         edtEntUniEnt_Enabled = 0 ;
      }
      else
      {
         edtEntUniEnt_Enabled = 1 ;
      }
      if ( isUpd( )  && ( DecimalUtil.compareTo(A419EntUniRem, A418EntUniEnt) != 0 ) )
      {
         edtEntLotN_Enabled = 0 ;
      }
      else
      {
         edtEntLotN_Enabled = 1 ;
      }
      if ( isUpd( )  && ( DecimalUtil.compareTo(A419EntUniRem, A418EntUniEnt) != 0 ) )
      {
         edtEntPre_Enabled = 0 ;
      }
      else
      {
         edtEntPre_Enabled = 1 ;
      }
      if ( isUpd( )  && ( DecimalUtil.compareTo(A419EntUniRem, A418EntUniEnt) != 0 ) )
      {
         edtEntFVal_Enabled = 0 ;
      }
      else
      {
         edtEntFVal_Enabled = 1 ;
      }
      if ( isUpd( )  && ( DecimalUtil.compareTo(A419EntUniRem, A418EntUniEnt) != 0 ) )
      {
         edtEntPedCum_Enabled = 0 ;
      }
      else
      {
         edtEntPedCum_Enabled = 1 ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "AV36OldEntUni", GXutil.ltrim( localUtil.ntoc( AV36OldEntUni, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV40UniOld", GXutil.ltrim( localUtil.ntoc( AV40UniOld, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A704PrdExiAlm", GXutil.ltrim( localUtil.ntoc( A704PrdExiAlm, (byte)(12), (byte)(4), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV35OldExiAlm", GXutil.ltrim( localUtil.ntoc( AV35OldExiAlm, (byte)(12), (byte)(4), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A657PedCanEnt", GXutil.ltrim( localUtil.ntoc( A657PedCanEnt, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A3404EntPedCum", GXutil.rtrim( A3404EntPedCum));
      httpContext.ajax_rsp_assign_attri("", false, "A419EntUniRem", GXutil.ltrim( localUtil.ntoc( A419EntUniRem, (byte)(11), (byte)(4), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV37OldRemanente", GXutil.ltrim( localUtil.ntoc( AV37OldRemanente, (byte)(11), (byte)(4), ".", "")));
      httpContext.ajax_rsp_assign_prop("", false, edtEntFecEnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEntFecEnt_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, edtAlbaran_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbaran_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, edtEntNAlbar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEntNAlbar_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, edtEntPrvNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEntPrvNum_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, edtEntUniEnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEntUniEnt_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, edtEntLotN_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEntLotN_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, edtEntPre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEntPre_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, edtEntFVal_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEntFVal_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, edtEntPedCum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEntPedCum_Enabled), 5, 0), true);
   }

   public void valid_Entpre( )
   {
      AV23OldEntPre = O417EntPre ;
      AV41PrecAnt = O417EntPre ;
      if ( isIns( )  && true /* Level */ )
      {
         A750PrdValStk = O750PrdValStk.add(GXutil.roundDecimal( A417EntPre.multiply(A418EntUniEnt), 2)) ;
      }
      else
      {
         if ( isUpd( )  && true /* Level */ )
         {
            A750PrdValStk = O750PrdValStk.add((GXutil.roundDecimal( A417EntPre.multiply(A418EntUniEnt), 2).subtract(GXutil.roundDecimal( AV23OldEntPre.multiply(AV36OldEntUni), 2)))) ;
         }
         else
         {
            if ( isDlt( )  && true /* Level */ )
            {
               A750PrdValStk = O750PrdValStk.subtract(GXutil.roundDecimal( A417EntPre.multiply(A418EntUniEnt), 2)) ;
            }
         }
      }
      if ( ( A704PrdExiAlm.doubleValue() != 0 ) && ( AV30Consumos == 1 ) && ( A750PrdValStk.doubleValue() > 0 ) )
      {
         A726PrdPreMed = GXutil.roundDecimal( A750PrdValStk.divide(A704PrdExiAlm, 18, java.math.RoundingMode.DOWN), 3) ;
      }
      else
      {
         if ( ( A704PrdExiAlm.doubleValue() == 0 ) && ( AV30Consumos == 1 ) && ( A750PrdValStk.doubleValue() == 0 ) )
         {
            A726PrdPreMed = DecimalUtil.doubleToDec(0) ;
         }
         else
         {
            if ( ( ( A704PrdExiAlm.doubleValue() != 0 ) || ( A705PrdExiCC.doubleValue() != 0 ) ) && ( AV30Consumos == 0 ) )
            {
               A726PrdPreMed = GXutil.roundDecimal( A750PrdValStk.divide((A704PrdExiAlm.add(A705PrdExiCC)), 18, java.math.RoundingMode.DOWN), 3) ;
            }
            else
            {
               if ( ( A704PrdExiAlm.doubleValue() == 0 ) && ( A705PrdExiCC.doubleValue() == 0 ) && ( AV30Consumos == 0 ) )
               {
                  A726PrdPreMed = DecimalUtil.doubleToDec(0) ;
               }
            }
         }
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "AV23OldEntPre", GXutil.ltrim( localUtil.ntoc( AV23OldEntPre, (byte)(14), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV41PrecAnt", GXutil.ltrim( localUtil.ntoc( AV41PrecAnt, (byte)(14), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A750PrdValStk", GXutil.ltrim( localUtil.ntoc( A750PrdValStk, (byte)(11), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A726PrdPreMed", GXutil.ltrim( localUtil.ntoc( A726PrdPreMed, (byte)(14), (byte)(5), ".", "")));
   }

   public void valid_Entlotn( )
   {
      AV38oldlote = O5686EntLotN ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "AV38oldlote", GXutil.rtrim( AV38oldlote));
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV7EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV8PrdNum',fld:'vPRDNUM',pic:'',hsh:true},{av:'AV9LinEnt',fld:'vLINENT',pic:'ZZZ9',hsh:true}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV7EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV8PrdNum',fld:'vPRDNUM',pic:'',hsh:true},{av:'AV9LinEnt',fld:'vLINENT',pic:'ZZZ9',hsh:true},{av:'A411EntCon',fld:'ENTCON',pic:'9'},{av:'AV45Pgmname',fld:'vPGMNAME',pic:''},{av:'A416EntNumCon',fld:'ENTNUMCON',pic:'ZZ9'},{av:'A414EntEti',fld:'ENTETI',pic:'9'},{av:'A413EntConIni',fld:'ENTCONINI',pic:'ZZZZZZZ9'},{av:'A412EntConFin',fld:'ENTCONFIN',pic:'ZZZZZZZ9'},{av:'A5691EntBnc',fld:'ENTBNC',pic:''},{av:'A7695EntCC',fld:'ENTCC',pic:''},{av:'A7696EntCCoCod',fld:'ENTCCOCOD',pic:'ZZ9'},{av:'A10782EntUniAlb',fld:'ENTUNIALB',pic:'ZZZZZ9.9999'},{av:'A10783EntObs',fld:'ENTOBS',pic:''},{av:'A10187EntRemNro',fld:'ENTREMNRO',pic:''},{av:'A10186EntRemFch',fld:'ENTREMFCH',pic:''},{av:'A10185EntRemSuc',fld:'ENTREMSUC',pic:''},{av:'A10184EntRemTpo',fld:'ENTREMTPO',pic:''},{av:'A13235EntLoteID',fld:'ENTLOTEID',pic:'ZZZZZZZZZZZ9'},{av:'A13456EntUbicaci',fld:'ENTUBICACI',pic:''},{av:'A5690EntHfCon',fld:'ENTHFCON',pic:'99:99'},{av:'A5689EntFfCon',fld:'ENTFFCON',pic:''},{av:'A5688EntHiCon',fld:'ENTHICON',pic:'99:99'},{av:'A5687EntFiCon',fld:'ENTFICON',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("AFTER TRN","{handler:'e121SK2',iparms:[]");
      setEventMetadata("AFTER TRN",",oparms:[]}");
      setEventMetadata("VALID_PRDNUM","{handler:'valid_Prdnum',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'O847UltLinEnt'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A719PrdNum',fld:'PRDNUM',pic:''},{av:'A847UltLinEnt',fld:'ULTLINENT',pic:'ZZZ9'},{av:'AV9LinEnt',fld:'vLINENT',pic:'ZZZ9',hsh:true},{av:'Gx_BScreen',fld:'vGXBSCREEN',pic:'9'},{av:'A795PrvNum',fld:'PRVNUM',pic:'ZZZZZ9'},{av:'A704PrdExiAlm',fld:'PRDEXIALM',pic:'ZZZZZZ9.9999'},{av:'A726PrdPreMed',fld:'PRDPREMED',pic:'ZZZZZZZ9.999'},{av:'A750PrdValStk',fld:'PRDVALSTK',pic:'ZZZZZZZ9.99'},{av:'A718PrdNom',fld:'PRDNOM',pic:''},{av:'A724PrdPreAct',fld:'PRDPREACT',pic:'ZZZZZZZ9.999'},{av:'A698PrdDetPar',fld:'PRDDETPAR',pic:''},{av:'A713PrdFulEnt',fld:'PRDFULENT',pic:''},{av:'A684PrdCanPen',fld:'PRDCANPEN',pic:'ZZZZZZ9.9999'},{av:'A729PrdRotRea',fld:'PRDROTREA',pic:'ZZZZZ9.999'},{av:'A727PrdRec',fld:'PRDREC',pic:''},{av:'A725PrdPreAnt',fld:'PRDPREANT',pic:'ZZZZZZZ9.999'},{av:'A709PrdFecPre',fld:'PRDFECPRE',pic:''},{av:'A5255PrdPreAc2',fld:'PRDPREAC2',pic:'ZZZZZZZ9.999'},{av:'A705PrdExiCC',fld:'PRDEXICC',pic:'ZZZZZZ9.9999'},{av:'A856ValCod',fld:'VALCOD',pic:'9'},{av:'A597LinEnt',fld:'LINENT',pic:'ZZZ9'},{av:'A794PrvNom',fld:'PRVNOM',pic:''},{av:'A800PrvPri',fld:'PRVPRI',pic:'9'},{av:'A6156EntPrvNum',fld:'ENTPRVNUM',pic:'ZZZZZ9'},{av:'A913StockRem',fld:'STOCKREM',pic:'ZZZZZZ9.9999'},{av:'A14040PrdUltMovF',fld:'PRDULTMOVF',pic:''},{av:'A3835UltFecCCs',fld:'ULTFECCCS',pic:''}]");
      setEventMetadata("VALID_PRDNUM",",oparms:[{av:'O847UltLinEnt'},{av:'O704PrdExiAlm'},{av:'O750PrdValStk'},{av:'A847UltLinEnt',fld:'ULTLINENT',pic:'ZZZ9'},{av:'A704PrdExiAlm',fld:'PRDEXIALM',pic:'ZZZZZZ9.9999'},{av:'A726PrdPreMed',fld:'PRDPREMED',pic:'ZZZZZZZ9.999'},{av:'A750PrdValStk',fld:'PRDVALSTK',pic:'ZZZZZZZ9.99'},{av:'A718PrdNom',fld:'PRDNOM',pic:''},{av:'A724PrdPreAct',fld:'PRDPREACT',pic:'ZZZZZZZ9.999'},{av:'A698PrdDetPar',fld:'PRDDETPAR',pic:''},{av:'A713PrdFulEnt',fld:'PRDFULENT',pic:''},{av:'A684PrdCanPen',fld:'PRDCANPEN',pic:'ZZZZZZ9.9999'},{av:'A729PrdRotRea',fld:'PRDROTREA',pic:'ZZZZZ9.999'},{av:'A727PrdRec',fld:'PRDREC',pic:''},{av:'A725PrdPreAnt',fld:'PRDPREANT',pic:'ZZZZZZZ9.999'},{av:'A709PrdFecPre',fld:'PRDFECPRE',pic:''},{av:'A5255PrdPreAc2',fld:'PRDPREAC2',pic:'ZZZZZZZ9.999'},{av:'A705PrdExiCC',fld:'PRDEXICC',pic:'ZZZZZZ9.9999'},{av:'A795PrvNum',fld:'PRVNUM',pic:'ZZZZZ9'},{av:'A856ValCod',fld:'VALCOD',pic:'9'},{av:'A597LinEnt',fld:'LINENT',pic:'ZZZ9'},{av:'A794PrvNom',fld:'PRVNOM',pic:''},{av:'A800PrvPri',fld:'PRVPRI',pic:'9'},{av:'A6156EntPrvNum',fld:'ENTPRVNUM',pic:'ZZZZZ9'},{av:'A913StockRem',fld:'STOCKREM',pic:'ZZZZZZ9.9999'},{av:'A14040PrdUltMovF',fld:'PRDULTMOVF',pic:''},{av:'A3835UltFecCCs',fld:'ULTFECCCS',pic:''}]}");
      setEventMetadata("VALID_PRDNOM","{handler:'valid_Prdnom',iparms:[]");
      setEventMetadata("VALID_PRDNOM",",oparms:[]}");
      setEventMetadata("VALID_LINENT","{handler:'valid_Linent',iparms:[]");
      setEventMetadata("VALID_LINENT",",oparms:[]}");
      setEventMetadata("VALID_ENTFECENT","{handler:'valid_Entfecent',iparms:[{av:'O415EntFecEnt'},{av:'A415EntFecEnt',fld:'ENTFECENT',pic:''},{av:'AV32Year',fld:'vYEAR',pic:'ZZZ9'},{av:'AV21Fecha',fld:'vFECHA',pic:''},{av:'AV34Mes',fld:'vMES',pic:'ZZZ9'},{av:'AV24oldEntFecent',fld:'vOLDENTFECENT',pic:''},{av:'AV39FecAnt',fld:'vFECANT',pic:''},{av:'AV42AnyAnt',fld:'vANYANT',pic:'ZZZ9'},{av:'AV43MesAnt',fld:'vMESANT',pic:'Z9'},{av:'AV33DiasFin',fld:'vDIASFIN',pic:'ZZZ9'}]");
      setEventMetadata("VALID_ENTFECENT",",oparms:[{av:'AV32Year',fld:'vYEAR',pic:'ZZZ9'},{av:'AV21Fecha',fld:'vFECHA',pic:''},{av:'AV34Mes',fld:'vMES',pic:'ZZZ9'},{av:'AV24oldEntFecent',fld:'vOLDENTFECENT',pic:''},{av:'AV39FecAnt',fld:'vFECANT',pic:''},{av:'AV42AnyAnt',fld:'vANYANT',pic:'ZZZ9'},{av:'AV43MesAnt',fld:'vMESANT',pic:'Z9'},{av:'AV33DiasFin',fld:'vDIASFIN',pic:'ZZZ9'}]}");
      setEventMetadata("VALID_ALBARAN","{handler:'valid_Albaran',iparms:[]");
      setEventMetadata("VALID_ALBARAN",",oparms:[]}");
      setEventMetadata("VALID_ENTNALBAR","{handler:'valid_Entnalbar',iparms:[]");
      setEventMetadata("VALID_ENTNALBAR",",oparms:[]}");
      setEventMetadata("VALID_PEDCOD","{handler:'valid_Pedcod',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A658PedCod',fld:'PEDCOD',pic:'ZZZZZZZ9'},{av:'A719PrdNum',fld:'PRDNUM',pic:''},{av:'A800PrvPri',fld:'PRVPRI',pic:'9'},{av:'A666PedPri',fld:'PEDPRI',pic:'9'},{av:'A665PedPre',fld:'PEDPRE',pic:'ZZZZZZZ9.999'},{av:'A660PedDto',fld:'PEDDTO',pic:'Z9.99'},{av:'A661PedFec',fld:'PEDFEC',pic:''},{av:'A667PedSit',fld:'PEDSIT',pic:'@!'},{av:'A12580PedAlmc',fld:'PEDALMC',pic:'9'},{av:'A657PedCanEnt',fld:'PEDCANENT',pic:'ZZZZZ9.99'},{av:'A669PedUni',fld:'PEDUNI',pic:'ZZZZZ9.99'},{av:'A663PedFulEnt',fld:'PEDFULENT',pic:''},{av:'A659PedCum',fld:'PEDCUM',pic:'@!'},{av:'AV22PedPri',fld:'vPEDPRI',pic:'9'},{av:'A417EntPre',fld:'ENTPRE',pic:'ZZZZZZZ9.999'},{av:'A664PedNumLin',fld:'PEDNUMLIN',pic:'ZZ9'}]");
      setEventMetadata("VALID_PEDCOD",",oparms:[{av:'O657PedCanEnt'},{av:'A661PedFec',fld:'PEDFEC',pic:''},{av:'A667PedSit',fld:'PEDSIT',pic:'@!'},{av:'A666PedPri',fld:'PEDPRI',pic:'9'},{av:'A12580PedAlmc',fld:'PEDALMC',pic:'9'},{av:'A657PedCanEnt',fld:'PEDCANENT',pic:'ZZZZZ9.99'},{av:'A665PedPre',fld:'PEDPRE',pic:'ZZZZZZZ9.999'},{av:'A669PedUni',fld:'PEDUNI',pic:'ZZZZZ9.99'},{av:'A663PedFulEnt',fld:'PEDFULENT',pic:''},{av:'A659PedCum',fld:'PEDCUM',pic:'@!'},{av:'A660PedDto',fld:'PEDDTO',pic:'Z9.99'},{av:'AV22PedPri',fld:'vPEDPRI',pic:'9'},{av:'A417EntPre',fld:'ENTPRE',pic:'ZZZZZZZ9.999'},{av:'A664PedNumLin',fld:'PEDNUMLIN',pic:'ZZ9'}]}");
      setEventMetadata("VALID_ENTPRVNUM","{handler:'valid_Entprvnum',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'A6156EntPrvNum',fld:'ENTPRVNUM',pic:'ZZZZZ9'},{av:'Gx_BScreen',fld:'vGXBSCREEN',pic:'9'},{av:'A12716EntFabId',fld:'ENTFABID',pic:'ZZZZZ9'}]");
      setEventMetadata("VALID_ENTPRVNUM",",oparms:[{av:'A12716EntFabId',fld:'ENTFABID',pic:'ZZZZZ9'}]}");
      setEventMetadata("VALID_ENTUNIENT","{handler:'valid_Entunient',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'O419EntUniRem'},{av:'O657PedCanEnt'},{av:'O704PrdExiAlm'},{av:'O418EntUniEnt'},{av:'A418EntUniEnt',fld:'ENTUNIENT',pic:'ZZZZZ9.99'},{av:'A704PrdExiAlm',fld:'PRDEXIALM',pic:'ZZZZZZ9.9999'},{av:'A657PedCanEnt',fld:'PEDCANENT',pic:'ZZZZZ9.99'},{av:'A658PedCod',fld:'PEDCOD',pic:'ZZZZZZZ9'},{av:'A419EntUniRem',fld:'ENTUNIREM',pic:'ZZZZZ9.9999'},{av:'AV36OldEntUni',fld:'vOLDENTUNI',pic:'ZZZZZ9.99'},{av:'AV40UniOld',fld:'vUNIOLD',pic:'ZZZZZ9.99'},{av:'AV35OldExiAlm',fld:'vOLDEXIALM',pic:'ZZZZZZ9.9999'},{av:'A3404EntPedCum',fld:'ENTPEDCUM',pic:'@!'},{av:'AV37OldRemanente',fld:'vOLDREMANENTE',pic:'ZZZZZ9.9999'}]");
      setEventMetadata("VALID_ENTUNIENT",",oparms:[{av:'AV36OldEntUni',fld:'vOLDENTUNI',pic:'ZZZZZ9.99'},{av:'AV40UniOld',fld:'vUNIOLD',pic:'ZZZZZ9.99'},{av:'A704PrdExiAlm',fld:'PRDEXIALM',pic:'ZZZZZZ9.9999'},{av:'AV35OldExiAlm',fld:'vOLDEXIALM',pic:'ZZZZZZ9.9999'},{av:'A657PedCanEnt',fld:'PEDCANENT',pic:'ZZZZZ9.99'},{av:'A3404EntPedCum',fld:'ENTPEDCUM',pic:'@!'},{av:'A419EntUniRem',fld:'ENTUNIREM',pic:'ZZZZZ9.9999'},{av:'AV37OldRemanente',fld:'vOLDREMANENTE',pic:'ZZZZZ9.9999'},{av:'edtEntFecEnt_Enabled',ctrl:'ENTFECENT',prop:'Enabled'},{av:'edtAlbaran_Enabled',ctrl:'ALBARAN',prop:'Enabled'},{av:'edtEntNAlbar_Enabled',ctrl:'ENTNALBAR',prop:'Enabled'},{av:'edtEntPrvNum_Enabled',ctrl:'ENTPRVNUM',prop:'Enabled'},{av:'edtEntUniEnt_Enabled',ctrl:'ENTUNIENT',prop:'Enabled'},{av:'edtEntLotN_Enabled',ctrl:'ENTLOTN',prop:'Enabled'},{av:'edtEntPre_Enabled',ctrl:'ENTPRE',prop:'Enabled'},{av:'edtEntFVal_Enabled',ctrl:'ENTFVAL',prop:'Enabled'},{av:'edtEntPedCum_Enabled',ctrl:'ENTPEDCUM',prop:'Enabled'}]}");
      setEventMetadata("VALID_ENTPRE","{handler:'valid_Entpre',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'O750PrdValStk'},{av:'O417EntPre'},{av:'A417EntPre',fld:'ENTPRE',pic:'ZZZZZZZ9.999'},{av:'A750PrdValStk',fld:'PRDVALSTK',pic:'ZZZZZZZ9.99'},{av:'A418EntUniEnt',fld:'ENTUNIENT',pic:'ZZZZZ9.99'},{av:'AV23OldEntPre',fld:'vOLDENTPRE',pic:'ZZZZZZZ9.999'},{av:'AV36OldEntUni',fld:'vOLDENTUNI',pic:'ZZZZZ9.99'},{av:'A704PrdExiAlm',fld:'PRDEXIALM',pic:'ZZZZZZ9.9999'},{av:'AV30Consumos',fld:'vCONSUMOS',pic:'ZZZ9'},{av:'A705PrdExiCC',fld:'PRDEXICC',pic:'ZZZZZZ9.9999'},{av:'A726PrdPreMed',fld:'PRDPREMED',pic:'ZZZZZZZ9.999'},{av:'AV41PrecAnt',fld:'vPRECANT',pic:'ZZZZZZZ9.999'}]");
      setEventMetadata("VALID_ENTPRE",",oparms:[{av:'AV23OldEntPre',fld:'vOLDENTPRE',pic:'ZZZZZZZ9.999'},{av:'AV41PrecAnt',fld:'vPRECANT',pic:'ZZZZZZZ9.999'},{av:'A750PrdValStk',fld:'PRDVALSTK',pic:'ZZZZZZZ9.99'},{av:'A726PrdPreMed',fld:'PRDPREMED',pic:'ZZZZZZZ9.999'}]}");
      setEventMetadata("VALID_ENTLOTN","{handler:'valid_Entlotn',iparms:[{av:'O5686EntLotN'},{av:'A5686EntLotN',fld:'ENTLOTN',pic:''},{av:'AV38oldlote',fld:'vOLDLOTE',pic:''}]");
      setEventMetadata("VALID_ENTLOTN",",oparms:[{av:'AV38oldlote',fld:'vOLDLOTE',pic:''}]}");
      setEventMetadata("VALIDV_PGMNAME","{handler:'validv_Pgmname',iparms:[]");
      setEventMetadata("VALIDV_PGMNAME",",oparms:[]}");
      setEventMetadata("VALID_ENTPEDCUM","{handler:'valid_Entpedcum',iparms:[]");
      setEventMetadata("VALID_ENTPEDCUM",",oparms:[]}");
      setEventMetadata("VALID_ENTUNIREM","{handler:'valid_Entunirem',iparms:[]");
      setEventMetadata("VALID_ENTUNIREM",",oparms:[]}");
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
      pr_default.close(22);
      pr_default.close(23);
      pr_default.close(24);
      pr_default.close(25);
      pr_default.close(26);
   }

   /* Aggregate/select formulas */
   public int getPedNumLin0( String E396EmprCod ,
                             int E658PedCod )
   {
      Gx_cnt = 0 ;
      Gx_first = true ;
      /* Using cursor T01SK36 */
      pr_default.execute(30, new Object[] {E396EmprCod, Boolean.valueOf(nA658PedCod), Integer.valueOf(E658PedCod)});
      while ( (pr_default.getStatus(30) != 101) )
      {
         if ( ( ( GXutil.strcmp(T01SK36_A659PedCum[0], httpContext.getMessage( httpContext.getMessage( "N", ""), "")) == 0 ) ) && ( ( GXutil.strcmp(E396EmprCod, E396EmprCod) == 0 ) && ( E658PedCod == E658PedCod ) ) )
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
         pr_default.readNext(30);
      }
      pr_default.close(30);
      return Gx_cnt ;
   }

   public void initialize( )
   {
      sPrefix = "" ;
      wcpOGx_mode = "" ;
      wcpOAV7EmprCod = "" ;
      wcpOAV8PrdNum = "" ;
      Z396EmprCod = "" ;
      Z719PrdNum = "" ;
      Z3404EntPedCum = "" ;
      Z419EntUniRem = DecimalUtil.ZERO ;
      Z417EntPre = DecimalUtil.ZERO ;
      Z415EntFecEnt = GXutil.nullDate() ;
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
      Z10184EntRemTpo = "" ;
      Z13456EntUbicaci = "" ;
      Z5690EntHfCon = GXutil.resetTime( GXutil.nullDate() );
      Z5689EntFfCon = GXutil.nullDate() ;
      Z5688EntHiCon = GXutil.resetTime( GXutil.nullDate() );
      Z5687EntFiCon = GXutil.nullDate() ;
      Z726PrdPreMed = DecimalUtil.ZERO ;
      Z718PrdNom = "" ;
      Z724PrdPreAct = DecimalUtil.ZERO ;
      Z698PrdDetPar = "" ;
      Z713PrdFulEnt = GXutil.nullDate() ;
      Z684PrdCanPen = DecimalUtil.ZERO ;
      Z729PrdRotRea = DecimalUtil.ZERO ;
      Z727PrdRec = "" ;
      Z725PrdPreAnt = DecimalUtil.ZERO ;
      Z709PrdFecPre = GXutil.nullDate() ;
      Z5255PrdPreAc2 = DecimalUtil.ZERO ;
      Z705PrdExiCC = DecimalUtil.ZERO ;
      Z665PedPre = DecimalUtil.ZERO ;
      Z669PedUni = DecimalUtil.ZERO ;
      Z663PedFulEnt = GXutil.nullDate() ;
      Z659PedCum = "" ;
      Z660PedDto = DecimalUtil.ZERO ;
      O750PrdValStk = DecimalUtil.ZERO ;
      O419EntUniRem = DecimalUtil.ZERO ;
      O418EntUniEnt = DecimalUtil.ZERO ;
      O657PedCanEnt = DecimalUtil.ZERO ;
      O704PrdExiAlm = DecimalUtil.ZERO ;
      O415EntFecEnt = GXutil.nullDate() ;
      O417EntPre = DecimalUtil.ZERO ;
      O5686EntLotN = "" ;
      N415EntFecEnt = GXutil.nullDate() ;
      N11Albaran = "" ;
      N12857EntNAlbar = "" ;
      N418EntUniEnt = DecimalUtil.ZERO ;
      N5686EntLotN = "" ;
      N417EntPre = DecimalUtil.ZERO ;
      N5685EntFVal = GXutil.nullDate() ;
      N3404EntPedCum = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      AV45Pgmname = "" ;
      AV26UsurCod = "" ;
      AV27Station = "" ;
      AV25Inc_obs = "" ;
      Gx_mode = "" ;
      A415EntFecEnt = GXutil.nullDate() ;
      A418EntUniEnt = DecimalUtil.ZERO ;
      A417EntPre = DecimalUtil.ZERO ;
      AV22PedPri = "" ;
      A719PrdNum = "" ;
      A718PrdNom = "" ;
      AV7EmprCod = "" ;
      AV8PrdNum = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      GX_FocusControl = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_tableattributes = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      ucDvpanel_unnamedtable2 = new com.genexus.webpanels.GXUserControl();
      A11Albaran = "" ;
      A12857EntNAlbar = "" ;
      A5686EntLotN = "" ;
      A5685EntFVal = GXutil.nullDate() ;
      bttBtntrn_enter_Jsonclick = "" ;
      bttBtntrn_cancel_Jsonclick = "" ;
      bttBtntrn_delete_Jsonclick = "" ;
      A3404EntPedCum = "" ;
      A419EntUniRem = DecimalUtil.ZERO ;
      A5691EntBnc = "" ;
      A7695EntCC = "" ;
      A10782EntUniAlb = DecimalUtil.ZERO ;
      A10783EntObs = "" ;
      A10187EntRemNro = "" ;
      A10186EntRemFch = GXutil.nullDate() ;
      A10185EntRemSuc = "" ;
      A10184EntRemTpo = "" ;
      A13456EntUbicaci = "" ;
      A5690EntHfCon = GXutil.resetTime( GXutil.nullDate() );
      A5689EntFfCon = GXutil.nullDate() ;
      A5688EntHiCon = GXutil.resetTime( GXutil.nullDate() );
      A5687EntFiCon = GXutil.nullDate() ;
      A726PrdPreMed = DecimalUtil.ZERO ;
      A724PrdPreAct = DecimalUtil.ZERO ;
      A698PrdDetPar = "" ;
      A713PrdFulEnt = GXutil.nullDate() ;
      A684PrdCanPen = DecimalUtil.ZERO ;
      A729PrdRotRea = DecimalUtil.ZERO ;
      A727PrdRec = "" ;
      A725PrdPreAnt = DecimalUtil.ZERO ;
      A709PrdFecPre = GXutil.nullDate() ;
      A5255PrdPreAc2 = DecimalUtil.ZERO ;
      A705PrdExiCC = DecimalUtil.ZERO ;
      A665PedPre = DecimalUtil.ZERO ;
      A669PedUni = DecimalUtil.ZERO ;
      A663PedFulEnt = GXutil.nullDate() ;
      A659PedCum = "" ;
      A660PedDto = DecimalUtil.ZERO ;
      A14040PrdUltMovF = GXutil.nullDate() ;
      A3835UltFecCCs = GXutil.nullDate() ;
      A666PedPri = "" ;
      AV23OldEntPre = DecimalUtil.ZERO ;
      A704PrdExiAlm = DecimalUtil.ZERO ;
      AV35OldExiAlm = DecimalUtil.ZERO ;
      AV36OldEntUni = DecimalUtil.ZERO ;
      AV37OldRemanente = DecimalUtil.ZERO ;
      AV24oldEntFecent = GXutil.nullDate() ;
      AV38oldlote = "" ;
      AV40UniOld = DecimalUtil.ZERO ;
      AV39FecAnt = GXutil.nullDate() ;
      AV41PrecAnt = DecimalUtil.ZERO ;
      A657PedCanEnt = DecimalUtil.ZERO ;
      A750PrdValStk = DecimalUtil.ZERO ;
      AV21Fecha = GXutil.nullDate() ;
      A407EmprNom = "" ;
      A661PedFec = GXutil.nullDate() ;
      A667PedSit = "" ;
      A794PrvNom = "" ;
      A913StockRem = DecimalUtil.ZERO ;
      Dvpanel_tableattributes_Objectcall = "" ;
      Dvpanel_tableattributes_Class = "" ;
      Dvpanel_tableattributes_Height = "" ;
      Dvpanel_unnamedtable2_Objectcall = "" ;
      Dvpanel_unnamedtable2_Class = "" ;
      Dvpanel_unnamedtable2_Height = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      hsh = "" ;
      sMode42 = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      AV28EmprNom = "" ;
      GXt_char1 = "" ;
      AV10WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext9 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV11TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV12WebSession = httpContext.getWebSession();
      AV14TrnContextAtt = new app.wwpbaseobjects.SdtWWPTransactionContext_Attribute(remoteHandle, context);
      AV15PedCodPrompt = "" ;
      imgPedcodprompt_gximage = "" ;
      imgPedcodprompt_Internalname = "" ;
      AV47Pedcodprompt_GXI = "" ;
      Z407EmprNom = "" ;
      Z704PrdExiAlm = DecimalUtil.ZERO ;
      Z750PrdValStk = DecimalUtil.ZERO ;
      Z794PrvNom = "" ;
      Z913StockRem = DecimalUtil.ZERO ;
      Z661PedFec = GXutil.nullDate() ;
      Z667PedSit = "" ;
      Z666PedPri = "" ;
      Z657PedCanEnt = DecimalUtil.ZERO ;
      T01SK4_A407EmprNom = new String[] {""} ;
      T01SK4_n407EmprNom = new boolean[] {false} ;
      T01SK4_A3915EmpNumDec = new byte[1] ;
      T01SK4_n3915EmpNumDec = new boolean[] {false} ;
      T01SK6_A847UltLinEnt = new short[1] ;
      T01SK6_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SK6_A726PrdPreMed = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SK6_A750PrdValStk = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SK6_A718PrdNom = new String[] {""} ;
      T01SK6_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SK6_A698PrdDetPar = new String[] {""} ;
      T01SK6_A713PrdFulEnt = new java.util.Date[] {GXutil.nullDate()} ;
      T01SK6_A684PrdCanPen = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SK6_A729PrdRotRea = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SK6_A727PrdRec = new String[] {""} ;
      T01SK6_A725PrdPreAnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SK6_A709PrdFecPre = new java.util.Date[] {GXutil.nullDate()} ;
      T01SK6_A5255PrdPreAc2 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SK6_A705PrdExiCC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SK6_A795PrvNum = new int[1] ;
      T01SK6_A856ValCod = new byte[1] ;
      T01SK10_A794PrvNom = new String[] {""} ;
      T01SK10_n794PrvNom = new boolean[] {false} ;
      T01SK10_A800PrvPri = new byte[1] ;
      T01SK10_n800PrvPri = new boolean[] {false} ;
      T01SK12_A913StockRem = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SK12_n913StockRem = new boolean[] {false} ;
      T01SK7_A661PedFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01SK7_A667PedSit = new String[] {""} ;
      T01SK7_A666PedPri = new String[] {""} ;
      T01SK7_A12580PedAlmc = new byte[1] ;
      T01SK9_A657PedCanEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SK9_A665PedPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SK9_A669PedUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SK9_A663PedFulEnt = new java.util.Date[] {GXutil.nullDate()} ;
      T01SK9_A659PedCum = new String[] {""} ;
      T01SK9_A660PedDto = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SK14_A597LinEnt = new short[1] ;
      T01SK14_A847UltLinEnt = new short[1] ;
      T01SK14_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SK14_A411EntCon = new byte[1] ;
      T01SK14_A657PedCanEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SK14_A3404EntPedCum = new String[] {""} ;
      T01SK14_A419EntUniRem = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SK14_A417EntPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SK14_A726PrdPreMed = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SK14_A750PrdValStk = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SK14_A718PrdNom = new String[] {""} ;
      T01SK14_A794PrvNom = new String[] {""} ;
      T01SK14_n794PrvNom = new boolean[] {false} ;
      T01SK14_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SK14_A698PrdDetPar = new String[] {""} ;
      T01SK14_A713PrdFulEnt = new java.util.Date[] {GXutil.nullDate()} ;
      T01SK14_A684PrdCanPen = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SK14_A729PrdRotRea = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SK14_A727PrdRec = new String[] {""} ;
      T01SK14_A725PrdPreAnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SK14_A709PrdFecPre = new java.util.Date[] {GXutil.nullDate()} ;
      T01SK14_A407EmprNom = new String[] {""} ;
      T01SK14_n407EmprNom = new boolean[] {false} ;
      T01SK14_A800PrvPri = new byte[1] ;
      T01SK14_n800PrvPri = new boolean[] {false} ;
      T01SK14_A3915EmpNumDec = new byte[1] ;
      T01SK14_n3915EmpNumDec = new boolean[] {false} ;
      T01SK14_A5255PrdPreAc2 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SK14_A705PrdExiCC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SK14_A415EntFecEnt = new java.util.Date[] {GXutil.nullDate()} ;
      T01SK14_A11Albaran = new String[] {""} ;
      T01SK14_A12857EntNAlbar = new String[] {""} ;
      T01SK14_A6156EntPrvNum = new int[1] ;
      T01SK14_n6156EntPrvNum = new boolean[] {false} ;
      T01SK14_A661PedFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01SK14_A418EntUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SK14_A665PedPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SK14_A669PedUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SK14_A416EntNumCon = new short[1] ;
      T01SK14_A5686EntLotN = new String[] {""} ;
      T01SK14_A5685EntFVal = new java.util.Date[] {GXutil.nullDate()} ;
      T01SK14_A414EntEti = new byte[1] ;
      T01SK14_A413EntConIni = new int[1] ;
      T01SK14_A412EntConFin = new int[1] ;
      T01SK14_A663PedFulEnt = new java.util.Date[] {GXutil.nullDate()} ;
      T01SK14_A659PedCum = new String[] {""} ;
      T01SK14_A667PedSit = new String[] {""} ;
      T01SK14_A666PedPri = new String[] {""} ;
      T01SK14_A660PedDto = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SK14_A5691EntBnc = new String[] {""} ;
      T01SK14_A7695EntCC = new String[] {""} ;
      T01SK14_A7696EntCCoCod = new short[1] ;
      T01SK14_A10782EntUniAlb = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SK14_A10783EntObs = new String[] {""} ;
      T01SK14_A10187EntRemNro = new String[] {""} ;
      T01SK14_A10186EntRemFch = new java.util.Date[] {GXutil.nullDate()} ;
      T01SK14_A10185EntRemSuc = new String[] {""} ;
      T01SK14_A10184EntRemTpo = new String[] {""} ;
      T01SK14_A12580PedAlmc = new byte[1] ;
      T01SK14_A12716EntFabId = new int[1] ;
      T01SK14_A13235EntLoteID = new long[1] ;
      T01SK14_A13456EntUbicaci = new String[] {""} ;
      T01SK14_A5690EntHfCon = new java.util.Date[] {GXutil.nullDate()} ;
      T01SK14_A5689EntFfCon = new java.util.Date[] {GXutil.nullDate()} ;
      T01SK14_A5688EntHiCon = new java.util.Date[] {GXutil.nullDate()} ;
      T01SK14_A5687EntFiCon = new java.util.Date[] {GXutil.nullDate()} ;
      T01SK14_A396EmprCod = new String[] {""} ;
      T01SK14_A719PrdNum = new String[] {""} ;
      T01SK14_A658PedCod = new int[1] ;
      T01SK14_n658PedCod = new boolean[] {false} ;
      T01SK14_A795PrvNum = new int[1] ;
      T01SK14_A856ValCod = new byte[1] ;
      T01SK14_A913StockRem = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SK14_n913StockRem = new boolean[] {false} ;
      T01SK15_A661PedFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01SK15_A667PedSit = new String[] {""} ;
      T01SK15_A666PedPri = new String[] {""} ;
      T01SK15_A12580PedAlmc = new byte[1] ;
      T01SK16_A794PrvNom = new String[] {""} ;
      T01SK16_n794PrvNom = new boolean[] {false} ;
      T01SK16_A800PrvPri = new byte[1] ;
      T01SK16_n800PrvPri = new boolean[] {false} ;
      T01SK18_A913StockRem = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SK18_n913StockRem = new boolean[] {false} ;
      T01SK19_A396EmprCod = new String[] {""} ;
      T01SK19_A719PrdNum = new String[] {""} ;
      T01SK19_A597LinEnt = new short[1] ;
      T01SK3_A597LinEnt = new short[1] ;
      T01SK3_A411EntCon = new byte[1] ;
      T01SK3_A3404EntPedCum = new String[] {""} ;
      T01SK3_A419EntUniRem = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SK3_A417EntPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SK3_A415EntFecEnt = new java.util.Date[] {GXutil.nullDate()} ;
      T01SK3_A11Albaran = new String[] {""} ;
      T01SK3_A12857EntNAlbar = new String[] {""} ;
      T01SK3_A6156EntPrvNum = new int[1] ;
      T01SK3_n6156EntPrvNum = new boolean[] {false} ;
      T01SK3_A418EntUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SK3_A416EntNumCon = new short[1] ;
      T01SK3_A5686EntLotN = new String[] {""} ;
      T01SK3_A5685EntFVal = new java.util.Date[] {GXutil.nullDate()} ;
      T01SK3_A414EntEti = new byte[1] ;
      T01SK3_A413EntConIni = new int[1] ;
      T01SK3_A412EntConFin = new int[1] ;
      T01SK3_A5691EntBnc = new String[] {""} ;
      T01SK3_A7695EntCC = new String[] {""} ;
      T01SK3_A7696EntCCoCod = new short[1] ;
      T01SK3_A10782EntUniAlb = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SK3_A10783EntObs = new String[] {""} ;
      T01SK3_A10187EntRemNro = new String[] {""} ;
      T01SK3_A10186EntRemFch = new java.util.Date[] {GXutil.nullDate()} ;
      T01SK3_A10185EntRemSuc = new String[] {""} ;
      T01SK3_A10184EntRemTpo = new String[] {""} ;
      T01SK3_A12716EntFabId = new int[1] ;
      T01SK3_A13235EntLoteID = new long[1] ;
      T01SK3_A13456EntUbicaci = new String[] {""} ;
      T01SK3_A5690EntHfCon = new java.util.Date[] {GXutil.nullDate()} ;
      T01SK3_A5689EntFfCon = new java.util.Date[] {GXutil.nullDate()} ;
      T01SK3_A5688EntHiCon = new java.util.Date[] {GXutil.nullDate()} ;
      T01SK3_A5687EntFiCon = new java.util.Date[] {GXutil.nullDate()} ;
      T01SK3_A396EmprCod = new String[] {""} ;
      T01SK3_A719PrdNum = new String[] {""} ;
      T01SK3_A658PedCod = new int[1] ;
      T01SK3_n658PedCod = new boolean[] {false} ;
      T01SK20_A396EmprCod = new String[] {""} ;
      T01SK20_A719PrdNum = new String[] {""} ;
      T01SK20_A597LinEnt = new short[1] ;
      T01SK20_A411EntCon = new byte[1] ;
      T01SK21_A396EmprCod = new String[] {""} ;
      T01SK21_A719PrdNum = new String[] {""} ;
      T01SK21_A597LinEnt = new short[1] ;
      T01SK21_A411EntCon = new byte[1] ;
      T01SK2_A597LinEnt = new short[1] ;
      T01SK2_A411EntCon = new byte[1] ;
      T01SK2_A3404EntPedCum = new String[] {""} ;
      T01SK2_A419EntUniRem = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SK2_A417EntPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SK2_A415EntFecEnt = new java.util.Date[] {GXutil.nullDate()} ;
      T01SK2_A11Albaran = new String[] {""} ;
      T01SK2_A12857EntNAlbar = new String[] {""} ;
      T01SK2_A6156EntPrvNum = new int[1] ;
      T01SK2_n6156EntPrvNum = new boolean[] {false} ;
      T01SK2_A418EntUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SK2_A416EntNumCon = new short[1] ;
      T01SK2_A5686EntLotN = new String[] {""} ;
      T01SK2_A5685EntFVal = new java.util.Date[] {GXutil.nullDate()} ;
      T01SK2_A414EntEti = new byte[1] ;
      T01SK2_A413EntConIni = new int[1] ;
      T01SK2_A412EntConFin = new int[1] ;
      T01SK2_A5691EntBnc = new String[] {""} ;
      T01SK2_A7695EntCC = new String[] {""} ;
      T01SK2_A7696EntCCoCod = new short[1] ;
      T01SK2_A10782EntUniAlb = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SK2_A10783EntObs = new String[] {""} ;
      T01SK2_A10187EntRemNro = new String[] {""} ;
      T01SK2_A10186EntRemFch = new java.util.Date[] {GXutil.nullDate()} ;
      T01SK2_A10185EntRemSuc = new String[] {""} ;
      T01SK2_A10184EntRemTpo = new String[] {""} ;
      T01SK2_A12716EntFabId = new int[1] ;
      T01SK2_A13235EntLoteID = new long[1] ;
      T01SK2_A13456EntUbicaci = new String[] {""} ;
      T01SK2_A5690EntHfCon = new java.util.Date[] {GXutil.nullDate()} ;
      T01SK2_A5689EntFfCon = new java.util.Date[] {GXutil.nullDate()} ;
      T01SK2_A5688EntHiCon = new java.util.Date[] {GXutil.nullDate()} ;
      T01SK2_A5687EntFiCon = new java.util.Date[] {GXutil.nullDate()} ;
      T01SK2_A396EmprCod = new String[] {""} ;
      T01SK2_A719PrdNum = new String[] {""} ;
      T01SK2_A658PedCod = new int[1] ;
      T01SK2_n658PedCod = new boolean[] {false} ;
      T01SK22_A847UltLinEnt = new short[1] ;
      T01SK22_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SK22_A726PrdPreMed = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SK22_A750PrdValStk = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SK22_A718PrdNom = new String[] {""} ;
      T01SK22_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SK22_A698PrdDetPar = new String[] {""} ;
      T01SK22_A713PrdFulEnt = new java.util.Date[] {GXutil.nullDate()} ;
      T01SK22_A684PrdCanPen = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SK22_A729PrdRotRea = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SK22_A727PrdRec = new String[] {""} ;
      T01SK22_A725PrdPreAnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SK22_A709PrdFecPre = new java.util.Date[] {GXutil.nullDate()} ;
      T01SK22_A5255PrdPreAc2 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SK22_A705PrdExiCC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SK22_A795PrvNum = new int[1] ;
      T01SK22_A856ValCod = new byte[1] ;
      T01SK23_A657PedCanEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SK23_A665PedPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SK23_A669PedUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SK23_A663PedFulEnt = new java.util.Date[] {GXutil.nullDate()} ;
      T01SK23_A659PedCum = new String[] {""} ;
      T01SK23_A660PedDto = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SK27_A847UltLinEnt = new short[1] ;
      T01SK27_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SK27_A726PrdPreMed = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SK27_A750PrdValStk = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SK27_A718PrdNom = new String[] {""} ;
      T01SK27_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SK27_A698PrdDetPar = new String[] {""} ;
      T01SK27_A713PrdFulEnt = new java.util.Date[] {GXutil.nullDate()} ;
      T01SK27_A684PrdCanPen = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SK27_A729PrdRotRea = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SK27_A727PrdRec = new String[] {""} ;
      T01SK27_A725PrdPreAnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SK27_A709PrdFecPre = new java.util.Date[] {GXutil.nullDate()} ;
      T01SK27_A5255PrdPreAc2 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SK27_A705PrdExiCC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SK27_A795PrvNum = new int[1] ;
      T01SK27_A856ValCod = new byte[1] ;
      T01SK28_A661PedFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01SK28_A667PedSit = new String[] {""} ;
      T01SK28_A666PedPri = new String[] {""} ;
      T01SK28_A12580PedAlmc = new byte[1] ;
      T01SK29_A657PedCanEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SK29_A665PedPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SK29_A669PedUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SK29_A663PedFulEnt = new java.util.Date[] {GXutil.nullDate()} ;
      T01SK29_A659PedCum = new String[] {""} ;
      T01SK29_A660PedDto = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SK30_A794PrvNom = new String[] {""} ;
      T01SK30_n794PrvNom = new boolean[] {false} ;
      T01SK30_A800PrvPri = new byte[1] ;
      T01SK30_n800PrvPri = new boolean[] {false} ;
      T01SK32_A913StockRem = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SK32_n913StockRem = new boolean[] {false} ;
      T01SK35_A396EmprCod = new String[] {""} ;
      T01SK35_A719PrdNum = new String[] {""} ;
      T01SK35_A597LinEnt = new short[1] ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      i415EntFecEnt = GXutil.nullDate() ;
      i10184EntRemTpo = "" ;
      GXv_int17 = new short[1] ;
      GXv_int14 = new short[1] ;
      GXv_int19 = new byte[1] ;
      GXv_int6 = new byte[1] ;
      GXv_date11 = new java.util.Date[1] ;
      GXv_decimal21 = new java.math.BigDecimal[1] ;
      GXv_decimal16 = new java.math.BigDecimal[1] ;
      GXv_int20 = new byte[1] ;
      GXv_char25 = new String[1] ;
      GXv_int24 = new int[1] ;
      GXv_char23 = new String[1] ;
      GXv_char12 = new String[1] ;
      GXv_char4 = new String[1] ;
      GXv_decimal15 = new java.math.BigDecimal[1] ;
      GXv_decimal13 = new java.math.BigDecimal[1] ;
      GXv_int8 = new int[1] ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      GXv_int18 = new short[1] ;
      GXv_char27 = new String[1] ;
      GXv_char26 = new String[1] ;
      GXv_int29 = new int[1] ;
      GXv_decimal28 = new java.math.BigDecimal[1] ;
      GXt_date10 = GXutil.nullDate() ;
      GXv_char31 = new String[1] ;
      GXv_char30 = new String[1] ;
      GXv_date22 = new java.util.Date[1] ;
      ZO704PrdExiAlm = DecimalUtil.ZERO ;
      ZO750PrdValStk = DecimalUtil.ZERO ;
      Z14040PrdUltMovF = GXutil.nullDate() ;
      Z3835UltFecCCs = GXutil.nullDate() ;
      ZV21Fecha = GXutil.nullDate() ;
      ZV24oldEntFecent = GXutil.nullDate() ;
      ZV39FecAnt = GXutil.nullDate() ;
      ZO657PedCanEnt = DecimalUtil.ZERO ;
      ZV22PedPri = "" ;
      ZV36OldEntUni = DecimalUtil.ZERO ;
      ZV40UniOld = DecimalUtil.ZERO ;
      ZV35OldExiAlm = DecimalUtil.ZERO ;
      ZV37OldRemanente = DecimalUtil.ZERO ;
      ZV23OldEntPre = DecimalUtil.ZERO ;
      ZV41PrecAnt = DecimalUtil.ZERO ;
      ZV38oldlote = "" ;
      E396EmprCod = "" ;
      T01SK36_A396EmprCod = new String[] {""} ;
      T01SK36_A658PedCod = new int[1] ;
      T01SK36_n658PedCod = new boolean[] {false} ;
      T01SK36_A719PrdNum = new String[] {""} ;
      T01SK36_A659PedCum = new String[] {""} ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.stocksquimicos.entradaproducto_trn__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.stocksquimicos.entradaproducto_trn__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.stocksquimicos.entradaproducto_trn__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.stocksquimicos.entradaproducto_trn__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.stocksquimicos.entradaproducto_trn__default(),
         new Object[] {
             new Object[] {
            T01SK2_A597LinEnt, T01SK2_A411EntCon, T01SK2_A3404EntPedCum, T01SK2_A419EntUniRem, T01SK2_A417EntPre, T01SK2_A415EntFecEnt, T01SK2_A11Albaran, T01SK2_A12857EntNAlbar, T01SK2_A6156EntPrvNum, T01SK2_n6156EntPrvNum,
            T01SK2_A418EntUniEnt, T01SK2_A416EntNumCon, T01SK2_A5686EntLotN, T01SK2_A5685EntFVal, T01SK2_A414EntEti, T01SK2_A413EntConIni, T01SK2_A412EntConFin, T01SK2_A5691EntBnc, T01SK2_A7695EntCC, T01SK2_A7696EntCCoCod,
            T01SK2_A10782EntUniAlb, T01SK2_A10783EntObs, T01SK2_A10187EntRemNro, T01SK2_A10186EntRemFch, T01SK2_A10185EntRemSuc, T01SK2_A10184EntRemTpo, T01SK2_A12716EntFabId, T01SK2_A13235EntLoteID, T01SK2_A13456EntUbicaci, T01SK2_A5690EntHfCon,
            T01SK2_A5689EntFfCon, T01SK2_A5688EntHiCon, T01SK2_A5687EntFiCon, T01SK2_A396EmprCod, T01SK2_A719PrdNum, T01SK2_A658PedCod, T01SK2_n658PedCod
            }
            , new Object[] {
            T01SK3_A597LinEnt, T01SK3_A411EntCon, T01SK3_A3404EntPedCum, T01SK3_A419EntUniRem, T01SK3_A417EntPre, T01SK3_A415EntFecEnt, T01SK3_A11Albaran, T01SK3_A12857EntNAlbar, T01SK3_A6156EntPrvNum, T01SK3_n6156EntPrvNum,
            T01SK3_A418EntUniEnt, T01SK3_A416EntNumCon, T01SK3_A5686EntLotN, T01SK3_A5685EntFVal, T01SK3_A414EntEti, T01SK3_A413EntConIni, T01SK3_A412EntConFin, T01SK3_A5691EntBnc, T01SK3_A7695EntCC, T01SK3_A7696EntCCoCod,
            T01SK3_A10782EntUniAlb, T01SK3_A10783EntObs, T01SK3_A10187EntRemNro, T01SK3_A10186EntRemFch, T01SK3_A10185EntRemSuc, T01SK3_A10184EntRemTpo, T01SK3_A12716EntFabId, T01SK3_A13235EntLoteID, T01SK3_A13456EntUbicaci, T01SK3_A5690EntHfCon,
            T01SK3_A5689EntFfCon, T01SK3_A5688EntHiCon, T01SK3_A5687EntFiCon, T01SK3_A396EmprCod, T01SK3_A719PrdNum, T01SK3_A658PedCod, T01SK3_n658PedCod
            }
            , new Object[] {
            T01SK4_A407EmprNom, T01SK4_n407EmprNom, T01SK4_A3915EmpNumDec, T01SK4_n3915EmpNumDec
            }
            , new Object[] {
            T01SK5_A847UltLinEnt, T01SK5_A704PrdExiAlm, T01SK5_A726PrdPreMed, T01SK5_A750PrdValStk, T01SK5_A718PrdNom, T01SK5_A724PrdPreAct, T01SK5_A698PrdDetPar, T01SK5_A713PrdFulEnt, T01SK5_A684PrdCanPen, T01SK5_A729PrdRotRea,
            T01SK5_A727PrdRec, T01SK5_A725PrdPreAnt, T01SK5_A709PrdFecPre, T01SK5_A5255PrdPreAc2, T01SK5_A705PrdExiCC, T01SK5_A795PrvNum, T01SK5_A856ValCod
            }
            , new Object[] {
            T01SK6_A847UltLinEnt, T01SK6_A704PrdExiAlm, T01SK6_A726PrdPreMed, T01SK6_A750PrdValStk, T01SK6_A718PrdNom, T01SK6_A724PrdPreAct, T01SK6_A698PrdDetPar, T01SK6_A713PrdFulEnt, T01SK6_A684PrdCanPen, T01SK6_A729PrdRotRea,
            T01SK6_A727PrdRec, T01SK6_A725PrdPreAnt, T01SK6_A709PrdFecPre, T01SK6_A5255PrdPreAc2, T01SK6_A705PrdExiCC, T01SK6_A795PrvNum, T01SK6_A856ValCod
            }
            , new Object[] {
            T01SK7_A661PedFec, T01SK7_A667PedSit, T01SK7_A666PedPri, T01SK7_A12580PedAlmc
            }
            , new Object[] {
            T01SK8_A657PedCanEnt, T01SK8_A665PedPre, T01SK8_A669PedUni, T01SK8_A663PedFulEnt, T01SK8_A659PedCum, T01SK8_A660PedDto
            }
            , new Object[] {
            T01SK9_A657PedCanEnt, T01SK9_A665PedPre, T01SK9_A669PedUni, T01SK9_A663PedFulEnt, T01SK9_A659PedCum, T01SK9_A660PedDto
            }
            , new Object[] {
            T01SK10_A794PrvNom, T01SK10_n794PrvNom, T01SK10_A800PrvPri, T01SK10_n800PrvPri
            }
            , new Object[] {
            T01SK12_A913StockRem, T01SK12_n913StockRem
            }
            , new Object[] {
            T01SK14_A597LinEnt, T01SK14_A847UltLinEnt, T01SK14_A704PrdExiAlm, T01SK14_A411EntCon, T01SK14_A657PedCanEnt, T01SK14_A3404EntPedCum, T01SK14_A419EntUniRem, T01SK14_A417EntPre, T01SK14_A726PrdPreMed, T01SK14_A750PrdValStk,
            T01SK14_A718PrdNom, T01SK14_A794PrvNom, T01SK14_n794PrvNom, T01SK14_A724PrdPreAct, T01SK14_A698PrdDetPar, T01SK14_A713PrdFulEnt, T01SK14_A684PrdCanPen, T01SK14_A729PrdRotRea, T01SK14_A727PrdRec, T01SK14_A725PrdPreAnt,
            T01SK14_A709PrdFecPre, T01SK14_A407EmprNom, T01SK14_n407EmprNom, T01SK14_A800PrvPri, T01SK14_n800PrvPri, T01SK14_A3915EmpNumDec, T01SK14_n3915EmpNumDec, T01SK14_A5255PrdPreAc2, T01SK14_A705PrdExiCC, T01SK14_A415EntFecEnt,
            T01SK14_A11Albaran, T01SK14_A12857EntNAlbar, T01SK14_A6156EntPrvNum, T01SK14_n6156EntPrvNum, T01SK14_A661PedFec, T01SK14_A418EntUniEnt, T01SK14_A665PedPre, T01SK14_A669PedUni, T01SK14_A416EntNumCon, T01SK14_A5686EntLotN,
            T01SK14_A5685EntFVal, T01SK14_A414EntEti, T01SK14_A413EntConIni, T01SK14_A412EntConFin, T01SK14_A663PedFulEnt, T01SK14_A659PedCum, T01SK14_A667PedSit, T01SK14_A666PedPri, T01SK14_A660PedDto, T01SK14_A5691EntBnc,
            T01SK14_A7695EntCC, T01SK14_A7696EntCCoCod, T01SK14_A10782EntUniAlb, T01SK14_A10783EntObs, T01SK14_A10187EntRemNro, T01SK14_A10186EntRemFch, T01SK14_A10185EntRemSuc, T01SK14_A10184EntRemTpo, T01SK14_A12580PedAlmc, T01SK14_A12716EntFabId,
            T01SK14_A13235EntLoteID, T01SK14_A13456EntUbicaci, T01SK14_A5690EntHfCon, T01SK14_A5689EntFfCon, T01SK14_A5688EntHiCon, T01SK14_A5687EntFiCon, T01SK14_A396EmprCod, T01SK14_A719PrdNum, T01SK14_A658PedCod, T01SK14_n658PedCod,
            T01SK14_A795PrvNum, T01SK14_A856ValCod, T01SK14_A913StockRem, T01SK14_n913StockRem
            }
            , new Object[] {
            T01SK15_A661PedFec, T01SK15_A667PedSit, T01SK15_A666PedPri, T01SK15_A12580PedAlmc
            }
            , new Object[] {
            T01SK16_A794PrvNom, T01SK16_n794PrvNom, T01SK16_A800PrvPri, T01SK16_n800PrvPri
            }
            , new Object[] {
            T01SK18_A913StockRem, T01SK18_n913StockRem
            }
            , new Object[] {
            T01SK19_A396EmprCod, T01SK19_A719PrdNum, T01SK19_A597LinEnt
            }
            , new Object[] {
            T01SK20_A396EmprCod, T01SK20_A719PrdNum, T01SK20_A597LinEnt, T01SK20_A411EntCon
            }
            , new Object[] {
            T01SK21_A396EmprCod, T01SK21_A719PrdNum, T01SK21_A597LinEnt, T01SK21_A411EntCon
            }
            , new Object[] {
            T01SK22_A847UltLinEnt, T01SK22_A704PrdExiAlm, T01SK22_A726PrdPreMed, T01SK22_A750PrdValStk, T01SK22_A718PrdNom, T01SK22_A724PrdPreAct, T01SK22_A698PrdDetPar, T01SK22_A713PrdFulEnt, T01SK22_A684PrdCanPen, T01SK22_A729PrdRotRea,
            T01SK22_A727PrdRec, T01SK22_A725PrdPreAnt, T01SK22_A709PrdFecPre, T01SK22_A5255PrdPreAc2, T01SK22_A705PrdExiCC, T01SK22_A795PrvNum, T01SK22_A856ValCod
            }
            , new Object[] {
            T01SK23_A657PedCanEnt, T01SK23_A665PedPre, T01SK23_A669PedUni, T01SK23_A663PedFulEnt, T01SK23_A659PedCum, T01SK23_A660PedDto
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01SK27_A847UltLinEnt, T01SK27_A704PrdExiAlm, T01SK27_A726PrdPreMed, T01SK27_A750PrdValStk, T01SK27_A718PrdNom, T01SK27_A724PrdPreAct, T01SK27_A698PrdDetPar, T01SK27_A713PrdFulEnt, T01SK27_A684PrdCanPen, T01SK27_A729PrdRotRea,
            T01SK27_A727PrdRec, T01SK27_A725PrdPreAnt, T01SK27_A709PrdFecPre, T01SK27_A5255PrdPreAc2, T01SK27_A705PrdExiCC, T01SK27_A795PrvNum, T01SK27_A856ValCod
            }
            , new Object[] {
            T01SK28_A661PedFec, T01SK28_A667PedSit, T01SK28_A666PedPri, T01SK28_A12580PedAlmc
            }
            , new Object[] {
            T01SK29_A657PedCanEnt, T01SK29_A665PedPre, T01SK29_A669PedUni, T01SK29_A663PedFulEnt, T01SK29_A659PedCum, T01SK29_A660PedDto
            }
            , new Object[] {
            T01SK30_A794PrvNom, T01SK30_n794PrvNom, T01SK30_A800PrvPri, T01SK30_n800PrvPri
            }
            , new Object[] {
            T01SK32_A913StockRem, T01SK32_n913StockRem
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01SK35_A396EmprCod, T01SK35_A719PrdNum, T01SK35_A597LinEnt
            }
            , new Object[] {
            T01SK36_A396EmprCod, T01SK36_A658PedCod, T01SK36_A719PrdNum, T01SK36_A659PedCum
            }
         }
      );
      Z396EmprCod = "" ;
      E396EmprCod = "" ;
      A396EmprCod = "" ;
      AV45Pgmname = "StocksQuimicos.EntradaProducto_TRN" ;
      Z411EntCon = (byte)(0) ;
      A411EntCon = (byte)(0) ;
      i411EntCon = (byte)(0) ;
      Z3404EntPedCum = httpContext.getMessage( "N", "") ;
      N3404EntPedCum = httpContext.getMessage( "N", "") ;
      A3404EntPedCum = httpContext.getMessage( "N", "") ;
      Z10184EntRemTpo = " " ;
      A10184EntRemTpo = " " ;
      i10184EntRemTpo = " " ;
      Z415EntFecEnt = GXutil.today( ) ;
      O415EntFecEnt = GXutil.today( ) ;
      N415EntFecEnt = GXutil.today( ) ;
      i415EntFecEnt = GXutil.today( ) ;
      A415EntFecEnt = GXutil.today( ) ;
      Z6156EntPrvNum = 0 ;
      n6156EntPrvNum = false ;
      N6156EntPrvNum = 0 ;
      n6156EntPrvNum = false ;
      A6156EntPrvNum = 0 ;
      n6156EntPrvNum = false ;
      Z12716EntFabId = 0 ;
      A12716EntFabId = 0 ;
   }

   private byte Z411EntCon ;
   private byte Z414EntEti ;
   private byte Z856ValCod ;
   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte A411EntCon ;
   private byte A414EntEti ;
   private byte A856ValCod ;
   private byte Gx_BScreen ;
   private byte A800PrvPri ;
   private byte AV43MesAnt ;
   private byte A3915EmpNumDec ;
   private byte A12580PedAlmc ;
   private byte Z3915EmpNumDec ;
   private byte Z800PrvPri ;
   private byte Z12580PedAlmc ;
   private byte gxajaxcallmode ;
   private byte i411EntCon ;
   private byte GXt_int5 ;
   private byte GXv_int19[] ;
   private byte GXv_int6[] ;
   private byte GXv_int20[] ;
   private byte ZV43MesAnt ;
   private short wcpOAV9LinEnt ;
   private short Z597LinEnt ;
   private short Z416EntNumCon ;
   private short Z7696EntCCoCod ;
   private short O847UltLinEnt ;
   private short A597LinEnt ;
   private short AV9LinEnt ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A416EntNumCon ;
   private short A7696EntCCoCod ;
   private short A847UltLinEnt ;
   private short AV32Year ;
   private short AV34Mes ;
   private short AV42AnyAnt ;
   private short AV30Consumos ;
   private short AV33DiasFin ;
   private short A664PedNumLin ;
   private short AV31Nalbaran20 ;
   private short RcdFound42 ;
   private short AV29NoUpd ;
   private short Z847UltLinEnt ;
   private short nIsDirty_42 ;
   private short GXv_int17[] ;
   private short GXv_int14[] ;
   private short GXv_int18[] ;
   private short ZO847UltLinEnt ;
   private short ZV32Year ;
   private short ZV34Mes ;
   private short ZV42AnyAnt ;
   private short ZV33DiasFin ;
   private short Z664PedNumLin ;
   private int Z6156EntPrvNum ;
   private int Z413EntConIni ;
   private int Z412EntConFin ;
   private int Z12716EntFabId ;
   private int Z658PedCod ;
   private int Z795PrvNum ;
   private int N658PedCod ;
   private int N6156EntPrvNum ;
   private int A6156EntPrvNum ;
   private int A658PedCod ;
   private int A795PrvNum ;
   private int trnEnded ;
   private int edtPrdNum_Enabled ;
   private int edtPrdNom_Enabled ;
   private int edtLinEnt_Enabled ;
   private int edtEntFecEnt_Enabled ;
   private int edtAlbaran_Visible ;
   private int edtAlbaran_Enabled ;
   private int edtEntNAlbar_Visible ;
   private int edtEntNAlbar_Enabled ;
   private int edtPedCod_Enabled ;
   private int edtEntPrvNum_Enabled ;
   private int edtEntUniEnt_Enabled ;
   private int edtEntPre_Enabled ;
   private int edtEntLotN_Enabled ;
   private int edtEntFVal_Enabled ;
   private int bttBtntrn_enter_Visible ;
   private int bttBtntrn_enter_Enabled ;
   private int bttBtntrn_cancel_Visible ;
   private int bttBtntrn_delete_Visible ;
   private int bttBtntrn_delete_Enabled ;
   private int edtavPgmname_Enabled ;
   private int edtEntPedCum_Visible ;
   private int edtEntPedCum_Enabled ;
   private int edtEntUniRem_Enabled ;
   private int edtEntUniRem_Visible ;
   private int A413EntConIni ;
   private int A412EntConFin ;
   private int A12716EntFabId ;
   private int AV13Insert_PedCod ;
   private int GXt_int7 ;
   private int AV46GXV1 ;
   private int GX_JID ;
   private int idxLst ;
   private int GXv_int24[] ;
   private int GXv_int8[] ;
   private int GXv_int29[] ;
   private int Gx_cnt ;
   private int E658PedCod ;
   private long Z13235EntLoteID ;
   private long A13235EntLoteID ;
   private java.math.BigDecimal Z419EntUniRem ;
   private java.math.BigDecimal Z417EntPre ;
   private java.math.BigDecimal Z418EntUniEnt ;
   private java.math.BigDecimal Z10782EntUniAlb ;
   private java.math.BigDecimal Z726PrdPreMed ;
   private java.math.BigDecimal Z724PrdPreAct ;
   private java.math.BigDecimal Z684PrdCanPen ;
   private java.math.BigDecimal Z729PrdRotRea ;
   private java.math.BigDecimal Z725PrdPreAnt ;
   private java.math.BigDecimal Z5255PrdPreAc2 ;
   private java.math.BigDecimal Z705PrdExiCC ;
   private java.math.BigDecimal Z665PedPre ;
   private java.math.BigDecimal Z669PedUni ;
   private java.math.BigDecimal Z660PedDto ;
   private java.math.BigDecimal O750PrdValStk ;
   private java.math.BigDecimal O419EntUniRem ;
   private java.math.BigDecimal O418EntUniEnt ;
   private java.math.BigDecimal O657PedCanEnt ;
   private java.math.BigDecimal O704PrdExiAlm ;
   private java.math.BigDecimal O417EntPre ;
   private java.math.BigDecimal N418EntUniEnt ;
   private java.math.BigDecimal N417EntPre ;
   private java.math.BigDecimal A418EntUniEnt ;
   private java.math.BigDecimal A417EntPre ;
   private java.math.BigDecimal A419EntUniRem ;
   private java.math.BigDecimal A10782EntUniAlb ;
   private java.math.BigDecimal A726PrdPreMed ;
   private java.math.BigDecimal A724PrdPreAct ;
   private java.math.BigDecimal A684PrdCanPen ;
   private java.math.BigDecimal A729PrdRotRea ;
   private java.math.BigDecimal A725PrdPreAnt ;
   private java.math.BigDecimal A5255PrdPreAc2 ;
   private java.math.BigDecimal A705PrdExiCC ;
   private java.math.BigDecimal A665PedPre ;
   private java.math.BigDecimal A669PedUni ;
   private java.math.BigDecimal A660PedDto ;
   private java.math.BigDecimal AV23OldEntPre ;
   private java.math.BigDecimal A704PrdExiAlm ;
   private java.math.BigDecimal AV35OldExiAlm ;
   private java.math.BigDecimal AV36OldEntUni ;
   private java.math.BigDecimal AV37OldRemanente ;
   private java.math.BigDecimal AV40UniOld ;
   private java.math.BigDecimal AV41PrecAnt ;
   private java.math.BigDecimal A657PedCanEnt ;
   private java.math.BigDecimal A750PrdValStk ;
   private java.math.BigDecimal A913StockRem ;
   private java.math.BigDecimal Z704PrdExiAlm ;
   private java.math.BigDecimal Z750PrdValStk ;
   private java.math.BigDecimal Z913StockRem ;
   private java.math.BigDecimal Z657PedCanEnt ;
   private java.math.BigDecimal GXv_decimal21[] ;
   private java.math.BigDecimal GXv_decimal16[] ;
   private java.math.BigDecimal GXv_decimal15[] ;
   private java.math.BigDecimal GXv_decimal13[] ;
   private java.math.BigDecimal GXv_decimal28[] ;
   private java.math.BigDecimal ZO704PrdExiAlm ;
   private java.math.BigDecimal ZO750PrdValStk ;
   private java.math.BigDecimal ZO657PedCanEnt ;
   private java.math.BigDecimal ZV36OldEntUni ;
   private java.math.BigDecimal ZV40UniOld ;
   private java.math.BigDecimal ZV35OldExiAlm ;
   private java.math.BigDecimal ZV37OldRemanente ;
   private java.math.BigDecimal ZV23OldEntPre ;
   private java.math.BigDecimal ZV41PrecAnt ;
   private String sPrefix ;
   private String wcpOGx_mode ;
   private String wcpOAV7EmprCod ;
   private String wcpOAV8PrdNum ;
   private String Z396EmprCod ;
   private String Z719PrdNum ;
   private String Z3404EntPedCum ;
   private String Z11Albaran ;
   private String Z12857EntNAlbar ;
   private String Z5686EntLotN ;
   private String Z5691EntBnc ;
   private String Z7695EntCC ;
   private String Z10783EntObs ;
   private String Z10187EntRemNro ;
   private String Z10185EntRemSuc ;
   private String Z10184EntRemTpo ;
   private String Z13456EntUbicaci ;
   private String Z718PrdNom ;
   private String Z698PrdDetPar ;
   private String Z727PrdRec ;
   private String Z659PedCum ;
   private String O5686EntLotN ;
   private String N11Albaran ;
   private String N12857EntNAlbar ;
   private String N5686EntLotN ;
   private String N3404EntPedCum ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String AV45Pgmname ;
   private String AV26UsurCod ;
   private String AV27Station ;
   private String Gx_mode ;
   private String AV22PedPri ;
   private String A719PrdNum ;
   private String A718PrdNom ;
   private String AV7EmprCod ;
   private String AV8PrdNum ;
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
   private String TempTags ;
   private String edtPrdNum_Jsonclick ;
   private String edtPrdNom_Internalname ;
   private String edtPrdNom_Jsonclick ;
   private String divUnnamedtable1_Internalname ;
   private String Dvpanel_unnamedtable2_Width ;
   private String Dvpanel_unnamedtable2_Cls ;
   private String Dvpanel_unnamedtable2_Title ;
   private String Dvpanel_unnamedtable2_Iconposition ;
   private String Dvpanel_unnamedtable2_Internalname ;
   private String divUnnamedtable2_Internalname ;
   private String divUnnamedtable3_Internalname ;
   private String edtLinEnt_Internalname ;
   private String edtLinEnt_Jsonclick ;
   private String edtEntFecEnt_Internalname ;
   private String edtEntFecEnt_Jsonclick ;
   private String divAlbaran_cell_Internalname ;
   private String divAlbaran_cell_Class ;
   private String edtAlbaran_Internalname ;
   private String A11Albaran ;
   private String edtAlbaran_Jsonclick ;
   private String divEntnalbar_cell_Internalname ;
   private String divEntnalbar_cell_Class ;
   private String edtEntNAlbar_Internalname ;
   private String A12857EntNAlbar ;
   private String edtEntNAlbar_Jsonclick ;
   private String edtPedCod_Internalname ;
   private String edtPedCod_Jsonclick ;
   private String edtEntPrvNum_Internalname ;
   private String edtEntPrvNum_Jsonclick ;
   private String divUnnamedtable4_Internalname ;
   private String edtEntUniEnt_Internalname ;
   private String edtEntUniEnt_Jsonclick ;
   private String edtEntPre_Internalname ;
   private String edtEntPre_Jsonclick ;
   private String edtEntLotN_Internalname ;
   private String A5686EntLotN ;
   private String edtEntLotN_Jsonclick ;
   private String edtEntFVal_Internalname ;
   private String edtEntFVal_Jsonclick ;
   private String divUnnamedtable5_Internalname ;
   private String bttBtntrn_enter_Internalname ;
   private String bttBtntrn_enter_Jsonclick ;
   private String bttBtntrn_cancel_Internalname ;
   private String bttBtntrn_cancel_Jsonclick ;
   private String bttBtntrn_delete_Internalname ;
   private String bttBtntrn_delete_Jsonclick ;
   private String edtavPgmname_Internalname ;
   private String edtavPgmname_Jsonclick ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String edtEntPedCum_Internalname ;
   private String A3404EntPedCum ;
   private String edtEntPedCum_Jsonclick ;
   private String edtEntUniRem_Internalname ;
   private String edtEntUniRem_Jsonclick ;
   private String A5691EntBnc ;
   private String A7695EntCC ;
   private String A10783EntObs ;
   private String A10187EntRemNro ;
   private String A10185EntRemSuc ;
   private String A10184EntRemTpo ;
   private String A13456EntUbicaci ;
   private String A698PrdDetPar ;
   private String A727PrdRec ;
   private String A659PedCum ;
   private String A666PedPri ;
   private String AV38oldlote ;
   private String A407EmprNom ;
   private String A667PedSit ;
   private String A794PrvNom ;
   private String Dvpanel_tableattributes_Objectcall ;
   private String Dvpanel_tableattributes_Class ;
   private String Dvpanel_tableattributes_Height ;
   private String Dvpanel_unnamedtable2_Objectcall ;
   private String Dvpanel_unnamedtable2_Class ;
   private String Dvpanel_unnamedtable2_Height ;
   private String hsh ;
   private String sMode42 ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String AV28EmprNom ;
   private String GXt_char1 ;
   private String imgPedcodprompt_gximage ;
   private String imgPedcodprompt_Internalname ;
   private String Z407EmprNom ;
   private String Z794PrvNom ;
   private String Z667PedSit ;
   private String Z666PedPri ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String i10184EntRemTpo ;
   private String GXv_char25[] ;
   private String GXv_char23[] ;
   private String GXv_char12[] ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String GXv_char27[] ;
   private String GXv_char26[] ;
   private String GXv_char31[] ;
   private String GXv_char30[] ;
   private String ZV22PedPri ;
   private String ZV38oldlote ;
   private String E396EmprCod ;
   private java.util.Date Z5690EntHfCon ;
   private java.util.Date Z5688EntHiCon ;
   private java.util.Date A5690EntHfCon ;
   private java.util.Date A5688EntHiCon ;
   private java.util.Date Z415EntFecEnt ;
   private java.util.Date Z5685EntFVal ;
   private java.util.Date Z10186EntRemFch ;
   private java.util.Date Z5689EntFfCon ;
   private java.util.Date Z5687EntFiCon ;
   private java.util.Date Z713PrdFulEnt ;
   private java.util.Date Z709PrdFecPre ;
   private java.util.Date Z663PedFulEnt ;
   private java.util.Date O415EntFecEnt ;
   private java.util.Date N415EntFecEnt ;
   private java.util.Date N5685EntFVal ;
   private java.util.Date A415EntFecEnt ;
   private java.util.Date A5685EntFVal ;
   private java.util.Date A10186EntRemFch ;
   private java.util.Date A5689EntFfCon ;
   private java.util.Date A5687EntFiCon ;
   private java.util.Date A713PrdFulEnt ;
   private java.util.Date A709PrdFecPre ;
   private java.util.Date A663PedFulEnt ;
   private java.util.Date A14040PrdUltMovF ;
   private java.util.Date A3835UltFecCCs ;
   private java.util.Date AV24oldEntFecent ;
   private java.util.Date AV39FecAnt ;
   private java.util.Date AV21Fecha ;
   private java.util.Date A661PedFec ;
   private java.util.Date Z661PedFec ;
   private java.util.Date i415EntFecEnt ;
   private java.util.Date GXv_date11[] ;
   private java.util.Date GXt_date10 ;
   private java.util.Date GXv_date22[] ;
   private java.util.Date Z14040PrdUltMovF ;
   private java.util.Date Z3835UltFecCCs ;
   private java.util.Date ZV21Fecha ;
   private java.util.Date ZV24oldEntFecent ;
   private java.util.Date ZV39FecAnt ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n6156EntPrvNum ;
   private boolean n658PedCod ;
   private boolean wbErr ;
   private boolean Dvpanel_tableattributes_Autowidth ;
   private boolean Dvpanel_tableattributes_Autoheight ;
   private boolean Dvpanel_tableattributes_Collapsible ;
   private boolean Dvpanel_tableattributes_Collapsed ;
   private boolean Dvpanel_tableattributes_Showcollapseicon ;
   private boolean Dvpanel_tableattributes_Autoscroll ;
   private boolean Dvpanel_unnamedtable2_Autowidth ;
   private boolean Dvpanel_unnamedtable2_Autoheight ;
   private boolean Dvpanel_unnamedtable2_Collapsible ;
   private boolean Dvpanel_unnamedtable2_Collapsed ;
   private boolean Dvpanel_unnamedtable2_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable2_Autoscroll ;
   private boolean n800PrvPri ;
   private boolean n407EmprNom ;
   private boolean n3915EmpNumDec ;
   private boolean n794PrvNom ;
   private boolean n913StockRem ;
   private boolean Dvpanel_tableattributes_Enabled ;
   private boolean Dvpanel_tableattributes_Showheader ;
   private boolean Dvpanel_tableattributes_Visible ;
   private boolean Dvpanel_unnamedtable2_Enabled ;
   private boolean Dvpanel_unnamedtable2_Showheader ;
   private boolean Dvpanel_unnamedtable2_Visible ;
   private boolean returnInSub ;
   private boolean Gx_longc ;
   private boolean Gx_first ;
   private boolean nA658PedCod ;
   private String AV25Inc_obs ;
   private String AV47Pedcodprompt_GXI ;
   private String AV15PedCodPrompt ;
   private com.genexus.webpanels.WebSession AV12WebSession ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableattributes ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable2 ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private IDataStoreProvider pr_default ;
   private String[] T01SK4_A407EmprNom ;
   private boolean[] T01SK4_n407EmprNom ;
   private byte[] T01SK4_A3915EmpNumDec ;
   private boolean[] T01SK4_n3915EmpNumDec ;
   private short[] T01SK6_A847UltLinEnt ;
   private java.math.BigDecimal[] T01SK6_A704PrdExiAlm ;
   private java.math.BigDecimal[] T01SK6_A726PrdPreMed ;
   private java.math.BigDecimal[] T01SK6_A750PrdValStk ;
   private String[] T01SK6_A718PrdNom ;
   private java.math.BigDecimal[] T01SK6_A724PrdPreAct ;
   private String[] T01SK6_A698PrdDetPar ;
   private java.util.Date[] T01SK6_A713PrdFulEnt ;
   private java.math.BigDecimal[] T01SK6_A684PrdCanPen ;
   private java.math.BigDecimal[] T01SK6_A729PrdRotRea ;
   private String[] T01SK6_A727PrdRec ;
   private java.math.BigDecimal[] T01SK6_A725PrdPreAnt ;
   private java.util.Date[] T01SK6_A709PrdFecPre ;
   private java.math.BigDecimal[] T01SK6_A5255PrdPreAc2 ;
   private java.math.BigDecimal[] T01SK6_A705PrdExiCC ;
   private int[] T01SK6_A795PrvNum ;
   private byte[] T01SK6_A856ValCod ;
   private String[] T01SK10_A794PrvNom ;
   private boolean[] T01SK10_n794PrvNom ;
   private byte[] T01SK10_A800PrvPri ;
   private boolean[] T01SK10_n800PrvPri ;
   private java.math.BigDecimal[] T01SK12_A913StockRem ;
   private boolean[] T01SK12_n913StockRem ;
   private java.util.Date[] T01SK7_A661PedFec ;
   private String[] T01SK7_A667PedSit ;
   private String[] T01SK7_A666PedPri ;
   private byte[] T01SK7_A12580PedAlmc ;
   private java.math.BigDecimal[] T01SK9_A657PedCanEnt ;
   private java.math.BigDecimal[] T01SK9_A665PedPre ;
   private java.math.BigDecimal[] T01SK9_A669PedUni ;
   private java.util.Date[] T01SK9_A663PedFulEnt ;
   private String[] T01SK9_A659PedCum ;
   private java.math.BigDecimal[] T01SK9_A660PedDto ;
   private short[] T01SK14_A597LinEnt ;
   private short[] T01SK14_A847UltLinEnt ;
   private java.math.BigDecimal[] T01SK14_A704PrdExiAlm ;
   private byte[] T01SK14_A411EntCon ;
   private java.math.BigDecimal[] T01SK14_A657PedCanEnt ;
   private String[] T01SK14_A3404EntPedCum ;
   private java.math.BigDecimal[] T01SK14_A419EntUniRem ;
   private java.math.BigDecimal[] T01SK14_A417EntPre ;
   private java.math.BigDecimal[] T01SK14_A726PrdPreMed ;
   private java.math.BigDecimal[] T01SK14_A750PrdValStk ;
   private String[] T01SK14_A718PrdNom ;
   private String[] T01SK14_A794PrvNom ;
   private boolean[] T01SK14_n794PrvNom ;
   private java.math.BigDecimal[] T01SK14_A724PrdPreAct ;
   private String[] T01SK14_A698PrdDetPar ;
   private java.util.Date[] T01SK14_A713PrdFulEnt ;
   private java.math.BigDecimal[] T01SK14_A684PrdCanPen ;
   private java.math.BigDecimal[] T01SK14_A729PrdRotRea ;
   private String[] T01SK14_A727PrdRec ;
   private java.math.BigDecimal[] T01SK14_A725PrdPreAnt ;
   private java.util.Date[] T01SK14_A709PrdFecPre ;
   private String[] T01SK14_A407EmprNom ;
   private boolean[] T01SK14_n407EmprNom ;
   private byte[] T01SK14_A800PrvPri ;
   private boolean[] T01SK14_n800PrvPri ;
   private byte[] T01SK14_A3915EmpNumDec ;
   private boolean[] T01SK14_n3915EmpNumDec ;
   private java.math.BigDecimal[] T01SK14_A5255PrdPreAc2 ;
   private java.math.BigDecimal[] T01SK14_A705PrdExiCC ;
   private java.util.Date[] T01SK14_A415EntFecEnt ;
   private String[] T01SK14_A11Albaran ;
   private String[] T01SK14_A12857EntNAlbar ;
   private int[] T01SK14_A6156EntPrvNum ;
   private boolean[] T01SK14_n6156EntPrvNum ;
   private java.util.Date[] T01SK14_A661PedFec ;
   private java.math.BigDecimal[] T01SK14_A418EntUniEnt ;
   private java.math.BigDecimal[] T01SK14_A665PedPre ;
   private java.math.BigDecimal[] T01SK14_A669PedUni ;
   private short[] T01SK14_A416EntNumCon ;
   private String[] T01SK14_A5686EntLotN ;
   private java.util.Date[] T01SK14_A5685EntFVal ;
   private byte[] T01SK14_A414EntEti ;
   private int[] T01SK14_A413EntConIni ;
   private int[] T01SK14_A412EntConFin ;
   private java.util.Date[] T01SK14_A663PedFulEnt ;
   private String[] T01SK14_A659PedCum ;
   private String[] T01SK14_A667PedSit ;
   private String[] T01SK14_A666PedPri ;
   private java.math.BigDecimal[] T01SK14_A660PedDto ;
   private String[] T01SK14_A5691EntBnc ;
   private String[] T01SK14_A7695EntCC ;
   private short[] T01SK14_A7696EntCCoCod ;
   private java.math.BigDecimal[] T01SK14_A10782EntUniAlb ;
   private String[] T01SK14_A10783EntObs ;
   private String[] T01SK14_A10187EntRemNro ;
   private java.util.Date[] T01SK14_A10186EntRemFch ;
   private String[] T01SK14_A10185EntRemSuc ;
   private String[] T01SK14_A10184EntRemTpo ;
   private byte[] T01SK14_A12580PedAlmc ;
   private int[] T01SK14_A12716EntFabId ;
   private long[] T01SK14_A13235EntLoteID ;
   private String[] T01SK14_A13456EntUbicaci ;
   private java.util.Date[] T01SK14_A5690EntHfCon ;
   private java.util.Date[] T01SK14_A5689EntFfCon ;
   private java.util.Date[] T01SK14_A5688EntHiCon ;
   private java.util.Date[] T01SK14_A5687EntFiCon ;
   private String[] T01SK14_A396EmprCod ;
   private String[] T01SK14_A719PrdNum ;
   private int[] T01SK14_A658PedCod ;
   private boolean[] T01SK14_n658PedCod ;
   private int[] T01SK14_A795PrvNum ;
   private byte[] T01SK14_A856ValCod ;
   private java.math.BigDecimal[] T01SK14_A913StockRem ;
   private boolean[] T01SK14_n913StockRem ;
   private java.util.Date[] T01SK15_A661PedFec ;
   private String[] T01SK15_A667PedSit ;
   private String[] T01SK15_A666PedPri ;
   private byte[] T01SK15_A12580PedAlmc ;
   private String[] T01SK16_A794PrvNom ;
   private boolean[] T01SK16_n794PrvNom ;
   private byte[] T01SK16_A800PrvPri ;
   private boolean[] T01SK16_n800PrvPri ;
   private java.math.BigDecimal[] T01SK18_A913StockRem ;
   private boolean[] T01SK18_n913StockRem ;
   private String[] T01SK19_A396EmprCod ;
   private String[] T01SK19_A719PrdNum ;
   private short[] T01SK19_A597LinEnt ;
   private short[] T01SK3_A597LinEnt ;
   private byte[] T01SK3_A411EntCon ;
   private String[] T01SK3_A3404EntPedCum ;
   private java.math.BigDecimal[] T01SK3_A419EntUniRem ;
   private java.math.BigDecimal[] T01SK3_A417EntPre ;
   private java.util.Date[] T01SK3_A415EntFecEnt ;
   private String[] T01SK3_A11Albaran ;
   private String[] T01SK3_A12857EntNAlbar ;
   private int[] T01SK3_A6156EntPrvNum ;
   private boolean[] T01SK3_n6156EntPrvNum ;
   private java.math.BigDecimal[] T01SK3_A418EntUniEnt ;
   private short[] T01SK3_A416EntNumCon ;
   private String[] T01SK3_A5686EntLotN ;
   private java.util.Date[] T01SK3_A5685EntFVal ;
   private byte[] T01SK3_A414EntEti ;
   private int[] T01SK3_A413EntConIni ;
   private int[] T01SK3_A412EntConFin ;
   private String[] T01SK3_A5691EntBnc ;
   private String[] T01SK3_A7695EntCC ;
   private short[] T01SK3_A7696EntCCoCod ;
   private java.math.BigDecimal[] T01SK3_A10782EntUniAlb ;
   private String[] T01SK3_A10783EntObs ;
   private String[] T01SK3_A10187EntRemNro ;
   private java.util.Date[] T01SK3_A10186EntRemFch ;
   private String[] T01SK3_A10185EntRemSuc ;
   private String[] T01SK3_A10184EntRemTpo ;
   private int[] T01SK3_A12716EntFabId ;
   private long[] T01SK3_A13235EntLoteID ;
   private String[] T01SK3_A13456EntUbicaci ;
   private java.util.Date[] T01SK3_A5690EntHfCon ;
   private java.util.Date[] T01SK3_A5689EntFfCon ;
   private java.util.Date[] T01SK3_A5688EntHiCon ;
   private java.util.Date[] T01SK3_A5687EntFiCon ;
   private String[] T01SK3_A396EmprCod ;
   private String[] T01SK3_A719PrdNum ;
   private int[] T01SK3_A658PedCod ;
   private boolean[] T01SK3_n658PedCod ;
   private String[] T01SK20_A396EmprCod ;
   private String[] T01SK20_A719PrdNum ;
   private short[] T01SK20_A597LinEnt ;
   private byte[] T01SK20_A411EntCon ;
   private String[] T01SK21_A396EmprCod ;
   private String[] T01SK21_A719PrdNum ;
   private short[] T01SK21_A597LinEnt ;
   private byte[] T01SK21_A411EntCon ;
   private short[] T01SK2_A597LinEnt ;
   private byte[] T01SK2_A411EntCon ;
   private String[] T01SK2_A3404EntPedCum ;
   private java.math.BigDecimal[] T01SK2_A419EntUniRem ;
   private java.math.BigDecimal[] T01SK2_A417EntPre ;
   private java.util.Date[] T01SK2_A415EntFecEnt ;
   private String[] T01SK2_A11Albaran ;
   private String[] T01SK2_A12857EntNAlbar ;
   private int[] T01SK2_A6156EntPrvNum ;
   private boolean[] T01SK2_n6156EntPrvNum ;
   private java.math.BigDecimal[] T01SK2_A418EntUniEnt ;
   private short[] T01SK2_A416EntNumCon ;
   private String[] T01SK2_A5686EntLotN ;
   private java.util.Date[] T01SK2_A5685EntFVal ;
   private byte[] T01SK2_A414EntEti ;
   private int[] T01SK2_A413EntConIni ;
   private int[] T01SK2_A412EntConFin ;
   private String[] T01SK2_A5691EntBnc ;
   private String[] T01SK2_A7695EntCC ;
   private short[] T01SK2_A7696EntCCoCod ;
   private java.math.BigDecimal[] T01SK2_A10782EntUniAlb ;
   private String[] T01SK2_A10783EntObs ;
   private String[] T01SK2_A10187EntRemNro ;
   private java.util.Date[] T01SK2_A10186EntRemFch ;
   private String[] T01SK2_A10185EntRemSuc ;
   private String[] T01SK2_A10184EntRemTpo ;
   private int[] T01SK2_A12716EntFabId ;
   private long[] T01SK2_A13235EntLoteID ;
   private String[] T01SK2_A13456EntUbicaci ;
   private java.util.Date[] T01SK2_A5690EntHfCon ;
   private java.util.Date[] T01SK2_A5689EntFfCon ;
   private java.util.Date[] T01SK2_A5688EntHiCon ;
   private java.util.Date[] T01SK2_A5687EntFiCon ;
   private String[] T01SK2_A396EmprCod ;
   private String[] T01SK2_A719PrdNum ;
   private int[] T01SK2_A658PedCod ;
   private boolean[] T01SK2_n658PedCod ;
   private short[] T01SK22_A847UltLinEnt ;
   private java.math.BigDecimal[] T01SK22_A704PrdExiAlm ;
   private java.math.BigDecimal[] T01SK22_A726PrdPreMed ;
   private java.math.BigDecimal[] T01SK22_A750PrdValStk ;
   private String[] T01SK22_A718PrdNom ;
   private java.math.BigDecimal[] T01SK22_A724PrdPreAct ;
   private String[] T01SK22_A698PrdDetPar ;
   private java.util.Date[] T01SK22_A713PrdFulEnt ;
   private java.math.BigDecimal[] T01SK22_A684PrdCanPen ;
   private java.math.BigDecimal[] T01SK22_A729PrdRotRea ;
   private String[] T01SK22_A727PrdRec ;
   private java.math.BigDecimal[] T01SK22_A725PrdPreAnt ;
   private java.util.Date[] T01SK22_A709PrdFecPre ;
   private java.math.BigDecimal[] T01SK22_A5255PrdPreAc2 ;
   private java.math.BigDecimal[] T01SK22_A705PrdExiCC ;
   private int[] T01SK22_A795PrvNum ;
   private byte[] T01SK22_A856ValCod ;
   private java.math.BigDecimal[] T01SK23_A657PedCanEnt ;
   private java.math.BigDecimal[] T01SK23_A665PedPre ;
   private java.math.BigDecimal[] T01SK23_A669PedUni ;
   private java.util.Date[] T01SK23_A663PedFulEnt ;
   private String[] T01SK23_A659PedCum ;
   private java.math.BigDecimal[] T01SK23_A660PedDto ;
   private short[] T01SK27_A847UltLinEnt ;
   private java.math.BigDecimal[] T01SK27_A704PrdExiAlm ;
   private java.math.BigDecimal[] T01SK27_A726PrdPreMed ;
   private java.math.BigDecimal[] T01SK27_A750PrdValStk ;
   private String[] T01SK27_A718PrdNom ;
   private java.math.BigDecimal[] T01SK27_A724PrdPreAct ;
   private String[] T01SK27_A698PrdDetPar ;
   private java.util.Date[] T01SK27_A713PrdFulEnt ;
   private java.math.BigDecimal[] T01SK27_A684PrdCanPen ;
   private java.math.BigDecimal[] T01SK27_A729PrdRotRea ;
   private String[] T01SK27_A727PrdRec ;
   private java.math.BigDecimal[] T01SK27_A725PrdPreAnt ;
   private java.util.Date[] T01SK27_A709PrdFecPre ;
   private java.math.BigDecimal[] T01SK27_A5255PrdPreAc2 ;
   private java.math.BigDecimal[] T01SK27_A705PrdExiCC ;
   private int[] T01SK27_A795PrvNum ;
   private byte[] T01SK27_A856ValCod ;
   private java.util.Date[] T01SK28_A661PedFec ;
   private String[] T01SK28_A667PedSit ;
   private String[] T01SK28_A666PedPri ;
   private byte[] T01SK28_A12580PedAlmc ;
   private java.math.BigDecimal[] T01SK29_A657PedCanEnt ;
   private java.math.BigDecimal[] T01SK29_A665PedPre ;
   private java.math.BigDecimal[] T01SK29_A669PedUni ;
   private java.util.Date[] T01SK29_A663PedFulEnt ;
   private String[] T01SK29_A659PedCum ;
   private java.math.BigDecimal[] T01SK29_A660PedDto ;
   private String[] T01SK30_A794PrvNom ;
   private boolean[] T01SK30_n794PrvNom ;
   private byte[] T01SK30_A800PrvPri ;
   private boolean[] T01SK30_n800PrvPri ;
   private java.math.BigDecimal[] T01SK32_A913StockRem ;
   private boolean[] T01SK32_n913StockRem ;
   private String[] T01SK35_A396EmprCod ;
   private String[] T01SK35_A719PrdNum ;
   private short[] T01SK35_A597LinEnt ;
   private String[] T01SK36_A396EmprCod ;
   private int[] T01SK36_A658PedCod ;
   private boolean[] T01SK36_n658PedCod ;
   private String[] T01SK36_A719PrdNum ;
   private String[] T01SK36_A659PedCum ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private short[] T01SK5_A847UltLinEnt ;
   private java.math.BigDecimal[] T01SK5_A704PrdExiAlm ;
   private java.math.BigDecimal[] T01SK5_A726PrdPreMed ;
   private java.math.BigDecimal[] T01SK5_A750PrdValStk ;
   private String[] T01SK5_A718PrdNom ;
   private java.math.BigDecimal[] T01SK5_A724PrdPreAct ;
   private String[] T01SK5_A698PrdDetPar ;
   private java.util.Date[] T01SK5_A713PrdFulEnt ;
   private java.math.BigDecimal[] T01SK5_A684PrdCanPen ;
   private java.math.BigDecimal[] T01SK5_A729PrdRotRea ;
   private String[] T01SK5_A727PrdRec ;
   private java.math.BigDecimal[] T01SK5_A725PrdPreAnt ;
   private java.util.Date[] T01SK5_A709PrdFecPre ;
   private java.math.BigDecimal[] T01SK5_A5255PrdPreAc2 ;
   private java.math.BigDecimal[] T01SK5_A705PrdExiCC ;
   private int[] T01SK5_A795PrvNum ;
   private byte[] T01SK5_A856ValCod ;
   private java.math.BigDecimal[] T01SK8_A657PedCanEnt ;
   private java.math.BigDecimal[] T01SK8_A665PedPre ;
   private java.math.BigDecimal[] T01SK8_A669PedUni ;
   private java.util.Date[] T01SK8_A663PedFulEnt ;
   private String[] T01SK8_A659PedCum ;
   private java.math.BigDecimal[] T01SK8_A660PedDto ;
   private com.genexus.webpanels.GXWebForm Form ;
   private app.wwpbaseobjects.SdtWWPContext AV10WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext9[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV11TrnContext ;
   private app.wwpbaseobjects.SdtWWPTransactionContext_Attribute AV14TrnContextAtt ;
}

final  class entradaproducto_trn__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class entradaproducto_trn__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class entradaproducto_trn__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class entradaproducto_trn__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class entradaproducto_trn__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01SK2", "SELECT LinEnt, EntCon, EntPedCum, EntUniRem, EntPre, EntFecEnt, Albaran, EntNAlbar, EntPrvNum, EntUniEnt, EntNumCon, EntLotN, EntFVal, EntEti, EntConIni, EntConFin, EntBnc, EntCC, EntCCoCod, EntUniAlb, EntObs, EntRemNro, EntRemFch, EntRemSuc, EntRemTpo, EntFabId, EntLoteID, EntUbicaci, EntHfCon, EntFfCon, EntHiCon, EntFiCon, EmprCod, PrdNum, PedCod FROM TXPENTALM WHERE EmprCod = ? AND PrdNum = ? AND LinEnt = ?  FOR UPDATE OF EntCon, EntPedCum, EntUniRem, EntPre, EntFecEnt, Albaran, EntNAlbar, EntPrvNum, EntUniEnt, EntNumCon, EntLotN, EntFVal, EntEti, EntConIni, EntConFin, EntBnc, EntCC, EntCCoCod, EntUniAlb, EntObs, EntRemNro, EntRemFch, EntRemSuc, EntRemTpo, EntFabId, EntLoteID, EntUbicaci, EntHfCon, EntFfCon, EntHiCon, EntFiCon, PedCod NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SK3", "SELECT LinEnt, EntCon, EntPedCum, EntUniRem, EntPre, EntFecEnt, Albaran, EntNAlbar, EntPrvNum, EntUniEnt, EntNumCon, EntLotN, EntFVal, EntEti, EntConIni, EntConFin, EntBnc, EntCC, EntCCoCod, EntUniAlb, EntObs, EntRemNro, EntRemFch, EntRemSuc, EntRemTpo, EntFabId, EntLoteID, EntUbicaci, EntHfCon, EntFfCon, EntHiCon, EntFiCon, EmprCod, PrdNum, PedCod FROM TXPENTALM WHERE EmprCod = ? AND PrdNum = ? AND LinEnt = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SK4", "SELECT EmprNom, EmpNumDec FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SK5", "SELECT UltLinEnt, PrdExiAlm, PrdPreMed, PrdValStk, PrdNom, PrdPreAct, PrdDetPar, PrdFulEnt, PrdCanPen, PrdRotRea, PrdRec, PrdPreAnt, PrdFecPre, PrdPreAc2, PrdExiCC, PrvNum, ValCod FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ?  FOR UPDATE OF UltLinEnt, PrdExiAlm, PrdPreMed, PrdValStk NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SK6", "SELECT UltLinEnt, PrdExiAlm, PrdPreMed, PrdValStk, PrdNom, PrdPreAct, PrdDetPar, PrdFulEnt, PrdCanPen, PrdRotRea, PrdRec, PrdPreAnt, PrdFecPre, PrdPreAc2, PrdExiCC, PrvNum, ValCod FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SK7", "SELECT PedFec, PedSit, PedPri, PedAlmc FROM TXPCPEDID WHERE EmprCod = ? AND PedCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SK8", "SELECT PedCanEnt, PedPre, PedUni, PedFulEnt, PedCum, PedDto FROM TXPLPEDID WHERE EmprCod = ? AND PedCod = ? AND PrdNum = ?  FOR UPDATE OF PedCanEnt NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SK9", "SELECT PedCanEnt, PedPre, PedUni, PedFulEnt, PedCum, PedDto FROM TXPLPEDID WHERE EmprCod = ? AND PedCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SK10", "SELECT PrvNom, PrvPri FROM TXPPRVGEN WHERE EmprCod = ? AND PrvNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SK12", "SELECT COALESCE( T1.StockRem, 0) AS StockRem FROM (SELECT SUM(EntUniRem) AS StockRem, EmprCod, PrdNum FROM TXPENTALM GROUP BY EmprCod, PrdNum ) T1 WHERE T1.EmprCod = ? AND T1.PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SK14", "SELECT /*+ FIRST_ROWS(100) */ TM1.LinEnt, T3.UltLinEnt, T3.PrdExiAlm, TM1.EntCon, T7.PedCanEnt, TM1.EntPedCum, TM1.EntUniRem, TM1.EntPre, T3.PrdPreMed, T3.PrdValStk, T3.PrdNom, T4.PrvNom, T3.PrdPreAct, T3.PrdDetPar, T3.PrdFulEnt, T3.PrdCanPen, T3.PrdRotRea, T3.PrdRec, T3.PrdPreAnt, T3.PrdFecPre, T2.EmprNom, T4.PrvPri, T2.EmpNumDec, T3.PrdPreAc2, T3.PrdExiCC, TM1.EntFecEnt, TM1.Albaran, TM1.EntNAlbar, TM1.EntPrvNum, T6.PedFec, TM1.EntUniEnt, T7.PedPre, T7.PedUni, TM1.EntNumCon, TM1.EntLotN, TM1.EntFVal, TM1.EntEti, TM1.EntConIni, TM1.EntConFin, T7.PedFulEnt, T7.PedCum, T6.PedSit, T6.PedPri, T7.PedDto, TM1.EntBnc, TM1.EntCC, TM1.EntCCoCod, TM1.EntUniAlb, TM1.EntObs, TM1.EntRemNro, TM1.EntRemFch, TM1.EntRemSuc, TM1.EntRemTpo, T6.PedAlmc, TM1.EntFabId, TM1.EntLoteID, TM1.EntUbicaci, TM1.EntHfCon, TM1.EntFfCon, TM1.EntHiCon, TM1.EntFiCon, TM1.EmprCod, TM1.PrdNum, TM1.PedCod, T3.PrvNum, T3.ValCod, COALESCE( T5.StockRem, 0) AS StockRem FROM ((((((TXPENTALM TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) INNER JOIN TXPPRODUC T3 ON T3.EmprCod = TM1.EmprCod AND T3.PrdNum = TM1.PrdNum) LEFT JOIN TXPPRVGEN T4 ON T4.EmprCod = TM1.EmprCod AND T4.PrvNum = T3.PrvNum) LEFT JOIN (SELECT SUM(TM1.EntUniRem) AS StockRem, TM1.EmprCod, TM1.PrdNum FROM TXPENTALM TM1 GROUP BY TM1.EmprCod, TM1.PrdNum ) T5 ON T5.EmprCod = TM1.EmprCod AND T5.PrdNum = TM1.PrdNum) LEFT JOIN TXPCPEDID T6 ON T6.EmprCod = TM1.EmprCod AND T6.PedCod = TM1.PedCod) LEFT JOIN TXPLPEDID T7 ON T7.EmprCod = TM1.EmprCod AND T7.PedCod = TM1.PedCod AND T7.PrdNum = TM1.PrdNum) WHERE TM1.EmprCod = ? and TM1.PrdNum = ? and TM1.LinEnt = ? and TM1.EntCon = 0 ORDER BY TM1.EmprCod, TM1.PrdNum, TM1.LinEnt ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SK15", "SELECT PedFec, PedSit, PedPri, PedAlmc FROM TXPCPEDID WHERE EmprCod = ? AND PedCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SK16", "SELECT PrvNom, PrvPri FROM TXPPRVGEN WHERE EmprCod = ? AND PrvNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SK18", "SELECT COALESCE( T1.StockRem, 0) AS StockRem FROM (SELECT SUM(EntUniRem) AS StockRem, EmprCod, PrdNum FROM TXPENTALM GROUP BY EmprCod, PrdNum ) T1 WHERE T1.EmprCod = ? AND T1.PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SK19", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, PrdNum, LinEnt FROM TXPENTALM WHERE EmprCod = ? AND PrdNum = ? AND LinEnt = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SK20", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, PrdNum, LinEnt, EntCon FROM TXPENTALM WHERE ( PrdNum > ? or PrdNum = ? and LinEnt > ?) and EmprCod = ? and EntCon = 0 ORDER BY EmprCod, PrdNum, LinEnt) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01SK21", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, PrdNum, LinEnt, EntCon FROM TXPENTALM WHERE ( PrdNum < ? or PrdNum = ? and LinEnt < ?) and EmprCod = ? and EntCon = 0 ORDER BY EmprCod DESC, PrdNum DESC, LinEnt DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01SK22", "SELECT UltLinEnt, PrdExiAlm, PrdPreMed, PrdValStk, PrdNom, PrdPreAct, PrdDetPar, PrdFulEnt, PrdCanPen, PrdRotRea, PrdRec, PrdPreAnt, PrdFecPre, PrdPreAc2, PrdExiCC, PrvNum, ValCod FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ?  FOR UPDATE OF UltLinEnt, PrdExiAlm, PrdPreMed, PrdValStk NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SK23", "SELECT PedCanEnt, PedPre, PedUni, PedFulEnt, PedCum, PedDto FROM TXPLPEDID WHERE EmprCod = ? AND PedCod = ? AND PrdNum = ?  FOR UPDATE OF PedCanEnt NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01SK24", "INSERT INTO TXPENTALM(LinEnt, EntCon, EntPedCum, EntUniRem, EntPre, EntFecEnt, Albaran, EntNAlbar, EntPrvNum, EntUniEnt, EntNumCon, EntLotN, EntFVal, EntEti, EntConIni, EntConFin, EntBnc, EntCC, EntCCoCod, EntUniAlb, EntObs, EntRemNro, EntRemFch, EntRemSuc, EntRemTpo, EntFabId, EntLoteID, EntUbicaci, EntHfCon, EntFfCon, EntHiCon, EntFiCon, EmprCod, PrdNum, PedCod, EntNro, EntNEmb) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, 0)", GX_NOMASK, "TXPENTALM")
         ,new UpdateCursor("T01SK25", "UPDATE TXPENTALM SET EntCon=?, EntPedCum=?, EntUniRem=?, EntPre=?, EntFecEnt=?, Albaran=?, EntNAlbar=?, EntPrvNum=?, EntUniEnt=?, EntNumCon=?, EntLotN=?, EntFVal=?, EntEti=?, EntConIni=?, EntConFin=?, EntBnc=?, EntCC=?, EntCCoCod=?, EntUniAlb=?, EntObs=?, EntRemNro=?, EntRemFch=?, EntRemSuc=?, EntRemTpo=?, EntFabId=?, EntLoteID=?, EntUbicaci=?, EntHfCon=?, EntFfCon=?, EntHiCon=?, EntFiCon=?, PedCod=?  WHERE EmprCod = ? AND PrdNum = ? AND LinEnt = ?", GX_NOMASK, "TXPENTALM")
         ,new UpdateCursor("T01SK26", "DELETE FROM TXPENTALM  WHERE EmprCod = ? AND PrdNum = ? AND LinEnt = ?", GX_NOMASK, "TXPENTALM")
         ,new ForEachCursor("T01SK27", "SELECT UltLinEnt, PrdExiAlm, PrdPreMed, PrdValStk, PrdNom, PrdPreAct, PrdDetPar, PrdFulEnt, PrdCanPen, PrdRotRea, PrdRec, PrdPreAnt, PrdFecPre, PrdPreAc2, PrdExiCC, PrvNum, ValCod FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SK28", "SELECT PedFec, PedSit, PedPri, PedAlmc FROM TXPCPEDID WHERE EmprCod = ? AND PedCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SK29", "SELECT PedCanEnt, PedPre, PedUni, PedFulEnt, PedCum, PedDto FROM TXPLPEDID WHERE EmprCod = ? AND PedCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SK30", "SELECT PrvNom, PrvPri FROM TXPPRVGEN WHERE EmprCod = ? AND PrvNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SK32", "SELECT COALESCE( T1.StockRem, 0) AS StockRem FROM (SELECT SUM(EntUniRem) AS StockRem, EmprCod, PrdNum FROM TXPENTALM GROUP BY EmprCod, PrdNum ) T1 WHERE T1.EmprCod = ? AND T1.PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01SK33", "UPDATE TXPPRODUC SET UltLinEnt=?, PrdExiAlm=?, PrdPreMed=?, PrdValStk=?  WHERE EmprCod = ? AND PrdNum = ?", GX_NOMASK, "TXPPRODUC")
         ,new UpdateCursor("T01SK34", "UPDATE TXPLPEDID SET PedCanEnt=?  WHERE EmprCod = ? AND PedCod = ? AND PrdNum = ?", GX_NOMASK, "TXPLPEDID")
         ,new ForEachCursor("T01SK35", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, PrdNum, LinEnt FROM TXPENTALM WHERE EmprCod = ? and EntCon = 0 ORDER BY EmprCod, PrdNum, LinEnt ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SK36", "SELECT EmprCod, PedCod, PrdNum, PedCum FROM TXPLPEDID WHERE EmprCod = ? AND PedCod = ? ORDER BY EmprCod, PedCod, PrdNum ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
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
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,5);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 10);
               ((String[]) buf[7])[0] = rslt.getString(8, 20);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(10,2);
               ((short[]) buf[11])[0] = rslt.getShort(11);
               ((String[]) buf[12])[0] = rslt.getString(12, 26);
               ((java.util.Date[]) buf[13])[0] = rslt.getGXDate(13);
               ((byte[]) buf[14])[0] = rslt.getByte(14);
               ((int[]) buf[15])[0] = rslt.getInt(15);
               ((int[]) buf[16])[0] = rslt.getInt(16);
               ((String[]) buf[17])[0] = rslt.getString(17, 10);
               ((String[]) buf[18])[0] = rslt.getString(18, 1);
               ((short[]) buf[19])[0] = rslt.getShort(19);
               ((java.math.BigDecimal[]) buf[20])[0] = rslt.getBigDecimal(20,4);
               ((String[]) buf[21])[0] = rslt.getString(21, 100);
               ((String[]) buf[22])[0] = rslt.getString(22, 12);
               ((java.util.Date[]) buf[23])[0] = rslt.getGXDate(23);
               ((String[]) buf[24])[0] = rslt.getString(24, 4);
               ((String[]) buf[25])[0] = rslt.getString(25, 4);
               ((int[]) buf[26])[0] = rslt.getInt(26);
               ((long[]) buf[27])[0] = rslt.getLong(27);
               ((String[]) buf[28])[0] = rslt.getString(28, 20);
               ((java.util.Date[]) buf[29])[0] = GXutil.resetDate(rslt.getGXDateTime(29));
               ((java.util.Date[]) buf[30])[0] = rslt.getGXDate(30);
               ((java.util.Date[]) buf[31])[0] = GXutil.resetDate(rslt.getGXDateTime(31));
               ((java.util.Date[]) buf[32])[0] = rslt.getGXDate(32);
               ((String[]) buf[33])[0] = rslt.getString(33, 3);
               ((String[]) buf[34])[0] = rslt.getString(34, 6);
               ((int[]) buf[35])[0] = rslt.getInt(35);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               return;
            case 1 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,5);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 10);
               ((String[]) buf[7])[0] = rslt.getString(8, 20);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(10,2);
               ((short[]) buf[11])[0] = rslt.getShort(11);
               ((String[]) buf[12])[0] = rslt.getString(12, 26);
               ((java.util.Date[]) buf[13])[0] = rslt.getGXDate(13);
               ((byte[]) buf[14])[0] = rslt.getByte(14);
               ((int[]) buf[15])[0] = rslt.getInt(15);
               ((int[]) buf[16])[0] = rslt.getInt(16);
               ((String[]) buf[17])[0] = rslt.getString(17, 10);
               ((String[]) buf[18])[0] = rslt.getString(18, 1);
               ((short[]) buf[19])[0] = rslt.getShort(19);
               ((java.math.BigDecimal[]) buf[20])[0] = rslt.getBigDecimal(20,4);
               ((String[]) buf[21])[0] = rslt.getString(21, 100);
               ((String[]) buf[22])[0] = rslt.getString(22, 12);
               ((java.util.Date[]) buf[23])[0] = rslt.getGXDate(23);
               ((String[]) buf[24])[0] = rslt.getString(24, 4);
               ((String[]) buf[25])[0] = rslt.getString(25, 4);
               ((int[]) buf[26])[0] = rslt.getInt(26);
               ((long[]) buf[27])[0] = rslt.getLong(27);
               ((String[]) buf[28])[0] = rslt.getString(28, 20);
               ((java.util.Date[]) buf[29])[0] = GXutil.resetDate(rslt.getGXDateTime(29));
               ((java.util.Date[]) buf[30])[0] = rslt.getGXDate(30);
               ((java.util.Date[]) buf[31])[0] = GXutil.resetDate(rslt.getGXDateTime(31));
               ((java.util.Date[]) buf[32])[0] = rslt.getGXDate(32);
               ((String[]) buf[33])[0] = rslt.getString(33, 3);
               ((String[]) buf[34])[0] = rslt.getString(34, 6);
               ((int[]) buf[35])[0] = rslt.getInt(35);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((byte[]) buf[2])[0] = rslt.getByte(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 3 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,4);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,5);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((String[]) buf[4])[0] = rslt.getString(5, 26);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,5);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(8);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,4);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(10,5);
               ((String[]) buf[10])[0] = rslt.getString(11, 1);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(12,5);
               ((java.util.Date[]) buf[12])[0] = rslt.getGXDate(13);
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(14,5);
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(15,4);
               ((int[]) buf[15])[0] = rslt.getInt(16);
               ((byte[]) buf[16])[0] = rslt.getByte(17);
               return;
            case 4 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,4);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,5);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((String[]) buf[4])[0] = rslt.getString(5, 26);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,5);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(8);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,4);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(10,5);
               ((String[]) buf[10])[0] = rslt.getString(11, 1);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(12,5);
               ((java.util.Date[]) buf[12])[0] = rslt.getGXDate(13);
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(14,5);
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(15,4);
               ((int[]) buf[15])[0] = rslt.getInt(16);
               ((byte[]) buf[16])[0] = rslt.getByte(17);
               return;
            case 5 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDate(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 6 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,5);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               return;
            case 7 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,5);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((byte[]) buf[2])[0] = rslt.getByte(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 9 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,4);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 10 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,4);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,4);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,5);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,5);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(10,2);
               ((String[]) buf[10])[0] = rslt.getString(11, 26);
               ((String[]) buf[11])[0] = rslt.getString(12, 30);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(13,5);
               ((String[]) buf[14])[0] = rslt.getString(14, 1);
               ((java.util.Date[]) buf[15])[0] = rslt.getGXDate(15);
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(16,4);
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(17,5);
               ((String[]) buf[18])[0] = rslt.getString(18, 1);
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(19,5);
               ((java.util.Date[]) buf[20])[0] = rslt.getGXDate(20);
               ((String[]) buf[21])[0] = rslt.getString(21, 30);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((byte[]) buf[23])[0] = rslt.getByte(22);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((byte[]) buf[25])[0] = rslt.getByte(23);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[27])[0] = rslt.getBigDecimal(24,5);
               ((java.math.BigDecimal[]) buf[28])[0] = rslt.getBigDecimal(25,4);
               ((java.util.Date[]) buf[29])[0] = rslt.getGXDate(26);
               ((String[]) buf[30])[0] = rslt.getString(27, 10);
               ((String[]) buf[31])[0] = rslt.getString(28, 20);
               ((int[]) buf[32])[0] = rslt.getInt(29);
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[34])[0] = rslt.getGXDate(30);
               ((java.math.BigDecimal[]) buf[35])[0] = rslt.getBigDecimal(31,2);
               ((java.math.BigDecimal[]) buf[36])[0] = rslt.getBigDecimal(32,5);
               ((java.math.BigDecimal[]) buf[37])[0] = rslt.getBigDecimal(33,2);
               ((short[]) buf[38])[0] = rslt.getShort(34);
               ((String[]) buf[39])[0] = rslt.getString(35, 26);
               ((java.util.Date[]) buf[40])[0] = rslt.getGXDate(36);
               ((byte[]) buf[41])[0] = rslt.getByte(37);
               ((int[]) buf[42])[0] = rslt.getInt(38);
               ((int[]) buf[43])[0] = rslt.getInt(39);
               ((java.util.Date[]) buf[44])[0] = rslt.getGXDate(40);
               ((String[]) buf[45])[0] = rslt.getString(41, 1);
               ((String[]) buf[46])[0] = rslt.getString(42, 1);
               ((String[]) buf[47])[0] = rslt.getString(43, 1);
               ((java.math.BigDecimal[]) buf[48])[0] = rslt.getBigDecimal(44,2);
               ((String[]) buf[49])[0] = rslt.getString(45, 10);
               ((String[]) buf[50])[0] = rslt.getString(46, 1);
               ((short[]) buf[51])[0] = rslt.getShort(47);
               ((java.math.BigDecimal[]) buf[52])[0] = rslt.getBigDecimal(48,4);
               ((String[]) buf[53])[0] = rslt.getString(49, 100);
               ((String[]) buf[54])[0] = rslt.getString(50, 12);
               ((java.util.Date[]) buf[55])[0] = rslt.getGXDate(51);
               ((String[]) buf[56])[0] = rslt.getString(52, 4);
               ((String[]) buf[57])[0] = rslt.getString(53, 4);
               ((byte[]) buf[58])[0] = rslt.getByte(54);
               ((int[]) buf[59])[0] = rslt.getInt(55);
               ((long[]) buf[60])[0] = rslt.getLong(56);
               ((String[]) buf[61])[0] = rslt.getString(57, 20);
               ((java.util.Date[]) buf[62])[0] = GXutil.resetDate(rslt.getGXDateTime(58));
               ((java.util.Date[]) buf[63])[0] = rslt.getGXDate(59);
               ((java.util.Date[]) buf[64])[0] = GXutil.resetDate(rslt.getGXDateTime(60));
               ((java.util.Date[]) buf[65])[0] = rslt.getGXDate(61);
               ((String[]) buf[66])[0] = rslt.getString(62, 3);
               ((String[]) buf[67])[0] = rslt.getString(63, 6);
               ((int[]) buf[68])[0] = rslt.getInt(64);
               ((boolean[]) buf[69])[0] = rslt.wasNull();
               ((int[]) buf[70])[0] = rslt.getInt(65);
               ((byte[]) buf[71])[0] = rslt.getByte(66);
               ((java.math.BigDecimal[]) buf[72])[0] = rslt.getBigDecimal(67,4);
               ((boolean[]) buf[73])[0] = rslt.wasNull();
               return;
            case 11 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDate(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((byte[]) buf[2])[0] = rslt.getByte(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 13 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,4);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 17 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,4);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,5);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((String[]) buf[4])[0] = rslt.getString(5, 26);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,5);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(8);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,4);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(10,5);
               ((String[]) buf[10])[0] = rslt.getString(11, 1);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(12,5);
               ((java.util.Date[]) buf[12])[0] = rslt.getGXDate(13);
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(14,5);
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(15,4);
               ((int[]) buf[15])[0] = rslt.getInt(16);
               ((byte[]) buf[16])[0] = rslt.getByte(17);
               return;
            case 18 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,5);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               return;
            case 22 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,4);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,5);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((String[]) buf[4])[0] = rslt.getString(5, 26);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,5);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(8);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,4);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(10,5);
               ((String[]) buf[10])[0] = rslt.getString(11, 1);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(12,5);
               ((java.util.Date[]) buf[12])[0] = rslt.getGXDate(13);
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(14,5);
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(15,4);
               ((int[]) buf[15])[0] = rslt.getInt(16);
               ((byte[]) buf[16])[0] = rslt.getByte(17);
               return;
            case 23 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDate(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 24 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,5);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               return;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((byte[]) buf[2])[0] = rslt.getByte(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 26 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,4);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 29 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
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
               stmt.setString(2, (String)parms[1], 6);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
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
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               stmt.setString(3, (String)parms[3], 6);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               stmt.setString(3, (String)parms[3], 6);
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 11 :
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
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 6);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setString(4, (String)parms[3], 3);
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 6);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setString(4, (String)parms[3], 3);
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               stmt.setString(3, (String)parms[3], 6);
               return;
            case 19 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setString(3, (String)parms[2], 1);
               stmt.setBigDecimal(4, (java.math.BigDecimal)parms[3], 4);
               stmt.setBigDecimal(5, (java.math.BigDecimal)parms[4], 5);
               stmt.setDate(6, (java.util.Date)parms[5]);
               stmt.setString(7, (String)parms[6], 10);
               stmt.setString(8, (String)parms[7], 20);
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(9, ((Number) parms[9]).intValue());
               }
               stmt.setBigDecimal(10, (java.math.BigDecimal)parms[10], 2);
               stmt.setShort(11, ((Number) parms[11]).shortValue());
               stmt.setString(12, (String)parms[12], 26);
               stmt.setDate(13, (java.util.Date)parms[13]);
               stmt.setByte(14, ((Number) parms[14]).byteValue());
               stmt.setInt(15, ((Number) parms[15]).intValue());
               stmt.setInt(16, ((Number) parms[16]).intValue());
               stmt.setString(17, (String)parms[17], 10);
               stmt.setString(18, (String)parms[18], 1);
               stmt.setShort(19, ((Number) parms[19]).shortValue());
               stmt.setBigDecimal(20, (java.math.BigDecimal)parms[20], 4);
               stmt.setString(21, (String)parms[21], 100);
               stmt.setString(22, (String)parms[22], 12);
               stmt.setDate(23, (java.util.Date)parms[23]);
               stmt.setString(24, (String)parms[24], 4);
               stmt.setString(25, (String)parms[25], 4);
               stmt.setInt(26, ((Number) parms[26]).intValue());
               stmt.setLong(27, ((Number) parms[27]).longValue());
               stmt.setString(28, (String)parms[28], 20);
               stmt.setDateTime(29, (java.util.Date)parms[29], true);
               stmt.setDate(30, (java.util.Date)parms[30]);
               stmt.setDateTime(31, (java.util.Date)parms[31], true);
               stmt.setDate(32, (java.util.Date)parms[32]);
               stmt.setString(33, (String)parms[33], 3);
               stmt.setString(34, (String)parms[34], 6);
               if ( ((Boolean) parms[35]).booleanValue() )
               {
                  stmt.setNull( 35 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(35, ((Number) parms[36]).intValue());
               }
               return;
            case 20 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setString(2, (String)parms[1], 1);
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[2], 4);
               stmt.setBigDecimal(4, (java.math.BigDecimal)parms[3], 5);
               stmt.setDate(5, (java.util.Date)parms[4]);
               stmt.setString(6, (String)parms[5], 10);
               stmt.setString(7, (String)parms[6], 20);
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(8, ((Number) parms[8]).intValue());
               }
               stmt.setBigDecimal(9, (java.math.BigDecimal)parms[9], 2);
               stmt.setShort(10, ((Number) parms[10]).shortValue());
               stmt.setString(11, (String)parms[11], 26);
               stmt.setDate(12, (java.util.Date)parms[12]);
               stmt.setByte(13, ((Number) parms[13]).byteValue());
               stmt.setInt(14, ((Number) parms[14]).intValue());
               stmt.setInt(15, ((Number) parms[15]).intValue());
               stmt.setString(16, (String)parms[16], 10);
               stmt.setString(17, (String)parms[17], 1);
               stmt.setShort(18, ((Number) parms[18]).shortValue());
               stmt.setBigDecimal(19, (java.math.BigDecimal)parms[19], 4);
               stmt.setString(20, (String)parms[20], 100);
               stmt.setString(21, (String)parms[21], 12);
               stmt.setDate(22, (java.util.Date)parms[22]);
               stmt.setString(23, (String)parms[23], 4);
               stmt.setString(24, (String)parms[24], 4);
               stmt.setInt(25, ((Number) parms[25]).intValue());
               stmt.setLong(26, ((Number) parms[26]).longValue());
               stmt.setString(27, (String)parms[27], 20);
               stmt.setDateTime(28, (java.util.Date)parms[28], true);
               stmt.setDate(29, (java.util.Date)parms[29]);
               stmt.setDateTime(30, (java.util.Date)parms[30], true);
               stmt.setDate(31, (java.util.Date)parms[31]);
               if ( ((Boolean) parms[32]).booleanValue() )
               {
                  stmt.setNull( 32 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(32, ((Number) parms[33]).intValue());
               }
               stmt.setString(33, (String)parms[34], 3);
               stmt.setString(34, (String)parms[35], 6);
               stmt.setShort(35, ((Number) parms[36]).shortValue());
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 22 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 23 :
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
            case 24 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               stmt.setString(3, (String)parms[3], 6);
               return;
            case 25 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 26 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 27 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 4);
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[2], 5);
               stmt.setBigDecimal(4, (java.math.BigDecimal)parms[3], 2);
               stmt.setString(5, (String)parms[4], 3);
               stmt.setString(6, (String)parms[5], 6);
               return;
            case 28 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setString(2, (String)parms[1], 3);
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(3, ((Number) parms[3]).intValue());
               }
               stmt.setString(4, (String)parms[4], 6);
               return;
            case 29 :
               stmt.setString(1, (String)parms[0], 3);
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

