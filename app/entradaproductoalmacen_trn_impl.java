package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class entradaproductoalmacen_trn_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action74") == 0 )
      {
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_74_1T642( ) ;
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
         xc_75_1T642( ) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action86") == 0 )
      {
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_86_1T642( ) ;
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
         xc_87_1T642( ) ;
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
         xc_88_1T642( ) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action89") == 0 )
      {
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_89_1T642( ) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action90") == 0 )
      {
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_90_1T642( ) ;
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
         xc_91_1T642( ) ;
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
         xc_92_1T642( ) ;
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
         xc_93_1T642( ) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action94") == 0 )
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
         xc_94_1T642( A396EmprCod, A719PrdNum, A6156EntPrvNum, A417EntPre) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action95") == 0 )
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
         AV24PedPri = httpContext.GetPar( "PedPri") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV24PedPri", AV24PedPri);
         A597LinEnt = (short)(GXutil.lval( httpContext.GetPar( "LinEnt"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A597LinEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A597LinEnt), 4, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_95_1T642( Gx_mode, A396EmprCod, A6156EntPrvNum, A415EntFecEnt, A658PedCod, A418EntUniEnt, A417EntPre, AV24PedPri, A597LinEnt) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action96") == 0 )
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
         AV24PedPri = httpContext.GetPar( "PedPri") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV24PedPri", AV24PedPri);
         A597LinEnt = (short)(GXutil.lval( httpContext.GetPar( "LinEnt"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A597LinEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A597LinEnt), 4, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_96_1T642( Gx_mode, A396EmprCod, A6156EntPrvNum, A719PrdNum, A718PrdNom, A415EntFecEnt, A658PedCod, A418EntUniEnt, A417EntPre, AV24PedPri, A597LinEnt) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action97") == 0 )
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
         xc_97_1T642( Gx_mode, A396EmprCod, A719PrdNum, A415EntFecEnt, A418EntUniEnt, A417EntPre, A597LinEnt) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action98") == 0 )
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
         xc_98_1T642( Gx_mode, A396EmprCod, A719PrdNum, A597LinEnt) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action99") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         AV46Pgmname = httpContext.GetPar( "Pgmname") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV46Pgmname", AV46Pgmname);
         AV36Usurcod = httpContext.GetPar( "Usurcod") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV36Usurcod", AV36Usurcod);
         AV37Station = httpContext.GetPar( "Station") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV37Station", AV37Station);
         AV17Inc_obs = httpContext.GetPar( "Inc_obs") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV17Inc_obs", AV17Inc_obs);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_99_1T642( A396EmprCod, AV46Pgmname, AV36Usurcod, AV37Station, AV17Inc_obs) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action100") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         AV46Pgmname = httpContext.GetPar( "Pgmname") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV46Pgmname", AV46Pgmname);
         AV36Usurcod = httpContext.GetPar( "Usurcod") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV36Usurcod", AV36Usurcod);
         AV37Station = httpContext.GetPar( "Station") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV37Station", AV37Station);
         AV17Inc_obs = httpContext.GetPar( "Inc_obs") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV17Inc_obs", AV17Inc_obs);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_100_1T642( A396EmprCod, AV46Pgmname, AV36Usurcod, AV37Station, AV17Inc_obs) ;
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
         gx4asaprdultmovf1T642( A396EmprCod, A719PrdNum) ;
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
         gx5asaultfecccs1T642( A396EmprCod, A719PrdNum) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel13"+"_"+"") == 0 )
      {
         AV7EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV7EmprCod", AV7EmprCod);
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV7EmprCod, "@!"))));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxasa140351T642( AV7EmprCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel14"+"_"+"") == 0 )
      {
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel15"+"_"+"") == 0 )
      {
         AV7EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV7EmprCod", AV7EmprCod);
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV7EmprCod, "@!"))));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxasa128571T642( AV7EmprCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel16"+"_"+"") == 0 )
      {
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel45"+"_"+"ENTPRE") == 0 )
      {
         A665PedPre = CommonUtil.decimalVal( httpContext.GetPar( "PedPre"), ".") ;
         httpContext.ajax_rsp_assign_attri("", false, "A665PedPre", GXutil.ltrimstr( A665PedPre, 14, 5));
         A660PedDto = CommonUtil.decimalVal( httpContext.GetPar( "PedDto"), ".") ;
         httpContext.ajax_rsp_assign_attri("", false, "A660PedDto", GXutil.ltrimstr( A660PedDto, 5, 2));
         A658PedCod = (int)(GXutil.lval( httpContext.GetPar( "PedCod"))) ;
         n658PedCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A658PedCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A658PedCod), 8, 0));
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A719PrdNum = httpContext.GetPar( "PrdNum") ;
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         A6156EntPrvNum = (int)(GXutil.lval( httpContext.GetPar( "EntPrvNum"))) ;
         n6156EntPrvNum = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A6156EntPrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6156EntPrvNum), 6, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx45asaentpre1T642( A665PedPre, A660PedDto, A658PedCod, A396EmprCod, A719PrdNum, A6156EntPrvNum) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel57"+"_"+"vPRDNOMX") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A6156EntPrvNum = (int)(GXutil.lval( httpContext.GetPar( "EntPrvNum"))) ;
         n6156EntPrvNum = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A6156EntPrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6156EntPrvNum), 6, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx57asaprdnomx1T642( A396EmprCod, A6156EntPrvNum) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel67"+"_"+"PEDNUMLIN") == 0 )
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
         gx67asapednumlin1T642( A396EmprCod, A658PedCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_116") == 0 )
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
         gxload_116( A396EmprCod, A658PedCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_117") == 0 )
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
         gxload_117( A396EmprCod, A658PedCod, A719PrdNum) ;
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Entrada Producto Almacen", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtLinEnt_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      wbErr = false ;
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public entradaproductoalmacen_trn_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public entradaproductoalmacen_trn_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( entradaproductoalmacen_trn_impl.class ));
   }

   public entradaproductoalmacen_trn_impl( int remoteHandle ,
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
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable3_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtLinEnt_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtLinEnt_Internalname, httpContext.getMessage( "Linea", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtLinEnt_Internalname, GXutil.ltrim( localUtil.ntoc( A597LinEnt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A597LinEnt), "ZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,25);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtLinEnt_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtLinEnt_Enabled, 1, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_EntradaProductoAlmacen_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtEntFecEnt_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtEntFecEnt_Internalname, httpContext.getMessage( "Fecha", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 29,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtEntFecEnt_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEntFecEnt_Internalname, localUtil.format(A415EntFecEnt, "99/99/99"), localUtil.format( A415EntFecEnt, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,29);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEntFecEnt_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtEntFecEnt_Enabled, 1, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_EntradaProductoAlmacen_TRN.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtEntFecEnt_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtEntFecEnt_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_EntradaProductoAlmacen_TRN.htm");
      httpContext.writeTextNL( "</div>") ;
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbaran_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbaran_Internalname, httpContext.getMessage( "Nº Documento", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 33,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbaran_Internalname, GXutil.rtrim( A11Albaran), GXutil.rtrim( localUtil.format( A11Albaran, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,33);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbaran_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbaran_Enabled, 1, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_EntradaProductoAlmacen_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divEntnalbar_cell_Internalname, 1, 0, "px", 0, "px", divEntnalbar_cell_Class, "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", edtEntNAlbar_Visible, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtEntNAlbar_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtEntNAlbar_Internalname, httpContext.getMessage( "Nº Documento", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 37,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEntNAlbar_Internalname, GXutil.rtrim( A12857EntNAlbar), GXutil.rtrim( localUtil.format( A12857EntNAlbar, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,37);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEntNAlbar_Jsonclick, 0, "AttributeFL", "", "", "", "", edtEntNAlbar_Visible, edtEntNAlbar_Enabled, 1, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_EntradaProductoAlmacen_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell DscTop", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divTablesplittedpedcod_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockpedcod_Internalname, httpContext.getMessage( "Pedido", ""), "", "", lblTextblockpedcod_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_EntradaProductoAlmacen_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Table start */
      sStyleString = "" ;
      app.GxWebStd.gx_table_start( httpContext, tblTablemergedpedcod_Internalname, tblTablemergedpedcod_Internalname, "", "TableMerged", 0, "", "", 0, 0, sStyleString, "", "", 0);
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td class='MergeDataCell'>") ;
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPedCod_Internalname, httpContext.getMessage( "Nº Pedido", ""), "gx-form-item AttributeFLLabel", 0, true, "width: 25%;");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 48,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPedCod_Internalname, GXutil.ltrim( localUtil.ntoc( A658PedCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A658PedCod), "ZZZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,48);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPedCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPedCod_Enabled, 1, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_EntradaProductoAlmacen_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td class='DataContentCell'>") ;
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", imgavPromptpedido_Visible, 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+imgavPromptpedido_Internalname+"\"", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
      /* Static Bitmap Variable */
      ClassString = "ImagePrompt" + " " + ((GXutil.strcmp(imgavPromptpedido_gximage, "")==0) ? "" : "GX_Image_"+imgavPromptpedido_gximage+"_Class") ;
      StyleString = "" ;
      AV42promptPedido_IsBlob = (boolean)(((GXutil.strcmp("", AV42promptPedido)==0)&&(GXutil.strcmp("", AV49Promptpedido_GXI)==0))||!(GXutil.strcmp("", AV42promptPedido)==0)) ;
      sImgUrl = ((GXutil.strcmp("", AV42promptPedido)==0) ? AV49Promptpedido_GXI : httpContext.getResourceRelative(AV42promptPedido)) ;
      app.GxWebStd.gx_bitmap( httpContext, imgavPromptpedido_Internalname, sImgUrl, imgavPromptpedido_Link, "", "", context.getHttpContext().getTheme( ), imgavPromptpedido_Visible, imgavPromptpedido_Enabled, "", "", 0, -1, 0, "", 0, "", 0, 0, 0, "", "", StyleString, ClassString, "", "", "", "", "", "", "", 1, AV42promptPedido_IsBlob, false, context.getHttpContext().getImageSrcSet( sImgUrl), "HLP_EntradaProductoAlmacen_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      /* End of table */
      httpContext.writeText( "</table>") ;
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtEntPrvNum_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtEntPrvNum_Internalname, httpContext.getMessage( "Proveedor", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEntPrvNum_Internalname, GXutil.ltrim( localUtil.ntoc( A6156EntPrvNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A6156EntPrvNum), "ZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,56);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEntPrvNum_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtEntPrvNum_Enabled, 1, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_EntradaProductoAlmacen_TRN.htm");
      /* Static images/pictures */
      ClassString = "gx-prompt Image" + " " + ((GXutil.strcmp(imgprompt_6156_gximage, "")==0) ? "" : "GX_Image_"+imgprompt_6156_gximage+"_Class") ;
      StyleString = "" ;
      sImgUrl = context.getHttpContext().getImagePath( "f5b04895-0024-488b-8e3b-b687ca4598ee", "", context.getHttpContext().getTheme( )) ;
      app.GxWebStd.gx_bitmap( httpContext, imgprompt_6156_Internalname, sImgUrl, imgprompt_6156_Link, "", "", context.getHttpContext().getTheme( ), imgprompt_6156_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 0, "", "", StyleString, ClassString, "", "", "", "", "", "", "", 1, false, false, context.getHttpContext().getImageSrcSet( sImgUrl), "HLP_EntradaProductoAlmacen_TRN.htm");
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
      app.GxWebStd.gx_div_start( httpContext, divEntnemb_cell_Internalname, 1, 0, "px", 0, "px", divEntnemb_cell_Class, "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", edtEntNEmb_Visible, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtEntNEmb_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtEntNEmb_Internalname, httpContext.getMessage( "Emb.", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 64,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEntNEmb_Internalname, GXutil.ltrim( localUtil.ntoc( A14035EntNEmb, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtEntNEmb_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A14035EntNEmb), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A14035EntNEmb), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,64);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEntNEmb_Jsonclick, 0, "AttributeFL", "", "", "", "", edtEntNEmb_Visible, edtEntNEmb_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_EntradaProductoAlmacen_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtEntUniEnt_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtEntUniEnt_Internalname, httpContext.getMessage( "Unidades", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 68,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEntUniEnt_Internalname, GXutil.ltrim( localUtil.ntoc( A418EntUniEnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( A418EntUniEnt, "ZZZZZ9.99")), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,68);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEntUniEnt_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtEntUniEnt_Enabled, 1, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_EntradaProductoAlmacen_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtEntPre_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtEntPre_Internalname, httpContext.getMessage( "Precio", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 72,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEntPre_Internalname, GXutil.ltrim( localUtil.ntoc( A417EntPre, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( A417EntPre, "ZZZZZZZ9.999")), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,72);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEntPre_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtEntPre_Enabled, 1, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_EntradaProductoAlmacen_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtEntUniRem_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtEntUniRem_Internalname, httpContext.getMessage( "Remanente", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEntUniRem_Internalname, GXutil.ltrim( localUtil.ntoc( A419EntUniRem, (byte)(11), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtEntUniRem_Enabled!=0) ? localUtil.format( A419EntUniRem, "ZZZZZ9.9999") : localUtil.format( A419EntUniRem, "ZZZZZ9.9999"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEntUniRem_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtEntUniRem_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_EntradaProductoAlmacen_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtEntLotN_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtEntLotN_Internalname, httpContext.getMessage( "Lote", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 80,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEntLotN_Internalname, GXutil.rtrim( A5686EntLotN), GXutil.rtrim( localUtil.format( A5686EntLotN, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,80);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEntLotN_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtEntLotN_Enabled, 1, "text", "", 26, "chr", 1, "row", 26, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_EntradaProductoAlmacen_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtEntFVal_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtEntFVal_Internalname, httpContext.getMessage( "Fecha Cad.", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 84,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtEntFVal_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEntFVal_Internalname, localUtil.format(A5685EntFVal, "99/99/99"), localUtil.format( A5685EntFVal, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,84);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEntFVal_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtEntFVal_Enabled, 1, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_EntradaProductoAlmacen_TRN.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtEntFVal_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtEntFVal_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_EntradaProductoAlmacen_TRN.htm");
      httpContext.writeTextNL( "</div>") ;
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
      app.GxWebStd.gx_div_start( httpContext, divDvpanel_unnamedtable1_cell_Internalname, 1, 0, "px", 0, "px", divDvpanel_unnamedtable1_cell_Class, "left", "top", "", "", "div");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable2_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPedCanEnt_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPedCanEnt_Internalname, httpContext.getMessage( "Cantidad Entregada", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtPedCanEnt_Internalname, GXutil.ltrim( localUtil.ntoc( A657PedCanEnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPedCanEnt_Enabled!=0) ? localUtil.format( A657PedCanEnt, "ZZZZZ9.99") : localUtil.format( A657PedCanEnt, "ZZZZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPedCanEnt_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPedCanEnt_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_EntradaProductoAlmacen_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPedUni_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPedUni_Internalname, httpContext.getMessage( "Cantidad Pedida", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtPedUni_Internalname, GXutil.ltrim( localUtil.ntoc( A669PedUni, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPedUni_Enabled!=0) ? localUtil.format( A669PedUni, "ZZZZZ9.99") : localUtil.format( A669PedUni, "ZZZZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPedUni_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPedUni_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_EntradaProductoAlmacen_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdCanPen_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPrdCanPen_Internalname, httpContext.getMessage( "Cantidad Pendiente Entrega", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdCanPen_Internalname, GXutil.ltrim( localUtil.ntoc( A684PrdCanPen, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrdCanPen_Enabled!=0) ? localUtil.format( A684PrdCanPen, "ZZZZZZ9.9999") : localUtil.format( A684PrdCanPen, "ZZZZZZ9.9999"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdCanPen_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPrdCanPen_Enabled, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_EntradaProductoAlmacen_TRN.htm");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group TrnActionGroup", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 110,'',false,'',0)\"" ;
      ClassString = "ButtonMaterial" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtntrn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtntrn_enter_Visible, bttBtntrn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_EntradaProductoAlmacen_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 112,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtntrn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtntrn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_EntradaProductoAlmacen_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 114,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtntrn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtntrn_delete_Visible, bttBtntrn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_EntradaProductoAlmacen_TRN.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV46Pgmname), GXutil.rtrim( localUtil.format( AV46Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_EntradaProductoAlmacen_TRN.htm");
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 122,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEntPedCum_Internalname, GXutil.rtrim( A3404EntPedCum), GXutil.rtrim( localUtil.format( A3404EntPedCum, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,122);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEntPedCum_Jsonclick, 0, "Attribute", "", "", "", "", edtEntPedCum_Visible, edtEntPedCum_Enabled, 1, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_EntradaProductoAlmacen_TRN.htm");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEntCump_Internalname, GXutil.rtrim( A14041EntCump), GXutil.rtrim( localUtil.format( A14041EntCump, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEntCump_Jsonclick, 0, "Attribute", "", "", "", "", edtEntCump_Visible, edtEntCump_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_EntradaProductoAlmacen_TRN.htm");
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
      e111T62 ();
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
            Z419EntUniRem = localUtil.ctond( httpContext.cgiGet( "Z419EntUniRem")) ;
            Z417EntPre = localUtil.ctond( httpContext.cgiGet( "Z417EntPre")) ;
            Z3404EntPedCum = httpContext.cgiGet( "Z3404EntPedCum") ;
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
            Z14035EntNEmb = (byte)(localUtil.ctol( httpContext.cgiGet( "Z14035EntNEmb"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z658PedCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z658PedCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z726PrdPreMed = localUtil.ctond( httpContext.cgiGet( "Z726PrdPreMed")) ;
            Z713PrdFulEnt = localUtil.ctod( httpContext.cgiGet( "Z713PrdFulEnt"), 0) ;
            Z709PrdFecPre = localUtil.ctod( httpContext.cgiGet( "Z709PrdFecPre"), 0) ;
            Z725PrdPreAnt = localUtil.ctond( httpContext.cgiGet( "Z725PrdPreAnt")) ;
            Z724PrdPreAct = localUtil.ctond( httpContext.cgiGet( "Z724PrdPreAct")) ;
            Z684PrdCanPen = localUtil.ctond( httpContext.cgiGet( "Z684PrdCanPen")) ;
            Z718PrdNom = httpContext.cgiGet( "Z718PrdNom") ;
            Z698PrdDetPar = httpContext.cgiGet( "Z698PrdDetPar") ;
            Z729PrdRotRea = localUtil.ctond( httpContext.cgiGet( "Z729PrdRotRea")) ;
            Z727PrdRec = httpContext.cgiGet( "Z727PrdRec") ;
            Z5255PrdPreAc2 = localUtil.ctond( httpContext.cgiGet( "Z5255PrdPreAc2")) ;
            Z705PrdExiCC = localUtil.ctond( httpContext.cgiGet( "Z705PrdExiCC")) ;
            Z795PrvNum = (int)(localUtil.ctol( httpContext.cgiGet( "Z795PrvNum"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z856ValCod = (byte)(localUtil.ctol( httpContext.cgiGet( "Z856ValCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z663PedFulEnt = localUtil.ctod( httpContext.cgiGet( "Z663PedFulEnt"), 0) ;
            Z665PedPre = localUtil.ctond( httpContext.cgiGet( "Z665PedPre")) ;
            Z669PedUni = localUtil.ctond( httpContext.cgiGet( "Z669PedUni")) ;
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
            A713PrdFulEnt = localUtil.ctod( httpContext.cgiGet( "Z713PrdFulEnt"), 0) ;
            A709PrdFecPre = localUtil.ctod( httpContext.cgiGet( "Z709PrdFecPre"), 0) ;
            A725PrdPreAnt = localUtil.ctond( httpContext.cgiGet( "Z725PrdPreAnt")) ;
            A724PrdPreAct = localUtil.ctond( httpContext.cgiGet( "Z724PrdPreAct")) ;
            A718PrdNom = httpContext.cgiGet( "Z718PrdNom") ;
            A698PrdDetPar = httpContext.cgiGet( "Z698PrdDetPar") ;
            A729PrdRotRea = localUtil.ctond( httpContext.cgiGet( "Z729PrdRotRea")) ;
            A727PrdRec = httpContext.cgiGet( "Z727PrdRec") ;
            A5255PrdPreAc2 = localUtil.ctond( httpContext.cgiGet( "Z5255PrdPreAc2")) ;
            A705PrdExiCC = localUtil.ctond( httpContext.cgiGet( "Z705PrdExiCC")) ;
            A795PrvNum = (int)(localUtil.ctol( httpContext.cgiGet( "Z795PrvNum"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A856ValCod = (byte)(localUtil.ctol( httpContext.cgiGet( "Z856ValCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A663PedFulEnt = localUtil.ctod( httpContext.cgiGet( "Z663PedFulEnt"), 0) ;
            A665PedPre = localUtil.ctond( httpContext.cgiGet( "Z665PedPre")) ;
            A659PedCum = httpContext.cgiGet( "Z659PedCum") ;
            A660PedDto = localUtil.ctond( httpContext.cgiGet( "Z660PedDto")) ;
            O3404EntPedCum = httpContext.cgiGet( "O3404EntPedCum") ;
            O419EntUniRem = localUtil.ctond( httpContext.cgiGet( "O419EntUniRem")) ;
            O418EntUniEnt = localUtil.ctond( httpContext.cgiGet( "O418EntUniEnt")) ;
            O724PrdPreAct = localUtil.ctond( httpContext.cgiGet( "O724PrdPreAct")) ;
            O750PrdValStk = localUtil.ctond( httpContext.cgiGet( "O750PrdValStk")) ;
            O657PedCanEnt = localUtil.ctond( httpContext.cgiGet( "O657PedCanEnt")) ;
            O415EntFecEnt = localUtil.ctod( httpContext.cgiGet( "O415EntFecEnt"), 0) ;
            O417EntPre = localUtil.ctond( httpContext.cgiGet( "O417EntPre")) ;
            O5686EntLotN = httpContext.cgiGet( "O5686EntLotN") ;
            O704PrdExiAlm = localUtil.ctond( httpContext.cgiGet( "O704PrdExiAlm")) ;
            O847UltLinEnt = (short)(localUtil.ctol( httpContext.cgiGet( "O847UltLinEnt"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            N658PedCod = (int)(localUtil.ctol( httpContext.cgiGet( "N658PedCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            N3404EntPedCum = httpContext.cgiGet( "N3404EntPedCum") ;
            N415EntFecEnt = localUtil.ctod( httpContext.cgiGet( "N415EntFecEnt"), 0) ;
            N11Albaran = httpContext.cgiGet( "N11Albaran") ;
            N12857EntNAlbar = httpContext.cgiGet( "N12857EntNAlbar") ;
            N6156EntPrvNum = (int)(localUtil.ctol( httpContext.cgiGet( "N6156EntPrvNum"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            N418EntUniEnt = localUtil.ctond( httpContext.cgiGet( "N418EntUniEnt")) ;
            N5686EntLotN = httpContext.cgiGet( "N5686EntLotN") ;
            N417EntPre = localUtil.ctond( httpContext.cgiGet( "N417EntPre")) ;
            N5685EntFVal = localUtil.ctod( httpContext.cgiGet( "N5685EntFVal"), 0) ;
            A396EmprCod = httpContext.cgiGet( "EMPRCOD") ;
            A719PrdNum = httpContext.cgiGet( "PRDNUM") ;
            A14040PrdUltMovF = localUtil.ctod( httpContext.cgiGet( "PRDULTMOVF"), 0) ;
            A3835UltFecCCs = localUtil.ctod( httpContext.cgiGet( "ULTFECCCS"), 0) ;
            AV7EmprCod = httpContext.cgiGet( "vEMPRCOD") ;
            AV8PrdNum = httpContext.cgiGet( "vPRDNUM") ;
            AV9LinEnt = (short)(localUtil.ctol( httpContext.cgiGet( "vLINENT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A847UltLinEnt = (short)(localUtil.ctol( httpContext.cgiGet( "ULTLINENT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_BScreen = (byte)(localUtil.ctol( httpContext.cgiGet( "vGXBSCREEN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV13Insert_PedCod = (int)(localUtil.ctol( httpContext.cgiGet( "vINSERT_PEDCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A704PrdExiAlm = localUtil.ctond( httpContext.cgiGet( "PRDEXIALM")) ;
            A411EntCon = (byte)(localUtil.ctol( httpContext.cgiGet( "ENTCON"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV22Year = (short)(localUtil.ctol( httpContext.cgiGet( "vYEAR"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV23Mes = (byte)(localUtil.ctol( httpContext.cgiGet( "vMES"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A800PrvPri = (byte)(localUtil.ctol( httpContext.cgiGet( "PRVPRI"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n800PrvPri = false ;
            A666PedPri = httpContext.cgiGet( "PEDPRI") ;
            AV24PedPri = httpContext.cgiGet( "vPEDPRI") ;
            AV30OldEntPre = localUtil.ctond( httpContext.cgiGet( "vOLDENTPRE")) ;
            AV31OldExiAlm = localUtil.ctond( httpContext.cgiGet( "vOLDEXIALM")) ;
            AV32OldEntUni = localUtil.ctond( httpContext.cgiGet( "vOLDENTUNI")) ;
            AV33OldRemanente = localUtil.ctond( httpContext.cgiGet( "vOLDREMANENTE")) ;
            AV34oldEntFecent = localUtil.ctod( httpContext.cgiGet( "vOLDENTFECENT"), 0) ;
            AV35oldlote = httpContext.cgiGet( "vOLDLOTE") ;
            AV21UniOld = localUtil.ctond( httpContext.cgiGet( "vUNIOLD")) ;
            AV20FecAnt = localUtil.ctod( httpContext.cgiGet( "vFECANT"), 0) ;
            AV27PrecAnt = localUtil.ctond( httpContext.cgiGet( "vPRECANT")) ;
            AV25AnyAnt = (short)(localUtil.ctol( httpContext.cgiGet( "vANYANT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV26MesAnt = (byte)(localUtil.ctol( httpContext.cgiGet( "vMESANT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A663PedFulEnt = localUtil.ctod( httpContext.cgiGet( "PEDFULENT"), 0) ;
            A750PrdValStk = localUtil.ctond( httpContext.cgiGet( "PRDVALSTK")) ;
            AV40Consumos = (short)(localUtil.ctol( httpContext.cgiGet( "vCONSUMOS"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A705PrdExiCC = localUtil.ctond( httpContext.cgiGet( "PRDEXICC")) ;
            A726PrdPreMed = localUtil.ctond( httpContext.cgiGet( "PRDPREMED")) ;
            AV39NoUpd = (short)(localUtil.ctol( httpContext.cgiGet( "vNOUPD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A713PrdFulEnt = localUtil.ctod( httpContext.cgiGet( "PRDFULENT"), 0) ;
            A709PrdFecPre = localUtil.ctod( httpContext.cgiGet( "PRDFECPRE"), 0) ;
            A724PrdPreAct = localUtil.ctond( httpContext.cgiGet( "PRDPREACT")) ;
            A725PrdPreAnt = localUtil.ctond( httpContext.cgiGet( "PRDPREANT")) ;
            A665PedPre = localUtil.ctond( httpContext.cgiGet( "PEDPRE")) ;
            A660PedDto = localUtil.ctond( httpContext.cgiGet( "PEDDTO")) ;
            AV18PrdNomX = httpContext.cgiGet( "vPRDNOMX") ;
            AV15msg_ctrl_fecha = httpContext.cgiGet( "vMSG_CTRL_FECHA") ;
            A12716EntFabId = (int)(localUtil.ctol( httpContext.cgiGet( "ENTFABID"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A795PrvNum = (int)(localUtil.ctol( httpContext.cgiGet( "PRVNUM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A10184EntRemTpo = httpContext.cgiGet( "ENTREMTPO") ;
            AV28Fecha = localUtil.ctod( httpContext.cgiGet( "vFECHA"), 0) ;
            AV17Inc_obs = httpContext.cgiGet( "vINC_OBS") ;
            AV29DiasFin = (short)(localUtil.ctol( httpContext.cgiGet( "vDIASFIN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A664PedNumLin = (short)(localUtil.ctol( httpContext.cgiGet( "PEDNUMLIN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A718PrdNom = httpContext.cgiGet( "PRDNOM") ;
            AV19Nalbaran20 = (short)(localUtil.ctol( httpContext.cgiGet( "vNALBARAN20"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV36Usurcod = httpContext.cgiGet( "vUSURCOD") ;
            AV37Station = httpContext.cgiGet( "vSTATION") ;
            AV16FlagPre = (short)(localUtil.ctol( httpContext.cgiGet( "vFLAGPRE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_date = localUtil.ctod( httpContext.cgiGet( "vTODAY"), 0) ;
            AV41FlagFecCcs = (short)(localUtil.ctol( httpContext.cgiGet( "vFLAGFECCCS"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
            A698PrdDetPar = httpContext.cgiGet( "PRDDETPAR") ;
            A729PrdRotRea = localUtil.ctond( httpContext.cgiGet( "PRDROTREA")) ;
            A727PrdRec = httpContext.cgiGet( "PRDREC") ;
            A5255PrdPreAc2 = localUtil.ctond( httpContext.cgiGet( "PRDPREAC2")) ;
            A856ValCod = (byte)(localUtil.ctol( httpContext.cgiGet( "VALCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A661PedFec = localUtil.ctod( httpContext.cgiGet( "PEDFEC"), 0) ;
            A667PedSit = httpContext.cgiGet( "PEDSIT") ;
            A12580PedAlmc = (byte)(localUtil.ctol( httpContext.cgiGet( "PEDALMC"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
            Dvpanel_unnamedtable1_Objectcall = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Objectcall") ;
            Dvpanel_unnamedtable1_Class = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Class") ;
            Dvpanel_unnamedtable1_Enabled = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Enabled")) ;
            Dvpanel_unnamedtable1_Width = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Width") ;
            Dvpanel_unnamedtable1_Height = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Height") ;
            Dvpanel_unnamedtable1_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Autowidth")) ;
            Dvpanel_unnamedtable1_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Autoheight")) ;
            Dvpanel_unnamedtable1_Cls = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Cls") ;
            Dvpanel_unnamedtable1_Showheader = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Showheader")) ;
            Dvpanel_unnamedtable1_Title = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Title") ;
            Dvpanel_unnamedtable1_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Collapsible")) ;
            Dvpanel_unnamedtable1_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Collapsed")) ;
            Dvpanel_unnamedtable1_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Showcollapseicon")) ;
            Dvpanel_unnamedtable1_Iconposition = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Iconposition") ;
            Dvpanel_unnamedtable1_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Autoscroll")) ;
            Dvpanel_unnamedtable1_Visible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Visible")) ;
            /* Read variables values. */
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
            AV42promptPedido = httpContext.cgiGet( imgavPromptpedido_Internalname) ;
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
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtEntNEmb_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtEntNEmb_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ENTNEMB");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEntNEmb_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A14035EntNEmb = (byte)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A14035EntNEmb", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14035EntNEmb), 2, 0));
            }
            else
            {
               A14035EntNEmb = (byte)(localUtil.ctol( httpContext.cgiGet( edtEntNEmb_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A14035EntNEmb", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14035EntNEmb), 2, 0));
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
            A419EntUniRem = localUtil.ctond( httpContext.cgiGet( edtEntUniRem_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A419EntUniRem", GXutil.ltrimstr( A419EntUniRem, 11, 4));
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
            A657PedCanEnt = localUtil.ctond( httpContext.cgiGet( edtPedCanEnt_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A657PedCanEnt", GXutil.ltrimstr( A657PedCanEnt, 9, 2));
            A669PedUni = localUtil.ctond( httpContext.cgiGet( edtPedUni_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A669PedUni", GXutil.ltrimstr( A669PedUni, 9, 2));
            A684PrdCanPen = localUtil.ctond( httpContext.cgiGet( edtPrdCanPen_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A684PrdCanPen", GXutil.ltrimstr( A684PrdCanPen, 12, 4));
            AV46Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV46Pgmname", AV46Pgmname);
            A3404EntPedCum = GXutil.upper( httpContext.cgiGet( edtEntPedCum_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A3404EntPedCum", A3404EntPedCum);
            A14041EntCump = httpContext.cgiGet( edtEntCump_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14041EntCump", A14041EntCump);
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = new com.genexus.util.GXProperties() ;
            forbiddenHiddens.add("hshsalt", "hsh"+"EntradaProductoAlmacen_TRN");
            forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
            forbiddenHiddens.add("EntCon", localUtil.format( DecimalUtil.doubleToDec(A411EntCon), "9"));
            AV46Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV46Pgmname", AV46Pgmname);
            forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV46Pgmname, "")));
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
            if ( ( ! ( ( A597LinEnt != Z597LinEnt ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
            {
               GXutil.writeLogError("entradaproductoalmacen_trn:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
                        confirm_1T60( ) ;
                        if ( AnyError == 0 )
                        {
                           GX_FocusControl = bttBtntrn_enter_Internalname ;
                           httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                        }
                     }
                  }
                  else
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noinsert"), 1, "LINENT");
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtLinEnt_Internalname ;
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
                        e111T62 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: After Trn */
                        e121T62 ();
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
         e121T62 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( isIns( )  )
         {
            /* Clear variables for new insertion. */
            initAll1T642( ) ;
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
         disableAttributes1T642( ) ;
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

   public void confirm_1T60( )
   {
      beforeValidate1T642( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1T642( ) ;
         }
         else
         {
            checkExtendedTable1T642( ) ;
            closeExtendedTableCursors1T642( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      }
   }

   public void resetCaption1T60( )
   {
   }

   public void e111T62( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV37Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      entradaproductoalmacen_trn_impl.this.GXt_char1 = GXv_char2[0] ;
      AV37Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV37Station", AV37Station);
      GXv_char2[0] = AV7EmprCod ;
      GXv_char3[0] = AV38EmprNom ;
      GXv_char4[0] = AV36Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV37Station, GXv_char2, GXv_char3, GXv_char4) ;
      entradaproductoalmacen_trn_impl.this.AV7EmprCod = GXv_char2[0] ;
      entradaproductoalmacen_trn_impl.this.AV38EmprNom = GXv_char3[0] ;
      entradaproductoalmacen_trn_impl.this.AV36Usurcod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7EmprCod", AV7EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV7EmprCod, "@!"))));
      httpContext.ajax_rsp_assign_attri("", false, "AV38EmprNom", AV38EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV36Usurcod", AV36Usurcod);
      GXt_int5 = (byte)(AV39NoUpd) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV7EmprCod, httpContext.getMessage( "NOUPPR", ""), GXv_int6) ;
      entradaproductoalmacen_trn_impl.this.GXt_int5 = GXv_int6[0] ;
      AV39NoUpd = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV39NoUpd", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV39NoUpd), 4, 0));
      GXt_int7 = AV40Consumos ;
      GXv_int8[0] = GXt_int7 ;
      new app.pbuscon(remoteHandle, context).execute( AV7EmprCod, "011100", GXv_int8) ;
      entradaproductoalmacen_trn_impl.this.GXt_int7 = GXv_int8[0] ;
      AV40Consumos = (short)(GXt_int7) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV40Consumos", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV40Consumos), 4, 0));
      GXt_int5 = (byte)(AV19Nalbaran20) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV7EmprCod, httpContext.getMessage( "ALBA20", ""), GXv_int6) ;
      entradaproductoalmacen_trn_impl.this.GXt_int5 = GXv_int6[0] ;
      AV19Nalbaran20 = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19Nalbaran20", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19Nalbaran20), 4, 0));
      GXt_int5 = (byte)(AV16FlagPre) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV7EmprCod, httpContext.getMessage( "ENTPRE", ""), GXv_int6) ;
      entradaproductoalmacen_trn_impl.this.GXt_int5 = GXv_int6[0] ;
      AV16FlagPre = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16FlagPre", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16FlagPre), 4, 0));
      GXt_int5 = (byte)(AV41FlagFecCcs) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV7EmprCod, httpContext.getMessage( "FECCCS", ""), GXv_int6) ;
      entradaproductoalmacen_trn_impl.this.GXt_int5 = GXv_int6[0] ;
      AV41FlagFecCcs = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV41FlagFecCcs", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV41FlagFecCcs), 4, 0));
      GXt_int5 = (byte)(AV44moda21) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV7EmprCod, httpContext.getMessage( "MODA21", ""), GXv_int6) ;
      entradaproductoalmacen_trn_impl.this.GXt_int5 = GXv_int6[0] ;
      AV44moda21 = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV44moda21", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV44moda21), 4, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODA21", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV44moda21), "ZZZ9")));
      GXt_char1 = AV37Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      entradaproductoalmacen_trn_impl.this.GXt_char1 = GXv_char4[0] ;
      AV37Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV37Station", AV37Station);
      GXv_char4[0] = AV7EmprCod ;
      GXv_char3[0] = AV38EmprNom ;
      GXv_char2[0] = AV36Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV37Station, GXv_char4, GXv_char3, GXv_char2) ;
      entradaproductoalmacen_trn_impl.this.AV7EmprCod = GXv_char4[0] ;
      entradaproductoalmacen_trn_impl.this.AV38EmprNom = GXv_char3[0] ;
      entradaproductoalmacen_trn_impl.this.AV36Usurcod = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7EmprCod", AV7EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV7EmprCod, "@!"))));
      httpContext.ajax_rsp_assign_attri("", false, "AV38EmprNom", AV38EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV36Usurcod", AV36Usurcod);
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
      if ( ( GXutil.strcmp(AV11TrnContext.getgxTv_SdtWWPTransactionContext_Transactionname(), AV46Pgmname) == 0 ) && ( GXutil.strcmp(Gx_mode, "INS") == 0 ) )
      {
         AV48GXV1 = 1 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV48GXV1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV48GXV1), 8, 0));
         while ( AV48GXV1 <= AV11TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().size() )
         {
            AV14TrnContextAtt = (app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)((app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)AV11TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().elementAt(-1+AV48GXV1));
            if ( GXutil.strcmp(AV14TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributename(), "PedCod") == 0 )
            {
               AV13Insert_PedCod = (int)(GXutil.lval( AV14TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributevalue())) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV13Insert_PedCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13Insert_PedCod), 8, 0));
            }
            AV48GXV1 = (int)(AV48GXV1+1) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV48GXV1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV48GXV1), 8, 0));
         }
      }
      edtEntPedCum_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEntPedCum_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEntPedCum_Visible), 5, 0), true);
      edtEntCump_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEntCump_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEntCump_Visible), 5, 0), true);
      imgavPromptpedido_gximage = "prompt" ;
      httpContext.ajax_rsp_assign_prop("", false, imgavPromptpedido_Internalname, "gximage", imgavPromptpedido_gximage, true);
      AV42promptPedido = context.getHttpContext().getImagePath( "f5b04895-0024-488b-8e3b-b687ca4598ee", "", context.getHttpContext().getTheme( )) ;
      httpContext.ajax_rsp_assign_prop("", false, imgavPromptpedido_Internalname, "Bitmap", ((GXutil.strcmp("", AV42promptPedido)==0) ? AV49Promptpedido_GXI : httpContext.convertURL( httpContext.getResourceRelative(AV42promptPedido))), true);
      httpContext.ajax_rsp_assign_prop("", false, imgavPromptpedido_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( AV42promptPedido), true);
      AV49Promptpedido_GXI = GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "f5b04895-0024-488b-8e3b-b687ca4598ee", "", context.getHttpContext().getTheme( )), context.getHttpContext()) ;
      httpContext.ajax_rsp_assign_prop("", false, imgavPromptpedido_Internalname, "Bitmap", ((GXutil.strcmp("", AV42promptPedido)==0) ? AV49Promptpedido_GXI : httpContext.convertURL( httpContext.getResourceRelative(AV42promptPedido))), true);
      httpContext.ajax_rsp_assign_prop("", false, imgavPromptpedido_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( AV42promptPedido), true);
   }

   public void e121T62( )
   {
      /* After Trn Routine */
      returnInSub = false ;
      if ( ! (0==A658PedCod) && ( DecimalUtil.compareTo(A418EntUniEnt, O418EntUniEnt) != 0 ) )
      {
         httpContext.popup(formatLink("app.entradaproductoalmacen_cierrelinea", new String[] {GXutil.URLEncode(GXutil.rtrim(AV7EmprCod)),GXutil.URLEncode(GXutil.rtrim(AV8PrdNum)),GXutil.URLEncode(GXutil.rtrim(A718PrdNom)),GXutil.URLEncode(GXutil.ltrimstr(A658PedCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A597LinEnt,4,0))}, new String[] {"Emprcod","Prdnum","Prdnom","Pedcod","Linent"}) , new Object[] {"AV7EmprCod","AV8PrdNum","A718PrdNom","A658PedCod","A597LinEnt"});
      }
      if ( ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) && ( AV44moda21 == 1 ) )
      {
         new app.stocksquimicos.eliminolotprd(remoteHandle, context).execute( AV7EmprCod, AV8PrdNum, A415EntFecEnt, A5686EntLotN) ;
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ( AV44moda21 == 1 ) )
      {
         httpContext.popup(formatLink("app.entradaloteproducto", new String[] {GXutil.URLEncode(GXutil.rtrim("INS")),GXutil.URLEncode(GXutil.rtrim(AV7EmprCod)),GXutil.URLEncode(GXutil.rtrim(AV8PrdNum)),GXutil.URLEncode(GXutil.rtrim(A718PrdNom)),GXutil.URLEncode(GXutil.ltrimstr(A658PedCod,8,0)),GXutil.URLEncode(GXutil.formatDateParm(A415EntFecEnt)),GXutil.URLEncode(GXutil.ltrimstr(A14035EntNEmb,2,0)),GXutil.URLEncode(GXutil.rtrim(A5686EntLotN))}, new String[] {"Mode","EmprCod","PrdNum","PrdNom","LotePed","LoteFec","LoteNEmb","LoteID"}) , new Object[] {});
      }
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
      /*  Sending Event outputs  */
   }

   public void S112( )
   {
      /* 'ATTRIBUTESSECURITYCODE' Routine */
      returnInSub = false ;
      edtEntNEmb_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEntNEmb_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEntNEmb_Visible), 5, 0), true);
      divEntnemb_cell_Class = "Invisible" ;
      httpContext.ajax_rsp_assign_prop("", false, divEntnemb_cell_Internalname, "Class", divEntnemb_cell_Class, true);
      edtEntNAlbar_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEntNAlbar_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEntNAlbar_Visible), 5, 0), true);
      divEntnalbar_cell_Class = "Invisible" ;
      httpContext.ajax_rsp_assign_prop("", false, divEntnalbar_cell_Internalname, "Class", divEntnalbar_cell_Class, true);
      divDvpanel_unnamedtable1_cell_Class = "col-xs-12 CellMarginTop" ;
      httpContext.ajax_rsp_assign_prop("", false, divDvpanel_unnamedtable1_cell_Internalname, "Class", divDvpanel_unnamedtable1_cell_Class, true);
   }

   public void zm1T642( int GX_JID )
   {
      if ( ( GX_JID == 113 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z411EntCon = T01T63_A411EntCon[0] ;
            Z419EntUniRem = T01T63_A419EntUniRem[0] ;
            Z417EntPre = T01T63_A417EntPre[0] ;
            Z3404EntPedCum = T01T63_A3404EntPedCum[0] ;
            Z415EntFecEnt = T01T63_A415EntFecEnt[0] ;
            Z11Albaran = T01T63_A11Albaran[0] ;
            Z12857EntNAlbar = T01T63_A12857EntNAlbar[0] ;
            Z6156EntPrvNum = T01T63_A6156EntPrvNum[0] ;
            Z418EntUniEnt = T01T63_A418EntUniEnt[0] ;
            Z416EntNumCon = T01T63_A416EntNumCon[0] ;
            Z5686EntLotN = T01T63_A5686EntLotN[0] ;
            Z5685EntFVal = T01T63_A5685EntFVal[0] ;
            Z414EntEti = T01T63_A414EntEti[0] ;
            Z413EntConIni = T01T63_A413EntConIni[0] ;
            Z412EntConFin = T01T63_A412EntConFin[0] ;
            Z5691EntBnc = T01T63_A5691EntBnc[0] ;
            Z7695EntCC = T01T63_A7695EntCC[0] ;
            Z7696EntCCoCod = T01T63_A7696EntCCoCod[0] ;
            Z10782EntUniAlb = T01T63_A10782EntUniAlb[0] ;
            Z10783EntObs = T01T63_A10783EntObs[0] ;
            Z10187EntRemNro = T01T63_A10187EntRemNro[0] ;
            Z10186EntRemFch = T01T63_A10186EntRemFch[0] ;
            Z10185EntRemSuc = T01T63_A10185EntRemSuc[0] ;
            Z10184EntRemTpo = T01T63_A10184EntRemTpo[0] ;
            Z12716EntFabId = T01T63_A12716EntFabId[0] ;
            Z13235EntLoteID = T01T63_A13235EntLoteID[0] ;
            Z13456EntUbicaci = T01T63_A13456EntUbicaci[0] ;
            Z5690EntHfCon = T01T63_A5690EntHfCon[0] ;
            Z5689EntFfCon = T01T63_A5689EntFfCon[0] ;
            Z5688EntHiCon = T01T63_A5688EntHiCon[0] ;
            Z5687EntFiCon = T01T63_A5687EntFiCon[0] ;
            Z14035EntNEmb = T01T63_A14035EntNEmb[0] ;
            Z658PedCod = T01T63_A658PedCod[0] ;
         }
         else
         {
            Z411EntCon = A411EntCon ;
            Z419EntUniRem = A419EntUniRem ;
            Z417EntPre = A417EntPre ;
            Z3404EntPedCum = A3404EntPedCum ;
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
            Z14035EntNEmb = A14035EntNEmb ;
            Z658PedCod = A658PedCod ;
         }
      }
      if ( ( GX_JID == 115 ) || ( GX_JID == 0 ) )
      {
         Z726PrdPreMed = T01T66_A726PrdPreMed[0] ;
         Z713PrdFulEnt = T01T66_A713PrdFulEnt[0] ;
         Z709PrdFecPre = T01T66_A709PrdFecPre[0] ;
         Z725PrdPreAnt = T01T66_A725PrdPreAnt[0] ;
         Z724PrdPreAct = T01T66_A724PrdPreAct[0] ;
         Z684PrdCanPen = T01T66_A684PrdCanPen[0] ;
         Z718PrdNom = T01T66_A718PrdNom[0] ;
         Z698PrdDetPar = T01T66_A698PrdDetPar[0] ;
         Z729PrdRotRea = T01T66_A729PrdRotRea[0] ;
         Z727PrdRec = T01T66_A727PrdRec[0] ;
         Z5255PrdPreAc2 = T01T66_A5255PrdPreAc2[0] ;
         Z705PrdExiCC = T01T66_A705PrdExiCC[0] ;
         Z795PrvNum = T01T66_A795PrvNum[0] ;
         Z856ValCod = T01T66_A856ValCod[0] ;
      }
      if ( ( GX_JID == 117 ) || ( GX_JID == 0 ) )
      {
         Z663PedFulEnt = T01T69_A663PedFulEnt[0] ;
         Z665PedPre = T01T69_A665PedPre[0] ;
         Z669PedUni = T01T69_A669PedUni[0] ;
         Z659PedCum = T01T69_A659PedCum[0] ;
         Z660PedDto = T01T69_A660PedDto[0] ;
      }
      if ( GX_JID == -113 )
      {
         Z597LinEnt = A597LinEnt ;
         Z411EntCon = A411EntCon ;
         Z419EntUniRem = A419EntUniRem ;
         Z417EntPre = A417EntPre ;
         Z3404EntPedCum = A3404EntPedCum ;
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
         Z14035EntNEmb = A14035EntNEmb ;
         Z396EmprCod = A396EmprCod ;
         Z719PrdNum = A719PrdNum ;
         Z658PedCod = A658PedCod ;
         Z407EmprNom = A407EmprNom ;
         Z3915EmpNumDec = A3915EmpNumDec ;
         Z847UltLinEnt = A847UltLinEnt ;
         Z704PrdExiAlm = A704PrdExiAlm ;
         Z726PrdPreMed = A726PrdPreMed ;
         Z750PrdValStk = A750PrdValStk ;
         Z713PrdFulEnt = A713PrdFulEnt ;
         Z709PrdFecPre = A709PrdFecPre ;
         Z725PrdPreAnt = A725PrdPreAnt ;
         Z724PrdPreAct = A724PrdPreAct ;
         Z684PrdCanPen = A684PrdCanPen ;
         Z718PrdNom = A718PrdNom ;
         Z698PrdDetPar = A698PrdDetPar ;
         Z729PrdRotRea = A729PrdRotRea ;
         Z727PrdRec = A727PrdRec ;
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
         Z663PedFulEnt = A663PedFulEnt ;
         Z665PedPre = A665PedPre ;
         Z669PedUni = A669PedUni ;
         Z659PedCum = A659PedCum ;
         Z660PedDto = A660PedDto ;
      }
   }

   public void standaloneNotModal( )
   {
      if ( ! ( ( 1 == 0 ) ) )
      {
         divDvpanel_unnamedtable1_cell_Class = httpContext.getMessage( "Invisible", "") ;
         httpContext.ajax_rsp_assign_prop("", false, divDvpanel_unnamedtable1_cell_Internalname, "Class", divDvpanel_unnamedtable1_cell_Class, true);
      }
      else
      {
         if ( 1 == 0 )
         {
            divDvpanel_unnamedtable1_cell_Class = httpContext.getMessage( "col-xs-12 CellMarginTop", "") ;
            httpContext.ajax_rsp_assign_prop("", false, divDvpanel_unnamedtable1_cell_Internalname, "Class", divDvpanel_unnamedtable1_cell_Class, true);
         }
      }
      edtEntUniRem_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEntUniRem_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEntUniRem_Enabled), 5, 0), true);
      Gx_date = GXutil.today( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_date", localUtil.format(Gx_date, "99/99/99"));
      AV46Pgmname = "EntradaProductoAlmacen_TRN" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV46Pgmname", AV46Pgmname);
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
      /* Using cursor T01T64 */
      pr_default.execute(2, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01T64_A407EmprNom[0] ;
      n407EmprNom = T01T64_n407EmprNom[0] ;
      A3915EmpNumDec = T01T64_A3915EmpNumDec[0] ;
      n3915EmpNumDec = T01T64_n3915EmpNumDec[0] ;
      pr_default.close(2);
      GXt_int5 = (byte)(0) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV7EmprCod, httpContext.getMessage( httpContext.getMessage( "MODA21", ""), ""), GXv_int6) ;
      entradaproductoalmacen_trn_impl.this.GXt_int5 = GXv_int6[0] ;
      edtEntNEmb_Visible = ((GXt_int5==1) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtEntNEmb_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEntNEmb_Visible), 5, 0), true);
      GXt_int5 = (byte)(0) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV7EmprCod, httpContext.getMessage( httpContext.getMessage( "MODA21", ""), ""), GXv_int6) ;
      entradaproductoalmacen_trn_impl.this.GXt_int5 = GXv_int6[0] ;
      if ( ! ( ( GXt_int5 == 1 ) ) )
      {
         divEntnemb_cell_Class = httpContext.getMessage( "Invisible", "") ;
         httpContext.ajax_rsp_assign_prop("", false, divEntnemb_cell_Internalname, "Class", divEntnemb_cell_Class, true);
      }
      else
      {
         GXt_int5 = (byte)(0) ;
         GXv_int6[0] = GXt_int5 ;
         new app.pexicon(remoteHandle, context).execute( AV7EmprCod, httpContext.getMessage( httpContext.getMessage( "MODA21", ""), ""), GXv_int6) ;
         entradaproductoalmacen_trn_impl.this.GXt_int5 = GXv_int6[0] ;
         if ( GXt_int5 == 1 )
         {
            divEntnemb_cell_Class = httpContext.getMessage( "col-xs-12 col-sm-1 DataContentCell", "") ;
            httpContext.ajax_rsp_assign_prop("", false, divEntnemb_cell_Internalname, "Class", divEntnemb_cell_Class, true);
         }
      }
      GXt_int5 = (byte)(0) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV7EmprCod, httpContext.getMessage( httpContext.getMessage( "ALBA20", ""), ""), GXv_int6) ;
      entradaproductoalmacen_trn_impl.this.GXt_int5 = GXv_int6[0] ;
      edtEntNAlbar_Visible = ((GXt_int5==1) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtEntNAlbar_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEntNAlbar_Visible), 5, 0), true);
      GXt_int5 = (byte)(0) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV7EmprCod, httpContext.getMessage( httpContext.getMessage( "ALBA20", ""), ""), GXv_int6) ;
      entradaproductoalmacen_trn_impl.this.GXt_int5 = GXv_int6[0] ;
      if ( ! ( ( GXt_int5 == 1 ) ) )
      {
         divEntnalbar_cell_Class = httpContext.getMessage( "Invisible", "") ;
         httpContext.ajax_rsp_assign_prop("", false, divEntnalbar_cell_Internalname, "Class", divEntnalbar_cell_Class, true);
      }
      else
      {
         GXt_int5 = (byte)(0) ;
         GXv_int6[0] = GXt_int5 ;
         new app.pexicon(remoteHandle, context).execute( AV7EmprCod, httpContext.getMessage( httpContext.getMessage( "ALBA20", ""), ""), GXv_int6) ;
         entradaproductoalmacen_trn_impl.this.GXt_int5 = GXv_int6[0] ;
         if ( GXt_int5 == 1 )
         {
            divEntnalbar_cell_Class = httpContext.getMessage( "col-xs-12 col-sm-1 DataContentCell", "") ;
            httpContext.ajax_rsp_assign_prop("", false, divEntnalbar_cell_Internalname, "Class", divEntnalbar_cell_Class, true);
         }
      }
      if ( ! (GXutil.strcmp("", AV8PrdNum)==0) )
      {
         A719PrdNum = AV8PrdNum ;
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
      }
      /* Using cursor T01T66 */
      pr_default.execute(4, new Object[] {A396EmprCod, A719PrdNum});
      zm1T642( 115) ;
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PRODUC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PRDNUM");
         AnyError = (short)(1) ;
      }
      A847UltLinEnt = T01T66_A847UltLinEnt[0] ;
      A704PrdExiAlm = T01T66_A704PrdExiAlm[0] ;
      A726PrdPreMed = T01T66_A726PrdPreMed[0] ;
      A750PrdValStk = T01T66_A750PrdValStk[0] ;
      A713PrdFulEnt = T01T66_A713PrdFulEnt[0] ;
      A709PrdFecPre = T01T66_A709PrdFecPre[0] ;
      A725PrdPreAnt = T01T66_A725PrdPreAnt[0] ;
      A724PrdPreAct = T01T66_A724PrdPreAct[0] ;
      A684PrdCanPen = T01T66_A684PrdCanPen[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A684PrdCanPen", GXutil.ltrimstr( A684PrdCanPen, 12, 4));
      A718PrdNom = T01T66_A718PrdNom[0] ;
      A698PrdDetPar = T01T66_A698PrdDetPar[0] ;
      A729PrdRotRea = T01T66_A729PrdRotRea[0] ;
      A727PrdRec = T01T66_A727PrdRec[0] ;
      A5255PrdPreAc2 = T01T66_A5255PrdPreAc2[0] ;
      A705PrdExiCC = T01T66_A705PrdExiCC[0] ;
      A795PrvNum = T01T66_A795PrvNum[0] ;
      A856ValCod = T01T66_A856ValCod[0] ;
      O724PrdPreAct = A724PrdPreAct ;
      httpContext.ajax_rsp_assign_attri("", false, "A724PrdPreAct", GXutil.ltrimstr( A724PrdPreAct, 14, 5));
      O750PrdValStk = A750PrdValStk ;
      httpContext.ajax_rsp_assign_attri("", false, "A750PrdValStk", GXutil.ltrimstr( A750PrdValStk, 11, 2));
      O704PrdExiAlm = A704PrdExiAlm ;
      httpContext.ajax_rsp_assign_attri("", false, "A704PrdExiAlm", GXutil.ltrimstr( A704PrdExiAlm, 12, 4));
      O847UltLinEnt = A847UltLinEnt ;
      httpContext.ajax_rsp_assign_attri("", false, "A847UltLinEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A847UltLinEnt), 4, 0));
      pr_default.close(3);
      /* Using cursor T01T610 */
      pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(A795PrvNum)});
      if ( (pr_default.getStatus(8) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PRVGEN", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PRVNUM");
         AnyError = (short)(1) ;
      }
      A794PrvNom = T01T610_A794PrvNom[0] ;
      n794PrvNom = T01T610_n794PrvNom[0] ;
      A800PrvPri = T01T610_A800PrvPri[0] ;
      n800PrvPri = T01T610_n800PrvPri[0] ;
      pr_default.close(8);
      /* Using cursor T01T612 */
      pr_default.execute(9, new Object[] {A396EmprCod, A719PrdNum});
      if ( (pr_default.getStatus(9) != 101) )
      {
         A913StockRem = T01T612_A913StockRem[0] ;
         n913StockRem = T01T612_n913StockRem[0] ;
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
      entradaproductoalmacen_trn_impl.this.A396EmprCod = GXv_char4[0] ;
      entradaproductoalmacen_trn_impl.this.A719PrdNum = GXv_char3[0] ;
      entradaproductoalmacen_trn_impl.this.GXt_date10 = GXv_date11[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
      A14040PrdUltMovF = GXt_date10 ;
      httpContext.ajax_rsp_assign_attri("", false, "A14040PrdUltMovF", localUtil.format(A14040PrdUltMovF, "99/99/99"));
      GXt_date10 = A3835UltFecCCs ;
      GXv_char4[0] = A396EmprCod ;
      GXv_char3[0] = A719PrdNum ;
      GXv_date11[0] = GXt_date10 ;
      new app.pstm005(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_date11) ;
      entradaproductoalmacen_trn_impl.this.A396EmprCod = GXv_char4[0] ;
      entradaproductoalmacen_trn_impl.this.A719PrdNum = GXv_char3[0] ;
      entradaproductoalmacen_trn_impl.this.GXt_date10 = GXv_date11[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
      A3835UltFecCCs = GXt_date10 ;
      httpContext.ajax_rsp_assign_attri("", false, "A3835UltFecCCs", localUtil.format(A3835UltFecCCs, "99/99/99"));
      imgavPromptpedido_Link = ((GXutil.strcmp(Gx_mode, "DSP")==0) ? "" : "javascript:"+"gx.popup.openPrompt('"+"app.stocksquimicos.pedidoporproducto_wp"+"',["+"'"+WebUtils.htmlEncode( GXutil.strReplace( GXutil.rtrim( A396EmprCod), "'", "\\'"))+"'"+","+"'"+WebUtils.htmlEncode( GXutil.strReplace( GXutil.rtrim( A719PrdNum), "'", "\\'"))+"'"+","+"{Ctrl:gx.dom.el('"+"PEDCOD"+"'), id:'"+"PEDCOD"+"'"+",IOType:'out'}"+","+"{Ctrl:gx.dom.el('"+"ENTUNIENT"+"'), id:'"+"ENTUNIENT"+"'"+",IOType:'out'}"+","+"{Ctrl:gx.dom.el('"+"ENTPRVNUM"+"'), id:'"+"ENTPRVNUM"+"'"+",IOType:'out'}"+","+"{Ctrl:gx.dom.el('"+"PEDCANENT"+"'), id:'"+"PEDCANENT"+"'"+",IOType:'out'}"+","+"{Ctrl:gx.dom.el('"+"PEDUNI"+"'), id:'"+"PEDUNI"+"'"+",IOType:'out'}"+"],"+"null"+","+"'', false"+","+"false"+");") ;
      httpContext.ajax_rsp_assign_prop("", false, imgavPromptpedido_Internalname, "Link", imgavPromptpedido_Link, true);
      imgprompt_6156_Link = ((GXutil.strcmp(Gx_mode, "DSP")==0) ? "" : "javascript:"+"gx.popup.openPrompt('"+"app.proveedorporproducto_wp"+"',["+"'"+WebUtils.htmlEncode( GXutil.strReplace( GXutil.rtrim( A396EmprCod), "'", "\\'"))+"'"+","+"'"+WebUtils.htmlEncode( GXutil.strReplace( GXutil.rtrim( A719PrdNum), "'", "\\'"))+"'"+","+"{Ctrl:gx.dom.el('"+"ENTPRVNUM"+"'), id:'"+"ENTPRVNUM"+"'"+",IOType:'out'}"+"],"+"null"+","+"'', false"+","+"false"+");") ;
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
      if ( isIns( )  )
      {
         edtLinEnt_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtLinEnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLinEnt_Enabled), 5, 0), true);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV13Insert_PedCod) )
      {
         A658PedCod = AV13Insert_PedCod ;
         n658PedCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A658PedCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A658PedCod), 8, 0));
      }
      if ( ! (0==AV9LinEnt) )
      {
         edtLinEnt_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtLinEnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLinEnt_Enabled), 5, 0), true);
      }
      else
      {
         if ( isIns( )  )
         {
            edtLinEnt_Enabled = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, edtLinEnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLinEnt_Enabled), 5, 0), true);
         }
         else
         {
            edtLinEnt_Enabled = 1 ;
            httpContext.ajax_rsp_assign_prop("", false, edtLinEnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLinEnt_Enabled), 5, 0), true);
         }
      }
      if ( isIns( )  )
      {
         A847UltLinEnt = (short)(O847UltLinEnt+1) ;
         httpContext.ajax_rsp_assign_attri("", false, "A847UltLinEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A847UltLinEnt), 4, 0));
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
      if ( isIns( )  && (0==A6156EntPrvNum) && ( Gx_BScreen == 0 ) )
      {
         A6156EntPrvNum = A795PrvNum ;
         n6156EntPrvNum = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A6156EntPrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6156EntPrvNum), 6, 0));
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
         /* Using cursor T01T67 */
         pr_default.execute(5, new Object[] {A396EmprCod, Boolean.valueOf(n658PedCod), Integer.valueOf(A658PedCod)});
         A661PedFec = T01T67_A661PedFec[0] ;
         A667PedSit = T01T67_A667PedSit[0] ;
         A666PedPri = T01T67_A666PedPri[0] ;
         A12580PedAlmc = T01T67_A12580PedAlmc[0] ;
         pr_default.close(5);
         /* Using cursor T01T69 */
         pr_default.execute(7, new Object[] {A396EmprCod, Boolean.valueOf(n658PedCod), Integer.valueOf(A658PedCod), A719PrdNum});
         zm1T642( 117) ;
         A657PedCanEnt = T01T69_A657PedCanEnt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A657PedCanEnt", GXutil.ltrimstr( A657PedCanEnt, 9, 2));
         A663PedFulEnt = T01T69_A663PedFulEnt[0] ;
         A665PedPre = T01T69_A665PedPre[0] ;
         A669PedUni = T01T69_A669PedUni[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A669PedUni", GXutil.ltrimstr( A669PedUni, 9, 2));
         A659PedCum = T01T69_A659PedCum[0] ;
         A660PedDto = T01T69_A660PedDto[0] ;
         O657PedCanEnt = A657PedCanEnt ;
         httpContext.ajax_rsp_assign_attri("", false, "A657PedCanEnt", GXutil.ltrimstr( A657PedCanEnt, 9, 2));
         pr_default.close(7);
         A664PedNumLin = (short)(getPedNumLin0( A396EmprCod, A658PedCod)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A664PedNumLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A664PedNumLin), 3, 0));
         if ( true /* After */ )
         {
            GXt_char1 = AV18PrdNomX ;
            GXv_char4[0] = A396EmprCod ;
            GXv_int8[0] = A6156EntPrvNum ;
            GXv_char3[0] = GXt_char1 ;
            new app.pctrprv(remoteHandle, context).execute( GXv_char4, GXv_int8, GXv_char3) ;
            entradaproductoalmacen_trn_impl.this.A396EmprCod = GXv_char4[0] ;
            entradaproductoalmacen_trn_impl.this.A6156EntPrvNum = GXv_int8[0] ;
            entradaproductoalmacen_trn_impl.this.GXt_char1 = GXv_char3[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            httpContext.ajax_rsp_assign_attri("", false, "A6156EntPrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6156EntPrvNum), 6, 0));
            AV18PrdNomX = GXt_char1 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV18PrdNomX", AV18PrdNomX);
         }
         AV22Year = (short)(GXutil.year( A415EntFecEnt)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV22Year", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV22Year), 4, 0));
         AV28Fecha = localUtil.ymdtod( AV22Year, 12, 1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV28Fecha", localUtil.format(AV28Fecha, "99/99/99"));
         AV23Mes = (byte)(GXutil.month( A415EntFecEnt)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV23Mes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV23Mes), 2, 0));
         AV34oldEntFecent = O415EntFecEnt ;
         httpContext.ajax_rsp_assign_attri("", false, "AV34oldEntFecent", localUtil.format(AV34oldEntFecent, "99/99/99"));
         AV20FecAnt = O415EntFecEnt ;
         httpContext.ajax_rsp_assign_attri("", false, "AV20FecAnt", localUtil.format(AV20FecAnt, "99/99/99"));
         AV25AnyAnt = (short)(GXutil.year( O415EntFecEnt)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV25AnyAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV25AnyAnt), 4, 0));
         AV26MesAnt = (byte)(GXutil.month( O415EntFecEnt)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV26MesAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV26MesAnt), 2, 0));
         AV15msg_ctrl_fecha = httpContext.getMessage( httpContext.getMessage( "Atencion.Ultimo Mov Fecha ", ""), "") + GXutil.trim( localUtil.dtoc( A14040PrdUltMovF, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")) + httpContext.getMessage( httpContext.getMessage( " superior a Fecha Mov ", ""), "") + GXutil.trim( localUtil.dtoc( A415EntFecEnt, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV15msg_ctrl_fecha", AV15msg_ctrl_fecha);
         AV29DiasFin = (short)(GXutil.ddiff(GXutil.eomdate( AV28Fecha),A415EntFecEnt)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV29DiasFin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29DiasFin), 3, 0));
      }
   }

   public void load1T642( )
   {
      /* Using cursor T01T614 */
      pr_default.execute(10, new Object[] {A396EmprCod, A719PrdNum, Short.valueOf(A597LinEnt)});
      if ( (pr_default.getStatus(10) != 101) )
      {
         RcdFound42 = (short)(1) ;
         A847UltLinEnt = T01T614_A847UltLinEnt[0] ;
         A704PrdExiAlm = T01T614_A704PrdExiAlm[0] ;
         A411EntCon = T01T614_A411EntCon[0] ;
         A657PedCanEnt = T01T614_A657PedCanEnt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A657PedCanEnt", GXutil.ltrimstr( A657PedCanEnt, 9, 2));
         A663PedFulEnt = T01T614_A663PedFulEnt[0] ;
         A726PrdPreMed = T01T614_A726PrdPreMed[0] ;
         A750PrdValStk = T01T614_A750PrdValStk[0] ;
         A713PrdFulEnt = T01T614_A713PrdFulEnt[0] ;
         A709PrdFecPre = T01T614_A709PrdFecPre[0] ;
         A725PrdPreAnt = T01T614_A725PrdPreAnt[0] ;
         A724PrdPreAct = T01T614_A724PrdPreAct[0] ;
         A684PrdCanPen = T01T614_A684PrdCanPen[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A684PrdCanPen", GXutil.ltrimstr( A684PrdCanPen, 12, 4));
         A419EntUniRem = T01T614_A419EntUniRem[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A419EntUniRem", GXutil.ltrimstr( A419EntUniRem, 11, 4));
         A417EntPre = T01T614_A417EntPre[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A417EntPre", GXutil.ltrimstr( A417EntPre, 14, 5));
         A3404EntPedCum = T01T614_A3404EntPedCum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3404EntPedCum", A3404EntPedCum);
         A718PrdNom = T01T614_A718PrdNom[0] ;
         A794PrvNom = T01T614_A794PrvNom[0] ;
         n794PrvNom = T01T614_n794PrvNom[0] ;
         A698PrdDetPar = T01T614_A698PrdDetPar[0] ;
         A729PrdRotRea = T01T614_A729PrdRotRea[0] ;
         A727PrdRec = T01T614_A727PrdRec[0] ;
         A407EmprNom = T01T614_A407EmprNom[0] ;
         n407EmprNom = T01T614_n407EmprNom[0] ;
         A800PrvPri = T01T614_A800PrvPri[0] ;
         n800PrvPri = T01T614_n800PrvPri[0] ;
         A3915EmpNumDec = T01T614_A3915EmpNumDec[0] ;
         n3915EmpNumDec = T01T614_n3915EmpNumDec[0] ;
         A5255PrdPreAc2 = T01T614_A5255PrdPreAc2[0] ;
         A705PrdExiCC = T01T614_A705PrdExiCC[0] ;
         A415EntFecEnt = T01T614_A415EntFecEnt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A415EntFecEnt", localUtil.format(A415EntFecEnt, "99/99/99"));
         A11Albaran = T01T614_A11Albaran[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11Albaran", A11Albaran);
         A12857EntNAlbar = T01T614_A12857EntNAlbar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12857EntNAlbar", A12857EntNAlbar);
         A6156EntPrvNum = T01T614_A6156EntPrvNum[0] ;
         n6156EntPrvNum = T01T614_n6156EntPrvNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6156EntPrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6156EntPrvNum), 6, 0));
         A661PedFec = T01T614_A661PedFec[0] ;
         A418EntUniEnt = T01T614_A418EntUniEnt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A418EntUniEnt", GXutil.ltrimstr( A418EntUniEnt, 9, 2));
         A665PedPre = T01T614_A665PedPre[0] ;
         A669PedUni = T01T614_A669PedUni[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A669PedUni", GXutil.ltrimstr( A669PedUni, 9, 2));
         A416EntNumCon = T01T614_A416EntNumCon[0] ;
         A5686EntLotN = T01T614_A5686EntLotN[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5686EntLotN", A5686EntLotN);
         A5685EntFVal = T01T614_A5685EntFVal[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5685EntFVal", localUtil.format(A5685EntFVal, "99/99/99"));
         A414EntEti = T01T614_A414EntEti[0] ;
         A413EntConIni = T01T614_A413EntConIni[0] ;
         A412EntConFin = T01T614_A412EntConFin[0] ;
         A659PedCum = T01T614_A659PedCum[0] ;
         A667PedSit = T01T614_A667PedSit[0] ;
         A666PedPri = T01T614_A666PedPri[0] ;
         A660PedDto = T01T614_A660PedDto[0] ;
         A5691EntBnc = T01T614_A5691EntBnc[0] ;
         A7695EntCC = T01T614_A7695EntCC[0] ;
         A7696EntCCoCod = T01T614_A7696EntCCoCod[0] ;
         A10782EntUniAlb = T01T614_A10782EntUniAlb[0] ;
         A10783EntObs = T01T614_A10783EntObs[0] ;
         A10187EntRemNro = T01T614_A10187EntRemNro[0] ;
         A10186EntRemFch = T01T614_A10186EntRemFch[0] ;
         A10185EntRemSuc = T01T614_A10185EntRemSuc[0] ;
         A10184EntRemTpo = T01T614_A10184EntRemTpo[0] ;
         A12580PedAlmc = T01T614_A12580PedAlmc[0] ;
         A12716EntFabId = T01T614_A12716EntFabId[0] ;
         A13235EntLoteID = T01T614_A13235EntLoteID[0] ;
         A13456EntUbicaci = T01T614_A13456EntUbicaci[0] ;
         A5690EntHfCon = T01T614_A5690EntHfCon[0] ;
         A5689EntFfCon = T01T614_A5689EntFfCon[0] ;
         A5688EntHiCon = T01T614_A5688EntHiCon[0] ;
         A5687EntFiCon = T01T614_A5687EntFiCon[0] ;
         A14035EntNEmb = T01T614_A14035EntNEmb[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14035EntNEmb", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14035EntNEmb), 2, 0));
         A658PedCod = T01T614_A658PedCod[0] ;
         n658PedCod = T01T614_n658PedCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A658PedCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A658PedCod), 8, 0));
         A795PrvNum = T01T614_A795PrvNum[0] ;
         A856ValCod = T01T614_A856ValCod[0] ;
         A913StockRem = T01T614_A913StockRem[0] ;
         n913StockRem = T01T614_n913StockRem[0] ;
         zm1T642( -113) ;
      }
      pr_default.close(10);
      onLoadActions1T642( ) ;
   }

   public void onLoadActions1T642( )
   {
      O724PrdPreAct = A724PrdPreAct ;
      httpContext.ajax_rsp_assign_attri("", false, "A724PrdPreAct", GXutil.ltrimstr( A724PrdPreAct, 14, 5));
      O750PrdValStk = A750PrdValStk ;
      httpContext.ajax_rsp_assign_attri("", false, "A750PrdValStk", GXutil.ltrimstr( A750PrdValStk, 11, 2));
      O657PedCanEnt = A657PedCanEnt ;
      httpContext.ajax_rsp_assign_attri("", false, "A657PedCanEnt", GXutil.ltrimstr( A657PedCanEnt, 9, 2));
      O704PrdExiAlm = A704PrdExiAlm ;
      httpContext.ajax_rsp_assign_attri("", false, "A704PrdExiAlm", GXutil.ltrimstr( A704PrdExiAlm, 12, 4));
      O847UltLinEnt = A847UltLinEnt ;
      httpContext.ajax_rsp_assign_attri("", false, "A847UltLinEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A847UltLinEnt), 4, 0));
      AV22Year = (short)(GXutil.year( A415EntFecEnt)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV22Year", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV22Year), 4, 0));
      AV28Fecha = localUtil.ymdtod( AV22Year, 12, 1) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV28Fecha", localUtil.format(AV28Fecha, "99/99/99"));
      AV23Mes = (byte)(GXutil.month( A415EntFecEnt)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV23Mes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV23Mes), 2, 0));
      AV34oldEntFecent = O415EntFecEnt ;
      httpContext.ajax_rsp_assign_attri("", false, "AV34oldEntFecent", localUtil.format(AV34oldEntFecent, "99/99/99"));
      AV20FecAnt = O415EntFecEnt ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20FecAnt", localUtil.format(AV20FecAnt, "99/99/99"));
      AV25AnyAnt = (short)(GXutil.year( O415EntFecEnt)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV25AnyAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV25AnyAnt), 4, 0));
      AV26MesAnt = (byte)(GXutil.month( O415EntFecEnt)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV26MesAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV26MesAnt), 2, 0));
      AV29DiasFin = (short)(GXutil.ddiff(GXutil.eomdate( AV28Fecha),A415EntFecEnt)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV29DiasFin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29DiasFin), 3, 0));
      if ( true /* After */ )
      {
         GXt_char1 = AV18PrdNomX ;
         GXv_char4[0] = A396EmprCod ;
         GXv_int8[0] = A6156EntPrvNum ;
         GXv_char3[0] = GXt_char1 ;
         new app.pctrprv(remoteHandle, context).execute( GXv_char4, GXv_int8, GXv_char3) ;
         entradaproductoalmacen_trn_impl.this.A396EmprCod = GXv_char4[0] ;
         entradaproductoalmacen_trn_impl.this.A6156EntPrvNum = GXv_int8[0] ;
         entradaproductoalmacen_trn_impl.this.GXt_char1 = GXv_char3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A6156EntPrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6156EntPrvNum), 6, 0));
         AV18PrdNomX = GXt_char1 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV18PrdNomX", AV18PrdNomX);
      }
      AV32OldEntUni = O418EntUniEnt ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32OldEntUni", GXutil.ltrimstr( AV32OldEntUni, 9, 2));
      AV21UniOld = O418EntUniEnt ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21UniOld", GXutil.ltrimstr( AV21UniOld, 9, 2));
      if ( isIns( )  )
      {
         A419EntUniRem = O419EntUniRem.add(A418EntUniEnt) ;
         httpContext.ajax_rsp_assign_attri("", false, "A419EntUniRem", GXutil.ltrimstr( A419EntUniRem, 11, 4));
      }
      else
      {
         if ( isUpd( )  )
         {
            A419EntUniRem = (O419EntUniRem.add(A418EntUniEnt).subtract(O418EntUniEnt)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A419EntUniRem", GXutil.ltrimstr( A419EntUniRem, 11, 4));
         }
         else
         {
            if ( isDlt( )  )
            {
               A419EntUniRem = (O419EntUniRem.subtract(A418EntUniEnt)) ;
               httpContext.ajax_rsp_assign_attri("", false, "A419EntUniRem", GXutil.ltrimstr( A419EntUniRem, 11, 4));
            }
         }
      }
      if ( (0==A658PedCod) )
      {
         edtEntPedCum_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtEntPedCum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEntPedCum_Enabled), 5, 0), true);
      }
      else
      {
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
      AV35oldlote = O5686EntLotN ;
      httpContext.ajax_rsp_assign_attri("", false, "AV35oldlote", AV35oldlote);
      AV33OldRemanente = O419EntUniRem ;
      httpContext.ajax_rsp_assign_attri("", false, "AV33OldRemanente", GXutil.ltrimstr( AV33OldRemanente, 11, 4));
      if ( isIns( )  && (0==A12716EntFabId) && ( Gx_BScreen == 0 ) )
      {
         A12716EntFabId = A6156EntPrvNum ;
         httpContext.ajax_rsp_assign_attri("", false, "A12716EntFabId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12716EntFabId), 6, 0));
      }
      A664PedNumLin = (short)(getPedNumLin0( A396EmprCod, A658PedCod)) ;
      httpContext.ajax_rsp_assign_attri("", false, "A664PedNumLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A664PedNumLin), 3, 0));
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
      AV31OldExiAlm = O704PrdExiAlm ;
      httpContext.ajax_rsp_assign_attri("", false, "AV31OldExiAlm", GXutil.ltrimstr( AV31OldExiAlm, 12, 4));
      if ( ( isIns( )  || isUpd( )  ) && ( AV39NoUpd == 0 ) )
      {
         A713PrdFulEnt = A415EntFecEnt ;
         httpContext.ajax_rsp_assign_attri("", false, "A713PrdFulEnt", localUtil.format(A713PrdFulEnt, "99/99/99"));
      }
      if ( ( isIns( )  || isUpd( )  ) && ( AV39NoUpd == 0 ) )
      {
         A709PrdFecPre = A415EntFecEnt ;
         httpContext.ajax_rsp_assign_attri("", false, "A709PrdFecPre", localUtil.format(A709PrdFecPre, "99/99/99"));
      }
      if ( ( A684PrdCanPen.doubleValue() < 0 ) && ! (0==A658PedCod) )
      {
         A684PrdCanPen = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A684PrdCanPen", GXutil.ltrimstr( A684PrdCanPen, 12, 4));
      }
      if ( true )
      {
         AV24PedPri = GXutil.str( A800PrvPri, 1, 0) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV24PedPri", AV24PedPri);
      }
      else
      {
         if ( true /* Level */ && ! (0==A658PedCod) )
         {
            AV24PedPri = A666PedPri ;
            httpContext.ajax_rsp_assign_attri("", false, "AV24PedPri", AV24PedPri);
         }
      }
      AV15msg_ctrl_fecha = httpContext.getMessage( httpContext.getMessage( "Atencion.Ultimo Mov Fecha ", ""), "") + GXutil.trim( localUtil.dtoc( A14040PrdUltMovF, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")) + httpContext.getMessage( httpContext.getMessage( " superior a Fecha Mov ", ""), "") + GXutil.trim( localUtil.dtoc( A415EntFecEnt, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15msg_ctrl_fecha", AV15msg_ctrl_fecha);
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
         httpContext.ajax_rsp_assign_attri("", false, "A14041EntCump", A14041EntCump);
      }
      else
      {
         if ( ( ( DecimalUtil.compareTo(A657PedCanEnt, A669PedUni) > 0 ) ) && ! (0==A658PedCod) )
         {
            A14041EntCump = "S" ;
            httpContext.ajax_rsp_assign_attri("", false, "A14041EntCump", A14041EntCump);
         }
         else
         {
            if ( ( DecimalUtil.compareTo(A657PedCanEnt, A669PedUni) < 0 ) && ! (0==A658PedCod) )
            {
               A14041EntCump = "N" ;
               httpContext.ajax_rsp_assign_attri("", false, "A14041EntCump", A14041EntCump);
            }
            else
            {
               if ( (0==A658PedCod) )
               {
                  A14041EntCump = "S" ;
                  httpContext.ajax_rsp_assign_attri("", false, "A14041EntCump", A14041EntCump);
               }
               else
               {
                  A14041EntCump = "" ;
                  httpContext.ajax_rsp_assign_attri("", false, "A14041EntCump", A14041EntCump);
               }
            }
         }
      }
      if ( isIns( )  && (GXutil.strcmp("", A3404EntPedCum)==0) && ( Gx_BScreen == 0 ) )
      {
         A3404EntPedCum = httpContext.getMessage( httpContext.getMessage( "N", ""), "") ;
         httpContext.ajax_rsp_assign_attri("", false, "A3404EntPedCum", A3404EntPedCum);
      }
      else
      {
         if ( isIns( )  && ! (0==A658PedCod) && ( GXutil.strcmp(O3404EntPedCum, A3404EntPedCum) == 0 ) )
         {
            A3404EntPedCum = A14041EntCump ;
            httpContext.ajax_rsp_assign_attri("", false, "A3404EntPedCum", A3404EntPedCum);
         }
         else
         {
            if ( isUpd( )  && ! (0==A658PedCod) && ( GXutil.strcmp(O3404EntPedCum, A3404EntPedCum) == 0 ) )
            {
               A3404EntPedCum = A14041EntCump ;
               httpContext.ajax_rsp_assign_attri("", false, "A3404EntPedCum", A3404EntPedCum);
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
         else
         {
            if ( isIns( )  && (0==A658PedCod) )
            {
               GXt_decimal12 = A417EntPre ;
               GXv_decimal13[0] = GXt_decimal12 ;
               new app.comprasquimicos.precioproveedor(remoteHandle, context).execute( A396EmprCod, A719PrdNum, A6156EntPrvNum, GXv_decimal13) ;
               entradaproductoalmacen_trn_impl.this.GXt_decimal12 = GXv_decimal13[0] ;
               A417EntPre = GXt_decimal12 ;
               httpContext.ajax_rsp_assign_attri("", false, "A417EntPre", GXutil.ltrimstr( A417EntPre, 14, 5));
            }
         }
      }
      if ( ( AV39NoUpd == 0 ) && ( isIns( )  || isUpd( )  ) )
      {
         A724PrdPreAct = A417EntPre ;
         httpContext.ajax_rsp_assign_attri("", false, "A724PrdPreAct", GXutil.ltrimstr( A724PrdPreAct, 14, 5));
      }
      if ( ( isIns( )  || isUpd( )  ) && ( AV39NoUpd == 0 ) )
      {
         A725PrdPreAnt = O724PrdPreAct ;
         httpContext.ajax_rsp_assign_attri("", false, "A725PrdPreAnt", GXutil.ltrimstr( A725PrdPreAnt, 14, 5));
      }
      AV30OldEntPre = O417EntPre ;
      httpContext.ajax_rsp_assign_attri("", false, "AV30OldEntPre", GXutil.ltrimstr( AV30OldEntPre, 14, 5));
      AV27PrecAnt = O417EntPre ;
      httpContext.ajax_rsp_assign_attri("", false, "AV27PrecAnt", GXutil.ltrimstr( AV27PrecAnt, 14, 5));
      if ( isIns( )  )
      {
         A750PrdValStk = O750PrdValStk.add(GXutil.roundDecimal( A417EntPre.multiply(A418EntUniEnt), 2)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A750PrdValStk", GXutil.ltrimstr( A750PrdValStk, 11, 2));
      }
      else
      {
         if ( isUpd( )  )
         {
            A750PrdValStk = O750PrdValStk.add((GXutil.roundDecimal( A417EntPre.multiply(A418EntUniEnt), 2).subtract(GXutil.roundDecimal( AV30OldEntPre.multiply(AV32OldEntUni), 2)))) ;
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
      if ( ( A704PrdExiAlm.doubleValue() != 0 ) && ( AV40Consumos == 1 ) && ( A750PrdValStk.doubleValue() > 0 ) )
      {
         A726PrdPreMed = GXutil.roundDecimal( A750PrdValStk.divide(A704PrdExiAlm, 18, java.math.RoundingMode.DOWN), 3) ;
         httpContext.ajax_rsp_assign_attri("", false, "A726PrdPreMed", GXutil.ltrimstr( A726PrdPreMed, 14, 5));
      }
      else
      {
         if ( ( A704PrdExiAlm.doubleValue() == 0 ) && ( AV40Consumos == 1 ) && ( A750PrdValStk.doubleValue() == 0 ) )
         {
            A726PrdPreMed = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A726PrdPreMed", GXutil.ltrimstr( A726PrdPreMed, 14, 5));
         }
         else
         {
            if ( ( ( A704PrdExiAlm.doubleValue() != 0 ) || ( A705PrdExiCC.doubleValue() != 0 ) ) && ( AV40Consumos == 0 ) )
            {
               A726PrdPreMed = GXutil.roundDecimal( A750PrdValStk.divide((A704PrdExiAlm.add(A705PrdExiCC)), 18, java.math.RoundingMode.DOWN), 3) ;
               httpContext.ajax_rsp_assign_attri("", false, "A726PrdPreMed", GXutil.ltrimstr( A726PrdPreMed, 14, 5));
            }
            else
            {
               if ( ( A704PrdExiAlm.doubleValue() == 0 ) && ( A705PrdExiCC.doubleValue() == 0 ) && ( AV40Consumos == 0 ) )
               {
                  A726PrdPreMed = DecimalUtil.doubleToDec(0) ;
                  httpContext.ajax_rsp_assign_attri("", false, "A726PrdPreMed", GXutil.ltrimstr( A726PrdPreMed, 14, 5));
               }
            }
         }
      }
   }

   public void checkExtendedTable1T642( )
   {
      nIsDirty_42 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal( ) ;
      AV22Year = (short)(GXutil.year( A415EntFecEnt)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV22Year", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV22Year), 4, 0));
      AV28Fecha = localUtil.ymdtod( AV22Year, 12, 1) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV28Fecha", localUtil.format(AV28Fecha, "99/99/99"));
      AV23Mes = (byte)(GXutil.month( A415EntFecEnt)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV23Mes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV23Mes), 2, 0));
      AV34oldEntFecent = O415EntFecEnt ;
      httpContext.ajax_rsp_assign_attri("", false, "AV34oldEntFecent", localUtil.format(AV34oldEntFecent, "99/99/99"));
      AV20FecAnt = O415EntFecEnt ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20FecAnt", localUtil.format(AV20FecAnt, "99/99/99"));
      AV25AnyAnt = (short)(GXutil.year( O415EntFecEnt)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV25AnyAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV25AnyAnt), 4, 0));
      AV26MesAnt = (byte)(GXutil.month( O415EntFecEnt)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV26MesAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV26MesAnt), 2, 0));
      AV29DiasFin = (short)(GXutil.ddiff(GXutil.eomdate( AV28Fecha),A415EntFecEnt)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV29DiasFin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29DiasFin), 3, 0));
      if ( true /* Level */ && true /* After */ && GXutil.resetTime(A415EntFecEnt).after( GXutil.resetTime( Gx_date )) && isIns( )  )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "ERROR.Fecha Entrada mayor a la Fecha del Dia", ""), 1, "ENTFECENT");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEntFecEnt_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( true /* After */ && ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A14040PrdUltMovF)) && GXutil.resetTime(A14040PrdUltMovF).after( GXutil.resetTime( A415EntFecEnt )) && ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A415EntFecEnt)) && ( isIns( )  || isUpd( )  ) && ( AV41FlagFecCcs == 0 ) )
      {
         httpContext.GX_msglist.addItem(AV15msg_ctrl_fecha, 1, "ENTFECENT");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEntFecEnt_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( true /* Level */ && true /* After */ && ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A14040PrdUltMovF)) && GXutil.resetTime(A14040PrdUltMovF).after( GXutil.resetTime( A415EntFecEnt )) && ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A415EntFecEnt)) && ( isIns( )  || isUpd( )  ) && ( AV41FlagFecCcs == 1 ) )
      {
         httpContext.GX_msglist.addItem(AV15msg_ctrl_fecha, 0, "ENTFECENT");
      }
      if ( true /* After */ )
      {
         GXt_char1 = AV18PrdNomX ;
         GXv_char4[0] = A396EmprCod ;
         GXv_int8[0] = A6156EntPrvNum ;
         GXv_char3[0] = GXt_char1 ;
         new app.pctrprv(remoteHandle, context).execute( GXv_char4, GXv_int8, GXv_char3) ;
         entradaproductoalmacen_trn_impl.this.A396EmprCod = GXv_char4[0] ;
         entradaproductoalmacen_trn_impl.this.A6156EntPrvNum = GXv_int8[0] ;
         entradaproductoalmacen_trn_impl.this.GXt_char1 = GXv_char3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A6156EntPrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6156EntPrvNum), 6, 0));
         AV18PrdNomX = GXt_char1 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV18PrdNomX", AV18PrdNomX);
      }
      if ( ( GXutil.strcmp(GXutil.trim( AV18PrdNomX), httpContext.getMessage( "Inexistente", "")) == 0 ) && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "No existe Proveedor¡", ""), 1, "ENTPRVNUM");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEntPrvNum_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ( A6156EntPrvNum == 0 ) && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Proveedor con codigo vacio¡", ""), 1, "ENTPRVNUM");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEntPrvNum_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      AV32OldEntUni = O418EntUniEnt ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32OldEntUni", GXutil.ltrimstr( AV32OldEntUni, 9, 2));
      AV21UniOld = O418EntUniEnt ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21UniOld", GXutil.ltrimstr( AV21UniOld, 9, 2));
      if ( isIns( )  )
      {
         nIsDirty_42 = (short)(1) ;
         A419EntUniRem = O419EntUniRem.add(A418EntUniEnt) ;
         httpContext.ajax_rsp_assign_attri("", false, "A419EntUniRem", GXutil.ltrimstr( A419EntUniRem, 11, 4));
      }
      else
      {
         if ( isUpd( )  )
         {
            nIsDirty_42 = (short)(1) ;
            A419EntUniRem = (O419EntUniRem.add(A418EntUniEnt).subtract(O418EntUniEnt)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A419EntUniRem", GXutil.ltrimstr( A419EntUniRem, 11, 4));
         }
         else
         {
            if ( isDlt( )  )
            {
               nIsDirty_42 = (short)(1) ;
               A419EntUniRem = (O419EntUniRem.subtract(A418EntUniEnt)) ;
               httpContext.ajax_rsp_assign_attri("", false, "A419EntUniRem", GXutil.ltrimstr( A419EntUniRem, 11, 4));
            }
         }
      }
      if ( (0==A658PedCod) )
      {
         edtEntPedCum_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtEntPedCum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEntPedCum_Enabled), 5, 0), true);
      }
      else
      {
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
      if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, A418EntUniEnt)==0) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Debe entrar unidades", ""), 1, "ENTUNIENT");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEntUniEnt_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      AV35oldlote = O5686EntLotN ;
      httpContext.ajax_rsp_assign_attri("", false, "AV35oldlote", AV35oldlote);
      AV33OldRemanente = O419EntUniRem ;
      httpContext.ajax_rsp_assign_attri("", false, "AV33OldRemanente", GXutil.ltrimstr( AV33OldRemanente, 11, 4));
      if ( isIns( )  && (0==A12716EntFabId) && ( Gx_BScreen == 0 ) )
      {
         nIsDirty_42 = (short)(1) ;
         A12716EntFabId = A6156EntPrvNum ;
         httpContext.ajax_rsp_assign_attri("", false, "A12716EntFabId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12716EntFabId), 6, 0));
      }
      /* Using cursor T01T67 */
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
      A661PedFec = T01T67_A661PedFec[0] ;
      A667PedSit = T01T67_A667PedSit[0] ;
      A666PedPri = T01T67_A666PedPri[0] ;
      A12580PedAlmc = T01T67_A12580PedAlmc[0] ;
      pr_default.close(5);
      nIsDirty_42 = (short)(1) ;
      A664PedNumLin = (short)(getPedNumLin0( A396EmprCod, A658PedCod)) ;
      httpContext.ajax_rsp_assign_attri("", false, "A664PedNumLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A664PedNumLin), 3, 0));
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
      AV31OldExiAlm = O704PrdExiAlm ;
      httpContext.ajax_rsp_assign_attri("", false, "AV31OldExiAlm", GXutil.ltrimstr( AV31OldExiAlm, 12, 4));
      if ( ( isIns( )  || isUpd( )  ) && ( AV39NoUpd == 0 ) )
      {
         nIsDirty_42 = (short)(1) ;
         A713PrdFulEnt = A415EntFecEnt ;
         httpContext.ajax_rsp_assign_attri("", false, "A713PrdFulEnt", localUtil.format(A713PrdFulEnt, "99/99/99"));
      }
      if ( ( isIns( )  || isUpd( )  ) && ( AV39NoUpd == 0 ) )
      {
         nIsDirty_42 = (short)(1) ;
         A709PrdFecPre = A415EntFecEnt ;
         httpContext.ajax_rsp_assign_attri("", false, "A709PrdFecPre", localUtil.format(A709PrdFecPre, "99/99/99"));
      }
      if ( ( A684PrdCanPen.doubleValue() < 0 ) && ! (0==A658PedCod) )
      {
         nIsDirty_42 = (short)(1) ;
         A684PrdCanPen = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A684PrdCanPen", GXutil.ltrimstr( A684PrdCanPen, 12, 4));
      }
      if ( ( A684PrdCanPen.doubleValue() < 0 ) && ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A418EntUniEnt)==0) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "¡ATENCION! Cantidad Entregada superior a la Pendiente", ""), 0, "ENTUNIENT");
      }
      if ( true )
      {
         AV24PedPri = GXutil.str( A800PrvPri, 1, 0) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV24PedPri", AV24PedPri);
      }
      else
      {
         if ( true /* Level */ && ! (0==A658PedCod) )
         {
            AV24PedPri = A666PedPri ;
            httpContext.ajax_rsp_assign_attri("", false, "AV24PedPri", AV24PedPri);
         }
      }
      AV15msg_ctrl_fecha = httpContext.getMessage( httpContext.getMessage( "Atencion.Ultimo Mov Fecha ", ""), "") + GXutil.trim( localUtil.dtoc( A14040PrdUltMovF, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")) + httpContext.getMessage( httpContext.getMessage( " superior a Fecha Mov ", ""), "") + GXutil.trim( localUtil.dtoc( A415EntFecEnt, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15msg_ctrl_fecha", AV15msg_ctrl_fecha);
      /* Using cursor T01T69 */
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
      A657PedCanEnt = T01T69_A657PedCanEnt[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A657PedCanEnt", GXutil.ltrimstr( A657PedCanEnt, 9, 2));
      A663PedFulEnt = T01T69_A663PedFulEnt[0] ;
      A665PedPre = T01T69_A665PedPre[0] ;
      A669PedUni = T01T69_A669PedUni[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A669PedUni", GXutil.ltrimstr( A669PedUni, 9, 2));
      A659PedCum = T01T69_A659PedCum[0] ;
      A660PedDto = T01T69_A660PedDto[0] ;
      nIsDirty_42 = (short)(1) ;
      O657PedCanEnt = A657PedCanEnt ;
      httpContext.ajax_rsp_assign_attri("", false, "A657PedCanEnt", GXutil.ltrimstr( A657PedCanEnt, 9, 2));
      pr_default.close(7);
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
         httpContext.ajax_rsp_assign_attri("", false, "A14041EntCump", A14041EntCump);
      }
      else
      {
         if ( ( ( DecimalUtil.compareTo(A657PedCanEnt, A669PedUni) > 0 ) ) && ! (0==A658PedCod) )
         {
            nIsDirty_42 = (short)(1) ;
            A14041EntCump = "S" ;
            httpContext.ajax_rsp_assign_attri("", false, "A14041EntCump", A14041EntCump);
         }
         else
         {
            if ( ( DecimalUtil.compareTo(A657PedCanEnt, A669PedUni) < 0 ) && ! (0==A658PedCod) )
            {
               nIsDirty_42 = (short)(1) ;
               A14041EntCump = "N" ;
               httpContext.ajax_rsp_assign_attri("", false, "A14041EntCump", A14041EntCump);
            }
            else
            {
               if ( (0==A658PedCod) )
               {
                  nIsDirty_42 = (short)(1) ;
                  A14041EntCump = "S" ;
                  httpContext.ajax_rsp_assign_attri("", false, "A14041EntCump", A14041EntCump);
               }
               else
               {
                  nIsDirty_42 = (short)(1) ;
                  A14041EntCump = "" ;
                  httpContext.ajax_rsp_assign_attri("", false, "A14041EntCump", A14041EntCump);
               }
            }
         }
      }
      if ( isIns( )  && (GXutil.strcmp("", A3404EntPedCum)==0) && ( Gx_BScreen == 0 ) )
      {
         nIsDirty_42 = (short)(1) ;
         A3404EntPedCum = httpContext.getMessage( httpContext.getMessage( "N", ""), "") ;
         httpContext.ajax_rsp_assign_attri("", false, "A3404EntPedCum", A3404EntPedCum);
      }
      else
      {
         if ( isIns( )  && ! (0==A658PedCod) && ( GXutil.strcmp(O3404EntPedCum, A3404EntPedCum) == 0 ) )
         {
            nIsDirty_42 = (short)(1) ;
            A3404EntPedCum = A14041EntCump ;
            httpContext.ajax_rsp_assign_attri("", false, "A3404EntPedCum", A3404EntPedCum);
         }
         else
         {
            if ( isUpd( )  && ! (0==A658PedCod) && ( GXutil.strcmp(O3404EntPedCum, A3404EntPedCum) == 0 ) )
            {
               nIsDirty_42 = (short)(1) ;
               A3404EntPedCum = A14041EntCump ;
               httpContext.ajax_rsp_assign_attri("", false, "A3404EntPedCum", A3404EntPedCum);
            }
         }
      }
      if ( ( DecimalUtil.compareTo(A657PedCanEnt, A669PedUni) > 0 ) && ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A657PedCanEnt)==0) && ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A669PedUni)==0) && ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A418EntUniEnt)==0) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "¡ATENCION! Cantidad entregada ", "")+GXutil.trim( GXutil.str( A657PedCanEnt, 9, 2))+httpContext.getMessage( " superior a la pedida ", "")+GXutil.trim( GXutil.str( A669PedUni, 9, 2)), 0, "ENTUNIENT");
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
         else
         {
            if ( isIns( )  && (0==A658PedCod) )
            {
               nIsDirty_42 = (short)(1) ;
               GXt_decimal12 = A417EntPre ;
               GXv_decimal13[0] = GXt_decimal12 ;
               new app.comprasquimicos.precioproveedor(remoteHandle, context).execute( A396EmprCod, A719PrdNum, A6156EntPrvNum, GXv_decimal13) ;
               entradaproductoalmacen_trn_impl.this.GXt_decimal12 = GXv_decimal13[0] ;
               A417EntPre = GXt_decimal12 ;
               httpContext.ajax_rsp_assign_attri("", false, "A417EntPre", GXutil.ltrimstr( A417EntPre, 14, 5));
            }
         }
      }
      if ( ( AV39NoUpd == 0 ) && ( isIns( )  || isUpd( )  ) )
      {
         nIsDirty_42 = (short)(1) ;
         A724PrdPreAct = A417EntPre ;
         httpContext.ajax_rsp_assign_attri("", false, "A724PrdPreAct", GXutil.ltrimstr( A724PrdPreAct, 14, 5));
      }
      if ( ( isIns( )  || isUpd( )  ) && ( AV39NoUpd == 0 ) )
      {
         nIsDirty_42 = (short)(1) ;
         A725PrdPreAnt = O724PrdPreAct ;
         httpContext.ajax_rsp_assign_attri("", false, "A725PrdPreAnt", GXutil.ltrimstr( A725PrdPreAnt, 14, 5));
      }
      if ( ! ( ( GXutil.strcmp(A3404EntPedCum, "S") == 0 ) || ( GXutil.strcmp(A3404EntPedCum, "N") == 0 ) ) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Cerrar?", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, "ENTPEDCUM");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEntPedCum_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      AV30OldEntPre = O417EntPre ;
      httpContext.ajax_rsp_assign_attri("", false, "AV30OldEntPre", GXutil.ltrimstr( AV30OldEntPre, 14, 5));
      AV27PrecAnt = O417EntPre ;
      httpContext.ajax_rsp_assign_attri("", false, "AV27PrecAnt", GXutil.ltrimstr( AV27PrecAnt, 14, 5));
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
            A750PrdValStk = O750PrdValStk.add((GXutil.roundDecimal( A417EntPre.multiply(A418EntUniEnt), 2).subtract(GXutil.roundDecimal( AV30OldEntPre.multiply(AV32OldEntUni), 2)))) ;
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
      if ( true /* Level */ && true /* After */ && (DecimalUtil.compareTo(DecimalUtil.ZERO, A417EntPre)==0) && (0==AV16FlagPre) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "ERROR.Precio con valor CERO", ""), 1, "ENTPRE");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEntPre_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( true /* Level */ && true /* After */ && (DecimalUtil.compareTo(DecimalUtil.ZERO, A417EntPre)==0) && ( AV16FlagPre == 1 ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "MENSAJE.Precio con valor CERO", ""), 0, "ENTPRE");
      }
      if ( ( A704PrdExiAlm.doubleValue() != 0 ) && ( AV40Consumos == 1 ) && ( A750PrdValStk.doubleValue() > 0 ) )
      {
         nIsDirty_42 = (short)(1) ;
         A726PrdPreMed = GXutil.roundDecimal( A750PrdValStk.divide(A704PrdExiAlm, 18, java.math.RoundingMode.DOWN), 3) ;
         httpContext.ajax_rsp_assign_attri("", false, "A726PrdPreMed", GXutil.ltrimstr( A726PrdPreMed, 14, 5));
      }
      else
      {
         if ( ( A704PrdExiAlm.doubleValue() == 0 ) && ( AV40Consumos == 1 ) && ( A750PrdValStk.doubleValue() == 0 ) )
         {
            nIsDirty_42 = (short)(1) ;
            A726PrdPreMed = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A726PrdPreMed", GXutil.ltrimstr( A726PrdPreMed, 14, 5));
         }
         else
         {
            if ( ( ( A704PrdExiAlm.doubleValue() != 0 ) || ( A705PrdExiCC.doubleValue() != 0 ) ) && ( AV40Consumos == 0 ) )
            {
               nIsDirty_42 = (short)(1) ;
               A726PrdPreMed = GXutil.roundDecimal( A750PrdValStk.divide((A704PrdExiAlm.add(A705PrdExiCC)), 18, java.math.RoundingMode.DOWN), 3) ;
               httpContext.ajax_rsp_assign_attri("", false, "A726PrdPreMed", GXutil.ltrimstr( A726PrdPreMed, 14, 5));
            }
            else
            {
               if ( ( A704PrdExiAlm.doubleValue() == 0 ) && ( A705PrdExiCC.doubleValue() == 0 ) && ( AV40Consumos == 0 ) )
               {
                  nIsDirty_42 = (short)(1) ;
                  A726PrdPreMed = DecimalUtil.doubleToDec(0) ;
                  httpContext.ajax_rsp_assign_attri("", false, "A726PrdPreMed", GXutil.ltrimstr( A726PrdPreMed, 14, 5));
               }
            }
         }
      }
   }

   public void closeExtendedTableCursors1T642( )
   {
      pr_default.close(5);
      pr_default.close(6);
   }

   public void enableDisable( )
   {
   }

   public void gxload_116( String A396EmprCod ,
                           int A658PedCod )
   {
      /* Using cursor T01T615 */
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
      A661PedFec = T01T615_A661PedFec[0] ;
      A667PedSit = T01T615_A667PedSit[0] ;
      A666PedPri = T01T615_A666PedPri[0] ;
      A12580PedAlmc = T01T615_A12580PedAlmc[0] ;
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

   public void gxload_117( String A396EmprCod ,
                           int A658PedCod ,
                           String A719PrdNum )
   {
      /* Using cursor T01T69 */
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
      A657PedCanEnt = T01T69_A657PedCanEnt[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A657PedCanEnt", GXutil.ltrimstr( A657PedCanEnt, 9, 2));
      A663PedFulEnt = T01T69_A663PedFulEnt[0] ;
      A665PedPre = T01T69_A665PedPre[0] ;
      A669PedUni = T01T69_A669PedUni[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A669PedUni", GXutil.ltrimstr( A669PedUni, 9, 2));
      A659PedCum = T01T69_A659PedCum[0] ;
      A660PedDto = T01T69_A660PedDto[0] ;
      O657PedCanEnt = A657PedCanEnt ;
      httpContext.ajax_rsp_assign_attri("", false, "A657PedCanEnt", GXutil.ltrimstr( A657PedCanEnt, 9, 2));
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A657PedCanEnt, (byte)(9), (byte)(2), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( localUtil.format(A663PedFulEnt, "99/99/99"))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A665PedPre, (byte)(14), (byte)(5), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A669PedUni, (byte)(9), (byte)(2), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A659PedCum))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A660PedDto, (byte)(5), (byte)(2), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(7) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(7);
   }

   public void getKey1T642( )
   {
      /* Using cursor T01T616 */
      pr_default.execute(12, new Object[] {A396EmprCod, A719PrdNum, Short.valueOf(A597LinEnt)});
      if ( (pr_default.getStatus(12) != 101) )
      {
         RcdFound42 = (short)(1) ;
      }
      else
      {
         RcdFound42 = (short)(0) ;
      }
      pr_default.close(12);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01T63 */
      pr_default.execute(1, new Object[] {A396EmprCod, A719PrdNum, Short.valueOf(A597LinEnt)});
      if ( (pr_default.getStatus(1) != 101) && ( T01T63_A411EntCon[0] == 0 ) )
      {
         zm1T642( 113) ;
         RcdFound42 = (short)(1) ;
         A597LinEnt = T01T63_A597LinEnt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A597LinEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A597LinEnt), 4, 0));
         A411EntCon = T01T63_A411EntCon[0] ;
         A419EntUniRem = T01T63_A419EntUniRem[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A419EntUniRem", GXutil.ltrimstr( A419EntUniRem, 11, 4));
         A417EntPre = T01T63_A417EntPre[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A417EntPre", GXutil.ltrimstr( A417EntPre, 14, 5));
         A3404EntPedCum = T01T63_A3404EntPedCum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3404EntPedCum", A3404EntPedCum);
         A415EntFecEnt = T01T63_A415EntFecEnt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A415EntFecEnt", localUtil.format(A415EntFecEnt, "99/99/99"));
         A11Albaran = T01T63_A11Albaran[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11Albaran", A11Albaran);
         A12857EntNAlbar = T01T63_A12857EntNAlbar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12857EntNAlbar", A12857EntNAlbar);
         A6156EntPrvNum = T01T63_A6156EntPrvNum[0] ;
         n6156EntPrvNum = T01T63_n6156EntPrvNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6156EntPrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6156EntPrvNum), 6, 0));
         A418EntUniEnt = T01T63_A418EntUniEnt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A418EntUniEnt", GXutil.ltrimstr( A418EntUniEnt, 9, 2));
         A416EntNumCon = T01T63_A416EntNumCon[0] ;
         A5686EntLotN = T01T63_A5686EntLotN[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5686EntLotN", A5686EntLotN);
         A5685EntFVal = T01T63_A5685EntFVal[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5685EntFVal", localUtil.format(A5685EntFVal, "99/99/99"));
         A414EntEti = T01T63_A414EntEti[0] ;
         A413EntConIni = T01T63_A413EntConIni[0] ;
         A412EntConFin = T01T63_A412EntConFin[0] ;
         A5691EntBnc = T01T63_A5691EntBnc[0] ;
         A7695EntCC = T01T63_A7695EntCC[0] ;
         A7696EntCCoCod = T01T63_A7696EntCCoCod[0] ;
         A10782EntUniAlb = T01T63_A10782EntUniAlb[0] ;
         A10783EntObs = T01T63_A10783EntObs[0] ;
         A10187EntRemNro = T01T63_A10187EntRemNro[0] ;
         A10186EntRemFch = T01T63_A10186EntRemFch[0] ;
         A10185EntRemSuc = T01T63_A10185EntRemSuc[0] ;
         A10184EntRemTpo = T01T63_A10184EntRemTpo[0] ;
         A12716EntFabId = T01T63_A12716EntFabId[0] ;
         A13235EntLoteID = T01T63_A13235EntLoteID[0] ;
         A13456EntUbicaci = T01T63_A13456EntUbicaci[0] ;
         A5690EntHfCon = T01T63_A5690EntHfCon[0] ;
         A5689EntFfCon = T01T63_A5689EntFfCon[0] ;
         A5688EntHiCon = T01T63_A5688EntHiCon[0] ;
         A5687EntFiCon = T01T63_A5687EntFiCon[0] ;
         A14035EntNEmb = T01T63_A14035EntNEmb[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14035EntNEmb", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14035EntNEmb), 2, 0));
         A396EmprCod = T01T63_A396EmprCod[0] ;
         A719PrdNum = T01T63_A719PrdNum[0] ;
         A658PedCod = T01T63_A658PedCod[0] ;
         n658PedCod = T01T63_n658PedCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A658PedCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A658PedCod), 8, 0));
         O3404EntPedCum = A3404EntPedCum ;
         httpContext.ajax_rsp_assign_attri("", false, "A3404EntPedCum", A3404EntPedCum);
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
         load1T642( ) ;
         if ( AnyError == 1 )
         {
            RcdFound42 = (short)(0) ;
            initializeNonKey1T642( ) ;
         }
         Gx_mode = sMode42 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound42 = (short)(0) ;
         initializeNonKey1T642( ) ;
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
      getKey1T642( ) ;
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
      /* Using cursor T01T617 */
      pr_default.execute(13, new Object[] {A396EmprCod, A396EmprCod, A719PrdNum, A719PrdNum, A396EmprCod, Short.valueOf(A597LinEnt)});
      if ( (pr_default.getStatus(13) != 101) )
      {
         while ( (pr_default.getStatus(13) != 101) && ( ( GXutil.strcmp(T01T617_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01T617_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01T617_A719PrdNum[0], A719PrdNum) < 0 ) || ( GXutil.strcmp(T01T617_A719PrdNum[0], A719PrdNum) == 0 ) && ( GXutil.strcmp(T01T617_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01T617_A597LinEnt[0] < A597LinEnt ) ) && ( T01T617_A411EntCon[0] == 0 ) )
         {
            pr_default.readNext(13);
         }
         if ( (pr_default.getStatus(13) != 101) && ( ( GXutil.strcmp(T01T617_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01T617_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01T617_A719PrdNum[0], A719PrdNum) > 0 ) || ( GXutil.strcmp(T01T617_A719PrdNum[0], A719PrdNum) == 0 ) && ( GXutil.strcmp(T01T617_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01T617_A597LinEnt[0] > A597LinEnt ) ) && ( T01T617_A411EntCon[0] == 0 ) )
         {
            A396EmprCod = T01T617_A396EmprCod[0] ;
            A719PrdNum = T01T617_A719PrdNum[0] ;
            A597LinEnt = T01T617_A597LinEnt[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A597LinEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A597LinEnt), 4, 0));
            A411EntCon = T01T617_A411EntCon[0] ;
            RcdFound42 = (short)(1) ;
         }
      }
      pr_default.close(13);
   }

   public void move_previous( )
   {
      RcdFound42 = (short)(0) ;
      /* Using cursor T01T618 */
      pr_default.execute(14, new Object[] {A396EmprCod, A396EmprCod, A719PrdNum, A719PrdNum, A396EmprCod, Short.valueOf(A597LinEnt)});
      if ( (pr_default.getStatus(14) != 101) )
      {
         while ( (pr_default.getStatus(14) != 101) && ( ( GXutil.strcmp(T01T618_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01T618_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01T618_A719PrdNum[0], A719PrdNum) > 0 ) || ( GXutil.strcmp(T01T618_A719PrdNum[0], A719PrdNum) == 0 ) && ( GXutil.strcmp(T01T618_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01T618_A597LinEnt[0] > A597LinEnt ) ) && ( T01T618_A411EntCon[0] == 0 ) )
         {
            pr_default.readNext(14);
         }
         if ( (pr_default.getStatus(14) != 101) && ( ( GXutil.strcmp(T01T618_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01T618_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01T618_A719PrdNum[0], A719PrdNum) < 0 ) || ( GXutil.strcmp(T01T618_A719PrdNum[0], A719PrdNum) == 0 ) && ( GXutil.strcmp(T01T618_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01T618_A597LinEnt[0] < A597LinEnt ) ) && ( T01T618_A411EntCon[0] == 0 ) )
         {
            A396EmprCod = T01T618_A396EmprCod[0] ;
            A719PrdNum = T01T618_A719PrdNum[0] ;
            A597LinEnt = T01T618_A597LinEnt[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A597LinEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A597LinEnt), 4, 0));
            A411EntCon = T01T618_A411EntCon[0] ;
            RcdFound42 = (short)(1) ;
         }
      }
      pr_default.close(14);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1T642( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtLinEnt_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1T642( ) ;
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
               A396EmprCod = Z396EmprCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
               A719PrdNum = Z719PrdNum ;
               httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
               A597LinEnt = Z597LinEnt ;
               httpContext.ajax_rsp_assign_attri("", false, "A597LinEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A597LinEnt), 4, 0));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "LINENT");
               AnyError = (short)(1) ;
               GX_FocusControl = edtLinEnt_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtLinEnt_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               /* Update record */
               update1T642( ) ;
               GX_FocusControl = edtLinEnt_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A719PrdNum, Z719PrdNum) != 0 ) || ( A597LinEnt != Z597LinEnt ) )
            {
               /* Insert record */
               GX_FocusControl = edtLinEnt_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1T642( ) ;
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
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "LINENT");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtLinEnt_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               else
               {
                  /* Insert record */
                  GX_FocusControl = edtLinEnt_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1T642( ) ;
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
         A396EmprCod = Z396EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A719PrdNum = Z719PrdNum ;
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         A597LinEnt = Z597LinEnt ;
         httpContext.ajax_rsp_assign_attri("", false, "A597LinEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A597LinEnt), 4, 0));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "LINENT");
         AnyError = (short)(1) ;
         GX_FocusControl = edtLinEnt_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtLinEnt_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( AnyError != 0 )
      {
      }
   }

   public void checkOptimisticConcurrency1T642( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01T62 */
         pr_default.execute(0, new Object[] {A396EmprCod, A719PrdNum, Short.valueOf(A597LinEnt)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPENTALM"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( Z411EntCon != T01T62_A411EntCon[0] ) || ( DecimalUtil.compareTo(Z419EntUniRem, T01T62_A419EntUniRem[0]) != 0 ) || ( DecimalUtil.compareTo(Z417EntPre, T01T62_A417EntPre[0]) != 0 ) || ( GXutil.strcmp(Z3404EntPedCum, T01T62_A3404EntPedCum[0]) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(Z415EntFecEnt), GXutil.resetTime(T01T62_A415EntFecEnt[0])) ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z11Albaran, T01T62_A11Albaran[0]) != 0 ) || ( GXutil.strcmp(Z12857EntNAlbar, T01T62_A12857EntNAlbar[0]) != 0 ) || ( Z6156EntPrvNum != T01T62_A6156EntPrvNum[0] ) || ( DecimalUtil.compareTo(Z418EntUniEnt, T01T62_A418EntUniEnt[0]) != 0 ) || ( Z416EntNumCon != T01T62_A416EntNumCon[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z5686EntLotN, T01T62_A5686EntLotN[0]) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(Z5685EntFVal), GXutil.resetTime(T01T62_A5685EntFVal[0])) ) || ( Z414EntEti != T01T62_A414EntEti[0] ) || ( Z413EntConIni != T01T62_A413EntConIni[0] ) || ( Z412EntConFin != T01T62_A412EntConFin[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z5691EntBnc, T01T62_A5691EntBnc[0]) != 0 ) || ( GXutil.strcmp(Z7695EntCC, T01T62_A7695EntCC[0]) != 0 ) || ( Z7696EntCCoCod != T01T62_A7696EntCCoCod[0] ) || ( DecimalUtil.compareTo(Z10782EntUniAlb, T01T62_A10782EntUniAlb[0]) != 0 ) || ( GXutil.strcmp(Z10783EntObs, T01T62_A10783EntObs[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z10187EntRemNro, T01T62_A10187EntRemNro[0]) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(Z10186EntRemFch), GXutil.resetTime(T01T62_A10186EntRemFch[0])) ) || ( GXutil.strcmp(Z10185EntRemSuc, T01T62_A10185EntRemSuc[0]) != 0 ) || ( GXutil.strcmp(Z10184EntRemTpo, T01T62_A10184EntRemTpo[0]) != 0 ) || ( Z12716EntFabId != T01T62_A12716EntFabId[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z13235EntLoteID != T01T62_A13235EntLoteID[0] ) || ( GXutil.strcmp(Z13456EntUbicaci, T01T62_A13456EntUbicaci[0]) != 0 ) || !( GXutil.dateCompare(Z5690EntHfCon, T01T62_A5690EntHfCon[0]) ) || !( GXutil.dateCompare(GXutil.resetTime(Z5689EntFfCon), GXutil.resetTime(T01T62_A5689EntFfCon[0])) ) || !( GXutil.dateCompare(Z5688EntHiCon, T01T62_A5688EntHiCon[0]) ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || !( GXutil.dateCompare(GXutil.resetTime(Z5687EntFiCon), GXutil.resetTime(T01T62_A5687EntFiCon[0])) ) || ( Z14035EntNEmb != T01T62_A14035EntNEmb[0] ) || ( Z658PedCod != T01T62_A658PedCod[0] ) )
         {
            if ( Z411EntCon != T01T62_A411EntCon[0] )
            {
               GXutil.writeLogln("entradaproductoalmacen_trn:[seudo value changed for attri]"+"EntCon");
               GXutil.writeLogRaw("Old: ",Z411EntCon);
               GXutil.writeLogRaw("Current: ",T01T62_A411EntCon[0]);
            }
            if ( DecimalUtil.compareTo(Z419EntUniRem, T01T62_A419EntUniRem[0]) != 0 )
            {
               GXutil.writeLogln("entradaproductoalmacen_trn:[seudo value changed for attri]"+"EntUniRem");
               GXutil.writeLogRaw("Old: ",Z419EntUniRem);
               GXutil.writeLogRaw("Current: ",T01T62_A419EntUniRem[0]);
            }
            if ( DecimalUtil.compareTo(Z417EntPre, T01T62_A417EntPre[0]) != 0 )
            {
               GXutil.writeLogln("entradaproductoalmacen_trn:[seudo value changed for attri]"+"EntPre");
               GXutil.writeLogRaw("Old: ",Z417EntPre);
               GXutil.writeLogRaw("Current: ",T01T62_A417EntPre[0]);
            }
            if ( GXutil.strcmp(Z3404EntPedCum, T01T62_A3404EntPedCum[0]) != 0 )
            {
               GXutil.writeLogln("entradaproductoalmacen_trn:[seudo value changed for attri]"+"EntPedCum");
               GXutil.writeLogRaw("Old: ",Z3404EntPedCum);
               GXutil.writeLogRaw("Current: ",T01T62_A3404EntPedCum[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z415EntFecEnt), GXutil.resetTime(T01T62_A415EntFecEnt[0])) ) )
            {
               GXutil.writeLogln("entradaproductoalmacen_trn:[seudo value changed for attri]"+"EntFecEnt");
               GXutil.writeLogRaw("Old: ",Z415EntFecEnt);
               GXutil.writeLogRaw("Current: ",T01T62_A415EntFecEnt[0]);
            }
            if ( GXutil.strcmp(Z11Albaran, T01T62_A11Albaran[0]) != 0 )
            {
               GXutil.writeLogln("entradaproductoalmacen_trn:[seudo value changed for attri]"+"Albaran");
               GXutil.writeLogRaw("Old: ",Z11Albaran);
               GXutil.writeLogRaw("Current: ",T01T62_A11Albaran[0]);
            }
            if ( GXutil.strcmp(Z12857EntNAlbar, T01T62_A12857EntNAlbar[0]) != 0 )
            {
               GXutil.writeLogln("entradaproductoalmacen_trn:[seudo value changed for attri]"+"EntNAlbar");
               GXutil.writeLogRaw("Old: ",Z12857EntNAlbar);
               GXutil.writeLogRaw("Current: ",T01T62_A12857EntNAlbar[0]);
            }
            if ( Z6156EntPrvNum != T01T62_A6156EntPrvNum[0] )
            {
               GXutil.writeLogln("entradaproductoalmacen_trn:[seudo value changed for attri]"+"EntPrvNum");
               GXutil.writeLogRaw("Old: ",Z6156EntPrvNum);
               GXutil.writeLogRaw("Current: ",T01T62_A6156EntPrvNum[0]);
            }
            if ( DecimalUtil.compareTo(Z418EntUniEnt, T01T62_A418EntUniEnt[0]) != 0 )
            {
               GXutil.writeLogln("entradaproductoalmacen_trn:[seudo value changed for attri]"+"EntUniEnt");
               GXutil.writeLogRaw("Old: ",Z418EntUniEnt);
               GXutil.writeLogRaw("Current: ",T01T62_A418EntUniEnt[0]);
            }
            if ( Z416EntNumCon != T01T62_A416EntNumCon[0] )
            {
               GXutil.writeLogln("entradaproductoalmacen_trn:[seudo value changed for attri]"+"EntNumCon");
               GXutil.writeLogRaw("Old: ",Z416EntNumCon);
               GXutil.writeLogRaw("Current: ",T01T62_A416EntNumCon[0]);
            }
            if ( GXutil.strcmp(Z5686EntLotN, T01T62_A5686EntLotN[0]) != 0 )
            {
               GXutil.writeLogln("entradaproductoalmacen_trn:[seudo value changed for attri]"+"EntLotN");
               GXutil.writeLogRaw("Old: ",Z5686EntLotN);
               GXutil.writeLogRaw("Current: ",T01T62_A5686EntLotN[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z5685EntFVal), GXutil.resetTime(T01T62_A5685EntFVal[0])) ) )
            {
               GXutil.writeLogln("entradaproductoalmacen_trn:[seudo value changed for attri]"+"EntFVal");
               GXutil.writeLogRaw("Old: ",Z5685EntFVal);
               GXutil.writeLogRaw("Current: ",T01T62_A5685EntFVal[0]);
            }
            if ( Z414EntEti != T01T62_A414EntEti[0] )
            {
               GXutil.writeLogln("entradaproductoalmacen_trn:[seudo value changed for attri]"+"EntEti");
               GXutil.writeLogRaw("Old: ",Z414EntEti);
               GXutil.writeLogRaw("Current: ",T01T62_A414EntEti[0]);
            }
            if ( Z413EntConIni != T01T62_A413EntConIni[0] )
            {
               GXutil.writeLogln("entradaproductoalmacen_trn:[seudo value changed for attri]"+"EntConIni");
               GXutil.writeLogRaw("Old: ",Z413EntConIni);
               GXutil.writeLogRaw("Current: ",T01T62_A413EntConIni[0]);
            }
            if ( Z412EntConFin != T01T62_A412EntConFin[0] )
            {
               GXutil.writeLogln("entradaproductoalmacen_trn:[seudo value changed for attri]"+"EntConFin");
               GXutil.writeLogRaw("Old: ",Z412EntConFin);
               GXutil.writeLogRaw("Current: ",T01T62_A412EntConFin[0]);
            }
            if ( GXutil.strcmp(Z5691EntBnc, T01T62_A5691EntBnc[0]) != 0 )
            {
               GXutil.writeLogln("entradaproductoalmacen_trn:[seudo value changed for attri]"+"EntBnc");
               GXutil.writeLogRaw("Old: ",Z5691EntBnc);
               GXutil.writeLogRaw("Current: ",T01T62_A5691EntBnc[0]);
            }
            if ( GXutil.strcmp(Z7695EntCC, T01T62_A7695EntCC[0]) != 0 )
            {
               GXutil.writeLogln("entradaproductoalmacen_trn:[seudo value changed for attri]"+"EntCC");
               GXutil.writeLogRaw("Old: ",Z7695EntCC);
               GXutil.writeLogRaw("Current: ",T01T62_A7695EntCC[0]);
            }
            if ( Z7696EntCCoCod != T01T62_A7696EntCCoCod[0] )
            {
               GXutil.writeLogln("entradaproductoalmacen_trn:[seudo value changed for attri]"+"EntCCoCod");
               GXutil.writeLogRaw("Old: ",Z7696EntCCoCod);
               GXutil.writeLogRaw("Current: ",T01T62_A7696EntCCoCod[0]);
            }
            if ( DecimalUtil.compareTo(Z10782EntUniAlb, T01T62_A10782EntUniAlb[0]) != 0 )
            {
               GXutil.writeLogln("entradaproductoalmacen_trn:[seudo value changed for attri]"+"EntUniAlb");
               GXutil.writeLogRaw("Old: ",Z10782EntUniAlb);
               GXutil.writeLogRaw("Current: ",T01T62_A10782EntUniAlb[0]);
            }
            if ( GXutil.strcmp(Z10783EntObs, T01T62_A10783EntObs[0]) != 0 )
            {
               GXutil.writeLogln("entradaproductoalmacen_trn:[seudo value changed for attri]"+"EntObs");
               GXutil.writeLogRaw("Old: ",Z10783EntObs);
               GXutil.writeLogRaw("Current: ",T01T62_A10783EntObs[0]);
            }
            if ( GXutil.strcmp(Z10187EntRemNro, T01T62_A10187EntRemNro[0]) != 0 )
            {
               GXutil.writeLogln("entradaproductoalmacen_trn:[seudo value changed for attri]"+"EntRemNro");
               GXutil.writeLogRaw("Old: ",Z10187EntRemNro);
               GXutil.writeLogRaw("Current: ",T01T62_A10187EntRemNro[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z10186EntRemFch), GXutil.resetTime(T01T62_A10186EntRemFch[0])) ) )
            {
               GXutil.writeLogln("entradaproductoalmacen_trn:[seudo value changed for attri]"+"EntRemFch");
               GXutil.writeLogRaw("Old: ",Z10186EntRemFch);
               GXutil.writeLogRaw("Current: ",T01T62_A10186EntRemFch[0]);
            }
            if ( GXutil.strcmp(Z10185EntRemSuc, T01T62_A10185EntRemSuc[0]) != 0 )
            {
               GXutil.writeLogln("entradaproductoalmacen_trn:[seudo value changed for attri]"+"EntRemSuc");
               GXutil.writeLogRaw("Old: ",Z10185EntRemSuc);
               GXutil.writeLogRaw("Current: ",T01T62_A10185EntRemSuc[0]);
            }
            if ( GXutil.strcmp(Z10184EntRemTpo, T01T62_A10184EntRemTpo[0]) != 0 )
            {
               GXutil.writeLogln("entradaproductoalmacen_trn:[seudo value changed for attri]"+"EntRemTpo");
               GXutil.writeLogRaw("Old: ",Z10184EntRemTpo);
               GXutil.writeLogRaw("Current: ",T01T62_A10184EntRemTpo[0]);
            }
            if ( Z12716EntFabId != T01T62_A12716EntFabId[0] )
            {
               GXutil.writeLogln("entradaproductoalmacen_trn:[seudo value changed for attri]"+"EntFabId");
               GXutil.writeLogRaw("Old: ",Z12716EntFabId);
               GXutil.writeLogRaw("Current: ",T01T62_A12716EntFabId[0]);
            }
            if ( Z13235EntLoteID != T01T62_A13235EntLoteID[0] )
            {
               GXutil.writeLogln("entradaproductoalmacen_trn:[seudo value changed for attri]"+"EntLoteID");
               GXutil.writeLogRaw("Old: ",Z13235EntLoteID);
               GXutil.writeLogRaw("Current: ",T01T62_A13235EntLoteID[0]);
            }
            if ( GXutil.strcmp(Z13456EntUbicaci, T01T62_A13456EntUbicaci[0]) != 0 )
            {
               GXutil.writeLogln("entradaproductoalmacen_trn:[seudo value changed for attri]"+"EntUbicaci");
               GXutil.writeLogRaw("Old: ",Z13456EntUbicaci);
               GXutil.writeLogRaw("Current: ",T01T62_A13456EntUbicaci[0]);
            }
            if ( !( GXutil.dateCompare(Z5690EntHfCon, T01T62_A5690EntHfCon[0]) ) )
            {
               GXutil.writeLogln("entradaproductoalmacen_trn:[seudo value changed for attri]"+"EntHfCon");
               GXutil.writeLogRaw("Old: ",Z5690EntHfCon);
               GXutil.writeLogRaw("Current: ",T01T62_A5690EntHfCon[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z5689EntFfCon), GXutil.resetTime(T01T62_A5689EntFfCon[0])) ) )
            {
               GXutil.writeLogln("entradaproductoalmacen_trn:[seudo value changed for attri]"+"EntFfCon");
               GXutil.writeLogRaw("Old: ",Z5689EntFfCon);
               GXutil.writeLogRaw("Current: ",T01T62_A5689EntFfCon[0]);
            }
            if ( !( GXutil.dateCompare(Z5688EntHiCon, T01T62_A5688EntHiCon[0]) ) )
            {
               GXutil.writeLogln("entradaproductoalmacen_trn:[seudo value changed for attri]"+"EntHiCon");
               GXutil.writeLogRaw("Old: ",Z5688EntHiCon);
               GXutil.writeLogRaw("Current: ",T01T62_A5688EntHiCon[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z5687EntFiCon), GXutil.resetTime(T01T62_A5687EntFiCon[0])) ) )
            {
               GXutil.writeLogln("entradaproductoalmacen_trn:[seudo value changed for attri]"+"EntFiCon");
               GXutil.writeLogRaw("Old: ",Z5687EntFiCon);
               GXutil.writeLogRaw("Current: ",T01T62_A5687EntFiCon[0]);
            }
            if ( Z14035EntNEmb != T01T62_A14035EntNEmb[0] )
            {
               GXutil.writeLogln("entradaproductoalmacen_trn:[seudo value changed for attri]"+"EntNEmb");
               GXutil.writeLogRaw("Old: ",Z14035EntNEmb);
               GXutil.writeLogRaw("Current: ",T01T62_A14035EntNEmb[0]);
            }
            if ( Z658PedCod != T01T62_A658PedCod[0] )
            {
               GXutil.writeLogln("entradaproductoalmacen_trn:[seudo value changed for attri]"+"PedCod");
               GXutil.writeLogRaw("Old: ",Z658PedCod);
               GXutil.writeLogRaw("Current: ",T01T62_A658PedCod[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPENTALM"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
      /* Using cursor T01T619 */
      pr_default.execute(15, new Object[] {A396EmprCod, A719PrdNum});
      if ( (pr_default.getStatus(15) == 103) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPPRODUC"}), "RecordIsLocked", 1, "");
         AnyError = (short)(1) ;
         return  ;
      }
      if ( ! isIns( ) )
      {
         Gx_longc = false ;
         if ( false || ( DecimalUtil.compareTo(Z726PrdPreMed, T01T619_A726PrdPreMed[0]) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(Z713PrdFulEnt), GXutil.resetTime(T01T619_A713PrdFulEnt[0])) ) || !( GXutil.dateCompare(GXutil.resetTime(Z709PrdFecPre), GXutil.resetTime(T01T619_A709PrdFecPre[0])) ) || ( DecimalUtil.compareTo(Z725PrdPreAnt, T01T619_A725PrdPreAnt[0]) != 0 ) || ( DecimalUtil.compareTo(Z724PrdPreAct, T01T619_A724PrdPreAct[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( DecimalUtil.compareTo(Z684PrdCanPen, T01T619_A684PrdCanPen[0]) != 0 ) || ( GXutil.strcmp(Z718PrdNom, T01T619_A718PrdNom[0]) != 0 ) || ( GXutil.strcmp(Z698PrdDetPar, T01T619_A698PrdDetPar[0]) != 0 ) || ( DecimalUtil.compareTo(Z729PrdRotRea, T01T619_A729PrdRotRea[0]) != 0 ) || ( GXutil.strcmp(Z727PrdRec, T01T619_A727PrdRec[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( DecimalUtil.compareTo(Z5255PrdPreAc2, T01T619_A5255PrdPreAc2[0]) != 0 ) || ( DecimalUtil.compareTo(Z705PrdExiCC, T01T619_A705PrdExiCC[0]) != 0 ) || ( Z795PrvNum != T01T619_A795PrvNum[0] ) || ( Z856ValCod != T01T619_A856ValCod[0] ) )
         {
            if ( DecimalUtil.compareTo(Z726PrdPreMed, T01T619_A726PrdPreMed[0]) != 0 )
            {
               GXutil.writeLogln("entradaproductoalmacen_trn:[seudo value changed for attri]"+"PrdPreMed");
               GXutil.writeLogRaw("Old: ",Z726PrdPreMed);
               GXutil.writeLogRaw("Current: ",T01T619_A726PrdPreMed[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z713PrdFulEnt), GXutil.resetTime(T01T619_A713PrdFulEnt[0])) ) )
            {
               GXutil.writeLogln("entradaproductoalmacen_trn:[seudo value changed for attri]"+"PrdFulEnt");
               GXutil.writeLogRaw("Old: ",Z713PrdFulEnt);
               GXutil.writeLogRaw("Current: ",T01T619_A713PrdFulEnt[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z709PrdFecPre), GXutil.resetTime(T01T619_A709PrdFecPre[0])) ) )
            {
               GXutil.writeLogln("entradaproductoalmacen_trn:[seudo value changed for attri]"+"PrdFecPre");
               GXutil.writeLogRaw("Old: ",Z709PrdFecPre);
               GXutil.writeLogRaw("Current: ",T01T619_A709PrdFecPre[0]);
            }
            if ( DecimalUtil.compareTo(Z725PrdPreAnt, T01T619_A725PrdPreAnt[0]) != 0 )
            {
               GXutil.writeLogln("entradaproductoalmacen_trn:[seudo value changed for attri]"+"PrdPreAnt");
               GXutil.writeLogRaw("Old: ",Z725PrdPreAnt);
               GXutil.writeLogRaw("Current: ",T01T619_A725PrdPreAnt[0]);
            }
            if ( DecimalUtil.compareTo(Z724PrdPreAct, T01T619_A724PrdPreAct[0]) != 0 )
            {
               GXutil.writeLogln("entradaproductoalmacen_trn:[seudo value changed for attri]"+"PrdPreAct");
               GXutil.writeLogRaw("Old: ",Z724PrdPreAct);
               GXutil.writeLogRaw("Current: ",T01T619_A724PrdPreAct[0]);
            }
            if ( DecimalUtil.compareTo(Z684PrdCanPen, T01T619_A684PrdCanPen[0]) != 0 )
            {
               GXutil.writeLogln("entradaproductoalmacen_trn:[seudo value changed for attri]"+"PrdCanPen");
               GXutil.writeLogRaw("Old: ",Z684PrdCanPen);
               GXutil.writeLogRaw("Current: ",T01T619_A684PrdCanPen[0]);
            }
            if ( GXutil.strcmp(Z718PrdNom, T01T619_A718PrdNom[0]) != 0 )
            {
               GXutil.writeLogln("entradaproductoalmacen_trn:[seudo value changed for attri]"+"PrdNom");
               GXutil.writeLogRaw("Old: ",Z718PrdNom);
               GXutil.writeLogRaw("Current: ",T01T619_A718PrdNom[0]);
            }
            if ( GXutil.strcmp(Z698PrdDetPar, T01T619_A698PrdDetPar[0]) != 0 )
            {
               GXutil.writeLogln("entradaproductoalmacen_trn:[seudo value changed for attri]"+"PrdDetPar");
               GXutil.writeLogRaw("Old: ",Z698PrdDetPar);
               GXutil.writeLogRaw("Current: ",T01T619_A698PrdDetPar[0]);
            }
            if ( DecimalUtil.compareTo(Z729PrdRotRea, T01T619_A729PrdRotRea[0]) != 0 )
            {
               GXutil.writeLogln("entradaproductoalmacen_trn:[seudo value changed for attri]"+"PrdRotRea");
               GXutil.writeLogRaw("Old: ",Z729PrdRotRea);
               GXutil.writeLogRaw("Current: ",T01T619_A729PrdRotRea[0]);
            }
            if ( GXutil.strcmp(Z727PrdRec, T01T619_A727PrdRec[0]) != 0 )
            {
               GXutil.writeLogln("entradaproductoalmacen_trn:[seudo value changed for attri]"+"PrdRec");
               GXutil.writeLogRaw("Old: ",Z727PrdRec);
               GXutil.writeLogRaw("Current: ",T01T619_A727PrdRec[0]);
            }
            if ( DecimalUtil.compareTo(Z5255PrdPreAc2, T01T619_A5255PrdPreAc2[0]) != 0 )
            {
               GXutil.writeLogln("entradaproductoalmacen_trn:[seudo value changed for attri]"+"PrdPreAc2");
               GXutil.writeLogRaw("Old: ",Z5255PrdPreAc2);
               GXutil.writeLogRaw("Current: ",T01T619_A5255PrdPreAc2[0]);
            }
            if ( DecimalUtil.compareTo(Z705PrdExiCC, T01T619_A705PrdExiCC[0]) != 0 )
            {
               GXutil.writeLogln("entradaproductoalmacen_trn:[seudo value changed for attri]"+"PrdExiCC");
               GXutil.writeLogRaw("Old: ",Z705PrdExiCC);
               GXutil.writeLogRaw("Current: ",T01T619_A705PrdExiCC[0]);
            }
            if ( Z795PrvNum != T01T619_A795PrvNum[0] )
            {
               GXutil.writeLogln("entradaproductoalmacen_trn:[seudo value changed for attri]"+"PrvNum");
               GXutil.writeLogRaw("Old: ",Z795PrvNum);
               GXutil.writeLogRaw("Current: ",T01T619_A795PrvNum[0]);
            }
            if ( Z856ValCod != T01T619_A856ValCod[0] )
            {
               GXutil.writeLogln("entradaproductoalmacen_trn:[seudo value changed for attri]"+"ValCod");
               GXutil.writeLogRaw("Old: ",Z856ValCod);
               GXutil.writeLogRaw("Current: ",T01T619_A856ValCod[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPPRODUC"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
      /* Using cursor T01T620 */
      pr_default.execute(16, new Object[] {A396EmprCod, Boolean.valueOf(n658PedCod), Integer.valueOf(A658PedCod), A719PrdNum});
      if ( (pr_default.getStatus(16) == 103) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPLPEDID"}), "RecordIsLocked", 1, "");
         AnyError = (short)(1) ;
         return  ;
      }
      if ( ! isIns( ) )
      {
         if ( false || !( GXutil.dateCompare(GXutil.resetTime(Z663PedFulEnt), GXutil.resetTime(T01T620_A663PedFulEnt[0])) ) || ( DecimalUtil.compareTo(Z665PedPre, T01T620_A665PedPre[0]) != 0 ) || ( DecimalUtil.compareTo(Z669PedUni, T01T620_A669PedUni[0]) != 0 ) || ( GXutil.strcmp(Z659PedCum, T01T620_A659PedCum[0]) != 0 ) || ( DecimalUtil.compareTo(Z660PedDto, T01T620_A660PedDto[0]) != 0 ) )
         {
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z663PedFulEnt), GXutil.resetTime(T01T620_A663PedFulEnt[0])) ) )
            {
               GXutil.writeLogln("entradaproductoalmacen_trn:[seudo value changed for attri]"+"PedFulEnt");
               GXutil.writeLogRaw("Old: ",Z663PedFulEnt);
               GXutil.writeLogRaw("Current: ",T01T620_A663PedFulEnt[0]);
            }
            if ( DecimalUtil.compareTo(Z665PedPre, T01T620_A665PedPre[0]) != 0 )
            {
               GXutil.writeLogln("entradaproductoalmacen_trn:[seudo value changed for attri]"+"PedPre");
               GXutil.writeLogRaw("Old: ",Z665PedPre);
               GXutil.writeLogRaw("Current: ",T01T620_A665PedPre[0]);
            }
            if ( DecimalUtil.compareTo(Z669PedUni, T01T620_A669PedUni[0]) != 0 )
            {
               GXutil.writeLogln("entradaproductoalmacen_trn:[seudo value changed for attri]"+"PedUni");
               GXutil.writeLogRaw("Old: ",Z669PedUni);
               GXutil.writeLogRaw("Current: ",T01T620_A669PedUni[0]);
            }
            if ( GXutil.strcmp(Z659PedCum, T01T620_A659PedCum[0]) != 0 )
            {
               GXutil.writeLogln("entradaproductoalmacen_trn:[seudo value changed for attri]"+"PedCum");
               GXutil.writeLogRaw("Old: ",Z659PedCum);
               GXutil.writeLogRaw("Current: ",T01T620_A659PedCum[0]);
            }
            if ( DecimalUtil.compareTo(Z660PedDto, T01T620_A660PedDto[0]) != 0 )
            {
               GXutil.writeLogln("entradaproductoalmacen_trn:[seudo value changed for attri]"+"PedDto");
               GXutil.writeLogRaw("Old: ",Z660PedDto);
               GXutil.writeLogRaw("Current: ",T01T620_A660PedDto[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPLPEDID"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1T642( )
   {
      beforeValidate1T642( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1T642( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1T642( 0) ;
         checkOptimisticConcurrency1T642( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1T642( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1T642( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01T621 */
                  pr_default.execute(17, new Object[] {Short.valueOf(A597LinEnt), Byte.valueOf(A411EntCon), A419EntUniRem, A417EntPre, A3404EntPedCum, A415EntFecEnt, A11Albaran, A12857EntNAlbar, Boolean.valueOf(n6156EntPrvNum), Integer.valueOf(A6156EntPrvNum), A418EntUniEnt, Short.valueOf(A416EntNumCon), A5686EntLotN, A5685EntFVal, Byte.valueOf(A414EntEti), Integer.valueOf(A413EntConIni), Integer.valueOf(A412EntConFin), A5691EntBnc, A7695EntCC, Short.valueOf(A7696EntCCoCod), A10782EntUniAlb, A10783EntObs, A10187EntRemNro, A10186EntRemFch, A10185EntRemSuc, A10184EntRemTpo, Integer.valueOf(A12716EntFabId), Long.valueOf(A13235EntLoteID), A13456EntUbicaci, A5690EntHfCon, A5689EntFfCon, A5688EntHiCon, A5687EntFiCon, Byte.valueOf(A14035EntNEmb), A396EmprCod, A719PrdNum, Boolean.valueOf(n658PedCod), Integer.valueOf(A658PedCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPENTALM");
                  if ( (pr_default.getStatus(17) == 1) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
                     AnyError = (short)(1) ;
                  }
                  if ( AnyError == 0 )
                  {
                     updateTablesN11T642( ) ;
                     /* Start of After( Insert) rules */
                     if ( ! (0==A658PedCod) && ( true /* After */ || true /* After */ ) )
                     {
                        GXv_char4[0] = A396EmprCod ;
                        GXv_int8[0] = A658PedCod ;
                        GXv_char3[0] = A719PrdNum ;
                        GXv_char2[0] = httpContext.getMessage( "INS", "") ;
                        GXv_char14[0] = A3404EntPedCum ;
                        new app.ppedcum2(remoteHandle, context).execute( GXv_char4, GXv_int8, GXv_char3, GXv_char2, GXv_char14) ;
                        entradaproductoalmacen_trn_impl.this.A396EmprCod = GXv_char4[0] ;
                        entradaproductoalmacen_trn_impl.this.A658PedCod = GXv_int8[0] ;
                        entradaproductoalmacen_trn_impl.this.A719PrdNum = GXv_char3[0] ;
                        entradaproductoalmacen_trn_impl.this.A3404EntPedCum = GXv_char14[0] ;
                        httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
                        httpContext.ajax_rsp_assign_attri("", false, "A658PedCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A658PedCod), 8, 0));
                        httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
                        httpContext.ajax_rsp_assign_attri("", false, "A3404EntPedCum", A3404EntPedCum);
                     }
                     if ( true /* After */ || true /* After */ )
                     {
                        GXv_char14[0] = A396EmprCod ;
                        GXv_char4[0] = A719PrdNum ;
                        GXv_int8[0] = A6156EntPrvNum ;
                        GXv_decimal13[0] = A417EntPre ;
                        new app.pprenp(remoteHandle, context).execute( GXv_char14, GXv_char4, GXv_int8, GXv_decimal13) ;
                        entradaproductoalmacen_trn_impl.this.A396EmprCod = GXv_char14[0] ;
                        entradaproductoalmacen_trn_impl.this.A719PrdNum = GXv_char4[0] ;
                        entradaproductoalmacen_trn_impl.this.A6156EntPrvNum = GXv_int8[0] ;
                        entradaproductoalmacen_trn_impl.this.A417EntPre = GXv_decimal13[0] ;
                        httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
                        httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
                        httpContext.ajax_rsp_assign_attri("", false, "A6156EntPrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6156EntPrvNum), 6, 0));
                        httpContext.ajax_rsp_assign_attri("", false, "A417EntPre", GXutil.ltrimstr( A417EntPre, 14, 5));
                     }
                     if ( true /* After */ || true /* After */ )
                     {
                        AV17Inc_obs = GXutil.trim( A719PrdNum) + ",# " + GXutil.trim( GXutil.str( A597LinEnt, 4, 0)) + httpContext.getMessage( httpContext.getMessage( ",Fecha ", ""), "") + GXutil.trim( localUtil.dtoc( AV34oldEntFecent, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")) + "/" + GXutil.trim( localUtil.dtoc( A415EntFecEnt, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")) + httpContext.getMessage( httpContext.getMessage( ",Ped ", ""), "") + GXutil.trim( GXutil.str( A658PedCod, 8, 0)) + httpContext.getMessage( httpContext.getMessage( ",Cant ", ""), "") + GXutil.str( AV32OldEntUni, 9, 2) + "/" + GXutil.trim( GXutil.str( A418EntUniEnt, 9, 2)) + httpContext.getMessage( httpContext.getMessage( ",Prec ", ""), "") + GXutil.str( AV30OldEntPre, 14, 5) + "/" + GXutil.trim( GXutil.str( A417EntPre, 14, 5)) + httpContext.getMessage( httpContext.getMessage( ",Rema ", ""), "") + GXutil.trim( GXutil.str( AV33OldRemanente, 11, 4)) + "/" + GXutil.trim( GXutil.str( A419EntUniRem, 11, 4)) + httpContext.getMessage( httpContext.getMessage( ",Lote ", ""), "") + GXutil.trim( AV35oldlote) + "/" + GXutil.trim( A5686EntLotN) ;
                        httpContext.ajax_rsp_assign_attri("", false, "AV17Inc_obs", AV17Inc_obs);
                     }
                     if ( true /* After */ || true /* After */ )
                     {
                        new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV46Pgmname, AV36Usurcod, AV37Station, AV17Inc_obs, 99999999, (byte)(0), " ") ;
                     }
                     /* End of After( Insert) rules */
                     if ( AnyError == 0 )
                     {
                        /* Save values for previous() function. */
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                        endTrnMsgCod = "SuccessfullyAdded" ;
                        resetCaption1T60( ) ;
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
            load1T642( ) ;
         }
         endLevel1T642( ) ;
      }
      closeExtendedTableCursors1T642( ) ;
   }

   public void update1T642( )
   {
      beforeValidate1T642( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1T642( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1T642( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1T642( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1T642( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01T622 */
                  pr_default.execute(18, new Object[] {Byte.valueOf(A411EntCon), A419EntUniRem, A417EntPre, A3404EntPedCum, A415EntFecEnt, A11Albaran, A12857EntNAlbar, Boolean.valueOf(n6156EntPrvNum), Integer.valueOf(A6156EntPrvNum), A418EntUniEnt, Short.valueOf(A416EntNumCon), A5686EntLotN, A5685EntFVal, Byte.valueOf(A414EntEti), Integer.valueOf(A413EntConIni), Integer.valueOf(A412EntConFin), A5691EntBnc, A7695EntCC, Short.valueOf(A7696EntCCoCod), A10782EntUniAlb, A10783EntObs, A10187EntRemNro, A10186EntRemFch, A10185EntRemSuc, A10184EntRemTpo, Integer.valueOf(A12716EntFabId), Long.valueOf(A13235EntLoteID), A13456EntUbicaci, A5690EntHfCon, A5689EntFfCon, A5688EntHiCon, A5687EntFiCon, Byte.valueOf(A14035EntNEmb), Boolean.valueOf(n658PedCod), Integer.valueOf(A658PedCod), A396EmprCod, A719PrdNum, Short.valueOf(A597LinEnt)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPENTALM");
                  if ( (pr_default.getStatus(18) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPENTALM"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1T642( ) ;
                  if ( AnyError == 0 )
                  {
                     updateTablesN11T642( ) ;
                     /* Start of After( update) rules */
                     if ( ! (0==A658PedCod) && ( true /* After */ || true /* After */ ) )
                     {
                        GXv_char14[0] = A396EmprCod ;
                        GXv_int8[0] = A658PedCod ;
                        GXv_char4[0] = A719PrdNum ;
                        GXv_char3[0] = httpContext.getMessage( "INS", "") ;
                        GXv_char2[0] = A3404EntPedCum ;
                        new app.ppedcum2(remoteHandle, context).execute( GXv_char14, GXv_int8, GXv_char4, GXv_char3, GXv_char2) ;
                        entradaproductoalmacen_trn_impl.this.A396EmprCod = GXv_char14[0] ;
                        entradaproductoalmacen_trn_impl.this.A658PedCod = GXv_int8[0] ;
                        entradaproductoalmacen_trn_impl.this.A719PrdNum = GXv_char4[0] ;
                        entradaproductoalmacen_trn_impl.this.A3404EntPedCum = GXv_char2[0] ;
                        httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
                        httpContext.ajax_rsp_assign_attri("", false, "A658PedCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A658PedCod), 8, 0));
                        httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
                        httpContext.ajax_rsp_assign_attri("", false, "A3404EntPedCum", A3404EntPedCum);
                     }
                     if ( true /* After */ || true /* After */ )
                     {
                        GXv_char14[0] = A396EmprCod ;
                        GXv_char4[0] = A719PrdNum ;
                        GXv_int8[0] = A6156EntPrvNum ;
                        GXv_decimal13[0] = A417EntPre ;
                        new app.pprenp(remoteHandle, context).execute( GXv_char14, GXv_char4, GXv_int8, GXv_decimal13) ;
                        entradaproductoalmacen_trn_impl.this.A396EmprCod = GXv_char14[0] ;
                        entradaproductoalmacen_trn_impl.this.A719PrdNum = GXv_char4[0] ;
                        entradaproductoalmacen_trn_impl.this.A6156EntPrvNum = GXv_int8[0] ;
                        entradaproductoalmacen_trn_impl.this.A417EntPre = GXv_decimal13[0] ;
                        httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
                        httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
                        httpContext.ajax_rsp_assign_attri("", false, "A6156EntPrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6156EntPrvNum), 6, 0));
                        httpContext.ajax_rsp_assign_attri("", false, "A417EntPre", GXutil.ltrimstr( A417EntPre, 14, 5));
                     }
                     if ( true /* After */ || true /* After */ )
                     {
                        AV17Inc_obs = GXutil.trim( A719PrdNum) + ",# " + GXutil.trim( GXutil.str( A597LinEnt, 4, 0)) + httpContext.getMessage( httpContext.getMessage( ",Fecha ", ""), "") + GXutil.trim( localUtil.dtoc( AV34oldEntFecent, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")) + "/" + GXutil.trim( localUtil.dtoc( A415EntFecEnt, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")) + httpContext.getMessage( httpContext.getMessage( ",Ped ", ""), "") + GXutil.trim( GXutil.str( A658PedCod, 8, 0)) + httpContext.getMessage( httpContext.getMessage( ",Cant ", ""), "") + GXutil.str( AV32OldEntUni, 9, 2) + "/" + GXutil.trim( GXutil.str( A418EntUniEnt, 9, 2)) + httpContext.getMessage( httpContext.getMessage( ",Prec ", ""), "") + GXutil.str( AV30OldEntPre, 14, 5) + "/" + GXutil.trim( GXutil.str( A417EntPre, 14, 5)) + httpContext.getMessage( httpContext.getMessage( ",Rema ", ""), "") + GXutil.trim( GXutil.str( AV33OldRemanente, 11, 4)) + "/" + GXutil.trim( GXutil.str( A419EntUniRem, 11, 4)) + httpContext.getMessage( httpContext.getMessage( ",Lote ", ""), "") + GXutil.trim( AV35oldlote) + "/" + GXutil.trim( A5686EntLotN) ;
                        httpContext.ajax_rsp_assign_attri("", false, "AV17Inc_obs", AV17Inc_obs);
                     }
                     if ( true /* After */ || true /* After */ )
                     {
                        new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV46Pgmname, AV36Usurcod, AV37Station, AV17Inc_obs, 99999999, (byte)(0), " ") ;
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
         endLevel1T642( ) ;
      }
      closeExtendedTableCursors1T642( ) ;
   }

   public void deferredUpdate1T642( )
   {
   }

   public void delete( )
   {
      beforeValidate1T642( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1T642( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1T642( ) ;
         afterConfirm1T642( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1T642( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01T623 */
               pr_default.execute(19, new Object[] {A396EmprCod, A719PrdNum, Short.valueOf(A597LinEnt)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPENTALM");
               if ( AnyError == 0 )
               {
                  updateTablesN11T642( ) ;
                  /* Start of After( delete) rules */
                  if ( ! (0==A658PedCod) && true /* After */ )
                  {
                     GXv_char14[0] = A396EmprCod ;
                     GXv_int8[0] = A658PedCod ;
                     GXv_char4[0] = A719PrdNum ;
                     GXv_char3[0] = httpContext.getMessage( "DEL", "") ;
                     GXv_char2[0] = A3404EntPedCum ;
                     new app.ppedcum2(remoteHandle, context).execute( GXv_char14, GXv_int8, GXv_char4, GXv_char3, GXv_char2) ;
                     entradaproductoalmacen_trn_impl.this.A396EmprCod = GXv_char14[0] ;
                     entradaproductoalmacen_trn_impl.this.A658PedCod = GXv_int8[0] ;
                     entradaproductoalmacen_trn_impl.this.A719PrdNum = GXv_char4[0] ;
                     entradaproductoalmacen_trn_impl.this.A3404EntPedCum = GXv_char2[0] ;
                     httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
                     httpContext.ajax_rsp_assign_attri("", false, "A658PedCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A658PedCod), 8, 0));
                     httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
                     httpContext.ajax_rsp_assign_attri("", false, "A3404EntPedCum", A3404EntPedCum);
                  }
                  if ( true /* After */ )
                  {
                     AV17Inc_obs = GXutil.trim( A719PrdNum) + ",# " + GXutil.trim( GXutil.str( A597LinEnt, 4, 0)) + httpContext.getMessage( httpContext.getMessage( ",Fecha ", ""), "") + GXutil.trim( localUtil.dtoc( A415EntFecEnt, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")) + httpContext.getMessage( httpContext.getMessage( ",Ped ", ""), "") + GXutil.trim( GXutil.str( A658PedCod, 8, 0)) + httpContext.getMessage( httpContext.getMessage( ",Cant ", ""), "") + GXutil.trim( GXutil.str( A418EntUniEnt, 9, 2)) + httpContext.getMessage( httpContext.getMessage( ",Prec ", ""), "") + GXutil.str( AV30OldEntPre, 14, 5) + "/" + GXutil.trim( GXutil.str( A417EntPre, 14, 5)) + httpContext.getMessage( httpContext.getMessage( ",Rema ", ""), "") + GXutil.trim( GXutil.str( AV33OldRemanente, 11, 4)) + httpContext.getMessage( httpContext.getMessage( ",Lote ", ""), "") + GXutil.trim( A5686EntLotN) ;
                     httpContext.ajax_rsp_assign_attri("", false, "AV17Inc_obs", AV17Inc_obs);
                  }
                  if ( true /* After */ )
                  {
                     new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV46Pgmname, AV36Usurcod, AV37Station, AV17Inc_obs, 99999999, (byte)(0), " ") ;
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
      endLevel1T642( ) ;
      Gx_mode = sMode42 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1T642( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         if ( true /* Level */ && true /* After */ && GXutil.resetTime(A415EntFecEnt).after( GXutil.resetTime( Gx_date )) && isIns( )  )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "ERROR.Fecha Entrada mayor a la Fecha del Dia", ""), 1, "ENTFECENT");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEntFecEnt_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         if ( true /* After */ && ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A14040PrdUltMovF)) && GXutil.resetTime(A14040PrdUltMovF).after( GXutil.resetTime( A415EntFecEnt )) && ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A415EntFecEnt)) && ( isIns( )  || isUpd( )  ) && ( AV41FlagFecCcs == 0 ) )
         {
            httpContext.GX_msglist.addItem(AV15msg_ctrl_fecha, 1, "ENTFECENT");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEntFecEnt_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         if ( true /* Level */ && true /* After */ && ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A14040PrdUltMovF)) && GXutil.resetTime(A14040PrdUltMovF).after( GXutil.resetTime( A415EntFecEnt )) && ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A415EntFecEnt)) && ( isIns( )  || isUpd( )  ) && ( AV41FlagFecCcs == 1 ) )
         {
            httpContext.GX_msglist.addItem(AV15msg_ctrl_fecha, 0, "ENTFECENT");
         }
         AV22Year = (short)(GXutil.year( A415EntFecEnt)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV22Year", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV22Year), 4, 0));
         AV28Fecha = localUtil.ymdtod( AV22Year, 12, 1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV28Fecha", localUtil.format(AV28Fecha, "99/99/99"));
         AV23Mes = (byte)(GXutil.month( A415EntFecEnt)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV23Mes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV23Mes), 2, 0));
         AV34oldEntFecent = O415EntFecEnt ;
         httpContext.ajax_rsp_assign_attri("", false, "AV34oldEntFecent", localUtil.format(AV34oldEntFecent, "99/99/99"));
         AV20FecAnt = O415EntFecEnt ;
         httpContext.ajax_rsp_assign_attri("", false, "AV20FecAnt", localUtil.format(AV20FecAnt, "99/99/99"));
         AV25AnyAnt = (short)(GXutil.year( O415EntFecEnt)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV25AnyAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV25AnyAnt), 4, 0));
         AV26MesAnt = (byte)(GXutil.month( O415EntFecEnt)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV26MesAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV26MesAnt), 2, 0));
         AV29DiasFin = (short)(GXutil.ddiff(GXutil.eomdate( AV28Fecha),A415EntFecEnt)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV29DiasFin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29DiasFin), 3, 0));
         if ( true /* After */ )
         {
            GXt_char1 = AV18PrdNomX ;
            GXv_char14[0] = A396EmprCod ;
            GXv_int8[0] = A6156EntPrvNum ;
            GXv_char4[0] = GXt_char1 ;
            new app.pctrprv(remoteHandle, context).execute( GXv_char14, GXv_int8, GXv_char4) ;
            entradaproductoalmacen_trn_impl.this.A396EmprCod = GXv_char14[0] ;
            entradaproductoalmacen_trn_impl.this.A6156EntPrvNum = GXv_int8[0] ;
            entradaproductoalmacen_trn_impl.this.GXt_char1 = GXv_char4[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            httpContext.ajax_rsp_assign_attri("", false, "A6156EntPrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6156EntPrvNum), 6, 0));
            AV18PrdNomX = GXt_char1 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV18PrdNomX", AV18PrdNomX);
         }
         AV32OldEntUni = O418EntUniEnt ;
         httpContext.ajax_rsp_assign_attri("", false, "AV32OldEntUni", GXutil.ltrimstr( AV32OldEntUni, 9, 2));
         AV21UniOld = O418EntUniEnt ;
         httpContext.ajax_rsp_assign_attri("", false, "AV21UniOld", GXutil.ltrimstr( AV21UniOld, 9, 2));
         AV30OldEntPre = O417EntPre ;
         httpContext.ajax_rsp_assign_attri("", false, "AV30OldEntPre", GXutil.ltrimstr( AV30OldEntPre, 14, 5));
         AV27PrecAnt = O417EntPre ;
         httpContext.ajax_rsp_assign_attri("", false, "AV27PrecAnt", GXutil.ltrimstr( AV27PrecAnt, 14, 5));
         AV35oldlote = O5686EntLotN ;
         httpContext.ajax_rsp_assign_attri("", false, "AV35oldlote", AV35oldlote);
         AV33OldRemanente = O419EntUniRem ;
         httpContext.ajax_rsp_assign_attri("", false, "AV33OldRemanente", GXutil.ltrimstr( AV33OldRemanente, 11, 4));
         if ( (0==A658PedCod) )
         {
            edtEntPedCum_Enabled = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, edtEntPedCum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEntPedCum_Enabled), 5, 0), true);
         }
         else
         {
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
         /* Using cursor T01T624 */
         pr_default.execute(20, new Object[] {A396EmprCod, Boolean.valueOf(n658PedCod), Integer.valueOf(A658PedCod)});
         A661PedFec = T01T624_A661PedFec[0] ;
         A667PedSit = T01T624_A667PedSit[0] ;
         A666PedPri = T01T624_A666PedPri[0] ;
         A12580PedAlmc = T01T624_A12580PedAlmc[0] ;
         pr_default.close(20);
         A664PedNumLin = (short)(getPedNumLin0( A396EmprCod, A658PedCod)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A664PedNumLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A664PedNumLin), 3, 0));
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
         AV31OldExiAlm = O704PrdExiAlm ;
         httpContext.ajax_rsp_assign_attri("", false, "AV31OldExiAlm", GXutil.ltrimstr( AV31OldExiAlm, 12, 4));
         if ( isIns( )  )
         {
            A750PrdValStk = O750PrdValStk.add(GXutil.roundDecimal( A417EntPre.multiply(A418EntUniEnt), 2)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A750PrdValStk", GXutil.ltrimstr( A750PrdValStk, 11, 2));
         }
         else
         {
            if ( isUpd( )  )
            {
               A750PrdValStk = O750PrdValStk.add((GXutil.roundDecimal( A417EntPre.multiply(A418EntUniEnt), 2).subtract(GXutil.roundDecimal( AV30OldEntPre.multiply(AV32OldEntUni), 2)))) ;
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
         if ( ( isIns( )  || isUpd( )  ) && ( AV39NoUpd == 0 ) )
         {
            A713PrdFulEnt = A415EntFecEnt ;
            httpContext.ajax_rsp_assign_attri("", false, "A713PrdFulEnt", localUtil.format(A713PrdFulEnt, "99/99/99"));
         }
         if ( ( isIns( )  || isUpd( )  ) && ( AV39NoUpd == 0 ) )
         {
            A709PrdFecPre = A415EntFecEnt ;
            httpContext.ajax_rsp_assign_attri("", false, "A709PrdFecPre", localUtil.format(A709PrdFecPre, "99/99/99"));
         }
         if ( ( AV39NoUpd == 0 ) && ( isIns( )  || isUpd( )  ) )
         {
            A724PrdPreAct = A417EntPre ;
            httpContext.ajax_rsp_assign_attri("", false, "A724PrdPreAct", GXutil.ltrimstr( A724PrdPreAct, 14, 5));
         }
         if ( ( isIns( )  || isUpd( )  ) && ( AV39NoUpd == 0 ) )
         {
            A725PrdPreAnt = O724PrdPreAct ;
            httpContext.ajax_rsp_assign_attri("", false, "A725PrdPreAnt", GXutil.ltrimstr( A725PrdPreAnt, 14, 5));
         }
         if ( ( A684PrdCanPen.doubleValue() < 0 ) && ! (0==A658PedCod) )
         {
            A684PrdCanPen = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A684PrdCanPen", GXutil.ltrimstr( A684PrdCanPen, 12, 4));
         }
         if ( ( A704PrdExiAlm.doubleValue() != 0 ) && ( AV40Consumos == 1 ) && ( A750PrdValStk.doubleValue() > 0 ) )
         {
            A726PrdPreMed = GXutil.roundDecimal( A750PrdValStk.divide(A704PrdExiAlm, 18, java.math.RoundingMode.DOWN), 3) ;
            httpContext.ajax_rsp_assign_attri("", false, "A726PrdPreMed", GXutil.ltrimstr( A726PrdPreMed, 14, 5));
         }
         else
         {
            if ( ( A704PrdExiAlm.doubleValue() == 0 ) && ( AV40Consumos == 1 ) && ( A750PrdValStk.doubleValue() == 0 ) )
            {
               A726PrdPreMed = DecimalUtil.doubleToDec(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A726PrdPreMed", GXutil.ltrimstr( A726PrdPreMed, 14, 5));
            }
            else
            {
               if ( ( ( A704PrdExiAlm.doubleValue() != 0 ) || ( A705PrdExiCC.doubleValue() != 0 ) ) && ( AV40Consumos == 0 ) )
               {
                  A726PrdPreMed = GXutil.roundDecimal( A750PrdValStk.divide((A704PrdExiAlm.add(A705PrdExiCC)), 18, java.math.RoundingMode.DOWN), 3) ;
                  httpContext.ajax_rsp_assign_attri("", false, "A726PrdPreMed", GXutil.ltrimstr( A726PrdPreMed, 14, 5));
               }
               else
               {
                  if ( ( A704PrdExiAlm.doubleValue() == 0 ) && ( A705PrdExiCC.doubleValue() == 0 ) && ( AV40Consumos == 0 ) )
                  {
                     A726PrdPreMed = DecimalUtil.doubleToDec(0) ;
                     httpContext.ajax_rsp_assign_attri("", false, "A726PrdPreMed", GXutil.ltrimstr( A726PrdPreMed, 14, 5));
                  }
               }
            }
         }
         if ( true )
         {
            AV24PedPri = GXutil.str( A800PrvPri, 1, 0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV24PedPri", AV24PedPri);
         }
         else
         {
            if ( true /* Level */ && ! (0==A658PedCod) )
            {
               AV24PedPri = A666PedPri ;
               httpContext.ajax_rsp_assign_attri("", false, "AV24PedPri", AV24PedPri);
            }
         }
         AV15msg_ctrl_fecha = httpContext.getMessage( httpContext.getMessage( "Atencion.Ultimo Mov Fecha ", ""), "") + GXutil.trim( localUtil.dtoc( A14040PrdUltMovF, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")) + httpContext.getMessage( httpContext.getMessage( " superior a Fecha Mov ", ""), "") + GXutil.trim( localUtil.dtoc( A415EntFecEnt, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV15msg_ctrl_fecha", AV15msg_ctrl_fecha);
         if ( true /* Level */ && ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A14040PrdUltMovF)) && GXutil.resetTime(A14040PrdUltMovF).after( GXutil.resetTime( A415EntFecEnt )) && ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A415EntFecEnt)) && isDlt( )  && ( AV41FlagFecCcs == 0 ) )
         {
            httpContext.GX_msglist.addItem(AV15msg_ctrl_fecha, 1, "ENTFECENT");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEntFecEnt_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         if ( true /* Level */ && ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A14040PrdUltMovF)) && GXutil.resetTime(A14040PrdUltMovF).after( GXutil.resetTime( A415EntFecEnt )) && ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A415EntFecEnt)) && isDlt( )  && ( AV41FlagFecCcs == 1 ) )
         {
            httpContext.GX_msglist.addItem(AV15msg_ctrl_fecha, 0, "ENTFECENT");
         }
         /* Using cursor T01T625 */
         pr_default.execute(21, new Object[] {A396EmprCod, Boolean.valueOf(n658PedCod), Integer.valueOf(A658PedCod), A719PrdNum});
         Z663PedFulEnt = T01T625_A663PedFulEnt[0] ;
         Z665PedPre = T01T625_A665PedPre[0] ;
         Z669PedUni = T01T625_A669PedUni[0] ;
         Z659PedCum = T01T625_A659PedCum[0] ;
         Z660PedDto = T01T625_A660PedDto[0] ;
         A657PedCanEnt = T01T625_A657PedCanEnt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A657PedCanEnt", GXutil.ltrimstr( A657PedCanEnt, 9, 2));
         A663PedFulEnt = T01T625_A663PedFulEnt[0] ;
         A665PedPre = T01T625_A665PedPre[0] ;
         A669PedUni = T01T625_A669PedUni[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A669PedUni", GXutil.ltrimstr( A669PedUni, 9, 2));
         A659PedCum = T01T625_A659PedCum[0] ;
         A660PedDto = T01T625_A660PedDto[0] ;
         O657PedCanEnt = A657PedCanEnt ;
         httpContext.ajax_rsp_assign_attri("", false, "A657PedCanEnt", GXutil.ltrimstr( A657PedCanEnt, 9, 2));
         pr_default.close(21);
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
            httpContext.ajax_rsp_assign_attri("", false, "A14041EntCump", A14041EntCump);
         }
         else
         {
            if ( ( ( DecimalUtil.compareTo(A657PedCanEnt, A669PedUni) > 0 ) ) && ! (0==A658PedCod) )
            {
               A14041EntCump = "S" ;
               httpContext.ajax_rsp_assign_attri("", false, "A14041EntCump", A14041EntCump);
            }
            else
            {
               if ( ( DecimalUtil.compareTo(A657PedCanEnt, A669PedUni) < 0 ) && ! (0==A658PedCod) )
               {
                  A14041EntCump = "N" ;
                  httpContext.ajax_rsp_assign_attri("", false, "A14041EntCump", A14041EntCump);
               }
               else
               {
                  if ( (0==A658PedCod) )
                  {
                     A14041EntCump = "S" ;
                     httpContext.ajax_rsp_assign_attri("", false, "A14041EntCump", A14041EntCump);
                  }
                  else
                  {
                     A14041EntCump = "" ;
                     httpContext.ajax_rsp_assign_attri("", false, "A14041EntCump", A14041EntCump);
                  }
               }
            }
         }
      }
   }

   public void updateTablesN11T642( )
   {
      /* Using cursor T01T626 */
      pr_default.execute(22, new Object[] {Short.valueOf(A847UltLinEnt), A704PrdExiAlm, A726PrdPreMed, A750PrdValStk, A713PrdFulEnt, A709PrdFecPre, A725PrdPreAnt, A724PrdPreAct, A684PrdCanPen, A396EmprCod, A719PrdNum});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPRODUC");
      /* Using cursor T01T627 */
      pr_default.execute(23, new Object[] {A657PedCanEnt, A663PedFulEnt, A396EmprCod, Boolean.valueOf(n658PedCod), Integer.valueOf(A658PedCod), A719PrdNum});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLPEDID");
   }

   public void endLevel1T642( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      pr_default.close(15);
      pr_default.close(16);
      if ( AnyError == 0 )
      {
         beforeComplete1T642( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "entradaproductoalmacen_trn");
         if ( AnyError == 0 )
         {
            confirmValues1T60( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "entradaproductoalmacen_trn");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1T642( )
   {
      /* Scan By routine */
      /* Using cursor T01T628 */
      pr_default.execute(24);
      RcdFound42 = (short)(0) ;
      if ( (pr_default.getStatus(24) != 101) )
      {
         RcdFound42 = (short)(1) ;
         A396EmprCod = T01T628_A396EmprCod[0] ;
         A719PrdNum = T01T628_A719PrdNum[0] ;
         A597LinEnt = T01T628_A597LinEnt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A597LinEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A597LinEnt), 4, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1T642( )
   {
      /* Scan next routine */
      pr_default.readNext(24);
      RcdFound42 = (short)(0) ;
      if ( (pr_default.getStatus(24) != 101) )
      {
         RcdFound42 = (short)(1) ;
         A396EmprCod = T01T628_A396EmprCod[0] ;
         A719PrdNum = T01T628_A719PrdNum[0] ;
         A597LinEnt = T01T628_A597LinEnt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A597LinEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A597LinEnt), 4, 0));
      }
   }

   public void scanEnd1T642( )
   {
      pr_default.close(24);
   }

   public void afterConfirm1T642( )
   {
      /* After Confirm Rules */
      if ( true /* Level */ && isDlt( )  && true /* After */ )
      {
         GXv_char14[0] = A396EmprCod ;
         GXv_char4[0] = A719PrdNum ;
         GXv_int15[0] = A597LinEnt ;
         new app.peliccs(remoteHandle, context).execute( GXv_char14, GXv_char4, GXv_int15) ;
         entradaproductoalmacen_trn_impl.this.A396EmprCod = GXv_char14[0] ;
         entradaproductoalmacen_trn_impl.this.A719PrdNum = GXv_char4[0] ;
         entradaproductoalmacen_trn_impl.this.A597LinEnt = GXv_int15[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         httpContext.ajax_rsp_assign_attri("", false, "A597LinEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A597LinEnt), 4, 0));
      }
      if ( true /* After */ && ! (0==A658PedCod) )
      {
         A663PedFulEnt = A415EntFecEnt ;
         httpContext.ajax_rsp_assign_attri("", false, "A663PedFulEnt", localUtil.format(A663PedFulEnt, "99/99/99"));
      }
      if ( isIns( )  && true /* After */ )
      {
         GXv_char14[0] = A396EmprCod ;
         GXv_int8[0] = A6156EntPrvNum ;
         GXv_int15[0] = AV22Year ;
         GXv_int6[0] = AV23Mes ;
         GXv_decimal13[0] = A418EntUniEnt ;
         GXv_decimal16[0] = AV21UniOld ;
         GXv_decimal17[0] = A417EntPre ;
         GXv_char4[0] = AV24PedPri ;
         GXv_int18[0] = AV22Year ;
         GXv_int19[0] = AV25AnyAnt ;
         GXv_int20[0] = AV23Mes ;
         GXv_int21[0] = AV26MesAnt ;
         GXv_decimal22[0] = AV27PrecAnt ;
         GXv_date11[0] = A415EntFecEnt ;
         GXv_date23[0] = AV20FecAnt ;
         GXv_char3[0] = httpContext.getMessage( "INS", "") ;
         new app.pprdes2(remoteHandle, context).execute( GXv_char14, GXv_int8, GXv_int15, GXv_int6, GXv_decimal13, GXv_decimal16, GXv_decimal17, GXv_char4, GXv_int18, GXv_int19, GXv_int20, GXv_int21, GXv_decimal22, GXv_date11, GXv_date23, GXv_char3) ;
         entradaproductoalmacen_trn_impl.this.A396EmprCod = GXv_char14[0] ;
         entradaproductoalmacen_trn_impl.this.A6156EntPrvNum = GXv_int8[0] ;
         entradaproductoalmacen_trn_impl.this.AV22Year = GXv_int15[0] ;
         entradaproductoalmacen_trn_impl.this.AV23Mes = GXv_int6[0] ;
         entradaproductoalmacen_trn_impl.this.A418EntUniEnt = GXv_decimal13[0] ;
         entradaproductoalmacen_trn_impl.this.AV21UniOld = GXv_decimal16[0] ;
         entradaproductoalmacen_trn_impl.this.A417EntPre = GXv_decimal17[0] ;
         entradaproductoalmacen_trn_impl.this.AV24PedPri = GXv_char4[0] ;
         entradaproductoalmacen_trn_impl.this.AV22Year = GXv_int18[0] ;
         entradaproductoalmacen_trn_impl.this.AV25AnyAnt = GXv_int19[0] ;
         entradaproductoalmacen_trn_impl.this.AV23Mes = GXv_int20[0] ;
         entradaproductoalmacen_trn_impl.this.AV26MesAnt = GXv_int21[0] ;
         entradaproductoalmacen_trn_impl.this.AV27PrecAnt = GXv_decimal22[0] ;
         entradaproductoalmacen_trn_impl.this.A415EntFecEnt = GXv_date11[0] ;
         entradaproductoalmacen_trn_impl.this.AV20FecAnt = GXv_date23[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A6156EntPrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6156EntPrvNum), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV22Year", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV22Year), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV23Mes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV23Mes), 2, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A418EntUniEnt", GXutil.ltrimstr( A418EntUniEnt, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "AV21UniOld", GXutil.ltrimstr( AV21UniOld, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "A417EntPre", GXutil.ltrimstr( A417EntPre, 14, 5));
         httpContext.ajax_rsp_assign_attri("", false, "AV24PedPri", AV24PedPri);
         httpContext.ajax_rsp_assign_attri("", false, "AV22Year", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV22Year), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV25AnyAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV25AnyAnt), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV23Mes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV23Mes), 2, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV26MesAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV26MesAnt), 2, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV27PrecAnt", GXutil.ltrimstr( AV27PrecAnt, 14, 5));
         httpContext.ajax_rsp_assign_attri("", false, "A415EntFecEnt", localUtil.format(A415EntFecEnt, "99/99/99"));
         httpContext.ajax_rsp_assign_attri("", false, "AV20FecAnt", localUtil.format(AV20FecAnt, "99/99/99"));
      }
      if ( ( ( ( DecimalUtil.compareTo(A418EntUniEnt, AV21UniOld) != 0 ) ) || ( !( GXutil.dateCompare(GXutil.resetTime(A415EntFecEnt), GXutil.resetTime(AV20FecAnt)) ) ) || ( ( DecimalUtil.compareTo(A417EntPre, AV27PrecAnt) != 0 ) ) ) && isUpd( )  && true /* After */ )
      {
         GXv_char14[0] = A396EmprCod ;
         GXv_int8[0] = A6156EntPrvNum ;
         GXv_int19[0] = AV22Year ;
         GXv_int21[0] = AV23Mes ;
         GXv_decimal22[0] = A418EntUniEnt ;
         GXv_decimal17[0] = AV21UniOld ;
         GXv_decimal16[0] = A417EntPre ;
         GXv_char4[0] = AV24PedPri ;
         GXv_int18[0] = AV22Year ;
         GXv_int15[0] = AV25AnyAnt ;
         GXv_int20[0] = AV23Mes ;
         GXv_int6[0] = AV26MesAnt ;
         GXv_decimal13[0] = AV27PrecAnt ;
         GXv_date23[0] = A415EntFecEnt ;
         GXv_date11[0] = AV20FecAnt ;
         GXv_char3[0] = httpContext.getMessage( "UPD", "") ;
         new app.pprdes2(remoteHandle, context).execute( GXv_char14, GXv_int8, GXv_int19, GXv_int21, GXv_decimal22, GXv_decimal17, GXv_decimal16, GXv_char4, GXv_int18, GXv_int15, GXv_int20, GXv_int6, GXv_decimal13, GXv_date23, GXv_date11, GXv_char3) ;
         entradaproductoalmacen_trn_impl.this.A396EmprCod = GXv_char14[0] ;
         entradaproductoalmacen_trn_impl.this.A6156EntPrvNum = GXv_int8[0] ;
         entradaproductoalmacen_trn_impl.this.AV22Year = GXv_int19[0] ;
         entradaproductoalmacen_trn_impl.this.AV23Mes = GXv_int21[0] ;
         entradaproductoalmacen_trn_impl.this.A418EntUniEnt = GXv_decimal22[0] ;
         entradaproductoalmacen_trn_impl.this.AV21UniOld = GXv_decimal17[0] ;
         entradaproductoalmacen_trn_impl.this.A417EntPre = GXv_decimal16[0] ;
         entradaproductoalmacen_trn_impl.this.AV24PedPri = GXv_char4[0] ;
         entradaproductoalmacen_trn_impl.this.AV22Year = GXv_int18[0] ;
         entradaproductoalmacen_trn_impl.this.AV25AnyAnt = GXv_int15[0] ;
         entradaproductoalmacen_trn_impl.this.AV23Mes = GXv_int20[0] ;
         entradaproductoalmacen_trn_impl.this.AV26MesAnt = GXv_int6[0] ;
         entradaproductoalmacen_trn_impl.this.AV27PrecAnt = GXv_decimal13[0] ;
         entradaproductoalmacen_trn_impl.this.A415EntFecEnt = GXv_date23[0] ;
         entradaproductoalmacen_trn_impl.this.AV20FecAnt = GXv_date11[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A6156EntPrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6156EntPrvNum), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV22Year", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV22Year), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV23Mes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV23Mes), 2, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A418EntUniEnt", GXutil.ltrimstr( A418EntUniEnt, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "AV21UniOld", GXutil.ltrimstr( AV21UniOld, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "A417EntPre", GXutil.ltrimstr( A417EntPre, 14, 5));
         httpContext.ajax_rsp_assign_attri("", false, "AV24PedPri", AV24PedPri);
         httpContext.ajax_rsp_assign_attri("", false, "AV22Year", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV22Year), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV25AnyAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV25AnyAnt), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV23Mes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV23Mes), 2, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV26MesAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV26MesAnt), 2, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV27PrecAnt", GXutil.ltrimstr( AV27PrecAnt, 14, 5));
         httpContext.ajax_rsp_assign_attri("", false, "A415EntFecEnt", localUtil.format(A415EntFecEnt, "99/99/99"));
         httpContext.ajax_rsp_assign_attri("", false, "AV20FecAnt", localUtil.format(AV20FecAnt, "99/99/99"));
      }
      if ( isIns( )  && true /* After */ )
      {
         GXv_char14[0] = A396EmprCod ;
         GXv_int8[0] = A6156EntPrvNum ;
         GXv_char4[0] = A719PrdNum ;
         GXv_char3[0] = A718PrdNom ;
         GXv_int19[0] = AV22Year ;
         GXv_int21[0] = AV23Mes ;
         GXv_decimal22[0] = A418EntUniEnt ;
         GXv_decimal17[0] = AV21UniOld ;
         GXv_decimal16[0] = A417EntPre ;
         GXv_char2[0] = AV24PedPri ;
         GXv_int18[0] = AV22Year ;
         GXv_int15[0] = AV25AnyAnt ;
         GXv_int20[0] = AV23Mes ;
         GXv_int6[0] = AV26MesAnt ;
         GXv_decimal13[0] = AV27PrecAnt ;
         GXv_date23[0] = A415EntFecEnt ;
         GXv_date11[0] = AV20FecAnt ;
         GXv_char24[0] = httpContext.getMessage( "INS", "") ;
         new app.pprdes3(remoteHandle, context).execute( GXv_char14, GXv_int8, GXv_char4, GXv_char3, GXv_int19, GXv_int21, GXv_decimal22, GXv_decimal17, GXv_decimal16, GXv_char2, GXv_int18, GXv_int15, GXv_int20, GXv_int6, GXv_decimal13, GXv_date23, GXv_date11, GXv_char24) ;
         entradaproductoalmacen_trn_impl.this.A396EmprCod = GXv_char14[0] ;
         entradaproductoalmacen_trn_impl.this.A6156EntPrvNum = GXv_int8[0] ;
         entradaproductoalmacen_trn_impl.this.A719PrdNum = GXv_char4[0] ;
         entradaproductoalmacen_trn_impl.this.A718PrdNom = GXv_char3[0] ;
         entradaproductoalmacen_trn_impl.this.AV22Year = GXv_int19[0] ;
         entradaproductoalmacen_trn_impl.this.AV23Mes = GXv_int21[0] ;
         entradaproductoalmacen_trn_impl.this.A418EntUniEnt = GXv_decimal22[0] ;
         entradaproductoalmacen_trn_impl.this.AV21UniOld = GXv_decimal17[0] ;
         entradaproductoalmacen_trn_impl.this.A417EntPre = GXv_decimal16[0] ;
         entradaproductoalmacen_trn_impl.this.AV24PedPri = GXv_char2[0] ;
         entradaproductoalmacen_trn_impl.this.AV22Year = GXv_int18[0] ;
         entradaproductoalmacen_trn_impl.this.AV25AnyAnt = GXv_int15[0] ;
         entradaproductoalmacen_trn_impl.this.AV23Mes = GXv_int20[0] ;
         entradaproductoalmacen_trn_impl.this.AV26MesAnt = GXv_int6[0] ;
         entradaproductoalmacen_trn_impl.this.AV27PrecAnt = GXv_decimal13[0] ;
         entradaproductoalmacen_trn_impl.this.A415EntFecEnt = GXv_date23[0] ;
         entradaproductoalmacen_trn_impl.this.AV20FecAnt = GXv_date11[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A6156EntPrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6156EntPrvNum), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         httpContext.ajax_rsp_assign_attri("", false, "A718PrdNom", A718PrdNom);
         httpContext.ajax_rsp_assign_attri("", false, "AV22Year", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV22Year), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV23Mes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV23Mes), 2, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A418EntUniEnt", GXutil.ltrimstr( A418EntUniEnt, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "AV21UniOld", GXutil.ltrimstr( AV21UniOld, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "A417EntPre", GXutil.ltrimstr( A417EntPre, 14, 5));
         httpContext.ajax_rsp_assign_attri("", false, "AV24PedPri", AV24PedPri);
         httpContext.ajax_rsp_assign_attri("", false, "AV22Year", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV22Year), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV25AnyAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV25AnyAnt), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV23Mes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV23Mes), 2, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV26MesAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV26MesAnt), 2, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV27PrecAnt", GXutil.ltrimstr( AV27PrecAnt, 14, 5));
         httpContext.ajax_rsp_assign_attri("", false, "A415EntFecEnt", localUtil.format(A415EntFecEnt, "99/99/99"));
         httpContext.ajax_rsp_assign_attri("", false, "AV20FecAnt", localUtil.format(AV20FecAnt, "99/99/99"));
      }
      if ( ( ( ( DecimalUtil.compareTo(A418EntUniEnt, AV21UniOld) != 0 ) ) || ( !( GXutil.dateCompare(GXutil.resetTime(A415EntFecEnt), GXutil.resetTime(AV20FecAnt)) ) ) || ( ( DecimalUtil.compareTo(A417EntPre, AV27PrecAnt) != 0 ) ) ) && isUpd( )  && true /* After */ )
      {
         GXv_char24[0] = A396EmprCod ;
         GXv_int8[0] = A6156EntPrvNum ;
         GXv_char14[0] = A719PrdNum ;
         GXv_char4[0] = A718PrdNom ;
         GXv_int19[0] = AV22Year ;
         GXv_int21[0] = AV23Mes ;
         GXv_decimal22[0] = A418EntUniEnt ;
         GXv_decimal17[0] = AV21UniOld ;
         GXv_decimal16[0] = A417EntPre ;
         GXv_char3[0] = AV24PedPri ;
         GXv_int18[0] = AV22Year ;
         GXv_int15[0] = AV25AnyAnt ;
         GXv_int20[0] = AV23Mes ;
         GXv_int6[0] = AV26MesAnt ;
         GXv_decimal13[0] = AV27PrecAnt ;
         GXv_date23[0] = A415EntFecEnt ;
         GXv_date11[0] = AV20FecAnt ;
         GXv_char2[0] = httpContext.getMessage( "UPD", "") ;
         new app.pprdes3(remoteHandle, context).execute( GXv_char24, GXv_int8, GXv_char14, GXv_char4, GXv_int19, GXv_int21, GXv_decimal22, GXv_decimal17, GXv_decimal16, GXv_char3, GXv_int18, GXv_int15, GXv_int20, GXv_int6, GXv_decimal13, GXv_date23, GXv_date11, GXv_char2) ;
         entradaproductoalmacen_trn_impl.this.A396EmprCod = GXv_char24[0] ;
         entradaproductoalmacen_trn_impl.this.A6156EntPrvNum = GXv_int8[0] ;
         entradaproductoalmacen_trn_impl.this.A719PrdNum = GXv_char14[0] ;
         entradaproductoalmacen_trn_impl.this.A718PrdNom = GXv_char4[0] ;
         entradaproductoalmacen_trn_impl.this.AV22Year = GXv_int19[0] ;
         entradaproductoalmacen_trn_impl.this.AV23Mes = GXv_int21[0] ;
         entradaproductoalmacen_trn_impl.this.A418EntUniEnt = GXv_decimal22[0] ;
         entradaproductoalmacen_trn_impl.this.AV21UniOld = GXv_decimal17[0] ;
         entradaproductoalmacen_trn_impl.this.A417EntPre = GXv_decimal16[0] ;
         entradaproductoalmacen_trn_impl.this.AV24PedPri = GXv_char3[0] ;
         entradaproductoalmacen_trn_impl.this.AV22Year = GXv_int18[0] ;
         entradaproductoalmacen_trn_impl.this.AV25AnyAnt = GXv_int15[0] ;
         entradaproductoalmacen_trn_impl.this.AV23Mes = GXv_int20[0] ;
         entradaproductoalmacen_trn_impl.this.AV26MesAnt = GXv_int6[0] ;
         entradaproductoalmacen_trn_impl.this.AV27PrecAnt = GXv_decimal13[0] ;
         entradaproductoalmacen_trn_impl.this.A415EntFecEnt = GXv_date23[0] ;
         entradaproductoalmacen_trn_impl.this.AV20FecAnt = GXv_date11[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A6156EntPrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6156EntPrvNum), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         httpContext.ajax_rsp_assign_attri("", false, "A718PrdNom", A718PrdNom);
         httpContext.ajax_rsp_assign_attri("", false, "AV22Year", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV22Year), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV23Mes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV23Mes), 2, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A418EntUniEnt", GXutil.ltrimstr( A418EntUniEnt, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "AV21UniOld", GXutil.ltrimstr( AV21UniOld, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "A417EntPre", GXutil.ltrimstr( A417EntPre, 14, 5));
         httpContext.ajax_rsp_assign_attri("", false, "AV24PedPri", AV24PedPri);
         httpContext.ajax_rsp_assign_attri("", false, "AV22Year", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV22Year), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV25AnyAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV25AnyAnt), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV23Mes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV23Mes), 2, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV26MesAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV26MesAnt), 2, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV27PrecAnt", GXutil.ltrimstr( AV27PrecAnt, 14, 5));
         httpContext.ajax_rsp_assign_attri("", false, "A415EntFecEnt", localUtil.format(A415EntFecEnt, "99/99/99"));
         httpContext.ajax_rsp_assign_attri("", false, "AV20FecAnt", localUtil.format(AV20FecAnt, "99/99/99"));
      }
      if ( isIns( )  && true /* After */ )
      {
         GXv_char24[0] = A396EmprCod ;
         GXv_char14[0] = A719PrdNum ;
         GXv_int19[0] = AV22Year ;
         GXv_int21[0] = AV23Mes ;
         GXv_decimal22[0] = A418EntUniEnt ;
         GXv_decimal17[0] = AV21UniOld ;
         GXv_decimal16[0] = A417EntPre ;
         GXv_int18[0] = AV22Year ;
         GXv_int15[0] = AV25AnyAnt ;
         GXv_int20[0] = AV23Mes ;
         GXv_int6[0] = AV26MesAnt ;
         GXv_decimal13[0] = AV27PrecAnt ;
         GXv_date23[0] = A415EntFecEnt ;
         GXv_date11[0] = AV20FecAnt ;
         GXv_char4[0] = AV24PedPri ;
         GXv_char3[0] = httpContext.getMessage( "INS", "") ;
         new app.pprden2(remoteHandle, context).execute( GXv_char24, GXv_char14, GXv_int19, GXv_int21, GXv_decimal22, GXv_decimal17, GXv_decimal16, GXv_int18, GXv_int15, GXv_int20, GXv_int6, GXv_decimal13, GXv_date23, GXv_date11, GXv_char4, GXv_char3) ;
         entradaproductoalmacen_trn_impl.this.A396EmprCod = GXv_char24[0] ;
         entradaproductoalmacen_trn_impl.this.A719PrdNum = GXv_char14[0] ;
         entradaproductoalmacen_trn_impl.this.AV22Year = GXv_int19[0] ;
         entradaproductoalmacen_trn_impl.this.AV23Mes = GXv_int21[0] ;
         entradaproductoalmacen_trn_impl.this.A418EntUniEnt = GXv_decimal22[0] ;
         entradaproductoalmacen_trn_impl.this.AV21UniOld = GXv_decimal17[0] ;
         entradaproductoalmacen_trn_impl.this.A417EntPre = GXv_decimal16[0] ;
         entradaproductoalmacen_trn_impl.this.AV22Year = GXv_int18[0] ;
         entradaproductoalmacen_trn_impl.this.AV25AnyAnt = GXv_int15[0] ;
         entradaproductoalmacen_trn_impl.this.AV23Mes = GXv_int20[0] ;
         entradaproductoalmacen_trn_impl.this.AV26MesAnt = GXv_int6[0] ;
         entradaproductoalmacen_trn_impl.this.AV27PrecAnt = GXv_decimal13[0] ;
         entradaproductoalmacen_trn_impl.this.A415EntFecEnt = GXv_date23[0] ;
         entradaproductoalmacen_trn_impl.this.AV20FecAnt = GXv_date11[0] ;
         entradaproductoalmacen_trn_impl.this.AV24PedPri = GXv_char4[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         httpContext.ajax_rsp_assign_attri("", false, "AV22Year", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV22Year), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV23Mes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV23Mes), 2, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A418EntUniEnt", GXutil.ltrimstr( A418EntUniEnt, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "AV21UniOld", GXutil.ltrimstr( AV21UniOld, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "A417EntPre", GXutil.ltrimstr( A417EntPre, 14, 5));
         httpContext.ajax_rsp_assign_attri("", false, "AV22Year", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV22Year), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV25AnyAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV25AnyAnt), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV23Mes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV23Mes), 2, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV26MesAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV26MesAnt), 2, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV27PrecAnt", GXutil.ltrimstr( AV27PrecAnt, 14, 5));
         httpContext.ajax_rsp_assign_attri("", false, "A415EntFecEnt", localUtil.format(A415EntFecEnt, "99/99/99"));
         httpContext.ajax_rsp_assign_attri("", false, "AV20FecAnt", localUtil.format(AV20FecAnt, "99/99/99"));
         httpContext.ajax_rsp_assign_attri("", false, "AV24PedPri", AV24PedPri);
      }
      if ( ( ( ( DecimalUtil.compareTo(A418EntUniEnt, AV21UniOld) != 0 ) ) || ( !( GXutil.dateCompare(GXutil.resetTime(A415EntFecEnt), GXutil.resetTime(AV20FecAnt)) ) ) || ( ( DecimalUtil.compareTo(A417EntPre, AV27PrecAnt) != 0 ) ) ) && isUpd( )  && true /* After */ )
      {
         GXv_char24[0] = A396EmprCod ;
         GXv_char14[0] = A719PrdNum ;
         GXv_int19[0] = AV22Year ;
         GXv_int21[0] = AV23Mes ;
         GXv_decimal22[0] = A418EntUniEnt ;
         GXv_decimal17[0] = AV21UniOld ;
         GXv_decimal16[0] = A417EntPre ;
         GXv_int18[0] = AV22Year ;
         GXv_int15[0] = AV25AnyAnt ;
         GXv_int20[0] = AV23Mes ;
         GXv_int6[0] = AV26MesAnt ;
         GXv_decimal13[0] = AV27PrecAnt ;
         GXv_date23[0] = A415EntFecEnt ;
         GXv_date11[0] = AV20FecAnt ;
         GXv_char4[0] = AV24PedPri ;
         GXv_char3[0] = httpContext.getMessage( "UPD", "") ;
         new app.pprden2(remoteHandle, context).execute( GXv_char24, GXv_char14, GXv_int19, GXv_int21, GXv_decimal22, GXv_decimal17, GXv_decimal16, GXv_int18, GXv_int15, GXv_int20, GXv_int6, GXv_decimal13, GXv_date23, GXv_date11, GXv_char4, GXv_char3) ;
         entradaproductoalmacen_trn_impl.this.A396EmprCod = GXv_char24[0] ;
         entradaproductoalmacen_trn_impl.this.A719PrdNum = GXv_char14[0] ;
         entradaproductoalmacen_trn_impl.this.AV22Year = GXv_int19[0] ;
         entradaproductoalmacen_trn_impl.this.AV23Mes = GXv_int21[0] ;
         entradaproductoalmacen_trn_impl.this.A418EntUniEnt = GXv_decimal22[0] ;
         entradaproductoalmacen_trn_impl.this.AV21UniOld = GXv_decimal17[0] ;
         entradaproductoalmacen_trn_impl.this.A417EntPre = GXv_decimal16[0] ;
         entradaproductoalmacen_trn_impl.this.AV22Year = GXv_int18[0] ;
         entradaproductoalmacen_trn_impl.this.AV25AnyAnt = GXv_int15[0] ;
         entradaproductoalmacen_trn_impl.this.AV23Mes = GXv_int20[0] ;
         entradaproductoalmacen_trn_impl.this.AV26MesAnt = GXv_int6[0] ;
         entradaproductoalmacen_trn_impl.this.AV27PrecAnt = GXv_decimal13[0] ;
         entradaproductoalmacen_trn_impl.this.A415EntFecEnt = GXv_date23[0] ;
         entradaproductoalmacen_trn_impl.this.AV20FecAnt = GXv_date11[0] ;
         entradaproductoalmacen_trn_impl.this.AV24PedPri = GXv_char4[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         httpContext.ajax_rsp_assign_attri("", false, "AV22Year", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV22Year), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV23Mes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV23Mes), 2, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A418EntUniEnt", GXutil.ltrimstr( A418EntUniEnt, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "AV21UniOld", GXutil.ltrimstr( AV21UniOld, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "A417EntPre", GXutil.ltrimstr( A417EntPre, 14, 5));
         httpContext.ajax_rsp_assign_attri("", false, "AV22Year", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV22Year), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV25AnyAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV25AnyAnt), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV23Mes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV23Mes), 2, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV26MesAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV26MesAnt), 2, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV27PrecAnt", GXutil.ltrimstr( AV27PrecAnt, 14, 5));
         httpContext.ajax_rsp_assign_attri("", false, "A415EntFecEnt", localUtil.format(A415EntFecEnt, "99/99/99"));
         httpContext.ajax_rsp_assign_attri("", false, "AV20FecAnt", localUtil.format(AV20FecAnt, "99/99/99"));
         httpContext.ajax_rsp_assign_attri("", false, "AV24PedPri", AV24PedPri);
      }
      if ( isDlt( )  && true /* Level */ && true /* After */ )
      {
         GXv_char24[0] = A396EmprCod ;
         GXv_int8[0] = A6156EntPrvNum ;
         GXv_date23[0] = A415EntFecEnt ;
         GXv_int25[0] = A658PedCod ;
         GXv_decimal22[0] = A418EntUniEnt ;
         GXv_decimal17[0] = A417EntPre ;
         GXv_char14[0] = AV24PedPri ;
         new app.pacespr(remoteHandle, context).execute( GXv_char24, GXv_int8, GXv_date23, GXv_int25, GXv_decimal22, GXv_decimal17, GXv_char14) ;
         entradaproductoalmacen_trn_impl.this.A396EmprCod = GXv_char24[0] ;
         entradaproductoalmacen_trn_impl.this.A6156EntPrvNum = GXv_int8[0] ;
         entradaproductoalmacen_trn_impl.this.A415EntFecEnt = GXv_date23[0] ;
         entradaproductoalmacen_trn_impl.this.A658PedCod = GXv_int25[0] ;
         entradaproductoalmacen_trn_impl.this.A418EntUniEnt = GXv_decimal22[0] ;
         entradaproductoalmacen_trn_impl.this.A417EntPre = GXv_decimal17[0] ;
         entradaproductoalmacen_trn_impl.this.AV24PedPri = GXv_char14[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A6156EntPrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6156EntPrvNum), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A415EntFecEnt", localUtil.format(A415EntFecEnt, "99/99/99"));
         httpContext.ajax_rsp_assign_attri("", false, "A658PedCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A658PedCod), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A418EntUniEnt", GXutil.ltrimstr( A418EntUniEnt, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "A417EntPre", GXutil.ltrimstr( A417EntPre, 14, 5));
         httpContext.ajax_rsp_assign_attri("", false, "AV24PedPri", AV24PedPri);
      }
      if ( isDlt( )  && true /* Level */ && true /* After */ )
      {
         GXv_char24[0] = A396EmprCod ;
         GXv_int25[0] = A6156EntPrvNum ;
         GXv_char14[0] = A719PrdNum ;
         GXv_char4[0] = A718PrdNom ;
         GXv_date23[0] = A415EntFecEnt ;
         GXv_int8[0] = A658PedCod ;
         GXv_decimal22[0] = A418EntUniEnt ;
         GXv_decimal17[0] = A417EntPre ;
         GXv_char3[0] = AV24PedPri ;
         new app.pacesprx(remoteHandle, context).execute( GXv_char24, GXv_int25, GXv_char14, GXv_char4, GXv_date23, GXv_int8, GXv_decimal22, GXv_decimal17, GXv_char3) ;
         entradaproductoalmacen_trn_impl.this.A396EmprCod = GXv_char24[0] ;
         entradaproductoalmacen_trn_impl.this.A6156EntPrvNum = GXv_int25[0] ;
         entradaproductoalmacen_trn_impl.this.A719PrdNum = GXv_char14[0] ;
         entradaproductoalmacen_trn_impl.this.A718PrdNom = GXv_char4[0] ;
         entradaproductoalmacen_trn_impl.this.A415EntFecEnt = GXv_date23[0] ;
         entradaproductoalmacen_trn_impl.this.A658PedCod = GXv_int8[0] ;
         entradaproductoalmacen_trn_impl.this.A418EntUniEnt = GXv_decimal22[0] ;
         entradaproductoalmacen_trn_impl.this.A417EntPre = GXv_decimal17[0] ;
         entradaproductoalmacen_trn_impl.this.AV24PedPri = GXv_char3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A6156EntPrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6156EntPrvNum), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         httpContext.ajax_rsp_assign_attri("", false, "A718PrdNom", A718PrdNom);
         httpContext.ajax_rsp_assign_attri("", false, "A415EntFecEnt", localUtil.format(A415EntFecEnt, "99/99/99"));
         httpContext.ajax_rsp_assign_attri("", false, "A658PedCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A658PedCod), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A418EntUniEnt", GXutil.ltrimstr( A418EntUniEnt, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "A417EntPre", GXutil.ltrimstr( A417EntPre, 14, 5));
         httpContext.ajax_rsp_assign_attri("", false, "AV24PedPri", AV24PedPri);
      }
      if ( isDlt( )  && true /* Level */ && true /* After */ )
      {
         GXv_char24[0] = A396EmprCod ;
         GXv_char14[0] = A719PrdNum ;
         GXv_date23[0] = A415EntFecEnt ;
         GXv_decimal22[0] = A418EntUniEnt ;
         GXv_decimal17[0] = A417EntPre ;
         new app.pacespd(remoteHandle, context).execute( GXv_char24, GXv_char14, GXv_date23, GXv_decimal22, GXv_decimal17) ;
         entradaproductoalmacen_trn_impl.this.A396EmprCod = GXv_char24[0] ;
         entradaproductoalmacen_trn_impl.this.A719PrdNum = GXv_char14[0] ;
         entradaproductoalmacen_trn_impl.this.A415EntFecEnt = GXv_date23[0] ;
         entradaproductoalmacen_trn_impl.this.A418EntUniEnt = GXv_decimal22[0] ;
         entradaproductoalmacen_trn_impl.this.A417EntPre = GXv_decimal17[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         httpContext.ajax_rsp_assign_attri("", false, "A415EntFecEnt", localUtil.format(A415EntFecEnt, "99/99/99"));
         httpContext.ajax_rsp_assign_attri("", false, "A418EntUniEnt", GXutil.ltrimstr( A418EntUniEnt, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "A417EntPre", GXutil.ltrimstr( A417EntPre, 14, 5));
      }
      if ( ( isIns( )  || isUpd( )  ) && true /* After */ && ( AV19Nalbaran20 == 0 ) )
      {
         GXv_char24[0] = A396EmprCod ;
         GXv_char14[0] = A719PrdNum ;
         GXv_decimal22[0] = A418EntUniEnt ;
         GXv_decimal17[0] = DecimalUtil.doubleToDec(0) ;
         GXv_char4[0] = httpContext.getMessage( "EN", "") ;
         GXv_char3[0] = AV24PedPri ;
         GXv_decimal16[0] = A417EntPre ;
         GXv_int25[0] = 0 ;
         GXv_int21[0] = (byte)(0) ;
         GXv_char2[0] = " " ;
         GXv_int8[0] = A658PedCod ;
         GXv_char26[0] = A11Albaran ;
         GXv_char27[0] = AV36Usurcod ;
         GXv_char28[0] = httpContext.getMessage( "Entrada por Pedido", "") ;
         GXv_int19[0] = A597LinEnt ;
         GXv_decimal13[0] = AV21UniOld ;
         GXv_decimal29[0] = DecimalUtil.doubleToDec(0) ;
         GXv_date23[0] = A415EntFecEnt ;
         GXv_int30[0] = A6156EntPrvNum ;
         GXv_char31[0] = A5686EntLotN ;
         new app.pnewcc9(remoteHandle, context).execute( GXv_char24, GXv_char14, GXv_decimal22, GXv_decimal17, GXv_char4, GXv_char3, GXv_decimal16, GXv_int25, GXv_int21, GXv_char2, GXv_int8, GXv_char26, GXv_char27, GXv_char28, GXv_int19, GXv_decimal13, GXv_decimal29, GXv_date23, GXv_int30, GXv_char31) ;
         entradaproductoalmacen_trn_impl.this.A396EmprCod = GXv_char24[0] ;
         entradaproductoalmacen_trn_impl.this.A719PrdNum = GXv_char14[0] ;
         entradaproductoalmacen_trn_impl.this.A418EntUniEnt = GXv_decimal22[0] ;
         entradaproductoalmacen_trn_impl.this.AV24PedPri = GXv_char3[0] ;
         entradaproductoalmacen_trn_impl.this.A417EntPre = GXv_decimal16[0] ;
         entradaproductoalmacen_trn_impl.this.A658PedCod = GXv_int8[0] ;
         entradaproductoalmacen_trn_impl.this.A11Albaran = GXv_char26[0] ;
         entradaproductoalmacen_trn_impl.this.AV36Usurcod = GXv_char27[0] ;
         entradaproductoalmacen_trn_impl.this.A597LinEnt = GXv_int19[0] ;
         entradaproductoalmacen_trn_impl.this.AV21UniOld = GXv_decimal13[0] ;
         entradaproductoalmacen_trn_impl.this.A415EntFecEnt = GXv_date23[0] ;
         entradaproductoalmacen_trn_impl.this.A6156EntPrvNum = GXv_int30[0] ;
         entradaproductoalmacen_trn_impl.this.A5686EntLotN = GXv_char31[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         httpContext.ajax_rsp_assign_attri("", false, "A418EntUniEnt", GXutil.ltrimstr( A418EntUniEnt, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "AV24PedPri", AV24PedPri);
         httpContext.ajax_rsp_assign_attri("", false, "A417EntPre", GXutil.ltrimstr( A417EntPre, 14, 5));
         httpContext.ajax_rsp_assign_attri("", false, "A658PedCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A658PedCod), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A11Albaran", A11Albaran);
         httpContext.ajax_rsp_assign_attri("", false, "AV36Usurcod", AV36Usurcod);
         httpContext.ajax_rsp_assign_attri("", false, "A597LinEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A597LinEnt), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV21UniOld", GXutil.ltrimstr( AV21UniOld, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "A415EntFecEnt", localUtil.format(A415EntFecEnt, "99/99/99"));
         httpContext.ajax_rsp_assign_attri("", false, "A6156EntPrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6156EntPrvNum), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A5686EntLotN", A5686EntLotN);
      }
      if ( ( isIns( )  || isUpd( )  ) && true /* After */ && ( AV19Nalbaran20 == 1 ) )
      {
         GXv_char31[0] = A396EmprCod ;
         GXv_char28[0] = A719PrdNum ;
         GXv_decimal29[0] = A418EntUniEnt ;
         GXv_decimal22[0] = DecimalUtil.doubleToDec(0) ;
         GXv_char27[0] = httpContext.getMessage( "EN", "") ;
         GXv_char26[0] = AV24PedPri ;
         GXv_decimal17[0] = A417EntPre ;
         GXv_int30[0] = 0 ;
         GXv_int21[0] = (byte)(0) ;
         GXv_char24[0] = " " ;
         GXv_int25[0] = A658PedCod ;
         GXv_char14[0] = A11Albaran ;
         GXv_char4[0] = AV36Usurcod ;
         GXv_char3[0] = httpContext.getMessage( "Entrada por Pedido", "") ;
         GXv_int19[0] = A597LinEnt ;
         GXv_decimal16[0] = AV21UniOld ;
         GXv_decimal13[0] = DecimalUtil.doubleToDec(0) ;
         GXv_date23[0] = A415EntFecEnt ;
         GXv_int8[0] = A6156EntPrvNum ;
         GXv_char2[0] = A5686EntLotN ;
         GXv_char32[0] = A12857EntNAlbar ;
         new app.pccstk20(remoteHandle, context).execute( GXv_char31, GXv_char28, GXv_decimal29, GXv_decimal22, GXv_char27, GXv_char26, GXv_decimal17, GXv_int30, GXv_int21, GXv_char24, GXv_int25, GXv_char14, GXv_char4, GXv_char3, GXv_int19, GXv_decimal16, GXv_decimal13, GXv_date23, GXv_int8, GXv_char2, GXv_char32) ;
         entradaproductoalmacen_trn_impl.this.A396EmprCod = GXv_char31[0] ;
         entradaproductoalmacen_trn_impl.this.A719PrdNum = GXv_char28[0] ;
         entradaproductoalmacen_trn_impl.this.A418EntUniEnt = GXv_decimal29[0] ;
         entradaproductoalmacen_trn_impl.this.AV24PedPri = GXv_char26[0] ;
         entradaproductoalmacen_trn_impl.this.A417EntPre = GXv_decimal17[0] ;
         entradaproductoalmacen_trn_impl.this.A658PedCod = GXv_int25[0] ;
         entradaproductoalmacen_trn_impl.this.A11Albaran = GXv_char14[0] ;
         entradaproductoalmacen_trn_impl.this.AV36Usurcod = GXv_char4[0] ;
         entradaproductoalmacen_trn_impl.this.A597LinEnt = GXv_int19[0] ;
         entradaproductoalmacen_trn_impl.this.AV21UniOld = GXv_decimal16[0] ;
         entradaproductoalmacen_trn_impl.this.A415EntFecEnt = GXv_date23[0] ;
         entradaproductoalmacen_trn_impl.this.A6156EntPrvNum = GXv_int8[0] ;
         entradaproductoalmacen_trn_impl.this.A5686EntLotN = GXv_char2[0] ;
         entradaproductoalmacen_trn_impl.this.A12857EntNAlbar = GXv_char32[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         httpContext.ajax_rsp_assign_attri("", false, "A418EntUniEnt", GXutil.ltrimstr( A418EntUniEnt, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "AV24PedPri", AV24PedPri);
         httpContext.ajax_rsp_assign_attri("", false, "A417EntPre", GXutil.ltrimstr( A417EntPre, 14, 5));
         httpContext.ajax_rsp_assign_attri("", false, "A658PedCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A658PedCod), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A11Albaran", A11Albaran);
         httpContext.ajax_rsp_assign_attri("", false, "AV36Usurcod", AV36Usurcod);
         httpContext.ajax_rsp_assign_attri("", false, "A597LinEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A597LinEnt), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV21UniOld", GXutil.ltrimstr( AV21UniOld, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "A415EntFecEnt", localUtil.format(A415EntFecEnt, "99/99/99"));
         httpContext.ajax_rsp_assign_attri("", false, "A6156EntPrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6156EntPrvNum), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A5686EntLotN", A5686EntLotN);
         httpContext.ajax_rsp_assign_attri("", false, "A12857EntNAlbar", A12857EntNAlbar);
      }
   }

   public void beforeInsert1T642( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1T642( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1T642( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1T642( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1T642( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1T642( )
   {
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
      edtEntNEmb_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEntNEmb_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEntNEmb_Enabled), 5, 0), true);
      edtEntUniEnt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEntUniEnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEntUniEnt_Enabled), 5, 0), true);
      edtEntPre_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEntPre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEntPre_Enabled), 5, 0), true);
      edtEntUniRem_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEntUniRem_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEntUniRem_Enabled), 5, 0), true);
      edtEntLotN_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEntLotN_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEntLotN_Enabled), 5, 0), true);
      edtEntFVal_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEntFVal_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEntFVal_Enabled), 5, 0), true);
      edtPedCanEnt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPedCanEnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPedCanEnt_Enabled), 5, 0), true);
      edtPedUni_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPedUni_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPedUni_Enabled), 5, 0), true);
      edtPrdCanPen_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdCanPen_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdCanPen_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      edtEntPedCum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEntPedCum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEntPedCum_Enabled), 5, 0), true);
      edtEntCump_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEntCump_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEntCump_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashes1T642( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues1T60( )
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.entradaproductoalmacen_trn", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV7EmprCod)),GXutil.URLEncode(GXutil.rtrim(AV8PrdNum)),GXutil.URLEncode(GXutil.ltrimstr(AV9LinEnt,4,0))}, new String[] {"Gx_mode","EmprCod","PrdNum","LinEnt"}) +"\">") ;
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
      forbiddenHiddens.add("hshsalt", "hsh"+"EntradaProductoAlmacen_TRN");
      forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
      forbiddenHiddens.add("EntCon", localUtil.format( DecimalUtil.doubleToDec(A411EntCon), "9"));
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV46Pgmname, "")));
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
      GXutil.writeLogInfo("entradaproductoalmacen_trn:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z419EntUniRem", GXutil.ltrim( localUtil.ntoc( Z419EntUniRem, (byte)(11), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z417EntPre", GXutil.ltrim( localUtil.ntoc( Z417EntPre, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3404EntPedCum", GXutil.rtrim( Z3404EntPedCum));
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z14035EntNEmb", GXutil.ltrim( localUtil.ntoc( Z14035EntNEmb, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z658PedCod", GXutil.ltrim( localUtil.ntoc( Z658PedCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z726PrdPreMed", GXutil.ltrim( localUtil.ntoc( Z726PrdPreMed, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z713PrdFulEnt", localUtil.dtoc( Z713PrdFulEnt, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z709PrdFecPre", localUtil.dtoc( Z709PrdFecPre, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z725PrdPreAnt", GXutil.ltrim( localUtil.ntoc( Z725PrdPreAnt, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z724PrdPreAct", GXutil.ltrim( localUtil.ntoc( Z724PrdPreAct, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z684PrdCanPen", GXutil.ltrim( localUtil.ntoc( Z684PrdCanPen, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z718PrdNom", GXutil.rtrim( Z718PrdNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z698PrdDetPar", GXutil.rtrim( Z698PrdDetPar));
      app.GxWebStd.gx_hidden_field( httpContext, "Z729PrdRotRea", GXutil.ltrim( localUtil.ntoc( Z729PrdRotRea, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z727PrdRec", GXutil.rtrim( Z727PrdRec));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5255PrdPreAc2", GXutil.ltrim( localUtil.ntoc( Z5255PrdPreAc2, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z705PrdExiCC", GXutil.ltrim( localUtil.ntoc( Z705PrdExiCC, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z795PrvNum", GXutil.ltrim( localUtil.ntoc( Z795PrvNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z856ValCod", GXutil.ltrim( localUtil.ntoc( Z856ValCod, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z663PedFulEnt", localUtil.dtoc( Z663PedFulEnt, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z665PedPre", GXutil.ltrim( localUtil.ntoc( Z665PedPre, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z669PedUni", GXutil.ltrim( localUtil.ntoc( Z669PedUni, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z659PedCum", GXutil.rtrim( Z659PedCum));
      app.GxWebStd.gx_hidden_field( httpContext, "Z660PedDto", GXutil.ltrim( localUtil.ntoc( Z660PedDto, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O3404EntPedCum", GXutil.rtrim( O3404EntPedCum));
      app.GxWebStd.gx_hidden_field( httpContext, "O419EntUniRem", GXutil.ltrim( localUtil.ntoc( O419EntUniRem, (byte)(11), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O418EntUniEnt", GXutil.ltrim( localUtil.ntoc( O418EntUniEnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O724PrdPreAct", GXutil.ltrim( localUtil.ntoc( O724PrdPreAct, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O750PrdValStk", GXutil.ltrim( localUtil.ntoc( O750PrdValStk, (byte)(11), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O657PedCanEnt", GXutil.ltrim( localUtil.ntoc( O657PedCanEnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O415EntFecEnt", localUtil.dtoc( O415EntFecEnt, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "O417EntPre", GXutil.ltrim( localUtil.ntoc( O417EntPre, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O5686EntLotN", GXutil.rtrim( O5686EntLotN));
      app.GxWebStd.gx_hidden_field( httpContext, "O704PrdExiAlm", GXutil.ltrim( localUtil.ntoc( O704PrdExiAlm, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O847UltLinEnt", GXutil.ltrim( localUtil.ntoc( O847UltLinEnt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_Mode", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "N658PedCod", GXutil.ltrim( localUtil.ntoc( A658PedCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "N3404EntPedCum", GXutil.rtrim( A3404EntPedCum));
      app.GxWebStd.gx_hidden_field( httpContext, "N415EntFecEnt", localUtil.dtoc( A415EntFecEnt, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "N11Albaran", GXutil.rtrim( A11Albaran));
      app.GxWebStd.gx_hidden_field( httpContext, "N12857EntNAlbar", GXutil.rtrim( A12857EntNAlbar));
      app.GxWebStd.gx_hidden_field( httpContext, "N6156EntPrvNum", GXutil.ltrim( localUtil.ntoc( A6156EntPrvNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "N418EntUniEnt", GXutil.ltrim( localUtil.ntoc( A418EntUniEnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "N5686EntLotN", GXutil.rtrim( A5686EntLotN));
      app.GxWebStd.gx_hidden_field( httpContext, "N417EntPre", GXutil.ltrim( localUtil.ntoc( A417EntPre, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "N5685EntFVal", localUtil.dtoc( A5685EntFVal, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMODA21", GXutil.ltrim( localUtil.ntoc( AV44moda21, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODA21", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV44moda21), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDNUM", GXutil.rtrim( A719PrdNum));
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
      app.GxWebStd.gx_hidden_field( httpContext, "PRDEXIALM", GXutil.ltrim( localUtil.ntoc( A704PrdExiAlm, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ENTCON", GXutil.ltrim( localUtil.ntoc( A411EntCon, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vYEAR", GXutil.ltrim( localUtil.ntoc( AV22Year, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMES", GXutil.ltrim( localUtil.ntoc( AV23Mes, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PRVPRI", GXutil.ltrim( localUtil.ntoc( A800PrvPri, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PEDPRI", GXutil.rtrim( A666PedPri));
      app.GxWebStd.gx_hidden_field( httpContext, "vPEDPRI", GXutil.rtrim( AV24PedPri));
      app.GxWebStd.gx_hidden_field( httpContext, "vOLDENTPRE", GXutil.ltrim( localUtil.ntoc( AV30OldEntPre, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vOLDEXIALM", GXutil.ltrim( localUtil.ntoc( AV31OldExiAlm, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vOLDENTUNI", GXutil.ltrim( localUtil.ntoc( AV32OldEntUni, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vOLDREMANENTE", GXutil.ltrim( localUtil.ntoc( AV33OldRemanente, (byte)(11), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vOLDENTFECENT", localUtil.dtoc( AV34oldEntFecent, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "vOLDLOTE", GXutil.rtrim( AV35oldlote));
      app.GxWebStd.gx_hidden_field( httpContext, "vUNIOLD", GXutil.ltrim( localUtil.ntoc( AV21UniOld, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vFECANT", localUtil.dtoc( AV20FecAnt, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "vPRECANT", GXutil.ltrim( localUtil.ntoc( AV27PrecAnt, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vANYANT", GXutil.ltrim( localUtil.ntoc( AV25AnyAnt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMESANT", GXutil.ltrim( localUtil.ntoc( AV26MesAnt, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PEDFULENT", localUtil.dtoc( A663PedFulEnt, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDVALSTK", GXutil.ltrim( localUtil.ntoc( A750PrdValStk, (byte)(11), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vCONSUMOS", GXutil.ltrim( localUtil.ntoc( AV40Consumos, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDEXICC", GXutil.ltrim( localUtil.ntoc( A705PrdExiCC, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDPREMED", GXutil.ltrim( localUtil.ntoc( A726PrdPreMed, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vNOUPD", GXutil.ltrim( localUtil.ntoc( AV39NoUpd, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDFULENT", localUtil.dtoc( A713PrdFulEnt, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDFECPRE", localUtil.dtoc( A709PrdFecPre, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDPREACT", GXutil.ltrim( localUtil.ntoc( A724PrdPreAct, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDPREANT", GXutil.ltrim( localUtil.ntoc( A725PrdPreAnt, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PEDPRE", GXutil.ltrim( localUtil.ntoc( A665PedPre, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PEDDTO", GXutil.ltrim( localUtil.ntoc( A660PedDto, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vPRDNOMX", GXutil.rtrim( AV18PrdNomX));
      app.GxWebStd.gx_hidden_field( httpContext, "vMSG_CTRL_FECHA", AV15msg_ctrl_fecha);
      app.GxWebStd.gx_hidden_field( httpContext, "ENTFABID", GXutil.ltrim( localUtil.ntoc( A12716EntFabId, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PRVNUM", GXutil.ltrim( localUtil.ntoc( A795PrvNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ENTREMTPO", GXutil.rtrim( A10184EntRemTpo));
      app.GxWebStd.gx_hidden_field( httpContext, "vFECHA", localUtil.dtoc( AV28Fecha, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "vINC_OBS", AV17Inc_obs);
      app.GxWebStd.gx_hidden_field( httpContext, "vDIASFIN", GXutil.ltrim( localUtil.ntoc( AV29DiasFin, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PEDNUMLIN", GXutil.ltrim( localUtil.ntoc( A664PedNumLin, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDNOM", GXutil.rtrim( A718PrdNom));
      app.GxWebStd.gx_hidden_field( httpContext, "vNALBARAN20", GXutil.ltrim( localUtil.ntoc( AV19Nalbaran20, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vUSURCOD", GXutil.rtrim( AV36Usurcod));
      app.GxWebStd.gx_hidden_field( httpContext, "vSTATION", GXutil.rtrim( AV37Station));
      app.GxWebStd.gx_hidden_field( httpContext, "vFLAGPRE", GXutil.ltrim( localUtil.ntoc( AV16FlagPre, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTODAY", localUtil.dtoc( Gx_date, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "vFLAGFECCCS", GXutil.ltrim( localUtil.ntoc( AV41FlagFecCcs, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      app.GxWebStd.gx_hidden_field( httpContext, "PRDDETPAR", GXutil.rtrim( A698PrdDetPar));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDROTREA", GXutil.ltrim( localUtil.ntoc( A729PrdRotRea, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDREC", GXutil.rtrim( A727PrdRec));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDPREAC2", GXutil.ltrim( localUtil.ntoc( A5255PrdPreAc2, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "VALCOD", GXutil.ltrim( localUtil.ntoc( A856ValCod, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PEDFEC", localUtil.dtoc( A661PedFec, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "PEDSIT", GXutil.rtrim( A667PedSit));
      app.GxWebStd.gx_hidden_field( httpContext, "PEDALMC", GXutil.ltrim( localUtil.ntoc( A12580PedAlmc, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE1_Objectcall", GXutil.rtrim( Dvpanel_unnamedtable1_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE1_Enabled", GXutil.booltostr( Dvpanel_unnamedtable1_Enabled));
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
      return formatLink("app.entradaproductoalmacen_trn", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV7EmprCod)),GXutil.URLEncode(GXutil.rtrim(AV8PrdNum)),GXutil.URLEncode(GXutil.ltrimstr(AV9LinEnt,4,0))}, new String[] {"Gx_mode","EmprCod","PrdNum","LinEnt"})  ;
   }

   public String getPgmname( )
   {
      return "EntradaProductoAlmacen_TRN" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Entrada Producto Almacen", "") ;
   }

   public void initializeNonKey1T642( )
   {
      A658PedCod = 0 ;
      n658PedCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A658PedCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A658PedCod), 8, 0));
      AV22Year = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV22Year", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV22Year), 4, 0));
      AV23Mes = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV23Mes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV23Mes), 2, 0));
      AV24PedPri = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV24PedPri", AV24PedPri);
      AV30OldEntPre = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV30OldEntPre", GXutil.ltrimstr( AV30OldEntPre, 14, 5));
      AV31OldExiAlm = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV31OldExiAlm", GXutil.ltrimstr( AV31OldExiAlm, 12, 4));
      AV32OldEntUni = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32OldEntUni", GXutil.ltrimstr( AV32OldEntUni, 9, 2));
      AV33OldRemanente = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV33OldRemanente", GXutil.ltrimstr( AV33OldRemanente, 11, 4));
      AV34oldEntFecent = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV34oldEntFecent", localUtil.format(AV34oldEntFecent, "99/99/99"));
      AV35oldlote = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV35oldlote", AV35oldlote);
      AV21UniOld = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21UniOld", GXutil.ltrimstr( AV21UniOld, 9, 2));
      AV20FecAnt = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20FecAnt", localUtil.format(AV20FecAnt, "99/99/99"));
      AV27PrecAnt = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV27PrecAnt", GXutil.ltrimstr( AV27PrecAnt, 14, 5));
      AV25AnyAnt = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV25AnyAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV25AnyAnt), 4, 0));
      AV26MesAnt = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV26MesAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV26MesAnt), 2, 0));
      A657PedCanEnt = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A657PedCanEnt", GXutil.ltrimstr( A657PedCanEnt, 9, 2));
      A663PedFulEnt = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "A663PedFulEnt", localUtil.format(A663PedFulEnt, "99/99/99"));
      A419EntUniRem = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A419EntUniRem", GXutil.ltrimstr( A419EntUniRem, 11, 4));
      A417EntPre = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A417EntPre", GXutil.ltrimstr( A417EntPre, 14, 5));
      A3404EntPedCum = httpContext.getMessage( "N", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "A3404EntPedCum", A3404EntPedCum);
      AV18PrdNomX = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18PrdNomX", AV18PrdNomX);
      AV15msg_ctrl_fecha = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15msg_ctrl_fecha", AV15msg_ctrl_fecha);
      A664PedNumLin = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A664PedNumLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A664PedNumLin), 3, 0));
      A14041EntCump = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A14041EntCump", A14041EntCump);
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
      httpContext.ajax_rsp_assign_attri("", false, "A14035EntNEmb", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14035EntNEmb), 2, 0));
      AV28Fecha = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV28Fecha", localUtil.format(AV28Fecha, "99/99/99"));
      AV17Inc_obs = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17Inc_obs", AV17Inc_obs);
      AV29DiasFin = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV29DiasFin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29DiasFin), 3, 0));
      A415EntFecEnt = GXutil.today( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "A415EntFecEnt", localUtil.format(A415EntFecEnt, "99/99/99"));
      A6156EntPrvNum = 0 ;
      n6156EntPrvNum = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6156EntPrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6156EntPrvNum), 6, 0));
      A10184EntRemTpo = " " ;
      httpContext.ajax_rsp_assign_attri("", false, "A10184EntRemTpo", A10184EntRemTpo);
      A12716EntFabId = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A12716EntFabId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12716EntFabId), 6, 0));
      O3404EntPedCum = A3404EntPedCum ;
      httpContext.ajax_rsp_assign_attri("", false, "A3404EntPedCum", A3404EntPedCum);
      O419EntUniRem = A419EntUniRem ;
      httpContext.ajax_rsp_assign_attri("", false, "A419EntUniRem", GXutil.ltrimstr( A419EntUniRem, 11, 4));
      O418EntUniEnt = A418EntUniEnt ;
      httpContext.ajax_rsp_assign_attri("", false, "A418EntUniEnt", GXutil.ltrimstr( A418EntUniEnt, 9, 2));
      O724PrdPreAct = A724PrdPreAct ;
      httpContext.ajax_rsp_assign_attri("", false, "A724PrdPreAct", GXutil.ltrimstr( A724PrdPreAct, 14, 5));
      O750PrdValStk = A750PrdValStk ;
      httpContext.ajax_rsp_assign_attri("", false, "A750PrdValStk", GXutil.ltrimstr( A750PrdValStk, 11, 2));
      O657PedCanEnt = A657PedCanEnt ;
      httpContext.ajax_rsp_assign_attri("", false, "A657PedCanEnt", GXutil.ltrimstr( A657PedCanEnt, 9, 2));
      O415EntFecEnt = A415EntFecEnt ;
      httpContext.ajax_rsp_assign_attri("", false, "A415EntFecEnt", localUtil.format(A415EntFecEnt, "99/99/99"));
      O417EntPre = A417EntPre ;
      httpContext.ajax_rsp_assign_attri("", false, "A417EntPre", GXutil.ltrimstr( A417EntPre, 14, 5));
      O5686EntLotN = A5686EntLotN ;
      httpContext.ajax_rsp_assign_attri("", false, "A5686EntLotN", A5686EntLotN);
      O704PrdExiAlm = A704PrdExiAlm ;
      httpContext.ajax_rsp_assign_attri("", false, "A704PrdExiAlm", GXutil.ltrimstr( A704PrdExiAlm, 12, 4));
      O847UltLinEnt = A847UltLinEnt ;
      httpContext.ajax_rsp_assign_attri("", false, "A847UltLinEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A847UltLinEnt), 4, 0));
      Z411EntCon = (byte)(0) ;
      Z419EntUniRem = DecimalUtil.ZERO ;
      Z417EntPre = DecimalUtil.ZERO ;
      Z3404EntPedCum = "" ;
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
      Z14035EntNEmb = (byte)(0) ;
      Z658PedCod = 0 ;
      Z726PrdPreMed = DecimalUtil.ZERO ;
      Z713PrdFulEnt = GXutil.nullDate() ;
      Z709PrdFecPre = GXutil.nullDate() ;
      Z725PrdPreAnt = DecimalUtil.ZERO ;
      Z724PrdPreAct = DecimalUtil.ZERO ;
      Z684PrdCanPen = DecimalUtil.ZERO ;
      Z718PrdNom = "" ;
      Z698PrdDetPar = "" ;
      Z729PrdRotRea = DecimalUtil.ZERO ;
      Z727PrdRec = "" ;
      Z5255PrdPreAc2 = DecimalUtil.ZERO ;
      Z705PrdExiCC = DecimalUtil.ZERO ;
      Z795PrvNum = 0 ;
      Z856ValCod = (byte)(0) ;
      Z663PedFulEnt = GXutil.nullDate() ;
      Z665PedPre = DecimalUtil.ZERO ;
      Z669PedUni = DecimalUtil.ZERO ;
      Z659PedCum = "" ;
      Z660PedDto = DecimalUtil.ZERO ;
   }

   public void initAll1T642( )
   {
      A396EmprCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A719PrdNum = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
      A597LinEnt = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A597LinEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A597LinEnt), 4, 0));
      initializeNonKey1T642( ) ;
   }

   public void standaloneModalInsert( )
   {
      A411EntCon = i411EntCon ;
      httpContext.ajax_rsp_assign_attri("", false, "A411EntCon", GXutil.str( A411EntCon, 1, 0));
      A847UltLinEnt = i847UltLinEnt ;
      httpContext.ajax_rsp_assign_attri("", false, "A847UltLinEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A847UltLinEnt), 4, 0));
      A6156EntPrvNum = i6156EntPrvNum ;
      n6156EntPrvNum = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6156EntPrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6156EntPrvNum), 6, 0));
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682116101221", true, true);
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
      httpContext.AddJavascriptSource("entradaproductoalmacen_trn.js", "?202682116101221", false, true);
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
      edtLinEnt_Internalname = "LINENT" ;
      edtEntFecEnt_Internalname = "ENTFECENT" ;
      edtAlbaran_Internalname = "ALBARAN" ;
      edtEntNAlbar_Internalname = "ENTNALBAR" ;
      divEntnalbar_cell_Internalname = "ENTNALBAR_CELL" ;
      lblTextblockpedcod_Internalname = "TEXTBLOCKPEDCOD" ;
      edtPedCod_Internalname = "PEDCOD" ;
      imgavPromptpedido_Internalname = "vPROMPTPEDIDO" ;
      tblTablemergedpedcod_Internalname = "TABLEMERGEDPEDCOD" ;
      divTablesplittedpedcod_Internalname = "TABLESPLITTEDPEDCOD" ;
      edtEntPrvNum_Internalname = "ENTPRVNUM" ;
      divUnnamedtable3_Internalname = "UNNAMEDTABLE3" ;
      edtEntNEmb_Internalname = "ENTNEMB" ;
      divEntnemb_cell_Internalname = "ENTNEMB_CELL" ;
      edtEntUniEnt_Internalname = "ENTUNIENT" ;
      edtEntPre_Internalname = "ENTPRE" ;
      edtEntUniRem_Internalname = "ENTUNIREM" ;
      edtEntLotN_Internalname = "ENTLOTN" ;
      edtEntFVal_Internalname = "ENTFVAL" ;
      divUnnamedtable4_Internalname = "UNNAMEDTABLE4" ;
      divTableattributes_Internalname = "TABLEATTRIBUTES" ;
      Dvpanel_tableattributes_Internalname = "DVPANEL_TABLEATTRIBUTES" ;
      edtPedCanEnt_Internalname = "PEDCANENT" ;
      edtPedUni_Internalname = "PEDUNI" ;
      edtPrdCanPen_Internalname = "PRDCANPEN" ;
      divUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      Dvpanel_unnamedtable1_Internalname = "DVPANEL_UNNAMEDTABLE1" ;
      divDvpanel_unnamedtable1_cell_Internalname = "DVPANEL_UNNAMEDTABLE1_CELL" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      bttBtntrn_enter_Internalname = "BTNTRN_ENTER" ;
      bttBtntrn_cancel_Internalname = "BTNTRN_CANCEL" ;
      bttBtntrn_delete_Internalname = "BTNTRN_DELETE" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      edtEntPedCum_Internalname = "ENTPEDCUM" ;
      edtEntCump_Internalname = "ENTCUMP" ;
      divHtml_bottomauxiliarcontrols_Internalname = "HTML_BOTTOMAUXILIARCONTROLS" ;
      divLayoutmaintable_Internalname = "LAYOUTMAINTABLE" ;
      Form.setInternalname( "FORM" );
      imgprompt_6156_Internalname = "PROMPT_6156" ;
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
      Form.setCaption( httpContext.getMessage( "Entrada Producto Almacen", "") );
      edtEntCump_Jsonclick = "" ;
      edtEntCump_Enabled = 0 ;
      edtEntCump_Visible = 1 ;
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
      edtPrdCanPen_Jsonclick = "" ;
      edtPrdCanPen_Enabled = 0 ;
      edtPedUni_Jsonclick = "" ;
      edtPedUni_Enabled = 0 ;
      edtPedCanEnt_Jsonclick = "" ;
      edtPedCanEnt_Enabled = 0 ;
      Dvpanel_unnamedtable1_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Iconposition = "Right" ;
      Dvpanel_unnamedtable1_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Collapsed = GXutil.toBoolean( 1) ;
      Dvpanel_unnamedtable1_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable1_Title = httpContext.getMessage( "Items Control", "") ;
      Dvpanel_unnamedtable1_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable1_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable1_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Width = "100%" ;
      divDvpanel_unnamedtable1_cell_Class = "col-xs-12" ;
      edtEntFVal_Jsonclick = "" ;
      edtEntFVal_Enabled = 1 ;
      edtEntLotN_Jsonclick = "" ;
      edtEntLotN_Enabled = 1 ;
      edtEntUniRem_Jsonclick = "" ;
      edtEntUniRem_Enabled = 0 ;
      edtEntPre_Jsonclick = "" ;
      edtEntPre_Enabled = 1 ;
      edtEntUniEnt_Jsonclick = "" ;
      edtEntUniEnt_Enabled = 1 ;
      edtEntNEmb_Jsonclick = "" ;
      edtEntNEmb_Enabled = 1 ;
      edtEntNEmb_Visible = 1 ;
      divEntnemb_cell_Class = "col-xs-12 col-sm-1" ;
      imgprompt_6156_Visible = 1 ;
      imgprompt_6156_Link = "" ;
      edtEntPrvNum_Jsonclick = "" ;
      edtEntPrvNum_Enabled = 1 ;
      imgavPromptpedido_gximage = "" ;
      imgavPromptpedido_Enabled = 1 ;
      imgavPromptpedido_Link = "" ;
      imgavPromptpedido_Visible = 1 ;
      edtPedCod_Jsonclick = "" ;
      edtPedCod_Enabled = 1 ;
      edtEntNAlbar_Jsonclick = "" ;
      edtEntNAlbar_Enabled = 1 ;
      edtEntNAlbar_Visible = 1 ;
      divEntnalbar_cell_Class = "col-xs-12 col-sm-1" ;
      edtAlbaran_Jsonclick = "" ;
      edtAlbaran_Enabled = 1 ;
      edtEntFecEnt_Jsonclick = "" ;
      edtEntFecEnt_Enabled = 1 ;
      edtLinEnt_Jsonclick = "" ;
      edtLinEnt_Enabled = 1 ;
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

   public void gx4asaprdultmovf1T642( String A396EmprCod ,
                                      String A719PrdNum )
   {
      GXt_date10 = A14040PrdUltMovF ;
      GXv_char32[0] = A396EmprCod ;
      GXv_char31[0] = A719PrdNum ;
      GXv_date23[0] = GXt_date10 ;
      new app.pstm005(remoteHandle, context).execute( GXv_char32, GXv_char31, GXv_date23) ;
      entradaproductoalmacen_trn_impl.this.A396EmprCod = GXv_char32[0] ;
      entradaproductoalmacen_trn_impl.this.A719PrdNum = GXv_char31[0] ;
      entradaproductoalmacen_trn_impl.this.GXt_date10 = GXv_date23[0] ;
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

   public void gx5asaultfecccs1T642( String A396EmprCod ,
                                     String A719PrdNum )
   {
      GXt_date10 = A3835UltFecCCs ;
      GXv_char32[0] = A396EmprCod ;
      GXv_char31[0] = A719PrdNum ;
      GXv_date23[0] = GXt_date10 ;
      new app.pstm005(remoteHandle, context).execute( GXv_char32, GXv_char31, GXv_date23) ;
      entradaproductoalmacen_trn_impl.this.A396EmprCod = GXv_char32[0] ;
      entradaproductoalmacen_trn_impl.this.A719PrdNum = GXv_char31[0] ;
      entradaproductoalmacen_trn_impl.this.GXt_date10 = GXv_date23[0] ;
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

   public void gxasa140351T642( String AV7EmprCod )
   {
      GXt_int5 = (byte)(0) ;
      GXv_int21[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV7EmprCod, httpContext.getMessage( httpContext.getMessage( "MODA21", ""), ""), GXv_int21) ;
      entradaproductoalmacen_trn_impl.this.GXt_int5 = GXv_int21[0] ;
      edtEntNEmb_Visible = ((GXt_int5==1) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtEntNEmb_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEntNEmb_Visible), 5, 0), true);
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

   public void gxasa128571T642( String AV7EmprCod )
   {
      GXt_int5 = (byte)(0) ;
      GXv_int21[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV7EmprCod, httpContext.getMessage( httpContext.getMessage( "ALBA20", ""), ""), GXv_int21) ;
      entradaproductoalmacen_trn_impl.this.GXt_int5 = GXv_int21[0] ;
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

   public void gx45asaentpre1T642( java.math.BigDecimal A665PedPre ,
                                   java.math.BigDecimal A660PedDto ,
                                   int A658PedCod ,
                                   String A396EmprCod ,
                                   String A719PrdNum ,
                                   int A6156EntPrvNum )
   {
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
         else
         {
            if ( isIns( )  && (0==A658PedCod) )
            {
               GXt_decimal12 = A417EntPre ;
               GXv_decimal29[0] = GXt_decimal12 ;
               new app.comprasquimicos.precioproveedor(remoteHandle, context).execute( A396EmprCod, A719PrdNum, A6156EntPrvNum, GXv_decimal29) ;
               entradaproductoalmacen_trn_impl.this.GXt_decimal12 = GXv_decimal29[0] ;
               A417EntPre = GXt_decimal12 ;
               httpContext.ajax_rsp_assign_attri("", false, "A417EntPre", GXutil.ltrimstr( A417EntPre, 14, 5));
            }
         }
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A417EntPre, (byte)(14), (byte)(5), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void gx57asaprdnomx1T642( String A396EmprCod ,
                                    int A6156EntPrvNum )
   {
      if ( true /* After */ )
      {
         GXt_char1 = AV18PrdNomX ;
         GXv_char32[0] = A396EmprCod ;
         GXv_int30[0] = A6156EntPrvNum ;
         GXv_char31[0] = GXt_char1 ;
         new app.pctrprv(remoteHandle, context).execute( GXv_char32, GXv_int30, GXv_char31) ;
         entradaproductoalmacen_trn_impl.this.A396EmprCod = GXv_char32[0] ;
         entradaproductoalmacen_trn_impl.this.A6156EntPrvNum = GXv_int30[0] ;
         entradaproductoalmacen_trn_impl.this.GXt_char1 = GXv_char31[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A6156EntPrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6156EntPrvNum), 6, 0));
         AV18PrdNomX = GXt_char1 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV18PrdNomX", AV18PrdNomX);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( AV18PrdNomX))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void gx67asapednumlin1T642( String A396EmprCod ,
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

   public void xc_74_1T642( )
   {
      if ( ! (0==A658PedCod) && ( true /* After */ || true /* After */ ) )
      {
         GXv_char32[0] = A396EmprCod ;
         GXv_int30[0] = A658PedCod ;
         GXv_char31[0] = A719PrdNum ;
         GXv_char28[0] = httpContext.getMessage( "INS", "") ;
         GXv_char27[0] = A3404EntPedCum ;
         new app.ppedcum2(remoteHandle, context).execute( GXv_char32, GXv_int30, GXv_char31, GXv_char28, GXv_char27) ;
         A396EmprCod = GXv_char32[0] ;
         A658PedCod = GXv_int30[0] ;
         A719PrdNum = GXv_char31[0] ;
         A3404EntPedCum = GXv_char27[0] ;
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

   public void xc_75_1T642( )
   {
      if ( ! (0==A658PedCod) && true /* After */ )
      {
         GXv_char32[0] = A396EmprCod ;
         GXv_int30[0] = A658PedCod ;
         GXv_char31[0] = A719PrdNum ;
         GXv_char28[0] = httpContext.getMessage( "DEL", "") ;
         GXv_char27[0] = A3404EntPedCum ;
         new app.ppedcum2(remoteHandle, context).execute( GXv_char32, GXv_int30, GXv_char31, GXv_char28, GXv_char27) ;
         A396EmprCod = GXv_char32[0] ;
         A658PedCod = GXv_int30[0] ;
         A719PrdNum = GXv_char31[0] ;
         A3404EntPedCum = GXv_char27[0] ;
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

   public void xc_86_1T642( )
   {
      if ( isIns( )  && true /* After */ )
      {
         GXv_char32[0] = A396EmprCod ;
         GXv_int30[0] = A6156EntPrvNum ;
         GXv_int19[0] = AV22Year ;
         GXv_int21[0] = AV23Mes ;
         GXv_decimal29[0] = A418EntUniEnt ;
         GXv_decimal22[0] = AV21UniOld ;
         GXv_decimal17[0] = A417EntPre ;
         GXv_char31[0] = AV24PedPri ;
         GXv_int18[0] = AV22Year ;
         GXv_int15[0] = AV25AnyAnt ;
         GXv_int20[0] = AV23Mes ;
         GXv_int6[0] = AV26MesAnt ;
         GXv_decimal16[0] = AV27PrecAnt ;
         GXv_date23[0] = A415EntFecEnt ;
         GXv_date11[0] = AV20FecAnt ;
         GXv_char28[0] = httpContext.getMessage( "INS", "") ;
         new app.pprdes2(remoteHandle, context).execute( GXv_char32, GXv_int30, GXv_int19, GXv_int21, GXv_decimal29, GXv_decimal22, GXv_decimal17, GXv_char31, GXv_int18, GXv_int15, GXv_int20, GXv_int6, GXv_decimal16, GXv_date23, GXv_date11, GXv_char28) ;
         A396EmprCod = GXv_char32[0] ;
         A6156EntPrvNum = GXv_int30[0] ;
         AV22Year = GXv_int19[0] ;
         AV23Mes = GXv_int21[0] ;
         A418EntUniEnt = GXv_decimal29[0] ;
         AV21UniOld = GXv_decimal22[0] ;
         A417EntPre = GXv_decimal17[0] ;
         AV24PedPri = GXv_char31[0] ;
         AV22Year = GXv_int18[0] ;
         AV25AnyAnt = GXv_int15[0] ;
         AV23Mes = GXv_int20[0] ;
         AV26MesAnt = GXv_int6[0] ;
         AV27PrecAnt = GXv_decimal16[0] ;
         A415EntFecEnt = GXv_date23[0] ;
         AV20FecAnt = GXv_date11[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A6156EntPrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6156EntPrvNum), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV22Year", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV22Year), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV23Mes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV23Mes), 2, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A418EntUniEnt", GXutil.ltrimstr( A418EntUniEnt, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "AV21UniOld", GXutil.ltrimstr( AV21UniOld, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "A417EntPre", GXutil.ltrimstr( A417EntPre, 14, 5));
         httpContext.ajax_rsp_assign_attri("", false, "AV24PedPri", AV24PedPri);
         httpContext.ajax_rsp_assign_attri("", false, "AV22Year", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV22Year), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV25AnyAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV25AnyAnt), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV23Mes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV23Mes), 2, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV26MesAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV26MesAnt), 2, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV27PrecAnt", GXutil.ltrimstr( AV27PrecAnt, 14, 5));
         httpContext.ajax_rsp_assign_attri("", false, "A415EntFecEnt", localUtil.format(A415EntFecEnt, "99/99/99"));
         httpContext.ajax_rsp_assign_attri("", false, "AV20FecAnt", localUtil.format(AV20FecAnt, "99/99/99"));
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

   public void xc_87_1T642( )
   {
      if ( ( ( ( DecimalUtil.compareTo(A418EntUniEnt, AV21UniOld) != 0 ) ) || ( !( GXutil.dateCompare(GXutil.resetTime(A415EntFecEnt), GXutil.resetTime(AV20FecAnt)) ) ) || ( ( DecimalUtil.compareTo(A417EntPre, AV27PrecAnt) != 0 ) ) ) && isUpd( )  && true /* After */ )
      {
         GXv_char32[0] = A396EmprCod ;
         GXv_int30[0] = A6156EntPrvNum ;
         GXv_int19[0] = AV22Year ;
         GXv_int21[0] = AV23Mes ;
         GXv_decimal29[0] = A418EntUniEnt ;
         GXv_decimal22[0] = AV21UniOld ;
         GXv_decimal17[0] = A417EntPre ;
         GXv_char31[0] = AV24PedPri ;
         GXv_int18[0] = AV22Year ;
         GXv_int15[0] = AV25AnyAnt ;
         GXv_int20[0] = AV23Mes ;
         GXv_int6[0] = AV26MesAnt ;
         GXv_decimal16[0] = AV27PrecAnt ;
         GXv_date23[0] = A415EntFecEnt ;
         GXv_date11[0] = AV20FecAnt ;
         GXv_char28[0] = httpContext.getMessage( "UPD", "") ;
         new app.pprdes2(remoteHandle, context).execute( GXv_char32, GXv_int30, GXv_int19, GXv_int21, GXv_decimal29, GXv_decimal22, GXv_decimal17, GXv_char31, GXv_int18, GXv_int15, GXv_int20, GXv_int6, GXv_decimal16, GXv_date23, GXv_date11, GXv_char28) ;
         A396EmprCod = GXv_char32[0] ;
         A6156EntPrvNum = GXv_int30[0] ;
         AV22Year = GXv_int19[0] ;
         AV23Mes = GXv_int21[0] ;
         A418EntUniEnt = GXv_decimal29[0] ;
         AV21UniOld = GXv_decimal22[0] ;
         A417EntPre = GXv_decimal17[0] ;
         AV24PedPri = GXv_char31[0] ;
         AV22Year = GXv_int18[0] ;
         AV25AnyAnt = GXv_int15[0] ;
         AV23Mes = GXv_int20[0] ;
         AV26MesAnt = GXv_int6[0] ;
         AV27PrecAnt = GXv_decimal16[0] ;
         A415EntFecEnt = GXv_date23[0] ;
         AV20FecAnt = GXv_date11[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A6156EntPrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6156EntPrvNum), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV22Year", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV22Year), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV23Mes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV23Mes), 2, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A418EntUniEnt", GXutil.ltrimstr( A418EntUniEnt, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "AV21UniOld", GXutil.ltrimstr( AV21UniOld, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "A417EntPre", GXutil.ltrimstr( A417EntPre, 14, 5));
         httpContext.ajax_rsp_assign_attri("", false, "AV24PedPri", AV24PedPri);
         httpContext.ajax_rsp_assign_attri("", false, "AV22Year", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV22Year), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV25AnyAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV25AnyAnt), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV23Mes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV23Mes), 2, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV26MesAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV26MesAnt), 2, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV27PrecAnt", GXutil.ltrimstr( AV27PrecAnt, 14, 5));
         httpContext.ajax_rsp_assign_attri("", false, "A415EntFecEnt", localUtil.format(A415EntFecEnt, "99/99/99"));
         httpContext.ajax_rsp_assign_attri("", false, "AV20FecAnt", localUtil.format(AV20FecAnt, "99/99/99"));
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

   public void xc_88_1T642( )
   {
      if ( isIns( )  && true /* After */ )
      {
         GXv_char32[0] = A396EmprCod ;
         GXv_int30[0] = A6156EntPrvNum ;
         GXv_char31[0] = A719PrdNum ;
         GXv_char28[0] = A718PrdNom ;
         GXv_int19[0] = AV22Year ;
         GXv_int21[0] = AV23Mes ;
         GXv_decimal29[0] = A418EntUniEnt ;
         GXv_decimal22[0] = AV21UniOld ;
         GXv_decimal17[0] = A417EntPre ;
         GXv_char27[0] = AV24PedPri ;
         GXv_int18[0] = AV22Year ;
         GXv_int15[0] = AV25AnyAnt ;
         GXv_int20[0] = AV23Mes ;
         GXv_int6[0] = AV26MesAnt ;
         GXv_decimal16[0] = AV27PrecAnt ;
         GXv_date23[0] = A415EntFecEnt ;
         GXv_date11[0] = AV20FecAnt ;
         GXv_char26[0] = httpContext.getMessage( "INS", "") ;
         new app.pprdes3(remoteHandle, context).execute( GXv_char32, GXv_int30, GXv_char31, GXv_char28, GXv_int19, GXv_int21, GXv_decimal29, GXv_decimal22, GXv_decimal17, GXv_char27, GXv_int18, GXv_int15, GXv_int20, GXv_int6, GXv_decimal16, GXv_date23, GXv_date11, GXv_char26) ;
         A396EmprCod = GXv_char32[0] ;
         A6156EntPrvNum = GXv_int30[0] ;
         A719PrdNum = GXv_char31[0] ;
         A718PrdNom = GXv_char28[0] ;
         AV22Year = GXv_int19[0] ;
         AV23Mes = GXv_int21[0] ;
         A418EntUniEnt = GXv_decimal29[0] ;
         AV21UniOld = GXv_decimal22[0] ;
         A417EntPre = GXv_decimal17[0] ;
         AV24PedPri = GXv_char27[0] ;
         AV22Year = GXv_int18[0] ;
         AV25AnyAnt = GXv_int15[0] ;
         AV23Mes = GXv_int20[0] ;
         AV26MesAnt = GXv_int6[0] ;
         AV27PrecAnt = GXv_decimal16[0] ;
         A415EntFecEnt = GXv_date23[0] ;
         AV20FecAnt = GXv_date11[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A6156EntPrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6156EntPrvNum), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         httpContext.ajax_rsp_assign_attri("", false, "A718PrdNom", A718PrdNom);
         httpContext.ajax_rsp_assign_attri("", false, "AV22Year", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV22Year), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV23Mes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV23Mes), 2, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A418EntUniEnt", GXutil.ltrimstr( A418EntUniEnt, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "AV21UniOld", GXutil.ltrimstr( AV21UniOld, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "A417EntPre", GXutil.ltrimstr( A417EntPre, 14, 5));
         httpContext.ajax_rsp_assign_attri("", false, "AV24PedPri", AV24PedPri);
         httpContext.ajax_rsp_assign_attri("", false, "AV22Year", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV22Year), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV25AnyAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV25AnyAnt), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV23Mes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV23Mes), 2, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV26MesAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV26MesAnt), 2, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV27PrecAnt", GXutil.ltrimstr( AV27PrecAnt, 14, 5));
         httpContext.ajax_rsp_assign_attri("", false, "A415EntFecEnt", localUtil.format(A415EntFecEnt, "99/99/99"));
         httpContext.ajax_rsp_assign_attri("", false, "AV20FecAnt", localUtil.format(AV20FecAnt, "99/99/99"));
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

   public void xc_89_1T642( )
   {
      if ( ( ( ( DecimalUtil.compareTo(A418EntUniEnt, AV21UniOld) != 0 ) ) || ( !( GXutil.dateCompare(GXutil.resetTime(A415EntFecEnt), GXutil.resetTime(AV20FecAnt)) ) ) || ( ( DecimalUtil.compareTo(A417EntPre, AV27PrecAnt) != 0 ) ) ) && isUpd( )  && true /* After */ )
      {
         GXv_char32[0] = A396EmprCod ;
         GXv_int30[0] = A6156EntPrvNum ;
         GXv_char31[0] = A719PrdNum ;
         GXv_char28[0] = A718PrdNom ;
         GXv_int19[0] = AV22Year ;
         GXv_int21[0] = AV23Mes ;
         GXv_decimal29[0] = A418EntUniEnt ;
         GXv_decimal22[0] = AV21UniOld ;
         GXv_decimal17[0] = A417EntPre ;
         GXv_char27[0] = AV24PedPri ;
         GXv_int18[0] = AV22Year ;
         GXv_int15[0] = AV25AnyAnt ;
         GXv_int20[0] = AV23Mes ;
         GXv_int6[0] = AV26MesAnt ;
         GXv_decimal16[0] = AV27PrecAnt ;
         GXv_date23[0] = A415EntFecEnt ;
         GXv_date11[0] = AV20FecAnt ;
         GXv_char26[0] = httpContext.getMessage( "UPD", "") ;
         new app.pprdes3(remoteHandle, context).execute( GXv_char32, GXv_int30, GXv_char31, GXv_char28, GXv_int19, GXv_int21, GXv_decimal29, GXv_decimal22, GXv_decimal17, GXv_char27, GXv_int18, GXv_int15, GXv_int20, GXv_int6, GXv_decimal16, GXv_date23, GXv_date11, GXv_char26) ;
         A396EmprCod = GXv_char32[0] ;
         A6156EntPrvNum = GXv_int30[0] ;
         A719PrdNum = GXv_char31[0] ;
         A718PrdNom = GXv_char28[0] ;
         AV22Year = GXv_int19[0] ;
         AV23Mes = GXv_int21[0] ;
         A418EntUniEnt = GXv_decimal29[0] ;
         AV21UniOld = GXv_decimal22[0] ;
         A417EntPre = GXv_decimal17[0] ;
         AV24PedPri = GXv_char27[0] ;
         AV22Year = GXv_int18[0] ;
         AV25AnyAnt = GXv_int15[0] ;
         AV23Mes = GXv_int20[0] ;
         AV26MesAnt = GXv_int6[0] ;
         AV27PrecAnt = GXv_decimal16[0] ;
         A415EntFecEnt = GXv_date23[0] ;
         AV20FecAnt = GXv_date11[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A6156EntPrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6156EntPrvNum), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         httpContext.ajax_rsp_assign_attri("", false, "A718PrdNom", A718PrdNom);
         httpContext.ajax_rsp_assign_attri("", false, "AV22Year", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV22Year), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV23Mes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV23Mes), 2, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A418EntUniEnt", GXutil.ltrimstr( A418EntUniEnt, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "AV21UniOld", GXutil.ltrimstr( AV21UniOld, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "A417EntPre", GXutil.ltrimstr( A417EntPre, 14, 5));
         httpContext.ajax_rsp_assign_attri("", false, "AV24PedPri", AV24PedPri);
         httpContext.ajax_rsp_assign_attri("", false, "AV22Year", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV22Year), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV25AnyAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV25AnyAnt), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV23Mes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV23Mes), 2, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV26MesAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV26MesAnt), 2, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV27PrecAnt", GXutil.ltrimstr( AV27PrecAnt, 14, 5));
         httpContext.ajax_rsp_assign_attri("", false, "A415EntFecEnt", localUtil.format(A415EntFecEnt, "99/99/99"));
         httpContext.ajax_rsp_assign_attri("", false, "AV20FecAnt", localUtil.format(AV20FecAnt, "99/99/99"));
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

   public void xc_90_1T642( )
   {
      if ( isIns( )  && true /* After */ )
      {
         GXv_char32[0] = A396EmprCod ;
         GXv_char31[0] = A719PrdNum ;
         GXv_int19[0] = AV22Year ;
         GXv_int21[0] = AV23Mes ;
         GXv_decimal29[0] = A418EntUniEnt ;
         GXv_decimal22[0] = AV21UniOld ;
         GXv_decimal17[0] = A417EntPre ;
         GXv_int18[0] = AV22Year ;
         GXv_int15[0] = AV25AnyAnt ;
         GXv_int20[0] = AV23Mes ;
         GXv_int6[0] = AV26MesAnt ;
         GXv_decimal16[0] = AV27PrecAnt ;
         GXv_date23[0] = A415EntFecEnt ;
         GXv_date11[0] = AV20FecAnt ;
         GXv_char28[0] = AV24PedPri ;
         GXv_char27[0] = httpContext.getMessage( "INS", "") ;
         new app.pprden2(remoteHandle, context).execute( GXv_char32, GXv_char31, GXv_int19, GXv_int21, GXv_decimal29, GXv_decimal22, GXv_decimal17, GXv_int18, GXv_int15, GXv_int20, GXv_int6, GXv_decimal16, GXv_date23, GXv_date11, GXv_char28, GXv_char27) ;
         A396EmprCod = GXv_char32[0] ;
         A719PrdNum = GXv_char31[0] ;
         AV22Year = GXv_int19[0] ;
         AV23Mes = GXv_int21[0] ;
         A418EntUniEnt = GXv_decimal29[0] ;
         AV21UniOld = GXv_decimal22[0] ;
         A417EntPre = GXv_decimal17[0] ;
         AV22Year = GXv_int18[0] ;
         AV25AnyAnt = GXv_int15[0] ;
         AV23Mes = GXv_int20[0] ;
         AV26MesAnt = GXv_int6[0] ;
         AV27PrecAnt = GXv_decimal16[0] ;
         A415EntFecEnt = GXv_date23[0] ;
         AV20FecAnt = GXv_date11[0] ;
         AV24PedPri = GXv_char28[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         httpContext.ajax_rsp_assign_attri("", false, "AV22Year", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV22Year), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV23Mes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV23Mes), 2, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A418EntUniEnt", GXutil.ltrimstr( A418EntUniEnt, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "AV21UniOld", GXutil.ltrimstr( AV21UniOld, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "A417EntPre", GXutil.ltrimstr( A417EntPre, 14, 5));
         httpContext.ajax_rsp_assign_attri("", false, "AV22Year", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV22Year), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV25AnyAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV25AnyAnt), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV23Mes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV23Mes), 2, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV26MesAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV26MesAnt), 2, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV27PrecAnt", GXutil.ltrimstr( AV27PrecAnt, 14, 5));
         httpContext.ajax_rsp_assign_attri("", false, "A415EntFecEnt", localUtil.format(A415EntFecEnt, "99/99/99"));
         httpContext.ajax_rsp_assign_attri("", false, "AV20FecAnt", localUtil.format(AV20FecAnt, "99/99/99"));
         httpContext.ajax_rsp_assign_attri("", false, "AV24PedPri", AV24PedPri);
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

   public void xc_91_1T642( )
   {
      if ( ( ( ( DecimalUtil.compareTo(A418EntUniEnt, AV21UniOld) != 0 ) ) || ( !( GXutil.dateCompare(GXutil.resetTime(A415EntFecEnt), GXutil.resetTime(AV20FecAnt)) ) ) || ( ( DecimalUtil.compareTo(A417EntPre, AV27PrecAnt) != 0 ) ) ) && isUpd( )  && true /* After */ )
      {
         GXv_char32[0] = A396EmprCod ;
         GXv_char31[0] = A719PrdNum ;
         GXv_int19[0] = AV22Year ;
         GXv_int21[0] = AV23Mes ;
         GXv_decimal29[0] = A418EntUniEnt ;
         GXv_decimal22[0] = AV21UniOld ;
         GXv_decimal17[0] = A417EntPre ;
         GXv_int18[0] = AV22Year ;
         GXv_int15[0] = AV25AnyAnt ;
         GXv_int20[0] = AV23Mes ;
         GXv_int6[0] = AV26MesAnt ;
         GXv_decimal16[0] = AV27PrecAnt ;
         GXv_date23[0] = A415EntFecEnt ;
         GXv_date11[0] = AV20FecAnt ;
         GXv_char28[0] = AV24PedPri ;
         GXv_char27[0] = httpContext.getMessage( "UPD", "") ;
         new app.pprden2(remoteHandle, context).execute( GXv_char32, GXv_char31, GXv_int19, GXv_int21, GXv_decimal29, GXv_decimal22, GXv_decimal17, GXv_int18, GXv_int15, GXv_int20, GXv_int6, GXv_decimal16, GXv_date23, GXv_date11, GXv_char28, GXv_char27) ;
         A396EmprCod = GXv_char32[0] ;
         A719PrdNum = GXv_char31[0] ;
         AV22Year = GXv_int19[0] ;
         AV23Mes = GXv_int21[0] ;
         A418EntUniEnt = GXv_decimal29[0] ;
         AV21UniOld = GXv_decimal22[0] ;
         A417EntPre = GXv_decimal17[0] ;
         AV22Year = GXv_int18[0] ;
         AV25AnyAnt = GXv_int15[0] ;
         AV23Mes = GXv_int20[0] ;
         AV26MesAnt = GXv_int6[0] ;
         AV27PrecAnt = GXv_decimal16[0] ;
         A415EntFecEnt = GXv_date23[0] ;
         AV20FecAnt = GXv_date11[0] ;
         AV24PedPri = GXv_char28[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         httpContext.ajax_rsp_assign_attri("", false, "AV22Year", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV22Year), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV23Mes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV23Mes), 2, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A418EntUniEnt", GXutil.ltrimstr( A418EntUniEnt, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "AV21UniOld", GXutil.ltrimstr( AV21UniOld, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "A417EntPre", GXutil.ltrimstr( A417EntPre, 14, 5));
         httpContext.ajax_rsp_assign_attri("", false, "AV22Year", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV22Year), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV25AnyAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV25AnyAnt), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV23Mes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV23Mes), 2, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV26MesAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV26MesAnt), 2, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV27PrecAnt", GXutil.ltrimstr( AV27PrecAnt, 14, 5));
         httpContext.ajax_rsp_assign_attri("", false, "A415EntFecEnt", localUtil.format(A415EntFecEnt, "99/99/99"));
         httpContext.ajax_rsp_assign_attri("", false, "AV20FecAnt", localUtil.format(AV20FecAnt, "99/99/99"));
         httpContext.ajax_rsp_assign_attri("", false, "AV24PedPri", AV24PedPri);
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

   public void xc_92_1T642( )
   {
      if ( ( isIns( )  || isUpd( )  ) && true /* After */ && ( AV19Nalbaran20 == 0 ) )
      {
         GXv_char32[0] = A396EmprCod ;
         GXv_char31[0] = A719PrdNum ;
         GXv_decimal29[0] = A418EntUniEnt ;
         GXv_decimal22[0] = DecimalUtil.doubleToDec(0) ;
         GXv_char28[0] = httpContext.getMessage( "EN", "") ;
         GXv_char27[0] = AV24PedPri ;
         GXv_decimal17[0] = A417EntPre ;
         GXv_int30[0] = 0 ;
         GXv_int21[0] = (byte)(0) ;
         GXv_char26[0] = " " ;
         GXv_int25[0] = A658PedCod ;
         GXv_char24[0] = A11Albaran ;
         GXv_char14[0] = AV36Usurcod ;
         GXv_char4[0] = httpContext.getMessage( "Entrada por Pedido", "") ;
         GXv_int19[0] = A597LinEnt ;
         GXv_decimal16[0] = AV21UniOld ;
         GXv_decimal13[0] = DecimalUtil.doubleToDec(0) ;
         GXv_date23[0] = A415EntFecEnt ;
         GXv_int8[0] = A6156EntPrvNum ;
         GXv_char3[0] = A5686EntLotN ;
         new app.pnewcc9(remoteHandle, context).execute( GXv_char32, GXv_char31, GXv_decimal29, GXv_decimal22, GXv_char28, GXv_char27, GXv_decimal17, GXv_int30, GXv_int21, GXv_char26, GXv_int25, GXv_char24, GXv_char14, GXv_char4, GXv_int19, GXv_decimal16, GXv_decimal13, GXv_date23, GXv_int8, GXv_char3) ;
         A396EmprCod = GXv_char32[0] ;
         A719PrdNum = GXv_char31[0] ;
         A418EntUniEnt = GXv_decimal29[0] ;
         AV24PedPri = GXv_char27[0] ;
         A417EntPre = GXv_decimal17[0] ;
         A658PedCod = GXv_int25[0] ;
         A11Albaran = GXv_char24[0] ;
         AV36Usurcod = GXv_char14[0] ;
         A597LinEnt = GXv_int19[0] ;
         AV21UniOld = GXv_decimal16[0] ;
         A415EntFecEnt = GXv_date23[0] ;
         A6156EntPrvNum = GXv_int8[0] ;
         A5686EntLotN = GXv_char3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         httpContext.ajax_rsp_assign_attri("", false, "A418EntUniEnt", GXutil.ltrimstr( A418EntUniEnt, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "AV24PedPri", AV24PedPri);
         httpContext.ajax_rsp_assign_attri("", false, "A417EntPre", GXutil.ltrimstr( A417EntPre, 14, 5));
         httpContext.ajax_rsp_assign_attri("", false, "A658PedCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A658PedCod), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A11Albaran", A11Albaran);
         httpContext.ajax_rsp_assign_attri("", false, "AV36Usurcod", AV36Usurcod);
         httpContext.ajax_rsp_assign_attri("", false, "A597LinEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A597LinEnt), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV21UniOld", GXutil.ltrimstr( AV21UniOld, 9, 2));
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

   public void xc_93_1T642( )
   {
      if ( ( isIns( )  || isUpd( )  ) && true /* After */ && ( AV19Nalbaran20 == 1 ) )
      {
         GXv_char32[0] = A396EmprCod ;
         GXv_char31[0] = A719PrdNum ;
         GXv_decimal29[0] = A418EntUniEnt ;
         GXv_decimal22[0] = DecimalUtil.doubleToDec(0) ;
         GXv_char28[0] = httpContext.getMessage( "EN", "") ;
         GXv_char27[0] = AV24PedPri ;
         GXv_decimal17[0] = A417EntPre ;
         GXv_int30[0] = 0 ;
         GXv_int21[0] = (byte)(0) ;
         GXv_char26[0] = " " ;
         GXv_int25[0] = A658PedCod ;
         GXv_char24[0] = A11Albaran ;
         GXv_char14[0] = AV36Usurcod ;
         GXv_char4[0] = httpContext.getMessage( "Entrada por Pedido", "") ;
         GXv_int19[0] = A597LinEnt ;
         GXv_decimal16[0] = AV21UniOld ;
         GXv_decimal13[0] = DecimalUtil.doubleToDec(0) ;
         GXv_date23[0] = A415EntFecEnt ;
         GXv_int8[0] = A6156EntPrvNum ;
         GXv_char3[0] = A5686EntLotN ;
         GXv_char2[0] = A12857EntNAlbar ;
         new app.pccstk20(remoteHandle, context).execute( GXv_char32, GXv_char31, GXv_decimal29, GXv_decimal22, GXv_char28, GXv_char27, GXv_decimal17, GXv_int30, GXv_int21, GXv_char26, GXv_int25, GXv_char24, GXv_char14, GXv_char4, GXv_int19, GXv_decimal16, GXv_decimal13, GXv_date23, GXv_int8, GXv_char3, GXv_char2) ;
         A396EmprCod = GXv_char32[0] ;
         A719PrdNum = GXv_char31[0] ;
         A418EntUniEnt = GXv_decimal29[0] ;
         AV24PedPri = GXv_char27[0] ;
         A417EntPre = GXv_decimal17[0] ;
         A658PedCod = GXv_int25[0] ;
         A11Albaran = GXv_char24[0] ;
         AV36Usurcod = GXv_char14[0] ;
         A597LinEnt = GXv_int19[0] ;
         AV21UniOld = GXv_decimal16[0] ;
         A415EntFecEnt = GXv_date23[0] ;
         A6156EntPrvNum = GXv_int8[0] ;
         A5686EntLotN = GXv_char3[0] ;
         A12857EntNAlbar = GXv_char2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         httpContext.ajax_rsp_assign_attri("", false, "A418EntUniEnt", GXutil.ltrimstr( A418EntUniEnt, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "AV24PedPri", AV24PedPri);
         httpContext.ajax_rsp_assign_attri("", false, "A417EntPre", GXutil.ltrimstr( A417EntPre, 14, 5));
         httpContext.ajax_rsp_assign_attri("", false, "A658PedCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A658PedCod), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A11Albaran", A11Albaran);
         httpContext.ajax_rsp_assign_attri("", false, "AV36Usurcod", AV36Usurcod);
         httpContext.ajax_rsp_assign_attri("", false, "A597LinEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A597LinEnt), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV21UniOld", GXutil.ltrimstr( AV21UniOld, 9, 2));
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

   public void xc_94_1T642( String A396EmprCod ,
                            String A719PrdNum ,
                            int A6156EntPrvNum ,
                            java.math.BigDecimal A417EntPre )
   {
      if ( true /* After */ || true /* After */ )
      {
         GXv_char32[0] = A396EmprCod ;
         GXv_char31[0] = A719PrdNum ;
         GXv_int30[0] = A6156EntPrvNum ;
         GXv_decimal29[0] = A417EntPre ;
         new app.pprenp(remoteHandle, context).execute( GXv_char32, GXv_char31, GXv_int30, GXv_decimal29) ;
         A396EmprCod = GXv_char32[0] ;
         A719PrdNum = GXv_char31[0] ;
         A6156EntPrvNum = GXv_int30[0] ;
         A417EntPre = GXv_decimal29[0] ;
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

   public void xc_95_1T642( String Gx_mode ,
                            String A396EmprCod ,
                            int A6156EntPrvNum ,
                            java.util.Date A415EntFecEnt ,
                            int A658PedCod ,
                            java.math.BigDecimal A418EntUniEnt ,
                            java.math.BigDecimal A417EntPre ,
                            String AV24PedPri ,
                            short A597LinEnt )
   {
      if ( isDlt( )  && true /* Level */ && true /* After */ )
      {
         GXv_char32[0] = A396EmprCod ;
         GXv_int30[0] = A6156EntPrvNum ;
         GXv_date23[0] = A415EntFecEnt ;
         GXv_int25[0] = A658PedCod ;
         GXv_decimal29[0] = A418EntUniEnt ;
         GXv_decimal22[0] = A417EntPre ;
         GXv_char31[0] = AV24PedPri ;
         new app.pacespr(remoteHandle, context).execute( GXv_char32, GXv_int30, GXv_date23, GXv_int25, GXv_decimal29, GXv_decimal22, GXv_char31) ;
         A396EmprCod = GXv_char32[0] ;
         A6156EntPrvNum = GXv_int30[0] ;
         A415EntFecEnt = GXv_date23[0] ;
         A658PedCod = GXv_int25[0] ;
         A418EntUniEnt = GXv_decimal29[0] ;
         A417EntPre = GXv_decimal22[0] ;
         AV24PedPri = GXv_char31[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A6156EntPrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6156EntPrvNum), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A415EntFecEnt", localUtil.format(A415EntFecEnt, "99/99/99"));
         httpContext.ajax_rsp_assign_attri("", false, "A658PedCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A658PedCod), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A418EntUniEnt", GXutil.ltrimstr( A418EntUniEnt, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "A417EntPre", GXutil.ltrimstr( A417EntPre, 14, 5));
         httpContext.ajax_rsp_assign_attri("", false, "AV24PedPri", AV24PedPri);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A6156EntPrvNum, (byte)(6), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( localUtil.format(A415EntFecEnt, "99/99/99"))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A658PedCod, (byte)(8), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A418EntUniEnt, (byte)(9), (byte)(2), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A417EntPre, (byte)(14), (byte)(5), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( AV24PedPri))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_96_1T642( String Gx_mode ,
                            String A396EmprCod ,
                            int A6156EntPrvNum ,
                            String A719PrdNum ,
                            String A718PrdNom ,
                            java.util.Date A415EntFecEnt ,
                            int A658PedCod ,
                            java.math.BigDecimal A418EntUniEnt ,
                            java.math.BigDecimal A417EntPre ,
                            String AV24PedPri ,
                            short A597LinEnt )
   {
      if ( isDlt( )  && true /* Level */ && true /* After */ )
      {
         GXv_char32[0] = A396EmprCod ;
         GXv_int30[0] = A6156EntPrvNum ;
         GXv_char31[0] = A719PrdNum ;
         GXv_char28[0] = A718PrdNom ;
         GXv_date23[0] = A415EntFecEnt ;
         GXv_int25[0] = A658PedCod ;
         GXv_decimal29[0] = A418EntUniEnt ;
         GXv_decimal22[0] = A417EntPre ;
         GXv_char27[0] = AV24PedPri ;
         new app.pacesprx(remoteHandle, context).execute( GXv_char32, GXv_int30, GXv_char31, GXv_char28, GXv_date23, GXv_int25, GXv_decimal29, GXv_decimal22, GXv_char27) ;
         A396EmprCod = GXv_char32[0] ;
         A6156EntPrvNum = GXv_int30[0] ;
         A719PrdNum = GXv_char31[0] ;
         A718PrdNom = GXv_char28[0] ;
         A415EntFecEnt = GXv_date23[0] ;
         A658PedCod = GXv_int25[0] ;
         A418EntUniEnt = GXv_decimal29[0] ;
         A417EntPre = GXv_decimal22[0] ;
         AV24PedPri = GXv_char27[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A6156EntPrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6156EntPrvNum), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         httpContext.ajax_rsp_assign_attri("", false, "A718PrdNom", A718PrdNom);
         httpContext.ajax_rsp_assign_attri("", false, "A415EntFecEnt", localUtil.format(A415EntFecEnt, "99/99/99"));
         httpContext.ajax_rsp_assign_attri("", false, "A658PedCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A658PedCod), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A418EntUniEnt", GXutil.ltrimstr( A418EntUniEnt, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "A417EntPre", GXutil.ltrimstr( A417EntPre, 14, 5));
         httpContext.ajax_rsp_assign_attri("", false, "AV24PedPri", AV24PedPri);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A6156EntPrvNum, (byte)(6), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A719PrdNum))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A718PrdNom))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( localUtil.format(A415EntFecEnt, "99/99/99"))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A658PedCod, (byte)(8), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A418EntUniEnt, (byte)(9), (byte)(2), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A417EntPre, (byte)(14), (byte)(5), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( AV24PedPri))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_97_1T642( String Gx_mode ,
                            String A396EmprCod ,
                            String A719PrdNum ,
                            java.util.Date A415EntFecEnt ,
                            java.math.BigDecimal A418EntUniEnt ,
                            java.math.BigDecimal A417EntPre ,
                            short A597LinEnt )
   {
      if ( isDlt( )  && true /* Level */ && true /* After */ )
      {
         GXv_char32[0] = A396EmprCod ;
         GXv_char31[0] = A719PrdNum ;
         GXv_date23[0] = A415EntFecEnt ;
         GXv_decimal29[0] = A418EntUniEnt ;
         GXv_decimal22[0] = A417EntPre ;
         new app.pacespd(remoteHandle, context).execute( GXv_char32, GXv_char31, GXv_date23, GXv_decimal29, GXv_decimal22) ;
         A396EmprCod = GXv_char32[0] ;
         A719PrdNum = GXv_char31[0] ;
         A415EntFecEnt = GXv_date23[0] ;
         A418EntUniEnt = GXv_decimal29[0] ;
         A417EntPre = GXv_decimal22[0] ;
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

   public void xc_98_1T642( String Gx_mode ,
                            String A396EmprCod ,
                            String A719PrdNum ,
                            short A597LinEnt )
   {
      if ( true /* Level */ && isDlt( )  && true /* After */ )
      {
         GXv_char32[0] = A396EmprCod ;
         GXv_char31[0] = A719PrdNum ;
         GXv_int19[0] = A597LinEnt ;
         new app.peliccs(remoteHandle, context).execute( GXv_char32, GXv_char31, GXv_int19) ;
         A396EmprCod = GXv_char32[0] ;
         A719PrdNum = GXv_char31[0] ;
         A597LinEnt = GXv_int19[0] ;
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

   public void xc_99_1T642( String A396EmprCod ,
                            String AV46Pgmname ,
                            String AV36Usurcod ,
                            String AV37Station ,
                            String AV17Inc_obs )
   {
      if ( true /* After */ )
      {
         new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV46Pgmname, AV36Usurcod, AV37Station, AV17Inc_obs, 99999999, (byte)(0), " ") ;
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

   public void xc_100_1T642( String A396EmprCod ,
                             String AV46Pgmname ,
                             String AV36Usurcod ,
                             String AV37Station ,
                             String AV17Inc_obs )
   {
      if ( true /* After */ || true /* After */ )
      {
         new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV46Pgmname, AV36Usurcod, AV37Station, AV17Inc_obs, 99999999, (byte)(0), " ") ;
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

   public void valid_Entfecent( )
   {
      AV22Year = (short)(GXutil.year( A415EntFecEnt)) ;
      AV28Fecha = localUtil.ymdtod( AV22Year, 12, 1) ;
      AV23Mes = (byte)(GXutil.month( A415EntFecEnt)) ;
      AV34oldEntFecent = O415EntFecEnt ;
      AV20FecAnt = O415EntFecEnt ;
      AV25AnyAnt = (short)(GXutil.year( O415EntFecEnt)) ;
      AV26MesAnt = (byte)(GXutil.month( O415EntFecEnt)) ;
      if ( ( isIns( )  || isUpd( )  ) && ( AV39NoUpd == 0 ) )
      {
         A713PrdFulEnt = A415EntFecEnt ;
      }
      if ( ( isIns( )  || isUpd( )  ) && ( AV39NoUpd == 0 ) )
      {
         A709PrdFecPre = A415EntFecEnt ;
      }
      AV15msg_ctrl_fecha = httpContext.getMessage( httpContext.getMessage( "Atencion.Ultimo Mov Fecha ", ""), "") + GXutil.trim( localUtil.dtoc( A14040PrdUltMovF, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")) + httpContext.getMessage( httpContext.getMessage( " superior a Fecha Mov ", ""), "") + GXutil.trim( localUtil.dtoc( A415EntFecEnt, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")) ;
      AV29DiasFin = (short)(GXutil.ddiff(GXutil.eomdate( AV28Fecha),A415EntFecEnt)) ;
      if ( true /* Level */ && true /* After */ && GXutil.resetTime(A415EntFecEnt).after( GXutil.resetTime( Gx_date )) && isIns( )  )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "ERROR.Fecha Entrada mayor a la Fecha del Dia", ""), 1, "ENTFECENT");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEntFecEnt_Internalname ;
      }
      if ( true /* After */ && ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A14040PrdUltMovF)) && GXutil.resetTime(A14040PrdUltMovF).after( GXutil.resetTime( A415EntFecEnt )) && ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A415EntFecEnt)) && ( isIns( )  || isUpd( )  ) && ( AV41FlagFecCcs == 0 ) )
      {
         httpContext.GX_msglist.addItem(AV15msg_ctrl_fecha, 1, "ENTFECENT");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEntFecEnt_Internalname ;
      }
      if ( true /* Level */ && ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A14040PrdUltMovF)) && GXutil.resetTime(A14040PrdUltMovF).after( GXutil.resetTime( A415EntFecEnt )) && ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A415EntFecEnt)) && isDlt( )  && ( AV41FlagFecCcs == 0 ) )
      {
         httpContext.GX_msglist.addItem(AV15msg_ctrl_fecha, 1, "ENTFECENT");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEntFecEnt_Internalname ;
      }
      if ( true /* Level */ && true /* After */ && ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A14040PrdUltMovF)) && GXutil.resetTime(A14040PrdUltMovF).after( GXutil.resetTime( A415EntFecEnt )) && ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A415EntFecEnt)) && ( isIns( )  || isUpd( )  ) && ( AV41FlagFecCcs == 1 ) )
      {
         httpContext.GX_msglist.addItem(AV15msg_ctrl_fecha, 0, "ENTFECENT");
      }
      if ( true /* Level */ && ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A14040PrdUltMovF)) && GXutil.resetTime(A14040PrdUltMovF).after( GXutil.resetTime( A415EntFecEnt )) && ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A415EntFecEnt)) && isDlt( )  && ( AV41FlagFecCcs == 1 ) )
      {
         httpContext.GX_msglist.addItem(AV15msg_ctrl_fecha, 0, "ENTFECENT");
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "AV22Year", GXutil.ltrim( localUtil.ntoc( AV22Year, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV28Fecha", localUtil.format(AV28Fecha, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "AV23Mes", GXutil.ltrim( localUtil.ntoc( AV23Mes, (byte)(2), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV34oldEntFecent", localUtil.format(AV34oldEntFecent, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "AV20FecAnt", localUtil.format(AV20FecAnt, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "AV25AnyAnt", GXutil.ltrim( localUtil.ntoc( AV25AnyAnt, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV26MesAnt", GXutil.ltrim( localUtil.ntoc( AV26MesAnt, (byte)(2), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A713PrdFulEnt", localUtil.format(A713PrdFulEnt, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A709PrdFecPre", localUtil.format(A709PrdFecPre, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "AV15msg_ctrl_fecha", AV15msg_ctrl_fecha);
      httpContext.ajax_rsp_assign_attri("", false, "AV29DiasFin", GXutil.ltrim( localUtil.ntoc( AV29DiasFin, (byte)(3), (byte)(0), ".", "")));
   }

   public void valid_Pedcod( )
   {
      n658PedCod = false ;
      n800PrvPri = false ;
      /* Using cursor T01T624 */
      pr_default.execute(20, new Object[] {A396EmprCod, Boolean.valueOf(n658PedCod), Integer.valueOf(A658PedCod)});
      if ( (pr_default.getStatus(20) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A658PedCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CPEDID", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PEDCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtPedCod_Internalname ;
         }
      }
      A661PedFec = T01T624_A661PedFec[0] ;
      A667PedSit = T01T624_A667PedSit[0] ;
      A666PedPri = T01T624_A666PedPri[0] ;
      A12580PedAlmc = T01T624_A12580PedAlmc[0] ;
      pr_default.close(20);
      /* Using cursor T01T625 */
      pr_default.execute(21, new Object[] {A396EmprCod, Boolean.valueOf(n658PedCod), Integer.valueOf(A658PedCod), A719PrdNum});
      Z663PedFulEnt = T01T625_A663PedFulEnt[0] ;
      Z665PedPre = T01T625_A665PedPre[0] ;
      Z669PedUni = T01T625_A669PedUni[0] ;
      Z659PedCum = T01T625_A659PedCum[0] ;
      Z660PedDto = T01T625_A660PedDto[0] ;
      if ( (pr_default.getStatus(21) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A658PedCod) || (GXutil.strcmp("", A719PrdNum)==0) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "LPEDID", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PRDNUM");
            AnyError = (short)(1) ;
            GX_FocusControl = edtPedCod_Internalname ;
         }
      }
      A657PedCanEnt = T01T625_A657PedCanEnt[0] ;
      A663PedFulEnt = T01T625_A663PedFulEnt[0] ;
      A665PedPre = T01T625_A665PedPre[0] ;
      A669PedUni = T01T625_A669PedUni[0] ;
      A659PedCum = T01T625_A659PedCum[0] ;
      A660PedDto = T01T625_A660PedDto[0] ;
      O657PedCanEnt = A657PedCanEnt ;
      pr_default.close(21);
      if ( true )
      {
         AV24PedPri = GXutil.str( A800PrvPri, 1, 0) ;
      }
      else
      {
         if ( true /* Level */ && ! (0==A658PedCod) )
         {
            AV24PedPri = A666PedPri ;
         }
      }
      if ( ( A684PrdCanPen.doubleValue() < 0 ) && ! (0==A658PedCod) )
      {
         A684PrdCanPen = DecimalUtil.doubleToDec(0) ;
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
      httpContext.ajax_rsp_assign_attri("", false, "A663PedFulEnt", localUtil.format(A663PedFulEnt, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A665PedPre", GXutil.ltrim( localUtil.ntoc( A665PedPre, (byte)(14), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A669PedUni", GXutil.ltrim( localUtil.ntoc( A669PedUni, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A659PedCum", GXutil.rtrim( A659PedCum));
      httpContext.ajax_rsp_assign_attri("", false, "A660PedDto", GXutil.ltrim( localUtil.ntoc( A660PedDto, (byte)(5), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV24PedPri", GXutil.rtrim( AV24PedPri));
      httpContext.ajax_rsp_assign_attri("", false, "A684PrdCanPen", GXutil.ltrim( localUtil.ntoc( A684PrdCanPen, (byte)(12), (byte)(4), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A664PedNumLin", GXutil.ltrim( localUtil.ntoc( A664PedNumLin, (byte)(3), (byte)(0), ".", "")));
   }

   public void valid_Entprvnum( )
   {
      n658PedCod = false ;
      n6156EntPrvNum = false ;
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
         else
         {
            if ( isIns( )  && (0==A658PedCod) )
            {
               GXt_decimal12 = A417EntPre ;
               GXv_decimal29[0] = GXt_decimal12 ;
               new app.comprasquimicos.precioproveedor(remoteHandle, context).execute( A396EmprCod, A719PrdNum, A6156EntPrvNum, GXv_decimal29) ;
               entradaproductoalmacen_trn_impl.this.GXt_decimal12 = GXv_decimal29[0] ;
               A417EntPre = GXt_decimal12 ;
            }
         }
      }
      if ( true /* After */ )
      {
         GXt_char1 = AV18PrdNomX ;
         GXv_char32[0] = A396EmprCod ;
         GXv_int30[0] = A6156EntPrvNum ;
         GXv_char31[0] = GXt_char1 ;
         new app.pctrprv(remoteHandle, context).execute( GXv_char32, GXv_int30, GXv_char31) ;
         entradaproductoalmacen_trn_impl.this.A396EmprCod = GXv_char32[0] ;
         entradaproductoalmacen_trn_impl.this.A6156EntPrvNum = GXv_int30[0] ;
         entradaproductoalmacen_trn_impl.this.GXt_char1 = GXv_char31[0] ;
         AV18PrdNomX = GXt_char1 ;
      }
      if ( isIns( )  && (0==A12716EntFabId) && ( Gx_BScreen == 0 ) )
      {
         A12716EntFabId = A6156EntPrvNum ;
      }
      if ( ( GXutil.strcmp(GXutil.trim( AV18PrdNomX), httpContext.getMessage( "Inexistente", "")) == 0 ) && true /* After */ )
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
      httpContext.ajax_rsp_assign_attri("", false, "A417EntPre", GXutil.ltrim( localUtil.ntoc( A417EntPre, (byte)(14), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV18PrdNomX", GXutil.rtrim( AV18PrdNomX));
      httpContext.ajax_rsp_assign_attri("", false, "A12716EntFabId", GXutil.ltrim( localUtil.ntoc( A12716EntFabId, (byte)(6), (byte)(0), ".", "")));
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
      AV31OldExiAlm = O704PrdExiAlm ;
      AV32OldEntUni = O418EntUniEnt ;
      AV21UniOld = O418EntUniEnt ;
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
      if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, A418EntUniEnt)==0) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Debe entrar unidades", ""), 1, "ENTUNIENT");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEntUniEnt_Internalname ;
      }
      if ( ( DecimalUtil.compareTo(A657PedCanEnt, A669PedUni) > 0 ) && ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A657PedCanEnt)==0) && ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A669PedUni)==0) && ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A418EntUniEnt)==0) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "¡ATENCION! Cantidad entregada ", "")+GXutil.trim( GXutil.str( A657PedCanEnt, 9, 2))+httpContext.getMessage( " superior a la pedida ", "")+GXutil.trim( GXutil.str( A669PedUni, 9, 2)), 0, "ENTUNIENT");
      }
      if ( ( A684PrdCanPen.doubleValue() < 0 ) && ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A418EntUniEnt)==0) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "¡ATENCION! Cantidad Entregada superior a la Pendiente", ""), 0, "ENTUNIENT");
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A704PrdExiAlm", GXutil.ltrim( localUtil.ntoc( A704PrdExiAlm, (byte)(12), (byte)(4), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV31OldExiAlm", GXutil.ltrim( localUtil.ntoc( AV31OldExiAlm, (byte)(12), (byte)(4), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV32OldEntUni", GXutil.ltrim( localUtil.ntoc( AV32OldEntUni, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV21UniOld", GXutil.ltrim( localUtil.ntoc( AV21UniOld, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A657PedCanEnt", GXutil.ltrim( localUtil.ntoc( A657PedCanEnt, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A14041EntCump", GXutil.rtrim( A14041EntCump));
   }

   public void valid_Entpre( )
   {
      AV30OldEntPre = O417EntPre ;
      AV27PrecAnt = O417EntPre ;
      if ( isIns( )  )
      {
         A750PrdValStk = O750PrdValStk.add(GXutil.roundDecimal( A417EntPre.multiply(A418EntUniEnt), 2)) ;
      }
      else
      {
         if ( isUpd( )  )
         {
            A750PrdValStk = O750PrdValStk.add((GXutil.roundDecimal( A417EntPre.multiply(A418EntUniEnt), 2).subtract(GXutil.roundDecimal( AV30OldEntPre.multiply(AV32OldEntUni), 2)))) ;
         }
         else
         {
            if ( isDlt( )  )
            {
               A750PrdValStk = O750PrdValStk.subtract(GXutil.roundDecimal( A417EntPre.multiply(A418EntUniEnt), 2)) ;
            }
         }
      }
      if ( ( A704PrdExiAlm.doubleValue() != 0 ) && ( AV40Consumos == 1 ) && ( A750PrdValStk.doubleValue() > 0 ) )
      {
         A726PrdPreMed = GXutil.roundDecimal( A750PrdValStk.divide(A704PrdExiAlm, 18, java.math.RoundingMode.DOWN), 3) ;
      }
      else
      {
         if ( ( A704PrdExiAlm.doubleValue() == 0 ) && ( AV40Consumos == 1 ) && ( A750PrdValStk.doubleValue() == 0 ) )
         {
            A726PrdPreMed = DecimalUtil.doubleToDec(0) ;
         }
         else
         {
            if ( ( ( A704PrdExiAlm.doubleValue() != 0 ) || ( A705PrdExiCC.doubleValue() != 0 ) ) && ( AV40Consumos == 0 ) )
            {
               A726PrdPreMed = GXutil.roundDecimal( A750PrdValStk.divide((A704PrdExiAlm.add(A705PrdExiCC)), 18, java.math.RoundingMode.DOWN), 3) ;
            }
            else
            {
               if ( ( A704PrdExiAlm.doubleValue() == 0 ) && ( A705PrdExiCC.doubleValue() == 0 ) && ( AV40Consumos == 0 ) )
               {
                  A726PrdPreMed = DecimalUtil.doubleToDec(0) ;
               }
            }
         }
      }
      if ( ( AV39NoUpd == 0 ) && ( isIns( )  || isUpd( )  ) )
      {
         A724PrdPreAct = A417EntPre ;
      }
      if ( ( isIns( )  || isUpd( )  ) && ( AV39NoUpd == 0 ) )
      {
         A725PrdPreAnt = O724PrdPreAct ;
      }
      if ( true /* Level */ && true /* After */ && (DecimalUtil.compareTo(DecimalUtil.ZERO, A417EntPre)==0) && (0==AV16FlagPre) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "ERROR.Precio con valor CERO", ""), 1, "ENTPRE");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEntPre_Internalname ;
      }
      if ( true /* Level */ && true /* After */ && (DecimalUtil.compareTo(DecimalUtil.ZERO, A417EntPre)==0) && ( AV16FlagPre == 1 ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "MENSAJE.Precio con valor CERO", ""), 0, "ENTPRE");
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "AV30OldEntPre", GXutil.ltrim( localUtil.ntoc( AV30OldEntPre, (byte)(14), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV27PrecAnt", GXutil.ltrim( localUtil.ntoc( AV27PrecAnt, (byte)(14), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A750PrdValStk", GXutil.ltrim( localUtil.ntoc( A750PrdValStk, (byte)(11), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A726PrdPreMed", GXutil.ltrim( localUtil.ntoc( A726PrdPreMed, (byte)(14), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A724PrdPreAct", GXutil.ltrim( localUtil.ntoc( A724PrdPreAct, (byte)(14), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A725PrdPreAnt", GXutil.ltrim( localUtil.ntoc( A725PrdPreAnt, (byte)(14), (byte)(5), ".", "")));
   }

   public void valid_Entunirem( )
   {
      n658PedCod = false ;
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
      AV33OldRemanente = O419EntUniRem ;
      if ( (0==A658PedCod) )
      {
         edtEntPedCum_Enabled = 0 ;
      }
      else
      {
         if ( isUpd( )  && ( DecimalUtil.compareTo(A419EntUniRem, A418EntUniEnt) != 0 ) )
         {
            edtEntPedCum_Enabled = 0 ;
         }
         else
         {
            edtEntPedCum_Enabled = 1 ;
         }
      }
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
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A419EntUniRem", GXutil.ltrim( localUtil.ntoc( A419EntUniRem, (byte)(11), (byte)(4), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV33OldRemanente", GXutil.ltrim( localUtil.ntoc( AV33OldRemanente, (byte)(11), (byte)(4), ".", "")));
      httpContext.ajax_rsp_assign_prop("", false, edtEntPedCum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEntPedCum_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, edtEntFecEnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEntFecEnt_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, edtAlbaran_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbaran_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, edtEntNAlbar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEntNAlbar_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, edtEntPrvNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEntPrvNum_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, edtEntUniEnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEntUniEnt_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, edtEntLotN_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEntLotN_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, edtEntPre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEntPre_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, edtEntFVal_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEntFVal_Enabled), 5, 0), true);
   }

   public void valid_Entlotn( )
   {
      AV35oldlote = O5686EntLotN ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "AV35oldlote", GXutil.rtrim( AV35oldlote));
   }

   public void valid_Entpedcum( )
   {
      n658PedCod = false ;
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
         else
         {
            if ( isUpd( )  && ! (0==A658PedCod) && ( GXutil.strcmp(O3404EntPedCum, A3404EntPedCum) == 0 ) )
            {
               A3404EntPedCum = A14041EntCump ;
            }
         }
      }
      if ( ! ( ( GXutil.strcmp(A3404EntPedCum, "S") == 0 ) || ( GXutil.strcmp(A3404EntPedCum, "N") == 0 ) ) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Cerrar?", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, "ENTPEDCUM");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEntPedCum_Internalname ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A3404EntPedCum", GXutil.rtrim( A3404EntPedCum));
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV44moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'AV7EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV8PrdNum',fld:'vPRDNUM',pic:'',hsh:true},{av:'AV9LinEnt',fld:'vLINENT',pic:'ZZZ9',hsh:true},{av:'A411EntCon',fld:'ENTCON',pic:'9'},{av:'AV46Pgmname',fld:'vPGMNAME',pic:''},{av:'A416EntNumCon',fld:'ENTNUMCON',pic:'ZZ9'},{av:'A414EntEti',fld:'ENTETI',pic:'9'},{av:'A413EntConIni',fld:'ENTCONINI',pic:'ZZZZZZZ9'},{av:'A412EntConFin',fld:'ENTCONFIN',pic:'ZZZZZZZ9'},{av:'A5691EntBnc',fld:'ENTBNC',pic:''},{av:'A7695EntCC',fld:'ENTCC',pic:''},{av:'A7696EntCCoCod',fld:'ENTCCOCOD',pic:'ZZ9'},{av:'A10782EntUniAlb',fld:'ENTUNIALB',pic:'ZZZZZ9.9999'},{av:'A10783EntObs',fld:'ENTOBS',pic:''},{av:'A10187EntRemNro',fld:'ENTREMNRO',pic:''},{av:'A10186EntRemFch',fld:'ENTREMFCH',pic:''},{av:'A10185EntRemSuc',fld:'ENTREMSUC',pic:''},{av:'A10184EntRemTpo',fld:'ENTREMTPO',pic:''},{av:'A13235EntLoteID',fld:'ENTLOTEID',pic:'ZZZZZZZZZZZ9'},{av:'A13456EntUbicaci',fld:'ENTUBICACI',pic:''},{av:'A5690EntHfCon',fld:'ENTHFCON',pic:'99:99'},{av:'A5689EntFfCon',fld:'ENTFFCON',pic:''},{av:'A5688EntHiCon',fld:'ENTHICON',pic:'99:99'},{av:'A5687EntFiCon',fld:'ENTFICON',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("AFTER TRN","{handler:'e121T62',iparms:[{av:'A658PedCod',fld:'PEDCOD',pic:'ZZZZZZZ9'},{av:'A418EntUniEnt',fld:'ENTUNIENT',pic:'ZZZZZ9.99'},{av:'AV7EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV8PrdNum',fld:'vPRDNUM',pic:'',hsh:true},{av:'A718PrdNom',fld:'PRDNOM',pic:''},{av:'A597LinEnt',fld:'LINENT',pic:'ZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV44moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'A415EntFecEnt',fld:'ENTFECENT',pic:''},{av:'A5686EntLotN',fld:'ENTLOTN',pic:''},{av:'A14035EntNEmb',fld:'ENTNEMB',pic:'Z9'}]");
      setEventMetadata("AFTER TRN",",oparms:[{av:'A597LinEnt',fld:'LINENT',pic:'ZZZ9'},{av:'A658PedCod',fld:'PEDCOD',pic:'ZZZZZZZ9'},{av:'A718PrdNom',fld:'PRDNOM',pic:''},{av:'AV8PrdNum',fld:'vPRDNUM',pic:'',hsh:true},{av:'AV7EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true}]}");
      setEventMetadata("VALID_LINENT","{handler:'valid_Linent',iparms:[]");
      setEventMetadata("VALID_LINENT",",oparms:[]}");
      setEventMetadata("VALID_ENTFECENT","{handler:'valid_Entfecent',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'O415EntFecEnt'},{av:'A415EntFecEnt',fld:'ENTFECENT',pic:''},{av:'AV22Year',fld:'vYEAR',pic:'ZZZ9'},{av:'AV39NoUpd',fld:'vNOUPD',pic:'ZZZ9'},{av:'A713PrdFulEnt',fld:'PRDFULENT',pic:''},{av:'A709PrdFecPre',fld:'PRDFECPRE',pic:''},{av:'A14040PrdUltMovF',fld:'PRDULTMOVF',pic:''},{av:'AV28Fecha',fld:'vFECHA',pic:''},{av:'AV15msg_ctrl_fecha',fld:'vMSG_CTRL_FECHA',pic:''},{av:'AV41FlagFecCcs',fld:'vFLAGFECCCS',pic:'ZZZ9'},{av:'AV23Mes',fld:'vMES',pic:'Z9'},{av:'AV34oldEntFecent',fld:'vOLDENTFECENT',pic:''},{av:'AV20FecAnt',fld:'vFECANT',pic:''},{av:'AV25AnyAnt',fld:'vANYANT',pic:'ZZZ9'},{av:'AV26MesAnt',fld:'vMESANT',pic:'Z9'},{av:'AV29DiasFin',fld:'vDIASFIN',pic:'ZZ9'}]");
      setEventMetadata("VALID_ENTFECENT",",oparms:[{av:'AV22Year',fld:'vYEAR',pic:'ZZZ9'},{av:'AV28Fecha',fld:'vFECHA',pic:''},{av:'AV23Mes',fld:'vMES',pic:'Z9'},{av:'AV34oldEntFecent',fld:'vOLDENTFECENT',pic:''},{av:'AV20FecAnt',fld:'vFECANT',pic:''},{av:'AV25AnyAnt',fld:'vANYANT',pic:'ZZZ9'},{av:'AV26MesAnt',fld:'vMESANT',pic:'Z9'},{av:'A713PrdFulEnt',fld:'PRDFULENT',pic:''},{av:'A709PrdFecPre',fld:'PRDFECPRE',pic:''},{av:'AV15msg_ctrl_fecha',fld:'vMSG_CTRL_FECHA',pic:''},{av:'AV29DiasFin',fld:'vDIASFIN',pic:'ZZ9'}]}");
      setEventMetadata("VALID_ALBARAN","{handler:'valid_Albaran',iparms:[]");
      setEventMetadata("VALID_ALBARAN",",oparms:[]}");
      setEventMetadata("VALID_ENTNALBAR","{handler:'valid_Entnalbar',iparms:[]");
      setEventMetadata("VALID_ENTNALBAR",",oparms:[]}");
      setEventMetadata("VALID_PEDCOD","{handler:'valid_Pedcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A658PedCod',fld:'PEDCOD',pic:'ZZZZZZZ9'},{av:'A719PrdNum',fld:'PRDNUM',pic:''},{av:'A800PrvPri',fld:'PRVPRI',pic:'9'},{av:'A666PedPri',fld:'PEDPRI',pic:'9'},{av:'A684PrdCanPen',fld:'PRDCANPEN',pic:'ZZZZZZ9.9999'},{av:'A661PedFec',fld:'PEDFEC',pic:''},{av:'A667PedSit',fld:'PEDSIT',pic:'@!'},{av:'A12580PedAlmc',fld:'PEDALMC',pic:'9'},{av:'A657PedCanEnt',fld:'PEDCANENT',pic:'ZZZZZ9.99'},{av:'A663PedFulEnt',fld:'PEDFULENT',pic:''},{av:'A665PedPre',fld:'PEDPRE',pic:'ZZZZZZZ9.999'},{av:'A669PedUni',fld:'PEDUNI',pic:'ZZZZZ9.99'},{av:'A659PedCum',fld:'PEDCUM',pic:'@!'},{av:'A660PedDto',fld:'PEDDTO',pic:'Z9.99'},{av:'AV24PedPri',fld:'vPEDPRI',pic:'9'},{av:'A664PedNumLin',fld:'PEDNUMLIN',pic:'ZZ9'}]");
      setEventMetadata("VALID_PEDCOD",",oparms:[{av:'O657PedCanEnt'},{av:'A661PedFec',fld:'PEDFEC',pic:''},{av:'A667PedSit',fld:'PEDSIT',pic:'@!'},{av:'A666PedPri',fld:'PEDPRI',pic:'9'},{av:'A12580PedAlmc',fld:'PEDALMC',pic:'9'},{av:'A657PedCanEnt',fld:'PEDCANENT',pic:'ZZZZZ9.99'},{av:'A663PedFulEnt',fld:'PEDFULENT',pic:''},{av:'A665PedPre',fld:'PEDPRE',pic:'ZZZZZZZ9.999'},{av:'A669PedUni',fld:'PEDUNI',pic:'ZZZZZ9.99'},{av:'A659PedCum',fld:'PEDCUM',pic:'@!'},{av:'A660PedDto',fld:'PEDDTO',pic:'Z9.99'},{av:'AV24PedPri',fld:'vPEDPRI',pic:'9'},{av:'A684PrdCanPen',fld:'PRDCANPEN',pic:'ZZZZZZ9.9999'},{av:'A664PedNumLin',fld:'PEDNUMLIN',pic:'ZZ9'}]}");
      setEventMetadata("VALID_ENTPRVNUM","{handler:'valid_Entprvnum',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'A665PedPre',fld:'PEDPRE',pic:'ZZZZZZZ9.999'},{av:'A660PedDto',fld:'PEDDTO',pic:'Z9.99'},{av:'A658PedCod',fld:'PEDCOD',pic:'ZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A719PrdNum',fld:'PRDNUM',pic:''},{av:'A6156EntPrvNum',fld:'ENTPRVNUM',pic:'ZZZZZ9'},{av:'Gx_BScreen',fld:'vGXBSCREEN',pic:'9'},{av:'A417EntPre',fld:'ENTPRE',pic:'ZZZZZZZ9.999'},{av:'AV18PrdNomX',fld:'vPRDNOMX',pic:''},{av:'A12716EntFabId',fld:'ENTFABID',pic:'ZZZZZ9'}]");
      setEventMetadata("VALID_ENTPRVNUM",",oparms:[{av:'A417EntPre',fld:'ENTPRE',pic:'ZZZZZZZ9.999'},{av:'AV18PrdNomX',fld:'vPRDNOMX',pic:''},{av:'A12716EntFabId',fld:'ENTFABID',pic:'ZZZZZ9'}]}");
      setEventMetadata("VALID_ENTUNIENT","{handler:'valid_Entunient',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'O657PedCanEnt'},{av:'O418EntUniEnt'},{av:'O704PrdExiAlm'},{av:'A704PrdExiAlm',fld:'PRDEXIALM',pic:'ZZZZZZ9.9999'},{av:'A418EntUniEnt',fld:'ENTUNIENT',pic:'ZZZZZ9.99'},{av:'A657PedCanEnt',fld:'PEDCANENT',pic:'ZZZZZ9.99'},{av:'A658PedCod',fld:'PEDCOD',pic:'ZZZZZZZ9'},{av:'A669PedUni',fld:'PEDUNI',pic:'ZZZZZ9.99'},{av:'A684PrdCanPen',fld:'PRDCANPEN',pic:'ZZZZZZ9.9999'},{av:'AV31OldExiAlm',fld:'vOLDEXIALM',pic:'ZZZZZZ9.9999'},{av:'AV32OldEntUni',fld:'vOLDENTUNI',pic:'ZZZZZ9.99'},{av:'AV21UniOld',fld:'vUNIOLD',pic:'ZZZZZ9.99'},{av:'A14041EntCump',fld:'ENTCUMP',pic:''}]");
      setEventMetadata("VALID_ENTUNIENT",",oparms:[{av:'A704PrdExiAlm',fld:'PRDEXIALM',pic:'ZZZZZZ9.9999'},{av:'AV31OldExiAlm',fld:'vOLDEXIALM',pic:'ZZZZZZ9.9999'},{av:'AV32OldEntUni',fld:'vOLDENTUNI',pic:'ZZZZZ9.99'},{av:'AV21UniOld',fld:'vUNIOLD',pic:'ZZZZZ9.99'},{av:'A657PedCanEnt',fld:'PEDCANENT',pic:'ZZZZZ9.99'},{av:'A14041EntCump',fld:'ENTCUMP',pic:''}]}");
      setEventMetadata("VALID_ENTPRE","{handler:'valid_Entpre',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'O724PrdPreAct'},{av:'O750PrdValStk'},{av:'O417EntPre'},{av:'A417EntPre',fld:'ENTPRE',pic:'ZZZZZZZ9.999'},{av:'A750PrdValStk',fld:'PRDVALSTK',pic:'ZZZZZZZ9.99'},{av:'A418EntUniEnt',fld:'ENTUNIENT',pic:'ZZZZZ9.99'},{av:'AV30OldEntPre',fld:'vOLDENTPRE',pic:'ZZZZZZZ9.999'},{av:'AV32OldEntUni',fld:'vOLDENTUNI',pic:'ZZZZZ9.99'},{av:'A704PrdExiAlm',fld:'PRDEXIALM',pic:'ZZZZZZ9.9999'},{av:'AV40Consumos',fld:'vCONSUMOS',pic:'ZZZ9'},{av:'A705PrdExiCC',fld:'PRDEXICC',pic:'ZZZZZZ9.9999'},{av:'A726PrdPreMed',fld:'PRDPREMED',pic:'ZZZZZZZ9.999'},{av:'AV39NoUpd',fld:'vNOUPD',pic:'ZZZ9'},{av:'A724PrdPreAct',fld:'PRDPREACT',pic:'ZZZZZZZ9.999'},{av:'A725PrdPreAnt',fld:'PRDPREANT',pic:'ZZZZZZZ9.999'},{av:'AV27PrecAnt',fld:'vPRECANT',pic:'ZZZZZZZ9.999'}]");
      setEventMetadata("VALID_ENTPRE",",oparms:[{av:'AV30OldEntPre',fld:'vOLDENTPRE',pic:'ZZZZZZZ9.999'},{av:'AV27PrecAnt',fld:'vPRECANT',pic:'ZZZZZZZ9.999'},{av:'A750PrdValStk',fld:'PRDVALSTK',pic:'ZZZZZZZ9.99'},{av:'A726PrdPreMed',fld:'PRDPREMED',pic:'ZZZZZZZ9.999'},{av:'A724PrdPreAct',fld:'PRDPREACT',pic:'ZZZZZZZ9.999'},{av:'A725PrdPreAnt',fld:'PRDPREANT',pic:'ZZZZZZZ9.999'}]}");
      setEventMetadata("VALID_ENTUNIREM","{handler:'valid_Entunirem',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'O418EntUniEnt'},{av:'O419EntUniRem'},{av:'A419EntUniRem',fld:'ENTUNIREM',pic:'ZZZZZ9.9999'},{av:'A418EntUniEnt',fld:'ENTUNIENT',pic:'ZZZZZ9.99'},{av:'A658PedCod',fld:'PEDCOD',pic:'ZZZZZZZ9'},{av:'AV33OldRemanente',fld:'vOLDREMANENTE',pic:'ZZZZZ9.9999'}]");
      setEventMetadata("VALID_ENTUNIREM",",oparms:[{av:'A419EntUniRem',fld:'ENTUNIREM',pic:'ZZZZZ9.9999'},{av:'AV33OldRemanente',fld:'vOLDREMANENTE',pic:'ZZZZZ9.9999'},{av:'edtEntPedCum_Enabled',ctrl:'ENTPEDCUM',prop:'Enabled'},{av:'edtEntFecEnt_Enabled',ctrl:'ENTFECENT',prop:'Enabled'},{av:'edtAlbaran_Enabled',ctrl:'ALBARAN',prop:'Enabled'},{av:'edtEntNAlbar_Enabled',ctrl:'ENTNALBAR',prop:'Enabled'},{av:'edtEntPrvNum_Enabled',ctrl:'ENTPRVNUM',prop:'Enabled'},{av:'edtEntUniEnt_Enabled',ctrl:'ENTUNIENT',prop:'Enabled'},{av:'edtEntLotN_Enabled',ctrl:'ENTLOTN',prop:'Enabled'},{av:'edtEntPre_Enabled',ctrl:'ENTPRE',prop:'Enabled'},{av:'edtEntFVal_Enabled',ctrl:'ENTFVAL',prop:'Enabled'}]}");
      setEventMetadata("VALID_ENTLOTN","{handler:'valid_Entlotn',iparms:[{av:'O5686EntLotN'},{av:'A5686EntLotN',fld:'ENTLOTN',pic:''},{av:'AV35oldlote',fld:'vOLDLOTE',pic:''}]");
      setEventMetadata("VALID_ENTLOTN",",oparms:[{av:'AV35oldlote',fld:'vOLDLOTE',pic:''}]}");
      setEventMetadata("VALID_PEDCANENT","{handler:'valid_Pedcanent',iparms:[]");
      setEventMetadata("VALID_PEDCANENT",",oparms:[]}");
      setEventMetadata("VALID_PEDUNI","{handler:'valid_Peduni',iparms:[]");
      setEventMetadata("VALID_PEDUNI",",oparms:[]}");
      setEventMetadata("VALID_PRDCANPEN","{handler:'valid_Prdcanpen',iparms:[]");
      setEventMetadata("VALID_PRDCANPEN",",oparms:[]}");
      setEventMetadata("VALIDV_PGMNAME","{handler:'validv_Pgmname',iparms:[]");
      setEventMetadata("VALIDV_PGMNAME",",oparms:[]}");
      setEventMetadata("VALID_ENTPEDCUM","{handler:'valid_Entpedcum',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'O3404EntPedCum'},{av:'Gx_BScreen',fld:'vGXBSCREEN',pic:'9'},{av:'A14041EntCump',fld:'ENTCUMP',pic:''},{av:'A658PedCod',fld:'PEDCOD',pic:'ZZZZZZZ9'},{av:'A3404EntPedCum',fld:'ENTPEDCUM',pic:'@!'}]");
      setEventMetadata("VALID_ENTPEDCUM",",oparms:[{av:'A3404EntPedCum',fld:'ENTPEDCUM',pic:'@!'}]}");
      setEventMetadata("VALID_ENTCUMP","{handler:'valid_Entcump',iparms:[]");
      setEventMetadata("VALID_ENTCUMP",",oparms:[]}");
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
      pr_default.close(4);
      pr_default.close(20);
      pr_default.close(21);
   }

   /* Aggregate/select formulas */
   public int getPedNumLin0( String E396EmprCod ,
                             int E658PedCod )
   {
      Gx_cnt = 0 ;
      Gx_first = true ;
      /* Using cursor T01T629 */
      pr_default.execute(25, new Object[] {E396EmprCod, Boolean.valueOf(nA658PedCod), Integer.valueOf(E658PedCod)});
      while ( (pr_default.getStatus(25) != 101) )
      {
         if ( ( ( GXutil.strcmp(T01T629_A659PedCum[0], httpContext.getMessage( httpContext.getMessage( "N", ""), "")) == 0 ) ) && ( ( GXutil.strcmp(E396EmprCod, E396EmprCod) == 0 ) && ( E658PedCod == E658PedCod ) ) )
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
         pr_default.readNext(25);
      }
      pr_default.close(25);
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
      Z419EntUniRem = DecimalUtil.ZERO ;
      Z417EntPre = DecimalUtil.ZERO ;
      Z3404EntPedCum = "" ;
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
      Z713PrdFulEnt = GXutil.nullDate() ;
      Z709PrdFecPre = GXutil.nullDate() ;
      Z725PrdPreAnt = DecimalUtil.ZERO ;
      Z724PrdPreAct = DecimalUtil.ZERO ;
      Z684PrdCanPen = DecimalUtil.ZERO ;
      Z718PrdNom = "" ;
      Z698PrdDetPar = "" ;
      Z729PrdRotRea = DecimalUtil.ZERO ;
      Z727PrdRec = "" ;
      Z5255PrdPreAc2 = DecimalUtil.ZERO ;
      Z705PrdExiCC = DecimalUtil.ZERO ;
      Z663PedFulEnt = GXutil.nullDate() ;
      Z665PedPre = DecimalUtil.ZERO ;
      Z669PedUni = DecimalUtil.ZERO ;
      Z659PedCum = "" ;
      Z660PedDto = DecimalUtil.ZERO ;
      O3404EntPedCum = "" ;
      O419EntUniRem = DecimalUtil.ZERO ;
      O418EntUniEnt = DecimalUtil.ZERO ;
      O724PrdPreAct = DecimalUtil.ZERO ;
      O750PrdValStk = DecimalUtil.ZERO ;
      O657PedCanEnt = DecimalUtil.ZERO ;
      O415EntFecEnt = GXutil.nullDate() ;
      O417EntPre = DecimalUtil.ZERO ;
      O5686EntLotN = "" ;
      O704PrdExiAlm = DecimalUtil.ZERO ;
      N3404EntPedCum = "" ;
      N415EntFecEnt = GXutil.nullDate() ;
      N11Albaran = "" ;
      N12857EntNAlbar = "" ;
      N418EntUniEnt = DecimalUtil.ZERO ;
      N5686EntLotN = "" ;
      N417EntPre = DecimalUtil.ZERO ;
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
      AV24PedPri = "" ;
      A718PrdNom = "" ;
      AV46Pgmname = "" ;
      AV36Usurcod = "" ;
      AV37Station = "" ;
      AV17Inc_obs = "" ;
      AV7EmprCod = "" ;
      A665PedPre = DecimalUtil.ZERO ;
      A660PedDto = DecimalUtil.ZERO ;
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
      A11Albaran = "" ;
      A12857EntNAlbar = "" ;
      lblTextblockpedcod_Jsonclick = "" ;
      sStyleString = "" ;
      AV42promptPedido = "" ;
      AV49Promptpedido_GXI = "" ;
      sImgUrl = "" ;
      imgprompt_6156_gximage = "" ;
      A419EntUniRem = DecimalUtil.ZERO ;
      A5686EntLotN = "" ;
      A5685EntFVal = GXutil.nullDate() ;
      ucDvpanel_unnamedtable1 = new com.genexus.webpanels.GXUserControl();
      A657PedCanEnt = DecimalUtil.ZERO ;
      A669PedUni = DecimalUtil.ZERO ;
      A684PrdCanPen = DecimalUtil.ZERO ;
      bttBtntrn_enter_Jsonclick = "" ;
      bttBtntrn_cancel_Jsonclick = "" ;
      bttBtntrn_delete_Jsonclick = "" ;
      A3404EntPedCum = "" ;
      A14041EntCump = "" ;
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
      A713PrdFulEnt = GXutil.nullDate() ;
      A709PrdFecPre = GXutil.nullDate() ;
      A725PrdPreAnt = DecimalUtil.ZERO ;
      A724PrdPreAct = DecimalUtil.ZERO ;
      A698PrdDetPar = "" ;
      A729PrdRotRea = DecimalUtil.ZERO ;
      A727PrdRec = "" ;
      A5255PrdPreAc2 = DecimalUtil.ZERO ;
      A705PrdExiCC = DecimalUtil.ZERO ;
      A663PedFulEnt = GXutil.nullDate() ;
      A659PedCum = "" ;
      A14040PrdUltMovF = GXutil.nullDate() ;
      A3835UltFecCCs = GXutil.nullDate() ;
      A704PrdExiAlm = DecimalUtil.ZERO ;
      A666PedPri = "" ;
      AV30OldEntPre = DecimalUtil.ZERO ;
      AV31OldExiAlm = DecimalUtil.ZERO ;
      AV32OldEntUni = DecimalUtil.ZERO ;
      AV33OldRemanente = DecimalUtil.ZERO ;
      AV34oldEntFecent = GXutil.nullDate() ;
      AV35oldlote = "" ;
      AV21UniOld = DecimalUtil.ZERO ;
      AV20FecAnt = GXutil.nullDate() ;
      AV27PrecAnt = DecimalUtil.ZERO ;
      A750PrdValStk = DecimalUtil.ZERO ;
      AV18PrdNomX = "" ;
      AV15msg_ctrl_fecha = "" ;
      AV28Fecha = GXutil.nullDate() ;
      Gx_date = GXutil.nullDate() ;
      A407EmprNom = "" ;
      A661PedFec = GXutil.nullDate() ;
      A667PedSit = "" ;
      A794PrvNom = "" ;
      A913StockRem = DecimalUtil.ZERO ;
      Dvpanel_tableattributes_Objectcall = "" ;
      Dvpanel_tableattributes_Class = "" ;
      Dvpanel_tableattributes_Height = "" ;
      Dvpanel_unnamedtable1_Objectcall = "" ;
      Dvpanel_unnamedtable1_Class = "" ;
      Dvpanel_unnamedtable1_Height = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      hsh = "" ;
      sMode42 = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      AV38EmprNom = "" ;
      AV10WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext9 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV11TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV12WebSession = httpContext.getWebSession();
      AV14TrnContextAtt = new app.wwpbaseobjects.SdtWWPTransactionContext_Attribute(remoteHandle, context);
      Z407EmprNom = "" ;
      Z704PrdExiAlm = DecimalUtil.ZERO ;
      Z750PrdValStk = DecimalUtil.ZERO ;
      Z794PrvNom = "" ;
      Z913StockRem = DecimalUtil.ZERO ;
      Z661PedFec = GXutil.nullDate() ;
      Z667PedSit = "" ;
      Z666PedPri = "" ;
      Z657PedCanEnt = DecimalUtil.ZERO ;
      T01T64_A407EmprNom = new String[] {""} ;
      T01T64_n407EmprNom = new boolean[] {false} ;
      T01T64_A3915EmpNumDec = new byte[1] ;
      T01T64_n3915EmpNumDec = new boolean[] {false} ;
      T01T66_A847UltLinEnt = new short[1] ;
      T01T66_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01T66_A726PrdPreMed = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01T66_A750PrdValStk = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01T66_A713PrdFulEnt = new java.util.Date[] {GXutil.nullDate()} ;
      T01T66_A709PrdFecPre = new java.util.Date[] {GXutil.nullDate()} ;
      T01T66_A725PrdPreAnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01T66_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01T66_A684PrdCanPen = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01T66_A718PrdNom = new String[] {""} ;
      T01T66_A698PrdDetPar = new String[] {""} ;
      T01T66_A729PrdRotRea = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01T66_A727PrdRec = new String[] {""} ;
      T01T66_A5255PrdPreAc2 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01T66_A705PrdExiCC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01T66_A795PrvNum = new int[1] ;
      T01T66_A856ValCod = new byte[1] ;
      T01T610_A794PrvNom = new String[] {""} ;
      T01T610_n794PrvNom = new boolean[] {false} ;
      T01T610_A800PrvPri = new byte[1] ;
      T01T610_n800PrvPri = new boolean[] {false} ;
      T01T612_A913StockRem = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01T612_n913StockRem = new boolean[] {false} ;
      T01T67_A661PedFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01T67_A667PedSit = new String[] {""} ;
      T01T67_A666PedPri = new String[] {""} ;
      T01T67_A12580PedAlmc = new byte[1] ;
      T01T69_A657PedCanEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01T69_A663PedFulEnt = new java.util.Date[] {GXutil.nullDate()} ;
      T01T69_A665PedPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01T69_A669PedUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01T69_A659PedCum = new String[] {""} ;
      T01T69_A660PedDto = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01T614_A597LinEnt = new short[1] ;
      T01T614_A847UltLinEnt = new short[1] ;
      T01T614_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01T614_A411EntCon = new byte[1] ;
      T01T614_A657PedCanEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01T614_A663PedFulEnt = new java.util.Date[] {GXutil.nullDate()} ;
      T01T614_A726PrdPreMed = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01T614_A750PrdValStk = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01T614_A713PrdFulEnt = new java.util.Date[] {GXutil.nullDate()} ;
      T01T614_A709PrdFecPre = new java.util.Date[] {GXutil.nullDate()} ;
      T01T614_A725PrdPreAnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01T614_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01T614_A684PrdCanPen = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01T614_A419EntUniRem = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01T614_A417EntPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01T614_A3404EntPedCum = new String[] {""} ;
      T01T614_A718PrdNom = new String[] {""} ;
      T01T614_A794PrvNom = new String[] {""} ;
      T01T614_n794PrvNom = new boolean[] {false} ;
      T01T614_A698PrdDetPar = new String[] {""} ;
      T01T614_A729PrdRotRea = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01T614_A727PrdRec = new String[] {""} ;
      T01T614_A407EmprNom = new String[] {""} ;
      T01T614_n407EmprNom = new boolean[] {false} ;
      T01T614_A800PrvPri = new byte[1] ;
      T01T614_n800PrvPri = new boolean[] {false} ;
      T01T614_A3915EmpNumDec = new byte[1] ;
      T01T614_n3915EmpNumDec = new boolean[] {false} ;
      T01T614_A5255PrdPreAc2 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01T614_A705PrdExiCC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01T614_A415EntFecEnt = new java.util.Date[] {GXutil.nullDate()} ;
      T01T614_A11Albaran = new String[] {""} ;
      T01T614_A12857EntNAlbar = new String[] {""} ;
      T01T614_A6156EntPrvNum = new int[1] ;
      T01T614_n6156EntPrvNum = new boolean[] {false} ;
      T01T614_A661PedFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01T614_A418EntUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01T614_A665PedPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01T614_A669PedUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01T614_A416EntNumCon = new short[1] ;
      T01T614_A5686EntLotN = new String[] {""} ;
      T01T614_A5685EntFVal = new java.util.Date[] {GXutil.nullDate()} ;
      T01T614_A414EntEti = new byte[1] ;
      T01T614_A413EntConIni = new int[1] ;
      T01T614_A412EntConFin = new int[1] ;
      T01T614_A659PedCum = new String[] {""} ;
      T01T614_A667PedSit = new String[] {""} ;
      T01T614_A666PedPri = new String[] {""} ;
      T01T614_A660PedDto = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01T614_A5691EntBnc = new String[] {""} ;
      T01T614_A7695EntCC = new String[] {""} ;
      T01T614_A7696EntCCoCod = new short[1] ;
      T01T614_A10782EntUniAlb = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01T614_A10783EntObs = new String[] {""} ;
      T01T614_A10187EntRemNro = new String[] {""} ;
      T01T614_A10186EntRemFch = new java.util.Date[] {GXutil.nullDate()} ;
      T01T614_A10185EntRemSuc = new String[] {""} ;
      T01T614_A10184EntRemTpo = new String[] {""} ;
      T01T614_A12580PedAlmc = new byte[1] ;
      T01T614_A12716EntFabId = new int[1] ;
      T01T614_A13235EntLoteID = new long[1] ;
      T01T614_A13456EntUbicaci = new String[] {""} ;
      T01T614_A5690EntHfCon = new java.util.Date[] {GXutil.nullDate()} ;
      T01T614_A5689EntFfCon = new java.util.Date[] {GXutil.nullDate()} ;
      T01T614_A5688EntHiCon = new java.util.Date[] {GXutil.nullDate()} ;
      T01T614_A5687EntFiCon = new java.util.Date[] {GXutil.nullDate()} ;
      T01T614_A14035EntNEmb = new byte[1] ;
      T01T614_A396EmprCod = new String[] {""} ;
      T01T614_A719PrdNum = new String[] {""} ;
      T01T614_A658PedCod = new int[1] ;
      T01T614_n658PedCod = new boolean[] {false} ;
      T01T614_A795PrvNum = new int[1] ;
      T01T614_A856ValCod = new byte[1] ;
      T01T614_A913StockRem = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01T614_n913StockRem = new boolean[] {false} ;
      T01T615_A661PedFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01T615_A667PedSit = new String[] {""} ;
      T01T615_A666PedPri = new String[] {""} ;
      T01T615_A12580PedAlmc = new byte[1] ;
      T01T616_A396EmprCod = new String[] {""} ;
      T01T616_A719PrdNum = new String[] {""} ;
      T01T616_A597LinEnt = new short[1] ;
      T01T63_A597LinEnt = new short[1] ;
      T01T63_A411EntCon = new byte[1] ;
      T01T63_A419EntUniRem = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01T63_A417EntPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01T63_A3404EntPedCum = new String[] {""} ;
      T01T63_A415EntFecEnt = new java.util.Date[] {GXutil.nullDate()} ;
      T01T63_A11Albaran = new String[] {""} ;
      T01T63_A12857EntNAlbar = new String[] {""} ;
      T01T63_A6156EntPrvNum = new int[1] ;
      T01T63_n6156EntPrvNum = new boolean[] {false} ;
      T01T63_A418EntUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01T63_A416EntNumCon = new short[1] ;
      T01T63_A5686EntLotN = new String[] {""} ;
      T01T63_A5685EntFVal = new java.util.Date[] {GXutil.nullDate()} ;
      T01T63_A414EntEti = new byte[1] ;
      T01T63_A413EntConIni = new int[1] ;
      T01T63_A412EntConFin = new int[1] ;
      T01T63_A5691EntBnc = new String[] {""} ;
      T01T63_A7695EntCC = new String[] {""} ;
      T01T63_A7696EntCCoCod = new short[1] ;
      T01T63_A10782EntUniAlb = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01T63_A10783EntObs = new String[] {""} ;
      T01T63_A10187EntRemNro = new String[] {""} ;
      T01T63_A10186EntRemFch = new java.util.Date[] {GXutil.nullDate()} ;
      T01T63_A10185EntRemSuc = new String[] {""} ;
      T01T63_A10184EntRemTpo = new String[] {""} ;
      T01T63_A12716EntFabId = new int[1] ;
      T01T63_A13235EntLoteID = new long[1] ;
      T01T63_A13456EntUbicaci = new String[] {""} ;
      T01T63_A5690EntHfCon = new java.util.Date[] {GXutil.nullDate()} ;
      T01T63_A5689EntFfCon = new java.util.Date[] {GXutil.nullDate()} ;
      T01T63_A5688EntHiCon = new java.util.Date[] {GXutil.nullDate()} ;
      T01T63_A5687EntFiCon = new java.util.Date[] {GXutil.nullDate()} ;
      T01T63_A14035EntNEmb = new byte[1] ;
      T01T63_A396EmprCod = new String[] {""} ;
      T01T63_A719PrdNum = new String[] {""} ;
      T01T63_A658PedCod = new int[1] ;
      T01T63_n658PedCod = new boolean[] {false} ;
      T01T617_A396EmprCod = new String[] {""} ;
      T01T617_A719PrdNum = new String[] {""} ;
      T01T617_A597LinEnt = new short[1] ;
      T01T617_A411EntCon = new byte[1] ;
      T01T618_A396EmprCod = new String[] {""} ;
      T01T618_A719PrdNum = new String[] {""} ;
      T01T618_A597LinEnt = new short[1] ;
      T01T618_A411EntCon = new byte[1] ;
      T01T62_A597LinEnt = new short[1] ;
      T01T62_A411EntCon = new byte[1] ;
      T01T62_A419EntUniRem = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01T62_A417EntPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01T62_A3404EntPedCum = new String[] {""} ;
      T01T62_A415EntFecEnt = new java.util.Date[] {GXutil.nullDate()} ;
      T01T62_A11Albaran = new String[] {""} ;
      T01T62_A12857EntNAlbar = new String[] {""} ;
      T01T62_A6156EntPrvNum = new int[1] ;
      T01T62_n6156EntPrvNum = new boolean[] {false} ;
      T01T62_A418EntUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01T62_A416EntNumCon = new short[1] ;
      T01T62_A5686EntLotN = new String[] {""} ;
      T01T62_A5685EntFVal = new java.util.Date[] {GXutil.nullDate()} ;
      T01T62_A414EntEti = new byte[1] ;
      T01T62_A413EntConIni = new int[1] ;
      T01T62_A412EntConFin = new int[1] ;
      T01T62_A5691EntBnc = new String[] {""} ;
      T01T62_A7695EntCC = new String[] {""} ;
      T01T62_A7696EntCCoCod = new short[1] ;
      T01T62_A10782EntUniAlb = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01T62_A10783EntObs = new String[] {""} ;
      T01T62_A10187EntRemNro = new String[] {""} ;
      T01T62_A10186EntRemFch = new java.util.Date[] {GXutil.nullDate()} ;
      T01T62_A10185EntRemSuc = new String[] {""} ;
      T01T62_A10184EntRemTpo = new String[] {""} ;
      T01T62_A12716EntFabId = new int[1] ;
      T01T62_A13235EntLoteID = new long[1] ;
      T01T62_A13456EntUbicaci = new String[] {""} ;
      T01T62_A5690EntHfCon = new java.util.Date[] {GXutil.nullDate()} ;
      T01T62_A5689EntFfCon = new java.util.Date[] {GXutil.nullDate()} ;
      T01T62_A5688EntHiCon = new java.util.Date[] {GXutil.nullDate()} ;
      T01T62_A5687EntFiCon = new java.util.Date[] {GXutil.nullDate()} ;
      T01T62_A14035EntNEmb = new byte[1] ;
      T01T62_A396EmprCod = new String[] {""} ;
      T01T62_A719PrdNum = new String[] {""} ;
      T01T62_A658PedCod = new int[1] ;
      T01T62_n658PedCod = new boolean[] {false} ;
      T01T619_A847UltLinEnt = new short[1] ;
      T01T619_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01T619_A726PrdPreMed = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01T619_A750PrdValStk = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01T619_A713PrdFulEnt = new java.util.Date[] {GXutil.nullDate()} ;
      T01T619_A709PrdFecPre = new java.util.Date[] {GXutil.nullDate()} ;
      T01T619_A725PrdPreAnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01T619_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01T619_A684PrdCanPen = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01T619_A718PrdNom = new String[] {""} ;
      T01T619_A698PrdDetPar = new String[] {""} ;
      T01T619_A729PrdRotRea = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01T619_A727PrdRec = new String[] {""} ;
      T01T619_A5255PrdPreAc2 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01T619_A705PrdExiCC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01T619_A795PrvNum = new int[1] ;
      T01T619_A856ValCod = new byte[1] ;
      T01T620_A657PedCanEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01T620_A663PedFulEnt = new java.util.Date[] {GXutil.nullDate()} ;
      T01T620_A665PedPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01T620_A669PedUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01T620_A659PedCum = new String[] {""} ;
      T01T620_A660PedDto = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01T624_A661PedFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01T624_A667PedSit = new String[] {""} ;
      T01T624_A666PedPri = new String[] {""} ;
      T01T624_A12580PedAlmc = new byte[1] ;
      T01T625_A657PedCanEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01T625_A663PedFulEnt = new java.util.Date[] {GXutil.nullDate()} ;
      T01T625_A665PedPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01T625_A669PedUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01T625_A659PedCum = new String[] {""} ;
      T01T625_A660PedDto = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01T628_A396EmprCod = new String[] {""} ;
      T01T628_A719PrdNum = new String[] {""} ;
      T01T628_A597LinEnt = new short[1] ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      i415EntFecEnt = GXutil.nullDate() ;
      i10184EntRemTpo = "" ;
      GXt_date10 = GXutil.nullDate() ;
      GXv_int18 = new short[1] ;
      GXv_int15 = new short[1] ;
      GXv_int20 = new byte[1] ;
      GXv_int6 = new byte[1] ;
      GXv_date11 = new java.util.Date[1] ;
      GXv_decimal17 = new java.math.BigDecimal[1] ;
      GXv_int21 = new byte[1] ;
      GXv_char26 = new String[1] ;
      GXv_char24 = new String[1] ;
      GXv_char14 = new String[1] ;
      GXv_char4 = new String[1] ;
      GXv_decimal16 = new java.math.BigDecimal[1] ;
      GXv_decimal13 = new java.math.BigDecimal[1] ;
      GXv_int8 = new int[1] ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      GXv_char28 = new String[1] ;
      GXv_int25 = new int[1] ;
      GXv_char27 = new String[1] ;
      GXv_date23 = new java.util.Date[1] ;
      GXv_decimal22 = new java.math.BigDecimal[1] ;
      GXv_int19 = new short[1] ;
      ZV28Fecha = GXutil.nullDate() ;
      ZV34oldEntFecent = GXutil.nullDate() ;
      ZV20FecAnt = GXutil.nullDate() ;
      ZV15msg_ctrl_fecha = "" ;
      ZO657PedCanEnt = DecimalUtil.ZERO ;
      ZV24PedPri = "" ;
      GXt_decimal12 = DecimalUtil.ZERO ;
      GXv_decimal29 = new java.math.BigDecimal[1] ;
      GXt_char1 = "" ;
      GXv_char32 = new String[1] ;
      GXv_int30 = new int[1] ;
      GXv_char31 = new String[1] ;
      ZV18PrdNomX = "" ;
      ZV31OldExiAlm = DecimalUtil.ZERO ;
      ZV32OldEntUni = DecimalUtil.ZERO ;
      ZV21UniOld = DecimalUtil.ZERO ;
      Z14041EntCump = "" ;
      ZV30OldEntPre = DecimalUtil.ZERO ;
      ZV27PrecAnt = DecimalUtil.ZERO ;
      ZV33OldRemanente = DecimalUtil.ZERO ;
      ZV35oldlote = "" ;
      E396EmprCod = "" ;
      T01T629_A396EmprCod = new String[] {""} ;
      T01T629_A658PedCod = new int[1] ;
      T01T629_n658PedCod = new boolean[] {false} ;
      T01T629_A719PrdNum = new String[] {""} ;
      T01T629_A659PedCum = new String[] {""} ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.entradaproductoalmacen_trn__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.entradaproductoalmacen_trn__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.entradaproductoalmacen_trn__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.entradaproductoalmacen_trn__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.entradaproductoalmacen_trn__default(),
         new Object[] {
             new Object[] {
            T01T62_A597LinEnt, T01T62_A411EntCon, T01T62_A419EntUniRem, T01T62_A417EntPre, T01T62_A3404EntPedCum, T01T62_A415EntFecEnt, T01T62_A11Albaran, T01T62_A12857EntNAlbar, T01T62_A6156EntPrvNum, T01T62_n6156EntPrvNum,
            T01T62_A418EntUniEnt, T01T62_A416EntNumCon, T01T62_A5686EntLotN, T01T62_A5685EntFVal, T01T62_A414EntEti, T01T62_A413EntConIni, T01T62_A412EntConFin, T01T62_A5691EntBnc, T01T62_A7695EntCC, T01T62_A7696EntCCoCod,
            T01T62_A10782EntUniAlb, T01T62_A10783EntObs, T01T62_A10187EntRemNro, T01T62_A10186EntRemFch, T01T62_A10185EntRemSuc, T01T62_A10184EntRemTpo, T01T62_A12716EntFabId, T01T62_A13235EntLoteID, T01T62_A13456EntUbicaci, T01T62_A5690EntHfCon,
            T01T62_A5689EntFfCon, T01T62_A5688EntHiCon, T01T62_A5687EntFiCon, T01T62_A14035EntNEmb, T01T62_A396EmprCod, T01T62_A719PrdNum, T01T62_A658PedCod, T01T62_n658PedCod
            }
            , new Object[] {
            T01T63_A597LinEnt, T01T63_A411EntCon, T01T63_A419EntUniRem, T01T63_A417EntPre, T01T63_A3404EntPedCum, T01T63_A415EntFecEnt, T01T63_A11Albaran, T01T63_A12857EntNAlbar, T01T63_A6156EntPrvNum, T01T63_n6156EntPrvNum,
            T01T63_A418EntUniEnt, T01T63_A416EntNumCon, T01T63_A5686EntLotN, T01T63_A5685EntFVal, T01T63_A414EntEti, T01T63_A413EntConIni, T01T63_A412EntConFin, T01T63_A5691EntBnc, T01T63_A7695EntCC, T01T63_A7696EntCCoCod,
            T01T63_A10782EntUniAlb, T01T63_A10783EntObs, T01T63_A10187EntRemNro, T01T63_A10186EntRemFch, T01T63_A10185EntRemSuc, T01T63_A10184EntRemTpo, T01T63_A12716EntFabId, T01T63_A13235EntLoteID, T01T63_A13456EntUbicaci, T01T63_A5690EntHfCon,
            T01T63_A5689EntFfCon, T01T63_A5688EntHiCon, T01T63_A5687EntFiCon, T01T63_A14035EntNEmb, T01T63_A396EmprCod, T01T63_A719PrdNum, T01T63_A658PedCod, T01T63_n658PedCod
            }
            , new Object[] {
            T01T64_A407EmprNom, T01T64_n407EmprNom, T01T64_A3915EmpNumDec, T01T64_n3915EmpNumDec
            }
            , new Object[] {
            T01T65_A847UltLinEnt, T01T65_A704PrdExiAlm, T01T65_A726PrdPreMed, T01T65_A750PrdValStk, T01T65_A713PrdFulEnt, T01T65_A709PrdFecPre, T01T65_A725PrdPreAnt, T01T65_A724PrdPreAct, T01T65_A684PrdCanPen, T01T65_A718PrdNom,
            T01T65_A698PrdDetPar, T01T65_A729PrdRotRea, T01T65_A727PrdRec, T01T65_A5255PrdPreAc2, T01T65_A705PrdExiCC, T01T65_A795PrvNum, T01T65_A856ValCod
            }
            , new Object[] {
            T01T66_A847UltLinEnt, T01T66_A704PrdExiAlm, T01T66_A726PrdPreMed, T01T66_A750PrdValStk, T01T66_A713PrdFulEnt, T01T66_A709PrdFecPre, T01T66_A725PrdPreAnt, T01T66_A724PrdPreAct, T01T66_A684PrdCanPen, T01T66_A718PrdNom,
            T01T66_A698PrdDetPar, T01T66_A729PrdRotRea, T01T66_A727PrdRec, T01T66_A5255PrdPreAc2, T01T66_A705PrdExiCC, T01T66_A795PrvNum, T01T66_A856ValCod
            }
            , new Object[] {
            T01T67_A661PedFec, T01T67_A667PedSit, T01T67_A666PedPri, T01T67_A12580PedAlmc
            }
            , new Object[] {
            T01T68_A657PedCanEnt, T01T68_A663PedFulEnt, T01T68_A665PedPre, T01T68_A669PedUni, T01T68_A659PedCum, T01T68_A660PedDto
            }
            , new Object[] {
            T01T69_A657PedCanEnt, T01T69_A663PedFulEnt, T01T69_A665PedPre, T01T69_A669PedUni, T01T69_A659PedCum, T01T69_A660PedDto
            }
            , new Object[] {
            T01T610_A794PrvNom, T01T610_n794PrvNom, T01T610_A800PrvPri, T01T610_n800PrvPri
            }
            , new Object[] {
            T01T612_A913StockRem, T01T612_n913StockRem
            }
            , new Object[] {
            T01T614_A597LinEnt, T01T614_A847UltLinEnt, T01T614_A704PrdExiAlm, T01T614_A411EntCon, T01T614_A657PedCanEnt, T01T614_A663PedFulEnt, T01T614_A726PrdPreMed, T01T614_A750PrdValStk, T01T614_A713PrdFulEnt, T01T614_A709PrdFecPre,
            T01T614_A725PrdPreAnt, T01T614_A724PrdPreAct, T01T614_A684PrdCanPen, T01T614_A419EntUniRem, T01T614_A417EntPre, T01T614_A3404EntPedCum, T01T614_A718PrdNom, T01T614_A794PrvNom, T01T614_n794PrvNom, T01T614_A698PrdDetPar,
            T01T614_A729PrdRotRea, T01T614_A727PrdRec, T01T614_A407EmprNom, T01T614_n407EmprNom, T01T614_A800PrvPri, T01T614_n800PrvPri, T01T614_A3915EmpNumDec, T01T614_n3915EmpNumDec, T01T614_A5255PrdPreAc2, T01T614_A705PrdExiCC,
            T01T614_A415EntFecEnt, T01T614_A11Albaran, T01T614_A12857EntNAlbar, T01T614_A6156EntPrvNum, T01T614_n6156EntPrvNum, T01T614_A661PedFec, T01T614_A418EntUniEnt, T01T614_A665PedPre, T01T614_A669PedUni, T01T614_A416EntNumCon,
            T01T614_A5686EntLotN, T01T614_A5685EntFVal, T01T614_A414EntEti, T01T614_A413EntConIni, T01T614_A412EntConFin, T01T614_A659PedCum, T01T614_A667PedSit, T01T614_A666PedPri, T01T614_A660PedDto, T01T614_A5691EntBnc,
            T01T614_A7695EntCC, T01T614_A7696EntCCoCod, T01T614_A10782EntUniAlb, T01T614_A10783EntObs, T01T614_A10187EntRemNro, T01T614_A10186EntRemFch, T01T614_A10185EntRemSuc, T01T614_A10184EntRemTpo, T01T614_A12580PedAlmc, T01T614_A12716EntFabId,
            T01T614_A13235EntLoteID, T01T614_A13456EntUbicaci, T01T614_A5690EntHfCon, T01T614_A5689EntFfCon, T01T614_A5688EntHiCon, T01T614_A5687EntFiCon, T01T614_A14035EntNEmb, T01T614_A396EmprCod, T01T614_A719PrdNum, T01T614_A658PedCod,
            T01T614_n658PedCod, T01T614_A795PrvNum, T01T614_A856ValCod, T01T614_A913StockRem, T01T614_n913StockRem
            }
            , new Object[] {
            T01T615_A661PedFec, T01T615_A667PedSit, T01T615_A666PedPri, T01T615_A12580PedAlmc
            }
            , new Object[] {
            T01T616_A396EmprCod, T01T616_A719PrdNum, T01T616_A597LinEnt
            }
            , new Object[] {
            T01T617_A396EmprCod, T01T617_A719PrdNum, T01T617_A597LinEnt, T01T617_A411EntCon
            }
            , new Object[] {
            T01T618_A396EmprCod, T01T618_A719PrdNum, T01T618_A597LinEnt, T01T618_A411EntCon
            }
            , new Object[] {
            T01T619_A847UltLinEnt, T01T619_A704PrdExiAlm, T01T619_A726PrdPreMed, T01T619_A750PrdValStk, T01T619_A713PrdFulEnt, T01T619_A709PrdFecPre, T01T619_A725PrdPreAnt, T01T619_A724PrdPreAct, T01T619_A684PrdCanPen, T01T619_A718PrdNom,
            T01T619_A698PrdDetPar, T01T619_A729PrdRotRea, T01T619_A727PrdRec, T01T619_A5255PrdPreAc2, T01T619_A705PrdExiCC, T01T619_A795PrvNum, T01T619_A856ValCod
            }
            , new Object[] {
            T01T620_A657PedCanEnt, T01T620_A663PedFulEnt, T01T620_A665PedPre, T01T620_A669PedUni, T01T620_A659PedCum, T01T620_A660PedDto
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01T624_A661PedFec, T01T624_A667PedSit, T01T624_A666PedPri, T01T624_A12580PedAlmc
            }
            , new Object[] {
            T01T625_A657PedCanEnt, T01T625_A663PedFulEnt, T01T625_A665PedPre, T01T625_A669PedUni, T01T625_A659PedCum, T01T625_A660PedDto
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01T628_A396EmprCod, T01T628_A719PrdNum, T01T628_A597LinEnt
            }
            , new Object[] {
            T01T629_A396EmprCod, T01T629_A658PedCod, T01T629_A719PrdNum, T01T629_A659PedCum
            }
         }
      );
      Gx_date = GXutil.today( ) ;
      AV46Pgmname = "EntradaProductoAlmacen_TRN" ;
      Z411EntCon = (byte)(0) ;
      A411EntCon = (byte)(0) ;
      i411EntCon = (byte)(0) ;
      Z3404EntPedCum = httpContext.getMessage( "N", "") ;
      O3404EntPedCum = httpContext.getMessage( "N", "") ;
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
      i6156EntPrvNum = 0 ;
      n6156EntPrvNum = false ;
      A6156EntPrvNum = 0 ;
      n6156EntPrvNum = false ;
      Z12716EntFabId = 0 ;
      A12716EntFabId = 0 ;
   }

   private byte Z411EntCon ;
   private byte Z414EntEti ;
   private byte Z14035EntNEmb ;
   private byte Z856ValCod ;
   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte A14035EntNEmb ;
   private byte A411EntCon ;
   private byte A414EntEti ;
   private byte A856ValCod ;
   private byte Gx_BScreen ;
   private byte AV23Mes ;
   private byte A800PrvPri ;
   private byte AV26MesAnt ;
   private byte A3915EmpNumDec ;
   private byte A12580PedAlmc ;
   private byte Z3915EmpNumDec ;
   private byte Z800PrvPri ;
   private byte Z12580PedAlmc ;
   private byte gxajaxcallmode ;
   private byte i411EntCon ;
   private byte GXt_int5 ;
   private byte GXv_int20[] ;
   private byte GXv_int6[] ;
   private byte GXv_int21[] ;
   private byte ZV23Mes ;
   private byte ZV26MesAnt ;
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
   private short AV22Year ;
   private short AV25AnyAnt ;
   private short AV40Consumos ;
   private short AV39NoUpd ;
   private short AV29DiasFin ;
   private short A664PedNumLin ;
   private short AV19Nalbaran20 ;
   private short AV16FlagPre ;
   private short AV41FlagFecCcs ;
   private short RcdFound42 ;
   private short AV44moda21 ;
   private short Z847UltLinEnt ;
   private short nIsDirty_42 ;
   private short i847UltLinEnt ;
   private short GXv_int18[] ;
   private short GXv_int15[] ;
   private short GXv_int19[] ;
   private short ZV22Year ;
   private short ZV25AnyAnt ;
   private short ZV29DiasFin ;
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
   private int trnEnded ;
   private int edtLinEnt_Enabled ;
   private int edtEntFecEnt_Enabled ;
   private int edtAlbaran_Enabled ;
   private int edtEntNAlbar_Visible ;
   private int edtEntNAlbar_Enabled ;
   private int edtPedCod_Enabled ;
   private int imgavPromptpedido_Visible ;
   private int imgavPromptpedido_Enabled ;
   private int edtEntPrvNum_Enabled ;
   private int imgprompt_6156_Visible ;
   private int edtEntNEmb_Visible ;
   private int edtEntNEmb_Enabled ;
   private int edtEntUniEnt_Enabled ;
   private int edtEntPre_Enabled ;
   private int edtEntUniRem_Enabled ;
   private int edtEntLotN_Enabled ;
   private int edtEntFVal_Enabled ;
   private int edtPedCanEnt_Enabled ;
   private int edtPedUni_Enabled ;
   private int edtPrdCanPen_Enabled ;
   private int bttBtntrn_enter_Visible ;
   private int bttBtntrn_enter_Enabled ;
   private int bttBtntrn_cancel_Visible ;
   private int bttBtntrn_delete_Visible ;
   private int bttBtntrn_delete_Enabled ;
   private int edtavPgmname_Enabled ;
   private int edtEntPedCum_Visible ;
   private int edtEntPedCum_Enabled ;
   private int edtEntCump_Visible ;
   private int edtEntCump_Enabled ;
   private int A413EntConIni ;
   private int A412EntConFin ;
   private int A12716EntFabId ;
   private int A795PrvNum ;
   private int AV13Insert_PedCod ;
   private int GXt_int7 ;
   private int AV48GXV1 ;
   private int GX_JID ;
   private int i6156EntPrvNum ;
   private int idxLst ;
   private int GXv_int8[] ;
   private int GXv_int25[] ;
   private int GXv_int30[] ;
   private int Gx_cnt ;
   private int E658PedCod ;
   private long Z13235EntLoteID ;
   private long A13235EntLoteID ;
   private java.math.BigDecimal Z419EntUniRem ;
   private java.math.BigDecimal Z417EntPre ;
   private java.math.BigDecimal Z418EntUniEnt ;
   private java.math.BigDecimal Z10782EntUniAlb ;
   private java.math.BigDecimal Z726PrdPreMed ;
   private java.math.BigDecimal Z725PrdPreAnt ;
   private java.math.BigDecimal Z724PrdPreAct ;
   private java.math.BigDecimal Z684PrdCanPen ;
   private java.math.BigDecimal Z729PrdRotRea ;
   private java.math.BigDecimal Z5255PrdPreAc2 ;
   private java.math.BigDecimal Z705PrdExiCC ;
   private java.math.BigDecimal Z665PedPre ;
   private java.math.BigDecimal Z669PedUni ;
   private java.math.BigDecimal Z660PedDto ;
   private java.math.BigDecimal O419EntUniRem ;
   private java.math.BigDecimal O418EntUniEnt ;
   private java.math.BigDecimal O724PrdPreAct ;
   private java.math.BigDecimal O750PrdValStk ;
   private java.math.BigDecimal O657PedCanEnt ;
   private java.math.BigDecimal O417EntPre ;
   private java.math.BigDecimal O704PrdExiAlm ;
   private java.math.BigDecimal N418EntUniEnt ;
   private java.math.BigDecimal N417EntPre ;
   private java.math.BigDecimal A417EntPre ;
   private java.math.BigDecimal A418EntUniEnt ;
   private java.math.BigDecimal A665PedPre ;
   private java.math.BigDecimal A660PedDto ;
   private java.math.BigDecimal A419EntUniRem ;
   private java.math.BigDecimal A657PedCanEnt ;
   private java.math.BigDecimal A669PedUni ;
   private java.math.BigDecimal A684PrdCanPen ;
   private java.math.BigDecimal A10782EntUniAlb ;
   private java.math.BigDecimal A726PrdPreMed ;
   private java.math.BigDecimal A725PrdPreAnt ;
   private java.math.BigDecimal A724PrdPreAct ;
   private java.math.BigDecimal A729PrdRotRea ;
   private java.math.BigDecimal A5255PrdPreAc2 ;
   private java.math.BigDecimal A705PrdExiCC ;
   private java.math.BigDecimal A704PrdExiAlm ;
   private java.math.BigDecimal AV30OldEntPre ;
   private java.math.BigDecimal AV31OldExiAlm ;
   private java.math.BigDecimal AV32OldEntUni ;
   private java.math.BigDecimal AV33OldRemanente ;
   private java.math.BigDecimal AV21UniOld ;
   private java.math.BigDecimal AV27PrecAnt ;
   private java.math.BigDecimal A750PrdValStk ;
   private java.math.BigDecimal A913StockRem ;
   private java.math.BigDecimal Z704PrdExiAlm ;
   private java.math.BigDecimal Z750PrdValStk ;
   private java.math.BigDecimal Z913StockRem ;
   private java.math.BigDecimal Z657PedCanEnt ;
   private java.math.BigDecimal GXv_decimal17[] ;
   private java.math.BigDecimal GXv_decimal16[] ;
   private java.math.BigDecimal GXv_decimal13[] ;
   private java.math.BigDecimal GXv_decimal22[] ;
   private java.math.BigDecimal ZO657PedCanEnt ;
   private java.math.BigDecimal GXt_decimal12 ;
   private java.math.BigDecimal GXv_decimal29[] ;
   private java.math.BigDecimal ZV31OldExiAlm ;
   private java.math.BigDecimal ZV32OldEntUni ;
   private java.math.BigDecimal ZV21UniOld ;
   private java.math.BigDecimal ZV30OldEntPre ;
   private java.math.BigDecimal ZV27PrecAnt ;
   private java.math.BigDecimal ZV33OldRemanente ;
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
   private String O3404EntPedCum ;
   private String O5686EntLotN ;
   private String N3404EntPedCum ;
   private String N11Albaran ;
   private String N12857EntNAlbar ;
   private String N5686EntLotN ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A719PrdNum ;
   private String Gx_mode ;
   private String AV24PedPri ;
   private String A718PrdNom ;
   private String AV46Pgmname ;
   private String AV36Usurcod ;
   private String AV37Station ;
   private String AV7EmprCod ;
   private String AV8PrdNum ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtLinEnt_Internalname ;
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
   private String divUnnamedtable3_Internalname ;
   private String TempTags ;
   private String edtLinEnt_Jsonclick ;
   private String edtEntFecEnt_Internalname ;
   private String edtEntFecEnt_Jsonclick ;
   private String edtAlbaran_Internalname ;
   private String A11Albaran ;
   private String edtAlbaran_Jsonclick ;
   private String divEntnalbar_cell_Internalname ;
   private String divEntnalbar_cell_Class ;
   private String edtEntNAlbar_Internalname ;
   private String A12857EntNAlbar ;
   private String edtEntNAlbar_Jsonclick ;
   private String divTablesplittedpedcod_Internalname ;
   private String lblTextblockpedcod_Internalname ;
   private String lblTextblockpedcod_Jsonclick ;
   private String sStyleString ;
   private String tblTablemergedpedcod_Internalname ;
   private String edtPedCod_Internalname ;
   private String edtPedCod_Jsonclick ;
   private String imgavPromptpedido_Internalname ;
   private String imgavPromptpedido_gximage ;
   private String sImgUrl ;
   private String imgavPromptpedido_Link ;
   private String edtEntPrvNum_Internalname ;
   private String edtEntPrvNum_Jsonclick ;
   private String imgprompt_6156_gximage ;
   private String imgprompt_6156_Internalname ;
   private String imgprompt_6156_Link ;
   private String divUnnamedtable4_Internalname ;
   private String divEntnemb_cell_Internalname ;
   private String divEntnemb_cell_Class ;
   private String edtEntNEmb_Internalname ;
   private String edtEntNEmb_Jsonclick ;
   private String edtEntUniEnt_Internalname ;
   private String edtEntUniEnt_Jsonclick ;
   private String edtEntPre_Internalname ;
   private String edtEntPre_Jsonclick ;
   private String edtEntUniRem_Internalname ;
   private String edtEntUniRem_Jsonclick ;
   private String edtEntLotN_Internalname ;
   private String A5686EntLotN ;
   private String edtEntLotN_Jsonclick ;
   private String edtEntFVal_Internalname ;
   private String edtEntFVal_Jsonclick ;
   private String divDvpanel_unnamedtable1_cell_Internalname ;
   private String divDvpanel_unnamedtable1_cell_Class ;
   private String Dvpanel_unnamedtable1_Width ;
   private String Dvpanel_unnamedtable1_Cls ;
   private String Dvpanel_unnamedtable1_Title ;
   private String Dvpanel_unnamedtable1_Iconposition ;
   private String Dvpanel_unnamedtable1_Internalname ;
   private String divUnnamedtable1_Internalname ;
   private String divUnnamedtable2_Internalname ;
   private String edtPedCanEnt_Internalname ;
   private String edtPedCanEnt_Jsonclick ;
   private String edtPedUni_Internalname ;
   private String edtPedUni_Jsonclick ;
   private String edtPrdCanPen_Internalname ;
   private String edtPrdCanPen_Jsonclick ;
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
   private String edtEntCump_Internalname ;
   private String A14041EntCump ;
   private String edtEntCump_Jsonclick ;
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
   private String AV35oldlote ;
   private String AV18PrdNomX ;
   private String A407EmprNom ;
   private String A667PedSit ;
   private String A794PrvNom ;
   private String Dvpanel_tableattributes_Objectcall ;
   private String Dvpanel_tableattributes_Class ;
   private String Dvpanel_tableattributes_Height ;
   private String Dvpanel_unnamedtable1_Objectcall ;
   private String Dvpanel_unnamedtable1_Class ;
   private String Dvpanel_unnamedtable1_Height ;
   private String hsh ;
   private String sMode42 ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String AV38EmprNom ;
   private String Z407EmprNom ;
   private String Z794PrvNom ;
   private String Z667PedSit ;
   private String Z666PedPri ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String i10184EntRemTpo ;
   private String GXv_char26[] ;
   private String GXv_char24[] ;
   private String GXv_char14[] ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String GXv_char28[] ;
   private String GXv_char27[] ;
   private String ZV24PedPri ;
   private String GXt_char1 ;
   private String GXv_char32[] ;
   private String GXv_char31[] ;
   private String ZV18PrdNomX ;
   private String Z14041EntCump ;
   private String ZV35oldlote ;
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
   private java.util.Date AV34oldEntFecent ;
   private java.util.Date AV20FecAnt ;
   private java.util.Date AV28Fecha ;
   private java.util.Date Gx_date ;
   private java.util.Date A661PedFec ;
   private java.util.Date Z661PedFec ;
   private java.util.Date i415EntFecEnt ;
   private java.util.Date GXt_date10 ;
   private java.util.Date GXv_date11[] ;
   private java.util.Date GXv_date23[] ;
   private java.util.Date ZV28Fecha ;
   private java.util.Date ZV34oldEntFecent ;
   private java.util.Date ZV20FecAnt ;
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
   private boolean AV42promptPedido_IsBlob ;
   private boolean Dvpanel_unnamedtable1_Autowidth ;
   private boolean Dvpanel_unnamedtable1_Autoheight ;
   private boolean Dvpanel_unnamedtable1_Collapsible ;
   private boolean Dvpanel_unnamedtable1_Collapsed ;
   private boolean Dvpanel_unnamedtable1_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable1_Autoscroll ;
   private boolean n800PrvPri ;
   private boolean n407EmprNom ;
   private boolean n3915EmpNumDec ;
   private boolean n794PrvNom ;
   private boolean n913StockRem ;
   private boolean Dvpanel_tableattributes_Enabled ;
   private boolean Dvpanel_tableattributes_Showheader ;
   private boolean Dvpanel_tableattributes_Visible ;
   private boolean Dvpanel_unnamedtable1_Enabled ;
   private boolean Dvpanel_unnamedtable1_Showheader ;
   private boolean Dvpanel_unnamedtable1_Visible ;
   private boolean returnInSub ;
   private boolean Gx_longc ;
   private boolean Gx_first ;
   private boolean nA658PedCod ;
   private String AV17Inc_obs ;
   private String AV49Promptpedido_GXI ;
   private String AV15msg_ctrl_fecha ;
   private String ZV15msg_ctrl_fecha ;
   private String AV42promptPedido ;
   private com.genexus.webpanels.WebSession AV12WebSession ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableattributes ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable1 ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private IDataStoreProvider pr_default ;
   private String[] T01T64_A407EmprNom ;
   private boolean[] T01T64_n407EmprNom ;
   private byte[] T01T64_A3915EmpNumDec ;
   private boolean[] T01T64_n3915EmpNumDec ;
   private short[] T01T66_A847UltLinEnt ;
   private java.math.BigDecimal[] T01T66_A704PrdExiAlm ;
   private java.math.BigDecimal[] T01T66_A726PrdPreMed ;
   private java.math.BigDecimal[] T01T66_A750PrdValStk ;
   private java.util.Date[] T01T66_A713PrdFulEnt ;
   private java.util.Date[] T01T66_A709PrdFecPre ;
   private java.math.BigDecimal[] T01T66_A725PrdPreAnt ;
   private java.math.BigDecimal[] T01T66_A724PrdPreAct ;
   private java.math.BigDecimal[] T01T66_A684PrdCanPen ;
   private String[] T01T66_A718PrdNom ;
   private String[] T01T66_A698PrdDetPar ;
   private java.math.BigDecimal[] T01T66_A729PrdRotRea ;
   private String[] T01T66_A727PrdRec ;
   private java.math.BigDecimal[] T01T66_A5255PrdPreAc2 ;
   private java.math.BigDecimal[] T01T66_A705PrdExiCC ;
   private int[] T01T66_A795PrvNum ;
   private byte[] T01T66_A856ValCod ;
   private String[] T01T610_A794PrvNom ;
   private boolean[] T01T610_n794PrvNom ;
   private byte[] T01T610_A800PrvPri ;
   private boolean[] T01T610_n800PrvPri ;
   private java.math.BigDecimal[] T01T612_A913StockRem ;
   private boolean[] T01T612_n913StockRem ;
   private java.util.Date[] T01T67_A661PedFec ;
   private String[] T01T67_A667PedSit ;
   private String[] T01T67_A666PedPri ;
   private byte[] T01T67_A12580PedAlmc ;
   private java.math.BigDecimal[] T01T69_A657PedCanEnt ;
   private java.util.Date[] T01T69_A663PedFulEnt ;
   private java.math.BigDecimal[] T01T69_A665PedPre ;
   private java.math.BigDecimal[] T01T69_A669PedUni ;
   private String[] T01T69_A659PedCum ;
   private java.math.BigDecimal[] T01T69_A660PedDto ;
   private short[] T01T614_A597LinEnt ;
   private short[] T01T614_A847UltLinEnt ;
   private java.math.BigDecimal[] T01T614_A704PrdExiAlm ;
   private byte[] T01T614_A411EntCon ;
   private java.math.BigDecimal[] T01T614_A657PedCanEnt ;
   private java.util.Date[] T01T614_A663PedFulEnt ;
   private java.math.BigDecimal[] T01T614_A726PrdPreMed ;
   private java.math.BigDecimal[] T01T614_A750PrdValStk ;
   private java.util.Date[] T01T614_A713PrdFulEnt ;
   private java.util.Date[] T01T614_A709PrdFecPre ;
   private java.math.BigDecimal[] T01T614_A725PrdPreAnt ;
   private java.math.BigDecimal[] T01T614_A724PrdPreAct ;
   private java.math.BigDecimal[] T01T614_A684PrdCanPen ;
   private java.math.BigDecimal[] T01T614_A419EntUniRem ;
   private java.math.BigDecimal[] T01T614_A417EntPre ;
   private String[] T01T614_A3404EntPedCum ;
   private String[] T01T614_A718PrdNom ;
   private String[] T01T614_A794PrvNom ;
   private boolean[] T01T614_n794PrvNom ;
   private String[] T01T614_A698PrdDetPar ;
   private java.math.BigDecimal[] T01T614_A729PrdRotRea ;
   private String[] T01T614_A727PrdRec ;
   private String[] T01T614_A407EmprNom ;
   private boolean[] T01T614_n407EmprNom ;
   private byte[] T01T614_A800PrvPri ;
   private boolean[] T01T614_n800PrvPri ;
   private byte[] T01T614_A3915EmpNumDec ;
   private boolean[] T01T614_n3915EmpNumDec ;
   private java.math.BigDecimal[] T01T614_A5255PrdPreAc2 ;
   private java.math.BigDecimal[] T01T614_A705PrdExiCC ;
   private java.util.Date[] T01T614_A415EntFecEnt ;
   private String[] T01T614_A11Albaran ;
   private String[] T01T614_A12857EntNAlbar ;
   private int[] T01T614_A6156EntPrvNum ;
   private boolean[] T01T614_n6156EntPrvNum ;
   private java.util.Date[] T01T614_A661PedFec ;
   private java.math.BigDecimal[] T01T614_A418EntUniEnt ;
   private java.math.BigDecimal[] T01T614_A665PedPre ;
   private java.math.BigDecimal[] T01T614_A669PedUni ;
   private short[] T01T614_A416EntNumCon ;
   private String[] T01T614_A5686EntLotN ;
   private java.util.Date[] T01T614_A5685EntFVal ;
   private byte[] T01T614_A414EntEti ;
   private int[] T01T614_A413EntConIni ;
   private int[] T01T614_A412EntConFin ;
   private String[] T01T614_A659PedCum ;
   private String[] T01T614_A667PedSit ;
   private String[] T01T614_A666PedPri ;
   private java.math.BigDecimal[] T01T614_A660PedDto ;
   private String[] T01T614_A5691EntBnc ;
   private String[] T01T614_A7695EntCC ;
   private short[] T01T614_A7696EntCCoCod ;
   private java.math.BigDecimal[] T01T614_A10782EntUniAlb ;
   private String[] T01T614_A10783EntObs ;
   private String[] T01T614_A10187EntRemNro ;
   private java.util.Date[] T01T614_A10186EntRemFch ;
   private String[] T01T614_A10185EntRemSuc ;
   private String[] T01T614_A10184EntRemTpo ;
   private byte[] T01T614_A12580PedAlmc ;
   private int[] T01T614_A12716EntFabId ;
   private long[] T01T614_A13235EntLoteID ;
   private String[] T01T614_A13456EntUbicaci ;
   private java.util.Date[] T01T614_A5690EntHfCon ;
   private java.util.Date[] T01T614_A5689EntFfCon ;
   private java.util.Date[] T01T614_A5688EntHiCon ;
   private java.util.Date[] T01T614_A5687EntFiCon ;
   private byte[] T01T614_A14035EntNEmb ;
   private String[] T01T614_A396EmprCod ;
   private String[] T01T614_A719PrdNum ;
   private int[] T01T614_A658PedCod ;
   private boolean[] T01T614_n658PedCod ;
   private int[] T01T614_A795PrvNum ;
   private byte[] T01T614_A856ValCod ;
   private java.math.BigDecimal[] T01T614_A913StockRem ;
   private boolean[] T01T614_n913StockRem ;
   private java.util.Date[] T01T615_A661PedFec ;
   private String[] T01T615_A667PedSit ;
   private String[] T01T615_A666PedPri ;
   private byte[] T01T615_A12580PedAlmc ;
   private String[] T01T616_A396EmprCod ;
   private String[] T01T616_A719PrdNum ;
   private short[] T01T616_A597LinEnt ;
   private short[] T01T63_A597LinEnt ;
   private byte[] T01T63_A411EntCon ;
   private java.math.BigDecimal[] T01T63_A419EntUniRem ;
   private java.math.BigDecimal[] T01T63_A417EntPre ;
   private String[] T01T63_A3404EntPedCum ;
   private java.util.Date[] T01T63_A415EntFecEnt ;
   private String[] T01T63_A11Albaran ;
   private String[] T01T63_A12857EntNAlbar ;
   private int[] T01T63_A6156EntPrvNum ;
   private boolean[] T01T63_n6156EntPrvNum ;
   private java.math.BigDecimal[] T01T63_A418EntUniEnt ;
   private short[] T01T63_A416EntNumCon ;
   private String[] T01T63_A5686EntLotN ;
   private java.util.Date[] T01T63_A5685EntFVal ;
   private byte[] T01T63_A414EntEti ;
   private int[] T01T63_A413EntConIni ;
   private int[] T01T63_A412EntConFin ;
   private String[] T01T63_A5691EntBnc ;
   private String[] T01T63_A7695EntCC ;
   private short[] T01T63_A7696EntCCoCod ;
   private java.math.BigDecimal[] T01T63_A10782EntUniAlb ;
   private String[] T01T63_A10783EntObs ;
   private String[] T01T63_A10187EntRemNro ;
   private java.util.Date[] T01T63_A10186EntRemFch ;
   private String[] T01T63_A10185EntRemSuc ;
   private String[] T01T63_A10184EntRemTpo ;
   private int[] T01T63_A12716EntFabId ;
   private long[] T01T63_A13235EntLoteID ;
   private String[] T01T63_A13456EntUbicaci ;
   private java.util.Date[] T01T63_A5690EntHfCon ;
   private java.util.Date[] T01T63_A5689EntFfCon ;
   private java.util.Date[] T01T63_A5688EntHiCon ;
   private java.util.Date[] T01T63_A5687EntFiCon ;
   private byte[] T01T63_A14035EntNEmb ;
   private String[] T01T63_A396EmprCod ;
   private String[] T01T63_A719PrdNum ;
   private int[] T01T63_A658PedCod ;
   private boolean[] T01T63_n658PedCod ;
   private String[] T01T617_A396EmprCod ;
   private String[] T01T617_A719PrdNum ;
   private short[] T01T617_A597LinEnt ;
   private byte[] T01T617_A411EntCon ;
   private String[] T01T618_A396EmprCod ;
   private String[] T01T618_A719PrdNum ;
   private short[] T01T618_A597LinEnt ;
   private byte[] T01T618_A411EntCon ;
   private short[] T01T62_A597LinEnt ;
   private byte[] T01T62_A411EntCon ;
   private java.math.BigDecimal[] T01T62_A419EntUniRem ;
   private java.math.BigDecimal[] T01T62_A417EntPre ;
   private String[] T01T62_A3404EntPedCum ;
   private java.util.Date[] T01T62_A415EntFecEnt ;
   private String[] T01T62_A11Albaran ;
   private String[] T01T62_A12857EntNAlbar ;
   private int[] T01T62_A6156EntPrvNum ;
   private boolean[] T01T62_n6156EntPrvNum ;
   private java.math.BigDecimal[] T01T62_A418EntUniEnt ;
   private short[] T01T62_A416EntNumCon ;
   private String[] T01T62_A5686EntLotN ;
   private java.util.Date[] T01T62_A5685EntFVal ;
   private byte[] T01T62_A414EntEti ;
   private int[] T01T62_A413EntConIni ;
   private int[] T01T62_A412EntConFin ;
   private String[] T01T62_A5691EntBnc ;
   private String[] T01T62_A7695EntCC ;
   private short[] T01T62_A7696EntCCoCod ;
   private java.math.BigDecimal[] T01T62_A10782EntUniAlb ;
   private String[] T01T62_A10783EntObs ;
   private String[] T01T62_A10187EntRemNro ;
   private java.util.Date[] T01T62_A10186EntRemFch ;
   private String[] T01T62_A10185EntRemSuc ;
   private String[] T01T62_A10184EntRemTpo ;
   private int[] T01T62_A12716EntFabId ;
   private long[] T01T62_A13235EntLoteID ;
   private String[] T01T62_A13456EntUbicaci ;
   private java.util.Date[] T01T62_A5690EntHfCon ;
   private java.util.Date[] T01T62_A5689EntFfCon ;
   private java.util.Date[] T01T62_A5688EntHiCon ;
   private java.util.Date[] T01T62_A5687EntFiCon ;
   private byte[] T01T62_A14035EntNEmb ;
   private String[] T01T62_A396EmprCod ;
   private String[] T01T62_A719PrdNum ;
   private int[] T01T62_A658PedCod ;
   private boolean[] T01T62_n658PedCod ;
   private short[] T01T619_A847UltLinEnt ;
   private java.math.BigDecimal[] T01T619_A704PrdExiAlm ;
   private java.math.BigDecimal[] T01T619_A726PrdPreMed ;
   private java.math.BigDecimal[] T01T619_A750PrdValStk ;
   private java.util.Date[] T01T619_A713PrdFulEnt ;
   private java.util.Date[] T01T619_A709PrdFecPre ;
   private java.math.BigDecimal[] T01T619_A725PrdPreAnt ;
   private java.math.BigDecimal[] T01T619_A724PrdPreAct ;
   private java.math.BigDecimal[] T01T619_A684PrdCanPen ;
   private String[] T01T619_A718PrdNom ;
   private String[] T01T619_A698PrdDetPar ;
   private java.math.BigDecimal[] T01T619_A729PrdRotRea ;
   private String[] T01T619_A727PrdRec ;
   private java.math.BigDecimal[] T01T619_A5255PrdPreAc2 ;
   private java.math.BigDecimal[] T01T619_A705PrdExiCC ;
   private int[] T01T619_A795PrvNum ;
   private byte[] T01T619_A856ValCod ;
   private java.math.BigDecimal[] T01T620_A657PedCanEnt ;
   private java.util.Date[] T01T620_A663PedFulEnt ;
   private java.math.BigDecimal[] T01T620_A665PedPre ;
   private java.math.BigDecimal[] T01T620_A669PedUni ;
   private String[] T01T620_A659PedCum ;
   private java.math.BigDecimal[] T01T620_A660PedDto ;
   private java.util.Date[] T01T624_A661PedFec ;
   private String[] T01T624_A667PedSit ;
   private String[] T01T624_A666PedPri ;
   private byte[] T01T624_A12580PedAlmc ;
   private java.math.BigDecimal[] T01T625_A657PedCanEnt ;
   private java.util.Date[] T01T625_A663PedFulEnt ;
   private java.math.BigDecimal[] T01T625_A665PedPre ;
   private java.math.BigDecimal[] T01T625_A669PedUni ;
   private String[] T01T625_A659PedCum ;
   private java.math.BigDecimal[] T01T625_A660PedDto ;
   private String[] T01T628_A396EmprCod ;
   private String[] T01T628_A719PrdNum ;
   private short[] T01T628_A597LinEnt ;
   private String[] T01T629_A396EmprCod ;
   private int[] T01T629_A658PedCod ;
   private boolean[] T01T629_n658PedCod ;
   private String[] T01T629_A719PrdNum ;
   private String[] T01T629_A659PedCum ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private short[] T01T65_A847UltLinEnt ;
   private java.math.BigDecimal[] T01T65_A704PrdExiAlm ;
   private java.math.BigDecimal[] T01T65_A726PrdPreMed ;
   private java.math.BigDecimal[] T01T65_A750PrdValStk ;
   private java.util.Date[] T01T65_A713PrdFulEnt ;
   private java.util.Date[] T01T65_A709PrdFecPre ;
   private java.math.BigDecimal[] T01T65_A725PrdPreAnt ;
   private java.math.BigDecimal[] T01T65_A724PrdPreAct ;
   private java.math.BigDecimal[] T01T65_A684PrdCanPen ;
   private String[] T01T65_A718PrdNom ;
   private String[] T01T65_A698PrdDetPar ;
   private java.math.BigDecimal[] T01T65_A729PrdRotRea ;
   private String[] T01T65_A727PrdRec ;
   private java.math.BigDecimal[] T01T65_A5255PrdPreAc2 ;
   private java.math.BigDecimal[] T01T65_A705PrdExiCC ;
   private int[] T01T65_A795PrvNum ;
   private byte[] T01T65_A856ValCod ;
   private java.math.BigDecimal[] T01T68_A657PedCanEnt ;
   private java.util.Date[] T01T68_A663PedFulEnt ;
   private java.math.BigDecimal[] T01T68_A665PedPre ;
   private java.math.BigDecimal[] T01T68_A669PedUni ;
   private String[] T01T68_A659PedCum ;
   private java.math.BigDecimal[] T01T68_A660PedDto ;
   private com.genexus.webpanels.GXWebForm Form ;
   private app.wwpbaseobjects.SdtWWPContext AV10WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext9[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV11TrnContext ;
   private app.wwpbaseobjects.SdtWWPTransactionContext_Attribute AV14TrnContextAtt ;
}

final  class entradaproductoalmacen_trn__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class entradaproductoalmacen_trn__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class entradaproductoalmacen_trn__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class entradaproductoalmacen_trn__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class entradaproductoalmacen_trn__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01T62", "SELECT LinEnt, EntCon, EntUniRem, EntPre, EntPedCum, EntFecEnt, Albaran, EntNAlbar, EntPrvNum, EntUniEnt, EntNumCon, EntLotN, EntFVal, EntEti, EntConIni, EntConFin, EntBnc, EntCC, EntCCoCod, EntUniAlb, EntObs, EntRemNro, EntRemFch, EntRemSuc, EntRemTpo, EntFabId, EntLoteID, EntUbicaci, EntHfCon, EntFfCon, EntHiCon, EntFiCon, EntNEmb, EmprCod, PrdNum, PedCod FROM TXPENTALM WHERE EmprCod = ? AND PrdNum = ? AND LinEnt = ?  FOR UPDATE OF EntCon, EntUniRem, EntPre, EntPedCum, EntFecEnt, Albaran, EntNAlbar, EntPrvNum, EntUniEnt, EntNumCon, EntLotN, EntFVal, EntEti, EntConIni, EntConFin, EntBnc, EntCC, EntCCoCod, EntUniAlb, EntObs, EntRemNro, EntRemFch, EntRemSuc, EntRemTpo, EntFabId, EntLoteID, EntUbicaci, EntHfCon, EntFfCon, EntHiCon, EntFiCon, EntNEmb, PedCod NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01T63", "SELECT LinEnt, EntCon, EntUniRem, EntPre, EntPedCum, EntFecEnt, Albaran, EntNAlbar, EntPrvNum, EntUniEnt, EntNumCon, EntLotN, EntFVal, EntEti, EntConIni, EntConFin, EntBnc, EntCC, EntCCoCod, EntUniAlb, EntObs, EntRemNro, EntRemFch, EntRemSuc, EntRemTpo, EntFabId, EntLoteID, EntUbicaci, EntHfCon, EntFfCon, EntHiCon, EntFiCon, EntNEmb, EmprCod, PrdNum, PedCod FROM TXPENTALM WHERE EmprCod = ? AND PrdNum = ? AND LinEnt = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01T64", "SELECT EmprNom, EmpNumDec FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01T65", "SELECT UltLinEnt, PrdExiAlm, PrdPreMed, PrdValStk, PrdFulEnt, PrdFecPre, PrdPreAnt, PrdPreAct, PrdCanPen, PrdNom, PrdDetPar, PrdRotRea, PrdRec, PrdPreAc2, PrdExiCC, PrvNum, ValCod FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ?  FOR UPDATE OF UltLinEnt, PrdExiAlm, PrdPreMed, PrdValStk, PrdFulEnt, PrdFecPre, PrdPreAnt, PrdPreAct, PrdCanPen NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01T66", "SELECT UltLinEnt, PrdExiAlm, PrdPreMed, PrdValStk, PrdFulEnt, PrdFecPre, PrdPreAnt, PrdPreAct, PrdCanPen, PrdNom, PrdDetPar, PrdRotRea, PrdRec, PrdPreAc2, PrdExiCC, PrvNum, ValCod FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01T67", "SELECT PedFec, PedSit, PedPri, PedAlmc FROM TXPCPEDID WHERE EmprCod = ? AND PedCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01T68", "SELECT PedCanEnt, PedFulEnt, PedPre, PedUni, PedCum, PedDto FROM TXPLPEDID WHERE EmprCod = ? AND PedCod = ? AND PrdNum = ?  FOR UPDATE OF PedCanEnt, PedFulEnt NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01T69", "SELECT PedCanEnt, PedFulEnt, PedPre, PedUni, PedCum, PedDto FROM TXPLPEDID WHERE EmprCod = ? AND PedCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01T610", "SELECT PrvNom, PrvPri FROM TXPPRVGEN WHERE EmprCod = ? AND PrvNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01T612", "SELECT COALESCE( T1.StockRem, 0) AS StockRem FROM (SELECT SUM(EntUniRem) AS StockRem, EmprCod, PrdNum FROM TXPENTALM GROUP BY EmprCod, PrdNum ) T1 WHERE T1.EmprCod = ? AND T1.PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01T614", "SELECT /*+ FIRST_ROWS(100) */ TM1.LinEnt, T3.UltLinEnt, T3.PrdExiAlm, TM1.EntCon, T7.PedCanEnt, T7.PedFulEnt, T3.PrdPreMed, T3.PrdValStk, T3.PrdFulEnt, T3.PrdFecPre, T3.PrdPreAnt, T3.PrdPreAct, T3.PrdCanPen, TM1.EntUniRem, TM1.EntPre, TM1.EntPedCum, T3.PrdNom, T4.PrvNom, T3.PrdDetPar, T3.PrdRotRea, T3.PrdRec, T2.EmprNom, T4.PrvPri, T2.EmpNumDec, T3.PrdPreAc2, T3.PrdExiCC, TM1.EntFecEnt, TM1.Albaran, TM1.EntNAlbar, TM1.EntPrvNum, T6.PedFec, TM1.EntUniEnt, T7.PedPre, T7.PedUni, TM1.EntNumCon, TM1.EntLotN, TM1.EntFVal, TM1.EntEti, TM1.EntConIni, TM1.EntConFin, T7.PedCum, T6.PedSit, T6.PedPri, T7.PedDto, TM1.EntBnc, TM1.EntCC, TM1.EntCCoCod, TM1.EntUniAlb, TM1.EntObs, TM1.EntRemNro, TM1.EntRemFch, TM1.EntRemSuc, TM1.EntRemTpo, T6.PedAlmc, TM1.EntFabId, TM1.EntLoteID, TM1.EntUbicaci, TM1.EntHfCon, TM1.EntFfCon, TM1.EntHiCon, TM1.EntFiCon, TM1.EntNEmb, TM1.EmprCod, TM1.PrdNum, TM1.PedCod, T3.PrvNum, T3.ValCod, COALESCE( T5.StockRem, 0) AS StockRem FROM ((((((TXPENTALM TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) INNER JOIN TXPPRODUC T3 ON T3.EmprCod = TM1.EmprCod AND T3.PrdNum = TM1.PrdNum) LEFT JOIN TXPPRVGEN T4 ON T4.EmprCod = TM1.EmprCod AND T4.PrvNum = T3.PrvNum) LEFT JOIN (SELECT SUM(TM1.EntUniRem) AS StockRem, TM1.EmprCod, TM1.PrdNum FROM TXPENTALM TM1 GROUP BY TM1.EmprCod, TM1.PrdNum ) T5 ON T5.EmprCod = TM1.EmprCod AND T5.PrdNum = TM1.PrdNum) LEFT JOIN TXPCPEDID T6 ON T6.EmprCod = TM1.EmprCod AND T6.PedCod = TM1.PedCod) LEFT JOIN TXPLPEDID T7 ON T7.EmprCod = TM1.EmprCod AND T7.PedCod = TM1.PedCod AND T7.PrdNum = TM1.PrdNum) WHERE TM1.EmprCod = ? and TM1.PrdNum = ? and TM1.LinEnt = ? and TM1.EntCon = 0 ORDER BY TM1.EmprCod, TM1.PrdNum, TM1.LinEnt ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01T615", "SELECT PedFec, PedSit, PedPri, PedAlmc FROM TXPCPEDID WHERE EmprCod = ? AND PedCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01T616", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, PrdNum, LinEnt FROM TXPENTALM WHERE EmprCod = ? AND PrdNum = ? AND LinEnt = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01T617", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, PrdNum, LinEnt, EntCon FROM TXPENTALM WHERE ( EmprCod > ? or EmprCod = ? and PrdNum > ? or PrdNum = ? and EmprCod = ? and LinEnt > ?) and EntCon = 0 ORDER BY EmprCod, PrdNum, LinEnt) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01T618", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, PrdNum, LinEnt, EntCon FROM TXPENTALM WHERE ( EmprCod < ? or EmprCod = ? and PrdNum < ? or PrdNum = ? and EmprCod = ? and LinEnt < ?) and EntCon = 0 ORDER BY EmprCod DESC, PrdNum DESC, LinEnt DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01T619", "SELECT UltLinEnt, PrdExiAlm, PrdPreMed, PrdValStk, PrdFulEnt, PrdFecPre, PrdPreAnt, PrdPreAct, PrdCanPen, PrdNom, PrdDetPar, PrdRotRea, PrdRec, PrdPreAc2, PrdExiCC, PrvNum, ValCod FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ?  FOR UPDATE OF UltLinEnt, PrdExiAlm, PrdPreMed, PrdValStk, PrdFulEnt, PrdFecPre, PrdPreAnt, PrdPreAct, PrdCanPen NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01T620", "SELECT PedCanEnt, PedFulEnt, PedPre, PedUni, PedCum, PedDto FROM TXPLPEDID WHERE EmprCod = ? AND PedCod = ? AND PrdNum = ?  FOR UPDATE OF PedCanEnt, PedFulEnt NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01T621", "INSERT INTO TXPENTALM(LinEnt, EntCon, EntUniRem, EntPre, EntPedCum, EntFecEnt, Albaran, EntNAlbar, EntPrvNum, EntUniEnt, EntNumCon, EntLotN, EntFVal, EntEti, EntConIni, EntConFin, EntBnc, EntCC, EntCCoCod, EntUniAlb, EntObs, EntRemNro, EntRemFch, EntRemSuc, EntRemTpo, EntFabId, EntLoteID, EntUbicaci, EntHfCon, EntFfCon, EntHiCon, EntFiCon, EntNEmb, EmprCod, PrdNum, PedCod, EntNro) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0)", GX_NOMASK, "TXPENTALM")
         ,new UpdateCursor("T01T622", "UPDATE TXPENTALM SET EntCon=?, EntUniRem=?, EntPre=?, EntPedCum=?, EntFecEnt=?, Albaran=?, EntNAlbar=?, EntPrvNum=?, EntUniEnt=?, EntNumCon=?, EntLotN=?, EntFVal=?, EntEti=?, EntConIni=?, EntConFin=?, EntBnc=?, EntCC=?, EntCCoCod=?, EntUniAlb=?, EntObs=?, EntRemNro=?, EntRemFch=?, EntRemSuc=?, EntRemTpo=?, EntFabId=?, EntLoteID=?, EntUbicaci=?, EntHfCon=?, EntFfCon=?, EntHiCon=?, EntFiCon=?, EntNEmb=?, PedCod=?  WHERE EmprCod = ? AND PrdNum = ? AND LinEnt = ?", GX_NOMASK, "TXPENTALM")
         ,new UpdateCursor("T01T623", "DELETE FROM TXPENTALM  WHERE EmprCod = ? AND PrdNum = ? AND LinEnt = ?", GX_NOMASK, "TXPENTALM")
         ,new ForEachCursor("T01T624", "SELECT PedFec, PedSit, PedPri, PedAlmc FROM TXPCPEDID WHERE EmprCod = ? AND PedCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01T625", "SELECT PedCanEnt, PedFulEnt, PedPre, PedUni, PedCum, PedDto FROM TXPLPEDID WHERE EmprCod = ? AND PedCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01T626", "UPDATE TXPPRODUC SET UltLinEnt=?, PrdExiAlm=?, PrdPreMed=?, PrdValStk=?, PrdFulEnt=?, PrdFecPre=?, PrdPreAnt=?, PrdPreAct=?, PrdCanPen=?  WHERE EmprCod = ? AND PrdNum = ?", GX_NOMASK, "TXPPRODUC")
         ,new UpdateCursor("T01T627", "UPDATE TXPLPEDID SET PedCanEnt=?, PedFulEnt=?  WHERE EmprCod = ? AND PedCod = ? AND PrdNum = ?", GX_NOMASK, "TXPLPEDID")
         ,new ForEachCursor("T01T628", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, PrdNum, LinEnt FROM TXPENTALM WHERE EntCon = 0 ORDER BY EmprCod, PrdNum, LinEnt ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01T629", "SELECT EmprCod, PedCod, PrdNum, PedCum FROM TXPLPEDID WHERE EmprCod = ? AND PedCod = ? ORDER BY EmprCod, PedCod, PrdNum ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
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
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,4);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,5);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
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
               ((byte[]) buf[33])[0] = rslt.getByte(33);
               ((String[]) buf[34])[0] = rslt.getString(34, 3);
               ((String[]) buf[35])[0] = rslt.getString(35, 6);
               ((int[]) buf[36])[0] = rslt.getInt(36);
               ((boolean[]) buf[37])[0] = rslt.wasNull();
               return;
            case 1 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,4);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,5);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
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
               ((byte[]) buf[33])[0] = rslt.getByte(33);
               ((String[]) buf[34])[0] = rslt.getString(34, 3);
               ((String[]) buf[35])[0] = rslt.getString(35, 6);
               ((int[]) buf[36])[0] = rslt.getInt(36);
               ((boolean[]) buf[37])[0] = rslt.wasNull();
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
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(5);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(6);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,5);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,5);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,4);
               ((String[]) buf[9])[0] = rslt.getString(10, 26);
               ((String[]) buf[10])[0] = rslt.getString(11, 1);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(12,5);
               ((String[]) buf[12])[0] = rslt.getString(13, 1);
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
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(5);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(6);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,5);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,5);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,4);
               ((String[]) buf[9])[0] = rslt.getString(10, 26);
               ((String[]) buf[10])[0] = rslt.getString(11, 1);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(12,5);
               ((String[]) buf[12])[0] = rslt.getString(13, 1);
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
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,5);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               return;
            case 7 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,5);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
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
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(6);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,5);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDate(9);
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDate(10);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(11,5);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(12,5);
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(13,4);
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(14,4);
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(15,5);
               ((String[]) buf[15])[0] = rslt.getString(16, 1);
               ((String[]) buf[16])[0] = rslt.getString(17, 26);
               ((String[]) buf[17])[0] = rslt.getString(18, 30);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(19, 1);
               ((java.math.BigDecimal[]) buf[20])[0] = rslt.getBigDecimal(20,5);
               ((String[]) buf[21])[0] = rslt.getString(21, 1);
               ((String[]) buf[22])[0] = rslt.getString(22, 30);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((byte[]) buf[24])[0] = rslt.getByte(23);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((byte[]) buf[26])[0] = rslt.getByte(24);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[28])[0] = rslt.getBigDecimal(25,5);
               ((java.math.BigDecimal[]) buf[29])[0] = rslt.getBigDecimal(26,4);
               ((java.util.Date[]) buf[30])[0] = rslt.getGXDate(27);
               ((String[]) buf[31])[0] = rslt.getString(28, 10);
               ((String[]) buf[32])[0] = rslt.getString(29, 20);
               ((int[]) buf[33])[0] = rslt.getInt(30);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[35])[0] = rslt.getGXDate(31);
               ((java.math.BigDecimal[]) buf[36])[0] = rslt.getBigDecimal(32,2);
               ((java.math.BigDecimal[]) buf[37])[0] = rslt.getBigDecimal(33,5);
               ((java.math.BigDecimal[]) buf[38])[0] = rslt.getBigDecimal(34,2);
               ((short[]) buf[39])[0] = rslt.getShort(35);
               ((String[]) buf[40])[0] = rslt.getString(36, 26);
               ((java.util.Date[]) buf[41])[0] = rslt.getGXDate(37);
               ((byte[]) buf[42])[0] = rslt.getByte(38);
               ((int[]) buf[43])[0] = rslt.getInt(39);
               ((int[]) buf[44])[0] = rslt.getInt(40);
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
               ((byte[]) buf[66])[0] = rslt.getByte(62);
               ((String[]) buf[67])[0] = rslt.getString(63, 3);
               ((String[]) buf[68])[0] = rslt.getString(64, 6);
               ((int[]) buf[69])[0] = rslt.getInt(65);
               ((boolean[]) buf[70])[0] = rslt.wasNull();
               ((int[]) buf[71])[0] = rslt.getInt(66);
               ((byte[]) buf[72])[0] = rslt.getByte(67);
               ((java.math.BigDecimal[]) buf[73])[0] = rslt.getBigDecimal(68,4);
               ((boolean[]) buf[74])[0] = rslt.wasNull();
               return;
            case 11 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDate(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 15 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,4);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,5);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(5);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(6);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,5);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,5);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,4);
               ((String[]) buf[9])[0] = rslt.getString(10, 26);
               ((String[]) buf[10])[0] = rslt.getString(11, 1);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(12,5);
               ((String[]) buf[12])[0] = rslt.getString(13, 1);
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(14,5);
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(15,4);
               ((int[]) buf[15])[0] = rslt.getInt(16);
               ((byte[]) buf[16])[0] = rslt.getByte(17);
               return;
            case 16 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,5);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               return;
            case 20 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDate(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 21 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,5);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 25 :
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
               stmt.setString(2, (String)parms[1], 6);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setString(3, (String)parms[2], 6);
               stmt.setString(4, (String)parms[3], 6);
               stmt.setString(5, (String)parms[4], 3);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setString(3, (String)parms[2], 6);
               stmt.setString(4, (String)parms[3], 6);
               stmt.setString(5, (String)parms[4], 3);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 16 :
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
            case 17 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[2], 4);
               stmt.setBigDecimal(4, (java.math.BigDecimal)parms[3], 5);
               stmt.setString(5, (String)parms[4], 1);
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
               stmt.setByte(33, ((Number) parms[33]).byteValue());
               stmt.setString(34, (String)parms[34], 3);
               stmt.setString(35, (String)parms[35], 6);
               if ( ((Boolean) parms[36]).booleanValue() )
               {
                  stmt.setNull( 36 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(36, ((Number) parms[37]).intValue());
               }
               return;
            case 18 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 4);
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[2], 5);
               stmt.setString(4, (String)parms[3], 1);
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
               stmt.setString(35, (String)parms[36], 6);
               stmt.setShort(36, ((Number) parms[37]).shortValue());
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 20 :
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
            case 21 :
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
            case 22 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 4);
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[2], 5);
               stmt.setBigDecimal(4, (java.math.BigDecimal)parms[3], 2);
               stmt.setDate(5, (java.util.Date)parms[4]);
               stmt.setDate(6, (java.util.Date)parms[5]);
               stmt.setBigDecimal(7, (java.math.BigDecimal)parms[6], 5);
               stmt.setBigDecimal(8, (java.math.BigDecimal)parms[7], 5);
               stmt.setBigDecimal(9, (java.math.BigDecimal)parms[8], 4);
               stmt.setString(10, (String)parms[9], 3);
               stmt.setString(11, (String)parms[10], 6);
               return;
            case 23 :
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
               stmt.setString(5, (String)parms[5], 6);
               return;
            case 25 :
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

